import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class180 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Z")
    private static boolean field2224 = false;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2228 = new Hashtable(16);

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    private static int field2226;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Ljava/lang/String;")
    private static String field2225;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Ljava/lang/String;")
    private static String field2227;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static void method1200(String arg0, int arg1, byte arg2) {
        field2227 = arg0;
        field2226 = arg1;
        try {
            field2225 = System.getProperty("user.home");
            if (field2225 != null) {
                field2225 = field2225 + "/";
            }
        } catch (Exception var3) {
        }
        if (arg2 <= -28) {
            field2224 = true;
            if (field2225 == null) {
                field2225 = "~/";
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
    public static File method1201(byte arg0, String arg1) {
        return arg0 == -87 ? method1202(1755, field2226, arg1, field2227) : null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static File method1202(int arg0, int arg1, String arg2, String arg3) {
        if (!field2224) {
            throw new RuntimeException("");
        }
        if (arg0 != 1755) {
            field2225 = null;
        }
        File var4 = (File) field2228.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2225, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
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
                                field2228.put(arg2, var12);
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
