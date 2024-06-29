import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class class26 extends class176 {

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
    public int field263 = -1;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "Lkb;")
    public class633 field254;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "[[I")
    public int[][] field261;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "[[B")
    private byte[][] field259;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "[[B")
    private byte[][] field248;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "[[Lfm;")
    public class342[][] field247;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "[[Lwd;")
    public class358[][] field257;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "[[Lcaa;")
    public class378[][] field250;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "[[Loj;")
    public class392[][] field252;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(IILw;)Lw;", line = 3)
    public final class451 method147(int arg0, int arg1, class451 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ev", name = "ba", descriptor = "()V", line = 10)
    public final void method148() {
        this.field259 = null;
        this.field248 = null;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III[[ZZ)V", line = 19)
    public void method149(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class263 var6 = this.field254.field8617;
        this.field263 = -1;
        this.field258 = var6.field3616;
        this.field251 = var6.field3624;
        this.field255 = var6.field3617;
        this.field249 = var6.field3626;
        this.field243 = var6.field3620;
        this.field260 = var6.field3627;
        this.field262 = var6.field3619;
        this.field264 = var6.field3622;
        this.field246 = var6.field3625;
        this.field253 = var6.field3618;
        this.field245 = var6.field3621;
        this.field256 = var6.field3623;
    }

    @OriginalMember(owner = "client!ev", name = "JA", descriptor = "(II)I", line = 35)
    public final int method150(int arg0, int arg1) {
        return this.field261[arg0][arg1];
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Z", line = 39)
    public final boolean method151(int arg0) {
        if ((this.field244 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ev", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 53)
    public final void method152(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ev", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 57)
    public final void method153(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field250 == null) {
            this.field250 = new class378[super.field2214][super.field2215];
            this.field252 = new class392[super.field2214][super.field2215];
        } else if (this.field257 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class554.field7586[class306.method1836(127, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class554.field7586[class306.method1836(127, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field2210 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2210 && arg4[var22] == super.field2210) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2210) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2210 != arg2[var24] && arg2[0] - super.field2210 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2210 != arg4[var24] && arg4[0] - super.field2210 != arg4[var24]) {
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
                class378 var25 = new class378();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field5424 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field5419 = (byte) (var25.field5419 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field261[arg0 + 1][arg1] == this.field261[arg0][arg1] && this.field261[arg0 + 1][arg1 + 1] == this.field261[arg0][arg1] && this.field261[arg0][arg1 + 1] == this.field261[arg0][arg1]) {
                    var25.field5419 = (byte) (var25.field5419 | 1);
                }
                if (var27 != -1 && (var25.field5419 & 2) == 0 && !this.field254.field9731.method1728(-110, var27).field7857) {
                    var25.field5423 = this.field259[arg0][arg1] - this.field248[arg0][arg1];
                    var25.field5429 = this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1];
                    var25.field5421 = this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1];
                    var25.field5428 = this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1];
                    var25.field5420 = (short) var27;
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
                    var25.field5423 = class548.method3080(method161(arg6[var18] >> 8, this.field259[arg0][arg1] - this.field248[arg0][arg1]), -102, arg10, var28);
                    if (var25.field5424 != 0) {
                        var25.field5423 |= 255 - (this.field259[arg0][arg1] - this.field248[arg0][arg1]) << 25;
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
                    var25.field5429 = class548.method3080(method161(arg6[var19] >> 8, this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]), -84, arg10, var29);
                    if (var25.field5424 != 0) {
                        var25.field5429 |= 255 - (this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]) << 25;
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
                    var25.field5421 = class548.method3080(method161(arg6[var20] >> 8, this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]), -88, arg10, var30);
                    if (var25.field5424 != 0) {
                        var25.field5421 |= 255 - (this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field5428 = class548.method3080(method161(arg6[var21] >> 8, this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]), -87, arg10, var31);
                    if (var25.field5424 != 0) {
                        var25.field5428 |= 255 - (this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]) << 25;
                    }
                    var25.field5420 = -1;
                }
                if (arg5 != null) {
                    var25.field5426 = (short) arg5[var20];
                    var25.field5422 = (short) arg5[var21];
                    var25.field5427 = (short) arg5[var19];
                    var25.field5425 = (short) arg5[var18];
                }
                this.field250[arg0][arg1] = var25;
            } else {
                class392 var32 = new class392();
                var32.field5621 = (short) arg2.length;
                var32.field5619 = (short) (arg2.length / 3);
                var32.field5622 = new short[var32.field5621];
                var32.field5615 = new short[var32.field5621];
                var32.field5614 = new short[var32.field5621];
                var32.field5623 = new int[var32.field5621];
                if (arg5 != null) {
                    var32.field5617 = new short[var32.field5621];
                }
                for (int var33 = 0; var33 < var32.field5621; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field259[arg0][arg1] - this.field248[arg0][arg1];
                    } else if (var48 == 0 && super.field2210 == var49) {
                        var51 = this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1];
                    } else if (super.field2210 == var48 && super.field2210 == var49) {
                        var51 = this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1];
                    } else if (super.field2210 == var48 && var49 == 0) {
                        var51 = this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]) * var48 + (this.field259[arg0][arg1] - this.field248[arg0][arg1]) * (super.field2210 - var48);
                        int var53 = (this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]) * var48 + (this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]) * (super.field2210 - var48);
                        var51 = (super.field2210 - var49) * var52 + var49 * var53 >> super.field2212 * 2;
                    }
                    int var54 = (arg0 << super.field2212) + var48;
                    int var55 = (arg1 << super.field2212) + var49;
                    var32.field5622[var33] = (short) var48;
                    var32.field5614[var33] = (short) var49;
                    var32.field5615[var33] = (short) (this.method159(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field254.field9731.method1728(-124, arg8[var33]).field7857) {
                        var32.field5623[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field5623[var33] = var51 << 25;
                        } else {
                            var32.field5623[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field5617[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field5623[var33] = class548.method3080(method161(arg6[var33] >> 8, var51), -69, arg10, var56);
                        if (arg7 != null) {
                            var32.field5623[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field5619; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field254.field9731.method1728(-103, arg8[var35 * 3]).field7857) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field5620 = new int[var32.field5619];
                }
                if (var34) {
                    var32.field5618 = new short[var32.field5619];
                    var32.field5616 = new short[var32.field5619];
                }
                for (int var36 = 0; var36 < var32.field5619; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field5620[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field254.field9731.method1728(-115, var42).field7857) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field254.field9731.method1728(-103, var43).field7857) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field254.field9731.method1728(-116, var44).field7857) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field5618[var36] = (short) var44;
                            var32.field5616[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field254.field9731.method1728(-127, var45).field7857) {
                                    var32.field5623[var37] = class554.field7586[class306.method1836(127, this.field254.field9731.method1728(-118, var45).field7858 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field254.field9731.method1728(-128, var46).field7857) {
                                    var32.field5623[var38] = class554.field7586[class306.method1836(127, this.field254.field9731.method1728(-98, var46).field7858 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field254.field9731.method1728(-105, var47).field7857) {
                                    var32.field5623[var39] = class554.field7586[class306.method1836(127, this.field254.field9731.method1728(-101, var47).field7858 & 65535) & 65535];
                                }
                            }
                            var32.field5618[var36] = -1;
                        }
                    }
                }
                this.field252[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lkb;IIII[[I[[II)V", line = 552)
    public class26(class633 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field254 = arg0;
        this.field244 = arg2;
        this.field261 = arg5;
        this.field259 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field254.field8614 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field254.field8603 * var18 + this.field254.field8621 * var17 + this.field254.field8601 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field259[var11][var10] = (byte) var20;
            }
        }
        this.field248 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ev", name = "EA", descriptor = "(III)V", line = 602)
    public final void method154(int arg0, int arg1, int arg2) {
        if (this.field248[arg0][arg1] < arg2) {
            this.field248[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 608)
    public final boolean method156(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ev", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 615)
    public final void method158(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ev", name = "sa", descriptor = "(II)I", line = 625)
    public final int method159(int arg0, int arg1) {
        int var3 = arg0 >> super.field2212;
        int var4 = arg1 >> super.field2212;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2214 - 1 && var4 <= super.field2215 - 1) {
            int var5 = arg0 & super.field2210 - 1;
            int var6 = arg1 & super.field2210 - 1;
            int var7 = (super.field2210 - var5) * this.field261[var3][var4] + this.field261[var3 + 1][var4] * var5 >> super.field2212;
            int var8 = (super.field2210 - var5) * this.field261[var3][var4 + 1] + this.field261[var3 + 1][var4 + 1] * var5 >> super.field2212;
            return (super.field2210 - var6) * var7 + var6 * var8 >> super.field2212;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lhj;[I)V", line = 641)
    public final void method160(class329 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)I", line = 651)
    private static final int method161(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 683)
    public final void method162(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field257 == null) {
            this.field257 = new class358[super.field2214][super.field2215];
            this.field247 = new class342[super.field2214][super.field2215];
        } else if (this.field250 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2210 != var20 || var21 != 0 && super.field2210 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class342 var22 = new class342();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5026 = var23;
            var22.field5028 = new short[var23];
            var22.field5030 = new short[var23];
            var22.field5018 = new short[var23];
            var22.field5022 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5028[var25] = (short) (this.field259[arg0][arg1] - this.field248[arg0][arg1]);
                } else if (var30 == 0 && super.field2210 == var31) {
                    var22.field5028[var25] = (short) (this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]);
                } else if (super.field2210 == var30 && super.field2210 == var31) {
                    var22.field5028[var25] = (short) (this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]);
                } else if (super.field2210 == var30 && var31 == 0) {
                    var22.field5028[var25] = (short) (this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]) * var30 + (this.field259[arg0][arg1] - this.field248[arg0][arg1]) * (super.field2210 - var30);
                    int var33 = (this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]) * var30 + (this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]) * (super.field2210 - var30);
                    var22.field5028[var25] = (short) ((super.field2210 - var31) * var32 + var31 * var33 >> super.field2212 * 2);
                }
                int var34 = (arg0 << super.field2212) + var30;
                int var35 = (arg1 << super.field2212) + var31;
                var22.field5030[var25] = (short) var30;
                var22.field5022[var25] = (short) var31;
                var22.field5018[var25] = (short) (this.method159(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field5028[var25] < 2) {
                    var22.field5028[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field254.field9731.method1728(-111, arg11[var28]).field7857) {
                    var26 = true;
                }
            }
            var22.field5019 = new int[var27];
            if (arg10 != null) {
                var22.field5023 = new int[var27];
            }
            var22.field5029 = new short[var27];
            var22.field5021 = new short[var27];
            var22.field5020 = new short[var27];
            if (var26) {
                var22.field5024 = new short[var27];
                var22.field5027 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5019[var22.field5025] = class306.method1836(127, arg9[var29]);
                    } else {
                        var22.field5019[var22.field5025] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5023[var22.field5025] = class306.method1836(127, arg10[var29]);
                        } else {
                            var22.field5023[var22.field5025] = -1;
                        }
                    }
                    var22.field5029[var22.field5025] = (short) arg6[var29];
                    var22.field5021[var22.field5025] = (short) arg7[var29];
                    var22.field5020[var22.field5025] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field254.field9731.method1728(-96, arg11[var29]).field7857) {
                            var22.field5024[var22.field5025] = (short) arg11[var29];
                            var22.field5027[var22.field5025] = (short) arg12[var29];
                        } else {
                            var22.field5024[var22.field5025] = -1;
                        }
                    }
                    ++var22.field5025;
                }
            }
            this.field247[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class358 var36 = new class358();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5192 = class54.method303(class306.method1836(127, arg10[0]), 127, this.field259[arg0][arg1] - this.field248[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field5193 = (byte) (var36.field5193 | 2);
                    }
                }
                if (this.field261[arg0 + 1][arg1] == this.field261[arg0][arg1] && this.field261[arg0 + 1][arg1 + 1] == this.field261[arg0][arg1] && this.field261[arg0][arg1 + 1] == this.field261[arg0][arg1]) {
                    var36.field5193 = (byte) (var36.field5193 | 1);
                }
                if (var38 != -1 && (var36.field5193 & 2) == 0 && !this.field254.field9731.method1728(-96, var38).field7857) {
                    var36.field5188 = (short) (this.field259[arg0][arg1] - this.field248[arg0][arg1]);
                    var36.field5191 = (short) (this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]);
                    var36.field5190 = (short) (this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]);
                    var36.field5187 = (short) (this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]);
                    var36.field5189 = (short) var38;
                } else {
                    short var39 = class306.method1836(127, var37);
                    var36.field5188 = (short) class54.method303(var39, 127, this.field259[arg0][arg1] - this.field248[arg0][arg1]);
                    var36.field5191 = (short) class54.method303(var39, 127, this.field259[arg0 + 1][arg1] - this.field248[arg0 + 1][arg1]);
                    var36.field5190 = (short) class54.method303(var39, 127, this.field259[arg0 + 1][arg1 + 1] - this.field248[arg0 + 1][arg1 + 1]);
                    var36.field5187 = (short) class54.method303(var39, 127, this.field259[arg0][arg1 + 1] - this.field248[arg0][arg1 + 1]);
                    var36.field5189 = -1;
                }
                this.field257[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)V")
    public abstract void method155(int arg0, int arg1);

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
