import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class242 {

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Ldj;")
    private class191 field3582 = new class191(256);

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Ldj;")
    private class191 field3584 = new class191(256);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Ltj;")
    private class108 field3568;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Ltj;")
    private class108 field3571;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3573 = 2;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3574 = 0;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Z")
    public static boolean field3580 = false;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lmn;")
    public static class206 field3575;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBI)Lbg;")
    public final class272 method1647(int[] arg0, byte arg1, int arg2) {
        field3576++;
        if (this.field3568.method633(2) == 1) {
            return this.method1650((byte) 66, arg2, arg0, 0);
        } else if (this.field3568.method651(0, arg2) == 1) {
            return this.method1650((byte) 56, 0, arg0, arg2);
        } else {
            if (arg1 > -87) {
                field3580 = false;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method1648(int arg0) {
        class15 var1 = class19.field256;
        synchronized (class19.field256) {
            if (arg0 > 0) {
                field3573 = -74;
            }
            class19.field256.method98(0);
        }
        field3578++;
        class15 var2 = class245.field3657;
        synchronized (class245.field3657) {
            class245.field3657.method98(0);
        }
        class15 var3 = class142.field2146;
        synchronized (class142.field2146) {
            class142.field2146.method98(0);
        }
        class15 var4 = class397.field5583;
        synchronized (class397.field5583) {
            class397.field5583.method98(0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI[I)Lbg;")
    private final class272 method1649(int arg0, boolean arg1, int arg2, int[] arg3) {
        field3569++;
        int var5 = (arg2 << 4 & 0xFFF7 | arg2 >>> 12) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class272 var9 = (class272) this.field3584.method1373(var7, 124);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class383 var10 = class383.method2436(this.field3571, arg2, arg0);
            if (var10 == null) {
                return null;
            } else if (arg1) {
                class272 var11 = var10.method2438();
                this.field3584.method1376(var11, var7, 75);
                if (arg3 != null) {
                    arg3[0] -= var11.field3957.length;
                }
                return var11;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI[II)Lbg;")
    private final class272 method1650(byte arg0, int arg1, int[] arg2, int arg3) {
        field3577++;
        int var5 = arg1 ^ (arg3 << 4 & 0xFFF9 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        int var7 = 26 % ((arg0 + 41) / 45);
        long var8 = (long) var6 ^ 0x100000000L;
        class272 var10 = (class272) this.field3584.method1373(var8, 117);
        if (var10 != null) {
            return var10;
        } else if (arg2 == null || arg2[0] > 0) {
            class11 var11 = (class11) this.field3582.method1373(var8, 126);
            if (var11 == null) {
                var11 = class11.method63(this.field3568, arg3, arg1);
                if (var11 == null) {
                    return null;
                }
                this.field3582.method1376(var11, var8, 72);
            }
            class272 var12 = var11.method55(arg2);
            if (var12 == null) {
                return null;
            } else {
                var11.method2660((byte) 113);
                this.field3584.method1376(var12, var8, 79);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1651(byte arg0) {
        int var1 = -24 / ((-arg0 - 8) / 58);
        field3579++;
        class405.field5681.method98(0);
        class83.field1056.method98(0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB[I)Lbg;")
    public final class272 method1652(int arg0, byte arg1, int[] arg2) {
        field3570++;
        if (this.field3571.method633(2) == 1) {
            return this.method1649(arg0, true, 0, arg2);
        }
        if (arg1 >= -110) {
            method1653(91, 113, -117, (class223[]) null, -58, -108, -9, 94, 113, 87);
        }
        if (this.field3571.method651(0, arg0) != 1) {
            throw new RuntimeException();
        }
        return this.method1649(0, true, arg0, arg2);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[Lbr;IIIIII)V")
    public static final void method1653(int arg0, int arg1, int arg2, class223[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3583++;
        class59.field786.method937(arg4, arg2, arg1, arg6);
        if (arg8 != 15) {
            field3573 = -65;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class223 var11 = arg3[var10];
            if (var11 != null && (var11.field3212 == arg7 || arg7 == -1412584499 && class327.field4749 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class85.field1086[class10.field129].setBounds(var11.field3187 + arg0, var11.field3191 - -arg5, var11.field3250, var11.field3282);
                    var12 = class10.field129++;
                } else {
                    var12 = arg9;
                }
                var11.field3233 = var12;
                var11.field3329 = class34.field434;
                if (!client.method1182(var11)) {
                    if (var11.field3281 > 0) {
                        class102.method594(true, var11);
                    }
                    int var13 = var11.field3187 + arg0;
                    int var14 = var11.field3191 + arg5;
                    int var15 = var11.field3321;
                    if (class450.field6455 && (client.method1168(var11).field1055 != 0 || var11.field3208 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class327.field4749 == var11) {
                        if (arg7 != -1412584499 && !var11.field3253) {
                            class187.field2662 = arg3;
                            class70.field935 = arg5;
                            class97.field1235 = arg0;
                            continue;
                        }
                        if (class94.field1197 && class346.field5032) {
                            int var16 = class270.field3949.method536(0);
                            int var17 = class270.field3949.method543(arg8 ^ 0x8);
                            int var18 = var16 - class129.field1817;
                            int var19 = var17 - class447.field6384;
                            if (class260.field3843 > var18) {
                                var18 = class260.field3843;
                            }
                            if (class79.field1019 > var19) {
                                var19 = class79.field1019;
                            }
                            if (var18 + var11.field3250 > class260.field3843 + class363.field5212.field3250) {
                                var18 = class260.field3843 + class363.field5212.field3250 - var11.field3250;
                            }
                            var13 = var18;
                            if (class79.field1019 + class363.field5212.field3282 < var11.field3282 + var19) {
                                var19 = class79.field1019 + class363.field5212.field3282 - var11.field3282;
                            }
                            var14 = var19;
                        }
                        if (!var11.field3253) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field3208 == 2) {
                        var23 = arg4;
                        var25 = arg1;
                        var24 = arg6;
                        var22 = arg2;
                    } else {
                        int var20 = var11.field3250 + var13;
                        int var21 = var14 + var11.field3282;
                        var22 = arg2 >= var14 ? arg2 : var14;
                        var23 = arg4 < var13 ? var13 : arg4;
                        if (var11.field3208 == 9) {
                            var20++;
                            var21++;
                        }
                        var24 = arg6 <= var21 ? arg6 : var21;
                        var25 = var20 >= arg1 ? arg1 : var20;
                    }
                    if (var25 > var23 && var22 < var24) {
                        if (var11.field3281 != 0) {
                            if (var11.field3281 == 1337 || var11.field3281 == 1403) {
                                class247.method1727(var13, var14, var11.field3281 == 1403, 23488, var11.field3250, var11.field3282);
                                class353.field5126[var12] = true;
                                class59.field786.method937(arg4, arg2, arg1, arg6);
                                continue;
                            }
                            if (var11.field3281 == 1338) {
                                if (var11.method1567((byte) 122, class59.field786) != null) {
                                    class127.method769(0);
                                    class100.method583(class59.field786, var14, -106, var11, var13);
                                    class336.field4875[var12] = true;
                                    class59.field786.method937(arg4, arg2, arg1, arg6);
                                }
                                continue;
                            }
                            if (var11.field3281 == 1339) {
                                if (var11.method1567((byte) 122, class59.field786) != null) {
                                    class426.method2664(var14, var11, var13, 125);
                                    class336.field4875[var12] = true;
                                    class59.field786.method937(arg4, arg2, arg1, arg6);
                                }
                                continue;
                            }
                            if (var11.field3281 == 1400) {
                                class43.method292(class321.field4701, class59.field786, var14, var11.field3250, var11.field3282, var13, false);
                                class353.field5126[var12] = true;
                                class59.field786.method937(arg4, arg2, arg1, arg6);
                                continue;
                            }
                            if (var11.field3281 == 1401) {
                                class88.method528(var11.field3250, var14, arg8 + 8, var13, class59.field786, var11.field3282);
                                class353.field5126[var12] = true;
                                class59.field786.method937(arg4, arg2, arg1, arg6);
                                continue;
                            }
                            if (var11.field3281 == 1405) {
                                if (!class59.field791 && !class58.field783) {
                                    continue;
                                }
                                int var26 = var11.field3250 + var13;
                                int var27 = var14 + 15;
                                if (class59.field791) {
                                    class402.field5648.method2206(var26, -1, "Fps:" + class97.field1238, (byte) 81, var27, -256);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class402.field5648.method2206(var26, -1, "Mem:" + var29 + "k", (byte) 81, var27, var30);
                                    var27 += 15;
                                    int var31 = class59.field786.method895() / 1024;
                                    class402.field5648.method2206(var26, -1, "Offheap:" + var31 + "k", (byte) 81, var27, var31 > 65536 ? -65536 : -256);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class258.field3825[var35].method1284(10);
                                        var33 += class258.field3825[var35].method1280((byte) -88);
                                        var34 += class258.field3825[var35].method1282((byte) 67);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class214.method1498((long) var37, true, 2, 0, true) + "% (" + var36 + "%)";
                                    class32.field409.method2206(var26, -1, var38, (byte) 81, var27, -256);
                                    var27 += 12;
                                }
                                if (class56.field748 > 0) {
                                    class32.field409.method2206(var26, -1, "Particles: " + class317.field4655 + " / " + class56.field748, (byte) 81, var27, -256);
                                }
                                var27 += 12;
                                if (class58.field783) {
                                    class32.field409.method2206(var26, -1, "Polys: " + class59.field786.method959() + " Models: " + class59.field786.method896(), (byte) 81, var27, -256);
                                    var27 += 12;
                                    class32.field409.method2206(var26, -1, "Ls: " + class433.field6191 + " La: " + class114.field1472 + " NPC: " + class189.field2705 + " Pl: " + class439.field6268, (byte) 81, var27, -256);
                                    class47.method305(0);
                                    var27 += 12;
                                }
                                class353.field5126[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field3208 == 0) {
                            if (var11.field3281 == 1407 && class59.field786.method971()) {
                                class59.field786.method924(var13, var14, var11.field3250, var11.field3282);
                            }
                            method1653(var13 - var11.field3341, var25, var22, arg3, var23, var14 - var11.field3240, var24, var11.field3227, 15, var12);
                            if (var11.field3246 != null) {
                                method1653(var13 - var11.field3341, var25, var22, var11.field3246, var23, var14 - var11.field3240, var24, var11.field3227, 15, var12);
                            }
                            class253 var39 = (class253) class318.field4662.method1373((long) var11.field3227, arg8 ^ 0xFFFFFFC5);
                            if (var39 != null) {
                                class407.method2558(var13, var12, var25, var24, var22, var14, false, var23, var39.field3746);
                            }
                            if (var11.field3281 == 1407 && class59.field786.method971()) {
                                class59.field786.method900();
                                class311.field4515 = true;
                            }
                            class59.field786.method937(arg4, arg2, arg1, arg6);
                        }
                        if (class396.field5576[var12] || class223.field3303 > 1) {
                            if (var11.field3208 == 3) {
                                if (var15 == 0) {
                                    if (var11.field3309) {
                                        class59.field786.method1012(var13, var14, var11.field3250, var11.field3282, var11.field3219, 0);
                                    } else {
                                        class59.field786.method983(var13, var14, var11.field3250, var11.field3282, var11.field3219, 0);
                                    }
                                } else if (var11.field3309) {
                                    class59.field786.method1012(var13, var14, var11.field3250, var11.field3282, var11.field3219 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class59.field786.method983(var13, var14, var11.field3250, var11.field3282, 255 - (var15 & 0xFF) << 24 | var11.field3219 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field3208 == 4) {
                                class335 var40 = var11.method1561(arg8 + 108, class59.field786);
                                if (var40 != null) {
                                    int var41 = var11.field3219;
                                    String var42 = var11.field3325;
                                    if (var11.field3304 != -1) {
                                        class409 var43 = class167.method1202(true, var11.field3304);
                                        var42 = var43.field5871;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field5846 == 1 || var11.field3314 != 1) && var11.field3314 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class341.method2239((byte) 19, var11.field3314);
                                        }
                                    }
                                    if (class85.field1096 == var11) {
                                        var42 = class115.field1484.method2284((byte) -74, class309.field4497);
                                        var41 = var11.field3219;
                                    }
                                    if (class147.field2200) {
                                        class59.field786.method1004(var13, var14, var13 + var11.field3250, var11.field3282 + var14);
                                    }
                                    var40.method2204(var11.field3196, var11.field3228, var41 | 0xFF000000, var42, var11.field3198, var13, var11.field3282, 16777215, (class226) null, var14, var11.field3210 ? -16777216 : -1, 0, (int[]) null, 0, var11.field3250, class120.field1622);
                                    if (class147.field2200) {
                                        class59.field786.method937(arg4, arg2, arg1, arg6);
                                    }
                                } else if (class92.field1182) {
                                    class245.method1701(var11, (byte) -94);
                                }
                            } else if (var11.field3208 == 5) {
                                if (var11.field3226 >= 0) {
                                    var11.method1566(arg8 ^ 0xE5BFDCFF).method2172(74, var11.field3250, var11.field3282, var11.field3251 << 3, var14, var13, var11.field3271 << 3, 0, class59.field786, 0);
                                } else {
                                    class256 var44;
                                    if (var11.field3304 == -1) {
                                        var44 = var11.method1565(false, class59.field786);
                                    } else {
                                        class301 var45 = var11.field3277 ? class181.field2555.field1778 : null;
                                        var44 = class382.method2434(var11.field3332 | 0xFF000000, false, var45, var11.field3314, var11.field3293, var11.field3304, class59.field786, var11.field3248);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method83();
                                        int var47 = var44.method75();
                                        if (var11.field3218) {
                                            class59.field786.method1004(var13, var14, var11.field3250 + var13, var14 - -var11.field3282);
                                            if (var11.field3310 != 0) {
                                                int var48 = (var46 + var11.field3250 - 1) / var46;
                                                int var49 = (var11.field3282 + var47 - 1) / var47;
                                                for (int var50 = 0; var50 < var48; var50++) {
                                                    for (int var51 = 0; var51 < var49; var51++) {
                                                        var44.method1776((float) var46 / 2.0F + (float) (var46 * var50 + var13), (float) var47 / 2.0F + (float) (var47 * var51 + var14), 4096, var11.field3310);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var44.method88(var13, var14, var11.field3250, var11.field3282, 0, 0, 1);
                                            } else {
                                                var44.method88(var13, var14, var11.field3250, var11.field3282, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class59.field786.method937(arg4, arg2, arg1, arg6);
                                        } else if (var15 != 0) {
                                            int var52 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field3310 != 0) {
                                                var44.method1775((float) var11.field3250 / 2.0F + (float) var13, (float) var11.field3282 / 2.0F + (float) var14, var11.field3250 * 4096 / var46, var11.field3310, 1, var52, 1);
                                            } else if (var11.field3250 == var46 && var11.field3282 == var47) {
                                                var44.method86(var13, var14, 1, var52, 1);
                                            } else {
                                                var44.method74(var13, var14, var11.field3250, var11.field3282, 1, var52, 1);
                                            }
                                        } else if (var11.field3310 != 0) {
                                            var44.method1776((float) var11.field3250 / 2.0F + (float) var13, (float) var11.field3282 / 2.0F + (float) var14, var11.field3250 * 4096 / var46, var11.field3310);
                                        } else if (var11.field3250 == var46 && var11.field3282 == var47) {
                                            var44.method1772(var13, var14);
                                        } else {
                                            var44.method1774(var13, var14, var11.field3250, var11.field3282);
                                        }
                                    } else if (class92.field1182) {
                                        class245.method1701(var11, (byte) -94);
                                    }
                                }
                            } else if (var11.field3208 == 6) {
                                class88.method527(-13100);
                                class305 var53 = null;
                                int var54 = 0;
                                if (var11.field3304 != -1) {
                                    class409 var62 = class167.method1202(true, var11.field3304);
                                    if (var62 != null) {
                                        class409 var63 = var62.method2587(var11.field3314, 29950);
                                        class183 var64 = var11.field3199 == -1 ? null : class110.method671(-21965, var11.field3199);
                                        class301 var65 = var11.field3277 ? class181.field2555.field1778 : null;
                                        var53 = var63.method2588(class59.field786, var64, 1024, var11.field3267, var11.field3276, 1, var65, (byte) 126, var11.field3292);
                                        if (var53 == null) {
                                            class245.method1701(var11, (byte) -94);
                                        } else {
                                            var54 = -var53.method221() / 2;
                                        }
                                    }
                                } else if (var11.field3338 == 5) {
                                    if (var11.field3305 == -1) {
                                        var53 = class230.field3405.method2023(0, (class142[]) null, class59.field786, -1, -1, 1024, (class183) null, -1, -124, 0, -1, true, (class183) null);
                                    } else {
                                        int var55 = var11.field3305;
                                        class128 var56;
                                        if (class302.field4417 == var55) {
                                            var56 = class181.field2555;
                                        } else {
                                            var56 = class243.field3596[var55];
                                        }
                                        class183 var57 = var11.field3199 == -1 ? null : class110.method671(-21965, var11.field3199);
                                        if (var56 != null && (var55 == 2047 || class276.method1872((byte) 12, var56.field1790) == var11.field3260)) {
                                            var53 = var56.field1778.method2023(var11.field3267, (class142[]) null, class59.field786, var11.field3276, 0, 1024, var57, -1, 107, 0, var11.field3292, true, (class183) null);
                                        }
                                    }
                                } else if (var11.field3338 == 8 || var11.field3338 == 9) {
                                    class101 var59 = class438.method2729(false, var11.field3305, true);
                                    class183 var60 = var11.field3199 == -1 ? null : class110.method671(-21965, var11.field3199);
                                    if (var59 != null) {
                                        class301 var61 = var11.field3277 ? class181.field2555.field1778 : null;
                                        var53 = var59.method593(1024, var11.field3260, var11.field3276, var11.field3292, var11.field3267, var60, class59.field786, 1, var61, var11.field3338 == 9);
                                    }
                                } else if (var11.field3199 == -1) {
                                    var53 = var11.method1571(-1, (byte) 60, 0, -1, class59.field786, (class183) null, 1024, class181.field2555.field1778);
                                    if (var53 == null && class92.field1182) {
                                        class245.method1701(var11, (byte) -94);
                                    }
                                } else {
                                    class183 var58 = class110.method671(-21965, var11.field3199);
                                    var53 = var11.method1571(var11.field3292, (byte) -112, var11.field3267, var11.field3276, class59.field786, var58, 1024, class181.field2555.field1778);
                                    if (var53 == null && class92.field1182) {
                                        class245.method1701(var11, (byte) -94);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field3268 > 0) {
                                        var66 = (var11.field3250 << 9) / var11.field3268;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field3189 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field3282 << 9) / var11.field3189;
                                    }
                                    int var68 = (var11.field3297 * var66 >> 9) + (var13 + (var11.field3250 / 2));
                                    int var69 = (var11.field3224 * var67 >> 9) + var11.field3282 / 2 + var14;
                                    class44.field598.method1137();
                                    class59.field786.method973(class44.field598);
                                    int var70 = class447.field6381[var11.field3237 << 3] * var11.field3265 >> 15;
                                    int var71 = class447.field6390[var11.field3237 << 3] * var11.field3265 >> 15;
                                    class59.field786.method1003(var68, var69, var66, var67);
                                    class59.field786.method956((float) var11.field3278, var11.field3283 ? (float) var11.field3266 : (float) var11.field3266 * 1.5F);
                                    if (class311.field4515) {
                                        class59.field786.method931();
                                        class59.field786.method897();
                                        class59.field786.method937(arg4, arg2, arg1, arg6);
                                        class311.field4515 = false;
                                    }
                                    if (var11.field3225) {
                                        class59.field786.method874(false);
                                    }
                                    class392.field5515.method1144(-var11.field3275 << 3);
                                    class392.field5515.method1143(var11.field3331 << 3);
                                    class392.field5515.method1134(var11.field3206, var11.field3311 + var54 + var70, var11.field3311 + var71);
                                    class392.field5515.method1140(var11.field3237 << 3);
                                    if (class147.field2200) {
                                        class59.field786.method1004(var13, var14, var13 + var11.field3250, var11.field3282 + var14);
                                    }
                                    if (var11.field3283) {
                                        var53.method223(class392.field5515, (class144) null, var11.field3265, 1);
                                    } else {
                                        var53.method230(class392.field5515, (class144) null, 1);
                                    }
                                    if (class147.field2200) {
                                        class59.field786.method937(arg4, arg2, arg1, arg6);
                                    }
                                    if (var11.field3225) {
                                        class59.field786.method874(true);
                                    }
                                }
                            } else if (var11.field3208 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field3202) {
                                    var74 = var11.field3282 + var14;
                                    var75 = var13 + var11.field3250;
                                    var72 = var14;
                                    var73 = var13;
                                } else {
                                    var72 = var11.field3282 + var14;
                                    var73 = var13;
                                    var74 = var14;
                                    var75 = var11.field3250 + var13;
                                }
                                if (var11.field3317 == 1) {
                                    class59.field786.method869(var73, var74, var75, var72, var11.field3219, 0);
                                } else {
                                    class59.field786.method903(var73, var74, var75, var72, var11.field3219, var11.field3317, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
    public static final void method1654(int arg0) {
        field3581++;
        class285.field4152.method102((byte) -117);
        if (arg0 != 0) {
            method1648(-22);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
    public static void method1655(boolean arg0) {
        field3575 = null;
        if (arg0) {
            method1654(-115);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ltj;Ltj;)V")
    public class242(class108 arg0, class108 arg1) {
        this.field3568 = arg1;
        this.field3571 = arg0;
    }
}
