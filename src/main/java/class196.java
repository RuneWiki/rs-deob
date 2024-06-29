import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class196 extends class513 {

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z")
    public static final boolean method1421(int arg0, int arg1, int arg2) {
        field2990++;
        if (arg2 == 4) {
            return class610.method3461(21906, arg0, arg1) | (arg1 & 0x70000) != 0 || class614.method3479(arg0, arg2 ^ 0xFFFFFF93, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I")
    public static final int method1422(int arg0) {
        if (class111.field1911.field6769.method3191((byte) 112) == 0) {
            for (int var1 = 0; var1 < class399.field5508; var1++) {
                if (class257.field3606[var1].method2154(118) == 's' || class257.field3606[var1].method2154(-72) == 'S') {
                    class111.field1911.method2823(true, class111.field1911.field6769, 1);
                    class464.field6311 = true;
                    break;
                }
            }
        }
        field2988++;
        if (arg0 <= 123) {
            return -90;
        }
        if (class337.field4540 == class256.field3596) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class197.method1423(1);
            if (class382.field5191 == 0L) {
                class382.field5191 = var4;
            }
            if (var3 > 16384 && var4 - class382.field5191 < 5000L) {
                if ((var4 - class680.field9466) > 1000L) {
                    System.gc();
                    class680.field9466 = var4;
                }
                return 0;
            }
        }
        if (class337.field4545 == class256.field3596) {
            if (class352.field4697 == null) {
                class352.field4697 = new class369(class336.field4527, class499.field6818, class658.field9104, class142.field2415);
            }
            if (!class352.field4697.method2247(5)) {
                return 0;
            }
            class337.method2106(true, 0, -125, null);
            class35.field587 = !class673.method3798((byte) -110);
            class47.field727 = class277.method1783(class35.field587 ? 34 : 32, false, 4760, 1);
            class773.field10695 = class277.method1783(33, false, 4760, 1);
            class564.field7989 = class277.method1783(13, false, 4760, 1);
        }
        if (class337.field4546 == class256.field3596) {
            boolean var6 = class773.field10695.method3721(false);
            int var7 = class473.field6407[33].method2294((byte) -118);
            int var8 = var7 + class473.field6407[class35.field587 ? 34 : 32].method2294((byte) -128);
            int var9 = var8 + class473.field6407[13].method2294((byte) -121);
            int var10 = var9 + (var6 ? 100 : class773.field10695.method3722((byte) 69));
            if (var10 != 400) {
                return var10 / 4;
            }
            class534.field7224 = class47.field727.method3739((byte) 68);
            class583.field8257 = class773.field10695.method3739((byte) 66);
            class766.method4219(class47.field727, false);
            int var11 = class111.field1911.field6727.method1779((byte) 92);
            class210.field3139 = new class146(class177.field2797, class464.field6309, class773.field10695);
            int[] var12 = class210.field3139.method1178(var11, (byte) 93);
            if (var12.length == 0) {
                var12 = class210.field3139.method1178(0, (byte) 93);
            }
            class447 var13 = new class447(class47.field727, class564.field7989);
            if (var12.length > 0) {
                class323.field4423 = new class775[var12.length];
                for (int var14 = 0; var14 < class323.field4423.length; var14++) {
                    class323.field4423[var14] = new class101(class210.field3139.method1177(125, var12[var14]), var13);
                }
            }
        }
        if (class337.field4550 == class256.field3596) {
            class440.method2562(class599.method3403(1), class564.field7989, (byte) 3, class47.field727);
        }
        if (class337.field4551 == class256.field3596) {
            int var15 = class582.method3344(-117);
            int var16 = class620.method3493(89);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class337.field4552 == class256.field3596) {
            if (class323.field4423 != null && class323.field4423.length > 0) {
                if (class323.field4423[0].method876(true) < 100) {
                    return 0;
                }
                if (class323.field4423.length > 1 && class210.field3139.method1174(0) && class323.field4423[1].method876(true) < 100) {
                    return 0;
                }
            }
            class223.method1519(class95.field1472, 8735);
            class366.method2234(22473, class95.field1472);
            class139.method1142(2, 1);
        }
        if (class337.field4553 == class256.field3596) {
            for (int var17 = 0; var17 < 4; var17++) {
                class711.field9798[var17] = class257.method1680(class483.field6515, class65.field926, -114);
            }
        }
        if (class337.field4554 == class256.field3596) {
            class346.field4664 = class277.method1783(8, false, 4760, 1);
            class185.field2875 = class277.method1783(0, false, 4760, 1);
            class373.field5068 = class277.method1783(1, false, 4760, 1);
            class527.field7156 = class277.method1783(2, false, 4760, 1);
            class341.field4600 = class277.method1783(3, false, 4760, 1);
            class312.field4256 = class277.method1783(4, false, 4760, 1);
            class193.field2947 = class277.method1783(5, true, 4760, 1);
            class357.field4898 = class277.method1783(6, true, 4760, 1);
            class109.field1705 = class277.method1783(7, false, 4760, 1);
            class661.field9153 = class277.method1783(9, false, 4760, 1);
            class530.field7185 = class277.method1783(10, false, 4760, 1);
            class660.field9142 = class277.method1783(11, false, 4760, 1);
            class687.field9554 = class277.method1783(12, false, 4760, 1);
            class295.field4032 = class277.method1783(14, false, 4760, 1);
            class483.field6528 = class277.method1783(15, false, 4760, 1);
            class649.field8977 = class277.method1783(16, false, 4760, 1);
            class249.field3517 = class277.method1783(17, false, 4760, 1);
            class735.field10152 = class277.method1783(18, false, 4760, 1);
            class153.field2523 = class277.method1783(19, false, 4760, 1);
            class783.field10760 = class277.method1783(20, false, 4760, 1);
            class713.field9816 = class277.method1783(21, false, 4760, 1);
            class602.field8423 = class277.method1783(22, false, 4760, 1);
            class744.field10270 = class277.method1783(23, true, 4760, 1);
            class683.field9512 = class277.method1783(24, false, 4760, 1);
            class619.field8622 = class277.method1783(25, false, 4760, 1);
            class341.field4603 = class277.method1783(26, true, 4760, 1);
            class369.field4998 = class277.method1783(27, false, 4760, 1);
            class215.field3192 = class277.method1783(28, true, 4760, 1);
            class496.field6788 = class277.method1783(29, false, 4760, 1);
            class205.field3093 = class277.method1783(30, true, 4760, 1);
            class365.field4958 = class277.method1783(31, true, 4760, 1);
            class421.field5755 = class277.method1783(36, true, 4760, 2);
        }
        if (class337.field4555 == class256.field3596) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class473.field6407[var19] != null) {
                    var18 += class473.field6407[var19].method2294((byte) -128) * class462.field6290[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class408.field5600 < 0) {
                    class408.field5600 = var18;
                }
                return (var18 - class408.field5600) * 100 / (100 - class408.field5600);
            }
            class554.method3189(1, class346.field4664);
            class440.method2562(class599.method3403(1), class564.field7989, (byte) 3, class346.field4664);
        }
        if (class337.field4556 == class256.field3596) {
            if (class483.field6535 == -1) {
                class483.field6535 = class357.field4898.method3738(-1, "scape main");
            }
            class457.method2634(22050);
            class139.method1142(2, 2);
        }
        if (class337.field4557 == class256.field3596) {
            class652.method3655(class205.field3093, class630.field8751, true);
        }
        if (class337.field4558 == class256.field3596) {
            int var20 = class633.method3543(-18473);
            if (var20 < 100) {
                return var20;
            }
            class714.method3974(0, class215.field3192.method3742(5, 1));
            class60.method422(6699, class215.field3192.method3742(5, 3));
            class580.field8199 = new class20(class215.field3192);
        }
        if (class337.field4559 == class256.field3596) {
            if (class542.field7390 != -1 && !class109.field1705.method3720(class542.field7390, 0, 0)) {
                return 99;
            }
            class583.field8256 = new class614(class341.field4603, class661.field9153, class346.field4664);
            class117.field2153 = new class143(class177.field2797, class464.field6309, class527.field7156);
            class706.field9695 = new class16(class177.field2797, class464.field6309, class527.field7156, class580.field8199);
            class345.field4639 = new class460(class177.field2797, class464.field6309, class527.field7156, class346.field4664);
            class415.field5687 = new class323(class177.field2797, class464.field6309, class249.field3517);
            class523.field7116 = new class39(class177.field2797, class464.field6309, class527.field7156);
            class713.field9818 = new class41(class177.field2797, class464.field6309, class527.field7156);
            class399.field5506 = new class577(class177.field2797, class464.field6309, class527.field7156, class346.field4664);
            class178.field2808 = new class469(class177.field2797, class464.field6309, class527.field7156, class109.field1705);
            class108.field1698 = new class647(class177.field2797, class464.field6309, class527.field7156);
            class526.field7142 = new class264(class177.field2797, class464.field6309, class527.field7156);
            class414.field5670 = new class381(class177.field2797, class464.field6309, true, class649.field8977, class109.field1705);
            class430.field5863 = new class726(class177.field2797, class464.field6309, class527.field7156, class346.field4664);
            class636.field8785 = new class340(class177.field2797, class464.field6309, class527.field7156, class346.field4664);
            class495.field6783 = new class318(class177.field2797, class464.field6309, true, class735.field10152, class109.field1705);
            class143.field2427 = new class195(class177.field2797, class464.field6309, true, class117.field2153, class153.field2523, class109.field1705);
            class769.field10604 = new class654(class177.field2797, class464.field6309, class527.field7156);
            class108.field1696 = new class163(class177.field2797, class464.field6309, class783.field10760, class185.field2875, class373.field5068);
            class780.field10746 = new class251(class177.field2797, class464.field6309, class527.field7156);
            class498.field6811 = new class725(class177.field2797, class464.field6309, class527.field7156);
            class707.field9727 = new class347(class177.field2797, class464.field6309, class713.field9816, class109.field1705);
            class770.field10616 = new class10(class177.field2797, class464.field6309, class527.field7156);
            class97.field1561 = new class790(class177.field2797, class464.field6309, class527.field7156);
            class281.field3904 = new class562(class177.field2797, class464.field6309, class527.field7156);
            class201.field3056 = new class299(class177.field2797, class464.field6309, class602.field8423);
            class637.field8794 = new class791(class177.field2797, class464.field6309, class527.field7156);
            class624.field8698 = new class777(class177.field2797, class464.field6309, class527.field7156);
            class246.method1642(class564.field7989, class341.field4600, class109.field1705, class346.field4664, (byte) 43);
            class733.method4071(class496.field6788, (byte) 124);
            class465.field6312 = new class341(class464.field6309, class683.field9512, class619.field8622);
            class530.field7179 = new class269(class464.field6309, class683.field9512, class619.field8622, new class13());
            class210.method1481((byte) 73);
            class414.field5670.method2321(class111.field1911.field6734.method3639((byte) 90) == 0, 500);
            class694.field9613 = new class21();
            class463.method2677(125);
            class157.method1213((byte) -78, class369.field4998);
            class322.method2055(class583.field8256, (byte) -128, class109.field1705);
            class431 var21 = new class431(class530.field7185.method3726(-82, "huffman", ""));
            class724.method4019(true, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class598.field8377 = class403.method2410((byte) -52);
            class682.field9503 = new class659(true, class630.field8751);
        }
        if (class337.field4561 == class256.field3596) {
            int var22 = class544.method3066(true, class346.field4664) + class450.method2609(0, true);
            int var23 = class457.method2635((byte) -109) + class620.method3493(80);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (class337.field4562 == class256.field3596) {
            class64.method439(class744.field10270, class523.field7116, class713.field9818, class414.field5670, class430.field5863, class636.field8785, class694.field9613);
        }
        if (class337.field4563 == class256.field3596) {
            class617.field8593 = new boolean[class281.field3904.field7969];
            class46.field724 = new int[class281.field3904.field7969];
            class74.field1071 = new String[class97.field1561.field10827];
            for (int var24 = 0; var24 < class281.field3904.field7969; var24++) {
                if (class281.field3904.method3254(true, var24).field4001 == 0) {
                    class617.field8593[var24] = true;
                    class647.field8938++;
                }
                class46.field724[var24] = -1;
            }
            class229.method1562((byte) 67);
            class434.field5913 = class341.field4600.method3738(-1, "loginscreen");
            class33.field559 = class341.field4600.method3738(-1, "lobbyscreen");
            class193.field2947.method3719(6494, true, false);
            class357.field4898.method3719(6494, true, true);
            class346.field4664.method3719(6494, true, true);
            class564.field7989.method3719(6494, true, true);
            class530.field7185.method3719(6494, true, true);
            class341.field4600.method3719(6494, true, true);
            class318.field4333 = true;
            class527.field7156.field9185 = 2;
            class249.field3517.field9185 = 2;
            class649.field8977.field9185 = 2;
            class735.field10152.field9185 = 2;
            class153.field2523.field9185 = 2;
            class783.field10760.field9185 = 2;
            class713.field9816.field9185 = 2;
        }
        if (class337.field4564 == class256.field3596) {
            if (!class659.method3706(104, class434.field5913)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class431.field5870[class434.field5913].length; var26++) {
                class17 var27 = class431.field5870[class434.field5913][var26];
                if (var27.field352 == 5 && var27.field303 != -1 && !class346.field4664.method3720(var27.field303, 0, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class337.field4565 == class256.field3596) {
            class22.method148(true, 1572442825);
        }
        if (class337.field4566 == class256.field3596) {
            class695.field9619.method3416(false);
            try {
                class146.field2463.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class323.field4423 = null;
            class773.field10695 = null;
            class210.field3139 = null;
            class146.field2463 = null;
            class47.field727 = null;
            class695.field9619 = null;
            class101.method883((byte) -83);
            class714.field9824 = class111.field1911.field6769.method3191((byte) 115) == 1;
            class111.field1911.method2823(true, class111.field1911.field6769, 1);
            if (class714.field9824) {
                class111.field1911.method2823(true, class111.field1911.field6753, 0);
            } else if (class111.field1911.field6753.field9302 && class682.field9503.field9139 < 512 && class682.field9503.field9139 != 0) {
                class111.field1911.method2823(true, class111.field1911.field6753, 0);
            }
            class307.method1957(0);
            if (class714.field9824) {
                class624.method3517(false, 0, 0);
            } else {
                class624.method3517(false, 0, class111.field1911.field6753.method3784((byte) 108));
            }
            class66.method513(-1, 125, class111.field1911.field6714.method2951((byte) 67), -1, false);
            class223.method1519(class95.field1472, 8735);
            class366.method2234(22473, class95.field1472);
            class654.method3676(true, class95.field1472, class346.field4664);
            class659.method3704((byte) -96, class70.field1037);
        }
        return class590.method3382(100);
    }
}
