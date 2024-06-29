import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class113 extends class269 {

    @OriginalMember(owner = "client!on", name = "y", descriptor = "Lfu;")
    private class171 field1598;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "[[I")
    public int[][] field1596;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "[[B")
    private byte[][] field1600;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "[[B")
    private byte[][] field1599;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "[[Lse;")
    private class17[][] field1581;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "[[Lre;")
    private class424[][] field1587;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "[[Lak;")
    private class469[][] field1584;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "[[Lkr;")
    private class483[][] field1591;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(II)V")
    public final void method698(int arg0, int arg1) {
        class451 var3 = this.field1598.method1114(Thread.currentThread());
        var3.field6197.field4000 = 0;
        if (this.field1591 != null) {
            this.method711(arg0, arg1, this.field1598.field2503, var3.field6197, var3.field6215, var3.field6206, var3.field6222);
        } else {
            if (this.field1581 != null) {
                this.method709(arg0, arg1, var3.field6197, var3.field6215, var3.field6206, var3.field6222);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(II)I")
    private static final int method699(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Lmr;IIIIZ)Z")
    public final boolean method700(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
    public final int method701(int arg0, int arg1) {
        int var3 = arg0 >> this.field1586;
        int var4 = arg1 >> this.field1586;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3729 - 1 && var4 <= super.field3728 - 1) {
            int var5 = arg0 & this.field1592 - 1;
            int var6 = arg1 & this.field1592 - 1;
            int var7 = (this.field1592 - var5) * this.field1596[var3][var4] + this.field1596[var3 + 1][var4] * var5 >> this.field1586;
            int var8 = (this.field1592 - var5) * this.field1596[var3][var4 + 1] + this.field1596[var3 + 1][var4 + 1] * var5 >> this.field1586;
            return (this.field1592 - var6) * var7 + var6 * var8 >> this.field1586;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILmr;)Lmr;")
    public final class173 method702(int arg0, int arg1, class173 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III[[ZZ)V")
    public final void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class428 var6 = this.field1598.field2525;
        this.field1579 = var6.field5899;
        this.field1582 = var6.field5907;
        this.field1589 = var6.field5906;
        this.field1595 = var6.field5897;
        this.field1593 = var6.field5905;
        this.field1597 = var6.field5908;
        this.field1588 = var6.field5900;
        this.field1590 = var6.field5904;
        this.field1583 = var6.field5898;
        this.field1594 = var6.field5903;
        this.field1585 = var6.field5901;
        this.field1580 = var6.field5902;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
    public final void method704(int arg0, int arg1, int arg2) {
        if (this.field1599[arg0][arg1] < arg2) {
            this.field1599[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lmr;IIIIZ)V")
    public final void method705(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIII[[ZLdb;[I[I)V")
    private final void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class291 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3998 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1591[var16][var17] != null) {
                        class483 var18 = this.field1591[var16][var17];
                        if (var18.field6809 != -1 && (var18.field6805 & 2) == 0 && var18.field6811 == 0) {
                            int var19 = this.field1598.method1146(var18.field6809);
                            arg8.method1802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class231.method1449(4096, var18.field6806, var19), class231.method1449(4096, var18.field6804, var19), class231.method1449(4096, var18.field6812, var19));
                            arg8.method1802(var15, var15, var15 - var13, var14, var13 + var14, var14, class231.method1449(4096, var18.field6808, var19), class231.method1449(4096, var18.field6812, var19), class231.method1449(4096, var18.field6804, var19));
                        } else if (var18.field6811 == 0) {
                            arg8.method1801(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6806, var18.field6804, var18.field6812);
                            arg8.method1801(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6808, var18.field6812, var18.field6804);
                        } else {
                            int var20 = var18.field6811;
                            arg8.method1801(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class309.method1865(-125, var20, var18.field6806 & -16777216), class309.method1865(-123, var20, var18.field6804 & -16777216), class309.method1865(-66, var20, var18.field6812 & -16777216));
                            arg8.method1801(var15, var15, var15 - var13, var14, var13 + var14, var14, class309.method1865(-109, var20, var18.field6808 & -16777216), class309.method1865(-72, var20, var18.field6812 & -16777216), class309.method1865(-43, var20, var18.field6804 & -16777216));
                        }
                    } else if (this.field1587[var16][var17] != null) {
                        class424 var21 = this.field1587[var16][var17];
                        for (int var22 = 0; var22 < var21.field5826; ++var22) {
                            arg9[var22] = (var21.field5823[var22] - this.field1592 * var16) * var13 / this.field1592 + var14;
                            arg10[var22] = var15 - (var21.field5824[var22] - this.field1592 * var17) * var13 / this.field1592;
                        }
                        for (int var23 = 0; var23 < var21.field5819; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5828 != null && var21.field5828[var23] != 0 && (var21.field5825 == null || var21.field5825 != null && var21.field5825[var23] == -1)) {
                                int var33 = var21.field5828[var23];
                                arg8.method1801(var30, var31, var32, var27, var28, var29, class309.method1865(-120, var33, -16777216 - (var21.field5820[var24] & -16777216)), class309.method1865(-69, var33, -16777216 - (var21.field5820[var25] & -16777216)), class309.method1865(-52, var33, -16777216 - (var21.field5820[var26] & -16777216)));
                            } else if (var21.field5825 != null && var21.field5825[var23] != -1) {
                                int var34 = this.field1598.method1146(var21.field5825[var23]);
                                arg8.method1802(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method1801(var30, var31, var32, var27, var28, var29, var21.field5820[var24], var21.field5820[var25], var21.field5820[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3998 = true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
    public final void method707() {
        this.field1600 = null;
        this.field1599 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method708(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1591 == null) {
            this.field1591 = new class483[super.field3729][super.field3728];
            this.field1587 = new class424[super.field3729][super.field3728];
        } else if (this.field1581 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class197.field2807[class314.method1897(-1433933209, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class197.field2807[class314.method1897(-1433933209, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == this.field1592 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == this.field1592 && arg4[var22] == this.field1592) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == this.field1592) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + this.field1592 != arg2[var24] && arg2[0] - this.field1592 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + this.field1592 != arg4[var24] && arg4[0] - this.field1592 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class483 var25 = new class483();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6811 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6805 = (byte) (var25.field6805 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1596[arg0 + 1][arg1] == this.field1596[arg0][arg1] && this.field1596[arg0 + 1][arg1 + 1] == this.field1596[arg0][arg1] && this.field1596[arg0][arg1 + 1] == this.field1596[arg0][arg1]) {
                    var25.field6805 = (byte) (var25.field6805 | 1);
                }
                if (var27 != -1 && (var25.field6805 & 2) == 0 && !this.field1598.field6863.method1218(var27, false).field2739) {
                    var25.field6808 = this.field1600[arg0][arg1] - this.field1599[arg0][arg1];
                    var25.field6812 = this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1];
                    var25.field6806 = this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1];
                    var25.field6804 = this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1];
                    var25.field6809 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field6808 = class464.method2739(arg10, method699(arg6[var18] >> 8, this.field1600[arg0][arg1] - this.field1599[arg0][arg1]), 0, var28);
                    if (var25.field6811 != 0) {
                        var25.field6808 |= 255 - (this.field1600[arg0][arg1] - this.field1599[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field6812 = class464.method2739(arg10, method699(arg6[var19] >> 8, this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1]), 0, var29);
                    if (var25.field6811 != 0) {
                        var25.field6812 |= 255 - (this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field6806 = class464.method2739(arg10, method699(arg6[var20] >> 8, this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1]), 0, var30);
                    if (var25.field6811 != 0) {
                        var25.field6806 |= 255 - (this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field6804 = class464.method2739(arg10, method699(arg6[var21] >> 8, this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1]), 0, var31);
                    if (var25.field6811 != 0) {
                        var25.field6804 |= 255 - (this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6809 = -1;
                }
                if (arg5 != null) {
                    var25.field6807 = (short) arg5[var20];
                    var25.field6810 = (short) arg5[var21];
                    var25.field6813 = (short) arg5[var19];
                    var25.field6803 = (short) arg5[var18];
                }
                this.field1591[arg0][arg1] = var25;
            } else {
                class424 var32 = new class424();
                var32.field5826 = (short) arg2.length;
                var32.field5819 = (short) (arg2.length / 3);
                var32.field5823 = new short[var32.field5826];
                var32.field5821 = new short[var32.field5826];
                var32.field5824 = new short[var32.field5826];
                var32.field5820 = new int[var32.field5826];
                if (arg5 != null) {
                    var32.field5827 = new short[var32.field5826];
                }
                for (int var33 = 0; var33 < var32.field5826; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1600[arg0][arg1] - this.field1599[arg0][arg1];
                    } else if (var48 == 0 && this.field1592 == var49) {
                        var51 = this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1];
                    } else if (this.field1592 == var48 && this.field1592 == var49) {
                        var51 = this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1];
                    } else if (this.field1592 == var48 && var49 == 0) {
                        var51 = this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1]) * var48 + (this.field1600[arg0][arg1] - this.field1599[arg0][arg1]) * (this.field1592 - var48);
                        int var53 = (this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1]) * var48 + (this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1]) * (this.field1592 - var48);
                        var51 = (this.field1592 - var49) * var52 + var49 * var53 >> this.field1586 * 2;
                    }
                    short var54 = (short) ((arg0 << this.field1586) + var48);
                    short var55 = (short) ((arg1 << this.field1586) + var49);
                    var32.field5823[var33] = var54;
                    var32.field5824[var33] = var55;
                    var32.field5821[var33] = (short) (this.method701(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1598.field6863.method1218(arg8[var33], false).field2739) {
                        var32.field5820[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field5820[var33] = var51 << 25;
                        } else {
                            var32.field5820[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field5827[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field5820[var33] = class464.method2739(arg10, method699(arg6[var33] >> 8, var51), 0, var56);
                        if (arg7 != null) {
                            var32.field5820[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field5819; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1598.field6863.method1218(arg8[var35 * 3], false).field2739) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field5828 = new int[var32.field5819];
                }
                if (var34) {
                    var32.field5825 = new short[var32.field5819];
                    var32.field5822 = new short[var32.field5819];
                }
                for (int var36 = 0; var36 < var32.field5819; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field5828[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1598.field6863.method1218(var42, false).field2739) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1598.field6863.method1218(var43, false).field2739) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1598.field6863.method1218(var44, false).field2739) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field5825[var36] = (short) var44;
                            var32.field5822[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1598.field6863.method1218(var45, false).field2739) {
                                    var32.field5820[var37] = class197.field2807[class314.method1897(-1433933209, this.field1598.field6863.method1218(var45, false).field2732 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1598.field6863.method1218(var46, false).field2739) {
                                    var32.field5820[var38] = class197.field2807[class314.method1897(-1433933209, this.field1598.field6863.method1218(var46, false).field2732 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1598.field6863.method1218(var47, false).field2739) {
                                    var32.field5820[var39] = class197.field2807[class314.method1897(-1433933209, this.field1598.field6863.method1218(var47, false).field2732 & 65535) & 65535];
                                }
                            }
                            var32.field5825[var36] = -1;
                        }
                    }
                }
                this.field1587[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILdb;[I[I[I)V")
    private final void method709(int arg0, int arg1, class291 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class17 var7 = this.field1581[arg0][arg1];
        if (var7 != null) {
            if ((var7.field288 & 2) == 0) {
                int var8 = this.field1592 * arg0;
                int var9 = this.field1592 + var8;
                int var10 = this.field1592 * arg1;
                int var11 = this.field1592 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field288 & 1) != 0) {
                    int var12 = this.field1596[arg0][arg1];
                    int var13 = this.field1594 * var12;
                    var14 = (this.field1585 * var10 + this.field1583 * var8 + var13 >> 15) + this.field1580;
                    if (var14 <= this.field1598.field2539) {
                        return;
                    }
                    var15 = (this.field1585 * var10 + this.field1583 * var9 + var13 >> 15) + this.field1580;
                    if (var15 <= this.field1598.field2539) {
                        return;
                    }
                    int var16 = (this.field1585 * var11 + this.field1583 * var9 + var13 >> 15) + this.field1580;
                    if (var16 <= this.field1598.field2539) {
                        return;
                    }
                    var17 = (this.field1585 * var11 + this.field1583 * var8 + var13 >> 15) + this.field1580;
                    if (var17 <= this.field1598.field2539) {
                        return;
                    }
                    int var18 = this.field1582 * var12;
                    int var19 = this.field1597 * var12;
                    var20 = (this.field1589 * var10 + this.field1579 * var8 + var18 >> 15) + this.field1595;
                    var21 = this.field1598.field2504 * var20 / var14 + arg2.field3992;
                    var22 = (this.field1588 * var10 + this.field1593 * var8 + var19 >> 15) + this.field1590;
                    var23 = this.field1598.field2526 * var22 / var14 + arg2.field3996;
                    var24 = (this.field1589 * var10 + this.field1579 * var9 + var18 >> 15) + this.field1595;
                    var25 = this.field1598.field2504 * var24 / var15 + arg2.field3992;
                    var26 = (this.field1588 * var10 + this.field1593 * var9 + var19 >> 15) + this.field1590;
                    var27 = this.field1598.field2526 * var26 / var15 + arg2.field3996;
                    int var28 = (this.field1589 * var11 + this.field1579 * var9 + var18 >> 15) + this.field1595;
                    var29 = this.field1598.field2504 * var28 / var16 + arg2.field3992;
                    int var30 = (this.field1588 * var11 + this.field1593 * var9 + var19 >> 15) + this.field1590;
                    var31 = this.field1598.field2526 * var30 / var16 + arg2.field3996;
                    var32 = (this.field1589 * var11 + this.field1579 * var8 + var18 >> 15) + this.field1595;
                    var33 = this.field1598.field2504 * var32 / var17 + arg2.field3992;
                    var34 = (this.field1588 * var11 + this.field1593 * var8 + var19 >> 15) + this.field1590;
                    var35 = this.field1598.field2526 * var34 / var17 + arg2.field3996;
                } else {
                    int var36 = this.field1596[arg0][arg1];
                    int var37 = this.field1596[arg0 + 1][arg1];
                    int var38 = this.field1596[arg0 + 1][arg1 + 1];
                    int var39 = this.field1596[arg0][arg1 + 1];
                    var14 = (this.field1585 * var10 + this.field1594 * var36 + this.field1583 * var8 >> 15) + this.field1580;
                    if (var14 <= this.field1598.field2539) {
                        return;
                    }
                    var15 = (this.field1585 * var10 + this.field1594 * var37 + this.field1583 * var9 >> 15) + this.field1580;
                    if (var15 <= this.field1598.field2539) {
                        return;
                    }
                    int var40 = (this.field1585 * var11 + this.field1594 * var38 + this.field1583 * var9 >> 15) + this.field1580;
                    if (var40 <= this.field1598.field2539) {
                        return;
                    }
                    var17 = (this.field1585 * var11 + this.field1594 * var39 + this.field1583 * var8 >> 15) + this.field1580;
                    if (var17 <= this.field1598.field2539) {
                        return;
                    }
                    var20 = (this.field1589 * var10 + this.field1582 * var36 + this.field1579 * var8 >> 15) + this.field1595;
                    var21 = this.field1598.field2504 * var20 / var14 + arg2.field3992;
                    var22 = (this.field1588 * var10 + this.field1597 * var36 + this.field1593 * var8 >> 15) + this.field1590;
                    var23 = this.field1598.field2526 * var22 / var14 + arg2.field3996;
                    var24 = (this.field1589 * var10 + this.field1582 * var37 + this.field1579 * var9 >> 15) + this.field1595;
                    var25 = this.field1598.field2504 * var24 / var15 + arg2.field3992;
                    var26 = (this.field1588 * var10 + this.field1597 * var37 + this.field1593 * var9 >> 15) + this.field1590;
                    var27 = this.field1598.field2526 * var26 / var15 + arg2.field3996;
                    int var41 = (this.field1589 * var11 + this.field1582 * var38 + this.field1579 * var9 >> 15) + this.field1595;
                    var29 = this.field1598.field2504 * var41 / var40 + arg2.field3992;
                    int var42 = (this.field1588 * var11 + this.field1597 * var38 + this.field1593 * var9 >> 15) + this.field1590;
                    var31 = this.field1598.field2526 * var42 / var40 + arg2.field3996;
                    var32 = (this.field1589 * var11 + this.field1582 * var39 + this.field1579 * var8 >> 15) + this.field1595;
                    var33 = this.field1598.field2504 * var32 / var17 + arg2.field3992;
                    var34 = (this.field1588 * var11 + this.field1597 * var39 + this.field1593 * var8 >> 15) + this.field1590;
                    var35 = this.field1598.field2526 * var34 / var17 + arg2.field3996;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field3997 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field3993 || var33 > arg2.field3993 || var25 > arg2.field3993;
                    if (var7.field284 >= 0) {
                        if (this.method712(this.field1598.field6863.method1218(var7.field284, false).field2729)) {
                            arg2.field4000 = 100;
                        }
                        arg2.method1796(var31, var35, var27, var29, var33, var25, var7.field287 & 65535, var7.field283 & 65535, var7.field286 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field284);
                        arg2.field4000 = 0;
                    } else {
                        arg2.method1802(var31, var35, var27, var29, var33, var25, var7.field287 & 65535, var7.field283 & 65535, var7.field286 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field3997 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field3993 || var25 > arg2.field3993 || var33 > arg2.field3993;
                    if (var7.field284 >= 0) {
                        if (this.method712(this.field1598.field6863.method1218(var7.field284, false).field2729)) {
                            arg2.field4000 = 100;
                        }
                        arg2.method1796(var23, var27, var35, var21, var25, var33, var7.field285 & 65535, var7.field286 & 65535, var7.field283 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field284);
                        arg2.field4000 = 0;
                        return;
                    }
                    arg2.method1802(var23, var27, var35, var21, var25, var33, var7.field285 & 65535, var7.field286 & 65535, var7.field283 & 65535);
                }
            }
        } else {
            class469 var43 = this.field1584[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field6579; ++var44) {
                    int var84 = var43.field6568[var44];
                    int var85 = var43.field6573[var44];
                    int var86 = var43.field6576[var44];
                    int var87 = (this.field1585 * var86 + this.field1594 * var85 + this.field1583 * var84 >> 15) + this.field1580;
                    if (var87 <= this.field1598.field2539) {
                        return;
                    }
                    int var88 = (this.field1589 * var86 + this.field1582 * var85 + this.field1579 * var84 >> 15) + this.field1595;
                    int var89 = (this.field1588 * var86 + this.field1597 * var85 + this.field1593 * var84 >> 15) + this.field1590;
                    arg3[var44] = this.field1598.field2504 * var88 / var87 + arg2.field3992;
                    arg4[var44] = this.field1598.field2526 * var89 / var87 + arg2.field3996;
                }
                if (var43.field6570 != null) {
                    int var45 = this.field1596[arg0][arg1];
                    int var46 = this.field1596[arg0 + 1][arg1];
                    int var47 = this.field1596[arg0][arg1 + 1];
                    int var48 = this.field1592 * arg0;
                    int var49 = this.field1592 + var48;
                    int var50 = this.field1592 * arg1;
                    int var51 = this.field1592 + var50;
                    int var52 = (this.field1589 * var50 + this.field1582 * var45 + this.field1579 * var48 >> 15) + this.field1595;
                    int var53 = (this.field1588 * var50 + this.field1597 * var45 + this.field1593 * var48 >> 15) + this.field1590;
                    int var54 = (this.field1585 * var50 + this.field1594 * var45 + this.field1583 * var48 >> 15) + this.field1580;
                    int var55 = (this.field1589 * var50 + this.field1582 * var46 + this.field1579 * var49 >> 15) + this.field1595;
                    int var56 = (this.field1588 * var50 + this.field1597 * var46 + this.field1593 * var49 >> 15) + this.field1590;
                    int var57 = (this.field1585 * var50 + this.field1594 * var46 + this.field1583 * var49 >> 15) + this.field1580;
                    int var58 = (this.field1589 * var51 + this.field1582 * var47 + this.field1579 * var48 >> 15) + this.field1595;
                    int var59 = (this.field1588 * var51 + this.field1597 * var47 + this.field1593 * var48 >> 15) + this.field1590;
                    int var60 = (this.field1585 * var51 + this.field1594 * var47 + this.field1583 * var48 >> 15) + this.field1580;
                    for (int var61 = 0; var61 < var43.field6574; ++var61) {
                        short var62 = var43.field6575[var61];
                        short var63 = var43.field6569[var61];
                        short var64 = var43.field6571[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field3997 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field3993 || var66 > arg2.field3993 || var67 > arg2.field3993;
                            short var71 = var43.field6570[var61];
                            if (var71 != -1) {
                                if (this.method712(this.field1598.field6863.method1218(var71, false).field2729)) {
                                    arg2.field4000 = 100;
                                }
                                arg2.method1796(var68, var69, var70, var65, var66, var67, var43.field6567[var62], var43.field6567[var63], var43.field6567[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field4000 = 0;
                            } else {
                                int var72 = var43.field6577[var61];
                                if (var72 != -1) {
                                    arg2.method1802(var68, var69, var70, var65, var66, var67, class231.method1449(4096, var43.field6567[var62], var72), class231.method1449(4096, var43.field6567[var63], var72), class231.method1449(4096, var43.field6567[var64], var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field6574; ++var73) {
                    short var74 = var43.field6575[var73];
                    short var75 = var43.field6569[var73];
                    short var76 = var43.field6571[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field6577[var73];
                        if (var83 != -1) {
                            arg2.field3997 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field3993 || var78 > arg2.field3993 || var79 > arg2.field3993;
                            arg2.method1802(var80, var81, var82, var77, var78, var79, class231.method1449(4096, var43.field6567[var74], var83), class231.method1449(4096, var43.field6567[var75], var83), class231.method1449(4096, var43.field6567[var76], var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lfu;IIII[[I[[II)V")
    public class113(class171 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1598 = arg0;
        this.field1578 = arg2;
        this.field1596 = arg5;
        this.field1592 = arg7;
        this.field1586 = 0;
        while (arg7 > 1) {
            ++this.field1586;
            arg7 >>= 1;
        }
        this.field1600 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1598.field2524 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1598.field2540 * var18 + this.field1598.field2533 * var16 + this.field1598.field2528 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1600[var11][var10] = (byte) var20;
            }
        }
        this.field1599 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(II)I")
    public final int method710(int arg0, int arg1) {
        return this.field1596[arg0][arg1];
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZLdb;[I[I[I)V")
    private final void method711(int arg0, int arg1, boolean arg2, class291 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class483 var8 = this.field1591[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6805 & 2) == 0) {
                int var9 = this.field1592 * arg0;
                int var10 = this.field1592 + var9;
                int var11 = this.field1592 * arg1;
                int var12 = this.field1592 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field6805 & 1) != 0 && !arg2) {
                    int var17 = this.field1596[arg0][arg1];
                    int var18 = this.field1594 * var17;
                    var19 = (this.field1585 * var11 + this.field1583 * var9 + var18 >> 15) + this.field1580;
                    if (var19 <= this.field1598.field2539) {
                        return;
                    }
                    var20 = (this.field1585 * var11 + this.field1583 * var10 + var18 >> 15) + this.field1580;
                    if (var20 <= this.field1598.field2539) {
                        return;
                    }
                    var21 = (this.field1585 * var12 + this.field1583 * var10 + var18 >> 15) + this.field1580;
                    if (var21 <= this.field1598.field2539) {
                        return;
                    }
                    var22 = (this.field1585 * var12 + this.field1583 * var9 + var18 >> 15) + this.field1580;
                    if (var22 <= this.field1598.field2539) {
                        return;
                    }
                    if (this.field1598.field2529) {
                        int var23 = var19 - this.field1598.field2512;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1598.field2512;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1598.field2512;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1598.field2512;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1582 * var17;
                    int var28 = this.field1597 * var17;
                    var29 = (this.field1589 * var11 + this.field1579 * var9 + var27 >> 15) + this.field1595;
                    var30 = this.field1598.field2504 * var29 / var19 + arg3.field3992;
                    var31 = (this.field1588 * var11 + this.field1593 * var9 + var28 >> 15) + this.field1590;
                    var32 = this.field1598.field2526 * var31 / var19 + arg3.field3996;
                    var33 = (this.field1589 * var11 + this.field1579 * var10 + var27 >> 15) + this.field1595;
                    var34 = this.field1598.field2504 * var33 / var20 + arg3.field3992;
                    var35 = (this.field1588 * var11 + this.field1593 * var10 + var28 >> 15) + this.field1590;
                    var36 = this.field1598.field2526 * var35 / var20 + arg3.field3996;
                    var37 = (this.field1589 * var12 + this.field1579 * var10 + var27 >> 15) + this.field1595;
                    var38 = this.field1598.field2504 * var37 / var21 + arg3.field3992;
                    var39 = (this.field1588 * var12 + this.field1593 * var10 + var28 >> 15) + this.field1590;
                    var40 = this.field1598.field2526 * var39 / var21 + arg3.field3996;
                    var41 = (this.field1589 * var12 + this.field1579 * var9 + var27 >> 15) + this.field1595;
                    var42 = this.field1598.field2504 * var41 / var22 + arg3.field3992;
                    var43 = (this.field1588 * var12 + this.field1593 * var9 + var28 >> 15) + this.field1590;
                    var44 = this.field1598.field2526 * var43 / var22 + arg3.field3996;
                } else {
                    int var45 = this.field1596[arg0][arg1];
                    int var46 = this.field1596[arg0 + 1][arg1];
                    int var47 = this.field1596[arg0 + 1][arg1 + 1];
                    int var48 = this.field1596[arg0][arg1 + 1];
                    var19 = (this.field1585 * var11 + this.field1594 * var45 + this.field1583 * var9 >> 15) + this.field1580;
                    if (var19 <= this.field1598.field2539) {
                        return;
                    }
                    var20 = (this.field1585 * var11 + this.field1594 * var46 + this.field1583 * var10 >> 15) + this.field1580;
                    if (var20 <= this.field1598.field2539) {
                        return;
                    }
                    var21 = (this.field1585 * var12 + this.field1594 * var47 + this.field1583 * var10 >> 15) + this.field1580;
                    if (var21 <= this.field1598.field2539) {
                        return;
                    }
                    var22 = (this.field1585 * var12 + this.field1594 * var48 + this.field1583 * var9 >> 15) + this.field1580;
                    if (var22 <= this.field1598.field2539) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1598.field2512;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6803 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1598.field2512;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6813 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1598.field2512;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6807 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1598.field2512;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6810 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1598.field2529) {
                        int var57 = var19 - this.field1598.field2512;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1598.field2512;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1598.field2512;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1598.field2512;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1589 * var11 + this.field1582 * var45 + this.field1579 * var9 >> 15) + this.field1595;
                    var30 = this.field1598.field2504 * var29 / var19 + arg3.field3992;
                    var31 = (this.field1588 * var11 + this.field1597 * var45 + this.field1593 * var9 >> 15) + this.field1590;
                    var32 = this.field1598.field2526 * var31 / var19 + arg3.field3996;
                    var33 = (this.field1589 * var11 + this.field1582 * var46 + this.field1579 * var10 >> 15) + this.field1595;
                    var34 = this.field1598.field2504 * var33 / var20 + arg3.field3992;
                    var35 = (this.field1588 * var11 + this.field1597 * var46 + this.field1593 * var10 >> 15) + this.field1590;
                    var36 = this.field1598.field2526 * var35 / var20 + arg3.field3996;
                    var37 = (this.field1589 * var12 + this.field1582 * var47 + this.field1579 * var10 >> 15) + this.field1595;
                    var38 = this.field1598.field2504 * var37 / var21 + arg3.field3992;
                    var39 = (this.field1588 * var12 + this.field1597 * var47 + this.field1593 * var10 >> 15) + this.field1590;
                    var40 = this.field1598.field2526 * var39 / var21 + arg3.field3996;
                    var41 = (this.field1589 * var12 + this.field1582 * var48 + this.field1579 * var9 >> 15) + this.field1595;
                    var42 = this.field1598.field2504 * var41 / var22 + arg3.field3992;
                    var43 = (this.field1588 * var12 + this.field1597 * var48 + this.field1593 * var9 >> 15) + this.field1590;
                    var44 = this.field1598.field2526 * var43 / var22 + arg3.field3996;
                }
                boolean var61 = var8.field6809 != -1 && this.method712(this.field1598.field6863.method1218(var8.field6809, false).field2729);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field3997 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field3993 || var42 > arg3.field3993 || var34 > arg3.field3993;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field4000 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6809 >= 0) {
                                arg3.method1792(var40, var44, var36, var38, var42, var34, this.field1598.field2516, var15, var16, var14, var8.field6806, var8.field6804, var8.field6812, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6809);
                            } else {
                                arg3.method1801(var40, var44, var36, var38, var42, var34, class309.method1865(-127, var8.field6806, var15 << 24 | this.field1598.field2516), class309.method1865(-89, var8.field6804, var16 << 24 | this.field1598.field2516), class309.method1865(-115, var8.field6812, var14 << 24 | this.field1598.field2516));
                            }
                        } else if (var8.field6809 >= 0) {
                            arg3.method1796(var40, var44, var36, var38, var42, var34, var8.field6806, var8.field6804, var8.field6812, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6809);
                        } else {
                            arg3.method1801(var40, var44, var36, var38, var42, var34, var8.field6806, var8.field6804, var8.field6812);
                        }
                        arg3.field4000 = 0;
                    } else {
                        arg3.method1798(var40, var44, var36, var38, var42, var34, this.field1598.field2516);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field3997 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field3993 || var34 > arg3.field3993 || var42 > arg3.field3993;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field4000 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6809 >= 0) {
                                arg3.method1792(var32, var36, var44, var30, var34, var42, this.field1598.field2516, var13, var14, var16, var8.field6808, var8.field6812, var8.field6804, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6809);
                            } else {
                                arg3.method1801(var32, var36, var44, var30, var34, var42, class309.method1865(-121, var8.field6808, var13 << 24 | this.field1598.field2516), class309.method1865(-105, var8.field6812, var14 << 24 | this.field1598.field2516), class309.method1865(-110, var8.field6804, var16 << 24 | this.field1598.field2516));
                            }
                        } else if (var8.field6809 >= 0) {
                            arg3.method1796(var32, var36, var44, var30, var34, var42, var8.field6808, var8.field6812, var8.field6804, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6809);
                        } else {
                            arg3.method1801(var32, var36, var44, var30, var34, var42, var8.field6808, var8.field6812, var8.field6804);
                        }
                        arg3.field4000 = 0;
                        return;
                    }
                    arg3.method1798(var32, var36, var44, var30, var34, var42, this.field1598.field2516);
                }
            }
        } else {
            class424 var64 = this.field1587[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5826; ++var65) {
                    short var105 = var64.field5823[var65];
                    int var106 = var64.field5821[var65];
                    short var107 = var64.field5824[var65];
                    int var108 = (this.field1585 * var107 + this.field1594 * var106 + this.field1583 * var105 >> 15) + this.field1580;
                    if (var108 <= this.field1598.field2539) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1598.field2512;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5827[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1598.field2529) {
                        int var111 = var108 - this.field1598.field2512;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1589 * var107 + this.field1582 * var106 + this.field1579 * var105 >> 15) + this.field1595;
                    int var113 = (this.field1588 * var107 + this.field1597 * var106 + this.field1593 * var105 >> 15) + this.field1590;
                    arg4[var65] = this.field1598.field2504 * var112 / var108 + arg3.field3992;
                    arg5[var65] = this.field1598.field2526 * var113 / var108 + arg3.field3996;
                }
                if (var64.field5825 != null) {
                    int var66 = this.field1596[arg0][arg1];
                    int var67 = this.field1596[arg0 + 1][arg1];
                    int var68 = this.field1596[arg0][arg1 + 1];
                    int var69 = this.field1592 * arg0;
                    int var70 = this.field1592 + var69;
                    int var71 = this.field1592 * arg1;
                    int var72 = this.field1592 + var71;
                    int var73 = (this.field1589 * var71 + this.field1582 * var66 + this.field1579 * var69 >> 15) + this.field1595;
                    int var74 = (this.field1588 * var71 + this.field1597 * var66 + this.field1593 * var69 >> 15) + this.field1590;
                    int var75 = (this.field1585 * var71 + this.field1594 * var66 + this.field1583 * var69 >> 15) + this.field1580;
                    int var76 = (this.field1589 * var71 + this.field1582 * var67 + this.field1579 * var70 >> 15) + this.field1595;
                    int var77 = (this.field1588 * var71 + this.field1597 * var67 + this.field1593 * var70 >> 15) + this.field1590;
                    int var78 = (this.field1585 * var71 + this.field1594 * var67 + this.field1583 * var70 >> 15) + this.field1580;
                    int var79 = (this.field1589 * var72 + this.field1582 * var68 + this.field1579 * var69 >> 15) + this.field1595;
                    int var80 = (this.field1588 * var72 + this.field1597 * var68 + this.field1593 * var69 >> 15) + this.field1590;
                    int var81 = (this.field1585 * var72 + this.field1594 * var68 + this.field1583 * var69 >> 15) + this.field1580;
                    for (int var82 = 0; var82 < var64.field5819; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field3997 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field3993 || var87 > arg3.field3993 || var88 > arg3.field3993;
                            short var93 = var64.field5825[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method712(this.field1598.field6863.method1218(var93, false).field2729)) {
                                    arg3.field4000 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method1792(var89, var90, var91, var86, var87, var88, this.field1598.field2516, arg6[var83], arg6[var84], arg6[var85], var64.field5820[var83], var64.field5820[var84], var64.field5820[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5820[var83] & 16777215) != 0) {
                                        arg3.method1801(var89, var90, var91, var86, var87, var88, class309.method1865(-62, var64.field5820[var83], arg6[var83] << 24 | this.field1598.field2516), class309.method1865(-78, var64.field5820[var84], arg6[var84] << 24 | this.field1598.field2516), class309.method1865(-110, var64.field5820[var85], arg6[var85] << 24 | this.field1598.field2516));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method1796(var89, var90, var91, var86, var87, var88, var64.field5820[var83], var64.field5820[var84], var64.field5820[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5820[var83] & 16777215) != 0) {
                                    arg3.method1801(var89, var90, var91, var86, var87, var88, var64.field5820[var83], var64.field5820[var84], var64.field5820[var85]);
                                }
                                arg3.field4000 = 0;
                            } else {
                                arg3.method1798(var89, var90, var91, var86, var87, var88, this.field1598.field2516);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5819; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field3997 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field3993 || var99 > arg3.field3993 || var100 > arg3.field3993;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5820[var95] & 16777215) != 0) {
                                    arg3.method1801(var101, var102, var103, var98, var99, var100, class464.method2739(this.field1598.field2516, var64.field5820[var95], 0, arg6[var95]), class464.method2739(this.field1598.field2516, var64.field5820[var96], 0, arg6[var96]), class464.method2739(this.field1598.field2516, var64.field5820[var97], 0, arg6[var97]));
                                }
                            } else if ((var64.field5820[var95] & 16777215) != 0) {
                                arg3.method1801(var101, var102, var103, var98, var99, var100, var64.field5820[var95], var64.field5820[var96], var64.field5820[var97]);
                            }
                        } else {
                            arg3.method1798(var101, var102, var103, var98, var99, var100, this.field1598.field2516);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Z")
    private final boolean method712(int arg0) {
        if ((this.field1578 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lrc;[I)V")
    public final void method713(class488 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class451 var9 = this.field1598.method1114(Thread.currentThread());
        class291 var10 = var9.field6197;
        var10.field4000 = 0;
        var10.field3997 = false;
        if (this.field1591 != null) {
            this.method706(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field6215, var9.field6206);
        } else {
            if (this.field1581 != null) {
                this.method716(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field6215, var9.field6206);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1581 == null) {
            this.field1581 = new class17[super.field3729][super.field3728];
            this.field1584 = new class469[super.field3729][super.field3728];
        } else if (this.field1591 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && this.field1592 != var20 || var21 != 0 && this.field1592 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class469 var22 = new class469();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field6579 = var23;
            var22.field6567 = new short[var23];
            var22.field6568 = new int[var23];
            var22.field6573 = new int[var23];
            var22.field6576 = new int[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field6567[var25] = (short) (this.field1600[arg0][arg1] - this.field1599[arg0][arg1]);
                } else if (var30 == 0 && this.field1592 == var31) {
                    var22.field6567[var25] = (short) (this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1]);
                } else if (this.field1592 == var30 && this.field1592 == var31) {
                    var22.field6567[var25] = (short) (this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1]);
                } else if (this.field1592 == var30 && var31 == 0) {
                    var22.field6567[var25] = (short) (this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1]) * var30 + (this.field1600[arg0][arg1] - this.field1599[arg0][arg1]) * (this.field1592 - var30);
                    int var33 = (this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1]) * var30 + (this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1]) * (this.field1592 - var30);
                    var22.field6567[var25] = (short) ((this.field1592 - var31) * var32 + var31 * var33 >> this.field1586 * 2);
                }
                int var34 = (arg0 << this.field1586) + var30;
                int var35 = (arg1 << this.field1586) + var31;
                var22.field6568[var25] = var34;
                var22.field6576[var25] = var35;
                var22.field6573[var25] = this.method701(var34, var35) + (arg3 != null ? arg3[var25] : 0);
                if (var22.field6567[var25] < 2) {
                    var22.field6567[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1598.field6863.method1218(arg11[var28], false).field2739) {
                    var26 = true;
                }
            }
            var22.field6577 = new int[var27];
            if (arg10 != null) {
                var22.field6572 = new int[var27];
            }
            var22.field6575 = new short[var27];
            var22.field6569 = new short[var27];
            var22.field6571 = new short[var27];
            if (var26) {
                var22.field6570 = new short[var27];
                var22.field6578 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field6577[var22.field6574] = class314.method1897(-1433933209, arg9[var29]);
                    } else {
                        var22.field6577[var22.field6574] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field6572[var22.field6574] = class314.method1897(-1433933209, arg10[var29]);
                        } else {
                            var22.field6572[var22.field6574] = -1;
                        }
                    }
                    var22.field6575[var22.field6574] = (short) arg6[var29];
                    var22.field6569[var22.field6574] = (short) arg7[var29];
                    var22.field6571[var22.field6574] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1598.field6863.method1218(arg11[var29], false).field2739) {
                            var22.field6570[var22.field6574] = (short) arg11[var29];
                            var22.field6578[var22.field6574] = (short) arg12[var29];
                        } else {
                            var22.field6570[var22.field6574] = -1;
                        }
                    }
                    ++var22.field6574;
                }
            }
            this.field1584[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class17 var36 = new class17();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field282 = class231.method1449(4096, this.field1600[arg0][arg1] - this.field1599[arg0][arg1], class314.method1897(-1433933209, arg10[0]));
                    if (var37 == -1) {
                        var36.field288 = (byte) (var36.field288 | 2);
                    }
                }
                if (this.field1596[arg0 + 1][arg1] == this.field1596[arg0][arg1] && this.field1596[arg0 + 1][arg1 + 1] == this.field1596[arg0][arg1] && this.field1596[arg0][arg1 + 1] == this.field1596[arg0][arg1]) {
                    var36.field288 = (byte) (var36.field288 | 1);
                }
                if (var38 != -1 && (var36.field288 & 2) == 0 && !this.field1598.field6863.method1218(var38, false).field2739) {
                    var36.field285 = (short) (this.field1600[arg0][arg1] - this.field1599[arg0][arg1]);
                    var36.field286 = (short) (this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1]);
                    var36.field287 = (short) (this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1]);
                    var36.field283 = (short) (this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1]);
                    var36.field284 = (short) var38;
                } else {
                    short var39 = class314.method1897(-1433933209, var37);
                    var36.field285 = (short) class231.method1449(4096, this.field1600[arg0][arg1] - this.field1599[arg0][arg1], var39);
                    var36.field286 = (short) class231.method1449(4096, this.field1600[arg0 + 1][arg1] - this.field1599[arg0 + 1][arg1], var39);
                    var36.field287 = (short) class231.method1449(4096, this.field1600[arg0 + 1][arg1 + 1] - this.field1599[arg0 + 1][arg1 + 1], var39);
                    var36.field283 = (short) class231.method1449(4096, this.field1600[arg0][arg1 + 1] - this.field1599[arg0][arg1 + 1], var39);
                    var36.field284 = -1;
                }
                this.field1581[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(IIIIIII[[ZLdb;[I[I)V")
    private final void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class291 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field3998 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1581[var16][var17] != null) {
                        class17 var18 = this.field1581[var16][var17];
                        if (var18.field284 != -1 && (var18.field288 & 2) == 0 && var18.field282 == -1) {
                            int var19 = this.field1598.method1146(var18.field284);
                            arg8.method1802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class231.method1449(4096, var18.field287 & 65535, var19), class231.method1449(4096, var18.field283 & 65535, var19), class231.method1449(4096, var18.field286 & 65535, var19));
                            arg8.method1802(var15, var15, var15 - var13, var14, var13 + var14, var14, class231.method1449(4096, var18.field285 & 65535, var19), class231.method1449(4096, var18.field286 & 65535, var19), class231.method1449(4096, var18.field283 & 65535, var19));
                        } else if (var18.field282 == -1) {
                            arg8.method1802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field287 & 65535, var18.field283 & 65535, var18.field286 & 65535);
                            arg8.method1802(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field285 & 65535, var18.field286 & 65535, var18.field283 & 65535);
                        } else {
                            int var20 = var18.field282;
                            arg8.method1802(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method1802(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1584[var16][var17] != null) {
                        class469 var21 = this.field1584[var16][var17];
                        for (int var22 = 0; var22 < var21.field6579; ++var22) {
                            arg9[var22] = (var21.field6568[var22] - this.field1592 * var16) * var13 / this.field1592 + var14;
                            arg10[var22] = var15 - (var21.field6576[var22] - this.field1592 * var17) * var13 / this.field1592;
                        }
                        for (int var23 = 0; var23 < var21.field6574; ++var23) {
                            short var24 = var21.field6575[var23];
                            short var25 = var21.field6569[var23];
                            short var26 = var21.field6571[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field6572 != null && var21.field6572[var23] != -1) {
                                int var33 = var21.field6572[var23];
                                arg8.method1802(var30, var31, var32, var27, var28, var29, class231.method1449(4096, var21.field6567[var24], var33), class231.method1449(4096, var21.field6567[var25], var33), class231.method1449(4096, var21.field6567[var26], var33));
                            } else if (var21.field6570 != null && var21.field6570[var23] != -1) {
                                int var34 = this.field1598.method1146(var21.field6570[var23]);
                                arg8.method1802(var30, var31, var32, var27, var28, var29, class231.method1449(4096, var21.field6567[var24], var34), class231.method1449(4096, var21.field6567[var25], var34), class231.method1449(4096, var21.field6567[var26], var34));
                            } else {
                                int var35 = var21.field6577[var23];
                                arg8.method1802(var30, var31, var32, var27, var28, var29, class231.method1449(4096, var21.field6567[var24], var35), class231.method1449(4096, var21.field6567[var25], var35), class231.method1449(4096, var21.field6567[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field3998 = true;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Lmr;IIIIZ)V")
    public final void method717(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
