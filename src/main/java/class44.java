import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class44 {

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Z")
    private static boolean field672 = false;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field671 = new Hashtable(16);

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    private static int field674;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "Ljava/lang/String;")
    private static String field673;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "Ljava/lang/String;")
    private static String field675;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 4)
    public static void method344(boolean arg0, int arg1, String arg2) {
        field674 = arg1;
        field673 = arg2;
        try {
            field675 = System.getProperty("user.home");
            if (field675 != null) {
                field675 = field675 + "/";
            }
        } catch (Exception var3) {
        }
        if (field675 == null) {
            field675 = "~/";
        }
        field672 = true;
        if (arg0) {
            method345(99, null);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 32)
    public static File method345(int arg0, String arg1) {
        int var2 = -74 / ((arg0 + 51) / 43);
        return method346((byte) 50, field674, field673, arg1);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;", line = 46)
    public static File method346(byte arg0, int arg1, String arg2, String arg3) {
        if (arg0 <= 48) {
            return null;
        } else if (field672) {
            File var4 = (File) field671.get(arg3);
            if (var4 != null) {
                return var4;
            }
            String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field675, "/tmp/", "" };
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
                                    field671.put(arg3, var12);
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
            throw new RuntimeException("");
        }
    }
}
