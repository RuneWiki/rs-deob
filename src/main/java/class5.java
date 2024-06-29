import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class5 extends class436 {

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    private int field67 = 4096;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "[I")
    private int[] field69 = new int[3];

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    private int field77 = 3216;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    private int field70 = 3216;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Ltc;")
    public static class196 field76 = new class196();

    @OriginalMember(owner = "client!il", name = "T", descriptor = "[I")
    public static int[] field80 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field81 = -13423323;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "[Z")
    public static boolean[] field83 = new boolean[5];

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field84 = 1;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "Lqj;")
    public static class296 field85;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "[[[Luk;")
    public static class142[][][] field79;

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 690)
    public class5() {
        super(1, true);
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V", line = 9)
    public static final void method39(int arg0) {
        class396.field5782 = 0;
        class163.field2296 = -3;
        class411.field5966 = -1;
        class24.field323 = 1;
        class220.field2894 = 0;
        if (arg0 != 32343) {
            method41(-115);
        }
        class286.field3937 = 0;
        ++field82;
        class28.field439 = false;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILeb;)V", line = 27)
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field73;
        if (arg0 == 34) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field70 = arg2.method2403((byte) 47);
                    }
                } else {
                    this.field77 = arg2.method2403((byte) 98);
                }
            } else {
                this.field67 = arg2.method2403((byte) 88);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V", line = 71)
    public static final void method40(int arg0) {
        ++field71;
        if (class24.field323 != 0 && class24.field323 != 5) {
            try {
                if (~(++class396.field5782) < -2001) {
                    if (class199.field2749 != null) {
                        class199.field2749.method1593(arg0 + 13369);
                        class199.field2749 = null;
                    }
                    if (~class220.field2894 <= -2) {
                        class163.field2296 = -5;
                        class24.field323 = 0;
                        return;
                    }
                    class24.field323 = 1;
                    if (class276.field3748 == class254.field3489) {
                        class254.field3489 = class281.field3863;
                    } else {
                        class254.field3489 = class276.field3748;
                    }
                    ++class220.field2894;
                    class396.field5782 = 0;
                }
                if (class24.field323 == 1) {
                    class311.field4250 = class204.field2772.method2239(class7.field115, class254.field3489, 0);
                    class24.field323 = 2;
                }
                if (~class24.field323 == -3) {
                    if (~class311.field4250.field4068 == -3) {
                        throw new IOException();
                    }
                    if (class311.field4250.field4068 != 1) {
                        return;
                    }
                    class199.field2749 = new class258((Socket) class311.field4250.field4070, class204.field2772);
                    class311.field4250 = null;
                    long var1 = class153.field2161 = class3.method17((byte) -93, class152.field2155);
                    int var3 = (int) (var1 >> 16 & 31L);
                    class442.field6400.field5273 = 0;
                    class442.field6400.method2396(14, 12450);
                    class442.field6400.method2396(var3, arg0 + 25816);
                    class199.field2749.method1579(0, 5000, class442.field6400.field5258, 2);
                    if (class326.field4451 != null) {
                        class326.field4451.method1475(923);
                    }
                    if (class64.field993 != null) {
                        class64.field993.method1475(923);
                    }
                    int var4 = class199.field2749.method1591(0);
                    if (class326.field4451 != null) {
                        class326.field4451.method1475(923);
                    }
                    if (class64.field993 != null) {
                        class64.field993.method1475(923);
                    }
                    if (~var4 != -1) {
                        class24.field323 = 0;
                        class163.field2296 = var4;
                        class199.field2749.method1593(3);
                        class199.field2749 = null;
                        return;
                    }
                    class24.field323 = 3;
                }
                if (arg0 != -13366) {
                    method43(-104);
                }
                if (class24.field323 == 3) {
                    if (~class199.field2749.method1580(1031) > -9) {
                        return;
                    }
                    class199.field2749.method1584(8, class393.field5747.field5258, 111, 0);
                    class393.field5747.field5273 = 0;
                    class369.field5239 = class393.field5747.method2397((byte) 126);
                    int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()), (int) (class369.field5239 >> 32), (int) class369.field5239 };
                    class442.field6400.field5273 = 0;
                    class442.field6400.method2396(10, 12450);
                    class442.field6400.method2386(var5[0], arg0 + 32690);
                    class442.field6400.method2386(var5[1], 19324);
                    class442.field6400.method2386(var5[2], 19324);
                    class442.field6400.method2386(var5[3], 19324);
                    class442.field6400.method2409(class3.method17((byte) -93, class152.field2155), true);
                    class442.field6400.method2412(-127, class401.field5857);
                    class442.field6400.method2380(class163.field2289, class184.field2577, -16385);
                    class367.field5147.field5273 = 0;
                    if (~class79.field1220 == -41) {
                        class367.field5147.method2396(18, 12450);
                    } else {
                        class367.field5147.method2396(16, 12450);
                    }
                    class367.field5147.method2416(22064, class442.field6400.field5273 + (161 - -class322.method2036(class441.field6390, -71)));
                    class367.field5147.method2386(563, 19324);
                    class367.field5147.method2396(class401.field5853, 12450);
                    class367.field5147.method2396(class162.method1075(-45), 12450);
                    class367.field5147.method2416(22064, class194.field2696);
                    class367.field5147.method2416(22064, class243.field3359);
                    class367.field5147.method2396(class67.field1056, 12450);
                    class68.method466((byte) 19, class367.field5147);
                    class367.field5147.method2412(-110, class441.field6390);
                    class367.field5147.method2386(class237.field3231, arg0 ^ -32586);
                    class367.field5147.method2386(class223.method1424((byte) -101), 19324);
                    class249.field3451 = true;
                    class367.field5147.method2416(22064, class445.field6418);
                    class367.field5147.method2386(class215.field2861.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class169.field2411.method1891(true), 19324);
                    class367.field5147.method2386(class287.field3989.method1891(true), 19324);
                    class367.field5147.method2386(class163.field2282.method1891(true), arg0 ^ -32586);
                    class367.field5147.method2386(class367.field5152.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class215.field2857.method1891(true), 19324);
                    class367.field5147.method2386(class331.field4488.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class387.field5645.method1891(true), 19324);
                    class367.field5147.method2386(class353.field4943.method1891(true), arg0 ^ -32586);
                    class367.field5147.method2386(class271.field3704.method1891(true), 19324);
                    class367.field5147.method2386(class33.field516.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class169.field2412.method1891(true), 19324);
                    class367.field5147.method2386(class146.field2121.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class435.field6251.method1891(true), 19324);
                    class367.field5147.method2386(class82.field1265.method1891(true), 19324);
                    class367.field5147.method2386(field85.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class2.field16.method1891(true), 19324);
                    class367.field5147.method2386(class265.field3618.method1891(true), 19324);
                    class367.field5147.method2386(class3.field33.method1891(true), 19324);
                    class367.field5147.method2386(class109.field1612.method1891(true), 19324);
                    class367.field5147.method2386(class34.field533.method1891(true), arg0 + 32690);
                    class367.field5147.method2386(class408.field5923.method1891(true), 19324);
                    class367.field5147.method2386(class364.field5108.method1891(true), 19324);
                    class367.field5147.method2386(class441.field6379.method1891(true), arg0 ^ -32586);
                    class367.field5147.method2386(class368.field5161.method1891(true), 19324);
                    class367.field5147.method2386(class431.field6200.method1891(true), arg0 ^ -32586);
                    class367.field5147.method2386(class179.field2502.method1891(true), 19324);
                    class367.field5147.method2386(class229.field3049.method1891(true), 19324);
                    class367.field5147.method2386(class190.field2638.method1891(true), 19324);
                    class367.field5147.method2434(class442.field6400.field5258, 713288968, 0, class442.field6400.field5273);
                    class199.field2749.method1579(0, 5000, class367.field5147.field5258, class367.field5147.field5273);
                    class442.field6400.method161(26134, var5);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class393.field5747.method161(26134, var5);
                    class24.field323 = 4;
                }
                if (class24.field323 == 4) {
                    if (class199.field2749.method1580(1031) < 1) {
                        return;
                    }
                    int var7 = class199.field2749.method1591(arg0 ^ -13366);
                    if (~var7 == -22) {
                        class24.field323 = 7;
                    } else if (var7 != 29) {
                        if (~var7 == -2) {
                            class163.field2296 = var7;
                            class24.field323 = 5;
                            return;
                        }
                        if (~var7 != -3) {
                            if (var7 == 15) {
                                class24.field323 = 0;
                                class163.field2296 = var7;
                                return;
                            }
                            if (~var7 == -24 && ~class220.field2894 > -2) {
                                class396.field5782 = 0;
                                ++class220.field2894;
                                class24.field323 = 1;
                                class199.field2749.method1593(3);
                                class199.field2749 = null;
                                return;
                            }
                            class24.field323 = 0;
                            class163.field2296 = var7;
                            class199.field2749.method1593(3);
                            class199.field2749 = null;
                            return;
                        }
                        class24.field323 = 8;
                    } else {
                        class24.field323 = 10;
                    }
                }
                if (~class24.field323 == -7) {
                    class442.field6400.field5273 = 0;
                    class442.field6400.method158((byte) 7, 17);
                    class199.field2749.method1579(0, 5000, class442.field6400.field5258, class442.field6400.field5273);
                    class24.field323 = 4;
                } else if (~class24.field323 == -8) {
                    if (class199.field2749.method1580(1031) >= 1) {
                        class286.field3937 = (class199.field2749.method1591(0) - -3) * 60;
                        class24.field323 = 0;
                        class163.field2296 = 21;
                        class199.field2749.method1593(arg0 + 13369);
                        class199.field2749 = null;
                    }
                } else if (~class24.field323 == -11) {
                    if (class199.field2749.method1580(1031) >= 1) {
                        class411.field5966 = class199.field2749.method1591(arg0 + 13366);
                        class24.field323 = 0;
                        class163.field2296 = 29;
                        class199.field2749.method1593(3);
                        class199.field2749 = null;
                    }
                } else {
                    if (class24.field323 == 8) {
                        if (~class199.field2749.method1580(1031) > -15) {
                            return;
                        }
                        class199.field2749.method1584(14, class393.field5747.field5258, arg0 ^ -13405, 0);
                        class393.field5747.field5273 = 0;
                        class204.field2771 = class393.field5747.method2429(0);
                        class46.field718 = class393.field5747.method2429(arg0 ^ -13366);
                        class396.field5786 = class393.field5747.method2429(0) == 1;
                        class192.field2665 = ~class393.field5747.method2429(arg0 + 13366) == -2;
                        class140.field1986 = class393.field5747.method2429(0) == 1;
                        class190.field2645 = class393.field5747.method2429(0) == 1;
                        class354.field4962 = ~class393.field5747.method2429(arg0 ^ -13366) == -2;
                        class414.field6012 = class393.field5747.method2403((byte) 57);
                        class266.field3633 = ~class393.field5747.method2429(0) == -2;
                        class293.field4055 = class393.field5747.method2429(0) == 1;
                        class137.method945(-112, class293.field4055);
                        class194.method1293(-25870, class293.field4055);
                        class22.method149(arg0 ^ 13423, class293.field4055);
                        if ((!class396.field5786 || class140.field1986) && !class266.field3633) {
                            try {
                                class274.method1687(class204.field2772.field4888, -5778, "unzap");
                            } catch (Throwable var10) {
                            }
                        } else {
                            try {
                                class274.method1687(class204.field2772.field4888, -5778, "zap");
                            } catch (Throwable var9) {
                            }
                        }
                        if (~class67.field1043 == -1) {
                            try {
                                class274.method1687(class204.field2772.field4888, -5778, "loggedin");
                            } catch (Throwable var8) {
                            }
                        }
                        class234.field3188 = class393.field5747.method160((byte) 96);
                        class120.field1712 = class393.field5747.method2403((byte) 108);
                        class24.field323 = 9;
                    }
                    if (class24.field323 == 9) {
                        if (~class199.field2749.method1580(arg0 + 14397) <= ~class120.field1712) {
                            class393.field5747.field5273 = 0;
                            class199.field2749.method1584(class120.field1712, class393.field5747.field5258, 98, 0);
                            class163.field2296 = 2;
                            class24.field323 = 0;
                            class9.method63(arg0 + 13281);
                            class419.field6055 = -1;
                            class287.method1859(false, arg0 + 13249);
                            class234.field3188 = -1;
                        }
                    }
                }
            } catch (IOException var11) {
                if (class199.field2749 != null) {
                    class199.field2749.method1593(3);
                    class199.field2749 = null;
                }
                if (~class220.field2894 > -2) {
                    class396.field5782 = 0;
                    ++class220.field2894;
                    if (~class276.field3748 != ~class254.field3489) {
                        class254.field3489 = class276.field3748;
                    } else {
                        class254.field3489 = class281.field3863;
                    }
                    class24.field323 = 1;
                } else {
                    class24.field323 = 0;
                    class163.field2296 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V", line = 456)
    public static final void method41(int arg0) {
        ++field74;
        class216.field2866.method1418((byte) -97);
        class339.field4744.method1418((byte) -86);
        if (arg0 >= -7) {
            field85 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V", line = 473)
    private final void method42(boolean arg0) {
        ++field68;
        double var2 = Math.cos((double) ((float) this.field70 / 4096.0F));
        this.field69[0] = (int) (Math.sin((double) ((float) this.field77 / 4096.0F)) * var2 * 4096.0D);
        this.field69[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field77 / 4096.0F)));
        this.field69[2] = (int) (4096.0D * Math.sin((double) ((float) this.field70 / 4096.0F)));
        if (arg0) {
            this.field70 = -80;
        }
        int var4 = this.field69[0] * this.field69[0] >> 12;
        int var5 = this.field69[1] * this.field69[1] >> 12;
        int var6 = this.field69[2] * this.field69[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (var7 != 0) {
            this.field69[0] = (this.field69[0] << 12) / var7;
            this.field69[2] = (this.field69[2] << 12) / var7;
            this.field69[1] = (this.field69[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V", line = 504)
    public static void method43(int arg0) {
        field79 = null;
        field76 = null;
        if (arg0 <= 99) {
            method45(24, -75, 86, (byte[]) null);
        }
        field83 = null;
        field80 = null;
        field85 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 519)
    public final void method44(int arg0) {
        ++field78;
        this.method42(false);
        if (arg0 != -14) {
            this.method18(-108, 78, (class371) null);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III[B)Z", line = 531)
    public static final boolean method45(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field72;
        boolean var4 = true;
        if (arg2 <= 35) {
            field85 = null;
        }
        class371 var5 = new class371(arg3);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method2398(102);
            if (~var7 == -1) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class369 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method2433(-66);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method2429(0);
                                    }
                                    int var10 = var5.method2433(-85);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 + -1;
                                    int var11 = 63 & var8;
                                    int var12 = var8 >> 6 & 63;
                                    var13 = var5.method2429(0) >> 2;
                                    var14 = arg1 + var12;
                                    var15 = arg0 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (~(class432.field6220 + -1) >= ~var14);
                    } while (var15 >= class267.field3646 + -1);
                    var16 = class310.method1961(var6, (byte) 35);
                } while (var13 == 22 && !class21.field280 && var16.field5221 == 0 && var16.field5192 != 1 && !var16.field5207);
                if (!var16.method2375((byte) 45)) {
                    ++class64.field989;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[I", line = 615)
    public final int[] method14(int arg0, int arg1) {
        ++field75;
        int[] var3 = super.field6258.method2688((byte) -125, arg0);
        if (arg1 != 18338) {
            method43(89);
        }
        if (super.field6258.field6138) {
            int var4 = class188.field2611 * this.field67 >> 12;
            int[] var5 = this.method2729(0, arg1 ^ 18338, class190.field2634 & arg0 + -1);
            int[] var6 = this.method2729(0, arg1 + -18338, arg0);
            int[] var7 = this.method2729(0, arg1 ^ 18338, arg0 - -1 & class190.field2634);
            for (int var8 = 0; class43.field653 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class278.field3758 & var8 + -1] + -var6[class278.field3758 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class154.field2180[((var12 - -1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field69[2] * var16 >> 12;
                int var18 = this.field69[1] * var15 >> 12;
                int var19 = this.field69[0] * var14 >> 12;
                var3[var8] = var19 - -var17 + var18;
            }
        }
        return var3;
    }
}
