import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class278 {

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field4659 = 10;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Luf;")
    private static class168 field4660 = class148.method1019(-1720, "Members only world");

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Luf;")
    public static class168 field4667 = field4660;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "D")
    public static double field4665 = -1.0D;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field4670 = 3353893;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
    public static int[] field4669 = new int[99];

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "F")
    public static float field4672;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Lkj;")
    public static class116 field4671;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "Lfj;")
    public static class283 field4658;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4669[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V", line = 28)
    public static final void method1918(boolean arg0, int arg1) {
        field4668++;
        if (class266.field4489.field3027 >> 7 == class151.field2348 && class266.field4489.field3021 >> 7 == class215.field3509) {
            class151.field2348 = 0;
        }
        int var2 = class167.field2676;
        if (arg1 < 44) {
            return;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class54 var4;
            long var5;
            if (arg0) {
                var4 = class266.field4489;
                var5 = 8791798054912L;
            } else {
                var4 = class9.field117[class281.field4719[var3]];
                var5 = (long) class281.field4719[var3] << 32;
            }
            if (var4 != null && var4.method111(0)) {
                var4.field692 = false;
                if ((class120.field1865 && class167.field2676 > 200 || class167.field2676 > 50) && !arg0 && var4.field3045 == var4.field3002) {
                    var4.field692 = true;
                }
                int var7 = var4.field3021 >> 7;
                int var8 = var4.field3027 >> 7;
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field687 == null || class203.field3335 < var4.field691 || var4.field682 <= class203.field3335) {
                        if (var4.field3012 == 1 && (var4.field3027 & 0x7F) == 64 && (var4.field3021 & 0x7F) == 64) {
                            if (class96.field1537[var8][var7] == class134.field2091) {
                                continue;
                            }
                            class96.field1537[var8][var7] = class134.field2091;
                        }
                        var4.field3055 = class62.method349(128, class79.field1127, var4.field3021, var4.field3027);
                        class2.method6(class79.field1127, var4.field3027, var4.field3021, var4.field3055, var4.field3012 * 64 + 60 - 64, var4, var4.field3008, var5, var4.field3010);
                    } else {
                        var4.field692 = false;
                        var4.field3055 = class62.method349(128, class79.field1127, var4.field3021, var4.field3027);
                        class267.method1861(class79.field1127, var4.field3027, var4.field3021, var4.field3055, var4, var4.field3008, var5, var4.field685, var4.field679, var4.field663, var4.field686);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)I", line = 116)
    public static final int method1919(int arg0, byte arg1) {
        field4662++;
        if (arg1 != -127) {
            field4672 = 0.33375347F;
        }
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ldk;B)V", line = 140)
    public static final void method1920(class241 arg0, byte arg1) {
        int var2 = 25 / ((-arg1 - 33) / 54);
        field4666++;
        class141.field2177 = arg0;
        class133.field2070 = class141.field2177.method1633(108, 4);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 154)
    public static void method1921(byte arg0) {
        field4671 = null;
        field4660 = null;
        field4669 = null;
        field4658 = null;
        int var1 = 89 % ((arg0 - 66) / 53);
        field4667 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIIII)V", line = 172)
    public static final void method1922(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class127 var6 = class92.field1424[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class264 var7 = var6.field1973;
        if (var7 != null) {
            int var8 = var7.field4464;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class4 var10 = var6.field1963;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field27;
        int var12 = var10.field26;
        int var13 = var10.field32;
        int var14 = var10.field43;
        int[] var15 = class18.field213[var11];
        int[] var16 = class143.field2211[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 265)
    public static final void method1923(byte arg0) {
        boolean var1 = true;
        field4664++;
        class123.method874(false, (byte) -100);
        class236.field3777 = 0;
        for (int var2 = 0; var2 < class151.field2336.length; var2++) {
            if (class215.field3502[var2] != -1 && class151.field2336[var2] == null) {
                class151.field2336[var2] = class175.field2830.method1647(class215.field3502[var2], (byte) 123, 0);
                if (class151.field2336[var2] == null) {
                    class236.field3777++;
                    var1 = false;
                }
            }
            if (class157.field2492[var2] != -1 && class51.field625[var2] == null) {
                class51.field625[var2] = class175.field2830.method1641((byte) -124, 0, class280.field4708[var2], class157.field2492[var2]);
                if (class51.field625[var2] == null) {
                    class236.field3777++;
                    var1 = false;
                }
            }
            if (class196.field3228[var2] != -1 && class28.field356[var2] == null) {
                class28.field356[var2] = class175.field2830.method1647(class196.field3228[var2], (byte) 126, 0);
                if (class28.field356[var2] == null) {
                    class236.field3777++;
                    var1 = false;
                }
            }
            if (class76.field1011[var2] != -1 && class78.field1077[var2] == null) {
                class78.field1077[var2] = class175.field2830.method1647(class76.field1011[var2], (byte) 124, 0);
                if (class78.field1077[var2] == null) {
                    class236.field3777++;
                    var1 = false;
                }
            }
            if (class247.field4232 != null && class39.field482[var2] == null && class247.field4232[var2] != -1) {
                class39.field482[var2] = class175.field2830.method1641((byte) -120, 0, class280.field4708[var2], class247.field4232[var2]);
                if (class39.field482[var2] == null) {
                    var1 = false;
                    class236.field3777++;
                }
            }
        }
        if (class262.field4453 == null || !class91.field1401.method1651(true, class134.method938((byte) -126, new class168[] { class262.field4453.field2826, class133.field2080 }))) {
            class60.field780 = null;
        } else if (class91.field1401.method1649(-1630, class134.method938((byte) -123, new class168[] { class262.field4453.field2826, class133.field2080 }))) {
            class60.field780 = class118.method848(class91.field1401, -72, class134.method938((byte) -124, new class168[] { class262.field4453.field2826, class133.field2080 }));
        } else {
            class236.field3777++;
            var1 = false;
        }
        if (!var1) {
            class178.field2870 = 1;
            return;
        }
        class263.field4455 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class151.field2336.length; var4++) {
            byte[] var5 = class51.field625[var4];
            if (var5 != null) {
                int var6 = (class303.field5104[var4] >> 8) * 64 - class182.field2916;
                int var7 = (class303.field5104[var4] & 0xFF) * 64 - class276.field4641;
                if (class253.field4311) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class251.method1716(var7, -1, var5, var6);
            }
            byte[] var8 = class78.field1077[var4];
            if (var8 != null) {
                int var9 = (class303.field5104[var4] >> 8) * 64 - class182.field2916;
                int var10 = (class303.field5104[var4] & 0xFF) * 64 - class276.field4641;
                if (class253.field4311) {
                    var10 = 10;
                    var9 = 10;
                }
                var3 &= class251.method1716(var10, -1, var8, var9);
            }
        }
        if (!var3) {
            class178.field2870 = 2;
            return;
        }
        if (arg0 < 47) {
            method1922((int[]) null, 106, 62, 28, -118, 92);
        }
        if (class178.field2870 != 0) {
            class113.method830(true, 13, class134.method938((byte) -123, new class168[] { class70.field920, class221.field3593 }));
        }
        boolean var11 = false;
        class254.method1750((byte) 90);
        class102.method765((byte) 91);
        class43.method238();
        for (int var12 = 0; var12 < class151.field2336.length; var12++) {
            if (class78.field1077[var12] != null || class28.field356[var12] != null) {
                var11 = true;
                break;
            }
        }
        if (!client.field4939) {
            var11 = false;
        }
        if (var11) {
            class130.method913(1);
        } else {
            class247.method1700();
        }
        for (int var13 = 0; var13 < 4; var13++) {
            class140.field2176[var13].method1728(16777216);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class159.field2520[var14][var15][var16] = 0;
                }
            }
        }
        class111.method823(false, -109);
        class100.field1566.method1843();
        for (int var17 = 0; var17 < 13; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                class100.field1567[var17][var18].field518 = true;
            }
        }
        class257.method1755();
        class76.method441((byte) -73);
        class254.method1750((byte) -24);
        System.gc();
        class123.method874(true, (byte) -109);
        class80.method502(false, -125);
        if (!class253.field4311) {
            class79.method472((byte) -122, false);
            class123.method874(true, (byte) -80);
            int var19 = class266.field4489.field3020[0] >> 3;
            int var20 = class266.field4489.field3033[0] >> 3;
            class297.method2035(var20, 1, var19);
            class85.method588((byte) -116, false);
            if (class39.field482 != null) {
                class14.method56(63);
            }
        }
        if (class253.field4311) {
            class205.method1434((byte) -123, false);
            class123.method874(true, (byte) -125);
            int var21 = class266.field4489.field3020[0] >> 3;
            int var22 = class266.field4489.field3033[0] >> 3;
            class297.method2035(var22, 1, var21);
            class292.method2002(false, (byte) -53);
        }
        class102.method765((byte) 116);
        class123.method874(true, (byte) -105);
        class219.method1518(true, class140.field2176, false);
        class257.method1767();
        class123.method874(true, (byte) -108);
        int var23 = class20.field250;
        if (class79.field1127 < var23) {
            var23 = class79.field1127;
        }
        if (class79.field1127 - 1 > var23) {
            int var24 = class79.field1127 - 1;
        }
        if (class155.method1102(-6)) {
            class197.method1390(0);
        } else {
            class197.method1390(class20.field250);
        }
        class274.method1895(25002);
        if (var11) {
            class285.method1966(true);
            class80.method502(true, -112);
            if (!class253.field4311) {
                class79.method472((byte) -58, true);
                class123.method874(true, (byte) -82);
                class85.method588((byte) -120, true);
            }
            if (class253.field4311) {
                class205.method1434((byte) -108, true);
                class123.method874(true, (byte) -110);
                class292.method2002(true, (byte) -58);
            }
            class102.method765((byte) 104);
            class123.method874(true, (byte) -90);
            class219.method1518(true, class140.field2176, true);
            class123.method874(true, (byte) -84);
            class274.method1895(25002);
            class285.method1966(false);
        }
        for (int var25 = 0; var25 < 13; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                class100.field1567[var25][var26].method232(class227.field3686[0], var25 * 8, var26 * 8);
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class204.method1427(var28, -25477, var27);
            }
        }
        class118.method855(false);
        class254.method1750((byte) -51);
        class180.method1293((byte) 98);
        class102.method765((byte) 101);
        if (class283.field4782 != null && class157.field2493 != null && class193.field3143 == 25) {
            class249.field4262.method726(149, 2138389379);
            class249.field4262.method1045(1057001181, (byte) 52);
            class95.field1525++;
        }
        if (!class253.field4311) {
            int var29 = (class282.field4739 - 6) / 8;
            int var30 = (class282.field4739 + 6) / 8;
            int var31 = (class144.field2221 - 6) / 8;
            int var32 = (class144.field2221 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= (var32 + 1); var34++) {
                    if (var29 > var33 || var33 > var30 || var34 < var31 || var32 < var34) {
                        class175.field2830.method1643(class134.method938((byte) -123, new class168[] { class133.field2072, class169.method1228(var33, 0), class188.field2986, class169.method1228(var34, 0) }), 104);
                        class175.field2830.method1643(class134.method938((byte) -124, new class168[] { class283.field4795, class169.method1228(var33, 0), class188.field2986, class169.method1228(var34, 0) }), -116);
                    }
                }
            }
        }
        if (class193.field3143 == 28) {
            class109.method810(10, 8858);
        } else {
            class109.method810(30, 8858);
            if (class157.field2493 != null) {
                class249.field4262.method726(201, 2138389379);
            }
        }
        class254.method1750((byte) 91);
        class289.method1987(112);
    }
}
