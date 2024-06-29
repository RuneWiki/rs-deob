import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class454 extends class206 {

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6643 = new String[] { method3481(method3480(" \u000e=\u0011\u001c")), method3481(method3480(" \u000e=\u0010\u001c")), method3481(method3480(" \u000e=\u0017\u001c")), method3481(method3480(" \u000e=\u0016\u001c")), method3481(method3480(" \u000e=\u0014\u001c")) };

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field6638 = 0;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "[I")
    public static int[] field6639 = new int[13];

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "Lwia;")
    public static class790 field6634 = new class790(9, 7);

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public int field6635;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public int field6640;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)Ltia;", line = 4)
    public static final class280 method3475(byte arg0) {
        try {
            field6641++;
            class280 var1 = class684.method5019((byte) 121);
            int var2 = 73 % ((arg0 + 59) / 37);
            var1.field4203 = 0;
            var1.field4195 = null;
            var1.field4197 = new class22(5000);
            return var1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6643[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 20)
    public static final void method3476(int arg0) {
        try {
            field6642++;
            class597.field8749.method96((byte) -119);
            class606.field8875.method400((byte) 56);
            int var1 = -110 % ((arg0 - 17) / 39);
            class43.field504.method1336((byte) -102);
            class502.field7252.setBackground(Color.black);
            class559.field8330 = -1;
            class597.field8749 = class492.method3716(class502.field7252, (byte) 116);
            class606.field8875 = class663.method4860(10, true, class502.field7252);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6643[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method3477(int arg0, int arg1, int arg2) {
        try {
            field6637++;
            if (class651.method4783(2, arg0, arg1)) {
                if (arg2 > -5) {
                    method3478((byte) -23);
                }
                return (arg0 & 0x9000) != 0 | class124.method1075(-105, arg1, arg0) | class683.method5007((byte) -106, arg0, arg1) ? true : (arg1 & 0x37) == 0 & (class65.method464((byte) -68, arg1, arg0) | (arg0 & 0x2000) != 0 | class67.method609(arg0, -41, arg1));
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6643[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 64)
    public static void method3478(byte arg0) {
        try {
            int var1 = 62 / ((34 - arg0) / 59);
            field6639 = null;
            field6634 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6643[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I", line = 79)
    public static final int method3479(int arg0, int arg1) {
        try {
            if (arg0 != 2016053707) {
                method3479(39, 14);
            }
            field6636++;
            return (arg1 & 0x3FB98) >> 11;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6643[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3480(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3481(char[] arg0) {
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
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
