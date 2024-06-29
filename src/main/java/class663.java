import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class663 {

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Z")
    private static boolean field9431 = false;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field9429 = new Hashtable(16);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private static int field9428;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Ljava/lang/String;")
    private static String field9430;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Ljava/lang/String;")
    private static String field9432;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 3)
    public static File method3725(String arg0, int arg1) {
        if (arg1 != 0) {
            method3727(106, null, -16, null);
        }
        return method3727(-42, arg0, field9428, field9432);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 16)
    public static void method3726(int arg0, String arg1, int arg2) {
        field9428 = arg0;
        field9432 = arg1;
        try {
            field9430 = System.getProperty("user.home");
            if (arg2 != 28119) {
                field9428 = -94;
            }
            if (field9430 != null) {
                field9430 = field9430 + "/";
            }
        } catch (Exception var3) {
        }
        if (field9430 == null) {
            field9430 = "~/";
        }
        field9431 = true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;", line = 44)
    public static File method3727(int arg0, String arg1, int arg2, String arg3) {
        if (!field9431) {
            throw new RuntimeException("");
        }
        File var4 = (File) field9429.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field9430, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        int var7 = -5 % ((46 - arg0) / 62);
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    String var11 = var5[var10] + var6[var9] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var5[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var5[var10] + var6[var9])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var10] + var6[var9] + "/" + arg3)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field9429.put(arg1, var13);
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
}
