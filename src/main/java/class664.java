import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class664 {

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9458 = new String[] { method4822(method4821("D\\v_a")), method4822(method4821("YY4p")), method4822(method4821("L\u0002v24")), method4822(method4821("D\\v^a")), method4822(method4821("D\\v]a")) };

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Ltga;")
    public static class61 field9456;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
    public static int[] field9455;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 5)
    public static void method4818(byte arg0) {
        try {
            field9455 = null;
            int var1 = -118 / ((arg0 - 50) / 53);
            field9456 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9458[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIBIII)V", line = 16)
    public static final void method4819(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        try {
            field9454++;
            if (arg2 != -90) {
                method4820(null, -8, -2.1769056F, 7, -2.6086562F, 53, (byte) 17, -44, -1.2262628F, -0.20912461F, 30, 2.0284488F, -82, null);
            }
            for (int var6 = arg3; var6 <= arg4; var6++) {
                class545.method4051(arg0, arg1, arg5, class193.field3047[var6], -111);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9458[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([BIFIFIBIFFIFILkda;)V", line = 39)
    public static final void method4820(byte[] arg0, int arg1, float arg2, int arg3, float arg4, int arg5, byte arg6, int arg7, float arg8, float arg9, int arg10, float arg11, int arg12, class410 arg13) {
        try {
            field9457++;
            if (arg6 != 83) {
                method4818((byte) 33);
            }
            int var14 = arg1 * arg3;
            float[] var15 = new float[var14];
            for (int var16 = 0; var16 < arg10; var16++) {
                arg13.method3290(arg8 / (float) arg7, arg2 / (float) arg3, arg12, 0, arg7, arg6 ^ 0x19, var15, arg9 * 127.0F, arg1, arg4 / (float) arg1, arg3);
                int var17 = arg5;
                arg4 *= 2.0F;
                arg9 *= arg11;
                for (int var18 = 0; var18 < var14; var18++) {
                    arg0[var17] = (byte) ((int) ((float) arg0[var17] + var15[var18]));
                    var17++;
                }
                arg8 *= 2.0F;
                arg2 *= 2.0F;
            }
            int var19 = arg5;
            for (int var20 = 0; var20 < var14; var20++) {
                arg0[var19] -= -127;
                var19++;
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field9458[3] + (arg0 == null ? field9458[1] : field9458[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 == null ? field9458[1] : field9458[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4821(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4822(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
