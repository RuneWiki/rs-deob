import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class449 extends class214 {

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field6541 = 0;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private int field6550 = 10;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field6552 = 2048;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Ltm;")
    public static class334 field6542 = new class334(23, 8);

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lcd;")
    public static class22 field6549;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Lit;")
    public static class34 field6553;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[I")
    private int[] field6544;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "[I")
    private int[] field6545;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method64(int arg0, byte arg1) {
        ++field6551;
        int[] var3 = super.field3544.method3869(arg0, -118);
        if (arg1 != 5) {
            method2760((byte) -61);
        }
        if (super.field3544.field9836) {
            int var4 = class131.field2138[arg0];
            if (this.field6541 == 0) {
                short var5 = 0;
                for (int var6 = 0; this.field6550 > var6; ++var6) {
                    if (~var4 <= ~this.field6545[var6] && ~this.field6545[var6 + 1] < ~var4) {
                        if (~var4 > ~this.field6544[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class571.method3309(var3, 0, class626.field8787, var5);
            } else {
                for (int var7 = 0; ~class626.field8787 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class592.field8328[var7];
                    int var11 = this.field6541;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field6550; ++var12) {
                        if (~var8 <= ~this.field6545[var12] && ~this.field6545[var12 + 1] < ~var8) {
                            if (var8 < this.field6544[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V", line = 120)
    public static final void method2759(int arg0) {
        ++field6546;
        class520.method3097(false, 16);
        if (~class741.field10389 <= -1 && class741.field10389 != 0) {
            class526.method3125(1221653740, class741.field10389, false);
            class741.field10389 = -1;
        }
        if (arg0 != 10) {
            field6553 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 139)
    public final void method65(int arg0) {
        if (arg0 < 48) {
            field6542 = null;
        }
        ++field6548;
        this.method2762(127);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(B)V", line = 153)
    public static void method2760(byte arg0) {
        field6553 = null;
        field6542 = null;
        field6549 = null;
        if (arg0 != -117) {
            field6553 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 663)
    public class449() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V", line = 172)
    public static final void method2761(int arg0) {
        class549.method3206(false, false);
        ++field6540;
        class190.field3194 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class404.field5987.length; ++var2) {
            if (class387.field5799[var2] != -1 && class404.field5987[var2] == null) {
                class404.field5987[var2] = class193.field3342.method2624(0, class387.field5799[var2], 0);
                if (class404.field5987[var2] == null) {
                    var1 = false;
                    ++class190.field3194;
                }
            }
            if (class339.field4966[var2] != -1 && class730.field10245[var2] == null) {
                class730.field10245[var2] = class193.field3342.method2616(class184.field3099[var2], 38, 0, class339.field4966[var2]);
                if (class730.field10245[var2] == null) {
                    ++class190.field3194;
                    var1 = false;
                }
            }
            if (~class304.field4635[var2] != 0 && class339.field4964[var2] == null) {
                class339.field4964[var2] = class193.field3342.method2624(0, class304.field4635[var2], 0);
                if (class339.field4964[var2] == null) {
                    ++class190.field3194;
                    var1 = false;
                }
            }
            if (~class666.field9464[var2] != 0 && class693.field9833[var2] == null) {
                class693.field9833[var2] = class193.field3342.method2624(0, class666.field9464[var2], 0);
                if (class693.field9833[var2] == null) {
                    var1 = false;
                    ++class190.field3194;
                }
            }
            if (class298.field4520 != null && class63.field991[var2] == null && class298.field4520[var2] != -1) {
                class63.field991[var2] = class193.field3342.method2616(class184.field3099[var2], 107, 0, class298.field4520[var2]);
                if (class63.field991[var2] == null) {
                    var1 = false;
                    ++class190.field3194;
                }
            }
        }
        if (class254.field4024 == null) {
            if (class158.field2456 != null && class147.field2306.method2608(class158.field2456.field7882 + "_staticelements", false)) {
                if (class147.field2306.method2642(-29983, class158.field2456.field7882 + "_staticelements")) {
                    class254.field4024 = class238.method1652(class147.field2306, (byte) -63, class158.field2456.field7882 + "_staticelements", class384.field5763);
                } else {
                    var1 = false;
                    ++class190.field3194;
                }
            } else {
                class254.field4024 = new class676(0);
            }
        }
        if (!var1) {
            class559.field7939 = 1;
        } else {
            boolean var3 = true;
            class348.field5128 = 0;
            for (int var4 = 0; var4 < class404.field5987.length; ++var4) {
                byte[] var22 = class730.field10245[var4];
                if (var22 != null) {
                    int var23 = (class205.field3445[var4] >> 8) * 64 + -class265.field4123;
                    int var24 = (255 & class205.field3445[var4]) * 64 + -class723.field10155;
                    if (~class157.field2437 != -1) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class508.method3062(-9, class314.field4720, var23, class191.field3229, var22, var24);
                }
                byte[] var25 = class693.field9833[var4];
                if (var25 != null) {
                    int var26 = (class205.field3445[var4] >> 8) * 64 + -class265.field4123;
                    int var27 = (class205.field3445[var4] & 255) * 64 - class723.field10155;
                    if (~class157.field2437 != -1) {
                        var27 = 10;
                        var26 = 10;
                    }
                    var3 &= class508.method3062(-39, class314.field4720, var26, class191.field3229, var25, var27);
                }
            }
            if (!var3) {
                class559.field7939 = 2;
            } else {
                if (~class559.field7939 != -1) {
                    class104.method853(class594.field8343, class641.field9005.method3621(99, class467.field6804) + "<br>(100%)", class364.field5573, (byte) -10, class74.field1105, true);
                }
                class493.method2998((byte) -106);
                class127.method975((byte) -81);
                class642.method3624((byte) -83);
                boolean var5 = false;
                if (class364.field5573.method400() && class654.field9289.field5440.method476(3) == 2) {
                    for (int var6 = 0; class404.field5987.length > var6; ++var6) {
                        if (class693.field9833[var6] != null || class339.field4964[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class654.field9289.field5436.method2435(3) == 1) {
                    var7 = class560.field7940[class695.field9864];
                } else {
                    var7 = class293.field4503[class695.field9864];
                }
                if (class364.field5573.method268()) {
                    ++var7;
                }
                class488.method2969(class364.field5573, class564.field7991, 9, 4, class191.field3229, class314.field4720, var7, var5, class364.field5573.method356() > 0);
                class371.method2365(class383.field5751);
                if (class383.field5751 == 0) {
                    class44.method461((class400) null);
                } else {
                    class44.method461(class236.field3788);
                }
                int var8 = 0;
                int var9 = -52 / ((1 - arg0) / 59);
                while (var8 < 4) {
                    class247.field3958[var8].method1650((byte) -22);
                    ++var8;
                }
                class683.method3813(96);
                class313.method2062(false, (byte) 43);
                class457.method2798(-106);
                class93.field1395 = null;
                class701.field9908 = false;
                class493.method2998((byte) -114);
                System.gc();
                class549.method3206(true, false);
                class377.method2378(20000);
                class130.field2128 = class654.field9289.field5431.method2801(3);
                class281.field4367 = ~class84.field1246 <= -97;
                class55.field873 = ~class654.field9289.field5440.method476(3) == -3;
                class691.field9801 = ~class654.field9289.field5447.method4104(3) == -2;
                class435.field6352 = ~class654.field9289.field5453.method3878(3) != -2 ? class405.field6003 : -1;
                class35.field324 = ~class654.field9289.field5427.method3956(3) == -2;
                class118.field1815 = ~class654.field9289.field5448.method3596(3) == -2;
                class343.field5086 = new class460(4, class191.field3229, class314.field4720, false);
                if (class157.field2437 == 0) {
                    class567.method3293(class404.field5987, (byte) -67, class343.field5086);
                } else {
                    class562.method3250(class343.field5086, class404.field5987, 3);
                }
                class190.method1437(class314.field4720 >> 4, 0, class191.field3229 >> 4);
                class516.method3089(-1);
                if (var5) {
                    class733.method4095(true);
                    class679.field9571 = new class460(1, class191.field3229, class314.field4720, true);
                    if (~class157.field2437 == -1) {
                        class567.method3293(class339.field4964, (byte) 110, class679.field9571);
                        class549.method3206(true, false);
                    } else {
                        class562.method3250(class679.field9571, class339.field4964, 3);
                        class549.method3206(true, false);
                    }
                    class679.field9571.method986(class343.field5086.field1962[0], (byte) 105, 0);
                    class679.field9571.method982(class364.field5573, (class238[]) null, (int[][][]) null, (byte) 36);
                    class733.method4095(false);
                }
                class343.field5086.method982(class364.field5573, class247.field3958, !var5 ? null : class679.field9571.field1962, (byte) 36);
                if (~class157.field2437 == -1) {
                    class549.method3206(true, false);
                    class524.method3119(class343.field5086, 16711680, class730.field10245);
                    if (class63.field991 != null) {
                        class291.method1898(-118);
                    }
                } else {
                    class549.method3206(true, false);
                    class231.method1602(class343.field5086, class730.field10245, -5808);
                }
                class127.method975((byte) 36);
                if (class84.field1246 < 96) {
                    class45.method467(-117);
                }
                class549.method3206(true, false);
                class343.field5086.method985(25305, class364.field5573, !var5 ? null : class152.field2374[0], (class339) null);
                class343.field5086.method2814(0, false, class364.field5573);
                class549.method3206(true, false);
                if (var5) {
                    class733.method4095(true);
                    class549.method3206(true, false);
                    if (~class157.field2437 == -1) {
                        class524.method3119(class679.field9571, 16711680, class693.field9833);
                    } else {
                        class231.method1602(class679.field9571, class693.field9833, -5808);
                    }
                    class127.method975((byte) -84);
                    class549.method3206(true, false);
                    class679.field9571.method985(25305, class364.field5573, (class339) null, class121.field1867[0]);
                    class679.field9571.method2814(0, true, class364.field5573);
                    class549.method3206(true, false);
                    class733.method4095(false);
                }
                class543.method3177(9999);
                int var10 = class343.field5086.field6670;
                if (~var10 < ~class582.field8234) {
                    var10 = class582.field8234;
                }
                if (var10 < class582.field8234 - 1) {
                    var10 = class582.field8234 + -1;
                }
                if (class654.field9289.field5453.method3878(3) == 0) {
                    class304.method2001(var10);
                } else {
                    class304.method2001(0);
                }
                for (int var11 = 0; ~var11 > -5; ++var11) {
                    for (int var20 = 0; class191.field3229 > var20; ++var20) {
                        for (int var21 = 0; class314.field4720 > var21; ++var21) {
                            class7.method30(var20, var21, var11, (byte) -55);
                        }
                    }
                }
                class227.method1586((byte) 99);
                class493.method2998((byte) -106);
                class599.method3441(-1);
                class127.method975((byte) 19);
                class33.method170(-94);
                if (class530.field7619 != null && class166.field2624 != null && ~class521.field7529 == -12) {
                    ++class387.field5812;
                    class540 var12 = class257.method1732(true, class301.field4588, class655.field9332);
                    var12.field7707.method1970((byte) 29, 1057001181);
                    class756.method4211(var12, 111);
                }
                if (~class157.field2437 == -1) {
                    int var13 = (-(class191.field3229 >> 4) + class567.field8048) / 8;
                    int var14 = (class567.field8048 - -(class191.field3229 >> 4)) / 8;
                    int var15 = (class319.field4745 - (class314.field4720 >> 4)) / 8;
                    int var16 = ((class314.field4720 >> 4) + class319.field4745) / 8;
                    for (int var17 = var13 + -1; ~(var14 - -1) <= ~var17; ++var17) {
                        for (int var18 = var15 + -1; var16 + 1 >= var18; ++var18) {
                            if (var17 < var13 || ~var17 < ~var14 || var15 > var18 || var16 < var18) {
                                class193.field3342.method2622(16, "m" + var17 + "_" + var18);
                                class193.field3342.method2622(16, "l" + var17 + "_" + var18);
                            }
                        }
                    }
                }
                if (~class521.field7529 == -5) {
                    class658.method3704(-5697, 3);
                } else if (class521.field7529 != 8) {
                    class658.method3704(-5697, 10);
                    if (class166.field2624 != null) {
                        class540 var19 = class257.method1732(true, class54.field863, class655.field9332);
                        class756.method4211(var19, 117);
                    }
                } else {
                    class658.method3704(-5697, 7);
                }
                class23.method128((byte) -116);
                class493.method2998((byte) -104);
                class545.method3198((byte) -126);
                class245.field3947 = true;
                if (class524.field7555) {
                    class400.method2484(26852, "Took: " + (class18.method109(-11121) - class583.field8242) + "ms");
                    class524.field7555 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILofa;I)V", line = 666)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field6541 = arg1.method1987(-75);
                }
            } else {
                this.field6552 = arg1.method1989((byte) -72);
            }
        } else {
            this.field6550 = arg1.method1987(-121);
        }
        if (arg0 < 92) {
            field6542 = null;
        }
        ++field6543;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V", line = 715)
    private final void method2762(int arg0) {
        ++field6547;
        this.field6545 = new int[this.field6550 + 1];
        this.field6544 = new int[this.field6550 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field6550;
        int var4 = this.field6552 * var3 >> 12;
        int var5 = 0;
        int var6 = 48 / ((arg0 - 79) / 35);
        while (var5 < this.field6550) {
            this.field6545[var5] = var2;
            this.field6544[var5] = var2 + var4;
            var2 += var3;
            ++var5;
        }
        this.field6545[this.field6550] = 4096;
        this.field6544[this.field6550] = 4096 - -this.field6544[0];
    }
}
