import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class335 implements class450 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lkn;")
    private class742 field4828;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    public static int[] field4824 = new int[14];

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Ljt;")
    public static class106 field4831 = new class106(4);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lhia;")
    public static class66 field4827;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)I")
    public static final int method2110(int arg0, int arg1, int arg2, int arg3) {
        field4830++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (arg3 == -30732) {
            return var4 == 2 ? 4095 - arg2 : -arg0 + 4095;
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2111(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            field4825++;
            return (arg2 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        field4826++;
        if (arg0 != -24346) {
            method2111(true, 98, -77);
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public final void method1253(int arg0) {
        if (arg0 == 27444) {
            field4829++;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method2112(byte arg0) {
        if (arg0 != 20) {
            method2113(-81);
        }
        field4827 = null;
        field4824 = null;
        field4831 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static final void method2113(int arg0) {
        field4832++;
        if (class233.field3400 == 0 || class233.field3400 == 5) {
            return;
        }
        try {
            if (arg0 != -236) {
                method2110(-105, -108, 96, 28);
            }
            short var1;
            if (class50.field719 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (++class716.field10076 > var1) {
                if (class533.field7668 != null) {
                    class533.field7668.method850(2);
                    class533.field7668 = null;
                }
                if (class50.field719 >= 3) {
                    class233.field3400 = 0;
                    class610.method3539(-5, true);
                    return;
                }
                if (class654.field9174 == 2) {
                    class528.field7513.method3332(arg0 ^ 0x3032);
                } else {
                    class15.field202.method3332(arg0 - 12270);
                }
                class50.field719++;
                class233.field3400 = 1;
                class716.field10076 = 0;
            }
            if (class233.field3400 == 1) {
                if (class654.field9174 == 2) {
                    class150.field2335 = class528.field7513.method3334(class179.field2759, false);
                } else {
                    class150.field2335 = class15.field202.method3334(class179.field2759, false);
                }
                class233.field3400 = 2;
            }
            if (class233.field3400 == 2) {
                if (class150.field2335.field2986 == 2) {
                    throw new IOException();
                }
                if (class150.field2335.field2986 != 1) {
                    return;
                }
                class533.field7668 = class496.method2954(arg0 + 5362, (Socket) class150.field2335.field2990, 7500);
                class150.field2335 = null;
                class739.method4142((byte) -69);
                class468 var2 = class317.method2011(0);
                var2.field6839.method3730(arg0 ^ 0xFFFFFF7A, class725.field10114.field7796);
                class120.method872((byte) -54, var2);
                class691.method3927(1635);
                class233.field3400 = 3;
            }
            if (class233.field3400 == 3) {
                if (!class533.field7668.method852(1, false)) {
                    return;
                }
                class533.field7668.method853(arg0 + 240, class469.field6851.field9068, 1, 0);
                int var3 = class469.field6851.field9068[0] & 0xFF;
                if (var3 != 0) {
                    class233.field3400 = 0;
                    class610.method3539(var3, true);
                    class533.field7668.method850(2);
                    class533.field7668 = null;
                    class59.method408(-30879);
                    return;
                }
                class469.field6851.field9084 = 0;
                class645 var4 = new class645(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method3730(103, 10);
                var4.method3695(var5[0], 255);
                var4.method3695(var5[1], 255);
                var4.method3695(var5[2], 255);
                var4.method3695(var5[3], 255);
                var4.method3735(0L, -59);
                var4.method3692(120, class273.field3888);
                var4.method3735(class286.field4061, -108);
                var4.method3735(class410.field6172, arg0 + 182);
                var4.method3707(class516.field7312, class354.field5145, 116);
                class739.method4142((byte) -69);
                class468 var6 = class317.method2011(arg0 ^ 0xFFFFFF14);
                class304 var7 = var6.field6839;
                if (class654.field9174 == 2) {
                    if (class87.field1246 == 13) {
                        var7.method3730(105, class725.field10124.field7796);
                    } else {
                        var7.method3730(104, class725.field10121.field7796);
                    }
                    var7.method3702(0, (byte) -115);
                    int var8 = var7.field9084;
                    var7.method3695(639, 255);
                    var7.method3703(0, var4.field9068, var4.field9084, 128);
                    int var9 = var7.field9084;
                    var7.method3692(120, class100.field1424);
                    var7.method3730(104, class92.field1284);
                    var7.method3730(126, class756.method4219((byte) 8));
                    var7.method3702(class501.field7123, (byte) -121);
                    var7.method3702(class510.field7263, (byte) -118);
                    var7.method3730(107, class63.field916.field10183.method1426(17503));
                    class274.method1743(var7, (byte) 34);
                    var7.method3692(120, class736.field10317);
                    var7.method3695(class299.field4243, arg0 + 491);
                    class645 var10 = class63.field916.method4106((byte) 110);
                    var7.method3730(arg0 ^ 0xFFFFFF7B, var10.field9084);
                    var7.method3703(0, var10.field9068, var10.field9084, arg0 + 364);
                    class349.field5105 = true;
                    class645 var11 = new class645(class259.field3702.method3086((byte) -106));
                    class259.field3702.method3085(arg0 ^ 0xFFFFFF67, var11);
                    var7.method3703(0, var11.field9068, var11.field9068.length, 128);
                    var7.method3702(class352.field5129, (byte) -125);
                    var7.method3735(class293.field4177, -25);
                    var7.method3730(104, class64.field925 == null ? 0 : 1);
                    if (class64.field925 != null) {
                        var7.method3692(120, class64.field925);
                    }
                    var7.method3730(arg0 ^ 0xFFFFFF64, class154.method1150((byte) 102, "jagtheora") ? 1 : 0);
                    class112.method837((byte) 65, var7);
                    var7.method3732(var7.field9084, var5, (byte) 127, var9);
                    var7.method3700(var7.field9084 - var8, false);
                } else {
                    var7.method3730(arg0 + 344, class725.field10125.field7796);
                    var7.method3702(0, (byte) -124);
                    int var12 = var7.field9084;
                    var7.method3695(639, 255);
                    var7.method3703(0, var4.field9068, var4.field9084, arg0 ^ 0xFFFFFF94);
                    int var13 = var7.field9084;
                    var7.method3692(arg0 ^ 0xFFFFFF63, class100.field1424);
                    var7.method3730(103, class199.field2993.field6820);
                    var7.method3730(101, class650.field9160);
                    class274.method1743(var7, (byte) 34);
                    var7.method3692(122, class736.field10317);
                    var7.method3695(class299.field4243, 255);
                    class112.method837((byte) 50, var7);
                    var7.method3732(var7.field9084, var5, (byte) 122, var13);
                    var7.method3700(var7.field9084 - var12, false);
                }
                class120.method872((byte) -108, var6);
                class691.method3927(1635);
                class29.field284 = new class744(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class469.field6851.method1919(var5, -126);
                class233.field3400 = 4;
            }
            if (class233.field3400 == 4) {
                if (!class533.field7668.method852(1, false)) {
                    return;
                }
                class533.field7668.method853(4, class469.field6851.field9068, 1, 0);
                int var15 = class469.field6851.field9068[0] & 0xFF;
                if (var15 == 21) {
                    class233.field3400 = 7;
                } else if (var15 == 29) {
                    class233.field3400 = 13;
                } else if (var15 == 1) {
                    class233.field3400 = 5;
                    class610.method3539(var15, true);
                    return;
                } else if (var15 == 2) {
                    class233.field3400 = 8;
                } else if (var15 == 15) {
                    class233.field3400 = 14;
                    class228.field3361 = -2;
                } else if (var15 == 23 && class50.field719 < 3) {
                    class50.field719++;
                    class716.field10076 = 0;
                    class233.field3400 = 1;
                    class533.field7668.method850(arg0 + 238);
                    class533.field7668 = null;
                    return;
                } else {
                    class233.field3400 = 0;
                    class610.method3539(var15, true);
                    class533.field7668.method850(2);
                    class533.field7668 = null;
                    class59.method408(arg0 - 30643);
                    return;
                }
            }
            if (class233.field3400 == 6) {
                class739.method4142((byte) -69);
                class468 var16 = class317.method2011(0);
                class304 var17 = var16.field6839;
                var17.method1917(-32769, class29.field284);
                var17.method1921(class725.field10129.field7796, 2537);
                class120.method872((byte) 95, var16);
                class691.method3927(1635);
                class233.field3400 = 4;
            } else if (class233.field3400 == 7) {
                if (class533.field7668.method852(1, false)) {
                    class533.field7668.method853(arg0 ^ 0xFFFFFF10, class469.field6851.field9068, 1, 0);
                    int var18 = class469.field6851.field9068[0] & 0xFF;
                    class284.field4038 = (var18 + 3) * 60;
                    class233.field3400 = 0;
                    class610.method3539(21, true);
                    class533.field7668.method850(2);
                    class533.field7668 = null;
                    class59.method408(arg0 - 30643);
                }
            } else if (class233.field3400 == 13) {
                if (class533.field7668.method852(1, false)) {
                    class533.field7668.method853(4, class469.field6851.field9068, 1, 0);
                    class233.field3400 = 0;
                    class194.field2941 = class469.field6851.field9068[0] & 0xFF;
                    class610.method3539(29, true);
                    class533.field7668.method850(2);
                    class533.field7668 = null;
                    class59.method408(arg0 ^ 0x7875);
                }
            } else if (class233.field3400 != 8) {
                if (class233.field3400 == 9) {
                    class304 var19 = class469.field6851;
                    if (class654.field9174 == 2) {
                        if (!class533.field7668.method852(class712.field10047, false)) {
                            return;
                        }
                        class533.field7668.method853(4, var19.field9068, class712.field10047, 0);
                        var19.field9084 = 0;
                        class245.field3569 = var19.method3745(-6314);
                        class593.field8418 = var19.method3745(-6314);
                        class185.field2825 = var19.method3745(-6314) == 1;
                        class83.field1166 = var19.method3745(-6314) == 1;
                        class637.field8951 = var19.method3745(arg0 - 6078) == 1;
                        class394.field5929 = var19.method3745(-6314) == 1;
                        class701.field9775 = var19.method3712((byte) -124);
                        class71.field1005 = var19.method3745(-6314) == 1;
                        class43.field463 = var19.method3718(-28732);
                        class691.field9553 = var19.method3745(arg0 - 6078) == 1;
                        class239.field3470.method399(arg0 + 237, class691.field9553);
                        class336.field4876.method2078(arg0 + 346, class691.field9553);
                        class74.field1032.method3326(1297, class691.field9553);
                    } else if (class533.field7668.method852(class712.field10047, false)) {
                        class533.field7668.method853(4, var19.field9068, class712.field10047, 0);
                        var19.field9084 = 0;
                        class245.field3569 = var19.method3745(-6314);
                        class593.field8418 = var19.method3745(arg0 - 6078);
                        class185.field2825 = var19.method3745(-6314) == 1;
                        class83.field1166 = var19.method3745(arg0 ^ 0x1842) == 1;
                        class637.field8951 = var19.method3745(-6314) == 1;
                        class533.field7664 = var19.method3756(arg0 + 65772);
                        class71.field1005 = class533.field7664 > 0;
                        class657.field9199 = var19.method3712((byte) 99);
                        class63.field918 = var19.method3712((byte) -118);
                        class706.field9940 = var19.method3712((byte) 71);
                        class69.field980 = var19.method3720(-19541);
                        class638.field8956 = class179.field2759.method4048((byte) -116, class69.field980);
                        class601.field8508 = var19.method3745(-6314);
                        class186.field2843 = var19.method3712((byte) -105);
                        class397.field5948 = var19.method3712((byte) -124);
                        class290.field4152 = var19.method3745(-6314) == 1;
                        class130.field1749.field9513 = class130.field1749.field9522 = class758.field10601 = var19.method3696(-98);
                        class289.field4137 = var19.method3745(-6314);
                        class92.field1285 = var19.method3720(-19541);
                        class350.field5112 = new class575();
                        class350.field5112.field8131 = var19.method3712((byte) -113);
                        if (class350.field5112.field8131 == 65535) {
                            class350.field5112.field8131 = -1;
                        }
                        class350.field5112.field8138 = var19.method3696(-64);
                        if (class607.field8585 != class206.field3043) {
                            class350.field5112.field8139 = class350.field5112.field8131 + 50000;
                            class350.field5112.field8136 = class350.field5112.field8131 + 40000;
                        }
                        if (class396.field5945 != class206.field3043 && (class528.field7513.method3335(124, class642.field9006) || class528.field7513.method3335(92, class92.field1287))) {
                            class690.method3925(-126);
                        }
                    } else {
                        return;
                    }
                    if ((!class185.field2825 || class637.field8951) && !class71.field1005) {
                        try {
                            class121.method877(class466.field6830, "unzap", -22421);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class121.method877(class466.field6830, "zap", -22421);
                        } catch (Throwable var26) {
                            if (class716.field10075) {
                                try {
                                    class466.field6830.getAppletContext().showDocument(new URL(class466.field6830.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var24) {
                                }
                            }
                        }
                    }
                    if (class607.field8585 == class206.field3043) {
                        try {
                            class121.method877(class466.field6830, "loggedin", arg0 ^ 0x577F);
                        } catch (Throwable var23) {
                        }
                    }
                    if (class654.field9174 != 2) {
                        class233.field3400 = 0;
                        class610.method3539(2, true);
                        class565.method3289((byte) -120);
                        class49.method363(7, arg0 + 140);
                        class542.field7732 = null;
                        return;
                    }
                    class233.field3400 = 11;
                }
                if (class233.field3400 == 11) {
                    if (!class533.field7668.method852(3, false)) {
                        return;
                    }
                    class533.field7668.method853(4, class469.field6851.field9068, 3, 0);
                    class233.field3400 = 12;
                }
                if (class233.field3400 == 12) {
                    class304 var20 = class469.field6851;
                    var20.field9084 = 0;
                    if (var20.method1922(-98)) {
                        if (!class533.field7668.method852(1, false)) {
                            return;
                        }
                        class533.field7668.method853(4, var20.field9068, 1, 3);
                    }
                    class542.field7732 = class24.method121(15513)[var20.method1915((byte) -14)];
                    class228.field3361 = var20.method3712((byte) -120);
                    class233.field3400 = 10;
                }
                if (class233.field3400 == 10) {
                    if (class533.field7668.method852(class228.field3361, false)) {
                        class533.field7668.method853(arg0 ^ 0xFFFFFF10, class469.field6851.field9068, class228.field3361, 0);
                        class469.field6851.field9084 = 0;
                        int var21 = class228.field3361;
                        class233.field3400 = 0;
                        class610.method3539(2, true);
                        class289.method1843((byte) 106);
                        class68.method600(arg0 + 236, class469.field6851);
                        class352.field5126 = -1;
                        if (class542.field7732 == class262.field3720) {
                            class291.method1860((byte) -85);
                        } else {
                            class46.method346(40);
                        }
                        if (class469.field6851.field9084 != var21) {
                            throw new RuntimeException("lswp pos:" + class469.field6851.field9084 + " psize:" + var21);
                        }
                        class542.field7732 = null;
                    }
                } else if (class233.field3400 == 14) {
                    if (class228.field3361 == -2) {
                        if (!class533.field7668.method852(2, false)) {
                            return;
                        }
                        class533.field7668.method853(4, class469.field6851.field9068, 2, 0);
                        class469.field6851.field9084 = 0;
                        class228.field3361 = class469.field6851.method3712((byte) 23);
                    }
                    if (class533.field7668.method852(class228.field3361, false)) {
                        class533.field7668.method853(4, class469.field6851.field9068, class228.field3361, 0);
                        class469.field6851.field9084 = 0;
                        int var22 = class228.field3361;
                        class233.field3400 = 0;
                        class610.method3539(15, true);
                        class223.method1503((byte) -124);
                        class68.method600(arg0 ^ 0xFFFFFF14, class469.field6851);
                        if (class469.field6851.field9084 != var22) {
                            throw new RuntimeException("lswpr pos:" + class469.field6851.field9084 + " psize:" + var22);
                        }
                        class542.field7732 = null;
                    }
                }
            } else if (class533.field7668.method852(1, false)) {
                class533.field7668.method853(4, class469.field6851.field9068, 1, 0);
                class712.field10047 = class469.field6851.field9068[0] & 0xFF;
                class233.field3400 = 9;
            }
        } catch (IOException var27) {
            if (class533.field7668 != null) {
                class533.field7668.method850(arg0 ^ 0xFFFFFF16);
                class533.field7668 = null;
            }
            if (class50.field719 < 3) {
                if (class654.field9174 == 2) {
                    class528.field7513.method3332(-12506);
                } else {
                    class15.field202.method3332(-12506);
                }
                class50.field719++;
                class233.field3400 = 1;
                class716.field10076 = 0;
            } else {
                class233.field3400 = 0;
                class610.method3539(-4, true);
                class59.method408(-30879);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkn;)V")
    public class335(class742 arg0) {
        this.field4828 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
    public final void method1249(int arg0, boolean arg1) {
        field4823++;
        if (arg1) {
            class736.field10316.method516(0, 0, class501.field7123, class510.field7263, this.field4828.field10411, 0);
        }
        if (arg0 != 7620) {
            method2113(39);
        }
    }
}
