import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class393 extends class210 {

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    private int field5708 = 1024;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    private int field5707 = 4;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    private int field5711 = 0;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    private int field5716 = 409;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    private int field5719 = 204;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    private int field5725 = 8;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    private int field5720 = 81;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    private int field5729 = 1024;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field5717 = 0;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field5713 = -1;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "[I")
    public static int[] field5727 = new int[2048];

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    private int field5709;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    private int field5718;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    private int field5724;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "[I")
    private int[] field5731;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "[[I")
    private int[][] field5710;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "[[I")
    private int[][] field5714;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 7)
    private final void method2467(int arg0) {
        if (arg0 != -2048) {
            this.field5724 = 3;
        }
        ++field5728;
        Random var2 = new Random((long) this.field5725);
        this.field5724 = 4096 / this.field5725;
        this.field5718 = 4096 / this.field5707;
        this.field5709 = this.field5720 / 2;
        int var3 = this.field5718 / 2;
        this.field5710 = new int[this.field5725][this.field5707 - -1];
        this.field5714 = new int[this.field5725][this.field5707];
        int var4 = this.field5724 / 2;
        this.field5731 = new int[this.field5725 - -1];
        this.field5731[0] = 0;
        for (int var5 = 0; var5 < this.field5725; ++var5) {
            if (var5 > 0) {
                int var6 = this.field5724;
                int var7 = (-2048 + class435.method2683(var2, (byte) -75, 4096)) * this.field5719 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5731[var5] = this.field5731[var5 + -1] + var8;
            }
            this.field5710[var5][0] = 0;
            for (int var9 = 0; this.field5707 > var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field5718;
                    int var11 = (class435.method2683(var2, (byte) -75, 4096) + -2048) * this.field5716 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5710[var5][var9] = this.field5710[var5][var9 + -1] - -var12;
                }
                this.field5714[var5][var9] = ~this.field5708 < -1 ? -class435.method2683(var2, (byte) -75, this.field5708) + 4096 : 4096;
            }
            this.field5710[var5][this.field5707] = 4096;
        }
        this.field5731[this.field5725] = 4096;
    }

    @OriginalMember(owner = "client!s", name = "h", descriptor = "(I)V", line = 71)
    public static final void method2468(int arg0) {
        ++field5722;
        class436.field6368.method260(true);
        class223.field3295.method416((byte) 65);
        if (arg0 != 21770) {
            field5727 = null;
        }
        if (class133.field1833 != null) {
            class133.field1833.method2293(29738, class270.field4004);
        }
        class401.field5797.method1482(true);
        class270.field4004.setBackground(Color.black);
        class421.field6096 = -1;
        class436.field6368 = class378.method2395(class270.field4004, 12127);
        class223.field3295 = class56.method424(class270.field4004, (byte) -75, true);
        if (class133.field1833 != null) {
            class133.field1833.method2291(class270.field4004, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 95)
    public final void method363(int arg0) {
        ++field5712;
        if (arg0 != 0) {
            method2470(89);
        }
        this.method2467(-2048);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILat;)V", line = 106)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field5708 = arg2.method1767(1930493576);
                                    }
                                } else {
                                    this.field5720 = arg2.method1767(1930493576);
                                }
                            } else {
                                this.field5711 = arg2.method1767(1930493576);
                            }
                        } else {
                            this.field5729 = arg2.method1767(arg1 + 1930505517);
                        }
                    } else {
                        this.field5719 = arg2.method1767(1930493576);
                    }
                } else {
                    this.field5716 = arg2.method1767(1930493576);
                }
            } else {
                this.field5725 = arg2.method1738((byte) 55);
            }
        } else {
            this.field5707 = arg2.method1738((byte) 96);
        }
        ++field5726;
        if (arg1 != -11941) {
            this.method361(-37, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 469)
    public class393() {
        super(0, true);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V", line = 199)
    public static final void method2469(int arg0, int arg1) {
        class344.field5064 = arg0;
        ++field5723;
        class71.field929 = arg1;
        class4.field68 = -1;
        class132.method884(arg1);
    }

    @OriginalMember(owner = "client!s", name = "i", descriptor = "(I)V", line = 212)
    public static final void method2470(int arg0) {
        ++field5721;
        if (class79.field992 == null) {
            class79.field992 = new int[65536];
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            for (int var3 = 0; var3 < 65536; ++var3) {
                double var4 = (double) (63 & var3 >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) ((var3 & 915) >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (127 & var3) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (!(var8 < 0.5D)) {
                        var16 = var6 + var8 - var6 * var8;
                    } else {
                        var16 = (var6 + 1.0D) * var8;
                    }
                    double var18 = var8 * 2.0D + -var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (!(var4 * 6.0D < 1.0D)) {
                        if (!(var4 * 2.0D < 1.0D)) {
                            if (var4 * 3.0D < 2.0D) {
                                var12 = (var16 - var18) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                            } else {
                                var12 = var18;
                            }
                        } else {
                            var12 = var16;
                        }
                    } else {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    }
                    if (!(var20 * 6.0D < 1.0D)) {
                        if (!(var20 * 2.0D < 1.0D)) {
                            if (var20 * 3.0D < 2.0D) {
                                var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                            } else {
                                var10 = var18;
                            }
                        } else {
                            var10 = var16;
                        }
                    } else {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (!(var24 * 2.0D < 1.0D)) {
                            if (var24 * 3.0D < 2.0D) {
                                var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                            } else {
                                var14 = var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + var34 - -(var33 << 8);
                class79.field992[var3] = var35;
            }
            if (arg0 != -1) {
                method2469(68, -22);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)[I", line = 335)
    public final int[] method361(int arg0, byte arg1) {
        ++field5730;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            this.field5731 = null;
        }
        if (super.field2950.field4111) {
            int var4 = 0;
            int var5;
            for (var5 = class331.field4911[arg0] + this.field5711; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field5725 < ~var4 && this.field5731[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field5731[var4];
            int var9 = this.field5731[var4 + -1];
            if (this.field5709 + var9 < var5 && -this.field5709 + var8 > var5) {
                for (int var10 = 0; ~class202.field2852 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field5729 : -this.field5729;
                    int var13;
                    for (var13 = (this.field5718 * var12 >> 12) + class430.field6250[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field5707 > var11 && this.field5710[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field5710[var6][var11];
                    int var16 = this.field5710[var6][var14];
                    if (~var13 < ~(this.field5709 + var16) && -this.field5709 + var15 > var13) {
                        var3[var10] = this.field5714[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class224.method1542(var3, 0, class202.field2852, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V", line = 436)
    public static void method2471(byte arg0) {
        field5727 = null;
        if (arg0 != -14) {
            field5717 = -7;
        }
    }
}
