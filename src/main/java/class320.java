import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class320 {

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lsq;")
    private class96 field4997;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lkg;")
    private class147 field4998;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[B")
    public byte[] field4994;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    private int field4996;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    private int field4995;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    private int field4992;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[[Lwl;")
    private class233[][] field4990;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BI[BIIBI)V", line = 8)
    private static final void method2118(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 > -115) {
            method2126(-30, (byte[]) null, -40, 71, 18, -30, -93, (byte[]) null, -75);
        }
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg4[var10001] += arg2[arg5++];
                int var14 = arg0++;
                arg4[var14] += arg2[arg5++];
                int var15 = arg0++;
                arg4[var15] += arg2[arg5++];
                int var16 = arg0++;
                arg4[var16] += arg2[arg5++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg4[var10001] += arg2[arg5++];
            }
            arg5 += arg6;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILas;I)V", line = 51)
    public final void method2119(byte arg0, int arg1, class84 arg2, int arg3) {
        if (arg0 != -14) {
            this.field4991 = -100;
        }
        class15 var5 = (class15) arg2;
        int var6 = var5.field203 + arg3 + 1;
        int var7 = var5.field204 + arg1 + 1;
        int var8 = this.field4993 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field201;
        int var11 = var5.field200;
        int var12 = this.field4993 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var9 += var11 * var14;
            var8 += this.field4993 * var14;
        }
        if (this.field4991 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field4991;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var11 -= var16;
            var7 = 1;
            var9 += var16;
            var12 += var16;
            var8 += var16;
        }
        if (this.field4993 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field4993;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2118(var8, var11, var5.field202, var10, this.field4994, var9, var13, (byte) -128, var12);
            this.method2123((byte) -50, var6, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZII[[Z)V", line = 122)
    public final void method2120(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5) {
        opengl var7 = this.field4997.field1156;
        this.field4997.method677();
        this.field4997.method667(false);
        this.field4997.method592(false);
        this.field4997.method633(-2);
        this.field4997.method691(arg1);
        this.field4997.method699(1);
        float var8 = 1.0F / (float) (this.field4997.field1172 * 128);
        if (arg2) {
            for (int var9 = 0; var9 < this.field4992; var9++) {
                int var10 = var9 << this.field4996;
                int var11 = var9 + 1 << this.field4996;
                label132: for (int var12 = 0; var12 < this.field4995; var12++) {
                    int var13 = var12 << this.field4996;
                    int var14 = var12 + 1 << this.field4996;
                    for (int var15 = var13; var15 < var14; var15++) {
                        if ((-arg3) <= (var15 - arg0) && var15 - arg0 <= arg3) {
                            for (int var16 = var10; var16 < var11; var16++) {
                                if (-arg3 <= var16 - arg4 && arg3 >= var16 - arg4 && arg5[var15 + arg3 - arg0][var16 + arg3 - arg4]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field4990[var12][var9].method1651(112);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field4992; var17++) {
                int var18 = var17 << this.field4996;
                int var19 = var17 + 1 << this.field4996;
                for (int var20 = 0; var20 < this.field4995; var20++) {
                    int var21 = 0;
                    int var22 = var20 << this.field4996;
                    int var23 = var20 + 1 << this.field4996;
                    class186 var24 = class147.field2302;
                    var24.field3044 = 0;
                    for (int var25 = var18; var25 < var19; var25++) {
                        if ((-arg3) <= (var25 - arg4) && var25 - arg4 <= arg3) {
                            int var26 = this.field4998.field2036 * var25 + var22;
                            for (int var27 = var22; var27 < var23; var27++) {
                                if ((var27 - arg0) >= (-arg3) && arg3 >= (var27 - arg0) && arg5[var27 + arg3 - arg0][arg3 + var25 - arg4]) {
                                    short[] var28 = this.field4998.field2292[var26];
                                    if (var28 != null) {
                                        if (this.field4997.field1280) {
                                            for (int var30 = 0; var30 < var28.length; var30++) {
                                                var24.method1283(8, var28[var30] & 0xFFFF);
                                                var21++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var28.length; var29++) {
                                                var24.method1319(7, var28[var29] & 0xFFFF);
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
                        this.field4990[var20][var17].method1653(var24.field3066, 5123, -27199, var21);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BZIII)Z", line = 309)
    private static final boolean method2121(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg6 + arg5 - 1) / arg6);
        int var10 = -((arg4 + arg6 - 1) / arg6);
        if (arg3) {
            return true;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg1] == 0) {
                    return true;
                }
                arg1 += arg6;
            }
            int var13 = arg1 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg0 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Las;IIZ)V", line = 358)
    public final void method2122(class84 arg0, int arg1, int arg2, boolean arg3) {
        class15 var5 = (class15) arg0;
        int var6 = var5.field203 + arg2 + 1;
        int var7 = var5.field204 + arg1 + 1;
        int var8 = this.field4993 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field201;
        int var11 = var5.field200;
        int var12 = this.field4993 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field4993 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (arg3) {
            method2118(-43, -79, (byte[]) null, 88, (byte[]) null, -83, -16, (byte) -87, -32);
        }
        if (var6 + var10 >= this.field4991) {
            int var15 = var6 + var10 + (1 - this.field4991);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var14 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field4993) {
            int var17 = var7 + var11 + 1 - this.field4993;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method2126(var8, this.field4994, var9, -1, var10, var11, var12, var5.field202, var14);
            this.method2123((byte) -112, var6, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)V", line = 426)
    private final void method2123(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field4990 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 - (1 - arg4) - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        if (arg0 > -23) {
            this.method2125((byte) 112);
        }
        int var9 = arg1 - (1 - arg3) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class233[] var11 = this.field4990[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3898 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Las;III)Z", line = 464)
    public final boolean method2124(class84 arg0, int arg1, int arg2, int arg3) {
        class15 var5 = (class15) arg0;
        int var6 = var5.field204 + arg1 + arg3;
        int var7 = var5.field203 + arg2 + 1;
        int var8 = this.field4993 * var7 + var6;
        int var9 = var5.field201;
        int var10 = var5.field200;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var8 += this.field4993 * var11;
            var7 = 1;
        }
        int var12 = this.field4993 - var10;
        if (this.field4991 <= (var7 + var9)) {
            int var13 = var9 + var7 + 1 - this.field4991;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var12 += var14;
            var8 += var14;
            var6 = 1;
            var10 -= var14;
        }
        if (this.field4993 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field4993;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4993 + var12;
            return method2121(var17, var8, this.field4994, false, var10, var9, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 535)
    public final void method2125(byte arg0) {
        this.field4990 = new class233[this.field4995][this.field4992];
        for (int var2 = 0; var2 < this.field4992; var2++) {
            for (int var3 = 0; var3 < this.field4995; var3++) {
                this.field4990[var3][var2] = new class233(this.field4997, this, this.field4998, var3, var2, this.field4996, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        int var4 = 112 / ((arg0 + 50) / 60);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lsq;Lkg;)V", line = 560)
    public class320(class96 arg0, class147 arg1) {
        this.field4997 = arg0;
        this.field4998 = arg1;
        this.field4993 = (this.field4998.field2297 * this.field4998.field2036 >> this.field4997.field1171) + 2;
        this.field4991 = (this.field4998.field2297 * this.field4998.field2040 >> this.field4997.field1171) + 2;
        this.field4994 = new byte[this.field4993 * this.field4991];
        this.field4996 = this.field4997.field1171 + 7 - this.field4998.field2298;
        this.field4995 = this.field4998.field2036 >> this.field4996;
        this.field4992 = this.field4998.field2040 >> this.field4996;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BIIIII[BI)V", line = 576)
    private static final void method2126(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        if (arg3 != -1) {
            return;
        }
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg1[var10001] = (byte) (arg1[var10001] - arg7[arg2++]);
                int var14 = arg0++;
                arg1[var14] = (byte) (arg1[var14] - arg7[arg2++]);
                int var15 = arg0++;
                arg1[var15] = (byte) (arg1[var15] - arg7[arg2++]);
                int var16 = arg0++;
                arg1[var16] = (byte) (arg1[var16] - arg7[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg1[var10001] = (byte) (arg1[var10001] - arg7[arg2++]);
            }
            arg2 += arg8;
            arg0 += arg6;
        }
    }
}
