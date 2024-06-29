import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class259 extends class286 {

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Lbe;")
    public static class283 field4402 = class153.method941(125, "(Udns");

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Lbe;")
    public static class283 field4405 = class153.method941(-36, "scrollen:");

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Lj;")
    public static class269 field4397 = new class269();

    @OriginalMember(owner = "client!a", name = "db", descriptor = "Lj;")
    public static class269 field4412 = new class269();

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "Lbe;")
    public static class283 field4413 = class153.method941(-18, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "Lbe;")
    public static class283 field4414 = class153.method941(125, "m");

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "Lek;")
    public static class172 field4410;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "Lek;")
    public static class172 field4411;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "[I")
    public static int[] field4396;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "[I")
    public static int[] field4403;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "[Lnh;")
    public static class107[] field4407;

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 3)
    public class259() {
        super(1, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIIII)V", line = 14)
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = -44 % ((20 - arg3) / 54);
        int var12 = arg6 - arg5;
        if (class134.field2254 > arg6) {
            var12++;
        }
        int var13 = arg9 - arg2;
        if (class77.field1345 > arg9) {
            var13++;
        }
        int var10000;
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg4 * var14 + arg10 >> 16;
            int var16 = (var14 + 1) * arg4 + arg10 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg2 + var14 >> 6;
                if (var18 >= 0 && (class38.field551.length - 1) >= var18) {
                    int var19 = arg7 + var15;
                    int var20 = arg7 + var16;
                    int[][] var21 = class38.field551[var18];
                    byte[][] var22 = class260.field4416[var18];
                    byte[][] var23 = class71.field1225[var18];
                    byte[][] var24 = class180.field3112[var18];
                    byte[][] var25 = class77.field1346[var18];
                    byte[][] var26 = class86.field1451[var18];
                    for (int var27 = 0; var27 < var12; var27++) {
                        int var28 = arg8 * var27 + arg1 >> 16;
                        int var29 = arg1 + ((var27 + 1) * arg8) >> 16;
                        int var30 = var29 - var28;
                        if (var30 > 0) {
                            int var31 = arg0 + var29;
                            int var32 = arg5 + var27 & 0x3F;
                            int var33 = arg0 + var28;
                            int var34 = arg2 + var14 & 0x3F;
                            int var35 = (var32 << 6) + var34;
                            int var36 = var27 + arg5 >> 6;
                            int var37;
                            if (var36 < 0 || var36 > (var21.length - 1) || var21[var36] == null) {
                                if (class270.field4554.field2132 != -1) {
                                    var37 = class270.field4554.field2132;
                                } else if ((arg2 + var14 & 0x4) == (arg5 + var27 & 0x4)) {
                                    var37 = class163.field2686[class110.field1870 + 1];
                                } else {
                                    var37 = 4936552;
                                }
                                if (var36 < 0 || var36 > var21.length - 1) {
                                    if (var37 == 0) {
                                        var37 = 1;
                                    }
                                    class78.method513(var19, var33, var17, var30, var37);
                                    continue;
                                }
                            } else {
                                var37 = var21[var36][var35];
                            }
                            if (var37 == 0) {
                                var37 = 1;
                            }
                            int var38 = var22[var36] == null ? 0 : class163.field2686[var22[var36][var35] & 0xFF];
                            int var39 = var23[var36] == null ? 0 : class163.field2686[var23[var36][var35] & 0xFF];
                            if (var38 == 0 && var39 == 0) {
                                class78.method513(var19, var33, var17, var30, var37);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var40 = var24[var36] == null ? 0 : var24[var36][var35];
                                    int var41 = var40 & 0xFC;
                                    if (var41 == 0 || var17 <= 1 || var30 <= 1) {
                                        class78.method513(var19, var33, var17, var30, var38);
                                    } else {
                                        class2.method13(class78.field1357, var40 & 0x3, var37, false, var38, var19, var41 >> 2, var33, true, var30, var17);
                                    }
                                }
                                if (var39 != 0) {
                                    if (var39 == -1) {
                                        var39 = var37;
                                    }
                                    byte var42 = var25[var36][var35];
                                    int var43 = var42 & 0xFC;
                                    if (var43 == 0 || var17 <= 1 || var30 <= 1) {
                                        class78.method513(var19, var33, var17, var30, var39);
                                    }
                                    class2.method13(class78.field1357, var42 & 0x3, 0, false, var39, var19, var43 >> 2, var33, var38 == 0, var30, var17);
                                }
                            }
                            if (var26[var36] != null) {
                                int var44 = var26[var36][var35] & 0xFF;
                                if (var44 != 0) {
                                    int var45;
                                    if (var17 == 1) {
                                        var45 = var19;
                                    } else {
                                        var45 = var20 - 1;
                                    }
                                    int var46;
                                    if (var30 == 1) {
                                        var46 = var33;
                                    } else {
                                        var46 = var31 - 1;
                                    }
                                    int var47 = 13421772;
                                    if (var44 >= 5 && var44 <= 8 || var44 >= 13 && var44 <= 16 || var44 >= 21 && var44 <= 24 || var44 == 27 || var44 == 28) {
                                        var44 -= 4;
                                        var47 = 13369344;
                                    }
                                    if (var44 == 1) {
                                        class78.method509(var19, var33, var30, var47);
                                    } else if (var44 == 2) {
                                        class78.method520(var19, var33, var17, var47);
                                    } else if (var44 == 3) {
                                        class78.method509(var45, var33, var30, var47);
                                    } else if (var44 == 4) {
                                        class78.method520(var19, var46, var17, var47);
                                    } else if (var44 == 9) {
                                        class78.method509(var19, var33, var30, 16777215);
                                        class78.method520(var19, var33, var17, var47);
                                    } else if (var44 == 10) {
                                        class78.method509(var45, var33, var30, 16777215);
                                        class78.method520(var19, var33, var17, var47);
                                    } else if (var44 == 11) {
                                        class78.method509(var45, var33, var30, 16777215);
                                        class78.method520(var19, var46, var17, var47);
                                    } else if (var44 == 12) {
                                        class78.method509(var19, var33, var30, 16777215);
                                        class78.method520(var19, var46, var17, var47);
                                    } else if (var44 == 17) {
                                        class78.method520(var19, var33, 1, var47);
                                    } else if (var44 == 18) {
                                        class78.method520(var45, var33, 1, var47);
                                    } else if (var44 == 19) {
                                        class78.method520(var45, var46, 1, var47);
                                    } else if (var44 == 20) {
                                        class78.method520(var19, var46, 1, var47);
                                    } else if (var44 == 25) {
                                        for (int var48 = 0; var48 < var30; var48++) {
                                            class78.method520(var19 + var48, -var48 + var46, 1, var47);
                                        }
                                    } else if (var44 == 26) {
                                        for (int var49 = 0; var49 < var30; var49++) {
                                            class78.method520(var19 + var49, var33 + var49, 1, var47);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var50 = arg7 + var15;
                    var10000 = arg7 + var16;
                    for (int var52 = 0; var52 < var12; var52++) {
                        int var53;
                        if (class270.field4554.field2132 != -1) {
                            var53 = class270.field4554.field2132;
                        } else if ((var14 + arg2 & 0x4) == (arg5 + var52 & 0x4)) {
                            var53 = class163.field2686[class110.field1870 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var54 = ((var52 + 1) * arg8 + arg1 >> 16) + arg0;
                        int var55 = (arg1 + (arg8 * var52) >> 16) + arg0;
                        int var56 = var54 - var55;
                        class78.method513(var50, var55, var17, var56, var53);
                    }
                }
            }
        }
        field4406++;
        for (int var57 = -2; var57 < var13 + 2; var57++) {
            int var58 = (var57 + 1) * arg4 + arg10 >> 16;
            int var59 = arg4 * var57 + arg10 >> 16;
            int var60 = var58 - var59;
            if (var60 > 0) {
                int var61 = arg2 + var57 >> 6;
                var10000 = arg7 + var58;
                int var63 = arg7 + var59;
                if (var61 >= 0 && var61 <= (class74.field1297.length - 1)) {
                    short[][] var64 = class74.field1297[var61];
                    for (int var65 = -2; var65 < (var12 + 2); var65++) {
                        int var66 = (var65 + 1) * arg8 + arg1 >> 16;
                        int var67 = arg1 + (arg8 * var65) >> 16;
                        int var68 = var66 - var67;
                        if (var68 > 0) {
                            var10000 = arg0 + var66;
                            int var70 = arg5 + var65 >> 6;
                            int var71 = arg0 + var67;
                            if (var70 >= 0 && var70 <= (var64.length - 1)) {
                                int var72 = (var65 + arg5 & 0x3F << 6) + (arg2 + var57 & 0x3F);
                                if (var64[var70] != null) {
                                    int var73 = var64[var70][var72] >> 14 & 0x3;
                                    int var74 = var64[var70][var72] & 0x3FFF;
                                    if (var74 != 0) {
                                        if (var73 == 0) {
                                            int var75 = class201.field3435[var74 - 1].field1475 * var68 / 4;
                                            int var76 = class201.field3435[var74 - 1].field1468 * var60 / 4;
                                            int var77 = class201.field3435[var74 - 1].field1465 * var68 / 4;
                                            class201.field3435[var74 - 1].method611(var63, var71 - var77, var76, var75);
                                        } else if (var73 == 1) {
                                            int var84 = class68.field970[var74 - 1].field1468 * var60 / 4;
                                            int var85 = class68.field970[var74 - 1].field1475 * var68 / 4;
                                            int var86 = class68.field970[var74 - 1].field1465 * var68 / 4;
                                            class68.field970[var74 - 1].method611(var63, var71 - var86, var84, var85);
                                        } else if (var73 == 2) {
                                            int var78 = class126.field2091[var74 - 1].field1475 * var68 / 4;
                                            int var79 = class126.field2091[var74 - 1].field1468 * var60 / 4;
                                            int var80 = class126.field2091[var74 - 1].field1465 * var68 / 4;
                                            class126.field2091[var74 - 1].method611(var63, var71 - var80, var79, var78);
                                        } else if (var73 == 3) {
                                            int var81 = class273.field4587[var74 - 1].field1468 * var60 / 4;
                                            int var82 = class273.field4587[var74 - 1].field1465 * var68 / 4;
                                            int var83 = class273.field4587[var74 - 1].field1475 * var68 / 4;
                                            class273.field4587[var74 - 1].method611(var63, var71 - var82, var81, var83);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lim;", line = 435)
    public static final class169 method1750(byte arg0, int arg1) {
        field4400++;
        class169 var2 = (class169) class277.field4636.method1629(72, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 53) {
            method1749(84, -29, 69, -17, -31, 26, -83, 121, 117, -123, 95);
        }
        byte[] var3 = class66.field926.method1107(class99.method658(false, arg1), class178.method1171(102, arg1), 119);
        class169 var4 = new class169();
        var4.field2847 = arg1;
        if (var3 != null) {
            var4.method1075(new class229(var3), (byte) -35);
        }
        class277.field4636.method1630(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I", line = 465)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            field4397 = (class269) null;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        field4399++;
        if (this.field4863.field3984) {
            int[][] var4 = this.method1964(arg1, 0, false);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class27.field410; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V", line = 504)
    public static final void method1751(int arg0) {
        class18.field222 = true;
        class286.field4871 = true;
        class35.field520 = 0L;
        class112.field1893 = 0;
        field4404++;
        class257.field4334.field239 = 0;
        class163.field2699 = 0;
        class74.field1295 = 0;
        class180.field3092 = 0;
        class193.field3307 = 0;
        class216.field3661 = 0;
        class254.field4292 = 0;
        class288.field4892 = 0;
        class262.field4463 = 0;
        class299.field5063 = 0;
        class103.field1737 = 0;
        class40.field572 = 0;
        class260.field4415 = 0;
        class90.field1524 = 0;
        class13.field140 = 0;
        class20.field269 = 0;
        class151.field2476 = 0;
        class5.field51 = 0;
        class162.field2656 = 0;
        class286.field4872 = 0;
        class97.field1662 = 0;
        class140.field2331 = 0;
        class55.field763 = 0;
        class49.field671 = 0;
        class281.field4753 = 0;
        class77.field1338 = 0;
        class133.field2238 = 0;
        class145.field2390 = 0;
        class133.field2239 = 0;
        class281.field4688 = 0;
        class283.field4824 = 0;
        class177.field3044 = 0;
        class83.field1414 = 0;
        class72.field1272 = 0;
        class113.field1904 = 0;
        class210.field3587 = 0;
        class97.field1657 = 0;
        class295.field4975 = 0;
        class145.field2393 = 0;
        class124.field2067 = 0;
        class54.field726 = 0;
        class18.field221 = 0;
        class288.field4898 = 0;
        class153.field2504 = 0;
        class141.field2351 = 0;
        class143.field2375 = 0;
        class60.field821 = 0;
        class151.field2482 = 0;
        class104.field1767 = 0;
        class140.field2334 = 0;
        class55.field768 = 0;
        class283.field4786 = 0;
        class265.field4504 = 0;
        class49.field674 = 0;
        class207.field3557 = 0;
        class54.field718 = 0;
        class129.field2190 = 0;
        class279.field4671 = 0;
        class27.field405 = 0;
        class124.field2056 = 0;
        class263.field4481 = 0;
        class96.field1598 = 0;
        class306.field5245 = 0;
        class281.field4697 = 0;
        class15.field174 = 0;
        class281.field4706 = 0;
        class225.field3774 = 0;
        class1.field5 = 0;
        class97.field1622 = 0;
        class306.field5243 = 0;
        class83.field1407 = 0;
        class229.field3869 = 0;
        class69.field1110 = 0;
        class186.field3189 = 0;
        class10.field95 = 0;
        class151.field2471 = 0;
        field4406 = 0;
        class277.field4627 = 0;
        class302.field5111 = 0;
        class30.field462 = 0;
        class229.field3857 = 0;
        class118.field1986 = 0;
        class283.field4796 = 0;
        class104.field1790 = 0;
        class97.field1645 = 0;
        class241.field4072 = 0;
        class180.field3082 = 0;
        class172.field2919 = 0;
        class205.field3495 = 0;
        class138.field2295 = 0;
        class172.field2929 = 0;
        class264.field4486 = 0;
        class214.field3640 = 0;
        class290.field4924 = 0;
        class242.field4082 = 0;
        class153.field2508 = 0;
        class215.field3651 = 0;
        class299.field5058 = 0;
        class12.field108 = 0;
        class277.field4635 = 0;
        class52.field705 = 0;
        class157.field2580 = 0;
        class174.field2973 = 0;
        class214.field3639 = 0;
        class67.field944 = 0;
        class104.field1774 = 0;
        class109.field1845 = 0;
        class124.field2059 = 0;
        class15.field166 = 0;
        class304.field5198 = 0;
        class112.field1897 = 0;
        class200.field3423 = 0;
        class69.field1040 = 0;
        class282.field4771 = 0;
        class163.field2687 = 0;
        class132.field2230 = 0;
        class272.field4568 = 0;
        class304.field5164 = 0;
        class150.field2448 = 0;
        class153.field2517 = 0;
        class229.field3853 = 0;
        class30.field448 = 0;
        class242.field4092 = 0;
        class66.field915 = 0;
        class44.field608 = 0;
        client.field4028 = 0;
        class307.field5268 = 0;
        class129.field2169 = 0;
        class69.field1012 = 0;
        class277.field4625 = 0;
        class254.field4289 = 0;
        class12.field105 = 0;
        class72.field1266 = 0;
        class171.field2880 = 0;
        class164.field2708 = 0;
        class99.field1677 = 0;
        class18.field211 = 0;
        class264.field4495 = 0;
        class280.field4675 = 0;
        class6.field55 = 0;
        class47.field652 = 0;
        class227.field3828 = 0;
        class163.field2696 = 0;
        class215.field3648 = 0;
        class25.field376 = 0;
        class46.field618 = 0;
        class229.field3894 = 0;
        class134.field2252 = 0;
        class6.field56 = 0;
        class58.field794 = 0;
        class14.field145 = 0;
        class164.field2703 = 0;
        class79.field1368 = 0;
        class186.field3187 = 0;
        class68.field965 = 0;
        class262.field4458 = 0;
        class72.field1270 = 0;
        class221.field3717 = 0;
        class180.field3079 = 0;
        class69.field1046 = 0;
        class12.field113 = 0;
        class77.field1344 = 0;
        class191.field3287 = 0;
        class97.field1615 = 0;
        class20.field291 = 0;
        class239.field4043 = 0;
        class284.field4847 = 0;
        class46.field624 = 0;
        class202.field3453 = 0;
        class91.field1533 = 0;
        class77.field1342 = 0;
        class5.field48 = 0;
        class177.field3037 = 0;
        class75.field1304 = 0;
        class104.field1768 = 0;
        class203.field3468 = 0;
        class55.field766 = 0;
        class283.field4821 = 0;
        class99.field1678 = 0;
        class172.field2904 = 0;
        class283.field4836 = 0;
        class60.field826 = 0;
        class69.field1044 = 0;
        class42.field593 = 0;
        class305.field5223 = 0;
        class82.field1390 = 0;
        class292.field4949 = 0;
        class191.field3290 = 0;
        class96.field1605 = 0;
        class172.field2926 = 0;
        class283.field4784 = 0;
        class256.field4320 = 0;
        class286.field4874 = 0;
        class275.field4606 = 0;
        class46.field619 = 0;
        class68.field960 = 0;
        class138.field2292 = 0;
        class79.field1362 = 0;
        class20.field272 = 0;
        class229.field3897 = 0;
        class208.field3563 = 0;
        class97.field1661 = 0;
        class288.field4896 = 0;
        class215.field3643 = 0;
        class227.field3830 = 0;
        class272.field4579 = 0;
        class287.field4888 = 0;
        class306.field5257 = 0;
        client.field4023 = 0;
        class10.field91 = 0;
        class48.field658 = 0;
        client.field4015 = 0;
        class159.field2608 = 0;
        class183.field3157 = 0;
        class221.field3723 = 0;
        class97.field1620 = 0;
        class92.field1568 = 0;
        class30.field446 = 0;
        class172.field2900 = 0;
        class277.field4623 = 0;
        class262.field4466 = 0;
        class20.field310 = 0;
        class260.field4418 = 0;
        class192.field3295 = 0;
        class18.field226 = 0;
        class295.field4988 = 0;
        class57.field779 = 0;
        class241.field4065 = 0;
        class269.field4542 = 0;
        class20.field244 = 0;
        class20.field270 = 0;
        class75.field1306 = 0;
        class46.field633 = 0;
        class283.field4803 = 0;
        class49.field683 = 0;
        class104.field1783 = 0;
        class66.field921 = 0;
        class121.field2024 = 0;
        class203.field3473 = 0;
        class155.field2562 = 0;
        class33.field496 = 0;
        class178.field3063 = 0;
        class164.field2706 = 0;
        class61.field853 = 0;
        class174.field2980 = 0;
        class149.field2441 = 0;
        class63.field868 = 0;
        class225.field3765 = 0;
        class153.field2516 = 0;
        class283.field4801 = 0;
        class307.field5272 = 0;
        field4400 = 0;
        class99.field1671 = 0;
        class295.field4995 = 0;
        class182.field3122 = 0;
        class129.field2166 = 0;
        class15.field167 = 0;
        class23.field348 = 0;
        class104.field1781 = 0;
        class135.field2268 = 0;
        class24.field367 = 0;
        class296.field5021 = 0;
        class283.field4826 = 0;
        class229.field3889 = 0;
        class85.field1434 = 0;
        class272.field4582 = 0;
        class203.field3461 = 0;
        class25.field372 = 0;
        class305.field5212 = 0;
        class30.field444 = 0;
        class92.field1549 = 0;
        class176.field3032 = 0;
        class174.field2972 = 0;
        class302.field5110 = 0;
        class305.field5207 = 0;
        class114.field1912 = 0;
        class46.field631 = 0;
        class242.field4093 = 0;
        class229.field3860 = 0;
        class97.field1650 = 0;
        class269.field4550 = 0;
        class150.field2456 = 0;
        class71.field1231 = 0;
        class225.field3761 = 0;
        class242.field4079 = 0;
        class174.field3007 = 0;
        class176.field3030 = 0;
        class15.field165 = 0;
        class5.field52 = 0;
        class20.field313 = 0;
        class69.field1101 = 0;
        class64.field889 = 0;
        class249.field4242 = 0;
        class273.field4594 = 0;
        class45.field613 = 0;
        class256.field4315 = 0;
        class33.field498 = 0;
        class278.field4643 = 0;
        class225.field3763 = 0;
        class13.field134 = 0;
        class48.field657 = 0;
        class240.field4057 = 0;
        class94.field1591 = 0;
        class172.field2890 = 0;
        class153.field2511 = 0;
        class66.field911 = 0;
        class172.field2902 = 0;
        class61.field846 = 0;
        class219.field3700 = 0;
        class154.field2530 = 0;
        class236.field3959 = 0;
        class3.field38 = 0;
        class97.field1647 = 0;
        class216.field3654 = 0;
        class264.field4498 = 0;
        class256.field4316 = 0;
        class190.field3246 = 0;
        class229.field3862 = 0;
        class23.field344 = 0;
        class283.field4802 = 0;
        class104.field1798 = 0;
        class65.field892 = 0;
        class200.field3430 = 0;
        class260.field4420 = 0;
        class44.field599 = 0;
        class155.field2554 = 0;
        class127.field2105 = 0;
        class283.field4829 = 0;
        class71.field1237 = 0;
        class72.field1274 = 0;
        class172.field2905 = 0;
        class283.field4827 = 0;
        class69.field1116 = 0;
        class54.field744 = 0;
        class104.field1796 = 0;
        class262.field4456 = 0;
        class283.field4814 = 0;
        class214.field3633 = 0;
        class122.field2030 = 0;
        class234.field3942 = 0;
        class72.field1263 = 0;
        class20.field245 = 0;
        class192.field3293 = 0;
        class26.field396 = 0;
        class163.field2670 = 0;
        class61.field839 = 0;
        class99.field1686 = 0;
        class126.field2081 = 0;
        class34.field505 = 0;
        class112.field1888 = 0;
        class283.field4809 = 0;
        class283.field4840 = 0;
        class72.field1269 = 0;
        class54.field729 = 0;
        class187.field3204 = 0;
        class306.field5237 = 0;
        class169.field2837 = 0;
        class225.field3782 = 0;
        class262.field4454 = 0;
        class231.field3924 = 0;
        class52.field708 = 0;
        class283.field4837 = 0;
        class52.field702 = 0;
        class196.field3345 = 0;
        class304.field5170 = 0;
        class296.field5024 = 0;
        class180.field3099 = 0;
        class242.field4086 = 0;
        class288.field4897 = 0;
        class12.field119 = 0;
        class220.field3705 = 0;
        class301.field5084 = 0;
        class171.field2881 = 0;
        class183.field3146 = 0;
        class168.field2820 = 0;
        client.field4027 = 0;
        class229.field3872 = 0;
        client.field4016 = 0;
        class245.field4158 = 0;
        class227.field3810 = 0;
        class89.field1512 = 0;
        class275.field4607 = 0;
        class171.field2887 = 0;
        class255.field4305 = 0;
        class72.field1261 = 0;
        class174.field2997 = 0;
        class110.field1856 = 0;
        class138.field2305 = 0;
        class256.field4318 = 0;
        class70.field1170 = 0;
        class79.field1361 = 0;
        class229.field3903 = 0;
        class286.field4875 = 0;
        class20.field290 = 0;
        class15.field172 = 0;
        class53.field716 = 0;
        class82.field1388 = 0;
        class237.field3981 = 0;
        class157.field2577 = 0;
        class10.field96 = 0;
        class97.field1644 = 0;
        class159.field2605 = 0;
        class193.field3303 = 0;
        class170.field2865 = 0;
        class229.field3898 = 0;
        class304.field5179 = 0;
        class304.field5154 = 0;
        class242.field4091 = 0;
        class116.field1967 = 0;
        class37.field542 = 0;
        class148.field2413 = 0;
        class267.field4517 = 0;
        class130.field2203 = 0;
        class269.field4538 = 0;
        class283.field4787 = 0;
        class278.field4644 = 0;
        class15.field171 = 0;
        class174.field2989 = 0;
        class260.field4427 = 0;
        class237.field3966 = 0;
        class88.field1490 = 0;
        class37.field538 = 0;
        class172.field2912 = 0;
        class49.field676 = 0;
        class57.field776 = 0;
        class186.field3184 = 0;
        class306.field5242 = 0;
        class30.field459 = 0;
        class20.field301 = 0;
        class57.field782 = 0;
        class40.field559 = 0;
        class38.field558 = 0;
        class265.field4500 = 0;
        class273.field4589 = 0;
        class94.field1579 = 0;
        class177.field3045 = 0;
        class281.field4724 = 0;
        class20.field267 = 0;
        class277.field4622 = 0;
        class86.field1452 = 0;
        class38.field554 = 0;
        class282.field4781 = 0;
        class213.field3625 = 0;
        class186.field3193 = 0;
        class193.field3309 = 0;
        class174.field2986 = 0;
        class141.field2358 = 0;
        class269.field4532 = 0;
        class272.field4570 = 0;
        class220.field3706 = 0;
        class301.field5078 = 0;
        class229.field3899 = 0;
        class111.field1873 = 0;
        class153.field2514 = 0;
        class172.field2897 = 0;
        class195.field3328 = 0;
        class269.field4529 = 0;
        class30.field463 = 0;
        class94.field1577 = 0;
        class38.field556 = 0;
        class118.field1984 = 0;
        class229.field3888 = 0;
        class228.field3835 = 0;
        class34.field508 = 0;
        class24.field368 = 0;
        class112.field1890 = 0;
        class262.field4445 = 0;
        class264.field4494 = 0;
        class70.field1167 = 0;
        class157.field2585 = 0;
        class127.field2109 = 0;
        class223.field3756 = 0;
        class247.field4213 = 0;
        class229.field3876 = 0;
        class295.field5007 = 0;
        class283.field4804 = 0;
        class20.field273 = 0;
        class305.field5210 = 0;
        class283.field4811 = 0;
        class20.field309 = 0;
        class92.field1555 = 0;
        class294.field4966 = 0;
        class283.field4813 = 0;
        class20.field305 = 0;
        class217.field3670 = 0;
        class184.field3173 = 0;
        class13.field133 = 0;
        class137.field2279 = 0;
        class269.field4531 = 0;
        class69.field974 = 0;
        class191.field3279 = 0;
        class225.field3792 = 0;
        class176.field3029 = 0;
        class213.field3619 = 0;
        class172.field2894 = 0;
        class294.field4954 = 0;
        class107.field1822 = 0;
        class126.field2099 = 0;
        class49.field679 = 0;
        class97.field1616 = 0;
        class86.field1461 = 0;
        class176.field3027 = 0;
        class242.field4076 = 0;
        class172.field2932 = 0;
        class54.field733 = 0;
        class262.field4449 = 0;
        class2.field16 = 0;
        class273.field4592 = 0;
        class124.field2064 = 0;
        class50.field686 = 0;
        class71.field1241 = 0;
        class160.field2636 = 0;
        class61.field851 = 0;
        class23.field347 = 0;
        class54.field745 = 0;
        class229.field3870 = 0;
        class298.field5044 = 0;
        client.field4018 = 0;
        class283.field4805 = 0;
        client.field4025 = 0;
        class138.field2302 = 0;
        client.field4026 = 0;
        class208.field3568 = 0;
        class283.field4833 = 0;
        class223.field3749 = 0;
        class163.field2671 = 0;
        class49.field684 = 0;
        class174.field2990 = 0;
        class294.field4956 = 0;
        class141.field2356 = 0;
        class280.field4682 = 0;
        class114.field1910 = 0;
        class15.field164 = 0;
        class67.field945 = 0;
        class190.field3243 = 0;
        class12.field106 = 0;
        class151.field2474 = 0;
        class257.field4337 = 0;
        class172.field2914 = 0;
        class119.field2004 = 0;
        class122.field2035 = 0;
        class174.field2995 = 0;
        class20.field258 = 0;
        class111.field1878 = 0;
        class194.field3314 = 0;
        class70.field1217 = 0;
        class222.field3726 = 0;
        class174.field2999 = 0;
        class69.field995 = 0;
        class90.field1523 = 0;
        class237.field3972 = 0;
        class229.field3845 = 0;
        class118.field1987 = 0;
        class58.field802 = 0;
        class96.field1600 = 0;
        class107.field1825 = 0;
        field4404 = 0;
        class48.field656 = 0;
        class247.field4194 = 0;
        class225.field3779 = 0;
        class197.field3360 = 0;
        class94.field1589 = 0;
        class237.field3980 = 0;
        class126.field2083 = 0;
        class183.field3141 = 0;
        class187.field3213 = 0;
        class112.field1895 = 0;
        class46.field620 = 0;
        class92.field1566 = 0;
        class174.field2987 = 0;
        class92.field1572 = 0;
        class140.field2343 = 0;
        class227.field3819 = 0;
        class54.field717 = 0;
        class1.field4 = 0;
        class288.field4904 = 0;
        class183.field3142 = 0;
        class252.field4276 = 0;
        class306.field5244 = 0;
        class88.field1481 = 0;
        class64.field879 = 0;
        class69.field1114 = 0;
        class150.field2458 = 0;
        class55.field767 = 0;
        class134.field2253 = 0;
        class172.field2928 = 0;
        class229.field3850 = 0;
        class61.field855 = 0;
        class178.field3060 = 0;
        field4409 = 0;
        class24.field359 = 0;
        class113.field1900 = 0;
        class296.field5019 = 0;
        class10.field97 = 0;
        class239.field4031 = 0;
        class175.field3018 = 0;
        class191.field3281 = 0;
        class237.field3975 = 0;
        class174.field2984 = 0;
        class129.field2175 = 0;
        class252.field4277 = 0;
        class81.field1381 = 0;
        class246.field4184 = 0;
        client.field4024 = 0;
        class217.field3674 = 0;
        class67.field946 = 0;
        class203.field3463 = 0;
        class40.field563 = 0;
        class60.field832 = 0;
        class132.field2222 = 0;
        class306.field5239 = 0;
        class254.field4287 = 0;
        class174.field2983 = 0;
        class296.field5020 = 0;
        class172.field2901 = 0;
        class88.field1495 = 0;
        class262.field4443 = 0;
        class296.field5022 = 0;
        class265.field4501 = 0;
        class61.field836 = 0;
        class157.field2582 = 0;
        class172.field2927 = 0;
        class97.field1640 = 0;
        class174.field2991 = 0;
        class61.field854 = 0;
        class280.field4681 = 0;
        class116.field1950 = 0;
        class71.field1229 = 0;
        class71.field1238 = 0;
        class278.field4641 = 0;
        class104.field1795 = 0;
        class162.field2658 = 0;
        class36.field526 = 0;
        class172.field2906 = 0;
        class65.field902 = 0;
        class19.field232 = 0;
        class295.field5006 = 0;
        class7.field68 = 0;
        class135.field2269 = 0;
        class193.field3306 = 0;
        class53.field710 = 0;
        class305.field5233 = 0;
        class40.field565 = 0;
        class12.field118 = 0;
        class118.field1988 = 0;
        class222.field3729 = 0;
        class97.field1632 = 0;
        class225.field3783 = 0;
        class155.field2551 = 0;
        class18.field218 = 0;
        class64.field884 = 0;
        class279.field4664 = 0;
        class20.field297 = 0;
        class295.field4989 = 0;
        class71.field1235 = 0;
        class295.field5005 = 0;
        class87.field1467 = 0;
        class13.field123 = 0;
        class309.field5282 = 0;
        class20.field259 = 0;
        class267.field4519 = 0;
        class254.field4285 = 0;
        class157.field2588 = 0;
        class88.field1485 = 0;
        class166.field2770 = 0;
        class196.field3353 = 0;
        class38.field546 = 0;
        class20.field254 = 0;
        class241.field4069 = 0;
        class52.field704 = 0;
        class71.field1239 = 0;
        class174.field3004 = 0;
        class27.field415 = 0;
        class163.field2698 = 0;
        client.field4013 = 0;
        class207.field3556 = arg0;
        class232.field3934 = 0;
        class55.field758 = 0;
        class295.field4997 = 0;
        class77.field1340 = 0;
        class97.field1658 = 0;
        class191.field3256 = 0;
        class302.field5109 = 0;
        class18.field220 = 0;
        class15.field175 = 0;
        class304.field5161 = 0;
        class71.field1228 = 0;
        class283.field4794 = 0;
        class264.field4493 = 0;
        class225.field3798 = 0;
        class97.field1652 = 0;
        class55.field760 = 0;
        class261.field4440 = 0;
        class38.field549 = 0;
        class261.field4430 = 0;
        class138.field2293 = 0;
        class127.field2110 = 0;
        class26.field387 = 0;
        class20.field292 = 0;
        class104.field1787 = 0;
        class199.field3416 = 0;
        class163.field2673 = 0;
        class111.field1884 = 0;
        class72.field1267 = 0;
        class168.field2822 = 0;
        class182.field3127 = 0;
        class170.field2862 = 0;
        class186.field3192 = 0;
        class199.field3417 = 0;
        class222.field3740 = 0;
        class172.field2925 = 0;
        class6.field61 = 0;
        class20.field262 = 0;
        class34.field504 = 0;
        class260.field4417 = 0;
        class54.field719 = 0;
        class55.field764 = 0;
        class20.field257 = 0;
        class220.field3714 = 0;
        class169.field2833 = 0;
        class277.field4630 = 0;
        class295.field4987 = 0;
        class111.field1876 = 0;
        class281.field4720 = 0;
        class122.field2037 = 0;
        class229.field3848 = 0;
        class283.field4788 = 0;
        class150.field2449 = 0;
        class19.field229 = 0;
        class157.field2579 = 0;
        class283.field4797 = 0;
        class33.field492 = 0;
        class127.field2111 = 0;
        class162.field2665 = 0;
        class229.field3884 = 0;
        class143.field2369 = 0;
        class260.field4422 = 0;
        class294.field4958 = 0;
        class20.field288 = 0;
        class46.field629 = 0;
        class195.field3333 = 0;
        class219.field3702 = 0;
        class237.field3978 = 0;
        class71.field1222 = 0;
        class247.field4192 = 0;
        class79.field1372 = 0;
        class229.field3890 = 0;
        class178.field3058 = 0;
        class7.field77 = 0;
        class225.field3773 = 0;
        class87.field1463 = 0;
        class302.field5114 = 0;
        class203.field3470 = 0;
        class66.field912 = 0;
        class26.field391 = 0;
        class85.field1431 = 0;
        class227.field3824 = 0;
        class283.field4828 = 0;
        class20.field252 = 0;
        class163.field2694 = 0;
        class199.field3402 = 0;
        class145.field2406 = 0;
        class305.field5211 = 0;
        class38.field557 = 0;
        class112.field1894 = 0;
        class104.field1789 = 0;
        class228.field3841 = 0;
        class97.field1653 = 0;
        class20.field255 = 0;
        class223.field3751 = 0;
        class71.field1226 = 0;
        class104.field1793 = 0;
        class67.field935 = 0;
        class151.field2490 = 0;
        class81.field1374 = 0;
        class46.field630 = 0;
        class69.field976 = 0;
        class68.field968 = 0;
        class69.field1123 = 0;
        class174.field3005 = 0;
        class180.field3084 = 0;
        class94.field1584 = 0;
        class180.field3098 = 0;
        class232.field3929 = 0;
        class140.field2335 = 0;
        class153.field2523 = 0;
        class142.field2366 = 0;
        class96.field1609 = 0;
        class223.field3750 = 0;
        class174.field3002 = 0;
        class72.field1278 = 0;
        class283.field4793 = 0;
        class216.field3666 = 0;
        class281.field4736 = 0;
        class31.field481 = 0;
        class89.field1507 = 0;
        class12.field101 = 0;
        class184.field3162 = 0;
        class282.field4762 = 0;
        class77.field1347 = 0;
        class134.field2248 = 0;
        class5.field49 = 0;
        class229.field3852 = 0;
        class172.field2921 = 0;
        class172.field2915 = 0;
        class144.field2384 = 0;
        class54.field747 = 0;
        class140.field2344 = 0;
        class304.field5177 = 0;
        class54.field748 = 0;
        client.field4021 = 0;
        class153.field2521 = 0;
        class203.field3479 = 0;
        class277.field4633 = 0;
        class264.field4485 = 0;
        class135.field2258 = 0;
        class126.field2087 = 0;
        class104.field1792 = 0;
        class239.field4032 = 0;
        class172.field2916 = 0;
        class10.field84 = 0;
        class135.field2263 = 0;
        class220.field3712 = 0;
        class172.field2923 = 0;
        class54.field755 = 0;
        class109.field1840 = 0;
        class229.field3846 = 0;
        class20.field260 = 0;
        class22.field342 = 0;
        class109.field1853 = 0;
        class283.field4798 = 0;
        class79.field1369 = 0;
        class240.field4051 = 0;
        class273.field4590 = 0;
        class229.field3858 = 0;
        class170.field2867 = 0;
        class103.field1744 = 0;
        class88.field1489 = 0;
        class99.field1680 = 0;
        class186.field3191 = 0;
        class229.field3906 = 0;
        class283.field4799 = 0;
        class264.field4488 = 0;
        field4408 = 0;
        class162.field2662 = 0;
        class81.field1377 = 0;
        class246.field4181 = 0;
        class30.field453 = 0;
        class215.field3645 = 0;
        class45.field616 = 0;
        class129.field2189 = 0;
        class229.field3864 = 0;
        class225.field3780 = 0;
        class160.field2644 = 0;
        class155.field2540 = 0;
        class97.field1633 = 0;
        class200.field3422 = 0;
        class138.field2296 = 0;
        class20.field284 = 0;
        class263.field4472 = 0;
        class229.field3893 = 0;
        class115.field1926 = 0;
        class20.field281 = 0;
        class74.field1287 = 0;
        class298.field5045 = 0;
        class81.field1382 = 0;
        class247.field4189 = 0;
        class281.field4725 = 0;
        class103.field1753 = 0;
        class174.field2975 = 0;
        class295.field4979 = 0;
        class228.field3843 = 0;
        class20.field312 = 0;
        class118.field1994 = 0;
        client.field4022 = 0;
        class20.field261 = 0;
        class42.field595 = 0;
        class239.field4037 = 0;
        class229.field3885 = 0;
        class272.field4574 = 0;
        class96.field1607 = 0;
        class197.field3374 = 0;
        class174.field2988 = 0;
        class119.field2006 = 0;
        class172.field2922 = 0;
        class20.field246 = 0;
        class286.field4868 = 0;
        class210.field3583 = 0;
        class207.field3562 = 0;
        class72.field1275 = 0;
        class229.field3883 = 0;
        class40.field564 = 0;
        class279.field4661 = 0;
        class216.field3655 = 0;
        class48.field661 = 0;
        class170.field2859 = 0;
        class94.field1583 = 0;
        class262.field4455 = 0;
        class20.field302 = 0;
        class196.field3337 = 0;
        class99.field1672 = 0;
        class277.field4631 = 0;
        class42.field597 = 0;
        class284.field4853 = 0;
        class70.field1218 = 0;
        class138.field2303 = 0;
        class305.field5201 = 0;
        class309.field5290 = 0;
        class22.field339 = 0;
        class307.field5265 = 0;
        class3.field34 = 0;
        class153.field2525 = 0;
        class88.field1501 = 0;
        class225.field3794 = 0;
        class180.field3107 = 0;
        class70.field1158 = 0;
        class283.field4831 = 0;
        class216.field3657 = 0;
        class104.field1780 = 0;
        class27.field416 = 0;
        class180.field3109 = 0;
        class109.field1851 = 0;
        class58.field800 = 0;
        class215.field3642 = 0;
        class155.field2560 = 0;
        class144.field2381 = 0;
        class40.field561 = 0;
        class205.field3497 = 0;
        class236.field3953 = 0;
        class129.field2184 = 0;
        class205.field3488 = 0;
        class47.field646 = 0;
        class283.field4810 = 0;
        class31.field472 = 0;
        class262.field4444 = 0;
        class273.field4593 = 0;
        class225.field3772 = 0;
        class97.field1649 = 0;
        class269.field4543 = 0;
        class3.field33 = 0;
        class134.field2244 = 0;
        class304.field5127 = 0;
        class140.field2348 = 0;
        class174.field2981 = 0;
        class299.field5064 = 0;
        class169.field2840 = 0;
        class46.field627 = 0;
        class286.field4865 = 0;
        class149.field2431 = 0;
        class54.field720 = 0;
        class5.field46 = 0;
        class96.field1603 = 0;
        class163.field2680 = 0;
        class195.field3327 = 0;
        class129.field2145 = 0;
        client.field4017 = 0;
        class281.field4691 = 0;
        class99.field1675 = 0;
        class174.field2994 = 0;
        class283.field4790 = 0;
        class304.field5168 = 0;
        class229.field3847 = 0;
        class199.field3413 = 0;
        class239.field4034 = 0;
        class25.field374 = 0;
        class132.field2231 = 0;
        class229.field3868 = 0;
        class280.field4673 = 0;
        class217.field3676 = 0;
        class290.field4926 = 0;
        class128.field2123 = 0;
        class192.field3298 = 0;
        class49.field673 = 0;
        class249.field4246 = 0;
        class163.field2689 = 0;
        class229.field3844 = 0;
        class88.field1492 = 0;
        class254.field4293 = 0;
        class283.field4806 = 0;
        class26.field385 = 0;
        class119.field2005 = 0;
        class85.field1439 = 0;
        class267.field4518 = 0;
        class306.field5246 = 0;
        class148.field2416 = 0;
        class130.field2202 = 0;
        class153.field2522 = 0;
        class203.field3466 = 0;
        class69.field1100 = 0;
        class54.field743 = 0;
        class247.field4209 = 0;
        class170.field2854 = 0;
        class283.field4819 = 0;
        class172.field2911 = 0;
        class199.field3398 = 0;
        class137.field2289 = 0;
        class295.field4998 = 0;
        class121.field2016 = 0;
        class169.field2841 = 0;
        class286.field4866 = 0;
        class69.field1081 = 0;
        class174.field2996 = 0;
        class67.field937 = 0;
        class47.field651 = 0;
        class219.field3704 = 0;
        class220.field3708 = 0;
        class54.field731 = 0;
        class138.field2298 = 0;
        client.field4010 = 0;
        class267.field4516 = 0;
        class45.field617 = 0;
        class210.field3585 = 0;
        client.field4020 = 0;
        class138.field2304 = 0;
        class71.field1233 = 0;
        class241.field4061 = 0;
        class96.field1606 = 0;
        class277.field4628 = 0;
        class281.field4714 = 0;
        class97.field1617 = 0;
        class34.field506 = 0;
        class281.field4713 = 0;
        class278.field4639 = 0;
        class141.field2357 = 0;
        class10.field87 = 0;
        class127.field2116 = 0;
        class223.field3759 = 0;
        class254.field4286 = 0;
        class107.field1815 = 0;
        class88.field1499 = 0;
        class18.field209 = 0;
        class126.field2096 = 0;
        class176.field3024 = 0;
        class283.field4791 = 0;
        class295.field4983 = 0;
        class20.field247 = 0;
        class166.field2768 = 0;
        class20.field306 = 0;
        class223.field3758 = 0;
        class96.field1614 = 0;
        class49.field682 = 0;
        class227.field3815 = 0;
        class129.field2163 = 0;
        class132.field2224 = 0;
        class223.field3755 = 0;
        class162.field2660 = 0;
        class299.field5055 = 0;
        class306.field5250 = 0;
        class172.field2909 = 0;
        class86.field1460 = 0;
        class18.field213 = 0;
        class284.field4851 = 0;
        class15.field160 = 0;
        class1.field8 = 0;
        class176.field3025 = 0;
        class254.field4291 = 0;
        class225.field3769 = 0;
        class61.field845 = 0;
        class177.field3042 = 0;
        class252.field4275 = 0;
        class275.field4600 = 0;
        class304.field5128 = 0;
        class46.field625 = 0;
        class199.field3410 = 0;
        class76.field1317 = 0;
        class278.field4646 = 0;
        class42.field594 = 0;
        class92.field1554 = 0;
        class302.field5098 = 0;
        class304.field5142 = 0;
        class20.field250 = 0;
        class112.field1891 = 0;
        class19.field235 = 0;
        class53.field711 = 0;
        class252.field4278 = 0;
        class242.field4084 = 0;
        class199.field3405 = 0;
        class46.field626 = 0;
        class124.field2063 = 0;
        class126.field2084 = 0;
        class245.field4172 = 0;
        class295.field4991 = 0;
        class63.field873 = 0;
        class135.field2264 = 0;
        class47.field645 = 0;
        class214.field3635 = 0;
        class180.field3108 = 0;
        class261.field4435 = 0;
        class283.field4808 = 0;
        class239.field4033 = 0;
        class97.field1619 = 0;
        class273.field4586 = 0;
        class20.field242 = 0;
        class57.field773 = 0;
        class286.field4864 = 0;
        class281.field4711 = 0;
        field4399 = 0;
        class283.field4839 = 0;
        class77.field1337 = 0;
        class255.field4312 = 0;
        class3.field28 = 0;
        class132.field2229 = 0;
        class99.field1684 = 0;
        class286.field4873 = 0;
        class304.field5186 = 0;
        class31.field480 = 0;
        class302.field5106 = 0;
        class115.field1932 = 0;
        class118.field1992 = 0;
        class283.field4785 = 0;
        class60.field831 = 0;
        class275.field4609 = 0;
        class1.field6 = 0;
        class34.field503 = 0;
        class282.field4776 = 0;
        class216.field3659 = 0;
        class162.field2652 = 0;
        class232.field3935 = 0;
        class229.field3882 = 0;
        class279.field4668 = 0;
        class247.field4221 = 0;
        class229.field3887 = 0;
        class197.field3378 = 0;
        class169.field2836 = 0;
        class170.field2856 = 0;
        class229.field3871 = 0;
        class288.field4905 = 0;
        class305.field5203 = 0;
        class166.field2763 = 0;
        class83.field1404 = 0;
        class135.field2271 = 0;
        class283.field4800 = 0;
        class71.field1223 = 0;
        class115.field1930 = 0;
        class162.field2664 = 0;
        class2.field25 = 0;
        class10.field92 = 0;
        class229.field3863 = 0;
        class26.field384 = 0;
        class295.field4985 = 0;
        class109.field1835 = 0;
        class178.field3057 = 0;
        class262.field4446 = 0;
        class57.field778 = 0;
        class277.field4632 = 0;
        class231.field3915 = 0;
        class104.field1778 = 0;
        class19.field233 = 0;
        field4398 = 0;
        class142.field2367 = 0;
        class143.field2377 = 0;
        class135.field2274 = 0;
        class288.field4899 = 0;
        class229.field3855 = 0;
        class104.field1797 = 0;
        class168.field2817 = 0;
        class229.field3892 = 0;
        class154.field2532 = 0;
        class281.field4737 = 0;
        class237.field3982 = 0;
        class283.field4822 = 0;
        class172.field2924 = 0;
        class299.field5053 = 0;
        class77.field1341 = 0;
        class180.field3087 = 0;
        class279.field4663 = 0;
        class134.field2245 = 0;
        class248.field4237 = 0;
        class5.field45 = 0;
        class248.field4241 = 0;
        class295.field4993 = 0;
        class141.field2353 = 0;
        class302.field5105 = 0;
        class229.field3861 = 0;
        class295.field4990 = 0;
        class14.field144 = 0;
        class223.field3757 = 0;
        class162.field2669 = 0;
        class221.field3718 = 0;
        class294.field4967 = 0;
        class58.field798 = 0;
        class214.field3632 = 0;
        class85.field1437 = 0;
        class103.field1738 = 0;
        class262.field4457 = 0;
        class20.field253 = 0;
        class170.field2861 = 0;
        class231.field3923 = 0;
        class225.field3770 = 0;
        class288.field4890 = 0;
        class254.field4290 = 0;
        class192.field3299 = 0;
        class172.field2933 = 0;
        class1.field3 = 0;
        class77.field1343 = 0;
        class229.field3901 = 0;
        class174.field3003 = 0;
        class169.field2838 = 0;
        class75.field1301 = 0;
        class210.field3584 = 0;
        class174.field2985 = 0;
        class91.field1546 = 0;
        class236.field3956 = 0;
        class148.field2419 = 0;
        class309.field5283 = 0;
        class309.field5287 = 0;
        class75.field1313 = 0;
        class13.field132 = 0;
        class240.field4054 = 0;
        class246.field4183 = 0;
        class197.field3369 = 0;
        class97.field1637 = 0;
        class31.field476 = 0;
        class49.field675 = 0;
        class169.field2829 = 0;
        class27.field399 = 0;
        class210.field3578 = 0;
        class83.field1418 = 0;
        class148.field2418 = 0;
        class275.field4611 = 0;
        class256.field4327 = 0;
        class130.field2204 = 0;
        class119.field1999 = 0;
        class16.field187 = 0;
        class260.field4429 = 0;
        client.field4019 = 0;
        class143.field2376 = 0;
        class306.field5256 = 0;
        class40.field567 = 0;
        class126.field2088 = 0;
        class229.field3856 = 0;
        class222.field3733 = 0;
        class264.field4496 = 0;
        class297.field5025 = 0;
        class280.field4676 = 0;
        class202.field3458 = 0;
        class170.field2852 = 0;
        class263.field4483 = 0;
        class194.field3312 = 0;
        class157.field2566 = 0;
        class116.field1963 = 0;
        class176.field3028 = 0;
        class264.field4489 = 0;
        class128.field2133 = 0;
        class229.field3867 = 0;
        class71.field1232 = 0;
        class16.field183 = 0;
        class168.field2823 = 0;
        class81.field1373 = 0;
        class15.field163 = 0;
        class107.field1823 = 0;
        class283.field4815 = 0;
        class176.field3031 = 0;
        class64.field888 = 0;
        class270.field4560 = 0;
        class178.field3056 = 0;
        class7.field66 = 0;
        class283.field4832 = 0;
        class239.field4045 = 0;
        class171.field2879 = 0;
        class30.field455 = 0;
        class157.field2574 = 0;
        class267.field4513 = 0;
        class246.field4182 = 0;
        class229.field3878 = 0;
        class186.field3190 = 0;
        class143.field2374 = 0;
        class20.field243 = 0;
        class174.field2992 = 0;
        class42.field591 = 0;
        class58.field791 = 0;
        class197.field3368 = 0;
        class269.field4534 = 0;
        class304.field5167 = 0;
        class62.field864 = 0;
        class296.field5023 = 0;
        class58.field792 = 0;
        class295.field4976 = 0;
        class281.field4751 = 0;
        class174.field2998 = 0;
        class174.field2971 = 0;
        class104.field1782 = 0;
        class115.field1933 = 0;
        class67.field931 = 0;
        class249.field4243 = 0;
        class283.field4789 = 0;
        class288.field4889 = 0;
        class304.field5158 = 0;
        class90.field1517 = 0;
        class138.field2297 = 0;
        class18.field216 = 0;
        class96.field1608 = 0;
        class202.field3452 = 0;
        class69.field1104 = 0;
        class157.field2581 = 0;
        class298.field5047 = 0;
        class87.field1476 = 0;
        class245.field4161 = 0;
        class242.field4080 = 0;
        class248.field4240 = 0;
        class234.field3943 = 0;
        class20.field308 = 0;
        class119.field2000 = 0;
        class18.field214 = 0;
        class123.field2048 = 0;
        class284.field4848 = 0;
        class13.field135 = 0;
        class116.field1962 = 0;
        class252.field4279 = 0;
        class36.field534 = 0;
        class6.field59 = 0;
        class287.field4887 = 0;
        class284.field4849 = 0;
        class134.field2243 = 0;
        class10.field94 = 0;
        class184.field3165 = 0;
        class20.field282 = 0;
        class104.field1799 = 0;
        class109.field1842 = 0;
        class96.field1611 = 0;
        class229.field3880 = 0;
        class176.field3033 = 0;
        class269.field4540 = 0;
        class191.field3280 = 0;
        class229.field3907 = 0;
        class256.field4323 = 0;
        class229.field3877 = 0;
        class283.field4834 = 0;
        class164.field2709 = 0;
        class20.field277 = 0;
        class283.field4807 = 0;
        class252.field4281 = 0;
        class14.field154 = 0;
        class60.field834 = 0;
        class193.field3300 = 0;
        class229.field3895 = 0;
        class283.field4825 = 0;
        class149.field2425 = 0;
        class203.field3483 = 0;
        class255.field4313 = 0;
        class199.field3392 = 0;
        class172.field2931 = 0;
        class74.field1292 = 0;
        class31.field475 = 0;
        class299.field5068 = 0;
        class229.field3896 = 0;
        class227.field3825 = 0;
        class247.field4224 = 0;
        class1.field9 = 0;
        class279.field4658 = 0;
        class261.field4433 = 0;
        class7.field71 = 0;
        class282.field4773 = 0;
        class272.field4572 = 0;
        class180.field3089 = 0;
        class168.field2814 = 0;
        class297.field5027 = 0;
        class20.field265 = 0;
        class240.field4053 = 0;
        class68.field959 = 0;
        class226.field3808 = 0;
        class97.field1654 = 0;
        class270.field4555 = 0;
        class229.field3865 = 0;
        class239.field4041 = 0;
        class180.field3088 = 0;
        class174.field2976 = 0;
        class216.field3665 = 0;
        class213.field3631 = 0;
        class46.field621 = 0;
        class69.field985 = 0;
        class261.field4432 = 0;
        class221.field3724 = 0;
        class220.field3713 = 0;
        class229.field3891 = 0;
        class229.field3875 = 0;
        class197.field3373 = 0;
        class241.field4060 = 0;
        class47.field643 = 0;
        class137.field2285 = 0;
        class135.field2259 = 0;
        class104.field1788 = 0;
        class20.field264 = 0;
        class246.field4180 = 0;
        class89.field1504 = 0;
        class229.field3881 = 0;
        class122.field2032 = 0;
        class196.field3348 = 0;
        class178.field3065 = 0;
        class260.field4423 = 0;
        class88.field1488 = 0;
        class2.field22 = 0;
        class30.field457 = 0;
        class157.field2573 = 0;
        class70.field1172 = 0;
        class241.field4059 = 0;
        class92.field1553 = 0;
        class121.field2022 = 0;
        class134.field2247 = 0;
        class187.field3207 = 0;
        class145.field2391 = 0;
        class7.field69 = 0;
        class172.field2895 = 0;
        class304.field5133 = 0;
        class58.field801 = 0;
        class182.field3129 = 0;
        class77.field1348 = 0;
        class86.field1454 = 0;
        class263.field4479 = 0;
        class57.field786 = 0;
        class229.field3909 = 0;
        class197.field3364 = 0;
        class7.field67 = 0;
        class164.field2712 = 0;
        class205.field3490 = 0;
        class178.field3059 = 0;
        class20.field285 = 0;
        class119.field2002 = 0;
        class166.field2769 = 0;
        class118.field1993 = 0;
        class65.field896 = 0;
        class272.field4580 = 0;
        class229.field3910 = 0;
        class245.field4164 = 0;
        class283.field4792 = 0;
        class127.field2106 = 0;
        class283.field4838 = 0;
        class157.field2587 = 0;
        class222.field3728 = 0;
        class297.field5035 = 0;
        class305.field5225 = 0;
        class175.field3017 = 0;
        class168.field2813 = 0;
        class174.field2982 = 0;
        class191.field3269 = 0;
        class140.field2341 = 0;
        class243.field4097 = 0;
        class286.field4882 = 0;
        class13.field129 = 0;
        class286.field4867 = 0;
        class283.field4795 = 0;
        class174.field3012 = 0;
        class294.field4953 = 0;
        class107.field1816 = 0;
        class3.field37 = 0;
        class123.field2050 = 0;
        class222.field3743 = 0;
        class301.field5085 = 0;
        class284.field4852 = 0;
        class65.field907 = 0;
        class12.field116 = 0;
        class262.field4448 = 0;
        class70.field1159 = 0;
        class196.field3334 = 0;
        class65.field891 = 0;
        class303.field5119 = 0;
        class87.field1469 = 0;
        class47.field649 = 0;
        class241.field4070 = 0;
        class283.field4844 = 0;
        class137.field2287 = 0;
        class144.field2385 = 0;
        class92.field1557 = 0;
        class5.field42 = 0;
        class129.field2139 = 0;
        class283.field4830 = 0;
        class169.field2828 = 0;
        class86.field1446 = 0;
        class54.field724 = 0;
        class42.field596 = 0;
        class283.field4841 = 0;
        class68.field958 = 0;
        class269.field4528 = 0;
        class126.field2095 = 0;
        class261.field4434 = 0;
        class172.field2930 = 0;
        class178.field3066 = 0;
        class133.field2240 = 0;
        class83.field1400 = 0;
        class309.field5286 = 0;
        class89.field1511 = 0;
        class263.field4474 = 0;
        class213.field3615 = 0;
        class172.field2913 = 0;
        class141.field2361 = 0;
        class5.field40 = 0;
        class20.field280 = 0;
        class97.field1643 = 0;
        class138.field2294 = 0;
        class182.field3124 = 0;
        class135.field2265 = 0;
        class174.field3006 = 0;
        class281.field4721 = 0;
        class229.field3886 = 0;
        class54.field734 = 0;
        class205.field3491 = 0;
        class286.field4881 = 0;
        class283.field4842 = 0;
        class229.field3851 = 0;
        class283.field4817 = 0;
        class125.field2076 = 0;
        class63.field870 = 0;
        class229.field3859 = 0;
        class3.field30 = 0;
        class65.field904 = 0;
        class71.field1240 = 0;
        class86.field1458 = 0;
        class124.field2061 = 0;
        class304.field5130 = 0;
        class97.field1641 = 0;
        class191.field3283 = 0;
        class234.field3938 = 0;
        class107.field1817 = 0;
        class75.field1310 = 0;
        class281.field4747 = 0;
        class283.field4818 = 0;
        class174.field2977 = 0;
        class140.field2347 = 0;
        class26.field389 = 0;
        class225.field3796 = 0;
        class290.field4912 = 0;
        class210.field3574 = 0;
        class92.field1564 = 0;
        class60.field833 = 0;
        class291.field4933 = 0;
        class193.field3308 = 0;
        class229.field3849 = 0;
        class6.field54 = 0;
        class282.field4769 = 0;
        class247.field4190 = 0;
        class269.field4546 = 0;
        class219.field3701 = 0;
        class269.field4530 = 0;
        class128.field2126 = 0;
        class129.field2159 = 0;
        class205.field3487 = 0;
        class227.field3811 = 0;
        class267.field4514 = 0;
        class205.field3498 = 0;
        class242.field4083 = 0;
        class225.field3785 = 0;
        class306.field5240 = 0;
        class301.field5083 = 0;
        class222.field3725 = 0;
        class70.field1154 = 0;
        class35.field522 = 0;
        class6.field60 = 0;
        class227.field3823 = 0;
        class299.field5060 = 0;
        class129.field2180 = 0;
        class272.field4573 = 0;
        class174.field2974 = 0;
        class171.field2882 = 0;
        class222.field3744 = 0;
        class282.field4761 = 0;
        class229.field3874 = 0;
        class12.field115 = 0;
        class193.field3302 = 0;
        class96.field1604 = 0;
        class83.field1417 = 0;
        class172.field2896 = 0;
        class227.field3826 = 0;
        class70.field1155 = 0;
        class75.field1307 = 0;
        class306.field5251 = 0;
        class229.field3902 = 0;
        class138.field2306 = 0;
        class223.field3752 = 0;
        class301.field5080 = 0;
        class248.field4231 = 0;
        class222.field3742 = 0;
        class281.field4692 = 0;
        class174.field3000 = 0;
        class71.field1227 = 0;
        class263.field4480 = 0;
        class184.field3177 = 0;
        class201.field3439 = 0;
        class68.field951 = 0;
        class229.field3900 = 0;
        class229.field3854 = 0;
        class151.field2481 = 0;
        class127.field2107 = 0;
        class199.field3399 = 0;
        class69.field981 = 0;
        class229.field3904 = 0;
        class58.field795 = 0;
        class304.field5175 = 0;
        class294.field4965 = 0;
        class272.field4569 = 0;
        class283.field4820 = 0;
        class23.field355 = 0;
        class88.field1486 = 0;
        class97.field1642 = 0;
        class104.field1773 = 0;
        class124.field2069 = 0;
        class123.field2049 = 0;
        class304.field5174 = 0;
        class290.field4918 = 0;
        class134.field2250 = 0;
        class137.field2280 = 0;
        class239.field4036 = 0;
        class281.field4716 = 0;
        class97.field1625 = 0;
        class287.field4883 = 0;
        class275.field4616 = 0;
        class145.field2396 = 0;
        class69.field997 = 0;
        class304.field5145 = 0;
        class18.field212 = 0;
        class128.field2122 = 0;
        class118.field1985 = 0;
        class191.field3268 = 0;
        class67.field940 = 0;
        class203.field3469 = 0;
        class61.field838 = 0;
        class226.field3803 = 0;
        class157.field2591 = 0;
        class13.field141 = 0;
        class245.field4169 = 0;
        class213.field3630 = 0;
        class135.method842(arg0 ^ 0x2);
        class284.field4854 = -1;
        class134.field2246 = 0;
        class302.field5115 = 0;
        class145.field2394 = 0;
        class228.field3831.field3905 = 0;
        class255.field4308 = -1;
        class163.field2688 = -1;
        class182.field3130 = -1;
        class262.field4462.field3905 = 0;
        for (int var1 = 0; var1 < class38.field555.length; var1++) {
            class38.field555[var1] = null;
        }
        class306.field5253 = false;
        class42.field589 = 0;
        class34.method226(0, 14195);
        for (int var2 = 0; var2 < 100; var2++) {
            class157.field2575[var2] = null;
        }
        class88.field1497 = (int) (Math.random() * 120.0D) - 60;
        class126.field2094 = (int) (Math.random() * 100.0D) - 50;
        class88.field1496 = 0;
        class269.field4549 = 0;
        class175.field3021 = 0;
        class94.field1593 = (int) (Math.random() * 110.0D) - 55;
        class297.field5033 = 0;
        class103.field1760 = false;
        class127.field2103 = 0;
        class24.field358 = (int) (Math.random() * 30.0D) - 20;
        class162.field2663 = (int) (Math.random() * 80.0D) - 40;
        class203.field3477 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class74.field1294 = -1;
        class166.field2772 = 0;
        class242.field4078 = 0;
        class222.field3727 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class149.field2436[var3] = null;
            class177.field3041[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class33.field493[var4] = null;
        }
        class213.field3624 = class149.field2436[2047] = new class191();
        class205.field3496.method1810(-120);
        field4412.method1810(-79);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class177.field3046[var5][var6][var7] = null;
                }
            }
        }
        class153.field2518 = new class269();
        class103.field1748 = 0;
        class257.field4332 = 0;
        class70.method459((byte) -73);
        class113.method738(-11054);
        class252.field4283 = 0;
        class57.field788 = 0;
        class12.field102 = 0;
        class170.field2872 = 0;
        class192.field3296 = 0;
        class272.field4576 = 0;
        class288.field4902 = 0;
        class119.field2001 = 0;
        class187.field3205 = 0;
        class111.field1883 = 0;
        for (int var8 = 0; var8 < class81.field1376.length; var8++) {
            class81.field1376[var8] = -1;
        }
        if (class82.field1397 != -1) {
            class92.method587(true, class82.field1397);
        }
        for (class159 var9 = (class159) class58.field805.method1607(0); var9 != null; var9 = (class159) class58.field805.method1604((byte) 126)) {
            class25.method173(true, arg0 + 1, var9);
        }
        class82.field1397 = -1;
        class58.field805 = new class239(8);
        class61.method401(arg0 ^ 0x56);
        class69.field1034 = null;
        class42.field589 = 0;
        class306.field5253 = false;
        class116.field1957.method1780(new int[] { 0, 0, 0, 0, 0 }, arg0 ^ 0x0, false, -1, (int[]) null);
        for (int var10 = 0; var10 < 8; var10++) {
            class12.field121[var10] = null;
            class122.field2029[var10] = false;
        }
        class287.method1968(32);
        class142.field2365 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            class201.field3434[var11] = true;
        }
        class118.field1982 = 0;
        class124.field2070 = null;
        class228.field3836 = null;
        for (int var12 = 0; var12 < 6; var12++) {
            class241.field4062[var12] = new class245();
        }
        for (int var13 = 0; var13 < 25; var13++) {
            class269.field4548[var13] = 0;
            class7.field70[var13] = 0;
            class34.field513[var13] = 0;
        }
        class277.method1856(true);
        class7.field81 = true;
        class245.field4173 = 0;
        class92.field1571 = class280.field4680 = class304.field5137 = class277.field4638 = new short[256];
        class180.field3114 = class227.field3820;
        class269.field4541 = false;
        class125.method784(-12017);
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "(I)V", line = 2331)
    public static final void method1752(int arg0) {
        if (arg0 == 0) {
            class114.field1913.method1631(-27875);
            class303.field5120.method1631(-27875);
            class134.field2251.method1631(-27875);
            field4409++;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIJZ)Lbe;", line = 2344)
    public static final class283 method1753(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        field4398++;
        class283 var6 = class260.method1756((byte) 115, 0);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method1907(0, class241.field4071);
        }
        class283 var7 = class303.field5122;
        class283 var8 = class270.field4562;
        if (arg0 == 1) {
            var8 = class303.field5122;
            var7 = class270.field4562;
        }
        if (arg0 == 2) {
            var8 = class196.field3341;
            var7 = class270.field4562;
        }
        class283 var9 = class260.method1756((byte) 123, 0);
        class283 var10 = class260.method1756((byte) 124, 0);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1907(arg1 ^ 0x6071, class296.method2012((int) (arg3 % 10L), (byte) -13));
            arg3 /= 10L;
        }
        if (arg1 != 24689) {
            field4397 = (class269) null;
        }
        int var12 = 0;
        if (arg3 == 0L) {
            var9 = class155.field2542;
        }
        while (arg3 > 0L) {
            if (arg4 && var12 != 0 && var12 % 3 == 0) {
                var9.method1907(0, var8);
            }
            var12++;
            var9.method1907(0, class296.method2012((int) (arg3 % 10L), (byte) 114));
            arg3 /= 10L;
        }
        if (var10.method1925((byte) -44) > 0) {
            var10.method1907(0, var7);
        }
        return class299.method2022(new class283[] { var6, var9.method1898((byte) 127), var10.method1898((byte) 122) }, (byte) 16);
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "(I)V", line = 2416)
    public static void method1754(int arg0) {
        field4397 = null;
        field4414 = null;
        field4403 = null;
        field4402 = null;
        field4413 = null;
        field4410 = null;
        if (arg0 != 0) {
            return;
        }
        field4405 = null;
        field4412 = null;
        field4411 = null;
        field4396 = null;
        field4407 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([[[B[[BZ[[F[[I[[I[[F[[I[[BI[[I[[I[[B[[F[[B)[Lsf;", line = 2447)
    public static final class100[] method1755(byte[][][] arg0, byte[][] arg1, boolean arg2, float[][] arg3, int[][] arg4, int[][] arg5, float[][] arg6, int[][] arg7, byte[][] arg8, int arg9, int[][] arg10, int[][] arg11, byte[][] arg12, float[][] arg13, byte[][] arg14) {
        field4408++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg14[var16][var17];
                if (var18 == 0) {
                    var18 = arg14[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg14[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg14[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class196 var19 = class151.method931(82, (var18 & 0xFF) - 1);
                    var15[var16][var17] = (var19.field3347 + 1 << 16) + var19.field3343;
                }
            }
        }
        class239 var20 = new class239(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg14[var21][var22] != 0) {
                    int[] var23;
                    if (arg12[var21][var22] == 0) {
                        var23 = class255.field4304[0];
                    } else {
                        var23 = class67.field942[arg1[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg10 != null) {
                        var24 = arg10[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var24 | (long) var25 << 32;
                    long var31 = (long) var27 << 32 | (long) var24;
                    long var33 = (long) var24 | (long) var28 << 32;
                    int var35 = var23.length / 2;
                    long var36 = (long) var26 << 32 | (long) var24;
                    class100 var38 = (class100) var20.method1612(var29, 99);
                    if (var38 == null) {
                        var38 = new class100((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg5 != null, var24);
                        var20.method1611(var38, -1, var29);
                    }
                    var38.field1717++;
                    var38.field1695 += var35;
                    if (var29 != var36) {
                        class100 var39 = (class100) var20.method1612(var36, 102);
                        if (var39 == null) {
                            var39 = new class100((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg5 != null, var24);
                            var20.method1611(var39, -1, var36);
                        }
                        var39.field1695 += var35;
                        var39.field1717++;
                    }
                    if (var29 != var31 && var31 != var36) {
                        class100 var40 = (class100) var20.method1612(var31, 99);
                        if (var40 == null) {
                            var40 = new class100((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg5 != null, var24);
                            var20.method1611(var40, -1, var31);
                        }
                        var40.field1695 += var35;
                        var40.field1717++;
                    }
                    if (var29 != var33 && var33 != var36 && var31 != var33) {
                        class100 var41 = (class100) var20.method1612(var33, 97);
                        if (var41 == null) {
                            var41 = new class100((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg5 != null, var24);
                            var20.method1611(var41, -1, var33);
                        }
                        var41.field1695 += var35;
                        var41.field1717++;
                    }
                }
            }
        }
        if (arg2) {
            field4405 = (class283) null;
        }
        for (class100 var42 = (class100) var20.method1607(0); var42 != null; var42 = (class100) var20.method1604((byte) -82)) {
            var42.method667();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg14[var43][var44] != 0) {
                    int var45;
                    if ((arg0[arg9][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg0[1][var43][var44] & 0x2) == 2 && arg9 > 0) {
                        var45 = arg9 - 1;
                    } else {
                        var45 = arg9;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg10 != null) {
                        var46 = arg10[var43][var44] & 0xFFFFFF;
                        var47 = arg10[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    int[] var49;
                    byte var50;
                    if (arg12[var43][var44] == 0) {
                        var50 = 0;
                        var49 = class255.field4304[0];
                    } else {
                        var49 = class67.field942[arg1[var43][var44]];
                        var48 = class65.field900[arg1[var43][var44]];
                        var50 = arg8[var43][var44];
                        if (var49.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43 + 1][var44];
                    int var52 = var15[var43][var44];
                    int var53 = var15[var43][var44 + 1];
                    int var54 = var15[var43 + 1][var44 + 1];
                    long var55 = (long) var46 | (long) var54 << 32;
                    long var57 = (long) var46 | (long) var53 << 32;
                    long var59 = (long) var46 | (long) var52 << 32;
                    int var61 = arg11[var43][var44];
                    long var62 = (long) var51 << 32 | (long) var46;
                    int var64 = arg11[var43 + 1][var44];
                    int var65 = arg11[var43 + 1][var44 + 1];
                    int var66 = arg11[var43][var44 + 1];
                    int var67 = arg7[var43][var44];
                    int var68 = arg7[var43 + 1][var44];
                    int var69 = arg7[var43 + 1][var44 + 1];
                    int var70 = arg7[var43][var44 + 1];
                    int var71 = (var52 >> 16) - 1;
                    int var72 = (var51 >> 16) - 1;
                    int var73 = (var53 >> 16) - 1;
                    int var74 = (var54 >> 16) - 1;
                    class100 var75 = (class100) var20.method1612(var59, 123);
                    class19.method116(arg5, var43, class229.method1529(var71, (byte) -125, var64, var68), class229.method1529(var71, (byte) -62, var66, var70), var44, var52 <= var52, class229.method1529(var71, (byte) -89, var65, var69), var75, arg13, var52 <= var54, var52 <= var53, class229.method1529(var71, (byte) -103, var61, var67), arg3, arg6, var48, var47, var45, var49, var50, (byte) -82, arg4, var51 >= var52);
                    if (var59 != var62) {
                        class100 var76 = (class100) var20.method1612(var62, 102);
                        class19.method116(arg5, var43, class229.method1529(var72, (byte) -54, var64, var68), class229.method1529(var72, (byte) -118, var66, var70), var44, var52 >= var51, class229.method1529(var72, (byte) -99, var65, var69), var76, arg13, var54 >= var51, var53 >= var51, class229.method1529(var72, (byte) -110, var61, var67), arg3, arg6, var48, var47, var45, var49, var50, (byte) -31, arg4, var51 >= var51);
                    }
                    if (var55 != var59 && var55 != var62) {
                        class100 var77 = (class100) var20.method1612(var55, 103);
                        class19.method116(arg5, var43, class229.method1529(var74, (byte) -63, var64, var68), class229.method1529(var74, (byte) -101, var66, var70), var44, var54 <= var52, class229.method1529(var74, (byte) -68, var65, var69), var77, arg13, var54 <= var54, var53 >= var54, class229.method1529(var74, (byte) -102, var61, var67), arg3, arg6, var48, var47, var45, var49, var50, (byte) -124, arg4, var54 <= var51);
                    }
                    if (var57 != var59 && var57 != var62 && var55 != var57) {
                        class100 var78 = (class100) var20.method1612(var57, 105);
                        class19.method116(arg5, var43, class229.method1529(var73, (byte) -112, var64, var68), class229.method1529(var73, (byte) -102, var66, var70), var44, var52 >= var53, class229.method1529(var73, (byte) -126, var65, var69), var78, arg13, var54 >= var53, var53 >= var53, class229.method1529(var73, (byte) -94, var61, var67), arg3, arg6, var48, var47, var45, var49, var50, (byte) -45, arg4, var53 <= var51);
                    }
                }
            }
        }
        for (class100 var79 = (class100) var20.method1607(0); var79 != null; var79 = (class100) var20.method1604((byte) 127)) {
            if (var79.field1702 == 0) {
                var79.method557((byte) -89);
            } else {
                var79.method665();
            }
        }
        int var80 = var20.method1608((byte) -127);
        class100[] var81 = new class100[var80];
        var20.method1613(-1, var81);
        long[] var82 = new long[var80];
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field1445;
        }
        class177.method1167(var82, (byte) -43, var81);
        return var81;
    }
}
