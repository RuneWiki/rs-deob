import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class195 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
    private static boolean field2257 = false;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2260 = new Hashtable(16);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private static int field2258;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljava/lang/String;")
    private static String field2256;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Ljava/lang/String;")
    private static String field2259;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 5)
    public static File method1184(int arg0, String arg1) {
        if (arg0 != 22591) {
            method1185(-67, -18, null);
        }
        return method1186(arg1, field2258, field2256, arg0 ^ 0x583E);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/String;)V", line = 18)
    public static void method1185(int arg0, int arg1, String arg2) {
        field2256 = arg2;
        field2258 = arg0;
        try {
            field2259 = System.getProperty("user.home");
            if (arg1 <= 118) {
                method1186(null, 107, null, -68);
            }
            if (field2259 != null) {
                field2259 = field2259 + "/";
            }
        } catch (Exception var3) {
        }
        field2257 = true;
        if (field2259 == null) {
            field2259 = "~/";
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 47)
    public static File method1186(String arg0, int arg1, String arg2, int arg3) {
        if (!field2257) {
            throw new RuntimeException("");
        }
        File var4 = (File) field2260.get(arg0);
        if (var4 != null) {
            return var4;
        }
        if (arg3 != 1) {
            method1185(-78, 123, null);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2259, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field2260.put(arg0, var12);
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
