import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class510 {

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "Z")
    private static boolean field6988 = false;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6984 = new Hashtable(16);

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    private static int field6985;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Ljava/lang/String;")
    private static String field6986;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Ljava/lang/String;")
    private static String field6987;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 7)
    public static void method2835(int arg0, String arg1, byte arg2) {
        int var3 = -73 % ((29 - arg2) / 50);
        field6986 = arg1;
        field6985 = arg0;
        try {
            field6987 = System.getProperty("user.home");
            if (field6987 != null) {
                field6987 = field6987 + "/";
            }
        } catch (Exception var4) {
        }
        field6988 = true;
        if (field6987 == null) {
            field6987 = "~/";
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)Ljava/io/File;", line = 32)
    public static File method2836(String arg0, int arg1, String arg2, boolean arg3) {
        if (!field6988) {
            throw new RuntimeException("");
        }
        if (!arg3) {
            field6987 = null;
        }
        File var4 = (File) field6984.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6987, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
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
                                field6984.put(arg2, var12);
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

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 123)
    public static File method2837(String arg0, int arg1) {
        if (arg1 < 85) {
            method2836(null, -18, null, false);
        }
        return method2836(field6986, field6985, arg0, true);
    }
}
