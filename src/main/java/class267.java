import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class267 extends class35 {

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Lko;")
    private class348 field3851 = new class348();

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "Lqg;")
    public class321 field3883;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "[[I")
    private int[][] field3880;

    @OriginalMember(owner = "client!pp", name = "U", descriptor = "I")
    private int field3886;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    private int field3874;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "[[[I")
    public int[][][] field3872;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "[[[I")
    private int[][][] field3862;

    @OriginalMember(owner = "client!pp", name = "gb", descriptor = "[[F")
    private float[][] field3898;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "[[[I")
    public int[][][] field3853;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[[B")
    private byte[][] field3849;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "[[[Lkr;")
    private class523[][][] field3861;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "[[S")
    public short[][] field3879;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[[[I")
    private int[][][] field3852;

    @OriginalMember(owner = "client!pp", name = "hb", descriptor = "[[F")
    private float[][] field3899;

    @OriginalMember(owner = "client!pp", name = "bb", descriptor = "[[B")
    private byte[][] field3893;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "[[[I")
    private int[][][] field3871;

    @OriginalMember(owner = "client!pp", name = "Z", descriptor = "[[F")
    private float[][] field3891;

    @OriginalMember(owner = "client!pp", name = "ab", descriptor = "Lcv;")
    private class398 field3892;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "Lab;")
    private class471 field3865;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field3859 = 0;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "Lao;")
    public static class188 field3869 = new class188(30, 3);

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    private int field3877;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!pp", name = "S", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!pp", name = "T", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!pp", name = "db", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!pp", name = "eb", descriptor = "I")
    private int field3896;

    @OriginalMember(owner = "client!pp", name = "V", descriptor = "Lwt;")
    private class202 field3887;

    @OriginalMember(owner = "client!pp", name = "Y", descriptor = "Lwt;")
    public class202 field3890;

    @OriginalMember(owner = "client!pp", name = "cb", descriptor = "Lwt;")
    public class202 field3894;

    @OriginalMember(owner = "client!pp", name = "fb", descriptor = "Lwt;")
    public class202 field3897;

    @OriginalMember(owner = "client!pp", name = "X", descriptor = "Luv;")
    private class243 field3889;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pp", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field3900;

    @OriginalMember(owner = "client!pp", name = "W", descriptor = "[Lkr;")
    private class523[] field3888;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "[Lf;")
    public static class528[] field3856;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "[[[I")
    private int[][][] field3864;

    @OriginalMember(owner = "client!pp", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method282(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3855;
        if (arg3 != null && this.field3862 == null) {
            this.field3862 = new int[super.field532][super.field531][];
        }
        if (arg5 != null && this.field3864 == null) {
            this.field3864 = new int[super.field532][super.field531][];
        }
        this.field3853[arg0][arg1] = arg2;
        this.field3872[arg0][arg1] = arg4;
        this.field3871[arg0][arg1] = arg6;
        this.field3852[arg0][arg1] = arg7;
        if (this.field3864 != null) {
            this.field3864[arg0][arg1] = arg5;
        }
        if (this.field3862 != null) {
            this.field3862[arg0][arg1] = arg3;
        }
        class523[] var15 = this.field3861[arg0][arg1] = new class523[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14);
            class439 var19;
            for (var19 = this.field3892.method2485(32, var17); var19 != null; var19 = this.field3892.method2480(-1)) {
                class523 var20 = (class523) var19;
                if (~arg8[var16] == ~var20.field7694 && (float) arg9[var16] == var20.field7683 && ~var20.field7698 == ~arg10 && ~var20.field7697 == ~arg11 && var20.field7685 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class523(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3892.method2486(-107, var15[var16], var17);
            } else {
                var15[var16] = (class523) var19;
            }
        }
        if (arg13) {
            this.field3849[arg0][arg1] = (byte) class29.method239(this.field3849[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field3895) {
            this.field3895 = arg6.length;
        }
        this.field3896 += arg6.length;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1707(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3875;
        if (arg4 >= 0 && arg0 >= 0 && ~(class237.field3436 + -1) < ~arg4 && ~(class83.field1366 - 1) < ~arg0) {
            if (class36.field545 == null) {
                return;
            }
            if (arg3 != 0) {
                if (arg3 != 1) {
                    if (~arg3 != -3) {
                        if (~arg3 == -4) {
                            class232 var8 = (class232) class358.method2310(arg5, arg4, arg0);
                            if (var8 != null) {
                                if (var8 instanceof class412) {
                                    ((class412) var8).field6067.method1547(arg2, 72);
                                } else {
                                    class459.method2751(arg6, arg4, arg5, (byte) 80, arg0, var8.method379((byte) -96), arg2, arg3, arg7);
                                }
                            }
                        }
                    } else {
                        class232 var9 = (class232) class51.method372(arg5, arg4, arg0, field3900 != null ? field3900 : (field3900 = method1713("rq")));
                        if (var9 != null) {
                            if (~arg7 == -12) {
                                arg7 = 10;
                            }
                            if (var9 instanceof class52) {
                                ((class52) var9).field759.method1547(arg2, 123);
                            } else {
                                class459.method2751(arg6, arg4, arg5, (byte) 94, arg0, var9.method379((byte) -96), arg2, arg3, arg7);
                            }
                        }
                    }
                } else {
                    class232 var10 = (class232) class7.method52(arg5, arg4, arg0);
                    if (var10 != null) {
                        if (!(var10 instanceof class258)) {
                            int var11 = var10.method379((byte) -96);
                            if (~arg7 != -5 && arg7 != 5) {
                                if (~arg7 != -7) {
                                    if (~arg7 == -8) {
                                        class459.method2751((3 & arg6 + 2) + 4, arg4, arg5, (byte) 74, arg0, var11, arg2, arg3, 4);
                                    } else if (~arg7 == -9) {
                                        class459.method2751(arg6 - -4, arg4, arg5, (byte) 22, arg0, var11, arg2, arg3, 4);
                                        class459.method2751((3 & arg6 - -2) - -4, arg4, arg5, (byte) 33, arg0, var11, arg2, arg3, 4);
                                    }
                                } else {
                                    class459.method2751(arg6 + 4, arg4, arg5, (byte) 122, arg0, var11, arg2, arg3, 4);
                                }
                            } else {
                                class459.method2751(arg6, arg4, arg5, (byte) 63, arg0, var11, arg2, arg3, 4);
                            }
                        } else {
                            ((class258) var10).field3718.method1547(arg2, 74);
                        }
                    }
                }
            } else {
                class232 var12 = (class232) class396.method2468(arg5, arg4, arg0);
                class232 var13 = (class232) class507.method3001(arg5, arg4, arg0);
                if (var12 != null && arg7 != 2) {
                    if (!(var12 instanceof class375)) {
                        class459.method2751(arg6, arg4, arg5, (byte) 21, arg0, var12.method379((byte) -96), arg2, arg3, arg7);
                    } else {
                        ((class375) var12).field5615.method1547(arg2, 113);
                    }
                }
                if (var13 != null) {
                    if (!(var13 instanceof class375)) {
                        class459.method2751(arg6, arg4, arg5, (byte) 87, arg0, var13.method379((byte) -96), arg2, arg3, arg7);
                    } else {
                        ((class375) var13).field5615.method1547(arg2, 103);
                    }
                }
            }
        }
        if (arg1) {
            method1709(-67);
        }
    }

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "()V")
    public final void method284() {
        if (this.field3896 > 0) {
            byte[][] var1 = new byte[super.field532 + 1][super.field531 + 1];
            for (int var2 = 1; ~super.field532 < ~var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field531; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3893[var2][var103] >> 1) + (this.field3893[var2][var103 + 1] >> 3) + (this.field3893[var2][var103 + -1] >> 2) + (this.field3893[var2 - 1][var103] >> 2) + (this.field3893[var2 + 1][var103] >> 3));
                }
            }
            this.field3888 = new class523[this.field3892.method2482(0)];
            this.field3892.method2478(this.field3888, (byte) -36);
            for (int var3 = 0; ~var3 > ~this.field3888.length; ++var3) {
                this.field3888[var3].method3086((byte) 104, this.field3896);
            }
            int var4 = 24;
            if (this.field3864 != null) {
                var4 += 4;
            }
            if (~(this.field3870 & 7) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field3883.field4783.method2658(this.field3896 * var4);
            NativeStream var6 = new NativeStream(var5);
            class523[] var7 = new class523[this.field3896];
            int var8 = class466.method2780(81, this.field3896 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class398 var9 = new class398(var8);
            class523[] var10 = new class523[this.field3895];
            for (int var11 = 0; var11 < super.field532; ++var11) {
                for (int var30 = 0; super.field531 > var30; ++var30) {
                    if (this.field3871[var11][var30] != null) {
                        class523[] var31 = this.field3861[var11][var30];
                        int[] var32 = this.field3853[var11][var30];
                        int[] var33 = this.field3872[var11][var30];
                        int[] var34 = this.field3852[var11][var30];
                        int[] var35 = this.field3871[var11][var30];
                        int[] var36 = this.field3862 != null ? this.field3862[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field3864 == null ? null : this.field3864[var11][var30];
                        float var38 = this.field3898[var11][var30];
                        float var39 = this.field3899[var11][var30];
                        float var40 = this.field3891[var11][var30];
                        float var41 = this.field3898[var11][var30 + 1];
                        float var42 = this.field3899[var11][var30 + 1];
                        float var43 = this.field3891[var11][var30 + 1];
                        float var44 = this.field3898[var11 + 1][var30 + 1];
                        float var45 = this.field3899[var11 + 1][var30 + 1];
                        float var46 = this.field3891[var11 + 1][var30 + 1];
                        float var47 = this.field3898[var11 + 1][var30];
                        float var48 = this.field3899[var11 + 1][var30];
                        float var49 = this.field3891[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label341: for (int var55 = 0; var35.length > var55; ++var55) {
                            class523 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3879[super.field532 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field535) + var32[var57];
                            int var59 = (var30 << super.field535) - -var33[var57];
                            int var60 = var58 >> this.field3886;
                            int var61 = var59 >> this.field3886;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (~var67 == -1 && ~var68 == -1) {
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                                var75 = var39;
                            } else if (var67 == 0 && ~super.field534 == ~var68) {
                                var74 = var43;
                                var73 = var41;
                                var75 = var42;
                                var72 = var69 - var51;
                            } else if (super.field534 == var67 && ~super.field534 == ~var68) {
                                var75 = var45;
                                var74 = var46;
                                var73 = var44;
                                var72 = var69 - var52;
                            } else if (super.field534 == var67 && var68 == 0) {
                                var74 = var49;
                                var72 = var69 - var53;
                                var75 = var48;
                                var73 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field534;
                                float var77 = (float) var68 / (float) super.field534;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var73 = (var81 - var78) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (var82 - var79) * var77 + var79;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = var50 - -((-var50 + var53) * var67 >> super.field535);
                                int var85 = ((var52 - var51) * var67 >> super.field535) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field535) + var84);
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (~var86 <= -3) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(7 & this.field3870) == -1) {
                                    float var87 = this.field3883.field4859[2] * var74 + this.field3883.field4859[1] * var75 + this.field3883.field4859[0] * var73;
                                    var71 = this.field3883.field4875 + (var87 > 0.0F ? this.field3883.field4821 : this.field3883.field4889) * var87;
                                }
                                var70 = class430.field6265[var86 | var62 & 65408];
                            }
                            class439 var88 = null;
                            if ((var58 & this.field3874 + -1) == 0 && ~(var59 & this.field3874 + -1) == -1) {
                                var88 = var9.method2485(97, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class430.field6265[var90 | var63 & 65408];
                                    if (~(7 & this.field3870) == -1) {
                                        float var91 = this.field3883.field4859[2] * var74 + this.field3883.field4859[0] * var73 + this.field3883.field4859[1] * var75;
                                        float var92 = this.field3883.field4875 + (!(var71 > 0.0F) ? this.field3883.field4889 : this.field3883.field4821) * var71;
                                        int var93 = (16739114 & var89) >> 16;
                                        int var94 = (65310 & var89) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 >= 0) {
                                            if (var95 > 255) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var97 << 8 | var95 << 16 | var98;
                                    }
                                }
                                if (this.field3883.field4850) {
                                    var6.method2654((float) var58);
                                    var6.method2654((float) (var64 + this.method273(var58, var59)));
                                    var6.method2654((float) var59);
                                    var6.method2655((byte) (var89 >> 16));
                                    var6.method2655((byte) (var89 >> 8));
                                    var6.method2655((byte) var89);
                                    var6.method2655(-1);
                                    var6.method2654((float) var58);
                                    var6.method2654((float) var59);
                                    if (this.field3864 != null) {
                                        var6.method2654((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(7 & this.field3870) != -1) {
                                        var6.method2654(var73);
                                        var6.method2654(var75);
                                        var6.method2654(var74);
                                    }
                                } else {
                                    var6.method2650((float) var58);
                                    var6.method2650((float) (this.method273(var58, var59) - -var64));
                                    var6.method2650((float) var59);
                                    var6.method2655((byte) (var89 >> 16));
                                    var6.method2655((byte) (var89 >> 8));
                                    var6.method2655((byte) var89);
                                    var6.method2655(-1);
                                    var6.method2650((float) var58);
                                    var6.method2650((float) var59);
                                    if (this.field3864 != null) {
                                        var6.method2650((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field3870 & 7) != -1) {
                                        var6.method2650(var73);
                                        var6.method2650(var75);
                                        var6.method2650(var74);
                                    }
                                }
                                var99 = this.field3877++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2486(72, new class135(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class135) var88).field2075;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var99].field6399 > var31[var57].field6399) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method3089(var99, var71, 131586, var72, var70);
                            }
                            ++this.field3882;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field3877 < ~var12; ++var12) {
                class523 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3088(var12, (byte) 55);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field532; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field531; ++var18) {
                    short[] var19 = this.field3879[super.field532 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class523 var25 = var7[var22];
                            class523 var26 = var7[var23];
                            class523 var27 = var7[var24];
                            class523 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method3092(var13, var20, var18, true);
                            }
                            if (var26 != null) {
                                var26.method3092(var13, var20, var18, true);
                                if (var28 == null || ~var26.field6399 > ~var28.field6399) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3092(var13, var20, var18, true);
                                if (var28 == null || var27.field6399 < var28.field6399) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3088(var22, (byte) 55);
                                }
                                if (var26 != null) {
                                    var28.method3088(var23, (byte) 55);
                                }
                                if (var27 != null) {
                                    var28.method3088(var24, (byte) 55);
                                }
                                var28.method3092(var13, var20, var18, true);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2656();
            this.field3889 = this.field3883.method2023(false, var5, 17999, var4, var6.method2651());
            this.field3897 = new class202(this.field3889, 5126, 3, 0);
            this.field3887 = new class202(this.field3889, 5121, 4, 12);
            byte var14;
            if (this.field3864 != null) {
                var14 = 28;
                this.field3890 = new class202(this.field3889, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field3890 = new class202(this.field3889, 5126, 2, 16);
            }
            if ((7 & this.field3870) != 0) {
                this.field3894 = new class202(this.field3889, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3888.length];
            for (int var16 = 0; ~var16 > ~this.field3888.length; ++var16) {
                class523 var17 = this.field3888[var16];
                var15[var16] = var17.field6399;
                var17.method3090(112, this.field3877);
            }
            class513.method3038((byte) -106, this.field3888, var15);
            if (this.field3865 != null) {
                this.field3865.method2810(1);
            }
        } else {
            this.field3865 = null;
        }
        ++field3848;
        this.field3892 = null;
        this.field3861 = null;
        this.field3893 = null;
        this.field3898 = this.field3899 = this.field3891 = null;
        this.field3862 = null;
        this.field3871 = null;
        this.field3864 = null;
        this.field3853 = this.field3872 = null;
        this.field3852 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method274(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3884;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method282(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public final boolean method278(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3866;
        if (this.field3865 != null && arg0 != null) {
            int var7 = arg1 - (this.field3883.field4879 * arg2 >> 8) >> this.field3883.field4785;
            int var8 = -(this.field3883.field4841 * arg2 >> 8) + arg3 >> this.field3883.field4785;
            return this.field3865.method2816(arg0, var8, true, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "(IILj;)Lj;")
    public final class377 method277(int arg0, int arg1, class377 arg2) {
        ++field3867;
        if ((this.field3849[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field534 >> this.field3883.field4785;
            class205 var5 = (class205) arg2;
            class205 var6;
            if (var5 != null && var5.method1377(var4, (byte) -21, var4)) {
                var6 = var5;
                var5.method1376(-1);
            } else {
                var6 = new class205(this.field3883, var4, var4);
            }
            var6.method1374(0, var4, (byte) -92, 0, var4);
            this.method1710((byte) -120, arg0, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3868;
        if (~this.field3896 < -1) {
            this.field3883.method2043(0);
            this.field3883.method2018(false, 22090);
            this.field3883.method2024(true, false);
            this.field3883.method2016((byte) -56, false);
            this.field3883.method2052((byte) 24, false);
            this.field3883.method2061(0, (byte) -63);
            this.field3883.method2008(-2, 848);
            this.field3883.method2042((class440) null, 0);
            class120.field1888[11] = 0.0F;
            class120.field1888[10] = 0.0F;
            class120.field1888[6] = 0.0F;
            class120.field1888[0] = (float) arg2 / ((float) super.field534 * 128.0F * (float) this.field3883.field4749);
            class120.field1888[2] = 0.0F;
            class120.field1888[4] = 0.0F;
            class120.field1888[7] = 0.0F;
            class120.field1888[8] = 0.0F;
            class120.field1888[14] = 0.0F;
            class120.field1888[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3883.field4749) + -1.0F;
            class120.field1888[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3883.field4737) + 1.0F;
            class120.field1888[15] = 1.0F;
            class120.field1888[5] = (float) arg2 / ((float) super.field534 * 128.0F * (float) this.field3883.field4737);
            class120.field1888[1] = 0.0F;
            class120.field1888[9] = 0.0F;
            class120.field1888[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class120.field1888, 0);
            class120.field1888[11] = 0.0F;
            class120.field1888[0] = 1.0F;
            class120.field1888[7] = 0.0F;
            class120.field1888[1] = 0.0F;
            class120.field1888[8] = 0.0F;
            class120.field1888[12] = 0.0F;
            class120.field1888[13] = 0.0F;
            class120.field1888[4] = 0.0F;
            class120.field1888[2] = 0.0F;
            class120.field1888[14] = 0.0F;
            class120.field1888[15] = 1.0F;
            class120.field1888[9] = 1.0F;
            class120.field1888[10] = 0.0F;
            class120.field1888[6] = 1.0F;
            class120.field1888[3] = 0.0F;
            class120.field1888[5] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class120.field1888, 0);
            if (~(7 & this.field3870) != -1) {
                this.field3883.method2024(true, true);
                this.field3883.method2090(16384);
            } else {
                this.field3883.method2024(true, false);
            }
            this.field3883.method2085(this.field3897, this.field3894, this.field3890, -29066, this.field3887);
            if (class356.field5381.field4326.length < this.field3882 * 2) {
                class356.field5381 = new class303(this.field3882 * 2);
            } else {
                class356.field5381.field4333 = 0;
            }
            int var9 = 0;
            if (this.field3883.field4850) {
                for (int var10 = arg4; arg6 > var10; ++var10) {
                    int var11 = super.field532 * var10 + arg3;
                    for (int var12 = arg3; ~arg5 < ~var12; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field3879[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var14 < var13.length; ++var14) {
                                    ++var9;
                                    class356.field5381.method1874(65535 & var13[var14], (byte) -110);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; ~arg6 < ~var15; ++var15) {
                    int var17 = super.field532 * var15 + arg3;
                    for (int var18 = arg3; arg5 > var18; ++var18) {
                        if (arg7[var18 - arg3][-arg4 + var15]) {
                            short[] var19 = this.field3879[var17];
                            if (var19 != null) {
                                for (int var20 = 0; var19.length > var20; ++var20) {
                                    ++var9;
                                    class356.field5381.method1863((byte) -98, var19[var20] & 65535);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (var9 > 0) {
                class320 var16 = new class320(this.field3883, 5123, class356.field5381.field4326, class356.field5381.field4333);
                this.field3883.method2086(var9, var16, 0, 4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "U", descriptor = "(Lj;IIIIZ)V")
    public final void method275(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3857;
        if (this.field3865 != null && arg0 != null) {
            int var7 = -(this.field3883.field4879 * arg2 >> 8) + arg1 >> this.field3883.field4785;
            int var8 = arg3 - (this.field3883.field4841 * arg2 >> 8) >> this.field3883.field4785;
            this.field3865.method2813(104, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBII[[ZZ)V")
    private final void method1708(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean[][] arg5, boolean arg6) {
        if (this.field3888 != null) {
            float var8 = this.field3883.field4924;
            float var9 = this.field3883.field4858;
            int var10 = arg3 - -arg3 + 1;
            int var11 = var10 * var10;
            if (var11 > class245.field3537.length) {
                class245.field3537 = new int[var11];
            }
            if (this.field3882 * 2 > class356.field5381.field4326.length) {
                class356.field5381 = new class303(this.field3882 * 2);
            }
            int var12 = -arg3 + arg4;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg0 - arg3;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg3 + arg4;
            if (~(super.field532 + -1) > ~var16) {
                var16 = super.field532 + -1;
            }
            int var17 = arg0 - -arg3;
            if (~(super.field531 - 1) > ~var17) {
                var17 = super.field531 + -1;
            }
            class249.field3594 = 0;
            for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                boolean[] var24 = arg5[-var13 + var18];
                for (int var25 = var14; var17 >= var25; ++var25) {
                    if (var24[-var15 + var25]) {
                        class245.field3537[class249.field3594++] = super.field532 * var25 + var18;
                    }
                }
            }
            if (~arg1 == 0) {
                this.field3883.method2027(-107);
            } else {
                this.field3883.method2038((float) arg1, false);
                this.field3883.method2050((byte) -114);
            }
            this.field3883.method2024(true, (7 & this.field3870) != 0);
            for (int var19 = 0; ~this.field3888.length < ~var19; ++var19) {
                this.field3888[var19].method3093(class249.field3594, -115, class245.field3537);
            }
            if (!this.field3851.method2268((byte) -99)) {
                int var20 = this.field3883.field4917;
                int var21 = this.field3883.field4808;
                this.field3883.method535(0, var21, this.field3883.field4837);
                this.field3883.method514(var9, var8 - 4.0F);
                this.field3883.method2024(true, false);
                this.field3883.method2052((byte) 22, false);
                this.field3883.method2061(128, (byte) -123);
                this.field3883.method2008(-2, 848);
                this.field3883.method2042(this.field3883.field4826, 0);
                this.field3883.method2070(81, 7681, 8448);
                this.field3883.method2053(11, 0, 34166, 770);
                this.field3883.method2034(0, 34167, 770, 8960);
                for (class439 var22 = this.field3851.method2257((byte) 95); var22 != null; var22 = this.field3851.method2256(40)) {
                    class437 var23 = (class437) var22;
                    var23.method2643(arg3, arg5, arg0, arg4, (byte) 43);
                }
                this.field3883.method2053(125, 0, 5890, 768);
                this.field3883.method2034(0, 5890, 770, 8960);
                this.field3883.method2042((class440) null, 0);
                this.field3883.method535(var20, var21, this.field3883.field4837);
            }
            if (this.field3865 != null) {
                this.field3883.method514(var9, var8 - 8.0F);
                this.field3883.method2027(-53);
                this.field3883.method2085(this.field3897, (class202) null, this.field3890, -29066, (class202) null);
                this.field3865.method2814(arg4, (byte) -36, arg5, arg3, arg6, arg0);
            }
            this.field3883.method514(var9, var8);
        }
        if (arg2 != -116) {
            this.method278((class377) null, 85, 56, 46, 115, false);
        }
        ++field3863;
    }

    @OriginalMember(owner = "client!pp", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public final void method276(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3885;
        if (this.field3865 != null && arg0 != null) {
            int var7 = -(this.field3883.field4879 * arg2 >> 8) + arg1 >> this.field3883.field4785;
            int var8 = -(this.field3883.field4841 * arg2 >> 8) + arg3 >> this.field3883.field4785;
            this.field3865.method2815(5340, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "(II)I")
    public final int method271(int arg0, int arg1) {
        ++field3860;
        return this.field3880[arg0][arg1];
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static final void method1709(int arg0) {
        ++field3854;
        class321.method2045(true);
        class240.method1558(2, class397.field5830.field118, 60, 22050);
        class84.field1407 = class21.method176(22050, (byte) 122, class112.field1785, arg0, class31.field503);
        class84.field1407.method1150(false, class108.field1681);
        class204.field2944 = class21.method176(2048, (byte) -92, class112.field1785, 1, class31.field503);
        class204.field2944.method1150(false, class124.field1920);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BILcd;I)V")
    private final void method1710(byte arg0, int arg1, class205 arg2, int arg3) {
        ++field3878;
        int[] var5 = this.field3853[arg1][arg3];
        int[] var6 = this.field3872[arg1][arg3];
        if (arg0 < -110) {
            int var7 = var5.length;
            if (~class107.field1673.length > ~var7) {
                class107.field1673 = new int[var7];
                class179.field2721 = new int[var7];
            }
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                class107.field1673[var8] = class388.method2441(255, var5[var8]) >> this.field3883.field4785;
                class179.field2721[var8] = class388.method2441(var6[var8], 255) >> this.field3883.field4785;
            }
            int var9 = 0;
            while (~var7 < ~var9) {
                int var10 = class107.field1673[var9];
                int var11 = class179.field2721[var9++];
                int var12 = class107.field1673[var9];
                int var13 = class179.field2721[var9++];
                int var14 = class107.field1673[var9];
                int var15 = class179.field2721[var9++];
                if ((-var12 + var10) * (-var15 + var13) + -((-var11 + var13) * (-var12 + var14)) > 0) {
                    arg2.method1371(var10, var12, true, var15, var11, var14, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ltj;[I)V")
    public final void method281(class131 arg0, int[] arg1) {
        this.field3851.method2270(0, new class437(this.field3883, this, arg0, arg1));
        ++field3858;
    }

    @OriginalMember(owner = "client!pp", name = "QA", descriptor = "(III)V")
    public final void method272(int arg0, int arg1, int arg2) {
        if ((255 & this.field3893[arg0][arg1]) < arg2) {
            this.field3893[arg0][arg1] = (byte) arg2;
        }
        ++field3850;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
    public final void method279(int arg0, int arg1) {
        ++field3881;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIZILoe;II)Z")
    public static final boolean method1711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class133 arg8, int arg9, int arg10) {
        ++field3876;
        int var11 = arg10;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg10;
        int var16 = arg0 - var14;
        class54.field800[var13][var14] = 99;
        class466.field6859[var13][var14] = 0;
        byte var17 = 0;
        class127.field1935[var17] = arg10;
        int var18 = 0;
        if (arg6) {
            return true;
        } else {
            byte var10001 = var17;
            int var26 = var17 + 1;
            class185.field2760[var10001] = arg0;
            int[][] var19 = arg8.field2047;
            while (var26 != var18) {
                var11 = class127.field1935[var18];
                var12 = class185.field2760[var18];
                int var20 = var11 - var15;
                var18 = 4095 & var18 + 1;
                int var21 = -var16 + var12;
                int var22 = -arg8.field2050 + var11;
                int var23 = -arg8.field2052 + var12;
                if (arg9 != -4) {
                    if (~arg9 != 2) {
                        if (~arg9 != 1) {
                            if (arg9 != -1) {
                                if (arg9 != 0 && ~arg9 != -2 && ~arg9 != -3 && arg9 != 3 && arg9 != 9) {
                                    if (arg8.method971(arg5, var11, arg9, arg3, 2, 0, arg7, var12)) {
                                        class407.field5985 = var12;
                                        class366.field5490 = var11;
                                        return true;
                                    }
                                } else if (arg8.method979(var11, 2, arg3, 0, arg5, arg9, var12, arg7)) {
                                    class407.field5985 = var12;
                                    class366.field5490 = var11;
                                    return true;
                                }
                            } else if (arg8.method974(arg2, 2, arg1, arg3, arg4, var12, 2, var11, arg7)) {
                                class407.field5985 = var12;
                                class366.field5490 = var11;
                                return true;
                            }
                        } else if (arg8.method972(arg7, 2, 117, arg2, arg3, arg4, var11, var12, arg1, 2)) {
                            class366.field5490 = var11;
                            class407.field5985 = var12;
                            return true;
                        }
                    } else if (class310.method1945(2, arg3, arg7, (byte) -73, arg4, var12, var11, arg2, 2)) {
                        class366.field5490 = var11;
                        class407.field5985 = var12;
                        return true;
                    }
                } else if (~arg3 == ~var11 && ~arg7 == ~var12) {
                    class407.field5985 = var12;
                    class366.field5490 = var11;
                    return true;
                }
                int var25 = class466.field6859[var20][var21] + 1;
                if (~var20 < -1 && ~class54.field800[var20 + -1][var21] == -1 && ~(1134821376 & var19[var22 + -1][var23]) == -1 && (var19[var22 + -1][var23 + 1] & 1310982144) == 0) {
                    class127.field1935[var26] = var11 + -1;
                    class185.field2760[var26] = var12;
                    var26 = 4095 & var26 + 1;
                    class54.field800[var20 + -1][var21] = 2;
                    class466.field6859[var20 + -1][var21] = var25;
                }
                if (~var20 > -127 && ~class54.field800[var20 - -1][var21] == -1 && (var19[var22 + 2][var23] & 1625554944) == 0 && ~(2015625216 & var19[var22 + 2][var23 + 1]) == -1) {
                    class127.field1935[var26] = var11 + 1;
                    class185.field2760[var26] = var12;
                    class54.field800[var20 + 1][var21] = 8;
                    var26 = 4095 & var26 + 1;
                    class466.field6859[var20 + 1][var21] = var25;
                }
                if (var21 > 0 && class54.field800[var20][var21 + -1] == 0 && (var19[var22][var23 - 1] & 1134821376) == 0 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0) {
                    class127.field1935[var26] = var11;
                    class185.field2760[var26] = var12 + -1;
                    class54.field800[var20][var21 + -1] = 1;
                    var26 = var26 + 1 & 4095;
                    class466.field6859[var20][var21 - 1] = var25;
                }
                if (var21 < 126 && ~class54.field800[var20][var21 + 1] == -1 && (var19[var22][var23 - -2] & 1310982144) == 0 && (2015625216 & var19[var22 + 1][var23 + 2]) == 0) {
                    class127.field1935[var26] = var11;
                    class185.field2760[var26] = var12 + 1;
                    class54.field800[var20][var21 + 1] = 4;
                    var26 = 4095 & var26 + 1;
                    class466.field6859[var20][var21 + 1] = var25;
                }
                if (~var20 < -1 && var21 > 0 && ~class54.field800[var20 + -1][var21 + -1] == -1 && (1336147968 & var19[var22 + -1][var23]) == 0 && ~(var19[var22 - 1][var23 + -1] & 1134821376) == -1 && (1675886592 & var19[var22][var23 + -1]) == 0) {
                    class127.field1935[var26] = var11 - 1;
                    class185.field2760[var26] = var12 + -1;
                    class54.field800[var20 + -1][var21 - 1] = 3;
                    var26 = 4095 & var26 - -1;
                    class466.field6859[var20 - 1][var21 - 1] = var25;
                }
                if (var20 < 126 && var21 > 0 && class54.field800[var20 + 1][var21 + -1] == 0 && (var19[var22 + 1][var23 + -1] & 1675886592) == 0 && ~(var19[var22 + 2][var23 + -1] & 1625554944) == -1 && ~(var19[var22 - -2][var23] & 2028208128) == -1) {
                    class127.field1935[var26] = var11 + 1;
                    class185.field2760[var26] = var12 + -1;
                    var26 = var26 + 1 & 4095;
                    class54.field800[var20 - -1][var21 + -1] = 9;
                    class466.field6859[var20 + 1][var21 + -1] = var25;
                }
                if (var20 > 0 && ~var21 > -127 && class54.field800[var20 + -1][var21 + 1] == 0 && (1336147968 & var19[var22 + -1][var23 + 1]) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 2]) == -1 && (2116288512 & var19[var22][var23 + 2]) == 0) {
                    class127.field1935[var26] = var11 + -1;
                    class185.field2760[var26] = var12 + 1;
                    class54.field800[var20 - 1][var21 + 1] = 6;
                    var26 = 4095 & var26 + 1;
                    class466.field6859[var20 + -1][var21 + 1] = var25;
                }
                if (var20 < 126 && ~var21 > -127 && ~class54.field800[var20 + 1][var21 + 1] == -1 && ~(2116288512 & var19[var22 + 1][var23 - -2]) == -1 && ~(2015625216 & var19[var22 + 2][var23 + 2]) == -1 && ~(var19[var22 + 2][var23 - -1] & 2028208128) == -1) {
                    class127.field1935[var26] = var11 + 1;
                    class185.field2760[var26] = var12 - -1;
                    class54.field800[var20 + 1][var21 + 1] = 12;
                    var26 = 4095 & var26 - -1;
                    class466.field6859[var20 + 1][var21 + 1] = var25;
                }
            }
            class366.field5490 = var11;
            class407.field5985 = var12;
            return false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static void method1712(byte arg0) {
        field3856 = null;
        field3869 = null;
        if (arg0 != 32) {
            method1709(-6);
        }
    }

    @OriginalMember(owner = "client!pp", name = "va", descriptor = "(II)I")
    public final int method273(int arg0, int arg1) {
        ++field3847;
        int var3 = arg0 >> super.field535;
        int var4 = arg1 >> super.field535;
        if (var3 >= 0 && ~var4 <= -1 && super.field532 - 1 >= var3 && super.field531 + -1 >= var4) {
            int var5 = super.field534 - 1 & arg0;
            int var6 = arg1 & super.field534 + -1;
            int var7 = (-var5 + super.field534) * this.field3880[var3][var4] + this.field3880[var3 + 1][var4] * var5 >> super.field535;
            int var8 = (-var5 + super.field534) * this.field3880[var3][var4 + 1] + this.field3880[var3 + 1][var4 + 1] * var5 >> super.field535;
            return (-var6 + super.field534) * var7 - -(var6 * var8) >> super.field535;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lqg;IIII[[I[[II)V")
    public class267(class321 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3883 = arg0;
        this.field3880 = arg5;
        this.field3886 = super.field535 + -2;
        this.field3874 = 1 << this.field3886;
        this.field3872 = new int[arg3][arg4][];
        this.field3870 = arg2;
        this.field3862 = new int[arg3][arg4][];
        this.field3898 = new float[super.field532 - -1][super.field531 - -1];
        this.field3853 = new int[arg3][arg4][];
        this.field3849 = new byte[arg3][arg4];
        this.field3861 = new class523[arg3][arg4][];
        this.field3879 = new short[arg3 * arg4][];
        this.field3852 = new int[arg3][arg4][];
        this.field3899 = new float[super.field532 + 1][super.field531 + 1];
        this.field3893 = new byte[arg3 - -1][arg4 + 1];
        this.field3871 = new int[arg3][arg4][];
        this.field3891 = new float[super.field532 + 1][super.field531 + 1];
        for (int var9 = 1; ~super.field531 < ~var9; ++var9) {
            for (int var10 = 1; var10 < super.field532; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field3898[var10][var9] = (float) var11 * var13;
                this.field3899[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3891[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3892 = new class398(128);
        if (~(this.field3870 & 16) != -1) {
            this.field3865 = new class471(this.field3883, this);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III[[ZZ)V")
    public final void method283(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1708(arg1, -1, (byte) -116, arg2, arg0, arg3, arg4);
        ++field3873;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1713(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
