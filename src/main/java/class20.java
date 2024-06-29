import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class20 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Loa;")
    public static class153 field331 = new class153(4096);

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Ldc;")
    private static class37 field333 = class185.method1233((byte) 86, "Prepared sound engine");

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Ldc;")
    public static class37 field335 = field333;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lsg;")
    public static class203 field337 = new class203();

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lbf;Z)V")
    public static final void method133(class18 arg0, boolean arg1) {
        class164.field3106.method1340(80, arg0);
        while (true) {
            class18 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class18[][] var7;
            class18 var65;
            do {
                class18 var64;
                do {
                    class18 var63;
                    do {
                        class18 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class18) class164.field3106.method1337(-105);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field297);
                                            var3 = var2.field281;
                                            var4 = var2.field279;
                                            var5 = var2.field302;
                                            var6 = var2.field278;
                                            var7 = class180.field3354[var5];
                                            if (!var2.field282) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class18 var8 = class180.field3354[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field297) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class240.field4408 && var3 > class242.field4446) {
                                                    class18 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field297 && (var9.field282 || (var2.field301 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class240.field4408 && var3 < class41.field838 - 1) {
                                                    class18 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field297 && (var10.field282 || (var2.field301 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class199.field3702 && var4 > class18.field267) {
                                                    class18 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field297 && (var11.field282 || (var2.field301 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class199.field3702 && var4 < class180.field3360 - 1) {
                                                    class18 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field297 && (var12.field282 || (var2.field301 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field282 = false;
                                            if (var2.field283 != null) {
                                                class18 var13 = var2.field283;
                                                if (var13.field286 == null) {
                                                    if (var13.field284 != null) {
                                                        if (class43.method380(0, var3, var4)) {
                                                            class142.method989(var13.field284, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, true);
                                                        } else {
                                                            class142.method989(var13.field284, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class43.method380(0, var3, var4)) {
                                                    class49.method422(var13.field286, 0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, true);
                                                } else {
                                                    class49.method422(var13.field286, 0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, false);
                                                }
                                                class184 var14 = var13.field292;
                                                if (var14 != null) {
                                                    var14.field3399.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var14.field3393 - class39.field818, var14.field3405 - class133.field2466, var14.field3401 - class151.field2861, var14.field3409);
                                                }
                                                for (int var15 = 0; var15 < var13.field290; var15++) {
                                                    class94 var16 = var13.field289[var15];
                                                    if (var16 != null) {
                                                        var16.field1653.method19(var16.field1650, class59.field1098, class38.field793, class124.field2215, class197.field3689, var16.field1640 - class39.field818, var16.field1646 - class133.field2466, var16.field1648 - class151.field2861, var16.field1641);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field286 == null) {
                                                if (var2.field284 != null) {
                                                    if (class43.method380(var6, var3, var4)) {
                                                        class142.method989(var2.field284, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class142.method989(var2.field284, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, false);
                                                    }
                                                }
                                            } else if (class43.method380(var6, var3, var4)) {
                                                class49.method422(var2.field286, var6, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field286.field4313 != 12345678 || class97.field1696 && var5 <= class225.field4160) {
                                                    class49.method422(var2.field286, var6, class59.field1098, class38.field793, class124.field2215, class197.field3689, var3, var4, false);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class184 var20 = var2.field292;
                                            class58 var21 = var2.field299;
                                            if (var20 != null || var21 != null) {
                                                if (class240.field4408 == var3) {
                                                    var18++;
                                                } else if (class240.field4408 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class199.field3702 == var4) {
                                                    var18 += 3;
                                                } else if (class199.field3702 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class18.field300[var18];
                                                var2.field274 = class59.field1099[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field3397 & class26.field450[var18]) == 0) {
                                                    var2.field276 = 0;
                                                } else if (var20.field3397 == 16) {
                                                    var2.field276 = 3;
                                                    var2.field288 = class119.field2132[var18];
                                                    var2.field275 = 3 - var2.field288;
                                                } else if (var20.field3397 == 32) {
                                                    var2.field276 = 6;
                                                    var2.field288 = class158.field2992[var18];
                                                    var2.field275 = 6 - var2.field288;
                                                } else if (var20.field3397 == 64) {
                                                    var2.field276 = 12;
                                                    var2.field288 = class114.field2036[var18];
                                                    var2.field275 = 12 - var2.field288;
                                                } else {
                                                    var2.field276 = 9;
                                                    var2.field288 = class60.field1115[var18];
                                                    var2.field275 = 9 - var2.field288;
                                                }
                                                if ((var20.field3397 & var19) != 0 && !class52.method431(var6, var3, var4, var20.field3397)) {
                                                    var20.field3399.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var20.field3393 - class39.field818, var20.field3405 - class133.field2466, var20.field3401 - class151.field2861, var20.field3409);
                                                }
                                                if ((var20.field3408 & var19) != 0 && !class52.method431(var6, var3, var4, var20.field3408)) {
                                                    var20.field3404.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var20.field3393 - class39.field818, var20.field3405 - class133.field2466, var20.field3401 - class151.field2861, var20.field3409);
                                                }
                                            }
                                            if (var21 != null && !class200.method1327(var6, var3, var4, var21.field1084.method5())) {
                                                if ((var21.field1095 & var19) != 0) {
                                                    var21.field1084.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var21.field1083 + var21.field1092 - class39.field818, var21.field1087 - class133.field2466, var21.field1080 + var21.field1088 - class151.field2861, var21.field1081);
                                                } else if (var21.field1095 == 256) {
                                                    int var22 = var21.field1083 - class39.field818;
                                                    int var23 = var21.field1087 - class133.field2466;
                                                    int var24 = var21.field1080 - class151.field2861;
                                                    int var25 = var21.field1091;
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
                                                        var21.field1084.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var21.field1092 + var22, var23, var21.field1088 + var24, var21.field1081);
                                                    } else if (var21.field1086 != null) {
                                                        var21.field1086.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var22, var23, var24, var21.field1081);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class149 var28 = var2.field295;
                                                if (var28 != null) {
                                                    var28.field2829.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var28.field2831 - class39.field818, var28.field2823 - class133.field2466, var28.field2820 - class151.field2861, var28.field2819);
                                                }
                                                class105 var29 = var2.field287;
                                                if (var29 != null && var29.field1821 == 0) {
                                                    if (var29.field1814 != null) {
                                                        var29.field1814.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var29.field1817 - class39.field818, var29.field1815 - class133.field2466, var29.field1818 - class151.field2861, var29.field1823);
                                                    }
                                                    if (var29.field1830 != null) {
                                                        var29.field1830.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var29.field1817 - class39.field818, var29.field1815 - class133.field2466, var29.field1818 - class151.field2861, var29.field1823);
                                                    }
                                                    if (var29.field1816 != null) {
                                                        var29.field1816.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var29.field1817 - class39.field818, var29.field1815 - class133.field2466, var29.field1818 - class151.field2861, var29.field1823);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field301;
                                            if (var30 != 0) {
                                                if (var3 < class240.field4408 && (var30 & 0x4) != 0) {
                                                    class18 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field297) {
                                                        class164.field3106.method1340(-109, var31);
                                                    }
                                                }
                                                if (var4 < class199.field3702 && (var30 & 0x2) != 0) {
                                                    class18 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field297) {
                                                        class164.field3106.method1340(120, var32);
                                                    }
                                                }
                                                if (var3 > class240.field4408 && (var30 & 0x1) != 0) {
                                                    class18 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field297) {
                                                        class164.field3106.method1340(-122, var33);
                                                    }
                                                }
                                                if (var4 > class199.field3702 && (var30 & 0x8) != 0) {
                                                    class18 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field297) {
                                                        class164.field3106.method1340(-112, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field276 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field290; var36++) {
                                                if (class164.field3111 != var2.field289[var36].field1652 && (var2.field285[var36] & var2.field276) == var2.field288) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class184 var37 = var2.field292;
                                                if (!class52.method431(var6, var3, var4, var37.field3397)) {
                                                    var37.field3399.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var37.field3393 - class39.field818, var37.field3405 - class133.field2466, var37.field3401 - class151.field2861, var37.field3409);
                                                }
                                                var2.field276 = 0;
                                            }
                                        }
                                        if (!var2.field294) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field290;
                                            var2.field294 = false;
                                            int var39 = 0;
                                            label562: for (int var40 = 0; var40 < var38; var40++) {
                                                class94 var41 = var2.field289[var40];
                                                if (class164.field3111 != var41.field1652) {
                                                    for (int var42 = var41.field1639; var42 <= var41.field1651; var42++) {
                                                        for (int var43 = var41.field1645; var43 <= var41.field1637; var43++) {
                                                            class18 var44 = var7[var42][var43];
                                                            if (var44.field282) {
                                                                var2.field294 = true;
                                                                continue label562;
                                                            }
                                                            if (var44.field276 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field1639) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field1651) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field1645) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field1637) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field276) == var2.field275) {
                                                                    var2.field294 = true;
                                                                    continue label562;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class117.field2093[var39++] = var41;
                                                    int var46 = class240.field4408 - var41.field1639;
                                                    int var47 = var41.field1651 - class240.field4408;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class199.field3702 - var41.field1645;
                                                    int var49 = var41.field1637 - class199.field3702;
                                                    if (var49 > var48) {
                                                        var41.field1649 = var46 + var49;
                                                    } else {
                                                        var41.field1649 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class94 var53 = class117.field2093[var52];
                                                    if (class164.field3111 != var53.field1652) {
                                                        if (var53.field1649 > var50) {
                                                            var50 = var53.field1649;
                                                            var51 = var52;
                                                        } else if (var53.field1649 == var50) {
                                                            int var54 = var53.field1640 - class39.field818;
                                                            int var55 = var53.field1648 - class151.field2861;
                                                            int var56 = class117.field2093[var51].field1640 - class39.field818;
                                                            int var57 = class117.field2093[var51].field1648 - class151.field2861;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class94 var58 = class117.field2093[var51];
                                                var58.field1652 = class164.field3111;
                                                if (!class84.method575(var6, var58.field1639, var58.field1651, var58.field1645, var58.field1637, var58.field1653.method5())) {
                                                    var58.field1653.method19(var58.field1650, class59.field1098, class38.field793, class124.field2215, class197.field3689, var58.field1640 - class39.field818, var58.field1646 - class133.field2466, var58.field1648 - class151.field2861, var58.field1641);
                                                }
                                                for (int var59 = var58.field1639; var59 <= var58.field1651; var59++) {
                                                    for (int var60 = var58.field1645; var60 <= var58.field1637; var60++) {
                                                        class18 var61 = var7[var59][var60];
                                                        if (var61.field276 != 0) {
                                                            class164.field3106.method1340(-98, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field297) {
                                                            class164.field3106.method1340(23, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field294) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field294 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field297);
                            } while (var2.field276 != 0);
                            if (var3 > class240.field4408 || var3 <= class242.field4446) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field297);
                        if (var3 < class240.field4408 || var3 >= class41.field838 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field297);
                    if (var4 > class199.field3702 || var4 <= class18.field267) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field297);
                if (var4 < class199.field3702 || var4 >= class180.field3360 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field297);
            var2.field297 = false;
            class26.field447--;
            class105 var66 = var2.field287;
            if (var66 != null && var66.field1821 != 0) {
                if (var66.field1814 != null) {
                    var66.field1814.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var66.field1817 - class39.field818, var66.field1815 - class133.field2466 - var66.field1821, var66.field1818 - class151.field2861, var66.field1823);
                }
                if (var66.field1830 != null) {
                    var66.field1830.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var66.field1817 - class39.field818, var66.field1815 - class133.field2466 - var66.field1821, var66.field1818 - class151.field2861, var66.field1823);
                }
                if (var66.field1816 != null) {
                    var66.field1816.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var66.field1817 - class39.field818, var66.field1815 - class133.field2466 - var66.field1821, var66.field1818 - class151.field2861, var66.field1823);
                }
            }
            if (var2.field274 != 0) {
                class58 var67 = var2.field299;
                if (var67 != null && !class200.method1327(var6, var3, var4, var67.field1084.method5())) {
                    if ((var67.field1095 & var2.field274) != 0) {
                        var67.field1084.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var67.field1083 + var67.field1092 - class39.field818, var67.field1087 - class133.field2466, var67.field1080 + var67.field1088 - class151.field2861, var67.field1081);
                    } else if (var67.field1095 == 256) {
                        int var68 = var67.field1083 - class39.field818;
                        int var69 = var67.field1087 - class133.field2466;
                        int var70 = var67.field1080 - class151.field2861;
                        int var71 = var67.field1091;
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
                            var67.field1084.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var67.field1092 + var68, var69, var67.field1088 + var70, var67.field1081);
                        } else if (var67.field1086 != null) {
                            var67.field1086.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var68, var69, var70, var67.field1081);
                        }
                    }
                }
                class184 var74 = var2.field292;
                if (var74 != null) {
                    if ((var74.field3408 & var2.field274) != 0 && !class52.method431(var6, var3, var4, var74.field3408)) {
                        var74.field3404.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var74.field3393 - class39.field818, var74.field3405 - class133.field2466, var74.field3401 - class151.field2861, var74.field3409);
                    }
                    if ((var74.field3397 & var2.field274) != 0 && !class52.method431(var6, var3, var4, var74.field3397)) {
                        var74.field3399.method19(0, class59.field1098, class38.field793, class124.field2215, class197.field3689, var74.field3393 - class39.field818, var74.field3405 - class133.field2466, var74.field3401 - class151.field2861, var74.field3409);
                    }
                }
            }
            if (var5 < class95.field1674 - 1) {
                class18 var75 = class180.field3354[var5 + 1][var3][var4];
                if (var75 != null && var75.field297) {
                    class164.field3106.method1340(126, var75);
                }
            }
            if (var3 < class240.field4408) {
                class18 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field297) {
                    class164.field3106.method1340(107, var76);
                }
            }
            if (var4 < class199.field3702) {
                class18 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field297) {
                    class164.field3106.method1340(-113, var77);
                }
            }
            if (var3 > class240.field4408) {
                class18 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field297) {
                    class164.field3106.method1340(67, var78);
                }
            }
            if (var4 > class199.field3702) {
                class18 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field297) {
                    class164.field3106.method1340(50, var79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method134(int arg0) {
        field335 = null;
        if (arg0 > 38) {
            field337 = null;
            field333 = null;
            field331 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static final void method135(int arg0) {
        for (int var1 = 0; var1 < class225.field4159; var1++) {
            int var10002 = class117.field2099[var1]--;
            if (class117.field2099[var1] >= -10) {
                class40 var3 = class210.field3940[var1];
                if (var3 == null) {
                    var3 = class40.method356(class69.field1254, class124.field2213[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class117.field2099[var1] += var3.method355();
                    class210.field3940[var1] = var3;
                }
                if (class117.field2099[var1] < 0) {
                    int var4;
                    if (class198.field3691[var1] == 0) {
                        var4 = class8.field95;
                    } else {
                        int var5 = (class198.field3691[var1] & 0xFF) * 128;
                        int var6 = class198.field3691[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class238.field4382.field3505;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class198.field3691[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class238.field4382.field3490;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var10 > var5) {
                            class117.field2099[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class214.field4001 / var5;
                    }
                    if (var4 > 0) {
                        class146 var11 = var3.method357().method1009(class184.field3398);
                        class111 var12 = class111.method719(var11, 100, var4);
                        var12.method745(class29.field546[var1] - 1);
                        class49.field969.method1447(var12);
                    }
                    class117.field2099[var1] = -100;
                }
            } else {
                class225.field4159--;
                for (int var2 = var1; var2 < class225.field4159; var2++) {
                    class124.field2213[var2] = class124.field2213[var2 + 1];
                    class210.field3940[var2] = class210.field3940[var2 + 1];
                    class29.field546[var2] = class29.field546[var2 + 1];
                    class117.field2099[var2] = class117.field2099[var2 + 1];
                    class198.field3691[var2] = class198.field3691[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 < 104) {
            return;
        }
        if (class238.field4376 && !class103.method670((byte) -37)) {
            if (class52.field1050 != 0 && class184.field3396 != -1) {
                class167.method1118(class184.field3396, class68.field1236, 1, 0, class52.field1050, false);
            }
            class238.field4376 = false;
        } else if (class52.field1050 != 0 && class184.field3396 != -1 && !class103.method670((byte) -37)) {
            class49.field970.method1503(144, 2976);
            class49.field970.method183(class184.field3396, -1137894376);
            class62.field1134++;
            class184.field3396 = -1;
        }
        field332++;
    }
}
