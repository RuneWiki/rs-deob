import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class190 extends class613 {

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "Lfh;")
    public class653 field2625 = new class653();

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "Lfq;")
    public class204 field2629 = new class204();

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "Lcea;")
    private class216 field2621;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "Lhg;")
    public static class693 field2618 = new class693(42, 0);

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Lria;")
    public static class288 field2623;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
    public static final int method1275(byte arg0) {
        field2619++;
        if (class748.field10451.field10391.method3250((byte) -43) == 0) {
            for (int var1 = 0; var1 < class426.field5715; var1++) {
                if (class26.field472[var1].method2106(-3733) == 's' || class26.field472[var1].method2106(-3733) == 'S') {
                    class748.field10451.method4150(class748.field10451.field10391, 1, -5);
                    class425.field5711 = true;
                    break;
                }
            }
        }
        if (class607.field8439 == class306.field4010) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class446.method2525(500);
            if (class195.field2667 == 0L) {
                class195.field2667 = var4;
            }
            if (var3 > 16384 && var4 - class195.field2667 < 5000L) {
                if (var4 - class573.field8047 > 1000L) {
                    System.gc();
                    class573.field8047 = var4;
                }
                return 0;
            }
        }
        if (class607.field8439 == class306.field4018) {
            if (class706.field9779 == null) {
                class706.field9779 = new class590(class437.field5817, class223.field2977, class263.field3316, class474.field6385);
            }
            if (!class706.field9779.method3354((byte) 0)) {
                return 0;
            }
            class378.method2163(0, (byte) -128, true, null);
            class459.field6123 = !class685.method3848(true);
            class474.field6388 = class282.method1682(1, -1, false, class459.field6123 ? 34 : 32);
            class214.field2827 = class282.method1682(1, -1, false, 33);
            class445.field5928 = class282.method1682(1, -1, false, 13);
        }
        if (class607.field8439 == class306.field4019) {
            boolean var6 = class214.field2827.method3172(25);
            int var7 = class523.field7321[33].method2695(-2);
            int var8 = var7 + class523.field7321[class459.field6123 ? 34 : 32].method2695(-2);
            int var9 = var8 + class523.field7321[13].method2695(-2);
            int var10 = var9 + (var6 ? 100 : class214.field2827.method3170((byte) -56));
            if (var10 != 400) {
                return var10 / 4;
            }
            class146.field2043 = class474.field6388.method3185(true);
            class409.field5185 = class214.field2827.method3185(true);
            class315.method1869(class474.field6388, 84);
            int var11 = class748.field10451.field10415.method3188((byte) 60);
            class654.field9099 = new class549(class293.field3867, class243.field3143, class214.field2827);
            int[] var12 = class654.field9099.method3192(var11, (byte) -92);
            if (var12.length == 0) {
                var12 = class654.field9099.method3192(0, (byte) -120);
            }
            class109 var13 = new class109(class474.field6388, class445.field5928);
            if (var12.length > 0) {
                class699.field9728 = new class502[var12.length];
                for (int var14 = 0; var14 < class699.field9728.length; var14++) {
                    class699.field9728[var14] = new class337(class654.field9099.method3190((byte) -103, var12[var14]), var13);
                }
            }
        }
        if (class607.field8439 == class306.field4020) {
            class242.method1511(class75.method675(0), class474.field6388, class445.field5928, -83);
        }
        if (class607.field8439 == class306.field4021) {
            int var15 = class478.method2752(503);
            int var16 = class440.method2504(-109);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class607.field8439 == class306.field4022) {
            if (class699.field9728 != null && class699.field9728.length > 0) {
                if (class699.field9728[0].method1939(111) < 100) {
                    return 0;
                }
                if (class699.field9728.length > 1 && class654.field9099.method3191(44) && class699.field9728[1].method1939(102) < 100) {
                    return 0;
                }
            }
            class365.method2104(class386.field4930, 13);
            class422.method2348(class386.field4930, -107);
            class571.method3275(27461, 1);
        }
        if (class607.field8439 == class306.field4023) {
            for (int var17 = 0; var17 < 4; var17++) {
                class526.field7350[var17] = class106.method855(class543.field7597, class409.field5183, 65535);
            }
        }
        if (class607.field8439 == class306.field4024) {
            class268.field3369 = class282.method1682(1, -1, false, 8);
            class117.field1725 = class282.method1682(1, -1, false, 0);
            class443.field5876 = class282.method1682(1, -1, false, 1);
            class531.field7380 = class282.method1682(1, -1, false, 2);
            class210.field2782 = class282.method1682(1, -1, false, 3);
            class695.field9672 = class282.method1682(1, -1, false, 4);
            class238.field3094 = class282.method1682(1, -1, true, 5);
            class87.field1210 = class282.method1682(1, -1, true, 6);
            class220.field2956 = class282.method1682(1, -1, false, 7);
            class163.field2253 = class282.method1682(1, -1, false, 9);
            class482.field6563 = class282.method1682(1, -1, false, 10);
            class417.field5330 = class282.method1682(1, -1, false, 11);
            class329.field4206 = class282.method1682(1, -1, false, 12);
            class652.field9072 = class282.method1682(1, -1, false, 14);
            class641.field8904 = class282.method1682(1, -1, false, 15);
            class625.field8599 = class282.method1682(1, -1, false, 16);
            class627.field8636 = class282.method1682(1, -1, false, 17);
            class155.field2129 = class282.method1682(1, -1, false, 18);
            class560.field7904 = class282.method1682(1, -1, false, 19);
            class88.field1224 = class282.method1682(1, -1, false, 20);
            class229.field3018 = class282.method1682(1, -1, false, 21);
            class761.field10615 = class282.method1682(1, -1, false, 22);
            class55.field758 = class282.method1682(1, -1, true, 23);
            class395.field5031 = class282.method1682(1, -1, false, 24);
            class475.field6389 = class282.method1682(1, -1, false, 25);
            class571.field8044 = class282.method1682(1, -1, true, 26);
            class748.field10463 = class282.method1682(1, -1, false, 27);
            class234.field3059 = class282.method1682(1, -1, true, 28);
            class94.field1324 = class282.method1682(1, -1, false, 29);
            class441.field5870 = class282.method1682(1, -1, true, 30);
            class168.field2329 = class282.method1682(1, -1, true, 31);
            class636.field8776 = class282.method1682(2, -1, true, 36);
        }
        if (class607.field8439 == class306.field4025) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class523.field7321[var19] != null) {
                    var18 += class523.field7321[var19].method2695(-2) * class749.field10470[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class632.field8725 < 0) {
                    class632.field8725 = var18;
                }
                return (var18 - class632.field8725) * 100 / (100 - class632.field8725);
            }
            class198.method1307(class268.field3369, 0);
            class242.method1511(class75.method675(0), class268.field3369, class445.field5928, -99);
        }
        if (class607.field8439 == class306.field4026) {
            if (class359.field4655 == -1) {
                class359.field4655 = class87.field1210.method3161((byte) -117, "scape main");
            }
            class735.method4100(true);
            class571.method3275(27461, 2);
        }
        if (class607.field8439 == class306.field4027) {
            class92.method739(class162.field2227, class441.field5870, true);
        }
        if (class607.field8439 == class306.field4028) {
            int var20 = class540.method3096(21368);
            if (var20 < 100) {
                return var20;
            }
            class343.method1972(class234.field3059.method3166((byte) 125, 1), (byte) 103);
            class346.method1981(20810, class234.field3059.method3166((byte) 125, 3));
        }
        if (class607.field8439 == class306.field4029) {
            if (class180.field2534 != -1 && !class220.field2956.method3157(0, 0, class180.field2534)) {
                return 99;
            }
            class124.field1793 = new class650(class571.field8044, class163.field2253, class268.field3369);
            class513.field7206 = new class99(class293.field3867, class243.field3143, class531.field7380);
            class729.field10151 = new class176(class293.field3867, class243.field3143, class531.field7380);
            class416.field5301 = new class3(class293.field3867, class243.field3143, class531.field7380, class268.field3369);
            class180.field2529 = new class721(class293.field3867, class243.field3143, class627.field8636);
            class732.field10185 = new class142(class293.field3867, class243.field3143, class531.field7380);
            class206.field2728 = new class735(class293.field3867, class243.field3143, class531.field7380);
            class555.field7728 = new class127(class293.field3867, class243.field3143, class531.field7380, class268.field3369);
            class679.field9486 = new class218(class293.field3867, class243.field3143, class531.field7380, class220.field2956);
            class343.field4343 = new class296(class293.field3867, class243.field3143, class531.field7380);
            class12.field150 = new class67(class293.field3867, class243.field3143, class531.field7380);
            client.field3995 = new class597(class293.field3867, class243.field3143, true, class625.field8599, class220.field2956);
            class424.field5399 = new class536(class293.field3867, class243.field3143, class531.field7380, class268.field3369);
            class52.field741 = new class64(class293.field3867, class243.field3143, class531.field7380, class268.field3369);
            class300.field3941 = new class687(class293.field3867, class243.field3143, true, class155.field2129, class220.field2956);
            class21.field381 = new class264(class293.field3867, class243.field3143, true, class513.field7206, class560.field7904, class220.field2956);
            class639.field8832 = new class240(class293.field3867, class243.field3143, class531.field7380);
            class66.field941 = new class195(class293.field3867, class243.field3143, class88.field1224, class117.field1725, class443.field5876);
            class507.field7153 = new class697(class293.field3867, class243.field3143, class531.field7380);
            class623.field8571 = new class762(class293.field3867, class243.field3143, class531.field7380);
            class234.field3057 = new class362(class293.field3867, class243.field3143, class229.field3018, class220.field2956);
            class305.field4004 = new class469(class293.field3867, class243.field3143, class531.field7380);
            class679.field9485 = new class402(class293.field3867, class243.field3143, class531.field7380);
            class646.field8935 = new class743(class293.field3867, class243.field3143, class531.field7380);
            class33.field550 = new class600(class293.field3867, class243.field3143, class761.field10615);
            class115.field1703 = new class87(class293.field3867, class243.field3143, class531.field7380);
            class149.method1053(class445.field5928, class210.field2782, class268.field3369, (byte) -123, class220.field2956);
            class660.method3716(class94.field1324, -127);
            class602.field8368 = new class237(class243.field3143, class395.field5031, class475.field6389);
            class609.field8450 = new class36(class243.field3143, class395.field5031, class475.field6389, new class732());
            class605.method3417((byte) -56);
            client.field3995.method3388(class748.field10451.field10412.method1806((byte) -110) == 0, 3);
            class516.field7236 = new class409();
            class421.method2346(true);
            class115.method897(-30825, class748.field10463);
            class731.method4081(-124, class124.field1793, class220.field2956);
            class563 var21 = new class563(class482.field6563.method3158("huffman", (byte) 88, ""));
            class430.method2464(30240, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class194.field2660 = class706.method3953((byte) -116);
            class323.field4162 = new class20(true, class162.field2227);
        }
        if (class607.field8439 == class306.field4031) {
            int var22 = class139.method1015(0, class268.field3369) + class7.method39(true, 27);
            int var23 = class63.method577(28756) + class440.method2504(-93);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (arg0 < 102) {
            method1275((byte) 62);
        }
        if (class607.field8439 == class306.field4032) {
            class73.method656(class55.field758, class732.field10185, class206.field2728, client.field3995, class424.field5399, class52.field741, class516.field7236);
        }
        if (class607.field8439 == class306.field4033) {
            class629.field8664 = new String[class679.field9485.field5100];
            class564.field7931 = new int[class646.field8935.field10368];
            class133.field1924 = new boolean[class646.field8935.field10368];
            for (int var24 = 0; var24 < class646.field8935.field10368; var24++) {
                if (class646.field8935.method4137(var24, false).field7121 == 0) {
                    class133.field1924[var24] = true;
                    class593.field8287++;
                }
                class564.field7931[var24] = -1;
            }
            class641.method3602((byte) 86);
            class161.field2225 = class210.field2782.method3161((byte) -69, "loginscreen");
            class416.field5299 = class210.field2782.method3161((byte) -93, "lobbyscreen");
            class238.field3094.method3182(false, true, -72);
            class87.field1210.method3182(true, true, -115);
            class268.field3369.method3182(true, true, -108);
            class445.field5928.method3182(true, true, -73);
            class482.field6563.method3182(true, true, -120);
            class210.field2782.method3182(true, true, -63);
            class531.field7380.field7631 = 2;
            class291.field3812 = true;
            class627.field8636.field7631 = 2;
            class625.field8599.field7631 = 2;
            class155.field2129.field7631 = 2;
            class560.field7904.field7631 = 2;
            class88.field1224.field7631 = 2;
            class229.field3018.field7631 = 2;
        }
        if (class607.field8439 == class306.field4034) {
            if (!class525.method3039(4, class161.field2225)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class218.field2938[class161.field2225].length; var26++) {
                class288 var27 = class218.field2938[class161.field2225][var26];
                if (var27.field3655 == 5 && var27.field3676 != -1 && !class268.field3369.method3157(0, 0, var27.field3676)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class607.field8439 == class306.field4035) {
            class331.method1918(true, true);
        }
        if (class607.field8439 == class306.field4036) {
            class14.field273.method1089(73);
            try {
                class721.field10040.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class474.field6388 = null;
            class699.field9728 = null;
            class654.field9099 = null;
            class14.field273 = null;
            class721.field10040 = null;
            class214.field2827 = null;
            class234.method1471(-119);
            class698.field9716 = class748.field10451.field10391.method3250((byte) 67) == 1;
            class748.field10451.method4150(class748.field10451.field10391, 1, -5);
            if (class698.field9716) {
                class748.field10451.method4150(class748.field10451.field10400, 0, -5);
            } else if (class748.field10451.field10400.field4241 && class323.field4162.field367 < 512 && class323.field4162.field367 != 0) {
                class748.field10451.method4150(class748.field10451.field10400, 0, -5);
            }
            class472.method2688(-125);
            if (class698.field9716) {
                class415.method2331(false, 0, -4);
            } else {
                class415.method2331(false, class748.field10451.field10400.method1924((byte) 82), -4);
            }
            class318.method1876(-1, 0, false, class748.field10451.field10407.method3441((byte) -70), -1);
            class365.method2104(class386.field4930, 13);
            class422.method2348(class386.field4930, -78);
            class86.method710((byte) 51, class268.field3369, class386.field4930);
            class647.method3629((byte) 93, class537.field7454);
        }
        return class15.method110(0);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "()Llea;")
    public final class613 method327() {
        field2616++;
        class295 var1;
        do {
            var1 = (class295) this.field2625.method3662(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3880 == null);
        return var1.field3880;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([ILgga;IIII)V")
    private final void method1276(int[] arg0, class295 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -1) {
            field2623 = null;
        }
        if ((this.field2621.field2890[arg1.field3888] & 0x4) != 0 && arg1.field3875 < 0) {
            int var7 = this.field2621.field2896[arg1.field3888] / class541.field7490;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3890) / var7;
                if (var8 > arg5) {
                    arg1.field3890 += arg5 * var7;
                    break;
                }
                arg1.field3880.method338(arg0, arg3, var8);
                arg5 -= var8;
                arg3 += var8;
                arg1.field3890 += var7 * var8 - 1048576;
                int var9 = class541.field7490 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class45 var11 = arg1.field3880;
                if (this.field2621.field2856[arg1.field3888] == 0) {
                    arg1.field3880 = class45.method329(arg1.field3900, var11.method362(), var11.method355(), var11.method330());
                } else {
                    arg1.field3880 = class45.method329(arg1.field3900, var11.method362(), 0, var11.method330());
                    this.field2621.method1383(arg1.field3896.field5070[arg1.field3886] < 0, arg1, -117);
                    arg1.field3880.method341(var9, var11.method355());
                }
                if (arg1.field3896.field5070[arg1.field3886] < 0) {
                    arg1.field3880.method326(-1);
                }
                var11.method334(var9);
                var11.method338(arg0, arg3, arg4 - arg3);
                if (var11.method351()) {
                    this.field2629.method1321(var11);
                }
            }
        }
        field2622++;
        arg1.field3880.method338(arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([III)V")
    public final void method338(int[] arg0, int arg1, int arg2) {
        field2626++;
        this.field2629.method338(arg0, arg1, arg2);
        for (class295 var4 = (class295) this.field2625.method3672(-1); var4 != null; var4 = (class295) this.field2625.method3662(-1)) {
            if (!this.field2621.method1403(65, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3897) {
                        this.method1276(arg0, var4, -1, var6, var5 + var6, var5);
                        var4.field3897 -= var5;
                        break;
                    }
                    this.method1276(arg0, var4, -1, var6, var6 + var5, var4.field3897);
                    var5 -= var4.field3897;
                    var6 += var4.field3897;
                } while (!this.field2621.method1376(var5, arg0, var4, var6, (byte) -92));
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public final void method335(int arg0) {
        this.field2629.method335(arg0);
        field2624++;
        for (class295 var2 = (class295) this.field2625.method3672(-1); var2 != null; var2 = (class295) this.field2625.method3662(-1)) {
            if (!this.field2621.method1403(38, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3897 >= var3) {
                        this.method1278(var3, var2, 4);
                        var2.field3897 -= var3;
                        break;
                    }
                    this.method1278(var2.field3897, var2, 4);
                    var3 -= var2.field3897;
                } while (!this.field2621.method1376(var3, null, var2, 0, (byte) 97));
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1277(int arg0, int arg1, byte[] arg2, int arg3) {
        field2620++;
        if (arg3 != 37) {
            return null;
        }
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg2[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class378.field4835[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILgga;I)V")
    private final void method1278(int arg0, class295 arg1, int arg2) {
        if ((this.field2621.field2890[arg1.field3888] & arg2) != 0 && arg1.field3875 < 0) {
            int var4 = this.field2621.field2896[arg1.field3888] / class541.field7490;
            int var5 = (var4 + 1048575 - arg1.field3890) / var4;
            arg1.field3890 = arg0 * var4 + arg1.field3890 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field2621.field2856[arg1.field3888] == 0) {
                    arg1.field3880 = class45.method329(arg1.field3900, arg1.field3880.method362(), arg1.field3880.method355(), arg1.field3880.method330());
                } else {
                    arg1.field3880 = class45.method329(arg1.field3900, arg1.field3880.method362(), 0, arg1.field3880.method330());
                    this.field2621.method1383(arg1.field3896.field5070[arg1.field3886] < 0, arg1, -113);
                }
                if (arg1.field3896.field5070[arg1.field3886] < 0) {
                    arg1.field3880.method326(-1);
                }
                arg0 = arg1.field3890 / var4;
            }
        }
        field2628++;
        arg1.field3880.method335(arg0);
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field2623 = null;
        if (arg0 <= -84) {
            field2618 = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "()Llea;")
    public final class613 method317() {
        field2627++;
        class295 var1 = (class295) this.field2625.method3672(-1);
        if (var1 == null) {
            return null;
        } else if (var1.field3880 == null) {
            return this.method327();
        } else {
            return var1.field3880;
        }
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "()I")
    public final int method349() {
        field2617++;
        return 0;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lcea;)V")
    public class190(class216 arg0) {
        this.field2621 = arg0;
    }
}
