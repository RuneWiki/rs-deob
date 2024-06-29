import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class644 extends class139 {

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public int field8634 = -1;

    @OriginalMember(owner = "client!bs", name = "y", descriptor = "Lqe;")
    public class437 field8648;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    private int field8639;

    @OriginalMember(owner = "client!bs", name = "x", descriptor = "[[I")
    public int[][] field8647;

    @OriginalMember(owner = "client!bs", name = "v", descriptor = "[[B")
    private byte[][] field8645;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "[[B")
    private byte[][] field8636;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public int field8635;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public int field8637;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public int field8638;

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public int field8640;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public int field8641;

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "I")
    public int field8642;

    @OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
    public int field8649;

    @OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
    public int field8650;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    public int field8652;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    public int field8653;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    public int field8654;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public int field8655;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "[[Ltu;")
    public class323[][] field8644;

    @OriginalMember(owner = "client!bs", name = "w", descriptor = "[[Lbt;")
    public class40[][] field8646;

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "[[Lgp;")
    public class45[][] field8643;

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "[[Lrs;")
    public class610[][] field8651;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method3538(int arg0) {
        if ((this.field8639 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lqe;IIII[[I[[II)V", line = 24)
    public class644(class437 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field8648 = arg0;
        this.field8639 = arg2;
        this.field8647 = arg5;
        this.field8645 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field8648.field6012 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field8648.field6004 * var18 + this.field8648.field6003 * var16 + this.field8648.field5990 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field8645[var11][var10] = (byte) var20;
            }
        }
        this.field8636 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 78)
    public final boolean method203(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!bs", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 82)
    public final void method198(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!bs", name = "EA", descriptor = "(III)V", line = 85)
    public final void method209(int arg0, int arg1, int arg2) {
        if (this.field8636[arg0][arg1] < arg2) {
            this.field8636[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!bs", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 94)
    public final void method194(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field8651 == null) {
            this.field8651 = new class610[super.field2247][super.field2248];
            this.field8644 = new class323[super.field2247][super.field2248];
        } else if (this.field8646 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class446.field6101[class120.method937(arg6[var15], 26708) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class446.field6101[class120.method937(arg7[var16], 26708) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field2250 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2250 && arg4[var22] == super.field2250) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2250) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2250 != arg2[var24] && arg2[0] - super.field2250 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2250 != arg4[var24] && arg4[0] - super.field2250 != arg4[var24]) {
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
                class610 var25 = new class610();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field8051 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field8052 = (byte) (var25.field8052 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field8647[arg0 + 1][arg1] == this.field8647[arg0][arg1] && this.field8647[arg0 + 1][arg1 + 1] == this.field8647[arg0][arg1] && this.field8647[arg0][arg1 + 1] == this.field8647[arg0][arg1]) {
                    var25.field8052 = (byte) (var25.field8052 | 1);
                }
                if (var27 != -1 && (var25.field8052 & 2) == 0 && !this.field8648.field8808.method2760(var27, 21351).field4930) {
                    var25.field8053 = this.field8645[arg0][arg1] - this.field8636[arg0][arg1];
                    var25.field8058 = this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1];
                    var25.field8054 = this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1];
                    var25.field8055 = this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1];
                    var25.field8061 = (short) var27;
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
                    var25.field8053 = class226.method1420(method3539(arg6[var18] >> 8, this.field8645[arg0][arg1] - this.field8636[arg0][arg1]), true, var28, arg10);
                    if (var25.field8051 != 0) {
                        var25.field8053 |= 255 - (this.field8645[arg0][arg1] - this.field8636[arg0][arg1]) << 25;
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
                    var25.field8058 = class226.method1420(method3539(arg6[var19] >> 8, this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1]), true, var29, arg10);
                    if (var25.field8051 != 0) {
                        var25.field8058 |= 255 - (this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1]) << 25;
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
                    var25.field8054 = class226.method1420(method3539(arg6[var20] >> 8, this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1]), true, var30, arg10);
                    if (var25.field8051 != 0) {
                        var25.field8054 |= 255 - (this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field8055 = class226.method1420(method3539(arg6[var21] >> 8, this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1]), true, var31, arg10);
                    if (var25.field8051 != 0) {
                        var25.field8055 |= 255 - (this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1]) << 25;
                    }
                    var25.field8061 = -1;
                }
                if (arg5 != null) {
                    var25.field8059 = (short) arg5[var20];
                    var25.field8056 = (short) arg5[var21];
                    var25.field8057 = (short) arg5[var19];
                    var25.field8060 = (short) arg5[var18];
                }
                this.field8651[arg0][arg1] = var25;
            } else {
                class323 var32 = new class323();
                var32.field4496 = (short) arg2.length;
                var32.field4489 = (short) (arg2.length / 3);
                var32.field4494 = new short[var32.field4496];
                var32.field4497 = new short[var32.field4496];
                var32.field4488 = new short[var32.field4496];
                var32.field4493 = new int[var32.field4496];
                if (arg5 != null) {
                    var32.field4491 = new short[var32.field4496];
                }
                for (int var33 = 0; var33 < var32.field4496; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field8645[arg0][arg1] - this.field8636[arg0][arg1];
                    } else if (var48 == 0 && super.field2250 == var49) {
                        var51 = this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1];
                    } else if (super.field2250 == var48 && super.field2250 == var49) {
                        var51 = this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1];
                    } else if (super.field2250 == var48 && var49 == 0) {
                        var51 = this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1]) * var48 + (this.field8645[arg0][arg1] - this.field8636[arg0][arg1]) * (super.field2250 - var48);
                        int var53 = (this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1]) * var48 + (this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1]) * (super.field2250 - var48);
                        var51 = (super.field2250 - var49) * var52 + var49 * var53 >> super.field2245 * 2;
                    }
                    int var54 = (arg0 << super.field2245) + var48;
                    int var55 = (arg1 << super.field2245) + var49;
                    var32.field4494[var33] = (short) var48;
                    var32.field4488[var33] = (short) var49;
                    var32.field4497[var33] = (short) (this.method200(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field8648.field8808.method2760(arg8[var33], 21351).field4930) {
                        var32.field4493[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field4493[var33] = var51 << 25;
                        } else {
                            var32.field4493[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field4491[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field4493[var33] = class226.method1420(method3539(arg6[var33] >> 8, var51), true, var56, arg10);
                        if (arg7 != null) {
                            var32.field4493[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field4489; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field8648.field8808.method2760(arg8[var35 * 3], 21351).field4930) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field4492 = new int[var32.field4489];
                }
                if (var34) {
                    var32.field4490 = new short[var32.field4489];
                    var32.field4495 = new short[var32.field4489];
                }
                for (int var36 = 0; var36 < var32.field4489; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field4492[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field8648.field8808.method2760(var42, 21351).field4930) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field8648.field8808.method2760(var43, 21351).field4930) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field8648.field8808.method2760(var44, 21351).field4930) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field4490[var36] = (short) var44;
                            var32.field4495[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field8648.field8808.method2760(var45, 21351).field4930) {
                                    var32.field4493[var37] = class446.field6101[class120.method937(this.field8648.field8808.method2760(var45, 21351).field4920 & 65535, 26708) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field8648.field8808.method2760(var46, 21351).field4930) {
                                    var32.field4493[var38] = class446.field6101[class120.method937(this.field8648.field8808.method2760(var46, 21351).field4920 & 65535, 26708) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field8648.field8808.method2760(var47, 21351).field4930) {
                                    var32.field4493[var39] = class446.field6101[class120.method937(this.field8648.field8808.method2760(var47, 21351).field4920 & 65535, 26708) & 65535];
                                }
                            }
                            var32.field4490[var36] = -1;
                        }
                    }
                }
                this.field8644[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "sa", descriptor = "(II)I", line = 588)
    public final int method200(int arg0, int arg1) {
        int var3 = arg0 >> super.field2245;
        int var4 = arg1 >> super.field2245;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2247 - 1 && var4 <= super.field2248 - 1) {
            int var5 = arg0 & super.field2250 - 1;
            int var6 = arg1 & super.field2250 - 1;
            int var7 = (super.field2250 - var5) * this.field8647[var3][var4] + this.field8647[var3 + 1][var4] * var5 >> super.field2245;
            int var8 = (super.field2250 - var5) * this.field8647[var3][var4 + 1] + this.field8647[var3 + 1][var4 + 1] * var5 >> super.field2245;
            return (super.field2250 - var6) * var7 + var6 * var8 >> super.field2245;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 607)
    public final void method204(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field8646 == null) {
            this.field8646 = new class40[super.field2247][super.field2248];
            this.field8643 = new class45[super.field2247][super.field2248];
        } else if (this.field8651 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2250 != var20 || var21 != 0 && super.field2250 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class45 var22 = new class45();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field645 = var23;
            var22.field642 = new short[var23];
            var22.field648 = new short[var23];
            var22.field641 = new short[var23];
            var22.field653 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field642[var25] = (short) (this.field8645[arg0][arg1] - this.field8636[arg0][arg1]);
                } else if (var30 == 0 && super.field2250 == var31) {
                    var22.field642[var25] = (short) (this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1]);
                } else if (super.field2250 == var30 && super.field2250 == var31) {
                    var22.field642[var25] = (short) (this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1]);
                } else if (super.field2250 == var30 && var31 == 0) {
                    var22.field642[var25] = (short) (this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1]) * var30 + (this.field8645[arg0][arg1] - this.field8636[arg0][arg1]) * (super.field2250 - var30);
                    int var33 = (this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1]) * var30 + (this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1]) * (super.field2250 - var30);
                    var22.field642[var25] = (short) ((super.field2250 - var31) * var32 + var31 * var33 >> super.field2245 * 2);
                }
                int var34 = (arg0 << super.field2245) + var30;
                int var35 = (arg1 << super.field2245) + var31;
                var22.field648[var25] = (short) var30;
                var22.field653[var25] = (short) var31;
                var22.field641[var25] = (short) (this.method200(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field642[var25] < 2) {
                    var22.field642[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field8648.field8808.method2760(arg11[var28], 21351).field4930) {
                    var26 = true;
                }
            }
            var22.field646 = new int[var27];
            if (arg10 != null) {
                var22.field647 = new int[var27];
            }
            var22.field649 = new short[var27];
            var22.field651 = new short[var27];
            var22.field644 = new short[var27];
            if (var26) {
                var22.field650 = new short[var27];
                var22.field643 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field646[var22.field652] = class120.method937(arg9[var29], 26708);
                    } else {
                        var22.field646[var22.field652] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field647[var22.field652] = class120.method937(arg10[var29], 26708);
                        } else {
                            var22.field647[var22.field652] = -1;
                        }
                    }
                    var22.field649[var22.field652] = (short) arg6[var29];
                    var22.field651[var22.field652] = (short) arg7[var29];
                    var22.field644[var22.field652] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field8648.field8808.method2760(arg11[var29], 21351).field4930) {
                            var22.field650[var22.field652] = (short) arg11[var29];
                            var22.field643[var22.field652] = (short) arg12[var29];
                        } else {
                            var22.field650[var22.field652] = -1;
                        }
                    }
                    ++var22.field652;
                }
            }
            this.field8643[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class40 var36 = new class40();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field595 = class329.method1963(this.field8645[arg0][arg1] - this.field8636[arg0][arg1], -680993689, class120.method937(arg10[0], 26708));
                    if (var37 == -1) {
                        var36.field592 = (byte) (var36.field592 | 2);
                    }
                }
                if (this.field8647[arg0 + 1][arg1] == this.field8647[arg0][arg1] && this.field8647[arg0 + 1][arg1 + 1] == this.field8647[arg0][arg1] && this.field8647[arg0][arg1 + 1] == this.field8647[arg0][arg1]) {
                    var36.field592 = (byte) (var36.field592 | 1);
                }
                if (var38 != -1 && (var36.field592 & 2) == 0 && !this.field8648.field8808.method2760(var38, 21351).field4930) {
                    var36.field593 = (short) (this.field8645[arg0][arg1] - this.field8636[arg0][arg1]);
                    var36.field590 = (short) (this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1]);
                    var36.field594 = (short) (this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1]);
                    var36.field589 = (short) (this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1]);
                    var36.field591 = (short) var38;
                } else {
                    short var39 = class120.method937(var37, 26708);
                    var36.field593 = (short) class329.method1963(this.field8645[arg0][arg1] - this.field8636[arg0][arg1], -680993689, var39);
                    var36.field590 = (short) class329.method1963(this.field8645[arg0 + 1][arg1] - this.field8636[arg0 + 1][arg1], -680993689, var39);
                    var36.field594 = (short) class329.method1963(this.field8645[arg0 + 1][arg1 + 1] - this.field8636[arg0 + 1][arg1 + 1], -680993689, var39);
                    var36.field589 = (short) class329.method1963(this.field8645[arg0][arg1 + 1] - this.field8636[arg0][arg1 + 1], -680993689, var39);
                    var36.field591 = -1;
                }
                this.field8646[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!bs", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 835)
    public final void method208(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lpv;[I)V", line = 841)
    public final void method206(class65 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!bs", name = "JA", descriptor = "(II)I", line = 847)
    public final int method195(int arg0, int arg1) {
        return this.field8647[arg0][arg1];
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III[[ZZ)V", line = 855)
    public void method201(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class496 var6 = this.field8648.field5984;
        this.field8634 = -1;
        this.field8649 = var6.field6661;
        this.field8635 = var6.field6657;
        this.field8650 = var6.field6668;
        this.field8654 = var6.field6664;
        this.field8655 = var6.field6663;
        this.field8652 = var6.field6659;
        this.field8642 = var6.field6658;
        this.field8641 = var6.field6660;
        this.field8640 = var6.field6667;
        this.field8637 = var6.field6666;
        this.field8638 = var6.field6665;
        this.field8653 = var6.field6662;
    }

    @OriginalMember(owner = "client!bs", name = "ba", descriptor = "()V", line = 872)
    public final void method207() {
        this.field8645 = null;
        this.field8636 = null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)I", line = 878)
    private static final int method3539(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(IILw;)Lw;", line = 909)
    public final class276 method199(int arg0, int arg1, class276 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
    public abstract void method18(int arg0, int arg1);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
