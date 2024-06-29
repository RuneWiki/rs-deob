import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class655 {

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Z")
    private static boolean field9132 = false;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field9133 = new Hashtable(16);

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    private static int field9136;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "Ljava/lang/String;")
    private static String field9134;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "Ljava/lang/String;")
    private static String field9135;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 8)
    public static File method3747(String arg0, int arg1) {
        return arg1 == 0 ? method3749(field9135, -44, arg0, field9136) : null;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 19)
    public static void method3748(String arg0, int arg1, int arg2) {
        field9136 = arg2;
        field9135 = arg0;
        try {
            if (arg1 != 31795) {
                method3748(null, -57, 34);
            }
            field9134 = System.getProperty("user.home");
            if (field9134 != null) {
                field9134 = field9134 + "/";
            }
        } catch (Exception var3) {
        }
        if (field9134 == null) {
            field9134 = "~/";
        }
        field9132 = true;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 43)
    public static File method3749(String arg0, int arg1, String arg2, int arg3) {
        if (!field9132) {
            throw new RuntimeException("");
        }
        int var4 = 6 % ((36 - arg1) / 50);
        File var5 = (File) field9133.get(arg2);
        if (var5 != null) {
            return var5;
        }
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field9134, "/tmp/", "" };
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
                                field9133.put(arg2, var13);
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
