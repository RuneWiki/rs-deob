import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class786 extends class418 {

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    private int field10789 = -1;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Lnia;")
    private class30 field10795;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    private int field10775;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "[[B")
    private byte[][] field10778;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[[B")
    private byte[][] field10784;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "F")
    private float field10776;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "F")
    private float field10779;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "F")
    private float field10780;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "F")
    private float field10782;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "F")
    private float field10785;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "F")
    private float field10787;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "F")
    private float field10788;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "F")
    private float field10790;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "F")
    private float field10791;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "F")
    private float field10792;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "F")
    private float field10793;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "F")
    private float field10796;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[[Lpda;")
    private class155[][] field10794;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "[[Lbv;")
    private class420[][] field10777;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[[Lrw;")
    private class541[][] field10786;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[[Ldk;")
    private class711[][] field10781;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "[[Lkc;")
    private class71[][] field10783;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lsca;[I)V")
    public final void method1362(class251 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1363(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field10783 == null) {
            this.field10783 = new class71[super.field5827][super.field5826];
            this.field10786 = new class541[super.field5827][super.field5826];
        } else if (this.field10777 != null || this.field10781 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field5818 != var20 || var21 != 0 && super.field5818 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class541 var22 = new class541();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field7478 = var23;
            var22.field7475 = new short[var23];
            var22.field7479 = new short[var23];
            var22.field7485 = new short[var23];
            var22.field7486 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field7475[var25] = (short) (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]);
                } else if (var32 == 0 && super.field5818 == var33) {
                    var22.field7475[var25] = (short) (this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]);
                } else if (super.field5818 == var32 && super.field5818 == var33) {
                    var22.field7475[var25] = (short) (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]);
                } else if (super.field5818 == var32 && var33 == 0) {
                    var22.field7475[var25] = (short) (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]) * var32 + (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]) * (super.field5818 - var32);
                    int var35 = (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]) * var32 + (this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]) * (super.field5818 - var32);
                    var22.field7475[var25] = (short) ((super.field5818 - var33) * var34 + var33 * var35 >> super.field5825 * 2);
                }
                int var36 = (arg0 << super.field5825) + var32;
                int var37 = (arg1 << super.field5825) + var33;
                var22.field7479[var25] = (short) var32;
                var22.field7486[var25] = (short) var33;
                var22.field7485[var25] = (short) (this.method2529(var37, var36, (byte) -128) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field7475[var25] < 2) {
                    var22.field7475[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class744 var31 = this.field10795.field6556.method581(-21732, var30);
                    if (!var31.field10264) {
                        var26 = true;
                        if (this.method4309(var31.field10273) || var31.field10259 != 0 || var31.field10268 != 0) {
                            var22.field7483 = (byte) (var22.field7483 | 4);
                        }
                    }
                }
            }
            var22.field7481 = new int[var27];
            if (arg10 != null) {
                var22.field7474 = new int[var27];
            }
            var22.field7477 = new short[var27];
            var22.field7476 = new short[var27];
            var22.field7480 = new short[var27];
            if (var26) {
                var22.field7482 = new short[var27];
                var22.field7484 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field7481[var22.field7473] = class357.method2236(arg9[var29], (byte) -127);
                    } else {
                        var22.field7481[var22.field7473] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field7474[var22.field7473] = class357.method2236(arg10[var29], (byte) -127);
                        } else {
                            var22.field7474[var22.field7473] = -1;
                        }
                    }
                    var22.field7477[var22.field7473] = (short) arg6[var29];
                    var22.field7476[var22.field7473] = (short) arg7[var29];
                    var22.field7480[var22.field7473] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field10795.field6556.method581(-21732, arg11[var29]).field10264) {
                            var22.field7482[var22.field7473] = (short) arg11[var29];
                            var22.field7484[var22.field7473] = (short) arg12[var29];
                        } else {
                            var22.field7482[var22.field7473] = -1;
                        }
                    }
                    ++var22.field7473;
                }
            }
            this.field10786[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class71 var38 = new class71();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field775 = class341.method2164(this.field10778[arg0][arg1] - this.field10784[arg0][arg1], 8191, class357.method2236(arg10[0], (byte) -128));
                    if (var39 == -1) {
                        var38.field778 = (byte) (var38.field778 | 2);
                    }
                }
                if (super.field5823[arg0 + 1][arg1] == super.field5823[arg0][arg1] && super.field5823[arg0 + 1][arg1 + 1] == super.field5823[arg0][arg1] && super.field5823[arg0][arg1 + 1] == super.field5823[arg0][arg1]) {
                    var38.field778 = (byte) (var38.field778 | 1);
                }
                class744 var41 = null;
                if (var40 != -1) {
                    var41 = this.field10795.field6556.method581(-21732, var40);
                }
                if (var41 != null && (var38.field778 & 2) == 0 && !var41.field10264) {
                    var38.field774 = (short) (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]);
                    var38.field777 = (short) (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]);
                    var38.field776 = (short) (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]);
                    var38.field780 = (short) (this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]);
                    var38.field779 = (short) var40;
                    if (this.method4309(var41.field10273) || var41.field10259 != 0 || var41.field10268 != 0) {
                        var38.field778 = (byte) (var38.field778 | 4);
                    }
                } else {
                    short var42 = class357.method2236(var39, (byte) -128);
                    var38.field774 = (short) class341.method2164(this.field10778[arg0][arg1] - this.field10784[arg0][arg1], 8191, var42);
                    var38.field777 = (short) class341.method2164(this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1], 8191, var42);
                    var38.field776 = (short) class341.method2164(this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1], 8191, var42);
                    var38.field780 = (short) class341.method2164(this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1], 8191, var42);
                    var38.field779 = -1;
                }
                this.field10783[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILhs;[I[I[I[II)V")
    private final void method4307(int arg0, int arg1, class143 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class71 var9 = this.field10783[arg0][arg1];
        if (var9 != null) {
            if ((var9.field778 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field778 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field5818 * arg0;
                int var11 = super.field5818 + var10;
                int var12 = super.field5818 * arg1;
                int var13 = super.field5818 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field778 & 1) != 0) {
                    int var14 = super.field5823[arg0][arg1];
                    float var15 = (float) var14 * this.field10793;
                    if (this.field10789 == -1) {
                        var16 = (float) var12 * this.field10782 + (float) var10 * this.field10787 + var15 + this.field10779;
                        if (var16 <= (float) this.field10795.field252) {
                            return;
                        }
                        var17 = (float) var12 * this.field10782 + (float) var11 * this.field10787 + var15 + this.field10779;
                        if (var17 <= (float) this.field10795.field252) {
                            return;
                        }
                        var18 = (float) var13 * this.field10782 + (float) var11 * this.field10787 + var15 + this.field10779;
                        if (var18 <= (float) this.field10795.field252) {
                            return;
                        }
                        var19 = (float) var13 * this.field10782 + (float) var10 * this.field10787 + var15 + this.field10779;
                        if (var19 <= (float) this.field10795.field252) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field10782 + (float) var10 * this.field10787 + var15 + this.field10779;
                        var17 = (float) var12 * this.field10782 + (float) var11 * this.field10787 + var15 + this.field10779;
                        var18 = (float) var13 * this.field10782 + (float) var11 * this.field10787 + var15 + this.field10779;
                        var19 = (float) var13 * this.field10782 + (float) var10 * this.field10787 + var15 + this.field10779;
                    }
                    float var20 = (float) var14 * this.field10776;
                    float var21 = (float) var14 * this.field10788;
                    if (this.field10789 == -1) {
                        float var22 = (float) var12 * this.field10796 + (float) var10 * this.field10785 + var20 + this.field10792;
                        var23 = (int) ((float) this.field10795.field249 * var22 / var16) + arg2.field1817;
                        float var24 = (float) var12 * this.field10780 + (float) var10 * this.field10791 + var21 + this.field10790;
                        var25 = (int) ((float) this.field10795.field272 * var24 / var16) + arg2.field1818;
                        float var26 = (float) var12 * this.field10796 + (float) var11 * this.field10785 + var20 + this.field10792;
                        var27 = (int) ((float) this.field10795.field249 * var26 / var17) + arg2.field1817;
                        float var28 = (float) var12 * this.field10780 + (float) var11 * this.field10791 + var21 + this.field10790;
                        var29 = (int) ((float) this.field10795.field272 * var28 / var17) + arg2.field1818;
                        float var30 = (float) var13 * this.field10796 + (float) var11 * this.field10785 + var20 + this.field10792;
                        var31 = (int) ((float) this.field10795.field249 * var30 / var18) + arg2.field1817;
                        float var32 = (float) var13 * this.field10780 + (float) var11 * this.field10791 + var21 + this.field10790;
                        var33 = (int) ((float) this.field10795.field272 * var32 / var18) + arg2.field1818;
                        float var34 = (float) var13 * this.field10796 + (float) var10 * this.field10785 + var20 + this.field10792;
                        var35 = (int) ((float) this.field10795.field249 * var34 / var19) + arg2.field1817;
                        float var36 = (float) var13 * this.field10780 + (float) var10 * this.field10791 + var21 + this.field10790;
                        var37 = (int) ((float) this.field10795.field272 * var36 / var19) + arg2.field1818;
                    } else {
                        float var38 = (float) var12 * this.field10796 + (float) var10 * this.field10785 + var20 + this.field10792;
                        var23 = (int) ((float) this.field10795.field249 * var38 / (float) this.field10789) + arg2.field1817;
                        float var39 = (float) var12 * this.field10780 + (float) var10 * this.field10791 + var21 + this.field10790;
                        var25 = (int) ((float) this.field10795.field272 * var39 / (float) this.field10789) + arg2.field1818;
                        float var40 = (float) var12 * this.field10796 + (float) var11 * this.field10785 + var20 + this.field10792;
                        var27 = (int) ((float) this.field10795.field249 * var40 / (float) this.field10789) + arg2.field1817;
                        float var41 = (float) var12 * this.field10780 + (float) var11 * this.field10791 + var21 + this.field10790;
                        var29 = (int) ((float) this.field10795.field272 * var41 / (float) this.field10789) + arg2.field1818;
                        float var42 = (float) var13 * this.field10796 + (float) var11 * this.field10785 + var20 + this.field10792;
                        var31 = (int) ((float) this.field10795.field249 * var42 / (float) this.field10789) + arg2.field1817;
                        float var43 = (float) var13 * this.field10780 + (float) var11 * this.field10791 + var21 + this.field10790;
                        var33 = (int) ((float) this.field10795.field272 * var43 / (float) this.field10789) + arg2.field1818;
                        float var44 = (float) var13 * this.field10796 + (float) var10 * this.field10785 + var20 + this.field10792;
                        var35 = (int) ((float) this.field10795.field249 * var44 / (float) this.field10789) + arg2.field1817;
                        float var45 = (float) var13 * this.field10780 + (float) var10 * this.field10791 + var21 + this.field10790;
                        var37 = (int) ((float) this.field10795.field272 * var45 / (float) this.field10789) + arg2.field1818;
                    }
                } else {
                    int var46 = super.field5823[arg0][arg1];
                    int var47 = super.field5823[arg0 + 1][arg1];
                    int var48 = super.field5823[arg0 + 1][arg1 + 1];
                    int var49 = super.field5823[arg0][arg1 + 1];
                    if (this.field10789 == -1) {
                        var16 = (float) var12 * this.field10782 + (float) var10 * this.field10787 + (float) var46 * this.field10793 + this.field10779;
                        if (var16 <= (float) this.field10795.field252) {
                            return;
                        }
                        var17 = (float) var12 * this.field10782 + (float) var11 * this.field10787 + (float) var47 * this.field10793 + this.field10779;
                        if (var17 <= (float) this.field10795.field252) {
                            return;
                        }
                        var18 = (float) var13 * this.field10782 + (float) var11 * this.field10787 + (float) var48 * this.field10793 + this.field10779;
                        if (var18 <= (float) this.field10795.field252) {
                            return;
                        }
                        var19 = (float) var13 * this.field10782 + (float) var10 * this.field10787 + (float) var49 * this.field10793 + this.field10779;
                        if (var19 <= (float) this.field10795.field252) {
                            return;
                        }
                        float var50 = (float) var12 * this.field10796 + (float) var10 * this.field10785 + (float) var46 * this.field10776 + this.field10792;
                        var23 = (int) ((float) this.field10795.field249 * var50 / var16) + arg2.field1817;
                        float var51 = (float) var12 * this.field10780 + (float) var10 * this.field10791 + (float) var46 * this.field10788 + this.field10790;
                        var25 = (int) ((float) this.field10795.field272 * var51 / var16) + arg2.field1818;
                        float var52 = (float) var12 * this.field10796 + (float) var11 * this.field10785 + (float) var47 * this.field10776 + this.field10792;
                        var27 = (int) ((float) this.field10795.field249 * var52 / var17) + arg2.field1817;
                        float var53 = (float) var12 * this.field10780 + (float) var11 * this.field10791 + (float) var47 * this.field10788 + this.field10790;
                        var29 = (int) ((float) this.field10795.field272 * var53 / var17) + arg2.field1818;
                        float var54 = (float) var13 * this.field10796 + (float) var11 * this.field10785 + (float) var48 * this.field10776 + this.field10792;
                        var31 = (int) ((float) this.field10795.field249 * var54 / var18) + arg2.field1817;
                        float var55 = (float) var13 * this.field10780 + (float) var11 * this.field10791 + (float) var48 * this.field10788 + this.field10790;
                        var33 = (int) ((float) this.field10795.field272 * var55 / var18) + arg2.field1818;
                        float var56 = (float) var13 * this.field10796 + (float) var10 * this.field10785 + (float) var49 * this.field10776 + this.field10792;
                        var35 = (int) ((float) this.field10795.field249 * var56 / var19) + arg2.field1817;
                        float var57 = (float) var13 * this.field10780 + (float) var10 * this.field10791 + (float) var49 * this.field10788 + this.field10790;
                        var37 = (int) ((float) this.field10795.field272 * var57 / var19) + arg2.field1818;
                    } else {
                        var16 = (float) var12 * this.field10782 + (float) var10 * this.field10787 + (float) var46 * this.field10793 + this.field10779;
                        var17 = (float) var12 * this.field10782 + (float) var11 * this.field10787 + (float) var47 * this.field10793 + this.field10779;
                        var18 = (float) var13 * this.field10782 + (float) var11 * this.field10787 + (float) var48 * this.field10793 + this.field10779;
                        var19 = (float) var13 * this.field10782 + (float) var10 * this.field10787 + (float) var49 * this.field10793 + this.field10779;
                        float var58 = (float) var12 * this.field10796 + (float) var10 * this.field10785 + (float) var46 * this.field10776 + this.field10792;
                        var23 = (int) ((float) this.field10795.field249 * var58 / (float) this.field10789) + arg2.field1817;
                        float var59 = (float) var12 * this.field10780 + (float) var10 * this.field10791 + (float) var46 * this.field10788 + this.field10790;
                        var25 = (int) ((float) this.field10795.field272 * var59 / (float) this.field10789) + arg2.field1818;
                        float var60 = (float) var12 * this.field10796 + (float) var11 * this.field10785 + (float) var47 * this.field10776 + this.field10792;
                        var27 = (int) ((float) this.field10795.field249 * var60 / (float) this.field10789) + arg2.field1817;
                        float var61 = (float) var12 * this.field10780 + (float) var11 * this.field10791 + (float) var47 * this.field10788 + this.field10790;
                        var29 = (int) ((float) this.field10795.field272 * var61 / (float) this.field10789) + arg2.field1818;
                        float var62 = (float) var13 * this.field10796 + (float) var11 * this.field10785 + (float) var48 * this.field10776 + this.field10792;
                        var31 = (int) ((float) this.field10795.field249 * var62 / (float) this.field10789) + arg2.field1817;
                        float var63 = (float) var13 * this.field10780 + (float) var11 * this.field10791 + (float) var48 * this.field10788 + this.field10790;
                        var33 = (int) ((float) this.field10795.field272 * var63 / (float) this.field10789) + arg2.field1818;
                        float var64 = (float) var13 * this.field10796 + (float) var10 * this.field10785 + (float) var49 * this.field10776 + this.field10792;
                        var35 = (int) ((float) this.field10795.field249 * var64 / (float) this.field10789) + arg2.field1817;
                        float var65 = (float) var13 * this.field10780 + (float) var10 * this.field10791 + (float) var49 * this.field10788 + this.field10790;
                        var37 = (int) ((float) this.field10795.field272 * var65 / (float) this.field10789) + arg2.field1818;
                    }
                }
                if (this.field10789 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field1824 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field1821 || var35 > arg2.field1821 || var27 > arg2.field1821;
                        if (var9.field779 >= 0) {
                            arg2.method948((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class372.field5346[var9.field776 & 65535] & 16777215, -16777216 | class372.field5346[var9.field780 & 65535] & 16777215, -16777216 | class372.field5346[var9.field777 & 65535] & 16777215, 0, 0, 0, 0, var9.field779);
                        } else {
                            arg2.method942((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field776 & 65535), (float) (var9.field780 & 65535), (float) (var9.field777 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field1824 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field1821 || var27 > arg2.field1821 || var35 > arg2.field1821;
                        if (var9.field779 >= 0) {
                            arg2.method948((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class372.field5346[var9.field774 & 65535] & 16777215, -16777216 | class372.field5346[var9.field777 & 65535] & 16777215, -16777216 | class372.field5346[var9.field780 & 65535] & 16777215, 0, 0, 0, 0, var9.field779);
                            return;
                        }
                        arg2.method942((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field774 & 65535), (float) (var9.field777 & 65535), (float) (var9.field780 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field1824 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field1821 || var35 > arg2.field1821 || var27 > arg2.field1821;
                        if (var9.field779 >= 0) {
                            arg2.method948((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class372.field5346[var9.field776 & 65535] & 16777215, -16777216 | class372.field5346[var9.field780 & 65535] & 16777215, -16777216 | class372.field5346[var9.field777 & 65535] & 16777215, 0, 0, 0, 0, var9.field779);
                        } else {
                            arg2.method942((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field776 & 65535), (float) (var9.field780 & 65535), (float) (var9.field777 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field1824 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field1821 || var27 > arg2.field1821 || var35 > arg2.field1821;
                        if (var9.field779 >= 0) {
                            arg2.method948((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class372.field5346[var9.field774 & 65535] & 16777215, -16777216 | class372.field5346[var9.field777 & 65535] & 16777215, -16777216 | class372.field5346[var9.field780 & 65535] & 16777215, 0, 0, 0, 0, var9.field779);
                            return;
                        }
                        arg2.method942((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field774 & 65535), (float) (var9.field777 & 65535), (float) (var9.field780 & 65535));
                    }
                }
            }
        } else {
            class541 var66 = this.field10786[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field7483 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field10789 == -1) {
                    for (int var67 = 0; var67 < var66.field7478; ++var67) {
                        int var68 = (arg0 << super.field5825) + var66.field7479[var67];
                        short var69 = var66.field7485[var67];
                        int var70 = (arg1 << super.field5825) + var66.field7486[var67];
                        float var71 = (float) var70 * this.field10782 + (float) var68 * this.field10787 + (float) var69 * this.field10793 + this.field10779;
                        if (var71 <= (float) this.field10795.field252) {
                            return;
                        }
                        float var72 = (float) var70 * this.field10796 + (float) var68 * this.field10785 + (float) var69 * this.field10776 + this.field10792;
                        float var73 = (float) var70 * this.field10780 + (float) var68 * this.field10791 + (float) var69 * this.field10788 + this.field10790;
                        arg3[var67] = (int) ((float) this.field10795.field249 * var72 / var71) + arg2.field1817;
                        arg4[var67] = (int) ((float) this.field10795.field272 * var73 / var71) + arg2.field1818;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field7478; ++var74) {
                        int var110 = (arg0 << super.field5825) + var66.field7479[var74];
                        short var111 = var66.field7485[var74];
                        int var112 = (arg1 << super.field5825) + var66.field7486[var74];
                        float var113 = (float) var112 * this.field10782 + (float) var110 * this.field10787 + (float) var111 * this.field10793 + this.field10779;
                        float var114 = (float) var112 * this.field10796 + (float) var110 * this.field10785 + (float) var111 * this.field10776 + this.field10792;
                        float var115 = (float) var112 * this.field10780 + (float) var110 * this.field10791 + (float) var111 * this.field10788 + this.field10790;
                        arg3[var74] = (int) ((float) this.field10795.field249 * var114 / (float) this.field10789) + arg2.field1817;
                        arg4[var74] = (int) ((float) this.field10795.field272 * var115 / (float) this.field10789) + arg2.field1818;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field7482 != null) {
                    if (this.field10789 == -1) {
                        for (int var75 = 0; var75 < var66.field7473; ++var75) {
                            short var76 = var66.field7477[var75];
                            short var77 = var66.field7476[var75];
                            short var78 = var66.field7480[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field1824 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field1821 || var80 > arg2.field1821 || var81 > arg2.field1821;
                                short var85 = var66.field7482[var75];
                                if (var85 != -1) {
                                    arg2.method948((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field7479[var76] / (float) super.field5818, (float) var66.field7479[var77] / (float) super.field5818, (float) var66.field7479[var78] / (float) super.field5818, (float) var66.field7486[var76] / (float) super.field5818, (float) var66.field7486[var77] / (float) super.field5818, (float) var66.field7486[var78] / (float) super.field5818, -16777216 | class372.field5346[var66.field7475[var76] & 65535] & 16777215, -16777216 | class372.field5346[var66.field7475[var77] & 65535] & 16777215, -16777216 | class372.field5346[var66.field7475[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field7481[var75];
                                    if (var86 != -1) {
                                        arg2.method942((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class341.method2164(var66.field7475[var76], 8191, var86), (float) class341.method2164(var66.field7475[var77], 8191, var86), (float) class341.method2164(var66.field7475[var78], 8191, var86));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field7473; ++var87) {
                        short var88 = var66.field7477[var87];
                        short var89 = var66.field7476[var87];
                        short var90 = var66.field7480[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field1824 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field1821 || var92 > arg2.field1821 || var93 > arg2.field1821;
                            short var97 = var66.field7482[var87];
                            if (var97 != -1) {
                                arg2.method948((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field7479[var88] / (float) super.field5818, (float) var66.field7479[var89] / (float) super.field5818, (float) var66.field7479[var90] / (float) super.field5818, (float) var66.field7486[var88] / (float) super.field5818, (float) var66.field7486[var89] / (float) super.field5818, (float) var66.field7486[var90] / (float) super.field5818, -16777216 | class372.field5346[var66.field7475[var88] & 65535] & 16777215, -16777216 | class372.field5346[var66.field7475[var89] & 65535] & 16777215, -16777216 | class372.field5346[var66.field7475[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field7481[var87];
                                if (var98 != -1) {
                                    arg2.method942((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class341.method2164(var66.field7475[var88], 8191, var98), (float) class341.method2164(var66.field7475[var89], 8191, var98), (float) class341.method2164(var66.field7475[var90], 8191, var98));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field7473; ++var99) {
                    short var100 = var66.field7477[var99];
                    short var101 = var66.field7476[var99];
                    short var102 = var66.field7480[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field7481[var99];
                        if (var109 != -1) {
                            arg2.field1824 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field1821 || var104 > arg2.field1821 || var105 > arg2.field1821;
                            arg2.method942((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class341.method2164(var66.field7475[var100], 8191, var109), (float) class341.method2164(var66.field7475[var101], 8191, var109), (float) class341.method2164(var66.field7475[var102], 8191, var109));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII[[ZLmp;Lhs;[I[I)V")
    private final void method4308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class563 arg8, class143 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7921;
        this.field10795.method211(false);
        arg9.field1814 = false;
        arg9.field1813 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field10777 != null) {
                        if (this.field10777[var18][var19] != null) {
                            class420 var20 = this.field10777[var18][var19];
                            if (var20.field5849 != -1 && (var20.field5842 & 2) == 0 && var20.field5843 == 0) {
                                int var21 = this.field10795.method219(var20.field5849);
                                arg9.method942((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class341.method2164(var20.field5847, 8191, var21), (float) class341.method2164(var20.field5845, 8191, var21), (float) class341.method2164(var20.field5852, 8191, var21));
                                arg9.method942((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class341.method2164(var20.field5851, 8191, var21), (float) class341.method2164(var20.field5852, 8191, var21), (float) class341.method2164(var20.field5845, 8191, var21));
                            } else if (var20.field5843 == 0) {
                                arg9.method943((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field5847, var20.field5845, var20.field5852);
                                arg9.method943((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field5851, var20.field5852, var20.field5845);
                            } else {
                                int var22 = var20.field5843;
                                arg9.method943((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class111.method806((byte) -124, var22, var20.field5847 & -16777216), class111.method806((byte) -124, var22, var20.field5845 & -16777216), class111.method806((byte) -124, var22, var20.field5852 & -16777216));
                                arg9.method943((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class111.method806((byte) -124, var22, var20.field5851 & -16777216), class111.method806((byte) -124, var22, var20.field5852 & -16777216), class111.method806((byte) -124, var22, var20.field5845 & -16777216));
                            }
                        } else if (this.field10794[var18][var19] != null) {
                            class155 var23 = this.field10794[var18][var19];
                            for (int var24 = 0; var24 < var23.field2019; ++var24) {
                                arg10[var24] = var23.field2024[var24] * var14 / super.field5818 + var16;
                                arg11[var24] = var17 - var23.field2018[var24] * var14 / super.field5818;
                            }
                            for (int var25 = 0; var25 < var23.field2021; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field2022 != null && var23.field2022[var25] != 0 && (var23.field2025 == null || var23.field2025 != null && var23.field2025[var25] == -1)) {
                                    int var35 = var23.field2022[var25];
                                    arg9.method943((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class111.method806((byte) -124, var35, -16777216 - (var23.field2020[var26] & -16777216)), class111.method806((byte) -124, var35, -16777216 - (var23.field2020[var27] & -16777216)), class111.method806((byte) -124, var35, -16777216 - (var23.field2020[var28] & -16777216)));
                                } else if (var23.field2025 != null && var23.field2025[var25] != -1) {
                                    int var36 = this.field10795.method219(var23.field2025[var25]);
                                    arg9.method942((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method943((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field2020[var26], var23.field2020[var27], var23.field2020[var28]);
                                }
                            }
                        }
                    } else if (this.field10781[var18][var19] != null) {
                        class711 var37 = this.field10781[var18][var19];
                        for (int var38 = 0; var38 < var37.field9843; ++var38) {
                            arg10[var38] = var37.field9837[var38] * var14 / super.field5818 + var16;
                            arg11[var38] = var17 - var37.field9844[var38] * var14 / super.field5818;
                        }
                        for (int var39 = 0; var39 < var37.field9842; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field9841 != null && var37.field9841[var39] != 0) {
                                int var49 = var37.field9841[var39];
                                arg9.method943((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method943((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field9847[var40], var37.field9847[var41], var37.field9847[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field1814 = true;
        this.field10795.method211(var15);
    }

    @OriginalMember(owner = "client!ph", name = "ka", descriptor = "(III)V")
    public final void method1376(int arg0, int arg1, int arg2) {
        if (this.field10784[arg0][arg1] < arg2) {
            this.field10784[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
    public final void method1368(int arg0, int arg1) {
        this.method4313(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)Z")
    private final boolean method4309(int arg0) {
        if ((this.field10775 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZLmp;Lhs;[I[I[I[II)V")
    private final void method4310(int arg0, int arg1, boolean arg2, class563 arg3, class143 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class420 var11 = this.field10777[arg0][arg1];
        if (var11 != null) {
            if ((var11.field5842 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field5842 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field5818 * arg0;
                int var13 = super.field5818 + var12;
                int var14 = super.field5818 * arg1;
                int var15 = super.field5818 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field5842 & 1) != 0 && !arg2) {
                    int var20 = super.field5823[arg0][arg1];
                    float var21 = (float) var20 * this.field10793;
                    if (this.field10789 == -1) {
                        var22 = (float) var14 * this.field10782 + (float) var12 * this.field10787 + var21 + this.field10779;
                        if (var22 <= (float) this.field10795.field252) {
                            return;
                        }
                        var23 = (float) var14 * this.field10782 + (float) var13 * this.field10787 + var21 + this.field10779;
                        if (var23 <= (float) this.field10795.field252) {
                            return;
                        }
                        var24 = (float) var15 * this.field10782 + (float) var13 * this.field10787 + var21 + this.field10779;
                        if (var24 <= (float) this.field10795.field252) {
                            return;
                        }
                        var25 = (float) var15 * this.field10782 + (float) var12 * this.field10787 + var21 + this.field10779;
                        if (var25 <= (float) this.field10795.field252) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field10782 + (float) var12 * this.field10787 + var21 + this.field10779;
                        var23 = (float) var14 * this.field10782 + (float) var13 * this.field10787 + var21 + this.field10779;
                        var24 = (float) var15 * this.field10782 + (float) var13 * this.field10787 + var21 + this.field10779;
                        var25 = (float) var15 * this.field10782 + (float) var12 * this.field10787 + var21 + this.field10779;
                    }
                    if (arg3.field7931) {
                        int var26 = (int) (var22 - (float) arg3.field7922);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7922);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7922);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7922);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field10776;
                    float var31 = (float) var20 * this.field10788;
                    if (this.field10789 == -1) {
                        float var32 = (float) var14 * this.field10796 + (float) var12 * this.field10785 + var30 + this.field10792;
                        var33 = (int) ((float) this.field10795.field249 * var32 / var22) + arg4.field1817;
                        float var34 = (float) var14 * this.field10780 + (float) var12 * this.field10791 + var31 + this.field10790;
                        var35 = (int) ((float) this.field10795.field272 * var34 / var22) + arg4.field1818;
                        float var36 = (float) var14 * this.field10796 + (float) var13 * this.field10785 + var30 + this.field10792;
                        var37 = (int) ((float) this.field10795.field249 * var36 / var23) + arg4.field1817;
                        float var38 = (float) var14 * this.field10780 + (float) var13 * this.field10791 + var31 + this.field10790;
                        var39 = (int) ((float) this.field10795.field272 * var38 / var23) + arg4.field1818;
                        float var40 = (float) var15 * this.field10796 + (float) var13 * this.field10785 + var30 + this.field10792;
                        var41 = (int) ((float) this.field10795.field249 * var40 / var24) + arg4.field1817;
                        float var42 = (float) var15 * this.field10780 + (float) var13 * this.field10791 + var31 + this.field10790;
                        var43 = (int) ((float) this.field10795.field272 * var42 / var24) + arg4.field1818;
                        float var44 = (float) var15 * this.field10796 + (float) var12 * this.field10785 + var30 + this.field10792;
                        var45 = (int) ((float) this.field10795.field249 * var44 / var25) + arg4.field1817;
                        float var46 = (float) var15 * this.field10780 + (float) var12 * this.field10791 + var31 + this.field10790;
                        var47 = (int) ((float) this.field10795.field272 * var46 / var25) + arg4.field1818;
                    } else {
                        float var48 = (float) var14 * this.field10796 + (float) var12 * this.field10785 + var30 + this.field10792;
                        var33 = (int) ((float) this.field10795.field249 * var48 / (float) this.field10789) + arg4.field1817;
                        float var49 = (float) var14 * this.field10780 + (float) var12 * this.field10791 + var31 + this.field10790;
                        var35 = (int) ((float) this.field10795.field272 * var49 / (float) this.field10789) + arg4.field1818;
                        float var50 = (float) var14 * this.field10796 + (float) var13 * this.field10785 + var30 + this.field10792;
                        var37 = (int) ((float) this.field10795.field249 * var50 / (float) this.field10789) + arg4.field1817;
                        float var51 = (float) var14 * this.field10780 + (float) var13 * this.field10791 + var31 + this.field10790;
                        var39 = (int) ((float) this.field10795.field272 * var51 / (float) this.field10789) + arg4.field1818;
                        float var52 = (float) var15 * this.field10796 + (float) var13 * this.field10785 + var30 + this.field10792;
                        var41 = (int) ((float) this.field10795.field249 * var52 / (float) this.field10789) + arg4.field1817;
                        float var53 = (float) var15 * this.field10780 + (float) var13 * this.field10791 + var31 + this.field10790;
                        var43 = (int) ((float) this.field10795.field272 * var53 / (float) this.field10789) + arg4.field1818;
                        float var54 = (float) var15 * this.field10796 + (float) var12 * this.field10785 + var30 + this.field10792;
                        var45 = (int) ((float) this.field10795.field249 * var54 / (float) this.field10789) + arg4.field1817;
                        float var55 = (float) var15 * this.field10780 + (float) var12 * this.field10791 + var31 + this.field10790;
                        var47 = (int) ((float) this.field10795.field272 * var55 / (float) this.field10789) + arg4.field1818;
                    }
                } else {
                    int var56 = super.field5823[arg0][arg1];
                    int var57 = super.field5823[arg0 + 1][arg1];
                    int var58 = super.field5823[arg0 + 1][arg1 + 1];
                    int var59 = super.field5823[arg0][arg1 + 1];
                    if (this.field10789 == -1) {
                        var22 = (float) var14 * this.field10782 + (float) var12 * this.field10787 + (float) var56 * this.field10793 + this.field10779;
                        if (var22 <= (float) this.field10795.field252) {
                            return;
                        }
                        var23 = (float) var14 * this.field10782 + (float) var13 * this.field10787 + (float) var57 * this.field10793 + this.field10779;
                        if (var23 <= (float) this.field10795.field252) {
                            return;
                        }
                        var24 = (float) var15 * this.field10782 + (float) var13 * this.field10787 + (float) var58 * this.field10793 + this.field10779;
                        if (var24 <= (float) this.field10795.field252) {
                            return;
                        }
                        var25 = (float) var15 * this.field10782 + (float) var12 * this.field10787 + (float) var59 * this.field10793 + this.field10779;
                        if (var25 <= (float) this.field10795.field252) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field10782 + (float) var12 * this.field10787 + (float) var56 * this.field10793 + this.field10779;
                        var23 = (float) var14 * this.field10782 + (float) var13 * this.field10787 + (float) var57 * this.field10793 + this.field10779;
                        var24 = (float) var15 * this.field10782 + (float) var13 * this.field10787 + (float) var58 * this.field10793 + this.field10779;
                        var25 = (float) var15 * this.field10782 + (float) var12 * this.field10787 + (float) var59 * this.field10793 + this.field10779;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7922);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field5846 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7922);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field5848 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7922);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field5844 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7922);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field5850 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7931) {
                        int var68 = (int) (var22 - (float) arg3.field7922);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7922);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7922);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7922);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field10789 == -1) {
                        float var72 = (float) var14 * this.field10796 + (float) var12 * this.field10785 + (float) var56 * this.field10776 + this.field10792;
                        var33 = (int) ((float) this.field10795.field249 * var72 / var22) + arg4.field1817;
                        float var73 = (float) var14 * this.field10780 + (float) var12 * this.field10791 + (float) var56 * this.field10788 + this.field10790;
                        var35 = (int) ((float) this.field10795.field272 * var73 / var22) + arg4.field1818;
                        float var74 = (float) var14 * this.field10796 + (float) var13 * this.field10785 + (float) var57 * this.field10776 + this.field10792;
                        var37 = (int) ((float) this.field10795.field249 * var74 / var23) + arg4.field1817;
                        float var75 = (float) var14 * this.field10780 + (float) var13 * this.field10791 + (float) var57 * this.field10788 + this.field10790;
                        var39 = (int) ((float) this.field10795.field272 * var75 / var23) + arg4.field1818;
                        float var76 = (float) var15 * this.field10796 + (float) var13 * this.field10785 + (float) var58 * this.field10776 + this.field10792;
                        var41 = (int) ((float) this.field10795.field249 * var76 / var24) + arg4.field1817;
                        float var77 = (float) var15 * this.field10780 + (float) var13 * this.field10791 + (float) var58 * this.field10788 + this.field10790;
                        var43 = (int) ((float) this.field10795.field272 * var77 / var24) + arg4.field1818;
                        float var78 = (float) var15 * this.field10796 + (float) var12 * this.field10785 + (float) var59 * this.field10776 + this.field10792;
                        var45 = (int) ((float) this.field10795.field249 * var78 / var25) + arg4.field1817;
                        float var79 = (float) var15 * this.field10780 + (float) var12 * this.field10791 + (float) var59 * this.field10788 + this.field10790;
                        var47 = (int) ((float) this.field10795.field272 * var79 / var25) + arg4.field1818;
                    } else {
                        float var80 = (float) var14 * this.field10796 + (float) var12 * this.field10785 + (float) var56 * this.field10776 + this.field10792;
                        var33 = (int) ((float) this.field10795.field249 * var80 / (float) this.field10789) + arg4.field1817;
                        float var81 = (float) var14 * this.field10780 + (float) var12 * this.field10791 + (float) var56 * this.field10788 + this.field10790;
                        var35 = (int) ((float) this.field10795.field272 * var81 / (float) this.field10789) + arg4.field1818;
                        float var82 = (float) var14 * this.field10796 + (float) var13 * this.field10785 + (float) var57 * this.field10776 + this.field10792;
                        var37 = (int) ((float) this.field10795.field249 * var82 / (float) this.field10789) + arg4.field1817;
                        float var83 = (float) var14 * this.field10780 + (float) var13 * this.field10791 + (float) var57 * this.field10788 + this.field10790;
                        var39 = (int) ((float) this.field10795.field272 * var83 / (float) this.field10789) + arg4.field1818;
                        float var84 = (float) var15 * this.field10796 + (float) var13 * this.field10785 + (float) var58 * this.field10776 + this.field10792;
                        var41 = (int) ((float) this.field10795.field249 * var84 / (float) this.field10789) + arg4.field1817;
                        float var85 = (float) var15 * this.field10780 + (float) var13 * this.field10791 + (float) var58 * this.field10788 + this.field10790;
                        var43 = (int) ((float) this.field10795.field272 * var85 / (float) this.field10789) + arg4.field1818;
                        float var86 = (float) var15 * this.field10796 + (float) var12 * this.field10785 + (float) var59 * this.field10776 + this.field10792;
                        var45 = (int) ((float) this.field10795.field249 * var86 / (float) this.field10789) + arg4.field1817;
                        float var87 = (float) var15 * this.field10780 + (float) var12 * this.field10791 + (float) var59 * this.field10788 + this.field10790;
                        var47 = (int) ((float) this.field10795.field272 * var87 / (float) this.field10789) + arg4.field1818;
                    }
                }
                boolean var88 = var11.field5849 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var11.field5849).field10273);
                if (this.field10789 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field1824 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field1821 || var45 > arg4.field1821 || var37 > arg4.field1821;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field5849 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method948((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field5847 & 16777215, var90 | var11.field5845 & 16777215, var90 | var11.field5852 & 16777215, arg3.field7923, var18, var19, var17, var11.field5849);
                                } else {
                                    if (var88) {
                                        arg4.field1827 = 100;
                                    }
                                    arg4.method943((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class111.method806((byte) -124, var11.field5847, var18 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5845, var19 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5852, var17 << 24 | arg3.field7923));
                                    arg4.field1827 = 0;
                                }
                            } else if (var11.field5849 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method948((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field5847 & 16777215, var91 | var11.field5845 & 16777215, var91 | var11.field5852 & 16777215, 0, 0, 0, 0, var11.field5849);
                            } else {
                                if (var88) {
                                    arg4.field1827 = 100;
                                }
                                arg4.method943((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field5847, var11.field5845, var11.field5852);
                                arg4.field1827 = 0;
                            }
                        } else {
                            arg4.method953((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7923);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field1824 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field1821 || var37 > arg4.field1821 || var45 > arg4.field1821;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field1827 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field5849 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method948((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field5851 & 16777215, var93 | var11.field5852 & 16777215, var93 | var11.field5845 & 16777215, arg3.field7923, var16, var17, var19, var11.field5849);
                                    return;
                                }
                                if (var88) {
                                    arg4.field1827 = 100;
                                }
                                arg4.method943((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class111.method806((byte) -124, var11.field5851, var16 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5852, var17 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5845, var19 << 24 | arg3.field7923));
                                arg4.field1827 = 0;
                                return;
                            }
                            if (var11.field5849 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method948((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field5851 & 16777215, var94 | var11.field5852 & 16777215, var94 | var11.field5845 & 16777215, 0, 0, 0, 0, var11.field5849);
                                return;
                            }
                            if (var88) {
                                arg4.field1827 = 100;
                            }
                            arg4.method943((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field5851, var11.field5852, var11.field5845);
                            arg4.field1827 = 0;
                            return;
                        }
                        arg4.method953((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7923);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field1824 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field1821 || var45 > arg4.field1821 || var37 > arg4.field1821;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field1827 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field5849 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method948((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field5847 & 16777215, var96 | var11.field5845 & 16777215, var96 | var11.field5852 & 16777215, arg3.field7923, var18, var19, var17, var11.field5849);
                                } else {
                                    if (var88) {
                                        arg4.field1827 = 100;
                                    }
                                    arg4.method943((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class111.method806((byte) -124, var11.field5847, var18 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5845, var19 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5852, var17 << 24 | arg3.field7923));
                                    arg4.field1827 = 0;
                                }
                            } else if (var11.field5849 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method948((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field5847 & 16777215, var97 | var11.field5845 & 16777215, var97 | var11.field5852 & 16777215, 0, 0, 0, 0, var11.field5849);
                            } else {
                                if (var88) {
                                    arg4.field1827 = 100;
                                }
                                arg4.method943((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field5847, var11.field5845, var11.field5852);
                                arg4.field1827 = 0;
                            }
                        } else {
                            arg4.method953((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7923);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field1824 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field1821 || var37 > arg4.field1821 || var45 > arg4.field1821;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field1827 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field5849 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method948((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field5851 & 16777215, var99 | var11.field5852 & 16777215, var99 | var11.field5845 & 16777215, arg3.field7923, var16, var17, var19, var11.field5849);
                                    return;
                                }
                                if (var88) {
                                    arg4.field1827 = 100;
                                }
                                arg4.method943((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class111.method806((byte) -124, var11.field5851, var16 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5852, var17 << 24 | arg3.field7923), class111.method806((byte) -124, var11.field5845, var19 << 24 | arg3.field7923));
                                arg4.field1827 = 0;
                                return;
                            }
                            if (var11.field5849 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method948((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field5851 & 16777215, var100 | var11.field5852 & 16777215, var100 | var11.field5845 & 16777215, 0, 0, 0, 0, var11.field5849);
                                return;
                            }
                            if (var88) {
                                arg4.field1827 = 100;
                            }
                            arg4.method943((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field5851, var11.field5852, var11.field5845);
                            arg4.field1827 = 0;
                            return;
                        }
                        arg4.method953((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7923);
                    }
                }
            }
        } else {
            class155 var101 = this.field10794[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field2027 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field10789 == -1) {
                    for (int var102 = 0; var102 < var101.field2019; ++var102) {
                        int var103 = (arg0 << super.field5825) + var101.field2024[var102];
                        int var104 = var101.field2023[var102];
                        int var105 = (arg1 << super.field5825) + var101.field2018[var102];
                        float var106 = (float) var105 * this.field10782 + (float) var103 * this.field10787 + (float) var104 * this.field10793 + this.field10779;
                        if (var106 <= (float) this.field10795.field252) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7922);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field2028[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7931) {
                            int var109 = (int) (var106 - (float) arg3.field7922);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field10796 + (float) var103 * this.field10785 + (float) var104 * this.field10776 + this.field10792;
                        float var111 = (float) var105 * this.field10780 + (float) var103 * this.field10791 + (float) var104 * this.field10788 + this.field10790;
                        arg5[var102] = (int) ((float) this.field10795.field249 * var110 / var106) + arg4.field1817;
                        arg6[var102] = (int) ((float) this.field10795.field272 * var111 / var106) + arg4.field1818;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field2019; ++var112) {
                        int var152 = (arg0 << super.field5825) + var101.field2024[var112];
                        int var153 = var101.field2023[var112];
                        int var154 = (arg1 << super.field5825) + var101.field2018[var112];
                        float var155 = (float) var154 * this.field10782 + (float) var152 * this.field10787 + (float) var153 * this.field10793 + this.field10779;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field10789 - arg3.field7922;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field2028[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7931) {
                            int var158 = this.field10789 - arg3.field7922;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field10796 + (float) var152 * this.field10785 + (float) var153 * this.field10776 + this.field10792;
                        float var160 = (float) var154 * this.field10780 + (float) var152 * this.field10791 + (float) var153 * this.field10788 + this.field10790;
                        arg5[var112] = (int) ((float) this.field10795.field249 * var159 / (float) this.field10789) + arg4.field1817;
                        arg6[var112] = (int) ((float) this.field10795.field272 * var160 / (float) this.field10789) + arg4.field1818;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field2025 != null) {
                    if (this.field10789 == -1) {
                        for (int var113 = 0; var113 < var101.field2021; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field1824 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field1821 || var118 > arg4.field1821 || var119 > arg4.field1821;
                                short var124 = var101.field2025[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var124).field10273)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method948((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field2024[var114] / (float) super.field5818, (float) var101.field2024[var115] / (float) super.field5818, (float) var101.field2024[var116] / (float) super.field5818, (float) var101.field2018[var114] / (float) super.field5818, (float) var101.field2018[var115] / (float) super.field5818, (float) var101.field2018[var116] / (float) super.field5818, var125 | var101.field2020[var114] & 16777215, var125 | var101.field2020[var115] & 16777215, var125 | var101.field2020[var116] & 16777215, arg3.field7923, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field2020[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var124).field10273)) {
                                                arg4.field1827 = -1694498816;
                                            }
                                            arg4.method943((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class111.method806((byte) -124, var101.field2020[var114], arg8[var114] << 24 | arg3.field7923), class111.method806((byte) -124, var101.field2020[var115], arg8[var115] << 24 | arg3.field7923), class111.method806((byte) -124, var101.field2020[var116], arg8[var116] << 24 | arg3.field7923));
                                            arg4.field1827 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var124).field10273)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method948((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field2024[var114] / (float) super.field5818, (float) var101.field2024[var115] / (float) super.field5818, (float) var101.field2024[var116] / (float) super.field5818, (float) var101.field2018[var114] / (float) super.field5818, (float) var101.field2018[var115] / (float) super.field5818, (float) var101.field2018[var116] / (float) super.field5818, var126 | var101.field2020[var114] & 16777215, var126 | var101.field2020[var115] & 16777215, var126 | var101.field2020[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field2020[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var124).field10273)) {
                                            arg4.field1827 = -1694498816;
                                        }
                                        arg4.method943((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field2020[var114], var101.field2020[var115], var101.field2020[var116]);
                                        arg4.field1827 = 0;
                                    }
                                } else {
                                    arg4.method953((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7923);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field2021; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field1824 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field1821 || var132 > arg4.field1821 || var133 > arg4.field1821;
                            short var138 = var101.field2025[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var138).field10273)) {
                                    arg4.field1827 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var138).field10273)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method948((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field2024[var128] / (float) super.field5818, (float) var101.field2024[var129] / (float) super.field5818, (float) var101.field2024[var130] / (float) super.field5818, (float) var101.field2018[var128] / (float) super.field5818, (float) var101.field2018[var129] / (float) super.field5818, (float) var101.field2018[var130] / (float) super.field5818, var139 | var101.field2020[var128] & 16777215, var139 | var101.field2020[var129] & 16777215, var139 | var101.field2020[var130] & 16777215, arg3.field7923, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field2020[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var138).field10273)) {
                                            arg4.field1827 = -1694498816;
                                        }
                                        arg4.method943((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class111.method806((byte) -124, var101.field2020[var128], arg8[var128] << 24 | arg3.field7923), class111.method806((byte) -124, var101.field2020[var129], arg8[var129] << 24 | arg3.field7923), class111.method806((byte) -124, var101.field2020[var130], arg8[var130] << 24 | arg3.field7923));
                                        arg4.field1827 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var138).field10273)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method948((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field2024[var128] / (float) super.field5818, (float) var101.field2024[var129] / (float) super.field5818, (float) var101.field2024[var130] / (float) super.field5818, (float) var101.field2018[var128] / (float) super.field5818, (float) var101.field2018[var129] / (float) super.field5818, (float) var101.field2018[var130] / (float) super.field5818, var140 | var101.field2020[var128] & 16777215, var140 | var101.field2020[var129] & 16777215, var140 | var101.field2020[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field2020[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method4309(this.field10795.field6556.method581(-21732, var138).field10273)) {
                                        arg4.field1827 = -1694498816;
                                    }
                                    arg4.method943((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field2020[var128], var101.field2020[var129], var101.field2020[var130]);
                                    arg4.field1827 = 0;
                                }
                                arg4.field1827 = 0;
                            } else {
                                arg4.method953((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7923);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field2021; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field1824 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field1821 || var146 > arg4.field1821 || var147 > arg4.field1821;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field2020[var142] & 16777215) != 0) {
                                    arg4.method943((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class449.method2716(var101.field2020[var142], arg3.field7923, 120, arg8[var142]), class449.method2716(var101.field2020[var143], arg3.field7923, 113, arg8[var143]), class449.method2716(var101.field2020[var144], arg3.field7923, 124, arg8[var144]));
                                }
                            } else if ((var101.field2020[var142] & 16777215) != 0) {
                                arg4.method943((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field2020[var142], var101.field2020[var143], var101.field2020[var144]);
                            }
                        } else {
                            arg4.method953((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7923);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "fa", descriptor = "(IILr;)Lr;")
    public final class113 method1367(int arg0, int arg1, class113 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1371(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field10775 & 32) == 0;
        if (this.field10777 == null && !var15) {
            this.field10777 = new class420[super.field5827][super.field5826];
            this.field10794 = new class155[super.field5827][super.field5826];
        } else if (this.field10781 == null && var15) {
            this.field10781 = new class711[super.field5827][super.field5826];
        } else if (this.field10783 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class372.field5346[class357.method2236(arg6[var16], (byte) 36) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class372.field5346[class357.method2236(arg7[var17], (byte) 127) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class711 var18 = new class711();
                var18.field9843 = (short) arg2.length;
                var18.field9842 = (short) (arg2.length / 3);
                var18.field9837 = new short[var18.field9843];
                var18.field9840 = new short[var18.field9843];
                var18.field9844 = new short[var18.field9843];
                var18.field9847 = new int[var18.field9843];
                var18.field9838 = new short[var18.field9843];
                var18.field9846 = new short[var18.field9843];
                var18.field9845 = new byte[var18.field9843];
                if (arg5 != null) {
                    var18.field9839 = new short[var18.field9843];
                }
                for (int var19 = 0; var19 < var18.field9843; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field10778[arg0][arg1] - this.field10784[arg0][arg1];
                    } else if (var22 == 0 && super.field5818 == var23) {
                        var25 = this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1];
                    } else if (super.field5818 == var22 && super.field5818 == var23) {
                        var25 = this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1];
                    } else if (super.field5818 == var22 && var23 == 0) {
                        var25 = this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]) * var22 + (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]) * (super.field5818 - var22);
                        int var27 = (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]) * var22 + (this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]) * (super.field5818 - var22);
                        var25 = (super.field5818 - var23) * var26 + var23 * var27 >> super.field5825 * 2;
                    }
                    int var28 = (arg0 << super.field5825) + var22;
                    int var29 = (arg1 << super.field5825) + var23;
                    var18.field9837[var19] = (short) var22;
                    var18.field9844[var19] = (short) var23;
                    var18.field9840[var19] = (short) (this.method2529(var29, var28, (byte) -128) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field9847[var19] = 0;
                        if (arg7 != null) {
                            var18.field9845[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field9839[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method4309(this.field10795.field6556.method581(-21732, arg8[var19]).field10273)) {
                            var32 = -1694498816;
                        }
                        var18.field9847[var19] = var32 | class449.method2716(method4314(arg6[var19] >> 8, var25), arg10, 121, var30);
                        if (arg7 != null) {
                            var18.field9845[var19] = (byte) var25;
                        }
                    }
                    var18.field9838[var19] = (short) arg8[var19];
                    var18.field9846[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field9841 = new int[var18.field9842];
                }
                for (int var20 = 0; var20 < var18.field9842; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field9841[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field10781[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field5818 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field5818 && arg4[var38] == super.field5818) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field5818) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field5818 != arg2[var40] && arg2[0] - super.field5818 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field5818 != arg4[var40] && arg4[0] - super.field5818 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class420 var41 = new class420();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field5843 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field5842 = (byte) (var41.field5842 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field5823[arg0 + 1][arg1] == super.field5823[arg0][arg1] && super.field5823[arg0 + 1][arg1 + 1] == super.field5823[arg0][arg1] && super.field5823[arg0][arg1 + 1] == super.field5823[arg0][arg1]) {
                        var41.field5842 = (byte) (var41.field5842 | 1);
                    }
                    if (var43 != -1 && (var41.field5842 & 2) == 0 && !this.field10795.field6556.method581(-21732, var43).field10264) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field5851 = class449.method2716(method4314(arg6[var34] >> 8, this.field10778[arg0][arg1] - this.field10784[arg0][arg1]), arg10, 116, var44);
                        if (var41.field5843 != 0) {
                            var41.field5851 |= 255 - (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field5852 = class449.method2716(method4314(arg6[var35] >> 8, this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]), arg10, -45, var45);
                        if (var41.field5843 != 0) {
                            var41.field5852 |= 255 - (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field5847 = class449.method2716(method4314(arg6[var36] >> 8, this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]), arg10, -89, var46);
                        if (var41.field5843 != 0) {
                            var41.field5847 |= 255 - (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field5845 = class449.method2716(method4314(arg6[var37] >> 8, this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]), arg10, -38, var47);
                        var41.field5849 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field5851 = class449.method2716(method4314(arg6[var34] >> 8, this.field10778[arg0][arg1] - this.field10784[arg0][arg1]), arg10, -5, var48);
                        if (var41.field5843 != 0) {
                            var41.field5851 |= 255 - (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field5852 = class449.method2716(method4314(arg6[var35] >> 8, this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]), arg10, -116, var49);
                        if (var41.field5843 != 0) {
                            var41.field5852 |= 255 - (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field5847 = class449.method2716(method4314(arg6[var36] >> 8, this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]), arg10, -71, var50);
                        if (var41.field5843 != 0) {
                            var41.field5847 |= 255 - (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field5845 = class449.method2716(method4314(arg6[var37] >> 8, this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]), arg10, -76, var51);
                        if (var41.field5843 != 0) {
                            var41.field5845 |= 255 - (this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]) << 25;
                        }
                        var41.field5849 = -1;
                    }
                    if (arg5 != null) {
                        var41.field5844 = (short) arg5[var36];
                        var41.field5850 = (short) arg5[var37];
                        var41.field5848 = (short) arg5[var35];
                        var41.field5846 = (short) arg5[var34];
                    }
                    this.field10777[arg0][arg1] = var41;
                } else {
                    class155 var52 = new class155();
                    var52.field2019 = (short) arg2.length;
                    var52.field2021 = (short) (arg2.length / 3);
                    var52.field2024 = new short[var52.field2019];
                    var52.field2023 = new short[var52.field2019];
                    var52.field2018 = new short[var52.field2019];
                    var52.field2020 = new int[var52.field2019];
                    if (arg5 != null) {
                        var52.field2028 = new short[var52.field2019];
                    }
                    for (int var53 = 0; var53 < var52.field2019; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field10778[arg0][arg1] - this.field10784[arg0][arg1];
                        } else if (var68 == 0 && super.field5818 == var69) {
                            var71 = this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1];
                        } else if (super.field5818 == var68 && super.field5818 == var69) {
                            var71 = this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1];
                        } else if (super.field5818 == var68 && var69 == 0) {
                            var71 = this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field10778[arg0 + 1][arg1] - this.field10784[arg0 + 1][arg1]) * var68 + (this.field10778[arg0][arg1] - this.field10784[arg0][arg1]) * (super.field5818 - var68);
                            int var73 = (this.field10778[arg0 + 1][arg1 + 1] - this.field10784[arg0 + 1][arg1 + 1]) * var68 + (this.field10778[arg0][arg1 + 1] - this.field10784[arg0][arg1 + 1]) * (super.field5818 - var68);
                            var71 = (super.field5818 - var69) * var72 + var69 * var73 >> super.field5825 * 2;
                        }
                        int var74 = (arg0 << super.field5825) + var68;
                        int var75 = (arg1 << super.field5825) + var69;
                        var52.field2024[var53] = (short) var68;
                        var52.field2018[var53] = (short) var69;
                        var52.field2023[var53] = (short) (this.method2529(var75, var74, (byte) -128) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field2020[var53] = var71 << 25;
                            } else {
                                var52.field2020[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field2028[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field2020[var53] = class449.method2716(method4314(arg6[var53] >> 8, var71), arg10, 118, var76);
                            if (arg7 != null) {
                                var52.field2020[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field2021; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field10795.field6556.method581(-21732, arg8[var55 * 3]).field10264) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field2022 = new int[var52.field2021];
                    }
                    if (var54) {
                        var52.field2025 = new short[var52.field2021];
                        var52.field2026 = new short[var52.field2021];
                    }
                    for (int var56 = 0; var56 < var52.field2021; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field2022[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field10795.field6556.method581(-21732, var62).field10264) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field10795.field6556.method581(-21732, var63).field10264) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field10795.field6556.method581(-21732, var64).field10264) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field2025[var56] = (short) var64;
                                var52.field2026[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field10795.field6556.method581(-21732, var65).field10264) {
                                        var52.field2020[var57] = class372.field5346[class357.method2236(this.field10795.field6556.method581(-21732, var65).field10266 & 65535, (byte) -128) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field10795.field6556.method581(-21732, var66).field10264) {
                                        var52.field2020[var58] = class372.field5346[class357.method2236(this.field10795.field6556.method581(-21732, var66).field10266 & 65535, (byte) -126) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field10795.field6556.method581(-21732, var67).field10264) {
                                        var52.field2020[var59] = class372.field5346[class357.method2236(this.field10795.field6556.method581(-21732, var67).field10266 & 65535, (byte) -127) & 65535];
                                    }
                                }
                                var52.field2025[var56] = -1;
                            }
                        }
                    }
                    this.field10794[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lnia;IIII[[I[[II)V")
    public class786(class30 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field10795 = arg0;
        this.field10775 = arg2;
        this.field10778 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field10795.field251 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field10795.field284 * var18 + this.field10795.field269 * var16 + this.field10795.field265 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field10778[var11][var10] = (byte) var20;
            }
        }
        this.field10784 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ph", name = "YA", descriptor = "()V")
    public final void method1369() {
        this.field10778 = null;
        this.field10784 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1374(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class737 var7 = this.field10795.field253;
        this.field10789 = -1;
        this.field10785 = var7.field10149;
        this.field10776 = var7.field10147;
        this.field10796 = var7.field10143;
        this.field10792 = var7.field10148;
        this.field10791 = var7.field10153;
        this.field10788 = var7.field10163;
        this.field10780 = var7.field10159;
        this.field10790 = var7.field10164;
        this.field10787 = var7.field10140;
        this.field10793 = var7.field10146;
        this.field10782 = var7.field10144;
        this.field10779 = var7.field10152;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field5827 && var11 >= 0 && var11 < super.field5826) {
                        this.method4313(var10, var11, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIZLmp;Lhs;[I[I[I[II)V")
    private final void method4311(int arg0, int arg1, boolean arg2, class563 arg3, class143 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class711 var11 = this.field10781[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field10789 == -1) {
                    for (int var12 = 0; var12 < var11.field9843; ++var12) {
                        int var13 = (arg0 << super.field5825) + var11.field9837[var12];
                        int var14 = var11.field9840[var12];
                        int var15 = (arg1 << super.field5825) + var11.field9844[var12];
                        float var16 = (float) var15 * this.field10782 + (float) var13 * this.field10787 + (float) var14 * this.field10793 + this.field10779;
                        if (var16 <= (float) this.field10795.field252) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7922);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field9839[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7931) {
                            int var19 = (int) (var16 - (float) arg3.field7922);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field10796 + (float) var13 * this.field10785 + (float) var14 * this.field10776 + this.field10792;
                        float var21 = (float) var15 * this.field10780 + (float) var13 * this.field10791 + (float) var14 * this.field10788 + this.field10790;
                        arg5[var12] = (int) ((float) this.field10795.field249 * var20 / var16) + arg4.field1817;
                        arg6[var12] = (int) ((float) this.field10795.field272 * var21 / var16) + arg4.field1818;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field9843; ++var22) {
                        int var36 = (arg0 << super.field5825) + var11.field9837[var22];
                        int var37 = var11.field9840[var22];
                        int var38 = (arg1 << super.field5825) + var11.field9844[var22];
                        float var39 = (float) var38 * this.field10782 + (float) var36 * this.field10787 + (float) var37 * this.field10793 + this.field10779;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field10789 - arg3.field7922;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field9839[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7931) {
                            int var42 = this.field10789 - arg3.field7922;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field10796 + (float) var36 * this.field10785 + (float) var37 * this.field10776 + this.field10792;
                        float var44 = (float) var38 * this.field10780 + (float) var36 * this.field10791 + (float) var37 * this.field10788 + this.field10790;
                        arg5[var22] = (int) ((float) this.field10795.field249 * var43 / (float) this.field10789) + arg4.field1817;
                        arg6[var22] = (int) ((float) this.field10795.field272 * var44 / (float) this.field10789) + arg4.field1818;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field5818;
                for (int var24 = 0; var24 < var11.field9842; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field1824 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field1821 || var29 > arg4.field1821 || var30 > arg4.field1821;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field5825;
                            int var35 = arg1 << super.field5825;
                            if ((var11.field9847[var25] & 16777215) != 0) {
                                if (var11.field9838[var25] == var11.field9838[var26] && var11.field9838[var25] == var11.field9838[var27] && var11.field9846[var25] == var11.field9846[var26] && var11.field9846[var25] == var11.field9846[var27]) {
                                    arg4.method948((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9837[var25] + var34) / (float) var11.field9846[var25], (float) (var11.field9837[var26] + var34) / (float) var11.field9846[var26], (float) (var11.field9837[var27] + var34) / (float) var11.field9846[var27], (float) (var11.field9844[var25] + var35) / (float) var11.field9846[var25], (float) (var11.field9844[var26] + var35) / (float) var11.field9846[var26], (float) (var11.field9844[var27] + var35) / (float) var11.field9846[var27], var11.field9847[var25], var11.field9847[var26], var11.field9847[var27], arg3.field7923, arg8[var25], arg8[var26], arg8[var27], var11.field9838[var25]);
                                } else {
                                    arg4.method954((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9837[var25] + var34) / var23, (float) (var11.field9837[var26] + var34) / var23, (float) (var11.field9837[var27] + var34) / var23, (float) (var11.field9844[var25] + var35) / var23, (float) (var11.field9844[var26] + var35) / var23, (float) (var11.field9844[var27] + var35) / var23, var11.field9847[var25], var11.field9847[var26], var11.field9847[var27], arg3.field7923, arg8[var25], arg8[var26], arg8[var27], var11.field9838[var25], var23 / (float) var11.field9846[var25], var11.field9838[var26], var23 / (float) var11.field9846[var26], var11.field9838[var27], var23 / (float) var11.field9846[var27]);
                                }
                            }
                        } else {
                            arg4.method953((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7923);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIIIIII[[ZLmp;Lhs;[I[I)V")
    private final void method4312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class563 arg8, class143 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7921;
        this.field10795.method211(false);
        arg9.field1814 = false;
        arg9.field1813 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field10783[var18][var19] != null) {
                        class71 var20 = this.field10783[var18][var19];
                        if (var20.field779 != -1 && (var20.field778 & 2) == 0 && var20.field775 == -1) {
                            int var21 = this.field10795.method219(var20.field779);
                            arg9.method942((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class341.method2164(var20.field776 & 65535, 8191, var21), (float) class341.method2164(var20.field780 & 65535, 8191, var21), (float) class341.method2164(var20.field777 & 65535, 8191, var21));
                            arg9.method942((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class341.method2164(var20.field774 & 65535, 8191, var21), (float) class341.method2164(var20.field777 & 65535, 8191, var21), (float) class341.method2164(var20.field780 & 65535, 8191, var21));
                        } else if (var20.field775 == -1) {
                            arg9.method942((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field776 & 65535), (float) (var20.field780 & 65535), (float) (var20.field777 & 65535));
                            arg9.method942((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field774 & 65535), (float) (var20.field777 & 65535), (float) (var20.field780 & 65535));
                        } else {
                            int var22 = var20.field775;
                            arg9.method942((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method942((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field10786[var18][var19] != null) {
                        class541 var23 = this.field10786[var18][var19];
                        for (int var24 = 0; var24 < var23.field7478; ++var24) {
                            arg10[var24] = var23.field7479[var24] * var14 / super.field5818 + var16;
                            arg11[var24] = var17 - var23.field7486[var24] * var14 / super.field5818;
                        }
                        for (int var25 = 0; var25 < var23.field7473; ++var25) {
                            short var26 = var23.field7477[var25];
                            short var27 = var23.field7476[var25];
                            short var28 = var23.field7480[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field7474 != null && var23.field7474[var25] != -1) {
                                int var35 = var23.field7474[var25];
                                arg9.method942((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class341.method2164(var23.field7475[var26], 8191, var35), (float) class341.method2164(var23.field7475[var27], 8191, var35), (float) class341.method2164(var23.field7475[var28], 8191, var35));
                            } else if (var23.field7482 != null && var23.field7482[var25] != -1) {
                                int var36 = this.field10795.method219(var23.field7482[var25]);
                                arg9.method942((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class341.method2164(var23.field7475[var26], 8191, var36), (float) class341.method2164(var23.field7475[var27], 8191, var36), (float) class341.method2164(var23.field7475[var28], 8191, var36));
                            } else {
                                int var37 = var23.field7481[var25];
                                arg9.method942((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class341.method2164(var23.field7475[var26], 8191, var37), (float) class341.method2164(var23.field7475[var27], 8191, var37), (float) class341.method2164(var23.field7475[var28], 8191, var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field1814 = true;
        this.field10795.method211(var15);
    }

    @OriginalMember(owner = "client!ph", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1364(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    private final void method4313(int arg0, int arg1, int arg2) {
        class563 var4 = this.field10795.method256(Thread.currentThread());
        var4.field7960.field1827 = 0;
        if (this.field10777 != null) {
            this.method4310(arg0, arg1, var4.field7936, var4, var4.field7960, var4.field7957, var4.field7961, var4.field7968, var4.field7969, arg2);
        } else if (this.field10783 != null) {
            this.method4307(arg0, arg1, var4.field7960, var4.field7957, var4.field7961, var4.field7968, var4.field7969, arg2);
        } else {
            if (this.field10781 != null) {
                this.method4311(arg0, arg1, var4.field7936, var4, var4.field7960, var4.field7957, var4.field7961, var4.field7968, var4.field7969, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1373(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class737 var8 = this.field10795.field253;
        this.field10789 = arg5;
        this.field10785 = var8.field10149;
        this.field10776 = var8.field10147;
        this.field10796 = var8.field10143;
        this.field10792 = var8.field10148;
        this.field10791 = var8.field10153;
        this.field10788 = var8.field10163;
        this.field10780 = var8.field10159;
        this.field10790 = var8.field10164;
        this.field10787 = var8.field10140;
        this.field10793 = var8.field10146;
        this.field10782 = var8.field10144;
        this.field10779 = var8.field10152;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field5827 && var12 >= 0 && var12 < super.field5826) {
                        this.method4313(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class563 var9 = this.field10795.method256(Thread.currentThread());
        class143 var10 = var9.field7960;
        var10.field1827 = 0;
        var10.field1824 = true;
        this.field10795.method226();
        if (this.field10777 == null && this.field10781 == null) {
            if (this.field10783 != null) {
                this.method4312(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7957, var9.field7961);
            }
        } else {
            this.method4308(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7957, var9.field7961);
        }
    }

    @OriginalMember(owner = "client!ph", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1370(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1365(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
    private static final int method4314(int arg0, int arg1) {
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
}
