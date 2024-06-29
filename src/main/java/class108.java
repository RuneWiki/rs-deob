import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class108 extends class120 {

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "Lma;")
    public class83 field2647 = new class83();

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "Lba;")
    public class8 field2648 = new class8();

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "Luc;")
    private class135 field2643;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "Loc;")
    public static class99 field2642 = class48.method402((byte) -104, "AUS");

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[I")
    public static int[] field2639 = new int[128];

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Lma;")
    public static class83 field2638 = new class83();

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field2652 = 1;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "Loc;")
    public static class99 field2656 = class48.method402((byte) -104, "Hier wechseln");

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Loc;")
    private static class99 field2653 = class48.method402((byte) -104, "Accept challenge");

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "Loc;")
    public static class99 field2655 = field2653;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field2657 = -1;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "Lpc;")
    public static class105 field2640;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "Ldc;")
    public static class24 field2654;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method919(byte arg0) {
        field2653 = null;
        field2642 = null;
        field2639 = null;
        if (arg0 > -37) {
            method929(13, null, 75, 64);
        }
        field2656 = null;
        field2655 = null;
        field2640 = null;
        field2654 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)Lac;")
    public static final class3 method920(byte arg0) {
        field2645++;
        if (arg0 != 8) {
            method923(-2, 70, -125);
        }
        try {
            return (class3) Class.forName("na").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class137();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)V")
    public static final void method921(int arg0, byte arg1, int arg2) {
        if (arg1 > -44) {
            field2654 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class81.field2003[var4] != null) {
                int var5 = class104.field2527[var4];
                int var6 = class141.field3490 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class99 var7 = class137.field3420[var4];
                if (var7 != null && var7.method851(0, class33.field801)) {
                    var7 = var7.method813(5, (byte) -73);
                }
                if (var7 != null && var7.method851(0, class95.field2311)) {
                    var7 = var7.method813(5, (byte) -100);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class113.field2826 == 0 || class113.field2826 == 1 && class2.method7(var7, (byte) -51))) {
                    if (arg0 > var6 - 14 && arg0 <= var6 && !var7.method829(class69.field1770.field3034, 4)) {
                        class5.field119++;
                        class53.field1265++;
                        if (class57.field1483 >= 1) {
                            class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 69), 37, 0, (byte) 21, class84.field2084, 0);
                            field2632++;
                        }
                        class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 26), 26, 0, (byte) 21, class47.field1155, 0);
                        class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 36), 16, 0, (byte) 21, class95.field2308, 0);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class105.field2593 == 0 && (var5 == 7 || class84.field2096 == 0 || class84.field2096 == 1 && class2.method7(var7, (byte) -51))) {
                    var3++;
                    if (arg0 > var6 - 14 && arg0 <= var6) {
                        class53.field1265++;
                        class5.field119++;
                        if (class57.field1483 >= 1) {
                            field2632++;
                            class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 48), 37, 0, (byte) 21, class84.field2084, 0);
                        }
                        class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 105), 26, 0, (byte) 21, class47.field1155, 0);
                        class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 84), 16, 0, (byte) 21, class95.field2308, 0);
                    }
                }
                if (var5 == 4 && (class55.field1414 == 0 || class55.field1414 == 1 && class2.method7(var7, (byte) -51))) {
                    if (var6 - 14 < arg0 && arg0 <= var6) {
                        class110.field2729++;
                        class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 96), 51, 0, (byte) 21, class93.field2248, 0);
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class105.field2593 == 0 && class84.field2096 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class55.field1414 == 0 || class55.field1414 == 1 && class2.method7(var7, (byte) -51))) {
                    if (var6 - 14 < arg0 && var6 >= arg0) {
                        class61.field1632++;
                        class136.method1132(0, class20.method189(new class99[] { class144.field3598, var7 }, 17), 54, 0, (byte) 21, field2655, 0);
                    }
                    var3++;
                }
            }
        }
        field2633++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLra;Lra;)V")
    public static final void method922(byte arg0, class115 arg1, class115 arg2) {
        field2635++;
        if (class4.field72) {
            class17.method170(arg2, 1, arg1);
            return;
        }
        if (class66.field1699 == 0 || class66.field1699 == 5) {
            byte var3 = 20;
            int var4 = 253 - var3;
            arg2.method988(class37.field951, 382, 245 - var3, 16777215);
            class96.method798(230, var4, 304, 34, 9179409);
            class96.method798(231, var4 + 1, 302, 32, 0);
            class96.method794(232, var4 + 2, class134.field3304 * 3, 30, 9179409);
            class96.method794(class134.field3304 * 3 + 232, var4 + 2, 300 - class134.field3304 * 3, 30, 0);
            arg2.method988(class109.field2710, 382, 276 - var3, 16777215);
        }
        if (class66.field1699 == 20) {
            short var5 = 211;
            class37.field939.method216(382 - class37.field939.field569 / 2, -(class37.field939.field563 / 2) + 271);
            arg2.method989(class109.field2707, 382, var5, 16776960, true);
            int var24 = var5 + 15;
            arg2.method989(class109.field2711, 382, var24, 16776960, true);
            int var25 = var24 + 15;
            arg2.method989(class109.field2704, 382, var25, 16776960, true);
            int var26 = var25 + 15;
            int var27 = var26 + 10;
            arg2.method983(class20.method189(new class99[] { class99.field2399, class109.field2709 }, 36), 292, var27, 16777215, true);
            int var29 = var27 + 15;
            arg2.method983(class20.method189(new class99[] { class80.field1986, class109.field2702.method850(-31828) }, 19), 294, var29, 16777215, true);
            int var31 = var29 + 15;
        }
        if (class66.field1699 == 10) {
            class37.field939.method216(202, 171);
            if (class121.field2950 == 0) {
                short var13 = 251;
                arg2.method989(class83.field2068, 382, var13, 16776960, true);
                int var40 = var13 + 30;
                short var14 = 291;
                short var15 = 302;
                class59.field1592.method216(var15 - 73, var14 + -20);
                arg2.method987(class66.field1693, var15 - 73, var14 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 462;
                class59.field1592.method216(var16 - 73, var14 + -20);
                arg2.method987(class46.field1132, var16 - 73, var14 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class121.field2950 == 2) {
                short var6 = 211;
                arg2.method989(class109.field2707, 382, var6, 16776960, true);
                short var7 = 302;
                int var28 = var6 + 15;
                arg2.method989(class109.field2711, 382, var28, 16776960, true);
                short var8 = 321;
                int var30 = var28 + 15;
                arg2.method989(class109.field2704, 382, var30, 16776960, true);
                int var32 = var30 + 15;
                int var33 = var32 + 10;
                arg2.method983(class20.method189(new class99[] { class99.field2399, class109.field2709, class3.field66 == 0 & class101.field2444 % 40 < 20 ? class138.field3446 : class109.field2703 }, 115), 292, var33, 16777215, true);
                int var34 = var33 + 15;
                arg2.method983(class20.method189(new class99[] { class80.field1986, class109.field2702.method850(-31828), class3.field66 == 1 & class101.field2444 % 40 < 20 ? class138.field3446 : class109.field2703 }, 17), 294, var34, 16777215, true);
                int var35 = var34 + 15;
                class59.field1592.method216(var7 - 73, var8 - 20);
                arg2.method989(class79.field1926, var7, var8 + 5, 16777215, true);
                short var9 = 462;
                class59.field1592.method216(var9 - 73, var8 + -20);
                arg2.method989(class95.field2304, var9, var8 + 5, 16777215, true);
            } else if (class121.field2950 == 3) {
                arg2.method989(class86.field2156, 382, 211, 16776960, true);
                short var10 = 382;
                short var11 = 236;
                short var12 = 321;
                arg2.method989(class99.field2414, 382, var11, 16777215, true);
                int var36 = var11 + 15;
                arg2.method989(class126.field3053, 382, var36, 16777215, true);
                int var37 = var36 + 15;
                arg2.method989(class114.field2836, 382, var37, 16777215, true);
                int var38 = var37 + 15;
                arg2.method989(class16.field417, 382, var38, 16777215, true);
                class59.field1592.method216(var10 - 73, var12 - 20);
                int var39 = var38 + 15;
                arg2.method989(class95.field2304, var10, var12 + 5, 16777215, true);
            }
        }
        int var17 = -97 % ((-arg0 - 34) / 61);
        if (class77.field1906 > 0) {
            class17.method169(false, class77.field1906);
            class77.field1906 = 0;
        }
        class14.method149(-2);
        class59.field1580[class148.field3661 ? 1 : 0].method216(725, 463);
        if (class66.field1699 > 5 && class60.field1620 != 2 && class77.field1921 == 0) {
            if (class105.field2558 == null) {
                class105.field2558 = class91.method756(class109.field2703, (byte) -43, class25.field585, class144.field3603);
            } else {
                byte var18 = 5;
                short var19 = 463;
                class105.field2558.method216(var18, var19);
                byte var20 = 100;
                byte var21 = 35;
                arg2.method989(class20.method189(new class99[] { class109.field2708, class42.field1030, class5.method31(class137.field3418, 10) }, 26), var20 / 2 + var18, var19 - -(var21 / 2) + -2, 16777215, true);
                if (class122.field2981 == null) {
                    arg1.method989(class54.field1380, var20 / 2 + var18, var19 + 12 - -(var21 / 2), 16777215, true);
                } else {
                    arg1.method989(class137.field3417, var20 / 2 + var18, var21 / 2 + var19 + 12, 16777215, true);
                }
            }
        }
        try {
            Graphics var22 = class5.field99.getGraphics();
            class104.field2518.method109(0, 0, 0, var22);
        } catch (Exception var23) {
            class5.field99.repaint();
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public static final int method923(int arg0, int arg1, int arg2) {
        field2646++;
        if (arg1 != 0) {
            return 74;
        }
        class36 var3 = (class36) class14.field327.method1001((long) arg0, (byte) -103);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field917.length) {
            return var3.field917[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZLke;)V")
    private final void method924(int arg0, boolean arg1, class74 arg2) {
        if (arg1) {
            return;
        }
        if ((this.field2643.field3333[arg2.field1869] & 0x4) != 0 && arg2.field1861 < 0) {
            int var4 = this.field2643.field3357[arg2.field1869] / class33.field792;
            int var5 = (var4 + 1048575 - arg2.field1874) / var4;
            arg2.field1874 = arg2.field1874 + arg0 * var4 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field2643.field3346[arg2.field1869] == 0) {
                    arg2.field1876 = class71.method620(arg2.field1894, arg2.field1876.method639(), arg2.field1876.method646(), arg2.field1876.method643());
                } else {
                    arg2.field1876 = class71.method620(arg2.field1894, arg2.field1876.method639(), 0, arg2.field1876.method643());
                    this.field2643.method1107(arg2.field1873.field2811[arg2.field1863] < 0, 106, arg2);
                }
                if (arg2.field1873.field2811[arg2.field1863] < 0) {
                    arg2.field1876.method640(-1);
                }
                arg0 = arg2.field1874 / var4;
            }
        }
        arg2.field1876.method105(arg0);
        field2630++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([III)V")
    public final void method95(int[] arg0, int arg1, int arg2) {
        field2649++;
        this.field2648.method95(arg0, arg1, arg2);
        int var4 = arg1 + arg2;
        for (class74 var5 = (class74) this.field2647.method722(111); var5 != null; var5 = (class74) this.field2647.method716(true)) {
            if (!this.field2643.method1125(-114, var5)) {
                int var6 = arg2;
                int var7 = arg1;
                do {
                    if (var6 <= var5.field1862) {
                        this.method925(-1, var7, arg0, var4, var5, var6);
                        var5.field1862 -= var6;
                        break;
                    }
                    this.method925(-1, var7, arg0, var4, var5, var5.field1862);
                    var6 -= var5.field1862;
                    var7 += var5.field1862;
                } while (!this.field2643.method1111(var5, false));
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[IILke;I)V")
    private final void method925(int arg0, int arg1, int[] arg2, int arg3, class74 arg4, int arg5) {
        if (~(this.field2643.field3333[arg4.field1869] & 0x4) != arg0 && arg4.field1861 < 0) {
            int var7 = this.field2643.field3357[arg4.field1869] / class33.field792;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field1874) / var7;
                if (var8 > arg5) {
                    arg4.field1874 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg4.field1876.method95(arg2, arg1, var8);
                int var9 = class33.field792 / 100;
                arg1 += var8;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class71 var11 = arg4.field1876;
                arg4.field1874 += var7 * var8 - 1048576;
                if (this.field2643.field3346[arg4.field1869] == 0) {
                    arg4.field1876 = class71.method620(arg4.field1894, var11.method639(), var11.method646(), var11.method643());
                } else {
                    arg4.field1876 = class71.method620(arg4.field1894, var11.method639(), 0, var11.method643());
                    this.field2643.method1107(arg4.field1873.field2811[arg4.field1863] < 0, 120, arg4);
                    arg4.field1876.method647(var9, var11.method646());
                }
                if (arg4.field1873.field2811[arg4.field1863] < 0) {
                    arg4.field1876.method640(-1);
                }
                var11.method649(var9);
                var11.method95(arg2, arg1, arg3 - arg1);
                if (var11.method651()) {
                    this.field2648.method104(var11);
                }
            }
        }
        field2650++;
        arg4.field1876.method95(arg2, arg1, arg5);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public static final int method926(int arg0, int arg1) {
        field2636++;
        int var2 = 83 / ((arg1 - 22) / 40);
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()Lre;")
    public final class120 method106() {
        field2637++;
        class74 var1;
        do {
            var1 = (class74) this.field2647.method716(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1876 == null);
        return var1.field1876;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)Lhe;")
    public static final class54 method927(int arg0, int arg1, int arg2) {
        field2631++;
        if (arg2 != 16777215) {
            field2655 = null;
        }
        class54 var3 = class63.method552(arg0, (byte) 127);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1344 == null || var3.field1344.length <= arg1) {
            return null;
        } else {
            return var3.field1344[arg1];
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public static final void method928(int arg0) {
        field2629++;
        class99 var1 = null;
        for (int var2 = arg0; var2 < class144.field3601; var2++) {
            if (class145.field3619[var2].method830(class15.field371, arg0 ^ 0x3F) != -1) {
                var1 = class145.field3619[var2].method813(class145.field3619[var2].method830(class15.field371, 63), (byte) -58);
                break;
            }
        }
        if (var1 == null) {
            class126.method1030(false);
            return;
        }
        int var3 = class132.field3227;
        int var4 = class53.field1261;
        if (var3 < 0) {
            var3 = 0;
        }
        int var5 = class111.field2766;
        int var6 = 6116423;
        int var7 = class21.field511;
        if (var5 > 190) {
            var5 = 190;
        }
        class96.method794(var3, var4, var5, var7, var6);
        class96.method794(var3 + 1, var4 + 1, var5 - 2, 16, 0);
        class96.method798(var3 + 1, var4 + 18, var5 - 2, var7 - 19, 0);
        class48.field1162.method983(var1, var3 + 3, var4 + 14, var6, false);
        int var8 = class148.field3656;
        int var9 = class80.field1969;
        if (class99.field2365 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class99.field2365 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (class99.field2365 == 2) {
            var9 -= 357;
            var8 -= 17;
        }
        for (int var10 = 0; var10 < class144.field3601; var10++) {
            int var11 = 16777215;
            class99 var12 = class145.field3619[var10];
            int var13 = var4 + (class144.field3601 - var10 - 1) * 15 + 31;
            if (var12.method838(var1, true)) {
                var12 = var12.method840(0, -126, var12.method810(arg0 ^ -58) - var1.method810(arg0 ^ -58));
                if (var12.method838(client.field513, true)) {
                    var12 = var12.method840(0, arg0 ^ 0xFFFFFF8D, var12.method810(-58) - client.field513.method810(-58));
                }
            }
            if (var3 < var8 && var8 < var3 + var5 && var9 > var13 - 13 && var13 + 3 > var9) {
                var11 = 16776960;
            }
            class48.field1162.method983(var12, var3 + 3, var13, var11, true);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()I")
    public final int method102() {
        field2644++;
        return 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method929(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 17721) {
            return false;
        }
        field2628++;
        class57 var4 = new class57(arg1);
        int var5 = -1;
        boolean var6 = true;
        label56: while (true) {
            int var7 = var4.method470((byte) -104);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var4.method470((byte) -108);
                    if (var11 == 0) {
                        continue label56;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = var4.method510(-124) >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class16 var17 = class83.method717(6, var5);
                        if (var14 != 22 || !class27.field684 || var17.field395 != 0 || var17.field428) {
                            var9 = true;
                            if (!var17.method166((byte) 92)) {
                                var6 = false;
                                class135.field3364++;
                            }
                        }
                    }
                }
                int var10 = var4.method470((byte) -105);
                if (var10 == 0) {
                    break;
                }
                var4.method510(-109);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Luc;)V")
    public class108(class135 arg0) {
        this.field2643 = arg0;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public final void method105(int arg0) {
        field2641++;
        for (class74 var2 = (class74) this.field2647.method722(108); var2 != null; var2 = (class74) this.field2647.method716(true)) {
            if (!this.field2643.method1125(-113, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1862) {
                        this.method924(var3, false, var2);
                        var2.field1862 -= var3;
                        break;
                    }
                    this.method924(var2.field1862, false, var2);
                    var3 -= var2.field1862;
                } while (!this.field2643.method1111(var2, false));
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()Lre;")
    public final class120 method100() {
        class74 var1 = (class74) this.field2647.method722(123);
        field2634++;
        if (var1 == null) {
            return null;
        } else if (var1.field1876 == null) {
            return this.method106();
        } else {
            return var1.field1876;
        }
    }
}
