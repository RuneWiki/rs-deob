import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class255 extends class154 {

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "Lkh;")
    public class17 field3582;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "Lkh;")
    public class17 field3583;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "Ljava/lang/String;")
    public String field3592;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "Z")
    public boolean field3590;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field3586;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)[Lsj;", line = 20)
    public static final class486[] method1674(int arg0) {
        field3589++;
        int var1 = -123 % ((arg0 - 21) / 43);
        return new class486[] { class733.field10118, class733.field10119, class733.field10120, class733.field10121, class733.field10122, class733.field10123, class733.field10124, class733.field10125, class733.field10126, class733.field10127, class733.field10128, class733.field10129 };
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIFIIILmfa;FIFFI[BF)V", line = 30)
    public static final void method1675(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, class643 arg6, float arg7, int arg8, float arg9, float arg10, int arg11, byte[] arg12, float arg13) {
        field3594++;
        int var14 = arg0 * arg3;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg11; var16++) {
            int var19 = arg1;
            arg6.method1147(arg8 - 10690, var15, arg9 / (float) arg3, 0, arg7 / (float) arg0, arg4, arg13 / (float) arg5, arg5, arg3, arg10 * 127.0F, arg0);
            for (int var20 = 0; var20 < var14; var20++) {
                arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                var19++;
            }
            arg9 *= 2.0F;
            arg10 = arg2 * arg10;
            arg13 *= 2.0F;
            arg7 *= 2.0F;
        }
        int var17 = arg1;
        if (arg8 != 2) {
            method1675(13, 48, 0.53512526F, 36, 113, 83, null, 1.0119047F, -77, -0.44353217F, 0.051857088F, 71, null, 1.2159426F);
        }
        for (int var18 = 0; var18 < var14; var18++) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            var17++;
        }
    }
}
