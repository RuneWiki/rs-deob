import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class39 extends class156 {

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Ltc;")
    private class196 field579 = new class196();

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Lhj;")
    public class338 field575;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "[[I")
    private int[][] field578;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "[[I")
    private int[][] field599;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "[[[I")
    private int[][][] field592;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "[[[Lhs;")
    private class178[][][] field581;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[[[I")
    public int[][][] field572;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "[[[I")
    public int[][][] field586;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[[[I")
    private int[][][] field573;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "[[[I")
    private int[][][] field576;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "[[S")
    public short[][] field589;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[[B")
    private byte[][] field571;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "[[B")
    private byte[][] field604;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "[[F")
    private float[][] field594;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "[[F")
    private float[][] field603;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "[[F")
    private float[][] field602;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "Lbr;")
    private class223 field600;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "Lsc;")
    private class193 field590;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Leb;")
    public static class371 field577 = new class371(1);

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "[I")
    private static int[] field580 = new int[1];

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[I")
    private static int[] field583 = new int[1];

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "[I")
    private static int[] field587 = new int[1];

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "[F")
    private static float[] field591 = new float[16];

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    private static int field588;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "Lln;")
    public class212 field596;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "Lln;")
    public class212 field597;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "Lln;")
    private class212 field598;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "Lln;")
    public class212 field605;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "Lsg;")
    private class226 field601;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "[Lhs;")
    private class178[] field606;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Llc;II)V")
    private final void method266(class385 arg0, int arg1, int arg2) {
        int[] var4 = this.field572[arg1][arg2];
        int[] var5 = this.field586[arg1][arg2];
        int var6 = var4.length;
        if (field587.length < var6) {
            field587 = new int[var6];
            field583 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field587[var7] = (var4[var7] & 0xFF) >> this.field575.field4625;
            field583[var7] = (var5[var7] & 0xFF) >> this.field575.field4625;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field587[var8];
            int var10 = field583[var8++];
            int var11 = field587[var8];
            int var12 = field583[var8++];
            int var13 = field587[var8];
            int var14 = field583[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method2518(-96, var9, var11, var13, var12, var14, var10);
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public final void method267(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lhj;IIII[[I[[II)V")
    public class39(class338 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field575 = arg0;
        this.field578 = arg5;
        this.field599 = arg6;
        this.field584 = arg2;
        while (arg7 > 1) {
            this.field574++;
            arg7 >>= 0x1;
        }
        this.field570 = 0x1 << this.field574;
        this.field592 = new int[arg3][arg4][];
        this.field581 = new class178[arg3][arg4][];
        this.field572 = new int[arg3][arg4][];
        this.field586 = new int[arg3][arg4][];
        this.field573 = new int[arg3][arg4][];
        this.field576 = new int[arg3][arg4][];
        this.field589 = new short[arg3 * arg4][];
        this.field571 = new byte[arg3][arg4];
        this.field604 = new byte[arg3 + 1][arg4 + 1];
        this.field594 = new float[arg3 + 1][arg4 + 1];
        this.field603 = new float[arg3 + 1][arg4 + 1];
        this.field602 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field578[var10 + 1][var9] - this.field578[var10 - 1][var9];
                int var12 = this.field578[var10][var9 + 1] - this.field578[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field594[var10][var9] = (float) var11 * var13;
                this.field603[var10][var9] = var13 * -256.0F;
                this.field602[var10][var9] = (float) var12 * var13;
            }
        }
        this.field600 = new class223(128);
        if ((this.field584 & 0x10) != 0) {
            this.field590 = new class193(this.field575, this);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
    public final void method268(int arg0, int arg1, int arg2) {
        if ((this.field604[arg0][arg1] & 0xFF) < arg2) {
            this.field604[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(Lek;IIIIZ)V")
    public final void method269(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field590 != null && arg0 != null) {
            int var7 = arg1 - (this.field575.field4641 * arg2 >> 8) >> this.field575.field4625;
            int var8 = arg3 - (this.field575.field4703 * arg2 >> 8) >> this.field575.field4625;
            this.field590.method1277(arg0, (byte) 85, var8, var7);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method270(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field592[arg0][arg1] = arg3;
        this.field572[arg0][arg1] = arg2;
        this.field586[arg0][arg1] = arg4;
        this.field573[arg0][arg1] = arg5;
        this.field576[arg0][arg1] = arg6;
        class178[] var13 = this.field581[arg0][arg1] = new class178[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class376 var17 = this.field600.method1412((byte) -54, var15);
            if (var17 == null) {
                var13[var14] = new class178(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field600.method1419(var15, 89, var13[var14]);
            } else {
                var13[var14] = (class178) var17;
            }
        }
        if (arg11) {
            this.field571[arg0][arg1] = (byte) (this.field571[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field593) {
            this.field593 = arg5.length;
        }
        this.field595 += arg5.length;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field595 <= 0) {
            return;
        }
        opengl var9 = this.field575.field4607;
        this.field575.method2141();
        this.field575.method2122(false);
        this.field575.method2147(false);
        this.field575.method2159(false);
        this.field575.method2133(false);
        this.field575.method2125(0);
        this.field575.method2146(-2);
        this.field575.method2165((class133) null);
        field591[0] = (float) arg2 / ((float) this.field570 * 128.0F * (float) this.field575.field4620);
        field591[1] = 0.0F;
        field591[2] = 0.0F;
        field591[3] = 0.0F;
        field591[4] = 0.0F;
        field591[5] = (float) arg2 / ((float) this.field570 * 128.0F * (float) this.field575.field4616);
        field591[6] = 0.0F;
        field591[7] = 0.0F;
        field591[8] = 0.0F;
        field591[9] = 0.0F;
        field591[10] = 0.0F;
        field591[11] = 0.0F;
        field591[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field575.field4620;
        field591[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field575.field4616;
        field591[14] = 0.0F;
        field591[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field591, 0);
        field591[0] = 1.0F;
        field591[1] = 0.0F;
        field591[2] = 0.0F;
        field591[3] = 0.0F;
        field591[4] = 0.0F;
        field591[5] = 0.0F;
        field591[6] = 1.0F;
        field591[7] = 0.0F;
        field591[8] = 0.0F;
        field591[9] = 1.0F;
        field591[10] = 0.0F;
        field591[11] = 0.0F;
        field591[12] = 0.0F;
        field591[13] = 0.0F;
        field591[14] = 0.0F;
        field591[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field591, 0);
        if ((this.field584 & 0x7) == 0) {
            this.field575.method2147(false);
        } else {
            this.field575.method2147(true);
            this.field575.method2103();
        }
        this.field575.method2158(this.field605, this.field596, this.field598, this.field597);
        if (field577.field5258.length < this.field582 * 2) {
            field577 = new class371(this.field582 * 2);
        } else {
            field577.field5273 = 0;
        }
        int var10 = 0;
        if (this.field575.field4640) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field2207 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field589[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field577.method2416(22064, var14[var15] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field2207 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field589[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field577.method2426(-1882601528, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class251 var21 = new class251(this.field575, 5123, field577.field5258, field577.field5273);
            this.field575.method2160(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lvb;[I)V")
    public final void method272(class107 arg0, int[] arg1) {
        this.field579.method1301(50, new class102(this.field575, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lek;IIIIZ)V")
    public final void method273(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field590 != null && arg0 != null) {
            int var7 = arg1 - (this.field575.field4641 * arg2 >> 8) >> this.field575.field4625;
            int var8 = arg3 - (this.field575.field4703 * arg2 >> 8) >> this.field575.field4625;
            this.field590.method1279(var8, arg0, var7, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[[ZZ)V")
    public final void method274(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field606 == null) {
            return;
        }
        float var6 = this.field575.field4702;
        float var7 = this.field575.field4648;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field580.length < var9) {
            field580 = new int[var9];
        }
        if (field577.field5258.length < this.field582 * 2) {
            field577 = new class371(this.field582 * 2);
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
        if (var14 > this.field2207 - 1) {
            var14 = this.field2207 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field2215 - 1) {
            var15 = this.field2215 - 1;
        }
        field588 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field580[field588++] = this.field2207 * var18 + var16;
                }
            }
        }
        this.field575.method2156();
        this.field575.method2147((this.field584 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field606.length; var19++) {
            this.field606[var19].method1183(field588, field580, 95);
        }
        if (!this.field579.method1300((byte) 115)) {
            int var20 = this.field575.field4686;
            int var21 = this.field575.field4726;
            this.field575.method1787(0, var21);
            this.field575.method1805(var7, var6 - 4.0F);
            this.field575.method2147(false);
            this.field575.method2133(false);
            this.field575.method2125(130);
            this.field575.method2146(-2);
            this.field575.method2165(this.field575.field4734);
            this.field575.method2140(8448, 7681);
            this.field575.method2161(0, 34166, 770);
            this.field575.method2135(0, 34167, 770);
            for (class376 var22 = this.field579.method1312((byte) 25); var22 != null; var22 = this.field579.method1304(-116)) {
                class102 var23 = (class102) var22;
                var23.method709(arg2, arg1, arg0, 4, arg3);
            }
            this.field575.method2161(0, 5890, 768);
            this.field575.method2135(0, 5890, 770);
            this.field575.method2165((class133) null);
            this.field575.method1787(var20, var21);
        }
        if (this.field590 != null) {
            this.field575.method1805(var7, var6 - 8.0F);
            this.field575.method2156();
            this.field575.method2158(this.field605, (class212) null, (class212) null, this.field597);
            this.field590.method1283(arg2, arg1, arg3, arg0, arg4, 56);
        }
        this.field575.method1805(var7, var6);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)I")
    public final int method275(int arg0, int arg1) {
        return this.field578[arg0][arg1];
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Lek;IIIIZ)Z")
    public final boolean method276(class294 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field590 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field575.field4641 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field575.field4703 * arg2 >> 8) >> 3;
            return this.field590.method1285(var8, arg0, var7, -6480);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILek;)Lek;")
    public final class294 method277(int arg0, int arg1, class294 arg2) {
        if ((this.field571[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field570 >> this.field575.field4625;
        class385 var5 = (class385) arg2;
        class385 var6;
        if (var5 != null && var5.method2519(var4, -121, var4)) {
            var6 = var5;
            var5.method2520(-27335);
        } else {
            var6 = new class385(this.field575, var4, var4);
        }
        var6.method2516(0, var4, var4, 0, 115);
        this.method266(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)I")
    public final int method278(int arg0, int arg1) {
        int var3 = arg0 >> this.field574;
        int var4 = arg1 >> this.field574;
        if (var3 < 0 || var4 < 0 || var3 > this.field2207 - 1 || var4 > this.field2215 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field570 - 1;
        int var6 = arg1 & this.field570 - 1;
        int var7 = (this.field570 - var5) * this.field578[var3][var4] + this.field578[var3 + 1][var4] * var5 >> this.field574;
        int var8 = (this.field570 - var5) * this.field578[var3][var4 + 1] + this.field578[var3 + 1][var4 + 1] * var5 >> this.field574;
        return (this.field570 - var6) * var7 + var6 * var8 >> this.field574;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method279(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        int var16 = arg8.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int var24 = 0;
        for (int var25 = 0; var25 < var16; var25++) {
            int var26 = arg5[var25];
            int var27 = arg6[var25];
            int var28 = arg7[var25];
            var17[var24] = arg2[var26];
            var18[var24] = arg4[var26];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var26];
            }
            var24++;
            var17[var24] = arg2[var27];
            var18[var24] = arg4[var27];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var27];
            }
            var24++;
            var17[var24] = arg2[var28];
            var18[var24] = arg4[var28];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var28];
            }
            var24++;
        }
        this.method270(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
    public final void method280() {
        if (this.field595 > 0) {
            byte[][] var1 = new byte[this.field2207 + 1][this.field2215 + 1];
            for (int var2 = 1; var2 < this.field2207; var2++) {
                for (int var3 = 1; var3 < this.field2215; var3++) {
                    var1[var2][var3] = (byte) ((this.field604[var2][var3] >> 1) + (this.field604[var2][var3 + 1] >> 3) + (this.field604[var2][var3 - 1] >> 2) + (this.field604[var2 - 1][var3] >> 2) + (this.field604[var2 + 1][var3] >> 3));
                }
            }
            this.field606 = new class178[this.field600.method1417(117)];
            this.field600.method1416(this.field606, (byte) -22);
            for (int var4 = 0; var4 < this.field606.length; var4++) {
                this.field606[var4].method1184(-729, this.field595);
            }
            int var5 = 24;
            if (this.field599 != null) {
                var5 += 4;
            }
            if ((this.field584 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field595 * var5).order(ByteOrder.nativeOrder());
            class178[] var7 = new class178[this.field595];
            class223 var8 = new class223(class105.method718(256, this.field595));
            class178[] var9 = new class178[this.field593];
            for (int var10 = 0; var10 < this.field2207; var10++) {
                for (int var11 = 0; var11 < this.field2215; var11++) {
                    if (this.field573[var10][var11] != null) {
                        class178[] var12 = this.field581[var10][var11];
                        int[] var13 = this.field592[var10][var11];
                        int[] var14 = this.field572[var10][var11];
                        int[] var15 = this.field586[var10][var11];
                        int[] var16 = this.field576[var10][var11];
                        int[] var17 = this.field573[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field594[var10][var11];
                        float var19 = this.field603[var10][var11];
                        float var20 = this.field602[var10][var11];
                        float var21 = this.field594[var10][var11 + 1];
                        float var22 = this.field603[var10][var11 + 1];
                        float var23 = this.field602[var10][var11 + 1];
                        float var24 = this.field594[var10 + 1][var11 + 1];
                        float var25 = this.field603[var10 + 1][var11 + 1];
                        float var26 = this.field602[var10 + 1][var11 + 1];
                        float var27 = this.field594[var10 + 1][var11];
                        float var28 = this.field603[var10 + 1][var11];
                        float var29 = this.field602[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field599 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field599[var10][var11];
                            var35 = (float) this.field599[var10][var11 + 1];
                            var36 = (float) this.field599[var10 + 1][var11 + 1];
                            var37 = (float) this.field599[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class178 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field589[this.field2207 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field574) + var14[var43];
                            int var45 = (var11 << this.field574) + var15[var43];
                            int var46 = var17[var43];
                            int var47 = var16[var43];
                            int var48 = var13 == null ? 0 : var13[var43];
                            long var49 = (long) var47 << 48 | (long) var46 << 32 | (long) (var44 << 16) | (long) var45;
                            int var51 = var14[var43];
                            int var52 = var15[var43];
                            byte var53 = 74;
                            int var54 = 0;
                            float var55 = 1.0F;
                            float var56;
                            float var57;
                            float var58;
                            float var59;
                            int var60;
                            if (var51 == 0 && var52 == 0) {
                                var56 = var18;
                                var57 = var19;
                                var58 = var20;
                                var59 = var34;
                                var60 = var53 - var30;
                            } else if (var51 == 0 && this.field570 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field570 == var51 && this.field570 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field570 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field570;
                                float var62 = (float) var52 / (float) this.field570;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field574) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field574) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field574) + var69);
                                float var71 = (var37 - var34) * var61 + var34;
                                float var72 = (var36 - var35) * var61 + var35;
                                var59 = (var72 - var71) * var62 + var71;
                            }
                            if (var46 != -1) {
                                int var73 = (var46 & 0x7F) * var60 >> 7;
                                if (var73 < 2) {
                                    var73 = 2;
                                } else if (var73 > 126) {
                                    var73 = 126;
                                }
                                var54 = class176.field2483[var46 & 0xFF80 | var73];
                                if ((this.field584 & 0x7) == 0) {
                                    float var74 = this.field575.field4714[2] * var58 + this.field575.field4714[0] * var56 + this.field575.field4714[1] * var57;
                                    var55 = this.field575.field4721 + var74 * (var74 > 0.0F ? this.field575.field4679 : this.field575.field4669);
                                }
                            }
                            class376 var75 = var8.method1412((byte) -54, var49);
                            int var86;
                            if (var75 == null) {
                                int var77;
                                if (var46 == var47) {
                                    var77 = var54;
                                } else {
                                    int var76 = (var47 & 0x7F) * var60 >> 7;
                                    if (var76 < 2) {
                                        var76 = 2;
                                    } else if (var76 > 126) {
                                        var76 = 126;
                                    }
                                    var77 = class176.field2483[var47 & 0xFF80 | var76];
                                    if ((this.field584 & 0x7) == 0) {
                                        float var78 = this.field575.field4714[2] * var58 + this.field575.field4714[0] * var56 + this.field575.field4714[1] * var57;
                                        float var79 = this.field575.field4721 + var55 * (var55 > 0.0F ? this.field575.field4679 : this.field575.field4669);
                                        int var80 = var77 >> 16 & 0xFF;
                                        int var81 = var77 >> 8 & 0xFF;
                                        int var82 = var77 & 0xFF;
                                        int var83 = (int) ((float) var80 * var79);
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        int var84 = (int) ((float) var81 * var79);
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = (int) ((float) var82 * var79);
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var77 = var83 << 16 | var84 << 8 | var85;
                                    }
                                }
                                var6.putFloat((float) var44);
                                var6.putFloat((float) (this.method278(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field599 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field584 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field585++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method1419(var49, 62, new class358(var42[var43]));
                            } else {
                                var42[var43] = ((class358) var75).field5039;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field5363 < var7[var86].field5363) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method1188(var86, true, var54, var55, var60);
                            }
                            this.field582++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field585; var88++) {
                class178 var89 = var7[var88];
                if (var89 != null) {
                    var89.method1186(var88, -85);
                }
            }
            for (int var90 = 0; var90 < this.field2207; var90++) {
                for (int var91 = 0; var91 < this.field2215; var91++) {
                    short[] var92 = this.field589[this.field2207 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class178 var98 = var7[var95];
                            class178 var99 = var7[var96];
                            class178 var100 = var7[var97];
                            class178 var101 = null;
                            if (var98 != null) {
                                var98.method1187(var91, 1, var90, var93);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method1187(var91, 1, var90, var93);
                                if (var101 == null || var99.field5363 < var101.field5363) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method1187(var91, 1, var90, var93);
                                if (var101 == null || var100.field5363 < var101.field5363) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method1186(var95, -73);
                                }
                                if (var99 != null) {
                                    var101.method1186(var96, -103);
                                }
                                if (var100 != null) {
                                    var101.method1186(var97, -115);
                                }
                                var101.method1187(var91, 1, var90, var93);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field601 = this.field575.method2114(var5, var6, false);
            this.field605 = new class212(this.field575, this.field601, 5126, 3, 0);
            this.field598 = new class212(this.field575, this.field601, 5121, 4, 12);
            byte var102;
            if (this.field599 == null) {
                this.field597 = new class212(this.field575, this.field601, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field597 = new class212(this.field575, this.field601, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field584 & 0x7) != 0) {
                this.field596 = new class212(this.field575, this.field601, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field606.length];
            for (int var104 = 0; var104 < this.field606.length; var104++) {
                class178 var105 = this.field606[var104];
                var103[var104] = var105.field5363;
                var105.method1185(this.field585, (byte) -66);
            }
            class94.method639(this.field606, var103, 0);
            if (this.field590 != null) {
                this.field590.method1282(124);
            }
        } else {
            this.field590 = null;
        }
        this.field572 = this.field586 = (int[][][]) null;
        this.field576 = (int[][][]) null;
        this.field592 = (int[][][]) null;
        this.field581 = (class178[][][]) null;
        this.field573 = (int[][][]) null;
        this.field604 = (byte[][]) null;
        this.field600 = null;
        this.field599 = (int[][]) null;
        this.field594 = this.field603 = this.field602 = (float[][]) null;
    }
}
