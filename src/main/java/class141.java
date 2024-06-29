import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class141 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Llc;")
    public static class143 field2453 = class66.method374("Abbrechen", -1);

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Llc;")
    private static class143 field2465 = class66.method374("Loading wordpack )2 ", -1);

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2459 = 0;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2461 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Llc;")
    public static class143 field2455 = field2465;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field2467 = 0;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2456 = 2;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2460 = 0;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Llc;")
    private static class143 field2458 = class66.method374("Your ignore list is full)3 Max of 100 users)3", -1);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Llc;")
    public static class143 field2463 = field2458;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLvh;)V")
    public static final void method844(byte arg0, class43 arg1) {
        int var2 = 41 / ((-arg0 - 87) / 32);
        field2468++;
        if (class248.field4448 == arg1.field744) {
            class69.field1323[arg1.field863] = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method845(byte arg0) {
        int var1 = 64 / ((-arg0 - 15) / 40);
        class43.field788 = null;
        class26.field436 = null;
        class231.field4224 = null;
        field2454++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lch;Z)V")
    public static final void method846(class120 arg0, boolean arg1) {
        class14.field262.method1290((byte) -44, arg0);
        while (true) {
            class120 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class120[][] var7;
            class120 var82;
            do {
                class120 var81;
                do {
                    class120 var80;
                    do {
                        class120 var79;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class120) class14.field262.method1291(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2115);
                                            var3 = var2.field2142;
                                            var4 = var2.field2117;
                                            var5 = var2.field2135;
                                            var6 = var2.field2130;
                                            var7 = class7.field122[var5];
                                            if (!var2.field2133) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class120 var8 = class7.field122[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2115) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class139.field2430 && var3 > class123.field2158) {
                                                    class120 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2115 && (var9.field2133 || (var2.field2122 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class139.field2430 && var3 < class227.field4102 - 1) {
                                                    class120 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2115 && (var10.field2133 || (var2.field2122 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class126.field2227 && var4 > class56.field1094) {
                                                    class120 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2115 && (var11.field2133 || (var2.field2122 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class126.field2227 && var4 < class59.field1138 - 1) {
                                                    class120 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2115 && (var12.field2133 || (var2.field2122 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2133 = false;
                                            if (var2.field2119 != null) {
                                                class120 var13 = var2.field2119;
                                                if (var13.field2138 == null) {
                                                    if (var13.field2127 != null) {
                                                        if (class264.method1764(0, var3, var4)) {
                                                            class118.method727(var13.field2127, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, true);
                                                        } else {
                                                            class118.method727(var13.field2127, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class264.method1764(0, var3, var4)) {
                                                    class25.method177(var13.field2138, 0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, true);
                                                } else {
                                                    class25.method177(var13.field2138, 0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, false);
                                                }
                                                class57 var14 = var13.field2131;
                                                if (var14 != null) {
                                                    var14.field1105.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var14.field1097 - class40.field682, var14.field1102 - class266.field4782, var14.field1101 - class264.field4751, var14.field1096, var5, (class125) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2134; var15++) {
                                                    class211 var16 = var13.field2144[var15];
                                                    if (var16 != null) {
                                                        var16.field3916.method174(var16.field3932, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var16.field3929 - class40.field682, var16.field3927 - class266.field4782, var16.field3930 - class264.field4751, var16.field3928, var5, (class125) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2138 == null) {
                                                if (var2.field2127 != null) {
                                                    if (class264.method1764(var6, var3, var4)) {
                                                        class118.method727(var2.field2127, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class118.method727(var2.field2127, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, false);
                                                    }
                                                }
                                            } else if (class264.method1764(var6, var3, var4)) {
                                                class25.method177(var2.field2138, var6, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2138.field2081 != 12345678 || class133.field2328 && var5 <= class170.field3034) {
                                                    class25.method177(var2.field2138, var6, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class140 var18 = var2.field2129;
                                                if (var18 != null && (var18.field2437 & 0x80000000L) != 0L) {
                                                    var18.field2445.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var18.field2443 - class40.field682, var18.field2447 - class266.field4782, var18.field2441 - class264.field4751, var18.field2437, var5, (class125) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class57 var21 = var2.field2131;
                                            class63 var22 = var2.field2124;
                                            if (var21 != null || var22 != null) {
                                                if (class139.field2430 == var3) {
                                                    var19++;
                                                } else if (class139.field2430 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class126.field2227 == var4) {
                                                    var19 += 3;
                                                } else if (class126.field2227 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class136.field2388[var19];
                                                var2.field2143 = class245.field4411[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1100 & class228.field4159[var19]) == 0) {
                                                    var2.field2140 = 0;
                                                } else if (var21.field1100 == 16) {
                                                    var2.field2140 = 3;
                                                    var2.field2132 = class99.field1786[var19];
                                                    var2.field2120 = 3 - var2.field2132;
                                                } else if (var21.field1100 == 32) {
                                                    var2.field2140 = 6;
                                                    var2.field2132 = class259.field4644[var19];
                                                    var2.field2120 = 6 - var2.field2132;
                                                } else if (var21.field1100 == 64) {
                                                    var2.field2140 = 12;
                                                    var2.field2132 = class67.field1264[var19];
                                                    var2.field2120 = 12 - var2.field2132;
                                                } else {
                                                    var2.field2140 = 9;
                                                    var2.field2132 = class194.field3591[var19];
                                                    var2.field2120 = 9 - var2.field2132;
                                                }
                                                if ((var21.field1100 & var20) != 0 && !class53.method319(var6, var3, var4, var21.field1100)) {
                                                    var21.field1105.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var21.field1097 - class40.field682, var21.field1102 - class266.field4782, var21.field1101 - class264.field4751, var21.field1096, var5, (class125) null);
                                                }
                                                if ((var21.field1104 & var20) != 0 && !class53.method319(var6, var3, var4, var21.field1104)) {
                                                    var21.field1099.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var21.field1097 - class40.field682, var21.field1102 - class266.field4782, var21.field1101 - class264.field4751, var21.field1096, var5, (class125) null);
                                                }
                                            }
                                            if (var22 != null && !class203.method1383(var6, var3, var4, var22.field1182.method166())) {
                                                if ((var22.field1192 & var20) != 0) {
                                                    var22.field1182.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var22.field1188 + var22.field1193 - class40.field682, var22.field1199 - class266.field4782, var22.field1194 + var22.field1183 - class264.field4751, var22.field1191, var5, (class125) null);
                                                } else if (var22.field1192 == 256) {
                                                    int var23 = var22.field1188 - class40.field682;
                                                    int var24 = var22.field1199 - class266.field4782;
                                                    int var25 = var22.field1194 - class264.field4751;
                                                    int var26 = var22.field1202;
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
                                                        var22.field1182.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var22.field1193 + var23, var24, var22.field1183 + var25, var22.field1191, var5, (class125) null);
                                                    } else if (var22.field1190 != null) {
                                                        var22.field1190.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var23, var24, var25, var22.field1191, var5, (class125) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class140 var29 = var2.field2129;
                                                if (var29 != null && (var29.field2437 & 0x80000000L) == 0L) {
                                                    var29.field2445.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var29.field2443 - class40.field682, var29.field2447 - class266.field4782, var29.field2441 - class264.field4751, var29.field2437, var5, (class125) null);
                                                }
                                                class105 var30 = var2.field2146;
                                                if (var30 != null && var30.field1852 == 0) {
                                                    if (var30.field1859 != null) {
                                                        var30.field1859.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var30.field1855 - class40.field682, var30.field1860 - class266.field4782, var30.field1862 - class264.field4751, var30.field1858, var5, (class125) null);
                                                    }
                                                    if (var30.field1848 != null) {
                                                        var30.field1848.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var30.field1855 - class40.field682, var30.field1860 - class266.field4782, var30.field1862 - class264.field4751, var30.field1858, var5, (class125) null);
                                                    }
                                                    if (var30.field1856 != null) {
                                                        var30.field1856.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var30.field1855 - class40.field682, var30.field1860 - class266.field4782, var30.field1862 - class264.field4751, var30.field1858, var5, (class125) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2122;
                                            if (var31 != 0) {
                                                if (var3 < class139.field2430 && (var31 & 0x4) != 0) {
                                                    class120 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2115) {
                                                        class14.field262.method1290((byte) -44, var32);
                                                    }
                                                }
                                                if (var4 < class126.field2227 && (var31 & 0x2) != 0) {
                                                    class120 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2115) {
                                                        class14.field262.method1290((byte) -44, var33);
                                                    }
                                                }
                                                if (var3 > class139.field2430 && (var31 & 0x1) != 0) {
                                                    class120 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2115) {
                                                        class14.field262.method1290((byte) -44, var34);
                                                    }
                                                }
                                                if (var4 > class126.field2227 && (var31 & 0x8) != 0) {
                                                    class120 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2115) {
                                                        class14.field262.method1290((byte) -44, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2140 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2134; var37++) {
                                                if (class182.field3256 != var2.field2144[var37].field3914 && (var2.field2128[var37] & var2.field2140) == var2.field2132) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class57 var38 = var2.field2131;
                                                if (!class53.method319(var6, var3, var4, var38.field1100)) {
                                                    var38.field1105.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var38.field1097 - class40.field682, var38.field1102 - class266.field4782, var38.field1101 - class264.field4751, var38.field1096, var5, (class125) null);
                                                }
                                                var2.field2140 = 0;
                                            }
                                        }
                                        if (!var2.field2137) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2134;
                                            var2.field2137 = false;
                                            int var40 = 0;
                                            label584: for (int var41 = 0; var41 < var39; var41++) {
                                                class211 var42 = var2.field2144[var41];
                                                if (class182.field3256 != var42.field3914) {
                                                    for (int var43 = var42.field3931; var43 <= var42.field3933; var43++) {
                                                        for (int var44 = var42.field3919; var44 <= var42.field3918; var44++) {
                                                            class120 var45 = var7[var43][var44];
                                                            if (var45.field2133) {
                                                                var2.field2137 = true;
                                                                continue label584;
                                                            }
                                                            if (var45.field2140 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3931) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field3933) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3919) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3918) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2140) == var2.field2120) {
                                                                    var2.field2137 = true;
                                                                    continue label584;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class9.field181[var40++] = var42;
                                                    int var47 = class139.field2430 - var42.field3931;
                                                    int var48 = var42.field3933 - class139.field2430;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class126.field2227 - var42.field3919;
                                                    int var50 = var42.field3918 - class126.field2227;
                                                    if (var50 > var49) {
                                                        var42.field3934 = var47 + var50;
                                                    } else {
                                                        var42.field3934 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class211 var54 = class9.field181[var53];
                                                    if (class182.field3256 != var54.field3914) {
                                                        if (var54.field3934 > var51) {
                                                            var51 = var54.field3934;
                                                            var52 = var53;
                                                        } else if (var54.field3934 == var51) {
                                                            int var55 = var54.field3929 - class40.field682;
                                                            int var56 = var54.field3930 - class264.field4751;
                                                            int var57 = class9.field181[var52].field3929 - class40.field682;
                                                            int var58 = class9.field181[var52].field3930 - class264.field4751;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class211 var59 = class9.field181[var52];
                                                var59.field3914 = class182.field3256;
                                                if (!class126.method768(var6, var59.field3931, var59.field3933, var59.field3919, var59.field3918, var59.field3916.method166())) {
                                                    var59.field3916.method174(var59.field3932, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var59.field3929 - class40.field682, var59.field3927 - class266.field4782, var59.field3930 - class264.field4751, var59.field3928, var5, (class125) null);
                                                }
                                                for (int var60 = var59.field3931; var60 <= var59.field3933; var60++) {
                                                    for (int var61 = var59.field3919; var61 <= var59.field3918; var61++) {
                                                        class120 var62 = var7[var60][var61];
                                                        if (var62.field2140 != 0) {
                                                            class14.field262.method1290((byte) -44, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2115) {
                                                            class14.field262.method1290((byte) -44, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2137) {
                                                break;
                                            }
                                        } catch (Exception var97) {
                                            var2.field2137 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2145 != null) {
                                        int var63 = class196.field3637 + class125.field2202;
                                        int var64 = class196.field3631 + class125.field2201;
                                        class92 var65 = var2.field2145.field4187;
                                        for (class92 var66 = var65.field1650; var66 != var65; var66 = var66.field1650) {
                                            class286 var67 = (class286) var66;
                                            if (var67.field5023 != null && !var67.field5023.field16.field2190) {
                                                if ((byte) ((int) (var67.field5023.field16.field2193 & 0xFFL)) != var2.field2136) {
                                                    var2.field2145 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field5022 >> 12) - class40.field682;
                                                int var69 = (var67.field5027 >> 12) - class266.field4782;
                                                int var70 = (var67.field5016 >> 12) - class264.field4751;
                                                int var71 = class184.field3349 * var68 + class149.field2740 * var70 >> 16;
                                                int var72 = class184.field3349 * var70 - class149.field2740 * var68 >> 16;
                                                int var74 = class217.field3978 * var69 - class91.field1635 * var72 >> 16;
                                                int var75 = class91.field1635 * var69 + class217.field3978 * var72 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    class260.method1718(var77, var78, var67.field5023.field18.field4692 >> 2, var67.field5014, var67.field5014 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2115);
                            } while (var2.field2140 != 0);
                            if (var3 > class139.field2430 || var3 <= class123.field2158) {
                                break;
                            }
                            var79 = var7[var3 - 1][var4];
                        } while (var79 != null && var79.field2115);
                        if (var3 < class139.field2430 || var3 >= class227.field4102 - 1) {
                            break;
                        }
                        var80 = var7[var3 + 1][var4];
                    } while (var80 != null && var80.field2115);
                    if (var4 > class126.field2227 || var4 <= class56.field1094) {
                        break;
                    }
                    var81 = var7[var3][var4 - 1];
                } while (var81 != null && var81.field2115);
                if (var4 < class126.field2227 || var4 >= class59.field1138 - 1) {
                    break;
                }
                var82 = var7[var3][var4 + 1];
            } while (var82 != null && var82.field2115);
            var2.field2115 = false;
            class212.field3947--;
            class105 var83 = var2.field2146;
            if (var83 != null && var83.field1852 != 0) {
                if (var83.field1859 != null) {
                    var83.field1859.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var83.field1855 - class40.field682, var83.field1860 - class266.field4782 - var83.field1852, var83.field1862 - class264.field4751, var83.field1858, var5, (class125) null);
                }
                if (var83.field1848 != null) {
                    var83.field1848.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var83.field1855 - class40.field682, var83.field1860 - class266.field4782 - var83.field1852, var83.field1862 - class264.field4751, var83.field1858, var5, (class125) null);
                }
                if (var83.field1856 != null) {
                    var83.field1856.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var83.field1855 - class40.field682, var83.field1860 - class266.field4782 - var83.field1852, var83.field1862 - class264.field4751, var83.field1858, var5, (class125) null);
                }
            }
            if (var2.field2143 != 0) {
                class63 var84 = var2.field2124;
                if (var84 != null && !class203.method1383(var6, var3, var4, var84.field1182.method166())) {
                    if ((var84.field1192 & var2.field2143) != 0) {
                        var84.field1182.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var84.field1188 + var84.field1193 - class40.field682, var84.field1199 - class266.field4782, var84.field1194 + var84.field1183 - class264.field4751, var84.field1191, var5, (class125) null);
                    } else if (var84.field1192 == 256) {
                        int var85 = var84.field1188 - class40.field682;
                        int var86 = var84.field1199 - class266.field4782;
                        int var87 = var84.field1194 - class264.field4751;
                        int var88 = var84.field1202;
                        int var89;
                        if (var88 == 1 || var88 == 2) {
                            var89 = -var85;
                        } else {
                            var89 = var85;
                        }
                        int var90;
                        if (var88 == 2 || var88 == 3) {
                            var90 = -var87;
                        } else {
                            var90 = var87;
                        }
                        if (var90 >= var89) {
                            var84.field1182.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var84.field1193 + var85, var86, var84.field1183 + var87, var84.field1191, var5, (class125) null);
                        } else if (var84.field1190 != null) {
                            var84.field1190.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var85, var86, var87, var84.field1191, var5, (class125) null);
                        }
                    }
                }
                class57 var91 = var2.field2131;
                if (var91 != null) {
                    if ((var91.field1104 & var2.field2143) != 0 && !class53.method319(var6, var3, var4, var91.field1104)) {
                        var91.field1099.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var91.field1097 - class40.field682, var91.field1102 - class266.field4782, var91.field1101 - class264.field4751, var91.field1096, var5, (class125) null);
                    }
                    if ((var91.field1100 & var2.field2143) != 0 && !class53.method319(var6, var3, var4, var91.field1100)) {
                        var91.field1105.method174(0, class91.field1635, class217.field3978, class149.field2740, class184.field3349, var91.field1097 - class40.field682, var91.field1102 - class266.field4782, var91.field1101 - class264.field4751, var91.field1096, var5, (class125) null);
                    }
                }
            }
            if (var5 < class176.field3159 - 1) {
                class120 var92 = class7.field122[var5 + 1][var3][var4];
                if (var92 != null && var92.field2115) {
                    class14.field262.method1290((byte) -44, var92);
                }
            }
            if (var3 < class139.field2430) {
                class120 var93 = var7[var3 + 1][var4];
                if (var93 != null && var93.field2115) {
                    class14.field262.method1290((byte) -44, var93);
                }
            }
            if (var4 < class126.field2227) {
                class120 var94 = var7[var3][var4 + 1];
                if (var94 != null && var94.field2115) {
                    class14.field262.method1290((byte) -44, var94);
                }
            }
            if (var3 > class139.field2430) {
                class120 var95 = var7[var3 - 1][var4];
                if (var95 != null && var95.field2115) {
                    class14.field262.method1290((byte) -44, var95);
                }
            }
            if (var4 > class126.field2227) {
                class120 var96 = var7[var3][var4 - 1];
                if (var96 != null && var96.field2115) {
                    class14.field262.method1290((byte) -44, var96);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method847(int arg0) {
        field2452++;
        if (class135.field2364 == null) {
            return;
        }
        if (class154.field2779 < 10) {
            if (!class23.field385.method56(true, class135.field2364.field1453)) {
                class154.field2779 = class227.field4099.method30(0, class135.field2364.field1453) / 10;
                return;
            }
            class16.method121((byte) -125);
            class154.field2779 = 10;
        }
        if (class154.field2779 == 10) {
            class5.field80 = 8.0F;
            class143.field2564 = 8.0F;
            class245.field4412 = class135.field2364.field1464 >> 6 << 6;
            class169.field3009 = (class135.field2364.field1450 >> 6 << 6) + 64 - class245.field4412;
            int var1 = (class229.field4195.field4178 >> 7) + class148.field2733 - class245.field4412;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            class236.field4298 = class135.field2364.field1448 >> 6 << 6;
            class25.field426 = (class135.field2364.field1454 >> 6 << 6) + 64 - class236.field4298;
            int var3 = class236.field4298 + class25.field426 - (class229.field4195.field4108 >> 7) - field2466 - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class169.field3009 && var4 >= 0 && var4 < class25.field426) {
                class203.field3691 = var4;
                class41.field691 = var2;
            } else {
                class203.field3691 = class236.field4298 + class25.field426 - (class135.field2364.field1457 * 64) - 1;
                class41.field691 = class135.field2364.field1447 * 64 - class245.field4412;
            }
            method849((byte) 98);
            int var5 = class25.field426 >> 6;
            int var6 = class169.field3009 >> 6;
            int var7 = class87.field1588 >> 1;
            class118.field2099 = new short[var6][var5][];
            class10.field201 = new byte[var6][var5][];
            class35.field612 = new byte[var6][var5][];
            class123.field2155 = new int[var6][var5][];
            class20.field327 = new byte[var6][var5][];
            class39.field678 = new byte[var6][var5][];
            class227.field4101 = new byte[var6][var5][];
            class234.field4271 = new int[var6][var5][];
            class67.field1270 = new int[class42.field705 + 1];
            int var8 = class99.field1785 >> 2 << 10;
            class118.method723(-1, var7, var8);
            class154.field2779 = 20;
        } else if (class154.field2779 == 20) {
            class11.method93(new class190(class23.field385.method45(class223.field4049, class135.field2364.field1453, -98)), arg0 - 26063);
            class154.field2779 = 30;
            class261.method1741((byte) 51, true);
            class110.method661(-32769);
        } else if (class154.field2779 == 30) {
            class145.method922(-103, new class190(class23.field385.method45(class190.field3486, class135.field2364.field1453, -120)));
            class154.field2779 = 40;
            class110.method661(-32769);
        } else if (class154.field2779 == 40) {
            class114.method688(new class190(class23.field385.method45(class161.field2898, class135.field2364.field1453, -103)), (byte) 117);
            class154.field2779 = 50;
            class110.method661(-32769);
        } else if (class154.field2779 == 50) {
            class135.method815(-14882, new class190(class23.field385.method45(class282.field4965, class135.field2364.field1453, -84)));
            class154.field2779 = 60;
            class261.method1741((byte) 51, true);
            class110.method661(arg0 ^ 0xFFFF19D3);
        } else if (class154.field2779 == 60) {
            if (class23.field385.method29(false, class25.method179(arg0 - 26156, new class143[] { class135.field2364.field1453, class166.field2977 }))) {
                if (!class23.field385.method56(true, class25.method179(0, new class143[] { class135.field2364.field1453, class166.field2977 }))) {
                    return;
                }
                class90.field1628 = class89.method508(class23.field385, arg0 ^ 0x662C, class25.method179(0, new class143[] { class135.field2364.field1453, class166.field2977 }));
            } else {
                class90.field1628 = new class135(0);
            }
            class154.field2779 = 70;
            class110.method661(-32769);
        } else if (class154.field2779 == 70) {
            class31.field506 = new class102(11, true, class155.field2792);
            class154.field2779 = 73;
            class261.method1741((byte) 51, true);
            class110.method661(-32769);
        } else if (class154.field2779 == 73) {
            class135.field2377 = new class102(12, true, class155.field2792);
            class154.field2779 = 76;
            class261.method1741((byte) 51, true);
            class110.method661(-32769);
        } else if (class154.field2779 == 76) {
            class245.field4395 = new class102(14, true, class155.field2792);
            class154.field2779 = 79;
            class261.method1741((byte) 51, true);
            class110.method661(arg0 - 58925);
        } else if (class154.field2779 == 79) {
            class118.field2096 = new class102(17, true, class155.field2792);
            class154.field2779 = 82;
            class261.method1741((byte) 51, true);
            class110.method661(arg0 ^ 0xFFFF19D3);
        } else if (class154.field2779 == 82) {
            class143.field2563 = new class102(19, true, class155.field2792);
            class154.field2779 = 85;
            class261.method1741((byte) 51, true);
            class110.method661(-32769);
        } else {
            if (arg0 != 26156) {
                field2465 = null;
            }
            if (class154.field2779 == 85) {
                class289.field5067 = new class102(22, true, class155.field2792);
                class154.field2779 = 88;
                class261.method1741((byte) 51, true);
                class110.method661(arg0 - 58925);
            } else if (class154.field2779 == 88) {
                class268.field4803 = new class102(26, true, class155.field2792);
                class154.field2779 = 91;
                class261.method1741((byte) 51, true);
                class110.method661(-32769);
            } else {
                class248.field4450 = new class102(30, true, class155.field2792);
                class154.field2779 = 100;
                class261.method1741((byte) 51, true);
                class110.method661(arg0 - 58925);
                class147.field2651 = -1;
                class227.field4096 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lmf;")
    public static final class38 method848(byte arg0) {
        field2462++;
        try {
            int var1 = 48 % ((16 - arg0) / 60);
            return (class38) Class.forName("uf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    public static final void method849(byte arg0) {
        int var1 = 24 / ((46 - arg0) / 46);
        field2464++;
        if (class41.field691 < 0) {
            class41.field691 = 0;
            class227.field4096 = -1;
            class147.field2651 = -1;
        }
        if (class41.field691 > class169.field3009) {
            class41.field691 = class169.field3009;
            class147.field2651 = -1;
            class227.field4096 = -1;
        }
        if (class203.field3691 < 0) {
            class227.field4096 = -1;
            class203.field3691 = 0;
            class147.field2651 = -1;
        }
        if (class203.field3691 > class25.field426) {
            class203.field3691 = class25.field426;
            class147.field2651 = -1;
            class227.field4096 = -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method850(int arg0) {
        field2455 = null;
        if (arg0 != -32385) {
            method850(-64);
        }
        field2465 = null;
        field2463 = null;
        field2458 = null;
        field2453 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)J")
    public static final long method851(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2134; var4++) {
            class211 var5 = var3.field2144[var4];
            if ((var5.field3928 >> 29 & 0x3L) == 2L && var5.field3931 == arg1 && var5.field3919 == arg2) {
                return var5.field3928;
            }
        }
        return 0L;
    }
}
