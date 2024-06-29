import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class77 {

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "Ltq;")
    public static class536 field1076 = new class536(64);

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "[I")
    public static int[] field1081 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "[I")
    public static int[] field1082 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "B")
    public static byte field1083;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
    public static int method473(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        field1076 = null;
        if (arg0 != 3) {
            field1081 = null;
        }
        field1081 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILfc;IIFIIFIIFF[BF)V")
    public static final void method475(int arg0, class762 arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, int arg8, int arg9, float arg10, float arg11, byte[] arg12, float arg13) {
        field1077++;
        int var14 = arg6 * arg9;
        float[] var15 = new float[var14];
        if (arg5 <= 102) {
            field1082 = null;
        }
        for (int var16 = 0; var16 < arg3; var16++) {
            arg1.method3054(arg9, arg13 / (float) arg0, arg7 / (float) arg6, arg0, arg6, arg4 / (float) arg9, (byte) -33, arg8, var15, 0, arg10 * 127.0F);
            int var19 = arg2;
            arg4 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                var19++;
            }
            arg13 *= 2.0F;
            arg10 *= arg11;
            arg7 *= 2.0F;
        }
        int var17 = arg2;
        for (int var18 = 0; var18 < var14; var18++) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILka;II)Lid;")
    public static final class486 method476(int arg0, int arg1, class299 arg2, int arg3, int arg4) {
        field1074++;
        if (arg2 == null) {
            return null;
        }
        class486 var5 = new class486(arg3, arg0, arg1, arg2.method1245(), arg2.method1300(), arg2.method1231(), arg2.method1260(), arg2.method1290(), arg2.method1279(), arg2.method1261());
        if (arg4 != 5) {
            field1082 = null;
        }
        return var5;
    }
}
