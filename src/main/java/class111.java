import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class111 extends class242 {

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Laq;")
    private class90 field1592 = new class90();

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "Ltb;")
    public class227 field1601;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "[[I")
    private int[][] field1606;

    @OriginalMember(owner = "client!fq", name = "R", descriptor = "[[I")
    private int[][] field1624;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "[[[I")
    private int[][][] field1590;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "[[[Lhq;")
    private class88[][][] field1599;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "[[[I")
    public int[][][] field1594;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "[[[I")
    public int[][][] field1591;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "[[[I")
    private int[][][] field1605;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "[[[I")
    private int[][][] field1595;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "[[S")
    public short[][] field1600;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "[[B")
    private byte[][] field1593;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "[[B")
    private byte[][] field1615;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "[[F")
    private float[][] field1620;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "[[F")
    private float[][] field1617;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "[[F")
    private float[][] field1619;

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "Lec;")
    private class129 field1613;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "Lhr;")
    private class308 field1607;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "Lkh;")
    public static class11 field1604 = new class11(1);

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "[F")
    private static float[] field1611 = new float[16];

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "[I")
    private static int[] field1612 = new int[1];

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "[I")
    private static int[] field1610 = new int[1];

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "[I")
    private static int[] field1608 = new int[1];

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "I")
    private static int field1609;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!fq", name = "T", descriptor = "Lqb;")
    private class122 field1626;

    @OriginalMember(owner = "client!fq", name = "G", descriptor = "Lq;")
    public class246 field1614;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "Lq;")
    public class246 field1618;

    @OriginalMember(owner = "client!fq", name = "Q", descriptor = "Lq;")
    private class246 field1623;

    @OriginalMember(owner = "client!fq", name = "S", descriptor = "Lq;")
    public class246 field1625;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "[Lhq;")
    private class88[] field1616;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 5)
    public final void method723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field1621 <= 0) {
            return;
        }
        opengl var9 = this.field1601.field3184;
        this.field1601.method1505();
        this.field1601.method1520(false);
        this.field1601.method1544(false);
        this.field1601.method1564(false);
        this.field1601.method1519(false);
        this.field1601.method1510(0);
        this.field1601.method1516(-2);
        this.field1601.method1559((class127) null);
        field1611[0] = (float) arg2 / ((float) this.field1596 * 128.0F * (float) this.field1601.field3197);
        field1611[1] = 0.0F;
        field1611[2] = 0.0F;
        field1611[3] = 0.0F;
        field1611[4] = 0.0F;
        field1611[5] = (float) arg2 / ((float) this.field1596 * 128.0F * (float) this.field1601.field3194);
        field1611[6] = 0.0F;
        field1611[7] = 0.0F;
        field1611[8] = 0.0F;
        field1611[9] = 0.0F;
        field1611[10] = 0.0F;
        field1611[11] = 0.0F;
        field1611[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1601.field3197;
        field1611[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1601.field3194;
        field1611[14] = 0.0F;
        field1611[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field1611, 0);
        field1611[0] = 1.0F;
        field1611[1] = 0.0F;
        field1611[2] = 0.0F;
        field1611[3] = 0.0F;
        field1611[4] = 0.0F;
        field1611[5] = 0.0F;
        field1611[6] = 1.0F;
        field1611[7] = 0.0F;
        field1611[8] = 0.0F;
        field1611[9] = 1.0F;
        field1611[10] = 0.0F;
        field1611[11] = 0.0F;
        field1611[12] = 0.0F;
        field1611[13] = 0.0F;
        field1611[14] = 0.0F;
        field1611[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field1611, 0);
        if ((this.field1602 & 0x7) == 0) {
            this.field1601.method1544(false);
        } else {
            this.field1601.method1544(true);
            this.field1601.method1562();
        }
        this.field1601.method1513(this.field1618, this.field1614, this.field1623, this.field1625);
        if (field1604.field230.length < this.field1598 * 2) {
            field1604 = new class11(this.field1598 * 2);
        } else {
            field1604.field191 = 0;
        }
        int var10 = 0;
        if (this.field1601.field3229) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field3434 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field1600[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1604.method191(var14[var15] & 0xFFFF, -115);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field3434 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field1600[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field1604.method210(var19[var20] & 0xFFFF, 13579);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class136 var21 = new class136(this.field1601, 5123, field1604.field230, field1604.field191);
            this.field1601.method1567(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 171)
    public final void method720(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field1590[arg0][arg1] = arg3;
        this.field1594[arg0][arg1] = arg2;
        this.field1591[arg0][arg1] = arg4;
        this.field1605[arg0][arg1] = arg5;
        this.field1595[arg0][arg1] = arg6;
        class88[] var13 = this.field1599[arg0][arg1] = new class88[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class390 var17 = this.field1613.method886(var15, 25651);
            if (var17 == null) {
                var13[var14] = new class88(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field1613.method883((byte) -54, var15, var13[var14]);
            } else {
                var13[var14] = (class88) var17;
            }
        }
        if (arg11) {
            this.field1593[arg0][arg1] = (byte) (this.field1593[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field1622) {
            this.field1622 = arg5.length;
        }
        this.field1621 += arg5.length;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I", line = 209)
    public final int method737(int arg0, int arg1) {
        return this.field1606[arg0][arg1];
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 213)
    public final void method732(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method720(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(Lmc;IIIIZ)V", line = 277)
    public final void method736(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1607 != null && arg0 != null) {
            int var7 = arg1 - (this.field1601.field3291 * arg2 >> 8) >> this.field1601.field3201;
            int var8 = arg3 - (this.field1601.field3256 * arg2 >> 8) >> this.field1601.field3201;
            this.field1607.method1982(var7, -31264, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III[[ZZ)V", line = 291)
    public final void method731(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field1616 == null) {
            return;
        }
        float var6 = this.field1601.field3273;
        float var7 = this.field1601.field3310;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field1612.length < var9) {
            field1612 = new int[var9];
        }
        if (field1604.field230.length < this.field1598 * 2) {
            field1604 = new class11(this.field1598 * 2);
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
        if (var14 > this.field3434 - 1) {
            var14 = this.field3434 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field3433 - 1) {
            var15 = this.field3433 - 1;
        }
        field1609 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field1612[field1609++] = this.field3434 * var18 + var16;
                }
            }
        }
        this.field1601.method1528();
        this.field1601.method1544((this.field1602 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field1616.length; var19++) {
            this.field1616[var19].method621(field1609, 5888, field1612);
        }
        if (!this.field1592.method647(false)) {
            int var20 = this.field1601.field3221;
            int var21 = this.field1601.field3227;
            this.field1601.method120(0, var21);
            this.field1601.method80(var7, var6 - 4.0F);
            this.field1601.method1544(false);
            this.field1601.method1519(false);
            this.field1601.method1510(130);
            this.field1601.method1516(-2);
            this.field1601.method1559(this.field1601.field3279);
            this.field1601.method1542(8448, 7681);
            this.field1601.method1512(0, 34166, 770);
            this.field1601.method1572(0, 34167, 770);
            for (class390 var22 = this.field1592.method646(48); var22 != null; var22 = this.field1592.method641(false)) {
                class115 var23 = (class115) var22;
                var23.method801(122, arg1, arg0, arg2, arg3);
            }
            this.field1601.method1512(0, 5890, 768);
            this.field1601.method1572(0, 5890, 770);
            this.field1601.method1559((class127) null);
            this.field1601.method120(var20, var21);
        }
        if (this.field1607 != null) {
            this.field1601.method80(var7, var6 - 8.0F);
            this.field1601.method1528();
            this.field1601.method1513(this.field1618, (class246) null, (class246) null, this.field1625);
            this.field1607.method1978(arg0, arg1, arg4, arg2, arg3, 8300);
        }
        this.field1601.method80(var7, var6);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V", line = 418)
    public final void method722() {
        if (this.field1621 > 0) {
            byte[][] var1 = new byte[this.field3434 + 1][this.field3433 + 1];
            for (int var2 = 1; var2 < this.field3434; var2++) {
                for (int var3 = 1; var3 < this.field3433; var3++) {
                    var1[var2][var3] = (byte) ((this.field1615[var2][var3] >> 1) + (this.field1615[var2][var3 + 1] >> 3) + (this.field1615[var2][var3 - 1] >> 2) + (this.field1615[var2 - 1][var3] >> 2) + (this.field1615[var2 + 1][var3] >> 3));
                }
            }
            this.field1616 = new class88[this.field1613.method887((byte) 72)];
            this.field1613.method880(this.field1616, (byte) -3);
            for (int var4 = 0; var4 < this.field1616.length; var4++) {
                this.field1616[var4].method622(this.field1621, 108);
            }
            int var5 = 24;
            if (this.field1624 != null) {
                var5 += 4;
            }
            if ((this.field1602 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field1621 * var5).order(ByteOrder.nativeOrder());
            class88[] var7 = new class88[this.field1621];
            class129 var8 = new class129(class414.method2594(this.field1621, (byte) -125));
            class88[] var9 = new class88[this.field1622];
            for (int var10 = 0; var10 < this.field3434; var10++) {
                for (int var11 = 0; var11 < this.field3433; var11++) {
                    if (this.field1605[var10][var11] != null) {
                        class88[] var12 = this.field1599[var10][var11];
                        int[] var13 = this.field1590[var10][var11];
                        int[] var14 = this.field1594[var10][var11];
                        int[] var15 = this.field1591[var10][var11];
                        int[] var16 = this.field1595[var10][var11];
                        int[] var17 = this.field1605[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field1620[var10][var11];
                        float var19 = this.field1617[var10][var11];
                        float var20 = this.field1619[var10][var11];
                        float var21 = this.field1620[var10][var11 + 1];
                        float var22 = this.field1617[var10][var11 + 1];
                        float var23 = this.field1619[var10][var11 + 1];
                        float var24 = this.field1620[var10 + 1][var11 + 1];
                        float var25 = this.field1617[var10 + 1][var11 + 1];
                        float var26 = this.field1619[var10 + 1][var11 + 1];
                        float var27 = this.field1620[var10 + 1][var11];
                        float var28 = this.field1617[var10 + 1][var11];
                        float var29 = this.field1619[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field1624 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field1624[var10][var11];
                            var35 = (float) this.field1624[var10][var11 + 1];
                            var36 = (float) this.field1624[var10 + 1][var11 + 1];
                            var37 = (float) this.field1624[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class88 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field1600[this.field3434 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field1603) + var14[var43];
                            int var45 = (var11 << this.field1603) + var15[var43];
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
                            } else if (var51 == 0 && this.field1596 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field1596 == var51 && this.field1596 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field1596 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field1596;
                                float var62 = (float) var52 / (float) this.field1596;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field1603) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field1603) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field1603) + var69);
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
                                var54 = class128.field1805[var46 & 0xFF80 | var73];
                                if ((this.field1602 & 0x7) == 0) {
                                    float var74 = this.field1601.field3280[2] * var58 + this.field1601.field3280[0] * var56 + this.field1601.field3280[1] * var57;
                                    var55 = this.field1601.field3278 + var74 * (var74 > 0.0F ? this.field1601.field3308 : this.field1601.field3235);
                                }
                            }
                            class390 var75 = var8.method886(var49, 25651);
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
                                    var77 = class128.field1805[var47 & 0xFF80 | var76];
                                    if ((this.field1602 & 0x7) == 0) {
                                        float var78 = this.field1601.field3280[2] * var58 + this.field1601.field3280[0] * var56 + this.field1601.field3280[1] * var57;
                                        float var79 = this.field1601.field3278 + var55 * (var55 > 0.0F ? this.field1601.field3308 : this.field1601.field3235);
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
                                var6.putFloat((float) (this.method725(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field1624 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field1602 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field1597++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method883((byte) -54, var49, new class352(var42[var43]));
                            } else {
                                var42[var43] = ((class352) var75).field4816;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field5600 < var7[var86].field5600) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method619(var60, var86, var54, (byte) 104, var55);
                            }
                            this.field1598++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field1597; var88++) {
                class88 var89 = var7[var88];
                if (var89 != null) {
                    var89.method620(var88, (byte) 31);
                }
            }
            for (int var90 = 0; var90 < this.field3434; var90++) {
                for (int var91 = 0; var91 < this.field3433; var91++) {
                    short[] var92 = this.field1600[this.field3434 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class88 var98 = var7[var95];
                            class88 var99 = var7[var96];
                            class88 var100 = var7[var97];
                            class88 var101 = null;
                            if (var98 != null) {
                                var98.method624(0, var90, var91, var93);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method624(0, var90, var91, var93);
                                if (var101 == null || var99.field5600 < var101.field5600) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method624(0, var90, var91, var93);
                                if (var101 == null || var100.field5600 < var101.field5600) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method620(var95, (byte) 31);
                                }
                                if (var99 != null) {
                                    var101.method620(var96, (byte) 31);
                                }
                                if (var100 != null) {
                                    var101.method620(var97, (byte) 31);
                                }
                                var101.method624(0, var90, var91, var93);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field1626 = this.field1601.method1537(var5, var6, false);
            this.field1618 = new class246(this.field1601, this.field1626, 5126, 3, 0);
            this.field1623 = new class246(this.field1601, this.field1626, 5121, 4, 12);
            byte var102;
            if (this.field1624 == null) {
                this.field1625 = new class246(this.field1601, this.field1626, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field1625 = new class246(this.field1601, this.field1626, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field1602 & 0x7) != 0) {
                this.field1614 = new class246(this.field1601, this.field1626, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field1616.length];
            for (int var104 = 0; var104 < this.field1616.length; var104++) {
                class88 var105 = this.field1616[var104];
                var103[var104] = var105.field5600;
                var105.method623(true, this.field1597);
            }
            class442.method2768(var103, 0, this.field1616);
            if (this.field1607 != null) {
                this.field1607.method1980(83);
            }
        } else {
            this.field1607 = null;
        }
        this.field1594 = this.field1591 = (int[][][]) null;
        this.field1595 = (int[][][]) null;
        this.field1590 = (int[][][]) null;
        this.field1599 = (class88[][][]) null;
        this.field1605 = (int[][][]) null;
        this.field1615 = (byte[][]) null;
        this.field1613 = null;
        this.field1624 = (int[][]) null;
        this.field1620 = this.field1617 = this.field1619 = (float[][]) null;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)I", line = 956)
    public final int method725(int arg0, int arg1) {
        int var3 = arg0 >> this.field1603;
        int var4 = arg1 >> this.field1603;
        if (var3 < 0 || var4 < 0 || var3 > this.field3434 - 1 || var4 > this.field3433 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field1596 - 1;
        int var6 = arg1 & this.field1596 - 1;
        int var7 = (this.field1596 - var5) * this.field1606[var3][var4] + this.field1606[var3 + 1][var4] * var5 >> this.field1603;
        int var8 = (this.field1596 - var5) * this.field1606[var3][var4 + 1] + this.field1606[var3 + 1][var4 + 1] * var5 >> this.field1603;
        return (this.field1596 - var6) * var7 + var6 * var8 >> this.field1603;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lbh;[I)V", line = 979)
    public final void method727(class24 arg0, int[] arg1) {
        this.field1592.method643(new class115(this.field1601, this, arg0, arg1), -98);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Lmc;IIIIZ)V", line = 983)
    public final void method739(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1607 != null && arg0 != null) {
            int var7 = arg1 - (this.field1601.field3291 * arg2 >> 8) >> this.field1601.field3201;
            int var8 = arg3 - (this.field1601.field3256 * arg2 >> 8) >> this.field1601.field3201;
            this.field1607.method1986(var7, var8, 32692, arg0);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lca;II)V", line = 998)
    private final void method789(class166 arg0, int arg1, int arg2) {
        int[] var4 = this.field1594[arg1][arg2];
        int[] var5 = this.field1591[arg1][arg2];
        int var6 = var4.length;
        if (field1610.length < var6) {
            field1610 = new int[var6];
            field1608 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field1610[var7] = (var4[var7] & 0xFF) >> this.field1601.field3201;
            field1608[var7] = (var5[var7] & 0xFF) >> this.field1601.field3201;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field1610[var8];
            int var10 = field1608[var8++];
            int var11 = field1610[var8];
            int var12 = field1608[var8++];
            int var13 = field1610[var8];
            int var14 = field1608[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1114(var13, var10, var14, var12, var9, var11, (byte) -72);
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lmc;IIIIZ)Z", line = 1046)
    public final boolean method726(class69 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1607 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field1601.field3291 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field1601.field3256 * arg2 >> 8) >> 3;
            return this.field1607.method1981(var7, var8, arg0, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(II)V", line = 1058)
    public final void method730(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V", line = 1061)
    public final void method738(int arg0, int arg1, int arg2) {
        if ((this.field1615[arg0][arg1] & 0xFF) < arg2) {
            this.field1615[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILmc;)Lmc;", line = 1066)
    public final class69 method733(int arg0, int arg1, class69 arg2) {
        if ((this.field1593[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field1596 >> this.field1601.field3201;
        class166 var5 = (class166) arg2;
        class166 var6;
        if (var5 != null && var5.method1112(0, var4, var4)) {
            var6 = var5;
            var5.method1111(false);
        } else {
            var6 = new class166(this.field1601, var4, var4);
        }
        var6.method1113(0, var4, 0, var4, 0);
        this.method789(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ltb;IIII[[I[[II)V", line = 1092)
    public class111(class227 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1601 = arg0;
        this.field1606 = arg5;
        this.field1624 = arg6;
        this.field1602 = arg2;
        while (arg7 > 1) {
            this.field1603++;
            arg7 >>= 0x1;
        }
        this.field1596 = 0x1 << this.field1603;
        this.field1590 = new int[arg3][arg4][];
        this.field1599 = new class88[arg3][arg4][];
        this.field1594 = new int[arg3][arg4][];
        this.field1591 = new int[arg3][arg4][];
        this.field1605 = new int[arg3][arg4][];
        this.field1595 = new int[arg3][arg4][];
        this.field1600 = new short[arg3 * arg4][];
        this.field1593 = new byte[arg3][arg4];
        this.field1615 = new byte[arg3 + 1][arg4 + 1];
        this.field1620 = new float[arg3 + 1][arg4 + 1];
        this.field1617 = new float[arg3 + 1][arg4 + 1];
        this.field1619 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field1606[var10 + 1][var9] - this.field1606[var10 - 1][var9];
                int var12 = this.field1606[var10][var9 + 1] - this.field1606[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field1620[var10][var9] = (float) var11 * var13;
                this.field1617[var10][var9] = var13 * -256.0F;
                this.field1619[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1613 = new class129(128);
        if ((this.field1602 & 0x10) != 0) {
            this.field1607 = new class308(this.field1601, this);
        }
    }
}
