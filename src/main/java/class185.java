import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class185 extends class34 {

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    private int field2686 = 4;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    private int field2688 = 4;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "[B")
    private byte[] field2694 = new byte[512];

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "Z")
    private boolean field2690 = true;

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "I")
    private int field2700 = 4;

    @OriginalMember(owner = "client!sg", name = "lb", descriptor = "I")
    private int field2704 = 1638;

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "I")
    private int field2702 = 0;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "S")
    public static short field2685 = 205;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "[I")
    public static int[] field2698 = new int[1000];

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "Ljava/lang/String;")
    public static String field2689 = " has logged out.";

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!sg", name = "mb", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!sg", name = "ob", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "Lwa;")
    public static class142 field2703;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "Lgk;")
    public static class224 field2687;

    @OriginalMember(owner = "client!sg", name = "nb", descriptor = "Lpk;")
    public static class237 field2706;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "[S")
    private short[] field2683;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "[S")
    private short[] field2696;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)I")
    private final int method1206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2695;
        int var8 = arg1 + -4096;
        int var9 = arg3 >> 12;
        int var10 = arg3 & 4095;
        int var11 = var10 + -4096;
        int var12 = var9 - -1;
        int var13 = class270.field4215[var10];
        int var14 = var9 & 255;
        if (~var12 <= ~arg5) {
            var12 = 0;
        }
        int var15 = 3 & this.field2694[arg6 + var14];
        int var16;
        if (var15 <= 1) {
            var16 = ~var15 != -1 ? -var10 + arg1 : arg1 + var10;
        } else {
            var16 = var15 != 2 ? -arg1 + -var10 : var10 - arg1;
        }
        int var17 = var12 & 255;
        int var18 = this.field2694[var17 - -arg6] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = ~var18 == -3 ? -arg1 + var11 : -arg1 + -var11;
        } else {
            var19 = var18 == 0 ? var11 - -arg1 : -var11 + arg1;
        }
        int var20 = ((-var16 + var19) * var13 >> 12) + var16;
        int var21 = 3 & this.field2694[var14 - -arg2];
        int var22;
        if (var21 <= 1) {
            var22 = ~var21 != -1 ? -var10 + var8 : var10 - -var8;
        } else {
            var22 = var21 != 2 ? -var10 - var8 : -var8 + var10;
        }
        int var23 = 3 & this.field2694[arg2 + var17];
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var24 = ~var23 != -1 ? -var11 + var8 : var8 + var11;
        }
        int var25 = -47 / ((-37 - arg4) / 60);
        int var26 = ((-var22 + var24) * var13 >> 12) + var22;
        return ((var26 - var20) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class185() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II[I)V")
    private final void method1207(int arg0, int arg1, int[] arg2) {
        int var4 = class199.field2985[arg1] * this.field2688;
        ++field2697;
        if (arg0 <= 73) {
            field2706 = null;
        }
        if (~this.field2686 != -2) {
            short var5 = this.field2696[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field2683[0] << 12;
                int var7 = this.field2700 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = var8 & 4095;
                int var11 = this.field2688 * var6 >> 12;
                int var12 = this.field2694[255 & var9] & 255;
                int var13 = var9 - -1;
                int var14 = class270.field4215[var10];
                if (var13 >= var11) {
                    var13 = 0;
                }
                int var15 = 255 & this.field2694[255 & var13];
                for (int var16 = 0; class226.field3527 > var16; ++var16) {
                    int var36 = class112.field1716[var16] * this.field2700;
                    int var37 = this.method1206(var14, var10, var15, var6 * var36 >> 12, 81, var7, var12);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field2686 > var17; ++var17) {
                short var18 = this.field2696[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field2683[var17] << 12;
                    int var20 = this.field2700 * var19 >> 12;
                    int var21 = this.field2688 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 + 1;
                    int var25 = 255 & this.field2694[255 & var23];
                    int var26 = var22 & 4095;
                    int var27 = class270.field4215[var26];
                    if (var24 >= var21) {
                        var24 = 0;
                    }
                    int var28 = this.field2694[255 & var24] & 255;
                    if (this.field2690 && ~(this.field2686 + -1) == ~var17) {
                        for (int var29 = 0; ~var29 > ~class226.field3527; ++var29) {
                            int var30 = class112.field1716[var29] * this.field2700;
                            int var31 = this.method1206(var27, var26, var28, var19 * var30 >> 12, 29, var20, var25);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class226.field3527; ++var33) {
                            int var34 = class112.field1716[var33] * this.field2700;
                            int var35 = this.method1206(var27, var26, var28, var19 * var34 >> 12, -99, var20, var25);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field2696[0];
            int var39 = this.field2683[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = var40 >> 12;
            int var42 = var41 + 1;
            int var43 = 255 & this.field2694[255 & var41];
            int var44 = var40 & 4095;
            int var45 = this.field2700 * var39 >> 12;
            int var46 = this.field2688 * var39 >> 12;
            int var47 = class270.field4215[var44];
            if (~var46 >= ~var42) {
                var42 = 0;
            }
            int var48 = 255 & this.field2694[var42 & 255];
            if (!this.field2690) {
                for (int var49 = 0; var49 < class226.field3527; ++var49) {
                    int var50 = class112.field1716[var49] * this.field2700;
                    int var51 = this.method1206(var47, var44, var48, var39 * var50 >> 12, 32, var45, var43);
                    arg2[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class226.field3527; ++var52) {
                    int var53 = class112.field1716[var52] * this.field2700;
                    int var54 = this.method1206(var47, var44, var48, var39 * var53 >> 12, 74, var45, var43);
                    int var55 = var38 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 <= 75) {
            this.field2694 = null;
        }
        ++field2701;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            this.method1207(80, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        ++field2693;
        this.field2694 = class82.method641((byte) -91, this.field2702);
        this.method1209(16124);
        int var2 = this.field2686 - 1;
        int var3 = 103 % ((-2 - arg0) / 43);
        while (var2 >= 1) {
            short var4 = this.field2696[var2];
            if (~var4 < -9) {
                return;
            }
            if (var4 < -8) {
                return;
            }
            --this.field2686;
            --var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field2703 = null;
        if (arg0 == 7065) {
            field2706 = null;
            field2689 = null;
            field2698 = null;
            field2687 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field2684;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2688 = arg2.method407(255);
                                }
                            } else {
                                this.field2700 = arg2.method407(255);
                            }
                        } else {
                            this.field2702 = arg2.method407(255);
                        }
                    } else {
                        this.field2700 = this.field2688 = arg2.method407(255);
                    }
                } else {
                    this.field2704 = arg2.method457((byte) 124);
                    if (~this.field2704 > -1) {
                        this.field2696 = new short[this.field2686];
                        for (int var5 = 0; ~this.field2686 < ~var5; ++var5) {
                            this.field2696[var5] = (short) arg2.method457((byte) 48);
                        }
                    }
                }
            } else {
                this.field2686 = arg2.method407(arg0 ^ 249);
            }
        } else {
            this.field2690 = arg2.method407(255) == 1;
        }
        if (arg0 != 6) {
            method1208(28);
        }
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V")
    private final void method1209(int arg0) {
        if (this.field2704 <= 0) {
            if (this.field2696 != null && this.field2696.length == this.field2686) {
                this.field2683 = new short[this.field2686];
                for (int var2 = 0; var2 < this.field2686; ++var2) {
                    this.field2683[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field2683 = new short[this.field2686];
            this.field2696 = new short[this.field2686];
            for (int var3 = 0; this.field2686 > var3; ++var3) {
                this.field2696[var3] = (short) ((int) (Math.pow((double) ((float) this.field2704 / 4096.0F), (double) var3) * 4096.0D));
                this.field2683[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 == 16124) {
            ++field2691;
        }
    }
}
