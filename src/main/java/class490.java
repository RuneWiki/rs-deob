import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class490 {

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "Z")
    private static boolean field6711 = false;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6710 = new Hashtable(16);

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    private static int field6707;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "Ljava/lang/String;")
    private static String field6708;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Ljava/lang/String;")
    private static String field6709;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 5)
    public static File method2777(String arg0, byte arg1) {
        if (arg1 > -126) {
            field6708 = null;
        }
        return method2778(field6707, field6708, (byte) -113, arg0);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Ljava/io/File;", line = 20)
    public static File method2778(int arg0, String arg1, byte arg2, String arg3) {
        if (!field6711) {
            throw new RuntimeException("");
        }
        File var4 = (File) field6710.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6709, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg3;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg1 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg1)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field6710.put(arg3, var12);
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
        if (arg2 > -108) {
            method2777(null, (byte) 50);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 117)
    public static void method2779(int arg0, String arg1, int arg2) {
        field6707 = arg2;
        field6708 = arg1;
        try {
            field6709 = System.getProperty("user.home");
            if (field6709 != null) {
                field6709 = field6709 + "/";
            }
        } catch (Exception var3) {
        }
        if (field6709 == null) {
            field6709 = "~/";
        }
        if (arg0 == 0) {
            field6711 = true;
        }
    }
}
