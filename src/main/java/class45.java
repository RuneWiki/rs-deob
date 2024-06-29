import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class45 {

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "Lqc;")
    public static class99 field549 = new class99(64);

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
    public static boolean field552 = false;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field553 = 127;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field554 = 0;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Z")
    public static boolean field555 = false;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lkm;")
    public static class133 field556;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILec;I)V", line = 5)
    public static final void method285(int arg0, class171 arg1, int arg2) {
        Object[] var3 = arg1.field2333;
        int var4 = (Integer) var3[0];
        class221 var5 = class192.method1340(var4, 39);
        field548++;
        if (var5 == null) {
            return;
        }
        class21.field278 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var5.field3166;
        if (arg2 != 127) {
            return;
        }
        int[] var9 = var5.field3174;
        byte var10 = -1;
        int var11 = 0;
        try {
            class4.field37 = new int[var5.field3170];
            class169.field2309 = new String[var5.field3171];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2344;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2342;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2341 == null ? -1 : arg1.field2341.field5206;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2343;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2341 == null ? -1 : arg1.field2341.field5275;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2331 == null ? -1 : arg1.field2331.field5206;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2331 == null ? -1 : arg1.field2331.field5275;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2334;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2332;
                    }
                    class4.field37[var13++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg1.field2340;
                    }
                    class169.field2309[var12++] = var16;
                }
            }
            int var17 = 0;
            label4458: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var528 = var8[var7];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class170.field2327[var6++] = var9[var7];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var9[var7];
                        class170.field2327[var6++] = class324.field4920[var18];
                        continue;
                    }
                    if (var528 == 2) {
                        int var19 = var9[var7];
                        var6--;
                        class169.method1193(class170.field2327[var6], var19, 0);
                        continue;
                    }
                    if (var528 == 3) {
                        class253.field3627[var11++] = var5.field3176[var7];
                        continue;
                    }
                    if (var528 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var528 == 7) {
                        var6 -= 2;
                        if (class170.field2327[var6 + 1] != class170.field2327[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var6 -= 2;
                        if (class170.field2327[var6 + 1] == class170.field2327[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var6 -= 2;
                        if (class170.field2327[var6] < class170.field2327[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var6 -= 2;
                        if (class170.field2327[var6] > class170.field2327[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class21.field278 == 0) {
                            return;
                        }
                        class208 var20 = class43.field508[--class21.field278];
                        class169.field2309 = var20.field2996;
                        var7 = var20.field2999;
                        class4.field37 = var20.field2993;
                        var5 = var20.field2990;
                        var8 = var5.field3166;
                        var9 = var5.field3174;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var9[var7];
                        class170.field2327[var6++] = class115.method855(var21, (byte) 123);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var9[var7];
                        var6--;
                        class106.method783((byte) 127, class170.field2327[var6], var22);
                        continue;
                    }
                    if (var528 == 31) {
                        var6 -= 2;
                        if (class170.field2327[var6] <= class170.field2327[var6 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var6 -= 2;
                        if (class170.field2327[var6 + 1] <= class170.field2327[var6]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class170.field2327[var6++] = class4.field37[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var9[var7];
                        var6--;
                        class4.field37[var10001] = class170.field2327[var6];
                        continue;
                    }
                    if (var528 == 35) {
                        class253.field3627[var11++] = class169.field2309[var9[var7]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var9[var7];
                        var11--;
                        class169.field2309[var10001] = class253.field3627[var11];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var9[var7];
                        var11 -= var23;
                        String var24 = class296.method2017(var11, class253.field3627, 114, var23);
                        class253.field3627[var11++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var6--;
                        continue;
                    }
                    if (var528 == 39) {
                        var11--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var9[var7];
                        class221 var26 = class192.method1340(var25, 39);
                        int[] var27 = new int[var26.field3170];
                        String[] var28 = new String[var26.field3171];
                        for (int var29 = 0; var29 < var26.field3175; var29++) {
                            var27[var29] = class170.field2327[var29 + var6 - var26.field3175];
                        }
                        for (int var30 = 0; var30 < var26.field3178; var30++) {
                            var28[var30] = class253.field3627[var11 + var30 - var26.field3178];
                        }
                        var11 -= var26.field3178;
                        var6 -= var26.field3175;
                        class208 var31 = new class208();
                        var31.field2990 = var5;
                        var31.field2996 = class169.field2309;
                        var31.field2999 = var7;
                        var31.field2993 = class4.field37;
                        if (class43.field508.length <= class21.field278) {
                            throw new RuntimeException();
                        }
                        class43.field508[class21.field278++] = var31;
                        class169.field2309 = var28;
                        var5 = var26;
                        var9 = var26.field3174;
                        var7 = -1;
                        class4.field37 = var27;
                        var8 = var26.field3166;
                        continue;
                    }
                    if (var528 == 42) {
                        class170.field2327[var6++] = class282.field4219[var9[var7]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var9[var7];
                        var6--;
                        class282.field4219[var32] = class170.field2327[var6];
                        class219.method1513((byte) -123, var32);
                        continue;
                    }
                    if (var528 == 44) {
                        int var33 = var9[var7] & 0xFFFF;
                        var6--;
                        int var34 = class170.field2327[var6];
                        int var35 = var9[var7] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            class176.field2394[var35] = var34;
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label4458;
                                }
                                class107.field1447[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        int var38 = var9[var7];
                        var6--;
                        int var39 = class170.field2327[var6];
                        if (var39 >= 0 && var39 < class176.field2394[var38]) {
                            class170.field2327[var6++] = class107.field1447[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        var6 -= 2;
                        int var40 = var9[var7];
                        int var41 = class170.field2327[var6];
                        if (var41 >= 0 && var41 < class176.field2394[var40]) {
                            class107.field1447[var40][var41] = class170.field2327[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class276.field4135[var9[var7]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class253.field3627[var11++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var9[var7];
                        var11--;
                        class276.field4135[var43] = class253.field3627[var11];
                        class83.method650(arg2 - 126, var43);
                        continue;
                    }
                    if (var528 == 51) {
                        class17 var44 = var5.field3169[var9[var7]];
                        var6--;
                        class336 var45 = (class336) var44.method111(-103, (long) class170.field2327[var6]);
                        if (var45 != null) {
                            var7 += var45.field5063;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var528 < 300) {
                    if (var528 == 100) {
                        var6 -= 3;
                        int var508 = class170.field2327[var6];
                        int var509 = class170.field2327[var6 + 1];
                        int var510 = class170.field2327[var6 + 2];
                        if (var509 != 0) {
                            class344 var511 = class151.method1101(arg2 - 160, var508);
                            if (var511.field5248 == null) {
                                var511.field5248 = new class344[var510 + 1];
                            }
                            if (var511.field5248.length <= var510) {
                                class344[] var512 = new class344[var510 + 1];
                                for (int var513 = 0; var513 < var511.field5248.length; var513++) {
                                    var512[var513] = var511.field5248[var513];
                                }
                                var511.field5248 = var512;
                            }
                            if (var510 > 0 && var511.field5248[var510 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var510 - 1));
                            }
                            class344 var514 = new class344();
                            var514.field5275 = var510;
                            var514.field5316 = var509;
                            var514.field5246 = var514.field5206 = var511.field5206;
                            var514.field5267 = true;
                            var511.field5248[var510] = var514;
                            if (var46) {
                                class264.field3858 = var514;
                            } else {
                                class74.field1021 = var514;
                            }
                            class255.method1741(var511, false);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 101) {
                        class344 var515 = var46 ? class264.field3858 : class74.field1021;
                        if (var515.field5275 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class344 var516 = class151.method1101(-28, var515.field5206);
                        var516.field5248[var515.field5275] = null;
                        class255.method1741(var516, false);
                        continue;
                    }
                    if (var528 == 102) {
                        var6--;
                        class344 var517 = class151.method1101(-39, class170.field2327[var6]);
                        var517.field5248 = null;
                        class255.method1741(var517, false);
                        continue;
                    }
                    if (var528 == 200) {
                        var6 -= 2;
                        int var518 = class170.field2327[var6 + 1];
                        int var519 = class170.field2327[var6];
                        class344 var520 = class20.method128(119, var519, var518);
                        if (var520 != null && var518 != -1) {
                            class170.field2327[var6++] = 1;
                            if (var46) {
                                class264.field3858 = var520;
                            } else {
                                class74.field1021 = var520;
                            }
                            continue;
                        }
                        class170.field2327[var6++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var6--;
                        int var521 = class170.field2327[var6];
                        class344 var522 = class151.method1101(-50, var521);
                        if (var522 == null) {
                            class170.field2327[var6++] = 0;
                        } else {
                            class170.field2327[var6++] = 1;
                            if (var46) {
                                class264.field3858 = var522;
                            } else {
                                class74.field1021 = var522;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var6 -= 2;
                        int var501 = class170.field2327[var6];
                        int var502 = class170.field2327[var6 + 1];
                        for (int var503 = 0; var503 < class142.field1939.length; var503++) {
                            if (class142.field1939[var503] == var501) {
                                class173.field2356.field3422.method433(var502, arg2 ^ 0x2D1D, var503);
                                continue label4458;
                            }
                        }
                        int var504 = 0;
                        while (true) {
                            if (class22.field284.length <= var504) {
                                continue label4458;
                            }
                            if (class22.field284[var504] == var501) {
                                class173.field2356.field3422.method433(var502, 11618, var504);
                                continue label4458;
                            }
                            var504++;
                        }
                    }
                    if (var528 == 404) {
                        var6 -= 2;
                        int var505 = class170.field2327[var6 + 1];
                        int var506 = class170.field2327[var6];
                        class173.field2356.field3422.method438(var505, arg2, var506);
                        continue;
                    }
                    if (var528 == 410) {
                        var6--;
                        boolean var507 = class170.field2327[var6] != 0;
                        class173.field2356.field3422.method439(var507, 0);
                        continue;
                    }
                } else if (var528 >= 1000 && var528 < 1100 || var528 >= 2000 && var528 < 2100) {
                    class344 var47;
                    if (var528 < 2000) {
                        var47 = var46 ? class264.field3858 : class74.field1021;
                    } else {
                        var528 -= 1000;
                        var6--;
                        var47 = class151.method1101(-67, class170.field2327[var6]);
                    }
                    if (var528 == 1000) {
                        var6 -= 4;
                        var47.field5319 = class170.field2327[var6];
                        var47.field5287 = class170.field2327[var6 + 1];
                        int var48 = class170.field2327[var6 + 3];
                        int var49 = class170.field2327[var6 + 2];
                        if (var48 < 0) {
                            var48 = 0;
                        } else if (var48 > 5) {
                            var48 = 5;
                        }
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        var47.field5254 = (byte) var49;
                        var47.field5250 = (byte) var48;
                        class255.method1741(var47, false);
                        class17.method119((byte) -114, var47);
                        if (var47.field5275 == -1) {
                            class116.method858(var47.field5206, -48);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var6 -= 4;
                        var47.field5305 = class170.field2327[var6];
                        var47.field5236 = class170.field2327[var6 + 1];
                        var47.field5194 = 0;
                        var47.field5174 = 0;
                        int var50 = class170.field2327[var6 + 2];
                        int var51 = class170.field2327[var6 + 3];
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 4) {
                            var50 = 4;
                        }
                        var47.field5173 = (byte) var50;
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        var47.field5259 = (byte) var51;
                        class255.method1741(var47, false);
                        class17.method119((byte) -82, var47);
                        if (var47.field5316 == 0) {
                            class275.method1893(-24740, false, var47);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var6--;
                        boolean var52 = class170.field2327[var6] == 1;
                        if (var47.field5350 != var52) {
                            var47.field5350 = var52;
                            class255.method1741(var47, false);
                        }
                        if (var47.field5275 == -1) {
                            class262.method1790(false, var47.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var6 -= 2;
                        var47.field5225 = class170.field2327[var6];
                        var47.field5327 = class170.field2327[var6 + 1];
                        class255.method1741(var47, false);
                        class17.method119((byte) -108, var47);
                        if (var47.field5316 == 0) {
                            class275.method1893(-24740, false, var47);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var6--;
                        var47.field5229 = class170.field2327[var6] == 1;
                        continue;
                    }
                } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                    class344 var53;
                    if (var528 < 2000) {
                        var53 = var46 ? class264.field3858 : class74.field1021;
                    } else {
                        var6--;
                        var53 = class151.method1101(-75, class170.field2327[var6]);
                        var528 -= 1000;
                    }
                    if (var528 == 1100) {
                        var6 -= 2;
                        var53.field5203 = class170.field2327[var6];
                        if (var53.field5197 - var53.field5334 < var53.field5203) {
                            var53.field5203 = var53.field5197 - var53.field5334;
                        }
                        if (var53.field5203 < 0) {
                            var53.field5203 = 0;
                        }
                        var53.field5195 = class170.field2327[var6 + 1];
                        if (var53.field5195 > var53.field5200 - var53.field5293) {
                            var53.field5195 = var53.field5200 - var53.field5293;
                        }
                        if (var53.field5195 < 0) {
                            var53.field5195 = 0;
                        }
                        class255.method1741(var53, false);
                        if (var53.field5275 == -1) {
                            class132.method945(12, var53.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var6--;
                        var53.field5281 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        if (var53.field5275 == -1) {
                            class64.method427((byte) 115, var53.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var6--;
                        var53.field5338 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1103) {
                        var6--;
                        var53.field5288 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1104) {
                        var6--;
                        var53.field5177 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1105) {
                        var6--;
                        var53.field5247 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1106) {
                        var6--;
                        var53.field5290 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1107) {
                        var6--;
                        var53.field5340 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1108) {
                        var53.field5304 = 1;
                        var6--;
                        var53.field5201 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        if (var53.field5275 == -1) {
                            class235.method1621(false, var53.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var6 -= 6;
                        var53.field5329 = class170.field2327[var6];
                        var53.field5349 = class170.field2327[var6 + 1];
                        var53.field5172 = class170.field2327[var6 + 2];
                        var53.field5241 = class170.field2327[var6 + 3];
                        var53.field5176 = class170.field2327[var6 + 4];
                        var53.field5171 = class170.field2327[var6 + 5];
                        class255.method1741(var53, false);
                        if (var53.field5275 == -1) {
                            class344.method2379(8, var53.field5206);
                            class73.method543(var53.field5206, arg2 - 5);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var6--;
                        int var54 = class170.field2327[var6];
                        if (var53.field5272 != var54) {
                            var53.field5272 = var54;
                            var53.field5233 = 0;
                            var53.field5328 = 1;
                            var53.field5205 = 0;
                            class255.method1741(var53, false);
                        }
                        if (var53.field5275 == -1) {
                            class140.method1015(27, var53.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var6--;
                        var53.field5181 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1112) {
                        var11--;
                        String var55 = class253.field3627[var11];
                        if (!var55.equals(var53.field5301)) {
                            var53.field5301 = var55;
                            class255.method1741(var53, false);
                        }
                        if (var53.field5275 == -1) {
                            class296.method2019(var53.field5206, 112);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var6--;
                        var53.field5303 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1114) {
                        var6 -= 3;
                        var53.field5212 = class170.field2327[var6];
                        var53.field5178 = class170.field2327[var6 + 1];
                        var53.field5190 = class170.field2327[var6 + 2];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1115) {
                        var6--;
                        var53.field5323 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1116) {
                        var6--;
                        var53.field5204 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1117) {
                        var6--;
                        var53.field5277 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1118) {
                        var6--;
                        var53.field5351 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1119) {
                        var6--;
                        var53.field5354 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1120) {
                        var6 -= 2;
                        var53.field5197 = class170.field2327[var6];
                        var53.field5200 = class170.field2327[var6 + 1];
                        class255.method1741(var53, false);
                        if (var53.field5316 == 0) {
                            class275.method1893(-24740, false, var53);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var6 -= 2;
                        var53.field5231 = (short) class170.field2327[var6];
                        var53.field5291 = (short) class170.field2327[var6 + 1];
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1122) {
                        var6--;
                        var53.field5220 = class170.field2327[var6] == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                    if (var528 == 1123) {
                        var6--;
                        var53.field5171 = class170.field2327[var6];
                        class255.method1741(var53, false);
                        if (var53.field5275 == -1) {
                            class344.method2379(8, var53.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var6--;
                        int var56 = class170.field2327[var6];
                        var53.field5280 = var56 == 1;
                        class255.method1741(var53, false);
                        continue;
                    }
                } else if (var528 >= 1200 && var528 < 1300 || var528 >= 2200 && var528 < 2300) {
                    class344 var497;
                    if (var528 >= 2000) {
                        var6--;
                        var497 = class151.method1101(-123, class170.field2327[var6]);
                        var528 -= 1000;
                    } else {
                        var497 = var46 ? class264.field3858 : class74.field1021;
                    }
                    class255.method1741(var497, false);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var6 -= 2;
                        int var498 = class170.field2327[var6];
                        int var499 = class170.field2327[var6 + 1];
                        if (var497.field5275 == -1) {
                            class82.method643(var497.field5206, 9);
                            class344.method2379(8, var497.field5206);
                            class73.method543(var497.field5206, 107);
                        }
                        if (var498 == -1) {
                            var497.field5304 = 1;
                            var497.field5302 = -1;
                            var497.field5201 = -1;
                            continue;
                        }
                        if (var528 == 1208 || var528 == 1209) {
                            var497.field5244 = true;
                        } else {
                            var497.field5244 = false;
                        }
                        var497.field5215 = var499;
                        var497.field5302 = var498;
                        class198 var500 = class115.method854((byte) 89, var498);
                        var497.field5176 = var500.field2776;
                        var497.field5172 = var500.field2797;
                        var497.field5171 = var500.field2763;
                        if (var497.field5194 > 0) {
                            var497.field5171 = var497.field5171 * 32 / var497.field5194;
                        } else if (var497.field5305 > 0) {
                            var497.field5171 = var497.field5171 * 32 / var497.field5305;
                        }
                        var497.field5241 = var500.field2812;
                        var497.field5349 = var500.field2805;
                        var497.field5329 = var500.field2808;
                        if (var528 == 1205) {
                            var497.field5221 = false;
                        } else {
                            var497.field5221 = true;
                        }
                        continue;
                    }
                    if (var528 == 1201) {
                        var497.field5304 = 2;
                        var6--;
                        var497.field5201 = class170.field2327[var6];
                        if (var497.field5275 == -1) {
                            class235.method1621(false, var497.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var497.field5304 = 3;
                        var497.field5201 = class173.field2356.field3422.method432(-121);
                        if (var497.field5275 == -1) {
                            class235.method1621(false, var497.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var497.field5304 = 6;
                        var6--;
                        var497.field5201 = class170.field2327[var6];
                        if (var497.field5275 == -1) {
                            class235.method1621(false, var497.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var497.field5304 = 5;
                        var6--;
                        var497.field5201 = class170.field2327[var6];
                        if (var497.field5275 == -1) {
                            class235.method1621(false, var497.field5206);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var6 -= 4;
                        var497.field5207 = class170.field2327[var6];
                        var497.field5341 = class170.field2327[var6 + 1];
                        var497.field5297 = class170.field2327[var6 + 2];
                        var497.field5268 = class170.field2327[var6 + 3];
                        class255.method1741(var497, false);
                        continue;
                    }
                    if (var528 == 1207) {
                        var6 -= 2;
                        var497.field5251 = class170.field2327[var6];
                        var497.field5263 = class170.field2327[var6 + 1];
                        class255.method1741(var497, false);
                        continue;
                    }
                } else {
                    int var10000;
                    if (var528 >= 1300 && var528 < 1400 || var528 >= 2300 && var528 < 2400) {
                        class344 var57;
                        if (var528 < 2000) {
                            var57 = var46 ? class264.field3858 : class74.field1021;
                        } else {
                            var10000 = arg2 - 231;
                            var6--;
                            var57 = class151.method1101(var10000, class170.field2327[var6]);
                            var528 -= 1000;
                        }
                        if (var528 == 1300) {
                            var6--;
                            int var58 = class170.field2327[var6] - 1;
                            if (var58 >= 0 && var58 <= 9) {
                                var11--;
                                var57.method2376(var58, class253.field3627[var11], 0);
                                continue;
                            }
                            var11--;
                            continue;
                        }
                        if (var528 == 1301) {
                            var6 -= 2;
                            int var59 = class170.field2327[var6];
                            int var60 = class170.field2327[var6 + 1];
                            var57.field5265 = class20.method128(126, var59, var60);
                            continue;
                        }
                        if (var528 == 1302) {
                            var6--;
                            var57.field5356 = class170.field2327[var6] == 1;
                            continue;
                        }
                        if (var528 == 1303) {
                            var6--;
                            var57.field5355 = class170.field2327[var6];
                            continue;
                        }
                        if (var528 == 1304) {
                            var6--;
                            var57.field5262 = class170.field2327[var6];
                            continue;
                        }
                        if (var528 == 1305) {
                            var11--;
                            var57.field5242 = class253.field3627[var11];
                            continue;
                        }
                        if (var528 == 1306) {
                            var11--;
                            var57.field5274 = class253.field3627[var11];
                            continue;
                        }
                        if (var528 == 1307) {
                            var57.field5312 = null;
                            continue;
                        }
                        if (var528 == 1308) {
                            var6--;
                            var57.field5270 = class170.field2327[var6];
                            var6--;
                            var57.field5216 = class170.field2327[var6];
                            continue;
                        }
                        if (var528 == 1309) {
                            var6--;
                            int var61 = class170.field2327[var6];
                            var6--;
                            int var62 = class170.field2327[var6];
                            if (var62 >= 1 && var62 <= 10) {
                                var57.method2374(var61, var62 - 1, (byte) 127);
                            }
                            continue;
                        }
                        if (var528 == 1310) {
                            var11--;
                            var57.field5214 = class253.field3627[var11];
                            continue;
                        }
                    } else {
                        if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                            class344 var490;
                            if (var528 < 2000) {
                                var490 = var46 ? class264.field3858 : class74.field1021;
                            } else {
                                var10000 = arg2 - 167;
                                var6--;
                                var490 = class151.method1101(var10000, class170.field2327[var6]);
                                var528 -= 1000;
                            }
                            var11--;
                            String var491 = class253.field3627[var11];
                            int[] var492 = null;
                            if (var491.length() > 0 && var491.charAt(var491.length() - 1) == 'Y') {
                                var6--;
                                int var493 = class170.field2327[var6];
                                if (var493 > 0) {
                                    var492 = new int[var493];
                                    while (var493-- > 0) {
                                        var6--;
                                        var492[var493] = class170.field2327[var6];
                                    }
                                }
                                var491 = var491.substring(0, var491.length() - 1);
                            }
                            Object[] var494 = new Object[var491.length() + 1];
                            for (int var495 = var494.length - 1; var495 >= 1; var495--) {
                                if (var491.charAt(var495 - 1) == 's') {
                                    var11--;
                                    var494[var495] = class253.field3627[var11];
                                } else {
                                    var6--;
                                    var494[var495] = Integer.valueOf(class170.field2327[var6]);
                                }
                            }
                            var6--;
                            int var496 = class170.field2327[var6];
                            if (var496 == -1) {
                                var494 = null;
                            } else {
                                var494[0] = Integer.valueOf(var496);
                            }
                            var490.field5269 = true;
                            if (var528 == 1400) {
                                var490.field5282 = var494;
                            } else if (var528 == 1401) {
                                var490.field5196 = var494;
                            } else if (var528 == 1402) {
                                var490.field5344 = var494;
                            } else if (var528 == 1403) {
                                var490.field5294 = var494;
                            } else if (var528 == 1404) {
                                var490.field5184 = var494;
                            } else if (var528 == 1405) {
                                var490.field5182 = var494;
                            } else if (var528 == 1406) {
                                var490.field5314 = var494;
                            } else if (var528 == 1407) {
                                var490.field5258 = var492;
                                var490.field5213 = var494;
                            } else if (var528 == 1408) {
                                var490.field5217 = var494;
                            } else if (var528 == 1409) {
                                var490.field5339 = var494;
                            } else if (var528 == 1410) {
                                var490.field5342 = var494;
                            } else if (var528 == 1411) {
                                var490.field5318 = var494;
                            } else if (var528 == 1412) {
                                var490.field5345 = var494;
                            } else if (var528 == 1414) {
                                var490.field5300 = var492;
                                var490.field5193 = var494;
                            } else if (var528 == 1415) {
                                var490.field5185 = var494;
                                var490.field5175 = var492;
                            } else if (var528 == 1416) {
                                var490.field5260 = var494;
                            } else if (var528 == 1417) {
                                var490.field5245 = var494;
                            } else if (var528 == 1418) {
                                var490.field5187 = var494;
                            } else if (var528 == 1419) {
                                var490.field5289 = var494;
                            } else if (var528 == 1420) {
                                var490.field5346 = var494;
                            } else if (var528 == 1421) {
                                var490.field5179 = var494;
                            } else if (var528 == 1422) {
                                var490.field5219 = var494;
                            } else if (var528 == 1423) {
                                var490.field5347 = var494;
                            } else if (var528 == 1424) {
                                var490.field5292 = var494;
                            } else if (var528 == 1425) {
                                var490.field5320 = var494;
                            } else if (var528 == 1426) {
                                var490.field5296 = var494;
                            } else if (var528 == 1427) {
                                var490.field5188 = var494;
                            } else if (var528 == 1428) {
                                var490.field5232 = var494;
                                var490.field5222 = var492;
                            } else if (var528 == 1429) {
                                var490.field5255 = var492;
                                var490.field5331 = var494;
                            }
                            continue;
                        }
                        if (var528 < 1600) {
                            class344 var489 = var46 ? class264.field3858 : class74.field1021;
                            if (var528 == 1500) {
                                class170.field2327[var6++] = var489.field5183;
                                continue;
                            }
                            if (var528 == 1501) {
                                class170.field2327[var6++] = var489.field5315;
                                continue;
                            }
                            if (var528 == 1502) {
                                class170.field2327[var6++] = var489.field5334;
                                continue;
                            }
                            if (var528 == 1503) {
                                class170.field2327[var6++] = var489.field5293;
                                continue;
                            }
                            if (var528 == 1504) {
                                class170.field2327[var6++] = var489.field5350 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 1505) {
                                class170.field2327[var6++] = var489.field5246;
                                continue;
                            }
                        } else if (var528 < 1700) {
                            class344 var63 = var46 ? class264.field3858 : class74.field1021;
                            if (var528 == 1600) {
                                class170.field2327[var6++] = var63.field5203;
                                continue;
                            }
                            if (var528 == 1601) {
                                class170.field2327[var6++] = var63.field5195;
                                continue;
                            }
                            if (var528 == 1602) {
                                class253.field3627[var11++] = var63.field5301;
                                continue;
                            }
                            if (var528 == 1603) {
                                class170.field2327[var6++] = var63.field5197;
                                continue;
                            }
                            if (var528 == 1604) {
                                class170.field2327[var6++] = var63.field5200;
                                continue;
                            }
                            if (var528 == 1605) {
                                class170.field2327[var6++] = var63.field5171;
                                continue;
                            }
                            if (var528 == 1606) {
                                class170.field2327[var6++] = var63.field5172;
                                continue;
                            }
                            if (var528 == 1607) {
                                class170.field2327[var6++] = var63.field5176;
                                continue;
                            }
                            if (var528 == 1608) {
                                class170.field2327[var6++] = var63.field5241;
                                continue;
                            }
                            if (var528 == 1609) {
                                class170.field2327[var6++] = var63.field5288;
                                continue;
                            }
                            if (var528 == 1610) {
                                class170.field2327[var6++] = var63.field5329;
                                continue;
                            }
                            if (var528 == 1611) {
                                class170.field2327[var6++] = var63.field5349;
                                continue;
                            }
                            if (var528 == 1612) {
                                class170.field2327[var6++] = var63.field5247;
                                continue;
                            }
                        } else if (var528 < 1800) {
                            class344 var488 = var46 ? class264.field3858 : class74.field1021;
                            if (var528 == 1700) {
                                class170.field2327[var6++] = var488.field5302;
                                continue;
                            }
                            if (var528 == 1701) {
                                if (var488.field5302 == -1) {
                                    class170.field2327[var6++] = 0;
                                } else {
                                    class170.field2327[var6++] = var488.field5215;
                                }
                                continue;
                            }
                            if (var528 == 1702) {
                                class170.field2327[var6++] = var488.field5275;
                                continue;
                            }
                        } else if (var528 < 1900) {
                            class344 var64 = var46 ? class264.field3858 : class74.field1021;
                            if (var528 == 1800) {
                                class170.field2327[var6++] = client.method821(var64).method2040(-1);
                                continue;
                            }
                            if (var528 == 1801) {
                                var6--;
                                int var65 = class170.field2327[var6];
                                int var529 = var65 - 1;
                                if (var64.field5312 != null && var64.field5312.length > var529 && var64.field5312[var529] != null) {
                                    class253.field3627[var11++] = var64.field5312[var529];
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 1802) {
                                if (var64.field5242 == null) {
                                    class253.field3627[var11++] = "";
                                } else {
                                    class253.field3627[var11++] = var64.field5242;
                                }
                                continue;
                            }
                        } else if (var528 < 2600) {
                            var6--;
                            class344 var487 = class151.method1101(-63, class170.field2327[var6]);
                            if (var528 == 2500) {
                                class170.field2327[var6++] = var487.field5183;
                                continue;
                            }
                            if (var528 == 2501) {
                                class170.field2327[var6++] = var487.field5315;
                                continue;
                            }
                            if (var528 == 2502) {
                                class170.field2327[var6++] = var487.field5334;
                                continue;
                            }
                            if (var528 == 2503) {
                                class170.field2327[var6++] = var487.field5293;
                                continue;
                            }
                            if (var528 == 2504) {
                                class170.field2327[var6++] = var487.field5350 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 2505) {
                                class170.field2327[var6++] = var487.field5246;
                                continue;
                            }
                        } else if (var528 < 2700) {
                            var6--;
                            class344 var486 = class151.method1101(-114, class170.field2327[var6]);
                            if (var528 == 2600) {
                                class170.field2327[var6++] = var486.field5203;
                                continue;
                            }
                            if (var528 == 2601) {
                                class170.field2327[var6++] = var486.field5195;
                                continue;
                            }
                            if (var528 == 2602) {
                                class253.field3627[var11++] = var486.field5301;
                                continue;
                            }
                            if (var528 == 2603) {
                                class170.field2327[var6++] = var486.field5197;
                                continue;
                            }
                            if (var528 == 2604) {
                                class170.field2327[var6++] = var486.field5200;
                                continue;
                            }
                            if (var528 == 2605) {
                                class170.field2327[var6++] = var486.field5171;
                                continue;
                            }
                            if (var528 == 2606) {
                                class170.field2327[var6++] = var486.field5172;
                                continue;
                            }
                            if (var528 == 2607) {
                                class170.field2327[var6++] = var486.field5176;
                                continue;
                            }
                            if (var528 == 2608) {
                                class170.field2327[var6++] = var486.field5241;
                                continue;
                            }
                            if (var528 == 2609) {
                                class170.field2327[var6++] = var486.field5288;
                                continue;
                            }
                            if (var528 == 2610) {
                                class170.field2327[var6++] = var486.field5329;
                                continue;
                            }
                            if (var528 == 2611) {
                                class170.field2327[var6++] = var486.field5349;
                                continue;
                            }
                            if (var528 == 2612) {
                                class170.field2327[var6++] = var486.field5247;
                                continue;
                            }
                        } else if (var528 < 2800) {
                            if (var528 == 2700) {
                                var6--;
                                class344 var66 = class151.method1101(-36, class170.field2327[var6]);
                                class170.field2327[var6++] = var66.field5302;
                                continue;
                            }
                            if (var528 == 2701) {
                                var6--;
                                class344 var67 = class151.method1101(-94, class170.field2327[var6]);
                                if (var67.field5302 == -1) {
                                    class170.field2327[var6++] = 0;
                                } else {
                                    class170.field2327[var6++] = var67.field5215;
                                }
                                continue;
                            }
                            if (var528 == 2702) {
                                var6--;
                                int var68 = class170.field2327[var6];
                                class48 var69 = (class48) class211.field3056.method111(arg2 - 95, (long) var68);
                                if (var69 == null) {
                                    class170.field2327[var6++] = 0;
                                } else {
                                    class170.field2327[var6++] = 1;
                                }
                                continue;
                            }
                            if (var528 == 2703) {
                                var6--;
                                class344 var70 = class151.method1101(-26, class170.field2327[var6]);
                                if (var70.field5248 == null) {
                                    class170.field2327[var6++] = 0;
                                    continue;
                                }
                                int var71 = var70.field5248.length;
                                for (int var72 = 0; var72 < var70.field5248.length; var72++) {
                                    if (var70.field5248[var72] == null) {
                                        var71 = var72;
                                        break;
                                    }
                                }
                                class170.field2327[var6++] = var71;
                                continue;
                            }
                            if (var528 == 2704 || var528 == 2705) {
                                var6 -= 2;
                                int var73 = class170.field2327[var6];
                                int var74 = class170.field2327[var6 + 1];
                                class48 var75 = (class48) class211.field3056.method111(53, (long) var73);
                                if (var75 != null && var75.field595 == var74) {
                                    class170.field2327[var6++] = 1;
                                } else {
                                    class170.field2327[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var528 < 2900) {
                            var10000 = arg2 ^ 0xFFFFFFE0;
                            var6--;
                            class344 var76 = class151.method1101(var10000, class170.field2327[var6]);
                            if (var528 == 2800) {
                                class170.field2327[var6++] = client.method821(var76).method2040(-1);
                                continue;
                            }
                            if (var528 == 2801) {
                                var6--;
                                int var77 = class170.field2327[var6];
                                int var530 = var77 - 1;
                                if (var76.field5312 != null && var530 < var76.field5312.length && var76.field5312[var530] != null) {
                                    class253.field3627[var11++] = var76.field5312[var530];
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 2802) {
                                if (var76.field5242 == null) {
                                    class253.field3627[var11++] = "";
                                } else {
                                    class253.field3627[var11++] = var76.field5242;
                                }
                                continue;
                            }
                        } else if (var528 < 3200) {
                            if (var528 == 3100) {
                                var11--;
                                String var78 = class253.field3627[var11];
                                class93.method695((byte) 124, 0, var78, "");
                                continue;
                            }
                            if (var528 == 3101) {
                                var6 -= 2;
                                class6.method33(class173.field2356, -3478, class170.field2327[var6 + 1], class170.field2327[var6]);
                                continue;
                            }
                            if (var528 == 3103) {
                                class310.method2130(arg2 - 28010);
                                continue;
                            }
                            if (var528 == 3104) {
                                class110.field1482++;
                                int var79 = 0;
                                var11--;
                                String var80 = class253.field3627[var11];
                                if (class239.method1642(10, var80)) {
                                    var79 = class190.method1332(var80, (byte) -109);
                                }
                                class90.field1264.method2238(173, (byte) -128);
                                class90.field1264.method2188(255, var79);
                                continue;
                            }
                            if (var528 == 3105) {
                                class170.field2326++;
                                var11--;
                                String var81 = class253.field3627[var11];
                                class90.field1264.method2238(68, (byte) -128);
                                class90.field1264.method2202(class77.method584(var81, arg2 - 23), -118);
                                continue;
                            }
                            if (var528 == 3106) {
                                class311.field4703++;
                                var11--;
                                String var82 = class253.field3627[var11];
                                class90.field1264.method2238(208, (byte) -128);
                                class90.field1264.method2184((byte) 89, var82.length() + 1);
                                class90.field1264.method2157((byte) -61, var82);
                                continue;
                            }
                            if (var528 == 3107) {
                                var6--;
                                int var83 = class170.field2327[var6];
                                var11--;
                                String var84 = class253.field3627[var11];
                                class8.method45(var84, -6, var83);
                                continue;
                            }
                            if (var528 == 3108) {
                                var6 -= 3;
                                int var85 = class170.field2327[var6 + 1];
                                int var86 = class170.field2327[var6];
                                int var87 = class170.field2327[var6 + 2];
                                class344 var88 = class151.method1101(-39, var87);
                                class332.method2313((byte) 49, var88, var85, var86);
                                continue;
                            }
                            if (var528 == 3109) {
                                var6 -= 2;
                                class344 var89 = var46 ? class264.field3858 : class74.field1021;
                                int var90 = class170.field2327[var6 + 1];
                                int var91 = class170.field2327[var6];
                                class332.method2313((byte) 49, var89, var90, var91);
                                continue;
                            }
                            if (var528 == 3110) {
                                class99.field1358++;
                                var6--;
                                int var92 = class170.field2327[var6];
                                class90.field1264.method2238(0, (byte) -128);
                                class90.field1264.method2189(-1, var92);
                                continue;
                            }
                        } else if (var528 < 3300) {
                            if (var528 == 3200) {
                                var6 -= 3;
                                class336.method2330(class170.field2327[var6], (byte) -93, 255, class170.field2327[var6 + 2], class170.field2327[var6 + 1]);
                                continue;
                            }
                            if (var528 == 3201) {
                                var6--;
                                class71.method523(true, 255, class170.field2327[var6]);
                                continue;
                            }
                            if (var528 == 3202) {
                                var6 -= 2;
                                class63.method422(255, (byte) 117, class170.field2327[var6], class170.field2327[var6 + 1]);
                                continue;
                            }
                        } else if (var528 < 3400) {
                            if (var528 == 3300) {
                                class170.field2327[var6++] = class329.field4966;
                                continue;
                            }
                            if (var528 == 3301) {
                                var6 -= 2;
                                int var93 = class170.field2327[var6];
                                int var94 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class125.method905(true, var94, var93);
                                continue;
                            }
                            if (var528 == 3302) {
                                var6 -= 2;
                                int var95 = class170.field2327[var6];
                                int var96 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class127.method920(-87, var96, var95);
                                continue;
                            }
                            if (var528 == 3303) {
                                var6 -= 2;
                                int var97 = class170.field2327[var6];
                                int var98 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class42.method258(var97, var98, true);
                                continue;
                            }
                            if (var528 == 3304) {
                                var6--;
                                int var99 = class170.field2327[var6];
                                class170.field2327[var6++] = class271.method1867(var99, -73).field327;
                                continue;
                            }
                            if (var528 == 3305) {
                                var6--;
                                int var100 = class170.field2327[var6];
                                class170.field2327[var6++] = class213.field3072[var100];
                                continue;
                            }
                            if (var528 == 3306) {
                                var6--;
                                int var101 = class170.field2327[var6];
                                class170.field2327[var6++] = class237.field3367[var101];
                                continue;
                            }
                            if (var528 == 3307) {
                                var6--;
                                int var102 = class170.field2327[var6];
                                class170.field2327[var6++] = class223.field3221[var102];
                                continue;
                            }
                            if (var528 == 3308) {
                                int var103 = class251.field3603;
                                int var104 = (class173.field2356.field3745 >> 7) + class132.field1809;
                                int var105 = (class173.field2356.field3679 >> 7) + class296.field4394;
                                class170.field2327[var6++] = (var103 << 28) + (var104 << 14) + var105;
                                continue;
                            }
                            if (var528 == 3309) {
                                var6--;
                                int var106 = class170.field2327[var6];
                                class170.field2327[var6++] = class47.method303(var106, 268428751) >> 14;
                                continue;
                            }
                            if (var528 == 3310) {
                                var6--;
                                int var107 = class170.field2327[var6];
                                class170.field2327[var6++] = var107 >> 28;
                                continue;
                            }
                            if (var528 == 3311) {
                                var6--;
                                int var108 = class170.field2327[var6];
                                class170.field2327[var6++] = class47.method303(var108, 16383);
                                continue;
                            }
                            if (var528 == 3312) {
                                class170.field2327[var6++] = class66.field869 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3313) {
                                var6 -= 2;
                                int var109 = class170.field2327[var6] + 32768;
                                int var110 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class125.method905(true, var110, var109);
                                continue;
                            }
                            if (var528 == 3314) {
                                var6 -= 2;
                                int var111 = class170.field2327[var6] + 32768;
                                int var112 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class127.method920(client.method823(arg2, -102), var112, var111);
                                continue;
                            }
                            if (var528 == 3315) {
                                var6 -= 2;
                                int var113 = class170.field2327[var6] + 32768;
                                int var114 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class42.method258(var113, var114, true);
                                continue;
                            }
                            if (var528 == 3316) {
                                if (class323.field4898 >= 2) {
                                    class170.field2327[var6++] = class323.field4898;
                                } else {
                                    class170.field2327[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 3317) {
                                class170.field2327[var6++] = class198.field2768;
                                continue;
                            }
                            if (var528 == 3318) {
                                class170.field2327[var6++] = class199.field2838;
                                continue;
                            }
                            if (var528 == 3321) {
                                class170.field2327[var6++] = class24.field301;
                                continue;
                            }
                            if (var528 == 3322) {
                                class170.field2327[var6++] = class203.field2906;
                                continue;
                            }
                            if (var528 == 3323) {
                                if (class218.field3114 >= 5 && class218.field3114 <= 9) {
                                    class170.field2327[var6++] = 1;
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3324) {
                                if (class218.field3114 >= 5 && class218.field3114 <= 9) {
                                    class170.field2327[var6++] = class218.field3114;
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3325) {
                                class170.field2327[var6++] = class199.field2835 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3326) {
                                class170.field2327[var6++] = class173.field2356.field3416;
                                continue;
                            }
                            if (var528 == 3327) {
                                class170.field2327[var6++] = class173.field2356.field3422.field825 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3328) {
                                class170.field2327[var6++] = field555 && !class162.field2228 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3329) {
                                class170.field2327[var6++] = class72.field998 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3330) {
                                var6--;
                                int var115 = class170.field2327[var6];
                                class170.field2327[var6++] = class315.method2150(var115, 10074);
                                continue;
                            }
                            if (var528 == 3331) {
                                var6 -= 2;
                                int var116 = class170.field2327[var6];
                                int var117 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class185.method1301(client.method823(arg2, -1406), var117, var116, false);
                                continue;
                            }
                            if (var528 == 3332) {
                                var6 -= 2;
                                int var118 = class170.field2327[var6];
                                int var119 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class185.method1301(-1283, var119, var118, true);
                                continue;
                            }
                            if (var528 == 3333) {
                                class170.field2327[var6++] = class142.field1942;
                                continue;
                            }
                            if (var528 == 3335) {
                                class170.field2327[var6++] = class202.field2874;
                                continue;
                            }
                            if (var528 == 3336) {
                                var6 -= 4;
                                int var120 = class170.field2327[var6];
                                int var121 = class170.field2327[var6 + 1];
                                int var122 = (var121 << 14) + var120;
                                int var123 = class170.field2327[var6 + 2];
                                int var124 = class170.field2327[var6 + 3];
                                int var125 = (var123 << 28) + var122;
                                int var126 = var124 + var125;
                                class170.field2327[var6++] = var126;
                                continue;
                            }
                            if (var528 == 3337) {
                                class170.field2327[var6++] = class169.field2297;
                                continue;
                            }
                        } else if (var528 < 3500) {
                            if (var528 == 3400) {
                                var6 -= 2;
                                int var469 = class170.field2327[var6];
                                int var470 = class170.field2327[var6 + 1];
                                class28 var471 = class234.method1615((byte) 46, var469);
                                if (var471.field354 == 's') {
                                }
                                class253.field3627[var11++] = var471.method165(var470, -6);
                                continue;
                            }
                            if (var528 == 3408) {
                                var6 -= 4;
                                int var472 = class170.field2327[var6];
                                int var473 = class170.field2327[var6 + 1];
                                int var474 = class170.field2327[var6 + 3];
                                int var475 = class170.field2327[var6 + 2];
                                class28 var476 = class234.method1615((byte) 46, var475);
                                if (var476.field343 == var472 && var476.field354 == var473) {
                                    if (var473 == 115) {
                                        class253.field3627[var11++] = var476.method165(var474, -59);
                                    } else {
                                        class170.field2327[var6++] = var476.method162(var474, (byte) -110);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var528 == 3409) {
                                var6 -= 3;
                                int var477 = class170.field2327[var6];
                                int var478 = class170.field2327[var6 + 2];
                                int var479 = class170.field2327[var6 + 1];
                                if (var479 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class28 var480 = class234.method1615((byte) 46, var479);
                                if (var480.field354 != var477) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class170.field2327[var6++] = var480.method167(var478, 1) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3410) {
                                var11--;
                                String var481 = class253.field3627[var11];
                                var6--;
                                int var482 = class170.field2327[var6];
                                if (var482 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class28 var483 = class234.method1615((byte) 46, var482);
                                if (var483.field354 != 's') {
                                    throw new RuntimeException("C3410-1");
                                }
                                class170.field2327[var6++] = var483.method171(var481, -8753) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3411) {
                                var6--;
                                int var484 = class170.field2327[var6];
                                class28 var485 = class234.method1615((byte) 46, var484);
                                class170.field2327[var6++] = var485.field344.method114(54);
                                continue;
                            }
                        } else if (var528 < 3700) {
                            if (var528 == 3600) {
                                if (class42.field476 == 0) {
                                    class170.field2327[var6++] = -2;
                                } else if (class42.field476 == 1) {
                                    class170.field2327[var6++] = -1;
                                } else {
                                    class170.field2327[var6++] = class44.field535;
                                }
                                continue;
                            }
                            if (var528 == 3601) {
                                var6--;
                                int var445 = class170.field2327[var6];
                                if (class42.field476 == 2 && var445 < class44.field535) {
                                    class253.field3627[var11++] = class207.field2986[var445];
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 3602) {
                                var6--;
                                int var446 = class170.field2327[var6];
                                if (class42.field476 == 2 && class44.field535 > var446) {
                                    class170.field2327[var6++] = class344.field5271[var446];
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3603) {
                                var6--;
                                int var447 = class170.field2327[var6];
                                if (class42.field476 == 2 && var447 < class44.field535) {
                                    class170.field2327[var6++] = class21.field275[var447];
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3604) {
                                var11--;
                                String var448 = class253.field3627[var11];
                                var6--;
                                int var449 = class170.field2327[var6];
                                class324.method2275(var448, arg2 - 128, var449);
                                continue;
                            }
                            if (var528 == 3605) {
                                var11--;
                                String var450 = class253.field3627[var11];
                                class99.method726(class77.method584(var450, 77), (byte) -119);
                                continue;
                            }
                            if (var528 == 3606) {
                                var11--;
                                String var451 = class253.field3627[var11];
                                class192.method1346(false, class77.method584(var451, 81));
                                continue;
                            }
                            if (var528 == 3607) {
                                var11--;
                                String var452 = class253.field3627[var11];
                                class10.method59(false, (byte) 118, class77.method584(var452, 75));
                                continue;
                            }
                            if (var528 == 3608) {
                                var11--;
                                String var453 = class253.field3627[var11];
                                class262.method1792((byte) 67, class77.method584(var453, arg2 - 45));
                                continue;
                            }
                            if (var528 == 3609) {
                                var11--;
                                String var454 = class253.field3627[var11];
                                if (var454.startsWith("<img=0>") || var454.startsWith("<img=1>")) {
                                    var454 = var454.substring(7);
                                }
                                class170.field2327[var6++] = class291.method1993(var454, (byte) 123) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3610) {
                                var6--;
                                int var455 = class170.field2327[var6];
                                if (class42.field476 == 2 && class44.field535 > var455) {
                                    class253.field3627[var11++] = class290.field4325[var455];
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 3611) {
                                if (class73.field1009 == null) {
                                    class253.field3627[var11++] = "";
                                } else {
                                    class253.field3627[var11++] = class286.method1963(false, class73.field1009);
                                }
                                continue;
                            }
                            if (var528 == 3612) {
                                if (class73.field1009 == null) {
                                    class170.field2327[var6++] = 0;
                                } else {
                                    class170.field2327[var6++] = class324.field4917;
                                }
                                continue;
                            }
                            if (var528 == 3613) {
                                var6--;
                                int var456 = class170.field2327[var6];
                                if (class73.field1009 != null && class324.field4917 > var456) {
                                    class253.field3627[var11++] = class286.method1963(false, class344.field5239[var456].field1535);
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 3614) {
                                var6--;
                                int var457 = class170.field2327[var6];
                                if (class73.field1009 != null && var457 < class324.field4917) {
                                    class170.field2327[var6++] = class344.field5239[var457].field1529;
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3615) {
                                var6--;
                                int var458 = class170.field2327[var6];
                                if (class73.field1009 != null && class324.field4917 > var458) {
                                    class170.field2327[var6++] = class344.field5239[var458].field1528;
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3616) {
                                class170.field2327[var6++] = class1.field11;
                                continue;
                            }
                            if (var528 == 3617) {
                                var11--;
                                String var459 = class253.field3627[var11];
                                class297.method2025(var459, (byte) -45);
                                continue;
                            }
                            if (var528 == 3618) {
                                class170.field2327[var6++] = class211.field3060;
                                continue;
                            }
                            if (var528 == 3619) {
                                var11--;
                                String var460 = class253.field3627[var11];
                                class131.method938(class77.method584(var460, 112), false);
                                continue;
                            }
                            if (var528 == 3620) {
                                class78.method603((byte) 84);
                                continue;
                            }
                            if (var528 == 3621) {
                                if (class42.field476 == 0) {
                                    class170.field2327[var6++] = -1;
                                } else {
                                    class170.field2327[var6++] = class64.field826;
                                }
                                continue;
                            }
                            if (var528 == 3622) {
                                var6--;
                                int var461 = class170.field2327[var6];
                                if (class42.field476 != 0 && class64.field826 > var461) {
                                    class253.field3627[var11++] = class256.method1746(class143.field1966[var461], 0);
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 3623) {
                                var11--;
                                String var462 = class253.field3627[var11];
                                if (var462.startsWith("<img=0>") || var462.startsWith("<img=1>")) {
                                    var462 = var462.substring(7);
                                }
                                class170.field2327[var6++] = class24.method143(var462, -23038) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3624) {
                                var6--;
                                int var463 = class170.field2327[var6];
                                if (class344.field5239 != null && var463 < class324.field4917 && class344.field5239[var463].field1535.equalsIgnoreCase(class173.field2356.field3439)) {
                                    class170.field2327[var6++] = 1;
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3625) {
                                if (class73.field1013 == null) {
                                    class253.field3627[var11++] = "";
                                } else {
                                    class253.field3627[var11++] = class286.method1963(false, class73.field1013);
                                }
                                continue;
                            }
                            if (var528 == 3626) {
                                var6--;
                                int var464 = class170.field2327[var6];
                                if (class73.field1009 != null && var464 < class324.field4917) {
                                    class253.field3627[var11++] = class344.field5239[var464].field1536;
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 3627) {
                                var6--;
                                int var465 = class170.field2327[var6];
                                if (class42.field476 == 2 && var465 >= 0 && class44.field535 > var465) {
                                    class170.field2327[var6++] = class30.field370[var465] ? 1 : 0;
                                    continue;
                                }
                                class170.field2327[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3628) {
                                var11--;
                                String var466 = class253.field3627[var11];
                                if (var466.startsWith("<img=0>") || var466.startsWith("<img=1>")) {
                                    var466 = var466.substring(7);
                                }
                                class170.field2327[var6++] = class278.method1929(arg2 - 29629, var466);
                                continue;
                            }
                            if (var528 == 3629) {
                                class170.field2327[var6++] = class316.field4766;
                                continue;
                            }
                            if (var528 == 3630) {
                                var11--;
                                String var467 = class253.field3627[var11];
                                class10.method59(true, (byte) -32, class77.method584(var467, 100));
                                continue;
                            }
                            if (var528 == 3631) {
                                var6--;
                                int var468 = class170.field2327[var6];
                                class170.field2327[var6++] = class113.field1551[var468] ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 4000) {
                            if (var528 == 3903) {
                                var6--;
                                int var431 = class170.field2327[var6];
                                class170.field2327[var6++] = class216.field3086[var431].method1514(-25792);
                                continue;
                            }
                            if (var528 == 3904) {
                                var6--;
                                int var432 = class170.field2327[var6];
                                class170.field2327[var6++] = class216.field3086[var432].field3134;
                                continue;
                            }
                            if (var528 == 3905) {
                                var6--;
                                int var433 = class170.field2327[var6];
                                class170.field2327[var6++] = class216.field3086[var433].field3142;
                                continue;
                            }
                            if (var528 == 3906) {
                                var6--;
                                int var434 = class170.field2327[var6];
                                class170.field2327[var6++] = class216.field3086[var434].field3136;
                                continue;
                            }
                            if (var528 == 3907) {
                                var6--;
                                int var435 = class170.field2327[var6];
                                class170.field2327[var6++] = class216.field3086[var435].field3140;
                                continue;
                            }
                            if (var528 == 3908) {
                                var6--;
                                int var436 = class170.field2327[var6];
                                class170.field2327[var6++] = class216.field3086[var436].field3145;
                                continue;
                            }
                            if (var528 == 3910) {
                                var6--;
                                int var437 = class170.field2327[var6];
                                int var438 = class216.field3086[var437].method1510(7);
                                class170.field2327[var6++] = var438 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3911) {
                                var6--;
                                int var439 = class170.field2327[var6];
                                int var440 = class216.field3086[var439].method1510(7);
                                class170.field2327[var6++] = var440 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3912) {
                                var6--;
                                int var441 = class170.field2327[var6];
                                int var442 = class216.field3086[var441].method1510(7);
                                class170.field2327[var6++] = var442 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3913) {
                                var6--;
                                int var443 = class170.field2327[var6];
                                int var444 = class216.field3086[var443].method1510(7);
                                class170.field2327[var6++] = var444 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 4100) {
                            if (var528 == 4000) {
                                var6 -= 2;
                                int var127 = class170.field2327[var6];
                                int var128 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = var127 + var128;
                                continue;
                            }
                            if (var528 == 4001) {
                                var6 -= 2;
                                int var129 = class170.field2327[var6];
                                int var130 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = var129 - var130;
                                continue;
                            }
                            if (var528 == 4002) {
                                var6 -= 2;
                                int var131 = class170.field2327[var6 + 1];
                                int var132 = class170.field2327[var6];
                                class170.field2327[var6++] = var131 * var132;
                                continue;
                            }
                            if (var528 == 4003) {
                                var6 -= 2;
                                int var133 = class170.field2327[var6 + 1];
                                int var134 = class170.field2327[var6];
                                class170.field2327[var6++] = var134 / var133;
                                continue;
                            }
                            if (var528 == 4004) {
                                var6--;
                                int var135 = class170.field2327[var6];
                                class170.field2327[var6++] = (int) ((double) var135 * Math.random());
                                continue;
                            }
                            if (var528 == 4005) {
                                var6--;
                                int var136 = class170.field2327[var6];
                                class170.field2327[var6++] = (int) ((double) (var136 + 1) * Math.random());
                                continue;
                            }
                            if (var528 == 4006) {
                                var6 -= 5;
                                int var137 = class170.field2327[var6];
                                int var138 = class170.field2327[var6 + 3];
                                int var139 = class170.field2327[var6 + 2];
                                int var140 = class170.field2327[var6 + 4];
                                int var141 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = (var141 - var137) * (var140 - var139) / (var138 - var139) + var137;
                                continue;
                            }
                            if (var528 == 4007) {
                                var6 -= 2;
                                long var142 = (long) class170.field2327[var6 + 1];
                                long var144 = (long) class170.field2327[var6];
                                class170.field2327[var6++] = (int) (var142 * var144 / 100L + var144);
                                continue;
                            }
                            if (var528 == 4008) {
                                var6 -= 2;
                                int var146 = class170.field2327[var6];
                                int var147 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class190.method1334(var146, 0x1 << var147);
                                continue;
                            }
                            if (var528 == 4009) {
                                var6 -= 2;
                                int var148 = class170.field2327[var6];
                                int var149 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class47.method303(var148, -(0x1 << var149) - 1);
                                continue;
                            }
                            if (var528 == 4010) {
                                var6 -= 2;
                                int var150 = class170.field2327[var6];
                                int var151 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class47.method303(var150, 0x1 << var151) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var528 == 4011) {
                                var6 -= 2;
                                int var152 = class170.field2327[var6 + 1];
                                int var153 = class170.field2327[var6];
                                class170.field2327[var6++] = var153 % var152;
                                continue;
                            }
                            if (var528 == 4012) {
                                var6 -= 2;
                                int var154 = class170.field2327[var6];
                                int var155 = class170.field2327[var6 + 1];
                                if (var154 == 0) {
                                    class170.field2327[var6++] = 0;
                                } else {
                                    class170.field2327[var6++] = (int) Math.pow((double) var154, (double) var155);
                                }
                                continue;
                            }
                            if (var528 == 4013) {
                                var6 -= 2;
                                int var156 = class170.field2327[var6 + 1];
                                int var157 = class170.field2327[var6];
                                if (var157 == 0) {
                                    class170.field2327[var6++] = 0;
                                } else if (var156 == 0) {
                                    class170.field2327[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class170.field2327[var6++] = (int) Math.pow((double) var157, 1.0D / (double) var156);
                                }
                                continue;
                            }
                            if (var528 == 4014) {
                                var6 -= 2;
                                int var158 = class170.field2327[var6];
                                int var159 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class47.method303(var159, var158);
                                continue;
                            }
                            if (var528 == 4015) {
                                var6 -= 2;
                                int var160 = class170.field2327[var6 + 1];
                                int var161 = class170.field2327[var6];
                                class170.field2327[var6++] = class190.method1334(var160, var161);
                                continue;
                            }
                            if (var528 == 4016) {
                                var6 -= 2;
                                int var162 = class170.field2327[var6 + 1];
                                int var163 = class170.field2327[var6];
                                class170.field2327[var6++] = var163 < var162 ? var163 : var162;
                                continue;
                            }
                            if (var528 == 4017) {
                                var6 -= 2;
                                int var164 = class170.field2327[var6];
                                int var165 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = var165 < var164 ? var164 : var165;
                                continue;
                            }
                            if (var528 == 4018) {
                                var6 -= 3;
                                long var166 = (long) class170.field2327[var6];
                                long var168 = (long) class170.field2327[var6 + 2];
                                long var170 = (long) class170.field2327[var6 + 1];
                                class170.field2327[var6++] = (int) (var166 * var168 / var170);
                                continue;
                            }
                        } else if (var528 < 4200) {
                            if (var528 == 4100) {
                                var11--;
                                String var172 = class253.field3627[var11];
                                var6--;
                                int var173 = class170.field2327[var6];
                                class253.field3627[var11++] = var172 + var173;
                                continue;
                            }
                            if (var528 == 4101) {
                                var11 -= 2;
                                String var174 = class253.field3627[var11];
                                String var175 = class253.field3627[var11 + 1];
                                class253.field3627[var11++] = var174 + var175;
                                continue;
                            }
                            if (var528 == 4102) {
                                var11--;
                                String var176 = class253.field3627[var11];
                                var6--;
                                int var177 = class170.field2327[var6];
                                class253.field3627[var11++] = var176 + class237.method1634(true, -1, var177);
                                continue;
                            }
                            if (var528 == 4103) {
                                var11--;
                                String var178 = class253.field3627[var11];
                                class253.field3627[var11++] = var178.toLowerCase();
                                continue;
                            }
                            if (var528 == 4104) {
                                var6--;
                                int var179 = class170.field2327[var6];
                                long var180 = (long) var179 * 86400000L + 1014768000000L;
                                class25.field311.setTime(new Date(var180));
                                int var182 = class25.field311.get(5);
                                int var183 = class25.field311.get(2);
                                int var184 = class25.field311.get(1);
                                class253.field3627[var11++] = var182 + "-" + class240.field3407[var183] + "-" + var184;
                                continue;
                            }
                            if (var528 == 4105) {
                                var11 -= 2;
                                String var185 = class253.field3627[var11 + 1];
                                String var186 = class253.field3627[var11];
                                if (class173.field2356.field3422 != null && class173.field2356.field3422.field825) {
                                    class253.field3627[var11++] = var185;
                                    continue;
                                }
                                class253.field3627[var11++] = var186;
                                continue;
                            }
                            if (var528 == 4106) {
                                var6--;
                                int var187 = class170.field2327[var6];
                                class253.field3627[var11++] = Integer.toString(var187);
                                continue;
                            }
                            if (var528 == 4107) {
                                var11 -= 2;
                                class170.field2327[var6++] = class103.method762(class82.method645(class253.field3627[var11 + 1], class253.field3627[var11], 5660, class202.field2874), true);
                                continue;
                            }
                            if (var528 == 4108) {
                                var11--;
                                String var188 = class253.field3627[var11];
                                var6 -= 2;
                                int var189 = class170.field2327[var6];
                                int var190 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class126.method915(client.method823(arg2, 1472219603), var190).method1922(var188, var189);
                                continue;
                            }
                            if (var528 == 4109) {
                                var11--;
                                String var191 = class253.field3627[var11];
                                var6 -= 2;
                                int var192 = class170.field2327[var6];
                                int var193 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = class126.method915(arg2 + 1472219437, var193).method1919(var191, var192);
                                continue;
                            }
                            if (var528 == 4110) {
                                var11 -= 2;
                                String var194 = class253.field3627[var11 + 1];
                                String var195 = class253.field3627[var11];
                                var6--;
                                if (class170.field2327[var6] == 1) {
                                    class253.field3627[var11++] = var195;
                                } else {
                                    class253.field3627[var11++] = var194;
                                }
                                continue;
                            }
                            if (var528 == 4111) {
                                var11--;
                                String var196 = class253.field3627[var11];
                                class253.field3627[var11++] = class277.method1903(var196);
                                continue;
                            }
                            if (var528 == 4112) {
                                var11--;
                                String var197 = class253.field3627[var11];
                                var6--;
                                int var198 = class170.field2327[var6];
                                if (var198 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class253.field3627[var11++] = var197 + (char) var198;
                                continue;
                            }
                            if (var528 == 4113) {
                                var6--;
                                int var199 = class170.field2327[var6];
                                class170.field2327[var6++] = class10.method62(arg2 - 5982, (char) var199) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4114) {
                                var6--;
                                int var200 = class170.field2327[var6];
                                class170.field2327[var6++] = class109.method799((byte) 99, (char) var200) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4115) {
                                var6--;
                                int var201 = class170.field2327[var6];
                                class170.field2327[var6++] = class247.method1691(true, (char) var201) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4116) {
                                var6--;
                                int var202 = class170.field2327[var6];
                                class170.field2327[var6++] = class42.method257(true, (char) var202) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4117) {
                                var11--;
                                String var203 = class253.field3627[var11];
                                if (var203 == null) {
                                    class170.field2327[var6++] = 0;
                                } else {
                                    class170.field2327[var6++] = var203.length();
                                }
                                continue;
                            }
                            if (var528 == 4118) {
                                var6 -= 2;
                                var11--;
                                String var204 = class253.field3627[var11];
                                int var205 = class170.field2327[var6];
                                int var206 = class170.field2327[var6 + 1];
                                class253.field3627[var11++] = var204.substring(var205, var206);
                                continue;
                            }
                            if (var528 == 4119) {
                                var11--;
                                String var207 = class253.field3627[var11];
                                StringBuffer var208 = new StringBuffer(var207.length());
                                boolean var209 = false;
                                for (int var210 = 0; var207.length() > var210; var210++) {
                                    char var211 = var207.charAt(var210);
                                    if (var211 == '<') {
                                        var209 = true;
                                    } else if (var211 == '>') {
                                        var209 = false;
                                    } else if (!var209) {
                                        var208.append(var211);
                                    }
                                }
                                class253.field3627[var11++] = var208.toString();
                                continue;
                            }
                            if (var528 == 4120) {
                                var6 -= 2;
                                var11--;
                                String var212 = class253.field3627[var11];
                                int var213 = class170.field2327[var6];
                                int var214 = class170.field2327[var6 + 1];
                                class170.field2327[var6++] = var212.indexOf(var213, var214);
                                continue;
                            }
                            if (var528 == 4121) {
                                var6--;
                                int var215 = class170.field2327[var6];
                                var11 -= 2;
                                String var216 = class253.field3627[var11];
                                String var217 = class253.field3627[var11 + 1];
                                class170.field2327[var6++] = var216.indexOf(var217, var215);
                                continue;
                            }
                            if (var528 == 4122) {
                                var6--;
                                int var218 = class170.field2327[var6];
                                class170.field2327[var6++] = Character.toLowerCase((char) var218);
                                continue;
                            }
                            if (var528 == 4123) {
                                var6--;
                                int var219 = class170.field2327[var6];
                                class170.field2327[var6++] = Character.toUpperCase((char) var219);
                                continue;
                            }
                            if (var528 == 4124) {
                                var6--;
                                boolean var220 = class170.field2327[var6] != 0;
                                var6--;
                                int var221 = class170.field2327[var6];
                                class253.field3627[var11++] = class138.method998(0, class202.field2874, arg2 - 250, (long) var221, var220);
                                continue;
                            }
                        } else if (var528 < 4300) {
                            if (var528 == 4200) {
                                var6--;
                                int var222 = class170.field2327[var6];
                                class253.field3627[var11++] = class115.method854((byte) 91, var222).field2757;
                                continue;
                            }
                            if (var528 == 4201) {
                                var6 -= 2;
                                int var223 = class170.field2327[var6];
                                int var224 = class170.field2327[var6 + 1];
                                class198 var225 = class115.method854((byte) 76, var223);
                                if (var224 >= 1 && var224 <= 5 && var225.field2813[var224 - 1] != null) {
                                    class253.field3627[var11++] = var225.field2813[var224 - 1];
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 4202) {
                                var6 -= 2;
                                int var226 = class170.field2327[var6 + 1];
                                int var227 = class170.field2327[var6];
                                class198 var228 = class115.method854((byte) 60, var227);
                                if (var226 >= 1 && var226 <= 5 && var228.field2764[var226 - 1] != null) {
                                    class253.field3627[var11++] = var228.field2764[var226 - 1];
                                    continue;
                                }
                                class253.field3627[var11++] = "";
                                continue;
                            }
                            if (var528 == 4203) {
                                var6--;
                                int var229 = class170.field2327[var6];
                                class170.field2327[var6++] = class115.method854((byte) -112, var229).field2806;
                                continue;
                            }
                            if (var528 == 4204) {
                                var6--;
                                int var230 = class170.field2327[var6];
                                class170.field2327[var6++] = class115.method854((byte) -107, var230).field2818 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4205) {
                                var6--;
                                int var231 = class170.field2327[var6];
                                class198 var232 = class115.method854((byte) 88, var231);
                                if (var232.field2762 == -1 && var232.field2777 >= 0) {
                                    class170.field2327[var6++] = var232.field2777;
                                    continue;
                                }
                                class170.field2327[var6++] = var231;
                                continue;
                            }
                            if (var528 == 4206) {
                                var6--;
                                int var233 = class170.field2327[var6];
                                class198 var234 = class115.method854((byte) 51, var233);
                                if (var234.field2762 >= 0 && var234.field2777 >= 0) {
                                    class170.field2327[var6++] = var234.field2777;
                                    continue;
                                }
                                class170.field2327[var6++] = var233;
                                continue;
                            }
                            if (var528 == 4207) {
                                var6--;
                                int var235 = class170.field2327[var6];
                                class170.field2327[var6++] = class115.method854((byte) -99, var235).field2817 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4208) {
                                var6 -= 2;
                                int var236 = class170.field2327[var6];
                                int var237 = class170.field2327[var6 + 1];
                                class115 var238 = class323.method2268(var237, (byte) 115);
                                if (var238.method849(-116)) {
                                    class253.field3627[var11++] = class115.method854((byte) -89, var236).method1400(var237, (byte) 118, var238.field1565);
                                } else {
                                    class170.field2327[var6++] = class115.method854((byte) -99, var236).method1402(true, var238.field1567, var237);
                                }
                                continue;
                            }
                            if (var528 == 4210) {
                                var11--;
                                String var239 = class253.field3627[var11];
                                var6--;
                                int var240 = class170.field2327[var6];
                                class336.method2328(23461, var240 == 1, var239);
                                class170.field2327[var6++] = class153.field2129;
                                continue;
                            }
                            if (var528 == 4211) {
                                if (class1.field2 != null && class274.field4106 < class153.field2129) {
                                    class170.field2327[var6++] = class47.method303(65535, class1.field2[class274.field4106++]);
                                    continue;
                                }
                                class170.field2327[var6++] = -1;
                                continue;
                            }
                            if (var528 == 4212) {
                                class274.field4106 = 0;
                                continue;
                            }
                        } else if (var528 >= 4400) {
                            if (var528 < 4500) {
                                if (var528 == 4400) {
                                    var6 -= 2;
                                    int var241 = class170.field2327[var6];
                                    int var242 = class170.field2327[var6 + 1];
                                    class115 var243 = class323.method2268(var242, (byte) 79);
                                    if (var243.method849(-116)) {
                                        class253.field3627[var11++] = class153.method1106(var241, (byte) -96).method2060(var243.field1565, var242, -24);
                                    } else {
                                        class170.field2327[var6++] = class153.method1106(var241, (byte) -110).method2061(var242, -11088, var243.field1567);
                                    }
                                    continue;
                                }
                            } else if (var528 < 4600) {
                                if (var528 == 4500) {
                                    var6 -= 2;
                                    int var244 = class170.field2327[var6];
                                    int var245 = class170.field2327[var6 + 1];
                                    class115 var246 = class323.method2268(var245, (byte) -120);
                                    if (var246.method849(arg2 - 243)) {
                                        class253.field3627[var11++] = class137.method994(40, var244).method194(var245, var246.field1565, -108);
                                    } else {
                                        class170.field2327[var6++] = class137.method994(51, var244).method200((byte) 124, var246.field1567, var245);
                                    }
                                    continue;
                                }
                            } else if (var528 < 5100) {
                                if (var528 == 5000) {
                                    class170.field2327[var6++] = class196.field2738;
                                    continue;
                                }
                                if (var528 == 5001) {
                                    class141.field1922++;
                                    var6 -= 3;
                                    class196.field2738 = class170.field2327[var6];
                                    class276.field4140 = class170.field2327[var6 + 1];
                                    class318.field4857 = class170.field2327[var6 + 2];
                                    class90.field1264.method2238(179, (byte) -128);
                                    class90.field1264.method2184((byte) 89, class196.field2738);
                                    class90.field1264.method2184((byte) 89, class276.field4140);
                                    class90.field1264.method2184((byte) 89, class318.field4857);
                                    continue;
                                }
                                if (var528 == 5002) {
                                    var11--;
                                    String var247 = class253.field3627[var11];
                                    class241.field3420++;
                                    var6 -= 2;
                                    int var248 = class170.field2327[var6 + 1];
                                    int var249 = class170.field2327[var6];
                                    class90.field1264.method2238(170, (byte) -128);
                                    class90.field1264.method2202(class77.method584(var247, 117), arg2 - 253);
                                    class90.field1264.method2184((byte) 89, var249 - 1);
                                    class90.field1264.method2184((byte) 89, var248);
                                    continue;
                                }
                                if (var528 == 5003) {
                                    var6--;
                                    int var250 = class170.field2327[var6];
                                    String var251 = null;
                                    if (var250 < 100) {
                                        var251 = class33.field392[var250];
                                    }
                                    if (var251 == null) {
                                        var251 = "";
                                    }
                                    class253.field3627[var11++] = var251;
                                    continue;
                                }
                                if (var528 == 5004) {
                                    int var252 = -1;
                                    var6--;
                                    int var253 = class170.field2327[var6];
                                    if (var253 < 100 && class33.field392[var253] != null) {
                                        var252 = class208.field2987[var253];
                                    }
                                    class170.field2327[var6++] = var252;
                                    continue;
                                }
                                if (var528 == 5005) {
                                    class170.field2327[var6++] = class276.field4140;
                                    continue;
                                }
                                if (var528 == 5008) {
                                    var11--;
                                    String var254 = class253.field3627[var11];
                                    if (var254.startsWith("::")) {
                                        class140.method1014(var254, -54);
                                        continue;
                                    }
                                    if (class323.field4898 == 0 && (field555 && !class162.field2228 || class72.field998)) {
                                        continue;
                                    }
                                    class238.field3381++;
                                    byte var255 = 0;
                                    String var256 = var254.toLowerCase();
                                    byte var257 = 0;
                                    if (var256.startsWith(class166.field2268)) {
                                        var255 = 0;
                                        var254 = var254.substring(class166.field2268.length());
                                    } else if (var256.startsWith(class246.field3550)) {
                                        var255 = 1;
                                        var254 = var254.substring(class246.field3550.length());
                                    } else if (var256.startsWith(class332.field5001)) {
                                        var254 = var254.substring(class332.field5001.length());
                                        var255 = 2;
                                    } else if (var256.startsWith(class155.field2145)) {
                                        var254 = var254.substring(class155.field2145.length());
                                        var255 = 3;
                                    } else if (var256.startsWith(class237.field3358)) {
                                        var255 = 4;
                                        var254 = var254.substring(class237.field3358.length());
                                    } else if (var256.startsWith(class121.field1640)) {
                                        var255 = 5;
                                        var254 = var254.substring(class121.field1640.length());
                                    } else if (var256.startsWith(class223.field3218)) {
                                        var255 = 6;
                                        var254 = var254.substring(class223.field3218.length());
                                    } else if (var256.startsWith(class74.field1025)) {
                                        var255 = 7;
                                        var254 = var254.substring(class74.field1025.length());
                                    } else if (var256.startsWith(class183.field2520)) {
                                        var254 = var254.substring(class183.field2520.length());
                                        var255 = 8;
                                    } else if (var256.startsWith(class175.field2377)) {
                                        var255 = 9;
                                        var254 = var254.substring(class175.field2377.length());
                                    } else if (var256.startsWith(class241.field3410)) {
                                        var254 = var254.substring(class241.field3410.length());
                                        var255 = 10;
                                    } else if (var256.startsWith(class97.field1315)) {
                                        var254 = var254.substring(class97.field1315.length());
                                        var255 = 11;
                                    } else if (class202.field2874 != 0) {
                                        if (var256.startsWith(class251.field3595)) {
                                            var254 = var254.substring(class251.field3595.length());
                                            var255 = 0;
                                        } else if (var256.startsWith(class24.field307)) {
                                            var255 = 1;
                                            var254 = var254.substring(class24.field307.length());
                                        } else if (var256.startsWith(class337.field5074)) {
                                            var255 = 2;
                                            var254 = var254.substring(class337.field5074.length());
                                        } else if (var256.startsWith(class59.field805)) {
                                            var255 = 3;
                                            var254 = var254.substring(class59.field805.length());
                                        } else if (var256.startsWith(class39.field447)) {
                                            var255 = 4;
                                            var254 = var254.substring(class39.field447.length());
                                        } else if (var256.startsWith(class222.field3191)) {
                                            var254 = var254.substring(class222.field3191.length());
                                            var255 = 5;
                                        } else if (var256.startsWith(class130.field1786)) {
                                            var254 = var254.substring(class130.field1786.length());
                                            var255 = 6;
                                        } else if (var256.startsWith(class301.field4444)) {
                                            var254 = var254.substring(class301.field4444.length());
                                            var255 = 7;
                                        } else if (var256.startsWith(class272.field4074)) {
                                            var255 = 8;
                                            var254 = var254.substring(class272.field4074.length());
                                        } else if (var256.startsWith(class8.field77)) {
                                            var254 = var254.substring(class8.field77.length());
                                            var255 = 9;
                                        } else if (var256.startsWith(class330.field4976)) {
                                            var254 = var254.substring(class330.field4976.length());
                                            var255 = 10;
                                        } else if (var256.startsWith(class266.field3869)) {
                                            var254 = var254.substring(class266.field3869.length());
                                            var255 = 11;
                                        }
                                    }
                                    String var258 = var254.toLowerCase();
                                    if (var258.startsWith(class22.field286)) {
                                        var254 = var254.substring(class22.field286.length());
                                        var257 = 1;
                                    } else if (var258.startsWith(class22.field282)) {
                                        var254 = var254.substring(class22.field282.length());
                                        var257 = 2;
                                    } else if (var258.startsWith(class47.field587)) {
                                        var254 = var254.substring(class47.field587.length());
                                        var257 = 3;
                                    } else if (var258.startsWith(class170.field2324)) {
                                        var254 = var254.substring(class170.field2324.length());
                                        var257 = 4;
                                    } else if (var258.startsWith(class243.field3468)) {
                                        var257 = 5;
                                        var254 = var254.substring(class243.field3468.length());
                                    } else if (class202.field2874 != 0) {
                                        if (var258.startsWith(class122.field1653)) {
                                            var254 = var254.substring(class122.field1653.length());
                                            var257 = 1;
                                        } else if (var258.startsWith(class296.field4387)) {
                                            var257 = 2;
                                            var254 = var254.substring(class296.field4387.length());
                                        } else if (var258.startsWith(class166.field2265)) {
                                            var254 = var254.substring(class166.field2265.length());
                                            var257 = 3;
                                        } else if (var258.startsWith(class72.field999)) {
                                            var257 = 4;
                                            var254 = var254.substring(class72.field999.length());
                                        } else if (var258.startsWith(class59.field804)) {
                                            var257 = 5;
                                            var254 = var254.substring(class59.field804.length());
                                        }
                                    }
                                    class90.field1264.method2238(3, (byte) -128);
                                    class90.field1264.method2184((byte) 89, 0);
                                    int var259 = class90.field1264.field4777;
                                    class90.field1264.method2184((byte) 89, var255);
                                    class90.field1264.method2184((byte) 89, var257);
                                    class24.method141(true, var254, class90.field1264);
                                    class90.field1264.method2170((byte) -112, class90.field1264.field4777 - var259);
                                    continue;
                                }
                                if (var528 == 5009) {
                                    var11 -= 2;
                                    String var260 = class253.field3627[var11 + 1];
                                    String var261 = class253.field3627[var11];
                                    if (class323.field4898 != 0 || (!field555 || class162.field2228) && !class72.field998) {
                                        class90.field1264.method2238(181, (byte) -128);
                                        class23.field293++;
                                        class90.field1264.method2184((byte) 89, 0);
                                        int var262 = class90.field1264.field4777;
                                        class90.field1264.method2202(class77.method584(var261, 96), -124);
                                        class24.method141(true, var260, class90.field1264);
                                        class90.field1264.method2170((byte) -113, class90.field1264.field4777 - var262);
                                    }
                                    continue;
                                }
                                if (var528 == 5010) {
                                    var6--;
                                    int var263 = class170.field2327[var6];
                                    String var264 = null;
                                    if (var263 < 100) {
                                        var264 = class312.field4719[var263];
                                    }
                                    if (var264 == null) {
                                        var264 = "";
                                    }
                                    class253.field3627[var11++] = var264;
                                    continue;
                                }
                                if (var528 == 5011) {
                                    var6--;
                                    int var265 = class170.field2327[var6];
                                    String var266 = null;
                                    if (var265 < 100) {
                                        var266 = class88.field1246[var265];
                                    }
                                    if (var266 == null) {
                                        var266 = "";
                                    }
                                    class253.field3627[var11++] = var266;
                                    continue;
                                }
                                if (var528 == 5012) {
                                    var6--;
                                    int var267 = class170.field2327[var6];
                                    int var268 = -1;
                                    if (var267 < 100) {
                                        var268 = class90.field1267[var267];
                                    }
                                    class170.field2327[var6++] = var268;
                                    continue;
                                }
                                if (var528 == 5015) {
                                    String var269;
                                    if (class173.field2356 == null || class173.field2356.field3439 == null) {
                                        var269 = class141.field1921;
                                    } else {
                                        var269 = class173.field2356.method1656(-1);
                                    }
                                    class253.field3627[var11++] = var269;
                                    continue;
                                }
                                if (var528 == 5016) {
                                    class170.field2327[var6++] = class318.field4857;
                                    continue;
                                }
                                if (var528 == 5017) {
                                    class170.field2327[var6++] = class256.field3741;
                                    continue;
                                }
                                if (var528 == 5050) {
                                    var6--;
                                    int var270 = class170.field2327[var6];
                                    class253.field3627[var11++] = class287.method1971(var270, arg2 - 254).field970;
                                    continue;
                                }
                                if (var528 == 5051) {
                                    var6--;
                                    int var271 = class170.field2327[var6];
                                    class71 var272 = class287.method1971(var271, arg2 - 108);
                                    if (var272.field959 == null) {
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var272.field959.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5052) {
                                    var6 -= 2;
                                    int var273 = class170.field2327[var6];
                                    int var274 = class170.field2327[var6 + 1];
                                    class71 var275 = class287.method1971(var273, -119);
                                    int var276 = var275.field959[var274];
                                    class170.field2327[var6++] = var276;
                                    continue;
                                }
                                if (var528 == 5053) {
                                    var6--;
                                    int var277 = class170.field2327[var6];
                                    class71 var278 = class287.method1971(var277, -102);
                                    if (var278.field961 == null) {
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var278.field961.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5054) {
                                    var6 -= 2;
                                    int var279 = class170.field2327[var6];
                                    int var280 = class170.field2327[var6 + 1];
                                    class170.field2327[var6++] = class287.method1971(var279, -120).field961[var280];
                                    continue;
                                }
                                if (var528 == 5055) {
                                    var6--;
                                    int var281 = class170.field2327[var6];
                                    class253.field3627[var11++] = class142.method1023((byte) 27, var281).method1974(arg2 - 773383034);
                                    continue;
                                }
                                if (var528 == 5056) {
                                    var6--;
                                    int var282 = class170.field2327[var6];
                                    class287 var283 = class142.method1023((byte) 27, var282);
                                    if (var283.field4272 == null) {
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var283.field4272.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5057) {
                                    var6 -= 2;
                                    int var284 = class170.field2327[var6];
                                    int var285 = class170.field2327[var6 + 1];
                                    class170.field2327[var6++] = class142.method1023((byte) 27, var284).field4272[var285];
                                    continue;
                                }
                                if (var528 == 5058) {
                                    class316.field4790 = new class83();
                                    var6--;
                                    class316.field4790.field1204 = class170.field2327[var6];
                                    class316.field4790.field1200 = class142.method1023((byte) 27, class316.field4790.field1204);
                                    class316.field4790.field1202 = new int[class316.field4790.field1200.method1964(0)];
                                    continue;
                                }
                                if (var528 == 5059) {
                                    class90.field1264.method2238(184, (byte) -128);
                                    class90.field1264.method2184((byte) 89, 0);
                                    int var286 = class90.field1264.field4777;
                                    class42.field479++;
                                    class90.field1264.method2184((byte) 89, 0);
                                    class90.field1264.method2189(arg2 - 128, class316.field4790.field1204);
                                    class316.field4790.field1200.method1965(0, class316.field4790.field1202, class90.field1264);
                                    class90.field1264.method2170((byte) -32, class90.field1264.field4777 - var286);
                                    continue;
                                }
                                if (var528 == 5060) {
                                    class249.field3582++;
                                    var11--;
                                    String var287 = class253.field3627[var11];
                                    class90.field1264.method2238(238, (byte) -128);
                                    class90.field1264.method2184((byte) 89, 0);
                                    int var288 = class90.field1264.field4777;
                                    class90.field1264.method2202(class77.method584(var287, arg2 - 48), -119);
                                    class90.field1264.method2189(arg2 - 128, class316.field4790.field1204);
                                    class316.field4790.field1200.method1965(0, class316.field4790.field1202, class90.field1264);
                                    class90.field1264.method2170((byte) 123, class90.field1264.field4777 - var288);
                                    continue;
                                }
                                if (var528 == 5061) {
                                    class42.field479++;
                                    class90.field1264.method2238(184, (byte) -128);
                                    class90.field1264.method2184((byte) 89, 0);
                                    int var289 = class90.field1264.field4777;
                                    class90.field1264.method2184((byte) 89, 1);
                                    class90.field1264.method2189(arg2 - 128, class316.field4790.field1204);
                                    class316.field4790.field1200.method1965(0, class316.field4790.field1202, class90.field1264);
                                    class90.field1264.method2170((byte) -21, class90.field1264.field4777 - var289);
                                    continue;
                                }
                                if (var528 == 5062) {
                                    var6 -= 2;
                                    int var290 = class170.field2327[var6];
                                    int var291 = class170.field2327[var6 + 1];
                                    class170.field2327[var6++] = class287.method1971(var290, 21).field972[var291];
                                    continue;
                                }
                                if (var528 == 5063) {
                                    var6 -= 2;
                                    int var292 = class170.field2327[var6 + 1];
                                    int var293 = class170.field2327[var6];
                                    class170.field2327[var6++] = class287.method1971(var293, -101).field960[var292];
                                    continue;
                                }
                                if (var528 == 5064) {
                                    var6 -= 2;
                                    int var294 = class170.field2327[var6 + 1];
                                    int var295 = class170.field2327[var6];
                                    if (var294 == -1) {
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        class170.field2327[var6++] = class287.method1971(var295, 121).method515((byte) -113, (char) var294);
                                    }
                                    continue;
                                }
                                if (var528 == 5065) {
                                    var6 -= 2;
                                    int var296 = class170.field2327[var6 + 1];
                                    int var297 = class170.field2327[var6];
                                    if (var296 == -1) {
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        class170.field2327[var6++] = class287.method1971(var297, 94).method521((char) var296, 126);
                                    }
                                    continue;
                                }
                                if (var528 == 5066) {
                                    var6--;
                                    int var298 = class170.field2327[var6];
                                    class170.field2327[var6++] = class142.method1023((byte) 27, var298).method1964(0);
                                    continue;
                                }
                                if (var528 == 5067) {
                                    var6 -= 2;
                                    int var299 = class170.field2327[var6 + 1];
                                    int var300 = class170.field2327[var6];
                                    int var301 = class142.method1023((byte) 27, var300).method1970(var299, arg2 - 245);
                                    class170.field2327[var6++] = var301;
                                    continue;
                                }
                                if (var528 == 5068) {
                                    var6 -= 2;
                                    int var302 = class170.field2327[var6];
                                    int var303 = class170.field2327[var6 + 1];
                                    class316.field4790.field1202[var302] = var303;
                                    continue;
                                }
                                if (var528 == 5069) {
                                    var6 -= 2;
                                    int var304 = class170.field2327[var6];
                                    int var305 = class170.field2327[var6 + 1];
                                    class316.field4790.field1202[var304] = var305;
                                    continue;
                                }
                                if (var528 == 5070) {
                                    var6 -= 3;
                                    int var306 = class170.field2327[var6];
                                    int var307 = class170.field2327[var6 + 1];
                                    int var308 = class170.field2327[var6 + 2];
                                    class287 var309 = class142.method1023((byte) 27, var306);
                                    if (var309.method1970(var307, -111) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class170.field2327[var6++] = var309.method1972(var308, var307, (byte) -56);
                                    continue;
                                }
                                if (var528 == 5071) {
                                    var6--;
                                    boolean var310 = class170.field2327[var6] == 1;
                                    var11--;
                                    String var311 = class253.field3627[var11];
                                    class210.method1474(var311, 27856, var310);
                                    class170.field2327[var6++] = class153.field2129;
                                    continue;
                                }
                                if (var528 == 5072) {
                                    if (class1.field2 != null && class153.field2129 > class274.field4106) {
                                        class170.field2327[var6++] = class47.method303(65535, class1.field2[class274.field4106++]);
                                        continue;
                                    }
                                    class170.field2327[var6++] = -1;
                                    continue;
                                }
                                if (var528 == 5073) {
                                    class274.field4106 = 0;
                                    continue;
                                }
                            } else if (var528 < 5200) {
                                if (var528 == 5100) {
                                    if (class149.field2067[86]) {
                                        class170.field2327[var6++] = 1;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5101) {
                                    if (class149.field2067[82]) {
                                        class170.field2327[var6++] = 1;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5102) {
                                    if (class149.field2067[81]) {
                                        class170.field2327[var6++] = 1;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var528 < 5300) {
                                if (var528 == 5200) {
                                    var6--;
                                    class292.method1996(true, class170.field2327[var6]);
                                    continue;
                                }
                                if (var528 == 5201) {
                                    class170.field2327[var6++] = class154.method1116(-12173);
                                    continue;
                                }
                                if (var528 == 5202) {
                                    var6--;
                                    class128.method924(class170.field2327[var6], 20);
                                    continue;
                                }
                                if (var528 == 5203) {
                                    var11--;
                                    class8.method46(class253.field3627[var11], false);
                                    continue;
                                }
                                if (var528 == 5204) {
                                    class253.field3627[var11 - 1] = class173.method1207(class253.field3627[var11 - 1], (byte) -16);
                                    continue;
                                }
                                if (var528 == 5205) {
                                    var6--;
                                    class204.method1442(-8724, class170.field2327[var6], -1, -1);
                                    continue;
                                }
                                if (var528 == 5206) {
                                    var6--;
                                    int var312 = class170.field2327[var6];
                                    class297 var313 = class226.method1589(var312 & 0x3FFF, var312 >> 14 & 0x3FFF, arg2 - 127);
                                    if (var313 == null) {
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        class170.field2327[var6++] = var313.field4404;
                                    }
                                    continue;
                                }
                                if (var528 == 5207) {
                                    var6--;
                                    class297 var314 = class334.method2320(class170.field2327[var6], 1);
                                    if (var314 != null && var314.field4399 != null) {
                                        class253.field3627[var11++] = var314.field4399;
                                        continue;
                                    }
                                    class253.field3627[var11++] = "";
                                    continue;
                                }
                                if (var528 == 5208) {
                                    class170.field2327[var6++] = class31.field374;
                                    class170.field2327[var6++] = class138.field1900;
                                    continue;
                                }
                                if (var528 == 5209) {
                                    class170.field2327[var6++] = class312.field4712 + class174.field2374;
                                    class170.field2327[var6++] = class56.field765 + class42.field481 - class170.field2315 - 1;
                                    continue;
                                }
                                if (var528 == 5210) {
                                    var6--;
                                    int var315 = class170.field2327[var6];
                                    class297 var316 = class334.method2320(var315, arg2 ^ 0x7E);
                                    if (var316 == null) {
                                        class170.field2327[var6++] = 0;
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = class47.method303(var316.field4402 >> 14, 16383);
                                        class170.field2327[var6++] = class47.method303(16383, var316.field4402);
                                    }
                                    continue;
                                }
                                if (var528 == 5211) {
                                    var6--;
                                    int var317 = class170.field2327[var6];
                                    class297 var318 = class334.method2320(var317, 1);
                                    if (var318 == null) {
                                        class170.field2327[var6++] = 0;
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var318.field4413 - var318.field4415;
                                        class170.field2327[var6++] = var318.field4408 - var318.field4405;
                                    }
                                    continue;
                                }
                                if (var528 == 5212) {
                                    int var319 = class141.method1022(-49);
                                    int var320 = 0;
                                    String var321;
                                    if (var319 == -1) {
                                        var321 = "";
                                    } else {
                                        var321 = class132.field1811.field2390[var319];
                                        var320 = class132.field1811.method1220(-81, var319);
                                    }
                                    String var322 = class170.method1199(true, " ", var321, "<br>");
                                    class253.field3627[var11++] = var322;
                                    class170.field2327[var6++] = var320;
                                    continue;
                                }
                                if (var528 == 5213) {
                                    int var323 = class143.method1029(95);
                                    int var324 = 0;
                                    String var325;
                                    if (var323 == -1) {
                                        var325 = "";
                                    } else {
                                        var325 = class132.field1811.field2390[var323];
                                        var324 = class132.field1811.method1220(arg2 - 240, var323);
                                    }
                                    String var326 = class170.method1199(true, " ", var325, "<br>");
                                    class253.field3627[var11++] = var326;
                                    class170.field2327[var6++] = var324;
                                    continue;
                                }
                                if (var528 == 5214) {
                                    var6--;
                                    int var327 = class170.field2327[var6];
                                    class297 var328 = class103.method756(255);
                                    if (var328 != null) {
                                        int[] var329 = var328.method2024((var327 & 0xFFFF34E) >> 14, (byte) 93, var327 & 0x3FFF, var327 >> 28 & 0x3);
                                        if (var329 != null) {
                                            class90.method688((byte) -42, var329[1], var329[2]);
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5215) {
                                    var6 -= 2;
                                    int var330 = class170.field2327[var6 + 1];
                                    int var331 = class170.field2327[var6];
                                    class65 var332 = class61.method413(var331 & 0x3FFF, (var331 & 0xFFFCD7D) >> 14, arg2 + 12568);
                                    boolean var333 = false;
                                    for (class297 var334 = (class297) var332.method442(-78); var334 != null; var334 = (class297) var332.method444((byte) -96)) {
                                        if (var334.field4404 == var330) {
                                            var333 = true;
                                            break;
                                        }
                                    }
                                    if (var333) {
                                        class170.field2327[var6++] = 1;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5216) {
                                    var6--;
                                    int var335 = class170.field2327[var6];
                                    class336.method2325(var335, -1);
                                    continue;
                                }
                                if (var528 == 5217) {
                                    var6--;
                                    int var336 = class170.field2327[var6];
                                    if (class24.method139((byte) -114, var336)) {
                                        class170.field2327[var6++] = 1;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5218) {
                                    var6--;
                                    int var337 = class170.field2327[var6];
                                    class297 var338 = class334.method2320(var337, 1);
                                    if (var338 == null) {
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        class170.field2327[var6++] = var338.field4414;
                                    }
                                    continue;
                                }
                                if (var528 == 5219) {
                                    var10000 = arg2 ^ 0x3F80;
                                    var11--;
                                    class278.method1926(var10000, class253.field3627[var11]);
                                    continue;
                                }
                                if (var528 == 5220) {
                                    class170.field2327[var6++] = class125.field1700 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 5221) {
                                    var6--;
                                    int var339 = class170.field2327[var6];
                                    class90.method688((byte) -46, var339 >> 14 & 0x3FFF, var339 & 0x3FFF);
                                    continue;
                                }
                                if (var528 == 5222) {
                                    class297 var340 = class103.method756(255);
                                    if (var340 == null) {
                                        class170.field2327[var6++] = -1;
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        int[] var341 = var340.method2026(class312.field4712 + class174.field2374, -19, class56.field765 - (class170.field2315 - class42.field481) - 1);
                                        if (var341 == null) {
                                            class170.field2327[var6++] = -1;
                                            class170.field2327[var6++] = -1;
                                        } else {
                                            class170.field2327[var6++] = var341[1];
                                            class170.field2327[var6++] = var341[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5223) {
                                    var6 -= 2;
                                    int var342 = class170.field2327[var6 + 1];
                                    int var343 = class170.field2327[var6];
                                    class204.method1442(-8724, var343, var342 & 0x3FFF, var342 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var528 == 5224) {
                                    var6--;
                                    int var344 = class170.field2327[var6];
                                    class297 var345 = class103.method756(255);
                                    if (var345 == null) {
                                        class170.field2327[var6++] = -1;
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        int[] var346 = var345.method2024(var344 >> 14 & 0x3FFF, (byte) 93, var344 & 0x3FFF, (var344 & 0x383DF3C9) >> 28);
                                        if (var346 == null) {
                                            class170.field2327[var6++] = -1;
                                            class170.field2327[var6++] = -1;
                                        } else {
                                            class170.field2327[var6++] = var346[1];
                                            class170.field2327[var6++] = var346[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5225) {
                                    var6--;
                                    int var347 = class170.field2327[var6];
                                    class297 var348 = class103.method756(255);
                                    if (var348 == null) {
                                        class170.field2327[var6++] = -1;
                                        class170.field2327[var6++] = -1;
                                    } else {
                                        int[] var349 = var348.method2026(var347 >> 14 & 0x3FFF, -29, var347 & 0x3FFF);
                                        if (var349 == null) {
                                            class170.field2327[var6++] = -1;
                                            class170.field2327[var6++] = -1;
                                        } else {
                                            class170.field2327[var6++] = var349[1];
                                            class170.field2327[var6++] = var349[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var528 < 5400) {
                                if (var528 == 5300) {
                                    var6 -= 2;
                                    int var350 = class170.field2327[var6];
                                    int var351 = class170.field2327[var6 + 1];
                                    class85.method663(3, var350, false, (byte) 44, var351);
                                    class170.field2327[var6++] = class329.field4964 == null ? 0 : 1;
                                    continue;
                                }
                                if (var528 == 5301) {
                                    if (class329.field4964 != null) {
                                        class85.method663(class162.field2230, -1, false, (byte) 44, -1);
                                    }
                                    continue;
                                }
                                if (var528 == 5302) {
                                    class31[] var352 = class216.method1496((byte) 122);
                                    class170.field2327[var6++] = var352.length;
                                    continue;
                                }
                                if (var528 == 5303) {
                                    var6--;
                                    int var353 = class170.field2327[var6];
                                    class31[] var354 = class216.method1496((byte) 123);
                                    class170.field2327[var6++] = var354[var353].field383;
                                    class170.field2327[var6++] = var354[var353].field375;
                                    continue;
                                }
                                if (var528 == 5305) {
                                    int var355 = class253.field3625;
                                    int var356 = -1;
                                    int var357 = class61.field810;
                                    class31[] var358 = class216.method1496((byte) -90);
                                    for (int var359 = 0; var359 < var358.length; var359++) {
                                        class31 var360 = var358[var359];
                                        if (var360.field383 == var355 && var360.field375 == var357) {
                                            var356 = var359;
                                            break;
                                        }
                                    }
                                    class170.field2327[var6++] = var356;
                                    continue;
                                }
                                if (var528 == 5306) {
                                    class170.field2327[var6++] = class323.method2270(31);
                                    continue;
                                }
                                if (var528 == 5307) {
                                    var6--;
                                    int var361 = class170.field2327[var6];
                                    if (var361 < 0 || var361 > 2) {
                                        var361 = 0;
                                    }
                                    class85.method663(var361, -1, false, (byte) 44, -1);
                                    continue;
                                }
                                if (var528 == 5308) {
                                    class170.field2327[var6++] = class162.field2230;
                                    continue;
                                }
                                if (var528 == 5309) {
                                    var6--;
                                    int var362 = class170.field2327[var6];
                                    if (var362 < 0 || var362 > 2) {
                                        var362 = 0;
                                    }
                                    class162.field2230 = var362;
                                    class275.method1894((byte) -101, class165.field2258);
                                    continue;
                                }
                            } else if (var528 < 5500) {
                                if (var528 == 5400) {
                                    class130.field1785++;
                                    var11 -= 2;
                                    String var406 = class253.field3627[var11];
                                    String var407 = class253.field3627[var11 + 1];
                                    var6--;
                                    int var408 = class170.field2327[var6];
                                    class90.field1264.method2238(108, (byte) -128);
                                    class90.field1264.method2184((byte) 89, class312.method2139(-77, var406) + class312.method2139(-85, var407) + 1);
                                    class90.field1264.method2157((byte) -120, var406);
                                    class90.field1264.method2157((byte) -58, var407);
                                    class90.field1264.method2184((byte) 89, var408);
                                    continue;
                                }
                                if (var528 == 5401) {
                                    var6 -= 2;
                                    class312.field4713[class170.field2327[var6]] = (short) class109.method798(true, class170.field2327[var6 + 1]);
                                    class221.method1558((byte) 125);
                                    class234.method1614((byte) 103);
                                    class226.method1586((byte) 8);
                                    class312.method2138(arg2 ^ 0xFFFFFFAD);
                                    class61.method410((byte) 127);
                                    continue;
                                }
                                if (var528 == 5405) {
                                    var6 -= 2;
                                    int var409 = class170.field2327[var6];
                                    int var410 = class170.field2327[var6 + 1];
                                    if (var409 >= 0 && var409 < 2) {
                                        class289.field4315[var409] = new int[var410 << 1][4];
                                    }
                                    continue;
                                }
                                if (var528 == 5406) {
                                    var6 -= 7;
                                    int var411 = class170.field2327[var6 + 1] << 1;
                                    int var412 = class170.field2327[var6 + 2];
                                    int var413 = class170.field2327[var6 + 5];
                                    int var414 = class170.field2327[var6 + 4];
                                    int var415 = class170.field2327[var6 + 3];
                                    int var416 = class170.field2327[var6 + 6];
                                    int var417 = class170.field2327[var6];
                                    if (var417 >= 0 && var417 < 2 && class289.field4315[var417] != null && var411 >= 0 && var411 < class289.field4315[var417].length) {
                                        class289.field4315[var417][var411] = new int[] { (class47.method303(268425406, var412) >> 14) * 128, var415, class47.method303(var412, 16383) * 128, var416 };
                                        class289.field4315[var417][var411 + 1] = new int[] { class47.method303(var414 >> 14, 16383) * 128, var413, class47.method303(var414, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var528 == 5407) {
                                    var6--;
                                    int var418 = class289.field4315[class170.field2327[var6]].length >> 1;
                                    class170.field2327[var6++] = var418;
                                    continue;
                                }
                                if (var528 == 5411) {
                                    if (class329.field4964 != null) {
                                        class85.method663(class162.field2230, -1, false, (byte) 44, -1);
                                    }
                                    if (class138.field1898 == null) {
                                        class221.method1557(-78, false, class174.method1214((byte) -126));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var528 == 5419) {
                                    String var419 = "";
                                    if (class234.field3302 != null) {
                                        if (class234.field3302.field4244 == null) {
                                            var419 = class8.method44(255, class234.field3302.field4240);
                                        } else {
                                            var419 = (String) class234.field3302.field4244;
                                        }
                                    }
                                    class253.field3627[var11++] = var419;
                                    continue;
                                }
                                if (var528 == 5420) {
                                    class170.field2327[var6++] = class80.field1151 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 5421) {
                                    if (class329.field4964 != null) {
                                        class85.method663(class162.field2230, -1, false, (byte) 44, -1);
                                    }
                                    var6--;
                                    boolean var420 = class170.field2327[var6] == 1;
                                    var11--;
                                    String var421 = class253.field3627[var11];
                                    String var422 = class174.method1214((byte) -125) + var421;
                                    if (class138.field1898 == null && (!var420 || class80.field1151 == 3 || !class80.field1164.startsWith("win") || class148.field2054)) {
                                        class221.method1557(-96, var420, var422);
                                        continue;
                                    }
                                    class93.field1287 = var420;
                                    class216.field3083 = var422;
                                    class106.field1436 = class165.field2258.method623((byte) 96, var422);
                                    continue;
                                }
                                if (var528 == 5422) {
                                    var11 -= 2;
                                    String var423 = class253.field3627[var11];
                                    String var424 = class253.field3627[var11 + 1];
                                    var6--;
                                    int var425 = class170.field2327[var6];
                                    if (var423.length() > 0) {
                                        if (class31.field382 == null) {
                                            class31.field382 = new String[class198.field2789[class39.field448]];
                                        }
                                        class31.field382[var425] = var423;
                                    }
                                    if (var424.length() > 0) {
                                        if (class21.field268 == null) {
                                            class21.field268 = new String[class198.field2789[class39.field448]];
                                        }
                                        class21.field268[var425] = var424;
                                    }
                                    continue;
                                }
                                if (var528 == 5423) {
                                    var11--;
                                    System.out.println(class253.field3627[var11]);
                                    continue;
                                }
                                if (var528 == 5424) {
                                    var6 -= 11;
                                    class199.field2842 = class170.field2327[var6];
                                    class246.field3552 = class170.field2327[var6 + 1];
                                    class270.field4009 = class170.field2327[var6 + 2];
                                    class151.field2100 = class170.field2327[var6 + 3];
                                    class333.field5030 = class170.field2327[var6 + 4];
                                    class230.field3260 = class170.field2327[var6 + 5];
                                    class332.field4996 = class170.field2327[var6 + 6];
                                    class304.field4573 = class170.field2327[var6 + 7];
                                    class132.field1802 = class170.field2327[var6 + 8];
                                    class187.field2588 = class170.field2327[var6 + 9];
                                    class157.field2171 = class170.field2327[var6 + 10];
                                    class204.field2948.method961(class333.field5030, (byte) -128);
                                    class204.field2948.method961(class230.field3260, (byte) -128);
                                    class204.field2948.method961(class332.field4996, (byte) -128);
                                    class204.field2948.method961(class304.field4573, (byte) -128);
                                    class204.field2948.method961(class132.field1802, (byte) -128);
                                    class141.field1924 = true;
                                    continue;
                                }
                                if (var528 == 5425) {
                                    class28.method166((byte) -100);
                                    class141.field1924 = false;
                                    continue;
                                }
                                if (var528 == 5426) {
                                    var6--;
                                    class111.field1491 = class170.field2327[var6];
                                    continue;
                                }
                                if (var528 == 5427) {
                                    var6 -= 2;
                                    class166.field2269 = class170.field2327[var6];
                                    class317.field4837 = class170.field2327[var6 + 1];
                                    continue;
                                }
                                if (var528 == 5428) {
                                    var6 -= 2;
                                    int var426 = class170.field2327[var6];
                                    int var427 = class170.field2327[var6 + 1];
                                    class170.field2327[var6++] = class155.method1118(109, var427, var426) ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 5600) {
                                if (var528 == 5500) {
                                    var6 -= 4;
                                    int var363 = class170.field2327[var6];
                                    int var364 = class170.field2327[var6 + 1];
                                    int var365 = class170.field2327[var6 + 3];
                                    int var366 = class170.field2327[var6 + 2];
                                    class41.method253(var364, var365, (var363 & 0x3FFF) - class296.field4394, false, arg2 + 3401, var366, (var363 >> 14 & 0x3FFF) - class132.field1809);
                                    continue;
                                }
                                if (var528 == 5501) {
                                    var6 -= 4;
                                    int var367 = class170.field2327[var6 + 2];
                                    int var368 = class170.field2327[var6 + 3];
                                    int var369 = class170.field2327[var6];
                                    int var370 = class170.field2327[var6 + 1];
                                    class226.method1588(var367, false, (var369 >> 14 & 0x3FFF) - class132.field1809, var370, var368, (var369 & 0x3FFF) - class296.field4394);
                                    continue;
                                }
                                if (var528 == 5502) {
                                    var6 -= 6;
                                    int var371 = class170.field2327[var6];
                                    if (var371 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class31.field379 = var371;
                                    int var372 = class170.field2327[var6 + 1];
                                    if (class289.field4315[class31.field379].length >> 1 <= var372 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class272.field4075 = var372;
                                    class219.field3139 = 0;
                                    class162.field2235 = class170.field2327[var6 + 2];
                                    class194.field2690 = class170.field2327[var6 + 3];
                                    int var373 = class170.field2327[var6 + 4];
                                    if (var373 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class196.field2749 = var373;
                                    int var374 = class170.field2327[var6 + 5];
                                    if ((var374 + 1) >= (class289.field4315[class196.field2749].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class90.field1265 = var374;
                                    class343.field5168 = 3;
                                    continue;
                                }
                                if (var528 == 5503) {
                                    class151.method1094((byte) -35);
                                    continue;
                                }
                                if (var528 == 5504) {
                                    var6 -= 2;
                                    class149.method1080(class170.field2327[var6 + 1], (byte) -125, class170.field2327[var6]);
                                    continue;
                                }
                                if (var528 == 5505) {
                                    class170.field2327[var6++] = (int) class124.field1674;
                                    continue;
                                }
                                if (var528 == 5506) {
                                    class170.field2327[var6++] = (int) class89.field1257;
                                    continue;
                                }
                                if (var528 == 5507) {
                                    class313.method2142((byte) 76);
                                    continue;
                                }
                                if (var528 == 5508) {
                                    class51.method350((byte) 99);
                                    continue;
                                }
                                if (var528 == 5509) {
                                    class343.method2362((byte) 110);
                                    continue;
                                }
                                if (var528 == 5510) {
                                    class33.method185(-21);
                                    continue;
                                }
                                if (var528 == 5512) {
                                    class211.method1479((byte) 115);
                                    continue;
                                }
                            } else if (var528 < 5700) {
                                if (var528 == 5600) {
                                    var11 -= 2;
                                    String var402 = class253.field3627[var11];
                                    String var403 = class253.field3627[var11 + 1];
                                    var6--;
                                    int var404 = class170.field2327[var6];
                                    if (class148.field2051 == 10 && class185.field2545 == 0 && class198.field2822 == 0 && class275.field4128 == 0 && class318.field4860 == 0) {
                                        class125.method896(arg2 - 223082735, var403, var402, var404);
                                    }
                                    continue;
                                }
                                if (var528 == 5601) {
                                    class100.method732(arg2);
                                    continue;
                                }
                                if (var528 == 5602) {
                                    if (class198.field2822 == 0) {
                                        class68.field939 = -2;
                                    }
                                    continue;
                                }
                                if (var528 == 5603) {
                                    var6 -= 4;
                                    if (class148.field2051 == 10 && class185.field2545 == 0 && class198.field2822 == 0 && class275.field4128 == 0 && class318.field4860 == 0) {
                                        class35.method197(class170.field2327[var6], class170.field2327[var6 + 3], 1, class170.field2327[var6 + 2], class170.field2327[var6 + 1]);
                                    }
                                    continue;
                                }
                                if (var528 == 5604) {
                                    var11--;
                                    if (class148.field2051 == 10 && class185.field2545 == 0 && class198.field2822 == 0 && class275.field4128 == 0 && class318.field4860 == 0) {
                                        class56.method383(221, class77.method584(class253.field3627[var11], arg2 - 29));
                                    }
                                    continue;
                                }
                                if (var528 == 5605) {
                                    var6 -= 7;
                                    var11 -= 3;
                                    if (class148.field2051 == 10 && class185.field2545 == 0 && class198.field2822 == 0 && class275.field4128 == 0 && class318.field4860 == 0) {
                                        class64.method437(class170.field2327[var6 + 6] == 1, class253.field3627[var11 + 2], class77.method584(class253.field3627[var11], arg2 ^ 0x34), class170.field2327[var6 + 1], class170.field2327[var6 + 3], class170.field2327[var6 + 2], class170.field2327[var6 + 5] == 1, class253.field3627[var11 + 1], class170.field2327[var6 + 4] == 1, (byte) 82, class170.field2327[var6]);
                                    }
                                    continue;
                                }
                                if (var528 == 5606) {
                                    if (class275.field4128 == 0) {
                                        class243.field3485 = -2;
                                    }
                                    continue;
                                }
                                if (var528 == 5607) {
                                    class170.field2327[var6++] = class68.field939;
                                    continue;
                                }
                                if (var528 == 5608) {
                                    class170.field2327[var6++] = class211.field3062;
                                    continue;
                                }
                                if (var528 == 5609) {
                                    class170.field2327[var6++] = class243.field3485;
                                    continue;
                                }
                                if (var528 == 5610) {
                                    for (int var405 = 0; var405 < 5; var405++) {
                                        class253.field3627[var11++] = var405 < class231.field3271.length ? class286.method1963(false, class231.field3271[var405]) : "";
                                    }
                                    class231.field3271 = null;
                                    continue;
                                }
                                if (var528 == 5611) {
                                    class170.field2327[var6++] = class207.field2976;
                                    continue;
                                }
                            } else if (var528 < 6100) {
                                if (var528 == 6001) {
                                    var6--;
                                    int var392 = class170.field2327[var6];
                                    if (var392 < 1) {
                                        var392 = 1;
                                    }
                                    if (var392 > 4) {
                                        var392 = 4;
                                    }
                                    class297.field4401 = var392;
                                    if (!class67.field908 || !class314.field4736) {
                                        if (class297.field4401 == 1) {
                                            class184.method1281(0.9F);
                                        }
                                        if (class297.field4401 == 2) {
                                            class184.method1281(0.8F);
                                        }
                                        if (class297.field4401 == 3) {
                                            class184.method1281(0.7F);
                                        }
                                        if (class297.field4401 == 4) {
                                            class184.method1281(0.6F);
                                        }
                                    }
                                    if (class67.field908) {
                                        class207.method1463((byte) -116);
                                        if (!class314.field4736) {
                                            class256.method1761(10);
                                        }
                                    }
                                    class234.method1614((byte) 88);
                                    class275.method1894((byte) 111, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6002) {
                                    var6--;
                                    class151.method1102((byte) -127, class170.field2327[var6] == 1);
                                    class295.method2011((byte) 100);
                                    class256.method1761(10);
                                    class312.method2135(false);
                                    class275.method1894((byte) -61, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6003) {
                                    var6--;
                                    class70.field953 = class170.field2327[var6] == 1;
                                    class312.method2135(false);
                                    class275.method1894((byte) 105, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6005) {
                                    var6--;
                                    class183.field2517 = class170.field2327[var6] == 1;
                                    class256.method1761(arg2 - 117);
                                    class275.method1894((byte) -22, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6006) {
                                    var6--;
                                    class218.field3118 = class170.field2327[var6] == 1;
                                    ((class204) class184.field2543).method1446((byte) -102, !class218.field3118);
                                    class275.method1894((byte) 107, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6007) {
                                    var6--;
                                    class99.field1354 = class170.field2327[var6] == 1;
                                    class275.method1894((byte) -24, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6008) {
                                    var6--;
                                    class119.field1610 = class170.field2327[var6] == 1;
                                    class275.method1894((byte) 114, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6009) {
                                    var6--;
                                    class185.field2558 = class170.field2327[var6] == 1;
                                    class275.method1894((byte) 110, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6010) {
                                    var6--;
                                    class342.field5117 = class170.field2327[var6] == 1;
                                    class275.method1894((byte) 109, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6011) {
                                    var6--;
                                    int var393 = class170.field2327[var6];
                                    if (var393 < 0 || var393 > 2) {
                                        var393 = 0;
                                    }
                                    class216.field3091 = var393;
                                    class275.method1894((byte) 100, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6012) {
                                    if (class67.field908) {
                                        class123.method884(0, 0, 126);
                                    }
                                    var6--;
                                    class314.field4736 = class170.field2327[var6] == 1;
                                    if (class67.field908 && class314.field4736) {
                                        class184.method1281(0.7F);
                                    } else {
                                        if (class297.field4401 == 1) {
                                            class184.method1281(0.9F);
                                        }
                                        if (class297.field4401 == 2) {
                                            class184.method1281(0.8F);
                                        }
                                        if (class297.field4401 == 3) {
                                            class184.method1281(0.7F);
                                        }
                                        if (class297.field4401 == 4) {
                                            class184.method1281(0.6F);
                                        }
                                    }
                                    class256.method1761(10);
                                    class275.method1894((byte) 119, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6014) {
                                    var6--;
                                    class131.field1793 = class170.field2327[var6] == 1;
                                    if (class67.field908) {
                                        class256.method1761(arg2 - 117);
                                    }
                                    class275.method1894((byte) -32, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6015) {
                                    var6--;
                                    class287.field4256 = class170.field2327[var6] == 1;
                                    if (class67.field908) {
                                        class207.method1463((byte) -97);
                                    }
                                    class275.method1894((byte) 127, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6016) {
                                    var6--;
                                    int var394 = class170.field2327[var6];
                                    if (var394 < 0 || var394 > 2) {
                                        var394 = 0;
                                    }
                                    class239.field3394 = var394;
                                    if (class67.field908) {
                                        class340.field5112 = true;
                                    }
                                    continue;
                                }
                                if (var528 == 6017) {
                                    var6--;
                                    class72.field1000 = class170.field2327[var6] == 1;
                                    class216.method1499((byte) -122);
                                    class275.method1894((byte) -118, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6018) {
                                    var6--;
                                    int var395 = class170.field2327[var6];
                                    if (var395 < 0) {
                                        var395 = 0;
                                    }
                                    if (var395 > 127) {
                                        var395 = 127;
                                    }
                                    field553 = var395;
                                    class275.method1894((byte) 109, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6019) {
                                    var6--;
                                    int var396 = class170.field2327[var6];
                                    if (var396 < 0) {
                                        var396 = 0;
                                    }
                                    if (var396 > 255) {
                                        var396 = 255;
                                    }
                                    if (class83.field1199 != var396) {
                                        if (class83.field1199 == 0 && class231.field3272 != -1) {
                                            class131.method936(false, false, class173.field2349, class231.field3272, 0, var396);
                                            class31.field384 = false;
                                        } else if (var396 == 0) {
                                            class206.method1457((byte) 70);
                                            class31.field384 = false;
                                        } else {
                                            class138.method999(var396, (byte) 114);
                                        }
                                        class83.field1199 = var396;
                                    }
                                    class275.method1894((byte) -34, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6020) {
                                    var6--;
                                    int var397 = class170.field2327[var6];
                                    if (var397 < 0) {
                                        var397 = 0;
                                    }
                                    if (var397 > 127) {
                                        var397 = 127;
                                    }
                                    class224.field3233 = var397;
                                    class275.method1894((byte) 114, class165.field2258);
                                    class301.field4464 = false;
                                    continue;
                                }
                                if (var528 == 6021) {
                                    var6--;
                                    class337.field5072 = class170.field2327[var6] == 1;
                                    class312.method2135(false);
                                    continue;
                                }
                                if (var528 == 6023) {
                                    var6--;
                                    int var398 = class170.field2327[var6];
                                    boolean var399 = false;
                                    if (var398 < 0) {
                                        var398 = 0;
                                    }
                                    if (var398 > 2) {
                                        var398 = 2;
                                    }
                                    if (class78.field1137 < 96) {
                                        var399 = true;
                                        var398 = 0;
                                    }
                                    class265.method1802(var398);
                                    class275.method1894((byte) -34, class165.field2258);
                                    class301.field4464 = false;
                                    class170.field2327[var6++] = var399 ? 0 : 1;
                                    continue;
                                }
                                if (var528 == 6024) {
                                    var6--;
                                    int var400 = class170.field2327[var6];
                                    if (var400 < 0 || var400 > 2) {
                                        var400 = 0;
                                    }
                                    class135.field1866 = var400;
                                    class275.method1894((byte) 110, class165.field2258);
                                    continue;
                                }
                                if (var528 == 6027) {
                                    var6--;
                                    int var401 = class170.field2327[var6];
                                    if (!class67.field908) {
                                        continue;
                                    }
                                    if (var401 < 0 || var401 > 1) {
                                        var401 = 0;
                                    }
                                    class247.method1694(-94, var401 == 1);
                                    continue;
                                }
                                if (var528 == 6028) {
                                    var6--;
                                    class296.field4389 = class170.field2327[var6] != 0;
                                    class275.method1894((byte) 102, class165.field2258);
                                    continue;
                                }
                            } else if (var528 < 6200) {
                                if (var528 == 6101) {
                                    class170.field2327[var6++] = class297.field4401;
                                    continue;
                                }
                                if (var528 == 6102) {
                                    class170.field2327[var6++] = class154.method1113(client.method823(arg2, -18)) ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6103) {
                                    class170.field2327[var6++] = class70.field953 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6105) {
                                    class170.field2327[var6++] = class183.field2517 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6106) {
                                    class170.field2327[var6++] = class218.field3118 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6107) {
                                    class170.field2327[var6++] = class99.field1354 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6108) {
                                    class170.field2327[var6++] = class119.field1610 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6109) {
                                    class170.field2327[var6++] = class185.field2558 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6110) {
                                    class170.field2327[var6++] = class342.field5117 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6111) {
                                    class170.field2327[var6++] = class216.field3091;
                                    continue;
                                }
                                if (var528 == 6112) {
                                    class170.field2327[var6++] = class314.field4736 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6114) {
                                    class170.field2327[var6++] = class131.field1793 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6115) {
                                    class170.field2327[var6++] = class287.field4256 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6116) {
                                    class170.field2327[var6++] = class239.field3394;
                                    continue;
                                }
                                if (var528 == 6117) {
                                    class170.field2327[var6++] = class72.field1000 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6118) {
                                    class170.field2327[var6++] = field553;
                                    continue;
                                }
                                if (var528 == 6119) {
                                    class170.field2327[var6++] = class83.field1199;
                                    continue;
                                }
                                if (var528 == 6120) {
                                    class170.field2327[var6++] = class224.field3233;
                                    continue;
                                }
                                if (var528 == 6121) {
                                    if (class67.field908) {
                                        class170.field2327[var6++] = class67.field910 ? 1 : 0;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 6123) {
                                    class170.field2327[var6++] = class265.method1803();
                                    continue;
                                }
                                if (var528 == 6124) {
                                    class170.field2327[var6++] = class135.field1866;
                                    continue;
                                }
                                if (var528 == 6126) {
                                    if (class67.field908) {
                                        class170.field2327[var6++] = class40.method246() ? 1 : 0;
                                    } else {
                                        class170.field2327[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 6127) {
                                    class170.field2327[var6++] = class204.field2911 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6128) {
                                    class170.field2327[var6++] = class296.field4389 ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6300) {
                                if (var528 == 6200) {
                                    var6 -= 2;
                                    class65.field850 = (short) class170.field2327[var6];
                                    if (class65.field850 <= 0) {
                                        class65.field850 = 256;
                                    }
                                    class210.field3042 = (short) class170.field2327[var6 + 1];
                                    if (class210.field3042 <= 0) {
                                        class210.field3042 = 205;
                                    }
                                    continue;
                                }
                                if (var528 == 6201) {
                                    var6 -= 2;
                                    class55.field743 = (short) class170.field2327[var6];
                                    if (class55.field743 <= 0) {
                                        class55.field743 = 256;
                                    }
                                    class97.field1313 = (short) class170.field2327[var6 + 1];
                                    if (class97.field1313 <= 0) {
                                        class97.field1313 = 320;
                                    }
                                    continue;
                                }
                                if (var528 == 6202) {
                                    var6 -= 4;
                                    class154.field2138 = (short) class170.field2327[var6];
                                    if (class154.field2138 <= 0) {
                                        class154.field2138 = 1;
                                    }
                                    class55.field738 = (short) class170.field2327[var6 + 1];
                                    if (class55.field738 <= 0) {
                                        class55.field738 = 32767;
                                    } else if (class154.field2138 > class55.field738) {
                                        class55.field738 = class154.field2138;
                                    }
                                    class239.field3396 = (short) class170.field2327[var6 + 2];
                                    if (class239.field3396 <= 0) {
                                        class239.field3396 = 1;
                                    }
                                    class116.field1568 = (short) class170.field2327[var6 + 3];
                                    if (class116.field1568 <= 0) {
                                        class116.field1568 = 32767;
                                    } else if (class239.field3396 > class116.field1568) {
                                        class116.field1568 = class239.field3396;
                                    }
                                    continue;
                                }
                                if (var528 == 6203) {
                                    class165.method1181(0, 25824, class198.field2782.field5334, false, class198.field2782.field5293, 0);
                                    class170.field2327[var6++] = class97.field1312;
                                    class170.field2327[var6++] = class280.field4202;
                                    continue;
                                }
                                if (var528 == 6204) {
                                    class170.field2327[var6++] = class55.field743;
                                    class170.field2327[var6++] = class97.field1313;
                                    continue;
                                }
                                if (var528 == 6205) {
                                    class170.field2327[var6++] = class65.field850;
                                    class170.field2327[var6++] = class210.field3042;
                                    continue;
                                }
                            } else if (var528 < 6400) {
                                if (var528 == 6300) {
                                    class170.field2327[var6++] = (int) (class29.method174(27763) / 60000L);
                                    continue;
                                }
                                if (var528 == 6301) {
                                    class170.field2327[var6++] = (int) (class29.method174(27763) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var528 == 6302) {
                                    var6 -= 3;
                                    int var375 = class170.field2327[var6];
                                    int var376 = class170.field2327[var6 + 1];
                                    int var377 = class170.field2327[var6 + 2];
                                    class25.field311.clear();
                                    class25.field311.set(11, 12);
                                    class25.field311.set(var377, var376, var375);
                                    class170.field2327[var6++] = (int) (class25.field311.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var528 == 6303) {
                                    class25.field311.clear();
                                    class25.field311.setTime(new Date(class29.method174(27763)));
                                    class170.field2327[var6++] = class25.field311.get(1);
                                    continue;
                                }
                                if (var528 == 6304) {
                                    var6--;
                                    int var378 = class170.field2327[var6];
                                    boolean var379 = true;
                                    if (var378 < 0) {
                                        var379 = ((var378 + 1) % 4) == 0;
                                    } else if (var378 < 1582) {
                                        var379 = var378 % 4 == 0;
                                    } else if ((var378 % 4) != 0) {
                                        var379 = false;
                                    } else if (var378 % 100 != 0) {
                                        var379 = true;
                                    } else if ((var378 % 400) != 0) {
                                        var379 = false;
                                    }
                                    class170.field2327[var6++] = var379 ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6500) {
                                if (var528 == 6405) {
                                    class170.field2327[var6++] = class279.method1931((byte) 109) ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6406) {
                                    class170.field2327[var6++] = class39.method237(0) ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6600) {
                                if (var528 == 6500) {
                                    if (class148.field2051 == 10 && class185.field2545 == 0 && class198.field2822 == 0 && class275.field4128 == 0) {
                                        class170.field2327[var6++] = class143.method1034(client.method823(arg2, 9)) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class170.field2327[var6++] = 1;
                                    continue;
                                }
                                if (var528 == 6501) {
                                    class259 var380 = class113.method831(-1);
                                    if (var380 == null) {
                                        class170.field2327[var6++] = -1;
                                        class170.field2327[var6++] = 0;
                                        class253.field3627[var11++] = "";
                                        class170.field2327[var6++] = 0;
                                        class253.field3627[var11++] = "";
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var380.field3814;
                                        class170.field2327[var6++] = var380.field2082;
                                        class253.field3627[var11++] = var380.field3815;
                                        class163 var381 = var380.method1784(100);
                                        class170.field2327[var6++] = var381.field2246;
                                        class253.field3627[var11++] = var381.field2242;
                                        class170.field2327[var6++] = var380.field2084;
                                    }
                                    continue;
                                }
                                if (var528 == 6502) {
                                    class259 var382 = class310.method2127(arg2 ^ 0xFFFFFFD2);
                                    if (var382 == null) {
                                        class170.field2327[var6++] = -1;
                                        class170.field2327[var6++] = 0;
                                        class253.field3627[var11++] = "";
                                        class170.field2327[var6++] = 0;
                                        class253.field3627[var11++] = "";
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var382.field3814;
                                        class170.field2327[var6++] = var382.field2082;
                                        class253.field3627[var11++] = var382.field3815;
                                        class163 var383 = var382.method1784(arg2 - 27);
                                        class170.field2327[var6++] = var383.field2246;
                                        class253.field3627[var11++] = var383.field2242;
                                        class170.field2327[var6++] = var382.field2084;
                                    }
                                    continue;
                                }
                                if (var528 == 6503) {
                                    var6--;
                                    int var384 = class170.field2327[var6];
                                    if (class148.field2051 == 10 && class185.field2545 == 0 && class198.field2822 == 0 && class275.field4128 == 0) {
                                        class170.field2327[var6++] = class242.method1662(var384, (byte) 118) ? 1 : 0;
                                        continue;
                                    }
                                    class170.field2327[var6++] = 0;
                                    continue;
                                }
                                if (var528 == 6504) {
                                    var6--;
                                    class269.field3999 = class170.field2327[var6];
                                    class275.method1894((byte) -55, class165.field2258);
                                    continue;
                                }
                                if (var528 == 6505) {
                                    class170.field2327[var6++] = class269.field3999;
                                    continue;
                                }
                                if (var528 == 6506) {
                                    var6--;
                                    int var385 = class170.field2327[var6];
                                    class259 var386 = class125.method901(true, var385);
                                    if (var386 == null) {
                                        class170.field2327[var6++] = -1;
                                        class253.field3627[var11++] = "";
                                        class170.field2327[var6++] = 0;
                                        class253.field3627[var11++] = "";
                                        class170.field2327[var6++] = 0;
                                    } else {
                                        class170.field2327[var6++] = var386.field2082;
                                        class253.field3627[var11++] = var386.field3815;
                                        class163 var387 = var386.method1784(100);
                                        class170.field2327[var6++] = var387.field2246;
                                        class253.field3627[var11++] = var387.field2242;
                                        class170.field2327[var6++] = var386.field2084;
                                    }
                                    continue;
                                }
                                if (var528 == 6507) {
                                    var6 -= 4;
                                    int var388 = class170.field2327[var6];
                                    int var389 = class170.field2327[var6 + 2];
                                    boolean var390 = class170.field2327[var6 + 1] == 1;
                                    boolean var391 = class170.field2327[var6 + 3] == 1;
                                    class207.method1464(var388, (byte) -91, var391, var390, var389);
                                    continue;
                                }
                            } else if (var528 < 6700) {
                                if (var528 == 6600) {
                                    var6--;
                                    class98.field1340 = class170.field2327[var6] == 1;
                                    class275.method1894((byte) -25, class165.field2258);
                                    continue;
                                }
                                if (var528 == 6601) {
                                    class170.field2327[var6++] = class98.field1340 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var528 == 4300) {
                            var6 -= 2;
                            int var428 = class170.field2327[var6];
                            int var429 = class170.field2327[var6 + 1];
                            class115 var430 = class323.method2268(var429, (byte) 29);
                            if (var430.method849(-116)) {
                                class253.field3627[var11++] = class327.method2285(var428, true).method1257(-16001, var430.field1565, var429);
                            } else {
                                class170.field2327[var6++] = class327.method2285(var428, true).method1262(var429, (byte) 52, var430.field1567);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field3168 == null) {
                if (class6.field46 != 0) {
                    class93.method695((byte) 114, 0, "Clientscript error - check log for details", "");
                }
                class187.method1307("CS2 - scr:" + var5.field2522 + " op:" + var10, var527, 109);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field3168);
                for (int var525 = class21.field278 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class43.field508[var525].field2990.field3168);
                }
                if (var10 == 40) {
                    int var526 = var9[var7];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class6.field46 != 0) {
                    class93.method695((byte) 102, 0, "Clientscript error in: " + var5.field3168, "");
                }
                class187.method1307("CS2 - scr:" + var5.field2522 + " op:" + var10 + var524.toString(), var527, -108);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 6541)
    public static final void method286(int arg0) {
        class148.field2045.method717((byte) 68);
        if (arg0 != 26852) {
            field549 = (class99) null;
        }
        field546++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkm;I)V", line = 6556)
    public static final void method287(class133 arg0, int arg1) {
        class287.field4267 = arg0;
        if (arg1 >= -42) {
            method289(108, true);
        }
        field551++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 6570)
    public static void method288(byte arg0) {
        field549 = null;
        field556 = null;
        if (arg0 <= 6) {
            method286(45);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V", line = 6581)
    public static final void method289(int arg0, boolean arg1) {
        field547++;
        if (!class269.method1854((byte) -110, arg0)) {
            return;
        }
        if (!arg1) {
            method285(-71, (class171) null, -63);
        }
        class344[] var2 = class241.field3419[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class344 var4 = var2[var3];
            if (var4 != null) {
                var4.field5205 = 0;
                var4.field5328 = 1;
                var4.field5233 = 0;
            }
        }
    }
}
