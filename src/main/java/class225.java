import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class225 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "J")
    public long field3874 = 0L;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[[I")
    public static int[][] field3883 = new int[5][5000];

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field3879 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public int field3877;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lsc;")
    public class119 field3878;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lsc;")
    public class119 field3880;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JIILsb;III)V")
    public static final void method1549(long arg0, int arg1, int arg2, class98 arg3, int arg4, int arg5, int arg6) {
        class216 var8 = new class216(128);
        var8.method1477(10, -26755);
        var8.method1470((byte) -122, (int) (Math.random() * 99999.0D));
        var8.method1470((byte) -122, 510);
        field3875++;
        var8.method1484(arg0, (byte) 38);
        var8.method1456((int) (Math.random() * 9.9999999E7D), -23438);
        var8.method1459(arg3, (byte) 78);
        var8.method1456((int) (Math.random() * 9.9999999E7D), -23438);
        var8.method1470((byte) -122, class184.field3166);
        var8.method1477(arg5, -26755);
        var8.method1477(arg4, -26755);
        var8.method1456((int) (Math.random() * 9.9999999E7D), -23438);
        var8.method1470((byte) -122, arg2);
        var8.method1470((byte) -122, arg1);
        var8.method1456((int) (Math.random() * 9.9999999E7D), -23438);
        var8.method1492(class143.field2521, arg6 - 101, class54.field868);
        class237.field4084.field3728 = 0;
        class237.field4084.method1477(55, -26755);
        class237.field4084.method1477(var8.field3728, -26755);
        class237.field4084.method1488(0, -39, var8.field3706, var8.field3728);
        class202.field3440 = -3;
        class9.field210 = arg6;
        class177.field3070 = 0;
        class245.field4331 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg5;
        field3886++;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg7 - arg4;
        int var12 = arg5 - arg4;
        int var13 = arg7 * arg7;
        int var14 = var11 * var11;
        int var15 = arg5 * arg5;
        if (arg3 != 1904512130) {
            method1550(26, 52, 54, 95, 77, -29, -54, 85);
        }
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = var12 << 1;
        int var22 = arg5 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = var15 - ((var22 - 1) * var18);
        int var25 = (1 - var21) * var14 + var19;
        int var26 = var16 - ((var21 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = var19 * 3;
        int var33 = (var22 - 3) * var18;
        int var34 = var28;
        int var35 = (var21 - 3) * var20;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        if (class116.field2077 <= arg2 && arg2 <= class215.field3666) {
            int[] var38 = class43.field721[arg2];
            int var39 = class47.method369(2, arg0 - arg7, class229.field3933, class106.field1899);
            int var40 = class47.method369(2, arg0 + arg7, class229.field3933, class106.field1899);
            int var41 = class47.method369(2, arg0 - var11, class229.field3933, class106.field1899);
            int var42 = class47.method369(2, arg0 + var11, class229.field3933, class106.field1899);
            class37.method305(-7, var38, var41, arg6, var39);
            class37.method305(-7, var38, var42, arg1, var41);
            class37.method305(arg3 ^ 0x8E7B737B, var38, var40, arg6, var42);
        }
        int var43 = (var12 - 1) * var29;
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var34;
                    var10++;
                    var31 += var28;
                    var34 += var28;
                }
            }
            boolean var44 = var12 >= var8;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var37 += var30;
                        var9++;
                        var25 += var32;
                        var32 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var32;
                    var37 += var30;
                    var32 += var30;
                    var9++;
                }
                var26 += -var35;
                var25 += -var43;
                var43 -= var29;
                var35 -= var29;
            }
            if (var24 < 0) {
                var24 += var34;
                var23 += var31;
                var10++;
                var34 += var28;
                var31 += var28;
            }
            var24 += -var33;
            var23 += -var36;
            var36 -= var27;
            var8--;
            var33 -= var27;
            int var45 = arg2 + var8;
            int var46 = arg2 - var8;
            if (var45 >= class116.field2077 && class215.field3666 >= var46) {
                int var47 = class47.method369(2, arg0 + var10, class229.field3933, class106.field1899);
                int var48 = class47.method369(2, arg0 - var10, class229.field3933, class106.field1899);
                if (var44) {
                    int var49 = class47.method369(2, arg0 + var9, class229.field3933, class106.field1899);
                    int var50 = class47.method369(2, arg0 - var9, class229.field3933, class106.field1899);
                    if (var46 >= class116.field2077) {
                        int[] var51 = class43.field721[var46];
                        class37.method305(-7, var51, var50, arg6, var48);
                        class37.method305(-7, var51, var49, arg1, var50);
                        class37.method305(-7, var51, var47, arg6, var49);
                    }
                    if (class215.field3666 >= var45) {
                        int[] var52 = class43.field721[var45];
                        class37.method305(arg3 ^ 0x8E7B737B, var52, var50, arg6, var48);
                        class37.method305(arg3 - 1904512137, var52, var49, arg1, var50);
                        class37.method305(-7, var52, var47, arg6, var49);
                    }
                } else {
                    if (var46 >= class116.field2077) {
                        class37.method305(arg3 ^ 0x8E7B737B, class43.field721[var46], var47, arg6, var48);
                    }
                    if (var45 <= class215.field3666) {
                        class37.method305(-7, class43.field721[var45], var47, arg6, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
    public static final boolean method1551(byte arg0) throws IOException {
        field3885++;
        if (class46.field774 == null) {
            return false;
        }
        int var1 = class46.field774.method786(4316);
        if (var1 == 0) {
            return false;
        }
        if (class222.field3824 == -1) {
            class46.field774.method787(class144.field2536.field3706, 0, 0, 1);
            var1--;
            class144.field2536.field3728 = 0;
            class222.field3824 = class144.field2536.method488((byte) -120);
            class47.field789 = class52.field838[class222.field3824];
        }
        if (class47.field789 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class46.field774.method787(class144.field2536.field3706, 0, 0, 1);
            class47.field789 = class144.field2536.field3706[0] & 0xFF;
            var1--;
        }
        if (class47.field789 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class46.field774.method787(class144.field2536.field3706, 0, 0, 2);
            class144.field2536.field3728 = 0;
            class47.field789 = class144.field2536.method1487(27);
        }
        if (class47.field789 > var1) {
            return false;
        }
        class144.field2536.field3728 = 0;
        class46.field774.method787(class144.field2536.field3706, 0, 0, class47.field789);
        class255.field4498 = class16.field300;
        class16.field300 = class49.field819;
        class134.field2383 = 0;
        class49.field819 = class222.field3824;
        if (class222.field3824 == 1) {
            int var2 = class47.field789 + class144.field2536.field3728;
            int var3 = class144.field2536.method1487(10);
            int var4 = class144.field2536.method1487(76);
            if (class232.field3992 != var3) {
                class232.field3992 = var3;
                class36.method300((byte) -42, class232.field3992);
                class49.method386((byte) 60, false);
                class60.method437(class232.field3992, (byte) -23);
                for (int var5 = 0; var5 < 100; var5++) {
                    class208.field3563[var5] = true;
                }
            }
            while (var4-- > 0) {
                int var14 = class144.field2536.method1442(-1330139880);
                int var15 = class144.field2536.method1487(75);
                int var16 = class144.field2536.method1446(5350);
                class34 var17 = (class34) class243.field4209.method1511((byte) -126, (long) var14);
                if (var17 != null && var17.field596 != var15) {
                    class181.method1250((byte) 65, true, var17);
                    var17 = null;
                }
                if (var17 == null) {
                    var17 = class72.method517(var15, var16, var14, 96);
                }
                var17.field587 = true;
            }
            for (class34 var6 = (class34) class243.field4209.method1514((byte) 78); var6 != null; var6 = (class34) class243.field4209.method1515(124)) {
                if (var6.field587) {
                    var6.field587 = false;
                } else {
                    class181.method1250((byte) 65, true, var6);
                }
            }
            client.field1771.method1517((byte) -60);
            while (var2 > class144.field2536.field3728) {
                int var7 = class144.field2536.method1442(-1330139880);
                int var8 = class144.field2536.method1487(14);
                int var9 = class144.field2536.method1487(108);
                int var10 = class144.field2536.method1442(-1330139880);
                for (int var11 = var8; var11 <= var9; var11++) {
                    long var12 = ((long) var7 << 32) + (long) var11;
                    client.field1771.method1513(var12, new class224(var10), -1);
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 183) {
            byte[] var18 = new byte[class47.field789];
            class144.field2536.method485(var18, -119, class47.field789, 0);
            class72.method501(class186.method1285(0, var18, class47.field789, 0), 1, true);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 90) {
            class258.field4554 = class186.field3214;
            long var19 = class144.field2536.method1439(-715833952);
            if (var19 == 0L) {
                class155.field2826 = null;
                class98.field1688 = null;
                class224.field3870 = null;
                class202.field3443 = 0;
                class222.field3824 = -1;
                return true;
            }
            long var21 = class144.field2536.method1439(-715833952);
            class98.field1688 = class106.method814(var21, (byte) -128);
            class224.field3870 = class106.method814(var19, (byte) -128);
            class211.field3616 = class144.field2536.method1472(66);
            int var23 = class144.field2536.method1446(5350);
            if (var23 == 255) {
                class222.field3824 = -1;
                return true;
            }
            class202.field3443 = var23;
            class86[] var24 = new class86[100];
            for (int var25 = 0; var25 < class202.field3443; var25++) {
                var24[var25] = new class86();
                var24[var25].field4061 = class144.field2536.method1439(-715833952);
                var24[var25].field1509 = class106.method814(var24[var25].field4061, (byte) -128);
                var24[var25].field1516 = class144.field2536.method1487(11);
                var24[var25].field1511 = class144.field2536.method1472(112);
                var24[var25].field1515 = class144.field2536.method1445(-3);
                if (class116.field2082 == var24[var25].field4061) {
                    class134.field2374 = var24[var25].field1511;
                }
            }
            boolean var26 = false;
            int var27 = class202.field3443;
            while (var27 > 0) {
                boolean var28 = true;
                var27--;
                for (int var29 = 0; var29 < var27; var29++) {
                    if (var24[var29].field1509.method746((byte) 79, var24[var29 + 1].field1509) > 0) {
                        class86 var30 = var24[var29];
                        var24[var29] = var24[var29 + 1];
                        var24[var29 + 1] = var30;
                        var28 = false;
                    }
                }
                if (var28) {
                    break;
                }
            }
            class155.field2826 = var24;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 140) {
            int var31 = class144.field2536.method1442(-1330139880);
            int var32 = class144.field2536.method1478(-108);
            if (var32 == 65535) {
                var32 = -1;
            }
            class148 var33 = class62.method455(-854073200, var31);
            if (var33.field2724 != 1 || var33.field2661 != var32) {
                var33.field2724 = 1;
                var33.field2661 = var32;
                class72.method512(var33, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 93) {
            class105.method804(64);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 6) {
            int var34 = class144.field2536.method1479(-118);
            class148 var35 = class62.method455(-854073200, var34);
            for (int var36 = 0; var36 < var35.field2632.length; var36++) {
                var35.field2632[var36] = -1;
                var35.field2632[var36] = 0;
            }
            class72.method512(var35, 2);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 169) {
            int var37 = class144.field2536.method1487(34);
            byte var38 = class144.field2536.method1457((byte) 115);
            class111.method839(var38, 0, var37);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 119) {
            int var39 = class144.field2536.method1475((byte) 115);
            int var40 = class144.field2536.method1478(-115);
            class98 var41 = class144.field2536.method1445(-3);
            class129.method979(true, var39);
            class244.method1684(var40, 12452, var41);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 211) {
            int var42 = class144.field2536.method1478(-105);
            if (var42 == 65535) {
                var42 = -1;
            }
            class186.method1283(-49, var42);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 70) {
            int var43 = class144.field2536.method1475((byte) 97);
            int var44 = class144.field2536.method1447(-112);
            if (var43 == 65535) {
                var43 = -1;
            }
            class8.method52(var43, -1, var44);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 207) {
            class55.method405(class47.field789, (byte) -96, class119.field2145, class144.field2536);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 243) {
            int var45 = class144.field2536.method1478(-73);
            if (var45 == 65535) {
                var45 = -1;
            }
            int var46 = class144.field2536.method1479(-107);
            int var47 = var46 >> 28 & 0x3;
            int var48 = (var46 & 0xFFFF332) >> 14;
            int var49 = class144.field2536.method1446(5350);
            int var50 = var48 - class189.field3277;
            int var51 = var49 >> 2;
            int var52 = var46 & 0x3FFF;
            int var53 = var49 & 0x3;
            int var54 = class76.field1358[var51];
            int var55 = var52 - class182.field3143;
            class145.method1075(var55, var53, var45, var54, var47, var50, 1, var51);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 35) {
            int var56 = class144.field2536.method1446(5350);
            int var57 = class144.field2536.method1446(5350);
            int var58 = class144.field2536.method1446(5350);
            int var59 = class144.field2536.method1446(5350);
            int var60 = class144.field2536.method1487(32);
            class137.field2429[var56] = true;
            class115.field2051[var56] = var57;
            class222.field3839[var56] = var58;
            class108.field1929[var56] = var59;
            class190.field3281[var56] = var60;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 174) {
            class41.method330(class144.field2536, -109);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 127) {
            int var61 = class144.field2536.method1471(4);
            int var62 = class144.field2536.method1478(-106);
            int var63 = class144.field2536.method1442(-1330139880);
            class34 var64 = (class34) class243.field4209.method1511((byte) -124, (long) var63);
            if (var64 != null) {
                class181.method1250((byte) 65, var64.field596 != var62, var64);
            }
            class72.method517(var62, var61, var63, -67);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 201) {
            long var65 = class144.field2536.method1439(-715833952);
            class144.field2536.method1472(79);
            long var67 = class144.field2536.method1439(-715833952);
            long var69 = (long) class144.field2536.method1487(71);
            long var71 = (long) class144.field2536.method1448(26420);
            boolean var73 = false;
            int var74 = class144.field2536.method1446(5350);
            int var75 = class144.field2536.method1487(94);
            long var76 = (var69 << 32) + var71;
            int var78 = 0;
            label1159: while (true) {
                if (var78 >= 100) {
                    if (var74 <= 1) {
                        for (int var79 = 0; var79 < class191.field3318; var79++) {
                            if (class228.field3926[var79] == var65) {
                                var73 = true;
                                break label1159;
                            }
                        }
                    }
                    break;
                }
                if (class183.field3147[var78] == var76) {
                    var73 = true;
                    break;
                }
                var78++;
            }
            if (!var73 && class90.field1586 == 0) {
                class183.field3147[class210.field3601] = var76;
                class210.field3601 = (class210.field3601 + 1) % 100;
                class98 var80 = class90.method663(var75, 0).method439(class144.field2536, (byte) -5);
                if (var74 == 2 || var74 == 3) {
                    class15.method127(var75, 0, var80, 20, class106.method814(var67, (byte) -128).method726((byte) -100), class186.method1288(new class98[] { class170.field3004, class106.method814(var65, (byte) -128).method726((byte) -100) }, 31618));
                } else if (var74 == 1) {
                    class15.method127(var75, 0, var80, 20, class106.method814(var67, (byte) -128).method726((byte) -100), class186.method1288(new class98[] { class136.field2398, class106.method814(var65, (byte) -128).method726((byte) -100) }, 31618));
                } else {
                    class15.method127(var75, 0, var80, 20, class106.method814(var67, (byte) -128).method726((byte) -100), class106.method814(var65, (byte) -128).method726((byte) -100));
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 137) {
            class154.field2805 = class144.field2536.method1446(5350);
            class262.field4602 = class144.field2536.method1446(5350);
            class79.field1406 = class144.field2536.method1446(5350);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 241) {
            class98 var81 = class144.field2536.method1445(-3);
            if (var81.method750((byte) 124, class20.field356)) {
                class98 var82 = var81.method742(-117, 0, var81.method710(-66, class120.field2178));
                long var83 = var82.method727((byte) 36);
                boolean var85 = false;
                for (int var86 = 0; var86 < class191.field3318; var86++) {
                    if (class228.field3926[var86] == var83) {
                        var85 = true;
                        break;
                    }
                }
                if (!var85 && class90.field1586 == 0) {
                    class176.method1228(var82, class37.field623, (byte) -49, 4);
                }
            } else if (var81.method750((byte) 122, class174.field3045)) {
                class98 var87 = var81.method742(-116, 0, var81.method710(-62, class120.field2178));
                boolean var88 = false;
                long var89 = var87.method727((byte) 36);
                for (int var91 = 0; var91 < class191.field3318; var91++) {
                    if (class228.field3926[var91] == var89) {
                        var88 = true;
                        break;
                    }
                }
                if (!var88 && class90.field1586 == 0) {
                    class98 var92 = var81.method742(78, var81.method710(-86, class120.field2178) + 1, var81.method724((byte) 25) + -9);
                    class176.method1228(var87, var92, (byte) -49, 8);
                }
            } else if (var81.method750((byte) 124, class235.field4064)) {
                class98 var93 = var81.method742(-103, 0, var81.method710(-65, class120.field2178));
                long var94 = var93.method727((byte) 36);
                boolean var96 = false;
                for (int var97 = 0; var97 < class191.field3318; var97++) {
                    if (class228.field3926[var97] == var94) {
                        var96 = true;
                        break;
                    }
                }
                if (!var96 && class90.field1586 == 0) {
                    class176.method1228(var93, class233.field4011, (byte) -49, 10);
                }
            } else if (var81.method750((byte) 125, class187.field3224)) {
                class98 var121 = var81.method742(-118, 0, var81.method710(-96, class187.field3224));
                class176.method1228(class233.field4011, var121, (byte) -49, 11);
            } else if (var81.method750((byte) 121, class261.field4583)) {
                class98 var120 = var81.method742(52, 0, var81.method710(-115, class261.field4583));
                if (class90.field1586 == 0) {
                    class176.method1228(class233.field4011, var120, (byte) -49, 12);
                }
            } else if (var81.method750((byte) 121, class243.field4215)) {
                class98 var119 = var81.method742(50, 0, var81.method710(-125, class243.field4215));
                if (class90.field1586 == 0) {
                    class176.method1228(class233.field4011, var119, (byte) -49, 13);
                }
            } else if (var81.method750((byte) 125, class244.field4237)) {
                class98 var114 = var81.method742(103, 0, var81.method710(-88, class120.field2178));
                long var115 = var114.method727((byte) 36);
                boolean var117 = false;
                for (int var118 = 0; var118 < class191.field3318; var118++) {
                    if (class228.field3926[var118] == var115) {
                        var117 = true;
                        break;
                    }
                }
                if (!var117 && class90.field1586 == 0) {
                    class176.method1228(var114, class233.field4011, (byte) -49, 14);
                }
            } else if (var81.method750((byte) 124, class28.field530)) {
                class98 var98 = var81.method742(66, 0, var81.method710(-124, class120.field2178));
                boolean var99 = false;
                long var100 = var98.method727((byte) 36);
                for (int var102 = 0; var102 < class191.field3318; var102++) {
                    if (class228.field3926[var102] == var100) {
                        var99 = true;
                        break;
                    }
                }
                if (!var99 && class90.field1586 == 0) {
                    class176.method1228(var98, class233.field4011, (byte) -49, 15);
                }
            } else if (var81.method750((byte) 126, class55.field873)) {
                class98 var109 = var81.method742(103, 0, var81.method710(-102, class120.field2178));
                boolean var110 = false;
                long var111 = var109.method727((byte) 36);
                for (int var113 = 0; var113 < class191.field3318; var113++) {
                    if (class228.field3926[var113] == var111) {
                        var110 = true;
                        break;
                    }
                }
                if (!var110 && class90.field1586 == 0) {
                    class176.method1228(var109, class233.field4011, (byte) -49, 16);
                }
            } else if (var81.method750((byte) 127, class75.field1325)) {
                class98 var103 = var81.method742(85, 0, var81.method710(-56, class120.field2178));
                long var104 = var103.method727((byte) 36);
                boolean var106 = false;
                for (int var107 = 0; var107 < class191.field3318; var107++) {
                    if (class228.field3926[var107] == var104) {
                        var106 = true;
                        break;
                    }
                }
                if (!var106 && class90.field1586 == 0) {
                    class98 var108 = var81.method742(76, var81.method710(-78, class120.field2178) + 1, var81.method724((byte) 25) + -9);
                    class176.method1228(var103, var108, (byte) -49, 21);
                }
            } else {
                class176.method1228(class233.field4011, var81, (byte) -49, 0);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 24) {
            int var122 = class144.field2536.method1441(2);
            int var123 = class144.field2536.method1446(5350);
            if (var123 == 2) {
                class197.method1351(-51);
            }
            class232.field3992 = var122;
            class36.method300((byte) -42, var122);
            class49.method386((byte) 60, false);
            class60.method437(class232.field3992, (byte) -113);
            for (int var124 = 0; var124 < 100; var124++) {
                class208.field3563[var124] = true;
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 178) {
            for (int var125 = 0; var125 < class141.field2499.length; var125++) {
                if (class141.field2499[var125] != null) {
                    class141.field2499[var125].field4503 = -1;
                }
            }
            for (int var126 = 0; var126 < class180.field3109.length; var126++) {
                if (class180.field3109[var126] != null) {
                    class180.field3109[var126].field4503 = -1;
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 33) {
            class251.field4398 = class144.field2536.method1446(5350);
            class153.field2802 = class144.field2536.method1443(4);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 222) {
            int var127 = class144.field2536.method1478(-108);
            if (var127 == 65535) {
                var127 = -1;
            }
            int var128 = class144.field2536.method1441(2);
            int var129 = class144.field2536.method1442(-1330139880);
            int var130 = class144.field2536.method1458((byte) 119);
            if (var128 == 65535) {
                var128 = -1;
            }
            for (int var131 = var127; var131 <= var128; var131++) {
                long var132 = ((long) var130 << 32) + (long) var131;
                class235 var134 = client.field1771.method1511((byte) -128, var132);
                if (var134 != null) {
                    var134.method1611((byte) -128);
                }
                client.field1771.method1513(var132, new class224(var129), -1);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 166) {
            class54.field864 = class144.field2536.method1446(5350);
            class222.field3824 = -1;
            class237.field4093 = class186.field3214;
            return true;
        } else if (class222.field3824 == 142) {
            class121.field2219 = class144.field2536.method1441(2) * 30;
            class68.field1099 = class186.field3214;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 32) {
            int var135 = class144.field2536.method1487(88);
            int var136 = class144.field2536.method1475((byte) -111);
            class98 var137 = class144.field2536.method1445(-3);
            class129.method979(true, var135);
            class244.method1684(var136, 12452, var137);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 193) {
            long var138 = class144.field2536.method1439(-715833952);
            int var140 = class144.field2536.method1487(11);
            int var141 = class144.field2536.method1446(5350);
            class98 var142 = class233.field4011;
            if (var140 > 0) {
                var142 = class144.field2536.method1445(-3);
            }
            boolean var143 = true;
            if (var138 < 0L) {
                var143 = false;
                var138 &= Long.MAX_VALUE;
            }
            class98 var144 = class106.method814(var138, (byte) -128).method726((byte) -100);
            for (int var145 = 0; var145 < class99.field1751; var145++) {
                if (class74.field1270[var145] == var138) {
                    if (class158.field2875[var145] != var140) {
                        class158.field2875[var145] = var140;
                        if (var140 > 0) {
                            class176.method1228(class233.field4011, class186.method1288(new class98[] { var144, class67.field1065 }, 31618), (byte) -49, 5);
                        }
                        if (var140 == 0) {
                            class176.method1228(class233.field4011, class186.method1288(new class98[] { var144, class100.field1760 }, 31618), (byte) -49, 5);
                        }
                    }
                    var144 = null;
                    class150.field2769[var145] = var142;
                    class107.field1923[var145] = var141;
                    class265.field4635[var145] = var143;
                    break;
                }
            }
            boolean var146 = false;
            if (var144 != null && class99.field1751 < 200) {
                class74.field1270[class99.field1751] = var138;
                class49.field817[class99.field1751] = var144;
                class158.field2875[class99.field1751] = var140;
                class150.field2769[class99.field1751] = var142;
                class107.field1923[class99.field1751] = var141;
                class265.field4635[class99.field1751] = var143;
                class99.field1751++;
            }
            int var147 = class99.field1751;
            class237.field4093 = class186.field3214;
            while (var147 > 0) {
                var147--;
                boolean var148 = true;
                for (int var149 = 0; var149 < var147; var149++) {
                    if (class158.field2875[var149] != class85.field1502 && class158.field2875[var149 + 1] == class85.field1502 || class158.field2875[var149] == 0 && class158.field2875[var149 + 1] != 0) {
                        var148 = false;
                        int var150 = class158.field2875[var149];
                        class158.field2875[var149] = class158.field2875[var149 + 1];
                        class158.field2875[var149 + 1] = var150;
                        class98 var151 = class150.field2769[var149];
                        class150.field2769[var149] = class150.field2769[var149 + 1];
                        class150.field2769[var149 + 1] = var151;
                        class98 var152 = class49.field817[var149];
                        class49.field817[var149] = class49.field817[var149 + 1];
                        class49.field817[var149 + 1] = var152;
                        long var153 = class74.field1270[var149];
                        class74.field1270[var149] = class74.field1270[var149 + 1];
                        class74.field1270[var149 + 1] = var153;
                        int var155 = class107.field1923[var149];
                        class107.field1923[var149] = class107.field1923[var149 + 1];
                        class107.field1923[var149 + 1] = var155;
                        boolean var156 = class265.field4635[var149];
                        class265.field4635[var149] = class265.field4635[var149 + 1];
                        class265.field4635[var149 + 1] = var156;
                    }
                }
                if (var148) {
                    break;
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 242) {
            class16.method133(-1);
            int var157 = class144.field2536.method1442(-1330139880);
            int var158 = class144.field2536.method1443(4);
            int var159 = class144.field2536.method1480(-118);
            class23.field476[var158] = var157;
            class222.field3817[var158] = var159;
            class167.field2980[var158] = 1;
            for (int var160 = 0; var160 < 98; var160++) {
                if (var157 >= class125.field2256[var160]) {
                    class167.field2980[var158] = var160 + 2;
                }
            }
            class204.field3489[class214.method1427(31, class96.field1660++)] = var158;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 213) {
            int var161 = class144.field2536.method1466(0);
            int var162 = class144.field2536.method1487(40);
            class111.method839(var161, 0, var162);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 252) {
            int var163 = class144.field2536.method1487(50);
            int var164 = class144.field2536.method1441(2);
            int var165 = class144.field2536.method1466(0);
            class129.method979(true, var164);
            class180.method1244(var165, false, var163);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 14) {
            for (int var166 = 0; var166 < class118.field2117.length; var166++) {
                if (class68.field1086[var166] != class118.field2117[var166]) {
                    class118.field2117[var166] = class68.field1086[var166];
                    class141.method1057(var166, 14);
                    class102.field1821[class214.method1427(class253.field4430++, 31)] = var166;
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 120) {
            class250.field4387 = 0;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 175) {
            int var167 = class144.field2536.method1480(-124);
            int var168 = class144.field2536.method1443(4);
            int var169 = class144.field2536.method1480(-123);
            class265.field4640 = var167 >> 1;
            class163.field2943.method1765((var167 & 0x1) == 1, var168, var169, (byte) -121);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 22) {
            class103.method793(true, 0);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 13) {
            int var170 = class144.field2536.method1441(2);
            int var171 = class144.field2536.method1475((byte) -102);
            int var172 = class144.field2536.method1466(0);
            class148 var173 = class62.method455(-854073200, var172);
            class222.field3824 = -1;
            var173.field2604 = (var170 << 16) + var171;
            return true;
        } else if (arg0 > -120) {
            return false;
        } else if (class222.field3824 == 122) {
            int var174 = class144.field2536.method1446(5350);
            int var175 = var174 >> 6;
            class88 var176 = new class88();
            var176.field1559 = var174 & 0x3F;
            var176.field1558 = class144.field2536.method1446(5350);
            if (var176.field1558 >= 0 && var176.field1558 < class14.field276.length) {
                if (var176.field1559 == 1 || var176.field1559 == 10) {
                    var176.field1561 = class144.field2536.method1487(31);
                    class144.field2536.field3728 += 3;
                } else if (var176.field1559 >= 2 && var176.field1559 <= 6) {
                    if (var176.field1559 == 2) {
                        var176.field1562 = 64;
                        var176.field1565 = 64;
                    }
                    if (var176.field1559 == 3) {
                        var176.field1562 = 64;
                        var176.field1565 = 0;
                    }
                    if (var176.field1559 == 4) {
                        var176.field1562 = 64;
                        var176.field1565 = 128;
                    }
                    if (var176.field1559 == 5) {
                        var176.field1565 = 64;
                        var176.field1562 = 0;
                    }
                    if (var176.field1559 == 6) {
                        var176.field1565 = 64;
                        var176.field1562 = 128;
                    }
                    var176.field1559 = 2;
                    var176.field1564 = class144.field2536.method1487(12);
                    var176.field1567 = class144.field2536.method1487(110);
                    var176.field1555 = class144.field2536.method1446(5350);
                }
                var176.field1556 = class144.field2536.method1487(53);
                if (var176.field1556 == 65535) {
                    var176.field1556 = -1;
                }
                class262.field4597[var175] = var176;
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 226) {
            int var177 = class144.field2536.method1446(5350);
            if (class144.field2536.method1446(5350) == 0) {
                class148.field2663[var177] = new class46();
            } else {
                class144.field2536.field3728--;
                class148.field2663[var177] = new class46(class144.field2536);
            }
            class143.field2526 = class186.field3214;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 244) {
            if (class232.field3992 != -1) {
                class235.method1610(class232.field3992, 24148, 0);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 157) {
            class16.method133(-1);
            class113.field2016 = class144.field2536.method1483(-68);
            class222.field3824 = -1;
            class68.field1099 = class186.field3214;
            return true;
        } else if (class222.field3824 == 250) {
            long var178 = class144.field2536.method1439(-715833952);
            class144.field2536.method1472(81);
            long var180 = class144.field2536.method1439(-715833952);
            long var182 = (long) class144.field2536.method1487(125);
            long var184 = (long) class144.field2536.method1448(26420);
            int var186 = class144.field2536.method1446(5350);
            long var187 = (var182 << 32) + var184;
            boolean var189 = false;
            int var190 = 0;
            label1300: while (true) {
                if (var190 >= 100) {
                    if (var186 <= 1) {
                        if (class190.field3286 == 1 || class105.field1878 == 1) {
                            var189 = true;
                        } else {
                            for (int var191 = 0; var191 < class191.field3318; var191++) {
                                if (class228.field3926[var191] == var178) {
                                    var189 = true;
                                    break label1300;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class183.field3147[var190] == var187) {
                    var189 = true;
                    break;
                }
                var190++;
            }
            if (!var189 && class90.field1586 == 0) {
                class183.field3147[class210.field3601] = var187;
                class210.field3601 = (class210.field3601 + 1) % 100;
                class98 var192 = class73.method544(class236.method1613(-101, class144.field2536).method713(63));
                if (var186 == 2 || var186 == 3) {
                    class23.method242(class106.method814(var180, (byte) -128).method726((byte) -100), var192, class186.method1288(new class98[] { class170.field3004, class106.method814(var178, (byte) -128).method726((byte) -100) }, 31618), (byte) -58, 9);
                } else if (var186 == 1) {
                    class23.method242(class106.method814(var180, (byte) -128).method726((byte) -100), var192, class186.method1288(new class98[] { class136.field2398, class106.method814(var178, (byte) -128).method726((byte) -100) }, 31618), (byte) -58, 9);
                } else {
                    class23.method242(class106.method814(var180, (byte) -128).method726((byte) -100), var192, class106.method814(var178, (byte) -128).method726((byte) -100), (byte) -58, 9);
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 111) {
            int var193 = class144.field2536.method1446(5350);
            int var194 = class144.field2536.method1480(-114);
            class98 var195 = class144.field2536.method1445(-3);
            if (var193 >= 1 && var193 <= 8) {
                if (var195.method731((byte) 110, class99.field1745)) {
                    var195 = null;
                }
                class214.field3648[var193 - 1] = var195;
                class234.field4036[var193 - 1] = var194 == 0;
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 104) {
            class98 var196 = class144.field2536.method1445(-3);
            Object[] var197 = new Object[var196.method724((byte) 25) + 1];
            for (int var198 = var196.method724((byte) 25) - 1; var198 >= 0; var198--) {
                if (var196.method730(var198, -26815) == 115) {
                    var197[var198 + 1] = class144.field2536.method1445(-3);
                } else {
                    var197[var198 + 1] = Integer.valueOf(class144.field2536.method1442(-1330139880));
                }
            }
            var197[0] = Integer.valueOf(class144.field2536.method1442(-1330139880));
            class28 var199 = new class28();
            var199.field514 = var197;
            class192.method1327(var199, 200000);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 251) {
            int var200 = class144.field2536.method1446(5350);
            int var201 = class144.field2536.method1446(5350);
            int var202 = class144.field2536.method1487(11);
            int var203 = class144.field2536.method1446(5350);
            int var204 = class144.field2536.method1446(5350);
            class60.method438(var201, var204, var202, (byte) 117, var203, var200);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 37) {
            long var205 = class144.field2536.method1439(-715833952);
            int var207 = class144.field2536.method1487(106);
            class98 var208 = class90.method663(var207, 0).method439(class144.field2536, (byte) -5);
            class15.method127(var207, 0, var208, 19, (class98) null, class106.method814(var205, (byte) -128).method726((byte) -100));
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 147) {
            int var209 = class144.field2536.method1475((byte) 40);
            if (var209 == 65535) {
                var209 = -1;
            }
            int var210 = class144.field2536.method1442(-1330139880);
            class148 var211 = class62.method455(-854073200, var210);
            if (var211.field2724 != 2 || var211.field2661 != var209) {
                var211.field2724 = 2;
                var211.field2661 = var209;
                class72.method512(var211, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 34) {
            class62.method452((byte) 91);
            class16.method133(-1);
            class253.field4430 += 32;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 61) {
            class136.method1019((byte) 50, class144.field2536.method1445(-3));
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 218) {
            int var212 = class144.field2536.method1442(-1330139880);
            int var213 = class144.field2536.method1442(-1330139880);
            class34 var214 = (class34) class243.field4209.method1511((byte) -127, (long) var212);
            class34 var215 = (class34) class243.field4209.method1511((byte) -128, (long) var213);
            if (var215 != null) {
                class181.method1250((byte) 65, var214 == null || var214.field596 != var215.field596, var215);
            }
            if (var214 != null) {
                var214.method1611((byte) -125);
                class243.field4209.method1513((long) var213, var214, -1);
            }
            class148 var216 = class62.method455(-854073200, var212);
            if (var216 != null) {
                class72.method512(var216, 2);
            }
            class148 var217 = class62.method455(-854073200, var213);
            if (var217 != null) {
                class72.method512(var217, 2);
                class120.method902(var217, true, (byte) 59);
            }
            if (class232.field3992 != -1) {
                class235.method1610(class232.field3992, 24148, 1);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 138) {
            int var218 = class144.field2536.method1487(95);
            if (var218 == 65535) {
                var218 = -1;
            }
            int var219 = class144.field2536.method1446(5350);
            int var220 = class144.field2536.method1487(4);
            class131.method990(5064, var218, var220, var219);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 232) {
            int var221 = class144.field2536.method1487(93);
            int var222 = class144.field2536.method1478(-96);
            int var223 = class144.field2536.method1441(2);
            int var224 = class144.field2536.method1442(-1330139880);
            class148 var225 = class62.method455(-854073200, var224);
            if (var225.field2608 != var221 || var225.field2631 != var222 || var225.field2646 != var223) {
                var225.field2608 = var221;
                var225.field2631 = var222;
                var225.field2646 = var223;
                class72.method512(var225, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 17) {
            class124.field2250 = class144.field2536.method1446(5350);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 54) {
            int var226 = class144.field2536.method1441(2);
            int var227 = class144.field2536.method1442(-1330139880);
            if (var226 == 65535) {
                var226 = -1;
            }
            int var228 = class144.field2536.method1479(-123);
            class148 var229 = class62.method455(-854073200, var227);
            if (var229.field2619) {
                var229.field2654 = var226;
                var229.field2658 = var228;
                class245 var230 = class235.method1605(111, var226);
                var229.field2656 = var230.field4310;
                var229.field2607 = var230.field4314;
                var229.field2646 = var230.field4277;
                if (var229.field2681 > 0) {
                    var229.field2646 = var229.field2646 * 32 / var229.field2681;
                } else if (var229.field2669 > 0) {
                    var229.field2646 = var229.field2646 * 32 / var229.field2669;
                }
                var229.field2608 = var230.field4321;
                var229.field2699 = var230.field4330;
                var229.field2631 = var230.field4307;
                class72.method512(var229, 2);
            } else if (var226 == -1) {
                var229.field2724 = 0;
                class222.field3824 = -1;
                return true;
            } else {
                class245 var231 = class235.method1605(-102, var226);
                var229.field2631 = var231.field4307;
                var229.field2608 = var231.field4321;
                var229.field2661 = var226;
                var229.field2646 = var231.field4277 * 100 / var228;
                var229.field2724 = 4;
                class72.method512(var229, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 205) {
            class191.field3318 = class47.field789 / 8;
            for (int var232 = 0; var232 < class191.field3318; var232++) {
                class228.field3926[var232] = class144.field2536.method1439(-715833952);
                class181.field3131[var232] = class106.method814(class228.field3926[var232], (byte) -128);
            }
            class222.field3824 = -1;
            class237.field4093 = class186.field3214;
            return true;
        } else if (class222.field3824 == 36) {
            int var233 = class144.field2536.method1442(-1330139880);
            int var234 = class144.field2536.method1487(59);
            class148 var235;
            if (var233 >= 0) {
                var235 = class62.method455(-854073200, var233);
            } else {
                var235 = null;
            }
            if (var235 != null) {
                for (int var236 = 0; var236 < var235.field2632.length; var236++) {
                    var235.field2632[var236] = 0;
                    var235.field2612[var236] = 0;
                }
            }
            if (var233 < -70000) {
                var234 += 32768;
            }
            class109.method830(var234, 0);
            int var237 = class144.field2536.method1487(102);
            for (int var238 = 0; var238 < var237; var238++) {
                int var239 = class144.field2536.method1480(-116);
                if (var239 == 255) {
                    var239 = class144.field2536.method1479(-93);
                }
                int var240 = class144.field2536.method1475((byte) 122);
                if (var235 != null && var238 < var235.field2632.length) {
                    var235.field2632[var238] = var240;
                    var235.field2612[var238] = var239;
                }
                class139.method1049((byte) 114, var240 - 1, var238, var239, var234);
            }
            if (var235 != null) {
                class72.method512(var235, 2);
            }
            class16.method133(-1);
            class110.field1964[class214.method1427(31, class2.field30++)] = class214.method1427(32767, var234);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 15) {
            int var241 = class144.field2536.method1443(4);
            int var242 = class144.field2536.method1441(2);
            class112.method844(var242, var241, 1);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 117) {
            class16.method133(-1);
            class114.field2025 = class144.field2536.method1446(5350);
            class68.field1099 = class186.field3214;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 190) {
            long var243 = class144.field2536.method1439(-715833952);
            long var245 = (long) class144.field2536.method1487(35);
            long var247 = (long) class144.field2536.method1448(26420);
            int var249 = class144.field2536.method1446(5350);
            long var250 = (var245 << 32) + var247;
            boolean var252 = false;
            int var253 = 0;
            label1370: while (true) {
                if (var253 >= 100) {
                    if (var249 <= 1) {
                        if (class190.field3286 == 1 || class105.field1878 == 1) {
                            var252 = true;
                        } else {
                            for (int var254 = 0; var254 < class191.field3318; var254++) {
                                if (class228.field3926[var254] == var243) {
                                    var252 = true;
                                    break label1370;
                                }
                            }
                        }
                    }
                    break;
                }
                if (class183.field3147[var253] == var250) {
                    var252 = true;
                    break;
                }
                var253++;
            }
            if (!var252 && class90.field1586 == 0) {
                class183.field3147[class210.field3601] = var250;
                class210.field3601 = (class210.field3601 + 1) % 100;
                class98 var255 = class73.method544(class236.method1613(-84, class144.field2536).method713(63));
                if (var249 == 2 || var249 == 3) {
                    class176.method1228(class186.method1288(new class98[] { class170.field3004, class106.method814(var243, (byte) -128).method726((byte) -100) }, 31618), var255, (byte) -49, 7);
                } else if (var249 == 1) {
                    class176.method1228(class186.method1288(new class98[] { class136.field2398, class106.method814(var243, (byte) -128).method726((byte) -100) }, 31618), var255, (byte) -49, 7);
                } else {
                    class176.method1228(class106.method814(var243, (byte) -128).method726((byte) -100), var255, (byte) -49, 3);
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 181) {
            long var256 = class144.field2536.method1439(-715833952);
            class98 var258 = class73.method544(class236.method1613(-76, class144.field2536).method713(63));
            class176.method1228(class106.method814(var256, (byte) -128).method726((byte) -100), var258, (byte) -49, 6);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 75) {
            if (class47.field789 == 0) {
                class64.field1053 = class166.field2969;
            } else {
                class64.field1053 = class144.field2536.method1445(-3);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 65) {
            class98 var259 = class144.field2536.method1445(-3);
            int var260 = class144.field2536.method1442(-1330139880);
            class148 var261 = class62.method455(-854073200, var260);
            if (!var259.method748(true, var261.field2591)) {
                var261.field2591 = var259;
                class72.method512(var261, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 164) {
            int var262 = class144.field2536.method1483(-114);
            int var263 = class144.field2536.method1483(-68);
            int var264 = class144.field2536.method1458((byte) 80);
            class148 var265 = class62.method455(-854073200, var264);
            var265.field2598 = var265.field2742 = var262;
            var265.field2642 = 0;
            var265.field2720 = 0;
            var265.field2677 = var265.field2634 = var263;
            class72.method512(var265, 2);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 229) {
            long var266 = class144.field2536.method1439(-715833952);
            int var268 = class144.field2536.method1487(123);
            byte var269 = class144.field2536.method1472(79);
            boolean var270 = false;
            if ((Long.MIN_VALUE & var266) != 0L) {
                var270 = true;
            }
            if (var270) {
                if (class202.field3443 == 0) {
                    class222.field3824 = -1;
                    return true;
                }
                long var271 = var266 & Long.MAX_VALUE;
                boolean var273 = false;
                int var274;
                for (var274 = 0; class202.field3443 > var274 && (class155.field2826[var274].field4061 != var271 || class155.field2826[var274].field1516 != var268); var274++) {
                }
                if (class202.field3443 > var274) {
                    while (var274 < class202.field3443 - 1) {
                        class155.field2826[var274] = class155.field2826[var274 + 1];
                        var274++;
                    }
                    class202.field3443--;
                    class155.field2826[class202.field3443] = null;
                }
            } else {
                class98 var275 = class144.field2536.method1445(-3);
                class86 var276 = new class86();
                var276.field4061 = var266;
                var276.field1509 = class106.method814(var276.field4061, (byte) -128);
                var276.field1515 = var275;
                var276.field1511 = var269;
                var276.field1516 = var268;
                int var277;
                for (var277 = class202.field3443 - 1; var277 >= 0; var277--) {
                    int var278 = class155.field2826[var277].field1509.method746((byte) 43, var276.field1509);
                    if (var278 == 0) {
                        class155.field2826[var277].field1516 = var268;
                        class155.field2826[var277].field1511 = var269;
                        class155.field2826[var277].field1515 = var275;
                        class222.field3824 = -1;
                        class258.field4554 = class186.field3214;
                        if (class116.field2082 == var266) {
                            class134.field2374 = var269;
                        }
                        return true;
                    }
                    if (var278 < 0) {
                        break;
                    }
                }
                if (class155.field2826.length <= class202.field3443) {
                    class222.field3824 = -1;
                    return true;
                }
                for (int var279 = class202.field3443 - 1; var279 > var277; var279--) {
                    class155.field2826[var279 + 1] = class155.field2826[var279];
                }
                if (class202.field3443 == 0) {
                    class155.field2826 = new class86[100];
                }
                class155.field2826[var277 + 1] = var276;
                if (class116.field2082 == var266) {
                    class134.field2374 = var269;
                }
                class202.field3443++;
            }
            class258.field4554 = class186.field3214;
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 62) {
            int var280 = class144.field2536.method1483(-72);
            int var281 = class144.field2536.method1479(-95);
            class148 var282 = class62.method455(-854073200, var281);
            if (var282.field2629 != var280 || var280 == -1) {
                var282.field2633 = 0;
                var282.field2679 = 0;
                var282.field2629 = var280;
                class72.method512(var282, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 206) {
            int var283 = class144.field2536.method1487(104);
            int var284 = class144.field2536.method1441(2);
            class243.field4219 = var283;
            class113.field2002 = var284;
            class245.method1690(1098064519);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 91) {
            boolean var285 = class144.field2536.method1443(4) == 1;
            int var286 = class144.field2536.method1458((byte) 104);
            class148 var287 = class62.method455(-854073200, var286);
            if (var287.field2620 != var285) {
                var287.field2620 = var285;
                class72.method512(var287, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 71) {
            int var288 = class144.field2536.method1458((byte) 91);
            int var289 = class144.field2536.method1441(2);
            class148 var290 = class62.method455(-854073200, var288);
            if (var290 != null && var290.field2665 == 0) {
                if ((var290.field2644 - var290.field2647) < var289) {
                    var289 = var290.field2644 - var290.field2647;
                }
                if (var289 < 0) {
                    var289 = 0;
                }
                if (var290.field2615 != var289) {
                    var290.field2615 = var289;
                    class72.method512(var290, 2);
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 116) {
            class103.method793(false, 0);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 133) {
            class153.field2802 = class144.field2536.method1480(-123);
            class251.field4398 = class144.field2536.method1443(4);
            for (int var291 = class153.field2802; var291 < (class153.field2802 + 8); var291++) {
                for (int var293 = class251.field4398; var293 < class251.field4398 + 8; var293++) {
                    if (class115.field2050[class265.field4640][var291][var293] != null) {
                        class115.field2050[class265.field4640][var291][var293] = null;
                        class43.method344(var293, 1, var291);
                    }
                }
            }
            for (class262 var292 = (class262) class153.field2794.method371((byte) 61); var292 != null; var292 = (class262) class153.field2794.method370(true)) {
                if (var292.field4593 >= class153.field2802 && (class153.field2802 + 8) > var292.field4593 && var292.field4595 >= class251.field4398 && var292.field4595 < (class251.field4398 + 8) && class265.field4640 == var292.field4589) {
                    var292.field4608 = 0;
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 47) {
            long var294 = class144.field2536.method1439(-715833952);
            long var296 = (long) class144.field2536.method1487(26);
            long var298 = (long) class144.field2536.method1448(26420);
            int var300 = class144.field2536.method1446(5350);
            int var301 = class144.field2536.method1487(17);
            long var302 = (var296 << 32) + var298;
            boolean var304 = false;
            int var305 = 0;
            label1442: while (true) {
                if (var305 >= 100) {
                    if (var300 <= 1) {
                        for (int var306 = 0; var306 < class191.field3318; var306++) {
                            if (class228.field3926[var306] == var294) {
                                var304 = true;
                                break label1442;
                            }
                        }
                    }
                    break;
                }
                if (class183.field3147[var305] == var302) {
                    var304 = true;
                    break;
                }
                var305++;
            }
            if (!var304 && class90.field1586 == 0) {
                class183.field3147[class210.field3601] = var302;
                class210.field3601 = (class210.field3601 + 1) % 100;
                class98 var307 = class90.method663(var301, 0).method439(class144.field2536, (byte) -5);
                if (var300 == 2) {
                    class15.method127(var301, 0, var307, 18, (class98) null, class186.method1288(new class98[] { class170.field3004, class106.method814(var294, (byte) -128).method726((byte) -100) }, 31618));
                } else if (var300 == 1) {
                    class15.method127(var301, 0, var307, 18, (class98) null, class186.method1288(new class98[] { class136.field2398, class106.method814(var294, (byte) -128).method726((byte) -100) }, 31618));
                } else {
                    class15.method127(var301, 0, var307, 18, (class98) null, class106.method814(var294, (byte) -128).method726((byte) -100));
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 44) {
            int var308 = class144.field2536.method1442(-1330139880);
            class34 var309 = (class34) class243.field4209.method1511((byte) -127, (long) var308);
            if (var309 != null) {
                class181.method1250((byte) 65, true, var309);
            }
            if (class188.field3244 != null) {
                class72.method512(class188.field3244, 2);
                class188.field3244 = null;
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 84) {
            class153.field2802 = class144.field2536.method1480(-122);
            class251.field4398 = class144.field2536.method1446(5350);
            while (class144.field2536.field3728 < class47.field789) {
                class222.field3824 = class144.field2536.method1446(5350);
                class46.method362(7735);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 29) {
            class12.method109(true);
            class222.field3824 = -1;
            return false;
        } else if (class222.field3824 == 55) {
            int var310 = class144.field2536.method1458((byte) 101);
            int var311 = class144.field2536.method1441(2);
            int var312 = (var311 & 0x7DF4) >> 10;
            int var313 = var311 & 0x1F;
            int var314 = (var311 & 0x3EC) >> 5;
            int var315 = (var313 << 3) + (var312 << 19) + (var314 << 11);
            class148 var316 = class62.method455(-854073200, var310);
            if (var316.field2736 != var315) {
                var316.field2736 = var315;
                class72.method512(var316, 2);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 83 || class222.field3824 == 110 || class222.field3824 == 214 || class222.field3824 == 97 || class222.field3824 == 76 || class222.field3824 == 16 || class222.field3824 == 184 || class222.field3824 == 94 || class222.field3824 == 68 || class222.field3824 == 43 || class222.field3824 == 227 || class222.field3824 == 145) {
            class46.method362(7735);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 152) {
            int var317 = class144.field2536.method1446(5350);
            int var318 = class144.field2536.method1446(5350);
            int var319 = class144.field2536.method1487(94);
            int var320 = class144.field2536.method1446(5350);
            int var321 = class144.field2536.method1446(5350);
            class218.method1505(var321, true, var319, var317, var320, false, var318);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 125) {
            int var322 = class144.field2536.method1475((byte) -98);
            int var323 = class144.field2536.method1479(-117);
            int var324 = class144.field2536.method1441(2);
            int var325 = class144.field2536.method1487(122);
            if ((var323 >> 30) != 0) {
                int var326 = var323 >> 28 & 0x3;
                int var327 = ((var323 & 0xFFFE8BD) >> 14) - class189.field3277;
                int var328 = (var323 & 0x3FFF) - class182.field3143;
                if (var327 >= 0 && var328 >= 0 && var327 < 104 && var328 < 104) {
                    int var329 = var327 * 128 + 64;
                    int var330 = var328 * 128 + 64;
                    class233 var331 = new class233(var324, var326, var329, var330, class70.method480(var326, (byte) 126, var329, var330) - var325, var322, class236.field4071);
                    class135.field2387.method376((byte) 13, new class182(var331));
                }
            } else if (var323 >> 29 != 0) {
                int var332 = var323 & 0xFFFF;
                class108 var333 = class180.field3109[var332];
                if (var333 != null) {
                    var333.field4520 = 0;
                    var333.field4519 = var325;
                    var333.field4485 = 0;
                    var333.field4461 = var324;
                    if (var333.field4461 == 65535) {
                        var333.field4461 = -1;
                    }
                    var333.field4465 = class236.field4071 + var322;
                    if (class236.field4071 < var333.field4465) {
                        var333.field4485 = -1;
                    }
                    if (var333.field4461 != -1 && class236.field4071 == var333.field4465) {
                        int var334 = class49.method385(var333.field4461, 0).field3464;
                        if (var334 != -1) {
                            class138 var335 = class16.method144(1, var334);
                            if (var335 != null && var335.field2454 != null) {
                                class114.method850(false, var333.field4492, var333.field4466, 0, var335, 4096);
                            }
                        }
                    }
                }
            } else if (var323 >> 28 != 0) {
                int var336 = var323 & 0xFFFF;
                class192 var337;
                if (class234.field4046 == var336) {
                    var337 = class163.field2943;
                } else {
                    var337 = class141.field2499[var336];
                }
                if (var337 != null) {
                    var337.field4485 = 0;
                    var337.field4519 = var325;
                    var337.field4465 = class236.field4071 + var322;
                    var337.field4520 = 0;
                    if (var337.field4465 > class236.field4071) {
                        var337.field4485 = -1;
                    }
                    var337.field4461 = var324;
                    if (var337.field4461 == 65535) {
                        var337.field4461 = -1;
                    }
                    if (var337.field4461 != -1 && class236.field4071 == var337.field4465) {
                        int var338 = class49.method385(var337.field4461, 0).field3464;
                        if (var338 != -1) {
                            class138 var339 = class16.method144(1, var338);
                            if (var339 != null && var339.field2454 != null) {
                                class114.method850(class163.field2943 == var337, var337.field4492, var337.field4466, 0, var339, 4096);
                            }
                        }
                    }
                }
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 87) {
            int var340 = class144.field2536.method1458((byte) 113);
            class148 var341 = class62.method455(-854073200, var340);
            var341.field2724 = 3;
            var341.field2661 = class163.field2943.field3338.method652(true);
            class72.method512(var341, 2);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 11) {
            int var342 = class144.field2536.method1458((byte) 115);
            class146.field2562 = class119.field2145.method24(var342, 3);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 153) {
            class97.method696(0);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 77) {
            class220.method1518(1);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 203) {
            int var343 = class144.field2536.method1446(5350);
            int var344 = class144.field2536.method1478(-94);
            int var345 = class144.field2536.method1441(2);
            class129.method979(true, var345);
            class180.method1244(var343, false, var344);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 159) {
            int var346 = class144.field2536.method1442(-1330139880);
            int var347 = class144.field2536.method1478(-71);
            class112.method844(var347, var346, 1);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 73) {
            int var348 = class144.field2536.method1487(9);
            int var349 = class144.field2536.method1446(5350);
            int var350 = class144.field2536.method1478(-111);
            class108 var351 = class180.field3109[var348];
            if (var351 != null) {
                class71.method495(var351, 0, var350, var349);
            }
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 100) {
            int var352 = class144.field2536.method1442(-1330139880);
            int var353 = class144.field2536.method1487(104);
            if (var352 < -70000) {
                var353 += 32768;
            }
            class148 var354;
            if (var352 >= 0) {
                var354 = class62.method455(-854073200, var352);
            } else {
                var354 = null;
            }
            while (class47.field789 > class144.field2536.field3728) {
                int var355 = class144.field2536.method1482(26084);
                int var356 = class144.field2536.method1487(63);
                int var357 = 0;
                if (var356 != 0) {
                    var357 = class144.field2536.method1446(5350);
                    if (var357 == 255) {
                        var357 = class144.field2536.method1442(-1330139880);
                    }
                }
                if (var354 != null && var355 >= 0 && var354.field2632.length > var355) {
                    var354.field2632[var355] = var356;
                    var354.field2612[var355] = var357;
                }
                class139.method1049((byte) 105, var356 - 1, var355, var357, var353);
            }
            if (var354 != null) {
                class72.method512(var354, 2);
            }
            class16.method133(-1);
            class110.field1964[class214.method1427(class2.field30++, 31)] = class214.method1427(var353, 32767);
            class222.field3824 = -1;
            return true;
        } else if (class222.field3824 == 115) {
            int var358 = class144.field2536.method1441(2);
            class207.method1399(true, var358);
            class110.field1964[class214.method1427(31, class2.field30++)] = class214.method1427(32767, var358);
            class222.field3824 = -1;
            return true;
        } else {
            class243.method1678("T1 - " + class222.field3824 + "," + class16.field300 + "," + class255.field4498 + " - " + class47.field789, (Throwable) null, (byte) -74);
            class12.method109(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public static void method1552(byte arg0) {
        if (arg0 >= -122) {
            method1549(84L, -26, -49, (class98) null, -79, 102, 53);
        }
        field3883 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1553(int arg0) {
        if (class211.field3612 < 0) {
            class192.field3354 = -1;
            class211.field3612 = 0;
            class70.field1121 = -1;
        }
        if (class211.field3612 > class140.field2488) {
            class211.field3612 = class140.field2488;
            class192.field3354 = -1;
            class70.field1121 = -1;
        }
        if (arg0 < 59) {
            return;
        }
        if (class211.field3613 < 0) {
            class211.field3613 = 0;
            class192.field3354 = -1;
            class70.field1121 = -1;
        }
        if (class148.field2743 < class211.field3613) {
            class211.field3613 = class148.field2743;
            class70.field1121 = -1;
            class192.field3354 = -1;
        }
        field3881++;
    }
}
