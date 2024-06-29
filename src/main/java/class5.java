import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Z")
    private static boolean field59 = false;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field56 = new Hashtable(16);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    private static int field58;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/lang/String;")
    private static String field55;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/lang/String;")
    private static String field57;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;", line = 3)
    public static File method32(String arg0, String arg1, int arg2, byte arg3) {
        if (!field59) {
            throw new RuntimeException("");
        }
        File var4 = (File) field56.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field55, "/tmp/", "" };
        int var6 = -26 % ((-arg3 - 20) / 62);
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    String var11 = var5[var10] + var7[var9] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var5[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var5[var10] + var7[var9])).mkdir();
                                if (arg1 != null) {
                                    (new File(var5[var10] + var7[var9] + "/" + arg1)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field56.put(arg0, var13);
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 97)
    public static File method33(String arg0, int arg1) {
        return arg1 == 7375 ? method32(arg0, field57, field58, (byte) -97) : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 109)
    public static void method34(String arg0, int arg1, byte arg2) {
        field57 = arg0;
        field58 = arg1;
        try {
            field55 = System.getProperty("user.home");
            if (field55 != null) {
                field55 = field55 + "/";
            }
        } catch (Exception var3) {
        }
        if (field55 == null) {
            field55 = "~/";
        }
        if (arg2 != -14) {
            field55 = null;
        }
        field59 = true;
    }
}
