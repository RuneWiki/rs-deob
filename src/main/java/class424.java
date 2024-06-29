import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class424 extends class148 {

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public int field6222 = -1;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "Luu;")
    public static class428 field6231 = new class428(5000);

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Lao;")
    public static class303 field6225;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Ljava/lang/String;")
    public String field6223;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "Ljava/lang/String;")
    public String field6230;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[[[J")
    public static long[][][] field6221;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)Lle;", line = 4)
    public final class330 method2638(int arg0) {
        ++field6220;
        return arg0 > -73 ? null : class147.field2187[super.field2202];
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V", line = 18)
    public static final void method2639(int arg0) {
        if (arg0 == -51) {
            ++field6228;
            if (class114.field1750 != 0 && ~class114.field1750 != -7) {
                try {
                    if (++class307.field4697 > 2000) {
                        if (class541.field7922 != null) {
                            class541.field7922.method2155(false);
                            class541.field7922 = null;
                        }
                        if (~class308.field4708 <= -2) {
                            class114.field1750 = 0;
                            class133.method969(-5, (byte) 123);
                            return;
                        }
                        if (class23.field262 != 2 && ~class23.field262 != -4) {
                            class271.field4286.field5146 = !class271.field4286.field5146;
                        } else {
                            class317.field4836.field5146 = !class317.field4836.field5146;
                        }
                        ++class308.field4708;
                        class307.field4697 = 0;
                        class114.field1750 = 1;
                    }
                    if (class114.field1750 == 1) {
                        if (~class23.field262 != -3 && ~class23.field262 != -4) {
                            class53.field819 = class122.field1844.method460(class271.field4286.method2221(arg0 + 1615737814), 10503, class271.field4286.field5144);
                        } else {
                            class53.field819 = class122.field1844.method460(class317.field4836.method2221(1615737763), 10503, class317.field4836.field5144);
                        }
                        class114.field1750 = 2;
                    }
                    if (class114.field1750 == 2) {
                        if (~class53.field819.field4974 == -3) {
                            throw new IOException();
                        }
                        if (~class53.field819.field4974 != -2) {
                            return;
                        }
                        class541.field7922 = class202.method1424(5000, (Socket) class53.field819.field4975, arg0 ^ 50);
                        class53.field819 = null;
                        long var1 = class528.field7726 = class279.method1891(126, class490.field7159);
                        int var3 = (int) (31L & var1 >> 16);
                        class312.field4752.field2982 = 0;
                        class312.field4752.method1381(class491.field7184.field7746, (byte) 114);
                        class312.field4752.method1381(var3, (byte) 100);
                        class541.field7922.method2159(-15728, 2, 0, class312.field4752.field2973);
                        class114.field1750 = 3;
                    }
                    if (~class114.field1750 == -4) {
                        if (!class541.field7922.method2158(1, -127)) {
                            return;
                        }
                        class541.field7922.method2152(0, field6231.field2973, arg0 + -22, 1);
                        int var4 = 255 & field6231.field2973[0];
                        if (~var4 != -1) {
                            class114.field1750 = 0;
                            class133.method969(var4, (byte) 123);
                            class541.field7922.method2155(false);
                            class541.field7922 = null;
                            class505.method3009(121);
                            return;
                        }
                        class114.field1750 = 4;
                    }
                    if (class114.field1750 == 4) {
                        if (!class541.field7922.method2158(8, arg0 + -71)) {
                            return;
                        }
                        class541.field7922.method2152(0, field6231.field2973, arg0 + -75, 8);
                        field6231.field2982 = 0;
                        class221.field3357 = field6231.method1351(true);
                        class194 var5 = new class194(70);
                        int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class221.field3357 >> 32), (int) class221.field3357 };
                        var5.method1381(10, (byte) 97);
                        var5.method1348((byte) -65, var6[0]);
                        var5.method1348((byte) -65, var6[1]);
                        var5.method1348((byte) -65, var6[2]);
                        var5.method1348((byte) -65, var6[3]);
                        var5.method1385(class279.method1891(arg0 ^ -68, class490.field7159), (byte) -125);
                        var5.method1343(class240.field3598, (byte) -14);
                        var5.method1387(class337.field5070, class376.field5544, 65);
                        class428 var7 = class312.field4752;
                        var7.field2982 = 0;
                        if (~class23.field262 != -3 && ~class23.field262 != -4) {
                            var7.method1381(class491.field7191.field7746, (byte) 105);
                            var7.method1364(0, true);
                            int var8 = var7.field2982;
                            var7.method1348((byte) -65, 602);
                            var7.method1381(class401.field5923.field4704, (byte) 112);
                            var7.method1381(class345.field5141, (byte) 126);
                            class369.method2344(var7, (byte) -107);
                            var7.method1343(class229.field3461, (byte) -14);
                            var7.method1348((byte) -65, class516.field7505);
                            class195.method1404(arg0 ^ -51);
                            var7.method1355(var5.field2982, (byte) 76, 0, var5.field2973);
                            var7.method1382(-var8 + var7.field2982, 2);
                        } else {
                            if (class460.field6813 == 12) {
                                var7.method1381(class491.field7190.field7746, (byte) 83);
                            } else {
                                var7.method1381(class491.field7188.field7746, (byte) 91);
                            }
                            var7.method1364(0, true);
                            int var9 = var7.field2982;
                            var7.method1348((byte) -65, 602);
                            var7.method1381(class125.field1877, (byte) 111);
                            var7.method1381(class159.method1145((byte) 121), (byte) 116);
                            var7.method1364(class169.field2570, true);
                            var7.method1364(class360.field5313, true);
                            var7.method1381(class40.field667.field4212, (byte) 89);
                            class369.method2344(var7, (byte) -121);
                            var7.method1343(class229.field3461, (byte) -14);
                            var7.method1348((byte) -65, class516.field7505);
                            class194 var10 = class40.field667.method423(0);
                            var7.method1381(var10.field2982, (byte) 110);
                            var7.method1355(var10.field2982, (byte) 76, 0, var10.field2973);
                            class129.field1923 = true;
                            var7.method1364(class360.field5314, true);
                            var7.method1364(class422.field6196, true);
                            class195.method1404(arg0 ^ -51);
                            var7.method1355(var5.field2982, (byte) 76, 0, var5.field2973);
                            var7.method1382(-var9 + var7.field2982, arg0 + 53);
                        }
                        class541.field7922.method2159(-15728, var7.field2982, 0, var7.field2973);
                        var7.method2674(-851256347, var6);
                        for (int var11 = 0; ~var11 > -5; ++var11) {
                            var6[var11] += 50;
                        }
                        field6231.method2674(arg0 ^ 851256360, var6);
                        class114.field1750 = 5;
                    }
                    if (~class114.field1750 == -6) {
                        if (!class541.field7922.method2158(1, -127)) {
                            return;
                        }
                        class541.field7922.method2152(0, field6231.field2973, -49, 1);
                        int var12 = field6231.field2973[0] & 255;
                        if (var12 == 21) {
                            class114.field1750 = 8;
                        } else if (var12 == 29) {
                            class114.field1750 = 14;
                        } else {
                            if (var12 == 1) {
                                class114.field1750 = 6;
                                class133.method969(var12, (byte) 123);
                                return;
                            }
                            if (var12 == 2) {
                                class114.field1750 = 9;
                            } else {
                                if (~var12 != -16) {
                                    if (~var12 == -24 && ~class308.field4708 > -2) {
                                        ++class308.field4708;
                                        class307.field4697 = 0;
                                        class114.field1750 = 1;
                                        class541.field7922.method2155(false);
                                        class541.field7922 = null;
                                        return;
                                    }
                                    class114.field1750 = 0;
                                    class133.method969(var12, (byte) 123);
                                    class541.field7922.method2155(false);
                                    class541.field7922 = null;
                                    class505.method3009(-118);
                                    return;
                                }
                                class429.field6369 = -2;
                                class114.field1750 = 15;
                            }
                        }
                    }
                    if (class114.field1750 == 7) {
                        class312.field4752.field2982 = 0;
                        class312.field4752.method2675(class491.field7189.field7746, arg0 ^ 49);
                        class541.field7922.method2159(arg0 + -15677, class312.field4752.field2982, 0, class312.field4752.field2973);
                        class114.field1750 = 5;
                    } else if (class114.field1750 == 8) {
                        if (class541.field7922.method2158(1, arg0 + -76)) {
                            class541.field7922.method2152(0, field6231.field2973, -59, 1);
                            int var13 = 255 & field6231.field2973[0];
                            class114.field1750 = 0;
                            class196.field3067 = (var13 + 3) * 60;
                            class133.method969(21, (byte) 123);
                            class541.field7922.method2155(false);
                            class541.field7922 = null;
                            class505.method3009(arg0 + -73);
                        }
                    } else if (class114.field1750 == 14) {
                        if (class541.field7922.method2158(1, -122)) {
                            class541.field7922.method2152(0, field6231.field2973, -119, 1);
                            class51.field784 = field6231.field2973[0] & 255;
                            class114.field1750 = 0;
                            class133.method969(29, (byte) 123);
                            class541.field7922.method2155(false);
                            class541.field7922 = null;
                            class505.method3009(-128);
                        }
                    } else if (~class114.field1750 == -10) {
                        if (class541.field7922.method2158(1, -128)) {
                            class541.field7922.method2152(0, field6231.field2973, -48, 1);
                            class510.field7415 = field6231.field2973[0] & 255;
                            class114.field1750 = 10;
                        }
                    } else {
                        if (~class114.field1750 == -11) {
                            class428 var14 = field6231;
                            if (~class23.field262 != -4) {
                                class38.field633 = false;
                            } else {
                                class38.field633 = true;
                            }
                            if (~class23.field262 != -3 && class23.field262 != 3) {
                                if (!class541.field7922.method2158(class510.field7415, -123)) {
                                    return;
                                }
                                class541.field7922.method2152(0, var14.field2973, -102, class510.field7415);
                                var14.field2982 = 0;
                                class224.field3421 = var14.method1337((byte) 13);
                                class159.field2416 = var14.method1337((byte) 37);
                                class288.field4478 = var14.method1337((byte) -116) == 1;
                                class421.field6182 = var14.method1337((byte) 49) == 1;
                                class238.field3579 = ~var14.method1337((byte) -112) == -2;
                                class281.field4378 = var14.method1396(28);
                                class445.field6619 = ~class281.field4378 < -1;
                                class379.field5588 = var14.method1396(-100);
                                class322.field4894 = var14.method1396(-104);
                                class480.field7037 = var14.method1396(123);
                                class47.field754 = var14.method1401(122);
                                class398.field5888 = class122.field1844.method444(class47.field754, (byte) -128);
                                class305.field4681 = var14.method1337((byte) 46);
                                class537.field7885 = var14.method1396(27);
                                class218.field3287 = var14.method1396(119);
                                class159.field2411 = ~var14.method1337((byte) 45) == -2;
                                class116.field1781.field7437 = class116.field1781.field7451 = var14.method1399((byte) 97);
                                class150.field2245 = new class346();
                                class150.field2245.field5143 = var14.method1396(40);
                                if (~class150.field2245.field5143 == -65536) {
                                    class150.field2245.field5143 = -1;
                                }
                                class150.field2245.field5144 = var14.method1399((byte) 106);
                                if (class62.field991 != class287.field4471) {
                                    class150.field2245.field5150 = class150.field2245.field5143 + 40000;
                                    class150.field2245.field5145 = class150.field2245.field5143 + 50000;
                                }
                                if (class301.field4613 != class287.field4471 && (class317.field4836.method2222(class35.field443, (byte) 127) || class317.field4836.method2222(class314.field4781, (byte) 123))) {
                                    class317.field4836 = class150.field2245;
                                }
                            } else {
                                if (!class541.field7922.method2158(class510.field7415, arg0 ^ 72)) {
                                    return;
                                }
                                class541.field7922.method2152(0, var14.field2973, -73, class510.field7415);
                                var14.field2982 = 0;
                                class224.field3421 = var14.method1337((byte) 100);
                                class159.field2416 = var14.method1337((byte) -114);
                                class288.field4478 = ~var14.method1337((byte) -120) == -2;
                                class421.field6182 = ~var14.method1337((byte) 100) == -2;
                                class238.field3579 = var14.method1337((byte) 88) == 1;
                                class108.field1638 = var14.method1337((byte) -118) == 1;
                                class517.field7513 = var14.method1396(-117);
                                class445.field6619 = var14.method1337((byte) -107) == 1;
                                class153.field2353 = var14.method1356(126);
                                class324.field4918 = var14.method1337((byte) -108) == 1;
                                if (~class23.field262 == -4) {
                                    boolean var15 = var14.method1337((byte) -120) == 1;
                                    if (var15) {
                                        long var16 = var14.method1351(true);
                                        String var18 = class144.method1029(var16, -17639);
                                        int var19 = var14.method1337((byte) 44);
                                        byte[] var20 = new byte[var19];
                                        var14.method2665(var20, 0, 0, var19);
                                        String var21 = class142.method1024(var20, 5037);
                                        class95 var22 = null;
                                        try {
                                            class329 var23 = class122.field1844.method472("3", false, (byte) 12);
                                            while (var23.field4974 == 0) {
                                                class468.method2848(1L, (byte) -105);
                                            }
                                            if (~var23.field4974 == -2) {
                                                var22 = (class95) var23.field4975;
                                                int var24 = 2 + 3 + var18.length() - (-var21.length() - 4);
                                                if (~var24 < -51) {
                                                    throw new RuntimeException(">50");
                                                }
                                                class194 var25 = new class194(var24 + 1);
                                                var25.method1381(var24, (byte) 84);
                                                var25.method1381(0, (byte) 109);
                                                var25.method1375(var18, (byte) 116);
                                                var25.method1375(var21, (byte) -45);
                                                var25.method1373((byte) 85);
                                                var22.method805(var25.field2973, true, 0, var25.field2982);
                                            }
                                        } catch (Exception var34) {
                                        }
                                        try {
                                            if (var22 != null) {
                                                var22.method800(false);
                                            }
                                        } catch (Exception var32) {
                                        }
                                    }
                                }
                                class247.field3693.method2275(class324.field4918, 2);
                                class300.field4608.method2081(class324.field4918, 32);
                                class462.field6842.method1231(class324.field4918, 14);
                            }
                            if ((!class288.field4478 || class238.field3579) && !class445.field6619) {
                                try {
                                    class220.method1510(arg0 ^ -92, "unzap", class122.field1844.field1062);
                                } catch (Throwable var31) {
                                }
                            } else {
                                try {
                                    class220.method1510(122, "zap", class122.field1844.field1062);
                                } catch (Throwable var33) {
                                    if (class187.field2867) {
                                        try {
                                            class122.field1844.field1062.getAppletContext().showDocument(new URL(class122.field1844.field1062.getCodeBase(), "blank.ws"), "tbi");
                                        } catch (Exception var30) {
                                        }
                                    }
                                }
                            }
                            if (class62.field991 == class287.field4471) {
                                try {
                                    class220.method1510(120, "loggedin", class122.field1844.field1062);
                                } catch (Throwable var29) {
                                }
                            }
                            if (class23.field262 != 2 && class23.field262 != 3) {
                                class114.field1750 = 0;
                                class133.method969(2, (byte) 123);
                                class441.method2723(true);
                                class376.method2400(6, (byte) 107);
                                class136.field2073 = null;
                                return;
                            }
                            class114.field1750 = 12;
                        }
                        if (~class114.field1750 == -13) {
                            if (!class541.field7922.method2158(3, -121)) {
                                return;
                            }
                            class541.field7922.method2152(0, field6231.field2973, arg0 ^ 101, 3);
                            class114.field1750 = 13;
                        }
                        if (class114.field1750 == 13) {
                            class428 var26 = field6231;
                            var26.field2982 = 0;
                            if (var26.method2676(arg0 ^ -73)) {
                                if (!class541.field7922.method2158(1, -122)) {
                                    return;
                                }
                                class541.field7922.method2152(3, var26.field2973, -67, 1);
                            }
                            class136.field2073 = class456.method2795((byte) -90)[var26.method2672(-687978552)];
                            class429.field6369 = var26.method1396(52);
                            class114.field1750 = 11;
                        }
                        if (~class114.field1750 == -12) {
                            if (class541.field7922.method2158(class429.field6369, -127)) {
                                class541.field7922.method2152(0, field6231.field2973, -111, class429.field6369);
                                field6231.field2982 = 0;
                                class114.field1750 = 0;
                                int var27 = class429.field6369;
                                class133.method969(2, (byte) 123);
                                class338.method2191(8730);
                                class474.method2873(field6231, false);
                                class50.field769 = -1;
                                class524.method3120(0);
                                if (field6231.field2982 != var27) {
                                    throw new RuntimeException("lswp pos:" + field6231.field2982 + " psize:" + var27);
                                } else {
                                    class136.field2073 = null;
                                }
                            }
                        } else if (class114.field1750 == 15) {
                            if (~class429.field6369 == 1) {
                                if (!class541.field7922.method2158(2, -124)) {
                                    return;
                                }
                                class541.field7922.method2152(0, field6231.field2973, -70, 2);
                                field6231.field2982 = 0;
                                class429.field6369 = field6231.method1396(arg0 + -63);
                            }
                            if (class541.field7922.method2158(class429.field6369, -128)) {
                                class541.field7922.method2152(0, field6231.field2973, -58, class429.field6369);
                                field6231.field2982 = 0;
                                class114.field1750 = 0;
                                int var28 = class429.field6369;
                                class133.method969(15, (byte) 123);
                                class412.method2587(arg0 ^ -51);
                                class474.method2873(field6231, false);
                                if (~field6231.field2982 != ~var28) {
                                    throw new RuntimeException("lswpr pos:" + field6231.field2982 + " psize:" + var28);
                                } else {
                                    class136.field2073 = null;
                                }
                            }
                        }
                    }
                } catch (IOException var35) {
                    if (class541.field7922 != null) {
                        class541.field7922.method2155(false);
                        class541.field7922 = null;
                    }
                    if (class308.field4708 >= 1) {
                        class114.field1750 = 0;
                        class133.method969(-4, (byte) 123);
                        class505.method3009(-117);
                    } else {
                        class307.field4697 = 0;
                        if (~class23.field262 != -3 && class23.field262 != 3) {
                            class271.field4286.field5146 = !class271.field4286.field5146;
                        } else {
                            class317.field4836.field5146 = !class317.field4836.field5146;
                        }
                        ++class308.field4708;
                        class114.field1750 = 1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)I", line = 634)
    public static final int method2640(int arg0, int arg1) {
        if (arg1 != 1023) {
            return 23;
        } else {
            ++field6224;
            return 1023 & arg0;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)Z", line = 649)
    public static final boolean method2641(int arg0, int arg1, int arg2, int arg3) {
        if (!class155.method1129(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class295.field4543;
            int var5 = arg2 << class295.field4543;
            return class288.method1935(var4 + 1, class407.field6024[arg0].method56(arg1, arg2) + arg3, var5 + 1) && class288.method1935(class90.field1454 + var4 - 1, class407.field6024[arg0].method56(arg1 + 1, arg2) + arg3, var5 + 1) && class288.method1935(class90.field1454 + var4 - 1, class407.field6024[arg0].method56(arg1 + 1, arg2 + 1) + arg3, class90.field1454 + var5 - 1) && class288.method1935(var4 + 1, class407.field6024[arg0].method56(arg1, arg2 + 1) + arg3, class90.field1454 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V", line = 674)
    public static void method2642(int arg0) {
        field6231 = null;
        if (arg0 == -27422) {
            field6225 = null;
            field6221 = null;
        }
    }
}
