import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class437 extends class568 {

    @OriginalMember(owner = "client!za", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6835 = new String[] { method3439(method3438("='b\u0005'")), method3439(method3438("='b\u0002'")), method3439(method3438("='b\u0003'")) };

    @OriginalMember(owner = "client!za", name = "o", descriptor = "J")
    public static long field6832 = 0L;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "Lcka;")
    public static class183 field6833;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3435(int arg0, byte arg1, int arg2) {
        try {
            field6834++;
            int var3 = -4 % ((arg1 - 3) / 51);
            return (arg2 & 0x8000) != 0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6835[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIII)V")
    public static final void method3436(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            field6831++;
            class551 var5 = class380.method3113(95, (long) arg4 | (long) arg0 << 32, 18);
            var5.method4086(-30);
            var5.field8076 = arg3;
            if (arg1 == -95) {
                var5.field8073 = arg2;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6835[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
    public static void method3437(boolean arg0) {
        try {
            if (arg0) {
                method3435(1, (byte) 21, 48);
            }
            field6833 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6835[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3438(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!za", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3439(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
