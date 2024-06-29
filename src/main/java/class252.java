import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class252 extends OutputStream {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4024 = -1;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4028 = "wave:";

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4026 = 2;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4027 = 2;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lak;")
    public static class172 field4025;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    public static int[] field4029;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lii;", line = 9)
    public static final class115 method1815(int arg0, int arg1) {
        field4032++;
        class115 var2 = (class115) class212.field3472.method704((byte) 51, (long) arg0);
        if (arg1 != -44) {
            method1817(-88, 85, -128, 3, -121, -79);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field489.method1287(arg0, 30, -1);
        class115 var4 = new class115();
        if (var3 != null) {
            var4.method796(arg0, new class44(var3), -107);
        }
        class212.field3472.method703(var4, (long) arg0, (byte) -110);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V", line = 39)
    public static final void method1816(int arg0, int arg1) {
        field4031++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class193.field3155[arg0];
        int var3 = class343.field5338[arg0];
        long var4 = class190.field3108[arg0];
        int var6 = class113.field1727[arg0];
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        int var7 = (int) class190.field3108[arg0];
        if (var6 == 14) {
            if (var7 == 0) {
                class178.method1337(class49.field698, var2, var3);
            } else if (var7 == 1) {
                if (class341.field5311 > 0 && class117.field1770[82] && class117.field1770[81]) {
                    class11.method58(class49.field698, class70.field989 + var2, class205.field3367 + var3, arg1 - 32597);
                } else {
                    class112.method779(1, var2, var3, (byte) -119);
                    class194.field3175.method257(-2, class327.field5061);
                    class194.field3175.method257(arg1 - 13, class246.field3891);
                    class194.field3175.method287(0, (int) class330.field5090);
                    class194.field3175.method257(-2, 57);
                    class194.field3175.method257(-2, class69.field983);
                    class194.field3175.method257(-2, class320.field4963);
                    class194.field3175.method257(-2, 89);
                    class194.field3175.method287(0, class191.field3129.field4255);
                    class194.field3175.method287(0, class191.field3129.field4264);
                    class194.field3175.method257(-2, class331.field5170);
                    class194.field3175.method257(arg1 ^ 0xFFFFFFF5, 63);
                }
            }
        }
        if (var6 == 1005) {
            class21.field304 = class105.field1542;
            class334.field5195 = class198.field3221;
            class179.field2976 = 2;
            class247.field3900 = 0;
            class234 var8 = class99.field1445[var7];
            if (var8 != null) {
                class256 var9 = var8.field3752;
                if (var9.field4080 != null) {
                    var9 = var9.method1843(-1);
                }
                if (var9 != null) {
                    class155.field2390++;
                    class194.field3175.method2375(194, 0);
                    class194.field3175.method264(var9.field4106, true);
                }
            }
        }
        if (var6 == 42) {
            class247.field3900 = 0;
            class21.field304 = class105.field1542;
            class179.field2976 = 2;
            class53.field745++;
            class334.field5195 = class198.field3221;
            class194.field3175.method2375(44, arg1 ^ 0xB);
            class194.field3175.method253(class182.field3013, arg1 ^ 0x4C);
            class194.field3175.method253(class205.field3367 + var3, 98);
            class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -94);
            class194.field3175.method224(class311.field4851, (byte) 48);
            class194.field3175.method253(Integer.MAX_VALUE & (int) (var4 >>> 32), 100);
            class194.field3175.method264(var2 + class70.field989, true);
        }
        if (var6 == 40) {
            if (var7 == 0) {
                class147.field2289 = 1;
                class178.method1337(class49.field698, var2, var3);
            } else if (var7 == 1) {
                class194.field3175.method2375(135, arg1 ^ 0xB);
                class63.field915++;
                class194.field3175.method266(class70.field989 + var2, false);
                class194.field3175.method253(class182.field3013, 79);
                class194.field3175.method283((byte) -51, class311.field4851);
                class194.field3175.method253(class205.field3367 + var3, arg1 + 79);
            }
        }
        if (var6 == 6) {
            class334.field5195 = class198.field3221;
            class179.field2976 = 2;
            class21.field304 = class105.field1542;
            class247.field3900 = 0;
            class194.field3175.method2375(94, 0);
            class122.field1911++;
            class194.field3175.method287(0, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class194.field3175.method266(var2 + class70.field989, false);
            class194.field3175.method274(class117.field1770[82] ? 1 : 0, 110);
            class194.field3175.method264(var3 + class205.field3367, true);
        }
        if (var6 == 25) {
            class179.field2976 = 2;
            class247.field3900 = 0;
            class24.field333++;
            class334.field5195 = class198.field3221;
            class21.field304 = class105.field1542;
            class194.field3175.method2375(5, 0);
            class194.field3175.method264(Integer.MAX_VALUE & (int) (var4 >>> 32), true);
            class194.field3175.method264(class70.field989 + var2, true);
            class194.field3175.method266(class205.field3367 + var3, false);
            class194.field3175.method257(-2, class117.field1770[82] ? 1 : 0);
        }
        if (var6 == 19) {
            class334 var10 = class74.field1049[var7];
            if (var10 != null) {
                class179.field2976 = 2;
                class160.field2655++;
                class334.field5195 = class198.field3221;
                class21.field304 = class105.field1542;
                class247.field3900 = 0;
                class194.field3175.method2375(161, 0);
                class194.field3175.method257(-2, class117.field1770[82] ? 1 : 0);
                class194.field3175.method253(var7, 81);
            }
        }
        if (var6 == 50) {
            class194.field3175.method2375(229, arg1 - 11);
            class194.field3175.method266(class182.field3013, false);
            class195.field3186++;
            class194.field3175.method264(var2, true);
            class194.field3175.method224(class311.field4851, (byte) 123);
            class194.field3175.method284(var3, arg1 - 135);
        }
        if (var6 == 8) {
            class131.field2071++;
            class194.field3175.method2375(52, 0);
            class194.field3175.method283((byte) -51, var3);
            class194.field3175.method264(var2, true);
            class194.field3175.method253(var7, 107);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 4) {
            class83.field1155++;
            class179.field2976 = 2;
            class21.field304 = class105.field1542;
            class247.field3900 = 0;
            class334.field5195 = class198.field3221;
            class194.field3175.method2375(36, 0);
            class194.field3175.method287(0, var2 + class70.field989);
            class194.field3175.method264(var3 + class205.field3367, true);
            class194.field3175.method264(var7, true);
            class194.field3175.method274(class117.field1770[82] ? 1 : 0, 88);
        }
        if (var6 == 58) {
            class334 var11 = class74.field1049[var7];
            if (var11 != null) {
                class21.field304 = class105.field1542;
                class44.field599++;
                class334.field5195 = class198.field3221;
                class179.field2976 = 2;
                class247.field3900 = 0;
                class194.field3175.method2375(152, 0);
                class194.field3175.method283((byte) -51, class223.field3563);
                class194.field3175.method253(var7, 66);
                class194.field3175.method264(class231.field3674, true);
                class194.field3175.method264(class233.field3737, true);
                class194.field3175.method274(class117.field1770[82] ? 1 : 0, 112);
            }
        }
        if (var6 == 13 && class52.field740 == null) {
            class176.method1326(var2, -82, var3);
            class52.field740 = class275.method1996(122, var2, var3);
            class320.method2252(class52.field740, 0);
        }
        if (var6 == 18) {
            class194.field3175.method2375(57, 0);
            class194.field3175.method283((byte) -51, var3);
            class194.field3175.method264(class233.field3737, true);
            class145.field2268++;
            class194.field3175.method253(var2, 76);
            class194.field3175.method287(arg1 ^ 0xB, var7);
            class194.field3175.method266(class231.field3674, false);
            class194.field3175.method270(8, class223.field3563);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 16) {
            class194.field3175.method2375(124, 0);
            class194.field3175.method283((byte) -51, var3);
            class103.field1512++;
            class157 var12 = class142.method1053(var3, 65535);
            if (var12.field2595 != null && var12.field2595[0][0] == 5) {
                int var13 = var12.field2595[0][1];
                if (class70.field991[var13] != var12.field2538[0]) {
                    class70.field991[var13] = var12.field2538[0];
                    class233.method1690(var13, (byte) 67);
                }
            }
        }
        if (var6 == 48) {
            class179.field2976 = 2;
            class323.field5000++;
            class247.field3900 = 0;
            class334.field5195 = class198.field3221;
            class21.field304 = class105.field1542;
            class194.field3175.method2375(83, 0);
            class194.field3175.method264(Integer.MAX_VALUE & (int) (var4 >>> 32), true);
            class194.field3175.method287(0, class205.field3367 + var3);
            class194.field3175.method266(class70.field989 + var2, false);
            class194.field3175.method240((byte) -77, class117.field1770[82] ? 1 : 0);
        }
        if (var6 == 44) {
            class234 var14 = class99.field1445[var7];
            if (var14 != null) {
                class21.field304 = class105.field1542;
                class339.field5279++;
                class334.field5195 = class198.field3221;
                class179.field2976 = 2;
                class247.field3900 = 0;
                class194.field3175.method2375(150, arg1 - 11);
                class194.field3175.method274(class117.field1770[82] ? 1 : 0, 119);
                class194.field3175.method287(0, var7);
                class194.field3175.method283((byte) -51, class311.field4851);
                class194.field3175.method264(class182.field3013, true);
            }
        }
        if (var6 == 45) {
            class194.field3175.method2375(213, 0);
            class194.field3175.method270(8, var3);
            class194.field3175.method287(arg1 - 11, var2);
            class194.field3175.method253(var7, 74);
            class320.field4960++;
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 15) {
            class194.field3175.method2375(139, arg1 ^ 0xB);
            class194.field3175.method224(var3, (byte) 60);
            class32.field431++;
            class194.field3175.method266(var7, false);
            class194.field3175.method287(0, var2);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 3) {
            class194.field3175.method2375(143, 0);
            class194.field3175.method253(var2, 118);
            class194.field3175.method253(var7, 124);
            class145.field2264++;
            class194.field3175.method270(8, var3);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 5) {
            class179.field2976 = 2;
            class21.field304 = class105.field1542;
            class334.field5195 = class198.field3221;
            class2.field21++;
            class247.field3900 = 0;
            class194.field3175.method2375(191, 0);
            class194.field3175.method240((byte) -115, class117.field1770[82] ? 1 : 0);
            class194.field3175.method264(var7, true);
            class194.field3175.method287(arg1 ^ 0xB, class70.field989 + var2);
            class194.field3175.method253(class205.field3367 + var3, 55);
        }
        if (var6 == 35) {
            class26.field357++;
            class21.field304 = class105.field1542;
            class334.field5195 = class198.field3221;
            class179.field2976 = 2;
            class247.field3900 = 0;
            class194.field3175.method2375(209, 0);
            class194.field3175.method264(class231.field3674, true);
            class194.field3175.method253(class233.field3737, arg1 ^ 0x60);
            class194.field3175.method270(8, class223.field3563);
            class194.field3175.method266(class205.field3367 + var3, false);
            class194.field3175.method253(class70.field989 + var2, 58);
            class194.field3175.method287(0, var7);
            class194.field3175.method257(-2, class117.field1770[82] ? 1 : 0);
        }
        if (var6 == 1001) {
            class179.field2976 = 2;
            class21.field304 = class105.field1542;
            class334.field5195 = class198.field3221;
            class52.field736++;
            class247.field3900 = 0;
            class194.field3175.method2375(155, 0);
            class194.field3175.method253(var7, 84);
        }
        if (var6 == 30) {
            class334 var15 = class74.field1049[var7];
            if (var15 != null) {
                class258.field4139++;
                class179.field2976 = 2;
                class247.field3900 = 0;
                class334.field5195 = class198.field3221;
                class21.field304 = class105.field1542;
                class194.field3175.method2375(1, 0);
                class194.field3175.method253(var7, 68);
                class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -102);
            }
        }
        if (var6 == 28) {
            class247.field3900 = 0;
            class179.field2976 = 2;
            class334.field5195 = class198.field3221;
            class21.field304 = class105.field1542;
            class194.field3175.method2375(176, 0);
            class194.field3175.method253((int) (var4 >>> 32) & Integer.MAX_VALUE, 71);
            class194.field3175.method240((byte) -108, class117.field1770[82] ? 1 : 0);
            class260.field4156++;
            class194.field3175.method287(arg1 ^ 0xB, class70.field989 + var2);
            class194.field3175.method224(class223.field3563, (byte) 102);
            class194.field3175.method253(class233.field3737, 95);
            class194.field3175.method253(class231.field3674, 111);
            class194.field3175.method287(arg1 ^ 0xB, class205.field3367 + var3);
        }
        if (var6 == 46) {
            class157 var35 = class275.method1996(arg1 ^ 0x51, var2, var3);
            if (var35 != null) {
                class106.method733(arg1 ^ 0xFFFFFFF4);
                class279 var36 = client.method766(var35);
                class195.method1435(var36.field4495, var3, var35.field2536, false, var36.method2029((byte) -120), var2, var35.field2576);
                class8.field119 = 0;
                class141.field2204 = class316.method2226(var35, (byte) 116);
                if (var35.field2421) {
                    class200.field3247 = var35.field2532 + "<col=ffffff>";
                } else {
                    class200.field3247 = "<col=00ff00>" + var35.field2452 + "<col=ffffff>";
                }
                if (class141.field2204 == null) {
                    class141.field2204 = "Null";
                }
            }
            return;
        }
        if (var6 == 1002) {
            class21.field304 = class105.field1542;
            class179.field2976 = 2;
            class310.field4841++;
            class247.field3900 = 0;
            class334.field5195 = class198.field3221;
            class194.field3175.method2375(11, arg1 - 11);
            class194.field3175.method287(0, var7);
        }
        if (var6 == 57) {
            class194.field3175.method2375(92, 0);
            class194.field3175.method284(var3, arg1 - 137);
            class194.field3175.method266(var7, false);
            class2.field23++;
            class194.field3175.method264(var2, true);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 24) {
            class334 var16 = class74.field1049[var7];
            if (var16 != null) {
                class21.field304 = class105.field1542;
                class247.field3900 = 0;
                class334.field5195 = class198.field3221;
                class179.field2976 = 2;
                class194.field3175.method2375(133, 0);
                class212.field3468++;
                class194.field3175.method274(class117.field1770[82] ? 1 : 0, 102);
                class194.field3175.method264(var7, true);
            }
        }
        if (var6 == 11) {
            class234 var17 = class99.field1445[var7];
            if (var17 != null) {
                class179.field2976 = 2;
                class247.field3900 = 0;
                class227.field3620++;
                class334.field5195 = class198.field3221;
                class21.field304 = class105.field1542;
                class194.field3175.method2375(211, arg1 ^ 0xB);
                class194.field3175.method240((byte) -112, class117.field1770[82] ? 1 : 0);
                class194.field3175.method287(0, var7);
            }
        }
        if (var6 == 10) {
            class166.field2760++;
            class194.field3175.method2375(78, arg1 ^ 0xB);
            class194.field3175.method266(var7, false);
            class194.field3175.method266(var2, false);
            class194.field3175.method224(var3, (byte) 66);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 34) {
            class334 var18 = class74.field1049[var7];
            if (var18 != null) {
                class334.field5195 = class198.field3221;
                class247.field3900 = 0;
                class179.field2976 = 2;
                class21.field304 = class105.field1542;
                class194.field3175.method2375(212, arg1 ^ 0xB);
                class194.field3175.method274(class117.field1770[82] ? 1 : 0, arg1 ^ 0x7B);
                client.field1665++;
                class194.field3175.method264(var7, true);
            }
        }
        if (var6 == 31) {
            class106.method733(arg1 - 12);
            class157 var19 = class142.method1053(var3, 65535);
            class231.field3674 = var2;
            class8.field119 = 1;
            class233.field3737 = var7;
            class223.field3563 = var3;
            class320.method2252(var19, arg1 ^ 0xB);
            class229.field3644 = "<col=ff9040>" + class285.method2054(var7, 0).field5135 + "<col=ffffff>";
            if (class229.field3644 == null) {
                class229.field3644 = "null";
            }
            return;
        }
        if (var6 == 32) {
            if (var7 == 0) {
                class129.field2015 = 1;
                class178.method1337(class49.field698, var2, var3);
            } else if (class341.field5311 > 0 && class117.field1770[82] && class117.field1770[81]) {
                class11.method58(class49.field698, class70.field989 + var2, class205.field3367 + var3, -32586);
            } else {
                class246.field3882++;
                class194.field3175.method2375(166, 0);
                class194.field3175.method253(class205.field3367 + var3, 95);
                class194.field3175.method266(class70.field989 + var2, false);
            }
        }
        if (arg1 != 11) {
            field4028 = (String) null;
        }
        if (var6 == 21) {
            class234 var20 = class99.field1445[var7];
            if (var20 != null) {
                class179.field2976 = 2;
                class21.field304 = class105.field1542;
                class334.field5195 = class198.field3221;
                class247.field3900 = 0;
                class194.field3175.method2375(162, 0);
                class194.field3175.method264(var7, true);
                class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -128);
                class207.field3410++;
            }
        }
        if (var6 == 60) {
            class334 var21 = class74.field1049[var7];
            if (var21 != null) {
                class179.field2976 = 2;
                class260.field4159++;
                class247.field3900 = 0;
                class334.field5195 = class198.field3221;
                class21.field304 = class105.field1542;
                class194.field3175.method2375(251, arg1 ^ 0xB);
                class194.field3175.method287(arg1 ^ 0xB, var7);
                class194.field3175.method240((byte) -110, class117.field1770[82] ? 1 : 0);
            }
        }
        if (var6 == 20) {
            class234 var22 = class99.field1445[var7];
            if (var22 != null) {
                class179.field2976 = 2;
                class52.field739++;
                class334.field5195 = class198.field3221;
                class21.field304 = class105.field1542;
                class247.field3900 = 0;
                class194.field3175.method2375(171, 0);
                class194.field3175.method264(class233.field3737, true);
                class194.field3175.method253(class231.field3674, 84);
                class194.field3175.method264(var7, true);
                class194.field3175.method283((byte) -51, class223.field3563);
                class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -110);
            }
        }
        if (var6 == 9) {
            class334 var23 = class74.field1049[var7];
            if (var23 != null) {
                class179.field2976 = 2;
                class21.field304 = class105.field1542;
                class247.field3900 = 0;
                class247.field3897++;
                class334.field5195 = class198.field3221;
                class194.field3175.method2375(27, arg1 - 11);
                class194.field3175.method257(-2, class117.field1770[82] ? 1 : 0);
                class194.field3175.method266(var7, false);
            }
        }
        if (var6 == 49) {
            class344.field5342++;
            class194.field3175.method2375(141, arg1 - 11);
            class194.field3175.method253(var2, arg1 ^ 0x3F);
            class194.field3175.method253(class182.field3013, 111);
            class194.field3175.method283((byte) -51, class311.field4851);
            class194.field3175.method264(var7, true);
            class194.field3175.method284(var3, -125);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, arg1 ^ 0xFFF4);
            class321.field4980 = var2;
        }
        if (var6 == 2) {
            class194.field3175.method2375(100, 0);
            class194.field3175.method253(var2, arg1 + 103);
            class202.field3284++;
            class194.field3175.method266(var7, false);
            class194.field3175.method283((byte) -51, var3);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 33) {
            class36.field475++;
            class247.field3900 = 0;
            class179.field2976 = 2;
            class334.field5195 = class198.field3221;
            class21.field304 = class105.field1542;
            class194.field3175.method2375(151, 0);
            class194.field3175.method266(class70.field989 + var2, false);
            class194.field3175.method253((int) (var4 >>> 32) & Integer.MAX_VALUE, 103);
            class194.field3175.method274(class117.field1770[82] ? 1 : 0, 110);
            class194.field3175.method287(arg1 ^ 0xB, class205.field3367 + var3);
        }
        if (var6 == 26) {
            class15.field186++;
            class194.field3175.method2375(40, 0);
            class194.field3175.method283((byte) -51, var3);
            class194.field3175.method287(0, var7);
            class194.field3175.method266(var2, false);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, 65535);
            class321.field4980 = var2;
        }
        if (var6 == 29 || var6 == 1004) {
            class193.method1428(var7, var3, false, var2, class157.field2458[arg0]);
        }
        if (var6 == 43) {
            class103.field1512++;
            class194.field3175.method2375(124, 0);
            class194.field3175.method283((byte) -51, var3);
            class157 var24 = class142.method1053(var3, arg1 + 65524);
            if (var24.field2595 != null && var24.field2595[0][0] == 5) {
                int var25 = var24.field2595[0][1];
                class70.field991[var25] = 1 - class70.field991[var25];
                class233.method1690(var25, (byte) 75);
            }
        }
        if (var6 == 1007) {
            class179.field2976 = 2;
            class334.field5195 = class198.field3221;
            class329.field5078++;
            class21.field304 = class105.field1542;
            class247.field3900 = 0;
            class194.field3175.method2375(160, 0);
            class194.field3175.method253(class70.field989 + var2, arg1 ^ 0x48);
            class194.field3175.method274(class117.field1770[82] ? 1 : 0, arg1 ^ 0x7E);
            class194.field3175.method266((int) (var4 >>> 32) & Integer.MAX_VALUE, false);
            class194.field3175.method253(class205.field3367 + var3, 87);
        }
        if (var6 == 51) {
            class234 var26 = class99.field1445[var7];
            if (var26 != null) {
                class179.field2976 = 2;
                class334.field5195 = class198.field3221;
                class21.field304 = class105.field1542;
                class174.field2889++;
                class247.field3900 = 0;
                class194.field3175.method2375(82, arg1 ^ 0xB);
                class194.field3175.method240((byte) -127, class117.field1770[82] ? 1 : 0);
                class194.field3175.method253(var7, 68);
            }
        }
        if (var6 == 17) {
            class194.field3175.method2375(0, 0);
            class194.field3175.method266(var7, false);
            class194.field3175.method264(var2, true);
            class194.field3175.method283((byte) -51, var3);
            class146.field2273 = 0;
            class342.field5327++;
            class103.field1498 = class142.method1053(var3, arg1 ^ 0xFFF4);
            class321.field4980 = var2;
        }
        if (var6 == 7) {
            class334 var27 = class74.field1049[var7];
            if (var27 != null) {
                class334.field5195 = class198.field3221;
                class221.field3549++;
                class21.field304 = class105.field1542;
                class179.field2976 = 2;
                class247.field3900 = 0;
                class194.field3175.method2375(58, 0);
                class194.field3175.method257(-2, class117.field1770[82] ? 1 : 0);
                class194.field3175.method266(var7, false);
            }
        }
        if (var6 == 59) {
            class334 var28 = class74.field1049[var7];
            if (var28 != null) {
                class21.field304 = class105.field1542;
                class247.field3900 = 0;
                class137.field2170++;
                class179.field2976 = 2;
                class334.field5195 = class198.field3221;
                class194.field3175.method2375(190, 0);
                class194.field3175.method266(var7, false);
                class194.field3175.method240((byte) -64, class117.field1770[82] ? 1 : 0);
                class194.field3175.method284(class311.field4851, arg1 - 134);
                class194.field3175.method266(class182.field3013, false);
            }
        }
        if (var6 == 36) {
            class334 var29 = class74.field1049[var7];
            if (var29 != null) {
                class179.field2976 = 2;
                class21.field304 = class105.field1542;
                class334.field5195 = class198.field3221;
                class247.field3900 = 0;
                class194.field3175.method2375(131, 0);
                class259.field4144++;
                class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -120);
                class194.field3175.method287(0, var7);
            }
        }
        if (var6 == 23) {
            class179.field2976 = 2;
            class212.field3471++;
            class247.field3900 = 0;
            class334.field5195 = class198.field3221;
            class21.field304 = class105.field1542;
            class194.field3175.method2375(187, 0);
            class194.field3175.method287(0, class70.field989 + var2);
            class194.field3175.method274(class117.field1770[82] ? 1 : 0, 114);
            class194.field3175.method287(0, var7);
            class194.field3175.method264(var3 + class205.field3367, true);
        }
        if (var6 == 38) {
            class231.method1638(53);
        }
        if (var6 == 1006) {
            class157 var30 = class142.method1053(var3, arg1 ^ 0xFFF4);
            if (var30 == null || var30.field2542[var2] < 100000) {
                class310.field4841++;
                class194.field3175.method2375(11, 0);
                class194.field3175.method287(0, var7);
            } else {
                class155.method1109(var30.field2542[var2] + " x " + class285.method2054(var7, 0).field5135, 0, "", (byte) -47);
            }
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, arg1 ^ 0xFFF4);
            class321.field4980 = var2;
        }
        if (var6 == 47) {
            class157 var31 = class142.method1053(var3, 65535);
            boolean var32 = true;
            if (var31.field2467 > 0) {
                var32 = class169.method1237(var31, (byte) 108);
            }
            if (var32) {
                class194.field3175.method2375(124, 0);
                class103.field1512++;
                class194.field3175.method283((byte) -51, var3);
            }
        }
        if (var6 == 12) {
            class234 var33 = class99.field1445[var7];
            if (var33 != null) {
                class247.field3900 = 0;
                class179.field2976 = 2;
                class21.field304 = class105.field1542;
                class296.field4684++;
                class334.field5195 = class198.field3221;
                class194.field3175.method2375(61, 0);
                class194.field3175.method266(var7, false);
                class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -128);
            }
        }
        if (var6 == 37) {
            class334.field5195 = class198.field3221;
            class224.field3590++;
            class179.field2976 = 2;
            class21.field304 = class105.field1542;
            class247.field3900 = 0;
            class194.field3175.method2375(192, 0);
            class194.field3175.method264(class205.field3367 + var3, true);
            class194.field3175.method232(class117.field1770[82] ? 1 : 0, (byte) -101);
            class194.field3175.method287(0, var2 + class70.field989);
            class194.field3175.method266(var7, false);
        }
        if (var6 == 1) {
            class247.field3900 = 0;
            class180.field2985++;
            class334.field5195 = class198.field3221;
            class21.field304 = class105.field1542;
            class179.field2976 = 2;
            class194.field3175.method2375(177, 0);
            class194.field3175.method253(class182.field3013, 43);
            class194.field3175.method284(class311.field4851, -124);
            class194.field3175.method266(class70.field989 + var2, false);
            class194.field3175.method287(0, class205.field3367 + var3);
            class194.field3175.method287(0, var7);
            class194.field3175.method257(-2, class117.field1770[82] ? 1 : 0);
        }
        if (var6 == 41) {
            class234 var34 = class99.field1445[var7];
            if (var34 != null) {
                class89.field1229++;
                class334.field5195 = class198.field3221;
                class179.field2976 = 2;
                class247.field3900 = 0;
                class21.field304 = class105.field1542;
                class194.field3175.method2375(113, 0);
                class194.field3175.method264(var7, true);
                class194.field3175.method274(class117.field1770[82] ? 1 : 0, 100);
            }
        }
        if (var6 == 22) {
            class194.field3175.method2375(236, 0);
            class194.field3175.method284(var3, -128);
            class329.field5079++;
            class194.field3175.method264(var7, true);
            class194.field3175.method287(arg1 - 11, var2);
            class146.field2273 = 0;
            class103.field1498 = class142.method1053(var3, arg1 + 65524);
            class321.field4980 = var2;
        }
        if (var6 == 39) {
            class247.field3900 = 0;
            class259.field4147++;
            class21.field304 = class105.field1542;
            class179.field2976 = 2;
            class334.field5195 = class198.field3221;
            class194.field3175.method2375(235, 0);
            class194.field3175.method264(class70.field989 + var2, true);
            class194.field3175.method274(class117.field1770[82] ? 1 : 0, 123);
            class194.field3175.method253(class205.field3367 + var3, 109);
            class194.field3175.method266(var7, false);
        }
        if (class8.field119 != 0) {
            class8.field119 = 0;
            class320.method2252(class142.method1053(class223.field3563, arg1 + 65524), 0);
        }
        if (class142.field2216) {
            class106.method733(-1);
        }
        if (class103.field1498 != null && class146.field2273 == 0) {
            class320.method2252(class103.field1498, 0);
        }
    }

    @OriginalMember(owner = "client!a", name = "write", descriptor = "(I)V", line = 1079)
    public final void write(int arg0) throws IOException {
        field4030++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V", line = 1087)
    public static final void method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= class279.field4497 && arg3 >= class98.field1410) {
            boolean var6;
            if (arg1 < class336.field5249) {
                arg1 = class336.field5249;
                var6 = false;
            } else if (class191.field3131 < arg1) {
                arg1 = class191.field3131;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg2 < class336.field5249) {
                var7 = false;
                arg2 = class336.field5249;
            } else if (class191.field3131 >= arg2) {
                var7 = true;
            } else {
                arg2 = class191.field3131;
                var7 = false;
            }
            if (class98.field1410 <= arg5) {
                class80.method545(arg4, arg0 + 14127, arg1, arg2, class281.field4523[arg5++]);
            } else {
                arg5 = class98.field1410;
            }
            if (arg3 <= class279.field4497) {
                class80.method545(arg4, -113, arg1, arg2, class281.field4523[arg3--]);
            } else {
                arg3 = class279.field4497;
            }
            if (var7 && var6) {
                for (int var8 = arg5; var8 <= arg3; var8++) {
                    int[] var9 = class281.field4523[var8];
                    var9[arg2] = var9[arg1] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg3; var10++) {
                    class281.field4523[var10][arg2] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg3; var11++) {
                    class281.field4523[var11][arg1] = arg4;
                }
            }
        }
        if (arg0 != -14242) {
            field4027 = -64;
        }
        field4033++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)Z", line = 1192)
    public static final boolean method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4035++;
        long var8 = class156.method1119(arg1, arg4 + arg0, arg2 + arg7);
        if (arg3 != -1536) {
            method1818(-67, 121, -105, -75, -9, -54, -100, -74);
        }
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = ((int) var8 & 0x3A393C) >> 20;
            int var12 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class97 var13 = class69.method454(false, var12);
            if (var13.field1317 == -1) {
                int var14 = (52736 - arg2 * 512) * 4 + ((arg4 * 4) + 24624);
                int[] var15 = class59.field833;
                int var16 = arg6;
                if (var8 > 0L) {
                    var16 = arg5;
                }
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var15[var14] = var16;
                        var15[var14 + 512] = var16;
                        var15[var14 + 1024] = var16;
                        var15[var14 + 1536] = var16;
                    } else if (var11 == 1) {
                        var15[var14] = var16;
                        var15[var14 + 1] = var16;
                        var15[var14 + 2] = var16;
                        var15[var14 + 3] = var16;
                    } else if (var11 == 2) {
                        var15[var14 + 3] = var16;
                        var15[var14 + 515] = var16;
                        var15[var14 + 3 + 1024] = var16;
                        var15[var14 + 3 + 1536] = var16;
                    } else if (var11 == 3) {
                        var15[var14 + 1536] = var16;
                        var15[var14 + 1 + 1536] = var16;
                        var15[var14 + 1536 + 2] = var16;
                        var15[var14 + 1536 + 3] = var16;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var15[var14] = var16;
                    } else if (var11 == 1) {
                        var15[var14 + 3] = var16;
                    } else if (var11 == 2) {
                        var15[var14 + 3 + 1536] = var16;
                    } else if (var11 == 3) {
                        var15[var14 + 1536] = var16;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var15[var14] = var16;
                        var15[var14 + 512] = var16;
                        var15[var14 + 1024] = var16;
                        var15[var14 + 1536] = var16;
                    } else if (var11 == 0) {
                        var15[var14] = var16;
                        var15[var14 + 1] = var16;
                        var15[var14 + 2] = var16;
                        var15[var14 + 3] = var16;
                    } else if (var11 == 1) {
                        var15[var14 + 3] = var16;
                        var15[var14 + 3 + 512] = var16;
                        var15[var14 + 3 + 1024] = var16;
                        var15[var14 + 3 + 1536] = var16;
                    } else if (var11 == 2) {
                        var15[var14 + 1536] = var16;
                        var15[var14 + 1 + 1536] = var16;
                        var15[var14 + 1538] = var16;
                        var15[var14 + 1539] = var16;
                    }
                }
            } else if (!class223.method1584(var11, arg7, arg4, arg2, var13, arg0, arg3 ^ 0xFFFFFA13)) {
                return false;
            }
        }
        long var17 = class129.method933(arg1, arg0 + arg4, arg2 + arg7);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x357855) >> 20;
            int var20 = (int) var17 >> 14 & 0x1F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class97 var22 = class69.method454(false, var21);
            if (var22.field1317 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    int[] var24 = class59.field833;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int var25 = (52736 - arg2 * 512) * 4 + ((arg4 * 4) + 24624);
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1025] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 2 + 1024] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class223.method1584(var19, arg7, arg4, arg2, var22, arg0, 19)) {
                return false;
            }
        }
        long var26 = class297.method2117(arg1, arg0 + arg4, arg2 - -arg7);
        if (var26 != 0L) {
            int var28 = (int) var26 >> 20 & 0x3;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class97 var30 = class69.method454(false, var29);
            if (var30.field1317 != -1 && !class223.method1584(var28, arg7, arg4, arg2, var30, arg0, 19)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 1412)
    public static void method1819(int arg0) {
        if (arg0 != 166) {
            field4027 = 37;
        }
        field4029 = null;
        field4028 = null;
        field4025 = null;
    }
}
