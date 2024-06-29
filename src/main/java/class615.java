import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class615 {

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8786 = new String[] { method4537(method4536("qz3R_")), method4537(method4536("qz3Q_")) };

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "Lmv;")
    public static class125 field8780 = new class125(43, 4);

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "[F")
    public static float[] field8782 = new float[16384];

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "[F")
    public static float[] field8783 = new float[16384];

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "Z")
    public static boolean field8784;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "[C")
    public static char[] field8785;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field8781;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8783[var2] = (float) Math.sin((double) var2 * var0);
            field8782[var2] = (float) Math.cos((double) var2 * var0);
        }
        field8784 = false;
        field8785 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 8)
    public static void method4534(int arg0) {
        try {
            field8780 = null;
            field8783 = null;
            if (arg0 != 338) {
                field8779 = 126;
            }
            field8785 = null;
            field8782 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8786[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIIIII)V", line = 22)
    public static final void method4535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field8781++;
            class115.method1061(arg6, arg5, arg3 ^ 0x68, arg7, arg1, arg2, arg0, arg3, arg4, arg8);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field8786[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4536(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4537(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
