import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class199 extends class82 {

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3021 = new String[500];

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field3025 = 1;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Lpf;")
    public static class294 field3027;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lui;II)V")
    public static final void method1247(class234 arg0, int arg1, int arg2) {
        field3032++;
        Object[] var3 = arg0.field3533;
        int var4 = (Integer) var3[0];
        class283 var5 = class7.method35(88, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        class231.field3476 = 0;
        int[] var9 = var5.field4229;
        int[] var10 = var5.field4238;
        byte var11 = -1;
        try {
            class225.field3374 = new String[var5.field4242];
            class173.field2635 = new int[var5.field4228];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = arg1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field3518;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field3531;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field3528 == null ? -1 : arg0.field3528.field4504;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field3526;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field3528 == null ? -1 : arg0.field3528.field4530;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field3524 == null ? -1 : arg0.field3524.field4504;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field3524 == null ? -1 : arg0.field3524.field4530;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field3530;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field3521;
                    }
                    class173.field2635[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field3520;
                    }
                    class225.field3374[var13++] = var16;
                }
            }
            int var17 = 0;
            label4010: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var517 = var9[var8];
                if (var517 < 100) {
                    if (var517 == 0) {
                        class246.field3682[var6++] = var10[var8];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var10[var8];
                        class246.field3682[var6++] = class35.field494[var18];
                        continue;
                    }
                    int var10001;
                    if (var517 == 2) {
                        int var19 = var10[var8];
                        var10001 = arg1 - 110;
                        var6--;
                        class118.method750(var19, var10001, class246.field3682[var6]);
                        continue;
                    }
                    if (var517 == 3) {
                        class215.field3243[var7++] = var5.field4241[var8];
                        continue;
                    }
                    if (var517 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class246.field3682[var6 + 1] != class246.field3682[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class246.field3682[var6 + 1] == class246.field3682[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class246.field3682[var6] < class246.field3682[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class246.field3682[var6] > class246.field3682[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class231.field3476 == 0) {
                            return;
                        }
                        class133 var20 = class6.field94[--class231.field3476];
                        var5 = var20.field1950;
                        var8 = var20.field1951;
                        class173.field2635 = var20.field1944;
                        var10 = var5.field4238;
                        var9 = var5.field4229;
                        class225.field3374 = var20.field1946;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var10[var8];
                        class246.field3682[var6++] = class275.method1826(class127.method799(arg1, -1914808947), var21);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class36.method222(72, var22, class246.field3682[var6]);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class246.field3682[var6 + 1] >= class246.field3682[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class246.field3682[var6 + 1] <= class246.field3682[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class246.field3682[var6++] = class173.field2635[var10[var8]];
                        continue;
                    }
                    if (var517 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class173.field2635[var10001] = class246.field3682[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class215.field3243[var7++] = class225.field3374[var10[var8]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class225.field3374[var10001] = class215.field3243[var7];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        String var24 = class259.method1743(class215.field3243, var23, var7, (byte) -92);
                        class215.field3243[var7++] = var24;
                        continue;
                    }
                    if (var517 == 38) {
                        var6--;
                        continue;
                    }
                    if (var517 == 39) {
                        var7--;
                        continue;
                    }
                    if (var517 == 40) {
                        int var25 = var10[var8];
                        class283 var26 = class7.method35(90, var25);
                        int[] var27 = new int[var26.field4228];
                        String[] var28 = new String[var26.field4242];
                        for (int var29 = 0; var29 < var26.field4230; var29++) {
                            var27[var29] = class246.field3682[var6 + var29 - var26.field4230];
                        }
                        for (int var30 = 0; var30 < var26.field4234; var30++) {
                            var28[var30] = class215.field3243[var7 + var30 - var26.field4234];
                        }
                        var6 -= var26.field4230;
                        var7 -= var26.field4234;
                        class133 var31 = new class133();
                        var31.field1950 = var5;
                        var31.field1951 = var8;
                        var31.field1946 = class225.field3374;
                        var31.field1944 = class173.field2635;
                        if (class231.field3476 >= class6.field94.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class6.field94[class231.field3476++] = var31;
                        class225.field3374 = var28;
                        class173.field2635 = var27;
                        var9 = var26.field4229;
                        var10 = var26.field4238;
                        var8 = -1;
                        continue;
                    }
                    if (var517 == 42) {
                        class246.field3682[var6++] = class210.field3161[var10[var8]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class210.field3161[var32] = class246.field3682[var6];
                        class270.method1804(var32, -75);
                        continue;
                    }
                    if (var517 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class246.field3682[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            class165.field2539[var33] = var35;
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4010;
                                }
                                class99.field1566[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class246.field3682[var6];
                        if (var39 >= 0 && var39 < class165.field2539[var38]) {
                            class246.field3682[var6++] = class99.field1566[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class246.field3682[var6];
                        if (var41 >= 0 && var41 < class165.field2539[var40]) {
                            class99.field1566[var40][var41] = class246.field3682[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class45.field720[var10[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class215.field3243[var7++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class45.field720[var43] = class215.field3243[var7];
                        class123.method778((byte) 6, var43);
                        continue;
                    }
                    if (var517 == 51) {
                        class253 var44 = var5.field4227[var10[var8]];
                        var6--;
                        class251 var45 = (class251) var44.method1666((long) class246.field3682[var6], (byte) 99);
                        if (var45 != null) {
                            var8 += var45.field3822;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var47 = class246.field3682[var6];
                        int var48 = class246.field3682[var6 + 1];
                        int var49 = class246.field3682[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class289 var50 = class89.method574((byte) -15, var47);
                        if (var50.field4472 == null) {
                            var50.field4472 = new class289[var49 + 1];
                        }
                        if (var49 >= var50.field4472.length) {
                            class289[] var51 = new class289[var49 + 1];
                            for (int var52 = 0; var52 < var50.field4472.length; var52++) {
                                var51[var52] = var50.field4472[var52];
                            }
                            var50.field4472 = var51;
                        }
                        if (var49 > 0 && var50.field4472[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class289 var53 = new class289();
                        var53.field4451 = var53.field4504 = var50.field4504;
                        var53.field4530 = var49;
                        var53.field4394 = var48;
                        var53.field4495 = true;
                        var50.field4472[var49] = var53;
                        if (var46) {
                            class62.field985 = var53;
                        } else {
                            class116.field1769 = var53;
                        }
                        class295.method1980(var50, 0);
                        continue;
                    }
                    if (var517 == 101) {
                        class289 var54 = var46 ? class62.field985 : class116.field1769;
                        if (var54.field4530 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class289 var55 = class89.method574((byte) -15, var54.field4504);
                        var55.field4472[var54.field4530] = null;
                        class295.method1980(var55, 0);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class289 var56 = class89.method574((byte) -15, class246.field3682[var6]);
                        var56.field4472 = null;
                        class295.method1980(var56, arg1 - 1);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var57 = class246.field3682[var6 + 1];
                        int var58 = class246.field3682[var6];
                        class289 var59 = class66.method450(var58, 0, var57);
                        if (var59 != null && var57 != -1) {
                            class246.field3682[var6++] = 1;
                            if (var46) {
                                class62.field985 = var59;
                            } else {
                                class116.field1769 = var59;
                            }
                            continue;
                        }
                        class246.field3682[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var60 = class246.field3682[var6];
                        class289 var61 = class89.method574((byte) -15, var60);
                        if (var61 == null) {
                            class246.field3682[var6++] = 0;
                        } else {
                            class246.field3682[var6++] = 1;
                            if (var46) {
                                class62.field985 = var61;
                            } else {
                                class116.field1769 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var505 = class246.field3682[var6 + 1];
                        int var506 = class246.field3682[var6];
                        for (int var507 = 0; var507 < class145.field2119.length; var507++) {
                            if (class145.field2119[var507] == var506) {
                                class165.field2537.field1670.method522(var505, 0, var507);
                                continue label4010;
                            }
                        }
                        int var508 = 0;
                        while (true) {
                            if (class69.field1091.length <= var508) {
                                continue label4010;
                            }
                            if (class69.field1091[var508] == var506) {
                                class165.field2537.field1670.method522(var505, arg1 - 1, var508);
                                continue label4010;
                            }
                            var508++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var509 = class246.field3682[var6];
                        int var510 = class246.field3682[var6 + 1];
                        class165.field2537.field1670.method526(var510, (byte) 27, var509);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var511 = class246.field3682[var6] != 0;
                        class165.field2537.field1670.method517(var511, 0);
                        continue;
                    }
                } else if (var517 >= 1000 && var517 < 1100 || var517 >= 2000 && var517 < 2100) {
                    class289 var62;
                    if (var517 < 2000) {
                        var62 = var46 ? class62.field985 : class116.field1769;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var62 = class89.method574((byte) -15, class246.field3682[var6]);
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var62.field4410 = class246.field3682[var6];
                        var62.field4440 = class246.field3682[var6 + 1];
                        int var63 = class246.field3682[var6 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        int var64 = class246.field3682[var6 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field4538 = (byte) var64;
                        var62.field4443 = (byte) var63;
                        class295.method1980(var62, 0);
                        class267.method1779(var62, 0);
                        if (var62.field4530 == -1) {
                            class221.method1416((byte) -1, var62.field4504);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var62.field4493 = class246.field3682[var6];
                        var62.field4561 = class246.field3682[var6 + 1];
                        var62.field4399 = 0;
                        var62.field4506 = 0;
                        int var65 = class246.field3682[var6 + 3];
                        int var66 = class246.field3682[var6 + 2];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        var62.field4477 = (byte) var65;
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field4475 = (byte) var66;
                        class295.method1980(var62, 0);
                        class267.method1779(var62, 0);
                        if (var62.field4394 == 0) {
                            class163.method1010(false, var62, true);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var67 = class246.field3682[var6] == 1;
                        if (var67 != var62.field4537) {
                            var62.field4537 = var67;
                            class295.method1980(var62, 0);
                        }
                        if (var62.field4530 == -1) {
                            class246.method1545(false, var62.field4504);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var62.field4463 = class246.field3682[var6];
                        var62.field4481 = class246.field3682[var6 + 1];
                        class295.method1980(var62, 0);
                        class267.method1779(var62, 0);
                        if (var62.field4394 == 0) {
                            class163.method1010(false, var62, true);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var62.field4491 = class246.field3682[var6] == 1;
                        continue;
                    }
                } else if (!(var517 < 1100 || var517 >= 1200) || !(var517 < 2100 || var517 >= 2200)) {
                    class289 var501;
                    if (var517 < 2000) {
                        var501 = var46 ? class62.field985 : class116.field1769;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var501 = class89.method574((byte) -15, class246.field3682[var6]);
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var501.field4396 = class246.field3682[var6];
                        if ((var501.field4423 - var501.field4478) < var501.field4396) {
                            var501.field4396 = var501.field4423 - var501.field4478;
                        }
                        if (var501.field4396 < 0) {
                            var501.field4396 = 0;
                        }
                        var501.field4460 = class246.field3682[var6 + 1];
                        if (var501.field4460 > var501.field4558 - var501.field4444) {
                            var501.field4460 = var501.field4558 - var501.field4444;
                        }
                        if (var501.field4460 < 0) {
                            var501.field4460 = 0;
                        }
                        class295.method1980(var501, 0);
                        if (var501.field4530 == -1) {
                            class162.method1005(var501.field4504, 127);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var501.field4402 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        if (var501.field4530 == -1) {
                            class152.method917(var501.field4504, (byte) -14);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var501.field4418 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var501.field4501 = class246.field3682[var6];
                        class295.method1980(var501, arg1 ^ 0x1);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var501.field4507 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var501.field4414 = class246.field3682[var6];
                        class295.method1980(var501, arg1 ^ 0x1);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var501.field4519 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var501.field4544 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1108) {
                        var501.field4453 = 1;
                        var6--;
                        var501.field4459 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        if (var501.field4530 == -1) {
                            class37.method225(var501.field4504, (byte) -99);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var501.field4392 = class246.field3682[var6];
                        var501.field4424 = class246.field3682[var6 + 1];
                        var501.field4531 = class246.field3682[var6 + 2];
                        var501.field4434 = class246.field3682[var6 + 3];
                        var501.field4473 = class246.field3682[var6 + 4];
                        var501.field4480 = class246.field3682[var6 + 5];
                        class295.method1980(var501, 0);
                        if (var501.field4530 == -1) {
                            class153.method932(var501.field4504, true);
                            class124.method787(var501.field4504, true);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var502 = class246.field3682[var6];
                        if (var501.field4542 != var502) {
                            var501.field4395 = 0;
                            var501.field4397 = 0;
                            var501.field4521 = 1;
                            var501.field4542 = var502;
                            class295.method1980(var501, 0);
                        }
                        if (var501.field4530 == -1) {
                            class77.method514(var501.field4504, (byte) -80);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var501.field4467 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1112) {
                        var7--;
                        String var503 = class215.field3243[var7];
                        if (!var503.equals(var501.field4438)) {
                            var501.field4438 = var503;
                            class295.method1980(var501, arg1 - 1);
                        }
                        if (var501.field4530 == -1) {
                            class212.method1354(var501.field4504, -7478);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var501.field4401 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var501.field4541 = class246.field3682[var6];
                        var501.field4517 = class246.field3682[var6 + 1];
                        var501.field4422 = class246.field3682[var6 + 2];
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var501.field4466 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var501.field4433 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var501.field4570 = class246.field3682[var6];
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var501.field4411 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var501.field4393 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var501.field4423 = class246.field3682[var6];
                        var501.field4558 = class246.field3682[var6 + 1];
                        class295.method1980(var501, arg1 - 1);
                        if (var501.field4394 == 0) {
                            class163.method1010(false, var501, true);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        class295.method1980(var501, 0);
                        var6 -= 2;
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var501.field4458 = class246.field3682[var6] == 1;
                        class295.method1980(var501, 0);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var501.field4480 = class246.field3682[var6];
                        class295.method1980(var501, arg1 ^ 0x1);
                        if (var501.field4530 == -1) {
                            class153.method932(var501.field4504, true);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var504 = class246.field3682[var6];
                        var501.field4469 = var504 == 1;
                        class295.method1980(var501, arg1 ^ 0x1);
                        continue;
                    }
                } else if (!(var517 < 1200 || var517 >= 1300) || !(var517 < 2200 || var517 >= 2300)) {
                    class289 var68;
                    if (var517 < 2000) {
                        var68 = var46 ? class62.field985 : class116.field1769;
                    } else {
                        var6--;
                        var68 = class89.method574((byte) -15, class246.field3682[var6]);
                        var517 -= 1000;
                    }
                    class295.method1980(var68, 0);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var69 = class246.field3682[var6 + 1];
                        int var70 = class246.field3682[var6];
                        if (var68.field4530 == -1) {
                            class99.method641(var68.field4504, arg1 + 8);
                            class153.method932(var68.field4504, true);
                            class124.method787(var68.field4504, true);
                        }
                        if (var70 == -1) {
                            var68.field4459 = -1;
                            var68.field4453 = 1;
                            var68.field4566 = -1;
                            continue;
                        }
                        if (var517 == 1208 || var517 == 1209) {
                            var68.field4465 = true;
                        } else {
                            var68.field4465 = false;
                        }
                        var68.field4557 = var69;
                        var68.field4566 = var70;
                        class43 var71 = class160.method999(var70, 0);
                        var68.field4392 = var71.field660;
                        var68.field4473 = var71.field658;
                        var68.field4480 = var71.field665;
                        if (var517 == 1205) {
                            var68.field4564 = false;
                        } else {
                            var68.field4564 = true;
                        }
                        var68.field4434 = var71.field623;
                        var68.field4531 = var71.field649;
                        var68.field4424 = var71.field650;
                        if (var68.field4399 > 0) {
                            var68.field4480 = var68.field4480 * 32 / var68.field4399;
                        } else if (var68.field4493 > 0) {
                            var68.field4480 = var68.field4480 * 32 / var68.field4493;
                        }
                        continue;
                    }
                    if (var517 == 1201) {
                        var68.field4453 = 2;
                        var6--;
                        var68.field4459 = class246.field3682[var6];
                        if (var68.field4530 == -1) {
                            class37.method225(var68.field4504, (byte) -127);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var68.field4453 = 3;
                        var68.field4459 = class165.field2537.field1670.method525((byte) 72);
                        if (var68.field4530 == -1) {
                            class37.method225(var68.field4504, (byte) -101);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var68.field4453 = 6;
                        var6--;
                        var68.field4459 = class246.field3682[var6];
                        if (var68.field4530 == -1) {
                            class37.method225(var68.field4504, (byte) -107);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var68.field4453 = 5;
                        var6--;
                        var68.field4459 = class246.field3682[var6];
                        if (var68.field4530 == -1) {
                            class37.method225(var68.field4504, (byte) -102);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var68.field4550 = class246.field3682[var6];
                        var68.field4527 = class246.field3682[var6 + 1];
                        var68.field4520 = class246.field3682[var6 + 2];
                        var68.field4488 = class246.field3682[var6 + 3];
                        class295.method1980(var68, 0);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var68.field4523 = class246.field3682[var6];
                        var68.field4464 = class246.field3682[var6 + 1];
                        class295.method1980(var68, 0);
                        continue;
                    }
                } else if (var517 >= 1300 && var517 < 1400 || var517 >= 2300 && var517 < 2400) {
                    class289 var72;
                    if (var517 >= 2000) {
                        var6--;
                        var72 = class89.method574((byte) -15, class246.field3682[var6]);
                        var517 -= 1000;
                    } else {
                        var72 = var46 ? class62.field985 : class116.field1769;
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var73 = class246.field3682[var6] - 1;
                        if (var73 >= 0 && var73 <= 9) {
                            var7--;
                            var72.method1926(class215.field3243[var7], var73, (byte) 28);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var74 = class246.field3682[var6 + 1];
                        int var75 = class246.field3682[var6];
                        var72.field4539 = class66.method450(var75, 0, var74);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var72.field4535 = class246.field3682[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var72.field4482 = class246.field3682[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var72.field4412 = class246.field3682[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var7--;
                        var72.field4407 = class215.field3243[var7];
                        continue;
                    }
                    if (var517 == 1306) {
                        var7--;
                        var72.field4562 = class215.field3243[var7];
                        continue;
                    }
                    if (var517 == 1307) {
                        var72.field4522 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var72.field4484 = class246.field3682[var6];
                        var6--;
                        var72.field4432 = class246.field3682[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var76 = class246.field3682[var6];
                        var6--;
                        int var77 = class246.field3682[var6];
                        if (var77 >= 1 && var77 <= 10) {
                            var72.method1913((byte) -122, var77 - 1, var76);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var7--;
                        var72.field4419 = class215.field3243[var7];
                        continue;
                    }
                } else {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class289 var494;
                        if (var517 < 2000) {
                            var494 = var46 ? class62.field985 : class116.field1769;
                        } else {
                            var517 -= 1000;
                            var6--;
                            var494 = class89.method574((byte) -15, class246.field3682[var6]);
                        }
                        var7--;
                        String var495 = class215.field3243[var7];
                        int[] var496 = null;
                        if (var495.length() > 0 && var495.charAt(var495.length() - 1) == 'Y') {
                            var6--;
                            int var497 = class246.field3682[var6];
                            if (var497 > 0) {
                                var496 = new int[var497];
                                while (var497-- > 0) {
                                    var6--;
                                    var496[var497] = class246.field3682[var6];
                                }
                            }
                            var495 = var495.substring(0, var495.length() - 1);
                        }
                        Object[] var498 = new Object[var495.length() + 1];
                        for (int var499 = var498.length - 1; var499 >= 1; var499--) {
                            if (var495.charAt(var499 - 1) == 's') {
                                var7--;
                                var498[var499] = class215.field3243[var7];
                            } else {
                                var6--;
                                var498[var499] = Integer.valueOf(class246.field3682[var6]);
                            }
                        }
                        var6--;
                        int var500 = class246.field3682[var6];
                        if (var500 == -1) {
                            var498 = null;
                        } else {
                            var498[0] = Integer.valueOf(var500);
                        }
                        if (var517 == 1400) {
                            var494.field4528 = var498;
                        } else if (var517 == 1401) {
                            var494.field4526 = var498;
                        } else if (var517 == 1402) {
                            var494.field4547 = var498;
                        } else if (var517 == 1403) {
                            var494.field4435 = var498;
                        } else if (var517 == 1404) {
                            var494.field4421 = var498;
                        } else if (var517 == 1405) {
                            var494.field4498 = var498;
                        } else if (var517 == 1406) {
                            var494.field4471 = var498;
                        } else if (var517 == 1407) {
                            var494.field4505 = var496;
                            var494.field4559 = var498;
                        } else if (var517 == 1408) {
                            var494.field4555 = var498;
                        } else if (var517 == 1409) {
                            var494.field4487 = var498;
                        } else if (var517 == 1410) {
                            var494.field4456 = var498;
                        } else if (var517 == 1411) {
                            var494.field4514 = var498;
                        } else if (var517 == 1412) {
                            var494.field4549 = var498;
                        } else if (var517 == 1414) {
                            var494.field4536 = var498;
                            var494.field4441 = var496;
                        } else if (var517 == 1415) {
                            var494.field4489 = var496;
                            var494.field4490 = var498;
                        } else if (var517 == 1416) {
                            var494.field4431 = var498;
                        } else if (var517 == 1417) {
                            var494.field4437 = var498;
                        } else if (var517 == 1418) {
                            var494.field4462 = var498;
                        } else if (var517 == 1419) {
                            var494.field4512 = var498;
                        } else if (var517 == 1420) {
                            var494.field4546 = var498;
                        } else if (var517 == 1421) {
                            var494.field4420 = var498;
                        } else if (var517 == 1422) {
                            var494.field4430 = var498;
                        } else if (var517 == 1423) {
                            var494.field4403 = var498;
                        } else if (var517 == 1424) {
                            var494.field4563 = var498;
                        } else if (var517 == 1425) {
                            var494.field4492 = var498;
                        } else if (var517 == 1426) {
                            var494.field4425 = var498;
                        } else if (var517 == 1427) {
                            var494.field4426 = var498;
                        } else if (var517 == 1428) {
                            var494.field4416 = var496;
                            var494.field4503 = var498;
                        } else if (var517 == 1429) {
                            var494.field4486 = var496;
                            var494.field4567 = var498;
                        }
                        var494.field4532 = true;
                        continue;
                    }
                    if (var517 < 1600) {
                        class289 var78 = var46 ? class62.field985 : class116.field1769;
                        if (var517 == 1500) {
                            class246.field3682[var6++] = var78.field4468;
                            continue;
                        }
                        if (var517 == 1501) {
                            class246.field3682[var6++] = var78.field4525;
                            continue;
                        }
                        if (var517 == 1502) {
                            class246.field3682[var6++] = var78.field4478;
                            continue;
                        }
                        if (var517 == 1503) {
                            class246.field3682[var6++] = var78.field4444;
                            continue;
                        }
                        if (var517 == 1504) {
                            class246.field3682[var6++] = var78.field4537 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class246.field3682[var6++] = var78.field4451;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class289 var493 = var46 ? class62.field985 : class116.field1769;
                        if (var517 == 1600) {
                            class246.field3682[var6++] = var493.field4396;
                            continue;
                        }
                        if (var517 == 1601) {
                            class246.field3682[var6++] = var493.field4460;
                            continue;
                        }
                        if (var517 == 1602) {
                            class215.field3243[var7++] = var493.field4438;
                            continue;
                        }
                        if (var517 == 1603) {
                            class246.field3682[var6++] = var493.field4423;
                            continue;
                        }
                        if (var517 == 1604) {
                            class246.field3682[var6++] = var493.field4558;
                            continue;
                        }
                        if (var517 == 1605) {
                            class246.field3682[var6++] = var493.field4480;
                            continue;
                        }
                        if (var517 == 1606) {
                            class246.field3682[var6++] = var493.field4531;
                            continue;
                        }
                        if (var517 == 1607) {
                            class246.field3682[var6++] = var493.field4473;
                            continue;
                        }
                        if (var517 == 1608) {
                            class246.field3682[var6++] = var493.field4434;
                            continue;
                        }
                        if (var517 == 1609) {
                            class246.field3682[var6++] = var493.field4501;
                            continue;
                        }
                        if (var517 == 1610) {
                            class246.field3682[var6++] = var493.field4392;
                            continue;
                        }
                        if (var517 == 1611) {
                            class246.field3682[var6++] = var493.field4424;
                            continue;
                        }
                        if (var517 == 1612) {
                            class246.field3682[var6++] = var493.field4414;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class289 var79 = var46 ? class62.field985 : class116.field1769;
                        if (var517 == 1700) {
                            class246.field3682[var6++] = var79.field4566;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var79.field4566 == -1) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = var79.field4557;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class246.field3682[var6++] = var79.field4530;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class289 var491 = var46 ? class62.field985 : class116.field1769;
                        if (var517 == 1800) {
                            class246.field3682[var6++] = client.method972(var491).method1791((byte) 69);
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var492 = class246.field3682[var6];
                            int var519 = var492 - 1;
                            if (var491.field4522 != null && var519 < var491.field4522.length && var491.field4522[var519] != null) {
                                class215.field3243[var7++] = var491.field4522[var519];
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var491.field4407 == null) {
                                class215.field3243[var7++] = "";
                            } else {
                                class215.field3243[var7++] = var491.field4407;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class289 var490 = class89.method574((byte) -15, class246.field3682[var6]);
                        if (var517 == 2500) {
                            class246.field3682[var6++] = var490.field4468;
                            continue;
                        }
                        if (var517 == 2501) {
                            class246.field3682[var6++] = var490.field4525;
                            continue;
                        }
                        if (var517 == 2502) {
                            class246.field3682[var6++] = var490.field4478;
                            continue;
                        }
                        if (var517 == 2503) {
                            class246.field3682[var6++] = var490.field4444;
                            continue;
                        }
                        if (var517 == 2504) {
                            class246.field3682[var6++] = var490.field4537 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class246.field3682[var6++] = var490.field4451;
                            continue;
                        }
                    } else if (var517 < 2700) {
                        var6--;
                        class289 var80 = class89.method574((byte) -15, class246.field3682[var6]);
                        if (var517 == 2600) {
                            class246.field3682[var6++] = var80.field4396;
                            continue;
                        }
                        if (var517 == 2601) {
                            class246.field3682[var6++] = var80.field4460;
                            continue;
                        }
                        if (var517 == 2602) {
                            class215.field3243[var7++] = var80.field4438;
                            continue;
                        }
                        if (var517 == 2603) {
                            class246.field3682[var6++] = var80.field4423;
                            continue;
                        }
                        if (var517 == 2604) {
                            class246.field3682[var6++] = var80.field4558;
                            continue;
                        }
                        if (var517 == 2605) {
                            class246.field3682[var6++] = var80.field4480;
                            continue;
                        }
                        if (var517 == 2606) {
                            class246.field3682[var6++] = var80.field4531;
                            continue;
                        }
                        if (var517 == 2607) {
                            class246.field3682[var6++] = var80.field4473;
                            continue;
                        }
                        if (var517 == 2608) {
                            class246.field3682[var6++] = var80.field4434;
                            continue;
                        }
                        if (var517 == 2609) {
                            class246.field3682[var6++] = var80.field4501;
                            continue;
                        }
                        if (var517 == 2610) {
                            class246.field3682[var6++] = var80.field4392;
                            continue;
                        }
                        if (var517 == 2611) {
                            class246.field3682[var6++] = var80.field4424;
                            continue;
                        }
                        if (var517 == 2612) {
                            class246.field3682[var6++] = var80.field4414;
                            continue;
                        }
                    } else if (var517 < 2800) {
                        if (var517 == 2700) {
                            var6--;
                            class289 var480 = class89.method574((byte) -15, class246.field3682[var6]);
                            class246.field3682[var6++] = var480.field4566;
                            continue;
                        }
                        if (var517 == 2701) {
                            var6--;
                            class289 var481 = class89.method574((byte) -15, class246.field3682[var6]);
                            if (var481.field4566 == -1) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = var481.field4557;
                            }
                            continue;
                        }
                        if (var517 == 2702) {
                            var6--;
                            int var482 = class246.field3682[var6];
                            class199 var483 = (class199) class229.field3449.method1666((long) var482, (byte) -102);
                            if (var483 == null) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = 1;
                            }
                            continue;
                        }
                        if (var517 == 2703) {
                            var6--;
                            class289 var484 = class89.method574((byte) -15, class246.field3682[var6]);
                            if (var484.field4472 == null) {
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            int var485 = var484.field4472.length;
                            for (int var486 = 0; var486 < var484.field4472.length; var486++) {
                                if (var484.field4472[var486] == null) {
                                    var485 = var486;
                                    break;
                                }
                            }
                            class246.field3682[var6++] = var485;
                            continue;
                        }
                        if (var517 == 2704 || var517 == 2705) {
                            var6 -= 2;
                            int var487 = class246.field3682[var6];
                            int var488 = class246.field3682[var6 + 1];
                            class199 var489 = (class199) class229.field3449.method1666((long) var487, (byte) -97);
                            if (var489 != null && var489.field3026 == var488) {
                                class246.field3682[var6++] = 1;
                            } else {
                                class246.field3682[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var517 < 2900) {
                        var6--;
                        class289 var81 = class89.method574((byte) -15, class246.field3682[var6]);
                        if (var517 == 2800) {
                            class246.field3682[var6++] = client.method972(var81).method1791((byte) 69);
                            continue;
                        }
                        if (var517 == 2801) {
                            var6--;
                            int var82 = class246.field3682[var6];
                            int var518 = var82 - 1;
                            if (var81.field4522 != null && var518 < var81.field4522.length && var81.field4522[var518] != null) {
                                class215.field3243[var7++] = var81.field4522[var518];
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 2802) {
                            if (var81.field4407 == null) {
                                class215.field3243[var7++] = "";
                            } else {
                                class215.field3243[var7++] = var81.field4407;
                            }
                            continue;
                        }
                    } else if (var517 < 3200) {
                        if (var517 == 3100) {
                            var7--;
                            String var465 = class215.field3243[var7];
                            class48.method321(0, "", var465, -121);
                            continue;
                        }
                        if (var517 == 3101) {
                            var6 -= 2;
                            class149.method906(class246.field3682[var6], class246.field3682[var6 + 1], class165.field2537, true);
                            continue;
                        }
                        if (var517 == 3103) {
                            class175.method1081(5885);
                            continue;
                        }
                        if (var517 == 3104) {
                            var7--;
                            String var466 = class215.field3243[var7];
                            class239.field3590++;
                            int var467 = 0;
                            if (class197.method1231(var466, 10)) {
                                var467 = class267.method1785((byte) 35, var466);
                            }
                            class196.field2979.method1106(75, false);
                            class196.field2979.method1577((byte) 45, var467);
                            continue;
                        }
                        if (var517 == 3105) {
                            class36.field503++;
                            var7--;
                            String var468 = class215.field3243[var7];
                            class196.field2979.method1106(112, false);
                            class196.field2979.method1610(791715792, class94.method604((byte) 79, var468));
                            continue;
                        }
                        if (var517 == 3106) {
                            class258.field3935++;
                            var7--;
                            String var469 = class215.field3243[var7];
                            class196.field2979.method1106(1, false);
                            class196.field2979.method1568(var469.length() + 1, (byte) 49);
                            class196.field2979.method1589((byte) 124, var469);
                            continue;
                        }
                        if (var517 == 3107) {
                            var6--;
                            int var470 = class246.field3682[var6];
                            var7--;
                            String var471 = class215.field3243[var7];
                            class236.method1494(var470, false, var471);
                            continue;
                        }
                        if (var517 == 3108) {
                            var6 -= 3;
                            int var472 = class246.field3682[var6 + 2];
                            int var473 = class246.field3682[var6];
                            int var474 = class246.field3682[var6 + 1];
                            class289 var475 = class89.method574((byte) -15, var472);
                            class200.method1256(false, var475, var473, var474);
                            continue;
                        }
                        if (var517 == 3109) {
                            var6 -= 2;
                            int var476 = class246.field3682[var6];
                            class289 var477 = var46 ? class62.field985 : class116.field1769;
                            int var478 = class246.field3682[var6 + 1];
                            class200.method1256(false, var477, var476, var478);
                            continue;
                        }
                        if (var517 == 3110) {
                            class272.field4092++;
                            var6--;
                            int var479 = class246.field3682[var6];
                            class196.field2979.method1106(28, false);
                            class196.field2979.method1605(var479, (byte) -77);
                            continue;
                        }
                    } else if (var517 < 3300) {
                        if (var517 == 3200) {
                            var6 -= 3;
                            class45.method304(class246.field3682[var6], 255, class246.field3682[var6 + 1], arg1 ^ 0x1, class246.field3682[var6 + 2]);
                            continue;
                        }
                        if (var517 == 3201) {
                            var6--;
                            class225.method1439(255, class246.field3682[var6], 117);
                            continue;
                        }
                        if (var517 == 3202) {
                            var6 -= 2;
                            class92.method588(255, 100, class246.field3682[var6 + 1], class246.field3682[var6]);
                            continue;
                        }
                    } else if (var517 < 3400) {
                        if (var517 == 3300) {
                            class246.field3682[var6++] = class270.field4058;
                            continue;
                        }
                        if (var517 == 3301) {
                            var6 -= 2;
                            int var431 = class246.field3682[var6];
                            int var432 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class46.method312(var432, var431, -91);
                            continue;
                        }
                        if (var517 == 3302) {
                            var6 -= 2;
                            int var433 = class246.field3682[var6 + 1];
                            int var434 = class246.field3682[var6];
                            class246.field3682[var6++] = class113.method728(var433, 0, var434);
                            continue;
                        }
                        if (var517 == 3303) {
                            var6 -= 2;
                            int var435 = class246.field3682[var6];
                            int var436 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class27.method169(var436, var435, true);
                            continue;
                        }
                        if (var517 == 3304) {
                            var6--;
                            int var437 = class246.field3682[var6];
                            class246.field3682[var6++] = class150.method909(true, var437).field1907;
                            continue;
                        }
                        if (var517 == 3305) {
                            var6--;
                            int var438 = class246.field3682[var6];
                            class246.field3682[var6++] = class231.field3479[var438];
                            continue;
                        }
                        if (var517 == 3306) {
                            var6--;
                            int var439 = class246.field3682[var6];
                            class246.field3682[var6++] = class155.field2327[var439];
                            continue;
                        }
                        if (var517 == 3307) {
                            var6--;
                            int var440 = class246.field3682[var6];
                            class246.field3682[var6++] = class93.field1481[var440];
                            continue;
                        }
                        if (var517 == 3308) {
                            int var441 = class99.field1557;
                            int var442 = (class165.field2537.field2251 >> 7) + class81.field1303;
                            int var443 = (class165.field2537.field2234 >> 7) + class147.field2141;
                            class246.field3682[var6++] = (var441 << 28) - (-(var442 << 14) - var443);
                            continue;
                        }
                        if (var517 == 3309) {
                            var6--;
                            int var444 = class246.field3682[var6];
                            class246.field3682[var6++] = class94.method598(268426063, var444) >> 14;
                            continue;
                        }
                        if (var517 == 3310) {
                            var6--;
                            int var445 = class246.field3682[var6];
                            class246.field3682[var6++] = var445 >> 28;
                            continue;
                        }
                        if (var517 == 3311) {
                            var6--;
                            int var446 = class246.field3682[var6];
                            class246.field3682[var6++] = class94.method598(var446, 16383);
                            continue;
                        }
                        if (var517 == 3312) {
                            class246.field3682[var6++] = class106.field1615 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3313) {
                            var6 -= 2;
                            int var447 = class246.field3682[var6 + 1];
                            int var448 = class246.field3682[var6] + 32768;
                            class246.field3682[var6++] = class46.method312(var447, var448, -87);
                            continue;
                        }
                        if (var517 == 3314) {
                            var6 -= 2;
                            int var449 = class246.field3682[var6] + 32768;
                            int var450 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class113.method728(var450, 0, var449);
                            continue;
                        }
                        if (var517 == 3315) {
                            var6 -= 2;
                            int var451 = class246.field3682[var6 + 1];
                            int var452 = class246.field3682[var6] + 32768;
                            class246.field3682[var6++] = class27.method169(var451, var452, true);
                            continue;
                        }
                        if (var517 == 3316) {
                            if (class256.field3893 < 2) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = class256.field3893;
                            }
                            continue;
                        }
                        if (var517 == 3317) {
                            class246.field3682[var6++] = class205.field3077;
                            continue;
                        }
                        if (var517 == 3318) {
                            class246.field3682[var6++] = class91.field1434;
                            continue;
                        }
                        if (var517 == 3321) {
                            class246.field3682[var6++] = class118.field1783;
                            continue;
                        }
                        if (var517 == 3322) {
                            class246.field3682[var6++] = class234.field3535;
                            continue;
                        }
                        if (var517 == 3323) {
                            if (class225.field3371 >= 5 && class225.field3371 <= 9) {
                                class246.field3682[var6++] = 1;
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3324) {
                            if (class225.field3371 >= 5 && class225.field3371 <= 9) {
                                class246.field3682[var6++] = class225.field3371;
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3325) {
                            class246.field3682[var6++] = class22.field262 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3326) {
                            class246.field3682[var6++] = class165.field2537.field1647;
                            continue;
                        }
                        if (var517 == 3327) {
                            class246.field3682[var6++] = class165.field2537.field1670.field1254 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3328) {
                            class246.field3682[var6++] = class85.field1354 && !class41.field610 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3329) {
                            class246.field3682[var6++] = class116.field1762 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3330) {
                            var6--;
                            int var453 = class246.field3682[var6];
                            class246.field3682[var6++] = class48.method324(-127, var453);
                            continue;
                        }
                        if (var517 == 3331) {
                            var6 -= 2;
                            int var454 = class246.field3682[var6 + 1];
                            int var455 = class246.field3682[var6];
                            class246.field3682[var6++] = class63.method426(false, var455, var454, 72);
                            continue;
                        }
                        if (var517 == 3332) {
                            var6 -= 2;
                            int var456 = class246.field3682[var6];
                            int var457 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class63.method426(true, var456, var457, 49);
                            continue;
                        }
                        if (var517 == 3333) {
                            class246.field3682[var6++] = class266.field4005;
                            continue;
                        }
                        if (var517 == 3335) {
                            class246.field3682[var6++] = class48.field780;
                            continue;
                        }
                        if (var517 == 3336) {
                            var6 -= 4;
                            int var458 = class246.field3682[var6 + 1];
                            int var459 = class246.field3682[var6 + 2];
                            int var460 = class246.field3682[var6 + 3];
                            int var461 = class246.field3682[var6];
                            int var462 = (var458 << 14) + var461;
                            int var463 = (var459 << 28) + var462;
                            int var464 = var460 + var463;
                            class246.field3682[var6++] = var464;
                            continue;
                        }
                        if (var517 == 3337) {
                            class246.field3682[var6++] = class259.field3946;
                            continue;
                        }
                    } else if (var517 < 3500) {
                        if (var517 == 3400) {
                            var6 -= 2;
                            int var414 = class246.field3682[var6 + 1];
                            int var415 = class246.field3682[var6];
                            class217 var416 = class31.method191(var415, (byte) 35);
                            class215.field3243[var7++] = var416.method1398(-16, var414);
                            continue;
                        }
                        if (var517 == 3408) {
                            var6 -= 4;
                            int var417 = class246.field3682[var6 + 2];
                            int var418 = class246.field3682[var6 + 1];
                            int var419 = class246.field3682[var6];
                            int var420 = class246.field3682[var6 + 3];
                            class217 var421 = class31.method191(var417, (byte) 35);
                            if (var421.field3250 == var419 && var421.field3261 == var418) {
                                if (var418 == 115) {
                                    class215.field3243[var7++] = var421.method1398(-16, var420);
                                } else {
                                    class246.field3682[var6++] = var421.method1388(10, var420);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var517 == 3409) {
                            var6 -= 3;
                            int var422 = class246.field3682[var6 + 1];
                            int var423 = class246.field3682[var6];
                            int var424 = class246.field3682[var6 + 2];
                            if (var422 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class217 var425 = class31.method191(var422, (byte) 35);
                            if (var425.field3261 != var423) {
                                throw new RuntimeException("C3409-1");
                            }
                            class246.field3682[var6++] = var425.method1391(var424, -619991294) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3410) {
                            var6--;
                            int var426 = class246.field3682[var6];
                            var7--;
                            String var427 = class215.field3243[var7];
                            if (var426 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class217 var428 = class31.method191(var426, (byte) 35);
                            if (var428.field3261 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class246.field3682[var6++] = var428.method1395((byte) -97, var427) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3411) {
                            var6--;
                            int var429 = class246.field3682[var6];
                            class217 var430 = class31.method191(var429, (byte) 35);
                            class246.field3682[var6++] = var430.field3254.method1667((byte) -118);
                            continue;
                        }
                    } else if (var517 < 3700) {
                        if (var517 == 3600) {
                            if (class159.field2449 == 0) {
                                class246.field3682[var6++] = -2;
                            } else if (class159.field2449 == 1) {
                                class246.field3682[var6++] = -1;
                            } else {
                                class246.field3682[var6++] = class150.field2164;
                            }
                            continue;
                        }
                        if (var517 == 3601) {
                            var6--;
                            int var83 = class246.field3682[var6];
                            if (class159.field2449 == 2 && class150.field2164 > var83) {
                                class215.field3243[var7++] = class7.field114[var83];
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 3602) {
                            var6--;
                            int var84 = class246.field3682[var6];
                            if (class159.field2449 == 2 && var84 < class150.field2164) {
                                class246.field3682[var6++] = class285.field4275[var84];
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3603) {
                            var6--;
                            int var85 = class246.field3682[var6];
                            if (class159.field2449 == 2 && var85 < class150.field2164) {
                                class246.field3682[var6++] = class223.field3344[var85];
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3604) {
                            var7--;
                            String var86 = class215.field3243[var7];
                            var6--;
                            int var87 = class246.field3682[var6];
                            class56.method381(67, var86, var87);
                            continue;
                        }
                        if (var517 == 3605) {
                            var7--;
                            String var88 = class215.field3243[var7];
                            class11.method51(class94.method604((byte) 83, var88), true);
                            continue;
                        }
                        if (var517 == 3606) {
                            var7--;
                            String var89 = class215.field3243[var7];
                            class243.method1535(class94.method604((byte) -88, var89), 1);
                            continue;
                        }
                        if (var517 == 3607) {
                            var7--;
                            String var90 = class215.field3243[var7];
                            class82.method542(false, arg1 + 34, class94.method604((byte) 100, var90));
                            continue;
                        }
                        if (var517 == 3608) {
                            var7--;
                            String var91 = class215.field3243[var7];
                            class232.method1478((byte) 82, class94.method604((byte) 33, var91));
                            continue;
                        }
                        if (var517 == 3609) {
                            var7--;
                            String var92 = class215.field3243[var7];
                            if (var92.startsWith("<img=0>") || var92.startsWith("<img=1>")) {
                                var92 = var92.substring(7);
                            }
                            class246.field3682[var6++] = class253.method1670(var92, (byte) -53) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3610) {
                            var6--;
                            int var93 = class246.field3682[var6];
                            if (class159.field2449 == 2 && class150.field2164 > var93) {
                                class215.field3243[var7++] = class128.field1917[var93];
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 3611) {
                            if (class132.field1941 == null) {
                                class215.field3243[var7++] = "";
                            } else {
                                class215.field3243[var7++] = class239.method1514(arg1 - 8971, class132.field1941);
                            }
                            continue;
                        }
                        if (var517 == 3612) {
                            if (class132.field1941 == null) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = class224.field3352;
                            }
                            continue;
                        }
                        if (var517 == 3613) {
                            var6--;
                            int var94 = class246.field3682[var6];
                            if (class132.field1941 != null && var94 < class224.field3352) {
                                class215.field3243[var7++] = class239.method1514(class127.method799(arg1, -8969), class184.field2779[var94].field2982);
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 3614) {
                            var6--;
                            int var95 = class246.field3682[var6];
                            if (class132.field1941 != null && class224.field3352 > var95) {
                                class246.field3682[var6++] = class184.field2779[var95].field2977;
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3615) {
                            var6--;
                            int var96 = class246.field3682[var6];
                            if (class132.field1941 != null && var96 < class224.field3352) {
                                class246.field3682[var6++] = class184.field2779[var96].field2987;
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3616) {
                            class246.field3682[var6++] = class113.field1730;
                            continue;
                        }
                        if (var517 == 3617) {
                            var7--;
                            String var97 = class215.field3243[var7];
                            class85.method556(98, var97);
                            continue;
                        }
                        if (var517 == 3618) {
                            class246.field3682[var6++] = class293.field4624;
                            continue;
                        }
                        if (var517 == 3619) {
                            var7--;
                            String var98 = class215.field3243[var7];
                            class77.method516(class94.method604((byte) 85, var98), false);
                            continue;
                        }
                        if (var517 == 3620) {
                            class65.method443(0);
                            continue;
                        }
                        if (var517 == 3621) {
                            if (class159.field2449 == 0) {
                                class246.field3682[var6++] = -1;
                            } else {
                                class246.field3682[var6++] = class154.field2307;
                            }
                            continue;
                        }
                        if (var517 == 3622) {
                            var6--;
                            int var99 = class246.field3682[var6];
                            if (class159.field2449 != 0 && class154.field2307 > var99) {
                                class215.field3243[var7++] = class200.method1255(class35.field493[var99], false);
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 3623) {
                            var7--;
                            String var100 = class215.field3243[var7];
                            if (var100.startsWith("<img=0>") || var100.startsWith("<img=1>")) {
                                var100 = var100.substring(7);
                            }
                            class246.field3682[var6++] = class62.method417((byte) -40, var100) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3624) {
                            var6--;
                            int var101 = class246.field3682[var6];
                            if (class184.field2779 != null && class224.field3352 > var101 && class184.field2779[var101].field2982.equalsIgnoreCase(class165.field2537.field1663)) {
                                class246.field3682[var6++] = 1;
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3625) {
                            if (class277.field4179 == null) {
                                class215.field3243[var7++] = "";
                            } else {
                                class215.field3243[var7++] = class239.method1514(-8970, class277.field4179);
                            }
                            continue;
                        }
                        if (var517 == 3626) {
                            var6--;
                            int var102 = class246.field3682[var6];
                            if (class132.field1941 != null && class224.field3352 > var102) {
                                class215.field3243[var7++] = class184.field2779[var102].field2981;
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 3627) {
                            var6--;
                            int var103 = class246.field3682[var6];
                            if (class159.field2449 == 2 && var103 >= 0 && class150.field2164 > var103) {
                                class246.field3682[var6++] = class32.field462[var103] ? 1 : 0;
                                continue;
                            }
                            class246.field3682[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3628) {
                            var7--;
                            String var104 = class215.field3243[var7];
                            if (var104.startsWith("<img=0>") || var104.startsWith("<img=1>")) {
                                var104 = var104.substring(7);
                            }
                            class246.field3682[var6++] = class219.method1408(var104, 0);
                            continue;
                        }
                        if (var517 == 3629) {
                            class246.field3682[var6++] = class70.field1120;
                            continue;
                        }
                        if (var517 == 3630) {
                            var7--;
                            String var105 = class215.field3243[var7];
                            class82.method542(true, 35, class94.method604((byte) -99, var105));
                            continue;
                        }
                        if (var517 == 3631) {
                            var6--;
                            int var106 = class246.field3682[var6];
                            class246.field3682[var6++] = class27.field335[var106] ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4000) {
                        if (var517 == 3903) {
                            var6--;
                            int var400 = class246.field3682[var6];
                            class246.field3682[var6++] = class143.field2093[var400].method551(arg1 - 15318);
                            continue;
                        }
                        if (var517 == 3904) {
                            var6--;
                            int var401 = class246.field3682[var6];
                            class246.field3682[var6++] = class143.field2093[var401].field1344;
                            continue;
                        }
                        if (var517 == 3905) {
                            var6--;
                            int var402 = class246.field3682[var6];
                            class246.field3682[var6++] = class143.field2093[var402].field1342;
                            continue;
                        }
                        if (var517 == 3906) {
                            var6--;
                            int var403 = class246.field3682[var6];
                            class246.field3682[var6++] = class143.field2093[var403].field1350;
                            continue;
                        }
                        if (var517 == 3907) {
                            var6--;
                            int var404 = class246.field3682[var6];
                            class246.field3682[var6++] = class143.field2093[var404].field1335;
                            continue;
                        }
                        if (var517 == 3908) {
                            var6--;
                            int var405 = class246.field3682[var6];
                            class246.field3682[var6++] = class143.field2093[var405].field1345;
                            continue;
                        }
                        if (var517 == 3910) {
                            var6--;
                            int var406 = class246.field3682[var6];
                            int var407 = class143.field2093[var406].method554(7);
                            class246.field3682[var6++] = var407 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3911) {
                            var6--;
                            int var408 = class246.field3682[var6];
                            int var409 = class143.field2093[var408].method554(arg1 + 6);
                            class246.field3682[var6++] = var409 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3912) {
                            var6--;
                            int var410 = class246.field3682[var6];
                            int var411 = class143.field2093[var410].method554(arg1 ^ 0x6);
                            class246.field3682[var6++] = var411 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3913) {
                            var6--;
                            int var412 = class246.field3682[var6];
                            int var413 = class143.field2093[var412].method554(7);
                            class246.field3682[var6++] = var413 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4100) {
                        if (var517 == 4000) {
                            var6 -= 2;
                            int var107 = class246.field3682[var6];
                            int var108 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = var107 + var108;
                            continue;
                        }
                        if (var517 == 4001) {
                            var6 -= 2;
                            int var109 = class246.field3682[var6 + 1];
                            int var110 = class246.field3682[var6];
                            class246.field3682[var6++] = var110 - var109;
                            continue;
                        }
                        if (var517 == 4002) {
                            var6 -= 2;
                            int var111 = class246.field3682[var6 + 1];
                            int var112 = class246.field3682[var6];
                            class246.field3682[var6++] = var111 * var112;
                            continue;
                        }
                        if (var517 == 4003) {
                            var6 -= 2;
                            int var113 = class246.field3682[var6];
                            int var114 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = var113 / var114;
                            continue;
                        }
                        if (var517 == 4004) {
                            var6--;
                            int var115 = class246.field3682[var6];
                            class246.field3682[var6++] = (int) ((double) var115 * Math.random());
                            continue;
                        }
                        if (var517 == 4005) {
                            var6--;
                            int var116 = class246.field3682[var6];
                            class246.field3682[var6++] = (int) ((double) (var116 + 1) * Math.random());
                            continue;
                        }
                        if (var517 == 4006) {
                            var6 -= 5;
                            int var117 = class246.field3682[var6];
                            int var118 = class246.field3682[var6 + 2];
                            int var119 = class246.field3682[var6 + 3];
                            int var120 = class246.field3682[var6 + 1];
                            int var121 = class246.field3682[var6 + 4];
                            class246.field3682[var6++] = (var120 - var117) * (var121 - var118) / (var119 - var118) + var117;
                            continue;
                        }
                        if (var517 == 4007) {
                            var6 -= 2;
                            long var122 = (long) class246.field3682[var6];
                            long var124 = (long) class246.field3682[var6 + 1];
                            class246.field3682[var6++] = (int) (var122 * var124 / 100L + var122);
                            continue;
                        }
                        if (var517 == 4008) {
                            var6 -= 2;
                            int var126 = class246.field3682[var6 + 1];
                            int var127 = class246.field3682[var6];
                            class246.field3682[var6++] = class63.method428(var127, 0x1 << var126);
                            continue;
                        }
                        if (var517 == 4009) {
                            var6 -= 2;
                            int var128 = class246.field3682[var6];
                            int var129 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class94.method598(var128, -(0x1 << var129) - 1);
                            continue;
                        }
                        if (var517 == 4010) {
                            var6 -= 2;
                            int var130 = class246.field3682[var6];
                            int var131 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class94.method598(0x1 << var131, var130) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var517 == 4011) {
                            var6 -= 2;
                            int var132 = class246.field3682[var6];
                            int var133 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = var132 % var133;
                            continue;
                        }
                        if (var517 == 4012) {
                            var6 -= 2;
                            int var134 = class246.field3682[var6];
                            int var135 = class246.field3682[var6 + 1];
                            if (var134 == 0) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = (int) Math.pow((double) var134, (double) var135);
                            }
                            continue;
                        }
                        if (var517 == 4013) {
                            var6 -= 2;
                            int var136 = class246.field3682[var6];
                            int var137 = class246.field3682[var6 + 1];
                            if (var136 == 0) {
                                class246.field3682[var6++] = 0;
                            } else if (var137 == 0) {
                                class246.field3682[var6++] = Integer.MAX_VALUE;
                            } else {
                                class246.field3682[var6++] = (int) Math.pow((double) var136, 1.0D / (double) var137);
                            }
                            continue;
                        }
                        if (var517 == 4014) {
                            var6 -= 2;
                            int var138 = class246.field3682[var6];
                            int var139 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class94.method598(var139, var138);
                            continue;
                        }
                        if (var517 == 4015) {
                            var6 -= 2;
                            int var140 = class246.field3682[var6];
                            int var141 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class63.method428(var140, var141);
                            continue;
                        }
                        if (var517 == 4016) {
                            var6 -= 2;
                            int var142 = class246.field3682[var6];
                            int var143 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = var142 < var143 ? var142 : var143;
                            continue;
                        }
                        if (var517 == 4017) {
                            var6 -= 2;
                            int var144 = class246.field3682[var6 + 1];
                            int var145 = class246.field3682[var6];
                            class246.field3682[var6++] = var145 > var144 ? var145 : var144;
                            continue;
                        }
                        if (var517 == 4018) {
                            var6 -= 3;
                            long var146 = (long) class246.field3682[var6];
                            long var148 = (long) class246.field3682[var6 + 1];
                            long var150 = (long) class246.field3682[var6 + 2];
                            class246.field3682[var6++] = (int) (var146 * var150 / var148);
                            continue;
                        }
                    } else if (var517 < 4200) {
                        if (var517 == 4100) {
                            var7--;
                            String var350 = class215.field3243[var7];
                            var6--;
                            int var351 = class246.field3682[var6];
                            class215.field3243[var7++] = var350 + var351;
                            continue;
                        }
                        if (var517 == 4101) {
                            var7 -= 2;
                            String var352 = class215.field3243[var7 + 1];
                            String var353 = class215.field3243[var7];
                            class215.field3243[var7++] = var353 + var352;
                            continue;
                        }
                        if (var517 == 4102) {
                            var6--;
                            int var354 = class246.field3682[var6];
                            var7--;
                            String var355 = class215.field3243[var7];
                            class215.field3243[var7++] = var355 + class215.method1375(-32205, true, var354);
                            continue;
                        }
                        if (var517 == 4103) {
                            var7--;
                            String var356 = class215.field3243[var7];
                            class215.field3243[var7++] = var356.toLowerCase();
                            continue;
                        }
                        if (var517 == 4104) {
                            var6--;
                            int var357 = class246.field3682[var6];
                            long var358 = (long) var357 * 86400000L + 1014768000000L;
                            class282.field4214.setTime(new Date(var358));
                            int var360 = class282.field4214.get(5);
                            int var361 = class282.field4214.get(2);
                            int var362 = class282.field4214.get(1);
                            class215.field3243[var7++] = var360 + "-" + class22.field270[var361] + "-" + var362;
                            continue;
                        }
                        if (var517 == 4105) {
                            var7 -= 2;
                            String var363 = class215.field3243[var7 + 1];
                            String var364 = class215.field3243[var7];
                            if (class165.field2537.field1670 != null && class165.field2537.field1670.field1254) {
                                class215.field3243[var7++] = var363;
                                continue;
                            }
                            class215.field3243[var7++] = var364;
                            continue;
                        }
                        if (var517 == 4106) {
                            var6--;
                            int var365 = class246.field3682[var6];
                            class215.field3243[var7++] = Integer.toString(var365);
                            continue;
                        }
                        if (var517 == 4107) {
                            var7 -= 2;
                            class246.field3682[var6++] = class163.method1006(class189.method1190(true, class215.field3243[var7 + 1], class215.field3243[var7], class48.field780), 0);
                            continue;
                        }
                        if (var517 == 4108) {
                            var6 -= 2;
                            int var366 = class246.field3682[var6];
                            int var367 = class246.field3682[var6 + 1];
                            var7--;
                            String var368 = class215.field3243[var7];
                            class246.field3682[var6++] = class277.method1838(121, var367).method1016(var368, var366);
                            continue;
                        }
                        if (var517 == 4109) {
                            var7--;
                            String var369 = class215.field3243[var7];
                            var6 -= 2;
                            int var370 = class246.field3682[var6];
                            int var371 = class246.field3682[var6 + 1];
                            class246.field3682[var6++] = class277.method1838(127, var371).method1015(var369, var370);
                            continue;
                        }
                        if (var517 == 4110) {
                            var7 -= 2;
                            String var372 = class215.field3243[var7 + 1];
                            String var373 = class215.field3243[var7];
                            var6--;
                            if (class246.field3682[var6] == 1) {
                                class215.field3243[var7++] = var373;
                            } else {
                                class215.field3243[var7++] = var372;
                            }
                            continue;
                        }
                        if (var517 == 4111) {
                            var7--;
                            String var374 = class215.field3243[var7];
                            class215.field3243[var7++] = class164.method1021(var374);
                            continue;
                        }
                        if (var517 == 4112) {
                            var7--;
                            String var375 = class215.field3243[var7];
                            var6--;
                            int var376 = class246.field3682[var6];
                            if (var376 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class215.field3243[var7++] = var375 + (char) var376;
                            continue;
                        }
                        if (var517 == 4113) {
                            var6--;
                            int var377 = class246.field3682[var6];
                            class246.field3682[var6++] = class192.method1203((char) var377, 1) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4114) {
                            var6--;
                            int var378 = class246.field3682[var6];
                            class246.field3682[var6++] = class134.method827(-1, (char) var378) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4115) {
                            var6--;
                            int var379 = class246.field3682[var6];
                            class246.field3682[var6++] = class214.method1367(class127.method799(arg1, 114), (char) var379) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4116) {
                            var6--;
                            int var380 = class246.field3682[var6];
                            class246.field3682[var6++] = class66.method449(false, (char) var380) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4117) {
                            var7--;
                            String var381 = class215.field3243[var7];
                            if (var381 == null) {
                                class246.field3682[var6++] = 0;
                            } else {
                                class246.field3682[var6++] = var381.length();
                            }
                            continue;
                        }
                        if (var517 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var382 = class215.field3243[var7];
                            int var383 = class246.field3682[var6 + 1];
                            int var384 = class246.field3682[var6];
                            class215.field3243[var7++] = var382.substring(var384, var383);
                            continue;
                        }
                        if (var517 == 4119) {
                            var7--;
                            String var385 = class215.field3243[var7];
                            StringBuffer var386 = new StringBuffer(var385.length());
                            boolean var387 = false;
                            for (int var388 = 0; var388 < var385.length(); var388++) {
                                char var389 = var385.charAt(var388);
                                if (var389 == '<') {
                                    var387 = true;
                                } else if (var389 == '>') {
                                    var387 = false;
                                } else if (!var387) {
                                    var386.append(var389);
                                }
                            }
                            class215.field3243[var7++] = var386.toString();
                            continue;
                        }
                        if (var517 == 4120) {
                            var6 -= 2;
                            var7--;
                            String var390 = class215.field3243[var7];
                            int var391 = class246.field3682[var6 + 1];
                            int var392 = class246.field3682[var6];
                            class246.field3682[var6++] = var390.indexOf(var392, var391);
                            continue;
                        }
                        if (var517 == 4121) {
                            var7 -= 2;
                            String var393 = class215.field3243[var7];
                            String var394 = class215.field3243[var7 + 1];
                            var6--;
                            int var395 = class246.field3682[var6];
                            class246.field3682[var6++] = var393.indexOf(var394, var395);
                            continue;
                        }
                        if (var517 == 4122) {
                            var6--;
                            int var396 = class246.field3682[var6];
                            class246.field3682[var6++] = Character.toLowerCase((char) var396);
                            continue;
                        }
                        if (var517 == 4123) {
                            var6--;
                            int var397 = class246.field3682[var6];
                            class246.field3682[var6++] = Character.toUpperCase((char) var397);
                            continue;
                        }
                        if (var517 == 4124) {
                            var6--;
                            boolean var398 = class246.field3682[var6] != 0;
                            var6--;
                            int var399 = class246.field3682[var6];
                            class215.field3243[var7++] = class147.method892((long) var399, class48.field780, 0, var398, -24421);
                            continue;
                        }
                    } else if (var517 < 4300) {
                        if (var517 == 4200) {
                            var6--;
                            int var331 = class246.field3682[var6];
                            class215.field3243[var7++] = class160.method999(var331, class127.method799(arg1, 1)).field626;
                            continue;
                        }
                        if (var517 == 4201) {
                            var6 -= 2;
                            int var332 = class246.field3682[var6];
                            int var333 = class246.field3682[var6 + 1];
                            class43 var334 = class160.method999(var332, arg1 - 1);
                            if (var333 >= 1 && var333 <= 5 && var334.field682[var333 - 1] != null) {
                                class215.field3243[var7++] = var334.field682[var333 - 1];
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 4202) {
                            var6 -= 2;
                            int var335 = class246.field3682[var6];
                            int var336 = class246.field3682[var6 + 1];
                            class43 var337 = class160.method999(var335, 0);
                            if (var336 >= 1 && var336 <= 5 && var337.field622[var336 - 1] != null) {
                                class215.field3243[var7++] = var337.field622[var336 - 1];
                                continue;
                            }
                            class215.field3243[var7++] = "";
                            continue;
                        }
                        if (var517 == 4203) {
                            var6--;
                            int var338 = class246.field3682[var6];
                            class246.field3682[var6++] = class160.method999(var338, 0).field668;
                            continue;
                        }
                        if (var517 == 4204) {
                            var6--;
                            int var339 = class246.field3682[var6];
                            class246.field3682[var6++] = class160.method999(var339, 0).field648 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4205) {
                            var6--;
                            int var340 = class246.field3682[var6];
                            class43 var341 = class160.method999(var340, 0);
                            if (var341.field643 == -1 && var341.field677 >= 0) {
                                class246.field3682[var6++] = var341.field677;
                                continue;
                            }
                            class246.field3682[var6++] = var340;
                            continue;
                        }
                        if (var517 == 4206) {
                            var6--;
                            int var342 = class246.field3682[var6];
                            class43 var343 = class160.method999(var342, 0);
                            if (var343.field643 >= 0 && var343.field677 >= 0) {
                                class246.field3682[var6++] = var343.field677;
                                continue;
                            }
                            class246.field3682[var6++] = var342;
                            continue;
                        }
                        if (var517 == 4207) {
                            var6--;
                            int var344 = class246.field3682[var6];
                            class246.field3682[var6++] = class160.method999(var344, 0).field653 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4208) {
                            var6 -= 2;
                            int var345 = class246.field3682[var6];
                            int var346 = class246.field3682[var6 + 1];
                            class144 var347 = class24.method155(var346, (byte) -33);
                            if (var347.method880((byte) -4)) {
                                class215.field3243[var7++] = class160.method999(var345, class127.method799(arg1, 1)).method289(var346, false, var347.field2106);
                            } else {
                                class246.field3682[var6++] = class160.method999(var345, 0).method288(class127.method799(arg1, 5), var346, var347.field2107);
                            }
                            continue;
                        }
                        if (var517 == 4210) {
                            var7--;
                            String var348 = class215.field3243[var7];
                            var6--;
                            int var349 = class246.field3682[var6];
                            class141.method868(true, var349 == 1, var348);
                            class246.field3682[var6++] = class162.field2484;
                            continue;
                        }
                        if (var517 == 4211) {
                            if (class221.field3322 != null && class195.field2972 < class162.field2484) {
                                class246.field3682[var6++] = class94.method598(65535, class221.field3322[class195.field2972++]);
                                continue;
                            }
                            class246.field3682[var6++] = -1;
                            continue;
                        }
                        if (var517 == 4212) {
                            class195.field2972 = 0;
                            continue;
                        }
                    } else if (var517 >= 4400) {
                        if (var517 < 4500) {
                            if (var517 == 4400) {
                                var6 -= 2;
                                int var152 = class246.field3682[var6];
                                int var153 = class246.field3682[var6 + 1];
                                class144 var154 = class24.method155(var153, (byte) -33);
                                if (var154.method880((byte) -4)) {
                                    class215.field3243[var7++] = class274.method1816(122, var152).method1900(var153, var154.field2106, (byte) 126);
                                } else {
                                    class246.field3682[var6++] = class274.method1816(87, var152).method1894(var153, (byte) -126, var154.field2107);
                                }
                                continue;
                            }
                        } else if (var517 < 4600) {
                            if (var517 == 4500) {
                                var6 -= 2;
                                int var155 = class246.field3682[var6];
                                int var156 = class246.field3682[var6 + 1];
                                class144 var157 = class24.method155(var156, (byte) -33);
                                if (var157.method880((byte) -4)) {
                                    class215.field3243[var7++] = class141.method866(var155, -2631).method1230(var157.field2106, var156, 24770);
                                } else {
                                    class246.field3682[var6++] = class141.method866(var155, -2631).method1228(var156, var157.field2107, -128);
                                }
                                continue;
                            }
                        } else if (var517 < 5100) {
                            if (var517 == 5000) {
                                class246.field3682[var6++] = class283.field4232;
                                continue;
                            }
                            if (var517 == 5001) {
                                class254.field3860++;
                                var6 -= 3;
                                class283.field4232 = class246.field3682[var6];
                                class190.field2920 = class246.field3682[var6 + 1];
                                class91.field1445 = class246.field3682[var6 + 2];
                                class196.field2979.method1106(204, false);
                                class196.field2979.method1568(class283.field4232, (byte) 49);
                                class196.field2979.method1568(class190.field2920, (byte) 49);
                                class196.field2979.method1568(class91.field1445, (byte) 49);
                                continue;
                            }
                            if (var517 == 5002) {
                                var6 -= 2;
                                var7--;
                                String var158 = class215.field3243[var7];
                                class224.field3348++;
                                int var159 = class246.field3682[var6];
                                int var160 = class246.field3682[var6 + 1];
                                class196.field2979.method1106(88, false);
                                class196.field2979.method1610(791715792, class94.method604((byte) 97, var158));
                                class196.field2979.method1568(var159 - 1, (byte) 49);
                                class196.field2979.method1568(var160, (byte) 49);
                                continue;
                            }
                            if (var517 == 5003) {
                                var6--;
                                int var161 = class246.field3682[var6];
                                String var162 = null;
                                if (var161 < 100) {
                                    var162 = class202.field3059[var161];
                                }
                                if (var162 == null) {
                                    var162 = "";
                                }
                                class215.field3243[var7++] = var162;
                                continue;
                            }
                            if (var517 == 5004) {
                                var6--;
                                int var163 = class246.field3682[var6];
                                int var164 = -1;
                                if (var163 < 100 && class202.field3059[var163] != null) {
                                    var164 = class243.field3638[var163];
                                }
                                class246.field3682[var6++] = var164;
                                continue;
                            }
                            if (var517 == 5005) {
                                class246.field3682[var6++] = class190.field2920;
                                continue;
                            }
                            if (var517 == 5008) {
                                var7--;
                                String var165 = class215.field3243[var7];
                                if (var165.startsWith("::")) {
                                    class108.method680(true, var165);
                                    continue;
                                }
                                if (class256.field3893 == 0 && (class85.field1354 && !class41.field610 || class116.field1762)) {
                                    continue;
                                }
                                class107.field1677++;
                                String var166 = var165.toLowerCase();
                                byte var167 = 0;
                                byte var168 = 0;
                                if (var166.startsWith(class57.field905)) {
                                    var167 = 0;
                                    var165 = var165.substring(class57.field905.length());
                                } else if (var166.startsWith(class48.field778)) {
                                    var165 = var165.substring(class48.field778.length());
                                    var167 = 1;
                                } else if (var166.startsWith(class66.field1062)) {
                                    var165 = var165.substring(class66.field1062.length());
                                    var167 = 2;
                                } else if (var166.startsWith(class146.field2132)) {
                                    var165 = var165.substring(class146.field2132.length());
                                    var167 = 3;
                                } else if (var166.startsWith(class278.field4189)) {
                                    var165 = var165.substring(class278.field4189.length());
                                    var167 = 4;
                                } else if (var166.startsWith(class82.field1326)) {
                                    var167 = 5;
                                    var165 = var165.substring(class82.field1326.length());
                                } else if (var166.startsWith(class56.field894)) {
                                    var165 = var165.substring(class56.field894.length());
                                    var167 = 6;
                                } else if (var166.startsWith(class7.field113)) {
                                    var167 = 7;
                                    var165 = var165.substring(class7.field113.length());
                                } else if (var166.startsWith(class1.field6)) {
                                    var167 = 8;
                                    var165 = var165.substring(class1.field6.length());
                                } else if (var166.startsWith(class15.field185)) {
                                    var165 = var165.substring(class15.field185.length());
                                    var167 = 9;
                                } else if (var166.startsWith(class162.field2493)) {
                                    var165 = var165.substring(class162.field2493.length());
                                    var167 = 10;
                                } else if (var166.startsWith(class118.field1787)) {
                                    var167 = 11;
                                    var165 = var165.substring(class118.field1787.length());
                                } else if (class48.field780 != 0) {
                                    if (var166.startsWith(class92.field1459)) {
                                        var165 = var165.substring(class92.field1459.length());
                                        var167 = 0;
                                    } else if (var166.startsWith(class230.field3472)) {
                                        var167 = 1;
                                        var165 = var165.substring(class230.field3472.length());
                                    } else if (var166.startsWith(class153.field2213)) {
                                        var165 = var165.substring(class153.field2213.length());
                                        var167 = 2;
                                    } else if (var166.startsWith(class273.field4112)) {
                                        var167 = 3;
                                        var165 = var165.substring(class273.field4112.length());
                                    } else if (var166.startsWith(class264.field3990)) {
                                        var167 = 4;
                                        var165 = var165.substring(class264.field3990.length());
                                    } else if (var166.startsWith(class232.field3506)) {
                                        var165 = var165.substring(class232.field3506.length());
                                        var167 = 5;
                                    } else if (var166.startsWith(class214.field3205)) {
                                        var165 = var165.substring(class214.field3205.length());
                                        var167 = 6;
                                    } else if (var166.startsWith(class93.field1480)) {
                                        var167 = 7;
                                        var165 = var165.substring(class93.field1480.length());
                                    } else if (var166.startsWith(class283.field4235)) {
                                        var167 = 8;
                                        var165 = var165.substring(class283.field4235.length());
                                    } else if (var166.startsWith(class187.field2850)) {
                                        var167 = 9;
                                        var165 = var165.substring(class187.field2850.length());
                                    } else if (var166.startsWith(class54.field885)) {
                                        var165 = var165.substring(class54.field885.length());
                                        var167 = 10;
                                    } else if (var166.startsWith(class171.field2592)) {
                                        var167 = 11;
                                        var165 = var165.substring(class171.field2592.length());
                                    }
                                }
                                String var169 = var165.toLowerCase();
                                if (var169.startsWith(class189.field2908)) {
                                    var165 = var165.substring(class189.field2908.length());
                                    var168 = 1;
                                } else if (var169.startsWith(class293.field4621)) {
                                    var168 = 2;
                                    var165 = var165.substring(class293.field4621.length());
                                } else if (var169.startsWith(class229.field3448)) {
                                    var168 = 3;
                                    var165 = var165.substring(class229.field3448.length());
                                } else if (var169.startsWith(class225.field3363)) {
                                    var168 = 4;
                                    var165 = var165.substring(class225.field3363.length());
                                } else if (var169.startsWith(class58.field912)) {
                                    var168 = 5;
                                    var165 = var165.substring(class58.field912.length());
                                } else if (class48.field780 != 0) {
                                    if (var169.startsWith(class244.field3659)) {
                                        var168 = 1;
                                        var165 = var165.substring(class244.field3659.length());
                                    } else if (var169.startsWith(class105.field1609)) {
                                        var165 = var165.substring(class105.field1609.length());
                                        var168 = 2;
                                    } else if (var169.startsWith(class227.field3408)) {
                                        var165 = var165.substring(class227.field3408.length());
                                        var168 = 3;
                                    } else if (var169.startsWith(class150.field2167)) {
                                        var165 = var165.substring(class150.field2167.length());
                                        var168 = 4;
                                    } else if (var169.startsWith(class159.field2453)) {
                                        var168 = 5;
                                        var165 = var165.substring(class159.field2453.length());
                                    }
                                }
                                class196.field2979.method1106(178, false);
                                class196.field2979.method1568(0, (byte) 49);
                                int var170 = class196.field2979.field3748;
                                class196.field2979.method1568(var167, (byte) 49);
                                class196.field2979.method1568(var168, (byte) 49);
                                class191.method1196(class196.field2979, var165, (byte) -86);
                                class196.field2979.method1565(class196.field2979.field3748 - var170, (byte) 104);
                                continue;
                            }
                            if (var517 == 5009) {
                                var7 -= 2;
                                String var171 = class215.field3243[var7];
                                String var172 = class215.field3243[var7 + 1];
                                if (class256.field3893 != 0 || (!class85.field1354 || class41.field610) && !class116.field1762) {
                                    class278.field4190++;
                                    class196.field2979.method1106(84, false);
                                    class196.field2979.method1568(0, (byte) 49);
                                    int var173 = class196.field2979.field3748;
                                    class196.field2979.method1610(arg1 ^ 0x2F309FD1, class94.method604((byte) 64, var171));
                                    class191.method1196(class196.field2979, var172, (byte) -86);
                                    class196.field2979.method1565(class196.field2979.field3748 - var173, (byte) 104);
                                }
                                continue;
                            }
                            if (var517 == 5010) {
                                var6--;
                                int var174 = class246.field3682[var6];
                                String var175 = null;
                                if (var174 < 100) {
                                    var175 = class158.field2399[var174];
                                }
                                if (var175 == null) {
                                    var175 = "";
                                }
                                class215.field3243[var7++] = var175;
                                continue;
                            }
                            if (var517 == 5011) {
                                var6--;
                                int var176 = class246.field3682[var6];
                                String var177 = null;
                                if (var176 < 100) {
                                    var177 = class124.field1871[var176];
                                }
                                if (var177 == null) {
                                    var177 = "";
                                }
                                class215.field3243[var7++] = var177;
                                continue;
                            }
                            if (var517 == 5012) {
                                var6--;
                                int var178 = class246.field3682[var6];
                                int var179 = -1;
                                if (var178 < 100) {
                                    var179 = class72.field1171[var178];
                                }
                                class246.field3682[var6++] = var179;
                                continue;
                            }
                            if (var517 == 5015) {
                                String var180;
                                if (class165.field2537 == null || class165.field2537.field1663 == null) {
                                    var180 = class66.field1054;
                                } else {
                                    var180 = class165.field2537.method672(5);
                                }
                                class215.field3243[var7++] = var180;
                                continue;
                            }
                            if (var517 == 5016) {
                                class246.field3682[var6++] = class91.field1445;
                                continue;
                            }
                            if (var517 == 5017) {
                                class246.field3682[var6++] = class234.field3522;
                                continue;
                            }
                            if (var517 == 5050) {
                                var6--;
                                int var181 = class246.field3682[var6];
                                class215.field3243[var7++] = class53.method360((byte) -73, var181).field4289;
                                continue;
                            }
                            if (var517 == 5051) {
                                var6--;
                                int var182 = class246.field3682[var6];
                                class287 var183 = class53.method360((byte) -73, var182);
                                if (var183.field4288 == null) {
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var183.field4288.length;
                                }
                                continue;
                            }
                            if (var517 == 5052) {
                                var6 -= 2;
                                int var184 = class246.field3682[var6 + 1];
                                int var185 = class246.field3682[var6];
                                class287 var186 = class53.method360((byte) -73, var185);
                                int var187 = var186.field4288[var184];
                                class246.field3682[var6++] = var187;
                                continue;
                            }
                            if (var517 == 5053) {
                                var6--;
                                int var188 = class246.field3682[var6];
                                class287 var189 = class53.method360((byte) -73, var188);
                                if (var189.field4294 == null) {
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var189.field4294.length;
                                }
                                continue;
                            }
                            if (var517 == 5054) {
                                var6 -= 2;
                                int var190 = class246.field3682[var6 + 1];
                                int var191 = class246.field3682[var6];
                                class246.field3682[var6++] = class53.method360((byte) -73, var191).field4294[var190];
                                continue;
                            }
                            if (var517 == 5055) {
                                var6--;
                                int var192 = class246.field3682[var6];
                                class215.field3243[var7++] = class231.method1473((byte) -33, var192).method472(arg1 + 7);
                                continue;
                            }
                            if (var517 == 5056) {
                                var6--;
                                int var193 = class246.field3682[var6];
                                class70 var194 = class231.method1473((byte) -33, var193);
                                if (var194.field1111 == null) {
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var194.field1111.length;
                                }
                                continue;
                            }
                            if (var517 == 5057) {
                                var6 -= 2;
                                int var195 = class246.field3682[var6];
                                int var196 = class246.field3682[var6 + 1];
                                class246.field3682[var6++] = class231.method1473((byte) -33, var195).field1111[var196];
                                continue;
                            }
                            if (var517 == 5058) {
                                class120.field1817 = new class295();
                                var6--;
                                class120.field1817.field4671 = class246.field3682[var6];
                                class120.field1817.field4676 = class231.method1473((byte) -33, class120.field1817.field4671);
                                class120.field1817.field4674 = new int[class120.field1817.field4676.method466((byte) -66)];
                                continue;
                            }
                            if (var517 == 5059) {
                                class33.field473++;
                                class196.field2979.method1106(200, false);
                                class196.field2979.method1568(0, (byte) 49);
                                int var197 = class196.field2979.field3748;
                                class196.field2979.method1568(0, (byte) 49);
                                class196.field2979.method1605(class120.field1817.field4671, (byte) -126);
                                class120.field1817.field4676.method463(class120.field1817.field4674, class196.field2979, (byte) -124);
                                class196.field2979.method1565(class196.field2979.field3748 - var197, (byte) 104);
                                continue;
                            }
                            if (var517 == 5060) {
                                var7--;
                                String var198 = class215.field3243[var7];
                                class196.field2979.method1106(86, false);
                                class196.field2979.method1568(0, (byte) 49);
                                class202.field3048++;
                                int var199 = class196.field2979.field3748;
                                class196.field2979.method1610(arg1 ^ 0x2F309FD1, class94.method604((byte) -91, var198));
                                class196.field2979.method1605(class120.field1817.field4671, (byte) -117);
                                class120.field1817.field4676.method463(class120.field1817.field4674, class196.field2979, (byte) -124);
                                class196.field2979.method1565(class196.field2979.field3748 - var199, (byte) 104);
                                continue;
                            }
                            if (var517 == 5061) {
                                class33.field473++;
                                class196.field2979.method1106(200, false);
                                class196.field2979.method1568(0, (byte) 49);
                                int var200 = class196.field2979.field3748;
                                class196.field2979.method1568(1, (byte) 49);
                                class196.field2979.method1605(class120.field1817.field4671, (byte) 77);
                                class120.field1817.field4676.method463(class120.field1817.field4674, class196.field2979, (byte) -123);
                                class196.field2979.method1565(class196.field2979.field3748 - var200, (byte) 104);
                                continue;
                            }
                            if (var517 == 5062) {
                                var6 -= 2;
                                int var201 = class246.field3682[var6];
                                int var202 = class246.field3682[var6 + 1];
                                class246.field3682[var6++] = class53.method360((byte) -73, var201).field4287[var202];
                                continue;
                            }
                            if (var517 == 5063) {
                                var6 -= 2;
                                int var203 = class246.field3682[var6];
                                int var204 = class246.field3682[var6 + 1];
                                class246.field3682[var6++] = class53.method360((byte) -73, var203).field4299[var204];
                                continue;
                            }
                            if (var517 == 5064) {
                                var6 -= 2;
                                int var205 = class246.field3682[var6];
                                int var206 = class246.field3682[var6 + 1];
                                if (var206 == -1) {
                                    class246.field3682[var6++] = -1;
                                } else {
                                    class246.field3682[var6++] = class53.method360((byte) -73, var205).method1891(103, (char) var206);
                                }
                                continue;
                            }
                            if (var517 == 5065) {
                                var6 -= 2;
                                int var207 = class246.field3682[var6];
                                int var208 = class246.field3682[var6 + 1];
                                if (var208 == -1) {
                                    class246.field3682[var6++] = -1;
                                } else {
                                    class246.field3682[var6++] = class53.method360((byte) -73, var207).method1884(10565, (char) var208);
                                }
                                continue;
                            }
                            if (var517 == 5066) {
                                var6--;
                                int var209 = class246.field3682[var6];
                                class246.field3682[var6++] = class231.method1473((byte) -33, var209).method466((byte) -66);
                                continue;
                            }
                            if (var517 == 5067) {
                                var6 -= 2;
                                int var210 = class246.field3682[var6 + 1];
                                int var211 = class246.field3682[var6];
                                int var212 = class231.method1473((byte) -33, var211).method475(var210, arg1 ^ 0x7508);
                                class246.field3682[var6++] = var212;
                                continue;
                            }
                            if (var517 == 5068) {
                                var6 -= 2;
                                int var213 = class246.field3682[var6 + 1];
                                int var214 = class246.field3682[var6];
                                class120.field1817.field4674[var214] = var213;
                                continue;
                            }
                            if (var517 == 5069) {
                                var6 -= 2;
                                int var215 = class246.field3682[var6];
                                int var216 = class246.field3682[var6 + 1];
                                class120.field1817.field4674[var215] = var216;
                                continue;
                            }
                            if (var517 == 5070) {
                                var6 -= 3;
                                int var217 = class246.field3682[var6];
                                int var218 = class246.field3682[var6 + 1];
                                int var219 = class246.field3682[var6 + 2];
                                class70 var220 = class231.method1473((byte) -33, var217);
                                if (var220.method475(var218, 29961) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class246.field3682[var6++] = var220.method471(var219, var218, 8360);
                                continue;
                            }
                            if (var517 == 5071) {
                                var7--;
                                String var221 = class215.field3243[var7];
                                var6--;
                                boolean var222 = class246.field3682[var6] == 1;
                                client.method956(var221, var222, -19955);
                                class246.field3682[var6++] = class162.field2484;
                                continue;
                            }
                            if (var517 == 5072) {
                                if (class221.field3322 != null && class162.field2484 > class195.field2972) {
                                    class246.field3682[var6++] = class94.method598(class221.field3322[class195.field2972++], 65535);
                                    continue;
                                }
                                class246.field3682[var6++] = -1;
                                continue;
                            }
                            if (var517 == 5073) {
                                class195.field2972 = 0;
                                continue;
                            }
                        } else if (var517 < 5200) {
                            if (var517 == 5100) {
                                if (class140.field2048[86]) {
                                    class246.field3682[var6++] = 1;
                                } else {
                                    class246.field3682[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5101) {
                                if (class140.field2048[82]) {
                                    class246.field3682[var6++] = 1;
                                } else {
                                    class246.field3682[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5102) {
                                if (class140.field2048[81]) {
                                    class246.field3682[var6++] = 1;
                                } else {
                                    class246.field3682[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var517 < 5300) {
                            if (var517 == 5200) {
                                var6--;
                                class297.method1988(class246.field3682[var6], true);
                                continue;
                            }
                            if (var517 == 5201) {
                                class246.field3682[var6++] = class259.method1742(119);
                                continue;
                            }
                            if (var517 == 5202) {
                                var6--;
                                class261.method1746(class246.field3682[var6], (byte) 91);
                                continue;
                            }
                            if (var517 == 5203) {
                                var7--;
                                class84.method552(class215.field3243[var7], arg1 + 7);
                                continue;
                            }
                            if (var517 == 5204) {
                                class215.field3243[var7 - 1] = class202.method1288(class215.field3243[var7 - 1], 4);
                                continue;
                            }
                            if (var517 == 5205) {
                                var6--;
                                class286.method1880(-1, class246.field3682[var6], 1, -1);
                                continue;
                            }
                            if (var517 == 5206) {
                                var6--;
                                int var223 = class246.field3682[var6];
                                class175 var224 = class297.method1989(-101, (var223 & 0xFFFE0A2) >> 14, var223 & 0x3FFF);
                                if (var224 == null) {
                                    class246.field3682[var6++] = -1;
                                } else {
                                    class246.field3682[var6++] = var224.field2667;
                                }
                                continue;
                            }
                            if (var517 == 5207) {
                                var6--;
                                class175 var225 = class276.method1833(class246.field3682[var6], -73);
                                if (var225 != null && var225.field2679 != null) {
                                    class215.field3243[var7++] = var225.field2679;
                                    continue;
                                }
                                class215.field3243[var7++] = "";
                                continue;
                            }
                            if (var517 == 5208) {
                                class246.field3682[var6++] = class25.field305;
                                class246.field3682[var6++] = class265.field3997;
                                continue;
                            }
                            if (var517 == 5209) {
                                class246.field3682[var6++] = class3.field51 + class119.field1798;
                                class246.field3682[var6++] = class99.field1564 + class79.field1274 - class268.field4042 - 1;
                                continue;
                            }
                            if (var517 == 5210) {
                                var6--;
                                int var226 = class246.field3682[var6];
                                class175 var227 = class276.method1833(var226, -47);
                                if (var227 == null) {
                                    class246.field3682[var6++] = 0;
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = class94.method598(268422447, var227.field2675) >> 14;
                                    class246.field3682[var6++] = class94.method598(var227.field2675, 16383);
                                }
                                continue;
                            }
                            if (var517 == 5211) {
                                var6--;
                                int var228 = class246.field3682[var6];
                                class175 var229 = class276.method1833(var228, -65);
                                if (var229 == null) {
                                    class246.field3682[var6++] = 0;
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var229.field2673 - var229.field2672;
                                    class246.field3682[var6++] = var229.field2671 - var229.field2669;
                                }
                                continue;
                            }
                            if (var517 == 5212) {
                                int var230 = class191.method1202(0);
                                int var231 = 0;
                                String var232;
                                if (var230 == -1) {
                                    var232 = "";
                                } else {
                                    var232 = class293.field4610.field2750[var230];
                                    var231 = class293.field4610.method1128(arg1 + 2, var230);
                                }
                                String var233 = class265.method1761("<br>", (byte) -107, var232, " ");
                                class215.field3243[var7++] = var233;
                                class246.field3682[var6++] = var231;
                                continue;
                            }
                            if (var517 == 5213) {
                                int var234 = class153.method924(-1);
                                int var235 = 0;
                                String var236;
                                if (var234 == -1) {
                                    var236 = "";
                                } else {
                                    var236 = class293.field4610.field2750[var234];
                                    var235 = class293.field4610.method1128(arg1 ^ 0x2, var234);
                                }
                                String var237 = class265.method1761("<br>", (byte) -101, var236, " ");
                                class215.field3243[var7++] = var237;
                                class246.field3682[var6++] = var235;
                                continue;
                            }
                            if (var517 == 5214) {
                                var6--;
                                int var238 = class246.field3682[var6];
                                class175 var239 = class61.method412(0);
                                if (var239 != null) {
                                    int[] var240 = var239.method1082(arg1 ^ 0x7B, var238 & 0x3FFF, var238 >> 14 & 0x3FFF, var238 >> 28 & 0x3);
                                    if (var240 != null) {
                                        class198.method1238(var240[1], var240[2], -1);
                                    }
                                }
                                continue;
                            }
                            if (var517 == 5215) {
                                var6 -= 2;
                                int var241 = class246.field3682[var6];
                                boolean var242 = false;
                                int var243 = class246.field3682[var6 + 1];
                                class53 var244 = class213.method1361(-28115, var241 >> 14 & 0x3FFF, var241 & 0x3FFF);
                                for (class175 var245 = (class175) var244.method367(70); var245 != null; var245 = (class175) var244.method359(-91)) {
                                    if (var245.field2667 == var243) {
                                        var242 = true;
                                        break;
                                    }
                                }
                                if (var242) {
                                    class246.field3682[var6++] = 1;
                                } else {
                                    class246.field3682[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5216) {
                                var6--;
                                int var246 = class246.field3682[var6];
                                method1250(var246, 2);
                                continue;
                            }
                            if (var517 == 5217) {
                                var6--;
                                int var247 = class246.field3682[var6];
                                if (class186.method1154(-1, var247)) {
                                    class246.field3682[var6++] = 1;
                                } else {
                                    class246.field3682[var6++] = 0;
                                }
                                continue;
                            }
                            if (var517 == 5218) {
                                var6--;
                                int var248 = class246.field3682[var6];
                                class175 var249 = class276.method1833(var248, -100);
                                if (var249 == null) {
                                    class246.field3682[var6++] = -1;
                                } else {
                                    class246.field3682[var6++] = var249.field2664;
                                }
                                continue;
                            }
                            if (var517 == 5219) {
                                var7--;
                                class195.method1217(class215.field3243[var7], -91);
                                continue;
                            }
                            if (var517 == 5220) {
                                class246.field3682[var6++] = class188.field2889 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 5221) {
                                var6--;
                                int var250 = class246.field3682[var6];
                                class198.method1238(var250 >> 14 & 0x3FFF, var250 & 0x3FFF, arg1 - 2);
                                continue;
                            }
                            if (var517 == 5222) {
                                class175 var251 = class61.method412(0);
                                if (var251 == null) {
                                    class246.field3682[var6++] = -1;
                                    class246.field3682[var6++] = -1;
                                } else {
                                    int[] var252 = var251.method1085(41, class99.field1564 + class79.field1274 - class268.field4042 - 1, class3.field51 + class119.field1798);
                                    if (var252 == null) {
                                        class246.field3682[var6++] = -1;
                                        class246.field3682[var6++] = -1;
                                    } else {
                                        class246.field3682[var6++] = var252[1];
                                        class246.field3682[var6++] = var252[2];
                                    }
                                }
                                continue;
                            }
                            if (var517 == 5223) {
                                var6 -= 2;
                                int var253 = class246.field3682[var6 + 1];
                                int var254 = class246.field3682[var6];
                                class286.method1880(var253 & 0x3FFF, var254, 1, (var253 & 0xFFFE20A) >> 14);
                                continue;
                            }
                            if (var517 == 5224) {
                                var6--;
                                int var255 = class246.field3682[var6];
                                class175 var256 = class61.method412(0);
                                if (var256 == null) {
                                    class246.field3682[var6++] = -1;
                                    class246.field3682[var6++] = -1;
                                } else {
                                    int[] var257 = var256.method1082(116, var255 & 0x3FFF, var255 >> 14 & 0x3FFF, var255 >> 28 & 0x3);
                                    if (var257 == null) {
                                        class246.field3682[var6++] = -1;
                                        class246.field3682[var6++] = -1;
                                    } else {
                                        class246.field3682[var6++] = var257[1];
                                        class246.field3682[var6++] = var257[2];
                                    }
                                }
                                continue;
                            }
                            if (var517 == 5225) {
                                var6--;
                                int var258 = class246.field3682[var6];
                                class175 var259 = class61.method412(arg1 - 1);
                                if (var259 == null) {
                                    class246.field3682[var6++] = -1;
                                    class246.field3682[var6++] = -1;
                                } else {
                                    int[] var260 = var259.method1085(arg1 ^ 0xFFFFFF8F, var258 & 0x3FFF, (var258 & 0xFFFEB53) >> 14);
                                    if (var260 == null) {
                                        class246.field3682[var6++] = -1;
                                        class246.field3682[var6++] = -1;
                                    } else {
                                        class246.field3682[var6++] = var260[1];
                                        class246.field3682[var6++] = var260[2];
                                    }
                                }
                                continue;
                            }
                        } else if (var517 < 5400) {
                            if (var517 == 5300) {
                                var6 -= 2;
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            if (var517 == 5301) {
                                continue;
                            }
                            if (var517 == 5302) {
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            if (var517 == 5303) {
                                var6--;
                                class246.field3682[var6++] = 0;
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            if (var517 == 5305) {
                                byte var325 = -1;
                                class246.field3682[var6++] = var325;
                                continue;
                            }
                            if (var517 == 5306) {
                                class246.field3682[var6++] = class13.method75(0);
                                continue;
                            }
                            if (var517 == 5307) {
                                var6--;
                                int var326 = class246.field3682[var6];
                                if (var326 < 0 || var326 > 2) {
                                    var326 = 0;
                                }
                                class71.method482(-1, 3, false, var326, -1);
                                continue;
                            }
                            if (var517 == 5308) {
                                class246.field3682[var6++] = class132.field1937;
                                continue;
                            }
                            if (var517 == 5309) {
                                var6--;
                                int var327 = class246.field3682[var6];
                                if (var327 < 0 || var327 > 2) {
                                    var327 = 0;
                                }
                                class132.field1937 = var327;
                                class147.method894(class209.field3147, true);
                                continue;
                            }
                        } else if (var517 < 5500) {
                            if (var517 == 5400) {
                                var7 -= 2;
                                class261.field3962++;
                                var6--;
                                int var303 = class246.field3682[var6];
                                String var304 = class215.field3243[var7];
                                String var305 = class215.field3243[var7 + 1];
                                class196.field2979.method1106(217, false);
                                class196.field2979.method1568(class62.method419(var304, 113) + class62.method419(var305, 63) + 1, (byte) 49);
                                class196.field2979.method1589((byte) 124, var304);
                                class196.field2979.method1589((byte) 99, var305);
                                class196.field2979.method1568(var303, (byte) 49);
                                continue;
                            }
                            if (var517 == 5401) {
                                var6 -= 2;
                                class232.field3501[class246.field3682[var6]] = (short) class255.method1683(21130, class246.field3682[var6 + 1]);
                                class139.method857(arg1 ^ 0xFFFFF1CE);
                                class225.method1433(arg1 ^ 0x3A);
                                class158.method977(arg1 + 32571);
                                class62.method418((byte) -95);
                                class225.method1432((byte) 93);
                                continue;
                            }
                            if (var517 == 5405) {
                                var6 -= 2;
                                int var306 = class246.field3682[var6 + 1];
                                int var307 = class246.field3682[var6];
                                if (var307 >= 0 && var307 < 2) {
                                    class217.field3270[var307] = new int[var306 << 1][4];
                                }
                                continue;
                            }
                            if (var517 == 5406) {
                                var6 -= 7;
                                int var308 = class246.field3682[var6];
                                int var309 = class246.field3682[var6 + 1] << 1;
                                int var310 = class246.field3682[var6 + 3];
                                int var311 = class246.field3682[var6 + 2];
                                int var312 = class246.field3682[var6 + 4];
                                int var313 = class246.field3682[var6 + 5];
                                int var314 = class246.field3682[var6 + 6];
                                if (var308 >= 0 && var308 < 2 && class217.field3270[var308] != null && var309 >= 0 && class217.field3270[var308].length > var309) {
                                    class217.field3270[var308][var309] = new int[] { (class94.method598(var311, 268430207) >> 14) * 128, var310, class94.method598(var311, 16383) * 128, var314 };
                                    class217.field3270[var308][var309 + 1] = new int[] { class94.method598(16383, var312 >> 14) * 128, var313, class94.method598(var312, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var517 == 5407) {
                                var6--;
                                int var315 = class217.field3270[class246.field3682[var6]].length >> 1;
                                class246.field3682[var6++] = var315;
                                continue;
                            }
                            if (var517 == 5411) {
                                if (class210.field3152 == null) {
                                    class41.method275((byte) 87, false, class82.method543(1806444415));
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var517 == 5419) {
                                String var316 = "";
                                if (class22.field266 != null) {
                                    if (class22.field266.field1250 == null) {
                                        var316 = class256.method1691(-26492, class22.field266.field1252);
                                    } else {
                                        var316 = (String) class22.field266.field1250;
                                    }
                                }
                                class215.field3243[var7++] = var316;
                                continue;
                            }
                            if (var517 == 5420) {
                                class246.field3682[var6++] = class12.field165 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 5421) {
                                var6--;
                                boolean var317 = class246.field3682[var6] == 1;
                                var7--;
                                String var318 = class215.field3243[var7];
                                String var319 = class82.method543(1806444415) + var318;
                                if (class210.field3152 != null || var317 && class12.field165 != 3 && class12.field155.startsWith("win") && !class75.field1216) {
                                    class235.field3545 = var317;
                                    client.field2373 = var319;
                                    class273.field4111 = class209.field3147.method66(arg1 ^ 0xFFFFFF8B, var319);
                                    continue;
                                }
                                class41.method275((byte) 122, var317, var319);
                                continue;
                            }
                            if (var517 == 5422) {
                                var7 -= 2;
                                String var320 = class215.field3243[var7 + 1];
                                String var321 = class215.field3243[var7];
                                var6--;
                                int var322 = class246.field3682[var6];
                                if (var321.length() > 0) {
                                    if (class225.field3359 == null) {
                                        class225.field3359 = new String[class192.field2956[class166.field2554]];
                                    }
                                    class225.field3359[var322] = var321;
                                }
                                if (var320.length() > 0) {
                                    if (class26.field320 == null) {
                                        class26.field320 = new String[class192.field2956[class166.field2554]];
                                    }
                                    class26.field320[var322] = var320;
                                }
                                continue;
                            }
                            if (var517 == 5423) {
                                var7--;
                                System.out.println(class215.field3243[var7]);
                                continue;
                            }
                            if (var517 == 5424) {
                                var6 -= 11;
                                class275.field4148 = class246.field3682[var6];
                                class297.field4693 = class246.field3682[var6 + 1];
                                class10.field136 = class246.field3682[var6 + 2];
                                class197.field2995 = class246.field3682[var6 + 3];
                                class274.field4126 = class246.field3682[var6 + 4];
                                class175.field2680 = class246.field3682[var6 + 5];
                                class256.field3891 = class246.field3682[var6 + 6];
                                class119.field1805 = class246.field3682[var6 + 7];
                                class253.field3840 = class246.field3682[var6 + 8];
                                class18.field212 = class246.field3682[var6 + 9];
                                class3.field37 = class246.field3682[var6 + 10];
                                class295.field4675.method1960(class274.field4126, (byte) 122);
                                class295.field4675.method1960(class175.field2680, (byte) 125);
                                class295.field4675.method1960(class256.field3891, (byte) 125);
                                class295.field4675.method1960(class119.field1805, (byte) 122);
                                class295.field4675.method1960(class253.field3840, (byte) 122);
                                class141.field2060 = true;
                                continue;
                            }
                            if (var517 == 5425) {
                                class54.method369(-12212);
                                class141.field2060 = false;
                                continue;
                            }
                            if (var517 == 5426) {
                                var6--;
                                class283.field4231 = class246.field3682[var6];
                                continue;
                            }
                            if (var517 == 5427) {
                                var6 -= 2;
                                class84.field1337 = class246.field3682[var6];
                                class116.field1766 = class246.field3682[var6 + 1];
                                continue;
                            }
                            if (var517 == 5428) {
                                var6 -= 2;
                                int var323 = class246.field3682[var6 + 1];
                                int var324 = class246.field3682[var6];
                                class246.field3682[var6++] = class33.method215(1, var323, var324) ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 5600) {
                            if (var517 == 5500) {
                                var6 -= 4;
                                int var261 = class246.field3682[var6];
                                int var262 = class246.field3682[var6 + 1];
                                int var263 = class246.field3682[var6 + 3];
                                int var264 = class246.field3682[var6 + 2];
                                class186.method1158(var262, (byte) 107, (var261 & 0x3FFF) - class147.field2141, ((var261 & 0xFFFE81A) >> 14) + -class81.field1303, var263, var264, false);
                                continue;
                            }
                            if (var517 == 5501) {
                                var6 -= 4;
                                int var265 = class246.field3682[var6 + 1];
                                int var266 = class246.field3682[var6 + 3];
                                int var267 = class246.field3682[var6];
                                int var268 = class246.field3682[var6 + 2];
                                class224.method1427((var267 >> 14 & 0x3FFF) - class81.field1303, var268, (var267 & 0x3FFF) - class147.field2141, var265, (byte) -111, var266);
                                continue;
                            }
                            if (var517 == 5502) {
                                var6 -= 6;
                                int var269 = class246.field3682[var6];
                                if (var269 >= 2) {
                                    throw new RuntimeException();
                                }
                                class85.field1355 = var269;
                                int var270 = class246.field3682[var6 + 1];
                                if ((var270 + 1) >= (class217.field3270[class85.field1355].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class255.field3877 = var270;
                                class52.field841 = 0;
                                class166.field2558 = class246.field3682[var6 + 2];
                                class243.field3642 = class246.field3682[var6 + 3];
                                int var271 = class246.field3682[var6 + 4];
                                if (var271 >= 2) {
                                    throw new RuntimeException();
                                }
                                class293.field4618 = var271;
                                int var272 = class246.field3682[var6 + 5];
                                if ((var272 + 1) >= (class217.field3270[class293.field4618].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class184.field2791 = var272;
                                class253.field3837 = 3;
                                continue;
                            }
                            if (var517 == 5503) {
                                class137.method838(arg1 ^ 0xFFFFD28F);
                                continue;
                            }
                            if (var517 == 5504) {
                                var6 -= 2;
                                class100.method646(class246.field3682[var6 + 1], class246.field3682[var6], (byte) 117);
                                continue;
                            }
                            if (var517 == 5505) {
                                class246.field3682[var6++] = (int) class83.field1327;
                                continue;
                            }
                            if (var517 == 5506) {
                                class246.field3682[var6++] = (int) class84.field1336;
                                continue;
                            }
                            if (var517 == 5507) {
                                class217.method1396(101);
                                continue;
                            }
                            if (var517 == 5508) {
                                class236.method1497(17);
                                continue;
                            }
                            if (var517 == 5509) {
                                class226.method1441(88);
                                continue;
                            }
                            if (var517 == 5510) {
                                class85.method558((byte) -28);
                                continue;
                            }
                            if (var517 == 5512) {
                                class39.method233(26611);
                                continue;
                            }
                        } else if (var517 < 5700) {
                            if (var517 == 5600) {
                                var6--;
                                int var299 = class246.field3682[var6];
                                var7 -= 2;
                                String var300 = class215.field3243[var7];
                                String var301 = class215.field3243[var7 + 1];
                                if (class184.field2794 == 10 && class3.field46 == 0 && class237.field3570 == 0 && class163.field2501 == 0 && class20.field229 == 0) {
                                    method1251(var300, 6404, var299, var301);
                                }
                                continue;
                            }
                            if (var517 == 5601) {
                                class264.method1758((byte) 110);
                                continue;
                            }
                            if (var517 == 5602) {
                                if (class237.field3570 == 0) {
                                    class115.field1761 = -2;
                                }
                                continue;
                            }
                            if (var517 == 5603) {
                                var6 -= 4;
                                if (class184.field2794 == 10 && class3.field46 == 0 && class237.field3570 == 0 && class163.field2501 == 0 && class20.field229 == 0) {
                                    class1.method3(class246.field3682[var6 + 3], class246.field3682[var6 + 1], (byte) -33, class246.field3682[var6], class246.field3682[var6 + 2]);
                                }
                                continue;
                            }
                            if (var517 == 5604) {
                                var7--;
                                if (class184.field2794 == 10 && class3.field46 == 0 && class237.field3570 == 0 && class163.field2501 == 0 && class20.field229 == 0) {
                                    class214.method1372(class94.method604((byte) -87, class215.field3243[var7]), arg1 ^ 0x5D11);
                                }
                                continue;
                            }
                            if (var517 == 5605) {
                                var7 -= 3;
                                var6 -= 7;
                                if (class184.field2794 == 10 && class3.field46 == 0 && class237.field3570 == 0 && class163.field2501 == 0 && class20.field229 == 0) {
                                    class127.method798(class246.field3682[var6], class215.field3243[var7 + 2], true, class246.field3682[var6 + 6] == 1, class246.field3682[var6 + 4] == 1, class246.field3682[var6 + 2], class246.field3682[var6 + 1], class215.field3243[var7 + 1], class94.method604((byte) 35, class215.field3243[var7]), class246.field3682[var6 + 3], class246.field3682[var6 + 5] == 1);
                                }
                                continue;
                            }
                            if (var517 == 5606) {
                                if (class163.field2501 == 0) {
                                    class61.field970 = -2;
                                }
                                continue;
                            }
                            if (var517 == 5607) {
                                class246.field3682[var6++] = class115.field1761;
                                continue;
                            }
                            if (var517 == 5608) {
                                class246.field3682[var6++] = class233.field3516;
                                continue;
                            }
                            if (var517 == 5609) {
                                class246.field3682[var6++] = class61.field970;
                                continue;
                            }
                            if (var517 == 5610) {
                                for (int var302 = 0; var302 < 5; var302++) {
                                    class215.field3243[var7++] = var302 >= class211.field3168.length ? "" : class239.method1514(-8970, class211.field3168[var302]);
                                }
                                class211.field3168 = null;
                                continue;
                            }
                            if (var517 == 5611) {
                                class246.field3682[var6++] = class272.field4096;
                                continue;
                            }
                        } else if (var517 < 6100) {
                            if (var517 == 6001) {
                                var6--;
                                int var290 = class246.field3682[var6];
                                if (var290 < 1) {
                                    var290 = 1;
                                }
                                if (var290 > 4) {
                                    var290 = 4;
                                }
                                class7.field107 = var290;
                                if (class7.field107 == 1) {
                                    class249.method1639(0.9F);
                                }
                                if (class7.field107 == 2) {
                                    class249.method1639(0.8F);
                                }
                                if (class7.field107 == 3) {
                                    class249.method1639(0.7F);
                                }
                                if (class7.field107 == 4) {
                                    class249.method1639(0.6F);
                                }
                                class225.method1433(arg1 ^ 0xFFFFFF85);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6002) {
                                var6--;
                                class197.method1234(class246.field3682[var6] == 1, 8398);
                                class150.method911((byte) -112);
                                class134.method823((byte) 71);
                                class155.method940(true);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6003) {
                                var6--;
                                class63.field996 = class246.field3682[var6] == 1;
                                class155.method940(true);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6005) {
                                var6--;
                                class213.field3188 = class246.field3682[var6] == 1;
                                class134.method823((byte) 71);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6006) {
                                var6--;
                                class140.field2047 = class246.field3682[var6] == 1;
                                ((class219) class249.field3775).method1406(!class140.field2047, (byte) 16);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6007) {
                                var6--;
                                class102.field1602 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6008) {
                                var6--;
                                class32.field464 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6009) {
                                var6--;
                                class189.field2896 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6010) {
                                var6--;
                                class84.field1338 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6011) {
                                var6--;
                                int var291 = class246.field3682[var6];
                                if (var291 < 0 || var291 > 2) {
                                    var291 = 0;
                                }
                                class166.field2550 = var291;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6012) {
                                var6--;
                                class297.field4692 = class246.field3682[var6] == 1;
                                if (class7.field107 == 1) {
                                    class249.method1639(0.9F);
                                }
                                if (class7.field107 == 2) {
                                    class249.method1639(0.8F);
                                }
                                if (class7.field107 == 3) {
                                    class249.method1639(0.7F);
                                }
                                if (class7.field107 == 4) {
                                    class249.method1639(0.6F);
                                }
                                class134.method823((byte) 71);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6014) {
                                var6--;
                                class145.field2115 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6015) {
                                var6--;
                                class256.field3906 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6016) {
                                var6--;
                                int var292 = class246.field3682[var6];
                                if (var292 < 0 || var292 > 2) {
                                    var292 = 0;
                                }
                                class154.field2318 = var292;
                                continue;
                            }
                            if (var517 == 6017) {
                                var6--;
                                class107.field1657 = class246.field3682[var6] == 1;
                                class92.method586(true);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6018) {
                                var6--;
                                int var293 = class246.field3682[var6];
                                if (var293 < 0) {
                                    var293 = 0;
                                }
                                if (var293 > 127) {
                                    var293 = 127;
                                }
                                class100.field1574 = var293;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6019) {
                                var6--;
                                int var294 = class246.field3682[var6];
                                if (var294 < 0) {
                                    var294 = 0;
                                }
                                if (var294 > 255) {
                                    var294 = 255;
                                }
                                if (class284.field4248 != var294) {
                                    if (class284.field4248 == 0 && class150.field2168 != -1) {
                                        class146.method888(0, false, class143.field2090, class150.field2168, 0, var294);
                                        class254.field3869 = false;
                                    } else if (var294 == 0) {
                                        class239.method1517(113);
                                        class254.field3869 = false;
                                    } else {
                                        class242.method1528(var294, 110);
                                    }
                                    class284.field4248 = var294;
                                }
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6020) {
                                var6--;
                                int var295 = class246.field3682[var6];
                                if (var295 < 0) {
                                    var295 = 0;
                                }
                                if (var295 > 127) {
                                    var295 = 127;
                                }
                                class196.field2988 = var295;
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                continue;
                            }
                            if (var517 == 6021) {
                                var6--;
                                class71.field1125 = class246.field3682[var6] == 1;
                                class155.method940(true);
                                continue;
                            }
                            if (var517 == 6023) {
                                var6--;
                                int var296 = class246.field3682[var6];
                                if (var296 < 0) {
                                    var296 = 0;
                                }
                                if (var296 > 2) {
                                    var296 = 2;
                                }
                                boolean var297 = false;
                                if (class54.field880 < 96) {
                                    var296 = 0;
                                    var297 = true;
                                }
                                class245.method1541(var296);
                                class147.method894(class209.field3147, true);
                                class147.field2139 = false;
                                class246.field3682[var6++] = var297 ? 0 : 1;
                                continue;
                            }
                            if (var517 == 6024) {
                                var6--;
                                int var298 = class246.field3682[var6];
                                if (var298 < 0 || var298 > 2) {
                                    var298 = 0;
                                }
                                class274.field4119 = var298;
                                class147.method894(class209.field3147, true);
                                continue;
                            }
                            if (var517 == 6027) {
                                var6--;
                                continue;
                            }
                            if (var517 == 6028) {
                                var6--;
                                class4.field81 = class246.field3682[var6] != 0;
                                class147.method894(class209.field3147, true);
                                continue;
                            }
                        } else if (var517 < 6200) {
                            if (var517 == 6101) {
                                class246.field3682[var6++] = class7.field107;
                                continue;
                            }
                            if (var517 == 6102) {
                                class246.field3682[var6++] = class266.method1772(41) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6103) {
                                class246.field3682[var6++] = class63.field996 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6105) {
                                class246.field3682[var6++] = class213.field3188 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6106) {
                                class246.field3682[var6++] = class140.field2047 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6107) {
                                class246.field3682[var6++] = class102.field1602 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6108) {
                                class246.field3682[var6++] = class32.field464 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6109) {
                                class246.field3682[var6++] = class189.field2896 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6110) {
                                class246.field3682[var6++] = class84.field1338 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6111) {
                                class246.field3682[var6++] = class166.field2550;
                                continue;
                            }
                            if (var517 == 6112) {
                                class246.field3682[var6++] = class297.field4692 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6114) {
                                class246.field3682[var6++] = class145.field2115 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6115) {
                                class246.field3682[var6++] = class256.field3906 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6116) {
                                class246.field3682[var6++] = class154.field2318;
                                continue;
                            }
                            if (var517 == 6117) {
                                class246.field3682[var6++] = class107.field1657 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6118) {
                                class246.field3682[var6++] = class100.field1574;
                                continue;
                            }
                            if (var517 == 6119) {
                                class246.field3682[var6++] = class284.field4248;
                                continue;
                            }
                            if (var517 == 6120) {
                                class246.field3682[var6++] = class196.field2988;
                                continue;
                            }
                            if (var517 == 6121) {
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            if (var517 == 6123) {
                                class246.field3682[var6++] = class245.method1540();
                                continue;
                            }
                            if (var517 == 6124) {
                                class246.field3682[var6++] = class274.field4119;
                                continue;
                            }
                            if (var517 == 6126) {
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            if (var517 == 6127) {
                                class246.field3682[var6++] = class142.field2088 ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6128) {
                                class246.field3682[var6++] = class4.field81 ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 6300) {
                            if (var517 == 6200) {
                                var6 -= 2;
                                class122.field1854 = (short) class246.field3682[var6];
                                if (class122.field1854 <= 0) {
                                    class122.field1854 = 256;
                                }
                                class124.field1883 = (short) class246.field3682[var6 + 1];
                                if (class124.field1883 <= 0) {
                                    class124.field1883 = 205;
                                }
                                continue;
                            }
                            if (var517 == 6201) {
                                var6 -= 2;
                                class215.field3234 = (short) class246.field3682[var6];
                                if (class215.field3234 <= 0) {
                                    class215.field3234 = 256;
                                }
                                class283.field4240 = (short) class246.field3682[var6 + 1];
                                if (class283.field4240 <= 0) {
                                    class283.field4240 = 320;
                                }
                                continue;
                            }
                            if (var517 == 6202) {
                                var6 -= 4;
                                class277.field4185 = (short) class246.field3682[var6];
                                if (class277.field4185 <= 0) {
                                    class277.field4185 = 1;
                                }
                                class113.field1733 = (short) class246.field3682[var6 + 1];
                                if (class113.field1733 <= 0) {
                                    class113.field1733 = 32767;
                                } else if (class277.field4185 > class113.field1733) {
                                    class113.field1733 = class277.field4185;
                                }
                                class256.field3901 = (short) class246.field3682[var6 + 2];
                                if (class256.field3901 <= 0) {
                                    class256.field3901 = 1;
                                }
                                class59.field950 = (short) class246.field3682[var6 + 3];
                                if (class59.field950 <= 0) {
                                    class59.field950 = 32767;
                                } else if (class59.field950 < class256.field3901) {
                                    class59.field950 = class256.field3901;
                                }
                                continue;
                            }
                            if (var517 == 6203) {
                                class169.method1052(0, class56.field899.field4444, (byte) 126, 0, class56.field899.field4478, false);
                                class246.field3682[var6++] = class188.field2883;
                                class246.field3682[var6++] = class287.field4303;
                                continue;
                            }
                            if (var517 == 6204) {
                                class246.field3682[var6++] = class215.field3234;
                                class246.field3682[var6++] = class283.field4240;
                                continue;
                            }
                            if (var517 == 6205) {
                                class246.field3682[var6++] = class122.field1854;
                                class246.field3682[var6++] = class124.field1883;
                                continue;
                            }
                        } else if (var517 < 6400) {
                            if (var517 == 6300) {
                                class246.field3682[var6++] = (int) (class263.method1754(2) / 60000L);
                                continue;
                            }
                            if (var517 == 6301) {
                                class246.field3682[var6++] = (int) (class263.method1754(126) / 86400000L) - 11745;
                                continue;
                            }
                            if (var517 == 6302) {
                                var6 -= 3;
                                int var285 = class246.field3682[var6 + 1];
                                int var286 = class246.field3682[var6 + 2];
                                int var287 = class246.field3682[var6];
                                class282.field4214.clear();
                                class282.field4214.set(11, 12);
                                class282.field4214.set(var286, var285, var287);
                                class246.field3682[var6++] = (int) (class282.field4214.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var517 == 6303) {
                                class282.field4214.clear();
                                class282.field4214.setTime(new Date(class263.method1754(127)));
                                class246.field3682[var6++] = class282.field4214.get(1);
                                continue;
                            }
                            if (var517 == 6304) {
                                var6--;
                                int var288 = class246.field3682[var6];
                                boolean var289 = true;
                                if (var288 < 0) {
                                    var289 = (var288 + 1) % 4 == 0;
                                } else if (var288 < 1582) {
                                    var289 = var288 % 4 == 0;
                                } else if ((var288 % 4) != 0) {
                                    var289 = false;
                                } else if ((var288 % 100) != 0) {
                                    var289 = true;
                                } else if ((var288 % 400) != 0) {
                                    var289 = false;
                                }
                                class246.field3682[var6++] = var289 ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 6500) {
                            if (var517 == 6405) {
                                class246.field3682[var6++] = class33.method214(arg1) ? 1 : 0;
                                continue;
                            }
                            if (var517 == 6406) {
                                class246.field3682[var6++] = class173.method1069(59) ? 1 : 0;
                                continue;
                            }
                        } else if (var517 < 6600) {
                            if (var517 == 6500) {
                                if (class184.field2794 == 10 && class3.field46 == 0 && class237.field3570 == 0 && class163.field2501 == 0) {
                                    class246.field3682[var6++] = class100.method642((byte) -74) == -1 ? 0 : 1;
                                    continue;
                                }
                                class246.field3682[var6++] = 1;
                                continue;
                            }
                            if (var517 == 6501) {
                                class266 var273 = class2.method5((byte) 125);
                                if (var273 == null) {
                                    class246.field3682[var6++] = -1;
                                    class246.field3682[var6++] = 0;
                                    class215.field3243[var7++] = "";
                                    class246.field3682[var6++] = 0;
                                    class215.field3243[var7++] = "";
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var273.field4013;
                                    class246.field3682[var6++] = var273.field338;
                                    class215.field3243[var7++] = var273.field4009;
                                    class49 var274 = var273.method1769(arg1 ^ 0x4087);
                                    class246.field3682[var6++] = var274.field783;
                                    class215.field3243[var7++] = var274.field788;
                                    class246.field3682[var6++] = var273.field340;
                                }
                                continue;
                            }
                            if (var517 == 6502) {
                                class266 var275 = class265.method1765((byte) 77);
                                if (var275 == null) {
                                    class246.field3682[var6++] = -1;
                                    class246.field3682[var6++] = 0;
                                    class215.field3243[var7++] = "";
                                    class246.field3682[var6++] = 0;
                                    class215.field3243[var7++] = "";
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var275.field4013;
                                    class246.field3682[var6++] = var275.field338;
                                    class215.field3243[var7++] = var275.field4009;
                                    class49 var276 = var275.method1769(16518);
                                    class246.field3682[var6++] = var276.field783;
                                    class215.field3243[var7++] = var276.field788;
                                    class246.field3682[var6++] = var275.field340;
                                }
                                continue;
                            }
                            if (var517 == 6503) {
                                var6--;
                                int var277 = class246.field3682[var6];
                                if (class184.field2794 == 10 && class3.field46 == 0 && class237.field3570 == 0 && class163.field2501 == 0) {
                                    class246.field3682[var6++] = class213.method1362(var277, -2941) ? 1 : 0;
                                    continue;
                                }
                                class246.field3682[var6++] = 0;
                                continue;
                            }
                            if (var517 == 6504) {
                                var6--;
                                class145.field2125 = class246.field3682[var6];
                                class147.method894(class209.field3147, true);
                                continue;
                            }
                            if (var517 == 6505) {
                                class246.field3682[var6++] = class145.field2125;
                                continue;
                            }
                            if (var517 == 6506) {
                                var6--;
                                int var278 = class246.field3682[var6];
                                class266 var279 = class209.method1343(var278, (byte) -39);
                                if (var279 == null) {
                                    class246.field3682[var6++] = -1;
                                    class215.field3243[var7++] = "";
                                    class246.field3682[var6++] = 0;
                                    class215.field3243[var7++] = "";
                                    class246.field3682[var6++] = 0;
                                } else {
                                    class246.field3682[var6++] = var279.field338;
                                    class215.field3243[var7++] = var279.field4009;
                                    class49 var280 = var279.method1769(arg1 + 16517);
                                    class246.field3682[var6++] = var280.field783;
                                    class215.field3243[var7++] = var280.field788;
                                    class246.field3682[var6++] = var279.field340;
                                }
                                continue;
                            }
                            if (var517 == 6507) {
                                var6 -= 4;
                                int var281 = class246.field3682[var6];
                                boolean var282 = class246.field3682[var6 + 1] == 1;
                                int var283 = class246.field3682[var6 + 2];
                                boolean var284 = class246.field3682[var6 + 3] == 1;
                                class218.method1401(-9, var283, var282, var281, var284);
                                continue;
                            }
                        } else if (var517 < 6700) {
                            if (var517 == 6600) {
                                var6--;
                                class195.field2970 = class246.field3682[var6] == 1;
                                class147.method894(class209.field3147, true);
                                continue;
                            }
                            if (var517 == 6601) {
                                class246.field3682[var6++] = class195.field2970 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var517 == 4300) {
                        var6 -= 2;
                        int var328 = class246.field3682[var6];
                        int var329 = class246.field3682[var6 + 1];
                        class144 var330 = class24.method155(var329, (byte) -33);
                        if (var330.method880((byte) -4)) {
                            class215.field3243[var7++] = class267.method1783((byte) 123, var328).method495((byte) 103, var330.field2106, var329);
                        } else {
                            class246.field3682[var6++] = class267.method1783((byte) 118, var328).method484(var329, var330.field2107, 16384);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field4225 == null) {
                if (class112.field1726 != 0) {
                    class48.method321(0, "", "Clientscript error - check log for details", -123);
                }
                class275.method1822("CS2 - scr:" + var5.field1321 + " op:" + var11, (byte) -120, var516);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field4225);
                for (int var514 = class231.field3476 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class6.field94[var514].field1950.field4225);
                }
                if (var11 == 40) {
                    int var515 = var10[var8];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class112.field1726 != 0) {
                    class48.method321(0, "", "Clientscript error in: " + var5.field4225, -105);
                }
                class275.method1822("CS2 - scr:" + var5.field1321 + " op:" + var11 + var513.toString(), (byte) -105, var516);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I")
    public static final int method1248(int arg0) {
        field3030++;
        if (arg0 != 1) {
            method1249((byte) -90);
        }
        return class239.field3598;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public static void method1249(byte arg0) {
        field3027 = null;
        field3021 = null;
        int var1 = 69 % ((24 - arg0) / 33);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
    private static final void method1250(int arg0, int arg1) {
        field3029++;
        if (arg1 != 2) {
            method1253(-41, -32, 114, -101, (class114) null, (class114) null, -51, 94, -31, -5, 93L);
        }
        if (arg0 >= 0 && arg0 < class217.field3259.length) {
            class217.field3259[arg0] = !class217.field3259[arg0];
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    private static final void method1251(String arg0, int arg1, int arg2, String arg3) {
        if (arg1 != 6404) {
            return;
        }
        class66.field1054 = arg0;
        field3028++;
        class251.field3820 = arg3;
        class266.field4005 = arg2;
        if (class66.field1054.equals("") || class251.field3820.equals("")) {
            class115.field1761 = 3;
        } else if (class91.field1434 == -1) {
            class142.field2084 = 0;
            class3.field46 = 1;
            class211.field3170 = 0;
            class115.field1761 = -3;
            class248 var4 = new class248(128);
            var4.method1568(10, (byte) 49);
            var4.method1577((byte) 119, (int) (Math.random() * 9.9999999E7D));
            var4.method1610(arg1 ^ 0x2F3086D4, class94.method604((byte) 39, class66.field1054));
            var4.method1577((byte) 71, (int) (Math.random() * 9.9999999E7D));
            var4.method1589((byte) 72, class251.field3820);
            var4.method1577((byte) 99, (int) (Math.random() * 9.9999999E7D));
            var4.method1573(class90.field1426, arg1 ^ 0x1945, class129.field1925);
            class196.field2979.field3748 = 0;
            class196.field2979.method1568(24, (byte) 49);
            class196.field2979.method1568(var4.field3748 + 2, (byte) 49);
            class196.field2979.method1605(544, (byte) -118);
            class196.field2979.method1601(var4.field3723, var4.field3748, arg1 - 6388, 0);
        } else {
            class66.method452(0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public static final void method1252(int arg0) {
        field3031++;
        if (class10.field135 || class112.field1726 == 2) {
            return;
        }
        try {
            class73.method498(class152.field2200, "tbrefresh", (byte) 124);
            if (arg0 != 2) {
                method1248(-19);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIILsk;Lsk;IIIIJ)V")
    public static final void method1253(int arg0, int arg1, int arg2, int arg3, class114 arg4, class114 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class183 var12 = new class183();
        var12.field2766 = arg10;
        var12.field2765 = arg1 * 128 + 64;
        var12.field2764 = arg2 * 128 + 64;
        var12.field2777 = arg3;
        var12.field2768 = arg4;
        var12.field2774 = arg5;
        var12.field2760 = arg6;
        var12.field2758 = arg7;
        var12.field2767 = arg8;
        var12.field2763 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class33.field487[var13][arg1][arg2] == null) {
                class33.field487[var13][arg1][arg2] = new class270(var13, arg1, arg2);
            }
        }
        class33.field487[arg0][arg1][arg2].field4073 = var12;
    }
}
