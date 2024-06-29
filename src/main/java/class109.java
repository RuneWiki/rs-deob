import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class109 {

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lka;")
    private class140 field1521;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Lfu;")
    private class42 field1526;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "[B")
    public byte[] field1524;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "[[Lni;")
    private class78[][] field1523;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([BIIIIII[BI)V")
    private static final void method860(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (arg3 != 19943) {
            return;
        }
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg7[var10001] = (byte) (arg7[var10001] - arg0[arg6++]);
                int var14 = arg1++;
                arg7[var14] = (byte) (arg7[var14] - arg0[arg6++]);
                int var15 = arg1++;
                arg7[var15] = (byte) (arg7[var15] - arg0[arg6++]);
                int var16 = arg1++;
                arg7[var16] = (byte) (arg7[var16] - arg0[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg7[var10001] = (byte) (arg7[var10001] - arg0[arg6++]);
            }
            arg6 += arg8;
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
    private final void method861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1523 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg4 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg1 + arg2 - 1 - 1 >> 7;
        if (arg0 != 0) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class78[] var11 = this.field1523[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1158 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public final void method862(byte arg0) {
        if (arg0 != 110) {
            method867(100, 39, 87, 126, 47, (byte[]) null, -15, 38, (byte[]) null);
        }
        this.field1523 = new class78[this.field1525][this.field1529];
        for (int var2 = 0; var2 < this.field1529; var2++) {
            for (int var3 = 0; var3 < this.field1525; var3++) {
                this.field1523[var3][var2] = new class78(this.field1526, this, this.field1521, var3, var2, this.field1528, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILdh;I)Z")
    public final boolean method863(int arg0, int arg1, class183 arg2, int arg3) {
        class451 var5 = (class451) arg2;
        int var6 = var5.field6419 + arg3 + 1;
        int var7 = var5.field6415 + arg0 + 1;
        int var8 = this.field1527 * var7 + var6;
        if (arg1 != 13823) {
            this.method868(-41, (class183) null, (byte) -125, 9);
        }
        int var9 = var5.field6416;
        int var10 = var5.field6417;
        int var11 = this.field1527 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field1527 * var12;
            var9 -= var12;
            var7 = 1;
        }
        if (this.field1522 <= var7 + var9) {
            int var13 = var7 + var9 + 1 - this.field1522;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var11 += var14;
            var8 += var14;
        }
        if (this.field1527 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field1527;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1527 + var11;
            return method865(var8, this.field1524, var9, 104, var10, var17, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[[ZIIZI)V")
    public final void method864(int arg0, boolean[][] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 >= -90) {
            this.method868(69, (class183) null, (byte) 17, -3);
        }
        opengl var7 = this.field1526.field557;
        this.field1526.method344();
        this.field1526.method339(false);
        this.field1526.method388(false);
        this.field1526.method347(-2);
        this.field1526.method421(0);
        this.field1526.method349(1);
        float var8 = 1.0F / (float) (this.field1526.field578 * 128);
        if (arg4) {
            for (int var9 = 0; var9 < this.field1529; var9++) {
                int var10 = var9 << this.field1528;
                int var11 = var9 + 1 << this.field1528;
                label134: for (int var12 = 0; var12 < this.field1525; var12++) {
                    int var13 = var12 << this.field1528;
                    int var14 = var12 + 1 << this.field1528;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if ((var15 - arg0) >= (-arg3) && arg3 >= (var15 - arg0)) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if (var16 - arg5 >= -arg3 && var16 - arg5 <= arg3 && arg1[arg3 + var15 - arg0][arg3 + var16 - arg5]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field1523[var12][var9].method684((byte) -127);
                                    continue label134;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1529; var17++) {
                int var18 = var17 << this.field1528;
                int var19 = var17 + 1 << this.field1528;
                for (int var20 = 0; var20 < this.field1525; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field1528;
                    int var23 = var20 + 1 << this.field1528;
                    class161 var24 = class140.field1940;
                    var24.field2298 = 0;
                    for (int var25 = var18; var25 < var19; var25++) {
                        if ((-arg3) <= (var25 - arg5) && arg3 >= var25 - arg5) {
                            int var26 = this.field1521.field3518 * var25 + var22;
                            for (int var27 = var22; var27 < var23; var27++) {
                                if ((var27 - arg0) >= (-arg3) && arg3 >= (var27 - arg0) && arg1[arg3 + var27 - arg0][var25 + arg3 - arg5]) {
                                    short[] var28 = this.field1521.field1948[var26];
                                    if (var28 != null) {
                                        if (this.field1526.field622) {
                                            for (int var29 = 0; var29 < var28.length; var29++) {
                                                var21++;
                                                var24.method1173(var28[var29] & 0xFFFF, (byte) 124);
                                            }
                                        } else {
                                            for (int var30 = 0; var30 < var28.length; var30++) {
                                                var24.method1196(var28[var30] & 0xFFFF, (byte) -126);
                                                var21++;
                                            }
                                        }
                                    }
                                }
                                var26++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var20) / var8, (float) (-var17) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field1523[var20][var17].method687(var21, -1, var24.field2262, 5123);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[BIIIII)Z")
    private static final boolean method865(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg2 - (1 - arg6)) / arg6);
        int var10 = -((arg4 + arg6 - 1) / arg6);
        int var11 = var9;
        if (arg3 <= 102) {
            method865(-30, (byte[]) null, 114, 122, -113, -25, 73);
        }
        while (var11 < 0) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg0] == 0) {
                    return true;
                }
                arg0 += arg6;
            }
            int var13 = arg0 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg5 + var13;
            var11++;
        }
        return false;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLdh;II)V")
    public final void method866(byte arg0, class183 arg1, int arg2, int arg3) {
        class451 var5 = (class451) arg1;
        int var6 = var5.field6415 + arg3 + 1;
        int var7 = var5.field6419 + arg2 + 1;
        int var8 = this.field1527 * var6 + var7;
        int var9 = 0;
        int var10 = 24 / ((-arg0 - 66) / 59);
        int var11 = var5.field6416;
        int var12 = var5.field6417;
        int var13 = this.field1527 - var12;
        int var14 = 0;
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var6 = 1;
            var11 -= var15;
            var9 += var12 * var15;
            var8 += this.field1527 * var15;
        }
        if ((var6 + var11) >= this.field1522) {
            int var16 = var11 + var6 + 1 - this.field1522;
            var11 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var12 -= var17;
            var14 += var17;
            var7 = 1;
            var9 += var17;
            var8 += var17;
            var13 += var17;
        }
        if (this.field1527 <= var7 + var12) {
            int var18 = var12 + var7 + 1 - this.field1527;
            var14 += var18;
            var12 -= var18;
            var13 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            method867(var12, var13, var8, var14, var11, this.field1524, -35, var9, var5.field6418);
            this.method861(0, var11, var6, var7, var12);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII[BII[B)V")
    private static final void method867(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, byte[] arg8) {
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg5[var10001] += arg8[arg7++];
                int var14 = arg2++;
                arg5[var14] += arg8[arg7++];
                int var15 = arg2++;
                arg5[var15] += arg8[arg7++];
                int var16 = arg2++;
                arg5[var16] += arg8[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg5[var10001] += arg8[arg7++];
            }
            arg2 += arg1;
            arg7 += arg3;
        }
        if (arg6 < -25) {
            ;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILdh;BI)V")
    public final void method868(int arg0, class183 arg1, byte arg2, int arg3) {
        class451 var5 = (class451) arg1;
        if (arg2 <= 91) {
            return;
        }
        int var6 = var5.field6419 + arg3 + 1;
        int var7 = var5.field6415 + arg0 + 1;
        int var8 = this.field1527 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6416;
        int var11 = var5.field6417;
        int var12 = this.field1527 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field1527 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field1522) {
            int var15 = var7 + var10 + 1 - this.field1522;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
            var8 += var16;
            var6 = 1;
            var9 += var16;
        }
        if (this.field1527 <= (var6 + var11)) {
            int var17 = var6 + var11 - (-1 - -this.field1527);
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method860(var5.field6418, var8, var12, 19943, var10, var11, var9, this.field1524, var13);
            this.method861(0, var10, var7, var6, var11);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lfu;Lka;)V")
    public class109(class42 arg0, class140 arg1) {
        this.field1521 = arg1;
        this.field1526 = arg0;
        this.field1527 = (this.field1521.field3518 * this.field1521.field1943 >> this.field1526.field570) + 2;
        this.field1522 = (this.field1521.field3517 * this.field1521.field1943 >> this.field1526.field570) + 2;
        this.field1528 = this.field1526.field570 + 7 - this.field1521.field1952;
        this.field1524 = new byte[this.field1527 * this.field1522];
        this.field1525 = this.field1521.field3518 >> this.field1528;
        this.field1529 = this.field1521.field3517 >> this.field1528;
    }
}
