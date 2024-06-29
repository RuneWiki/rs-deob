import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class125 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "Lrd;")
    public static class355 field1721;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method892(int arg0) {
        field1721 = null;
        int var1 = 49 % ((-arg0 - 18) / 58);
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)I", line = 16)
    public static final int method893(int arg0) {
        if (field1721.field5161.method35(43) == 0) {
            for (int var1 = 0; var1 < class735.field9967; var1++) {
                if (class123.field1707[var1].method1989((byte) 123) == 's' || class123.field1707[var1].method1989((byte) -81) == 'S') {
                    field1721.method2255(true, 1, field1721.field5161);
                    class526.field7302 = true;
                    break;
                }
            }
        }
        field1719++;
        if (class574.field7827 == class249.field3262) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class401.method2440(false);
            if (class773.field10624 == 0L) {
                class773.field10624 = var4;
            }
            if (var3 > 16384 && var4 - class773.field10624 < 5000L) {
                if ((var4 - class228.field2941) > 1000L) {
                    System.gc();
                    class228.field2941 = var4;
                }
                return 0;
            }
        }
        if (class574.field7827 == class249.field3273) {
            if (class454.field6507 == null) {
                class454.field6507 = new class423(class479.field6732, class688.field9200, class570.field7769, class703.field9419);
            }
            if (!class454.field6507.method2547(true)) {
                return 0;
            }
            class133.method940(0, true, null, 3);
            class717.field9766 = !class303.method1956((byte) 81);
            class329.field4681 = class419.method2521(false, class717.field9766 ? 34 : 32, true, 1);
            class570.field7772 = class419.method2521(false, 33, true, 1);
            class410.field5827 = class419.method2521(false, 13, true, 1);
        }
        if (class574.field7827 == class249.field3275) {
            boolean var6 = class570.field7772.method1161((byte) 114);
            int var7 = class186.field2442[33].method2614((byte) -113);
            int var8 = var7 + class186.field2442[class717.field9766 ? 34 : 32].method2614((byte) -119);
            int var9 = var8 + class186.field2442[13].method2614((byte) -122);
            int var10 = var9 + (var6 ? 100 : class570.field7772.method1178((byte) -123));
            if (var10 != 400) {
                return var10 / 4;
            }
            class534.field7403 = class329.field4681.method1157((byte) 108);
            class647.field8729 = class570.field7772.method1157((byte) 124);
            class489.method2864(class329.field4681, -3);
            int var11 = field1721.field5180.method2146(43);
            class318.field4521 = new class442(class426.field6204, class55.field647, class570.field7772);
            int[] var12 = class318.field4521.method2641(var11, -29149);
            if (var12.length == 0) {
                var12 = class318.field4521.method2641(0, -29149);
            }
            class169 var13 = new class169(class329.field4681, class410.field5827);
            if (var12.length > 0) {
                class41.field425 = new class334[var12.length];
                for (int var14 = 0; var14 < class41.field425.length; var14++) {
                    class41.field425[var14] = new class49(class318.field4521.method2637((byte) 110, var12[var14]), var13);
                }
            }
        }
        if (class574.field7827 == class249.field3276) {
            class299.method1943(class410.field5827, class329.field4681, class321.method2077(true), (byte) -76);
        }
        if (class574.field7827 == class249.field3277) {
            int var15 = class357.method2266(103);
            int var16 = class643.method3537((byte) -118);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class574.field7827 == class249.field3278) {
            if (class41.field425 != null && class41.field425.length > 0) {
                if (class41.field425[0].method305(arg0 ^ 0x2D) < 100) {
                    return 0;
                }
                if (class41.field425.length > 1 && class318.field4521.method2640((byte) -66) && class41.field425[1].method305(17) < 100) {
                    return 0;
                }
            }
            class230.method1448(class375.field5490, (byte) -6);
            class687.method3767(class375.field5490, false);
            class170.method1148(1, arg0 - 11239);
        }
        if (class574.field7827 == class249.field3279) {
            for (int var17 = 0; var17 < 4; var17++) {
                class257.field3830[var17] = class359.method2275(class393.field5663, class102.field1467, arg0 + 118);
            }
        }
        if (class574.field7827 == class249.field3280) {
            class490.field6826 = class419.method2521(false, 8, true, 1);
            class348.field5051 = class419.method2521(false, 0, true, 1);
            class133.field1820 = class419.method2521(false, 1, true, 1);
            class677.field9085 = class419.method2521(false, 2, true, 1);
            class548.field7565 = class419.method2521(false, 3, true, 1);
            class54.field643 = class419.method2521(false, 4, true, 1);
            class577.field7862 = class419.method2521(true, 5, true, 1);
            class66.field917 = class419.method2521(true, 6, true, 1);
            class768.field10581 = class419.method2521(false, 7, true, 1);
            class444.field6395 = class419.method2521(false, 9, true, 1);
            class333.field4720 = class419.method2521(false, 10, true, 1);
            class560.field7680 = class419.method2521(false, 11, true, 1);
            class235.field3135 = class419.method2521(false, 12, true, 1);
            class8.field74 = class419.method2521(false, 14, true, 1);
            class466.field6600 = class419.method2521(false, 15, true, 1);
            class415.field5995 = class419.method2521(false, 16, true, 1);
            class187.field2451 = class419.method2521(false, 17, true, 1);
            class204.field2634 = class419.method2521(false, 18, true, 1);
            class16.field162 = class419.method2521(false, 19, true, 1);
            class755.field10224 = class419.method2521(false, 20, true, 1);
            class291.field4154 = class419.method2521(false, 21, true, 1);
            class623.field8412 = class419.method2521(false, 22, true, 1);
            class627.field8494 = class419.method2521(true, 23, true, 1);
            class304.field4329 = class419.method2521(false, 24, true, 1);
            class73.field992 = class419.method2521(false, 25, true, 1);
            class737.field10006 = class419.method2521(true, 26, true, 1);
            class384.field5579 = class419.method2521(false, 27, true, 1);
            class382.field5556 = class419.method2521(true, 28, true, 1);
            class677.field9086 = class419.method2521(false, 29, true, 1);
            class122.field1688 = class419.method2521(true, 30, true, 1);
            class270.field3942 = class419.method2521(true, 31, true, 1);
            class734.field9951 = class419.method2521(true, 36, true, 2);
        }
        if (class574.field7827 == class249.field3281) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class186.field2442[var19] != null) {
                    var18 += class186.field2442[var19].method2614((byte) -119) * class10.field121[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class33.field316 < 0) {
                    class33.field316 = var18;
                }
                return (var18 - class33.field316) * 100 / (100 - class33.field316);
            }
            class342.method2180(-80, class490.field6826);
            class299.method1943(class410.field5827, class490.field6826, class321.method2077(true), (byte) -78);
        }
        if (class574.field7827 == class249.field3282) {
            if (class552.field7619 == -1) {
                class552.field7619 = class66.field917.method1173(false, "scape main");
            }
            class735.method4052(arg0);
            class170.method1148(2, -11239);
        }
        if (class574.field7827 == class249.field3283) {
            class455.method2700(class786.field10800, (byte) -124, class122.field1688);
        }
        if (arg0 != 0) {
            method892(68);
        }
        if (class574.field7827 == class249.field3284) {
            int var20 = class319.method2065(90);
            if (var20 < 100) {
                return var20;
            }
            class619.method3428(3, class382.field5556.method1176(1, 123));
            class1.method4(arg0 ^ 0xFFFFFFD1, class382.field5556.method1176(3, 116));
            class325.field4621 = new class607(class382.field5556);
        }
        if (class574.field7827 == class249.field3285) {
            if (class171.field2237 != -1 && !class768.field10581.method1174(class171.field2237, 0, 1)) {
                return 99;
            }
            class655.field8851 = new class444(class737.field10006, class444.field6395, class490.field6826);
            class315.field4447 = new class639(class426.field6204, class55.field647, class677.field9085);
            class175.field2314 = new class441(class426.field6204, class55.field647, class677.field9085, class325.field4621);
            class453.field6503 = new class239(class426.field6204, class55.field647, class677.field9085, class490.field6826);
            class22.field213 = new class430(class426.field6204, class55.field647, class187.field2451);
            class107.field1511 = new class123(class426.field6204, class55.field647, class677.field9085);
            class103.field1471 = new class666(class426.field6204, class55.field647, class677.field9085);
            class83.field1185 = new class492(class426.field6204, class55.field647, class677.field9085, class490.field6826);
            class345.field4846 = new class198(class426.field6204, class55.field647, class677.field9085, class768.field10581);
            class464.field6586 = new class521(class426.field6204, class55.field647, class677.field9085);
            class224.field2905 = new class724(class426.field6204, class55.field647, class677.field9085);
            class210.field2705 = new class209(class426.field6204, class55.field647, true, class415.field5995, class768.field10581);
            class323.field4586 = new class320(class426.field6204, class55.field647, class677.field9085, class490.field6826);
            class548.field7574 = new class552(class426.field6204, class55.field647, class677.field9085, class490.field6826);
            class107.field1507 = new class646(class426.field6204, class55.field647, true, class204.field2634, class768.field10581);
            class16.field156 = new class328(class426.field6204, class55.field647, true, class315.field4447, class16.field162, class768.field10581);
            class222.field2875 = new class564(class426.field6204, class55.field647, class677.field9085);
            class693.field9223 = new class384(class426.field6204, class55.field647, class755.field10224, class348.field5051, class133.field1820);
            class629.field8517 = new class753(class426.field6204, class55.field647, class677.field9085);
            class297.field4200 = new class371(class426.field6204, class55.field647, class677.field9085);
            class641.field8643 = new class129(class426.field6204, class55.field647, class291.field4154, class768.field10581);
            class130.field1795 = new class630(class426.field6204, class55.field647, class677.field9085);
            class657.field8868 = new class406(class426.field6204, class55.field647, class677.field9085);
            class276.field3998 = new class495(class426.field6204, class55.field647, class677.field9085);
            class547.field7563 = new class674(class426.field6204, class55.field647, class623.field8412);
            class2.field14 = new class791(class426.field6204, class55.field647, class677.field9085);
            class285.field4087 = new class270(class426.field6204, class55.field647, class677.field9085);
            class157.method1087(class768.field10581, class548.field7565, (byte) -48, class410.field5827, class490.field6826);
            class45.method296(true, class677.field9086);
            class85.field1208 = new class741(class55.field647, class304.field4329, class73.field992);
            class749.field10088 = new class609(class55.field647, class304.field4329, class73.field992, new class489());
            class300.method1946((byte) -127);
            class210.field2705.method1365(91, field1721.field5155.method591(43) == 0);
            class480.field6740 = new class768();
            class380.method2369((byte) 22);
            class730.method4033(class384.field5579, 124);
            class572.method3250(class768.field10581, true, class655.field8851);
            class647 var21 = new class647(class333.field4720.method1189("", 0, "huffman"));
            class600.method3366((byte) 103, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class719.field9773 = class735.method4050((byte) 3);
            class706.field9663 = new class734(true, class786.field10800);
        }
        if (class574.field7827 == class249.field3287) {
            int var22 = class740.method4071(class490.field6826, (byte) -53) + class732.method4038(arg0, true);
            int var23 = class594.method3336(arg0 + 16) + class643.method3537((byte) -123);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class574.field7827 == class249.field3288) {
            class752.method4110(class627.field8494, class107.field1511, class103.field1471, class210.field2705, class323.field4586, class548.field7574, class480.field6740);
        }
        if (class574.field7827 == class249.field3289) {
            class138.field1865 = new int[class276.field3998.field6970];
            class679.field9091 = new boolean[class276.field3998.field6970];
            class452.field6497 = new String[class657.field8868.field5755];
            for (int var24 = 0; var24 < class276.field3998.field6970; var24++) {
                if (class276.field3998.method2911(var24, false).field7263 == 0) {
                    class679.field9091[var24] = true;
                    class249.field3294++;
                }
                class138.field1865[var24] = -1;
            }
            class563.method3209(-1);
            class420.field6053 = class548.field7565.method1173(false, "loginscreen");
            class250.field3501 = class548.field7565.method1173(false, "lobbyscreen");
            class577.field7862.method1169(false, true, 22369);
            class66.field917.method1169(true, true, arg0 ^ 0x5761);
            class490.field6826.method1169(true, true, arg0 ^ 0x5761);
            class410.field5827.method1169(true, true, 22369);
            class333.field4720.method1169(true, true, 22369);
            class548.field7565.method1169(true, true, 22369);
            class259.field3838 = true;
            class677.field9085.field2259 = 2;
            class187.field2451.field2259 = 2;
            class415.field5995.field2259 = 2;
            class204.field2634.field2259 = 2;
            class16.field162.field2259 = 2;
            class755.field10224.field2259 = 2;
            class291.field4154.field2259 = 2;
        }
        if (class574.field7827 == class249.field3290) {
            if (!class422.method2542(arg0 + 113, class420.field6053)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class419.field6032[class420.field6053].length; var26++) {
                class347 var27 = class419.field6032[class420.field6053][var26];
                if (var27.field4884 == 5 && var27.field4965 != -1 && !class490.field6826.method1174(var27.field4965, 0, arg0 + 1)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class574.field7827 == class249.field3291) {
            class303.method1953(true, 50);
        }
        if (class574.field7827 == class249.field3292) {
            class180.field2361.method1011(true);
            try {
                class791.field10862.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class570.field7772 = null;
            class41.field425 = null;
            class791.field10862 = null;
            class329.field4681 = null;
            class318.field4521 = null;
            class180.field2361 = null;
            class643.method3538(-124);
            class648.field8735 = field1721.field5161.method35(43) == 1;
            field1721.method2255(true, 1, field1721.field5161);
            if (class648.field8735) {
                field1721.method2255(true, 0, field1721.field5140);
            } else if (field1721.field5140.field6065 && class706.field9663.field9953 < 512 && class706.field9663.field9953 != 0) {
                field1721.method2255(true, 0, field1721.field5140);
            }
            class515.method3006(-2);
            if (class648.field8735) {
                class399.method2434(false, (byte) 109, 0);
            } else {
                class399.method2434(false, (byte) 107, field1721.field5140.method2541(43));
            }
            class77.method625(false, true, field1721.field5183.method1441(43), -1, -1);
            class230.method1448(class375.field5490, (byte) -6);
            class687.method3767(class375.field5490, false);
            class65.method431(class490.field6826, -72, class375.field5490);
            class439.method2624(class603.field8192, 5689);
        }
        return class270.method1797(-113);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZI)Z", line = 474)
    public static final boolean method894(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method893(-115);
        }
        field1722++;
        return class7.method38(arg2, 51, arg0) || class655.method3640(-21797, arg2, arg0);
    }
}
