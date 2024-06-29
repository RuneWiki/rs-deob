import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class166 extends class225 {

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public int field2236 = 1;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "Z")
    public static boolean field2240 = true;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2244 = "Loaded defaults";

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "C")
    public char field2238;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "F")
    public static float field2233;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "F")
    public static float field2234;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2243;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
    public static void method1020(int arg0) {
        if (arg0 != 0) {
            field2233 = -0.39057356F;
        }
        field2243 = null;
        field2244 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1021(int arg0, String arg1, String arg2, int arg3) {
        class34.field475 = arg1;
        class193.field2585 = arg0;
        field2242++;
        class94.field1348 = arg2;
        if (class34.field475.equals("") || class94.field1348.equals("")) {
            class102.field1416 = 3;
        } else if (class43.field616 == -1) {
            class100.field1394 = 0;
            class420.field6216 = 0;
            class102.field1416 = -3;
            class281.field4096 = 1;
            class228 var4 = new class228(128);
            var4.method1346(10, 32767);
            var4.method1330((int) (Math.random() * 9.9999999E7D), -124);
            var4.method1372(class126.method802((byte) -54, class34.field475), 1883835216);
            var4.method1330((int) (Math.random() * 9.9999999E7D), -91);
            var4.method1380(65280, class94.field1348);
            var4.method1330((int) (Math.random() * 9.9999999E7D), 103);
            var4.method1331(class194.field2602, class5.field62, true);
            class185.field2507.field3029 = 0;
            class185.field2507.method1346(24, 32767);
            class185.field2507.method1346(var4.field3029 + 2, 32767);
            class185.field2507.method1326(561, -54);
            class185.field2507.method1357(0, -1, var4.field3029, var4.field3040);
            if (arg3 >= -73) {
                field2240 = true;
            }
        } else {
            class26.method187(21274);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lmp;Lgk;)V")
    public static final void method1022(class21 arg0, class254 arg1) {
        if (!arg1.field3508) {
            return;
        }
        short var2 = arg1.field3524;
        short var3 = arg1.field3529;
        byte var4 = arg1.field3517;
        byte var5 = arg1.field3507;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class254[][] var8 = class213.field2852[var4];
        float var10;
        if (class191.field2557 == class12.field205) {
            int var9 = class282.field4111[var2][var3];
            class296.field4257.method1685(class265.field3846[0].method745(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 201.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class296.field4257.method1737(3000.0F, var10 * 1.5F);
        if (arg1.field3501) {
            if (class423.field6233) {
                if (var4 > 0) {
                    class254 var11 = class213.field2852[var4 - 1][var2][var3];
                    if (var11 != null && var11.field3508) {
                        return;
                    }
                }
                if (var2 <= class104.field1491 && var2 > class34.field476) {
                    class254 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field3508 && (var12.field3501 || (arg1.field3528 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class104.field1491 && var2 < class63.field849 - 1) {
                    class254 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field3508 && (var13.field3501 || (arg1.field3528 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class428.field6302 && var3 > class310.field4561) {
                    class254 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field3508 && (var14.field3501 || (arg1.field3528 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class428.field6302 && var3 < class5.field65 - 1) {
                    class254 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field3508 && (var15.field3501 || (arg1.field3528 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class423.field6233 = true;
            }
            arg1.field3501 = false;
            if (arg1.field3503 != null) {
                class254 var16 = arg1.field3503;
                class296.field4257.method1737(3000.0F, (201.5F - (float) (var16.field3507 + 1) * 50.0F) * 1.5F);
                if (!class202.method1200(var16.field3507, var2, var3)) {
                    class12.field205[var16.field3507].method752(var2, var3);
                }
                class97 var17 = var16.field3510;
                if (var17 != null) {
                    if (class125.field1750) {
                        if ((var17.field1365 & arg1.field3513) == 0) {
                            class282.method1942(arg0, var4, var2, var3);
                        } else {
                            class199.method1184(arg0, var17.field1365, var5, var2, var3);
                        }
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    var17.method117(class296.field4257, -1);
                }
                for (class328 var18 = var16.field3515; var18 != null; var18 = var18.field4783) {
                    class55 var19 = var18.field4785;
                    if (var19 != null) {
                        if (class125.field1750) {
                            class282.method1942(arg0, var4, var2, var3);
                            class296.field4257.method1626(arg0.field279, arg0.field277);
                        }
                        var19.method117(class296.field4257, -1);
                    }
                }
                class296.field4257.method1737(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class202.method1200(var5, var2, var3);
            if (var20) {
                class12.field205[var5].method752(var2, var3);
                class147 var21 = arg1.field3527;
                if (var21 != null && var21.field2011) {
                    if (var21.field2018) {
                        class296.field4257.method1737(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var22 = var21.method117(class296.field4257, -1);
                    if (var22 != null) {
                        var22.field5548 = var21;
                        var22.field5542 = var4;
                        var22.field5546 = var2;
                        var22.field5547 = var3;
                        class385.field5587.method1003(2166, var22);
                    }
                    if (var21.field2018) {
                        class296.field4257.method1737(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class97 var25 = arg1.field3510;
            class299 var26 = arg1.field3519;
            if (var25 != null || var26 != null) {
                if (class104.field1491 == var2) {
                    var23++;
                } else if (class104.field1491 < var2) {
                    var23 += 2;
                }
                if (class428.field6302 == var3) {
                    var23 += 3;
                } else if (class428.field6302 > var3) {
                    var23 += 6;
                }
                var24 = class284.field4131[var23];
                arg1.field3513 = class28.field408[var23];
            }
            if (var25 != null) {
                if ((var25.field1365 & class282.field4106[var23]) == 0) {
                    arg1.field3509 = 0;
                } else if (var25.field1365 == 16) {
                    arg1.field3509 = 3;
                    arg1.field3514 = class444.field6498[var23];
                    arg1.field3511 = (byte) (3 - arg1.field3514);
                } else if (var25.field1365 == 32) {
                    arg1.field3509 = 6;
                    arg1.field3514 = class215.field2871[var23];
                    arg1.field3511 = (byte) (6 - arg1.field3514);
                } else if (var25.field1365 == 64) {
                    arg1.field3509 = 12;
                    arg1.field3514 = class249.field3392[var23];
                    arg1.field3511 = (byte) (12 - arg1.field3514);
                } else {
                    arg1.field3509 = 9;
                    arg1.field3514 = class312.field4574[var23];
                    arg1.field3511 = (byte) (9 - arg1.field3514);
                }
                if ((var25.field1365 & var24) != 0 && !class143.method910(var5, var2, var3, var25.field1365)) {
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var27 = var25.method117(class296.field4257, -1);
                    if (var27 != null) {
                        var27.field5548 = var25;
                        var27.field5542 = var4;
                        var27.field5546 = var2;
                        var27.field5547 = var3;
                        class385.field5587.method1003(2166, var27);
                    }
                }
                class97 var28 = arg1.field3512;
                if (var28 != null && (var28.field1365 & var24) != 0 && !class143.method910(var5, var2, var3, var28.field1365)) {
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var29 = var28.method117(class296.field4257, -1);
                    if (var29 != null) {
                        var29.field5548 = var28;
                        var29.field5542 = var4;
                        var29.field5546 = var2;
                        var29.field5547 = var3;
                        class385.field5587.method1003(2166, var29);
                    }
                }
            }
            if (var26 != null && !class272.method1871(var5, var2, var3, var26.method110(0))) {
                class299 var30 = arg1.field3502;
                class296.field4257.method1737(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field4371 & var24) != 0) {
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var31 = var26.method117(class296.field4257, -1);
                    if (var31 != null) {
                        var31.field5548 = var26;
                        var31.field5542 = var4;
                        var31.field5546 = var2;
                        var31.field5547 = var3;
                        class385.field5587.method1003(2166, var31);
                    }
                } else if (var26.field4371 == 256) {
                    int var32 = var26.field4374 - class422.field6230;
                    int var33 = var26.field4380 - class432.field6360;
                    int var34 = var26.field4378;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    if (var36 < var35) {
                        class382 var37 = var26.method117(class296.field4257, -1);
                        if (var37 != null) {
                            var37.field5548 = var26;
                            var37.field5542 = var4;
                            var37.field5546 = var2;
                            var37.field5547 = var3;
                            class385.field5587.method1003(2166, var37);
                        }
                    } else if (var30 != null) {
                        class382 var38 = var30.method117(class296.field4257, -1);
                        if (var38 != null) {
                            var38.field5548 = var30;
                            var38.field5542 = var4;
                            var38.field5546 = var2;
                            var38.field5547 = var3;
                            class385.field5587.method1003(2166, var38);
                        }
                    }
                }
                class296.field4257.method1737(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class147 var39 = arg1.field3527;
                if (var39 != null && !var39.field2011) {
                    if (var39.field2018) {
                        class296.field4257.method1737(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var40 = var39.method117(class296.field4257, -1);
                    if (var40 != null) {
                        var40.field5548 = var39;
                        var40.field5542 = var4;
                        var40.field5546 = var2;
                        var40.field5547 = var3;
                        class385.field5587.method1003(2166, var40);
                    }
                    if (var39.field2018) {
                        class296.field4257.method1737(3000.0F, var10 * 1.5F);
                    }
                }
                class308 var41 = arg1.field3525;
                if (var41 != null && !var41.field4534) {
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var42 = var41.method117(class296.field4257, -1);
                    if (var42 != null) {
                        var42.field5548 = var41;
                        var42.field5542 = var4;
                        var42.field5546 = var2;
                        var42.field5547 = var3;
                        class385.field5587.method1003(2166, var42);
                    }
                }
            }
            byte var43 = arg1.field3528;
            if (var43 != 0) {
                if (var2 < class104.field1491 && (var43 & 0x4) != 0) {
                    class254 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field3508) {
                        class328.field4782.method560(var44, (byte) 48);
                    }
                }
                if (var3 < class428.field6302 && (var43 & 0x2) != 0) {
                    class254 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field3508) {
                        class328.field4782.method560(var45, (byte) 48);
                    }
                }
                if (var2 > class104.field1491 && (var43 & 0x1) != 0) {
                    class254 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field3508) {
                        class328.field4782.method560(var46, (byte) 48);
                    }
                }
                if (var3 > class428.field6302 && (var43 & 0x8) != 0) {
                    class254 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field3508) {
                        class328.field4782.method560(var47, (byte) 48);
                    }
                }
            }
        }
        if (arg1.field3509 != 0) {
            boolean var48 = true;
            for (class328 var49 = arg1.field3515; var49 != null; var49 = var49.field4783) {
                if (class291.field4165 != var49.field4785.field728 && (var49.field4781 & arg1.field3509) == arg1.field3514) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class97 var50 = arg1.field3510;
                if (!class143.method910(var5, var2, var3, var50.field1365)) {
                    if (class125.field1750) {
                        label687: {
                            if (var50.field1365 >= 16) {
                                int var51 = var2 - class104.field1491;
                                int var52 = var3 - class428.field6302;
                                if (var50.field1365 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class214.field2858) {
                                        class282.method1942(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field1365 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class104.field1436 && var3 < class214.field2858) {
                                        class282.method1942(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field1365 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class104.field1436 && var3 > 0) {
                                        class282.method1942(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field1365 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class282.method1942(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class282.method1942(arg0, var4, var2, var3);
                        }
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var53 = var50.method117(class296.field4257, -1);
                    if (var53 != null) {
                        var53.field5548 = var50;
                        var53.field5542 = var4;
                        var53.field5546 = var2;
                        var53.field5547 = var3;
                        class385.field5587.method1003(2166, var53);
                    }
                }
                arg1.field3509 = 0;
            }
        }
        if (arg1.field3520) {
            try {
                arg1.field3520 = false;
                int var54 = 0;
                label630: for (class328 var55 = arg1.field3515; var55 != null; var55 = var55.field4783) {
                    class55 var56 = var55.field4785;
                    if (class291.field4165 != var56.field728) {
                        for (int var57 = var56.field743; var57 <= var56.field742; var57++) {
                            for (int var58 = var56.field726; var58 <= var56.field737; var58++) {
                                class254 var59 = var8[var57][var58];
                                if (var59.field3501) {
                                    arg1.field3520 = true;
                                    continue label630;
                                }
                                if (var59.field3509 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field743) {
                                        var60++;
                                    }
                                    if (var57 < var56.field742) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field726) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field737) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field3509) == arg1.field3511) {
                                        arg1.field3520 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class104.field1491 - var56.field743;
                        int var62 = var56.field742 - class104.field1491;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class428.field6302 - var56.field726;
                        int var64 = var56.field737 - class428.field6302;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field281[var54] = var56;
                        arg0.field272[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class55 var68 = arg0.field281[var67];
                        if (class291.field4165 != var68.field728) {
                            int var69 = arg0.field272[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field740 - class422.field6230;
                                int var71 = var68.field734 - class432.field6360;
                                int var72 = arg0.field281[var66].field740 - class422.field6230;
                                int var73 = arg0.field281[var66].field734 - class432.field6360;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class55 var74 = arg0.field281[var66];
                    var74.field728 = class291.field4165;
                    if (!class435.method2746(var5, var74.field743, var74.field742, var74.field726, var74.field737, var74.method174(2))) {
                        if (class125.field1750) {
                            if (var74.field736 == 0) {
                                class91.method640(arg0, var4, var74.field743, var74.field726, var74.field742, var74.field737);
                            } else {
                                class282.method1942(arg0, var4, var2, var3);
                                int var75 = var2 - class104.field1491;
                                int var76 = var3 - class428.field6302;
                                if (var74.field736 == 2) {
                                    if (var76 > -var75) {
                                        class349.method2301(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class349.method2301(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class349.method2301(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class349.method2301(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class296.field4257.method1626(arg0.field279, arg0.field277);
                        }
                        class382 var77 = var74.method117(class296.field4257, -1);
                        if (var77 != null) {
                            var77.field5548 = var74;
                            var77.field5542 = var4;
                            var77.field5546 = var74.field743;
                            var77.field5547 = var74.field726;
                            class385.field5587.method1003(2166, var77);
                        }
                    }
                    for (int var78 = var74.field743; var78 <= var74.field742; var78++) {
                        for (int var79 = var74.field726; var79 <= var74.field737; var79++) {
                            class254 var80 = var8[var78][var79];
                            if (var80.field3509 != 0) {
                                class328.field4782.method560(var80, (byte) 48);
                            } else if ((var2 != var78 || var3 != var79) && var80.field3508) {
                                class328.field4782.method560(var80, (byte) 48);
                            }
                        }
                    }
                }
                if (arg1.field3520) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field3520 = false;
            }
        }
        if (arg1.field3505 != null) {
            if ((byte) (class264.field3834 & 0xFF) == arg1.field3504) {
                class352 var81 = arg1.field3505;
                int var82 = class12.field205[var4].method742(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class12.field205[var4].method742(var2, var3) - class12.field205[var4 + 1].method742(var2, var3);
                } else {
                    var83 = 1024;
                }
                class254.field3530.method979(var6, var82, var7, arg0.field273);
                int var84 = arg0.field273[2];
                class254.field3530.method979(var6, var82 - var83, var7, arg0.field273);
                int var85 = arg0.field273[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field5094 = var86;
                var81.field5102 = var87;
                var81.field5098 = true;
                class296.field4257.method1700(var81);
            } else {
                arg1.field3505 = null;
            }
        }
        if (!arg1.field3508) {
            return;
        }
        if (arg1.field3509 != 0) {
            return;
        }
        if (var2 <= class104.field1491 && var2 > class34.field476) {
            class254 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field3508) {
                return;
            }
        }
        if (var2 >= class104.field1491 && var2 < class63.field849 - 1) {
            class254 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field3508) {
                return;
            }
        }
        if (var3 <= class428.field6302 && var3 > class310.field4561) {
            class254 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field3508) {
                return;
            }
        }
        if (var3 >= class428.field6302 && var3 < class5.field65 - 1) {
            class254 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field3508) {
                return;
            }
        }
        arg1.field3508 = false;
        class375.field5462--;
        class308 var92 = arg1.field3525;
        if (var92 != null && var92.field4534) {
            if (class125.field1750) {
                class282.method1942(arg0, var4, var2, var3);
                class296.field4257.method1626(arg0.field279, arg0.field277);
            }
            class382 var93 = var92.method117(class296.field4257, -1);
            if (var93 != null) {
                var93.field5548 = var92;
                var93.field5542 = var4;
                var93.field5546 = var2;
                var93.field5547 = var3;
                class385.field5587.method1003(2166, var93);
            }
        }
        if (arg1.field3513 != 0) {
            class299 var94 = arg1.field3519;
            if (var94 != null && !class272.method1871(var5, var2, var3, var94.method110(0))) {
                if ((var94.field4371 & arg1.field3513) != 0) {
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class382 var95 = var94.method117(class296.field4257, -1);
                    if (var95 != null) {
                        var95.field5548 = var94;
                        var95.field5542 = var4;
                        var95.field5546 = var2;
                        var95.field5547 = var3;
                        class385.field5587.method1003(2166, var95);
                    }
                } else if (var94.field4371 == 256) {
                    int var96 = var94.field4374 - class422.field6230;
                    int var97 = var94.field4380 - class432.field6360;
                    int var98 = var94.field4378;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class125.field1750) {
                        class282.method1942(arg0, var4, var2, var3);
                        class296.field4257.method1626(arg0.field279, arg0.field277);
                    }
                    class299 var101 = arg1.field3502;
                    if (var100 > var99) {
                        class382 var102 = var94.method117(class296.field4257, -1);
                        if (var102 != null) {
                            var102.field5548 = var94;
                            var102.field5542 = var4;
                            var102.field5546 = var2;
                            var102.field5547 = var3;
                            class385.field5587.method1003(2166, var102);
                        }
                    } else if (var101 != null) {
                        class382 var103 = var101.method117(class296.field4257, -1);
                        if (var103 != null) {
                            var103.field5548 = var101;
                            var103.field5542 = var4;
                            var103.field5546 = var2;
                            var103.field5547 = var3;
                            class385.field5587.method1003(2166, var103);
                        }
                    }
                }
            }
            class97 var104 = arg1.field3510;
            class97 var105 = arg1.field3512;
            if (var105 != null && (var105.field1365 & arg1.field3513) != 0 && !class143.method910(var5, var2, var3, var105.field1365)) {
                if (class125.field1750) {
                    class199.method1184(arg0, var105.field1365, var4, var2, var3);
                    class296.field4257.method1626(arg0.field279, arg0.field277);
                }
                class382 var106 = var105.method117(class296.field4257, -1);
                if (var106 != null) {
                    var106.field5548 = var105;
                    var106.field5542 = var4;
                    var106.field5546 = var2;
                    var106.field5547 = var3;
                    class385.field5587.method1003(2166, var106);
                }
            }
            if (var104 != null && (var104.field1365 & arg1.field3513) != 0 && !class143.method910(var5, var2, var3, var104.field1365)) {
                if (class125.field1750) {
                    class199.method1184(arg0, var104.field1365, var4, var2, var3);
                    class296.field4257.method1626(arg0.field279, arg0.field277);
                }
                class382 var107 = var104.method117(class296.field4257, -1);
                if (var107 != null) {
                    var107.field5548 = var104;
                    var107.field5542 = var4;
                    var107.field5546 = var2;
                    var107.field5547 = var3;
                    class385.field5587.method1003(2166, var107);
                }
            }
        }
        if (var4 < class180.field2380 - 1) {
            class254 var108 = class213.field2852[var4 + 1][var2][var3];
            if (var108 != null && var108.field3508) {
                class328.field4782.method554(var108, false);
            }
        }
        if (var2 < class104.field1491) {
            class254 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field3508) {
                class328.field4782.method560(var109, (byte) 48);
            }
        }
        if (var3 < class428.field6302) {
            class254 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field3508) {
                class328.field4782.method560(var110, (byte) 48);
            }
        }
        if (var2 > class104.field1491) {
            class254 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field3508) {
                class328.field4782.method560(var111, (byte) 48);
            }
        }
        if (var3 > class428.field6302) {
            class254 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field3508) {
                class328.field4782.method560(var112, (byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)V")
    public static final void method1023(byte arg0) {
        class26.field370 = class283.field4123.field4596 + class283.field4123.field4578 + 2;
        class65.field859 = new String[500];
        if (arg0 != 107) {
            return;
        }
        field2241++;
        class59.field794 = class191.field2562.field4596 + class191.field2562.field4578 + 2;
        for (int var1 = 0; var1 < class65.field859.length; var1++) {
            class65.field859[var1] = "";
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILnj;)V")
    public final void method1024(int arg0, class228 arg1) {
        int var3 = 75 / ((arg0 + 54) / 60);
        field2235++;
        while (true) {
            int var4 = arg1.method1348(-96);
            if (var4 == 0) {
                return;
            }
            this.method1025(arg1, 121, var4);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lnj;II)V")
    private final void method1025(class228 arg0, int arg1, int arg2) {
        field2239++;
        if (arg2 == 1) {
            this.field2238 = class27.method189(-24769, arg0.method1349(3));
        } else if (arg2 == 2) {
            this.field2236 = 0;
        }
        int var4 = 19 / ((arg1 - 75) / 39);
    }
}
