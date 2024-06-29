import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class236 extends class554 {

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!cca", name = "t", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!cca", name = "u", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "Z")
    public static boolean field3031;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        if (arg1 > 74) {
            ++field3033;
        }
    }

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        if (arg0 != 4096) {
            field3031 = false;
        }
        ++field3034;
        return true;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        super.field7743.method3344(29639, arg2);
        ++field3030;
        super.field7743.method3291(arg1, 2);
        if (!arg0) {
            method1488(-65, 0.7308133F, (byte[]) null, 0.8675778F, -0.7377629F, true, 44, (class323) null, -88, -0.5162514F, 72, 95, -1.0568218F, 90);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        super.field7743.method3342(true, true);
        ++field3027;
        if (arg0 != 61) {
            field3031 = true;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        super.field7743.method3342(true, false);
        if (arg0 != 4096) {
            method1488(30, -1.9512613F, (byte[]) null, 0.66038495F, 0.07822623F, false, -16, (class323) null, 1, 0.7682971F, -38, -8, -0.26208016F, -88);
        }
        ++field3035;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lre;)V")
    public class236(class582 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IF[BFFZILj;IFIIFI)V")
    public static final void method1488(int arg0, float arg1, byte[] arg2, float arg3, float arg4, boolean arg5, int arg6, class323 arg7, int arg8, float arg9, int arg10, int arg11, float arg12, int arg13) {
        ++field3028;
        int var14 = arg11 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; ~arg8 < ~var16; ++var16) {
            arg7.method1842(arg4 / (float) arg13, arg10, arg1 / (float) arg10, var15, arg11, arg0, arg9 * 127.0F, arg13, false, arg12 / (float) arg11, 0);
            int var19 = arg6;
            arg1 *= 2.0F;
            arg4 *= 2.0F;
            arg9 = arg3 * arg9;
            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                arg2[var19] = (byte) ((int) ((float) arg2[var19] + var15[var20]));
                ++var19;
            }
            arg12 *= 2.0F;
        }
        if (!arg5) {
            field3031 = true;
        }
        int var17 = arg6;
        for (int var18 = 0; ~var14 < ~var18; ++var18) {
            arg2[var17] = (byte) (arg2[var17] + 127);
            ++var17;
        }
    }

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "(I)V")
    public static final void method1489(int arg0) {
        ++field3032;
        int var1 = (int) ((double) class139.field1760 * 34.46D);
        int var2 = var1 << 2;
        if (class301.field3918.method970()) {
            var2 += 512;
        }
        class301.field3918.method940(arg0, var2);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        ++field3029;
        if (!arg1) {
            field3031 = true;
        }
    }
}
