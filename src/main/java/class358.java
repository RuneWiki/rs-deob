import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class358 extends InputStream {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field5240 = -1;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Z")
    public static boolean field5244 = false;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field5243 = 127;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field5245 = -1;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    public static int[] field5246 = new int[50];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lqa;")
    public static class243 field5239;

    @OriginalMember(owner = "client!md", name = "read", descriptor = "()I")
    public final int read() {
        class404.method2628(-126, 30000L);
        field5242++;
        return -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Las;")
    public static final class177 method2346(int arg0) {
        field5251++;
        if (arg0 != 3) {
            method2354((byte) -3);
        }
        return class76.field1019;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILnr;IBILlo;Los;Lkb;)V")
    public static final void method2347(int arg0, class437 arg1, int arg2, byte arg3, int arg4, class419 arg5, class378 arg6, class80 arg7) {
        field5237++;
        int var8 = arg5.field6232 - (arg2 / 2) - 5;
        int var9 = arg0 + 2;
        if (arg7.field1111 != 0) {
            arg1.method2766(arg2 + 10, arg6.method2503() * arg4 + arg0 - var9 + 1, var8, var9, arg7.field1111, arg3 ^ 0xFFFFFF87);
        }
        if (arg7.field1114 != 0) {
            arg1.method2774((arg0 + (arg6.method2503() * arg4)) + 1 - var9, var8, arg2 + 10, false, var9, arg7.field1114);
        }
        if (arg3 != 38) {
            field5243 = 119;
        }
        int var10 = arg7.field1089;
        if (arg5.field6222 && arg7.field1125 != -1) {
            var10 = arg7.field1125;
        }
        for (int var11 = 0; var11 < arg4; var11++) {
            String var12 = class433.field6390[var11];
            if (var11 < (arg4 - 1)) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method2509(arg1, var12, arg5.field6232, arg0, var10, true);
            arg0 += arg6.method2503();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loq;Lpm;)V")
    public static final void method2348(class120 arg0, class10 arg1) {
        if (!arg1.field118) {
            return;
        }
        short var2 = arg1.field101;
        short var3 = arg1.field114;
        byte var4 = arg1.field113;
        byte var5 = arg1.field116;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class10[][] var8 = class343.field5032[var4];
        float var10;
        if (class88.field1226 == class425.field6324) {
            int var9 = class274.field4030[var2][var3];
            class310.field4442.method2041(class198.field2829[0].method797(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 201.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class310.field4442.method2107(3000.0F, var10 * 1.5F);
        if (arg1.field105) {
            if (class444.field6471) {
                if (var4 > 0) {
                    class10 var11 = class343.field5032[var4 - 1][var2][var3];
                    if (var11 != null && var11.field118) {
                        return;
                    }
                }
                if (var2 <= class308.field4398 && var2 > class398.field5961) {
                    class10 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field118 && (var12.field105 || (arg1.field104 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class308.field4398 && var2 < class110.field1519 - 1) {
                    class10 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field118 && (var13.field105 || (arg1.field104 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class383.field5729 && var3 > class349.field5181) {
                    class10 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field118 && (var14.field105 || (arg1.field104 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class383.field5729 && var3 < class265.field3905 - 1) {
                    class10 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field118 && (var15.field105 || (arg1.field104 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class444.field6471 = true;
            }
            arg1.field105 = false;
            if (arg1.field103 != null) {
                class10 var16 = arg1.field103;
                class310.field4442.method2107(3000.0F, (201.5F - (float) (var16.field116 + 1) * 50.0F) * 1.5F);
                if (!class54.method374(var16.field116, var2, var3)) {
                    class88.field1226[var16.field116].method786(var2, var3);
                }
                class349 var17 = var16.field117;
                if (var17 != null) {
                    if (class164.field2130) {
                        if ((var17.field5176 & arg1.field115) == 0) {
                            class433.method2751(arg0, var4, var2, var3);
                        } else {
                            class396.method2590(arg0, var17.field5176, var5, var2, var3);
                        }
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    var17.method145(class310.field4442, false);
                }
                for (class39 var18 = var16.field109; var18 != null; var18 = var18.field627) {
                    class361 var19 = var18.field621;
                    if (var19 != null) {
                        if (class164.field2130) {
                            class433.method2751(arg0, var4, var2, var3);
                            class310.field4442.method2151(arg0.field1611, arg0.field1610);
                        }
                        var19.method145(class310.field4442, false);
                    }
                }
                class310.field4442.method2107(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class54.method374(var5, var2, var3);
            if (var20) {
                class88.field1226[var5].method786(var2, var3);
                class381 var21 = arg1.field124;
                if (var21 != null && var21.field5718) {
                    if (var21.field5716) {
                        class310.field4442.method2107(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var22 = var21.method145(class310.field4442, false);
                    if (var22 != null) {
                        var22.field6384 = var21;
                        var22.field6382 = var4;
                        var22.field6389 = var2;
                        var22.field6385 = var3;
                        class357.field5232.method974(var22, (byte) -128);
                    }
                    if (var21.field5716) {
                        class310.field4442.method2107(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class349 var25 = arg1.field117;
            class164 var26 = arg1.field123;
            if (var25 != null || var26 != null) {
                if (class308.field4398 == var2) {
                    var23++;
                } else if (class308.field4398 < var2) {
                    var23 += 2;
                }
                if (class383.field5729 == var3) {
                    var23 += 3;
                } else if (class383.field5729 > var3) {
                    var23 += 6;
                }
                var24 = class311.field4452[var23];
                arg1.field115 = class247.field3448[var23];
            }
            if (var25 != null) {
                if ((var25.field5176 & class26.field449[var23]) == 0) {
                    arg1.field112 = 0;
                } else if (var25.field5176 == 16) {
                    arg1.field112 = 3;
                    arg1.field107 = class348.field5171[var23];
                    arg1.field110 = (byte) (3 - arg1.field107);
                } else if (var25.field5176 == 32) {
                    arg1.field112 = 6;
                    arg1.field107 = class29.field498[var23];
                    arg1.field110 = (byte) (6 - arg1.field107);
                } else if (var25.field5176 == 64) {
                    arg1.field112 = 12;
                    arg1.field107 = class236.field3322[var23];
                    arg1.field110 = (byte) (12 - arg1.field107);
                } else {
                    arg1.field112 = 9;
                    arg1.field107 = class34.field554[var23];
                    arg1.field110 = (byte) (9 - arg1.field107);
                }
                if ((var25.field5176 & var24) != 0 && !class130.method886(var5, var2, var3, var25.field5176)) {
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var27 = var25.method145(class310.field4442, false);
                    if (var27 != null) {
                        var27.field6384 = var25;
                        var27.field6382 = var4;
                        var27.field6389 = var2;
                        var27.field6385 = var3;
                        class357.field5232.method974(var27, (byte) -111);
                    }
                }
                class349 var28 = arg1.field120;
                if (var28 != null && (var28.field5176 & var24) != 0 && !class130.method886(var5, var2, var3, var28.field5176)) {
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var29 = var28.method145(class310.field4442, false);
                    if (var29 != null) {
                        var29.field6384 = var28;
                        var29.field6382 = var4;
                        var29.field6389 = var2;
                        var29.field6385 = var3;
                        class357.field5232.method974(var29, (byte) -122);
                    }
                }
            }
            if (var26 != null && !class63.method407(var5, var2, var3, var26.method293(-87))) {
                class164 var30 = arg1.field102;
                class310.field4442.method2107(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field2125 & var24) != 0) {
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var31 = var26.method145(class310.field4442, false);
                    if (var31 != null) {
                        var31.field6384 = var26;
                        var31.field6382 = var4;
                        var31.field6389 = var2;
                        var31.field6385 = var3;
                        class357.field5232.method974(var31, (byte) -123);
                    }
                } else if (var26.field2125 == 256) {
                    int var32 = var26.field2132 - class146.field1926;
                    int var33 = var26.field2135 - class239.field3369;
                    int var34 = var26.field2126;
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
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    if (var36 < var35) {
                        class433 var37 = var26.method145(class310.field4442, false);
                        if (var37 != null) {
                            var37.field6384 = var26;
                            var37.field6382 = var4;
                            var37.field6389 = var2;
                            var37.field6385 = var3;
                            class357.field5232.method974(var37, (byte) -126);
                        }
                    } else if (var30 != null) {
                        class433 var38 = var30.method145(class310.field4442, false);
                        if (var38 != null) {
                            var38.field6384 = var30;
                            var38.field6382 = var4;
                            var38.field6389 = var2;
                            var38.field6385 = var3;
                            class357.field5232.method974(var38, (byte) -128);
                        }
                    }
                }
                class310.field4442.method2107(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class381 var39 = arg1.field124;
                if (var39 != null && !var39.field5718) {
                    if (var39.field5716) {
                        class310.field4442.method2107(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var40 = var39.method145(class310.field4442, false);
                    if (var40 != null) {
                        var40.field6384 = var39;
                        var40.field6382 = var4;
                        var40.field6389 = var2;
                        var40.field6385 = var3;
                        class357.field5232.method974(var40, (byte) -126);
                    }
                    if (var39.field5716) {
                        class310.field4442.method2107(3000.0F, var10 * 1.5F);
                    }
                }
                class60 var41 = arg1.field121;
                if (var41 != null && !var41.field873) {
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var42 = var41.method145(class310.field4442, false);
                    if (var42 != null) {
                        var42.field6384 = var41;
                        var42.field6382 = var4;
                        var42.field6389 = var2;
                        var42.field6385 = var3;
                        class357.field5232.method974(var42, (byte) -111);
                    }
                }
            }
            byte var43 = arg1.field104;
            if (var43 != 0) {
                if (var2 < class308.field4398 && (var43 & 0x4) != 0) {
                    class10 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field118) {
                        class30.field514.method264((byte) 121, var44);
                    }
                }
                if (var3 < class383.field5729 && (var43 & 0x2) != 0) {
                    class10 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field118) {
                        class30.field514.method264((byte) 121, var45);
                    }
                }
                if (var2 > class308.field4398 && (var43 & 0x1) != 0) {
                    class10 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field118) {
                        class30.field514.method264((byte) 121, var46);
                    }
                }
                if (var3 > class383.field5729 && (var43 & 0x8) != 0) {
                    class10 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field118) {
                        class30.field514.method264((byte) 121, var47);
                    }
                }
            }
        }
        if (arg1.field112 != 0) {
            boolean var48 = true;
            for (class39 var49 = arg1.field109; var49 != null; var49 = var49.field627) {
                if (class246.field3431 != var49.field621.field5301 && (var49.field622 & arg1.field112) == arg1.field107) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class349 var50 = arg1.field117;
                if (!class130.method886(var5, var2, var3, var50.field5176)) {
                    if (class164.field2130) {
                        label687: {
                            if (var50.field5176 >= 16) {
                                int var51 = var2 - class308.field4398;
                                int var52 = var3 - class383.field5729;
                                if (var50.field5176 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class413.field6175) {
                                        class433.method2751(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5176 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class308.field4403 && var3 < class413.field6175) {
                                        class433.method2751(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5176 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class308.field4403 && var3 > 0) {
                                        class433.method2751(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field5176 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class433.method2751(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class433.method2751(arg0, var4, var2, var3);
                        }
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var53 = var50.method145(class310.field4442, false);
                    if (var53 != null) {
                        var53.field6384 = var50;
                        var53.field6382 = var4;
                        var53.field6389 = var2;
                        var53.field6385 = var3;
                        class357.field5232.method974(var53, (byte) -113);
                    }
                }
                arg1.field112 = 0;
            }
        }
        if (arg1.field122) {
            try {
                arg1.field122 = false;
                int var54 = 0;
                label630: for (class39 var55 = arg1.field109; var55 != null; var55 = var55.field627) {
                    class361 var56 = var55.field621;
                    if (class246.field3431 != var56.field5301) {
                        for (int var57 = var56.field5296; var57 <= var56.field5293; var57++) {
                            for (int var58 = var56.field5288; var58 <= var56.field5286; var58++) {
                                class10 var59 = var8[var57][var58];
                                if (var59.field105) {
                                    arg1.field122 = true;
                                    continue label630;
                                }
                                if (var59.field112 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field5296) {
                                        var60++;
                                    }
                                    if (var57 < var56.field5293) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field5288) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field5286) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field112) == arg1.field110) {
                                        arg1.field122 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class308.field4398 - var56.field5296;
                        int var62 = var56.field5293 - class308.field4398;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class383.field5729 - var56.field5288;
                        int var64 = var56.field5286 - class383.field5729;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field1609[var54] = var56;
                        arg0.field1613[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class361 var68 = arg0.field1609[var67];
                        if (class246.field3431 != var68.field5301) {
                            int var69 = arg0.field1613[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field5284 - class146.field1926;
                                int var71 = var68.field5298 - class239.field3369;
                                int var72 = arg0.field1609[var66].field5284 - class146.field1926;
                                int var73 = arg0.field1609[var66].field5298 - class239.field3369;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class361 var74 = arg0.field1609[var66];
                    var74.field5301 = class246.field3431;
                    if (!class157.method1001(var5, var74.field5296, var74.field5293, var74.field5288, var74.field5286, var74.method194(-86))) {
                        if (class164.field2130) {
                            if (var74.field5292 == 0) {
                                class244.method1502(arg0, var4, var74.field5296, var74.field5288, var74.field5293, var74.field5286);
                            } else {
                                class433.method2751(arg0, var4, var2, var3);
                                int var75 = var2 - class308.field4398;
                                int var76 = var3 - class383.field5729;
                                if (var74.field5292 == 2) {
                                    if (var76 > -var75) {
                                        class5.method47(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class5.method47(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class5.method47(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class5.method47(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class310.field4442.method2151(arg0.field1611, arg0.field1610);
                        }
                        class433 var77 = var74.method145(class310.field4442, false);
                        if (var77 != null) {
                            var77.field6384 = var74;
                            var77.field6382 = var4;
                            var77.field6389 = var74.field5296;
                            var77.field6385 = var74.field5288;
                            class357.field5232.method974(var77, (byte) -127);
                        }
                    }
                    for (int var78 = var74.field5296; var78 <= var74.field5293; var78++) {
                        for (int var79 = var74.field5288; var79 <= var74.field5286; var79++) {
                            class10 var80 = var8[var78][var79];
                            if (var80.field112 != 0) {
                                class30.field514.method264((byte) 121, var80);
                            } else if ((var2 != var78 || var3 != var79) && var80.field118) {
                                class30.field514.method264((byte) 121, var80);
                            }
                        }
                    }
                }
                if (arg1.field122) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field122 = false;
            }
        }
        if (arg1.field108 != null) {
            if ((byte) (class204.field2953 & 0xFF) == arg1.field119) {
                class125 var81 = arg1.field108;
                int var82 = class88.field1226[var4].method781(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class88.field1226[var4].method781(var2, var3) - class88.field1226[var4 + 1].method781(var2, var3);
                } else {
                    var83 = 1024;
                }
                class196.field2800.method814(var6, var82, var7, arg0.field1608);
                int var84 = arg0.field1608[2];
                class196.field2800.method814(var6, var82 - var83, var7, arg0.field1608);
                int var85 = arg0.field1608[2];
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
                var81.field1669 = var86;
                var81.field1670 = var87;
                var81.field1671 = true;
                class310.field4442.method2083(var81);
            } else {
                arg1.field108 = null;
            }
        }
        if (!arg1.field118) {
            return;
        }
        if (arg1.field112 != 0) {
            return;
        }
        if (var2 <= class308.field4398 && var2 > class398.field5961) {
            class10 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field118) {
                return;
            }
        }
        if (var2 >= class308.field4398 && var2 < class110.field1519 - 1) {
            class10 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field118) {
                return;
            }
        }
        if (var3 <= class383.field5729 && var3 > class349.field5181) {
            class10 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field118) {
                return;
            }
        }
        if (var3 >= class383.field5729 && var3 < class265.field3905 - 1) {
            class10 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field118) {
                return;
            }
        }
        arg1.field118 = false;
        class16.field181--;
        class60 var92 = arg1.field121;
        if (var92 != null && var92.field873) {
            if (class164.field2130) {
                class433.method2751(arg0, var4, var2, var3);
                class310.field4442.method2151(arg0.field1611, arg0.field1610);
            }
            class433 var93 = var92.method145(class310.field4442, false);
            if (var93 != null) {
                var93.field6384 = var92;
                var93.field6382 = var4;
                var93.field6389 = var2;
                var93.field6385 = var3;
                class357.field5232.method974(var93, (byte) -111);
            }
        }
        if (arg1.field115 != 0) {
            class164 var94 = arg1.field123;
            if (var94 != null && !class63.method407(var5, var2, var3, var94.method293(-59))) {
                if ((var94.field2125 & arg1.field115) != 0) {
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class433 var95 = var94.method145(class310.field4442, false);
                    if (var95 != null) {
                        var95.field6384 = var94;
                        var95.field6382 = var4;
                        var95.field6389 = var2;
                        var95.field6385 = var3;
                        class357.field5232.method974(var95, (byte) -114);
                    }
                } else if (var94.field2125 == 256) {
                    int var96 = var94.field2132 - class146.field1926;
                    int var97 = var94.field2135 - class239.field3369;
                    int var98 = var94.field2126;
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
                    if (class164.field2130) {
                        class433.method2751(arg0, var4, var2, var3);
                        class310.field4442.method2151(arg0.field1611, arg0.field1610);
                    }
                    class164 var101 = arg1.field102;
                    if (var100 > var99) {
                        class433 var102 = var94.method145(class310.field4442, false);
                        if (var102 != null) {
                            var102.field6384 = var94;
                            var102.field6382 = var4;
                            var102.field6389 = var2;
                            var102.field6385 = var3;
                            class357.field5232.method974(var102, (byte) -112);
                        }
                    } else if (var101 != null) {
                        class433 var103 = var101.method145(class310.field4442, false);
                        if (var103 != null) {
                            var103.field6384 = var101;
                            var103.field6382 = var4;
                            var103.field6389 = var2;
                            var103.field6385 = var3;
                            class357.field5232.method974(var103, (byte) -125);
                        }
                    }
                }
            }
            class349 var104 = arg1.field117;
            class349 var105 = arg1.field120;
            if (var105 != null && (var105.field5176 & arg1.field115) != 0 && !class130.method886(var5, var2, var3, var105.field5176)) {
                if (class164.field2130) {
                    class396.method2590(arg0, var105.field5176, var4, var2, var3);
                    class310.field4442.method2151(arg0.field1611, arg0.field1610);
                }
                class433 var106 = var105.method145(class310.field4442, false);
                if (var106 != null) {
                    var106.field6384 = var105;
                    var106.field6382 = var4;
                    var106.field6389 = var2;
                    var106.field6385 = var3;
                    class357.field5232.method974(var106, (byte) -112);
                }
            }
            if (var104 != null && (var104.field5176 & arg1.field115) != 0 && !class130.method886(var5, var2, var3, var104.field5176)) {
                if (class164.field2130) {
                    class396.method2590(arg0, var104.field5176, var4, var2, var3);
                    class310.field4442.method2151(arg0.field1611, arg0.field1610);
                }
                class433 var107 = var104.method145(class310.field4442, false);
                if (var107 != null) {
                    var107.field6384 = var104;
                    var107.field6382 = var4;
                    var107.field6389 = var2;
                    var107.field6385 = var3;
                    class357.field5232.method974(var107, (byte) -121);
                }
            }
        }
        if (var4 < class137.field1817 - 1) {
            class10 var108 = class343.field5032[var4 + 1][var2][var3];
            if (var108 != null && var108.field118) {
                class30.field514.method270(5000, var108);
            }
        }
        if (var2 < class308.field4398) {
            class10 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field118) {
                class30.field514.method264((byte) 121, var109);
            }
        }
        if (var3 < class383.field5729) {
            class10 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field118) {
                class30.field514.method264((byte) 121, var110);
            }
        }
        if (var2 > class308.field4398) {
            class10 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field118) {
                class30.field514.method264((byte) 121, var111);
            }
        }
        if (var3 > class383.field5729) {
            class10 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field118) {
                class30.field514.method264((byte) 121, var112);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BB)V")
    public static final void method2349(byte arg0, byte arg1) {
        if (class115.field1566 == null) {
            class115.field1566 = new byte[4][class324.field4652][class336.field4964];
        }
        field5236++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class324.field4652; var3++) {
                for (int var4 = 0; var4 < class336.field4964; var4++) {
                    class115.field1566[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 >= -26) {
            field5244 = false;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method2350(byte arg0) {
        field5239 = null;
        field5246 = null;
        if (arg0 != 41) {
            field5240 = 127;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(CZI)C")
    public static final char method2351(char arg0, boolean arg1, int arg2) {
        field5248++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            if (arg1) {
                field5244 = false;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Lhq;")
    public static final class174 method2352(boolean arg0) {
        field5247++;
        try {
            if (arg0) {
                field5240 = 123;
            }
            return (class174) Class.forName("fs").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lnr;Lcb;III)V")
    public static final void method2353(class437 arg0, class387 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class308.field4403) {
            class10 var5 = class343.field5032[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field124 != null && var5.field124.method151((byte) -115)) {
                arg1.method153((byte) -127, arg0, 0, 128, true, var5.field124, 0);
            }
        }
        if (arg4 < class308.field4403) {
            class10 var6 = class343.field5032[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field124 != null && var6.field124.method151((byte) -115)) {
                arg1.method153((byte) -123, arg0, 128, 0, true, var6.field124, 0);
            }
        }
        if (arg3 < class308.field4403 && arg4 < class413.field6175) {
            class10 var7 = class343.field5032[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field124 != null && var7.field124.method151((byte) -115)) {
                arg1.method153((byte) -118, arg0, 128, 128, true, var7.field124, 0);
            }
        }
        if (arg3 < class308.field4403 && arg4 > 0) {
            class10 var8 = class343.field5032[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field124 != null && var8.field124.method151((byte) -115)) {
                arg1.method153((byte) -117, arg0, -128, 128, true, var8.field124, 0);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static final void method2354(byte arg0) {
        class394.field5916.method212(-121);
        if (arg0 == 101) {
            field5241++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)Lro;")
    public static final class249 method2355(int arg0, int arg1, byte arg2) {
        field5238++;
        if (arg2 >= -99) {
            return null;
        }
        class249 var3 = class107.method746(arg1, -128);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field3493 == null || var3.field3493.length <= arg0) {
            return null;
        } else {
            return var3.field3493[arg0];
        }
    }
}
