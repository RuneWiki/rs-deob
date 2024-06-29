import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class392 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Z")
    private static boolean field5478 = false;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5477 = new Hashtable(16);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    private static int field5480;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Ljava/lang/String;")
    private static String field5476;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Ljava/lang/String;")
    private static String field5479;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 9)
    public static void method2340(String arg0, int arg1, byte arg2) {
        field5479 = arg0;
        field5480 = arg1;
        try {
            if (arg2 != -31) {
                method2341(null, -29);
            }
            field5476 = System.getProperty("user.home");
            if (field5476 != null) {
                field5476 = field5476 + "/";
            }
        } catch (Exception var3) {
        }
        if (field5476 == null) {
            field5476 = "~/";
        }
        field5478 = true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 32)
    public static File method2341(String arg0, int arg1) {
        if (arg1 != -2) {
            field5480 = -13;
        }
        return method2342(field5479, true, arg0, field5480);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)Ljava/io/File;", line = 42)
    public static File method2342(String arg0, boolean arg1, String arg2, int arg3) {
        if (!field5478) {
            throw new RuntimeException("");
        }
        File var4 = (File) field5477.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5476, "/tmp/", "" };
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
                                field5477.put(arg2, var12);
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
        if (!arg1) {
            field5478 = false;
        }
        throw new RuntimeException();
    }
}
