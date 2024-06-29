import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class84 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Lli;")
    public static class185 field1657 = class245.method1649("M", -43);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lli;")
    public static class185[] field1658 = new class185[8];

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lli;")
    public static class185 field1662 = class245.method1649("Fps:", 122);

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1660 = 0;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1664 = 1;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lli;")
    public static class185 field1661 = class245.method1649("zap", 126);

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1666 = 2;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V")
    public static final void method551(int arg0, long arg1) {
        field1656++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class126.field2253 < 100 || class146.field2776) || class126.field2253 >= 200) {
            class1.method5(class20.field336, 0, true, class128.field2287);
            return;
        }
        class185 var3 = class271.method1859((byte) -108, arg1).method1334(38);
        for (int var4 = 0; var4 < class126.field2253; var4++) {
            if (class259.field4602[var4] == arg1) {
                class1.method5(class20.field336, 0, true, class87.method567(-11039, new class185[] { var3, class268.field4746 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class127.field2276; var5++) {
            if (class165.field3088[var5] == arg1) {
                class1.method5(class20.field336, 0, true, class87.method567(-11039, new class185[] { class6.field140, var3, class267.field4733 }));
                return;
            }
        }
        if (var3.method1329(class241.field4310.field3514, (byte) 22)) {
            class1.method5(class20.field336, 0, true, class117.field2090);
            return;
        }
        class128.field2290[class126.field2253] = var3;
        class259.field4602[class126.field2253] = arg1;
        class138.field2590[class126.field2253] = 0;
        class80.field1393++;
        class82.field1535[class126.field2253] = class20.field336;
        class194.field3580[class126.field2253] = 0;
        class127.field2267[class126.field2253] = false;
        class130.field2323 = class38.field593;
        int var6 = -19 % ((arg0 + 49) / 55);
        class126.field2253++;
        class182.field3349.method577(229, 0);
        class182.field3349.method870(arg1, (byte) 122);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method552(int arg0) {
        class274.field4863++;
        class182.field3349.method577(7, 0);
        field1659++;
        class182.field3349.method856(31133, class179.field3300);
        if (arg0 != 4944) {
            method554((byte) 96);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1662 = null;
        if (arg0 != -16977) {
            field1657 = null;
        }
        field1657 = null;
        field1658 = null;
        field1661 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method554(byte arg0) {
        field1663++;
        if (arg0 > -37) {
            method553(-89);
        }
        for (int var1 = 0; var1 < class148.field2789; var1++) {
            int var2 = class80.field1404[var1];
            class71 var3 = class87.field1712[var2];
            int var4 = class142.field2669.method867(false);
            if ((var4 & 0x80) != 0) {
                if (var3.field1236.method533(false)) {
                    class151.method1075((byte) -108, var3);
                }
                var3.method467(class269.method1828(2, class142.field2669.method831((byte) -93)), 42);
                var3.method1015(var3.field1236.field1452, 10672);
                var3.field2719 = var3.field1236.field1424;
                var3.field2705 = var3.field1236.field1421;
                var3.field2648 = var3.field1236.field1406;
                var3.field2716 = var3.field1236.field1437;
                var3.field2666 = var3.field1236.field1473;
                var3.field2699 = var3.field1236.field1440;
                var3.field2700 = var3.field1236.field1467;
                var3.field2693 = var3.field1236.field1468;
                if (var3.field1236.method533(false)) {
                    class117.method816(0, class265.field4703, var3, var3.field2651[0], (class188) null, 20807, (class135) null, var3.field2720[0]);
                }
            }
            if ((var4 & 0x1) != 0) {
                boolean var5 = true;
                int var6 = class142.field2669.method872(16);
                int var7 = class142.field2669.method875((byte) 67);
                if (var6 == 65535) {
                    var6 = -1;
                }
                if (var6 != -1 && var3.field2709 != -1 && class253.method1712(class255.method1728(var6, (byte) 95).field4193, -123).field32 < class253.method1712(class255.method1728(var3.field2709, (byte) 95).field4193, -124).field32) {
                    var5 = false;
                }
                if (var5) {
                    var3.field2674 = var7 >> 16;
                    var3.field2709 = var6;
                    var3.field2703 = (var7 & 0xFFFF) + class211.field3851;
                    var3.field2656 = 0;
                    if (class211.field3851 < var3.field2703) {
                        var3.field2656 = -1;
                    }
                    var3.field2664 = 0;
                    if (var3.field2709 != -1 && class211.field3851 == var3.field2703) {
                        int var8 = class255.method1728(var3.field2709, (byte) 95).field4193;
                        if (var8 != -1) {
                            class2 var9 = class253.method1712(var8, -121);
                            if (var9 != null && var9.field37 != null) {
                                class31.method188(-1, var9, var3.field2687, false, 0, var3.field2694);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var10 = class142.field2669.method867(false);
                int var11 = class142.field2669.method867(false);
                var3.method1016(var11, var10, class211.field3851, false);
                var3.field2688 = class211.field3851 + 300;
                var3.field2675 = class142.field2669.method832((byte) 46);
            }
            if ((var4 & 0x4) != 0) {
                var3.field2713 = class142.field2669.method865(9199);
                var3.field2657 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var12 = class142.field2669.method851(2096);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class142.field2669.method832((byte) -123);
                class72.method468(var13, var12, var3, (byte) -106);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2717 = class142.field2669.method827(255);
                var3.field2649 = class142.field2669.method851(2096);
            }
            if ((var4 & 0x20) != 0) {
                var3.field2665 = class142.field2669.method872(16);
                if (var3.field2665 == 65535) {
                    var3.field2665 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var14 = class142.field2669.method854((byte) 79);
                int var15 = class142.field2669.method867(false);
                var3.method1016(var15, var14, class211.field3851, false);
            }
        }
    }
}
