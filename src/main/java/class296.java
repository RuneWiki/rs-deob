import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class296 extends class443 {

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Lvf;")
    private class166 field4386 = new class166();

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Lic;")
    public class246 field4381;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "[[I")
    private int[][] field4375;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public int field4383;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "[[[I")
    private int[][][] field4371;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "[[[Lus;")
    private class177[][][] field4382;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "[[[I")
    public int[][][] field4370;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "[[[I")
    public int[][][] field4384;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "[[[I")
    private int[][][] field4378;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[[[I")
    private int[][][] field4374;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[[S")
    public short[][] field4369;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "[[B")
    private byte[][] field4385;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "[[B")
    private byte[][] field4392;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "[[F")
    private float[][] field4390;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "[[F")
    private float[][] field4397;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "[[F")
    private float[][] field4394;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "Lwb;")
    private class45 field4396;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Lvb;")
    private class98 field4377;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "Lvt;")
    public static class179 field4380 = new class179(1);

    @OriginalMember(owner = "client!to", name = "J", descriptor = "[I")
    private static int[] field4398 = new int[1];

    @OriginalMember(owner = "client!to", name = "O", descriptor = "[F")
    private static float[] field4403 = new float[16];

    @OriginalMember(owner = "client!to", name = "K", descriptor = "[I")
    private static int[] field4399 = new int[1];

    @OriginalMember(owner = "client!to", name = "P", descriptor = "[I")
    private static int[] field4404 = new int[1];

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    private int field4373;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    private int field4388;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    private int field4389;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "I")
    private static int field4401;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "Lfh;")
    public class228 field4393;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "Lfh;")
    public class228 field4400;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "Lfh;")
    private class228 field4402;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "Lfh;")
    public class228 field4405;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "Leb;")
    private class416 field4391;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "[Lus;")
    private class177[] field4395;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "[[[I")
    private int[][][] field4372;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(II)I", line = 7)
    public final int method1857(int arg0, int arg1) {
        int var3 = arg0 >> this.field4376;
        int var4 = arg1 >> this.field4376;
        if (var3 < 0 || var4 < 0 || var3 > this.field6326 - 1 || var4 > this.field6324 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field4383 - 1;
        int var6 = arg1 & this.field4383 - 1;
        int var7 = (this.field4383 - var5) * this.field4375[var3][var4] + this.field4375[var3 + 1][var4] * var5 >> this.field4376;
        int var8 = (this.field4383 - var5) * this.field4375[var3][var4 + 1] + this.field4375[var3 + 1][var4 + 1] * var5 >> this.field4376;
        return (this.field4383 - var6) * var7 + var6 * var8 >> this.field4376;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lph;IIIIZ)V", line = 27)
    public final void method1858(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4377 != null && arg0 != null) {
            int var7 = arg1 - (this.field4381.field3473 * arg2 >> 8) >> this.field4381.field3361;
            int var8 = arg3 - (this.field4381.field3443 * arg2 >> 8) >> this.field4381.field3361;
            this.field4377.method484(var7, var8, -15021, arg0);
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(II)V", line = 39)
    public final void method1859(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lkl;II)V", line = 42)
    private final void method1860(class447 arg0, int arg1, int arg2) {
        int[] var4 = this.field4370[arg1][arg2];
        int[] var5 = this.field4384[arg1][arg2];
        int var6 = var4.length;
        if (field4399.length < var6) {
            field4399 = new int[var6];
            field4404 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field4399[var7] = (var4[var7] & 0xFF) >> this.field4381.field3361;
            field4404[var7] = (var5[var7] & 0xFF) >> this.field4381.field3361;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field4399[var8];
            int var10 = field4404[var8++];
            int var11 = field4399[var8];
            int var12 = field4404[var8++];
            int var13 = field4399[var8];
            int var14 = field4404[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method2625(var14, var9, var10, var11, var12, -75, var13);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I", line = 91)
    public final int method1861(int arg0, int arg1) {
        return this.field4375[arg0][arg1];
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII[[Z)V", line = 95)
    public final void method1862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field4389 <= 0) {
            return;
        }
        opengl var9 = this.field4381.field3342;
        this.field4381.method1391();
        this.field4381.method1437(false);
        this.field4381.method1353(false);
        this.field4381.method1402(false);
        this.field4381.method1441(false);
        this.field4381.method1371(0);
        this.field4381.method1418(-2);
        this.field4381.method1379((class5) null);
        field4403[0] = (float) arg2 / ((float) this.field4383 * 128.0F * (float) this.field4381.field3362);
        field4403[1] = 0.0F;
        field4403[2] = 0.0F;
        field4403[3] = 0.0F;
        field4403[4] = 0.0F;
        field4403[5] = (float) arg2 / ((float) this.field4383 * 128.0F * (float) this.field4381.field3350);
        field4403[6] = 0.0F;
        field4403[7] = 0.0F;
        field4403[8] = 0.0F;
        field4403[9] = 0.0F;
        field4403[10] = 0.0F;
        field4403[11] = 0.0F;
        field4403[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4381.field3362;
        field4403[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4381.field3350;
        field4403[14] = 0.0F;
        field4403[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field4403, 0);
        field4403[0] = 1.0F;
        field4403[1] = 0.0F;
        field4403[2] = 0.0F;
        field4403[3] = 0.0F;
        field4403[4] = 0.0F;
        field4403[5] = 0.0F;
        field4403[6] = 1.0F;
        field4403[7] = 0.0F;
        field4403[8] = 0.0F;
        field4403[9] = 1.0F;
        field4403[10] = 0.0F;
        field4403[11] = 0.0F;
        field4403[12] = 0.0F;
        field4403[13] = 0.0F;
        field4403[14] = 0.0F;
        field4403[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field4403, 0);
        if ((this.field4387 & 0x7) == 0) {
            this.field4381.method1353(false);
        } else {
            this.field4381.method1353(true);
            this.field4381.method1499();
        }
        this.field4381.method1412(this.field4400, this.field4405, this.field4402, this.field4393);
        if (field4380.field2159.length < this.field4379 * 2) {
            field4380 = new class179(this.field4379 * 2);
        } else {
            field4380.field2206 = 0;
        }
        int var10 = 0;
        if (this.field4381.field3370) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field6326 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field4369[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field4380.method884(var14[var15] & 0xFFFF, true);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field6326 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field4369[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field4380.method880(true, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class489 var21 = new class489(this.field4381, 5123, field4380.field2159, field4380.field2206);
            this.field4381.method1399(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V", line = 257)
    public final void method1863(int arg0, int arg1, int arg2) {
        if ((this.field4392[arg0][arg1] & 0xFF) < arg2) {
            this.field4392[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lph;IIIIZ)V", line = 264)
    public final void method1864(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4377 != null && arg0 != null) {
            int var7 = arg1 - (this.field4381.field3473 * arg2 >> 8) >> this.field4381.field3361;
            int var8 = arg3 - (this.field4381.field3443 * arg2 >> 8) >> this.field4381.field3361;
            this.field4377.method477(var7, (byte) 53, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 278)
    public final void method1865(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field4372 == null) {
            this.field4372 = new int[this.field6326][this.field6324][];
        }
        if (arg3 != null && this.field4371 == null) {
            this.field4371 = new int[this.field6326][this.field6324][];
        }
        this.field4370[arg0][arg1] = arg2;
        this.field4384[arg0][arg1] = arg4;
        this.field4378[arg0][arg1] = arg6;
        this.field4374[arg0][arg1] = arg7;
        if (this.field4372 != null) {
            this.field4372[arg0][arg1] = arg5;
        }
        if (this.field4371 != null) {
            this.field4371[arg0][arg1] = arg3;
        }
        class177[] var15 = this.field4382[arg0][arg1] = new class177[arg6.length];
        for (int var16 = 0; var16 < arg6.length; var16++) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class147 var19;
            for (var19 = this.field4396.method233(-70, var17); var19 != null; var19 = this.field4396.method237((byte) -79)) {
                class177 var20 = (class177) var19;
                if (arg8[var16] == var20.field2136 && (float) arg9[var16] == var20.field2141 && var20.field2132 == arg10 && var20.field2135 == arg11 && var20.field2134 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class177(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field4396.method234(-83, var17, var15[var16]);
            } else {
                var15[var16] = (class177) var19;
            }
        }
        if (arg13) {
            this.field4385[arg0][arg1] = (byte) (this.field4385[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field4388) {
            this.field4388 = arg6.length;
        }
        this.field4389 += arg6.length;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lhq;[I)V", line = 337)
    public final void method1866(class190 arg0, int[] arg1) {
        this.field4386.method803(new class267(this.field4381, this, arg0, arg1), 50);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III[[ZZ)V", line = 346)
    public final void method1867(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field4395 == null) {
            return;
        }
        float var6 = this.field4381.field3421;
        float var7 = this.field4381.field3424;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field4398.length < var9) {
            field4398 = new int[var9];
        }
        if (field4380.field2159.length < this.field4379 * 2) {
            field4380 = new class179(this.field4379 * 2);
        }
        int var10 = arg0 - arg2;
        int var11 = var10;
        if (var10 < 0) {
            var10 = 0;
        }
        int var12 = arg1 - arg2;
        int var13 = var12;
        if (var12 < 0) {
            var12 = 0;
        }
        int var14 = arg0 + arg2;
        if (var14 > this.field6326 - 1) {
            var14 = this.field6326 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field6324 - 1) {
            var15 = this.field6324 - 1;
        }
        field4401 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field4398[field4401++] = this.field6326 * var18 + var16;
                }
            }
        }
        this.field4381.method1425();
        this.field4381.method1353((this.field4387 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field4395.length; var19++) {
            this.field4395[var19].method873((byte) -40, field4398, field4401);
        }
        if (!this.field4386.method812((byte) 47)) {
            int var20 = this.field4381.field3476;
            int var21 = this.field4381.field3427;
            this.field4381.method1417(0, var21);
            this.field4381.method1498(var7, var6 - 4.0F);
            this.field4381.method1353(false);
            this.field4381.method1441(false);
            this.field4381.method1371(130);
            this.field4381.method1418(-2);
            this.field4381.method1379(this.field4381.field3418);
            this.field4381.method1360(8448, 7681);
            this.field4381.method1458(0, 34166, 770);
            this.field4381.method1384(0, 34167, 770);
            for (class147 var22 = this.field4386.method802((byte) 113); var22 != null; var22 = this.field4386.method806((byte) 104)) {
                class267 var23 = (class267) var22;
                var23.method1617(arg0, (byte) 95, arg3, arg1, arg2);
            }
            this.field4381.method1458(0, 5890, 768);
            this.field4381.method1384(0, 5890, 770);
            this.field4381.method1379((class5) null);
            this.field4381.method1417(var20, var21);
        }
        if (this.field4377 != null) {
            this.field4381.method1498(var7, var6 - 8.0F);
            this.field4381.method1425();
            this.field4381.method1412(this.field4400, (class228) null, (class228) null, this.field4393);
            this.field4377.method479(arg1, arg3, arg4, arg2, 105, arg0);
        }
        this.field4381.method1498(var7, var6);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V", line = 481)
    public final void method1868() {
        if (this.field4389 > 0) {
            byte[][] var1 = new byte[this.field6326 + 1][this.field6324 + 1];
            for (int var2 = 1; var2 < this.field6326; var2++) {
                for (int var3 = 1; var3 < this.field6324; var3++) {
                    var1[var2][var3] = (byte) ((this.field4392[var2][var3] >> 1) + (this.field4392[var2][var3 + 1] >> 3) + (this.field4392[var2][var3 - 1] >> 2) + (this.field4392[var2 - 1][var3] >> 2) + (this.field4392[var2 + 1][var3] >> 3));
                }
            }
            this.field4395 = new class177[this.field4396.method230(0)];
            this.field4396.method243(-64, this.field4395);
            for (int var4 = 0; var4 < this.field4395.length; var4++) {
                this.field4395[var4].method871(118, this.field4389);
            }
            int var5 = 24;
            if (this.field4372 != null) {
                var5 += 4;
            }
            if ((this.field4387 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field4389 * var5).order(ByteOrder.nativeOrder());
            class177[] var7 = new class177[this.field4389];
            class45 var8 = new class45(class89.method446(-744346942, this.field4389));
            class177[] var9 = new class177[this.field4388];
            for (int var10 = 0; var10 < this.field6326; var10++) {
                for (int var11 = 0; var11 < this.field6324; var11++) {
                    if (this.field4378[var10][var11] != null) {
                        class177[] var12 = this.field4382[var10][var11];
                        int[] var13 = this.field4370[var10][var11];
                        int[] var14 = this.field4384[var10][var11];
                        int[] var15 = this.field4374[var10][var11];
                        int[] var16 = this.field4378[var10][var11];
                        int[] var17 = this.field4371 == null ? null : this.field4371[var10][var11];
                        int[] var18 = this.field4372 == null ? null : this.field4372[var10][var11];
                        if (var15 == null) {
                            var15 = var16;
                        }
                        float var19 = this.field4390[var10][var11];
                        float var20 = this.field4397[var10][var11];
                        float var21 = this.field4394[var10][var11];
                        float var22 = this.field4390[var10][var11 + 1];
                        float var23 = this.field4397[var10][var11 + 1];
                        float var24 = this.field4394[var10][var11 + 1];
                        float var25 = this.field4390[var10 + 1][var11 + 1];
                        float var26 = this.field4397[var10 + 1][var11 + 1];
                        float var27 = this.field4394[var10 + 1][var11 + 1];
                        float var28 = this.field4390[var10 + 1][var11];
                        float var29 = this.field4397[var10 + 1][var11];
                        float var30 = this.field4394[var10 + 1][var11];
                        int var31 = var1[var10][var11] & 0xFF;
                        int var32 = var1[var10][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var34 = var1[var10 + 1][var11] & 0xFF;
                        int var35 = 0;
                        label314: for (int var36 = 0; var36 < var16.length; var36++) {
                            class177 var37 = var12[var36];
                            for (int var38 = 0; var38 < var35; var38++) {
                                if (var9[var38] == var37) {
                                    continue label314;
                                }
                            }
                            var9[var35++] = var37;
                        }
                        short[] var39 = this.field4369[this.field6326 * var11 + var10] = new short[var16.length];
                        for (int var40 = 0; var40 < var16.length; var40++) {
                            int var41 = (var10 << this.field4376) + var13[var40];
                            int var42 = (var11 << this.field4376) + var14[var40];
                            int var43 = var16[var40];
                            int var44 = var15[var40];
                            int var45 = var17 == null ? 0 : var17[var40];
                            long var46 = (long) var44 << 48 | (long) var43 << 32 | (long) (var41 << 16) | (long) var42;
                            int var48 = var13[var40];
                            int var49 = var14[var40];
                            byte var50 = 74;
                            int var51 = 0;
                            float var52 = 1.0F;
                            float var53;
                            float var54;
                            float var55;
                            int var56;
                            if (var48 == 0 && var49 == 0) {
                                var53 = var19;
                                var54 = var20;
                                var55 = var21;
                                var56 = var50 - var31;
                            } else if (var48 == 0 && this.field4383 == var49) {
                                var53 = var22;
                                var54 = var23;
                                var55 = var24;
                                var56 = var50 - var32;
                            } else if (this.field4383 == var48 && this.field4383 == var49) {
                                var53 = var25;
                                var54 = var26;
                                var55 = var27;
                                var56 = var50 - var33;
                            } else if (this.field4383 == var48 && var49 == 0) {
                                var53 = var28;
                                var54 = var29;
                                var55 = var30;
                                var56 = var50 - var34;
                            } else {
                                float var57 = (float) var48 / (float) this.field4383;
                                float var58 = (float) var49 / (float) this.field4383;
                                float var59 = (var28 - var19) * var57 + var19;
                                float var60 = (var29 - var20) * var57 + var20;
                                float var61 = (var30 - var21) * var57 + var21;
                                float var62 = (var25 - var22) * var57 + var22;
                                float var63 = (var26 - var23) * var57 + var23;
                                float var64 = (var27 - var24) * var57 + var24;
                                var53 = (var62 - var59) * var58 + var59;
                                var54 = (var63 - var60) * var58 + var60;
                                var55 = (var64 - var61) * var58 + var61;
                                int var65 = ((var34 - var31) * var48 >> this.field4376) + var31;
                                int var66 = ((var33 - var32) * var48 >> this.field4376) + var32;
                                var56 = var50 - (((var66 - var65) * var49 >> this.field4376) + var65);
                            }
                            if (var43 != -1) {
                                int var67 = (var43 & 0x7F) * var56 >> 7;
                                if (var67 < 2) {
                                    var67 = 2;
                                } else if (var67 > 126) {
                                    var67 = 126;
                                }
                                var51 = class424.field6109[var43 & 0xFF80 | var67];
                                if ((this.field4387 & 0x7) == 0) {
                                    float var68 = this.field4381.field3385[2] * var55 + this.field4381.field3385[0] * var53 + this.field4381.field3385[1] * var54;
                                    var52 = this.field4381.field3472 + var68 * (var68 > 0.0F ? this.field4381.field3371 : this.field4381.field3398);
                                }
                            }
                            class147 var69 = var8.method233(122, var46);
                            int var80;
                            if (var69 == null) {
                                int var71;
                                if (var43 == var44) {
                                    var71 = var51;
                                } else {
                                    int var70 = (var44 & 0x7F) * var56 >> 7;
                                    if (var70 < 2) {
                                        var70 = 2;
                                    } else if (var70 > 126) {
                                        var70 = 126;
                                    }
                                    var71 = class424.field6109[var44 & 0xFF80 | var70];
                                    if ((this.field4387 & 0x7) == 0) {
                                        float var72 = this.field4381.field3385[2] * var55 + this.field4381.field3385[0] * var53 + this.field4381.field3385[1] * var54;
                                        float var73 = this.field4381.field3472 + var52 * (var52 > 0.0F ? this.field4381.field3371 : this.field4381.field3398);
                                        int var74 = var71 >> 16 & 0xFF;
                                        int var75 = var71 >> 8 & 0xFF;
                                        int var76 = var71 & 0xFF;
                                        int var77 = (int) ((float) var74 * var73);
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = (int) ((float) var75 * var73);
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        int var79 = (int) ((float) var76 * var73);
                                        if (var79 < 0) {
                                            var79 = 0;
                                        } else if (var79 > 255) {
                                            var79 = 255;
                                        }
                                        var71 = var77 << 16 | var78 << 8 | var79;
                                    }
                                }
                                var6.putFloat((float) var41);
                                var6.putFloat((float) (this.method1857(var41, var42) + var45));
                                var6.putFloat((float) var42);
                                var6.put((byte) (var71 >> 16));
                                var6.put((byte) (var71 >> 8));
                                var6.put((byte) var71);
                                var6.put((byte) -1);
                                var6.putFloat((float) var41);
                                var6.putFloat((float) var42);
                                if (this.field4372 != null) {
                                    var6.putFloat(var18 == null ? 0.0F : (float) var18[var40]);
                                }
                                if ((this.field4387 & 0x7) != 0) {
                                    var6.putFloat(var53);
                                    var6.putFloat(var54);
                                    var6.putFloat(var55);
                                }
                                var80 = this.field4373++;
                                var39[var40] = (short) var80;
                                if (var43 != -1) {
                                    var7[var80] = var12[var40];
                                }
                                var8.method234(-109, var46, new class251(var39[var40]));
                            } else {
                                var39[var40] = ((class251) var69).field3521;
                                var80 = var39[var40] & 0xFFFF;
                                if (var43 != -1 && var12[var40].field1776 < var7[var80].field1776) {
                                    var7[var80] = var12[var40];
                                }
                            }
                            for (int var81 = 0; var81 < var35; var81++) {
                                var9[var81].method872(var56, var51, var80, var52, -899884280);
                            }
                            this.field4379++;
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < this.field4373; var82++) {
                class177 var83 = var7[var82];
                if (var83 != null) {
                    var83.method868(var82, (byte) 127);
                }
            }
            for (int var84 = 0; var84 < this.field6326; var84++) {
                for (int var85 = 0; var85 < this.field6324; var85++) {
                    short[] var86 = this.field4369[this.field6326 * var85 + var84];
                    if (var86 != null) {
                        int var87 = 0;
                        int var88 = 0;
                        while (var88 < var86.length) {
                            int var89 = var86[var88++] & 0xFFFF;
                            int var90 = var86[var88++] & 0xFFFF;
                            int var91 = var86[var88++] & 0xFFFF;
                            class177 var92 = var7[var89];
                            class177 var93 = var7[var90];
                            class177 var94 = var7[var91];
                            class177 var95 = null;
                            if (var92 != null) {
                                var92.method869(var84, var85, var87, 1);
                                var95 = var92;
                            }
                            if (var93 != null) {
                                var93.method869(var84, var85, var87, 1);
                                if (var95 == null || var93.field1776 < var95.field1776) {
                                    var95 = var93;
                                }
                            }
                            if (var94 != null) {
                                var94.method869(var84, var85, var87, 1);
                                if (var95 == null || var94.field1776 < var95.field1776) {
                                    var95 = var94;
                                }
                            }
                            if (var95 != null) {
                                if (var92 != null) {
                                    var95.method868(var89, (byte) 124);
                                }
                                if (var93 != null) {
                                    var95.method868(var90, (byte) 126);
                                }
                                if (var94 != null) {
                                    var95.method868(var91, (byte) 116);
                                }
                                var95.method869(var84, var85, var87, 1);
                            }
                            var87++;
                        }
                    }
                }
            }
            var6.flip();
            this.field4391 = this.field4381.method1349(var5, var6, false);
            this.field4400 = new class228(this.field4381, this.field4391, 5126, 3, 0);
            this.field4402 = new class228(this.field4381, this.field4391, 5121, 4, 12);
            byte var96;
            if (this.field4372 == null) {
                this.field4393 = new class228(this.field4381, this.field4391, 5126, 2, 16);
                var96 = 24;
            } else {
                this.field4393 = new class228(this.field4381, this.field4391, 5126, 3, 16);
                var96 = 28;
            }
            if ((this.field4387 & 0x7) != 0) {
                this.field4405 = new class228(this.field4381, this.field4391, 5126, 3, var96);
            }
            long[] var97 = new long[this.field4395.length];
            for (int var98 = 0; var98 < this.field4395.length; var98++) {
                class177 var99 = this.field4395[var98];
                var97[var98] = var99.field1776;
                var99.method870(this.field4373, false);
            }
            class438.method2600(true, var97, this.field4395);
            if (this.field4377 != null) {
                this.field4377.method476((byte) 84);
            }
        } else {
            this.field4377 = null;
        }
        this.field4370 = this.field4384 = (int[][][]) null;
        this.field4372 = (int[][][]) null;
        this.field4374 = (int[][][]) null;
        this.field4371 = (int[][][]) null;
        this.field4382 = (class177[][][]) null;
        this.field4378 = (int[][][]) null;
        this.field4392 = (byte[][]) null;
        this.field4396 = null;
        this.field4390 = this.field4397 = this.field4394 = (float[][]) null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILph;)Lph;", line = 990)
    public final class125 method1869(int arg0, int arg1, class125 arg2) {
        if ((this.field4385[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field4383 >> this.field4381.field3361;
        class447 var5 = (class447) arg2;
        class447 var6;
        if (var5 != null && var5.method2622(var4, var4, (byte) -126)) {
            var6 = var5;
            var5.method2626(860546512);
        } else {
            var6 = new class447(this.field4381, var4, var4);
        }
        var6.method2624(-21461, 0, 0, var4, var4);
        this.method1860(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lic;IIII[[I[[II)V", line = 1022)
    public class296(class246 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field4381 = arg0;
        this.field4375 = arg5;
        this.field4387 = arg2;
        while (arg7 > 1) {
            this.field4376++;
            arg7 >>= 0x1;
        }
        this.field4383 = 0x1 << this.field4376;
        this.field4371 = new int[arg3][arg4][];
        this.field4382 = new class177[arg3][arg4][];
        this.field4370 = new int[arg3][arg4][];
        this.field4384 = new int[arg3][arg4][];
        this.field4378 = new int[arg3][arg4][];
        this.field4374 = new int[arg3][arg4][];
        this.field4369 = new short[arg3 * arg4][];
        this.field4385 = new byte[arg3][arg4];
        this.field4392 = new byte[arg3 + 1][arg4 + 1];
        this.field4390 = new float[this.field6326 + 1][this.field6324 + 1];
        this.field4397 = new float[this.field6326 + 1][this.field6324 + 1];
        this.field4394 = new float[this.field6326 + 1][this.field6324 + 1];
        for (int var9 = 1; var9 < this.field6324; var9++) {
            for (int var10 = 1; var10 < this.field6326; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field4390[var10][var9] = (float) var11 * var13;
                this.field4397[var10][var9] = var13 * -256.0F;
                this.field4394[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4396 = new class45(128);
        if ((this.field4387 & 0x10) != 0) {
            this.field4377 = new class98(this.field4381, this);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1082)
    public final void method1870(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
        for (int var28 = 0; var28 < var18; var28++) {
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
            var27++;
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
            var27++;
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
            var27++;
        }
        this.method1865(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Lph;IIIIZ)Z", line = 1171)
    public final boolean method1871(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4377 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field4381.field3473 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field4381.field3443 * arg2 >> 8) >> 3;
            return this.field4377.method480(var7, 1, var8, arg0);
        }
    }
}
