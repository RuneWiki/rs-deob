import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class506 extends class132 {

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Leea;")
    private class114 field7320 = new class114();

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Lad;")
    public class362 field7335;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "[[I")
    private int[][] field7330;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    private int field7311;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "[[[I")
    public int[][][] field7338;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "[[F")
    private float[][] field7351;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "[[[Lnc;")
    private class22[][][] field7341;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "[[S")
    public short[][] field7336;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "[[[I")
    public int[][][] field7321;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[[[I")
    private int[][][] field7310;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[[B")
    private byte[][] field7323;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field7316;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "[[B")
    private byte[][] field7353;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "[[F")
    private float[][] field7352;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    private int field7331;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "[[[I")
    public int[][][] field7322;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "[[[I")
    private int[][][] field7317;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "[[F")
    private float[][] field7346;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "Lsd;")
    private class80 field7354;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "Lqq;")
    private class410 field7334;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Lea;")
    public static class474 field7326 = new class474("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "Ljava/lang/String;")
    public static String field7343 = "";

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    private int field7309;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    private int field7339;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    private int field7344;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    private int field7348;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "Loc;")
    public static class175 field7340;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lgr;")
    public class371 field7345;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "Lgr;")
    public class371 field7347;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "Lgr;")
    public class371 field7349;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "Lgr;")
    private class371 field7355;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "Lbo;")
    private class632 field7350;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "[Lnc;")
    private class22[] field7356;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[[[I")
    private int[][][] field7312;

    @OriginalMember(owner = "client!pf", name = "EA", descriptor = "(III)V")
    public final void method251(int arg0, int arg1, int arg2) {
        ++field7342;
        if (arg2 > (255 & this.field7353[arg0][arg1])) {
            this.field7353[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public final void method254(int arg0, int arg1) {
        ++field7313;
    }

    @OriginalMember(owner = "client!pf", name = "JA", descriptor = "(II)I")
    public final int method259(int arg0, int arg1) {
        ++field7318;
        return this.field7330[arg0][arg1];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILwca;BI)V")
    private final void method3008(int arg0, class591 arg1, byte arg2, int arg3) {
        ++field7314;
        int[] var5 = this.field7322[arg3][arg0];
        int[] var6 = this.field7321[arg3][arg0];
        if (arg2 != -115) {
            this.field7338 = null;
        }
        int var7 = var5.length;
        if (this.field7335.field5496.length < var7) {
            this.field7335.field5496 = new int[var7];
            this.field7335.field5494 = new int[var7];
        }
        int[] var8 = this.field7335.field5496;
        int[] var9 = this.field7335.field5494;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field7335.field5348;
            var9[var10] = var6[var10] >> this.field7335.field5348;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((var16 - var14) * (-var13 + var15)) > 0) {
                arg1.method3445(var12, var15, (byte) 88, var13, var17, var14, var16);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[[ZZ)V")
    public final void method262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field7306;
        this.method3011(-122, arg4, arg1, arg2, -1, arg0, arg3);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Ldb;")
    public static final class272 method3009(byte arg0, int arg1) {
        ++field7308;
        class272[] var2 = class446.method2777((byte) 70);
        int var3 = 8 / ((-33 - arg0) / 53);
        for (int var4 = 0; ~var2.length < ~var4; ++var4) {
            if (var2[var4].field3812 == arg1) {
                return var2[var4];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pf", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method256(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7307;
        if (this.field7334 != null && arg0 != null) {
            int var7 = -(this.field7335.field5449 * arg2 >> 8) + arg1 >> this.field7335.field5348;
            int var8 = arg3 - (this.field7335.field5482 * arg2 >> 8) >> this.field7335.field5348;
            this.field7334.method2600(var7, arg0, -128, var8);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method3010(int arg0) {
        field7343 = null;
        if (arg0 == -26243) {
            field7326 = null;
            field7340 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method248(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7319;
        if (this.field7334 != null && arg0 != null) {
            int var7 = -(this.field7335.field5449 * arg2 >> 8) + arg1 >> this.field7335.field5348;
            int var8 = arg3 - (this.field7335.field5482 * arg2 >> 8) >> this.field7335.field5348;
            return this.field7334.method2595(arg0, var7, var8, 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7305;
        if (~this.field7344 < -1) {
            this.field7335.method2284((byte) 85);
            this.field7335.method2278(false, -32);
            this.field7335.method2326(-1254361672, false);
            this.field7335.method2260(2144, false);
            this.field7335.method2285(-32, false);
            this.field7335.method2327(0, (byte) -121);
            this.field7335.method2286(-2, (byte) -88);
            this.field7335.method2295(-51, (class507) null);
            class273.field3816[2] = 0.0F;
            class273.field3816[14] = 0.0F;
            class273.field3816[4] = 0.0F;
            class273.field3816[9] = 0.0F;
            class273.field3816[10] = 0.0F;
            class273.field3816[6] = 0.0F;
            class273.field3816[15] = 1.0F;
            class273.field3816[11] = 0.0F;
            class273.field3816[0] = (float) arg2 / ((float) super.field1662 * 128.0F * (float) this.field7335.field5227);
            class273.field3816[1] = 0.0F;
            class273.field3816[7] = 0.0F;
            class273.field3816[3] = 0.0F;
            class273.field3816[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7335.field5227;
            class273.field3816[8] = 0.0F;
            class273.field3816[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7335.field5219) + 1.0F;
            class273.field3816[5] = (float) arg2 / ((float) super.field1662 * 128.0F * (float) this.field7335.field5219);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class273.field3816, 0);
            class273.field3816[8] = 0.0F;
            class273.field3816[6] = 1.0F;
            class273.field3816[13] = 0.0F;
            class273.field3816[15] = 1.0F;
            class273.field3816[1] = 0.0F;
            class273.field3816[14] = 0.0F;
            class273.field3816[7] = 0.0F;
            class273.field3816[3] = 0.0F;
            class273.field3816[10] = 0.0F;
            class273.field3816[2] = 0.0F;
            class273.field3816[9] = 1.0F;
            class273.field3816[12] = 0.0F;
            class273.field3816[11] = 0.0F;
            class273.field3816[4] = 0.0F;
            class273.field3816[0] = 1.0F;
            class273.field3816[5] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class273.field3816, 0);
            if (~(7 & this.field7316) != -1) {
                this.field7335.method2326(-1254361672, true);
                this.field7335.method2321((byte) 121);
            } else {
                this.field7335.method2326(-1254361672, false);
            }
            this.field7335.method2255(this.field7349, (byte) 4, this.field7347, this.field7355, this.field7345);
            if (this.field7335.field5392.field2622.length >= this.field7309 * 2) {
                this.field7335.field5392.field2610 = 0;
            } else {
                this.field7335.field5392 = new class257(this.field7309 * 2);
            }
            int var9 = 0;
            class257 var10 = this.field7335.field5392;
            if (this.field7335.field5468) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field1656 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field7336[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method1229(var14[var15] & 65535, 30364);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field1656 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field7336[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method1185(var20[var21] & 65535, 1616065864);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class300 var17 = new class300(this.field7335, 5123, var10.field2622, var10.field2610);
                this.field7335.method2263(0, var9, 4, (byte) -104, var17);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "sa", descriptor = "(II)I")
    public final int method249(int arg0, int arg1) {
        ++field7329;
        int var3 = arg0 >> super.field1663;
        int var4 = arg1 >> super.field1663;
        if (~var3 <= -1 && ~var4 <= -1 && var3 <= super.field1656 + -1 && ~(super.field1660 - 1) <= ~var4) {
            int var5 = arg0 & super.field1662 + -1;
            int var6 = super.field1662 + -1 & arg1;
            int var7 = (-var5 + super.field1662) * this.field7330[var3][var4] - -(this.field7330[var3 + 1][var4] * var5) >> super.field1663;
            int var8 = (-var5 + super.field1662) * this.field7330[var3][var4 + 1] + this.field7330[var3 + 1][var4 - -1] * var5 >> super.field1663;
            return (-var6 + super.field1662) * var7 + var6 * var8 >> super.field1663;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method252(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field7312 == null) {
            this.field7312 = new int[super.field1656][super.field1660][];
        }
        if (arg3 != null && this.field7317 == null) {
            this.field7317 = new int[super.field1656][super.field1660][];
        }
        ++field7315;
        this.field7322[arg0][arg1] = arg2;
        this.field7321[arg0][arg1] = arg4;
        this.field7338[arg0][arg1] = arg6;
        this.field7310[arg0][arg1] = arg7;
        if (this.field7312 != null) {
            this.field7312[arg0][arg1] = arg5;
        }
        if (this.field7317 != null) {
            this.field7317[arg0][arg1] = arg3;
        }
        class22[] var15 = this.field7341[arg0][arg1] = new class22[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14);
            class324 var19;
            for (var19 = this.field7354.method524((byte) 112, var17); var19 != null; var19 = this.field7354.method526(2)) {
                class22 var20 = (class22) var19;
                if (~arg8[var16] == ~var20.field226 && (float) arg9[var16] == var20.field220 && ~var20.field230 == ~arg10 && var20.field234 == arg11 && var20.field232 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class22(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7354.method520((byte) -96, var15[var16], var17);
            } else {
                var15[var16] = (class22) var19;
            }
        }
        if (arg13) {
            this.field7323[arg0][arg1] = (byte) class283.method1834(this.field7323[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field7348) {
            this.field7348 = arg6.length;
        }
        this.field7344 += arg6.length;
    }

    @OriginalMember(owner = "client!pf", name = "ba", descriptor = "()V")
    public final void method257() {
        if (~this.field7344 < -1) {
            byte[][] var1 = new byte[super.field1656 + 1][super.field1660 + 1];
            for (int var2 = 1; super.field1656 > var2; ++var2) {
                for (int var103 = 1; super.field1660 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field7353[var2][var103 + -1] >> 2) + (this.field7353[var2][var103 - -1] >> 3) + (this.field7353[var2][var103] >> 1) + (this.field7353[var2 + -1][var103] >> 2) + (this.field7353[var2 + 1][var103] >> 3));
                }
            }
            this.field7356 = new class22[this.field7354.method521((byte) -77)];
            this.field7354.method519(7710, this.field7356);
            for (int var3 = 0; ~this.field7356.length < ~var3; ++var3) {
                this.field7356[var3].method138((byte) 34, this.field7344);
            }
            int var4 = 24;
            if (this.field7312 != null) {
                var4 += 4;
            }
            if (~(this.field7316 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field7335.field5353.method3408(this.field7344 * var4, false);
            Stream var6 = new Stream(var5);
            class22[] var7 = new class22[this.field7344];
            int var8 = class309.method2052(true, this.field7344 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class80 var9 = new class80(var8);
            class22[] var10 = new class22[this.field7348];
            for (int var11 = 0; ~var11 > ~super.field1656; ++var11) {
                for (int var30 = 0; ~super.field1660 < ~var30; ++var30) {
                    if (this.field7338[var11][var30] != null) {
                        class22[] var31 = this.field7341[var11][var30];
                        int[] var32 = this.field7322[var11][var30];
                        int[] var33 = this.field7321[var11][var30];
                        int[] var34 = this.field7310[var11][var30];
                        int[] var35 = this.field7338[var11][var30];
                        int[] var36 = this.field7317 != null ? this.field7317[var11][var30] : null;
                        int[] var37 = this.field7312 != null ? this.field7312[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field7346[var11][var30];
                        float var39 = this.field7351[var11][var30];
                        float var40 = this.field7352[var11][var30];
                        float var41 = this.field7346[var11][var30 + 1];
                        float var42 = this.field7351[var11][var30 + 1];
                        float var43 = this.field7352[var11][var30 + 1];
                        float var44 = this.field7346[var11 + 1][var30 + 1];
                        float var45 = this.field7351[var11 - -1][var30 + 1];
                        float var46 = this.field7352[var11 + 1][var30 + 1];
                        float var47 = this.field7346[var11 + 1][var30];
                        float var48 = this.field7351[var11 + 1][var30];
                        float var49 = this.field7352[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; var35.length > var55; ++var55) {
                            class22 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field7336[super.field1656 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field1663) + var32[var57];
                            int var59 = (var30 << super.field1663) + var33[var57];
                            int var60 = var58 >> this.field7311;
                            int var61 = var59 >> this.field7311;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            int var74;
                            float var75;
                            if (~var67 == -1 && var68 == 0) {
                                var72 = var40;
                                var73 = var39;
                                var74 = var69 - var50;
                                var75 = var38;
                            } else if (~var67 == -1 && ~super.field1662 == ~var68) {
                                var74 = var69 - var51;
                                var72 = var43;
                                var73 = var42;
                                var75 = var41;
                            } else if (super.field1662 == var67 && super.field1662 == var68) {
                                var75 = var44;
                                var73 = var45;
                                var72 = var46;
                                var74 = var69 - var52;
                            } else if (~super.field1662 == ~var67 && var68 == 0) {
                                var74 = var69 - var53;
                                var72 = var49;
                                var73 = var48;
                                var75 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field1662;
                                float var77 = (float) var68 / (float) super.field1662;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                var75 = (-var78 + var81) * var77 + var78;
                                var73 = (var82 - var79) * var77 + var79;
                                float var83 = (var46 - var43) * var76 + var43;
                                var72 = (var83 - var80) * var77 + var80;
                                int var84 = var50 - -((-var50 + var53) * var67 >> super.field1663);
                                int var85 = ((-var51 + var52) * var67 >> super.field1663) + var51;
                                var74 = var69 - (((-var84 + var85) * var68 >> super.field1663) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (~var86 > -3) {
                                    var86 = 2;
                                } else if (~var86 < -127) {
                                    var86 = 126;
                                }
                                if ((7 & this.field7316) == 0) {
                                    float var87 = this.field7335.field5387[2] * var72 + this.field7335.field5387[1] * var73 + this.field7335.field5387[0] * var75;
                                    var71 = this.field7335.field5386 + (var87 > 0.0F ? this.field7335.field5487 : this.field7335.field5465) * var87;
                                }
                                var70 = class403.field6100[var86 | var62 & 65408];
                            }
                            class324 var88 = null;
                            if ((var58 & this.field7331 + -1) == 0 && ~(this.field7331 + -1 & var59) == -1) {
                                var88 = var9.method524((byte) 121, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var74 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class403.field6100[var63 & 65408 | var90];
                                    if ((7 & this.field7316) == 0) {
                                        float var91 = this.field7335.field5387[2] * var72 + this.field7335.field5387[0] * var75 + this.field7335.field5387[1] * var73;
                                        float var92 = var71 * (var71 > 0.0F ? this.field7335.field5487 : this.field7335.field5465) + this.field7335.field5386;
                                        int var93 = 255 & var89 >> 16;
                                        int var94 = 255 & var89 >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var89;
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 >= 0) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var97 << 8 | var95 << 16;
                                    }
                                }
                                if (!this.field7335.field5468) {
                                    var6.method3416((float) var58);
                                    var6.method3416((float) (var64 + this.method249(var58, var59)));
                                    var6.method3416((float) var59);
                                    var6.method3412((byte) (var89 >> 16));
                                    var6.method3412((byte) (var89 >> 8));
                                    var6.method3412((byte) var89);
                                    var6.method3412(-1);
                                    var6.method3416((float) var58);
                                    var6.method3416((float) var59);
                                    if (this.field7312 != null) {
                                        var6.method3416((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field7316 & 7) != -1) {
                                        var6.method3416(var75);
                                        var6.method3416(var73);
                                        var6.method3416(var72);
                                    }
                                } else {
                                    var6.method3415((float) var58);
                                    var6.method3415((float) (this.method249(var58, var59) + var64));
                                    var6.method3415((float) var59);
                                    var6.method3412((byte) (var89 >> 16));
                                    var6.method3412((byte) (var89 >> 8));
                                    var6.method3412((byte) var89);
                                    var6.method3412(-1);
                                    var6.method3415((float) var58);
                                    var6.method3415((float) var59);
                                    if (this.field7312 != null) {
                                        var6.method3415((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field7316) != -1) {
                                        var6.method3415(var75);
                                        var6.method3415(var73);
                                        var6.method3415(var72);
                                    }
                                }
                                var99 = this.field7339++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method520((byte) -66, new class173(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class173) var88).field2118;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var7[var99].field4676 > var31[var57].field4676) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method142(var70, var74, var99, var71, 10165);
                            }
                            ++this.field7309;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field7339 < ~var12; ++var12) {
                class22 var29 = var7[var12];
                if (var29 != null) {
                    var29.method136((byte) -1, var12);
                }
            }
            for (int var13 = 0; super.field1656 > var13; ++var13) {
                for (int var18 = 0; var18 < super.field1660; ++var18) {
                    short[] var19 = this.field7336[super.field1656 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class22 var25 = var7[var22];
                            class22 var26 = var7[var23];
                            class22 var27 = var7[var24];
                            class22 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method141(var20, var13, -64, var18);
                            }
                            if (var26 != null) {
                                var26.method141(var20, var13, -54, var18);
                                if (var28 == null || var28.field4676 > var26.field4676) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method141(var20, var13, -110, var18);
                                if (var28 == null || var27.field4676 < var28.field4676) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method136((byte) -1, var22);
                                }
                                if (var26 != null) {
                                    var28.method136((byte) -1, var23);
                                }
                                if (var27 != null) {
                                    var28.method136((byte) -1, var24);
                                }
                                var28.method141(var20, var13, -88, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3411();
            this.field7350 = this.field7335.method2298(true, var6.method3420(), var5, false, var4);
            this.field7349 = new class371(this.field7350, 5126, 3, 0);
            this.field7355 = new class371(this.field7350, 5121, 4, 12);
            byte var14;
            if (this.field7312 != null) {
                this.field7345 = new class371(this.field7350, 5126, 3, 16);
                var14 = 28;
            } else {
                var14 = 24;
                this.field7345 = new class371(this.field7350, 5126, 2, 16);
            }
            if ((7 & this.field7316) != 0) {
                this.field7347 = new class371(this.field7350, 5126, 3, var14);
            }
            long[] var15 = new long[this.field7356.length];
            for (int var16 = 0; this.field7356.length > var16; ++var16) {
                class22 var17 = this.field7356[var16];
                var15[var16] = var17.field4676;
                var17.method134(-2097723632, this.field7339);
            }
            class141.method849(-42, var15, this.field7356);
            if (this.field7334 != null) {
                this.field7334.method2597(44);
            }
        } else {
            this.field7334 = null;
        }
        ++field7337;
        this.field7317 = null;
        this.field7346 = this.field7351 = this.field7352 = null;
        this.field7341 = null;
        this.field7338 = null;
        this.field7354 = null;
        this.field7312 = null;
        this.field7322 = this.field7321 = null;
        this.field7310 = null;
        this.field7353 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lad;IIII[[I[[II)V")
    public class506(class362 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7335 = arg0;
        this.field7330 = arg5;
        this.field7311 = super.field1663 + -2;
        this.field7338 = new int[arg3][arg4][];
        this.field7351 = new float[super.field1656 + 1][super.field1660 + 1];
        this.field7341 = new class22[arg3][arg4][];
        this.field7336 = new short[arg3 * arg4][];
        this.field7321 = new int[arg3][arg4][];
        this.field7310 = new int[arg3][arg4][];
        this.field7323 = new byte[arg3][arg4];
        this.field7316 = arg2;
        this.field7353 = new byte[arg3 + 1][arg4 + 1];
        this.field7352 = new float[super.field1656 + 1][super.field1660 - -1];
        this.field7331 = 1 << this.field7311;
        this.field7322 = new int[arg3][arg4][];
        this.field7317 = new int[arg3][arg4][];
        this.field7346 = new float[super.field1656 + 1][super.field1660 - -1];
        for (int var9 = 1; ~var9 > ~super.field1660; ++var9) {
            for (int var10 = 1; var10 < super.field1656; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var11 * var11)));
                this.field7346[var10][var9] = (float) var11 * var13;
                this.field7351[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field7352[var10][var9] = (float) var12 * var13;
            }
        }
        this.field7354 = new class80(128);
        if ((this.field7316 & 16) != 0) {
            this.field7334 = new class410(this.field7335, this);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method263(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7333;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
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
        this.method252(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIIII[[Z)V")
    private final void method3011(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean[][] arg6) {
        ++field7324;
        int var8 = 98 % ((arg0 - -22) / 55);
        if (this.field7356 != null) {
            int var9 = arg3 + 1 + arg3;
            int var10 = var9 * var9;
            if (~var10 < ~this.field7335.field5493.length) {
                this.field7335.field5493 = new int[var10];
            }
            if (~(this.field7309 * 2) < ~this.field7335.field5392.field2622.length) {
                this.field7335.field5392 = new class257(this.field7309 * 2);
            }
            int var11 = -arg3 + arg5;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg3 + arg2;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg3 + arg5;
            if (super.field1656 + -1 < var15) {
                var15 = super.field1656 - 1;
            }
            int var16 = arg2 - -arg3;
            if (super.field1660 + -1 < var16) {
                var16 = super.field1660 - 1;
            }
            int var17 = 0;
            int[] var18 = this.field7335.field5493;
            for (int var19 = var11; var19 <= var15; ++var19) {
                boolean[] var25 = arg6[-var12 + var19];
                for (int var26 = var13; var16 >= var26; ++var26) {
                    if (var25[var26 - var14]) {
                        var18[var17++] = super.field1656 * var26 - -var19;
                    }
                }
            }
            if (~arg4 == 0) {
                this.field7335.method2253(false);
            } else {
                this.field7335.method2304((float) arg4, -2);
                this.field7335.method2265((byte) 86);
            }
            this.field7335.method2326(-1254361672, (this.field7316 & 7) != 0);
            for (int var20 = 0; ~this.field7356.length < ~var20; ++var20) {
                this.field7356[var20].method143(var18, var17, 55);
            }
            if (!this.field7320.method715(true)) {
                int var21 = this.field7335.field5466;
                int var22 = this.field7335.field5424;
                this.field7335.method352(0, var22, this.field7335.field5395);
                this.field7335.method2326(-1254361672, false);
                this.field7335.method2285(-32, false);
                this.field7335.method2327(128, (byte) -124);
                this.field7335.method2286(-2, (byte) -114);
                this.field7335.method2295(-110, this.field7335.field5435);
                this.field7335.method2320(7681, 8448, 0);
                this.field7335.method2291(34166, 0, 770, (byte) -35);
                this.field7335.method2333(770, 34167, 0, (byte) 71);
                for (class324 var23 = this.field7320.method719(false); var23 != null; var23 = this.field7320.method716(14)) {
                    class306 var24 = (class306) var23;
                    var24.method2039(arg3, arg2, arg6, 0, arg5);
                }
                this.field7335.method2291(5890, 0, 768, (byte) -35);
                this.field7335.method2333(770, 5890, 0, (byte) 77);
                this.field7335.method2295(-105, (class507) null);
                this.field7335.method352(var21, var22, this.field7335.field5395);
            }
            if (this.field7334 != null) {
                this.field7335.method2255(this.field7349, (byte) 4, (class371) null, (class371) null, this.field7345);
                this.field7334.method2596(101, arg2, arg3, arg5, arg6, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Loj;[I)V")
    public final void method258(class321 arg0, int[] arg1) {
        ++field7325;
        this.field7320.method706(new class306(this.field7335, this, arg0, arg1), true);
    }

    @OriginalMember(owner = "client!pf", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method261(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7328;
        if (this.field7334 != null && arg0 != null) {
            int var7 = -(this.field7335.field5449 * arg2 >> 8) + arg1 >> this.field7335.field5348;
            int var8 = -(this.field7335.field5482 * arg2 >> 8) + arg3 >> this.field7335.field5348;
            this.field7334.method2601(arg0, -117, var7, var8);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(IILw;)Lw;")
    public final class252 method250(int arg0, int arg1, class252 arg2) {
        ++field7332;
        if ((this.field7323[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field1662 >> this.field7335.field5348;
            class591 var5 = (class591) arg2;
            class591 var6;
            if (var5 != null && var5.method3446((byte) 13, var4, var4)) {
                var6 = var5;
                var5.method3443(121);
            } else {
                var6 = new class591(this.field7335, var4, var4);
            }
            var6.method3447(var4, 0, -1029, var4, 0);
            this.method3008(arg1, var6, (byte) -115, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(CZ)Z")
    public static final boolean method3012(char arg0, boolean arg1) {
        ++field7327;
        if (!arg1) {
            method3009((byte) 23, 74);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && ~arg0 >= -123;
    }
}
