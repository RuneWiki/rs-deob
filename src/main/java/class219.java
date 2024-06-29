import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class219 extends class104 {

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Z")
    private boolean field3654 = false;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field3646 = 0;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field3643 = 0;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    private int field3665 = -1;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    private int field3658 = -32768;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "Z")
    private boolean field3674 = false;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    private int field3666;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    private int field3663;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Lwi;")
    private class285 field3653;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
    public static boolean field3651 = false;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "D")
    public double field3647;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "D")
    private double field3650;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "D")
    private double field3660;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "D")
    private double field3667;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "D")
    public double field3670;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "D")
    private double field3673;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "D")
    private double field3676;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "D")
    public double field3677;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    private int field3675;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "Ljg;")
    public static class326 field3657;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "Lil;")
    private class65 field3645;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 6)
    public static void method1608(int arg0) {
        if (arg0 != -3) {
            field3651 = false;
        }
        field3657 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILgk;)V", line = 16)
    private final void method1609(int arg0, class10 arg1) {
        if (arg0 != 1) {
            return;
        }
        field3679++;
        if (class43.field680) {
            class183 var4 = (class183) arg1;
            if ((this.field3645 == null || this.field3645.field1024) && (var4.field3086 != null || var4.field3066 != null)) {
                this.field3645 = new class65(class181.field3045, 1, 1);
            }
            if (this.field3645 != null) {
                this.field3645.method613(var4.field3086, var4.field3066, false, var4.field3080, var4.field3054, var4.field3087);
            }
        } else {
            class103 var3 = (class103) arg1;
            if ((this.field3645 == null || this.field3645.field1024) && (var3.field1653 != null || var3.field1672 != null)) {
                this.field3645 = new class65(class181.field3045, 1, 1);
            }
            if (this.field3645 != null) {
                this.field3645.method613(var3.field1653, var3.field1672, false, var3.field1657, var3.field1671, var3.field1664);
            }
        }
        this.field3674 = true;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V", line = 52)
    public final void method1610(int arg0, int arg1) {
        this.field3654 = true;
        if (arg0 <= 109) {
            this.method1611(18, 33, 118, 42, -10);
        }
        this.field3670 += (double) arg1 * this.field3650;
        if (this.field3662 == -1) {
            this.field3677 += (double) arg1 * this.field3676;
        } else {
            this.field3677 += this.field3660 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3676;
            this.field3676 += (double) arg1 * this.field3660;
        }
        field3680++;
        this.field3647 += (double) arg1 * this.field3673;
        this.field3661 = (int) (Math.atan2(this.field3650, this.field3673) * 325.949D) + 1024 & 0x7FF;
        this.field3675 = (int) (Math.atan2(this.field3676, this.field3667) * 325.949D) & 0x7FF;
        if (this.field3653 == null) {
            return;
        }
        this.field3646 += arg1;
        while (true) {
            do {
                do {
                    if (this.field3653.field4536[this.field3643] >= this.field3646) {
                        return;
                    }
                    this.field3646 -= this.field3653.field4536[this.field3643];
                    this.field3643++;
                    if (this.field3653.field4531.length <= this.field3643) {
                        this.field3643 -= this.field3653.field4544;
                        if (this.field3643 < 0 || this.field3653.field4531.length <= this.field3643) {
                            this.field3643 = 0;
                        }
                    }
                    this.field3665 = this.field3643 + 1;
                } while (this.field3665 < this.field3653.field4531.length);
                this.field3665 -= this.field3653.field4544;
            } while (this.field3665 >= 0 && this.field3653.field4531.length > this.field3665);
            this.field3665 = -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIJILil;)V", line = 112)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field3669++;
        class10 var13 = this.method1612(0);
        if (var13 != null) {
            this.method1609(1, var13);
            var13.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3645);
            this.field3658 = var13.method95();
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()I", line = 131)
    public final int method95() {
        field3678++;
        return this.field3658;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V", line = 139)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3671++;
        if (!this.field3674) {
            class10 var6 = this.method1612(0);
            if (var6 == null) {
                return;
            }
            this.method1609(1, var6);
        }
        if (this.field3645 != null) {
            this.field3645.method615(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIII)V", line = 165)
    public final void method1611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3659++;
        if (!this.field3654) {
            double var6 = (double) (arg1 - this.field3666);
            double var8 = (double) (arg4 - this.field3642);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3677 = (double) this.field3668;
            this.field3647 = (double) this.field3663 * var8 / var10 + (double) this.field3642;
            this.field3670 = (double) this.field3663 * var6 / var10 + (double) this.field3666;
        }
        int var12 = -18 / ((-arg2 - 49) / 61);
        double var13 = (double) (this.field3672 + 1 - arg0);
        this.field3650 = ((double) arg1 - this.field3670) / var13;
        this.field3673 = ((double) arg4 - this.field3647) / var13;
        this.field3667 = Math.sqrt(this.field3673 * this.field3673 + this.field3650 * this.field3650);
        if (this.field3662 == -1) {
            this.field3676 = ((double) arg3 - this.field3677) / var13;
        } else {
            if (!this.field3654) {
                this.field3676 = -this.field3667 * Math.tan((double) this.field3662 * 0.02454369D);
            }
            this.field3660 = ((double) arg3 - this.field3677 - (this.field3676 * var13)) * 2.0D / (var13 * var13);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)Lgk;", line = 204)
    private final class10 method1612(int arg0) {
        field3644++;
        class158 var2 = class271.method1851(this.field3664, arg0);
        class10 var3 = var2.method1267(arg0 + 82, this.field3665, this.field3646, this.field3643);
        if (var3 == null) {
            return null;
        } else {
            var3.method78(this.field3675);
            return var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 314)
    public class219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3668 = arg4;
        this.field3672 = arg6;
        this.field3662 = arg7;
        this.field3652 = arg1;
        this.field3656 = arg9;
        this.field3654 = false;
        this.field3655 = arg5;
        this.field3666 = arg2;
        this.field3648 = arg10;
        this.field3663 = arg8;
        this.field3642 = arg3;
        this.field3664 = arg0;
        int var12 = class271.method1851(this.field3664, 0).field2793;
        if (var12 == -1) {
            this.field3653 = null;
        } else {
            this.field3653 = class346.method2428(var12, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 252)
    public static final String method1613(int arg0, boolean arg1, int arg2, int arg3) {
        field3649++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg2 != 1024) {
                method1613(-16, false, 77, 70);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - arg0 * arg3;
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }
}
