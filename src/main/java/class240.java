import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class240 extends class232 {

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    private int field3811 = 0;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    private int field3814 = 0;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    private int field3812 = -1;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    private int field3794 = -1;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "Z")
    private boolean field3809 = false;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    private int field3813 = 0;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "Z")
    private boolean field3829 = true;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Lag;")
    private class123 field3825 = null;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    private int field3827 = -32768;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    private int field3797;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3796;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    private int field3817;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field3792;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    private int field3808;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    private int field3821;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "Lv;")
    private class80 field3819;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field3807 = 0;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "[I")
    public static int[] field3828 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "Ltl;")
    public static class222 field3799 = new class222(64);

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Lva;")
    public static class156 field3793;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "Lll;")
    private class167 field3823;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lea;")
    public static class217 field3791;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "[Ltf;")
    public static class271[] field3822;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()I", line = 15)
    public final int method152() {
        field3818++;
        return this.field3827;
    }

    @OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V", line = 28)
    protected final void finalize() {
        field3804++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)I", line = 35)
    public static final int method1699(int arg0, int arg1) {
        field3824++;
        return arg1 <= 24 ? 51 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIIIZLh;)V", line = 543)
    public class240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class232 arg8) {
        this.field3810 = arg1;
        this.field3797 = arg5;
        this.field3796 = arg4;
        this.field3817 = arg3;
        this.field3820 = arg2;
        this.field3792 = arg0;
        if (arg8 != null) {
            this.field3809 = true;
            if (arg8 instanceof class240) {
                class240 var10 = (class240) arg8;
                if (class186.field2991) {
                    var10.method1701(1);
                }
                this.field3808 = var10.field3808;
                this.field3821 = var10.field3821;
                this.field3803 = var10.field3803;
                this.field3819 = var10.field3819;
                this.field3816 = var10.field3816;
            } else if (class186.field2991) {
                class149 var11 = class291.method2043(this.field3792, 23006);
                if (var11.field2223 != null) {
                    var11 = var11.method1052(true);
                }
                if (var11 != null) {
                    class288.method2022(this.field3797, var11, this.field3817, this.field3810, this.field3820, this.field3796, 0, true, 0);
                }
            }
        }
        if (this.field3809) {
            this.method1702(arg6, 61);
        }
        if (class186.field2991 && arg8 != null) {
            this.method1700(true, true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZZ)Lh;", line = 58)
    private final class232 method1700(boolean arg0, boolean arg1) {
        field3802++;
        boolean var3 = class94.field1450 != class84.field1282;
        class149 var4 = class291.method2043(this.field3792, 23006);
        if (var4.field2223 != null) {
            var4 = var4.method1052(true);
        }
        if (var4 == null) {
            if (class186.field2991 && !var3) {
                this.method1701(1);
            }
            this.field3794 = this.field3803;
            this.field3812 = -1;
            return null;
        }
        if (!this.field3809 && this.field3812 != var4.field2299) {
            this.method1702(-1, 17);
        }
        int var5 = this.field3820 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field2278;
            var6 = var4.field2253;
        } else {
            var6 = var4.field2278;
            var7 = var4.field2253;
        }
        int var8 = (var7 >> 1) + this.field3796;
        int var9 = (var7 + 1 >> 1) + this.field3796;
        int var10 = (var6 >> 1) + this.field3797;
        int var11 = (var6 + 1 >> 1) + this.field3797;
        this.method1704(var10 * 128, var8 * 128, 0);
        boolean var12 = !var3 && var4.field2267 && (this.field3812 != var4.field2299 || (this.field3803 != this.field3794 || this.field3819 != null && (this.field3819.field1204 || class218.field3506) && this.field3816 != this.field3803) && class17.field227 >= 2);
        if (arg0 && !var12) {
            this.field3812 = var4.field2299;
            this.field3794 = this.field3803;
            return null;
        }
        int[][] var13 = class84.field1282[this.field3817];
        int var14 = (this.field3796 << 7) + (var7 << 6);
        int var15 = var13[var8][var11] + var13[var9][var11] + var13[var8][var10] + var13[var9][var10] >> 2;
        int[][] var16 = (int[][]) null;
        int var17 = (this.field3797 << 7) + (var6 << 6);
        if (var3) {
            var16 = class94.field1450[0];
        } else if (this.field3817 < 3) {
            var16 = class84.field1282[this.field3817 + 1];
        }
        if (class186.field2991 && var12) {
            class32.method207(this.field3825, this.field3813, this.field3814, this.field3811);
        }
        boolean var18 = this.field3825 == null;
        if (!arg1) {
            this.field3792 = -98;
        }
        class266 var19;
        if (this.field3819 == null) {
            var19 = var4.method1046(var18 ? class204.field3338 : this.field3825, var13, var16, this.field3820, var17, false, var14, -42, var15, var12, this.field3810);
        } else {
            var19 = var4.method1047(var13, var15, this.field3810, var16, this.field3819, var14, var18 ? class204.field3338 : this.field3825, this.field3803, this.field3816, this.field3820, var17, this.field3808, (byte) -127, var12);
        }
        if (var19 == null) {
            this.field3812 = var4.field2299;
            this.field3794 = this.field3803;
            return null;
        }
        if (class186.field2991 && var12) {
            if (var18) {
                class204.field3338 = var19.field4198;
            }
            int var20 = 0;
            if (this.field3817 != 0) {
                int[][] var21 = class84.field1282[0];
                var20 = var15 - (var21[var8][var10] + var21[var8][var11] - (-var21[var9][var10] + -var21[var9][var11]) >> 2);
            }
            class123 var22 = var19.field4198;
            if (this.field3829 && class32.method210(var22, var14, var20, var17)) {
                this.field3829 = false;
            }
            if (!this.field3829) {
                class32.method205(var22, var14, var20, var17);
                this.field3825 = var22;
                this.field3813 = var14;
                this.field3811 = var17;
                if (var18) {
                    class204.field3338 = null;
                }
                this.field3814 = var20;
            }
        }
        this.field3812 = var4.field2299;
        this.field3794 = this.field3803;
        return var19.field4194;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 207)
    public final void method1701(int arg0) {
        if (this.field3825 != null) {
            class32.method207(this.field3825, this.field3813, this.field3814, this.field3811);
            this.field3825 = null;
        }
        if (arg0 == 1) {
            field3805++;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)V", line = 224)
    private final void method1702(int arg0, int arg1) {
        field3806++;
        int var3 = arg0;
        boolean var4 = false;
        int var5 = 125 % ((-arg1 - 59) / 55);
        if (arg0 == -1) {
            class149 var6 = class291.method2043(this.field3792, 23006);
            class149 var7 = var6;
            if (var6.field2223 != null) {
                var6 = var6.method1052(true);
            }
            if (var6 == null) {
                return;
            }
            if (var6 == var7) {
                var7 = null;
            }
            if (var6.field2237 != null) {
                if (this.field3819 != null && var6.method1042(this.field3819.field1221, 114)) {
                    return;
                }
                var3 = var6.method1038((byte) 109);
                if (this.field3812 != var6.field2299) {
                    var4 = var6.field2236;
                }
            } else if (var6.field2304 == -1) {
                if (var7 != null && var7.field2237 != null) {
                    if (this.field3819 != null && var7.method1042(this.field3819.field1221, 118)) {
                        return;
                    }
                    var3 = var7.method1038((byte) -119);
                    if (this.field3812 != var7.field2299) {
                        var4 = var7.field2236;
                    }
                } else if (var7 != null && var7.field2304 != -1 && this.field3812 != var7.field2299) {
                    var4 = var7.field2236;
                    var3 = var7.field2304;
                }
            } else if (this.field3812 != var6.field2299) {
                var3 = var6.field2304;
                var4 = var6.field2236;
            }
        }
        if (var3 == -1) {
            this.field3819 = null;
            return;
        }
        if (this.field3819 == null || this.field3819.field1221 != var3) {
            this.field3819 = class37.method236(var3, 20254);
        } else if (this.field3819.field1207 == 0) {
            return;
        }
        if (var4) {
            this.field3803 = (int) (Math.random() * (double) this.field3819.field1209.length);
            this.field3808 = (int) ((double) this.field3819.field1223[this.field3803] * Math.random()) + 1;
        } else {
            this.field3808 = 1;
            this.field3803 = 0;
        }
        this.field3816 = this.field3803 + 1;
        if (this.field3816 < 0 || this.field3816 >= this.field3819.field1209.length) {
            this.field3816 = -1;
        }
        this.field3821 = class48.field648 - this.field3808;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIIJILll;)V", line = 342)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class167 arg10) {
        field3790++;
        class232 var13 = this.method1705((byte) 35);
        if (var13 != null) {
            var13.method153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3823);
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 360)
    public static void method1703(int arg0) {
        field3791 = null;
        if (arg0 != -1) {
            method1703(-86);
        }
        field3822 = null;
        field3828 = null;
        field3799 = null;
        field3793 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V", line = 380)
    private final void method1704(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return;
        }
        field3801++;
        label96: while (true) {
            if (this.field3819 == null) {
                if (this.field3809) {
                    return;
                }
                this.method1702(-1, 40);
                if (this.field3819 == null) {
                    return;
                }
            }
            int var4 = class48.field648 - this.field3821;
            if (var4 > 100 && this.field3819.field1196 > 0) {
                int var5 = this.field3819.field1209.length - this.field3819.field1196;
                while (this.field3803 < var5 && var4 > this.field3819.field1223[this.field3803]) {
                    var4 -= this.field3819.field1223[this.field3803];
                    this.field3803++;
                }
                if (var5 <= this.field3803) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3819.field1209.length; var7++) {
                        var6 += this.field3819.field1223[var7];
                    }
                    var4 %= var6;
                }
                this.field3816 = this.field3803 + 1;
                if (this.field3816 >= this.field3819.field1209.length) {
                    this.field3816 -= this.field3819.field1196;
                    if (this.field3816 < 0 || this.field3816 >= this.field3819.field1209.length) {
                        this.field3816 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3819.field1223[this.field3803] >= var4) {
                            this.field3821 = class48.field648 - var4;
                            this.field3808 = var4;
                            return;
                        }
                        class253.method1789(arg2 + 19080, arg0, this.field3819, this.field3803, arg1, false);
                        var4 -= this.field3819.field1223[this.field3803];
                        this.field3803++;
                        if (this.field3819.field1209.length <= this.field3803) {
                            this.field3803 -= this.field3819.field1196;
                            if (this.field3803 < 0 || this.field3819.field1209.length <= this.field3803) {
                                this.field3819 = null;
                                continue label96;
                            }
                        }
                        this.field3816 = this.field3803 + 1;
                    } while (this.field3819.field1209.length > this.field3816);
                    this.field3816 -= this.field3819.field1196;
                } while (this.field3816 >= 0 && this.field3816 < this.field3819.field1209.length);
                this.field3816 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Lh;", line = 483)
    public final class232 method1705(byte arg0) {
        field3826++;
        if (arg0 != 35) {
            method1699(58, 101);
        }
        return this.method1700(false, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V", line = 497)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class186.field2991) {
            this.method1700(true, true);
        } else {
            this.method1704(arg4, arg3, 0);
        }
        field3795++;
    }
}
