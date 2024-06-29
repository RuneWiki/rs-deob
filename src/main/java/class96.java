import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class96 extends class126 {

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Ljn;")
    private class396 field1503;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[[I")
    public int[][] field1508;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[[I")
    private int[][] field1501;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "[[B")
    private byte[][] field1509;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "[[B")
    private byte[][] field1517;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "[[Lls;")
    private class296[][] field1504;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[[Leg;")
    private class363[][] field1497;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "[[Lh;")
    private class427[][] field1515;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "[[Le;")
    private class97[][] field1516;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Z")
    private final boolean method793(int arg0) {
        if ((this.field1510 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)I")
    public final int method794(int arg0, int arg1) {
        return this.field1508[arg0][arg1];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class73 var9 = this.field1503.method2517(Thread.currentThread());
        class434 var10 = var9.field1221;
        var10.field6328 = 0;
        var10.field6329 = false;
        if (this.field1504 != null) {
            this.method807(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1247, var9.field1228);
        } else {
            if (this.field1515 != null) {
                this.method803(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field1247, var9.field1228);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljn;IIII[[I[[II)V")
    public class96(class396 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1503 = arg0;
        this.field1510 = arg2;
        this.field1508 = arg5;
        this.field1501 = arg6;
        this.field1512 = arg7;
        this.field1498 = 0;
        while (arg7 > 1) {
            ++this.field1498;
            arg7 >>= 1;
        }
        this.field1509 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1503.field5782 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1508[var11 + 1][var10] - this.field1508[var11 - 1][var10];
                int var14 = this.field1508[var11][var10 + 1] - this.field1508[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1503.field5765 * var18 + this.field1503.field5798 * var17 + this.field1503.field5778 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1509[var11][var10] = (byte) var20;
            }
        }
        this.field1517 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public final void method796() {
        this.field1509 = null;
        this.field1517 = null;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(II)I")
    private static final int method797(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lsr;IIIIZ)V")
    public final void method798(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method799(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1515 == null) {
            this.field1515 = new class427[super.field2037][super.field2045];
            this.field1497 = new class363[super.field2037][super.field2045];
        } else if (this.field1504 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1512 != var18 || var19 != 0 && this.field1512 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class363 var20 = new class363();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field5174 = var21;
            var20.field5166 = new short[var21];
            var20.field5167 = new int[var21];
            var20.field5177 = new int[var21];
            var20.field5176 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field5166[var23] = (short) (this.field1509[arg0][arg1] - this.field1517[arg0][arg1]);
                } else if (var28 == 0 && this.field1512 == var29) {
                    var20.field5166[var23] = (short) (this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]);
                } else if (this.field1512 == var28 && this.field1512 == var29) {
                    var20.field5166[var23] = (short) (this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]);
                } else if (this.field1512 == var28 && var29 == 0) {
                    var20.field5166[var23] = (short) (this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]) * var28 + (this.field1509[arg0][arg1] - this.field1517[arg0][arg1]) * (this.field1512 - var28);
                    int var31 = (this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]) * var28 + (this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]) * (this.field1512 - var28);
                    var20.field5166[var23] = (short) ((this.field1512 - var29) * var30 + var29 * var31 >> this.field1498 * 2);
                }
                int var32 = (arg0 << this.field1498) + var28;
                int var33 = (arg1 << this.field1498) + var29;
                var20.field5167[var23] = var32;
                var20.field5176[var23] = var33;
                var20.field5177[var23] = this.method809(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field5166[var23] < 2) {
                    var20.field5166[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1503.field5781.method1412(arg10[var26], (byte) -77).field2922) {
                    var24 = true;
                }
            }
            var20.field5173 = new int[var25];
            if (arg9 != null) {
                var20.field5171 = new int[var25];
            }
            var20.field5169 = new short[var25];
            var20.field5165 = new short[var25];
            var20.field5170 = new short[var25];
            if (var24) {
                var20.field5172 = new short[var25];
                var20.field5168 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field5173[var20.field5175] = class231.method1719(-24927, arg8[var27]);
                    } else {
                        var20.field5173[var20.field5175] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field5171[var20.field5175] = class231.method1719(-24927, arg9[var27]);
                        } else {
                            var20.field5171[var20.field5175] = -1;
                        }
                    }
                    var20.field5169[var20.field5175] = (short) arg5[var27];
                    var20.field5165[var20.field5175] = (short) arg6[var27];
                    var20.field5170[var20.field5175] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1503.field5781.method1412(arg10[var27], (byte) -91).field2922) {
                            var20.field5172[var20.field5175] = (short) arg10[var27];
                            var20.field5168[var20.field5175] = (short) arg11[var27];
                        } else {
                            var20.field5172[var20.field5175] = -1;
                        }
                    }
                    ++var20.field5175;
                }
            }
            this.field1497[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class427 var34 = new class427();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field6188 = class78.method620(126, class231.method1719(-24927, arg9[0]), this.field1509[arg0][arg1] - this.field1517[arg0][arg1]);
                    if (var35 == -1) {
                        var34.field6190 = (byte) (var34.field6190 | 2);
                    }
                }
                if (this.field1508[arg0 + 1][arg1] == this.field1508[arg0][arg1] && this.field1508[arg0 + 1][arg1 + 1] == this.field1508[arg0][arg1] && this.field1508[arg0][arg1 + 1] == this.field1508[arg0][arg1]) {
                    var34.field6190 = (byte) (var34.field6190 | 1);
                }
                if (var36 != -1 && (var34.field6190 & 2) == 0 && !this.field1503.field5781.method1412(var36, (byte) -75).field2922) {
                    var34.field6194 = (short) (this.field1509[arg0][arg1] - this.field1517[arg0][arg1]);
                    var34.field6189 = (short) (this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]);
                    var34.field6193 = (short) (this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]);
                    var34.field6192 = (short) (this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]);
                    var34.field6191 = (short) var36;
                } else {
                    short var37 = class231.method1719(-24927, var35);
                    var34.field6194 = (short) class78.method620(126, var37, this.field1509[arg0][arg1] - this.field1517[arg0][arg1]);
                    var34.field6189 = (short) class78.method620(126, var37, this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]);
                    var34.field6193 = (short) class78.method620(126, var37, this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]);
                    var34.field6192 = (short) class78.method620(126, var37, this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]);
                    var34.field6191 = -1;
                }
                this.field1515[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public final void method800(int arg0, int arg1, int arg2) {
        if (this.field1517[arg0][arg1] < arg2) {
            this.field1517[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILsr;)Lsr;")
    public final class135 method801(int arg0, int arg1, class135 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Lsr;IIIIZ)Z")
    public final boolean method802(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIII[[ZLah;[I[I)V")
    private final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class434 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6334 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1515[var16][var17] != null) {
                        class427 var18 = this.field1515[var16][var17];
                        if (var18.field6191 != -1 && (var18.field6190 & 2) == 0 && var18.field6188 == -1) {
                            int var19 = this.field1503.method2518(var18.field6191);
                            arg8.method2715(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class78.method620(126, var19, var18.field6193 & 65535), class78.method620(126, var19, var18.field6192 & 65535), class78.method620(126, var19, var18.field6189 & 65535));
                            arg8.method2715(var15, var15, var15 - var13, var14, var13 + var14, var14, class78.method620(126, var19, var18.field6194 & 65535), class78.method620(126, var19, var18.field6189 & 65535), class78.method620(126, var19, var18.field6192 & 65535));
                        } else if (var18.field6188 == -1) {
                            arg8.method2715(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6193 & 65535, var18.field6192 & 65535, var18.field6189 & 65535);
                            arg8.method2715(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6194 & 65535, var18.field6189 & 65535, var18.field6192 & 65535);
                        } else {
                            int var20 = var18.field6188;
                            arg8.method2715(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2715(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1497[var16][var17] != null) {
                        class363 var21 = this.field1497[var16][var17];
                        for (int var22 = 0; var22 < var21.field5174; ++var22) {
                            arg9[var22] = (var21.field5167[var22] - this.field1512 * var16) * var13 / this.field1512 + var14;
                            arg10[var22] = var15 - (var21.field5176[var22] - this.field1512 * var17) * var13 / this.field1512;
                        }
                        for (int var23 = 0; var23 < var21.field5175; ++var23) {
                            short var24 = var21.field5169[var23];
                            short var25 = var21.field5165[var23];
                            short var26 = var21.field5170[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5171 != null && var21.field5171[var23] != -1) {
                                int var33 = var21.field5171[var23];
                                arg8.method2715(var30, var31, var32, var27, var28, var29, class78.method620(126, var33, var21.field5166[var24]), class78.method620(126, var33, var21.field5166[var25]), class78.method620(126, var33, var21.field5166[var26]));
                            } else if (var21.field5172 != null && var21.field5172[var23] != -1) {
                                int var34 = this.field1503.method2518(var21.field5172[var23]);
                                arg8.method2715(var30, var31, var32, var27, var28, var29, class78.method620(126, var34, var21.field5166[var24]), class78.method620(126, var34, var21.field5166[var25]), class78.method620(126, var34, var21.field5166[var26]));
                            } else {
                                int var35 = var21.field5173[var23];
                                arg8.method2715(var30, var31, var32, var27, var28, var29, class78.method620(126, var35, var21.field5166[var24]), class78.method620(126, var35, var21.field5166[var25]), class78.method620(126, var35, var21.field5166[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6334 = true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIZLah;[I[I[I)V")
    private final void method804(int arg0, int arg1, boolean arg2, class434 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class296 var8 = this.field1504[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4389 & 2) == 0) {
                int var9 = this.field1512 * arg0;
                int var10 = this.field1512 + var9;
                int var11 = this.field1512 * arg1;
                int var12 = this.field1512 + var11;
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
                if ((var8.field4389 & 1) != 0 && !arg2) {
                    int var17 = this.field1508[arg0][arg1];
                    int var18 = this.field1494 * var17;
                    var19 = (this.field1511 * var11 + this.field1505 * var9 + var18 >> 15) + this.field1496;
                    if (var19 <= this.field1503.field5775) {
                        return;
                    }
                    var20 = (this.field1511 * var11 + this.field1505 * var10 + var18 >> 15) + this.field1496;
                    if (var20 <= this.field1503.field5775) {
                        return;
                    }
                    var21 = (this.field1511 * var12 + this.field1505 * var10 + var18 >> 15) + this.field1496;
                    if (var21 <= this.field1503.field5775) {
                        return;
                    }
                    var22 = (this.field1511 * var12 + this.field1505 * var9 + var18 >> 15) + this.field1496;
                    if (var22 <= this.field1503.field5775) {
                        return;
                    }
                    if (this.field1503.field5787) {
                        int var23 = var19 - this.field1503.field5793;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1503.field5793;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1503.field5793;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1503.field5793;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1507 * var17;
                    int var28 = this.field1502 * var17;
                    var29 = (this.field1495 * var11 + this.field1513 * var9 + var27 >> 15) + this.field1499;
                    var30 = this.field1503.field5805 * var29 / var19 + arg3.field6337;
                    var31 = (this.field1514 * var11 + this.field1506 * var9 + var28 >> 15) + this.field1500;
                    var32 = this.field1503.field5784 * var31 / var19 + arg3.field6336;
                    var33 = (this.field1495 * var11 + this.field1513 * var10 + var27 >> 15) + this.field1499;
                    var34 = this.field1503.field5805 * var33 / var20 + arg3.field6337;
                    var35 = (this.field1514 * var11 + this.field1506 * var10 + var28 >> 15) + this.field1500;
                    var36 = this.field1503.field5784 * var35 / var20 + arg3.field6336;
                    var37 = (this.field1495 * var12 + this.field1513 * var10 + var27 >> 15) + this.field1499;
                    var38 = this.field1503.field5805 * var37 / var21 + arg3.field6337;
                    var39 = (this.field1514 * var12 + this.field1506 * var10 + var28 >> 15) + this.field1500;
                    var40 = this.field1503.field5784 * var39 / var21 + arg3.field6336;
                    var41 = (this.field1495 * var12 + this.field1513 * var9 + var27 >> 15) + this.field1499;
                    var42 = this.field1503.field5805 * var41 / var22 + arg3.field6337;
                    var43 = (this.field1514 * var12 + this.field1506 * var9 + var28 >> 15) + this.field1500;
                    var44 = this.field1503.field5784 * var43 / var22 + arg3.field6336;
                } else {
                    int var45 = this.field1508[arg0][arg1];
                    int var46 = this.field1508[arg0 + 1][arg1];
                    int var47 = this.field1508[arg0 + 1][arg1 + 1];
                    int var48 = this.field1508[arg0][arg1 + 1];
                    var19 = (this.field1511 * var11 + this.field1505 * var9 + this.field1494 * var45 >> 15) + this.field1496;
                    if (var19 <= this.field1503.field5775) {
                        return;
                    }
                    var20 = (this.field1511 * var11 + this.field1505 * var10 + this.field1494 * var46 >> 15) + this.field1496;
                    if (var20 <= this.field1503.field5775) {
                        return;
                    }
                    var21 = (this.field1511 * var12 + this.field1505 * var10 + this.field1494 * var47 >> 15) + this.field1496;
                    if (var21 <= this.field1503.field5775) {
                        return;
                    }
                    var22 = (this.field1511 * var12 + this.field1505 * var9 + this.field1494 * var48 >> 15) + this.field1496;
                    if (var22 <= this.field1503.field5775) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1503.field5793;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1501[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1503.field5793;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1501[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1503.field5793;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1501[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1503.field5793;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1501[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1503.field5787) {
                        int var57 = var19 - this.field1503.field5793;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1503.field5793;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1503.field5793;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1503.field5793;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1495 * var11 + this.field1513 * var9 + this.field1507 * var45 >> 15) + this.field1499;
                    var30 = this.field1503.field5805 * var29 / var19 + arg3.field6337;
                    var31 = (this.field1514 * var11 + this.field1506 * var9 + this.field1502 * var45 >> 15) + this.field1500;
                    var32 = this.field1503.field5784 * var31 / var19 + arg3.field6336;
                    var33 = (this.field1495 * var11 + this.field1513 * var10 + this.field1507 * var46 >> 15) + this.field1499;
                    var34 = this.field1503.field5805 * var33 / var20 + arg3.field6337;
                    var35 = (this.field1514 * var11 + this.field1506 * var10 + this.field1502 * var46 >> 15) + this.field1500;
                    var36 = this.field1503.field5784 * var35 / var20 + arg3.field6336;
                    var37 = (this.field1495 * var12 + this.field1513 * var10 + this.field1507 * var47 >> 15) + this.field1499;
                    var38 = this.field1503.field5805 * var37 / var21 + arg3.field6337;
                    var39 = (this.field1514 * var12 + this.field1506 * var10 + this.field1502 * var47 >> 15) + this.field1500;
                    var40 = this.field1503.field5784 * var39 / var21 + arg3.field6336;
                    var41 = (this.field1495 * var12 + this.field1513 * var9 + this.field1507 * var48 >> 15) + this.field1499;
                    var42 = this.field1503.field5805 * var41 / var22 + arg3.field6337;
                    var43 = (this.field1514 * var12 + this.field1506 * var9 + this.field1502 * var48 >> 15) + this.field1500;
                    var44 = this.field1503.field5784 * var43 / var22 + arg3.field6336;
                }
                boolean var61 = var8.field4390 != -1 && this.method793(this.field1503.field5781.method1412(var8.field4390, (byte) -78).field2930);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6329 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6339 || var42 > arg3.field6339 || var34 > arg3.field6339;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6328 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field4390 >= 0) {
                                arg3.method2714(var40, var44, var36, var38, var42, var34, this.field1503.field5795, var15, var16, var14, var8.field4386, var8.field4385, var8.field4388, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4390);
                            } else {
                                arg3.method2713(var40, var44, var36, var38, var42, var34, class71.method576(var15 << 24 | this.field1503.field5795, var8.field4386, (byte) -102), class71.method576(var16 << 24 | this.field1503.field5795, var8.field4385, (byte) -102), class71.method576(var14 << 24 | this.field1503.field5795, var8.field4388, (byte) -102));
                            }
                        } else if (var8.field4390 >= 0) {
                            arg3.method2716(var40, var44, var36, var38, var42, var34, var8.field4386, var8.field4385, var8.field4388, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4390);
                        } else {
                            arg3.method2713(var40, var44, var36, var38, var42, var34, var8.field4386, var8.field4385, var8.field4388);
                        }
                        arg3.field6328 = 0;
                    } else {
                        arg3.method2717(var40, var44, var36, var38, var42, var34, this.field1503.field5795);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6329 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6339 || var34 > arg3.field6339 || var42 > arg3.field6339;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6328 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field4390 >= 0) {
                                arg3.method2714(var32, var36, var44, var30, var34, var42, this.field1503.field5795, var13, var14, var16, var8.field4387, var8.field4388, var8.field4385, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4390);
                            } else {
                                arg3.method2713(var32, var36, var44, var30, var34, var42, class71.method576(var13 << 24 | this.field1503.field5795, var8.field4387, (byte) -102), class71.method576(var14 << 24 | this.field1503.field5795, var8.field4388, (byte) -102), class71.method576(var16 << 24 | this.field1503.field5795, var8.field4385, (byte) -102));
                            }
                        } else if (var8.field4390 >= 0) {
                            arg3.method2716(var32, var36, var44, var30, var34, var42, var8.field4387, var8.field4388, var8.field4385, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4390);
                        } else {
                            arg3.method2713(var32, var36, var44, var30, var34, var42, var8.field4387, var8.field4388, var8.field4385);
                        }
                        arg3.field6328 = 0;
                        return;
                    }
                    arg3.method2717(var32, var36, var44, var30, var34, var42, this.field1503.field5795);
                }
            }
        } else {
            class97 var64 = this.field1516[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field1524; ++var65) {
                    short var105 = var64.field1522[var65];
                    int var106 = var64.field1520[var65];
                    short var107 = var64.field1527[var65];
                    int var108 = (this.field1511 * var107 + this.field1505 * var105 + this.field1494 * var106 >> 15) + this.field1496;
                    if (var108 <= this.field1503.field5775) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1503.field5793;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field1523[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1503.field5787) {
                        int var111 = var108 - this.field1503.field5793;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1495 * var107 + this.field1513 * var105 + this.field1507 * var106 >> 15) + this.field1499;
                    int var113 = (this.field1514 * var107 + this.field1506 * var105 + this.field1502 * var106 >> 15) + this.field1500;
                    arg4[var65] = this.field1503.field5805 * var112 / var108 + arg3.field6337;
                    arg5[var65] = this.field1503.field5784 * var113 / var108 + arg3.field6336;
                }
                if (var64.field1525 != null) {
                    int var66 = this.field1508[arg0][arg1];
                    int var67 = this.field1508[arg0 + 1][arg1];
                    int var68 = this.field1508[arg0][arg1 + 1];
                    int var69 = this.field1512 * arg0;
                    int var70 = this.field1512 + var69;
                    int var71 = this.field1512 * arg1;
                    int var72 = this.field1512 + var71;
                    int var73 = (this.field1495 * var71 + this.field1513 * var69 + this.field1507 * var66 >> 15) + this.field1499;
                    int var74 = (this.field1514 * var71 + this.field1506 * var69 + this.field1502 * var66 >> 15) + this.field1500;
                    int var75 = (this.field1511 * var71 + this.field1505 * var69 + this.field1494 * var66 >> 15) + this.field1496;
                    int var76 = (this.field1495 * var71 + this.field1513 * var70 + this.field1507 * var67 >> 15) + this.field1499;
                    int var77 = (this.field1514 * var71 + this.field1506 * var70 + this.field1502 * var67 >> 15) + this.field1500;
                    int var78 = (this.field1511 * var71 + this.field1505 * var70 + this.field1494 * var67 >> 15) + this.field1496;
                    int var79 = (this.field1495 * var72 + this.field1513 * var69 + this.field1507 * var68 >> 15) + this.field1499;
                    int var80 = (this.field1514 * var72 + this.field1506 * var69 + this.field1502 * var68 >> 15) + this.field1500;
                    int var81 = (this.field1511 * var72 + this.field1505 * var69 + this.field1494 * var68 >> 15) + this.field1496;
                    for (int var82 = 0; var82 < var64.field1526; ++var82) {
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
                            arg3.field6329 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field6339 || var87 > arg3.field6339 || var88 > arg3.field6339;
                            short var93 = var64.field1525[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method793(this.field1503.field5781.method1412(var93, (byte) -76).field2930)) {
                                    arg3.field6328 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method2714(var89, var90, var91, var86, var87, var88, this.field1503.field5795, arg6[var83], arg6[var84], arg6[var85], var64.field1521[var83], var64.field1521[var84], var64.field1521[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field1521[var83] & 16777215) != 0) {
                                        arg3.method2713(var89, var90, var91, var86, var87, var88, class71.method576(arg6[var83] << 24 | this.field1503.field5795, var64.field1521[var83], (byte) -102), class71.method576(arg6[var84] << 24 | this.field1503.field5795, var64.field1521[var84], (byte) -102), class71.method576(arg6[var85] << 24 | this.field1503.field5795, var64.field1521[var85], (byte) -102));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method2716(var89, var90, var91, var86, var87, var88, var64.field1521[var83], var64.field1521[var84], var64.field1521[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field1521[var83] & 16777215) != 0) {
                                    arg3.method2713(var89, var90, var91, var86, var87, var88, var64.field1521[var83], var64.field1521[var84], var64.field1521[var85]);
                                }
                                arg3.field6328 = 0;
                            } else {
                                arg3.method2717(var89, var90, var91, var86, var87, var88, this.field1503.field5795);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field1526; ++var94) {
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
                        arg3.field6329 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field6339 || var99 > arg3.field6339 || var100 > arg3.field6339;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field1521[var95] & 16777215) != 0) {
                                    arg3.method2713(var101, var102, var103, var98, var99, var100, class372.method2366(arg6[var95], this.field1503.field5795, var64.field1521[var95], 0), class372.method2366(arg6[var96], this.field1503.field5795, var64.field1521[var96], 0), class372.method2366(arg6[var97], this.field1503.field5795, var64.field1521[var97], 0));
                                }
                            } else if ((var64.field1521[var95] & 16777215) != 0) {
                                arg3.method2713(var101, var102, var103, var98, var99, var100, var64.field1521[var95], var64.field1521[var96], var64.field1521[var97]);
                            }
                        } else {
                            arg3.method2717(var101, var102, var103, var98, var99, var100, this.field1503.field5795);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method805(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1504 == null) {
            this.field1504 = new class296[super.field2037][super.field2045];
            this.field1516 = new class97[super.field2037][super.field2045];
        } else if (this.field1515 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class435.field6350[class231.method1719(-24927, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class435.field6350[class231.method1719(-24927, arg6[var14]) & 65535] << 8 | 255;
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
                    } else if (arg2[var20] == this.field1512 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1512 && arg4[var20] == this.field1512) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1512) {
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
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1512 != arg2[var22] && arg2[0] - this.field1512 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1512 != arg4[var22] && arg4[0] - this.field1512 != arg4[var22]) {
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
                class296 var23 = new class296();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field4391 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field4389 = (byte) (var23.field4389 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1508[arg0 + 1][arg1] == this.field1508[arg0][arg1] && this.field1508[arg0 + 1][arg1 + 1] == this.field1508[arg0][arg1] && this.field1508[arg0][arg1 + 1] == this.field1508[arg0][arg1]) {
                    var23.field4389 = (byte) (var23.field4389 | 1);
                }
                if (var25 != -1 && (var23.field4389 & 2) == 0 && !this.field1503.field5781.method1412(var25, (byte) -67).field2922) {
                    var23.field4387 = this.field1509[arg0][arg1] - this.field1517[arg0][arg1];
                    var23.field4388 = this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1];
                    var23.field4386 = this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1];
                    var23.field4385 = this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1];
                    var23.field4390 = (short) var25;
                } else {
                    int var26;
                    if (this.field1501 != null && arg10 != 0) {
                        var26 = this.field1501[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field4387 = class372.method2366(var26, arg9, method797(arg5[var16] >> 8, this.field1509[arg0][arg1] - this.field1517[arg0][arg1]), 0);
                    if (var23.field4391 != 0) {
                        var23.field4387 |= 255 - (this.field1509[arg0][arg1] - this.field1517[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1501 != null && arg10 != 0) {
                        var27 = this.field1501[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field4388 = class372.method2366(var27, arg9, method797(arg5[var17] >> 8, this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]), 0);
                    if (var23.field4391 != 0) {
                        var23.field4388 |= 255 - (this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1501 != null && arg10 != 0) {
                        var28 = this.field1501[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field4386 = class372.method2366(var28, arg9, method797(arg5[var18] >> 8, this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]), 0);
                    if (var23.field4391 != 0) {
                        var23.field4386 |= 255 - (this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1501 != null && arg10 != 0) {
                        var29 = this.field1501[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field4385 = class372.method2366(var29, arg9, method797(arg5[var19] >> 8, this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]), 0);
                    if (var23.field4391 != 0) {
                        var23.field4385 |= 255 - (this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]) << 25;
                    }
                    var23.field4390 = -1;
                }
                this.field1504[arg0][arg1] = var23;
            } else {
                class97 var30 = new class97();
                var30.field1524 = (short) arg2.length;
                var30.field1526 = (short) (arg2.length / 3);
                var30.field1522 = new short[var30.field1524];
                var30.field1520 = new short[var30.field1524];
                var30.field1527 = new short[var30.field1524];
                var30.field1521 = new int[var30.field1524];
                if (this.field1501 != null) {
                    var30.field1523 = new short[var30.field1524];
                }
                for (int var31 = 0; var31 < var30.field1524; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1509[arg0][arg1] - this.field1517[arg0][arg1];
                    } else if (var46 == 0 && this.field1512 == var47) {
                        var49 = this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1];
                    } else if (this.field1512 == var46 && this.field1512 == var47) {
                        var49 = this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1];
                    } else if (this.field1512 == var46 && var47 == 0) {
                        var49 = this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1509[arg0 + 1][arg1] - this.field1517[arg0 + 1][arg1]) * var46 + (this.field1509[arg0][arg1] - this.field1517[arg0][arg1]) * (this.field1512 - var46);
                        int var51 = (this.field1509[arg0 + 1][arg1 + 1] - this.field1517[arg0 + 1][arg1 + 1]) * var46 + (this.field1509[arg0][arg1 + 1] - this.field1517[arg0][arg1 + 1]) * (this.field1512 - var46);
                        var49 = (this.field1512 - var47) * var50 + var47 * var51 >> this.field1498 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1498) + var46);
                    short var53 = (short) ((arg1 << this.field1498) + var47);
                    var30.field1522[var31] = var52;
                    var30.field1527[var31] = var53;
                    var30.field1520[var31] = (short) (this.method809(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1503.field5781.method1412(arg7[var31], (byte) -101).field2922) {
                        var30.field1521[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field1521[var31] = var49 << 25;
                        } else {
                            var30.field1521[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1501 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1501[arg0][arg1];
                            } else if (var46 == 0 && this.field1512 == var47) {
                                var56 = this.field1501[arg0][arg1 + 1];
                            } else if (this.field1512 == var46 && this.field1512 == var47) {
                                var56 = this.field1501[arg0 + 1][arg1 + 1];
                            } else if (this.field1512 == var46 && var47 == 0) {
                                var56 = this.field1501[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1512 - var46) * this.field1501[arg0][arg1] + this.field1501[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1512 - var46) * this.field1501[arg0][arg1 + 1] + this.field1501[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1512 - var47) * var57 + var47 * var58 >> this.field1498 * 2;
                            }
                            var30.field1523[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field1521[var31] = class372.method2366(var54, arg9, method797(arg5[var31] >> 8, var49), 0);
                        if (arg6 != null) {
                            var30.field1521[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field1526; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1503.field5781.method1412(arg7[var33 * 3], (byte) -87).field2922) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field1518 = new int[var30.field1526];
                }
                if (var32) {
                    var30.field1525 = new short[var30.field1526];
                    var30.field1519 = new short[var30.field1526];
                }
                for (int var34 = 0; var34 < var30.field1526; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field1518[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1503.field5781.method1412(var40, (byte) -67).field2922) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1503.field5781.method1412(var41, (byte) -70).field2922) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1503.field5781.method1412(var42, (byte) -117).field2922) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field1525[var34] = (short) var42;
                            var30.field1519[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1503.field5781.method1412(var43, (byte) -71).field2922) {
                                    var30.field1521[var35] = class435.field6350[class231.method1719(-24927, this.field1503.field5781.method1412(var43, (byte) -109).field2918 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1503.field5781.method1412(var44, (byte) -98).field2922) {
                                    var30.field1521[var36] = class435.field6350[class231.method1719(-24927, this.field1503.field5781.method1412(var44, (byte) -67).field2918 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1503.field5781.method1412(var45, (byte) -124).field2922) {
                                    var30.field1521[var37] = class435.field6350[class231.method1719(-24927, this.field1503.field5781.method1412(var45, (byte) -112).field2918 & 65535) & 65535];
                                }
                            }
                            var30.field1525[var34] = -1;
                        }
                    }
                }
                this.field1516[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Luc;[I)V")
    public final void method806(class59 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIIIIII[[ZLah;[I[I)V")
    private final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class434 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6334 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1504[var16][var17] != null) {
                        class296 var18 = this.field1504[var16][var17];
                        if (var18.field4390 != -1 && (var18.field4389 & 2) == 0 && var18.field4391 == 0) {
                            int var19 = this.field1503.method2518(var18.field4390);
                            arg8.method2715(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class78.method620(126, var19, var18.field4386), class78.method620(126, var19, var18.field4385), class78.method620(126, var19, var18.field4388));
                            arg8.method2715(var15, var15, var15 - var13, var14, var13 + var14, var14, class78.method620(126, var19, var18.field4387), class78.method620(126, var19, var18.field4388), class78.method620(126, var19, var18.field4385));
                        } else if (var18.field4391 == 0) {
                            arg8.method2713(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4386, var18.field4385, var18.field4388);
                            arg8.method2713(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4387, var18.field4388, var18.field4385);
                        } else {
                            int var20 = var18.field4391;
                            arg8.method2713(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class71.method576(var18.field4386 & -16777216, var20, (byte) -102), class71.method576(var18.field4385 & -16777216, var20, (byte) -102), class71.method576(var18.field4388 & -16777216, var20, (byte) -102));
                            arg8.method2713(var15, var15, var15 - var13, var14, var13 + var14, var14, class71.method576(var18.field4387 & -16777216, var20, (byte) -102), class71.method576(var18.field4388 & -16777216, var20, (byte) -102), class71.method576(var18.field4385 & -16777216, var20, (byte) -102));
                        }
                    } else if (this.field1516[var16][var17] != null) {
                        class97 var21 = this.field1516[var16][var17];
                        for (int var22 = 0; var22 < var21.field1524; ++var22) {
                            arg9[var22] = (var21.field1522[var22] - this.field1512 * var16) * var13 / this.field1512 + var14;
                            arg10[var22] = var15 - (var21.field1527[var22] - this.field1512 * var17) * var13 / this.field1512;
                        }
                        for (int var23 = 0; var23 < var21.field1526; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field1518 == null || var21.field1518[var23] == 0 || var21.field1525 != null && (var21.field1525 == null || var21.field1525[var23] != -1)) {
                                if (var21.field1525 != null && var21.field1525[var23] != -1) {
                                    int var34 = this.field1503.method2518(var21.field1525[var23]);
                                    arg8.method2715(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2713(var30, var31, var32, var27, var28, var29, var21.field1521[var24], var21.field1521[var25], var21.field1521[var26]);
                                }
                            } else {
                                int var33 = var21.field1518[var23];
                                arg8.method2713(var30, var31, var32, var27, var28, var29, class71.method576(-16777216 - (var21.field1521[var24] & -16777216), var33, (byte) -102), class71.method576(-16777216 - (var21.field1521[var25] & -16777216), var33, (byte) -102), class71.method576(-16777216 - (var21.field1521[var26] & -16777216), var33, (byte) -102));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6334 = true;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V")
    public final void method808(int arg0, int arg1) {
        class73 var3 = this.field1503.method2517(Thread.currentThread());
        var3.field1221.field6328 = 0;
        if (this.field1504 != null) {
            this.method804(arg0, arg1, this.field1503.field5766, var3.field1221, var3.field1247, var3.field1228, var3.field1231);
        } else {
            if (this.field1515 != null) {
                this.method810(arg0, arg1, var3.field1221, var3.field1247, var3.field1228, var3.field1231);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)I")
    public final int method809(int arg0, int arg1) {
        int var3 = arg0 >> this.field1498;
        int var4 = arg1 >> this.field1498;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2037 - 1 && var4 <= super.field2045 - 1) {
            int var5 = arg0 & this.field1512 - 1;
            int var6 = arg1 & this.field1512 - 1;
            int var7 = (this.field1512 - var5) * this.field1508[var3][var4] + this.field1508[var3 + 1][var4] * var5 >> this.field1498;
            int var8 = (this.field1512 - var5) * this.field1508[var3][var4 + 1] + this.field1508[var3 + 1][var4 + 1] * var5 >> this.field1498;
            return (this.field1512 - var6) * var7 + var6 * var8 >> this.field1498;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILah;[I[I[I)V")
    private final void method810(int arg0, int arg1, class434 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class427 var7 = this.field1515[arg0][arg1];
        if (var7 != null) {
            if ((var7.field6190 & 2) == 0) {
                int var8 = this.field1512 * arg0;
                int var9 = this.field1512 + var8;
                int var10 = this.field1512 * arg1;
                int var11 = this.field1512 + var10;
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
                if ((var7.field6190 & 1) != 0) {
                    int var12 = this.field1508[arg0][arg1];
                    int var13 = this.field1494 * var12;
                    var14 = (this.field1511 * var10 + this.field1505 * var8 + var13 >> 15) + this.field1496;
                    if (var14 <= this.field1503.field5775) {
                        return;
                    }
                    var15 = (this.field1511 * var10 + this.field1505 * var9 + var13 >> 15) + this.field1496;
                    if (var15 <= this.field1503.field5775) {
                        return;
                    }
                    int var16 = (this.field1511 * var11 + this.field1505 * var9 + var13 >> 15) + this.field1496;
                    if (var16 <= this.field1503.field5775) {
                        return;
                    }
                    var17 = (this.field1511 * var11 + this.field1505 * var8 + var13 >> 15) + this.field1496;
                    if (var17 <= this.field1503.field5775) {
                        return;
                    }
                    int var18 = this.field1507 * var12;
                    int var19 = this.field1502 * var12;
                    var20 = (this.field1495 * var10 + this.field1513 * var8 + var18 >> 15) + this.field1499;
                    var21 = this.field1503.field5805 * var20 / var14 + arg2.field6337;
                    var22 = (this.field1514 * var10 + this.field1506 * var8 + var19 >> 15) + this.field1500;
                    var23 = this.field1503.field5784 * var22 / var14 + arg2.field6336;
                    var24 = (this.field1495 * var10 + this.field1513 * var9 + var18 >> 15) + this.field1499;
                    var25 = this.field1503.field5805 * var24 / var15 + arg2.field6337;
                    var26 = (this.field1514 * var10 + this.field1506 * var9 + var19 >> 15) + this.field1500;
                    var27 = this.field1503.field5784 * var26 / var15 + arg2.field6336;
                    int var28 = (this.field1495 * var11 + this.field1513 * var9 + var18 >> 15) + this.field1499;
                    var29 = this.field1503.field5805 * var28 / var16 + arg2.field6337;
                    int var30 = (this.field1514 * var11 + this.field1506 * var9 + var19 >> 15) + this.field1500;
                    var31 = this.field1503.field5784 * var30 / var16 + arg2.field6336;
                    var32 = (this.field1495 * var11 + this.field1513 * var8 + var18 >> 15) + this.field1499;
                    var33 = this.field1503.field5805 * var32 / var17 + arg2.field6337;
                    var34 = (this.field1514 * var11 + this.field1506 * var8 + var19 >> 15) + this.field1500;
                    var35 = this.field1503.field5784 * var34 / var17 + arg2.field6336;
                } else {
                    int var36 = this.field1508[arg0][arg1];
                    int var37 = this.field1508[arg0 + 1][arg1];
                    int var38 = this.field1508[arg0 + 1][arg1 + 1];
                    int var39 = this.field1508[arg0][arg1 + 1];
                    var14 = (this.field1511 * var10 + this.field1505 * var8 + this.field1494 * var36 >> 15) + this.field1496;
                    if (var14 <= this.field1503.field5775) {
                        return;
                    }
                    var15 = (this.field1511 * var10 + this.field1505 * var9 + this.field1494 * var37 >> 15) + this.field1496;
                    if (var15 <= this.field1503.field5775) {
                        return;
                    }
                    int var40 = (this.field1511 * var11 + this.field1505 * var9 + this.field1494 * var38 >> 15) + this.field1496;
                    if (var40 <= this.field1503.field5775) {
                        return;
                    }
                    var17 = (this.field1511 * var11 + this.field1505 * var8 + this.field1494 * var39 >> 15) + this.field1496;
                    if (var17 <= this.field1503.field5775) {
                        return;
                    }
                    var20 = (this.field1495 * var10 + this.field1513 * var8 + this.field1507 * var36 >> 15) + this.field1499;
                    var21 = this.field1503.field5805 * var20 / var14 + arg2.field6337;
                    var22 = (this.field1514 * var10 + this.field1506 * var8 + this.field1502 * var36 >> 15) + this.field1500;
                    var23 = this.field1503.field5784 * var22 / var14 + arg2.field6336;
                    var24 = (this.field1495 * var10 + this.field1513 * var9 + this.field1507 * var37 >> 15) + this.field1499;
                    var25 = this.field1503.field5805 * var24 / var15 + arg2.field6337;
                    var26 = (this.field1514 * var10 + this.field1506 * var9 + this.field1502 * var37 >> 15) + this.field1500;
                    var27 = this.field1503.field5784 * var26 / var15 + arg2.field6336;
                    int var41 = (this.field1495 * var11 + this.field1513 * var9 + this.field1507 * var38 >> 15) + this.field1499;
                    var29 = this.field1503.field5805 * var41 / var40 + arg2.field6337;
                    int var42 = (this.field1514 * var11 + this.field1506 * var9 + this.field1502 * var38 >> 15) + this.field1500;
                    var31 = this.field1503.field5784 * var42 / var40 + arg2.field6336;
                    var32 = (this.field1495 * var11 + this.field1513 * var8 + this.field1507 * var39 >> 15) + this.field1499;
                    var33 = this.field1503.field5805 * var32 / var17 + arg2.field6337;
                    var34 = (this.field1514 * var11 + this.field1506 * var8 + this.field1502 * var39 >> 15) + this.field1500;
                    var35 = this.field1503.field5784 * var34 / var17 + arg2.field6336;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6329 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6339 || var33 > arg2.field6339 || var25 > arg2.field6339;
                    if (var7.field6191 >= 0) {
                        if (this.method793(this.field1503.field5781.method1412(var7.field6191, (byte) -107).field2930)) {
                            arg2.field6328 = 100;
                        }
                        arg2.method2716(var31, var35, var27, var29, var33, var25, var7.field6193 & 65535, var7.field6192 & 65535, var7.field6189 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6191);
                        arg2.field6328 = 0;
                    } else {
                        arg2.method2715(var31, var35, var27, var29, var33, var25, var7.field6193 & 65535, var7.field6192 & 65535, var7.field6189 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6329 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6339 || var25 > arg2.field6339 || var33 > arg2.field6339;
                    if (var7.field6191 >= 0) {
                        if (this.method793(this.field1503.field5781.method1412(var7.field6191, (byte) -105).field2930)) {
                            arg2.field6328 = 100;
                        }
                        arg2.method2716(var23, var27, var35, var21, var25, var33, var7.field6194 & 65535, var7.field6189 & 65535, var7.field6192 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field6191);
                        arg2.field6328 = 0;
                        return;
                    }
                    arg2.method2715(var23, var27, var35, var21, var25, var33, var7.field6194 & 65535, var7.field6189 & 65535, var7.field6192 & 65535);
                }
            }
        } else {
            class363 var43 = this.field1497[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field5174; ++var44) {
                    int var84 = var43.field5167[var44];
                    int var85 = var43.field5177[var44];
                    int var86 = var43.field5176[var44];
                    int var87 = (this.field1511 * var86 + this.field1505 * var84 + this.field1494 * var85 >> 15) + this.field1496;
                    if (var87 <= this.field1503.field5775) {
                        return;
                    }
                    int var88 = (this.field1495 * var86 + this.field1513 * var84 + this.field1507 * var85 >> 15) + this.field1499;
                    int var89 = (this.field1514 * var86 + this.field1506 * var84 + this.field1502 * var85 >> 15) + this.field1500;
                    arg3[var44] = this.field1503.field5805 * var88 / var87 + arg2.field6337;
                    arg4[var44] = this.field1503.field5784 * var89 / var87 + arg2.field6336;
                }
                if (var43.field5172 != null) {
                    int var45 = this.field1508[arg0][arg1];
                    int var46 = this.field1508[arg0 + 1][arg1];
                    int var47 = this.field1508[arg0][arg1 + 1];
                    int var48 = this.field1512 * arg0;
                    int var49 = this.field1512 + var48;
                    int var50 = this.field1512 * arg1;
                    int var51 = this.field1512 + var50;
                    int var52 = (this.field1495 * var50 + this.field1513 * var48 + this.field1507 * var45 >> 15) + this.field1499;
                    int var53 = (this.field1514 * var50 + this.field1506 * var48 + this.field1502 * var45 >> 15) + this.field1500;
                    int var54 = (this.field1511 * var50 + this.field1505 * var48 + this.field1494 * var45 >> 15) + this.field1496;
                    int var55 = (this.field1495 * var50 + this.field1513 * var49 + this.field1507 * var46 >> 15) + this.field1499;
                    int var56 = (this.field1514 * var50 + this.field1506 * var49 + this.field1502 * var46 >> 15) + this.field1500;
                    int var57 = (this.field1511 * var50 + this.field1505 * var49 + this.field1494 * var46 >> 15) + this.field1496;
                    int var58 = (this.field1495 * var51 + this.field1513 * var48 + this.field1507 * var47 >> 15) + this.field1499;
                    int var59 = (this.field1514 * var51 + this.field1506 * var48 + this.field1502 * var47 >> 15) + this.field1500;
                    int var60 = (this.field1511 * var51 + this.field1505 * var48 + this.field1494 * var47 >> 15) + this.field1496;
                    for (int var61 = 0; var61 < var43.field5175; ++var61) {
                        short var62 = var43.field5169[var61];
                        short var63 = var43.field5165[var61];
                        short var64 = var43.field5170[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field6329 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field6339 || var66 > arg2.field6339 || var67 > arg2.field6339;
                            short var71 = var43.field5172[var61];
                            if (var71 != -1) {
                                if (this.method793(this.field1503.field5781.method1412(var71, (byte) -72).field2930)) {
                                    arg2.field6328 = 100;
                                }
                                arg2.method2716(var68, var69, var70, var65, var66, var67, var43.field5166[var62], var43.field5166[var63], var43.field5166[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field6328 = 0;
                            } else {
                                int var72 = var43.field5173[var61];
                                if (var72 != -1) {
                                    arg2.method2715(var68, var69, var70, var65, var66, var67, class78.method620(126, var72, var43.field5166[var62]), class78.method620(126, var72, var43.field5166[var63]), class78.method620(126, var72, var43.field5166[var64]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field5175; ++var73) {
                    short var74 = var43.field5169[var73];
                    short var75 = var43.field5165[var73];
                    short var76 = var43.field5170[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field5173[var73];
                        if (var83 != -1) {
                            arg2.field6329 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field6339 || var78 > arg2.field6339 || var79 > arg2.field6339;
                            arg2.method2715(var80, var81, var82, var77, var78, var79, class78.method620(126, var83, var43.field5166[var74]), class78.method620(126, var83, var43.field5166[var75]), class78.method620(126, var83, var43.field5166[var76]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lsr;IIIIZ)V")
    public final void method811(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III[[ZZ)V")
    public final void method812(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class335 var6 = this.field1503.field5804;
        this.field1513 = var6.field4795;
        this.field1507 = var6.field4802;
        this.field1495 = var6.field4799;
        this.field1499 = var6.field4803;
        this.field1506 = var6.field4801;
        this.field1502 = var6.field4800;
        this.field1514 = var6.field4796;
        this.field1500 = var6.field4797;
        this.field1505 = var6.field4798;
        this.field1494 = var6.field4794;
        this.field1511 = var6.field4805;
        this.field1496 = var6.field4804;
    }
}
