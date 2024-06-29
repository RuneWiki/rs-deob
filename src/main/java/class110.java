import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class110 {

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Lhd;")
    private class17 field1597;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lag;")
    private class302 field1591;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[B")
    public byte[] field1589;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[[Lul;")
    private class306[][] field1596;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBI)V", line = 4)
    private final void method906(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 > -56) {
            this.field1595 = -84;
        }
        if (this.field1596 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg2 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class306[] var11 = this.field1596[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4143 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([BIIII[BIII)V", line = 45)
    private static final void method907(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        if (arg3 > -3) {
            method911(-77, (byte[]) null, 99, -111, 66, -18, -76);
        }
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg1++]);
                int var14 = arg6++;
                arg5[var14] = (byte) (arg5[var14] - arg0[arg1++]);
                int var15 = arg6++;
                arg5[var15] = (byte) (arg5[var15] - arg0[arg1++]);
                int var16 = arg6++;
                arg5[var16] = (byte) (arg5[var16] - arg0[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg1++]);
            }
            arg6 += arg2;
            arg1 += arg4;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZLug;I)V", line = 88)
    public final void method908(int arg0, boolean arg1, class325 arg2, int arg3) {
        class253 var5 = (class253) arg2;
        int var6 = var5.field3424 + arg3 + 1;
        int var7 = var5.field3427 + arg0 + 1;
        int var8 = this.field1595 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3425;
        int var11 = var5.field3426;
        int var12 = this.field1595 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field1595 * var14;
            var10 -= var14;
            var9 += var11 * var14;
            var6 = 1;
        }
        if (this.field1590 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field1590;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var13 += var16;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var12 += var16;
        }
        if (!arg1) {
            method907((byte[]) null, -30, -70, -25, -76, (byte[]) null, 124, 69, 6);
        }
        if ((var7 + var11) >= this.field1595) {
            int var17 = var7 + var11 + 1 - this.field1595;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method914(var9, -4834, var5.field3428, this.field1589, var13, var10, var11, var12, var8);
            this.method906(var7, var6, var11, (byte) -124, var10);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZI[[ZI)V", line = 161)
    public final void method909(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5) {
        opengl var7 = this.field1597.field198;
        int var8 = -91 / ((-arg1 - 78) / 44);
        this.field1597.method243();
        this.field1597.method127(false);
        this.field1597.method158(false);
        this.field1597.method190(-2);
        this.field1597.method159(0);
        this.field1597.method121(1);
        float var9 = 1.0F / (float) (this.field1597.field213 * 128);
        if (arg2) {
            for (int var23 = 0; var23 < this.field1593; var23++) {
                int var24 = var23 << this.field1592;
                int var25 = var23 + 1 << this.field1592;
                label86: for (int var26 = 0; var26 < this.field1594; var26++) {
                    int var27 = var26 << this.field1592;
                    int var28 = var26 + 1 << this.field1592;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg5) >= (-arg3) && (var29 - arg5) <= arg3) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (var30 - arg0 >= -arg3 && arg3 >= var30 - arg0 && arg4[arg3 + var29 - arg5][var30 + arg3 - arg0]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var9, var9, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var9, (float) (-var23) / var9, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field1596[var26][var23].method1975(-128);
                                    continue label86;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field1593; var10++) {
                int var11 = var10 << this.field1592;
                int var12 = var10 + 1 << this.field1592;
                for (int var13 = 0; var13 < this.field1594; var13++) {
                    int var14 = 0;
                    int var15 = var13 << this.field1592;
                    int var16 = var13 + 1 << this.field1592;
                    class302.field4066.field3938 = 0;
                    for (int var17 = var11; var17 < var12; var17++) {
                        if ((-arg3) <= (var17 - arg0) && arg3 >= (var17 - arg0)) {
                            int var18 = this.field1591.field5745 * var17 + var15;
                            for (int var19 = var15; var19 < var16; var19++) {
                                if (var19 - arg5 >= -arg3 && arg3 >= (var19 - arg5) && arg4[var19 + arg3 - arg5][arg3 + var17 - arg0]) {
                                    short[] var20 = this.field1591.field4067[var18];
                                    if (var20 != null) {
                                        if (this.field1597.field292) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var14++;
                                                class302.field4066.method1877(true, var20[var21]);
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                class302.field4066.method1842(-4, var20[var22]);
                                                var14++;
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var14 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var9, var9, 1.0F);
                        var7.glTranslatef((float) (-var13) / var9, (float) (-var10) / var9, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field1597.field277.method351(5123, class302.field4066.field3882, var14 * 2);
                        this.field1596[var13][var10].method1973(this.field1597.field277, true, var14);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILug;II)V", line = 349)
    public final void method910(int arg0, class325 arg1, int arg2, int arg3) {
        class253 var5 = (class253) arg1;
        int var6 = var5.field3427 + arg2 + 1;
        int var7 = var5.field3424 + arg0 + 1;
        int var8 = this.field1595 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3425;
        int var11 = var5.field3426;
        int var12 = this.field1595 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var7 = 1;
            var8 += this.field1595 * var13;
            var10 -= var13;
        }
        int var14 = arg3;
        if ((var7 + var10) >= this.field1590) {
            int var15 = var7 + var10 + 1 - this.field1590;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var12 += var16;
            var14 = arg3 + var16;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
        }
        if ((var6 + var11) >= this.field1595) {
            int var17 = var6 + var11 + 1 - this.field1595;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method907(var5.field3428, var9, var12, arg3 ^ 0xFFFFFFA5, var14, this.field1589, var8, var10, var11);
            this.method906(var6, var7, var11, (byte) -71, var10);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[BIIIII)Z", line = 418)
    private static final boolean method911(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg6 - 1) / arg2);
        int var10 = -((arg2 + arg3 - 1) / arg2);
        int var11 = 61 / ((arg4 - 78) / 48);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg0] == 0) {
                    return true;
                }
                arg0 += arg2;
            }
            int var14 = arg0 - var8;
            if (arg1[var14 - 1] == 0) {
                return true;
            }
            arg0 = arg5 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 465)
    public final void method912(int arg0) {
        this.field1596 = new class306[this.field1594][this.field1593];
        for (int var2 = 0; var2 < this.field1593; var2++) {
            for (int var3 = 0; var3 < this.field1594; var3++) {
                this.field1596[var3][var2] = new class306(this.field1597, this, this.field1591, var3, var2, this.field1592, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != 32671) {
            this.field1595 = -75;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ILug;II)Z", line = 493)
    public final boolean method913(int arg0, class325 arg1, int arg2, int arg3) {
        class253 var5 = (class253) arg1;
        int var6 = var5.field3427 + arg0 + 1;
        int var7 = var5.field3424 + arg2 + 1;
        int var8 = this.field1595 * var7 + var6;
        int var9 = var5.field3425;
        int var10 = var5.field3426;
        int var11 = this.field1595 - var10;
        if (arg3 >= -15) {
            this.field1590 = -59;
        }
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field1595 * var12;
            var9 -= var12;
            var7 = 1;
        }
        if (this.field1590 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field1590;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var10 -= var14;
            var11 += var14;
        }
        if (this.field1595 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field1595;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1595 + var11;
            return method911(var8, this.field1589, var16, var10, -29, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II[B[BIIIII)V", line = 563)
    private static final void method914(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg3[var10001] += arg2[arg0++];
                int var14 = arg8++;
                arg3[var14] += arg2[arg0++];
                int var15 = arg8++;
                arg3[var15] += arg2[arg0++];
                int var16 = arg8++;
                arg3[var16] += arg2[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg3[var10001] += arg2[arg0++];
            }
            arg0 += arg4;
            arg8 += arg7;
        }
        if (arg1 != -4834) {
            method914(105, 120, (byte[]) null, (byte[]) null, 111, -111, 69, 116, -108);
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lhd;Lag;)V", line = 604)
    public class110(class17 arg0, class302 arg1) {
        this.field1597 = arg0;
        this.field1591 = arg1;
        this.field1595 = (this.field1591.field5745 * this.field1591.field4062 >> this.field1597.field223) + 2;
        this.field1590 = (this.field1591.field5751 * this.field1591.field4062 >> this.field1597.field223) + 2;
        this.field1589 = new byte[this.field1595 * this.field1590];
        this.field1592 = this.field1597.field223 + 7 - this.field1591.field4054;
        this.field1594 = this.field1591.field5745 >> this.field1592;
        this.field1593 = this.field1591.field5751 >> this.field1592;
    }
}
