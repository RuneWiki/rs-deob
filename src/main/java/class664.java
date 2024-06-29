import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class664 {

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "Z")
    private static boolean field9347 = false;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field9351 = new Hashtable(16);

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    private static int field9348;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "Ljava/lang/String;")
    private static String field9349;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "Ljava/lang/String;")
    private static String field9350;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
    public static File method3744(String arg0, int arg1, String arg2, int arg3) {
        if (!field9347) {
            throw new RuntimeException("");
        }
        File var4 = (File) field9351.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field9350, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
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
                                field9351.put(arg2, var12);
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
        if (arg1 <= 49) {
            method3744(null, -115, null, -58);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3745(String arg0, int arg1) {
        if (arg1 != 0) {
            method3746(-46, 116, null);
        }
        return method3744(field9349, 79, arg0, field9348);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static void method3746(int arg0, int arg1, String arg2) {
        field9349 = arg2;
        field9348 = arg0;
        try {
            if (arg1 != 1) {
                return;
            }
            field9350 = System.getProperty("user.home");
            if (field9350 != null) {
                field9350 = field9350 + "/";
            }
        } catch (Exception var3) {
        }
        field9347 = true;
        if (field9350 == null) {
            field9350 = "~/";
        }
    }
}
