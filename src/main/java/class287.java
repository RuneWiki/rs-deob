import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class287 extends class174 {

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "I")
    public int field3954 = -1;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Let;")
    public class511 field3940;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "[[I")
    public int[][] field3945;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "[[B")
    private byte[][] field3953;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "[[B")
    private byte[][] field3952;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "[[Llaa;")
    public class102[][] field3937;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "[[Ltu;")
    public class292[][] field3946;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "[[Lpw;")
    public class605[][] field3941;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[[Lrl;")
    public class616[][] field3942;

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Let;IIII[[I[[II)V")
    public class287(class511 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3940 = arg0;
        this.field3957 = arg2;
        this.field3945 = arg5;
        this.field3953 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field3940.field7163 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field3940.field7151 * var18 + this.field3940.field7174 * var17 + this.field3940.field7155 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field3953[var11][var10] = (byte) var20;
            }
        }
        this.field3952 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1109(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field3942 == null) {
            this.field3942 = new class616[super.field2505][super.field2503];
            this.field3946 = new class292[super.field2505][super.field2503];
        } else if (this.field3937 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2504 != var20 || var21 != 0 && super.field2504 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class292 var22 = new class292();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4022 = var23;
            var22.field4021 = new short[var23];
            var22.field4014 = new short[var23];
            var22.field4020 = new short[var23];
            var22.field4019 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4021[var25] = (short) (this.field3953[arg0][arg1] - this.field3952[arg0][arg1]);
                } else if (var30 == 0 && super.field2504 == var31) {
                    var22.field4021[var25] = (short) (this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]);
                } else if (super.field2504 == var30 && super.field2504 == var31) {
                    var22.field4021[var25] = (short) (this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]);
                } else if (super.field2504 == var30 && var31 == 0) {
                    var22.field4021[var25] = (short) (this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]) * var30 + (this.field3953[arg0][arg1] - this.field3952[arg0][arg1]) * (super.field2504 - var30);
                    int var33 = (this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]) * var30 + (this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]) * (super.field2504 - var30);
                    var22.field4021[var25] = (short) ((super.field2504 - var31) * var32 + var31 * var33 >> super.field2506 * 2);
                }
                int var34 = (arg0 << super.field2506) + var30;
                int var35 = (arg1 << super.field2506) + var31;
                var22.field4014[var25] = (short) var30;
                var22.field4019[var25] = (short) var31;
                var22.field4020[var25] = (short) (this.method1105(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4021[var25] < 2) {
                    var22.field4021[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field3940.field2924.method190((byte) -89, arg11[var28]).field2969) {
                    var26 = true;
                }
            }
            var22.field4026 = new int[var27];
            if (arg10 != null) {
                var22.field4017 = new int[var27];
            }
            var22.field4023 = new short[var27];
            var22.field4024 = new short[var27];
            var22.field4025 = new short[var27];
            if (var26) {
                var22.field4016 = new short[var27];
                var22.field4015 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4026[var22.field4018] = class461.method2687(arg9[var29], -1);
                    } else {
                        var22.field4026[var22.field4018] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4017[var22.field4018] = class461.method2687(arg10[var29], -1);
                        } else {
                            var22.field4017[var22.field4018] = -1;
                        }
                    }
                    var22.field4023[var22.field4018] = (short) arg6[var29];
                    var22.field4024[var22.field4018] = (short) arg7[var29];
                    var22.field4025[var22.field4018] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field3940.field2924.method190((byte) -89, arg11[var29]).field2969) {
                            var22.field4016[var22.field4018] = (short) arg11[var29];
                            var22.field4015[var22.field4018] = (short) arg12[var29];
                        } else {
                            var22.field4016[var22.field4018] = -1;
                        }
                    }
                    ++var22.field4018;
                }
            }
            this.field3946[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class616 var36 = new class616();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field8846 = class306.method1937(class461.method2687(arg10[0], -1), 127, this.field3953[arg0][arg1] - this.field3952[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field8843 = (byte) (var36.field8843 | 2);
                    }
                }
                if (this.field3945[arg0 + 1][arg1] == this.field3945[arg0][arg1] && this.field3945[arg0 + 1][arg1 + 1] == this.field3945[arg0][arg1] && this.field3945[arg0][arg1 + 1] == this.field3945[arg0][arg1]) {
                    var36.field8843 = (byte) (var36.field8843 | 1);
                }
                if (var38 != -1 && (var36.field8843 & 2) == 0 && !this.field3940.field2924.method190((byte) -89, var38).field2969) {
                    var36.field8842 = (short) (this.field3953[arg0][arg1] - this.field3952[arg0][arg1]);
                    var36.field8841 = (short) (this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]);
                    var36.field8847 = (short) (this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]);
                    var36.field8845 = (short) (this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]);
                    var36.field8844 = (short) var38;
                } else {
                    short var39 = class461.method2687(var37, -1);
                    var36.field8842 = (short) class306.method1937(var39, 127, this.field3953[arg0][arg1] - this.field3952[arg0][arg1]);
                    var36.field8841 = (short) class306.method1937(var39, 127, this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]);
                    var36.field8847 = (short) class306.method1937(var39, 127, this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]);
                    var36.field8845 = (short) class306.method1937(var39, 127, this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]);
                    var36.field8844 = -1;
                }
                this.field3942[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lrh;[I)V")
    public final void method1095(class223 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public abstract void method1101(int arg0, int arg1);

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "()V")
    public final void method1098() {
        this.field3953 = null;
        this.field3952 = null;
    }

    @OriginalMember(owner = "client!ng", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1107(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "(III)V")
    public final void method1097(int arg0, int arg1, int arg2) {
        if (this.field3952[arg0][arg1] < arg2) {
            this.field3952[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1099(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class195 var6 = this.field3940.field7169;
        this.field3954 = -1;
        this.field3955 = var6.field2770;
        this.field3956 = var6.field2769;
        this.field3939 = var6.field2772;
        this.field3950 = var6.field2768;
        this.field3947 = var6.field2765;
        this.field3943 = var6.field2762;
        this.field3944 = var6.field2763;
        this.field3948 = var6.field2767;
        this.field3951 = var6.field2771;
        this.field3958 = var6.field2773;
        this.field3949 = var6.field2766;
        this.field3938 = var6.field2764;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)I")
    private static final int method1830(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1102(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!ng", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field3937 == null) {
            this.field3937 = new class102[super.field2505][super.field2503];
            this.field3941 = new class605[super.field2505][super.field2503];
        } else if (this.field3942 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class439.field6243[class461.method2687(arg6[var15], -1) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class439.field6243[class461.method2687(arg7[var16], -1) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field2504 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2504 && arg4[var22] == super.field2504) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2504) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2504 != arg2[var24] && arg2[0] - super.field2504 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2504 != arg4[var24] && arg4[0] - super.field2504 != arg4[var24]) {
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
                class102 var25 = new class102();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1554 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1548 = (byte) (var25.field1548 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field3945[arg0 + 1][arg1] == this.field3945[arg0][arg1] && this.field3945[arg0 + 1][arg1 + 1] == this.field3945[arg0][arg1] && this.field3945[arg0][arg1 + 1] == this.field3945[arg0][arg1]) {
                    var25.field1548 = (byte) (var25.field1548 | 1);
                }
                if (var27 != -1 && (var25.field1548 & 2) == 0 && !this.field3940.field2924.method190((byte) -89, var27).field2969) {
                    var25.field1549 = this.field3953[arg0][arg1] - this.field3952[arg0][arg1];
                    var25.field1555 = this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1];
                    var25.field1553 = this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1];
                    var25.field1551 = this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1];
                    var25.field1545 = (short) var27;
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
                    var25.field1549 = class15.method176(method1830(arg6[var18] >> 8, this.field3953[arg0][arg1] - this.field3952[arg0][arg1]), (byte) -59, arg10, var28);
                    if (var25.field1554 != 0) {
                        var25.field1549 |= 255 - (this.field3953[arg0][arg1] - this.field3952[arg0][arg1]) << 25;
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
                    var25.field1555 = class15.method176(method1830(arg6[var19] >> 8, this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]), (byte) -59, arg10, var29);
                    if (var25.field1554 != 0) {
                        var25.field1555 |= 255 - (this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]) << 25;
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
                    var25.field1553 = class15.method176(method1830(arg6[var20] >> 8, this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]), (byte) -59, arg10, var30);
                    if (var25.field1554 != 0) {
                        var25.field1553 |= 255 - (this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field1551 = class15.method176(method1830(arg6[var21] >> 8, this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]), (byte) -59, arg10, var31);
                    if (var25.field1554 != 0) {
                        var25.field1551 |= 255 - (this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1545 = -1;
                }
                if (arg5 != null) {
                    var25.field1552 = (short) arg5[var20];
                    var25.field1547 = (short) arg5[var21];
                    var25.field1550 = (short) arg5[var19];
                    var25.field1546 = (short) arg5[var18];
                }
                this.field3937[arg0][arg1] = var25;
            } else {
                class605 var32 = new class605();
                var32.field8718 = (short) arg2.length;
                var32.field8719 = (short) (arg2.length / 3);
                var32.field8722 = new short[var32.field8718];
                var32.field8720 = new short[var32.field8718];
                var32.field8714 = new short[var32.field8718];
                var32.field8713 = new int[var32.field8718];
                if (arg5 != null) {
                    var32.field8721 = new short[var32.field8718];
                }
                for (int var33 = 0; var33 < var32.field8718; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field3953[arg0][arg1] - this.field3952[arg0][arg1];
                    } else if (var48 == 0 && super.field2504 == var49) {
                        var51 = this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1];
                    } else if (super.field2504 == var48 && super.field2504 == var49) {
                        var51 = this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1];
                    } else if (super.field2504 == var48 && var49 == 0) {
                        var51 = this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field3953[arg0 + 1][arg1] - this.field3952[arg0 + 1][arg1]) * var48 + (this.field3953[arg0][arg1] - this.field3952[arg0][arg1]) * (super.field2504 - var48);
                        int var53 = (this.field3953[arg0 + 1][arg1 + 1] - this.field3952[arg0 + 1][arg1 + 1]) * var48 + (this.field3953[arg0][arg1 + 1] - this.field3952[arg0][arg1 + 1]) * (super.field2504 - var48);
                        var51 = (super.field2504 - var49) * var52 + var49 * var53 >> super.field2506 * 2;
                    }
                    int var54 = (arg0 << super.field2506) + var48;
                    int var55 = (arg1 << super.field2506) + var49;
                    var32.field8722[var33] = (short) var48;
                    var32.field8714[var33] = (short) var49;
                    var32.field8720[var33] = (short) (this.method1105(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field3940.field2924.method190((byte) -89, arg8[var33]).field2969) {
                        var32.field8713[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field8713[var33] = var51 << 25;
                        } else {
                            var32.field8713[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field8721[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field8713[var33] = class15.method176(method1830(arg6[var33] >> 8, var51), (byte) -59, arg10, var56);
                        if (arg7 != null) {
                            var32.field8713[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field8719; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field3940.field2924.method190((byte) -89, arg8[var35 * 3]).field2969) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field8716 = new int[var32.field8719];
                }
                if (var34) {
                    var32.field8715 = new short[var32.field8719];
                    var32.field8717 = new short[var32.field8719];
                }
                for (int var36 = 0; var36 < var32.field8719; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field8716[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field3940.field2924.method190((byte) -89, var42).field2969) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field3940.field2924.method190((byte) -89, var43).field2969) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field3940.field2924.method190((byte) -89, var44).field2969) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field8715[var36] = (short) var44;
                            var32.field8717[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field3940.field2924.method190((byte) -89, var45).field2969) {
                                    var32.field8713[var37] = class439.field6243[class461.method2687(this.field3940.field2924.method190((byte) -89, var45).field2967 & 65535, -1) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field3940.field2924.method190((byte) -89, var46).field2969) {
                                    var32.field8713[var38] = class439.field6243[class461.method2687(this.field3940.field2924.method190((byte) -89, var46).field2967 & 65535, -1) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field3940.field2924.method190((byte) -89, var47).field2969) {
                                    var32.field8713[var39] = class439.field6243[class461.method2687(this.field3940.field2924.method190((byte) -89, var47).field2967 & 65535, -1) & 65535];
                                }
                            }
                            var32.field8715[var36] = -1;
                        }
                    }
                }
                this.field3941[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1106(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Z")
    public final boolean method1831(int arg0) {
        if ((this.field3957 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "(IILk;)Lk;")
    public final class485 method1096(int arg0, int arg1, class485 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!ng", name = "ba", descriptor = "(II)I")
    public final int method1104(int arg0, int arg1) {
        return this.field3945[arg0][arg1];
    }

    @OriginalMember(owner = "client!ng", name = "aa", descriptor = "(II)I")
    public final int method1105(int arg0, int arg1) {
        int var3 = arg0 >> super.field2506;
        int var4 = arg1 >> super.field2506;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2505 - 1 && var4 <= super.field2503 - 1) {
            int var5 = arg0 & super.field2504 - 1;
            int var6 = arg1 & super.field2504 - 1;
            int var7 = (super.field2504 - var5) * this.field3945[var3][var4] + this.field3945[var3 + 1][var4] * var5 >> super.field2506;
            int var8 = (super.field2504 - var5) * this.field3945[var3][var4 + 1] + this.field3945[var3 + 1][var4 + 1] * var5 >> super.field2506;
            return (super.field2504 - var6) * var7 + var6 * var8 >> super.field2506;
        } else {
            return 0;
        }
    }
}
