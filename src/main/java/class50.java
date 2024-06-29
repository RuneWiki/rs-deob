import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class50 extends RuntimeException {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ljava/lang/String;")
    public String field1074;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1072;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1067 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lpj;")
    public static class237 field1069 = class33.method353(" loggt sich ein)3", 31);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lcj;")
    public static class115[] field1073;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method456(byte arg0) {
        field1073 = null;
        field1069 = null;
        if (arg0 < 104) {
            field1073 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V")
    public static final void method457(int arg0, int arg1, byte arg2) {
        field1070++;
        if (class271.field4664 < 2 && class70.field1376 == 0 && !class15.field244) {
            return;
        }
        if (arg2 != 2) {
            field1073 = null;
        }
        class237 var3;
        if (class70.field1376 == 1 && class271.field4664 < 2) {
            var3 = class238.method1626(new class237[] { class37.field831, class41.field931, class28.field544, class97.field1719 }, -120);
        } else if (class15.field244 && class271.field4664 < 2) {
            var3 = class238.method1626(new class237[] { class203.field3481, class41.field931, class181.field3177, class97.field1719 }, arg2 - 10);
        } else {
            var3 = class15.method135((byte) 111, class271.field4664 - 1);
        }
        if (class271.field4664 > 2) {
            var3 = class238.method1626(new class237[] { var3, class52.field1086, class14.method130(class271.field4664 - 2, (byte) 117), class90.field1650 }, -35);
        }
        int var4 = class80.field1507.method1320(var3, arg0 + 4, arg1 + 15, 16777215, 0, class253.field4349, class48.field1033);
        class232.method1542(var4 + class80.field1507.method1342(var3), -26900, 15, arg0 + 4, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lu;II)V")
    public static final void method458(class117 arg0, int arg1, int arg2) {
        field1071++;
        Object[] var3 = arg0.field2053;
        int var4 = (Integer) var3[0];
        class41 var5 = class13.method125(var4, arg1 + 125);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field922;
        class130.field2286 = 0;
        int var9 = -1;
        int[] var10 = var5.field924;
        byte var11 = -1;
        try {
            if (arg1 == 2) {
                class273.field4710 = new class237[var5.field918];
                class230.field3924 = new int[var5.field920];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg0.field2056;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg0.field2055;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg0.field2046 == null ? -1 : arg0.field2046.field2530;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg0.field2049;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg0.field2046 == null ? -1 : arg0.field2046.field2433;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg0.field2048 == null ? -1 : arg0.field2048.field2530;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg0.field2048 == null ? -1 : arg0.field2048.field2433;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg0.field2045;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg0.field2051;
                        }
                        class230.field3924[var12++] = var15;
                    } else if (var3[var14] instanceof class237) {
                        class237 var16 = (class237) var3[var14];
                        if (var16.method1585((byte) 71, class149.field2642)) {
                            var16 = arg0.field2057;
                        }
                        class273.field4710[var13++] = var16;
                    }
                }
                int var17 = 0;
                label3580: while (true) {
                    var17++;
                    if (arg2 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var9++;
                    int var472 = var8[var9];
                    int var10000;
                    if (var472 < 100) {
                        if (var472 == 0) {
                            class122.field2154[var6++] = var10[var9];
                            continue;
                        }
                        if (var472 == 1) {
                            int var18 = var10[var9];
                            class122.field2154[var6++] = class202.field3471[var18];
                            continue;
                        }
                        if (var472 == 2) {
                            int var19 = var10[var9];
                            var10000 = arg1 - 100;
                            var6--;
                            class220.method1469(var10000, var19, class122.field2154[var6]);
                            continue;
                        }
                        if (var472 == 3) {
                            class59.field1201[var7++] = var5.field916[var9];
                            continue;
                        }
                        if (var472 == 6) {
                            var9 += var10[var9];
                            continue;
                        }
                        if (var472 == 7) {
                            var6 -= 2;
                            if (class122.field2154[var6 + 1] != class122.field2154[var6]) {
                                var9 += var10[var9];
                            }
                            continue;
                        }
                        if (var472 == 8) {
                            var6 -= 2;
                            if (class122.field2154[var6 + 1] == class122.field2154[var6]) {
                                var9 += var10[var9];
                            }
                            continue;
                        }
                        if (var472 == 9) {
                            var6 -= 2;
                            if (class122.field2154[var6] < class122.field2154[var6 + 1]) {
                                var9 += var10[var9];
                            }
                            continue;
                        }
                        if (var472 == 10) {
                            var6 -= 2;
                            if (class122.field2154[var6 + 1] < class122.field2154[var6]) {
                                var9 += var10[var9];
                            }
                            continue;
                        }
                        if (var472 == 21) {
                            if (class130.field2286 == 0) {
                                return;
                            }
                            class37 var20 = class147.field2618[--class130.field2286];
                            var9 = var20.field827;
                            class230.field3924 = var20.field842;
                            var5 = var20.field841;
                            var8 = var5.field922;
                            class273.field4710 = var20.field839;
                            var10 = var5.field924;
                            continue;
                        }
                        if (var472 == 25) {
                            int var21 = var10[var9];
                            class122.field2154[var6++] = class101.method766((byte) 95, var21);
                            continue;
                        }
                        if (var472 == 27) {
                            int var22 = var10[var9];
                            var6--;
                            class195.method1346(false, var22, class122.field2154[var6]);
                            continue;
                        }
                        if (var472 == 31) {
                            var6 -= 2;
                            if (class122.field2154[var6 + 1] >= class122.field2154[var6]) {
                                var9 += var10[var9];
                            }
                            continue;
                        }
                        if (var472 == 32) {
                            var6 -= 2;
                            if (class122.field2154[var6 + 1] <= class122.field2154[var6]) {
                                var9 += var10[var9];
                            }
                            continue;
                        }
                        if (var472 == 33) {
                            class122.field2154[var6++] = class230.field3924[var10[var9]];
                            continue;
                        }
                        int var10001;
                        if (var472 == 34) {
                            var10001 = var10[var9];
                            var6--;
                            class230.field3924[var10001] = class122.field2154[var6];
                            continue;
                        }
                        if (var472 == 35) {
                            class59.field1201[var7++] = class273.field4710[var10[var9]];
                            continue;
                        }
                        if (var472 == 36) {
                            var10001 = var10[var9];
                            var7--;
                            class273.field4710[var10001] = class59.field1201[var7];
                            continue;
                        }
                        if (var472 == 37) {
                            int var23 = var10[var9];
                            var7 -= var23;
                            class237 var24 = class47.method437(var7, var23, false, class59.field1201);
                            class59.field1201[var7++] = var24;
                            continue;
                        }
                        if (var472 == 38) {
                            var6--;
                            continue;
                        }
                        if (var472 == 39) {
                            var7--;
                            continue;
                        }
                        if (var472 == 40) {
                            int var25 = var10[var9];
                            class41 var26 = class13.method125(var25, 126);
                            class237[] var27 = new class237[var26.field918];
                            int[] var28 = new int[var26.field920];
                            for (int var29 = 0; var29 < var26.field913; var29++) {
                                var28[var29] = class122.field2154[var29 + var6 - var26.field913];
                            }
                            for (int var30 = 0; var30 < var26.field914; var30++) {
                                var27[var30] = class59.field1201[var7 + var30 - var26.field914];
                            }
                            var7 -= var26.field914;
                            var6 -= var26.field913;
                            class37 var31 = new class37();
                            var31.field839 = class273.field4710;
                            var31.field841 = var5;
                            var31.field842 = class230.field3924;
                            var31.field827 = var9;
                            if (class130.field2286 >= class147.field2618.length) {
                                throw new RuntimeException();
                            }
                            var9 = -1;
                            var5 = var26;
                            class147.field2618[class130.field2286++] = var31;
                            var10 = var26.field924;
                            class230.field3924 = var28;
                            class273.field4710 = var27;
                            var8 = var26.field922;
                            continue;
                        }
                        if (var472 == 42) {
                            class122.field2154[var6++] = class207.field3517[var10[var9]];
                            continue;
                        }
                        if (var472 == 43) {
                            int var32 = var10[var9];
                            var6--;
                            class207.field3517[var32] = class122.field2154[var6];
                            class105.method787(true, var32);
                            continue;
                        }
                        if (var472 == 44) {
                            int var33 = var10[var9] >> 16;
                            int var34 = var10[var9] & 0xFFFF;
                            var6--;
                            int var35 = class122.field2154[var6];
                            if (var35 >= 0 && var35 <= 5000) {
                                class48.field1040[var33] = var35;
                                byte var36 = -1;
                                if (var34 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var35) {
                                        continue label3580;
                                    }
                                    class213.field3643[var33][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var472 == 45) {
                            int var38 = var10[var9];
                            var6--;
                            int var39 = class122.field2154[var6];
                            if (var39 >= 0 && class48.field1040[var38] > var39) {
                                class122.field2154[var6++] = class213.field3643[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var472 == 46) {
                            int var40 = var10[var9];
                            var6 -= 2;
                            int var41 = class122.field2154[var6];
                            if (var41 >= 0 && class48.field1040[var40] > var41) {
                                class213.field3643[var40][var41] = class122.field2154[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var472 == 47) {
                            class237 var42 = class188.field3287[var10[var9]];
                            if (var42 == null) {
                                var42 = class79.field1481;
                            }
                            class59.field1201[var7++] = var42;
                            continue;
                        }
                        if (var472 == 48) {
                            int var43 = var10[var9];
                            var7--;
                            class188.field3287[var43] = class59.field1201[var7];
                            class43.method412(var43, 951);
                            continue;
                        }
                        if (var472 == 51) {
                            class69 var44 = var5.field923[var10[var9]];
                            var6--;
                            class166 var45 = (class166) var44.method568((long) class122.field2154[var6], arg1 - 3);
                            if (var45 != null) {
                                var9 += var45.field2932;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var10[var9] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var472 < 300) {
                        if (var472 == 100) {
                            var6 -= 3;
                            int var47 = class122.field2154[var6 + 1];
                            int var48 = class122.field2154[var6];
                            int var49 = class122.field2154[var6 + 2];
                            if (var47 == 0) {
                                throw new RuntimeException();
                            }
                            class141 var50 = class70.method572(20043, var48);
                            if (var50.field2457 == null) {
                                var50.field2457 = new class141[var49 + 1];
                            }
                            if (var49 >= var50.field2457.length) {
                                class141[] var51 = new class141[var49 + 1];
                                for (int var52 = 0; var52 < var50.field2457.length; var52++) {
                                    var51[var52] = var50.field2457[var52];
                                }
                                var50.field2457 = var51;
                            }
                            if (var49 > 0 && var50.field2457[var49 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var49 - 1));
                            }
                            class141 var53 = new class141();
                            var53.field2536 = true;
                            var53.field2535 = var53.field2530 = var50.field2530;
                            var53.field2433 = var49;
                            var53.field2529 = var47;
                            var50.field2457[var49] = var53;
                            if (var46) {
                                class33.field716 = var53;
                            } else {
                                class262.field4488 = var53;
                            }
                            class128.method911(var50, -17149);
                            continue;
                        }
                        if (var472 == 101) {
                            class141 var54 = var46 ? class33.field716 : class262.field4488;
                            if (var54.field2433 == -1) {
                                if (var46) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class141 var55 = class70.method572(20043, var54.field2530);
                            var55.field2457[var54.field2433] = null;
                            class128.method911(var55, arg1 ^ 0xFFFFBD01);
                            continue;
                        }
                        if (var472 == 102) {
                            var6--;
                            class141 var56 = class70.method572(20043, class122.field2154[var6]);
                            var56.field2457 = null;
                            class128.method911(var56, arg1 - 17151);
                            continue;
                        }
                        if (var472 == 200) {
                            var6 -= 2;
                            int var57 = class122.field2154[var6];
                            int var58 = class122.field2154[var6 + 1];
                            class141 var59 = class61.method519(var58, 0, var57);
                            if (var59 != null && var58 != -1) {
                                class122.field2154[var6++] = 1;
                                if (var46) {
                                    class33.field716 = var59;
                                } else {
                                    class262.field4488 = var59;
                                }
                                continue;
                            }
                            class122.field2154[var6++] = 0;
                            continue;
                        }
                        if (var472 == 201) {
                            var6--;
                            int var60 = class122.field2154[var6];
                            class141 var61 = class70.method572(20043, var60);
                            if (var61 == null) {
                                class122.field2154[var6++] = 0;
                            } else {
                                class122.field2154[var6++] = 1;
                                if (var46) {
                                    class33.field716 = var61;
                                } else {
                                    class262.field4488 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (var472 < 500) {
                        if (var472 == 403) {
                            var6 -= 2;
                            int var62 = class122.field2154[var6];
                            if (var62 >= 7) {
                                var62 -= 7;
                            }
                            int var63 = class122.field2154[var6 + 1];
                            class229.field3911.field4645.method267(var63, var62, arg1 ^ 0x80000002);
                            continue;
                        }
                        if (var472 == 404) {
                            var6 -= 2;
                            int var64 = class122.field2154[var6 + 1];
                            int var65 = class122.field2154[var6];
                            class229.field3911.field4645.method278(var64, -42, var65);
                            continue;
                        }
                        if (var472 == 410) {
                            var6--;
                            boolean var66 = class122.field2154[var6] != 0;
                            class229.field3911.field4645.method266(true, var66);
                            continue;
                        }
                    } else if (!(var472 < 1000 || var472 >= 1100) || !(var472 < 2000 || var472 >= 2100)) {
                        class141 var67;
                        if (var472 < 2000) {
                            var67 = var46 ? class33.field716 : class262.field4488;
                        } else {
                            var6--;
                            var67 = class70.method572(20043, class122.field2154[var6]);
                            var472 -= 1000;
                        }
                        if (var472 == 1000) {
                            var6 -= 4;
                            var67.field2510 = class122.field2154[var6];
                            var67.field2425 = class122.field2154[var6 + 1];
                            int var68 = class122.field2154[var6 + 3];
                            if (var68 < 0) {
                                var68 = 0;
                            } else if (var68 > 5) {
                                var68 = 5;
                            }
                            int var69 = class122.field2154[var6 + 2];
                            if (var69 < 0) {
                                var69 = 0;
                            } else if (var69 > 5) {
                                var69 = 5;
                            }
                            var67.field2569 = (byte) var68;
                            var67.field2476 = (byte) var69;
                            class128.method911(var67, arg1 - 17151);
                            class38.method392(31967, var67);
                            if (var67.field2433 == -1) {
                                class71.method573(arg1 ^ 0xFFFFFF8E, var67.field2530);
                            }
                            continue;
                        }
                        if (var472 == 1001) {
                            var6 -= 4;
                            var67.field2440 = class122.field2154[var6];
                            var67.field2484 = class122.field2154[var6 + 1];
                            var67.field2481 = 0;
                            var67.field2523 = 0;
                            int var70 = class122.field2154[var6 + 2];
                            if (var70 < 0) {
                                var70 = 0;
                            } else if (var70 > 4) {
                                var70 = 4;
                            }
                            int var71 = class122.field2154[var6 + 3];
                            var67.field2517 = (byte) var70;
                            if (var71 < 0) {
                                var71 = 0;
                            } else if (var71 > 4) {
                                var71 = 4;
                            }
                            var67.field2470 = (byte) var71;
                            class128.method911(var67, -17149);
                            class38.method392(31967, var67);
                            if (var67.field2529 == 0) {
                                class230.method1523(false, var67, 7318);
                            }
                            continue;
                        }
                        if (var472 == 1003) {
                            var6--;
                            boolean var72 = class122.field2154[var6] == 1;
                            if (var72 != var67.field2460) {
                                var67.field2460 = var72;
                                class128.method911(var67, arg1 - 17151);
                            }
                            if (var67.field2433 == -1) {
                                class239.method1635(-83, var67.field2530);
                            }
                            continue;
                        }
                        if (var472 == 1004) {
                            var6 -= 2;
                            var67.field2506 = class122.field2154[var6];
                            var67.field2474 = class122.field2154[var6 + 1];
                            class128.method911(var67, arg1 - 17151);
                            class38.method392(arg1 ^ 0x7CDD, var67);
                            if (var67.field2529 == 0) {
                                class230.method1523(false, var67, 7318);
                            }
                            continue;
                        }
                    } else if (var472 >= 1100 && var472 < 1200 || var472 >= 2100 && var472 < 2200) {
                        class141 var73;
                        if (var472 >= 2000) {
                            var6--;
                            var73 = class70.method572(20043, class122.field2154[var6]);
                            var472 -= 1000;
                        } else {
                            var73 = var46 ? class33.field716 : class262.field4488;
                        }
                        if (var472 == 1100) {
                            var6 -= 2;
                            var73.field2555 = class122.field2154[var6];
                            if (var73.field2461 - var73.field2575 < var73.field2555) {
                                var73.field2555 = var73.field2461 - var73.field2575;
                            }
                            if (var73.field2555 < 0) {
                                var73.field2555 = 0;
                            }
                            var73.field2413 = class122.field2154[var6 + 1];
                            if (var73.field2413 > (var73.field2500 - var73.field2490)) {
                                var73.field2413 = var73.field2500 - var73.field2490;
                            }
                            if (var73.field2413 < 0) {
                                var73.field2413 = 0;
                            }
                            class128.method911(var73, -17149);
                            if (var73.field2433 == -1) {
                                class230.method1521(12, var73.field2530);
                            }
                            continue;
                        }
                        if (var472 == 1101) {
                            var6--;
                            var73.field2458 = class122.field2154[var6];
                            class128.method911(var73, -17149);
                            if (var73.field2433 == -1) {
                                class144.method989((byte) -117, var73.field2530);
                            }
                            continue;
                        }
                        if (var472 == 1102) {
                            var6--;
                            var73.field2556 = class122.field2154[var6] == 1;
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1103) {
                            var6--;
                            var73.field2420 = class122.field2154[var6];
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1104) {
                            var6--;
                            var73.field2432 = class122.field2154[var6];
                            class128.method911(var73, arg1 - 17151);
                            continue;
                        }
                        if (var472 == 1105) {
                            var6--;
                            var73.field2472 = class122.field2154[var6];
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1106) {
                            var6--;
                            var73.field2462 = class122.field2154[var6];
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1107) {
                            var6--;
                            var73.field2497 = class122.field2154[var6] == 1;
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1108) {
                            var73.field2544 = 1;
                            var6--;
                            var73.field2456 = class122.field2154[var6];
                            class128.method911(var73, -17149);
                            if (var73.field2433 == -1) {
                                class243.method1682(var73.field2530, 4);
                            }
                            continue;
                        }
                        if (var472 == 1109) {
                            var6 -= 6;
                            var73.field2520 = class122.field2154[var6];
                            var73.field2446 = class122.field2154[var6 + 1];
                            var73.field2447 = class122.field2154[var6 + 2];
                            var73.field2531 = class122.field2154[var6 + 3];
                            var73.field2566 = class122.field2154[var6 + 4];
                            var73.field2521 = class122.field2154[var6 + 5];
                            class128.method911(var73, -17149);
                            if (var73.field2433 == -1) {
                                class35.method370(var73.field2530, (byte) -112);
                                class274.method1853(var73.field2530, 10);
                            }
                            continue;
                        }
                        if (var472 == 1110) {
                            var6--;
                            int var74 = class122.field2154[var6];
                            if (var73.field2571 != var74) {
                                var73.field2524 = 0;
                                var73.field2571 = var74;
                                var73.field2570 = 0;
                                class128.method911(var73, -17149);
                            }
                            if (var73.field2433 == -1) {
                                class259.method1743(var73.field2530, (byte) -117);
                            }
                            continue;
                        }
                        if (var472 == 1111) {
                            var6--;
                            var73.field2533 = class122.field2154[var6] == 1;
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1112) {
                            var7--;
                            class237 var75 = class59.field1201[var7];
                            if (!var75.method1585((byte) 94, var73.field2477)) {
                                var73.field2477 = var75;
                                class128.method911(var73, arg1 - 17151);
                            }
                            if (var73.field2433 == -1) {
                                class99.method759(var73.field2530, 55);
                            }
                            continue;
                        }
                        if (var472 == 1113) {
                            var6--;
                            var73.field2431 = class122.field2154[var6];
                            class128.method911(var73, arg1 - 17151);
                            continue;
                        }
                        if (var472 == 1114) {
                            var6 -= 3;
                            var73.field2464 = class122.field2154[var6];
                            var73.field2505 = class122.field2154[var6 + 1];
                            var73.field2444 = class122.field2154[var6 + 2];
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1115) {
                            var6--;
                            var73.field2467 = class122.field2154[var6] == 1;
                            class128.method911(var73, arg1 - 17151);
                            continue;
                        }
                        if (var472 == 1116) {
                            var6--;
                            var73.field2453 = class122.field2154[var6];
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1117) {
                            var6--;
                            var73.field2561 = class122.field2154[var6];
                            class128.method911(var73, arg1 ^ 0xFFFFBD01);
                            continue;
                        }
                        if (var472 == 1118) {
                            var6--;
                            var73.field2471 = class122.field2154[var6] == 1;
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1119) {
                            var6--;
                            var73.field2550 = class122.field2154[var6] == 1;
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1120) {
                            var6 -= 2;
                            var73.field2461 = class122.field2154[var6];
                            var73.field2500 = class122.field2154[var6 + 1];
                            class128.method911(var73, -17149);
                            if (var73.field2529 == 0) {
                                class230.method1523(false, var73, 7318);
                            }
                            continue;
                        }
                        if (var472 == 1121) {
                            var6 -= 2;
                            class128.method911(var73, -17149);
                            continue;
                        }
                        if (var472 == 1122) {
                            var6--;
                            var73.field2441 = class122.field2154[var6] == 1;
                            class128.method911(var73, -17149);
                            continue;
                        }
                    } else if (var472 >= 1200 && var472 < 1300 || var472 >= 2200 && var472 < 2300) {
                        class141 var462;
                        if (var472 < 2000) {
                            var462 = var46 ? class33.field716 : class262.field4488;
                        } else {
                            var472 -= 1000;
                            var10000 = arg1 ^ 0x4E49;
                            var6--;
                            var462 = class70.method572(var10000, class122.field2154[var6]);
                        }
                        class128.method911(var462, -17149);
                        if (var472 == 1200 || var472 == 1205) {
                            var6 -= 2;
                            int var463 = class122.field2154[var6];
                            int var464 = class122.field2154[var6 + 1];
                            if (var462.field2433 == -1) {
                                class95.method713(var462.field2530, (byte) -28);
                                class35.method370(var462.field2530, (byte) -112);
                                class274.method1853(var462.field2530, arg1 ^ 0x8);
                            }
                            if (var463 == -1) {
                                var462.field2456 = -1;
                                var462.field2486 = -1;
                                var462.field2544 = 1;
                            } else {
                                var462.field2486 = var463;
                                var462.field2522 = var464;
                                class8 var465 = class112.method829((byte) -82, var463);
                                var462.field2566 = var465.field130;
                                var462.field2521 = var465.field151;
                                var462.field2531 = var465.field122;
                                var462.field2447 = var465.field143;
                                var462.field2520 = var465.field137;
                                if (var472 == 1205) {
                                    var462.field2541 = false;
                                } else {
                                    var462.field2541 = true;
                                }
                                var462.field2446 = var465.field109;
                                if (var462.field2523 > 0) {
                                    var462.field2521 = var462.field2521 * 32 / var462.field2523;
                                } else if (var462.field2440 > 0) {
                                    var462.field2521 = var462.field2521 * 32 / var462.field2440;
                                }
                            }
                            continue;
                        }
                        if (var472 == 1201) {
                            var462.field2544 = 2;
                            var6--;
                            var462.field2456 = class122.field2154[var6];
                            if (var462.field2433 == -1) {
                                class243.method1682(var462.field2530, 4);
                            }
                            continue;
                        }
                        if (var472 == 1202) {
                            var462.field2544 = 3;
                            var462.field2456 = class229.field3911.field4645.method275(0);
                            if (var462.field2433 == -1) {
                                class243.method1682(var462.field2530, 4);
                            }
                            continue;
                        }
                        if (var472 == 1203) {
                            var462.field2544 = 6;
                            var6--;
                            var462.field2456 = class122.field2154[var6];
                            if (var462.field2433 == -1) {
                                class243.method1682(var462.field2530, 4);
                            }
                            continue;
                        }
                        if (var472 == 1204) {
                            var462.field2544 = 5;
                            var6--;
                            var462.field2456 = class122.field2154[var6];
                            if (var462.field2433 == -1) {
                                class243.method1682(var462.field2530, 4);
                            }
                            continue;
                        }
                    } else if (var472 >= 1300 && var472 < 1400 || var472 >= 2300 && var472 < 2400) {
                        class141 var458;
                        if (var472 < 2000) {
                            var458 = var46 ? class33.field716 : class262.field4488;
                        } else {
                            var6--;
                            var458 = class70.method572(20043, class122.field2154[var6]);
                            var472 -= 1000;
                        }
                        if (var472 == 1300) {
                            var6--;
                            int var459 = class122.field2154[var6] - 1;
                            if (var459 >= 0 && var459 <= 9) {
                                var7--;
                                var458.method976((byte) -102, var459, class59.field1201[var7]);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var472 == 1301) {
                            var6 -= 2;
                            int var460 = class122.field2154[var6];
                            int var461 = class122.field2154[var6 + 1];
                            var458.field2494 = class61.method519(var461, 0, var460);
                            continue;
                        }
                        if (var472 == 1302) {
                            var6--;
                            var458.field2574 = class122.field2154[var6] == 1;
                            continue;
                        }
                        if (var472 == 1303) {
                            var6--;
                            var458.field2528 = class122.field2154[var6];
                            continue;
                        }
                        if (var472 == 1304) {
                            var6--;
                            var458.field2430 = class122.field2154[var6];
                            continue;
                        }
                        if (var472 == 1305) {
                            var7--;
                            var458.field2485 = class59.field1201[var7];
                            continue;
                        }
                        if (var472 == 1306) {
                            var7--;
                            var458.field2547 = class59.field1201[var7];
                            continue;
                        }
                        if (var472 == 1307) {
                            var458.field2538 = null;
                            continue;
                        }
                    } else {
                        if (var472 >= 1400 && var472 < 1500 || var472 >= 2400 && var472 < 2500) {
                            class141 var451;
                            if (var472 >= 2000) {
                                var472 -= 1000;
                                var10000 = arg1 ^ 0x4E49;
                                var6--;
                                var451 = class70.method572(var10000, class122.field2154[var6]);
                            } else {
                                var451 = var46 ? class33.field716 : class262.field4488;
                            }
                            var7--;
                            class237 var452 = class59.field1201[var7];
                            int[] var453 = null;
                            if (var452.method1588(false) > 0 && var452.method1607((byte) -91, var452.method1588(false) - 1) == 89) {
                                var6--;
                                int var454 = class122.field2154[var6];
                                if (var454 > 0) {
                                    var453 = new int[var454];
                                    while (var454-- > 0) {
                                        var6--;
                                        var453[var454] = class122.field2154[var6];
                                    }
                                }
                                var452 = var452.method1620(65, var452.method1588(false) - 1, 0);
                            }
                            Object[] var455 = new Object[var452.method1588(false) + 1];
                            for (int var456 = var455.length - 1; var456 >= 1; var456--) {
                                if (var452.method1607((byte) -91, var456 - 1) == 115) {
                                    var7--;
                                    var455[var456] = class59.field1201[var7];
                                } else {
                                    var6--;
                                    var455[var456] = Integer.valueOf(class122.field2154[var6]);
                                }
                            }
                            var6--;
                            int var457 = class122.field2154[var6];
                            if (var457 == -1) {
                                var455 = null;
                            } else {
                                var455[0] = Integer.valueOf(var457);
                            }
                            if (var472 == 1400) {
                                var451.field2515 = var455;
                            } else if (var472 == 1401) {
                                var451.field2411 = var455;
                            } else if (var472 == 1402) {
                                var451.field2504 = var455;
                            } else if (var472 == 1403) {
                                var451.field2549 = var455;
                            } else if (var472 == 1404) {
                                var451.field2553 = var455;
                            } else if (var472 == 1405) {
                                var451.field2418 = var455;
                            } else if (var472 == 1406) {
                                var451.field2427 = var455;
                            } else if (var472 == 1407) {
                                var451.field2439 = var455;
                                var451.field2578 = var453;
                            } else if (var472 == 1408) {
                                var451.field2526 = var455;
                            } else if (var472 == 1409) {
                                var451.field2466 = var455;
                            } else if (var472 == 1410) {
                                var451.field2562 = var455;
                            } else if (var472 == 1411) {
                                var451.field2473 = var455;
                            } else if (var472 == 1412) {
                                var451.field2435 = var455;
                            } else if (var472 == 1414) {
                                var451.field2489 = var453;
                                var451.field2449 = var455;
                            } else if (var472 == 1415) {
                                var451.field2518 = var453;
                                var451.field2512 = var455;
                            } else if (var472 == 1416) {
                                var451.field2568 = var455;
                            } else if (var472 == 1417) {
                                var451.field2436 = var455;
                            } else if (var472 == 1418) {
                                var451.field2463 = var455;
                            } else if (var472 == 1419) {
                                var451.field2424 = var455;
                            } else if (var472 == 1420) {
                                var451.field2511 = var455;
                            } else if (var472 == 1421) {
                                var451.field2491 = var455;
                            } else if (var472 == 1422) {
                                var451.field2527 = var455;
                            } else if (var472 == 1423) {
                                var451.field2532 = var455;
                            } else if (var472 == 1424) {
                                var451.field2480 = var455;
                            } else if (var472 == 1425) {
                                var451.field2443 = var455;
                            } else if (var472 == 1426) {
                                var451.field2516 = var455;
                            } else if (var472 == 1427) {
                                var451.field2573 = var455;
                            } else if (var472 == 1428) {
                                var451.field2450 = var455;
                                var451.field2448 = var453;
                            } else if (var472 == 1429) {
                                var451.field2514 = var455;
                                var451.field2558 = var453;
                            }
                            var451.field2423 = true;
                            continue;
                        }
                        if (var472 < 1600) {
                            class141 var76 = var46 ? class33.field716 : class262.field4488;
                            if (var472 == 1500) {
                                class122.field2154[var6++] = var76.field2416;
                                continue;
                            }
                            if (var472 == 1501) {
                                class122.field2154[var6++] = var76.field2438;
                                continue;
                            }
                            if (var472 == 1502) {
                                class122.field2154[var6++] = var76.field2575;
                                continue;
                            }
                            if (var472 == 1503) {
                                class122.field2154[var6++] = var76.field2490;
                                continue;
                            }
                            if (var472 == 1504) {
                                class122.field2154[var6++] = var76.field2460 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 1505) {
                                class122.field2154[var6++] = var76.field2535;
                                continue;
                            }
                        } else if (var472 < 1700) {
                            class141 var77 = var46 ? class33.field716 : class262.field4488;
                            if (var472 == 1600) {
                                class122.field2154[var6++] = var77.field2555;
                                continue;
                            }
                            if (var472 == 1601) {
                                class122.field2154[var6++] = var77.field2413;
                                continue;
                            }
                            if (var472 == 1602) {
                                class59.field1201[var7++] = var77.field2477;
                                continue;
                            }
                            if (var472 == 1603) {
                                class122.field2154[var6++] = var77.field2461;
                                continue;
                            }
                            if (var472 == 1604) {
                                class122.field2154[var6++] = var77.field2500;
                                continue;
                            }
                            if (var472 == 1605) {
                                class122.field2154[var6++] = var77.field2521;
                                continue;
                            }
                            if (var472 == 1606) {
                                class122.field2154[var6++] = var77.field2447;
                                continue;
                            }
                            if (var472 == 1607) {
                                class122.field2154[var6++] = var77.field2566;
                                continue;
                            }
                            if (var472 == 1608) {
                                class122.field2154[var6++] = var77.field2531;
                                continue;
                            }
                            if (var472 == 1609) {
                                class122.field2154[var6++] = var77.field2420;
                                continue;
                            }
                        } else if (var472 < 1800) {
                            class141 var78 = var46 ? class33.field716 : class262.field4488;
                            if (var472 == 1700) {
                                class122.field2154[var6++] = var78.field2486;
                                continue;
                            }
                            if (var472 == 1701) {
                                if (var78.field2486 == -1) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = var78.field2522;
                                }
                                continue;
                            }
                            if (var472 == 1702) {
                                class122.field2154[var6++] = var78.field2433;
                                continue;
                            }
                        } else if (var472 < 1900) {
                            class141 var449 = var46 ? class33.field716 : class262.field4488;
                            if (var472 == 1800) {
                                class122.field2154[var6++] = class92.method694(client.method1042(var449), (byte) -25);
                                continue;
                            }
                            if (var472 == 1801) {
                                var6--;
                                int var450 = class122.field2154[var6];
                                int var474 = var450 - 1;
                                if (var449.field2538 != null && var474 < var449.field2538.length && var449.field2538[var474] != null) {
                                    class59.field1201[var7++] = var449.field2538[var474];
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 1802) {
                                if (var449.field2485 == null) {
                                    class59.field1201[var7++] = class21.field399;
                                } else {
                                    class59.field1201[var7++] = var449.field2485;
                                }
                                continue;
                            }
                        } else if (var472 < 2600) {
                            var10000 = arg1 + 20041;
                            var6--;
                            class141 var79 = class70.method572(var10000, class122.field2154[var6]);
                            if (var472 == 2500) {
                                class122.field2154[var6++] = var79.field2416;
                                continue;
                            }
                            if (var472 == 2501) {
                                class122.field2154[var6++] = var79.field2438;
                                continue;
                            }
                            if (var472 == 2502) {
                                class122.field2154[var6++] = var79.field2575;
                                continue;
                            }
                            if (var472 == 2503) {
                                class122.field2154[var6++] = var79.field2490;
                                continue;
                            }
                            if (var472 == 2504) {
                                class122.field2154[var6++] = var79.field2460 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 2505) {
                                class122.field2154[var6++] = var79.field2535;
                                continue;
                            }
                        } else if (var472 < 2700) {
                            var10000 = arg1 + 20041;
                            var6--;
                            class141 var80 = class70.method572(var10000, class122.field2154[var6]);
                            if (var472 == 2600) {
                                class122.field2154[var6++] = var80.field2555;
                                continue;
                            }
                            if (var472 == 2601) {
                                class122.field2154[var6++] = var80.field2413;
                                continue;
                            }
                            if (var472 == 2602) {
                                class59.field1201[var7++] = var80.field2477;
                                continue;
                            }
                            if (var472 == 2603) {
                                class122.field2154[var6++] = var80.field2461;
                                continue;
                            }
                            if (var472 == 2604) {
                                class122.field2154[var6++] = var80.field2500;
                                continue;
                            }
                            if (var472 == 2605) {
                                class122.field2154[var6++] = var80.field2521;
                                continue;
                            }
                            if (var472 == 2606) {
                                class122.field2154[var6++] = var80.field2447;
                                continue;
                            }
                            if (var472 == 2607) {
                                class122.field2154[var6++] = var80.field2566;
                                continue;
                            }
                            if (var472 == 2608) {
                                class122.field2154[var6++] = var80.field2531;
                                continue;
                            }
                            if (var472 == 2609) {
                                class122.field2154[var6++] = var80.field2420;
                                continue;
                            }
                        } else if (var472 < 2800) {
                            if (var472 == 2700) {
                                var6--;
                                class141 var81 = class70.method572(20043, class122.field2154[var6]);
                                class122.field2154[var6++] = var81.field2486;
                                continue;
                            }
                            if (var472 == 2701) {
                                var10000 = arg1 ^ 0x4E49;
                                var6--;
                                class141 var82 = class70.method572(var10000, class122.field2154[var6]);
                                if (var82.field2486 == -1) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = var82.field2522;
                                }
                                continue;
                            }
                            if (var472 == 2702) {
                                var6--;
                                int var83 = class122.field2154[var6];
                                class58 var84 = (class58) class164.field2915.method568((long) var83, -1);
                                if (var84 == null) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = 1;
                                }
                                continue;
                            }
                            if (var472 == 2703) {
                                var6--;
                                class141 var85 = class70.method572(20043, class122.field2154[var6]);
                                if (var85.field2457 == null) {
                                    class122.field2154[var6++] = 0;
                                    continue;
                                }
                                int var86 = var85.field2457.length;
                                for (int var87 = 0; var87 < var85.field2457.length; var87++) {
                                    if (var85.field2457[var87] == null) {
                                        var86 = var87;
                                        break;
                                    }
                                }
                                class122.field2154[var6++] = var86;
                                continue;
                            }
                            if (var472 == 2704 || var472 == 2705) {
                                var6 -= 2;
                                int var88 = class122.field2154[var6];
                                int var89 = class122.field2154[var6 + 1];
                                class58 var90 = (class58) class164.field2915.method568((long) var88, -1);
                                if (var90 != null && var90.field1191 == var89) {
                                    class122.field2154[var6++] = 1;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                        } else if (var472 < 2900) {
                            var6--;
                            class141 var447 = class70.method572(20043, class122.field2154[var6]);
                            if (var472 == 2800) {
                                class122.field2154[var6++] = class92.method694(client.method1042(var447), (byte) -64);
                                continue;
                            }
                            if (var472 == 2801) {
                                var6--;
                                int var448 = class122.field2154[var6];
                                int var473 = var448 - 1;
                                if (var447.field2538 != null && var447.field2538.length > var473 && var447.field2538[var473] != null) {
                                    class59.field1201[var7++] = var447.field2538[var473];
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 2802) {
                                if (var447.field2485 == null) {
                                    class59.field1201[var7++] = class21.field399;
                                } else {
                                    class59.field1201[var7++] = var447.field2485;
                                }
                                continue;
                            }
                        } else if (var472 < 3200) {
                            if (var472 == 3100) {
                                var7--;
                                class237 var432 = class59.field1201[var7];
                                class175.method1212(var432, class21.field399, (byte) 117, 0);
                                continue;
                            }
                            if (var472 == 3101) {
                                var6 -= 2;
                                client.method1049(0, class229.field3911, class122.field2154[var6 + 1], class122.field2154[var6]);
                                continue;
                            }
                            if (var472 == 3103) {
                                class117.method853(122);
                                continue;
                            }
                            if (var472 == 3104) {
                                class253.field4356++;
                                var7--;
                                class237 var433 = class59.field1201[var7];
                                int var434 = 0;
                                if (var433.method1593((byte) 124)) {
                                    var434 = var433.method1600(-125);
                                }
                                class223.field3830.method368(7, 122);
                                class223.field3830.method290((byte) -20, var434);
                                continue;
                            }
                            if (var472 == 3105) {
                                class108.field1922++;
                                var7--;
                                class237 var435 = class59.field1201[var7];
                                class223.field3830.method368(72, 204);
                                class223.field3830.method292(arg1 + 91, var435.method1616(0));
                                continue;
                            }
                            if (var472 == 3106) {
                                class144.field2604++;
                                var7--;
                                class237 var436 = class59.field1201[var7];
                                class223.field3830.method368(77, 188);
                                class223.field3830.method293((byte) 125, var436.method1588(false) + 1);
                                class223.field3830.method334(arg1 ^ 0xFFFFFF86, var436);
                                continue;
                            }
                            if (var472 == 3107) {
                                var6--;
                                int var437 = class122.field2154[var6];
                                var7--;
                                class237 var438 = class59.field1201[var7];
                                class118.method855(0, var438, var437);
                                continue;
                            }
                            if (var472 == 3108) {
                                var6 -= 3;
                                int var439 = class122.field2154[var6];
                                int var440 = class122.field2154[var6 + 1];
                                int var441 = class122.field2154[var6 + 2];
                                class141 var442 = class70.method572(20043, var441);
                                class20.method202(var442, 72, var440, var439);
                                continue;
                            }
                            if (var472 == 3109) {
                                var6 -= 2;
                                int var443 = class122.field2154[var6];
                                int var444 = class122.field2154[var6 + 1];
                                class141 var445 = var46 ? class33.field716 : class262.field4488;
                                class20.method202(var445, 69, var444, var443);
                                continue;
                            }
                            if (var472 == 3110) {
                                var6--;
                                int var446 = class122.field2154[var6];
                                class223.field3830.method368(-124, 221);
                                class223.field3830.method350((byte) 19, var446);
                                class207.field3526++;
                                continue;
                            }
                        } else if (var472 < 3300) {
                            if (var472 == 3200) {
                                var6 -= 3;
                                class59.method514(class122.field2154[var6 + 2], class122.field2154[var6 + 1], class122.field2154[var6], false);
                                continue;
                            }
                            if (var472 == 3201) {
                                var6--;
                                class62.method526(false, class122.field2154[var6]);
                                continue;
                            }
                            if (var472 == 3202) {
                                var6 -= 2;
                                class110.method817(-1, class122.field2154[var6], class122.field2154[var6 + 1]);
                                continue;
                            }
                        } else if (var472 < 3400) {
                            if (var472 == 3300) {
                                class122.field2154[var6++] = class241.field4246;
                                continue;
                            }
                            if (var472 == 3301) {
                                var6 -= 2;
                                int var91 = class122.field2154[var6];
                                int var92 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class272.method1820(var92, 103, var91);
                                continue;
                            }
                            if (var472 == 3302) {
                                var6 -= 2;
                                int var93 = class122.field2154[var6];
                                int var94 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class7.method81(var93, (byte) 90, var94);
                                continue;
                            }
                            if (var472 == 3303) {
                                var6 -= 2;
                                int var95 = class122.field2154[var6];
                                int var96 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class167.method1171(-66, var95, var96);
                                continue;
                            }
                            if (var472 == 3304) {
                                var6--;
                                int var97 = class122.field2154[var6];
                                class122.field2154[var6++] = class3.method52(var97, (byte) -108).field4468;
                                continue;
                            }
                            if (var472 == 3305) {
                                var6--;
                                int var98 = class122.field2154[var6];
                                class122.field2154[var6++] = class242.field4251[var98];
                                continue;
                            }
                            if (var472 == 3306) {
                                var6--;
                                int var99 = class122.field2154[var6];
                                class122.field2154[var6++] = class177.field3105[var99];
                                continue;
                            }
                            if (var472 == 3307) {
                                var6--;
                                int var100 = class122.field2154[var6];
                                class122.field2154[var6++] = class29.field582[var100];
                                continue;
                            }
                            if (var472 == 3308) {
                                int var101 = class274.field4798;
                                int var102 = (class229.field3911.field3710 >> 7) + class235.field4087;
                                int var103 = (class229.field3911.field3700 >> 7) + class27.field494;
                                class122.field2154[var6++] = (var101 << 28) + (var102 << 14) + var103;
                                continue;
                            }
                            if (var472 == 3309) {
                                var6--;
                                int var104 = class122.field2154[var6];
                                class122.field2154[var6++] = class272.method1817(var104, 268427177) >> 14;
                                continue;
                            }
                            if (var472 == 3310) {
                                var6--;
                                int var105 = class122.field2154[var6];
                                class122.field2154[var6++] = var105 >> 28;
                                continue;
                            }
                            if (var472 == 3311) {
                                var6--;
                                int var106 = class122.field2154[var6];
                                class122.field2154[var6++] = class272.method1817(16383, var106);
                                continue;
                            }
                            if (var472 == 3312) {
                                class122.field2154[var6++] = class29.field587 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3313) {
                                var6 -= 2;
                                int var107 = class122.field2154[var6 + 1];
                                int var108 = class122.field2154[var6] + 32768;
                                class122.field2154[var6++] = class272.method1820(var107, 93, var108);
                                continue;
                            }
                            if (var472 == 3314) {
                                var6 -= 2;
                                int var109 = class122.field2154[var6] + 32768;
                                int var110 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class7.method81(var109, (byte) 106, var110);
                                continue;
                            }
                            if (var472 == 3315) {
                                var6 -= 2;
                                int var111 = class122.field2154[var6] + 32768;
                                int var112 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class167.method1171(-73, var111, var112);
                                continue;
                            }
                            if (var472 == 3316) {
                                if (class64.field1283 < 2) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = class64.field1283;
                                }
                                continue;
                            }
                            if (var472 == 3317) {
                                class122.field2154[var6++] = class8.field120;
                                continue;
                            }
                            if (var472 == 3318) {
                                class122.field2154[var6++] = class126.field2205;
                                continue;
                            }
                            if (var472 == 3321) {
                                class122.field2154[var6++] = class25.field463;
                                continue;
                            }
                            if (var472 == 3322) {
                                class122.field2154[var6++] = class81.field1532;
                                continue;
                            }
                            if (var472 == 3323) {
                                if (class172.field3015 >= 5 && class172.field3015 <= 9) {
                                    class122.field2154[var6++] = 1;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3324) {
                                if (class172.field3015 >= 5 && class172.field3015 <= 9) {
                                    class122.field2154[var6++] = class172.field3015;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3325) {
                                class122.field2154[var6++] = class260.field4457 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3326) {
                                class122.field2154[var6++] = class229.field3911.field4660;
                                continue;
                            }
                            if (var472 == 3327) {
                                class122.field2154[var6++] = class229.field3911.field4645.field579 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3328) {
                                class122.field2154[var6++] = class239.field4184;
                                continue;
                            }
                            if (var472 == 3329) {
                                class122.field2154[var6++] = class53.field1113;
                                continue;
                            }
                            if (var472 == 3330) {
                                var6--;
                                int var113 = class122.field2154[var6];
                                class122.field2154[var6++] = class55.method490(0, var113);
                                continue;
                            }
                            if (var472 == 3331) {
                                var6 -= 2;
                                int var114 = class122.field2154[var6];
                                int var115 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class218.method1461(var114, false, var115, (byte) -46);
                                continue;
                            }
                            if (var472 == 3332) {
                                var6 -= 2;
                                int var116 = class122.field2154[var6 + 1];
                                int var117 = class122.field2154[var6];
                                class122.field2154[var6++] = class218.method1461(var117, true, var116, (byte) -70);
                                continue;
                            }
                            if (var472 == 3333) {
                                class122.field2154[var6++] = class22.field403;
                                continue;
                            }
                            if (var472 == 3335) {
                                class122.field2154[var6++] = class37.field835;
                                continue;
                            }
                        } else if (var472 < 3500) {
                            if (var472 == 3400) {
                                var6 -= 2;
                                int var118 = class122.field2154[var6];
                                int var119 = class122.field2154[var6 + 1];
                                class131 var120 = class59.method508(-23216, var118);
                                class59.field1201[var7++] = var120.method927(25606, var119);
                                continue;
                            }
                            if (var472 == 3408) {
                                var6 -= 4;
                                int var121 = class122.field2154[var6];
                                int var122 = class122.field2154[var6 + 1];
                                int var123 = class122.field2154[var6 + 3];
                                int var124 = class122.field2154[var6 + 2];
                                class131 var125 = class59.method508(-23216, var124);
                                if (var125.field2297 == var121 && var125.field2289 == var122) {
                                    if (var122 == 115) {
                                        class59.field1201[var7++] = var125.method927(25606, var123);
                                    } else {
                                        class122.field2154[var6++] = var125.method921(var123, (byte) -118);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var472 == 3409) {
                                var6 -= 3;
                                int var126 = class122.field2154[var6 + 1];
                                int var127 = class122.field2154[var6];
                                int var128 = class122.field2154[var6 + 2];
                                if (var126 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class131 var129 = class59.method508(-23216, var126);
                                if (var129.field2289 != var127) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class122.field2154[var6++] = var129.method926(59, var128) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3410) {
                                var6--;
                                int var130 = class122.field2154[var6];
                                var7--;
                                class237 var131 = class59.field1201[var7];
                                if (var130 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class131 var132 = class59.method508(-23216, var130);
                                if (var132.field2289 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class122.field2154[var6++] = var132.method925(var131, 4) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3411) {
                                var6--;
                                int var133 = class122.field2154[var6];
                                class131 var134 = class59.method508(-23216, var133);
                                class122.field2154[var6++] = var134.field2314.method567((byte) 32);
                                continue;
                            }
                        } else if (var472 < 3700) {
                            if (var472 == 3600) {
                                if (class38.field844 == 0) {
                                    class122.field2154[var6++] = -2;
                                } else if (class38.field844 == 1) {
                                    class122.field2154[var6++] = -1;
                                } else {
                                    class122.field2154[var6++] = class221.field3810;
                                }
                                continue;
                            }
                            if (var472 == 3601) {
                                var6--;
                                int var410 = class122.field2154[var6];
                                if (class38.field844 == 2 && var410 < class221.field3810) {
                                    class59.field1201[var7++] = class152.field2694[var410];
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 3602) {
                                var6--;
                                int var411 = class122.field2154[var6];
                                if (class38.field844 == 2 && var411 < class221.field3810) {
                                    class122.field2154[var6++] = class71.field1399[var411];
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3603) {
                                var6--;
                                int var412 = class122.field2154[var6];
                                if (class38.field844 == 2 && class221.field3810 > var412) {
                                    class122.field2154[var6++] = class195.field3402[var412];
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3604) {
                                var7--;
                                class237 var413 = class59.field1201[var7];
                                var6--;
                                int var414 = class122.field2154[var6];
                                class273.method1821(var414, var413, false);
                                continue;
                            }
                            if (var472 == 3605) {
                                var7--;
                                class237 var415 = class59.field1201[var7];
                                class149.method1008(var415.method1616(arg1 ^ 0x2), 0);
                                continue;
                            }
                            if (var472 == 3606) {
                                var7--;
                                class237 var416 = class59.field1201[var7];
                                class216.method1451(-22574, var416.method1616(0));
                                continue;
                            }
                            if (var472 == 3607) {
                                var7--;
                                class237 var417 = class59.field1201[var7];
                                class255.method1724(var417.method1616(arg1 - 2), arg1 + 120);
                                continue;
                            }
                            if (var472 == 3608) {
                                var7--;
                                class237 var418 = class59.field1201[var7];
                                class144.method988(var418.method1616(0), arg1 + 9500);
                                continue;
                            }
                            if (var472 == 3609) {
                                var7--;
                                class237 var419 = class59.field1201[var7];
                                if (var419.method1589(-1, class160.field2870) || var419.method1589(-1, class78.field1455)) {
                                    var419 = var419.method1610(7, 118);
                                }
                                class122.field2154[var6++] = class253.method1714(-52, var419) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3610) {
                                var6--;
                                int var420 = class122.field2154[var6];
                                if (class38.field844 == 2 && var420 < class221.field3810) {
                                    class59.field1201[var7++] = class13.field213[var420];
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 3611) {
                                if (class190.field3302 == null) {
                                    class59.field1201[var7++] = class21.field399;
                                } else {
                                    class59.field1201[var7++] = class190.field3302.method1581((byte) -127);
                                }
                                continue;
                            }
                            if (var472 == 3612) {
                                if (class190.field3302 == null) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = class260.field4464;
                                }
                                continue;
                            }
                            if (var472 == 3613) {
                                var6--;
                                int var421 = class122.field2154[var6];
                                if (class190.field3302 != null && class260.field4464 > var421) {
                                    class59.field1201[var7++] = class113.field1971[var421].field3405.method1581((byte) -116);
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 3614) {
                                var6--;
                                int var422 = class122.field2154[var6];
                                if (class190.field3302 != null && var422 < class260.field4464) {
                                    class122.field2154[var6++] = class113.field1971[var422].field3414;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3615) {
                                var6--;
                                int var423 = class122.field2154[var6];
                                if (class190.field3302 != null && class260.field4464 > var423) {
                                    class122.field2154[var6++] = class113.field1971[var423].field3417;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3616) {
                                class122.field2154[var6++] = class252.field4338;
                                continue;
                            }
                            if (var472 == 3617) {
                                var7--;
                                class237 var424 = class59.field1201[var7];
                                class232.method1540(var424, false);
                                continue;
                            }
                            if (var472 == 3618) {
                                class122.field2154[var6++] = class65.field1295;
                                continue;
                            }
                            if (var472 == 3619) {
                                var7--;
                                class237 var425 = class59.field1201[var7];
                                class37.method382(var425.method1616(0), 14942);
                                continue;
                            }
                            if (var472 == 3620) {
                                class148.method1002(29165);
                                continue;
                            }
                            if (var472 == 3621) {
                                if (class38.field844 == 0) {
                                    class122.field2154[var6++] = -1;
                                } else {
                                    class122.field2154[var6++] = class179.field3143;
                                }
                                continue;
                            }
                            if (var472 == 3622) {
                                var6--;
                                int var426 = class122.field2154[var6];
                                if (class38.field844 != 0 && var426 < class179.field3143) {
                                    class59.field1201[var7++] = class146.method995(270, class17.field289[var426]).method1581((byte) -116);
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 3623) {
                                var7--;
                                class237 var427 = class59.field1201[var7];
                                if (var427.method1589(-1, class160.field2870) || var427.method1589(-1, class78.field1455)) {
                                    var427 = var427.method1610(7, 126);
                                }
                                class122.field2154[var6++] = class3.method55(class38.method384(arg1, -32494), var427) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3624) {
                                var6--;
                                int var428 = class122.field2154[var6];
                                if (class113.field1971 != null && var428 < class260.field4464 && class113.field1971[var428].field3405.method1580(class229.field3911.field4655, (byte) 27)) {
                                    class122.field2154[var6++] = 1;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3625) {
                                if (class25.field452 == null) {
                                    class59.field1201[var7++] = class21.field399;
                                } else {
                                    class59.field1201[var7++] = class25.field452.method1581((byte) -110);
                                }
                                continue;
                            }
                            if (var472 == 3626) {
                                var6--;
                                int var429 = class122.field2154[var6];
                                if (class190.field3302 != null && var429 < class260.field4464) {
                                    class59.field1201[var7++] = class113.field1971[var429].field3407;
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 3627) {
                                var6--;
                                int var430 = class122.field2154[var6];
                                if (class38.field844 == 2 && var430 >= 0 && var430 < class221.field3810) {
                                    class122.field2154[var6++] = class180.field3163[var430] ? 1 : 0;
                                    continue;
                                }
                                class122.field2154[var6++] = 0;
                                continue;
                            }
                            if (var472 == 3628) {
                                var7--;
                                class237 var431 = class59.field1201[var7];
                                if (var431.method1589(-1, class160.field2870) || var431.method1589(-1, class78.field1455)) {
                                    var431 = var431.method1610(7, 122);
                                }
                                class122.field2154[var6++] = class53.method475(var431, 88);
                                continue;
                            }
                        } else if (var472 < 4000) {
                            if (var472 == 3903) {
                                var6--;
                                int var396 = class122.field2154[var6];
                                class122.field2154[var6++] = class191.field3321[var396].method465(arg1 - 3980);
                                continue;
                            }
                            if (var472 == 3904) {
                                var6--;
                                int var397 = class122.field2154[var6];
                                class122.field2154[var6++] = class191.field3321[var397].field1090;
                                continue;
                            }
                            if (var472 == 3905) {
                                var6--;
                                int var398 = class122.field2154[var6];
                                class122.field2154[var6++] = class191.field3321[var398].field1088;
                                continue;
                            }
                            if (var472 == 3906) {
                                var6--;
                                int var399 = class122.field2154[var6];
                                class122.field2154[var6++] = class191.field3321[var399].field1089;
                                continue;
                            }
                            if (var472 == 3907) {
                                var6--;
                                int var400 = class122.field2154[var6];
                                class122.field2154[var6++] = class191.field3321[var400].field1095;
                                continue;
                            }
                            if (var472 == 3908) {
                                var6--;
                                int var401 = class122.field2154[var6];
                                class122.field2154[var6++] = class191.field3321[var401].field1104;
                                continue;
                            }
                            if (var472 == 3910) {
                                var6--;
                                int var402 = class122.field2154[var6];
                                int var403 = class191.field3321[var402].method464((byte) 28);
                                class122.field2154[var6++] = var403 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3911) {
                                var6--;
                                int var404 = class122.field2154[var6];
                                int var405 = class191.field3321[var404].method464((byte) 28);
                                class122.field2154[var6++] = var405 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3912) {
                                var6--;
                                int var406 = class122.field2154[var6];
                                int var407 = class191.field3321[var406].method464((byte) 28);
                                class122.field2154[var6++] = var407 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 3913) {
                                var6--;
                                int var408 = class122.field2154[var6];
                                int var409 = class191.field3321[var408].method464((byte) 28);
                                class122.field2154[var6++] = var409 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var472 < 4100) {
                            if (var472 == 4000) {
                                var6 -= 2;
                                int var351 = class122.field2154[var6];
                                int var352 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = var351 + var352;
                                continue;
                            }
                            if (var472 == 4001) {
                                var6 -= 2;
                                int var353 = class122.field2154[var6 + 1];
                                int var354 = class122.field2154[var6];
                                class122.field2154[var6++] = var354 - var353;
                                continue;
                            }
                            if (var472 == 4002) {
                                var6 -= 2;
                                int var355 = class122.field2154[var6 + 1];
                                int var356 = class122.field2154[var6];
                                class122.field2154[var6++] = var355 * var356;
                                continue;
                            }
                            if (var472 == 4003) {
                                var6 -= 2;
                                int var357 = class122.field2154[var6 + 1];
                                int var358 = class122.field2154[var6];
                                class122.field2154[var6++] = var358 / var357;
                                continue;
                            }
                            if (var472 == 4004) {
                                var6--;
                                int var359 = class122.field2154[var6];
                                class122.field2154[var6++] = (int) (Math.random() * (double) var359);
                                continue;
                            }
                            if (var472 == 4005) {
                                var6--;
                                int var360 = class122.field2154[var6];
                                class122.field2154[var6++] = (int) ((double) (var360 + 1) * Math.random());
                                continue;
                            }
                            if (var472 == 4006) {
                                var6 -= 5;
                                int var361 = class122.field2154[var6];
                                int var362 = class122.field2154[var6 + 1];
                                int var363 = class122.field2154[var6 + 2];
                                int var364 = class122.field2154[var6 + 3];
                                int var365 = class122.field2154[var6 + 4];
                                class122.field2154[var6++] = (var365 - var363) * (var362 - var361) / (var364 - var363) + var361;
                                continue;
                            }
                            if (var472 == 4007) {
                                var6 -= 2;
                                long var366 = (long) class122.field2154[var6];
                                long var368 = (long) class122.field2154[var6 + 1];
                                class122.field2154[var6++] = (int) (var366 * var368 / 100L + var366);
                                continue;
                            }
                            if (var472 == 4008) {
                                var6 -= 2;
                                int var370 = class122.field2154[var6];
                                int var371 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class34.method362(var370, 0x1 << var371);
                                continue;
                            }
                            if (var472 == 4009) {
                                var6 -= 2;
                                int var372 = class122.field2154[var6 + 1];
                                int var373 = class122.field2154[var6];
                                class122.field2154[var6++] = class272.method1817(-(0x1 << var372) - 1, var373);
                                continue;
                            }
                            if (var472 == 4010) {
                                var6 -= 2;
                                int var374 = class122.field2154[var6 + 1];
                                int var375 = class122.field2154[var6];
                                class122.field2154[var6++] = class272.method1817(var375, 0x1 << var374) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var472 == 4011) {
                                var6 -= 2;
                                int var376 = class122.field2154[var6];
                                int var377 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = var376 % var377;
                                continue;
                            }
                            if (var472 == 4012) {
                                var6 -= 2;
                                int var378 = class122.field2154[var6 + 1];
                                int var379 = class122.field2154[var6];
                                if (var379 == 0) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = (int) Math.pow((double) var379, (double) var378);
                                }
                                continue;
                            }
                            if (var472 == 4013) {
                                var6 -= 2;
                                int var380 = class122.field2154[var6 + 1];
                                int var381 = class122.field2154[var6];
                                if (var381 == 0) {
                                    class122.field2154[var6++] = 0;
                                } else if (var380 == 0) {
                                    class122.field2154[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class122.field2154[var6++] = (int) Math.pow((double) var381, 1.0D / (double) var380);
                                }
                                continue;
                            }
                            if (var472 == 4014) {
                                var6 -= 2;
                                int var382 = class122.field2154[var6];
                                int var383 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class272.method1817(var383, var382);
                                continue;
                            }
                            if (var472 == 4015) {
                                var6 -= 2;
                                int var384 = class122.field2154[var6];
                                int var385 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = class34.method362(var385, var384);
                                continue;
                            }
                            if (var472 == 4016) {
                                var6 -= 2;
                                int var386 = class122.field2154[var6];
                                int var387 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = var387 <= var386 ? var387 : var386;
                                continue;
                            }
                            if (var472 == 4017) {
                                var6 -= 2;
                                int var388 = class122.field2154[var6 + 1];
                                int var389 = class122.field2154[var6];
                                class122.field2154[var6++] = var388 >= var389 ? var388 : var389;
                                continue;
                            }
                            if (var472 == 4018) {
                                var6 -= 3;
                                long var390 = (long) class122.field2154[var6];
                                long var392 = (long) class122.field2154[var6 + 1];
                                long var394 = (long) class122.field2154[var6 + 2];
                                class122.field2154[var6++] = (int) (var390 * var394 / var392);
                                continue;
                            }
                        } else if (var472 < 4200) {
                            if (var472 == 4100) {
                                var7--;
                                class237 var135 = class59.field1201[var7];
                                var6--;
                                int var136 = class122.field2154[var6];
                                class59.field1201[var7++] = class238.method1626(new class237[] { var135, class14.method130(var136, (byte) 117) }, -82);
                                continue;
                            }
                            if (var472 == 4101) {
                                var7 -= 2;
                                class237 var137 = class59.field1201[var7];
                                class237 var138 = class59.field1201[var7 + 1];
                                class59.field1201[var7++] = class238.method1626(new class237[] { var137, var138 }, -29);
                                continue;
                            }
                            if (var472 == 4102) {
                                var6--;
                                int var139 = class122.field2154[var6];
                                var7--;
                                class237 var140 = class59.field1201[var7];
                                class59.field1201[var7++] = class238.method1626(new class237[] { var140, class131.method924(true, var139, 10) }, -55);
                                continue;
                            }
                            if (var472 == 4103) {
                                var7--;
                                class237 var141 = class59.field1201[var7];
                                class59.field1201[var7++] = var141.method1579(-18896);
                                continue;
                            }
                            if (var472 == 4104) {
                                var6--;
                                int var142 = class122.field2154[var6];
                                long var143 = ((long) var142 + 11745L) * 86400000L;
                                class148.field2632.setTime(new Date(var143));
                                int var145 = class148.field2632.get(5);
                                int var146 = class148.field2632.get(2);
                                int var147 = class148.field2632.get(1);
                                class59.field1201[var7++] = class238.method1626(new class237[] { class14.method130(var145, (byte) 117), class119.field2077, class36.field798[var146], class119.field2077, class14.method130(var147, (byte) 117) }, class38.method384(arg1, -77));
                                continue;
                            }
                            if (var472 == 4105) {
                                var7 -= 2;
                                class237 var148 = class59.field1201[var7];
                                class237 var149 = class59.field1201[var7 + 1];
                                if (class229.field3911.field4645 != null && class229.field3911.field4645.field579) {
                                    class59.field1201[var7++] = var149;
                                    continue;
                                }
                                class59.field1201[var7++] = var148;
                                continue;
                            }
                            if (var472 == 4106) {
                                var6--;
                                int var150 = class122.field2154[var6];
                                class59.field1201[var7++] = class14.method130(var150, (byte) 117);
                                continue;
                            }
                            if (var472 == 4107) {
                                var7 -= 2;
                                class122.field2154[var6++] = class59.field1201[var7].method1611(class59.field1201[var7 + 1], 127);
                                continue;
                            }
                            if (var472 == 4108) {
                                var7--;
                                class237 var151 = class59.field1201[var7];
                                var6 -= 2;
                                int var152 = class122.field2154[var6];
                                int var153 = class122.field2154[var6 + 1];
                                byte[] var154 = class104.field1842.method1645(true, 0, var153);
                                class136 var155 = new class136(var154);
                                var155.method1335(class85.field1581, (int[]) null);
                                class122.field2154[var6++] = var155.method1327(var151, var152);
                                continue;
                            }
                            if (var472 == 4109) {
                                var6 -= 2;
                                var7--;
                                class237 var156 = class59.field1201[var7];
                                int var157 = class122.field2154[var6];
                                int var158 = class122.field2154[var6 + 1];
                                byte[] var159 = class104.field1842.method1645(true, 0, var158);
                                class136 var160 = new class136(var159);
                                var160.method1335(class85.field1581, (int[]) null);
                                class122.field2154[var6++] = var160.method1324(var156, var157);
                                continue;
                            }
                            if (var472 == 4110) {
                                var7 -= 2;
                                class237 var161 = class59.field1201[var7];
                                class237 var162 = class59.field1201[var7 + 1];
                                var6--;
                                if (class122.field2154[var6] == 1) {
                                    class59.field1201[var7++] = var161;
                                } else {
                                    class59.field1201[var7++] = var162;
                                }
                                continue;
                            }
                            if (var472 == 4111) {
                                var7--;
                                class237 var163 = class59.field1201[var7];
                                class59.field1201[var7++] = class194.method1344(var163);
                                continue;
                            }
                            if (var472 == 4112) {
                                var7--;
                                class237 var164 = class59.field1201[var7];
                                var6--;
                                int var165 = class122.field2154[var6];
                                if (var165 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class59.field1201[var7++] = var164.method1598(var165, (byte) -42);
                                continue;
                            }
                            if (var472 == 4113) {
                                var6--;
                                int var166 = class122.field2154[var6];
                                class122.field2154[var6++] = class253.method1712(class38.method384(arg1, 3), var166) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4114) {
                                var6--;
                                int var167 = class122.field2154[var6];
                                class122.field2154[var6++] = class127.method898(false, var167) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4115) {
                                var6--;
                                int var168 = class122.field2154[var6];
                                class122.field2154[var6++] = class185.method1266(var168, 2925) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4116) {
                                var6--;
                                int var169 = class122.field2154[var6];
                                class122.field2154[var6++] = class166.method1160(false, var169) ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4117) {
                                var7--;
                                class237 var170 = class59.field1201[var7];
                                if (var170 == null) {
                                    class122.field2154[var6++] = 0;
                                } else {
                                    class122.field2154[var6++] = var170.method1588(false);
                                }
                                continue;
                            }
                            if (var472 == 4118) {
                                var6 -= 2;
                                int var171 = class122.field2154[var6];
                                int var172 = class122.field2154[var6 + 1];
                                var7--;
                                class237 var173 = class59.field1201[var7];
                                class59.field1201[var7++] = var173.method1620(class38.method384(arg1, 84), var172, var171);
                                continue;
                            }
                            if (var472 == 4119) {
                                var7--;
                                class237 var174 = class59.field1201[var7];
                                boolean var175 = false;
                                class237 var176 = class240.method1666(var174.method1588(false), true);
                                for (int var177 = 0; var177 < var174.method1588(false); var177++) {
                                    int var178 = var174.method1607((byte) -91, var177);
                                    if (var178 == 60) {
                                        var175 = true;
                                    } else if (var178 == 62) {
                                        var175 = false;
                                    } else if (!var175) {
                                        var176.method1603(-104, var178);
                                    }
                                }
                                var176.method1596(arg1 ^ 0x4F67);
                                class59.field1201[var7++] = var176;
                                continue;
                            }
                            if (var472 == 4120) {
                                var6 -= 2;
                                var7--;
                                class237 var179 = class59.field1201[var7];
                                int var180 = class122.field2154[var6];
                                int var181 = class122.field2154[var6 + 1];
                                class122.field2154[var6++] = var179.method1597(var180, (byte) 100, var181);
                                continue;
                            }
                            if (var472 == 4121) {
                                var6--;
                                int var182 = class122.field2154[var6];
                                var7 -= 2;
                                class237 var183 = class59.field1201[var7 + 1];
                                class237 var184 = class59.field1201[var7];
                                class122.field2154[var6++] = var184.method1602(var182, 0, var183);
                                continue;
                            }
                            if (var472 == 4122) {
                                var6--;
                                int var185 = class122.field2154[var6];
                                class122.field2154[var6++] = class212.method1420(var185, true);
                                continue;
                            }
                            if (var472 == 4123) {
                                var6--;
                                int var186 = class122.field2154[var6];
                                class122.field2154[var6++] = class85.method649(var186, true);
                                continue;
                            }
                        } else if (var472 < 4300) {
                            if (var472 == 4200) {
                                var6--;
                                int var187 = class122.field2154[var6];
                                class59.field1201[var7++] = class112.method829((byte) -82, var187).field131;
                                continue;
                            }
                            if (var472 == 4201) {
                                var6 -= 2;
                                int var188 = class122.field2154[var6];
                                int var189 = class122.field2154[var6 + 1];
                                class8 var190 = class112.method829((byte) -82, var188);
                                if (var189 >= 1 && var189 <= 5 && var190.field169[var189 - 1] != null) {
                                    class59.field1201[var7++] = var190.field169[var189 - 1];
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 4202) {
                                var6 -= 2;
                                int var191 = class122.field2154[var6 + 1];
                                int var192 = class122.field2154[var6];
                                class8 var193 = class112.method829((byte) -82, var192);
                                if (var191 >= 1 && var191 <= 5 && var193.field157[var191 - 1] != null) {
                                    class59.field1201[var7++] = var193.field157[var191 - 1];
                                    continue;
                                }
                                class59.field1201[var7++] = class21.field399;
                                continue;
                            }
                            if (var472 == 4203) {
                                var6--;
                                int var194 = class122.field2154[var6];
                                class122.field2154[var6++] = class112.method829((byte) -82, var194).field150;
                                continue;
                            }
                            if (var472 == 4204) {
                                var6--;
                                int var195 = class122.field2154[var6];
                                class122.field2154[var6++] = class112.method829((byte) -82, var195).field168 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4205) {
                                var6--;
                                int var196 = class122.field2154[var6];
                                class8 var197 = class112.method829((byte) -82, var196);
                                if (var197.field124 == -1 && var197.field178 >= 0) {
                                    class122.field2154[var6++] = var197.field178;
                                    continue;
                                }
                                class122.field2154[var6++] = var196;
                                continue;
                            }
                            if (var472 == 4206) {
                                var6--;
                                int var198 = class122.field2154[var6];
                                class8 var199 = class112.method829((byte) -82, var198);
                                if (var199.field124 >= 0 && var199.field178 >= 0) {
                                    class122.field2154[var6++] = var199.field178;
                                    continue;
                                }
                                class122.field2154[var6++] = var198;
                                continue;
                            }
                            if (var472 == 4207) {
                                var6--;
                                int var200 = class122.field2154[var6];
                                class122.field2154[var6++] = class112.method829((byte) -82, var200).field158 ? 1 : 0;
                                continue;
                            }
                            if (var472 == 4208) {
                                var6 -= 2;
                                int var201 = class122.field2154[var6];
                                int var202 = class122.field2154[var6 + 1];
                                class238 var203 = class117.method854((byte) 79, var202);
                                if (var203.method1629(false)) {
                                    class59.field1201[var7++] = class112.method829((byte) -82, var201).method105(-59, var203.field4164, var202);
                                } else {
                                    class122.field2154[var6++] = class112.method829((byte) -82, var201).method92(var203.field4158, -27599, var202);
                                }
                                continue;
                            }
                            if (var472 == 4210) {
                                var7--;
                                class237 var204 = class59.field1201[var7];
                                var6--;
                                int var205 = class122.field2154[var6];
                                class87.method671(var204, var205 == 1, 0);
                                class122.field2154[var6++] = class39.field909;
                                continue;
                            }
                            if (var472 == 4211) {
                                if (class226.field3869 != null && class84.field1571 < class39.field909) {
                                    class122.field2154[var6++] = class272.method1817(class226.field3869[class84.field1571++], 65535);
                                    continue;
                                }
                                class122.field2154[var6++] = -1;
                                continue;
                            }
                            if (var472 == 4212) {
                                class84.field1571 = 0;
                                continue;
                            }
                        } else if (var472 < 4400) {
                            if (var472 == 4300) {
                                var6 -= 2;
                                int var341 = class122.field2154[var6];
                                int var342 = class122.field2154[var6 + 1];
                                class238 var343 = class117.method854((byte) 80, var342);
                                if (var343.method1629(false)) {
                                    class59.field1201[var7++] = class271.method1805(var341, -91).method1536(class38.method384(arg1, -3), var343.field4164, var342);
                                } else {
                                    class122.field2154[var6++] = class271.method1805(var341, -70).method1534(99, var343.field4158, var342);
                                }
                                continue;
                            }
                            if (var472 == 4301) {
                                var6--;
                                int var344 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var344, arg1 - 104).field4003;
                                continue;
                            }
                            if (var472 == 4302) {
                                var6--;
                                int var345 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var345, arg1 - 87).field3972;
                                continue;
                            }
                            if (var472 == 4303) {
                                var6--;
                                int var346 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var346, 123).field3997;
                                continue;
                            }
                            if (var472 == 4304) {
                                var6--;
                                int var347 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var347, 125).field3973;
                                continue;
                            }
                            if (var472 == 4305) {
                                var6--;
                                int var348 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var348, class38.method384(arg1, 113)).field4009;
                                continue;
                            }
                            if (var472 == 4306) {
                                var6--;
                                int var349 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var349, 113).field3965;
                                continue;
                            }
                            if (var472 == 4307) {
                                var6--;
                                int var350 = class122.field2154[var6];
                                class122.field2154[var6++] = class271.method1805(var350, -102).field3994;
                                continue;
                            }
                        } else if (var472 >= 4500) {
                            if (var472 < 4600) {
                                if (var472 == 4500) {
                                    var6 -= 2;
                                    int var206 = class122.field2154[var6];
                                    int var207 = class122.field2154[var6 + 1];
                                    class238 var208 = class117.method854((byte) 74, var207);
                                    if (var208.method1629(false)) {
                                        class59.field1201[var7++] = class94.method701((byte) -72, var206).method611(-128, var208.field4164, var207);
                                    } else {
                                        class122.field2154[var6++] = class94.method701((byte) -72, var206).method607(121, var208.field4158, var207);
                                    }
                                    continue;
                                }
                            } else if (var472 < 5100) {
                                if (var472 == 5000) {
                                    class122.field2154[var6++] = class166.field2936;
                                    continue;
                                }
                                if (var472 == 5001) {
                                    class220.field3800++;
                                    var6 -= 3;
                                    class166.field2936 = class122.field2154[var6];
                                    class224.field3865 = class122.field2154[var6 + 1];
                                    class186.field3263 = class122.field2154[var6 + 2];
                                    class223.field3830.method368(-115, 253);
                                    class223.field3830.method293((byte) 125, class166.field2936);
                                    class223.field3830.method293((byte) 125, class224.field3865);
                                    class223.field3830.method293((byte) 125, class186.field3263);
                                    continue;
                                }
                                if (var472 == 5002) {
                                    var6 -= 2;
                                    var7--;
                                    class237 var209 = class59.field1201[var7];
                                    class41.field915++;
                                    int var210 = class122.field2154[var6];
                                    int var211 = class122.field2154[var6 + 1];
                                    class223.field3830.method368(28, 6);
                                    class223.field3830.method292(118, var209.method1616(0));
                                    class223.field3830.method293((byte) 125, var210 - 1);
                                    class223.field3830.method293((byte) 125, var211);
                                    continue;
                                }
                                if (var472 == 5003) {
                                    var6--;
                                    int var212 = class122.field2154[var6];
                                    class237 var213 = null;
                                    if (var212 < 100) {
                                        var213 = class3.field23[var212];
                                    }
                                    if (var213 == null) {
                                        var213 = class21.field399;
                                    }
                                    class59.field1201[var7++] = var213;
                                    continue;
                                }
                                if (var472 == 5004) {
                                    var6--;
                                    int var214 = class122.field2154[var6];
                                    int var215 = -1;
                                    if (var214 < 100 && class3.field23[var214] != null) {
                                        var215 = class13.field219[var214];
                                    }
                                    class122.field2154[var6++] = var215;
                                    continue;
                                }
                                if (var472 == 5005) {
                                    class122.field2154[var6++] = class224.field3865;
                                    continue;
                                }
                                if (var472 == 5008) {
                                    var7--;
                                    class237 var216 = class59.field1201[var7];
                                    if (var216.method1589(-1, class137.field2379)) {
                                        class20.method201((byte) -114, var216);
                                        continue;
                                    }
                                    if (class64.field1283 == 0 && (class239.field4184 == 1 || class53.field1113 == 1)) {
                                        continue;
                                    }
                                    class237 var217 = var216.method1579(-18896);
                                    byte var218 = 0;
                                    byte var219 = 0;
                                    class126.field2206++;
                                    if (var217.method1589(-1, class275.field4821)) {
                                        var216 = var216.method1610(class275.field4821.method1588(false), 124);
                                        var218 = 0;
                                    } else if (var217.method1589(-1, class211.field3592)) {
                                        var218 = 1;
                                        var216 = var216.method1610(class211.field3592.method1588(false), arg1 + 117);
                                    } else if (var217.method1589(arg1 ^ 0xFFFFFFFD, class80.field1510)) {
                                        var216 = var216.method1610(class80.field1510.method1588(false), 117);
                                        var218 = 2;
                                    } else if (var217.method1589(-1, class74.field1419)) {
                                        var216 = var216.method1610(class74.field1419.method1588(false), arg1 ^ 0x7A);
                                        var218 = 3;
                                    } else if (var217.method1589(-1, class44.field963)) {
                                        var218 = 4;
                                        var216 = var216.method1610(class44.field963.method1588(false), 124);
                                    } else if (var217.method1589(-1, class46.field999)) {
                                        var216 = var216.method1610(class46.field999.method1588(false), arg1 + 122);
                                        var218 = 5;
                                    } else if (var217.method1589(-1, class112.field1961)) {
                                        var218 = 6;
                                        var216 = var216.method1610(class112.field1961.method1588(false), 116);
                                    } else if (var217.method1589(arg1 - 3, class258.field4434)) {
                                        var216 = var216.method1610(class258.field4434.method1588(false), 118);
                                        var218 = 7;
                                    } else if (var217.method1589(arg1 ^ 0xFFFFFFFD, class34.field743)) {
                                        var216 = var216.method1610(class34.field743.method1588(false), 124);
                                        var218 = 8;
                                    } else if (var217.method1589(-1, class186.field3255)) {
                                        var218 = 9;
                                        var216 = var216.method1610(class186.field3255.method1588(false), 126);
                                    } else if (var217.method1589(arg1 ^ 0xFFFFFFFD, class209.field3561)) {
                                        var218 = 10;
                                        var216 = var216.method1610(class209.field3561.method1588(false), 116);
                                    } else if (var217.method1589(-1, class243.field4257)) {
                                        var216 = var216.method1610(class243.field4257.method1588(false), arg1 + 115);
                                        var218 = 11;
                                    } else if (class37.field835 != 0) {
                                        if (var217.method1589(arg1 ^ 0xFFFFFFFD, class275.field4826)) {
                                            var218 = 0;
                                            var216 = var216.method1610(class275.field4826.method1588(false), 117);
                                        } else if (var217.method1589(-1, class211.field3600)) {
                                            var216 = var216.method1610(class211.field3600.method1588(false), 125);
                                            var218 = 1;
                                        } else if (var217.method1589(arg1 - 3, class80.field1498)) {
                                            var216 = var216.method1610(class80.field1498.method1588(false), 116);
                                            var218 = 2;
                                        } else if (var217.method1589(-1, class74.field1423)) {
                                            var216 = var216.method1610(class74.field1423.method1588(false), arg1 ^ 0x7E);
                                            var218 = 3;
                                        } else if (var217.method1589(arg1 - 3, class44.field964)) {
                                            var216 = var216.method1610(class44.field964.method1588(false), 122);
                                            var218 = 4;
                                        } else if (var217.method1589(arg1 - 3, class46.field992)) {
                                            var216 = var216.method1610(class46.field992.method1588(false), arg1 ^ 0x76);
                                            var218 = 5;
                                        } else if (var217.method1589(-1, class112.field1965)) {
                                            var216 = var216.method1610(class112.field1965.method1588(false), 118);
                                            var218 = 6;
                                        } else if (var217.method1589(-1, class258.field4432)) {
                                            var218 = 7;
                                            var216 = var216.method1610(class258.field4432.method1588(false), 116);
                                        } else if (var217.method1589(-1, class34.field722)) {
                                            var216 = var216.method1610(class34.field722.method1588(false), arg1 + 124);
                                            var218 = 8;
                                        } else if (var217.method1589(-1, class186.field3258)) {
                                            var218 = 9;
                                            var216 = var216.method1610(class186.field3258.method1588(false), 118);
                                        } else if (var217.method1589(arg1 - 3, class209.field3558)) {
                                            var216 = var216.method1610(class209.field3558.method1588(false), 118);
                                            var218 = 10;
                                        } else if (var217.method1589(-1, class243.field4269)) {
                                            var218 = 11;
                                            var216 = var216.method1610(class243.field4269.method1588(false), 117);
                                        }
                                    }
                                    class237 var220 = var216.method1579(-18896);
                                    if (var220.method1589(-1, class237.field4138)) {
                                        var219 = 1;
                                        var216 = var216.method1610(class237.field4138.method1588(false), 116);
                                    } else if (var220.method1589(-1, class140.field2404)) {
                                        var216 = var216.method1610(class140.field2404.method1588(false), arg1 ^ 0x76);
                                        var219 = 2;
                                    } else if (var220.method1589(-1, class38.field849)) {
                                        var216 = var216.method1610(class38.field849.method1588(false), 124);
                                        var219 = 3;
                                    } else if (var220.method1589(arg1 - 3, class223.field3841)) {
                                        var219 = 4;
                                        var216 = var216.method1610(class223.field3841.method1588(false), 121);
                                    } else if (var220.method1589(arg1 ^ 0xFFFFFFFD, class153.field2733)) {
                                        var219 = 5;
                                        var216 = var216.method1610(class153.field2733.method1588(false), arg1 + 124);
                                    } else if (class37.field835 != 0) {
                                        if (var220.method1589(-1, class237.field4129)) {
                                            var216 = var216.method1610(class237.field4129.method1588(false), arg1 ^ 0x7E);
                                            var219 = 1;
                                        } else if (var220.method1589(arg1 ^ 0xFFFFFFFD, class140.field2409)) {
                                            var216 = var216.method1610(class140.field2409.method1588(false), 126);
                                            var219 = 2;
                                        } else if (var220.method1589(arg1 ^ 0xFFFFFFFD, class38.field854)) {
                                            var219 = 3;
                                            var216 = var216.method1610(class38.field854.method1588(false), 119);
                                        } else if (var220.method1589(-1, class223.field3836)) {
                                            var216 = var216.method1610(class223.field3836.method1588(false), arg1 + 114);
                                            var219 = 4;
                                        } else if (var220.method1589(-1, class153.field2725)) {
                                            var216 = var216.method1610(class153.field2725.method1588(false), 123);
                                            var219 = 5;
                                        }
                                    }
                                    class223.field3830.method368(arg1 - 15, 111);
                                    class223.field3830.method293((byte) 125, 0);
                                    int var221 = class223.field3830.field647;
                                    class223.field3830.method293((byte) 125, var218);
                                    class223.field3830.method293((byte) 125, var219);
                                    class113.method830(120, class223.field3830, var216);
                                    class223.field3830.method338((byte) -59, class223.field3830.field647 - var221);
                                    continue;
                                }
                                if (var472 == 5009) {
                                    var7 -= 2;
                                    class237 var222 = class59.field1201[var7];
                                    class237 var223 = class59.field1201[var7 + 1];
                                    if (class64.field1283 != 0 || class239.field4184 != 1 && class53.field1113 != 1) {
                                        class233.field4041++;
                                        class223.field3830.method368(arg1 + 70, 136);
                                        class223.field3830.method293((byte) 125, 0);
                                        int var224 = class223.field3830.field647;
                                        class223.field3830.method292(-61, var222.method1616(0));
                                        class113.method830(arg1 + 81, class223.field3830, var223);
                                        class223.field3830.method338((byte) -109, class223.field3830.field647 - var224);
                                    }
                                    continue;
                                }
                                if (var472 == 5010) {
                                    var6--;
                                    int var225 = class122.field2154[var6];
                                    class237 var226 = null;
                                    if (var225 < 100) {
                                        var226 = class143.field2590[var225];
                                    }
                                    if (var226 == null) {
                                        var226 = class21.field399;
                                    }
                                    class59.field1201[var7++] = var226;
                                    continue;
                                }
                                if (var472 == 5011) {
                                    var6--;
                                    int var227 = class122.field2154[var6];
                                    class237 var228 = null;
                                    if (var227 < 100) {
                                        var228 = class27.field488[var227];
                                    }
                                    if (var228 == null) {
                                        var228 = class21.field399;
                                    }
                                    class59.field1201[var7++] = var228;
                                    continue;
                                }
                                if (var472 == 5012) {
                                    var6--;
                                    int var229 = class122.field2154[var6];
                                    int var230 = -1;
                                    if (var229 < 100) {
                                        var230 = class104.field1837[var229];
                                    }
                                    class122.field2154[var6++] = var230;
                                    continue;
                                }
                                if (var472 == 5015) {
                                    class237 var231;
                                    if (class229.field3911 == null || class229.field3911.field4655 == null) {
                                        var231 = class239.field4201;
                                    } else {
                                        var231 = class229.field3911.method1802((byte) -18);
                                    }
                                    class59.field1201[var7++] = var231;
                                    continue;
                                }
                                if (var472 == 5016) {
                                    class122.field2154[var6++] = class186.field3263;
                                    continue;
                                }
                                if (var472 == 5017) {
                                    class122.field2154[var6++] = class110.field1941;
                                    continue;
                                }
                                if (var472 == 5050) {
                                    var6--;
                                    int var232 = class122.field2154[var6];
                                    class59.field1201[var7++] = class166.method1162(false, var232).field1457;
                                    continue;
                                }
                                if (var472 == 5051) {
                                    var6--;
                                    int var233 = class122.field2154[var6];
                                    class78 var234 = class166.method1162(false, var233);
                                    if (var234.field1466 == null) {
                                        class122.field2154[var6++] = 0;
                                    } else {
                                        class122.field2154[var6++] = var234.field1466.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5052) {
                                    var6 -= 2;
                                    int var235 = class122.field2154[var6];
                                    int var236 = class122.field2154[var6 + 1];
                                    class78 var237 = class166.method1162(false, var235);
                                    int var238 = var237.field1466[var236];
                                    class122.field2154[var6++] = var238;
                                    continue;
                                }
                                if (var472 == 5053) {
                                    var6--;
                                    int var239 = class122.field2154[var6];
                                    class78 var240 = class166.method1162(false, var239);
                                    if (var240.field1468 == null) {
                                        class122.field2154[var6++] = 0;
                                    } else {
                                        class122.field2154[var6++] = var240.field1468.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5054) {
                                    var6 -= 2;
                                    int var241 = class122.field2154[var6];
                                    int var242 = class122.field2154[var6 + 1];
                                    class122.field2154[var6++] = class166.method1162(false, var241).field1468[var242];
                                    continue;
                                }
                                if (var472 == 5055) {
                                    var6--;
                                    int var243 = class122.field2154[var6];
                                    class59.field1201[var7++] = class14.method127(var243, -78).method1566((byte) -128);
                                    continue;
                                }
                                if (var472 == 5056) {
                                    var6--;
                                    int var244 = class122.field2154[var6];
                                    class235 var245 = class14.method127(var244, arg1 ^ 0xFFFFFF9D);
                                    if (var245.field4072 == null) {
                                        class122.field2154[var6++] = 0;
                                    } else {
                                        class122.field2154[var6++] = var245.field4072.length;
                                    }
                                    continue;
                                }
                                if (var472 == 5057) {
                                    var6 -= 2;
                                    int var246 = class122.field2154[var6];
                                    int var247 = class122.field2154[var6 + 1];
                                    class122.field2154[var6++] = class14.method127(var246, -118).field4072[var247];
                                    continue;
                                }
                                if (var472 == 5058) {
                                    class166.field2937 = new class189();
                                    var6--;
                                    class166.field2937.field3293 = class122.field2154[var6];
                                    class166.field2937.field3291 = class14.method127(class166.field2937.field3293, arg1 - 129);
                                    class166.field2937.field3299 = new int[class166.field2937.field3291.method1564(0)];
                                    continue;
                                }
                                if (var472 == 5059) {
                                    class223.field3830.method368(-122, 126);
                                    class58.field1187++;
                                    class223.field3830.method293((byte) 125, 0);
                                    int var248 = class223.field3830.field647;
                                    class223.field3830.method293((byte) 125, 0);
                                    class223.field3830.method350((byte) 19, class166.field2937.field3293);
                                    class166.field2937.field3291.method1569(class166.field2937.field3299, arg1 ^ 0x55, class223.field3830);
                                    class223.field3830.method338((byte) -98, class223.field3830.field647 - var248);
                                    continue;
                                }
                                if (var472 == 5060) {
                                    class48.field1026++;
                                    var7--;
                                    class237 var249 = class59.field1201[var7];
                                    class223.field3830.method368(arg1 ^ 0x33, 209);
                                    class223.field3830.method293((byte) 125, 0);
                                    int var250 = class223.field3830.field647;
                                    class223.field3830.method292(arg1 ^ 0x7B, var249.method1616(0));
                                    class223.field3830.method350((byte) 19, class166.field2937.field3293);
                                    class166.field2937.field3291.method1569(class166.field2937.field3299, arg1 + 87, class223.field3830);
                                    class223.field3830.method338((byte) -110, class223.field3830.field647 - var250);
                                    continue;
                                }
                                if (var472 == 5061) {
                                    class223.field3830.method368(arg1 - 127, 126);
                                    class223.field3830.method293((byte) 125, 0);
                                    class58.field1187++;
                                    int var251 = class223.field3830.field647;
                                    class223.field3830.method293((byte) 125, 1);
                                    class223.field3830.method350((byte) 19, class166.field2937.field3293);
                                    class166.field2937.field3291.method1569(class166.field2937.field3299, 93, class223.field3830);
                                    class223.field3830.method338((byte) -74, class223.field3830.field647 - var251);
                                    continue;
                                }
                                if (var472 == 5062) {
                                    var6 -= 2;
                                    int var252 = class122.field2154[var6];
                                    int var253 = class122.field2154[var6 + 1];
                                    class122.field2154[var6++] = class166.method1162(false, var252).field1463[var253];
                                    continue;
                                }
                                if (var472 == 5063) {
                                    var6 -= 2;
                                    int var254 = class122.field2154[var6];
                                    int var255 = class122.field2154[var6 + 1];
                                    class122.field2154[var6++] = class166.method1162(false, var254).field1462[var255];
                                    continue;
                                }
                                if (var472 == 5064) {
                                    var6 -= 2;
                                    int var256 = class122.field2154[var6 + 1];
                                    int var257 = class122.field2154[var6];
                                    if (var256 == -1) {
                                        class122.field2154[var6++] = -1;
                                    } else {
                                        class122.field2154[var6++] = class166.method1162(false, var257).method600(class38.method384(arg1, -114), var256);
                                    }
                                    continue;
                                }
                                if (var472 == 5065) {
                                    var6 -= 2;
                                    int var258 = class122.field2154[var6];
                                    int var259 = class122.field2154[var6 + 1];
                                    if (var259 == -1) {
                                        class122.field2154[var6++] = -1;
                                    } else {
                                        class122.field2154[var6++] = class166.method1162(false, var258).method604(arg1 + 25, var259);
                                    }
                                    continue;
                                }
                                if (var472 == 5066) {
                                    var6--;
                                    int var260 = class122.field2154[var6];
                                    class122.field2154[var6++] = class14.method127(var260, -112).method1564(0);
                                    continue;
                                }
                                if (var472 == 5067) {
                                    var6 -= 2;
                                    int var261 = class122.field2154[var6];
                                    int var262 = class122.field2154[var6 + 1];
                                    int var263 = class14.method127(var261, -87).method1561(var262, -128);
                                    class122.field2154[var6++] = var263;
                                    continue;
                                }
                                if (var472 == 5068) {
                                    var6 -= 2;
                                    int var264 = class122.field2154[var6];
                                    int var265 = class122.field2154[var6 + 1];
                                    class166.field2937.field3299[var264] = var265;
                                    continue;
                                }
                                if (var472 == 5069) {
                                    var6 -= 2;
                                    int var266 = class122.field2154[var6];
                                    int var267 = class122.field2154[var6 + 1];
                                    class166.field2937.field3299[var266] = var267;
                                    continue;
                                }
                                if (var472 == 5070) {
                                    var6 -= 3;
                                    int var268 = class122.field2154[var6];
                                    int var269 = class122.field2154[var6 + 2];
                                    int var270 = class122.field2154[var6 + 1];
                                    class235 var271 = class14.method127(var268, arg1 - 96);
                                    if (var271.method1561(var270, -128) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class122.field2154[var6++] = var271.method1567(101, var269, var270);
                                    continue;
                                }
                            } else if (var472 < 5200) {
                                if (var472 == 5100) {
                                    if (class119.field2083[86]) {
                                        class122.field2154[var6++] = 1;
                                    } else {
                                        class122.field2154[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var472 == 5101) {
                                    if (class119.field2083[82]) {
                                        class122.field2154[var6++] = 1;
                                    } else {
                                        class122.field2154[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var472 == 5102) {
                                    if (class119.field2083[81]) {
                                        class122.field2154[var6++] = 1;
                                    } else {
                                        class122.field2154[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var472 < 5300) {
                                if (var472 == 5200) {
                                    var6--;
                                    class113.method836(4096, class122.field2154[var6]);
                                    continue;
                                }
                                if (var472 == 5201) {
                                    class122.field2154[var6++] = class87.method670(37);
                                    continue;
                                }
                                if (var472 == 5202) {
                                    var6--;
                                    class115.method845((byte) -68, class122.field2154[var6]);
                                    continue;
                                }
                                if (var472 == 5203) {
                                    var7--;
                                    class147.method1001(25288, class59.field1201[var7]);
                                    continue;
                                }
                                if (var472 == 5204) {
                                    class59.field1201[var7 - 1] = class131.method923((byte) 20, class59.field1201[var7 - 1]);
                                    continue;
                                }
                                if (var472 == 5205) {
                                    var7--;
                                    method459(22821, class59.field1201[var7]);
                                    continue;
                                }
                                if (var472 == 5206) {
                                    var6--;
                                    int var272 = class122.field2154[var6];
                                    class224 var273 = class271.method1807(false, (var272 & 0xFFFFA20) >> 14, var272 & 0x3FFF);
                                    if (var273 == null) {
                                        class59.field1201[var7++] = class21.field399;
                                    } else {
                                        class59.field1201[var7++] = var273.field3857;
                                    }
                                    continue;
                                }
                                if (var472 == 5207) {
                                    var7--;
                                    class224 var274 = class79.method608(124, class59.field1201[var7]);
                                    if (var274 != null && var274.field3846 != null) {
                                        class59.field1201[var7++] = var274.field3846;
                                        continue;
                                    }
                                    class59.field1201[var7++] = class21.field399;
                                    continue;
                                }
                            } else if (var472 < 5400) {
                                if (var472 == 5300) {
                                    var6 -= 2;
                                    class122.field2154[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5301) {
                                    continue;
                                }
                                if (var472 == 5302) {
                                    class122.field2154[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5303) {
                                    var6--;
                                    class122.field2154[var6++] = 0;
                                    class122.field2154[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 5305) {
                                    byte var335 = -1;
                                    class122.field2154[var6++] = var335;
                                    continue;
                                }
                                if (var472 == 5306) {
                                    class122.field2154[var6++] = class37.method381(0);
                                    continue;
                                }
                                if (var472 == 5307) {
                                    var6--;
                                    int var336 = class122.field2154[var6];
                                    if (var336 < 0 || var336 > 2) {
                                        var336 = 0;
                                    }
                                    class221.method1471(false, -1, -1, (byte) -45, var336);
                                    continue;
                                }
                                if (var472 == 5308) {
                                    class122.field2154[var6++] = class17.field298;
                                    continue;
                                }
                                if (var472 == 5309) {
                                    var6--;
                                    int var337 = class122.field2154[var6];
                                    if (var337 < 0 || var337 > 2) {
                                        var337 = 0;
                                    }
                                    class17.field298 = var337;
                                    class128.method904(class268.field4572, arg1 - 95);
                                    continue;
                                }
                            } else if (var472 < 5500) {
                                if (var472 == 5400) {
                                    class253.field4354++;
                                    var6--;
                                    int var314 = class122.field2154[var6];
                                    var7 -= 2;
                                    class237 var315 = class59.field1201[var7 + 1];
                                    class237 var316 = class59.field1201[var7];
                                    class223.field3830.method368(42, 146);
                                    class223.field3830.method293((byte) 125, class252.method1708(arg1 ^ 0xB, var316) + class252.method1708(arg1 ^ 0x42, var315) + 1);
                                    class223.field3830.method334(-122, var316);
                                    class223.field3830.method334(-125, var315);
                                    class223.field3830.method293((byte) 125, var314);
                                    continue;
                                }
                                if (var472 == 5401) {
                                    var6 -= 2;
                                    class164.field2923[class122.field2154[var6]] = (short) class44.method421((byte) -119, class122.field2154[var6 + 1]);
                                    class97.method729(false);
                                    class152.method1035((byte) 112);
                                    class24.method218(31645);
                                    class107.method799((byte) 119);
                                    class178.method1233((byte) 122);
                                    continue;
                                }
                                if (var472 == 5405) {
                                    var6 -= 2;
                                    int var317 = class122.field2154[var6 + 1];
                                    int var318 = class122.field2154[var6];
                                    if (var318 >= 0 && var318 < 2) {
                                        class141.field2543[var318] = new int[var317 << 1][4];
                                    }
                                    continue;
                                }
                                if (var472 == 5406) {
                                    var6 -= 7;
                                    int var319 = class122.field2154[var6 + 2];
                                    int var320 = class122.field2154[var6 + 1] << 1;
                                    int var321 = class122.field2154[var6 + 4];
                                    int var322 = class122.field2154[var6 + 3];
                                    int var323 = class122.field2154[var6 + 5];
                                    int var324 = class122.field2154[var6];
                                    int var325 = class122.field2154[var6 + 6];
                                    if (var324 >= 0 && var324 < 2 && class141.field2543[var324] != null && var320 >= 0 && var320 < class141.field2543[var324].length) {
                                        class141.field2543[var324][var320] = new int[] { (class272.method1817(268429729, var319) >> 14) * 128, var322, class272.method1817(16383, var319) * 128, var325 };
                                        class141.field2543[var324][var320 + 1] = new int[] { class272.method1817(var321 >> 14, 16383) * 128, var323, class272.method1817(16383, var321) * 128 };
                                    }
                                    continue;
                                }
                                if (var472 == 5407) {
                                    var6--;
                                    int var326 = class141.field2543[class122.field2154[var6]].length >> 1;
                                    class122.field2154[var6++] = var326;
                                    continue;
                                }
                                if (var472 == 5411) {
                                    if (class43.field946 == null) {
                                        class146.method997(class243.method1680(-3140), false, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var472 == 5419) {
                                    class237 var327 = class21.field399;
                                    if (class208.field3545 != null) {
                                        var327 = class139.method959(false, class208.field3545.field1824);
                                        try {
                                            if (class208.field3545.field1826 != null) {
                                                byte[] var328 = ((String) class208.field3545.field1826).getBytes("ISO-8859-1");
                                                var327 = class97.method723(0, var328.length, (byte) 117, var328);
                                            }
                                        } catch (UnsupportedEncodingException var470) {
                                        }
                                    }
                                    class59.field1201[var7++] = var327;
                                    continue;
                                }
                                if (var472 == 5420) {
                                    class122.field2154[var6++] = class67.field1311 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 5421) {
                                    var7--;
                                    class237 var329 = class59.field1201[var7];
                                    var6--;
                                    boolean var330 = class122.field2154[var6] == 1;
                                    class237 var331 = class238.method1626(new class237[] { class243.method1680(-3140), var329 }, -96);
                                    if (class43.field946 != null || var330 && class67.field1311 != 3 && class67.field1320.startsWith("win") && !class126.field2204) {
                                        class28.field545 = var331;
                                        class39.field882 = var330;
                                        class234.field4066 = class268.field4572.method553(new String(var331.method1578(arg1 - 31323), "ISO-8859-1"), 85);
                                        continue;
                                    }
                                    class146.method997(var331, var330, false);
                                    continue;
                                }
                                if (var472 == 5422) {
                                    var7 -= 2;
                                    class237 var332 = class59.field1201[var7];
                                    class237 var333 = class59.field1201[var7 + 1];
                                    var6--;
                                    int var334 = class122.field2154[var6];
                                    if (var332.method1588(false) > 0) {
                                        if (class139.field2399 == null) {
                                            class139.field2399 = new class237[class264.field4516[class184.field3222]];
                                        }
                                        class139.field2399[var334] = var332;
                                    }
                                    if (var333.method1588(false) > 0) {
                                        if (class90.field1651 == null) {
                                            class90.field1651 = new class237[class264.field4516[class184.field3222]];
                                        }
                                        class90.field1651[var334] = var333;
                                    }
                                    continue;
                                }
                                if (var472 == 5423) {
                                    var7--;
                                    class59.field1201[var7].method1590(false);
                                    continue;
                                }
                            } else if (var472 < 5600) {
                                if (var472 == 5500) {
                                    var6 -= 4;
                                    int var302 = class122.field2154[var6];
                                    int var303 = class122.field2154[var6 + 1];
                                    int var304 = class122.field2154[var6 + 2];
                                    int var305 = class122.field2154[var6 + 3];
                                    class272.method1811(var304, var303, -81, var305, (var302 & 0x3FFF) - class27.field494, false, ((var302 & 0xFFFCC34) >> 14) - class235.field4087);
                                    continue;
                                }
                                if (var472 == 5501) {
                                    var6 -= 4;
                                    int var306 = class122.field2154[var6];
                                    int var307 = class122.field2154[var6 + 1];
                                    int var308 = class122.field2154[var6 + 2];
                                    int var309 = class122.field2154[var6 + 3];
                                    class220.method1465((var306 & 0x3FFF) - class27.field494, ((var306 & 0xFFFE4DC) >> 14) + -class235.field4087, 123, var309, var307, var308);
                                    continue;
                                }
                                if (var472 == 5502) {
                                    var6 -= 6;
                                    int var310 = class122.field2154[var6];
                                    if (var310 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class275.field4827 = var310;
                                    int var311 = class122.field2154[var6 + 1];
                                    if (class141.field2543[class275.field4827].length >> 1 <= var311 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class252.field4339 = 0;
                                    class102.field1808 = var311;
                                    class207.field3537 = class122.field2154[var6 + 2];
                                    class115.field2031 = class122.field2154[var6 + 3];
                                    int var312 = class122.field2154[var6 + 4];
                                    if (var312 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class21.field388 = var312;
                                    int var313 = class122.field2154[var6 + 5];
                                    if (var313 + 1 >= class141.field2543[class21.field388].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class181.field3169 = var313;
                                    class163.field2899 = 3;
                                    continue;
                                }
                                if (var472 == 5503) {
                                    class57.method500(7079);
                                    continue;
                                }
                                if (var472 == 5504) {
                                    var6 -= 2;
                                    class12.field210 = class122.field2154[var6];
                                    class257.field4417 = class122.field2154[var6 + 1];
                                    class189.method1285((byte) -128);
                                    continue;
                                }
                                if (var472 == 5505) {
                                    class122.field2154[var6++] = class12.field210;
                                    continue;
                                }
                                if (var472 == 5506) {
                                    class122.field2154[var6++] = class257.field4417;
                                    continue;
                                }
                            } else if (var472 < 5700) {
                                if (var472 == 5600) {
                                    var7 -= 2;
                                    class237 var275 = class59.field1201[var7];
                                    class237 var276 = class59.field1201[var7 + 1];
                                    var6--;
                                    int var277 = class122.field2154[var6];
                                    if (class264.field4507 == 10 && class63.field1255 == 0 && class12.field211 == 0 && class182.field3203 == 0 && class174.field3055 == 0) {
                                        class29.method272(var275, true, var277, var276);
                                    }
                                    continue;
                                }
                                if (var472 == 5601) {
                                    class56.method494((byte) -128);
                                    continue;
                                }
                                if (var472 == 5602) {
                                    if (class12.field211 == 0) {
                                        class259.field4450 = -2;
                                    }
                                    continue;
                                }
                                if (var472 == 5603) {
                                    var6 -= 4;
                                    if (class264.field4507 == 10 && class63.field1255 == 0 && class12.field211 == 0 && class182.field3203 == 0 && class174.field3055 == 0) {
                                        class272.method1809(class122.field2154[var6 + 3], class122.field2154[var6], class122.field2154[var6 + 2], class122.field2154[var6 + 1], (byte) -45);
                                    }
                                    continue;
                                }
                                if (var472 == 5604) {
                                    var7--;
                                    if (class264.field4507 == 10 && class63.field1255 == 0 && class12.field211 == 0 && class182.field3203 == 0 && class174.field3055 == 0) {
                                        class259.method1746(true, class59.field1201[var7].method1616(0));
                                    }
                                    continue;
                                }
                                if (var472 == 5605) {
                                    var6 -= 4;
                                    var7 -= 2;
                                    if (class264.field4507 == 10 && class63.field1255 == 0 && class12.field211 == 0 && class182.field3203 == 0 && class174.field3055 == 0) {
                                        class240.method1667(class59.field1201[var7 + 1], 128, class122.field2154[var6], class122.field2154[var6 + 3], class59.field1201[var7].method1616(0), class122.field2154[var6 + 1], class122.field2154[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var472 == 5606) {
                                    if (class182.field3203 == 0) {
                                        class45.field974 = -2;
                                    }
                                    continue;
                                }
                                if (var472 == 5607) {
                                    class122.field2154[var6++] = class259.field4450;
                                    continue;
                                }
                                if (var472 == 5608) {
                                    class122.field2154[var6++] = class45.field977;
                                    continue;
                                }
                                if (var472 == 5609) {
                                    class122.field2154[var6++] = class45.field974;
                                    continue;
                                }
                                if (var472 == 5610) {
                                    for (int var278 = 0; var278 < 5; var278++) {
                                        class59.field1201[var7++] = var278 < class227.field3887.length ? class227.field3887[var278].method1581((byte) -94) : class21.field399;
                                    }
                                    class227.field3887 = null;
                                    continue;
                                }
                                if (var472 == 5611) {
                                    class122.field2154[var6++] = class56.field1165;
                                    continue;
                                }
                            } else if (var472 < 6100) {
                                if (var472 == 6001) {
                                    var6--;
                                    int var279 = class122.field2154[var6];
                                    if (var279 < 1) {
                                        var279 = 1;
                                    }
                                    if (var279 > 4) {
                                        var279 = 4;
                                    }
                                    class10.field196 = var279;
                                    if (class10.field196 == 1) {
                                        class150.method1026(0.9F);
                                    }
                                    if (class10.field196 == 2) {
                                        class150.method1026(0.8F);
                                    }
                                    if (class10.field196 == 3) {
                                        class150.method1026(0.7F);
                                    }
                                    if (class10.field196 == 4) {
                                        class150.method1026(0.6F);
                                    }
                                    class152.method1035((byte) -49);
                                    class128.method904(class268.field4572, arg1 ^ 0x31);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6002) {
                                    var6--;
                                    class177.method1226(true, class122.field2154[var6] == 1);
                                    class127.method897(0);
                                    class84.method646(25);
                                    class199.method1357(0);
                                    class128.method904(class268.field4572, arg1 - 115);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6003) {
                                    var6--;
                                    class92.field1662 = class122.field2154[var6] == 1;
                                    class199.method1357(0);
                                    class128.method904(class268.field4572, -41);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6005) {
                                    var6--;
                                    class22.field401 = class122.field2154[var6] == 1;
                                    class84.method646(arg1 ^ 0x1B);
                                    class128.method904(class268.field4572, 125);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6006) {
                                    var6--;
                                    class223.field3837 = class122.field2154[var6] == 1;
                                    ((class7) class150.field2674).method87((byte) -42, !class223.field3837);
                                    class128.method904(class268.field4572, 33);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6007) {
                                    var6--;
                                    class13.field227 = class122.field2154[var6] == 1;
                                    class128.method904(class268.field4572, 127);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6008) {
                                    var6--;
                                    class20.field382 = class122.field2154[var6] == 1;
                                    class128.method904(class268.field4572, arg1 - 88);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6009) {
                                    var6--;
                                    class59.field1207 = class122.field2154[var6] == 1;
                                    class128.method904(class268.field4572, 126);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6010) {
                                    var6--;
                                    class63.field1256 = class122.field2154[var6] == 1;
                                    class128.method904(class268.field4572, -75);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6011) {
                                    var6--;
                                    int var280 = class122.field2154[var6];
                                    if (var280 < 0 || var280 > 2) {
                                        var280 = 0;
                                    }
                                    class91.field1656 = var280;
                                    class128.method904(class268.field4572, arg1 ^ 0xFFFFFFEA);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6012) {
                                    var6--;
                                    class59.field1212 = class122.field2154[var6] == 1;
                                    if (class10.field196 == 1) {
                                        class150.method1026(0.9F);
                                    }
                                    if (class10.field196 == 2) {
                                        class150.method1026(0.8F);
                                    }
                                    if (class10.field196 == 3) {
                                        class150.method1026(0.7F);
                                    }
                                    if (class10.field196 == 4) {
                                        class150.method1026(0.6F);
                                    }
                                    class84.method646(25);
                                    class128.method904(class268.field4572, arg1 + 124);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6014) {
                                    var6--;
                                    class52.field1099 = class122.field2154[var6] == 1;
                                    class128.method904(class268.field4572, -108);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6015) {
                                    var6--;
                                    class238.field4159 = class122.field2154[var6] == 1;
                                    class128.method904(class268.field4572, arg1 ^ 0x7F);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6016) {
                                    var6--;
                                    int var281 = class122.field2154[var6];
                                    if (var281 < 0 || var281 > 2) {
                                        var281 = 0;
                                    }
                                    class122.field2153 = var281;
                                    class128.method904(class268.field4572, -17);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6017) {
                                    var6--;
                                    class141.field2499 = class122.field2154[var6] == 1;
                                    class61.method522(false);
                                    class128.method904(class268.field4572, 126);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6018) {
                                    var6--;
                                    int var282 = class122.field2154[var6];
                                    if (var282 < 0) {
                                        var282 = 0;
                                    }
                                    if (var282 > 127) {
                                        var282 = 127;
                                    }
                                    class78.field1459 = var282;
                                    class128.method904(class268.field4572, arg1 ^ 0x7D);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6019) {
                                    var6--;
                                    int var283 = class122.field2154[var6];
                                    if (var283 < 0) {
                                        var283 = 0;
                                    }
                                    if (var283 > 255) {
                                        var283 = 255;
                                    }
                                    if (class113.field1983 != var283) {
                                        if (class113.field1983 == 0 && class190.field3311 != -1) {
                                            class144.method991(0, false, class190.field3311, var283, class151.field2685, -86);
                                            class140.field2406 = false;
                                        } else if (var283 == 0) {
                                            class55.method483(arg1 + 1);
                                            class140.field2406 = false;
                                        } else {
                                            class114.method839(0, var283);
                                        }
                                        class113.field1983 = var283;
                                    }
                                    class128.method904(class268.field4572, 25);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6020) {
                                    var6--;
                                    int var284 = class122.field2154[var6];
                                    if (var284 < 0) {
                                        var284 = 0;
                                    }
                                    if (var284 > 127) {
                                        var284 = 127;
                                    }
                                    class204.field3497 = var284;
                                    class128.method904(class268.field4572, arg1 + 123);
                                    class117.field2047 = false;
                                    continue;
                                }
                                if (var472 == 6021) {
                                    var6--;
                                    class39.field897 = class122.field2154[var6] == 1;
                                    class199.method1357(arg1 - 2);
                                    continue;
                                }
                            } else if (var472 < 6200) {
                                if (var472 == 6101) {
                                    class122.field2154[var6++] = class10.field196;
                                    continue;
                                }
                                if (var472 == 6102) {
                                    class122.field2154[var6++] = class151.method1033((byte) -108) ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6103) {
                                    class122.field2154[var6++] = class92.field1662 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6105) {
                                    class122.field2154[var6++] = class22.field401 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6106) {
                                    class122.field2154[var6++] = class223.field3837 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6107) {
                                    class122.field2154[var6++] = class13.field227 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6108) {
                                    class122.field2154[var6++] = class20.field382 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6109) {
                                    class122.field2154[var6++] = class59.field1207 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6110) {
                                    class122.field2154[var6++] = class63.field1256 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6111) {
                                    class122.field2154[var6++] = class91.field1656;
                                    continue;
                                }
                                if (var472 == 6112) {
                                    class122.field2154[var6++] = class59.field1212 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6114) {
                                    class122.field2154[var6++] = class52.field1099 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6115) {
                                    class122.field2154[var6++] = class238.field4159 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6116) {
                                    class122.field2154[var6++] = class122.field2153;
                                    continue;
                                }
                                if (var472 == 6117) {
                                    class122.field2154[var6++] = class141.field2499 ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6118) {
                                    class122.field2154[var6++] = class78.field1459;
                                    continue;
                                }
                                if (var472 == 6119) {
                                    class122.field2154[var6++] = class113.field1983;
                                    continue;
                                }
                                if (var472 == 6120) {
                                    class122.field2154[var6++] = class204.field3497;
                                    continue;
                                }
                                if (var472 == 6121) {
                                    class122.field2154[var6++] = 0;
                                    continue;
                                }
                            } else if (var472 < 6300) {
                                if (var472 == 6200) {
                                    var6 -= 2;
                                    class153.field2727 = (short) class122.field2154[var6];
                                    if (class153.field2727 <= 0) {
                                        class153.field2727 = 256;
                                    }
                                    class24.field438 = (short) class122.field2154[var6 + 1];
                                    if (class24.field438 <= 0) {
                                        class24.field438 = 205;
                                    }
                                    continue;
                                }
                                if (var472 == 6201) {
                                    var6 -= 2;
                                    class153.field2726 = (short) class122.field2154[var6];
                                    if (class153.field2726 <= 0) {
                                        class153.field2726 = 256;
                                    }
                                    class273.field4709 = (short) class122.field2154[var6 + 1];
                                    if (class273.field4709 <= 0) {
                                        class273.field4709 = 320;
                                    }
                                    continue;
                                }
                                if (var472 == 6202) {
                                    var6 -= 4;
                                    class37.field828 = (short) class122.field2154[var6];
                                    if (class37.field828 <= 0) {
                                        class37.field828 = 1;
                                    }
                                    class96.field1698 = (short) class122.field2154[var6 + 1];
                                    if (class96.field1698 <= 0) {
                                        class96.field1698 = 32767;
                                    } else if (class37.field828 > class96.field1698) {
                                        class96.field1698 = class37.field828;
                                    }
                                    class175.field3073 = (short) class122.field2154[var6 + 2];
                                    if (class175.field3073 <= 0) {
                                        class175.field3073 = 1;
                                    }
                                    class272.field4694 = (short) class122.field2154[var6 + 3];
                                    if (class272.field4694 <= 0) {
                                        class272.field4694 = 32767;
                                    } else if (class175.field3073 > class272.field4694) {
                                        class272.field4694 = class175.field3073;
                                    }
                                    continue;
                                }
                                if (var472 == 6203) {
                                    class209.method1397(0, false, class262.field4484.field2490, 0, class262.field4484.field2575, -2);
                                    class122.field2154[var6++] = class99.field1770;
                                    class122.field2154[var6++] = class51.field1083;
                                    continue;
                                }
                                if (var472 == 6204) {
                                    class122.field2154[var6++] = class153.field2726;
                                    class122.field2154[var6++] = class273.field4709;
                                    continue;
                                }
                                if (var472 == 6205) {
                                    class122.field2154[var6++] = class153.field2727;
                                    class122.field2154[var6++] = class24.field438;
                                    continue;
                                }
                            } else if (var472 < 6400) {
                                if (var472 == 6300) {
                                    class122.field2154[var6++] = (int) (class181.method1244((byte) -40) / 60000L);
                                    continue;
                                }
                                if (var472 == 6301) {
                                    class122.field2154[var6++] = (int) (class181.method1244((byte) -109) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var472 == 6302) {
                                    var6 -= 3;
                                    int var285 = class122.field2154[var6];
                                    int var286 = class122.field2154[var6 + 1];
                                    int var287 = class122.field2154[var6 + 2];
                                    class148.field2632.clear();
                                    class148.field2632.set(11, 12);
                                    class148.field2632.set(var287, var286, var285);
                                    class122.field2154[var6++] = (int) (class148.field2632.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var472 == 6303) {
                                    class148.field2632.clear();
                                    class148.field2632.setTime(new Date(class181.method1244((byte) -72)));
                                    class122.field2154[var6++] = class148.field2632.get(1);
                                    continue;
                                }
                                if (var472 == 6304) {
                                    var6--;
                                    int var288 = class122.field2154[var6];
                                    boolean var289 = true;
                                    if (var288 < 0) {
                                        var289 = (var288 + 1) % 4 == 0;
                                    } else if (var288 < 1582) {
                                        var289 = var288 % 4 == 0;
                                    } else if (var288 % 4 != 0) {
                                        var289 = false;
                                    } else if (var288 % 100 != 0) {
                                        var289 = true;
                                    } else if (var288 % 400 != 0) {
                                        var289 = false;
                                    }
                                    class122.field2154[var6++] = var289 ? 1 : 0;
                                    continue;
                                }
                            } else if (var472 < 6500) {
                                if (var472 == 6405) {
                                    class122.field2154[var6++] = class182.method1245((byte) -44) ? 1 : 0;
                                    continue;
                                }
                                if (var472 == 6406) {
                                    class122.field2154[var6++] = class26.method237(class38.method384(arg1, 1031585670)) ? 1 : 0;
                                    continue;
                                }
                            } else if (var472 < 6600) {
                                if (var472 == 6500) {
                                    if (class264.field4507 == 10 && class63.field1255 == 0 && class12.field211 == 0 && class182.field3203 == 0) {
                                        class122.field2154[var6++] = class155.method1070(-2) ? 1 : 0;
                                        continue;
                                    }
                                    class122.field2154[var6++] = 1;
                                    continue;
                                }
                                if (var472 == 6501) {
                                    class122 var290 = class114.method838(arg1 ^ 0x22);
                                    if (var290 == null) {
                                        class122.field2154[var6++] = -1;
                                        class122.field2154[var6++] = 0;
                                        class59.field1201[var7++] = class21.field399;
                                        class122.field2154[var6++] = 0;
                                        class59.field1201[var7++] = class21.field399;
                                        class122.field2154[var6++] = 0;
                                    } else {
                                        class122.field2154[var6++] = var290.field2157;
                                        class122.field2154[var6++] = var290.field3134;
                                        class59.field1201[var7++] = var290.field2149;
                                        class27 var291 = var290.method875(true);
                                        class122.field2154[var6++] = var291.field492;
                                        class59.field1201[var7++] = var291.field486;
                                        class122.field2154[var6++] = var290.field3131;
                                    }
                                    continue;
                                }
                                if (var472 == 6502) {
                                    class122 var292 = class258.method1740((byte) -8);
                                    if (var292 == null) {
                                        class122.field2154[var6++] = -1;
                                        class122.field2154[var6++] = 0;
                                        class59.field1201[var7++] = class21.field399;
                                        class122.field2154[var6++] = 0;
                                        class59.field1201[var7++] = class21.field399;
                                        class122.field2154[var6++] = 0;
                                    } else {
                                        class122.field2154[var6++] = var292.field2157;
                                        class122.field2154[var6++] = var292.field3134;
                                        class59.field1201[var7++] = var292.field2149;
                                        class27 var293 = var292.method875(true);
                                        class122.field2154[var6++] = var293.field492;
                                        class59.field1201[var7++] = var293.field486;
                                        class122.field2154[var6++] = var292.field3131;
                                    }
                                    continue;
                                }
                                if (var472 == 6503) {
                                    var6--;
                                    int var294 = class122.field2154[var6];
                                    if (class264.field4507 == 10 && class63.field1255 == 0 && class12.field211 == 0 && class182.field3203 == 0) {
                                        class122.field2154[var6++] = class59.method511(var294, (byte) 121) ? 1 : 0;
                                        continue;
                                    }
                                    class122.field2154[var6++] = 0;
                                    continue;
                                }
                                if (var472 == 6504) {
                                    var6--;
                                    class31.field619 = class122.field2154[var6];
                                    class128.method904(class268.field4572, 125);
                                    continue;
                                }
                                if (var472 == 6505) {
                                    class122.field2154[var6++] = class31.field619;
                                    continue;
                                }
                                if (var472 == 6506) {
                                    var6--;
                                    int var295 = class122.field2154[var6];
                                    class122 var296 = class49.method450((byte) -114, var295);
                                    if (var296 == null) {
                                        class122.field2154[var6++] = -1;
                                        class59.field1201[var7++] = class21.field399;
                                        class122.field2154[var6++] = 0;
                                        class59.field1201[var7++] = class21.field399;
                                        class122.field2154[var6++] = 0;
                                    } else {
                                        class122.field2154[var6++] = var296.field3134;
                                        class59.field1201[var7++] = var296.field2149;
                                        class27 var297 = var296.method875(true);
                                        class122.field2154[var6++] = var297.field492;
                                        class59.field1201[var7++] = var297.field486;
                                        class122.field2154[var6++] = var296.field3131;
                                    }
                                    continue;
                                }
                                if (var472 == 6507) {
                                    var6 -= 4;
                                    boolean var298 = class122.field2154[var6 + 1] == 1;
                                    int var299 = class122.field2154[var6 + 2];
                                    int var300 = class122.field2154[var6];
                                    boolean var301 = class122.field2154[var6 + 3] == 1;
                                    class237.method1587(var300, var298, var301, -62, var299);
                                    continue;
                                }
                            }
                        } else if (var472 == 4400) {
                            var6 -= 2;
                            int var338 = class122.field2154[var6 + 1];
                            int var339 = class122.field2154[var6];
                            class238 var340 = class117.method854((byte) 126, var338);
                            if (var340.method1629(false)) {
                                class59.field1201[var7++] = class94.method700(92, var339).method260(var338, var340.field4164, 99);
                            } else {
                                class122.field2154[var6++] = class94.method700(class38.method384(arg1, 23), var339).method259(var338, var340.field4158, false);
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var471) {
            if (var5.field919 == null) {
                if (class12.field212 != 0) {
                    class175.method1212(class160.field2875, class21.field399, (byte) 116, 0);
                }
                class158.method1123("CS2 - scr:" + var5.field1530 + " op:" + var11, (byte) -122, var471);
            } else {
                class237 var467 = class240.method1666(30, true);
                var467.method1612((byte) -95, class156.field2785).method1612((byte) -112, var5.field919);
                for (int var468 = class130.field2286 - 1; var468 >= 0; var468--) {
                    var467.method1612((byte) -103, class172.field2998).method1612((byte) -113, class147.field2618[var468].field841.field919);
                }
                if (var11 == 40) {
                    int var469 = var10[var9];
                    var467.method1612((byte) -113, class269.field4607).method1612((byte) -111, class14.method130(var469, (byte) 117));
                }
                if (class12.field212 != 0) {
                    class175.method1212(class238.method1626(new class237[] { class49.field1065, var5.field919 }, arg1 - 41), class21.field399, (byte) 117, 0);
                }
                class158.method1123("CS2 - scr:" + var5.field1530 + " op:" + var11 + new String(var467.method1578(-31321)), (byte) -122, var471);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class50(Throwable arg0, String arg1) {
        this.field1074 = arg1;
        this.field1072 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILpj;)V")
    private static final void method459(int arg0, class237 arg1) {
        class142.method982(0);
        class58.method507((byte) 98, arg1);
        field1068++;
        if (arg0 != 22821) {
            method456((byte) -120);
        }
    }
}
