import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class395 {

    @OriginalMember(owner = "client!br", name = "d", descriptor = "Z")
    private static boolean field5794 = false;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5792 = new Hashtable(16);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    private static int field5791;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Ljava/lang/String;")
    private static String field5793;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Ljava/lang/String;")
    private static String field5795;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static File method2477(int arg0, int arg1, String arg2, String arg3) {
        if (!field5794) {
            throw new RuntimeException("");
        }
        File var4 = (File) field5792.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5793, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var7 = arg0; var7 < 2; var7++) {
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
                                field5792.put(arg2, var12);
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

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static void method2478(byte arg0, String arg1, int arg2) {
        field5791 = arg2;
        if (arg0 != -121) {
            field5794 = false;
        }
        field5795 = arg1;
        try {
            field5793 = System.getProperty("user.home");
            if (field5793 != null) {
                field5793 = field5793 + "/";
            }
        } catch (Exception var3) {
        }
        field5794 = true;
        if (field5793 == null) {
            field5793 = "~/";
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public static File method2479(int arg0, String arg1) {
        if (arg0 != -2) {
            method2479(75, null);
        }
        return method2477(0, field5791, arg1, field5795);
    }
}
