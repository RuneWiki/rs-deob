import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class276 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4441 = -1;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILmk;I)V")
    public static final void method1857(int arg0, class228 arg1, int arg2) {
        int var3 = 0;
        class266.field4283 = 0;
        int var4 = 0;
        field4437++;
        int var5 = -1;
        int[] var6 = arg1.field3682;
        int var7 = -66 % ((-arg0 - 32) / 58);
        byte var8 = -1;
        int[] var9 = arg1.field3673;
        try {
            int var10 = 0;
            label4111: while (true) {
                var10++;
                if (arg2 < var10) {
                    throw new RuntimeException("slow");
                }
                var5++;
                int var539 = var6[var5];
                if (var539 < 100) {
                    if (var539 == 0) {
                        class168.field2739[var3++] = var9[var5];
                        continue;
                    }
                    if (var539 == 1) {
                        int var11 = var9[var5];
                        class168.field2739[var3++] = class195.field3160[var11];
                        continue;
                    }
                    if (var539 == 2) {
                        int var12 = var9[var5];
                        var3--;
                        class11.method55(class168.field2739[var3], true, var12);
                        continue;
                    }
                    if (var539 == 3) {
                        class215.field3551[var4++] = arg1.field3687[var5];
                        continue;
                    }
                    if (var539 == 6) {
                        var5 += var9[var5];
                        continue;
                    }
                    if (var539 == 7) {
                        var3 -= 2;
                        if (class168.field2739[var3 + 1] != class168.field2739[var3]) {
                            var5 += var9[var5];
                        }
                        continue;
                    }
                    if (var539 == 8) {
                        var3 -= 2;
                        if (class168.field2739[var3 + 1] == class168.field2739[var3]) {
                            var5 += var9[var5];
                        }
                        continue;
                    }
                    if (var539 == 9) {
                        var3 -= 2;
                        if (class168.field2739[var3] < class168.field2739[var3 + 1]) {
                            var5 += var9[var5];
                        }
                        continue;
                    }
                    if (var539 == 10) {
                        var3 -= 2;
                        if (class168.field2739[var3 + 1] < class168.field2739[var3]) {
                            var5 += var9[var5];
                        }
                        continue;
                    }
                    if (var539 == 21) {
                        if (class266.field4283 == 0) {
                            return;
                        }
                        class49 var13 = class44.field730[--class266.field4283];
                        class253.field4068 = var13.field812;
                        class293.field4695 = var13.field808;
                        arg1 = var13.field807;
                        var6 = arg1.field3682;
                        var9 = arg1.field3673;
                        var5 = var13.field816;
                        continue;
                    }
                    if (var539 == 25) {
                        int var14 = var9[var5];
                        class168.field2739[var3++] = class295.method1960(255, var14);
                        continue;
                    }
                    if (var539 == 27) {
                        int var15 = var9[var5];
                        var3--;
                        class187.method1338(class168.field2739[var3], var15, true);
                        continue;
                    }
                    if (var539 == 31) {
                        var3 -= 2;
                        if (class168.field2739[var3 + 1] >= class168.field2739[var3]) {
                            var5 += var9[var5];
                        }
                        continue;
                    }
                    if (var539 == 32) {
                        var3 -= 2;
                        if (class168.field2739[var3 + 1] <= class168.field2739[var3]) {
                            var5 += var9[var5];
                        }
                        continue;
                    }
                    if (var539 == 33) {
                        class168.field2739[var3++] = class253.field4068[var9[var5]];
                        continue;
                    }
                    int var10001;
                    if (var539 == 34) {
                        var10001 = var9[var5];
                        var3--;
                        class253.field4068[var10001] = class168.field2739[var3];
                        continue;
                    }
                    if (var539 == 35) {
                        class215.field3551[var4++] = class293.field4695[var9[var5]];
                        continue;
                    }
                    if (var539 == 36) {
                        var10001 = var9[var5];
                        var4--;
                        class293.field4695[var10001] = class215.field3551[var4];
                        continue;
                    }
                    if (var539 == 37) {
                        int var16 = var9[var5];
                        var4 -= var16;
                        String var17 = class291.method1937(class215.field3551, -125, var4, var16);
                        class215.field3551[var4++] = var17;
                        continue;
                    }
                    if (var539 == 38) {
                        var3--;
                        continue;
                    }
                    if (var539 == 39) {
                        var4--;
                        continue;
                    }
                    if (var539 == 40) {
                        int var18 = var9[var5];
                        class228 var19 = class195.method1368(var18, (byte) -95);
                        String[] var20 = new String[var19.field3685];
                        int[] var21 = new int[var19.field3678];
                        for (int var22 = 0; var22 < var19.field3676; var22++) {
                            var21[var22] = class168.field2739[var3 + var22 - var19.field3676];
                        }
                        for (int var23 = 0; var23 < var19.field3680; var23++) {
                            var20[var23] = class215.field3551[var4 + var23 - var19.field3680];
                        }
                        var4 -= var19.field3680;
                        var3 -= var19.field3676;
                        class49 var24 = new class49();
                        var24.field816 = var5;
                        var24.field812 = class253.field4068;
                        var24.field807 = arg1;
                        var24.field808 = class293.field4695;
                        if (class266.field4283 >= class44.field730.length) {
                            throw new RuntimeException();
                        }
                        var5 = -1;
                        arg1 = var19;
                        class44.field730[class266.field4283++] = var24;
                        var6 = var19.field3682;
                        class253.field4068 = var21;
                        var9 = var19.field3673;
                        class293.field4695 = var20;
                        continue;
                    }
                    if (var539 == 42) {
                        class168.field2739[var3++] = class4.field42[var9[var5]];
                        continue;
                    }
                    if (var539 == 43) {
                        int var25 = var9[var5];
                        var3--;
                        class4.field42[var25] = class168.field2739[var3];
                        class18.method92(-127, var25);
                        continue;
                    }
                    if (var539 == 44) {
                        int var26 = var9[var5] >> 16;
                        int var27 = var9[var5] & 0xFFFF;
                        var3--;
                        int var28 = class168.field2739[var3];
                        if (var28 >= 0 && var28 <= 5000) {
                            class203.field3241[var26] = var28;
                            byte var29 = -1;
                            if (var27 == 105) {
                                var29 = 0;
                            }
                            int var30 = 0;
                            while (true) {
                                if (var28 <= var30) {
                                    continue label4111;
                                }
                                class124.field1969[var26][var30] = var29;
                                var30++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var539 == 45) {
                        var3--;
                        int var31 = class168.field2739[var3];
                        int var32 = var9[var5];
                        if (var31 >= 0 && class203.field3241[var32] > var31) {
                            class168.field2739[var3++] = class124.field1969[var32][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var539 == 46) {
                        var3 -= 2;
                        int var33 = var9[var5];
                        int var34 = class168.field2739[var3];
                        if (var34 >= 0 && class203.field3241[var33] > var34) {
                            class124.field1969[var33][var34] = class168.field2739[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var539 == 47) {
                        String var35 = class228.field3671[var9[var5]];
                        if (var35 == null) {
                            var35 = "null";
                        }
                        class215.field3551[var4++] = var35;
                        continue;
                    }
                    if (var539 == 48) {
                        int var36 = var9[var5];
                        var4--;
                        class228.field3671[var36] = class215.field3551[var4];
                        class60.method412(2, var36);
                        continue;
                    }
                    if (var539 == 51) {
                        class155 var37 = arg1.field3672[var9[var5]];
                        var3--;
                        class281 var38 = (class281) var37.method1059(0, (long) class168.field2739[var3]);
                        if (var38 != null) {
                            var5 += var38.field4495;
                        }
                        continue;
                    }
                }
                boolean var39;
                if (var9[var5] == 1) {
                    var39 = true;
                } else {
                    var39 = false;
                }
                if (var539 < 300) {
                    if (var539 == 100) {
                        var3 -= 3;
                        int var40 = class168.field2739[var3];
                        int var41 = class168.field2739[var3 + 2];
                        int var42 = class168.field2739[var3 + 1];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class211 var43 = class17.method87(var40, -20055);
                        if (var43.field3352 == null) {
                            var43.field3352 = new class211[var41 + 1];
                        }
                        if (var43.field3352.length <= var41) {
                            class211[] var44 = new class211[var41 + 1];
                            for (int var45 = 0; var45 < var43.field3352.length; var45++) {
                                var44[var45] = var43.field3352[var45];
                            }
                            var43.field3352 = var44;
                        }
                        if (var41 > 0 && var43.field3352[var41 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var41 - 1));
                        }
                        class211 var46 = new class211();
                        var46.field3413 = var41;
                        var46.field3337 = true;
                        var46.field3395 = var46.field3375 = var43.field3375;
                        var46.field3385 = var42;
                        var43.field3352[var41] = var46;
                        if (var39) {
                            class52.field871 = var46;
                        } else {
                            class249.field3949 = var46;
                        }
                        class117.method834(var43, (byte) -57);
                        continue;
                    }
                    if (var539 == 101) {
                        class211 var47 = var39 ? class52.field871 : class249.field3949;
                        if (var47.field3413 == -1) {
                            if (var39) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class211 var48 = class17.method87(var47.field3375, -20055);
                        var48.field3352[var47.field3413] = null;
                        class117.method834(var48, (byte) -57);
                        continue;
                    }
                    if (var539 == 102) {
                        var3--;
                        class211 var49 = class17.method87(class168.field2739[var3], -20055);
                        var49.field3352 = null;
                        class117.method834(var49, (byte) -57);
                        continue;
                    }
                    if (var539 == 200) {
                        var3 -= 2;
                        int var50 = class168.field2739[var3];
                        int var51 = class168.field2739[var3 + 1];
                        class211 var52 = class32.method217(var50, var51, 117);
                        if (var52 != null && var51 != -1) {
                            class168.field2739[var3++] = 1;
                            if (var39) {
                                class52.field871 = var52;
                            } else {
                                class249.field3949 = var52;
                            }
                            continue;
                        }
                        class168.field2739[var3++] = 0;
                        continue;
                    }
                    if (var539 == 201) {
                        var3--;
                        int var53 = class168.field2739[var3];
                        class211 var54 = class17.method87(var53, -20055);
                        if (var54 == null) {
                            class168.field2739[var3++] = 0;
                        } else {
                            class168.field2739[var3++] = 1;
                            if (var39) {
                                class52.field871 = var54;
                            } else {
                                class249.field3949 = var54;
                            }
                        }
                        continue;
                    }
                } else if (var539 < 500) {
                    if (var539 == 403) {
                        var3 -= 2;
                        int var527 = class168.field2739[var3 + 1];
                        int var528 = class168.field2739[var3];
                        for (int var529 = 0; var529 < class167.field2723.length; var529++) {
                            if (class167.field2723[var529] == var528) {
                                class239.field3829.field4767.method1777(var527, 1075252815, var529);
                                continue label4111;
                            }
                        }
                        int var530 = 0;
                        while (true) {
                            if (var530 >= class151.field2351.length) {
                                continue label4111;
                            }
                            if (class151.field2351[var530] == var528) {
                                class239.field3829.field4767.method1777(var527, 1075252815, var530);
                                continue label4111;
                            }
                            var530++;
                        }
                    }
                    if (var539 == 404) {
                        var3 -= 2;
                        int var531 = class168.field2739[var3];
                        int var532 = class168.field2739[var3 + 1];
                        class239.field3829.field4767.method1780(var532, Integer.MIN_VALUE, var531);
                        continue;
                    }
                    if (var539 == 410) {
                        var3--;
                        boolean var533 = class168.field2739[var3] != 0;
                        class239.field3829.field4767.method1769(var533, -45);
                        continue;
                    }
                } else if (!(var539 < 1000 || var539 >= 1100) || !(var539 < 2000 || var539 >= 2100)) {
                    class211 var521;
                    if (var539 >= 2000) {
                        var3--;
                        var521 = class17.method87(class168.field2739[var3], -20055);
                        var539 -= 1000;
                    } else {
                        var521 = var39 ? class52.field871 : class249.field3949;
                    }
                    if (var539 == 1000) {
                        var3 -= 4;
                        var521.field3475 = class168.field2739[var3];
                        var521.field3451 = class168.field2739[var3 + 1];
                        int var522 = class168.field2739[var3 + 2];
                        int var523 = class168.field2739[var3 + 3];
                        if (var522 < 0) {
                            var522 = 0;
                        } else if (var522 > 5) {
                            var522 = 5;
                        }
                        if (var523 < 0) {
                            var523 = 0;
                        } else if (var523 > 5) {
                            var523 = 5;
                        }
                        var521.field3402 = (byte) var523;
                        var521.field3390 = (byte) var522;
                        class117.method834(var521, (byte) -57);
                        class228.method1547(var521, 0);
                        if (var521.field3413 == -1) {
                            class61.method417((byte) 127, var521.field3375);
                        }
                        continue;
                    }
                    if (var539 == 1001) {
                        var3 -= 4;
                        var521.field3389 = class168.field2739[var3];
                        var521.field3502 = class168.field2739[var3 + 1];
                        var521.field3384 = 0;
                        var521.field3459 = 0;
                        int var524 = class168.field2739[var3 + 3];
                        if (var524 < 0) {
                            var524 = 0;
                        } else if (var524 > 4) {
                            var524 = 4;
                        }
                        int var525 = class168.field2739[var3 + 2];
                        var521.field3349 = (byte) var524;
                        if (var525 < 0) {
                            var525 = 0;
                        } else if (var525 > 4) {
                            var525 = 4;
                        }
                        var521.field3421 = (byte) var525;
                        class117.method834(var521, (byte) -57);
                        class228.method1547(var521, 0);
                        if (var521.field3385 == 0) {
                            class56.method384(-95, var521, false);
                        }
                        continue;
                    }
                    if (var539 == 1003) {
                        var3--;
                        boolean var526 = class168.field2739[var3] == 1;
                        if (var521.field3495 != var526) {
                            var521.field3495 = var526;
                            class117.method834(var521, (byte) -57);
                        }
                        if (var521.field3413 == -1) {
                            class205.method1431(var521.field3375, (byte) -110);
                        }
                        continue;
                    }
                    if (var539 == 1004) {
                        var3 -= 2;
                        var521.field3366 = class168.field2739[var3];
                        var521.field3398 = class168.field2739[var3 + 1];
                        class117.method834(var521, (byte) -57);
                        class228.method1547(var521, 0);
                        if (var521.field3385 == 0) {
                            class56.method384(-119, var521, false);
                        }
                        continue;
                    }
                    if (var539 == 1005) {
                        var3--;
                        var521.field3327 = class168.field2739[var3] == 1;
                        continue;
                    }
                } else if (var539 >= 1100 && var539 < 1200 || var539 >= 2100 && var539 < 2200) {
                    class211 var516;
                    if (var539 >= 2000) {
                        var539 -= 1000;
                        var3--;
                        var516 = class17.method87(class168.field2739[var3], -20055);
                    } else {
                        var516 = var39 ? class52.field871 : class249.field3949;
                    }
                    if (var539 == 1100) {
                        var3 -= 2;
                        var516.field3392 = class168.field2739[var3];
                        if (var516.field3392 > var516.field3410 - var516.field3430) {
                            var516.field3392 = var516.field3410 - var516.field3430;
                        }
                        if (var516.field3392 < 0) {
                            var516.field3392 = 0;
                        }
                        var516.field3369 = class168.field2739[var3 + 1];
                        if (var516.field3414 - var516.field3394 < var516.field3369) {
                            var516.field3369 = var516.field3414 - var516.field3394;
                        }
                        if (var516.field3369 < 0) {
                            var516.field3369 = 0;
                        }
                        class117.method834(var516, (byte) -57);
                        if (var516.field3413 == -1) {
                            class6.method35(var516.field3375, (byte) 62);
                        }
                        continue;
                    }
                    if (var539 == 1101) {
                        var3--;
                        var516.field3393 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        if (var516.field3413 == -1) {
                            class26.method150((byte) -53, var516.field3375);
                        }
                        continue;
                    }
                    if (var539 == 1102) {
                        var3--;
                        var516.field3408 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1103) {
                        var3--;
                        var516.field3458 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1104) {
                        var3--;
                        var516.field3353 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1105) {
                        var3--;
                        int var517 = class168.field2739[var3];
                        if (var516.field3405 != var517) {
                            var516.field3405 = var517;
                            class117.method834(var516, (byte) -57);
                        }
                        if (var516.field3413 == -1) {
                            class148.method1032(var516.field3375, 92);
                        }
                        continue;
                    }
                    if (var539 == 1106) {
                        var3--;
                        var516.field3478 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1107) {
                        var3--;
                        var516.field3490 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1108) {
                        var516.field3501 = 1;
                        var3--;
                        var516.field3485 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        if (var516.field3413 == -1) {
                            class96.method660(var516.field3375, -16038);
                        }
                        continue;
                    }
                    if (var539 == 1109) {
                        var3 -= 6;
                        var516.field3476 = class168.field2739[var3];
                        var516.field3372 = class168.field2739[var3 + 1];
                        var516.field3343 = class168.field2739[var3 + 2];
                        var516.field3456 = class168.field2739[var3 + 3];
                        var516.field3387 = class168.field2739[var3 + 4];
                        var516.field3382 = class168.field2739[var3 + 5];
                        class117.method834(var516, (byte) -57);
                        if (var516.field3413 == -1) {
                            class115.method807(-125, var516.field3375);
                            class81.method564(10, var516.field3375);
                        }
                        continue;
                    }
                    if (var539 == 1110) {
                        var3--;
                        int var518 = class168.field2739[var3];
                        if (var516.field3427 != var518) {
                            var516.field3464 = 1;
                            var516.field3376 = 0;
                            var516.field3427 = var518;
                            var516.field3401 = 0;
                            class117.method834(var516, (byte) -57);
                        }
                        if (var516.field3413 == -1) {
                            class280.method1884(5, var516.field3375);
                        }
                        continue;
                    }
                    if (var539 == 1111) {
                        var3--;
                        var516.field3325 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1112) {
                        var4--;
                        String var519 = class215.field3551[var4];
                        if (!var519.equals(var516.field3479)) {
                            var516.field3479 = var519;
                            class117.method834(var516, (byte) -57);
                        }
                        if (var516.field3413 == -1) {
                            class71.method488(var516.field3375, false);
                        }
                        continue;
                    }
                    if (var539 == 1113) {
                        var3--;
                        var516.field3463 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1114) {
                        var3 -= 3;
                        var516.field3442 = class168.field2739[var3];
                        var516.field3425 = class168.field2739[var3 + 1];
                        var516.field3477 = class168.field2739[var3 + 2];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1115) {
                        var3--;
                        var516.field3423 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1116) {
                        var3--;
                        var516.field3400 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1117) {
                        var3--;
                        var516.field3360 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1118) {
                        var3--;
                        var516.field3452 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1119) {
                        var3--;
                        var516.field3351 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1120) {
                        var3 -= 2;
                        var516.field3410 = class168.field2739[var3];
                        var516.field3414 = class168.field2739[var3 + 1];
                        class117.method834(var516, (byte) -57);
                        if (var516.field3385 == 0) {
                            class56.method384(-126, var516, false);
                        }
                        continue;
                    }
                    if (var539 == 1121) {
                        class117.method834(var516, (byte) -57);
                        var3 -= 2;
                        continue;
                    }
                    if (var539 == 1122) {
                        var3--;
                        var516.field3488 = class168.field2739[var3] == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                    if (var539 == 1123) {
                        var3--;
                        var516.field3382 = class168.field2739[var3];
                        class117.method834(var516, (byte) -57);
                        if (var516.field3413 == -1) {
                            class115.method807(-116, var516.field3375);
                        }
                        continue;
                    }
                    if (var539 == 1124) {
                        var3--;
                        int var520 = class168.field2739[var3];
                        var516.field3335 = var520 == 1;
                        class117.method834(var516, (byte) -57);
                        continue;
                    }
                } else if (!(var539 < 1200 || var539 >= 1300) || !(var539 < 2200 || var539 >= 2300)) {
                    class211 var55;
                    if (var539 >= 2000) {
                        var539 -= 1000;
                        var3--;
                        var55 = class17.method87(class168.field2739[var3], -20055);
                    } else {
                        var55 = var39 ? class52.field871 : class249.field3949;
                    }
                    class117.method834(var55, (byte) -57);
                    if (var539 == 1200 || var539 == 1205 || var539 == 1208 || var539 == 1209) {
                        var3 -= 2;
                        int var56 = class168.field2739[var3 + 1];
                        int var57 = class168.field2739[var3];
                        if (var55.field3413 == -1) {
                            class206.method1440(var55.field3375, (byte) 125);
                            class115.method807(-103, var55.field3375);
                            class81.method564(10, var55.field3375);
                        }
                        if (var57 == -1) {
                            var55.field3501 = 1;
                            var55.field3485 = -1;
                            var55.field3441 = -1;
                            continue;
                        }
                        var55.field3496 = var56;
                        var55.field3441 = var57;
                        if (var539 == 1208 || var539 == 1209) {
                            var55.field3341 = true;
                        } else {
                            var55.field3341 = false;
                        }
                        class115 var58 = class81.method562(var57, -20358);
                        var55.field3382 = var58.field1830;
                        var55.field3456 = var58.field1852;
                        if (var55.field3384 > 0) {
                            var55.field3382 = var55.field3382 * 32 / var55.field3384;
                        } else if (var55.field3389 > 0) {
                            var55.field3382 = var55.field3382 * 32 / var55.field3389;
                        }
                        var55.field3387 = var58.field1825;
                        var55.field3372 = var58.field1783;
                        var55.field3343 = var58.field1779;
                        var55.field3476 = var58.field1834;
                        if (var539 == 1205) {
                            var55.field3333 = false;
                        } else {
                            var55.field3333 = true;
                        }
                        continue;
                    }
                    if (var539 == 1201) {
                        var55.field3501 = 2;
                        var3--;
                        var55.field3485 = class168.field2739[var3];
                        if (var55.field3413 == -1) {
                            class96.method660(var55.field3375, -16038);
                        }
                        continue;
                    }
                    if (var539 == 1202) {
                        var55.field3501 = 3;
                        var55.field3485 = class239.field3829.field4767.method1772((byte) -108);
                        if (var55.field3413 == -1) {
                            class96.method660(var55.field3375, -16038);
                        }
                        continue;
                    }
                    if (var539 == 1203) {
                        var55.field3501 = 6;
                        var3--;
                        var55.field3485 = class168.field2739[var3];
                        if (var55.field3413 == -1) {
                            class96.method660(var55.field3375, -16038);
                        }
                        continue;
                    }
                    if (var539 == 1204) {
                        var55.field3501 = 5;
                        var3--;
                        var55.field3485 = class168.field2739[var3];
                        if (var55.field3413 == -1) {
                            class96.method660(var55.field3375, -16038);
                        }
                        continue;
                    }
                    if (var539 == 1206) {
                        var3 -= 4;
                        var55.field3470 = class168.field2739[var3];
                        var55.field3480 = class168.field2739[var3 + 1];
                        var55.field3492 = class168.field2739[var3 + 2];
                        var55.field3346 = class168.field2739[var3 + 3];
                        class117.method834(var55, (byte) -57);
                        continue;
                    }
                    if (var539 == 1207) {
                        var3 -= 2;
                        var55.field3357 = class168.field2739[var3];
                        var55.field3324 = class168.field2739[var3 + 1];
                        class117.method834(var55, (byte) -57);
                        continue;
                    }
                    if (var539 == 1211) {
                        var55.field3485 = 2047;
                        var55.field3364 = 0;
                        var55.field3501 = 5;
                        if (var55.field3413 == -1) {
                            class96.method660(var55.field3375, -16038);
                        }
                        continue;
                    }
                } else if ((var539 < 1300 || var539 >= 1400) && (var539 < 2300 || var539 >= 2400)) {
                    if (var539 >= 1400 && var539 < 1500 || var539 >= 2400 && var539 < 2500) {
                        class211 var65;
                        if (var539 >= 2000) {
                            var3--;
                            var65 = class17.method87(class168.field2739[var3], -20055);
                            var539 -= 1000;
                        } else {
                            var65 = var39 ? class52.field871 : class249.field3949;
                        }
                        var4--;
                        String var66 = class215.field3551[var4];
                        int[] var67 = null;
                        if (var66.length() > 0 && var66.charAt(var66.length() - 1) == 'Y') {
                            var3--;
                            int var68 = class168.field2739[var3];
                            if (var68 > 0) {
                                var67 = new int[var68];
                                while ((var68--) > 0) {
                                    var3--;
                                    var67[var68] = class168.field2739[var3];
                                }
                            }
                            var66 = var66.substring(0, var66.length() - 1);
                        }
                        Object[] var69 = new Object[var66.length() + 1];
                        for (int var70 = var69.length - 1; var70 >= 1; var70--) {
                            if (var66.charAt(var70 - 1) == 's') {
                                var4--;
                                var69[var70] = class215.field3551[var4];
                            } else {
                                var3--;
                                var69[var70] = Integer.valueOf(class168.field2739[var3]);
                            }
                        }
                        var3--;
                        int var71 = class168.field2739[var3];
                        if (var71 == -1) {
                            var69 = null;
                        } else {
                            var69[0] = Integer.valueOf(var71);
                        }
                        if (var539 == 1400) {
                            var65.field3412 = var69;
                        } else if (var539 == 1401) {
                            var65.field3445 = var69;
                        } else if (var539 == 1402) {
                            var65.field3434 = var69;
                        } else if (var539 == 1403) {
                            var65.field3338 = var69;
                        } else if (var539 == 1404) {
                            var65.field3465 = var69;
                        } else if (var539 == 1405) {
                            var65.field3370 = var69;
                        } else if (var539 == 1406) {
                            var65.field3411 = var69;
                        } else if (var539 == 1407) {
                            var65.field3334 = var69;
                            var65.field3417 = var67;
                        } else if (var539 == 1408) {
                            var65.field3449 = var69;
                        } else if (var539 == 1409) {
                            var65.field3377 = var69;
                        } else if (var539 == 1410) {
                            var65.field3455 = var69;
                        } else if (var539 == 1411) {
                            var65.field3472 = var69;
                        } else if (var539 == 1412) {
                            var65.field3359 = var69;
                        } else if (var539 == 1414) {
                            var65.field3403 = var67;
                            var65.field3358 = var69;
                        } else if (var539 == 1415) {
                            var65.field3440 = var67;
                            var65.field3494 = var69;
                        } else if (var539 == 1416) {
                            var65.field3487 = var69;
                        } else if (var539 == 1417) {
                            var65.field3486 = var69;
                        } else if (var539 == 1418) {
                            var65.field3424 = var69;
                        } else if (var539 == 1419) {
                            var65.field3331 = var69;
                        } else if (var539 == 1420) {
                            var65.field3379 = var69;
                        } else if (var539 == 1421) {
                            var65.field3448 = var69;
                        } else if (var539 == 1422) {
                            var65.field3339 = var69;
                        } else if (var539 == 1423) {
                            var65.field3484 = var69;
                        } else if (var539 == 1424) {
                            var65.field3481 = var69;
                        } else if (var539 == 1425) {
                            var65.field3380 = var69;
                        } else if (var539 == 1426) {
                            var65.field3447 = var69;
                        } else if (var539 == 1427) {
                            var65.field3466 = var69;
                        } else if (var539 == 1428) {
                            var65.field3461 = var69;
                            var65.field3397 = var67;
                        } else if (var539 == 1429) {
                            var65.field3450 = var67;
                            var65.field3497 = var69;
                        }
                        var65.field3329 = true;
                        continue;
                    }
                    if (var539 < 1600) {
                        class211 var72 = var39 ? class52.field871 : class249.field3949;
                        if (var539 == 1500) {
                            class168.field2739[var3++] = var72.field3453;
                            continue;
                        }
                        if (var539 == 1501) {
                            class168.field2739[var3++] = var72.field3416;
                            continue;
                        }
                        if (var539 == 1502) {
                            class168.field2739[var3++] = var72.field3430;
                            continue;
                        }
                        if (var539 == 1503) {
                            class168.field2739[var3++] = var72.field3394;
                            continue;
                        }
                        if (var539 == 1504) {
                            class168.field2739[var3++] = var72.field3495 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 1505) {
                            class168.field2739[var3++] = var72.field3395;
                            continue;
                        }
                    } else if (var539 < 1700) {
                        class211 var515 = var39 ? class52.field871 : class249.field3949;
                        if (var539 == 1600) {
                            class168.field2739[var3++] = var515.field3392;
                            continue;
                        }
                        if (var539 == 1601) {
                            class168.field2739[var3++] = var515.field3369;
                            continue;
                        }
                        if (var539 == 1602) {
                            class215.field3551[var4++] = var515.field3479;
                            continue;
                        }
                        if (var539 == 1603) {
                            class168.field2739[var3++] = var515.field3410;
                            continue;
                        }
                        if (var539 == 1604) {
                            class168.field2739[var3++] = var515.field3414;
                            continue;
                        }
                        if (var539 == 1605) {
                            class168.field2739[var3++] = var515.field3382;
                            continue;
                        }
                        if (var539 == 1606) {
                            class168.field2739[var3++] = var515.field3343;
                            continue;
                        }
                        if (var539 == 1607) {
                            class168.field2739[var3++] = var515.field3387;
                            continue;
                        }
                        if (var539 == 1608) {
                            class168.field2739[var3++] = var515.field3456;
                            continue;
                        }
                        if (var539 == 1609) {
                            class168.field2739[var3++] = var515.field3458;
                            continue;
                        }
                        if (var539 == 1610) {
                            class168.field2739[var3++] = var515.field3476;
                            continue;
                        }
                        if (var539 == 1611) {
                            class168.field2739[var3++] = var515.field3372;
                            continue;
                        }
                        if (var539 == 1612) {
                            class168.field2739[var3++] = var515.field3405;
                            continue;
                        }
                    } else if (var539 < 1800) {
                        class211 var514 = var39 ? class52.field871 : class249.field3949;
                        if (var539 == 1700) {
                            class168.field2739[var3++] = var514.field3441;
                            continue;
                        }
                        if (var539 == 1701) {
                            if (var514.field3441 == -1) {
                                class168.field2739[var3++] = 0;
                            } else {
                                class168.field2739[var3++] = var514.field3496;
                            }
                            continue;
                        }
                        if (var539 == 1702) {
                            class168.field2739[var3++] = var514.field3413;
                            continue;
                        }
                    } else if (var539 < 1900) {
                        class211 var512 = var39 ? class52.field871 : class249.field3949;
                        if (var539 == 1800) {
                            class168.field2739[var3++] = client.method2015(var512).method1529(116);
                            continue;
                        }
                        if (var539 == 1801) {
                            var3--;
                            int var513 = class168.field2739[var3];
                            int var541 = var513 - 1;
                            if (var512.field3368 != null && var541 < var512.field3368.length && var512.field3368[var541] != null) {
                                class215.field3551[var4++] = var512.field3368[var541];
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 1802) {
                            if (var512.field3399 == null) {
                                class215.field3551[var4++] = "";
                            } else {
                                class215.field3551[var4++] = var512.field3399;
                            }
                            continue;
                        }
                    } else if (var539 < 2600) {
                        var3--;
                        class211 var511 = class17.method87(class168.field2739[var3], -20055);
                        if (var539 == 2500) {
                            class168.field2739[var3++] = var511.field3453;
                            continue;
                        }
                        if (var539 == 2501) {
                            class168.field2739[var3++] = var511.field3416;
                            continue;
                        }
                        if (var539 == 2502) {
                            class168.field2739[var3++] = var511.field3430;
                            continue;
                        }
                        if (var539 == 2503) {
                            class168.field2739[var3++] = var511.field3394;
                            continue;
                        }
                        if (var539 == 2504) {
                            class168.field2739[var3++] = var511.field3495 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 2505) {
                            class168.field2739[var3++] = var511.field3395;
                            continue;
                        }
                    } else if (var539 < 2700) {
                        var3--;
                        class211 var73 = class17.method87(class168.field2739[var3], -20055);
                        if (var539 == 2600) {
                            class168.field2739[var3++] = var73.field3392;
                            continue;
                        }
                        if (var539 == 2601) {
                            class168.field2739[var3++] = var73.field3369;
                            continue;
                        }
                        if (var539 == 2602) {
                            class215.field3551[var4++] = var73.field3479;
                            continue;
                        }
                        if (var539 == 2603) {
                            class168.field2739[var3++] = var73.field3410;
                            continue;
                        }
                        if (var539 == 2604) {
                            class168.field2739[var3++] = var73.field3414;
                            continue;
                        }
                        if (var539 == 2605) {
                            class168.field2739[var3++] = var73.field3382;
                            continue;
                        }
                        if (var539 == 2606) {
                            class168.field2739[var3++] = var73.field3343;
                            continue;
                        }
                        if (var539 == 2607) {
                            class168.field2739[var3++] = var73.field3387;
                            continue;
                        }
                        if (var539 == 2608) {
                            class168.field2739[var3++] = var73.field3456;
                            continue;
                        }
                        if (var539 == 2609) {
                            class168.field2739[var3++] = var73.field3458;
                            continue;
                        }
                        if (var539 == 2610) {
                            class168.field2739[var3++] = var73.field3476;
                            continue;
                        }
                        if (var539 == 2611) {
                            class168.field2739[var3++] = var73.field3372;
                            continue;
                        }
                        if (var539 == 2612) {
                            class168.field2739[var3++] = var73.field3405;
                            continue;
                        }
                    } else if (var539 < 2800) {
                        if (var539 == 2700) {
                            var3--;
                            class211 var501 = class17.method87(class168.field2739[var3], -20055);
                            class168.field2739[var3++] = var501.field3441;
                            continue;
                        }
                        if (var539 == 2701) {
                            var3--;
                            class211 var502 = class17.method87(class168.field2739[var3], -20055);
                            if (var502.field3441 == -1) {
                                class168.field2739[var3++] = 0;
                            } else {
                                class168.field2739[var3++] = var502.field3496;
                            }
                            continue;
                        }
                        if (var539 == 2702) {
                            var3--;
                            int var503 = class168.field2739[var3];
                            class97 var504 = (class97) class244.field3880.method1059(0, (long) var503);
                            if (var504 == null) {
                                class168.field2739[var3++] = 0;
                            } else {
                                class168.field2739[var3++] = 1;
                            }
                            continue;
                        }
                        if (var539 == 2703) {
                            var3--;
                            class211 var505 = class17.method87(class168.field2739[var3], -20055);
                            if (var505.field3352 == null) {
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            int var506 = var505.field3352.length;
                            for (int var507 = 0; var507 < var505.field3352.length; var507++) {
                                if (var505.field3352[var507] == null) {
                                    var506 = var507;
                                    break;
                                }
                            }
                            class168.field2739[var3++] = var506;
                            continue;
                        }
                        if (var539 == 2704 || var539 == 2705) {
                            var3 -= 2;
                            int var508 = class168.field2739[var3];
                            int var509 = class168.field2739[var3 + 1];
                            class97 var510 = (class97) class244.field3880.method1059(0, (long) var508);
                            if (var510 != null && var510.field1556 == var509) {
                                class168.field2739[var3++] = 1;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                    } else if (var539 < 2900) {
                        var3--;
                        class211 var499 = class17.method87(class168.field2739[var3], -20055);
                        if (var539 == 2800) {
                            class168.field2739[var3++] = client.method2015(var499).method1529(121);
                            continue;
                        }
                        if (var539 == 2801) {
                            var3--;
                            int var500 = class168.field2739[var3];
                            int var540 = var500 - 1;
                            if (var499.field3368 != null && var540 < var499.field3368.length && var499.field3368[var540] != null) {
                                class215.field3551[var4++] = var499.field3368[var540];
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 2802) {
                            if (var499.field3399 == null) {
                                class215.field3551[var4++] = "";
                            } else {
                                class215.field3551[var4++] = var499.field3399;
                            }
                            continue;
                        }
                    } else if (var539 < 3200) {
                        if (var539 == 3100) {
                            var4--;
                            String var74 = class215.field3551[var4];
                            class99.method673(true, var74);
                            continue;
                        }
                        if (var539 == 3101) {
                            var3 -= 2;
                            class293.method1948(1875869548, class239.field3829, class168.field2739[var3 + 1], class168.field2739[var3]);
                            continue;
                        }
                        if (var539 == 3103) {
                            class214.method1490(26579);
                            continue;
                        }
                        if (var539 == 3104) {
                            class73.field1232++;
                            var4--;
                            String var75 = class215.field3551[var4];
                            int var76 = 0;
                            if (class263.method1764(var75, false)) {
                                var76 = class277.method1868(var75, true);
                            }
                            class314.field5061.method828(127, 86);
                            class314.field5061.method1125(var76, 255);
                            continue;
                        }
                        if (var539 == 3105) {
                            class187.field3039++;
                            var4--;
                            String var77 = class215.field3551[var4];
                            class314.field5061.method828(113, 123);
                            class314.field5061.method1108(var77.length() + 1, true);
                            class314.field5061.method1148((byte) -99, var77);
                            continue;
                        }
                        if (var539 == 3106) {
                            class41.field604++;
                            var4--;
                            String var78 = class215.field3551[var4];
                            class314.field5061.method828(120, 107);
                            class314.field5061.method1108(var78.length() + 1, true);
                            class314.field5061.method1148((byte) -99, var78);
                            continue;
                        }
                        if (var539 == 3107) {
                            var3--;
                            int var79 = class168.field2739[var3];
                            var4--;
                            String var80 = class215.field3551[var4];
                            class269.method1809(var80, var79, -127);
                            continue;
                        }
                        if (var539 == 3108) {
                            var3 -= 3;
                            int var81 = class168.field2739[var3];
                            int var82 = class168.field2739[var3 + 2];
                            int var83 = class168.field2739[var3 + 1];
                            class211 var84 = class17.method87(var82, -20055);
                            class196.method1378(var84, -9347, var83, var81);
                            continue;
                        }
                        if (var539 == 3109) {
                            var3 -= 2;
                            int var85 = class168.field2739[var3 + 1];
                            int var86 = class168.field2739[var3];
                            class211 var87 = var39 ? class52.field871 : class249.field3949;
                            class196.method1378(var87, -9347, var85, var86);
                            continue;
                        }
                        if (var539 == 3110) {
                            class63.field1052++;
                            var3--;
                            int var88 = class168.field2739[var3];
                            class314.field5061.method828(110, 191);
                            class314.field5061.method1120(var88, true);
                            continue;
                        }
                    } else if (var539 < 3300) {
                        if (var539 == 3200) {
                            var3 -= 3;
                            class272.method1818(109, class168.field2739[var3 + 2], 255, class168.field2739[var3], class168.field2739[var3 + 1]);
                            continue;
                        }
                        if (var539 == 3201) {
                            var3--;
                            class11.method57(-90, 255, class168.field2739[var3]);
                            continue;
                        }
                        if (var539 == 3202) {
                            var3 -= 2;
                            class236.method1602(class168.field2739[var3], 255, -2, class168.field2739[var3 + 1]);
                            continue;
                        }
                    } else if (var539 < 3400) {
                        if (var539 == 3300) {
                            class168.field2739[var3++] = class29.field360;
                            continue;
                        }
                        if (var539 == 3301) {
                            var3 -= 2;
                            int var89 = class168.field2739[var3];
                            int var90 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class39.method244(var90, 1, var89);
                            continue;
                        }
                        if (var539 == 3302) {
                            var3 -= 2;
                            int var91 = class168.field2739[var3];
                            int var92 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class92.method616(var91, var92, (byte) 109);
                            continue;
                        }
                        if (var539 == 3303) {
                            var3 -= 2;
                            int var93 = class168.field2739[var3];
                            int var94 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class72.method491(121, var93, var94);
                            continue;
                        }
                        if (var539 == 3304) {
                            var3--;
                            int var95 = class168.field2739[var3];
                            class168.field2739[var3++] = class82.method568(var95, 5).field238;
                            continue;
                        }
                        if (var539 == 3305) {
                            var3--;
                            int var96 = class168.field2739[var3];
                            class168.field2739[var3++] = class228.field3670[var96];
                            continue;
                        }
                        if (var539 == 3306) {
                            var3--;
                            int var97 = class168.field2739[var3];
                            class168.field2739[var3++] = class230.field3729[var97];
                            continue;
                        }
                        if (var539 == 3307) {
                            var3--;
                            int var98 = class168.field2739[var3];
                            class168.field2739[var3++] = class88.field1442[var98];
                            continue;
                        }
                        if (var539 == 3308) {
                            int var99 = class56.field941;
                            int var100 = (class239.field3829.field637 >> 7) + field4438;
                            int var101 = (class239.field3829.field710 >> 7) + class108.field1732;
                            class168.field2739[var3++] = (var99 << 28) + (var100 << 14) + var101;
                            continue;
                        }
                        if (var539 == 3309) {
                            var3--;
                            int var102 = class168.field2739[var3];
                            class168.field2739[var3++] = class51.method359(var102, 268419986) >> 14;
                            continue;
                        }
                        if (var539 == 3310) {
                            var3--;
                            int var103 = class168.field2739[var3];
                            class168.field2739[var3++] = var103 >> 28;
                            continue;
                        }
                        if (var539 == 3311) {
                            var3--;
                            int var104 = class168.field2739[var3];
                            class168.field2739[var3++] = class51.method359(var104, 16383);
                            continue;
                        }
                        if (var539 == 3312) {
                            class168.field2739[var3++] = class249.field3950 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3313) {
                            var3 -= 2;
                            int var105 = class168.field2739[var3 + 1];
                            int var106 = class168.field2739[var3] + 32768;
                            class168.field2739[var3++] = class39.method244(var105, 1, var106);
                            continue;
                        }
                        if (var539 == 3314) {
                            var3 -= 2;
                            int var107 = class168.field2739[var3] + 32768;
                            int var108 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class92.method616(var107, var108, (byte) 74);
                            continue;
                        }
                        if (var539 == 3315) {
                            var3 -= 2;
                            int var109 = class168.field2739[var3 + 1];
                            int var110 = class168.field2739[var3] + 32768;
                            class168.field2739[var3++] = class72.method491(116, var110, var109);
                            continue;
                        }
                        if (var539 == 3316) {
                            if (class298.field4765 >= 2) {
                                class168.field2739[var3++] = class298.field4765;
                            } else {
                                class168.field2739[var3++] = 0;
                            }
                            continue;
                        }
                        if (var539 == 3317) {
                            class168.field2739[var3++] = class255.field4127;
                            continue;
                        }
                        if (var539 == 3318) {
                            class168.field2739[var3++] = class60.field979;
                            continue;
                        }
                        if (var539 == 3321) {
                            class168.field2739[var3++] = class107.field1692;
                            continue;
                        }
                        if (var539 == 3322) {
                            class168.field2739[var3++] = class308.field4930;
                            continue;
                        }
                        if (var539 == 3323) {
                            if (class136.field2158 >= 5 && class136.field2158 <= 9) {
                                class168.field2739[var3++] = 1;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3324) {
                            if (class136.field2158 >= 5 && class136.field2158 <= 9) {
                                class168.field2739[var3++] = class136.field2158;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3325) {
                            class168.field2739[var3++] = class133.field2104 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3326) {
                            class168.field2739[var3++] = class239.field3829.field4790;
                            continue;
                        }
                        if (var539 == 3327) {
                            class168.field2739[var3++] = class239.field3829.field4767.field4241 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3328) {
                            class168.field2739[var3++] = class96.field1542 && !class69.field1139 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3329) {
                            class168.field2739[var3++] = class83.field1385 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3330) {
                            var3--;
                            int var111 = class168.field2739[var3];
                            class168.field2739[var3++] = class239.method1615(var111, 25524);
                            continue;
                        }
                        if (var539 == 3331) {
                            var3 -= 2;
                            int var112 = class168.field2739[var3 + 1];
                            int var113 = class168.field2739[var3];
                            class168.field2739[var3++] = class273.method1826(false, var112, (byte) -64, var113);
                            continue;
                        }
                        if (var539 == 3332) {
                            var3 -= 2;
                            int var114 = class168.field2739[var3 + 1];
                            int var115 = class168.field2739[var3];
                            class168.field2739[var3++] = class273.method1826(true, var114, (byte) 121, var115);
                            continue;
                        }
                        if (var539 == 3333) {
                            class168.field2739[var3++] = class60.field984;
                            continue;
                        }
                        if (var539 == 3335) {
                            class168.field2739[var3++] = class2.field28;
                            continue;
                        }
                        if (var539 == 3336) {
                            var3 -= 4;
                            int var116 = class168.field2739[var3 + 1];
                            int var117 = class168.field2739[var3];
                            int var118 = (var116 << 14) + var117;
                            int var119 = class168.field2739[var3 + 3];
                            int var120 = class168.field2739[var3 + 2];
                            int var121 = (var120 << 28) + var118;
                            int var122 = var119 + var121;
                            class168.field2739[var3++] = var122;
                            continue;
                        }
                        if (var539 == 3337) {
                            class168.field2739[var3++] = class1.field17;
                            continue;
                        }
                    } else if (var539 < 3500) {
                        if (var539 == 3400) {
                            var3 -= 2;
                            int var482 = class168.field2739[var3];
                            int var483 = class168.field2739[var3 + 1];
                            class234 var484 = class309.method2065(var482, 27029);
                            class215.field3551[var4++] = var484.method1585(true, var483);
                            continue;
                        }
                        if (var539 == 3408) {
                            var3 -= 4;
                            int var485 = class168.field2739[var3];
                            int var486 = class168.field2739[var3 + 3];
                            int var487 = class168.field2739[var3 + 2];
                            int var488 = class168.field2739[var3 + 1];
                            class234 var489 = class309.method2065(var487, 27029);
                            if (var489.field3753 == var485 && var489.field3756 == var488) {
                                if (var488 == 115) {
                                    class215.field3551[var4++] = var489.method1585(true, var486);
                                } else {
                                    class168.field2739[var3++] = var489.method1584((byte) -27, var486);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var539 == 3409) {
                            var3 -= 3;
                            int var490 = class168.field2739[var3];
                            int var491 = class168.field2739[var3 + 2];
                            int var492 = class168.field2739[var3 + 1];
                            if (var492 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class234 var493 = class309.method2065(var492, 27029);
                            if (var493.field3756 != var490) {
                                throw new RuntimeException("C3409-1");
                            }
                            class168.field2739[var3++] = var493.method1578(var491, 35) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3410) {
                            var4--;
                            String var494 = class215.field3551[var4];
                            var3--;
                            int var495 = class168.field2739[var3];
                            if (var495 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class234 var496 = class309.method2065(var495, 27029);
                            if (var496.field3756 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class168.field2739[var3++] = var496.method1590(var494, (byte) 57) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3411) {
                            var3--;
                            int var497 = class168.field2739[var3];
                            class234 var498 = class309.method2065(var497, 27029);
                            class168.field2739[var3++] = var498.field3755.method1051(3553);
                            continue;
                        }
                    } else if (var539 < 3700) {
                        if (var539 == 3600) {
                            if (class261.field4196 == 0) {
                                class168.field2739[var3++] = -2;
                            } else if (class261.field4196 == 1) {
                                class168.field2739[var3++] = -1;
                            } else {
                                class168.field2739[var3++] = class124.field1968;
                            }
                            continue;
                        }
                        if (var539 == 3601) {
                            var3--;
                            int var456 = class168.field2739[var3];
                            if (class261.field4196 == 2 && var456 < class124.field1968) {
                                class215.field3551[var4++] = class258.field4165[var456];
                                if (class308.field4931[var456] == null) {
                                    class215.field3551[var4++] = "";
                                } else {
                                    class215.field3551[var4++] = class308.field4931[var456];
                                }
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 3602) {
                            var3--;
                            int var457 = class168.field2739[var3];
                            if (class261.field4196 == 2 && var457 < class124.field1968) {
                                class168.field2739[var3++] = class279.field4478[var457];
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3603) {
                            var3--;
                            int var458 = class168.field2739[var3];
                            if (class261.field4196 == 2 && var458 < class124.field1968) {
                                class168.field2739[var3++] = class236.field3797[var458];
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3604) {
                            var4--;
                            String var459 = class215.field3551[var4];
                            var3--;
                            int var460 = class168.field2739[var3];
                            class65.method455(var460, var459, true);
                            continue;
                        }
                        if (var539 == 3605) {
                            var4--;
                            String var461 = class215.field3551[var4];
                            class304.method2033(var461, (byte) -89);
                            continue;
                        }
                        if (var539 == 3606) {
                            var4--;
                            String var462 = class215.field3551[var4];
                            class203.method1423(1, var462);
                            continue;
                        }
                        if (var539 == 3607) {
                            var4--;
                            String var463 = class215.field3551[var4];
                            class218.method1505(var463, false, -214593270);
                            continue;
                        }
                        if (var539 == 3608) {
                            var4--;
                            String var464 = class215.field3551[var4];
                            class274.method1836(var464, 15023);
                            continue;
                        }
                        if (var539 == 3609) {
                            var4--;
                            String var465 = class215.field3551[var4];
                            if (var465.startsWith("<img=0>") || var465.startsWith("<img=1>")) {
                                var465 = var465.substring(7);
                            }
                            class168.field2739[var3++] = class211.method1472(var465, (byte) -116) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3610) {
                            var3--;
                            int var466 = class168.field2739[var3];
                            if (class261.field4196 == 2 && var466 < class124.field1968) {
                                class215.field3551[var4++] = class103.field1657[var466];
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 3611) {
                            if (class60.field977 == null) {
                                class215.field3551[var4++] = "";
                            } else {
                                class215.field3551[var4++] = class305.method2039(class60.field977, 24667);
                            }
                            continue;
                        }
                        if (var539 == 3612) {
                            if (class60.field977 == null) {
                                class168.field2739[var3++] = 0;
                            } else {
                                class168.field2739[var3++] = class215.field3553;
                            }
                            continue;
                        }
                        if (var539 == 3613) {
                            var3--;
                            int var467 = class168.field2739[var3];
                            if (class60.field977 != null && class215.field3553 > var467) {
                                class215.field3551[var4++] = class305.field4883[var467].field3028;
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 3614) {
                            var3--;
                            int var468 = class168.field2739[var3];
                            if (class60.field977 != null && var468 < class215.field3553) {
                                class168.field2739[var3++] = class305.field4883[var468].field3021;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3615) {
                            var3--;
                            int var469 = class168.field2739[var3];
                            if (class60.field977 != null && var469 < class215.field3553) {
                                class168.field2739[var3++] = class305.field4883[var469].field3026;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3616) {
                            class168.field2739[var3++] = class25.field309;
                            continue;
                        }
                        if (var539 == 3617) {
                            var4--;
                            String var470 = class215.field3551[var4];
                            class162.method1128(-930593224, var470);
                            continue;
                        }
                        if (var539 == 3618) {
                            class168.field2739[var3++] = class246.field3920;
                            continue;
                        }
                        if (var539 == 3619) {
                            var4--;
                            String var471 = class215.field3551[var4];
                            class39.method252(125, var471);
                            continue;
                        }
                        if (var539 == 3620) {
                            class126.method877(4);
                            continue;
                        }
                        if (var539 == 3621) {
                            if (class261.field4196 == 0) {
                                class168.field2739[var3++] = -1;
                            } else {
                                class168.field2739[var3++] = class169.field2755;
                            }
                            continue;
                        }
                        if (var539 == 3622) {
                            var3--;
                            int var472 = class168.field2739[var3];
                            if (class261.field4196 != 0 && class169.field2755 > var472) {
                                class215.field3551[var4++] = class263.field4224[var472];
                                if (class79.field1314[var472] == null) {
                                    class215.field3551[var4++] = "";
                                } else {
                                    class215.field3551[var4++] = class79.field1314[var472];
                                }
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 3623) {
                            var4--;
                            String var473 = class215.field3551[var4];
                            if (var473.startsWith("<img=0>") || var473.startsWith("<img=1>")) {
                                var473 = var473.substring(7);
                            }
                            class168.field2739[var3++] = class4.method22(0, var473) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3624) {
                            var3--;
                            int var474 = class168.field2739[var3];
                            if (class305.field4883 != null && class215.field3553 > var474 && class305.field4883[var474].field3024.equalsIgnoreCase(class239.field3829.field4778)) {
                                class168.field2739[var3++] = 1;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3625) {
                            if (class272.field4372 == null) {
                                class215.field3551[var4++] = "";
                            } else {
                                class215.field3551[var4++] = class272.field4372;
                            }
                            continue;
                        }
                        if (var539 == 3626) {
                            var3--;
                            int var475 = class168.field2739[var3];
                            if (class60.field977 != null && class215.field3553 > var475) {
                                class215.field3551[var4++] = class305.field4883[var475].field3027;
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 3627) {
                            var3--;
                            int var476 = class168.field2739[var3];
                            if (class261.field4196 == 2 && var476 >= 0 && var476 < class124.field1968) {
                                class168.field2739[var3++] = class240.field3838[var476] ? 1 : 0;
                                continue;
                            }
                            class168.field2739[var3++] = 0;
                            continue;
                        }
                        if (var539 == 3628) {
                            var4--;
                            String var477 = class215.field3551[var4];
                            if (var477.startsWith("<img=0>") || var477.startsWith("<img=1>")) {
                                var477 = var477.substring(7);
                            }
                            class168.field2739[var3++] = class28.method158(true, var477);
                            continue;
                        }
                        if (var539 == 3629) {
                            class168.field2739[var3++] = class211.field3503;
                            continue;
                        }
                        if (var539 == 3630) {
                            var4--;
                            String var478 = class215.field3551[var4];
                            class218.method1505(var478, true, -214593270);
                            continue;
                        }
                        if (var539 == 3631) {
                            var3--;
                            int var479 = class168.field2739[var3];
                            class168.field2739[var3++] = class214.field3549[var479] ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3632) {
                            var3--;
                            int var480 = class168.field2739[var3];
                            if (class60.field977 != null && class215.field3553 > var480) {
                                class215.field3551[var4++] = class305.field4883[var480].field3024;
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 3633) {
                            var3--;
                            int var481 = class168.field2739[var3];
                            if (class261.field4196 != 0 && class169.field2755 > var481) {
                                class215.field3551[var4++] = class269.field4341[var481];
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                    } else if (var539 < 4000) {
                        if (var539 == 3903) {
                            var3--;
                            int var123 = class168.field2739[var3];
                            class168.field2739[var3++] = class269.field4325[var123].method938((byte) 59);
                            continue;
                        }
                        if (var539 == 3904) {
                            var3--;
                            int var124 = class168.field2739[var3];
                            class168.field2739[var3++] = class269.field4325[var124].field2107;
                            continue;
                        }
                        if (var539 == 3905) {
                            var3--;
                            int var125 = class168.field2739[var3];
                            class168.field2739[var3++] = class269.field4325[var125].field2102;
                            continue;
                        }
                        if (var539 == 3906) {
                            var3--;
                            int var126 = class168.field2739[var3];
                            class168.field2739[var3++] = class269.field4325[var126].field2117;
                            continue;
                        }
                        if (var539 == 3907) {
                            var3--;
                            int var127 = class168.field2739[var3];
                            class168.field2739[var3++] = class269.field4325[var127].field2112;
                            continue;
                        }
                        if (var539 == 3908) {
                            var3--;
                            int var128 = class168.field2739[var3];
                            class168.field2739[var3++] = class269.field4325[var128].field2113;
                            continue;
                        }
                        if (var539 == 3910) {
                            var3--;
                            int var129 = class168.field2739[var3];
                            int var130 = class269.field4325[var129].method939(-14026);
                            class168.field2739[var3++] = var130 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3911) {
                            var3--;
                            int var131 = class168.field2739[var3];
                            int var132 = class269.field4325[var131].method939(-14026);
                            class168.field2739[var3++] = var132 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3912) {
                            var3--;
                            int var133 = class168.field2739[var3];
                            int var134 = class269.field4325[var133].method939(-14026);
                            class168.field2739[var3++] = var134 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 3913) {
                            var3--;
                            int var135 = class168.field2739[var3];
                            int var136 = class269.field4325[var135].method939(-14026);
                            class168.field2739[var3++] = var136 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var539 < 4100) {
                        if (var539 == 4000) {
                            var3 -= 2;
                            int var411 = class168.field2739[var3];
                            int var412 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var411 + var412;
                            continue;
                        }
                        if (var539 == 4001) {
                            var3 -= 2;
                            int var413 = class168.field2739[var3];
                            int var414 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var413 - var414;
                            continue;
                        }
                        if (var539 == 4002) {
                            var3 -= 2;
                            int var415 = class168.field2739[var3];
                            int var416 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var415 * var416;
                            continue;
                        }
                        if (var539 == 4003) {
                            var3 -= 2;
                            int var417 = class168.field2739[var3];
                            int var418 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var417 / var418;
                            continue;
                        }
                        if (var539 == 4004) {
                            var3--;
                            int var419 = class168.field2739[var3];
                            class168.field2739[var3++] = (int) ((double) var419 * Math.random());
                            continue;
                        }
                        if (var539 == 4005) {
                            var3--;
                            int var420 = class168.field2739[var3];
                            class168.field2739[var3++] = (int) ((double) (var420 + 1) * Math.random());
                            continue;
                        }
                        if (var539 == 4006) {
                            var3 -= 5;
                            int var421 = class168.field2739[var3 + 1];
                            int var422 = class168.field2739[var3];
                            int var423 = class168.field2739[var3 + 2];
                            int var424 = class168.field2739[var3 + 3];
                            int var425 = class168.field2739[var3 + 4];
                            class168.field2739[var3++] = (var425 - var423) * (var421 - var422) / (var424 - var423) + var422;
                            continue;
                        }
                        if (var539 == 4007) {
                            var3 -= 2;
                            long var426 = (long) class168.field2739[var3 + 1];
                            long var428 = (long) class168.field2739[var3];
                            class168.field2739[var3++] = (int) (var428 + (var426 * var428 / 100L));
                            continue;
                        }
                        if (var539 == 4008) {
                            var3 -= 2;
                            int var430 = class168.field2739[var3];
                            int var431 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class173.method1263(0x1 << var431, var430);
                            continue;
                        }
                        if (var539 == 4009) {
                            var3 -= 2;
                            int var432 = class168.field2739[var3 + 1];
                            int var433 = class168.field2739[var3];
                            class168.field2739[var3++] = class51.method359(-(0x1 << var432) - 1, var433);
                            continue;
                        }
                        if (var539 == 4010) {
                            var3 -= 2;
                            int var434 = class168.field2739[var3];
                            int var435 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class51.method359(0x1 << var435, var434) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var539 == 4011) {
                            var3 -= 2;
                            int var436 = class168.field2739[var3];
                            int var437 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var436 % var437;
                            continue;
                        }
                        if (var539 == 4012) {
                            var3 -= 2;
                            int var438 = class168.field2739[var3];
                            int var439 = class168.field2739[var3 + 1];
                            if (var438 == 0) {
                                class168.field2739[var3++] = 0;
                            } else {
                                class168.field2739[var3++] = (int) Math.pow((double) var438, (double) var439);
                            }
                            continue;
                        }
                        if (var539 == 4013) {
                            var3 -= 2;
                            int var440 = class168.field2739[var3];
                            int var441 = class168.field2739[var3 + 1];
                            if (var440 == 0) {
                                class168.field2739[var3++] = 0;
                            } else if (var441 == 0) {
                                class168.field2739[var3++] = Integer.MAX_VALUE;
                            } else {
                                class168.field2739[var3++] = (int) Math.pow((double) var440, 1.0D / (double) var441);
                            }
                            continue;
                        }
                        if (var539 == 4014) {
                            var3 -= 2;
                            int var442 = class168.field2739[var3];
                            int var443 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class51.method359(var442, var443);
                            continue;
                        }
                        if (var539 == 4015) {
                            var3 -= 2;
                            int var444 = class168.field2739[var3 + 1];
                            int var445 = class168.field2739[var3];
                            class168.field2739[var3++] = class173.method1263(var444, var445);
                            continue;
                        }
                        if (var539 == 4016) {
                            var3 -= 2;
                            int var446 = class168.field2739[var3];
                            int var447 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var447 <= var446 ? var447 : var446;
                            continue;
                        }
                        if (var539 == 4017) {
                            var3 -= 2;
                            int var448 = class168.field2739[var3 + 1];
                            int var449 = class168.field2739[var3];
                            class168.field2739[var3++] = var449 > var448 ? var449 : var448;
                            continue;
                        }
                        if (var539 == 4018) {
                            var3 -= 3;
                            long var450 = (long) class168.field2739[var3 + 1];
                            long var452 = (long) class168.field2739[var3];
                            long var454 = (long) class168.field2739[var3 + 2];
                            class168.field2739[var3++] = (int) (var452 * var454 / var450);
                            continue;
                        }
                    } else if (var539 < 4200) {
                        if (var539 == 4100) {
                            var4--;
                            String var361 = class215.field3551[var4];
                            var3--;
                            int var362 = class168.field2739[var3];
                            class215.field3551[var4++] = var361 + var362;
                            continue;
                        }
                        if (var539 == 4101) {
                            var4 -= 2;
                            String var363 = class215.field3551[var4 + 1];
                            String var364 = class215.field3551[var4];
                            class215.field3551[var4++] = var364 + var363;
                            continue;
                        }
                        if (var539 == 4102) {
                            var4--;
                            String var365 = class215.field3551[var4];
                            var3--;
                            int var366 = class168.field2739[var3];
                            class215.field3551[var4++] = var365 + class173.method1259(true, 0, var366);
                            continue;
                        }
                        if (var539 == 4103) {
                            var4--;
                            String var367 = class215.field3551[var4];
                            class215.field3551[var4++] = var367.toLowerCase();
                            continue;
                        }
                        if (var539 == 4104) {
                            var3--;
                            int var368 = class168.field2739[var3];
                            long var369 = ((long) var368 + 11745L) * 86400000L;
                            class177.field2896.setTime(new Date(var369));
                            int var371 = class177.field2896.get(5);
                            int var372 = class177.field2896.get(2);
                            int var373 = class177.field2896.get(1);
                            class215.field3551[var4++] = var371 + "-" + class73.field1230[var372] + "-" + var373;
                            continue;
                        }
                        if (var539 == 4105) {
                            var4 -= 2;
                            String var374 = class215.field3551[var4];
                            String var375 = class215.field3551[var4 + 1];
                            if (class239.field3829.field4767 != null && class239.field3829.field4767.field4241) {
                                class215.field3551[var4++] = var375;
                                continue;
                            }
                            class215.field3551[var4++] = var374;
                            continue;
                        }
                        if (var539 == 4106) {
                            var3--;
                            int var376 = class168.field2739[var3];
                            class215.field3551[var4++] = Integer.toString(var376);
                            continue;
                        }
                        if (var539 == 4107) {
                            var4 -= 2;
                            class168.field2739[var3++] = class269.method1811((byte) -77, class145.method1013((byte) -88, class215.field3551[var4], class2.field28, class215.field3551[var4 + 1]));
                            continue;
                        }
                        if (var539 == 4108) {
                            var4--;
                            String var377 = class215.field3551[var4];
                            var3 -= 2;
                            int var378 = class168.field2739[var3];
                            int var379 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class137.method961(18836, var379).method637(var377, var378);
                            continue;
                        }
                        if (var539 == 4109) {
                            var3 -= 2;
                            var4--;
                            String var380 = class215.field3551[var4];
                            int var381 = class168.field2739[var3];
                            int var382 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = class137.method961(18836, var382).method629(var380, var381);
                            continue;
                        }
                        if (var539 == 4110) {
                            var4 -= 2;
                            String var383 = class215.field3551[var4 + 1];
                            String var384 = class215.field3551[var4];
                            var3--;
                            if (class168.field2739[var3] == 1) {
                                class215.field3551[var4++] = var384;
                            } else {
                                class215.field3551[var4++] = var383;
                            }
                            continue;
                        }
                        if (var539 == 4111) {
                            var4--;
                            String var385 = class215.field3551[var4];
                            class215.field3551[var4++] = class93.method630(var385);
                            continue;
                        }
                        if (var539 == 4112) {
                            var4--;
                            String var386 = class215.field3551[var4];
                            var3--;
                            int var387 = class168.field2739[var3];
                            if (var387 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class215.field3551[var4++] = var386 + (char) var387;
                            continue;
                        }
                        if (var539 == 4113) {
                            var3--;
                            int var388 = class168.field2739[var3];
                            class168.field2739[var3++] = class6.method30((char) var388, -123) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 4114) {
                            var3--;
                            int var389 = class168.field2739[var3];
                            class168.field2739[var3++] = class278.method1871(90, (char) var389) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 4115) {
                            var3--;
                            int var390 = class168.field2739[var3];
                            class168.field2739[var3++] = class141.method990((char) var390, true) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 4116) {
                            var3--;
                            int var391 = class168.field2739[var3];
                            class168.field2739[var3++] = class234.method1589((char) var391, -127) ? 1 : 0;
                            continue;
                        }
                        if (var539 == 4117) {
                            var4--;
                            String var392 = class215.field3551[var4];
                            if (var392 == null) {
                                class168.field2739[var3++] = 0;
                            } else {
                                class168.field2739[var3++] = var392.length();
                            }
                            continue;
                        }
                        if (var539 == 4118) {
                            var3 -= 2;
                            int var393 = class168.field2739[var3 + 1];
                            int var394 = class168.field2739[var3];
                            var4--;
                            String var395 = class215.field3551[var4];
                            class215.field3551[var4++] = var395.substring(var394, var393);
                            continue;
                        }
                        if (var539 == 4119) {
                            var4--;
                            String var396 = class215.field3551[var4];
                            StringBuffer var397 = new StringBuffer(var396.length());
                            boolean var398 = false;
                            for (int var399 = 0; var396.length() > var399; var399++) {
                                char var400 = var396.charAt(var399);
                                if (var400 == '<') {
                                    var398 = true;
                                } else if (var400 == '>') {
                                    var398 = false;
                                } else if (!var398) {
                                    var397.append(var400);
                                }
                            }
                            class215.field3551[var4++] = var397.toString();
                            continue;
                        }
                        if (var539 == 4120) {
                            var3 -= 2;
                            var4--;
                            String var401 = class215.field3551[var4];
                            int var402 = class168.field2739[var3];
                            int var403 = class168.field2739[var3 + 1];
                            class168.field2739[var3++] = var401.indexOf(var402, var403);
                            continue;
                        }
                        if (var539 == 4121) {
                            var4 -= 2;
                            String var404 = class215.field3551[var4];
                            String var405 = class215.field3551[var4 + 1];
                            var3--;
                            int var406 = class168.field2739[var3];
                            class168.field2739[var3++] = var404.indexOf(var405, var406);
                            continue;
                        }
                        if (var539 == 4122) {
                            var3--;
                            int var407 = class168.field2739[var3];
                            class168.field2739[var3++] = Character.toLowerCase((char) var407);
                            continue;
                        }
                        if (var539 == 4123) {
                            var3--;
                            int var408 = class168.field2739[var3];
                            class168.field2739[var3++] = Character.toUpperCase((char) var408);
                            continue;
                        }
                        if (var539 == 4124) {
                            var3--;
                            boolean var409 = class168.field2739[var3] != 0;
                            var3--;
                            int var410 = class168.field2739[var3];
                            class215.field3551[var4++] = class84.method577((long) var410, (byte) -110, var409, 0, class2.field28);
                            continue;
                        }
                    } else if (var539 < 4300) {
                        if (var539 == 4200) {
                            var3--;
                            int var342 = class168.field2739[var3];
                            class215.field3551[var4++] = class81.method562(var342, -20358).field1799;
                            continue;
                        }
                        if (var539 == 4201) {
                            var3 -= 2;
                            int var343 = class168.field2739[var3];
                            int var344 = class168.field2739[var3 + 1];
                            class115 var345 = class81.method562(var343, -20358);
                            if (var344 >= 1 && var344 <= 5 && var345.field1832[var344 - 1] != null) {
                                class215.field3551[var4++] = var345.field1832[var344 - 1];
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 4202) {
                            var3 -= 2;
                            int var346 = class168.field2739[var3 + 1];
                            int var347 = class168.field2739[var3];
                            class115 var348 = class81.method562(var347, -20358);
                            if (var346 >= 1 && var346 <= 5 && var348.field1800[var346 - 1] != null) {
                                class215.field3551[var4++] = var348.field1800[var346 - 1];
                                continue;
                            }
                            class215.field3551[var4++] = "";
                            continue;
                        }
                        if (var539 == 4203) {
                            var3--;
                            int var349 = class168.field2739[var3];
                            class168.field2739[var3++] = class81.method562(var349, -20358).field1791;
                            continue;
                        }
                        if (var539 == 4204) {
                            var3--;
                            int var350 = class168.field2739[var3];
                            class168.field2739[var3++] = class81.method562(var350, -20358).field1794 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 4205) {
                            var3--;
                            int var351 = class168.field2739[var3];
                            class115 var352 = class81.method562(var351, -20358);
                            if (var352.field1780 == -1 && var352.field1818 >= 0) {
                                class168.field2739[var3++] = var352.field1818;
                                continue;
                            }
                            class168.field2739[var3++] = var351;
                            continue;
                        }
                        if (var539 == 4206) {
                            var3--;
                            int var353 = class168.field2739[var3];
                            class115 var354 = class81.method562(var353, -20358);
                            if (var354.field1780 >= 0 && var354.field1818 >= 0) {
                                class168.field2739[var3++] = var354.field1818;
                                continue;
                            }
                            class168.field2739[var3++] = var353;
                            continue;
                        }
                        if (var539 == 4207) {
                            var3--;
                            int var355 = class168.field2739[var3];
                            class168.field2739[var3++] = class81.method562(var355, -20358).field1854 ? 1 : 0;
                            continue;
                        }
                        if (var539 == 4208) {
                            var3 -= 2;
                            int var356 = class168.field2739[var3];
                            int var357 = class168.field2739[var3 + 1];
                            class60 var358 = class186.method1335(var357, 18773);
                            if (var358.method410(90)) {
                                class215.field3551[var4++] = class81.method562(var356, -20358).method810(var358.field986, var357, 26356);
                            } else {
                                class168.field2739[var3++] = class81.method562(var356, -20358).method805(var357, 0, var358.field974);
                            }
                            continue;
                        }
                        if (var539 == 4210) {
                            var3--;
                            int var359 = class168.field2739[var3];
                            var4--;
                            String var360 = class215.field3551[var4];
                            class28.method159(var360, var359 == 1, true);
                            class168.field2739[var3++] = class177.field2900;
                            continue;
                        }
                        if (var539 == 4211) {
                            if (class136.field2148 != null && class177.field2900 > class119.field1910) {
                                class168.field2739[var3++] = class51.method359(class136.field2148[class119.field1910++], 65535);
                                continue;
                            }
                            class168.field2739[var3++] = -1;
                            continue;
                        }
                        if (var539 == 4212) {
                            class119.field1910 = 0;
                            continue;
                        }
                    } else if (var539 < 4400) {
                        if (var539 == 4300) {
                            var3 -= 2;
                            int var137 = class168.field2739[var3 + 1];
                            int var138 = class168.field2739[var3];
                            class60 var139 = class186.method1335(var137, 18773);
                            if (var139.method410(30)) {
                                class215.field3551[var4++] = class234.method1586(var138, true).method1708(var139.field986, var137, (byte) -21);
                            } else {
                                class168.field2739[var3++] = class234.method1586(var138, true).method1703(var139.field974, var137, 122);
                            }
                            continue;
                        }
                    } else if (var539 >= 4500) {
                        if (var539 < 4600) {
                            if (var539 == 4500) {
                                var3 -= 2;
                                int var140 = class168.field2739[var3];
                                int var141 = class168.field2739[var3 + 1];
                                class60 var142 = class186.method1335(var141, 18773);
                                if (var142.method410(53)) {
                                    class215.field3551[var4++] = class165.method1184(26, var140).method1266(var142.field986, var141, true);
                                } else {
                                    class168.field2739[var3++] = class165.method1184(26, var140).method1272(var142.field974, (byte) -81, var141);
                                }
                                continue;
                            }
                        } else if (var539 < 5100) {
                            if (var539 == 5000) {
                                class168.field2739[var3++] = class179.field2916;
                                continue;
                            }
                            if (var539 == 5001) {
                                class285.field4520++;
                                var3 -= 3;
                                class179.field2916 = class168.field2739[var3];
                                class1.field19 = class168.field2739[var3 + 1];
                                class305.field4879 = class168.field2739[var3 + 2];
                                class314.field5061.method828(114, 52);
                                class314.field5061.method1108(class179.field2916, true);
                                class314.field5061.method1108(class1.field19, true);
                                class314.field5061.method1108(class305.field4879, true);
                                continue;
                            }
                            if (var539 == 5002) {
                                var3 -= 2;
                                var4--;
                                String var270 = class215.field3551[var4];
                                class307.field4912++;
                                int var271 = class168.field2739[var3];
                                int var272 = class168.field2739[var3 + 1];
                                class314.field5061.method828(104, 116);
                                class314.field5061.method1108(class230.method1551(var270, (byte) -87) + 2, true);
                                class314.field5061.method1148((byte) -99, var270);
                                class314.field5061.method1108(var271 - 1, true);
                                class314.field5061.method1108(var272, true);
                                continue;
                            }
                            if (var539 == 5003) {
                                var3--;
                                int var273 = class168.field2739[var3];
                                String var274 = null;
                                if (var273 < 100) {
                                    var274 = class88.field1441[var273];
                                }
                                if (var274 == null) {
                                    var274 = "";
                                }
                                class215.field3551[var4++] = var274;
                                continue;
                            }
                            if (var539 == 5004) {
                                var3--;
                                int var275 = class168.field2739[var3];
                                int var276 = -1;
                                if (var275 < 100 && class88.field1441[var275] != null) {
                                    var276 = class177.field2886[var275];
                                }
                                class168.field2739[var3++] = var276;
                                continue;
                            }
                            if (var539 == 5005) {
                                class168.field2739[var3++] = class1.field19;
                                continue;
                            }
                            if (var539 == 5008) {
                                var4--;
                                String var277 = class215.field3551[var4];
                                if (var277.startsWith("::")) {
                                    class40.method262(11668, var277);
                                    continue;
                                }
                                if (class298.field4765 == 0 && (class96.field1542 && !class69.field1139 || class83.field1385)) {
                                    continue;
                                }
                                String var278 = var277.toLowerCase();
                                class83.field1381++;
                                byte var279 = 0;
                                if (var278.startsWith(class310.field4954)) {
                                    var279 = 0;
                                    var277 = var277.substring(class310.field4954.length());
                                } else if (var278.startsWith(class282.field4510)) {
                                    var277 = var277.substring(class282.field4510.length());
                                    var279 = 1;
                                } else if (var278.startsWith(class120.field1920)) {
                                    var279 = 2;
                                    var277 = var277.substring(class120.field1920.length());
                                } else if (var278.startsWith(class57.field947)) {
                                    var279 = 3;
                                    var277 = var277.substring(class57.field947.length());
                                } else if (var278.startsWith(class211.field3426)) {
                                    var279 = 4;
                                    var277 = var277.substring(class211.field3426.length());
                                } else if (var278.startsWith(class151.field2341)) {
                                    var277 = var277.substring(class151.field2341.length());
                                    var279 = 5;
                                } else if (var278.startsWith(class229.field3705)) {
                                    var279 = 6;
                                    var277 = var277.substring(class229.field3705.length());
                                } else if (var278.startsWith(class120.field1917)) {
                                    var279 = 7;
                                    var277 = var277.substring(class120.field1917.length());
                                } else if (var278.startsWith(class209.field3317)) {
                                    var277 = var277.substring(class209.field3317.length());
                                    var279 = 8;
                                } else if (var278.startsWith(class163.field2644)) {
                                    var277 = var277.substring(class163.field2644.length());
                                    var279 = 9;
                                } else if (var278.startsWith(class65.field1084)) {
                                    var279 = 10;
                                    var277 = var277.substring(class65.field1084.length());
                                } else if (var278.startsWith(class208.field3302)) {
                                    var277 = var277.substring(class208.field3302.length());
                                    var279 = 11;
                                } else if (class2.field28 != 0) {
                                    if (var278.startsWith(class19.field227)) {
                                        var279 = 0;
                                        var277 = var277.substring(class19.field227.length());
                                    } else if (var278.startsWith(class289.field4627)) {
                                        var277 = var277.substring(class289.field4627.length());
                                        var279 = 1;
                                    } else if (var278.startsWith(class25.field313)) {
                                        var279 = 2;
                                        var277 = var277.substring(class25.field313.length());
                                    } else if (var278.startsWith(class286.field4569)) {
                                        var277 = var277.substring(class286.field4569.length());
                                        var279 = 3;
                                    } else if (var278.startsWith(class121.field1935)) {
                                        var277 = var277.substring(class121.field1935.length());
                                        var279 = 4;
                                    } else if (var278.startsWith(class159.field2531)) {
                                        var279 = 5;
                                        var277 = var277.substring(class159.field2531.length());
                                    } else if (var278.startsWith(class65.field1079)) {
                                        var279 = 6;
                                        var277 = var277.substring(class65.field1079.length());
                                    } else if (var278.startsWith(class64.field1066)) {
                                        var277 = var277.substring(class64.field1066.length());
                                        var279 = 7;
                                    } else if (var278.startsWith(class237.field3807)) {
                                        var277 = var277.substring(class237.field3807.length());
                                        var279 = 8;
                                    } else if (var278.startsWith(class208.field3299)) {
                                        var279 = 9;
                                        var277 = var277.substring(class208.field3299.length());
                                    } else if (var278.startsWith(class96.field1552)) {
                                        var279 = 10;
                                        var277 = var277.substring(class96.field1552.length());
                                    } else if (var278.startsWith(class179.field2914)) {
                                        var277 = var277.substring(class179.field2914.length());
                                        var279 = 11;
                                    }
                                }
                                String var280 = var277.toLowerCase();
                                byte var281 = 0;
                                if (var280.startsWith(class30.field369)) {
                                    var281 = 1;
                                    var277 = var277.substring(class30.field369.length());
                                } else if (var280.startsWith(class163.field2643)) {
                                    var277 = var277.substring(class163.field2643.length());
                                    var281 = 2;
                                } else if (var280.startsWith(class184.field3016)) {
                                    var277 = var277.substring(class184.field3016.length());
                                    var281 = 3;
                                } else if (var280.startsWith(class175.field2867)) {
                                    var277 = var277.substring(class175.field2867.length());
                                    var281 = 4;
                                } else if (var280.startsWith(class50.field850)) {
                                    var281 = 5;
                                    var277 = var277.substring(class50.field850.length());
                                } else if (class2.field28 != 0) {
                                    if (var280.startsWith(class55.field916)) {
                                        var281 = 1;
                                        var277 = var277.substring(class55.field916.length());
                                    } else if (var280.startsWith(class173.field2818)) {
                                        var281 = 2;
                                        var277 = var277.substring(class173.field2818.length());
                                    } else if (var280.startsWith(class255.field4121)) {
                                        var277 = var277.substring(class255.field4121.length());
                                        var281 = 3;
                                    } else if (var280.startsWith(class229.field3694)) {
                                        var277 = var277.substring(class229.field3694.length());
                                        var281 = 4;
                                    } else if (var280.startsWith(class100.field1615)) {
                                        var277 = var277.substring(class100.field1615.length());
                                        var281 = 5;
                                    }
                                }
                                class314.field5061.method828(118, 144);
                                class314.field5061.method1108(0, true);
                                int var282 = class314.field5061.field2568;
                                class314.field5061.method1108(var279, true);
                                class314.field5061.method1108(var281, true);
                                class279.method1878(class314.field5061, var277, (byte) 80);
                                class314.field5061.method1158(class314.field5061.field2568 - var282, 123);
                                continue;
                            }
                            if (var539 == 5009) {
                                var4 -= 2;
                                String var283 = class215.field3551[var4];
                                String var284 = class215.field3551[var4 + 1];
                                if (class298.field4765 != 0 || (!class96.field1542 || class69.field1139) && !class83.field1385) {
                                    class82.field1369++;
                                    class314.field5061.method828(107, 76);
                                    class314.field5061.method1108(0, true);
                                    int var285 = class314.field5061.field2568;
                                    class314.field5061.method1148((byte) -99, var283);
                                    class279.method1878(class314.field5061, var284, (byte) 121);
                                    class314.field5061.method1158(class314.field5061.field2568 - var285, 123);
                                }
                                continue;
                            }
                            if (var539 == 5010) {
                                var3--;
                                int var286 = class168.field2739[var3];
                                String var287 = null;
                                if (var286 < 100) {
                                    var287 = class124.field1970[var286];
                                }
                                if (var287 == null) {
                                    var287 = "";
                                }
                                class215.field3551[var4++] = var287;
                                continue;
                            }
                            if (var539 == 5011) {
                                String var288 = null;
                                var3--;
                                int var289 = class168.field2739[var3];
                                if (var289 < 100) {
                                    var288 = class137.field2177[var289];
                                }
                                if (var288 == null) {
                                    var288 = "";
                                }
                                class215.field3551[var4++] = var288;
                                continue;
                            }
                            if (var539 == 5012) {
                                var3--;
                                int var290 = class168.field2739[var3];
                                int var291 = -1;
                                if (var290 < 100) {
                                    var291 = class199.field3196[var290];
                                }
                                class168.field2739[var3++] = var291;
                                continue;
                            }
                            if (var539 == 5015) {
                                String var292;
                                if (class239.field3829 == null || class239.field3829.field4768 == null) {
                                    var292 = class240.field3836;
                                } else {
                                    var292 = class239.field3829.method1976(true, -13);
                                }
                                class215.field3551[var4++] = var292;
                                continue;
                            }
                            if (var539 == 5018) {
                                var3--;
                                int var293 = class168.field2739[var3];
                                int var294 = 0;
                                if (var293 < 100 && class88.field1441[var293] != null) {
                                    var294 = class177.field2886[var293];
                                }
                                class168.field2739[var3++] = var294;
                                continue;
                            }
                            if (var539 == 5019) {
                                String var295 = null;
                                var3--;
                                int var296 = class168.field2739[var3];
                                if (var296 < 100) {
                                    var295 = class296.field4738[var296];
                                }
                                if (var295 == null) {
                                    var295 = "";
                                }
                                class215.field3551[var4++] = var295;
                                continue;
                            }
                            if (var539 == 5016) {
                                class168.field2739[var3++] = class305.field4879;
                                continue;
                            }
                            if (var539 == 5017) {
                                class168.field2739[var3++] = class251.field4012;
                                continue;
                            }
                            if (var539 == 5050) {
                                var3--;
                                int var297 = class168.field2739[var3];
                                class215.field3551[var4++] = class296.method1964(var297, (byte) -127).field2663;
                                continue;
                            }
                            if (var539 == 5051) {
                                var3--;
                                int var298 = class168.field2739[var3];
                                class165 var299 = class296.method1964(var298, (byte) -105);
                                if (var299.field2664 == null) {
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var299.field2664.length;
                                }
                                continue;
                            }
                            if (var539 == 5052) {
                                var3 -= 2;
                                int var300 = class168.field2739[var3];
                                int var301 = class168.field2739[var3 + 1];
                                class165 var302 = class296.method1964(var300, (byte) -112);
                                int var303 = var302.field2664[var301];
                                class168.field2739[var3++] = var303;
                                continue;
                            }
                            if (var539 == 5053) {
                                var3--;
                                int var304 = class168.field2739[var3];
                                class165 var305 = class296.method1964(var304, (byte) -107);
                                if (var305.field2666 == null) {
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var305.field2666.length;
                                }
                                continue;
                            }
                            if (var539 == 5054) {
                                var3 -= 2;
                                int var306 = class168.field2739[var3 + 1];
                                int var307 = class168.field2739[var3];
                                class168.field2739[var3++] = class296.method1964(var307, (byte) -118).field2666[var306];
                                continue;
                            }
                            if (var539 == 5055) {
                                var3--;
                                int var308 = class168.field2739[var3];
                                class215.field3551[var4++] = class46.method330((byte) 60, var308).method598(true);
                                continue;
                            }
                            if (var539 == 5056) {
                                var3--;
                                int var309 = class168.field2739[var3];
                                class87 var310 = class46.method330((byte) 45, var309);
                                if (var310.field1432 == null) {
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var310.field1432.length;
                                }
                                continue;
                            }
                            if (var539 == 5057) {
                                var3 -= 2;
                                int var311 = class168.field2739[var3];
                                int var312 = class168.field2739[var3 + 1];
                                class168.field2739[var3++] = class46.method330((byte) 51, var311).field1432[var312];
                                continue;
                            }
                            if (var539 == 5058) {
                                class67.field1108 = new class12();
                                var3--;
                                class67.field1108.field125 = class168.field2739[var3];
                                class67.field1108.field130 = class46.method330((byte) 127, class67.field1108.field125);
                                class67.field1108.field128 = new int[class67.field1108.field130.method591((byte) -126)];
                                continue;
                            }
                            if (var539 == 5059) {
                                class314.field5061.method828(103, 172);
                                class314.field5061.method1108(0, true);
                                class213.field3519++;
                                int var313 = class314.field5061.field2568;
                                class314.field5061.method1108(0, true);
                                class314.field5061.method1120(class67.field1108.field125, true);
                                class67.field1108.field130.method597(class67.field1108.field128, -32041, class314.field5061);
                                class314.field5061.method1158(class314.field5061.field2568 - var313, 123);
                                continue;
                            }
                            if (var539 == 5060) {
                                var4--;
                                String var314 = class215.field3551[var4];
                                class314.field5061.method828(104, 106);
                                class314.field5061.method1108(0, true);
                                int var315 = class314.field5061.field2568;
                                class314.field5061.method1148((byte) -99, var314);
                                class280.field4483++;
                                class314.field5061.method1120(class67.field1108.field125, true);
                                class67.field1108.field130.method597(class67.field1108.field128, -32041, class314.field5061);
                                class314.field5061.method1158(class314.field5061.field2568 - var315, -82);
                                continue;
                            }
                            if (var539 == 5061) {
                                class213.field3519++;
                                class314.field5061.method828(104, 172);
                                class314.field5061.method1108(0, true);
                                int var316 = class314.field5061.field2568;
                                class314.field5061.method1108(1, true);
                                class314.field5061.method1120(class67.field1108.field125, true);
                                class67.field1108.field130.method597(class67.field1108.field128, -32041, class314.field5061);
                                class314.field5061.method1158(class314.field5061.field2568 - var316, -113);
                                continue;
                            }
                            if (var539 == 5062) {
                                var3 -= 2;
                                int var317 = class168.field2739[var3 + 1];
                                int var318 = class168.field2739[var3];
                                class168.field2739[var3++] = class296.method1964(var318, (byte) -128).field2651[var317];
                                continue;
                            }
                            if (var539 == 5063) {
                                var3 -= 2;
                                int var319 = class168.field2739[var3];
                                int var320 = class168.field2739[var3 + 1];
                                class168.field2739[var3++] = class296.method1964(var319, (byte) -94).field2649[var320];
                                continue;
                            }
                            if (var539 == 5064) {
                                var3 -= 2;
                                int var321 = class168.field2739[var3];
                                int var322 = class168.field2739[var3 + 1];
                                if (var322 == -1) {
                                    class168.field2739[var3++] = -1;
                                } else {
                                    class168.field2739[var3++] = class296.method1964(var321, (byte) -99).method1189(-123, (char) var322);
                                }
                                continue;
                            }
                            if (var539 == 5065) {
                                var3 -= 2;
                                int var323 = class168.field2739[var3 + 1];
                                int var324 = class168.field2739[var3];
                                if (var323 == -1) {
                                    class168.field2739[var3++] = -1;
                                } else {
                                    class168.field2739[var3++] = class296.method1964(var324, (byte) -98).method1185((char) var323, -111);
                                }
                                continue;
                            }
                            if (var539 == 5066) {
                                var3--;
                                int var325 = class168.field2739[var3];
                                class168.field2739[var3++] = class46.method330((byte) 51, var325).method591((byte) 45);
                                continue;
                            }
                            if (var539 == 5067) {
                                var3 -= 2;
                                int var326 = class168.field2739[var3 + 1];
                                int var327 = class168.field2739[var3];
                                int var328 = class46.method330((byte) 124, var327).method593(var326, 113);
                                class168.field2739[var3++] = var328;
                                continue;
                            }
                            if (var539 == 5068) {
                                var3 -= 2;
                                int var329 = class168.field2739[var3];
                                int var330 = class168.field2739[var3 + 1];
                                class67.field1108.field128[var329] = var330;
                                continue;
                            }
                            if (var539 == 5069) {
                                var3 -= 2;
                                int var331 = class168.field2739[var3];
                                int var332 = class168.field2739[var3 + 1];
                                class67.field1108.field128[var331] = var332;
                                continue;
                            }
                            if (var539 == 5070) {
                                var3 -= 3;
                                int var333 = class168.field2739[var3];
                                int var334 = class168.field2739[var3 + 1];
                                int var335 = class168.field2739[var3 + 2];
                                class87 var336 = class46.method330((byte) 46, var333);
                                if (var336.method593(var334, 83) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class168.field2739[var3++] = var336.method599(var335, -9, var334);
                                continue;
                            }
                            if (var539 == 5071) {
                                var4--;
                                String var337 = class215.field3551[var4];
                                var3--;
                                boolean var338 = class168.field2739[var3] == 1;
                                class78.method536(var338, var337, -51);
                                class168.field2739[var3++] = class177.field2900;
                                continue;
                            }
                            if (var539 == 5072) {
                                if (class136.field2148 != null && class177.field2900 > class119.field1910) {
                                    class168.field2739[var3++] = class51.method359(class136.field2148[class119.field1910++], 65535);
                                    continue;
                                }
                                class168.field2739[var3++] = -1;
                                continue;
                            }
                            if (var539 == 5073) {
                                class119.field1910 = 0;
                                continue;
                            }
                        } else if (var539 < 5200) {
                            if (var539 == 5100) {
                                if (class100.field1627[86]) {
                                    class168.field2739[var3++] = 1;
                                } else {
                                    class168.field2739[var3++] = 0;
                                }
                                continue;
                            }
                            if (var539 == 5101) {
                                if (class100.field1627[82]) {
                                    class168.field2739[var3++] = 1;
                                } else {
                                    class168.field2739[var3++] = 0;
                                }
                                continue;
                            }
                            if (var539 == 5102) {
                                if (class100.field1627[81]) {
                                    class168.field2739[var3++] = 1;
                                } else {
                                    class168.field2739[var3++] = 0;
                                }
                                continue;
                            }
                        } else if (var539 < 5300) {
                            if (var539 == 5200) {
                                var3--;
                                class215.method1494((byte) 76, class168.field2739[var3]);
                                continue;
                            }
                            if (var539 == 5201) {
                                class168.field2739[var3++] = class136.method953(10);
                                continue;
                            }
                            if (var539 == 5205) {
                                var3--;
                                class53.method373(-1, false, -1, class168.field2739[var3], 7);
                                continue;
                            }
                            if (var539 == 5206) {
                                var3--;
                                int var143 = class168.field2739[var3];
                                class77 var144 = class275.method1841(var143 >> 14 & 0x3FFF, var143 & 0x3FFF);
                                if (var144 == null) {
                                    class168.field2739[var3++] = -1;
                                } else {
                                    class168.field2739[var3++] = var144.field1271;
                                }
                                continue;
                            }
                            if (var539 == 5207) {
                                var3--;
                                class77 var145 = class275.method1854(class168.field2739[var3]);
                                if (var145 != null && var145.field1264 != null) {
                                    class215.field3551[var4++] = var145.field1264;
                                    continue;
                                }
                                class215.field3551[var4++] = "";
                                continue;
                            }
                            if (var539 == 5208) {
                                class168.field2739[var3++] = class22.field287;
                                class168.field2739[var3++] = class28.field343;
                                continue;
                            }
                            if (var539 == 5209) {
                                class168.field2739[var3++] = class275.field4412 + class247.field3934;
                                class168.field2739[var3++] = class275.field4416 + class275.field4413 - class129.field2029 - 1;
                                continue;
                            }
                            if (var539 == 5210) {
                                var3--;
                                int var146 = class168.field2739[var3];
                                class77 var147 = class275.method1854(var146);
                                if (var147 == null) {
                                    class168.field2739[var3++] = 0;
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = class51.method359(var147.field1265 >> 14, 16383);
                                    class168.field2739[var3++] = class51.method359(16383, var147.field1265);
                                }
                                continue;
                            }
                            if (var539 == 5211) {
                                var3--;
                                int var148 = class168.field2739[var3];
                                class77 var149 = class275.method1854(var148);
                                if (var149 == null) {
                                    class168.field2739[var3++] = 0;
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var149.field1282 - var149.field1272;
                                    class168.field2739[var3++] = var149.field1270 - var149.field1267;
                                }
                                continue;
                            }
                            if (var539 == 5212) {
                                class269 var150 = class184.method1327(255);
                                if (var150 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = -1;
                                } else {
                                    class168.field2739[var3++] = var150.field4333;
                                    int var151 = class275.field4416 - (var150.field4328 - class275.field4413) - 1 | class275.field4412 + var150.field4334 << 14 | var150.field4337 << 28;
                                    class168.field2739[var3++] = var151;
                                }
                                continue;
                            }
                            if (var539 == 5213) {
                                class269 var152 = class266.method1793((byte) 101);
                                if (var152 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = -1;
                                } else {
                                    class168.field2739[var3++] = var152.field4333;
                                    int var153 = var152.field4337 << 28 | class275.field4412 + var152.field4334 << 14 | class275.field4416 - (-class275.field4413 + var152.field4328) - 1;
                                    class168.field2739[var3++] = var153;
                                }
                                continue;
                            }
                            if (var539 == 5214) {
                                var3--;
                                int var154 = class168.field2739[var3];
                                class77 var155 = class237.method1607(0);
                                if (var155 != null) {
                                    boolean var156 = var155.method520(class207.field3294, var154 >> 28 & 0x3, (var154 & 0xFFFFFA0) >> 14, 117, var154 & 0x3FFF);
                                    if (var156) {
                                        class311.method2083(24, class207.field3294[2], class207.field3294[1]);
                                    }
                                }
                                continue;
                            }
                            if (var539 == 5215) {
                                var3 -= 2;
                                int var157 = class168.field2739[var3 + 1];
                                int var158 = class168.field2739[var3];
                                class57 var159 = class275.method1843((var158 & 0xFFFD6C1) >> 14, var158 & 0x3FFF);
                                boolean var160 = false;
                                for (class77 var161 = (class77) var159.method389(0); var161 != null; var161 = (class77) var159.method396(0)) {
                                    if (var161.field1271 == var157) {
                                        var160 = true;
                                        break;
                                    }
                                }
                                if (var160) {
                                    class168.field2739[var3++] = 1;
                                } else {
                                    class168.field2739[var3++] = 0;
                                }
                                continue;
                            }
                            if (var539 == 5218) {
                                var3--;
                                int var162 = class168.field2739[var3];
                                class77 var163 = class275.method1854(var162);
                                if (var163 == null) {
                                    class168.field2739[var3++] = -1;
                                } else {
                                    class168.field2739[var3++] = var163.field1280;
                                }
                                continue;
                            }
                            if (var539 == 5220) {
                                class168.field2739[var3++] = class90.field1468 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 5221) {
                                var3--;
                                int var164 = class168.field2739[var3];
                                class311.method2083(24, var164 & 0x3FFF, var164 >> 14 & 0x3FFF);
                                continue;
                            }
                            if (var539 == 5222) {
                                class77 var165 = class237.method1607(0);
                                if (var165 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = -1;
                                } else {
                                    boolean var166 = var165.method524((byte) 56, class247.field3934 + class275.field4412, class207.field3294, class275.field4416 + class275.field4413 - class129.field2029 - 1);
                                    if (var166) {
                                        class168.field2739[var3++] = class207.field3294[1];
                                        class168.field2739[var3++] = class207.field3294[2];
                                    } else {
                                        class168.field2739[var3++] = -1;
                                        class168.field2739[var3++] = -1;
                                    }
                                }
                                continue;
                            }
                            if (var539 == 5223) {
                                var3 -= 2;
                                int var167 = class168.field2739[var3];
                                int var168 = class168.field2739[var3 + 1];
                                class53.method373(var168 >> 14 & 0x3FFF, false, var168 & 0x3FFF, var167, 7);
                                continue;
                            }
                            if (var539 == 5224) {
                                var3--;
                                int var169 = class168.field2739[var3];
                                class77 var170 = class237.method1607(0);
                                if (var170 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = -1;
                                } else {
                                    boolean var171 = var170.method520(class207.field3294, var169 >> 28 & 0x3, var169 >> 14 & 0x3FFF, 114, var169 & 0x3FFF);
                                    if (var171) {
                                        class168.field2739[var3++] = class207.field3294[1];
                                        class168.field2739[var3++] = class207.field3294[2];
                                    } else {
                                        class168.field2739[var3++] = -1;
                                        class168.field2739[var3++] = -1;
                                    }
                                }
                                continue;
                            }
                            if (var539 == 5225) {
                                var3--;
                                int var172 = class168.field2739[var3];
                                class77 var173 = class237.method1607(0);
                                if (var173 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = -1;
                                } else {
                                    boolean var174 = var173.method524((byte) 56, (var172 & 0xFFFD64F) >> 14, class207.field3294, var172 & 0x3FFF);
                                    if (var174) {
                                        class168.field2739[var3++] = class207.field3294[1];
                                        class168.field2739[var3++] = class207.field3294[2];
                                    } else {
                                        class168.field2739[var3++] = -1;
                                        class168.field2739[var3++] = -1;
                                    }
                                }
                                continue;
                            }
                            if (var539 == 5226) {
                                var3--;
                                class10.method49(class168.field2739[var3], -2048);
                                continue;
                            }
                            if (var539 == 5227) {
                                var3 -= 2;
                                int var175 = class168.field2739[var3 + 1];
                                int var176 = class168.field2739[var3];
                                class53.method373(var175 >> 14 & 0x3FFF, true, var175 & 0x3FFF, var176, 7);
                                continue;
                            }
                            if (var539 == 5228) {
                                var3--;
                                class116.field1860 = class168.field2739[var3] == 1;
                                continue;
                            }
                            if (var539 == 5229) {
                                class168.field2739[var3++] = class116.field1860 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 5230) {
                                var3--;
                                int var177 = class168.field2739[var3];
                                class225.method1540(var177, 0);
                                continue;
                            }
                            if (var539 == 5231) {
                                var3 -= 2;
                                int var178 = class168.field2739[var3];
                                boolean var179 = class168.field2739[var3 + 1] == 1;
                                if (class240.field3835 == null) {
                                    continue;
                                }
                                class128 var180 = class240.field3835.method1059(0, (long) var178);
                                if (var180 != null && !var179) {
                                    var180.method913(-3542);
                                    continue;
                                }
                                if (var180 == null && var179) {
                                    class128 var181 = new class128();
                                    class240.field3835.method1052((long) var178, (byte) -65, var181);
                                }
                                continue;
                            }
                            if (var539 == 5232) {
                                var3--;
                                int var182 = class168.field2739[var3];
                                if (class240.field3835 == null) {
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class128 var183 = class240.field3835.method1059(0, (long) var182);
                                    class168.field2739[var3++] = var183 == null ? 0 : 1;
                                }
                                continue;
                            }
                            if (var539 == 5233) {
                                var3 -= 2;
                                int var184 = class168.field2739[var3];
                                boolean var185 = class168.field2739[var3 + 1] == 1;
                                if (class48.field802 == null) {
                                    continue;
                                }
                                class128 var186 = class48.field802.method1059(0, (long) var184);
                                if (var186 != null && !var185) {
                                    var186.method913(-3542);
                                    continue;
                                }
                                if (var186 == null && var185) {
                                    class128 var187 = new class128();
                                    class48.field802.method1052((long) var184, (byte) -65, var187);
                                }
                                continue;
                            }
                            if (var539 == 5234) {
                                var3--;
                                int var188 = class168.field2739[var3];
                                if (class48.field802 == null) {
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class128 var189 = class48.field802.method1059(0, (long) var188);
                                    class168.field2739[var3++] = var189 == null ? 0 : 1;
                                }
                                continue;
                            }
                            if (var539 == 5235) {
                                class168.field2739[var3++] = class275.field4417 == null ? -1 : class275.field4417.field1271;
                                continue;
                            }
                        } else if (var539 < 5400) {
                            if (var539 == 5300) {
                                var3 -= 2;
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            if (var539 == 5301) {
                                continue;
                            }
                            if (var539 == 5302) {
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            if (var539 == 5303) {
                                var3--;
                                class168.field2739[var3++] = 0;
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            if (var539 == 5305) {
                                byte var267 = -1;
                                class168.field2739[var3++] = var267;
                                continue;
                            }
                            if (var539 == 5306) {
                                class168.field2739[var3++] = class56.method383(false);
                                continue;
                            }
                            if (var539 == 5307) {
                                var3--;
                                int var268 = class168.field2739[var3];
                                if (var268 < 0 || var268 > 2) {
                                    var268 = 0;
                                }
                                class41.method268(var268, -1, false, -27825, -1);
                                continue;
                            }
                            if (var539 == 5308) {
                                class168.field2739[var3++] = class229.field3704;
                                continue;
                            }
                            if (var539 == 5309) {
                                var3--;
                                int var269 = class168.field2739[var3];
                                if (var269 < 0 || var269 > 2) {
                                    var269 = 0;
                                }
                                class229.field3704 = var269;
                                class56.method385(106, class268.field4323);
                                continue;
                            }
                        } else if (var539 < 5500) {
                            if (var539 == 5400) {
                                var4 -= 2;
                                String var245 = class215.field3551[var4];
                                String var246 = class215.field3551[var4 + 1];
                                class244.field3879++;
                                var3--;
                                int var247 = class168.field2739[var3];
                                class314.field5061.method828(108, 201);
                                class314.field5061.method1108(class230.method1551(var245, (byte) -87) + (class230.method1551(var246, (byte) -87) + 1), true);
                                class314.field5061.method1148((byte) -99, var245);
                                class314.field5061.method1148((byte) -99, var246);
                                class314.field5061.method1108(var247, true);
                                continue;
                            }
                            if (var539 == 5401) {
                                var3 -= 2;
                                class60.field990[class168.field2739[var3]] = (short) class66.method464(-123, class168.field2739[var3 + 1]);
                                class121.method854((byte) -111);
                                class241.method1625(-125);
                                class78.method530(true);
                                class11.method54((byte) -48);
                                class145.method1014(0);
                                continue;
                            }
                            if (var539 == 5405) {
                                var3 -= 2;
                                int var248 = class168.field2739[var3];
                                int var249 = class168.field2739[var3 + 1];
                                if (var248 >= 0 && var248 < 2) {
                                    class262.field4217[var248] = new int[var249 << 1][4];
                                }
                                continue;
                            }
                            if (var539 == 5406) {
                                var3 -= 7;
                                int var250 = class168.field2739[var3];
                                int var251 = class168.field2739[var3 + 1] << 1;
                                int var252 = class168.field2739[var3 + 2];
                                int var253 = class168.field2739[var3 + 3];
                                int var254 = class168.field2739[var3 + 5];
                                int var255 = class168.field2739[var3 + 6];
                                int var256 = class168.field2739[var3 + 4];
                                if (var250 >= 0 && var250 < 2 && class262.field4217[var250] != null && var251 >= 0 && var251 < class262.field4217[var250].length) {
                                    class262.field4217[var250][var251] = new int[] { (class51.method359(268429327, var252) >> 14) * 128, var253, class51.method359(var252, 16383) * 128, var255 };
                                    class262.field4217[var250][var251 + 1] = new int[] { (class51.method359(268429337, var256) >> 14) * 128, var254, class51.method359(var256, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var539 == 5407) {
                                var3--;
                                int var257 = class262.field4217[class168.field2739[var3]].length >> 1;
                                class168.field2739[var3++] = var257;
                                continue;
                            }
                            if (var539 == 5411) {
                                if (class92.field1494 == null) {
                                    class95.method653(false, 357801124, class186.method1332((byte) -104));
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var539 == 5419) {
                                String var258 = "";
                                if (class67.field1110 != null) {
                                    if (class67.field1110.field2817 == null) {
                                        var258 = class185.method1330(class67.field1110.field2815, false);
                                    } else {
                                        var258 = (String) class67.field1110.field2817;
                                    }
                                }
                                class215.field3551[var4++] = var258;
                                continue;
                            }
                            if (var539 == 5420) {
                                class168.field2739[var3++] = class45.field759 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 5421) {
                                var4--;
                                String var259 = class215.field3551[var4];
                                var3--;
                                boolean var260 = class168.field2739[var3] == 1;
                                String var261 = class186.method1332((byte) -59) + var259;
                                if (class92.field1494 == null && (!var260 || class45.field759 == 3 || !class45.field760.startsWith("win") || class240.field3837)) {
                                    class95.method653(var260, 357801124, var261);
                                    continue;
                                }
                                class281.field4494 = var261;
                                class146.field2311 = var260;
                                class285.field4527 = class268.field4323.method317(var261, 21);
                                continue;
                            }
                            if (var539 == 5422) {
                                var3--;
                                int var262 = class168.field2739[var3];
                                var4 -= 2;
                                String var263 = class215.field3551[var4 + 1];
                                String var264 = class215.field3551[var4];
                                if (var264.length() > 0) {
                                    if (class266.field4281 == null) {
                                        class266.field4281 = new String[class159.field2538[class299.field4792]];
                                    }
                                    class266.field4281[var262] = var264;
                                }
                                if (var263.length() > 0) {
                                    if (class299.field4800 == null) {
                                        class299.field4800 = new String[class159.field2538[class299.field4792]];
                                    }
                                    class299.field4800[var262] = var263;
                                }
                                continue;
                            }
                            if (var539 == 5423) {
                                var4--;
                                System.out.println(class215.field3551[var4]);
                                continue;
                            }
                            if (var539 == 5424) {
                                var3 -= 11;
                                class239.field3827 = class168.field2739[var3];
                                class270.field4349 = class168.field2739[var3 + 1];
                                class103.field1658 = class168.field2739[var3 + 2];
                                class287.field4605 = class168.field2739[var3 + 3];
                                class120.field1915 = class168.field2739[var3 + 4];
                                class223.field3621 = class168.field2739[var3 + 5];
                                class109.field1736 = class168.field2739[var3 + 6];
                                class193.field3129 = class168.field2739[var3 + 7];
                                class182.field3009 = class168.field2739[var3 + 8];
                                class107.field1693 = class168.field2739[var3 + 9];
                                class39.field561 = class168.field2739[var3 + 10];
                                class160.field2541.method1698((byte) 100, class120.field1915);
                                class160.field2541.method1698((byte) 121, class223.field3621);
                                class160.field2541.method1698((byte) 92, class109.field1736);
                                class160.field2541.method1698((byte) 98, class193.field3129);
                                class160.field2541.method1698((byte) 67, class182.field3009);
                                class65.field1078 = true;
                                continue;
                            }
                            if (var539 == 5425) {
                                class26.method146(-93);
                                class65.field1078 = false;
                                continue;
                            }
                            if (var539 == 5426) {
                                var3--;
                                class68.field1121 = class168.field2739[var3];
                                continue;
                            }
                            if (var539 == 5427) {
                                var3 -= 2;
                                class161.field2557 = class168.field2739[var3];
                                class155.field2421 = class168.field2739[var3 + 1];
                                continue;
                            }
                            if (var539 == 5428) {
                                var3 -= 2;
                                int var265 = class168.field2739[var3 + 1];
                                int var266 = class168.field2739[var3];
                                class168.field2739[var3++] = class180.method1309(var265, var266, (byte) 88) ? 1 : 0;
                                continue;
                            }
                        } else if (var539 < 5600) {
                            if (var539 == 5500) {
                                var3 -= 4;
                                int var190 = class168.field2739[var3 + 1];
                                int var191 = class168.field2739[var3];
                                int var192 = class168.field2739[var3 + 2];
                                int var193 = class168.field2739[var3 + 3];
                                class264.method1781(false, (var191 & 0x3FFF) - class108.field1732, (var191 >> 14 & 0x3FFF) + -field4438, var190, (byte) 76, var192, var193);
                                continue;
                            }
                            if (var539 == 5501) {
                                var3 -= 4;
                                int var194 = class168.field2739[var3 + 1];
                                int var195 = class168.field2739[var3];
                                int var196 = class168.field2739[var3 + 2];
                                int var197 = class168.field2739[var3 + 3];
                                class96.method663(125, var194, ((var195 & 0xFFFCB95) >> 14) - field4438, var196, var197, (var195 & 0x3FFF) - class108.field1732);
                                continue;
                            }
                            if (var539 == 5502) {
                                var3 -= 6;
                                int var198 = class168.field2739[var3];
                                if (var198 >= 2) {
                                    throw new RuntimeException();
                                }
                                class13.field139 = var198;
                                int var199 = class168.field2739[var3 + 1];
                                if (var199 + 1 >= class262.field4217[class13.field139].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class108.field1734 = var199;
                                class13.field138 = 0;
                                class190.field3077 = class168.field2739[var3 + 2];
                                class78.field1298 = class168.field2739[var3 + 3];
                                int var200 = class168.field2739[var3 + 4];
                                if (var200 >= 2) {
                                    throw new RuntimeException();
                                }
                                class264.field4238 = var200;
                                int var201 = class168.field2739[var3 + 5];
                                if (var201 + 1 >= class262.field4217[class264.field4238].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class120.field1919 = 3;
                                class238.field3817 = var201;
                                continue;
                            }
                            if (var539 == 5503) {
                                class206.method1439(0);
                                continue;
                            }
                            if (var539 == 5504) {
                                var3 -= 2;
                                class293.method1949(class168.field2739[var3], 67, class168.field2739[var3 + 1]);
                                continue;
                            }
                            if (var539 == 5505) {
                                class168.field2739[var3++] = (int) class20.field240;
                                continue;
                            }
                            if (var539 == 5506) {
                                class168.field2739[var3++] = (int) class90.field1456;
                                continue;
                            }
                            if (var539 == 5507) {
                                class215.method1493(-16);
                                continue;
                            }
                            if (var539 == 5508) {
                                class236.method1601(-16);
                                continue;
                            }
                            if (var539 == 5509) {
                                class15.method71(191);
                                continue;
                            }
                            if (var539 == 5510) {
                                class144.method1008(2);
                                continue;
                            }
                            if (var539 == 5511) {
                                var3--;
                                int var202 = class168.field2739[var3];
                                class120.field1919 = 4;
                                int var203 = var202 & 0x3FFF;
                                int var204 = var202 >> 14 & 0x3FFF;
                                int var205 = var204 - field4438;
                                if (var205 < 0) {
                                    var205 = 0;
                                } else if (var205 >= 104) {
                                    var205 = 104;
                                }
                                int var206 = var203 - class108.field1732;
                                if (var206 < 0) {
                                    var206 = 0;
                                } else if (var206 >= 104) {
                                    var206 = 104;
                                }
                                class95.field1537 = var206 * 128 + 64;
                                class256.field4149 = var205 * 128 + 64;
                                continue;
                            }
                            if (var539 == 5512) {
                                class119.method842(81);
                                continue;
                            }
                        } else if (var539 < 5700) {
                            if (var539 == 5600) {
                                var4 -= 2;
                                String var207 = class215.field3551[var4 + 1];
                                String var208 = class215.field3551[var4];
                                var3--;
                                int var209 = class168.field2739[var3];
                                if (class153.field2385 == 10 && class247.field3933 == 0 && class162.field2612 == 0 && class176.field2873 == 0 && class227.field3668 == 0) {
                                    class120.method846(true, var209, var207, var208);
                                }
                                continue;
                            }
                            if (var539 == 5601) {
                                class3.method18((byte) 57);
                                continue;
                            }
                            if (var539 == 5602) {
                                if (class162.field2612 == 0) {
                                    class311.field4973 = -2;
                                }
                                continue;
                            }
                            if (var539 == 5603) {
                                var3 -= 4;
                                if (class153.field2385 == 10 && class247.field3933 == 0 && class162.field2612 == 0 && class176.field2873 == 0 && class227.field3668 == 0) {
                                    class160.method1100(class168.field2739[var3 + 1], class168.field2739[var3 + 3], -97, class168.field2739[var3], class168.field2739[var3 + 2]);
                                }
                                continue;
                            }
                            if (var539 == 5604) {
                                var4--;
                                if (class153.field2385 == 10 && class247.field3933 == 0 && class162.field2612 == 0 && class176.field2873 == 0 && class227.field3668 == 0) {
                                    class100.method683(0, class178.method1303(class215.field3551[var4], -128));
                                }
                                continue;
                            }
                            if (var539 == 5605) {
                                var3 -= 7;
                                var4 -= 3;
                                if (class153.field2385 == 10 && class247.field3933 == 0 && class162.field2612 == 0 && class176.field2873 == 0 && class227.field3668 == 0) {
                                    class132.method937(class215.field3551[var4 + 1], class178.method1303(class215.field3551[var4], -128), class168.field2739[var3 + 1], class168.field2739[var3], class168.field2739[var3 + 5] == 1, class168.field2739[var3 + 3], class215.field3551[var4 + 2], 2, class168.field2739[var3 + 2], class168.field2739[var3 + 6] == 1, class168.field2739[var3 + 4] == 1);
                                }
                                continue;
                            }
                            if (var539 == 5606) {
                                if (class176.field2873 == 0) {
                                    class9.field91 = -2;
                                }
                                continue;
                            }
                            if (var539 == 5607) {
                                class168.field2739[var3++] = class311.field4973;
                                continue;
                            }
                            if (var539 == 5608) {
                                class168.field2739[var3++] = class291.field4679;
                                continue;
                            }
                            if (var539 == 5609) {
                                class168.field2739[var3++] = class9.field91;
                                continue;
                            }
                            if (var539 == 5610) {
                                for (int var210 = 0; var210 < 5; var210++) {
                                    class215.field3551[var4++] = var210 >= class81.field1363.length ? "" : class305.method2039(class81.field1363[var210], 24667);
                                }
                                class81.field1363 = null;
                                continue;
                            }
                            if (var539 == 5611) {
                                class168.field2739[var3++] = class109.field1738;
                                continue;
                            }
                        } else if (var539 < 6100) {
                            if (var539 == 6001) {
                                var3--;
                                int var211 = class168.field2739[var3];
                                if (var211 < 1) {
                                    var211 = 1;
                                }
                                if (var211 > 4) {
                                    var211 = 4;
                                }
                                class77.field1289 = var211;
                                if (class77.field1289 == 1) {
                                    class302.method1999(0.9F);
                                }
                                if (class77.field1289 == 2) {
                                    class302.method1999(0.8F);
                                }
                                if (class77.field1289 == 3) {
                                    class302.method1999(0.7F);
                                }
                                if (class77.field1289 == 4) {
                                    class302.method1999(0.6F);
                                }
                                class241.method1625(-43);
                                class56.method385(-49, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6002) {
                                var3--;
                                class207.method1448(class168.field2739[var3] == 1, false);
                                class153.method1045(true);
                                class233.method1572(-30125);
                                class287.method1914(true);
                                class56.method385(-29, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6003) {
                                var3--;
                                class86.field1419 = class168.field2739[var3] == 1;
                                class287.method1914(true);
                                class56.method385(-68, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6005) {
                                var3--;
                                class100.field1609 = class168.field2739[var3] == 1;
                                class233.method1572(-30125);
                                class56.method385(94, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6006) {
                                var3--;
                                class1.field15 = class168.field2739[var3] == 1;
                                ((class20) class302.field4828).method106(!class1.field15, -92);
                                class56.method385(101, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6007) {
                                var3--;
                                class100.field1624 = class168.field2739[var3] == 1;
                                class56.method385(-18, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6008) {
                                var3--;
                                class42.field610 = class168.field2739[var3] == 1;
                                class56.method385(-107, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6009) {
                                var3--;
                                class262.field4210 = class168.field2739[var3] == 1;
                                class56.method385(111, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6010) {
                                var3--;
                                class165.field2656 = class168.field2739[var3] == 1;
                                class56.method385(124, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6011) {
                                var3--;
                                int var212 = class168.field2739[var3];
                                if (var212 < 0 || var212 > 2) {
                                    var212 = 0;
                                }
                                class188.field3051 = var212;
                                class56.method385(-28, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6012) {
                                var3--;
                                class126.field1996 = class168.field2739[var3] == 1;
                                if (class77.field1289 == 1) {
                                    class302.method1999(0.9F);
                                }
                                if (class77.field1289 == 2) {
                                    class302.method1999(0.8F);
                                }
                                if (class77.field1289 == 3) {
                                    class302.method1999(0.7F);
                                }
                                if (class77.field1289 == 4) {
                                    class302.method1999(0.6F);
                                }
                                class233.method1572(-30125);
                                class56.method385(-27, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6014) {
                                var3--;
                                class66.field1101 = class168.field2739[var3] == 1;
                                class56.method385(102, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6015) {
                                var3--;
                                class239.field3831 = class168.field2739[var3] == 1;
                                class56.method385(93, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6016) {
                                var3--;
                                int var213 = class168.field2739[var3];
                                if (var213 < 0 || var213 > 2) {
                                    var213 = 0;
                                }
                                class265.field4273 = var213;
                                continue;
                            }
                            if (var539 == 6017) {
                                var3--;
                                class247.field3931 = class168.field2739[var3] == 1;
                                class22.method120(-97);
                                class56.method385(-59, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6018) {
                                var3--;
                                int var214 = class168.field2739[var3];
                                if (var214 < 0) {
                                    var214 = 0;
                                }
                                if (var214 > 127) {
                                    var214 = 127;
                                }
                                class183.field3011 = var214;
                                class56.method385(107, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6019) {
                                var3--;
                                int var215 = class168.field2739[var3];
                                if (var215 < 0) {
                                    var215 = 0;
                                }
                                if (var215 > 255) {
                                    var215 = 255;
                                }
                                if (class214.field3548 != var215) {
                                    if (class214.field3548 == 0 && class281.field4498 != -1) {
                                        class295.method1959(class281.field4498, class50.field852, false, 0, true, var215);
                                        class277.field4451 = false;
                                    } else if (var215 == 0) {
                                        class206.method1443(2568);
                                        class277.field4451 = false;
                                    } else {
                                        class42.method276(0, var215);
                                    }
                                    class214.field3548 = var215;
                                }
                                class56.method385(-63, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6020) {
                                var3--;
                                int var216 = class168.field2739[var3];
                                if (var216 < 0) {
                                    var216 = 0;
                                }
                                if (var216 > 127) {
                                    var216 = 127;
                                }
                                class32.field481 = var216;
                                class56.method385(106, class268.field4323);
                                class134.field2127 = false;
                                continue;
                            }
                            if (var539 == 6021) {
                                var3--;
                                class9.field92 = class168.field2739[var3] == 1;
                                class287.method1914(true);
                                continue;
                            }
                            if (var539 == 6023) {
                                boolean var217 = false;
                                var3--;
                                int var218 = class168.field2739[var3];
                                if (var218 < 0) {
                                    var218 = 0;
                                }
                                if (var218 > 2) {
                                    var218 = 2;
                                }
                                if (class313.field4991 < 96) {
                                    var218 = 0;
                                    var217 = true;
                                }
                                class171.method1243(var218);
                                class56.method385(112, class268.field4323);
                                class134.field2127 = false;
                                class168.field2739[var3++] = var217 ? 0 : 1;
                                continue;
                            }
                            if (var539 == 6024) {
                                var3--;
                                int var219 = class168.field2739[var3];
                                if (var219 < 0 || var219 > 2) {
                                    var219 = 0;
                                }
                                class206.field3282 = var219;
                                class56.method385(91, class268.field4323);
                                continue;
                            }
                            if (var539 == 6027) {
                                var3--;
                                continue;
                            }
                            if (var539 == 6028) {
                                var3--;
                                class47.field786 = class168.field2739[var3] != 0;
                                class56.method385(-28, class268.field4323);
                                continue;
                            }
                        } else if (var539 < 6200) {
                            if (var539 == 6101) {
                                class168.field2739[var3++] = class77.field1289;
                                continue;
                            }
                            if (var539 == 6102) {
                                class168.field2739[var3++] = class129.method918(false) ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6103) {
                                class168.field2739[var3++] = class86.field1419 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6105) {
                                class168.field2739[var3++] = class100.field1609 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6106) {
                                class168.field2739[var3++] = class1.field15 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6107) {
                                class168.field2739[var3++] = class100.field1624 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6108) {
                                class168.field2739[var3++] = class42.field610 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6109) {
                                class168.field2739[var3++] = class262.field4210 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6110) {
                                class168.field2739[var3++] = class165.field2656 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6111) {
                                class168.field2739[var3++] = class188.field3051;
                                continue;
                            }
                            if (var539 == 6112) {
                                class168.field2739[var3++] = class126.field1996 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6114) {
                                class168.field2739[var3++] = class66.field1101 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6115) {
                                class168.field2739[var3++] = class239.field3831 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6116) {
                                class168.field2739[var3++] = class265.field4273;
                                continue;
                            }
                            if (var539 == 6117) {
                                class168.field2739[var3++] = class247.field3931 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6118) {
                                class168.field2739[var3++] = class183.field3011;
                                continue;
                            }
                            if (var539 == 6119) {
                                class168.field2739[var3++] = class214.field3548;
                                continue;
                            }
                            if (var539 == 6120) {
                                class168.field2739[var3++] = class32.field481;
                                continue;
                            }
                            if (var539 == 6121) {
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            if (var539 == 6123) {
                                class168.field2739[var3++] = class171.method1244();
                                continue;
                            }
                            if (var539 == 6124) {
                                class168.field2739[var3++] = class206.field3282;
                                continue;
                            }
                            if (var539 == 6126) {
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            if (var539 == 6127) {
                                class168.field2739[var3++] = class51.field858 ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6128) {
                                class168.field2739[var3++] = class47.field786 ? 1 : 0;
                                continue;
                            }
                        } else if (var539 < 6300) {
                            if (var539 == 6200) {
                                var3 -= 2;
                                class83.field1387 = (short) class168.field2739[var3];
                                if (class83.field1387 <= 0) {
                                    class83.field1387 = 256;
                                }
                                class190.field3069 = (short) class168.field2739[var3 + 1];
                                if (class190.field3069 <= 0) {
                                    class190.field3069 = 205;
                                }
                                continue;
                            }
                            if (var539 == 6201) {
                                var3 -= 2;
                                class111.field1753 = (short) class168.field2739[var3];
                                if (class111.field1753 <= 0) {
                                    class111.field1753 = 256;
                                }
                                class33.field508 = (short) class168.field2739[var3 + 1];
                                if (class33.field508 <= 0) {
                                    class33.field508 = 320;
                                }
                                continue;
                            }
                            if (var539 == 6202) {
                                var3 -= 4;
                                class158.field2527 = (short) class168.field2739[var3];
                                if (class158.field2527 <= 0) {
                                    class158.field2527 = 1;
                                }
                                class221.field3612 = (short) class168.field2739[var3 + 1];
                                if (class221.field3612 <= 0) {
                                    class221.field3612 = 32767;
                                } else if (class221.field3612 < class158.field2527) {
                                    class221.field3612 = class158.field2527;
                                }
                                class263.field4219 = (short) class168.field2739[var3 + 2];
                                if (class263.field4219 <= 0) {
                                    class263.field4219 = 1;
                                }
                                class251.field3984 = (short) class168.field2739[var3 + 3];
                                if (class251.field3984 <= 0) {
                                    class251.field3984 = 32767;
                                } else if (class263.field4219 > class251.field3984) {
                                    class251.field3984 = class263.field4219;
                                }
                                continue;
                            }
                            if (var539 == 6203) {
                                class49.method345(0, 0, class121.field1934.field3430, class121.field1934.field3394, false, -68);
                                class168.field2739[var3++] = class13.field137;
                                class168.field2739[var3++] = class292.field4688;
                                continue;
                            }
                            if (var539 == 6204) {
                                class168.field2739[var3++] = class111.field1753;
                                class168.field2739[var3++] = class33.field508;
                                continue;
                            }
                            if (var539 == 6205) {
                                class168.field2739[var3++] = class83.field1387;
                                class168.field2739[var3++] = class190.field3069;
                                continue;
                            }
                        } else if (var539 < 6400) {
                            if (var539 == 6300) {
                                class168.field2739[var3++] = (int) (class191.method1350((byte) -33) / 60000L);
                                continue;
                            }
                            if (var539 == 6301) {
                                class168.field2739[var3++] = (int) (class191.method1350((byte) -45) / 86400000L) - 11745;
                                continue;
                            }
                            if (var539 == 6302) {
                                var3 -= 3;
                                int var220 = class168.field2739[var3];
                                int var221 = class168.field2739[var3 + 1];
                                int var222 = class168.field2739[var3 + 2];
                                class177.field2896.clear();
                                class177.field2896.set(11, 12);
                                class177.field2896.set(var222, var221, var220);
                                class168.field2739[var3++] = (int) (class177.field2896.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var539 == 6303) {
                                class177.field2896.clear();
                                class177.field2896.setTime(new Date(class191.method1350((byte) 127)));
                                class168.field2739[var3++] = class177.field2896.get(1);
                                continue;
                            }
                            if (var539 == 6304) {
                                var3--;
                                int var223 = class168.field2739[var3];
                                boolean var224 = true;
                                if (var223 < 0) {
                                    var224 = ((var223 + 1) % 4) == 0;
                                } else if (var223 < 1582) {
                                    var224 = var223 % 4 == 0;
                                } else if (var223 % 4 != 0) {
                                    var224 = false;
                                } else if (var223 % 100 != 0) {
                                    var224 = true;
                                } else if (var223 % 400 != 0) {
                                    var224 = false;
                                }
                                class168.field2739[var3++] = var224 ? 1 : 0;
                                continue;
                            }
                        } else if (var539 < 6500) {
                            if (var539 == 6405) {
                                class168.field2739[var3++] = class198.method1384(-11559) ? 1 : 0;
                                continue;
                            }
                            if (var539 == 6406) {
                                class168.field2739[var3++] = class156.method1065(true) ? 1 : 0;
                                continue;
                            }
                        } else if (var539 < 6600) {
                            if (var539 == 6500) {
                                if (class153.field2385 == 10 && class247.field3933 == 0 && class162.field2612 == 0 && class176.field2873 == 0) {
                                    class168.field2739[var3++] = class152.method1043(-26313) == -1 ? 0 : 1;
                                    continue;
                                }
                                class168.field2739[var3++] = 1;
                                continue;
                            }
                            if (var539 == 6501) {
                                class203 var233 = class89.method607(false);
                                if (var233 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = 0;
                                    class215.field3551[var4++] = "";
                                    class168.field2739[var3++] = 0;
                                    class215.field3551[var4++] = "";
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var233.field3238;
                                    class168.field2739[var3++] = var233.field4161;
                                    class215.field3551[var4++] = var233.field3236;
                                    class5 var234 = var233.method1422(-122);
                                    class168.field2739[var3++] = var234.field55;
                                    class215.field3551[var4++] = var234.field54;
                                    class168.field2739[var3++] = var233.field4158;
                                }
                                continue;
                            }
                            if (var539 == 6502) {
                                class203 var235 = class223.method1528((byte) -106);
                                if (var235 == null) {
                                    class168.field2739[var3++] = -1;
                                    class168.field2739[var3++] = 0;
                                    class215.field3551[var4++] = "";
                                    class168.field2739[var3++] = 0;
                                    class215.field3551[var4++] = "";
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var235.field3238;
                                    class168.field2739[var3++] = var235.field4161;
                                    class215.field3551[var4++] = var235.field3236;
                                    class5 var236 = var235.method1422(-128);
                                    class168.field2739[var3++] = var236.field55;
                                    class215.field3551[var4++] = var236.field54;
                                    class168.field2739[var3++] = var235.field4158;
                                }
                                continue;
                            }
                            if (var539 == 6503) {
                                var3--;
                                int var237 = class168.field2739[var3];
                                if (class153.field2385 == 10 && class247.field3933 == 0 && class162.field2612 == 0 && class176.field2873 == 0) {
                                    class168.field2739[var3++] = class291.method1943((byte) -67, var237) ? 1 : 0;
                                    continue;
                                }
                                class168.field2739[var3++] = 0;
                                continue;
                            }
                            if (var539 == 6504) {
                                var3--;
                                class145.field2293 = class168.field2739[var3];
                                class56.method385(106, class268.field4323);
                                continue;
                            }
                            if (var539 == 6505) {
                                class168.field2739[var3++] = class145.field2293;
                                continue;
                            }
                            if (var539 == 6506) {
                                var3--;
                                int var238 = class168.field2739[var3];
                                class203 var239 = class298.method1969(var238, (byte) -40);
                                if (var239 == null) {
                                    class168.field2739[var3++] = -1;
                                    class215.field3551[var4++] = "";
                                    class168.field2739[var3++] = 0;
                                    class215.field3551[var4++] = "";
                                    class168.field2739[var3++] = 0;
                                } else {
                                    class168.field2739[var3++] = var239.field4161;
                                    class215.field3551[var4++] = var239.field3236;
                                    class5 var240 = var239.method1422(-124);
                                    class168.field2739[var3++] = var240.field55;
                                    class215.field3551[var4++] = var240.field54;
                                    class168.field2739[var3++] = var239.field4158;
                                }
                                continue;
                            }
                            if (var539 == 6507) {
                                var3 -= 4;
                                int var241 = class168.field2739[var3];
                                int var242 = class168.field2739[var3 + 2];
                                boolean var243 = class168.field2739[var3 + 1] == 1;
                                boolean var244 = class168.field2739[var3 + 3] == 1;
                                class155.method1050(var244, var241, var243, (byte) -13, var242);
                                continue;
                            }
                        } else if (var539 < 6700) {
                            if (var539 == 6600) {
                                var3--;
                                class144.field2281 = class168.field2739[var3] == 1;
                                class56.method385(123, class268.field4323);
                                continue;
                            }
                            if (var539 == 6601) {
                                class168.field2739[var3++] = class144.field2281 ? 1 : 0;
                                continue;
                            }
                        } else if (var539 < 6900) {
                            if (var539 == 6800) {
                                var3--;
                                int var225 = class168.field2739[var3];
                                class50 var226 = class49.method346(var225, (byte) 26);
                                if (var226.field819 == null) {
                                    class215.field3551[var4++] = "";
                                } else {
                                    class215.field3551[var4++] = var226.field819;
                                }
                                continue;
                            }
                            if (var539 == 6801) {
                                var3--;
                                int var227 = class168.field2739[var3];
                                class50 var228 = class49.method346(var227, (byte) 94);
                                class168.field2739[var3++] = var228.field831;
                                continue;
                            }
                            if (var539 == 6802) {
                                var3--;
                                int var229 = class168.field2739[var3];
                                class50 var230 = class49.method346(var229, (byte) 49);
                                class168.field2739[var3++] = var230.field847;
                                continue;
                            }
                            if (var539 == 6803) {
                                var3--;
                                int var231 = class168.field2739[var3];
                                class50 var232 = class49.method346(var231, (byte) 85);
                                class168.field2739[var3++] = var232.field845;
                                continue;
                            }
                        }
                    } else if (var539 == 4400) {
                        var3 -= 2;
                        int var339 = class168.field2739[var3 + 1];
                        int var340 = class168.field2739[var3];
                        class60 var341 = class186.method1335(var339, 18773);
                        if (var341.method410(57)) {
                            class215.field3551[var4++] = class5.method29(var340, true).method1085(true, var341.field986, var339);
                        } else {
                            class168.field2739[var3++] = class5.method29(var340, true).method1083(var339, var341.field974, (byte) 99);
                        }
                        continue;
                    }
                } else {
                    class211 var59;
                    if (var539 < 2000) {
                        var59 = var39 ? class52.field871 : class249.field3949;
                    } else {
                        var3--;
                        var59 = class17.method87(class168.field2739[var3], -20055);
                        var539 -= 1000;
                    }
                    if (var539 == 1300) {
                        var3--;
                        int var60 = class168.field2739[var3] - 1;
                        if (var60 >= 0 && var60 <= 9) {
                            var4--;
                            var59.method1477(var60, true, class215.field3551[var4]);
                            continue;
                        }
                        var4--;
                        continue;
                    }
                    if (var539 == 1301) {
                        var3 -= 2;
                        int var61 = class168.field2739[var3];
                        int var62 = class168.field2739[var3 + 1];
                        var59.field3350 = class32.method217(var61, var62, 116);
                        continue;
                    }
                    if (var539 == 1302) {
                        var3--;
                        var59.field3344 = class168.field2739[var3] == 1;
                        continue;
                    }
                    if (var539 == 1303) {
                        var3--;
                        var59.field3467 = class168.field2739[var3];
                        continue;
                    }
                    if (var539 == 1304) {
                        var3--;
                        var59.field3326 = class168.field2739[var3];
                        continue;
                    }
                    if (var539 == 1305) {
                        var4--;
                        var59.field3399 = class215.field3551[var4];
                        continue;
                    }
                    if (var539 == 1306) {
                        var4--;
                        var59.field3386 = class215.field3551[var4];
                        continue;
                    }
                    if (var539 == 1307) {
                        var59.field3368 = null;
                        continue;
                    }
                    if (var539 == 1308) {
                        var3--;
                        var59.field3407 = class168.field2739[var3];
                        var3--;
                        var59.field3374 = class168.field2739[var3];
                        continue;
                    }
                    if (var539 == 1309) {
                        var3--;
                        int var63 = class168.field2739[var3];
                        var3--;
                        int var64 = class168.field2739[var3];
                        if (var64 >= 1 && var64 <= 10) {
                            var59.method1478(var63, -1, var64 - 1);
                        }
                        continue;
                    }
                    if (var539 == 1310) {
                        var4--;
                        var59.field3336 = class215.field3551[var4];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var538) {
            if (arg1.field3688 == null) {
                if (class225.field3652 != 0) {
                    class99.method673(true, "Clientscript error - check log for details");
                }
                class19.method94(-116, var538, "CS2 - scr:" + arg1.field2012 + " op:" + var8);
            } else {
                StringBuffer var535 = new StringBuffer(30);
                var535.append("%0a - in: ").append(arg1.field3688);
                for (int var536 = class266.field4283 - 1; var536 >= 0; var536--) {
                    var535.append("%0a - via: ").append(class44.field730[var536].field807.field3688);
                }
                if (var8 == 40) {
                    int var537 = var9[var5];
                    var535.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var537));
                }
                if (class225.field3652 != 0) {
                    class99.method673(true, "Clientscript error in: " + arg1.field3688);
                }
                class19.method94(-123, var538, "CS2 - scr:" + arg1.field2012 + " op:" + var8 + var535.toString());
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)I")
    public abstract int method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)Lim;")
    public static final class179 method1858(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class96.field1548 || arg2 < 0 || arg2 >= class59.field972) {
            return null;
        }
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class179 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field2357; var7++) {
            class179 var8 = var3.field2347[var7];
            if ((var8.field2933 >> 29 & 0x3L) <= 1L && var8.field2931 == arg1 && var8.field2915 == arg2 && (var8.field2918 > var5 || var8.field2925 > var6)) {
                var4 = var8;
                var5 = var8.field2918;
                var6 = var8.field2925;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)J")
    public abstract long method154(byte arg0);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public abstract void method151(int arg0);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static final void method1859(byte arg0) {
        field4439++;
        if (class62.field1024 != null) {
            class62.field1024.method1924((byte) 89);
        }
        if (arg0 < 97) {
            method1861(106, -81, -103);
        }
        if (class233.field3750 != null) {
            class233.field3750.method1924((byte) 89);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public static final void method1860(int arg0) {
        class23.field296 = "Bitte entferne ";
        class234.field3777 = "Eingabeprozedur geladen.";
        class219.field3595 = "Titelbild geladen.";
        class289.field4627 = "rot:";
        class13.field132 = "Sprites geladen.";
        class250.field3954 = "Titelbild geöffnet.";
        class116.field1867 = "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!";
        class98.field1568 = " zuerst von deiner Freunde-Liste!";
        class185.field3025 = "3D-Softwarebibliothek gestartet.";
        class47.field797 = "Ladevorgang - bitte warte.";
        class178.field2911 = "Zugewiesener Speicher.";
        class74.field1239 = "T";
        class208.field3299 = "leuchten1:";
        class161.field2560 = "Lade Liste der Welten";
        class233.field3744 = "Ablegen";
        class17.field209 = " steht bereits auf deiner Freunde-Liste!";
        class176.field2882 = "Fallen lassen";
        class65.field1093 = "Schriftsätze geladen.";
        class141.field2254 = "Bitte entferne ";
        class198.field3188 = " zuerst von deiner Ignorieren-Liste!";
        class132.field2070 = "Texturen geladen.";
        class237.field3806 = "Auswählen";
        class25.field316 = " loggt sich ein.";
        class65.field1079 = "blinken1:";
        class298.field4752 = "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100";
        class146.field2307 = "Kampfstufe: ";
        class170.field2771 = "Liste der Welten geladen";
        class133.field2109 = "Lade Titelbild - ";
        class67.field1113 = "Untersuchen";
        class277.field4459 = "Bitte warte...";
        class189.field3058 = "Weiter";
        class62.field1028 = "Update-Liste geladen.";
        class19.field227 = "gelb:";
        class255.field4125 = "Musik-Engine vorbereitet.";
        class25.field313 = "grün:";
        class203.field3240 = "Angreifen";
        class64.field1066 = "blinken2:";
        if (arg0 != 1) {
            return;
        }
        class227.field3667 = "Versteckt";
        class179.field2914 = "leuchten3:";
        class90.field1469 = "Benutzeroberfläche geladen.";
        class96.field1552 = "leuchten2:";
        class77.field1266 = "Schließen";
        class179.field2921 = ": ";
        class57.field946 = "RuneScape wird geladen - bitte warten...";
        class279.field4473 = "Hierhin gehen";
        class6.field60 = "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.";
        class286.field4569 = "blaugrün:";
        class211.field3347 = "Wähl eine Option";
        class136.field2157 = "Nehmen";
        class236.field3799 = "Verbindung mit Update-Server...";
        class81.field1344 = "Lade Sprites - ";
        class53.field891 = "Lade Texturen - ";
        class234.field3775 = "Starte 3D-Softwarebibliothek.";
        class100.field1615 = "gleiten:";
        class173.field2818 = "welle2:";
        class237.field3807 = "blinken3:";
        class53.field897 = "Lade Benutzeroberfläche - ";
        class303.field4838 = "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.";
        class100.field1625 = "Benutzen";
        class55.field916 = "welle:";
        class88.field1440 = "Speicher wird zugewiesen.";
        class229.field3709 = " steht bereits auf deiner Ignorieren-Liste!";
        class255.field4121 = "schütteln:";
        class121.field1935 = "lila:";
        class77.field1286 = "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!";
        class82.field1365 = "Konfig geladen.";
        class206.field3281 = "Spielwelt erstellt.";
        class85.field1404 = "Suche nach Updates - ";
        class209.field3318 = "Lade...";
        class314.field5007 = "Hierhin drehen";
        class238.field3816 = "Fertigkeit: ";
        class29.field359 = "Standardeinstellungen geladen";
        class11.field108 = "Gegenstand für Mitglieder";
        class159.field2531 = "weiss:";
        class212.field3512 = "Lade Standardeinstellungen - ";
        class277.field4447 = "Wordpack geladen.";
        class270.field4351 = "Spieler kann nicht gefunden werden: ";
        class68.field1124 = "Lade Konfiguration - ";
        class69.field1148 = "Okay";
        class22.field285 = " loggt sich aus.";
        class117.field1890 = "Mechscape wird geladen - bitte warten...";
        class62.field1021 = "Lade Wordpack - ";
        class291.field4676 = "M";
        class239.field3825 = "Abbrechen";
        class229.field3694 = "scrollen:";
        class168.field2731 = "Verbindung zum Update-Server hergestellt.";
        class173.field2829 = "M";
        class88.field1444 = "T";
        class196.field3176 = " weitere Optionen";
        field4436++;
        class61.field1001 = "Verbindung abgebrochen.";
        class271.field4357 = "Lade Schriftsätze - ";
        class262.field4212 = "Stufe: ";
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(III)J")
    public static final long method1861(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        return var3 == null || var3.field2352 == null ? 0L : var3.field2352.field3313;
    }
}
