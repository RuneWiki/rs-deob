import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class553 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
    private static boolean field7748 = false;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7749 = new Hashtable(16);

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    private static int field7750;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ljava/lang/String;")
    private static String field7746;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Ljava/lang/String;")
    private static String field7747;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 3)
    public static void method3240(int arg0, String arg1, int arg2) {
        field7747 = arg1;
        field7750 = arg2;
        try {
            field7746 = System.getProperty("user.home");
            if (field7746 != null) {
                field7746 = field7746 + "/";
            }
        } catch (Exception var3) {
        }
        if (field7746 == null) {
            field7746 = "~/";
        }
        if (arg0 == 0) {
            field7748 = true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 26)
    public static File method3241(int arg0, byte arg1, String arg2, String arg3) {
        if (!field7748) {
            throw new RuntimeException("");
        }
        File var4 = (File) field7749.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7746, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        int var7 = 0;
        if (arg1 != 94) {
            method3241(-68, (byte) 19, null, null);
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
                                field7749.put(arg3, var12);
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

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;", line = 123)
    public static File method3242(byte arg0, String arg1) {
        if (arg0 < 25) {
            method3242((byte) -89, null);
        }
        return method3241(field7750, (byte) 94, field7747, arg1);
    }
}
