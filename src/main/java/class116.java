import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class116 extends class118 {

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    private int field1528 = 1;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    private int field1530 = 204;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field1533 = 1;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1526 = "";

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[Lkr;")
    public static class234[] field1525;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1534;
        if (arg0 != 1) {
            method700(true);
        }
        int[] var3 = super.field1537.method2395(arg0 + 30962, arg1);
        if (super.field1537.field5756) {
            for (int var4 = 0; ~class440.field6474 < ~var4; ++var4) {
                int var5 = class6.field73[var4];
                int var6 = class160.field2210[arg1];
                int var7 = this.field1533 * var5 >> 12;
                int var8 = this.field1528 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1533) * this.field1533;
                int var10 = var6 % (4096 / this.field1528) * this.field1528;
                if (~var10 > ~this.field1530) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field1530 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field1530) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field1532;
        if (arg1 != 1) {
            this.method24(8, 99, (class385) null);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1530 = arg2.method2323(-111);
                }
            } else {
                this.field1528 = arg2.method2343(255);
            }
        } else {
            this.field1533 = arg2.method2343(arg1 ^ 254);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static void method697(byte arg0) {
        field1526 = null;
        if (arg0 >= -97) {
            field1526 = null;
        }
        field1525 = null;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public static final void method698(byte arg0) {
        ++field1527;
        if (class28.field364) {
            if (arg0 > 83) {
                while (true) {
                    while (~class30.field383 > ~class205.field3072.length) {
                        class432 var1 = class205.field3072[class30.field383];
                        if (var1 != null && var1.field6341 == -1) {
                            if (class15.field191 == null) {
                                class15.field191 = class410.field6112.method1706(28982, var1.field6333);
                            }
                            int var2 = class15.field191.field341;
                            if (~var2 == 0) {
                                return;
                            }
                            ++class30.field383;
                            var1.field6341 = var2;
                            class15.field191 = null;
                        } else {
                            ++class30.field383;
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
    public static final void method699(int arg0) {
        ++field1529;
        if (class6.field67 != 0 && class6.field67 != 5) {
            try {
                if (~(++class201.field3028) < -2001) {
                    if (class301.field4543 != null) {
                        class301.field4543.method2163(true);
                        class301.field4543 = null;
                    }
                    if (~client.field6663 <= -2) {
                        class298.field4511 = -5;
                        class6.field67 = 0;
                        return;
                    }
                    if (class432.field6334 == class284.field4336) {
                        class284.field4336 = class109.field1443;
                    } else {
                        class284.field4336 = class432.field6334;
                    }
                    class201.field3028 = 0;
                    ++client.field6663;
                    class6.field67 = 1;
                }
                if (class6.field67 == arg0) {
                    class1.field22 = class79.field1043.method1450((byte) -71, class284.field4336, class228.field3490);
                    class6.field67 = 2;
                }
                if (class6.field67 == 2) {
                    if (~class1.field22.field3172 == -3) {
                        throw new IOException();
                    }
                    if (class1.field22.field3172 != 1) {
                        return;
                    }
                    class301.field4543 = new class359((Socket) class1.field22.field3175, class79.field1043);
                    class1.field22 = null;
                    long var1 = class210.field3159 = class55.method317(field1526, (byte) 51);
                    int var3 = (int) (31L & var1 >> 16);
                    class189.field2840.field5666 = 0;
                    class189.field2840.method2366(class386.field5688.field6435, true);
                    class189.field2840.method2366(var3, true);
                    class301.field4543.method2164(0, (byte) -35, 2, class189.field2840.field5685);
                    if (class245.field3670 != null) {
                        class245.field3670.method247(2000);
                    }
                    if (class236.field3536 != null) {
                        class236.field3536.method247(2000);
                    }
                    int var4 = class301.field4543.method2156(true);
                    if (class245.field3670 != null) {
                        class245.field3670.method247(2000);
                    }
                    if (class236.field3536 != null) {
                        class236.field3536.method247(2000);
                    }
                    if (~var4 != -1) {
                        class6.field67 = 0;
                        class298.field4511 = var4;
                        class301.field4543.method2163(true);
                        class301.field4543 = null;
                        return;
                    }
                    class6.field67 = 3;
                }
                if (class6.field67 == 3) {
                    if (class301.field4543.method2158(false) < 8) {
                        return;
                    }
                    class301.field4543.method2159((byte) -128, 0, 8, class424.field6232.field5685);
                    class424.field6232.field5666 = 0;
                    class127.field1625 = class424.field6232.method2361((byte) -85);
                    int[] var5 = new int[4];
                    class189.field2840.field5666 = 0;
                    var5[0] = (int) (9.9999999E7D * Math.random());
                    var5[2] = (int) (class127.field1625 >> 32);
                    var5[1] = (int) (9.9999999E7D * Math.random());
                    var5[3] = (int) class127.field1625;
                    class189.field2840.method2366(10, true);
                    class189.field2840.method2381(var5[0], 0);
                    class189.field2840.method2381(var5[1], 0);
                    class189.field2840.method2381(var5[2], 0);
                    class189.field2840.method2381(var5[3], arg0 + -1);
                    class189.field2840.method2349(class55.method317(field1526, (byte) 51), (byte) -36);
                    class189.field2840.method2375(-124, class212.field3187);
                    class189.field2840.method2358(class358.field5279, 61, class230.field3518);
                    class273.field4193.field5666 = 0;
                    if (class19.field263 == 40) {
                        class273.field4193.method2366(class386.field5694.field6435, true);
                    } else {
                        class273.field4193.method2366(class386.field5692.field6435, true);
                    }
                    class273.field4193.method2377(class189.field2840.field5666 + (161 - -class386.method2384(arg0 ^ -4579, class54.field730)), -111);
                    class273.field4193.method2381(570, 0);
                    class273.field4193.method2366(class427.field6297, true);
                    class273.field4193.method2366(class246.method1503((byte) -69), true);
                    class273.field4193.method2377(class221.field3368, -111);
                    class273.field4193.method2377(class161.field2232, -48);
                    class273.field4193.method2366(class287.field4376, true);
                    class32.method190(80, class273.field4193);
                    class273.field4193.method2375(-45, class54.field730);
                    class273.field4193.method2381(class240.field3600, 0);
                    class273.field4193.method2381(class334.method2045(-2073204108), arg0 ^ 1);
                    class57.field768 = true;
                    class273.field4193.method2377(class28.field361, -52);
                    class273.field4193.method2381(class447.field6591.method835(-89), 0);
                    class273.field4193.method2381(class355.field5241.method835(arg0 + -62), arg0 + -1);
                    class273.field4193.method2381(class296.field4494.method835(-84), arg0 ^ 1);
                    class273.field4193.method2381(class316.field4786.method835(-95), 0);
                    class273.field4193.method2381(class435.field6408.method835(-60), arg0 ^ 1);
                    class273.field4193.method2381(class265.field4048.method835(-107), 0);
                    class273.field4193.method2381(class298.field4505.method835(-66), arg0 ^ 1);
                    class273.field4193.method2381(class320.field4840.method835(arg0 ^ -63), 0);
                    class273.field4193.method2381(class427.field6274.method835(-89), 0);
                    class273.field4193.method2381(class357.field5265.method835(-73), 0);
                    class273.field4193.method2381(class13.field169.method835(-77), 0);
                    class273.field4193.method2381(class95.field1330.method835(arg0 + -62), 0);
                    class273.field4193.method2381(class241.field3627.method835(-65), arg0 + -1);
                    class273.field4193.method2381(class430.field6321.method835(-100), arg0 ^ 1);
                    class273.field4193.method2381(class339.field5051.method835(-67), arg0 + -1);
                    class273.field4193.method2381(class163.field2258.method835(-98), 0);
                    class273.field4193.method2381(class261.field3978.method835(arg0 + -64), 0);
                    class273.field4193.method2381(class296.field4496.method835(arg0 + -108), arg0 + -1);
                    class273.field4193.method2381(class253.field3862.method835(arg0 ^ -67), 0);
                    class273.field4193.method2381(class81.field1079.method835(-124), 0);
                    class273.field4193.method2381(class458.field6792.method835(-66), 0);
                    class273.field4193.method2381(class133.field1727.method835(arg0 ^ -59), arg0 ^ 1);
                    class273.field4193.method2381(class183.field2741.method835(-117), 0);
                    class273.field4193.method2381(class135.field1786.method835(-56), 0);
                    class273.field4193.method2381(class387.field5724.method835(-57), 0);
                    class273.field4193.method2381(class451.field6658.method835(-109), 0);
                    class273.field4193.method2381(class324.field4876.method835(arg0 ^ -62), 0);
                    class273.field4193.method2381(class362.field5335.method835(arg0 ^ -104), 0);
                    class273.field4193.method2381(class302.field4572.method835(-61), 0);
                    class273.field4193.method2325((byte) 74, 0, class189.field2840.field5685, class189.field2840.field5666);
                    class301.field4543.method2164(0, (byte) -35, class273.field4193.field5666, class273.field4193.field5685);
                    class189.field2840.method719(var5, -118);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class424.field6232.method719(var5, 82);
                    class6.field67 = 4;
                }
                if (~class6.field67 == -5) {
                    if (~class301.field4543.method2158(false) > -2) {
                        return;
                    }
                    int var7 = class301.field4543.method2156(true);
                    if (~var7 != -22) {
                        if (var7 != 29) {
                            if (var7 == 1) {
                                class298.field4511 = var7;
                                class6.field67 = 5;
                                return;
                            }
                            if (~var7 != -3) {
                                if (~var7 != -16) {
                                    if (~var7 == -24 && ~client.field6663 > -2) {
                                        class201.field3028 = 0;
                                        ++client.field6663;
                                        class6.field67 = 1;
                                        class301.field4543.method2163(true);
                                        class301.field4543 = null;
                                        return;
                                    }
                                    class6.field67 = 0;
                                    class298.field4511 = var7;
                                    class301.field4543.method2163(true);
                                    class301.field4543 = null;
                                    return;
                                }
                                class44.field547 = -2;
                                class6.field67 = 12;
                            } else {
                                class6.field67 = 8;
                            }
                        } else {
                            class6.field67 = 11;
                        }
                    } else {
                        class6.field67 = 7;
                    }
                }
                if (~class6.field67 == -7) {
                    class189.field2840.field5666 = 0;
                    class189.field2840.method716(class386.field5693.field6435, -55);
                    class301.field4543.method2164(0, (byte) -35, class189.field2840.field5666, class189.field2840.field5685);
                    class6.field67 = 4;
                } else if (~class6.field67 == -8) {
                    if (class301.field4543.method2158(false) >= 1) {
                        class19.field259 = 180 + class301.field4543.method2156(true) * 60;
                        class6.field67 = 0;
                        class298.field4511 = 21;
                        class301.field4543.method2163(true);
                        class301.field4543 = null;
                    }
                } else if (class6.field67 == 11) {
                    if (class301.field4543.method2158(false) >= 1) {
                        class109.field1442 = class301.field4543.method2156(true);
                        class298.field4511 = 29;
                        class6.field67 = 0;
                        class301.field4543.method2163(true);
                        class301.field4543 = null;
                    }
                } else {
                    if (~class6.field67 == -9) {
                        if (class301.field4543.method2158(false) < 13) {
                            return;
                        }
                        class301.field4543.method2159((byte) -128, 0, 13, class424.field6232.field5685);
                        class424.field6232.field5666 = 0;
                        class143.field1912 = class424.field6232.method2343(255);
                        class437.field6429 = class424.field6232.method2343(255);
                        class430.field6326 = class424.field6232.method2343(255) == 1;
                        class238.field3570 = ~class424.field6232.method2343(255) == -2;
                        class294.field4467 = class424.field6232.method2343(arg0 ^ 254) == 1;
                        class286.field4361 = ~class424.field6232.method2343(arg0 ^ 254) == -2;
                        class386.field5703 = class424.field6232.method2323(-33);
                        class426.field6266 = class424.field6232.method2343(arg0 + 254) == 1;
                        class66.field859 = class424.field6232.method2343(255) == 1;
                        class388.method2392(class66.field859, arg0 + -125);
                        class186.field2796.method1107(arg0 + -2, class66.field859);
                        class37.method216(true, class66.field859);
                        if ((!class430.field6326 || class294.field4467) && !class426.field6266) {
                            try {
                                class232.method1404(class79.field1043.field3583, 123, "unzap");
                            } catch (Throwable var12) {
                            }
                        } else {
                            try {
                                class232.method1404(class79.field1043.field3583, 80, "zap");
                            } catch (Throwable var13) {
                                if (class87.field1227) {
                                    try {
                                        class79.field1043.field3583.getAppletContext().showDocument(new URL(class79.field1043.field3583.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var11) {
                                    }
                                }
                            }
                        }
                        if (class454.field6750 == 0) {
                            try {
                                class232.method1404(class79.field1043.field3583, 50, "loggedin");
                            } catch (Throwable var10) {
                            }
                        }
                        class6.field67 = 10;
                    }
                    if (class6.field67 == 10) {
                        if (class424.field6232.method713(false)) {
                            if (~class301.field4543.method2158(false) > -2) {
                                return;
                            }
                            class301.field4543.method2159((byte) -128, class424.field6232.field5666 + 2, 1, class424.field6232.field5685);
                        }
                        class288.field4384 = class441.method2697((byte) 123)[class424.field6232.method720((byte) -114)];
                        class44.field547 = class424.field6232.method2323(-57);
                        class6.field67 = 9;
                    }
                    if (class6.field67 == 9) {
                        if (class301.field4543.method2158(false) >= class44.field547) {
                            class301.field4543.method2159((byte) -128, 0, class44.field547, class424.field6232.field5685);
                            class424.field6232.field5666 = 0;
                            class6.field67 = 0;
                            class298.field4511 = 2;
                            int var8 = class44.field547;
                            class34.method203((byte) 98);
                            class244.method1498(123, class424.field6232);
                            class53.field718 = -1;
                            class277.method1715(63, false);
                            if (~class424.field6232.field5666 != ~var8) {
                                throw new RuntimeException("lswp pos:" + class424.field6232.field5666 + " psize:" + var8);
                            } else {
                                class288.field4384 = null;
                            }
                        }
                    } else if (~class6.field67 == -13) {
                        if (~class44.field547 == 1) {
                            if (class301.field4543.method2158(false) < 2) {
                                return;
                            }
                            class301.field4543.method2159((byte) -128, 0, 2, class424.field6232.field5685);
                            class424.field6232.field5666 = 0;
                            class44.field547 = class424.field6232.method2323(-116);
                        }
                        if (~class301.field4543.method2158(false) <= ~class44.field547) {
                            class301.field4543.method2159((byte) -128, 0, class44.field547, class424.field6232.field5685);
                            class424.field6232.field5666 = 0;
                            class298.field4511 = 15;
                            int var9 = class44.field547;
                            class6.field67 = 0;
                            class130.method771((byte) 121);
                            class244.method1498(103, class424.field6232);
                            if (class424.field6232.field5666 != var9) {
                                throw new RuntimeException("lswpr pos:" + class424.field6232.field5666 + " psize:" + var9);
                            } else {
                                class288.field4384 = null;
                            }
                        }
                    }
                }
            } catch (IOException var14) {
                if (class301.field4543 != null) {
                    class301.field4543.method2163(true);
                    class301.field4543 = null;
                }
                if (client.field6663 < 1) {
                    class201.field3028 = 0;
                    ++client.field6663;
                    class6.field67 = 1;
                    if (class432.field6334 == class284.field4336) {
                        class284.field4336 = class109.field1443;
                    } else {
                        class284.field4336 = class432.field6334;
                    }
                } else {
                    class298.field4511 = -4;
                    class6.field67 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public static final void method700(boolean arg0) {
        class241 var1 = class177.field2679;
        synchronized (class177.field2679) {
            class177.field2679.method1482((byte) 69);
        }
        ++field1531;
        class241 var2 = class391.field5767;
        synchronized (class391.field5767) {
            class391.field5767.method1482((byte) -124);
        }
        if (!arg0) {
            field1525 = null;
        }
    }
}
