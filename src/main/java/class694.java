import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class694 extends class272 {

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    private int field9845 = -1;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Lnga;")
    private class578 field9855;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    private int field9849;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "[[B")
    private byte[][] field9848;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "[[B")
    private byte[][] field9839;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "F")
    private float field9841;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "F")
    private float field9842;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "F")
    private float field9843;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "F")
    private float field9844;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "F")
    private float field9846;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "F")
    private float field9847;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "F")
    private float field9850;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "F")
    private float field9851;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "F")
    private float field9852;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "F")
    private float field9853;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "F")
    private float field9856;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "F")
    private float field9858;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "[[Lie;")
    private class116[][] field9854;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "[[Lwt;")
    private class24[][] field9838;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "[[Lap;")
    private class38[][] field9840;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "[[Lwc;")
    private class495[][] field9857;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1277(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class461 var7 = this.field9855.field8106;
        this.field9845 = arg5;
        this.field9847 = var7.field5869;
        this.field9852 = var7.field5856;
        this.field9844 = var7.field5862;
        this.field9846 = var7.field5865;
        this.field9858 = var7.field5852;
        this.field9851 = var7.field5854;
        this.field9841 = var7.field5866;
        this.field9843 = var7.field5858;
        this.field9850 = var7.field5860;
        this.field9853 = var7.field5882;
        this.field9842 = var7.field5872;
        this.field9856 = var7.field5871;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3441 && var11 >= 0 && var11 < super.field3440) {
                        this.method1282(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method1274(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
    public final void method1281(int arg0, int arg1, int arg2) {
        if (this.field9839[arg0][arg1] < arg2) {
            this.field9839[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lgga;[I)V")
    public final void method1289(class332 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method1286(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method1284(class119 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!eu", name = "BA", descriptor = "()V")
    public final void method1288() {
        this.field9848 = null;
        this.field9839 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class50 var9 = this.field9855.method3189(Thread.currentThread());
        class229 var10 = var9.field745;
        var10.field2864 = 0;
        var10.field2862 = false;
        this.field9855.method1031();
        if (this.field9838 != null) {
            this.method3914(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field749, var9.field723);
        } else {
            if (this.field9857 != null) {
                this.method3915(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field749, var9.field723);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lnga;IIII[[I[[II)V")
    public class694(class578 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9855 = arg0;
        this.field9849 = arg2;
        this.field9848 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field9855.field8079 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field9855.field8085 * var18 + this.field9855.field8076 * var16 + this.field9855.field8075 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field9848[var11][var10] = (byte) var20;
            }
        }
        this.field9839 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!eu", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field9838 == null) {
            this.field9838 = new class24[super.field3441][super.field3440];
            this.field9840 = new class38[super.field3441][super.field3440];
        } else if (this.field9857 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class475.field6031[class454.method2429(0, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class475.field6031[class454.method2429(0, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field3432 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field3432 && arg4[var22] == super.field3432) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field3432) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field3432 != arg2[var24] && arg2[0] - super.field3432 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field3432 != arg4[var24] && arg4[0] - super.field3432 != arg4[var24]) {
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
                class24 var25 = new class24();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field370 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field364 = (byte) (var25.field364 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field3436[arg0 + 1][arg1] == super.field3436[arg0][arg1] && super.field3436[arg0 + 1][arg1 + 1] == super.field3436[arg0][arg1] && super.field3436[arg0][arg1 + 1] == super.field3436[arg0][arg1]) {
                    var25.field364 = (byte) (var25.field364 | 1);
                }
                if (var27 != -1 && (var25.field364 & 2) == 0 && !this.field9855.field7898.method2486(var27, (byte) 86).field246) {
                    var25.field367 = this.field9848[arg0][arg1] - this.field9839[arg0][arg1];
                    var25.field373 = this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1];
                    var25.field368 = this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1];
                    var25.field372 = this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1];
                    var25.field366 = (short) var27;
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
                    var25.field367 = class506.method2721(var28, true, arg10, method3913(arg6[var18] >> 8, this.field9848[arg0][arg1] - this.field9839[arg0][arg1]));
                    if (var25.field370 != 0) {
                        var25.field367 |= 255 - (this.field9848[arg0][arg1] - this.field9839[arg0][arg1]) << 25;
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
                    var25.field373 = class506.method2721(var29, true, arg10, method3913(arg6[var19] >> 8, this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1]));
                    if (var25.field370 != 0) {
                        var25.field373 |= 255 - (this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1]) << 25;
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
                    var25.field368 = class506.method2721(var30, true, arg10, method3913(arg6[var20] >> 8, this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1]));
                    if (var25.field370 != 0) {
                        var25.field368 |= 255 - (this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field372 = class506.method2721(var31, true, arg10, method3913(arg6[var21] >> 8, this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1]));
                    if (var25.field370 != 0) {
                        var25.field372 |= 255 - (this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1]) << 25;
                    }
                    var25.field366 = -1;
                }
                if (arg5 != null) {
                    var25.field374 = (short) arg5[var20];
                    var25.field369 = (short) arg5[var21];
                    var25.field371 = (short) arg5[var19];
                    var25.field365 = (short) arg5[var18];
                }
                this.field9838[arg0][arg1] = var25;
            } else {
                class38 var32 = new class38();
                var32.field511 = (short) arg2.length;
                var32.field518 = (short) (arg2.length / 3);
                var32.field516 = new short[var32.field511];
                var32.field517 = new short[var32.field511];
                var32.field515 = new short[var32.field511];
                var32.field510 = new int[var32.field511];
                if (arg5 != null) {
                    var32.field513 = new short[var32.field511];
                }
                for (int var33 = 0; var33 < var32.field511; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field9848[arg0][arg1] - this.field9839[arg0][arg1];
                    } else if (var48 == 0 && super.field3432 == var49) {
                        var51 = this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1];
                    } else if (super.field3432 == var48 && super.field3432 == var49) {
                        var51 = this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1];
                    } else if (super.field3432 == var48 && var49 == 0) {
                        var51 = this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1]) * var48 + (this.field9848[arg0][arg1] - this.field9839[arg0][arg1]) * (super.field3432 - var48);
                        int var53 = (this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1]) * var48 + (this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1]) * (super.field3432 - var48);
                        var51 = (super.field3432 - var49) * var52 + var49 * var53 >> super.field3437 * 2;
                    }
                    int var54 = (arg0 << super.field3437) + var48;
                    int var55 = (arg1 << super.field3437) + var49;
                    var32.field516[var33] = (short) var48;
                    var32.field515[var33] = (short) var49;
                    var32.field517[var33] = (short) (this.method1565(var55, var54, true) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field9855.field7898.method2486(arg8[var33], (byte) 86).field246) {
                        var32.field510[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field510[var33] = var51 << 25;
                        } else {
                            var32.field510[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field513[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field510[var33] = class506.method2721(var56, true, arg10, method3913(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field510[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field518; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field9855.field7898.method2486(arg8[var35 * 3], (byte) 86).field246) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field509 = new int[var32.field518];
                }
                if (var34) {
                    var32.field512 = new short[var32.field518];
                    var32.field514 = new short[var32.field518];
                }
                for (int var36 = 0; var36 < var32.field518; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field509[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field9855.field7898.method2486(var42, (byte) 86).field246) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field9855.field7898.method2486(var43, (byte) 86).field246) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field9855.field7898.method2486(var44, (byte) 86).field246) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field512[var36] = (short) var44;
                            var32.field514[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field9855.field7898.method2486(var45, (byte) 86).field246) {
                                    var32.field510[var37] = class475.field6031[class454.method2429(0, this.field9855.field7898.method2486(var45, (byte) 86).field247 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field9855.field7898.method2486(var46, (byte) 86).field246) {
                                    var32.field510[var38] = class475.field6031[class454.method2429(0, this.field9855.field7898.method2486(var46, (byte) 86).field247 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field9855.field7898.method2486(var47, (byte) 86).field246) {
                                    var32.field510[var39] = class475.field6031[class454.method2429(0, this.field9855.field7898.method2486(var47, (byte) 86).field247 & 65535) & 65535];
                                }
                            }
                            var32.field512[var36] = -1;
                        }
                    }
                }
                this.field9840[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public final void method1282(int arg0, int arg1) {
        class50 var3 = this.field9855.method3189(Thread.currentThread());
        var3.field745.field2864 = 0;
        if (this.field9838 != null) {
            this.method3917(arg0, arg1, var3.field715, var3, var3.field745, var3.field749, var3.field723, var3.field747, var3.field730);
        } else {
            if (this.field9857 != null) {
                this.method3912(arg0, arg1, var3.field745, var3.field749, var3.field723, var3.field747, var3.field730);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILjea;[I[I[I[I)V")
    private final void method3912(int arg0, int arg1, class229 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class495 var8 = this.field9857[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6538 & 2) == 0) {
                int var9 = super.field3432 * arg0;
                int var10 = super.field3432 + var9;
                int var11 = super.field3432 * arg1;
                int var12 = super.field3432 + var11;
                float var15;
                float var16;
                float var17;
                float var18;
                float var21;
                int var22;
                float var23;
                int var24;
                float var25;
                int var26;
                float var27;
                int var28;
                int var30;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                if ((var8.field6538 & 1) != 0) {
                    int var13 = super.field3436[arg0][arg1];
                    float var14 = (float) var13 * this.field9853;
                    if (this.field9845 == -1) {
                        var15 = (float) var11 * this.field9842 + (float) var9 * this.field9850 + var14 + this.field9856;
                        if (var15 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var16 = (float) var11 * this.field9842 + (float) var10 * this.field9850 + var14 + this.field9856;
                        if (var16 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var17 = (float) var12 * this.field9842 + (float) var10 * this.field9850 + var14 + this.field9856;
                        if (var17 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var18 = (float) var12 * this.field9842 + (float) var9 * this.field9850 + var14 + this.field9856;
                        if (var18 <= (float) this.field9855.field8091) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field9842 + (float) var9 * this.field9850 + var14 + this.field9856;
                        var16 = (float) var11 * this.field9842 + (float) var10 * this.field9850 + var14 + this.field9856;
                        var17 = (float) var12 * this.field9842 + (float) var10 * this.field9850 + var14 + this.field9856;
                        var18 = (float) var12 * this.field9842 + (float) var9 * this.field9850 + var14 + this.field9856;
                    }
                    float var19 = (float) var13 * this.field9852;
                    float var20 = (float) var13 * this.field9851;
                    if (this.field9845 == -1) {
                        var21 = (float) var11 * this.field9844 + (float) var9 * this.field9847 + var19 + this.field9846;
                        var22 = (int) ((float) this.field9855.field8090 * var21 / var15) + arg2.field2856;
                        var23 = (float) var11 * this.field9841 + (float) var9 * this.field9858 + var20 + this.field9843;
                        var24 = (int) ((float) this.field9855.field8093 * var23 / var15) + arg2.field2859;
                        var25 = (float) var11 * this.field9844 + (float) var10 * this.field9847 + var19 + this.field9846;
                        var26 = (int) ((float) this.field9855.field8090 * var25 / var16) + arg2.field2856;
                        var27 = (float) var11 * this.field9841 + (float) var10 * this.field9858 + var20 + this.field9843;
                        var28 = (int) ((float) this.field9855.field8093 * var27 / var16) + arg2.field2859;
                        float var29 = (float) var12 * this.field9844 + (float) var10 * this.field9847 + var19 + this.field9846;
                        var30 = (int) ((float) this.field9855.field8090 * var29 / var17) + arg2.field2856;
                        float var31 = (float) var12 * this.field9841 + (float) var10 * this.field9858 + var20 + this.field9843;
                        var32 = (int) ((float) this.field9855.field8093 * var31 / var17) + arg2.field2859;
                        var33 = (float) var12 * this.field9844 + (float) var9 * this.field9847 + var19 + this.field9846;
                        var34 = (int) ((float) this.field9855.field8090 * var33 / var18) + arg2.field2856;
                        var35 = (float) var12 * this.field9841 + (float) var9 * this.field9858 + var20 + this.field9843;
                        var36 = (int) ((float) this.field9855.field8093 * var35 / var18) + arg2.field2859;
                    } else {
                        var21 = (float) var11 * this.field9844 + (float) var9 * this.field9847 + var19 + this.field9846;
                        var22 = (int) ((float) this.field9855.field8090 * var21 / (float) this.field9845) + arg2.field2856;
                        var23 = (float) var11 * this.field9841 + (float) var9 * this.field9858 + var20 + this.field9843;
                        var24 = (int) ((float) this.field9855.field8093 * var23 / (float) this.field9845) + arg2.field2859;
                        var25 = (float) var11 * this.field9844 + (float) var10 * this.field9847 + var19 + this.field9846;
                        var26 = (int) ((float) this.field9855.field8090 * var25 / (float) this.field9845) + arg2.field2856;
                        var27 = (float) var11 * this.field9841 + (float) var10 * this.field9858 + var20 + this.field9843;
                        var28 = (int) ((float) this.field9855.field8093 * var27 / (float) this.field9845) + arg2.field2859;
                        float var37 = (float) var12 * this.field9844 + (float) var10 * this.field9847 + var19 + this.field9846;
                        var30 = (int) ((float) this.field9855.field8090 * var37 / (float) this.field9845) + arg2.field2856;
                        float var38 = (float) var12 * this.field9841 + (float) var10 * this.field9858 + var20 + this.field9843;
                        var32 = (int) ((float) this.field9855.field8093 * var38 / (float) this.field9845) + arg2.field2859;
                        var33 = (float) var12 * this.field9844 + (float) var9 * this.field9847 + var19 + this.field9846;
                        var34 = (int) ((float) this.field9855.field8090 * var33 / (float) this.field9845) + arg2.field2856;
                        var35 = (float) var12 * this.field9841 + (float) var9 * this.field9858 + var20 + this.field9843;
                        var36 = (int) ((float) this.field9855.field8093 * var35 / (float) this.field9845) + arg2.field2859;
                    }
                } else {
                    int var39 = super.field3436[arg0][arg1];
                    int var40 = super.field3436[arg0 + 1][arg1];
                    int var41 = super.field3436[arg0 + 1][arg1 + 1];
                    int var42 = super.field3436[arg0][arg1 + 1];
                    if (this.field9845 == -1) {
                        var15 = (float) var11 * this.field9842 + (float) var9 * this.field9850 + (float) var39 * this.field9853 + this.field9856;
                        if (var15 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var16 = (float) var11 * this.field9842 + (float) var10 * this.field9850 + (float) var40 * this.field9853 + this.field9856;
                        if (var16 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var17 = (float) var12 * this.field9842 + (float) var10 * this.field9850 + (float) var41 * this.field9853 + this.field9856;
                        if (var17 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var18 = (float) var12 * this.field9842 + (float) var9 * this.field9850 + (float) var42 * this.field9853 + this.field9856;
                        if (var18 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var21 = (float) var11 * this.field9844 + (float) var9 * this.field9847 + (float) var39 * this.field9852 + this.field9846;
                        var22 = (int) ((float) this.field9855.field8090 * var21 / var15) + arg2.field2856;
                        var23 = (float) var11 * this.field9841 + (float) var9 * this.field9858 + (float) var39 * this.field9851 + this.field9843;
                        var24 = (int) ((float) this.field9855.field8093 * var23 / var15) + arg2.field2859;
                        var25 = (float) var11 * this.field9844 + (float) var10 * this.field9847 + (float) var40 * this.field9852 + this.field9846;
                        var26 = (int) ((float) this.field9855.field8090 * var25 / var16) + arg2.field2856;
                        var27 = (float) var11 * this.field9841 + (float) var10 * this.field9858 + (float) var40 * this.field9851 + this.field9843;
                        var28 = (int) ((float) this.field9855.field8093 * var27 / var16) + arg2.field2859;
                        float var43 = (float) var12 * this.field9844 + (float) var10 * this.field9847 + (float) var41 * this.field9852 + this.field9846;
                        var30 = (int) ((float) this.field9855.field8090 * var43 / var17) + arg2.field2856;
                        float var44 = (float) var12 * this.field9841 + (float) var10 * this.field9858 + (float) var41 * this.field9851 + this.field9843;
                        var32 = (int) ((float) this.field9855.field8093 * var44 / var17) + arg2.field2859;
                        var33 = (float) var12 * this.field9844 + (float) var9 * this.field9847 + (float) var42 * this.field9852 + this.field9846;
                        var34 = (int) ((float) this.field9855.field8090 * var33 / var18) + arg2.field2856;
                        var35 = (float) var12 * this.field9841 + (float) var9 * this.field9858 + (float) var42 * this.field9851 + this.field9843;
                        var36 = (int) ((float) this.field9855.field8093 * var35 / var18) + arg2.field2859;
                    } else {
                        var15 = (float) var11 * this.field9842 + (float) var9 * this.field9850 + (float) var39 * this.field9853 + this.field9856;
                        var16 = (float) var11 * this.field9842 + (float) var10 * this.field9850 + (float) var40 * this.field9853 + this.field9856;
                        var17 = (float) var12 * this.field9842 + (float) var10 * this.field9850 + (float) var41 * this.field9853 + this.field9856;
                        var18 = (float) var12 * this.field9842 + (float) var9 * this.field9850 + (float) var42 * this.field9853 + this.field9856;
                        var21 = (float) var11 * this.field9844 + (float) var9 * this.field9847 + (float) var39 * this.field9852 + this.field9846;
                        var22 = (int) ((float) this.field9855.field8090 * var21 / (float) this.field9845) + arg2.field2856;
                        var23 = (float) var11 * this.field9841 + (float) var9 * this.field9858 + (float) var39 * this.field9851 + this.field9843;
                        var24 = (int) ((float) this.field9855.field8093 * var23 / (float) this.field9845) + arg2.field2859;
                        var25 = (float) var11 * this.field9844 + (float) var10 * this.field9847 + (float) var40 * this.field9852 + this.field9846;
                        var26 = (int) ((float) this.field9855.field8090 * var25 / (float) this.field9845) + arg2.field2856;
                        var27 = (float) var11 * this.field9841 + (float) var10 * this.field9858 + (float) var40 * this.field9851 + this.field9843;
                        var28 = (int) ((float) this.field9855.field8093 * var27 / (float) this.field9845) + arg2.field2859;
                        float var45 = (float) var12 * this.field9844 + (float) var10 * this.field9847 + (float) var41 * this.field9852 + this.field9846;
                        var30 = (int) ((float) this.field9855.field8090 * var45 / (float) this.field9845) + arg2.field2856;
                        float var46 = (float) var12 * this.field9841 + (float) var10 * this.field9858 + (float) var41 * this.field9851 + this.field9843;
                        var32 = (int) ((float) this.field9855.field8093 * var46 / (float) this.field9845) + arg2.field2859;
                        var33 = (float) var12 * this.field9844 + (float) var9 * this.field9847 + (float) var42 * this.field9852 + this.field9846;
                        var34 = (int) ((float) this.field9855.field8090 * var33 / (float) this.field9845) + arg2.field2856;
                        var35 = (float) var12 * this.field9841 + (float) var9 * this.field9858 + (float) var42 * this.field9851 + this.field9843;
                        var36 = (int) ((float) this.field9855.field8093 * var35 / (float) this.field9845) + arg2.field2859;
                    }
                }
                if (this.field9845 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field2862 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field2849 || var34 > arg2.field2849 || var26 > arg2.field2849;
                        if (var8.field6541 >= 0) {
                            if (this.method3916(this.field9855.field7898.method2486(var8.field6541, (byte) 86).field234)) {
                                arg2.field2864 = 100;
                            }
                            arg2.method1380(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field6539 & 65535, var8.field6543 & 65535, var8.field6542 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field6541);
                            arg2.field2864 = 0;
                        } else {
                            arg2.method1367(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field6539 & 65535, var8.field6543 & 65535, var8.field6542 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field2862 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field2849 || var26 > arg2.field2849 || var34 > arg2.field2849;
                        if (var8.field6541 >= 0) {
                            if (this.method3916(this.field9855.field7898.method2486(var8.field6541, (byte) 86).field234)) {
                                arg2.field2864 = 100;
                            }
                            arg2.method1380(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field6540 & 65535, var8.field6542 & 65535, var8.field6543 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field6541);
                            arg2.field2864 = 0;
                            return;
                        }
                        arg2.method1367(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field6540 & 65535, var8.field6542 & 65535, var8.field6543 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field2862 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field2849 || var34 > arg2.field2849 || var26 > arg2.field2849;
                        if (var8.field6541 >= 0) {
                            if (this.method3916(this.field9855.field7898.method2486(var8.field6541, (byte) 86).field234)) {
                                arg2.field2864 = 100;
                            }
                            arg2.method1380(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field6539 & 65535, var8.field6543 & 65535, var8.field6542 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field9845, this.field9845, this.field9845, var8.field6541);
                            arg2.field2864 = 0;
                        } else {
                            arg2.method1367(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field6539 & 65535, var8.field6543 & 65535, var8.field6542 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field2862 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field2849 || var26 > arg2.field2849 || var34 > arg2.field2849;
                        if (var8.field6541 >= 0) {
                            if (this.method3916(this.field9855.field7898.method2486(var8.field6541, (byte) 86).field234)) {
                                arg2.field2864 = 100;
                            }
                            arg2.method1380(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field6540 & 65535, var8.field6542 & 65535, var8.field6543 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field9845, this.field9845, this.field9845, var8.field6541);
                            arg2.field2864 = 0;
                            return;
                        }
                        arg2.method1367(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field6540 & 65535, var8.field6542 & 65535, var8.field6543 & 65535);
                    }
                }
            }
        } else {
            class116 var47 = this.field9854[arg0][arg1];
            if (var47 != null) {
                if (this.field9845 == -1) {
                    for (int var48 = 0; var48 < var47.field1492; ++var48) {
                        int var49 = (arg0 << super.field3437) + var47.field1493[var48];
                        short var50 = var47.field1495[var48];
                        int var51 = (arg1 << super.field3437) + var47.field1500[var48];
                        float var52 = (float) var51 * this.field9842 + (float) var49 * this.field9850 + (float) var50 * this.field9853 + this.field9856;
                        if (var52 <= (float) this.field9855.field8091) {
                            return;
                        }
                        float var53 = (float) var51 * this.field9844 + (float) var49 * this.field9847 + (float) var50 * this.field9852 + this.field9846;
                        float var54 = (float) var51 * this.field9841 + (float) var49 * this.field9858 + (float) var50 * this.field9851 + this.field9843;
                        arg3[var48] = (int) ((float) this.field9855.field8090 * var53 / var52) + arg2.field2856;
                        arg4[var48] = (int) ((float) this.field9855.field8093 * var54 / var52) + arg2.field2859;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field1492; ++var55) {
                        int var107 = (arg0 << super.field3437) + var47.field1493[var55];
                        short var108 = var47.field1495[var55];
                        int var109 = (arg1 << super.field3437) + var47.field1500[var55];
                        float var110 = (float) var109 * this.field9842 + (float) var107 * this.field9850 + (float) var108 * this.field9853 + this.field9856;
                        float var111 = (float) var109 * this.field9844 + (float) var107 * this.field9847 + (float) var108 * this.field9852 + this.field9846;
                        float var112 = (float) var109 * this.field9841 + (float) var107 * this.field9858 + (float) var108 * this.field9851 + this.field9843;
                        arg3[var55] = (int) ((float) this.field9855.field8090 * var111 / (float) this.field9845) + arg2.field2856;
                        arg4[var55] = (int) ((float) this.field9855.field8093 * var112 / (float) this.field9845) + arg2.field2859;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field1502 != null) {
                    int var56 = super.field3436[arg0][arg1];
                    int var57 = super.field3436[arg0 + 1][arg1];
                    int var58 = super.field3436[arg0][arg1 + 1];
                    int var59 = super.field3432 * arg0;
                    int var60 = super.field3432 + var59;
                    int var61 = super.field3432 * arg1;
                    int var62 = super.field3432 + var61;
                    float var63 = (float) var61 * this.field9844 + (float) var56 * this.field9852 + (float) var59 * this.field9847 + this.field9846;
                    float var64 = (float) var61 * this.field9841 + (float) var56 * this.field9851 + (float) var59 * this.field9858 + this.field9843;
                    float var65 = (float) var61 * this.field9842 + (float) var56 * this.field9853 + (float) var59 * this.field9850 + this.field9856;
                    float var66 = (float) var61 * this.field9844 + (float) var57 * this.field9852 + (float) var60 * this.field9847 + this.field9846;
                    float var67 = (float) var61 * this.field9841 + (float) var57 * this.field9851 + (float) var60 * this.field9858 + this.field9843;
                    float var68 = (float) var61 * this.field9842 + (float) var57 * this.field9853 + (float) var60 * this.field9850 + this.field9856;
                    float var69 = (float) var62 * this.field9844 + (float) var58 * this.field9852 + (float) var59 * this.field9847 + this.field9846;
                    float var70 = (float) var62 * this.field9841 + (float) var58 * this.field9851 + (float) var59 * this.field9858 + this.field9843;
                    float var71 = (float) var62 * this.field9842 + (float) var58 * this.field9853 + (float) var59 * this.field9850 + this.field9856;
                    if (this.field9845 == -1) {
                        for (int var72 = 0; var72 < var47.field1491; ++var72) {
                            short var73 = var47.field1497[var72];
                            short var74 = var47.field1496[var72];
                            short var75 = var47.field1490[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field2862 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field2849 || var77 > arg2.field2849 || var78 > arg2.field2849;
                                short var82 = var47.field1502[var72];
                                if (var82 != -1) {
                                    if (this.method3916(this.field9855.field7898.method2486(var82, (byte) 86).field234)) {
                                        arg2.field2864 = 100;
                                    }
                                    arg2.method1380(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field1499[var73], var47.field1499[var74], var47.field1499[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field2864 = 0;
                                } else {
                                    int var83 = var47.field1498[var72];
                                    if (var83 != -1) {
                                        arg2.method1367(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class50.method314(-116, var47.field1499[var73], var83), class50.method314(27, var47.field1499[var74], var83), class50.method314(113, var47.field1499[var75], var83));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field1491; ++var84) {
                        short var85 = var47.field1497[var84];
                        short var86 = var47.field1496[var84];
                        short var87 = var47.field1490[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field2862 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field2849 || var89 > arg2.field2849 || var90 > arg2.field2849;
                            short var94 = var47.field1502[var84];
                            if (var94 != -1) {
                                if (this.method3916(this.field9855.field7898.method2486(var94, (byte) 86).field234)) {
                                    arg2.field2864 = 100;
                                }
                                arg2.method1380(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field1499[var85], var47.field1499[var86], var47.field1499[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field9845, this.field9845, this.field9845, var94);
                                arg2.field2864 = 0;
                            } else {
                                int var95 = var47.field1498[var84];
                                if (var95 != -1) {
                                    arg2.method1367(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class50.method314(-103, var47.field1499[var85], var95), class50.method314(106, var47.field1499[var86], var95), class50.method314(126, var47.field1499[var87], var95));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field1491; ++var96) {
                    short var97 = var47.field1497[var96];
                    short var98 = var47.field1496[var96];
                    short var99 = var47.field1490[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field1498[var96];
                        if (var106 != -1) {
                            arg2.field2862 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field2849 || var101 > arg2.field2849 || var102 > arg2.field2849;
                            arg2.method1367(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class50.method314(49, var47.field1499[var97], var106), class50.method314(61, var47.field1499[var98], var106), class50.method314(84, var47.field1499[var99], var106));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)I")
    private static final int method3913(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1276(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field9857 == null) {
            this.field9857 = new class495[super.field3441][super.field3440];
            this.field9854 = new class116[super.field3441][super.field3440];
        } else if (this.field9838 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3432 != var20 || var21 != 0 && super.field3432 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class116 var22 = new class116();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1492 = var23;
            var22.field1499 = new short[var23];
            var22.field1493 = new short[var23];
            var22.field1495 = new short[var23];
            var22.field1500 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1499[var25] = (short) (this.field9848[arg0][arg1] - this.field9839[arg0][arg1]);
                } else if (var30 == 0 && super.field3432 == var31) {
                    var22.field1499[var25] = (short) (this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1]);
                } else if (super.field3432 == var30 && super.field3432 == var31) {
                    var22.field1499[var25] = (short) (this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1]);
                } else if (super.field3432 == var30 && var31 == 0) {
                    var22.field1499[var25] = (short) (this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1]) * var30 + (this.field9848[arg0][arg1] - this.field9839[arg0][arg1]) * (super.field3432 - var30);
                    int var33 = (this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1]) * var30 + (this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1]) * (super.field3432 - var30);
                    var22.field1499[var25] = (short) ((super.field3432 - var31) * var32 + var31 * var33 >> super.field3437 * 2);
                }
                int var34 = (arg0 << super.field3437) + var30;
                int var35 = (arg1 << super.field3437) + var31;
                var22.field1493[var25] = (short) var30;
                var22.field1500[var25] = (short) var31;
                var22.field1495[var25] = (short) (this.method1565(var35, var34, true) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1499[var25] < 2) {
                    var22.field1499[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field9855.field7898.method2486(arg11[var28], (byte) 86).field246) {
                    var26 = true;
                }
            }
            var22.field1498 = new int[var27];
            if (arg10 != null) {
                var22.field1501 = new int[var27];
            }
            var22.field1497 = new short[var27];
            var22.field1496 = new short[var27];
            var22.field1490 = new short[var27];
            if (var26) {
                var22.field1502 = new short[var27];
                var22.field1494 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1498[var22.field1491] = class454.method2429(0, arg9[var29]);
                    } else {
                        var22.field1498[var22.field1491] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1501[var22.field1491] = class454.method2429(0, arg10[var29]);
                        } else {
                            var22.field1501[var22.field1491] = -1;
                        }
                    }
                    var22.field1497[var22.field1491] = (short) arg6[var29];
                    var22.field1496[var22.field1491] = (short) arg7[var29];
                    var22.field1490[var22.field1491] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field9855.field7898.method2486(arg11[var29], (byte) 86).field246) {
                            var22.field1502[var22.field1491] = (short) arg11[var29];
                            var22.field1494[var22.field1491] = (short) arg12[var29];
                        } else {
                            var22.field1502[var22.field1491] = -1;
                        }
                    }
                    ++var22.field1491;
                }
            }
            this.field9854[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class495 var36 = new class495();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field6544 = class50.method314(-123, this.field9848[arg0][arg1] - this.field9839[arg0][arg1], class454.method2429(0, arg10[0]));
                    if (var37 == -1) {
                        var36.field6538 = (byte) (var36.field6538 | 2);
                    }
                }
                if (super.field3436[arg0 + 1][arg1] == super.field3436[arg0][arg1] && super.field3436[arg0 + 1][arg1 + 1] == super.field3436[arg0][arg1] && super.field3436[arg0][arg1 + 1] == super.field3436[arg0][arg1]) {
                    var36.field6538 = (byte) (var36.field6538 | 1);
                }
                if (var38 != -1 && (var36.field6538 & 2) == 0 && !this.field9855.field7898.method2486(var38, (byte) 86).field246) {
                    var36.field6540 = (short) (this.field9848[arg0][arg1] - this.field9839[arg0][arg1]);
                    var36.field6542 = (short) (this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1]);
                    var36.field6539 = (short) (this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1]);
                    var36.field6543 = (short) (this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1]);
                    var36.field6541 = (short) var38;
                } else {
                    short var39 = class454.method2429(0, var37);
                    var36.field6540 = (short) class50.method314(-120, this.field9848[arg0][arg1] - this.field9839[arg0][arg1], var39);
                    var36.field6542 = (short) class50.method314(-122, this.field9848[arg0 + 1][arg1] - this.field9839[arg0 + 1][arg1], var39);
                    var36.field6539 = (short) class50.method314(-108, this.field9848[arg0 + 1][arg1 + 1] - this.field9839[arg0 + 1][arg1 + 1], var39);
                    var36.field6543 = (short) class50.method314(-93, this.field9848[arg0][arg1 + 1] - this.field9839[arg0][arg1 + 1], var39);
                    var36.field6541 = -1;
                }
                this.field9857[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII[[ZLlfa;Ljea;[I[I)V")
    private final void method3914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class50 arg8, class229 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field711;
        this.field9855.method1034(false);
        arg9.field2850 = false;
        arg9.field2858 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field9838[var18][var19] != null) {
                        class24 var20 = this.field9838[var18][var19];
                        if (var20.field366 != -1 && (var20.field364 & 2) == 0 && var20.field370 == 0) {
                            int var21 = this.field9855.method3187(var20.field366);
                            arg9.method1367(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class50.method314(88, var20.field368, var21), class50.method314(61, var20.field372, var21), class50.method314(-92, var20.field373, var21));
                            arg9.method1367(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class50.method314(-88, var20.field367, var21), class50.method314(94, var20.field373, var21), class50.method314(91, var20.field372, var21));
                        } else if (var20.field370 == 0) {
                            arg9.method1379(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field368, var20.field372, var20.field373);
                            arg9.method1379(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field367, var20.field373, var20.field372);
                        } else {
                            int var22 = var20.field370;
                            arg9.method1379(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class330.method1876((byte) 0, var20.field368 & -16777216, var22), class330.method1876((byte) 4, var20.field372 & -16777216, var22), class330.method1876((byte) 18, var20.field373 & -16777216, var22));
                            arg9.method1379(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class330.method1876((byte) 17, var20.field367 & -16777216, var22), class330.method1876((byte) 5, var20.field373 & -16777216, var22), class330.method1876((byte) -121, var20.field372 & -16777216, var22));
                        }
                    } else if (this.field9840[var18][var19] != null) {
                        class38 var23 = this.field9840[var18][var19];
                        for (int var24 = 0; var24 < var23.field511; ++var24) {
                            arg10[var24] = var23.field516[var24] * var14 / super.field3432 + var16;
                            arg11[var24] = var17 - var23.field515[var24] * var14 / super.field3432;
                        }
                        for (int var25 = 0; var25 < var23.field518; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field509 == null || var23.field509[var25] == 0 || var23.field512 != null && (var23.field512 == null || var23.field512[var25] != -1)) {
                                if (var23.field512 != null && var23.field512[var25] != -1) {
                                    int var36 = this.field9855.method3187(var23.field512[var25]);
                                    arg9.method1367(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                                } else {
                                    arg9.method1379(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field510[var26], var23.field510[var27], var23.field510[var28]);
                                }
                            } else {
                                int var35 = var23.field509[var25];
                                arg9.method1379(var32, var33, var34, var29, var30, var31, 100, 100, 100, class330.method1876((byte) -111, -16777216 - (var23.field510[var26] & -16777216), var35), class330.method1876((byte) -120, -16777216 - (var23.field510[var27] & -16777216), var35), class330.method1876((byte) 93, -16777216 - (var23.field510[var28] & -16777216), var35));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2850 = true;
        this.field9855.method1034(var15);
    }

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "(IILha;)Lha;")
    public final class119 method1285(int arg0, int arg1, class119 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1278(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class461 var6 = this.field9855.field8106;
        this.field9845 = -1;
        this.field9847 = var6.field5869;
        this.field9852 = var6.field5856;
        this.field9844 = var6.field5862;
        this.field9846 = var6.field5865;
        this.field9858 = var6.field5852;
        this.field9851 = var6.field5854;
        this.field9841 = var6.field5866;
        this.field9843 = var6.field5858;
        this.field9850 = var6.field5860;
        this.field9853 = var6.field5882;
        this.field9842 = var6.field5872;
        this.field9856 = var6.field5871;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field3441 && var10 >= 0 && var10 < super.field3440) {
                        this.method1282(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(IIIIIII[[ZLlfa;Ljea;[I[I)V")
    private final void method3915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class50 arg8, class229 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field711;
        this.field9855.method1034(false);
        arg9.field2850 = false;
        arg9.field2858 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field9857[var18][var19] != null) {
                        class495 var20 = this.field9857[var18][var19];
                        if (var20.field6541 != -1 && (var20.field6538 & 2) == 0 && var20.field6544 == -1) {
                            int var21 = this.field9855.method3187(var20.field6541);
                            arg9.method1367(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class50.method314(-120, var20.field6539 & 65535, var21), class50.method314(-87, var20.field6543 & 65535, var21), class50.method314(-124, var20.field6542 & 65535, var21));
                            arg9.method1367(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class50.method314(114, var20.field6540 & 65535, var21), class50.method314(44, var20.field6542 & 65535, var21), class50.method314(49, var20.field6543 & 65535, var21));
                        } else if (var20.field6544 == -1) {
                            arg9.method1367(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field6539 & 65535, var20.field6543 & 65535, var20.field6542 & 65535);
                            arg9.method1367(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field6540 & 65535, var20.field6542 & 65535, var20.field6543 & 65535);
                        } else {
                            int var22 = var20.field6544;
                            arg9.method1367(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method1367(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field9854[var18][var19] != null) {
                        class116 var23 = this.field9854[var18][var19];
                        for (int var24 = 0; var24 < var23.field1492; ++var24) {
                            arg10[var24] = var23.field1493[var24] * var14 / super.field3432 + var16;
                            arg11[var24] = var17 - var23.field1500[var24] * var14 / super.field3432;
                        }
                        for (int var25 = 0; var25 < var23.field1491; ++var25) {
                            short var26 = var23.field1497[var25];
                            short var27 = var23.field1496[var25];
                            short var28 = var23.field1490[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field1501 != null && var23.field1501[var25] != -1) {
                                int var35 = var23.field1501[var25];
                                arg9.method1367(var32, var33, var34, var29, var30, var31, 100, 100, 100, class50.method314(93, var23.field1499[var26], var35), class50.method314(71, var23.field1499[var27], var35), class50.method314(62, var23.field1499[var28], var35));
                            } else if (var23.field1502 != null && var23.field1502[var25] != -1) {
                                int var36 = this.field9855.method3187(var23.field1502[var25]);
                                arg9.method1367(var32, var33, var34, var29, var30, var31, 100, 100, 100, class50.method314(-110, var23.field1499[var26], var36), class50.method314(103, var23.field1499[var27], var36), class50.method314(-95, var23.field1499[var28], var36));
                            } else {
                                int var37 = var23.field1498[var25];
                                arg9.method1367(var32, var33, var34, var29, var30, var31, 100, 100, 100, class50.method314(-102, var23.field1499[var26], var37), class50.method314(37, var23.field1499[var27], var37), class50.method314(-92, var23.field1499[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field2850 = true;
        this.field9855.method1034(var15);
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Z")
    private final boolean method3916(int arg0) {
        if ((this.field9849 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIZLlfa;Ljea;[I[I[I[I)V")
    private final void method3917(int arg0, int arg1, boolean arg2, class50 arg3, class229 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class24 var10 = this.field9838[arg0][arg1];
        if (var10 != null) {
            if ((var10.field364 & 2) == 0) {
                int var11 = super.field3432 * arg0;
                int var12 = super.field3432 + var11;
                int var13 = super.field3432 * arg1;
                int var14 = super.field3432 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                float var21;
                float var22;
                float var23;
                float var24;
                float var31;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                float var37;
                int var38;
                float var39;
                int var40;
                float var41;
                int var42;
                float var43;
                int var44;
                float var45;
                int var46;
                if ((var10.field364 & 1) != 0 && !arg2) {
                    int var19 = super.field3436[arg0][arg1];
                    float var20 = (float) var19 * this.field9853;
                    if (this.field9845 == -1) {
                        var21 = (float) var13 * this.field9842 + (float) var11 * this.field9850 + var20 + this.field9856;
                        if (var21 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var22 = (float) var13 * this.field9842 + (float) var12 * this.field9850 + var20 + this.field9856;
                        if (var22 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var23 = (float) var14 * this.field9842 + (float) var12 * this.field9850 + var20 + this.field9856;
                        if (var23 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var24 = (float) var14 * this.field9842 + (float) var11 * this.field9850 + var20 + this.field9856;
                        if (var24 <= (float) this.field9855.field8091) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field9842 + (float) var11 * this.field9850 + var20 + this.field9856;
                        var22 = (float) var13 * this.field9842 + (float) var12 * this.field9850 + var20 + this.field9856;
                        var23 = (float) var14 * this.field9842 + (float) var12 * this.field9850 + var20 + this.field9856;
                        var24 = (float) var14 * this.field9842 + (float) var11 * this.field9850 + var20 + this.field9856;
                    }
                    if (arg3.field712) {
                        int var25 = (int) (var21 - (float) arg3.field703);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field703);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field703);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field703);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field9852;
                    float var30 = (float) var19 * this.field9851;
                    if (this.field9845 == -1) {
                        var31 = (float) var13 * this.field9844 + (float) var11 * this.field9847 + var29 + this.field9846;
                        var32 = (int) ((float) this.field9855.field8090 * var31 / var21) + arg4.field2856;
                        var33 = (float) var13 * this.field9841 + (float) var11 * this.field9858 + var30 + this.field9843;
                        var34 = (int) ((float) this.field9855.field8093 * var33 / var21) + arg4.field2859;
                        var35 = (float) var13 * this.field9844 + (float) var12 * this.field9847 + var29 + this.field9846;
                        var36 = (int) ((float) this.field9855.field8090 * var35 / var22) + arg4.field2856;
                        var37 = (float) var13 * this.field9841 + (float) var12 * this.field9858 + var30 + this.field9843;
                        var38 = (int) ((float) this.field9855.field8093 * var37 / var22) + arg4.field2859;
                        var39 = (float) var14 * this.field9844 + (float) var12 * this.field9847 + var29 + this.field9846;
                        var40 = (int) ((float) this.field9855.field8090 * var39 / var23) + arg4.field2856;
                        var41 = (float) var14 * this.field9841 + (float) var12 * this.field9858 + var30 + this.field9843;
                        var42 = (int) ((float) this.field9855.field8093 * var41 / var23) + arg4.field2859;
                        var43 = (float) var14 * this.field9844 + (float) var11 * this.field9847 + var29 + this.field9846;
                        var44 = (int) ((float) this.field9855.field8090 * var43 / var24) + arg4.field2856;
                        var45 = (float) var14 * this.field9841 + (float) var11 * this.field9858 + var30 + this.field9843;
                        var46 = (int) ((float) this.field9855.field8093 * var45 / var24) + arg4.field2859;
                    } else {
                        var31 = (float) var13 * this.field9844 + (float) var11 * this.field9847 + var29 + this.field9846;
                        var32 = (int) ((float) this.field9855.field8090 * var31 / (float) this.field9845) + arg4.field2856;
                        var33 = (float) var13 * this.field9841 + (float) var11 * this.field9858 + var30 + this.field9843;
                        var34 = (int) ((float) this.field9855.field8093 * var33 / (float) this.field9845) + arg4.field2859;
                        var35 = (float) var13 * this.field9844 + (float) var12 * this.field9847 + var29 + this.field9846;
                        var36 = (int) ((float) this.field9855.field8090 * var35 / (float) this.field9845) + arg4.field2856;
                        var37 = (float) var13 * this.field9841 + (float) var12 * this.field9858 + var30 + this.field9843;
                        var38 = (int) ((float) this.field9855.field8093 * var37 / (float) this.field9845) + arg4.field2859;
                        var39 = (float) var14 * this.field9844 + (float) var12 * this.field9847 + var29 + this.field9846;
                        var40 = (int) ((float) this.field9855.field8090 * var39 / (float) this.field9845) + arg4.field2856;
                        var41 = (float) var14 * this.field9841 + (float) var12 * this.field9858 + var30 + this.field9843;
                        var42 = (int) ((float) this.field9855.field8093 * var41 / (float) this.field9845) + arg4.field2859;
                        var43 = (float) var14 * this.field9844 + (float) var11 * this.field9847 + var29 + this.field9846;
                        var44 = (int) ((float) this.field9855.field8090 * var43 / (float) this.field9845) + arg4.field2856;
                        var45 = (float) var14 * this.field9841 + (float) var11 * this.field9858 + var30 + this.field9843;
                        var46 = (int) ((float) this.field9855.field8093 * var45 / (float) this.field9845) + arg4.field2859;
                    }
                } else {
                    int var47 = super.field3436[arg0][arg1];
                    int var48 = super.field3436[arg0 + 1][arg1];
                    int var49 = super.field3436[arg0 + 1][arg1 + 1];
                    int var50 = super.field3436[arg0][arg1 + 1];
                    if (this.field9845 == -1) {
                        var21 = (float) var13 * this.field9842 + (float) var11 * this.field9850 + (float) var47 * this.field9853 + this.field9856;
                        if (var21 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var22 = (float) var13 * this.field9842 + (float) var12 * this.field9850 + (float) var48 * this.field9853 + this.field9856;
                        if (var22 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var23 = (float) var14 * this.field9842 + (float) var12 * this.field9850 + (float) var49 * this.field9853 + this.field9856;
                        if (var23 <= (float) this.field9855.field8091) {
                            return;
                        }
                        var24 = (float) var14 * this.field9842 + (float) var11 * this.field9850 + (float) var50 * this.field9853 + this.field9856;
                        if (var24 <= (float) this.field9855.field8091) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field9842 + (float) var11 * this.field9850 + (float) var47 * this.field9853 + this.field9856;
                        var22 = (float) var13 * this.field9842 + (float) var12 * this.field9850 + (float) var48 * this.field9853 + this.field9856;
                        var23 = (float) var14 * this.field9842 + (float) var12 * this.field9850 + (float) var49 * this.field9853 + this.field9856;
                        var24 = (float) var14 * this.field9842 + (float) var11 * this.field9850 + (float) var50 * this.field9853 + this.field9856;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field703);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field365 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field703);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field371 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field703);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field374 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field703);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field369 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field712) {
                        int var59 = (int) (var21 - (float) arg3.field703);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field703);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field703);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field703);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field9845 == -1) {
                        var31 = (float) var13 * this.field9844 + (float) var11 * this.field9847 + (float) var47 * this.field9852 + this.field9846;
                        var32 = (int) ((float) this.field9855.field8090 * var31 / var21) + arg4.field2856;
                        var33 = (float) var13 * this.field9841 + (float) var11 * this.field9858 + (float) var47 * this.field9851 + this.field9843;
                        var34 = (int) ((float) this.field9855.field8093 * var33 / var21) + arg4.field2859;
                        var35 = (float) var13 * this.field9844 + (float) var12 * this.field9847 + (float) var48 * this.field9852 + this.field9846;
                        var36 = (int) ((float) this.field9855.field8090 * var35 / var22) + arg4.field2856;
                        var37 = (float) var13 * this.field9841 + (float) var12 * this.field9858 + (float) var48 * this.field9851 + this.field9843;
                        var38 = (int) ((float) this.field9855.field8093 * var37 / var22) + arg4.field2859;
                        var39 = (float) var14 * this.field9844 + (float) var12 * this.field9847 + (float) var49 * this.field9852 + this.field9846;
                        var40 = (int) ((float) this.field9855.field8090 * var39 / var23) + arg4.field2856;
                        var41 = (float) var14 * this.field9841 + (float) var12 * this.field9858 + (float) var49 * this.field9851 + this.field9843;
                        var42 = (int) ((float) this.field9855.field8093 * var41 / var23) + arg4.field2859;
                        var43 = (float) var14 * this.field9844 + (float) var11 * this.field9847 + (float) var50 * this.field9852 + this.field9846;
                        var44 = (int) ((float) this.field9855.field8090 * var43 / var24) + arg4.field2856;
                        var45 = (float) var14 * this.field9841 + (float) var11 * this.field9858 + (float) var50 * this.field9851 + this.field9843;
                        var46 = (int) ((float) this.field9855.field8093 * var45 / var24) + arg4.field2859;
                    } else {
                        var31 = (float) var13 * this.field9844 + (float) var11 * this.field9847 + (float) var47 * this.field9852 + this.field9846;
                        var32 = (int) ((float) this.field9855.field8090 * var31 / (float) this.field9845) + arg4.field2856;
                        var33 = (float) var13 * this.field9841 + (float) var11 * this.field9858 + (float) var47 * this.field9851 + this.field9843;
                        var34 = (int) ((float) this.field9855.field8093 * var33 / (float) this.field9845) + arg4.field2859;
                        var35 = (float) var13 * this.field9844 + (float) var12 * this.field9847 + (float) var48 * this.field9852 + this.field9846;
                        var36 = (int) ((float) this.field9855.field8090 * var35 / (float) this.field9845) + arg4.field2856;
                        var37 = (float) var13 * this.field9841 + (float) var12 * this.field9858 + (float) var48 * this.field9851 + this.field9843;
                        var38 = (int) ((float) this.field9855.field8093 * var37 / (float) this.field9845) + arg4.field2859;
                        var39 = (float) var14 * this.field9844 + (float) var12 * this.field9847 + (float) var49 * this.field9852 + this.field9846;
                        var40 = (int) ((float) this.field9855.field8090 * var39 / (float) this.field9845) + arg4.field2856;
                        var41 = (float) var14 * this.field9841 + (float) var12 * this.field9858 + (float) var49 * this.field9851 + this.field9843;
                        var42 = (int) ((float) this.field9855.field8093 * var41 / (float) this.field9845) + arg4.field2859;
                        var43 = (float) var14 * this.field9844 + (float) var11 * this.field9847 + (float) var50 * this.field9852 + this.field9846;
                        var44 = (int) ((float) this.field9855.field8090 * var43 / (float) this.field9845) + arg4.field2856;
                        var45 = (float) var14 * this.field9841 + (float) var11 * this.field9858 + (float) var50 * this.field9851 + this.field9843;
                        var46 = (int) ((float) this.field9855.field8093 * var45 / (float) this.field9845) + arg4.field2859;
                    }
                }
                boolean var63 = var10.field366 != -1 && this.method3916(this.field9855.field7898.method2486(var10.field366, (byte) 86).field234);
                if (this.field9845 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field2862 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field2849 || var44 > arg4.field2849 || var36 > arg4.field2849;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field2864 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field366 >= 0) {
                                    arg4.method1371(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field721, var17, var18, var16, var10.field368, var10.field372, var10.field373, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field366);
                                } else {
                                    arg4.method1379(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class330.method1876((byte) 117, var17 << 24 | arg3.field721, var10.field368), class330.method1876((byte) 79, var18 << 24 | arg3.field721, var10.field372), class330.method1876((byte) -104, var16 << 24 | arg3.field721, var10.field373));
                                }
                            } else if (var10.field366 >= 0) {
                                arg4.method1380(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field368, var10.field372, var10.field373, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field366);
                            } else {
                                arg4.method1379(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field368, var10.field372, var10.field373);
                            }
                            arg4.field2864 = 0;
                        } else {
                            arg4.method1383(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field721);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field2862 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field2849 || var36 > arg4.field2849 || var44 > arg4.field2849;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field2864 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field366 >= 0) {
                                    arg4.method1371(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field721, var15, var16, var18, var10.field367, var10.field373, var10.field372, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field366);
                                } else {
                                    arg4.method1379(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class330.method1876((byte) 39, var15 << 24 | arg3.field721, var10.field367), class330.method1876((byte) -104, var16 << 24 | arg3.field721, var10.field373), class330.method1876((byte) 2, var18 << 24 | arg3.field721, var10.field372));
                                }
                            } else if (var10.field366 >= 0) {
                                arg4.method1380(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field367, var10.field373, var10.field372, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field366);
                            } else {
                                arg4.method1379(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field367, var10.field373, var10.field372);
                            }
                            arg4.field2864 = 0;
                            return;
                        }
                        arg4.method1383(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field721);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field2862 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field2849 || var44 > arg4.field2849 || var36 > arg4.field2849;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field2864 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field366 >= 0) {
                                    arg4.method1371(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field721, var17, var18, var16, var10.field368, var10.field372, var10.field373, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field9845, this.field9845, this.field9845, var10.field366);
                                } else {
                                    arg4.method1379(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class330.method1876((byte) -118, var17 << 24 | arg3.field721, var10.field368), class330.method1876((byte) 19, var18 << 24 | arg3.field721, var10.field372), class330.method1876((byte) -106, var16 << 24 | arg3.field721, var10.field373));
                                }
                            } else if (var10.field366 >= 0) {
                                arg4.method1380(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field368, var10.field372, var10.field373, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field9845, this.field9845, this.field9845, var10.field366);
                            } else {
                                arg4.method1379(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field368, var10.field372, var10.field373);
                            }
                            arg4.field2864 = 0;
                        } else {
                            arg4.method1383(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field721);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field2862 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field2849 || var36 > arg4.field2849 || var44 > arg4.field2849;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field2864 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field366 >= 0) {
                                    arg4.method1371(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field721, var15, var16, var18, var10.field367, var10.field373, var10.field372, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field9845, this.field9845, this.field9845, var10.field366);
                                } else {
                                    arg4.method1379(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class330.method1876((byte) -108, var15 << 24 | arg3.field721, var10.field367), class330.method1876((byte) 100, var16 << 24 | arg3.field721, var10.field373), class330.method1876((byte) 4, var18 << 24 | arg3.field721, var10.field372));
                                }
                            } else if (var10.field366 >= 0) {
                                arg4.method1380(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field367, var10.field373, var10.field372, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field9845, this.field9845, this.field9845, var10.field366);
                            } else {
                                arg4.method1379(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field367, var10.field373, var10.field372);
                            }
                            arg4.field2864 = 0;
                            return;
                        }
                        arg4.method1383(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field721);
                    }
                }
            }
        } else {
            class38 var68 = this.field9840[arg0][arg1];
            if (var68 != null) {
                if (this.field9845 == -1) {
                    for (int var69 = 0; var69 < var68.field511; ++var69) {
                        int var70 = (arg0 << super.field3437) + var68.field516[var69];
                        int var71 = var68.field517[var69];
                        int var72 = (arg1 << super.field3437) + var68.field515[var69];
                        float var73 = (float) var72 * this.field9842 + (float) var70 * this.field9850 + (float) var71 * this.field9853 + this.field9856;
                        if (var73 <= (float) this.field9855.field8091) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field703);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field513[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field712) {
                            int var76 = (int) (var73 - (float) arg3.field703);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field9844 + (float) var70 * this.field9847 + (float) var71 * this.field9852 + this.field9846;
                        float var78 = (float) var72 * this.field9841 + (float) var70 * this.field9858 + (float) var71 * this.field9851 + this.field9843;
                        arg5[var69] = (int) ((float) this.field9855.field8090 * var77 / var73) + arg4.field2856;
                        arg6[var69] = (int) ((float) this.field9855.field8093 * var78 / var73) + arg4.field2859;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field511; ++var79) {
                        int var131 = (arg0 << super.field3437) + var68.field516[var79];
                        int var132 = var68.field517[var79];
                        int var133 = (arg1 << super.field3437) + var68.field515[var79];
                        float var134 = (float) var133 * this.field9842 + (float) var131 * this.field9850 + (float) var132 * this.field9853 + this.field9856;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field9845 - arg3.field703;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field513[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field712) {
                            int var137 = this.field9845 - arg3.field703;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field9844 + (float) var131 * this.field9847 + (float) var132 * this.field9852 + this.field9846;
                        float var139 = (float) var133 * this.field9841 + (float) var131 * this.field9858 + (float) var132 * this.field9851 + this.field9843;
                        arg5[var79] = (int) ((float) this.field9855.field8090 * var138 / (float) this.field9845) + arg4.field2856;
                        arg6[var79] = (int) ((float) this.field9855.field8093 * var139 / (float) this.field9845) + arg4.field2859;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field512 != null) {
                    int var80 = super.field3436[arg0][arg1];
                    int var81 = super.field3436[arg0 + 1][arg1];
                    int var82 = super.field3436[arg0][arg1 + 1];
                    int var83 = super.field3432 * arg0;
                    int var84 = super.field3432 + var83;
                    int var85 = super.field3432 * arg1;
                    int var86 = super.field3432 + var85;
                    float var87 = (float) var85 * this.field9844 + (float) var80 * this.field9852 + (float) var83 * this.field9847 + this.field9846;
                    float var88 = (float) var85 * this.field9841 + (float) var80 * this.field9851 + (float) var83 * this.field9858 + this.field9843;
                    float var89 = (float) var85 * this.field9842 + (float) var80 * this.field9853 + (float) var83 * this.field9850 + this.field9856;
                    float var90 = (float) var85 * this.field9844 + (float) var81 * this.field9852 + (float) var84 * this.field9847 + this.field9846;
                    float var91 = (float) var85 * this.field9841 + (float) var81 * this.field9851 + (float) var84 * this.field9858 + this.field9843;
                    float var92 = (float) var85 * this.field9842 + (float) var81 * this.field9853 + (float) var84 * this.field9850 + this.field9856;
                    float var93 = (float) var86 * this.field9844 + (float) var82 * this.field9852 + (float) var83 * this.field9847 + this.field9846;
                    float var94 = (float) var86 * this.field9841 + (float) var82 * this.field9851 + (float) var83 * this.field9858 + this.field9843;
                    float var95 = (float) var86 * this.field9842 + (float) var82 * this.field9853 + (float) var83 * this.field9850 + this.field9856;
                    if (this.field9845 == -1) {
                        for (int var96 = 0; var96 < var68.field518; ++var96) {
                            int var97 = var96 * 3;
                            int var98 = var97 + 1;
                            int var99 = var98 + 1;
                            int var100 = arg5[var97];
                            int var101 = arg5[var98];
                            int var102 = arg5[var99];
                            int var103 = arg6[var97];
                            int var104 = arg6[var98];
                            int var105 = arg6[var99];
                            int var106 = arg8[var97] + arg8[var98] + arg8[var99];
                            if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                                arg4.field2862 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field2849 || var101 > arg4.field2849 || var102 > arg4.field2849;
                                short var107 = var68.field512[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method3916(this.field9855.field7898.method2486(var107, (byte) 86).field234)) {
                                        arg4.field2864 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method1371(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field721, arg8[var97], arg8[var98], arg8[var99], var68.field510[var97], var68.field510[var98], var68.field510[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field510[var97] & 16777215) != 0) {
                                            arg4.method1379(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class330.method1876((byte) -105, arg8[var97] << 24 | arg3.field721, var68.field510[var97]), class330.method1876((byte) -127, arg8[var98] << 24 | arg3.field721, var68.field510[var98]), class330.method1876((byte) 127, arg8[var99] << 24 | arg3.field721, var68.field510[var99]));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method1380(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field510[var97], var68.field510[var98], var68.field510[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field510[var97] & 16777215) != 0) {
                                        arg4.method1379(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field510[var97], var68.field510[var98], var68.field510[var99]);
                                    }
                                    arg4.field2864 = 0;
                                } else {
                                    arg4.method1383(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field721);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field518; ++var108) {
                        int var109 = var108 * 3;
                        int var110 = var109 + 1;
                        int var111 = var110 + 1;
                        int var112 = arg5[var109];
                        int var113 = arg5[var110];
                        int var114 = arg5[var111];
                        int var115 = arg6[var109];
                        int var116 = arg6[var110];
                        int var117 = arg6[var111];
                        int var118 = arg8[var109] + arg8[var110] + arg8[var111];
                        if ((var112 - var113) * (var117 - var116) - (var114 - var113) * (var115 - var116) > 0) {
                            arg4.field2862 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field2849 || var113 > arg4.field2849 || var114 > arg4.field2849;
                            short var119 = var68.field512[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method3916(this.field9855.field7898.method2486(var119, (byte) 86).field234)) {
                                    arg4.field2864 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method1371(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field721, arg8[var109], arg8[var110], arg8[var111], var68.field510[var109], var68.field510[var110], var68.field510[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field9845, this.field9845, this.field9845, var119);
                                    } else if ((var68.field510[var109] & 16777215) != 0) {
                                        arg4.method1379(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class330.method1876((byte) 70, arg8[var109] << 24 | arg3.field721, var68.field510[var109]), class330.method1876((byte) -119, arg8[var110] << 24 | arg3.field721, var68.field510[var110]), class330.method1876((byte) 21, arg8[var111] << 24 | arg3.field721, var68.field510[var111]));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method1380(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field510[var109], var68.field510[var110], var68.field510[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field9845, this.field9845, this.field9845, var119);
                                } else if ((var68.field510[var109] & 16777215) != 0) {
                                    arg4.method1379(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field510[var109], var68.field510[var110], var68.field510[var111]);
                                }
                                arg4.field2864 = 0;
                            } else {
                                arg4.method1383(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field721);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field518; ++var120) {
                    int var121 = var120 * 3;
                    int var122 = var121 + 1;
                    int var123 = var122 + 1;
                    int var124 = arg5[var121];
                    int var125 = arg5[var122];
                    int var126 = arg5[var123];
                    int var127 = arg6[var121];
                    int var128 = arg6[var122];
                    int var129 = arg6[var123];
                    int var130 = arg8[var121] + arg8[var122] + arg8[var123];
                    if ((var124 - var125) * (var129 - var128) - (var126 - var125) * (var127 - var128) > 0) {
                        arg4.field2862 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field2849 || var125 > arg4.field2849 || var126 > arg4.field2849;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field510[var121] & 16777215) != 0) {
                                    arg4.method1379(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class506.method2721(arg8[var121], true, arg3.field721, var68.field510[var121]), class506.method2721(arg8[var122], true, arg3.field721, var68.field510[var122]), class506.method2721(arg8[var123], true, arg3.field721, var68.field510[var123]));
                                }
                            } else if ((var68.field510[var121] & 16777215) != 0) {
                                arg4.method1379(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field510[var121], var68.field510[var122], var68.field510[var123]);
                            }
                        } else {
                            arg4.method1383(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field721);
                        }
                    }
                }
            }
        }
    }
}
