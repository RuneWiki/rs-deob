import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class448 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Llf;")
    private class250 field6439;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lbja;")
    private class34 field6438;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field6437;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    private int field6451;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[B")
    public byte[] field6448;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    private int field6452;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    private int field6450;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    private int field6446;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[[Lpe;")
    private class634[][] field6444;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "[[S")
    public static short[][] field6453;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILr;B)Z")
    public final boolean method2664(int arg0, int arg1, class195 arg2, byte arg3) {
        if (arg3 != -67) {
            return true;
        }
        field6447++;
        class251 var5 = (class251) arg2;
        int var6 = var5.field3673 + arg0 + 1;
        int var7 = var5.field3680 + arg1 + 1;
        int var8 = var7 + (this.field6437 * var6);
        int var9 = var5.field3678;
        int var10 = var5.field3670;
        int var11 = this.field6437 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var8 += this.field6437 * var12;
            var6 = 1;
        }
        if (var6 + var9 >= this.field6451) {
            int var13 = var6 + var9 + 1 - this.field6451;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var11 += var14;
            var7 = 1;
            var10 -= var14;
        }
        if (this.field6437 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field6437;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6437 + var11;
            return class327.method2117(false, var16, this.field6448, var8, var17, var9, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILr;IB)V")
    public final void method2665(int arg0, class195 arg1, int arg2, byte arg3) {
        field6449++;
        class251 var5 = (class251) arg1;
        int var6 = var5.field3680 + arg2 + 1;
        int var7 = var5.field3673 + arg0 + 1;
        int var8 = this.field6437 * var7 + var6;
        int var9 = 0;
        if (arg3 != 73) {
            this.field6450 = 36;
        }
        int var10 = var5.field3678;
        int var11 = var5.field3670;
        int var12 = this.field6437 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field6437 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field6451) {
            int var15 = var10 + var7 + 1 - this.field6451;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var14 += var16;
            var9 += var16;
            var8 += var16;
            var6 = 1;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field6437) {
            int var17 = var6 + var11 - (this.field6437 - 1);
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class228.method1443(var8, var11, var9, var10, var14, var12, this.field6448, true, var5.field3676);
            this.method2670(true, var7, var10, var11, var6);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILr;I)V")
    public final void method2666(int arg0, int arg1, class195 arg2, int arg3) {
        field6442++;
        class251 var5 = (class251) arg2;
        int var6 = 70 % ((42 - arg3) / 47);
        int var7 = var5.field3680 + arg0 + 1;
        int var8 = var5.field3673 + arg1 + 1;
        int var9 = var7 + (this.field6437 * var8);
        int var10 = 0;
        int var11 = var5.field3678;
        int var12 = var5.field3670;
        int var13 = this.field6437 - var12;
        if (var8 <= 0) {
            int var14 = 1 - var8;
            var9 += this.field6437 * var14;
            var10 += var12 * var14;
            var11 -= var14;
            var8 = 1;
        }
        int var15 = 0;
        if (this.field6451 <= (var8 + var11)) {
            int var16 = var8 + var11 + 1 - this.field6451;
            var11 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var9 += var17;
            var15 += var17;
            var13 += var17;
            var10 += var17;
            var7 = 1;
            var12 -= var17;
        }
        if (var7 + var12 >= this.field6437) {
            int var18 = var7 + var12 + 1 - this.field6437;
            var13 += var18;
            var12 -= var18;
            var15 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class599.method3355(var12, var11, var10, this.field6448, var15, (byte) -57, var5.field3676, var9, var13);
            this.method2670(true, var8, var11, var12, var7);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBIIZ[[Z)V")
    public final void method2667(int arg0, byte arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5) {
        this.field6439.method1639(false, -8);
        field6445++;
        this.field6439.method1572(false, false);
        this.field6439.method1580((byte) -52, -2);
        this.field6439.method1601(25456, 1);
        this.field6439.method1564(1, (byte) 56);
        float var7 = 1.0F / (float) (this.field6439.field3515 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field6446; var22++) {
                int var23 = var22 << this.field6452;
                int var24 = var22 + 1 << this.field6452;
                label89: for (int var25 = 0; var25 < this.field6450; var25++) {
                    int var26 = var25 << this.field6452;
                    int var27 = var25 + 1 << this.field6452;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg2 >= -arg3 && var28 - arg2 <= arg3) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg3) <= (var29 - arg0) && arg3 >= var29 - arg0 && arg5[arg3 + var28 - arg2][var29 - (arg0 - arg3)]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6444[var25][var22].method3494(19597);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field6446; var8++) {
                int var9 = var8 << this.field6452;
                int var10 = var8 + 1 << this.field6452;
                for (int var11 = 0; var11 < this.field6450; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field6452;
                    int var14 = var11 + 1 << this.field6452;
                    class453 var15 = this.field6439.field3623;
                    var15.field3725 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg0 >= -arg3 && var16 - arg0 <= arg3) {
                            int var17 = this.field6438.field4174 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (var18 - arg2 >= -arg3 && arg3 >= var18 - arg2 && arg5[var18 + arg3 - arg2][arg3 + var16 - arg0]) {
                                    short[] var19 = this.field6438.field326[var17];
                                    if (var19 != null) {
                                        if (this.field6439.field3561) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method1733(var19[var21] & 0xFFFF, -32466);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method1719(126, var19[var20] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6444[var11][var8].method3495(5123, var15.field3789, var12, false);
                    }
                }
            }
        }
        if (arg1 <= 9) {
            this.method2667(-79, (byte) -99, -10, -102, false, null);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[IIBII)Z")
    public static final boolean method2668(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6441++;
        if (arg6 < 0) {
            arg6 = 0;
        }
        if (class151.field2054 < arg1) {
            arg1 = class151.field2054;
        }
        if (arg1 <= arg6) {
            return true;
        }
        int var8 = arg6 + arg4 - 1;
        if (arg5 != 100) {
            field6453 = null;
        }
        int var9 = arg6 * arg7 + arg2;
        int var10 = arg1 - arg6 >> 2;
        if (class682.field9115 == 1) {
            class267.field3915 += var10;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var16 = arg1 - arg6 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var8++;
                        if (var9 < arg3[var8]) {
                            arg3[var8] = var9;
                        }
                        var9 += arg7;
                    }
                }
                var8++;
                if (arg3[var8] > var9) {
                    arg3[var8] = var9;
                }
                int var17 = arg7 + var9;
                var8++;
                if (var17 < arg3[var8]) {
                    arg3[var8] = var17;
                }
                int var18 = arg7 + var17;
                var8++;
                if (arg3[var8] > var18) {
                    arg3[var8] = var18;
                }
                int var19 = arg7 + var18;
                var8++;
                if (var19 < arg3[var8]) {
                    arg3[var8] = var19;
                }
                var9 = arg7 + var19;
            }
        } else {
            int var11 = var9 - 38400;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var12 = arg1 - arg6 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        int var10000 = ~var11;
                        var8++;
                        if (var10000 > ~arg3[var8]) {
                            return false;
                        }
                        var11 += arg7;
                    }
                }
                var8++;
                if (var11 < arg3[var8]) {
                    return false;
                }
                int var13 = arg7 + var11;
                var8++;
                if (arg3[var8] > var13) {
                    return false;
                }
                int var14 = arg7 + var13;
                var8++;
                if (arg3[var8] > var14) {
                    return false;
                }
                int var15 = arg7 + var14;
                var8++;
                if (var15 < arg3[var8]) {
                    return false;
                }
                var11 = arg7 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public final void method2669(int arg0) {
        field6440++;
        this.field6444 = new class634[this.field6450][this.field6446];
        for (int var2 = 0; var2 < this.field6446; var2++) {
            for (int var3 = 0; var3 < this.field6450; var3++) {
                this.field6444[var3][var2] = new class634(this.field6439, this, this.field6438, var3, var2, this.field6452, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != 0) {
            field6453 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIII)V")
    private final void method2670(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field6443++;
        if (!arg0) {
            this.method2664(-60, -65, null, (byte) -107);
        }
        if (this.field6444 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg4 - (1 - (arg3 - 1)) >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg2 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class634[] var11 = this.field6444[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field8570 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static void method2671(int arg0) {
        if (arg0 == -1) {
            field6453 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Llf;Lbja;)V")
    public class448(class250 arg0, class34 arg1) {
        this.field6439 = arg0;
        this.field6438 = arg1;
        this.field6437 = (this.field6438.field4177 * this.field6438.field4174 >> this.field6439.field3517) + 2;
        this.field6451 = (this.field6438.field4177 * this.field6438.field4173 >> this.field6439.field3517) + 2;
        this.field6448 = new byte[this.field6451 * this.field6437];
        this.field6452 = this.field6439.field3517 + 7 - this.field6438.field4179;
        this.field6450 = this.field6438.field4174 >> this.field6452;
        this.field6446 = this.field6438.field4173 >> this.field6452;
    }
}
