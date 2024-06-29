import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class308 {

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "Ltb;")
    private class227 field4242;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Lfq;")
    private class111 field4238;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "[B")
    public byte[] field4243;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "[[Lcr;")
    private class344[][] field4244;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIZI[[ZI)V")
    public final void method1978(int arg0, int arg1, boolean arg2, int arg3, boolean[][] arg4, int arg5) {
        if (arg5 != 8300) {
            this.method1978(25, 87, true, -76, (boolean[][]) ((boolean[][]) null), -128);
        }
        opengl var7 = this.field4242.field3184;
        this.field4242.method1563();
        this.field4242.method1544(false);
        this.field4242.method1519(false);
        this.field4242.method1516(-2);
        this.field4242.method1569(0);
        this.field4242.method1510(1);
        float var8 = 1.0F / (float) (this.field4242.field3199 * 128);
        if (arg2) {
            for (int var23 = 0; var23 < this.field4245; var23++) {
                int var24 = var23 << this.field4240;
                int var25 = var23 + 1 << this.field4240;
                label86: for (int var26 = 0; var26 < this.field4239; var26++) {
                    int var27 = var26 << this.field4240;
                    int var28 = var26 + 1 << this.field4240;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((-arg3) <= (var29 - arg0) && arg3 >= var29 - arg0) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (-arg3 <= var30 - arg1 && (var30 - arg1) <= arg3 && arg4[arg3 + var29 - arg0][arg3 + var30 - arg1]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field4244[var26][var23].method2178(0);
                                    continue label86;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field4245; var9++) {
                int var10 = var9 << this.field4240;
                int var11 = var9 + 1 << this.field4240;
                for (int var12 = 0; var12 < this.field4239; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field4240;
                    int var15 = var12 + 1 << this.field4240;
                    class11 var16 = class111.field1604;
                    var16.field191 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (-arg3 <= var17 - arg1 && arg3 >= (var17 - arg1)) {
                            int var18 = this.field4238.field3434 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (-arg3 <= var19 - arg0 && var19 - arg0 <= arg3 && arg4[arg3 + var19 - arg0][var17 + arg3 - arg1]) {
                                    short[] var20 = this.field4238.field1600[var18];
                                    if (var20 != null) {
                                        if (this.field4242.field3229) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method191(var20[var21] & 0xFFFF, arg5 - 8394);
                                                var13++;
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method210(var20[var22] & 0xFFFF, arg5 ^ 0x1567);
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
                        this.field4244[var12][var9].method2176(var13, (byte) -67, 5123, var16.field230);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([BIIIIIB[BI)V")
    private static final void method1979(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, byte[] arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = 69 % ((43 - arg6) / 37);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg8++;
                arg0[var10001] += arg7[arg4++];
                int var15 = arg8++;
                arg0[var15] += arg7[arg4++];
                int var16 = arg8++;
                arg0[var16] += arg7[arg4++];
                int var17 = arg8++;
                arg0[var17] += arg7[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg8++;
                arg0[var10001] += arg7[arg4++];
            }
            arg4 += arg1;
            arg8 += arg3;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public final void method1980(int arg0) {
        if (arg0 < 17) {
            return;
        }
        this.field4244 = new class344[this.field4239][this.field4245];
        for (int var2 = 0; var2 < this.field4245; var2++) {
            for (int var3 = 0; var3 < this.field4239; var3++) {
                this.field4244[var3][var2] = new class344(this.field4242, this, this.field4238, var3, var2, this.field4240, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILmc;B)Z")
    public final boolean method1981(int arg0, int arg1, class69 arg2, byte arg3) {
        class166 var5 = (class166) arg2;
        int var6 = 79 % ((arg3 - 43) / 49);
        int var7 = var5.field2299 + arg0 + 1;
        int var8 = var5.field2298 + arg1 + 1;
        int var9 = this.field4241 * var8 + var7;
        int var10 = var5.field2302;
        int var11 = var5.field2301;
        int var12 = this.field4241 - var11;
        if (var8 <= 0) {
            int var13 = 1 - var8;
            var9 += this.field4241 * var13;
            var8 = 1;
            var10 -= var13;
        }
        if (this.field4237 <= (var8 + var10)) {
            int var14 = var8 + var10 + 1 - this.field4237;
            var10 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var9 += var15;
            var11 -= var15;
            var12 += var15;
            var7 = 1;
        }
        if (this.field4241 <= var7 + var11) {
            int var16 = var7 + var11 - (-1 - -this.field4241);
            var12 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field4241 + var12;
            return method1985(this.field4243, var9, var17, var10, 0, var11, var18);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIILmc;)V")
    public final void method1982(int arg0, int arg1, int arg2, class69 arg3) {
        class166 var5 = (class166) arg3;
        int var6 = var5.field2298 + arg2 + 1;
        int var7 = var5.field2299 + arg0 + 1;
        int var8 = this.field4241 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2302;
        if (arg1 != -31264) {
            method1985((byte[]) null, 18, -67, -94, -86, 48, -23);
        }
        int var11 = var5.field2301;
        int var12 = this.field4241 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field4241 * var13;
        }
        int var14 = 0;
        if (this.field4237 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field4237;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var14 += var16;
            var7 = 1;
        }
        if (this.field4241 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field4241;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            method1984(var12, var14, this.field4243, var11, var9, (byte) 28, var5.field2300, var8, var10);
            this.method1983(var6, var10, var11, var7, arg1 ^ 0x5118);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
    private final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field4244 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg2 - 2 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg1 - 1 - 1 >> 7;
        if (arg4 != -11016) {
            this.field4240 = 72;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class344[] var11 = this.field4244[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4682 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[BIIB[BII)V")
    private static final void method1984(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, int arg8) {
        int var9 = 87 / ((-arg5 - 84) / 33);
        int var10 = -(arg3 >> 2);
        int var11 = -(arg3 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] - arg6[arg4++]);
                int var15 = arg7++;
                arg2[var15] = (byte) (arg2[var15] - arg6[arg4++]);
                int var16 = arg7++;
                arg2[var16] = (byte) (arg2[var16] - arg6[arg4++]);
                int var17 = arg7++;
                arg2[var17] = (byte) (arg2[var17] - arg6[arg4++]);
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] - arg6[arg4++]);
            }
            arg4 += arg1;
            arg7 += arg0;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "([BIIIIII)Z")
    private static final boolean method1985(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 % arg2;
        int var8;
        if (arg4 == var7) {
            var8 = 0;
        } else {
            var8 = arg2 - var7;
        }
        int var9 = -((arg3 - (1 - arg2)) / arg2);
        int var10 = -((arg2 + arg5 - 1) / arg2);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg1] == 0) {
                    return true;
                }
                arg1 += arg2;
            }
            int var13 = arg1 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIILmc;)V")
    public final void method1986(int arg0, int arg1, int arg2, class69 arg3) {
        class166 var5 = (class166) arg3;
        int var6 = var5.field2299 + arg0 + 1;
        int var7 = var5.field2298 + arg1 + 1;
        int var8 = this.field4241 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2302;
        int var11 = var5.field2301;
        int var12 = this.field4241 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field4241 * var13;
            var9 += var11 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field4237 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field4237;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var8 += var16;
            var9 += var16;
            var14 += var16;
            var11 -= var16;
            var6 = 1;
        }
        if (this.field4241 <= (var6 + var11)) {
            int var17 = var11 + var6 + 1 - this.field4241;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (arg2 != 32692) {
            this.field4244 = (class344[][]) ((class344[][]) null);
        }
        if (var11 > 0 && var10 > 0) {
            method1979(this.field4243, var14, var10, var12, var9, var11, (byte) -45, var5.field2300, var8);
            this.method1983(var7, var10, var11, var6, arg2 - 43708);
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Ltb;Lfq;)V")
    public class308(class227 arg0, class111 arg1) {
        this.field4242 = arg0;
        this.field4238 = arg1;
        this.field4241 = (this.field4238.field3434 * this.field4238.field1596 >> this.field4242.field3201) + 2;
        this.field4237 = (this.field4238.field3433 * this.field4238.field1596 >> this.field4242.field3201) + 2;
        this.field4240 = this.field4242.field3201 + 7 - this.field4238.field1603;
        this.field4243 = new byte[this.field4241 * this.field4237];
        this.field4239 = this.field4238.field3434 >> this.field4240;
        this.field4245 = this.field4238.field3433 >> this.field4240;
    }
}
