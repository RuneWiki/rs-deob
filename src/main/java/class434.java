import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class434 {

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6814 = new String[] { method3431(method3430("57Mkf")), method3431(method3430("=0\u000fE")), method3431(method3430("(kM\u00073")), method3431(method3430("57Mhf")) };

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "Leh;")
    public static class380 field6809 = new class380();

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[F")
    public static float[] field6811 = new float[16384];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[F")
    public static float[] field6812 = new float[16384];

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Ljava/lang/String;")
    public static String field6813;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field6810;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6811[var2] = (float) Math.sin((double) var2 * var0);
            field6812[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6813 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 7)
    public static void method3428(int arg0) {
        try {
            field6809 = null;
            if (arg0 == -23063) {
                field6811 = null;
                field6812 = null;
                field6813 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6814[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILha;I)Lhk;", line = 26)
    public static final class107 method3429(int arg0, class63 arg1, int arg2) {
        try {
            field6810++;
            if (arg0 != 0) {
                field6811 = null;
            }
            class670 var3 = (class670) class700.field10071.method737((byte) -39, (long) arg2);
            if (var3 != null) {
                class242 var4 = var3.field9518.method3068(1);
                var3.field9521 = true;
                if (var4 != null) {
                    return var4.method2083(arg1, 108);
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6814[0] + arg0 + ',' + (arg1 == null ? field6814[1] : field6814[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3430(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3431(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
