import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class643 extends RuntimeException {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Ljava/lang/String;")
    public String field9156;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field9157;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9162 = new String[] { method4699(method4698(":`U{")), method4699(method4698("/;\u00179\u0011")), method4699(method4698("=x\u0017UD")) };

    @OriginalMember(owner = "client!im", name = "d", descriptor = "Llc;")
    public static class608 field9155 = new class608();

    @OriginalMember(owner = "client!im", name = "f", descriptor = "[F")
    public static float[] field9158 = new float[16];

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([BIIIIFFLkc;FBFIF)V")
    public static final void method4696(byte[] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, class734 arg7, float arg8, byte arg9, float arg10, int arg11, float arg12) {
        try {
            field9159++;
            if (arg9 != 109) {
                field9161 = -81;
            }
            for (int var13 = 0; var13 < arg1; var13++) {
                class725.method5252(arg2, arg1, arg8, arg3, var13, 0, arg10, arg0, arg4, arg7, arg6, arg11, arg5, arg12);
                arg2 += arg4 * arg11;
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field9162[2] + (arg0 == null ? field9162[0] : field9162[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field9162[0] : field9162[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static void method4697(int arg0) {
        int var1 = -40 % ((75 - arg0) / 40);
        field9155 = null;
        field9158 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class643(Throwable arg0, String arg1) {
        this.field9156 = arg1;
        this.field9157 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4698(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!im", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4699(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
