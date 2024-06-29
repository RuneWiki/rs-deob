import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class137 extends class268 {

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Laq;")
    public static class453 field1559 = null;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "F")
    public static float field1563;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Lc;")
    public static class436 field1567;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Z")
    public static boolean field1554;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "[B")
    private byte[] field1556;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
    public void method883(int arg0, byte arg1) {
        field1560++;
        this.field1556[arg0] = arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lil;Lsq;)V")
    public static final void method884(class42 arg0, class316 arg1) {
        if (!arg1.field4253) {
            return;
        }
        short var2 = arg1.field4260;
        short var3 = arg1.field4258;
        byte var4 = arg1.field4265;
        byte var5 = arg1.field4250;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class316[][] var8 = class347.field4722[var4];
        float var10;
        if (class75.field915 == class304.field4096) {
            int var9 = class134.field1536[var2][var3];
            class131.field1498.method712(class219.field2709[0].method1054(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class131.field1498.method773(3000.0F, var10 * 1.5F);
        if (arg1.field4267) {
            if (class133.field1515) {
                if (var4 > 0) {
                    class316 var11 = class347.field4722[var4 - 1][var2][var3];
                    if (var11 != null && var11.field4253) {
                        return;
                    }
                }
                if (var2 <= class325.field4341 && var2 > class118.field1361) {
                    class316 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field4253 && (var12.field4267 || (arg1.field4264 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class325.field4341 && var2 < class386.field5281 - 1) {
                    class316 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field4253 && (var13.field4267 || (arg1.field4264 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class121.field1381 && var3 > class244.field3247) {
                    class316 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field4253 && (var14.field4267 || (arg1.field4264 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class121.field1381 && var3 < class369.field5031 - 1) {
                    class316 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field4253 && (var15.field4267 || (arg1.field4264 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class133.field1515 = true;
            }
            arg1.field4267 = false;
            if (arg1.field4271 != null) {
                class316 var16 = arg1.field4271;
                class131.field1498.method773(3000.0F, (201.5F - (float) (var16.field4250 + 1) * 50.0F) * 1.5F);
                if (!class361.method2272(var16.field4250, var2, var3)) {
                    class304.field4096[var16.field4250].method1042(var2, var3);
                }
                class226 var17 = var16.field4268;
                if (var17 != null) {
                    if (class217.field2665) {
                        if ((var17.field2873 & arg1.field4252) == 0) {
                            class184.method1147(arg0, var4, var2, var3);
                        } else {
                            class176.method1109(arg0, var17.field2873, var5, var2, var3);
                        }
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    var17.method130(class131.field1498, (byte) 109);
                }
                for (class272 var18 = var16.field4256; var18 != null; var18 = var18.field3514) {
                    class133 var19 = var18.field3512;
                    if (var19 != null) {
                        if (class217.field2665) {
                            class184.method1147(arg0, var4, var2, var3);
                            class131.field1498.method784(arg0.field494, arg0.field498);
                        }
                        var19.method130(class131.field1498, (byte) 71);
                    }
                }
                class131.field1498.method773(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class361.method2272(var5, var2, var3);
            if (var20) {
                class304.field4096[var5].method1042(var2, var3);
                class388 var21 = arg1.field4255;
                if (var21 != null && var21.field5294) {
                    if (var21.field5292) {
                        class131.field1498.method773(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var22 = var21.method130(class131.field1498, (byte) -127);
                    if (var22 != null) {
                        var22.field2024 = var21;
                        var22.field2026 = var4;
                        var22.field2031 = var2;
                        var22.field2023 = var3;
                        class386.field5275.method1833(var22, 10209);
                    }
                    if (var21.field5292) {
                        class131.field1498.method773(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class226 var25 = arg1.field4268;
            class364 var26 = arg1.field4259;
            if (var25 != null || var26 != null) {
                if (class325.field4341 == var2) {
                    var23++;
                } else if (class325.field4341 < var2) {
                    var23 += 2;
                }
                if (class121.field1381 == var3) {
                    var23 += 3;
                } else if (class121.field1381 > var3) {
                    var23 += 6;
                }
                var24 = class416.field5697[var23];
                arg1.field4252 = class291.field3842[var23];
            }
            if (var25 != null) {
                if ((var25.field2873 & class376.field5090[var23]) == 0) {
                    arg1.field4251 = 0;
                } else if (var25.field2873 == 16) {
                    arg1.field4251 = 3;
                    arg1.field4261 = class186.field2147[var23];
                    arg1.field4270 = (byte) (3 - arg1.field4261);
                } else if (var25.field2873 == 32) {
                    arg1.field4251 = 6;
                    arg1.field4261 = class302.field4058[var23];
                    arg1.field4270 = (byte) (6 - arg1.field4261);
                } else if (var25.field2873 == 64) {
                    arg1.field4251 = 12;
                    arg1.field4261 = class125.field1400[var23];
                    arg1.field4270 = (byte) (12 - arg1.field4261);
                } else {
                    arg1.field4251 = 9;
                    arg1.field4261 = class201.field2373[var23];
                    arg1.field4270 = (byte) (9 - arg1.field4261);
                }
                if ((var25.field2873 & var24) != 0 && !class40.method254(var5, var2, var3, var25.field2873)) {
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var27 = var25.method130(class131.field1498, (byte) 63);
                    if (var27 != null) {
                        var27.field2024 = var25;
                        var27.field2026 = var4;
                        var27.field2031 = var2;
                        var27.field2023 = var3;
                        class386.field5275.method1833(var27, 10209);
                    }
                }
                class226 var28 = arg1.field4269;
                if (var28 != null && (var28.field2873 & var24) != 0 && !class40.method254(var5, var2, var3, var28.field2873)) {
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var29 = var28.method130(class131.field1498, (byte) -27);
                    if (var29 != null) {
                        var29.field2024 = var28;
                        var29.field2026 = var4;
                        var29.field2031 = var2;
                        var29.field2023 = var3;
                        class386.field5275.method1833(var29, 10209);
                    }
                }
            }
            if (var26 != null && !class449.method2780(var5, var2, var3, var26.method414(4096))) {
                class364 var30 = arg1.field4266;
                class131.field1498.method773(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field4940 & var24) != 0) {
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var31 = var26.method130(class131.field1498, (byte) 85);
                    if (var31 != null) {
                        var31.field2024 = var26;
                        var31.field2026 = var4;
                        var31.field2031 = var2;
                        var31.field2023 = var3;
                        class386.field5275.method1833(var31, 10209);
                    }
                } else if (var26.field4940 == 256) {
                    int var32 = var26.field4948 - class437.field5999;
                    int var33 = var26.field4953 - class278.field3599;
                    int var34 = var26.field4938;
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
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    if (var36 < var35) {
                        class175 var37 = var26.method130(class131.field1498, (byte) 94);
                        if (var37 != null) {
                            var37.field2024 = var26;
                            var37.field2026 = var4;
                            var37.field2031 = var2;
                            var37.field2023 = var3;
                            class386.field5275.method1833(var37, 10209);
                        }
                    } else if (var30 != null) {
                        class175 var38 = var30.method130(class131.field1498, (byte) -99);
                        if (var38 != null) {
                            var38.field2024 = var30;
                            var38.field2026 = var4;
                            var38.field2031 = var2;
                            var38.field2023 = var3;
                            class386.field5275.method1833(var38, 10209);
                        }
                    }
                }
                class131.field1498.method773(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class388 var39 = arg1.field4255;
                if (var39 != null && !var39.field5294) {
                    if (var39.field5292) {
                        class131.field1498.method773(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var40 = var39.method130(class131.field1498, (byte) 116);
                    if (var40 != null) {
                        var40.field2024 = var39;
                        var40.field2026 = var4;
                        var40.field2031 = var2;
                        var40.field2023 = var3;
                        class386.field5275.method1833(var40, 10209);
                    }
                    if (var39.field5292) {
                        class131.field1498.method773(3000.0F, var10 * 1.5F);
                    }
                }
                class337 var41 = arg1.field4254;
                if (var41 != null && !var41.field4588) {
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var42 = var41.method130(class131.field1498, (byte) -119);
                    if (var42 != null) {
                        var42.field2024 = var41;
                        var42.field2026 = var4;
                        var42.field2031 = var2;
                        var42.field2023 = var3;
                        class386.field5275.method1833(var42, 10209);
                    }
                }
            }
            byte var43 = arg1.field4264;
            if (var43 != 0) {
                if (var2 < class325.field4341 && (var43 & 0x4) != 0) {
                    class316 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field4253) {
                        class419.field5721.method282(-91, var44);
                    }
                }
                if (var3 < class121.field1381 && (var43 & 0x2) != 0) {
                    class316 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field4253) {
                        class419.field5721.method282(-48, var45);
                    }
                }
                if (var2 > class325.field4341 && (var43 & 0x1) != 0) {
                    class316 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field4253) {
                        class419.field5721.method282(-76, var46);
                    }
                }
                if (var3 > class121.field1381 && (var43 & 0x8) != 0) {
                    class316 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field4253) {
                        class419.field5721.method282(-65, var47);
                    }
                }
            }
        }
        if (arg1.field4251 != 0) {
            boolean var48 = true;
            for (class272 var49 = arg1.field4256; var49 != null; var49 = var49.field3514) {
                if (class49.field566 != var49.field3512.field1519 && (var49.field3510 & arg1.field4251) == arg1.field4261) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class226 var50 = arg1.field4268;
                if (!class40.method254(var5, var2, var3, var50.field2873)) {
                    if (class217.field2665) {
                        label687: {
                            if (var50.field2873 >= 16) {
                                int var51 = var2 - class325.field4341;
                                int var52 = var3 - class121.field1381;
                                if (var50.field2873 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class262.field3367) {
                                        class184.method1147(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field2873 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class43.field512 && var3 < class262.field3367) {
                                        class184.method1147(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field2873 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class43.field512 && var3 > 0) {
                                        class184.method1147(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field2873 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class184.method1147(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class184.method1147(arg0, var4, var2, var3);
                        }
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var53 = var50.method130(class131.field1498, (byte) -110);
                    if (var53 != null) {
                        var53.field2024 = var50;
                        var53.field2026 = var4;
                        var53.field2031 = var2;
                        var53.field2023 = var3;
                        class386.field5275.method1833(var53, 10209);
                    }
                }
                arg1.field4251 = 0;
            }
        }
        if (arg1.field4263) {
            try {
                arg1.field4263 = false;
                int var54 = 0;
                label630: for (class272 var55 = arg1.field4256; var55 != null; var55 = var55.field3514) {
                    class133 var56 = var55.field3512;
                    if (class49.field566 != var56.field1519) {
                        for (int var57 = var56.field1512; var57 <= var56.field1510; var57++) {
                            for (int var58 = var56.field1518; var58 <= var56.field1517; var58++) {
                                class316 var59 = var8[var57][var58];
                                if (var59.field4267) {
                                    arg1.field4263 = true;
                                    continue label630;
                                }
                                if (var59.field4251 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field1512) {
                                        var60++;
                                    }
                                    if (var57 < var56.field1510) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field1518) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field1517) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field4251) == arg1.field4270) {
                                        arg1.field4263 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class325.field4341 - var56.field1512;
                        int var62 = var56.field1510 - class325.field4341;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class121.field1381 - var56.field1518;
                        int var64 = var56.field1517 - class121.field1381;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field500[var54] = var56;
                        arg0.field499[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class133 var68 = arg0.field500[var67];
                        if (class49.field566 != var68.field1519) {
                            int var69 = arg0.field499[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field1516 - class437.field5999;
                                int var71 = var68.field1514 - class278.field3599;
                                int var72 = arg0.field500[var66].field1516 - class437.field5999;
                                int var73 = arg0.field500[var66].field1514 - class278.field3599;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class133 var74 = arg0.field500[var66];
                    var74.field1519 = class49.field566;
                    if (!class272.method1713(var5, var74.field1512, var74.field1510, var74.field1518, var74.field1517, var74.method246((byte) 110))) {
                        if (class217.field2665) {
                            if (var74.field1525 == 0) {
                                class116.method674(arg0, var4, var74.field1512, var74.field1518, var74.field1510, var74.field1517);
                            } else {
                                class184.method1147(arg0, var4, var2, var3);
                                int var75 = var2 - class325.field4341;
                                int var76 = var3 - class121.field1381;
                                if (var74.field1525 == 2) {
                                    if (var76 > -var75) {
                                        class66.method384(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class66.method384(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class66.method384(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class66.method384(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class131.field1498.method784(arg0.field494, arg0.field498);
                        }
                        class175 var77 = var74.method130(class131.field1498, (byte) 110);
                        if (var77 != null) {
                            var77.field2024 = var74;
                            var77.field2026 = var4;
                            var77.field2031 = var74.field1512;
                            var77.field2023 = var74.field1518;
                            class386.field5275.method1833(var77, 10209);
                        }
                    }
                    for (int var78 = var74.field1512; var78 <= var74.field1510; var78++) {
                        for (int var79 = var74.field1518; var79 <= var74.field1517; var79++) {
                            class316 var80 = var8[var78][var79];
                            if (var80.field4251 != 0) {
                                class419.field5721.method282(-113, var80);
                            } else if ((var2 != var78 || var3 != var79) && var80.field4253) {
                                class419.field5721.method282(-98, var80);
                            }
                        }
                    }
                }
                if (arg1.field4263) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field4263 = false;
            }
        }
        if (arg1.field4249 != null) {
            if ((byte) (class98.field1153 & 0xFF) == arg1.field4272) {
                class291 var81 = arg1.field4249;
                int var82 = class304.field4096[var4].method1050(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class304.field4096[var4].method1050(var2, var3) - class304.field4096[var4 + 1].method1050(var2, var3);
                } else {
                    var83 = 1024;
                }
                class434.field5922.method924(var6, var82, var7, arg0.field497);
                int var84 = arg0.field497[2];
                class434.field5922.method924(var6, var82 - var83, var7, arg0.field497);
                int var85 = arg0.field497[2];
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
                var81.field3851 = var86;
                var81.field3850 = var87;
                var81.field3848 = true;
                class131.field1498.method738(var81);
            } else {
                arg1.field4249 = null;
            }
        }
        if (!arg1.field4253) {
            return;
        }
        if (arg1.field4251 != 0) {
            return;
        }
        if (var2 <= class325.field4341 && var2 > class118.field1361) {
            class316 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field4253) {
                return;
            }
        }
        if (var2 >= class325.field4341 && var2 < class386.field5281 - 1) {
            class316 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field4253) {
                return;
            }
        }
        if (var3 <= class121.field1381 && var3 > class244.field3247) {
            class316 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field4253) {
                return;
            }
        }
        if (var3 >= class121.field1381 && var3 < class369.field5031 - 1) {
            class316 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field4253) {
                return;
            }
        }
        arg1.field4253 = false;
        class196.field2330--;
        class337 var92 = arg1.field4254;
        if (var92 != null && var92.field4588) {
            if (class217.field2665) {
                class184.method1147(arg0, var4, var2, var3);
                class131.field1498.method784(arg0.field494, arg0.field498);
            }
            class175 var93 = var92.method130(class131.field1498, (byte) 89);
            if (var93 != null) {
                var93.field2024 = var92;
                var93.field2026 = var4;
                var93.field2031 = var2;
                var93.field2023 = var3;
                class386.field5275.method1833(var93, 10209);
            }
        }
        if (arg1.field4252 != 0) {
            class364 var94 = arg1.field4259;
            if (var94 != null && !class449.method2780(var5, var2, var3, var94.method414(4096))) {
                if ((var94.field4940 & arg1.field4252) != 0) {
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class175 var95 = var94.method130(class131.field1498, (byte) 62);
                    if (var95 != null) {
                        var95.field2024 = var94;
                        var95.field2026 = var4;
                        var95.field2031 = var2;
                        var95.field2023 = var3;
                        class386.field5275.method1833(var95, 10209);
                    }
                } else if (var94.field4940 == 256) {
                    int var96 = var94.field4948 - class437.field5999;
                    int var97 = var94.field4953 - class278.field3599;
                    int var98 = var94.field4938;
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
                    if (class217.field2665) {
                        class184.method1147(arg0, var4, var2, var3);
                        class131.field1498.method784(arg0.field494, arg0.field498);
                    }
                    class364 var101 = arg1.field4266;
                    if (var100 > var99) {
                        class175 var102 = var94.method130(class131.field1498, (byte) -113);
                        if (var102 != null) {
                            var102.field2024 = var94;
                            var102.field2026 = var4;
                            var102.field2031 = var2;
                            var102.field2023 = var3;
                            class386.field5275.method1833(var102, 10209);
                        }
                    } else if (var101 != null) {
                        class175 var103 = var101.method130(class131.field1498, (byte) 67);
                        if (var103 != null) {
                            var103.field2024 = var101;
                            var103.field2026 = var4;
                            var103.field2031 = var2;
                            var103.field2023 = var3;
                            class386.field5275.method1833(var103, 10209);
                        }
                    }
                }
            }
            class226 var104 = arg1.field4268;
            class226 var105 = arg1.field4269;
            if (var105 != null && (var105.field2873 & arg1.field4252) != 0 && !class40.method254(var5, var2, var3, var105.field2873)) {
                if (class217.field2665) {
                    class176.method1109(arg0, var105.field2873, var4, var2, var3);
                    class131.field1498.method784(arg0.field494, arg0.field498);
                }
                class175 var106 = var105.method130(class131.field1498, (byte) -57);
                if (var106 != null) {
                    var106.field2024 = var105;
                    var106.field2026 = var4;
                    var106.field2031 = var2;
                    var106.field2023 = var3;
                    class386.field5275.method1833(var106, 10209);
                }
            }
            if (var104 != null && (var104.field2873 & arg1.field4252) != 0 && !class40.method254(var5, var2, var3, var104.field2873)) {
                if (class217.field2665) {
                    class176.method1109(arg0, var104.field2873, var4, var2, var3);
                    class131.field1498.method784(arg0.field494, arg0.field498);
                }
                class175 var107 = var104.method130(class131.field1498, (byte) -100);
                if (var107 != null) {
                    var107.field2024 = var104;
                    var107.field2026 = var4;
                    var107.field2031 = var2;
                    var107.field2023 = var3;
                    class386.field5275.method1833(var107, 10209);
                }
            }
        }
        if (var4 < class238.field3149 - 1) {
            class316 var108 = class347.field4722[var4 + 1][var2][var3];
            if (var108 != null && var108.field4253) {
                class419.field5721.method295(var108, -4802);
            }
        }
        if (var2 < class325.field4341) {
            class316 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field4253) {
                class419.field5721.method282(-71, var109);
            }
        }
        if (var3 < class121.field1381) {
            class316 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field4253) {
                class419.field5721.method282(-7, var110);
            }
        }
        if (var2 > class325.field4341) {
            class316 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field4253) {
                class419.field5721.method282(-86, var111);
            }
        }
        if (var3 > class121.field1381) {
            class316 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field4253) {
                class419.field5721.method282(-48, var112);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public final void method885(byte arg0) {
        if (arg0 == -102) {
            this.field1551 = 0;
            this.field1550 = 0;
            field1549++;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class137(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1565 = (int) (arg6 * 4096.0F);
        this.field1561 = (int) (arg7 * 4096.0F);
        this.field1555 = this.field1566 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BII)V")
    public final void method886(byte arg0, int arg1, int arg2) {
        if (arg0 != -38) {
            field1567 = null;
        }
        field1564++;
        if (arg2 == 0) {
            this.field1557 = this.field1565 - (arg1 >= 0 ? arg1 : -arg1);
            this.field1562 = 4096;
            this.field1557 = this.field1557 * this.field1557 >> 12;
            this.field1550 = this.field1557;
            return;
        }
        this.field1562 = this.field1561 * this.field1557 >> 12;
        this.field1557 = this.field1565 - (arg1 < 0 ? -arg1 : arg1);
        if (this.field1562 < 0) {
            this.field1562 = 0;
        } else if (this.field1562 > 4096) {
            this.field1562 = 4096;
        }
        this.field1557 = this.field1557 * this.field1557 >> 12;
        this.field1557 = this.field1562 * this.field1557 >> 12;
        this.field1550 += this.field1557 * this.field1555 >> 12;
        this.field1555 = this.field1566 * this.field1555 >> 12;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public final void method887(boolean arg0) {
        if (arg0) {
            this.method885((byte) -10);
        }
        field1558++;
        this.field1550 >>= 0x4;
        this.field1555 = this.field1566;
        if (this.field1550 < 0) {
            this.field1550 = 0;
        } else if (this.field1550 > 255) {
            this.field1550 = 255;
        }
        this.method883(this.field1551++, (byte) this.field1550);
        this.field1550 = 0;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static void method888(byte arg0) {
        field1567 = null;
        field1559 = null;
        int var1 = -53 / ((arg0 + 54) / 39);
    }

    static {
        new class72("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }
}
