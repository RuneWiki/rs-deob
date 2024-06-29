import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class116 extends class351 {

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "Lpq;")
    private class342 field1613;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "[[I")
    public int[][] field1624;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "[[I")
    private int[][] field1633;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    private int field1627;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "[[B")
    private byte[][] field1623;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "[[B")
    private byte[][] field1619;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    private int field1628;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "[[Lhm;")
    private class280[][] field1622;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "[[Lff;")
    private class29[][] field1629;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "[[Lre;")
    private class358[][] field1626;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "[[Lwn;")
    private class77[][] field1630;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lwc;[I)V", line = 6)
    public final void method738(class367 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lri;IIIIZ)V", line = 10)
    public final void method739(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(II)I", line = 14)
    private static final int method740(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[[ZZ)V", line = 45)
    public final void method741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class158 var6 = this.field1613.field4927;
        this.field1634 = var6.field2144;
        this.field1617 = var6.field2133;
        this.field1631 = var6.field2142;
        this.field1616 = var6.field2137;
        this.field1635 = var6.field2141;
        this.field1621 = var6.field2136;
        this.field1620 = var6.field2139;
        this.field1612 = var6.field2134;
        this.field1628 = var6.field2140;
        this.field1632 = var6.field2143;
        this.field1625 = var6.field2135;
        this.field1614 = var6.field2138;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)I", line = 61)
    public final int method742(int arg0, int arg1) {
        return this.field1624[arg0][arg1];
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lri;IIIIZ)Z", line = 67)
    public final boolean method743(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V", line = 70)
    public final void method744() {
        this.field1623 = null;
        this.field1619 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)I", line = 77)
    public final int method745(int arg0, int arg1) {
        int var3 = arg0 >> this.field1627;
        int var4 = arg1 >> this.field1627;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field5084 - 1 && var4 <= super.field5085 - 1) {
            int var5 = arg0 & this.field1615 - 1;
            int var6 = arg1 & this.field1615 - 1;
            int var7 = (this.field1615 - var5) * this.field1624[var3][var4] + this.field1624[var3 + 1][var4] * var5 >> this.field1627;
            int var8 = (this.field1615 - var5) * this.field1624[var3][var4 + 1] + this.field1624[var3 + 1][var4 + 1] * var5 >> this.field1627;
            return (this.field1615 - var6) * var7 + var6 * var8 >> this.field1627;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V", line = 94)
    public final void method746(int arg0, int arg1, int arg2) {
        if (this.field1619[arg0][arg1] < arg2) {
            this.field1619[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII[[Z)V", line = 102)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class131 var9 = this.field1613.method2231(Thread.currentThread());
        class402 var10 = var9.field1802;
        var10.field5985 = 0;
        var10.field5986 = false;
        if (this.field1630 != null) {
            this.method753(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1839, var9.field1841);
        } else {
            if (this.field1629 != null) {
                this.method749(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1839, var9.field1841);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lpq;IIII[[I[[II)V", line = 119)
    public class116(class342 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1613 = arg0;
        this.field1618 = arg2;
        this.field1624 = arg5;
        this.field1633 = arg6;
        this.field1615 = arg7;
        this.field1627 = 0;
        while (arg7 > 1) {
            ++this.field1627;
            arg7 >>= 1;
        }
        this.field1623 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1613.field4918 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1624[var11 + 1][var10] - this.field1624[var11 - 1][var10];
                int var14 = this.field1624[var11][var10 + 1] - this.field1624[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1613.field4913 * var18 + this.field1613.field4952 * var16 + this.field1613.field4934 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1623[var11][var10] = (byte) var20;
            }
        }
        this.field1619 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 180)
    public final void method748(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1629 == null) {
            this.field1629 = new class29[super.field5084][super.field5085];
            this.field1622 = new class280[super.field5084][super.field5085];
        } else if (this.field1630 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1615 != var18 || var19 != 0 && this.field1615 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class280 var20 = new class280();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field4067 = var21;
            var20.field4071 = new short[var21];
            var20.field4059 = new int[var21];
            var20.field4065 = new int[var21];
            var20.field4069 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field4071[var23] = (short) (this.field1623[arg0][arg1] - this.field1619[arg0][arg1]);
                } else if (var28 == 0 && this.field1615 == var29) {
                    var20.field4071[var23] = (short) (this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1]);
                } else if (this.field1615 == var28 && this.field1615 == var29) {
                    var20.field4071[var23] = (short) (this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1]);
                } else if (this.field1615 == var28 && var29 == 0) {
                    var20.field4071[var23] = (short) (this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1]) * var28 + (this.field1623[arg0][arg1] - this.field1619[arg0][arg1]) * (this.field1615 - var28);
                    int var31 = (this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1]) * var28 + (this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1]) * (this.field1615 - var28);
                    var20.field4071[var23] = (short) ((this.field1615 - var29) * var30 + var29 * var31 >> this.field1627 * 2);
                }
                int var32 = (arg0 << this.field1627) + var28;
                int var33 = (arg1 << this.field1627) + var29;
                var20.field4059[var23] = var32;
                var20.field4069[var23] = var33;
                var20.field4065[var23] = this.method745(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field4071[var23] < 2) {
                    var20.field4071[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1613.field4945.method186(arg10[var26], -9590).field6494) {
                    var24 = true;
                }
            }
            var20.field4061 = new int[var25];
            if (arg9 != null) {
                var20.field4066 = new int[var25];
            }
            var20.field4062 = new short[var25];
            var20.field4060 = new short[var25];
            var20.field4064 = new short[var25];
            if (var24) {
                var20.field4068 = new short[var25];
                var20.field4070 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field4061[var20.field4063] = class62.method434(arg8[var27], 2194);
                    } else {
                        var20.field4061[var20.field4063] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field4066[var20.field4063] = class62.method434(arg9[var27], 2194);
                        } else {
                            var20.field4066[var20.field4063] = -1;
                        }
                    }
                    var20.field4062[var20.field4063] = (short) arg5[var27];
                    var20.field4060[var20.field4063] = (short) arg6[var27];
                    var20.field4064[var20.field4063] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1613.field4945.method186(arg10[var27], -9590).field6494) {
                            var20.field4068[var20.field4063] = (short) arg10[var27];
                            var20.field4070[var20.field4063] = (short) arg11[var27];
                        } else {
                            var20.field4068[var20.field4063] = -1;
                        }
                    }
                    ++var20.field4063;
                }
            }
            this.field1622[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class29 var34 = new class29();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field428 = class69.method466(-1, this.field1623[arg0][arg1] - this.field1619[arg0][arg1], class62.method434(arg9[0], 2194));
                    if (var35 == -1) {
                        var34.field425 = (byte) (var34.field425 | 2);
                    }
                }
                if (this.field1624[arg0 + 1][arg1] == this.field1624[arg0][arg1] && this.field1624[arg0 + 1][arg1 + 1] == this.field1624[arg0][arg1] && this.field1624[arg0][arg1 + 1] == this.field1624[arg0][arg1]) {
                    var34.field425 = (byte) (var34.field425 | 1);
                }
                if (var36 != -1 && (var34.field425 & 2) == 0 && !this.field1613.field4945.method186(var36, -9590).field6494) {
                    var34.field427 = (short) (this.field1623[arg0][arg1] - this.field1619[arg0][arg1]);
                    var34.field423 = (short) (this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1]);
                    var34.field426 = (short) (this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1]);
                    var34.field422 = (short) (this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1]);
                    var34.field424 = (short) var36;
                } else {
                    short var37 = class62.method434(var35, 2194);
                    var34.field427 = (short) class69.method466(-1, this.field1623[arg0][arg1] - this.field1619[arg0][arg1], var37);
                    var34.field423 = (short) class69.method466(-1, this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1], var37);
                    var34.field426 = (short) class69.method466(-1, this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1], var37);
                    var34.field422 = (short) class69.method466(-1, this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1], var37);
                    var34.field424 = -1;
                }
                this.field1629[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII[[ZLjp;[I[I)V", line = 411)
    private final void method749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class402 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5988 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1629[var16][var17] != null) {
                        class29 var18 = this.field1629[var16][var17];
                        if (var18.field424 != -1 && (var18.field425 & 2) == 0 && var18.field428 == -1) {
                            int var19 = this.field1613.method2233(var18.field424);
                            arg8.method2598(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class69.method466(-1, var18.field426 & 65535, var19), class69.method466(-1, var18.field422 & 65535, var19), class69.method466(-1, var18.field423 & 65535, var19));
                            arg8.method2598(var15, var15, var15 - var13, var14, var13 + var14, var14, class69.method466(-1, var18.field427 & 65535, var19), class69.method466(-1, var18.field423 & 65535, var19), class69.method466(-1, var18.field422 & 65535, var19));
                        } else if (var18.field428 == -1) {
                            arg8.method2598(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field426 & 65535, var18.field422 & 65535, var18.field423 & 65535);
                            arg8.method2598(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field427 & 65535, var18.field423 & 65535, var18.field422 & 65535);
                        } else {
                            int var20 = var18.field428;
                            arg8.method2598(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2598(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1622[var16][var17] != null) {
                        class280 var21 = this.field1622[var16][var17];
                        for (int var22 = 0; var22 < var21.field4067; ++var22) {
                            arg9[var22] = (var21.field4059[var22] - this.field1615 * var16) * var13 / this.field1615 + var14;
                            arg10[var22] = var15 - (var21.field4069[var22] - this.field1615 * var17) * var13 / this.field1615;
                        }
                        for (int var23 = 0; var23 < var21.field4063; ++var23) {
                            short var24 = var21.field4062[var23];
                            short var25 = var21.field4060[var23];
                            short var26 = var21.field4064[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field4066 != null && var21.field4066[var23] != -1) {
                                int var33 = var21.field4066[var23];
                                arg8.method2598(var30, var31, var32, var27, var28, var29, class69.method466(-1, var21.field4071[var24], var33), class69.method466(-1, var21.field4071[var25], var33), class69.method466(-1, var21.field4071[var26], var33));
                            } else if (var21.field4068 != null && var21.field4068[var23] != -1) {
                                int var34 = this.field1613.method2233(var21.field4068[var23]);
                                arg8.method2598(var30, var31, var32, var27, var28, var29, class69.method466(-1, var21.field4071[var24], var34), class69.method466(-1, var21.field4071[var25], var34), class69.method466(-1, var21.field4071[var26], var34));
                            } else {
                                int var35 = var21.field4061[var23];
                                arg8.method2598(var30, var31, var32, var27, var28, var29, class69.method466(-1, var21.field4071[var24], var35), class69.method466(-1, var21.field4071[var25], var35), class69.method466(-1, var21.field4071[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5988 = true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 541)
    public final void method750(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1630 == null) {
            this.field1630 = new class77[super.field5084][super.field5085];
            this.field1626 = new class358[super.field5084][super.field5085];
        } else if (this.field1629 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class349.field5050[class62.method434(arg5[var13], 2194) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class349.field5050[class62.method434(arg6[var14], 2194) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field1615 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1615 && arg4[var20] == this.field1615) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1615) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1615 != arg2[var22] && arg2[0] - this.field1615 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1615 != arg4[var22] && arg4[0] - this.field1615 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class77 var23 = new class77();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field1087 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field1091 = (byte) (var23.field1091 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1624[arg0 + 1][arg1] == this.field1624[arg0][arg1] && this.field1624[arg0 + 1][arg1 + 1] == this.field1624[arg0][arg1] && this.field1624[arg0][arg1 + 1] == this.field1624[arg0][arg1]) {
                    var23.field1091 = (byte) (var23.field1091 | 1);
                }
                if (var25 != -1 && (var23.field1091 & 2) == 0 && !this.field1613.field4945.method186(var25, -9590).field6494) {
                    var23.field1090 = this.field1623[arg0][arg1] - this.field1619[arg0][arg1];
                    var23.field1092 = this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1];
                    var23.field1089 = this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1];
                    var23.field1088 = this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1];
                    var23.field1086 = (short) var25;
                } else {
                    int var26;
                    if (this.field1633 != null && arg10 != 0) {
                        var26 = this.field1633[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field1090 = class73.method536(14639, arg9, var26, method740(arg5[var16] >> 8, this.field1623[arg0][arg1] - this.field1619[arg0][arg1]));
                    if (var23.field1087 != 0) {
                        var23.field1090 |= 255 - (this.field1623[arg0][arg1] - this.field1619[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1633 != null && arg10 != 0) {
                        var27 = this.field1633[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field1092 = class73.method536(14639, arg9, var27, method740(arg5[var17] >> 8, this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1]));
                    if (var23.field1087 != 0) {
                        var23.field1092 |= 255 - (this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1633 != null && arg10 != 0) {
                        var28 = this.field1633[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field1089 = class73.method536(14639, arg9, var28, method740(arg5[var18] >> 8, this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1]));
                    if (var23.field1087 != 0) {
                        var23.field1089 |= 255 - (this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1633 != null && arg10 != 0) {
                        var29 = this.field1633[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field1088 = class73.method536(14639, arg9, var29, method740(arg5[var19] >> 8, this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1]));
                    if (var23.field1087 != 0) {
                        var23.field1088 |= 255 - (this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1]) << 25;
                    }
                    var23.field1086 = -1;
                }
                this.field1630[arg0][arg1] = var23;
            } else {
                class358 var30 = new class358();
                var30.field5178 = (short) arg2.length;
                var30.field5171 = (short) (arg2.length / 3);
                var30.field5172 = new short[var30.field5178];
                var30.field5179 = new short[var30.field5178];
                var30.field5173 = new short[var30.field5178];
                var30.field5174 = new int[var30.field5178];
                if (this.field1633 != null) {
                    var30.field5177 = new short[var30.field5178];
                }
                for (int var31 = 0; var31 < var30.field5178; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1623[arg0][arg1] - this.field1619[arg0][arg1];
                    } else if (var46 == 0 && this.field1615 == var47) {
                        var49 = this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1];
                    } else if (this.field1615 == var46 && this.field1615 == var47) {
                        var49 = this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1];
                    } else if (this.field1615 == var46 && var47 == 0) {
                        var49 = this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1623[arg0 + 1][arg1] - this.field1619[arg0 + 1][arg1]) * var46 + (this.field1623[arg0][arg1] - this.field1619[arg0][arg1]) * (this.field1615 - var46);
                        int var51 = (this.field1623[arg0 + 1][arg1 + 1] - this.field1619[arg0 + 1][arg1 + 1]) * var46 + (this.field1623[arg0][arg1 + 1] - this.field1619[arg0][arg1 + 1]) * (this.field1615 - var46);
                        var49 = (this.field1615 - var47) * var50 + var47 * var51 >> this.field1627 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1627) + var46);
                    short var53 = (short) ((arg1 << this.field1627) + var47);
                    var30.field5172[var31] = var52;
                    var30.field5173[var31] = var53;
                    var30.field5179[var31] = (short) (this.method745(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1613.field4945.method186(arg7[var31], -9590).field6494) {
                        var30.field5174[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field5174[var31] = var49 << 25;
                        } else {
                            var30.field5174[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1633 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1633[arg0][arg1];
                            } else if (var46 == 0 && this.field1615 == var47) {
                                var56 = this.field1633[arg0][arg1 + 1];
                            } else if (this.field1615 == var46 && this.field1615 == var47) {
                                var56 = this.field1633[arg0 + 1][arg1 + 1];
                            } else if (this.field1615 == var46 && var47 == 0) {
                                var56 = this.field1633[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1615 - var46) * this.field1633[arg0][arg1] + this.field1633[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1615 - var46) * this.field1633[arg0][arg1 + 1] + this.field1633[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1615 - var47) * var57 + var47 * var58 >> this.field1627 * 2;
                            }
                            var30.field5177[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field5174[var31] = class73.method536(14639, arg9, var54, method740(arg5[var31] >> 8, var49));
                        if (arg6 != null) {
                            var30.field5174[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field5171; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1613.field4945.method186(arg7[var33 * 3], -9590).field6494) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field5176 = new int[var30.field5171];
                }
                if (var32) {
                    var30.field5180 = new short[var30.field5171];
                    var30.field5175 = new short[var30.field5171];
                }
                for (int var34 = 0; var34 < var30.field5171; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field5176[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1613.field4945.method186(var40, -9590).field6494) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1613.field4945.method186(var41, -9590).field6494) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1613.field4945.method186(var42, -9590).field6494) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field5180[var34] = (short) var42;
                            var30.field5175[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1613.field4945.method186(var43, -9590).field6494) {
                                    var30.field5174[var35] = class349.field5050[class62.method434(this.field1613.field4945.method186(var43, -9590).field6504 & 65535, 2194) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1613.field4945.method186(var44, -9590).field6494) {
                                    var30.field5174[var36] = class349.field5050[class62.method434(this.field1613.field4945.method186(var44, -9590).field6504 & 65535, 2194) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1613.field4945.method186(var45, -9590).field6494) {
                                    var30.field5174[var37] = class349.field5050[class62.method434(this.field1613.field4945.method186(var45, -9590).field6504 & 65535, 2194) & 65535];
                                }
                            }
                            var30.field5180[var34] = -1;
                        }
                    }
                }
                this.field1626[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)Z", line = 1051)
    private final boolean method751(int arg0) {
        if ((this.field1618 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)V", line = 1065)
    public final void method752(int arg0, int arg1) {
        class131 var3 = this.field1613.method2231(Thread.currentThread());
        var3.field1802.field5985 = 0;
        if (this.field1630 != null) {
            this.method755(arg0, arg1, this.field1613.field4949, var3.field1802, var3.field1839, var3.field1841, var3.field1833);
        } else {
            if (this.field1629 != null) {
                this.method754(arg0, arg1, var3.field1802, var3.field1839, var3.field1841, var3.field1833);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIIII[[ZLjp;[I[I)V", line = 1077)
    private final void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class402 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field5988 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1630[var16][var17] != null) {
                        class77 var18 = this.field1630[var16][var17];
                        if (var18.field1086 != -1 && (var18.field1091 & 2) == 0 && var18.field1087 == 0) {
                            int var19 = this.field1613.method2233(var18.field1086);
                            arg8.method2598(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class69.method466(-1, var18.field1089, var19), class69.method466(-1, var18.field1088, var19), class69.method466(-1, var18.field1092, var19));
                            arg8.method2598(var15, var15, var15 - var13, var14, var13 + var14, var14, class69.method466(-1, var18.field1090, var19), class69.method466(-1, var18.field1092, var19), class69.method466(-1, var18.field1088, var19));
                        } else if (var18.field1087 == 0) {
                            arg8.method2588(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1089, var18.field1088, var18.field1092);
                            arg8.method2588(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1090, var18.field1092, var18.field1088);
                        } else {
                            int var20 = var18.field1087;
                            arg8.method2588(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class379.method2450(var20, var18.field1089 & -16777216, -1037365176), class379.method2450(var20, var18.field1088 & -16777216, -1037365176), class379.method2450(var20, var18.field1092 & -16777216, -1037365176));
                            arg8.method2588(var15, var15, var15 - var13, var14, var13 + var14, var14, class379.method2450(var20, var18.field1090 & -16777216, -1037365176), class379.method2450(var20, var18.field1092 & -16777216, -1037365176), class379.method2450(var20, var18.field1088 & -16777216, -1037365176));
                        }
                    } else if (this.field1626[var16][var17] != null) {
                        class358 var21 = this.field1626[var16][var17];
                        for (int var22 = 0; var22 < var21.field5178; ++var22) {
                            arg9[var22] = (var21.field5172[var22] - this.field1615 * var16) * var13 / this.field1615 + var14;
                            arg10[var22] = var15 - (var21.field5173[var22] - this.field1615 * var17) * var13 / this.field1615;
                        }
                        for (int var23 = 0; var23 < var21.field5171; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5176 == null || var21.field5176[var23] == 0 || var21.field5180 != null && (var21.field5180 == null || var21.field5180[var23] != -1)) {
                                if (var21.field5180 != null && var21.field5180[var23] != -1) {
                                    int var34 = this.field1613.method2233(var21.field5180[var23]);
                                    arg8.method2598(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2588(var30, var31, var32, var27, var28, var29, var21.field5174[var24], var21.field5174[var25], var21.field5174[var26]);
                                }
                            } else {
                                int var33 = var21.field5176[var23];
                                arg8.method2588(var30, var31, var32, var27, var28, var29, class379.method2450(var33, -16777216 - (var21.field5174[var24] & -16777216), -1037365176), class379.method2450(var33, -16777216 - (var21.field5174[var25] & -16777216), -1037365176), class379.method2450(var33, -16777216 - (var21.field5174[var26] & -16777216), -1037365176));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field5988 = true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILjp;[I[I[I)V", line = 1207)
    private final void method754(int arg0, int arg1, class402 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class29 var7 = this.field1629[arg0][arg1];
        if (var7 != null) {
            if ((var7.field425 & 2) == 0) {
                int var8 = this.field1615 * arg0;
                int var9 = this.field1615 + var8;
                int var10 = this.field1615 * arg1;
                int var11 = this.field1615 + var10;
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
                if ((var7.field425 & 1) != 0) {
                    int var12 = this.field1624[arg0][arg1];
                    int var13 = this.field1632 * var12;
                    var14 = (this.field1625 * var10 + this.field1628 * var8 + var13 >> 15) + this.field1614;
                    if (var14 <= this.field1613.field4940) {
                        return;
                    }
                    var15 = (this.field1625 * var10 + this.field1628 * var9 + var13 >> 15) + this.field1614;
                    if (var15 <= this.field1613.field4940) {
                        return;
                    }
                    int var16 = (this.field1625 * var11 + this.field1628 * var9 + var13 >> 15) + this.field1614;
                    if (var16 <= this.field1613.field4940) {
                        return;
                    }
                    var17 = (this.field1625 * var11 + this.field1628 * var8 + var13 >> 15) + this.field1614;
                    if (var17 <= this.field1613.field4940) {
                        return;
                    }
                    int var18 = this.field1617 * var12;
                    int var19 = this.field1621 * var12;
                    var20 = (this.field1631 * var10 + this.field1634 * var8 + var18 >> 15) + this.field1616;
                    var21 = this.field1613.field4950 * var20 / var14 + arg2.field5989;
                    var22 = (this.field1620 * var10 + this.field1635 * var8 + var19 >> 15) + this.field1612;
                    var23 = this.field1613.field4935 * var22 / var14 + arg2.field5983;
                    var24 = (this.field1631 * var10 + this.field1634 * var9 + var18 >> 15) + this.field1616;
                    var25 = this.field1613.field4950 * var24 / var15 + arg2.field5989;
                    var26 = (this.field1620 * var10 + this.field1635 * var9 + var19 >> 15) + this.field1612;
                    var27 = this.field1613.field4935 * var26 / var15 + arg2.field5983;
                    int var28 = (this.field1631 * var11 + this.field1634 * var9 + var18 >> 15) + this.field1616;
                    var29 = this.field1613.field4950 * var28 / var16 + arg2.field5989;
                    int var30 = (this.field1620 * var11 + this.field1635 * var9 + var19 >> 15) + this.field1612;
                    var31 = this.field1613.field4935 * var30 / var16 + arg2.field5983;
                    var32 = (this.field1631 * var11 + this.field1634 * var8 + var18 >> 15) + this.field1616;
                    var33 = this.field1613.field4950 * var32 / var17 + arg2.field5989;
                    var34 = (this.field1620 * var11 + this.field1635 * var8 + var19 >> 15) + this.field1612;
                    var35 = this.field1613.field4935 * var34 / var17 + arg2.field5983;
                } else {
                    int var36 = this.field1624[arg0][arg1];
                    int var37 = this.field1624[arg0 + 1][arg1];
                    int var38 = this.field1624[arg0 + 1][arg1 + 1];
                    int var39 = this.field1624[arg0][arg1 + 1];
                    var14 = (this.field1625 * var10 + this.field1632 * var36 + this.field1628 * var8 >> 15) + this.field1614;
                    if (var14 <= this.field1613.field4940) {
                        return;
                    }
                    var15 = (this.field1625 * var10 + this.field1632 * var37 + this.field1628 * var9 >> 15) + this.field1614;
                    if (var15 <= this.field1613.field4940) {
                        return;
                    }
                    int var40 = (this.field1625 * var11 + this.field1632 * var38 + this.field1628 * var9 >> 15) + this.field1614;
                    if (var40 <= this.field1613.field4940) {
                        return;
                    }
                    var17 = (this.field1625 * var11 + this.field1632 * var39 + this.field1628 * var8 >> 15) + this.field1614;
                    if (var17 <= this.field1613.field4940) {
                        return;
                    }
                    var20 = (this.field1631 * var10 + this.field1634 * var8 + this.field1617 * var36 >> 15) + this.field1616;
                    var21 = this.field1613.field4950 * var20 / var14 + arg2.field5989;
                    var22 = (this.field1620 * var10 + this.field1635 * var8 + this.field1621 * var36 >> 15) + this.field1612;
                    var23 = this.field1613.field4935 * var22 / var14 + arg2.field5983;
                    var24 = (this.field1631 * var10 + this.field1634 * var9 + this.field1617 * var37 >> 15) + this.field1616;
                    var25 = this.field1613.field4950 * var24 / var15 + arg2.field5989;
                    var26 = (this.field1620 * var10 + this.field1635 * var9 + this.field1621 * var37 >> 15) + this.field1612;
                    var27 = this.field1613.field4935 * var26 / var15 + arg2.field5983;
                    int var41 = (this.field1631 * var11 + this.field1634 * var9 + this.field1617 * var38 >> 15) + this.field1616;
                    var29 = this.field1613.field4950 * var41 / var40 + arg2.field5989;
                    int var42 = (this.field1620 * var11 + this.field1635 * var9 + this.field1621 * var38 >> 15) + this.field1612;
                    var31 = this.field1613.field4935 * var42 / var40 + arg2.field5983;
                    var32 = (this.field1631 * var11 + this.field1634 * var8 + this.field1617 * var39 >> 15) + this.field1616;
                    var33 = this.field1613.field4950 * var32 / var17 + arg2.field5989;
                    var34 = (this.field1620 * var11 + this.field1635 * var8 + this.field1621 * var39 >> 15) + this.field1612;
                    var35 = this.field1613.field4935 * var34 / var17 + arg2.field5983;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field5986 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field5984 || var33 > arg2.field5984 || var25 > arg2.field5984;
                    if (var7.field424 >= 0) {
                        if (this.method751(this.field1613.field4945.method186(var7.field424, -9590).field6506)) {
                            arg2.field5985 = 100;
                        }
                        arg2.method2587(var31, var35, var27, var29, var33, var25, var7.field426 & 65535, var7.field422 & 65535, var7.field423 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field424);
                        arg2.field5985 = 0;
                    } else {
                        arg2.method2598(var31, var35, var27, var29, var33, var25, var7.field426 & 65535, var7.field422 & 65535, var7.field423 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field5986 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field5984 || var25 > arg2.field5984 || var33 > arg2.field5984;
                    if (var7.field424 >= 0) {
                        if (this.method751(this.field1613.field4945.method186(var7.field424, -9590).field6506)) {
                            arg2.field5985 = 100;
                        }
                        arg2.method2587(var23, var27, var35, var21, var25, var33, var7.field427 & 65535, var7.field423 & 65535, var7.field422 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field424);
                        arg2.field5985 = 0;
                        return;
                    }
                    arg2.method2598(var23, var27, var35, var21, var25, var33, var7.field427 & 65535, var7.field423 & 65535, var7.field422 & 65535);
                }
            }
        } else {
            class280 var43 = this.field1622[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field4067; ++var44) {
                    int var84 = var43.field4059[var44];
                    int var85 = var43.field4065[var44];
                    int var86 = var43.field4069[var44];
                    int var87 = (this.field1625 * var86 + this.field1632 * var85 + this.field1628 * var84 >> 15) + this.field1614;
                    if (var87 <= this.field1613.field4940) {
                        return;
                    }
                    int var88 = (this.field1631 * var86 + this.field1634 * var84 + this.field1617 * var85 >> 15) + this.field1616;
                    int var89 = (this.field1620 * var86 + this.field1635 * var84 + this.field1621 * var85 >> 15) + this.field1612;
                    arg3[var44] = this.field1613.field4950 * var88 / var87 + arg2.field5989;
                    arg4[var44] = this.field1613.field4935 * var89 / var87 + arg2.field5983;
                }
                if (var43.field4068 != null) {
                    int var45 = this.field1624[arg0][arg1];
                    int var46 = this.field1624[arg0 + 1][arg1];
                    int var47 = this.field1624[arg0][arg1 + 1];
                    int var48 = this.field1615 * arg0;
                    int var49 = this.field1615 + var48;
                    int var50 = this.field1615 * arg1;
                    int var51 = this.field1615 + var50;
                    int var52 = (this.field1631 * var50 + this.field1634 * var48 + this.field1617 * var45 >> 15) + this.field1616;
                    int var53 = (this.field1620 * var50 + this.field1635 * var48 + this.field1621 * var45 >> 15) + this.field1612;
                    int var54 = (this.field1625 * var50 + this.field1632 * var45 + this.field1628 * var48 >> 15) + this.field1614;
                    int var55 = (this.field1631 * var50 + this.field1634 * var49 + this.field1617 * var46 >> 15) + this.field1616;
                    int var56 = (this.field1620 * var50 + this.field1635 * var49 + this.field1621 * var46 >> 15) + this.field1612;
                    int var57 = (this.field1625 * var50 + this.field1632 * var46 + this.field1628 * var49 >> 15) + this.field1614;
                    int var58 = (this.field1631 * var51 + this.field1634 * var48 + this.field1617 * var47 >> 15) + this.field1616;
                    int var59 = (this.field1620 * var51 + this.field1635 * var48 + this.field1621 * var47 >> 15) + this.field1612;
                    int var60 = (this.field1625 * var51 + this.field1632 * var47 + this.field1628 * var48 >> 15) + this.field1614;
                    for (int var61 = 0; var61 < var43.field4063; ++var61) {
                        short var62 = var43.field4062[var61];
                        short var63 = var43.field4060[var61];
                        short var64 = var43.field4064[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field5986 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field5984 || var66 > arg2.field5984 || var67 > arg2.field5984;
                            short var71 = var43.field4068[var61];
                            if (var71 != -1) {
                                if (this.method751(this.field1613.field4945.method186(var71, -9590).field6506)) {
                                    arg2.field5985 = 100;
                                }
                                arg2.method2587(var68, var69, var70, var65, var66, var67, var43.field4071[var62], var43.field4071[var63], var43.field4071[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field5985 = 0;
                            } else {
                                int var72 = var43.field4061[var61];
                                if (var72 != -1) {
                                    arg2.method2598(var68, var69, var70, var65, var66, var67, class69.method466(-1, var43.field4071[var62], var72), class69.method466(-1, var43.field4071[var63], var72), class69.method466(-1, var43.field4071[var64], var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field4063; ++var73) {
                    short var74 = var43.field4062[var73];
                    short var75 = var43.field4060[var73];
                    short var76 = var43.field4064[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field4061[var73];
                        if (var83 != -1) {
                            arg2.field5986 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field5984 || var78 > arg2.field5984 || var79 > arg2.field5984;
                            arg2.method2598(var80, var81, var82, var77, var78, var79, class69.method466(-1, var43.field4071[var74], var83), class69.method466(-1, var43.field4071[var75], var83), class69.method466(-1, var43.field4071[var76], var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZLjp;[I[I[I)V", line = 1525)
    private final void method755(int arg0, int arg1, boolean arg2, class402 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class77 var8 = this.field1630[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1091 & 2) == 0) {
                int var9 = this.field1615 * arg0;
                int var10 = this.field1615 + var9;
                int var11 = this.field1615 * arg1;
                int var12 = this.field1615 + var11;
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
                if ((var8.field1091 & 1) != 0 && !arg2) {
                    int var17 = this.field1624[arg0][arg1];
                    int var18 = this.field1632 * var17;
                    var19 = (this.field1625 * var11 + this.field1628 * var9 + var18 >> 15) + this.field1614;
                    if (var19 <= this.field1613.field4940) {
                        return;
                    }
                    var20 = (this.field1625 * var11 + this.field1628 * var10 + var18 >> 15) + this.field1614;
                    if (var20 <= this.field1613.field4940) {
                        return;
                    }
                    var21 = (this.field1625 * var12 + this.field1628 * var10 + var18 >> 15) + this.field1614;
                    if (var21 <= this.field1613.field4940) {
                        return;
                    }
                    var22 = (this.field1625 * var12 + this.field1628 * var9 + var18 >> 15) + this.field1614;
                    if (var22 <= this.field1613.field4940) {
                        return;
                    }
                    if (this.field1613.field4942) {
                        int var23 = var19 - this.field1613.field4956;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1613.field4956;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1613.field4956;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1613.field4956;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1617 * var17;
                    int var28 = this.field1621 * var17;
                    var29 = (this.field1631 * var11 + this.field1634 * var9 + var27 >> 15) + this.field1616;
                    var30 = this.field1613.field4950 * var29 / var19 + arg3.field5989;
                    var31 = (this.field1620 * var11 + this.field1635 * var9 + var28 >> 15) + this.field1612;
                    var32 = this.field1613.field4935 * var31 / var19 + arg3.field5983;
                    var33 = (this.field1631 * var11 + this.field1634 * var10 + var27 >> 15) + this.field1616;
                    var34 = this.field1613.field4950 * var33 / var20 + arg3.field5989;
                    var35 = (this.field1620 * var11 + this.field1635 * var10 + var28 >> 15) + this.field1612;
                    var36 = this.field1613.field4935 * var35 / var20 + arg3.field5983;
                    var37 = (this.field1631 * var12 + this.field1634 * var10 + var27 >> 15) + this.field1616;
                    var38 = this.field1613.field4950 * var37 / var21 + arg3.field5989;
                    var39 = (this.field1620 * var12 + this.field1635 * var10 + var28 >> 15) + this.field1612;
                    var40 = this.field1613.field4935 * var39 / var21 + arg3.field5983;
                    var41 = (this.field1631 * var12 + this.field1634 * var9 + var27 >> 15) + this.field1616;
                    var42 = this.field1613.field4950 * var41 / var22 + arg3.field5989;
                    var43 = (this.field1620 * var12 + this.field1635 * var9 + var28 >> 15) + this.field1612;
                    var44 = this.field1613.field4935 * var43 / var22 + arg3.field5983;
                } else {
                    int var45 = this.field1624[arg0][arg1];
                    int var46 = this.field1624[arg0 + 1][arg1];
                    int var47 = this.field1624[arg0 + 1][arg1 + 1];
                    int var48 = this.field1624[arg0][arg1 + 1];
                    var19 = (this.field1625 * var11 + this.field1632 * var45 + this.field1628 * var9 >> 15) + this.field1614;
                    if (var19 <= this.field1613.field4940) {
                        return;
                    }
                    var20 = (this.field1625 * var11 + this.field1632 * var46 + this.field1628 * var10 >> 15) + this.field1614;
                    if (var20 <= this.field1613.field4940) {
                        return;
                    }
                    var21 = (this.field1625 * var12 + this.field1632 * var47 + this.field1628 * var10 >> 15) + this.field1614;
                    if (var21 <= this.field1613.field4940) {
                        return;
                    }
                    var22 = (this.field1625 * var12 + this.field1632 * var48 + this.field1628 * var9 >> 15) + this.field1614;
                    if (var22 <= this.field1613.field4940) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1613.field4956;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1633[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1613.field4956;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1633[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1613.field4956;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1633[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1613.field4956;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1633[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1613.field4942) {
                        int var57 = var19 - this.field1613.field4956;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1613.field4956;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1613.field4956;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1613.field4956;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1631 * var11 + this.field1634 * var9 + this.field1617 * var45 >> 15) + this.field1616;
                    var30 = this.field1613.field4950 * var29 / var19 + arg3.field5989;
                    var31 = (this.field1620 * var11 + this.field1635 * var9 + this.field1621 * var45 >> 15) + this.field1612;
                    var32 = this.field1613.field4935 * var31 / var19 + arg3.field5983;
                    var33 = (this.field1631 * var11 + this.field1634 * var10 + this.field1617 * var46 >> 15) + this.field1616;
                    var34 = this.field1613.field4950 * var33 / var20 + arg3.field5989;
                    var35 = (this.field1620 * var11 + this.field1635 * var10 + this.field1621 * var46 >> 15) + this.field1612;
                    var36 = this.field1613.field4935 * var35 / var20 + arg3.field5983;
                    var37 = (this.field1631 * var12 + this.field1634 * var10 + this.field1617 * var47 >> 15) + this.field1616;
                    var38 = this.field1613.field4950 * var37 / var21 + arg3.field5989;
                    var39 = (this.field1620 * var12 + this.field1635 * var10 + this.field1621 * var47 >> 15) + this.field1612;
                    var40 = this.field1613.field4935 * var39 / var21 + arg3.field5983;
                    var41 = (this.field1631 * var12 + this.field1634 * var9 + this.field1617 * var48 >> 15) + this.field1616;
                    var42 = this.field1613.field4950 * var41 / var22 + arg3.field5989;
                    var43 = (this.field1620 * var12 + this.field1635 * var9 + this.field1621 * var48 >> 15) + this.field1612;
                    var44 = this.field1613.field4935 * var43 / var22 + arg3.field5983;
                }
                boolean var61 = var8.field1086 != -1 && this.method751(this.field1613.field4945.method186(var8.field1086, -9590).field6506);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field5986 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field5984 || var42 > arg3.field5984 || var34 > arg3.field5984;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field5985 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1086 >= 0) {
                                arg3.method2593(var40, var44, var36, var38, var42, var34, this.field1613.field4921, var15, var16, var14, var8.field1089, var8.field1088, var8.field1092, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1086);
                            } else {
                                arg3.method2588(var40, var44, var36, var38, var42, var34, class379.method2450(var8.field1089, var15 << 24 | this.field1613.field4921, -1037365176), class379.method2450(var8.field1088, var16 << 24 | this.field1613.field4921, -1037365176), class379.method2450(var8.field1092, var14 << 24 | this.field1613.field4921, -1037365176));
                            }
                        } else if (var8.field1086 >= 0) {
                            arg3.method2587(var40, var44, var36, var38, var42, var34, var8.field1089, var8.field1088, var8.field1092, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1086);
                        } else {
                            arg3.method2588(var40, var44, var36, var38, var42, var34, var8.field1089, var8.field1088, var8.field1092);
                        }
                        arg3.field5985 = 0;
                    } else {
                        arg3.method2589(var40, var44, var36, var38, var42, var34, this.field1613.field4921);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field5986 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field5984 || var34 > arg3.field5984 || var42 > arg3.field5984;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field5985 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1086 >= 0) {
                                arg3.method2593(var32, var36, var44, var30, var34, var42, this.field1613.field4921, var13, var14, var16, var8.field1090, var8.field1092, var8.field1088, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1086);
                            } else {
                                arg3.method2588(var32, var36, var44, var30, var34, var42, class379.method2450(var8.field1090, var13 << 24 | this.field1613.field4921, -1037365176), class379.method2450(var8.field1092, var14 << 24 | this.field1613.field4921, -1037365176), class379.method2450(var8.field1088, var16 << 24 | this.field1613.field4921, -1037365176));
                            }
                        } else if (var8.field1086 >= 0) {
                            arg3.method2587(var32, var36, var44, var30, var34, var42, var8.field1090, var8.field1092, var8.field1088, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1086);
                        } else {
                            arg3.method2588(var32, var36, var44, var30, var34, var42, var8.field1090, var8.field1092, var8.field1088);
                        }
                        arg3.field5985 = 0;
                        return;
                    }
                    arg3.method2589(var32, var36, var44, var30, var34, var42, this.field1613.field4921);
                }
            }
        } else {
            class358 var64 = this.field1626[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5178; ++var65) {
                    short var105 = var64.field5172[var65];
                    int var106 = var64.field5179[var65];
                    short var107 = var64.field5173[var65];
                    int var108 = (this.field1625 * var107 + this.field1632 * var106 + this.field1628 * var105 >> 15) + this.field1614;
                    if (var108 <= this.field1613.field4940) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1613.field4956;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5177[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1613.field4942) {
                        int var111 = var108 - this.field1613.field4956;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1631 * var107 + this.field1634 * var105 + this.field1617 * var106 >> 15) + this.field1616;
                    int var113 = (this.field1620 * var107 + this.field1635 * var105 + this.field1621 * var106 >> 15) + this.field1612;
                    arg4[var65] = this.field1613.field4950 * var112 / var108 + arg3.field5989;
                    arg5[var65] = this.field1613.field4935 * var113 / var108 + arg3.field5983;
                }
                if (var64.field5180 != null) {
                    int var66 = this.field1624[arg0][arg1];
                    int var67 = this.field1624[arg0 + 1][arg1];
                    int var68 = this.field1624[arg0][arg1 + 1];
                    int var69 = this.field1615 * arg0;
                    int var70 = this.field1615 + var69;
                    int var71 = this.field1615 * arg1;
                    int var72 = this.field1615 + var71;
                    int var73 = (this.field1631 * var71 + this.field1634 * var69 + this.field1617 * var66 >> 15) + this.field1616;
                    int var74 = (this.field1620 * var71 + this.field1635 * var69 + this.field1621 * var66 >> 15) + this.field1612;
                    int var75 = (this.field1625 * var71 + this.field1632 * var66 + this.field1628 * var69 >> 15) + this.field1614;
                    int var76 = (this.field1631 * var71 + this.field1634 * var70 + this.field1617 * var67 >> 15) + this.field1616;
                    int var77 = (this.field1620 * var71 + this.field1635 * var70 + this.field1621 * var67 >> 15) + this.field1612;
                    int var78 = (this.field1625 * var71 + this.field1632 * var67 + this.field1628 * var70 >> 15) + this.field1614;
                    int var79 = (this.field1631 * var72 + this.field1634 * var69 + this.field1617 * var68 >> 15) + this.field1616;
                    int var80 = (this.field1620 * var72 + this.field1635 * var69 + this.field1621 * var68 >> 15) + this.field1612;
                    int var81 = (this.field1625 * var72 + this.field1632 * var68 + this.field1628 * var69 >> 15) + this.field1614;
                    for (int var82 = 0; var82 < var64.field5171; ++var82) {
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
                            arg3.field5986 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field5984 || var87 > arg3.field5984 || var88 > arg3.field5984;
                            short var93 = var64.field5180[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method751(this.field1613.field4945.method186(var93, -9590).field6506)) {
                                    arg3.field5985 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2593(var89, var90, var91, var86, var87, var88, this.field1613.field4921, arg6[var83], arg6[var84], arg6[var85], var64.field5174[var83], var64.field5174[var84], var64.field5174[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5174[var83] & 16777215) != 0) {
                                        arg3.method2588(var89, var90, var91, var86, var87, var88, class379.method2450(var64.field5174[var83], arg6[var83] << 24 | this.field1613.field4921, -1037365176), class379.method2450(var64.field5174[var84], arg6[var84] << 24 | this.field1613.field4921, -1037365176), class379.method2450(var64.field5174[var85], arg6[var85] << 24 | this.field1613.field4921, -1037365176));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2587(var89, var90, var91, var86, var87, var88, var64.field5174[var83], var64.field5174[var84], var64.field5174[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5174[var83] & 16777215) != 0) {
                                    arg3.method2588(var89, var90, var91, var86, var87, var88, var64.field5174[var83], var64.field5174[var84], var64.field5174[var85]);
                                }
                                arg3.field5985 = 0;
                            } else {
                                arg3.method2589(var89, var90, var91, var86, var87, var88, this.field1613.field4921);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5171; ++var94) {
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
                        arg3.field5986 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field5984 || var99 > arg3.field5984 || var100 > arg3.field5984;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5174[var95] & 16777215) != 0) {
                                    arg3.method2588(var101, var102, var103, var98, var99, var100, class73.method536(14639, this.field1613.field4921, arg6[var95], var64.field5174[var95]), class73.method536(14639, this.field1613.field4921, arg6[var96], var64.field5174[var96]), class73.method536(14639, this.field1613.field4921, arg6[var97], var64.field5174[var97]));
                                }
                            } else if ((var64.field5174[var95] & 16777215) != 0) {
                                arg3.method2588(var101, var102, var103, var98, var99, var100, var64.field5174[var95], var64.field5174[var96], var64.field5174[var97]);
                            }
                        } else {
                            arg3.method2589(var101, var102, var103, var98, var99, var100, this.field1613.field4921);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILri;)Lri;", line = 2092)
    public final class98 method756(int arg0, int arg1, class98 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(Lri;IIIIZ)V", line = 2095)
    public final void method757(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }
}
