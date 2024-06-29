import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class455 extends class358 {

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "Lfca;")
    private class661 field5944 = new class661();

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lck;")
    public class733 field5953;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    private int field5925;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "[[F")
    private float[][] field5964;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public int field5930;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "[[[I")
    public int[][][] field5924;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "[[[I")
    public int[][][] field5931;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "[[F")
    private float[][] field5970;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "[[[I")
    private int[][][] field5935;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "[[B")
    private byte[][] field5961;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[[S")
    public short[][] field5928;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "[[F")
    private float[][] field5957;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field5927;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[[[I")
    public int[][][] field5926;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "[[B")
    private byte[][] field5942;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[[[Lvja;")
    private class315[][][] field5929;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "[[[I")
    private int[][][] field5950;

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "Lrda;")
    private class467 field5969;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "Lwe;")
    private class377 field5934;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "Luw;")
    public static class208 field5949 = new class208(16, -2);

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
    public static int[] field5965 = new int[256];

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    private int field5939;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    private int field5946;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field5959;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Ldea;")
    public class375 field5956;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "Ldea;")
    private class375 field5958;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "Ldea;")
    public class375 field5963;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "Ldea;")
    public class375 field5967;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "Lnk;")
    private class447 field5960;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "[Lvja;")
    private class315[] field5966;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "[[[I")
    private int[][][] field5932;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method2068(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field5941;
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
        for (int var28 = 0; var28 < var18; ++var28) {
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
        this.method2070(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lck;IIII[[I[[II)V")
    public class455(class733 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5953 = arg0;
        this.field5925 = super.field4372 + -2;
        this.field5964 = new float[super.field4366 - -1][super.field4371 + 1];
        this.field5930 = arg2;
        this.field5924 = new int[arg3][arg4][];
        this.field5931 = new int[arg3][arg4][];
        this.field5970 = new float[super.field4366 - -1][super.field4371 - -1];
        this.field5935 = new int[arg3][arg4][];
        this.field5961 = new byte[arg3 - -1][arg4 + 1];
        this.field5928 = new short[arg3 * arg4][];
        this.field5957 = new float[super.field4366 - -1][super.field4371 + 1];
        this.field5927 = 1 << this.field5925;
        this.field5926 = new int[arg3][arg4][];
        this.field5942 = new byte[arg3][arg4];
        this.field5929 = new class315[arg3][arg4][];
        this.field5950 = new int[arg3][arg4][];
        for (int var9 = 1; super.field4371 > var9; ++var9) {
            for (int var10 = 1; var10 < super.field4366; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var11 * var11 - -(arg7 * 4 * arg7)))));
                this.field5970[var10][var9] = (float) var11 * var13;
                this.field5964[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field5957[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5969 = new class467(128);
        if (~(this.field5930 & 16) != -1) {
            this.field5934 = new class377(this.field5953, this);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method2057(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5951;
        if (this.field5934 != null && arg0 != null) {
            int var7 = -(this.field5953.field9859 * arg2 >> 8) + arg1 >> this.field5953.field9804;
            int var8 = -(this.field5953.field9935 * arg2 >> 8) + arg3 >> this.field5953.field9804;
            return this.field5934.method2161(var7, arg0, 124, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[[ZIIIIIZ)V")
    private final void method2584(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (this.field5966 != null) {
            int var9 = arg3 + arg3 + 1;
            int var10 = var9 * var9;
            if (~var10 < ~this.field5953.field9952.length) {
                this.field5953.field9952 = new int[var10];
            }
            if (this.field5946 * 2 > this.field5953.field9928.field3193.length) {
                this.field5953.field9928 = new class333(this.field5946 * 2);
            }
            int var11 = arg2 - arg3;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = arg6 - arg3;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg2 - -arg3;
            if (~(super.field4366 + -1) > ~var15) {
                var15 = super.field4366 + -1;
            }
            int var16 = arg3 + arg6;
            if (super.field4371 - 1 < var16) {
                var16 = super.field4371 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field5953.field9952;
            for (int var19 = var11; ~var15 <= ~var19; ++var19) {
                boolean[] var25 = arg1[var19 - var12];
                for (int var26 = var13; ~var16 <= ~var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4366 * var26 + var19;
                    }
                }
            }
            if (~arg0 == 0) {
                this.field5953.method3950(-51);
            } else {
                this.field5953.method3968((byte) 84, (float) arg0);
                this.field5953.method3909(-73);
            }
            this.field5953.method3974((7 & this.field5930) != 0, 5);
            for (int var20 = 0; ~this.field5966.length < ~var20; ++var20) {
                this.field5966[var20].method1846(arg5, var18, var17);
            }
            if (!this.field5944.method3596(-121)) {
                int var21 = this.field5953.field9848;
                int var22 = this.field5953.field9842;
                this.field5953.method884(0, var22, this.field5953.field9905);
                this.field5953.method3974(false, 5);
                this.field5953.method3986((byte) -124, false);
                this.field5953.method3920(128, 9770);
                this.field5953.method3935(-2, (byte) -42);
                this.field5953.method3975((byte) 116, this.field5953.field9944);
                this.field5953.method3917(52, 8448, 7681);
                this.field5953.method3954(0, 770, 34166, (byte) 108);
                this.field5953.method3922(0, arg5 + 1, 770, 34167);
                for (class337 var23 = this.field5944.method3591(arg5); var23 != null; var23 = this.field5944.method3600((byte) 38)) {
                    class207 var24 = (class207) var23;
                    var24.method1399(arg3, arg1, arg6, arg2, 13462);
                }
                this.field5953.method3954(0, 768, 5890, (byte) 110);
                this.field5953.method3922(0, arg5 ^ 1, 770, 5890);
                this.field5953.method3975((byte) 126, (class128) null);
                this.field5953.method884(var21, var22, this.field5953.field9905);
            }
            if (this.field5934 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field5953.method3947(this.field5956, this.field5967, (class375) null, (class375) null, arg5 + 32886);
                this.field5934.method2160(arg7, arg5 + 1, arg2, arg1, arg3, arg6);
                OpenGL.glPopMatrix();
            }
        }
        if (arg5 == 0) {
            ++field5952;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public final void method2062(int arg0, int arg1) {
        ++field5947;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lgu;[I)V")
    public final void method2059(class757 arg0, int[] arg1) {
        ++field5923;
        this.field5944.method3593(new class207(this.field5953, this, arg0, arg1), 15);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[[ZZI)V")
    public final void method2064(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field5955;
        this.method2584(-1, arg3, arg0, arg2, arg5, 0, arg1, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "YA", descriptor = "()V")
    public final void method2066() {
        if (~this.field5959 < -1) {
            byte[][] var1 = new byte[super.field4366 - -1][super.field4371 + 1];
            for (int var2 = 1; super.field4366 > var2; ++var2) {
                for (int var103 = 1; ~super.field4371 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field5961[var2][var103 - -1] >> 3) + (this.field5961[var2][var103] >> 1) + (this.field5961[var2 + -1][var103] >> 2) + (this.field5961[var2][var103 + -1] >> 2) + (this.field5961[var2 + 1][var103] >> 3));
                }
            }
            this.field5966 = new class315[this.field5969.method2618(-1)];
            this.field5969.method2612(this.field5966, -1);
            for (int var3 = 0; var3 < this.field5966.length; ++var3) {
                this.field5966[var3].method1837(this.field5959, -65536);
            }
            int var4 = 24;
            if (this.field5932 != null) {
                var4 += 4;
            }
            if ((this.field5930 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field5953.field9806.method2532(this.field5959 * var4, false);
            Stream var6 = new Stream(var5);
            class315[] var7 = new class315[this.field5959];
            int var8 = class681.method3659(-110, this.field5959 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class467 var9 = new class467(var8);
            class315[] var10 = new class315[this.field5962];
            for (int var11 = 0; ~super.field4366 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field4371; ++var30) {
                    if (this.field5924[var11][var30] != null) {
                        class315[] var31 = this.field5929[var11][var30];
                        int[] var32 = this.field5926[var11][var30];
                        int[] var33 = this.field5931[var11][var30];
                        int[] var34 = this.field5950[var11][var30];
                        int[] var35 = this.field5924[var11][var30];
                        int[] var36 = this.field5935 == null ? null : this.field5935[var11][var30];
                        int[] var37 = this.field5932 != null ? this.field5932[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field5970[var11][var30];
                        float var39 = this.field5964[var11][var30];
                        float var40 = this.field5957[var11][var30];
                        float var41 = this.field5970[var11][var30 + 1];
                        float var42 = this.field5964[var11][var30 - -1];
                        float var43 = this.field5957[var11][var30 - -1];
                        float var44 = this.field5970[var11 + 1][var30 + 1];
                        float var45 = this.field5964[var11 + 1][var30 + 1];
                        float var46 = this.field5957[var11 + 1][var30 + 1];
                        float var47 = this.field5970[var11 + 1][var30];
                        float var48 = this.field5964[var11 - -1][var30];
                        float var49 = this.field5957[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label340: for (int var55 = 0; ~var35.length < ~var55; ++var55) {
                            class315 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field5928[super.field4366 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field4372) + var32[var57];
                            int var59 = (var30 << super.field4372) - -var33[var57];
                            int var60 = var58 >> this.field5925;
                            int var61 = var59 >> this.field5925;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            int var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var38;
                                var73 = var69 - var50;
                                var74 = var39;
                                var75 = var40;
                            } else if (var67 == 0 && ~super.field4369 == ~var68) {
                                var75 = var43;
                                var72 = var41;
                                var74 = var42;
                                var73 = var69 - var51;
                            } else if (~super.field4369 == ~var67 && ~super.field4369 == ~var68) {
                                var74 = var45;
                                var73 = var69 - var52;
                                var72 = var44;
                                var75 = var46;
                            } else if (super.field4369 == var67 && var68 == 0) {
                                var75 = var49;
                                var73 = var69 - var53;
                                var72 = var47;
                                var74 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field4369;
                                float var77 = (float) var68 / (float) super.field4369;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var72 = (var81 - var78) * var77 + var78;
                                var74 = (-var79 + var82) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var75 = (-var80 + var83) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field4372) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field4372) + var51;
                                var73 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field4372));
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if ((7 & this.field5930) == 0) {
                                    float var87 = this.field5953.field9903[2] * var75 + this.field5953.field9903[0] * var72 + this.field5953.field9903[1] * var74;
                                    var71 = this.field5953.field9870 + (!(var87 > 0.0F) ? this.field5953.field9929 : this.field5953.field9925) * var87;
                                }
                                var70 = class594.field7542[var86 | 65408 & var62];
                            }
                            class337 var88 = null;
                            if (~(this.field5927 + -1 & var58) == -1 && (var59 & this.field5927 + -1) == 0) {
                                var88 = var9.method2616(var65, (byte) 63);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (var62 == var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var73 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class594.field7542[var90 | var63 & 65408];
                                    if ((7 & this.field5930) == 0) {
                                        float var91 = this.field5953.field9903[2] * var75 + this.field5953.field9903[0] * var72 + this.field5953.field9903[1] * var74;
                                        float var92 = this.field5953.field9870 + (var71 > 0.0F ? this.field5953.field9925 : this.field5953.field9929) * var71;
                                        int var93 = (var89 & 16748780) >> 16;
                                        int var94 = (65525 & var89) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var89;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 >= 0) {
                                            if (var95 > 255) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        var89 = var98 | var95 << 16 | var97 << 8;
                                    }
                                }
                                if (this.field5953.field9865) {
                                    var6.method2518((float) var58);
                                    var6.method2518((float) (var64 + this.method2072((byte) 122, var58, var59)));
                                    var6.method2518((float) var59);
                                    var6.method2527((byte) (var89 >> 16));
                                    var6.method2527((byte) (var89 >> 8));
                                    var6.method2527((byte) var89);
                                    var6.method2527(-1);
                                    var6.method2518((float) var58);
                                    var6.method2518((float) var59);
                                    if (this.field5932 != null) {
                                        var6.method2518((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if (~(7 & this.field5930) != -1) {
                                        var6.method2518(var72);
                                        var6.method2518(var74);
                                        var6.method2518(var75);
                                    }
                                } else {
                                    var6.method2524((float) var58);
                                    var6.method2524((float) (this.method2072((byte) -56, var58, var59) - -var64));
                                    var6.method2524((float) var59);
                                    var6.method2527((byte) (var89 >> 16));
                                    var6.method2527((byte) (var89 >> 8));
                                    var6.method2527((byte) var89);
                                    var6.method2527(-1);
                                    var6.method2524((float) var58);
                                    var6.method2524((float) var59);
                                    if (this.field5932 != null) {
                                        var6.method2524((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field5930) != -1) {
                                        var6.method2524(var72);
                                        var6.method2524(var74);
                                        var6.method2524(var75);
                                    }
                                }
                                var99 = this.field5939++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2619(new class97(var56[var57]), var65, -1);
                            } else {
                                var56[var57] = ((class97) var88).field1310;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var31[var57].field4108 > ~var7[var99].field4108) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1843(var99, var73, var71, 1442011688, var70);
                            }
                            ++this.field5946;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field5939 > var12; ++var12) {
                class315 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1841(var12, (byte) 124);
                }
            }
            for (int var13 = 0; super.field4366 > var13; ++var13) {
                for (int var18 = 0; super.field4371 > var18; ++var18) {
                    short[] var19 = this.field5928[super.field4366 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class315 var25 = var7[var22];
                            class315 var26 = var7[var23];
                            class315 var27 = var7[var24];
                            class315 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1842(var20, var13, 117, var18);
                            }
                            if (var26 != null) {
                                var26.method1842(var20, var13, 118, var18);
                                if (var28 == null || ~var28.field4108 < ~var26.field4108) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1842(var20, var13, 109, var18);
                                if (var28 == null || ~var28.field4108 < ~var27.field4108) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1841(var22, (byte) 124);
                                }
                                if (var26 != null) {
                                    var28.method1841(var23, (byte) 127);
                                }
                                if (var27 != null) {
                                    var28.method1841(var24, (byte) 127);
                                }
                                var28.method1842(var20, var13, 111, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2519();
            this.field5960 = this.field5953.method3970(var4, var6.method2521(), var5, false, (byte) -106);
            this.field5956 = new class375(this.field5960, 5126, 3, 0);
            this.field5958 = new class375(this.field5960, 5121, 4, 12);
            byte var14;
            if (this.field5932 == null) {
                this.field5967 = new class375(this.field5960, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field5967 = new class375(this.field5960, 5126, 3, 16);
            }
            if ((this.field5930 & 7) != 0) {
                this.field5963 = new class375(this.field5960, 5126, 3, var14);
            }
            long[] var15 = new long[this.field5966.length];
            for (int var16 = 0; ~var16 > ~this.field5966.length; ++var16) {
                class315 var17 = this.field5966[var16];
                var15[var16] = var17.field4108;
                var17.method1844(this.field5939, 545);
            }
            class747.method4058(this.field5966, var15, 11883);
            if (this.field5934 != null) {
                this.field5934.method2159((byte) -91);
            }
        } else {
            this.field5934 = null;
        }
        ++field5938;
        this.field5950 = null;
        this.field5929 = null;
        this.field5970 = this.field5964 = this.field5957 = null;
        this.field5932 = null;
        this.field5961 = null;
        this.field5924 = null;
        this.field5969 = null;
        this.field5935 = null;
        this.field5926 = this.field5931 = null;
    }

    @OriginalMember(owner = "client!lc", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method2067(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5945;
        if (this.field5934 != null && arg0 != null) {
            int var7 = -(this.field5953.field9859 * arg2 >> 8) + arg1 >> this.field5953.field9804;
            int var8 = -(this.field5953.field9935 * arg2 >> 8) + arg3 >> this.field5953.field9804;
            this.field5934.method2162(var7, 99, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[[ZZII)V")
    public final void method2071(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        ++field5933;
        this.method2584(arg5, arg3, arg0, arg2, arg6, 0, arg1, arg4);
    }

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method2070(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field5943;
        class284 var15 = this.field5953.field7199;
        if (arg3 != null && this.field5935 == null) {
            this.field5935 = new int[super.field4366][super.field4371][];
        }
        if (arg5 != null && this.field5932 == null) {
            this.field5932 = new int[super.field4366][super.field4371][];
        }
        this.field5926[arg0][arg1] = arg2;
        this.field5931[arg0][arg1] = arg4;
        this.field5924[arg0][arg1] = arg6;
        this.field5950[arg0][arg1] = arg7;
        if (this.field5932 != null) {
            this.field5932[arg0][arg1] = arg5;
        }
        if (this.field5935 != null) {
            this.field5935[arg0][arg1] = arg3;
        }
        class315[] var16 = this.field5929[arg0][arg1] = new class315[arg6.length];
        for (int var17 = 0; ~arg6.length < ~var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if ((this.field5930 & 32) != 0 && var18 != -1 && var15.method1732((byte) 124, var18).field2679) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
            class337 var22;
            for (var22 = this.field5969.method2616(var20, (byte) 19); var22 != null; var22 = this.field5969.method2615(8)) {
                class315 var23 = (class315) var22;
                if (var23.field3921 == var18 && (float) var19 == var23.field3906 && var23.field3913 == arg10 && ~var23.field3919 == ~arg11 && var23.field3926 == arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class315) var22;
            } else {
                var16[var17] = new class315(this, var18, var19, arg10, arg11, arg12);
                this.field5969.method2619(var16[var17], var20, -1);
            }
        }
        if (arg13) {
            this.field5942[arg0][arg1] = (byte) class77.method473(this.field5942[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field5962) {
            this.field5962 = arg6.length;
        }
        this.field5959 += arg6.length;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method2069(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field5940;
        if (~this.field5959 < -1) {
            this.field5953.method3927(4733);
            this.field5953.method3923(-32, false);
            this.field5953.method3974(false, 5);
            this.field5953.method3978(false, (byte) 126);
            this.field5953.method3986((byte) -124, false);
            this.field5953.method3920(0, 9770);
            this.field5953.method3935(-2, (byte) -42);
            this.field5953.method3975((byte) 120, (class128) null);
            class138.field1826[9] = 0.0F;
            class138.field1826[14] = 0.0F;
            class138.field1826[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field5953.field9650;
            class138.field1826[4] = 0.0F;
            class138.field1826[15] = 1.0F;
            class138.field1826[8] = 0.0F;
            class138.field1826[3] = 0.0F;
            class138.field1826[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5953.field9789;
            class138.field1826[10] = 0.0F;
            class138.field1826[5] = (float) arg2 / ((float) super.field4369 * 128.0F * (float) this.field5953.field9789);
            class138.field1826[11] = 0.0F;
            class138.field1826[0] = (float) arg2 / ((float) super.field4369 * 128.0F * (float) this.field5953.field9650);
            class138.field1826[7] = 0.0F;
            class138.field1826[1] = 0.0F;
            class138.field1826[6] = 0.0F;
            class138.field1826[2] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class138.field1826, 0);
            class138.field1826[11] = 0.0F;
            class138.field1826[0] = 1.0F;
            class138.field1826[12] = 0.0F;
            class138.field1826[14] = 0.0F;
            class138.field1826[4] = 0.0F;
            class138.field1826[5] = 0.0F;
            class138.field1826[2] = 0.0F;
            class138.field1826[8] = 0.0F;
            class138.field1826[13] = 0.0F;
            class138.field1826[6] = 1.0F;
            class138.field1826[15] = 1.0F;
            class138.field1826[9] = 1.0F;
            class138.field1826[1] = 0.0F;
            class138.field1826[3] = 0.0F;
            class138.field1826[7] = 0.0F;
            class138.field1826[10] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class138.field1826, 0);
            if (~(7 & this.field5930) != -1) {
                this.field5953.method3974(true, 5);
                this.field5953.method3929(4611);
            } else {
                this.field5953.method3974(false, 5);
            }
            this.field5953.method3947(this.field5956, this.field5967, this.field5958, this.field5963, 32886);
            if (this.field5953.field9928.field3193.length >= this.field5946 * 2) {
                this.field5953.field9928.field3133 = 0;
            } else {
                this.field5953.field9928 = new class333(this.field5946 * 2);
            }
            int var9 = 0;
            class333 var10 = this.field5953.field9928;
            if (!this.field5953.field9865) {
                for (int var11 = arg4; ~var11 > ~arg6; ++var11) {
                    int var12 = super.field4366 * var11 - -arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field5928[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    ++var9;
                                    var10.method1514(var14[var15] & 65535, (byte) -59);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field4366 * var16 + arg3;
                    for (int var19 = arg3; ~var19 > ~arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field5928[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    ++var9;
                                    var10.method1541(374, var20[var21] & 65535);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class304 var17 = new class304(this.field5953, 5123, var10.field3193, var10.field3133);
                this.field5953.method3980(var17, var9, true, 4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "fa", descriptor = "(IILr;)Lr;")
    public final class736 method2065(int arg0, int arg1, class736 arg2) {
        ++field5948;
        if (~(this.field5942[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field4369 >> this.field5953.field9804;
            class474 var5 = (class474) arg2;
            class474 var6;
            if (var5 != null && var5.method2674(var4, false, var4)) {
                var6 = var5;
                var5.method2670((byte) -126);
            } else {
                var6 = new class474(this.field5953, var4, var4);
            }
            var6.method2671(0, 0, var4, 106, var4);
            this.method2586(arg1, arg0, true, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static void method2585(boolean arg0) {
        field5965 = null;
        field5949 = null;
        if (!arg0) {
            field5968 = 62;
        }
    }

    @OriginalMember(owner = "client!lc", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method2063(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5937;
        if (this.field5934 != null && arg0 != null) {
            int var7 = -(this.field5953.field9859 * arg2 >> 8) + arg1 >> this.field5953.field9804;
            int var8 = -(this.field5953.field9935 * arg2 >> 8) + arg3 >> this.field5953.field9804;
            this.field5934.method2157(-7740, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZLoaa;)V")
    private final void method2586(int arg0, int arg1, boolean arg2, class474 arg3) {
        ++field5936;
        int[] var5 = this.field5926[arg1][arg0];
        int[] var6 = this.field5931[arg1][arg0];
        int var7 = var5.length;
        if (this.field5953.field9955.length < var7) {
            this.field5953.field9954 = new int[var7];
            this.field5953.field9955 = new int[var7];
        }
        int[] var8 = this.field5953.field9955;
        int[] var9 = this.field5953.field9954;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field5953.field9804;
            var9[var10] = var6[var10] >> this.field5953.field9804;
        }
        if (!arg2) {
            this.field5969 = null;
        }
        int var11 = 0;
        while (~var7 < ~var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var15 - var13) * (var16 - var14)) > 0) {
                arg3.method2675(var13, var12, var17, -27312, var15, var16, var14);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "ka", descriptor = "(III)V")
    public final void method2058(int arg0, int arg1, int arg2) {
        ++field5954;
        if (~(255 & this.field5961[arg0][arg1]) > ~arg2) {
            this.field5961[arg0][arg1] = (byte) arg2;
        }
    }
}
