import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class460 extends class142 {

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field6754 = -1;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Lcv;")
    private class399 field6755;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    private int field6746;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[[I")
    public int[][] field6752;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[[B")
    private byte[][] field6745;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[[B")
    private byte[][] field6749;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    private int field6747;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    private int field6750;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field6751;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    private int field6756;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    private int field6758;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    private int field6759;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    private int field6760;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    private int field6761;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    private int field6762;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    private int field6763;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    private int field6765;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "[[Lov;")
    private class123[][] field6753;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "[[Lon;")
    private class221[][] field6764;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[[Lil;")
    private class7[][] field6766;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[[Lto;")
    private class8[][] field6748;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 4)
    public final void method360(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6753 == null) {
            this.field6753 = new class123[super.field2037][super.field2031];
            this.field6766 = new class7[super.field2037][super.field2031];
        } else if (this.field6748 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class40.field506[class357.method2141(arg6[var15], 120) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class40.field506[class357.method2141(arg7[var16], 99) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field2030 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2030 && arg4[var22] == super.field2030) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2030) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2030 != arg2[var24] && arg2[0] - super.field2030 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2030 != arg4[var24] && arg4[0] - super.field2030 != arg4[var24]) {
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
                class123 var25 = new class123();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1834 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1839 = (byte) (var25.field1839 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field6752[arg0 + 1][arg1] == this.field6752[arg0][arg1] && this.field6752[arg0 + 1][arg1 + 1] == this.field6752[arg0][arg1] && this.field6752[arg0][arg1 + 1] == this.field6752[arg0][arg1]) {
                    var25.field1839 = (byte) (var25.field1839 | 1);
                }
                if (var27 != -1 && (var25.field1839 & 2) == 0 && !this.field6755.field471.method1654(109, var27).field2501) {
                    var25.field1835 = this.field6745[arg0][arg1] - this.field6749[arg0][arg1];
                    var25.field1833 = this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1];
                    var25.field1841 = this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1];
                    var25.field1836 = this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1];
                    var25.field1838 = (short) var27;
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
                    var25.field1835 = class521.method3107(var28, 0, method2701(arg6[var18] >> 8, this.field6745[arg0][arg1] - this.field6749[arg0][arg1]), arg10);
                    if (var25.field1834 != 0) {
                        var25.field1835 |= 255 - (this.field6745[arg0][arg1] - this.field6749[arg0][arg1]) << 25;
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
                    var25.field1833 = class521.method3107(var29, 0, method2701(arg6[var19] >> 8, this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]), arg10);
                    if (var25.field1834 != 0) {
                        var25.field1833 |= 255 - (this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]) << 25;
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
                    var25.field1841 = class521.method3107(var30, 0, method2701(arg6[var20] >> 8, this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field1834 != 0) {
                        var25.field1841 |= 255 - (this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field1836 = class521.method3107(var31, 0, method2701(arg6[var21] >> 8, this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]), arg10);
                    if (var25.field1834 != 0) {
                        var25.field1836 |= 255 - (this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1838 = -1;
                }
                if (arg5 != null) {
                    var25.field1840 = (short) arg5[var20];
                    var25.field1837 = (short) arg5[var21];
                    var25.field1832 = (short) arg5[var19];
                    var25.field1842 = (short) arg5[var18];
                }
                this.field6753[arg0][arg1] = var25;
            } else {
                class7 var32 = new class7();
                var32.field122 = (short) arg2.length;
                var32.field121 = (short) (arg2.length / 3);
                var32.field120 = new short[var32.field122];
                var32.field118 = new short[var32.field122];
                var32.field126 = new short[var32.field122];
                var32.field125 = new int[var32.field122];
                if (arg5 != null) {
                    var32.field119 = new short[var32.field122];
                }
                for (int var33 = 0; var33 < var32.field122; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6745[arg0][arg1] - this.field6749[arg0][arg1];
                    } else if (var48 == 0 && super.field2030 == var49) {
                        var51 = this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1];
                    } else if (super.field2030 == var48 && super.field2030 == var49) {
                        var51 = this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1];
                    } else if (super.field2030 == var48 && var49 == 0) {
                        var51 = this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]) * var48 + (this.field6745[arg0][arg1] - this.field6749[arg0][arg1]) * (super.field2030 - var48);
                        int var53 = (this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]) * var48 + (this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]) * (super.field2030 - var48);
                        var51 = (super.field2030 - var49) * var52 + var49 * var53 >> super.field2035 * 2;
                    }
                    int var54 = (arg0 << super.field2035) + var48;
                    int var55 = (arg1 << super.field2035) + var49;
                    var32.field120[var33] = (short) var48;
                    var32.field126[var33] = (short) var49;
                    var32.field118[var33] = (short) (this.method361(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6755.field471.method1654(85, arg8[var33]).field2501) {
                        var32.field125[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field125[var33] = var51 << 25;
                        } else {
                            var32.field125[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field119[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field125[var33] = class521.method3107(var56, 0, method2701(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field125[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field121; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6755.field471.method1654(23, arg8[var35 * 3]).field2501) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field124 = new int[var32.field121];
                }
                if (var34) {
                    var32.field123 = new short[var32.field121];
                    var32.field127 = new short[var32.field121];
                }
                for (int var36 = 0; var36 < var32.field121; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field124[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6755.field471.method1654(81, var42).field2501) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6755.field471.method1654(96, var43).field2501) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6755.field471.method1654(51, var44).field2501) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field123[var36] = (short) var44;
                            var32.field127[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6755.field471.method1654(48, var45).field2501) {
                                    var32.field125[var37] = class40.field506[class357.method2141(this.field6755.field471.method1654(106, var45).field2484 & 65535, -84) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6755.field471.method1654(89, var46).field2501) {
                                    var32.field125[var38] = class40.field506[class357.method2141(this.field6755.field471.method1654(103, var46).field2484 & 65535, -62) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6755.field471.method1654(22, var47).field2501) {
                                    var32.field125[var39] = class40.field506[class357.method2141(this.field6755.field471.method1654(101, var47).field2484 & 65535, -19) & 65535];
                                }
                            }
                            var32.field123[var36] = -1;
                        }
                    }
                }
                this.field6766[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 497)
    public final boolean method355(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII[[Z)V", line = 501)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class5 var9 = this.field6755.method2405(Thread.currentThread());
        class29 var10 = var9.field52;
        var10.field392 = 0;
        var10.field382 = false;
        if (this.field6753 != null) {
            this.method2700(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field70, var9.field77);
        } else {
            if (this.field6748 != null) {
                this.method2697(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field70, var9.field77);
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "ca", descriptor = "()V", line = 515)
    public final void method365() {
        this.field6745 = null;
        this.field6749 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 520)
    public final void method353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6748 == null) {
            this.field6748 = new class8[super.field2037][super.field2031];
            this.field6764 = new class221[super.field2037][super.field2031];
        } else if (this.field6753 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2030 != var20 || var21 != 0 && super.field2030 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class221 var22 = new class221();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3158 = var23;
            var22.field3162 = new short[var23];
            var22.field3156 = new short[var23];
            var22.field3154 = new short[var23];
            var22.field3161 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3162[var25] = (short) (this.field6745[arg0][arg1] - this.field6749[arg0][arg1]);
                } else if (var30 == 0 && super.field2030 == var31) {
                    var22.field3162[var25] = (short) (this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]);
                } else if (super.field2030 == var30 && super.field2030 == var31) {
                    var22.field3162[var25] = (short) (this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]);
                } else if (super.field2030 == var30 && var31 == 0) {
                    var22.field3162[var25] = (short) (this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]) * var30 + (this.field6745[arg0][arg1] - this.field6749[arg0][arg1]) * (super.field2030 - var30);
                    int var33 = (this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]) * var30 + (this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]) * (super.field2030 - var30);
                    var22.field3162[var25] = (short) ((super.field2030 - var31) * var32 + var31 * var33 >> super.field2035 * 2);
                }
                int var34 = (arg0 << super.field2035) + var30;
                int var35 = (arg1 << super.field2035) + var31;
                var22.field3156[var25] = (short) var30;
                var22.field3161[var25] = (short) var31;
                var22.field3154[var25] = (short) (this.method361(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3162[var25] < 2) {
                    var22.field3162[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6755.field471.method1654(121, arg11[var28]).field2501) {
                    var26 = true;
                }
            }
            var22.field3157 = new int[var27];
            if (arg10 != null) {
                var22.field3163 = new int[var27];
            }
            var22.field3151 = new short[var27];
            var22.field3155 = new short[var27];
            var22.field3153 = new short[var27];
            if (var26) {
                var22.field3152 = new short[var27];
                var22.field3160 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3157[var22.field3159] = class357.method2141(arg9[var29], -111);
                    } else {
                        var22.field3157[var22.field3159] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3163[var22.field3159] = class357.method2141(arg10[var29], 112);
                        } else {
                            var22.field3163[var22.field3159] = -1;
                        }
                    }
                    var22.field3151[var22.field3159] = (short) arg6[var29];
                    var22.field3155[var22.field3159] = (short) arg7[var29];
                    var22.field3153[var22.field3159] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6755.field471.method1654(30, arg11[var29]).field2501) {
                            var22.field3152[var22.field3159] = (short) arg11[var29];
                            var22.field3160[var22.field3159] = (short) arg12[var29];
                        } else {
                            var22.field3152[var22.field3159] = -1;
                        }
                    }
                    ++var22.field3159;
                }
            }
            this.field6764[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class8 var36 = new class8();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field132 = class438.method2584(-11, class357.method2141(arg10[0], -78), this.field6745[arg0][arg1] - this.field6749[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field134 = (byte) (var36.field134 | 2);
                    }
                }
                if (this.field6752[arg0 + 1][arg1] == this.field6752[arg0][arg1] && this.field6752[arg0 + 1][arg1 + 1] == this.field6752[arg0][arg1] && this.field6752[arg0][arg1 + 1] == this.field6752[arg0][arg1]) {
                    var36.field134 = (byte) (var36.field134 | 1);
                }
                if (var38 != -1 && (var36.field134 & 2) == 0 && !this.field6755.field471.method1654(96, var38).field2501) {
                    var36.field131 = (short) (this.field6745[arg0][arg1] - this.field6749[arg0][arg1]);
                    var36.field130 = (short) (this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]);
                    var36.field128 = (short) (this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]);
                    var36.field129 = (short) (this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]);
                    var36.field133 = (short) var38;
                } else {
                    short var39 = class357.method2141(var37, -34);
                    var36.field131 = (short) class438.method2584(45, var39, this.field6745[arg0][arg1] - this.field6749[arg0][arg1]);
                    var36.field130 = (short) class438.method2584(-2, var39, this.field6745[arg0 + 1][arg1] - this.field6749[arg0 + 1][arg1]);
                    var36.field128 = (short) class438.method2584(-103, var39, this.field6745[arg0 + 1][arg1 + 1] - this.field6749[arg0 + 1][arg1 + 1]);
                    var36.field129 = (short) class438.method2584(2, var39, this.field6745[arg0][arg1 + 1] - this.field6749[arg0][arg1 + 1]);
                    var36.field133 = -1;
                }
                this.field6748[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lcv;IIII[[I[[II)V", line = 750)
    public class460(class399 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6755 = arg0;
        this.field6746 = arg2;
        this.field6752 = arg5;
        this.field6745 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6755.field5843 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6755.field5848 * var18 + this.field6755.field5852 * var17 + this.field6755.field5837 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6745[var11][var10] = (byte) var20;
            }
        }
        this.field6749 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "(III)V", line = 801)
    public final void method366(int arg0, int arg1, int arg2) {
        if (this.field6749[arg0][arg1] < arg2) {
            this.field6749[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII[[ZLbe;[I[I)V", line = 808)
    private final void method2697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class29 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field388 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6748[var16][var17] != null) {
                        class8 var18 = this.field6748[var16][var17];
                        if (var18.field133 != -1 && (var18.field134 & 2) == 0 && var18.field132 == -1) {
                            int var19 = this.field6755.method2409(var18.field133);
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class438.method2584(126, var19, var18.field128 & 65535), class438.method2584(0, var19, var18.field129 & 65535), class438.method2584(125, var19, var18.field130 & 65535));
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, class438.method2584(123, var19, var18.field131 & 65535), class438.method2584(125, var19, var18.field130 & 65535), class438.method2584(126, var19, var18.field129 & 65535));
                        } else if (var18.field132 == -1) {
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field128 & 65535, var18.field129 & 65535, var18.field130 & 65535);
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field131 & 65535, var18.field130 & 65535, var18.field129 & 65535);
                        } else {
                            int var20 = var18.field132;
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field6764[var16][var17] != null) {
                        class221 var21 = this.field6764[var16][var17];
                        for (int var22 = 0; var22 < var21.field3158; ++var22) {
                            arg9[var22] = var21.field3156[var22] * var13 / super.field2030 + var14;
                            arg10[var22] = var15 - var21.field3161[var22] * var13 / super.field2030;
                        }
                        for (int var23 = 0; var23 < var21.field3159; ++var23) {
                            short var24 = var21.field3151[var23];
                            short var25 = var21.field3155[var23];
                            short var26 = var21.field3153[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3163 != null && var21.field3163[var23] != -1) {
                                int var33 = var21.field3163[var23];
                                arg8.method164(var30, var31, var32, var27, var28, var29, class438.method2584(-33, var33, var21.field3162[var24]), class438.method2584(36, var33, var21.field3162[var25]), class438.method2584(126, var33, var21.field3162[var26]));
                            } else if (var21.field3152 != null && var21.field3152[var23] != -1) {
                                int var34 = this.field6755.method2409(var21.field3152[var23]);
                                arg8.method164(var30, var31, var32, var27, var28, var29, class438.method2584(125, var34, var21.field3162[var24]), class438.method2584(-26, var34, var21.field3162[var25]), class438.method2584(-72, var34, var21.field3162[var26]));
                            } else {
                                int var35 = var21.field3157[var23];
                                arg8.method164(var30, var31, var32, var27, var28, var29, class438.method2584(126, var35, var21.field3162[var24]), class438.method2584(126, var35, var21.field3162[var25]), class438.method2584(14, var35, var21.field3162[var26]));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field388 = true;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)Z", line = 938)
    private final boolean method2698(int arg0) {
        if ((this.field6746 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "(Lba;IIIIZ)V", line = 955)
    public final void method363(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "(II)I", line = 960)
    public final int method351(int arg0, int arg1) {
        return this.field6752[arg0][arg1];
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[[ZZ)V", line = 970)
    public final void method362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class394 var6 = this.field6755.field5862;
        this.field6754 = -1;
        this.field6760 = var6.field5773;
        this.field6750 = var6.field5776;
        this.field6747 = var6.field5781;
        this.field6765 = var6.field5777;
        this.field6756 = var6.field5778;
        this.field6759 = var6.field5772;
        this.field6757 = var6.field5782;
        this.field6751 = var6.field5779;
        this.field6763 = var6.field5783;
        this.field6762 = var6.field5780;
        this.field6758 = var6.field5774;
        this.field6761 = var6.field5775;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZLbe;[I[I[I)V", line = 987)
    private final void method2699(int arg0, int arg1, boolean arg2, class29 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class123 var8 = this.field6753[arg0][arg1];
        if (var8 != null) {
            if ((var8.field1839 & 2) == 0) {
                int var9 = super.field2030 * arg0;
                int var10 = super.field2030 + var9;
                int var11 = super.field2030 * arg1;
                int var12 = super.field2030 + var11;
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
                if ((var8.field1839 & 1) != 0 && !arg2) {
                    int var17 = this.field6752[arg0][arg1];
                    if (this.field6754 == -1) {
                        int var18 = this.field6762 * var17;
                        var19 = (this.field6758 * var11 + this.field6763 * var9 + var18 >> 15) + this.field6761;
                        if (var19 <= this.field6755.field5864) {
                            return;
                        }
                        var20 = (this.field6758 * var11 + this.field6763 * var10 + var18 >> 15) + this.field6761;
                        if (var20 <= this.field6755.field5864) {
                            return;
                        }
                        var21 = (this.field6758 * var12 + this.field6763 * var10 + var18 >> 15) + this.field6761;
                        if (var21 <= this.field6755.field5864) {
                            return;
                        }
                        var22 = (this.field6758 * var12 + this.field6763 * var9 + var18 >> 15) + this.field6761;
                        if (var22 <= this.field6755.field5864) {
                            return;
                        }
                    } else {
                        var22 = this.field6754;
                        var21 = this.field6754;
                        var20 = this.field6754;
                        var19 = this.field6754;
                    }
                    if (this.field6755.field5868) {
                        int var23 = var19 - this.field6755.field5840;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field6755.field5840;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field6755.field5840;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field6755.field5840;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field6750 * var17;
                    int var28 = this.field6759 * var17;
                    var29 = (this.field6747 * var11 + this.field6760 * var9 + var27 >> 15) + this.field6765;
                    var30 = this.field6755.field5860 * var29 / var19 + arg3.field385;
                    var31 = (this.field6757 * var11 + this.field6756 * var9 + var28 >> 15) + this.field6751;
                    var32 = this.field6755.field5865 * var31 / var19 + arg3.field384;
                    var33 = (this.field6747 * var11 + this.field6760 * var10 + var27 >> 15) + this.field6765;
                    var34 = this.field6755.field5860 * var33 / var20 + arg3.field385;
                    var35 = (this.field6757 * var11 + this.field6756 * var10 + var28 >> 15) + this.field6751;
                    var36 = this.field6755.field5865 * var35 / var20 + arg3.field384;
                    var37 = (this.field6747 * var12 + this.field6760 * var10 + var27 >> 15) + this.field6765;
                    var38 = this.field6755.field5860 * var37 / var21 + arg3.field385;
                    var39 = (this.field6757 * var12 + this.field6756 * var10 + var28 >> 15) + this.field6751;
                    var40 = this.field6755.field5865 * var39 / var21 + arg3.field384;
                    var41 = (this.field6747 * var12 + this.field6760 * var9 + var27 >> 15) + this.field6765;
                    var42 = this.field6755.field5860 * var41 / var22 + arg3.field385;
                    var43 = (this.field6757 * var12 + this.field6756 * var9 + var28 >> 15) + this.field6751;
                    var44 = this.field6755.field5865 * var43 / var22 + arg3.field384;
                } else {
                    int var45 = this.field6752[arg0][arg1];
                    int var46 = this.field6752[arg0 + 1][arg1];
                    int var47 = this.field6752[arg0 + 1][arg1 + 1];
                    int var48 = this.field6752[arg0][arg1 + 1];
                    if (this.field6754 == -1) {
                        var19 = (this.field6758 * var11 + this.field6763 * var9 + this.field6762 * var45 >> 15) + this.field6761;
                        if (var19 <= this.field6755.field5864) {
                            return;
                        }
                        var20 = (this.field6758 * var11 + this.field6763 * var10 + this.field6762 * var46 >> 15) + this.field6761;
                        if (var20 <= this.field6755.field5864) {
                            return;
                        }
                        var21 = (this.field6758 * var12 + this.field6763 * var10 + this.field6762 * var47 >> 15) + this.field6761;
                        if (var21 <= this.field6755.field5864) {
                            return;
                        }
                        var22 = (this.field6758 * var12 + this.field6763 * var9 + this.field6762 * var48 >> 15) + this.field6761;
                        if (var22 <= this.field6755.field5864) {
                            return;
                        }
                    } else {
                        var22 = this.field6754;
                        var21 = this.field6754;
                        var20 = this.field6754;
                        var19 = this.field6754;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field6755.field5840;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field1842 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field6755.field5840;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field1832 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field6755.field5840;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field1840 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field6755.field5840;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field1837 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field6755.field5868) {
                        int var57 = var19 - this.field6755.field5840;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field6755.field5840;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field6755.field5840;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field6755.field5840;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field6747 * var11 + this.field6760 * var9 + this.field6750 * var45 >> 15) + this.field6765;
                    var30 = this.field6755.field5860 * var29 / var19 + arg3.field385;
                    var31 = (this.field6757 * var11 + this.field6759 * var45 + this.field6756 * var9 >> 15) + this.field6751;
                    var32 = this.field6755.field5865 * var31 / var19 + arg3.field384;
                    var33 = (this.field6747 * var11 + this.field6760 * var10 + this.field6750 * var46 >> 15) + this.field6765;
                    var34 = this.field6755.field5860 * var33 / var20 + arg3.field385;
                    var35 = (this.field6757 * var11 + this.field6759 * var46 + this.field6756 * var10 >> 15) + this.field6751;
                    var36 = this.field6755.field5865 * var35 / var20 + arg3.field384;
                    var37 = (this.field6747 * var12 + this.field6760 * var10 + this.field6750 * var47 >> 15) + this.field6765;
                    var38 = this.field6755.field5860 * var37 / var21 + arg3.field385;
                    var39 = (this.field6757 * var12 + this.field6759 * var47 + this.field6756 * var10 >> 15) + this.field6751;
                    var40 = this.field6755.field5865 * var39 / var21 + arg3.field384;
                    var41 = (this.field6747 * var12 + this.field6760 * var9 + this.field6750 * var48 >> 15) + this.field6765;
                    var42 = this.field6755.field5860 * var41 / var22 + arg3.field385;
                    var43 = (this.field6757 * var12 + this.field6759 * var48 + this.field6756 * var9 >> 15) + this.field6751;
                    var44 = this.field6755.field5865 * var43 / var22 + arg3.field384;
                }
                boolean var61 = var8.field1838 != -1 && this.method2698(this.field6755.field471.method1654(81, var8.field1838).field2492);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field382 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field383 || var42 > arg3.field383 || var34 > arg3.field383;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field392 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field1838 >= 0) {
                                arg3.method171(var40, var44, var36, var38, var42, var34, this.field6755.field5867, var15, var16, var14, var8.field1841, var8.field1836, var8.field1833, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1838);
                            } else {
                                arg3.method173(var40, var44, var36, var38, var42, var34, class297.method1744(-124, var15 << 24 | this.field6755.field5867, var8.field1841), class297.method1744(-123, var16 << 24 | this.field6755.field5867, var8.field1836), class297.method1744(-123, var14 << 24 | this.field6755.field5867, var8.field1833));
                            }
                        } else if (var8.field1838 >= 0) {
                            arg3.method170(var40, var44, var36, var38, var42, var34, var8.field1841, var8.field1836, var8.field1833, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field1838);
                        } else {
                            arg3.method173(var40, var44, var36, var38, var42, var34, var8.field1841, var8.field1836, var8.field1833);
                        }
                        arg3.field392 = 0;
                    } else {
                        arg3.method161(var40, var44, var36, var38, var42, var34, this.field6755.field5867);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field382 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field383 || var34 > arg3.field383 || var42 > arg3.field383;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field392 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field1838 >= 0) {
                                arg3.method171(var32, var36, var44, var30, var34, var42, this.field6755.field5867, var13, var14, var16, var8.field1835, var8.field1833, var8.field1836, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1838);
                            } else {
                                arg3.method173(var32, var36, var44, var30, var34, var42, class297.method1744(-126, var13 << 24 | this.field6755.field5867, var8.field1835), class297.method1744(-10, var14 << 24 | this.field6755.field5867, var8.field1833), class297.method1744(44, var16 << 24 | this.field6755.field5867, var8.field1836));
                            }
                        } else if (var8.field1838 >= 0) {
                            arg3.method170(var32, var36, var44, var30, var34, var42, var8.field1835, var8.field1833, var8.field1836, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field1838);
                        } else {
                            arg3.method173(var32, var36, var44, var30, var34, var42, var8.field1835, var8.field1833, var8.field1836);
                        }
                        arg3.field392 = 0;
                        return;
                    }
                    arg3.method161(var32, var36, var44, var30, var34, var42, this.field6755.field5867);
                }
            }
        } else {
            class7 var64 = this.field6766[arg0][arg1];
            if (var64 != null) {
                if (this.field6754 == -1) {
                    for (int var65 = 0; var65 < var64.field122; ++var65) {
                        int var66 = (arg0 << super.field2035) + var64.field120[var65];
                        int var67 = var64.field118[var65];
                        int var68 = (arg1 << super.field2035) + var64.field126[var65];
                        int var69 = (this.field6758 * var68 + this.field6763 * var66 + this.field6762 * var67 >> 15) + this.field6761;
                        if (var69 <= this.field6755.field5864) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field6755.field5840;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field119[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field6755.field5868) {
                            int var72 = var69 - this.field6755.field5840;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field6747 * var68 + this.field6760 * var66 + this.field6750 * var67 >> 15) + this.field6765;
                        int var74 = (this.field6757 * var68 + this.field6759 * var67 + this.field6756 * var66 >> 15) + this.field6751;
                        arg4[var65] = this.field6755.field5860 * var73 / var69 + arg3.field385;
                        arg5[var65] = this.field6755.field5865 * var74 / var69 + arg3.field384;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field122; ++var75) {
                        int var115 = (arg0 << super.field2035) + var64.field120[var75];
                        int var116 = var64.field118[var75];
                        int var117 = (arg1 << super.field2035) + var64.field126[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field6754 - this.field6755.field5840;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field119[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field6755.field5868) {
                            int var120 = this.field6754 - this.field6755.field5840;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field6747 * var117 + this.field6760 * var115 + this.field6750 * var116 >> 15) + this.field6765;
                        int var122 = (this.field6757 * var117 + this.field6759 * var116 + this.field6756 * var115 >> 15) + this.field6751;
                        arg4[var75] = this.field6755.field5860 * var121 / this.field6754 + arg3.field385;
                        arg5[var75] = this.field6755.field5865 * var122 / this.field6754 + arg3.field384;
                    }
                }
                if (var64.field123 != null) {
                    int var76 = this.field6752[arg0][arg1];
                    int var77 = this.field6752[arg0 + 1][arg1];
                    int var78 = this.field6752[arg0][arg1 + 1];
                    int var79 = super.field2030 * arg0;
                    int var80 = super.field2030 + var79;
                    int var81 = super.field2030 * arg1;
                    int var82 = super.field2030 + var81;
                    int var83 = (this.field6747 * var81 + this.field6760 * var79 + this.field6750 * var76 >> 15) + this.field6765;
                    int var84 = (this.field6757 * var81 + this.field6759 * var76 + this.field6756 * var79 >> 15) + this.field6751;
                    int var85 = (this.field6758 * var81 + this.field6763 * var79 + this.field6762 * var76 >> 15) + this.field6761;
                    int var86 = (this.field6747 * var81 + this.field6760 * var80 + this.field6750 * var77 >> 15) + this.field6765;
                    int var87 = (this.field6757 * var81 + this.field6759 * var77 + this.field6756 * var80 >> 15) + this.field6751;
                    int var88 = (this.field6758 * var81 + this.field6763 * var80 + this.field6762 * var77 >> 15) + this.field6761;
                    int var89 = (this.field6747 * var82 + this.field6760 * var79 + this.field6750 * var78 >> 15) + this.field6765;
                    int var90 = (this.field6757 * var82 + this.field6759 * var78 + this.field6756 * var79 >> 15) + this.field6751;
                    int var91 = (this.field6758 * var82 + this.field6763 * var79 + this.field6762 * var78 >> 15) + this.field6761;
                    for (int var92 = 0; var92 < var64.field121; ++var92) {
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
                            arg3.field382 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field383 || var97 > arg3.field383 || var98 > arg3.field383;
                            short var103 = var64.field123[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method2698(this.field6755.field471.method1654(88, var103).field2492)) {
                                    arg3.field392 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method171(var99, var100, var101, var96, var97, var98, this.field6755.field5867, arg6[var93], arg6[var94], arg6[var95], var64.field125[var93], var64.field125[var94], var64.field125[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field125[var93] & 16777215) != 0) {
                                        arg3.method173(var99, var100, var101, var96, var97, var98, class297.method1744(-124, arg6[var93] << 24 | this.field6755.field5867, var64.field125[var93]), class297.method1744(-123, arg6[var94] << 24 | this.field6755.field5867, var64.field125[var94]), class297.method1744(95, arg6[var95] << 24 | this.field6755.field5867, var64.field125[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method170(var99, var100, var101, var96, var97, var98, var64.field125[var93], var64.field125[var94], var64.field125[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field125[var93] & 16777215) != 0) {
                                    arg3.method173(var99, var100, var101, var96, var97, var98, var64.field125[var93], var64.field125[var94], var64.field125[var95]);
                                }
                                arg3.field392 = 0;
                            } else {
                                arg3.method161(var99, var100, var101, var96, var97, var98, this.field6755.field5867);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field121; ++var104) {
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
                        arg3.field382 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field383 || var109 > arg3.field383 || var110 > arg3.field383;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field125[var105] & 16777215) != 0) {
                                    arg3.method173(var111, var112, var113, var108, var109, var110, class521.method3107(arg6[var105], 0, var64.field125[var105], this.field6755.field5867), class521.method3107(arg6[var106], 0, var64.field125[var106], this.field6755.field5867), class521.method3107(arg6[var107], 0, var64.field125[var107], this.field6755.field5867));
                                }
                            } else if ((var64.field125[var105] & 16777215) != 0) {
                                arg3.method173(var111, var112, var113, var108, var109, var110, var64.field125[var105], var64.field125[var106], var64.field125[var107]);
                            }
                        } else {
                            arg3.method161(var111, var112, var113, var108, var109, var110, this.field6755.field5867);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIII[[ZLbe;[I[I)V", line = 1627)
    private final void method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class29 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field388 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field6753[var16][var17] != null) {
                        class123 var18 = this.field6753[var16][var17];
                        if (var18.field1838 != -1 && (var18.field1839 & 2) == 0 && var18.field1834 == 0) {
                            int var19 = this.field6755.method2409(var18.field1838);
                            arg8.method164(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class438.method2584(127, var19, var18.field1841), class438.method2584(-118, var19, var18.field1836), class438.method2584(-100, var19, var18.field1833));
                            arg8.method164(var15, var15, var15 - var13, var14, var13 + var14, var14, class438.method2584(126, var19, var18.field1835), class438.method2584(126, var19, var18.field1833), class438.method2584(126, var19, var18.field1836));
                        } else if (var18.field1834 == 0) {
                            arg8.method173(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field1841, var18.field1836, var18.field1833);
                            arg8.method173(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field1835, var18.field1833, var18.field1836);
                        } else {
                            int var20 = var18.field1834;
                            arg8.method173(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class297.method1744(-121, var18.field1841 & -16777216, var20), class297.method1744(-122, var18.field1836 & -16777216, var20), class297.method1744(92, var18.field1833 & -16777216, var20));
                            arg8.method173(var15, var15, var15 - var13, var14, var13 + var14, var14, class297.method1744(100, var18.field1835 & -16777216, var20), class297.method1744(-126, var18.field1833 & -16777216, var20), class297.method1744(-125, var18.field1836 & -16777216, var20));
                        }
                    } else if (this.field6766[var16][var17] != null) {
                        class7 var21 = this.field6766[var16][var17];
                        for (int var22 = 0; var22 < var21.field122; ++var22) {
                            arg9[var22] = var21.field120[var22] * var13 / super.field2030 + var14;
                            arg10[var22] = var15 - var21.field126[var22] * var13 / super.field2030;
                        }
                        for (int var23 = 0; var23 < var21.field121; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field124 != null && var21.field124[var23] != 0 && (var21.field123 == null || var21.field123 != null && var21.field123[var23] == -1)) {
                                int var33 = var21.field124[var23];
                                arg8.method173(var30, var31, var32, var27, var28, var29, class297.method1744(-128, -16777216 - (var21.field125[var24] & -16777216), var33), class297.method1744(89, -16777216 - (var21.field125[var25] & -16777216), var33), class297.method1744(-124, -16777216 - (var21.field125[var26] & -16777216), var33));
                            } else if (var21.field123 != null && var21.field123[var23] != -1) {
                                int var34 = this.field6755.method2409(var21.field123[var23]);
                                arg8.method164(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method173(var30, var31, var32, var27, var28, var29, var21.field125[var24], var21.field125[var25], var21.field125[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field388 = true;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)I", line = 1756)
    private static final int method2701(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljd;[I)V", line = 1784)
    public final void method364(class153 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "(IILba;)Lba;", line = 1791)
    public final class263 method359(int arg0, int arg1, class263 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I", line = 1796)
    public final int method361(int arg0, int arg1) {
        int var3 = arg0 >> super.field2035;
        int var4 = arg1 >> super.field2035;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2037 - 1 && var4 <= super.field2031 - 1) {
            int var5 = arg0 & super.field2030 - 1;
            int var6 = arg1 & super.field2030 - 1;
            int var7 = (super.field2030 - var5) * this.field6752[var3][var4] + this.field6752[var3 + 1][var4] * var5 >> super.field2035;
            int var8 = (super.field2030 - var5) * this.field6752[var3][var4 + 1] + this.field6752[var3 + 1][var4 + 1] * var5 >> super.field2035;
            return (super.field2030 - var6) * var7 + var6 * var8 >> super.field2035;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lba;IIIIZ)V", line = 1813)
    public final void method352(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILbe;[I[I[I)V", line = 1818)
    private final void method2702(int arg0, int arg1, class29 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class8 var7 = this.field6748[arg0][arg1];
        if (var7 != null) {
            if ((var7.field134 & 2) == 0) {
                int var8 = super.field2030 * arg0;
                int var9 = super.field2030 + var8;
                int var10 = super.field2030 * arg1;
                int var11 = super.field2030 + var10;
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
                if ((var7.field134 & 1) != 0) {
                    int var12 = this.field6752[arg0][arg1];
                    int var16;
                    if (this.field6754 == -1) {
                        int var13 = this.field6762 * var12;
                        var14 = (this.field6758 * var10 + this.field6763 * var8 + var13 >> 15) + this.field6761;
                        if (var14 <= this.field6755.field5864) {
                            return;
                        }
                        var15 = (this.field6758 * var10 + this.field6763 * var9 + var13 >> 15) + this.field6761;
                        if (var15 <= this.field6755.field5864) {
                            return;
                        }
                        var16 = (this.field6758 * var11 + this.field6763 * var9 + var13 >> 15) + this.field6761;
                        if (var16 <= this.field6755.field5864) {
                            return;
                        }
                        var17 = (this.field6758 * var11 + this.field6763 * var8 + var13 >> 15) + this.field6761;
                        if (var17 <= this.field6755.field5864) {
                            return;
                        }
                    } else {
                        var17 = this.field6754;
                        var16 = this.field6754;
                        var15 = this.field6754;
                        var14 = this.field6754;
                    }
                    int var18 = this.field6750 * var12;
                    int var19 = this.field6759 * var12;
                    var20 = (this.field6747 * var10 + this.field6760 * var8 + var18 >> 15) + this.field6765;
                    var21 = this.field6755.field5860 * var20 / var14 + arg2.field385;
                    var22 = (this.field6757 * var10 + this.field6756 * var8 + var19 >> 15) + this.field6751;
                    var23 = this.field6755.field5865 * var22 / var14 + arg2.field384;
                    var24 = (this.field6747 * var10 + this.field6760 * var9 + var18 >> 15) + this.field6765;
                    var25 = this.field6755.field5860 * var24 / var15 + arg2.field385;
                    var26 = (this.field6757 * var10 + this.field6756 * var9 + var19 >> 15) + this.field6751;
                    var27 = this.field6755.field5865 * var26 / var15 + arg2.field384;
                    int var28 = (this.field6747 * var11 + this.field6760 * var9 + var18 >> 15) + this.field6765;
                    var29 = this.field6755.field5860 * var28 / var16 + arg2.field385;
                    int var30 = (this.field6757 * var11 + this.field6756 * var9 + var19 >> 15) + this.field6751;
                    var31 = this.field6755.field5865 * var30 / var16 + arg2.field384;
                    var32 = (this.field6747 * var11 + this.field6760 * var8 + var18 >> 15) + this.field6765;
                    var33 = this.field6755.field5860 * var32 / var17 + arg2.field385;
                    var34 = (this.field6757 * var11 + this.field6756 * var8 + var19 >> 15) + this.field6751;
                    var35 = this.field6755.field5865 * var34 / var17 + arg2.field384;
                } else {
                    int var36 = this.field6752[arg0][arg1];
                    int var37 = this.field6752[arg0 + 1][arg1];
                    int var38 = this.field6752[arg0 + 1][arg1 + 1];
                    int var39 = this.field6752[arg0][arg1 + 1];
                    int var40;
                    if (this.field6754 == -1) {
                        var14 = (this.field6758 * var10 + this.field6763 * var8 + this.field6762 * var36 >> 15) + this.field6761;
                        if (var14 <= this.field6755.field5864) {
                            return;
                        }
                        var15 = (this.field6758 * var10 + this.field6763 * var9 + this.field6762 * var37 >> 15) + this.field6761;
                        if (var15 <= this.field6755.field5864) {
                            return;
                        }
                        var40 = (this.field6758 * var11 + this.field6763 * var9 + this.field6762 * var38 >> 15) + this.field6761;
                        if (var40 <= this.field6755.field5864) {
                            return;
                        }
                        var17 = (this.field6758 * var11 + this.field6763 * var8 + this.field6762 * var39 >> 15) + this.field6761;
                        if (var17 <= this.field6755.field5864) {
                            return;
                        }
                    } else {
                        var17 = this.field6754;
                        var40 = this.field6754;
                        var15 = this.field6754;
                        var14 = this.field6754;
                    }
                    var20 = (this.field6747 * var10 + this.field6760 * var8 + this.field6750 * var36 >> 15) + this.field6765;
                    var21 = this.field6755.field5860 * var20 / var14 + arg2.field385;
                    var22 = (this.field6757 * var10 + this.field6759 * var36 + this.field6756 * var8 >> 15) + this.field6751;
                    var23 = this.field6755.field5865 * var22 / var14 + arg2.field384;
                    var24 = (this.field6747 * var10 + this.field6760 * var9 + this.field6750 * var37 >> 15) + this.field6765;
                    var25 = this.field6755.field5860 * var24 / var15 + arg2.field385;
                    var26 = (this.field6757 * var10 + this.field6759 * var37 + this.field6756 * var9 >> 15) + this.field6751;
                    var27 = this.field6755.field5865 * var26 / var15 + arg2.field384;
                    int var41 = (this.field6747 * var11 + this.field6760 * var9 + this.field6750 * var38 >> 15) + this.field6765;
                    var29 = this.field6755.field5860 * var41 / var40 + arg2.field385;
                    int var42 = (this.field6757 * var11 + this.field6759 * var38 + this.field6756 * var9 >> 15) + this.field6751;
                    var31 = this.field6755.field5865 * var42 / var40 + arg2.field384;
                    var32 = (this.field6747 * var11 + this.field6760 * var8 + this.field6750 * var39 >> 15) + this.field6765;
                    var33 = this.field6755.field5860 * var32 / var17 + arg2.field385;
                    var34 = (this.field6757 * var11 + this.field6759 * var39 + this.field6756 * var8 >> 15) + this.field6751;
                    var35 = this.field6755.field5865 * var34 / var17 + arg2.field384;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field382 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field383 || var33 > arg2.field383 || var25 > arg2.field383;
                    if (var7.field133 >= 0) {
                        if (this.method2698(this.field6755.field471.method1654(89, var7.field133).field2492)) {
                            arg2.field392 = 100;
                        }
                        arg2.method170(var31, var35, var27, var29, var33, var25, var7.field128 & 65535, var7.field129 & 65535, var7.field130 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field133);
                        arg2.field392 = 0;
                    } else {
                        arg2.method164(var31, var35, var27, var29, var33, var25, var7.field128 & 65535, var7.field129 & 65535, var7.field130 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field382 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field383 || var25 > arg2.field383 || var33 > arg2.field383;
                    if (var7.field133 >= 0) {
                        if (this.method2698(this.field6755.field471.method1654(90, var7.field133).field2492)) {
                            arg2.field392 = 100;
                        }
                        arg2.method170(var23, var27, var35, var21, var25, var33, var7.field131 & 65535, var7.field130 & 65535, var7.field129 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field133);
                        arg2.field392 = 0;
                        return;
                    }
                    arg2.method164(var23, var27, var35, var21, var25, var33, var7.field131 & 65535, var7.field130 & 65535, var7.field129 & 65535);
                }
            }
        } else {
            class221 var43 = this.field6764[arg0][arg1];
            if (var43 != null) {
                if (this.field6754 == -1) {
                    for (int var44 = 0; var44 < var43.field3158; ++var44) {
                        int var45 = (arg0 << super.field2035) + var43.field3156[var44];
                        short var46 = var43.field3154[var44];
                        int var47 = (arg1 << super.field2035) + var43.field3161[var44];
                        int var48 = (this.field6758 * var47 + this.field6763 * var45 + this.field6762 * var46 >> 15) + this.field6761;
                        if (var48 <= this.field6755.field5864) {
                            return;
                        }
                        int var49 = (this.field6747 * var47 + this.field6760 * var45 + this.field6750 * var46 >> 15) + this.field6765;
                        int var50 = (this.field6757 * var47 + this.field6759 * var46 + this.field6756 * var45 >> 15) + this.field6751;
                        arg3[var44] = this.field6755.field5860 * var49 / var48 + arg2.field385;
                        arg4[var44] = this.field6755.field5865 * var50 / var48 + arg2.field384;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field3158; ++var51) {
                        int var91 = (arg0 << super.field2035) + var43.field3156[var51];
                        short var92 = var43.field3154[var51];
                        int var93 = (arg1 << super.field2035) + var43.field3161[var51];
                        int var94 = (this.field6747 * var93 + this.field6760 * var91 + this.field6750 * var92 >> 15) + this.field6765;
                        int var95 = (this.field6757 * var93 + this.field6759 * var92 + this.field6756 * var91 >> 15) + this.field6751;
                        arg3[var51] = this.field6755.field5860 * var94 / this.field6754 + arg2.field385;
                        arg4[var51] = this.field6755.field5865 * var95 / this.field6754 + arg2.field384;
                    }
                }
                if (var43.field3152 != null) {
                    int var52 = this.field6752[arg0][arg1];
                    int var53 = this.field6752[arg0 + 1][arg1];
                    int var54 = this.field6752[arg0][arg1 + 1];
                    int var55 = super.field2030 * arg0;
                    int var56 = super.field2030 + var55;
                    int var57 = super.field2030 * arg1;
                    int var58 = super.field2030 + var57;
                    int var59 = (this.field6747 * var57 + this.field6760 * var55 + this.field6750 * var52 >> 15) + this.field6765;
                    int var60 = (this.field6757 * var57 + this.field6759 * var52 + this.field6756 * var55 >> 15) + this.field6751;
                    int var61 = (this.field6758 * var57 + this.field6763 * var55 + this.field6762 * var52 >> 15) + this.field6761;
                    int var62 = (this.field6747 * var57 + this.field6760 * var56 + this.field6750 * var53 >> 15) + this.field6765;
                    int var63 = (this.field6757 * var57 + this.field6759 * var53 + this.field6756 * var56 >> 15) + this.field6751;
                    int var64 = (this.field6758 * var57 + this.field6763 * var56 + this.field6762 * var53 >> 15) + this.field6761;
                    int var65 = (this.field6747 * var58 + this.field6760 * var55 + this.field6750 * var54 >> 15) + this.field6765;
                    int var66 = (this.field6757 * var58 + this.field6759 * var54 + this.field6756 * var55 >> 15) + this.field6751;
                    int var67 = (this.field6758 * var58 + this.field6763 * var55 + this.field6762 * var54 >> 15) + this.field6761;
                    for (int var68 = 0; var68 < var43.field3159; ++var68) {
                        short var69 = var43.field3151[var68];
                        short var70 = var43.field3155[var68];
                        short var71 = var43.field3153[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field382 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field383 || var73 > arg2.field383 || var74 > arg2.field383;
                            short var78 = var43.field3152[var68];
                            if (var78 != -1) {
                                if (this.method2698(this.field6755.field471.method1654(64, var78).field2492)) {
                                    arg2.field392 = 100;
                                }
                                arg2.method170(var75, var76, var77, var72, var73, var74, var43.field3162[var69], var43.field3162[var70], var43.field3162[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field392 = 0;
                            } else {
                                int var79 = var43.field3157[var68];
                                if (var79 != -1) {
                                    arg2.method164(var75, var76, var77, var72, var73, var74, class438.method2584(-86, var79, var43.field3162[var69]), class438.method2584(34, var79, var43.field3162[var70]), class438.method2584(19, var79, var43.field3162[var71]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field3159; ++var80) {
                    short var81 = var43.field3151[var80];
                    short var82 = var43.field3155[var80];
                    short var83 = var43.field3153[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field3157[var80];
                        if (var90 != -1) {
                            arg2.field382 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field383 || var85 > arg2.field383 || var86 > arg2.field383;
                            arg2.method164(var87, var88, var89, var84, var85, var86, class438.method2584(-9, var90, var43.field3162[var81]), class438.method2584(1, var90, var43.field3162[var82]), class438.method2584(123, var90, var43.field3162[var83]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V", line = 2181)
    public final void method358(int arg0, int arg1) {
        class5 var3 = this.field6755.method2405(Thread.currentThread());
        var3.field52.field392 = 0;
        if (this.field6753 != null) {
            this.method2699(arg0, arg1, this.field6755.field5871, var3.field52, var3.field70, var3.field77, var3.field67);
        } else {
            if (this.field6748 != null) {
                this.method2702(arg0, arg1, var3.field52, var3.field70, var3.field77, var3.field67);
            }
        }
    }
}
