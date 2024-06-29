import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class587 {

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Z")
    private static boolean field8297 = false;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8294 = new Hashtable(16);

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    private static int field8298;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Ljava/lang/String;")
    private static String field8295;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Ljava/lang/String;")
    private static String field8296;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static void method3372(int arg0, String arg1, int arg2) {
        field8296 = arg1;
        field8298 = arg0;
        try {
            field8295 = System.getProperty("user.home");
            if (arg2 != 0) {
                return;
            }
            if (field8295 != null) {
                field8295 = field8295 + "/";
            }
        } catch (Exception var3) {
        }
        field8297 = true;
        if (field8295 == null) {
            field8295 = "~/";
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static File method3373(int arg0, int arg1, String arg2, String arg3) {
        if (!field8297) {
            throw new RuntimeException("");
        }
        if (arg1 != 17771) {
            field8294 = null;
        }
        File var4 = (File) field8294.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field8295, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field8294.put(arg2, var12);
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

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public static File method3374(int arg0, String arg1) {
        return arg0 < 76 ? null : method3373(field8298, 17771, arg1, field8296);
    }
}
