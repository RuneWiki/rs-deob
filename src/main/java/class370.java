import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class370 {

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
    private static boolean field5671 = false;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5669 = new Hashtable(16);

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    private static int field5673;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Ljava/lang/String;")
    private static String field5670;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "Ljava/lang/String;")
    private static String field5672;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", line = 5)
    public static File method2385(String arg0, String arg1, int arg2, int arg3) {
        if (!field5671) {
            throw new RuntimeException("ClientDiskCache not inited!");
        }
        File var4 = (File) field5669.get(arg0);
        if (var4 != null) {
            return var4;
        }
        int var5 = -91 % ((arg3 - 50) / 60);
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5670, "/tmp/", "" };
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    String var11 = var6[var10] + var7[var9] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var6[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var6[var10] + var7[var9])).mkdir();
                                if (arg1 != null) {
                                    (new File(var6[var10] + var7[var9] + "/" + arg1)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field5669.put(arg0, var13);
                                return var13;
                            }
                        }
                    } catch (Exception var18) {
                        System.out.println("Unable to open/write: " + var11);
                        try {
                            if (var12 != null) {
                                var12.close();
                                Object var16 = null;
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException("Fatal - could not find ANY location for file: " + arg0);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 99)
    public static File method2386(String arg0, int arg1) {
        int var2 = 60 % ((7 - arg1) / 42);
        return method2385(arg0, field5672, field5673, -75);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILjava/lang/String;)V", line = 108)
    public static void method2387(int arg0, int arg1, String arg2) {
        field5672 = arg2;
        field5673 = arg0;
        try {
            if (arg1 != -11175) {
                method2387(37, 124, null);
            }
            field5670 = System.getProperty("user.home");
            if (field5670 != null) {
                field5670 = field5670 + "/";
            }
        } catch (Exception var3) {
        }
        if (field5670 == null) {
            field5670 = "~/";
        }
        field5671 = true;
    }
}
