import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class63 {

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Lef;")
    private class377 field775;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Lh;")
    private class327 field777;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "[B")
    public byte[] field773;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "[[Lej;")
    private class311[][] field771;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZLgi;I)V")
    public final void method361(int arg0, boolean arg1, class416 arg2, int arg3) {
        class74 var5 = (class74) arg2;
        int var6 = var5.field901 + arg3 + 1;
        int var7 = var5.field899 + arg0 + 1;
        int var8 = this.field776 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field902;
        int var11 = var5.field900;
        int var12 = this.field776 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field776 * var14;
        }
        if (var7 + var10 >= this.field770) {
            int var15 = var7 + 1 - (this.field770 - var10);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var13 += var16;
            var11 -= var16;
        }
        if (var6 + var11 >= this.field776) {
            int var17 = var6 + var11 + 1 - this.field776;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0 && !arg1) {
            method364(var8, var11, this.field773, 0, var9, var13, var5.field903, var10, var12);
            this.method366(var11, var6, var10, (byte) 74, var7);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIII[[ZZ)V")
    public final void method362(byte arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
        opengl var7 = this.field777.field4363;
        this.field777.method2096();
        this.field777.method2051(false);
        this.field777.method2082(false);
        this.field777.method2059(-2);
        this.field777.method2083(0);
        this.field777.method2092(1);
        float var8 = 1.0F / (float) (this.field777.field4368 * 128);
        if (arg5) {
            for (int var23 = 0; var23 < this.field774; var23++) {
                int var24 = var23 << this.field778;
                int var25 = var23 + 1 << this.field778;
                label88: for (int var26 = 0; var26 < this.field772; var26++) {
                    int var27 = var26 << this.field778;
                    int var28 = var26 + 1 << this.field778;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg3) >= (-arg2) && arg2 >= var29 - arg3) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg1) >= (-arg2) && (var30 - arg1) <= arg2 && arg4[var29 + arg2 - arg3][var30 + arg2 - arg1]) {
                                    var7.glMatrixMode(5890);
                                    var7.glLoadIdentity();
                                    var7.glScalef(var8, var8, 1.0F);
                                    var7.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    var7.glMatrixMode(5888);
                                    this.field771[var26][var23].method1971((byte) -121);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field774; var9++) {
                int var10 = var9 << this.field778;
                int var11 = var9 + 1 << this.field778;
                for (int var12 = 0; var12 < this.field772; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field778;
                    int var15 = var12 + 1 << this.field778;
                    class242 var16 = class377.field5098;
                    var16.field3211 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((var17 - arg1) >= (-arg2) && (var17 - arg1) <= arg2) {
                            int var18 = this.field775.field3612 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (var19 - arg3 >= -arg2 && arg2 >= (var19 - arg3) && arg4[var19 + arg2 - arg3][arg2 + var17 - arg1]) {
                                    short[] var20 = this.field775.field5109[var18];
                                    if (var20 != null) {
                                        if (this.field777.field4448) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method1573(-6266, var20[var21] & 0xFFFF);
                                                var13++;
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var16.method1540(true, var20[var22] & 0xFFFF);
                                                var13++;
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
                        this.field771[var12][var9].method1968(arg0 - 13636, 5123, var16.field3188, var13);
                    }
                }
            }
        }
        var7.glMatrixMode(5890);
        if (arg0 != 44) {
            method365(54, 115, 29, 5, (byte[]) null, 112, -127);
        }
        var7.glLoadIdentity();
        var7.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lgi;IBI)V")
    public final void method363(class416 arg0, int arg1, byte arg2, int arg3) {
        class74 var5 = (class74) arg0;
        int var6 = var5.field899 + arg3 + 1;
        int var7 = var5.field901 + arg1 + 1;
        int var8 = this.field776 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field902;
        int var11 = var5.field900;
        if (arg2 != 88) {
            this.method362((byte) -103, 2, 76, -69, (boolean[][]) ((boolean[][]) null), true);
        }
        int var12 = this.field776 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field776 * var13;
            var9 += var11 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field770 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field770;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var11 -= var16;
            var7 = 1;
            var9 += var16;
        }
        if (var7 + var11 >= this.field776) {
            int var17 = var7 + var11 + 1 - this.field776;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            method367(var11, var10, var8, var5.field903, var14, var12, var9, arg2 ^ 0x35F1, this.field773);
            this.method366(var11, var7, var10, (byte) -125, var6);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[BIII[BII)V")
    private static final void method364(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        if (arg3 != 0) {
            return;
        }
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg2[var10001] += arg6[arg4++];
                int var14 = arg0++;
                arg2[var14] += arg6[arg4++];
                int var15 = arg0++;
                arg2[var15] += arg6[arg4++];
                int var16 = arg0++;
                arg2[var16] += arg6[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg2[var10001] += arg6[arg4++];
            }
            arg4 += arg5;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII[BII)Z")
    private static final boolean method365(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int var7 = arg3 % arg6;
        int var8;
        if (arg0 == var7) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg6 + arg5 - 1) / arg6);
        int var10 = -((arg3 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg2] == 0) {
                    return true;
                }
                arg2 += arg6;
            }
            int var13 = arg2 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIBI)V")
    private final void method366(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (this.field771 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = 96 / ((arg3 - 31) / 41);
        int var10 = arg2 + arg4 - 1 - 1 >> 7;
        for (int var11 = var6; var11 <= var7; var11++) {
            class311[] var12 = this.field771[var11];
            for (int var13 = var8; var13 <= var10; var13++) {
                var12[var13].field4212 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III[BIIII[B)V")
    private static final void method367(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg7 != 13737) {
            return;
        }
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg8[var10001] = (byte) (arg8[var10001] - arg3[arg6++]);
                int var14 = arg2++;
                arg8[var14] = (byte) (arg8[var14] - arg3[arg6++]);
                int var15 = arg2++;
                arg8[var15] = (byte) (arg8[var15] - arg3[arg6++]);
                int var16 = arg2++;
                arg8[var16] = (byte) (arg8[var16] - arg3[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg8[var10001] = (byte) (arg8[var10001] - arg3[arg6++]);
            }
            arg6 += arg4;
            arg2 += arg5;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBLgi;I)Z")
    public final boolean method368(int arg0, byte arg1, class416 arg2, int arg3) {
        class74 var5 = (class74) arg2;
        int var6 = var5.field901 + arg3 + 1;
        int var7 = var5.field899 + arg0 + 1;
        int var8 = this.field776 * var7 + var6;
        int var9 = var5.field902;
        int var10 = var5.field900;
        int var11 = this.field776 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var8 += this.field776 * var12;
            var9 -= var12;
        }
        if (var7 + var9 >= this.field770) {
            int var13 = var7 + var9 - (this.field770 - 1);
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var11 += var14;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field776) {
            int var15 = var6 + var10 + 1 - this.field776;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        int var17 = (var16 - 1) * this.field776 + var11;
        if (arg1 != -112) {
            this.field770 = 59;
        }
        return method365(0, var17, var8, var10, this.field773, var9, var16);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lh;Lef;)V")
    public class63(class327 arg0, class377 arg1) {
        this.field775 = arg1;
        this.field777 = arg0;
        this.field776 = (this.field775.field5111 * this.field775.field3612 >> this.field777.field4367) + 2;
        this.field770 = (this.field775.field5111 * this.field775.field3611 >> this.field777.field4367) + 2;
        this.field773 = new byte[this.field776 * this.field770];
        this.field778 = this.field777.field4367 + 7 - this.field775.field5095;
        this.field772 = this.field775.field3612 >> this.field778;
        this.field774 = this.field775.field3611 >> this.field778;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public final void method369(int arg0) {
        this.field771 = new class311[this.field772][this.field774];
        if (arg0 != -1) {
            method365(18, -94, -71, 48, (byte[]) null, 86, -61);
        }
        for (int var2 = 0; var2 < this.field774; var2++) {
            for (int var3 = 0; var3 < this.field772; var3++) {
                this.field771[var3][var2] = new class311(this.field777, this, this.field775, var3, var2, this.field778, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }
}
