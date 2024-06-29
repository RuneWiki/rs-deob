import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class583 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Z")
    private static boolean field8029 = false;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8027 = new Hashtable(16);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    private static int field8031;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/lang/String;")
    private static String field8028;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/lang/String;")
    private static String field8030;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public static File method3268(int arg0, String arg1) {
        if (arg0 != -3) {
            field8031 = -100;
        }
        return method3270(field8030, (byte) 75, arg1, field8031);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static void method3269(byte arg0, int arg1, String arg2) {
        field8030 = arg2;
        if (arg0 != -5) {
            method3268(43, null);
        }
        field8031 = arg1;
        try {
            field8028 = System.getProperty("user.home");
            if (field8028 != null) {
                field8028 = field8028 + "/";
            }
        } catch (Exception var3) {
        }
        if (field8028 == null) {
            field8028 = "~/";
        }
        field8029 = true;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
    public static File method3270(String arg0, byte arg1, String arg2, int arg3) {
        if (!field8029) {
            throw new RuntimeException("");
        }
        File var4 = (File) field8027.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field8028, "/tmp/", "" };
        if (arg1 != 75) {
            method3270(null, (byte) -105, null, -85);
        }
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
                                field8027.put(arg2, var12);
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
