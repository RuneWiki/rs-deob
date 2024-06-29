import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class567 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
    private static boolean field8267 = false;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8268 = new Hashtable(16);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private static int field8264;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/lang/String;")
    private static String field8265;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
    private static String field8266;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static void method3277(String arg0, int arg1, int arg2) {
        field8264 = arg1;
        field8266 = arg0;
        if (arg2 != 1) {
            return;
        }
        try {
            field8265 = System.getProperty("user.home");
            if (field8265 != null) {
                field8265 = field8265 + "/";
            }
        } catch (Exception var3) {
        }
        field8267 = true;
        if (field8265 == null) {
            field8265 = "~/";
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
    public static File method3278(boolean arg0, String arg1) {
        return arg0 ? null : method3279(arg1, field8266, field8264, 2177);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method3279(String arg0, String arg1, int arg2, int arg3) {
        if (!field8267) {
            throw new RuntimeException("");
        }
        File var4 = (File) field8268.get(arg0);
        if (arg3 != 2177) {
            return null;
        } else if (var4 == null) {
            String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field8265, "/tmp/", "" };
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
                                    field8268.put(arg0, var12);
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
        } else {
            return var4;
        }
    }
}
