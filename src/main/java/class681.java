import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class681 {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    private static boolean field9579 = false;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field9583 = new Hashtable(16);

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    private static int field9580;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "Ljava/lang/String;")
    private static String field9581;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "Ljava/lang/String;")
    private static String field9582;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static void method3895(boolean arg0, String arg1, int arg2) {
        field9582 = arg1;
        field9580 = arg2;
        try {
            if (arg0) {
                method3896(null, 52, -73, null);
            }
            field9581 = System.getProperty("user.home");
            if (field9581 != null) {
                field9581 = field9581 + "/";
            }
        } catch (Exception var3) {
        }
        if (field9581 == null) {
            field9581 = "~/";
        }
        field9579 = true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;")
    public static File method3896(String arg0, int arg1, int arg2, String arg3) {
        if (!field9579) {
            throw new RuntimeException("");
        }
        File var4 = (File) field9583.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field9581, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
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
                                field9583.put(arg3, var12);
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
        if (arg1 != -1782) {
            method3897(null, (byte) 28);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
    public static File method3897(String arg0, byte arg1) {
        int var2 = -98 / ((-arg1 - 55) / 43);
        return method3896(field9582, -1782, field9580, arg0);
    }
}
