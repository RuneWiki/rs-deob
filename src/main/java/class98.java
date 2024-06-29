import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class98 {

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lic;")
    private class246 field1204;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lto;")
    private class296 field1202;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[B")
    public byte[] field1198;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    private int field1206;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[[Lpk;")
    private class164[][] field1201;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public final void method476(byte arg0) {
        this.field1201 = new class164[this.field1206][this.field1205];
        if (arg0 < 78) {
            this.method483(109, -126, -45, 32, -66);
        }
        for (int var2 = 0; var2 < this.field1205; var2++) {
            for (int var3 = 0; var3 < this.field1206; var3++) {
                this.field1201[var3][var2] = new class164(this.field1204, this, this.field1202, var3, var2, this.field1200, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBLph;I)V")
    public final void method477(int arg0, byte arg1, class125 arg2, int arg3) {
        class447 var5 = (class447) arg2;
        int var6 = var5.field6347 + arg3 + 1;
        int var7 = var5.field6346 + arg0 + 1;
        int var8 = this.field1203 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field6345;
        if (arg1 <= 3) {
            method482(26, -67, -40, 103, 99, (byte[]) null, 39);
        }
        int var11 = var5.field6344;
        int var12 = this.field1203 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var8 += this.field1203 * var13;
            var10 -= var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field1199) {
            int var15 = var6 + var10 + 1 - this.field1199;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var8 += var16;
            var7 = 1;
            var9 += var16;
            var11 -= var16;
            var14 += var16;
        }
        if (this.field1203 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field1203;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method478(var5.field6348, var10, var12, var8, -12314, var11, var14, this.field1198, var9);
            this.method483(var10, var6, var11, var7, 1327453959);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIIIIII[BI)V")
    private static final void method478(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg7[var10001] += arg0[arg8++];
                int var14 = arg3++;
                arg7[var14] += arg0[arg8++];
                int var15 = arg3++;
                arg7[var15] += arg0[arg8++];
                int var16 = arg3++;
                arg7[var16] += arg0[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg7[var10001] += arg0[arg8++];
            }
            arg3 += arg2;
            arg8 += arg6;
        }
        if (arg4 == -12314) {
            ;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[[ZZIII)V")
    public final void method479(int arg0, boolean[][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = 25 % ((27 - arg4) / 41);
        opengl var8 = this.field1204.field3342;
        this.field1204.method1466();
        this.field1204.method1353(false);
        this.field1204.method1441(false);
        this.field1204.method1418(-2);
        this.field1204.method1455(0);
        this.field1204.method1371(1);
        float var9 = 1.0F / (float) (this.field1204.field3351 * 128);
        if (arg2) {
            for (int var10 = 0; var10 < this.field1205; var10++) {
                int var11 = var10 << this.field1200;
                int var12 = var10 + 1 << this.field1200;
                label132: for (int var13 = 0; var13 < this.field1206; var13++) {
                    int var14 = var13 << this.field1200;
                    int var15 = var13 + 1 << this.field1200;
                    for (int var16 = var14; var16 < var15; var16++) {
                        if ((-arg3) <= (var16 - arg5) && (var16 - arg5) <= arg3) {
                            for (int var17 = var11; var17 < var12; var17++) {
                                if ((-arg3) <= (var17 - arg0) && arg3 >= (var17 - arg0) && arg1[var16 + arg3 - arg5][arg3 + var17 - arg0]) {
                                    var8.glMatrixMode(5890);
                                    var8.glLoadIdentity();
                                    var8.glScalef(var9, var9, 1.0F);
                                    var8.glTranslatef((float) (-var13) / var9, (float) (-var10) / var9, 1.0F);
                                    var8.glMatrixMode(5888);
                                    this.field1201[var13][var10].method798(-128);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var18 = 0; var18 < this.field1205; var18++) {
                int var19 = var18 << this.field1200;
                int var20 = var18 + 1 << this.field1200;
                for (int var21 = 0; var21 < this.field1206; var21++) {
                    int var22 = 0;
                    int var23 = var21 << this.field1200;
                    int var24 = var21 + 1 << this.field1200;
                    class179 var25 = class296.field4380;
                    var25.field2206 = 0;
                    for (int var26 = var19; var26 < var20; var26++) {
                        if ((var26 - arg0) >= (-arg3) && var26 - arg0 <= arg3) {
                            int var27 = this.field1202.field6326 * var26 + var23;
                            for (int var28 = var23; var28 < var24; var28++) {
                                if (-arg3 <= var28 - arg5 && var28 - arg5 <= arg3 && arg1[arg3 + var28 - arg5][var26 + arg3 - arg0]) {
                                    short[] var29 = this.field1202.field4369[var27];
                                    if (var29 != null) {
                                        if (this.field1204.field3370) {
                                            for (int var30 = 0; var30 < var29.length; var30++) {
                                                var25.method884(var29[var30] & 0xFFFF, true);
                                                var22++;
                                            }
                                        } else {
                                            for (int var31 = 0; var31 < var29.length; var31++) {
                                                var25.method880(true, var29[var31] & 0xFFFF);
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
                        var8.glMatrixMode(5890);
                        var8.glLoadIdentity();
                        var8.glScalef(var9, var9, 1.0F);
                        var8.glTranslatef((float) (-var21) / var9, (float) (-var18) / var9, 1.0F);
                        var8.glMatrixMode(5888);
                        this.field1201[var21][var18].method797(var25.field2159, 5123, var22, (byte) -102);
                    }
                }
            }
        }
        var8.glMatrixMode(5890);
        var8.glLoadIdentity();
        var8.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILph;)Z")
    public final boolean method480(int arg0, int arg1, int arg2, class125 arg3) {
        class447 var5 = (class447) arg3;
        int var6 = var5.field6347 + arg2 + 1;
        int var7 = var5.field6346 + arg1 + arg0;
        int var8 = this.field1203 * var6 + var7;
        int var9 = var5.field6345;
        int var10 = var5.field6344;
        int var11 = this.field1203 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field1203 * var12;
            var9 -= var12;
            var6 = 1;
        }
        if (this.field1199 <= (var6 + var9)) {
            int var13 = var9 + var6 + 1 - this.field1199;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
            var8 += var14;
        }
        if ((var7 + var10) >= this.field1203) {
            int var15 = var7 + var10 + 1 - this.field1203;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1203 + var11;
            return method482(var8, arg1 + 46, var16, var10, var9, this.field1198, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIII[BIIBI)V")
    private static final void method481(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 <= 87) {
            return;
        }
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg4[var10001] = (byte) (arg4[var10001] - arg0[arg2++]);
                int var14 = arg3++;
                arg4[var14] = (byte) (arg4[var14] - arg0[arg2++]);
                int var15 = arg3++;
                arg4[var15] = (byte) (arg4[var15] - arg0[arg2++]);
                int var16 = arg3++;
                arg4[var16] = (byte) (arg4[var16] - arg0[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg4[var10001] = (byte) (arg4[var10001] - arg0[arg2++]);
            }
            arg3 += arg8;
            arg2 += arg1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII[BI)Z")
    private static final boolean method482(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        int var7 = arg3 % arg2;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg4 + arg2 - 1) / arg2);
        int var10 = -((arg3 + arg2 - 1) / arg2);
        if (arg1 <= 13) {
            method481((byte[]) null, -59, 10, -109, (byte[]) null, 24, 59, (byte) -122, 99);
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg0] == 0) {
                    return true;
                }
                arg0 += arg2;
            }
            int var13 = arg0 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    private final void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field1201 == null) {
            return;
        }
        if (arg4 != 1327453959) {
            this.field1203 = 24;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg2 - 2 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg0 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class164[] var11 = this.field1201[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1975 = true;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lic;Lto;)V")
    public class98(class246 arg0, class296 arg1) {
        this.field1204 = arg0;
        this.field1202 = arg1;
        this.field1203 = (this.field1202.field6326 * this.field1202.field4383 >> this.field1204.field3361) + 2;
        this.field1199 = (this.field1202.field6324 * this.field1202.field4383 >> this.field1204.field3361) + 2;
        this.field1200 = this.field1204.field3361 + 7 - this.field1202.field4376;
        this.field1198 = new byte[this.field1203 * this.field1199];
        this.field1206 = this.field1202.field6326 >> this.field1200;
        this.field1205 = this.field1202.field6324 >> this.field1200;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIILph;)V")
    public final void method484(int arg0, int arg1, int arg2, class125 arg3) {
        class447 var5 = (class447) arg3;
        int var6 = var5.field6346 + arg0 + 1;
        int var7 = var5.field6347 + arg1 + 1;
        int var8 = this.field1203 * var7 + var6;
        if (arg2 != -15021) {
            this.method479(-19, (boolean[][]) ((boolean[][]) null), false, -42, 109, -52);
        }
        int var9 = 0;
        int var10 = var5.field6345;
        int var11 = var5.field6344;
        int var12 = this.field1203 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field1203 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field1199) {
            int var15 = var7 + var10 + 1 - this.field1199;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var12 += var16;
            var14 += var16;
            var11 -= var16;
            var6 = 1;
            var8 += var16;
        }
        if (this.field1203 <= var6 + var11) {
            int var17 = var6 + var11 - (this.field1203 + -1);
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method481(var5.field6348, var14, var9, var8, this.field1198, var11, var10, (byte) 121, var12);
            this.method483(var10, var7, var11, var6, 1327453959);
        }
    }
}
