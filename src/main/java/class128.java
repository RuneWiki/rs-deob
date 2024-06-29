import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class128 {

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Lkk;")
    private class371 field1779;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Lnf;")
    private class256 field1781;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field1775;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    private int field1780;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    private int field1782;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "[B")
    public byte[] field1776;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "[[Lbp;")
    private class46[][] field1783;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III[BBII)Z", line = 5)
    private static final boolean method806(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, int arg5, int arg6) {
        int var7 = arg5 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        if (arg4 != -115) {
            return false;
        }
        int var9 = -((arg1 + arg2 - 1) / arg2);
        int var10 = -((arg2 + arg5 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg0] == 0) {
                    return true;
                }
                arg0 += arg2;
            }
            int var13 = arg0 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([[ZIIIIZ)V", line = 54)
    public final void method807(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        opengl var7 = this.field1781.field3634;
        this.field1781.method1716();
        this.field1781.method1636(false);
        this.field1781.method1667(false);
        this.field1781.method1722(-2);
        this.field1781.method1745(0);
        this.field1781.method1701(1);
        float var8 = 1.0F / (float) (this.field1781.field3645 * 128);
        if (arg5) {
            for (int var9 = 0; var9 < this.field1778; var9++) {
                int var10 = var9 << this.field1782;
                int var11 = var9 + 1 << this.field1782;
                label130: for (int var12 = 0; var12 < this.field1777; var12++) {
                    int var13 = var12 << this.field1782;
                    int var14 = var12 + 1 << this.field1782;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if ((-arg3) <= (var15 - arg4) && arg3 >= (var15 - arg4)) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if (-arg3 <= var16 - arg2 && arg3 >= var16 - arg2 && arg0[arg3 + var15 - arg4][arg3 + var16 - arg2]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field1783[var12][var9].method329(-126);
                                    continue label130;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1778; var17++) {
                int var18 = var17 << this.field1782;
                int var19 = var17 + 1 << this.field1782;
                for (int var20 = 0; var20 < this.field1777; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field1782;
                    int var23 = var20 + 1 << this.field1782;
                    class371.field5379.field3029 = 0;
                    for (int var24 = var18; var24 < var19; var24++) {
                        if ((-arg3) <= (var24 - arg2) && var24 - arg2 <= arg3) {
                            int var25 = this.field1779.field5084 * var24 + var22;
                            for (int var26 = var22; var26 < var23; var26++) {
                                if (var26 - arg4 >= -arg3 && arg3 >= (var26 - arg4) && arg0[var26 + arg3 - arg4][var24 + arg3 - arg2]) {
                                    short[] var27 = this.field1779.field5374[var25];
                                    if (var27 != null) {
                                        if (this.field1781.field3663) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var21++;
                                                class371.field5379.method1326(var27[var29], 46);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var21++;
                                                class371.field5379.method1359((byte) -107, var27[var28]);
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var21 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var20) / var8, (float) (-var17) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field1781.field3757.method141(5123, class371.field5379.field3040, var21 * 2);
                        this.field1783[var20][var17].method327(true, var21, this.field1781.field3757);
                    }
                }
            }
        }
        var7.glMatrixMode(arg1);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[B[BIII)V", line = 236)
    private static final void method808(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        int var11 = -arg0;
        int var12 = 26 % ((arg8 + 54) / 37);
        while (var11 < 0) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg7++;
                arg5[var10001] += arg4[arg1++];
                int var15 = arg7++;
                arg5[var15] += arg4[arg1++];
                int var16 = arg7++;
                arg5[var16] += arg4[arg1++];
                int var17 = arg7++;
                arg5[var17] += arg4[arg1++];
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg7++;
                arg5[var10001] += arg4[arg1++];
            }
            arg1 += arg3;
            arg7 += arg2;
            var11++;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V", line = 278)
    private final void method809(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1783 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg0 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class46[] var11 = this.field1783[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field650 = true;
            }
        }
        if (arg4 > -51) {
            method806(-34, -43, -22, (byte[]) null, (byte) 12, -52, 78);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILri;Z)V", line = 317)
    public final void method810(int arg0, int arg1, class98 arg2, boolean arg3) {
        class132 var5 = (class132) arg2;
        if (arg3) {
            return;
        }
        int var6 = var5.field1855 + arg0 + 1;
        int var7 = var5.field1856 + arg1 + 1;
        int var8 = this.field1775 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1858;
        int var11 = var5.field1857;
        int var12 = this.field1775 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field1775 * var14;
            var10 -= var14;
        }
        if (this.field1780 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field1780;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var13 += var16;
            var9 += var16;
        }
        if (this.field1775 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field1775;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method811(var5.field1859, var9, var12, var8, this.field1776, var11, var10, 8, var13);
            this.method809(var10, var7, var6, var11, -82);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BIII[BIIII)V", line = 394)
    private static final void method811(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        if (arg7 != 8) {
            return;
        }
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg4[var10001] = (byte) (arg4[var10001] - arg0[arg1++]);
                int var14 = arg3++;
                arg4[var14] = (byte) (arg4[var14] - arg0[arg1++]);
                int var15 = arg3++;
                arg4[var15] = (byte) (arg4[var15] - arg0[arg1++]);
                int var16 = arg3++;
                arg4[var16] = (byte) (arg4[var16] - arg0[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg4[var10001] = (byte) (arg4[var10001] - arg0[arg1++]);
            }
            arg1 += arg8;
            arg3 += arg2;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIILri;)Z", line = 437)
    public final boolean method812(boolean arg0, int arg1, int arg2, class98 arg3) {
        class132 var5 = (class132) arg3;
        int var6 = var5.field1856 + arg1 + 1;
        int var7 = var5.field1855 + arg2 + 1;
        int var8 = var7 + (this.field1775 * var6);
        int var9 = var5.field1858;
        int var10 = var5.field1857;
        if (!arg0) {
            return false;
        }
        int var11 = this.field1775 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var8 += this.field1775 * var12;
            var6 = 1;
        }
        if (this.field1780 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field1780;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var11 += var14;
            var7 = 1;
            var8 += var14;
            var10 -= var14;
        }
        if (this.field1775 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field1775;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1775 + var11;
            return method806(var8, var9, var16, this.field1776, (byte) -115, var10, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 509)
    public final void method813(int arg0) {
        this.field1783 = new class46[this.field1777][this.field1778];
        int var2 = 44 % ((83 - arg0) / 42);
        for (int var3 = 0; var3 < this.field1778; var3++) {
            for (int var4 = 0; var4 < this.field1777; var4++) {
                this.field1783[var4][var3] = new class46(this.field1781, this, this.field1779, var4, var3, this.field1782, var4 * 128 + 1, var3 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lnf;Lkk;)V", line = 534)
    public class128(class256 arg0, class371 arg1) {
        this.field1779 = arg1;
        this.field1781 = arg0;
        this.field1775 = (this.field1779.field5380 * this.field1779.field5084 >> this.field1781.field3650) + 2;
        this.field1780 = (this.field1779.field5380 * this.field1779.field5085 >> this.field1781.field3650) + 2;
        this.field1782 = this.field1781.field3650 + 7 - this.field1779.field5378;
        this.field1776 = new byte[this.field1780 * this.field1775];
        this.field1777 = this.field1779.field5084 >> this.field1782;
        this.field1778 = this.field1779.field5085 >> this.field1782;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLri;II)V", line = 551)
    public final void method814(boolean arg0, class98 arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field1778 = -13;
        }
        class132 var5 = (class132) arg1;
        int var6 = var5.field1855 + arg3 + 1;
        int var7 = var5.field1856 + arg2 + 1;
        int var8 = this.field1775 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field1858;
        int var11 = var5.field1857;
        int var12 = this.field1775 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field1775 * var13;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field1780) {
            int var15 = var10 + var7 + 1 - this.field1780;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field1775) {
            int var17 = var11 + var6 + 1 - this.field1775;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method808(var10, var9, var12, var14, var5.field1859, this.field1776, var11, var8, -17);
            this.method809(var10, var7, var6, var11, -68);
        }
    }
}
