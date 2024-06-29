import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class696 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field10033;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10035 = new String[] { method5063(method5062("#>W(N")), method5063(method5062("#>W+N")), method5063(method5062("#>WU\u000f86\rWN")), method5063(method5062("#>W\u001d\t\u0005+\u000b\u0000\b1w")), method5063(method5062("8*\u0015\u0005")), method5063(method5062("-qWG\u001b")), method5063(method5062("#>W*N")) };

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[Lhu;")
    public static class139[] field10027 = new class139[0];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field10028 = 765;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[I")
    public static int[] field10029 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field10032;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lvb;")
    public static class205 field10030;

    @OriginalMember(owner = "client!ua", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        try {
            field10034++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10035[3] + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V", line = 23)
    public static final void method5059(int arg0, int arg1, int arg2) {
        try {
            field10032++;
            if (arg2 == 18890) {
                class551 var3 = class380.method3113(70, (long) arg0, 1);
                var3.method4086(arg2 - 18797);
                var3.field8076 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10035[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 38)
    public static void method5060(int arg0) {
        try {
            field10029 = null;
            field10027 = null;
            field10030 = null;
            if (arg0 != 99) {
                field10028 = 54;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10035[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;IB)I", line = 56)
    public static final int method5061(String arg0, int arg1, byte arg2) {
        try {
            field10031++;
            return arg2 >= -119 ? -5 : class184.method1732(arg1, arg0, 67, true);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10035[6] + (arg0 == null ? field10035[4] : field10035[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V", line = 66)
    public class696(int arg0) {
        try {
            this.field10033 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10035[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5062(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5063(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
