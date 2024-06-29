import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class301 extends class354 {

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "I")
    private int field4416 = 0;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    private int field4413 = 0;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    private int field4414 = 1;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    private static int field4411;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ss", name = "R", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ss", name = "S", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ss", name = "T", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ss", name = "V", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ss", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field4420;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lnj;II)V", line = 6)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field4417;
        if (arg2 != 1638) {
            method1908((byte) -36);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field4414 = arg0.method1087(false);
                }
            } else {
                this.field4413 = arg0.method1087(false);
            }
        } else {
            this.field4416 = arg0.method1087(false);
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V", line = 51)
    public static final void method1908(byte arg0) {
        if (arg0 != -10) {
            method1909(8);
        }
        ++field4421;
        if (class380.field5793 != 0 && class380.field5793 != 6) {
            try {
                if (~(++class470.field7016) < -2001) {
                    if (class374.field5695 != null) {
                        class374.field5695.method1934((byte) -59);
                        class374.field5695 = null;
                    }
                    if (class468.field7002 >= 1) {
                        class380.field5793 = 0;
                        class79.method542(-5, (byte) 93);
                        return;
                    }
                    class470.field7016 = 0;
                    ++class468.field7002;
                    class380.field5793 = 1;
                    if (class445.field6688 != 2 && ~class445.field6688 != -4) {
                        class355.field5495.field2608 = !class355.field5495.field2608;
                    } else {
                        class139.field1851.field2608 = !class139.field1851.field2608;
                    }
                }
                if (class380.field5793 == 1) {
                    if (class445.field6688 != 2 && class445.field6688 != 3) {
                        class375.field5696 = class312.field4572.method2991(class355.field5495.method1315(arg0 + -116), class355.field5495.field2603, 1);
                    } else {
                        class375.field5696 = class312.field4572.method2991(class139.field1851.method1315(-128), class139.field1851.field2603, 1);
                    }
                    class380.field5793 = 2;
                }
                if (class380.field5793 == 2) {
                    if (class375.field5696.field3322 == 2) {
                        throw new IOException();
                    }
                    if (class375.field5696.field3322 != 1) {
                        return;
                    }
                    class374.field5695 = class5.method26((Socket) class375.field5696.field3324, 5000, 32194);
                    class375.field5696 = null;
                    long var1 = class243.field3411 = class133.method904(class452.field6813, arg0 + 47);
                    class538.field7879.field2185 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class538.field7879.method1072((byte) 102, class198.field2623.field6547);
                    class538.field7879.method1072((byte) 102, var3);
                    class374.field5695.method1936(2, true, class538.field7879.field2219, 0);
                    class380.field5793 = 3;
                }
                if (~class380.field5793 == -4) {
                    if (!class374.field5695.method1929((byte) -82, 1)) {
                        return;
                    }
                    class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                    int var4 = class409.field6214.field2219[0] & 255;
                    if (~var4 != -1) {
                        class380.field5793 = 0;
                        class79.method542(var4, (byte) 57);
                        class374.field5695.method1934((byte) -87);
                        class374.field5695 = null;
                        class533.method3152(124);
                        return;
                    }
                    class380.field5793 = 4;
                }
                if (~class380.field5793 == -5) {
                    if (!class374.field5695.method1929((byte) -82, 8)) {
                        return;
                    }
                    class374.field5695.method1931(class409.field6214.field2219, 8, 32, 0);
                    class409.field6214.field2185 = 0;
                    class125.field1705 = class409.field6214.method1078((byte) 98);
                    class164 var5 = new class164(70);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class125.field1705 >> 32), (int) class125.field1705 };
                    var5.method1072((byte) 102, 10);
                    var5.method1073(326170192, var6[0]);
                    var5.method1073(arg0 ^ -326170202, var6[1]);
                    var5.method1073(326170192, var6[2]);
                    var5.method1073(326170192, var6[3]);
                    var5.method1054(class133.method904(class452.field6813, 37), arg0 + -713416062);
                    var5.method1071(-25643, class530.field7794);
                    var5.method1102(class135.field1807, 0, class279.field3965);
                    class141 var7 = class538.field7879;
                    var7.field2185 = 0;
                    if (~class445.field6688 != -3 && class445.field6688 != 3) {
                        var7.method1072((byte) 102, class198.field2628.field6547);
                        var7.method1114(0, 127);
                        int var8 = var7.field2185;
                        var7.method1073(326170192, 603);
                        var7.method1072((byte) 102, class67.field957.field930);
                        var7.method1072((byte) 102, class257.field3556);
                        class136.method915(-10970, var7);
                        var7.method1071(arg0 + -25633, class407.field6188);
                        var7.method1073(326170192, class331.field5167);
                        class278.method1786(73);
                        var7.method1089(0, var5.field2219, arg0 ^ 4522, var5.field2185);
                        var7.method1052((byte) -115, -var8 + var7.field2185);
                    } else {
                        if (class435.field6596 != 12) {
                            var7.method1072((byte) 102, class198.field2625.field6547);
                        } else {
                            var7.method1072((byte) 102, class198.field2627.field6547);
                        }
                        var7.method1114(0, arg0 ^ -101);
                        int var9 = var7.field2185;
                        var7.method1073(326170192, 603);
                        var7.method1072((byte) 102, class67.field955);
                        var7.method1072((byte) 102, class325.method2014((byte) 81));
                        var7.method1114(class147.field1961, 87);
                        var7.method1114(class107.field1525, 122);
                        var7.method1072((byte) 102, class203.field2716.field1150);
                        class136.method915(-10970, var7);
                        var7.method1071(-25643, class407.field6188);
                        var7.method1073(arg0 + 326170202, class331.field5167);
                        class164 var10 = class203.field2716.method14(arg0 ^ -12);
                        var7.method1072((byte) 102, var10.field2185);
                        var7.method1089(0, var10.field2219, -4516, var10.field2185);
                        class502.field7416 = true;
                        var7.method1114(class230.field3289, 122);
                        var7.method1114(class508.field7476, 123);
                        class278.method1786(arg0 ^ -51);
                        var7.method1089(0, var5.field2219, arg0 + -4506, var5.field2185);
                        var7.method1052((byte) 126, -var9 + var7.field2185);
                    }
                    class374.field5695.method1936(var7.field2185, true, var7.field2219, 0);
                    var7.method941(var6, 23);
                    for (int var11 = 0; ~var11 > -5; ++var11) {
                        var6[var11] += 50;
                    }
                    class409.field6214.method941(var6, 28);
                    class380.field5793 = 5;
                }
                if (~class380.field5793 == -6) {
                    if (!class374.field5695.method1929((byte) -82, 1)) {
                        return;
                    }
                    class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                    int var12 = class409.field6214.field2219[0] & 255;
                    if (var12 != 21) {
                        if (var12 != 29) {
                            if (var12 == 1) {
                                class380.field5793 = 6;
                                class79.method542(var12, (byte) 110);
                                return;
                            }
                            if (var12 == 2) {
                                class380.field5793 = 9;
                            } else {
                                if (~var12 != -16) {
                                    if (var12 == 23 && ~class468.field7002 > -2) {
                                        class380.field5793 = 1;
                                        ++class468.field7002;
                                        class470.field7016 = 0;
                                        class374.field5695.method1934((byte) -91);
                                        class374.field5695 = null;
                                        return;
                                    }
                                    class380.field5793 = 0;
                                    class79.method542(var12, (byte) 122);
                                    class374.field5695.method1934((byte) -115);
                                    class374.field5695 = null;
                                    class533.method3152(96);
                                    return;
                                }
                                class497.field7326 = -2;
                                class380.field5793 = 15;
                            }
                        } else {
                            class380.field5793 = 14;
                        }
                    } else {
                        class380.field5793 = 8;
                    }
                }
                if (~class380.field5793 == -8) {
                    class538.field7879.field2185 = 0;
                    class538.field7879.method947(arg0 ^ 122, class198.field2626.field6547);
                    class374.field5695.method1936(class538.field7879.field2185, true, class538.field7879.field2219, 0);
                    class380.field5793 = 5;
                } else if (class380.field5793 == 8) {
                    if (class374.field5695.method1929((byte) -82, 1)) {
                        class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                        int var13 = 255 & class409.field6214.field2219[0];
                        class380.field5793 = 0;
                        class532.field7830 = (var13 + 3) * 60;
                        class79.method542(21, (byte) 59);
                        class374.field5695.method1934((byte) -19);
                        class374.field5695 = null;
                        class533.method3152(arg0 ^ -116);
                    }
                } else if (~class380.field5793 == -15) {
                    if (class374.field5695.method1929((byte) -82, 1)) {
                        class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                        class380.field5793 = 0;
                        class489.field7230 = 255 & class409.field6214.field2219[0];
                        class79.method542(29, (byte) 77);
                        class374.field5695.method1934((byte) -104);
                        class374.field5695 = null;
                        class533.method3152(101);
                    }
                } else if (class380.field5793 == 9) {
                    if (class374.field5695.method1929((byte) -82, 1)) {
                        class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                        class380.field5793 = 10;
                        class99.field1446 = 255 & class409.field6214.field2219[0];
                    }
                } else {
                    if (~class380.field5793 == -11) {
                        class141 var14 = class409.field6214;
                        if (~class445.field6688 != -4) {
                            class492.field7257 = false;
                        } else {
                            class492.field7257 = true;
                        }
                        if (~class445.field6688 != -3 && ~class445.field6688 != -4) {
                            if (!class374.field5695.method1929((byte) -82, class99.field1446)) {
                                return;
                            }
                            class374.field5695.method1931(var14.field2219, class99.field1446, arg0 + 42, 0);
                            var14.field2185 = 0;
                            class257.field3562 = var14.method1087(false);
                            class89.field1297 = var14.method1087(false);
                            class230.field3300 = var14.method1087(false) == 1;
                            class60.field865 = ~var14.method1087(false) == -2;
                            class457.field6855 = ~var14.method1087(false) == -2;
                            class141.field1891 = var14.method1074(-635989152);
                            class335.field5203 = ~class141.field1891 < -1;
                            class145.field1934 = var14.method1074(-635989152);
                            class183.field2481 = var14.method1074(-635989152);
                            class13.field260 = var14.method1074(-635989152);
                            field4411 = var14.method1099(27);
                            class160.field2087 = class312.field4572.method2998(field4411, -118);
                            class91.field1323 = var14.method1087(false);
                            class513.field7543 = var14.method1074(arg0 + -635989142);
                            class451.field6777 = var14.method1074(arg0 ^ 635989142);
                            class390.field5955 = var14.method1087(false) == 1;
                            class56.field800.field1393 = class56.field800.field1402 = var14.method1110((byte) 8);
                            class529.field7752 = new class195();
                            class529.field7752.field2602 = var14.method1074(arg0 ^ 635989142);
                            if (~class529.field7752.field2602 == -65536) {
                                class529.field7752.field2602 = -1;
                            }
                            class529.field7752.field2603 = var14.method1110((byte) 8);
                            if (class476.field7072 != class116.field1601) {
                                class529.field7752.field2611 = class529.field7752.field2602 + 50000;
                                class529.field7752.field2606 = 40000 - -class529.field7752.field2602;
                            }
                            if (class351.field5406 != class116.field1601 && (class139.field1851.method1317(arg0 ^ 18, class506.field7448) || class139.field1851.method1317(122, class501.field7397))) {
                                class139.field1851 = class529.field7752;
                            }
                        } else {
                            if (!class374.field5695.method1929((byte) -82, class99.field1446)) {
                                return;
                            }
                            class374.field5695.method1931(var14.field2219, class99.field1446, 32, 0);
                            var14.field2185 = 0;
                            class257.field3562 = var14.method1087(false);
                            class89.field1297 = var14.method1087(false);
                            class230.field3300 = var14.method1087(false) == 1;
                            class60.field865 = var14.method1087(false) == 1;
                            class457.field6855 = var14.method1087(false) == 1;
                            class195.field2613 = var14.method1087(false) == 1;
                            class350.field5400 = var14.method1074(-635989152);
                            class335.field5203 = ~var14.method1087(false) == -2;
                            class84.field1230 = var14.method1094(-3185);
                            class414.field6307 = var14.method1087(false) == 1;
                            if (~class445.field6688 == -4) {
                                boolean var15 = var14.method1087(false) == 1;
                                if (var15) {
                                    long var16 = var14.method1078((byte) 99);
                                    String var18 = class362.method2314((byte) 112, var16);
                                    int var19 = var14.method1087(false);
                                    byte[] var20 = new byte[var19];
                                    var14.method944(var19, var20, -112, 0);
                                    String var21 = class95.method632(var20, 25405);
                                    class368 var22 = null;
                                    try {
                                        class234 var23 = class312.field4572.method2975(false, 8, "3");
                                        while (var23.field3322 == 0) {
                                            class388.method2433(1L, 59);
                                        }
                                        if (var23.field3322 == 1) {
                                            var22 = (class368) var23.field3324;
                                            int var24 = 6 + 3 + var18.length() + var21.length();
                                            if (~var24 < -51) {
                                                throw new RuntimeException(">50");
                                            }
                                            class164 var25 = new class164(var24 + 1);
                                            var25.method1072((byte) 102, var24);
                                            var25.method1072((byte) 102, 0);
                                            var25.method1098(-128, var18);
                                            var25.method1098(arg0 + -113, var21);
                                            var25.method1055((byte) -126);
                                            var22.method2341(var25.field2185, 0, var25.field2219, 123);
                                        }
                                    } catch (Exception var34) {
                                    }
                                    try {
                                        if (var22 != null) {
                                            var22.method2344((byte) -93);
                                        }
                                    } catch (Exception var32) {
                                    }
                                }
                            }
                            class432.field6575.method1873(127, class414.field6307);
                            class103.field1489.method1595(class414.field6307, true);
                            class137.field1834.method1622(-30353, class414.field6307);
                        }
                        if ((!class230.field3300 || class457.field6855) && !class335.field5203) {
                            try {
                                class305.method1920(class312.field4572.field7381, "unzap", 21694);
                            } catch (Throwable var31) {
                            }
                        } else {
                            try {
                                class305.method1920(class312.field4572.field7381, "zap", arg0 ^ -21688);
                            } catch (Throwable var33) {
                                if (class322.field4669) {
                                    try {
                                        class312.field4572.field7381.getAppletContext().showDocument(new URL(class312.field4572.field7381.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var30) {
                                    }
                                }
                            }
                        }
                        if (class476.field7072 == class116.field1601) {
                            try {
                                class305.method1920(class312.field4572.field7381, "loggedin", 21694);
                            } catch (Throwable var29) {
                            }
                        }
                        if (class445.field6688 != 2 && class445.field6688 != 3) {
                            class380.field5793 = 0;
                            class79.method542(2, (byte) 68);
                            class180.method1205(-118);
                            class134.method908(6, 2);
                            class501.field7394 = null;
                            return;
                        }
                        class380.field5793 = 12;
                    }
                    if (class380.field5793 == 12) {
                        if (!class374.field5695.method1929((byte) -82, 3)) {
                            return;
                        }
                        class374.field5695.method1931(class409.field6214.field2219, 3, arg0 ^ -42, 0);
                        class380.field5793 = 13;
                    }
                    if (~class380.field5793 == -14) {
                        class141 var26 = class409.field6214;
                        var26.field2185 = 0;
                        if (var26.method942((byte) 67)) {
                            if (!class374.field5695.method1929((byte) -82, 1)) {
                                return;
                            }
                            class374.field5695.method1931(var26.field2219, 1, 32, 3);
                        }
                        class501.field7394 = class215.method1477(-1)[var26.method940(true)];
                        class497.field7326 = var26.method1074(arg0 ^ 635989142);
                        class380.field5793 = 11;
                    }
                    if (class380.field5793 == 11) {
                        if (class374.field5695.method1929((byte) -82, class497.field7326)) {
                            class374.field5695.method1931(class409.field6214.field2219, class497.field7326, 32, 0);
                            class409.field6214.field2185 = 0;
                            class380.field5793 = 0;
                            int var27 = class497.field7326;
                            class79.method542(2, (byte) 122);
                            class325.method2043(arg0 ^ -118);
                            class427.method2608(1937244360, class409.field6214);
                            class492.field7259 = -1;
                            class211.method1454(Integer.MAX_VALUE);
                            if (~class409.field6214.field2185 != ~var27) {
                                throw new RuntimeException("lswp pos:" + class409.field6214.field2185 + " psize:" + var27);
                            } else {
                                class501.field7394 = null;
                            }
                        }
                    } else if (~class380.field5793 == -16) {
                        if (~class497.field7326 == 1) {
                            if (!class374.field5695.method1929((byte) -82, 2)) {
                                return;
                            }
                            class374.field5695.method1931(class409.field6214.field2219, 2, arg0 ^ -42, 0);
                            class409.field6214.field2185 = 0;
                            class497.field7326 = class409.field6214.method1074(-635989152);
                        }
                        if (class374.field5695.method1929((byte) -82, class497.field7326)) {
                            class374.field5695.method1931(class409.field6214.field2219, class497.field7326, arg0 + 42, 0);
                            class409.field6214.field2185 = 0;
                            class380.field5793 = 0;
                            int var28 = class497.field7326;
                            class79.method542(15, (byte) 102);
                            class461.method2791((byte) 119);
                            class427.method2608(1937244360, class409.field6214);
                            if (~class409.field6214.field2185 != ~var28) {
                                throw new RuntimeException("lswpr pos:" + class409.field6214.field2185 + " psize:" + var28);
                            } else {
                                class501.field7394 = null;
                            }
                        }
                    }
                }
            } catch (IOException var35) {
                if (class374.field5695 != null) {
                    class374.field5695.method1934((byte) -46);
                    class374.field5695 = null;
                }
                if (class468.field7002 >= 1) {
                    class380.field5793 = 0;
                    class79.method542(-4, (byte) 123);
                    class533.method3152(93);
                } else {
                    class380.field5793 = 1;
                    ++class468.field7002;
                    class470.field7016 = 0;
                    if (class445.field6688 != 2 && class445.field6688 != 3) {
                        class355.field5495.field2608 = !class355.field5495.field2608;
                    } else {
                        class139.field1851.field2608 = !class139.field1851.field2608;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)Z", line = 673)
    public static final boolean method1909(int arg0) {
        ++field4419;
        class5 var1 = class131.field1769.field906.field36;
        if (var1 != null && class131.field1769.field906 != var1) {
            if (arg0 >= -55) {
                return false;
            } else {
                class54 var2 = (class54) var1;
                if (var2.field764 >= 2000) {
                    var2.field764 -= 2000;
                }
                return ~var2.field764 == -1007;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V", line = 699)
    public static void method1910(byte arg0) {
        field4420 = null;
        if (arg0 != -11) {
            method1909(62);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V", line = 709)
    public static final void method1911(String arg0, int arg1, int arg2, String arg3) {
        class445.field6688 = arg1;
        class67.field955 = arg2;
        ++field4410;
        class340.method2196(arg3, arg0, true);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(BI)[I", line = 719)
    public final int[] method270(byte arg0, int arg1) {
        ++field4418;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (arg0 >= -74) {
            return null;
        } else {
            if (super.field5478.field6213) {
                int var4 = class350.field5392[arg1];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; ~var6 > ~class531.field7814; ++var6) {
                    int var7 = class195.field2616[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field4416 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field4414 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field4414;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field4413 == 0) {
                        var12 = class369.field5635[255 & var12 >> 4] + 4096 >> 1;
                    } else if (this.field4413 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V", line = 788)
    public class301() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "(I)Z", line = 792)
    public static final boolean method1912(int arg0) {
        if (arg0 != 2) {
            field4420 = null;
        }
        ++field4415;
        return ~class367.field5621 < -1;
    }

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "(I)V", line = 808)
    public final void method357(int arg0) {
        if (arg0 < 28) {
            this.method270((byte) 52, -23);
        }
        ++field4412;
        class410.method2530(1);
    }
}
