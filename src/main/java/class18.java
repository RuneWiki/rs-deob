import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class18 extends class313 {

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    private int field294 = 2000;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    private int field287 = 0;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    private int field295 = 16;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    private int field296 = 4096;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    private int field289 = 0;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static volatile int field299 = 0;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "F")
    public static float field290;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 3)
    public class18() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)V", line = 11)
    public static final void method181(int arg0, byte arg1) {
        field297++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class161.field2863[arg0];
        int var3 = class70.field1135[arg0];
        int var4 = class276.field4401[arg0];
        int var5 = (int) class110.field1868[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var6 = class110.field1868[arg0];
        if (var4 == 44) {
            class198.field3392++;
            class341.field5443.method26(174, 7);
            class341.field5443.method2318(var5, 118);
            class341.field5443.method2359(-805606200, var2);
            class341.field5443.method2320(-6128, var3);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 50) {
            class257.field4134++;
            class341.field5443.method26(122, 7);
            class341.field5443.method2374(44, var3);
            class341.field5443.method2318(var5, 124);
            class341.field5443.method2366(72, var2);
            class341.field5443.method2374(104, class230.field3839);
            class341.field5443.method2366(-78, class17.field281);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 25) {
            class341.field5443.method26(213, 7);
            class66.field1069++;
            class341.field5443.method2359(-805606200, var2);
            class341.field5443.method2334((byte) 2, var5);
            class341.field5443.method2320(-6128, var3);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 1007) {
            class137 var8 = class146.method1167(1169843632, var3);
            if (var8 == null || var8.field2461[var2] < 100000) {
                class341.field5443.method26(41, 7);
                class341.field5443.method2359(-805606200, var5);
                class89.field1413++;
            } else {
                class170.method1339(0, var8.field2461[var2] + " x " + class5.method31(-1731690365, var5).field2346, "", (byte) -98);
            }
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 46) {
            class205 var9 = class135.field2359[var5];
            if (var9 != null) {
                class15.field230++;
                class215.field3612 = 2;
                class20.field304 = 0;
                class98.field1603 = class226.field3812;
                class207.field3513 = class218.field3635;
                class341.field5443.method26(121, 7);
                class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
                class341.field5443.method2359(-805606200, var5);
            }
        }
        if (var4 == 23) {
            class341.field5443.method26(214, 7);
            class298.field4750++;
            class341.field5443.method2318(var5, 121);
            class341.field5443.method2374(47, var3);
            class341.field5443.method2334((byte) 2, var2);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 11) {
            class341.field5443.method26(153, 7);
            class341.field5443.method2324(var3, true);
            class341.field5443.method2334((byte) 2, var2);
            class341.field5443.method2318(class17.field281, 123);
            class341.field5443.method2316(-23240, class230.field3839);
            class137.field2498++;
        }
        if (var4 == 9) {
            class278 var10 = class320.field5071[var5];
            if (var10 != null) {
                class303.field4798++;
                class207.field3513 = class218.field3635;
                class98.field1603 = class226.field3812;
                class215.field3612 = 2;
                class20.field304 = 0;
                class341.field5443.method26(78, 7);
                class341.field5443.method2324(class230.field3839, true);
                class341.field5443.method2318(class17.field281, 118);
                class341.field5443.method2334((byte) 2, var5);
                class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
            }
        }
        if (var4 == 4) {
            class205 var11 = class135.field2359[var5];
            if (var11 != null) {
                class20.field304 = 0;
                class75.field1234++;
                class98.field1603 = class226.field3812;
                class207.field3513 = class218.field3635;
                class215.field3612 = 2;
                class341.field5443.method26(238, 7);
                class341.field5443.method2318(var5, 119);
                class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            }
        }
        if (var4 == 8) {
            class207.field3513 = class218.field3635;
            class286.field4557++;
            class98.field1603 = class226.field3812;
            class20.field304 = 0;
            class215.field3612 = 2;
            class341.field5443.method26(167, 7);
            class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
            class341.field5443.method2320(-6128, class162.field2870);
            class341.field5443.method2334((byte) 2, class159.field2808);
            class341.field5443.method2334((byte) 2, class34.field484 + var3);
            class341.field5443.method2318((int) (var6 >>> 32) & Integer.MAX_VALUE, 126);
            class341.field5443.method2366(103, class24.field345 + var2);
            class341.field5443.method2318(class30.field432, 127);
        }
        if (var4 == 43) {
            class17.field275++;
            class215.field3612 = 2;
            class207.field3513 = class218.field3635;
            class98.field1603 = class226.field3812;
            class20.field304 = 0;
            class341.field5443.method26(226, 7);
            class341.field5443.method2334((byte) 2, var5);
            class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            class341.field5443.method2359(-805606200, var3 + class34.field484);
            class341.field5443.method2366(113, var2 + class24.field345);
        }
        if (var4 == 14) {
            class137 var12 = class60.method557(var3, 92, var2);
            if (var12 != null) {
                class20.method200(-105);
                class57 var13 = client.method1894(var12);
                class278.method1907(var12.field2397, var2, var12.field2464, var13.field889, 85, var13.method523((byte) -48), var3);
                class93.field1458 = 0;
                class50.field784 = class191.method1445(var12, 11156);
                if (class50.field784 == null) {
                    class50.field784 = "Null";
                }
                if (var12.field2402) {
                    class28.field386 = var12.field2492 + "<col=ffffff>";
                } else {
                    class28.field386 = "<col=00ff00>" + var12.field2396 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var4 == 5) {
            class341.field5443.method26(149, 7);
            class351.field5567++;
            class341.field5443.method2366(127, var5);
            class341.field5443.method2316(-23240, var3);
            class341.field5443.method2334((byte) 2, class30.field432);
            class341.field5443.method2359(-805606200, class159.field2808);
            class341.field5443.method2320(-6128, class162.field2870);
            class341.field5443.method2359(-805606200, var2);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 1) {
            field298++;
            class20.field304 = 0;
            class207.field3513 = class218.field3635;
            class98.field1603 = class226.field3812;
            class215.field3612 = 2;
            class341.field5443.method26(132, 7);
            class341.field5443.method2334((byte) 2, class24.field345 + var2);
            class341.field5443.method2366(109, var5);
            class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
            class341.field5443.method2366(-33, class34.field484 + var3);
        }
        if (var4 == 59) {
            class341.field5443.method26(196, 7);
            class70.field1140++;
            class341.field5443.method2374(102, var3);
            class341.field5443.method2359(-805606200, var5);
            class341.field5443.method2359(-805606200, var2);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 36) {
            class113.field1885++;
            class341.field5443.method26(47, 7);
            class341.field5443.method2359(-805606200, var5);
            class341.field5443.method2359(-805606200, var2);
            class341.field5443.method2324(var3, true);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 47) {
            class271.method1853(-106);
        }
        if (var4 == 24) {
            class98.field1603 = class226.field3812;
            class207.field3513 = class218.field3635;
            class184.field3121++;
            class215.field3612 = 2;
            class20.field304 = 0;
            class341.field5443.method26(139, 7);
            class341.field5443.method2359(-805606200, var2 + class24.field345);
            class341.field5443.method2366(99, class34.field484 + var3);
            class341.field5443.method2336(class97.field1572[82] ? 1 : 0, 15459);
            class341.field5443.method2318(Integer.MAX_VALUE & (int) (var6 >>> 32), 123);
        }
        if (var4 == 32) {
            class20.field304 = 0;
            class98.field1603 = class226.field3812;
            class194.field3257++;
            class207.field3513 = class218.field3635;
            class215.field3612 = 2;
            class341.field5443.method26(254, 7);
            class341.field5443.method2366(103, var5);
            class341.field5443.method2318(class24.field345 + var2, 124);
            class341.field5443.method2318(class34.field484 + var3, 124);
            class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
        }
        if (var4 == 58) {
            class205 var14 = class135.field2359[var5];
            if (var14 != null) {
                class145.field2630++;
                class20.field304 = 0;
                class98.field1603 = class226.field3812;
                class215.field3612 = 2;
                class207.field3513 = class218.field3635;
                class341.field5443.method26(73, 7);
                class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
                class341.field5443.method2359(-805606200, var5);
            }
        }
        if (var4 == 3) {
            class278 var15 = class320.field5071[var5];
            if (var15 != null) {
                class98.field1603 = class226.field3812;
                class207.field3513 = class218.field3635;
                class200.field3419++;
                class215.field3612 = 2;
                class20.field304 = 0;
                class341.field5443.method26(53, 7);
                class341.field5443.method2359(-805606200, var5);
                class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            }
        }
        if (var4 == 26) {
            if (var5 == 0) {
                class203.field3454 = 1;
                class316.method2179(class205.field3497, var2, var3);
            } else if (var5 == 1) {
                class334.field5301++;
                class341.field5443.method26(118, 7);
                class341.field5443.method2324(class230.field3839, true);
                class341.field5443.method2334((byte) 2, class17.field281);
                class341.field5443.method2334((byte) 2, class24.field345 + var2);
                class341.field5443.method2334((byte) 2, class34.field484 + var3);
            }
        }
        if (var4 == 40) {
            class278 var16 = class320.field5071[var5];
            if (var16 != null) {
                class207.field3513 = class218.field3635;
                class98.field1603 = class226.field3812;
                class215.field3612 = 2;
                class20.field304 = 0;
                class341.field5443.method26(97, 7);
                class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
                class341.field5443.method2318(var5, 119);
                class108.field1844++;
            }
        }
        if (var4 == 45) {
            class205 var17 = class135.field2359[var5];
            if (var17 != null) {
                class215.field3612 = 2;
                class155.field2758++;
                class207.field3513 = class218.field3635;
                class20.field304 = 0;
                class98.field1603 = class226.field3812;
                class341.field5443.method26(99, 7);
                class341.field5443.method2336(class97.field1572[82] ? 1 : 0, 15459);
                class341.field5443.method2318(var5, 119);
            }
        }
        if (var4 == 22) {
            class205 var18 = class135.field2359[var5];
            if (var18 != null) {
                class215.field3612 = 2;
                class342.field5462++;
                class20.field304 = 0;
                class207.field3513 = class218.field3635;
                class98.field1603 = class226.field3812;
                class341.field5443.method26(111, 7);
                class341.field5443.method2374(118, class230.field3839);
                class341.field5443.method2359(-805606200, class17.field281);
                class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
                class341.field5443.method2334((byte) 2, var5);
            }
        }
        if (var4 == 13) {
            class205 var19 = class135.field2359[var5];
            if (var19 != null) {
                class215.field3612 = 2;
                class297.field4737++;
                class207.field3513 = class218.field3635;
                class98.field1603 = class226.field3812;
                class20.field304 = 0;
                class341.field5443.method26(94, 7);
                class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
                class341.field5443.method2359(-805606200, var5);
            }
        }
        if (var4 == 28) {
            if (var5 == 0) {
                class272.field4336 = 1;
                class316.method2179(class205.field3497, var2, var3);
            } else if (class158.field2787 > 0 && class97.field1572[82] && class97.field1572[81]) {
                class320.method2196(class205.field3497, class24.field345 + var2, 0, class34.field484 + var3);
            } else {
                class272.field4347++;
                class341.field5443.method26(10, 7);
                class341.field5443.method2318(class34.field484 + var3, 120);
                class341.field5443.method2334((byte) 2, class24.field345 + var2);
            }
        }
        if (var4 == 18) {
            class205 var20 = class135.field2359[var5];
            if (var20 != null) {
                class215.field3612 = 2;
                class98.field1603 = class226.field3812;
                class20.field304 = 0;
                class197.field3361++;
                class207.field3513 = class218.field3635;
                class341.field5443.method26(104, 7);
                class341.field5443.method2334((byte) 2, var5);
                class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
            }
        }
        if (var4 == 34) {
            class207.field3513 = class218.field3635;
            class20.field304 = 0;
            class98.field1603 = class226.field3812;
            class215.field3612 = 2;
            class286.field4546++;
            class341.field5443.method26(35, 7);
            class341.field5443.method2359(-805606200, class24.field345 + var2);
            class341.field5443.method2366(-101, var5);
            class341.field5443.method2336(class97.field1572[82] ? 1 : 0, 15459);
            class341.field5443.method2366(-59, var3 + class34.field484);
        }
        if (var4 == 15) {
            if (var5 == 0) {
                class316.method2179(class205.field3497, var2, var3);
            } else if (var5 == 1) {
                if (class158.field2787 > 0 && class97.field1572[82] && class97.field1572[81]) {
                    class320.method2196(class205.field3497, class24.field345 + var2, 0, class34.field484 + var3);
                } else {
                    class277.method1902(var3, -2, var2, 1);
                    class341.field5443.method2370(class105.field1759, (byte) -20);
                    class341.field5443.method2370(class119.field2069, (byte) -20);
                    class341.field5443.method2359(-805606200, (int) class83.field1331);
                    class341.field5443.method2370(57, (byte) -20);
                    class341.field5443.method2370(class243.field3962, (byte) -20);
                    class341.field5443.method2370(class4.field59, (byte) -20);
                    class341.field5443.method2370(89, (byte) -20);
                    class341.field5443.method2359(-805606200, class218.field3632.field2036);
                    class341.field5443.method2359(-805606200, class218.field3632.field1985);
                    class341.field5443.method2370(class75.field1229, (byte) -20);
                    class341.field5443.method2370(63, (byte) -20);
                }
            }
        }
        if (var4 == 42 && class107.field1783 == null) {
            class193.method1453(var2, var3, -6140);
            class107.field1783 = class60.method557(var3, 107, var2);
            class258.method1793(class107.field1783, 0);
        }
        if (var4 == 19) {
            class215.field3612 = 2;
            class20.field304 = 0;
            class207.field3513 = class218.field3635;
            class282.field4465++;
            class98.field1603 = class226.field3812;
            class341.field5443.method26(109, 7);
            class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            class341.field5443.method2366(-33, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class341.field5443.method2366(-65, var3 + class34.field484);
            class341.field5443.method2318(var2 + class24.field345, 122);
        }
        if (var4 == 51) {
            class20.field304 = 0;
            class215.field3612 = 2;
            class147.field2647++;
            class207.field3513 = class218.field3635;
            class98.field1603 = class226.field3812;
            class341.field5443.method26(211, 7);
            class341.field5443.method2366(77, class24.field345 + var2);
            class341.field5443.method2359(-805606200, var3 + class34.field484);
            class341.field5443.method2359(-805606200, var5);
            class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
        }
        if (var4 == 39) {
            class215.field3612 = 2;
            class166.field2911++;
            class207.field3513 = class218.field3635;
            class98.field1603 = class226.field3812;
            class20.field304 = 0;
            class341.field5443.method26(95, 7);
            class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            class341.field5443.method2366(64, class34.field484 + var3);
            class341.field5443.method2359(-805606200, class24.field345 + var2);
            class341.field5443.method2324(class230.field3839, true);
            class341.field5443.method2366(114, class17.field281);
            class341.field5443.method2318(Integer.MAX_VALUE & (int) (var6 >>> 32), 123);
        }
        if (var4 == 33) {
            class278 var21 = class320.field5071[var5];
            if (var21 != null) {
                class207.field3513 = class218.field3635;
                class287.field4572++;
                class98.field1603 = class226.field3812;
                class20.field304 = 0;
                class215.field3612 = 2;
                class341.field5443.method26(63, 7);
                class341.field5443.method2318(var5, 121);
                class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            }
        }
        if (var4 == 38 || var4 == 1002) {
            class249.method1751(var5, var2, class241.field3944[arg0], 89, var3);
        }
        if (var4 == 29) {
            class341.field5443.method26(137, 7);
            class341.field5443.method2359(-805606200, var2);
            class209.field3551++;
            class341.field5443.method2316(-23240, var3);
            class341.field5443.method2334((byte) 2, var5);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 1001) {
            class7.field92++;
            class20.field304 = 0;
            class98.field1603 = class226.field3812;
            class215.field3612 = 2;
            class207.field3513 = class218.field3635;
            class341.field5443.method26(102, 7);
            class341.field5443.method2334((byte) 2, var5);
        }
        if (var4 == 49) {
            boolean var22 = true;
            class137 var23 = class146.method1167(1169843632, var3);
            if (var23.field2386 > 0) {
                var22 = class201.method1514((byte) -19, var23);
            }
            if (var22) {
                class341.field5443.method26(25, 7);
                class341.field5443.method2320(-6128, var3);
                class263.field4258++;
            }
        }
        if (var4 == 21) {
            class341.field5443.method26(25, 7);
            class263.field4258++;
            class341.field5443.method2320(-6128, var3);
            class137 var24 = class146.method1167(1169843632, var3);
            if (var24.field2375 != null && var24.field2375[0][0] == 5) {
                int var25 = var24.field2375[0][1];
                class116.field2006[var25] = 1 - class116.field2006[var25];
                class300.method2073(124, var25);
            }
        }
        if (var4 == 30) {
            class205 var26 = class135.field2359[var5];
            if (var26 != null) {
                class98.field1603 = class226.field3812;
                class20.field304 = 0;
                class215.field3612 = 2;
                class207.field3513 = class218.field3635;
                class72.field1207++;
                class341.field5443.method26(93, 7);
                class341.field5443.method2318(var5, 127);
                class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
            }
        }
        if (var4 == 6) {
            class215.field3612 = 2;
            class207.field3513 = class218.field3635;
            class20.field304 = 0;
            class98.field1603 = class226.field3812;
            class94.field1474++;
            class341.field5443.method26(13, 7);
            class341.field5443.method2359(-805606200, var5);
            class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            class341.field5443.method2366(69, class34.field484 + var3);
            class341.field5443.method2334((byte) 2, var2 + class24.field345);
            class341.field5443.method2374(108, class230.field3839);
            class341.field5443.method2318(class17.field281, 118);
        }
        if (var4 == 17) {
            class98.field1603 = class226.field3812;
            class207.field3513 = class218.field3635;
            class215.field3612 = 2;
            class20.field304 = 0;
            class341.field5443.method26(72, 7);
            class341.field5443.method2318(class30.field432, 125);
            class74.field1221++;
            class341.field5443.method2336(class97.field1572[82] ? 1 : 0, 15459);
            class341.field5443.method2318(class34.field484 + var3, 125);
            class341.field5443.method2359(-805606200, class24.field345 + var2);
            class341.field5443.method2366(-23, class159.field2808);
            class341.field5443.method2320(-6128, class162.field2870);
            class341.field5443.method2359(-805606200, var5);
        }
        if (var4 == 35) {
            class341.field5443.method26(172, 7);
            class346.field5490++;
            class341.field5443.method2334((byte) 2, var5);
            class341.field5443.method2366(-39, var2);
            class341.field5443.method2324(var3, true);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        int var27 = -91 % ((arg1 + 34) / 54);
        if (var4 == 16) {
            class205 var28 = class135.field2359[var5];
            if (var28 != null) {
                class238.field3900++;
                class207.field3513 = class218.field3635;
                class20.field304 = 0;
                class98.field1603 = class226.field3812;
                class215.field3612 = 2;
                class341.field5443.method26(66, 7);
                class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
                class341.field5443.method2366(62, var5);
            }
        }
        if (var4 == 1006) {
            class20.field304 = 0;
            class98.field1603 = class226.field3812;
            class207.field3513 = class218.field3635;
            class215.field3612 = 2;
            class278 var29 = class320.field5071[var5];
            if (var29 != null) {
                class12 var30 = var29.field4413;
                if (var30.field179 != null) {
                    var30 = var30.method122(-79);
                }
                if (var30 != null) {
                    class341.field5443.method26(143, 7);
                    class341.field5443.method2366(96, var30.field151);
                    class34.field488++;
                }
            }
        }
        if (var4 == 1005) {
            class215.field3612 = 2;
            class20.field304 = 0;
            class89.field1413++;
            class207.field3513 = class218.field3635;
            class98.field1603 = class226.field3812;
            class341.field5443.method26(41, 7);
            class341.field5443.method2359(-805606200, var5);
        }
        if (var4 == 20) {
            class278 var31 = class320.field5071[var5];
            if (var31 != null) {
                class51.field795++;
                class207.field3513 = class218.field3635;
                class20.field304 = 0;
                class98.field1603 = class226.field3812;
                class215.field3612 = 2;
                class341.field5443.method26(28, 7);
                class341.field5443.method2318(var5, 122);
                class341.field5443.method2336(class97.field1572[82] ? 1 : 0, 15459);
            }
        }
        if (var4 == 10) {
            class233.field3868++;
            class341.field5443.method26(43, 7);
            class341.field5443.method2359(-805606200, var2);
            class341.field5443.method2318(var5, 120);
            class341.field5443.method2324(var3, true);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 60) {
            class278 var32 = class320.field5071[var5];
            if (var32 != null) {
                class20.field304 = 0;
                class215.field3612 = 2;
                class269.field4303++;
                class98.field1603 = class226.field3812;
                class207.field3513 = class218.field3635;
                class341.field5443.method26(201, 7);
                class341.field5443.method2336(class97.field1572[82] ? 1 : 0, 15459);
                class341.field5443.method2366(77, var5);
            }
        }
        if (var4 == 41) {
            class20.field304 = 0;
            class207.field3513 = class218.field3635;
            class98.field1603 = class226.field3812;
            class215.field3612 = 2;
            class209.field3539++;
            class341.field5443.method26(187, 7);
            class341.field5443.method2334((byte) 2, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
            class341.field5443.method2359(-805606200, class34.field484 + var3);
            class341.field5443.method2366(78, class24.field345 + var2);
        }
        if (var4 == 2) {
            class57.field878++;
            class341.field5443.method26(80, 7);
            class341.field5443.method2366(-113, var2);
            class341.field5443.method2320(-6128, var3);
            class341.field5443.method2366(-117, var5);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 7) {
            class283.field4490++;
            class341.field5443.method26(246, 7);
            class341.field5443.method2316(-23240, var3);
            class341.field5443.method2334((byte) 2, var2);
            class341.field5443.method2318(var5, 126);
            class100.field1615 = 0;
            class119.field2070 = class146.method1167(1169843632, var3);
            class344.field5473 = var2;
        }
        if (var4 == 57) {
            class205 var33 = class135.field2359[var5];
            if (var33 != null) {
                class215.field3612 = 2;
                class254.field4093++;
                class20.field304 = 0;
                class207.field3513 = class218.field3635;
                class98.field1603 = class226.field3812;
                class341.field5443.method26(79, 7);
                class341.field5443.method2359(-805606200, class159.field2808);
                class341.field5443.method2351(0, class97.field1572[82] ? 1 : 0);
                class341.field5443.method2366(86, class30.field432);
                class341.field5443.method2374(42, class162.field2870);
                class341.field5443.method2366(-122, var5);
            }
        }
        if (var4 == 12) {
            class20.method200(54);
            class137 var34 = class146.method1167(1169843632, var3);
            class93.field1458 = 1;
            class159.field2808 = var5;
            class30.field432 = var2;
            class162.field2870 = var3;
            class258.method1793(var34, 0);
            class207.field3516 = "<col=ff9040>" + class5.method31(-1731690365, var5).field2346 + "<col=ffffff>";
            if (class207.field3516 == null) {
                class207.field3516 = "null";
            }
            return;
        }
        if (var4 == 37) {
            class278 var35 = class320.field5071[var5];
            if (var35 != null) {
                class215.field3612 = 2;
                class98.field1603 = class226.field3812;
                class207.field3513 = class218.field3635;
                class295.field4722++;
                class20.field304 = 0;
                class341.field5443.method26(199, 7);
                class341.field5443.method2334((byte) 2, var5);
                class341.field5443.method2318(class159.field2808, 123);
                class341.field5443.method2359(-805606200, class30.field432);
                class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
                class341.field5443.method2320(-6128, class162.field2870);
            }
        }
        if (var4 == 48) {
            class263.field4258++;
            class341.field5443.method26(25, 7);
            class341.field5443.method2320(-6128, var3);
            class137 var36 = class146.method1167(1169843632, var3);
            if (var36.field2375 != null && var36.field2375[0][0] == 5) {
                int var37 = var36.field2375[0][1];
                if (class116.field2006[var37] != var36.field2414[0]) {
                    class116.field2006[var37] = var36.field2414[0];
                    class300.method2073(123, var37);
                }
            }
        }
        if (var4 == 31) {
            class98.field1603 = class226.field3812;
            class207.field3513 = class218.field3635;
            class8.field106++;
            class215.field3612 = 2;
            class20.field304 = 0;
            class341.field5443.method26(90, 7);
            class341.field5443.method2318(class34.field484 + var3, 118);
            class341.field5443.method2359(-805606200, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class341.field5443.method2318(var2 + class24.field345, 125);
            class341.field5443.method2343(class97.field1572[82] ? 1 : 0, true);
        }
        if (var4 == 1003) {
            class98.field1603 = class226.field3812;
            class207.field3513 = class218.field3635;
            class20.field304 = 0;
            class215.field3612 = 2;
            class356.field5611++;
            class341.field5443.method26(113, 7);
            class341.field5443.method2370(class97.field1572[82] ? 1 : 0, (byte) -20);
            class341.field5443.method2318(class34.field484 + var3, 123);
            class341.field5443.method2334((byte) 2, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class341.field5443.method2334((byte) 2, class24.field345 + var2);
        }
        if (class93.field1458 != 0) {
            class93.field1458 = 0;
            class258.method1793(class146.method1167(1169843632, class162.field2870), 0);
        }
        if (class179.field3027) {
            class20.method200(77);
        }
        if (class119.field2070 != null && class100.field1615 == 0) {
            class258.method1793(class119.field2070, 0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 1048)
    public final void method182(int arg0) {
        if (arg0 != 25833) {
            this.field295 = 96;
        }
        field286++;
        class154.method1238(0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V", line = 1062)
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class105.method899(false, class135.field2358, class90.field1428, arg0);
        field292++;
        int var7 = class105.method899(false, class135.field2358, class90.field1428, arg4);
        int var8 = class105.method899(false, class310.field4916, class170.field2944, arg1);
        int var9 = -106 / ((arg2 - 72) / 48);
        int var10 = class105.method899(false, class310.field4916, class170.field2944, arg5);
        for (int var11 = var6; var11 <= var7; var11++) {
            class317.method2184(var10, (byte) -55, class64.field1007[var11], arg3, var8);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[I", line = 1099)
    public final int[] method111(int arg0, int arg1) {
        field288++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (arg0 != 4) {
            this.field295 = 35;
        }
        if (this.field4961.field3451) {
            int var4 = this.field296 >> 1;
            int[][] var5 = this.field4961.method1522(0);
            Random var6 = new Random((long) this.field289);
            for (int var7 = 0; var7 < this.field294; var7++) {
                int var8 = this.field296 > 0 ? this.field287 + class129.method1075(this.field296, 19192, var6) - var4 : this.field287;
                int var9 = (var8 & 0xFFB) >> 4;
                int var10 = class129.method1075(class133.field2269, 19192, var6);
                int var11 = class129.method1075(class77.field1247, 19192, var6);
                int var12 = (class209.field3548[var9] * this.field295 >> 12) + var10;
                int var13 = (class17.field284[var9] * this.field295 >> 12) + var11;
                int var14 = var12 - var10;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = 1024 - (class129.method1075(4096, 19192, var6) >> 2);
                    int var23 = var13 - var11;
                    int var24 = var12 - var10;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var25 = 2048 / var24;
                    int var26 = var13 > var11 ? 1 : -1;
                    int var27 = -var24 / 2;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var27 += var23;
                        int var29 = (var28 - var10) * var25 + var22 + 1024;
                        int var30 = var28 & class297.field4731;
                        int var31 = class132.field2262 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var27 > 0) {
                            var21 += var26;
                            var27 -= var24;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V", line = 1233)
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field291++;
        class66 var5 = (class66) class70.field1146.method732((long) arg4, true);
        if (var5 == null) {
            var5 = new class66();
            class70.field1146.method725((long) arg4, var5, arg3 ^ 0x1);
        }
        if (arg3 != 0) {
            field299 = 56;
        }
        if (arg2 >= var5.field1067.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1067.length; var8++) {
                var6[var8] = var5.field1067[var8];
                var7[var8] = var5.field1071[var8];
            }
            for (int var9 = var5.field1067.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1067 = var6;
            var5.field1071 = var7;
        }
        var5.field1067[arg2] = arg0;
        var5.field1071[arg2] = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILpi;)V", line = 1306)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg0 == 0) {
            this.field289 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field294 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field295 = arg2.method2364(-9069);
        } else if (arg0 == 3) {
            this.field287 = arg2.method2339((byte) -46);
        } else if (arg0 == 4) {
            this.field296 = arg2.method2339((byte) -46);
        }
        if (arg1 != -17848) {
            method181(10, (byte) 107);
        }
        field293++;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)Lql;", line = 1351)
    public static final class20 method186(int arg0, int arg1) {
        field285++;
        if (class163.field2883 && class75.field1228 <= arg1 && arg1 <= class295.field4719) {
            return arg0 == 2 ? class13.field212[arg1 - class75.field1228] : (class20) null;
        } else {
            return null;
        }
    }
}
