import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class40 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Z")
    private static boolean field514 = false;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field513 = new Hashtable(16);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private static int field516;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Ljava/lang/String;")
    private static String field512;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Ljava/lang/String;")
    private static String field515;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 4)
    public static void method221(String arg0, boolean arg1, int arg2) {
        field512 = arg0;
        field516 = arg2;
        try {
            field515 = System.getProperty("user.home");
            if (field515 != null) {
                field515 = field515 + "/";
            }
        } catch (Exception var3) {
        }
        field514 = arg1;
        if (field515 == null) {
            field515 = "~/";
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 27)
    public static File method222(byte arg0, int arg1, String arg2, String arg3) {
        if (!field514) {
            throw new RuntimeException("");
        }
        File var4 = (File) field513.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field515, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        int var7 = 0;
        if (arg0 > -114) {
            field513 = null;
        }
        while (var7 < 2) {
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
                                field513.put(arg3, var12);
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
            var7++;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 127)
    public static File method223(String arg0, int arg1) {
        int var2 = 123 / ((6 - arg1) / 62);
        return method222((byte) -119, field516, field512, arg0);
    }
}
