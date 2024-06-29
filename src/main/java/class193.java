import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class193 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lhj;")
    private class338 field2678;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ldl;")
    private class39 field2682;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[B")
    public byte[] field2683;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[[Lwq;")
    private class93[][] field2676;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lek;BII)V", line = 6)
    public final void method1277(class294 arg0, byte arg1, int arg2, int arg3) {
        class385 var5 = (class385) arg0;
        int var6 = var5.field5619 + arg2 + 1;
        int var7 = var5.field5618 + arg3 + 1;
        int var8 = this.field2680 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5620;
        int var11 = var5.field5617;
        int var12 = this.field2680 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field2680 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field2677) {
            int var15 = var6 + var10 + 1 - this.field2677;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var12 += var16;
            var8 += var16;
            var7 = 1;
            var14 += var16;
            var11 -= var16;
        }
        if ((var7 + var11) >= this.field2680) {
            int var17 = var7 + var11 + 1 - this.field2680;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0 && arg1 > 21) {
            method1284(var9, this.field2683, var14, var11, var8, var10, (byte) -128, var12, var5.field5616);
            this.method1278(var11, var6, -3405, var10, var7);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V", line = 78)
    private final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2676 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 + arg0 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        if (arg2 != -3405) {
            this.field2680 = -79;
        }
        int var9 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class93[] var11 = this.field2676[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1395 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILek;IB)V", line = 117)
    public final void method1279(int arg0, class294 arg1, int arg2, byte arg3) {
        class385 var5 = (class385) arg1;
        int var6 = var5.field5618 + arg2 + 1;
        int var7 = var5.field5619 + arg0 + 1;
        int var8 = this.field2680 * var7 + var6;
        int var9 = -5 % ((arg3 + 45) / 51);
        int var10 = 0;
        int var11 = var5.field5620;
        int var12 = var5.field5617;
        int var13 = this.field2680 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var10 += var12 * var15;
            var11 -= var15;
            var7 = 1;
            var8 += this.field2680 * var15;
        }
        if (var7 + var11 >= this.field2677) {
            int var16 = var7 + var11 + 1 - this.field2677;
            var11 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var6 = 1;
            var10 += var17;
            var12 -= var17;
            var8 += var17;
            var14 += var17;
            var13 += var17;
        }
        if ((var6 + var12) >= this.field2680) {
            int var18 = var6 + var12 + 1 - this.field2680;
            var13 += var18;
            var12 -= var18;
            var14 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            method1280(96, var14, var10, var8, var12, this.field2683, var13, var5.field5616, var11);
            this.method1278(var12, var7, -3405, var11, var6);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII[BI[BI)V", line = 189)
    private static final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        int var11 = -arg8;
        if (arg0 <= 95) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg5[var10001] = (byte) (arg5[var10001] - arg7[arg2++]);
                int var14 = arg3++;
                arg5[var14] = (byte) (arg5[var14] - arg7[arg2++]);
                int var15 = arg3++;
                arg5[var15] = (byte) (arg5[var15] - arg7[arg2++]);
                int var16 = arg3++;
                arg5[var16] = (byte) (arg5[var16] - arg7[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg5[var10001] = (byte) (arg5[var10001] - arg7[arg2++]);
            }
            arg2 += arg1;
            arg3 += arg6;
            var11++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BZIIIII)Z", line = 232)
    private static final boolean method1281(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!arg1) {
            return false;
        }
        int var7 = arg5 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg2 + arg3 - 1) / arg2);
        int var10 = -((arg5 + arg2 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg4] == 0) {
                    return true;
                }
                arg4 += arg2;
            }
            int var13 = arg4 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 279)
    public final void method1282(int arg0) {
        this.field2676 = new class93[this.field2684][this.field2679];
        for (int var2 = 0; var2 < this.field2679; var2++) {
            for (int var3 = 0; var3 < this.field2684; var3++) {
                this.field2676[var3][var2] = new class93(this.field2678, this, this.field2682, var3, var2, this.field2681, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 < 119) {
            this.field2683 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[[ZIZI)V", line = 310)
    public final void method1283(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5) {
        opengl var7 = this.field2678.field4607;
        this.field2678.method2150();
        this.field2678.method2147(false);
        int var8 = -126 % ((91 - arg5) / 33);
        this.field2678.method2133(false);
        this.field2678.method2146(-2);
        this.field2678.method2129(0);
        this.field2678.method2125(1);
        float var9 = 1.0F / (float) (this.field2678.field4621 * 128);
        if (arg4) {
            for (int var10 = 0; var10 < this.field2679; var10++) {
                int var11 = var10 << this.field2681;
                int var12 = var10 + 1 << this.field2681;
                label131: for (int var13 = 0; var13 < this.field2684; var13++) {
                    int var14 = var13 << this.field2681;
                    int var15 = var13 + 1 << this.field2681;
                    for (int var16 = var14; var16 < var15; var16++) {
                        if (-arg0 <= var16 - arg3 && var16 - arg3 <= arg0) {
                            for (int var17 = var11; var17 < var12; var17++) {
                                if (var17 - arg1 >= -arg0 && arg0 >= (var17 - arg1) && arg2[var16 + arg0 - arg3][arg0 + var17 - arg1]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var9, var9, 1.0F);
                                    var7.glTranslatef((float) (-var13) / var9, (float) (-var10) / var9, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field2676[var13][var10].method636(-3013);
                                    continue label131;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < this.field2679; var18++) {
                int var19 = var18 << this.field2681;
                int var20 = var18 + 1 << this.field2681;
                for (int var21 = 0; var21 < this.field2684; var21++) {
                    int var22 = 0;
                    int var23 = var21 << this.field2681;
                    int var24 = var21 + 1 << this.field2681;
                    class371 var25 = class39.field577;
                    var25.field5273 = 0;
                    for (int var26 = var19; var26 < var20; var26++) {
                        if ((-arg0) <= (var26 - arg1) && (var26 - arg1) <= arg0) {
                            int var27 = this.field2682.field2207 * var26 + var23;
                            for (int var28 = var23; var28 < var24; var28++) {
                                if ((-arg0) <= (var28 - arg3) && arg0 >= var28 - arg3 && arg2[var28 + arg0 - arg3][var26 + arg0 - arg1]) {
                                    short[] var29 = this.field2682.field589[var27];
                                    if (var29 != null) {
                                        if (this.field2678.field4640) {
                                            for (int var31 = 0; var31 < var29.length; var31++) {
                                                var25.method2416(22064, var29[var31] & 0xFFFF);
                                                var22++;
                                            }
                                        } else {
                                            for (int var30 = 0; var30 < var29.length; var30++) {
                                                var25.method2426(-1882601528, var29[var30] & 0xFFFF);
                                                var22++;
                                            }
                                        }
                                    }
                                }
                                var27++;
                            }
                        }
                    }
                    if (var22 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var9, var9, 1.0F);
                        var7.glTranslatef((float) (-var21) / var9, (float) (-var18) / var9, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field2676[var21][var18].method635(5123, var22, -128, var25.field5258);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BIIIIBI[B)V", line = 496)
    private static final void method1284(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, byte[] arg8) {
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        if (arg6 > -114) {
            return;
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg1[var10001] += arg8[arg0++];
                int var14 = arg4++;
                arg1[var14] += arg8[arg0++];
                int var15 = arg4++;
                arg1[var15] += arg8[arg0++];
                int var16 = arg4++;
                arg1[var16] += arg8[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg1[var10001] += arg8[arg0++];
            }
            arg4 += arg7;
            arg0 += arg2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILek;II)Z", line = 539)
    public final boolean method1285(int arg0, class294 arg1, int arg2, int arg3) {
        class385 var5 = (class385) arg1;
        int var6 = var5.field5618 + arg2 + 1;
        int var7 = var5.field5619 + arg0 + 1;
        int var8 = this.field2680 * var7 + var6;
        if (arg3 != -6480) {
            this.method1285(-10, (class294) null, 4, -52);
        }
        int var9 = var5.field5620;
        int var10 = var5.field5617;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var8 += this.field2680 * var11;
            var7 = 1;
            var9 -= var11;
        }
        int var12 = this.field2680 - var10;
        if (this.field2677 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field2677;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var12 += var14;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field2680 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field2680;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2680 + var12;
            return method1281(this.field2683, true, var16, var9, var8, var10, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lhj;Ldl;)V", line = 609)
    public class193(class338 arg0, class39 arg1) {
        this.field2678 = arg0;
        this.field2682 = arg1;
        this.field2680 = (this.field2682.field570 * this.field2682.field2207 >> this.field2678.field4625) + 2;
        this.field2677 = (this.field2682.field570 * this.field2682.field2215 >> this.field2678.field4625) + 2;
        this.field2683 = new byte[this.field2680 * this.field2677];
        this.field2681 = this.field2678.field4625 + 7 - this.field2682.field574;
        this.field2684 = this.field2682.field2207 >> this.field2681;
        this.field2679 = this.field2682.field2215 >> this.field2681;
    }
}
