import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class312 extends class126 {

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lvq;")
    private class22 field4547 = new class22();

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Lge;")
    public class104 field4544;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[[I")
    private int[][] field4541;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "[[I")
    private int[][] field4563;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "[[[I")
    private int[][][] field4558;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[[[Lqd;")
    private class3[][][] field4539;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[[[I")
    public int[][][] field4556;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[[[I")
    public int[][][] field4542;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "[[[I")
    private int[][][] field4543;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "[[[I")
    private int[][][] field4545;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "[[S")
    public short[][] field4557;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "[[B")
    private byte[][] field4555;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "[[B")
    private byte[][] field4566;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "[[F")
    private float[][] field4574;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "[[F")
    private float[][] field4564;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "[[F")
    private float[][] field4569;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "Ljj;")
    private class156 field4572;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "Lek;")
    private class266 field4551;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lec;")
    public static class37 field4540 = new class37(1);

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[I")
    private static int[] field4554 = new int[1];

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[F")
    private static float[] field4546 = new float[16];

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
    private static int[] field4550 = new int[1];

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
    private static int[] field4552 = new int[1];

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field4537;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    private int field4538;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
    private static int field4559;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    private int field4560;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "Ljm;")
    public class160 field4561;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "Ljm;")
    private class160 field4562;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "Ljm;")
    public class160 field4565;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Ljm;")
    public class160 field4568;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "Ljm;")
    public class160 field4573;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "Luq;")
    private class233 field4567;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "[Lqd;")
    private class3[] field4571;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[[ZZ)V")
    public final void method812(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field4571 == null) {
            return;
        }
        float var6 = this.field4544.field1682;
        float var7 = this.field4544.field1659;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field4550.length < var9) {
            field4550 = new int[var9];
        }
        if (field4540.field578.length < this.field4538 * 2) {
            field4540 = new class37(this.field4538 * 2);
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
        if (var14 > this.field2037 - 1) {
            var14 = this.field2037 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field2045 - 1) {
            var15 = this.field2045 - 1;
        }
        field4559 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field4550[field4559++] = this.field2037 * var18 + var16;
                }
            }
        }
        this.field4544.method887();
        for (int var19 = 0; var19 < this.field4571.length; var19++) {
            this.field4571[var19].method11(field4559, field4550, (byte) -106);
        }
        if (!this.field4547.method152((byte) 59)) {
            int var20 = this.field4544.field1639;
            int var21 = this.field4544.field1630;
            this.field4544.method754(0, var21);
            this.field4544.method693(var7, var6 - 4.0F);
            this.field4544.method911(false);
            this.field4544.method864(false);
            this.field4544.method868(130);
            this.field4544.method899(-2);
            this.field4544.method929(this.field4544.field1627);
            this.field4544.method870(8448, 7681);
            this.field4544.method891(0, 34166, 770);
            this.field4544.method889(0, 34167, 770);
            for (class35 var22 = this.field4547.method157((byte) -125); var22 != null; var22 = this.field4547.method145(-124)) {
                class262 var23 = (class262) var22;
                var23.method1880(arg2, arg1, arg0, arg3, false);
            }
            this.field4544.method891(0, 5890, 768);
            this.field4544.method889(0, 5890, 770);
            this.field4544.method929((class195) null);
            this.field4544.method754(var20, var21);
        }
        if (this.field4551 != null) {
            this.field4544.method693(var7, var6 - 8.0F);
            this.field4544.method887();
            this.field4544.method902(this.field4573);
            this.field4544.method905(0, this.field4561);
            this.field4544.method876();
            this.field4551.method1895(arg3, arg4, arg0, arg1, arg2, (byte) -86);
        }
        this.field4544.method693(var7, var6);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lsr;IIIIZ)V")
    public final void method811(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4551 != null && arg0 != null) {
            int var7 = arg1 - (this.field4544.field1731 * arg2 >> 8) >> this.field4544.field1619;
            int var8 = arg3 - (this.field4544.field1673 * arg2 >> 8) >> this.field4544.field1619;
            this.field4551.method1897(var8, arg0, var7, -13798);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILsr;)Lsr;")
    public final class135 method801(int arg0, int arg1, class135 arg2) {
        if ((this.field4555[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field4549 >> this.field4544.field1619;
        class241 var5 = (class241) arg2;
        class241 var6;
        if (var5 != null && var5.method1759(var4, var4, 73)) {
            var6 = var5;
            var5.method1756((byte) 0);
        } else {
            var6 = new class241(this.field4544, var4, var4);
        }
        var6.method1758(0, var4, 0, var4, 0);
        this.method2123(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
    public final void method808(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lge;IIII[[I[[II)V")
    public class312(class104 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field4544 = arg0;
        this.field4541 = arg5;
        this.field4563 = arg6;
        this.field4548 = arg2;
        while (arg7 > 1) {
            this.field4553++;
            arg7 >>= 0x1;
        }
        this.field4549 = 0x1 << this.field4553;
        this.field4558 = new int[arg3][arg4][];
        this.field4539 = new class3[arg3][arg4][];
        this.field4556 = new int[arg3][arg4][];
        this.field4542 = new int[arg3][arg4][];
        this.field4543 = new int[arg3][arg4][];
        this.field4545 = new int[arg3][arg4][];
        this.field4557 = new short[arg3 * arg4][];
        this.field4555 = new byte[arg3][arg4];
        this.field4566 = new byte[arg3 + 1][arg4 + 1];
        this.field4574 = new float[arg3 + 1][arg4 + 1];
        this.field4564 = new float[arg3 + 1][arg4 + 1];
        this.field4569 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field4541[var10 + 1][var9] - this.field4541[var10 - 1][var9];
                int var12 = this.field4541[var10][var9 + 1] - this.field4541[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field4574[var10][var9] = (float) var11 * var13;
                this.field4564[var10][var9] = var13 * -256.0F;
                this.field4569[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4572 = new class156(128);
        if ((this.field4548 & 0x10) != 0) {
            this.field4551 = new class266(this.field4544, this);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method805(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field4558[arg0][arg1] = arg3;
        this.field4556[arg0][arg1] = arg2;
        this.field4542[arg0][arg1] = arg4;
        this.field4543[arg0][arg1] = arg5;
        this.field4545[arg0][arg1] = arg6;
        class3[] var13 = this.field4539[arg0][arg1] = new class3[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class35 var17 = this.field4572.method1219(var15, -127);
            if (var17 == null) {
                var13[var14] = new class3(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field4572.method1217(1, var15, var13[var14]);
            } else {
                var13[var14] = (class3) var17;
            }
        }
        if (arg11) {
            this.field4555[arg0][arg1] = (byte) (this.field4555[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field4560) {
            this.field4560 = arg5.length;
        }
        this.field4570 += arg5.length;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public final void method796() {
        if (this.field4570 > 0) {
            byte[][] var1 = new byte[this.field2037 + 1][this.field2045 + 1];
            for (int var2 = 1; var2 < this.field2037; var2++) {
                for (int var3 = 1; var3 < this.field2045; var3++) {
                    var1[var2][var3] = (byte) ((this.field4566[var2][var3] >> 1) + (this.field4566[var2][var3 + 1] >> 3) + (this.field4566[var2][var3 - 1] >> 2) + (this.field4566[var2 - 1][var3] >> 2) + (this.field4566[var2 + 1][var3] >> 3));
                }
            }
            this.field4571 = new class3[this.field4572.method1225(-12198)];
            this.field4572.method1221(this.field4571, true);
            for (int var4 = 0; var4 < this.field4571.length; var4++) {
                this.field4571[var4].method14(this.field4570, -31);
            }
            int var5 = 24;
            if (this.field4563 != null) {
                var5 += 4;
            }
            if ((this.field4548 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field4570 * var5).order(ByteOrder.nativeOrder());
            class3[] var7 = new class3[this.field4570];
            class156 var8 = new class156(class321.method2142(-997880092, this.field4570));
            class3[] var9 = new class3[this.field4560];
            for (int var10 = 0; var10 < this.field2037; var10++) {
                for (int var11 = 0; var11 < this.field2045; var11++) {
                    if (this.field4543[var10][var11] != null) {
                        class3[] var12 = this.field4539[var10][var11];
                        int[] var13 = this.field4558[var10][var11];
                        int[] var14 = this.field4556[var10][var11];
                        int[] var15 = this.field4542[var10][var11];
                        int[] var16 = this.field4545[var10][var11];
                        int[] var17 = this.field4543[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field4574[var10][var11];
                        float var19 = this.field4564[var10][var11];
                        float var20 = this.field4569[var10][var11];
                        float var21 = this.field4574[var10][var11 + 1];
                        float var22 = this.field4564[var10][var11 + 1];
                        float var23 = this.field4569[var10][var11 + 1];
                        float var24 = this.field4574[var10 + 1][var11 + 1];
                        float var25 = this.field4564[var10 + 1][var11 + 1];
                        float var26 = this.field4569[var10 + 1][var11 + 1];
                        float var27 = this.field4574[var10 + 1][var11];
                        float var28 = this.field4564[var10 + 1][var11];
                        float var29 = this.field4569[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field4563 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field4563[var10][var11];
                            var35 = (float) this.field4563[var10][var11 + 1];
                            var36 = (float) this.field4563[var10 + 1][var11 + 1];
                            var37 = (float) this.field4563[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label303: for (int var39 = 0; var39 < var17.length; var39++) {
                            class3 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label303;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field4557[this.field2037 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field4553) + var14[var43];
                            int var45 = (var11 << this.field4553) + var15[var43];
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
                            } else if (var51 == 0 && this.field4549 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field4549 == var51 && this.field4549 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field4549 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field4549;
                                float var62 = (float) var52 / (float) this.field4549;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field4553) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field4553) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field4553) + var69);
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
                                var54 = class187.field2773[var46 & 0xFF80 | var73];
                                if ((this.field4548 & 0x7) == 0) {
                                    float var74 = this.field4544.field1714[2] * var58 + this.field4544.field1714[0] * var56 + this.field4544.field1714[1] * var57;
                                    var55 = this.field4544.field1683 + var74 * (var74 > 0.0F ? this.field4544.field1701 : this.field4544.field1711);
                                }
                            }
                            class35 var75 = var8.method1219(var49, -124);
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
                                    var77 = class187.field2773[var47 & 0xFF80 | var76];
                                    if ((this.field4548 & 0x7) == 0) {
                                        float var78 = this.field4544.field1714[2] * var58 + this.field4544.field1714[0] * var56 + this.field4544.field1714[1] * var57;
                                        float var79 = this.field4544.field1683 + var55 * (var55 > 0.0F ? this.field4544.field1701 : this.field4544.field1711);
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
                                var6.putFloat((float) (this.method809(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                if ((this.field4548 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                if (this.field4563 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                var86 = this.field4537++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method1217(1, var49, new class13(var42[var43]));
                            } else {
                                var42[var43] = ((class13) var75).field212;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field499 < var7[var86].field499) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method13(true, var54, var86, var60, var55);
                            }
                            this.field4538++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field4537; var88++) {
                class3 var89 = var7[var88];
                if (var89 != null) {
                    var89.method10(var88, (byte) 103);
                }
            }
            for (int var90 = 0; var90 < this.field2037; var90++) {
                for (int var91 = 0; var91 < this.field2045; var91++) {
                    short[] var92 = this.field4557[this.field2037 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class3 var98 = var7[var95];
                            class3 var99 = var7[var96];
                            class3 var100 = var7[var97];
                            class3 var101 = null;
                            if (var98 != null) {
                                var98.method15(1, var90, var91, var93);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method15(1, var90, var91, var93);
                                if (var101 == null || var99.field499 < var101.field499) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method15(1, var90, var91, var93);
                                if (var101 == null || var100.field499 < var101.field499) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method10(var95, (byte) -67);
                                }
                                if (var99 != null) {
                                    var101.method10(var96, (byte) 110);
                                }
                                if (var100 != null) {
                                    var101.method10(var97, (byte) -72);
                                }
                                var101.method15(1, var90, var91, var93);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field4567 = this.field4544.method931(var5, var6, false);
            int var102 = 24;
            this.field4573 = new class160(this.field4544, this.field4567, 5126, 3, 0);
            this.field4561 = new class160(this.field4544, this.field4567, 5126, 2, 12);
            this.field4562 = new class160(this.field4544, this.field4567, 5121, 4, 20);
            if ((this.field4548 & 0x7) != 0) {
                this.field4565 = new class160(this.field4544, this.field4567, 5126, 3, var102);
                var102 += 12;
            }
            if (this.field4563 != null) {
                this.field4568 = new class160(this.field4544, this.field4567, 5126, 1, var102);
                var102 += 4;
            }
            long[] var103 = new long[this.field4571.length];
            for (int var104 = 0; var104 < this.field4571.length; var104++) {
                class3 var105 = this.field4571[var104];
                var103[var104] = var105.field499;
                var105.method12(this.field4537, 0);
            }
            class242.method1769((byte) 77, this.field4571, var103);
            if (this.field4551 != null) {
                this.field4551.method1898(1);
            }
        } else {
            this.field4551 = null;
        }
        this.field4556 = this.field4542 = (int[][][]) null;
        this.field4545 = (int[][][]) null;
        this.field4558 = (int[][][]) null;
        this.field4539 = (class3[][][]) null;
        this.field4543 = (int[][][]) null;
        this.field4566 = (byte[][]) null;
        this.field4572 = null;
        this.field4563 = (int[][]) null;
        this.field4574 = this.field4564 = this.field4569 = (float[][]) null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Luc;[I)V")
    public final void method806(class59 arg0, int[] arg1) {
        this.field4547.method148((byte) 85, new class262(this.field4544, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method799(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method805(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lsr;IIIIZ)V")
    public final void method798(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4551 != null && arg0 != null) {
            int var7 = arg1 - (this.field4544.field1731 * arg2 >> 8) >> this.field4544.field1619;
            int var8 = arg3 - (this.field4544.field1673 * arg2 >> 8) >> this.field4544.field1619;
            this.field4551.method1900((byte) 52, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)I")
    public final int method809(int arg0, int arg1) {
        int var3 = arg0 >> this.field4553;
        int var4 = arg1 >> this.field4553;
        if (var3 < 0 || var4 < 0 || var3 > this.field2037 - 1 || var4 > this.field2045 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field4549 - 1;
        int var6 = arg1 & this.field4549 - 1;
        int var7 = (this.field4549 - var5) * this.field4541[var3][var4] + this.field4541[var3 + 1][var4] * var5 >> this.field4553;
        int var8 = (this.field4549 - var5) * this.field4541[var3][var4 + 1] + this.field4541[var3 + 1][var4 + 1] * var5 >> this.field4553;
        return (this.field4549 - var6) * var7 + var6 * var8 >> this.field4553;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lv;II)V")
    private final void method2123(class241 arg0, int arg1, int arg2) {
        int[] var4 = this.field4556[arg1][arg2];
        int[] var5 = this.field4542[arg1][arg2];
        int var6 = var4.length;
        if (field4554.length < var6) {
            field4554 = new int[var6];
            field4552 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field4554[var7] = (var4[var7] & 0xFF) >> this.field4544.field1619;
            field4552[var7] = (var5[var7] & 0xFF) >> this.field4544.field1619;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field4554[var8];
            int var10 = field4552[var8++];
            int var11 = field4554[var8];
            int var12 = field4552[var8++];
            int var13 = field4554[var8];
            int var14 = field4552[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1760(var9, var10, -1840888080, var12, var13, var11, var14);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
    public final void method800(int arg0, int arg1, int arg2) {
        if ((this.field4566[arg0][arg1] & 0xFF) < arg2) {
            this.field4566[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(Lsr;IIIIZ)Z")
    public final boolean method802(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field4551 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field4544.field1731 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field4544.field1673 * arg2 >> 8) >> 3;
            return this.field4551.method1901(arg0, -18481, var8, var7);
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)I")
    public final int method794(int arg0, int arg1) {
        return this.field4541[arg0][arg1];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field4570 <= 0) {
            return;
        }
        opengl var9 = this.field4544.field1604;
        this.field4544.method897();
        this.field4544.method867(false);
        this.field4544.method911(false);
        this.field4544.method913(false);
        this.field4544.method864(false);
        this.field4544.method868(0);
        this.field4544.method899(-2);
        this.field4544.method929((class195) null);
        field4546[0] = (float) arg2 / ((float) this.field4549 * 128.0F * (float) this.field4544.field1611);
        field4546[1] = 0.0F;
        field4546[2] = 0.0F;
        field4546[3] = 0.0F;
        field4546[4] = 0.0F;
        field4546[5] = (float) arg2 / ((float) this.field4549 * 128.0F * (float) this.field4544.field1617);
        field4546[6] = 0.0F;
        field4546[7] = 0.0F;
        field4546[8] = 0.0F;
        field4546[9] = 0.0F;
        field4546[10] = 0.0F;
        field4546[11] = 0.0F;
        field4546[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4544.field1611;
        field4546[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4544.field1617;
        field4546[14] = 0.0F;
        field4546[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field4546, 0);
        field4546[0] = 1.0F;
        field4546[1] = 0.0F;
        field4546[2] = 0.0F;
        field4546[3] = 0.0F;
        field4546[4] = 0.0F;
        field4546[5] = 0.0F;
        field4546[6] = 1.0F;
        field4546[7] = 0.0F;
        field4546[8] = 0.0F;
        field4546[9] = 1.0F;
        field4546[10] = 0.0F;
        field4546[11] = 0.0F;
        field4546[12] = 0.0F;
        field4546[13] = 0.0F;
        field4546[14] = 0.0F;
        field4546[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field4546, 0);
        this.field4544.method862();
        this.field4544.method854(this.field4562);
        this.field4544.method902(this.field4573);
        this.field4544.method905(0, this.field4561);
        if ((this.field4548 & 0x7) == 0) {
            this.field4544.method911(false);
        } else {
            this.field4544.method925(this.field4565);
            this.field4544.method911(true);
        }
        this.field4544.method876();
        if (field4540.field578.length < this.field4538 * 2) {
            field4540 = new class37(this.field4538 * 2);
        } else {
            field4540.field565 = 0;
        }
        int var10 = 0;
        if (this.field4544.field1727) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field2037 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field4557[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field4540.method324(var14[var15], -120);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field2037 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field4557[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field4540.method301((byte) 7, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field4544.field1675.method979(5123, field4540.field578, field4540.field565);
            this.field4544.method878(this.field4544.field1675, 4, 0, var10);
        }
    }
}
