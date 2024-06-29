import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class315 {

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Z")
    private static boolean field4367 = false;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4365 = new Hashtable(16);

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    private static int field4366;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4363;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/lang/String;")
    private static String field4364;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 13)
    public static File method1903(String arg0, int arg1, String arg2, int arg3) {
        if (!field4367) {
            throw new RuntimeException("");
        }
        File var4 = (File) field4365.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4364, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        int var7 = 43 % ((arg1 + 68) / 42);
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    String var11 = var5[var10] + var6[var9] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var5[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var5[var10] + var6[var9])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var10] + var6[var9] + "/" + arg2)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field4365.put(arg0, var13);
                                return var13;
                            }
                        }
                    } catch (Exception var18) {
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
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 105)
    public static File method1904(int arg0, String arg1) {
        if (arg0 < 100) {
            field4366 = -56;
        }
        return method1903(arg1, -111, field4363, field4366);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 115)
    public static void method1905(String arg0, byte arg1, int arg2) {
        field4363 = arg0;
        field4366 = arg2;
        try {
            field4364 = System.getProperty("user.home");
            if (arg1 >= -62) {
                method1903(null, -118, null, -84);
            }
            if (field4364 != null) {
                field4364 = field4364 + "/";
            }
        } catch (Exception var3) {
        }
        field4367 = true;
        if (field4364 == null) {
            field4364 = "~/";
        }
    }
}
