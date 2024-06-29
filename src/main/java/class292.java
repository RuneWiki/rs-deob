import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class292 {

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "Z")
    private static boolean field3950 = false;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field3947 = new Hashtable(16);

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    private static int field3948;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "Ljava/lang/String;")
    private static String field3949;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Ljava/lang/String;")
    private static String field3951;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 3)
    public static void method1734(boolean arg0, int arg1, String arg2) {
        field3951 = arg2;
        field3948 = arg1;
        try {
            field3949 = System.getProperty("user.home");
            if (field3949 != null) {
                field3949 = field3949 + "/";
            }
        } catch (Exception var3) {
        }
        field3950 = arg0;
        if (field3949 == null) {
            field3949 = "~/";
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 29)
    public static File method1735(String arg0, int arg1) {
        return arg1 == 31025 ? method1736(arg1 - 31025, field3951, arg0, field3948) : null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 39)
    public static File method1736(int arg0, String arg1, String arg2, int arg3) {
        if (!field3950) {
            throw new RuntimeException("");
        }
        File var4 = (File) field3947.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3949, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = arg0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
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
                                field3947.put(arg2, var12);
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
}
