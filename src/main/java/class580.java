import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class580 {

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Z")
    private static boolean field8208 = false;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8205 = new Hashtable(16);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    private static int field8206;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Ljava/lang/String;")
    private static String field8204;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Ljava/lang/String;")
    private static String field8207;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILjava/lang/String;)V", line = 7)
    public static void method3341(int arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            return;
        }
        field8206 = arg0;
        field8207 = arg2;
        try {
            field8204 = System.getProperty("user.home");
            if (field8204 != null) {
                field8204 = field8204 + "/";
            }
        } catch (Exception var3) {
        }
        if (field8204 == null) {
            field8204 = "~/";
        }
        field8208 = true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 40)
    public static File method3342(String arg0, int arg1) {
        if (arg1 != 16) {
            method3342(null, 59);
        }
        return method3343(field8207, arg1 ^ 0xFFFFFFD6, arg0, field8206);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 50)
    public static File method3343(String arg0, int arg1, String arg2, int arg3) {
        if (!field8208) {
            throw new RuntimeException("");
        }
        File var4 = (File) field8205.get(arg2);
        int var5 = 110 % ((arg1 - 51) / 63);
        if (var4 != null) {
            return var4;
        }
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field8204, "/tmp/", "" };
        String[] var7 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    String var11 = var6[var10] + var7[var9] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var6[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var6[var10] + var7[var9])).mkdir();
                                if (arg0 != null) {
                                    (new File(var6[var10] + var7[var9] + "/" + arg0)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field8205.put(arg2, var13);
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
