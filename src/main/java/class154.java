import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class154 {

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "Z")
    private static boolean field2212 = false;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2213 = new Hashtable(16);

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    private static int field2215;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2214;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "Ljava/lang/String;")
    private static String field2216;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)Ljava/io/File;", line = 9)
    public static File method1076(String arg0, int arg1, boolean arg2, String arg3) {
        if (!field2212) {
            throw new RuntimeException("");
        }
        File var4 = (File) field2213.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2214, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        int var7 = 0;
        if (arg2) {
            return null;
        }
        while (var7 < 2) {
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
                                field2213.put(arg3, var12);
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

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;", line = 105)
    public static File method1077(boolean arg0, String arg1) {
        return arg0 ? null : method1076(field2216, field2215, false, arg1);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 115)
    public static void method1078(int arg0, String arg1, int arg2) {
        if (arg2 != -1) {
            field2213 = null;
        }
        field2216 = arg1;
        field2215 = arg0;
        try {
            field2214 = System.getProperty("user.home");
            if (field2214 != null) {
                field2214 = field2214 + "/";
            }
        } catch (Exception var3) {
        }
        field2212 = true;
        if (field2214 == null) {
            field2214 = "~/";
        }
    }
}
