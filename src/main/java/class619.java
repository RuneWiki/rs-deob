import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class619 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Z")
    private static boolean field8711 = false;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field8713 = new Hashtable(16);

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    private static int field8710;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Ljava/lang/String;")
    private static String field8712;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "Ljava/lang/String;")
    private static String field8714;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 5)
    public static void method3475(String arg0, int arg1, int arg2) {
        field8710 = arg2;
        field8712 = arg0;
        try {
            field8714 = System.getProperty("user.home");
            if (arg1 != 0) {
                method3476(null, (byte) -24);
            }
            if (field8714 != null) {
                field8714 = field8714 + "/";
            }
        } catch (Exception var3) {
        }
        if (field8714 == null) {
            field8714 = "~/";
        }
        field8711 = true;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 31)
    public static File method3476(String arg0, byte arg1) {
        int var2 = 55 / ((24 - arg1) / 53);
        return method3477(arg0, field8712, -4807, field8710);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", line = 47)
    public static File method3477(String arg0, String arg1, int arg2, int arg3) {
        if (!field8711) {
            throw new RuntimeException("");
        }
        File var4 = (File) field8713.get(arg0);
        if (var4 != null) {
            return var4;
        } else if (arg2 == -4807) {
            String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field8714, "/tmp/", "" };
            String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
            for (int var7 = 0; var7 < 2; var7++) {
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
                                    field8713.put(arg0, var12);
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
}
