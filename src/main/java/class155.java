import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class155 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
    private static boolean field2240 = false;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2243 = new Hashtable(16);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    private static int field2239;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2241;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Ljava/lang/String;")
    private static String field2242;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 4)
    public static File method1113(String arg0, int arg1, String arg2, int arg3) {
        if (!field2240) {
            throw new RuntimeException("");
        }
        File var4 = (File) field2243.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2242, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = arg1; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field2243.put(arg0, var12);
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

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 96)
    public static File method1114(String arg0, int arg1) {
        if (arg1 > -114) {
            field2239 = -94;
        }
        return method1113(arg0, 0, field2241, field2239);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILjava/lang/String;)V", line = 107)
    public static void method1115(int arg0, int arg1, String arg2) {
        field2239 = arg1;
        field2241 = arg2;
        try {
            field2242 = System.getProperty("user.home");
            if (field2242 != null) {
                field2242 = field2242 + "/";
            }
        } catch (Exception var3) {
        }
        if (field2242 == null) {
            field2242 = "~/";
        }
        field2240 = true;
        if (arg0 != 0) {
            field2240 = true;
        }
    }
}
