import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FMKSNCAT")
public class class14 {

    @OriginalMember(owner = "client!FMKSNCAT", name = "i", descriptor = "[I")
    private int[] field679 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "j", descriptor = "[I")
    private int[] field680 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "k", descriptor = "[I")
    private int[] field681 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "m", descriptor = "I")
    private int field683 = 100;

    @OriginalMember(owner = "client!FMKSNCAT", name = "p", descriptor = "I")
    public int field686 = 500;

    @OriginalMember(owner = "client!FMKSNCAT", name = "u", descriptor = "[I")
    private static int[] field691 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "v", descriptor = "[I")
    private static int[] field692 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "w", descriptor = "[I")
    private static int[] field693 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "x", descriptor = "[I")
    private static int[] field694 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "y", descriptor = "[I")
    private static int[] field695 = new int[5];

    @OriginalMember(owner = "client!FMKSNCAT", name = "l", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!FMKSNCAT", name = "q", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "LFGSQUADF;")
    private class12 field671;

    @OriginalMember(owner = "client!FMKSNCAT", name = "b", descriptor = "LFGSQUADF;")
    private class12 field672;

    @OriginalMember(owner = "client!FMKSNCAT", name = "c", descriptor = "LFGSQUADF;")
    private class12 field673;

    @OriginalMember(owner = "client!FMKSNCAT", name = "d", descriptor = "LFGSQUADF;")
    private class12 field674;

    @OriginalMember(owner = "client!FMKSNCAT", name = "e", descriptor = "LFGSQUADF;")
    private class12 field675;

    @OriginalMember(owner = "client!FMKSNCAT", name = "f", descriptor = "LFGSQUADF;")
    private class12 field676;

    @OriginalMember(owner = "client!FMKSNCAT", name = "g", descriptor = "LFGSQUADF;")
    private class12 field677;

    @OriginalMember(owner = "client!FMKSNCAT", name = "h", descriptor = "LFGSQUADF;")
    private class12 field678;

    @OriginalMember(owner = "client!FMKSNCAT", name = "o", descriptor = "LFGSQUADF;")
    private class12 field685;

    @OriginalMember(owner = "client!FMKSNCAT", name = "n", descriptor = "LZOMUFNUM;")
    private class71 field684;

    @OriginalMember(owner = "client!FMKSNCAT", name = "r", descriptor = "[I")
    private static int[] field688;

    @OriginalMember(owner = "client!FMKSNCAT", name = "s", descriptor = "[I")
    private static int[] field689;

    @OriginalMember(owner = "client!FMKSNCAT", name = "t", descriptor = "[I")
    private static int[] field690;

    @OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "()V")
    public static final void method193() {
        field689 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field689[var0] = 1;
            } else {
                field689[var0] = -1;
            }
        }
        field690 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field690[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field688 = new int[220500];
    }

    @OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "(II)[I")
    public final int[] method194(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field688[var3] = 0;
        }
        if (arg1 < 10) {
            return field688;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field671.method178(false);
        this.field672.method178(false);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field673 != null) {
            this.field673.method178(false);
            this.field674.method178(false);
            var6 = (int) ((double) (this.field673.field650 - this.field673.field649) * 32.768D / var4);
            var7 = (int) ((double) this.field673.field649 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field675 != null) {
            this.field675.method178(false);
            this.field676.method178(false);
            var9 = (int) ((double) (this.field675.field650 - this.field675.field649) * 32.768D / var4);
            var10 = (int) ((double) this.field675.field649 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field679[var12] != 0) {
                field691[var12] = 0;
                field692[var12] = (int) ((double) this.field681[var12] * var4);
                field693[var12] = (this.field679[var12] << 14) / 100;
                field694[var12] = (int) ((double) (this.field671.field650 - this.field671.field649) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field680[var12]) / var4);
                field695[var12] = (int) ((double) this.field671.field649 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field671.method179(arg0, false);
            int var42 = this.field672.method179(arg0, false);
            if (this.field673 != null) {
                int var43 = this.field673.method179(arg0, false);
                int var44 = this.field674.method179(arg0, false);
                var41 += this.method195(866, this.field673.field651, var44, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field675 != null) {
                int var45 = this.field675.method179(arg0, false);
                int var46 = this.field676.method179(arg0, false);
                var42 = var42 * ((this.method195(866, this.field675.field651, var46, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field679[var47] != 0) {
                    int var48 = field692[var47] + var13;
                    if (var48 < arg0) {
                        field688[var48] += this.method195(866, this.field671.field651, field693[var47] * var42 >> 15, field691[var47]);
                        field691[var47] += (field694[var47] * var41 >> 16) + field695[var47];
                    }
                }
            }
        }
        if (this.field677 != null) {
            this.field677.method178(false);
            this.field678.method178(false);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field677.method179(arg0, false);
                int var19 = this.field678.method179(arg0, false);
                int var20;
                if (var16) {
                    var20 = ((this.field677.field650 - this.field677.field649) * var18 >> 8) + this.field677.field649;
                } else {
                    var20 = ((this.field677.field650 - this.field677.field649) * var19 >> 8) + this.field677.field649;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field688[var17] = 0;
                }
            }
        }
        if (this.field682 > 0 && this.field683 > 0) {
            int var21 = (int) ((double) this.field682 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field688[var22] += field688[var22 - var21] * this.field683 / 100;
            }
        }
        if (this.field684.field1722[0] > 0 || this.field684.field1722[1] > 0) {
            this.field685.method178(false);
            int var23 = this.field685.method179(arg0 + 1, false);
            int var24 = this.field684.method586(0, 0, (float) var23 / 65536.0F);
            int var25 = this.field684.method586(0, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field688[var24 + var26] * (long) class71.field1729 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field688[var24 + var26 - var38 - 1] * (long) class71.field1727[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field688[var26 - var39 - 1] * (long) class71.field1727[1][var39] >> 16);
                    }
                    field688[var26] = var37;
                    var23 = this.field685.method179(arg0 + 1, false);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field688[var24 + var26] * (long) class71.field1729 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field688[var24 + var26 - var35 - 1] * (long) class71.field1727[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field688[var26 - var36 - 1] * (long) class71.field1727[1][var36] >> 16);
                        }
                        field688[var26] = var34;
                        var23 = this.field685.method179(arg0 + 1, false);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field688[var24 + var26 - var31 - 1] * (long) class71.field1727[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field688[var26 - var32 - 1] * (long) class71.field1727[1][var32] >> 16);
                            }
                            field688[var26] = var30;
                            this.field685.method179(arg0 + 1, false);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field684.method586(0, 0, (float) var23 / 65536.0F);
                    var25 = this.field684.method586(0, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field688[var40] < -32768) {
                field688[var40] = -32768;
            }
            if (field688[var40] > 32767) {
                field688[var40] = 32767;
            }
        }
        return field688;
    }

    @OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "(IIII)I")
    private final int method195(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg1 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg1 == 2) {
            return field690[arg3 & 0x7FFF] * arg2 >> 14;
        } else if (arg1 == 3) {
            return ((arg3 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg1 == 4) {
            return field689[arg3 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!FMKSNCAT", name = "a", descriptor = "(BLNQUAUMDT;)V")
    public final void method196(byte arg0, class36 arg1) {
        this.field671 = new class12();
        this.field671.method176((byte) 6, arg1);
        this.field672 = new class12();
        this.field672.method176((byte) 6, arg1);
        int var3 = arg1.method339();
        if (var3 != 0) {
            arg1.field1072--;
            this.field673 = new class12();
            this.field673.method176((byte) 6, arg1);
            this.field674 = new class12();
            this.field674.method176((byte) 6, arg1);
        }
        int var4 = arg1.method339();
        if (var4 != 0) {
            arg1.field1072--;
            this.field675 = new class12();
            this.field675.method176((byte) 6, arg1);
            this.field676 = new class12();
            this.field676.method176((byte) 6, arg1);
        }
        int var5 = arg1.method339();
        if (var5 != 0) {
            arg1.field1072--;
            this.field677 = new class12();
            this.field677.method176((byte) 6, arg1);
            this.field678 = new class12();
            this.field678.method176((byte) 6, arg1);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg1.method353();
            if (var7 == 0) {
                break;
            }
            this.field679[var6] = var7;
            this.field680[var6] = arg1.method352();
            this.field681[var6] = arg1.method353();
        }
        this.field682 = arg1.method353();
        this.field683 = arg1.method353();
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        this.field686 = arg1.method341();
        this.field687 = arg1.method341();
        this.field684 = new class71();
        this.field685 = new class12();
        this.field684.method587(arg1, 29883, this.field685);
    }
}
