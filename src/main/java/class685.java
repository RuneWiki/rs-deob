import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class685 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
    private static boolean field9374 = false;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field9375 = new Hashtable(16);

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    private static int field9378;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Ljava/lang/String;")
    private static String field9376;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Ljava/lang/String;")
    private static String field9377;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method3833(String arg0, String arg1, int arg2, byte arg3) {
        if (!field9374) {
            throw new RuntimeException("");
        }
        File var4 = (File) field9375.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field9377, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
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
                                field9375.put(arg0, var12);
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
        if (arg3 <= 46) {
            method3835(null, 90);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static void method3834(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field9378 = arg1;
        field9376 = arg0;
        try {
            field9377 = System.getProperty("user.home");
            if (field9377 != null) {
                field9377 = field9377 + "/";
            }
        } catch (Exception var3) {
        }
        field9374 = true;
        if (field9377 == null) {
            field9377 = "~/";
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public static File method3835(String arg0, int arg1) {
        if (arg1 != -1) {
            method3835(null, -85);
        }
        return method3833(arg0, field9376, field9378, (byte) 114);
    }
}
