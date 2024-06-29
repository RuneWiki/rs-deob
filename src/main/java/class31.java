import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class31 {

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "Z")
    private static boolean field402 = false;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field405 = new Hashtable(16);

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    private static int field403;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Ljava/lang/String;")
    private static String field404;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "Ljava/lang/String;")
    private static String field406;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 4)
    public static void method206(String arg0, int arg1, int arg2) {
        field406 = arg0;
        field403 = arg1;
        try {
            field404 = System.getProperty("user.home");
            if (field404 != null) {
                field404 = field404 + "/";
            }
        } catch (Exception var3) {
        }
        if (arg2 == 0) {
            field402 = true;
            if (field404 == null) {
                field404 = "~/";
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 39)
    public static File method207(int arg0, String arg1) {
        if (arg0 != 16) {
            field406 = null;
        }
        return method208(field406, field403, -119, arg1);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;", line = 49)
    public static File method208(String arg0, int arg1, int arg2, String arg3) {
        if (!field402) {
            throw new RuntimeException("");
        }
        File var4 = (File) field405.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field404, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        if (arg2 >= -106) {
            field405 = null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg3;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg0 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field405.put(arg3, var12);
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
