import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class125 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
    private static boolean field1655 = false;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field1658 = new Hashtable(16);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    private static int field1654;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Ljava/lang/String;")
    private static String field1656;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1657;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public static File method733(int arg0, String arg1) {
        if (arg0 < 57) {
            field1655 = true;
        }
        return method735(field1656, field1654, arg1, 0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static void method734(int arg0, int arg1, String arg2) {
        field1654 = arg0;
        if (arg1 >= -92) {
            method735(null, -64, null, 43);
        }
        field1656 = arg2;
        try {
            field1657 = System.getProperty("user.home");
            if (field1657 != null) {
                field1657 = field1657 + "/";
            }
        } catch (Exception var3) {
        }
        if (field1657 == null) {
            field1657 = "~/";
        }
        field1655 = true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
    public static File method735(String arg0, int arg1, String arg2, int arg3) {
        if (!field1655) {
            throw new RuntimeException("");
        }
        File var4 = (File) field1658.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1657, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var7 = arg3; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
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
                                field1658.put(arg2, var12);
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
