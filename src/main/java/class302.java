import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class302 extends class411 {

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lfi;")
    private class166 field4050 = new class166();

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "Lhd;")
    public class17 field4061;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "[[I")
    private int[][] field4058;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "[[I")
    private int[][] field4077;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public int field4057;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public int field4054;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[[[I")
    private int[][][] field4052;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[[[Ljj;")
    private class158[][][] field4064;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[[[I")
    public int[][][] field4053;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[[[I")
    public int[][][] field4065;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[[[I")
    private int[][][] field4051;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[[[I")
    private int[][][] field4055;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "[[S")
    public short[][] field4067;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[[B")
    private byte[][] field4056;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "[[B")
    private byte[][] field4080;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[[F")
    private float[][] field4083;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "[[F")
    private float[][] field4078;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "[[F")
    private float[][] field4075;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Laj;")
    private class71 field4073;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "Ldm;")
    private class110 field4063;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "Lap;")
    public static class289 field4066 = new class289(1);

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "[I")
    private static int[] field4071 = new int[1];

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
    private static int[] field4081 = new int[1];

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "[F")
    private static float[] field4069 = new float[16];

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "[I")
    private static int[] field4068 = new int[1];

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    private static int field4070;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field4085;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Lhk;")
    private class203 field4084;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "Lrs;")
    private class240 field4076;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Lrs;")
    public class240 field4079;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "Lrs;")
    public class240 field4082;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "Lrs;")
    public class240 field4086;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "Lrs;")
    public class240 field4087;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "[Ljj;")
    private class158[] field4072;

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lhd;IIII[[I[[II)V")
    public class302(class17 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field4061 = arg0;
        this.field4058 = arg5;
        this.field4077 = arg6;
        this.field4057 = arg2;
        while (arg7 > 1) {
            this.field4054++;
            arg7 >>= 0x1;
        }
        this.field4062 = 0x1 << this.field4054;
        this.field4052 = new int[arg3][arg4][];
        this.field4064 = new class158[arg3][arg4][];
        this.field4053 = new int[arg3][arg4][];
        this.field4065 = new int[arg3][arg4][];
        this.field4051 = new int[arg3][arg4][];
        this.field4055 = new int[arg3][arg4][];
        this.field4067 = new short[arg3 * arg4][];
        this.field4056 = new byte[arg3][arg4];
        this.field4080 = new byte[arg3 + 1][arg4 + 1];
        this.field4083 = new float[arg3 + 1][arg4 + 1];
        this.field4078 = new float[arg3 + 1][arg4 + 1];
        this.field4075 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field4058[var10 + 1][var9] - this.field4058[var10 - 1][var9];
                int var12 = this.field4058[var10][var9 + 1] - this.field4058[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field4083[var10][var9] = (float) var11 * var13;
                this.field4078[var10][var9] = var13 * -256.0F;
                this.field4075[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4073 = new class71(128);
        if ((this.field4057 & 0x10) != 0) {
            this.field4063 = new class110(this.field4061, this);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lbj;II)V")
    private final void method1934(class253 arg0, int arg1, int arg2) {
        int[] var4 = this.field4053[arg1][arg2];
        int[] var5 = this.field4065[arg1][arg2];
        int var6 = var4.length;
        if (field4071.length < var6) {
            field4071 = new int[var6];
            field4081 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field4071[var7] = (var4[var7] & 0xFF) >> this.field4061.field223;
            field4081[var7] = (var5[var7] & 0xFF) >> this.field4061.field223;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field4071[var8];
            int var10 = field4081[var8++];
            int var11 = field4071[var8];
            int var12 = field4081[var8++];
            int var13 = field4071[var8];
            int var14 = field4081[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1633(var13, var9, var11, var10, var14, true, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1510(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field4072 == null) {
            return;
        }
        float var6 = this.field4061.field299;
        float var7 = this.field4061.field273;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field4068.length < var9) {
            field4068 = new int[var9];
        }
        if (field4066.field3882.length < this.field4060 * 2) {
            field4066 = new class289(this.field4060 * 2);
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
        if (var14 > this.field5745 - 1) {
            var14 = this.field5745 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field5751 - 1) {
            var15 = this.field5751 - 1;
        }
        field4070 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field4068[field4070++] = this.field5745 * var18 + var16;
                }
            }
        }
        this.field4061.method149();
        for (int var19 = 0; var19 < this.field4072.length; var19++) {
            this.field4072[var19].method1201(field4070, field4068, -106);
        }
        if (!this.field4050.method1247((byte) 120)) {
            int var20 = this.field4061.field264;
            int var21 = this.field4061.field291;
            this.field4061.method100(0, var21);
            this.field4061.method108(var7, var6 - 4.0F);
            this.field4061.method127(false);
            this.field4061.method158(false);
            this.field4061.method121(130);
            this.field4061.method190(-2);
            this.field4061.method207(this.field4061.field333);
            this.field4061.method145(8448, 7681);
            this.field4061.method93(0, 34166, 770);
            this.field4061.method223(0, 34167, 770);
            for (class381 var22 = this.field4050.method1240((byte) -79); var22 != null; var22 = this.field4050.method1245(1)) {
                class119 var23 = (class119) var22;
                var23.method949(arg0, true, arg2, arg1, arg3);
            }
            this.field4061.method93(0, 5890, 768);
            this.field4061.method223(0, 5890, 770);
            this.field4061.method207((class4) null);
            this.field4061.method100(var20, var21);
        }
        if (this.field4063 != null) {
            this.field4061.method108(var7, var6 - 8.0F);
            this.field4061.method149();
            this.field4061.method161(this.field4086);
            this.field4061.method160(0, this.field4087);
            this.field4061.method180();
            this.field4063.method909(arg1, -11, arg4, arg2, arg3, arg0);
        }
        this.field4061.method108(var7, var6);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lug;IIIIZ)V")
    public final void method1516(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4063 != null && arg0 != null) {
            int var7 = arg1 - (this.field4061.field276 * arg2 >> 8) >> this.field4061.field223;
            int var8 = arg3 - (this.field4061.field322 * arg2 >> 8) >> this.field4061.field223;
            this.field4063.method910(var8, arg0, var7, 0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method1505(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field4052[arg0][arg1] = arg3;
        this.field4053[arg0][arg1] = arg2;
        this.field4065[arg0][arg1] = arg4;
        this.field4051[arg0][arg1] = arg5;
        this.field4055[arg0][arg1] = arg6;
        class158[] var13 = this.field4064[arg0][arg1] = new class158[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class381 var17 = this.field4073.method614(-78, var15);
            if (var17 == null) {
                var13[var14] = new class158(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field4073.method612(var15, -1, var13[var14]);
            } else {
                var13[var14] = (class158) var17;
            }
        }
        if (arg11) {
            this.field4056[arg0][arg1] = (byte) (this.field4056[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field4074) {
            this.field4074 = arg5.length;
        }
        this.field4085 += arg5.length;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public final void method1519(int arg0, int arg1, int arg2) {
        if ((this.field4080[arg0][arg1] & 0xFF) < arg2) {
            this.field4080[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public final void method1513() {
        if (this.field4085 > 0) {
            byte[][] var1 = new byte[this.field5745 + 1][this.field5751 + 1];
            for (int var2 = 1; var2 < this.field5745; var2++) {
                for (int var3 = 1; var3 < this.field5751; var3++) {
                    var1[var2][var3] = (byte) ((this.field4080[var2][var3] >> 1) + (this.field4080[var2][var3 + 1] >> 3) + (this.field4080[var2][var3 - 1] >> 2) + (this.field4080[var2 - 1][var3] >> 2) + (this.field4080[var2 + 1][var3] >> 3));
                }
            }
            this.field4072 = new class158[this.field4073.method610(-2036)];
            this.field4073.method611((byte) 32, this.field4072);
            for (int var4 = 0; var4 < this.field4072.length; var4++) {
                this.field4072[var4].method1198(this.field4085, (byte) 110);
            }
            int var5 = 24;
            if (this.field4077 != null) {
                var5 += 4;
            }
            if ((this.field4057 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field4085 * var5).order(ByteOrder.nativeOrder());
            class158[] var7 = new class158[this.field4085];
            class71 var8 = new class71(class177.method1321(this.field4085, 0));
            class158[] var9 = new class158[this.field4074];
            for (int var10 = 0; var10 < this.field5745; var10++) {
                for (int var11 = 0; var11 < this.field5751; var11++) {
                    if (this.field4051[var10][var11] != null) {
                        class158[] var12 = this.field4064[var10][var11];
                        int[] var13 = this.field4052[var10][var11];
                        int[] var14 = this.field4053[var10][var11];
                        int[] var15 = this.field4065[var10][var11];
                        int[] var16 = this.field4055[var10][var11];
                        int[] var17 = this.field4051[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field4083[var10][var11];
                        float var19 = this.field4078[var10][var11];
                        float var20 = this.field4075[var10][var11];
                        float var21 = this.field4083[var10][var11 + 1];
                        float var22 = this.field4078[var10][var11 + 1];
                        float var23 = this.field4075[var10][var11 + 1];
                        float var24 = this.field4083[var10 + 1][var11 + 1];
                        float var25 = this.field4078[var10 + 1][var11 + 1];
                        float var26 = this.field4075[var10 + 1][var11 + 1];
                        float var27 = this.field4083[var10 + 1][var11];
                        float var28 = this.field4078[var10 + 1][var11];
                        float var29 = this.field4075[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field4077 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field4077[var10][var11];
                            var35 = (float) this.field4077[var10][var11 + 1];
                            var36 = (float) this.field4077[var10 + 1][var11 + 1];
                            var37 = (float) this.field4077[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label303: for (int var39 = 0; var39 < var17.length; var39++) {
                            class158 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label303;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field4067[this.field5745 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field4054) + var14[var43];
                            int var45 = (var11 << this.field4054) + var15[var43];
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
                            } else if (var51 == 0 && this.field4062 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field4062 == var51 && this.field4062 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field4062 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field4062;
                                float var62 = (float) var52 / (float) this.field4062;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field4054) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field4054) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field4054) + var69);
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
                                var54 = class193.field2775[var46 & 0xFF80 | var73];
                                if ((this.field4057 & 0x7) == 0) {
                                    float var74 = this.field4061.field242[2] * var58 + this.field4061.field242[0] * var56 + this.field4061.field242[1] * var57;
                                    var55 = this.field4061.field320 + var74 * (var74 > 0.0F ? this.field4061.field302 : this.field4061.field286);
                                }
                            }
                            class381 var75 = var8.method614(-111, var49);
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
                                    var77 = class193.field2775[var47 & 0xFF80 | var76];
                                    if ((this.field4057 & 0x7) == 0) {
                                        float var78 = this.field4061.field242[2] * var58 + this.field4061.field242[0] * var56 + this.field4061.field242[1] * var57;
                                        float var79 = this.field4061.field320 + var55 * (var55 > 0.0F ? this.field4061.field302 : this.field4061.field286);
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
                                var6.putFloat((float) (this.method1515(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                if ((this.field4057 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                if (this.field4077 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                var86 = this.field4059++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method612(var49, -1, new class41(var42[var43]));
                            } else {
                                var42[var43] = ((class41) var75).field633;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field5349 < var7[var86].field5349) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method1202(var54, var86, 1347044360, var55, var60);
                            }
                            this.field4060++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field4059; var88++) {
                class158 var89 = var7[var88];
                if (var89 != null) {
                    var89.method1197(85, var88);
                }
            }
            for (int var90 = 0; var90 < this.field5745; var90++) {
                for (int var91 = 0; var91 < this.field5751; var91++) {
                    short[] var92 = this.field4067[this.field5745 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class158 var98 = var7[var95];
                            class158 var99 = var7[var96];
                            class158 var100 = var7[var97];
                            class158 var101 = null;
                            if (var98 != null) {
                                var98.method1200((byte) -110, var91, var93, var90);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method1200((byte) -110, var91, var93, var90);
                                if (var101 == null || var99.field5349 < var101.field5349) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method1200((byte) -110, var91, var93, var90);
                                if (var101 == null || var100.field5349 < var101.field5349) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method1197(75, var95);
                                }
                                if (var99 != null) {
                                    var101.method1197(79, var96);
                                }
                                if (var100 != null) {
                                    var101.method1197(86, var97);
                                }
                                var101.method1200((byte) -110, var91, var93, var90);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field4084 = this.field4061.method187(var5, var6, false);
            int var102 = 24;
            this.field4086 = new class240(this.field4061, this.field4084, 5126, 3, 0);
            this.field4087 = new class240(this.field4061, this.field4084, 5126, 2, 12);
            this.field4076 = new class240(this.field4061, this.field4084, 5121, 4, 20);
            if ((this.field4057 & 0x7) != 0) {
                this.field4082 = new class240(this.field4061, this.field4084, 5126, 3, var102);
                var102 += 12;
            }
            if (this.field4077 != null) {
                this.field4079 = new class240(this.field4061, this.field4084, 5126, 1, var102);
                var102 += 4;
            }
            long[] var103 = new long[this.field4072.length];
            for (int var104 = 0; var104 < this.field4072.length; var104++) {
                class158 var105 = this.field4072[var104];
                var103[var104] = var105.field5349;
                var105.method1199(this.field4059, 0);
            }
            class415.method2568(var103, this.field4072, (byte) -121);
            if (this.field4063 != null) {
                this.field4063.method912(32671);
            }
        } else {
            this.field4063 = null;
        }
        this.field4053 = this.field4065 = (int[][][]) null;
        this.field4055 = (int[][][]) null;
        this.field4052 = (int[][][]) null;
        this.field4064 = (class158[][][]) null;
        this.field4051 = (int[][][]) null;
        this.field4080 = (byte[][]) null;
        this.field4073 = null;
        this.field4077 = (int[][]) null;
        this.field4083 = this.field4078 = this.field4075 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lj;[I)V")
    public final void method1520(class269 arg0, int[] arg1) {
        this.field4050.method1249(new class119(this.field4061, this, arg0, arg1), (byte) -106);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
    public final int method1515(int arg0, int arg1) {
        int var3 = arg0 >> this.field4054;
        int var4 = arg1 >> this.field4054;
        if (var3 < 0 || var4 < 0 || var3 > this.field5745 - 1 || var4 > this.field5751 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field4062 - 1;
        int var6 = arg1 & this.field4062 - 1;
        int var7 = (this.field4062 - var5) * this.field4058[var3][var4] + this.field4058[var3 + 1][var4] * var5 >> this.field4054;
        int var8 = (this.field4062 - var5) * this.field4058[var3][var4 + 1] + this.field4058[var3 + 1][var4 + 1] * var5 >> this.field4054;
        return (this.field4062 - var6) * var7 + var6 * var8 >> this.field4054;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field4085 <= 0) {
            return;
        }
        opengl var9 = this.field4061.field198;
        this.field4061.method216();
        this.field4061.method184(false);
        this.field4061.method127(false);
        this.field4061.method138(false);
        this.field4061.method158(false);
        this.field4061.method121(0);
        this.field4061.method190(-2);
        this.field4061.method207((class4) null);
        field4069[0] = (float) arg2 / ((float) this.field4062 * 128.0F * (float) this.field4061.field214);
        field4069[1] = 0.0F;
        field4069[2] = 0.0F;
        field4069[3] = 0.0F;
        field4069[4] = 0.0F;
        field4069[5] = (float) arg2 / ((float) this.field4062 * 128.0F * (float) this.field4061.field215);
        field4069[6] = 0.0F;
        field4069[7] = 0.0F;
        field4069[8] = 0.0F;
        field4069[9] = 0.0F;
        field4069[10] = 0.0F;
        field4069[11] = 0.0F;
        field4069[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4061.field214;
        field4069[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4061.field215;
        field4069[14] = 0.0F;
        field4069[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field4069, 0);
        field4069[0] = 1.0F;
        field4069[1] = 0.0F;
        field4069[2] = 0.0F;
        field4069[3] = 0.0F;
        field4069[4] = 0.0F;
        field4069[5] = 0.0F;
        field4069[6] = 1.0F;
        field4069[7] = 0.0F;
        field4069[8] = 0.0F;
        field4069[9] = 1.0F;
        field4069[10] = 0.0F;
        field4069[11] = 0.0F;
        field4069[12] = 0.0F;
        field4069[13] = 0.0F;
        field4069[14] = 0.0F;
        field4069[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field4069, 0);
        this.field4061.method117();
        this.field4061.method257(this.field4076);
        this.field4061.method161(this.field4086);
        this.field4061.method160(0, this.field4087);
        if ((this.field4057 & 0x7) == 0) {
            this.field4061.method127(false);
        } else {
            this.field4061.method150(this.field4082);
            this.field4061.method127(true);
        }
        this.field4061.method180();
        if (field4066.field3882.length < this.field4060 * 2) {
            field4066 = new class289(this.field4060 * 2);
        } else {
            field4066.field3938 = 0;
        }
        int var10 = 0;
        if (this.field4061.field292) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field5745 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field4067[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field4066.method1877(true, var14[var15]);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field5745 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field4067[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field4066.method1842(-4, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field4061.field277.method351(5123, field4066.field3882, field4066.field3938);
            this.field4061.method112(this.field4061.field277, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lug;IIIIZ)Z")
    public final boolean method1502(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4063 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field4061.field276 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field4061.field322 * arg2 >> 8) >> 3;
            return this.field4063.method913(var7, arg0, var8, -117);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method1514(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method1505(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILug;)Lug;")
    public final class325 method1504(int arg0, int arg1, class325 arg2) {
        if ((this.field4056[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field4062 >> this.field4061.field223;
        class253 var5 = (class253) arg2;
        class253 var6;
        if (var5 != null && var5.method1632(var4, var4, -47)) {
            var6 = var5;
            var5.method1636(104);
        } else {
            var6 = new class253(this.field4061, var4, var4);
        }
        var6.method1634(0, var4, 0, 0, var4);
        this.method1934(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(Lug;IIIIZ)V")
    public final void method1511(class325 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4063 != null && arg0 != null) {
            int var7 = arg1 - (this.field4061.field276 * arg2 >> 8) >> this.field4061.field223;
            int var8 = arg3 - (this.field4061.field322 * arg2 >> 8) >> this.field4061.field223;
            this.field4063.method908(var7, true, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
    public final void method1503(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)I")
    public final int method1509(int arg0, int arg1) {
        return this.field4058[arg0][arg1];
    }
}
