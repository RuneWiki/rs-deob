import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class620 {

    @OriginalMember(owner = "client!et", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9110 = new String[] { method4630(method4629("B,,1\u0014")), method4630(method4629("\\v,^A")), method4630(method4629("I-n\u001c")) };

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lco;ILha;ILhg;IIBLsb;)V", line = 11)
    public static final void method4628(class131 arg0, int arg1, class66 arg2, int arg3, class718 arg4, int arg5, int arg6, byte arg7, class306 arg8) {
        try {
            field9109++;
            if (arg7 != 36) {
                field9108 = 45;
            }
            int var9 = arg5 - (arg1 / 2) - 5;
            int var10 = arg6 + 2;
            if (arg8.field4811 != 0) {
                arg2.method593(arg8.field4811, var9, (byte) -82, arg3 * arg4.method5233() + arg6 + 1 - var10, arg1 + 10, var10);
            }
            if (arg8.field4817 != 0) {
                arg2.method580(var9, arg3 * arg4.method5233() + (arg6 - var10) + 1, arg8.field4817, arg1 + 10, var10, 1);
            }
            int var11 = arg8.field4806;
            if (arg0.field1528 && arg8.field4827 != -1) {
                var11 = arg8.field4827;
            }
            for (int var12 = 0; var12 < arg3; var12++) {
                String var13 = class199.field3107[var12];
                if ((arg3 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                arg4.method5236(arg2, var13, arg5, arg6, var11, true);
                arg6 += arg4.method5233();
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field9110[0] + (arg0 == null ? field9110[2] : field9110[1]) + ',' + arg1 + ',' + (arg2 == null ? field9110[2] : field9110[1]) + ',' + arg3 + ',' + (arg4 == null ? field9110[2] : field9110[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field9110[2] : field9110[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4629(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!et", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4630(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
