import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class68 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "[I")
    public static int[] field1061 = new int[14];

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Lve;")
    public static class266 field1062;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public static int[] field1063;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 8)
    public static final void method501(byte arg0) {
        field1060++;
        if (class230.field3647 == 0 || class230.field3647 == 5) {
            return;
        }
        try {
            if ((++class121.field1884) > 2000) {
                if (class88.field1449 != null) {
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                }
                if (class10.field140 >= 1) {
                    class170.field2658 = -5;
                    class230.field3647 = 0;
                    return;
                }
                class121.field1884 = 0;
                if (class319.field5446 == class104.field1661) {
                    class319.field5446 = class279.field4656;
                } else {
                    class319.field5446 = class104.field1661;
                }
                class230.field3647 = 1;
                class10.field140++;
            }
            if (class230.field3647 == 1) {
                class224.field3544 = class45.field712.method1056((byte) 8, class11.field149, class319.field5446);
                class230.field3647 = 2;
            }
            if (class230.field3647 == 2) {
                if (class224.field3544.field2811 == 2) {
                    throw new IOException();
                }
                if (class224.field3544.field2811 != 1) {
                    return;
                }
                class88.field1449 = new class285((Socket) class224.field3544.field2812, class45.field712);
                class224.field3544 = null;
                long var1 = class20.field283 = class2.field22.method209(-106);
                class114.field1789.field1301 = 0;
                class114.field1789.method591((byte) -40, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class114.field1789.method591((byte) -39, var3);
                class88.field1449.method2014(false, 0, class114.field1789.field1280, 2);
                if (class166.field2580 != null) {
                    class166.field2580.method393(106);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(arg0 + 88);
                }
                int var4 = class88.field1449.method2012(arg0 ^ 0xFFFFFFF7);
                if (class166.field2580 != null) {
                    class166.field2580.method393(68);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(109);
                }
                if (var4 != 0) {
                    class170.field2658 = var4;
                    class230.field3647 = 0;
                    class88.field1449.method2018(arg0 + 14830);
                    class88.field1449 = null;
                    return;
                }
                class230.field3647 = 3;
            }
            if (class230.field3647 == 3) {
                if (class88.field1449.method2015(-18358) < 8) {
                    return;
                }
                class88.field1449.method2011(0, 8, -18455, class300.field5157.field1280);
                class300.field5157.field1301 = 0;
                class309.field5310 = class300.field5157.method595(-88);
                int[] var5 = new int[4];
                class114.field1789.field1301 = 0;
                var5[2] = (int) (class309.field5310 >> 32);
                var5[3] = (int) class309.field5310;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class114.field1789.method591((byte) -30, 10);
                class114.field1789.method577(-120, var5[0]);
                class114.field1789.method577(-125, var5[1]);
                class114.field1789.method577(-127, var5[2]);
                class114.field1789.method577(arg0 - 111, var5[3]);
                class114.field1789.method579(class2.field22.method209(arg0 - 116), arg0 - 2037491431);
                class114.field1789.method584(0, class2.field19);
                class114.field1789.method639(class292.field4859, class144.field2190, -296);
                class203.field3147.field1301 = 0;
                if (class207.field3217 == 40) {
                    class203.field3147.method591((byte) -81, 18);
                } else {
                    class203.field3147.method591((byte) -100, 16);
                }
                class203.field3147.method643(-20037, class114.field1789.field1301 + class315.method2187((byte) 111, class211.field3273) + 159);
                class203.field3147.method577(arg0 ^ 0x71, 530);
                class203.field3147.method591((byte) -114, class178.field2792);
                class203.field3147.method591((byte) -122, class280.field4670 ? 1 : 0);
                class203.field3147.method591((byte) -103, 1);
                class203.field3147.method591((byte) -88, class243.method1677(0));
                class203.field3147.method643(-20037, class38.field622);
                class203.field3147.method643(-20037, class141.field2153);
                class203.field3147.method591((byte) -39, class2.field17);
                class138.method921(class203.field3147, true);
                class203.field3147.method584(0, class211.field3273);
                class203.field3147.method577(arg0 ^ 0x76, class301.field5184);
                class203.field3147.method577(-121, class124.method851(-2));
                class272.field4543 = true;
                class203.field3147.method643(-20037, class101.field1615);
                class203.field3147.method577(-122, class276.field4620.method1874((byte) -126));
                class203.field3147.method577(arg0 ^ 0x73, class280.field4661.method1874((byte) -125));
                class203.field3147.method577(-123, class58.field941.method1874((byte) -128));
                class203.field3147.method577(-123, class109.field1710.method1874((byte) -128));
                class203.field3147.method577(-123, class189.field2969.method1874((byte) -125));
                class203.field3147.method577(-125, class98.field1597.method1874((byte) -123));
                class203.field3147.method577(-122, class36.field593.method1874((byte) -126));
                class203.field3147.method577(-121, class80.field1258.method1874((byte) -125));
                class203.field3147.method577(arg0 ^ 0x7F, class319.field5464.method1874((byte) -125));
                class203.field3147.method577(arg0 ^ 0x75, class112.field1769.method1874((byte) -127));
                class203.field3147.method577(-123, class230.field3646.method1874((byte) -127));
                class203.field3147.method577(-124, class96.field1568.method1874((byte) -118));
                class203.field3147.method577(-126, class327.field5656.method1874((byte) -122));
                class203.field3147.method577(arg0 ^ 0x73, class266.field4374.method1874((byte) -118));
                class203.field3147.method577(-122, class131.field1990.method1874((byte) -124));
                class203.field3147.method577(-121, class324.field5588.method1874((byte) -122));
                class203.field3147.method577(-124, class89.field1476.method1874((byte) -123));
                class203.field3147.method577(arg0 - 117, class324.field5587.method1874((byte) -124));
                class203.field3147.method577(-128, class225.field3575.method1874((byte) -122));
                class203.field3147.method577(-124, class24.field347.method1874((byte) -127));
                class203.field3147.method577(-120, class264.field4325.method1874((byte) -123));
                class203.field3147.method577(-120, class267.field4420.method1874((byte) -117));
                class203.field3147.method577(arg0 ^ 0x7F, class47.field769.method1874((byte) -117));
                class203.field3147.method577(-125, class37.field610.method1874((byte) -122));
                class203.field3147.method577(-127, class141.field2161.method1874((byte) -118));
                class203.field3147.method577(-126, class69.field1076.method1874((byte) -128));
                class203.field3147.method577(-120, class314.field5378.method1874((byte) -123));
                class203.field3147.method577(-120, class108.field1693.method1874((byte) -124));
                class203.field3147.method592(class114.field1789.field1280, 0, class114.field1789.field1301, arg0 + 117);
                class88.field1449.method2014(false, 0, class203.field3147.field1280, class203.field3147.field1301);
                class114.field1789.method1429(var5, false);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class300.field5157.method1429(var5, false);
                class230.field3647 = 4;
            }
            if (class230.field3647 == 4) {
                if (class88.field1449.method2015(-18358) < 1) {
                    return;
                }
                int var7 = class88.field1449.method2012(0);
                if (var7 == 21) {
                    class230.field3647 = 7;
                } else if (var7 == 29) {
                    class230.field3647 = 10;
                } else if (var7 == 1) {
                    class230.field3647 = 5;
                    class170.field2658 = var7;
                    return;
                } else if (var7 == 2) {
                    class230.field3647 = 8;
                } else if (var7 == 15) {
                    class230.field3647 = 0;
                    class170.field2658 = var7;
                    return;
                } else if (var7 == 23 && class10.field140 < 1) {
                    class230.field3647 = 1;
                    class10.field140++;
                    class121.field1884 = 0;
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                    return;
                } else {
                    class170.field2658 = var7;
                    class230.field3647 = 0;
                    class88.field1449.method2018(arg0 + 14830);
                    class88.field1449 = null;
                    return;
                }
            }
            if (class230.field3647 == 6) {
                class114.field1789.field1301 = 0;
                class114.field1789.method1431(0, 17);
                class88.field1449.method2014(false, 0, class114.field1789.field1280, class114.field1789.field1301);
                class230.field3647 = 4;
                return;
            }
            if (class230.field3647 == 7) {
                if (class88.field1449.method2015(arg0 - 18349) >= 1) {
                    class126.field1953 = (class88.field1449.method2012(arg0 + 9) + 3) * 60;
                    class230.field3647 = 0;
                    class170.field2658 = 21;
                    class88.field1449.method2018(arg0 + 14830);
                    class88.field1449 = null;
                    return;
                }
                return;
            }
            if (class230.field3647 == 10) {
                if (class88.field1449.method2015(arg0 - 18349) >= 1) {
                    class301.field5193 = class88.field1449.method2012(arg0 ^ 0xFFFFFFF7);
                    class230.field3647 = 0;
                    class170.field2658 = 29;
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                    return;
                }
                return;
            }
            if (class230.field3647 == 8) {
                if (class88.field1449.method2015(-18358) < 14) {
                    return;
                }
                class88.field1449.method2011(0, 14, -18455, class300.field5157.field1280);
                class300.field5157.field1301 = 0;
                class201.field3119 = class300.field5157.method642((byte) -34);
                class280.field4666 = class300.field5157.method642((byte) -86);
                class88.field1454 = class300.field5157.method642((byte) -67) == 1;
                class17.field242 = class300.field5157.method642((byte) -25) == 1;
                class304.field5246 = class300.field5157.method642((byte) -39) == 1;
                class292.field4863 = class300.field5157.method642((byte) -28) == 1;
                class71.field1089 = class300.field5157.method642((byte) -120) == 1;
                class327.field5668 = class300.field5157.method576(arg0 + 10);
                class240.field3880 = class300.field5157.method642((byte) -127) == 1;
                class9.field113 = class300.field5157.method642((byte) -112) == 1;
                class101.method740((byte) -124, class9.field113);
                class321.method2238(class9.field113, 255);
                if (!class280.field4670) {
                    if ((!class88.field1454 || class304.field5246) && !class240.field3880) {
                        try {
                            class322.field5534.method208(-1857, class45.field712.field2431);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class314.field5376.method208(-1857, class45.field712.field2431);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class26.field384 = class300.field5157.method1432(0);
                class259.field4228 = class300.field5157.method576(1);
                class230.field3647 = 9;
            }
            if (class230.field3647 == 9) {
                if (class88.field1449.method2015(-18358) < class259.field4228) {
                    return;
                }
                class300.field5157.field1301 = 0;
                class88.field1449.method2011(0, class259.field4228, -18455, class300.field5157.field1280);
                class170.field2658 = 2;
                class230.field3647 = 0;
                class249.method1715(true);
                class8.field99 = -1;
                class160.method1086(0, false);
                class26.field384 = -1;
                return;
            }
            if (arg0 != -9) {
                field1062 = (class266) null;
            }
        } catch (IOException var13) {
            if (class88.field1449 != null) {
                class88.field1449.method2018(14821);
                class88.field1449 = null;
            }
            if (class10.field140 >= 1) {
                class230.field3647 = 0;
                class170.field2658 = -4;
            } else {
                class230.field3647 = 1;
                class121.field1884 = 0;
                class10.field140++;
                if (class319.field5446 == class104.field1661) {
                    class319.field5446 = class279.field4656;
                } else {
                    class319.field5446 = class104.field1661;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 392)
    public static final int method502(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 407)
    public static void method503(int arg0) {
        field1062 = null;
        field1061 = null;
        if (arg0 >= -49) {
            method501((byte) 102);
        }
        field1063 = null;
    }
}
