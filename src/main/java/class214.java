import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class214 extends class82 {

    @OriginalMember(owner = "client!i", name = "ac", descriptor = "[I")
    public static int[] field3336 = new int[256];

    @OriginalMember(owner = "client!i", name = "ic", descriptor = "Lna;")
    public static class26 field3344 = class69.method505("m", (byte) -121);

    @OriginalMember(owner = "client!i", name = "Pb", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!i", name = "Sb", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!i", name = "Tb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!i", name = "Vb", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!i", name = "Wb", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!i", name = "Yb", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!i", name = "Zb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!i", name = "bc", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!i", name = "cc", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!i", name = "dc", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!i", name = "fc", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!i", name = "gc", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!i", name = "hc", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!i", name = "jc", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!i", name = "Xb", descriptor = "Lij;")
    private class83 field3333;

    @OriginalMember(owner = "client!i", name = "ec", descriptor = "[I")
    public static int[] field3340;

    @OriginalMember(owner = "client!i", name = "Ub", descriptor = "[Lna;")
    public static class26[] field3330;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lna;ILna;I)V", line = 6)
    public static final void method1420(class26 arg0, int arg1, class26 arg2, int arg3) {
        class250.method1718(arg3, arg1, arg2, (class26) null, (byte) 50, arg0);
        field3335++;
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(II)V", line = 18)
    public static final void method1421(int arg0, int arg1) {
        field3325++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class193.field3009[arg1];
        int var3 = class322.field5529[arg1];
        int var4 = class142.field2178[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        long var5 = class268.field4429[arg1];
        int var7 = (int) class268.field4429[arg1];
        if (var4 == 31) {
            class159 var8 = class268.field4427[var7];
            if (var8 != null) {
                class58.field951++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var8.field3904[0], 1, 0, 2, var8.field3890[0], class13.field221.field3904[0]);
                class260.field4255 = 2;
                class203.field3178 = 0;
                class267.field4414 = class205.field3210;
                class304.field5243 = class11.field152;
                class114.field1789.method1431(0, 71);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (var4 == 46) {
            class323.field5552++;
            class252.method1744((byte) 39, var5, var3, var2);
            class114.field1789.method1431(arg0 - 2597, 247);
            class114.field1789.method635(-1, class165.field2568 + var3);
            class114.field1789.method604(class12.field157 + var2, (byte) 3);
            class114.field1789.method643(-20037, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 40) {
            class114.field1789.method1431(arg0 - 2597, 27);
            class114.field1789.method643(-20037, class100.field1612);
            class157.field2452++;
            class114.field1789.method624(var3, (byte) -122);
            class114.field1789.method635(-1, var2);
            class114.field1789.method624(class27.field453, (byte) -122);
            class114.field1789.method604(class58.field938, (byte) 3);
            class114.field1789.method604(var7, (byte) 3);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 120, var3);
            class22.field325 = var2;
        }
        if (var4 == 19) {
            class324 var9 = class185.field2877[var7];
            if (var9 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var9.field3904[0], 1, 0, 2, var9.field3890[0], class13.field221.field3904[0]);
                class322.field5531++;
                class267.field4414 = class205.field3210;
                class260.field4255 = 2;
                class203.field3178 = 0;
                class304.field5243 = class11.field152;
                class114.field1789.method1431(arg0 ^ 0xA25, 30);
                class114.field1789.method643(-20037, var7);
            }
        }
        if (var4 == 17) {
            class324 var10 = class185.field2877[var7];
            if (var10 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var10.field3904[0], 1, 0, 2, var10.field3890[0], class13.field221.field3904[0]);
                class267.field4414 = class205.field3210;
                class203.field3178 = 0;
                class57.field925++;
                class260.field4255 = 2;
                class304.field5243 = class11.field152;
                class114.field1789.method1431(0, 78);
                class114.field1789.method635(-1, var7);
            }
        }
        if (var4 == 44) {
            class159 var11 = class268.field4427[var7];
            if (var11 != null) {
                class146.field2263++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var11.field3904[0], 1, 0, 2, var11.field3890[0], class13.field221.field3904[0]);
                class267.field4414 = class205.field3210;
                class260.field4255 = 2;
                class304.field5243 = class11.field152;
                class203.field3178 = 0;
                class114.field1789.method1431(0, 133);
                class114.field1789.method635(-1, var7);
            }
        }
        if (var4 == 58) {
            class114.field1789.method1431(0, 135);
            class114.field1789.method622(var7, -268435456);
            class135.field2056++;
            class114.field1789.method622(var2, -268435456);
            class114.field1789.method598(-68, var3);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 117, var3);
            class22.field325 = var2;
        }
        if (var4 == 42) {
            class252.method1744((byte) 39, var5, var3, var2);
            class114.field1789.method1431(arg0 ^ 0xA25, 254);
            class114.field1789.method635(-1, class12.field157 + var2);
            class155.field2418++;
            class114.field1789.method622((int) (var5 >>> 32) & Integer.MAX_VALUE, -268435456);
            class114.field1789.method643(arg0 ^ 0xFFFFBB9E, var3 + class165.field2568);
        }
        if (var4 == 28) {
            class181.method1253((byte) 122);
        }
        if (var4 == 45) {
            class324 var12 = class185.field2877[var7];
            if (var12 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var12.field3904[0], 1, 0, 2, var12.field3890[0], class13.field221.field3904[0]);
                class267.field4414 = class205.field3210;
                class260.field4255 = 2;
                class20.field287++;
                class203.field3178 = 0;
                class304.field5243 = class11.field152;
                class114.field1789.method1431(0, 239);
                class114.field1789.method624(class29.field501, (byte) -123);
                class114.field1789.method622(class297.field5087, -268435456);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (var4 == 18) {
            if (class170.field2670 == 1) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            } else {
                boolean var13 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, arg0 ^ 0xA27, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
                if (!var13) {
                    class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
                }
            }
            class33.field546++;
            class267.field4414 = class205.field3210;
            class203.field3178 = 0;
            class260.field4255 = 2;
            class304.field5243 = class11.field152;
            class114.field1789.method1431(0, 66);
            class114.field1789.method635(-1, class12.field157 + var2);
            class114.field1789.method643(arg0 ^ 0xFFFFBB9E, var7);
            class114.field1789.method604(var3 + class165.field2568, (byte) 3);
        }
        if (var4 == 1001) {
            class21.field298++;
            class252.method1744((byte) 39, var5, var3, var2);
            class114.field1789.method1431(0, 170);
            class114.field1789.method604(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 3);
            class114.field1789.method604(var2 + class12.field157, (byte) 3);
            class114.field1789.method604(var3 + class165.field2568, (byte) 3);
        }
        if (var4 == 1002) {
            class260.field4255 = 2;
            class267.field4414 = class205.field3210;
            class304.field5243 = class11.field152;
            class259.field4223++;
            class203.field3178 = 0;
            class114.field1789.method1431(0, 92);
            class114.field1789.method604(var7, (byte) 3);
        }
        if (var4 == 1006) {
            class297 var15 = class178.method1226((byte) 119, var3);
            if (var15 == null || var15.field5131[var2] < 100000) {
                class114.field1789.method1431(0, 92);
                class259.field4223++;
                class114.field1789.method604(var7, (byte) 3);
            } else {
                method1420(class2.field18, 0, class236.method1587(new class26[] { class149.method1019((byte) 9, var15.field5131[var2]), class280.field4668, class45.method341(var7, (byte) 125).field3422 }, (byte) -84), -1);
            }
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 123, var3);
            class22.field325 = var2;
        }
        if (var4 == 60) {
            if (var7 == 0) {
                class57.method417(class279.field4651, var2, var3);
            } else if (var7 == 1) {
                if (class201.field3119 > 0 && class78.field1183[82] && class78.field1183[81]) {
                    class41.method331(class12.field157 + var2, class165.field2568 + var3, class279.field4651, (byte) -4);
                } else if (class33.method269(class13.field221.field3890[0], 0, 0, true, 0, 2, var2, 0, 0, 1, var3, class13.field221.field3904[0])) {
                    class114.field1789.method591((byte) -32, class273.field4572);
                    class114.field1789.method591((byte) -108, class258.field4211);
                    class114.field1789.method643(arg0 - 22634, class300.field5156);
                    class114.field1789.method591((byte) -12, 57);
                    class114.field1789.method591((byte) -118, class158.field2465);
                    class114.field1789.method591((byte) -116, class51.field797);
                    class114.field1789.method591((byte) -57, 89);
                    class114.field1789.method643(-20037, class13.field221.field3962);
                    class114.field1789.method643(-20037, class13.field221.field3972);
                    class114.field1789.method591((byte) -103, class271.field4529);
                    class114.field1789.method591((byte) -59, 63);
                }
            }
        }
        if (var4 == 1007) {
            class203.field3178 = 0;
            class260.field4255 = 2;
            class304.field5243 = class11.field152;
            class267.field4414 = class205.field3210;
            class324 var16 = class185.field2877[var7];
            if (var16 != null) {
                class187 var17 = var16.field5565;
                if (var17.field2953 != null) {
                    var17 = var17.method1273((byte) 80);
                }
                if (var17 != null) {
                    class186.field2890++;
                    class114.field1789.method1431(0, 72);
                    class114.field1789.method643(-20037, var17.field2943);
                }
            }
        }
        if (var4 == 47) {
            field3327++;
            class114.field1789.method1431(0, 156);
            class114.field1789.method604(var2, (byte) 3);
            class114.field1789.method622(var7, -268435456);
            class114.field1789.method624(var3, (byte) -120);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 109, var3);
            class22.field325 = var2;
        }
        if (var4 == 3) {
            class114.field1789.method1431(0, 253);
            class167.field2583++;
            class114.field1789.method624(class29.field501, (byte) -126);
            class114.field1789.method604(var2, (byte) 3);
            class114.field1789.method624(var3, (byte) -124);
            class114.field1789.method622(var7, -268435456);
            class114.field1789.method635(arg0 ^ 0xFFFFF5DA, class297.field5087);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 120, var3);
            class22.field325 = var2;
        }
        if (var4 == 10) {
            class159 var18 = class268.field4427[var7];
            if (var18 != null) {
                class285.field4790++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var18.field3904[0], 1, 0, 2, var18.field3890[0], class13.field221.field3904[0]);
                class260.field4255 = 2;
                class304.field5243 = class11.field152;
                class267.field4414 = class205.field3210;
                class203.field3178 = 0;
                class114.field1789.method1431(0, 4);
                class114.field1789.method635(-1, var7);
            }
        }
        if (var4 == 41 && class142.field2165 == null) {
            class9.method60(var2, false, var3);
            class142.field2165 = class148.method1011((byte) -19, var3, var2);
            class318.method2209(arg0 - 2470, class142.field2165);
        }
        if (var4 == 49) {
            class57.field928++;
            class252.method1744((byte) 39, var5, var3, var2);
            class114.field1789.method1431(0, 84);
            class114.field1789.method604(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 3);
            class114.field1789.method604(class165.field2568 + var3, (byte) 3);
            class114.field1789.method635(arg0 - 2598, var2 - -class12.field157);
        }
        if (var4 == 23) {
            class254.field4157++;
            class114.field1789.method1431(0, 206);
            class114.field1789.method622(var7, -268435456);
            class114.field1789.method635(arg0 ^ 0xFFFFF5DA, var2);
            class114.field1789.method624(var3, (byte) -127);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 115, var3);
            class22.field325 = var2;
        }
        if (var4 == 14 && class252.method1744((byte) 39, var5, var3, var2)) {
            class103.field1648++;
            class114.field1789.method1431(0, 134);
            class114.field1789.method622(class12.field157 + var2, arg0 ^ 0xF0000A25);
            class114.field1789.method643(-20037, class58.field938);
            class114.field1789.method635(-1, var3 + class165.field2568);
            class114.field1789.method643(-20037, class100.field1612);
            class114.field1789.method598(arg0 ^ 0xFFFFF5E4, class27.field453);
            class114.field1789.method622((int) (var5 >>> 32) & Integer.MAX_VALUE, -268435456);
        }
        if (var4 == 37) {
            class159 var19 = class268.field4427[var7];
            if (var19 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var19.field3904[0], 1, 0, 2, var19.field3890[0], class13.field221.field3904[0]);
                class203.field3178 = 0;
                class318.field5442++;
                class260.field4255 = 2;
                class304.field5243 = class11.field152;
                class267.field4414 = class205.field3210;
                class114.field1789.method1431(arg0 - 2597, 114);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (var4 == 9 || var4 == 1003) {
            class262.method1846(class252.field4138[arg1], var2, var7, (byte) -19, var3);
        }
        if (var4 == 5) {
            class114.field1789.method1431(0, 55);
            class114.field1789.method635(-1, var7);
            class114.field1789.method622(var2, -268435456);
            class98.field1604++;
            class114.field1789.method614(var3, 1437452424);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 116, var3);
            class22.field325 = var2;
        }
        if (var4 == 21) {
            if (class170.field2670 == 1) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, arg0 - 2595, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            } else {
                boolean var20 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, arg0 - 2595, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
                if (!var20) {
                    class33.method269(class13.field221.field3890[0], 0, 1, false, 0, arg0 - 2595, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
                }
            }
            class260.field4255 = 2;
            class267.field4414 = class205.field3210;
            class203.field3178 = 0;
            class304.field5243 = class11.field152;
            class114.field1789.method1431(0, 228);
            class216.field3388++;
            class114.field1789.method643(-20037, var7);
            class114.field1789.method635(arg0 ^ 0xFFFFF5DA, class12.field157 + var2);
            class114.field1789.method604(class165.field2568 + var3, (byte) 3);
        }
        if (var4 == 4) {
            class324 var22 = class185.field2877[var7];
            if (var22 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var22.field3904[0], 1, 0, 2, var22.field3890[0], class13.field221.field3904[0]);
                class260.field4255 = 2;
                class203.field3178 = 0;
                class304.field5243 = class11.field152;
                class267.field4414 = class205.field3210;
                class135.field2061++;
                class114.field1789.method1431(0, 148);
                class114.field1789.method622(var7, arg0 - 268438053);
            }
        }
        if (var4 == 32) {
            class297 var23 = class148.method1011((byte) -19, var3, var2);
            if (var23 != null) {
                class39.method321((byte) -126);
                class327 var24 = client.method1730(var23);
                class21.method137(var3, var2, var24.method2292(-120), var24.field5654, var23.field5072, -120, var23.field5043);
                class134.field2046 = 0;
                class33.field559 = class291.method2052(var23, (byte) -94);
                if (class33.field559 == null) {
                    class33.field559 = class22.field322;
                }
                if (var23.field5038) {
                    class308.field5303 = class236.method1587(new class26[] { var23.field5086, class301.field5194 }, (byte) -83);
                } else {
                    class308.field5303 = class236.method1587(new class26[] { class164.field2552, var23.field5049, class301.field5194 }, (byte) -94);
                }
            }
            return;
        }
        if (var4 == 29) {
            class159 var25 = class268.field4427[var7];
            if (var25 != null) {
                class22.field313++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var25.field3904[0], 1, 0, 2, var25.field3890[0], class13.field221.field3904[0]);
                class304.field5243 = class11.field152;
                class203.field3178 = 0;
                class260.field4255 = 2;
                class267.field4414 = class205.field3210;
                class114.field1789.method1431(0, 180);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (var4 == 35) {
            class114.field1789.method1431(0, 161);
            class114.field1789.method624(var3, (byte) -119);
            class114.field1789.method604(var7, (byte) 3);
            class114.field1789.method604(var2, (byte) 3);
            class261.field4262++;
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 124, var3);
            class22.field325 = var2;
        }
        if (var4 == 15) {
            class159 var26 = class268.field4427[var7];
            if (var26 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var26.field3904[0], 1, 0, 2, var26.field3890[0], class13.field221.field3904[0]);
                class203.field3178 = 0;
                class260.field4255 = 2;
                class267.field4414 = class205.field3210;
                class304.field5243 = class11.field152;
                class114.field1789.method1431(0, 195);
                class63.field998++;
                class114.field1789.method622(class297.field5087, -268435456);
                class114.field1789.method624(class29.field501, (byte) -124);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (var4 == 34) {
            if (class170.field2670 == 1) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            } else {
                boolean var27 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, arg0 ^ 0xA27, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
                if (!var27) {
                    class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
                }
            }
            class267.field4414 = class205.field3210;
            class260.field4255 = 2;
            class268.field4437++;
            class304.field5243 = class11.field152;
            class203.field3178 = 0;
            class114.field1789.method1431(arg0 - 2597, 109);
            class114.field1789.method635(-1, var3 + class165.field2568);
            class114.field1789.method643(-20037, class12.field157 + var2);
            class114.field1789.method604(var7, (byte) 3);
        }
        if (var4 == 25) {
            class192.field2999++;
            class114.field1789.method1431(arg0 - 2597, 81);
            class114.field1789.method622(var2, -268435456);
            class114.field1789.method643(-20037, var7);
            class114.field1789.method614(var3, 1437452424);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 126, var3);
            class22.field325 = var2;
        }
        if (var4 == 2) {
            class324 var29 = class185.field2877[var7];
            if (var29 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, arg0 - 2595, var29.field3904[0], 1, 0, 2, var29.field3890[0], class13.field221.field3904[0]);
                class304.field5243 = class11.field152;
                class260.field4255 = 2;
                class267.field4414 = class205.field3210;
                class327.field5660++;
                class203.field3178 = 0;
                class114.field1789.method1431(arg0 ^ 0xA25, 218);
                class114.field1789.method635(-1, var7);
            }
        }
        if (var4 == 51) {
            class114.field1789.method1431(0, 10);
            class4.field34++;
            class114.field1789.method577(arg0 - 2725, var3);
            class297 var30 = class178.method1226((byte) 117, var3);
            if (var30.field5109 != null && var30.field5109[0][0] == 5) {
                int var31 = var30.field5109[0][1];
                if (class205.field3201[var31] != var30.field5119[0]) {
                    class205.field3201[var31] = var30.field5119[0];
                    class191.method1299(98, var31);
                }
            }
        }
        if (var4 == 26) {
            class324 var32 = class185.field2877[var7];
            if (var32 != null) {
                class144.field2188++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var32.field3904[0], 1, 0, 2, var32.field3890[0], class13.field221.field3904[0]);
                class260.field4255 = 2;
                class203.field3178 = 0;
                class304.field5243 = class11.field152;
                class267.field4414 = class205.field3210;
                class114.field1789.method1431(0, 115);
                class114.field1789.method598(arg0 ^ 0xFFFFF595, class27.field453);
                class114.field1789.method635(-1, class100.field1612);
                class114.field1789.method635(arg0 ^ 0xFFFFF5DA, var7);
                class114.field1789.method604(class58.field938, (byte) 3);
            }
        }
        if (var4 == 59) {
            class114.field1789.method1431(0, 10);
            class4.field34++;
            class114.field1789.method577(-121, var3);
            class297 var33 = class178.method1226((byte) 122, var3);
            if (var33.field5109 != null && var33.field5109[0][0] == 5) {
                int var34 = var33.field5109[0][1];
                class205.field3201[var34] = 1 - class205.field3201[var34];
                class191.method1299(68, var34);
            }
        }
        if (var4 == 33) {
            boolean var35 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
            class32.field536++;
            if (!var35) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, arg0 - 2595, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            }
            class267.field4414 = class205.field3210;
            class203.field3178 = 0;
            class304.field5243 = class11.field152;
            class260.field4255 = 2;
            class114.field1789.method1431(0, 101);
            class114.field1789.method604(var2 + class12.field157, (byte) 3);
            class114.field1789.method635(arg0 ^ 0xFFFFF5DA, class100.field1612);
            class114.field1789.method635(-1, class58.field938);
            class114.field1789.method635(-1, var7);
            class114.field1789.method604(class165.field2568 + var3, (byte) 3);
            class114.field1789.method598(-118, class27.field453);
        }
        if (var4 == 1004) {
            class203.field3178 = 0;
            class267.field4414 = class205.field3210;
            class260.field4255 = 2;
            class304.field5243 = class11.field152;
            class114.field1789.method1431(0, 94);
            class241.field3907++;
            class114.field1789.method604(var7, (byte) 3);
        }
        if (var4 == 11) {
            if (var7 == 0) {
                class263.field4297 = 1;
                class57.method417(class279.field4651, var2, var3);
            } else if (var7 == 1) {
                class114.field1789.method1431(arg0 - 2597, 131);
                class28.field463++;
                class114.field1789.method598(-57, class29.field501);
                class114.field1789.method622(class12.field157 + var2, arg0 + -268438053);
                class114.field1789.method604(class297.field5087, (byte) 3);
                class114.field1789.method622(class165.field2568 + var3, -268435456);
            }
        }
        if (var4 == 8) {
            class297 var37 = class178.method1226((byte) 109, var3);
            boolean var38 = true;
            if (var37.field4990 > 0) {
                var38 = class280.method1964(205, var37);
            }
            if (var38) {
                class4.field34++;
                class114.field1789.method1431(0, 10);
                class114.field1789.method577(-120, var3);
            }
        }
        if (var4 == 1) {
            class159 var39 = class268.field4427[var7];
            if (var39 != null) {
                class83.field1355++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var39.field3904[0], 1, 0, 2, var39.field3890[0], class13.field221.field3904[0]);
                class203.field3178 = 0;
                class304.field5243 = class11.field152;
                class260.field4255 = 2;
                class267.field4414 = class205.field3210;
                class114.field1789.method1431(0, 248);
                class114.field1789.method604(var7, (byte) 3);
                class114.field1789.method643(-20037, class58.field938);
                class114.field1789.method643(arg0 ^ 0xFFFFBB9E, class100.field1612);
                class114.field1789.method598(-110, class27.field453);
            }
        }
        if (var4 == 7) {
            class114.field1789.method1431(0, 85);
            class31.field527++;
            class114.field1789.method614(var3, 1437452424);
            class114.field1789.method643(-20037, var2);
            class114.field1789.method622(var7, -268435456);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 125, var3);
            class22.field325 = var2;
        }
        if (var4 == 24) {
            if (class170.field2670 == 1) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, arg0 - 2595, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            } else {
                boolean var40 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
                if (!var40) {
                    class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
                }
            }
            class260.field4255 = 2;
            class267.field4422++;
            class304.field5243 = class11.field152;
            class267.field4414 = class205.field3210;
            class203.field3178 = 0;
            class114.field1789.method1431(0, 48);
            class114.field1789.method622(var2 + class12.field157, -268435456);
            class114.field1789.method604(var7, (byte) 3);
            class114.field1789.method635(-1, class165.field2568 + var3);
        }
        if (var4 == 38 && class252.method1744((byte) 39, var5, var3, var2)) {
            class114.field1789.method1431(0, 233);
            class114.field1789.method604(class165.field2568 + var3, (byte) 3);
            class134.field2053++;
            class114.field1789.method622(class12.field157 + var2, -268435456);
            class114.field1789.method604(class297.field5087, (byte) 3);
            class114.field1789.method614(class29.field501, 1437452424);
            class114.field1789.method622((int) (var5 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0xF0000A25);
        }
        if (var4 == 13) {
            class114.field1789.method1431(0, 6);
            class114.field1789.method577(arg0 - 2720, var3);
            class114.field1789.method622(var2, -268435456);
            class89.field1460++;
            class114.field1789.method635(-1, var7);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 115, var3);
            class22.field325 = var2;
        }
        if (var4 == 57) {
            class159 var42 = class268.field4427[var7];
            if (var42 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var42.field3904[0], 1, 0, 2, var42.field3890[0], class13.field221.field3904[0]);
                class260.field4255 = 2;
                class304.field5243 = class11.field152;
                class153.field2391++;
                class267.field4414 = class205.field3210;
                class203.field3178 = 0;
                class114.field1789.method1431(arg0 ^ 0xA25, 175);
                class114.field1789.method622(var7, -268435456);
            }
        }
        if (var4 == 22) {
            class39.method321((byte) -86);
            class297 var50 = class178.method1226((byte) 123, var3);
            class27.field453 = var3;
            class100.field1612 = var2;
            class134.field2046 = 1;
            class58.field938 = var7;
            class318.method2209(arg0 ^ 0xFFFFF5CC, var50);
            class236.field3764 = class236.method1587(new class26[] { class1.field3, class45.method341(var7, (byte) 109).field3422, class301.field5194 }, (byte) -113);
            if (class236.field3764 == null) {
                class236.field3764 = class121.field1895;
            }
            return;
        }
        if (var4 == 50) {
            class249.field4061++;
            class252.method1744((byte) 39, var5, var3, var2);
            class114.field1789.method1431(arg0 ^ 0xA25, 194);
            class114.field1789.method604(class165.field2568 + var3, (byte) 3);
            class114.field1789.method635(-1, class12.field157 + var2);
            class114.field1789.method643(-20037, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var4 == 48) {
            class136.field2091++;
            class114.field1789.method1431(0, 154);
            class114.field1789.method635(-1, var2);
            class114.field1789.method614(var3, 1437452424);
            class114.field1789.method604(var7, (byte) 3);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 119, var3);
            class22.field325 = var2;
        }
        if (var4 == 30) {
            class159 var43 = class268.field4427[var7];
            if (var43 != null) {
                class217.field3408++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var43.field3904[0], 1, 0, 2, var43.field3890[0], class13.field221.field3904[0]);
                class203.field3178 = 0;
                class267.field4414 = class205.field3210;
                class304.field5243 = class11.field152;
                class260.field4255 = 2;
                class114.field1789.method1431(0, 68);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (var4 == 43) {
            class144.field2192++;
            class114.field1789.method1431(0, 153);
            class114.field1789.method624(var3, (byte) -124);
            class114.field1789.method635(-1, var2);
            class114.field1789.method635(arg0 - 2598, var7);
            class224.field3557 = 0;
            class73.field1123 = class178.method1226((byte) 112, var3);
            class22.field325 = var2;
        }
        if (var4 == 39) {
            class254.field4154++;
            boolean var44 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
            if (!var44) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            }
            class304.field5243 = class11.field152;
            class267.field4414 = class205.field3210;
            class260.field4255 = 2;
            class203.field3178 = 0;
            class114.field1789.method1431(0, 73);
            class114.field1789.method614(class29.field501, 1437452424);
            class114.field1789.method643(-20037, class165.field2568 + var3);
            class114.field1789.method604(var7, (byte) 3);
            class114.field1789.method604(class12.field157 + var2, (byte) 3);
            class114.field1789.method635(-1, class297.field5087);
        }
        if (arg0 != 2597) {
            return;
        }
        if (var4 == 12) {
            class163.field2525++;
            class114.field1789.method1431(0, 82);
            class114.field1789.method643(arg0 ^ 0xFFFFBB9E, class297.field5087);
            class114.field1789.method614(var3, arg0 ^ 0x55ADC2AD);
            class114.field1789.method577(-124, class29.field501);
            class114.field1789.method604(var2, (byte) 3);
        }
        if (var4 == 36) {
            if (var7 == 0) {
                class78.field1219 = 1;
                class57.method417(class279.field4651, var2, var3);
            } else if (class201.field3119 > 0 && class78.field1183[82] && class78.field1183[81]) {
                class41.method331(class12.field157 + var2, class165.field2568 - -var3, class279.field4651, (byte) -4);
            } else {
                class131.field1998++;
                class114.field1789.method1431(arg0 - 2597, 179);
                class114.field1789.method643(-20037, class165.field2568 + var3);
                class114.field1789.method643(-20037, class12.field157 + var2);
            }
        }
        if (var4 == 6) {
            class159 var46 = class268.field4427[var7];
            if (var46 != null) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var46.field3904[0], 1, 0, 2, var46.field3890[0], class13.field221.field3904[0]);
                class304.field5243 = class11.field152;
                class277.field4633++;
                class203.field3178 = 0;
                class260.field4255 = 2;
                class267.field4414 = class205.field3210;
                class114.field1789.method1431(0, 106);
                class114.field1789.method643(-20037, var7);
            }
        }
        if (var4 == 20) {
            class36.field587++;
            if (class170.field2670 == 1) {
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
            } else {
                boolean var47 = class33.method269(class13.field221.field3890[0], 0, 0, false, 0, 2, var2, 0, 0, 2, var3, class13.field221.field3904[0]);
                if (!var47) {
                    class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var2, 1, 0, 2, var3, class13.field221.field3904[0]);
                }
            }
            class304.field5243 = class11.field152;
            class203.field3178 = 0;
            class267.field4414 = class205.field3210;
            class260.field4255 = 2;
            class114.field1789.method1431(arg0 - 2597, 33);
            class114.field1789.method643(-20037, var7);
            class114.field1789.method643(-20037, class12.field157 + var2);
            class114.field1789.method635(-1, class165.field2568 + var3);
        }
        if (var4 == 16) {
            class324 var49 = class185.field2877[var7];
            if (var49 != null) {
                class2.field24++;
                class33.method269(class13.field221.field3890[0], 0, 1, false, 0, 2, var49.field3904[0], 1, 0, 2, var49.field3890[0], class13.field221.field3904[0]);
                class267.field4414 = class205.field3210;
                class203.field3178 = 0;
                class304.field5243 = class11.field152;
                class260.field4255 = 2;
                class114.field1789.method1431(0, 3);
                class114.field1789.method604(var7, (byte) 3);
            }
        }
        if (class134.field2046 != 0) {
            class134.field2046 = 0;
            class318.method2209(120, class178.method1226((byte) 121, class27.field453));
        }
        if (class86.field1420) {
            class39.method321((byte) -36);
        }
        if (class73.field1123 != null && class224.field3557 == 0) {
            class318.method2209(-106, class73.field1123);
        }
    }

    @OriginalMember(owner = "client!i", name = "q", descriptor = "(B)V", line = 1092)
    public final void method1422(byte arg0) {
        this.field3341 = this.field1301 * 8;
        field3329++;
        int var2 = -12 % ((-arg0 - 32) / 54);
    }

    @OriginalMember(owner = "client!i", name = "q", descriptor = "(I)V", line = 1102)
    public static void method1423(int arg0) {
        field3344 = null;
        if (arg0 != 1) {
            field3336 = (int[]) null;
        }
        field3340 = null;
        field3336 = null;
        field3330 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V", line = 1114)
    public class214(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIII)I", line = 1118)
    public static final int method1424(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3334++;
        if (class110.field1754) {
            arg0 = 1000000;
            class110.field1754 = false;
        }
        class218 var5 = class79.field1248[arg3][arg1];
        float var6 = ((float) arg2 * 0.1F + 0.7F) * var5.field3485;
        float var7 = var5.field3490;
        int var8 = var5.field3474;
        int var9 = var5.field3481;
        int var10 = var5.field3472;
        if (!class45.field707) {
            var9 = 0;
        }
        float var11 = var5.field3488;
        if (class177.field2784 != var8 || class235.field3724 != var6 || class1.field9 != var7 || class297.field5052 != var11 || class145.field2197 != var10 || class108.field1694 != var9) {
            class235.field3724 = var6;
            class264.field4335 = class264.field4316;
            class158.field2470 = class41.field689;
            class177.field2784 = var8;
            class53.field830 = class250.field4091;
            class24.field344 = class153.field2398;
            class297.field5052 = var11;
            class147.field2294 = 0;
            class76.field1155 = class266.field4382;
            class108.field1694 = var9;
            class1.field9 = var7;
            class145.field2197 = var10;
            class100.field1614 = class137.field2093;
        }
        if (class147.field2294 < 65536) {
            class147.field2294 += arg0 * 250;
            if (class147.field2294 >= 65536) {
                class147.field2294 = 65536;
            }
            float var12 = (float) class147.field2294 / 65536.0F;
            int var13 = class147.field2294 >> 8;
            int var14 = 65536 - class147.field2294 >> 8;
            class250.field4091 = ((class53.field830 & 0xFF00FF) * var14 + (class145.field2197 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class53.field830 & 0xFF00) * var14 + (class145.field2197 & 0xFF00) * var13 & 0xFF0000) >> 8;
            float var15 = (float) (65536 - class147.field2294) / 65536.0F;
            class41.field689 = class235.field3724 * var12 + class158.field2470 * var15;
            class264.field4316 = class264.field4335 * var15 + class1.field9 * var12;
            class137.field2093 = class297.field5052 * var12 + class100.field1614 * var15;
            class266.field4382 = ((class76.field1155 & 0xFF00FF) * var14 + ((class177.field2784 & 0xFF00FF) * var13) & 0xFF00FF00) + ((class76.field1155 & 0xFF00) * var14 + (class177.field2784 & 0xFF00) * var13 & 0xFF0000) >> 8;
            class153.field2398 = class24.field344 * var14 + class108.field1694 * var13 >> 8;
        }
        class289.method2031(class266.field4382, class41.field689, class264.field4316, class137.field2093);
        class289.method2033(class250.field4091, class153.field2398);
        if (arg4 != 1) {
            field3344 = (class26) null;
        }
        class289.method2034((float) class191.field2994, (float) class268.field4434, (float) class218.field3491);
        class289.method2029();
        return class250.field4091;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(BI)I", line = 1202)
    public static final int method1425(byte arg0, int arg1) {
        if (arg0 == 3) {
            field3345++;
            return arg1 & 0xFF;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI[BI)V", line = 1213)
    public final void method1426(byte arg0, int arg1, byte[] arg2, int arg3) {
        field3339++;
        if (arg0 < 16) {
            method1420((class26) null, 126, (class26) null, -28);
        }
        for (int var5 = 0; var5 < arg3; var5++) {
            arg2[arg1 + var5] = (byte) (this.field1280[this.field1301++] - this.field3333.method645(-9356));
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(BI)I", line = 1233)
    public final int method1427(byte arg0, int arg1) {
        int var3 = this.field3341 >> 3;
        int var4 = 8 - (this.field3341 & 0x7);
        int var5 = 0;
        this.field3341 += arg1;
        if (arg0 != -11) {
            return -10;
        }
        while (var4 < arg1) {
            var5 += (class272.field4550[var4] & this.field1280[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        field3328++;
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1280[var3] & class272.field4550[var4]) + var5;
        } else {
            var6 = (this.field1280[var3] >> var4 - arg1 & class272.field4550[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "(I)V", line = 1272)
    public static final void method1428(int arg0) {
        field3332++;
        class281.field4687.method1986((byte) -127);
        if (arg0 == 1974) {
            class207.field3216.method1986((byte) -113);
            class140.field2132.method1986((byte) -108);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([IZ)V", line = 1289)
    public final void method1429(int[] arg0, boolean arg1) {
        this.field3333 = new class83(arg0);
        if (arg1) {
            this.method1430(13, -97);
        }
        field3338++;
    }

    @OriginalMember(owner = "client!i", name = "q", descriptor = "(II)I", line = 1300)
    public final int method1430(int arg0, int arg1) {
        field3331++;
        if (arg1 != 32666) {
            this.method1426((byte) 96, 46, (byte[]) null, -50);
        }
        return arg0 * 8 - this.field3341;
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "(II)V", line = 1311)
    public final void method1431(int arg0, int arg1) {
        if (arg0 == 0) {
            field3326++;
            this.field1280[this.field1301++] = (byte) (arg1 + this.field3333.method645(-9356));
        }
    }

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)I", line = 1324)
    public final int method1432(int arg0) {
        if (arg0 == 0) {
            field3337++;
            return this.field1280[this.field1301++] - this.field3333.method645(-9356) & 0xFF;
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "(Z)V", line = 1339)
    public final void method1433(boolean arg0) {
        this.field1301 = (this.field3341 + 7) / 8;
        if (arg0) {
            this.method1427((byte) -55, -75);
        }
        field3342++;
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(Z)V", line = 1360)
    public static final void method1434(boolean arg0) {
        class174 var1 = (class174) class74.field1132.method1823(73);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            int var2 = var1.field2721;
            if (class71.method509(var2, 104)) {
                boolean var3 = true;
                class297[] var4 = class86.field1416[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5038;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2293;
                    class297 var7 = class178.method1226((byte) 123, var6);
                    if (var7 != null) {
                        class318.method2209(117, var7);
                    }
                }
            }
            var1 = (class174) class74.field1132.method1825(-76);
        }
        field3343++;
    }
}
