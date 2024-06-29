import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class536 {

    @OriginalMember(owner = "client!nea", name = "e", descriptor = "Z")
    private static boolean field7856 = false;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7854 = new Hashtable(16);

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
    private static int field7855;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "Ljava/lang/String;")
    private static String field7852;

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "Ljava/lang/String;")
    private static String field7853;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 8)
    public static File method3092(int arg0, int arg1, String arg2, String arg3) {
        if (!field7856) {
            throw new RuntimeException("");
        }
        File var4 = (File) field7854.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7853, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        if (arg1 != 0) {
            method3093((byte) -36, null);
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg3;
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
                                field7854.put(arg3, var12);
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

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;", line = 102)
    public static File method3093(byte arg0, String arg1) {
        return arg0 == 79 ? method3092(field7855, 0, field7852, arg1) : null;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 113)
    public static void method3094(int arg0, String arg1, int arg2) {
        field7855 = arg2;
        field7852 = arg1;
        if (arg0 != -203) {
            method3094(118, null, -56);
        }
        try {
            field7853 = System.getProperty("user.home");
            if (field7853 != null) {
                field7853 = field7853 + "/";
            }
        } catch (Exception var3) {
        }
        if (field7853 == null) {
            field7853 = "~/";
        }
        field7856 = true;
    }
}
