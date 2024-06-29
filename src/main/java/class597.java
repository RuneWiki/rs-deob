import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class597 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
    private static boolean field8317 = false;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8316 = new Hashtable(16);

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    private static int field8318;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/lang/String;")
    private static String field8315;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Ljava/lang/String;")
    private static String field8319;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static File method3303(int arg0, int arg1, String arg2, String arg3) {
        if (!field8317) {
            throw new RuntimeException("");
        }
        File var4 = (File) field8316.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field8315, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = arg1; var7 < 2; var7++) {
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
                                field8316.put(arg2, var12);
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

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3304(String arg0, int arg1) {
        int var2 = 33 % ((-arg1 - 71) / 52);
        return method3303(field8318, 0, arg0, field8319);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static void method3305(boolean arg0, int arg1, String arg2) {
        field8318 = arg1;
        field8319 = arg2;
        try {
            if (arg0) {
                return;
            }
            field8315 = System.getProperty("user.home");
            if (field8315 != null) {
                field8315 = field8315 + "/";
            }
        } catch (Exception var3) {
        }
        field8317 = true;
        if (field8315 == null) {
            field8315 = "~/";
        }
    }
}
