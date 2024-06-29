import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class21 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lna;")
    public static class26 field289 = class69.method505("blinken2:", (byte) -125);

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lna;")
    private static class26 field302 = class69.method505("Loading textures )2 ", (byte) -124);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lna;")
    public static class26 field293 = field302;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[Lpe;")
    public static class101[] field296;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 5)
    public static void method134(byte arg0) {
        field293 = null;
        field289 = null;
        field296 = null;
        field302 = null;
        if (arg0 <= 1) {
            method138(112, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)V", line = 22)
    public static final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class225.field3572 <= arg1 && class27.field454 >= arg3 && class80.field1259 <= arg2 && arg4 <= class117.field1840) {
            if (arg5 == 1) {
                class14.method108(arg0, arg3, arg2, (byte) 34, arg4, arg1);
            } else {
                class150.method1023(arg6 - 19617, arg3, arg2, arg0, arg4, arg5, arg1);
            }
        } else if (arg5 == 1) {
            class13.method96(arg0, arg1, arg4, arg3, arg2, (byte) 29);
        } else {
            class320.method2228(arg4, arg5, arg3, arg1, 1, arg0, arg2);
        }
        if (arg6 != -2) {
            method138(89, (byte) -73);
        }
        field291++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lbj;Z)V", line = 52)
    public static final void method136(class55 arg0, boolean arg1) {
        class205.field3207.method257(true, arg0);
        while (true) {
            class55 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class55[][] var7;
            class55 var78;
            do {
                class55 var77;
                do {
                    class55 var76;
                    do {
                        class55 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class55) class205.field3207.method262((byte) -3);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field881);
                                            var3 = var2.field895;
                                            var4 = var2.field887;
                                            var5 = var2.field900;
                                            var6 = var2.field894;
                                            var7 = class36.field585[var5];
                                            float var8 = 0.0F;
                                            if (class255.field4184) {
                                                if (class8.field96 == class229.field3635) {
                                                    int var9 = class245.field4028[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class285.field4795 != var10) {
                                                        class285.field4795 = var10;
                                                        class63.method478((byte) 56, var10);
                                                        class289.method2037(class149.method1018((byte) -50));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class310.field5332 != var11) {
                                                        class310.field5332 = var11;
                                                        class23.method144(var11, 121);
                                                    }
                                                    int var12 = class258.field4209[0][var3 + 1][var4] + class258.field4209[0][var3][var4] + class258.field4209[0][var3][var4 + 1] + class258.field4209[0][var3 + 1][var4 + 1] >> 2;
                                                    class281.method1973(0, -var12, 3);
                                                    var8 = 201.5F;
                                                    class255.method1772(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class255.method1772(var8);
                                                }
                                            }
                                            if (!var2.field878) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class55 var13 = class36.field585[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field881) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class314.field5377 && var3 > class139.field2121) {
                                                    class55 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field881 && (var14.field878 || (var2.field884 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class314.field5377 && var3 < class9.field114 - 1) {
                                                    class55 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field881 && (var15.field878 || (var2.field884 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class309.field5315 && var4 > class8.field94) {
                                                    class55 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field881 && (var16.field878 || (var2.field884 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class309.field5315 && var4 < class136.field2079 - 1) {
                                                    class55 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field881 && (var17.field878 || (var2.field884 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field878 = false;
                                            if (var2.field891 != null) {
                                                class55 var18 = var2.field891;
                                                if (class255.field4184) {
                                                    class255.method1772(201.5F - (float) (var18.field894 + 1) * 50.0F);
                                                }
                                                if (var18.field896 == null) {
                                                    if (var18.field882 != null) {
                                                        if (class321.method2239(0, var3, var4)) {
                                                            class23.method145(var18.field882, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, true);
                                                        } else {
                                                            class23.method145(var18.field882, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class321.method2239(0, var3, var4)) {
                                                    class113.method791(var18.field896, 0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, true);
                                                } else {
                                                    class113.method791(var18.field896, 0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, false);
                                                }
                                                class267 var19 = var18.field890;
                                                if (var19 != null) {
                                                    if (class255.field4184) {
                                                        if ((var19.field4416 & var2.field897) == 0) {
                                                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                        } else {
                                                            class226.method1500(var19.field4416, class50.field794, class133.field2019, class18.field255, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field4409.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var19.field4415 - class50.field794, var19.field4419 - class133.field2019, var19.field4405 - class18.field255, var19.field4408, var5, (class19) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field879; var20++) {
                                                    class39 var21 = var18.field877[var20];
                                                    if (var21 != null) {
                                                        if (class255.field4184) {
                                                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                        }
                                                        var21.field632.method676(var21.field653, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var21.field635 - class50.field794, var21.field644 - class133.field2019, var21.field639 - class18.field255, var21.field656, var5, (class19) null);
                                                    }
                                                }
                                                if (class255.field4184) {
                                                    class255.method1772(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field896 == null) {
                                                if (var2.field882 != null) {
                                                    if (class321.method2239(var6, var3, var4)) {
                                                        class23.method145(var2.field882, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class23.method145(var2.field882, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, false);
                                                    }
                                                }
                                            } else if (class321.method2239(var6, var3, var4)) {
                                                class113.method791(var2.field896, var6, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field896.field2078 != 12345678 || class135.field2063 && var5 <= class228.field3601) {
                                                    class113.method791(var2.field896, var6, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class137 var23 = var2.field886;
                                                if (var23 != null && (var23.field2105 & 0x80000000L) != 0L) {
                                                    if (class255.field4184 && var23.field2106) {
                                                        class255.method1772(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class255.field4184) {
                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                    }
                                                    var23.field2095.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var23.field2099 - class50.field794, var23.field2101 - class133.field2019, var23.field2107 - class18.field255, var23.field2105, var5, (class19) null);
                                                    if (class255.field4184 && var23.field2106) {
                                                        class255.method1772(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class267 var26 = var2.field890;
                                            class164 var27 = var2.field889;
                                            if (var26 != null || var27 != null) {
                                                if (class314.field5377 == var3) {
                                                    var24++;
                                                } else if (class314.field5377 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class309.field5315 == var4) {
                                                    var24 += 3;
                                                } else if (class309.field5315 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class324.field5591[var24];
                                                var2.field897 = class201.field3120[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field4416 & class35.field576[var24]) == 0) {
                                                    var2.field883 = 0;
                                                } else if (var26.field4416 == 16) {
                                                    var2.field883 = 3;
                                                    var2.field885 = class188.field2965[var24];
                                                    var2.field888 = 3 - var2.field885;
                                                } else if (var26.field4416 == 32) {
                                                    var2.field883 = 6;
                                                    var2.field885 = class141.field2152[var24];
                                                    var2.field888 = 6 - var2.field885;
                                                } else if (var26.field4416 == 64) {
                                                    var2.field883 = 12;
                                                    var2.field885 = class292.field4868[var24];
                                                    var2.field888 = 12 - var2.field885;
                                                } else {
                                                    var2.field883 = 9;
                                                    var2.field885 = class76.field1153[var24];
                                                    var2.field888 = 9 - var2.field885;
                                                }
                                                if ((var26.field4416 & var25) != 0 && !class134.method907(var6, var3, var4, var26.field4416)) {
                                                    if (class255.field4184) {
                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                    }
                                                    var26.field4409.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var26.field4415 - class50.field794, var26.field4419 - class133.field2019, var26.field4405 - class18.field255, var26.field4408, var5, (class19) null);
                                                }
                                                if ((var26.field4421 & var25) != 0 && !class134.method907(var6, var3, var4, var26.field4421)) {
                                                    if (class255.field4184) {
                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                    }
                                                    var26.field4412.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var26.field4415 - class50.field794, var26.field4419 - class133.field2019, var26.field4405 - class18.field255, var26.field4408, var5, (class19) null);
                                                }
                                            }
                                            if (var27 != null && !class10.method65(var6, var3, var4, var27.field2550.method679())) {
                                                if (class255.field4184) {
                                                    class255.method1772(var8 - 0.5F);
                                                }
                                                if ((var27.field2553 & var25) != 0) {
                                                    if (class255.field4184) {
                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                    }
                                                    var27.field2550.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var27.field2545 + var27.field2551 - class50.field794, var27.field2546 - class133.field2019, var27.field2548 + var27.field2547 - class18.field255, var27.field2549, var5, (class19) null);
                                                } else if (var27.field2553 == 256) {
                                                    int var28 = var27.field2545 - class50.field794;
                                                    int var29 = var27.field2546 - class133.field2019;
                                                    int var30 = var27.field2548 - class18.field255;
                                                    int var31 = var27.field2541;
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
                                                        if (class255.field4184) {
                                                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                        }
                                                        var27.field2550.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var27.field2551 + var28, var29, var27.field2547 + var30, var27.field2549, var5, (class19) null);
                                                    } else if (var27.field2544 != null) {
                                                        if (class255.field4184) {
                                                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                        }
                                                        var27.field2544.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var28, var29, var30, var27.field2549, var5, (class19) null);
                                                    }
                                                }
                                                if (class255.field4184) {
                                                    class255.method1772(var8);
                                                }
                                            }
                                            if (var22) {
                                                class137 var34 = var2.field886;
                                                if (var34 != null && (var34.field2105 & 0x80000000L) == 0L) {
                                                    if (class255.field4184 && var34.field2106) {
                                                        class255.method1772(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class255.field4184) {
                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                    }
                                                    var34.field2095.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var34.field2099 - class50.field794, var34.field2101 - class133.field2019, var34.field2107 - class18.field255, var34.field2105, var5, (class19) null);
                                                    if (class255.field4184 && var34.field2106) {
                                                        class255.method1772(var8);
                                                    }
                                                }
                                                class149 var35 = var2.field901;
                                                if (var35 != null && var35.field2336 == 0) {
                                                    if (class255.field4184) {
                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                    }
                                                    if (var35.field2323 != null) {
                                                        var35.field2323.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var35.field2337 - class50.field794, var35.field2324 - class133.field2019, var35.field2333 - class18.field255, var35.field2340, var5, (class19) null);
                                                    }
                                                    if (var35.field2325 != null) {
                                                        var35.field2325.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var35.field2337 - class50.field794, var35.field2324 - class133.field2019, var35.field2333 - class18.field255, var35.field2340, var5, (class19) null);
                                                    }
                                                    if (var35.field2330 != null) {
                                                        var35.field2330.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var35.field2337 - class50.field794, var35.field2324 - class133.field2019, var35.field2333 - class18.field255, var35.field2340, var5, (class19) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field884;
                                            if (var36 != 0) {
                                                if (var3 < class314.field5377 && (var36 & 0x4) != 0) {
                                                    class55 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field881) {
                                                        class205.field3207.method257(true, var37);
                                                    }
                                                }
                                                if (var4 < class309.field5315 && (var36 & 0x2) != 0) {
                                                    class55 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field881) {
                                                        class205.field3207.method257(true, var38);
                                                    }
                                                }
                                                if (var3 > class314.field5377 && (var36 & 0x1) != 0) {
                                                    class55 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field881) {
                                                        class205.field3207.method257(true, var39);
                                                    }
                                                }
                                                if (var4 > class309.field5315 && (var36 & 0x8) != 0) {
                                                    class55 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field881) {
                                                        class205.field3207.method257(true, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field883 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field879; var42++) {
                                                if (class118.field1863 != var2.field877[var42].field645 && (var2.field893[var42] & var2.field883) == var2.field885) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class267 var43 = var2.field890;
                                                if (!class134.method907(var6, var3, var4, var43.field4416)) {
                                                    if (class255.field4184) {
                                                        label882: {
                                                            if ((var43.field4408 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field4415 - class50.field794;
                                                                int var45 = var43.field4405 - class18.field255;
                                                                int var46 = (int) (var43.field4408 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class303.field5221 - 1) {
                                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class285.field4778 - 1 && var4 < class303.field5221 - 1) {
                                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class285.field4778 - 1 && var4 > 0) {
                                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field4409.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var43.field4415 - class50.field794, var43.field4419 - class133.field2019, var43.field4405 - class18.field255, var43.field4408, var5, (class19) null);
                                                }
                                                var2.field883 = 0;
                                            }
                                        }
                                        if (!var2.field892) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field879;
                                            var2.field892 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class39 var50 = var2.field877[var49];
                                                if (class118.field1863 != var50.field645) {
                                                    for (int var51 = var50.field637; var51 <= var50.field652; var51++) {
                                                        for (int var52 = var50.field630; var52 <= var50.field634; var52++) {
                                                            class55 var53 = var7[var51][var52];
                                                            if (var53.field878) {
                                                                var2.field892 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field883 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field637) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field652) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field630) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field634) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field883) == var2.field888) {
                                                                    var2.field892 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class304.field5240[var48++] = var50;
                                                    int var55 = class314.field5377 - var50.field637;
                                                    int var56 = var50.field652 - class314.field5377;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class309.field5315 - var50.field630;
                                                    int var58 = var50.field634 - class309.field5315;
                                                    if (var58 > var57) {
                                                        var50.field642 = var55 + var58;
                                                    } else {
                                                        var50.field642 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class39 var62 = class304.field5240[var61];
                                                    if (class118.field1863 != var62.field645) {
                                                        if (var62.field642 > var59) {
                                                            var59 = var62.field642;
                                                            var60 = var61;
                                                        } else if (var62.field642 == var59) {
                                                            int var63 = var62.field635 - class50.field794;
                                                            int var64 = var62.field639 - class18.field255;
                                                            int var65 = class304.field5240[var60].field635 - class50.field794;
                                                            int var66 = class304.field5240[var60].field639 - class18.field255;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class39 var67 = class304.field5240[var60];
                                                var67.field645 = class118.field1863;
                                                if (!class46.method353(var6, var67.field637, var67.field652, var67.field630, var67.field634, var67.field632.method679())) {
                                                    if (class255.field4184) {
                                                        if ((var67.field656 & 0xFC000L) == 147456L) {
                                                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                                                            int var68 = var67.field635 - class50.field794;
                                                            int var69 = var67.field639 - class18.field255;
                                                            int var70 = (int) (var67.field656 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class226.method1509(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class226.method1509(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class226.method1509(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class226.method1509(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class226.method1503(class50.field794, class133.field2019, class18.field255, var5, var67.field637, var67.field630, var67.field652, var67.field634);
                                                        }
                                                    }
                                                    var67.field632.method676(var67.field653, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var67.field635 - class50.field794, var67.field644 - class133.field2019, var67.field639 - class18.field255, var67.field656, var5, (class19) null);
                                                }
                                                for (int var71 = var67.field637; var71 <= var67.field652; var71++) {
                                                    for (int var72 = var67.field630; var72 <= var67.field634; var72++) {
                                                        class55 var73 = var7[var71][var72];
                                                        if (var73.field883 != 0) {
                                                            class205.field3207.method257(true, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field881) {
                                                            class205.field3207.method257(true, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field892) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field892 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field881);
                            } while (var2.field883 != 0);
                            if (var3 > class314.field5377 || var3 <= class139.field2121) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field881);
                        if (var3 < class314.field5377 || var3 >= class9.field114 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field881);
                    if (var4 > class309.field5315 || var4 <= class8.field94) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field881);
                if (var4 < class309.field5315 || var4 >= class136.field2079 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field881);
            var2.field881 = false;
            class325.field5619--;
            class149 var79 = var2.field901;
            if (var79 != null && var79.field2336 != 0) {
                if (class255.field4184) {
                    class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                }
                if (var79.field2323 != null) {
                    var79.field2323.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var79.field2337 - class50.field794, var79.field2324 - class133.field2019 - var79.field2336, var79.field2333 - class18.field255, var79.field2340, var5, (class19) null);
                }
                if (var79.field2325 != null) {
                    var79.field2325.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var79.field2337 - class50.field794, var79.field2324 - class133.field2019 - var79.field2336, var79.field2333 - class18.field255, var79.field2340, var5, (class19) null);
                }
                if (var79.field2330 != null) {
                    var79.field2330.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var79.field2337 - class50.field794, var79.field2324 - class133.field2019 - var79.field2336, var79.field2333 - class18.field255, var79.field2340, var5, (class19) null);
                }
            }
            if (var2.field897 != 0) {
                class164 var80 = var2.field889;
                if (var80 != null && !class10.method65(var6, var3, var4, var80.field2550.method679())) {
                    if ((var80.field2553 & var2.field897) != 0) {
                        if (class255.field4184) {
                            class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                        }
                        var80.field2550.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var80.field2545 + var80.field2551 - class50.field794, var80.field2546 - class133.field2019, var80.field2548 + var80.field2547 - class18.field255, var80.field2549, var5, (class19) null);
                    } else if (var80.field2553 == 256) {
                        int var81 = var80.field2545 - class50.field794;
                        int var82 = var80.field2546 - class133.field2019;
                        int var83 = var80.field2548 - class18.field255;
                        int var84 = var80.field2541;
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
                            if (class255.field4184) {
                                class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                            }
                            var80.field2550.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var80.field2551 + var81, var82, var80.field2547 + var83, var80.field2549, var5, (class19) null);
                        } else if (var80.field2544 != null) {
                            if (class255.field4184) {
                                class226.method1505(class50.field794, class133.field2019, class18.field255, var5, var3, var4);
                            }
                            var80.field2544.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var81, var82, var83, var80.field2549, var5, (class19) null);
                        }
                    }
                }
                class267 var87 = var2.field890;
                if (var87 != null) {
                    if ((var87.field4421 & var2.field897) != 0 && !class134.method907(var6, var3, var4, var87.field4421)) {
                        if (class255.field4184) {
                            class226.method1500(var87.field4421, class50.field794, class133.field2019, class18.field255, var6, var3, var4);
                        }
                        var87.field4412.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var87.field4415 - class50.field794, var87.field4419 - class133.field2019, var87.field4405 - class18.field255, var87.field4408, var5, (class19) null);
                    }
                    if ((var87.field4416 & var2.field897) != 0 && !class134.method907(var6, var3, var4, var87.field4416)) {
                        if (class255.field4184) {
                            class226.method1500(var87.field4416, class50.field794, class133.field2019, class18.field255, var6, var3, var4);
                        }
                        var87.field4409.method676(0, class177.field2789, class299.field5142, class126.field1957, class72.field1111, var87.field4415 - class50.field794, var87.field4419 - class133.field2019, var87.field4405 - class18.field255, var87.field4408, var5, (class19) null);
                    }
                }
            }
            if (var5 < class235.field3723 - 1) {
                class55 var88 = class36.field585[var5 + 1][var3][var4];
                if (var88 != null && var88.field881) {
                    class205.field3207.method257(true, var88);
                }
            }
            if (var3 < class314.field5377) {
                class55 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field881) {
                    class205.field3207.method257(true, var89);
                }
            }
            if (var4 < class309.field5315) {
                class55 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field881) {
                    class205.field3207.method257(true, var90);
                }
            }
            if (var3 > class314.field5377) {
                class55 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field881) {
                    class205.field3207.method257(true, var91);
                }
            }
            if (var4 > class309.field5315) {
                class55 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field881) {
                    class205.field3207.method257(true, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIIIII)V", line = 1041)
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field297++;
        class297 var7 = class148.method1011((byte) -19, arg0, arg1);
        if (var7 != null && var7.field5006 != null) {
            class263 var8 = new class263();
            var8.field4307 = var7;
            var8.field4306 = var7.field5006;
            class215.method1442(1073376993, var8);
        }
        class297.field5087 = arg1;
        class299.field5143 = arg3;
        if (arg5 >= -110) {
            return;
        }
        class29.field501 = arg0;
        class58.field940 = arg2;
        class86.field1420 = true;
        class254.field4158 = arg4;
        class132.field2013 = arg6;
        class318.method2209(126, var7);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)I", line = 1073)
    public static final int method138(int arg0, byte arg1) {
        int var2 = 110 / ((arg1 - 34) / 61);
        field303++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Leh;", line = 1085)
    public static final class167 method139(int arg0, int arg1) {
        field299++;
        class167 var2 = (class167) class157.field2447.method1989((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field1112.method1889(16, (byte) -122, arg1);
        if (arg0 > -4) {
            return (class167) null;
        }
        class167 var4 = new class167();
        if (var3 != null) {
            var4.method1130(-20638, new class82(var3));
        }
        class157.field2447.method1978((byte) -108, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 1115)
    public static final void method140(boolean arg0) {
        class174.field2723.method1987(3);
        field304++;
        if (!arg0) {
            field302 = (class26) null;
        }
        class322.field5528.method1987(3);
    }
}
