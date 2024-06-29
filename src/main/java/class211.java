import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class211 extends class45 {

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field2803 = new String[100];

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Lps;")
    public static class394 field2807 = null;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lcr;")
    public static class189 field2816 = new class189(100);

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
    public static boolean field2820 = false;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "Lcr;")
    public static class189 field2822 = new class189(260);

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "[[Z")
    public static boolean[][] field2828 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2829 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "F")
    public static float field2825;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public int field2827;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lod;")
    public class137 field2809;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Lig;")
    public class13 field2813;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Lon;")
    public class35 field2824;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lvl;")
    public class374 field2804;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
    public static boolean field2800;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Z")
    public static boolean field2801;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "[[Z")
    public static boolean[][] field2799;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Lnd;")
    public static final class413 method1256(boolean arg0) {
        field2810++;
        class413 var1 = (class413) class435.field6390.method997(false);
        if (var1 == null) {
            if (!arg0) {
                method1256(false);
            }
            return new class413();
        } else {
            class393.field5628--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILdr;)V")
    public static final void method1257(int arg0, class212 arg1) {
        field2826++;
        if (arg1 == null || class321.field4726.field663 == arg1) {
            return;
        }
        int var2 = arg1.field2837;
        int var3 = arg1.field2831;
        int var4 = arg1.field2836;
        int var5 = (int) arg1.field2830;
        long var6 = arg1.field2830;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 31) {
            class43 var8 = class306.field4496[var5];
            if (var8 != null) {
                class152.field2062 = class319.field4668;
                class117.field1652 = 0;
                class162.field2175++;
                class414.field6086 = class32.field453;
                class384.field5563 = 2;
                class185.field2507.method5(-6445, 166);
                class185.field2507.method1362(118, class30.field437[82] ? 1 : 0);
                class185.field2507.method1339(var5, -16777216);
                class254.method1552(0, var8.field4360[0], -2, var8.field4362[0], class227.field2988.field4362[0], var8.method168(arg0 ^ 0xFFFF8F74), -2, true, 0, class227.field2988.field4360[0], var8.method168(-118));
            }
        }
        if (var4 == 1011) {
            class152.field2062 = class319.field4668;
            class117.field1652 = 0;
            class384.field5563 = 2;
            class414.field6086 = class32.field453;
            class43 var9 = class306.field4496[var5];
            if (var9 != null) {
                class249 var10 = var9.field606;
                if (var10.field3375 != null) {
                    var10 = var10.method1510(30);
                }
                if (var10 != null) {
                    class185.field2507.method5(-6445, 132);
                    class372.field5411++;
                    class185.field2507.method1326(var10.field3407, arg0 - 28987);
                }
            }
        }
        if (var4 == 1006) {
            class152.field2062 = class319.field4668;
            class367.field5305++;
            class117.field1652 = 0;
            class414.field6086 = class32.field453;
            class384.field5563 = 2;
            class185.field2507.method5(-6445, 125);
            class185.field2507.method1379(-127, class200.field2660 + var3);
            class185.field2507.method1362(120, class30.field437[82] ? 1 : 0);
            class185.field2507.method1339(class7.field138 + var2, -16777216);
            class185.field2507.method1339(Integer.MAX_VALUE & (int) (var6 >>> 32), arg0 ^ 0xFF0070E5);
            class99.method672((byte) -62, var3, var2, var6);
        }
        if (var4 == 4) {
            class384.field5563 = 1;
            class414.field6086 = class32.field453;
            class145.field1980++;
            class117.field1652 = 0;
            class152.field2062 = class319.field4668;
            class185.field2507.method5(arg0 ^ 0xFFFF9636, 84);
            class185.field2507.method1352(class442.field6471, arg0 ^ 0x92073BF5);
            class185.field2507.method1379(arg0 - 28985, class306.field4506);
            class185.field2507.method1339(class7.field138 + var2, -16777216);
            class185.field2507.method1339(class200.field2660 + var3, -16777216);
            class254.method1552(0, var2, -4, var3, class227.field2988.field4362[0], 1, -2, true, 0, class227.field2988.field4360[0], 1);
        }
        if (var4 == 23) {
            class185.field2507.method5(-6445, 76);
            class62.field826++;
            class185.field2507.method1330(var3, arg0 - 28863);
            class185.field2507.method1379(-104, var2);
            class185.field2507.method1324(var5, (byte) 111);
            class17.field247 = 0;
            class318.field4648 = class196.method1168((byte) -118, var3);
            class298.field4274 = var2;
        }
        if (var4 == 24) {
            class43 var11 = class306.field4496[var5];
            if (var11 != null) {
                class414.field6086 = class32.field453;
                class48.field676++;
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class384.field5563 = 2;
                class185.field2507.method5(-6445, 36);
                class185.field2507.method1369(class30.field437[82] ? 1 : 0, 35);
                class185.field2507.method1326(var5, 121);
                class254.method1552(0, var11.field4360[0], -2, var11.field4362[0], class227.field2988.field4362[0], var11.method168(arg0 ^ 0xFFFF8F6B), -2, true, 0, class227.field2988.field4360[0], var11.method168(-115));
            }
        }
        if (var4 == 29) {
            class25 var12 = class206.field2777[var5];
            if (var12 != null) {
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class414.field6086 = class32.field453;
                class384.field5563 = 2;
                class192.field2564++;
                class185.field2507.method5(-6445, 27);
                class185.field2507.method1346(class30.field437[82] ? 1 : 0, 32767);
                class185.field2507.method1324(var5, (byte) 101);
                class254.method1552(0, var12.field4360[0], -2, var12.field4362[0], class227.field2988.field4362[0], var12.method168(-112), arg0 ^ 0xFFFF8F1B, true, 0, class227.field2988.field4360[0], var12.method168(-125));
            }
        }
        if (var4 == 60) {
            if (class185.field2510 > 0 && class30.field437[82] && class30.field437[81]) {
                class316.method2134(class7.field138 + var2, class200.field2660 + var3, class227.field2981, -127);
            } else {
                class270.method1845(var3, var2, (byte) 42, var5);
                if (var5 == 1) {
                    class185.field2507.method1346(-1, arg0 + 3866);
                    class185.field2507.method1346(-1, 32767);
                    class185.field2507.method1326((int) class396.field5847, -97);
                    class185.field2507.method1346(57, 32767);
                    class185.field2507.method1346(class399.field5948, 32767);
                    class185.field2507.method1346(class364.field5261, 32767);
                    class185.field2507.method1346(89, 32767);
                    class185.field2507.method1326(class227.field2988.field740, -108);
                    class185.field2507.method1326(class227.field2988.field734, arg0 ^ 0xFFFF8F41);
                    class185.field2507.method1346(63, 32767);
                } else {
                    class414.field6086 = class32.field453;
                    class384.field5563 = 1;
                    class117.field1652 = 0;
                    class152.field2062 = class319.field4668;
                }
                class254.method1552(0, var2, -4, var3, class227.field2988.field4362[0], 1, -2, true, 0, class227.field2988.field4360[0], 1);
            }
        }
        if (var4 == 32) {
            class240.method1444((byte) 3, var3, var2);
        }
        if (var4 == 3) {
            class384.field5563 = 2;
            class414.field6086 = class32.field453;
            class12.field191++;
            class152.field2062 = class319.field4668;
            class117.field1652 = 0;
            class185.field2507.method5(-6445, 68);
            class185.field2507.method1366(class377.field5495, (byte) 122);
            class185.field2507.method1339(class215.field2863, -16777216);
            class185.field2507.method1379(arg0 ^ 0xFFFF8F79, var3 + class200.field2660);
            class185.field2507.method1362(117, class30.field437[82] ? 1 : 0);
            class185.field2507.method1339(var5, -16777216);
            class185.field2507.method1379(arg0 ^ 0xFFFF8F41, class7.field138 + var2);
            class185.field2507.method1324(class145.field1979, (byte) 91);
            class179.method1093(var2, var3, (byte) -126);
        }
        if (var4 == 50) {
            class43 var13 = class306.field4496[var5];
            if (var13 != null) {
                class384.field5563 = 2;
                class414.field6086 = class32.field453;
                class410.field6063++;
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class185.field2507.method5(-6445, 72);
                class185.field2507.method1379(-118, class145.field1979);
                class185.field2507.method1326(var5, 104);
                class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 84);
                class185.field2507.method1338(58, class377.field5495);
                class185.field2507.method1326(class215.field2863, 26);
                class254.method1552(0, var13.field4360[0], -2, var13.field4362[0], class227.field2988.field4362[0], var13.method168(-120), -2, true, 0, class227.field2988.field4360[0], var13.method168(-114));
            }
        }
        if (var4 == 30) {
            class185.field2507.method5(-6445, 102);
            class369.field5335++;
            class185.field2507.method1330(var3, -104);
            class185.field2507.method1326(var2, -126);
            class185.field2507.method1326(var5, -105);
            class17.field247 = 0;
            class318.field4648 = class196.method1168((byte) -89, var3);
            class298.field4274 = var2;
        }
        if (var4 == 44) {
            class414.field6086 = class32.field453;
            class117.field1652 = 0;
            class124.field1739++;
            class384.field5563 = 2;
            class152.field2062 = class319.field4668;
            class185.field2507.method5(-6445, 81);
            class185.field2507.method1339(class7.field138 + var2, -16777216);
            class185.field2507.method1379(-92, var5);
            class185.field2507.method1369(class30.field437[82] ? 1 : 0, 106);
            class185.field2507.method1339(class200.field2660 + var3, arg0 ^ 0xFF0070E5);
            class179.method1093(var2, var3, (byte) -124);
        }
        if (var4 == 5) {
            class7.field132++;
            class185.field2507.method5(arg0 ^ 0xFFFF9636, 140);
            class185.field2507.method1330(var3, -122);
            class185.field2507.method1339(class306.field4506, arg0 ^ 0xFF0070E5);
            class185.field2507.method1326(var5, 75);
            class185.field2507.method1339(var2, -16777216);
            class185.field2507.method1352(class442.field6471, -1845015792);
            class17.field247 = 0;
            class318.field4648 = class196.method1168((byte) -99, var3);
            class298.field4274 = var2;
        }
        if (var4 == 34) {
            class151.method946(arg0 - 28774);
            class394 var14 = class196.method1168((byte) -98, var3);
            class215.field2863 = var2;
            class63.field844 = 1;
            class377.field5495 = var3;
            class145.field1979 = var5;
            class407.method2621(var14, 15);
            class156.field2125 = "<col=ff9040>" + class9.method74(var5, (byte) -36).field1193 + "<col=ffffff>";
            if (class156.field2125 == null) {
                class156.field2125 = "null";
            }
        } else if (var4 == 39) {
            class394 var15 = class388.method2492((byte) 102, var2, var3);
            if (var15 != null) {
                class151.method946(110);
                class304 var16 = client.method1544(var15);
                class213.method1264(var16.method2066((byte) -125), true, var2, var15.field5748, var15.field5716, var3, var16.field4474);
                class63.field844 = 0;
                class394.field5739 = class40.method287(var15, -1);
                if (var15.field5790) {
                    class375.field5454 = var15.field5687 + "<col=ffffff>";
                } else {
                    class375.field5454 = "<col=00ff00>" + var15.field5788 + "<col=ffffff>";
                }
                if (class394.field5739 == null) {
                    class394.field5739 = "Null";
                }
            }
        } else {
            if (var4 == 59) {
                class152.field2062 = class319.field4668;
                class117.field1652 = 0;
                class248.field3338++;
                class384.field5563 = 2;
                class414.field6086 = class32.field453;
                class185.field2507.method5(arg0 - 35346, 10);
                class185.field2507.method1379(-104, var2 + class7.field138);
                class185.field2507.method1326(var5, 125);
                class185.field2507.method1362(124, class30.field437[82] ? 1 : 0);
                class185.field2507.method1326(var3 + class200.field2660, -69);
                class179.method1093(var2, var3, (byte) -124);
            }
            if (var4 == 47) {
                class212.field2833++;
                class185.field2507.method5(arg0 - 35346, 218);
                class185.field2507.method1330(var3, -88);
                class185.field2507.method1324(var5, (byte) 120);
                class185.field2507.method1324(var2, (byte) 123);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -74, var3);
                class298.field4274 = var2;
            }
            if (var4 == 2) {
                class185.field2507.method5(-6445, 48);
                class55.field731++;
                class185.field2507.method1330(var3, arg0 ^ 0xFFFF8F6E);
                class185.field2507.method1339(var2, -16777216);
                class185.field2507.method1326(var5, -85);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -106, var3);
                class298.field4274 = var2;
            }
            if (var4 == 28) {
                class152.field2062 = class319.field4668;
                class143.field1937++;
                class117.field1652 = 0;
                class384.field5563 = 2;
                class414.field6086 = class32.field453;
                class185.field2507.method5(arg0 - 35346, 150);
                class185.field2507.method1324(class7.field138 + var2, (byte) 92);
                class185.field2507.method1324(var3 + class200.field2660, (byte) 119);
                class185.field2507.method1362(arg0 - 28774, class30.field437[82] ? 1 : 0);
                class185.field2507.method1326(Integer.MAX_VALUE & (int) (var6 >>> 32), -74);
                class99.method672((byte) -62, var3, var2, var6);
            }
            if (var4 == 7) {
                class25 var17 = class206.field2777[var5];
                if (var17 != null) {
                    class414.field6086 = class32.field453;
                    class152.field2062 = class319.field4668;
                    class384.field5563 = 2;
                    class117.field1652 = 0;
                    class195.field2613++;
                    class185.field2507.method5(arg0 - 35346, 49);
                    class185.field2507.method1346(class30.field437[82] ? 1 : 0, 32767);
                    class185.field2507.method1339(var5, -16777216);
                    class254.method1552(0, var17.field4360[0], -2, var17.field4362[0], class227.field2988.field4362[0], var17.method168(arg0 - 29011), -2, true, 0, class227.field2988.field4360[0], var17.method168(-113));
                }
            }
            if (var4 == 16) {
                class230.method1383((byte) -100, false);
            }
            if (var4 == 58) {
                class185.field2507.method5(-6445, 47);
                class178.field2348++;
                class185.field2507.method1330(var3, -108);
                class394 var18 = class196.method1168((byte) -128, var3);
                if (var18.field5761 != null && var18.field5761[0][0] == 5) {
                    int var19 = var18.field5761[0][1];
                    class191.field2561[var19] = 1 - class191.field2561[var19];
                    class264.method1815(arg0 - 24971, var19);
                }
            }
            if (var4 == 33) {
                class414.field6086 = class32.field453;
                class291.field4166++;
                class152.field2062 = class319.field4668;
                class117.field1652 = 0;
                class384.field5563 = 2;
                class185.field2507.method5(-6445, 34);
                class185.field2507.method1326(Integer.MAX_VALUE & (int) (var6 >>> 32), 28);
                class185.field2507.method1369(class30.field437[82] ? 1 : 0, -121);
                class185.field2507.method1339(class200.field2660 + var3, -16777216);
                class185.field2507.method1339(class7.field138 + var2, arg0 + -16806117);
                class99.method672((byte) -62, var3, var2, var6);
            }
            if (var4 == 26) {
                class43 var20 = class306.field4496[var5];
                if (var20 != null) {
                    class317.field4646++;
                    class117.field1652 = 0;
                    class152.field2062 = class319.field4668;
                    class384.field5563 = 2;
                    class414.field6086 = class32.field453;
                    class185.field2507.method5(arg0 - 35346, 63);
                    class185.field2507.method1326(var5, arg0 - 28817);
                    class185.field2507.method1362(118, class30.field437[82] ? 1 : 0);
                    class254.method1552(0, var20.field4360[0], -2, var20.field4362[0], class227.field2988.field4362[0], var20.method168(-125), -2, true, 0, class227.field2988.field4360[0], var20.method168(-121));
                }
            }
            if (var4 == 12) {
                class117.field1652 = 0;
                class414.field6086 = class32.field453;
                class353.field5118++;
                class152.field2062 = class319.field4668;
                class384.field5563 = 2;
                class185.field2507.method5(-6445, 13);
                class185.field2507.method1326(class7.field138 + var2, 94);
                class185.field2507.method1339(var5, -16777216);
                class185.field2507.method1379(-104, class200.field2660 + var3);
                class185.field2507.method1362(118, class30.field437[82] ? 1 : 0);
                class179.method1093(var2, var3, (byte) -127);
            }
            if (var4 == 10) {
                class185.field2507.method5(arg0 ^ 0xFFFF9636, 160);
                class439.field6451++;
                class185.field2507.method1330(var3, 74);
                class185.field2507.method1326(var2, -86);
                class185.field2507.method1326(var5, -78);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -102, var3);
                class298.field4274 = var2;
            }
            if (var4 == 36 || var4 == 1003) {
                class403.method2601(var2, var3, var5, arg1.field2838, (byte) 123);
            }
            if (var4 == 19) {
                class185.field2507.method5(-6445, 71);
                class312.field4568++;
                class185.field2507.method1330(var3, -118);
                class185.field2507.method1324(var5, (byte) 110);
                class185.field2507.method1379(-124, var2);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -113, var3);
                class298.field4274 = var2;
            }
            if (var4 == 43) {
                class43 var21 = class306.field4496[var5];
                if (var21 != null) {
                    class281.field4073++;
                    class384.field5563 = 2;
                    class117.field1652 = 0;
                    class414.field6086 = class32.field453;
                    class152.field2062 = class319.field4668;
                    class185.field2507.method5(-6445, 135);
                    class185.field2507.method1352(class442.field6471, -1845015792);
                    class185.field2507.method1326(class306.field4506, -96);
                    class185.field2507.method1379(arg0 ^ 0xFFFF8F51, var5);
                    class185.field2507.method1362(arg0 ^ 0x7097, class30.field437[82] ? 1 : 0);
                    class254.method1552(0, var21.field4360[0], -2, var21.field4362[0], class227.field2988.field4362[0], var21.method168(-126), -2, true, 0, class227.field2988.field4360[0], var21.method168(-113));
                }
            }
            if (var4 == 21) {
                class43 var22 = class306.field4496[var5];
                if (var22 != null) {
                    class384.field5563 = 2;
                    class188.field2530++;
                    class152.field2062 = class319.field4668;
                    class117.field1652 = 0;
                    class414.field6086 = class32.field453;
                    class185.field2507.method5(-6445, 164);
                    class185.field2507.method1379(-118, var5);
                    class185.field2507.method1346(class30.field437[82] ? 1 : 0, 32767);
                    class254.method1552(0, var22.field4360[0], -2, var22.field4362[0], class227.field2988.field4362[0], var22.method168(-112), -2, true, 0, class227.field2988.field4360[0], var22.method168(-114));
                }
            }
            if (var4 == 51) {
                class185.field2507.method5(-6445, 115);
                class278.field4042++;
                class185.field2507.method1330(var3, 60);
                class185.field2507.method1324(var2, (byte) 113);
                class185.field2507.method1324(var5, (byte) 86);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -84, var3);
                class298.field4274 = var2;
            }
            if (var4 == 22) {
                class185.field2507.method5(-6445, 35);
                class296.field4242++;
                class185.field2507.method1330(var3, -95);
                class185.field2507.method1338(arg0 - 28814, class377.field5495);
                class185.field2507.method1379(arg0 ^ 0xFFFF8F63, class145.field1979);
                class185.field2507.method1324(var5, (byte) 98);
                class185.field2507.method1324(class215.field2863, (byte) 116);
                class185.field2507.method1326(var2, 54);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -93, var3);
                class298.field4274 = var2;
            }
            if (var4 == 1008) {
                class414.field6086 = class32.field453;
                class273.field3957++;
                class152.field2062 = class319.field4668;
                class384.field5563 = 2;
                class117.field1652 = 0;
                class185.field2507.method5(-6445, 129);
                class185.field2507.method1326(var5, 80);
            }
            if (var4 == 48) {
                class152.field2062 = class319.field4668;
                class414.field6086 = class32.field453;
                class117.field1652 = 0;
                class384.field5563 = 2;
                class265.field3842++;
                class185.field2507.method5(-6445, 67);
                class185.field2507.method1324(class200.field2660 + var3, (byte) 123);
                class185.field2507.method1324(var5, (byte) 124);
                class185.field2507.method1346(class30.field437[82] ? 1 : 0, 32767);
                class185.field2507.method1339(class7.field138 + var2, -16777216);
                class179.method1093(var2, var3, (byte) -128);
            }
            if (var4 == 11) {
                if (class185.field2510 > 0 && class30.field437[82] && class30.field437[81]) {
                    class316.method2134(class7.field138 + var2, class200.field2660 - -var3, class227.field2981, -64);
                } else {
                    class152.field2062 = class319.field4668;
                    class339.field4884++;
                    class117.field1652 = 0;
                    class414.field6086 = class32.field453;
                    class384.field5563 = 1;
                    class185.field2507.method5(-6445, 154);
                    class185.field2507.method1339(class7.field138 + var2, -16777216);
                    class185.field2507.method1379(-108, class200.field2660 + var3);
                }
            }
            if (var4 == 6 && field2807 == null) {
                class353.method2320(false, var3, var2);
                field2807 = class388.method2492((byte) 34, var2, var3);
                class407.method2621(field2807, arg0 ^ 0x70EA);
            }
            if (var4 == 38) {
                class25 var23 = class206.field2777[var5];
                if (var23 != null) {
                    class414.field6086 = class32.field453;
                    class384.field5563 = 2;
                    class117.field1652 = 0;
                    class302.field4453++;
                    class152.field2062 = class319.field4668;
                    class185.field2507.method5(-6445, 167);
                    class185.field2507.method1379(arg0 ^ 0xFFFF8F65, var5);
                    class185.field2507.method1346(class30.field437[82] ? 1 : 0, arg0 ^ 0xF1A);
                    class254.method1552(0, var23.field4360[0], -2, var23.field4362[0], class227.field2988.field4362[0], var23.method168(-111), arg0 - 28903, true, 0, class227.field2988.field4360[0], var23.method168(-117));
                }
            }
            if (var4 == 9) {
                class25 var24 = class206.field2777[var5];
                if (var24 != null) {
                    class117.field1652 = 0;
                    class384.field5563 = 2;
                    class414.field6086 = class32.field453;
                    class152.field2062 = class319.field4668;
                    class41.field568++;
                    class185.field2507.method5(arg0 - 35346, 53);
                    class185.field2507.method1324(var5, (byte) 95);
                    class185.field2507.method1346(class30.field437[82] ? 1 : 0, arg0 + 3866);
                    class254.method1552(0, var24.field4360[0], -2, var24.field4362[0], class227.field2988.field4362[0], var24.method168(arg0 - 29018), arg0 - 28903, true, 0, class227.field2988.field4360[0], var24.method168(-119));
                }
            }
            if (var4 == 8) {
                class25 var25 = class206.field2777[var5];
                if (var25 != null) {
                    class384.field5563 = 2;
                    class152.field2062 = class319.field4668;
                    class414.field6086 = class32.field453;
                    class276.field4001++;
                    class117.field1652 = 0;
                    class185.field2507.method5(-6445, 61);
                    class185.field2507.method1326(var5, 25);
                    class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 84);
                    class254.method1552(0, var25.field4360[0], -2, var25.field4362[0], class227.field2988.field4362[0], var25.method168(-121), -2, true, 0, class227.field2988.field4360[0], var25.method168(arg0 - 29016));
                }
            }
            if (var4 == 1004) {
                class394 var26 = class196.method1168((byte) -119, var3);
                if (var26 == null || var26.field5776[var2] < 100000) {
                    class185.field2507.method5(-6445, 205);
                    class369.field5337++;
                    class185.field2507.method1339(var5, -16777216);
                } else {
                    class197.method1175(0, var26.field5776[var2] + " x " + class9.method74(var5, (byte) -123).field1193);
                }
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -78, var3);
                class298.field4274 = var2;
            }
            if (var4 == 1007 || var4 == 1010 || var4 == 1002 || var4 == 1012 || var4 == 1001) {
                class288.method1966((byte) 73, var4, var2, var5);
            }
            if (var4 == 17) {
                class25 var27 = class206.field2777[var5];
                if (var27 != null) {
                    class414.field6086 = class32.field453;
                    class152.field2062 = class319.field4668;
                    class183.field2484++;
                    class384.field5563 = 2;
                    class117.field1652 = 0;
                    class185.field2507.method5(arg0 - 35346, 157);
                    class185.field2507.method1324(var5, (byte) 116);
                    class185.field2507.method1330(class377.field5495, 69);
                    class185.field2507.method1324(class145.field1979, (byte) 91);
                    class185.field2507.method1379(-110, class215.field2863);
                    class185.field2507.method1369(class30.field437[82] ? 1 : 0, -123);
                    class254.method1552(0, var27.field4360[0], -2, var27.field4362[0], class227.field2988.field4362[0], var27.method168(arg0 - 29019), arg0 ^ 0xFFFF8F1B, true, 0, class227.field2988.field4360[0], var27.method168(-117));
                }
            }
            if (var4 == 41) {
                class25 var28 = class206.field2777[var5];
                if (var28 != null) {
                    class152.field2062 = class319.field4668;
                    class68.field879++;
                    class117.field1652 = 0;
                    class384.field5563 = 2;
                    class414.field6086 = class32.field453;
                    class185.field2507.method5(-6445, 172);
                    class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 120);
                    class185.field2507.method1339(var5, -16777216);
                    class254.method1552(0, var28.field4360[0], -2, var28.field4362[0], class227.field2988.field4362[0], var28.method168(arg0 ^ 0xFFFF8F6C), -2, true, 0, class227.field2988.field4360[0], var28.method168(-127));
                }
            }
            if (var4 == 18) {
                class394 var29 = class196.method1168((byte) -85, var3);
                boolean var30 = true;
                if (var29.field5654 > 0) {
                    var30 = class62.method429((byte) 88, var29);
                }
                if (var30) {
                    class185.field2507.method5(-6445, 47);
                    class178.field2348++;
                    class185.field2507.method1330(var3, -110);
                }
            }
            if (var4 == 15) {
                class185.field2507.method5(-6445, 217);
                class205.field2766++;
                class185.field2507.method1330(var3, arg0 - 29006);
                class185.field2507.method1339(var5, -16777216);
                class185.field2507.method1379(-91, var2);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -96, var3);
                class298.field4274 = var2;
            }
            if (var4 == 49) {
                class219.field2900++;
                class384.field5563 = 2;
                class414.field6086 = class32.field453;
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class185.field2507.method5(arg0 ^ 0xFFFF9636, 9);
                class185.field2507.method1379(-115, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class185.field2507.method1346(class30.field437[82] ? 1 : 0, arg0 ^ 0xF1A);
                class185.field2507.method1339(class200.field2660 + var3, arg0 ^ 0xFF0070E5);
                class185.field2507.method1326(var2 + class7.field138, -94);
                class99.method672((byte) -62, var3, var2, var6);
            }
            if (var4 == 40) {
                class415.field6090++;
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class384.field5563 = 2;
                class414.field6086 = class32.field453;
                class185.field2507.method5(-6445, 116);
                class185.field2507.method1324((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 98);
                class185.field2507.method1379(-104, class200.field2660 + var3);
                class185.field2507.method1352(class442.field6471, -1845015792);
                class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 116);
                class185.field2507.method1339(class306.field4506, -16777216);
                class185.field2507.method1326(class7.field138 + var2, -106);
                class99.method672((byte) -62, var3, var2, var6);
            }
            if (var4 == 46) {
                class185.field2507.method5(-6445, 47);
                class178.field2348++;
                class185.field2507.method1330(var3, 20);
                class394 var31 = class196.method1168((byte) -105, var3);
                if (var31.field5761 != null && var31.field5761[0][0] == 5) {
                    int var32 = var31.field5761[0][1];
                    if (class191.field2561[var32] != var31.field5717[0]) {
                        class191.field2561[var32] = var31.field5717[0];
                        class264.method1815(3930, var32);
                    }
                }
            }
            if (var4 == 57) {
                class152.field2062 = class319.field4668;
                class384.field5563 = 2;
                class135.field1882++;
                class117.field1652 = 0;
                class414.field6086 = class32.field453;
                class185.field2507.method5(-6445, 159);
                class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 81);
                class185.field2507.method1326(var5, -57);
                class185.field2507.method1339(class7.field138 + var2, -16777216);
                class185.field2507.method1339(var3 + class200.field2660, -16777216);
                class179.method1093(var2, var3, (byte) -126);
            }
            if (var4 == 37) {
                class25 var33 = class206.field2777[var5];
                if (var33 != null) {
                    class152.field2062 = class319.field4668;
                    class321.field4712++;
                    class414.field6086 = class32.field453;
                    class384.field5563 = 2;
                    class117.field1652 = 0;
                    class185.field2507.method5(-6445, 196);
                    class185.field2507.method1326(var5, arg0 ^ 0x70CC);
                    class185.field2507.method1346(class30.field437[82] ? 1 : 0, arg0 + 3866);
                    class254.method1552(0, var33.field4360[0], -2, var33.field4362[0], class227.field2988.field4362[0], var33.method168(arg0 - 29025), -2, true, 0, class227.field2988.field4360[0], var33.method168(-117));
                }
            }
            if (var4 == 45) {
                class117.field1652 = 0;
                class384.field5563 = 2;
                class414.field6086 = class32.field453;
                class152.field2062 = class319.field4668;
                class426.field6279++;
                class185.field2507.method5(-6445, 107);
                class185.field2507.method1339(class7.field138 + var2, -16777216);
                class185.field2507.method1379(-120, var5);
                class185.field2507.method1379(-97, class306.field4506);
                class185.field2507.method1369(class30.field437[82] ? 1 : 0, 27);
                class185.field2507.method1379(-77, var3 + class200.field2660);
                class185.field2507.method1338(arg0 - 28803, class442.field6471);
                class179.method1093(var2, var3, (byte) -125);
            }
            if (var4 == 20) {
                class43 var34 = class306.field4496[var5];
                if (var34 != null) {
                    class355.field5137++;
                    class117.field1652 = 0;
                    class152.field2062 = class319.field4668;
                    class384.field5563 = 2;
                    class414.field6086 = class32.field453;
                    class185.field2507.method5(-6445, 77);
                    class185.field2507.method1362(122, class30.field437[82] ? 1 : 0);
                    class185.field2507.method1339(var5, arg0 - 16806117);
                    class254.method1552(0, var34.field4360[0], -2, var34.field4362[0], class227.field2988.field4362[0], var34.method168(-121), -2, true, 0, class227.field2988.field4360[0], var34.method168(-126));
                }
            }
            if (var4 == 13) {
                class138.field1904++;
                class152.field2062 = class319.field4668;
                class414.field6086 = class32.field453;
                class384.field5563 = 2;
                class117.field1652 = 0;
                class185.field2507.method5(-6445, 158);
                class185.field2507.method1339(class215.field2863, -16777216);
                class185.field2507.method1326(class7.field138 + var2, -72);
                class185.field2507.method1326(class200.field2660 + var3, 36);
                class185.field2507.method1324((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 90);
                class185.field2507.method1324(class145.field1979, (byte) 113);
                class185.field2507.method1366(class377.field5495, (byte) 86);
                class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 120);
                class99.method672((byte) -62, var3, var2, var6);
            }
            if (var4 == 1) {
                class270.field3917++;
                class185.field2507.method5(-6445, 59);
                class185.field2507.method1330(var3, 78);
                class185.field2507.method1339(var2, -16777216);
                class185.field2507.method1326(var5, 120);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -128, var3);
                class298.field4274 = var2;
            }
            if (var4 == 14) {
                class88.field1236++;
                class414.field6086 = class32.field453;
                class384.field5563 = 2;
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class185.field2507.method5(-6445, 60);
                class185.field2507.method1326(class200.field2660 + var3, 37);
                class185.field2507.method1339(class7.field138 + var2, -16777216);
                class185.field2507.method1346(class30.field437[82] ? 1 : 0, arg0 + 3866);
                class185.field2507.method1379(arg0 ^ 0xFFFF8F40, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class99.method672((byte) -62, var3, var2, var6);
            }
            if (var4 == 42) {
                class25 var35 = class206.field2777[var5];
                if (var35 != null) {
                    class414.field6086 = class32.field453;
                    class152.field2062 = class319.field4668;
                    class384.field5563 = 2;
                    class117.field1652 = 0;
                    class354.field5121++;
                    class185.field2507.method5(arg0 - 35346, 199);
                    class185.field2507.method1324(class306.field4506, (byte) 95);
                    class185.field2507.method1338(56, class442.field6471);
                    class185.field2507.method1362(arg0 - 28783, class30.field437[82] ? 1 : 0);
                    class185.field2507.method1339(var5, -16777216);
                    class254.method1552(0, var35.field4360[0], -2, var35.field4362[0], class227.field2988.field4362[0], var35.method168(-123), -2, true, 0, class227.field2988.field4360[0], var35.method168(-119));
                }
            }
            if (var4 == 35) {
                class25 var36 = class206.field2777[var5];
                if (var36 != null) {
                    class414.field6086 = class32.field453;
                    class152.field2062 = class319.field4668;
                    class117.field1652 = 0;
                    class178.field2349++;
                    class384.field5563 = 2;
                    class185.field2507.method5(-6445, 131);
                    class185.field2507.method1377(class30.field437[82] ? 1 : 0, (byte) 125);
                    class185.field2507.method1339(var5, -16777216);
                    class254.method1552(0, var36.field4360[0], -2, var36.field4362[0], class227.field2988.field4362[0], var36.method168(arg0 - 29014), -2, true, 0, class227.field2988.field4360[0], var36.method168(arg0 - 29018));
                }
            }
            if (var4 == 25) {
                class185.field2507.method5(arg0 - 35346, 238);
                class148.field2031++;
                class185.field2507.method1330(var3, -125);
                class185.field2507.method1324(var5, (byte) 112);
                class185.field2507.method1326(var2, -74);
                class17.field247 = 0;
                class318.field4648 = class196.method1168((byte) -127, var3);
                class298.field4274 = var2;
            }
            if (var4 == 1005) {
                class384.field5563 = 2;
                class369.field5337++;
                class414.field6086 = class32.field453;
                class117.field1652 = 0;
                class152.field2062 = class319.field4668;
                class185.field2507.method5(-6445, 205);
                class185.field2507.method1339(var5, -16777216);
            }
            if (class63.field844 != 0) {
                class63.field844 = 0;
                class407.method2621(class196.method1168((byte) -102, class377.field5495), 15);
            }
            if (class263.field3821) {
                class151.method946(arg0 - 28791);
            }
            if (arg0 != 28901) {
                method1257(-16, (class212) null);
            }
            if (class318.field4648 != null && class17.field247 == 0) {
                class407.method2621(class318.field4648, 15);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public static void method1258(byte arg0) {
        field2829 = null;
        if (arg0 > -109) {
            return;
        }
        field2803 = null;
        field2822 = null;
        field2799 = null;
        field2828 = null;
        field2807 = null;
        field2816 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public final void method1259(boolean arg0) {
        this.field2809 = null;
        this.field2804 = null;
        this.field2824 = null;
        if (!arg0) {
            method1256(true);
        }
        field2819++;
        this.field2813 = null;
    }
}
