import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class672 extends class206 {

    @OriginalMember(owner = "client!it", name = "n", descriptor = "Lef;")
    public class513 field9756 = new class513();

    @OriginalMember(owner = "client!it", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9759 = new String[] { method4945(method4944("w,P\u00049")), method4945(method4944("evPil")), method4945(method4944("w,P\u00059")), method4945(method4944("p-\u0012+")), method4945(method4944("w,P\u00069")) };

    @OriginalMember(owner = "client!it", name = "l", descriptor = "Lel;")
    public static class573 field9754 = new class573(57, -1);

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Lwia;")
    public static class790 field9758 = new class790(3, -1);

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([BIIIBI[BII)V", line = 3)
    public static final void method4941(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            field9755++;
            int var9 = -(arg3 >> 2);
            int var15 = -(arg3 & 0x3);
            if (arg4 != 115) {
                field9758 = null;
            }
            for (int var10 = -arg7; var10 < 0; var10++) {
                int var10001;
                for (int var11 = var9; var11 < 0; var11++) {
                    var10001 = arg2++;
                    arg0[var10001] = (byte) (arg0[var10001] - arg6[arg8++]);
                    int var16 = arg2++;
                    arg0[var16] = (byte) (arg0[var16] - arg6[arg8++]);
                    int var17 = arg2++;
                    arg0[var17] = (byte) (arg0[var17] - arg6[arg8++]);
                    int var18 = arg2++;
                    arg0[var18] = (byte) (arg0[var18] - arg6[arg8++]);
                }
                for (int var12 = var15; var12 < 0; var12++) {
                    var10001 = arg2++;
                    arg0[var10001] = (byte) (arg0[var10001] - arg6[arg8++]);
                }
                arg2 += arg1;
                arg8 += arg5;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field9759[2] + (arg0 == null ? field9759[3] : field9759[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field9759[3] : field9759[1]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 47)
    public static void method4942(int arg0) {
        try {
            field9758 = null;
            int var1 = 102 / ((arg0 + 11) / 47);
            field9754 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9759[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z", line = 64)
    public static final boolean method4943(int arg0, int arg1) {
        try {
            if (arg1 == -2) {
                field9757++;
                return arg0 != 1 && arg0 != 7;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9759[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!it", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4944(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!it", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4945(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
