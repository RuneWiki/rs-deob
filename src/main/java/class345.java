import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class345 {

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5375 = new String[] { method2861(method2860("^>Ot2C\"Gc")), method2861(method2860("Ub")), method2861(method2860("Y:")), method2861(method2860("\u0005+Cjyt>^inN\u0012")), method2861(method2860("Hw\u0005quE)Eqo\u0004")), method2861(method2860("\u0004?Ye}H%O)")), method2861(method2860("\u0005'KayS\u0012Ig\u007fC(u")), method2861(method2860("Hw\u0005quE#^)")), method2861(method2860("Hw\u0005")), method2861(method2860("Hw\u0005toH,Iny\u0004")), method2861(method2860("\u00049Gv3")) };

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Z")
    private static boolean field5371 = false;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5372 = new Hashtable(16);

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    private static int field5370;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Ljava/lang/String;")
    private static String field5373;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Ljava/lang/String;")
    private static String field5374;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 3)
    public static File method2857(String arg0, byte arg1) {
        int var2 = -29 % ((31 - arg1) / 47);
        return method2859(false, arg0, field5370, field5373);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BILjava/lang/String;)V", line = 12)
    public static void method2858(byte arg0, int arg1, String arg2) {
        field5373 = arg2;
        field5370 = arg1;
        if (arg0 != -23) {
            return;
        }
        try {
            field5374 = System.getProperty(field5375[0]);
            if (field5374 != null) {
                field5374 = field5374 + "/";
            }
        } catch (Exception var3) {
        }
        field5371 = true;
        if (field5374 == null) {
            field5374 = field5375[1];
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;", line = 38)
    public static File method2859(boolean arg0, String arg1, int arg2, String arg3) {
        if (!field5371) {
            throw new RuntimeException("");
        }
        File var4 = (File) field5372.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { field5375[9], field5375[5], field5375[4], field5375[7], field5375[8], field5374, field5375[10], "" };
        String[] var6 = new String[] { field5375[6] + arg2, field5375[3] + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, field5375[2]);
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field5372.put(arg1, var12);
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
        if (arg0) {
            method2859(true, null, -114, null);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2860(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2861(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
