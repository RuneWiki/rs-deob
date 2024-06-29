import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class486 extends class264 {

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    private int field6882 = 0;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    private int field6883 = 0;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    private int field6886 = 0;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
    public static int[] field6870 = new int[99];

    @OriginalMember(owner = "client!e", name = "X", descriptor = "[I")
    public static int[] field6875 = new int[13];

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "Lae;")
    public static class172 field6890;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    private int field6867;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    private int field6876;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    private int field6877;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    private int field6880;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    private int field6881;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
    private int field6885;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "Lnl;")
    public static class435 field6888;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "[I")
    public static int[] field6887;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "[[I")
    public static int[][] field6872;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "[[[B")
    public static byte[][][] field6878;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field6870[var1] = var0 / 4;
        }
        field6889 = 0;
        field6890 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)[[I", line = 3)
    public final int[][] method5(byte arg0, int arg1) {
        ++field6879;
        int[][] var3 = super.field3816.method1928((byte) 113, arg1);
        if (arg0 != 116) {
            field6870 = null;
        }
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 123, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class478.field6792; ++var11) {
                this.method2864(var5[var11], var6[var11], false, var7[var11]);
                this.field6880 += this.field6882;
                this.field6876 += this.field6886;
                for (this.field6877 += this.field6883; this.field6877 < 0; this.field6877 += 4096) {
                }
                while (this.field6877 > 4096) {
                    this.field6877 -= 4096;
                }
                if (~this.field6876 > -1) {
                    this.field6876 = 0;
                }
                if (this.field6876 > 4096) {
                    this.field6876 = 4096;
                }
                if (~this.field6880 > -1) {
                    this.field6880 = 0;
                }
                if (this.field6880 > 4096) {
                    this.field6880 = 4096;
                }
                this.method2865(this.field6877, (byte) -101, this.field6876, this.field6880);
                var8[var11] = this.field6881;
                var9[var11] = this.field6867;
                var10[var11] = this.field6885;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 76)
    public class486() {
        super(1, false);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLkk;I)V", line = 83)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field6882 = (arg1.method1152(-1910700904) << 12) / 100;
                }
            } else {
                this.field6886 = (arg1.method1152(-1910700904) << 12) / 100;
            }
        } else {
            this.field6883 = arg1.method1163(9988);
        }
        if (arg0 <= 31) {
            field6872 = null;
        }
        ++field6868;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V", line = 132)
    public static final void method2863(int arg0, int arg1) {
        ++field6884;
        if (!class51.field743) {
            arg1 = -1;
        }
        if (~class319.field4507 != ~arg1) {
            if (arg0 != arg1) {
                class212 var2 = class82.field1180.method2674(-27765, arg1);
                class355 var3 = var2.method1445(0);
                if (var3 == null) {
                    arg1 = -1;
                } else {
                    class436.field6206.method613(class33.field338, var3.method2186(), new Point(var2.field3086, var2.field3087), var3.method2194(), -29482, var3.method2185());
                    class319.field4507 = arg1;
                }
            }
            if (arg1 == -1 && ~class319.field4507 != 0) {
                class436.field6206.method613(class33.field338, -1, new Point(), (int[]) null, arg0 ^ 29481, -1);
                class319.field4507 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI)V", line = 177)
    private final void method2864(int arg0, int arg1, boolean arg2, int arg3) {
        ++field6873;
        if (!arg2) {
            int var5 = ~arg0 < ~arg1 ? arg0 : arg1;
            int var6 = ~arg0 > ~arg1 ? arg0 : arg1;
            int var7 = var5 >= arg3 ? var5 : arg3;
            int var8 = ~arg3 > ~var6 ? arg3 : var6;
            this.field6880 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (var9 <= 0) {
                this.field6877 = 0;
            } else {
                int var10 = (-arg0 + var7 << 12) / var9;
                int var11 = (var7 - arg1 << 12) / var9;
                int var12 = (-arg3 + var7 << 12) / var9;
                if (arg0 != var7) {
                    if (~arg1 == ~var7) {
                        this.field6877 = ~arg3 == ~var8 ? var10 + 4096 : -var12 + 12288;
                    } else {
                        this.field6877 = ~arg0 == ~var8 ? var11 + 12288 : 20480 - var10;
                    }
                } else {
                    this.field6877 = ~arg1 == ~var8 ? 20480 - -var12 : 4096 - var11;
                }
                this.field6877 /= 6;
            }
            if (this.field6880 > 0 && ~this.field6880 > -4097) {
                this.field6876 = (var9 << 12) / (~this.field6880 < -2049 ? -(this.field6880 * 2) + 8192 : this.field6880 * 2);
            } else {
                this.field6876 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBII)V", line = 231)
    private final void method2865(int arg0, byte arg1, int arg2, int arg3) {
        ++field6871;
        int var5 = ~arg3 < -2049 ? arg2 + arg3 + -(arg2 * arg3 >> 12) : (arg2 + 4096) * arg3 >> 12;
        if (~var5 >= -1) {
            this.field6881 = this.field6867 = this.field6885 = arg3;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg3 + arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field6885 = var15;
                                    this.field6867 = var7;
                                    this.field6881 = var5;
                                }
                            } else {
                                this.field6885 = var5;
                                this.field6881 = var14;
                                this.field6867 = var7;
                            }
                        } else {
                            this.field6881 = var7;
                            this.field6867 = var15;
                            this.field6885 = var5;
                        }
                    } else {
                        this.field6885 = var14;
                        this.field6881 = var7;
                        this.field6867 = var5;
                    }
                } else {
                    this.field6867 = var5;
                    this.field6881 = var15;
                    this.field6885 = var7;
                }
            } else {
                this.field6885 = var7;
                this.field6881 = var5;
                this.field6867 = var14;
            }
        }
        int var17 = -31 % ((arg1 - 1) / 35);
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V", line = 338)
    public static void method2866(int arg0) {
        if (arg0 != 0) {
            field6875 = null;
        }
        field6890 = null;
        field6888 = null;
        field6887 = null;
        field6870 = null;
        field6878 = null;
        field6875 = null;
        field6872 = null;
    }
}
