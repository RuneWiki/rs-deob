import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class95 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lea;")
    public static class38 field2138 = class9.method46((byte) 106, "Hierhin gehen");

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lea;")
    private static class38 field2131 = class9.method46((byte) 108, "Connection lost)3");

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lea;")
    public static class38 field2140 = class9.method46((byte) 122, "lila:");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lea;")
    private static class38 field2130 = class9.method46((byte) 127, "Please enter your username)3");

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2136 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lea;")
    public static class38 field2134 = class9.method46((byte) 117, "blaugr-Un:");

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lea;")
    public static class38 field2141 = field2130;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lea;")
    public static class38 field2144 = class9.method46((byte) 117, "Null");

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Lea;")
    public static class38 field2145 = field2131;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
    public static byte[] field2133 = new byte[520];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[S")
    public static short[] field2143;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BB)[B")
    public static final byte[] method795(byte[] arg0, byte arg1) {
        class66 var2 = new class66(arg0);
        if (arg1 != 106) {
            method798(25);
        }
        int var3 = var2.method509(arg1 + 12);
        field2146++;
        int var4 = var2.method464(-89);
        if (var4 < 0 || class127.field2736 != 0 && class127.field2736 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method499(0, var4, var7, (byte) -53);
            return var7;
        } else {
            int var5 = var2.method464(-42);
            if (var5 < 0 || class127.field2736 != 0 && class127.field2736 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class78.method676(var6, var5, arg0, var4, 9);
            } else {
                class7.field173.method102((byte) 126, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILob;Ls;I)V")
    public static final void method796(int arg0, class127 arg1, class161 arg2, int arg3) {
        field2147++;
        class36 var4 = new class36();
        var4.field753 = arg2;
        var4.field755 = arg1;
        var4.field754 = arg3;
        var4.field2172 = arg0;
        class141 var5 = class188.field3756;
        synchronized (class188.field3756) {
            class188.field3756.method1014((byte) -117, var4);
        }
        class53.method384(true);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        if (arg0 != -9) {
            field2142 = 26;
        }
        field2143 = null;
        field2130 = null;
        field2145 = null;
        field2141 = null;
        field2144 = null;
        field2133 = null;
        field2131 = null;
        field2134 = null;
        field2140 = null;
        field2138 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method798(int arg0) {
        field2148++;
        try {
            if (class59.field1473 == 0) {
                if (class39.field876 != null) {
                    class39.field876.method366((byte) -128);
                    class39.field876 = null;
                }
                class135.field2846 = false;
                field2135 = 0;
                class59.field1473 = 1;
                class134.field2831 = null;
            }
            if (class59.field1473 == 1) {
                if (class134.field2831 == null) {
                    class134.field2831 = class186.field3708.method951(class48.field1168, class19.field440, true);
                }
                if (class134.field2831.field1486 == 2) {
                    throw new IOException();
                }
                if (class134.field2831.field1486 == 1) {
                    class39.field876 = new class50((Socket) class134.field2831.field1490, class186.field3708);
                    class59.field1473 = 2;
                    class134.field2831 = null;
                }
            }
            if (arg0 != -21482) {
                method795(null, (byte) 0);
            }
            if (class59.field1473 == 2) {
                long var1 = class188.field3755 = class187.field3725.method256(-53);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class111.field2483.field1620 = 0;
                class111.field2483.method495(101, 14);
                class111.field2483.method495(99, var3);
                class39.field876.method361(0, (byte) 101, class111.field2483.field1627, 2);
                class192.field3794.field1620 = 0;
                class59.field1473 = 3;
            }
            if (class59.field1473 == 3) {
                if (class202.field3991 != null) {
                    class202.field3991.method440(false);
                }
                if (class52.field1339 != null) {
                    class52.field1339.method440(false);
                }
                int var4 = class39.field876.method362(false);
                if (class202.field3991 != null) {
                    class202.field3991.method440(false);
                }
                if (class52.field1339 != null) {
                    class52.field1339.method440(false);
                }
                if (var4 != 0) {
                    class40.method298(var4, (byte) 59);
                    return;
                }
                class192.field3794.field1620 = 0;
                class59.field1473 = 4;
            }
            if (class59.field1473 == 4) {
                if (class192.field3794.field1620 < 8) {
                    int var5 = class39.field876.method363(-106);
                    if (var5 > 8 - class192.field3794.field1620) {
                        var5 = 8 - class192.field3794.field1620;
                    }
                    if (var5 > 0) {
                        class39.field876.method365(var5, class192.field3794.field1620, 122, class192.field3794.field1627);
                        class192.field3794.field1620 += var5;
                    }
                }
                if (class192.field3794.field1620 == 8) {
                    class192.field3794.field1620 = 0;
                    class65.field1558 = class192.field3794.method502(false);
                    class59.field1473 = 5;
                }
            }
            if (class59.field1473 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, (int) (class65.field1558 >> 32), (int) class65.field1558 };
                class111.field2483.field1620 = 0;
                var6[1] = (int) (Math.random() * 9.9999999E7D);
                class111.field2483.method495(arg0 ^ 0xFFFFAC6B, 10);
                class111.field2483.method478((byte) 108, var6[0]);
                class111.field2483.method478((byte) -121, var6[1]);
                class111.field2483.method478((byte) 94, var6[2]);
                class111.field2483.method478((byte) -108, var6[3]);
                class111.field2483.method480(class187.field3725.method256(arg0 ^ 0x53BE), (byte) 108);
                class111.field2483.method508(class187.field3724, 0);
                class111.field2483.method489((byte) -91, class169.field3472, class65.field1551);
                class141.field2950.field1620 = 0;
                if (class86.field2005 == 40) {
                    class141.field2950.method495(arg0 ^ 0xFFFFAC7C, 18);
                } else {
                    class141.field2950.method495(118, 16);
                }
                class141.field2950.method495(106, class111.field2483.field1620 + 93);
                class141.field2950.method478((byte) 54, 474);
                class141.field2950.method495(124, class31.field610 ? 1 : 0);
                class63.method447(class141.field2950, -107);
                class141.field2950.method478((byte) 84, class161.field3350.field624);
                class141.field2950.method478((byte) 29, class161.field3345.field624);
                class141.field2950.method478((byte) 66, class30.field597.field624);
                class141.field2950.method478((byte) -104, class80.field1892.field624);
                class141.field2950.method478((byte) -118, class14.field303.field624);
                class141.field2950.method478((byte) -115, class46.field1124.field624);
                class141.field2950.method478((byte) 89, class133.field2815.field624);
                class141.field2950.method478((byte) 23, class73.field1785.field624);
                class141.field2950.method478((byte) -113, class146.field3049.field624);
                class141.field2950.method478((byte) -101, class28.field550.field624);
                class141.field2950.method478((byte) 48, class124.field2673.field624);
                class141.field2950.method478((byte) -109, class96.field2150.field624);
                class141.field2950.method478((byte) -109, class188.field3754.field624);
                class141.field2950.method478((byte) -113, class16.field336.field624);
                class141.field2950.method478((byte) 124, class169.field3478.field624);
                class141.field2950.method478((byte) -96, class123.field2630.field624);
                class141.field2950.method485(class111.field2483.field1620, 0, arg0 + 21486, class111.field2483.field1627);
                class39.field876.method361(0, (byte) 102, class141.field2950.field1627, class141.field2950.field1620);
                class111.field2483.method170(false, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class192.field3794.method170(false, var6);
                class59.field1473 = 6;
            }
            if (class59.field1473 == 6 && class39.field876.method363(-112) > 0) {
                int var8 = class39.field876.method362(false);
                if (var8 == 21 && class86.field2005 == 20) {
                    class59.field1473 = 7;
                } else if (var8 == 2) {
                    class59.field1473 = 9;
                } else if (var8 == 15 && class86.field2005 == 40) {
                    class84.method712(arg0 + 26512);
                    return;
                } else if (var8 == 23 && class148.field3078 < 1) {
                    class148.field3078++;
                    class59.field1473 = 0;
                } else {
                    class40.method298(var8, (byte) 59);
                    return;
                }
            }
            if (class59.field1473 == 7 && class39.field876.method363(-107) > 0) {
                class22.field473 = class39.field876.method362(false) * 60 + 180;
                class59.field1473 = 8;
            }
            if (class59.field1473 == 8) {
                field2135 = 0;
                class34.method224((byte) -120, class163.method1168(-84, new class38[] { class151.method1059(class22.field473 / 60, (byte) -114), class70.field1752 }), class193.field3811, class37.field782);
                if (--class22.field473 <= 0) {
                    class59.field1473 = 0;
                }
            } else {
                if (class59.field1473 == 9 && class39.field876.method363(-110) >= 8) {
                    class132.field2811 = class39.field876.method362(false);
                    class105.field2341 = class39.field876.method362(false) == 1;
                    class44.field1084 = class39.field876.method362(false);
                    class44.field1084 <<= 0x8;
                    class44.field1084 += class39.field876.method362(false);
                    class74.field1793 = class39.field876.method362(false);
                    class39.field876.method365(1, 0, 122, class192.field3794.field1627);
                    class192.field3794.field1620 = 0;
                    class109.field2456 = class192.field3794.method166(7);
                    class39.field876.method365(2, 0, arg0 + 21604, class192.field3794.field1627);
                    class192.field3794.field1620 = 0;
                    class14.field285 = class192.field3794.method511(arg0 + 21363);
                    class59.field1473 = 10;
                }
                if (class59.field1473 != 10) {
                    field2135++;
                    if (field2135 > 2000) {
                        if (class148.field3078 < 1) {
                            if (class19.field440 == class178.field3606) {
                                class19.field440 = class59.field1474;
                            } else {
                                class19.field440 = class178.field3606;
                            }
                            class59.field1473 = 0;
                            class148.field3078++;
                        } else {
                            class40.method298(-3, (byte) 59);
                        }
                    }
                } else if (class39.field876.method363(-124) >= class14.field285) {
                    class192.field3794.field1620 = 0;
                    class39.field876.method365(class14.field285, 0, 122, class192.field3794.field1627);
                    class133.method978(0);
                    class53.field1348 = -1;
                    class66.method465(0, false);
                    class109.field2456 = -1;
                }
            }
        } catch (IOException var9) {
            if (class148.field3078 < 1) {
                if (class19.field440 == class178.field3606) {
                    class19.field440 = class59.field1474;
                } else {
                    class19.field440 = class178.field3606;
                }
                class148.field3078++;
                class59.field1473 = 0;
            } else {
                class40.method298(-2, (byte) 59);
            }
        }
    }
}
