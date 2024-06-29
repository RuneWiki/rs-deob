import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class515 extends class58 {

    @OriginalMember(owner = "client!jv", name = "bb", descriptor = "I")
    public static int field7636 = 0;

    @OriginalMember(owner = "client!jv", name = "fb", descriptor = "Z")
    public static boolean field7640;

    @OriginalMember(owner = "client!jv", name = "eb", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!jv", name = "db", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!jv", name = "V", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!jv", name = "W", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!jv", name = "Y", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!jv", name = "ab", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!jv", name = "cb", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!jv", name = "gb", descriptor = "Loa;")
    public static class33 field7641;

    @OriginalMember(owner = "client!jv", name = "Z", descriptor = "Lns;")
    public static class438 field7634;

    @OriginalMember(owner = "client!jv", name = "X", descriptor = "[Lo;")
    public static class138[] field7632;

    static {
        new class432("", 76);
        field7640 = false;
        field7639 = 765;
        field7638 = 0;
    }

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "(B)V", line = 3)
    public static final void method3061(byte arg0) {
        class179.method1287(false, class33.field502);
        if (arg0 < 112) {
            method3062(125, (class32) null, 76, -106);
        }
        ++class303.field4455;
        ++field7635;
        class75.field1006.method600(class427.field6353, -12891);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILic;II)V", line = 16)
    public static final void method3062(int arg0, class32 arg1, int arg2, int arg3) {
        ++field7637;
        if (arg1 != null && class96.field1395.field4498 != arg1) {
            int var4 = arg1.field488;
            if (arg2 != -14223) {
                method3062(82, (class32) null, 110, 89);
            }
            int var5 = arg1.field484;
            int var6 = arg1.field485;
            int var7 = (int) arg1.field493;
            long var8 = arg1.field493;
            if (~var6 <= -2001) {
                var6 -= 2000;
            }
            if (~var6 == -14) {
                class322 var10 = class439.field6539[var7];
                if (var10 != null) {
                    ++class527.field7781;
                    class528.field7799 = 0;
                    class442.field6565 = 2;
                    field7636 = arg3;
                    class154.field2260 = arg0;
                    class179.method1287(false, class181.field2576);
                    class75.field1006.method600(var7, -12891);
                    class75.field1006.method629((byte) 79, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                    class126.method805(-2, 0, 0, true, var10.method2091(-15245), var10.method2091(-15245), var10.field5344[0], true, var10.field5339[0]);
                }
            }
            if (~var6 == -52) {
                field7636 = arg3;
                ++class513.field7611;
                class154.field2260 = arg0;
                class442.field6565 = 2;
                class528.field7799 = 0;
                class179.method1287(false, class141.field2046);
                class75.field1006.method600(class437.field6477 + var5, -12891);
                class75.field1006.method637((byte) 7, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class75.field1006.method602(class382.field5821.method705((byte) 43, 82) ? 1 : 0, 128);
                class75.field1006.method637((byte) -92, class82.field1105 + var4);
                class471.method2822(var4, var5, var8, 4088323);
            }
            if (~var6 == -21) {
                if (~class528.field7809 < -1 && class382.field5821.method705((byte) 43, 82) && class382.field5821.method705((byte) 43, 81)) {
                    class523.method3105(class339.field5365.field2210, class437.field6477 + var5, class82.field1105 + var4, (byte) 107);
                } else {
                    class442.field6565 = 1;
                    field7636 = arg3;
                    ++class235.field3334;
                    class154.field2260 = arg0;
                    class528.field7799 = 0;
                    class179.method1287(false, class11.field175);
                    class75.field1006.method582(-65, class437.field6477 + var5);
                    class75.field1006.method582(-55, class82.field1105 - -var4);
                }
            }
            if (~var6 == -46 && class112.field1571 == null) {
                class62.method427(false, var4, var5);
                class112.field1571 = class458.method2757(var5, false, var4);
                class338.method2189((byte) 83, class112.field1571);
            }
            if (var6 == 44) {
                class322 var11 = class439.field6539[var7];
                if (var11 != null) {
                    class528.field7799 = 0;
                    ++class10.field144;
                    class154.field2260 = arg0;
                    field7636 = arg3;
                    class442.field6565 = 2;
                    class179.method1287(false, class30.field463);
                    class75.field1006.method644(class186.field2616, -4019);
                    class75.field1006.method600(class126.field1798, -12891);
                    class75.field1006.method582(arg2 + 14097, var7);
                    class75.field1006.method637((byte) -106, class91.field1336);
                    class75.field1006.method635((byte) -103, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                    class126.method805(-2, 0, 0, true, var11.method2091(-15245), var11.method2091(-15245), var11.field5344[0], true, var11.field5339[0]);
                }
            }
            if (var6 == 60) {
                class322 var12 = class439.field6539[var7];
                if (var12 != null) {
                    class528.field7799 = 0;
                    ++class80.field1076;
                    field7636 = arg3;
                    class442.field6565 = 2;
                    class154.field2260 = arg0;
                    class179.method1287(false, class420.field6282);
                    class75.field1006.method589(var7, false);
                    class75.field1006.method602(!class382.field5821.method705((byte) 43, 82) ? 0 : 1, 128);
                    class126.method805(-2, 0, 0, true, var12.method2091(-15245), var12.method2091(-15245), var12.field5344[0], true, var12.field5339[0]);
                }
            }
            if (~var6 == -18) {
                class322 var13 = class439.field6539[var7];
                if (var13 != null) {
                    class442.field6565 = 2;
                    class154.field2260 = arg0;
                    field7636 = arg3;
                    class528.field7799 = 0;
                    ++class107.field1513;
                    class179.method1287(false, class498.field7278);
                    class75.field1006.method602(class382.field5821.method705((byte) 43, 82) ? 1 : 0, 128);
                    class75.field1006.method637((byte) -109, var7);
                    class126.method805(-2, 0, 0, true, var13.method2091(-15245), var13.method2091(-15245), var13.field5344[0], true, var13.field5339[0]);
                }
            }
            if (var6 == 5) {
                class442.field6565 = 2;
                class154.field2260 = arg0;
                field7636 = arg3;
                class528.field7799 = 0;
                ++class94.field1356;
                class179.method1287(false, class458.field6725);
                class75.field1006.method582(-87, var7);
                class75.field1006.method600(class82.field1105 + var4, -12891);
                class75.field1006.method635((byte) 108, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                class75.field1006.method637((byte) -86, class437.field6477 + var5);
                class427.method2563((byte) -100, var5, var4);
            }
            if (~var6 == -10) {
                class499 var14 = class458.method2757(var5, false, var4);
                if (var14 != null) {
                    class393.method2420(var14, arg2 ^ -22604);
                }
            }
            if (~var6 == -19) {
                ++class102.field1463;
                field7636 = arg3;
                class442.field6565 = 2;
                class154.field2260 = arg0;
                class528.field7799 = 0;
                class179.method1287(false, class275.field3825);
                class75.field1006.method637((byte) -91, class91.field1336);
                class75.field1006.method637((byte) -85, class82.field1105 + var4);
                class75.field1006.method589(class437.field6477 + var5, false);
                class75.field1006.method582(arg2 ^ 14335, var7);
                class75.field1006.method635((byte) -116, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                class75.field1006.method632(class186.field2616, 213253176);
                class75.field1006.method589(class126.field1798, false);
                class427.method2563((byte) -100, var5, var4);
            }
            if (var6 == 58) {
                ++class465.field6789;
                class154.field2260 = arg0;
                class442.field6565 = 1;
                field7636 = arg3;
                class528.field7799 = 0;
                class179.method1287(false, class98.field1412);
                class75.field1006.method589(class126.field1798, false);
                class75.field1006.method637((byte) -104, class82.field1105 + var4);
                class75.field1006.method637((byte) 64, class437.field6477 - -var5);
                class75.field1006.method637((byte) -115, class91.field1336);
                class75.field1006.method611(arg2 ^ 1571174185, class186.field2616);
                class126.method805(-4, 0, 0, true, 1, 1, var5, true, var4);
            }
            if (var6 == 50) {
                class194 var15 = class151.field2174[var7];
                if (var15 != null) {
                    class442.field6565 = 2;
                    class154.field2260 = arg0;
                    field7636 = arg3;
                    class528.field7799 = 0;
                    ++class408.field6157;
                    class179.method1287(false, class253.field3506);
                    class75.field1006.method635((byte) -119, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                    class75.field1006.method600(var7, -12891);
                    class126.method805(-2, 0, 0, true, var15.method2091(-15245), var15.method2091(-15245), var15.field5344[0], true, var15.field5339[0]);
                }
            }
            if (~var6 == -5) {
                class154.field2260 = arg0;
                class442.field6565 = 2;
                field7636 = arg3;
                ++class255.field3529;
                class528.field7799 = 0;
                class179.method1287(false, class153.field2211);
                class75.field1006.method589(class437.field6477 + var5, false);
                class75.field1006.method637((byte) -97, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class75.field1006.method637((byte) -117, class91.field1336);
                class75.field1006.method635((byte) -78, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                class75.field1006.method632(class186.field2616, arg2 ^ -213240759);
                class75.field1006.method582(arg2 ^ 14316, var4 - -class82.field1105);
                class75.field1006.method589(class126.field1798, false);
                class471.method2822(var4, var5, var8, 4088323);
            }
            if (~var6 == -11) {
                class322 var16 = class439.field6539[var7];
                if (var16 != null) {
                    field7636 = arg3;
                    class442.field6565 = 2;
                    ++class496.field7247;
                    class528.field7799 = 0;
                    class154.field2260 = arg0;
                    class179.method1287(false, class12.field200);
                    class75.field1006.method629((byte) 72, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                    class75.field1006.method582(-97, var7);
                    class126.method805(-2, 0, 0, true, var16.method2091(-15245), var16.method2091(arg2 ^ 3074), var16.field5344[0], true, var16.field5339[0]);
                }
            }
            if (var6 == 1006) {
                field7636 = arg3;
                class442.field6565 = 2;
                class528.field7799 = 0;
                class154.field2260 = arg0;
                ++class261.field3639;
                class179.method1287(false, class337.field5326);
                class75.field1006.method600(var7, -12891);
            }
            if (~var6 == -24) {
                class194 var17 = class151.field2174[var7];
                if (var17 != null) {
                    class442.field6565 = 2;
                    class528.field7799 = 0;
                    ++class254.field3516;
                    field7636 = arg3;
                    class154.field2260 = arg0;
                    class179.method1287(false, class190.field2664);
                    class75.field1006.method635((byte) 85, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                    class75.field1006.method600(var7, -12891);
                    class126.method805(-2, 0, 0, true, var17.method2091(arg2 + -1022), var17.method2091(-15245), var17.field5344[0], true, var17.field5339[0]);
                }
            }
            if (var6 == 30) {
                class194 var18 = class151.field2174[var7];
                if (var18 != null) {
                    ++class7.field107;
                    class154.field2260 = arg0;
                    class528.field7799 = 0;
                    class442.field6565 = 2;
                    field7636 = arg3;
                    class179.method1287(false, class435.field6454);
                    class75.field1006.method637((byte) 62, class126.field1798);
                    class75.field1006.method637((byte) -88, class91.field1336);
                    class75.field1006.method582(-110, var7);
                    class75.field1006.method625(!class382.field5821.method705((byte) 43, 82) ? 0 : 1, false);
                    class75.field1006.method611(-1571160232, class186.field2616);
                    class126.method805(-2, 0, 0, true, var18.method2091(-15245), var18.method2091(-15245), var18.field5344[0], true, var18.field5339[0]);
                }
            }
            if (var6 == 21) {
                class322 var19 = class439.field6539[var7];
                if (var19 != null) {
                    class154.field2260 = arg0;
                    class442.field6565 = 2;
                    field7636 = arg3;
                    class528.field7799 = 0;
                    ++class356.field5515;
                    class179.method1287(false, class56.field757);
                    class75.field1006.method637((byte) -110, var7);
                    class75.field1006.method602(!class382.field5821.method705((byte) 43, 82) ? 0 : 1, 128);
                    class126.method805(-2, 0, 0, true, var19.method2091(-15245), var19.method2091(arg2 + -1022), var19.field5344[0], true, var19.field5339[0]);
                }
            }
            if (~var6 == -50) {
                class442.field6565 = 2;
                ++class306.field4494;
                field7636 = arg3;
                class528.field7799 = 0;
                class154.field2260 = arg0;
                class179.method1287(false, class498.field7280);
                class75.field1006.method637((byte) 48, class82.field1105 + var4);
                class75.field1006.method637((byte) 106, var7);
                class75.field1006.method629((byte) 98, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                class75.field1006.method582(-73, class437.field6477 + var5);
                class427.method2563((byte) -100, var5, var4);
            }
            if (~var6 == -1013 || var6 == 1011 || var6 == 1001 || var6 == 1010 || var6 == 1002) {
                class450.method2718(var6, var7, var4, -1011);
            }
            if (var6 == 22) {
                class322 var20 = class439.field6539[var7];
                if (var20 != null) {
                    class528.field7799 = 0;
                    class442.field6565 = 2;
                    field7636 = arg3;
                    ++class144.field2078;
                    class154.field2260 = arg0;
                    class179.method1287(false, class321.field4919);
                    class75.field1006.method637((byte) -107, var7);
                    class75.field1006.method629((byte) 102, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                    class126.method805(-2, 0, 0, true, var20.method2091(-15245), var20.method2091(-15245), var20.field5344[0], true, var20.field5339[0]);
                }
            }
            if (~var6 == -7) {
                class154.field2260 = arg0;
                class528.field7799 = 0;
                class442.field6565 = 2;
                ++class258.field3601;
                field7636 = arg3;
                class179.method1287(false, class317.field4870);
                class75.field1006.method637((byte) -100, var5 - -class437.field6477);
                class75.field1006.method602(class382.field5821.method705((byte) 43, 82) ? 1 : 0, 128);
                class75.field1006.method582(-96, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                class75.field1006.method589(class82.field1105 + var4, false);
                class471.method2822(var4, var5, var8, 4088323);
            }
            if (~var6 == -60) {
                class154.field2260 = arg0;
                field7636 = arg3;
                class528.field7799 = 0;
                ++class499.field7401;
                class442.field6565 = 2;
                class179.method1287(false, class428.field6358);
                class75.field1006.method635((byte) -88, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                class75.field1006.method637((byte) -107, class437.field6477 + var5);
                class75.field1006.method582(-88, var7);
                class75.field1006.method589(class82.field1105 + var4, false);
                class427.method2563((byte) -100, var5, var4);
            }
            if (~var6 == -17) {
                class322 var21 = class439.field6539[var7];
                if (var21 != null) {
                    class528.field7799 = 0;
                    class442.field6565 = 2;
                    ++class225.field3224;
                    field7636 = arg3;
                    class154.field2260 = arg0;
                    class179.method1287(false, class501.field7484);
                    class75.field1006.method635((byte) -123, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                    class75.field1006.method589(var7, false);
                    class126.method805(-2, 0, 0, true, var21.method2091(-15245), var21.method2091(-15245), var21.field5344[0], true, var21.field5339[0]);
                }
            }
            if (~var6 == -12) {
                field7636 = arg3;
                class528.field7799 = 0;
                ++class323.field4983;
                class442.field6565 = 2;
                class154.field2260 = arg0;
                class179.method1287(false, class263.field3658);
                class75.field1006.method589(var5 - -class437.field6477, false);
                class75.field1006.method625(!class382.field5821.method705((byte) 43, 82) ? 0 : 1, false);
                class75.field1006.method600(Integer.MAX_VALUE & (int) (var8 >>> 32), arg2 + 1332);
                class75.field1006.method600(class82.field1105 + var4, -12891);
                class471.method2822(var4, var5, var8, arg2 + 4102546);
            }
            if (var6 == 48) {
                if (~class528.field7809 < -1 && class382.field5821.method705((byte) 43, 82) && class382.field5821.method705((byte) 43, 81)) {
                    class523.method3105(class339.field5365.field2210, class437.field6477 + var5, class82.field1105 + var4, (byte) 107);
                } else {
                    class1.method9(var7, var4, var5, -21299);
                    if (var7 == 1) {
                        class75.field1006.method625(-1, false);
                        class75.field1006.method625(-1, false);
                        class75.field1006.method600((int) class482.field7022, -12891);
                        class75.field1006.method625(57, false);
                        class75.field1006.method625(class384.field5871, false);
                        class75.field1006.method625(class235.field3345, false);
                        class75.field1006.method625(89, false);
                        class75.field1006.method600(class339.field5365.field2217, -12891);
                        class75.field1006.method600(class339.field5365.field2215, arg2 ^ 1492);
                        class75.field1006.method625(63, false);
                    } else {
                        class154.field2260 = arg0;
                        class528.field7799 = 0;
                        field7636 = arg3;
                        class442.field6565 = 1;
                    }
                    class126.method805(-4, 0, 0, true, 1, 1, var5, true, var4);
                }
            }
            if (~var6 == -20) {
                class442.field6565 = 2;
                class154.field2260 = arg0;
                class528.field7799 = 0;
                field7636 = arg3;
                ++class37.field590;
                class179.method1287(false, class201.field2835);
                class75.field1006.method629((byte) 64, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                class75.field1006.method589(class437.field6477 + var5, false);
                class75.field1006.method637((byte) -97, var7);
                class75.field1006.method637((byte) -117, class82.field1105 + var4);
                class427.method2563((byte) -100, var5, var4);
            }
            if (~var6 == -9) {
                class194 var22 = class151.field2174[var7];
                if (var22 != null) {
                    ++class362.field5610;
                    field7636 = arg3;
                    class442.field6565 = 2;
                    class528.field7799 = 0;
                    class154.field2260 = arg0;
                    class179.method1287(false, class391.field5940);
                    class75.field1006.method629((byte) 93, class382.field5821.method705((byte) 43, 82) ? 1 : 0);
                    class75.field1006.method637((byte) 119, var7);
                    class126.method805(-2, 0, 0, true, var22.method2091(-15245), var22.method2091(-15245), var22.field5344[0], true, var22.field5339[0]);
                }
            }
            if (~var6 == -26) {
                class528.field7799 = 0;
                ++class526.field7777;
                class442.field6565 = 2;
                field7636 = arg3;
                class154.field2260 = arg0;
                class179.method1287(false, class429.field6382);
                class75.field1006.method635((byte) -94, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                class75.field1006.method589(Integer.MAX_VALUE & (int) (var8 >>> 32), false);
                class75.field1006.method582(-51, class437.field6477 + var5);
                class75.field1006.method600(class82.field1105 + var4, -12891);
                class471.method2822(var4, var5, var8, arg2 + 4102546);
            }
            if (var6 == 12) {
                class194 var23 = class151.field2174[var7];
                if (var23 != null) {
                    class528.field7799 = 0;
                    field7636 = arg3;
                    class154.field2260 = arg0;
                    class442.field6565 = 2;
                    ++class277.field3842;
                    class179.method1287(false, class41.field639);
                    class75.field1006.method637((byte) 26, var7);
                    class75.field1006.method625(!class382.field5821.method705((byte) 43, 82) ? 0 : 1, false);
                    class126.method805(-2, 0, 0, true, var23.method2091(-15245), var23.method2091(-15245), var23.field5344[0], true, var23.field5339[0]);
                }
            }
            if (~var6 == -1010) {
                class528.field7799 = 0;
                class154.field2260 = arg0;
                field7636 = arg3;
                class442.field6565 = 2;
                class194 var24 = class151.field2174[var7];
                if (var24 != null) {
                    class329 var25 = var24.field2768;
                    if (var25.field5068 != null) {
                        var25 = var25.method2125(class36.field583, false);
                    }
                    if (var25 != null) {
                        class179.method1287(false, class65.field910);
                        ++class81.field1085;
                        class75.field1006.method600(var25.field5097, arg2 + 1332);
                    }
                }
            }
            if (var6 == 47) {
                class194 var26 = class151.field2174[var7];
                if (var26 != null) {
                    ++class394.field5987;
                    class442.field6565 = 2;
                    class528.field7799 = 0;
                    class154.field2260 = arg0;
                    field7636 = arg3;
                    class179.method1287(false, class423.field6308);
                    class75.field1006.method629((byte) 87, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                    class75.field1006.method589(var7, false);
                    class126.method805(-2, 0, 0, true, var26.method2091(-15245), var26.method2091(-15245), var26.field5344[0], true, var26.field5339[0]);
                }
            }
            if (~var6 == -16) {
                field7636 = arg3;
                ++class10.field144;
                class154.field2260 = arg0;
                class528.field7799 = 0;
                class442.field6565 = 2;
                class179.method1287(false, class30.field463);
                class75.field1006.method644(class186.field2616, arg2 ^ 14396);
                class75.field1006.method600(class126.field1798, arg2 ^ 1492);
                class75.field1006.method582(arg2 + 14152, class339.field5365.field5254);
                class75.field1006.method637((byte) 80, class91.field1336);
                class75.field1006.method635((byte) -118, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
            }
            if (var6 == 57) {
                class528.field7799 = 0;
                ++class467.field6796;
                class442.field6565 = 2;
                class154.field2260 = arg0;
                field7636 = arg3;
                class179.method1287(false, class479.field7005);
                class75.field1006.method600(class82.field1105 + var4, arg2 ^ 1492);
                class75.field1006.method602(class382.field5821.method705((byte) 43, 82) ? 1 : 0, 128);
                class75.field1006.method589(class437.field6477 + var5, false);
                class75.field1006.method589(var7, false);
                class427.method2563((byte) -100, var5, var4);
            }
            if (var6 == 2 || ~var6 == -1009) {
                class455.method2742(var4, var7, var5, (byte) 35, arg1.field494);
            }
            if (var6 == 1004) {
                class154.field2260 = arg0;
                ++class444.field6603;
                class442.field6565 = 2;
                field7636 = arg3;
                class528.field7799 = 0;
                class179.method1287(false, class206.field2917);
                class75.field1006.method600(var7, arg2 + 1332);
            }
            if (var6 == 1007) {
                field7636 = arg3;
                class154.field2260 = arg0;
                class442.field6565 = 2;
                class528.field7799 = 0;
                ++class283.field4228;
                class179.method1287(false, class512.field7604);
                class75.field1006.method589((int) (var8 >>> 32) & Integer.MAX_VALUE, false);
                class75.field1006.method625(class382.field5821.method705((byte) 43, 82) ? 1 : 0, false);
                class75.field1006.method589(var4 - -class82.field1105, false);
                class75.field1006.method637((byte) 100, class437.field6477 + var5);
                class471.method2822(var4, var5, var8, 4088323);
            }
            if (var6 == 46) {
                class499 var27 = class458.method2757(var5, false, var4);
                if (var27 != null) {
                    class457.method2749(-1);
                    class388 var28 = client.method450(var27);
                    class234.method1587(var28.method2394(true), var28.field5894, 125, var27);
                    class266.field3714 = class263.method1694(var27, -125);
                    if (class266.field3714 == null) {
                        class266.field3714 = "Null";
                    }
                    class509.field7572 = var27.field7307 + "<col=ffffff>";
                }
            } else {
                if (~var6 == -4) {
                    class322 var29 = class439.field6539[var7];
                    if (var29 != null) {
                        class154.field2260 = arg0;
                        ++class472.field6898;
                        class528.field7799 = 0;
                        field7636 = arg3;
                        class442.field6565 = 2;
                        class179.method1287(false, class434.field6451);
                        class75.field1006.method637((byte) -105, var7);
                        class75.field1006.method635((byte) 113, !class382.field5821.method705((byte) 43, 82) ? 0 : 1);
                        class126.method805(-2, 0, 0, true, var29.method2091(-15245), var29.method2091(-15245), var29.field5344[0], true, var29.field5339[0]);
                    }
                }
                if (class500.field7455) {
                    class457.method2749(-1);
                }
                if (class285.field4249 != null && ~class149.field2154 == -1) {
                    class338.method2189((byte) 115, class285.field4249);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)[[I", line = 738)
    public final int[][] method139(byte arg0, int arg1) {
        ++field7633;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 > -45) {
            return null;
        } else {
            if (super.field2147.field6664 && this.method394(29874)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field776 * super.field776;
                for (int var8 = 0; var8 < class316.field4838; ++var8) {
                    int var9 = super.field785[var7 - -(var8 % super.field782)];
                    var6[var8] = class494.method2942(255, var9) << 4;
                    var5[var8] = class494.method2942(var9, 65280) >> 4;
                    var4[var8] = class494.method2942(var9, 16711680) >> 12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "(B)V", line = 786)
    public static final void method3063(byte arg0) {
        ++field7631;
        if (arg0 != -63) {
            field7639 = 54;
        }
        class377 var1 = class99.method672(0, false, 15);
        var1.method2339(arg0 + -11625);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIII)V", line = 808)
    public static final void method3064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 > -48) {
            field7632 = null;
        }
        if (class96.field1399.field5216 != 0 && ~arg1 != -1 && class240.field3386 < 50 && ~arg4 != 0) {
            class19.field284[class240.field3386++] = new class491((byte) 1, arg4, arg1, arg5, arg0, arg3);
        }
        ++field7630;
    }

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "(I)V", line = 828)
    public static void method3065(int arg0) {
        field7634 = null;
        int var1 = 69 / ((1 - arg0) / 44);
        field7641 = null;
        field7632 = null;
    }
}
