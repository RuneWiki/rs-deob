import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class278 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
    public static int[] field4230 = new int[1000];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ls;")
    public static class196 field4227;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lph;")
    public static class361 field4229;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method2030(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 1010) {
            class313.method2187(arg3, arg2, 10, false);
        } else if (arg0 == 1011) {
            class313.method2187(arg3, arg2, 11, false);
        } else if (arg0 == 1005) {
            class313.method2187(arg3, arg2, 12, false);
        } else if (arg0 == 1009) {
            class313.method2187(arg3, arg2, 13, false);
        } else if (arg0 == 1012) {
            class313.method2187(arg3, arg2, 14, false);
        }
        field4231++;
        int var4 = 16 % ((22 - arg1) / 58);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 34)
    public static void method2031(int arg0) {
        field4229 = null;
        if (arg0 != 1) {
            field4230 = (int[]) null;
        }
        field4227 = null;
        field4230 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 59)
    public static final void method2032(int arg0, int arg1) {
        class104.field1491.method464(3398, arg0);
        field4232++;
        if (arg1 > -22) {
            field4229 = (class361) null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 70)
    public static final void method2033(int arg0) {
        field4228++;
        if (class289.field4378 == 0 || class289.field4378 == 5) {
            return;
        }
        try {
            if (++class318.field4792 > 2000) {
                if (class67.field973 != null) {
                    class67.field973.method1555(false);
                    class67.field973 = null;
                }
                if (class229.field3467 >= 1) {
                    class158.field2278 = -5;
                    class289.field4378 = 0;
                    return;
                }
                if (class75.field1096 == class62.field913) {
                    class62.field913 = class240.field3574;
                } else {
                    class62.field913 = class75.field1096;
                }
                class289.field4378 = 1;
                class318.field4792 = 0;
                class229.field3467++;
            }
            if (class289.field4378 == 1) {
                class22.field340 = class54.field787.method486(class62.field913, (byte) 85, class112.field1624);
                class289.field4378 = 2;
            }
            if (class289.field4378 == 2) {
                if (class22.field340.field3056 == 2) {
                    throw new IOException();
                }
                if (class22.field340.field3056 != 1) {
                    return;
                }
                class67.field973 = new class215((Socket) class22.field340.field3058, class54.field787);
                class22.field340 = null;
                long var1 = class260.field3881 = class248.method1827(false, class32.field458);
                class107.field1533.field2776 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class107.field1533.method1355((byte) -110, 14);
                class107.field1533.method1355((byte) -110, var3);
                class67.field973.method1558(5000, class107.field1533.field2718, 0, 2);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -112);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -86);
                }
                int var4 = class67.field973.method1553(0);
                if (class119.field1675 != null) {
                    class119.field1675.method535((byte) -110);
                }
                if (class28.field396 != null) {
                    class28.field396.method535((byte) -115);
                }
                if (var4 != 0) {
                    class158.field2278 = var4;
                    class289.field4378 = 0;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                }
                class289.field4378 = 3;
            }
            if (class289.field4378 == 3) {
                if (class67.field973.method1554(-2) < 8) {
                    return;
                }
                class67.field973.method1552(class83.field1194.field2718, 0, 8, (byte) 33);
                class83.field1194.field2776 = 0;
                int[] var5 = new int[4];
                class164.field2339 = class83.field1194.method1311(24263);
                class107.field1533.field2776 = 0;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class164.field2339;
                var5[2] = (int) (class164.field2339 >> 32);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class107.field1533.method1355((byte) -125, 10);
                class107.field1533.method1354(var5[0], (byte) -125);
                class107.field1533.method1354(var5[1], (byte) -77);
                class107.field1533.method1354(var5[2], (byte) 127);
                class107.field1533.method1354(var5[3], (byte) 109);
                class107.field1533.method1327(class248.method1827(false, class32.field458), (byte) 7);
                class107.field1533.method1343(class190.field2766, 0);
                class107.field1533.method1324(-104, class167.field2388, class343.field5308);
                class128.field1861.field2776 = 0;
                if (class194.field2819 == 40) {
                    class128.field1861.method1355((byte) -127, 18);
                } else {
                    class128.field1861.method1355((byte) -117, 16);
                }
                class128.field1861.method1361(class107.field1533.field2776 + class225.method1646(-81, class294.field4432) + 163, (byte) 127);
                class128.field1861.method1354(552, (byte) 123);
                class128.field1861.method1355((byte) -116, class20.field311);
                class128.field1861.method1355((byte) -116, class356.field5459 ? 1 : 0);
                class128.field1861.method1355((byte) -122, 1);
                class128.field1861.method1355((byte) -119, class89.method706(-12311));
                class128.field1861.method1361(class286.field4312, (byte) 124);
                class128.field1861.method1361(class19.field301, (byte) 124);
                class128.field1861.method1355((byte) -108, class304.field4559);
                class94.method733(class128.field1861, arg0 + 34);
                class128.field1861.method1343(class294.field4432, arg0 ^ 0xFFFFFFFE);
                class128.field1861.method1354(class177.field2543, (byte) 103);
                class128.field1861.method1354(class62.method506(1), (byte) -8);
                class56.field821 = true;
                class128.field1861.method1361(class30.field425, (byte) 127);
                class128.field1861.method1354(class197.field2854.method2540((byte) -94), (byte) -113);
                class128.field1861.method1354(class285.field4301.method2540((byte) -94), (byte) -48);
                class128.field1861.method1354(class108.field1567.method2540((byte) -94), (byte) -61);
                class128.field1861.method1354(class132.field1935.method2540((byte) -94), (byte) -5);
                class128.field1861.method1354(class253.field3785.method2540((byte) -94), (byte) 125);
                class128.field1861.method1354(class244.field3640.method2540((byte) -94), (byte) -106);
                class128.field1861.method1354(class332.field5085.method2540((byte) -94), (byte) -113);
                class128.field1861.method1354(class307.field4597.method2540((byte) -94), (byte) 115);
                class128.field1861.method1354(class216.field3184.method2540((byte) -94), (byte) 114);
                class128.field1861.method1354(class326.field4900.method2540((byte) -94), (byte) 122);
                class128.field1861.method1354(class322.field4851.method2540((byte) -94), (byte) -100);
                class128.field1861.method1354(class19.field307.method2540((byte) -94), (byte) -17);
                class128.field1861.method1354(class290.field4386.method2540((byte) -94), (byte) -94);
                class128.field1861.method1354(class75.field1090.method2540((byte) -94), (byte) 122);
                class128.field1861.method1354(class214.field3123.method2540((byte) -94), (byte) -82);
                class128.field1861.method1354(class93.field1292.method2540((byte) -94), (byte) 116);
                class128.field1861.method1354(class307.field4590.method2540((byte) -94), (byte) -80);
                class128.field1861.method1354(class321.field4838.method2540((byte) -94), (byte) 108);
                class128.field1861.method1354(class135.field1970.method2540((byte) -94), (byte) 108);
                class128.field1861.method1354(class312.field4649.method2540((byte) -94), (byte) 6);
                class128.field1861.method1354(field4229.method2540((byte) -94), (byte) 114);
                class128.field1861.method1354(class180.field2582.method2540((byte) -94), (byte) -112);
                class128.field1861.method1354(class98.field1388.method2540((byte) -94), (byte) 122);
                class128.field1861.method1354(class165.field2365.method2540((byte) -94), (byte) 112);
                class128.field1861.method1354(class207.field3031.method2540((byte) -94), (byte) 110);
                class128.field1861.method1354(class134.field1956.method2540((byte) -94), (byte) 0);
                class128.field1861.method1354(class116.field1651.method2540((byte) -94), (byte) 108);
                class128.field1861.method1354(class89.field1246.method2540((byte) -94), (byte) 0);
                class128.field1861.method1354(class149.field2168.method2540((byte) -94), (byte) -71);
                class128.field1861.method1349(0, arg0 ^ 0xFFFFF43F, class107.field1533.field2776, class107.field1533.field2718);
                class67.field973.method1558(5000, class128.field1861.field2718, 0, class128.field1861.field2776);
                class107.field1533.method1912(-115, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class83.field1194.method1912(-124, var5);
                class289.field4378 = 4;
            }
            if (class289.field4378 == 4) {
                if (class67.field973.method1554(-2) < 1) {
                    return;
                }
                int var7 = class67.field973.method1553(arg0 ^ 0xFFFFFFFE);
                if (var7 == 21) {
                    class289.field4378 = 7;
                } else if (var7 == 29) {
                    class289.field4378 = 10;
                } else if (var7 == 1) {
                    class158.field2278 = var7;
                    class289.field4378 = 5;
                    return;
                } else if (var7 == 2) {
                    class289.field4378 = 8;
                } else if (var7 == 15) {
                    class158.field2278 = var7;
                    class289.field4378 = 0;
                    return;
                } else if (var7 == 23 && class229.field3467 < 1) {
                    class289.field4378 = 1;
                    class229.field3467++;
                    class318.field4792 = 0;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                } else {
                    class289.field4378 = 0;
                    class158.field2278 = var7;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                }
            }
            if (class289.field4378 == 6) {
                class107.field1533.field2776 = 0;
                class107.field1533.method1915(true, 17);
                class67.field973.method1558(5000, class107.field1533.field2718, 0, class107.field1533.field2776);
                class289.field4378 = 4;
                return;
            }
            if (class289.field4378 == 7) {
                if (class67.field973.method1554(-2) < 1) {
                    return;
                }
                class272.field4126 = (class67.field973.method1553(0) + 3) * 60;
                class289.field4378 = 0;
                class158.field2278 = 21;
                class67.field973.method1555(false);
                class67.field973 = null;
                return;
            }
            if (class289.field4378 == 10) {
                if (class67.field973.method1554(arg0) >= 1) {
                    class279.field4243 = class67.field973.method1553(0);
                    class289.field4378 = 0;
                    class158.field2278 = 29;
                    class67.field973.method1555(false);
                    class67.field973 = null;
                    return;
                }
                return;
            }
            if (arg0 != -2) {
                field4229 = (class361) null;
            }
            if (class289.field4378 == 8) {
                if (class67.field973.method1554(-2) < 14) {
                    return;
                }
                class67.field973.method1552(class83.field1194.field2718, 0, 14, (byte) 33);
                class83.field1194.field2776 = 0;
                class111.field1619 = class83.field1194.method1319(255);
                class292.field4421 = class83.field1194.method1319(arg0 ^ 0xFFFFFF01);
                class251.field3727 = class83.field1194.method1319(arg0 ^ -255) == 1;
                class216.field3182 = class83.field1194.method1319(arg0 + 257) == 1;
                class193.field2811 = class83.field1194.method1319(255) == 1;
                class296.field4451 = class83.field1194.method1319(255) == 1;
                class291.field4415 = class83.field1194.method1319(255) == 1;
                class54.field790 = class83.field1194.method1317((byte) 44);
                class98.field1381 = class83.field1194.method1319(255) == 1;
                class189.field2692 = class83.field1194.method1319(255) == 1;
                class332.method2334((byte) 31, class189.field2692);
                class260.method1914(class189.field2692, -6528);
                class359.method2490(class189.field2692, -98);
                if (!class356.field5459) {
                    if ((!class251.field3727 || class193.field2811) && !class98.field1381) {
                        try {
                            class114.method858("unzap", (byte) -67, class54.field787.field878);
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class114.method858("zap", (byte) -67, class54.field787.field878);
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class114.method858("loggedin", (byte) -67, class54.field787.field878);
                } catch (Throwable var12) {
                }
                class54.field788 = class83.field1194.method1908((byte) -106);
                class358.field5481 = class83.field1194.method1317((byte) 58);
                class289.field4378 = 9;
            }
            if (class289.field4378 == 9) {
                if (class67.field973.method1554(arg0) >= class358.field5481) {
                    class83.field1194.field2776 = 0;
                    class67.field973.method1552(class83.field1194.field2718, 0, class358.field5481, (byte) 33);
                    class289.field4378 = 0;
                    class158.field2278 = 2;
                    class244.method1791(95);
                    class169.field2446 = -1;
                    class76.method617(13, false);
                    class54.field788 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class67.field973 != null) {
                class67.field973.method1555(false);
                class67.field973 = null;
            }
            if (class229.field3467 >= 1) {
                class289.field4378 = 0;
                class158.field2278 = -4;
            } else {
                if (class75.field1096 == class62.field913) {
                    class62.field913 = class240.field3574;
                } else {
                    class62.field913 = class75.field1096;
                }
                class229.field3467++;
                class289.field4378 = 1;
                class318.field4792 = 0;
            }
        }
    }
}
