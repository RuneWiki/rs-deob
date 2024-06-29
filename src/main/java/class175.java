import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class175 extends class80 {

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    private int field2840 = 0;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    private int field2838 = 0;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    private int field2850 = 0;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "Los;")
    public static class309 field2846 = new class309("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "[[S")
    public static short[][] field2852 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "Lwm;")
    public static class399 field2853 = new class399(8);

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "F")
    public static float field2855;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    private int field2842;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    private int field2843;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lco;")
    public static class78 field2845;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
    private final void method1207(int arg0, int arg1, int arg2, int arg3) {
        ++field2833;
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : -(arg2 * arg3 >> 12) + arg3 + arg2;
        if (var5 <= 0) {
            this.field2842 = this.field2849 = this.field2848 = arg2;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg2 + arg2 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field2842 = var5;
                                    this.field2849 = var7;
                                    this.field2848 = var15;
                                }
                            } else {
                                this.field2849 = var7;
                                this.field2848 = var5;
                                this.field2842 = var14;
                            }
                        } else {
                            this.field2849 = var15;
                            this.field2842 = var7;
                            this.field2848 = var5;
                        }
                    } else {
                        this.field2848 = var14;
                        this.field2842 = var7;
                        this.field2849 = var5;
                    }
                } else {
                    this.field2842 = var15;
                    this.field2849 = var5;
                    this.field2848 = var7;
                }
            } else {
                this.field2842 = var5;
                this.field2848 = var7;
                this.field2849 = var14;
            }
        }
        if (arg1 != 20480) {
            this.method29(-89, 52);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V")
    public static final void method1208(byte arg0) {
        ++field2835;
        class101.field1930.method1440(arg0 ^ 9);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class174.field2807[var1] = 0L;
        }
        if (arg0 != 36) {
            field2854 = 89;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class492.field7215[var2] = 0L;
        }
        class307.field4662 = 0;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field2834;
        if (arg0 != 255) {
            method1209(34, -68, 125, -39, 7);
        }
        int[][] var3 = super.field1589.method859(arg1, -17);
        if (super.field1589.field1884) {
            int[][] var4 = this.method713(0, -47, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class137.field2308 < ~var11; ++var11) {
                this.method1211(-1, var5[var11], var7[var11], var6[var11]);
                this.field2843 += this.field2838;
                this.field2844 += this.field2850;
                this.field2847 += this.field2840;
                while (this.field2843 < 0) {
                    this.field2843 += 4096;
                }
                if (this.field2844 < 0) {
                    this.field2844 = 0;
                }
                while (this.field2843 > 4096) {
                    this.field2843 -= 4096;
                }
                if (this.field2844 > 4096) {
                    this.field2844 = 4096;
                }
                if (~this.field2847 > -1) {
                    this.field2847 = 0;
                }
                if (~this.field2847 < -4097) {
                    this.field2847 = 4096;
                }
                this.method1207(this.field2843, arg0 + 20225, this.field2847, this.field2844);
                var8[var11] = this.field2842;
                var9[var11] = this.field2849;
                var10[var11] = this.field2848;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
    public static final void method1209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class186.field2990.field2532 != -1 && arg0 != 0 && ~class218.field3439 > -51 && ~arg2 != 0) {
            class276.field4170[class218.field3439++] = new class387((byte) 1, arg2, arg0, arg4, arg1, 0);
        }
        if (arg3 != 8) {
            field2854 = -16;
        }
        ++field2839;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
    public static void method1210(byte arg0) {
        field2845 = null;
        field2852 = null;
        field2846 = null;
        if (arg0 < -124) {
            field2853 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)V")
    private final void method1211(int arg0, int arg1, int arg2, int arg3) {
        ++field2836;
        int var5 = ~arg3 <= ~arg1 ? arg3 : arg1;
        int var6 = ~arg2 < ~var5 ? arg2 : var5;
        int var7 = arg3 > arg1 ? arg1 : arg3;
        int var8 = arg2 >= var7 ? var7 : arg2;
        int var9 = -var8 + var6;
        this.field2847 = (var6 + var8) / 2;
        if (arg0 > ~this.field2847 && ~this.field2847 > -4097) {
            this.field2844 = (var9 << 12) / (this.field2847 > 2048 ? -(this.field2847 * 2) + 8192 : this.field2847 * 2);
        } else {
            this.field2844 = 0;
        }
        if (var9 <= 0) {
            this.field2843 = 0;
        } else {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (~arg1 != ~var6) {
                if (arg3 == var6) {
                    this.field2843 = ~arg2 == ~var8 ? var10 + 4096 : -var12 + 12288;
                } else {
                    this.field2843 = arg1 == var8 ? var11 + 12288 : -var10 + 20480;
                }
            } else {
                this.field2843 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field2843 /= 6;
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
    public static final void method1212(int arg0) {
        class211.field3365.method2475((byte) 67);
        if (arg0 == -30540) {
            ++field2841;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = -102 / ((28 - arg1) / 53);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2840 = (arg2.method1816(true) << 12) / 100;
                }
            } else {
                this.field2850 = (arg2.method1816(true) << 12) / 100;
            }
        } else {
            this.field2838 = arg2.method1848((byte) 116);
        }
        ++field2837;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class175() {
        super(1, false);
    }
}
