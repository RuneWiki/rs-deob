import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class123 extends class98 {

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    private int field1516 = -1;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "J")
    public static long field1519 = 0L;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static int field1518 = 500;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "Ltq;")
    public static class376 field1514;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "Ltq;")
    public static class376 field1515;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "[I")
    public static int[] field1511;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "[I")
    public int[] field1513;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "[[I")
    public static int[][] field1507;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V")
    public static void method779(int arg0) {
        field1511 = null;
        field1515 = null;
        field1514 = null;
        if (arg0 == -30516) {
            field1507 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)I")
    public final int method543(byte arg0) {
        if (arg0 > -40) {
            field1518 = 9;
        }
        ++field1508;
        return this.field1516;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
    public static final void method780(int arg0, String arg1, String arg2, int arg3, int arg4, String arg5, int arg6, String arg7) {
        ++field1505;
        for (int var8 = 99; ~var8 < -1; --var8) {
            class63.field729[var8] = class63.field729[var8 + -1];
            class240.field3415[var8] = class240.field3415[var8 + -1];
            class258.field3688[var8] = class258.field3688[var8 + -1];
            class160.field2101[var8] = class160.field2101[var8 + -1];
            class29.field358[var8] = class29.field358[var8 + -1];
            class223.field3138[var8] = class223.field3138[var8 - 1];
            class55.field666[var8] = class55.field666[var8 - 1];
        }
        class63.field729[0] = arg6;
        class258.field3688[0] = arg2;
        class240.field3415[0] = arg3;
        class160.field2101[0] = arg1;
        class29.field358[0] = arg5;
        ++class286.field4014;
        class128.field1560 = class146.field1792;
        class223.field3138[0] = arg7;
        class55.field666[0] = arg0;
        if (arg4 < 72) {
            method779(-102);
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(B)V")
    public static final void method781(byte arg0) {
        ++field1512;
        class87.method470(false, (byte) 113);
        class331.field4684 = 0;
        boolean var1 = true;
        if (arg0 == 85) {
            for (int var2 = 0; var2 < class193.field2798.length; ++var2) {
                if (class36.field418[var2] != -1 && class193.field2798[var2] == null) {
                    class193.field2798[var2] = class311.field4389.method2431((byte) 116, class36.field418[var2], 0);
                    if (class193.field2798[var2] == null) {
                        var1 = false;
                        ++class331.field4684;
                    }
                }
                if (~class254.field3657[var2] != 0 && class212.field3019[var2] == null) {
                    class212.field3019[var2] = class311.field4389.method2422(class14.field182[var2], class254.field3657[var2], 0, class2.method10(arg0, -18286));
                    if (class212.field3019[var2] == null) {
                        ++class331.field4684;
                        var1 = false;
                    }
                }
                if (~class260.field3711[var2] != 0 && class366.field5187[var2] == null) {
                    class366.field5187[var2] = class311.field4389.method2431((byte) 87, class260.field3711[var2], 0);
                    if (class366.field5187[var2] == null) {
                        var1 = false;
                        ++class331.field4684;
                    }
                }
                if (class112.field1371[var2] != -1 && class109.field1346[var2] == null) {
                    class109.field1346[var2] = class311.field4389.method2431((byte) 81, class112.field1371[var2], 0);
                    if (class109.field1346[var2] == null) {
                        ++class331.field4684;
                        var1 = false;
                    }
                }
                if (class56.field678 != null && class340.field4822[var2] == null && class56.field678[var2] != -1) {
                    class340.field4822[var2] = class311.field4389.method2422(class14.field182[var2], class56.field678[var2], 0, arg0 + -18318);
                    if (class340.field4822[var2] == null) {
                        ++class331.field4684;
                        var1 = false;
                    }
                }
            }
            if (class330.field4667 == null) {
                if (class8.field125 != null && class4.field32.method2405(class8.field125.field4208 + "_staticelements", (byte) -65)) {
                    if (class4.field32.method2427((byte) 125, class8.field125.field4208 + "_staticelements")) {
                        class330.field4667 = class297.method1963(class4.field32, 14003, class8.field125.field4208 + "_staticelements", class190.field2742);
                    } else {
                        ++class331.field4684;
                        var1 = false;
                    }
                } else {
                    class330.field4667 = new class230(0);
                }
            }
            if (!var1) {
                class152.field1880 = 1;
            } else {
                boolean var3 = true;
                class322.field4589 = 0;
                for (int var4 = 0; class193.field2798.length > var4; ++var4) {
                    byte[] var20 = class212.field3019[var4];
                    if (var20 != null) {
                        int var21 = (class33.field380[var4] >> 8) * 64 + -class114.field1403;
                        int var22 = (255 & class33.field380[var4]) * 64 - class41.field496;
                        if (class63.field724) {
                            var22 = 10;
                            var21 = 10;
                        }
                        var3 &= class264.method1756(var22, var20, var21, 17934);
                    }
                    byte[] var23 = class109.field1346[var4];
                    if (var23 != null) {
                        int var24 = (class33.field380[var4] >> 8) * 64 + -class114.field1403;
                        int var25 = (class33.field380[var4] & 255) * 64 + -class41.field496;
                        if (class63.field724) {
                            var24 = 10;
                            var25 = 10;
                        }
                        var3 &= class264.method1756(var25, var23, var24, 17934);
                    }
                }
                if (!var3) {
                    class152.field1880 = 2;
                } else {
                    if (class152.field1880 != 0) {
                        class440.method2749((byte) -56, true, class248.field3544.method2331(arg0 ^ 76, class271.field3836) + "<br>(100%)", class73.field874);
                    }
                    class356.method2270(false);
                    class440.method2744(-19093);
                    boolean var5 = false;
                    if (class151.field1873.method599() && class254.field3656) {
                        for (int var6 = 0; class193.field2798.length > var6; ++var6) {
                            if (class109.field1346[var6] != null || class366.field5187[var6] != null) {
                                var5 = true;
                                break;
                            }
                        }
                    }
                    int var7;
                    if (!class18.field210) {
                        var7 = class359.field5106[class68.field789];
                    } else {
                        var7 = class288.field4047[class68.field789];
                    }
                    if (class151.field1873.method650()) {
                        ++var7;
                    }
                    class388.method2483(4, class176.field2403, class383.field5395, var7, var5, class151.field1873.method602() > 0);
                    for (int var8 = 0; ~var8 > -5; ++var8) {
                        class102.field1247[var8].method741(false);
                    }
                    class255.method1719(618);
                    class266.method1764(20881, false);
                    class66.method373(true);
                    class356.method2270(false);
                    System.gc();
                    class87.method470(true, (byte) -34);
                    class190.method1292(4, false, -128);
                    int[][] var9 = null;
                    if (!class63.field724) {
                        class402.method2566(21678, false);
                        class152.method921(class384.field5422.field5664[0] >> 3, class384.field5422.field5677[0] >> 3, true);
                        class132.method819(arg0 + 32);
                        class212.method1433((int[][]) null, -1, class151.field1873, false, 4);
                        var9 = class419.field5994[0];
                        class87.method470(true, (byte) 110);
                        class216.method1451(28175, false);
                        if (class340.field4822 != null) {
                            class199.method1318((byte) -124);
                        }
                    }
                    if (class63.field724) {
                        class2.method9(108, false);
                        class152.method921(class384.field5422.field5664[0] >> 3, class384.field5422.field5677[0] >> 3, true);
                        class132.method819(93);
                        class212.method1433((int[][]) null, -1, class151.field1873, false, 4);
                        var9 = class419.field5994[0];
                        class87.method470(true, (byte) 111);
                        class24.method172(false, (byte) -114);
                    }
                    class440.method2744(-19093);
                    class87.method470(true, (byte) -122);
                    class79.method440((class327) null, class102.field1247, 4, false, class151.field1873, 0);
                    class404.method2580(121, 4, class151.field1873);
                    class87.method470(true, (byte) 124);
                    int var10 = class306.field4294;
                    if (~var10 < ~class129.field1570) {
                        var10 = class129.field1570;
                    }
                    if (var10 < class129.field1570 + -1) {
                        var10 = class129.field1570 - 1;
                    }
                    if (class12.method93(1)) {
                        class159.method1014(0);
                    } else {
                        class159.method1014(var10);
                    }
                    class217.method1458(-2);
                    if (var5) {
                        class203.method1350(true);
                        class190.method1292(1, true, -92);
                        if (!class63.field724) {
                            class402.method2566(21678, true);
                            class212.method1433(var9, -1, class151.field1873, true, 1);
                            class87.method470(true, (byte) -116);
                            class216.method1451(28175, true);
                            class404.method2580(arg0 ^ 56, 1, class151.field1873);
                        }
                        if (class63.field724) {
                            class2.method9(80, true);
                            class212.method1433(var9, -1, class151.field1873, true, 1);
                            class87.method470(true, (byte) 112);
                            class24.method172(true, (byte) 101);
                        }
                        class440.method2744(-19093);
                        class87.method470(true, (byte) -98);
                        class79.method440(class98.field1191[0], class102.field1247, 1, true, class151.field1873, 0);
                        class404.method2580(arg0 + 23, 1, class151.field1873);
                        class87.method470(true, (byte) -80);
                        class217.method1458(-2);
                        class203.method1350(false);
                    }
                    for (int var11 = 0; var11 < 4; ++var11) {
                        for (int var18 = 0; ~var18 > ~class176.field2403; ++var18) {
                            for (int var19 = 0; class383.field5395 > var19; ++var19) {
                                class254.method1717(var18, var19, var11, 1);
                            }
                        }
                    }
                    class440.method2745(-102);
                    class356.method2270(false);
                    class28.method191(arg0 ^ -64);
                    class440.method2744(arg0 ^ -19138);
                    class347.field4918 = false;
                    class151.method916(false);
                    if (class272.field3857 != null && class146.field1798 != null && class40.field475 == 25) {
                        ++class276.field3918;
                        class62.field718.method2143(6, -2);
                        class62.field718.method1603(1057001181, 871);
                    }
                    if (!class63.field724) {
                        int var12 = (-(class176.field2403 >> 4) + class153.field1896) / 8;
                        int var13 = ((class176.field2403 >> 4) + class153.field1896) / 8;
                        int var14 = (class291.field4066 - (class383.field5395 >> 4)) / 8;
                        int var15 = ((class383.field5395 >> 4) + class291.field4066) / 8;
                        for (int var16 = var12 - 1; var16 <= var13 - -1; ++var16) {
                            for (int var17 = var14 + -1; var17 <= var15 + 1; ++var17) {
                                if (~var16 > ~var12 || ~var16 < ~var13 || ~var17 > ~var14 || var17 > var15) {
                                    class311.field4389.method2406("m" + var16 + "_" + var17, (byte) -128);
                                    class311.field4389.method2406("l" + var16 + "_" + var17, (byte) -86);
                                }
                            }
                        }
                    }
                    if (~class40.field475 == -29) {
                        class178.method1210(10, 6);
                    } else {
                        class178.method1210(30, 29);
                        if (class146.field1798 != null) {
                            class62.field718.method2143(74, -2);
                        }
                    }
                    class177.method1201((byte) -124);
                    class356.method2270(false);
                    class135.method845(256);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)Z")
    public final boolean method782(int arg0) {
        ++field1509;
        if (arg0 != 0) {
            this.method81(109, (class236) null, -106);
        }
        if (this.field1513 != null) {
            return true;
        } else if (~this.field1516 <= -1) {
            class375 var2 = ~class334.field4728 > -1 ? class375.method2394(class146.field1794, this.field1516) : class375.method2402(class146.field1794, class334.field4728, this.field1516);
            var2.method2392();
            this.field1513 = var2.method2393();
            this.field1506 = var2.field5261;
            this.field1510 = var2.field5262;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method540(int arg0) {
        ++field1503;
        super.method540(arg0);
        this.field1513 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field1517;
        if (arg0 == arg2) {
            this.field1516 = arg1.method1617((byte) 48);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)[[I")
    public int[][] method194(int arg0, int arg1) {
        ++field1504;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        int var4 = 88 % ((arg1 - 60) / 43);
        if (super.field1184.field332 && this.method782(0)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = this.field1506 * (~class140.field1737 != ~this.field1510 ? this.field1510 * arg0 / class140.field1737 : arg0);
            if (class268.field3811 == this.field1506) {
                for (int var9 = 0; var9 < class268.field3811; ++var9) {
                    int var10 = this.field1513[var8++];
                    var7[var9] = class33.method210(var10 << 4, 4080);
                    var6[var9] = class33.method210(var10 >> 4, 4080);
                    var5[var9] = class33.method210(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class268.field3811; ++var11) {
                    int var12 = this.field1506 * var11 / class268.field3811;
                    int var13 = this.field1513[var8 + var12];
                    var7[var11] = class33.method210(4080, var13 << 4);
                    var6[var11] = class33.method210(65280, var13) >> 4;
                    var5[var11] = class33.method210(var13, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
