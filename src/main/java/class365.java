import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class365 extends class319 {

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lvn;")
    private class169 field5315 = new class169();

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lpo;")
    public class332 field5301;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[[I")
    private int[][] field5304;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "[[I")
    private int[][] field5336;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public int field5308;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public int field5303;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[[[I")
    private int[][][] field5316;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[[[Ldi;")
    private class65[][][] field5318;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "[[[I")
    public int[][][] field5309;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "[[[I")
    public int[][][] field5305;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[[[I")
    private int[][][] field5312;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "[[[I")
    private int[][][] field5321;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[[S")
    public short[][] field5299;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "[[B")
    private byte[][] field5317;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "[[B")
    private byte[][] field5331;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "[[F")
    private float[][] field5328;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "[[F")
    private float[][] field5334;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "[[F")
    private float[][] field5333;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "Lcs;")
    private class189 field5322;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Llo;")
    private class449 field5310;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lbk;")
    public static class211 field5300 = new class211(1);

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[I")
    private static int[] field5311 = new int[1];

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "[I")
    private static int[] field5307 = new int[1];

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "[F")
    private static float[] field5313 = new float[16];

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "[I")
    private static int[] field5319 = new int[1];

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private static int field5314;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    private int field5320;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    private int field5323;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    private int field5330;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "Lti;")
    private class254 field5329;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Lpe;")
    private class363 field5324;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Lpe;")
    public class363 field5325;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Lpe;")
    public class363 field5327;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Lpe;")
    public class363 field5332;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lpe;")
    public class363 field5335;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[Ldi;")
    private class65[] field5326;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field5330 <= 0) {
            return;
        }
        opengl var9 = this.field5301.field4752;
        this.field5301.method2132();
        this.field5301.method2099(false);
        this.field5301.method2110(false);
        this.field5301.method2056(false);
        this.field5301.method2063(false);
        this.field5301.method2131(0);
        this.field5301.method2109(-2);
        this.field5301.method2085((class439) null);
        field5313[0] = (float) arg2 / ((float) this.field5306 * 128.0F * (float) this.field5301.field4761);
        field5313[1] = 0.0F;
        field5313[2] = 0.0F;
        field5313[3] = 0.0F;
        field5313[4] = 0.0F;
        field5313[5] = (float) arg2 / ((float) this.field5306 * 128.0F * (float) this.field5301.field4764);
        field5313[6] = 0.0F;
        field5313[7] = 0.0F;
        field5313[8] = 0.0F;
        field5313[9] = 0.0F;
        field5313[10] = 0.0F;
        field5313[11] = 0.0F;
        field5313[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5301.field4761;
        field5313[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5301.field4764;
        field5313[14] = 0.0F;
        field5313[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field5313, 0);
        field5313[0] = 1.0F;
        field5313[1] = 0.0F;
        field5313[2] = 0.0F;
        field5313[3] = 0.0F;
        field5313[4] = 0.0F;
        field5313[5] = 0.0F;
        field5313[6] = 1.0F;
        field5313[7] = 0.0F;
        field5313[8] = 0.0F;
        field5313[9] = 1.0F;
        field5313[10] = 0.0F;
        field5313[11] = 0.0F;
        field5313[12] = 0.0F;
        field5313[13] = 0.0F;
        field5313[14] = 0.0F;
        field5313[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field5313, 0);
        this.field5301.method2119();
        this.field5301.method2111(this.field5324);
        this.field5301.method2077(this.field5325);
        this.field5301.method2064(0, this.field5327);
        if ((this.field5308 & 0x7) == 0) {
            this.field5301.method2110(false);
        } else {
            this.field5301.method2057(this.field5332);
            this.field5301.method2110(true);
        }
        this.field5301.method2114();
        if (field5300.field2867.length < this.field5320 * 2) {
            field5300 = new class211(this.field5320 * 2);
        } else {
            field5300.field2888 = 0;
        }
        int var10 = 0;
        if (this.field5301.field4779) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field4530 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field5299[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field5300.method1380(var14[var15], (byte) -8);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field4530 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field5299[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field5300.method1339((byte) 3, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field5301.field4855.method382(5123, field5300.field2867, field5300.field2888);
            this.field5301.method2107(this.field5301.field4855, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Llg;IIIIZ)V")
    public final void method1983(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5310 != null && arg0 != null) {
            int var7 = arg1 - (this.field5301.field4872 * arg2 >> 8) >> this.field5301.field4762;
            int var8 = arg3 - (this.field5301.field4831 * arg2 >> 8) >> this.field5301.field4762;
            this.field5310.method2784(var7, 0, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lvg;[I)V")
    public final void method1989(class33 arg0, int[] arg1) {
        this.field5315.method1125(-1, new class76(this.field5301, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public final void method1992(int arg0, int arg1, int arg2) {
        if ((this.field5331[arg0][arg1] & 0xFF) < arg2) {
            this.field5331[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lpo;IIII[[I[[II)V")
    public class365(class332 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field5301 = arg0;
        this.field5304 = arg5;
        this.field5336 = arg6;
        this.field5308 = arg2;
        while (arg7 > 1) {
            this.field5303++;
            arg7 >>= 0x1;
        }
        this.field5306 = 0x1 << this.field5303;
        this.field5316 = new int[arg3][arg4][];
        this.field5318 = new class65[arg3][arg4][];
        this.field5309 = new int[arg3][arg4][];
        this.field5305 = new int[arg3][arg4][];
        this.field5312 = new int[arg3][arg4][];
        this.field5321 = new int[arg3][arg4][];
        this.field5299 = new short[arg3 * arg4][];
        this.field5317 = new byte[arg3][arg4];
        this.field5331 = new byte[arg3 + 1][arg4 + 1];
        this.field5328 = new float[arg3 + 1][arg4 + 1];
        this.field5334 = new float[arg3 + 1][arg4 + 1];
        this.field5333 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field5304[var10 + 1][var9] - this.field5304[var10 - 1][var9];
                int var12 = this.field5304[var10][var9 + 1] - this.field5304[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field5328[var10][var9] = (float) var11 * var13;
                this.field5334[var10][var9] = var13 * -256.0F;
                this.field5333[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5322 = new class189(128);
        if ((this.field5308 & 0x10) != 0) {
            this.field5310 = new class449(this.field5301, this);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method1984(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method1993(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILlg;)Llg;")
    public final class238 method1979(int arg0, int arg1, class238 arg2) {
        if ((this.field5317[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field5306 >> this.field5301.field4762;
        class210 var5 = (class210) arg2;
        class210 var6;
        if (var5 != null && var5.method1333(var4, var4, 96)) {
            var6 = var5;
            var5.method1331((byte) -127);
        } else {
            var6 = new class210(this.field5301, var4, var4);
        }
        var6.method1330(var4, -24, 0, 0, var4);
        this.method2311(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1987(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field5326 == null) {
            return;
        }
        float var6 = this.field5301.field4780;
        float var7 = this.field5301.field4823;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field5307.length < var9) {
            field5307 = new int[var9];
        }
        if (field5300.field2867.length < this.field5320 * 2) {
            field5300 = new class211(this.field5320 * 2);
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
        if (var14 > this.field4530 - 1) {
            var14 = this.field4530 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field4531 - 1) {
            var15 = this.field4531 - 1;
        }
        field5314 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field5307[field5314++] = this.field4530 * var18 + var16;
                }
            }
        }
        this.field5301.method2074();
        for (int var19 = 0; var19 < this.field5326.length; var19++) {
            this.field5326[var19].method390(field5307, field5314, -121);
        }
        if (!this.field5315.method1122(-5874)) {
            int var20 = this.field5301.field4776;
            int var21 = this.field5301.field4817;
            this.field5301.method933(0, var21);
            this.field5301.method1017(var7, var6 - 4.0F);
            this.field5301.method2110(false);
            this.field5301.method2063(false);
            this.field5301.method2131(130);
            this.field5301.method2109(-2);
            this.field5301.method2085(this.field5301.field4878);
            this.field5301.method2100(8448, 7681);
            this.field5301.method2086(0, 34166, 770);
            this.field5301.method2087(0, 34167, 770);
            for (class359 var22 = this.field5315.method1124(-1); var22 != null; var22 = this.field5315.method1119(false)) {
                class76 var23 = (class76) var22;
                var23.method432(-127, arg3, arg0, arg2, arg1);
            }
            this.field5301.method2086(0, 5890, 768);
            this.field5301.method2087(0, 5890, 770);
            this.field5301.method2085((class439) null);
            this.field5301.method933(var20, var21);
        }
        if (this.field5310 != null) {
            this.field5301.method1017(var7, var6 - 8.0F);
            this.field5301.method2074();
            this.field5301.method2077(this.field5325);
            this.field5301.method2064(0, this.field5327);
            this.field5301.method2114();
            this.field5310.method2791(1, arg1, arg2, arg4, arg3, arg0);
        }
        this.field5301.method1017(var7, var6);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Llg;IIIIZ)V")
    public final void method1980(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5310 != null && arg0 != null) {
            int var7 = arg1 - (this.field5301.field4872 * arg2 >> 8) >> this.field5301.field4762;
            int var8 = arg3 - (this.field5301.field4831 * arg2 >> 8) >> this.field5301.field4762;
            this.field5310.method2788(arg0, var7, var8, 1);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lom;II)V")
    private final void method2311(class210 arg0, int arg1, int arg2) {
        int[] var4 = this.field5309[arg1][arg2];
        int[] var5 = this.field5305[arg1][arg2];
        int var6 = var4.length;
        if (field5319.length < var6) {
            field5319 = new int[var6];
            field5311 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field5319[var7] = (var4[var7] & 0xFF) >> this.field5301.field4762;
            field5311[var7] = (var5[var7] & 0xFF) >> this.field5301.field4762;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field5319[var8];
            int var10 = field5311[var8++];
            int var11 = field5319[var8];
            int var12 = field5311[var8++];
            int var13 = field5319[var8];
            int var14 = field5311[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1334(var11, true, var13, var14, var12, var10, var9);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Llg;IIIIZ)Z")
    public final boolean method1978(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5310 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field5301.field4872 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field5301.field4831 * arg2 >> 8) >> 3;
            return this.field5310.method2790(arg0, var7, var8, -23);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)I")
    public final int method1990(int arg0, int arg1) {
        return this.field5304[arg0][arg1];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public final void method1981() {
        if (this.field5330 > 0) {
            byte[][] var1 = new byte[this.field4530 + 1][this.field4531 + 1];
            for (int var2 = 1; var2 < this.field4530; var2++) {
                for (int var3 = 1; var3 < this.field4531; var3++) {
                    var1[var2][var3] = (byte) ((this.field5331[var2][var3] >> 1) + (this.field5331[var2][var3 + 1] >> 3) + (this.field5331[var2][var3 - 1] >> 2) + (this.field5331[var2 - 1][var3] >> 2) + (this.field5331[var2 + 1][var3] >> 3));
                }
            }
            this.field5326 = new class65[this.field5322.method1208(-118)];
            this.field5322.method1201(this.field5326, (byte) 32);
            for (int var4 = 0; var4 < this.field5326.length; var4++) {
                this.field5326[var4].method386(this.field5330, false);
            }
            int var5 = 24;
            if (this.field5336 != null) {
                var5 += 4;
            }
            if ((this.field5308 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field5330 * var5).order(ByteOrder.nativeOrder());
            class65[] var7 = new class65[this.field5330];
            class189 var8 = new class189(class406.method2564(116, this.field5330));
            class65[] var9 = new class65[this.field5323];
            for (int var10 = 0; var10 < this.field4530; var10++) {
                for (int var11 = 0; var11 < this.field4531; var11++) {
                    if (this.field5312[var10][var11] != null) {
                        class65[] var12 = this.field5318[var10][var11];
                        int[] var13 = this.field5316[var10][var11];
                        int[] var14 = this.field5309[var10][var11];
                        int[] var15 = this.field5305[var10][var11];
                        int[] var16 = this.field5321[var10][var11];
                        int[] var17 = this.field5312[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field5328[var10][var11];
                        float var19 = this.field5334[var10][var11];
                        float var20 = this.field5333[var10][var11];
                        float var21 = this.field5328[var10][var11 + 1];
                        float var22 = this.field5334[var10][var11 + 1];
                        float var23 = this.field5333[var10][var11 + 1];
                        float var24 = this.field5328[var10 + 1][var11 + 1];
                        float var25 = this.field5334[var10 + 1][var11 + 1];
                        float var26 = this.field5333[var10 + 1][var11 + 1];
                        float var27 = this.field5328[var10 + 1][var11];
                        float var28 = this.field5334[var10 + 1][var11];
                        float var29 = this.field5333[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field5336 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field5336[var10][var11];
                            var35 = (float) this.field5336[var10][var11 + 1];
                            var36 = (float) this.field5336[var10 + 1][var11 + 1];
                            var37 = (float) this.field5336[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label303: for (int var39 = 0; var39 < var17.length; var39++) {
                            class65 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label303;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field5299[this.field4530 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field5303) + var14[var43];
                            int var45 = (var11 << this.field5303) + var15[var43];
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
                            } else if (var51 == 0 && this.field5306 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field5306 == var51 && this.field5306 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field5306 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field5306;
                                float var62 = (float) var52 / (float) this.field5306;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field5303) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field5303) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field5303) + var69);
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
                                var54 = class262.field3658[var46 & 0xFF80 | var73];
                                if ((this.field5308 & 0x7) == 0) {
                                    float var74 = this.field5301.field4825[2] * var58 + this.field5301.field4825[0] * var56 + this.field5301.field4825[1] * var57;
                                    var55 = this.field5301.field4826 + var74 * (var74 > 0.0F ? this.field5301.field4790 : this.field5301.field4860);
                                }
                            }
                            class359 var75 = var8.method1204((byte) -96, var49);
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
                                    var77 = class262.field3658[var47 & 0xFF80 | var76];
                                    if ((this.field5308 & 0x7) == 0) {
                                        float var78 = this.field5301.field4825[2] * var58 + this.field5301.field4825[0] * var56 + this.field5301.field4825[1] * var57;
                                        float var79 = this.field5301.field4826 + var55 * (var55 > 0.0F ? this.field5301.field4790 : this.field5301.field4860);
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
                                var6.putFloat((float) (this.method1991(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                if ((this.field5308 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                if (this.field5336 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                var86 = this.field5302++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method1202(-1, var49, new class341(var42[var43]));
                            } else {
                                var42[var43] = ((class341) var75).field5024;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field5248 < var7[var86].field5248) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method389(var60, var86, (byte) -59, var54, var55);
                            }
                            this.field5320++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field5302; var88++) {
                class65 var89 = var7[var88];
                if (var89 != null) {
                    var89.method388(var88, (byte) 73);
                }
            }
            for (int var90 = 0; var90 < this.field4530; var90++) {
                for (int var91 = 0; var91 < this.field4531; var91++) {
                    short[] var92 = this.field5299[this.field4530 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class65 var98 = var7[var95];
                            class65 var99 = var7[var96];
                            class65 var100 = var7[var97];
                            class65 var101 = null;
                            if (var98 != null) {
                                var98.method387((byte) -63, var93, var91, var90);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method387((byte) -68, var93, var91, var90);
                                if (var101 == null || var99.field5248 < var101.field5248) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method387((byte) -126, var93, var91, var90);
                                if (var101 == null || var100.field5248 < var101.field5248) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method388(var95, (byte) -126);
                                }
                                if (var99 != null) {
                                    var101.method388(var96, (byte) 91);
                                }
                                if (var100 != null) {
                                    var101.method388(var97, (byte) 102);
                                }
                                var101.method387((byte) -24, var93, var91, var90);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field5329 = this.field5301.method2089(var5, var6, false);
            int var102 = 24;
            this.field5325 = new class363(this.field5301, this.field5329, 5126, 3, 0);
            this.field5327 = new class363(this.field5301, this.field5329, 5126, 2, 12);
            this.field5324 = new class363(this.field5301, this.field5329, 5121, 4, 20);
            if ((this.field5308 & 0x7) != 0) {
                this.field5332 = new class363(this.field5301, this.field5329, 5126, 3, var102);
                var102 += 12;
            }
            if (this.field5336 != null) {
                this.field5335 = new class363(this.field5301, this.field5329, 5126, 1, var102);
                var102 += 4;
            }
            long[] var103 = new long[this.field5326.length];
            for (int var104 = 0; var104 < this.field5326.length; var104++) {
                class65 var105 = this.field5326[var104];
                var103[var104] = var105.field5248;
                var105.method391(this.field5302, 4);
            }
            class397.method2525(var103, -108, this.field5326);
            if (this.field5310 != null) {
                this.field5310.method2785(true);
            }
        } else {
            this.field5310 = null;
        }
        this.field5309 = this.field5305 = (int[][][]) null;
        this.field5321 = (int[][][]) null;
        this.field5316 = (int[][][]) null;
        this.field5318 = (class65[][][]) null;
        this.field5312 = (int[][][]) null;
        this.field5331 = (byte[][]) null;
        this.field5322 = null;
        this.field5336 = (int[][]) null;
        this.field5328 = this.field5334 = this.field5333 = (float[][]) null;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)I")
    public final int method1991(int arg0, int arg1) {
        int var3 = arg0 >> this.field5303;
        int var4 = arg1 >> this.field5303;
        if (var3 < 0 || var4 < 0 || var3 > this.field4530 - 1 || var4 > this.field4531 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field5306 - 1;
        int var6 = arg1 & this.field5306 - 1;
        int var7 = (this.field5306 - var5) * this.field5304[var3][var4] + this.field5304[var3 + 1][var4] * var5 >> this.field5303;
        int var8 = (this.field5306 - var5) * this.field5304[var3][var4 + 1] + this.field5304[var3 + 1][var4 + 1] * var5 >> this.field5303;
        return (this.field5306 - var6) * var7 + var6 * var8 >> this.field5303;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method1993(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field5316[arg0][arg1] = arg3;
        this.field5309[arg0][arg1] = arg2;
        this.field5305[arg0][arg1] = arg4;
        this.field5312[arg0][arg1] = arg5;
        this.field5321[arg0][arg1] = arg6;
        class65[] var13 = this.field5318[arg0][arg1] = new class65[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class359 var17 = this.field5322.method1204((byte) -66, var15);
            if (var17 == null) {
                var13[var14] = new class65(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field5322.method1202(-1, var15, var13[var14]);
            } else {
                var13[var14] = (class65) var17;
            }
        }
        if (arg11) {
            this.field5317[arg0][arg1] = (byte) (this.field5317[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field5323) {
            this.field5323 = arg5.length;
        }
        this.field5330 += arg5.length;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
    public final void method1982(int arg0, int arg1) {
    }
}
