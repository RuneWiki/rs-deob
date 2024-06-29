import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class156 extends class86 {

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Ldt;")
    public class431 field2268;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field2261 = 0;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIIIIII)V", line = 7)
    public static final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2265++;
        int var7 = arg3 - arg1;
        int var8 = arg0 + arg1;
        for (int var9 = arg0; var9 < var8; var9++) {
            class271.method1736(arg5, arg4, arg6, -11, class23.field356[var9]);
        }
        int var10 = arg5 - arg1;
        int var11 = arg1 + arg6;
        for (int var12 = arg3; var12 > var7; var12--) {
            class271.method1736(arg5, arg4, arg6, -11, class23.field356[var12]);
        }
        if (arg2 != 0) {
            field2263 = -90;
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class23.field356[var13];
            class271.method1736(var11, arg4, arg6, -11, var14);
            class271.method1736(arg5, arg4, var10, arg2 ^ 0xFFFFFFF5, var14);
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(Z)[Lob;", line = 51)
    public static final class266[] method1008(boolean arg0) {
        field2266++;
        if (!arg0) {
            field2263 = -103;
        }
        return new class266[] { class98.field1418, class11.field186, class505.field7533 };
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)I", line = 70)
    public static final int method1009(boolean arg0, int arg1) {
        if (arg0) {
            field2261 = 73;
        }
        field2269++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lco;Ldr;)V", line = 81)
    public static final void method1010(class442 arg0, class420 arg1) {
        if (!arg1.field6266) {
            return;
        }
        short var2 = arg1.field6267;
        short var3 = arg1.field6259;
        byte var4 = arg1.field6272;
        byte var5 = arg1.field6274;
        int var6 = (var2 << class386.field5882) + class380.field5804;
        int var7 = (var3 << class386.field5882) + class380.field5804;
        class420[][] var8 = class380.field5802[var4];
        float var9;
        if (class455.field6683 == class187.field2632) {
            class351.field5447.method1108(class204.field2871[0].method853(var6, var7), class10.method87(var2, var3), class432.method2586(var2, var3), class437.method2611(var2, var3));
            var9 = 251.5F;
        } else {
            var9 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class351.field5447.method1087(3000.0F, var9 * 1.5F);
        if (arg1.field6270) {
            if (class123.field1754) {
                if (var4 > 0) {
                    class420 var10 = class380.field5802[var4 - 1][var2][var3];
                    if (var10 != null && var10.field6266) {
                        return;
                    }
                }
                if (var2 <= class10.field149 && var2 > class350.field5446) {
                    class420 var11 = var8[var2 - 1][var3];
                    if (var11 != null && var11.field6266 && (var11.field6270 || (arg1.field6258 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class10.field149 && var2 < class180.field2570 - 1) {
                    class420 var12 = var8[var2 + 1][var3];
                    if (var12 != null && var12.field6266 && (var12.field6270 || (arg1.field6258 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class29.field458 && var3 > class425.field6327) {
                    class420 var13 = var8[var2][var3 - 1];
                    if (var13 != null && var13.field6266 && (var13.field6270 || (arg1.field6258 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class29.field458 && var3 < class95.field1379 - 1) {
                    class420 var14 = var8[var2][var3 + 1];
                    if (var14 != null && var14.field6266 && (var14.field6270 || (arg1.field6258 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class123.field1754 = true;
            }
            arg1.field6270 = false;
            if (arg1.field6275 != null) {
                class420 var15 = arg1.field6275;
                class351.field5447.method1087(3000.0F, (201.5F - (float) (var15.field6274 + 1) * 50.0F) * 1.5F);
                if (!class263.method1697(var15.field6274, var2, var3)) {
                    class455.field6683[var15.field6274].method842(var2, var3);
                }
                class70 var16 = var15.field6261;
                if (var16 != null) {
                    if (class17.field277) {
                        if ((var16.field967 & arg1.field6279) == 0) {
                            class123.method796(arg0, var4, var2, var3);
                        } else {
                            class295.method1902(arg0, var16.field967, var5, var2, var3);
                        }
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    var16.method51(class351.field5447, -150);
                }
                for (class115 var17 = var15.field6273; var17 != null; var17 = var17.field1600) {
                    class153 var18 = var17.field1594;
                    if (var18 != null) {
                        if (class17.field277) {
                            class123.method796(arg0, var4, var2, var3);
                            class351.field5447.method1106(arg0.field6569, arg0.field6567);
                        }
                        var18.method51(class351.field5447, -150);
                    }
                }
                class351.field5447.method1087(3000.0F, var9 * 1.5F);
            }
            boolean var19 = !class263.method1697(var5, var2, var3);
            if (var19) {
                class455.field6683[var5].method842(var2, var3);
                class383 var20 = arg1.field6260;
                if (var20 != null && var20.field5836) {
                    if (var20.field5839) {
                        class351.field5447.method1087(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var21 = var20.method51(class351.field5447, -150);
                    if (var21 != null) {
                        var21.field7548 = var20;
                        var21.field7544 = var4;
                        var21.field7543 = var2;
                        var21.field7550 = var3;
                        class404.field6112.method2353(var21, -9798);
                    }
                    if (var20.field5839) {
                        class351.field5447.method1087(3000.0F, var9 * 1.5F);
                    }
                }
            }
            int var22 = 0;
            int var23 = 0;
            class70 var24 = arg1.field6261;
            class255 var25 = arg1.field6277;
            if (var24 != null || var25 != null) {
                if (class10.field149 == var2) {
                    var22++;
                } else if (class10.field149 < var2) {
                    var22 += 2;
                }
                if (class29.field458 == var3) {
                    var22 += 3;
                } else if (class29.field458 > var3) {
                    var22 += 6;
                }
                var23 = class316.field4839[var22];
                arg1.field6279 = class117.field1651[var22];
            }
            if (var24 != null) {
                if ((var24.field967 & class190.field2668[var22]) == 0) {
                    arg1.field6281 = 0;
                } else if (var24.field967 == 16) {
                    arg1.field6281 = 3;
                    arg1.field6264 = class290.field4313[var22];
                    arg1.field6276 = (byte) (3 - arg1.field6264);
                } else if (var24.field967 == 32) {
                    arg1.field6281 = 6;
                    arg1.field6264 = class393.field5974[var22];
                    arg1.field6276 = (byte) (6 - arg1.field6264);
                } else if (var24.field967 == 64) {
                    arg1.field6281 = 12;
                    arg1.field6264 = class487.field7141[var22];
                    arg1.field6276 = (byte) (12 - arg1.field6264);
                } else {
                    arg1.field6281 = 9;
                    arg1.field6264 = class27.field450[var22];
                    arg1.field6276 = (byte) (9 - arg1.field6264);
                }
                if ((var24.field967 & var23) != 0 && !class23.method173(var5, var2, var3, var24.field967)) {
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var26 = var24.method51(class351.field5447, -150);
                    if (var26 != null) {
                        var26.field7548 = var24;
                        var26.field7544 = var4;
                        var26.field7543 = var2;
                        var26.field7550 = var3;
                        class404.field6112.method2353(var26, -9798);
                    }
                }
                class70 var27 = arg1.field6271;
                if (var27 != null && (var27.field967 & var23) != 0 && !class23.method173(var5, var2, var3, var27.field967)) {
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var28 = var27.method51(class351.field5447, -150);
                    if (var28 != null) {
                        var28.field7548 = var27;
                        var28.field7544 = var4;
                        var28.field7543 = var2;
                        var28.field7550 = var3;
                        class404.field6112.method2353(var28, -9798);
                    }
                }
            }
            if (var25 != null && !class430.method2583(var5, var2, var3, var25.method509(-4))) {
                class255 var29 = arg1.field6283;
                class351.field5447.method1087(3000.0F, (var9 - 0.5F) * 1.5F);
                if ((var25.field3526 & var23) != 0) {
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var30 = var25.method51(class351.field5447, -150);
                    if (var30 != null) {
                        var30.field7548 = var25;
                        var30.field7544 = var4;
                        var30.field7543 = var2;
                        var30.field7550 = var3;
                        class404.field6112.method2353(var30, -9798);
                    }
                } else if (var25.field3526 == 256) {
                    int var31 = var25.field3534 - class346.field5413;
                    int var32 = var25.field3533 - class178.field2540;
                    int var33 = var25.field3537;
                    int var34;
                    if (var33 == 1 || var33 == 2) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    int var35;
                    if (var33 == 2 || var33 == 3) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    if (var35 < var34) {
                        class507 var36 = var25.method51(class351.field5447, -150);
                        if (var36 != null) {
                            var36.field7548 = var25;
                            var36.field7544 = var4;
                            var36.field7543 = var2;
                            var36.field7550 = var3;
                            class404.field6112.method2353(var36, -9798);
                        }
                    } else if (var29 != null) {
                        class507 var37 = var29.method51(class351.field5447, -150);
                        if (var37 != null) {
                            var37.field7548 = var29;
                            var37.field7544 = var4;
                            var37.field7543 = var2;
                            var37.field7550 = var3;
                            class404.field6112.method2353(var37, -9798);
                        }
                    }
                }
                class351.field5447.method1087(3000.0F, var9 * 1.5F);
            }
            if (var19) {
                class383 var38 = arg1.field6260;
                if (var38 != null && !var38.field5836) {
                    if (var38.field5839) {
                        class351.field5447.method1087(3000.0F, (var9 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var39 = var38.method51(class351.field5447, -150);
                    if (var39 != null) {
                        var39.field7548 = var38;
                        var39.field7544 = var4;
                        var39.field7543 = var2;
                        var39.field7550 = var3;
                        class404.field6112.method2353(var39, -9798);
                    }
                    if (var38.field5839) {
                        class351.field5447.method1087(3000.0F, var9 * 1.5F);
                    }
                }
                class523 var40 = arg1.field6268;
                if (var40 != null && !var40.field7733) {
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var41 = var40.method51(class351.field5447, -150);
                    if (var41 != null) {
                        var41.field7548 = var40;
                        var41.field7544 = var4;
                        var41.field7543 = var2;
                        var41.field7550 = var3;
                        class404.field6112.method2353(var41, -9798);
                    }
                }
            }
            byte var42 = arg1.field6258;
            if (var42 != 0) {
                if (var2 < class10.field149 && (var42 & 0x4) != 0) {
                    class420 var43 = var8[var2 + 1][var3];
                    if (var43 != null && var43.field6266) {
                        class307.field4503.method541(-2, var43);
                    }
                }
                if (var3 < class29.field458 && (var42 & 0x2) != 0) {
                    class420 var44 = var8[var2][var3 + 1];
                    if (var44 != null && var44.field6266) {
                        class307.field4503.method541(-2, var44);
                    }
                }
                if (var2 > class10.field149 && (var42 & 0x1) != 0) {
                    class420 var45 = var8[var2 - 1][var3];
                    if (var45 != null && var45.field6266) {
                        class307.field4503.method541(-2, var45);
                    }
                }
                if (var3 > class29.field458 && (var42 & 0x8) != 0) {
                    class420 var46 = var8[var2][var3 - 1];
                    if (var46 != null && var46.field6266) {
                        class307.field4503.method541(-2, var46);
                    }
                }
            }
        }
        if (arg1.field6281 != 0) {
            boolean var47 = true;
            for (class115 var48 = arg1.field6273; var48 != null; var48 = var48.field1600) {
                if (class168.field2444 != var48.field1594.field2220 && (var48.field1595 & arg1.field6281) == arg1.field6264) {
                    var47 = false;
                    break;
                }
            }
            if (var47) {
                class70 var49 = arg1.field6261;
                if (!class23.method173(var5, var2, var3, var49.field967)) {
                    if (class17.field277) {
                        label682: {
                            if (var49.field967 >= 16) {
                                int var50 = var2 - class10.field149;
                                int var51 = var3 - class29.field458;
                                if (var49.field967 == 16) {
                                    int var52 = var50 - class380.field5804;
                                    int var53 = class380.field5804 + var51;
                                    if (var53 < var52 && var2 > 0 && var3 <= class285.field4248) {
                                        class123.method796(arg0, var4, var2 - 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field967 == 32) {
                                    int var54 = class380.field5804 + var50;
                                    int var55 = class380.field5804 + var51;
                                    if (var55 < -var54 && var2 < class492.field7186 && var3 < class285.field4248) {
                                        class123.method796(arg0, var4, var2 + 1, var3 + 1);
                                        break label682;
                                    }
                                } else if (var49.field967 == 64) {
                                    int var56 = class380.field5804 + var50;
                                    int var57 = var51 - class380.field5804;
                                    if (var57 > var56 && var2 < class492.field7186 && var3 > 0) {
                                        class123.method796(arg0, var4, var2 + 1, var3 - 1);
                                        break label682;
                                    }
                                } else if (var49.field967 == 128) {
                                    int var58 = var50 - class380.field5804;
                                    int var59 = var51 - class380.field5804;
                                    if (var59 > -var58 && var2 > 0 && var3 > 0) {
                                        class123.method796(arg0, var4, var2 - 1, var3 - 1);
                                        break label682;
                                    }
                                }
                            }
                            class123.method796(arg0, var4, var2, var3);
                        }
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var60 = var49.method51(class351.field5447, -150);
                    if (var60 != null) {
                        var60.field7548 = var49;
                        var60.field7544 = var4;
                        var60.field7543 = var2;
                        var60.field7550 = var3;
                        class404.field6112.method2353(var60, -9798);
                    }
                }
                arg1.field6281 = 0;
            }
        }
        if (arg1.field6265) {
            try {
                arg1.field6265 = false;
                int var61 = 0;
                label625: for (class115 var62 = arg1.field6273; var62 != null; var62 = var62.field1600) {
                    class153 var63 = var62.field1594;
                    if (class168.field2444 != var63.field2220) {
                        for (int var64 = var63.field2208; var64 <= var63.field2214; var64++) {
                            for (int var65 = var63.field2216; var65 <= var63.field2213; var65++) {
                                class420 var66 = var8[var64][var65];
                                if (var66.field6270) {
                                    arg1.field6265 = true;
                                    continue label625;
                                }
                                if (var66.field6281 != 0) {
                                    int var67 = 0;
                                    if (var64 > var63.field2208) {
                                        var67++;
                                    }
                                    if (var64 < var63.field2214) {
                                        var67 += 4;
                                    }
                                    if (var65 > var63.field2216) {
                                        var67 += 8;
                                    }
                                    if (var65 < var63.field2213) {
                                        var67 += 2;
                                    }
                                    if ((var67 & var66.field6281) == arg1.field6276) {
                                        arg1.field6265 = true;
                                        continue label625;
                                    }
                                }
                            }
                        }
                        int var68 = class10.field149 - var63.field2208;
                        int var69 = var63.field2214 - class10.field149;
                        if (var69 > var68) {
                            var68 = var69;
                        }
                        int var70 = class29.field458 - var63.field2216;
                        int var71 = var63.field2213 - class29.field458;
                        if (var71 > var70) {
                            var70 = var71;
                        }
                        arg0.field6570[var61] = var63;
                        arg0.field6571[var61++] = var68 + var70;
                    }
                }
                while (var61 > 0) {
                    int var72 = -50;
                    int var73 = -1;
                    for (int var74 = 0; var74 < var61; var74++) {
                        class153 var75 = arg0.field6570[var74];
                        if (class168.field2444 != var75.field2220) {
                            int var76 = arg0.field6571[var74];
                            if (var76 > var72) {
                                var72 = var76;
                                var73 = var74;
                            } else if (var72 == var76) {
                                int var77 = var75.field2217 - class346.field5413;
                                int var78 = var75.field2215 - class178.field2540;
                                int var79 = arg0.field6570[var73].field2217 - class346.field5413;
                                int var80 = arg0.field6570[var73].field2215 - class178.field2540;
                                if (var77 * var77 + var78 * var78 > var79 * var79 + var80 * var80) {
                                    var73 = var74;
                                }
                            }
                        }
                    }
                    if (var73 == -1) {
                        break;
                    }
                    class153 var81 = arg0.field6570[var73];
                    var81.field2220 = class168.field2444;
                    if (!class348.method2215(var5, var81.field2208, var81.field2214, var81.field2216, var81.field2213, var81.method779((byte) 9))) {
                        if (class17.field277) {
                            if (var81.field2206 == 0) {
                                class362.method2291(arg0, var4, var81.field2208, var81.field2216, var81.field2214, var81.field2213);
                            } else {
                                class123.method796(arg0, var4, var2, var3);
                                int var82 = var2 - class10.field149;
                                int var83 = var3 - class29.field458;
                                if (var81.field2206 == 2) {
                                    if (var83 > -var82) {
                                        class207.method1434(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class207.method1434(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var83 > var82) {
                                    class207.method1434(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class207.method1434(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class351.field5447.method1106(arg0.field6569, arg0.field6567);
                        }
                        class507 var84 = var81.method51(class351.field5447, -150);
                        if (var84 != null) {
                            var84.field7548 = var81;
                            var84.field7544 = var4;
                            var84.field7543 = var81.field2208;
                            var84.field7550 = var81.field2216;
                            class404.field6112.method2353(var84, -9798);
                        }
                    }
                    for (int var85 = var81.field2208; var85 <= var81.field2214; var85++) {
                        for (int var86 = var81.field2216; var86 <= var81.field2213; var86++) {
                            class420 var87 = var8[var85][var86];
                            if (var87.field6281 != 0) {
                                class307.field4503.method541(-2, var87);
                            } else if ((var2 != var85 || var3 != var86) && var87.field6266) {
                                class307.field4503.method541(-2, var87);
                            }
                        }
                    }
                }
                if (arg1.field6265) {
                    return;
                }
            } catch (Exception var122) {
                arg1.field6265 = false;
            }
        }
        if (arg1.field6263 != null && (byte) (class332.field5132 & 0xFF) == arg1.field6278) {
            class258 var88 = arg1.field6263;
            int var89 = class455.field6683[var4].method849(var2, var3);
            int var90;
            if (var4 < class222.field3107 - 1) {
                var90 = class455.field6683[var4].method849(var2, var3) - class455.field6683[var4 + 1].method849(var2, var3);
            } else {
                var90 = 0x8 << class386.field5882;
            }
            class164.field2397.method174(var6, var89, var7, arg0.field6575);
            int var91 = arg0.field6575[2];
            class164.field2397.method174(var6, var89 - var90, var7, arg0.field6575);
            int var92 = arg0.field6575[2];
            int var93 = var91;
            int var94 = var92;
            if (var91 > var92) {
                var93 = var92;
                var94 = var91;
            }
            int var95 = var93 - class440.field6551;
            int var96 = class440.field6551 + var94;
            var88.field3606 = var95;
            var88.field3605 = var96;
            var88.field3607 = true;
            class351.field5447.method1042(var88);
        }
        if (!arg1.field6266) {
            return;
        }
        if (arg1.field6281 != 0) {
            return;
        }
        if (var2 <= class10.field149 && var2 > class350.field5446) {
            class420 var97 = var8[var2 - 1][var3];
            if (var97 != null && var97.field6266) {
                return;
            }
        }
        if (var2 >= class10.field149 && var2 < class180.field2570 - 1) {
            class420 var98 = var8[var2 + 1][var3];
            if (var98 != null && var98.field6266) {
                return;
            }
        }
        if (var3 <= class29.field458 && var3 > class425.field6327) {
            class420 var99 = var8[var2][var3 - 1];
            if (var99 != null && var99.field6266) {
                return;
            }
        }
        if (var3 >= class29.field458 && var3 < class95.field1379 - 1) {
            class420 var100 = var8[var2][var3 + 1];
            if (var100 != null && var100.field6266) {
                return;
            }
        }
        arg1.field6266 = false;
        class66.field913--;
        class523 var101 = arg1.field6268;
        if (var101 != null && var101.field7733) {
            if (class17.field277) {
                class123.method796(arg0, var4, var2, var3);
                class351.field5447.method1106(arg0.field6569, arg0.field6567);
            }
            class507 var102 = var101.method51(class351.field5447, -150);
            if (var102 != null) {
                var102.field7548 = var101;
                var102.field7544 = var4;
                var102.field7543 = var2;
                var102.field7550 = var3;
                class404.field6112.method2353(var102, -9798);
            }
        }
        if (arg1.field6279 != 0) {
            class255 var103 = arg1.field6277;
            if (var103 != null && !class430.method2583(var5, var2, var3, var103.method509(-4))) {
                if ((var103.field3526 & arg1.field6279) != 0) {
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class507 var104 = var103.method51(class351.field5447, -150);
                    if (var104 != null) {
                        var104.field7548 = var103;
                        var104.field7544 = var4;
                        var104.field7543 = var2;
                        var104.field7550 = var3;
                        class404.field6112.method2353(var104, -9798);
                    }
                } else if (var103.field3526 == 256) {
                    int var105 = var103.field3534 - class346.field5413;
                    int var106 = var103.field3533 - class178.field2540;
                    int var107 = var103.field3537;
                    int var108;
                    if (var107 == 1 || var107 == 2) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    int var109;
                    if (var107 == 2 || var107 == 3) {
                        var109 = -var106;
                    } else {
                        var109 = var106;
                    }
                    if (class17.field277) {
                        class123.method796(arg0, var4, var2, var3);
                        class351.field5447.method1106(arg0.field6569, arg0.field6567);
                    }
                    class255 var110 = arg1.field6283;
                    if (var109 > var108) {
                        class507 var111 = var103.method51(class351.field5447, -150);
                        if (var111 != null) {
                            var111.field7548 = var103;
                            var111.field7544 = var4;
                            var111.field7543 = var2;
                            var111.field7550 = var3;
                            class404.field6112.method2353(var111, -9798);
                        }
                    } else if (var110 != null) {
                        class507 var112 = var110.method51(class351.field5447, -150);
                        if (var112 != null) {
                            var112.field7548 = var110;
                            var112.field7544 = var4;
                            var112.field7543 = var2;
                            var112.field7550 = var3;
                            class404.field6112.method2353(var112, -9798);
                        }
                    }
                }
            }
            class70 var113 = arg1.field6261;
            class70 var114 = arg1.field6271;
            if (var114 != null && (var114.field967 & arg1.field6279) != 0 && !class23.method173(var5, var2, var3, var114.field967)) {
                if (class17.field277) {
                    class295.method1902(arg0, var114.field967, var4, var2, var3);
                    class351.field5447.method1106(arg0.field6569, arg0.field6567);
                }
                class507 var115 = var114.method51(class351.field5447, -150);
                if (var115 != null) {
                    var115.field7548 = var114;
                    var115.field7544 = var4;
                    var115.field7543 = var2;
                    var115.field7550 = var3;
                    class404.field6112.method2353(var115, -9798);
                }
            }
            if (var113 != null && (var113.field967 & arg1.field6279) != 0 && !class23.method173(var5, var2, var3, var113.field967)) {
                if (class17.field277) {
                    class295.method1902(arg0, var113.field967, var4, var2, var3);
                    class351.field5447.method1106(arg0.field6569, arg0.field6567);
                }
                class507 var116 = var113.method51(class351.field5447, -150);
                if (var116 != null) {
                    var116.field7548 = var113;
                    var116.field7544 = var4;
                    var116.field7543 = var2;
                    var116.field7550 = var3;
                    class404.field6112.method2353(var116, -9798);
                }
            }
        }
        if (var4 < class222.field3107 - 1) {
            class420 var117 = class380.field5802[var4 + 1][var2][var3];
            if (var117 != null && var117.field6266) {
                class307.field4503.method549(var117, (byte) -36);
            }
        }
        if (var2 < class10.field149) {
            class420 var118 = var8[var2 + 1][var3];
            if (var118 != null && var118.field6266) {
                class307.field4503.method541(-2, var118);
            }
        }
        if (var3 < class29.field458) {
            class420 var119 = var8[var2][var3 + 1];
            if (var119 != null && var119.field6266) {
                class307.field4503.method541(-2, var119);
            }
        }
        if (var2 > class10.field149) {
            class420 var120 = var8[var2 - 1][var3];
            if (var120 != null && var120.field6266) {
                class307.field4503.method541(-2, var120);
            }
        }
        if (var3 > class29.field458) {
            class420 var121 = var8[var2][var3 - 1];
            if (var121 != null && var121.field6266) {
                class307.field4503.method541(-2, var121);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ldt;I)V", line = 1201)
    public class156(class431 arg0, int arg1) {
        this.field2267 = arg1;
        this.field2268 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([II)Ljava/lang/String;", line = 1212)
    public static final String method1011(int[] arg0, int arg1) {
        field2264++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class158.field2288;
        for (int var4 = arg1; var4 < arg0.length; var4++) {
            class494 var5 = class525.field7770.method268(arg0[var4], (byte) -20);
            if (var5.field7211 != -1) {
                class191 var6 = (class191) class130.field1894.method1013((long) var5.field7211, (byte) -106);
                if (var6 == null) {
                    class476 var7 = class476.method2845(class113.field1576, var5.field7211, 0);
                    if (var7 != null) {
                        var6 = class337.field5242.method1117(var7, true);
                        class130.field1894.method1012(arg1 ^ 0xFFFFFF8D, (long) var5.field7211, var6);
                    }
                }
                if (var6 != null) {
                    class55.field748[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1005(boolean arg0);

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1006(byte arg0);
}
