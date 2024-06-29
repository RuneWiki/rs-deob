import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class293 {

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lcg;")
    private class393 field4458;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lpj;")
    private class156 field4463;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    private int field4460;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[B")
    public byte[] field4455;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    private int field4459;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    private int field4456;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[[Lpc;")
    private class22[][] field4461;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III[BIIII[B)V")
    private static final void method1820(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg7 != 1) {
            method1820(-112, -98, 95, (byte[]) null, -125, -52, 57, -72, (byte[]) null);
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg8[var10001] += arg3[arg4++];
                int var14 = arg6++;
                arg8[var14] += arg3[arg4++];
                int var15 = arg6++;
                arg8[var15] += arg3[arg4++];
                int var16 = arg6++;
                arg8[var16] += arg3[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg8[var10001] += arg3[arg4++];
            }
            arg4 += arg1;
            arg6 += arg2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([[ZZIIBI)V")
    public final void method1821(boolean[][] arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        opengl var7 = this.field4458.field5783;
        this.field4458.method2434();
        this.field4458.method2486(false);
        this.field4458.method2465(false);
        this.field4458.method2474(-2);
        this.field4458.method2467(0);
        this.field4458.method2424(1);
        float var8 = 1.0F / (float) (this.field4458.field5787 * 128);
        if (arg1) {
            for (int var23 = 0; var23 < this.field4456; var23++) {
                int var24 = var23 << this.field4462;
                int var25 = var23 + 1 << this.field4462;
                label88: for (int var26 = 0; var26 < this.field4459; var26++) {
                    int var27 = var26 << this.field4462;
                    int var28 = var26 + 1 << this.field4462;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if (-arg5 <= var29 - arg2 && arg5 >= var29 - arg2) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (-arg5 <= var30 - arg3 && (var30 - arg3) <= arg5 && arg0[var29 - (arg2 - arg5)][arg5 + var30 - arg3]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field4461[var26][var23].method144(-81);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field4456; var9++) {
                int var10 = var9 << this.field4462;
                int var11 = var9 + 1 << this.field4462;
                for (int var12 = 0; var12 < this.field4459; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field4462;
                    int var15 = var12 + 1 << this.field4462;
                    class385 var16 = class156.field2169;
                    var16.field5666 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((var17 - arg3) >= (-arg5) && (var17 - arg3) <= arg5) {
                            int var18 = this.field4463.field1906 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (-arg5 <= var19 - arg2 && var19 - arg2 <= arg5 && arg0[var19 + arg5 - arg2][arg5 + var17 - arg3]) {
                                    short[] var20 = this.field4463.field2164[var18];
                                    if (var20 != null) {
                                        if (this.field4458.field5879) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var16.method2377(var20[var22] & 0xFFFF, -26);
                                                var13++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var13++;
                                                var16.method2329(var20[var21] & 0xFFFF, -70);
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        var7.glMatrixMode(5890);
                        var7.glLoadIdentity();
                        var7.glScalef(var8, var8, 1.0F);
                        var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        var7.glMatrixMode(5888);
                        this.field4461[var12][var9].method143(var13, 5123, var16.field5685, (byte) 105);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        if (arg4 > -95) {
            this.field4463 = (class156) null;
        }
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBI[BII)Z")
    private static final boolean method1822(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int var7 = arg0 % arg3;
        if (arg2 >= -57) {
            return true;
        }
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg5 - 1) / arg3);
        int var10 = -((arg0 + arg3 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var13 = arg1 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lqn;ZII)V")
    public final void method1823(class380 arg0, boolean arg1, int arg2, int arg3) {
        class123 var5 = (class123) arg0;
        int var6 = var5.field1601 + arg3 + 1;
        if (!arg1) {
            this.method1827(-120, -1, -103, 55, -19);
        }
        int var7 = var5.field1602 + arg2 + 1;
        int var8 = var6 + (this.field4457 * var7);
        int var9 = 0;
        int var10 = var5.field1603;
        int var11 = var5.field1604;
        int var12 = this.field4457 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var8 += this.field4457 * var14;
            var9 += var11 * var14;
        }
        if (var7 + var10 >= this.field4460) {
            int var15 = var7 - this.field4460 - (-var10 + -1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var6 = 1;
            var9 += var16;
            var13 += var16;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field4457) {
            int var17 = var11 + var6 + 1 - this.field4457;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1826(var13, var8, var5.field1605, -24868, var11, var10, this.field4455, var12, var9);
            this.method1827(var10, 39, var6, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILqn;I)V")
    public final void method1824(int arg0, int arg1, class380 arg2, int arg3) {
        class123 var5 = (class123) arg2;
        int var6 = var5.field1602 + arg1 + 1;
        int var7 = var5.field1601 + arg3 + 1;
        int var8 = this.field4457 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field1603;
        int var11 = var5.field1604;
        int var12 = this.field4457 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field4457 * var13;
            var10 -= var13;
            var6 = 1;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field4460) {
            int var15 = var6 + var10 + 1 - this.field4460;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var11 -= var16;
            var14 += var16;
            var8 += var16;
            var7 = 1;
            var12 += var16;
        }
        if (this.field4457 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field4457;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1820(var11, var14, var12, var5.field1605, var9, var10, var8, arg0, this.field4455);
            this.method1827(var10, 108, var7, var6, var11);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method1825(byte arg0) {
        this.field4461 = new class22[this.field4459][this.field4456];
        if (arg0 <= 114) {
            return;
        }
        for (int var2 = 0; var2 < this.field4456; var2++) {
            for (int var3 = 0; var3 < this.field4459; var3++) {
                this.field4461[var3][var2] = new class22(this.field4458, this, this.field4463, var3, var2, this.field4462, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[BIII[BII)V")
    private static final void method1826(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg3 != -24868) {
            return;
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg6[var10001] = (byte) (arg6[var10001] - arg2[arg8++]);
                int var14 = arg1++;
                arg6[var14] = (byte) (arg6[var14] - arg2[arg8++]);
                int var15 = arg1++;
                arg6[var15] = (byte) (arg6[var15] - arg2[arg8++]);
                int var16 = arg1++;
                arg6[var16] = (byte) (arg6[var16] - arg2[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg6[var10001] = (byte) (arg6[var10001] - arg2[arg8++]);
            }
            arg8 += arg0;
            arg1 += arg7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    private final void method1827(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field4461 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg0 - 1 - 1 >> 7;
        int var10 = var6;
        if (arg1 < 26) {
            this.method1823((class380) null, false, 78, -102);
        }
        while (var10 <= var7) {
            class22[] var11 = this.field4461[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field301 = true;
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lqn;III)Z")
    public final boolean method1828(class380 arg0, int arg1, int arg2, int arg3) {
        class123 var5 = (class123) arg0;
        int var6 = var5.field1601 + arg1 + 1;
        int var7 = var5.field1602 + arg2 + 1;
        int var8 = this.field4457 * var7 + var6;
        if (arg3 != 1) {
            return false;
        }
        int var9 = var5.field1603;
        int var10 = var5.field1604;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var8 += this.field4457 * var11;
            var7 = 1;
        }
        int var12 = this.field4457 - var10;
        if ((var7 + var9) >= this.field4460) {
            int var13 = var7 + var9 + 1 - this.field4460;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var12 += var14;
            var8 += var14;
        }
        if ((var6 + var10) >= this.field4457) {
            int var15 = var10 + var6 + 1 - this.field4457;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4457 + var12;
            return method1822(var10, var8, (byte) -127, var16, this.field4455, var9, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lcg;Lpj;)V")
    public class293(class393 arg0, class156 arg1) {
        this.field4458 = arg0;
        this.field4463 = arg1;
        this.field4457 = (this.field4463.field2168 * this.field4463.field1906 >> this.field4458.field5797) + 2;
        this.field4460 = (this.field4463.field2168 * this.field4463.field1908 >> this.field4458.field5797) + 2;
        this.field4455 = new byte[this.field4460 * this.field4457];
        this.field4462 = this.field4458.field5797 + 7 - this.field4463.field2173;
        this.field4459 = this.field4463.field1906 >> this.field4462;
        this.field4456 = this.field4463.field1908 >> this.field4462;
    }
}
