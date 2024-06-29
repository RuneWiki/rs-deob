import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class484 extends class543 {

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "I")
    public int field7344 = -1;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "Lfg;")
    public class164 field7358;

    @OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
    private int field7353;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "[[I")
    public int[][] field7341;

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "[[B")
    private byte[][] field7357;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "[[B")
    private byte[][] field7354;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public int field7339;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
    public int field7340;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
    public int field7343;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
    public int field7346;

    @OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
    public int field7347;

    @OriginalMember(owner = "client!hu", name = "v", descriptor = "I")
    public int field7348;

    @OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!hu", name = "y", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "[[Lvca;")
    public class13[][] field7355;

    @OriginalMember(owner = "client!hu", name = "D", descriptor = "[[Ljw;")
    public class244[][] field7356;

    @OriginalMember(owner = "client!hu", name = "x", descriptor = "[[Lho;")
    public class423[][] field7350;

    @OriginalMember(owner = "client!hu", name = "z", descriptor = "[[Lwh;")
    public class505[][] field7352;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)Z", line = 6)
    public final boolean method2938(int arg0) {
        if ((this.field7353 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!hu", name = "ba", descriptor = "(II)I", line = 25)
    public final int method1319(int arg0, int arg1) {
        return this.field7341[arg0][arg1];
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lat;[I)V", line = 27)
    public final void method1328(class535 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!hu", name = "ya", descriptor = "(Lk;IIIIZ)V", line = 30)
    public final void method1322(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!hu", name = "X", descriptor = "(IILk;)Lk;", line = 36)
    public final class88 method1329(int arg0, int arg1, class88 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)I", line = 40)
    private static final int method2939(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "(Lk;IIIIZ)V", line = 72)
    public final void method1314(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!hu", name = "Q", descriptor = "(III)V", line = 75)
    public final void method1317(int arg0, int arg1, int arg2) {
        if (this.field7354[arg0][arg1] < arg2) {
            this.field7354[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "()V", line = 82)
    public final void method1321() {
        this.field7357 = null;
        this.field7354 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 86)
    public final boolean method1325(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III[[ZZ)V", line = 91)
    public final void method1318(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class569 var6 = this.field7358.field2202;
        this.field7344 = -1;
        this.field7345 = var6.field8431;
        this.field7347 = var6.field8426;
        this.field7348 = var6.field8429;
        this.field7338 = var6.field8428;
        this.field7343 = var6.field8422;
        this.field7342 = var6.field8430;
        this.field7359 = var6.field8425;
        this.field7339 = var6.field8424;
        this.field7340 = var6.field8420;
        this.field7349 = var6.field8423;
        this.field7346 = var6.field8427;
        this.field7351 = var6.field8421;
    }

    @OriginalMember(owner = "client!hu", name = "aa", descriptor = "(II)I", line = 109)
    public final int method1323(int arg0, int arg1) {
        int var3 = arg0 >> super.field8119;
        int var4 = arg1 >> super.field8119;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field8121 - 1 && var4 <= super.field8118 - 1) {
            int var5 = arg0 & super.field8116 - 1;
            int var6 = arg1 & super.field8116 - 1;
            int var7 = (super.field8116 - var5) * this.field7341[var3][var4] + this.field7341[var3 + 1][var4] * var5 >> super.field8119;
            int var8 = (super.field8116 - var5) * this.field7341[var3][var4 + 1] + this.field7341[var3 + 1][var4 + 1] * var5 >> super.field8119;
            return (super.field8116 - var6) * var7 + var6 * var8 >> super.field8119;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hu", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 126)
    public final void method1320(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field7356 == null) {
            this.field7356 = new class244[super.field8121][super.field8118];
            this.field7355 = new class13[super.field8121][super.field8118];
        } else if (this.field7350 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class150.field1929[class627.method3660(arg6[var15], false) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class150.field1929[class627.method3660(arg7[var16], false) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field8116 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field8116 && arg4[var22] == super.field8116) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field8116) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field8116 != arg2[var24] && arg2[0] - super.field8116 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field8116 != arg4[var24] && arg4[0] - super.field8116 != arg4[var24]) {
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
                class244 var25 = new class244();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field3581 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field3580 = (byte) (var25.field3580 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field7341[arg0 + 1][arg1] == this.field7341[arg0][arg1] && this.field7341[arg0 + 1][arg1 + 1] == this.field7341[arg0][arg1] && this.field7341[arg0][arg1 + 1] == this.field7341[arg0][arg1]) {
                    var25.field3580 = (byte) (var25.field3580 | 1);
                }
                if (var27 != -1 && (var25.field3580 & 2) == 0 && !this.field7358.field2262.method1762(var27, (byte) 45).field975) {
                    var25.field3582 = this.field7357[arg0][arg1] - this.field7354[arg0][arg1];
                    var25.field3579 = this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1];
                    var25.field3588 = this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1];
                    var25.field3584 = this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1];
                    var25.field3578 = (short) var27;
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
                    var25.field3582 = class369.method2248(arg10, method2939(arg6[var18] >> 8, this.field7357[arg0][arg1] - this.field7354[arg0][arg1]), -111, var28);
                    if (var25.field3581 != 0) {
                        var25.field3582 |= 255 - (this.field7357[arg0][arg1] - this.field7354[arg0][arg1]) << 25;
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
                    var25.field3579 = class369.method2248(arg10, method2939(arg6[var19] >> 8, this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1]), -111, var29);
                    if (var25.field3581 != 0) {
                        var25.field3579 |= 255 - (this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1]) << 25;
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
                    var25.field3588 = class369.method2248(arg10, method2939(arg6[var20] >> 8, this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1]), -124, var30);
                    if (var25.field3581 != 0) {
                        var25.field3588 |= 255 - (this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field3584 = class369.method2248(arg10, method2939(arg6[var21] >> 8, this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1]), -117, var31);
                    if (var25.field3581 != 0) {
                        var25.field3584 |= 255 - (this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1]) << 25;
                    }
                    var25.field3578 = -1;
                }
                if (arg5 != null) {
                    var25.field3585 = (short) arg5[var20];
                    var25.field3587 = (short) arg5[var21];
                    var25.field3583 = (short) arg5[var19];
                    var25.field3586 = (short) arg5[var18];
                }
                this.field7356[arg0][arg1] = var25;
            } else {
                class13 var32 = new class13();
                var32.field115 = (short) arg2.length;
                var32.field113 = (short) (arg2.length / 3);
                var32.field109 = new short[var32.field115];
                var32.field107 = new short[var32.field115];
                var32.field111 = new short[var32.field115];
                var32.field110 = new int[var32.field115];
                if (arg5 != null) {
                    var32.field112 = new short[var32.field115];
                }
                for (int var33 = 0; var33 < var32.field115; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field7357[arg0][arg1] - this.field7354[arg0][arg1];
                    } else if (var48 == 0 && super.field8116 == var49) {
                        var51 = this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1];
                    } else if (super.field8116 == var48 && super.field8116 == var49) {
                        var51 = this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1];
                    } else if (super.field8116 == var48 && var49 == 0) {
                        var51 = this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1]) * var48 + (this.field7357[arg0][arg1] - this.field7354[arg0][arg1]) * (super.field8116 - var48);
                        int var53 = (this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1]) * var48 + (this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1]) * (super.field8116 - var48);
                        var51 = (super.field8116 - var49) * var52 + var49 * var53 >> super.field8119 * 2;
                    }
                    int var54 = (arg0 << super.field8119) + var48;
                    int var55 = (arg1 << super.field8119) + var49;
                    var32.field109[var33] = (short) var48;
                    var32.field111[var33] = (short) var49;
                    var32.field107[var33] = (short) (this.method1323(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field7358.field2262.method1762(arg8[var33], (byte) 45).field975) {
                        var32.field110[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field110[var33] = var51 << 25;
                        } else {
                            var32.field110[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field112[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field110[var33] = class369.method2248(arg10, method2939(arg6[var33] >> 8, var51), -100, var56);
                        if (arg7 != null) {
                            var32.field110[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field113; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field7358.field2262.method1762(arg8[var35 * 3], (byte) 45).field975) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field106 = new int[var32.field113];
                }
                if (var34) {
                    var32.field108 = new short[var32.field113];
                    var32.field114 = new short[var32.field113];
                }
                for (int var36 = 0; var36 < var32.field113; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field106[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field7358.field2262.method1762(var42, (byte) 45).field975) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field7358.field2262.method1762(var43, (byte) 45).field975) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field7358.field2262.method1762(var44, (byte) 45).field975) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field108[var36] = (short) var44;
                            var32.field114[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field7358.field2262.method1762(var45, (byte) 45).field975) {
                                    var32.field110[var37] = class150.field1929[class627.method3660(this.field7358.field2262.method1762(var45, (byte) 45).field963 & 65535, false) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field7358.field2262.method1762(var46, (byte) 45).field975) {
                                    var32.field110[var38] = class150.field1929[class627.method3660(this.field7358.field2262.method1762(var46, (byte) 45).field963 & 65535, false) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field7358.field2262.method1762(var47, (byte) 45).field975) {
                                    var32.field110[var39] = class150.field1929[class627.method3660(this.field7358.field2262.method1762(var47, (byte) 45).field963 & 65535, false) & 65535];
                                }
                            }
                            var32.field108[var36] = -1;
                        }
                    }
                }
                this.field7355[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lfg;IIII[[I[[II)V", line = 620)
    public class484(class164 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7358 = arg0;
        this.field7353 = arg2;
        this.field7341 = arg5;
        this.field7357 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7358.field2224 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7358.field2220 * var18 + this.field7358.field2204 * var17 + this.field7358.field2198 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7357[var11][var10] = (byte) var20;
            }
        }
        this.field7354 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 676)
    public final void method1326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7350 == null) {
            this.field7350 = new class423[super.field8121][super.field8118];
            this.field7352 = new class505[super.field8121][super.field8118];
        } else if (this.field7356 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field8116 != var20 || var21 != 0 && super.field8116 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class505 var22 = new class505();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field7531 = var23;
            var22.field7528 = new short[var23];
            var22.field7532 = new short[var23];
            var22.field7534 = new short[var23];
            var22.field7530 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field7528[var25] = (short) (this.field7357[arg0][arg1] - this.field7354[arg0][arg1]);
                } else if (var30 == 0 && super.field8116 == var31) {
                    var22.field7528[var25] = (short) (this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1]);
                } else if (super.field8116 == var30 && super.field8116 == var31) {
                    var22.field7528[var25] = (short) (this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1]);
                } else if (super.field8116 == var30 && var31 == 0) {
                    var22.field7528[var25] = (short) (this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1]) * var30 + (this.field7357[arg0][arg1] - this.field7354[arg0][arg1]) * (super.field8116 - var30);
                    int var33 = (this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1]) * var30 + (this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1]) * (super.field8116 - var30);
                    var22.field7528[var25] = (short) ((super.field8116 - var31) * var32 + var31 * var33 >> super.field8119 * 2);
                }
                int var34 = (arg0 << super.field8119) + var30;
                int var35 = (arg1 << super.field8119) + var31;
                var22.field7532[var25] = (short) var30;
                var22.field7530[var25] = (short) var31;
                var22.field7534[var25] = (short) (this.method1323(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field7528[var25] < 2) {
                    var22.field7528[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field7358.field2262.method1762(arg11[var28], (byte) 45).field975) {
                    var26 = true;
                }
            }
            var22.field7524 = new int[var27];
            if (arg10 != null) {
                var22.field7526 = new int[var27];
            }
            var22.field7533 = new short[var27];
            var22.field7525 = new short[var27];
            var22.field7529 = new short[var27];
            if (var26) {
                var22.field7523 = new short[var27];
                var22.field7535 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field7524[var22.field7527] = class627.method3660(arg9[var29], false);
                    } else {
                        var22.field7524[var22.field7527] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field7526[var22.field7527] = class627.method3660(arg10[var29], false);
                        } else {
                            var22.field7526[var22.field7527] = -1;
                        }
                    }
                    var22.field7533[var22.field7527] = (short) arg6[var29];
                    var22.field7525[var22.field7527] = (short) arg7[var29];
                    var22.field7529[var22.field7527] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7358.field2262.method1762(arg11[var29], (byte) 45).field975) {
                            var22.field7523[var22.field7527] = (short) arg11[var29];
                            var22.field7535[var22.field7527] = (short) arg12[var29];
                        } else {
                            var22.field7523[var22.field7527] = -1;
                        }
                    }
                    ++var22.field7527;
                }
            }
            this.field7352[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class423 var36 = new class423();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field6057 = class189.method1234((byte) 41, this.field7357[arg0][arg1] - this.field7354[arg0][arg1], class627.method3660(arg10[0], false));
                    if (var37 == -1) {
                        var36.field6056 = (byte) (var36.field6056 | 2);
                    }
                }
                if (this.field7341[arg0 + 1][arg1] == this.field7341[arg0][arg1] && this.field7341[arg0 + 1][arg1 + 1] == this.field7341[arg0][arg1] && this.field7341[arg0][arg1 + 1] == this.field7341[arg0][arg1]) {
                    var36.field6056 = (byte) (var36.field6056 | 1);
                }
                if (var38 != -1 && (var36.field6056 & 2) == 0 && !this.field7358.field2262.method1762(var38, (byte) 45).field975) {
                    var36.field6055 = (short) (this.field7357[arg0][arg1] - this.field7354[arg0][arg1]);
                    var36.field6053 = (short) (this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1]);
                    var36.field6052 = (short) (this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1]);
                    var36.field6058 = (short) (this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1]);
                    var36.field6054 = (short) var38;
                } else {
                    short var39 = class627.method3660(var37, false);
                    var36.field6055 = (short) class189.method1234((byte) -98, this.field7357[arg0][arg1] - this.field7354[arg0][arg1], var39);
                    var36.field6053 = (short) class189.method1234((byte) -111, this.field7357[arg0 + 1][arg1] - this.field7354[arg0 + 1][arg1], var39);
                    var36.field6052 = (short) class189.method1234((byte) 55, this.field7357[arg0 + 1][arg1 + 1] - this.field7354[arg0 + 1][arg1 + 1], var39);
                    var36.field6058 = (short) class189.method1234((byte) -92, this.field7357[arg0][arg1 + 1] - this.field7354[arg0][arg1 + 1], var39);
                    var36.field6054 = -1;
                }
                this.field7350[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
    public abstract void method1330(int arg0, int arg1);
}
