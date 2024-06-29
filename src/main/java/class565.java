import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class565 {

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "Z")
    private static boolean field7840 = false;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7839 = new Hashtable(16);

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    private static int field7843;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "Ljava/lang/String;")
    private static String field7841;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "Ljava/lang/String;")
    private static String field7842;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IILjava/lang/String;)V", line = 4)
    public static void method3319(int arg0, int arg1, String arg2) {
        field7841 = arg2;
        field7843 = arg1;
        try {
            field7842 = System.getProperty("user.home");
            if (field7842 != null) {
                field7842 = field7842 + "/";
            }
        } catch (Exception var3) {
        }
        if (field7842 == null) {
            field7842 = "~/";
        }
        if (arg0 > -26) {
            field7842 = null;
        }
        field7840 = true;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;", line = 30)
    public static File method3320(String arg0, int arg1, int arg2, String arg3) {
        if (!field7840) {
            throw new RuntimeException("");
        }
        File var4 = (File) field7839.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7842, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
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
                                field7839.put(arg3, var12);
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
        if (arg2 == 27649) {
            throw new RuntimeException();
        }
        return null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;", line = 127)
    public static File method3321(byte arg0, String arg1) {
        if (arg0 > -24) {
            method3319(-18, 82, null);
        }
        return method3320(field7841, field7843, 27649, arg1);
    }
}
