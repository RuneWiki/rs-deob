import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class167 {

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "Z")
    private static boolean field2206 = false;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2204 = new Hashtable(16);

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    private static int field2205;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "Ljava/lang/String;")
    private static String field2207;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "Ljava/lang/String;")
    private static String field2208;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 3)
    public static File method1140(int arg0, String arg1) {
        int var2 = 20 % ((-arg0 - 56) / 44);
        return method1142(field2207, 0, field2205, arg1);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 14)
    public static void method1141(String arg0, int arg1, int arg2) {
        field2205 = arg2;
        field2207 = arg0;
        try {
            if (arg1 != 0) {
                field2204 = null;
            }
            field2208 = System.getProperty("user.home");
            if (field2208 != null) {
                field2208 = field2208 + "/";
            }
        } catch (Exception var3) {
        }
        if (field2208 == null) {
            field2208 = "~/";
        }
        field2206 = true;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;", line = 42)
    public static File method1142(String arg0, int arg1, int arg2, String arg3) {
        if (!field2206) {
            throw new RuntimeException("");
        }
        File var4 = (File) field2204.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2208, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = arg1; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg3;
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
                                field2204.put(arg3, var12);
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
