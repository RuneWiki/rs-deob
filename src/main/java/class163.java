import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rf")
public class class163 extends class85 {

    @OriginalMember(owner = "rf", name = "db", descriptor = "I")
    private int field3056 = 4096;

    @OriginalMember(owner = "rf", name = "V", descriptor = "I")
    private int field3048 = 0;

    @OriginalMember(owner = "rf", name = "X", descriptor = "[J")
    public static long[] field3050 = new long[32];

    @OriginalMember(owner = "rf", name = "U", descriptor = "Llf;")
    private static class109 field3047 = class35.method275("Your account is already logged in)3", 2);

    @OriginalMember(owner = "rf", name = "R", descriptor = "I")
    public static int field3044 = 0;

    @OriginalMember(owner = "rf", name = "fb", descriptor = "Llf;")
    public static class109 field3058 = field3047;

    @OriginalMember(owner = "rf", name = "eb", descriptor = "I")
    public static int field3057 = 0;

    @OriginalMember(owner = "rf", name = "cb", descriptor = "Llf;")
    private static class109 field3055 = class35.method275("go back to the main RuneScape webpage", 2);

    @OriginalMember(owner = "rf", name = "gb", descriptor = "I")
    private static int field3059 = 2301979;

    @OriginalMember(owner = "rf", name = "mb", descriptor = "Llf;")
    public static class109 field3065 = field3055;

    @OriginalMember(owner = "rf", name = "lb", descriptor = "Llf;")
    private static class109 field3064 = class35.method275("Loaded title screen", 2);

    @OriginalMember(owner = "rf", name = "ib", descriptor = "Llf;")
    public static class109 field3061 = field3064;

    @OriginalMember(owner = "rf", name = "Q", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "rf", name = "S", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "rf", name = "T", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "rf", name = "Y", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "rf", name = "Z", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "rf", name = "ab", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "rf", name = "bb", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "rf", name = "hb", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "rf", name = "jb", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "rf", name = "kb", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "rf", name = "W", descriptor = "Lbg;")
    public static class18 field3049;

    @OriginalMember(owner = "rf", name = "b", descriptor = "(Z)V")
    public static void method1104(boolean arg0) {
        field3064 = null;
        field3065 = null;
        field3049 = null;
        field3055 = null;
        field3058 = null;
        field3050 = null;
        if (arg0) {
            field3061 = null;
            field3047 = null;
        }
    }

