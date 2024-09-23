import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GJBKSAZL")
public class class25 {

    @OriginalMember(owner = "GJBKSAZL", name = "a", descriptor = "I")
    private int field758 = 22486;

    @OriginalMember(owner = "GJBKSAZL", name = "j", descriptor = "[I")
    private int[] field767 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "k", descriptor = "[I")
    private int[] field768 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "l", descriptor = "[I")
    private int[] field769 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "n", descriptor = "I")
    private int field771 = 100;

    @OriginalMember(owner = "GJBKSAZL", name = "q", descriptor = "I")
    public int field774 = 500;

    @OriginalMember(owner = "GJBKSAZL", name = "v", descriptor = "[I")
    private static int[] field779 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "w", descriptor = "[I")
    private static int[] field780 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "x", descriptor = "[I")
    private static int[] field781 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "y", descriptor = "[I")
    private static int[] field782 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "z", descriptor = "[I")
    private static int[] field783 = new int[5];

    @OriginalMember(owner = "GJBKSAZL", name = "m", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "GJBKSAZL", name = "r", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "GJBKSAZL", name = "b", descriptor = "LDNFIVRJB;")
    private class15 field759;

    @OriginalMember(owner = "GJBKSAZL", name = "c", descriptor = "LDNFIVRJB;")
    private class15 field760;

    @OriginalMember(owner = "GJBKSAZL", name = "d", descriptor = "LDNFIVRJB;")
    private class15 field761;

    @OriginalMember(owner = "GJBKSAZL", name = "e", descriptor = "LDNFIVRJB;")
    private class15 field762;

    @OriginalMember(owner = "GJBKSAZL", name = "f", descriptor = "LDNFIVRJB;")
    private class15 field763;

    @OriginalMember(owner = "GJBKSAZL", name = "g", descriptor = "LDNFIVRJB;")
    private class15 field764;

    @OriginalMember(owner = "GJBKSAZL", name = "h", descriptor = "LDNFIVRJB;")
    private class15 field765;

    @OriginalMember(owner = "GJBKSAZL", name = "i", descriptor = "LDNFIVRJB;")
    private class15 field766;

    @OriginalMember(owner = "GJBKSAZL", name = "p", descriptor = "LDNFIVRJB;")
    private class15 field773;

    @OriginalMember(owner = "GJBKSAZL", name = "o", descriptor = "LDRRJWDRT;")
    private class16 field772;

    @OriginalMember(owner = "GJBKSAZL", name = "s", descriptor = "[I")
    private static int[] field776;

    @OriginalMember(owner = "GJBKSAZL", name = "t", descriptor = "[I")
    private static int[] field777;

    @OriginalMember(owner = "GJBKSAZL", name = "u", descriptor = "[I")
    private static int[] field778;

    @OriginalMember(owner = "GJBKSAZL", name = "a", descriptor = "()V")
    public static final void method296() {
        field777 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field777[var0] = 1;
            } else {
                field777[var0] = -1;
            }
        }
        field778 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field778[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field776 = new int[220500];
    }

    @OriginalMember(owner = "GJBKSAZL", name = "a", descriptor = "(II)[I")
    public final int[] method297(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field776[var3] = 0;
        }
        if (arg1 < 10) {
            return field776;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field759.method257(767);
        this.field760.method257(767);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field761 != null) {
            this.field761.method257(767);
            this.field762.method257(767);
            var6 = (int) ((double) (this.field761.field634 - this.field761.field633) * 32.768D / var4);
            var7 = (int) ((double) this.field761.field633 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field763 != null) {
            this.field763.method257(767);
            this.field764.method257(767);
            var9 = (int) ((double) (this.field763.field634 - this.field763.field633) * 32.768D / var4);
            var10 = (int) ((double) this.field763.field633 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field767[var12] != 0) {
                field779[var12] = 0;
                field780[var12] = (int) ((double) this.field769[var12] * var4);
                field781[var12] = (this.field767[var12] << 14) / 100;
                field782[var12] = (int) ((double) (this.field759.field634 - this.field759.field633) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field768[var12]) / var4);
                field783[var12] = (int) ((double) this.field759.field633 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field759.method258(-873, arg0);
            int var42 = this.field760.method258(-873, arg0);
            if (this.field761 != null) {
                int var43 = this.field761.method258(-873, arg0);
                int var44 = this.field762.method258(-873, arg0);
                var41 += this.method298(-60, var44, this.field761.field635, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field763 != null) {
                int var45 = this.field763.method258(-873, arg0);
                int var46 = this.field764.method258(-873, arg0);
                var42 = var42 * ((this.method298(-60, var46, this.field763.field635, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field767[var47] != 0) {
                    int var48 = field780[var47] + var13;
                    if (var48 < arg0) {
                        field776[var48] += this.method298(-60, field781[var47] * var42 >> 15, this.field759.field635, field779[var47]);
                        field779[var47] += (field782[var47] * var41 >> 16) + field783[var47];
                    }
                }
            }
        }
        if (this.field765 != null) {
            this.field765.method257(767);
            this.field766.method257(767);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field765.method258(-873, arg0);
                int var19 = this.field766.method258(-873, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field765.field634 - this.field765.field633) * var18 >> 8) + this.field765.field633;
                } else {
                    var20 = ((this.field765.field634 - this.field765.field633) * var19 >> 8) + this.field765.field633;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field776[var17] = 0;
                }
            }
        }
        if (this.field770 > 0 && this.field771 > 0) {
            int var21 = (int) ((double) this.field770 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field776[var22] += field776[var22 - var21] * this.field771 / 100;
            }
        }
        if (this.field772.field644[0] > 0 || this.field772.field644[1] > 0) {
            this.field773.method257(767);
            int var23 = this.field773.method258(-873, arg0 + 1);
            int var24 = this.field772.method262(true, 0, (float) var23 / 65536.0F);
            int var25 = this.field772.method262(true, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field776[var24 + var26] * (long) class16.field651 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field776[var24 + var26 - var38 - 1] * (long) class16.field649[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field776[var26 - var39 - 1] * (long) class16.field649[1][var39] >> 16);
                    }
                    field776[var26] = var37;
                    var23 = this.field773.method258(-873, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field776[var24 + var26] * (long) class16.field651 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field776[var24 + var26 - var35 - 1] * (long) class16.field649[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field776[var26 - var36 - 1] * (long) class16.field649[1][var36] >> 16);
                        }
                        field776[var26] = var34;
                        var23 = this.field773.method258(-873, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field776[var24 + var26 - var31 - 1] * (long) class16.field649[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field776[var26 - var32 - 1] * (long) class16.field649[1][var32] >> 16);
                            }
                            field776[var26] = var30;
                            this.field773.method258(-873, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field772.method262(true, 0, (float) var23 / 65536.0F);
                    var25 = this.field772.method262(true, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field776[var40] < -32768) {
                field776[var40] = -32768;
            }
            if (field776[var40] > 32767) {
                field776[var40] = 32767;
            }
        }
        return field776;
    }

    @OriginalMember(owner = "GJBKSAZL", name = "a", descriptor = "(IIII)I")
    private final int method298(int arg0, int arg1, int arg2, int arg3) {
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (arg2 == 1) {
            if ((arg3 & 0x7FFF) < 16384) {
                return arg1;
            } else {
                return -arg1;
            }
        } else if (arg2 == 2) {
            return field778[arg3 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field777[arg3 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "GJBKSAZL", name = "a", descriptor = "(LCFARFRSG;I)V")
    public final void method299(class8 arg0, int arg1) {
        this.field759 = new class15();
        this.field759.method255(arg0, 22486);
        this.field760 = new class15();
        this.field760.method255(arg0, 22486);
        int var3 = arg0.method30();
        if (this.field758 != arg1) {
            throw new NullPointerException();
        }
        if (var3 != 0) {
            arg0.field72--;
            this.field761 = new class15();
            this.field761.method255(arg0, 22486);
            this.field762 = new class15();
            this.field762.method255(arg0, 22486);
        }
        int var4 = arg0.method30();
        if (var4 != 0) {
            arg0.field72--;
            this.field763 = new class15();
            this.field763.method255(arg0, 22486);
            this.field764 = new class15();
            this.field764.method255(arg0, 22486);
        }
        int var5 = arg0.method30();
        if (var5 != 0) {
            arg0.field72--;
            this.field765 = new class15();
            this.field765.method255(arg0, 22486);
            this.field766 = new class15();
            this.field766.method255(arg0, 22486);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method44();
            if (var7 == 0) {
                break;
            }
            this.field767[var6] = var7;
            this.field768[var6] = arg0.method43();
            this.field769[var6] = arg0.method44();
        }
        this.field770 = arg0.method44();
        this.field771 = arg0.method44();
        this.field774 = arg0.method32();
        this.field775 = arg0.method32();
        this.field772 = new class16();
        this.field773 = new class15();
        this.field772.method263(this.field773, (byte) 5, arg0);
    }
}
