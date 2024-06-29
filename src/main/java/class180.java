import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class180 extends class390 {

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
    public int[] field2470;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[Z")
    public boolean[] field2474;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[[I")
    public int[][] field2468;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    public int[] field2473;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2469 = 0;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lgr;Ljd;)V")
    public static final void method1176(class249 arg0, class125 arg1) {
        if (!arg1.field1754) {
            return;
        }
        short var2 = arg1.field1734;
        short var3 = arg1.field1757;
        byte var4 = arg1.field1735;
        byte var5 = arg1.field1737;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class125[][] var8 = class328.field4549[var4];
        float var10;
        if (class375.field5354 == class214.field2979) {
            int var9 = class126.field1782[var2][var3];
            class387.field5557.method57(class418.field5939[0].method725(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class387.field5557.method80(3000.0F, var10 * 1.5F);
        if (arg1.field1759) {
            if (class187.field2558) {
                if (var4 > 0) {
                    class125 var11 = class328.field4549[var4 - 1][var2][var3];
                    if (var11 != null && var11.field1754) {
                        return;
                    }
                }
                if (var2 <= class357.field4890 && var2 > class237.field3368) {
                    class125 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field1754 && (var12.field1759 || (arg1.field1745 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class357.field4890 && var2 < class77.field1107 - 1) {
                    class125 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field1754 && (var13.field1759 || (arg1.field1745 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class405.field5768 && var3 > class255.field3586) {
                    class125 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field1754 && (var14.field1759 || (arg1.field1745 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class405.field5768 && var3 < class375.field5351 - 1) {
                    class125 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field1754 && (var15.field1759 || (arg1.field1745 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class187.field2558 = true;
            }
            arg1.field1759 = false;
            if (arg1.field1762 != null) {
                class125 var16 = arg1.field1762;
                class387.field5557.method80(3000.0F, (201.5F - (float) (var16.field1737 + 1) * 50.0F) * 1.5F);
                if (!class280.method1830(var16.field1737, var2, var3)) {
                    class375.field5354[var16.field1737].method730(var2, var3);
                }
                class34 var17 = var16.field1756;
                if (var17 != null) {
                    if (class286.field4033) {
                        if ((var17.field523 & arg1.field1736) == 0) {
                            class95.method686(arg0, var4, var2, var3);
                        } else {
                            class401.method2520(arg0, var17.field523, var5, var2, var3);
                        }
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    var17.method681(true, class387.field5557);
                }
                for (class123 var18 = var16.field1749; var18 != null; var18 = var18.field1711) {
                    class447 var19 = var18.field1709;
                    if (var19 != null) {
                        if (class286.field4033) {
                            class95.method686(arg0, var4, var2, var3);
                            class387.field5557.method113(arg0.field3522, arg0.field3521);
                        }
                        var19.method681(true, class387.field5557);
                    }
                }
                class387.field5557.method80(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class280.method1830(var5, var2, var3);
            if (var20) {
                class375.field5354[var5].method730(var2, var3);
                class109 var21 = arg1.field1739;
                if (var21 != null && var21.field1571) {
                    if (var21.field1569) {
                        class387.field5557.method80(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var22 = var21.method681(true, class387.field5557);
                    if (var22 != null) {
                        var22.field2332 = var21;
                        var22.field2323 = var4;
                        var22.field2324 = var2;
                        var22.field2322 = var3;
                        class100.field1383.method1009(var22, false);
                    }
                    if (var21.field1569) {
                        class387.field5557.method80(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class34 var25 = arg1.field1756;
            class214 var26 = arg1.field1740;
            if (var25 != null || var26 != null) {
                if (class357.field4890 == var2) {
                    var23++;
                } else if (class357.field4890 < var2) {
                    var23 += 2;
                }
                if (class405.field5768 == var3) {
                    var23 += 3;
                } else if (class405.field5768 > var3) {
                    var23 += 6;
                }
                var24 = class387.field5564[var23];
                arg1.field1736 = class46.field643[var23];
            }
            if (var25 != null) {
                if ((var25.field523 & class28.field471[var23]) == 0) {
                    arg1.field1733 = 0;
                } else if (var25.field523 == 16) {
                    arg1.field1733 = 3;
                    arg1.field1744 = class108.field1558[var23];
                    arg1.field1748 = (byte) (3 - arg1.field1744);
                } else if (var25.field523 == 32) {
                    arg1.field1733 = 6;
                    arg1.field1744 = class77.field1106[var23];
                    arg1.field1748 = (byte) (6 - arg1.field1744);
                } else if (var25.field523 == 64) {
                    arg1.field1733 = 12;
                    arg1.field1744 = class346.field4724[var23];
                    arg1.field1748 = (byte) (12 - arg1.field1744);
                } else {
                    arg1.field1733 = 9;
                    arg1.field1744 = class331.field4581[var23];
                    arg1.field1748 = (byte) (9 - arg1.field1744);
                }
                if ((var25.field523 & var24) != 0 && !class255.method1696(var5, var2, var3, var25.field523)) {
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var27 = var25.method681(true, class387.field5557);
                    if (var27 != null) {
                        var27.field2332 = var25;
                        var27.field2323 = var4;
                        var27.field2324 = var2;
                        var27.field2322 = var3;
                        class100.field1383.method1009(var27, false);
                    }
                }
                class34 var28 = arg1.field1761;
                if (var28 != null && (var28.field523 & var24) != 0 && !class255.method1696(var5, var2, var3, var28.field523)) {
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var29 = var28.method681(true, class387.field5557);
                    if (var29 != null) {
                        var29.field2332 = var28;
                        var29.field2323 = var4;
                        var29.field2324 = var2;
                        var29.field2322 = var3;
                        class100.field1383.method1009(var29, false);
                    }
                }
            }
            if (var26 != null && !class130.method889(var5, var2, var3, var26.method1398(0))) {
                class214 var30 = arg1.field1750;
                class387.field5557.method80(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field2984 & var24) != 0) {
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var31 = var26.method681(true, class387.field5557);
                    if (var31 != null) {
                        var31.field2332 = var26;
                        var31.field2323 = var4;
                        var31.field2324 = var2;
                        var31.field2322 = var3;
                        class100.field1383.method1009(var31, false);
                    }
                } else if (var26.field2984 == 256) {
                    int var32 = var26.field2985 - class17.field313;
                    int var33 = var26.field2990 - class247.field3494;
                    int var34 = var26.field2978;
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
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    if (var36 < var35) {
                        class170 var37 = var26.method681(true, class387.field5557);
                        if (var37 != null) {
                            var37.field2332 = var26;
                            var37.field2323 = var4;
                            var37.field2324 = var2;
                            var37.field2322 = var3;
                            class100.field1383.method1009(var37, false);
                        }
                    } else if (var30 != null) {
                        class170 var38 = var30.method681(true, class387.field5557);
                        if (var38 != null) {
                            var38.field2332 = var30;
                            var38.field2323 = var4;
                            var38.field2324 = var2;
                            var38.field2322 = var3;
                            class100.field1383.method1009(var38, false);
                        }
                    }
                }
                class387.field5557.method80(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class109 var39 = arg1.field1739;
                if (var39 != null && !var39.field1571) {
                    if (var39.field1569) {
                        class387.field5557.method80(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var40 = var39.method681(true, class387.field5557);
                    if (var40 != null) {
                        var40.field2332 = var39;
                        var40.field2323 = var4;
                        var40.field2324 = var2;
                        var40.field2322 = var3;
                        class100.field1383.method1009(var40, false);
                    }
                    if (var39.field1569) {
                        class387.field5557.method80(3000.0F, var10 * 1.5F);
                    }
                }
                class184 var41 = arg1.field1741;
                if (var41 != null && !var41.field2504) {
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var42 = var41.method681(true, class387.field5557);
                    if (var42 != null) {
                        var42.field2332 = var41;
                        var42.field2323 = var4;
                        var42.field2324 = var2;
                        var42.field2322 = var3;
                        class100.field1383.method1009(var42, false);
                    }
                }
            }
            byte var43 = arg1.field1745;
            if (var43 != 0) {
                if (var2 < class357.field4890 && (var43 & 0x4) != 0) {
                    class125 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field1754) {
                        class326.field4453.method2006(var44, true);
                    }
                }
                if (var3 < class405.field5768 && (var43 & 0x2) != 0) {
                    class125 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field1754) {
                        class326.field4453.method2006(var45, true);
                    }
                }
                if (var2 > class357.field4890 && (var43 & 0x1) != 0) {
                    class125 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field1754) {
                        class326.field4453.method2006(var46, true);
                    }
                }
                if (var3 > class405.field5768 && (var43 & 0x8) != 0) {
                    class125 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field1754) {
                        class326.field4453.method2006(var47, true);
                    }
                }
            }
        }
        if (arg1.field1733 != 0) {
            boolean var48 = true;
            for (class123 var49 = arg1.field1749; var49 != null; var49 = var49.field1711) {
                if (class328.field4548 != var49.field1709.field6268 && (var49.field1708 & arg1.field1733) == arg1.field1744) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class34 var50 = arg1.field1756;
                if (!class255.method1696(var5, var2, var3, var50.field523)) {
                    if (class286.field4033) {
                        label687: {
                            if (var50.field523 >= 16) {
                                int var51 = var2 - class357.field4890;
                                int var52 = var3 - class405.field5768;
                                if (var50.field523 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class264.field3687) {
                                        class95.method686(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field523 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class200.field2772 && var3 < class264.field3687) {
                                        class95.method686(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field523 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class200.field2772 && var3 > 0) {
                                        class95.method686(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field523 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class95.method686(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class95.method686(arg0, var4, var2, var3);
                        }
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var53 = var50.method681(true, class387.field5557);
                    if (var53 != null) {
                        var53.field2332 = var50;
                        var53.field2323 = var4;
                        var53.field2324 = var2;
                        var53.field2322 = var3;
                        class100.field1383.method1009(var53, false);
                    }
                }
                arg1.field1733 = 0;
            }
        }
        if (arg1.field1732) {
            try {
                arg1.field1732 = false;
                int var54 = 0;
                label630: for (class123 var55 = arg1.field1749; var55 != null; var55 = var55.field1711) {
                    class447 var56 = var55.field1709;
                    if (class328.field4548 != var56.field6268) {
                        for (int var57 = var56.field6261; var57 <= var56.field6272; var57++) {
                            for (int var58 = var56.field6258; var58 <= var56.field6264; var58++) {
                                class125 var59 = var8[var57][var58];
                                if (var59.field1759) {
                                    arg1.field1732 = true;
                                    continue label630;
                                }
                                if (var59.field1733 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field6261) {
                                        var60++;
                                    }
                                    if (var57 < var56.field6272) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field6258) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field6264) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field1733) == arg1.field1748) {
                                        arg1.field1732 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class357.field4890 - var56.field6261;
                        int var62 = var56.field6272 - class357.field4890;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class405.field5768 - var56.field6258;
                        int var64 = var56.field6264 - class405.field5768;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field3515[var54] = var56;
                        arg0.field3523[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class447 var68 = arg0.field3515[var67];
                        if (class328.field4548 != var68.field6268) {
                            int var69 = arg0.field3523[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field6262 - class17.field313;
                                int var71 = var68.field6266 - class247.field3494;
                                int var72 = arg0.field3515[var66].field6262 - class17.field313;
                                int var73 = arg0.field3515[var66].field6266 - class247.field3494;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class447 var74 = arg0.field3515[var66];
                    var74.field6268 = class328.field4548;
                    if (!class54.method445(var5, var74.field6261, var74.field6272, var74.field6258, var74.field6264, var74.method915((byte) -111))) {
                        if (class286.field4033) {
                            if (var74.field6263 == 0) {
                                class396.method2502(arg0, var4, var74.field6261, var74.field6258, var74.field6272, var74.field6264);
                            } else {
                                class95.method686(arg0, var4, var2, var3);
                                int var75 = var2 - class357.field4890;
                                int var76 = var3 - class405.field5768;
                                if (var74.field6263 == 2) {
                                    if (var76 > -var75) {
                                        class267.method1734(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class267.method1734(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class267.method1734(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class267.method1734(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class387.field5557.method113(arg0.field3522, arg0.field3521);
                        }
                        class170 var77 = var74.method681(true, class387.field5557);
                        if (var77 != null) {
                            var77.field2332 = var74;
                            var77.field2323 = var4;
                            var77.field2324 = var74.field6261;
                            var77.field2322 = var74.field6258;
                            class100.field1383.method1009(var77, false);
                        }
                    }
                    for (int var78 = var74.field6261; var78 <= var74.field6272; var78++) {
                        for (int var79 = var74.field6258; var79 <= var74.field6264; var79++) {
                            class125 var80 = var8[var78][var79];
                            if (var80.field1733 != 0) {
                                class326.field4453.method2006(var80, true);
                            } else if ((var2 != var78 || var3 != var79) && var80.field1754) {
                                class326.field4453.method2006(var80, true);
                            }
                        }
                    }
                }
                if (arg1.field1732) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field1732 = false;
            }
        }
        if (arg1.field1742 != null) {
            if ((byte) (class132.field1871 & 0xFF) == arg1.field1746) {
                class77 var81 = arg1.field1742;
                int var82 = class375.field5354[var4].method737(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class375.field5354[var4].method737(var2, var3) - class375.field5354[var4 + 1].method737(var2, var3);
                } else {
                    var83 = 1024;
                }
                class249.field3518.method692(var6, var82, var7, arg0.field3516);
                int var84 = arg0.field3516[2];
                class249.field3518.method692(var6, var82 - var83, var7, arg0.field3516);
                int var85 = arg0.field3516[2];
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
                var81.field1111 = var86;
                var81.field1108 = var87;
                var81.field1110 = true;
                class387.field5557.method83(var81);
            } else {
                arg1.field1742 = null;
            }
        }
        if (!arg1.field1754) {
            return;
        }
        if (arg1.field1733 != 0) {
            return;
        }
        if (var2 <= class357.field4890 && var2 > class237.field3368) {
            class125 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field1754) {
                return;
            }
        }
        if (var2 >= class357.field4890 && var2 < class77.field1107 - 1) {
            class125 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field1754) {
                return;
            }
        }
        if (var3 <= class405.field5768 && var3 > class255.field3586) {
            class125 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field1754) {
                return;
            }
        }
        if (var3 >= class405.field5768 && var3 < class375.field5351 - 1) {
            class125 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field1754) {
                return;
            }
        }
        arg1.field1754 = false;
        class30.field490--;
        class184 var92 = arg1.field1741;
        if (var92 != null && var92.field2504) {
            if (class286.field4033) {
                class95.method686(arg0, var4, var2, var3);
                class387.field5557.method113(arg0.field3522, arg0.field3521);
            }
            class170 var93 = var92.method681(true, class387.field5557);
            if (var93 != null) {
                var93.field2332 = var92;
                var93.field2323 = var4;
                var93.field2324 = var2;
                var93.field2322 = var3;
                class100.field1383.method1009(var93, false);
            }
        }
        if (arg1.field1736 != 0) {
            class214 var94 = arg1.field1740;
            if (var94 != null && !class130.method889(var5, var2, var3, var94.method1398(0))) {
                if ((var94.field2984 & arg1.field1736) != 0) {
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class170 var95 = var94.method681(true, class387.field5557);
                    if (var95 != null) {
                        var95.field2332 = var94;
                        var95.field2323 = var4;
                        var95.field2324 = var2;
                        var95.field2322 = var3;
                        class100.field1383.method1009(var95, false);
                    }
                } else if (var94.field2984 == 256) {
                    int var96 = var94.field2985 - class17.field313;
                    int var97 = var94.field2990 - class247.field3494;
                    int var98 = var94.field2978;
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
                    if (class286.field4033) {
                        class95.method686(arg0, var4, var2, var3);
                        class387.field5557.method113(arg0.field3522, arg0.field3521);
                    }
                    class214 var101 = arg1.field1750;
                    if (var100 > var99) {
                        class170 var102 = var94.method681(true, class387.field5557);
                        if (var102 != null) {
                            var102.field2332 = var94;
                            var102.field2323 = var4;
                            var102.field2324 = var2;
                            var102.field2322 = var3;
                            class100.field1383.method1009(var102, false);
                        }
                    } else if (var101 != null) {
                        class170 var103 = var101.method681(true, class387.field5557);
                        if (var103 != null) {
                            var103.field2332 = var101;
                            var103.field2323 = var4;
                            var103.field2324 = var2;
                            var103.field2322 = var3;
                            class100.field1383.method1009(var103, false);
                        }
                    }
                }
            }
            class34 var104 = arg1.field1756;
            class34 var105 = arg1.field1761;
            if (var105 != null && (var105.field523 & arg1.field1736) != 0 && !class255.method1696(var5, var2, var3, var105.field523)) {
                if (class286.field4033) {
                    class401.method2520(arg0, var105.field523, var4, var2, var3);
                    class387.field5557.method113(arg0.field3522, arg0.field3521);
                }
                class170 var106 = var105.method681(true, class387.field5557);
                if (var106 != null) {
                    var106.field2332 = var105;
                    var106.field2323 = var4;
                    var106.field2324 = var2;
                    var106.field2322 = var3;
                    class100.field1383.method1009(var106, false);
                }
            }
            if (var104 != null && (var104.field523 & arg1.field1736) != 0 && !class255.method1696(var5, var2, var3, var104.field523)) {
                if (class286.field4033) {
                    class401.method2520(arg0, var104.field523, var4, var2, var3);
                    class387.field5557.method113(arg0.field3522, arg0.field3521);
                }
                class170 var107 = var104.method681(true, class387.field5557);
                if (var107 != null) {
                    var107.field2332 = var104;
                    var107.field2323 = var4;
                    var107.field2324 = var2;
                    var107.field2322 = var3;
                    class100.field1383.method1009(var107, false);
                }
            }
        }
        if (var4 < class392.field5617 - 1) {
            class125 var108 = class328.field4549[var4 + 1][var2][var3];
            if (var108 != null && var108.field1754) {
                class326.field4453.method2009(0, var108);
            }
        }
        if (var2 < class357.field4890) {
            class125 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field1754) {
                class326.field4453.method2006(var109, true);
            }
        }
        if (var3 < class405.field5768) {
            class125 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field1754) {
                class326.field4453.method2006(var110, true);
            }
        }
        if (var2 > class357.field4890) {
            class125 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field1754) {
                class326.field4453.method2006(var111, true);
            }
        }
        if (var3 > class405.field5768) {
            class125 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field1754) {
                class326.field4453.method2006(var112, true);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method1177(int arg0, int arg1) {
        if (class347.field4737 == 0) {
            class314.field4303.method1386(-127, arg0);
        } else {
            class247.field3487 = arg0;
        }
        if (arg1 <= 12) {
            field2469 = -1;
        }
        field2475++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I[B)V")
    public class180(int arg0, byte[] arg1) {
        this.field2471 = arg0;
        class11 var3 = new class11(arg1);
        this.field2472 = var3.method172((byte) 52);
        this.field2470 = new int[this.field2472];
        this.field2474 = new boolean[this.field2472];
        this.field2468 = new int[this.field2472][];
        this.field2473 = new int[this.field2472];
        for (int var4 = 0; var4 < this.field2472; var4++) {
            this.field2473[var4] = var3.method172((byte) 52);
        }
        for (int var5 = 0; var5 < this.field2472; var5++) {
            this.field2474[var5] = var3.method172((byte) 52) == 1;
        }
        for (int var6 = 0; var6 < this.field2472; var6++) {
            this.field2470[var6] = var3.method174(255);
        }
        for (int var7 = 0; var7 < this.field2472; var7++) {
            this.field2468[var7] = new int[var3.method172((byte) 52)];
        }
        for (int var8 = 0; var8 < this.field2472; var8++) {
            for (int var9 = 0; var9 < this.field2468[var8].length; var9++) {
                this.field2468[var8][var9] = var3.method172((byte) 52);
            }
        }
    }
}
