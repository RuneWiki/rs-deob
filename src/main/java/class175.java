import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class175 extends class73 {

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    private int field2798 = 0;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    private int field2807 = 0;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "Leg;")
    private class300 field2816 = null;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    private int field2797 = 0;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    private int field2796 = -1;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "Z")
    private boolean field2825 = true;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    private int field2818 = -1;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "Z")
    private boolean field2804 = false;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
    private int field2831 = -32768;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "I")
    private int field2827;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    private int field2814;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
    private int field2828;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "Luj;")
    private class141 field2809;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    private int field2822;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "I")
    private int field2829;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    private int field2801;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "[I")
    public static int[] field2812 = new int[14];

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "Z")
    public static boolean field2820 = false;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "Lwm;")
    public static class152 field2824 = class157.method1048("Gegenstand f-Ur Mitglieder", 110);

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "Ldi;")
    public static class151 field2821;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lmf;")
    private class47 field2819;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()I", line = 6)
    public final int method22() {
        field2803++;
        return this.field2831;
    }

    @OriginalMember(owner = "client!rk", name = "finalize", descriptor = "()V", line = 14)
    protected final void finalize() {
        field2810++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZB)Lv;", line = 25)
    private final class73 method1164(boolean arg0, byte arg1) {
        field2826++;
        boolean var3 = class65.field984 != class123.field1728;
        class270 var4 = class242.method1656(this.field2827, true);
        int var5 = var4.field4601;
        if (var4.field4592 != null) {
            var4 = var4.method1845(true);
        }
        if (arg1 != 17) {
            field2812 = (int[]) null;
        }
        if (var4 == null) {
            if (class217.field3516 && !var3) {
                this.method1167(false);
            }
            return null;
        }
        if (class256.field4410 != 0 && this.field2804 && (this.field2809 == null || this.field2809 != null && this.field2809.field2171 != var4.field4601)) {
            int var6 = var4.field4601;
            if (var4.field4601 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field2809 = null;
            } else {
                this.field2809 = class133.method851(var6, -25);
            }
            if (this.field2809 != null) {
                if (var4.field4610 && this.field2809.field2162 != -1) {
                    this.field2822 = (int) ((double) this.field2809.field2177.length * Math.random());
                    this.field2829 -= (int) ((double) this.field2809.field2150[this.field2822] * Math.random());
                } else {
                    this.field2822 = 0;
                    this.field2829 = class142.field2187 - 1;
                }
            }
        }
        int var7 = this.field2795 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field4618;
            var8 = var4.field4562;
        } else {
            var8 = var4.field4618;
            var9 = var4.field4562;
        }
        int var10 = this.field2802 + (var8 + 1 >> 1);
        int var11 = (var8 >> 1) + this.field2802;
        int var12 = this.field2814 + (var9 >> 1);
        int var13 = (var9 + 1 >> 1) + this.field2814;
        this.method1172(var12 * 128, var11 * 128, false);
        boolean var14 = !var3 && var4.field4587 && (this.field2796 != var4.field4604 || (this.field2822 != this.field2818 || this.field2809 != null && (this.field2809.field2151 || class58.field890) && this.field2822 != this.field2800) && class239.field3919 >= 2);
        if (arg0 && !var14) {
            return null;
        }
        int[][] var15 = class65.field984[this.field2828];
        int var16 = var15[var11][var12] + var15[var10][var13] + var15[var10][var12] + var15[var11][var13] >> 2;
        int var17 = (this.field2814 << 7) + (var9 << 6);
        int var18 = (this.field2802 << 7) + (var8 << 6);
        int[][] var19 = (int[][]) null;
        if (var3) {
            var19 = class123.field1728[0];
        } else if (this.field2828 < 3) {
            var19 = class65.field984[this.field2828 + 1];
        }
        if (class217.field3516 && var14) {
            class102.method680(this.field2816, this.field2797, this.field2798, this.field2807);
        }
        boolean var20 = this.field2816 == null;
        class189 var21;
        if (this.field2809 == null) {
            var21 = var4.method1850(var16, this.field2795, var19, var18, var17, false, var20 ? class179.field2847 : this.field2816, var15, this.field2799, var14, -108);
        } else {
            var21 = var4.method1852(this.field2799, var20 ? class179.field2847 : this.field2816, var16, var15, this.field2822, (byte) 92, var14, this.field2809, var18, this.field2800, this.field2801, this.field2795, var17, var19);
        }
        if (var21 == null) {
            return null;
        }
        if (class217.field3516 && var14) {
            int var22 = 0;
            if (var20) {
                class179.field2847 = var21.field2992;
            }
            if (this.field2828 != 0) {
                int[][] var23 = class65.field984[0];
                var22 = var16 - (var23[var11][var12] + var23[var11][var13] + var23[var10][var12] + var23[var10][var13] >> 2);
            }
            class300 var24 = var21.field2992;
            if (this.field2825 && class102.method687(var24, var18, var22, var17)) {
                this.field2825 = false;
            }
            if (!this.field2825) {
                class102.method684(var24, var18, var22, var17);
                this.field2798 = var22;
                this.field2807 = var17;
                if (var20) {
                    class179.field2847 = null;
                }
                this.field2797 = var18;
                this.field2816 = var24;
            }
            this.field2818 = this.field2822;
            this.field2796 = var4.field4604;
        }
        return var21.field2985;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 197)
    public static void method1165(int arg0) {
        field2824 = null;
        int var1 = 125 % ((-arg0 - 43) / 60);
        field2821 = null;
        field2812 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIBIII)V", line = 215)
    public static final void method1166(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var7 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg1);
        field2817++;
        int var8 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg5);
        if (arg3 != -81) {
            field2812 = (int[]) null;
        }
        int var9 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg0);
        int var10 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg6);
        int var11 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg1 + arg2);
        int var12 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg5 - arg2);
        for (int var13 = var7; var13 < var11; var13++) {
            class275.method1885(arg4, class179.field2843[var13], var9, var10, arg3 - 2530);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class275.method1885(arg4, class179.field2843[var14], var9, var10, -2611);
        }
        int var15 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg0 + arg2);
        int var16 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg6 - arg2);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class179.field2843[var17];
            class275.method1885(arg4, var18, var9, var15, -2611);
            class275.method1885(arg4, var18, var16, var10, arg3 - 2530);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIZLv;)V", line = 487)
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class73 arg8) {
        this.field2799 = arg1;
        this.field2795 = arg2;
        this.field2827 = arg0;
        this.field2802 = arg4;
        this.field2814 = arg5;
        this.field2828 = arg3;
        if (class217.field3516 && arg8 != null) {
            if ((arg8 instanceof class175)) {
                ((class175) arg8).method1167(false);
            } else {
                class270 var10 = class242.method1656(this.field2827, true);
                if (var10.field4592 != null) {
                    var10 = var10.method1845(true);
                }
                if (var10 != null) {
                    class280.method1906(this.field2795, this.field2828, this.field2799, false, 0, this.field2814, 0, var10, this.field2802);
                }
            }
        }
        if (arg6 != -1) {
            this.field2809 = class133.method851(arg6, 107);
            this.field2822 = 0;
            if (this.field2809.field2177.length <= 1) {
                this.field2800 = 0;
            } else {
                this.field2800 = 1;
            }
            this.field2829 = class142.field2187 - 1;
            this.field2801 = 1;
            if (this.field2809.field2167 == 0 && arg8 != null && arg8 instanceof class175) {
                class175 var11 = (class175) arg8;
                if (this.field2809 == var11.field2809) {
                    this.field2800 = var11.field2800;
                    this.field2829 = var11.field2829;
                    this.field2801 = var11.field2801;
                    this.field2822 = var11.field2822;
                    return;
                }
            }
            if (arg7 && this.field2809.field2162 != -1) {
                this.field2822 = (int) ((double) this.field2809.field2177.length * Math.random());
                this.field2800 = this.field2822 + 1;
                if (this.field2800 >= this.field2809.field2177.length) {
                    this.field2800 -= this.field2809.field2162;
                    if (this.field2800 < 0 || this.field2809.field2177.length <= this.field2800) {
                        this.field2800 = -1;
                    }
                }
                this.field2801 = (int) (Math.random() * (double) this.field2809.field2150[this.field2822]) + 1;
                this.field2829 = class142.field2187 - this.field2801;
            }
        }
        if (class217.field3516 && arg8 != null) {
            this.method1164(true, (byte) 17);
        }
        if (arg8 == null) {
            class270 var12 = class242.method1656(this.field2827, true);
            if (var12.field4592 != null) {
                this.field2804 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 281)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field2823++;
        class73 var13 = this.method1171(50);
        if (var13 != null) {
            var13.method21(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2819);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V", line = 314)
    public final void method20(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2813++;
        if (class217.field3516) {
            this.method1164(true, (byte) 17);
        } else {
            this.method1172(arg4, arg3, false);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V", line = 341)
    public final void method1167(boolean arg0) {
        if (this.field2816 != null) {
            class102.method680(this.field2816, this.field2797, this.field2798, this.field2807);
        }
        this.field2796 = -1;
        if (arg0) {
            this.method1172(-91, 86, false);
        }
        this.field2816 = null;
        this.field2818 = -1;
        field2806++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)V", line = 360)
    public static final void method1168(int arg0, int arg1, int arg2) {
        if (arg1 < 23) {
            return;
        }
        field2832++;
        class249.field4227[arg2] = arg0;
        class139 var3 = (class139) class183.field2901.method1586((long) arg2, -67);
        if (var3 == null) {
            class139 var4 = new class139(class76.method507(-30994) + 500L);
            class183.field2901.method1593((long) arg2, var4, 27497);
        } else {
            var3.field2118 = class76.method507(-30994) + 500L;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZZ)Lwm;", line = 388)
    public static final class152 method1169(int arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            field2821 = (class151) null;
        }
        field2815++;
        return class216.method1451(-74, 10, arg0, arg2);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)V", line = 412)
    public static final void method1170(boolean arg0) {
        if (class18.field251 == 2) {
            if (class247.field4134 == class162.field2566 && class94.field1349 == class195.field3134) {
                class18.field251 = 0;
                if (class306.field5255 && class216.field3515[81] && class160.field2556 > 2) {
                    class155.method1035(103, class160.field2556 - 2);
                } else {
                    class155.method1035(121, class160.field2556 - 1);
                }
            }
        } else if (class247.field4134 == class193.field3066 && class62.field944 == class195.field3134) {
            class18.field251 = 0;
            if (class306.field5255 && class216.field3515[81] && class160.field2556 > 2) {
                class155.method1035(122, class160.field2556 - 2);
            } else {
                class155.method1035(115, class160.field2556 - 1);
            }
        } else {
            class94.field1349 = class62.field944;
            class18.field251 = 2;
            class162.field2566 = class193.field3066;
        }
        if (arg0) {
            field2821 = (class151) null;
        }
        field2811++;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)Lv;", line = 467)
    public final class73 method1171(int arg0) {
        int var2 = 123 / ((-arg0 - 48) / 60);
        field2830++;
        return this.method1164(false, (byte) 17);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZ)V", line = 581)
    private final void method1172(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.finalize();
        }
        field2808++;
        if (this.field2809 == null) {
            return;
        }
        int var4 = class142.field2187 - this.field2829;
        if (var4 > 100 && this.field2809.field2162 > 0) {
            int var5 = this.field2809.field2177.length - this.field2809.field2162;
            while (this.field2822 < var5 && this.field2809.field2150[this.field2822] < var4) {
                var4 -= this.field2809.field2150[this.field2822];
                this.field2822++;
            }
            if (this.field2822 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field2809.field2177.length; var7++) {
                    var6 += this.field2809.field2150[var7];
                }
                var4 %= var6;
            }
            this.field2800 = this.field2822 + 1;
            if (this.field2809.field2177.length <= this.field2800) {
                this.field2800 -= this.field2809.field2162;
                if (this.field2800 < 0 || this.field2809.field2177.length <= this.field2800) {
                    this.field2800 = -1;
                }
            }
        }
        while (var4 > this.field2809.field2150[this.field2822]) {
            class18.method114(arg1, this.field2822, arg0, this.field2809, false, 28972);
            var4 -= this.field2809.field2150[this.field2822];
            this.field2822++;
            if (this.field2822 >= this.field2809.field2177.length) {
                this.field2822 -= this.field2809.field2162;
                if (this.field2822 < 0 || this.field2822 >= this.field2809.field2177.length) {
                    this.field2809 = null;
                    break;
                }
            }
            this.field2800 = this.field2822 + 1;
            if (this.field2809.field2177.length <= this.field2800) {
                this.field2800 -= this.field2809.field2162;
                if (this.field2800 < 0 || this.field2809.field2177.length <= this.field2800) {
                    this.field2800 = -1;
                }
            }
        }
        this.field2829 = class142.field2187 - var4;
        this.field2801 = var4;
    }
}
