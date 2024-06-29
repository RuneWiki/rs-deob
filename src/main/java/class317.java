import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class317 {

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Z")
    private static boolean field4981 = false;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4979 = new Hashtable(16);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    private static int field4978;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4977;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "Ljava/lang/String;")
    private static String field4980;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method2163(String arg0, String arg1, int arg2, byte arg3) {
        if (!field4981) {
            throw new RuntimeException("");
        }
        File var4 = (File) field4979.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4977, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        int var7 = 0;
        if (arg3 < 94) {
            return null;
        }
        while (var7 < 2) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
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
                                field4979.put(arg0, var12);
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

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2164(String arg0, int arg1) {
        if (arg1 != -25419) {
            field4977 = null;
        }
        return method2163(arg0, field4980, field4978, (byte) 112);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static void method2165(int arg0, int arg1, String arg2) {
        field4978 = arg0;
        field4980 = arg2;
        try {
            field4977 = System.getProperty("user.home");
            if (field4977 != null) {
                field4977 = field4977 + "/";
            }
        } catch (Exception var3) {
        }
        field4981 = true;
        if (arg1 >= 116 && field4977 == null) {
            field4977 = "~/";
        }
    }
}
