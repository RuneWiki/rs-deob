import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class752 {

    @OriginalMember(owner = "client!np", name = "k", descriptor = "[I")
    private int[] field10484;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "[I")
    private int[] field10479;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field10476 = 0;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    private int field10477;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    private int field10478;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    private int field10480;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public static int field10483;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    private int field10485;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 9)
    private final void method4190(boolean arg0) {
        field10481++;
        if (!arg0) {
            return;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            int var76 = var73 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field10484[var11 + 6] + var3;
            int var38 = this.field10484[var11 + 7] + var2;
            int var39 = this.field10484[var11 + 1] + var8;
            int var40 = this.field10484[var11 + 4] + var5;
            int var41 = this.field10484[var11 + 3] + var6;
            int var42 = this.field10484[var11] + var9;
            int var43 = this.field10484[var11 + 2] + var7;
            int var44 = this.field10484[var11 + 5] + var4;
            int var45 = var42 ^ var39 << 11;
            int var46 = var39 + var43;
            int var47 = var41 + var45;
            int var48 = var46 ^ var43 >>> 2;
            int var49 = var43 + var47;
            int var50 = var40 + var48;
            int var51 = var49 ^ var47 << 8;
            int var52 = var44 + var51;
            int var53 = var47 + var50;
            var6 = var53 ^ var50 >>> 16;
            int var54 = var50 + var52;
            int var55 = var6 + var37;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var38;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var55 + var56;
            int var59 = var4 + var45;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var48;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field10479[var11] = var9;
            this.field10479[var11 + 1] = var8;
            this.field10479[var11 + 2] = var7;
            this.field10479[var11 + 3] = var6;
            this.field10479[var11 + 4] = var5;
            this.field10479[var11 + 5] = var4;
            this.field10479[var11 + 6] = var3;
            this.field10479[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field10479[var12 + 2] + var7;
            int var14 = this.field10479[var12 + 6] + var3;
            int var15 = this.field10479[var12 + 3] + var6;
            int var16 = this.field10479[var12 + 1] + var8;
            int var17 = this.field10479[var12] + var9;
            int var18 = this.field10479[var12 + 5] + var4;
            int var19 = this.field10479[var12 + 7] + var2;
            int var20 = this.field10479[var12 + 4] + var5;
            int var21 = var17 ^ var16 << 11;
            int var22 = var15 + var21;
            int var23 = var13 + var16;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var20 + var24;
            int var26 = var13 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            int var29 = var18 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var14;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var19;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field10479[var12] = var9;
            this.field10479[var12 + 1] = var8;
            this.field10479[var12 + 2] = var7;
            this.field10479[var12 + 3] = var6;
            this.field10479[var12 + 4] = var5;
            this.field10479[var12 + 5] = var4;
            this.field10479[var12 + 6] = var3;
            this.field10479[var12 + 7] = var2;
        }
        this.method4194(4752);
        this.field10477 = 256;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V", line = 160)
    public static final void method4191(boolean arg0) {
        field10474++;
        if (class714.field10032 == 0 || class714.field10032 == 5) {
            return;
        }
        try {
            short var1;
            if (class116.field1800 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (arg0) {
                method4191(true);
            }
            if (++class694.field9839 > var1) {
                if (class166.field2624 != null) {
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                }
                if (class116.field1800 >= 3) {
                    class714.field10032 = 0;
                    class129.method1045(123, -5);
                    return;
                }
                if (class377.field5674 == 2) {
                    class229.field3703.method3108(0);
                } else {
                    class372.field5642.method3108(0);
                }
                class116.field1800++;
                class694.field9839 = 0;
                class714.field10032 = 1;
            }
            if (class714.field10032 == 1) {
                if (class377.field5674 == 2) {
                    class382.field5737 = class229.field3703.method3109(class706.field9962, 94);
                } else {
                    class382.field5737 = class372.field5642.method3109(class706.field9962, 115);
                }
                class714.field10032 = 2;
            }
            if (class714.field10032 == 2) {
                if (class382.field5737.field2512 == 2) {
                    throw new IOException();
                }
                if (class382.field5737.field2512 != 1) {
                    return;
                }
                class166.field2624 = class599.method3445(7500, (Socket) class382.field5737.field2517, 2036970792);
                class382.field5737 = null;
                class390.method2438(0);
                class540 var2 = class91.method771(false);
                var2.field7707.method1926(class511.field7409.field1540, 65280);
                class756.method4211(var2, 122);
                class683.method3809(0);
                class714.field10032 = 3;
            }
            if (class714.field10032 == 3) {
                if (!class166.field2624.method3114(1, (byte) 126)) {
                    return;
                }
                class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                int var3 = class624.field8742.field4543[0] & 0xFF;
                if (var3 != 0) {
                    class714.field10032 = 0;
                    class129.method1045(124, var3);
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                    class499.method3030((byte) -68);
                    return;
                }
                class624.field8742.field4534 = 0;
                class301 var4 = new class301(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method1926(10, 65280);
                var4.method1970((byte) 29, var5[0]);
                var4.method1970((byte) 29, var5[1]);
                var4.method1970((byte) 29, var5[2]);
                var4.method1970((byte) 29, var5[3]);
                var4.method1964(0L, (byte) 115);
                var4.method1931(117, class18.field190);
                var4.method1964(class395.field5902, (byte) 107);
                var4.method1964(class658.field9365, (byte) 105);
                var4.method1976(class411.field6061, 0, class702.field9928);
                class390.method2438(0);
                class540 var6 = class91.method771(false);
                class702 var7 = var6.field7707;
                if (class377.field5674 == 2) {
                    if (class521.field7529 == 13) {
                        var7.method1926(class511.field7425.field1540, 65280);
                    } else {
                        var7.method1926(class511.field7422.field1540, 65280);
                    }
                    var7.method1939(0, 1134947720);
                    int var10 = var7.field4534;
                    var7.method1970((byte) 29, 635);
                    var7.method1946(1735499792, var4.field4543, 0, var4.field4534);
                    int var11 = var7.field4534;
                    var7.method1931(113, class1.field4);
                    var7.method1926(class355.field5377, 65280);
                    var7.method1926(class347.method2215(-21383), 65280);
                    var7.method1939(class660.field9408, 1134947720);
                    var7.method1939(class412.field6066, 1134947720);
                    var7.method1926(class654.field9289.field5417.method2495(3), 65280);
                    class247.method1705(var7, 6575);
                    var7.method1931(127, class429.field6277);
                    var7.method1970((byte) 29, class459.field6658);
                    class301 var12 = class654.field9289.method2287(125);
                    var7.method1926(var12.field4534, 65280);
                    var7.method1946(1735499792, var12.field4543, 0, var12.field4534);
                    class407.field6033 = true;
                    class301 var13 = new class301(class547.field7815.method208(23));
                    class547.field7815.method207(var13, 10);
                    var7.method1946(1735499792, var13.field4543, 0, var13.field4543.length);
                    var7.method1939(class110.field1714, 1134947720);
                    var7.method1964(class183.field3094, (byte) 119);
                    var7.method1926(class463.field6747 == null ? 0 : 1, 65280);
                    if (class463.field6747 != null) {
                        var7.method1931(117, class463.field6747);
                    }
                    var7.method1926(class353.method2266("jagtheora", (byte) 83) ? 1 : 0, 65280);
                    class676.method3769(var7, (byte) -4);
                    var7.method1940(var7.field4534, var11, -32265, var5);
                    var7.method1973(arg0, var7.field4534 - var10);
                } else {
                    var7.method1926(class511.field7426.field1540, 65280);
                    var7.method1939(0, 1134947720);
                    int var8 = var7.field4534;
                    var7.method1970((byte) 29, 635);
                    var7.method1946(1735499792, var4.field4543, 0, var4.field4534);
                    int var9 = var7.field4534;
                    var7.method1931(118, class1.field4);
                    var7.method1926(class519.field7498.field4494, 65280);
                    var7.method1926(class467.field6804, 65280);
                    class247.method1705(var7, 6575);
                    var7.method1931(119, class429.field6277);
                    var7.method1970((byte) 29, class459.field6658);
                    class676.method3769(var7, (byte) -4);
                    var7.method1940(var7.field4534, var9, -32265, var5);
                    var7.method1973(false, var7.field4534 - var8);
                }
                class756.method4211(var6, 119);
                class683.method3809(0);
                class655.field9332 = new class752(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class624.field8742.method3902((byte) -11, var5);
                class714.field10032 = 4;
            }
            if (class714.field10032 == 4) {
                if (!class166.field2624.method3114(1, (byte) 125)) {
                    return;
                }
                class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                int var15 = class624.field8742.field4543[0] & 0xFF;
                if (var15 == 21) {
                    class714.field10032 = 7;
                } else if (var15 == 29) {
                    class714.field10032 = 13;
                } else if (var15 == 1) {
                    class714.field10032 = 5;
                    class129.method1045(123, var15);
                    return;
                } else if (var15 == 2) {
                    class714.field10032 = 8;
                } else if (var15 == 15) {
                    class714.field10032 = 14;
                    class495.field7166 = -2;
                } else if (var15 == 23 && class116.field1800 < 3) {
                    class116.field1800++;
                    class694.field9839 = 0;
                    class714.field10032 = 1;
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                    return;
                } else {
                    class714.field10032 = 0;
                    class129.method1045(123, var15);
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                    class499.method3030((byte) -68);
                    return;
                }
            }
            if (class714.field10032 == 6) {
                class390.method2438(0);
                class540 var16 = class91.method771(arg0);
                class702 var17 = var16.field7707;
                var17.method3903(-110, class655.field9332);
                var17.method3906(class511.field7435.field1540, -5);
                class756.method4211(var16, 114);
                class683.method3809(0);
                class714.field10032 = 4;
            } else if (class714.field10032 == 7) {
                if (class166.field2624.method3114(1, (byte) 126)) {
                    class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                    int var18 = class624.field8742.field4543[0] & 0xFF;
                    class714.field10032 = 0;
                    class3.field19 = var18 * 60 + 180;
                    class129.method1045(125, 21);
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                    class499.method3030((byte) -68);
                }
            } else if (class714.field10032 == 13) {
                if (class166.field2624.method3114(1, (byte) 125)) {
                    class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                    class714.field10032 = 0;
                    class564.field7997 = class624.field8742.field4543[0] & 0xFF;
                    class129.method1045(127, 29);
                    class166.field2624.method3118(25);
                    class166.field2624 = null;
                    class499.method3030((byte) -68);
                }
            } else if (class714.field10032 != 8) {
                if (class714.field10032 == 9) {
                    class702 var19 = class624.field8742;
                    if (class377.field5674 == 2) {
                        if (!class166.field2624.method3114(class757.field10541, (byte) 127)) {
                            return;
                        }
                        class166.field2624.method3120(0, (byte) -36, class757.field10541, var19.field4543);
                        var19.field4534 = 0;
                        class81.field1173 = var19.method1987(-27);
                        class678.field9557 = var19.method1987(-52);
                        class311.field4698 = var19.method1987(-19) == 1;
                        class355.field5385 = var19.method1987(-76) == 1;
                        class368.field5606 = var19.method1987(-40) == 1;
                        class330.field4867 = var19.method1987(-60) == 1;
                        class673.field9516 = var19.method1989((byte) -30);
                        class325.field4807 = var19.method1987(-30) == 1;
                        class459.field6655 = var19.method1947((byte) -111);
                        class384.field5763 = var19.method1987(-41) == 1;
                        class576.field8167.method3070(class384.field5763, 113);
                        class556.field7917.method746(6103, class384.field5763);
                        class740.field10382.method3433(class384.field5763, (byte) 96);
                    } else if (class166.field2624.method3114(class757.field10541, (byte) 125)) {
                        class166.field2624.method3120(0, (byte) -36, class757.field10541, var19.field4543);
                        var19.field4534 = 0;
                        class81.field1173 = var19.method1987(-24);
                        class678.field9557 = var19.method1987(-43);
                        class311.field4698 = var19.method1987(-43) == 1;
                        class355.field5385 = var19.method1987(-120) == 1;
                        class368.field5606 = var19.method1987(-7) == 1;
                        class43.field736 = var19.method1977((byte) 73);
                        class325.field4807 = class43.field736 > 0;
                        class567.field8050 = var19.method1989((byte) -38);
                        class401.field5965 = var19.method1989((byte) -68);
                        class73.field1095 = var19.method1989((byte) -101);
                        class67.field1056 = var19.method1934(-2);
                        class606.field8566 = class706.field9962.method4057(31358, class67.field1056);
                        class221.field3604 = var19.method1987(-11);
                        class735.field10363 = var19.method1989((byte) -32);
                        class721.field10109 = var19.method1989((byte) -64);
                        class237.field3809 = var19.method1987(-93) == 1;
                        class145.field2251.field8146 = class145.field2251.field8137 = class702.field9939 = var19.method1944(-39);
                        class645.field9199 = var19.method1987(-22);
                        class297.field4513 = var19.method1934(-2);
                        class87.field1280 = new class522();
                        class87.field1280.field7542 = var19.method1989((byte) -30);
                        if (class87.field1280.field7542 == 65535) {
                            class87.field1280.field7542 = -1;
                        }
                        class87.field1280.field7535 = var19.method1944(-118);
                        if (class478.field6941 != class209.field3494) {
                            class87.field1280.field7537 = class87.field1280.field7542 + 40000;
                            class87.field1280.field7533 = class87.field1280.field7542 + 50000;
                        }
                        if (class452.field6572 != class209.field3494 && (class229.field3703.method3111((byte) 45, class750.field10452) || class229.field3703.method3111((byte) 45, class37.field373))) {
                            class237.method1632(0);
                        }
                    } else {
                        return;
                    }
                    if ((!class311.field4698 || class368.field5606) && !class325.field4807) {
                        try {
                            class284.method1862(class351.field5138, "unzap", (byte) 47);
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            class284.method1862(class351.field5138, "zap", (byte) 47);
                        } catch (Throwable var26) {
                            if (class211.field3507) {
                                try {
                                    class351.field5138.getAppletContext().showDocument(new URL(class351.field5138.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var25) {
                                }
                            }
                        }
                    }
                    if (class478.field6941 == class209.field3494) {
                        try {
                            class284.method1862(class351.field5138, "loggedin", (byte) 47);
                        } catch (Throwable var23) {
                        }
                    }
                    if (class377.field5674 != 2) {
                        class714.field10032 = 0;
                        class129.method1045(127, 2);
                        class80.method721(-72);
                        class658.method3704(-5697, 7);
                        class153.field2383 = null;
                        return;
                    }
                    class714.field10032 = 11;
                }
                if (class714.field10032 == 11) {
                    if (!class166.field2624.method3114(3, (byte) 125)) {
                        return;
                    }
                    class166.field2624.method3120(0, (byte) -36, 3, class624.field8742.field4543);
                    class714.field10032 = 12;
                }
                if (class714.field10032 == 12) {
                    class702 var20 = class624.field8742;
                    var20.field4534 = 0;
                    if (var20.method3897(255)) {
                        if (!class166.field2624.method3114(1, (byte) 125)) {
                            return;
                        }
                        class166.field2624.method3120(3, (byte) -36, 1, var20.field4543);
                    }
                    class153.field2383 = class705.method3916(0)[var20.method3907(false)];
                    class495.field7166 = var20.method1989((byte) -105);
                    class714.field10032 = 10;
                }
                if (class714.field10032 == 10) {
                    if (class166.field2624.method3114(class495.field7166, (byte) 126)) {
                        class166.field2624.method3120(0, (byte) -36, class495.field7166, class624.field8742.field4543);
                        class624.field8742.field4534 = 0;
                        class714.field10032 = 0;
                        int var21 = class495.field7166;
                        class129.method1045(125, 2);
                        class125.method966(111);
                        class475.method2885(-22814, class624.field8742);
                        class567.field8048 = -1;
                        if (class732.field10291 == class153.field2383) {
                            class203.method1501((byte) -127);
                        } else {
                            class237.method1635((byte) -18);
                        }
                        if (class624.field8742.field4534 != var21) {
                            throw new RuntimeException("lswp pos:" + class624.field8742.field4534 + " psize:" + var21);
                        }
                        class153.field2383 = null;
                    }
                } else if (class714.field10032 == 14) {
                    if (class495.field7166 == -2) {
                        if (!class166.field2624.method3114(2, (byte) 126)) {
                            return;
                        }
                        class166.field2624.method3120(0, (byte) -36, 2, class624.field8742.field4543);
                        class624.field8742.field4534 = 0;
                        class495.field7166 = class624.field8742.method1989((byte) -93);
                    }
                    if (class166.field2624.method3114(class495.field7166, (byte) 125)) {
                        class166.field2624.method3120(0, (byte) -36, class495.field7166, class624.field8742.field4543);
                        class624.field8742.field4534 = 0;
                        class714.field10032 = 0;
                        int var22 = class495.field7166;
                        class129.method1045(124, 15);
                        class171.method1355((byte) 120);
                        class475.method2885(-22814, class624.field8742);
                        if (class624.field8742.field4534 != var22) {
                            throw new RuntimeException("lswpr pos:" + class624.field8742.field4534 + " psize:" + var22);
                        }
                        class153.field2383 = null;
                    }
                }
            } else if (class166.field2624.method3114(1, (byte) 126)) {
                class166.field2624.method3120(0, (byte) -36, 1, class624.field8742.field4543);
                class714.field10032 = 9;
                class757.field10541 = class624.field8742.field4543[0] & 0xFF;
            }
        } catch (IOException var27) {
            if (class166.field2624 != null) {
                class166.field2624.method3118(25);
                class166.field2624 = null;
            }
            if (class116.field1800 < 3) {
                if (class377.field5674 == 2) {
                    class229.field3703.method3108(0);
                } else {
                    class372.field5642.method3108(0);
                }
                class714.field10032 = 1;
                class116.field1800++;
                class694.field9839 = 0;
            } else {
                class714.field10032 = 0;
                class129.method1045(124, -4);
                class499.method3030((byte) -68);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I", line = 743)
    public final int method4192(int arg0) {
        if (arg0 != 256) {
            this.method4192(-89);
        }
        if (this.field10477 == 0) {
            this.method4194(4752);
            this.field10477 = 256;
        }
        field10475++;
        return this.field10484[this.field10477 - 1];
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I", line = 772)
    public final int method4193(byte arg0) {
        if (arg0 != -33) {
            return -22;
        }
        if (this.field10477 == 0) {
            this.method4194(4752);
            this.field10477 = 256;
        }
        field10482++;
        return this.field10484[--this.field10477];
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 790)
    private final void method4194(int arg0) {
        field10483++;
        this.field10480 += ++this.field10478;
        if (arg0 != 4752) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field10479[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field10485 ^= this.field10485 << 13;
                } else {
                    this.field10485 ^= this.field10485 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field10485 ^= this.field10485 << 2;
            } else {
                this.field10485 ^= this.field10485 >>> 16;
            }
            this.field10485 += this.field10479[var2 + 128 & 0xFF];
            int var4;
            this.field10479[var2] = var4 = this.field10479[class636.method3603(1020, var3) >> 2] - (-this.field10485 - this.field10480);
            this.field10484[var2] = this.field10480 = var3 + this.field10479[class636.method3603(255, var4 >> 8 >> 2)];
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V", line = 831)
    private class752() {
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "([I)V", line = 833)
    public class752(int[] arg0) {
        this.field10484 = new int[256];
        this.field10479 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field10484[var2] = arg0[var2];
        }
        this.method4190(true);
    }
}
