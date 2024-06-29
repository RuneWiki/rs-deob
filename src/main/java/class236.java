import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class236 {

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Z")
    private static boolean field3411 = false;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field3413 = new Hashtable(16);

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    private static int field3410;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Ljava/lang/String;")
    private static String field3409;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Ljava/lang/String;")
    private static String field3412;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 3)
    public static void method1622(String arg0, int arg1, int arg2) {
        field3412 = arg0;
        field3410 = arg2;
        try {
            field3409 = System.getProperty("user.home");
            if (field3409 != null) {
                field3409 = field3409 + "/";
            }
            if (arg1 != -3) {
                field3413 = null;
            }
        } catch (Exception var3) {
        }
        field3411 = true;
        if (field3409 == null) {
            field3409 = "~/";
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;", line = 28)
    public static File method1623(boolean arg0, String arg1) {
        if (!arg0) {
            field3412 = null;
        }
        return method1624((byte) 16, field3410, arg1, field3412);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 39)
    public static File method1624(byte arg0, int arg1, String arg2, String arg3) {
        if (!field3411) {
            throw new RuntimeException("");
        }
        File var4 = (File) field3413.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3409, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        if (arg0 != 16) {
            return null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg2;
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
                                field3413.put(arg2, var12);
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
