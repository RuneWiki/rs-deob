import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class255 extends class227 {

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    private int field3841;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    private int field3842;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    private int field3849;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lrb;")
    public static class143 field3846 = new class143(512);

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
    public static boolean field3851 = false;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field3853 = 0;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field3855 = 0;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "[Lnc;")
    public static class12[] field3856 = new class12[32768];

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "Z")
    public static boolean field3857 = false;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)V")
    public final void method487(int arg0, int arg1, int arg2) {
        if (arg1 != 8199) {
            field3851 = false;
        }
        ++field3848;
        int var4 = this.field3849 * arg0 >> 12;
        int var5 = this.field3841 * arg2 >> 12;
        int var6 = this.field3852 * arg0 >> 12;
        int var7 = this.field3842 * arg2 >> 12;
        class47.method293(var4, var5, -97, var6, super.field3331, super.field3329, var7);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)Lpg;")
    public static final class305 method1750(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field3850;
            try {
                return (class305) Class.forName("fj").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public final void method486(int arg0, int arg1, int arg2) {
        ++field3854;
        if (arg2 != 769) {
            method1754(true, -75);
        }
        int var4 = this.field3849 * arg1 >> 12;
        int var5 = this.field3841 * arg0 >> 12;
        int var6 = this.field3852 * arg1 >> 12;
        int var7 = this.field3842 * arg0 >> 12;
        class301.method2055(var4, 122, super.field3330, var7, var6, var5);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIB)V")
    public final void method485(int arg0, int arg1, byte arg2) {
        ++field3844;
        int var4 = this.field3849 * arg1 >> 12;
        int var5 = this.field3841 * arg0 >> 12;
        if (arg2 != 124) {
            field3853 = -70;
        }
        int var6 = this.field3852 * arg1 >> 12;
        int var7 = this.field3842 * arg0 >> 12;
        class52.method315(var6, var5, (byte) -84, super.field3331, super.field3329, super.field3330, var7, var4);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIILff;JZ)V")
    public static final void method1751(int arg0, int arg1, int arg2, int arg3, class4 arg4, long arg5, boolean arg6) {
        if (arg4 != null) {
            class214 var8 = new class214();
            var8.field3150 = arg4;
            var8.field3142 = arg1 * 128 + 64;
            var8.field3143 = arg2 * 128 + 64;
            var8.field3144 = arg3;
            var8.field3151 = arg5;
            if (class223.field3286[arg0][arg1][arg2] == null) {
                class223.field3286[arg0][arg1][arg2] = new class313(arg0, arg1, arg2);
            }
            class223.field3286[arg0][arg1][arg2].field5027 = var8;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field3846 = null;
        field3856 = null;
        if (arg0 != -2327) {
            method1752(-85);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIBII)V")
    public static final void method1753(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        for (int var6 = arg0; ~var6 >= ~arg2; ++var6) {
            class89.method669(class104.field1795[var6], arg1, arg4, arg5, (byte) -127);
        }
        if (arg3 < 69) {
            method1752(91);
        }
        ++field3845;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIIII)V")
    public class255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3841 = arg1;
        this.field3852 = arg2;
        this.field3842 = arg3;
        this.field3849 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
    public static final void method1754(boolean arg0, int arg1) {
        class258.field3968.method1416(arg1, 0);
        ++field3843;
        if (arg0) {
            field3855 = -66;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class304 var20 = new class304(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class223.field3286[var21][arg1][arg2] == null) {
                    class223.field3286[var21][arg1][arg2] = new class313(var21, arg1, arg2);
                }
            }
            class223.field3286[arg0][arg1][arg2].field5014 = var20;
        } else if (arg3 != 1) {
            class239 var24 = new class239(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class223.field3286[var25][arg1][arg2] == null) {
                    class223.field3286[var25][arg1][arg2] = new class313(var25, arg1, arg2);
                }
            }
            class223.field3286[arg0][arg1][arg2].field5016 = var24;
        } else {
            class304 var22 = new class304(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class223.field3286[var23][arg1][arg2] == null) {
                    class223.field3286[var23][arg1][arg2] = new class313(var23, arg1, arg2);
                }
            }
            class223.field3286[arg0][arg1][arg2].field5014 = var22;
        }
    }
}
