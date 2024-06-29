import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class125 {

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "Z")
    private static boolean field1589 = false;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field1587 = new Hashtable(16);

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    private static int field1590;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Ljava/lang/String;")
    private static String field1586;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Ljava/lang/String;")
    private static String field1588;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static File method965(int arg0, int arg1, String arg2, String arg3) {
        if (!field1589) {
            throw new RuntimeException("");
        }
        File var4 = (File) field1587.get(arg3);
        if (var4 != null) {
            return var4;
        } else if (arg0 == -3) {
            String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1588, "/tmp/", "" };
            String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
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
                                    field1587.put(arg3, var12);
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
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static void method966(int arg0, String arg1, int arg2) {
        field1586 = arg1;
        field1590 = arg0;
        try {
            if (arg2 != -3) {
                field1587 = null;
            }
            field1588 = System.getProperty("user.home");
            if (field1588 != null) {
                field1588 = field1588 + "/";
            }
        } catch (Exception var3) {
        }
        field1589 = true;
        if (field1588 == null) {
            field1588 = "~/";
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public static File method967(int arg0, String arg1) {
        if (arg0 != 1) {
            field1589 = false;
        }
        return method965(-3, field1590, field1586, arg1);
    }
}
