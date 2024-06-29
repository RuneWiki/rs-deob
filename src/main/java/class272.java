import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class272 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Z")
    private static boolean field3932 = false;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field3933 = new Hashtable(16);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private static int field3931;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Ljava/lang/String;")
    private static String field3934;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/lang/String;")
    private static String field3935;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 3)
    public static void method1770(String arg0, int arg1, int arg2) {
        field3931 = arg1;
        field3935 = arg0;
        try {
            field3934 = System.getProperty("user.home");
            if (arg2 != 0) {
                field3934 = null;
            }
            if (field3934 != null) {
                field3934 = field3934 + "/";
            }
        } catch (Exception var3) {
        }
        if (field3934 == null) {
            field3934 = "~/";
        }
        field3932 = true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;", line = 27)
    public static File method1771(boolean arg0, String arg1, int arg2, String arg3) {
        if (!field3932) {
            throw new RuntimeException("");
        }
        File var4 = (File) field3933.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3934, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        if (!arg0) {
            return null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
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
                                field3933.put(arg1, var12);
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

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 122)
    public static File method1772(int arg0, String arg1) {
        if (arg0 != -16819) {
            method1771(false, null, -27, null);
        }
        return method1771(true, arg1, field3931, field3935);
    }
}
