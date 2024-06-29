import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class443 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    private static boolean field5604 = false;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5605 = new Hashtable(16);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    private static int field5603;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/lang/String;")
    private static String field5606;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Ljava/lang/String;")
    private static String field5607;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)Ljava/io/File;", line = 6)
    public static File method2371(String arg0, String arg1, byte arg2, int arg3) {
        if (!field5604) {
            throw new RuntimeException("");
        }
        File var4 = (File) field5605.get(arg0);
        if (arg2 < 31) {
            field5607 = null;
        }
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5606, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg1 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg1)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field5605.put(arg0, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 99)
    public static File method2372(String arg0, byte arg1) {
        if (arg1 != -106) {
            method2371(null, null, (byte) -2, 22);
        }
        return method2371(arg0, field5607, (byte) 102, field5603);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILjava/lang/String;)V", line = 115)
    public static void method2373(int arg0, int arg1, String arg2) {
        field5603 = arg0;
        field5607 = arg2;
        try {
            field5606 = System.getProperty("user.home");
            if (field5606 != null) {
                field5606 = field5606 + "/";
            }
        } catch (Exception var3) {
        }
        field5604 = true;
        if (arg1 != 0) {
            field5606 = null;
        }
        if (field5606 == null) {
            field5606 = "~/";
        }
    }
}