    @OriginalMember(owner = "rf", name = "a", descriptor = "(Lab;Z)V")
    public static final void method1105(class3 arg0, boolean arg1) {
        class193.field3693.method1231(arg0, 0);
        while (true) {
            class3 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class3[][] var7;
            class3 var65;
            do {
                class3 var64;
                do {
                    class3 var63;
                    do {
                        class3 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class3) class193.field3693.method1229((byte) 99);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field33);
                                            var3 = var2.field20;
                                            var4 = var2.field11;
                                            var5 = var2.field19;
                                            var6 = var2.field29;
                                            var7 = class78.field1550[var5];
                                            if (!var2.field25) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class3 var8 = class78.field1550[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field33) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class158.field2975 && var3 > class5.field75) {
                                                    class3 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field33 && (var9.field25 || (var2.field21 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class158.field2975 && var3 < class140.field2708 - 1) {
                                                    class3 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field33 && (var10.field25 || (var2.field21 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class31.field735 && var4 > class24.field533) {
                                                    class3 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field33 && (var11.field25 || (var2.field21 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class31.field735 && var4 < class31.field731 - 1) {
                                                    class3 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field33 && (var12.field25 || (var2.field21 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field25 = false;
                                            if (var2.field24 != null) {
                                                class3 var13 = var2.field24;
                                                if (var13.field35 != null) {
                                                    if (!class201.method1327(0, var3, var4)) {
                                                        class134.method951(var13.field35, 0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var3, var4);
                                                    }
                                                } else if (var13.field36 != null && !class201.method1327(0, var3, var4)) {
                                                    class147.method1030(var13.field36, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var3, var4);
                                                }
                                                class12 var14 = var13.field31;
                                                if (var14 != null) {
                                                    var14.field188.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var14.field186 - class18.field371, var14.field176 - class178.field3369, var14.field184 - class144.field2782, var14.field183);
                                                }
                                                for (int var15 = 0; var15 < var13.field13; ++var15) {
                                                    class45 var16 = var13.field17[var15];
                                                    if (var16 != null) {
                                                        var16.field945.method421(var16.field943, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var16.field940 - class18.field371, var16.field937 - class178.field3369, var16.field929 - class144.field2782, var16.field949);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field35 != null) {
                                                if (!class201.method1327(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field35.field2451 != 12345678 || class128.field2485 && var5 <= class5.field72) {
                                                        class134.method951(var2.field35, var6, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var3, var4);
                                                    }
                                                }
                                            } else if (var2.field36 != null && !class201.method1327(var6, var3, var4)) {
                                                var17 = true;
                                                class147.method1030(var2.field36, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var3, var4);
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class12 var20 = var2.field31;
                                            class104 var21 = var2.field34;
                                            if (var20 != null || var21 != null) {
                                                if (class158.field2975 == var3) {
                                                    ++var18;
                                                } else if (class158.field2975 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class31.field735 == var4) {
                                                    var18 += 3;
                                                } else if (class31.field735 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class74.field1421[var18];
                                                var2.field39 = class20.field439[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field177 & class200.field3954[var18]) != 0) {
                                                    if (var20.field177 == 16) {
                                                        var2.field22 = 3;
                                                        var2.field26 = class9.field129[var18];
                                                        var2.field15 = 3 - var2.field26;
                                                    } else if (var20.field177 == 32) {
                                                        var2.field22 = 6;
                                                        var2.field26 = class140.field2726[var18];
                                                        var2.field15 = 6 - var2.field26;
                                                    } else if (var20.field177 == 64) {
                                                        var2.field22 = 12;
                                                        var2.field26 = class5.field70[var18];
                                                        var2.field15 = 12 - var2.field26;
                                                    } else {
                                                        var2.field22 = 9;
                                                        var2.field26 = class149.field2875[var18];
                                                        var2.field15 = 9 - var2.field26;
                                                    }
                                                } else {
                                                    var2.field22 = 0;
                                                }
                                                if ((var20.field177 & var19) != 0 && !class116.method853(var6, var3, var4, var20.field177)) {
                                                    var20.field188.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var20.field186 - class18.field371, var20.field176 - class178.field3369, var20.field184 - class144.field2782, var20.field183);
                                                }
                                                if ((var20.field187 & var19) != 0 && !class116.method853(var6, var3, var4, var20.field187)) {
                                                    var20.field190.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var20.field186 - class18.field371, var20.field176 - class178.field3369, var20.field184 - class144.field2782, var20.field183);
                                                }
                                            }
                                            if (var21 != null && !class26.method221(var6, var3, var4, var21.field2048.field1945)) {
                                                if ((var21.field2055 & var19) != 0) {
                                                    var21.field2048.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var21.field2062 - class18.field371 + var21.field2057, var21.field2046 - class178.field3369, var21.field2047 - class144.field2782 + var21.field2058, var21.field2054);
                                                } else if (var21.field2055 == 256) {
                                                    int var22 = var21.field2062 - class18.field371;
                                                    int var23 = var21.field2046 - class178.field3369;
                                                    int var24 = var21.field2047 - class144.field2782;
                                                    int var25 = var21.field2056;
                                                    int var26;
                                                    if (var25 != 1 && var25 != 2) {
                                                        var26 = var22;
                                                    } else {
                                                        var26 = -var22;
                                                    }
                                                    int var27;
                                                    if (var25 != 2 && var25 != 3) {
                                                        var27 = var24;
                                                    } else {
                                                        var27 = -var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field2048.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var21.field2057 + var22, var23, var21.field2058 + var24, var21.field2054);
                                                    } else if (var21.field2049 != null) {
                                                        var21.field2049.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var22, var23, var24, var21.field2054);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class50 var28 = var2.field27;
                                                if (var28 != null) {
                                                    var28.field1027.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var28.field1029 - class18.field371, var28.field1020 - class178.field3369, var28.field1024 - class144.field2782, var28.field1030);
                                                }
                                                class38 var29 = var2.field38;
                                                if (var29 != null && var29.field813 == 0) {
                                                    if (var29.field810 != null) {
                                                        var29.field810.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var29.field811 - class18.field371, var29.field816 - class178.field3369, var29.field826 - class144.field2782, var29.field812);
                                                    }
                                                    if (var29.field817 != null) {
                                                        var29.field817.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var29.field811 - class18.field371, var29.field816 - class178.field3369, var29.field826 - class144.field2782, var29.field812);
                                                    }
                                                    if (var29.field815 != null) {
                                                        var29.field815.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var29.field811 - class18.field371, var29.field816 - class178.field3369, var29.field826 - class144.field2782, var29.field812);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field21;
                                            if (var30 != 0) {
                                                if (var3 < class158.field2975 && (var30 & 4) != 0) {
                                                    class3 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field33) {
                                                        class193.field3693.method1231(var31, 0);
                                                    }
                                                }
                                                if (var4 < class31.field735 && (var30 & 2) != 0) {
                                                    class3 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field33) {
                                                        class193.field3693.method1231(var32, 0);
                                                    }
                                                }
                                                if (var3 > class158.field2975 && (var30 & 1) != 0) {
                                                    class3 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field33) {
                                                        class193.field3693.method1231(var33, 0);
                                                    }
                                                }
                                                if (var4 > class31.field735 && (var30 & 8) != 0) {
                                                    class3 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field33) {
                                                        class193.field3693.method1231(var34, 0);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field22 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field13; ++var36) {
                                                if (class102.field2020 != var2.field17[var36].field931 && (var2.field28[var36] & var2.field22) == var2.field26) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class12 var37 = var2.field31;
                                                if (!class116.method853(var6, var3, var4, var37.field177)) {
                                                    var37.field188.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var37.field186 - class18.field371, var37.field176 - class178.field3369, var37.field184 - class144.field2782, var37.field183);
                                                }
                                                var2.field22 = 0;
                                            }
                                        }
                                        if (!var2.field18) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field13;
                                            var2.field18 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; ++var40) {
                                                class45 var41 = var2.field17[var40];
                                                if (class102.field2020 != var41.field931) {
                                                    for (int var42 = var41.field947; var42 <= var41.field927; ++var42) {
                                                        for (int var43 = var41.field932; var43 <= var41.field944; ++var43) {
                                                            class3 var44 = var7[var42][var43];
                                                            if (var44.field25) {
                                                                var2.field18 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field22 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field947) {
                                                                    ++var45;
                                                                }
                                                                if (var42 < var41.field927) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field932) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field944) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field22) == var2.field15) {
                                                                    var2.field18 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class51.field1042[var39++] = var41;
                                                    int var46 = class158.field2975 - var41.field947;
                                                    int var47 = var41.field927 - class158.field2975;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class31.field735 - var41.field932;
                                                    int var49 = var41.field944 - class31.field735;
                                                    if (var49 > var48) {
                                                        var41.field936 = var46 + var49;
                                                    } else {
                                                        var41.field936 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; ++var52) {
                                                    class45 var53 = class51.field1042[var52];
                                                    if (class102.field2020 != var53.field931) {
                                                        if (var53.field936 > var50) {
                                                            var50 = var53.field936;
                                                            var51 = var52;
                                                        } else if (var53.field936 == var50) {
                                                            int var54 = var53.field940 - class18.field371;
                                                            int var55 = var53.field929 - class144.field2782;
                                                            int var56 = class51.field1042[var51].field940 - class18.field371;
                                                            int var57 = class51.field1042[var51].field929 - class144.field2782;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class45 var58 = class51.field1042[var51];
                                                var58.field931 = class102.field2020;
                                                if (!class8.method38(var6, var58.field947, var58.field927, var58.field932, var58.field944, var58.field945.field1945)) {
                                                    var58.field945.method421(var58.field943, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var58.field940 - class18.field371, var58.field937 - class178.field3369, var58.field929 - class144.field2782, var58.field949);
                                                }
                                                for (int var59 = var58.field947; var59 <= var58.field927; ++var59) {
                                                    for (int var60 = var58.field932; var60 <= var58.field944; ++var60) {
                                                        class3 var61 = var7[var59][var60];
                                                        if (var61.field22 != 0) {
                                                            class193.field3693.method1231(var61, 0);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field33) {
                                                            class193.field3693.method1231(var61, 0);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field18) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field18 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field33);
                            } while (var2.field22 != 0);
                            if (var3 > class158.field2975 || var3 <= class5.field75) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field33);
                        if (var3 < class158.field2975 || var3 >= class140.field2708 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field33);
                    if (var4 > class31.field735 || var4 <= class24.field533) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field33);
                if (var4 < class31.field735 || var4 >= class31.field731 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field33);
            var2.field33 = false;
            --class36.field796;
            class38 var66 = var2.field38;
            if (var66 != null && var66.field813 != 0) {
                if (var66.field810 != null) {
                    var66.field810.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var66.field811 - class18.field371, var66.field816 - class178.field3369 - var66.field813, var66.field826 - class144.field2782, var66.field812);
                }
                if (var66.field817 != null) {
                    var66.field817.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var66.field811 - class18.field371, var66.field816 - class178.field3369 - var66.field813, var66.field826 - class144.field2782, var66.field812);
                }
                if (var66.field815 != null) {
                    var66.field815.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var66.field811 - class18.field371, var66.field816 - class178.field3369 - var66.field813, var66.field826 - class144.field2782, var66.field812);
                }
            }
            if (var2.field39 != 0) {
                class104 var67 = var2.field34;
                if (var67 != null && !class26.method221(var6, var3, var4, var67.field2048.field1945)) {
                    if ((var67.field2055 & var2.field39) != 0) {
                        var67.field2048.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var67.field2062 - class18.field371 + var67.field2057, var67.field2046 - class178.field3369, var67.field2047 - class144.field2782 + var67.field2058, var67.field2054);
                    } else if (var67.field2055 == 256) {
                        int var68 = var67.field2062 - class18.field371;
                        int var69 = var67.field2046 - class178.field3369;
                        int var70 = var67.field2047 - class144.field2782;
                        int var71 = var67.field2056;
                        int var72;
                        if (var71 != 1 && var71 != 2) {
                            var72 = var68;
                        } else {
                            var72 = -var68;
                        }
                        int var73;
                        if (var71 != 2 && var71 != 3) {
                            var73 = var70;
                        } else {
                            var73 = -var70;
                        }
                        if (var73 >= var72) {
                            var67.field2048.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var67.field2057 + var68, var69, var67.field2058 + var70, var67.field2054);
                        } else if (var67.field2049 != null) {
                            var67.field2049.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var68, var69, var70, var67.field2054);
                        }
                    }
                }
                class12 var74 = var2.field31;
                if (var74 != null) {
                    if ((var74.field187 & var2.field39) != 0 && !class116.method853(var6, var3, var4, var74.field187)) {
                        var74.field190.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var74.field186 - class18.field371, var74.field176 - class178.field3369, var74.field184 - class144.field2782, var74.field183);
                    }
                    if ((var74.field177 & var2.field39) != 0 && !class116.method853(var6, var3, var4, var74.field177)) {
                        var74.field188.method421(0, class142.field2743, class118.field2330, class185.field3528, class50.field1023, var74.field186 - class18.field371, var74.field176 - class178.field3369, var74.field184 - class144.field2782, var74.field183);
                    }
                }
            }
            if (var5 < class44.field920 - 1) {
                class3 var75 = class78.field1550[var5 + 1][var3][var4];
                if (var75 != null && var75.field33) {
                    class193.field3693.method1231(var75, 0);
                }
            }
            if (var3 < class158.field2975) {
                class3 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field33) {
                    class193.field3693.method1231(var76, 0);
                }
            }
            if (var4 < class31.field735) {
                class3 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field33) {
                    class193.field3693.method1231(var77, 0);
                }
            }
            if (var3 > class158.field2975) {
                class3 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field33) {
                    class193.field3693.method1231(var78, 0);
                }
            }
            if (var4 > class31.field735) {
                class3 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field33) {
                    class193.field3693.method1231(var79, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "rf", name = "d", descriptor = "(B)V")
    public static final void method1106(byte arg0) {
        if (class205.field4019 != null) {
            class79 var1 = class205.field4019;
            synchronized (class205.field4019) {
                class205.field4019 = null;
            }
        }
        ++field3043;
        if (arg0 != -48) {
            field3044 = 34;
        }
    }

    @OriginalMember(owner = "rf", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field3054;
        if (arg0 < -120) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field1726 = ~arg2.method598((byte) 109) == -2;
                    }
                } else {
                    this.field3056 = arg2.method569(true);
                }
            } else {
                this.field3048 = arg2.method569(true);
            }
        }
    }

    @OriginalMember(owner = "rf", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field3060;
        int var6 = (arg5 + -32) * arg5 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        if (arg4 < 85) {
            method1109((class109) null, (class18) null, (byte) -119, (class109) null);
        }
        class38.field827[0].method280(arg3, arg0);
        int var7 = (arg5 + -32 - var6) * arg1 / (-arg5 + arg2);
        class38.field827[1].method280(arg3, arg0 - (-arg5 - -16));
        class11.method76(arg3, arg0 + 16, 16, arg5 - 32, field3059);
        class11.method76(arg3, arg0 + var7 - -16, 16, var6, class157.field2958);
        class11.method70(arg3, var7 + 16 + arg0, var6, class131.field2531);
        class11.method70(arg3 + 1, var7 + 16 + arg0, var6, class131.field2531);
        class11.method68(arg3, arg0 + var7 + 16, 16, class131.field2531);
        class11.method68(arg3, var7 + 17 + arg0, 16, class131.field2531);
        class11.method70(arg3 + 15, arg0 + var7 - -16, var6, class21.field486);
        class11.method70(arg3 + 14, arg0 + 17 + var7, var6 + -1, class21.field486);
        class11.method68(arg3, arg0 + 15 - -var6 + var7, 16, class21.field486);
        class11.method68(arg3 + 1, arg0 - (-14 - var7 - var6), 15, class21.field486);
    }

    @OriginalMember(owner = "rf", name = "<init>", descriptor = "()V")
    public class163() {
        super(1, false);
    }

    @OriginalMember(owner = "rf", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        if (arg1 != 2177) {
            this.method87(-104, 5);
        }
        ++field3053;
        int[][] var3 = super.field1719.method673((byte) -127, arg0);
        if (super.field1719.field1926) {
            int[][] var4 = this.method544(false, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class57.field1152; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (this.field3048 > var13) {
                    var8[var11] = this.field3048;
                } else if (var13 <= this.field3056) {
                    var8[var11] = var13;
                } else {
                    var8[var11] = this.field3056;
                }
                if (this.field3048 > var14) {
                    var9[var11] = this.field3048;
                } else if (this.field3056 >= var14) {
                    var9[var11] = var14;
                } else {
                    var9[var11] = this.field3056;
                }
                if (this.field3048 <= var12) {
                    if (~var12 < ~this.field3056) {
                        var10[var11] = this.field3056;
                    } else {
                        var10[var11] = var12;
                    }
                } else {
                    var10[var11] = this.field3048;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "rf", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int[] var4 = this.method540(arg1, -128, 0);
            for (int var5 = 0; class57.field1152 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field3048) {
                    if (~this.field3056 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field3056;
                    }
                } else {
                    var3[var5] = this.field3048;
                }
            }
        }
        ++field3063;
        if (arg0 > -49) {
            field3055 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "rf", name = "c", descriptor = "(II)Llf;")
    public static final class109 method1108(int arg0, int arg1) {
        if (arg1 != 2) {
            field3050 = null;
        }
        ++field3062;
        if (~arg0 > -100001) {
            return class36.method279(new class109[] { class158.field2968, class52.method345((byte) 85, arg0), class88.field1825 }, -80);
        } else {
            return ~arg0 > -10000001 ? class36.method279(new class109[] { class60.field1179, class52.method345((byte) 85, arg0 / 1000), class53.field1068, class88.field1825 }, 124) : class36.method279(new class109[] { class184.field3453, class52.method345((byte) 85, arg0 / 1000000), class14.field230, class88.field1825 }, -77);
        }
    }

    @OriginalMember(owner = "rf", name = "a", descriptor = "(Llf;Lbg;BLlf;)Ldf;")
    public static final class37 method1109(class109 arg0, class18 arg1, byte arg2, class109 arg3) {
        int var4 = arg1.method151((byte) 106, arg3);
        if (arg2 != 75) {
            method1107(118, -110, 69, 6, (byte) 34, -90);
        }
        ++field3051;
        int var5 = arg1.method154((byte) -41, arg0, var4);
        return class161.method1090(var4, false, var5, arg1);
    }
}
