import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class178 extends class240 {

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2786 = new String[100];

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Lub;")
    public static class21 field2785;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "Lub;")
    public static class21 field2790;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Lja;")
    public static class64 field2787;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "Lja;")
    public static class64 field2788;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lw;Z)V", line = 7)
    public static final void method1318(class272 arg0, boolean arg1) {
        class228.field3640.method1493(-92, arg0);
        while (true) {
            class272 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class272[][] var7;
            class272 var78;
            do {
                class272 var77;
                do {
                    class272 var76;
                    do {
                        class272 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class272) class228.field3640.method1496(-29960);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4216);
                                            var3 = var2.field4237;
                                            var4 = var2.field4230;
                                            var5 = var2.field4223;
                                            var6 = var2.field4225;
                                            var7 = class60.field946[var5];
                                            float var8 = 0.0F;
                                            if (class265.field4126) {
                                                if (class29.field475 == class150.field2404) {
                                                    int var9 = class128.field2046[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class242.field3752 != var10) {
                                                        class242.field3752 = var10;
                                                        class139.method1064(20699, var10);
                                                        class97.method702(class64.method494(76));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class180.field2883 != var11) {
                                                        class180.field2883 = var11;
                                                        class275.method1977(false, var11);
                                                    }
                                                    int var12 = class298.field4701[0][var3 + 1][var4] + class298.field4701[0][var3][var4] + class298.field4701[0][var3][var4 + 1] + class298.field4701[0][var3 + 1][var4 + 1] >> 2;
                                                    class308.method2132(3, (byte) -28, -var12);
                                                    var8 = 201.5F;
                                                    class265.method1907(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class265.method1907(var8);
                                                }
                                            }
                                            if (!var2.field4232) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class272 var13 = class60.field946[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field4216) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class151.field2419 && var3 > class276.field4277) {
                                                    class272 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field4216 && (var14.field4232 || (var2.field4229 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class151.field2419 && var3 < class219.field3513 - 1) {
                                                    class272 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field4216 && (var15.field4232 || (var2.field4229 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class301.field4744 && var4 > class90.field1464) {
                                                    class272 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field4216 && (var16.field4232 || (var2.field4229 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class301.field4744 && var4 < class110.field1821 - 1) {
                                                    class272 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field4216 && (var17.field4232 || (var2.field4229 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4232 = false;
                                            if (var2.field4224 != null) {
                                                class272 var18 = var2.field4224;
                                                if (class265.field4126) {
                                                    class265.method1907(201.5F - (float) (var18.field4225 + 1) * 50.0F);
                                                }
                                                if (var18.field4235 == null) {
                                                    if (var18.field4222 != null) {
                                                        if (class68.method513(0, var3, var4)) {
                                                            class261.method1850(var18.field4222, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, true);
                                                        } else {
                                                            class261.method1850(var18.field4222, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class68.method513(0, var3, var4)) {
                                                    class309.method2140(var18.field4235, 0, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, true);
                                                } else {
                                                    class309.method2140(var18.field4235, 0, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, false);
                                                }
                                                class189 var19 = var18.field4236;
                                                if (var19 != null) {
                                                    if (class265.field4126) {
                                                        if ((var19.field2999 & var2.field4214) == 0) {
                                                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                        } else {
                                                            class38.method309(var19.field2999, class31.field533, class203.field3223, class236.field3717, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field2996.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var19.field3005 - class31.field533, var19.field3007 - class203.field3223, var19.field3002 - class236.field3717, var19.field3008, var5, (class47) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field4220; var20++) {
                                                    class45 var21 = var18.field4217[var20];
                                                    if (var21 != null) {
                                                        if (class265.field4126) {
                                                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                        }
                                                        var21.field782.method203(var21.field783, class20.field371, class204.field3230, class249.field3849, class10.field170, var21.field775 - class31.field533, var21.field773 - class203.field3223, var21.field771 - class236.field3717, var21.field776, var5, (class47) null);
                                                    }
                                                }
                                                if (class265.field4126) {
                                                    class265.method1907(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field4235 == null) {
                                                if (var2.field4222 != null) {
                                                    if (class68.method513(var6, var3, var4)) {
                                                        class261.method1850(var2.field4222, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class261.method1850(var2.field4222, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, false);
                                                    }
                                                }
                                            } else if (class68.method513(var6, var3, var4)) {
                                                class309.method2140(var2.field4235, var6, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field4235.field4698 != 12345678 || class168.field2603 && var5 <= class46.field788) {
                                                    class309.method2140(var2.field4235, var6, class20.field371, class204.field3230, class249.field3849, class10.field170, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class87 var23 = var2.field4213;
                                                if (var23 != null && (var23.field1338 & 0x80000000L) != 0L) {
                                                    if (class265.field4126 && var23.field1339) {
                                                        class265.method1907(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class265.field4126) {
                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                    }
                                                    var23.field1325.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var23.field1334 - class31.field533, var23.field1326 - class203.field3223, var23.field1336 - class236.field3717, var23.field1338, var5, (class47) null);
                                                    if (class265.field4126 && var23.field1339) {
                                                        class265.method1907(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class189 var26 = var2.field4236;
                                            class114 var27 = var2.field4219;
                                            if (var26 != null || var27 != null) {
                                                if (class151.field2419 == var3) {
                                                    var24++;
                                                } else if (class151.field2419 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class301.field4744 == var4) {
                                                    var24 += 3;
                                                } else if (class301.field4744 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class181.field2900[var24];
                                                var2.field4214 = class107.field1787[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field2999 & class230.field3658[var24]) == 0) {
                                                    var2.field4233 = 0;
                                                } else if (var26.field2999 == 16) {
                                                    var2.field4233 = 3;
                                                    var2.field4231 = class50.field812[var24];
                                                    var2.field4215 = 3 - var2.field4231;
                                                } else if (var26.field2999 == 32) {
                                                    var2.field4233 = 6;
                                                    var2.field4231 = class242.field3747[var24];
                                                    var2.field4215 = 6 - var2.field4231;
                                                } else if (var26.field2999 == 64) {
                                                    var2.field4233 = 12;
                                                    var2.field4231 = class74.field1137[var24];
                                                    var2.field4215 = 12 - var2.field4231;
                                                } else {
                                                    var2.field4233 = 9;
                                                    var2.field4231 = class137.field2179[var24];
                                                    var2.field4215 = 9 - var2.field4231;
                                                }
                                                if ((var26.field2999 & var25) != 0 && !class220.method1595(var6, var3, var4, var26.field2999)) {
                                                    if (class265.field4126) {
                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                    }
                                                    var26.field2996.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var26.field3005 - class31.field533, var26.field3007 - class203.field3223, var26.field3002 - class236.field3717, var26.field3008, var5, (class47) null);
                                                }
                                                if ((var26.field3009 & var25) != 0 && !class220.method1595(var6, var3, var4, var26.field3009)) {
                                                    if (class265.field4126) {
                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                    }
                                                    var26.field2998.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var26.field3005 - class31.field533, var26.field3007 - class203.field3223, var26.field3002 - class236.field3717, var26.field3008, var5, (class47) null);
                                                }
                                            }
                                            if (var27 != null && !class6.method22(var6, var3, var4, var27.field1863.method207())) {
                                                if (class265.field4126) {
                                                    class265.method1907(var8 - 0.5F);
                                                }
                                                if ((var27.field1870 & var25) != 0) {
                                                    if (class265.field4126) {
                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                    }
                                                    var27.field1863.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var27.field1867 + var27.field1872 - class31.field533, var27.field1858 - class203.field3223, var27.field1868 + var27.field1864 - class236.field3717, var27.field1865, var5, (class47) null);
                                                } else if (var27.field1870 == 256) {
                                                    int var28 = var27.field1867 - class31.field533;
                                                    int var29 = var27.field1858 - class203.field3223;
                                                    int var30 = var27.field1868 - class236.field3717;
                                                    int var31 = var27.field1859;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class265.field4126) {
                                                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                        }
                                                        var27.field1863.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var27.field1872 + var28, var29, var27.field1864 + var30, var27.field1865, var5, (class47) null);
                                                    } else if (var27.field1860 != null) {
                                                        if (class265.field4126) {
                                                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                        }
                                                        var27.field1860.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var28, var29, var30, var27.field1865, var5, (class47) null);
                                                    }
                                                }
                                                if (class265.field4126) {
                                                    class265.method1907(var8);
                                                }
                                            }
                                            if (var22) {
                                                class87 var34 = var2.field4213;
                                                if (var34 != null && (var34.field1338 & 0x80000000L) == 0L) {
                                                    if (class265.field4126 && var34.field1339) {
                                                        class265.method1907(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class265.field4126) {
                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                    }
                                                    var34.field1325.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var34.field1334 - class31.field533, var34.field1326 - class203.field3223, var34.field1336 - class236.field3717, var34.field1338, var5, (class47) null);
                                                    if (class265.field4126 && var34.field1339) {
                                                        class265.method1907(var8);
                                                    }
                                                }
                                                class183 var35 = var2.field4221;
                                                if (var35 != null && var35.field2926 == 0) {
                                                    if (class265.field4126) {
                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                    }
                                                    if (var35.field2919 != null) {
                                                        var35.field2919.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var35.field2916 - class31.field533, var35.field2924 - class203.field3223, var35.field2925 - class236.field3717, var35.field2921, var5, (class47) null);
                                                    }
                                                    if (var35.field2927 != null) {
                                                        var35.field2927.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var35.field2916 - class31.field533, var35.field2924 - class203.field3223, var35.field2925 - class236.field3717, var35.field2921, var5, (class47) null);
                                                    }
                                                    if (var35.field2914 != null) {
                                                        var35.field2914.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var35.field2916 - class31.field533, var35.field2924 - class203.field3223, var35.field2925 - class236.field3717, var35.field2921, var5, (class47) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field4229;
                                            if (var36 != 0) {
                                                if (var3 < class151.field2419 && (var36 & 0x4) != 0) {
                                                    class272 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field4216) {
                                                        class228.field3640.method1493(-86, var37);
                                                    }
                                                }
                                                if (var4 < class301.field4744 && (var36 & 0x2) != 0) {
                                                    class272 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field4216) {
                                                        class228.field3640.method1493(-125, var38);
                                                    }
                                                }
                                                if (var3 > class151.field2419 && (var36 & 0x1) != 0) {
                                                    class272 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field4216) {
                                                        class228.field3640.method1493(-122, var39);
                                                    }
                                                }
                                                if (var4 > class301.field4744 && (var36 & 0x8) != 0) {
                                                    class272 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field4216) {
                                                        class228.field3640.method1493(-113, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4233 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field4220; var42++) {
                                                if (class94.field1531 != var2.field4217[var42].field781 && (var2.field4228[var42] & var2.field4233) == var2.field4231) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class189 var43 = var2.field4236;
                                                if (!class220.method1595(var6, var3, var4, var43.field2999)) {
                                                    if (class265.field4126) {
                                                        label882: {
                                                            if ((var43.field3008 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field3005 - class31.field533;
                                                                int var45 = var43.field3002 - class236.field3717;
                                                                int var46 = (int) (var43.field3008 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class196.field3122 - 1) {
                                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class323.field5009 - 1 && var4 < class196.field3122 - 1) {
                                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class323.field5009 - 1 && var4 > 0) {
                                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field2996.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var43.field3005 - class31.field533, var43.field3007 - class203.field3223, var43.field3002 - class236.field3717, var43.field3008, var5, (class47) null);
                                                }
                                                var2.field4233 = 0;
                                            }
                                        }
                                        if (!var2.field4234) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field4220;
                                            var2.field4234 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class45 var50 = var2.field4217[var49];
                                                if (class94.field1531 != var50.field781) {
                                                    for (int var51 = var50.field770; var51 <= var50.field785; var51++) {
                                                        for (int var52 = var50.field772; var52 <= var50.field784; var52++) {
                                                            class272 var53 = var7[var51][var52];
                                                            if (var53.field4232) {
                                                                var2.field4234 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field4233 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field770) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field785) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field772) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field784) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field4233) == var2.field4215) {
                                                                    var2.field4234 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class248.field3840[var48++] = var50;
                                                    int var55 = class151.field2419 - var50.field770;
                                                    int var56 = var50.field785 - class151.field2419;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class301.field4744 - var50.field772;
                                                    int var58 = var50.field784 - class301.field4744;
                                                    if (var58 > var57) {
                                                        var50.field768 = var55 + var58;
                                                    } else {
                                                        var50.field768 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class45 var62 = class248.field3840[var61];
                                                    if (class94.field1531 != var62.field781) {
                                                        if (var62.field768 > var59) {
                                                            var59 = var62.field768;
                                                            var60 = var61;
                                                        } else if (var62.field768 == var59) {
                                                            int var63 = var62.field775 - class31.field533;
                                                            int var64 = var62.field771 - class236.field3717;
                                                            int var65 = class248.field3840[var60].field775 - class31.field533;
                                                            int var66 = class248.field3840[var60].field771 - class236.field3717;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class45 var67 = class248.field3840[var60];
                                                var67.field781 = class94.field1531;
                                                if (!class263.method1872(var6, var67.field770, var67.field785, var67.field772, var67.field784, var67.field782.method207())) {
                                                    if (class265.field4126) {
                                                        if ((var67.field776 & 0xFC000L) == 147456L) {
                                                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                                                            int var68 = var67.field775 - class31.field533;
                                                            int var69 = var67.field771 - class236.field3717;
                                                            int var70 = (int) (var67.field776 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class38.method320(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class38.method320(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class38.method320(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class38.method320(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class38.method311(class31.field533, class203.field3223, class236.field3717, var5, var67.field770, var67.field772, var67.field785, var67.field784);
                                                        }
                                                    }
                                                    var67.field782.method203(var67.field783, class20.field371, class204.field3230, class249.field3849, class10.field170, var67.field775 - class31.field533, var67.field773 - class203.field3223, var67.field771 - class236.field3717, var67.field776, var5, (class47) null);
                                                }
                                                for (int var71 = var67.field770; var71 <= var67.field785; var71++) {
                                                    for (int var72 = var67.field772; var72 <= var67.field784; var72++) {
                                                        class272 var73 = var7[var71][var72];
                                                        if (var73.field4233 != 0) {
                                                            class228.field3640.method1493(-76, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field4216) {
                                                            class228.field3640.method1493(-107, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4234) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field4234 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4216);
                            } while (var2.field4233 != 0);
                            if (var3 > class151.field2419 || var3 <= class276.field4277) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field4216);
                        if (var3 < class151.field2419 || var3 >= class219.field3513 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field4216);
                    if (var4 > class301.field4744 || var4 <= class90.field1464) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field4216);
                if (var4 < class301.field4744 || var4 >= class110.field1821 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field4216);
            var2.field4216 = false;
            class226.field3618--;
            class183 var79 = var2.field4221;
            if (var79 != null && var79.field2926 != 0) {
                if (class265.field4126) {
                    class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                }
                if (var79.field2919 != null) {
                    var79.field2919.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var79.field2916 - class31.field533, var79.field2924 - class203.field3223 - var79.field2926, var79.field2925 - class236.field3717, var79.field2921, var5, (class47) null);
                }
                if (var79.field2927 != null) {
                    var79.field2927.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var79.field2916 - class31.field533, var79.field2924 - class203.field3223 - var79.field2926, var79.field2925 - class236.field3717, var79.field2921, var5, (class47) null);
                }
                if (var79.field2914 != null) {
                    var79.field2914.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var79.field2916 - class31.field533, var79.field2924 - class203.field3223 - var79.field2926, var79.field2925 - class236.field3717, var79.field2921, var5, (class47) null);
                }
            }
            if (var2.field4214 != 0) {
                class114 var80 = var2.field4219;
                if (var80 != null && !class6.method22(var6, var3, var4, var80.field1863.method207())) {
                    if ((var80.field1870 & var2.field4214) != 0) {
                        if (class265.field4126) {
                            class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                        }
                        var80.field1863.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var80.field1867 + var80.field1872 - class31.field533, var80.field1858 - class203.field3223, var80.field1868 + var80.field1864 - class236.field3717, var80.field1865, var5, (class47) null);
                    } else if (var80.field1870 == 256) {
                        int var81 = var80.field1867 - class31.field533;
                        int var82 = var80.field1858 - class203.field3223;
                        int var83 = var80.field1868 - class236.field3717;
                        int var84 = var80.field1859;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class265.field4126) {
                                class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                            }
                            var80.field1863.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var80.field1872 + var81, var82, var80.field1864 + var83, var80.field1865, var5, (class47) null);
                        } else if (var80.field1860 != null) {
                            if (class265.field4126) {
                                class38.method321(class31.field533, class203.field3223, class236.field3717, var5, var3, var4);
                            }
                            var80.field1860.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var81, var82, var83, var80.field1865, var5, (class47) null);
                        }
                    }
                }
                class189 var87 = var2.field4236;
                if (var87 != null) {
                    if ((var87.field3009 & var2.field4214) != 0 && !class220.method1595(var6, var3, var4, var87.field3009)) {
                        if (class265.field4126) {
                            class38.method309(var87.field3009, class31.field533, class203.field3223, class236.field3717, var6, var3, var4);
                        }
                        var87.field2998.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var87.field3005 - class31.field533, var87.field3007 - class203.field3223, var87.field3002 - class236.field3717, var87.field3008, var5, (class47) null);
                    }
                    if ((var87.field2999 & var2.field4214) != 0 && !class220.method1595(var6, var3, var4, var87.field2999)) {
                        if (class265.field4126) {
                            class38.method309(var87.field2999, class31.field533, class203.field3223, class236.field3717, var6, var3, var4);
                        }
                        var87.field2996.method203(0, class20.field371, class204.field3230, class249.field3849, class10.field170, var87.field3005 - class31.field533, var87.field3007 - class203.field3223, var87.field3002 - class236.field3717, var87.field3008, var5, (class47) null);
                    }
                }
            }
            if (var5 < class203.field3189 - 1) {
                class272 var88 = class60.field946[var5 + 1][var3][var4];
                if (var88 != null && var88.field4216) {
                    class228.field3640.method1493(-105, var88);
                }
            }
            if (var3 < class151.field2419) {
                class272 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field4216) {
                    class228.field3640.method1493(-71, var89);
                }
            }
            if (var4 < class301.field4744) {
                class272 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field4216) {
                    class228.field3640.method1493(-102, var90);
                }
            }
            if (var3 > class151.field2419) {
                class272 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field4216) {
                    class228.field3640.method1493(-98, var91);
                }
            }
            if (var4 > class301.field4744) {
                class272 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field4216) {
                    class228.field3640.method1493(-113, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIII)I", line = 999)
    public static final int method1319(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = 42 % ((arg3 - 53) / 51);
        class62 var5 = (class62) class42.field748.method833(false, (long) arg1);
        field2782++;
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field961.length; var7++) {
            if (var5.field961[var7] >= 0 && var5.field961[var7] < class134.field2122) {
                class179 var8 = class208.method1521(-1361, var5.field961[var7]);
                if (var8.field2798 != null) {
                    class250 var9 = (class250) var8.field2798.method833(false, (long) arg2);
                    if (var9 != null) {
                        if (arg0) {
                            var6 += var5.field963[var7] * var9.field3858;
                        } else {
                            var6 += var9.field3858;
                        }
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lob;IB)I", line = 1046)
    public static final int method1320(class292 arg0, int arg1, byte arg2) {
        field2783++;
        if (arg0.field4556 == null || arg0.field4556.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4556[arg1];
            int var4 = 0;
            if (arg2 != -81) {
                return -67;
            }
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class31.field526[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class260.field4035[var3[var4++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class252.field3883[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class292 var12 = class215.method1555((byte) -48, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class208.method1521(-1361, var13).field2803 || class295.field4672)) {
                        for (int var14 = 0; var14 < var12.field4439.length; var14++) {
                            if ((var13 + 1) == var12.field4439[var14]) {
                                var8 += var12.field4480[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class278.field4304[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class48.field795[class260.field4035[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class278.field4304[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class19.field356.field481;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class320.field4992[var15]) {
                            var8 += class260.field4035[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class292 var18 = class215.method1555((byte) -48, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class208.method1521(arg2 ^ 0x500, var19).field2803 || class295.field4672)) {
                        for (int var20 = 0; var20 < var18.field4439.length; var20++) {
                            if ((var19 + 1) == var18.field4439[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class33.field553;
                }
                if (var7 == 12) {
                    var8 = class9.field136;
                }
                if (var7 == 13) {
                    int var21 = class278.field4304[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class54.method397((byte) 18, var23);
                }
                if (var7 == 18) {
                    var8 = (class19.field356.field1442 >> 7) + class177.field2780;
                }
                if (var7 == 19) {
                    var8 = (class19.field356.field1369 >> 7) + class91.field1485;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILja;I)[Lbh;", line = 1257)
    public static final class274[] method1321(int arg0, int arg1, class64 arg2, int arg3) {
        field2789++;
        if (arg0 != -1) {
            method1319(true, 119, 115, -10);
        }
        return class150.method1152(arg2, arg3, 50, arg1) ? class205.method1497((byte) -111) : null;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 1277)
    public static void method1322(int arg0) {
        field2788 = null;
        field2790 = null;
        field2786 = null;
        field2785 = null;
        field2787 = null;
        if (arg0 != 1) {
            method1320((class292) null, -115, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1293)
    public static final void method1323(int arg0, String arg1) {
        if (arg0 < 96) {
            field2787 = (class64) null;
        }
        field2781++;
        int var2 = class226.method1633(-108, arg1);
        if (var2 != -1) {
            class228.method1653(true, class43.field763.field3139[var2], class43.field763.field3137[var2]);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(II)V", line = 1307)
    public class178(int arg0, int arg1) {
        this.field2784 = arg0;
        this.field2791 = arg1;
    }
}
