import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class226 {

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[[[I")
    public static int[][][] field3319 = new int[2][][];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3323 = 0;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "J")
    public long field3318;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lff;")
    public class4 field3313;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lff;")
    public class4 field3315;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lff;")
    public class4 field3326;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
    public static void method1565(boolean arg0) {
        if (!arg0) {
            field3319 = null;
        }
        field3319 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static final void method1566(byte arg0) {
        field3322++;
        byte var1 = 0;
        class207.method1461(class265.field4245, (byte) -89);
        int var2 = (class260.field4024 >> 10) + (class149.field2390 >> 3);
        int var3 = (class93.field1533 >> 10) + (class163.field2520 >> 3);
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class7.field75 = new byte[var6][];
        class254.field3838 = new int[var6];
        class207.field3055 = new int[var6];
        if (arg0 > -60) {
            method1568((class313) null, true);
        }
        class219.field3199 = new int[var6];
        class128.field2145 = new byte[var6][];
        class279.field4501 = new int[var6];
        class53.field768 = new int[var6];
        class1.field8 = new int[var6][4];
        class299.field4825 = new int[var6];
        class170.field2576 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class53.field768[var7] = var11;
                class279.field4501[var7] = class296.field4754.method1884("m" + var8 + "_" + var10, (byte) -84);
                class207.field3055[var7] = class296.field4754.method1884("l" + var8 + "_" + var10, (byte) 124);
                class219.field3199[var7] = class296.field4754.method1884("n" + var8 + "_" + var10, (byte) 118);
                class254.field3838[var7] = class296.field4754.method1884("um" + var8 + "_" + var10, (byte) 29);
                class299.field4825[var7] = class296.field4754.method1884("ul" + var8 + "_" + var10, (byte) -28);
                if (class219.field3199[var7] == -1) {
                    class279.field4501[var7] = -1;
                    class207.field3055[var7] = -1;
                    class254.field3838[var7] = -1;
                    class299.field4825[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class219.field3199.length; var9++) {
            class219.field3199[var9] = -1;
            class279.field4501[var9] = -1;
            class207.field3055[var9] = -1;
            class254.field3838[var9] = -1;
            class299.field4825[var9] = -1;
        }
        class21.method149(-24394, var1, true, var3, var5, var4, false, var2);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3316++;
        if (arg2 != 64) {
            field3319 = null;
        }
        for (class301 var5 = (class301) class17.field178.method8(-99); var5 != null; var5 = (class301) class17.field178.method12((byte) 69)) {
            class108.method829(arg4, arg3, arg1, (byte) -128, arg0, var5);
        }
        for (class301 var6 = (class301) class219.field3193.method8(-92); var6 != null; var6 = (class301) class219.field3193.method12((byte) 69)) {
            byte var11 = 1;
            class294 var12 = var6.field4858.method1708(0);
            if (var6.field4858.field3752 == var12.field4703) {
                var11 = 0;
            } else if (var6.field4858.field3752 == var12.field4713 || var6.field4858.field3752 == var12.field4680 || var6.field4858.field3752 == var12.field4689 || var6.field4858.field3752 == var12.field4681) {
                var11 = 2;
            } else if (var6.field4858.field3752 == var12.field4710 || var6.field4858.field3752 == var12.field4674 || var6.field4858.field3752 == var12.field4706 || var6.field4858.field3752 == var12.field4679) {
                var11 = 3;
            }
            if (var6.field4855 != var11) {
                int var13 = class169.method1204((byte) -110, var6.field4858);
                if (var6.field4861 != var13) {
                    if (var6.field4854 != null) {
                        class241.field3543.method1248(var6.field4854);
                        var6.field4854 = null;
                    }
                    var6.field4861 = var13;
                }
                var6.field4855 = var11;
            }
            var6.field4859 = var6.field4858.field3660;
            var6.field4866 = var6.field4858.field3660 + var6.field4858.method1467(0) * 64;
            var6.field4874 = var6.field4858.field3753;
            var6.field4871 = var6.field4858.field3753 + (var6.field4858.method1467(0) * 64);
            class108.method829(arg4, arg3, arg1, (byte) -112, arg0, var6);
        }
        for (class301 var7 = (class301) class21.field233.method1071(-125); var7 != null; var7 = (class301) class21.field233.method1069(-123)) {
            byte var8 = 1;
            class294 var9 = var7.field4856.method1708(0);
            if (var7.field4856.field3752 == var9.field4703) {
                var8 = 0;
            } else if (var7.field4856.field3752 == var9.field4713 || var7.field4856.field3752 == var9.field4680 || var7.field4856.field3752 == var9.field4689 || var7.field4856.field3752 == var9.field4681) {
                var8 = 2;
            } else if (var7.field4856.field3752 == var9.field4710 || var7.field4856.field3752 == var9.field4674 || var7.field4856.field3752 == var9.field4706 || var7.field4856.field3752 == var9.field4679) {
                var8 = 3;
            }
            if (var7.field4855 != var8) {
                int var10 = class253.method1745(var7.field4856, 1);
                if (var7.field4861 != var10) {
                    if (var7.field4854 != null) {
                        class241.field3543.method1248(var7.field4854);
                        var7.field4854 = null;
                    }
                    var7.field4861 = var10;
                }
                var7.field4855 = var8;
            }
            var7.field4859 = var7.field4856.field3660;
            var7.field4866 = var7.field4856.field3660 + var7.field4856.method1467(0) * 64;
            var7.field4874 = var7.field4856.field3753;
            var7.field4871 = var7.field4856.field3753 + (var7.field4856.method1467(0) * 64);
            class108.method829(arg4, arg3, arg1, (byte) -122, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lf;Z)V")
    public static final void method1568(class313 arg0, boolean arg1) {
        class152.field2398.method13(32, arg0);
        while (true) {
            class313 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class313[][] var7;
            class313 var83;
            do {
                class313 var82;
                do {
                    class313 var81;
                    do {
                        class313 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class313) class152.field2398.method11(-123);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field5029);
                                            var3 = var2.field5010;
                                            var4 = var2.field5025;
                                            var5 = var2.field5019;
                                            var6 = var2.field5008;
                                            var7 = class223.field3286[var5];
                                            if (!var2.field5020) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class313 var8 = class223.field3286[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field5029) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class142.field2288 && var3 > class223.field3264) {
                                                    class313 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field5029 && (var9.field5020 || (var2.field5011 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class142.field2288 && var3 < class251.field3796 - 1) {
                                                    class313 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field5029 && (var10.field5020 || (var2.field5011 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class138.field2252 && var4 > class104.field1797) {
                                                    class313 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field5029 && (var11.field5020 || (var2.field5011 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class138.field2252 && var4 < class218.field3186 - 1) {
                                                    class313 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field5029 && (var12.field5020 || (var2.field5011 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field5020 = false;
                                            if (var2.field5009 != null) {
                                                class313 var13 = var2.field5009;
                                                if (var13.field5014 == null) {
                                                    if (var13.field5016 != null) {
                                                        if (class152.method1125(0, var3, var4)) {
                                                            class264.method1820(var13.field5016, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, true);
                                                        } else {
                                                            class264.method1820(var13.field5016, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class152.method1125(0, var3, var4)) {
                                                    class195.method1378(var13.field5014, 0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, true);
                                                } else {
                                                    class195.method1378(var13.field5014, 0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, false);
                                                }
                                                class231 var14 = var13.field5012;
                                                if (var14 != null) {
                                                    var14.field3401.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var14.field3399 - class159.field2479, var14.field3391 - class282.field4540, var14.field3403 - class141.field2281, var14.field3393, var5, (class88) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field5022; var15++) {
                                                    class156 var16 = var13.field5037[var15];
                                                    if (var16 != null) {
                                                        var16.field2436.method16(var16.field2442, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var16.field2440 - class159.field2479, var16.field2437 - class282.field4540, var16.field2445 - class141.field2281, var16.field2431, var5, (class88) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field5014 == null) {
                                                if (var2.field5016 != null) {
                                                    if (class152.method1125(var6, var3, var4)) {
                                                        class264.method1820(var2.field5016, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class264.method1820(var2.field5016, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, false);
                                                    }
                                                }
                                            } else if (class152.method1125(var6, var3, var4)) {
                                                class195.method1378(var2.field5014, var6, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field5014.field4912 != 12345678 || class32.field404 && var5 <= class25.field278) {
                                                    class195.method1378(var2.field5014, var6, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class214 var18 = var2.field5027;
                                                if (var18 != null && (var18.field3151 & 0x80000000L) != 0L) {
                                                    var18.field3150.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var18.field3142 - class159.field2479, var18.field3144 - class282.field4540, var18.field3143 - class141.field2281, var18.field3151, var5, (class88) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class231 var21 = var2.field5012;
                                            class272 var22 = var2.field5023;
                                            if (var21 != null || var22 != null) {
                                                if (class142.field2288 == var3) {
                                                    var19++;
                                                } else if (class142.field2288 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class138.field2252 == var4) {
                                                    var19 += 3;
                                                } else if (class138.field2252 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class134.field2201[var19];
                                                var2.field5033 = class102.field1746[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3398 & class6.field55[var19]) == 0) {
                                                    var2.field5031 = 0;
                                                } else if (var21.field3398 == 16) {
                                                    var2.field5031 = 3;
                                                    var2.field5030 = class100.field1705[var19];
                                                    var2.field5036 = 3 - var2.field5030;
                                                } else if (var21.field3398 == 32) {
                                                    var2.field5031 = 6;
                                                    var2.field5030 = class147.field2365[var19];
                                                    var2.field5036 = 6 - var2.field5030;
                                                } else if (var21.field3398 == 64) {
                                                    var2.field5031 = 12;
                                                    var2.field5030 = class172.field2625[var19];
                                                    var2.field5036 = 12 - var2.field5030;
                                                } else {
                                                    var2.field5031 = 9;
                                                    var2.field5030 = class225.field3309[var19];
                                                    var2.field5036 = 9 - var2.field5030;
                                                }
                                                if ((var21.field3398 & var20) != 0 && !class78.method578(var6, var3, var4, var21.field3398)) {
                                                    var21.field3401.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var21.field3399 - class159.field2479, var21.field3391 - class282.field4540, var21.field3403 - class141.field2281, var21.field3393, var5, (class88) null);
                                                }
                                                if ((var21.field3389 & var20) != 0 && !class78.method578(var6, var3, var4, var21.field3389)) {
                                                    var21.field3388.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var21.field3399 - class159.field2479, var21.field3391 - class282.field4540, var21.field3403 - class141.field2281, var21.field3393, var5, (class88) null);
                                                }
                                            }
                                            if (var22 != null && !class225.method1560(var6, var3, var4, var22.field4402.method17())) {
                                                if ((var22.field4405 & var20) != 0) {
                                                    var22.field4402.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var22.field4397 + var22.field4398 - class159.field2479, var22.field4403 - class282.field4540, var22.field4396 + var22.field4406 - class141.field2281, var22.field4393, var5, (class88) null);
                                                } else if (var22.field4405 == 256) {
                                                    int var23 = var22.field4397 - class159.field2479;
                                                    int var24 = var22.field4403 - class282.field4540;
                                                    int var25 = var22.field4396 - class141.field2281;
                                                    int var26 = var22.field4407;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field4402.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var22.field4398 + var23, var24, var22.field4406 + var25, var22.field4393, var5, (class88) null);
                                                    } else if (var22.field4401 != null) {
                                                        var22.field4401.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var23, var24, var25, var22.field4393, var5, (class88) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class214 var29 = var2.field5027;
                                                if (var29 != null && (var29.field3151 & 0x80000000L) == 0L) {
                                                    var29.field3150.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var29.field3142 - class159.field2479, var29.field3144 - class282.field4540, var29.field3143 - class141.field2281, var29.field3151, var5, (class88) null);
                                                }
                                                class226 var30 = var2.field5013;
                                                if (var30 != null && var30.field3325 == 0) {
                                                    if (var30.field3326 != null) {
                                                        var30.field3326.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var30.field3317 - class159.field2479, var30.field3314 - class282.field4540, var30.field3320 - class141.field2281, var30.field3318, var5, (class88) null);
                                                    }
                                                    if (var30.field3315 != null) {
                                                        var30.field3315.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var30.field3317 - class159.field2479, var30.field3314 - class282.field4540, var30.field3320 - class141.field2281, var30.field3318, var5, (class88) null);
                                                    }
                                                    if (var30.field3313 != null) {
                                                        var30.field3313.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var30.field3317 - class159.field2479, var30.field3314 - class282.field4540, var30.field3320 - class141.field2281, var30.field3318, var5, (class88) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field5011;
                                            if (var31 != 0) {
                                                if (var3 < class142.field2288 && (var31 & 0x4) != 0) {
                                                    class313 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field5029) {
                                                        class152.field2398.method13(32, var32);
                                                    }
                                                }
                                                if (var4 < class138.field2252 && (var31 & 0x2) != 0) {
                                                    class313 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field5029) {
                                                        class152.field2398.method13(32, var33);
                                                    }
                                                }
                                                if (var3 > class142.field2288 && (var31 & 0x1) != 0) {
                                                    class313 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field5029) {
                                                        class152.field2398.method13(32, var34);
                                                    }
                                                }
                                                if (var4 > class138.field2252 && (var31 & 0x8) != 0) {
                                                    class313 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field5029) {
                                                        class152.field2398.method13(32, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field5031 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field5022; var37++) {
                                                if (class47.field652 != var2.field5037[var37].field2444 && (var2.field5021[var37] & var2.field5031) == var2.field5030) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class231 var38 = var2.field5012;
                                                if (!class78.method578(var6, var3, var4, var38.field3398)) {
                                                    var38.field3401.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var38.field3399 - class159.field2479, var38.field3391 - class282.field4540, var38.field3403 - class141.field2281, var38.field3393, var5, (class88) null);
                                                }
                                                var2.field5031 = 0;
                                            }
                                        }
                                        if (!var2.field5028) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field5022;
                                            var2.field5028 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; var41++) {
                                                class156 var42 = var2.field5037[var41];
                                                if (class47.field652 != var42.field2444) {
                                                    for (int var43 = var42.field2443; var43 <= var42.field2447; var43++) {
                                                        for (int var44 = var42.field2432; var44 <= var42.field2441; var44++) {
                                                            class313 var45 = var7[var43][var44];
                                                            if (var45.field5020) {
                                                                var2.field5028 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field5031 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2443) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2447) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2432) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2441) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field5031) == var2.field5036) {
                                                                    var2.field5028 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class5.field51[var40++] = var42;
                                                    int var47 = class142.field2288 - var42.field2443;
                                                    int var48 = var42.field2447 - class142.field2288;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class138.field2252 - var42.field2432;
                                                    int var50 = var42.field2441 - class138.field2252;
                                                    if (var50 > var49) {
                                                        var42.field2429 = var47 + var50;
                                                    } else {
                                                        var42.field2429 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class156 var54 = class5.field51[var53];
                                                    if (class47.field652 != var54.field2444) {
                                                        if (var54.field2429 > var51) {
                                                            var51 = var54.field2429;
                                                            var52 = var53;
                                                        } else if (var54.field2429 == var51) {
                                                            int var55 = var54.field2440 - class159.field2479;
                                                            int var56 = var54.field2445 - class141.field2281;
                                                            int var57 = class5.field51[var52].field2440 - class159.field2479;
                                                            int var58 = class5.field51[var52].field2445 - class141.field2281;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class156 var59 = class5.field51[var52];
                                                var59.field2444 = class47.field652;
                                                if (!class140.method1052(var6, var59.field2443, var59.field2447, var59.field2432, var59.field2441, var59.field2436.method17())) {
                                                    var59.field2436.method16(var59.field2442, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var59.field2440 - class159.field2479, var59.field2437 - class282.field4540, var59.field2445 - class141.field2281, var59.field2431, var5, (class88) null);
                                                }
                                                for (int var60 = var59.field2443; var60 <= var59.field2447; var60++) {
                                                    for (int var61 = var59.field2432; var61 <= var59.field2441; var61++) {
                                                        class313 var62 = var7[var60][var61];
                                                        if (var62.field5031 != 0) {
                                                            class152.field2398.method13(32, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field5029) {
                                                            class152.field2398.method13(32, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field5028) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field5028 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field5015 != null) {
                                        int var63 = class88.field1412 + class244.field3591;
                                        int var64 = class88.field1395 + class244.field3598;
                                        class165 var65 = var2.field5015.field4771;
                                        for (class165 var66 = var65.field2533; var66 != var65; var66 = var66.field2533) {
                                            class198 var67 = (class198) var66;
                                            if (var67.field2917 != null && !var67.field2917.field3992.field1407) {
                                                if ((byte) ((int) (var67.field2917.field3992.field1405 & 0xFFL)) != var2.field5034) {
                                                    var2.field5015 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field2904 >> 12) - class159.field2479;
                                                int var69 = (var67.field2915 >> 12) - class282.field4540;
                                                int var70 = (var67.field2916 >> 12) - class141.field2281;
                                                int var71 = class156.field2438 * var70 + class106.field1812 * var68 >> 16;
                                                int var72 = class106.field1812 * var70 - class156.field2438 * var68 >> 16;
                                                int var74 = class86.field1366 * var69 - class284.field4568 * var72 >> 16;
                                                int var75 = class86.field1366 * var72 + class284.field4568 * var69 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class130.method981(var77, var78, (var67.field2917.field3981.field2069 << 16) / var79, var67.field2909, var67.field2909 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field5029);
                            } while (var2.field5031 != 0);
                            if (var3 > class142.field2288 || var3 <= class223.field3264) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field5029);
                        if (var3 < class142.field2288 || var3 >= class251.field3796 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field5029);
                    if (var4 > class138.field2252 || var4 <= class104.field1797) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field5029);
                if (var4 < class138.field2252 || var4 >= class218.field3186 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field5029);
            var2.field5029 = false;
            class106.field1816--;
            class226 var84 = var2.field5013;
            if (var84 != null && var84.field3325 != 0) {
                if (var84.field3326 != null) {
                    var84.field3326.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var84.field3317 - class159.field2479, var84.field3314 - class282.field4540 - var84.field3325, var84.field3320 - class141.field2281, var84.field3318, var5, (class88) null);
                }
                if (var84.field3315 != null) {
                    var84.field3315.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var84.field3317 - class159.field2479, var84.field3314 - class282.field4540 - var84.field3325, var84.field3320 - class141.field2281, var84.field3318, var5, (class88) null);
                }
                if (var84.field3313 != null) {
                    var84.field3313.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var84.field3317 - class159.field2479, var84.field3314 - class282.field4540 - var84.field3325, var84.field3320 - class141.field2281, var84.field3318, var5, (class88) null);
                }
            }
            if (var2.field5033 != 0) {
                class272 var85 = var2.field5023;
                if (var85 != null && !class225.method1560(var6, var3, var4, var85.field4402.method17())) {
                    if ((var85.field4405 & var2.field5033) != 0) {
                        var85.field4402.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var85.field4397 + var85.field4398 - class159.field2479, var85.field4403 - class282.field4540, var85.field4396 + var85.field4406 - class141.field2281, var85.field4393, var5, (class88) null);
                    } else if (var85.field4405 == 256) {
                        int var86 = var85.field4397 - class159.field2479;
                        int var87 = var85.field4403 - class282.field4540;
                        int var88 = var85.field4396 - class141.field2281;
                        int var89 = var85.field4407;
                        int var90;
                        if (var89 == 1 || var89 == 2) {
                            var90 = -var86;
                        } else {
                            var90 = var86;
                        }
                        int var91;
                        if (var89 == 2 || var89 == 3) {
                            var91 = -var88;
                        } else {
                            var91 = var88;
                        }
                        if (var91 >= var90) {
                            var85.field4402.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var85.field4398 + var86, var87, var85.field4406 + var88, var85.field4393, var5, (class88) null);
                        } else if (var85.field4401 != null) {
                            var85.field4401.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var86, var87, var88, var85.field4393, var5, (class88) null);
                        }
                    }
                }
                class231 var92 = var2.field5012;
                if (var92 != null) {
                    if ((var92.field3389 & var2.field5033) != 0 && !class78.method578(var6, var3, var4, var92.field3389)) {
                        var92.field3388.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var92.field3399 - class159.field2479, var92.field3391 - class282.field4540, var92.field3403 - class141.field2281, var92.field3393, var5, (class88) null);
                    }
                    if ((var92.field3398 & var2.field5033) != 0 && !class78.method578(var6, var3, var4, var92.field3398)) {
                        var92.field3401.method16(0, class284.field4568, class86.field1366, class156.field2438, class106.field1812, var92.field3399 - class159.field2479, var92.field3391 - class282.field4540, var92.field3403 - class141.field2281, var92.field3393, var5, (class88) null);
                    }
                }
            }
            if (var5 < class188.field2799 - 1) {
                class313 var93 = class223.field3286[var5 + 1][var3][var4];
                if (var93 != null && var93.field5029) {
                    class152.field2398.method13(32, var93);
                }
            }
            if (var3 < class142.field2288) {
                class313 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field5029) {
                    class152.field2398.method13(32, var94);
                }
            }
            if (var4 < class138.field2252) {
                class313 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field5029) {
                    class152.field2398.method13(32, var95);
                }
            }
            if (var3 > class142.field2288) {
                class313 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field5029) {
                    class152.field2398.method13(32, var96);
                }
            }
            if (var4 > class138.field2252) {
                class313 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field5029) {
                    class152.field2398.method13(32, var97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZB)V")
    public static final void method1569(boolean arg0, byte arg1) {
        if (arg1 <= 8) {
            method1565(false);
        }
        field3321++;
        class308.field4959 = arg0;
        if (!class308.field4959) {
            boolean var2 = class207.method1461(class92.field1488.method344((byte) -113), (byte) -122);
            int var3 = class92.field1488.method331(-41);
            int var4 = (class162.field2510 - class92.field1488.field735) / 16;
            class1.field8 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class1.field8[var5][var15] = class92.field1488.method349(-46);
                }
            }
            int var6 = class92.field1488.method377((byte) 82);
            boolean var7 = false;
            int var8 = class92.field1488.method354(-90);
            int var9 = class92.field1488.method331(-115);
            int var10 = class92.field1488.method331(-84);
            class219.field3199 = null;
            class299.field4825 = new int[var4];
            class207.field3055 = new int[var4];
            class128.field2145 = null;
            class53.field768 = new int[var4];
            class254.field3838 = new int[var4];
            class170.field2576 = new byte[var4][];
            class7.field75 = new byte[var4][];
            if ((var10 / 8 == 48 || (var10 / 8) == 49) && var3 / 8 == 48) {
                var7 = true;
            }
            class279.field4501 = new int[var4];
            int var11 = 0;
            if (var10 / 8 == 48 && var3 / 8 == 148) {
                var7 = true;
            }
            for (int var12 = (var10 - 6) / 8; var12 <= (var10 + 6) / 8; var12++) {
                for (int var13 = (var3 - 6) / 8; var13 <= ((var3 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var7 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class53.field768[var11] = var14;
                        class279.field4501[var11] = -1;
                        class207.field3055[var11] = -1;
                        class254.field3838[var11] = -1;
                        class299.field4825[var11] = -1;
                    } else {
                        class53.field768[var11] = var14;
                        class279.field4501[var11] = class296.field4754.method1884("m" + var12 + "_" + var13, (byte) -85);
                        class207.field3055[var11] = class296.field4754.method1884("l" + var12 + "_" + var13, (byte) -17);
                        class254.field3838[var11] = class296.field4754.method1884("um" + var12 + "_" + var13, (byte) 119);
                        class299.field4825[var11] = class296.field4754.method1884("ul" + var12 + "_" + var13, (byte) 124);
                    }
                    var11++;
                }
            }
            class21.method149(-24394, var6, false, var10, var9, var8, var2, var3);
            return;
        }
        int var16 = class92.field1488.method327(65280);
        int var17 = class92.field1488.method354(-89);
        int var18 = class92.field1488.method374((byte) 80);
        class92.field1488.method680(8);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = class92.field1488.method688((byte) -107, 1);
                    if (var39 == 1) {
                        class49.field683[var19][var37][var38] = class92.field1488.method688((byte) -125, 26);
                    } else {
                        class49.field683[var19][var37][var38] = -1;
                    }
                }
            }
        }
        class92.field1488.method686(0);
        int var20 = (class162.field2510 - class92.field1488.field735) / 16;
        class1.field8 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var36 = 0; var36 < 4; var36++) {
                class1.field8[var21][var36] = class92.field1488.method375(-61);
            }
        }
        int var22 = class92.field1488.method331(-29);
        boolean var23 = class207.method1461(class92.field1488.method344((byte) -116), (byte) -101);
        int var24 = class92.field1488.method359(255);
        class128.field2145 = null;
        class170.field2576 = new byte[var20][];
        class279.field4501 = new int[var20];
        class299.field4825 = new int[var20];
        class254.field3838 = new int[var20];
        class207.field3055 = new int[var20];
        class7.field75 = new byte[var20][];
        class53.field768 = new int[var20];
        class219.field3199 = null;
        int var25 = 0;
        for (int var26 = 0; var26 < 4; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                for (int var28 = 0; var28 < 13; var28++) {
                    int var29 = class49.field683[var26][var27][var28];
                    if (var29 != -1) {
                        int var30 = var29 >> 14 & 0x3FF;
                        int var31 = (var29 & 0x3FFA) >> 3;
                        int var32 = (var30 / 8 << 8) + var31 / 8;
                        for (int var33 = 0; var33 < var25; var33++) {
                            if (class53.field768[var33] == var32) {
                                var32 = -1;
                                break;
                            }
                        }
                        if (var32 != -1) {
                            class53.field768[var25] = var32;
                            int var34 = (var32 & 0xFF7B) >> 8;
                            int var35 = var32 & 0xFF;
                            class279.field4501[var25] = class296.field4754.method1884("m" + var34 + "_" + var35, (byte) -15);
                            class207.field3055[var25] = class296.field4754.method1884("l" + var34 + "_" + var35, (byte) -36);
                            class254.field3838[var25] = class296.field4754.method1884("um" + var34 + "_" + var35, (byte) -101);
                            class299.field4825[var25] = class296.field4754.method1884("ul" + var34 + "_" + var35, (byte) 127);
                            var25++;
                        }
                    }
                }
            }
        }
        class21.method149(-24394, var24, false, var18, var16, var22, var23, var17);
    }
}
