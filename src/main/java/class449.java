import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class449 {

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Lwa;")
    private class365 field6548;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Lpo;")
    private class332 field6551;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    private int field6552;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "[B")
    public byte[] field6550;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    private int field6555;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    private int field6553;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[[Lic;")
    private class415[][] field6554;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILlg;I)V", line = 6)
    public final void method2784(int arg0, int arg1, class238 arg2, int arg3) {
        class210 var5 = (class210) arg2;
        int var6 = var5.field2831 + arg0 + 1;
        int var7 = var5.field2833 + arg3 + 1;
        int var8 = this.field6547 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2834;
        int var11 = var5.field2830;
        int var12 = this.field6547 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field6547 * var13;
            var10 -= var13;
        }
        int var14 = arg1;
        if (this.field6549 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field6549;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var14 = arg1 + var16;
            var11 -= var16;
            var12 += var16;
            var6 = 1;
        }
        if (var6 + var11 >= this.field6547) {
            int var17 = var6 + var11 + 1 - this.field6547;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2789(var9, var14, var12, var5.field2832, var8, var11, this.field6550, var10, (byte) 50);
            this.method2786(var11, var6, arg1 + 127, var10, var7);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V", line = 76)
    public final void method2785(boolean arg0) {
        this.field6554 = new class415[this.field6555][this.field6553];
        int var2 = 0;
        if (!arg0) {
            this.method2788((class238) null, -44, 120, -26);
        }
        while (var2 < this.field6553) {
            for (int var3 = 0; var3 < this.field6555; var3++) {
                this.field6554[var3][var2] = new class415(this.field6551, this, this.field6548, var3, var2, this.field6552, var3 * 128 + 1, var2 * 128 - -1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V", line = 103)
    private final void method2786(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field6554 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg0 - 1 - 1 >> 7;
        if (arg2 < 13) {
            return;
        }
        int var8 = arg4 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class415[] var11 = this.field6554[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field5978 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[BI[BIII)V", line = 142)
    private static final void method2787(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg8;
        int var12 = -113 / ((53 - arg7) / 60);
        while (var11 < 0) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg6++;
                arg5[var10001] += arg3[arg0++];
                int var15 = arg6++;
                arg5[var15] += arg3[arg0++];
                int var16 = arg6++;
                arg5[var16] += arg3[arg0++];
                int var17 = arg6++;
                arg5[var17] += arg3[arg0++];
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg6++;
                arg5[var10001] += arg3[arg0++];
            }
            arg6 += arg4;
            arg0 += arg2;
            var11++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Llg;III)V", line = 184)
    public final void method2788(class238 arg0, int arg1, int arg2, int arg3) {
        class210 var5 = (class210) arg0;
        int var6 = var5.field2831 + arg1 + 1;
        int var7 = var5.field2833 + arg3 + arg2;
        int var8 = this.field6547 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2834;
        int var11 = var5.field2830;
        int var12 = this.field6547 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var8 += this.field6547 * var14;
            var10 -= var14;
            var7 = 1;
        }
        if ((var7 + var10) >= this.field6549) {
            int var15 = var7 + var10 + 1 - this.field6549;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var13 += var16;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
        }
        if (this.field6547 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field6547;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2787(var9, var11, var13, var5.field2832, var12, this.field6550, var8, -48, var10);
            this.method2786(var11, var6, 66, var10, var7);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[BII[BIB)V", line = 255)
    private static final void method2789(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, byte[] arg6, int arg7, byte arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        if (arg8 != 50) {
            method2789(90, -49, -13, (byte[]) null, 123, -9, (byte[]) null, -39, (byte) -128);
        }
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg6[var10001] = (byte) (arg6[var10001] - arg3[arg0++]);
                int var14 = arg4++;
                arg6[var14] = (byte) (arg6[var14] - arg3[arg0++]);
                int var15 = arg4++;
                arg6[var15] = (byte) (arg6[var15] - arg3[arg0++]);
                int var16 = arg4++;
                arg6[var16] = (byte) (arg6[var16] - arg3[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg6[var10001] = (byte) (arg6[var10001] - arg3[arg0++]);
            }
            arg0 += arg1;
            arg4 += arg2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Llg;III)Z", line = 300)
    public final boolean method2790(class238 arg0, int arg1, int arg2, int arg3) {
        class210 var5 = (class210) arg0;
        int var6 = var5.field2833 + arg2 + 1;
        int var7 = var5.field2831 + arg1 + 1;
        int var8 = -47 % ((arg3 - 31) / 52);
        int var9 = var7 + (this.field6547 * var6);
        int var10 = var5.field2834;
        int var11 = var5.field2830;
        int var12 = this.field6547 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += this.field6547 * var13;
            var10 -= var13;
        }
        if (var6 + var10 >= this.field6549) {
            int var14 = var6 + var10 + 1 - this.field6549;
            var10 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var11 -= var15;
            var12 += var15;
            var9 += var15;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field6547) {
            int var16 = var11 + var7 + 1 - this.field6547;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field6547 + var12;
            return method2792(var17, this.field6550, var11, var10, var18, var9, 112);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIZ[[ZI)V", line = 371)
    public final void method2791(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5) {
        opengl var7 = this.field6551.field4752;
        this.field6551.method2083();
        this.field6551.method2110(false);
        this.field6551.method2063(false);
        this.field6551.method2109(-2);
        this.field6551.method2116(0);
        this.field6551.method2131(arg0);
        float var8 = 1.0F / (float) (this.field6551.field4754 * 128);
        if (arg3) {
            for (int var22 = 0; var22 < this.field6553; var22++) {
                int var23 = var22 << this.field6552;
                int var24 = var22 + 1 << this.field6552;
                label85: for (int var25 = 0; var25 < this.field6555; var25++) {
                    int var26 = var25 << this.field6552;
                    int var27 = var25 + 1 << this.field6552;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg5 >= -arg2 && arg2 >= var28 - arg5) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg1 >= -arg2 && arg2 >= (var29 - arg1) && arg4[arg2 + var28 - arg5][var29 + arg2 - arg1]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var25) / var8, (float) (-var22) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field6554[var25][var22].method2592(24632);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field6553; var9++) {
                int var10 = var9 << this.field6552;
                int var11 = var9 + 1 << this.field6552;
                for (int var12 = 0; var12 < this.field6555; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field6552;
                    int var15 = var12 + 1 << this.field6552;
                    class365.field5300.field2888 = 0;
                    for (int var16 = var10; var16 < var11; var16++) {
                        if ((-arg2) <= (var16 - arg1) && var16 - arg1 <= arg2) {
                            int var17 = this.field6548.field4530 * var16 + var14;
                            for (int var18 = var14; var18 < var15; var18++) {
                                if (var18 - arg5 >= -arg2 && arg2 >= var18 - arg5 && arg4[arg2 + var18 - arg5][arg2 + var16 - arg1]) {
                                    short[] var19 = this.field6548.field5299[var17];
                                    if (var19 != null) {
                                        if (this.field6551.field4779) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var13++;
                                                class365.field5300.method1380(var19[var21], (byte) -8);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                class365.field5300.method1339((byte) 3, var19[var20]);
                                                var13++;
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field6551.field4855.method382(5123, class365.field5300.field2867, var13 * 2);
                        this.field6554[var12][var9].method2593(var13, 103, this.field6551.field4855);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[BIIIII)Z", line = 555)
    private static final boolean method2792(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        if (arg6 <= 14) {
            return false;
        }
        int var9 = -((arg3 + arg0 - 1) / arg0);
        int var10 = -((arg0 + arg2 - 1) / arg0);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg5] == 0) {
                    return true;
                }
                arg5 += arg0;
            }
            int var13 = arg5 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lpo;Lwa;)V", line = 600)
    public class449(class332 arg0, class365 arg1) {
        this.field6548 = arg1;
        this.field6551 = arg0;
        this.field6547 = (this.field6548.field5306 * this.field6548.field4530 >> this.field6551.field4762) + 2;
        this.field6549 = (this.field6548.field5306 * this.field6548.field4531 >> this.field6551.field4762) + 2;
        this.field6552 = this.field6551.field4762 + 7 - this.field6548.field5303;
        this.field6550 = new byte[this.field6549 * this.field6547];
        this.field6555 = this.field6548.field4530 >> this.field6552;
        this.field6553 = this.field6548.field4531 >> this.field6552;
    }
}
