import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class216 extends class108 {

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Z")
    private boolean field3796 = true;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    private int field3795 = -32768;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lg;")
    private class158 field3790 = null;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    private int field3792 = 0;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Z")
    private boolean field3797 = false;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    private int field3808 = -1;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    private int field3789 = 0;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    private int field3817 = -1;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    private int field3832 = 0;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    private int field3809;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    private int field3802;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field3815;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    private int field3824;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "Ldb;")
    private class182 field3813;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    private int field3812;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    private int field3800;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field3803 = 0;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "[J")
    public static long[] field3830 = new long[100];

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "Lok;")
    public static class149 field3798;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Lok;")
    public static class149 field3823;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "Llb;")
    private class208 field3825;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[I")
    public static int[] field3811;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lkk;", line = 20)
    public static final class231 method1578(int arg0, int arg1) {
        class231 var2 = (class231) class63.field1297.method1336((long) arg0, 0);
        field3799++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2754.method1192(0, 4, arg0);
        class231 var4 = new class231();
        if (var3 != null) {
            var4.method1675(-1, new class53(var3), arg0);
        }
        class63.field1297.method1331(var4, 30237, (long) arg0);
        if (arg1 > -124) {
            field3803 = -11;
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII)V", line = 52)
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field3801++;
        if (arg2 != 28193) {
            field3811 = (int[]) null;
        }
        int var7 = arg3 * arg3;
        int var8 = arg0 * arg0;
        int var9 = var8 << 1;
        class152.method1208(arg4 - arg3, arg1, arg3 + arg4, class182.field3348[arg5], -7);
        int var10 = arg0;
        int var11 = var7 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var7 + var9;
        int var14 = var8 - (var12 - 1) * var11;
        int var15 = var7 << 2;
        int var16 = ((var6 << 1) + 3) * var9;
        int var17 = ((arg0 << 1) - 3) * var11;
        int var18 = var8 << 2;
        int var19 = (var6 + 1) * var18;
        int var20 = (arg0 - 1) * var15;
        while (var10 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var19;
                    var13 += var16;
                    var19 += var18;
                    var16 += var18;
                }
            }
            var10--;
            int var21 = arg5 - var10;
            int var22 = arg5 + var10;
            if (var14 < 0) {
                var14 += var19;
                var19 += var18;
                var6++;
                var13 += var16;
                var16 += var18;
            }
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            var13 += -var20;
            class152.method1208(var24, arg1, var23, class182.field3348[var21], -7);
            var14 += -var17;
            var17 -= var15;
            var20 -= var15;
            class152.method1208(var24, arg1, var23, class182.field3348[var22], -7);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILaj;)V", line = 133)
    public static final void method1580(int arg0, class1 arg1) {
        field3806++;
        if (arg1.field93 == 0) {
            return;
        }
        class34 var2 = arg1.method15(71);
        if (arg1.field62 != -1 && arg1.field62 < 32768) {
            class102 var3 = class122.field2196[arg1.field62];
            if (var3 != null) {
                int var4 = arg1.field86 - var3.field86;
                int var5 = arg1.field79 - var3.field79;
                if (var4 != 0 || var5 != 0) {
                    arg1.field28 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field62 >= 32768) {
            int var6 = arg1.field62 - 32768;
            if (class79.field1506 == var6) {
                var6 = 2047;
            }
            class239 var7 = class96.field1780[var6];
            if (var7 != null) {
                int var8 = arg1.field79 - var7.field79;
                int var9 = arg1.field86 - var7.field86;
                if (var9 != 0 || var8 != 0) {
                    arg1.field28 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field43 != 0 || arg1.field58 != 0) && (arg1.field82 == 0 || arg1.field103 > 0)) {
            int var10 = arg1.field86 - (arg1.field43 - class112.field2058 - class112.field2058) * 64;
            int var11 = arg1.field79 - ((arg1.field58 - class12.field396 - class12.field396) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field28 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field43 = 0;
            arg1.field58 = 0;
        }
        if (arg0 <= 55) {
            field3823 = (class149) null;
        }
        int var12 = arg1.field28 - arg1.field44 & 0x7FF;
        if (var12 == 0) {
            arg1.field80 = 0;
            arg1.field31 = 0;
        } else if (var2.field770 == 0) {
            arg1.field80++;
            if (var12 > 1024) {
                arg1.field44 -= arg1.field93;
                boolean var13 = true;
                if (arg1.field93 > var12 || var12 > (2048 - arg1.field93)) {
                    var13 = false;
                    arg1.field44 = arg1.field28;
                }
                if (arg1.field25 == var2.field765 && (arg1.field80 > 25 || var13)) {
                    if (var2.field786 == -1) {
                        arg1.field25 = var2.field773;
                    } else {
                        arg1.field25 = var2.field786;
                    }
                }
            } else {
                arg1.field44 += arg1.field93;
                boolean var14 = true;
                if (arg1.field93 > var12 || (2048 - arg1.field93) < var12) {
                    arg1.field44 = arg1.field28;
                    var14 = false;
                }
                if (arg1.field25 == var2.field765 && (arg1.field80 > 25 || var14)) {
                    if (var2.field762 == -1) {
                        arg1.field25 = var2.field773;
                    } else {
                        arg1.field25 = var2.field762;
                    }
                }
            }
            arg1.field44 &= 0x7FF;
        } else {
            if (arg1.field25 == var2.field765 && arg1.field80 > 25) {
                if (var2.field762 == -1) {
                    arg1.field25 = var2.field773;
                } else {
                    arg1.field25 = var2.field762;
                }
            }
            int var15 = arg1.field28 << 5;
            if (arg1.field85 != var15) {
                arg1.field49 = 0;
                arg1.field85 = var15;
                int var16 = var15 - arg1.field90 & 0xFFFF;
                int var17 = arg1.field31 * arg1.field31 / (var2.field770 * 2);
                if (arg1.field31 > 0 && var16 >= var17 && (var16 - var17) < 32768) {
                    arg1.field15 = true;
                    arg1.field6 = var16 / 2;
                    int var18 = var2.field784 * var2.field784 / (var2.field770 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (arg1.field6 > var18) {
                        arg1.field6 = var16 - var18;
                    }
                } else if (arg1.field31 < 0 && var17 <= 65536 - var16 && (65536 - var16 - var17) < 32768) {
                    arg1.field15 = true;
                    int var19 = var2.field784 * var2.field784 / (var2.field770 * 2);
                    arg1.field6 = (65536 - var16) / 2;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field6) {
                        arg1.field6 = 65536 - var16 - var19;
                    }
                } else {
                    arg1.field15 = false;
                }
            }
            if (arg1.field31 == 0) {
                int var20 = arg1.field85 - arg1.field90 & 0xFFFF;
                if (var2.field770 <= var20) {
                    arg1.field49 = 0;
                    int var21 = var2.field784 * var2.field784 / (var2.field770 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    arg1.field15 = true;
                    if (var20 >= 32768) {
                        arg1.field6 = (65536 - var20) / 2;
                        arg1.field31 = -var2.field770;
                        if (var21 < arg1.field6) {
                            arg1.field6 = 65536 - (var20 + var21);
                        }
                    } else {
                        arg1.field31 = var2.field770;
                        arg1.field6 = var20 / 2;
                        if (var21 < arg1.field6) {
                            arg1.field6 = var20 - var21;
                        }
                    }
                } else {
                    arg1.field90 = arg1.field85;
                }
            } else if (arg1.field31 > 0) {
                if (arg1.field6 <= arg1.field49) {
                    arg1.field15 = false;
                }
                if (!arg1.field15) {
                    arg1.field31 -= var2.field770;
                    if (arg1.field31 < 0) {
                        arg1.field31 = 0;
                    }
                } else if (arg1.field31 < var2.field784) {
                    arg1.field31 += var2.field770;
                }
            } else {
                if (arg1.field49 >= arg1.field6) {
                    arg1.field15 = false;
                }
                if (!arg1.field15) {
                    arg1.field31 += var2.field770;
                    if (arg1.field31 > 0) {
                        arg1.field31 = 0;
                    }
                } else if (arg1.field31 > (-var2.field784)) {
                    arg1.field31 -= var2.field770;
                }
            }
            arg1.field90 += arg1.field31;
            if (arg1.field31 <= 0) {
                arg1.field49 -= arg1.field31;
            } else {
                arg1.field49 += arg1.field31;
            }
            arg1.field90 &= 0xFFFF;
            arg1.field44 = arg1.field90 >> 5;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BII)V", line = 412)
    private final void method1581(byte arg0, int arg1, int arg2) {
        if (arg0 != 20) {
            method1583(49, 79, (class149) null, 73);
        }
        field3793++;
        if (this.field3813 == null) {
            return;
        }
        int var4 = class8.field279 - this.field3800;
        if (var4 > 100 && this.field3813.field3350 > 0) {
            int var5 = this.field3813.field3341.length - this.field3813.field3350;
            while (var5 > this.field3807 && this.field3813.field3318[this.field3807] < var4) {
                var4 -= this.field3813.field3318[this.field3807];
                this.field3807++;
            }
            if (this.field3807 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field3813.field3341.length; var7++) {
                    var6 += this.field3813.field3318[var7];
                }
                var4 %= var6;
            }
            this.field3812 = this.field3807 + 1;
            if (this.field3813.field3341.length <= this.field3812) {
                this.field3812 -= this.field3813.field3350;
                if (this.field3812 < 0 || this.field3813.field3341.length <= this.field3812) {
                    this.field3812 = -1;
                }
            }
        }
        while (this.field3813.field3318[this.field3807] < var4) {
            class194.method1460(false, arg2, this.field3807, this.field3813, arg1, (byte) 122);
            var4 -= this.field3813.field3318[this.field3807];
            this.field3807++;
            if (this.field3807 >= this.field3813.field3341.length) {
                this.field3807 -= this.field3813.field3350;
                if (this.field3807 < 0 || this.field3807 >= this.field3813.field3341.length) {
                    this.field3813 = null;
                    break;
                }
            }
            this.field3812 = this.field3807 + 1;
            if (this.field3812 >= this.field3813.field3341.length) {
                this.field3812 -= this.field3813.field3350;
                if (this.field3812 < 0 || this.field3813.field3341.length <= this.field3812) {
                    this.field3812 = -1;
                }
            }
        }
        this.field3800 = class8.field279 - var4;
        this.field3826 = var4;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()I", line = 502)
    public final int method184() {
        field3791++;
        return this.field3795;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIZLsf;)V", line = 1229)
    public class216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class108 arg8) {
        this.field3809 = arg4;
        this.field3802 = arg0;
        this.field3814 = arg3;
        this.field3815 = arg1;
        this.field3824 = arg2;
        this.field3820 = arg5;
        if (class97.field1824 && arg8 != null) {
            if ((arg8 instanceof class216)) {
                ((class216) arg8).method1590(114);
            } else {
                class264 var10 = class252.method1808(this.field3802, (byte) 4);
                if (var10.field4760 != null) {
                    var10 = var10.method1896(-127);
                }
                if (var10 != null) {
                    class149.method1189(this.field3809, this.field3814, 0, false, var10, 0, this.field3824, this.field3820, this.field3815);
                }
            }
        }
        if (arg6 != -1) {
            this.field3813 = class131.method1033((byte) -82, arg6);
            this.field3807 = 0;
            if (this.field3813.field3341.length > 1) {
                this.field3812 = 1;
            } else {
                this.field3812 = 0;
            }
            this.field3826 = 1;
            this.field3800 = class8.field279 - 1;
            if (this.field3813.field3317 == 0 && arg8 != null && arg8 instanceof class216) {
                class216 var11 = (class216) arg8;
                if (this.field3813 == var11.field3813) {
                    this.field3800 = var11.field3800;
                    this.field3826 = var11.field3826;
                    this.field3807 = var11.field3807;
                    this.field3812 = var11.field3812;
                    return;
                }
            }
            if (arg7 && this.field3813.field3350 != -1) {
                this.field3807 = (int) ((double) this.field3813.field3341.length * Math.random());
                this.field3812 = this.field3807 + 1;
                if (this.field3813.field3341.length <= this.field3812) {
                    this.field3812 -= this.field3813.field3350;
                    if (this.field3812 < 0 || this.field3812 >= this.field3813.field3341.length) {
                        this.field3812 = -1;
                    }
                }
                this.field3826 = (int) (Math.random() * (double) this.field3813.field3318[this.field3807]) + 1;
                this.field3800 = class8.field279 - this.field3826;
            }
        }
        if (class97.field1824 && arg8 != null) {
            this.method1587(-12918, true);
        }
        if (arg8 == null) {
            class264 var12 = class252.method1808(this.field3802, (byte) 4);
            if (var12.field4760 != null) {
                this.field3797 = true;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)Lsf;", line = 515)
    public final class108 method1582(boolean arg0) {
        if (arg0) {
            this.field3790 = (class158) null;
        }
        field3821++;
        return this.method1587(-12918, false);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILok;I)Lbn;", line = 534)
    public static final class66 method1583(int arg0, int arg1, class149 arg2, int arg3) {
        field3794++;
        int var4 = 96 % ((50 - arg0) / 62);
        return class137.method1066(arg1, 25486, arg2, arg3) ? class217.method1593(68) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 547)
    public static final void method1584(int arg0) {
        class145.method1104(5, (byte) 126);
        field3822++;
        class153.method1211(2, 5);
        class192.method1452(5, -64);
        class68.method597((byte) 47, 5);
        class215.method1577(5, 0);
        class261.method1866(5, (byte) -126);
        class24.method215((byte) -110, 5);
        class174.method1351(5, 28);
        class304.method2151((byte) 37, 5);
        class251.method1805(110, 5);
        class322.method2266(false, 5);
        class174.method1353(222, 5);
        class189.method1441((byte) 85, 5);
        class240.method1725(4225, 5);
        class126.method1010(-20387, 5);
        class169.method1320(95, 50);
        class108.method897(5, (byte) -102);
        class224.method1646((byte) 99, 5);
        class1.field97.method1339(5, 19326);
        class91.field1715.method1339(5, 19326);
        if (arg0 > -89) {
            field3804 = -17;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V", line = 587)
    public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class97.field1824) {
            this.method1587(-12918, true);
        } else {
            this.method1581((byte) 20, arg4, arg3);
        }
        field3819++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIIJILlb;)V", line = 611)
    public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10) {
        field3810++;
        class108 var13 = this.method1582(false);
        if (var13 != null) {
            var13.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3825);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([[[Lpl;IBIIZ)Z", line = 641)
    public static final boolean method1585(class191[][][] arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 < 78) {
            return false;
        }
        field3827++;
        byte var6 = arg5 ? 1 : (byte) (class59.field1239 & 0xFF);
        if (class50.field1042[class287.field5134][arg1][arg4] == var6) {
            return false;
        } else if ((class257.field4573[class287.field5134][arg1][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class105.field1986[var7] = arg1;
            int var8 = 0;
            int var31 = var7 + 1;
            class211.field3709[var7] = arg4;
            class50.field1042[class287.field5134][arg1][arg4] = var6;
            while (var31 != var8) {
                int var9 = class105.field1986[var8] & 0xFFFF;
                int var10 = (class105.field1986[var8] & 0xFFD818) >> 16;
                int var11 = class105.field1986[var8] >> 24 & 0xFF;
                int var12 = class211.field3709[var8] & 0xFFFF;
                boolean var13 = false;
                boolean var14 = false;
                if ((class257.field4573[class287.field5134][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                int var15 = (class211.field3709[var8] & 0xFF52F2) >> 16;
                label245: for (int var16 = class287.field5134 + 1; var16 <= 3; var16++) {
                    if ((class257.field4573[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field3439 != null) {
                                int var17 = class279.method2001(var10, 1);
                                if (arg0[var16][var9][var12].field3439.field533 == var17 || arg0[var16][var9][var12].field3439.field521 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class279.method2001(var11, 1);
                                    if (arg0[var16][var9][var12].field3439.field533 == var18 || arg0[var16][var9][var12].field3439.field521 == var18) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var19 = class279.method2001(var15, 1);
                                    if (arg0[var16][var9][var12].field3439.field533 == var19 || arg0[var16][var9][var12].field3439.field521 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var12].field3455 != null) {
                                for (int var20 = 0; var20 < arg0[var16][var9][var12].field3451; var20++) {
                                    int var21 = (int) (arg0[var16][var9][var12].field3455[var20].field546 >> 20 & 0x3L);
                                    int var22 = (int) (arg0[var16][var9][var12].field3455[var20].field546 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = var21 << 6 | var22;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var15 != 0 && var15 == var23) {
                                        continue label245;
                                    }
                                }
                            }
                        }
                        class191 var24 = arg0[var16][var9][var12];
                        if (var24 != null && var24.field3451 > 0) {
                            for (int var25 = 0; var25 < var24.field3451; var25++) {
                                class18 var26 = var24.field3455[var25];
                                if (var26.field562 != var26.field560 || var26.field564 != var26.field556) {
                                    for (int var27 = var26.field560; var27 <= var26.field562; var27++) {
                                        for (int var28 = var26.field564; var28 <= var26.field556; var28++) {
                                            class50.field1042[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class50.field1042[var16][var9][var12] = var6;
                        var13 = true;
                    }
                }
                var8 = var8 + 1 & 0xFFF;
                if (var13) {
                    int var29 = var9 << 7;
                    int var30 = var12 << 7;
                    if (class165.field2970[class287.field5134 + 1][var9][var12] > class73.field1441[arg3]) {
                        class73.field1441[arg3] = class165.field2970[class287.field5134 + 1][var9][var12];
                    }
                    if (class323.field5648[arg3] > var29) {
                        class323.field5648[arg3] = var29;
                    } else if (var29 > class182.field3351[arg3]) {
                        class182.field3351[arg3] = var29;
                    }
                    if (var30 < class142.field2582[arg3]) {
                        class142.field2582[arg3] = var30;
                    } else if (class75.field1474[arg3] < var30) {
                        class75.field1474[arg3] = var30;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class50.field1042[class287.field5134][var9 - 1][var12] != var6) {
                        class105.field1986[var31] = class301.method2139(class301.method2139(1179648, var9 - 1), -754974720);
                        class211.field3709[var31] = class301.method2139(1245184, var12);
                        class50.field1042[class287.field5134][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class50.field1042[class287.field5134][var9 - 1][var12] != var6 && (class257.field4573[class287.field5134][var9][var12] & 0x4) == 0 && (class257.field4573[class287.field5134][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class105.field1986[var31] = class301.method2139(1375731712, class301.method2139(1179648, var9 - 1));
                            class211.field3709[var31] = class301.method2139(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field1042[class287.field5134][var9 - 1][var12] = var6;
                        }
                        if (class50.field1042[class287.field5134][var9][var12] != var6) {
                            class105.field1986[var31] = class301.method2139(318767104, class301.method2139(var9, 5373952));
                            class211.field3709[var31] = class301.method2139(5439488, var12);
                            class50.field1042[class287.field5134][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class50.field1042[class287.field5134][var9 + 1][var12] != var6 && (class257.field4573[class287.field5134][var9][var12] & 0x4) == 0 && (class257.field4573[class287.field5134][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class105.field1986[var31] = class301.method2139(-1845493760, class301.method2139(5373952, var9 + 1));
                            class211.field3709[var31] = class301.method2139(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field1042[class287.field5134][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < 104 && class50.field1042[class287.field5134][var9 + 1][var12] != var6) {
                        class105.field1986[var31] = class301.method2139(1392508928, class301.method2139(var9 + 1, 9568256));
                        class211.field3709[var31] = class301.method2139(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class50.field1042[class287.field5134][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class50.field1042[class287.field5134][var9 - 1][var12] != var6 && (class257.field4573[class287.field5134][var9][var12] & 0x4) == 0 && (class257.field4573[class287.field5134][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class105.field1986[var31] = class301.method2139(301989888, class301.method2139(var9 - 1, 13762560));
                            class211.field3709[var31] = class301.method2139(13828096, var12);
                            class50.field1042[class287.field5134][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class50.field1042[class287.field5134][var9][var12] != var6) {
                            class105.field1986[var31] = class301.method2139(-1828716544, class301.method2139(13762560, var9));
                            class211.field3709[var31] = class301.method2139(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class50.field1042[class287.field5134][var9][var12] = var6;
                        }
                        if ((var9 + 1) < 104 && class50.field1042[class287.field5134][var9 + 1][var12] != var6 && (class257.field4573[class287.field5134][var9][var12] & 0x4) == 0 && (class257.field4573[class287.field5134][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class105.field1986[var31] = class301.method2139(class301.method2139(9568256, var9 + 1), -771751936);
                            class211.field3709[var31] = class301.method2139(var12, 9633792);
                            class50.field1042[class287.field5134][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class73.field1441[arg3] != -1000000) {
                class73.field1441[arg3] += 10;
                class323.field5648[arg3] -= 50;
                class182.field3351[arg3] += 50;
                class75.field1474[arg3] += 50;
                class142.field2582[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 950)
    public static void method1586(byte arg0) {
        field3823 = null;
        field3830 = null;
        if (arg0 == 70) {
            field3798 = null;
            field3811 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IZ)Lsf;", line = 970)
    private final class108 method1587(int arg0, boolean arg1) {
        field3829++;
        if (arg0 != -12918) {
            return (class108) null;
        }
        boolean var3 = class255.field4550 != class165.field2970;
        class264 var4 = class252.method1808(this.field3802, (byte) 4);
        int var5 = var4.field4698;
        if (var4.field4760 != null) {
            var4 = var4.method1896(127);
        }
        if (var4 == null) {
            if (class97.field1824 && !var3) {
                this.method1590(122);
            }
            return null;
        }
        if (class214.field3764 != 0 && this.field3797 && (this.field3813 == null || this.field3813 != null && this.field3813.field3320 != var4.field4698)) {
            int var6 = var4.field4698;
            if (var4.field4698 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field3813 = null;
            } else {
                this.field3813 = class131.method1033((byte) -82, var6);
            }
            if (this.field3813 != null) {
                if (var4.field4701 && this.field3813.field3350 != -1) {
                    this.field3807 = (int) (Math.random() * (double) this.field3813.field3341.length);
                    this.field3800 -= (int) ((double) this.field3813.field3318[this.field3807] * Math.random());
                } else {
                    this.field3807 = 0;
                    this.field3800 = class8.field279 - 1;
                }
            }
        }
        int var7 = this.field3824 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field4733;
            var8 = var4.field4766;
        } else {
            var8 = var4.field4733;
            var9 = var4.field4766;
        }
        int var10 = this.field3809 + (var9 >> 1);
        int var11 = (var9 + 1 >> 1) + this.field3809;
        int var12 = this.field3820 + (var8 + 1 >> 1);
        int var13 = (var8 >> 1) + this.field3820;
        this.method1581((byte) 20, var13 * 128, var10 * 128);
        boolean var14 = !var3 && var4.field4715 && (this.field3808 != var4.field4727 || (this.field3817 != this.field3807 || this.field3813 != null && (this.field3813.field3337 || class293.field5234) && this.field3812 != this.field3807) && class171.field3086 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int var15 = (this.field3820 << 7) + (var8 << 6);
        int[][] var16 = class165.field2970[this.field3814];
        int var17 = (this.field3809 << 7) + (var9 << 6);
        int var18 = var16[var10][var13] + var16[var11][var12] + var16[var10][var12] + var16[var11][var13] >> 2;
        int[][] var19 = (int[][]) null;
        if (var3) {
            var19 = class255.field4550[0];
        } else if (this.field3814 < 3) {
            var19 = class165.field2970[this.field3814 + 1];
        }
        if (class97.field1824 && var14) {
            class160.method1267(this.field3790, this.field3832, this.field3789, this.field3792);
        }
        boolean var20 = this.field3790 == null;
        class192 var21;
        if (this.field3813 == null) {
            var21 = var4.method1886(var14, this.field3824, -13359, var16, var17, false, this.field3815, var20 ? class247.field4389 : this.field3790, var18, var15, var19);
        } else {
            var21 = var4.method1899(this.field3815, var19, (byte) -96, this.field3824, var14, this.field3812, this.field3813, this.field3807, var16, this.field3826, var17, var15, var20 ? class247.field4389 : this.field3790, var18);
        }
        if (var21 == null) {
            return null;
        }
        if (class97.field1824 && var14) {
            if (var20) {
                class247.field4389 = var21.field3465;
            }
            int var22 = 0;
            if (this.field3814 != 0) {
                int[][] var23 = class165.field2970[0];
                var22 = var18 - (var23[var10][var12] + var23[var11][var13] + var23[var10][var13] + var23[var11][var12] >> 2);
            }
            class158 var24 = var21.field3465;
            if (this.field3796 && class160.method1269(var24, var17, var22, var15)) {
                this.field3796 = false;
            }
            if (!this.field3796) {
                class160.method1263(var24, var17, var22, var15);
                if (var20) {
                    class247.field4389 = null;
                }
                this.field3792 = var15;
                this.field3789 = var22;
                this.field3832 = var17;
                this.field3790 = var24;
            }
            this.field3817 = this.field3807;
            this.field3808 = var4.field4727;
        }
        return var21.field3474;
    }

    @OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V", line = 1139)
    protected final void finalize() {
        field3805++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIIII)V", line = 1159)
    public static final void method1588(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class298.field5284 = -1;
        if (arg0) {
            field3798 = (class149) null;
        }
        class265.field4776 = class121.field2180 * arg4 / arg2;
        class276.field4901 = -1;
        class298.field5282 = class166.field3007 * arg1 / arg3;
        class239.method1717(-2984);
        field3816++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIZ)V", line = 1175)
    public static final void method1589(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3831++;
        if (class140.field2554 == 1) {
            class139.field2532[class312.field5514 / 100].method584(class185.field3396 - 8, class200.field3578 - 8);
        }
        if (class140.field2554 == 2) {
            class139.field2532[class312.field5514 / 100 + 4].method584(class185.field3396 - 8, class200.field3578 + -8);
        }
        class274.method1944(3072);
        if (arg4) {
            method1588(true, 122, -109, 104, 44);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 1202)
    public final void method1590(int arg0) {
        if (arg0 < 39) {
            field3811 = (int[]) null;
        }
        field3828++;
        if (this.field3790 != null) {
            class160.method1267(this.field3790, this.field3832, this.field3789, this.field3792);
        }
        this.field3808 = -1;
        this.field3790 = null;
        this.field3817 = -1;
    }
}
