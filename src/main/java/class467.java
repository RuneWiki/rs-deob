import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class467 extends class264 {

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    private int field6580 = 0;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    private int field6588 = 4096;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Lap;")
    public static class310 field6581 = new class310(10, 7);

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "Ljava/awt/Frame;")
    public static Frame field6587;

    static {
        new class151("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLkk;I)V", line = 5)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field6584;
        if (arg0 >= 31) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field3794 = arg1.method1172((byte) -112) == 1;
                    }
                } else {
                    this.field6588 = arg1.method1134(-16848);
                }
            } else {
                this.field6580 = arg1.method1134(-16848);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method90(int arg0, int arg1) {
        ++field6585;
        int[] var3 = super.field3808.method958((byte) 24, arg0);
        if (arg1 != 21034) {
            method2783(-28, -102, -117, 123, (byte) 90);
        }
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -56, 0);
            for (int var5 = 0; class478.field6792 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field6580 < ~var6) {
                    var3[var5] = this.field6580;
                } else if (this.field6588 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field6588;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)[[I", line = 91)
    public final int[][] method5(byte arg0, int arg1) {
        ++field6579;
        int[][] var3 = super.field3816.method1928((byte) 60, arg1);
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 114, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class478.field6792; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field6580) {
                    if (~this.field6588 > ~var12) {
                        var8[var11] = this.field6588;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field6580;
                }
                if (var13 >= this.field6580) {
                    if (~var13 < ~this.field6588) {
                        var9[var11] = this.field6588;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field6580;
                }
                if (~this.field6580 >= ~var14) {
                    if (~this.field6588 > ~var14) {
                        var10[var11] = this.field6588;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field6580;
                }
            }
        }
        return arg0 != 116 ? null : var3;
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 168)
    public static void method2779(int arg0) {
        field6587 = null;
        field6581 = null;
        if (arg0 != -25880) {
            field6581 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(CI)Z", line = 181)
    public static final boolean method2780(char arg0, int arg1) {
        ++field6589;
        if (arg1 != 48) {
            return true;
        } else {
            return arg0 >= '0' && arg0 <= '9';
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 195)
    public class467() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V", line = 198)
    public static final void method2781(int arg0, boolean arg1) {
        if (arg0 != 8) {
            field6587 = null;
        }
        while (class46.field710.method716(class126.field1718, (byte) 123) >= 15) {
            int var2 = class46.field710.method712(false, 15);
            if (~var2 == -32768) {
                break;
            }
            boolean var3 = false;
            if (class163.field2377[var2] == null) {
                class163.field2377[var2] = new class361();
                var3 = true;
                class163.field2377[var2].field5751 = var2;
            }
            class361 var4 = class163.field2377[var2];
            class193.field2873[class24.field257++] = var2;
            var4.field5762 = class364.field5010;
            if (var4.field4952 != null && var4.field4952.method223((byte) -106)) {
                class31.method199(60, var4);
            }
            int var5 = (515899399 & 4 + class46.field710.method712(false, 3)) << 11;
            var4.method2224((byte) 17, class363.field5001.method1997(class46.field710.method712(false, 14), 24749));
            int var6 = class46.field710.method712(false, 1);
            int var7 = class46.field710.method712(false, 2);
            int var8;
            if (arg1) {
                var8 = class46.field710.method712(false, 8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class46.field710.method712(false, 5);
                if (~var8 < -16) {
                    var8 -= 32;
                }
            }
            int var9;
            if (arg1) {
                var9 = class46.field710.method712(false, 8);
                if (~var9 < -128) {
                    var9 -= 256;
                }
            } else {
                var9 = class46.field710.method712(false, 5);
                if (~var9 < -16) {
                    var9 -= 32;
                }
            }
            int var10 = class46.field710.method712(false, 1);
            if (var10 == 1) {
                class22.field252[class53.field789++] = var2;
            }
            var4.method2501(false, var4.field4952.field400);
            var4.field5780 = var4.field4952.field426 << 3;
            if (~var4.field5780 != -1) {
                if (var3) {
                    var4.method2499((byte) -29, var5);
                }
            } else {
                var4.method2499((byte) -29, 0);
            }
            var4.method2216(var4.method245(4452), -18052, class262.field3781.field5807[0] - -var9, class262.field3781.field5811[0] - -var8, var7, var6 == 1);
            if (var4.field4952.method223((byte) -122)) {
                class68.method634(var4, var4.field5811[0], 0, arg0 ^ 136, var4.field5807[0], var4.field4531, (class39) null, (class267) null);
            }
        }
        ++field6583;
        class46.field710.method715((byte) 124);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lvc;I)V", line = 312)
    public static final void method2782(class89 arg0, int arg1) {
        ++field6586;
        int var2 = class104.field1469;
        int var3 = class167.field2424;
        int var4 = class315.field4455;
        int var5 = class433.field6135 - 3;
        byte var6 = 20;
        if (class243.field3529 == null || class372.field5119 == null) {
            if (class454.field6440.method2627((byte) 64, class169.field2454) && class454.field6440.method2627((byte) 121, class394.field5442)) {
                class243.field3529 = arg0.method302(class355.method2187(class454.field6440, class169.field2454, 0), true);
                class355 var7 = class355.method2187(class454.field6440, class394.field5442, 0);
                class372.field5119 = arg0.method302(var7, true);
                var7.method2198();
                class382.field5243 = arg0.method302(var7, true);
            } else {
                arg0.method438(var2, var3, var4, var6, class313.field4427 | -class412.field5635 + 255 << 24, 1);
            }
        }
        if (class243.field3529 != null && class372.field5119 != null) {
            int var8 = (-(class372.field5119.method1293() * 2) + var4) / class243.field3529.method1293();
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                class243.field3529.method2493(var2 + class372.field5119.method1293() - -(class243.field3529.method1293() * var9), var3);
            }
            class372.field5119.method2493(var2, var3);
            class382.field5243.method2493(var2 - (-var4 + class382.field5243.method1293()), var3);
        }
        class408.field5584.method1383(class122.field1665 | -16777216, false, var3 - -14, class462.field6526.method1078(class66.field967, 100), -1, var2 - -3);
        arg0.method438(var2, var3 - -var6, var4, -var6 + var5, class313.field4427 | -class412.field5635 + 255 << 24, 1);
        int var10 = class175.field2661.method1625((byte) -128);
        int var11 = class175.field2661.method1617(false);
        int var12 = 0;
        for (class73 var13 = (class73) class6.field38.method775(1); var13 != null; var13 = (class73) class6.field38.method763(0)) {
            int var30 = (class303.field4310 + -1 + -var12) * 16 + var6 + var3 + 13;
            if (var10 > var2 && var2 + var4 > var10 && var30 + -13 < var11 && ~var11 > ~(var30 + 4) && var13.field1046) {
                arg0.method438(var2, var30 + -12, var4, 16, class279.field4011 | -class227.field3280 + 255 << 24, 1);
            }
            ++var12;
        }
        if ((class76.field1131 == null || class55.field814 == null || client.field875 == null) && class454.field6440.method2627((byte) 37, class414.field5683) && class454.field6440.method2627((byte) 123, class194.field2879) && class454.field6440.method2627((byte) 56, class343.field4742)) {
            class355 var14 = class355.method2187(class454.field6440, class194.field2879, 0);
            class55.field814 = arg0.method302(var14, true);
            var14.method2198();
            class325.field4525 = arg0.method302(var14, true);
            class76.field1131 = arg0.method302(class355.method2187(class454.field6440, class414.field5683, 0), true);
            class355 var15 = class355.method2187(class454.field6440, class343.field4742, 0);
            client.field875 = arg0.method302(var15, true);
            var15.method2198();
            class402.field5519 = arg0.method302(var15, true);
        }
        if (class76.field1131 != null && class55.field814 != null && client.field875 != null) {
            int var16 = (-(client.field875.method1293() * 2) + var4) / class76.field1131.method1293();
            for (int var17 = 0; ~var16 < ~var17; ++var17) {
                class76.field1131.method2493(client.field875.method1293() + (var2 - -(var17 * class76.field1131.method1293())), var5 + var3 + -class76.field1131.method1287());
            }
            int var18 = (var5 - (var6 + client.field875.method1287())) / class55.field814.method1287();
            for (int var19 = 0; var19 < var18; ++var19) {
                class55.field814.method2493(var2, var6 + (var3 - -(class55.field814.method1287() * var19)));
                class325.field4525.method2493(var2 + var4 + -class325.field4525.method1293(), var3 - -var6 + var19 * class55.field814.method1287());
            }
            client.field875.method2493(var2, var5 + (var3 - client.field875.method1287()));
            class402.field5519.method2493(var4 + var2 + -client.field875.method1293(), var5 + (var3 - client.field875.method1287()));
        }
        int var20 = 0;
        if (arg1 != -9347) {
            field6581 = null;
        }
        for (class73 var21 = (class73) class6.field38.method775(1); var21 != null; var21 = (class73) class6.field38.method763(0)) {
            int var22 = (class303.field4310 + -1 - var20) * 16 + var3 + 13 + var6;
            int var23 = class122.field1665 | -16777216;
            if (var2 < var10 && var2 + var4 > var10 && var11 > var22 + -13 && var22 + 4 > var11 && var21.field1046) {
                var23 = -16777216 | class427.field5955;
            }
            int[] var24 = null;
            if (!class367.method2243((byte) -104, var21.field1048)) {
                if (var21.field1047 == -1) {
                    if (!class480.method2835(var21.field1048, 87)) {
                        if (class264.method1784((byte) 110, var21.field1048)) {
                            Object var25 = null;
                            class267 var26;
                            if (~var21.field1048 != -1002) {
                                var26 = class468.field6599.method506(-123, (int) (var21.field1055 >>> 32 & 2147483647L));
                            } else {
                                var26 = class468.field6599.method506(-121, (int) var21.field1055);
                            }
                            if (var26.field3846 != null) {
                                var26 = var26.method1799(class416.field5691, (byte) -111);
                            }
                            if (var26 != null) {
                                var24 = var26.field3864;
                            }
                        }
                    } else {
                        class361 var27 = class163.field2377[(int) var21.field1055];
                        if (var27 != null) {
                            class37 var28 = var27.field4952;
                            if (var28.field434 != null) {
                                var28 = var28.method232(class416.field5691, -1);
                            }
                            if (var28 != null) {
                                var24 = var28.field416;
                            }
                        }
                    }
                } else {
                    var24 = class373.field5128.method1644(var21.field1047, 93).field2158;
                }
            } else {
                var24 = class373.field5128.method1644((int) var21.field1055, 122).field2158;
            }
            String var29 = class25.method173(31230, var21);
            if (var24 != null) {
                var29 = var29 + class401.method2415(var24, 947);
            }
            class408.field5584.method1390(16777215, var29, var22, class217.field3142, 0, class387.field5303, var2 - -3, var23);
            if (var21.field1052) {
                class294.field4151.method2493(class402.field5516.method1354((byte) -80, var29) + var2 + 5, var22 + -12);
            }
            ++var20;
        }
        class297.method1925(class315.field4455, 0, class167.field2424, class433.field6135, class104.field1469);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIB)V", line = 514)
    public static final void method2783(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~class295.field4153 >= ~(-arg1 + arg0) && ~class103.field1457 <= ~(arg0 + arg1) && ~(-arg1 + arg2) <= ~class444.field6338 && class151.field2091 >= arg2 - -arg1) {
            class108.method859(arg0, arg2, -34, arg1, arg3);
        } else {
            class464.method2771((byte) 66, arg1, arg3, arg0, arg2);
        }
        if (arg4 != -58) {
            method2782((class89) null, 114);
        }
        ++field6582;
    }
}
