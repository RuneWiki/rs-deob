import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class222 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
    public static int[] field3668 = new int[3];

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3671 = 0;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[Lu;")
    public static class283[] field3672 = new class283[50];

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3678 = -1;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Ljj;")
    public static class168 field3670;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lne;")
    public static class262 field3667;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Z", line = 6)
    public static final boolean method1553(boolean arg0, int arg1) {
        class320.field5210 = arg0;
        class26.field677 = arg1 + 1 & 0xFFFF;
        field3669++;
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 19)
    public static void method1554(byte arg0) {
        field3670 = null;
        field3667 = null;
        field3668 = null;
        field3672 = null;
        if (arg0 != 59) {
            field3672 = (class283[]) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1555(int arg0) {
        class155.method1102(-13402, false);
        field3675++;
        boolean var1 = true;
        class151.field2584 = 0;
        for (int var2 = 0; var2 < class341.field5405.length; var2++) {
            if (class271.field4415[var2] != -1 && class341.field5405[var2] == null) {
                class341.field5405[var2] = class162.field2727.method1404(class271.field4415[var2], 0, (byte) -73);
                if (class341.field5405[var2] == null) {
                    var1 = false;
                    class151.field2584++;
                }
            }
            if (class194.field3267[var2] != -1 && class46.field920[var2] == null) {
                class46.field920[var2] = class162.field2727.method1430(0, class194.field3267[var2], class20.field533[var2], (byte) 17);
                if (class46.field920[var2] == null) {
                    var1 = false;
                    class151.field2584++;
                }
            }
            if (class241.field4016) {
                if (class190.field3227[var2] != -1 && class21.field540[var2] == null) {
                    class21.field540[var2] = class162.field2727.method1404(class190.field3227[var2], 0, (byte) -102);
                    if (class21.field540[var2] == null) {
                        var1 = false;
                        class151.field2584++;
                    }
                }
                if (class133.field2277[var2] != -1 && class148.field2516[var2] == null) {
                    class148.field2516[var2] = class162.field2727.method1404(class133.field2277[var2], 0, (byte) -63);
                    if (class148.field2516[var2] == null) {
                        class151.field2584++;
                        var1 = false;
                    }
                }
            }
            if (class176.field2919 != null && class132.field2272[var2] == null && class176.field2919[var2] != -1) {
                class132.field2272[var2] = class162.field2727.method1430(0, class176.field2919[var2], class20.field533[var2], (byte) 17);
                if (class132.field2272[var2] == null) {
                    var1 = false;
                    class151.field2584++;
                }
            }
        }
        if (class75.field1362 == null) {
            if (class82.field1426 == null || !class25.field652.method1409(false, class82.field1426.field3720 + "_labels")) {
                class75.field1362 = new class23(0);
            } else if (class25.field652.method1425(class82.field1426.field3720 + "_labels", 4)) {
                class75.field1362 = class119.method871(class235.field3852, -6285, class82.field1426.field3720 + "_labels", class25.field652);
            } else {
                class151.field2584++;
                var1 = false;
            }
        }
        if (!var1) {
            class207.field3461 = 1;
            return;
        }
        class52.field1044 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class341.field5405.length; var4++) {
            byte[] var5 = class46.field920[var4];
            if (var5 != null) {
                int var6 = (class127.field2221[var4] & 0xFF) * 64 - class21.field543;
                int var7 = (class127.field2221[var4] >> 8) * 64 - class272.field4426;
                if (class177.field2932) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class252.method1775(var5, var7, var6, (byte) -110);
            }
            if (class241.field4016) {
                byte[] var8 = class148.field2516[var4];
                if (var8 != null) {
                    int var9 = (class127.field2221[var4] & 0xFF) * 64 - class21.field543;
                    int var10 = (class127.field2221[var4] >> 8) * 64 - class272.field4426;
                    if (class177.field2932) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class252.method1775(var8, var10, var9, (byte) -97);
                }
            }
        }
        if (!var3) {
            class207.field3461 = 2;
            return;
        }
        if (class207.field3461 != 0) {
            class312.method2268(class284.field4645 + "<br>(100%)", true, (byte) 91);
        }
        class119.method865(-4097);
        class200.method1372(0);
        boolean var11 = false;
        if (class241.field4016 && class68.field1254) {
            for (int var12 = 0; var12 < class341.field5405.length; var12++) {
                if (class148.field2516[var12] != null || class21.field540[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class275.method1956(4, 104, 104, class241.field4016 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class23.field576[var13].method1929(33554432);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class282.field4615[var14][var15][var16] = 0;
                }
            }
        }
        class260.method1826((byte) -110, false);
        if (class241.field4016) {
            class221.field3661.method1456();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class221.field3664[var17][var18].field2148 = true;
                }
            }
        }
        if (class241.field4016) {
            class2.method28();
        }
        if (class241.field4016) {
            class133.method935((byte) 124);
        }
        class119.method865(-4097);
        System.gc();
        class155.method1102(arg0 ^ 0xFFFFCBA6, true);
        class41.method320(false, false);
        if (!class177.field2932) {
            class35.method260(17898, false);
            class155.method1102(-13402, true);
            if (class241.field4016) {
                int var19 = class96.field1750.field139[0] >> 3;
                int var20 = class96.field1750.field170[0] >> 3;
                class133.method938(var20, (byte) 40, var19);
            }
            class284.method2016(false, (byte) 102);
            if (class132.field2272 != null) {
                class335.method2363(-78);
            }
        }
        if (class177.field2932) {
            class108.method812(false, 0);
            class155.method1102(-13402, true);
            if (class241.field4016) {
                int var21 = class96.field1750.field139[0] >> 3;
                int var22 = class96.field1750.field170[0] >> 3;
                class133.method938(var22, (byte) 75, var21);
            }
            class110.method822((byte) 87, false);
        }
        class200.method1372(0);
        class155.method1102(arg0 - 13402, true);
        class171.method1215((byte) -93, class177.field2932 ? class71.field1308 : (int[][][]) null, false, class23.field576);
        if (class241.field4016) {
            class2.method22();
        }
        class155.method1102(-13402, true);
        int var23 = class311.field5064;
        if (var23 > class276.field4506) {
            var23 = class276.field4506;
        }
        if (class276.field4506 - 1 > var23) {
            int var24 = class276.field4506 - 1;
        }
        if (class14.method137(256)) {
            class352.method2507(0);
        } else {
            class352.method2507(class311.field5064);
        }
        class137.method956(124);
        if (class241.field4016 && var11) {
            class51.method450(true);
            class41.method320(false, true);
            if (!class177.field2932) {
                class35.method260(arg0 ^ 0x45EA, true);
                class155.method1102(-13402, true);
                class284.method2016(true, (byte) 98);
            }
            if (class177.field2932) {
                class108.method812(true, arg0);
                class155.method1102(-13402, true);
                class110.method822((byte) 87, true);
            }
            class200.method1372(arg0);
            class155.method1102(arg0 - 13402, true);
            class171.method1215((byte) -93, class177.field2932 ? class71.field1308 : (int[][][]) null, true, class23.field576);
            class155.method1102(-13402, true);
            class137.method956(120);
            class51.method450(false);
        }
        if (class241.field4016) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class221.field3664[var25][var26].method877(class144.field2427[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class8.method88(20000, var27, var28);
            }
        }
        class209.method1445(arg0 - 12767);
        class119.method865(-4097);
        class78.method587(arg0);
        class200.method1372(arg0 ^ 0x0);
        class142.field2398 = false;
        if (class241.field4016) {
            class149.method1072(-83, true);
        }
        if (class274.field4469 != null && class127.field2224 != null && class334.field5326 == 25) {
            class72.field1323++;
            class51.field1038.method291((byte) 108, 200);
            class51.field1038.method1045((byte) -87, 1057001181);
        }
        if (!class177.field2932) {
            int var29 = (class115.field2070 - 6) / 8;
            int var30 = (class174.field2886 - 6) / 8;
            int var31 = (class174.field2886 + 6) / 8;
            int var32 = (class115.field2070 + 6) / 8;
            for (int var33 = var30 - 1; var33 <= var31 + 1; var33++) {
                for (int var34 = var29 - 1; var34 <= var32 + 1; var34++) {
                    if (var30 > var33 || var31 < var33 || var29 > var34 || var34 > var32) {
                        class162.field2727.method1411(-23237, "m" + var33 + "_" + var34);
                        class162.field2727.method1411(arg0 ^ 0xFFFFA53B, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class334.field5326 == 28) {
            class311.method2260(10, -19880);
        } else {
            class311.method2260(30, -19880);
            if (class127.field2224 != null) {
                class51.field1038.method291((byte) 73, 6);
            }
        }
        class355.method2518(-61);
        class119.method865(-4097);
        class53.method464((byte) -122);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V", line = 545)
    public static final void method1556(byte arg0, int arg1) {
        field3677++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class317.field5172[arg1];
        int var3 = (int) class177.field2926[arg1];
        long var4 = class177.field2926[arg1];
        int var6 = class206.field3450[arg1];
        int var7 = class107.field1938[arg1];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 43) {
            class98 var8 = class182.field3151[var3];
            if (var8 != null) {
                class53.field1061 = class303.field4931;
                class244.field4048 = 2;
                class133.field2289 = class37.field807;
                class355.field5658++;
                class323.field5227 = 0;
                class51.field1038.method291((byte) -127, 166);
                class51.field1038.method1042((byte) -125, var3);
                class51.field1038.method1048((byte) 95, class261.field4307[82] ? 1 : 0);
                class166.method1186(var8.method49((byte) 118), var2, true, 0, 0, var8.method49((byte) 108), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 16) {
            class314 var9 = class149.field2533[var3];
            if (var9 != null) {
                class133.field2289 = class37.field807;
                class53.field1061 = class303.field4931;
                class351.field5603++;
                class323.field5227 = 0;
                class244.field4048 = 2;
                class51.field1038.method291((byte) 47, 53);
                class51.field1038.method1048((byte) 82, class261.field4307[82] ? 1 : 0);
                class51.field1038.method1023(var3, (byte) -28);
                class166.method1186(var9.method49((byte) 105), var2, true, 0, 0, var9.method49((byte) 123), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 37) {
            class314 var10 = class149.field2533[var3];
            if (var10 != null) {
                class117.field2086++;
                class244.field4048 = 2;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) -95, 218);
                class51.field1038.method1023(var3, (byte) -28);
                class51.field1038.method1042((byte) -125, class354.field5650);
                class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
                class51.field1038.method1043((byte) 96, class119.field2126);
                class166.method1186(var10.method49((byte) -80), var2, true, 0, 0, var10.method49((byte) -105), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 49) {
            class82.field1420++;
            class51.field1038.method291((byte) -90, 31);
            class51.field1038.method1026(var2, (byte) 30);
            class51.field1038.method1023(var3, (byte) -28);
            class51.field1038.method1039((byte) -70, var6);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-100, var2);
            class282.field4620 = var6;
        }
        if (var7 == 20) {
            class181 var35 = class204.method1392(var2, arg0 - 5, var6);
            if (var35 != null) {
                class266.method1865(-1);
                class340 var36 = client.method1990(var35);
                class70.method536(var35.field2990, var36.field5390, var6, -15002, var2, var35.field3108, var36.method2406(arg0 ^ 0x6));
                field3674 = 0;
                class112.field2047 = class71.method542(var35, 1);
                if (class112.field2047 == null) {
                    class112.field2047 = "Null";
                }
                if (var35.field3058) {
                    class10.field287 = var35.field3119 + "<col=ffffff>";
                } else {
                    class10.field287 = "<col=00ff00>" + var35.field3005 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var7 == 25) {
            if (var3 == 0) {
                class148.field2527 = 1;
                class46.method380(class276.field4506, var6, var2);
            } else if (var3 == 1) {
                class255.field4183++;
                class51.field1038.method291((byte) -106, 195);
                class51.field1038.method1042((byte) -125, class354.field5650);
                class51.field1038.method1039((byte) -70, class21.field543 + var2);
                class51.field1038.method1032(6951, class119.field2126);
                class51.field1038.method1002((byte) -105, class272.field4426 + var6);
            }
        }
        if (var7 == 32) {
            class314 var11 = class149.field2533[var3];
            if (var11 != null) {
                class244.field4048 = 2;
                class22.field557++;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) 52, 163);
                class51.field1038.method1039((byte) -70, var3);
                class51.field1038.method1048((byte) 81, class261.field4307[82] ? 1 : 0);
                class166.method1186(var11.method49((byte) -98), var2, true, 0, 0, var11.method49((byte) 53), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 41 || var7 == 1011) {
            class207.method1431(var2, -100, class300.field4889[arg1], var3, var6);
        }
        if (var7 == 11) {
            class51.field1038.method291((byte) -82, 170);
            class51.field1038.method1032(arg0 ^ 0x1B21, class119.field2126);
            class51.field1038.method1045((byte) 121, var2);
            class295.field4819++;
            class51.field1038.method1023(var6, (byte) -28);
            class51.field1038.method1039((byte) -70, class354.field5650);
        }
        if (var7 == 4) {
            class314 var12 = class149.field2533[var3];
            if (var12 != null) {
                class323.field5227 = 0;
                class53.field1061 = class303.field4931;
                class199.field3345++;
                class133.field2289 = class37.field807;
                class244.field4048 = 2;
                class51.field1038.method291((byte) -85, 106);
                class51.field1038.method1042((byte) -125, class303.field4936);
                class51.field1038.method1026(class15.field452, (byte) 30);
                class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
                class51.field1038.method1002((byte) -115, class309.field5052);
                class51.field1038.method1039((byte) -70, var3);
                class166.method1186(var12.method49((byte) 48), var2, true, 0, 0, var12.method49((byte) -91), class96.field1750.field170[0], class96.field1750.field139[0], arg0 ^ 0x367B, var6, 0);
            }
        }
        if (var7 == 51) {
            class111.field2029++;
            class51.field1038.method291((byte) 43, 157);
            class51.field1038.method1042((byte) -125, var3);
            class51.field1038.method1002((byte) -84, var6);
            class51.field1038.method1032(6951, var2);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-107, var2);
            class282.field4620 = var6;
        }
        if (var7 == 1012) {
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class53.field1061 = class303.field4931;
            class323.field5227 = 0;
            class219.field3640++;
            class51.field1038.method291((byte) -99, 50);
            class51.field1038.method1042((byte) -125, var3);
        }
        if (var7 == 2) {
            class244.field4048 = 2;
            class323.field5227 = 0;
            class133.field2289 = class37.field807;
            class20.field520++;
            class53.field1061 = class303.field4931;
            class51.field1038.method291((byte) 89, 230);
            class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
            class51.field1038.method1002((byte) -116, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class51.field1038.method1023(class354.field5650, (byte) -28);
            class51.field1038.method1032(arg0 + 6945, class119.field2126);
            class51.field1038.method1023(class21.field543 + var2, (byte) -28);
            class51.field1038.method1023(var6 + class272.field4426, (byte) -28);
            class354.method2517(var4, var6, -17391, var2);
        }
        if (var7 == 14) {
            class98 var13 = class182.field3151[var3];
            if (var13 != null) {
                class244.field4048 = 2;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) 69, 127);
                class51.field1038.method1013(class261.field4307[82] ? 1 : 0, arg0 ^ 0x71);
                class37.field806++;
                class51.field1038.method1042((byte) -125, var3);
                class166.method1186(var13.method49((byte) 72), var2, true, 0, 0, var13.method49((byte) -104), class96.field1750.field170[0], class96.field1750.field139[0], arg0 ^ 0x367B, var6, 0);
            }
        }
        if (var7 == 17) {
            class98 var14 = class182.field3151[var3];
            if (var14 != null) {
                class133.field2289 = class37.field807;
                class244.field4048 = 2;
                class53.field1061 = class303.field4931;
                class323.field5227 = 0;
                class36.field790++;
                class51.field1038.method291((byte) -83, 227);
                class51.field1038.method1039((byte) -70, var3);
                class51.field1038.method1048((byte) 93, class261.field4307[82] ? 1 : 0);
                class166.method1186(var14.method49((byte) -124), var2, true, 0, 0, var14.method49((byte) -118), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 1002) {
            class244.field4048 = 2;
            class133.field2289 = class37.field807;
            class257.field4203++;
            class323.field5227 = 0;
            class53.field1061 = class303.field4931;
            class51.field1038.method291((byte) -120, 124);
            class51.field1038.method1002((byte) -100, var3);
        }
        if (var7 == 1010) {
            class133.field2289 = class37.field807;
            class323.field5227 = 0;
            class53.field1061 = class303.field4931;
            class244.field4048 = 2;
            class314 var15 = class149.field2533[var3];
            if (var15 != null) {
                class88 var16 = var15.field5107;
                if (var16.field1552 != null) {
                    var16 = var16.method681((byte) 15);
                }
                if (var16 != null) {
                    class51.field1038.method291((byte) -81, 116);
                    class51.field1038.method1039((byte) -70, var16.field1557);
                    class18.field496++;
                }
            }
        }
        if (var7 == 50) {
            class98 var17 = class182.field3151[var3];
            if (var17 != null) {
                class323.field5227 = 0;
                class140.field2368++;
                class53.field1061 = class303.field4931;
                class133.field2289 = class37.field807;
                class244.field4048 = 2;
                class51.field1038.method291((byte) 127, 248);
                class51.field1038.method1043((byte) 93, class119.field2126);
                class51.field1038.method1023(var3, (byte) -28);
                class51.field1038.method1013(class261.field4307[82] ? 1 : 0, -121);
                class51.field1038.method1042((byte) -125, class354.field5650);
                class166.method1186(var17.method49((byte) -90), var2, true, 0, 0, var17.method49((byte) 60), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 28) {
            class352.field5637++;
            class133.field2289 = class37.field807;
            class323.field5227 = 0;
            class244.field4048 = 2;
            class53.field1061 = class303.field4931;
            class51.field1038.method291((byte) 100, 29);
            class51.field1038.method1041(arg0 + 122, class261.field4307[82] ? 1 : 0);
            class51.field1038.method1002((byte) -110, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class51.field1038.method1002((byte) -125, class21.field543 + var2);
            class51.field1038.method1002((byte) -82, var6 + class272.field4426);
            class354.method2517(var4, var6, arg0 ^ 0xFFFFBC17, var2);
        }
        if (var7 == 58) {
            class51.field1038.method291((byte) 79, 74);
            class30.field709++;
            class51.field1038.method1032(arg0 ^ 0x1B21, var2);
            class51.field1038.method1042((byte) -125, var3);
            class51.field1038.method1039((byte) -70, var6);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-111, var2);
            class282.field4620 = var6;
        }
        if (var7 == 42) {
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class71.field1296++;
            class323.field5227 = 0;
            class53.field1061 = class303.field4931;
            class51.field1038.method291((byte) -108, 137);
            class51.field1038.method1039((byte) -70, class21.field543 + var2);
            class51.field1038.method1023(var3, (byte) -28);
            class51.field1038.method1002((byte) -112, class272.field4426 + var6);
            class51.field1038.method1027(class261.field4307[82] ? 1 : 0, -20374);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
        }
        if (var7 == 19) {
            class51.field1038.method291((byte) -123, 213);
            class331.field5291++;
            class51.field1038.method1045((byte) 124, var2);
            class181 var18 = class224.method1564(arg0 - 110, var2);
            if (var18.field3093 != null && var18.field3093[0][0] == 5) {
                int var19 = var18.field3093[0][1];
                if (class334.field5322[var19] != var18.field3020[0]) {
                    class334.field5322[var19] = var18.field3020[0];
                    class142.method974(var19, 1);
                }
            }
        }
        if (var7 == 12 && class140.field2371 == null) {
            class302.method2162(220, var6, var2);
            class140.field2371 = class204.method1392(var2, 1, var6);
            class52.method459(arg0 ^ 0x86, class140.field2371);
        }
        if (var7 == 36) {
            class323.field5227 = 0;
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class53.field1061 = class303.field4931;
            class51.field1038.method291((byte) -94, 117);
            class57.field1129++;
            class51.field1038.method1042((byte) -125, class309.field5052);
            class51.field1038.method1042((byte) -125, var2 + class21.field543);
            class51.field1038.method1002((byte) -114, var6 + class272.field4426);
            class51.field1038.method1042((byte) -125, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class51.field1038.method1027(class261.field4307[82] ? 1 : 0, -20374);
            class51.field1038.method1039((byte) -70, class303.field4936);
            class51.field1038.method1045((byte) 115, class15.field452);
            class354.method2517(var4, var6, arg0 ^ 0xFFFFBC17, var2);
        }
        if (var7 == 10) {
            class244.field4048 = 2;
            class133.field2289 = class37.field807;
            class53.field1061 = class303.field4931;
            class57.field1133++;
            class323.field5227 = 0;
            class51.field1038.method291((byte) 121, 252);
            class51.field1038.method1039((byte) -70, class21.field543 + var2);
            class51.field1038.method1042((byte) -125, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class51.field1038.method1042((byte) -125, class272.field4426 + var6);
            class51.field1038.method1013(class261.field4307[82] ? 1 : 0, arg0 ^ 0xFFFFFF82);
            class354.method2517(var4, var6, arg0 ^ 0xFFFFBC17, var2);
        }
        if (var7 == 35) {
            if (var3 == 0) {
                class231.field3795 = 1;
                class46.method380(class276.field4506, var6, var2);
            } else if (class300.field4883 > 0 && class261.field4307[82] && class261.field4307[81]) {
                class86.method653(class276.field4506, 3, class272.field4426 + var6, class21.field543 + var2);
            } else {
                class51.field1038.method291((byte) -83, 105);
                class51.field1038.method1042((byte) -125, class272.field4426 + var6);
                class191.field3232++;
                class51.field1038.method1002((byte) -121, class21.field543 + var2);
            }
        }
        if (var7 == 31) {
            if (var3 == 0) {
                class46.method380(class276.field4506, var6, var2);
            } else if (var3 == 1) {
                if (class300.field4883 > 0 && class261.field4307[82] && class261.field4307[81]) {
                    class86.method653(class276.field4506, 3, class272.field4426 + var6, class21.field543 + var2);
                } else {
                    class248.method1750(var6, 1, var2, -92);
                    class51.field1038.method1027(class296.field4835, -20374);
                    class51.field1038.method1027(class233.field3824, -20374);
                    class51.field1038.method1002((byte) -83, (int) class354.field5652);
                    class51.field1038.method1027(57, -20374);
                    if (class69.field1280 == 4) {
                        class51.field1038.method1027(0, -20374);
                        class51.field1038.method1027(0, arg0 ^ 0xFFFFB06C);
                    } else {
                        class51.field1038.method1027(class192.field3253, -20374);
                        class51.field1038.method1027(class292.field4726, -20374);
                    }
                    class51.field1038.method1027(89, -20374);
                    class51.field1038.method1002((byte) -89, class96.field1750.field199);
                    class51.field1038.method1002((byte) -82, class96.field1750.field213);
                    class51.field1038.method1027(class26.field660, arg0 - 20380);
                    class51.field1038.method1027(63, -20374);
                    class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], arg0 ^ 0x367B, var6, 0);
                }
            }
        }
        if (arg0 != 6) {
            field3671 = -116;
        }
        if (var7 == 1) {
            class323.field5227 = 0;
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class53.field1061 = class303.field4931;
            class269.field4398++;
            class51.field1038.method291((byte) -84, 108);
            class51.field1038.method1002((byte) -100, var3);
            class51.field1038.method1039((byte) -70, class21.field543 + var2);
            class51.field1038.method1002((byte) -126, class272.field4426 + var6);
            class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], arg0 + 13943, var6, 0);
        }
        if (var7 == 26) {
            field3673++;
            class51.field1038.method291((byte) -116, 91);
            class51.field1038.method1032(6951, var2);
            class51.field1038.method1042((byte) -125, var3);
            class51.field1038.method1023(var6, (byte) -28);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(arg0 ^ 0xFFFFFF84, var2);
            class282.field4620 = var6;
        }
        if (var7 == 3) {
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class355.field5662++;
            class323.field5227 = 0;
            class53.field1061 = class303.field4931;
            class51.field1038.method291((byte) 50, 249);
            class51.field1038.method1039((byte) -70, class21.field543 + var2);
            class51.field1038.method1039((byte) -70, Integer.MAX_VALUE & (int) (var4 >>> 32));
            class51.field1038.method1002((byte) -101, var6 + class272.field4426);
            class51.field1038.method1027(class261.field4307[82] ? 1 : 0, arg0 ^ 0xFFFFB06C);
            class354.method2517(var4, var6, -17391, var2);
        }
        if (var7 == 59) {
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class53.field1061 = class303.field4931;
            class351.field5597++;
            class323.field5227 = 0;
            class51.field1038.method291((byte) -85, 194);
            class51.field1038.method1039((byte) -70, class272.field4426 + var6);
            class51.field1038.method1002((byte) -94, var3);
            class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
            class51.field1038.method1023(class21.field543 + var2, (byte) -28);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
        }
        if (var7 == 60) {
            class39.field855++;
            class51.field1038.method291((byte) 90, 25);
            class51.field1038.method1039((byte) -70, var6);
            class51.field1038.method1039((byte) -70, var3);
            class51.field1038.method1032(6951, var2);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(arg0 ^ 0xFFFFFF85, var2);
            class282.field4620 = var6;
        }
        if (var7 == 46) {
            class314 var20 = class149.field2533[var3];
            if (var20 != null) {
                class133.field2289 = class37.field807;
                class244.field4048 = 2;
                class323.field5227 = 0;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) -125, 152);
                class267.field4365++;
                class51.field1038.method1023(var3, (byte) -28);
                class51.field1038.method1013(class261.field4307[82] ? 1 : 0, arg0 ^ 0x41);
                class166.method1186(var20.method49((byte) 107), var2, true, 0, 0, var20.method49((byte) 70), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 57) {
            class98 var21 = class182.field3151[var3];
            if (var21 != null) {
                class99.field1815++;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class244.field4048 = 2;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) -85, 40);
                class51.field1038.method1042((byte) -125, var3);
                class51.field1038.method1027(class261.field4307[82] ? 1 : 0, arg0 - 20380);
                class166.method1186(var21.method49((byte) -72), var2, true, 0, 0, var21.method49((byte) -66), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 23) {
            class204.field3397++;
            class51.field1038.method291((byte) 105, 188);
            class51.field1038.method1042((byte) -125, var3);
            class51.field1038.method1023(var6, (byte) -28);
            class51.field1038.method1045((byte) 120, var2);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-98, var2);
            class282.field4620 = var6;
        }
        if (var7 == 40) {
            boolean var22 = true;
            class181 var23 = class224.method1564(-121, var2);
            if (var23.field3059 > 0) {
                var22 = class266.method1869(var23, arg0 - 5);
            }
            if (var22) {
                class331.field5291++;
                class51.field1038.method291((byte) -87, 213);
                class51.field1038.method1045((byte) 122, var2);
            }
        }
        if (var7 == 48) {
            class51.field1038.method291((byte) 98, 121);
            class51.field1038.method1002((byte) -108, var6);
            class227.field3744++;
            class51.field1038.method1026(var2, (byte) 30);
            class51.field1038.method1023(var3, (byte) -28);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-126, var2);
            class282.field4620 = var6;
        }
        if (var7 == 47) {
            class314 var24 = class149.field2533[var3];
            if (var24 != null) {
                class53.field1061 = class303.field4931;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class244.field4048 = 2;
                class51.field1038.method291((byte) -113, 187);
                class36.field800++;
                class51.field1038.method1041(128, class261.field4307[82] ? 1 : 0);
                class51.field1038.method1042((byte) -125, var3);
                class166.method1186(var24.method49((byte) -89), var2, true, 0, 0, var24.method49((byte) -79), class96.field1750.field170[0], class96.field1750.field139[0], arg0 ^ 0x367B, var6, 0);
            }
        }
        if (var7 == 34) {
            class98 var25 = class182.field3151[var3];
            if (var25 != null) {
                class244.field4048 = 2;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) 44, 186);
                class219.field3634++;
                class51.field1038.method1013(class261.field4307[82] ? 1 : 0, arg0 - 132);
                class51.field1038.method1002((byte) -87, var3);
                class166.method1186(var25.method49((byte) -121), var2, true, 0, 0, var25.method49((byte) -118), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 5) {
            class323.field5227 = 0;
            class143.field2413++;
            class53.field1061 = class303.field4931;
            class244.field4048 = 2;
            class133.field2289 = class37.field807;
            class51.field1038.method291((byte) -87, 99);
            class51.field1038.method1039((byte) -70, class272.field4426 + var6);
            class51.field1038.method1013(class261.field4307[82] ? 1 : 0, 83);
            class51.field1038.method1002((byte) -99, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class51.field1038.method1002((byte) -86, class21.field543 + var2);
            class354.method2517(var4, var6, -17391, var2);
        }
        if (var7 == 7) {
            class341.method2410(true);
        }
        if (var7 == 39) {
            class244.field4048 = 2;
            class133.field2289 = class37.field807;
            class58.field1146++;
            class53.field1061 = class303.field4931;
            class323.field5227 = 0;
            class51.field1038.method291((byte) 72, 140);
            class51.field1038.method1002((byte) -124, var3);
            class51.field1038.method1048((byte) 87, class261.field4307[82] ? 1 : 0);
            class51.field1038.method1023(var6 + class272.field4426, (byte) -28);
            class51.field1038.method1032(6951, class119.field2126);
            class51.field1038.method1039((byte) -70, class21.field543 + var2);
            class51.field1038.method1039((byte) -70, class354.field5650);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
        }
        if (var7 == 13) {
            class83.field1427++;
            class51.field1038.method291((byte) 59, 34);
            class51.field1038.method1045((byte) -26, var2);
            class51.field1038.method1039((byte) -70, var3);
            class51.field1038.method1042((byte) -125, class309.field5052);
            class51.field1038.method1002((byte) -108, class303.field4936);
            class51.field1038.method1042((byte) -125, var6);
            class51.field1038.method1045((byte) -7, class15.field452);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-94, var2);
            class282.field4620 = var6;
        }
        if (var7 == 1008 || var7 == 1006 || var7 == 1005 || var7 == 1003 || var7 == 1009) {
            class41.method323((byte) 51, var7, var3, var6);
        }
        if (var7 == 30) {
            class98 var26 = class182.field3151[var3];
            if (var26 != null) {
                class53.field1061 = class303.field4931;
                class244.field4048 = 2;
                class248.field4067++;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class51.field1038.method291((byte) -114, 190);
                class51.field1038.method1042((byte) -125, var3);
                class51.field1038.method1048((byte) 115, class261.field4307[82] ? 1 : 0);
                class166.method1186(var26.method49((byte) 124), var2, true, 0, 0, var26.method49((byte) -111), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 1007) {
            class133.field2289 = class37.field807;
            class53.field1061 = class303.field4931;
            class151.field2563++;
            class244.field4048 = 2;
            class323.field5227 = 0;
            class51.field1038.method291((byte) -101, 179);
            class51.field1038.method1027(class261.field4307[82] ? 1 : 0, arg0 - 20380);
            class51.field1038.method1039((byte) -70, class272.field4426 + var6);
            class51.field1038.method1042((byte) -125, (int) (var4 >>> 32) & Integer.MAX_VALUE);
            class51.field1038.method1023(var2 + class21.field543, (byte) -28);
            class354.method2517(var4, var6, -17391, var2);
        }
        if (var7 == 1001) {
            class181 var27 = class224.method1564(-103, var2);
            if (var27 == null || var27.field2989[var6] < 100000) {
                class257.field4203++;
                class51.field1038.method291((byte) 42, 124);
                class51.field1038.method1002((byte) -80, var3);
            } else {
                class172.method1225(var27.field2989[var6] + " x " + class296.method2124(0, var3).field318, 0);
            }
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-100, var2);
            class282.field4620 = var6;
        }
        if (var7 == 18) {
            class344.field5430++;
            class53.field1061 = class303.field4931;
            class323.field5227 = 0;
            class133.field2289 = class37.field807;
            class244.field4048 = 2;
            class51.field1038.method291((byte) -90, 169);
            class51.field1038.method1023(class272.field4426 + var6, (byte) -28);
            class51.field1038.method1013(class261.field4307[82] ? 1 : 0, arg0 ^ 0xFFFFFF81);
            class51.field1038.method1002((byte) -104, class21.field543 + var2);
            class51.field1038.method1042((byte) -125, var3);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
        }
        if (var7 == 24) {
            class244.field4048 = 2;
            class133.field2289 = class37.field807;
            class53.field1061 = class303.field4931;
            class323.field5227 = 0;
            class51.field1038.method291((byte) -97, 217);
            class174.field2890++;
            class51.field1038.method1039((byte) -70, class309.field5052);
            class51.field1038.method1039((byte) -70, var3);
            class51.field1038.method1002((byte) -120, class272.field4426 + var6);
            class51.field1038.method1023(class21.field543 + var2, (byte) -28);
            class51.field1038.method1026(class15.field452, (byte) 30);
            class51.field1038.method1027(class261.field4307[82] ? 1 : 0, -20374);
            class51.field1038.method1042((byte) -125, class303.field4936);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], arg0 ^ 0x367B, var6, 0);
        }
        if (var7 == 6) {
            class314 var28 = class149.field2533[var3];
            if (var28 != null) {
                class53.field1061 = class303.field4931;
                class244.field4048 = 2;
                class133.field2289 = class37.field807;
                class323.field5227 = 0;
                class51.field1038.method291((byte) -108, 229);
                class36.field787++;
                class51.field1038.method1039((byte) -70, var3);
                class51.field1038.method1013(class261.field4307[82] ? 1 : 0, arg0 ^ 0xFFFFFF80);
                class166.method1186(var28.method49((byte) 126), var2, true, 0, 0, var28.method49((byte) 80), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 15) {
            class27.field678++;
            class244.field4048 = 2;
            class133.field2289 = class37.field807;
            class53.field1061 = class303.field4931;
            class323.field5227 = 0;
            class51.field1038.method291((byte) -119, 181);
            class51.field1038.method1023(class21.field543 + var2, (byte) -28);
            class51.field1038.method1002((byte) -126, var3);
            class51.field1038.method1002((byte) -88, class272.field4426 + var6);
            class51.field1038.method1048((byte) 93, class261.field4307[82] ? 1 : 0);
            class166.method1186(0, var2, true, 0, 0, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
        }
        if (var7 == 33) {
            class331.field5291++;
            class51.field1038.method291((byte) 93, 213);
            class51.field1038.method1045((byte) 123, var2);
            class181 var29 = class224.method1564(-102, var2);
            if (var29.field3093 != null && var29.field3093[0][0] == 5) {
                int var30 = var29.field3093[0][1];
                class334.field5322[var30] = 1 - class334.field5322[var30];
                class142.method974(var30, 1);
            }
        }
        if (var7 == 38) {
            class98 var31 = class182.field3151[var3];
            if (var31 != null) {
                class335.field5331++;
                class323.field5227 = 0;
                class133.field2289 = class37.field807;
                class244.field4048 = 2;
                class53.field1061 = class303.field4931;
                class51.field1038.method291((byte) -93, 142);
                class51.field1038.method1042((byte) -125, var3);
                class51.field1038.method1027(class261.field4307[82] ? 1 : 0, -20374);
                class166.method1186(var31.method49((byte) 69), var2, true, 0, 0, var31.method49((byte) 94), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 9) {
            class51.field1038.method291((byte) 78, 175);
            class287.field4692++;
            class51.field1038.method1002((byte) -93, var3);
            class51.field1038.method1002((byte) -98, var6);
            class51.field1038.method1026(var2, (byte) 30);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-126, var2);
            class282.field4620 = var6;
        }
        if (var7 == 21) {
            class98 var32 = class182.field3151[var3];
            if (var32 != null) {
                class272.field4423++;
                class323.field5227 = 0;
                class244.field4048 = 2;
                class53.field1061 = class303.field4931;
                class133.field2289 = class37.field807;
                class51.field1038.method291((byte) 127, 36);
                class51.field1038.method1032(6951, class15.field452);
                class51.field1038.method1027(class261.field4307[82] ? 1 : 0, -20374);
                class51.field1038.method1039((byte) -70, var3);
                class51.field1038.method1039((byte) -70, class303.field4936);
                class51.field1038.method1002((byte) -112, class309.field5052);
                class166.method1186(var32.method49((byte) 127), var2, true, 0, 0, var32.method49((byte) -65), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 29) {
            class51.field1038.method291((byte) -81, 174);
            class51.field1038.method1039((byte) -70, var3);
            class170.field2814++;
            class51.field1038.method1026(var2, (byte) 30);
            class51.field1038.method1039((byte) -70, var6);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-123, var2);
            class282.field4620 = var6;
        }
        if (var7 == 22) {
            class7.field234++;
            class51.field1038.method291((byte) 65, 61);
            class51.field1038.method1023(var3, (byte) -28);
            class51.field1038.method1002((byte) -116, class354.field5650);
            class51.field1038.method1043((byte) 119, var2);
            class51.field1038.method1032(6951, class119.field2126);
            class51.field1038.method1023(var6, (byte) -28);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-100, var2);
            class282.field4620 = var6;
        }
        if (var7 == 45) {
            class98 var33 = class182.field3151[var3];
            if (var33 != null) {
                class244.field4048 = 2;
                class53.field1061 = class303.field4931;
                class133.field2289 = class37.field807;
                class127.field2209++;
                class323.field5227 = 0;
                class51.field1038.method291((byte) -90, 180);
                class51.field1038.method1002((byte) -113, var3);
                class51.field1038.method1048((byte) 100, class261.field4307[82] ? 1 : 0);
                class166.method1186(var33.method49((byte) 74), var2, true, 0, 0, var33.method49((byte) -97), class96.field1750.field170[0], class96.field1750.field139[0], 13949, var6, 0);
            }
        }
        if (var7 == 44) {
            class266.method1865(-1);
            class181 var34 = class224.method1564(-116, var2);
            class309.field5052 = var3;
            class303.field4936 = var6;
            class15.field452 = var2;
            field3674 = 1;
            class52.method459(128, var34);
            class147.field2511 = "<col=ff9040>" + class296.method2124(0, var3).field318 + "<col=ffffff>";
            if (class147.field2511 == null) {
                class147.field2511 = "null";
            }
            return;
        }
        if (var7 == 8) {
            class284.field4646++;
            class51.field1038.method291((byte) 115, 88);
            class51.field1038.method1042((byte) -125, var3);
            class51.field1038.method1042((byte) -125, var6);
            class51.field1038.method1045((byte) 121, var2);
            class156.field2646 = 0;
            class299.field4852 = class224.method1564(-124, var2);
            class282.field4620 = var6;
        }
        if (field3674 != 0) {
            field3674 = 0;
            class52.method459(128, class224.method1564(-99, class15.field452));
        }
        if (class52.field1046) {
            class266.method1865(-1);
        }
        if (class299.field4852 != null && class156.field2646 == 0) {
            class52.method459(128, class299.field4852);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZI)V", line = 1630)
    public static final void method1557(int arg0, boolean arg1, int arg2) {
        field3676++;
        if (!arg1) {
            method1553(false, -88);
        }
        if (class267.method1874(arg2, (byte) 12)) {
            class310.method2258(arg0, (byte) 25, class178.field2938[arg2]);
        }
    }
}
