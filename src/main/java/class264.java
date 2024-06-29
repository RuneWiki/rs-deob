import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class264 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lbt;")
    public static class363 field3902 = new class363(256);

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field3912 = 0;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Lbn;")
    private static class160 field3911 = new class160(30, 3);

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Ljn;")
    public static class409 field3913 = new class409(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "J")
    public long field3907;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lgk;")
    public class264 field3906;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "Lgk;")
    public class264 field3908;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "[[[I")
    public static int[][][] field3910;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 11)
    public static final void method1818(byte arg0) {
        if (arg0 > -52) {
            method1821(-42, (class104) null);
        }
        for (int var1 = 0; var1 < class271.field4017.length; var1++) {
            for (int var2 = 0; var2 < class271.field4017[var1].length; var2++) {
                class271.field4017[var1][var2] = class437.field6371;
            }
        }
        field3909++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lia;I)V", line = 39)
    public static final void method1819(class375 arg0, int arg1) {
        field3903++;
        if (arg0 == null || class138.field1885.field5735 == arg0) {
            return;
        }
        int var2 = arg0.field5476;
        int var3 = arg0.field5468;
        int var4 = arg0.field5469;
        int var5 = (int) arg0.field5480;
        if (arg1 > -11) {
            method1819((class375) null, 126);
        }
        long var6 = arg0.field5480;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var8;
        int var9;
        if (class78.field986 == null) {
            var8 = class241.field3572;
            var9 = class136.field1869;
        } else {
            var8 = class78.field986.method2437((byte) 26);
            var9 = class78.field986.method2440(-1);
        }
        if (var4 == 13 || var4 == 1004) {
            class93.method631(var5, var3, var2, true, arg0.field5477);
        }
        if (var4 == 59) {
            class56.field688 = var8;
            class309.field4559 = 2;
            class31.field435 = 0;
            class466.field6856++;
            class150.field2043 = var9;
            class257.method1773((byte) -10, class151.field2046);
            class159.field2132.method1764(false, class243.field3605);
            class159.field2132.method1748(var5, (byte) 125);
            class159.field2132.method1748(class134.field1846 + var3, (byte) -35);
            class159.field2132.method1707(class74.field949, -82);
            class159.field2132.method1727(-128, class436.field6368.method256(-114, 82) ? 1 : 0);
            class159.field2132.method1707(class28.field399 + var2, -107);
            class159.field2132.method1750((byte) 0, class155.field2092);
            class143.method986(var2, (byte) 71, var3);
        }
        if (var4 == 49) {
            if (class42.field564 > 0 && class436.field6368.method256(-111, 82) && class436.field6368.method256(-113, 81)) {
                class387.method2447((byte) -105, class28.field399 + var2, class187.field2619.field4960, class134.field1846 + var3);
            } else {
                class31.field435 = 0;
                class309.field4559 = 1;
                class56.field688 = var8;
                class150.field2043 = var9;
                class17.field265++;
                class257.method1773((byte) -10, class336.field4962);
                class159.field2132.method1707(class134.field1846 + var3, -91);
                class159.field2132.method1748(class28.field399 + var2, (byte) -67);
            }
        }
        if (var4 == 22) {
            class26 var10 = class364.field5260[var5];
            if (var10 != null) {
                class309.field4559 = 2;
                class271.field4011++;
                class31.field435 = 0;
                class150.field2043 = var9;
                class56.field688 = var8;
                class257.method1773((byte) -10, field3911);
                class159.field2132.method1748(var5, (byte) -76);
                class159.field2132.method1768(class436.field6368.method256(-98, 82) ? 1 : 0, 119);
                class35.method329(0, var10.field784[0], -2, var10.method446(10), true, var10.field793[0], class187.field2619.field793[0], var10.method446(10), 0, class187.field2619.field784[0], 78);
            }
        }
        if (var4 == 1008 || var4 == 1003 || var4 == 1009 || var4 == 1007 || var4 == 1012) {
            class373.method2367(var2, var4, var5, -119);
        }
        if (var4 == 19) {
            class141.field1924++;
            class150.field2043 = var9;
            class56.field688 = var8;
            class309.field4559 = 2;
            class31.field435 = 0;
            class257.method1773((byte) -10, class199.field2814);
            class159.field2132.method1768(class436.field6368.method256(-82, 82) ? 1 : 0, 121);
            class159.field2132.method1744((byte) -108, var3 + class134.field1846);
            class159.field2132.method1750((byte) 0, var5);
            class159.field2132.method1744((byte) -108, class28.field399 + var2);
            class143.method986(var2, (byte) 71, var3);
        }
        if (var4 == 58) {
            class309.field4559 = 2;
            class31.field435 = 0;
            class56.field688 = var8;
            class150.field2043 = var9;
            class215.field3033++;
            class257.method1773((byte) -10, class399.field5774);
            class159.field2132.method1707(class28.field399 + var2, -69);
            class159.field2132.method1768(class436.field6368.method256(-84, 82) ? 1 : 0, 124);
            class159.field2132.method1750((byte) 0, var5);
            class159.field2132.method1707(class134.field1846 + var3, -85);
            class143.method986(var2, (byte) 71, var3);
        }
        if (var4 == 44) {
            class380 var11 = class455.field6731[var5];
            if (var11 != null) {
                class309.field4559 = 2;
                class31.field435 = 0;
                class150.field2043 = var9;
                class366.field5289++;
                class56.field688 = var8;
                class257.method1773((byte) -10, class380.field5554);
                class159.field2132.method1756(class243.field3605, (byte) 97);
                class159.field2132.method1708(-6258, class436.field6368.method256(-123, 82) ? 1 : 0);
                class159.field2132.method1750((byte) 0, class74.field949);
                class159.field2132.method1744((byte) -108, var5);
                class159.field2132.method1707(class155.field2092, -71);
                class35.method329(0, var11.field784[0], -2, var11.method446(10), true, var11.field793[0], class187.field2619.field793[0], var11.method446(10), 0, class187.field2619.field784[0], 126);
            }
        }
        if (var4 == 9) {
            class380 var12 = class455.field6731[var5];
            if (var12 != null) {
                class56.field688 = var8;
                class150.field2043 = var9;
                class31.field435 = 0;
                class309.field4559 = 2;
                class150.field2026++;
                class257.method1773((byte) -10, class133.field1831);
                class159.field2132.method1727(-128, class436.field6368.method256(-105, 82) ? 1 : 0);
                class159.field2132.method1707(var5, -124);
                class35.method329(0, var12.field784[0], -2, var12.method446(10), true, var12.field793[0], class187.field2619.field793[0], var12.method446(10), 0, class187.field2619.field784[0], 67);
            }
        }
        if (var4 == 12) {
            class26 var13 = class364.field5260[var5];
            if (var13 != null) {
                class150.field2043 = var9;
                class309.field4559 = 2;
                class149.field2020++;
                class56.field688 = var8;
                class31.field435 = 0;
                class257.method1773((byte) -10, class328.field4887);
                class159.field2132.method1750((byte) 0, class74.field949);
                class159.field2132.method1748(class155.field2092, (byte) 126);
                class159.field2132.method1748(var5, (byte) 127);
                class159.field2132.method1721(25153, class243.field3605);
                class159.field2132.method1727(-128, class436.field6368.method256(-96, 82) ? 1 : 0);
                class35.method329(0, var13.field784[0], -2, var13.method446(10), true, var13.field793[0], class187.field2619.field793[0], var13.method446(10), 0, class187.field2619.field784[0], 118);
            }
        }
        if (var4 == 10) {
            class380 var14 = class455.field6731[var5];
            if (var14 != null) {
                class56.field688 = var8;
                class126.field1670++;
                class309.field4559 = 2;
                class31.field435 = 0;
                class150.field2043 = var9;
                class257.method1773((byte) -10, class159.field2129);
                class159.field2132.method1768(class436.field6368.method256(-119, 82) ? 1 : 0, 125);
                class159.field2132.method1748(var5, (byte) 122);
                class35.method329(0, var14.field784[0], -2, var14.method446(10), true, var14.field793[0], class187.field2619.field793[0], var14.method446(10), 0, class187.field2619.field784[0], 15);
            }
        }
        if (var4 == 45) {
            class109.field1479++;
            class309.field4559 = 1;
            class31.field435 = 0;
            class56.field688 = var8;
            class150.field2043 = var9;
            class257.method1773((byte) -10, class370.field5428);
            class159.field2132.method1707(class74.field949, -82);
            class159.field2132.method1748(class155.field2092, (byte) -31);
            class159.field2132.method1764(false, class243.field3605);
            class159.field2132.method1748(class134.field1846 + var3, (byte) -60);
            class159.field2132.method1744((byte) -108, class28.field399 + var2);
            class35.method329(0, var3, -4, 1, true, var2, class187.field2619.field793[0], 1, 0, class187.field2619.field784[0], 78);
        }
        if (var4 == 57) {
            class223 var15 = class99.method654(-1, var3, var2);
            if (var15 != null) {
                class25.method257(76);
                class332 var16 = client.method1811(var15);
                class142.method938(var16.method2162(-81), var3, var15.field3335, var15.field3246, (byte) 52, var2, var16.field4927);
                class253.field3723 = class58.method436(var15, 35);
                class429.field6240 = var15.field3212 + "<col=ffffff>";
                if (class253.field3723 == null) {
                    class253.field3723 = "Null";
                }
            }
            return;
        }
        if (var4 == 5) {
            class31.field435 = 0;
            class150.field2043 = var9;
            class309.field4559 = 2;
            class56.field688 = var8;
            class278.field4095++;
            class257.method1773((byte) -10, class430.field6245);
            class159.field2132.method1763(2725, class436.field6368.method256(-82, 82) ? 1 : 0);
            class159.field2132.method1748(class134.field1846 + var3, (byte) 126);
            class159.field2132.method1744((byte) -108, var2 + class28.field399);
            class159.field2132.method1707(var5, -102);
            class143.method986(var2, (byte) 71, var3);
        }
        if (var4 == 1001) {
            class31.field435 = 0;
            class309.field4559 = 2;
            class150.field2043 = var9;
            class56.field688 = var8;
            class249.field3661++;
            class257.method1773((byte) -10, class305.field4502);
            class159.field2132.method1763(2725, class436.field6368.method256(-84, 82) ? 1 : 0);
            class159.field2132.method1748(class134.field1846 + var3, (byte) -26);
            class159.field2132.method1707((int) (var6 >>> 32) & Integer.MAX_VALUE, -98);
            class159.field2132.method1744((byte) -108, class28.field399 + var2);
            class248.method1645(var2, 23907104, var3, var6);
        }
        if (var4 == 4) {
            class26 var17 = class364.field5260[var5];
            if (var17 != null) {
                class150.field2043 = var9;
                class31.field435 = 0;
                class55.field672++;
                class309.field4559 = 2;
                class56.field688 = var8;
                class257.method1773((byte) -10, class325.field4780);
                class159.field2132.method1748(var5, (byte) 122);
                class159.field2132.method1768(class436.field6368.method256(-108, 82) ? 1 : 0, 118);
                class35.method329(0, var17.field784[0], -2, var17.method446(10), true, var17.field793[0], class187.field2619.field793[0], var17.method446(10), 0, class187.field2619.field784[0], 121);
            }
        }
        if (var4 == 20) {
            class380 var18 = class455.field6731[var5];
            if (var18 != null) {
                class56.field688 = var8;
                class371.field5429++;
                class309.field4559 = 2;
                class31.field435 = 0;
                class150.field2043 = var9;
                class257.method1773((byte) -10, class420.field6081);
                class159.field2132.method1707(var5, -95);
                class159.field2132.method1763(2725, class436.field6368.method256(-118, 82) ? 1 : 0);
                class35.method329(0, var18.field784[0], -2, var18.method446(10), true, var18.field793[0], class187.field2619.field793[0], var18.method446(10), 0, class187.field2619.field784[0], 111);
            }
        }
        if (var4 == 23) {
            class26 var19 = class364.field5260[var5];
            if (var19 != null) {
                class309.field4559 = 2;
                class31.field435 = 0;
                class32.field439++;
                class150.field2043 = var9;
                class56.field688 = var8;
                class257.method1773((byte) -10, class353.field5152);
                class159.field2132.method1744((byte) -108, var5);
                class159.field2132.method1708(-6258, class436.field6368.method256(-114, 82) ? 1 : 0);
                class35.method329(0, var19.field784[0], -2, var19.method446(10), true, var19.field793[0], class187.field2619.field793[0], var19.method446(10), 0, class187.field2619.field784[0], 57);
            }
        }
        if (var4 == 50 && class378.field5539 == null) {
            class451.method2800(var2, var3, 31965);
            class378.field5539 = class99.method654(-1, var3, var2);
            class15.method216((byte) 126, class378.field5539);
        }
        if (var4 == 30) {
            class31.field435 = 0;
            class150.field2043 = var9;
            class309.field4559 = 2;
            class42.field554++;
            class56.field688 = var8;
            class257.method1773((byte) -10, class368.field5315);
            class159.field2132.method1708(-6258, class436.field6368.method256(-90, 82) ? 1 : 0);
            class159.field2132.method1748(class28.field399 + var2, (byte) 124);
            class159.field2132.method1707(class134.field1846 + var3, -127);
            class159.field2132.method1750((byte) 0, var5);
            class143.method986(var2, (byte) 71, var3);
        }
        if (var4 == 8) {
            class380 var20 = class455.field6731[var5];
            if (var20 != null) {
                class150.field2043 = var9;
                class31.field435 = 0;
                class56.field688 = var8;
                class63.field830++;
                class309.field4559 = 2;
                class257.method1773((byte) -10, class214.field3029);
                class159.field2132.method1763(2725, class436.field6368.method256(-111, 82) ? 1 : 0);
                class159.field2132.method1707(var5, -68);
                class35.method329(0, var20.field784[0], -2, var20.method446(10), true, var20.field793[0], class187.field2619.field793[0], var20.method446(10), 0, class187.field2619.field784[0], 27);
            }
        }
        if (var4 == 47) {
            class26 var21 = class364.field5260[var5];
            if (var21 != null) {
                class150.field2043 = var9;
                class309.field4559 = 2;
                class56.field688 = var8;
                class31.field435 = 0;
                class188.field2626++;
                class257.method1773((byte) -10, class455.field6720);
                class159.field2132.method1748(var5, (byte) 126);
                class159.field2132.method1727(-128, class436.field6368.method256(-99, 82) ? 1 : 0);
                class35.method329(0, var21.field784[0], -2, var21.method446(10), true, var21.field793[0], class187.field2619.field793[0], var21.method446(10), 0, class187.field2619.field784[0], 76);
            }
        }
        if (var4 == 17) {
            class31.field435 = 0;
            class267.field3973++;
            class150.field2043 = var9;
            class56.field688 = var8;
            class309.field4559 = 2;
            class257.method1773((byte) -10, class76.field975);
            class159.field2132.method1748(var3 + class134.field1846, (byte) -66);
            class159.field2132.method1708(-6258, class436.field6368.method256(-91, 82) ? 1 : 0);
            class159.field2132.method1744((byte) -108, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class159.field2132.method1748(class28.field399 + var2, (byte) 122);
            class248.method1645(var2, 23907104, var3, var6);
        }
        if (var4 == 3) {
            class56.field688 = var8;
            class150.field2043 = var9;
            class309.field4559 = 2;
            class388.field5679++;
            class31.field435 = 0;
            class257.method1773((byte) -10, class420.field6086);
            class159.field2132.method1708(-6258, class436.field6368.method256(-99, 82) ? 1 : 0);
            class159.field2132.method1707(class134.field1846 + var3, -107);
            class159.field2132.method1707(class28.field399 + var2, -128);
            class159.field2132.method1707(Integer.MAX_VALUE & (int) (var6 >>> 32), -103);
            class248.method1645(var2, 23907104, var3, var6);
        }
        if (var4 == 2) {
            class223 var22 = class99.method654(-1, var3, var2);
            if (var22 != null) {
                class164.method1088(-125, var22);
            }
        }
        if (var4 == 1010) {
            class31.field435 = 0;
            class56.field688 = var8;
            class400.field5783++;
            class309.field4559 = 2;
            class150.field2043 = var9;
            class257.method1773((byte) -10, class359.field5216);
            class159.field2132.method1750((byte) 0, var5);
        }
        if (var4 == 46) {
            class150.field2043 = var9;
            class309.field4559 = 2;
            class427.field6200++;
            class31.field435 = 0;
            class56.field688 = var8;
            class257.method1773((byte) -10, class245.field3625);
            class159.field2132.method1750((byte) 0, var5);
            class159.field2132.method1727(-128, class436.field6368.method256(-111, 82) ? 1 : 0);
            class159.field2132.method1707(class28.field399 + var2, -113);
            class159.field2132.method1748(class134.field1846 + var3, (byte) 119);
            class143.method986(var2, (byte) 71, var3);
        }
        if (var4 == 51) {
            class380 var23 = class455.field6731[var5];
            if (var23 != null) {
                class309.field4559 = 2;
                class150.field2043 = var9;
                class57.field698++;
                class56.field688 = var8;
                class31.field435 = 0;
                class257.method1773((byte) -10, class403.field5829);
                class159.field2132.method1750((byte) 0, var5);
                class159.field2132.method1768(class436.field6368.method256(-125, 82) ? 1 : 0, 123);
                class35.method329(0, var23.field784[0], -2, var23.method446(10), true, var23.field793[0], class187.field2619.field793[0], var23.method446(10), 0, class187.field2619.field784[0], 99);
            }
        }
        if (var4 == 21) {
            class56.field688 = var8;
            class304.field4455++;
            class31.field435 = 0;
            class150.field2043 = var9;
            class309.field4559 = 2;
            class257.method1773((byte) -10, class148.field2015);
            class159.field2132.method1748((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 125);
            class159.field2132.method1744((byte) -108, class134.field1846 + var3);
            class159.field2132.method1750((byte) 0, class28.field399 + var2);
            class159.field2132.method1763(2725, class436.field6368.method256(-98, 82) ? 1 : 0);
            class248.method1645(var2, 23907104, var3, var6);
        }
        if (var4 == 60) {
            class26 var24 = class364.field5260[var5];
            if (var24 != null) {
                class56.field688 = var8;
                class111.field1541++;
                class150.field2043 = var9;
                class309.field4559 = 2;
                class31.field435 = 0;
                class257.method1773((byte) -10, class390.field5699);
                class159.field2132.method1744((byte) -108, var5);
                class159.field2132.method1708(-6258, class436.field6368.method256(-124, 82) ? 1 : 0);
                class35.method329(0, var24.field784[0], -2, var24.method446(10), true, var24.field793[0], class187.field2619.field793[0], var24.method446(10), 0, class187.field2619.field784[0], 110);
            }
        }
        if (var4 == 1006) {
            class403.field5816++;
            class56.field688 = var8;
            class150.field2043 = var9;
            class31.field435 = 0;
            class309.field4559 = 2;
            class257.method1773((byte) -10, class127.field1683);
            class159.field2132.method1750((byte) 0, var5);
        }
        if (var4 == 1002) {
            class31.field435 = 0;
            class309.field4559 = 2;
            class56.field688 = var8;
            class150.field2043 = var9;
            class26 var25 = class364.field5260[var5];
            if (var25 != null) {
                class327 var26 = var25.field369;
                if (var26.field4871 != null) {
                    var26 = var26.method2139(true);
                }
                if (var26 != null) {
                    class169.field2210++;
                    class257.method1773((byte) -10, class213.field3009);
                    class159.field2132.method1750((byte) 0, var26.field4847);
                }
            }
        }
        if (var4 == 48) {
            class31.field435 = 0;
            class309.field4559 = 2;
            class150.field2043 = var9;
            class56.field688 = var8;
            class130.field1727++;
            class257.method1773((byte) -10, class44.field573);
            class159.field2132.method1756(class243.field3605, (byte) 113);
            class159.field2132.method1707(class74.field949, -104);
            class159.field2132.method1750((byte) 0, class134.field1846 + var3);
            class159.field2132.method1707(Integer.MAX_VALUE & (int) (var6 >>> 32), -94);
            class159.field2132.method1727(-128, class436.field6368.method256(-98, 82) ? 1 : 0);
            class159.field2132.method1707(class155.field2092, -69);
            class159.field2132.method1750((byte) 0, class28.field399 + var2);
            class248.method1645(var2, 23907104, var3, var6);
        }
        if (var4 == 11) {
            class150.field2043 = var9;
            class309.field4559 = 2;
            class56.field688 = var8;
            class31.field435 = 0;
            class103.field1321++;
            class257.method1773((byte) -10, class96.field1196);
            class159.field2132.method1744((byte) -108, class28.field399 + var2);
            class159.field2132.method1727(-128, class436.field6368.method256(-127, 82) ? 1 : 0);
            class159.field2132.method1748(class134.field1846 + var3, (byte) -13);
            class159.field2132.method1748((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 124);
            class248.method1645(var2, 23907104, var3, var6);
        }
        if (var4 == 18) {
            if (class42.field564 > 0 && class436.field6368.method256(-118, 82) && class436.field6368.method256(-100, 81)) {
                class387.method2447((byte) 123, class28.field399 + var2, class187.field2619.field4960, class134.field1846 + var3);
            } else {
                class247.method1638(var5, var2, 112, var3);
                if (var5 == 1) {
                    class159.field2132.method1727(-128, -1);
                    class159.field2132.method1727(-128, -1);
                    class159.field2132.method1750((byte) 0, (int) class1.field19);
                    class159.field2132.method1727(-128, 57);
                    class159.field2132.method1727(-128, class303.field4429);
                    class159.field2132.method1727(-128, class30.field422);
                    class159.field2132.method1727(-128, 89);
                    class159.field2132.method1750((byte) 0, class187.field2619.field4954);
                    class159.field2132.method1750((byte) 0, class187.field2619.field4951);
                    class159.field2132.method1727(-128, 63);
                } else {
                    class56.field688 = var8;
                    class150.field2043 = var9;
                    class31.field435 = 0;
                    class309.field4559 = 1;
                }
                class35.method329(0, var3, -4, 1, true, var2, class187.field2619.field793[0], 1, 0, class187.field2619.field784[0], 76);
            }
        }
        if (var4 == 6) {
            class380 var27 = class455.field6731[var5];
            if (var27 != null) {
                class31.field435 = 0;
                class150.field2043 = var9;
                class309.field4559 = 2;
                class56.field688 = var8;
                class199.field2804++;
                class257.method1773((byte) -10, class266.field3944);
                class159.field2132.method1750((byte) 0, var5);
                class159.field2132.method1727(-128, class436.field6368.method256(-104, 82) ? 1 : 0);
                class35.method329(0, var27.field784[0], -2, var27.method446(10), true, var27.field793[0], class187.field2619.field793[0], var27.method446(10), 0, class187.field2619.field784[0], 42);
            }
        }
        if (var4 == 15) {
            class380 var28 = class455.field6731[var5];
            if (var28 != null) {
                class72.field934++;
                class31.field435 = 0;
                class309.field4559 = 2;
                class150.field2043 = var9;
                class56.field688 = var8;
                class257.method1773((byte) -10, class380.field5569);
                class159.field2132.method1707(var5, -92);
                class159.field2132.method1708(-6258, class436.field6368.method256(-107, 82) ? 1 : 0);
                class35.method329(0, var28.field784[0], -2, var28.method446(10), true, var28.field793[0], class187.field2619.field793[0], var28.method446(10), 0, class187.field2619.field784[0], 39);
            }
        }
        if (var4 == 25) {
            class380 var29 = class455.field6731[var5];
            if (var29 != null) {
                class289.field4229++;
                class31.field435 = 0;
                class56.field688 = var8;
                class309.field4559 = 2;
                class150.field2043 = var9;
                class257.method1773((byte) -10, class142.field1935);
                class159.field2132.method1763(2725, class436.field6368.method256(-94, 82) ? 1 : 0);
                class159.field2132.method1707(var5, -77);
                class35.method329(0, var29.field784[0], -2, var29.method446(10), true, var29.field793[0], class187.field2619.field793[0], var29.method446(10), 0, class187.field2619.field784[0], 14);
            }
        }
        if (class147.field1993) {
            class25.method257(69);
        }
        if (class296.field4306 != null && class148.field2007 == 0) {
            class15.method216((byte) 122, class296.field4306);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 765)
    public final void method1820(int arg0) {
        field3900++;
        if (this.field3908 == null) {
            return;
        }
        this.field3908.field3906 = this.field3906;
        this.field3906.field3908 = this.field3908;
        this.field3906 = null;
        if (arg0 != -25246) {
            this.method1822(-118);
        }
        this.field3908 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILct;)V", line = 782)
    public static final void method1821(int arg0, class104 arg1) {
        class5.field86 = arg1;
        if (arg0 != 0) {
            method1821(-32, (class104) null);
        }
        field3905++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Z", line = 798)
    public final boolean method1822(int arg0) {
        field3904++;
        if (this.field3908 == null) {
            return false;
        } else {
            if (arg0 >= -67) {
                method1821(105, (class104) null);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 830)
    public static void method1823(int arg0) {
        if (arg0 != 14303) {
            field3913 = null;
        }
        field3910 = null;
        field3913 = null;
        field3902 = null;
        field3911 = null;
    }
}
