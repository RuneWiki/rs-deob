import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class190 extends class110 {

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3677 = 0;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[I")
    public static int[] field3680 = new int[200];

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3683 = -2;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Leh;")
    public static class47 field3678 = class195.method1282((byte) -4, "(Y<)4col>");

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Lgf;")
    public static class61 field3684;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public static final void method1249(int arg0) {
        field3681++;
        class103 var1 = class160.field3105;
        synchronized (class160.field3105) {
            class156.field3054 = class31.field590;
            class84.field1788 = class120.field2433;
            class41.field814 = class83.field1769;
            class100.field2105 = class178.field3406;
            class3.field29 = class141.field2757;
            class185.field3546 = class84.field1786;
            class193.field3752 = class99.field2099;
            class178.field3406 = arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lqh;Z)V")
    public static final void method1250(class152 arg0, boolean arg1) {
        class155.field3046.method337(arg0, (byte) -22);
        while (true) {
            class152 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class152[][] var7;
            class152 var65;
            do {
                class152 var64;
                do {
                    class152 var63;
                    do {
                        class152 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class152) class155.field3046.method342(8292);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3000);
                                            var3 = var2.field2978;
                                            var4 = var2.field2980;
                                            var5 = var2.field2983;
                                            var6 = var2.field2999;
                                            var7 = class173.field3351[var5];
                                            if (!var2.field2977) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class152 var8 = class173.field3351[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3000) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class166.field3221 && var3 > class57.field1122) {
                                                    class152 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3000 && (var9.field2977 || (var2.field2993 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class166.field3221 && var3 < class44.field886 - 1) {
                                                    class152 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3000 && (var10.field2977 || (var2.field2993 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class55.field1056 && var4 > class146.field2865) {
                                                    class152 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3000 && (var11.field2977 || (var2.field2993 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class55.field1056 && var4 < class204.field4024 - 1) {
                                                    class152 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3000 && (var12.field2977 || (var2.field2993 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2977 = false;
                                            if (var2.field2982 != null) {
                                                class152 var13 = var2.field2982;
                                                if (var13.field2973 == null) {
                                                    if (var13.field2994 != null && !class108.method873(0, var3, var4)) {
                                                        class52.method456(var13.field2994, class193.field3753, class149.field2918, class44.field882, class162.field3150, var3, var4);
                                                    }
                                                } else if (!class108.method873(0, var3, var4)) {
                                                    class37.method313(var13.field2973, 0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var3, var4);
                                                }
                                                class44 var14 = var13.field2991;
                                                if (var14 != null) {
                                                    var14.field876.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var14.field887 - class40.field790, var14.field880 - class144.field2828, var14.field883 - class87.field1866, var14.field874);
                                                }
                                                for (int var15 = 0; var15 < var13.field2975; var15++) {
                                                    class60 var16 = var13.field2979[var15];
                                                    if (var16 != null) {
                                                        var16.field1150.method45(var16.field1159, class193.field3753, class149.field2918, class44.field882, class162.field3150, var16.field1152 - class40.field790, var16.field1162 - class144.field2828, var16.field1161 - class87.field1866, var16.field1157);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2973 == null) {
                                                if (var2.field2994 != null && !class108.method873(var6, var3, var4)) {
                                                    var17 = true;
                                                    class52.method456(var2.field2994, class193.field3753, class149.field2918, class44.field882, class162.field3150, var3, var4);
                                                }
                                            } else if (!class108.method873(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field2973.field4049 != 12345678 || class188.field3644 && var5 <= class64.field1393) {
                                                    class37.method313(var2.field2973, var6, class193.field3753, class149.field2918, class44.field882, class162.field3150, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class44 var20 = var2.field2991;
                                            class117 var21 = var2.field2990;
                                            if (var20 != null || var21 != null) {
                                                if (class166.field3221 == var3) {
                                                    var18++;
                                                } else if (class166.field3221 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class55.field1056 == var4) {
                                                    var18 += 3;
                                                } else if (class55.field1056 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class32.field621[var18];
                                                var2.field2972 = class39.field771[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field888 & class162.field3164[var18]) == 0) {
                                                    var2.field2997 = 0;
                                                } else if (var20.field888 == 16) {
                                                    var2.field2997 = 3;
                                                    var2.field2981 = class186.field3568[var18];
                                                    var2.field2976 = 3 - var2.field2981;
                                                } else if (var20.field888 == 32) {
                                                    var2.field2997 = 6;
                                                    var2.field2981 = class180.field3448[var18];
                                                    var2.field2976 = 6 - var2.field2981;
                                                } else if (var20.field888 == 64) {
                                                    var2.field2997 = 12;
                                                    var2.field2981 = class176.field3372[var18];
                                                    var2.field2976 = 12 - var2.field2981;
                                                } else {
                                                    var2.field2997 = 9;
                                                    var2.field2981 = class109.field2271[var18];
                                                    var2.field2976 = 9 - var2.field2981;
                                                }
                                                if ((var20.field888 & var19) != 0 && !class3.method14(var6, var3, var4, var20.field888)) {
                                                    var20.field876.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var20.field887 - class40.field790, var20.field880 - class144.field2828, var20.field883 - class87.field1866, var20.field874);
                                                }
                                                if ((var20.field884 & var19) != 0 && !class3.method14(var6, var3, var4, var20.field884)) {
                                                    var20.field878.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var20.field887 - class40.field790, var20.field880 - class144.field2828, var20.field883 - class87.field1866, var20.field874);
                                                }
                                            }
                                            if (var21 != null && !class70.method626(var6, var3, var4, var21.field2374.field1928)) {
                                                if ((var21.field2368 & var19) != 0) {
                                                    var21.field2374.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var21.field2383 + var21.field2375 - class40.field790, var21.field2386 - class144.field2828, var21.field2376 + var21.field2378 - class87.field1866, var21.field2370);
                                                } else if (var21.field2368 == 256) {
                                                    int var22 = var21.field2383 - class40.field790;
                                                    int var23 = var21.field2386 - class144.field2828;
                                                    int var24 = var21.field2376 - class87.field1866;
                                                    int var25 = var21.field2387;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field2374.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var21.field2375 + var22, var23, var21.field2378 + var24, var21.field2370);
                                                    } else if (var21.field2380 != null) {
                                                        var21.field2380.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var22, var23, var24, var21.field2370);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class200 var28 = var2.field2989;
                                                if (var28 != null) {
                                                    var28.field3894.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var28.field3899 - class40.field790, var28.field3900 - class144.field2828, var28.field3898 - class87.field1866, var28.field3895);
                                                }
                                                class64 var29 = var2.field3001;
                                                if (var29 != null && var29.field1409 == 0) {
                                                    if (var29.field1401 != null) {
                                                        var29.field1401.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var29.field1392 - class40.field790, var29.field1404 - class144.field2828, var29.field1394 - class87.field1866, var29.field1396);
                                                    }
                                                    if (var29.field1410 != null) {
                                                        var29.field1410.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var29.field1392 - class40.field790, var29.field1404 - class144.field2828, var29.field1394 - class87.field1866, var29.field1396);
                                                    }
                                                    if (var29.field1397 != null) {
                                                        var29.field1397.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var29.field1392 - class40.field790, var29.field1404 - class144.field2828, var29.field1394 - class87.field1866, var29.field1396);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field2993;
                                            if (var30 != 0) {
                                                if (var3 < class166.field3221 && (var30 & 0x4) != 0) {
                                                    class152 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field3000) {
                                                        class155.field3046.method337(var31, (byte) -22);
                                                    }
                                                }
                                                if (var4 < class55.field1056 && (var30 & 0x2) != 0) {
                                                    class152 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field3000) {
                                                        class155.field3046.method337(var32, (byte) -22);
                                                    }
                                                }
                                                if (var3 > class166.field3221 && (var30 & 0x1) != 0) {
                                                    class152 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field3000) {
                                                        class155.field3046.method337(var33, (byte) -22);
                                                    }
                                                }
                                                if (var4 > class55.field1056 && (var30 & 0x8) != 0) {
                                                    class152 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field3000) {
                                                        class155.field3046.method337(var34, (byte) -22);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2997 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field2975; var36++) {
                                                if (class44.field893 != var2.field2979[var36].field1151 && (var2.field2986[var36] & var2.field2997) == var2.field2981) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class44 var37 = var2.field2991;
                                                if (!class3.method14(var6, var3, var4, var37.field888)) {
                                                    var37.field876.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var37.field887 - class40.field790, var37.field880 - class144.field2828, var37.field883 - class87.field1866, var37.field874);
                                                }
                                                var2.field2997 = 0;
                                            }
                                        }
                                        if (!var2.field2985) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field2975;
                                            var2.field2985 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class60 var41 = var2.field2979[var40];
                                                if (class44.field893 != var41.field1151) {
                                                    for (int var42 = var41.field1172; var42 <= var41.field1153; var42++) {
                                                        for (int var43 = var41.field1170; var43 <= var41.field1168; var43++) {
                                                            class152 var44 = var7[var42][var43];
                                                            if (var44.field2977) {
                                                                var2.field2985 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field2997 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field1172) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field1153) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field1170) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field1168) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field2997) == var2.field2976) {
                                                                    var2.field2985 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class147.field2883[var39++] = var41;
                                                    int var46 = class166.field3221 - var41.field1172;
                                                    int var47 = var41.field1153 - class166.field3221;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class55.field1056 - var41.field1170;
                                                    int var49 = var41.field1168 - class55.field1056;
                                                    if (var49 > var48) {
                                                        var41.field1173 = var46 + var49;
                                                    } else {
                                                        var41.field1173 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class60 var53 = class147.field2883[var52];
                                                    if (class44.field893 != var53.field1151) {
                                                        if (var53.field1173 > var50) {
                                                            var50 = var53.field1173;
                                                            var51 = var52;
                                                        } else if (var53.field1173 == var50) {
                                                            int var54 = var53.field1152 - class40.field790;
                                                            int var55 = var53.field1161 - class87.field1866;
                                                            int var56 = class147.field2883[var51].field1152 - class40.field790;
                                                            int var57 = class147.field2883[var51].field1161 - class87.field1866;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class60 var58 = class147.field2883[var51];
                                                var58.field1151 = class44.field893;
                                                if (!class107.method868(var6, var58.field1172, var58.field1153, var58.field1170, var58.field1168, var58.field1150.field1928)) {
                                                    var58.field1150.method45(var58.field1159, class193.field3753, class149.field2918, class44.field882, class162.field3150, var58.field1152 - class40.field790, var58.field1162 - class144.field2828, var58.field1161 - class87.field1866, var58.field1157);
                                                }
                                                for (int var59 = var58.field1172; var59 <= var58.field1153; var59++) {
                                                    for (int var60 = var58.field1170; var60 <= var58.field1168; var60++) {
                                                        class152 var61 = var7[var59][var60];
                                                        if (var61.field2997 != 0) {
                                                            class155.field3046.method337(var61, (byte) -22);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field3000) {
                                                            class155.field3046.method337(var61, (byte) -22);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2985) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field2985 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3000);
                            } while (var2.field2997 != 0);
                            if (var3 > class166.field3221 || var3 <= class57.field1122) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field3000);
                        if (var3 < class166.field3221 || var3 >= class44.field886 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field3000);
                    if (var4 > class55.field1056 || var4 <= class146.field2865) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field3000);
                if (var4 < class55.field1056 || var4 >= class204.field4024 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field3000);
            var2.field3000 = false;
            class174.field3366--;
            class64 var66 = var2.field3001;
            if (var66 != null && var66.field1409 != 0) {
                if (var66.field1401 != null) {
                    var66.field1401.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var66.field1392 - class40.field790, var66.field1404 - class144.field2828 - var66.field1409, var66.field1394 - class87.field1866, var66.field1396);
                }
                if (var66.field1410 != null) {
                    var66.field1410.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var66.field1392 - class40.field790, var66.field1404 - class144.field2828 - var66.field1409, var66.field1394 - class87.field1866, var66.field1396);
                }
                if (var66.field1397 != null) {
                    var66.field1397.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var66.field1392 - class40.field790, var66.field1404 - class144.field2828 - var66.field1409, var66.field1394 - class87.field1866, var66.field1396);
                }
            }
            if (var2.field2972 != 0) {
                class117 var67 = var2.field2990;
                if (var67 != null && !class70.method626(var6, var3, var4, var67.field2374.field1928)) {
                    if ((var67.field2368 & var2.field2972) != 0) {
                        var67.field2374.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var67.field2383 + var67.field2375 - class40.field790, var67.field2386 - class144.field2828, var67.field2376 + var67.field2378 - class87.field1866, var67.field2370);
                    } else if (var67.field2368 == 256) {
                        int var68 = var67.field2383 - class40.field790;
                        int var69 = var67.field2386 - class144.field2828;
                        int var70 = var67.field2376 - class87.field1866;
                        int var71 = var67.field2387;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field2374.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var67.field2375 + var68, var69, var67.field2378 + var70, var67.field2370);
                        } else if (var67.field2380 != null) {
                            var67.field2380.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var68, var69, var70, var67.field2370);
                        }
                    }
                }
                class44 var74 = var2.field2991;
                if (var74 != null) {
                    if ((var74.field884 & var2.field2972) != 0 && !class3.method14(var6, var3, var4, var74.field884)) {
                        var74.field878.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var74.field887 - class40.field790, var74.field880 - class144.field2828, var74.field883 - class87.field1866, var74.field874);
                    }
                    if ((var74.field888 & var2.field2972) != 0 && !class3.method14(var6, var3, var4, var74.field888)) {
                        var74.field876.method45(0, class193.field3753, class149.field2918, class44.field882, class162.field3150, var74.field887 - class40.field790, var74.field880 - class144.field2828, var74.field883 - class87.field1866, var74.field874);
                    }
                }
            }
            if (var5 < class8.field167 - 1) {
                class152 var75 = class173.field3351[var5 + 1][var3][var4];
                if (var75 != null && var75.field3000) {
                    class155.field3046.method337(var75, (byte) -22);
                }
            }
            if (var3 < class166.field3221) {
                class152 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field3000) {
                    class155.field3046.method337(var76, (byte) -22);
                }
            }
            if (var4 < class55.field1056) {
                class152 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field3000) {
                    class155.field3046.method337(var77, (byte) -22);
                }
            }
            if (var3 > class166.field3221) {
                class152 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field3000) {
                    class155.field3046.method337(var78, (byte) -22);
                }
            }
            if (var4 > class55.field1056) {
                class152 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field3000) {
                    class155.field3046.method337(var79, (byte) -22);
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public static void method1251(int arg0) {
        if (arg0 <= -17) {
            field3684 = null;
            field3680 = null;
            field3678 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ldb;III)V")
    public static final void method1252(class32 arg0, int arg1, int arg2, int arg3) {
        field3679++;
        if ((arg2 & 0x200) != 0) {
            arg0.field3289 = class22.field418.method564((byte) 34);
            arg0.field3311 = class22.field418.method564((byte) -125);
            arg0.field3298 = class22.field418.method584((byte) -45);
            arg0.field3331 = class22.field418.method594(27796);
            arg0.field3283 = class22.field418.method608(24) + class18.field362;
            arg0.field3339 = class22.field418.method576(28836) + class18.field362;
            arg0.field3313 = class22.field418.method584((byte) -54);
            arg0.field3300 = 0;
            arg0.field3272 = 1;
        }
        if ((arg2 & 0x400) != 0) {
            int var4 = class22.field418.method604((byte) -127);
            int var5 = class22.field418.method584((byte) -84);
            arg0.method1157(var5, 4, class18.field362, var4);
        }
        if ((arg2 & 0x40) != 0) {
            int var6 = class22.field418.method576(28836);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class22.field418.method564((byte) -122);
            class87.method717(var6, var7, arg0, (byte) -54);
        }
        if ((arg2 & 0x20) != 0) {
            arg0.field3287 = class22.field418.method586((byte) 84);
            if (arg0.field3287 == 65535) {
                arg0.field3287 = -1;
            }
        }
        if ((arg2 & 0x10) != 0) {
            int var8 = class22.field418.method604((byte) -124);
            int var9 = class22.field418.method564((byte) 41);
            arg0.method1157(var9, 4, class18.field362, var8);
            arg0.field3299 = class18.field362 + 300;
            arg0.field3295 = class22.field418.method594(27796);
        }
        if ((arg2 & 0x80) != 0) {
            arg0.field3335 = class22.field418.method575(95);
            if (arg0.field3335.method392(0, 55) == 126) {
                arg0.field3335 = arg0.field3335.method380((byte) 26, 1);
                class60.method506(78, arg0.field598, 2, arg0.field3335);
            } else if (class123.field2489 == arg0) {
                class60.method506(-125, arg0.field598, 2, arg0.field3335);
            }
            arg0.field3312 = 0;
            arg0.field3325 = 150;
            arg0.field3274 = 0;
        }
        if ((arg2 & 0x1) != 0) {
            arg0.field3303 = class22.field418.method569(26496);
            arg0.field3322 = class22.field418.method586((byte) 80);
        }
        if ((arg2 & 0x100) != 0) {
            arg0.field3279 = class22.field418.method586((byte) 91);
            int var10 = class22.field418.method595(99);
            arg0.field3324 = 0;
            arg0.field3292 = class18.field362 + (var10 & 0xFFFF);
            if (arg0.field3279 == 65535) {
                arg0.field3279 = -1;
            }
            arg0.field3320 = var10 >> 16;
            arg0.field3337 = 0;
            if (class18.field362 < arg0.field3292) {
                arg0.field3337 = -1;
            }
        }
        if ((arg2 & 0x8) != 0) {
            int var11 = class22.field418.method569(26496);
            int var12 = class22.field418.method584((byte) -101);
            int var13 = class22.field418.method594(27796);
            int var14 = class22.field418.field1454;
            if (arg0.field598 != null && arg0.field606 != null) {
                long var15 = arg0.field598.method399(119);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class5.field88; var18++) {
                        if (class25.field487[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class161.field3141 == 0) {
                    class20.field382.field1454 = 0;
                    class22.field418.method611((byte) 84, class20.field382.field1495, var13, 0);
                    class20.field382.field1454 = 0;
                    class47 var19 = class13.method97(class35.method305(class20.field382, 32767).method415(107));
                    arg0.field3335 = var19.method390(81);
                    arg0.field3325 = 150;
                    arg0.field3274 = var11 >> 8;
                    arg0.field3312 = var11 & 0xFF;
                    if (var12 == 2 || var12 == 3) {
                        class60.method506(54, class5.method24(new class47[] { class189.field3672, arg0.field598 }, (byte) 121), 1, var19);
                    } else if (var12 == 1) {
                        class60.method506(75, class5.method24(new class47[] { class152.field2974, arg0.field598 }, (byte) 111), 1, var19);
                    } else {
                        class60.method506(-128, arg0.field598, 2, var19);
                    }
                }
            }
            class22.field418.field1454 = var13 + var14;
        }
        int var20 = -102 % ((arg3 + 37) / 61);
        if ((arg2 & 0x4) == 0) {
            return;
        }
        int var21 = class22.field418.method584((byte) -106);
        byte[] var22 = new byte[var21];
        class68 var23 = new class68(var22);
        class22.field418.method605(-91, var22, var21, 0);
        class158.field3070[arg1] = var23;
        arg0.method282(var23, 115);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    public class190() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
    public class190(int arg0) {
        this.field3682 = arg0;
    }
}
