import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class662 extends class280 {

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "F")
    private float field9254 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "F")
    private float field9260 = -3.4028235E38F;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "Lada;")
    private class164 field9249 = new class164();

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "Lwu;")
    public class373 field9250;

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
    private int field9276;

    @OriginalMember(owner = "client!lw", name = "bb", descriptor = "I")
    private int field9284;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "[[B")
    private byte[][] field9269;

    @OriginalMember(owner = "client!lw", name = "db", descriptor = "[[F")
    private float[][] field9286;

    @OriginalMember(owner = "client!lw", name = "y", descriptor = "[[[I")
    public int[][][] field9257;

    @OriginalMember(owner = "client!lw", name = "fb", descriptor = "[[F")
    private float[][] field9288;

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "[[[Luq;")
    private class162[][][] field9274;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "[[[I")
    public int[][][] field9264;

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "[[[I")
    public int[][][] field9251;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "[[S")
    public short[][] field9253;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
    public int field9275;

    @OriginalMember(owner = "client!lw", name = "cb", descriptor = "[[F")
    private float[][] field9285;

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "[[[I")
    private int[][][] field9271;

    @OriginalMember(owner = "client!lw", name = "mb", descriptor = "[[B")
    private byte[][] field9295;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "[[[I")
    private int[][][] field9263;

    @OriginalMember(owner = "client!lw", name = "gb", descriptor = "Lhe;")
    private class372 field9289;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "Loaa;")
    private class289 field9262;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    private int field9255;

    @OriginalMember(owner = "client!lw", name = "x", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field9265;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    private int field9272;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!lw", name = "V", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!lw", name = "W", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!lw", name = "X", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!lw", name = "Y", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!lw", name = "Z", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!lw", name = "ab", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!lw", name = "eb", descriptor = "I")
    private int field9287;

    @OriginalMember(owner = "client!lw", name = "ib", descriptor = "I")
    private int field9291;

    @OriginalMember(owner = "client!lw", name = "lb", descriptor = "Lsr;")
    public class254 field9294;

    @OriginalMember(owner = "client!lw", name = "hb", descriptor = "Lll;")
    private class366 field9290;

    @OriginalMember(owner = "client!lw", name = "jb", descriptor = "Lll;")
    private class366 field9292;

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "Lqj;")
    public static class511 field9261;

    @OriginalMember(owner = "client!lw", name = "kb", descriptor = "[Luq;")
    private class162[] field9293;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "[[[I")
    private int[][][] field9268;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILwga;II)V")
    private final void method3810(int arg0, class750 arg1, int arg2, int arg3) {
        ++field9280;
        int[] var5 = this.field9257[arg3][arg0];
        int[] var6 = this.field9264[arg3][arg0];
        int var7 = var5.length;
        if (class535.field7675.length < var7) {
            class535.field7675 = new int[var7];
            class248.field3605 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class535.field7675[var8] = var5[var8] >> this.field9250.field5551;
            class248.field3605[var8] = var6[var8] >> this.field9250.field5551;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class535.field7675[var9];
            int var11 = class248.field3605[var9++];
            int var12 = class535.field7675[var9];
            int var13 = class248.field3605[var9++];
            int var14 = class535.field7675[var9];
            int var15 = class248.field3605[var9++];
            if ((-var12 + var10) * (-var15 + var13) + -((var13 - var11) * (-var12 + var14)) > 0) {
                arg1.method4188(var10, var15, var13, true, var11, var14, var12);
            }
        }
        if (arg2 != 29473) {
            this.field9254 = -1.3763987F;
        }
    }

    @OriginalMember(owner = "client!lw", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method974(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field9258;
        class151 var15 = this.field9250.field849;
        if (arg5 != null && this.field9268 == null) {
            this.field9268 = new int[super.field3963][super.field3962][];
        }
        if (arg3 != null && this.field9263 == null) {
            this.field9263 = new int[super.field3963][super.field3962][];
        }
        this.field9257[arg0][arg1] = arg2;
        this.field9264[arg0][arg1] = arg4;
        this.field9251[arg0][arg1] = arg6;
        this.field9271[arg0][arg1] = arg7;
        if (this.field9268 != null) {
            this.field9268[arg0][arg1] = arg5;
        }
        if (this.field9263 != null) {
            this.field9263[arg0][arg1] = arg3;
        }
        class162[] var16 = this.field9274[arg0][arg1] = new class162[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field9275 & 32) != 0 && ~var18 != 0 && var15.method1124((byte) -115, var18).field4184) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
            class184 var22;
            for (var22 = this.field9289.method2287(var20, (byte) -117); var22 != null; var22 = this.field9289.method2280(true)) {
                class162 var23 = (class162) var22;
                if (var23.field2563 == var18 && (float) var19 == var23.field2577 && ~var23.field2565 == ~arg10 && var23.field2562 == arg11 && var23.field2558 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class162(this, var18, var19, arg10, arg11, arg12);
                this.field9289.method2278((byte) -101, var20, var16[var17]);
            } else {
                var16[var17] = (class162) var22;
            }
        }
        if (arg13) {
            this.field9269[arg0][arg1] = (byte) class625.method3600(this.field9269[arg0][arg1], 1);
        }
        if (~this.field9291 > ~arg6.length) {
            this.field9291 = arg6.length;
        }
        this.field9287 += arg6.length;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
    public static void method3811(int arg0) {
        field9261 = null;
        if (arg0 != -1728) {
            field9261 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
    public final void method960(int arg0, int arg1) {
        ++field9277;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method964(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9270;
        if (this.field9262 != null && arg0 != null) {
            int var7 = arg1 - (this.field9250.field5628 * arg2 >> 8) >> this.field9250.field5551;
            int var8 = -(this.field9250.field5611 * arg2 >> 8) + arg3 >> this.field9250.field5551;
            return this.field9262.method1847(var8, (byte) -45, var7, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III[[ZZI)V")
    public final void method977(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method3812(-121, arg3, arg1, arg4, arg2, arg5, -1, arg0);
        ++field9259;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III[[ZZII)V")
    public final void method975(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3812(-102, arg3, arg1, arg4, arg2, arg6, arg5, arg0);
        ++field9281;
    }

    @OriginalMember(owner = "client!lw", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method963(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9279;
        if (this.field9262 != null && arg0 != null) {
            int var7 = -(this.field9250.field5628 * arg2 >> 8) + arg1 >> this.field9250.field5551;
            int var8 = arg3 - (this.field9250.field5611 * arg2 >> 8) >> this.field9250.field5551;
            this.field9262.method1848(var8, var7, arg0, -19287);
        }
    }

    @OriginalMember(owner = "client!lw", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method976(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9273;
        if (this.field9262 != null && arg0 != null) {
            int var7 = -(this.field9250.field5628 * arg2 >> 8) + arg1 >> this.field9250.field5551;
            int var8 = -(this.field9250.field5611 * arg2 >> 8) + arg3 >> this.field9250.field5551;
            this.field9262.method1840(false, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lwu;IIII[[I[[II)V")
    public class662(class373 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9250 = arg0;
        this.field9276 = super.field3955 + -2;
        this.field9284 = 1 << this.field9276;
        this.field9269 = new byte[arg3][arg4];
        this.field9286 = new float[super.field3963 + 1][super.field3962 - -1];
        this.field9257 = new int[arg3][arg4][];
        this.field9288 = new float[super.field3963 + 1][super.field3962 + 1];
        this.field9274 = new class162[arg3][arg4][];
        this.field9264 = new int[arg3][arg4][];
        this.field9251 = new int[arg3][arg4][];
        this.field9253 = new short[arg3 * arg4][];
        this.field9275 = arg2;
        this.field9285 = new float[super.field3963 + 1][super.field3962 + 1];
        this.field9271 = new int[arg3][arg4][];
        this.field9295 = new byte[arg3 + 1][arg4 + 1];
        this.field9263 = new int[arg3][arg4][];
        for (int var9 = 0; ~super.field3962 <= ~var9; ++var9) {
            for (int var10 = 0; var10 <= super.field3963; ++var10) {
                int var11 = super.field3968[var10][var9];
                if ((float) var11 > this.field9260) {
                    this.field9260 = (float) var11;
                }
                if (this.field9254 > (float) var11) {
                    this.field9254 = (float) var11;
                }
                if (~var10 < -1 && ~var9 < -1 && var10 < super.field3963 && var9 < super.field3962) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field9285[var10][var9] = (float) var12 * var14;
                    this.field9286[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field9288[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field9260;
        --this.field9254;
        this.field9289 = new class372(128);
        if ((16 & this.field9275) != 0) {
            this.field9262 = new class289(this.field9250, this);
        }
    }

    @OriginalMember(owner = "client!lw", name = "YA", descriptor = "()V")
    public final void method972() {
        ++field9283;
        if (~this.field9287 >= -1) {
            this.field9262 = null;
        } else {
            byte[][] var1 = new byte[super.field3963 + 1][super.field3962 + 1];
            for (int var2 = 1; var2 < super.field3963; ++var2) {
                for (int var107 = 1; var107 < super.field3962; ++var107) {
                    var1[var2][var107] = (byte) ((this.field9295[var2][var107 + 1] >> 3) + (this.field9295[var2][var107] >> 1) + (this.field9295[var2 - -1][var107] >> 3) + (this.field9295[var2][var107 + -1] >> 2) + (this.field9295[var2 - 1][var107] >> 2));
                }
            }
            class162[] var3 = new class162[this.field9289.method2281(false)];
            this.field9289.method2288(var3, (byte) -36);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method1186(0, this.field9287);
            }
            int var5 = 20;
            if (this.field9268 != null) {
                var5 += 4;
            }
            if ((this.field9275 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field9250.field5474.method3857(this.field9287 * 4, false);
            NativeHeapBuffer var7 = this.field9250.field5474.method3857(this.field9287 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class162[] var10 = new class162[this.field9287];
            int var11 = class505.method2996(this.field9287 / 4, -106);
            if (var11 < 1) {
                var11 = 1;
            }
            class372 var12 = new class372(var11);
            class162[] var13 = new class162[this.field9291];
            for (int var14 = 0; ~super.field3963 < ~var14; ++var14) {
                for (int var34 = 0; super.field3962 > var34; ++var34) {
                    if (this.field9251[var14][var34] != null) {
                        class162[] var35 = this.field9274[var14][var34];
                        int[] var36 = this.field9257[var14][var34];
                        int[] var37 = this.field9264[var14][var34];
                        int[] var38 = this.field9271[var14][var34];
                        int[] var39 = this.field9251[var14][var34];
                        int[] var40 = this.field9263 != null ? this.field9263[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field9268 != null ? this.field9268[var14][var34] : null;
                        float var42 = this.field9285[var14][var34];
                        float var43 = this.field9286[var14][var34];
                        float var44 = this.field9288[var14][var34];
                        float var45 = this.field9285[var14][var34 + 1];
                        float var46 = this.field9286[var14][var34 - -1];
                        float var47 = this.field9288[var14][var34 + 1];
                        float var48 = this.field9285[var14 + 1][var34 - -1];
                        float var49 = this.field9286[var14 - -1][var34 + 1];
                        float var50 = this.field9288[var14 + 1][var34 - -1];
                        float var51 = this.field9285[var14 + 1][var34];
                        float var52 = this.field9286[var14 - -1][var34];
                        float var53 = this.field9288[var14 - -1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class162 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field9253[super.field3963 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field3955) - -var36[var61];
                            int var63 = (var34 << super.field3955) - -var37[var61];
                            int var64 = var62 >> this.field9276;
                            int var65 = var63 >> this.field9276;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) (var64 << 16) | (long) var66 << 32 | (long) var67 << 48 | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            int var78;
                            float var79;
                            if (var71 == 0 && var72 == 0) {
                                var76 = var44;
                                var77 = var43;
                                var78 = var73 - var54;
                                var79 = var42;
                            } else if (~var71 == -1 && ~super.field3965 == ~var72) {
                                var79 = var45;
                                var76 = var47;
                                var78 = var73 - var55;
                                var77 = var46;
                            } else if (~super.field3965 == ~var71 && ~super.field3965 == ~var72) {
                                var79 = var48;
                                var77 = var49;
                                var78 = var73 - var56;
                                var76 = var50;
                            } else if (~super.field3965 == ~var71 && ~var72 == -1) {
                                var78 = var73 - var57;
                                var79 = var51;
                                var77 = var52;
                                var76 = var53;
                            } else {
                                float var80 = (float) var71 / (float) super.field3965;
                                float var81 = (float) var72 / (float) super.field3965;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var79 = (var85 - var82) * var81 + var82;
                                var77 = (var86 - var83) * var81 + var83;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var76 = (var87 - var84) * var81 + var84;
                                int var88 = ((var57 - var54) * var71 >> super.field3955) + var54;
                                int var89 = var55 - -((-var55 + var56) * var71 >> super.field3955);
                                var78 = var73 - (((var89 - var88) * var72 >> super.field3955) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (var66 & 127) * var78 >> 7;
                                if (var90 >= 2) {
                                    if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if (~(this.field9275 & 7) == -1) {
                                    float var91 = this.field9250.field5617[2] * var76 + this.field9250.field5617[0] * var79 + this.field9250.field5617[1] * var77;
                                    var75 = this.field9250.field5575 + var91 * (!(var91 > 0.0F) ? this.field9250.field5644 : this.field9250.field5612);
                                }
                                var74 = class324.field4632[var66 & 65408 | var90];
                            }
                            class184 var92 = null;
                            if (~(var62 & this.field9284 - 1) == -1 && (var63 & this.field9284 + -1) == 0) {
                                var92 = var12.method2287(var69, (byte) -117);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class250) var92).field3618;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && var10[var93].field2810 > var35[var61].field2810) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (~var66 != ~var67) {
                                    int var94 = (var67 & 127) * var78 >> 7;
                                    if (~var94 <= -3) {
                                        if (var94 > 126) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var95 = class324.field4632[65408 & var67 | var94];
                                    if ((this.field9275 & 7) == 0) {
                                        float var96 = this.field9250.field5617[2] * var76 + this.field9250.field5617[0] * var79 + this.field9250.field5617[1] * var77;
                                        float var97 = (!(var75 > 0.0F) ? this.field9250.field5644 : this.field9250.field5612) * var75 + this.field9250.field5575;
                                        int var98 = (var95 & 16748708) >> 16;
                                        int var99 = (var95 & 65393) >> 8;
                                        int var100 = 255 & var95;
                                        int var101 = (int) ((float) var98 * var97);
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var101 <= -1) {
                                            if (~var101 < -256) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        int var103 = (int) ((float) var100 * var97);
                                        if (var102 >= 0) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        if (~var103 <= -1) {
                                            if (var103 > 255) {
                                                var103 = 255;
                                            }
                                        } else {
                                            var103 = 0;
                                        }
                                        var95 = var101 << 16 | var102 << 8 | var103;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (Stream.method3869()) {
                                    var8.method3863((float) var62);
                                    var8.method3863((float) (var68 + this.method1786(var63, (byte) 113, var62)));
                                    var8.method3863((float) var63);
                                    var8.method3863((float) var62);
                                    var8.method3863((float) var63);
                                    if (this.field9268 != null) {
                                        var8.method3863((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field9275) != -1) {
                                        var8.method3863(var79);
                                        var8.method3863(var77);
                                        var8.method3863(var76);
                                    }
                                } else {
                                    var8.method3864((float) var62);
                                    var8.method3864((float) (this.method1786(var63, (byte) 113, var62) + var68));
                                    var8.method3864((float) var63);
                                    var8.method3864((float) var62);
                                    var8.method3864((float) var63);
                                    if (this.field9268 != null) {
                                        var8.method3864((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((this.field9275 & 7) != 0) {
                                        var8.method3864(var79);
                                        var8.method3864(var77);
                                        var8.method3864(var76);
                                    }
                                }
                                if (this.field9250.field5629 == 0) {
                                    var9.method3865(-16777216 | var95);
                                } else {
                                    var9.method3860(var95 | -16777216);
                                }
                                var93 = this.field9255++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2278((byte) -54, var69, new class250(var60[var61]));
                            }
                            for (int var104 = 0; ~var58 < ~var104; ++var104) {
                                var13[var104].method1184(var74, var93, var78, var75, (byte) 73);
                            }
                            ++this.field9272;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field9255 < ~var15; ++var15) {
                class162 var33 = var10[var15];
                if (var33 != null) {
                    var33.method1179(-64, var15);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field3963; ++var16) {
                for (int var22 = 0; ~super.field3962 < ~var22; ++var22) {
                    short[] var23 = this.field9253[super.field3963 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class162 var29 = var10[var26];
                            class162 var30 = var10[var27];
                            class162 var31 = var10[var28];
                            class162 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method1181(var24, false, var16, var22);
                            }
                            if (var30 != null) {
                                var30.method1181(var24, false, var16, var22);
                                if (var32 == null || var30.field2810 < var32.field2810) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method1181(var24, false, var16, var22);
                                if (var32 == null || var31.field2810 < var32.field2810) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method1179(-56, var26);
                                }
                                if (var30 != null) {
                                    var32.method1179(-46, var27);
                                }
                                if (var31 != null) {
                                    var32.method1179(-32, var28);
                                }
                                var32.method1181(var24, false, var16, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3872();
            var9.method3872();
            this.field9290 = this.field9250.method2384(false, -128);
            this.field9290.method1285(4, var6, this.field9255 * 4, 6265);
            this.field9292 = this.field9250.method2384(false, 113);
            this.field9292.method1285(var5, var7, this.field9255 * var5, 6265);
            if ((this.field9275 & 7) != 0) {
                if (this.field9268 == null) {
                    this.field9294 = this.field9250.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5311, class369.field5308 }), new class290(class369.field5309) }, 13992);
                } else {
                    this.field9294 = this.field9250.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5311, class369.field5310, class369.field5308 }), new class290(class369.field5309) }, 13992);
                }
            } else if (this.field9268 == null) {
                this.field9294 = this.field9250.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5311 }), new class290(class369.field5309) }, 13992);
            } else {
                this.field9294 = this.field9250.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5311, class369.field5310 }), new class290(class369.field5309) }, 13992);
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (var3[var18].field2567 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field9293 = new class162[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var17 < ~var20; ++var20) {
                class162 var21 = var3[var20];
                var19[var20] = var21.field2810;
                this.field9293[var20] = var21;
                var21.method1178((byte) 93, this.field9255);
            }
            class453.method2776(var19, (byte) -81, this.field9293);
            if (this.field9262 != null) {
                this.field9262.method1841((byte) -122);
            }
        }
        this.field9251 = null;
        this.field9263 = null;
        this.field9295 = null;
        this.field9257 = this.field9264 = null;
        this.field9274 = null;
        this.field9268 = null;
        this.field9285 = this.field9286 = this.field9288 = null;
        this.field9271 = null;
        this.field9289 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lraa;[I)V")
    public final void method966(class609 arg0, int[] arg1) {
        ++field9278;
        this.field9249.method1203(new class639(this.field9250, this, arg0, arg1), (byte) 125);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[[ZIZIIII)V")
    private final void method3812(int arg0, boolean[][] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -61 / ((-45 - arg0) / 32);
        ++field9256;
        if (this.field9293 != null) {
            int var10 = arg4 + arg4 + 1;
            int var11 = var10 * var10;
            if (var11 > class326.field4657.length) {
                class326.field4657 = new int[var11];
            }
            int var12 = -arg4 + arg7;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg4 + arg2;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg7 - -arg4;
            if (~var16 < ~(super.field3963 - 1)) {
                var16 = super.field3963 - 1;
            }
            int var17 = arg2 - -arg4;
            if (~var17 < ~(super.field3962 + -1)) {
                var17 = super.field3962 + -1;
            }
            class77.field1074 = 0;
            for (int var18 = var12; var16 >= var18; ++var18) {
                boolean[] var25 = arg1[var18 - var13];
                for (int var26 = var14; var26 <= var17; ++var26) {
                    if (var25[-var15 + var26]) {
                        class326.field4657[class77.field1074++] = super.field3963 * var26 + var18;
                    }
                }
            }
            if (~arg6 == 0) {
                this.field9250.method2411(93);
            } else {
                this.field9250.method2293((float) arg6, 54);
                this.field9250.method2382(2);
            }
            this.field9250.method2357(-31486);
            this.field9250.method2336(0, ~(this.field9275 & 7) != -1);
            this.field9250.method2398(false, false, false, -1);
            this.field9250.method2389(0, (byte) -64, this.field9292);
            for (int var19 = 0; ~this.field9293.length < ~var19; ++var19) {
                this.field9293[var19].method1185(-16711936, class326.field4657, class77.field1074);
            }
            class441 var20 = this.field9250.method2334((byte) 82);
            var20.method774(0, -1, 0);
            this.field9250.method2406(true);
            if (!this.field9249.method1197(0)) {
                int var21 = this.field9250.field5637;
                int var22 = this.field9250.field5620;
                this.field9250.method526(0, var22, this.field9250.field5626);
                this.field9250.method2336(0, false);
                this.field9250.method2394(false, (byte) -125);
                this.field9250.method2405(128, 107);
                this.field9250.method2398(false, false, false, -2);
                this.field9250.method2294(this.field9250.field5583, -2);
                this.field9250.method2300(class499.field7099, class336.field4874, 0);
                this.field9250.method2329(0, (byte) -127, class469.field6850);
                this.field9250.method2407(0, class10.field152, 74);
                for (class184 var23 = this.field9249.method1195(0); var23 != null; var23 = this.field9249.method1201(2)) {
                    class639 var24 = (class639) var23;
                    var24.method3670(arg4, arg2, arg1, arg7, (byte) -106);
                }
                this.field9250.method2329(0, (byte) -126, class331.field4759);
                this.field9250.method2407(0, class331.field4759, 62);
                this.field9250.method2294((class663) null, -2);
                this.field9250.method526(var21, var22, this.field9250.field5626);
            }
            if (this.field9262 != null) {
                this.field9250.method2389(0, (byte) -64, this.field9292);
                this.field9250.method2389(1, (byte) -64, this.field9290);
                this.field9250.method2368(this.field9294, (byte) 126);
                this.field9262.method1842(arg4, arg1, arg7, false, arg2, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIZII)V")
    public static final void method3813(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 == 0) {
            ++field9266;
            long var6 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
            class384 var8 = (class384) class601.field8505.method2287(var6, (byte) -117);
            if (var8 == null) {
                var8 = new class384();
                class601.field8505.method2278((byte) -105, var6, var8);
            }
            if (arg0 >= var8.field5804.length) {
                int[] var9 = new int[arg0 + 1];
                int[] var10 = new int[arg0 - -1];
                for (int var11 = 0; ~var8.field5804.length < ~var11; ++var11) {
                    var9[var11] = var8.field5804[var11];
                    var10[var11] = var8.field5809[var11];
                }
                for (int var12 = var8.field5804.length; ~var12 > ~arg0; ++var12) {
                    var9[var12] = -1;
                    var10[var12] = 0;
                }
                var8.field5809 = var10;
                var8.field5804 = var9;
            }
            var8.field5804[arg0] = arg5;
            var8.field5809[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9267;
        if (~this.field9287 < -1) {
            class216 var9 = this.field9250.method2404((byte) -96, this.field9272);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1457(true, -127);
                if (var14 != null) {
                    Stream var15 = this.field9250.method2392(var14, -15232);
                    if (Stream.method3869()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field3963 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field9253[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            var15.method3861(var21);
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; arg6 > var22; ++var22) {
                            int var25 = super.field3963 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[var26 - arg3][-arg4 + var22]) {
                                    short[] var27 = this.field9253[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            var15.method3858(var29);
                                            ++var10;
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3872();
                    if (var9.method1459(-26499)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field9250.method2327((byte) -96);
                this.field9250.method2402(false, (byte) -103);
                this.field9250.method2336(0, false);
                this.field9250.method2298((byte) -88, false);
                this.field9250.method2394(false, (byte) 119);
                this.field9250.method2405(0, 104);
                this.field9250.method2398(false, false, false, -2);
                this.field9250.method2294((class663) null, -2);
                class441 var23 = this.field9250.method2334((byte) 77);
                float[] var24 = this.field9250.method2290((byte) 60);
                var24[6] = 0.0F;
                var24[7] = 0.0F;
                var24[3] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9250.field5502;
                var24[9] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field3965 * 128.0F * (float) this.field9250.field5502);
                var24[4] = 0.0F;
                var24[1] = 0.0F;
                var24[15] = 1.0F;
                var24[2] = 0.0F;
                var24[11] = 0.0F;
                var24[14] = -this.field9254 / (-this.field9254 + this.field9260);
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field9250.field5407;
                var24[0] = (float) arg2 / ((float) super.field3965 * 128.0F * (float) this.field9250.field5407);
                var24[8] = 0.0F;
                var24[10] = 1.0F / (-this.field9254 + this.field9260);
                var23.method2716(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 30, 0.0F);
                this.field9250.method2395(18269);
                this.field9250.method2406(true);
                if (~(7 & this.field9275) == -1) {
                    this.field9250.method2336(0, false);
                } else {
                    this.field9250.method2336(0, true);
                    this.field9250.method2370((byte) 46);
                }
                this.field9250.method2332(false, (byte) -127);
                this.field9250.method2389(0, (byte) -64, this.field9292);
                this.field9250.method2389(1, (byte) -64, this.field9290);
                this.field9250.method2368(this.field9294, (byte) 96);
                this.field9250.method2325(var10 / 3, 0, -var11 + var12 + 1, var11, var9, -8, class506.field7196);
                this.field9250.method2332(true, (byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "ka", descriptor = "(III)V")
    public final void method973(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field9295[arg0][arg1])) {
            this.field9295[arg0][arg1] = (byte) arg2;
        }
        ++field9265;
    }

    @OriginalMember(owner = "client!lw", name = "fa", descriptor = "(IILr;)Lr;")
    public final class183 method967(int arg0, int arg1, class183 arg2) {
        ++field9282;
        if ((this.field9269[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field3965 >> this.field9250.field5551;
            class750 var5 = (class750) arg2;
            class750 var6;
            if (var5 != null && var5.method4183(var4, var4, 0)) {
                var6 = var5;
                var5.method4186(30976);
            } else {
                var6 = new class750(this.field9250, var4, var4);
            }
            var6.method4187(0, var4, 0, var4, (byte) -121);
            this.method3810(arg1, var6, 29473, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method957(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9252;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method974(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }
}
