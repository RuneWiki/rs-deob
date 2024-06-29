import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class106 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Le;")
    public static class191 field1763 = class54.method368("logo", 2047);

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Le;")
    private static class191 field1768 = class54.method368("Connected to update server", 2047);

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Le;")
    private static class191 field1770 = class54.method368("Allocating memory", 2047);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Le;")
    public static class191 field1764 = field1768;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Le;")
    public static class191 field1769 = field1770;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILeg;)Z")
    public static final boolean method680(int arg0, class33 arg1) {
        field1762++;
        if (arg1.field614 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != 6184) {
            method681((byte) -110, -30);
        }
        while (var2 < arg1.field614.length) {
            int var3 = class111.method714(false, var2, arg1);
            int var4 = arg1.field559[var2];
            if (arg1.field614[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field614[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field614[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
    public static final void method681(byte arg0, int arg1) {
        field1765++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class270.field4761[arg1];
        int var3 = class166.field2800[arg1];
        int var4 = class188.field3306[arg1];
        int var5 = (int) class209.field3727[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = class209.field3727[arg1];
        if (var4 == 31) {
            class76 var8 = class245.field4357[var5];
            if (var8 != null) {
                class52.field954++;
                class97.method604(1, var8.field3014[0], class175.field2946.field2953[0], var8.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 123);
                class162.field2749 = 0;
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class126.field2091 = class104.field1709;
                class53.field963.method1096(190, 0);
                class53.field963.method1600(121, var5);
            }
        }
        if (var4 == 1004) {
            class199.field3546 = class50.field897;
            class71.field1244++;
            class126.field2091 = class104.field1709;
            class162.field2749 = 0;
            class242.field4327 = 2;
            class53.field963.method1096(130, 0);
            class53.field963.method1600(-92, var5);
        }
        if (var4 == 49) {
            class53.field963.method1096(62, 0);
            class53.field963.method1576(30289, var3);
            class184.field3198++;
            class33 var9 = class233.method1646(5877, var3);
            if (var9.field461 != null && var9.field461[0][0] == 5) {
                int var10 = var9.field461[0][1];
                if (class164.field2778[var10] != var9.field559[0]) {
                    class164.field2778[var10] = var9.field559[0];
                    class179.method1204(false, var10);
                }
            }
        }
        if (var4 == 4) {
            class156 var11 = class115.field1901[var5];
            if (var11 != null) {
                class26.field378++;
                class97.method604(1, var11.field3014[0], class175.field2946.field2953[0], var11.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 85);
                class162.field2749 = 0;
                class199.field3546 = class50.field897;
                class126.field2091 = class104.field1709;
                class242.field4327 = 2;
                class53.field963.method1096(147, 0);
                class53.field963.method1608(class36.field659, false);
                class53.field963.method1600(115, var5);
                class53.field963.method1616(0, class3.field21);
            }
        }
        if (var4 == 43) {
            class76 var12 = class245.field4357[var5];
            if (var12 != null) {
                class97.method604(1, var12.field3014[0], class175.field2946.field2953[0], var12.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 99);
                class199.field3546 = class50.field897;
                class211.field3740++;
                class242.field4327 = 2;
                class162.field2749 = 0;
                class126.field2091 = class104.field1709;
                class53.field963.method1096(112, 0);
                class53.field963.method1558(-6, var5);
            }
        }
        if (var4 == 46) {
            class76 var13 = class245.field4357[var5];
            if (var13 != null) {
                class93.field1521++;
                class97.method604(1, var13.field3014[0], class175.field2946.field2953[0], var13.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 108);
                class242.field4327 = 2;
                class162.field2749 = 0;
                class199.field3546 = class50.field897;
                class126.field2091 = class104.field1709;
                class53.field963.method1096(243, 0);
                class53.field963.method1602(var5, false);
            }
        }
        if (var4 == 24) {
            class76 var14 = class245.field4357[var5];
            if (var14 != null) {
                class97.method604(1, var14.field3014[0], class175.field2946.field2953[0], var14.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 89);
                class199.field3546 = class50.field897;
                class242.field4327 = 2;
                class162.field2749 = 0;
                class132.field2206++;
                class126.field2091 = class104.field1709;
                class53.field963.method1096(5, 0);
                class53.field963.method1602(var5, false);
            }
        }
        if (var4 == 32 && class32.field449 == null) {
            class220.method1503(var3, 22298, var2);
            class32.field449 = class10.method74(var3, var2, (byte) 11);
            class184.method1238(class32.field449, (byte) -99);
        }
        if (var4 == 58) {
            class114.field1887++;
            class53.field963.method1096(58, 0);
            class53.field963.method1616(0, class3.field21);
            class53.field963.method1576(30289, var3);
            class53.field963.method1558(-47, class36.field659);
            class53.field963.method1558(-16, var2);
        }
        if (var4 == 13) {
            class76 var15 = class245.field4357[var5];
            if (var15 != null) {
                class241.field4287++;
                class97.method604(1, var15.field3014[0], class175.field2946.field2953[0], var15.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 95);
                class162.field2749 = 0;
                class126.field2091 = class104.field1709;
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class53.field963.method1096(41, 0);
                class53.field963.method1558(-63, class176.field3021);
                class53.field963.method1558(93, var5);
                class53.field963.method1600(-102, class123.field2044);
                class53.field963.method1576(30289, class70.field1235);
            }
        }
        if (var4 == 36) {
            class76 var16 = class245.field4357[var5];
            if (var16 != null) {
                class242.field4324++;
                class97.method604(1, var16.field3014[0], class175.field2946.field2953[0], var16.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 86);
                class162.field2749 = 0;
                class242.field4327 = 2;
                class126.field2091 = class104.field1709;
                class199.field3546 = class50.field897;
                class53.field963.method1096(193, 0);
                class53.field963.method1608(var5, false);
            }
        }
        if (var4 == 5) {
            class156 var17 = class115.field1901[var5];
            if (var17 != null) {
                class97.method604(1, var17.field3014[0], class175.field2946.field2953[0], var17.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 92);
                class111.field1858++;
                class162.field2749 = 0;
                class126.field2091 = class104.field1709;
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class53.field963.method1096(194, 0);
                class53.field963.method1558(-3, var5);
            }
        }
        if (var4 == 29) {
            class76 var18 = class245.field4357[var5];
            if (var18 != null) {
                class128.field2123++;
                class97.method604(1, var18.field3014[0], class175.field2946.field2953[0], var18.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 93);
                class199.field3546 = class50.field897;
                class126.field2091 = class104.field1709;
                class162.field2749 = 0;
                class242.field4327 = 2;
                class53.field963.method1096(167, 0);
                class53.field963.method1608(var5, false);
            }
        }
        if (var4 == 42) {
            class156 var19 = class115.field1901[var5];
            if (var19 != null) {
                class51.field932++;
                class97.method604(1, var19.field3014[0], class175.field2946.field2953[0], var19.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 114);
                class126.field2091 = class104.field1709;
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class162.field2749 = 0;
                class53.field963.method1096(126, 0);
                class53.field963.method1558(120, var5);
            }
        }
        if (var4 == 18 || var4 == 1007) {
            class20.method152(var5, class33.field475[arg1], var3, var2, 137);
        }
        if (var4 == 1002) {
            class10.method73(var6, 15, var3, var2);
            class53.field963.method1096(21, 0);
            class53.field963.method1608(class225.field4061 + var2, false);
            class203.field3617++;
            class53.field963.method1608(class193.field3474 + var3, false);
            class53.field963.method1558(101, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 57) {
            class161.field2717++;
            class53.field963.method1096(49, 0);
            class53.field963.method1616(0, var3);
            class53.field963.method1602(var2, false);
            class53.field963.method1600(-45, var5);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 2) {
            boolean var20 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 121);
            class52.field953++;
            if (!var20) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 121);
            }
            class242.field4327 = 2;
            class199.field3546 = class50.field897;
            class126.field2091 = class104.field1709;
            class162.field2749 = 0;
            class53.field963.method1096(255, 0);
            class53.field963.method1608(var2 + class225.field4061, false);
            class53.field963.method1608(var5, false);
            class53.field963.method1602(class193.field3474 + var3, false);
        }
        if (var4 == 1006) {
            class242.field4327 = 2;
            class199.field3546 = class50.field897;
            class162.field2749 = 0;
            class126.field2091 = class104.field1709;
            class156 var22 = class115.field1901[var5];
            if (var22 != null) {
                class184 var23 = var22.field2663;
                if (var23.field3225 != null) {
                    var23 = var23.method1245((byte) -48);
                }
                if (var23 != null) {
                    class53.field963.method1096(29, 0);
                    class53.field963.method1602(var23.field3168, false);
                    class24.field334++;
                }
            }
        }
        if (var4 == 48) {
            class53.field963.method1096(46, 0);
            class53.field963.method1557(var3, -111);
            class53.field963.method1602(class123.field2044, false);
            class53.field963.method1565(class70.field1235, true);
            class53.field963.method1558(99, var5);
            class53.field963.method1602(var2, false);
            class53.field963.method1602(class176.field3021, false);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class197.field3526++;
            class76.field1297 = var2;
        }
        if (var4 == 11) {
            class266.method1825((byte) -103);
            class33 var24 = class233.method1646(5877, var3);
            class70.field1235 = var3;
            class192.field3446 = 1;
            class123.field2044 = var5;
            class176.field3021 = var2;
            class184.method1238(var24, (byte) -74);
            class69.field1216 = class228.method1629(new class191[] { class85.field1400, class100.method623(-1, var5).field2529, class223.field3980 }, (byte) -109);
            if (class69.field1216 == null) {
                class69.field1216 = class258.field4568;
            }
            return;
        }
        if (var4 == 59) {
            class93.field1528++;
            boolean var25 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 89);
            if (!var25) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 120);
            }
            class242.field4327 = 2;
            class199.field3546 = class50.field897;
            class126.field2091 = class104.field1709;
            class162.field2749 = 0;
            class53.field963.method1096(9, 0);
            class53.field963.method1608(var3 + class193.field3474, false);
            class53.field963.method1602(var5, false);
            class53.field963.method1600(-128, var2 + class225.field4061);
        }
        if (var4 == 50) {
            class33 var27 = class233.method1646(5877, var3);
            boolean var28 = true;
            if (var27.field483 > 0) {
                var28 = class117.method781(var27, 338935548);
            }
            if (var28) {
                class53.field963.method1096(62, 0);
                class53.field963.method1576(30289, var3);
                class184.field3198++;
            }
        }
        int var29 = -99 % ((arg0 + 90) / 32);
        if (var4 == 51) {
            class129.field2150++;
            boolean var30 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 97);
            if (!var30) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 121);
            }
            class242.field4327 = 2;
            class126.field2091 = class104.field1709;
            class162.field2749 = 0;
            class199.field3546 = class50.field897;
            class53.field963.method1096(187, 0);
            class53.field963.method1557(class70.field1235, -122);
            class53.field963.method1600(-95, class225.field4061 + var2);
            class53.field963.method1602(var5, false);
            class53.field963.method1608(class123.field2044, false);
            class53.field963.method1558(100, class176.field3021);
            class53.field963.method1608(var3 + class193.field3474, false);
        }
        if (var4 == 6) {
            class53.field963.method1096(127, 0);
            class266.field4709++;
            class53.field963.method1616(0, var3);
            class53.field963.method1602(var2, false);
            class53.field963.method1602(var5, false);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 37) {
            class10.method73(var6, 15, var3, var2);
            class53.field963.method1096(72, 0);
            class104.field1710++;
            class53.field963.method1608((int) (var6 >>> 32) & Integer.MAX_VALUE, false);
            class53.field963.method1602(class225.field4061 + var2, false);
            class53.field963.method1602(var3 + class193.field3474, false);
        }
        if (var4 == 33) {
            class256.method1773((byte) -60);
        }
        if (var4 == 1) {
            class10.method73(var6, 15, var3, var2);
            class53.field963.method1096(51, 0);
            class90.field1458++;
            class53.field963.method1602(class225.field4061 + var2, false);
            class53.field963.method1602(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class53.field963.method1600(109, var3 + class193.field3474);
        }
        if (var4 == 1001) {
            class33 var32 = class233.method1646(5877, var3);
            if (var32 == null || var32.field631[var2] < 100000) {
                class53.field963.method1096(130, 0);
                class71.field1244++;
                class53.field963.method1600(-75, var5);
            } else {
                class47.method320(class228.method1629(new class191[] { class92.method563(-107, var32.field631[var2]), class156.field2669, class100.method623(-1, var5).field2529 }, (byte) -49), class26.field385, 0, -1);
            }
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 39) {
            class118.field1939++;
            class53.field963.method1096(189, 0);
            class53.field963.method1558(119, var5);
            class53.field963.method1576(30289, var3);
            class53.field963.method1558(-8, var2);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 1005) {
            class199.field3546 = class50.field897;
            class115.field1907++;
            class242.field4327 = 2;
            class126.field2091 = class104.field1709;
            class162.field2749 = 0;
            class53.field963.method1096(22, 0);
            class53.field963.method1600(-102, var5);
        }
        if (var4 == 16) {
            class261.field4610++;
            class53.field963.method1096(0, 0);
            class53.field963.method1558(103, var2);
            class53.field963.method1616(0, var3);
            class53.field963.method1558(93, var5);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 44) {
            class199.field3530++;
            class53.field963.method1096(242, 0);
            class53.field963.method1558(95, var5);
            class53.field963.method1558(-8, var2);
            class53.field963.method1616(0, var3);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 26) {
            class51.field930++;
            boolean var33 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 117);
            if (!var33) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 105);
            }
            class199.field3546 = class50.field897;
            class242.field4327 = 2;
            class162.field2749 = 0;
            class126.field2091 = class104.field1709;
            class53.field963.method1096(120, 0);
            class53.field963.method1600(-103, var5);
            class53.field963.method1558(-13, class193.field3474 + var3);
            class53.field963.method1608(var2 + class225.field4061, false);
        }
        if (var4 == 7) {
            class10.method73(var6, 15, var3, var2);
            class53.field963.method1096(133, 0);
            class260.field4593++;
            class53.field963.method1558(-88, var3 + class193.field3474);
            class53.field963.method1602((int) (var6 >>> 32) & Integer.MAX_VALUE, false);
            class53.field963.method1602(class225.field4061 + var2, false);
        }
        if (var4 == 30) {
            class156 var35 = class115.field1901[var5];
            if (var35 != null) {
                class97.method604(1, var35.field3014[0], class175.field2946.field2953[0], var35.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 106);
                class199.field3546 = class50.field897;
                class162.field2749 = 0;
                class126.field2091 = class104.field1709;
                class242.field4327 = 2;
                class53.field963.method1096(78, 0);
                class153.field2625++;
                class53.field963.method1558(-50, class123.field2044);
                class53.field963.method1602(class176.field3021, false);
                class53.field963.method1608(var5, false);
                class53.field963.method1557(class70.field1235, -117);
            }
        }
        if (var4 == 35) {
            class33 var36 = class10.method74(var3, var2, (byte) 122);
            if (var36 != null) {
                class266.method1825((byte) -88);
                class262.method1803(var3, var2, 14854, class40.method268(127, client.method668(var36)));
                class192.field3446 = 0;
                class14.field171 = class179.method1200(var36, true);
                if (class14.field171 == null) {
                    class14.field171 = class271.field4781;
                }
                if (var36.field591) {
                    class45.field806 = class228.method1629(new class191[] { var36.field565, class223.field3980 }, (byte) -33);
                    return;
                }
                class45.field806 = class228.method1629(new class191[] { class16.field211, var36.field601, class223.field3980 }, (byte) -128);
            }
            return;
        }
        if (var4 == 38) {
            class76 var37 = class245.field4357[var5];
            if (var37 != null) {
                class97.method604(1, var37.field3014[0], class175.field2946.field2953[0], var37.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 125);
                class126.field2091 = class104.field1709;
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class162.field2749 = 0;
                class53.field963.method1096(3, 0);
                class228.field4106++;
                class53.field963.method1608(var5, false);
            }
        }
        if (var4 == 19) {
            class53.field963.method1096(92, 0);
            class53.field963.method1608(var5, false);
            class53.field963.method1616(0, var3);
            class53.field963.method1600(-53, var2);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class265.field4696++;
            class76.field1297 = var2;
        }
        if (var4 == 15 && class10.method73(var6, 15, var3, var2)) {
            class53.field963.method1096(237, 0);
            class53.field963.method1616(0, class70.field1235);
            class158.field2690++;
            class53.field963.method1602(class193.field3474 + var3, false);
            class53.field963.method1600(-103, class176.field3021);
            class53.field963.method1600(-43, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class53.field963.method1602(class123.field2044, false);
            class53.field963.method1608(class225.field4061 + var2, false);
        }
        if (var4 == 40) {
            class53.field963.method1096(62, 0);
            class53.field963.method1576(30289, var3);
            class184.field3198++;
            class33 var38 = class233.method1646(5877, var3);
            if (var38.field461 != null && var38.field461[0][0] == 5) {
                int var39 = var38.field461[0][1];
                class164.field2778[var39] = 1 - class164.field2778[var39];
                class179.method1204(false, var39);
            }
        }
        if (var4 == 25) {
            class156 var40 = class115.field1901[var5];
            if (var40 != null) {
                class215.field3787++;
                class97.method604(1, var40.field3014[0], class175.field2946.field2953[0], var40.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 87);
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class126.field2091 = class104.field1709;
                class162.field2749 = 0;
                class53.field963.method1096(199, 0);
                class53.field963.method1558(-119, var5);
            }
        }
        if (var4 == 20) {
            class226.field4071++;
            boolean var41 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 107);
            if (!var41) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 107);
            }
            class126.field2091 = class104.field1709;
            class242.field4327 = 2;
            class162.field2749 = 0;
            class199.field3546 = class50.field897;
            class53.field963.method1096(192, 0);
            class53.field963.method1608(var5, false);
            class53.field963.method1600(106, class193.field3474 + var3);
            class53.field963.method1558(-123, class225.field4061 + var2);
        }
        if (var4 == 9) {
            class115.method731(class261.field4598, var2, var3);
        }
        if (var4 == 47) {
            class49.field867 = true;
            class115.method731(class261.field4598, var2, var3);
        }
        if (var4 == 17) {
            class156 var43 = class115.field1901[var5];
            if (var43 != null) {
                class97.method604(1, var43.field3014[0], class175.field2946.field2953[0], var43.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 118);
                class126.field2091 = class104.field1709;
                class162.field2749 = 0;
                class242.field4327 = 2;
                class199.field3546 = class50.field897;
                class176.field2996++;
                class53.field963.method1096(8, 0);
                class53.field963.method1602(var5, false);
            }
        }
        if (var4 == 14) {
            class245.field4356++;
            boolean var44 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 105);
            if (!var44) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 125);
            }
            class242.field4327 = 2;
            class126.field2091 = class104.field1709;
            class199.field3546 = class50.field897;
            class162.field2749 = 0;
            class53.field963.method1096(176, 0);
            class53.field963.method1608(var2 + class225.field4061, false);
            class53.field963.method1558(107, class193.field3474 + var3);
            class53.field963.method1558(111, var5);
        }
        if (var4 == 3 && class10.method73(var6, 15, var3, var2)) {
            client.field1727++;
            class53.field963.method1096(234, 0);
            class53.field963.method1557(class3.field21, 99);
            class53.field963.method1558(98, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class53.field963.method1602(var3 + class193.field3474, false);
            class53.field963.method1608(class225.field4061 + var2, false);
            class53.field963.method1600(111, class36.field659);
        }
        if (var4 == 41) {
            class216.field3814++;
            boolean var46 = class97.method604(0, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 0, false, 92);
            if (!var46) {
                class97.method604(1, var3, class175.field2946.field2953[0], var2, 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 96);
            }
            class242.field4327 = 2;
            class162.field2749 = 0;
            class126.field2091 = class104.field1709;
            class199.field3546 = class50.field897;
            class53.field963.method1096(208, 0);
            class53.field963.method1600(96, class36.field659);
            class53.field963.method1608(var3 + class193.field3474, false);
            class53.field963.method1600(-79, var5);
            class53.field963.method1600(-126, class225.field4061 + var2);
            class53.field963.method1557(class3.field21, 112);
        }
        if (var4 == 10) {
            class42.field744++;
            class53.field963.method1096(144, 0);
            class53.field963.method1576(30289, var3);
            class53.field963.method1600(-59, var2);
            class53.field963.method1608(var5, false);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 28) {
            class53.field963.method1096(136, 0);
            class53.field963.method1608(var5, false);
            class53.field963.method1608(var2, false);
            class53.field963.method1576(30289, var3);
            class138.field2318 = 0;
            class184.field3200++;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 8) {
            class200.field3567++;
            class53.field963.method1096(161, 0);
            class53.field963.method1576(30289, var3);
            class53.field963.method1600(-84, var5);
            class53.field963.method1558(116, class36.field659);
            class53.field963.method1558(97, var2);
            class53.field963.method1565(class3.field21, true);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 45) {
            class10.method73(var6, 15, var3, var2);
            class61.field1094++;
            class53.field963.method1096(116, 0);
            class53.field963.method1602(class193.field3474 + var3, false);
            class53.field963.method1600(-47, class225.field4061 + var2);
            class53.field963.method1600(85, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 12) {
            class156 var48 = class115.field1901[var5];
            if (var48 != null) {
                class240.field4266++;
                class97.method604(1, var48.field3014[0], class175.field2946.field2953[0], var48.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 125);
                class199.field3546 = class50.field897;
                class126.field2091 = class104.field1709;
                class162.field2749 = 0;
                class242.field4327 = 2;
                class53.field963.method1096(201, 0);
                class53.field963.method1608(var5, false);
            }
        }
        if (var4 == 23) {
            class76 var49 = class245.field4357[var5];
            if (var49 != null) {
                class97.method604(1, var49.field3014[0], class175.field2946.field2953[0], var49.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 100);
                class199.field3546 = class50.field897;
                class162.field2749 = 0;
                class126.field2091 = class104.field1709;
                class152.field2609++;
                class242.field4327 = 2;
                class53.field963.method1096(47, 0);
                class53.field963.method1602(var5, false);
            }
        }
        if (var4 == 34) {
            class76 var50 = class245.field4357[var5];
            if (var50 != null) {
                class32.field446++;
                class97.method604(1, var50.field3014[0], class175.field2946.field2953[0], var50.field2953[0], 0, 0, 2, 0, class175.field2946.field3014[0], 1, false, 105);
                class162.field2749 = 0;
                class199.field3546 = class50.field897;
                class242.field4327 = 2;
                class126.field2091 = class104.field1709;
                class53.field963.method1096(235, 0);
                class53.field963.method1608(class36.field659, false);
                class53.field963.method1600(-107, var5);
                class53.field963.method1576(30289, class3.field21);
            }
        }
        if (var4 == 22) {
            class62.field1112++;
            class53.field963.method1096(135, 0);
            class53.field963.method1576(30289, var3);
            class53.field963.method1558(-60, var2);
            class53.field963.method1602(var5, false);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (var4 == 21) {
            class118.field1938++;
            class53.field963.method1096(35, 0);
            class53.field963.method1608(var2, false);
            class53.field963.method1565(var3, true);
            class53.field963.method1600(110, var5);
            class138.field2318 = 0;
            class193.field3475 = class233.method1646(5877, var3);
            class76.field1297 = var2;
        }
        if (class192.field3446 != 0) {
            class192.field3446 = 0;
            class184.method1238(class233.method1646(5877, class70.field1235), (byte) -28);
        }
        if (class197.field3523) {
            class266.method1825((byte) -81);
        }
        if (class193.field3475 != null && class138.field2318 == 0) {
            class184.method1238(class193.field3475, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method682(int arg0) {
        field1764 = null;
        field1763 = null;
        if (arg0 == 2) {
            field1769 = null;
            field1768 = null;
            field1770 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Le;")
    public static final class191 method683(int arg0, int arg1) {
        field1766++;
        if (arg0 != -8029) {
            method683(107, -95);
        }
        return class33.field475[arg1].method1304(63) <= 0 ? class170.field2881[arg1] : class228.method1629(new class191[] { class170.field2881[arg1], class179.field3077, class33.field475[arg1] }, (byte) -84);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Color;ZIILe;)V")
    public static final void method684(Color arg0, boolean arg1, int arg2, int arg3, class191 arg4) {
        field1767++;
        try {
            Graphics var5 = class51.field909.getGraphics();
            if (class25.field366 == null) {
                class25.field366 = new Font("Helvetica", 1, 13);
                class181.field3104 = class51.field909.getFontMetrics(class25.field366);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class200.field3584, class190.field3337);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class135.field2282 == null) {
                    class135.field2282 = class51.field909.createImage(304, 34);
                }
                Graphics var6 = class135.field2282.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class25.field366);
                var6.setColor(Color.white);
                arg4.method1306(arg2 ^ arg2, (304 - arg4.method1340((byte) -110, class181.field3104)) / 2, var6, 22);
                var5.drawImage(class135.field2282, class200.field3584 / 2 - 152, class190.field3337 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class200.field3584 / 2 - 152;
                int var8 = class190.field3337 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - (arg3 * 3), 30);
                var5.setFont(class25.field366);
                var5.setColor(Color.white);
                arg4.method1306(arg2 + 2343, var7 + (-arg4.method1340((byte) 50, class181.field3104) + 304) / 2, var5, var8 + 22);
            }
            if (class184.field3223 != null) {
                var5.setFont(class25.field366);
                var5.setColor(Color.white);
                class184.field3223.method1306(0, class200.field3584 / 2 - class184.field3223.method1340((byte) 107, class181.field3104) / 2, var5, class190.field3337 / 2 - 26);
            }
        } catch (Exception var10) {
            class51.field909.repaint();
        }
    }
}
