import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class449 {

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "Lmh;")
    private class575 field6175;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "Lap;")
    private class435 field6179;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public int field6183;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    private int field6190;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "[B")
    public byte[] field6182;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    private int field6176;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    private int field6185;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    private int field6177;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "[[I")
    public static int[][] field6186 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "Lkfa;")
    public static class549 field6178 = new class549(76, -1);

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "Lpr;")
    public static class407 field6189 = new class407(110, 11);

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "[[Lah;")
    private class348[][] field6181;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public final void method2492(int arg0) {
        this.field6181 = new class348[this.field6185][this.field6177];
        field6188++;
        if (arg0 != -20766) {
            this.method2495(-64, -22, null, -67);
        }
        for (int var2 = 0; var2 < this.field6177; var2++) {
            for (int var3 = 0; var3 < this.field6185; var3++) {
                this.field6181[var3][var2] = new class348(this.field6179, this, this.field6175, var3, var2, this.field6176, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lw;III)Z")
    public final boolean method2493(class269 arg0, int arg1, int arg2, int arg3) {
        field6184++;
        class272 var5 = (class272) arg0;
        int var6 = var5.field3448 + arg1 + 1;
        int var7 = var5.field3446 + arg3 + 1;
        int var8 = this.field6183 * var7 + var6;
        int var9 = var5.field3440;
        int var10 = var5.field3438;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var8 += this.field6183 * var11;
            var9 -= var11;
            var7 = 1;
        }
        int var12 = this.field6183 - var10;
        if (this.field6190 <= var7 + var9) {
            int var13 = var7 + var9 + 1 - this.field6190;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
            var12 += var14;
        }
        if ((var6 + var10) >= this.field6183) {
            int var15 = var6 + var10 + 1 - this.field6183;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > arg2 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6183 + var12;
            return class454.method2580(var9, this.field6182, -1, var17, var8, var10, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILw;I)V")
    public final void method2494(int arg0, int arg1, class269 arg2, int arg3) {
        if (arg3 != 5) {
            this.field6190 = -77;
        }
        field6174++;
        class272 var5 = (class272) arg2;
        int var6 = var5.field3448 + arg1 + 1;
        int var7 = var5.field3446 + arg0 + 1;
        int var8 = this.field6183 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3440;
        int var11 = var5.field3438;
        int var12 = this.field6183 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var8 += this.field6183 * var14;
            var9 += var11 * var14;
        }
        if (this.field6190 <= (var7 + var10)) {
            int var15 = var7 + var10 - (this.field6190 - 1);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var9 += var16;
            var13 += var16;
            var6 = 1;
            var12 += var16;
            var8 += var16;
        }
        if (var6 + var11 >= this.field6183) {
            int var17 = var6 + var11 + 1 - this.field6183;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class513.method2936(arg3 + 6125, var8, var9, var12, var11, var10, var5.field3447, this.field6182, var13);
            this.method2497(var7, arg3 ^ 0x6D, var10, var6, var11);
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(IILw;I)V")
    public final void method2495(int arg0, int arg1, class269 arg2, int arg3) {
        field6187++;
        class272 var5 = (class272) arg2;
        int var6 = var5.field3446 + arg3 + 1;
        int var7 = var5.field3448 + arg0 + 1;
        int var8 = this.field6183 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3440;
        int var11 = var5.field3438;
        int var12 = this.field6183 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field6183 * var13;
            var10 -= var13;
            var9 += var11 * var13;
            var6 = 1;
        }
        int var14 = -15 / ((arg1 - 60) / 60);
        int var15 = 0;
        if ((var6 + var10) >= this.field6190) {
            int var16 = var6 + var10 + 1 - this.field6190;
            var10 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var7 = 1;
            var9 += var17;
            var15 += var17;
            var8 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (this.field6183 <= var7 + var11) {
            int var18 = var7 + var11 + 1 - this.field6183;
            var15 += var18;
            var11 -= var18;
            var12 += var18;
        }
        if (var11 > 0 && var10 > 0) {
            class459.method2617(this.field6182, var5.field3447, var15, var11, var9, 500, var10, var12, var8);
            this.method2497(var6, 56, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    public static void method2496(int arg0) {
        int var1 = -59 % ((arg0 + 26) / 61);
        field6178 = null;
        field6189 = null;
        field6186 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII)V")
    private final void method2497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6180++;
        if (this.field6181 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg4 - 2 >> 7;
        int var8 = arg0 - 1 >> 7;
        if (arg1 < 44) {
            return;
        }
        int var9 = arg0 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class348[] var11 = this.field6181[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4536 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIZII[[Z)V")
    public final void method2498(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5) {
        field6173++;
        this.field6179.method2400((byte) 109, false);
        this.field6179.method2382(false, -32);
        this.field6179.method2321(-2, (byte) 95);
        if (arg0 != 16067) {
            this.method2493(null, 39, -93, -17);
        }
        this.field6179.method2396(1, -1);
        this.field6179.method2378(true, 1);
        float var7 = 1.0F / (float) (this.field6179.field5924 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field6177; var8++) {
                int var9 = var8 << this.field6176;
                int var10 = var8 + 1 << this.field6176;
                label135: for (int var11 = 0; var11 < this.field6185; var11++) {
                    int var12 = var11 << this.field6176;
                    int var13 = var11 + 1 << this.field6176;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg4) <= (var14 - arg1) && arg4 >= var14 - arg1) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg4) <= (var15 - arg3) && arg4 >= var15 - arg3 && arg5[var14 - (arg1 - arg4)][var15 - (arg3 - arg4)]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6181[var11][var8].method1933((byte) 94);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field6177; var16++) {
                int var17 = var16 << this.field6176;
                int var18 = var16 + 1 << this.field6176;
                for (int var19 = 0; var19 < this.field6185; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field6176;
                    int var22 = var19 + 1 << this.field6176;
                    class146 var23 = this.field6179.field6033;
                    var23.field6215 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg4) <= (var24 - arg3) && var24 - arg3 <= arg4) {
                            int var25 = this.field6175.field1558 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg4 <= var26 - arg1 && arg4 >= var26 - arg1 && arg5[var26 + arg4 - arg1][var24 + arg4 - arg3]) {
                                    short[] var27 = this.field6175.field8193[var25];
                                    if (var27 != null) {
                                        if (this.field6179.field6030) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2537(arg0 + 2177, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method2568((byte) -31, var27[var28] & 0xFFFF);
                                                var20++;
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6181[var19][var16].method1931(var20, 5123, arg0 ^ 0x3E43, var23.field6209);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lap;Lmh;)V")
    public class449(class435 arg0, class575 arg1) {
        this.field6175 = arg1;
        this.field6179 = arg0;
        this.field6183 = (this.field6175.field1561 * this.field6175.field1558 >> this.field6179.field5927) + 2;
        this.field6190 = (this.field6175.field1562 * this.field6175.field1561 >> this.field6179.field5927) + 2;
        this.field6182 = new byte[this.field6190 * this.field6183];
        this.field6176 = this.field6179.field5927 + 7 - this.field6175.field1560;
        this.field6185 = this.field6175.field1558 >> this.field6176;
        this.field6177 = this.field6175.field1562 >> this.field6176;
    }
}
