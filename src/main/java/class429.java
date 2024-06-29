import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class429 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    private static boolean field5917 = false;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5915 = new Hashtable(16);

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private static int field5918;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Ljava/lang/String;")
    private static String field5914;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Ljava/lang/String;")
    private static String field5916;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 3)
    public static void method2474(int arg0, String arg1, int arg2) {
        field5916 = arg1;
        field5918 = arg0;
        try {
            field5914 = System.getProperty("user.home");
            if (field5914 != null) {
                field5914 = field5914 + "/";
            }
        } catch (Exception var3) {
        }
        if (field5914 == null) {
            field5914 = "~/";
        }
        field5917 = true;
        if (arg2 != 16) {
            method2475(-99, (byte) -2, null, null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 29)
    public static File method2475(int arg0, byte arg1, String arg2, String arg3) {
        if (!field5917) {
            throw new RuntimeException("");
        }
        File var4 = (File) field5915.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5914, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        int var7 = 22 % ((-arg1 - 87) / 35);
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    String var11 = var5[var10] + var6[var9] + "/" + (arg2 == null ? "" : arg2 + "/") + arg3;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var5[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var5[var10] + var6[var9])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var10] + var6[var9] + "/" + arg2)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field5915.put(arg3, var13);
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

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 122)
    public static File method2476(int arg0, String arg1) {
        if (arg0 != -3251) {
            field5915 = null;
        }
        return method2475(field5918, (byte) -128, field5916, arg1);
    }
}
