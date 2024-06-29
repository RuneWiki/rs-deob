import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class200 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
    public static int[] field3814 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Li;")
    public static class88 field3816 = class208.method1425(105, "0(U");

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Li;")
    private static class88 field3822 = class208.method1425(105, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Li;")
    private static class88 field3818 = class208.method1425(105, "Loaded input handler");

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Li;")
    private static class88 field3830 = class208.method1425(105, "glow1:");

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Li;")
    public static class88 field3825 = field3822;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Li;")
    public static class88 field3815 = field3830;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Li;")
    public static class88 field3831 = field3818;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Li;")
    public static class88 field3819 = field3830;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Li;")
    public static class88 field3833 = class208.method1425(105, "Okay");

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lnb;")
    public static class144 field3829;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lrc;")
    public static class188 field3828;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILq;)V")
    public static final void method1373(int arg0, class174 arg1) {
        field3823++;
        if (arg0 != 65280) {
            field3815 = null;
        }
        if (class110.field2020 == arg1.field3373) {
            class225.field4230[arg1.field3384] = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1374(int arg0) {
        field3814 = null;
        field3829 = null;
        field3831 = null;
        field3819 = null;
        field3815 = null;
        field3825 = null;
        field3816 = null;
        field3833 = null;
        if (arg0 == -876775538) {
            field3828 = null;
            field3830 = null;
            field3818 = null;
            field3822 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lde;I)V")
    public static final void method1375(class39 arg0, int arg1) {
        field3826++;
        if (arg1 != -876775538) {
            field3825 = null;
        }
        class135.method904((byte) 123, arg0, 200000);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lq;IBI)V")
    public static final void method1376(class174 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field3453 == 0) {
            arg0.field3443 = arg0.field3516;
        } else if (arg0.field3453 == 1) {
            arg0.field3443 = (arg3 - arg0.field3424) / 2 + arg0.field3516;
        } else if (arg0.field3453 == 2) {
            arg0.field3443 = arg3 - arg0.field3424 - arg0.field3516;
        } else if (arg0.field3453 == 3) {
            arg0.field3443 = arg0.field3516 * arg3 >> 14;
        } else if (arg0.field3453 == 4) {
            arg0.field3443 = (arg0.field3516 * arg3 >> 14) + (arg3 - arg0.field3424) / 2;
        } else {
            arg0.field3443 = arg3 - arg0.field3424 - (arg0.field3516 * arg3 >> 14);
        }
        if (arg2 != -127) {
            method1377(-105L, (byte) 28);
        }
        field3820++;
        if (arg0.field3369 == 0) {
            arg0.field3368 = arg0.field3393;
        } else if (arg0.field3369 == 1) {
            arg0.field3368 = (arg1 - arg0.field3382) / 2 + arg0.field3393;
        } else if (arg0.field3369 == 2) {
            arg0.field3368 = arg1 - arg0.field3393 - arg0.field3382;
        } else if (arg0.field3369 == 3) {
            arg0.field3368 = arg0.field3393 * arg1 >> 14;
        } else if (arg0.field3369 == 4) {
            arg0.field3368 = (arg0.field3393 * arg1 >> 14) + (arg1 - arg0.field3382) / 2;
        } else {
            arg0.field3368 = arg1 - (arg0.field3393 * arg1 >> 14) - arg0.field3382;
        }
        if (!class116.field2105) {
            return;
        }
        if (class80.method530(-881710560, arg0) == 0 && arg0.field3392 != 0) {
            return;
        }
        if (arg0.field3443 < 0) {
            arg0.field3443 = 0;
        } else if (arg3 < arg0.field3443 + arg0.field3424) {
            arg0.field3443 = arg3 - arg0.field3424;
        }
        if (arg0.field3368 < 0) {
            arg0.field3368 = 0;
            return;
        }
        if (arg0.field3382 + arg0.field3368 > arg1) {
            arg0.field3368 = arg1 - arg0.field3382;
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JB)Li;")
    public static final class88 method1377(long arg0, byte arg1) {
        field3817++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg1 <= 55) {
                method1377(109L, (byte) 86);
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class54.field1008[(int) (var8 - arg0 * 37L)];
            }
            class88 var7 = new class88();
            var7.field1643 = var6;
            var7.field1660 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([SI[Li;)V")
    public static final void method1378(short[] arg0, int arg1, class88[] arg2) {
        if (arg1 <= 8) {
            field3825 = null;
        }
        class152.method1039(2, 0, arg2, arg2.length - 1, arg0);
        field3821++;
    }
}
