import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class395 {

    @OriginalMember(owner = "client!at", name = "l", descriptor = "Lkv;")
    private class280 field5598;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "Lwr;")
    private class480 field5595;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    private int field5596;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "[B")
    public byte[] field5603;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    private int field5590;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    private int field5597;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    private int field5600;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Z")
    public static boolean field5587 = false;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "[I")
    public static int[] field5594 = new int[120];

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "D")
    public static double field5606;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "[[Liia;")
    private class96[][] field5608;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public final void method2403(byte arg0) {
        field5599++;
        this.field5608 = new class96[this.field5597][this.field5600];
        for (int var2 = 0; var2 < this.field5600; var2++) {
            for (int var3 = 0; var3 < this.field5597; var3++) {
                this.field5608[var3][var2] = new class96(this.field5598, this, this.field5595, var3, var2, this.field5590, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 > -96) {
            this.field5600 = -43;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method2404(int arg0, class192 arg1, int arg2, int arg3) {
        if (arg3 != -12089) {
            this.method2404(104, null, 86, -98);
        }
        field5592++;
        class519 var5 = (class519) arg1;
        int var6 = var5.field7421 + arg2 + 1;
        int var7 = var5.field7412 + arg0 + 1;
        int var8 = this.field5611 * var7 + var6;
        int var9 = var5.field7407;
        int var10 = var5.field7410;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field5611 * var11;
        }
        int var12 = this.field5611 - var10;
        if ((var7 + var9) >= this.field5596) {
            int var13 = var7 + var9 + 1 - this.field5596;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var12 += var14;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field5611) {
            int var15 = var6 + var10 + 1 - this.field5611;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5611 + var12;
            return class284.method1916(this.field5603, var17, var8, var16, var9, (byte) 98, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
    public static final void method2405(int arg0, int arg1, int arg2) {
        field5605++;
        if (arg0 < -115) {
            class678 var3 = class630.method3597(29636, 16, (long) arg1);
            var3.method3834((byte) -110);
            var3.field9649 = arg2;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIII)V")
    private final void method2406(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5602++;
        if (this.field5608 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg4 - 2 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg1 + arg3 - 1 - 1 >> 7;
        if (arg2 != 4) {
            method2414();
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class96[] var11 = this.field5608[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field1230 = true;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5591++;
        if (arg3 >= class450.field6463 && class285.field4372 >= arg4 && class738.field10297 <= arg0 && arg7 <= class414.field5846) {
            class578.method3361(arg3, arg4, arg1, arg0, -37, arg7, arg5, arg6);
        } else {
            class201.method1448(arg3, arg7, arg5, arg1, arg4, arg2, arg0, arg6);
        }
        if (arg2 != 0) {
            field5610 = -115;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method2408(int arg0) {
        field5594 = null;
        if (arg0 != -2) {
            method2407(108, 84, -88, 113, 70, -19, -11, -74);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([[BLbg;I)V")
    public static final void method2409(byte[][] arg0, class487 arg1, int arg2) {
        field5601++;
        int[] var3 = new int[] { arg2, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class120 var11 = new class120(var10);
                int var12 = class96.field1236[var5] >> 8;
                int var13 = class96.field1236[var5] & 0xFF;
                int var14 = var12 * 64 - class103.field1295;
                int var15 = var13 * 64 - class175.field2496;
                class84.method611(arg2 - 81);
                arg1.method2443(false, class175.field2496, var11, var14, class103.field1295, var15, class234.field3394);
                arg1.method2845(class638.field8979, var14, var11, 17805, var3, var15);
                if (!arg1.field5741 && class388.field5531 / 8 == var12 && (class481.field6839 / 8) == var13 && var3[0] != -1) {
                    class656.field9247 = class684.field9714.method3113(var3[0], var3[3], var3[2], class510.field7302, 29, var3[1]);
                    class385.field5493 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class96.field1236[var6] >> 8) * 64 - class103.field1295;
            int var8 = (class96.field1236[var6] & 0xFF) * 64 - class175.field2496;
            byte[] var9 = arg0[var6];
            if (var9 == null && class481.field6839 < 800) {
                class84.method611(106);
                arg1.method2441(true, var8, 64, 64, var7);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIIII[[Z)V")
    public final void method2410(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        field5593++;
        this.field5598.method1888(false, (byte) -122);
        this.field5598.method1826(false, -109);
        this.field5598.method1873((byte) 23, -2);
        this.field5598.method1889(false, 1);
        this.field5598.method1817(1, 2);
        float var7 = 1.0F / (float) (this.field5598.field4169 * 128);
        if (arg0) {
            for (int var22 = 0; var22 < this.field5600; var22++) {
                int var23 = var22 << this.field5590;
                int var24 = var22 + 1 << this.field5590;
                label89: for (int var25 = 0; var25 < this.field5597; var25++) {
                    int var26 = var25 << this.field5590;
                    int var27 = var25 + 1 << this.field5590;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg3) <= (var28 - arg4) && arg3 >= var28 - arg4) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg3) <= (var29 - arg2) && var29 - arg2 <= arg3 && arg5[var28 - (arg4 - arg3)][arg3 + var29 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field5608[var25][var22].method673(21920);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field5600; var8++) {
                int var9 = var8 << this.field5590;
                int var10 = var8 + 1 << this.field5590;
                for (int var11 = 0; var11 < this.field5597; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field5590;
                    int var14 = var11 + 1 << this.field5590;
                    class186 var15 = this.field5598.field4231;
                    var15.field1521 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((-arg3) <= (var16 - arg2) && arg3 >= var16 - arg2) {
                            int var17 = this.field5595.field4420 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if ((-arg3) <= (var18 - arg4) && arg3 >= var18 - arg4 && arg5[var18 + arg3 - arg4][arg3 + var16 - arg2]) {
                                    short[] var19 = this.field5595.field6825[var17];
                                    if (var19 != null) {
                                        if (this.field5598.field4230) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method860(var19[var21] & 0xFFFF, (byte) 122);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method868(var19[var20] & 0xFFFF, arg1 + 849248931);
                                                var12++;
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
                        this.field5608[var11][var8].method676(5123, var15.field1556, var12, false);
                    }
                }
            }
        }
        if (arg1 != 8453) {
            this.field5598 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Laa;IILqda;IIILwq;)V")
    public static final void method2411(class510 arg0, int arg1, int arg2, class112 arg3, int arg4, int arg5, int arg6, class176 arg7) {
        field5604++;
        if (arg3 == null) {
            return;
        }
        int var8;
        if (class763.field10510 == 4) {
            var8 = (int) class562.field8001 & 0x3FFF;
        } else {
            var8 = (int) class562.field8001 + class77.field1042 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field2673 / 2, arg7.field2664 / 2) + 10;
        int var10 = arg4 * arg4 + (arg1 * arg1);
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class601.field8476[var8];
        int var12 = class601.field8473[var8];
        if (class763.field10510 != 4) {
            var12 = var12 * 256 / (class611.field8630 + 256);
            var11 = var11 * 256 / (class611.field8630 + 256);
        }
        int var13 = arg1 * var11 + arg4 * var12 >> 14;
        int var14 = arg1 * var12 - arg4 * var11 >> 14;
        if (arg6 != 1) {
            method2414();
        }
        arg3.method800(arg5 + (arg7.field2673 / 2) + var13 - arg3.method781() / 2, arg7.field2664 / 2 + arg2 + -var14 - arg3.method792() / 2, arg0, arg5, arg2);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIILr;)V")
    public final void method2412(int arg0, int arg1, int arg2, class192 arg3) {
        if (arg2 < 4) {
            this.method2406(46, 57, 103, -84, -25);
        }
        field5588++;
        class519 var5 = (class519) arg3;
        int var6 = var5.field7421 + arg0 + 1;
        int var7 = var5.field7412 + arg1 + 1;
        int var8 = this.field5611 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7407;
        int var11 = var5.field7410;
        int var12 = this.field5611 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field5611 * var14;
            var7 = 1;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if (this.field5596 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field5596;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var6 = 1;
            var12 += var16;
            var13 += var16;
        }
        if (this.field5611 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field5611;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class602.method3480((byte) 122, var11, var13, var12, var9, var10, var8, this.field5603, var5.field7419);
            this.method2406(var6, var10, 4, var7, var11);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IILr;I)V")
    public final void method2413(int arg0, int arg1, class192 arg2, int arg3) {
        field5589++;
        class519 var5 = (class519) arg2;
        int var6 = var5.field7412 + arg1 + 1;
        int var7 = var5.field7421 + arg0 + 1;
        int var8 = var7 + (this.field5611 * var6);
        int var9 = 0;
        int var10 = var5.field7407;
        int var11 = var5.field7410;
        int var12 = this.field5611 - var11;
        if (arg3 != -18962) {
            this.method2406(49, 44, -60, 69, 109);
        }
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var10 -= var13;
            var8 += this.field5611 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field5596) {
            int var15 = var6 + var10 + 1 - this.field5596;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var8 += var16;
            var11 -= var16;
            var7 = 1;
            var14 += var16;
            var9 += var16;
        }
        if (this.field5611 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field5611;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class777.method4271(var5.field7419, var8, var12, this.field5603, var14, var10, var9, 0, var11);
            this.method2406(var7, var10, 4, var6, var11);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "()V")
    public static final void method2414() {
        for (int var0 = 0; var0 < class592.field8357; var0++) {
            class778 var1 = class296.field4465[var0];
            class6.method32(var1, true);
            class296.field4465[var0] = null;
        }
        class592.field8357 = 0;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lkv;Lwr;)V")
    public class395(class280 arg0, class480 arg1) {
        this.field5598 = arg0;
        this.field5595 = arg1;
        this.field5611 = (this.field5595.field4420 * this.field5595.field4419 >> this.field5598.field4165) + 2;
        this.field5596 = (this.field5595.field4425 * this.field5595.field4419 >> this.field5598.field4165) + 2;
        this.field5603 = new byte[this.field5611 * this.field5596];
        this.field5590 = this.field5598.field4165 + 7 - this.field5595.field4428;
        this.field5597 = this.field5595.field4420 >> this.field5590;
        this.field5600 = this.field5595.field4425 >> this.field5590;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5594[var1] = var0 / 4;
        }
        field5610 = 0;
    }
}
