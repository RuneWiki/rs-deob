import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class536 extends class37 {

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    private int field7242 = -1;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Lkt;")
    private class142 field7241;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    private int field7245;

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "[[B")
    private byte[][] field7249;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "[[B")
    private byte[][] field7252;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "F")
    private float field7233;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "F")
    private float field7235;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "F")
    private float field7236;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "F")
    private float field7237;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "F")
    private float field7243;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "F")
    private float field7244;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "F")
    private float field7246;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "F")
    private float field7247;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "F")
    private float field7248;

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "F")
    private float field7250;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "F")
    private float field7251;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "F")
    private float field7253;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "[[Les;")
    private class348[][] field7240;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "[[Lah;")
    private class350[][] field7238;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "[[Lrba;")
    private class397[][] field7239;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "[[Lps;")
    private class82[][] field7234;

    @OriginalMember(owner = "client!iu", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 3)
    public final void method329(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII[[Z)V", line = 11)
    public final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class613 var9 = this.field7241.method1002(Thread.currentThread());
        class394 var10 = var9.field8556;
        var10.field5569 = 0;
        var10.field5560 = false;
        this.field7241.method89();
        if (this.field7238 != null) {
            this.method3035(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field8557, var9.field8571);
        } else {
            if (this.field7239 != null) {
                this.method3034(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field8557, var9.field8571);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V", line = 26)
    public final void method319(int arg0, int arg1, int arg2) {
        if (this.field7252[arg0][arg1] < arg2) {
            this.field7252[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!iu", name = "BA", descriptor = "()V", line = 31)
    public final void method325() {
        this.field7249 = null;
        this.field7252 = null;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lkt;IIII[[I[[II)V", line = 35)
    public class536(class142 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7241 = arg0;
        this.field7245 = arg2;
        this.field7249 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field7241.field2041 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field7241.field2043 * var18 + this.field7241.field2040 * var17 + this.field7241.field2026 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field7249[var11][var10] = (byte) var20;
            }
        }
        this.field7252 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "(Lha;IIIIZ)V", line = 85)
    public final void method330(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 89)
    public final boolean method320(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!iu", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 94)
    public final void method323(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field7238 == null) {
            this.field7238 = new class350[super.field446][super.field438];
            this.field7240 = new class348[super.field446][super.field438];
        } else if (this.field7239 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class244.field3322[class199.method1317(arg6[var15], 2124276899) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class244.field3322[class199.method1317(arg7[var16], 2124276899) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field441 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field441 && arg4[var22] == super.field441) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field441) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field441 != arg2[var24] && arg2[0] - super.field441 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field441 != arg4[var24] && arg4[0] - super.field441 != arg4[var24]) {
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
                class350 var25 = new class350();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field4659 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field4657 = (byte) (var25.field4657 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field440[arg0 + 1][arg1] == super.field440[arg0][arg1] && super.field440[arg0 + 1][arg1 + 1] == super.field440[arg0][arg1] && super.field440[arg0][arg1 + 1] == super.field440[arg0][arg1]) {
                    var25.field4657 = (byte) (var25.field4657 | 1);
                }
                if (var27 != -1 && (var25.field4657 & 2) == 0 && !this.field7241.field2418.method1365(-17951, var27).field9794) {
                    var25.field4655 = this.field7249[arg0][arg1] - this.field7252[arg0][arg1];
                    var25.field4660 = this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1];
                    var25.field4663 = this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1];
                    var25.field4665 = this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1];
                    var25.field4662 = (short) var27;
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
                    var25.field4655 = class32.method305(method3033(arg6[var18] >> 8, this.field7249[arg0][arg1] - this.field7252[arg0][arg1]), var28, 7589, arg10);
                    if (var25.field4659 != 0) {
                        var25.field4655 |= 255 - (this.field7249[arg0][arg1] - this.field7252[arg0][arg1]) << 25;
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
                    var25.field4660 = class32.method305(method3033(arg6[var19] >> 8, this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1]), var29, 7589, arg10);
                    if (var25.field4659 != 0) {
                        var25.field4660 |= 255 - (this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1]) << 25;
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
                    var25.field4663 = class32.method305(method3033(arg6[var20] >> 8, this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1]), var30, 7589, arg10);
                    if (var25.field4659 != 0) {
                        var25.field4663 |= 255 - (this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field4665 = class32.method305(method3033(arg6[var21] >> 8, this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1]), var31, 7589, arg10);
                    if (var25.field4659 != 0) {
                        var25.field4665 |= 255 - (this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1]) << 25;
                    }
                    var25.field4662 = -1;
                }
                if (arg5 != null) {
                    var25.field4664 = (short) arg5[var20];
                    var25.field4656 = (short) arg5[var21];
                    var25.field4658 = (short) arg5[var19];
                    var25.field4661 = (short) arg5[var18];
                }
                this.field7238[arg0][arg1] = var25;
            } else {
                class348 var32 = new class348();
                var32.field4651 = (short) arg2.length;
                var32.field4647 = (short) (arg2.length / 3);
                var32.field4649 = new short[var32.field4651];
                var32.field4642 = new short[var32.field4651];
                var32.field4648 = new short[var32.field4651];
                var32.field4650 = new int[var32.field4651];
                if (arg5 != null) {
                    var32.field4644 = new short[var32.field4651];
                }
                for (int var33 = 0; var33 < var32.field4651; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field7249[arg0][arg1] - this.field7252[arg0][arg1];
                    } else if (var48 == 0 && super.field441 == var49) {
                        var51 = this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1];
                    } else if (super.field441 == var48 && super.field441 == var49) {
                        var51 = this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1];
                    } else if (super.field441 == var48 && var49 == 0) {
                        var51 = this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1]) * var48 + (this.field7249[arg0][arg1] - this.field7252[arg0][arg1]) * (super.field441 - var48);
                        int var53 = (this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1]) * var48 + (this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1]) * (super.field441 - var48);
                        var51 = (super.field441 - var49) * var52 + var49 * var53 >> super.field447 * 2;
                    }
                    int var54 = (arg0 << super.field447) + var48;
                    int var55 = (arg1 << super.field447) + var49;
                    var32.field4649[var33] = (short) var48;
                    var32.field4648[var33] = (short) var49;
                    var32.field4642[var33] = (short) (this.method331(var55, (byte) 50, var54) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field7241.field2418.method1365(-17951, arg8[var33]).field9794) {
                        var32.field4650[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field4650[var33] = var51 << 25;
                        } else {
                            var32.field4650[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field4644[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field4650[var33] = class32.method305(method3033(arg6[var33] >> 8, var51), var56, 7589, arg10);
                        if (arg7 != null) {
                            var32.field4650[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field4647; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field7241.field2418.method1365(-17951, arg8[var35 * 3]).field9794) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field4643 = new int[var32.field4647];
                }
                if (var34) {
                    var32.field4645 = new short[var32.field4647];
                    var32.field4646 = new short[var32.field4647];
                }
                for (int var36 = 0; var36 < var32.field4647; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field4643[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field7241.field2418.method1365(-17951, var42).field9794) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field7241.field2418.method1365(-17951, var43).field9794) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field7241.field2418.method1365(-17951, var44).field9794) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field4645[var36] = (short) var44;
                            var32.field4646[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field7241.field2418.method1365(-17951, var45).field9794) {
                                    var32.field4650[var37] = class244.field3322[class199.method1317(this.field7241.field2418.method1365(-17951, var45).field9777 & 65535, 2124276899) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field7241.field2418.method1365(-17951, var46).field9794) {
                                    var32.field4650[var38] = class244.field3322[class199.method1317(this.field7241.field2418.method1365(-17951, var46).field9777 & 65535, 2124276899) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field7241.field2418.method1365(-17951, var47).field9794) {
                                    var32.field4650[var39] = class244.field3322[class199.method1317(this.field7241.field2418.method1365(-17951, var47).field9777 & 65535, 2124276899) & 65535];
                                }
                            }
                            var32.field4645[var36] = -1;
                        }
                    }
                }
                this.field7240[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "(IILha;)Lha;", line = 592)
    public final class54 method324(int arg0, int arg1, class54 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IILmea;[I[I[I[I)V", line = 596)
    private final void method3032(int arg0, int arg1, class394 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class397 var8 = this.field7239[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5590 & 2) == 0) {
                int var9 = super.field441 * arg0;
                int var10 = super.field441 + var9;
                int var11 = super.field441 * arg1;
                int var12 = super.field441 + var11;
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
                if ((var8.field5590 & 1) != 0) {
                    int var13 = super.field440[arg0][arg1];
                    float var14 = (float) var13 * this.field7250;
                    if (this.field7242 == -1) {
                        var15 = (float) var11 * this.field7235 + (float) var9 * this.field7248 + var14 + this.field7233;
                        if (var15 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var16 = (float) var11 * this.field7235 + (float) var10 * this.field7248 + var14 + this.field7233;
                        if (var16 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var17 = (float) var12 * this.field7235 + (float) var10 * this.field7248 + var14 + this.field7233;
                        if (var17 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var18 = (float) var12 * this.field7235 + (float) var9 * this.field7248 + var14 + this.field7233;
                        if (var18 <= (float) this.field7241.field2035) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field7235 + (float) var9 * this.field7248 + var14 + this.field7233;
                        var16 = (float) var11 * this.field7235 + (float) var10 * this.field7248 + var14 + this.field7233;
                        var17 = (float) var12 * this.field7235 + (float) var10 * this.field7248 + var14 + this.field7233;
                        var18 = (float) var12 * this.field7235 + (float) var9 * this.field7248 + var14 + this.field7233;
                    }
                    float var19 = (float) var13 * this.field7251;
                    float var20 = (float) var13 * this.field7253;
                    if (this.field7242 == -1) {
                        var21 = (float) var11 * this.field7236 + (float) var9 * this.field7243 + var19 + this.field7246;
                        var22 = (int) ((float) this.field7241.field2015 * var21 / var15) + arg2.field5574;
                        var23 = (float) var11 * this.field7244 + (float) var9 * this.field7237 + var20 + this.field7247;
                        var24 = (int) ((float) this.field7241.field2044 * var23 / var15) + arg2.field5557;
                        var25 = (float) var11 * this.field7236 + (float) var10 * this.field7243 + var19 + this.field7246;
                        var26 = (int) ((float) this.field7241.field2015 * var25 / var16) + arg2.field5574;
                        var27 = (float) var11 * this.field7244 + (float) var10 * this.field7237 + var20 + this.field7247;
                        var28 = (int) ((float) this.field7241.field2044 * var27 / var16) + arg2.field5557;
                        float var29 = (float) var12 * this.field7236 + (float) var10 * this.field7243 + var19 + this.field7246;
                        var30 = (int) ((float) this.field7241.field2015 * var29 / var17) + arg2.field5574;
                        float var31 = (float) var12 * this.field7244 + (float) var10 * this.field7237 + var20 + this.field7247;
                        var32 = (int) ((float) this.field7241.field2044 * var31 / var17) + arg2.field5557;
                        var33 = (float) var12 * this.field7236 + (float) var9 * this.field7243 + var19 + this.field7246;
                        var34 = (int) ((float) this.field7241.field2015 * var33 / var18) + arg2.field5574;
                        var35 = (float) var12 * this.field7244 + (float) var9 * this.field7237 + var20 + this.field7247;
                        var36 = (int) ((float) this.field7241.field2044 * var35 / var18) + arg2.field5557;
                    } else {
                        var21 = (float) var11 * this.field7236 + (float) var9 * this.field7243 + var19 + this.field7246;
                        var22 = (int) ((float) this.field7241.field2015 * var21 / (float) this.field7242) + arg2.field5574;
                        var23 = (float) var11 * this.field7244 + (float) var9 * this.field7237 + var20 + this.field7247;
                        var24 = (int) ((float) this.field7241.field2044 * var23 / (float) this.field7242) + arg2.field5557;
                        var25 = (float) var11 * this.field7236 + (float) var10 * this.field7243 + var19 + this.field7246;
                        var26 = (int) ((float) this.field7241.field2015 * var25 / (float) this.field7242) + arg2.field5574;
                        var27 = (float) var11 * this.field7244 + (float) var10 * this.field7237 + var20 + this.field7247;
                        var28 = (int) ((float) this.field7241.field2044 * var27 / (float) this.field7242) + arg2.field5557;
                        float var37 = (float) var12 * this.field7236 + (float) var10 * this.field7243 + var19 + this.field7246;
                        var30 = (int) ((float) this.field7241.field2015 * var37 / (float) this.field7242) + arg2.field5574;
                        float var38 = (float) var12 * this.field7244 + (float) var10 * this.field7237 + var20 + this.field7247;
                        var32 = (int) ((float) this.field7241.field2044 * var38 / (float) this.field7242) + arg2.field5557;
                        var33 = (float) var12 * this.field7236 + (float) var9 * this.field7243 + var19 + this.field7246;
                        var34 = (int) ((float) this.field7241.field2015 * var33 / (float) this.field7242) + arg2.field5574;
                        var35 = (float) var12 * this.field7244 + (float) var9 * this.field7237 + var20 + this.field7247;
                        var36 = (int) ((float) this.field7241.field2044 * var35 / (float) this.field7242) + arg2.field5557;
                    }
                } else {
                    int var39 = super.field440[arg0][arg1];
                    int var40 = super.field440[arg0 + 1][arg1];
                    int var41 = super.field440[arg0 + 1][arg1 + 1];
                    int var42 = super.field440[arg0][arg1 + 1];
                    if (this.field7242 == -1) {
                        var15 = (float) var11 * this.field7235 + (float) var9 * this.field7248 + (float) var39 * this.field7250 + this.field7233;
                        if (var15 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var16 = (float) var11 * this.field7235 + (float) var10 * this.field7248 + (float) var40 * this.field7250 + this.field7233;
                        if (var16 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var17 = (float) var12 * this.field7235 + (float) var10 * this.field7248 + (float) var41 * this.field7250 + this.field7233;
                        if (var17 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var18 = (float) var12 * this.field7235 + (float) var9 * this.field7248 + (float) var42 * this.field7250 + this.field7233;
                        if (var18 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var21 = (float) var11 * this.field7236 + (float) var9 * this.field7243 + (float) var39 * this.field7251 + this.field7246;
                        var22 = (int) ((float) this.field7241.field2015 * var21 / var15) + arg2.field5574;
                        var23 = (float) var11 * this.field7244 + (float) var9 * this.field7237 + (float) var39 * this.field7253 + this.field7247;
                        var24 = (int) ((float) this.field7241.field2044 * var23 / var15) + arg2.field5557;
                        var25 = (float) var11 * this.field7236 + (float) var10 * this.field7243 + (float) var40 * this.field7251 + this.field7246;
                        var26 = (int) ((float) this.field7241.field2015 * var25 / var16) + arg2.field5574;
                        var27 = (float) var11 * this.field7244 + (float) var10 * this.field7237 + (float) var40 * this.field7253 + this.field7247;
                        var28 = (int) ((float) this.field7241.field2044 * var27 / var16) + arg2.field5557;
                        float var43 = (float) var12 * this.field7236 + (float) var10 * this.field7243 + (float) var41 * this.field7251 + this.field7246;
                        var30 = (int) ((float) this.field7241.field2015 * var43 / var17) + arg2.field5574;
                        float var44 = (float) var12 * this.field7244 + (float) var10 * this.field7237 + (float) var41 * this.field7253 + this.field7247;
                        var32 = (int) ((float) this.field7241.field2044 * var44 / var17) + arg2.field5557;
                        var33 = (float) var12 * this.field7236 + (float) var9 * this.field7243 + (float) var42 * this.field7251 + this.field7246;
                        var34 = (int) ((float) this.field7241.field2015 * var33 / var18) + arg2.field5574;
                        var35 = (float) var12 * this.field7244 + (float) var9 * this.field7237 + (float) var42 * this.field7253 + this.field7247;
                        var36 = (int) ((float) this.field7241.field2044 * var35 / var18) + arg2.field5557;
                    } else {
                        var15 = (float) var11 * this.field7235 + (float) var9 * this.field7248 + (float) var39 * this.field7250 + this.field7233;
                        var16 = (float) var11 * this.field7235 + (float) var10 * this.field7248 + (float) var40 * this.field7250 + this.field7233;
                        var17 = (float) var12 * this.field7235 + (float) var10 * this.field7248 + (float) var41 * this.field7250 + this.field7233;
                        var18 = (float) var12 * this.field7235 + (float) var9 * this.field7248 + (float) var42 * this.field7250 + this.field7233;
                        var21 = (float) var11 * this.field7236 + (float) var9 * this.field7243 + (float) var39 * this.field7251 + this.field7246;
                        var22 = (int) ((float) this.field7241.field2015 * var21 / (float) this.field7242) + arg2.field5574;
                        var23 = (float) var11 * this.field7244 + (float) var9 * this.field7237 + (float) var39 * this.field7253 + this.field7247;
                        var24 = (int) ((float) this.field7241.field2044 * var23 / (float) this.field7242) + arg2.field5557;
                        var25 = (float) var11 * this.field7236 + (float) var10 * this.field7243 + (float) var40 * this.field7251 + this.field7246;
                        var26 = (int) ((float) this.field7241.field2015 * var25 / (float) this.field7242) + arg2.field5574;
                        var27 = (float) var11 * this.field7244 + (float) var10 * this.field7237 + (float) var40 * this.field7253 + this.field7247;
                        var28 = (int) ((float) this.field7241.field2044 * var27 / (float) this.field7242) + arg2.field5557;
                        float var45 = (float) var12 * this.field7236 + (float) var10 * this.field7243 + (float) var41 * this.field7251 + this.field7246;
                        var30 = (int) ((float) this.field7241.field2015 * var45 / (float) this.field7242) + arg2.field5574;
                        float var46 = (float) var12 * this.field7244 + (float) var10 * this.field7237 + (float) var41 * this.field7253 + this.field7247;
                        var32 = (int) ((float) this.field7241.field2044 * var46 / (float) this.field7242) + arg2.field5557;
                        var33 = (float) var12 * this.field7236 + (float) var9 * this.field7243 + (float) var42 * this.field7251 + this.field7246;
                        var34 = (int) ((float) this.field7241.field2015 * var33 / (float) this.field7242) + arg2.field5574;
                        var35 = (float) var12 * this.field7244 + (float) var9 * this.field7237 + (float) var42 * this.field7253 + this.field7247;
                        var36 = (int) ((float) this.field7241.field2044 * var35 / (float) this.field7242) + arg2.field5557;
                    }
                }
                if (this.field7242 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field5560 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field5561 || var34 > arg2.field5561 || var26 > arg2.field5561;
                        if (var8.field5588 >= 0) {
                            if (this.method3036(this.field7241.field2418.method1365(-17951, var8.field5588).field9797)) {
                                arg2.field5569 = 100;
                            }
                            arg2.method2305(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5585 & 65535, var8.field5589 & 65535, var8.field5587 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field5588);
                            arg2.field5569 = 0;
                        } else {
                            arg2.method2300(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5585 & 65535, var8.field5589 & 65535, var8.field5587 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field5560 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field5561 || var26 > arg2.field5561 || var34 > arg2.field5561;
                        if (var8.field5588 >= 0) {
                            if (this.method3036(this.field7241.field2418.method1365(-17951, var8.field5588).field9797)) {
                                arg2.field5569 = 100;
                            }
                            arg2.method2305(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5586 & 65535, var8.field5587 & 65535, var8.field5589 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field5588);
                            arg2.field5569 = 0;
                            return;
                        }
                        arg2.method2300(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5586 & 65535, var8.field5587 & 65535, var8.field5589 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field5560 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field5561 || var34 > arg2.field5561 || var26 > arg2.field5561;
                        if (var8.field5588 >= 0) {
                            if (this.method3036(this.field7241.field2418.method1365(-17951, var8.field5588).field9797)) {
                                arg2.field5569 = 100;
                            }
                            arg2.method2305(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5585 & 65535, var8.field5589 & 65535, var8.field5587 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field7242, this.field7242, this.field7242, var8.field5588);
                            arg2.field5569 = 0;
                        } else {
                            arg2.method2300(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5585 & 65535, var8.field5589 & 65535, var8.field5587 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field5560 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field5561 || var26 > arg2.field5561 || var34 > arg2.field5561;
                        if (var8.field5588 >= 0) {
                            if (this.method3036(this.field7241.field2418.method1365(-17951, var8.field5588).field9797)) {
                                arg2.field5569 = 100;
                            }
                            arg2.method2305(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5586 & 65535, var8.field5587 & 65535, var8.field5589 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field7242, this.field7242, this.field7242, var8.field5588);
                            arg2.field5569 = 0;
                            return;
                        }
                        arg2.method2300(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5586 & 65535, var8.field5587 & 65535, var8.field5589 & 65535);
                    }
                }
            }
        } else {
            class82 var47 = this.field7234[arg0][arg1];
            if (var47 != null) {
                if (this.field7242 == -1) {
                    for (int var48 = 0; var48 < var47.field1238; ++var48) {
                        int var49 = (arg0 << super.field447) + var47.field1239[var48];
                        short var50 = var47.field1236[var48];
                        int var51 = (arg1 << super.field447) + var47.field1240[var48];
                        float var52 = (float) var51 * this.field7235 + (float) var49 * this.field7248 + (float) var50 * this.field7250 + this.field7233;
                        if (var52 <= (float) this.field7241.field2035) {
                            return;
                        }
                        float var53 = (float) var51 * this.field7236 + (float) var49 * this.field7243 + (float) var50 * this.field7251 + this.field7246;
                        float var54 = (float) var51 * this.field7244 + (float) var49 * this.field7237 + (float) var50 * this.field7253 + this.field7247;
                        arg3[var48] = (int) ((float) this.field7241.field2015 * var53 / var52) + arg2.field5574;
                        arg4[var48] = (int) ((float) this.field7241.field2044 * var54 / var52) + arg2.field5557;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field1238; ++var55) {
                        int var107 = (arg0 << super.field447) + var47.field1239[var55];
                        short var108 = var47.field1236[var55];
                        int var109 = (arg1 << super.field447) + var47.field1240[var55];
                        float var110 = (float) var109 * this.field7235 + (float) var107 * this.field7248 + (float) var108 * this.field7250 + this.field7233;
                        float var111 = (float) var109 * this.field7236 + (float) var107 * this.field7243 + (float) var108 * this.field7251 + this.field7246;
                        float var112 = (float) var109 * this.field7244 + (float) var107 * this.field7237 + (float) var108 * this.field7253 + this.field7247;
                        arg3[var55] = (int) ((float) this.field7241.field2015 * var111 / (float) this.field7242) + arg2.field5574;
                        arg4[var55] = (int) ((float) this.field7241.field2044 * var112 / (float) this.field7242) + arg2.field5557;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field1237 != null) {
                    int var56 = super.field440[arg0][arg1];
                    int var57 = super.field440[arg0 + 1][arg1];
                    int var58 = super.field440[arg0][arg1 + 1];
                    int var59 = super.field441 * arg0;
                    int var60 = super.field441 + var59;
                    int var61 = super.field441 * arg1;
                    int var62 = super.field441 + var61;
                    float var63 = (float) var61 * this.field7236 + (float) var56 * this.field7251 + (float) var59 * this.field7243 + this.field7246;
                    float var64 = (float) var61 * this.field7244 + (float) var56 * this.field7253 + (float) var59 * this.field7237 + this.field7247;
                    float var65 = (float) var61 * this.field7235 + (float) var56 * this.field7250 + (float) var59 * this.field7248 + this.field7233;
                    float var66 = (float) var61 * this.field7236 + (float) var57 * this.field7251 + (float) var60 * this.field7243 + this.field7246;
                    float var67 = (float) var61 * this.field7244 + (float) var57 * this.field7253 + (float) var60 * this.field7237 + this.field7247;
                    float var68 = (float) var61 * this.field7235 + (float) var57 * this.field7250 + (float) var60 * this.field7248 + this.field7233;
                    float var69 = (float) var62 * this.field7236 + (float) var58 * this.field7251 + (float) var59 * this.field7243 + this.field7246;
                    float var70 = (float) var62 * this.field7244 + (float) var58 * this.field7253 + (float) var59 * this.field7237 + this.field7247;
                    float var71 = (float) var62 * this.field7235 + (float) var58 * this.field7250 + (float) var59 * this.field7248 + this.field7233;
                    if (this.field7242 == -1) {
                        for (int var72 = 0; var72 < var47.field1230; ++var72) {
                            short var73 = var47.field1228[var72];
                            short var74 = var47.field1232[var72];
                            short var75 = var47.field1235[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field5560 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field5561 || var77 > arg2.field5561 || var78 > arg2.field5561;
                                short var82 = var47.field1237[var72];
                                if (var82 != -1) {
                                    if (this.method3036(this.field7241.field2418.method1365(-17951, var82).field9797)) {
                                        arg2.field5569 = 100;
                                    }
                                    arg2.method2305(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field1234[var73], var47.field1234[var74], var47.field1234[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field5569 = 0;
                                } else {
                                    int var83 = var47.field1233[var72];
                                    if (var83 != -1) {
                                        arg2.method2300(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class560.method3129(var47.field1234[var73], var83, true), class560.method3129(var47.field1234[var74], var83, true), class560.method3129(var47.field1234[var75], var83, true));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field1230; ++var84) {
                        short var85 = var47.field1228[var84];
                        short var86 = var47.field1232[var84];
                        short var87 = var47.field1235[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field5560 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field5561 || var89 > arg2.field5561 || var90 > arg2.field5561;
                            short var94 = var47.field1237[var84];
                            if (var94 != -1) {
                                if (this.method3036(this.field7241.field2418.method1365(-17951, var94).field9797)) {
                                    arg2.field5569 = 100;
                                }
                                arg2.method2305(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field1234[var85], var47.field1234[var86], var47.field1234[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field7242, this.field7242, this.field7242, var94);
                                arg2.field5569 = 0;
                            } else {
                                int var95 = var47.field1233[var84];
                                if (var95 != -1) {
                                    arg2.method2300(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class560.method3129(var47.field1234[var85], var95, true), class560.method3129(var47.field1234[var86], var95, true), class560.method3129(var47.field1234[var87], var95, true));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field1230; ++var96) {
                    short var97 = var47.field1228[var96];
                    short var98 = var47.field1232[var96];
                    short var99 = var47.field1235[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field1233[var96];
                        if (var106 != -1) {
                            arg2.field5560 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field5561 || var101 > arg2.field5561 || var102 > arg2.field5561;
                            arg2.method2300(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class560.method3129(var47.field1234[var97], var106, true), class560.method3129(var47.field1234[var98], var106, true), class560.method3129(var47.field1234[var99], var106, true));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)I", line = 1097)
    private static final int method3033(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III[[ZZ)V", line = 1129)
    public final void method327(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class384 var6 = this.field7241.field2039;
        this.field7242 = -1;
        this.field7243 = var6.field5432;
        this.field7251 = var6.field5430;
        this.field7236 = var6.field5453;
        this.field7246 = var6.field5441;
        this.field7237 = var6.field5450;
        this.field7253 = var6.field5447;
        this.field7244 = var6.field5434;
        this.field7247 = var6.field5438;
        this.field7248 = var6.field5454;
        this.field7250 = var6.field5437;
        this.field7235 = var6.field5439;
        this.field7233 = var6.field5443;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field446 && var10 >= 0 && var10 < super.field438) {
                        this.method321(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII[[ZLlw;Lmea;[I[I)V", line = 1178)
    private final void method3034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class613 arg8, class394 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field8517;
        this.field7241.method202(false);
        arg9.field5571 = false;
        arg9.field5570 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field7239[var18][var19] != null) {
                        class397 var20 = this.field7239[var18][var19];
                        if (var20.field5588 != -1 && (var20.field5590 & 2) == 0 && var20.field5591 == -1) {
                            int var21 = this.field7241.method998(var20.field5588);
                            arg9.method2300(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class560.method3129(var20.field5585 & 65535, var21, true), class560.method3129(var20.field5589 & 65535, var21, true), class560.method3129(var20.field5587 & 65535, var21, true));
                            arg9.method2300(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class560.method3129(var20.field5586 & 65535, var21, true), class560.method3129(var20.field5587 & 65535, var21, true), class560.method3129(var20.field5589 & 65535, var21, true));
                        } else if (var20.field5591 == -1) {
                            arg9.method2300(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field5585 & 65535, var20.field5589 & 65535, var20.field5587 & 65535);
                            arg9.method2300(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field5586 & 65535, var20.field5587 & 65535, var20.field5589 & 65535);
                        } else {
                            int var22 = var20.field5591;
                            arg9.method2300(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method2300(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field7234[var18][var19] != null) {
                        class82 var23 = this.field7234[var18][var19];
                        for (int var24 = 0; var24 < var23.field1238; ++var24) {
                            arg10[var24] = var23.field1239[var24] * var14 / super.field441 + var16;
                            arg11[var24] = var17 - var23.field1240[var24] * var14 / super.field441;
                        }
                        for (int var25 = 0; var25 < var23.field1230; ++var25) {
                            short var26 = var23.field1228[var25];
                            short var27 = var23.field1232[var25];
                            short var28 = var23.field1235[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field1231 != null && var23.field1231[var25] != -1) {
                                int var35 = var23.field1231[var25];
                                arg9.method2300(var32, var33, var34, var29, var30, var31, 100, 100, 100, class560.method3129(var23.field1234[var26], var35, true), class560.method3129(var23.field1234[var27], var35, true), class560.method3129(var23.field1234[var28], var35, true));
                            } else if (var23.field1237 != null && var23.field1237[var25] != -1) {
                                int var36 = this.field7241.method998(var23.field1237[var25]);
                                arg9.method2300(var32, var33, var34, var29, var30, var31, 100, 100, 100, class560.method3129(var23.field1234[var26], var36, true), class560.method3129(var23.field1234[var27], var36, true), class560.method3129(var23.field1234[var28], var36, true));
                            } else {
                                int var37 = var23.field1233[var25];
                                arg9.method2300(var32, var33, var34, var29, var30, var31, 100, 100, 100, class560.method3129(var23.field1234[var26], var37, true), class560.method3129(var23.field1234[var27], var37, true), class560.method3129(var23.field1234[var28], var37, true));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field5571 = true;
        this.field7241.method202(var15);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1315)
    public final void method318(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field7239 == null) {
            this.field7239 = new class397[super.field446][super.field438];
            this.field7234 = new class82[super.field446][super.field438];
        } else if (this.field7238 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field441 != var20 || var21 != 0 && super.field441 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class82 var22 = new class82();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1238 = var23;
            var22.field1234 = new short[var23];
            var22.field1239 = new short[var23];
            var22.field1236 = new short[var23];
            var22.field1240 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1234[var25] = (short) (this.field7249[arg0][arg1] - this.field7252[arg0][arg1]);
                } else if (var30 == 0 && super.field441 == var31) {
                    var22.field1234[var25] = (short) (this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1]);
                } else if (super.field441 == var30 && super.field441 == var31) {
                    var22.field1234[var25] = (short) (this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1]);
                } else if (super.field441 == var30 && var31 == 0) {
                    var22.field1234[var25] = (short) (this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1]) * var30 + (this.field7249[arg0][arg1] - this.field7252[arg0][arg1]) * (super.field441 - var30);
                    int var33 = (this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1]) * var30 + (this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1]) * (super.field441 - var30);
                    var22.field1234[var25] = (short) ((super.field441 - var31) * var32 + var31 * var33 >> super.field447 * 2);
                }
                int var34 = (arg0 << super.field447) + var30;
                int var35 = (arg1 << super.field447) + var31;
                var22.field1239[var25] = (short) var30;
                var22.field1240[var25] = (short) var31;
                var22.field1236[var25] = (short) (this.method331(var35, (byte) 50, var34) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1234[var25] < 2) {
                    var22.field1234[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field7241.field2418.method1365(-17951, arg11[var28]).field9794) {
                    var26 = true;
                }
            }
            var22.field1233 = new int[var27];
            if (arg10 != null) {
                var22.field1231 = new int[var27];
            }
            var22.field1228 = new short[var27];
            var22.field1232 = new short[var27];
            var22.field1235 = new short[var27];
            if (var26) {
                var22.field1237 = new short[var27];
                var22.field1229 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1233[var22.field1230] = class199.method1317(arg9[var29], 2124276899);
                    } else {
                        var22.field1233[var22.field1230] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1231[var22.field1230] = class199.method1317(arg10[var29], 2124276899);
                        } else {
                            var22.field1231[var22.field1230] = -1;
                        }
                    }
                    var22.field1228[var22.field1230] = (short) arg6[var29];
                    var22.field1232[var22.field1230] = (short) arg7[var29];
                    var22.field1235[var22.field1230] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field7241.field2418.method1365(-17951, arg11[var29]).field9794) {
                            var22.field1237[var22.field1230] = (short) arg11[var29];
                            var22.field1229[var22.field1230] = (short) arg12[var29];
                        } else {
                            var22.field1237[var22.field1230] = -1;
                        }
                    }
                    ++var22.field1230;
                }
            }
            this.field7234[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class397 var36 = new class397();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5591 = class560.method3129(this.field7249[arg0][arg1] - this.field7252[arg0][arg1], class199.method1317(arg10[0], 2124276899), true);
                    if (var37 == -1) {
                        var36.field5590 = (byte) (var36.field5590 | 2);
                    }
                }
                if (super.field440[arg0 + 1][arg1] == super.field440[arg0][arg1] && super.field440[arg0 + 1][arg1 + 1] == super.field440[arg0][arg1] && super.field440[arg0][arg1 + 1] == super.field440[arg0][arg1]) {
                    var36.field5590 = (byte) (var36.field5590 | 1);
                }
                if (var38 != -1 && (var36.field5590 & 2) == 0 && !this.field7241.field2418.method1365(-17951, var38).field9794) {
                    var36.field5586 = (short) (this.field7249[arg0][arg1] - this.field7252[arg0][arg1]);
                    var36.field5587 = (short) (this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1]);
                    var36.field5585 = (short) (this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1]);
                    var36.field5589 = (short) (this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1]);
                    var36.field5588 = (short) var38;
                } else {
                    short var39 = class199.method1317(var37, 2124276899);
                    var36.field5586 = (short) class560.method3129(this.field7249[arg0][arg1] - this.field7252[arg0][arg1], var39, true);
                    var36.field5587 = (short) class560.method3129(this.field7249[arg0 + 1][arg1] - this.field7252[arg0 + 1][arg1], var39, true);
                    var36.field5585 = (short) class560.method3129(this.field7249[arg0 + 1][arg1 + 1] - this.field7252[arg0 + 1][arg1 + 1], var39, true);
                    var36.field5589 = (short) class560.method3129(this.field7249[arg0][arg1 + 1] - this.field7252[arg0][arg1 + 1], var39, true);
                    var36.field5588 = -1;
                }
                this.field7239[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V", line = 1545)
    public final void method321(int arg0, int arg1) {
        class613 var3 = this.field7241.method1002(Thread.currentThread());
        var3.field8556.field5569 = 0;
        if (this.field7238 != null) {
            this.method3037(arg0, arg1, var3.field8530, var3, var3.field8556, var3.field8557, var3.field8571, var3.field8553, var3.field8547);
        } else {
            if (this.field7239 != null) {
                this.method3032(arg0, arg1, var3.field8556, var3.field8557, var3.field8571, var3.field8553, var3.field8547);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ltw;[I)V", line = 1556)
    public final void method333(class186 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(IIIIIII[[ZLlw;Lmea;[I[I)V", line = 1561)
    private final void method3035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class613 arg8, class394 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field8517;
        this.field7241.method202(false);
        arg9.field5571 = false;
        arg9.field5570 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field7238[var18][var19] != null) {
                        class350 var20 = this.field7238[var18][var19];
                        if (var20.field4662 != -1 && (var20.field4657 & 2) == 0 && var20.field4659 == 0) {
                            int var21 = this.field7241.method998(var20.field4662);
                            arg9.method2300(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class560.method3129(var20.field4663, var21, true), class560.method3129(var20.field4665, var21, true), class560.method3129(var20.field4660, var21, true));
                            arg9.method2300(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class560.method3129(var20.field4655, var21, true), class560.method3129(var20.field4660, var21, true), class560.method3129(var20.field4665, var21, true));
                        } else if (var20.field4659 == 0) {
                            arg9.method2315(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field4663, var20.field4665, var20.field4660);
                            arg9.method2315(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field4655, var20.field4660, var20.field4665);
                        } else {
                            int var22 = var20.field4659;
                            arg9.method2315(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class95.method694(-117, var22, var20.field4663 & -16777216), class95.method694(-122, var22, var20.field4665 & -16777216), class95.method694(-119, var22, var20.field4660 & -16777216));
                            arg9.method2315(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class95.method694(-123, var22, var20.field4655 & -16777216), class95.method694(-122, var22, var20.field4660 & -16777216), class95.method694(-119, var22, var20.field4665 & -16777216));
                        }
                    } else if (this.field7240[var18][var19] != null) {
                        class348 var23 = this.field7240[var18][var19];
                        for (int var24 = 0; var24 < var23.field4651; ++var24) {
                            arg10[var24] = var23.field4649[var24] * var14 / super.field441 + var16;
                            arg11[var24] = var17 - var23.field4648[var24] * var14 / super.field441;
                        }
                        for (int var25 = 0; var25 < var23.field4647; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field4643 != null && var23.field4643[var25] != 0 && (var23.field4645 == null || var23.field4645 != null && var23.field4645[var25] == -1)) {
                                int var35 = var23.field4643[var25];
                                arg9.method2315(var32, var33, var34, var29, var30, var31, 100, 100, 100, class95.method694(-120, var35, -16777216 - (var23.field4650[var26] & -16777216)), class95.method694(-120, var35, -16777216 - (var23.field4650[var27] & -16777216)), class95.method694(-125, var35, -16777216 - (var23.field4650[var28] & -16777216)));
                            } else if (var23.field4645 != null && var23.field4645[var25] != -1) {
                                int var36 = this.field7241.method998(var23.field4645[var25]);
                                arg9.method2300(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method2315(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field4650[var26], var23.field4650[var27], var23.field4650[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field5571 = true;
        this.field7241.method202(var15);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III[[ZZI)V", line = 1698)
    public final void method328(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class384 var7 = this.field7241.field2039;
        this.field7242 = arg5;
        this.field7243 = var7.field5432;
        this.field7251 = var7.field5430;
        this.field7236 = var7.field5453;
        this.field7246 = var7.field5441;
        this.field7237 = var7.field5450;
        this.field7253 = var7.field5447;
        this.field7244 = var7.field5434;
        this.field7247 = var7.field5438;
        this.field7248 = var7.field5454;
        this.field7250 = var7.field5437;
        this.field7235 = var7.field5439;
        this.field7233 = var7.field5443;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field446 && var11 >= 0 && var11 < super.field438) {
                        this.method321(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Z", line = 1743)
    private final boolean method3036(int arg0) {
        if ((this.field7245 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIZLlw;Lmea;[I[I[I[I)V", line = 1759)
    private final void method3037(int arg0, int arg1, boolean arg2, class613 arg3, class394 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class350 var10 = this.field7238[arg0][arg1];
        if (var10 != null) {
            if ((var10.field4657 & 2) == 0) {
                int var11 = super.field441 * arg0;
                int var12 = super.field441 + var11;
                int var13 = super.field441 * arg1;
                int var14 = super.field441 + var13;
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
                if ((var10.field4657 & 1) != 0 && !arg2) {
                    int var19 = super.field440[arg0][arg1];
                    float var20 = (float) var19 * this.field7250;
                    if (this.field7242 == -1) {
                        var21 = (float) var13 * this.field7235 + (float) var11 * this.field7248 + var20 + this.field7233;
                        if (var21 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var22 = (float) var13 * this.field7235 + (float) var12 * this.field7248 + var20 + this.field7233;
                        if (var22 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var23 = (float) var14 * this.field7235 + (float) var12 * this.field7248 + var20 + this.field7233;
                        if (var23 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var24 = (float) var14 * this.field7235 + (float) var11 * this.field7248 + var20 + this.field7233;
                        if (var24 <= (float) this.field7241.field2035) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field7235 + (float) var11 * this.field7248 + var20 + this.field7233;
                        var22 = (float) var13 * this.field7235 + (float) var12 * this.field7248 + var20 + this.field7233;
                        var23 = (float) var14 * this.field7235 + (float) var12 * this.field7248 + var20 + this.field7233;
                        var24 = (float) var14 * this.field7235 + (float) var11 * this.field7248 + var20 + this.field7233;
                    }
                    if (arg3.field8522) {
                        int var25 = (int) (var21 - (float) arg3.field8528);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field8528);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field8528);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field8528);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field7251;
                    float var30 = (float) var19 * this.field7253;
                    if (this.field7242 == -1) {
                        var31 = (float) var13 * this.field7236 + (float) var11 * this.field7243 + var29 + this.field7246;
                        var32 = (int) ((float) this.field7241.field2015 * var31 / var21) + arg4.field5574;
                        var33 = (float) var13 * this.field7244 + (float) var11 * this.field7237 + var30 + this.field7247;
                        var34 = (int) ((float) this.field7241.field2044 * var33 / var21) + arg4.field5557;
                        var35 = (float) var13 * this.field7236 + (float) var12 * this.field7243 + var29 + this.field7246;
                        var36 = (int) ((float) this.field7241.field2015 * var35 / var22) + arg4.field5574;
                        var37 = (float) var13 * this.field7244 + (float) var12 * this.field7237 + var30 + this.field7247;
                        var38 = (int) ((float) this.field7241.field2044 * var37 / var22) + arg4.field5557;
                        var39 = (float) var14 * this.field7236 + (float) var12 * this.field7243 + var29 + this.field7246;
                        var40 = (int) ((float) this.field7241.field2015 * var39 / var23) + arg4.field5574;
                        var41 = (float) var14 * this.field7244 + (float) var12 * this.field7237 + var30 + this.field7247;
                        var42 = (int) ((float) this.field7241.field2044 * var41 / var23) + arg4.field5557;
                        var43 = (float) var14 * this.field7236 + (float) var11 * this.field7243 + var29 + this.field7246;
                        var44 = (int) ((float) this.field7241.field2015 * var43 / var24) + arg4.field5574;
                        var45 = (float) var14 * this.field7244 + (float) var11 * this.field7237 + var30 + this.field7247;
                        var46 = (int) ((float) this.field7241.field2044 * var45 / var24) + arg4.field5557;
                    } else {
                        var31 = (float) var13 * this.field7236 + (float) var11 * this.field7243 + var29 + this.field7246;
                        var32 = (int) ((float) this.field7241.field2015 * var31 / (float) this.field7242) + arg4.field5574;
                        var33 = (float) var13 * this.field7244 + (float) var11 * this.field7237 + var30 + this.field7247;
                        var34 = (int) ((float) this.field7241.field2044 * var33 / (float) this.field7242) + arg4.field5557;
                        var35 = (float) var13 * this.field7236 + (float) var12 * this.field7243 + var29 + this.field7246;
                        var36 = (int) ((float) this.field7241.field2015 * var35 / (float) this.field7242) + arg4.field5574;
                        var37 = (float) var13 * this.field7244 + (float) var12 * this.field7237 + var30 + this.field7247;
                        var38 = (int) ((float) this.field7241.field2044 * var37 / (float) this.field7242) + arg4.field5557;
                        var39 = (float) var14 * this.field7236 + (float) var12 * this.field7243 + var29 + this.field7246;
                        var40 = (int) ((float) this.field7241.field2015 * var39 / (float) this.field7242) + arg4.field5574;
                        var41 = (float) var14 * this.field7244 + (float) var12 * this.field7237 + var30 + this.field7247;
                        var42 = (int) ((float) this.field7241.field2044 * var41 / (float) this.field7242) + arg4.field5557;
                        var43 = (float) var14 * this.field7236 + (float) var11 * this.field7243 + var29 + this.field7246;
                        var44 = (int) ((float) this.field7241.field2015 * var43 / (float) this.field7242) + arg4.field5574;
                        var45 = (float) var14 * this.field7244 + (float) var11 * this.field7237 + var30 + this.field7247;
                        var46 = (int) ((float) this.field7241.field2044 * var45 / (float) this.field7242) + arg4.field5557;
                    }
                } else {
                    int var47 = super.field440[arg0][arg1];
                    int var48 = super.field440[arg0 + 1][arg1];
                    int var49 = super.field440[arg0 + 1][arg1 + 1];
                    int var50 = super.field440[arg0][arg1 + 1];
                    if (this.field7242 == -1) {
                        var21 = (float) var13 * this.field7235 + (float) var11 * this.field7248 + (float) var47 * this.field7250 + this.field7233;
                        if (var21 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var22 = (float) var13 * this.field7235 + (float) var12 * this.field7248 + (float) var48 * this.field7250 + this.field7233;
                        if (var22 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var23 = (float) var14 * this.field7235 + (float) var12 * this.field7248 + (float) var49 * this.field7250 + this.field7233;
                        if (var23 <= (float) this.field7241.field2035) {
                            return;
                        }
                        var24 = (float) var14 * this.field7235 + (float) var11 * this.field7248 + (float) var50 * this.field7250 + this.field7233;
                        if (var24 <= (float) this.field7241.field2035) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field7235 + (float) var11 * this.field7248 + (float) var47 * this.field7250 + this.field7233;
                        var22 = (float) var13 * this.field7235 + (float) var12 * this.field7248 + (float) var48 * this.field7250 + this.field7233;
                        var23 = (float) var14 * this.field7235 + (float) var12 * this.field7248 + (float) var49 * this.field7250 + this.field7233;
                        var24 = (float) var14 * this.field7235 + (float) var11 * this.field7248 + (float) var50 * this.field7250 + this.field7233;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field8528);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field4661 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field8528);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field4658 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field8528);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field4664 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field8528);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field4656 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field8522) {
                        int var59 = (int) (var21 - (float) arg3.field8528);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field8528);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field8528);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field8528);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field7242 == -1) {
                        var31 = (float) var13 * this.field7236 + (float) var11 * this.field7243 + (float) var47 * this.field7251 + this.field7246;
                        var32 = (int) ((float) this.field7241.field2015 * var31 / var21) + arg4.field5574;
                        var33 = (float) var13 * this.field7244 + (float) var11 * this.field7237 + (float) var47 * this.field7253 + this.field7247;
                        var34 = (int) ((float) this.field7241.field2044 * var33 / var21) + arg4.field5557;
                        var35 = (float) var13 * this.field7236 + (float) var12 * this.field7243 + (float) var48 * this.field7251 + this.field7246;
                        var36 = (int) ((float) this.field7241.field2015 * var35 / var22) + arg4.field5574;
                        var37 = (float) var13 * this.field7244 + (float) var12 * this.field7237 + (float) var48 * this.field7253 + this.field7247;
                        var38 = (int) ((float) this.field7241.field2044 * var37 / var22) + arg4.field5557;
                        var39 = (float) var14 * this.field7236 + (float) var12 * this.field7243 + (float) var49 * this.field7251 + this.field7246;
                        var40 = (int) ((float) this.field7241.field2015 * var39 / var23) + arg4.field5574;
                        var41 = (float) var14 * this.field7244 + (float) var12 * this.field7237 + (float) var49 * this.field7253 + this.field7247;
                        var42 = (int) ((float) this.field7241.field2044 * var41 / var23) + arg4.field5557;
                        var43 = (float) var14 * this.field7236 + (float) var11 * this.field7243 + (float) var50 * this.field7251 + this.field7246;
                        var44 = (int) ((float) this.field7241.field2015 * var43 / var24) + arg4.field5574;
                        var45 = (float) var14 * this.field7244 + (float) var11 * this.field7237 + (float) var50 * this.field7253 + this.field7247;
                        var46 = (int) ((float) this.field7241.field2044 * var45 / var24) + arg4.field5557;
                    } else {
                        var31 = (float) var13 * this.field7236 + (float) var11 * this.field7243 + (float) var47 * this.field7251 + this.field7246;
                        var32 = (int) ((float) this.field7241.field2015 * var31 / (float) this.field7242) + arg4.field5574;
                        var33 = (float) var13 * this.field7244 + (float) var11 * this.field7237 + (float) var47 * this.field7253 + this.field7247;
                        var34 = (int) ((float) this.field7241.field2044 * var33 / (float) this.field7242) + arg4.field5557;
                        var35 = (float) var13 * this.field7236 + (float) var12 * this.field7243 + (float) var48 * this.field7251 + this.field7246;
                        var36 = (int) ((float) this.field7241.field2015 * var35 / (float) this.field7242) + arg4.field5574;
                        var37 = (float) var13 * this.field7244 + (float) var12 * this.field7237 + (float) var48 * this.field7253 + this.field7247;
                        var38 = (int) ((float) this.field7241.field2044 * var37 / (float) this.field7242) + arg4.field5557;
                        var39 = (float) var14 * this.field7236 + (float) var12 * this.field7243 + (float) var49 * this.field7251 + this.field7246;
                        var40 = (int) ((float) this.field7241.field2015 * var39 / (float) this.field7242) + arg4.field5574;
                        var41 = (float) var14 * this.field7244 + (float) var12 * this.field7237 + (float) var49 * this.field7253 + this.field7247;
                        var42 = (int) ((float) this.field7241.field2044 * var41 / (float) this.field7242) + arg4.field5557;
                        var43 = (float) var14 * this.field7236 + (float) var11 * this.field7243 + (float) var50 * this.field7251 + this.field7246;
                        var44 = (int) ((float) this.field7241.field2015 * var43 / (float) this.field7242) + arg4.field5574;
                        var45 = (float) var14 * this.field7244 + (float) var11 * this.field7237 + (float) var50 * this.field7253 + this.field7247;
                        var46 = (int) ((float) this.field7241.field2044 * var45 / (float) this.field7242) + arg4.field5557;
                    }
                }
                boolean var63 = var10.field4662 != -1 && this.method3036(this.field7241.field2418.method1365(-17951, var10.field4662).field9797);
                if (this.field7242 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field5560 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field5561 || var44 > arg4.field5561 || var36 > arg4.field5561;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field5569 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field4662 >= 0) {
                                    arg4.method2308(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field8529, var17, var18, var16, var10.field4663, var10.field4665, var10.field4660, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field4662);
                                } else {
                                    arg4.method2315(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class95.method694(-125, var10.field4663, var17 << 24 | arg3.field8529), class95.method694(-125, var10.field4665, var18 << 24 | arg3.field8529), class95.method694(-120, var10.field4660, var16 << 24 | arg3.field8529));
                                }
                            } else if (var10.field4662 >= 0) {
                                arg4.method2305(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field4663, var10.field4665, var10.field4660, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field4662);
                            } else {
                                arg4.method2315(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field4663, var10.field4665, var10.field4660);
                            }
                            arg4.field5569 = 0;
                        } else {
                            arg4.method2301(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field8529);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field5560 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field5561 || var36 > arg4.field5561 || var44 > arg4.field5561;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field5569 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field4662 >= 0) {
                                    arg4.method2308(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field8529, var15, var16, var18, var10.field4655, var10.field4660, var10.field4665, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field4662);
                                } else {
                                    arg4.method2315(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class95.method694(-124, var10.field4655, var15 << 24 | arg3.field8529), class95.method694(-125, var10.field4660, var16 << 24 | arg3.field8529), class95.method694(-123, var10.field4665, var18 << 24 | arg3.field8529));
                                }
                            } else if (var10.field4662 >= 0) {
                                arg4.method2305(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field4655, var10.field4660, var10.field4665, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field4662);
                            } else {
                                arg4.method2315(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field4655, var10.field4660, var10.field4665);
                            }
                            arg4.field5569 = 0;
                            return;
                        }
                        arg4.method2301(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field8529);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field5560 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field5561 || var44 > arg4.field5561 || var36 > arg4.field5561;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field5569 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field4662 >= 0) {
                                    arg4.method2308(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field8529, var17, var18, var16, var10.field4663, var10.field4665, var10.field4660, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field7242, this.field7242, this.field7242, var10.field4662);
                                } else {
                                    arg4.method2315(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class95.method694(-118, var10.field4663, var17 << 24 | arg3.field8529), class95.method694(-117, var10.field4665, var18 << 24 | arg3.field8529), class95.method694(-117, var10.field4660, var16 << 24 | arg3.field8529));
                                }
                            } else if (var10.field4662 >= 0) {
                                arg4.method2305(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field4663, var10.field4665, var10.field4660, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field7242, this.field7242, this.field7242, var10.field4662);
                            } else {
                                arg4.method2315(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field4663, var10.field4665, var10.field4660);
                            }
                            arg4.field5569 = 0;
                        } else {
                            arg4.method2301(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field8529);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field5560 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field5561 || var36 > arg4.field5561 || var44 > arg4.field5561;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field5569 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field4662 >= 0) {
                                    arg4.method2308(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field8529, var15, var16, var18, var10.field4655, var10.field4660, var10.field4665, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field7242, this.field7242, this.field7242, var10.field4662);
                                } else {
                                    arg4.method2315(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class95.method694(-121, var10.field4655, var15 << 24 | arg3.field8529), class95.method694(-126, var10.field4660, var16 << 24 | arg3.field8529), class95.method694(-128, var10.field4665, var18 << 24 | arg3.field8529));
                                }
                            } else if (var10.field4662 >= 0) {
                                arg4.method2305(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field4655, var10.field4660, var10.field4665, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field7242, this.field7242, this.field7242, var10.field4662);
                            } else {
                                arg4.method2315(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field4655, var10.field4660, var10.field4665);
                            }
                            arg4.field5569 = 0;
                            return;
                        }
                        arg4.method2301(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field8529);
                    }
                }
            }
        } else {
            class348 var68 = this.field7240[arg0][arg1];
            if (var68 != null) {
                if (this.field7242 == -1) {
                    for (int var69 = 0; var69 < var68.field4651; ++var69) {
                        int var70 = (arg0 << super.field447) + var68.field4649[var69];
                        int var71 = var68.field4642[var69];
                        int var72 = (arg1 << super.field447) + var68.field4648[var69];
                        float var73 = (float) var72 * this.field7235 + (float) var70 * this.field7248 + (float) var71 * this.field7250 + this.field7233;
                        if (var73 <= (float) this.field7241.field2035) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field8528);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field4644[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field8522) {
                            int var76 = (int) (var73 - (float) arg3.field8528);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field7236 + (float) var70 * this.field7243 + (float) var71 * this.field7251 + this.field7246;
                        float var78 = (float) var72 * this.field7244 + (float) var70 * this.field7237 + (float) var71 * this.field7253 + this.field7247;
                        arg5[var69] = (int) ((float) this.field7241.field2015 * var77 / var73) + arg4.field5574;
                        arg6[var69] = (int) ((float) this.field7241.field2044 * var78 / var73) + arg4.field5557;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field4651; ++var79) {
                        int var131 = (arg0 << super.field447) + var68.field4649[var79];
                        int var132 = var68.field4642[var79];
                        int var133 = (arg1 << super.field447) + var68.field4648[var79];
                        float var134 = (float) var133 * this.field7235 + (float) var131 * this.field7248 + (float) var132 * this.field7250 + this.field7233;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field7242 - arg3.field8528;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field4644[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field8522) {
                            int var137 = this.field7242 - arg3.field8528;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field7236 + (float) var131 * this.field7243 + (float) var132 * this.field7251 + this.field7246;
                        float var139 = (float) var133 * this.field7244 + (float) var131 * this.field7237 + (float) var132 * this.field7253 + this.field7247;
                        arg5[var79] = (int) ((float) this.field7241.field2015 * var138 / (float) this.field7242) + arg4.field5574;
                        arg6[var79] = (int) ((float) this.field7241.field2044 * var139 / (float) this.field7242) + arg4.field5557;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field4645 != null) {
                    int var80 = super.field440[arg0][arg1];
                    int var81 = super.field440[arg0 + 1][arg1];
                    int var82 = super.field440[arg0][arg1 + 1];
                    int var83 = super.field441 * arg0;
                    int var84 = super.field441 + var83;
                    int var85 = super.field441 * arg1;
                    int var86 = super.field441 + var85;
                    float var87 = (float) var85 * this.field7236 + (float) var80 * this.field7251 + (float) var83 * this.field7243 + this.field7246;
                    float var88 = (float) var85 * this.field7244 + (float) var80 * this.field7253 + (float) var83 * this.field7237 + this.field7247;
                    float var89 = (float) var85 * this.field7235 + (float) var80 * this.field7250 + (float) var83 * this.field7248 + this.field7233;
                    float var90 = (float) var85 * this.field7236 + (float) var81 * this.field7251 + (float) var84 * this.field7243 + this.field7246;
                    float var91 = (float) var85 * this.field7244 + (float) var81 * this.field7253 + (float) var84 * this.field7237 + this.field7247;
                    float var92 = (float) var85 * this.field7235 + (float) var81 * this.field7250 + (float) var84 * this.field7248 + this.field7233;
                    float var93 = (float) var86 * this.field7236 + (float) var82 * this.field7251 + (float) var83 * this.field7243 + this.field7246;
                    float var94 = (float) var86 * this.field7244 + (float) var82 * this.field7253 + (float) var83 * this.field7237 + this.field7247;
                    float var95 = (float) var86 * this.field7235 + (float) var82 * this.field7250 + (float) var83 * this.field7248 + this.field7233;
                    if (this.field7242 == -1) {
                        for (int var96 = 0; var96 < var68.field4647; ++var96) {
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
                                arg4.field5560 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field5561 || var101 > arg4.field5561 || var102 > arg4.field5561;
                                short var107 = var68.field4645[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method3036(this.field7241.field2418.method1365(-17951, var107).field9797)) {
                                        arg4.field5569 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method2308(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field8529, arg8[var97], arg8[var98], arg8[var99], var68.field4650[var97], var68.field4650[var98], var68.field4650[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field4650[var97] & 16777215) != 0) {
                                            arg4.method2315(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class95.method694(-122, var68.field4650[var97], arg8[var97] << 24 | arg3.field8529), class95.method694(-124, var68.field4650[var98], arg8[var98] << 24 | arg3.field8529), class95.method694(-124, var68.field4650[var99], arg8[var99] << 24 | arg3.field8529));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method2305(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field4650[var97], var68.field4650[var98], var68.field4650[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field4650[var97] & 16777215) != 0) {
                                        arg4.method2315(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field4650[var97], var68.field4650[var98], var68.field4650[var99]);
                                    }
                                    arg4.field5569 = 0;
                                } else {
                                    arg4.method2301(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field8529);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field4647; ++var108) {
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
                            arg4.field5560 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field5561 || var113 > arg4.field5561 || var114 > arg4.field5561;
                            short var119 = var68.field4645[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method3036(this.field7241.field2418.method1365(-17951, var119).field9797)) {
                                    arg4.field5569 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method2308(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field8529, arg8[var109], arg8[var110], arg8[var111], var68.field4650[var109], var68.field4650[var110], var68.field4650[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field7242, this.field7242, this.field7242, var119);
                                    } else if ((var68.field4650[var109] & 16777215) != 0) {
                                        arg4.method2315(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class95.method694(-121, var68.field4650[var109], arg8[var109] << 24 | arg3.field8529), class95.method694(-122, var68.field4650[var110], arg8[var110] << 24 | arg3.field8529), class95.method694(-120, var68.field4650[var111], arg8[var111] << 24 | arg3.field8529));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method2305(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field4650[var109], var68.field4650[var110], var68.field4650[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field7242, this.field7242, this.field7242, var119);
                                } else if ((var68.field4650[var109] & 16777215) != 0) {
                                    arg4.method2315(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field4650[var109], var68.field4650[var110], var68.field4650[var111]);
                                }
                                arg4.field5569 = 0;
                            } else {
                                arg4.method2301(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field8529);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field4647; ++var120) {
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
                        arg4.field5560 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field5561 || var125 > arg4.field5561 || var126 > arg4.field5561;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field4650[var121] & 16777215) != 0) {
                                    arg4.method2315(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class32.method305(var68.field4650[var121], arg8[var121], 7589, arg3.field8529), class32.method305(var68.field4650[var122], arg8[var122], 7589, arg3.field8529), class32.method305(var68.field4650[var123], arg8[var123], 7589, arg3.field8529));
                                }
                            } else if ((var68.field4650[var121] & 16777215) != 0) {
                                arg4.method2315(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field4650[var121], var68.field4650[var122], var68.field4650[var123]);
                            }
                        } else {
                            arg4.method2301(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field8529);
                        }
                    }
                }
            }
        }
    }
}
