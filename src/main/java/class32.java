import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class32 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Z")
    private static boolean field391 = false;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field395 = new Hashtable(16);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    private static int field392;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "Ljava/lang/String;")
    private static String field393;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Ljava/lang/String;")
    private static String field394;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public static File method264(int arg0, String arg1) {
        if (arg0 != 26007) {
            field392 = 0;
        }
        return method265(0, field393, field392, arg1);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
    public static File method265(int arg0, String arg1, int arg2, String arg3) {
        if (!field391) {
            throw new RuntimeException("");
        }
        File var4 = (File) field395.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field394, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = arg0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg3;
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
                                field395.put(arg3, var12);
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

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static void method266(byte arg0, String arg1, int arg2) {
        field392 = arg2;
        field393 = arg1;
        try {
            field394 = System.getProperty("user.home");
            if (arg0 < 3) {
                method266((byte) -111, null, 113);
            }
            if (field394 != null) {
                field394 = field394 + "/";
            }
        } catch (Exception var3) {
        }
        if (field394 == null) {
            field394 = "~/";
        }
        field391 = true;
    }
}
