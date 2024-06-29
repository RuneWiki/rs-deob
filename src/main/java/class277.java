import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class277 {

    @OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
    private int[] field4069;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Lwe;")
    public static class24 field4065 = new class24(50);

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1766(byte arg0) {
        if (arg0 != 7) {
            return;
        }
        field4064++;
        if (class88.field1227 == 0 || class88.field1227 == 5) {
            return;
        }
        try {
            if (++class234.field3292 > 2000) {
                if (class159.field2079 != null) {
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                }
                if (class108.field1481 >= 1) {
                    class88.field1227 = 0;
                    class276.field4043 = -5;
                    return;
                }
                class234.field3292 = 0;
                class108.field1481++;
                class88.field1227 = 1;
                if (class87.field1219 == class167.field2197) {
                    class167.field2197 = class228.field3222;
                } else {
                    class167.field2197 = class87.field1219;
                }
            }
            if (class88.field1227 == 1) {
                class327.field4701 = class361.field5285.method14(class162.field2111, (byte) 127, class167.field2197);
                class88.field1227 = 2;
            }
            if (class88.field1227 == 2) {
                if (class327.field4701.field4259 == 2) {
                    throw new IOException();
                }
                if (class327.field4701.field4259 != 1) {
                    return;
                }
                class159.field2079 = new class26((Socket) class327.field4701.field4262, class361.field5285);
                class327.field4701 = null;
                long var1 = class249.field3595 = class249.method1535(class38.field611, 65535);
                class232.field3279.field3915 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class232.field3279.method1707(-109, 14);
                class232.field3279.method1707(-118, var3);
                class159.field2079.method245(105, 2, 0, class232.field3279.field3879);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(0);
                }
                int var4 = class159.field2079.method235(-1707);
                if (class188.field2556 != null) {
                    class188.field2556.method1344(0);
                }
                if (client.field3672 != null) {
                    client.field3672.method1344(arg0 - 7);
                }
                if (var4 != 0) {
                    class276.field4043 = var4;
                    class88.field1227 = 0;
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                    return;
                }
                class88.field1227 = 3;
            }
            if (class88.field1227 == 3) {
                if (class159.field2079.method241((byte) 17) < 8) {
                    return;
                }
                class159.field2079.method242(53, 0, class114.field1556.field3879, 8);
                class114.field1556.field3915 = 0;
                class275.field4041 = class114.field1556.method1720(-117);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, (int) (class275.field4041 >> 32), (int) class275.field4041 };
                class232.field3279.field3915 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class232.field3279.method1707(-22, 10);
                class232.field3279.method1704(var5[0], (byte) 125);
                class232.field3279.method1704(var5[1], (byte) 127);
                class232.field3279.method1704(var5[2], (byte) 126);
                class232.field3279.method1704(var5[3], (byte) 125);
                class232.field3279.method1689((byte) 115, class249.method1535(class38.field611, arg0 + 65528));
                class232.field3279.method1662(class74.field1000, (byte) -104);
                class232.field3279.method1703(class139.field1861, (byte) -123, class280.field4122);
                class370.field5508.field3915 = 0;
                if (class137.field1815 == 40) {
                    class370.field5508.method1707(arg0 ^ 0xFFFFFFED, 18);
                } else {
                    class370.field5508.method1707(arg0 ^ 0x35, 16);
                }
                class370.field5508.method1693(class232.field3279.field3915 + class410.method2668((byte) -112, class309.field4426) + 161, (byte) 56);
                class370.field5508.method1704(562, (byte) 126);
                class370.field5508.method1707(-29, class401.field5967);
                class370.field5508.method1707(109, class6.method51(-28));
                class370.field5508.method1693(class345.field5120, (byte) 125);
                class370.field5508.method1693(class274.field4034, (byte) 46);
                class370.field5508.method1707(31, class369.field5483);
                class78.method494(class370.field5508, -34);
                class370.field5508.method1662(class309.field4426, (byte) -110);
                class370.field5508.method1704(class196.field2804, (byte) 126);
                class370.field5508.method1704(class145.method968((byte) 59), (byte) 127);
                class153.field2013 = true;
                class370.field5508.method1693(class420.field6243, (byte) 82);
                class370.field5508.method1704(class185.field2509.method1477(-111), (byte) 126);
                class370.field5508.method1704(class411.field6150.method1477(-87), (byte) 126);
                class370.field5508.method1704(class180.field2387.method1477(-103), (byte) 127);
                class370.field5508.method1704(class159.field2078.method1477(-122), (byte) 127);
                class370.field5508.method1704(class258.field3764.method1477(arg0 - 64), (byte) 125);
                class370.field5508.method1704(class285.field4163.method1477(-8), (byte) 126);
                class370.field5508.method1704(class328.field4711.method1477(arg0 ^ 0xFFFFFFFD), (byte) 126);
                class370.field5508.method1704(class7.field70.method1477(-126), (byte) 125);
                class370.field5508.method1704(class247.field3446.method1477(arg0 ^ 0xFFFFFFEA), (byte) 127);
                class370.field5508.method1704(class252.field3656.method1477(-117), (byte) 126);
                class370.field5508.method1704(class10.field94.method1477(-58), (byte) 126);
                class370.field5508.method1704(class39.field632.method1477(-102), (byte) 125);
                class370.field5508.method1704(class127.field1692.method1477(-53), (byte) 126);
                class370.field5508.method1704(class208.field2987.method1477(-7), (byte) 126);
                class370.field5508.method1704(class371.field5519.method1477(-32), (byte) 127);
                class370.field5508.method1704(class302.field4336.method1477(arg0 ^ 0xFFFFFFC6), (byte) 125);
                class370.field5508.method1704(class78.field1075.method1477(-106), (byte) 127);
                class370.field5508.method1704(class207.field2986.method1477(-67), (byte) 125);
                class370.field5508.method1704(class235.field3300.method1477(-30), (byte) 125);
                class370.field5508.method1704(class215.field3080.method1477(arg0 ^ 0xFFFFFF80), (byte) 125);
                class370.field5508.method1704(class340.field5003.method1477(arg0 ^ 0xFFFFFFF1), (byte) 127);
                class370.field5508.method1704(class324.field4655.method1477(-72), (byte) 127);
                class370.field5508.method1704(class129.field1721.method1477(-114), (byte) 125);
                class370.field5508.method1704(class300.field4299.method1477(arg0 - 40), (byte) 127);
                class370.field5508.method1704(class50.field693.method1477(-67), (byte) 125);
                class370.field5508.method1704(class355.field5212.method1477(-14), (byte) 127);
                class370.field5508.method1704(class446.field6496.method1477(-6), (byte) 127);
                class370.field5508.method1704(class327.field4704.method1477(-115), (byte) 125);
                class370.field5508.method1704(class51.field758.method1477(-125), (byte) 125);
                class370.field5508.method1676(0, -107, class232.field3279.field3879, class232.field3279.field3915);
                class159.field2079.method245(arg0 + 76, class370.field5508.field3915, 0, class370.field5508.field3879);
                class232.field3279.method757(var5, arg0 - 4);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class114.field1556.method757(var5, arg0 ^ 0x4);
                class88.field1227 = 4;
            }
            if (class88.field1227 == 4) {
                if (class159.field2079.method241((byte) 17) < 1) {
                    return;
                }
                int var7 = class159.field2079.method235(-1707);
                if (var7 == 21) {
                    class88.field1227 = 7;
                } else if (var7 == 29) {
                    class88.field1227 = 10;
                } else if (var7 == 1) {
                    class88.field1227 = 5;
                    class276.field4043 = var7;
                    return;
                } else if (var7 == 2) {
                    class88.field1227 = 8;
                } else if (var7 == 15) {
                    class276.field4043 = var7;
                    class88.field1227 = 0;
                    return;
                } else if (var7 == 23 && class108.field1481 < 1) {
                    class108.field1481++;
                    class88.field1227 = 1;
                    class234.field3292 = 0;
                    class159.field2079.method243(arg0 ^ 0xFFFFFFF8);
                    class159.field2079 = null;
                    return;
                } else {
                    class276.field4043 = var7;
                    class88.field1227 = 0;
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                    return;
                }
            }
            if (class88.field1227 == 6) {
                class232.field3279.field3915 = 0;
                class232.field3279.method756(0, 17);
                class159.field2079.method245(arg0 ^ 0x29, class232.field3279.field3915, 0, class232.field3279.field3879);
                class88.field1227 = 4;
            } else if (class88.field1227 == 7) {
                if (class159.field2079.method241((byte) 17) >= 1) {
                    class276.field4057 = (class159.field2079.method235(-1707) + 3) * 60;
                    class276.field4043 = 21;
                    class88.field1227 = 0;
                    class159.field2079.method243(-1);
                    class159.field2079 = null;
                }
            } else if (class88.field1227 != 10) {
                if (class88.field1227 == 8) {
                    if (class159.field2079.method241((byte) 17) < 14) {
                        return;
                    }
                    class159.field2079.method242(82, 0, class114.field1556.field3879, 14);
                    class114.field1556.field3915 = 0;
                    class227.field3206 = class114.field1556.method1697(arg0 - 64);
                    class125.field1668 = class114.field1556.method1697(-53);
                    class261.field3808 = class114.field1556.method1697(-65) == 1;
                    class240.field3381 = class114.field1556.method1697(55) == 1;
                    class394.field5907 = class114.field1556.method1697(-116) == 1;
                    class35.field570 = class114.field1556.method1697(arg0 - 17) == 1;
                    class390.field5847 = class114.field1556.method1697(arg0 ^ 0x41) == 1;
                    class452.field6590 = class114.field1556.method1685(8104);
                    class122.field1640 = class114.field1556.method1697(-69) == 1;
                    class17.field208 = class114.field1556.method1697(-115) == 1;
                    class214.method1346(77, class17.field208);
                    class5.method46(class17.field208, 66);
                    class127.method869(3037, class17.field208);
                    if ((!class261.field3808 || class394.field5907) && !class122.field1640) {
                        try {
                            class67.method434(class361.field5285.field29, (byte) -100, "unzap");
                        } catch (Throwable var9) {
                        }
                    } else {
                        try {
                            class67.method434(class361.field5285.field29, (byte) -100, "zap");
                        } catch (Throwable var10) {
                        }
                    }
                    if (class59.field849 == 0) {
                        try {
                            class67.method434(class361.field5285.field29, (byte) -100, "loggedin");
                        } catch (Throwable var8) {
                        }
                    }
                    class188.field2551 = class114.field1556.method760(5663);
                    class413.field6176 = class114.field1556.method1685(8104);
                    class88.field1227 = 9;
                }
                if (class88.field1227 == 9 && class159.field2079.method241((byte) 17) >= class413.field6176) {
                    class114.field1556.field3915 = 0;
                    class159.field2079.method242(arg0 + 113, 0, class114.field1556.field3879, class413.field6176);
                    class276.field4043 = 2;
                    class88.field1227 = 0;
                    class403.method2615(0);
                    class93.field1276 = -1;
                    class151.method987(false, true);
                    class188.field2551 = -1;
                }
            } else if (class159.field2079.method241((byte) 17) >= 1) {
                class160.field2092 = class159.field2079.method235(arg0 - 1714);
                class276.field4043 = 29;
                class88.field1227 = 0;
                class159.field2079.method243(-1);
                class159.field2079 = null;
            }
        } catch (IOException var11) {
            if (class159.field2079 != null) {
                class159.field2079.method243(arg0 - 8);
                class159.field2079 = null;
            }
            if (class108.field1481 >= 1) {
                class276.field4043 = -4;
                class88.field1227 = 0;
            } else {
                class234.field3292 = 0;
                class88.field1227 = 1;
                if (class87.field1219 == class167.field2197) {
                    class167.field2197 = class228.field3222;
                } else {
                    class167.field2197 = class87.field1219;
                }
                class108.field1481++;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V", line = 385)
    public static final void method1767(int arg0, byte arg1) {
        if (class348.field5172 == null || arg0 > class348.field5172.length) {
            class348.field5172 = new int[arg0];
        }
        field4068++;
        int var2 = -18 % ((78 - arg1) / 47);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I", line = 404)
    public final int method1768(int arg0, int arg1) {
        field4067++;
        if (arg0 < 97) {
            method1769(-93, 89, 1, (byte) 94, 36);
        }
        int var3 = (this.field4069.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field4069[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4069[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIBI)Lvb;", line = 434)
    public static final class91 method1769(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4066++;
        class186[] var5 = null;
        class312 var6 = class29.method253(arg3 - 1728, arg0);
        if (arg3 != 104) {
            return null;
        }
        if (var6.field4464 != null) {
            var5 = new class186[var6.field4464.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class94 var8 = class224.method1395(var6.field4464[var7], arg3 ^ 0x5A7);
                var5[var7] = new class186(var8.field1297, var8.field1286, var8.field1285, var8.field1291, var8.field1289, var8.field1283, var8.field1299, var8.field1287);
            }
        }
        return new class91(var6.field4459, var5, var6.field4461, arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZIILqr;)V", line = 466)
    public static final void method1770(int arg0, int arg1, boolean arg2, int arg3, int arg4, class15 arg5) {
        field4063++;
        if (class7.field64 >= 50 || arg5 == null || arg5.field156 == null || arg3 >= arg5.field156.length || arg5.field156[arg3] == null) {
            return;
        }
        int var6 = arg5.field156[arg3][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        if (arg5.field156[arg3].length > 1) {
            int var9 = (int) ((double) arg5.field156[arg3].length * Math.random());
            if (var9 > 0) {
                var7 = arg5.field156[arg3][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg2) {
                class192.method1194(0, 255, 0, var7, var8);
            }
        } else if (class358.field5243 != 0) {
            class95.field1316[class7.field64] = var7;
            class171.field2252[class7.field64] = var8;
            class408.field6111[class7.field64] = 0;
            class60.field865[class7.field64] = null;
            class189.field2577[class7.field64] = 255;
            if (arg1 == 21155) {
                int var11 = (arg0 - 64) / 128;
                int var12 = (arg4 - 64) / 128;
                class358.field5246[class7.field64] = (var11 << 16) + (var12 << 8) + var10;
                class7.field64++;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBZ)V", line = 527)
    public static final void method1771(int arg0, byte arg1, boolean arg2) {
        field4061++;
        if (arg0 == 0) {
            class35.field574 = class437.method2760(class369.field5483 * 2, -9426, class361.field5285, class319.field4561, arg0, class364.field5327);
        } else {
            if (arg2) {
                class35.field574 = class437.method2760(0, -9426, class361.field5285, class319.field4561, 0, class364.field5327);
                class35.field574.method2118(0);
                class165 var3 = class85.method527(class208.field2987, (byte) -35, 0, class247.field3443);
                class213 var4 = class35.field574.method2179(var3, class25.method222(class247.field3446, class247.field3443, 0), true);
                class132.method898(true, -29854, class284.field4157, var4);
                class35.field574.method2067();
                class220.method1364((byte) 106);
                class35.field574.method2761(-31586);
            }
            try {
                class35.field574 = class437.method2760(class369.field5483 * 2, -9426, class361.field5285, class319.field4561, arg0, class364.field5327);
            } catch (Throwable var7) {
                class35.field574 = class437.method2760(0, -9426, class361.field5285, class319.field4561, 0, class364.field5327);
                arg0 = 0;
            }
        }
        if (class35.field574.method2069()) {
            class288 var5 = class35.field574.method2105(134217728);
            class35.field574.method2138(var5);
        }
        class265.field3854 = arg0;
        class327.method2014((byte) 121);
        if (!class35.field574.method2146()) {
            class169.field2227 = 1;
        }
        class35.field574.method2133(class169.field2227);
        class35.field574.method2161(0);
        class81.field1136 = class35.field574.method2060();
        if (arg1 != 32) {
            return;
        }
        class361.field5294 = class35.field574.method2060();
        int var6 = (int) ((double) class324.field4652 * 34.46D);
        if (class35.field574.method2150()) {
            var6 += 128;
        }
        class35.field574.method2097(50, var6);
        class35.field574.method2064(!class449.field6561);
        if (class35.field574.method2122()) {
            class97.method633(class396.field5947, 47);
        }
        class387.field5789 = !class116.method810((byte) 124);
        class309.method1932(class336.field4964 >> 3, class324.field4652 >> 3, 120, class35.field574);
        class144.method964(arg1 - 157);
        class153.field2013 = false;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V", line = 598)
    public static void method1772(int arg0) {
        field4065 = null;
        if (arg0 != 0) {
            method1773('\u0002', 28);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(CI)Z", line = 609)
    public static final boolean method1773(char arg0, int arg1) {
        field4062++;
        if (arg1 >= -88) {
            field4071 = -125;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "([I)V", line = 623)
    public class277(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field4069 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4069[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4069[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4069[var5 + var5] = arg0[var4];
            this.field4069[var5 + var5 + 1] = var4++;
        }
    }
}
