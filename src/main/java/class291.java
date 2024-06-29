import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class291 extends class328 {

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    private int field4203 = 0;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    private int field4204 = 1;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    private int field4202 = 0;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "Lbv;")
    public static class567 field4210 = new class567("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[I")
    public static int[] field4212 = new int[2048];

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method4(int arg0, int arg1) {
        int var3 = -22 / ((48 - arg1) / 56);
        ++field4209;
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var5 = class638.field9258[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; class449.field6539 > var7; ++var7) {
                int var8 = class206.field2924[var7];
                int var9 = var8 + -2048 >> 1;
                int var10;
                if (this.field4202 == 0) {
                    var10 = (var8 - var5) * this.field4204;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                    var10 = (int) ((double) (this.field4204 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (var10 & -4096);
                if (~this.field4203 == -1) {
                    var13 = class306.field4403[(var13 & 4086) >> 4] + 4096 >> 1;
                } else if (~this.field4203 == -3) {
                    var13 -= 2048;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 72)
    public final void method2(int arg0) {
        ++field4208;
        if (arg0 < -97) {
            class83.method761(true);
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 718)
    public class291() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 88)
    public static final void method1839(int arg0) {
        ++field4207;
        if (class599.field8510 != 0 && ~class599.field8510 != -7) {
            try {
                if (++class133.field2152 > 2000) {
                    if (client.field8770 != null) {
                        client.field8770.method2743((byte) -119);
                        client.field8770 = null;
                    }
                    if (class34.field461 >= 1) {
                        class599.field8510 = 0;
                        class276.method1780(16711935, -5);
                        return;
                    }
                    class133.field2152 = 0;
                    if (class490.field6891 != 2 && ~class490.field6891 != -4) {
                        class552.field7820.field3408 = !class552.field7820.field3408;
                    } else {
                        class352.field5017.field3408 = !class352.field5017.field3408;
                    }
                    ++class34.field461;
                    class599.field8510 = 1;
                }
                if (class599.field8510 == 1) {
                    if (~class490.field6891 != -3 && ~class490.field6891 != -4) {
                        class384.field5720 = class270.field3976.method347(2471, class552.field7820.field3411, class552.field7820.method1517(-7005));
                    } else {
                        class384.field5720 = class270.field3976.method347(2471, class352.field5017.field3411, class352.field5017.method1517(-7005));
                    }
                    class599.field8510 = 2;
                }
                if (class599.field8510 == 2) {
                    if (class384.field5720.field4739 == 2) {
                        throw new IOException();
                    }
                    if (class384.field5720.field4739 != 1) {
                        return;
                    }
                    client.field8770 = class449.method2656(5000, 95, (Socket) class384.field5720.field4737);
                    class384.field5720 = null;
                    long var1 = class323.field4666 = class640.method3691(-10880, class646.field9387);
                    class127.field2088.field3913 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class127.field2088.method1710(class97.field1678.field7507, 75);
                    class127.field2088.method1710(var3, 105);
                    client.field8770.method2733(3, 2, 0, class127.field2088.field3952);
                    class599.field8510 = 3;
                }
                if (~class599.field8510 == -4) {
                    if (!client.field8770.method2739(1, 544)) {
                        return;
                    }
                    client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                    int var4 = 255 & class52.field761.field3952[0];
                    if (var4 != 0) {
                        class599.field8510 = 0;
                        class276.method1780(16711935, var4);
                        client.field8770.method2743((byte) 99);
                        client.field8770 = null;
                        class566.method3218(122);
                        return;
                    }
                    class599.field8510 = 4;
                }
                if (~class599.field8510 == -5) {
                    if (!client.field8770.method2739(8, 544)) {
                        return;
                    }
                    client.field8770.method2741(-1, 0, 8, class52.field761.field3952);
                    class52.field761.field3913 = 0;
                    class550.field7793 = class52.field761.method1690(false);
                    class268 var5 = new class268(518);
                    int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class550.field7793 >> 32), (int) class550.field7793 };
                    var5.method1710(10, 91);
                    var5.method1702(var6[0], false);
                    var5.method1702(var6[1], false);
                    var5.method1702(var6[2], false);
                    var5.method1702(var6[3], false);
                    var5.method1721(class640.method3691(-10880, class646.field9387), true);
                    var5.method1726((byte) -52, class621.field8755);
                    var5.method1721(class301.field4353, true);
                    var5.method1721(class363.field5153, true);
                    var5.method1727(class154.field2306, (byte) -121, class406.field6033);
                    class261 var7 = class127.field2088;
                    var7.field3913 = 0;
                    if (~class490.field6891 != -3 && ~class490.field6891 != -4) {
                        var7.method1710(class97.field1683.field7507, 45);
                        var7.method1699(true, 0);
                        int var8 = var7.field3913;
                        var7.method1702(608, false);
                        var7.method1710(class640.field9282.field8321, 26);
                        var7.method1710(class538.field7500, 11);
                        class262.method1670(var7, (byte) -24);
                        var7.method1726((byte) -52, class459.field6612);
                        var7.method1702(class56.field803, false);
                        class330.method2046((byte) -102);
                        var7.method1725(0, var5.field3913, (byte) -12, var5.field3952);
                        var7.method1697(29973, -var8 + var7.field3913);
                    } else {
                        if (class64.field893 != 12) {
                            var7.method1710(class97.field1680.field7507, 40);
                        } else {
                            var7.method1710(class97.field1682.field7507, 22);
                        }
                        var7.method1699(true, 0);
                        int var9 = var7.field3913;
                        var7.method1702(608, false);
                        var7.method1710(class343.field4929, 104);
                        var7.method1710(class512.method2868(2), 25);
                        var7.method1699(true, class68.field1285);
                        var7.method1699(true, class442.field6464);
                        var7.method1710(class202.field2854.field7889, 42);
                        class262.method1670(var7, (byte) -24);
                        var7.method1726((byte) -52, class459.field6612);
                        var7.method1702(class56.field803, false);
                        class268 var10 = new class268(class305.method1899(112));
                        class202.field2854.method3141(var10, 6419);
                        var7.method1710(var10.field3913, 93);
                        var7.method1725(0, var10.field3913, (byte) -12, var10.field3952);
                        class434.field6378 = true;
                        class268 var11 = new class268(class561.method3172(13486));
                        (new class13(true, class270.field3976)).method76(0, var11);
                        var7.method1725(0, var11.field3952.length, (byte) -12, var11.field3952);
                        var7.method1699(true, class465.field6711);
                        class330.method2046((byte) -91);
                        var7.method1725(0, var5.field3913, (byte) -12, var5.field3952);
                        var7.method1697(29973, -var9 + var7.field3913);
                    }
                    client.field8770.method2733(3, var7.field3913, 0, var7.field3952);
                    var7.method1656(8, var6);
                    for (int var12 = 0; ~var12 > -5; ++var12) {
                        var6[var12] += 50;
                    }
                    class52.field761.method1656(8, var6);
                    class599.field8510 = 5;
                }
                if (class599.field8510 == 5) {
                    if (!client.field8770.method2739(1, 544)) {
                        return;
                    }
                    client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                    int var13 = 255 & class52.field761.field3952[0];
                    if (~var13 != -22) {
                        if (var13 == 29) {
                            class599.field8510 = 14;
                        } else {
                            if (var13 == 1) {
                                class599.field8510 = 6;
                                class276.method1780(16711935, var13);
                                return;
                            }
                            if (~var13 != -3) {
                                if (~var13 != -16) {
                                    if (~var13 == -24 && ~class34.field461 > -2) {
                                        class599.field8510 = 1;
                                        class133.field2152 = 0;
                                        ++class34.field461;
                                        client.field8770.method2743((byte) 63);
                                        client.field8770 = null;
                                        return;
                                    }
                                    class599.field8510 = 0;
                                    class276.method1780(16711935, var13);
                                    client.field8770.method2743((byte) 68);
                                    client.field8770 = null;
                                    class566.method3218(105);
                                    return;
                                }
                                class599.field8510 = 15;
                                class541.field7525 = -2;
                            } else {
                                class599.field8510 = 9;
                            }
                        }
                    } else {
                        class599.field8510 = 8;
                    }
                }
                if (class599.field8510 == 7) {
                    class127.field2088.field3913 = 0;
                    class127.field2088.method1663(class97.field1690.field7507, (byte) 114);
                    client.field8770.method2733(3, class127.field2088.field3913, 0, class127.field2088.field3952);
                    class599.field8510 = 5;
                } else if (~class599.field8510 == -9) {
                    if (client.field8770.method2739(1, 544)) {
                        client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                        int var14 = 255 & class52.field761.field3952[0];
                        class634.field9222 = var14 * 60 + 180;
                        class599.field8510 = 0;
                        class276.method1780(16711935, 21);
                        client.field8770.method2743((byte) 23);
                        client.field8770 = null;
                        class566.method3218(-112);
                    }
                } else if (~class599.field8510 == -15) {
                    if (client.field8770.method2739(1, 544)) {
                        client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                        class599.field8510 = 0;
                        class340.field4886 = class52.field761.field3952[0] & 255;
                        class276.method1780(16711935, 29);
                        client.field8770.method2743((byte) 36);
                        client.field8770 = null;
                        class566.method3218(110);
                    }
                } else if (class599.field8510 == 9) {
                    if (client.field8770.method2739(1, 544)) {
                        client.field8770.method2741(-1, 0, 1, class52.field761.field3952);
                        class347.field4973 = 255 & class52.field761.field3952[0];
                        class599.field8510 = 10;
                    }
                } else {
                    if (class599.field8510 == 10) {
                        class261 var15 = class52.field761;
                        if (class490.field6891 == 3) {
                            class218.field3290 = true;
                        } else {
                            class218.field3290 = false;
                        }
                        if (~class490.field6891 != -3 && class490.field6891 != 3) {
                            if (!client.field8770.method2739(class347.field4973, 544)) {
                                return;
                            }
                            client.field8770.method2741(-1, 0, class347.field4973, var15.field3952);
                            var15.field3913 = 0;
                            class602.field8571 = var15.method1738(255);
                            class336.field4816 = var15.method1738(255);
                            class149.field2261 = ~var15.method1738(255) == -2;
                            class118.field1910 = var15.method1738(255) == 1;
                            class10.field110 = ~var15.method1738(255) == -2;
                            class51.field758 = var15.method1745(32132);
                            class153.field2297 = class51.field758 > 0;
                            class538.field7503 = var15.method1745(32132);
                            class237.field3480 = var15.method1745(32132);
                            class510.field7074 = var15.method1745(32132);
                            class382.field5679 = var15.method1748(-108);
                            class39.field542 = class270.field3976.method354(class382.field5679, -21666);
                            class258.field3755 = var15.method1738(255);
                            class19.field290 = var15.method1745(32132);
                            class629.field8846 = var15.method1745(32132);
                            class335.field4802 = ~var15.method1738(255) == -2;
                            class644.field9367.field5958 = class644.field9367.field5961 = var15.method1729((byte) 24);
                            class69.field1302 = new class232();
                            class69.field1302.field3409 = var15.method1745(32132);
                            if (~class69.field1302.field3409 == -65536) {
                                class69.field1302.field3409 = -1;
                            }
                            class69.field1302.field3411 = var15.method1729((byte) 24);
                            if (class563.field8065 != class47.field657) {
                                class69.field1302.field3416 = 40000 - -class69.field1302.field3409;
                                class69.field1302.field3413 = class69.field1302.field3409 + 50000;
                            }
                            if (class97.field1693 != class47.field657 && (class352.field5017.method1518(class308.field4469, (byte) 55) || class352.field5017.method1518(client.field8777, (byte) 95))) {
                                class251.method1588(-21618);
                            }
                        } else {
                            if (!client.field8770.method2739(class347.field4973, 544)) {
                                return;
                            }
                            client.field8770.method2741(-1, 0, class347.field4973, var15.field3952);
                            var15.field3913 = 0;
                            class602.field8571 = var15.method1738(255);
                            class336.field4816 = var15.method1738(255);
                            class149.field2261 = ~var15.method1738(255) == -2;
                            class118.field1910 = ~var15.method1738(255) == -2;
                            class10.field110 = ~var15.method1738(255) == -2;
                            class361.field5140 = ~var15.method1738(255) == -2;
                            class323.field4670 = var15.method1745(32132);
                            class153.field2297 = ~var15.method1738(255) == -2;
                            class216.field3266 = var15.method1736(16894);
                            class56.field800 = var15.method1738(255) == 1;
                            if (class490.field6891 == 3) {
                                boolean var16 = ~var15.method1738(255) == -2;
                                if (var16) {
                                    long var17 = var15.method1690(false);
                                    String var19 = class555.method3108(var17, 0);
                                    int var20 = var15.method1738(255);
                                    byte[] var21 = new byte[var20];
                                    var15.method1662(0, true, var21, var20);
                                    String var22 = class69.method679(var21, true);
                                    class135 var23 = null;
                                    try {
                                        class329 var24 = class270.field3976.method364(false, "3", (byte) 68);
                                        while (~var24.field4739 == -1) {
                                            class210.method1342(-128, 1L);
                                        }
                                        if (var24.field4739 == 1) {
                                            var23 = (class135) var24.field4737;
                                            int var25 = 2 + 2 + var19.length() + (3 - (-var22.length() + -4));
                                            if (var25 > 50) {
                                                throw new RuntimeException(">50");
                                            }
                                            class268 var26 = new class268(var25 + 1);
                                            var26.method1710(var25, 106);
                                            var26.method1710(1, 120);
                                            var26.method1732(var19, 80);
                                            var26.method1732(var22, 110);
                                            var26.method1699(true, class56.field803);
                                            var26.method1746(123);
                                            var23.method1034(var26.field3952, 0, 117, var26.field3913);
                                        }
                                    } catch (Exception var36) {
                                    }
                                    try {
                                        if (var23 != null) {
                                            var23.method1036(67);
                                        }
                                    } catch (Exception var34) {
                                    }
                                    try {
                                        class630.method3564(class270.field3976.field549, "demoaccountcreated", (byte) -124);
                                    } catch (Throwable var33) {
                                    }
                                }
                            }
                            class552.field7819.method2883(class56.field800, (byte) -88);
                            class611.field8684.method1628((byte) 1, class56.field800);
                            class204.field2882.method288(class56.field800, 64);
                        }
                        if ((!class149.field2261 || class10.field110) && !class153.field2297) {
                            try {
                                class630.method3564(class270.field3976.field549, "unzap", (byte) -125);
                            } catch (Throwable var31) {
                            }
                        } else {
                            try {
                                class630.method3564(class270.field3976.field549, "zap", (byte) 27);
                            } catch (Throwable var35) {
                                if (class44.field605) {
                                    try {
                                        class270.field3976.field549.getAppletContext().showDocument(new URL(class270.field3976.field549.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var32) {
                                    }
                                }
                            }
                        }
                        if (class563.field8065 == class47.field657) {
                            try {
                                class630.method3564(class270.field3976.field549, "loggedin", (byte) -116);
                            } catch (Throwable var30) {
                            }
                        }
                        if (~class490.field6891 != -3 && ~class490.field6891 != -4) {
                            class599.field8510 = 0;
                            class276.method1780(16711935, 2);
                            class154.method1095(99);
                            class307.method1904(true, 6);
                            class240.field3487 = null;
                            return;
                        }
                        class599.field8510 = 12;
                    }
                    if (arg0 > -41) {
                        method1840(-33, 35, (byte) -78, 43, -14, 86);
                    }
                    if (class599.field8510 == 12) {
                        if (!client.field8770.method2739(3, 544)) {
                            return;
                        }
                        client.field8770.method2741(-1, 0, 3, class52.field761.field3952);
                        class599.field8510 = 13;
                    }
                    if (~class599.field8510 == -14) {
                        class261 var27 = class52.field761;
                        var27.field3913 = 0;
                        if (var27.method1658((byte) -35)) {
                            if (!client.field8770.method2739(1, 544)) {
                                return;
                            }
                            client.field8770.method2741(-1, 3, 1, var27.field3952);
                        }
                        class240.field3487 = class467.method2716(false)[var27.method1667((byte) -114)];
                        class541.field7525 = var27.method1745(32132);
                        class599.field8510 = 11;
                    }
                    if (class599.field8510 == 11) {
                        if (client.field8770.method2739(class541.field7525, 544)) {
                            client.field8770.method2741(-1, 0, class541.field7525, class52.field761.field3952);
                            class52.field761.field3913 = 0;
                            int var28 = class541.field7525;
                            class599.field8510 = 0;
                            class276.method1780(16711935, 2);
                            class526.method2967((byte) -115);
                            class476.method2756(106, class52.field761);
                            class559.field7931 = -1;
                            class49.method436(89);
                            if (~class52.field761.field3913 != ~var28) {
                                throw new RuntimeException("lswp pos:" + class52.field761.field3913 + " psize:" + var28);
                            } else {
                                class240.field3487 = null;
                            }
                        }
                    } else if (~class599.field8510 == -16) {
                        if (~class541.field7525 == 1) {
                            if (!client.field8770.method2739(2, 544)) {
                                return;
                            }
                            client.field8770.method2741(-1, 0, 2, class52.field761.field3952);
                            class52.field761.field3913 = 0;
                            class541.field7525 = class52.field761.method1745(32132);
                        }
                        if (client.field8770.method2739(class541.field7525, 544)) {
                            client.field8770.method2741(-1, 0, class541.field7525, class52.field761.field3952);
                            class52.field761.field3913 = 0;
                            class599.field8510 = 0;
                            int var29 = class541.field7525;
                            class276.method1780(16711935, 15);
                            class277.method1787((byte) 70);
                            class476.method2756(37, class52.field761);
                            if (~class52.field761.field3913 != ~var29) {
                                throw new RuntimeException("lswpr pos:" + class52.field761.field3913 + " psize:" + var29);
                            } else {
                                class240.field3487 = null;
                            }
                        }
                    }
                }
            } catch (IOException var37) {
                if (client.field8770 != null) {
                    client.field8770.method2743((byte) -110);
                    client.field8770 = null;
                }
                if (class34.field461 < 1) {
                    ++class34.field461;
                    class599.field8510 = 1;
                    class133.field2152 = 0;
                    if (~class490.field6891 != -3 && class490.field6891 != 3) {
                        class552.field7820.field3408 = !class552.field7820.field3408;
                    } else {
                        class352.field5017.field3408 = !class352.field5017.field3408;
                    }
                } else {
                    class599.field8510 = 0;
                    class276.method1780(16711935, -4);
                    class566.method3218(100);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBIII)I", line = 722)
    public static final int method1840(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = 70 % ((arg2 - -3) / 51);
        ++field4206;
        if (class88.field1594 == null) {
            return 0;
        } else {
            if (arg1 < 3) {
                int var7 = arg5 >> 7;
                int var8 = arg0 >> 7;
                if (arg3 < 0 || ~arg4 > -1 || ~(class146.field2247 + -1) > ~arg3 || arg4 > class66.field990 + -1) {
                    return 0;
                }
                if (~var7 > -2 || var8 < 1 || var7 > class146.field2247 + -1 || ~(class66.field990 + -1) > ~var8) {
                    return 0;
                }
                boolean var9 = ~(class104.field1755[1][arg5 >> 7][arg0 >> 7] & 2) != -1;
                if (~(127 & arg5) == -1) {
                    boolean var10 = ~(class104.field1755[1][var7 - 1][arg0 >> 7] & 2) != -1;
                    boolean var11 = (2 & class104.field1755[1][var7][arg0 >> 7]) != 0;
                    if (var10 != var11) {
                        var9 = (2 & class104.field1755[1][arg3][arg4]) != 0;
                    }
                }
                if (~(arg0 & 127) == -1) {
                    boolean var12 = (2 & class104.field1755[1][arg5 >> 7][var8 + -1]) != 0;
                    boolean var13 = ~(2 & class104.field1755[1][arg5 >> 7][var8]) != -1;
                    if (!var12 != !var13) {
                        var9 = (2 & class104.field1755[1][arg3][arg4]) != 0;
                    }
                }
                if (var9) {
                    ++arg1;
                }
            }
            return class88.field1594[arg1].method695(arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V", line = 783)
    public static void method1841(int arg0) {
        field4210 = null;
        if (arg0 == 13) {
            field4212 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILco;)V", line = 794)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 < 75) {
            this.method4(31, 5);
        }
        ++field4211;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field4204 = arg2.method1738(255);
                }
            } else {
                this.field4203 = arg2.method1738(255);
            }
        } else {
            this.field4202 = arg2.method1738(255);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLgp;)V", line = 850)
    public static final void method1842(byte arg0, class561 arg1) {
        class400.field5989 = arg1.method3195(arg0 ^ -56, "titlebg");
        ++field4205;
        if (arg0 == -56) {
            class605.field8617 = arg1.method3195(0, "logo");
        }
    }
}
