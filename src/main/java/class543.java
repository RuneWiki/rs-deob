import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class class543 extends class140 {

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public int field6849 = -1;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Llea;")
    public class574 field6832;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    private int field6833;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "[[I")
    public int[][] field6853;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[[B")
    private byte[][] field6834;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "[[B")
    private byte[][] field6835;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public int field6836;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field6838;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public int field6839;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public int field6842;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public int field6843;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public int field6844;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public int field6845;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public int field6846;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public int field6847;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public int field6848;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public int field6851;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public int field6852;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "[[Lei;")
    public class166[][] field6840;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "[[Lvu;")
    public class316[][] field6841;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "[[Lcp;")
    public class679[][] field6850;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "[[Liv;")
    public class88[][] field6837;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)I", line = 8)
    private static final int method2916(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 37)
    public final boolean method187(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 40)
    public final void method203(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6837 == null) {
            this.field6837 = new class88[super.field1685][super.field1684];
            this.field6840 = new class166[super.field1685][super.field1684];
        } else if (this.field6850 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1686 != var20 || var21 != 0 && super.field1686 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class166 var22 = new class166();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1954 = var23;
            var22.field1952 = new short[var23];
            var22.field1949 = new short[var23];
            var22.field1955 = new short[var23];
            var22.field1948 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1952[var25] = (short) (this.field6834[arg0][arg1] - this.field6835[arg0][arg1]);
                } else if (var30 == 0 && super.field1686 == var31) {
                    var22.field1952[var25] = (short) (this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1]);
                } else if (super.field1686 == var30 && super.field1686 == var31) {
                    var22.field1952[var25] = (short) (this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1]);
                } else if (super.field1686 == var30 && var31 == 0) {
                    var22.field1952[var25] = (short) (this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1]) * var30 + (this.field6834[arg0][arg1] - this.field6835[arg0][arg1]) * (super.field1686 - var30);
                    int var33 = (this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1]) * var30 + (this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1]) * (super.field1686 - var30);
                    var22.field1952[var25] = (short) ((super.field1686 - var31) * var32 + var31 * var33 >> super.field1683 * 2);
                }
                int var34 = (arg0 << super.field1683) + var30;
                int var35 = (arg1 << super.field1683) + var31;
                var22.field1949[var25] = (short) var30;
                var22.field1948[var25] = (short) var31;
                var22.field1955[var25] = (short) (this.method194(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1952[var25] < 2) {
                    var22.field1952[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6832.field8781.method2718(arg11[var28], (byte) 72).field1818) {
                    var26 = true;
                }
            }
            var22.field1947 = new int[var27];
            if (arg10 != null) {
                var22.field1951 = new int[var27];
            }
            var22.field1950 = new short[var27];
            var22.field1946 = new short[var27];
            var22.field1943 = new short[var27];
            if (var26) {
                var22.field1945 = new short[var27];
                var22.field1944 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1947[var22.field1953] = class697.method3856(arg9[var29], true);
                    } else {
                        var22.field1947[var22.field1953] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1951[var22.field1953] = class697.method3856(arg10[var29], true);
                        } else {
                            var22.field1951[var22.field1953] = -1;
                        }
                    }
                    var22.field1950[var22.field1953] = (short) arg6[var29];
                    var22.field1946[var22.field1953] = (short) arg7[var29];
                    var22.field1943[var22.field1953] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6832.field8781.method2718(arg11[var29], (byte) 72).field1818) {
                            var22.field1945[var22.field1953] = (short) arg11[var29];
                            var22.field1944[var22.field1953] = (short) arg12[var29];
                        } else {
                            var22.field1945[var22.field1953] = -1;
                        }
                    }
                    ++var22.field1953;
                }
            }
            this.field6840[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class88 var36 = new class88();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field1137 = class497.method2710(class697.method3856(arg10[0], true), this.field6834[arg0][arg1] - this.field6835[arg0][arg1], 127);
                    if (var37 == -1) {
                        var36.field1139 = (byte) (var36.field1139 | 2);
                    }
                }
                if (this.field6853[arg0 + 1][arg1] == this.field6853[arg0][arg1] && this.field6853[arg0 + 1][arg1 + 1] == this.field6853[arg0][arg1] && this.field6853[arg0][arg1 + 1] == this.field6853[arg0][arg1]) {
                    var36.field1139 = (byte) (var36.field1139 | 1);
                }
                if (var38 != -1 && (var36.field1139 & 2) == 0 && !this.field6832.field8781.method2718(var38, (byte) 72).field1818) {
                    var36.field1141 = (short) (this.field6834[arg0][arg1] - this.field6835[arg0][arg1]);
                    var36.field1142 = (short) (this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1]);
                    var36.field1143 = (short) (this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1]);
                    var36.field1138 = (short) (this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1]);
                    var36.field1140 = (short) var38;
                } else {
                    short var39 = class697.method3856(var37, true);
                    var36.field1141 = (short) class497.method2710(var39, this.field6834[arg0][arg1] - this.field6835[arg0][arg1], 127);
                    var36.field1142 = (short) class497.method2710(var39, this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1], 127);
                    var36.field1143 = (short) class497.method2710(var39, this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1], 127);
                    var36.field1138 = (short) class497.method2710(var39, this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1], 127);
                    var36.field1140 = -1;
                }
                this.field6837[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 280)
    public final void method190(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gu", name = "ba", descriptor = "()V", line = 283)
    public final void method191() {
        this.field6834 = null;
        this.field6835 = null;
    }

    @OriginalMember(owner = "client!gu", name = "sa", descriptor = "(II)I", line = 289)
    public final int method194(int arg0, int arg1) {
        int var3 = arg0 >> super.field1683;
        int var4 = arg1 >> super.field1683;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1685 - 1 && var4 <= super.field1684 - 1) {
            int var5 = arg0 & super.field1686 - 1;
            int var6 = arg1 & super.field1686 - 1;
            int var7 = (super.field1686 - var5) * this.field6853[var3][var4] + this.field6853[var3 + 1][var4] * var5 >> super.field1683;
            int var8 = (super.field1686 - var5) * this.field6853[var3][var4 + 1] + this.field6853[var3 + 1][var4 + 1] * var5 >> super.field1683;
            return (super.field1686 - var6) * var7 + var6 * var8 >> super.field1683;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gu", name = "JA", descriptor = "(II)I", line = 306)
    public final int method201(int arg0, int arg1) {
        return this.field6853[arg0][arg1];
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III[[ZZ)V", line = 314)
    public void method195(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class538 var6 = this.field6832.field7353;
        this.field6849 = -1;
        this.field6836 = var6.field6780;
        this.field6838 = var6.field6785;
        this.field6839 = var6.field6786;
        this.field6843 = var6.field6790;
        this.field6852 = var6.field6783;
        this.field6842 = var6.field6791;
        this.field6851 = var6.field6782;
        this.field6845 = var6.field6781;
        this.field6846 = var6.field6788;
        this.field6844 = var6.field6784;
        this.field6847 = var6.field6787;
        this.field6848 = var6.field6789;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Z", line = 330)
    public final boolean method2917(int arg0) {
        if ((this.field6833 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!gu", name = "EA", descriptor = "(III)V", line = 345)
    public final void method202(int arg0, int arg1, int arg2) {
        if (this.field6835[arg0][arg1] < arg2) {
            this.field6835[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(IILw;)Lw;", line = 350)
    public final class279 method199(int arg0, int arg1, class279 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lbj;[I)V", line = 354)
    public final void method198(class227 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!gu", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 357)
    public final void method196(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6850 == null) {
            this.field6850 = new class679[super.field1685][super.field1684];
            this.field6841 = new class316[super.field1685][super.field1684];
        } else if (this.field6837 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class644.field8740[class697.method3856(arg6[var15], true) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class644.field8740[class697.method3856(arg7[var16], true) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field1686 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1686 && arg4[var22] == super.field1686) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1686) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1686 != arg2[var24] && arg2[0] - super.field1686 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1686 != arg4[var24] && arg4[0] - super.field1686 != arg4[var24]) {
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
                class679 var25 = new class679();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field9244 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field9246 = (byte) (var25.field9246 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field6853[arg0 + 1][arg1] == this.field6853[arg0][arg1] && this.field6853[arg0 + 1][arg1 + 1] == this.field6853[arg0][arg1] && this.field6853[arg0][arg1 + 1] == this.field6853[arg0][arg1]) {
                    var25.field9246 = (byte) (var25.field9246 | 1);
                }
                if (var27 != -1 && (var25.field9246 & 2) == 0 && !this.field6832.field8781.method2718(var27, (byte) 72).field1818) {
                    var25.field9242 = this.field6834[arg0][arg1] - this.field6835[arg0][arg1];
                    var25.field9247 = this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1];
                    var25.field9240 = this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1];
                    var25.field9241 = this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1];
                    var25.field9239 = (short) var27;
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
                    var25.field9242 = class29.method184(method2916(arg6[var18] >> 8, this.field6834[arg0][arg1] - this.field6835[arg0][arg1]), -16322, var28, arg10);
                    if (var25.field9244 != 0) {
                        var25.field9242 |= 255 - (this.field6834[arg0][arg1] - this.field6835[arg0][arg1]) << 25;
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
                    var25.field9247 = class29.method184(method2916(arg6[var19] >> 8, this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1]), -16322, var29, arg10);
                    if (var25.field9244 != 0) {
                        var25.field9247 |= 255 - (this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1]) << 25;
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
                    var25.field9240 = class29.method184(method2916(arg6[var20] >> 8, this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1]), -16322, var30, arg10);
                    if (var25.field9244 != 0) {
                        var25.field9240 |= 255 - (this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field9241 = class29.method184(method2916(arg6[var21] >> 8, this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1]), -16322, var31, arg10);
                    if (var25.field9244 != 0) {
                        var25.field9241 |= 255 - (this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1]) << 25;
                    }
                    var25.field9239 = -1;
                }
                if (arg5 != null) {
                    var25.field9243 = (short) arg5[var20];
                    var25.field9245 = (short) arg5[var21];
                    var25.field9238 = (short) arg5[var19];
                    var25.field9248 = (short) arg5[var18];
                }
                this.field6850[arg0][arg1] = var25;
            } else {
                class316 var32 = new class316();
                var32.field3957 = (short) arg2.length;
                var32.field3952 = (short) (arg2.length / 3);
                var32.field3960 = new short[var32.field3957];
                var32.field3954 = new short[var32.field3957];
                var32.field3961 = new short[var32.field3957];
                var32.field3958 = new int[var32.field3957];
                if (arg5 != null) {
                    var32.field3956 = new short[var32.field3957];
                }
                for (int var33 = 0; var33 < var32.field3957; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6834[arg0][arg1] - this.field6835[arg0][arg1];
                    } else if (var48 == 0 && super.field1686 == var49) {
                        var51 = this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1];
                    } else if (super.field1686 == var48 && super.field1686 == var49) {
                        var51 = this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1];
                    } else if (super.field1686 == var48 && var49 == 0) {
                        var51 = this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6834[arg0 + 1][arg1] - this.field6835[arg0 + 1][arg1]) * var48 + (this.field6834[arg0][arg1] - this.field6835[arg0][arg1]) * (super.field1686 - var48);
                        int var53 = (this.field6834[arg0 + 1][arg1 + 1] - this.field6835[arg0 + 1][arg1 + 1]) * var48 + (this.field6834[arg0][arg1 + 1] - this.field6835[arg0][arg1 + 1]) * (super.field1686 - var48);
                        var51 = (super.field1686 - var49) * var52 + var49 * var53 >> super.field1683 * 2;
                    }
                    int var54 = (arg0 << super.field1683) + var48;
                    int var55 = (arg1 << super.field1683) + var49;
                    var32.field3960[var33] = (short) var48;
                    var32.field3961[var33] = (short) var49;
                    var32.field3954[var33] = (short) (this.method194(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6832.field8781.method2718(arg8[var33], (byte) 72).field1818) {
                        var32.field3958[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3958[var33] = var51 << 25;
                        } else {
                            var32.field3958[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3956[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3958[var33] = class29.method184(method2916(arg6[var33] >> 8, var51), -16322, var56, arg10);
                        if (arg7 != null) {
                            var32.field3958[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3952; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6832.field8781.method2718(arg8[var35 * 3], (byte) 72).field1818) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3953 = new int[var32.field3952];
                }
                if (var34) {
                    var32.field3959 = new short[var32.field3952];
                    var32.field3955 = new short[var32.field3952];
                }
                for (int var36 = 0; var36 < var32.field3952; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3953[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6832.field8781.method2718(var42, (byte) 72).field1818) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6832.field8781.method2718(var43, (byte) 72).field1818) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6832.field8781.method2718(var44, (byte) 72).field1818) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3959[var36] = (short) var44;
                            var32.field3955[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6832.field8781.method2718(var45, (byte) 72).field1818) {
                                    var32.field3958[var37] = class644.field8740[class697.method3856(this.field6832.field8781.method2718(var45, (byte) 72).field1825 & 65535, true) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6832.field8781.method2718(var46, (byte) 72).field1818) {
                                    var32.field3958[var38] = class644.field8740[class697.method3856(this.field6832.field8781.method2718(var46, (byte) 72).field1825 & 65535, true) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6832.field8781.method2718(var47, (byte) 72).field1818) {
                                    var32.field3958[var39] = class644.field8740[class697.method3856(this.field6832.field8781.method2718(var47, (byte) 72).field1825 & 65535, true) & 65535];
                                }
                            }
                            var32.field3959[var36] = -1;
                        }
                    }
                }
                this.field6841[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Llea;IIII[[I[[II)V", line = 860)
    public class543(class574 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6832 = arg0;
        this.field6833 = arg2;
        this.field6853 = arg5;
        this.field6834 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6832.field7370 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6832.field7336 * var18 + this.field6832.field7371 * var16 + this.field6832.field7359 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6834[var11][var10] = (byte) var20;
            }
        }
        this.field6835 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!gu", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 856)
    public final void method197(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
    public abstract void method186(int arg0, int arg1);
}
