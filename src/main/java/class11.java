import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CYFJILLF")
public class class11 {

    @OriginalMember(owner = "CYFJILLF", name = "a", descriptor = "Z")
    private boolean field651 = true;

    @OriginalMember(owner = "CYFJILLF", name = "j", descriptor = "[I")
    private int[] field660 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "k", descriptor = "[I")
    private int[] field661 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "l", descriptor = "[I")
    private int[] field662 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "n", descriptor = "I")
    private int field664 = 100;

    @OriginalMember(owner = "CYFJILLF", name = "q", descriptor = "I")
    public int field667 = 500;

    @OriginalMember(owner = "CYFJILLF", name = "v", descriptor = "[I")
    private static int[] field672 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "w", descriptor = "[I")
    private static int[] field673 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "x", descriptor = "[I")
    private static int[] field674 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "y", descriptor = "[I")
    private static int[] field675 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "z", descriptor = "[I")
    private static int[] field676 = new int[5];

    @OriginalMember(owner = "CYFJILLF", name = "m", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "CYFJILLF", name = "r", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "CYFJILLF", name = "b", descriptor = "LRRWCTNMK;")
    private class50 field652;

    @OriginalMember(owner = "CYFJILLF", name = "c", descriptor = "LRRWCTNMK;")
    private class50 field653;

    @OriginalMember(owner = "CYFJILLF", name = "d", descriptor = "LRRWCTNMK;")
    private class50 field654;

    @OriginalMember(owner = "CYFJILLF", name = "e", descriptor = "LRRWCTNMK;")
    private class50 field655;

    @OriginalMember(owner = "CYFJILLF", name = "f", descriptor = "LRRWCTNMK;")
    private class50 field656;

    @OriginalMember(owner = "CYFJILLF", name = "g", descriptor = "LRRWCTNMK;")
    private class50 field657;

    @OriginalMember(owner = "CYFJILLF", name = "h", descriptor = "LRRWCTNMK;")
    private class50 field658;

    @OriginalMember(owner = "CYFJILLF", name = "i", descriptor = "LRRWCTNMK;")
    private class50 field659;

    @OriginalMember(owner = "CYFJILLF", name = "p", descriptor = "LRRWCTNMK;")
    private class50 field666;

    @OriginalMember(owner = "CYFJILLF", name = "o", descriptor = "LUVAKRMXV;")
    private class61 field665;

    @OriginalMember(owner = "CYFJILLF", name = "s", descriptor = "[I")
    private static int[] field669;

    @OriginalMember(owner = "CYFJILLF", name = "t", descriptor = "[I")
    private static int[] field670;

    @OriginalMember(owner = "CYFJILLF", name = "u", descriptor = "[I")
    private static int[] field671;

    @OriginalMember(owner = "CYFJILLF", name = "a", descriptor = "()V")
    public static final void method182() {
        field670 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field670[var0] = 1;
            } else {
                field670[var0] = -1;
            }
        }
        field671 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field671[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field669 = new int[220500];
    }

    @OriginalMember(owner = "CYFJILLF", name = "a", descriptor = "(II)[I")
    public final int[] method183(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field669[var3] = 0;
        }
        if (arg1 < 10) {
            return field669;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field652.method445(9);
        this.field653.method445(9);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field654 != null) {
            this.field654.method445(9);
            this.field655.method445(9);
            var6 = (int) ((double) (this.field654.field1318 - this.field654.field1317) * 32.768D / var4);
            var7 = (int) ((double) this.field654.field1317 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field656 != null) {
            this.field656.method445(9);
            this.field657.method445(9);
            var9 = (int) ((double) (this.field656.field1318 - this.field656.field1317) * 32.768D / var4);
            var10 = (int) ((double) this.field656.field1317 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field660[var12] != 0) {
                field672[var12] = 0;
                field673[var12] = (int) ((double) this.field662[var12] * var4);
                field674[var12] = (this.field660[var12] << 14) / 100;
                field675[var12] = (int) ((double) (this.field652.field1318 - this.field652.field1317) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field661[var12]) / var4);
                field676[var12] = (int) ((double) this.field652.field1317 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field652.method446(0, arg0);
            int var42 = this.field653.method446(0, arg0);
            if (this.field654 != null) {
                int var43 = this.field654.method446(0, arg0);
                int var44 = this.field655.method446(0, arg0);
                var41 += this.method184(0, var8, var44, this.field654.field1319) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field656 != null) {
                int var45 = this.field656.method446(0, arg0);
                int var46 = this.field657.method446(0, arg0);
                var42 = var42 * ((this.method184(0, var11, var46, this.field656.field1319) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field660[var47] != 0) {
                    int var48 = field673[var47] + var13;
                    if (var48 < arg0) {
                        field669[var48] += this.method184(0, field672[var47], field674[var47] * var42 >> 15, this.field652.field1319);
                        field672[var47] += (field675[var47] * var41 >> 16) + field676[var47];
                    }
                }
            }
        }
        if (this.field658 != null) {
            this.field658.method445(9);
            this.field659.method445(9);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field658.method446(0, arg0);
                int var19 = this.field659.method446(0, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field658.field1318 - this.field658.field1317) * var18 >> 8) + this.field658.field1317;
                } else {
                    var20 = ((this.field658.field1318 - this.field658.field1317) * var19 >> 8) + this.field658.field1317;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field669[var17] = 0;
                }
            }
        }
        if (this.field663 > 0 && this.field664 > 0) {
            int var21 = (int) ((double) this.field663 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field669[var22] += field669[var22 - var21] * this.field664 / 100;
            }
        }
        if (this.field665.field1419[0] > 0 || this.field665.field1419[1] > 0) {
            this.field666.method445(9);
            int var23 = this.field666.method446(0, arg0 + 1);
            int var24 = this.field665.method474(false, (float) var23 / 65536.0F, 0);
            int var25 = this.field665.method474(false, (float) var23 / 65536.0F, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field669[var24 + var26] * (long) class61.field1426 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field669[var24 + var26 - var38 - 1] * (long) class61.field1424[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field669[var26 - var39 - 1] * (long) class61.field1424[1][var39] >> 16);
                    }
                    field669[var26] = var37;
                    var23 = this.field666.method446(0, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field669[var24 + var26] * (long) class61.field1426 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field669[var24 + var26 - var35 - 1] * (long) class61.field1424[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field669[var26 - var36 - 1] * (long) class61.field1424[1][var36] >> 16);
                        }
                        field669[var26] = var34;
                        var23 = this.field666.method446(0, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field669[var24 + var26 - var31 - 1] * (long) class61.field1424[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field669[var26 - var32 - 1] * (long) class61.field1424[1][var32] >> 16);
                            }
                            field669[var26] = var30;
                            this.field666.method446(0, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field665.method474(false, (float) var23 / 65536.0F, 0);
                    var25 = this.field665.method474(false, (float) var23 / 65536.0F, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field669[var40] < -32768) {
                field669[var40] = -32768;
            }
            if (field669[var40] > 32767) {
                field669[var40] = 32767;
            }
        }
        return field669;
    }

    @OriginalMember(owner = "CYFJILLF", name = "a", descriptor = "(IIII)I")
    private final int method184(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg3 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg2 : -arg2;
        } else if (arg3 == 2) {
            return field671[arg1 & 0x7FFF] * arg2 >> 14;
        } else if (arg3 == 3) {
            return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
        } else if (arg3 == 4) {
            return field670[arg1 / 2607 & 0x7FFF] * arg2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "CYFJILLF", name = "a", descriptor = "(LEILHLJCE;B)V")
    public final void method185(class17 arg0, byte arg1) {
        this.field652 = new class50();
        this.field652.method443(arg0, (byte) -50);
        this.field653 = new class50();
        this.field653.method443(arg0, (byte) -50);
        int var3 = arg0.method224();
        if (var3 != 0) {
            arg0.field779--;
            this.field654 = new class50();
            this.field654.method443(arg0, (byte) -50);
            this.field655 = new class50();
            this.field655.method443(arg0, (byte) -50);
        }
        int var4 = arg0.method224();
        if (var4 != 0) {
            arg0.field779--;
            this.field656 = new class50();
            this.field656.method443(arg0, (byte) -50);
            this.field657 = new class50();
            this.field657.method443(arg0, (byte) -50);
        }
        int var5 = arg0.method224();
        if (var5 != 0) {
            arg0.field779--;
            this.field658 = new class50();
            this.field658.method443(arg0, (byte) -50);
            this.field659 = new class50();
            this.field659.method443(arg0, (byte) -50);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method238();
            if (var7 == 0) {
                break;
            }
            this.field660[var6] = var7;
            this.field661[var6] = arg0.method237();
            this.field662[var6] = arg0.method238();
        }
        if (arg1 != -50) {
            this.field651 = !this.field651;
        }
        this.field663 = arg0.method238();
        this.field664 = arg0.method238();
        this.field667 = arg0.method226();
        this.field668 = arg0.method226();
        this.field665 = new class61();
        this.field666 = new class50();
        this.field665.method475(this.field666, arg0, 0);
    }
}
