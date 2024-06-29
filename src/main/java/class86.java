import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class86 extends class298 {

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    private int field1057 = 0;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    private int field1058 = 1365;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    private int field1060 = 0;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    private int field1061 = 20;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Lsd;")
    public static class74 field1053 = new class74(37, 7);

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "Lwb;")
    public static class45 field1056 = new class45(16);

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field1062 = new String[100];

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)[I", line = 8)
    public final int[] method13(int arg0, boolean arg1) {
        ++field1055;
        if (!arg1) {
            this.method13(117, false);
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            for (int var4 = 0; ~class158.field1877 < ~var4; ++var4) {
                int var5 = (class236.field3260[var4] << 12) / this.field1058 + this.field1057;
                int var6 = (class156.field1865[arg0] << 12) / this.field1058 + this.field1060;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field1061 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field1061 + -1) ? (var13 << 12) / this.field1061 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 66)
    public static final void method438(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        ++field1064;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 - -(arg2 ? class190.field2603 : class173.field2086);
        for (int var8 = var6; ~var8 > ~var7; ++var8) {
            class32 var11 = class276.method1683(21010, var8);
            if (var11.field398 && var11.method164(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class31.field386 = null;
                    class324.field4675 = -1;
                    return;
                }
                if (~var5 <= ~var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var13 > ~var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class324.field4675 = var5;
        class62.field770 = 0;
        class31.field386 = var4;
        String[] var9 = new String[class324.field4675];
        for (int var10 = 0; ~var10 > ~class324.field4675; ++var10) {
            var9[var10] = class276.method1683(21010, var4[var10]).method164(false);
        }
        if (arg1 >= -4) {
            field1054 = -11;
        }
        class18.method123(-28872, class31.field386, var9);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILvt;)V", line = 144)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field1063;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1060 = arg2.method916(21933);
                    }
                } else {
                    this.field1057 = arg2.method916(21933);
                }
            } else {
                this.field1061 = arg2.method916(21933);
            }
        } else {
            this.field1058 = arg2.method916(21933);
        }
        if (arg0 > -44) {
            field1053 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 201)
    public class86() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V", line = 210)
    public static void method439(byte arg0) {
        field1056 = null;
        field1053 = null;
        if (arg0 <= 39) {
            method439((byte) -45);
        }
        field1062 = null;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V", line = 230)
    public static final void method440(int arg0) {
        ++field1059;
        if (~class354.field5089 != -1 && class354.field5089 != 5) {
            try {
                if (++class175.field2107 > 2000) {
                    if (class322.field4655 != null) {
                        class322.field4655.method669(arg0 ^ 4996);
                        class322.field4655 = null;
                    }
                    if (~class456.field6434 <= -2) {
                        class224.field3107 = -5;
                        class354.field5089 = 0;
                        return;
                    }
                    ++class456.field6434;
                    class175.field2107 = 0;
                    class354.field5089 = 1;
                    if (~class463.field6529 != ~class335.field4841) {
                        class463.field6529 = class335.field4841;
                    } else {
                        class463.field6529 = class236.field3268;
                    }
                }
                if (~class354.field5089 == -2) {
                    class224.field3105 = class42.field512.method2175(class463.field6529, (byte) 40, class169.field2007);
                    class354.field5089 = 2;
                }
                if (~class354.field5089 == -3) {
                    if (~class224.field3105.field5759 == -3) {
                        throw new IOException();
                    }
                    if (class224.field3105.field5759 != 1) {
                        return;
                    }
                    class322.field4655 = new class142((Socket) class224.field3105.field5755, class42.field512);
                    class224.field3105 = null;
                    long var1 = class344.field4929 = class41.method207(0, class85.field1050);
                    int var3 = (int) (var1 >> 16 & 31L);
                    class230.field3185.field2206 = 0;
                    class230.field3185.method909(class214.field2946.field4563, -1);
                    class230.field3185.method909(var3, arg0 + -13);
                    class322.field4655.method675(2, 0, (byte) 31, class230.field3185.field2159);
                    if (class46.field594 != null) {
                        class46.field594.method2655((byte) 106);
                    }
                    if (class460.field6501 != null) {
                        class460.field6501.method2655((byte) 106);
                    }
                    int var4 = class322.field4655.method673(arg0 ^ -2105);
                    if (class46.field594 != null) {
                        class46.field594.method2655((byte) 106);
                    }
                    if (class460.field6501 != null) {
                        class460.field6501.method2655((byte) 106);
                    }
                    if (~var4 != -1) {
                        class354.field5089 = 0;
                        class224.field3107 = var4;
                        class322.field4655.method669(5000);
                        class322.field4655 = null;
                        return;
                    }
                    class354.field5089 = 3;
                }
                if (~class354.field5089 == -4) {
                    if (class322.field4655.method676((byte) -23) < 8) {
                        return;
                    }
                    class322.field4655.method672(class79.field939.field2159, 0, (byte) -109, 8);
                    class79.field939.field2206 = 0;
                    class32.field409 = class79.field939.method903(-699358864);
                    int[] var5 = new int[] { (int) (9.9999999E7D * Math.random()), 0, (int) (class32.field409 >> 32), (int) class32.field409 };
                    class230.field3185.field2206 = 0;
                    var5[1] = (int) (9.9999999E7D * Math.random());
                    class230.field3185.method909(10, -1);
                    class230.field3185.method897(var5[0], -110);
                    class230.field3185.method897(var5[1], arg0 ^ -100);
                    class230.field3185.method897(var5[2], -107);
                    class230.field3185.method897(var5[3], -124);
                    class230.field3185.method929((byte) -84, class41.method207(0, class85.field1050));
                    class230.field3185.method935(class486.field6896, arg0 ^ 108);
                    class230.field3185.method914(arg0 + 1350202460, class196.field2707, class99.field1211);
                    class298.field4455.field2206 = 0;
                    if (~class453.field6415 == -41) {
                        class298.field4455.method909(class214.field2951.field4563, -1);
                    } else {
                        class298.field4455.method909(class214.field2949.field4563, -1);
                    }
                    class298.field4455.method884(class230.field3185.field2206 + 161 + class183.method995((byte) 23, class326.field4695), true);
                    class298.field4455.method897(574, arg0 + -128);
                    class298.field4455.method909(class35.field438, arg0 + -13);
                    class298.field4455.method909(class71.method366(118), arg0 + -13);
                    class298.field4455.method884(class110.field1336, true);
                    class298.field4455.method884(class464.field6541, true);
                    class298.field4455.method909(class154.field1855, -1);
                    class347.method2100((byte) -45, class298.field4455);
                    class298.field4455.method935(class326.field4695, -117);
                    class298.field4455.method897(class62.field772, -105);
                    class298.field4455.method897(class379.method2269(16853), -128);
                    class231.field3211 = true;
                    class298.field4455.method884(class315.field4613, true);
                    class298.field4455.method897(class293.field4360.method2770(0), -127);
                    class298.field4455.method897(class474.field6660.method2770(0), -124);
                    class298.field4455.method897(class198.field2753.method2770(arg0 + -12), -123);
                    class298.field4455.method897(class17.field217.method2770(0), -109);
                    class298.field4455.method897(class90.field1129.method2770(0), arg0 ^ -114);
                    class298.field4455.method897(class242.field3319.method2770(0), -113);
                    class298.field4455.method897(class93.field1162.method2770(0), arg0 ^ -100);
                    class298.field4455.method897(class291.field4336.method2770(0), -105);
                    class298.field4455.method897(class171.field2022.method2770(arg0 + -12), arg0 ^ -119);
                    class298.field4455.method897(class200.field2781.method2770(0), -108);
                    class298.field4455.method897(class313.field4568.method2770(0), -112);
                    class298.field4455.method897(class258.field3728.method2770(0), -106);
                    class298.field4455.method897(client.field3937.method2770(0), arg0 + -118);
                    class298.field4455.method897(class39.field470.method2770(0), -118);
                    class298.field4455.method897(class74.field900.method2770(0), -106);
                    class298.field4455.method897(class4.field51.method2770(0), -114);
                    class298.field4455.method897(class83.field1012.method2770(0), -107);
                    class298.field4455.method897(class349.field5018.method2770(arg0 ^ 12), -105);
                    class298.field4455.method897(class438.field6283.method2770(0), -104);
                    class298.field4455.method897(class78.field936.method2770(arg0 ^ 12), -118);
                    class298.field4455.method897(class160.field1929.method2770(0), arg0 ^ -127);
                    class298.field4455.method897(class443.field6325.method2770(0), arg0 ^ -113);
                    class298.field4455.method897(class348.field4956.method2770(arg0 ^ 12), -125);
                    class298.field4455.method897(class353.field5071.method2770(0), arg0 + -134);
                    class298.field4455.method897(class474.field6659.method2770(arg0 + -12), -107);
                    class298.field4455.method897(class310.field4541.method2770(0), -126);
                    class298.field4455.method897(class198.field2750.method2770(0), arg0 ^ -97);
                    class298.field4455.method897(class76.field919.method2770(0), -114);
                    class298.field4455.method897(class28.field367.method2770(0), -122);
                    class298.field4455.method934((byte) -112, class230.field3185.field2159, 0, class230.field3185.field2206);
                    class322.field4655.method675(class298.field4455.field2206, 0, (byte) 113, class298.field4455.field2159);
                    class230.field3185.method2013(var5, (byte) -14);
                    for (int var6 = 0; var6 < 4; ++var6) {
                        var5[var6] += 50;
                    }
                    class79.field939.method2013(var5, (byte) -14);
                    class354.field5089 = 4;
                }
                if (class354.field5089 == 4) {
                    if (~class322.field4655.method676((byte) 115) > -2) {
                        return;
                    }
                    int var7 = class322.field4655.method673(arg0 + -2113);
                    if (~var7 != -22) {
                        if (var7 == 29) {
                            class354.field5089 = 11;
                        } else {
                            if (~var7 == -2) {
                                class354.field5089 = 5;
                                class224.field3107 = var7;
                                return;
                            }
                            if (~var7 == -3) {
                                class354.field5089 = 8;
                            } else {
                                if (~var7 != -16) {
                                    if (~var7 == -24 && class456.field6434 < 1) {
                                        class354.field5089 = 1;
                                        ++class456.field6434;
                                        class175.field2107 = 0;
                                        class322.field4655.method669(5000);
                                        class322.field4655 = null;
                                        return;
                                    }
                                    class354.field5089 = 0;
                                    class224.field3107 = var7;
                                    class322.field4655.method669(5000);
                                    class322.field4655 = null;
                                    return;
                                }
                                class354.field5089 = 12;
                                class361.field5203 = -2;
                            }
                        }
                    } else {
                        class354.field5089 = 7;
                    }
                }
                if (~class354.field5089 == -7) {
                    class230.field3185.field2206 = 0;
                    class230.field3185.method2008(class214.field2950.field4563, (byte) -2);
                    class322.field4655.method675(class230.field3185.field2206, 0, (byte) -106, class230.field3185.field2159);
                    class354.field5089 = 4;
                } else if (class354.field5089 == 7) {
                    if (class322.field4655.method676((byte) -8) >= 1) {
                        class105.field1268 = (class322.field4655.method673(-2101) + 3) * 60;
                        class224.field3107 = 21;
                        class354.field5089 = 0;
                        class322.field4655.method669(5000);
                        class322.field4655 = null;
                    }
                } else if (class354.field5089 == 11) {
                    if (class322.field4655.method676((byte) 93) >= 1) {
                        class110.field1354 = class322.field4655.method673(-2101);
                        class354.field5089 = 0;
                        class224.field3107 = 29;
                        class322.field4655.method669(5000);
                        class322.field4655 = null;
                    }
                } else {
                    if (class354.field5089 == 8) {
                        if (class322.field4655.method676((byte) -21) < 13) {
                            return;
                        }
                        class322.field4655.method672(class79.field939.field2159, 0, (byte) -92, 13);
                        class79.field939.field2206 = 0;
                        class369.field5285 = class79.field939.method895((byte) -85);
                        class58.field728 = class79.field939.method895((byte) -79);
                        class456.field6432 = class79.field939.method895((byte) -76) == 1;
                        class10.field133 = class79.field939.method895((byte) -120) == 1;
                        class199.field2770 = class79.field939.method895((byte) -122) == 1;
                        class392.field5586 = class79.field939.method895((byte) -112) == 1;
                        class61.field760 = class79.field939.method916(arg0 ^ 21921);
                        class18.field238 = ~class79.field939.method895((byte) -120) == -2;
                        class101.field1234 = class79.field939.method895((byte) -114) == 1;
                        class173.field2084.method2296((byte) -127, class101.field1234);
                        class422.field6096.method116(class101.field1234, 100);
                        class390.field5575.method2506(class101.field1234, -129);
                        if ((!class456.field6432 || class199.field2770) && !class18.field238) {
                            try {
                                class336.method2038(class42.field512.field5106, -125, "unzap");
                            } catch (Throwable var12) {
                            }
                        } else {
                            try {
                                class336.method2038(class42.field512.field5106, -122, "zap");
                            } catch (Throwable var13) {
                                if (class24.field330) {
                                    try {
                                        class42.field512.field5106.getAppletContext().showDocument(new URL(class42.field512.field5106.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var11) {
                                    }
                                }
                            }
                        }
                        if (class414.field5904 == class145.field1754) {
                            try {
                                class336.method2038(class42.field512.field5106, -122, "loggedin");
                            } catch (Throwable var10) {
                            }
                        }
                        class354.field5089 = 10;
                    }
                    if (~class354.field5089 == -11) {
                        if (class79.field939.method2009(arg0 + 243)) {
                            if (~class322.field4655.method676((byte) -97) > -2) {
                                return;
                            }
                            class322.field4655.method672(class79.field939.field2159, class79.field939.field2206 - -2, (byte) -22, 1);
                        }
                        class233.field3240 = class71.method361(-114)[class79.field939.method2010(arg0 + -140)];
                        class361.field5203 = class79.field939.method916(21933);
                        class354.field5089 = 9;
                    }
                    if (arg0 != 12) {
                        method438((String) null, -113, false);
                    }
                    if (class354.field5089 == 9) {
                        if (class322.field4655.method676((byte) -26) >= class361.field5203) {
                            class322.field4655.method672(class79.field939.field2159, 0, (byte) -25, class361.field5203);
                            class79.field939.field2206 = 0;
                            int var8 = class361.field5203;
                            class354.field5089 = 0;
                            class224.field3107 = 2;
                            class260.method1598(0);
                            class47.method248(class79.field939, (byte) 101);
                            class366.field5243 = -1;
                            class478.method2827(-30362, false);
                            if (class79.field939.field2206 != var8) {
                                throw new RuntimeException("lswp pos:" + class79.field939.field2206 + " psize:" + var8);
                            } else {
                                class233.field3240 = null;
                            }
                        }
                    } else if (~class354.field5089 == -13) {
                        if (~class361.field5203 == 1) {
                            if (class322.field4655.method676((byte) -91) < 2) {
                                return;
                            }
                            class322.field4655.method672(class79.field939.field2159, 0, (byte) -116, 2);
                            class79.field939.field2206 = 0;
                            class361.field5203 = class79.field939.method916(arg0 + 21921);
                        }
                        if (class322.field4655.method676((byte) 111) >= class361.field5203) {
                            class322.field4655.method672(class79.field939.field2159, 0, (byte) -110, class361.field5203);
                            class79.field939.field2206 = 0;
                            class224.field3107 = 15;
                            class354.field5089 = 0;
                            int var9 = class361.field5203;
                            class337.method2046(320);
                            class47.method248(class79.field939, (byte) 63);
                            if (~class79.field939.field2206 != ~var9) {
                                throw new RuntimeException("lswpr pos:" + class79.field939.field2206 + " psize:" + var9);
                            } else {
                                class233.field3240 = null;
                            }
                        }
                    }
                }
            } catch (IOException var14) {
                if (class322.field4655 != null) {
                    class322.field4655.method669(5000);
                    class322.field4655 = null;
                }
                if (~class456.field6434 > -2) {
                    ++class456.field6434;
                    if (~class463.field6529 == ~class335.field4841) {
                        class463.field6529 = class236.field3268;
                    } else {
                        class463.field6529 = class335.field4841;
                    }
                    class354.field5089 = 1;
                    class175.field2107 = 0;
                } else {
                    class354.field5089 = 0;
                    class224.field3107 = -4;
                }
            }
        }
    }
}
