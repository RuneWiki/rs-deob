import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class186 extends class182 {

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    private int field2970 = 0;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    private int field2975 = 1365;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    private int field2982 = 0;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    private int field2984 = 20;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
    public static int[] field2972 = new int[1024];

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "Z")
    public static boolean field2977 = true;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2971;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method1344(byte arg0) {
        field2972 = null;
        if (arg0 <= 19) {
            method1346((byte) -67);
        }
        field2971 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Luk;II)V")
    public static final void method1345(class87 arg0, int arg1, int arg2) {
        class50.field856 = 0;
        ++field2983;
        int var3 = arg1;
        int var4 = 0;
        int var5 = -1;
        int[] var6 = arg0.field1441;
        int[] var7 = arg0.field1444;
        byte var8 = -1;
        try {
            int var9 = 0;
            label4121: while (true) {
                ++var9;
                if (var9 > arg2) {
                    throw new RuntimeException("slow");
                }
                ++var5;
                int var538 = var6[var5];
                if (~var538 > -101) {
                    if (var538 == 0) {
                        class5.field126[var3++] = var7[var5];
                        continue;
                    }
                    if (~var538 == -2) {
                        int var10 = var7[var5];
                        class5.field126[var3++] = class12.field230[var10];
                        continue;
                    }
                    if (~var538 == -3) {
                        int var11 = var7[var5];
                        --var3;
                        class280.method1960((byte) -119, class5.field126[var3], var11);
                        continue;
                    }
                    if (~var538 == -4) {
                        class108.field1763[var4++] = arg0.field1440[var5];
                        continue;
                    }
                    if (var538 == 6) {
                        var5 += var7[var5];
                        continue;
                    }
                    if (~var538 == -8) {
                        var3 -= 2;
                        if (~class5.field126[var3 + 1] != ~class5.field126[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (~var538 == -9) {
                        var3 -= 2;
                        if (class5.field126[var3 + 1] == class5.field126[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (~var538 == -10) {
                        var3 -= 2;
                        if (~class5.field126[var3] > ~class5.field126[var3 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (~var538 == -11) {
                        var3 -= 2;
                        if (~class5.field126[var3] < ~class5.field126[var3 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var538 == 21) {
                        if (class50.field856 == 0) {
                            return;
                        }
                        class10 var12 = class181.field2885[--class50.field856];
                        class41.field607 = var12.field186;
                        arg0 = var12.field187;
                        var7 = arg0.field1444;
                        class162.field2630 = var12.field188;
                        var5 = var12.field185;
                        var6 = arg0.field1441;
                        continue;
                    }
                    if (var538 == 25) {
                        int var13 = var7[var5];
                        class5.field126[var3++] = class313.method2120((byte) -126, var13);
                        continue;
                    }
                    if (~var538 == -28) {
                        int var14 = var7[var5];
                        --var3;
                        class311.method2097(var14, class5.field126[var3], arg1 ^ -4);
                        continue;
                    }
                    if (var538 == 31) {
                        var3 -= 2;
                        if (~class5.field126[var3 - -1] <= ~class5.field126[var3]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (~var538 == -33) {
                        var3 -= 2;
                        if (class5.field126[var3] >= class5.field126[var3 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (~var538 == -34) {
                        class5.field126[var3++] = class41.field607[var7[var5]];
                        continue;
                    }
                    int var10001;
                    if (~var538 == -35) {
                        var10001 = var7[var5];
                        --var3;
                        class41.field607[var10001] = class5.field126[var3];
                        continue;
                    }
                    if (var538 == 35) {
                        class108.field1763[var4++] = class162.field2630[var7[var5]];
                        continue;
                    }
                    if (var538 == 36) {
                        var10001 = var7[var5];
                        --var4;
                        class162.field2630[var10001] = class108.field1763[var4];
                        continue;
                    }
                    if (~var538 == -38) {
                        int var15 = var7[var5];
                        var4 -= var15;
                        String var16 = class225.method1595(class108.field1763, var15, var4, 4);
                        class108.field1763[var4++] = var16;
                        continue;
                    }
                    if (~var538 == -39) {
                        --var3;
                        continue;
                    }
                    if (~var538 == -40) {
                        --var4;
                        continue;
                    }
                    if (var538 == 40) {
                        int var17 = var7[var5];
                        class87 var18 = class300.method2053(arg1 ^ -23029, var17);
                        int[] var19 = new int[var18.field1451];
                        String[] var20 = new String[var18.field1446];
                        for (int var21 = 0; var18.field1432 > var21; ++var21) {
                            var19[var21] = class5.field126[var3 - var18.field1432 + var21];
                        }
                        for (int var22 = 0; ~var18.field1439 < ~var22; ++var22) {
                            var20[var22] = class108.field1763[-var18.field1439 + var4 + var22];
                        }
                        var3 -= var18.field1432;
                        var4 -= var18.field1439;
                        class10 var23 = new class10();
                        var23.field186 = class41.field607;
                        var23.field187 = arg0;
                        var23.field188 = class162.field2630;
                        var23.field185 = var5;
                        if (~class181.field2885.length >= ~class50.field856) {
                            throw new RuntimeException();
                        }
                        class181.field2885[class50.field856++] = var23;
                        class162.field2630 = var20;
                        var5 = -1;
                        class41.field607 = var19;
                        arg0 = var18;
                        var7 = var18.field1444;
                        var6 = var18.field1441;
                        continue;
                    }
                    if (~var538 == -43) {
                        class5.field126[var3++] = class12.field234[var7[var5]];
                        continue;
                    }
                    if (var538 == 43) {
                        int var24 = var7[var5];
                        --var3;
                        class12.field234[var24] = class5.field126[var3];
                        class313.method2124(1, var24);
                        continue;
                    }
                    if (~var538 == -45) {
                        int var25 = var7[var5] >> 16;
                        int var26 = 65535 & var7[var5];
                        --var3;
                        int var27 = class5.field126[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            class95.field1545[var25] = var27;
                            byte var28 = -1;
                            if (var26 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var27) {
                                    continue label4121;
                                }
                                class179.field2868[var25][var29] = var28;
                                ++var29;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (~var538 == -46) {
                        int var30 = var7[var5];
                        --var3;
                        int var31 = class5.field126[var3];
                        if (~var31 <= -1 && var31 < class95.field1545[var30]) {
                            class5.field126[var3++] = class179.field2868[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (~var538 == -47) {
                        var3 -= 2;
                        int var32 = var7[var5];
                        int var33 = class5.field126[var3];
                        if (var33 >= 0 && ~class95.field1545[var32] < ~var33) {
                            class179.field2868[var32][var33] = class5.field126[var3 - -1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 47) {
                        String var34 = class93.field1525[var7[var5]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class108.field1763[var4++] = var34;
                        continue;
                    }
                    if (var538 == 48) {
                        int var35 = var7[var5];
                        --var4;
                        class93.field1525[var35] = class108.field1763[var4];
                        class4.method35(arg1 ^ 54, var35);
                        continue;
                    }
                    if (~var538 == -52) {
                        class132 var36 = arg0.field1438[var7[var5]];
                        --var3;
                        class113 var37 = (class113) var36.method987(-112, (long) class5.field126[var3]);
                        if (var37 != null) {
                            var5 += var37.field1929;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (~var7[var5] == -2) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                int var10000;
                if (var538 < 300) {
                    if (var538 == 100) {
                        var3 -= 3;
                        int var39 = class5.field126[var3];
                        int var40 = class5.field126[var3 + 1];
                        int var41 = class5.field126[var3 + 2];
                        if (var40 == 0) {
                            throw new RuntimeException();
                        }
                        class207 var42 = class222.method1574(117, var39);
                        if (var42.field3462 == null) {
                            var42.field3462 = new class207[var41 + 1];
                        }
                        if (~var42.field3462.length >= ~var41) {
                            class207[] var43 = new class207[var41 - -1];
                            for (int var44 = 0; var44 < var42.field3462.length; ++var44) {
                                var43[var44] = var42.field3462[var44];
                            }
                            var42.field3462 = var43;
                        }
                        if (~var41 < -1 && var42.field3462[var41 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var41 + -1));
                        }
                        class207 var45 = new class207();
                        var45.field3446 = true;
                        var45.field3465 = var45.field3405 = var42.field3405;
                        var45.field3376 = var40;
                        var45.field3369 = var41;
                        var42.field3462[var41] = var45;
                        if (var38) {
                            class143.field2358 = var45;
                        } else {
                            class272.field4543 = var45;
                        }
                        class206.method1441(arg1, var42);
                        continue;
                    }
                    if (var538 == 101) {
                        class207 var46 = !var38 ? class272.field4543 : class143.field2358;
                        if (var46.field3369 == -1) {
                            if (!var38) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class207 var47 = class222.method1574(125, var46.field3405);
                        var47.field3462[var46.field3369] = null;
                        class206.method1441(0, var47);
                        continue;
                    }
                    if (var538 == 102) {
                        var10000 = arg1 + 116;
                        --var3;
                        class207 var48 = class222.method1574(var10000, class5.field126[var3]);
                        var48.field3462 = null;
                        class206.method1441(0, var48);
                        continue;
                    }
                    if (var538 == 200) {
                        var3 -= 2;
                        int var49 = class5.field126[var3 + 1];
                        int var50 = class5.field126[var3];
                        class207 var51 = class107.method798(var50, var49, (byte) -71);
                        if (var51 != null && ~var49 != 0) {
                            class5.field126[var3++] = 1;
                            if (!var38) {
                                class272.field4543 = var51;
                            } else {
                                class143.field2358 = var51;
                            }
                            continue;
                        }
                        class5.field126[var3++] = 0;
                        continue;
                    }
                    if (var538 == 201) {
                        --var3;
                        int var52 = class5.field126[var3];
                        class207 var53 = class222.method1574(112, var52);
                        if (var53 != null) {
                            class5.field126[var3++] = 1;
                            if (var38) {
                                class143.field2358 = var53;
                            } else {
                                class272.field4543 = var53;
                            }
                        } else {
                            class5.field126[var3++] = 0;
                        }
                        continue;
                    }
                } else if (var538 < 500) {
                    if (var538 == 403) {
                        var3 -= 2;
                        int var54 = class5.field126[var3];
                        int var55 = class5.field126[var3 + 1];
                        for (int var56 = 0; ~var56 > ~class268.field4463.length; ++var56) {
                            if (~class268.field4463[var56] == ~var54) {
                                class16.field314.field2081.method1975(var55, 127, var56);
                                continue label4121;
                            }
                        }
                        int var57 = 0;
                        while (true) {
                            if (~var57 <= ~class158.field2585.length) {
                                continue label4121;
                            }
                            if (~class158.field2585[var57] == ~var54) {
                                class16.field314.field2081.method1975(var55, arg1 + 121, var57);
                                continue label4121;
                            }
                            ++var57;
                        }
                    }
                    if (var538 == 404) {
                        var3 -= 2;
                        int var58 = class5.field126[var3 - -1];
                        int var59 = class5.field126[var3];
                        class16.field314.field2081.method1982(var59, var58, 100);
                        continue;
                    }
                    if (~var538 == -411) {
                        --var3;
                        boolean var60 = ~class5.field126[var3] != -1;
                        class16.field314.field2081.method1978((byte) 32, var60);
                        continue;
                    }
                } else if (var538 >= 1000 && var538 < 1100 || ~var538 <= -2001 && ~var538 > -2101) {
                    class207 var61;
                    if (~var538 > -2001) {
                        var61 = var38 ? class143.field2358 : class272.field4543;
                    } else {
                        var538 -= 1000;
                        --var3;
                        var61 = class222.method1574(115, class5.field126[var3]);
                    }
                    if (var538 == 1000) {
                        var3 -= 4;
                        var61.field3338 = class5.field126[var3];
                        var61.field3506 = class5.field126[var3 + 1];
                        int var62 = class5.field126[var3 + 2];
                        if (var62 >= 0) {
                            if (~var62 < -6) {
                                var62 = 5;
                            }
                        } else {
                            var62 = 0;
                        }
                        int var63 = class5.field126[var3 + 3];
                        var61.field3417 = (byte) var62;
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        var61.field3510 = (byte) var63;
                        class206.method1441(arg1, var61);
                        class118.method894(true, var61);
                        if (~var61.field3369 == 0) {
                            class238.method1705(var61.field3405, -14617);
                        }
                        continue;
                    }
                    if (~var538 == -1002) {
                        var3 -= 4;
                        var61.field3480 = class5.field126[var3];
                        var61.field3386 = class5.field126[var3 + 1];
                        var61.field3411 = 0;
                        var61.field3332 = 0;
                        int var64 = class5.field126[var3 - -3];
                        if (~var64 <= -1) {
                            if (~var64 < -5) {
                                var64 = 4;
                            }
                        } else {
                            var64 = 0;
                        }
                        int var65 = class5.field126[var3 + 2];
                        if (var65 >= 0) {
                            if (~var65 < -5) {
                                var65 = 4;
                            }
                        } else {
                            var65 = 0;
                        }
                        var61.field3373 = (byte) var64;
                        var61.field3345 = (byte) var65;
                        class206.method1441(arg1, var61);
                        class118.method894(true, var61);
                        if (~var61.field3376 == -1) {
                            class26.method168(var61, 0, false);
                        }
                        continue;
                    }
                    if (~var538 == -1004) {
                        --var3;
                        boolean var66 = class5.field126[var3] == 1;
                        if (!var61.field3487 == var66) {
                            var61.field3487 = var66;
                            class206.method1441(0, var61);
                        }
                        if (~var61.field3369 == 0) {
                            class120.method906(var61.field3405, (byte) 89);
                        }
                        continue;
                    }
                    if (var538 == 1004) {
                        var3 -= 2;
                        var61.field3404 = class5.field126[var3];
                        var61.field3490 = class5.field126[var3 + 1];
                        class206.method1441(0, var61);
                        class118.method894(true, var61);
                        if (~var61.field3376 == -1) {
                            class26.method168(var61, 0, false);
                        }
                        continue;
                    }
                    if (~var538 == -1006) {
                        --var3;
                        var61.field3335 = class5.field126[var3] == 1;
                        continue;
                    }
                } else if (var538 >= 1100 && ~var538 > -1201 || var538 >= 2100 && ~var538 > -2201) {
                    class207 var528;
                    if (var538 < 2000) {
                        var528 = !var38 ? class272.field4543 : class143.field2358;
                    } else {
                        var538 -= 1000;
                        --var3;
                        var528 = class222.method1574(118, class5.field126[var3]);
                    }
                    if (~var538 == -1101) {
                        var3 -= 2;
                        var528.field3450 = class5.field126[var3];
                        if (var528.field3450 > var528.field3416 - var528.field3484) {
                            var528.field3450 = -var528.field3484 + var528.field3416;
                        }
                        if (~var528.field3450 > -1) {
                            var528.field3450 = 0;
                        }
                        var528.field3374 = class5.field126[var3 + 1];
                        if (var528.field3374 > -var528.field3481 + var528.field3344) {
                            var528.field3374 = var528.field3344 - var528.field3481;
                        }
                        if (var528.field3374 < 0) {
                            var528.field3374 = 0;
                        }
                        class206.method1441(0, var528);
                        if (var528.field3369 == -1) {
                            class21.method137(4, var528.field3405);
                        }
                        continue;
                    }
                    if (var538 == 1101) {
                        --var3;
                        var528.field3403 = class5.field126[var3];
                        class206.method1441(arg1, var528);
                        if (~var528.field3369 == 0) {
                            class197.method1404(var528.field3405, -22592);
                        }
                        continue;
                    }
                    if (var538 == 1102) {
                        --var3;
                        var528.field3358 = ~class5.field126[var3] == -2;
                        class206.method1441(arg1, var528);
                        continue;
                    }
                    if (var538 == 1103) {
                        --var3;
                        var528.field3355 = class5.field126[var3];
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1104) {
                        --var3;
                        var528.field3348 = class5.field126[var3];
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1105) {
                        --var3;
                        int var529 = class5.field126[var3];
                        if (~var528.field3432 != ~var529) {
                            var528.field3432 = var529;
                            class206.method1441(0, var528);
                        }
                        if (~var528.field3369 == 0) {
                            class70.method479((byte) -60, var528.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1107) {
                        --var3;
                        var528.field3388 = class5.field126[var3];
                        class206.method1441(arg1, var528);
                        continue;
                    }
                    if (var538 == 1107) {
                        --var3;
                        var528.field3406 = class5.field126[var3] == 1;
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1108) {
                        var528.field3393 = 1;
                        --var3;
                        var528.field3381 = class5.field126[var3];
                        class206.method1441(0, var528);
                        if (var528.field3369 == -1) {
                            class51.method329((byte) -37, var528.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1110) {
                        var3 -= 6;
                        var528.field3429 = class5.field126[var3];
                        var528.field3372 = class5.field126[var3 + 1];
                        var528.field3370 = class5.field126[var3 + 2];
                        var528.field3366 = class5.field126[var3 + 3];
                        var528.field3387 = class5.field126[var3 + 4];
                        var528.field3352 = class5.field126[var3 + 5];
                        class206.method1441(arg1, var528);
                        if (~var528.field3369 == 0) {
                            class279.method1949(var528.field3405, -50);
                            class70.method485((byte) 111, var528.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1111) {
                        --var3;
                        int var530 = class5.field126[var3];
                        if (var528.field3501 != var530) {
                            var528.field3365 = 0;
                            var528.field3445 = 1;
                            var528.field3501 = var530;
                            var528.field3512 = 0;
                            class206.method1441(0, var528);
                        }
                        if (~var528.field3369 == 0) {
                            class183.method1332((byte) 126, var528.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1112) {
                        --var3;
                        var528.field3342 = class5.field126[var3] == 1;
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1112) {
                        --var4;
                        String var531 = class108.field1763[var4];
                        if (!var531.equals(var528.field3346)) {
                            var528.field3346 = var531;
                            class206.method1441(0, var528);
                        }
                        if (~var528.field3369 == 0) {
                            class19.method121((byte) 125, var528.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1114) {
                        --var3;
                        var528.field3452 = class5.field126[var3];
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1114) {
                        var3 -= 3;
                        var528.field3456 = class5.field126[var3];
                        var528.field3409 = class5.field126[var3 + 1];
                        var528.field3431 = class5.field126[var3 + 2];
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1115) {
                        --var3;
                        var528.field3378 = class5.field126[var3] == 1;
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1116) {
                        --var3;
                        var528.field3500 = class5.field126[var3];
                        class206.method1441(arg1, var528);
                        continue;
                    }
                    if (~var538 == -1118) {
                        --var3;
                        var528.field3362 = class5.field126[var3];
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (~var538 == -1119) {
                        --var3;
                        var528.field3440 = class5.field126[var3] == 1;
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (~var538 == -1120) {
                        --var3;
                        var528.field3474 = class5.field126[var3] == 1;
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (~var538 == -1121) {
                        var3 -= 2;
                        var528.field3416 = class5.field126[var3];
                        var528.field3344 = class5.field126[var3 + 1];
                        class206.method1441(0, var528);
                        if (var528.field3376 == 0) {
                            class26.method168(var528, 0, false);
                        }
                        continue;
                    }
                    if (var538 == 1121) {
                        var3 -= 2;
                        class206.method1441(arg1, var528);
                        continue;
                    }
                    if (var538 == 1122) {
                        --var3;
                        var528.field3371 = class5.field126[var3] == 1;
                        class206.method1441(0, var528);
                        continue;
                    }
                    if (var538 == 1123) {
                        --var3;
                        var528.field3352 = class5.field126[var3];
                        class206.method1441(0, var528);
                        if (~var528.field3369 == 0) {
                            class279.method1949(var528.field3405, arg1 ^ -121);
                        }
                        continue;
                    }
                    if (~var538 == -1125) {
                        --var3;
                        int var532 = class5.field126[var3];
                        var528.field3467 = ~var532 == -2;
                        class206.method1441(0, var528);
                        continue;
                    }
                } else if (var538 >= 1200 && var538 < 1300 || ~var538 <= -2201 && ~var538 > -2301) {
                    class207 var524;
                    if (~var538 > -2001) {
                        var524 = var38 ? class143.field2358 : class272.field4543;
                    } else {
                        var538 -= 1000;
                        --var3;
                        var524 = class222.method1574(118, class5.field126[var3]);
                    }
                    class206.method1441(0, var524);
                    if (~var538 == -1201 || var538 == 1205 || ~var538 == -1209 || var538 == 1209) {
                        var3 -= 2;
                        int var525 = class5.field126[var3];
                        int var526 = class5.field126[var3 + 1];
                        if (~var524.field3369 == 0) {
                            class298.method2043(var524.field3405, arg1 + Integer.MAX_VALUE);
                            class279.method1949(var524.field3405, -84);
                            class70.method485((byte) 111, var524.field3405);
                        }
                        if (var525 == -1) {
                            var524.field3393 = 1;
                            var524.field3381 = -1;
                            var524.field3454 = -1;
                            continue;
                        }
                        var524.field3434 = var526;
                        if (~var538 != -1209 && ~var538 != -1210) {
                            var524.field3499 = false;
                        } else {
                            var524.field3499 = true;
                        }
                        var524.field3454 = var525;
                        class71 var527 = class13.method75(false, var525);
                        var524.field3366 = var527.field1226;
                        var524.field3429 = var527.field1202;
                        var524.field3372 = var527.field1208;
                        var524.field3352 = var527.field1231;
                        var524.field3387 = var527.field1182;
                        var524.field3370 = var527.field1251;
                        if (var538 != 1205) {
                            var524.field3408 = true;
                        } else {
                            var524.field3408 = false;
                        }
                        if (~var524.field3332 >= -1) {
                            if (var524.field3480 > 0) {
                                var524.field3352 = var524.field3352 * 32 / var524.field3480;
                            }
                        } else {
                            var524.field3352 = var524.field3352 * 32 / var524.field3332;
                        }
                        continue;
                    }
                    if (~var538 == -1202) {
                        var524.field3393 = 2;
                        --var3;
                        var524.field3381 = class5.field126[var3];
                        if (var524.field3369 == -1) {
                            class51.method329((byte) -37, var524.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1203) {
                        var524.field3393 = 3;
                        var524.field3381 = class16.field314.field2081.method1985((byte) -120);
                        if (var524.field3369 == -1) {
                            class51.method329((byte) -37, var524.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1204) {
                        var524.field3393 = 6;
                        --var3;
                        var524.field3381 = class5.field126[var3];
                        if (var524.field3369 == -1) {
                            class51.method329((byte) -37, var524.field3405);
                        }
                        continue;
                    }
                    if (var538 == 1204) {
                        var524.field3393 = 5;
                        --var3;
                        var524.field3381 = class5.field126[var3];
                        if (var524.field3369 == -1) {
                            class51.method329((byte) -37, var524.field3405);
                        }
                        continue;
                    }
                    if (~var538 == -1207) {
                        var3 -= 4;
                        var524.field3398 = class5.field126[var3];
                        var524.field3347 = class5.field126[var3 + 1];
                        var524.field3497 = class5.field126[var3 + 2];
                        var524.field3443 = class5.field126[var3 + 3];
                        class206.method1441(0, var524);
                        continue;
                    }
                    if (~var538 == -1208) {
                        var3 -= 2;
                        var524.field3353 = class5.field126[var3];
                        var524.field3511 = class5.field126[var3 - -1];
                        class206.method1441(0, var524);
                        continue;
                    }
                    if (~var538 == -1212) {
                        var524.field3393 = 5;
                        var524.field3453 = 0;
                        var524.field3381 = 2047;
                        if (~var524.field3369 == 0) {
                            class51.method329((byte) -37, var524.field3405);
                        }
                        continue;
                    }
                } else if (var538 >= 1300 && var538 < 1400 || ~var538 <= -2301 && var538 < 2400) {
                    class207 var518;
                    if (~var538 > -2001) {
                        var518 = !var38 ? class272.field4543 : class143.field2358;
                    } else {
                        --var3;
                        var518 = class222.method1574(116, class5.field126[var3]);
                        var538 -= 1000;
                    }
                    if (~var538 == -1301) {
                        --var3;
                        int var519 = class5.field126[var3] + -1;
                        if (~var519 <= -1 && var519 <= 9) {
                            --var4;
                            var518.method1456((byte) 111, var519, class108.field1763[var4]);
                            continue;
                        }
                        --var4;
                        continue;
                    }
                    if (~var538 == -1302) {
                        var3 -= 2;
                        int var520 = class5.field126[var3];
                        int var521 = class5.field126[var3 + 1];
                        var518.field3402 = class107.method798(var520, var521, (byte) -71);
                        continue;
                    }
                    if (~var538 == -1303) {
                        --var3;
                        var518.field3420 = ~class5.field126[var3] == -2;
                        continue;
                    }
                    if (~var538 == -1304) {
                        --var3;
                        var518.field3479 = class5.field126[var3];
                        continue;
                    }
                    if (~var538 == -1305) {
                        --var3;
                        var518.field3498 = class5.field126[var3];
                        continue;
                    }
                    if (var538 == 1305) {
                        --var4;
                        var518.field3399 = class108.field1763[var4];
                        continue;
                    }
                    if (~var538 == -1307) {
                        --var4;
                        var518.field3437 = class108.field1763[var4];
                        continue;
                    }
                    if (var538 == 1307) {
                        var518.field3507 = null;
                        continue;
                    }
                    if (var538 == 1308) {
                        --var3;
                        var518.field3447 = class5.field126[var3];
                        --var3;
                        var518.field3458 = class5.field126[var3];
                        continue;
                    }
                    if (~var538 == -1310) {
                        --var3;
                        int var522 = class5.field126[var3];
                        --var3;
                        int var523 = class5.field126[var3];
                        if (~var523 <= -2 && ~var523 >= -11) {
                            var518.method1443(var522, var523 - 1, (byte) -43);
                        }
                        continue;
                    }
                    if (var538 == 1310) {
                        --var4;
                        var518.field3476 = class108.field1763[var4];
                        continue;
                    }
                } else {
                    if (~var538 <= -1401 && var538 < 1500 || var538 >= 2400 && ~var538 > -2501) {
                        class207 var67;
                        if (var538 >= 2000) {
                            var538 -= 1000;
                            --var3;
                            var67 = class222.method1574(112, class5.field126[var3]);
                        } else {
                            var67 = var38 ? class143.field2358 : class272.field4543;
                        }
                        int[] var68 = null;
                        --var4;
                        String var69 = class108.field1763[var4];
                        if (var69.length() > 0 && var69.charAt(-1 + var69.length()) == 'Y') {
                            --var3;
                            int var70 = class5.field126[var3];
                            if (~var70 < -1) {
                                var68 = new int[var70];
                                while (var70-- > 0) {
                                    --var3;
                                    var68[var70] = class5.field126[var3];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var71 = new Object[1 + var69.length()];
                        for (int var72 = var71.length + -1; ~var72 <= -2; --var72) {
                            if (var69.charAt(var72 + -1) == 's') {
                                --var4;
                                var71[var72] = class108.field1763[var4];
                            } else {
                                --var3;
                                var71[var72] = new Integer(class5.field126[var3]);
                            }
                        }
                        --var3;
                        int var73 = class5.field126[var3];
                        if (~var73 == 0) {
                            var71 = null;
                        } else {
                            var71[0] = new Integer(var73);
                        }
                        if (var538 == 1400) {
                            var67.field3418 = var71;
                        } else if (var538 != 1401) {
                            if (var538 != 1402) {
                                if (var538 != 1403) {
                                    if (var538 != 1404) {
                                        if (~var538 == -1406) {
                                            var67.field3400 = var71;
                                        } else if (~var538 == -1407) {
                                            var67.field3383 = var71;
                                        } else if (~var538 != -1408) {
                                            if (~var538 == -1409) {
                                                var67.field3379 = var71;
                                            } else if (var538 == 1409) {
                                                var67.field3391 = var71;
                                            } else if (~var538 == -1411) {
                                                var67.field3441 = var71;
                                            } else if (~var538 == -1412) {
                                                var67.field3485 = var71;
                                            } else if (var538 == 1412) {
                                                var67.field3470 = var71;
                                            } else if (~var538 == -1415) {
                                                var67.field3435 = var68;
                                                var67.field3494 = var71;
                                            } else if (var538 == 1415) {
                                                var67.field3473 = var68;
                                                var67.field3339 = var71;
                                            } else if (var538 == 1416) {
                                                var67.field3356 = var71;
                                            } else if (var538 == 1417) {
                                                var67.field3414 = var71;
                                            } else if (var538 == 1418) {
                                                var67.field3488 = var71;
                                            } else if (~var538 != -1420) {
                                                if (~var538 != -1421) {
                                                    if (~var538 != -1422) {
                                                        if (~var538 != -1423) {
                                                            if (~var538 == -1424) {
                                                                var67.field3438 = var71;
                                                            } else if (var538 != 1424) {
                                                                if (~var538 == -1426) {
                                                                    var67.field3413 = var71;
                                                                } else if (~var538 != -1427) {
                                                                    if (var538 == 1427) {
                                                                        var67.field3422 = var71;
                                                                    } else if (var538 != 1428) {
                                                                        if (var538 == 1429) {
                                                                            var67.field3364 = var68;
                                                                            var67.field3449 = var71;
                                                                        }
                                                                    } else {
                                                                        var67.field3423 = var68;
                                                                        var67.field3375 = var71;
                                                                    }
                                                                } else {
                                                                    var67.field3492 = var71;
                                                                }
                                                            } else {
                                                                var67.field3427 = var71;
                                                            }
                                                        } else {
                                                            var67.field3491 = var71;
                                                        }
                                                    } else {
                                                        var67.field3502 = var71;
                                                    }
                                                } else {
                                                    var67.field3460 = var71;
                                                }
                                            } else {
                                                var67.field3496 = var71;
                                            }
                                        } else {
                                            var67.field3397 = var68;
                                            var67.field3382 = var71;
                                        }
                                    } else {
                                        var67.field3333 = var71;
                                    }
                                } else {
                                    var67.field3486 = var71;
                                }
                            } else {
                                var67.field3380 = var71;
                            }
                        } else {
                            var67.field3419 = var71;
                        }
                        var67.field3444 = true;
                        continue;
                    }
                    if (~var538 <= -1601) {
                        if (~var538 > -1701) {
                            class207 var74 = !var38 ? class272.field4543 : class143.field2358;
                            if (var538 == 1600) {
                                class5.field126[var3++] = var74.field3450;
                                continue;
                            }
                            if (~var538 == -1602) {
                                class5.field126[var3++] = var74.field3374;
                                continue;
                            }
                            if (var538 == 1602) {
                                class108.field1763[var4++] = var74.field3346;
                                continue;
                            }
                            if (~var538 == -1604) {
                                class5.field126[var3++] = var74.field3416;
                                continue;
                            }
                            if (var538 == 1604) {
                                class5.field126[var3++] = var74.field3344;
                                continue;
                            }
                            if (~var538 == -1606) {
                                class5.field126[var3++] = var74.field3352;
                                continue;
                            }
                            if (~var538 == -1607) {
                                class5.field126[var3++] = var74.field3370;
                                continue;
                            }
                            if (var538 == 1607) {
                                class5.field126[var3++] = var74.field3387;
                                continue;
                            }
                            if (~var538 == -1609) {
                                class5.field126[var3++] = var74.field3366;
                                continue;
                            }
                            if (var538 == 1609) {
                                class5.field126[var3++] = var74.field3355;
                                continue;
                            }
                            if (var538 == 1610) {
                                class5.field126[var3++] = var74.field3429;
                                continue;
                            }
                            if (var538 == 1611) {
                                class5.field126[var3++] = var74.field3372;
                                continue;
                            }
                            if (~var538 == -1613) {
                                class5.field126[var3++] = var74.field3432;
                                continue;
                            }
                        } else if (~var538 <= -1801) {
                            if (var538 < 1900) {
                                class207 var75 = var38 ? class143.field2358 : class272.field4543;
                                if (~var538 == -1801) {
                                    class5.field126[var3++] = client.method732(var75).method126((byte) -128);
                                    continue;
                                }
                                if (~var538 == -1802) {
                                    --var3;
                                    int var76 = class5.field126[var3];
                                    int var539 = var76 - 1;
                                    if (var75.field3507 != null && ~var75.field3507.length < ~var539 && var75.field3507[var539] != null) {
                                        class108.field1763[var4++] = var75.field3507[var539];
                                        continue;
                                    }
                                    class108.field1763[var4++] = "";
                                    continue;
                                }
                                if (var538 == 1802) {
                                    if (var75.field3399 != null) {
                                        class108.field1763[var4++] = var75.field3399;
                                    } else {
                                        class108.field1763[var4++] = "";
                                    }
                                    continue;
                                }
                            } else if (var538 < 2600) {
                                var10000 = arg1 + 117;
                                --var3;
                                class207 var77 = class222.method1574(var10000, class5.field126[var3]);
                                if (var538 == 2500) {
                                    class5.field126[var3++] = var77.field3368;
                                    continue;
                                }
                                if (var538 == 2501) {
                                    class5.field126[var3++] = var77.field3424;
                                    continue;
                                }
                                if (var538 == 2502) {
                                    class5.field126[var3++] = var77.field3484;
                                    continue;
                                }
                                if (~var538 == -2504) {
                                    class5.field126[var3++] = var77.field3481;
                                    continue;
                                }
                                if (var538 == 2504) {
                                    class5.field126[var3++] = !var77.field3487 ? 0 : 1;
                                    continue;
                                }
                                if (~var538 == -2506) {
                                    class5.field126[var3++] = var77.field3465;
                                    continue;
                                }
                            } else if (var538 < 2700) {
                                --var3;
                                class207 var78 = class222.method1574(107, class5.field126[var3]);
                                if (var538 == 2600) {
                                    class5.field126[var3++] = var78.field3450;
                                    continue;
                                }
                                if (~var538 == -2602) {
                                    class5.field126[var3++] = var78.field3374;
                                    continue;
                                }
                                if (var538 == 2602) {
                                    class108.field1763[var4++] = var78.field3346;
                                    continue;
                                }
                                if (var538 == 2603) {
                                    class5.field126[var3++] = var78.field3416;
                                    continue;
                                }
                                if (var538 == 2604) {
                                    class5.field126[var3++] = var78.field3344;
                                    continue;
                                }
                                if (~var538 == -2606) {
                                    class5.field126[var3++] = var78.field3352;
                                    continue;
                                }
                                if (var538 == 2606) {
                                    class5.field126[var3++] = var78.field3370;
                                    continue;
                                }
                                if (var538 == 2607) {
                                    class5.field126[var3++] = var78.field3387;
                                    continue;
                                }
                                if (~var538 == -2609) {
                                    class5.field126[var3++] = var78.field3366;
                                    continue;
                                }
                                if (~var538 == -2610) {
                                    class5.field126[var3++] = var78.field3355;
                                    continue;
                                }
                                if (var538 == 2610) {
                                    class5.field126[var3++] = var78.field3429;
                                    continue;
                                }
                                if (var538 == 2611) {
                                    class5.field126[var3++] = var78.field3372;
                                    continue;
                                }
                                if (var538 == 2612) {
                                    class5.field126[var3++] = var78.field3432;
                                    continue;
                                }
                            } else if (~var538 <= -2801) {
                                if (var538 >= 2900) {
                                    if (var538 >= 3200) {
                                        if (var538 >= 3300) {
                                            if (~var538 > -3401) {
                                                if (~var538 == -3301) {
                                                    class5.field126[var3++] = class275.field4598;
                                                    continue;
                                                }
                                                if (var538 == 3301) {
                                                    var3 -= 2;
                                                    int var79 = class5.field126[var3];
                                                    int var80 = class5.field126[var3 - -1];
                                                    class5.field126[var3++] = class177.method1297(var79, 118, var80);
                                                    continue;
                                                }
                                                if (var538 == 3302) {
                                                    var3 -= 2;
                                                    int var81 = class5.field126[var3];
                                                    int var82 = class5.field126[var3 - -1];
                                                    class5.field126[var3++] = class176.method1294(var82, var81, class284.method1990(arg1, 81));
                                                    continue;
                                                }
                                                if (~var538 == -3304) {
                                                    var3 -= 2;
                                                    int var83 = class5.field126[var3];
                                                    int var84 = class5.field126[var3 - -1];
                                                    class5.field126[var3++] = class16.method89(var84, false, var83);
                                                    continue;
                                                }
                                                if (var538 == 3304) {
                                                    --var3;
                                                    int var85 = class5.field126[var3];
                                                    class5.field126[var3++] = class47.method299(5, var85).field999;
                                                    continue;
                                                }
                                                if (~var538 == -3306) {
                                                    --var3;
                                                    int var86 = class5.field126[var3];
                                                    class5.field126[var3++] = class231.field3914[var86];
                                                    continue;
                                                }
                                                if (var538 == 3306) {
                                                    --var3;
                                                    int var87 = class5.field126[var3];
                                                    class5.field126[var3++] = class111.field1831[var87];
                                                    continue;
                                                }
                                                if (~var538 == -3308) {
                                                    --var3;
                                                    int var88 = class5.field126[var3];
                                                    class5.field126[var3++] = class250.field4238[var88];
                                                    continue;
                                                }
                                                if (~var538 == -3309) {
                                                    int var89 = class182.field2898;
                                                    int var90 = (class16.field314.field771 >> 7) + class78.field1313;
                                                    int var91 = (class16.field314.field715 >> 7) + class26.field462;
                                                    class5.field126[var3++] = (var89 << 28) + (var91 << 14) + var90;
                                                    continue;
                                                }
                                                if (~var538 == -3310) {
                                                    --var3;
                                                    int var92 = class5.field126[var3];
                                                    class5.field126[var3++] = class15.method84(268432496, var92) >> 14;
                                                    continue;
                                                }
                                                if (var538 == 3310) {
                                                    --var3;
                                                    int var93 = class5.field126[var3];
                                                    class5.field126[var3++] = var93 >> 28;
                                                    continue;
                                                }
                                                if (var538 == 3311) {
                                                    --var3;
                                                    int var94 = class5.field126[var3];
                                                    class5.field126[var3++] = class15.method84(16383, var94);
                                                    continue;
                                                }
                                                if (var538 == 3312) {
                                                    class5.field126[var3++] = !class85.field1418 ? 0 : 1;
                                                    continue;
                                                }
                                                if (var538 == 3313) {
                                                    var3 -= 2;
                                                    int var95 = class5.field126[var3 + 1];
                                                    int var96 = class5.field126[var3] + 32768;
                                                    class5.field126[var3++] = class177.method1297(var96, 118, var95);
                                                    continue;
                                                }
                                                if (~var538 == -3315) {
                                                    var3 -= 2;
                                                    int var97 = class5.field126[var3] + 32768;
                                                    int var98 = class5.field126[var3 + 1];
                                                    class5.field126[var3++] = class176.method1294(var98, var97, arg1 + 110);
                                                    continue;
                                                }
                                                if (var538 == 3315) {
                                                    var3 -= 2;
                                                    int var99 = class5.field126[var3] - -32768;
                                                    int var100 = class5.field126[var3 - -1];
                                                    class5.field126[var3++] = class16.method89(var100, false, var99);
                                                    continue;
                                                }
                                                if (var538 == 3316) {
                                                    if (~class233.field3942 <= -3) {
                                                        class5.field126[var3++] = class233.field3942;
                                                    } else {
                                                        class5.field126[var3++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (~var538 == -3318) {
                                                    class5.field126[var3++] = class155.field2572;
                                                    continue;
                                                }
                                                if (~var538 == -3319) {
                                                    class5.field126[var3++] = class251.field4250;
                                                    continue;
                                                }
                                                if (var538 == 3321) {
                                                    class5.field126[var3++] = class147.field2429;
                                                    continue;
                                                }
                                                if (var538 == 3322) {
                                                    class5.field126[var3++] = class174.field2793;
                                                    continue;
                                                }
                                                if (~var538 == -3324) {
                                                    if (class27.field476 >= 5 && ~class27.field476 >= -10) {
                                                        class5.field126[var3++] = 1;
                                                        continue;
                                                    }
                                                    class5.field126[var3++] = 0;
                                                    continue;
                                                }
                                                if (var538 == 3324) {
                                                    if (~class27.field476 <= -6 && class27.field476 <= 9) {
                                                        class5.field126[var3++] = class27.field476;
                                                        continue;
                                                    }
                                                    class5.field126[var3++] = 0;
                                                    continue;
                                                }
                                                if (~var538 == -3326) {
                                                    class5.field126[var3++] = class226.field3830 ? 1 : 0;
                                                    continue;
                                                }
                                                if (var538 == 3326) {
                                                    class5.field126[var3++] = class16.field314.field2073;
                                                    continue;
                                                }
                                                if (~var538 == -3328) {
                                                    class5.field126[var3++] = !class16.field314.field2081.field4702 ? 0 : 1;
                                                    continue;
                                                }
                                                if (var538 == 3328) {
                                                    class5.field126[var3++] = class69.field1163 && !class146.field2402 ? 1 : 0;
                                                    continue;
                                                }
                                                if (var538 == 3329) {
                                                    class5.field126[var3++] = !class122.field2042 ? 0 : 1;
                                                    continue;
                                                }
                                                if (~var538 == -3331) {
                                                    --var3;
                                                    int var101 = class5.field126[var3];
                                                    class5.field126[var3++] = class97.method685(100, var101);
                                                    continue;
                                                }
                                                if (var538 == 3331) {
                                                    var3 -= 2;
                                                    int var102 = class5.field126[var3 + 1];
                                                    int var103 = class5.field126[var3];
                                                    class5.field126[var3++] = class147.method1089(false, class284.method1990(arg1, 0), var103, var102);
                                                    continue;
                                                }
                                                if (var538 == 3332) {
                                                    var3 -= 2;
                                                    int var104 = class5.field126[var3];
                                                    int var105 = class5.field126[var3 + 1];
                                                    class5.field126[var3++] = class147.method1089(true, 0, var104, var105);
                                                    continue;
                                                }
                                                if (~var538 == -3334) {
                                                    class5.field126[var3++] = class36.field578;
                                                    continue;
                                                }
                                                if (var538 == 3335) {
                                                    class5.field126[var3++] = class49.field834;
                                                    continue;
                                                }
                                                if (var538 == 3336) {
                                                    var3 -= 4;
                                                    int var106 = class5.field126[var3 - -1];
                                                    int var107 = class5.field126[var3 + 2];
                                                    int var108 = class5.field126[var3];
                                                    int var109 = (var106 << 14) + var108;
                                                    int var110 = (var107 << 28) + var109;
                                                    int var111 = class5.field126[var3 - -3];
                                                    int var112 = var110 + var111;
                                                    class5.field126[var3++] = var112;
                                                    continue;
                                                }
                                                if (~var538 == -3338) {
                                                    class5.field126[var3++] = class105.field1736;
                                                    continue;
                                                }
                                            } else if (var538 >= 3500) {
                                                if (~var538 <= -3701) {
                                                    if (var538 < 4000) {
                                                        if (var538 == 3903) {
                                                            --var3;
                                                            int var113 = class5.field126[var3];
                                                            class5.field126[var3++] = class87.field1436[var113].method373(0);
                                                            continue;
                                                        }
                                                        if (~var538 == -3905) {
                                                            --var3;
                                                            int var114 = class5.field126[var3];
                                                            class5.field126[var3++] = class87.field1436[var114].field1016;
                                                            continue;
                                                        }
                                                        if (~var538 == -3906) {
                                                            --var3;
                                                            int var115 = class5.field126[var3];
                                                            class5.field126[var3++] = class87.field1436[var115].field1024;
                                                            continue;
                                                        }
                                                        if (var538 == 3906) {
                                                            --var3;
                                                            int var116 = class5.field126[var3];
                                                            class5.field126[var3++] = class87.field1436[var116].field1022;
                                                            continue;
                                                        }
                                                        if (var538 == 3907) {
                                                            --var3;
                                                            int var117 = class5.field126[var3];
                                                            class5.field126[var3++] = class87.field1436[var117].field1012;
                                                            continue;
                                                        }
                                                        if (~var538 == -3909) {
                                                            --var3;
                                                            int var118 = class5.field126[var3];
                                                            class5.field126[var3++] = class87.field1436[var118].field1027;
                                                            continue;
                                                        }
                                                        if (var538 == 3910) {
                                                            --var3;
                                                            int var119 = class5.field126[var3];
                                                            int var120 = class87.field1436[var119].method372(true);
                                                            class5.field126[var3++] = var120 == 0 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (var538 == 3911) {
                                                            --var3;
                                                            int var121 = class5.field126[var3];
                                                            int var122 = class87.field1436[var121].method372(true);
                                                            class5.field126[var3++] = var122 == 2 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var538 == -3913) {
                                                            --var3;
                                                            int var123 = class5.field126[var3];
                                                            int var124 = class87.field1436[var123].method372(true);
                                                            class5.field126[var3++] = var124 != 5 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var538 == -3914) {
                                                            --var3;
                                                            int var125 = class5.field126[var3];
                                                            int var126 = class87.field1436[var125].method372(true);
                                                            class5.field126[var3++] = ~var126 == -2 ? 1 : 0;
                                                            continue;
                                                        }
                                                    } else if (~var538 <= -4101) {
                                                        if (var538 < 4200) {
                                                            if (var538 == 4100) {
                                                                --var4;
                                                                String var127 = class108.field1763[var4];
                                                                --var3;
                                                                int var128 = class5.field126[var3];
                                                                class108.field1763[var4++] = var127 + var128;
                                                                continue;
                                                            }
                                                            if (~var538 == -4102) {
                                                                var4 -= 2;
                                                                String var129 = class108.field1763[var4];
                                                                String var130 = class108.field1763[var4 + 1];
                                                                class108.field1763[var4++] = var129 + var130;
                                                                continue;
                                                            }
                                                            if (~var538 == -4103) {
                                                                --var4;
                                                                String var131 = class108.field1763[var4];
                                                                --var3;
                                                                int var132 = class5.field126[var3];
                                                                class108.field1763[var4++] = var131 + class121.method911(true, var132, (byte) -126);
                                                                continue;
                                                            }
                                                            if (~var538 == -4104) {
                                                                --var4;
                                                                String var133 = class108.field1763[var4];
                                                                class108.field1763[var4++] = var133.toLowerCase();
                                                                continue;
                                                            }
                                                            if (var538 == 4104) {
                                                                --var3;
                                                                int var134 = class5.field126[var3];
                                                                long var135 = ((long) var134 - -11745L) * 86400000L;
                                                                class86.field1427.setTime(new Date(var135));
                                                                int var137 = class86.field1427.get(5);
                                                                int var138 = class86.field1427.get(2);
                                                                int var139 = class86.field1427.get(1);
                                                                class108.field1763[var4++] = var137 + "-" + class173.field2787[var138] + "-" + var139;
                                                                continue;
                                                            }
                                                            if (var538 == 4105) {
                                                                var4 -= 2;
                                                                String var140 = class108.field1763[var4 - -1];
                                                                String var141 = class108.field1763[var4];
                                                                if (class16.field314.field2081 != null && class16.field314.field2081.field4702) {
                                                                    class108.field1763[var4++] = var140;
                                                                    continue;
                                                                }
                                                                class108.field1763[var4++] = var141;
                                                                continue;
                                                            }
                                                            if (var538 == 4106) {
                                                                --var3;
                                                                int var142 = class5.field126[var3];
                                                                class108.field1763[var4++] = Integer.toString(var142);
                                                                continue;
                                                            }
                                                            if (var538 == 4107) {
                                                                var4 -= 2;
                                                                class5.field126[var3++] = class233.method1675(class72.method512(class108.field1763[var4], (byte) 36, class49.field834, class108.field1763[var4 + 1]), 1);
                                                                continue;
                                                            }
                                                            if (~var538 == -4109) {
                                                                var3 -= 2;
                                                                --var4;
                                                                String var143 = class108.field1763[var4];
                                                                int var144 = class5.field126[var3];
                                                                int var145 = class5.field126[var3 - -1];
                                                                class5.field126[var3++] = class171.method1274(false, var145).method1216(var143, var144);
                                                                continue;
                                                            }
                                                            if (var538 == 4109) {
                                                                var3 -= 2;
                                                                int var146 = class5.field126[var3 - -1];
                                                                --var4;
                                                                String var147 = class108.field1763[var4];
                                                                int var148 = class5.field126[var3];
                                                                class5.field126[var3++] = class171.method1274(false, var146).method1223(var147, var148);
                                                                continue;
                                                            }
                                                            if (~var538 == -4111) {
                                                                var4 -= 2;
                                                                String var149 = class108.field1763[var4];
                                                                String var150 = class108.field1763[var4 - -1];
                                                                --var3;
                                                                if (class5.field126[var3] != 1) {
                                                                    class108.field1763[var4++] = var150;
                                                                } else {
                                                                    class108.field1763[var4++] = var149;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var538 == -4112) {
                                                                --var4;
                                                                String var151 = class108.field1763[var4];
                                                                class108.field1763[var4++] = class165.method1238(var151);
                                                                continue;
                                                            }
                                                            if (var538 == 4112) {
                                                                --var4;
                                                                String var152 = class108.field1763[var4];
                                                                --var3;
                                                                int var153 = class5.field126[var3];
                                                                if (~var153 == 0) {
                                                                    throw new RuntimeException("null char");
                                                                }
                                                                class108.field1763[var4++] = var152 + (char) var153;
                                                                continue;
                                                            }
                                                            if (~var538 == -4114) {
                                                                --var3;
                                                                int var154 = class5.field126[var3];
                                                                class5.field126[var3++] = !class142.method1054((char) var154, (byte) -103) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var538 == -4115) {
                                                                --var3;
                                                                int var155 = class5.field126[var3];
                                                                class5.field126[var3++] = class267.method1883((byte) 98, (char) var155) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var538 == -4116) {
                                                                --var3;
                                                                int var156 = class5.field126[var3];
                                                                class5.field126[var3++] = !class140.method1038((byte) 34, (char) var156) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var538 == -4117) {
                                                                --var3;
                                                                int var157 = class5.field126[var3];
                                                                class5.field126[var3++] = class120.method904((char) var157, 4157) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var538 == -4118) {
                                                                --var4;
                                                                String var158 = class108.field1763[var4];
                                                                if (var158 != null) {
                                                                    class5.field126[var3++] = var158.length();
                                                                } else {
                                                                    class5.field126[var3++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var538 == -4119) {
                                                                var3 -= 2;
                                                                int var159 = class5.field126[var3];
                                                                --var4;
                                                                String var160 = class108.field1763[var4];
                                                                int var161 = class5.field126[var3 + 1];
                                                                class108.field1763[var4++] = var160.substring(var159, var161);
                                                                continue;
                                                            }
                                                            if (var538 == 4119) {
                                                                --var4;
                                                                String var162 = class108.field1763[var4];
                                                                StringBuffer var163 = new StringBuffer(var162.length());
                                                                boolean var164 = false;
                                                                for (int var165 = 0; var162.length() > var165; ++var165) {
                                                                    char var166 = var162.charAt(var165);
                                                                    if (~var166 == -61) {
                                                                        var164 = true;
                                                                    } else if (var166 != '>') {
                                                                        if (!var164) {
                                                                            var163.append(var166);
                                                                        }
                                                                    } else {
                                                                        var164 = false;
                                                                    }
                                                                }
                                                                class108.field1763[var4++] = var163.toString();
                                                                continue;
                                                            }
                                                            if (~var538 == -4121) {
                                                                var3 -= 2;
                                                                --var4;
                                                                String var167 = class108.field1763[var4];
                                                                int var168 = class5.field126[var3];
                                                                int var169 = class5.field126[var3 + 1];
                                                                class5.field126[var3++] = var167.indexOf(var168, var169);
                                                                continue;
                                                            }
                                                            if (~var538 == -4122) {
                                                                var4 -= 2;
                                                                String var170 = class108.field1763[var4];
                                                                String var171 = class108.field1763[var4 + 1];
                                                                --var3;
                                                                int var172 = class5.field126[var3];
                                                                class5.field126[var3++] = var170.indexOf(var171, var172);
                                                                continue;
                                                            }
                                                            if (~var538 == -4123) {
                                                                --var3;
                                                                int var173 = class5.field126[var3];
                                                                class5.field126[var3++] = Character.toLowerCase((char) var173);
                                                                continue;
                                                            }
                                                            if (var538 == 4123) {
                                                                --var3;
                                                                int var174 = class5.field126[var3];
                                                                class5.field126[var3++] = Character.toUpperCase((char) var174);
                                                                continue;
                                                            }
                                                            if (~var538 == -4125) {
                                                                --var3;
                                                                boolean var175 = ~class5.field126[var3] != -1;
                                                                --var3;
                                                                int var176 = class5.field126[var3];
                                                                class108.field1763[var4++] = class208.method1461(class49.field834, 0, 91, var175, (long) var176);
                                                                continue;
                                                            }
                                                        } else if (~var538 <= -4301) {
                                                            if (var538 < 4400) {
                                                                if (var538 == 4300) {
                                                                    var3 -= 2;
                                                                    int var177 = class5.field126[var3 - -1];
                                                                    int var178 = class5.field126[var3];
                                                                    class86 var179 = class69.method471(var177, (byte) 28);
                                                                    if (!var179.method604((byte) 14)) {
                                                                        class5.field126[var3++] = class217.method1551(7, var178).method334((byte) -65, var179.field1423, var177);
                                                                    } else {
                                                                        class108.field1763[var4++] = class217.method1551(7, var178).method340(var177, -322255313, var179.field1424);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (var538 < 4500) {
                                                                if (~var538 == -4401) {
                                                                    var3 -= 2;
                                                                    int var180 = class5.field126[var3];
                                                                    int var181 = class5.field126[var3 + 1];
                                                                    class86 var182 = class69.method471(var181, (byte) 28);
                                                                    if (var182.method604((byte) 14)) {
                                                                        class108.field1763[var4++] = class110.method827(var180, (byte) -54).method1(var182.field1424, var181, false);
                                                                    } else {
                                                                        class5.field126[var3++] = class110.method827(var180, (byte) -83).method23(var181, arg1 + -129, var182.field1423);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var538 > -4601) {
                                                                if (~var538 == -4501) {
                                                                    var3 -= 2;
                                                                    int var183 = class5.field126[var3 - -1];
                                                                    int var184 = class5.field126[var3];
                                                                    class86 var185 = class69.method471(var183, (byte) 28);
                                                                    if (var185.method604((byte) 14)) {
                                                                        class108.field1763[var4++] = class240.method1722(var184, (byte) -32).method60(var185.field1424, var183, (byte) -55);
                                                                    } else {
                                                                        class5.field126[var3++] = class240.method1722(var184, (byte) -32).method63(var185.field1423, arg1 + 98, var183);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (var538 >= 5100) {
                                                                if (~var538 > -5201) {
                                                                    if (var538 == 5100) {
                                                                        if (!class157.field2581[86]) {
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class5.field126[var3++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5102) {
                                                                        if (!class157.field2581[82]) {
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class5.field126[var3++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5103) {
                                                                        if (!class157.field2581[81]) {
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class5.field126[var3++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (var538 < 5300) {
                                                                    if (var538 == 5200) {
                                                                        --var3;
                                                                        class175.method1290(class5.field126[var3], ~arg1);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5201) {
                                                                        class5.field126[var3++] = class79.method551(-124);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5205) {
                                                                        --var3;
                                                                        class270.method1905(-1, class5.field126[var3], -1, false, (byte) 85);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5206) {
                                                                        --var3;
                                                                        int var186 = class5.field126[var3];
                                                                        class205 var187 = class148.method1098((var186 & 268434527) >> 14, var186 & 16383);
                                                                        if (var187 == null) {
                                                                            class5.field126[var3++] = -1;
                                                                        } else {
                                                                            class5.field126[var3++] = var187.field3301;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5207) {
                                                                        --var3;
                                                                        class205 var188 = class148.method1092(class5.field126[var3]);
                                                                        if (var188 != null && var188.field3293 != null) {
                                                                            class108.field1763[var4++] = var188.field3293;
                                                                            continue;
                                                                        }
                                                                        class108.field1763[var4++] = "";
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5208) {
                                                                        class5.field126[var3++] = class104.field1679;
                                                                        class5.field126[var3++] = class250.field4233;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5209) {
                                                                        class5.field126[var3++] = class148.field2438 + class122.field2044;
                                                                        class5.field126[var3++] = -class219.field3701 - -class148.field2437 + class148.field2434 + -1;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5210) {
                                                                        --var3;
                                                                        int var189 = class5.field126[var3];
                                                                        class205 var190 = class148.method1092(var189);
                                                                        if (var190 == null) {
                                                                            class5.field126[var3++] = 0;
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class5.field126[var3++] = class15.method84(268433758, var190.field3295) >> 14;
                                                                            class5.field126[var3++] = class15.method84(16383, var190.field3295);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5211) {
                                                                        --var3;
                                                                        int var191 = class5.field126[var3];
                                                                        class205 var192 = class148.method1092(var191);
                                                                        if (var192 != null) {
                                                                            class5.field126[var3++] = -var192.field3283 + var192.field3303;
                                                                            class5.field126[var3++] = -var192.field3294 + var192.field3310;
                                                                        } else {
                                                                            class5.field126[var3++] = 0;
                                                                            class5.field126[var3++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5213) {
                                                                        class206 var193 = class205.method1429(false);
                                                                        if (var193 != null) {
                                                                            class5.field126[var3++] = var193.field3327;
                                                                            int var194 = -var193.field3313 + -1 + class148.field2434 + class148.field2437 | var193.field3316 << 28 | class148.field2438 + var193.field3324 << 14;
                                                                            class5.field126[var3++] = var194;
                                                                        } else {
                                                                            class5.field126[var3++] = -1;
                                                                            class5.field126[var3++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5214) {
                                                                        class206 var195 = class35.method217(0);
                                                                        if (var195 == null) {
                                                                            class5.field126[var3++] = -1;
                                                                            class5.field126[var3++] = -1;
                                                                        } else {
                                                                            class5.field126[var3++] = var195.field3327;
                                                                            int var196 = var195.field3316 << 28 | var195.field3324 - -class148.field2438 << 14 | class148.field2434 + -1 + -var195.field3313 + class148.field2437;
                                                                            class5.field126[var3++] = var196;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5214) {
                                                                        --var3;
                                                                        int var197 = class5.field126[var3];
                                                                        class205 var198 = class61.method421((byte) 127);
                                                                        if (var198 != null) {
                                                                            boolean var199 = var198.method1432(class70.field1168, var197 & 16383, var197 >> 28 & 3, -90, (var197 & 268433316) >> 14);
                                                                            if (var199) {
                                                                                class201.method1417(class70.field1168[1], 65, class70.field1168[2]);
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5216) {
                                                                        var3 -= 2;
                                                                        int var200 = class5.field126[var3];
                                                                        int var201 = class5.field126[var3 - -1];
                                                                        class65 var202 = class148.method1093(16383 & var200 >> 14, 16383 & var200);
                                                                        boolean var203 = false;
                                                                        for (class205 var204 = (class205) var202.method452(1576); var204 != null; var204 = (class205) var202.method448(631244930)) {
                                                                            if (~var204.field3301 == ~var201) {
                                                                                var203 = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!var203) {
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class5.field126[var3++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5219) {
                                                                        --var3;
                                                                        int var205 = class5.field126[var3];
                                                                        class205 var206 = class148.method1092(var205);
                                                                        if (var206 != null) {
                                                                            class5.field126[var3++] = var206.field3289;
                                                                        } else {
                                                                            class5.field126[var3++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5221) {
                                                                        class5.field126[var3++] = ~class171.field2773 == -101 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5221) {
                                                                        --var3;
                                                                        int var207 = class5.field126[var3];
                                                                        class201.method1417((var207 & 268425094) >> 14, 74, 16383 & var207);
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5223) {
                                                                        class205 var208 = class61.method421((byte) 127);
                                                                        if (var208 != null) {
                                                                            boolean var209 = var208.method1426(class148.field2438 + class122.field2044, class148.field2434 - (1 - -class219.field3701) + class148.field2437, arg1 + 116, class70.field1168);
                                                                            if (var209) {
                                                                                class5.field126[var3++] = class70.field1168[1];
                                                                                class5.field126[var3++] = class70.field1168[2];
                                                                            } else {
                                                                                class5.field126[var3++] = -1;
                                                                                class5.field126[var3++] = -1;
                                                                            }
                                                                        } else {
                                                                            class5.field126[var3++] = -1;
                                                                            class5.field126[var3++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5223) {
                                                                        var3 -= 2;
                                                                        int var210 = class5.field126[var3];
                                                                        int var211 = class5.field126[var3 - -1];
                                                                        class270.method1905(var211 & 16383, var210, 16383 & var211 >> 14, false, (byte) 6);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5224) {
                                                                        --var3;
                                                                        int var212 = class5.field126[var3];
                                                                        class205 var213 = class61.method421((byte) 127);
                                                                        if (var213 == null) {
                                                                            class5.field126[var3++] = -1;
                                                                            class5.field126[var3++] = -1;
                                                                        } else {
                                                                            boolean var214 = var213.method1432(class70.field1168, 16383 & var212, (var212 & 903786792) >> 28, 112, (268421875 & var212) >> 14);
                                                                            if (var214) {
                                                                                class5.field126[var3++] = class70.field1168[1];
                                                                                class5.field126[var3++] = class70.field1168[2];
                                                                            } else {
                                                                                class5.field126[var3++] = -1;
                                                                                class5.field126[var3++] = -1;
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5225) {
                                                                        --var3;
                                                                        int var215 = class5.field126[var3];
                                                                        class205 var216 = class61.method421((byte) 127);
                                                                        if (var216 == null) {
                                                                            class5.field126[var3++] = -1;
                                                                            class5.field126[var3++] = -1;
                                                                        } else {
                                                                            boolean var217 = var216.method1426(16383 & var215 >> 14, 16383 & var215, 72, class70.field1168);
                                                                            if (!var217) {
                                                                                class5.field126[var3++] = -1;
                                                                                class5.field126[var3++] = -1;
                                                                            } else {
                                                                                class5.field126[var3++] = class70.field1168[1];
                                                                                class5.field126[var3++] = class70.field1168[2];
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5227) {
                                                                        --var3;
                                                                        class115.method879((byte) -124, class5.field126[var3]);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5227) {
                                                                        var3 -= 2;
                                                                        int var218 = class5.field126[var3];
                                                                        int var219 = class5.field126[var3 + 1];
                                                                        class270.method1905(var219 & 16383, var218, (268434915 & var219) >> 14, true, (byte) 19);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5228) {
                                                                        --var3;
                                                                        class72.field1256 = class5.field126[var3] == 1;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5229) {
                                                                        class5.field126[var3++] = class72.field1256 ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5231) {
                                                                        --var3;
                                                                        int var220 = class5.field126[var3];
                                                                        class284.method1981(var220, (byte) -33);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5231) {
                                                                        var3 -= 2;
                                                                        int var221 = class5.field126[var3];
                                                                        boolean var222 = class5.field126[var3 - -1] == 1;
                                                                        if (class58.field1013 == null) {
                                                                            continue;
                                                                        }
                                                                        class134 var223 = class58.field1013.method987(-95, (long) var221);
                                                                        if (var223 != null && !var222) {
                                                                            var223.method993(32);
                                                                            continue;
                                                                        }
                                                                        if (var223 == null && var222) {
                                                                            class134 var224 = new class134();
                                                                            class58.field1013.method986((long) var221, true, var224);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5232) {
                                                                        --var3;
                                                                        int var225 = class5.field126[var3];
                                                                        if (class58.field1013 == null) {
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class134 var226 = class58.field1013.method987(-102, (long) var225);
                                                                            class5.field126[var3++] = var226 != null ? 1 : 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5234) {
                                                                        var3 -= 2;
                                                                        int var227 = class5.field126[var3];
                                                                        boolean var228 = class5.field126[var3 - -1] == 1;
                                                                        if (class58.field1008 == null) {
                                                                            continue;
                                                                        }
                                                                        class134 var229 = class58.field1008.method987(-90, (long) var227);
                                                                        if (var229 != null && !var228) {
                                                                            var229.method993(arg1 ^ 32);
                                                                            continue;
                                                                        }
                                                                        if (var229 == null && var228) {
                                                                            class134 var230 = new class134();
                                                                            class58.field1008.method986((long) var227, true, var230);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5234) {
                                                                        --var3;
                                                                        int var231 = class5.field126[var3];
                                                                        if (class58.field1008 == null) {
                                                                            class5.field126[var3++] = 0;
                                                                        } else {
                                                                            class134 var232 = class58.field1008.method987(arg1 + -100, (long) var231);
                                                                            class5.field126[var3++] = var232 == null ? 0 : 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5235) {
                                                                        class5.field126[var3++] = class148.field2441 == null ? -1 : class148.field2441.field3301;
                                                                        continue;
                                                                    }
                                                                } else if (var538 >= 5400) {
                                                                    if (var538 >= 5500) {
                                                                        if (var538 < 5600) {
                                                                            if (var538 == 5500) {
                                                                                var3 -= 4;
                                                                                int var233 = class5.field126[var3];
                                                                                int var234 = class5.field126[var3 - -1];
                                                                                int var235 = class5.field126[var3 + 2];
                                                                                int var236 = class5.field126[var3 + 3];
                                                                                class87.method609(false, var235, ((268432090 & var233) >> 14) - class26.field462, (var233 & 16383) - class78.field1313, (byte) 122, var234, var236);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5501) {
                                                                                var3 -= 4;
                                                                                int var237 = class5.field126[var3 + 2];
                                                                                int var238 = class5.field126[var3 + 3];
                                                                                int var239 = class5.field126[var3 - -1];
                                                                                int var240 = class5.field126[var3];
                                                                                class119.method901(var239, var238, (var240 >> 14 & 16383) + -class26.field462, -29319, (var240 & 16383) + -class78.field1313, var237);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5502) {
                                                                                var3 -= 6;
                                                                                int var241 = class5.field126[var3];
                                                                                if (~var241 <= -3) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class313.field5036 = var241;
                                                                                int var242 = class5.field126[var3 - -1];
                                                                                if (var242 + 1 >= class65.field1104[class313.field5036].length >> 1) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class289.field4769 = var242;
                                                                                class180.field2874 = 0;
                                                                                class265.field4436 = class5.field126[var3 + 2];
                                                                                class196.field3157 = class5.field126[var3 - -3];
                                                                                int var243 = class5.field126[var3 + 4];
                                                                                if (var243 >= 2) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class21.field383 = var243;
                                                                                int var244 = class5.field126[var3 + 5];
                                                                                if (class65.field1104[class21.field383].length >> 1 <= var244 + 1) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class301.field4915 = var244;
                                                                                class169.field2739 = 3;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5503) {
                                                                                class183.method1330((byte) 71);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5504) {
                                                                                var3 -= 2;
                                                                                class86.method605(class5.field126[var3 - -1], class5.field126[var3], (byte) 110);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5505) {
                                                                                class5.field126[var3++] = (int) class187.field2993;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5506) {
                                                                                class5.field126[var3++] = (int) class265.field4432;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5508) {
                                                                                class237.method1700((byte) -122);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5508) {
                                                                                class214.method1518((byte) 125);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5509) {
                                                                                class64.method440(-104);
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5511) {
                                                                                class31.method198(true);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5511) {
                                                                                --var3;
                                                                                int var245 = class5.field126[var3];
                                                                                class169.field2739 = 4;
                                                                                int var246 = 16383 & var245 >> 14;
                                                                                int var247 = var246 - class26.field462;
                                                                                if (var247 < 0) {
                                                                                    var247 = 0;
                                                                                } else if (var247 >= 104) {
                                                                                    var247 = 104;
                                                                                }
                                                                                class138.field2264 = var247 * 128 + 64;
                                                                                int var248 = var245 & 16383;
                                                                                int var249 = var248 - class78.field1313;
                                                                                if (var249 >= 0) {
                                                                                    if (~var249 <= -105) {
                                                                                        var249 = 104;
                                                                                    }
                                                                                } else {
                                                                                    var249 = 0;
                                                                                }
                                                                                class54.field958 = var249 * 128 + 64;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5513) {
                                                                                class189.method1363(true);
                                                                                continue;
                                                                            }
                                                                        } else if (~var538 > -5701) {
                                                                            if (~var538 == -5601) {
                                                                                var4 -= 2;
                                                                                String var250 = class108.field1763[var4];
                                                                                String var251 = class108.field1763[var4 - -1];
                                                                                --var3;
                                                                                int var252 = class5.field126[var3];
                                                                                if (class26.field458 == 10 && ~class116.field1981 == -1 && class189.field3017 == 0 && ~class70.field1165 == -1 && ~class306.field4958 == -1) {
                                                                                    class111.method831(23087, var250, var251, var252);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5601) {
                                                                                class239.method1709(false);
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5602) {
                                                                                if (~class189.field3017 == -1) {
                                                                                    class295.field4839 = -2;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5604) {
                                                                                var3 -= 4;
                                                                                if (~class26.field458 == -11 && ~class116.field1981 == -1 && class189.field3017 == 0 && class70.field1165 == 0 && ~class306.field4958 == -1) {
                                                                                    class232.method1666(class5.field126[var3 + 3], class5.field126[var3], class5.field126[var3 + 1], class5.field126[var3 + 2], 13961);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5605) {
                                                                                --var4;
                                                                                if (class26.field458 == 10 && ~class116.field1981 == -1 && ~class189.field3017 == -1 && ~class70.field1165 == -1 && ~class306.field4958 == -1) {
                                                                                    class22.method141(false, class180.method1309(class108.field1763[var4], arg1 + -20696));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5605) {
                                                                                var4 -= 3;
                                                                                var3 -= 7;
                                                                                if (class26.field458 == 10 && ~class116.field1981 == -1 && ~class189.field3017 == -1 && ~class70.field1165 == -1 && ~class306.field4958 == -1) {
                                                                                    class259.method1850(class5.field126[var3], ~class5.field126[var3 + 6] == -2, class180.method1309(class108.field1763[var4], -20696), class5.field126[var3 + 4] == 1, class108.field1763[var4 + 2], class5.field126[var3 + 2], class5.field126[var3 + 5] == 1, 2, class108.field1763[var4 + 1], class5.field126[var3 + 3], class5.field126[var3 + 1]);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5607) {
                                                                                if (~class70.field1165 == -1) {
                                                                                    class10.field184 = -2;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5608) {
                                                                                class5.field126[var3++] = class295.field4839;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5609) {
                                                                                class5.field126[var3++] = class283.field4696;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 5609) {
                                                                                class5.field126[var3++] = class10.field184;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5611) {
                                                                                for (int var253 = 0; ~var253 > -6; ++var253) {
                                                                                    class108.field1763[var4++] = class109.field1804.length > var253 ? class313.method2116(125, class109.field1804[var253]) : "";
                                                                                }
                                                                                class109.field1804 = null;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -5612) {
                                                                                class5.field126[var3++] = class246.field4129;
                                                                                continue;
                                                                            }
                                                                        } else if (~var538 > -6101) {
                                                                            if (~var538 == -6002) {
                                                                                --var3;
                                                                                int var254 = class5.field126[var3];
                                                                                if (var254 < 1) {
                                                                                    var254 = 1;
                                                                                }
                                                                                if (var254 > 4) {
                                                                                    var254 = 4;
                                                                                }
                                                                                class15.field304 = var254;
                                                                                if (~class15.field304 == -2) {
                                                                                    class128.method958(0.9F);
                                                                                }
                                                                                if (~class15.field304 == -3) {
                                                                                    class128.method958(0.8F);
                                                                                }
                                                                                if (~class15.field304 == -4) {
                                                                                    class128.method958(0.7F);
                                                                                }
                                                                                if (class15.field304 == 4) {
                                                                                    class128.method958(0.6F);
                                                                                }
                                                                                class131.method976(-22869);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6002) {
                                                                                --var3;
                                                                                class180.method1312(-1, class5.field126[var3] == 1);
                                                                                class94.method674((byte) -104);
                                                                                class41.method243((byte) 107);
                                                                                class264.method1869(0);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6003) {
                                                                                --var3;
                                                                                class79.field1325 = ~class5.field126[var3] == -2;
                                                                                class264.method1869(0);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6006) {
                                                                                --var3;
                                                                                class162.field2636 = ~class5.field126[var3] == -2;
                                                                                class41.method243((byte) 87);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6007) {
                                                                                --var3;
                                                                                class145.field2388 = class5.field126[var3] == 1;
                                                                                ((class185) class128.field2136).method1340((byte) -56, !class145.field2388);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6008) {
                                                                                --var3;
                                                                                class259.field4357 = class5.field126[var3] == 1;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6008) {
                                                                                --var3;
                                                                                class54.field916 = ~class5.field126[var3] == -2;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6009) {
                                                                                --var3;
                                                                                class190.field3044 = class5.field126[var3] == 1;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6010) {
                                                                                --var3;
                                                                                class68.field1142 = class5.field126[var3] == 1;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6011) {
                                                                                --var3;
                                                                                int var255 = class5.field126[var3];
                                                                                if (~var255 > -1 || ~var255 < -3) {
                                                                                    var255 = 0;
                                                                                }
                                                                                class162.field2631 = var255;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6013) {
                                                                                --var3;
                                                                                class197.field3201 = class5.field126[var3] == 1;
                                                                                if (~class15.field304 == -2) {
                                                                                    class128.method958(0.9F);
                                                                                }
                                                                                if (class15.field304 == 2) {
                                                                                    class128.method958(0.8F);
                                                                                }
                                                                                if (class15.field304 == 3) {
                                                                                    class128.method958(0.7F);
                                                                                }
                                                                                if (~class15.field304 == -5) {
                                                                                    class128.method958(0.6F);
                                                                                }
                                                                                class41.method243((byte) 88);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6015) {
                                                                                --var3;
                                                                                class113.field1934 = class5.field126[var3] == 1;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6015) {
                                                                                --var3;
                                                                                class141.field2337 = ~class5.field126[var3] == -2;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6016) {
                                                                                --var3;
                                                                                int var256 = class5.field126[var3];
                                                                                if (var256 < 0 || ~var256 < -3) {
                                                                                    var256 = 0;
                                                                                }
                                                                                class265.field4440 = var256;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6018) {
                                                                                --var3;
                                                                                field2977 = ~class5.field126[var3] == -2;
                                                                                class258.method1845((byte) 98);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6018) {
                                                                                --var3;
                                                                                int var257 = class5.field126[var3];
                                                                                if (var257 < 0) {
                                                                                    var257 = 0;
                                                                                }
                                                                                if (~var257 < -128) {
                                                                                    var257 = 127;
                                                                                }
                                                                                class283.field4682 = var257;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6019) {
                                                                                --var3;
                                                                                int var258 = class5.field126[var3];
                                                                                if (~var258 > -1) {
                                                                                    var258 = 0;
                                                                                }
                                                                                if (~var258 < -256) {
                                                                                    var258 = 255;
                                                                                }
                                                                                if (~class289.field4767 != ~var258) {
                                                                                    if (class289.field4767 == 0 && ~class57.field1004 != 0) {
                                                                                        class203.method1421(class57.field1004, false, 0, 122, var258, class71.field1246);
                                                                                        class101.field1601 = false;
                                                                                    } else if (~var258 != -1) {
                                                                                        class314.method2129(57, var258);
                                                                                    } else {
                                                                                        class151.method1128((byte) 112);
                                                                                        class101.field1601 = false;
                                                                                    }
                                                                                    class289.field4767 = var258;
                                                                                }
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6020) {
                                                                                --var3;
                                                                                int var259 = class5.field126[var3];
                                                                                if (var259 < 0) {
                                                                                    var259 = 0;
                                                                                }
                                                                                if (~var259 < -128) {
                                                                                    var259 = 127;
                                                                                }
                                                                                class292.field4785 = var259;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6021) {
                                                                                --var3;
                                                                                class50.field857 = class5.field126[var3] == 1;
                                                                                class264.method1869(0);
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6024) {
                                                                                --var3;
                                                                                int var260 = class5.field126[var3];
                                                                                boolean var261 = false;
                                                                                if (var260 < 0) {
                                                                                    var260 = 0;
                                                                                }
                                                                                if (~var260 < -3) {
                                                                                    var260 = 2;
                                                                                }
                                                                                if (class86.field1430 < 96) {
                                                                                    var260 = 0;
                                                                                    var261 = true;
                                                                                }
                                                                                class139.method1031(var260);
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                class51.field864 = false;
                                                                                class5.field126[var3++] = var261 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6024) {
                                                                                --var3;
                                                                                int var262 = class5.field126[var3];
                                                                                if (~var262 > -1 || ~var262 < -3) {
                                                                                    var262 = 0;
                                                                                }
                                                                                class97.field1560 = var262;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6028) {
                                                                                --var3;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6028) {
                                                                                --var3;
                                                                                class245.field4117 = class5.field126[var3] != 0;
                                                                                class116.method893((byte) 7, class142.field2344);
                                                                                continue;
                                                                            }
                                                                        } else if (~var538 <= -6201) {
                                                                            if (~var538 > -6301) {
                                                                                if (~var538 == -6201) {
                                                                                    var3 -= 2;
                                                                                    class248.field4153 = (short) class5.field126[var3];
                                                                                    if (class248.field4153 <= 0) {
                                                                                        class248.field4153 = 256;
                                                                                    }
                                                                                    class51.field867 = (short) class5.field126[var3 + 1];
                                                                                    if (~class51.field867 >= -1) {
                                                                                        class51.field867 = 205;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var538 == -6202) {
                                                                                    var3 -= 2;
                                                                                    class118.field1989 = (short) class5.field126[var3];
                                                                                    if (class118.field1989 <= 0) {
                                                                                        class118.field1989 = 256;
                                                                                    }
                                                                                    class238.field4012 = (short) class5.field126[var3 + 1];
                                                                                    if (~class238.field4012 >= -1) {
                                                                                        class238.field4012 = 320;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var538 == -6203) {
                                                                                    var3 -= 4;
                                                                                    class124.field2094 = (short) class5.field126[var3];
                                                                                    if (~class124.field2094 >= -1) {
                                                                                        class124.field2094 = 1;
                                                                                    }
                                                                                    class313.field5037 = (short) class5.field126[var3 + 1];
                                                                                    if (class313.field5037 > 0) {
                                                                                        if (~class313.field5037 > ~class124.field2094) {
                                                                                            class313.field5037 = class124.field2094;
                                                                                        }
                                                                                    } else {
                                                                                        class313.field5037 = 32767;
                                                                                    }
                                                                                    class46.field815 = (short) class5.field126[var3 + 2];
                                                                                    if (~class46.field815 >= -1) {
                                                                                        class46.field815 = 1;
                                                                                    }
                                                                                    class147.field2430 = (short) class5.field126[var3 + 3];
                                                                                    if (class147.field2430 > 0) {
                                                                                        if (~class147.field2430 > ~class46.field815) {
                                                                                            class147.field2430 = class46.field815;
                                                                                        }
                                                                                    } else {
                                                                                        class147.field2430 = 32767;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var538 == 6203) {
                                                                                    class68.method468(class159.field2603.field3481, class159.field2603.field3484, false, 0, 0, (byte) -57);
                                                                                    class5.field126[var3++] = class210.field3545;
                                                                                    class5.field126[var3++] = class294.field4826;
                                                                                    continue;
                                                                                }
                                                                                if (~var538 == -6205) {
                                                                                    class5.field126[var3++] = class118.field1989;
                                                                                    class5.field126[var3++] = class238.field4012;
                                                                                    continue;
                                                                                }
                                                                                if (var538 == 6205) {
                                                                                    class5.field126[var3++] = class248.field4153;
                                                                                    class5.field126[var3++] = class51.field867;
                                                                                    continue;
                                                                                }
                                                                            } else if (var538 >= 6400) {
                                                                                if (~var538 > -6501) {
                                                                                    if (var538 == 6405) {
                                                                                        class5.field126[var3++] = !class55.method349(-107) ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var538 == 6406) {
                                                                                        class5.field126[var3++] = class77.method545(1353054567) ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                } else if (~var538 > -6601) {
                                                                                    if (~var538 == -6501) {
                                                                                        if (class26.field458 == 10 && class116.field1981 == 0 && ~class189.field3017 == -1 && ~class70.field1165 == -1) {
                                                                                            class5.field126[var3++] = class170.method1270(-18747) != -1 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        class5.field126[var3++] = 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var538 == -6502) {
                                                                                        class208 var263 = class67.method458((byte) 89);
                                                                                        if (var263 != null) {
                                                                                            class5.field126[var3++] = var263.field3523;
                                                                                            class5.field126[var3++] = var263.field1945;
                                                                                            class108.field1763[var4++] = var263.field3524;
                                                                                            class301 var264 = var263.method1464(0);
                                                                                            class5.field126[var3++] = var264.field4914;
                                                                                            class108.field1763[var4++] = var264.field4916;
                                                                                            class5.field126[var3++] = var263.field1951;
                                                                                        } else {
                                                                                            class5.field126[var3++] = -1;
                                                                                            class5.field126[var3++] = 0;
                                                                                            class108.field1763[var4++] = "";
                                                                                            class5.field126[var3++] = 0;
                                                                                            class108.field1763[var4++] = "";
                                                                                            class5.field126[var3++] = 0;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var538 == 6502) {
                                                                                        class208 var265 = class184.method1337((byte) -127);
                                                                                        if (var265 == null) {
                                                                                            class5.field126[var3++] = -1;
                                                                                            class5.field126[var3++] = 0;
                                                                                            class108.field1763[var4++] = "";
                                                                                            class5.field126[var3++] = 0;
                                                                                            class108.field1763[var4++] = "";
                                                                                            class5.field126[var3++] = 0;
                                                                                        } else {
                                                                                            class5.field126[var3++] = var265.field3523;
                                                                                            class5.field126[var3++] = var265.field1945;
                                                                                            class108.field1763[var4++] = var265.field3524;
                                                                                            class301 var266 = var265.method1464(0);
                                                                                            class5.field126[var3++] = var266.field4914;
                                                                                            class108.field1763[var4++] = var266.field4916;
                                                                                            class5.field126[var3++] = var265.field1951;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (var538 == 6503) {
                                                                                        --var3;
                                                                                        int var267 = class5.field126[var3];
                                                                                        if (~class26.field458 == -11 && class116.field1981 == 0 && ~class189.field3017 == -1 && ~class70.field1165 == -1) {
                                                                                            class5.field126[var3++] = class296.method2039((byte) 90, var267) ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        class5.field126[var3++] = 0;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var538 == -6505) {
                                                                                        --var3;
                                                                                        class72.field1257 = class5.field126[var3];
                                                                                        class116.method893((byte) 7, class142.field2344);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var538 == -6506) {
                                                                                        class5.field126[var3++] = class72.field1257;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var538 == -6507) {
                                                                                        --var3;
                                                                                        int var268 = class5.field126[var3];
                                                                                        class208 var269 = class4.method32((byte) 31, var268);
                                                                                        if (var269 == null) {
                                                                                            class5.field126[var3++] = -1;
                                                                                            class108.field1763[var4++] = "";
                                                                                            class5.field126[var3++] = 0;
                                                                                            class108.field1763[var4++] = "";
                                                                                            class5.field126[var3++] = 0;
                                                                                        } else {
                                                                                            class5.field126[var3++] = var269.field1945;
                                                                                            class108.field1763[var4++] = var269.field3524;
                                                                                            class301 var270 = var269.method1464(arg1);
                                                                                            class5.field126[var3++] = var270.field4914;
                                                                                            class108.field1763[var4++] = var270.field4916;
                                                                                            class5.field126[var3++] = var269.field1951;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    if (~var538 == -6508) {
                                                                                        var3 -= 4;
                                                                                        int var271 = class5.field126[var3];
                                                                                        boolean var272 = class5.field126[var3 + 1] == 1;
                                                                                        boolean var273 = ~class5.field126[var3 + 3] == -2;
                                                                                        int var274 = class5.field126[var3 + 2];
                                                                                        class32.method203(var272, arg1, var273, var271, var274);
                                                                                        continue;
                                                                                    }
                                                                                } else if (var538 >= 6700) {
                                                                                    if (~var538 > -6901) {
                                                                                        if (var538 == 6800) {
                                                                                            --var3;
                                                                                            int var275 = class5.field126[var3];
                                                                                            class195 var276 = class22.method146((byte) -75, var275);
                                                                                            if (var276.field3125 != null) {
                                                                                                class108.field1763[var4++] = var276.field3125;
                                                                                            } else {
                                                                                                class108.field1763[var4++] = "";
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var538 == -6802) {
                                                                                            --var3;
                                                                                            int var277 = class5.field126[var3];
                                                                                            class195 var278 = class22.method146((byte) -48, var277);
                                                                                            class5.field126[var3++] = var278.field3150;
                                                                                            continue;
                                                                                        }
                                                                                        if (var538 == 6802) {
                                                                                            --var3;
                                                                                            int var279 = class5.field126[var3];
                                                                                            class195 var280 = class22.method146((byte) -119, var279);
                                                                                            class5.field126[var3++] = var280.field3124;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var538 == -6804) {
                                                                                            --var3;
                                                                                            int var281 = class5.field126[var3];
                                                                                            class195 var282 = class22.method146((byte) -55, var281);
                                                                                            class5.field126[var3++] = var282.field3139;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (var538 == 6600) {
                                                                                        --var3;
                                                                                        class46.field814 = ~class5.field126[var3] == -2;
                                                                                        class116.method893((byte) 7, class142.field2344);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var538 == -6602) {
                                                                                        class5.field126[var3++] = class46.field814 ? 1 : 0;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (var538 == 6300) {
                                                                                    class5.field126[var3++] = (int) (class188.method1355(46) / 60000L);
                                                                                    continue;
                                                                                }
                                                                                if (var538 == 6301) {
                                                                                    class5.field126[var3++] = (int) (class188.method1355(class284.method1990(arg1, -116)) / 86400000L) + -11745;
                                                                                    continue;
                                                                                }
                                                                                if (var538 == 6302) {
                                                                                    var3 -= 3;
                                                                                    int var283 = class5.field126[var3 + 1];
                                                                                    int var284 = class5.field126[var3 + 2];
                                                                                    int var285 = class5.field126[var3];
                                                                                    class86.field1427.clear();
                                                                                    class86.field1427.set(11, 12);
                                                                                    class86.field1427.set(var284, var283, var285);
                                                                                    class5.field126[var3++] = (int) (class86.field1427.getTime().getTime() / 86400000L) + -11745;
                                                                                    continue;
                                                                                }
                                                                                if (var538 == 6303) {
                                                                                    class86.field1427.clear();
                                                                                    class86.field1427.setTime(new Date(class188.method1355(-115)));
                                                                                    class5.field126[var3++] = class86.field1427.get(1);
                                                                                    continue;
                                                                                }
                                                                                if (var538 == 6304) {
                                                                                    --var3;
                                                                                    int var286 = class5.field126[var3];
                                                                                    boolean var287 = true;
                                                                                    if (var286 >= 0) {
                                                                                        if (~var286 > -1583) {
                                                                                            var287 = ~(var286 % 4) == -1;
                                                                                        } else if (var286 % 4 != 0) {
                                                                                            var287 = false;
                                                                                        } else if (~(var286 % 100) != -1) {
                                                                                            var287 = true;
                                                                                        } else if (var286 % 400 != 0) {
                                                                                            var287 = false;
                                                                                        }
                                                                                    } else {
                                                                                        var287 = (var286 + 1) % 4 == 0;
                                                                                    }
                                                                                    class5.field126[var3++] = var287 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (var538 == 6101) {
                                                                                class5.field126[var3++] = class15.field304;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6103) {
                                                                                class5.field126[var3++] = !class136.method1011(false) ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6104) {
                                                                                class5.field126[var3++] = class79.field1325 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6105) {
                                                                                class5.field126[var3++] = class162.field2636 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6106) {
                                                                                class5.field126[var3++] = !class145.field2388 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6108) {
                                                                                class5.field126[var3++] = class259.field4357 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6109) {
                                                                                class5.field126[var3++] = !class54.field916 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6109) {
                                                                                class5.field126[var3++] = !class190.field3044 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6111) {
                                                                                class5.field126[var3++] = class68.field1142 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6112) {
                                                                                class5.field126[var3++] = class162.field2631;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6112) {
                                                                                class5.field126[var3++] = class197.field3201 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6114) {
                                                                                class5.field126[var3++] = class113.field1934 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6115) {
                                                                                class5.field126[var3++] = class141.field2337 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6116) {
                                                                                class5.field126[var3++] = class265.field4440;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6117) {
                                                                                class5.field126[var3++] = field2977 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6118) {
                                                                                class5.field126[var3++] = class283.field4682;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6119) {
                                                                                class5.field126[var3++] = class289.field4767;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6121) {
                                                                                class5.field126[var3++] = class292.field4785;
                                                                                continue;
                                                                            }
                                                                            if (var538 == 6121) {
                                                                                class5.field126[var3++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6124) {
                                                                                class5.field126[var3++] = class139.method1035();
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6125) {
                                                                                class5.field126[var3++] = class97.field1560;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6127) {
                                                                                class5.field126[var3++] = 0;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6128) {
                                                                                class5.field126[var3++] = !class253.field4291 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                            if (~var538 == -6129) {
                                                                                class5.field126[var3++] = !class245.field4117 ? 0 : 1;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (~var538 == -5401) {
                                                                            var4 -= 2;
                                                                            String var288 = class108.field1763[var4];
                                                                            ++class119.field1991;
                                                                            String var289 = class108.field1763[var4 - -1];
                                                                            --var3;
                                                                            int var290 = class5.field126[var3];
                                                                            class236.field3980.method640((byte) 97, 246);
                                                                            class236.field3980.method1780(class73.method517(-1, var288) - -class73.method517(-1, var289) + 1, 120);
                                                                            class236.field3980.method1786(-25149, var288);
                                                                            class236.field3980.method1786(-25149, var289);
                                                                            class236.field3980.method1780(var290, 87);
                                                                            continue;
                                                                        }
                                                                        if (~var538 == -5402) {
                                                                            var3 -= 2;
                                                                            class284.field4703[class5.field126[var3]] = (short) class62.method427((byte) -108, class5.field126[var3 - -1]);
                                                                            class223.method1582(arg1 ^ 86);
                                                                            class131.method976(-22869);
                                                                            class34.method213(arg1 + 14702);
                                                                            class43.method257((byte) 114);
                                                                            class58.method369((byte) -87);
                                                                            continue;
                                                                        }
                                                                        if (~var538 == -5406) {
                                                                            var3 -= 2;
                                                                            int var291 = class5.field126[var3];
                                                                            int var292 = class5.field126[var3 + 1];
                                                                            if (var291 >= 0 && var291 < 2) {
                                                                                class65.field1104[var291] = new int[var292 << 1][4];
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5406) {
                                                                            var3 -= 7;
                                                                            int var293 = class5.field126[var3 + 1] << 1;
                                                                            int var294 = class5.field126[var3 - -2];
                                                                            int var295 = class5.field126[var3];
                                                                            int var296 = class5.field126[var3 + 3];
                                                                            int var297 = class5.field126[var3 - -4];
                                                                            int var298 = class5.field126[var3 + 6];
                                                                            int var299 = class5.field126[var3 + 5];
                                                                            if (~var295 <= -1 && ~var295 > -3 && class65.field1104[var295] != null && ~var293 <= -1 && class65.field1104[var295].length > var293) {
                                                                                class65.field1104[var295][var293] = new int[] { class15.method84(var294 >> 14, 16383) * 128, var296, class15.method84(16383, var294) * 128, var298 };
                                                                                class65.field1104[var295][var293 + 1] = new int[] { (class15.method84(268427035, var297) >> 14) * 128, var299, class15.method84(16383, var297) * 128 };
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5407) {
                                                                            --var3;
                                                                            int var300 = class65.field1104[class5.field126[var3]].length >> 1;
                                                                            class5.field126[var3++] = var300;
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5411) {
                                                                            if (class64.field1086 != null) {
                                                                                System.exit(0);
                                                                            } else {
                                                                                class107.method801(false, (byte) 119, class224.method1588(103));
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5419) {
                                                                            String var301 = "";
                                                                            if (class11.field199 != null) {
                                                                                if (class11.field199.field3089 == null) {
                                                                                    var301 = class137.method1015(255, class11.field199.field3087);
                                                                                } else {
                                                                                    var301 = (String) class11.field199.field3089;
                                                                                }
                                                                            }
                                                                            class108.field1763[var4++] = var301;
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5420) {
                                                                            class5.field126[var3++] = class83.field1378 == 3 ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (~var538 == -5422) {
                                                                            --var4;
                                                                            String var302 = class108.field1763[var4];
                                                                            --var3;
                                                                            boolean var303 = ~class5.field126[var3] == -2;
                                                                            String var304 = class224.method1588(48) + var302;
                                                                            if (class64.field1086 != null || var303 && class83.field1378 != 3 && class83.field1374.startsWith("win") && !class49.field845) {
                                                                                class47.field818 = var303;
                                                                                class100.field1595 = var304;
                                                                                class220.field3703 = class142.field2344.method585((byte) 115, var304);
                                                                                continue;
                                                                            }
                                                                            class107.method801(var303, (byte) 119, var304);
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5422) {
                                                                            var4 -= 2;
                                                                            String var305 = class108.field1763[var4 - -1];
                                                                            String var306 = class108.field1763[var4];
                                                                            --var3;
                                                                            int var307 = class5.field126[var3];
                                                                            if (~var306.length() < -1) {
                                                                                if (class108.field1776 == null) {
                                                                                    class108.field1776 = new String[class184.field2939[class43.field659]];
                                                                                }
                                                                                class108.field1776[var307] = var306;
                                                                            }
                                                                            if (~var305.length() < -1) {
                                                                                if (class85.field1412 == null) {
                                                                                    class85.field1412 = new String[class184.field2939[class43.field659]];
                                                                                }
                                                                                class85.field1412[var307] = var305;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var538 == -5424) {
                                                                            --var4;
                                                                            System.out.println(class108.field1763[var4]);
                                                                            continue;
                                                                        }
                                                                        if (~var538 == -5425) {
                                                                            var3 -= 11;
                                                                            class103.field1651 = class5.field126[var3];
                                                                            field2980 = class5.field126[var3 + 1];
                                                                            class37.field588 = class5.field126[var3 + 2];
                                                                            class272.field4531 = class5.field126[var3 + 3];
                                                                            class254.field4303 = class5.field126[var3 - -4];
                                                                            class302.field4923 = class5.field126[var3 + 5];
                                                                            class187.field2994 = class5.field126[var3 + 6];
                                                                            class234.field3968 = class5.field126[var3 - -7];
                                                                            class263.field4397 = class5.field126[var3 + 8];
                                                                            class118.field1985 = class5.field126[var3 + 9];
                                                                            class25.field443 = class5.field126[var3 + 10];
                                                                            class25.field445.method1118((byte) 113, class254.field4303);
                                                                            class25.field445.method1118((byte) 99, class302.field4923);
                                                                            class25.field445.method1118((byte) 58, class187.field2994);
                                                                            class25.field445.method1118((byte) 86, class234.field3968);
                                                                            class25.field445.method1118((byte) 104, class263.field4397);
                                                                            class67.field1133 = true;
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5425) {
                                                                            class54.method344(-65536);
                                                                            class67.field1133 = false;
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5426) {
                                                                            --var3;
                                                                            class116.field1976 = class5.field126[var3];
                                                                            continue;
                                                                        }
                                                                        if (var538 == 5427) {
                                                                            var3 -= 2;
                                                                            class135.field2222 = class5.field126[var3];
                                                                            class256.field4327 = class5.field126[var3 - -1];
                                                                            continue;
                                                                        }
                                                                        if (~var538 == -5429) {
                                                                            var3 -= 2;
                                                                            int var308 = class5.field126[var3];
                                                                            int var309 = class5.field126[var3 + 1];
                                                                            class5.field126[var3++] = class126.method938(-11908, var308, var309) ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var538 == -5301) {
                                                                        var3 -= 2;
                                                                        class5.field126[var3++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5301) {
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5303) {
                                                                        class5.field126[var3++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5303) {
                                                                        --var3;
                                                                        class5.field126[var3++] = 0;
                                                                        class5.field126[var3++] = 0;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5305) {
                                                                        byte var310 = -1;
                                                                        class5.field126[var3++] = var310;
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5307) {
                                                                        class5.field126[var3++] = class170.method1271((byte) 99);
                                                                        continue;
                                                                    }
                                                                    if (~var538 == -5308) {
                                                                        --var3;
                                                                        int var311 = class5.field126[var3];
                                                                        if (~var311 > -1 || ~var311 < -3) {
                                                                            var311 = 0;
                                                                        }
                                                                        class151.method1142(false, -1, var311, true, -1);
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5308) {
                                                                        class5.field126[var3++] = class297.field4862;
                                                                        continue;
                                                                    }
                                                                    if (var538 == 5309) {
                                                                        --var3;
                                                                        int var312 = class5.field126[var3];
                                                                        if (~var312 > -1 || ~var312 < -3) {
                                                                            var312 = 0;
                                                                        }
                                                                        class297.field4862 = var312;
                                                                        class116.method893((byte) 7, class142.field2344);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (~var538 == -5001) {
                                                                    class5.field126[var3++] = class310.field4987;
                                                                    continue;
                                                                }
                                                                if (var538 == 5001) {
                                                                    var3 -= 3;
                                                                    ++class283.field4697;
                                                                    class310.field4987 = class5.field126[var3];
                                                                    class196.field3159 = class5.field126[var3 + 1];
                                                                    class223.field3758 = class5.field126[var3 + 2];
                                                                    class236.field3980.method640((byte) 97, 35);
                                                                    class236.field3980.method1780(class310.field4987, 88);
                                                                    class236.field3980.method1780(class196.field3159, 100);
                                                                    class236.field3980.method1780(class223.field3758, 87);
                                                                    continue;
                                                                }
                                                                if (~var538 == -5003) {
                                                                    var3 -= 2;
                                                                    ++class29.field488;
                                                                    --var4;
                                                                    String var313 = class108.field1763[var4];
                                                                    int var314 = class5.field126[var3 - -1];
                                                                    int var315 = class5.field126[var3];
                                                                    class236.field3980.method640((byte) 97, 222);
                                                                    class236.field3980.method1780(2 + class73.method517(~arg1, var313), 91);
                                                                    class236.field3980.method1786(arg1 ^ -25149, var313);
                                                                    class236.field3980.method1780(var315 - 1, 100);
                                                                    class236.field3980.method1780(var314, arg1 + 93);
                                                                    continue;
                                                                }
                                                                if (var538 == 5003) {
                                                                    --var3;
                                                                    int var316 = class5.field126[var3];
                                                                    String var317 = null;
                                                                    if (var316 < 100) {
                                                                        var317 = class131.field2162[var316];
                                                                    }
                                                                    if (var317 == null) {
                                                                        var317 = "";
                                                                    }
                                                                    class108.field1763[var4++] = var317;
                                                                    continue;
                                                                }
                                                                if (var538 == 5004) {
                                                                    --var3;
                                                                    int var318 = class5.field126[var3];
                                                                    int var319 = -1;
                                                                    if (~var318 > -101 && class131.field2162[var318] != null) {
                                                                        var319 = class35.field550[var318];
                                                                    }
                                                                    class5.field126[var3++] = var319;
                                                                    continue;
                                                                }
                                                                if (var538 == 5005) {
                                                                    class5.field126[var3++] = class196.field3159;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5009) {
                                                                    --var4;
                                                                    String var320 = class108.field1763[var4];
                                                                    if (var320.startsWith("::")) {
                                                                        class189.method1359(var320, false);
                                                                        continue;
                                                                    }
                                                                    if (class233.field3942 == 0 && (class69.field1163 && !class146.field2402 || class122.field2042)) {
                                                                        continue;
                                                                    }
                                                                    String var321 = var320.toLowerCase();
                                                                    ++class264.field4399;
                                                                    byte var322 = 0;
                                                                    if (!var321.startsWith(class25.field452)) {
                                                                        if (!var321.startsWith(class31.field506)) {
                                                                            if (var321.startsWith(class65.field1100)) {
                                                                                var320 = var320.substring(class65.field1100.length());
                                                                                var322 = 2;
                                                                            } else if (var321.startsWith(class17.field347)) {
                                                                                var322 = 3;
                                                                                var320 = var320.substring(class17.field347.length());
                                                                            } else if (var321.startsWith(class179.field2863)) {
                                                                                var322 = 4;
                                                                                var320 = var320.substring(class179.field2863.length());
                                                                            } else if (var321.startsWith(class54.field968)) {
                                                                                var322 = 5;
                                                                                var320 = var320.substring(class54.field968.length());
                                                                            } else if (var321.startsWith(class182.field2906)) {
                                                                                var322 = 6;
                                                                                var320 = var320.substring(class182.field2906.length());
                                                                            } else if (var321.startsWith(class276.field4606)) {
                                                                                var320 = var320.substring(class276.field4606.length());
                                                                                var322 = 7;
                                                                            } else if (!var321.startsWith(class30.field500)) {
                                                                                if (var321.startsWith(class110.field1826)) {
                                                                                    var320 = var320.substring(class110.field1826.length());
                                                                                    var322 = 9;
                                                                                } else if (!var321.startsWith(class293.field4807)) {
                                                                                    if (!var321.startsWith(class67.field1130)) {
                                                                                        if (~class49.field834 != -1) {
                                                                                            if (!var321.startsWith(class215.field3627)) {
                                                                                                if (!var321.startsWith(class1.field43)) {
                                                                                                    if (var321.startsWith(class292.field4784)) {
                                                                                                        var322 = 2;
                                                                                                        var320 = var320.substring(class292.field4784.length());
                                                                                                    } else if (var321.startsWith(class80.field1342)) {
                                                                                                        var322 = 3;
                                                                                                        var320 = var320.substring(class80.field1342.length());
                                                                                                    } else if (var321.startsWith(class224.field3786)) {
                                                                                                        var320 = var320.substring(class224.field3786.length());
                                                                                                        var322 = 4;
                                                                                                    } else if (!var321.startsWith(class86.field1431)) {
                                                                                                        if (!var321.startsWith(class313.field5054)) {
                                                                                                            if (!var321.startsWith(class124.field2098)) {
                                                                                                                if (!var321.startsWith(class3.field110)) {
                                                                                                                    if (!var321.startsWith(class42.field640)) {
                                                                                                                        if (var321.startsWith(class167.field2701)) {
                                                                                                                            var322 = 10;
                                                                                                                            var320 = var320.substring(class167.field2701.length());
                                                                                                                        } else if (var321.startsWith(class227.field3848)) {
                                                                                                                            var322 = 11;
                                                                                                                            var320 = var320.substring(class227.field3848.length());
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var320 = var320.substring(class42.field640.length());
                                                                                                                        var322 = 9;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var320 = var320.substring(class3.field110.length());
                                                                                                                    var322 = 8;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var320 = var320.substring(class124.field2098.length());
                                                                                                                var322 = 7;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var322 = 6;
                                                                                                            var320 = var320.substring(class313.field5054.length());
                                                                                                        }
                                                                                                    } else {
                                                                                                        var320 = var320.substring(class86.field1431.length());
                                                                                                        var322 = 5;
                                                                                                    }
                                                                                                } else {
                                                                                                    var322 = 1;
                                                                                                    var320 = var320.substring(class1.field43.length());
                                                                                                }
                                                                                            } else {
                                                                                                var322 = 0;
                                                                                                var320 = var320.substring(class215.field3627.length());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var322 = 11;
                                                                                        var320 = var320.substring(class67.field1130.length());
                                                                                    }
                                                                                } else {
                                                                                    var322 = 10;
                                                                                    var320 = var320.substring(class293.field4807.length());
                                                                                }
                                                                            } else {
                                                                                var320 = var320.substring(class30.field500.length());
                                                                                var322 = 8;
                                                                            }
                                                                        } else {
                                                                            var320 = var320.substring(class31.field506.length());
                                                                            var322 = 1;
                                                                        }
                                                                    } else {
                                                                        var320 = var320.substring(class25.field452.length());
                                                                        var322 = 0;
                                                                    }
                                                                    String var323 = var320.toLowerCase();
                                                                    byte var324 = 0;
                                                                    if (!var323.startsWith(class208.field3517)) {
                                                                        if (!var323.startsWith(class119.field1998)) {
                                                                            if (var323.startsWith(class311.field4999)) {
                                                                                var324 = 3;
                                                                                var320 = var320.substring(class311.field4999.length());
                                                                            } else if (var323.startsWith(class3.field103)) {
                                                                                var324 = 4;
                                                                                var320 = var320.substring(class3.field103.length());
                                                                            } else if (var323.startsWith(class137.field2257)) {
                                                                                var324 = 5;
                                                                                var320 = var320.substring(class137.field2257.length());
                                                                            } else if (class49.field834 != 0) {
                                                                                if (var323.startsWith(class213.field3595)) {
                                                                                    var320 = var320.substring(class213.field3595.length());
                                                                                    var324 = 1;
                                                                                } else if (!var323.startsWith(class224.field3783)) {
                                                                                    if (!var323.startsWith(class169.field2737)) {
                                                                                        if (var323.startsWith(class21.field382)) {
                                                                                            var324 = 4;
                                                                                            var320 = var320.substring(class21.field382.length());
                                                                                        } else if (var323.startsWith(class23.field426)) {
                                                                                            var320 = var320.substring(class23.field426.length());
                                                                                            var324 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        var324 = 3;
                                                                                        var320 = var320.substring(class169.field2737.length());
                                                                                    }
                                                                                } else {
                                                                                    var324 = 2;
                                                                                    var320 = var320.substring(class224.field3783.length());
                                                                                }
                                                                            }
                                                                        } else {
                                                                            var324 = 2;
                                                                            var320 = var320.substring(class119.field1998.length());
                                                                        }
                                                                    } else {
                                                                        var320 = var320.substring(class208.field3517.length());
                                                                        var324 = 1;
                                                                    }
                                                                    class236.field3980.method640((byte) 97, 107);
                                                                    class236.field3980.method1780(0, 67);
                                                                    int var325 = class236.field3980.field4160;
                                                                    class236.field3980.method1780(var322, arg1 ^ 125);
                                                                    class236.field3980.method1780(var324, 83);
                                                                    class226.method1605(class236.field3980, var320, -28537);
                                                                    class236.field3980.method1797(-var325 + class236.field3980.field4160, (byte) -106);
                                                                    continue;
                                                                }
                                                                if (~var538 == -5010) {
                                                                    var4 -= 2;
                                                                    String var326 = class108.field1763[var4];
                                                                    String var327 = class108.field1763[var4 - -1];
                                                                    if (class233.field3942 != 0 || (!class69.field1163 || class146.field2402) && !class122.field2042) {
                                                                        class236.field3980.method640((byte) 97, 94);
                                                                        ++class272.field4553;
                                                                        class236.field3980.method1780(0, arg1 + 104);
                                                                        int var328 = class236.field3980.field4160;
                                                                        class236.field3980.method1786(arg1 ^ -25149, var326);
                                                                        class226.method1605(class236.field3980, var327, -28537);
                                                                        class236.field3980.method1797(class236.field3980.field4160 - var328, (byte) -106);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var538 == 5010) {
                                                                    --var3;
                                                                    int var329 = class5.field126[var3];
                                                                    String var330 = null;
                                                                    if (~var329 > -101) {
                                                                        var330 = class51.field866[var329];
                                                                    }
                                                                    if (var330 == null) {
                                                                        var330 = "";
                                                                    }
                                                                    class108.field1763[var4++] = var330;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5012) {
                                                                    --var3;
                                                                    int var331 = class5.field126[var3];
                                                                    String var332 = null;
                                                                    if (var331 < 100) {
                                                                        var332 = class27.field467[var331];
                                                                    }
                                                                    if (var332 == null) {
                                                                        var332 = "";
                                                                    }
                                                                    class108.field1763[var4++] = var332;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5013) {
                                                                    int var333 = -1;
                                                                    --var3;
                                                                    int var334 = class5.field126[var3];
                                                                    if (var334 < 100) {
                                                                        var333 = class286.field4740[var334];
                                                                    }
                                                                    class5.field126[var3++] = var333;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5016) {
                                                                    String var335;
                                                                    if (class16.field314 != null && class16.field314.field2076 != null) {
                                                                        var335 = class16.field314.method927(arg1 ^ -242, true);
                                                                    } else {
                                                                        var335 = class33.field532;
                                                                    }
                                                                    class108.field1763[var4++] = var335;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5019) {
                                                                    --var3;
                                                                    int var336 = class5.field126[var3];
                                                                    int var337 = 0;
                                                                    if (~var336 > -101 && class131.field2162[var336] != null) {
                                                                        var337 = class35.field550[var336];
                                                                    }
                                                                    class5.field126[var3++] = var337;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5020) {
                                                                    --var3;
                                                                    int var338 = class5.field126[var3];
                                                                    String var339 = null;
                                                                    if (~var338 > -101) {
                                                                        var339 = class108.field1785[var338];
                                                                    }
                                                                    if (var339 == null) {
                                                                        var339 = "";
                                                                    }
                                                                    class108.field1763[var4++] = var339;
                                                                    continue;
                                                                }
                                                                if (var538 == 5016) {
                                                                    class5.field126[var3++] = class223.field3758;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5018) {
                                                                    class5.field126[var3++] = class200.field3224;
                                                                    continue;
                                                                }
                                                                if (var538 == 5050) {
                                                                    --var3;
                                                                    int var340 = class5.field126[var3];
                                                                    class108.field1763[var4++] = class249.method1820(true, var340).field1087;
                                                                    continue;
                                                                }
                                                                if (var538 == 5051) {
                                                                    --var3;
                                                                    int var341 = class5.field126[var3];
                                                                    class64 var342 = class249.method1820(true, var341);
                                                                    if (var342.field1083 != null) {
                                                                        class5.field126[var3++] = var342.field1083.length;
                                                                    } else {
                                                                        class5.field126[var3++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var538 == -5053) {
                                                                    var3 -= 2;
                                                                    int var343 = class5.field126[var3];
                                                                    int var344 = class5.field126[var3 + 1];
                                                                    class64 var345 = class249.method1820(true, var343);
                                                                    int var346 = var345.field1083[var344];
                                                                    class5.field126[var3++] = var346;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5054) {
                                                                    --var3;
                                                                    int var347 = class5.field126[var3];
                                                                    class64 var348 = class249.method1820(true, var347);
                                                                    if (var348.field1077 == null) {
                                                                        class5.field126[var3++] = 0;
                                                                    } else {
                                                                        class5.field126[var3++] = var348.field1077.length;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var538 == 5054) {
                                                                    var3 -= 2;
                                                                    int var349 = class5.field126[var3];
                                                                    int var350 = class5.field126[var3 + 1];
                                                                    class5.field126[var3++] = class249.method1820(true, var349).field1077[var350];
                                                                    continue;
                                                                }
                                                                if (~var538 == -5056) {
                                                                    --var3;
                                                                    int var351 = class5.field126[var3];
                                                                    class108.field1763[var4++] = class263.method1865((byte) -79, var351).method1895(0);
                                                                    continue;
                                                                }
                                                                if (var538 == 5056) {
                                                                    --var3;
                                                                    int var352 = class5.field126[var3];
                                                                    class270 var353 = class263.method1865((byte) -79, var352);
                                                                    if (var353.field4491 != null) {
                                                                        class5.field126[var3++] = var353.field4491.length;
                                                                    } else {
                                                                        class5.field126[var3++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var538 == -5058) {
                                                                    var3 -= 2;
                                                                    int var354 = class5.field126[var3 - -1];
                                                                    int var355 = class5.field126[var3];
                                                                    class5.field126[var3++] = class263.method1865((byte) -79, var355).field4491[var354];
                                                                    continue;
                                                                }
                                                                if (~var538 == -5059) {
                                                                    class64.field1074 = new class30();
                                                                    --var3;
                                                                    class64.field1074.field502 = class5.field126[var3];
                                                                    class64.field1074.field495 = class263.method1865((byte) -79, class64.field1074.field502);
                                                                    class64.field1074.field496 = new int[class64.field1074.field495.method1907(-1)];
                                                                    continue;
                                                                }
                                                                if (~var538 == -5060) {
                                                                    class236.field3980.method640((byte) 97, 168);
                                                                    class236.field3980.method1780(0, 78);
                                                                    ++class289.field4759;
                                                                    int var356 = class236.field3980.field4160;
                                                                    class236.field3980.method1780(0, 68);
                                                                    class236.field3980.method1771(class64.field1074.field502, (byte) 30);
                                                                    class64.field1074.field495.method1899(class236.field3980, -52, class64.field1074.field496);
                                                                    class236.field3980.method1797(-var356 + class236.field3980.field4160, (byte) -106);
                                                                    continue;
                                                                }
                                                                if (var538 == 5060) {
                                                                    ++class221.field3719;
                                                                    --var4;
                                                                    String var357 = class108.field1763[var4];
                                                                    class236.field3980.method640((byte) 97, 250);
                                                                    class236.field3980.method1780(0, 115);
                                                                    int var358 = class236.field3980.field4160;
                                                                    class236.field3980.method1786(-25149, var357);
                                                                    class236.field3980.method1771(class64.field1074.field502, (byte) 30);
                                                                    class64.field1074.field495.method1899(class236.field3980, -30, class64.field1074.field496);
                                                                    class236.field3980.method1797(-var358 + class236.field3980.field4160, (byte) -106);
                                                                    continue;
                                                                }
                                                                if (~var538 == -5062) {
                                                                    ++class289.field4759;
                                                                    class236.field3980.method640((byte) 97, 168);
                                                                    class236.field3980.method1780(0, arg1 ^ 66);
                                                                    int var359 = class236.field3980.field4160;
                                                                    class236.field3980.method1780(1, 89);
                                                                    class236.field3980.method1771(class64.field1074.field502, (byte) 30);
                                                                    class64.field1074.field495.method1899(class236.field3980, arg1 + -86, class64.field1074.field496);
                                                                    class236.field3980.method1797(-var359 + class236.field3980.field4160, (byte) -106);
                                                                    continue;
                                                                }
                                                                if (var538 == 5062) {
                                                                    var3 -= 2;
                                                                    int var360 = class5.field126[var3];
                                                                    int var361 = class5.field126[var3 - -1];
                                                                    class5.field126[var3++] = class249.method1820(true, var360).field1079[var361];
                                                                    continue;
                                                                }
                                                                if (~var538 == -5064) {
                                                                    var3 -= 2;
                                                                    int var362 = class5.field126[var3];
                                                                    int var363 = class5.field126[var3 + 1];
                                                                    class5.field126[var3++] = class249.method1820(true, var362).field1071[var363];
                                                                    continue;
                                                                }
                                                                if (~var538 == -5065) {
                                                                    var3 -= 2;
                                                                    int var364 = class5.field126[var3];
                                                                    int var365 = class5.field126[var3 + 1];
                                                                    if (~var365 != 0) {
                                                                        class5.field126[var3++] = class249.method1820(true, var364).method435(115, (char) var365);
                                                                    } else {
                                                                        class5.field126[var3++] = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var538 == 5065) {
                                                                    var3 -= 2;
                                                                    int var366 = class5.field126[var3];
                                                                    int var367 = class5.field126[var3 - -1];
                                                                    if (var367 != -1) {
                                                                        class5.field126[var3++] = class249.method1820(true, var366).method433(class284.method1990(arg1, 0), (char) var367);
                                                                    } else {
                                                                        class5.field126[var3++] = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var538 == -5067) {
                                                                    --var3;
                                                                    int var368 = class5.field126[var3];
                                                                    class5.field126[var3++] = class263.method1865((byte) -79, var368).method1907(-1);
                                                                    continue;
                                                                }
                                                                if (~var538 == -5068) {
                                                                    var3 -= 2;
                                                                    int var369 = class5.field126[var3];
                                                                    int var370 = class5.field126[var3 + 1];
                                                                    int var371 = class263.method1865((byte) -79, var369).method1903(true, var370);
                                                                    class5.field126[var3++] = var371;
                                                                    continue;
                                                                }
                                                                if (var538 == 5068) {
                                                                    var3 -= 2;
                                                                    int var372 = class5.field126[var3];
                                                                    int var373 = class5.field126[var3 + 1];
                                                                    class64.field1074.field496[var372] = var373;
                                                                    continue;
                                                                }
                                                                if (var538 == 5069) {
                                                                    var3 -= 2;
                                                                    int var374 = class5.field126[var3];
                                                                    int var375 = class5.field126[var3 + 1];
                                                                    class64.field1074.field496[var374] = var375;
                                                                    continue;
                                                                }
                                                                if (~var538 == -5071) {
                                                                    var3 -= 3;
                                                                    int var376 = class5.field126[var3];
                                                                    int var377 = class5.field126[var3 + 1];
                                                                    int var378 = class5.field126[var3 + 2];
                                                                    class270 var379 = class263.method1865((byte) -79, var376);
                                                                    if (~var379.method1903(true, var377) != -1) {
                                                                        throw new RuntimeException("bad command");
                                                                    }
                                                                    class5.field126[var3++] = var379.method1897(var378, var377, (byte) 97);
                                                                    continue;
                                                                }
                                                                if (~var538 == -5072) {
                                                                    --var4;
                                                                    String var380 = class108.field1763[var4];
                                                                    --var3;
                                                                    boolean var381 = ~class5.field126[var3] == -2;
                                                                    class103.method747(arg1 ^ -121, var381, var380);
                                                                    class5.field126[var3++] = class45.field706;
                                                                    continue;
                                                                }
                                                                if (var538 == 5072) {
                                                                    if (class246.field4127 != null && class45.field706 > class80.field1344) {
                                                                        class5.field126[var3++] = class15.method84(class246.field4127[class80.field1344++], 65535);
                                                                        continue;
                                                                    }
                                                                    class5.field126[var3++] = -1;
                                                                    continue;
                                                                }
                                                                if (var538 == 5073) {
                                                                    class80.field1344 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (~var538 == -4201) {
                                                                --var3;
                                                                int var382 = class5.field126[var3];
                                                                class108.field1763[var4++] = class13.method75(false, var382).field1209;
                                                                continue;
                                                            }
                                                            if (~var538 == -4202) {
                                                                var3 -= 2;
                                                                int var383 = class5.field126[var3 + 1];
                                                                int var384 = class5.field126[var3];
                                                                class71 var385 = class13.method75(false, var384);
                                                                if (~var383 <= -2 && var383 <= 5 && var385.field1240[var383 + -1] != null) {
                                                                    class108.field1763[var4++] = var385.field1240[var383 + -1];
                                                                    continue;
                                                                }
                                                                class108.field1763[var4++] = "";
                                                                continue;
                                                            }
                                                            if (~var538 == -4203) {
                                                                var3 -= 2;
                                                                int var386 = class5.field126[var3];
                                                                int var387 = class5.field126[var3 + 1];
                                                                class71 var388 = class13.method75(false, var386);
                                                                if (~var387 <= -2 && var387 <= 5 && var388.field1200[var387 + -1] != null) {
                                                                    class108.field1763[var4++] = var388.field1200[var387 + -1];
                                                                    continue;
                                                                }
                                                                class108.field1763[var4++] = "";
                                                                continue;
                                                            }
                                                            if (~var538 == -4204) {
                                                                --var3;
                                                                int var389 = class5.field126[var3];
                                                                class5.field126[var3++] = class13.method75(false, var389).field1203;
                                                                continue;
                                                            }
                                                            if (~var538 == -4205) {
                                                                --var3;
                                                                int var390 = class5.field126[var3];
                                                                class5.field126[var3++] = ~class13.method75(false, var390).field1183 == -2 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var538 == -4206) {
                                                                --var3;
                                                                int var391 = class5.field126[var3];
                                                                class71 var392 = class13.method75(false, var391);
                                                                if (~var392.field1195 == 0 && var392.field1198 >= 0) {
                                                                    class5.field126[var3++] = var392.field1198;
                                                                    continue;
                                                                }
                                                                class5.field126[var3++] = var391;
                                                                continue;
                                                            }
                                                            if (var538 == 4206) {
                                                                --var3;
                                                                int var393 = class5.field126[var3];
                                                                class71 var394 = class13.method75(false, var393);
                                                                if (var394.field1195 >= 0 && var394.field1198 >= 0) {
                                                                    class5.field126[var3++] = var394.field1198;
                                                                    continue;
                                                                }
                                                                class5.field126[var3++] = var393;
                                                                continue;
                                                            }
                                                            if (var538 == 4207) {
                                                                --var3;
                                                                int var395 = class5.field126[var3];
                                                                class5.field126[var3++] = class13.method75(false, var395).field1224 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var538 == -4209) {
                                                                var3 -= 2;
                                                                int var396 = class5.field126[var3];
                                                                int var397 = class5.field126[var3 + 1];
                                                                class86 var398 = class69.method471(var397, (byte) 28);
                                                                if (!var398.method604((byte) 14)) {
                                                                    class5.field126[var3++] = class13.method75(false, var396).method506(var398.field1423, var397, class284.method1990(arg1, 11773));
                                                                } else {
                                                                    class108.field1763[var4++] = class13.method75(false, var396).method507(var397, var398.field1424, -73);
                                                                }
                                                                continue;
                                                            }
                                                            if (~var538 == -4211) {
                                                                --var4;
                                                                String var399 = class108.field1763[var4];
                                                                --var3;
                                                                int var400 = class5.field126[var3];
                                                                class135.method1002(var399, -22655, ~var400 == -2);
                                                                class5.field126[var3++] = class45.field706;
                                                                continue;
                                                            }
                                                            if (~var538 == -4212) {
                                                                if (class246.field4127 != null && ~class80.field1344 > ~class45.field706) {
                                                                    class5.field126[var3++] = class15.method84(class246.field4127[class80.field1344++], 65535);
                                                                    continue;
                                                                }
                                                                class5.field126[var3++] = -1;
                                                                continue;
                                                            }
                                                            if (~var538 == -4213) {
                                                                class80.field1344 = 0;
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (var538 == 4000) {
                                                            var3 -= 2;
                                                            int var401 = class5.field126[var3];
                                                            int var402 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = var401 + var402;
                                                            continue;
                                                        }
                                                        if (~var538 == -4002) {
                                                            var3 -= 2;
                                                            int var403 = class5.field126[var3];
                                                            int var404 = class5.field126[var3 - -1];
                                                            class5.field126[var3++] = -var404 + var403;
                                                            continue;
                                                        }
                                                        if (~var538 == -4003) {
                                                            var3 -= 2;
                                                            int var405 = class5.field126[var3];
                                                            int var406 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = var405 * var406;
                                                            continue;
                                                        }
                                                        if (var538 == 4003) {
                                                            var3 -= 2;
                                                            int var407 = class5.field126[var3];
                                                            int var408 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = var407 / var408;
                                                            continue;
                                                        }
                                                        if (var538 == 4004) {
                                                            --var3;
                                                            int var409 = class5.field126[var3];
                                                            class5.field126[var3++] = (int) ((double) var409 * Math.random());
                                                            continue;
                                                        }
                                                        if (var538 == 4005) {
                                                            --var3;
                                                            int var410 = class5.field126[var3];
                                                            class5.field126[var3++] = (int) ((double) (var410 + 1) * Math.random());
                                                            continue;
                                                        }
                                                        if (var538 == 4006) {
                                                            var3 -= 5;
                                                            int var411 = class5.field126[var3];
                                                            int var412 = class5.field126[var3 + 1];
                                                            int var413 = class5.field126[var3 + 3];
                                                            int var414 = class5.field126[var3 + 2];
                                                            int var415 = class5.field126[var3 + 4];
                                                            class5.field126[var3++] = (-var411 + var412) * (-var414 + var415) / (var413 - var414) + var411;
                                                            continue;
                                                        }
                                                        if (var538 == 4007) {
                                                            var3 -= 2;
                                                            long var416 = (long) class5.field126[var3];
                                                            long var418 = (long) class5.field126[var3 + 1];
                                                            class5.field126[var3++] = (int) (var416 * var418 / 100L + var416);
                                                            continue;
                                                        }
                                                        if (~var538 == -4009) {
                                                            var3 -= 2;
                                                            int var420 = class5.field126[var3];
                                                            int var421 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = class312.method2107(var420, 1 << var421);
                                                            continue;
                                                        }
                                                        if (~var538 == -4010) {
                                                            var3 -= 2;
                                                            int var422 = class5.field126[var3];
                                                            int var423 = class5.field126[var3 - -1];
                                                            class5.field126[var3++] = class15.method84(var422, -(1 << var423) + -1);
                                                            continue;
                                                        }
                                                        if (var538 == 4010) {
                                                            var3 -= 2;
                                                            int var424 = class5.field126[var3];
                                                            int var425 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = ~class15.method84(1 << var425, var424) != -1 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var538 == -4012) {
                                                            var3 -= 2;
                                                            int var426 = class5.field126[var3];
                                                            int var427 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = var426 % var427;
                                                            continue;
                                                        }
                                                        if (~var538 == -4013) {
                                                            var3 -= 2;
                                                            int var428 = class5.field126[var3];
                                                            int var429 = class5.field126[var3 + 1];
                                                            if (var428 == 0) {
                                                                class5.field126[var3++] = 0;
                                                            } else {
                                                                class5.field126[var3++] = (int) Math.pow((double) var428, (double) var429);
                                                            }
                                                            continue;
                                                        }
                                                        if (var538 == 4013) {
                                                            var3 -= 2;
                                                            int var430 = class5.field126[var3 - -1];
                                                            int var431 = class5.field126[var3];
                                                            if (var431 != 0) {
                                                                if (var430 != 0) {
                                                                    class5.field126[var3++] = (int) Math.pow((double) var431, 1.0D / (double) var430);
                                                                } else {
                                                                    class5.field126[var3++] = Integer.MAX_VALUE;
                                                                }
                                                            } else {
                                                                class5.field126[var3++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (var538 == 4014) {
                                                            var3 -= 2;
                                                            int var432 = class5.field126[var3 - -1];
                                                            int var433 = class5.field126[var3];
                                                            class5.field126[var3++] = class15.method84(var433, var432);
                                                            continue;
                                                        }
                                                        if (~var538 == -4016) {
                                                            var3 -= 2;
                                                            int var434 = class5.field126[var3];
                                                            int var435 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = class312.method2107(var435, var434);
                                                            continue;
                                                        }
                                                        if (var538 == 4016) {
                                                            var3 -= 2;
                                                            int var436 = class5.field126[var3];
                                                            int var437 = class5.field126[var3 - -1];
                                                            class5.field126[var3++] = var436 >= var437 ? var437 : var436;
                                                            continue;
                                                        }
                                                        if (~var538 == -4018) {
                                                            var3 -= 2;
                                                            int var438 = class5.field126[var3];
                                                            int var439 = class5.field126[var3 + 1];
                                                            class5.field126[var3++] = ~var438 < ~var439 ? var438 : var439;
                                                            continue;
                                                        }
                                                        if (~var538 == -4019) {
                                                            var3 -= 3;
                                                            long var440 = (long) class5.field126[var3 - -2];
                                                            long var442 = (long) class5.field126[var3 + 1];
                                                            long var444 = (long) class5.field126[var3];
                                                            class5.field126[var3++] = (int) (var440 * var444 / var442);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (var538 == 3600) {
                                                        if (~class163.field2643 != -1) {
                                                            if (class163.field2643 == 1) {
                                                                class5.field126[var3++] = -1;
                                                            } else {
                                                                class5.field126[var3++] = class76.field1296;
                                                            }
                                                        } else {
                                                            class5.field126[var3++] = -2;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var538 == -3602) {
                                                        --var3;
                                                        int var446 = class5.field126[var3];
                                                        if (class163.field2643 == 2 && ~var446 > ~class76.field1296) {
                                                            class108.field1763[var4++] = class190.field3040[var446];
                                                            if (class94.field1537[var446] == null) {
                                                                class108.field1763[var4++] = "";
                                                            } else {
                                                                class108.field1763[var4++] = class94.field1537[var446];
                                                            }
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                    if (~var538 == -3603) {
                                                        --var3;
                                                        int var447 = class5.field126[var3];
                                                        if (~class163.field2643 == -3 && var447 < class76.field1296) {
                                                            class5.field126[var3++] = class217.field3659[var447];
                                                            continue;
                                                        }
                                                        class5.field126[var3++] = 0;
                                                        continue;
                                                    }
                                                    if (var538 == 3603) {
                                                        --var3;
                                                        int var448 = class5.field126[var3];
                                                        if (~class163.field2643 == -3 && ~class76.field1296 < ~var448) {
                                                            class5.field126[var3++] = class5.field123[var448];
                                                            continue;
                                                        }
                                                        class5.field126[var3++] = 0;
                                                        continue;
                                                    }
                                                    if (var538 == 3604) {
                                                        --var4;
                                                        String var449 = class108.field1763[var4];
                                                        --var3;
                                                        int var450 = class5.field126[var3];
                                                        class221.method1571(122, var450, var449);
                                                        continue;
                                                    }
                                                    if (var538 == 3605) {
                                                        --var4;
                                                        String var451 = class108.field1763[var4];
                                                        class175.method1291(var451, (byte) -119);
                                                        continue;
                                                    }
                                                    if (var538 == 3606) {
                                                        --var4;
                                                        String var452 = class108.field1763[var4];
                                                        class127.method943(17160, var452);
                                                        continue;
                                                    }
                                                    if (~var538 == -3608) {
                                                        --var4;
                                                        String var453 = class108.field1763[var4];
                                                        class123.method934(var453, arg1 ^ 88, false);
                                                        continue;
                                                    }
                                                    if (~var538 == -3609) {
                                                        --var4;
                                                        String var454 = class108.field1763[var4];
                                                        class223.method1587(-108, var454);
                                                        continue;
                                                    }
                                                    if (~var538 == -3610) {
                                                        --var4;
                                                        String var455 = class108.field1763[var4];
                                                        if (var455.startsWith("<img=0>") || var455.startsWith("<img=1>")) {
                                                            var455 = var455.substring(7);
                                                        }
                                                        class5.field126[var3++] = !class89.method623(class284.method1990(arg1, 1100172428), var455) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var538 == 3610) {
                                                        --var3;
                                                        int var456 = class5.field126[var3];
                                                        if (~class163.field2643 == -3 && class76.field1296 > var456) {
                                                            class108.field1763[var4++] = class108.field1784[var456];
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                    if (var538 == 3611) {
                                                        if (class58.field1025 != null) {
                                                            class108.field1763[var4++] = class313.method2116(111, class58.field1025);
                                                        } else {
                                                            class108.field1763[var4++] = "";
                                                        }
                                                        continue;
                                                    }
                                                    if (var538 == 3612) {
                                                        if (class58.field1025 != null) {
                                                            class5.field126[var3++] = class34.field549;
                                                        } else {
                                                            class5.field126[var3++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (var538 == 3613) {
                                                        --var3;
                                                        int var457 = class5.field126[var3];
                                                        if (class58.field1025 != null && ~var457 > ~class34.field549) {
                                                            class108.field1763[var4++] = class272.field4534[var457].field1349;
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                    if (var538 == 3614) {
                                                        --var3;
                                                        int var458 = class5.field126[var3];
                                                        if (class58.field1025 != null && class34.field549 > var458) {
                                                            class5.field126[var3++] = class272.field4534[var458].field1337;
                                                            continue;
                                                        }
                                                        class5.field126[var3++] = 0;
                                                        continue;
                                                    }
                                                    if (~var538 == -3616) {
                                                        --var3;
                                                        int var459 = class5.field126[var3];
                                                        if (class58.field1025 != null && ~var459 > ~class34.field549) {
                                                            class5.field126[var3++] = class272.field4534[var459].field1339;
                                                            continue;
                                                        }
                                                        class5.field126[var3++] = 0;
                                                        continue;
                                                    }
                                                    if (~var538 == -3617) {
                                                        class5.field126[var3++] = class151.field2529;
                                                        continue;
                                                    }
                                                    if (~var538 == -3618) {
                                                        --var4;
                                                        String var460 = class108.field1763[var4];
                                                        class72.method511((byte) -87, var460);
                                                        continue;
                                                    }
                                                    if (~var538 == -3619) {
                                                        class5.field126[var3++] = class130.field2157;
                                                        continue;
                                                    }
                                                    if (var538 == 3619) {
                                                        --var4;
                                                        String var461 = class108.field1763[var4];
                                                        class109.method816(26, var461);
                                                        continue;
                                                    }
                                                    if (~var538 == -3621) {
                                                        class81.method563(arg1 ^ -24898);
                                                        continue;
                                                    }
                                                    if (~var538 == -3622) {
                                                        if (class163.field2643 != 0) {
                                                            class5.field126[var3++] = class86.field1425;
                                                        } else {
                                                            class5.field126[var3++] = -1;
                                                        }
                                                        continue;
                                                    }
                                                    if (var538 == 3622) {
                                                        --var3;
                                                        int var462 = class5.field126[var3];
                                                        if (class163.field2643 != 0 && ~var462 > ~class86.field1425) {
                                                            class108.field1763[var4++] = class180.field2876[var462];
                                                            if (class122.field2045[var462] == null) {
                                                                class108.field1763[var4++] = "";
                                                            } else {
                                                                class108.field1763[var4++] = class122.field2045[var462];
                                                            }
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                    if (~var538 == -3624) {
                                                        --var4;
                                                        String var463 = class108.field1763[var4];
                                                        if (var463.startsWith("<img=0>") || var463.startsWith("<img=1>")) {
                                                            var463 = var463.substring(7);
                                                        }
                                                        class5.field126[var3++] = !class42.method255((byte) -95, var463) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var538 == 3624) {
                                                        --var3;
                                                        int var464 = class5.field126[var3];
                                                        if (class272.field4534 != null && class34.field549 > var464 && class272.field4534[var464].field1343.equalsIgnoreCase(class16.field314.field2069)) {
                                                            class5.field126[var3++] = 1;
                                                            continue;
                                                        }
                                                        class5.field126[var3++] = 0;
                                                        continue;
                                                    }
                                                    if (var538 == 3625) {
                                                        if (class199.field3212 != null) {
                                                            class108.field1763[var4++] = class199.field3212;
                                                        } else {
                                                            class108.field1763[var4++] = "";
                                                        }
                                                        continue;
                                                    }
                                                    if (var538 == 3626) {
                                                        --var3;
                                                        int var465 = class5.field126[var3];
                                                        if (class58.field1025 != null && ~var465 > ~class34.field549) {
                                                            class108.field1763[var4++] = class272.field4534[var465].field1346;
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                    if (var538 == 3627) {
                                                        --var3;
                                                        int var466 = class5.field126[var3];
                                                        if (~class163.field2643 == -3 && ~var466 <= -1 && ~var466 > ~class76.field1296) {
                                                            class5.field126[var3++] = class283.field4675[var466] ? 1 : 0;
                                                            continue;
                                                        }
                                                        class5.field126[var3++] = 0;
                                                        continue;
                                                    }
                                                    if (var538 == 3628) {
                                                        --var4;
                                                        String var467 = class108.field1763[var4];
                                                        if (var467.startsWith("<img=0>") || var467.startsWith("<img=1>")) {
                                                            var467 = var467.substring(7);
                                                        }
                                                        class5.field126[var3++] = class226.method1600(5, var467);
                                                        continue;
                                                    }
                                                    if (~var538 == -3630) {
                                                        class5.field126[var3++] = class66.field1111;
                                                        continue;
                                                    }
                                                    if (~var538 == -3631) {
                                                        --var4;
                                                        String var468 = class108.field1763[var4];
                                                        class123.method934(var468, 114, true);
                                                        continue;
                                                    }
                                                    if (var538 == 3631) {
                                                        --var3;
                                                        int var469 = class5.field126[var3];
                                                        class5.field126[var3++] = class88.field1455[var469] ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (~var538 == -3633) {
                                                        --var3;
                                                        int var470 = class5.field126[var3];
                                                        if (class58.field1025 != null && ~class34.field549 < ~var470) {
                                                            class108.field1763[var4++] = class272.field4534[var470].field1343;
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                    if (var538 == 3633) {
                                                        --var3;
                                                        int var471 = class5.field126[var3];
                                                        if (class163.field2643 != 0 && var471 < class86.field1425) {
                                                            class108.field1763[var4++] = class122.field2043[var471];
                                                            continue;
                                                        }
                                                        class108.field1763[var4++] = "";
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var538 == 3400) {
                                                    var3 -= 2;
                                                    int var472 = class5.field126[var3];
                                                    int var473 = class5.field126[var3 + 1];
                                                    class146 var474 = class54.method345((byte) 6, var472);
                                                    class108.field1763[var4++] = var474.method1084(arg1 + 126, var473);
                                                    continue;
                                                }
                                                if (var538 == 3408) {
                                                    var3 -= 4;
                                                    int var475 = class5.field126[var3];
                                                    int var476 = class5.field126[var3 + 1];
                                                    int var477 = class5.field126[var3 + 2];
                                                    int var478 = class5.field126[var3 + 3];
                                                    class146 var479 = class54.method345((byte) 6, var477);
                                                    if (var479.field2416 == var475 && ~var479.field2408 == ~var476) {
                                                        if (var476 != 115) {
                                                            class5.field126[var3++] = var479.method1086(true, var478);
                                                        } else {
                                                            class108.field1763[var4++] = var479.method1084(class284.method1990(arg1, 126), var478);
                                                        }
                                                        continue;
                                                    }
                                                    throw new RuntimeException("C3408-1");
                                                }
                                                if (~var538 == -3410) {
                                                    var3 -= 3;
                                                    int var480 = class5.field126[var3];
                                                    int var481 = class5.field126[var3 + 1];
                                                    int var482 = class5.field126[var3 + 2];
                                                    if (~var481 == 0) {
                                                        throw new RuntimeException("C3409-2");
                                                    }
                                                    class146 var483 = class54.method345((byte) 6, var481);
                                                    if (~var483.field2408 != ~var480) {
                                                        throw new RuntimeException("C3409-1");
                                                    }
                                                    class5.field126[var3++] = var483.method1078(var482, (byte) 56) ? 1 : 0;
                                                    continue;
                                                }
                                                if (var538 == 3410) {
                                                    --var3;
                                                    int var484 = class5.field126[var3];
                                                    --var4;
                                                    String var485 = class108.field1763[var4];
                                                    if (var484 == -1) {
                                                        throw new RuntimeException("C3410-2");
                                                    }
                                                    class146 var486 = class54.method345((byte) 6, var484);
                                                    if (var486.field2408 != 's') {
                                                        throw new RuntimeException("C3410-1");
                                                    }
                                                    class5.field126[var3++] = !var486.method1077(var485, class284.method1990(arg1, 128)) ? 0 : 1;
                                                    continue;
                                                }
                                                if (var538 == 3411) {
                                                    --var3;
                                                    int var487 = class5.field126[var3];
                                                    class146 var488 = class54.method345((byte) 6, var487);
                                                    class5.field126[var3++] = var488.field2406.method983((byte) -57);
                                                    continue;
                                                }
                                            }
                                        } else {
                                            if (~var538 == -3201) {
                                                var3 -= 3;
                                                class1.method4(255, class5.field126[var3 - -1], class5.field126[var3 - -2], class5.field126[var3], 23492);
                                                continue;
                                            }
                                            if (~var538 == -3202) {
                                                --var3;
                                                class166.method1241(255, (byte) 67, class5.field126[var3]);
                                                continue;
                                            }
                                            if (var538 == 3202) {
                                                var3 -= 2;
                                                class223.method1586(0, class5.field126[var3], class5.field126[var3 + 1], 255);
                                                continue;
                                            }
                                        }
                                    } else {
                                        if (~var538 == -3101) {
                                            --var4;
                                            String var489 = class108.field1763[var4];
                                            class42.method248((byte) -84, var489);
                                            continue;
                                        }
                                        if (~var538 == -3102) {
                                            var3 -= 2;
                                            class115.method881((byte) 13, class16.field314, class5.field126[var3], class5.field126[var3 + 1]);
                                            continue;
                                        }
                                        if (var538 == 3103) {
                                            class209.method1470((byte) -127);
                                            continue;
                                        }
                                        if (~var538 == -3105) {
                                            ++class223.field3744;
                                            --var4;
                                            String var490 = class108.field1763[var4];
                                            int var491 = 0;
                                            if (class269.method1894(var490, false)) {
                                                var491 = class286.method1996(10466, var490);
                                            }
                                            class236.field3980.method640((byte) 97, 26);
                                            class236.field3980.method1811(var491, (byte) 51);
                                            continue;
                                        }
                                        if (var538 == 3105) {
                                            --var4;
                                            String var492 = class108.field1763[var4];
                                            ++class72.field1261;
                                            class236.field3980.method640((byte) 97, 80);
                                            class236.field3980.method1780(1 + var492.length(), arg1 ^ 112);
                                            class236.field3980.method1786(-25149, var492);
                                            continue;
                                        }
                                        if (var538 == 3106) {
                                            ++class173.field2783;
                                            --var4;
                                            String var493 = class108.field1763[var4];
                                            class236.field3980.method640((byte) 97, 132);
                                            class236.field3980.method1780(1 + var493.length(), 87);
                                            class236.field3980.method1786(-25149, var493);
                                            continue;
                                        }
                                        if (var538 == 3107) {
                                            --var3;
                                            int var494 = class5.field126[var3];
                                            --var4;
                                            String var495 = class108.field1763[var4];
                                            class182.method1322(-88, var495, var494);
                                            continue;
                                        }
                                        if (var538 == 3108) {
                                            var3 -= 3;
                                            int var496 = class5.field126[var3];
                                            int var497 = class5.field126[var3 + 1];
                                            int var498 = class5.field126[var3 - -2];
                                            class207 var499 = class222.method1574(108, var498);
                                            class31.method193(var497, var496, (byte) -70, var499);
                                            continue;
                                        }
                                        if (~var538 == -3110) {
                                            var3 -= 2;
                                            int var500 = class5.field126[var3];
                                            int var501 = class5.field126[var3 - -1];
                                            class207 var502 = var38 ? class143.field2358 : class272.field4543;
                                            class31.method193(var501, var500, (byte) -108, var502);
                                            continue;
                                        }
                                        if (~var538 == -3111) {
                                            --var3;
                                            int var503 = class5.field126[var3];
                                            class236.field3980.method640((byte) 97, 96);
                                            class236.field3980.method1771(var503, (byte) 30);
                                            ++class261.field4378;
                                            continue;
                                        }
                                    }
                                } else {
                                    var10000 = arg1 + 117;
                                    --var3;
                                    class207 var504 = class222.method1574(var10000, class5.field126[var3]);
                                    if (~var538 == -2801) {
                                        class5.field126[var3++] = client.method732(var504).method126((byte) -128);
                                        continue;
                                    }
                                    if (var538 == 2801) {
                                        --var3;
                                        int var505 = class5.field126[var3];
                                        int var540 = var505 - 1;
                                        if (var504.field3507 != null && ~var504.field3507.length < ~var540 && var504.field3507[var540] != null) {
                                            class108.field1763[var4++] = var504.field3507[var540];
                                            continue;
                                        }
                                        class108.field1763[var4++] = "";
                                        continue;
                                    }
                                    if (~var538 == -2803) {
                                        if (var504.field3399 == null) {
                                            class108.field1763[var4++] = "";
                                        } else {
                                            class108.field1763[var4++] = var504.field3399;
                                        }
                                        continue;
                                    }
                                }
                            } else {
                                if (var538 == 2700) {
                                    --var3;
                                    class207 var506 = class222.method1574(115, class5.field126[var3]);
                                    class5.field126[var3++] = var506.field3454;
                                    continue;
                                }
                                if (~var538 == -2702) {
                                    --var3;
                                    class207 var507 = class222.method1574(112, class5.field126[var3]);
                                    if (~var507.field3454 != 0) {
                                        class5.field126[var3++] = var507.field3434;
                                    } else {
                                        class5.field126[var3++] = 0;
                                    }
                                    continue;
                                }
                                if (~var538 == -2703) {
                                    --var3;
                                    int var508 = class5.field126[var3];
                                    class278 var509 = (class278) class306.field4952.method987(-119, (long) var508);
                                    if (var509 == null) {
                                        class5.field126[var3++] = 0;
                                    } else {
                                        class5.field126[var3++] = 1;
                                    }
                                    continue;
                                }
                                if (~var538 == -2704) {
                                    --var3;
                                    class207 var510 = class222.method1574(108, class5.field126[var3]);
                                    if (var510.field3462 == null) {
                                        class5.field126[var3++] = 0;
                                        continue;
                                    }
                                    int var511 = var510.field3462.length;
                                    for (int var512 = 0; ~var512 > ~var510.field3462.length; ++var512) {
                                        if (var510.field3462[var512] == null) {
                                            var511 = var512;
                                            break;
                                        }
                                    }
                                    class5.field126[var3++] = var511;
                                    continue;
                                }
                                if (~var538 == -2705 || ~var538 == -2706) {
                                    var3 -= 2;
                                    int var513 = class5.field126[var3];
                                    int var514 = class5.field126[var3 - -1];
                                    class278 var515 = (class278) class306.field4952.method987(-100, (long) var513);
                                    if (var515 != null && var515.field4622 == var514) {
                                        class5.field126[var3++] = 1;
                                    } else {
                                        class5.field126[var3++] = 0;
                                    }
                                    continue;
                                }
                            }
                        } else {
                            class207 var516 = var38 ? class143.field2358 : class272.field4543;
                            if (~var538 == -1701) {
                                class5.field126[var3++] = var516.field3454;
                                continue;
                            }
                            if (var538 == 1701) {
                                if (~var516.field3454 == 0) {
                                    class5.field126[var3++] = 0;
                                } else {
                                    class5.field126[var3++] = var516.field3434;
                                }
                                continue;
                            }
                            if (~var538 == -1703) {
                                class5.field126[var3++] = var516.field3369;
                                continue;
                            }
                        }
                    } else {
                        class207 var517 = !var38 ? class272.field4543 : class143.field2358;
                        if (var538 == 1500) {
                            class5.field126[var3++] = var517.field3368;
                            continue;
                        }
                        if (~var538 == -1502) {
                            class5.field126[var3++] = var517.field3424;
                            continue;
                        }
                        if (var538 == 1502) {
                            class5.field126[var3++] = var517.field3484;
                            continue;
                        }
                        if (~var538 == -1504) {
                            class5.field126[var3++] = var517.field3481;
                            continue;
                        }
                        if (~var538 == -1505) {
                            class5.field126[var3++] = var517.field3487 ? 1 : 0;
                            continue;
                        }
                        if (~var538 == -1506) {
                            class5.field126[var3++] = var517.field3465;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var537) {
            if (arg0.field1437 == null) {
                if (class27.field470 != 0) {
                    class42.method248((byte) -69, "Clientscript error - check log for details");
                }
                class84.method595(arg1 + 14117, "CS2 - scr:" + arg0.field2213 + " op:" + var8, var537);
            } else {
                StringBuffer var534 = new StringBuffer(30);
                var534.append("%0a - in: ").append(arg0.field1437);
                for (int var535 = class50.field856 + -1; ~var535 <= -1; --var535) {
                    var534.append("%0a - via: ").append(class181.field2885[var535].field187.field1437);
                }
                if (var8 == 40) {
                    int var536 = var7[var5];
                    var534.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var536));
                }
                if (class27.field470 != 0) {
                    class42.method248((byte) -102, "Clientscript error in: " + arg0.field1437);
                }
                class84.method595(14117, "CS2 - scr:" + arg0.field2213 + " op:" + var8 + var534.toString(), var537);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V")
    public static final void method1346(byte arg0) {
        if (arg0 != 28) {
            method1346((byte) -111);
        }
        if (class22.field391 == null || class289.field4765 == null) {
            class22.field391 = new int[256];
            class289.field4765 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class22.field391[var1] = (int) (4096.0D * Math.sin(var2));
                class289.field4765[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        ++field2973;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(CI)C")
    public static final char method1347(char arg0, int arg1) {
        ++field2976;
        if (arg1 != 4) {
            method1349(95, (class83) null);
        }
        return arg0 != 181 && ~arg0 != -403 ? Character.toTitleCase(arg0) : arg0;
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        ++field2978;
        if (class148.field2441 != null) {
            if (~class171.field2773 > -11) {
                if (!class148.field2433.method1154(class148.field2441.field3308, -29993)) {
                    class171.field2773 = class13.field285.method1153(class148.field2441.field3308, (byte) -74) / 10;
                    return;
                }
                class222.method1575(false);
                class171.field2773 = 10;
            }
            if (class171.field2773 == 10) {
                class148.field2437 = class148.field2441.field3294 >> 6 << 6;
                class148.field2434 = (class148.field2441.field3310 >> 6 << 6) + (-class148.field2437 - -64);
                class148.field2438 = class148.field2441.field3283 >> 6 << 6;
                class148.field2436 = (class148.field2441.field3303 >> 6 << 6) + (-class148.field2438 - -64);
                int[] var1 = new int[3];
                int var2 = -1;
                int var3 = -1;
                if (class148.field2441.method1432(var1, (class16.field314.field771 >> 7) + class78.field1313, class182.field2898, -91, (class16.field314.field715 >> 7) + class26.field462)) {
                    var2 = -var1[2] - (-class148.field2437 - -1 - class148.field2434);
                    var3 = var1[1] + -class148.field2438;
                }
                if (!class244.field4097 && var3 >= 0 && class148.field2436 > var3 && var2 >= 0 && class148.field2434 > var2) {
                    int var4 = var2 + (int) (10.0D * Math.random()) + -5;
                    int var5 = var3 + -5 + (int) (Math.random() * 10.0D);
                    class219.field3701 = var4;
                    class122.field2044 = var5;
                } else if (class11.field194 != -1 && ~class135.field2219 != 0) {
                    class148.field2441.method1435(var1, class135.field2219, 123, class11.field194);
                    class244.field4097 = false;
                    class135.field2219 = -1;
                    class11.field194 = -1;
                    if (var1 != null) {
                        class219.field3701 = -var1[2] - (-class148.field2437 - (class148.field2434 + -1));
                        class122.field2044 = var1[1] - class148.field2438;
                    }
                } else {
                    class148.field2441.method1435(var1, 16383 & class148.field2441.field3295, arg0 ^ 27859, 16383 & class148.field2441.field3295 >> 14);
                    class219.field3701 = class148.field2434 + -1 + -var1[2] + class148.field2437;
                    class122.field2044 = var1[1] + -class148.field2438;
                }
                if (~class148.field2441.field3289 == -38) {
                    class148.field2442 = 3.0F;
                    class148.field2444 = 3.0F;
                } else if (~class148.field2441.field3289 == -51) {
                    class148.field2442 = 4.0F;
                    class148.field2444 = 4.0F;
                } else if (class148.field2441.field3289 == 75) {
                    class148.field2442 = 6.0F;
                    class148.field2444 = 6.0F;
                } else if (class148.field2441.field3289 == 100) {
                    class148.field2442 = 8.0F;
                    class148.field2444 = 8.0F;
                } else if (~class148.field2441.field3289 != -201) {
                    class148.field2442 = 8.0F;
                    class148.field2444 = 8.0F;
                } else {
                    class148.field2442 = 16.0F;
                    class148.field2444 = 16.0F;
                }
                class245.method1753(arg0 + -15192);
                int var6 = class148.field2436 >> 6;
                int var7 = class148.field2434 >> 6;
                class148.field2445 = new byte[var6][var7][];
                class148.field2448 = new byte[var6][var7][];
                class148.field2454 = new byte[var6][var7][];
                class148.field2446 = new byte[var6][var7][];
                class148.field2447 = new int[var6][var7][];
                class148.field2455 = new int[var6][var7][];
                class148.field2458 = new int[class238.field4013 - -1];
                class148.field2456 = new byte[var6][var7][];
                class294.field4831 = new class49();
                class149.field2469 = new class279();
                int var8 = class236.field3989 >> 1;
                int var9 = class68.field1148 >> 2 << 10;
                class148.method1107(var9, var8);
                class218.method1556(1024, arg0 + 1907924225, 256);
                class249.method1823(256, arg0 + -27820, 256);
                class202.method1418(arg0 + -27776, 256);
                class171.field2773 = 20;
            } else if (~class171.field2773 == -21) {
                class238.method1706(new class249(class148.field2433.method1130((byte) -119, "underlay", class148.field2441.field3308)), true);
                class171.field2773 = 30;
                class287.method2002(true, (byte) 86);
                class146.method1083(arg0 + -43830);
            } else if (~class171.field2773 == -31) {
                class148.method1102(new class249(class148.field2433.method1130((byte) -100, "overlay", class148.field2441.field3308)));
                class171.field2773 = 40;
                class146.method1083(-16011);
            } else if (~class171.field2773 == -41) {
                class148.method1106(new class249(class148.field2433.method1130((byte) -103, "overlay2", class148.field2441.field3308)));
                class171.field2773 = 50;
                class146.method1083(-16011);
            } else if (~class171.field2773 == -51) {
                class148.method1104(new class249(class148.field2433.method1130((byte) -121, "loc", class148.field2441.field3308)), class85.field1418);
                class171.field2773 = 60;
                class287.method2002(true, (byte) 126);
                class146.method1083(-16011);
            } else if (~class171.field2773 == -61) {
                if (!class148.field2433.method1134((byte) 86, class148.field2441.field3308 + "_labels")) {
                    class148.field2435 = new class238(0);
                } else {
                    if (!class148.field2433.method1154(class148.field2441.field3308 + "_labels", -29993)) {
                        return;
                    }
                    class148.field2435 = class171.method1277(class148.field2441.field3308 + "_labels", class148.field2433, class85.field1418, true);
                }
                class148.method1094();
                class171.field2773 = 70;
                class146.method1083(-16011);
            } else if (~class171.field2773 == -71) {
                class166.field2694 = new class74(11, true, class5.field125);
                class171.field2773 = 73;
                class287.method2002(true, (byte) 74);
                class146.method1083(-16011);
            } else if (~class171.field2773 == -74) {
                class72.field1259 = new class74(12, true, class5.field125);
                class171.field2773 = 76;
                class287.method2002(true, (byte) -126);
                class146.method1083(arg0 ^ -21026);
            } else if (class171.field2773 == 76) {
                class249.field4186 = new class74(14, true, class5.field125);
                class171.field2773 = 79;
                class287.method2002(true, (byte) 87);
                class146.method1083(-16011);
            } else if (class171.field2773 == 79) {
                class307.field4972 = new class74(17, true, class5.field125);
                class171.field2773 = 82;
                class287.method2002(true, (byte) -102);
                class146.method1083(-16011);
            } else if (~class171.field2773 == -83) {
                class5.field130 = new class74(19, true, class5.field125);
                class171.field2773 = 85;
                class287.method2002(true, (byte) -54);
                class146.method1083(arg0 + -43830);
            } else if (class171.field2773 == 85) {
                class303.field4941 = new class74(22, true, class5.field125);
                class171.field2773 = 88;
                class287.method2002(true, (byte) 71);
                class146.method1083(-16011);
            } else if (~class171.field2773 == -89) {
                class203.field3251 = new class74(26, true, class5.field125);
                class171.field2773 = 91;
                class287.method2002(true, (byte) -122);
                class146.method1083(arg0 ^ -21026);
            } else {
                class302.field4921 = new class74(30, true, class5.field125);
                class171.field2773 = 100;
                class287.method2002(true, (byte) -102);
                if (arg0 == 27819) {
                    class146.method1083(-16011);
                    System.gc();
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILci;)V")
    public static final void method1349(int arg0, class83 arg1) {
        ++field2979;
        class305 var2 = null;
        class15.field304 = 3;
        class180.method1312(-1, true);
        class265.field4440 = 0;
        class54.field916 = true;
        class289.field4767 = 255;
        class141.field2337 = true;
        class113.field1934 = true;
        field2977 = true;
        class283.field4682 = 127;
        class145.field2388 = true;
        class162.field2636 = true;
        class190.field3044 = true;
        class97.field1560 = 0;
        int var3 = -13 / ((arg0 - 1) / 61);
        class222.field3731 = 0;
        class162.field2631 = 2;
        class259.field4357 = true;
        class175.field2827 = 0;
        class292.field4785 = 127;
        class79.field1325 = true;
        class197.field3201 = true;
        class68.field1142 = true;
        if (~class86.field1430 <= -97) {
            class139.method1031(2);
        } else {
            class139.method1031(0);
        }
        class46.field814 = false;
        class245.field4117 = true;
        class253.field4291 = false;
        class173.field2789 = false;
        class16.field328 = 0;
        class72.field1257 = 0;
        class297.field4862 = 0;
        try {
            class191 var4 = arg1.method586("runescape", (byte) -107);
            while (var4.field3091 == 0) {
                class28.method182(1L, true);
            }
            if (~var4.field3091 == -2) {
                var2 = (class305) var4.field3089;
                byte[] var5 = new byte[(int) var2.method2066(false)];
                int var7;
                for (int var6 = 0; var5.length > var6; var6 += var7) {
                    var7 = var2.method2067(var6, var5.length - var6, var5, 0);
                    if (~var7 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class11.method64(29, new class249(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method2070((byte) -105);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field2969;
        int[] var3 = super.field2911.method77(arg1, -58);
        if (super.field2911.field287) {
            for (int var4 = 0; ~class4.field116 < ~var4; ++var4) {
                int var5 = (class207.field3415[var4] << 12) / this.field2975 - -this.field2982;
                int var6 = var5;
                int var7 = (class66.field1112[arg1] << 12) / this.field2975 + this.field2970;
                int var8 = var5;
                int var9 = var7;
                int var10 = var7 * var7 >> 12;
                int var11 = var5 * var5 >> 12;
                int var12 = var7;
                int var13 = 0;
                while (~(var10 + var11) > -16385 && ~this.field2984 < ~var13) {
                    var12 = (var8 * var12 >> 12) * 2 + var9;
                    var8 = var6 + var11 - var10;
                    var11 = var8 * var8 >> 12;
                    ++var13;
                    var10 = var12 * var12 >> 12;
                }
                var3[var4] = this.field2984 + -1 > var13 ? (var13 << 12) / this.field2984 : 0;
            }
        }
        if (arg0) {
            field2971 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class186() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            this.field2982 = -99;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field2970 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field2982 = arg1.method1821((byte) 51);
                }
            } else {
                this.field2984 = arg1.method1821((byte) 51);
            }
        } else {
            this.field2975 = arg1.method1821((byte) 51);
        }
        ++field2974;
    }
}
