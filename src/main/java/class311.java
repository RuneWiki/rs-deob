import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class311 extends class145 {

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
    private int field4686 = -1;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "Lcj;")
    private class492 field4669;

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
    private int field4676;

    @OriginalMember(owner = "client!lv", name = "F", descriptor = "[[I")
    public int[][] field4689;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "[[B")
    private byte[][] field4678;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "[[B")
    private byte[][] field4679;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    private int field4670;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
    private int field4674;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    private int field4675;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    private int field4677;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "I")
    private int field4680;

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
    private int field4681;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "I")
    private int field4683;

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
    private int field4685;

    @OriginalMember(owner = "client!lv", name = "D", descriptor = "I")
    private int field4687;

    @OriginalMember(owner = "client!lv", name = "G", descriptor = "I")
    private int field4690;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "[[Lld;")
    private class117[][] field4673;

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "[[Lnc;")
    private class21[][] field4688;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "[[Lef;")
    private class340[][] field4672;

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "[[Lew;")
    private class343[][] field4682;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 5)
    public final boolean method399(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lcj;IIII[[I[[II)V", line = 9)
    public class311(class492 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4669 = arg0;
        this.field4676 = arg2;
        this.field4689 = arg5;
        this.field4678 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field4669.field7087 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field4669.field7096 * var18 + this.field4669.field7101 * var16 + this.field4669.field7097 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field4678[var11][var10] = (byte) var20;
            }
        }
        this.field4679 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIIII[[Z)V", line = 60)
    public final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class64 var9 = this.field4669.method2927(Thread.currentThread());
        class461 var10 = var9.field790;
        var10.field6707 = 0;
        var10.field6701 = false;
        if (this.field4673 != null) {
            this.method1988(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field814, var9.field826);
        } else {
            if (this.field4672 != null) {
                this.method1992(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field814, var9.field826);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)I", line = 76)
    public final int method412(int arg0, int arg1) {
        int var3 = arg0 >> super.field2206;
        int var4 = arg1 >> super.field2206;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2207 - 1 && var4 <= super.field2211 - 1) {
            int var5 = arg0 & super.field2210 - 1;
            int var6 = arg1 & super.field2210 - 1;
            int var7 = (super.field2210 - var5) * this.field4689[var3][var4] + this.field4689[var3 + 1][var4] * var5 >> super.field2206;
            int var8 = (super.field2210 - var5) * this.field4689[var3][var4 + 1] + this.field4689[var3 + 1][var4 + 1] * var5 >> super.field2206;
            return (super.field2210 - var6) * var7 + var6 * var8 >> super.field2206;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III[[ZZ)V", line = 94)
    public final void method404(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class451 var6 = this.field4669.field7105;
        this.field4686 = -1;
        this.field4671 = var6.field6586;
        this.field4684 = var6.field6591;
        this.field4687 = var6.field6585;
        this.field4681 = var6.field6590;
        this.field4680 = var6.field6589;
        this.field4685 = var6.field6582;
        this.field4670 = var6.field6588;
        this.field4683 = var6.field6587;
        this.field4690 = var6.field6584;
        this.field4674 = var6.field6583;
        this.field4675 = var6.field6593;
        this.field4677 = var6.field6592;
    }

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 110)
    public final void method414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field4673 == null) {
            this.field4673 = new class117[super.field2207][super.field2211];
            this.field4688 = new class21[super.field2207][super.field2211];
        } else if (this.field4672 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class390.field5846[class186.method1236(false, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class390.field5846[class186.method1236(false, arg7[var16]) & 65535] << 8 | 255;
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
                class117 var25 = new class117();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1777 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1782 = (byte) (var25.field1782 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field4689[arg0 + 1][arg1] == this.field4689[arg0][arg1] && this.field4689[arg0 + 1][arg1 + 1] == this.field4689[arg0][arg1] && this.field4689[arg0][arg1 + 1] == this.field4689[arg0][arg1]) {
                    var25.field1782 = (byte) (var25.field1782 | 1);
                }
                if (var27 != -1 && (var25.field1782 & 2) == 0 && !this.field4669.field524.method584(true, var27).field4259) {
                    var25.field1779 = this.field4678[arg0][arg1] - this.field4679[arg0][arg1];
                    var25.field1772 = this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1];
                    var25.field1775 = this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1];
                    var25.field1778 = this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1];
                    var25.field1773 = (short) var27;
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
                    var25.field1779 = class28.method191((byte) -92, var28, arg10, method1993(arg6[var18] >> 8, this.field4678[arg0][arg1] - this.field4679[arg0][arg1]));
                    if (var25.field1777 != 0) {
                        var25.field1779 |= 255 - (this.field4678[arg0][arg1] - this.field4679[arg0][arg1]) << 25;
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
                    var25.field1772 = class28.method191((byte) -77, var29, arg10, method1993(arg6[var19] >> 8, this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1]));
                    if (var25.field1777 != 0) {
                        var25.field1772 |= 255 - (this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1]) << 25;
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
                    var25.field1775 = class28.method191((byte) -111, var30, arg10, method1993(arg6[var20] >> 8, this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1]));
                    if (var25.field1777 != 0) {
                        var25.field1775 |= 255 - (this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field1778 = class28.method191((byte) -100, var31, arg10, method1993(arg6[var21] >> 8, this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1]));
                    if (var25.field1777 != 0) {
                        var25.field1778 |= 255 - (this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1773 = -1;
                }
                if (arg5 != null) {
                    var25.field1774 = (short) arg5[var20];
                    var25.field1776 = (short) arg5[var21];
                    var25.field1780 = (short) arg5[var19];
                    var25.field1781 = (short) arg5[var18];
                }
                this.field4673[arg0][arg1] = var25;
            } else {
                class21 var32 = new class21();
                var32.field253 = (short) arg2.length;
                var32.field259 = (short) (arg2.length / 3);
                var32.field260 = new short[var32.field253];
                var32.field258 = new short[var32.field253];
                var32.field254 = new short[var32.field253];
                var32.field257 = new int[var32.field253];
                if (arg5 != null) {
                    var32.field255 = new short[var32.field253];
                }
                for (int var33 = 0; var33 < var32.field253; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field4678[arg0][arg1] - this.field4679[arg0][arg1];
                    } else if (var48 == 0 && super.field2210 == var49) {
                        var51 = this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1];
                    } else if (super.field2210 == var48 && super.field2210 == var49) {
                        var51 = this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1];
                    } else if (super.field2210 == var48 && var49 == 0) {
                        var51 = this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1]) * var48 + (this.field4678[arg0][arg1] - this.field4679[arg0][arg1]) * (super.field2210 - var48);
                        int var53 = (this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1]) * var48 + (this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1]) * (super.field2210 - var48);
                        var51 = (super.field2210 - var49) * var52 + var49 * var53 >> super.field2206 * 2;
                    }
                    int var54 = (arg0 << super.field2206) + var48;
                    int var55 = (arg1 << super.field2206) + var49;
                    var32.field260[var33] = (short) var48;
                    var32.field254[var33] = (short) var49;
                    var32.field258[var33] = (short) (this.method412(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field4669.field524.method584(true, arg8[var33]).field4259) {
                        var32.field257[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field257[var33] = var51 << 25;
                        } else {
                            var32.field257[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field255[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field257[var33] = class28.method191((byte) -101, var56, arg10, method1993(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field257[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field259; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field4669.field524.method584(true, arg8[var35 * 3]).field4259) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field256 = new int[var32.field259];
                }
                if (var34) {
                    var32.field262 = new short[var32.field259];
                    var32.field261 = new short[var32.field259];
                }
                for (int var36 = 0; var36 < var32.field259; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field256[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field4669.field524.method584(true, var42).field4259) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field4669.field524.method584(true, var43).field4259) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field4669.field524.method584(true, var44).field4259) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field262[var36] = (short) var44;
                            var32.field261[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field4669.field524.method584(true, var45).field4259) {
                                    var32.field257[var37] = class390.field5846[class186.method1236(false, this.field4669.field524.method584(true, var45).field4263 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field4669.field524.method584(true, var46).field4259) {
                                    var32.field257[var38] = class390.field5846[class186.method1236(false, this.field4669.field524.method584(true, var46).field4263 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field4669.field524.method584(true, var47).field4259) {
                                    var32.field257[var39] = class390.field5846[class186.method1236(false, this.field4669.field524.method584(true, var47).field4263 & 65535) & 65535];
                                }
                            }
                            var32.field262[var36] = -1;
                        }
                    }
                }
                this.field4688[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIIII[[ZLog;[I[I)V", line = 611)
    private final void method1988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class461 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6704 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4673[var16][var17] != null) {
                        class117 var18 = this.field4673[var16][var17];
                        if (var18.field1773 != -1 && (var18.field1782 & 2) == 0 && var18.field1777 == 0) {
                            int var19 = this.field4669.method2924(var18.field1773);
                            arg8.method2789(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class143.method1020((byte) 126, var18.field1775, var19), class143.method1020((byte) 122, var18.field1778, var19), class143.method1020((byte) 123, var18.field1772, var19));
                            arg8.method2789(var15, var15, var15 - var13, var14, var13 + var14, var14, class143.method1020((byte) 126, var18.field1779, var19), class143.method1020((byte) 11, var18.field1772, var19), class143.method1020((byte) -115, var18.field1778, var19));
                        } else if (var18.field1777 == 0) {
                            arg8.method2795(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1775, var18.field1778, var18.field1772);
                            arg8.method2795(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1779, var18.field1772, var18.field1778);
                        } else {
                            int var20 = var18.field1777;
                            arg8.method2795(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class129.method955(var18.field1775 & -16777216, (byte) -112, var20), class129.method955(var18.field1778 & -16777216, (byte) -112, var20), class129.method955(var18.field1772 & -16777216, (byte) -112, var20));
                            arg8.method2795(var15, var15, var15 - var13, var14, var13 + var14, var14, class129.method955(var18.field1779 & -16777216, (byte) -112, var20), class129.method955(var18.field1772 & -16777216, (byte) -112, var20), class129.method955(var18.field1778 & -16777216, (byte) -112, var20));
                        }
                    } else if (this.field4688[var16][var17] != null) {
                        class21 var21 = this.field4688[var16][var17];
                        for (int var22 = 0; var22 < var21.field253; ++var22) {
                            arg9[var22] = var21.field260[var22] * var13 / super.field2210 + var14;
                            arg10[var22] = var15 - var21.field254[var22] * var13 / super.field2210;
                        }
                        for (int var23 = 0; var23 < var21.field259; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field256 != null && var21.field256[var23] != 0 && (var21.field262 == null || var21.field262 != null && var21.field262[var23] == -1)) {
                                int var33 = var21.field256[var23];
                                arg8.method2795(var30, var31, var32, var27, var28, var29, class129.method955(-16777216 - (var21.field257[var24] & -16777216), (byte) -112, var33), class129.method955(-16777216 - (var21.field257[var25] & -16777216), (byte) -112, var33), class129.method955(-16777216 - (var21.field257[var26] & -16777216), (byte) -112, var33));
                            } else if (var21.field262 != null && var21.field262[var23] != -1) {
                                int var34 = this.field4669.method2924(var21.field262[var23]);
                                arg8.method2789(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method2795(var30, var31, var32, var27, var28, var29, var21.field257[var24], var21.field257[var25], var21.field257[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6704 = true;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Z", line = 739)
    private final boolean method1989(int arg0) {
        if ((this.field4676 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "(III)V", line = 754)
    public final void method405(int arg0, int arg1, int arg2) {
        if (this.field4679[arg0][arg1] < arg2) {
            this.field4679[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZLog;[I[I[I)V", line = 763)
    private final void method1990(int arg0, int arg1, boolean arg2, class461 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class117 var8 = this.field4673[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1782 & 2) == 0) {
                int var9 = super.field2210 * arg0;
                int var10 = super.field2210 + var9;
                int var11 = super.field2210 * arg1;
                int var12 = super.field2210 + var11;
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
                if ((var8.field1782 & 1) != 0 && !arg2) {
                    int var17 = this.field4689[arg0][arg1];
                    if (this.field4686 == -1) {
                        int var18 = this.field4674 * var17;
                        var19 = (this.field4675 * var11 + this.field4690 * var9 + var18 >> 15) + this.field4677;
                        if (var19 <= this.field4669.field7109) {
                            return;
                        }
                        var20 = (this.field4675 * var11 + this.field4690 * var10 + var18 >> 15) + this.field4677;
                        if (var20 <= this.field4669.field7109) {
                            return;
                        }
                        var21 = (this.field4675 * var12 + this.field4690 * var10 + var18 >> 15) + this.field4677;
                        if (var21 <= this.field4669.field7109) {
                            return;
                        }
                        var22 = (this.field4675 * var12 + this.field4690 * var9 + var18 >> 15) + this.field4677;
                        if (var22 <= this.field4669.field7109) {
                            return;
                        }
                    } else {
                        var22 = this.field4686;
                        var21 = this.field4686;
                        var20 = this.field4686;
                        var19 = this.field4686;
                    }
                    if (this.field4669.field7080) {
                        int var23 = var19 - this.field4669.field7106;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field4669.field7106;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field4669.field7106;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field4669.field7106;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field4684 * var17;
                    int var28 = this.field4685 * var17;
                    var29 = (this.field4687 * var11 + this.field4671 * var9 + var27 >> 15) + this.field4681;
                    var30 = this.field4669.field7081 * var29 / var19 + arg3.field6699;
                    var31 = (this.field4670 * var11 + this.field4680 * var9 + var28 >> 15) + this.field4683;
                    var32 = this.field4669.field7107 * var31 / var19 + arg3.field6709;
                    var33 = (this.field4687 * var11 + this.field4671 * var10 + var27 >> 15) + this.field4681;
                    var34 = this.field4669.field7081 * var33 / var20 + arg3.field6699;
                    var35 = (this.field4670 * var11 + this.field4680 * var10 + var28 >> 15) + this.field4683;
                    var36 = this.field4669.field7107 * var35 / var20 + arg3.field6709;
                    var37 = (this.field4687 * var12 + this.field4671 * var10 + var27 >> 15) + this.field4681;
                    var38 = this.field4669.field7081 * var37 / var21 + arg3.field6699;
                    var39 = (this.field4670 * var12 + this.field4680 * var10 + var28 >> 15) + this.field4683;
                    var40 = this.field4669.field7107 * var39 / var21 + arg3.field6709;
                    var41 = (this.field4687 * var12 + this.field4671 * var9 + var27 >> 15) + this.field4681;
                    var42 = this.field4669.field7081 * var41 / var22 + arg3.field6699;
                    var43 = (this.field4670 * var12 + this.field4680 * var9 + var28 >> 15) + this.field4683;
                    var44 = this.field4669.field7107 * var43 / var22 + arg3.field6709;
                } else {
                    int var45 = this.field4689[arg0][arg1];
                    int var46 = this.field4689[arg0 + 1][arg1];
                    int var47 = this.field4689[arg0 + 1][arg1 + 1];
                    int var48 = this.field4689[arg0][arg1 + 1];
                    if (this.field4686 == -1) {
                        var19 = (this.field4675 * var11 + this.field4690 * var9 + this.field4674 * var45 >> 15) + this.field4677;
                        if (var19 <= this.field4669.field7109) {
                            return;
                        }
                        var20 = (this.field4675 * var11 + this.field4690 * var10 + this.field4674 * var46 >> 15) + this.field4677;
                        if (var20 <= this.field4669.field7109) {
                            return;
                        }
                        var21 = (this.field4675 * var12 + this.field4690 * var10 + this.field4674 * var47 >> 15) + this.field4677;
                        if (var21 <= this.field4669.field7109) {
                            return;
                        }
                        var22 = (this.field4675 * var12 + this.field4690 * var9 + this.field4674 * var48 >> 15) + this.field4677;
                        if (var22 <= this.field4669.field7109) {
                            return;
                        }
                    } else {
                        var22 = this.field4686;
                        var21 = this.field4686;
                        var20 = this.field4686;
                        var19 = this.field4686;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field4669.field7106;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field1781 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field4669.field7106;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field1780 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field4669.field7106;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field1774 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field4669.field7106;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field1776 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field4669.field7080) {
                        int var57 = var19 - this.field4669.field7106;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field4669.field7106;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field4669.field7106;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field4669.field7106;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field4687 * var11 + this.field4684 * var45 + this.field4671 * var9 >> 15) + this.field4681;
                    var30 = this.field4669.field7081 * var29 / var19 + arg3.field6699;
                    var31 = (this.field4670 * var11 + this.field4685 * var45 + this.field4680 * var9 >> 15) + this.field4683;
                    var32 = this.field4669.field7107 * var31 / var19 + arg3.field6709;
                    var33 = (this.field4687 * var11 + this.field4684 * var46 + this.field4671 * var10 >> 15) + this.field4681;
                    var34 = this.field4669.field7081 * var33 / var20 + arg3.field6699;
                    var35 = (this.field4670 * var11 + this.field4685 * var46 + this.field4680 * var10 >> 15) + this.field4683;
                    var36 = this.field4669.field7107 * var35 / var20 + arg3.field6709;
                    var37 = (this.field4687 * var12 + this.field4684 * var47 + this.field4671 * var10 >> 15) + this.field4681;
                    var38 = this.field4669.field7081 * var37 / var21 + arg3.field6699;
                    var39 = (this.field4670 * var12 + this.field4685 * var47 + this.field4680 * var10 >> 15) + this.field4683;
                    var40 = this.field4669.field7107 * var39 / var21 + arg3.field6709;
                    var41 = (this.field4687 * var12 + this.field4684 * var48 + this.field4671 * var9 >> 15) + this.field4681;
                    var42 = this.field4669.field7081 * var41 / var22 + arg3.field6699;
                    var43 = (this.field4670 * var12 + this.field4685 * var48 + this.field4680 * var9 >> 15) + this.field4683;
                    var44 = this.field4669.field7107 * var43 / var22 + arg3.field6709;
                }
                boolean var61 = var8.field1773 != -1 && this.method1989(this.field4669.field524.method584(true, var8.field1773).field4261);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6701 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6708 || var42 > arg3.field6708 || var34 > arg3.field6708;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6707 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1773 >= 0) {
                                arg3.method2798(var40, var44, var36, var38, var42, var34, this.field4669.field7092, var15, var16, var14, var8.field1775, var8.field1778, var8.field1772, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1773);
                            } else {
                                arg3.method2795(var40, var44, var36, var38, var42, var34, class129.method955(var15 << 24 | this.field4669.field7092, (byte) -112, var8.field1775), class129.method955(var16 << 24 | this.field4669.field7092, (byte) -112, var8.field1778), class129.method955(var14 << 24 | this.field4669.field7092, (byte) -112, var8.field1772));
                            }
                        } else if (var8.field1773 >= 0) {
                            arg3.method2794(var40, var44, var36, var38, var42, var34, var8.field1775, var8.field1778, var8.field1772, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1773);
                        } else {
                            arg3.method2795(var40, var44, var36, var38, var42, var34, var8.field1775, var8.field1778, var8.field1772);
                        }
                        arg3.field6707 = 0;
                    } else {
                        arg3.method2791(var40, var44, var36, var38, var42, var34, this.field4669.field7092);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6701 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6708 || var34 > arg3.field6708 || var42 > arg3.field6708;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6707 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1773 >= 0) {
                                arg3.method2798(var32, var36, var44, var30, var34, var42, this.field4669.field7092, var13, var14, var16, var8.field1779, var8.field1772, var8.field1778, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1773);
                            } else {
                                arg3.method2795(var32, var36, var44, var30, var34, var42, class129.method955(var13 << 24 | this.field4669.field7092, (byte) -112, var8.field1779), class129.method955(var14 << 24 | this.field4669.field7092, (byte) -112, var8.field1772), class129.method955(var16 << 24 | this.field4669.field7092, (byte) -112, var8.field1778));
                            }
                        } else if (var8.field1773 >= 0) {
                            arg3.method2794(var32, var36, var44, var30, var34, var42, var8.field1779, var8.field1772, var8.field1778, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1773);
                        } else {
                            arg3.method2795(var32, var36, var44, var30, var34, var42, var8.field1779, var8.field1772, var8.field1778);
                        }
                        arg3.field6707 = 0;
                        return;
                    }
                    arg3.method2791(var32, var36, var44, var30, var34, var42, this.field4669.field7092);
                }
            }
        } else {
            class21 var64 = this.field4688[arg0][arg1];
            if (var64 != null) {
                if (this.field4686 == -1) {
                    for (int var65 = 0; var65 < var64.field253; ++var65) {
                        int var66 = (arg0 << super.field2206) + var64.field260[var65];
                        int var67 = var64.field258[var65];
                        int var68 = (arg1 << super.field2206) + var64.field254[var65];
                        int var69 = (this.field4675 * var68 + this.field4690 * var66 + this.field4674 * var67 >> 15) + this.field4677;
                        if (var69 <= this.field4669.field7109) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field4669.field7106;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field255[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field4669.field7080) {
                            int var72 = var69 - this.field4669.field7106;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field4687 * var68 + this.field4684 * var67 + this.field4671 * var66 >> 15) + this.field4681;
                        int var74 = (this.field4670 * var68 + this.field4685 * var67 + this.field4680 * var66 >> 15) + this.field4683;
                        arg4[var65] = this.field4669.field7081 * var73 / var69 + arg3.field6699;
                        arg5[var65] = this.field4669.field7107 * var74 / var69 + arg3.field6709;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field253; ++var75) {
                        int var115 = (arg0 << super.field2206) + var64.field260[var75];
                        int var116 = var64.field258[var75];
                        int var117 = (arg1 << super.field2206) + var64.field254[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field4686 - this.field4669.field7106;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field255[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field4669.field7080) {
                            int var120 = this.field4686 - this.field4669.field7106;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field4687 * var117 + this.field4684 * var116 + this.field4671 * var115 >> 15) + this.field4681;
                        int var122 = (this.field4670 * var117 + this.field4685 * var116 + this.field4680 * var115 >> 15) + this.field4683;
                        arg4[var75] = this.field4669.field7081 * var121 / this.field4686 + arg3.field6699;
                        arg5[var75] = this.field4669.field7107 * var122 / this.field4686 + arg3.field6709;
                    }
                }
                if (var64.field262 != null) {
                    int var76 = this.field4689[arg0][arg1];
                    int var77 = this.field4689[arg0 + 1][arg1];
                    int var78 = this.field4689[arg0][arg1 + 1];
                    int var79 = super.field2210 * arg0;
                    int var80 = super.field2210 + var79;
                    int var81 = super.field2210 * arg1;
                    int var82 = super.field2210 + var81;
                    int var83 = (this.field4687 * var81 + this.field4684 * var76 + this.field4671 * var79 >> 15) + this.field4681;
                    int var84 = (this.field4670 * var81 + this.field4685 * var76 + this.field4680 * var79 >> 15) + this.field4683;
                    int var85 = (this.field4675 * var81 + this.field4690 * var79 + this.field4674 * var76 >> 15) + this.field4677;
                    int var86 = (this.field4687 * var81 + this.field4684 * var77 + this.field4671 * var80 >> 15) + this.field4681;
                    int var87 = (this.field4670 * var81 + this.field4685 * var77 + this.field4680 * var80 >> 15) + this.field4683;
                    int var88 = (this.field4675 * var81 + this.field4690 * var80 + this.field4674 * var77 >> 15) + this.field4677;
                    int var89 = (this.field4687 * var82 + this.field4684 * var78 + this.field4671 * var79 >> 15) + this.field4681;
                    int var90 = (this.field4670 * var82 + this.field4685 * var78 + this.field4680 * var79 >> 15) + this.field4683;
                    int var91 = (this.field4675 * var82 + this.field4690 * var79 + this.field4674 * var78 >> 15) + this.field4677;
                    for (int var92 = 0; var92 < var64.field259; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field6701 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field6708 || var97 > arg3.field6708 || var98 > arg3.field6708;
                            short var103 = var64.field262[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method1989(this.field4669.field524.method584(true, var103).field4261)) {
                                    arg3.field6707 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2798(var99, var100, var101, var96, var97, var98, this.field4669.field7092, arg6[var93], arg6[var94], arg6[var95], var64.field257[var93], var64.field257[var94], var64.field257[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field257[var93] & 16777215) != 0) {
                                        arg3.method2795(var99, var100, var101, var96, var97, var98, class129.method955(arg6[var93] << 24 | this.field4669.field7092, (byte) -112, var64.field257[var93]), class129.method955(arg6[var94] << 24 | this.field4669.field7092, (byte) -112, var64.field257[var94]), class129.method955(arg6[var95] << 24 | this.field4669.field7092, (byte) -112, var64.field257[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2794(var99, var100, var101, var96, var97, var98, var64.field257[var93], var64.field257[var94], var64.field257[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field257[var93] & 16777215) != 0) {
                                    arg3.method2795(var99, var100, var101, var96, var97, var98, var64.field257[var93], var64.field257[var94], var64.field257[var95]);
                                }
                                arg3.field6707 = 0;
                            } else {
                                arg3.method2791(var99, var100, var101, var96, var97, var98, this.field4669.field7092);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field259; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field6701 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field6708 || var109 > arg3.field6708 || var110 > arg3.field6708;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field257[var105] & 16777215) != 0) {
                                    arg3.method2795(var111, var112, var113, var108, var109, var110, class28.method191((byte) -101, arg6[var105], this.field4669.field7092, var64.field257[var105]), class28.method191((byte) -126, arg6[var106], this.field4669.field7092, var64.field257[var106]), class28.method191((byte) -125, arg6[var107], this.field4669.field7092, var64.field257[var107]));
                                }
                            } else if ((var64.field257[var105] & 16777215) != 0) {
                                arg3.method2795(var111, var112, var113, var108, var109, var110, var64.field257[var105], var64.field257[var106], var64.field257[var107]);
                            }
                        } else {
                            arg3.method2791(var111, var112, var113, var108, var109, var110, this.field4669.field7092);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(Lba;IIIIZ)V", line = 1404)
    public final void method410(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lv", name = "ca", descriptor = "()V", line = 1408)
    public final void method407() {
        this.field4678 = null;
        this.field4679 = null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lqp;[I)V", line = 1412)
    public final void method415(class470 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "(Lba;IIIIZ)V", line = 1414)
    public final void method413(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1417)
    public final void method403(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field4672 == null) {
            this.field4672 = new class340[super.field2207][super.field2211];
            this.field4682 = new class343[super.field2207][super.field2211];
        } else if (this.field4673 != null) {
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
            class343 var22 = new class343();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5090 = var23;
            var22.field5080 = new short[var23];
            var22.field5087 = new short[var23];
            var22.field5089 = new short[var23];
            var22.field5085 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5080[var25] = (short) (this.field4678[arg0][arg1] - this.field4679[arg0][arg1]);
                } else if (var30 == 0 && super.field2210 == var31) {
                    var22.field5080[var25] = (short) (this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1]);
                } else if (super.field2210 == var30 && super.field2210 == var31) {
                    var22.field5080[var25] = (short) (this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1]);
                } else if (super.field2210 == var30 && var31 == 0) {
                    var22.field5080[var25] = (short) (this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1]) * var30 + (this.field4678[arg0][arg1] - this.field4679[arg0][arg1]) * (super.field2210 - var30);
                    int var33 = (this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1]) * var30 + (this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1]) * (super.field2210 - var30);
                    var22.field5080[var25] = (short) ((super.field2210 - var31) * var32 + var31 * var33 >> super.field2206 * 2);
                }
                int var34 = (arg0 << super.field2206) + var30;
                int var35 = (arg1 << super.field2206) + var31;
                var22.field5087[var25] = (short) var30;
                var22.field5085[var25] = (short) var31;
                var22.field5089[var25] = (short) (this.method412(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field5080[var25] < 2) {
                    var22.field5080[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field4669.field524.method584(true, arg11[var28]).field4259) {
                    var26 = true;
                }
            }
            var22.field5081 = new int[var27];
            if (arg10 != null) {
                var22.field5088 = new int[var27];
            }
            var22.field5086 = new short[var27];
            var22.field5091 = new short[var27];
            var22.field5083 = new short[var27];
            if (var26) {
                var22.field5084 = new short[var27];
                var22.field5082 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5081[var22.field5079] = class186.method1236(false, arg9[var29]);
                    } else {
                        var22.field5081[var22.field5079] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5088[var22.field5079] = class186.method1236(false, arg10[var29]);
                        } else {
                            var22.field5088[var22.field5079] = -1;
                        }
                    }
                    var22.field5086[var22.field5079] = (short) arg6[var29];
                    var22.field5091[var22.field5079] = (short) arg7[var29];
                    var22.field5083[var22.field5079] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field4669.field524.method584(true, arg11[var29]).field4259) {
                            var22.field5084[var22.field5079] = (short) arg11[var29];
                            var22.field5082[var22.field5079] = (short) arg12[var29];
                        } else {
                            var22.field5084[var22.field5079] = -1;
                        }
                    }
                    ++var22.field5079;
                }
            }
            this.field4682[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class340 var36 = new class340();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5061 = class143.method1020((byte) 126, this.field4678[arg0][arg1] - this.field4679[arg0][arg1], class186.method1236(false, arg10[0]));
                    if (var37 == -1) {
                        var36.field5064 = (byte) (var36.field5064 | 2);
                    }
                }
                if (this.field4689[arg0 + 1][arg1] == this.field4689[arg0][arg1] && this.field4689[arg0 + 1][arg1 + 1] == this.field4689[arg0][arg1] && this.field4689[arg0][arg1 + 1] == this.field4689[arg0][arg1]) {
                    var36.field5064 = (byte) (var36.field5064 | 1);
                }
                if (var38 != -1 && (var36.field5064 & 2) == 0 && !this.field4669.field524.method584(true, var38).field4259) {
                    var36.field5059 = (short) (this.field4678[arg0][arg1] - this.field4679[arg0][arg1]);
                    var36.field5062 = (short) (this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1]);
                    var36.field5063 = (short) (this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1]);
                    var36.field5058 = (short) (this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1]);
                    var36.field5060 = (short) var38;
                } else {
                    short var39 = class186.method1236(false, var37);
                    var36.field5059 = (short) class143.method1020((byte) -13, this.field4678[arg0][arg1] - this.field4679[arg0][arg1], var39);
                    var36.field5062 = (short) class143.method1020((byte) 126, this.field4678[arg0 + 1][arg1] - this.field4679[arg0 + 1][arg1], var39);
                    var36.field5063 = (short) class143.method1020((byte) 123, this.field4678[arg0 + 1][arg1 + 1] - this.field4679[arg0 + 1][arg1 + 1], var39);
                    var36.field5058 = (short) class143.method1020((byte) -99, this.field4678[arg0][arg1 + 1] - this.field4679[arg0][arg1 + 1], var39);
                    var36.field5060 = -1;
                }
                this.field4672[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "(IILba;)Lba;", line = 1649)
    public final class265 method408(int arg0, int arg1, class265 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILog;[I[I[I)V", line = 1657)
    private final void method1991(int arg0, int arg1, class461 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class340 var7 = this.field4672[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5064 & 2) == 0) {
                int var8 = super.field2210 * arg0;
                int var9 = super.field2210 + var8;
                int var10 = super.field2210 * arg1;
                int var11 = super.field2210 + var10;
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
                if ((var7.field5064 & 1) != 0) {
                    int var12 = this.field4689[arg0][arg1];
                    int var16;
                    if (this.field4686 == -1) {
                        int var13 = this.field4674 * var12;
                        var14 = (this.field4675 * var10 + this.field4690 * var8 + var13 >> 15) + this.field4677;
                        if (var14 <= this.field4669.field7109) {
                            return;
                        }
                        var15 = (this.field4675 * var10 + this.field4690 * var9 + var13 >> 15) + this.field4677;
                        if (var15 <= this.field4669.field7109) {
                            return;
                        }
                        var16 = (this.field4675 * var11 + this.field4690 * var9 + var13 >> 15) + this.field4677;
                        if (var16 <= this.field4669.field7109) {
                            return;
                        }
                        var17 = (this.field4675 * var11 + this.field4690 * var8 + var13 >> 15) + this.field4677;
                        if (var17 <= this.field4669.field7109) {
                            return;
                        }
                    } else {
                        var17 = this.field4686;
                        var16 = this.field4686;
                        var15 = this.field4686;
                        var14 = this.field4686;
                    }
                    int var18 = this.field4684 * var12;
                    int var19 = this.field4685 * var12;
                    var20 = (this.field4687 * var10 + this.field4671 * var8 + var18 >> 15) + this.field4681;
                    var21 = this.field4669.field7081 * var20 / var14 + arg2.field6699;
                    var22 = (this.field4670 * var10 + this.field4680 * var8 + var19 >> 15) + this.field4683;
                    var23 = this.field4669.field7107 * var22 / var14 + arg2.field6709;
                    var24 = (this.field4687 * var10 + this.field4671 * var9 + var18 >> 15) + this.field4681;
                    var25 = this.field4669.field7081 * var24 / var15 + arg2.field6699;
                    var26 = (this.field4670 * var10 + this.field4680 * var9 + var19 >> 15) + this.field4683;
                    var27 = this.field4669.field7107 * var26 / var15 + arg2.field6709;
                    int var28 = (this.field4687 * var11 + this.field4671 * var9 + var18 >> 15) + this.field4681;
                    var29 = this.field4669.field7081 * var28 / var16 + arg2.field6699;
                    int var30 = (this.field4670 * var11 + this.field4680 * var9 + var19 >> 15) + this.field4683;
                    var31 = this.field4669.field7107 * var30 / var16 + arg2.field6709;
                    var32 = (this.field4687 * var11 + this.field4671 * var8 + var18 >> 15) + this.field4681;
                    var33 = this.field4669.field7081 * var32 / var17 + arg2.field6699;
                    var34 = (this.field4670 * var11 + this.field4680 * var8 + var19 >> 15) + this.field4683;
                    var35 = this.field4669.field7107 * var34 / var17 + arg2.field6709;
                } else {
                    int var36 = this.field4689[arg0][arg1];
                    int var37 = this.field4689[arg0 + 1][arg1];
                    int var38 = this.field4689[arg0 + 1][arg1 + 1];
                    int var39 = this.field4689[arg0][arg1 + 1];
                    int var40;
                    if (this.field4686 == -1) {
                        var14 = (this.field4675 * var10 + this.field4690 * var8 + this.field4674 * var36 >> 15) + this.field4677;
                        if (var14 <= this.field4669.field7109) {
                            return;
                        }
                        var15 = (this.field4675 * var10 + this.field4690 * var9 + this.field4674 * var37 >> 15) + this.field4677;
                        if (var15 <= this.field4669.field7109) {
                            return;
                        }
                        var40 = (this.field4675 * var11 + this.field4690 * var9 + this.field4674 * var38 >> 15) + this.field4677;
                        if (var40 <= this.field4669.field7109) {
                            return;
                        }
                        var17 = (this.field4675 * var11 + this.field4690 * var8 + this.field4674 * var39 >> 15) + this.field4677;
                        if (var17 <= this.field4669.field7109) {
                            return;
                        }
                    } else {
                        var17 = this.field4686;
                        var40 = this.field4686;
                        var15 = this.field4686;
                        var14 = this.field4686;
                    }
                    var20 = (this.field4687 * var10 + this.field4684 * var36 + this.field4671 * var8 >> 15) + this.field4681;
                    var21 = this.field4669.field7081 * var20 / var14 + arg2.field6699;
                    var22 = (this.field4670 * var10 + this.field4685 * var36 + this.field4680 * var8 >> 15) + this.field4683;
                    var23 = this.field4669.field7107 * var22 / var14 + arg2.field6709;
                    var24 = (this.field4687 * var10 + this.field4684 * var37 + this.field4671 * var9 >> 15) + this.field4681;
                    var25 = this.field4669.field7081 * var24 / var15 + arg2.field6699;
                    var26 = (this.field4670 * var10 + this.field4685 * var37 + this.field4680 * var9 >> 15) + this.field4683;
                    var27 = this.field4669.field7107 * var26 / var15 + arg2.field6709;
                    int var41 = (this.field4687 * var11 + this.field4684 * var38 + this.field4671 * var9 >> 15) + this.field4681;
                    var29 = this.field4669.field7081 * var41 / var40 + arg2.field6699;
                    int var42 = (this.field4670 * var11 + this.field4685 * var38 + this.field4680 * var9 >> 15) + this.field4683;
                    var31 = this.field4669.field7107 * var42 / var40 + arg2.field6709;
                    var32 = (this.field4687 * var11 + this.field4684 * var39 + this.field4671 * var8 >> 15) + this.field4681;
                    var33 = this.field4669.field7081 * var32 / var17 + arg2.field6699;
                    var34 = (this.field4670 * var11 + this.field4685 * var39 + this.field4680 * var8 >> 15) + this.field4683;
                    var35 = this.field4669.field7107 * var34 / var17 + arg2.field6709;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6701 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6708 || var33 > arg2.field6708 || var25 > arg2.field6708;
                    if (var7.field5060 >= 0) {
                        if (this.method1989(this.field4669.field524.method584(true, var7.field5060).field4261)) {
                            arg2.field6707 = 100;
                        }
                        arg2.method2794(var31, var35, var27, var29, var33, var25, var7.field5063 & 65535, var7.field5058 & 65535, var7.field5062 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5060);
                        arg2.field6707 = 0;
                    } else {
                        arg2.method2789(var31, var35, var27, var29, var33, var25, var7.field5063 & 65535, var7.field5058 & 65535, var7.field5062 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6701 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6708 || var25 > arg2.field6708 || var33 > arg2.field6708;
                    if (var7.field5060 >= 0) {
                        if (this.method1989(this.field4669.field524.method584(true, var7.field5060).field4261)) {
                            arg2.field6707 = 100;
                        }
                        arg2.method2794(var23, var27, var35, var21, var25, var33, var7.field5059 & 65535, var7.field5062 & 65535, var7.field5058 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5060);
                        arg2.field6707 = 0;
                        return;
                    }
                    arg2.method2789(var23, var27, var35, var21, var25, var33, var7.field5059 & 65535, var7.field5062 & 65535, var7.field5058 & 65535);
                }
            }
        } else {
            class343 var43 = this.field4682[arg0][arg1];
            if (var43 != null) {
                if (this.field4686 == -1) {
                    for (int var44 = 0; var44 < var43.field5090; ++var44) {
                        int var45 = (arg0 << super.field2206) + var43.field5087[var44];
                        short var46 = var43.field5089[var44];
                        int var47 = (arg1 << super.field2206) + var43.field5085[var44];
                        int var48 = (this.field4675 * var47 + this.field4690 * var45 + this.field4674 * var46 >> 15) + this.field4677;
                        if (var48 <= this.field4669.field7109) {
                            return;
                        }
                        int var49 = (this.field4687 * var47 + this.field4684 * var46 + this.field4671 * var45 >> 15) + this.field4681;
                        int var50 = (this.field4670 * var47 + this.field4685 * var46 + this.field4680 * var45 >> 15) + this.field4683;
                        arg3[var44] = this.field4669.field7081 * var49 / var48 + arg2.field6699;
                        arg4[var44] = this.field4669.field7107 * var50 / var48 + arg2.field6709;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field5090; ++var51) {
                        int var91 = (arg0 << super.field2206) + var43.field5087[var51];
                        short var92 = var43.field5089[var51];
                        int var93 = (arg1 << super.field2206) + var43.field5085[var51];
                        int var94 = (this.field4687 * var93 + this.field4684 * var92 + this.field4671 * var91 >> 15) + this.field4681;
                        int var95 = (this.field4670 * var93 + this.field4685 * var92 + this.field4680 * var91 >> 15) + this.field4683;
                        arg3[var51] = this.field4669.field7081 * var94 / this.field4686 + arg2.field6699;
                        arg4[var51] = this.field4669.field7107 * var95 / this.field4686 + arg2.field6709;
                    }
                }
                if (var43.field5084 != null) {
                    int var52 = this.field4689[arg0][arg1];
                    int var53 = this.field4689[arg0 + 1][arg1];
                    int var54 = this.field4689[arg0][arg1 + 1];
                    int var55 = super.field2210 * arg0;
                    int var56 = super.field2210 + var55;
                    int var57 = super.field2210 * arg1;
                    int var58 = super.field2210 + var57;
                    int var59 = (this.field4687 * var57 + this.field4684 * var52 + this.field4671 * var55 >> 15) + this.field4681;
                    int var60 = (this.field4670 * var57 + this.field4685 * var52 + this.field4680 * var55 >> 15) + this.field4683;
                    int var61 = (this.field4675 * var57 + this.field4690 * var55 + this.field4674 * var52 >> 15) + this.field4677;
                    int var62 = (this.field4687 * var57 + this.field4684 * var53 + this.field4671 * var56 >> 15) + this.field4681;
                    int var63 = (this.field4670 * var57 + this.field4685 * var53 + this.field4680 * var56 >> 15) + this.field4683;
                    int var64 = (this.field4675 * var57 + this.field4690 * var56 + this.field4674 * var53 >> 15) + this.field4677;
                    int var65 = (this.field4687 * var58 + this.field4684 * var54 + this.field4671 * var55 >> 15) + this.field4681;
                    int var66 = (this.field4670 * var58 + this.field4685 * var54 + this.field4680 * var55 >> 15) + this.field4683;
                    int var67 = (this.field4675 * var58 + this.field4690 * var55 + this.field4674 * var54 >> 15) + this.field4677;
                    for (int var68 = 0; var68 < var43.field5079; ++var68) {
                        short var69 = var43.field5086[var68];
                        short var70 = var43.field5091[var68];
                        short var71 = var43.field5083[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field6701 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field6708 || var73 > arg2.field6708 || var74 > arg2.field6708;
                            short var78 = var43.field5084[var68];
                            if (var78 != -1) {
                                if (this.method1989(this.field4669.field524.method584(true, var78).field4261)) {
                                    arg2.field6707 = 100;
                                }
                                arg2.method2794(var75, var76, var77, var72, var73, var74, var43.field5080[var69], var43.field5080[var70], var43.field5080[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field6707 = 0;
                            } else {
                                int var79 = var43.field5081[var68];
                                if (var79 != -1) {
                                    arg2.method2789(var75, var76, var77, var72, var73, var74, class143.method1020((byte) 122, var43.field5080[var69], var79), class143.method1020((byte) -25, var43.field5080[var70], var79), class143.method1020((byte) 125, var43.field5080[var71], var79));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field5079; ++var80) {
                    short var81 = var43.field5086[var80];
                    short var82 = var43.field5091[var80];
                    short var83 = var43.field5083[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field5081[var80];
                        if (var90 != -1) {
                            arg2.field6701 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field6708 || var85 > arg2.field6708 || var86 > arg2.field6708;
                            arg2.method2789(var87, var88, var89, var84, var85, var86, class143.method1020((byte) 126, var43.field5080[var81], var90), class143.method1020((byte) 121, var43.field5080[var82], var90), class143.method1020((byte) 124, var43.field5080[var83], var90));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(IIIIIII[[ZLog;[I[I)V", line = 2014)
    private final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class461 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6704 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field4672[var16][var17] != null) {
                        class340 var18 = this.field4672[var16][var17];
                        if (var18.field5060 != -1 && (var18.field5064 & 2) == 0 && var18.field5061 == -1) {
                            int var19 = this.field4669.method2924(var18.field5060);
                            arg8.method2789(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class143.method1020((byte) 125, var18.field5063 & 65535, var19), class143.method1020((byte) -98, var18.field5058 & 65535, var19), class143.method1020((byte) 126, var18.field5062 & 65535, var19));
                            arg8.method2789(var15, var15, var15 - var13, var14, var13 + var14, var14, class143.method1020((byte) 24, var18.field5059 & 65535, var19), class143.method1020((byte) 121, var18.field5062 & 65535, var19), class143.method1020((byte) -29, var18.field5058 & 65535, var19));
                        } else if (var18.field5061 == -1) {
                            arg8.method2789(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5063 & 65535, var18.field5058 & 65535, var18.field5062 & 65535);
                            arg8.method2789(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5059 & 65535, var18.field5062 & 65535, var18.field5058 & 65535);
                        } else {
                            int var20 = var18.field5061;
                            arg8.method2789(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2789(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field4682[var16][var17] != null) {
                        class343 var21 = this.field4682[var16][var17];
                        for (int var22 = 0; var22 < var21.field5090; ++var22) {
                            arg9[var22] = var21.field5087[var22] * var13 / super.field2210 + var14;
                            arg10[var22] = var15 - var21.field5085[var22] * var13 / super.field2210;
                        }
                        for (int var23 = 0; var23 < var21.field5079; ++var23) {
                            short var24 = var21.field5086[var23];
                            short var25 = var21.field5091[var23];
                            short var26 = var21.field5083[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5088 != null && var21.field5088[var23] != -1) {
                                int var33 = var21.field5088[var23];
                                arg8.method2789(var30, var31, var32, var27, var28, var29, class143.method1020((byte) 124, var21.field5080[var24], var33), class143.method1020((byte) 121, var21.field5080[var25], var33), class143.method1020((byte) 121, var21.field5080[var26], var33));
                            } else if (var21.field5084 != null && var21.field5084[var23] != -1) {
                                int var34 = this.field4669.method2924(var21.field5084[var23]);
                                arg8.method2789(var30, var31, var32, var27, var28, var29, class143.method1020((byte) -104, var21.field5080[var24], var34), class143.method1020((byte) 2, var21.field5080[var25], var34), class143.method1020((byte) 125, var21.field5080[var26], var34));
                            } else {
                                int var35 = var21.field5081[var23];
                                arg8.method2789(var30, var31, var32, var27, var28, var29, class143.method1020((byte) 121, var21.field5080[var24], var35), class143.method1020((byte) 126, var21.field5080[var25], var35), class143.method1020((byte) 126, var21.field5080[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6704 = true;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)V", line = 2146)
    public final void method401(int arg0, int arg1) {
        class64 var3 = this.field4669.method2927(Thread.currentThread());
        var3.field790.field6707 = 0;
        if (this.field4673 != null) {
            this.method1990(arg0, arg1, this.field4669.field7077, var3.field790, var3.field814, var3.field826, var3.field825);
        } else {
            if (this.field4672 != null) {
                this.method1991(arg0, arg1, var3.field790, var3.field814, var3.field826, var3.field825);
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(II)I", line = 2158)
    private static final int method1993(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "(II)I", line = 2187)
    public final int method411(int arg0, int arg1) {
        return this.field4689[arg0][arg1];
    }
}
