import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class475 extends class478 {

    @OriginalMember(owner = "client!vo", name = "R", descriptor = "I")
    private int field6851 = 0;

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    private int field6843 = 0;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    private int field6840 = 0;

    @OriginalMember(owner = "client!vo", name = "T", descriptor = "I")
    public static int field6853 = -2;

    @OriginalMember(owner = "client!vo", name = "V", descriptor = "I")
    public static int field6855 = 1406;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    private int field6839;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    private int field6844;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    private int field6846;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    private int field6847;

    @OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!vo", name = "Q", descriptor = "I")
    private int field6850;

    @OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!vo", name = "U", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
    private int field6856;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "[J")
    public static long[] field6848;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "[[Z")
    public static boolean[][] field6837;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)V")
    private final void method2733(int arg0, int arg1, int arg2, int arg3) {
        ++field6838;
        if (arg1 != -3) {
            this.method2733(99, -77, -93, 54);
        }
        int var5 = ~arg0 < -2049 ? arg3 - (arg0 * arg3 >> 12) + arg0 : (arg3 + 4096) * arg0 >> 12;
        if (~var5 >= -1) {
            this.field6856 = this.field6850 = this.field6844 = arg0;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg0 + arg0 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field6850 = var7;
                                    this.field6844 = var15;
                                    this.field6856 = var5;
                                }
                            } else {
                                this.field6844 = var5;
                                this.field6856 = var14;
                                this.field6850 = var7;
                            }
                        } else {
                            this.field6856 = var7;
                            this.field6850 = var15;
                            this.field6844 = var5;
                        }
                    } else {
                        this.field6856 = var7;
                        this.field6844 = var14;
                        this.field6850 = var5;
                    }
                } else {
                    this.field6850 = var5;
                    this.field6856 = var15;
                    this.field6844 = var7;
                }
            } else {
                this.field6850 = var14;
                this.field6856 = var5;
                this.field6844 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(II)I")
    public static final int method2734(int arg0, int arg1) {
        if (arg1 != 12077) {
            return -117;
        } else {
            ++field6854;
            return (261720 & arg0) >> 11;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field6841;
        int[][] var3 = super.field6889.method2091(4, arg1);
        if (!arg0) {
            this.field6840 = -8;
        }
        if (super.field6889.field4765) {
            int[][] var4 = this.method2753(0, arg1, (byte) 11);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class436.field6154; ++var11) {
                this.method2736(var6[var11], -28338, var5[var11], var7[var11]);
                this.field6847 += this.field6843;
                this.field6839 += this.field6840;
                this.field6846 += this.field6851;
                while (~this.field6847 > -1) {
                    this.field6847 += 4096;
                }
                if (this.field6839 < 0) {
                    this.field6839 = 0;
                }
                while (this.field6847 > 4096) {
                    this.field6847 -= 4096;
                }
                if (this.field6846 < 0) {
                    this.field6846 = 0;
                }
                if (this.field6839 > 4096) {
                    this.field6839 = 4096;
                }
                if (~this.field6846 < -4097) {
                    this.field6846 = 4096;
                }
                this.method2733(this.field6846, -3, this.field6847, this.field6839);
                var8[var11] = this.field6856;
                var9[var11] = this.field6850;
                var10[var11] = this.field6844;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            method2734(-77, -59);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field6851 = (arg1.method657(false) << 12) / 100;
                }
            } else {
                this.field6840 = (arg1.method657(false) << 12) / 100;
            }
        } else {
            this.field6843 = arg1.method676(-5);
        }
        ++field6849;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
    public class475() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
    public static void method2735(int arg0) {
        field6848 = null;
        if (arg0 != -12560) {
            field6837 = null;
        }
        field6837 = null;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IIII)V")
    private final void method2736(int arg0, int arg1, int arg2, int arg3) {
        ++field6852;
        if (arg1 != -28338) {
            method2735(109);
        }
        int var5 = arg2 > arg0 ? arg2 : arg0;
        int var6 = arg3 > var5 ? arg3 : var5;
        int var7 = arg2 < arg0 ? arg2 : arg0;
        int var8 = ~var7 < ~arg3 ? arg3 : var7;
        this.field6846 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field6847 = 0;
        } else {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (~arg2 != ~var6) {
                if (~arg0 != ~var6) {
                    this.field6847 = arg2 == var8 ? 12288 - -var11 : -var10 + 20480;
                } else {
                    this.field6847 = ~arg3 != ~var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field6847 = arg0 != var8 ? -var11 + 4096 : 20480 - -var12;
            }
            this.field6847 /= 6;
        }
        if (~this.field6846 < -1 && this.field6846 < 4096) {
            this.field6839 = (var9 << 12) / (~this.field6846 >= -2049 ? this.field6846 * 2 : 8192 - this.field6846 * 2);
        } else {
            this.field6839 = 0;
        }
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)I")
    public static final int method2737(int arg0) {
        if (arg0 != 2) {
            return -2;
        } else {
            ++field6845;
            return class609.field8519;
        }
    }
}
