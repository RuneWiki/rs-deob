import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class598 {

    @OriginalMember(owner = "client!av", name = "e", descriptor = "Z")
    private static boolean field7942 = false;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7939 = new Hashtable(16);

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    private static int field7940;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Ljava/lang/String;")
    private static String field7938;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "Ljava/lang/String;")
    private static String field7941;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;", line = 3)
    public static File method3295(byte arg0, String arg1) {
        if (arg0 != 13) {
            method3295((byte) 79, null);
        }
        return method3297(field7938, field7940, arg1, (byte) -90);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 24)
    public static void method3296(int arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            field7938 = null;
        }
        field7938 = arg1;
        field7940 = arg0;
        try {
            field7941 = System.getProperty("user.home");
            if (field7941 != null) {
                field7941 = field7941 + "/";
            }
        } catch (Exception var3) {
        }
        if (field7941 == null) {
            field7941 = "~/";
        }
        field7942 = true;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Ljava/io/File;", line = 51)
    public static File method3297(String arg0, int arg1, String arg2, byte arg3) {
        if (!field7942) {
            throw new RuntimeException("");
        }
        File var4 = (File) field7939.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7941, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        int var7 = -75 % ((arg3 + 33) / 56);
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    String var11 = var5[var10] + var6[var9] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var5[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var5[var10] + var6[var9])).mkdir();
                                if (arg0 != null) {
                                    (new File(var5[var10] + var6[var9] + "/" + arg0)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field7939.put(arg2, var13);
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
