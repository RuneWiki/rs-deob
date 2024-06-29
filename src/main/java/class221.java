import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class221 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lsb;")
    public static class98 field3806 = class47.method368("l", 0);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lsb;")
    private static class98 field3812 = class47.method368("Take", 0);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lsb;")
    private static class98 field3807 = class47.method368("glow2:", 0);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lsb;")
    public static class98 field3814 = field3812;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lsb;")
    private static class98 field3811 = field3807;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lsb;")
    public static class98 field3805 = field3807;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public static int[] field3816 = new int[100];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
    public static final void method1525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3815++;
        if (class108.field1932 == 1) {
            class203.field3462[class51.field836 / 100].method618(class228.field3923 - 8, class82.field1449 + -8);
        }
        if (class108.field1932 == 2) {
            class203.field3462[class51.field836 / 100 + 4].method618(class228.field3923 - 8, class82.field1449 + -8);
        }
        class158.method1140(21332);
        if (arg4 != 100) {
            field3810 = 113;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrf;II)V")
    public static final void method1526(class28 arg0, int arg1, int arg2) {
        field3808++;
        Object[] var3 = arg0.field514;
        int var4 = (Integer) var3[0];
        class180 var5 = class115.method865((byte) -8, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class67.field1064 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3108;
        int[] var10 = var5.field3095;
        byte var11 = -1;
        try {
            class95.field1645 = new int[var5.field3099];
            class80.field1419 = new class98[var5.field3096];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field525;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field516;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field517 == null ? -1 : arg0.field517.field2728;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field532;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field517 == null ? -1 : arg0.field517.field2651;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field526 == null ? -1 : arg0.field526.field2728;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field526 == null ? -1 : arg0.field526.field2651;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field519;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field518;
                    }
                    class95.field1645[var12++] = var15;
                } else if (var3[var14] instanceof class98) {
                    class98 var16 = (class98) var3[var14];
                    if (var16.method748(true, class186.field3209)) {
                        var16 = arg0.field522;
                    }
                    class80.field1419[var13++] = var16;
                }
            }
            int var17 = 0;
            if (arg1 == 2) {
                label3390: while (true) {
                    var17++;
                    if (arg2 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var8++;
                    int var451 = var10[var8];
                    if (var451 < 100) {
                        if (var451 == 0) {
                            class64.field1047[var6++] = var9[var8];
                            continue;
                        }
                        if (var451 == 1) {
                            int var18 = var9[var8];
                            class64.field1047[var6++] = class118.field2117[var18];
                            continue;
                        }
                        if (var451 == 2) {
                            int var19 = var9[var8];
                            var6--;
                            class12.method105(var19, class64.field1047[var6], -100);
                            continue;
                        }
                        if (var451 == 3) {
                            class25.field486[var7++] = var5.field3094[var8];
                            continue;
                        }
                        if (var451 == 6) {
                            var8 += var9[var8];
                            continue;
                        }
                        if (var451 == 7) {
                            var6 -= 2;
                            if (class64.field1047[var6 + 1] != class64.field1047[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var451 == 8) {
                            var6 -= 2;
                            if (class64.field1047[var6 + 1] == class64.field1047[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var451 == 9) {
                            var6 -= 2;
                            if (class64.field1047[var6 + 1] > class64.field1047[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var451 == 10) {
                            var6 -= 2;
                            if (class64.field1047[var6] > class64.field1047[var6 + 1]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var451 == 21) {
                            if (class67.field1064 == 0) {
                                return;
                            }
                            class214 var20 = class192.field3320[--class67.field1064];
                            var5 = var20.field3644;
                            var10 = var5.field3095;
                            var9 = var5.field3108;
                            class80.field1419 = var20.field3651;
                            class95.field1645 = var20.field3643;
                            var8 = var20.field3645;
                            continue;
                        }
                        if (var451 == 25) {
                            int var21 = var9[var8];
                            class64.field1047[var6++] = class105.method807(var21, 128);
                            continue;
                        }
                        if (var451 == 27) {
                            int var22 = var9[var8];
                            var6--;
                            class84.method633(var22, 0, class64.field1047[var6]);
                            continue;
                        }
                        if (var451 == 31) {
                            var6 -= 2;
                            if (class64.field1047[var6 + 1] >= class64.field1047[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var451 == 32) {
                            var6 -= 2;
                            if (class64.field1047[var6] >= class64.field1047[var6 + 1]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var451 == 33) {
                            class64.field1047[var6++] = class95.field1645[var9[var8]];
                            continue;
                        }
                        int var10001;
                        if (var451 == 34) {
                            var10001 = var9[var8];
                            var6--;
                            class95.field1645[var10001] = class64.field1047[var6];
                            continue;
                        }
                        if (var451 == 35) {
                            class25.field486[var7++] = class80.field1419[var9[var8]];
                            continue;
                        }
                        if (var451 == 36) {
                            var10001 = var9[var8];
                            var7--;
                            class80.field1419[var10001] = class25.field486[var7];
                            continue;
                        }
                        if (var451 == 37) {
                            int var23 = var9[var8];
                            var7 -= var23;
                            class98 var24 = class14.method115(false, var23, var7, class25.field486);
                            class25.field486[var7++] = var24;
                            continue;
                        }
                        if (var451 == 38) {
                            var6--;
                            continue;
                        }
                        if (var451 == 39) {
                            var7--;
                            continue;
                        }
                        if (var451 == 40) {
                            int var25 = var9[var8];
                            class180 var26 = class115.method865((byte) -69, var25);
                            int[] var27 = new int[var26.field3099];
                            class98[] var28 = new class98[var26.field3096];
                            for (int var29 = 0; var29 < var26.field3098; var29++) {
                                var27[var29] = class64.field1047[var6 - (var26.field3098 - var29)];
                            }
                            for (int var30 = 0; var30 < var26.field3110; var30++) {
                                var28[var30] = class25.field486[var30 + var7 - var26.field3110];
                            }
                            var7 -= var26.field3110;
                            var6 -= var26.field3098;
                            class214 var31 = new class214();
                            var31.field3644 = var5;
                            var31.field3645 = var8;
                            var31.field3651 = class80.field1419;
                            var31.field3643 = class95.field1645;
                            if (class67.field1064 >= class192.field3320.length) {
                                throw new RuntimeException();
                            }
                            var8 = -1;
                            var5 = var26;
                            class192.field3320[class67.field1064++] = var31;
                            var10 = var26.field3095;
                            class80.field1419 = var28;
                            class95.field1645 = var27;
                            var9 = var26.field3108;
                            continue;
                        }
                        if (var451 == 42) {
                            class64.field1047[var6++] = class253.field4433[var9[var8]];
                            continue;
                        }
                        if (var451 == 43) {
                            int var32 = var9[var8];
                            var6--;
                            class253.field4433[var32] = class64.field1047[var6];
                            class261.method1788(1, var32);
                            continue;
                        }
                        if (var451 == 44) {
                            int var33 = var9[var8] & 0xFFFF;
                            var6--;
                            int var34 = class64.field1047[var6];
                            int var35 = var9[var8] >> 16;
                            if (var34 >= 0 && var34 <= 5000) {
                                class180.field3104[var35] = var34;
                                byte var36 = -1;
                                if (var33 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var34 <= var37) {
                                        continue label3390;
                                    }
                                    class225.field3883[var35][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var451 == 45) {
                            var6--;
                            int var38 = class64.field1047[var6];
                            int var39 = var9[var8];
                            if (var38 >= 0 && var38 < class180.field3104[var39]) {
                                class64.field1047[var6++] = class225.field3883[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var451 == 46) {
                            int var40 = var9[var8];
                            var6 -= 2;
                            int var41 = class64.field1047[var6];
                            if (var41 >= 0 && var41 < class180.field3104[var40]) {
                                class225.field3883[var40][var41] = class64.field1047[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var451 == 47) {
                            class98 var42 = class97.field1670[var9[var8]];
                            if (var42 == null) {
                                var42 = class45.field751;
                            }
                            class25.field486[var7++] = var42;
                            continue;
                        }
                        if (var451 == 48) {
                            int var43 = var9[var8];
                            var7--;
                            class97.field1670[var43] = class25.field486[var7];
                            class122.method913(var43, -5762);
                            continue;
                        }
                        if (var451 == 51) {
                            class219 var44 = var5.field3105[var9[var8]];
                            var6--;
                            class224 var45 = (class224) var44.method1511((byte) -127, (long) class64.field1047[var6]);
                            if (var45 != null) {
                                var8 += var45.field3858;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var9[var8] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var451 < 300) {
                        if (var451 == 100) {
                            var6 -= 3;
                            int var429 = class64.field1047[var6];
                            int var430 = class64.field1047[var6 + 2];
                            int var431 = class64.field1047[var6 + 1];
                            if (var431 == 0) {
                                throw new RuntimeException();
                            }
                            class148 var432 = class62.method455(-854073200, var429);
                            if (var432.field2751 == null) {
                                var432.field2751 = new class148[var430 + 1];
                            }
                            if (var432.field2751.length <= var430) {
                                class148[] var433 = new class148[var430 + 1];
                                for (int var434 = 0; var434 < var432.field2751.length; var434++) {
                                    var433[var434] = var432.field2751[var434];
                                }
                                var432.field2751 = var433;
                            }
                            if (var430 > 0 && var432.field2751[var430 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var430 - 1));
                            }
                            class148 var435 = new class148();
                            var435.field2619 = true;
                            var435.field2665 = var431;
                            var435.field2650 = var435.field2728 = var432.field2728;
                            var435.field2651 = var430;
                            var432.field2751[var430] = var435;
                            if (var46) {
                                class119.field2138 = var435;
                            } else {
                                class14.field266 = var435;
                            }
                            class72.method512(var432, 2);
                            continue;
                        }
                        if (var451 == 101) {
                            class148 var436 = var46 ? class119.field2138 : class14.field266;
                            if (var436.field2651 == -1) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class148 var437 = class62.method455(-854073200, var436.field2728);
                            var437.field2751[var436.field2651] = null;
                            class72.method512(var437, 2);
                            continue;
                        }
                        if (var451 == 102) {
                            var6--;
                            class148 var438 = class62.method455(-854073200, class64.field1047[var6]);
                            var438.field2751 = null;
                            class72.method512(var438, 2);
                            continue;
                        }
                        if (var451 == 200) {
                            var6 -= 2;
                            int var439 = class64.field1047[var6];
                            int var440 = class64.field1047[var6 + 1];
                            class148 var441 = class157.method1138(var439, (byte) -98, var440);
                            if (var441 != null && var440 != -1) {
                                class64.field1047[var6++] = 1;
                                if (var46) {
                                    class119.field2138 = var441;
                                } else {
                                    class14.field266 = var441;
                                }
                                continue;
                            }
                            class64.field1047[var6++] = 0;
                            continue;
                        }
                        if (var451 == 201) {
                            var6--;
                            int var442 = class64.field1047[var6];
                            class148 var443 = class62.method455(arg1 - 854073202, var442);
                            if (var443 == null) {
                                class64.field1047[var6++] = 0;
                            } else {
                                class64.field1047[var6++] = 1;
                                if (var46) {
                                    class119.field2138 = var443;
                                } else {
                                    class14.field266 = var443;
                                }
                            }
                            continue;
                        }
                    } else if (var451 < 500) {
                        if (var451 == 403) {
                            var6 -= 2;
                            int var424 = class64.field1047[var6 + 1];
                            int var425 = class64.field1047[var6];
                            if (var425 >= 7) {
                                var425 -= 7;
                            }
                            class163.field2943.field3338.method649((byte) -127, var424, var425);
                            continue;
                        }
                        if (var451 == 404) {
                            var6 -= 2;
                            int var426 = class64.field1047[var6];
                            int var427 = class64.field1047[var6 + 1];
                            class163.field2943.field3338.method650(var427, var426, 2);
                            continue;
                        }
                        if (var451 == 410) {
                            var6--;
                            boolean var428 = class64.field1047[var6] != 0;
                            class163.field2943.field3338.method654(false, var428);
                            continue;
                        }
                    } else if (!(var451 < 1000 || var451 >= 1100) || !(var451 < 2000 || var451 >= 2100)) {
                        class148 var47;
                        if (var451 < 2000) {
                            var47 = var46 ? class119.field2138 : class14.field266;
                        } else {
                            var6--;
                            var47 = class62.method455(-854073200, class64.field1047[var6]);
                            var451 -= 1000;
                        }
                        if (var451 == 1000) {
                            var6 -= 4;
                            var47.field2742 = class64.field1047[var6];
                            var47.field2634 = class64.field1047[var6 + 1];
                            int var48 = class64.field1047[var6 + 3];
                            int var49 = class64.field1047[var6 + 2];
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
                            var47.field2720 = (byte) var49;
                            var47.field2642 = (byte) var48;
                            class72.method512(var47, 2);
                            class224.method1545(var47, (byte) -68);
                            continue;
                        }
                        if (var451 == 1001) {
                            var6 -= 4;
                            var47.field2669 = class64.field1047[var6];
                            var47.field2597 = class64.field1047[var6 + 1];
                            var47.field2614 = 0;
                            var47.field2681 = 0;
                            int var50 = class64.field1047[var6 + 3];
                            int var51 = class64.field1047[var6 + 2];
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 4) {
                                var51 = 4;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 4) {
                                var50 = 4;
                            }
                            var47.field2609 = (byte) var51;
                            var47.field2673 = (byte) var50;
                            class72.method512(var47, 2);
                            class224.method1545(var47, (byte) -68);
                            if (var47.field2665 == 0) {
                                class120.method902(var47, false, (byte) 59);
                            }
                            continue;
                        }
                        if (var451 == 1003) {
                            var6--;
                            boolean var52 = class64.field1047[var6] == 1;
                            if (var47.field2620 != var52) {
                                var47.field2620 = var52;
                                class72.method512(var47, 2);
                            }
                            continue;
                        }
                        if (var451 == 1004) {
                            var6 -= 2;
                            var47.field2675 = class64.field1047[var6];
                            var47.field2747 = class64.field1047[var6 + 1];
                            class72.method512(var47, 2);
                            class224.method1545(var47, (byte) -68);
                            if (var47.field2665 == 0) {
                                class120.method902(var47, false, (byte) 59);
                            }
                            continue;
                        }
                    } else if (var451 >= 1100 && var451 < 1200 || var451 >= 2100 && var451 < 2200) {
                        class148 var53;
                        if (var451 < 2000) {
                            var53 = var46 ? class119.field2138 : class14.field266;
                        } else {
                            var6--;
                            var53 = class62.method455(-854073200, class64.field1047[var6]);
                            var451 -= 1000;
                        }
                        if (var451 == 1100) {
                            var6 -= 2;
                            var53.field2649 = class64.field1047[var6];
                            if (var53.field2590 - var53.field2694 < var53.field2649) {
                                var53.field2649 = var53.field2590 - var53.field2694;
                            }
                            if (var53.field2649 < 0) {
                                var53.field2649 = 0;
                            }
                            var53.field2615 = class64.field1047[var6 + 1];
                            if (var53.field2615 > (var53.field2644 - var53.field2647)) {
                                var53.field2615 = var53.field2644 - var53.field2647;
                            }
                            if (var53.field2615 < 0) {
                                var53.field2615 = 0;
                            }
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1101) {
                            var6--;
                            var53.field2736 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1102) {
                            var6--;
                            var53.field2708 = class64.field1047[var6] == 1;
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1103) {
                            var6--;
                            var53.field2613 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1104) {
                            var6--;
                            var53.field2667 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1105) {
                            var6--;
                            var53.field2636 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1106) {
                            var6--;
                            var53.field2611 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1107) {
                            var6--;
                            var53.field2606 = class64.field1047[var6] == 1;
                            class72.method512(var53, arg1);
                            continue;
                        }
                        if (var451 == 1108) {
                            var53.field2724 = 1;
                            var6--;
                            var53.field2661 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1109) {
                            var6 -= 6;
                            var53.field2699 = class64.field1047[var6];
                            var53.field2607 = class64.field1047[var6 + 1];
                            var53.field2608 = class64.field1047[var6 + 2];
                            var53.field2631 = class64.field1047[var6 + 3];
                            var53.field2656 = class64.field1047[var6 + 4];
                            var53.field2646 = class64.field1047[var6 + 5];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1110) {
                            var6--;
                            int var54 = class64.field1047[var6];
                            if (var53.field2629 != var54) {
                                var53.field2679 = 0;
                                var53.field2629 = var54;
                                var53.field2633 = 0;
                                class72.method512(var53, 2);
                            }
                            continue;
                        }
                        if (var451 == 1111) {
                            var6--;
                            var53.field2712 = class64.field1047[var6] == 1;
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1112) {
                            var7--;
                            class98 var55 = class25.field486[var7];
                            if (!var55.method748(true, var53.field2591)) {
                                var53.field2591 = var55;
                                class72.method512(var53, 2);
                            }
                            continue;
                        }
                        if (var451 == 1113) {
                            var6--;
                            var53.field2731 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1114) {
                            var6 -= 3;
                            var53.field2595 = class64.field1047[var6];
                            var53.field2702 = class64.field1047[var6 + 1];
                            var53.field2722 = class64.field1047[var6 + 2];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1115) {
                            var6--;
                            var53.field2711 = class64.field1047[var6] == 1;
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1116) {
                            var6--;
                            var53.field2738 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1117) {
                            var6--;
                            var53.field2641 = class64.field1047[var6];
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1118) {
                            var6--;
                            var53.field2592 = class64.field1047[var6] == 1;
                            class72.method512(var53, arg1);
                            continue;
                        }
                        if (var451 == 1119) {
                            var6--;
                            var53.field2715 = class64.field1047[var6] == 1;
                            class72.method512(var53, 2);
                            continue;
                        }
                        if (var451 == 1120) {
                            var6 -= 2;
                            var53.field2590 = class64.field1047[var6];
                            var53.field2644 = class64.field1047[var6 + 1];
                            class72.method512(var53, 2);
                            if (var53.field2665 == 0) {
                                class120.method902(var53, false, (byte) 59);
                            }
                            continue;
                        }
                        if (var451 == 1121) {
                            class72.method512(var53, 2);
                            var6 -= 2;
                            continue;
                        }
                        if (var451 == 1122) {
                            var6--;
                            var53.field2721 = class64.field1047[var6] == 1;
                            class72.method512(var53, arg1);
                            continue;
                        }
                    } else if (!(var451 < 1200 || var451 >= 1300) || !(var451 < 2200 || var451 >= 2300)) {
                        class148 var56;
                        if (var451 < 2000) {
                            var56 = var46 ? class119.field2138 : class14.field266;
                        } else {
                            var6--;
                            var56 = class62.method455(-854073200, class64.field1047[var6]);
                            var451 -= 1000;
                        }
                        class72.method512(var56, 2);
                        if (var451 == 1200 || var451 == 1205) {
                            var6 -= 2;
                            int var57 = class64.field1047[var6];
                            int var58 = class64.field1047[var6 + 1];
                            if (var57 == -1) {
                                var56.field2661 = -1;
                                var56.field2654 = -1;
                                var56.field2724 = 1;
                            } else {
                                var56.field2658 = var58;
                                var56.field2654 = var57;
                                class245 var59 = class235.method1605(-73, var57);
                                var56.field2699 = var59.field4330;
                                var56.field2631 = var59.field4307;
                                if (var451 == 1205) {
                                    var56.field2735 = false;
                                } else {
                                    var56.field2735 = true;
                                }
                                var56.field2608 = var59.field4321;
                                var56.field2646 = var59.field4277;
                                if (var56.field2681 > 0) {
                                    var56.field2646 = var56.field2646 * 32 / var56.field2681;
                                } else if (var56.field2669 > 0) {
                                    var56.field2646 = var56.field2646 * 32 / var56.field2669;
                                }
                                var56.field2656 = var59.field4310;
                                var56.field2607 = var59.field4314;
                            }
                            continue;
                        }
                        if (var451 == 1201) {
                            var56.field2724 = 2;
                            var6--;
                            var56.field2661 = class64.field1047[var6];
                            continue;
                        }
                        if (var451 == 1202) {
                            var56.field2724 = 3;
                            var56.field2661 = class163.field2943.field3338.method652(true);
                            continue;
                        }
                        if (var451 == 1203) {
                            var56.field2724 = 6;
                            var6--;
                            var56.field2661 = class64.field1047[var6];
                            continue;
                        }
                        if (var451 == 1204) {
                            var56.field2724 = 5;
                            var6--;
                            var56.field2661 = class64.field1047[var6];
                            continue;
                        }
                    } else if ((var451 < 1300 || var451 >= 1400) && (var451 < 2300 || var451 >= 2400)) {
                        if (var451 >= 1400 && var451 < 1500 || var451 >= 2400 && var451 < 2500) {
                            class148 var64;
                            if (var451 < 2000) {
                                var64 = var46 ? class119.field2138 : class14.field266;
                            } else {
                                var6--;
                                var64 = class62.method455(-854073200, class64.field1047[var6]);
                                var451 -= 1000;
                            }
                            var7--;
                            class98 var65 = class25.field486[var7];
                            int[] var66 = null;
                            if (var65.method724((byte) 25) > 0 && var65.method730(var65.method724((byte) 25) - 1, -26815) == 89) {
                                var6--;
                                int var67 = class64.field1047[var6];
                                if (var67 > 0) {
                                    var66 = new int[var67];
                                    while ((var67--) > 0) {
                                        var6--;
                                        var66[var67] = class64.field1047[var6];
                                    }
                                }
                                var65 = var65.method742(arg1 - 72, 0, var65.method724((byte) 25) - 1);
                            }
                            Object[] var68 = new Object[var65.method724((byte) 25) + 1];
                            for (int var69 = var68.length - 1; var69 >= 1; var69--) {
                                if (var65.method730(var69 - 1, -26815) == 115) {
                                    var7--;
                                    var68[var69] = class25.field486[var7];
                                } else {
                                    var6--;
                                    var68[var69] = Integer.valueOf(class64.field1047[var6]);
                                }
                            }
                            var6--;
                            int var70 = class64.field1047[var6];
                            if (var70 == -1) {
                                var68 = null;
                            } else {
                                var68[0] = Integer.valueOf(var70);
                            }
                            if (var451 == 1400) {
                                var64.field2709 = var68;
                            } else if (var451 == 1401) {
                                var64.field2630 = var68;
                            } else if (var451 == 1402) {
                                var64.field2600 = var68;
                            } else if (var451 == 1403) {
                                var64.field2701 = var68;
                            } else if (var451 == 1404) {
                                var64.field2660 = var68;
                            } else if (var451 == 1405) {
                                var64.field2698 = var68;
                            } else if (var451 == 1406) {
                                var64.field2750 = var68;
                            } else if (var451 == 1407) {
                                var64.field2704 = var68;
                                var64.field2589 = var66;
                            } else if (var451 == 1408) {
                                var64.field2672 = var68;
                            } else if (var451 == 1409) {
                                var64.field2626 = var68;
                            } else if (var451 == 1410) {
                                var64.field2635 = var68;
                            } else if (var451 == 1411) {
                                var64.field2710 = var68;
                            } else if (var451 == 1412) {
                                var64.field2603 = var68;
                            } else if (var451 == 1414) {
                                var64.field2628 = var68;
                                var64.field2680 = var66;
                            } else if (var451 == 1415) {
                                var64.field2640 = var66;
                                var64.field2744 = var68;
                            } else if (var451 == 1416) {
                                var64.field2625 = var68;
                            } else if (var451 == 1417) {
                                var64.field2594 = var68;
                            } else if (var451 == 1418) {
                                var64.field2657 = var68;
                            } else if (var451 == 1419) {
                                var64.field2719 = var68;
                            } else if (var451 == 1420) {
                                var64.field2700 = var68;
                            } else if (var451 == 1421) {
                                var64.field2734 = var68;
                            } else if (var451 == 1422) {
                                var64.field2648 = var68;
                            } else if (var451 == 1423) {
                                var64.field2718 = var68;
                            } else if (var451 == 1424) {
                                var64.field2662 = var68;
                            } else if (var451 == 1425) {
                                var64.field2674 = var68;
                            } else if (var451 == 1426) {
                                var64.field2616 = var68;
                            } else if (var451 == 1427) {
                                var64.field2602 = var68;
                            } else if (var451 == 1428) {
                                var64.field2692 = var68;
                                var64.field2705 = var66;
                            } else if (var451 == 1429) {
                                var64.field2696 = var66;
                                var64.field2666 = var68;
                            }
                            var64.field2639 = true;
                            continue;
                        }
                        if (var451 < 1600) {
                            class148 var71 = var46 ? class119.field2138 : class14.field266;
                            if (var451 == 1500) {
                                class64.field1047[var6++] = var71.field2598;
                                continue;
                            }
                            if (var451 == 1501) {
                                class64.field1047[var6++] = var71.field2677;
                                continue;
                            }
                            if (var451 == 1502) {
                                class64.field1047[var6++] = var71.field2694;
                                continue;
                            }
                            if (var451 == 1503) {
                                class64.field1047[var6++] = var71.field2647;
                                continue;
                            }
                            if (var451 == 1504) {
                                class64.field1047[var6++] = var71.field2620 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 1505) {
                                class64.field1047[var6++] = var71.field2650;
                                continue;
                            }
                        } else if (var451 < 1700) {
                            class148 var423 = var46 ? class119.field2138 : class14.field266;
                            if (var451 == 1600) {
                                class64.field1047[var6++] = var423.field2649;
                                continue;
                            }
                            if (var451 == 1601) {
                                class64.field1047[var6++] = var423.field2615;
                                continue;
                            }
                            if (var451 == 1602) {
                                class25.field486[var7++] = var423.field2591;
                                continue;
                            }
                            if (var451 == 1603) {
                                class64.field1047[var6++] = var423.field2590;
                                continue;
                            }
                            if (var451 == 1604) {
                                class64.field1047[var6++] = var423.field2644;
                                continue;
                            }
                            if (var451 == 1605) {
                                class64.field1047[var6++] = var423.field2646;
                                continue;
                            }
                            if (var451 == 1606) {
                                class64.field1047[var6++] = var423.field2608;
                                continue;
                            }
                            if (var451 == 1607) {
                                class64.field1047[var6++] = var423.field2656;
                                continue;
                            }
                            if (var451 == 1608) {
                                class64.field1047[var6++] = var423.field2631;
                                continue;
                            }
                            if (var451 == 1609) {
                                class64.field1047[var6++] = var423.field2613;
                                continue;
                            }
                        } else if (var451 < 1800) {
                            class148 var422 = var46 ? class119.field2138 : class14.field266;
                            if (var451 == 1700) {
                                class64.field1047[var6++] = var422.field2654;
                                continue;
                            }
                            if (var451 == 1701) {
                                if (var422.field2654 == -1) {
                                    class64.field1047[var6++] = 0;
                                } else {
                                    class64.field1047[var6++] = var422.field2658;
                                }
                                continue;
                            }
                            if (var451 == 1702) {
                                class64.field1047[var6++] = var422.field2651;
                                continue;
                            }
                        } else if (var451 < 1900) {
                            class148 var72 = var46 ? class119.field2138 : class14.field266;
                            if (var451 == 1800) {
                                class64.field1047[var6++] = class148.method1091((byte) -108, client.method761(var72));
                                continue;
                            }
                            if (var451 == 1801) {
                                var6--;
                                int var73 = class64.field1047[var6];
                                int var452 = var73 - 1;
                                if (var72.field2727 != null && var452 < var72.field2727.length && var72.field2727[var452] != null) {
                                    class25.field486[var7++] = var72.field2727[var452];
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 1802) {
                                if (var72.field2687 == null) {
                                    class25.field486[var7++] = class70.field1120;
                                } else {
                                    class25.field486[var7++] = var72.field2687;
                                }
                                continue;
                            }
                        } else if (var451 < 2600) {
                            var6--;
                            class148 var421 = class62.method455(-854073200, class64.field1047[var6]);
                            if (var451 == 2500) {
                                class64.field1047[var6++] = var421.field2598;
                                continue;
                            }
                            if (var451 == 2501) {
                                class64.field1047[var6++] = var421.field2677;
                                continue;
                            }
                            if (var451 == 2502) {
                                class64.field1047[var6++] = var421.field2694;
                                continue;
                            }
                            if (var451 == 2503) {
                                class64.field1047[var6++] = var421.field2647;
                                continue;
                            }
                            if (var451 == 2504) {
                                class64.field1047[var6++] = var421.field2620 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 2505) {
                                class64.field1047[var6++] = var421.field2650;
                                continue;
                            }
                        } else if (var451 < 2700) {
                            var6--;
                            class148 var74 = class62.method455(-854073200, class64.field1047[var6]);
                            if (var451 == 2600) {
                                class64.field1047[var6++] = var74.field2649;
                                continue;
                            }
                            if (var451 == 2601) {
                                class64.field1047[var6++] = var74.field2615;
                                continue;
                            }
                            if (var451 == 2602) {
                                class25.field486[var7++] = var74.field2591;
                                continue;
                            }
                            if (var451 == 2603) {
                                class64.field1047[var6++] = var74.field2590;
                                continue;
                            }
                            if (var451 == 2604) {
                                class64.field1047[var6++] = var74.field2644;
                                continue;
                            }
                            if (var451 == 2605) {
                                class64.field1047[var6++] = var74.field2646;
                                continue;
                            }
                            if (var451 == 2606) {
                                class64.field1047[var6++] = var74.field2608;
                                continue;
                            }
                            if (var451 == 2607) {
                                class64.field1047[var6++] = var74.field2656;
                                continue;
                            }
                            if (var451 == 2608) {
                                class64.field1047[var6++] = var74.field2631;
                                continue;
                            }
                            if (var451 == 2609) {
                                class64.field1047[var6++] = var74.field2613;
                                continue;
                            }
                        } else if (var451 < 2800) {
                            if (var451 == 2700) {
                                var6--;
                                class148 var75 = class62.method455(-854073200, class64.field1047[var6]);
                                class64.field1047[var6++] = var75.field2654;
                                continue;
                            }
                            if (var451 == 2701) {
                                var6--;
                                class148 var76 = class62.method455(-854073200, class64.field1047[var6]);
                                if (var76.field2654 == -1) {
                                    class64.field1047[var6++] = 0;
                                } else {
                                    class64.field1047[var6++] = var76.field2658;
                                }
                                continue;
                            }
                            if (var451 == 2702) {
                                var6--;
                                int var77 = class64.field1047[var6];
                                class34 var78 = (class34) class243.field4209.method1511((byte) -122, (long) var77);
                                if (var78 == null) {
                                    class64.field1047[var6++] = 0;
                                } else {
                                    class64.field1047[var6++] = 1;
                                }
                                continue;
                            }
                            if (var451 == 2703) {
                                var6--;
                                class148 var79 = class62.method455(-854073200, class64.field1047[var6]);
                                if (var79.field2751 == null) {
                                    class64.field1047[var6++] = 0;
                                    continue;
                                }
                                int var80 = var79.field2751.length;
                                for (int var81 = 0; var81 < var79.field2751.length; var81++) {
                                    if (var79.field2751[var81] == null) {
                                        var80 = var81;
                                        break;
                                    }
                                }
                                class64.field1047[var6++] = var80;
                                continue;
                            }
                            if (var451 == 2704 || var451 == 2705) {
                                var6 -= 2;
                                int var82 = class64.field1047[var6 + 1];
                                int var83 = class64.field1047[var6];
                                class34 var84 = (class34) class243.field4209.method1511((byte) -124, (long) var83);
                                if (var84 != null && var84.field596 == var82) {
                                    class64.field1047[var6++] = 1;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                        } else if (var451 < 2900) {
                            var6--;
                            class148 var85 = class62.method455(-854073200, class64.field1047[var6]);
                            if (var451 == 2800) {
                                class64.field1047[var6++] = class148.method1091((byte) 65, client.method761(var85));
                                continue;
                            }
                            if (var451 == 2801) {
                                var6--;
                                int var86 = class64.field1047[var6];
                                int var453 = var86 - 1;
                                if (var85.field2727 != null && var85.field2727.length > var453 && var85.field2727[var453] != null) {
                                    class25.field486[var7++] = var85.field2727[var453];
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 2802) {
                                if (var85.field2687 == null) {
                                    class25.field486[var7++] = class70.field1120;
                                } else {
                                    class25.field486[var7++] = var85.field2687;
                                }
                                continue;
                            }
                        } else if (var451 < 3200) {
                            if (var451 == 3100) {
                                var7--;
                                class98 var87 = class25.field486[var7];
                                class176.method1228(class70.field1120, var87, (byte) -49, 0);
                                continue;
                            }
                            if (var451 == 3101) {
                                var6 -= 2;
                                class137.method1031(class64.field1047[var6], 7, class163.field2943, class64.field1047[var6 + 1]);
                                continue;
                            }
                            if (var451 == 3103) {
                                class250.method1736((byte) 7);
                                continue;
                            }
                            if (var451 == 3104) {
                                class68.field1084++;
                                var7--;
                                class98 var88 = class25.field486[var7];
                                int var89 = 0;
                                if (var88.method700(-5422)) {
                                    var89 = var88.method733(-31805);
                                }
                                class237.field4084.method490(253, -84);
                                class237.field4084.method1456(var89, -23438);
                                continue;
                            }
                            if (var451 == 3105) {
                                class147.field2588++;
                                var7--;
                                class98 var90 = class25.field486[var7];
                                class237.field4084.method490(96, -82);
                                class237.field4084.method1484(var90.method727((byte) 36), (byte) 38);
                                continue;
                            }
                            if (var451 == 3106) {
                                var7--;
                                class98 var91 = class25.field486[var7];
                                class237.field4084.method490(238, -70);
                                class263.field4622++;
                                class237.field4084.method1477(var91.method724((byte) 25) + 1, -26755);
                                class237.field4084.method1459(var91, (byte) 78);
                                continue;
                            }
                            if (var451 == 3107) {
                                var6--;
                                int var92 = class64.field1047[var6];
                                var7--;
                                class98 var93 = class25.field486[var7];
                                class216.method1486(var92, arg1 - 114, var93);
                                continue;
                            }
                            if (var451 == 3108) {
                                var6 -= 3;
                                int var94 = class64.field1047[var6 + 1];
                                int var95 = class64.field1047[var6];
                                int var96 = class64.field1047[var6 + 2];
                                class148 var97 = class62.method455(-854073200, var96);
                                class56.method411(0, var95, var97, var94);
                                continue;
                            }
                            if (var451 == 3109) {
                                var6 -= 2;
                                int var98 = class64.field1047[var6];
                                int var99 = class64.field1047[var6 + 1];
                                class148 var100 = var46 ? class119.field2138 : class14.field266;
                                class56.method411(0, var98, var100, var99);
                                continue;
                            }
                            if (var451 == 3110) {
                                var6--;
                                int var101 = class64.field1047[var6];
                                class112.field1986++;
                                class237.field4084.method490(215, -104);
                                class237.field4084.method1470((byte) -122, var101);
                                continue;
                            }
                        } else if (var451 < 3300) {
                            if (var451 == 3200) {
                                var6 -= 3;
                                class131.method990(5064, class64.field1047[var6], class64.field1047[var6 + 2], class64.field1047[var6 + 1]);
                                continue;
                            }
                            if (var451 == 3201) {
                                var6--;
                                class186.method1283(77, class64.field1047[var6]);
                                continue;
                            }
                            if (var451 == 3202) {
                                var6 -= 2;
                                class8.method52(class64.field1047[var6], arg1 ^ 0xFFFFFFFD, class64.field1047[var6 + 1]);
                                continue;
                            }
                        } else if (var451 < 3400) {
                            if (var451 == 3300) {
                                class64.field1047[var6++] = class236.field4071;
                                continue;
                            }
                            if (var451 == 3301) {
                                var6 -= 2;
                                int var102 = class64.field1047[var6];
                                int var103 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class200.method1364(var103, arg1 - 6548, var102);
                                continue;
                            }
                            if (var451 == 3302) {
                                var6 -= 2;
                                int var104 = class64.field1047[var6];
                                int var105 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class245.method1686(false, var104, var105);
                                continue;
                            }
                            if (var451 == 3303) {
                                var6 -= 2;
                                int var106 = class64.field1047[var6];
                                int var107 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class52.method392(var107, 0, var106);
                                continue;
                            }
                            if (var451 == 3304) {
                                var6--;
                                int var108 = class64.field1047[var6];
                                class64.field1047[var6++] = class216.method1490(var108, arg1 + 3).field2360;
                                continue;
                            }
                            if (var451 == 3305) {
                                var6--;
                                int var109 = class64.field1047[var6];
                                class64.field1047[var6++] = class222.field3817[var109];
                                continue;
                            }
                            if (var451 == 3306) {
                                var6--;
                                int var110 = class64.field1047[var6];
                                class64.field1047[var6++] = class167.field2980[var110];
                                continue;
                            }
                            if (var451 == 3307) {
                                var6--;
                                int var111 = class64.field1047[var6];
                                class64.field1047[var6++] = class23.field476[var111];
                                continue;
                            }
                            if (var451 == 3308) {
                                int var112 = class265.field4640;
                                int var113 = (class163.field2943.field4466 >> 7) + class182.field3143;
                                int var114 = (class163.field2943.field4492 >> 7) + class189.field3277;
                                class64.field1047[var6++] = (var114 << 14) + ((var112 << 28) + var113);
                                continue;
                            }
                            if (var451 == 3309) {
                                var6--;
                                int var115 = class64.field1047[var6];
                                class64.field1047[var6++] = class214.method1427(var115, 268425047) >> 14;
                                continue;
                            }
                            if (var451 == 3310) {
                                var6--;
                                int var116 = class64.field1047[var6];
                                class64.field1047[var6++] = var116 >> 28;
                                continue;
                            }
                            if (var451 == 3311) {
                                var6--;
                                int var117 = class64.field1047[var6];
                                class64.field1047[var6++] = class214.method1427(16383, var117);
                                continue;
                            }
                            if (var451 == 3312) {
                                class64.field1047[var6++] = class119.field2139 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3313) {
                                var6 -= 2;
                                int var118 = class64.field1047[var6 + 1];
                                int var119 = class64.field1047[var6] + 32768;
                                class64.field1047[var6++] = class200.method1364(var118, -6546, var119);
                                continue;
                            }
                            if (var451 == 3314) {
                                var6 -= 2;
                                int var120 = class64.field1047[var6] + 32768;
                                int var121 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class245.method1686(false, var120, var121);
                                continue;
                            }
                            if (var451 == 3315) {
                                var6 -= 2;
                                int var122 = class64.field1047[var6] + 32768;
                                int var123 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class52.method392(var123, arg1 - 2, var122);
                                continue;
                            }
                            if (var451 == 3316) {
                                if (class130.field2312 >= 2) {
                                    class64.field1047[var6++] = class130.field2312;
                                } else {
                                    class64.field1047[var6++] = 0;
                                }
                                continue;
                            }
                            if (var451 == 3317) {
                                class64.field1047[var6++] = class121.field2219;
                                continue;
                            }
                            if (var451 == 3318) {
                                class64.field1047[var6++] = class85.field1502;
                                continue;
                            }
                            if (var451 == 3321) {
                                class64.field1047[var6++] = class114.field2025;
                                continue;
                            }
                            if (var451 == 3322) {
                                class64.field1047[var6++] = class113.field2016;
                                continue;
                            }
                            if (var451 == 3323) {
                                if (class13.field245 >= 5 && class13.field245 <= 9) {
                                    class64.field1047[var6++] = 1;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3324) {
                                if (class13.field245 >= 5 && class13.field245 <= 9) {
                                    class64.field1047[var6++] = class13.field245;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3325) {
                                if (class55.field875 > 0) {
                                    class64.field1047[var6++] = 1;
                                } else {
                                    class64.field1047[var6++] = 0;
                                }
                                continue;
                            }
                            if (var451 == 3326) {
                                class64.field1047[var6++] = class163.field2943.field3324;
                                continue;
                            }
                            if (var451 == 3327) {
                                class64.field1047[var6++] = class163.field2943.field3338.field1531 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3328) {
                                class64.field1047[var6++] = class190.field3286;
                                continue;
                            }
                            if (var451 == 3329) {
                                class64.field1047[var6++] = class105.field1878;
                                continue;
                            }
                            if (var451 == 3330) {
                                var6--;
                                int var124 = class64.field1047[var6];
                                class64.field1047[var6++] = class60.method433(var124, true);
                                continue;
                            }
                            if (var451 == 3331) {
                                var6 -= 2;
                                int var125 = class64.field1047[var6];
                                int var126 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class70.method487(var126, false, (byte) 0, var125);
                                continue;
                            }
                            if (var451 == 3332) {
                                var6 -= 2;
                                int var127 = class64.field1047[var6];
                                int var128 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class70.method487(var128, true, (byte) 0, var127);
                                continue;
                            }
                            if (var451 == 3333) {
                                class64.field1047[var6++] = class205.field3511;
                                continue;
                            }
                        } else if (var451 < 3500) {
                            if (var451 == 3400) {
                                var6 -= 2;
                                int var406 = class64.field1047[var6 + 1];
                                int var407 = class64.field1047[var6];
                                class132 var408 = class80.method604(2, var407);
                                class25.field486[var7++] = var408.method996(var406, 48);
                                continue;
                            }
                            if (var451 == 3408) {
                                var6 -= 4;
                                int var409 = class64.field1047[var6 + 1];
                                int var410 = class64.field1047[var6];
                                int var411 = class64.field1047[var6 + 3];
                                int var412 = class64.field1047[var6 + 2];
                                class132 var413 = class80.method604(arg1, var412);
                                if (var413.field2350 == var410 && var413.field2342 == var409) {
                                    if (var409 == 115) {
                                        class25.field486[var7++] = var413.method996(var411, 48);
                                    } else {
                                        class64.field1047[var6++] = var413.method992(112, var411);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var451 == 3409) {
                                var6 -= 3;
                                int var414 = class64.field1047[var6 + 1];
                                int var415 = class64.field1047[var6];
                                int var416 = class64.field1047[var6 + 2];
                                class132 var417 = class80.method604(arg1, var414);
                                if (var417.field2342 != var415) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class64.field1047[var6++] = var417.method997(arg1 + 43, var416) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3410) {
                                var6--;
                                int var418 = class64.field1047[var6];
                                var7--;
                                class98 var419 = class25.field486[var7];
                                class132 var420 = class80.method604(arg1, var418);
                                if (var420.field2342 != 115) {
                                    throw new RuntimeException("C3410-1");
                                }
                                class64.field1047[var6++] = var420.method993(var419, -11472) ? 1 : 0;
                                continue;
                            }
                        } else if (var451 < 3700) {
                            if (var451 == 3600) {
                                if (class54.field864 == 0) {
                                    class64.field1047[var6++] = -2;
                                } else if (class54.field864 == 1) {
                                    class64.field1047[var6++] = -1;
                                } else {
                                    class64.field1047[var6++] = class99.field1751;
                                }
                                continue;
                            }
                            if (var451 == 3601) {
                                var6--;
                                int var129 = class64.field1047[var6];
                                if (class54.field864 == 2 && var129 < class99.field1751) {
                                    class25.field486[var7++] = class49.field817[var129];
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 3602) {
                                var6--;
                                int var130 = class64.field1047[var6];
                                if (class54.field864 == 2 && var130 < class99.field1751) {
                                    class64.field1047[var6++] = class158.field2875[var130];
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3603) {
                                var6--;
                                int var131 = class64.field1047[var6];
                                if (class54.field864 == 2 && var131 < class99.field1751) {
                                    class64.field1047[var6++] = class107.field1923[var131];
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3604) {
                                var7--;
                                class98 var132 = class25.field486[var7];
                                var6--;
                                int var133 = class64.field1047[var6];
                                class93.method686(arg1 ^ 0x2F, var133, var132);
                                continue;
                            }
                            if (var451 == 3605) {
                                var7--;
                                class98 var134 = class25.field486[var7];
                                class202.method1366(var134.method727((byte) 36), 0);
                                continue;
                            }
                            if (var451 == 3606) {
                                var7--;
                                class98 var135 = class25.field486[var7];
                                class203.method1377(-77, var135.method727((byte) 36));
                                continue;
                            }
                            if (var451 == 3607) {
                                var7--;
                                class98 var136 = class25.field486[var7];
                                class55.method403(var136.method727((byte) 36), 112);
                                continue;
                            }
                            if (var451 == 3608) {
                                var7--;
                                class98 var137 = class25.field486[var7];
                                class71.method494((byte) -25, var137.method727((byte) 36));
                                continue;
                            }
                            if (var451 == 3609) {
                                var7--;
                                class98 var138 = class25.field486[var7];
                                if (var138.method708(class25.field488, -77) || var138.method708(client.field1783, -112)) {
                                    var138 = var138.method740(7, true);
                                }
                                class64.field1047[var6++] = class141.method1055(true, var138) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3610) {
                                var6--;
                                int var139 = class64.field1047[var6];
                                if (class54.field864 == 2 && class99.field1751 > var139) {
                                    class25.field486[var7++] = class150.field2769[var139];
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 3611) {
                                if (class98.field1688 == null) {
                                    class25.field486[var7++] = class70.field1120;
                                } else {
                                    class25.field486[var7++] = class98.field1688.method726((byte) -100);
                                }
                                continue;
                            }
                            if (var451 == 3612) {
                                if (class98.field1688 == null) {
                                    class64.field1047[var6++] = 0;
                                } else {
                                    class64.field1047[var6++] = class202.field3443;
                                }
                                continue;
                            }
                            if (var451 == 3613) {
                                var6--;
                                int var140 = class64.field1047[var6];
                                if (class98.field1688 != null && class202.field3443 > var140) {
                                    class25.field486[var7++] = class155.field2826[var140].field1509.method726((byte) -100);
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 3614) {
                                var6--;
                                int var141 = class64.field1047[var6];
                                if (class98.field1688 != null && var141 < class202.field3443) {
                                    class64.field1047[var6++] = class155.field2826[var141].field1516;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3615) {
                                var6--;
                                int var142 = class64.field1047[var6];
                                if (class98.field1688 != null && class202.field3443 > var142) {
                                    class64.field1047[var6++] = class155.field2826[var142].field1511;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3616) {
                                class64.field1047[var6++] = class211.field3616;
                                continue;
                            }
                            if (var451 == 3617) {
                                var7--;
                                class98 var143 = class25.field486[var7];
                                class9.method93(117, var143);
                                continue;
                            }
                            if (var451 == 3618) {
                                class64.field1047[var6++] = class134.field2374;
                                continue;
                            }
                            if (var451 == 3619) {
                                var7--;
                                class98 var144 = class25.field486[var7];
                                class4.method19(var144.method727((byte) 36), (byte) 103);
                                continue;
                            }
                            if (var451 == 3620) {
                                class233.method1600((byte) 37);
                                continue;
                            }
                            if (var451 == 3621) {
                                if (class54.field864 == 0) {
                                    class64.field1047[var6++] = -1;
                                } else {
                                    class64.field1047[var6++] = class191.field3318;
                                }
                                continue;
                            }
                            if (var451 == 3622) {
                                var6--;
                                int var145 = class64.field1047[var6];
                                if (class54.field864 != 0 && var145 < class191.field3318) {
                                    class25.field486[var7++] = class106.method814(class228.field3926[var145], (byte) -128).method726((byte) -100);
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 3623) {
                                var7--;
                                class98 var146 = class25.field486[var7];
                                if (var146.method708(class25.field488, -119) || var146.method708(client.field1783, -125)) {
                                    var146 = var146.method740(7, true);
                                }
                                class64.field1047[var6++] = class227.method1572(var146, (byte) -64) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3624) {
                                var6--;
                                int var147 = class64.field1047[var6];
                                if (class155.field2826 != null && class202.field3443 > var147 && class155.field2826[var147].field1509.method731((byte) -17, class163.field2943.field3323)) {
                                    class64.field1047[var6++] = 1;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3625) {
                                if (class224.field3870 == null) {
                                    class25.field486[var7++] = class70.field1120;
                                } else {
                                    class25.field486[var7++] = class224.field3870.method726((byte) -100);
                                }
                                continue;
                            }
                            if (var451 == 3626) {
                                var6--;
                                int var148 = class64.field1047[var6];
                                if (class98.field1688 != null && var148 < class202.field3443) {
                                    class25.field486[var7++] = class155.field2826[var148].field1515;
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 3627) {
                                var6--;
                                int var149 = class64.field1047[var6];
                                if (class54.field864 == 2 && var149 >= 0 && class99.field1751 > var149) {
                                    class64.field1047[var6++] = class265.field4635[var149] ? 1 : 0;
                                    continue;
                                }
                                class64.field1047[var6++] = 0;
                                continue;
                            }
                            if (var451 == 3628) {
                                var7--;
                                class98 var150 = class25.field486[var7];
                                if (var150.method708(class25.field488, -109) || var150.method708(client.field1783, -120)) {
                                    var150 = var150.method740(7, true);
                                }
                                class64.field1047[var6++] = class101.method779(var150, -1);
                                continue;
                            }
                        } else if (var451 < 4000) {
                            if (var451 == 3903) {
                                var6--;
                                int var392 = class64.field1047[var6];
                                class64.field1047[var6++] = class148.field2663[var392].method363(8);
                                continue;
                            }
                            if (var451 == 3904) {
                                var6--;
                                int var393 = class64.field1047[var6];
                                class64.field1047[var6++] = class148.field2663[var393].field770;
                                continue;
                            }
                            if (var451 == 3905) {
                                var6--;
                                int var394 = class64.field1047[var6];
                                class64.field1047[var6++] = class148.field2663[var394].field780;
                                continue;
                            }
                            if (var451 == 3906) {
                                var6--;
                                int var395 = class64.field1047[var6];
                                class64.field1047[var6++] = class148.field2663[var395].field765;
                                continue;
                            }
                            if (var451 == 3907) {
                                var6--;
                                int var396 = class64.field1047[var6];
                                class64.field1047[var6++] = class148.field2663[var396].field779;
                                continue;
                            }
                            if (var451 == 3908) {
                                var6--;
                                int var397 = class64.field1047[var6];
                                class64.field1047[var6++] = class148.field2663[var397].field777;
                                continue;
                            }
                            if (var451 == 3910) {
                                var6--;
                                int var398 = class64.field1047[var6];
                                int var399 = class148.field2663[var398].method361((byte) -118);
                                class64.field1047[var6++] = var399 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3911) {
                                var6--;
                                int var400 = class64.field1047[var6];
                                int var401 = class148.field2663[var400].method361((byte) -91);
                                class64.field1047[var6++] = var401 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3912) {
                                var6--;
                                int var402 = class64.field1047[var6];
                                int var403 = class148.field2663[var402].method361((byte) -87);
                                class64.field1047[var6++] = var403 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 3913) {
                                var6--;
                                int var404 = class64.field1047[var6];
                                int var405 = class148.field2663[var404].method361((byte) -106);
                                class64.field1047[var6++] = var405 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var451 < 4100) {
                            if (var451 == 4000) {
                                var6 -= 2;
                                int var151 = class64.field1047[var6];
                                int var152 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var151 + var152;
                                continue;
                            }
                            if (var451 == 4001) {
                                var6 -= 2;
                                int var153 = class64.field1047[var6];
                                int var154 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var153 - var154;
                                continue;
                            }
                            if (var451 == 4002) {
                                var6 -= 2;
                                int var155 = class64.field1047[var6];
                                int var156 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var155 * var156;
                                continue;
                            }
                            if (var451 == 4003) {
                                var6 -= 2;
                                int var157 = class64.field1047[var6];
                                int var158 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var157 / var158;
                                continue;
                            }
                            if (var451 == 4004) {
                                var6--;
                                int var159 = class64.field1047[var6];
                                class64.field1047[var6++] = (int) (Math.random() * (double) var159);
                                continue;
                            }
                            if (var451 == 4005) {
                                var6--;
                                int var160 = class64.field1047[var6];
                                class64.field1047[var6++] = (int) (Math.random() * (double) (var160 + 1));
                                continue;
                            }
                            if (var451 == 4006) {
                                var6 -= 5;
                                int var161 = class64.field1047[var6];
                                int var162 = class64.field1047[var6 + 2];
                                int var163 = class64.field1047[var6 + 1];
                                int var164 = class64.field1047[var6 + 3];
                                int var165 = class64.field1047[var6 + 4];
                                class64.field1047[var6++] = (var165 - var162) * (var163 - var161) / (var164 - var162) + var161;
                                continue;
                            }
                            if (var451 == 4007) {
                                var6 -= 2;
                                long var166 = (long) class64.field1047[var6];
                                long var168 = (long) class64.field1047[var6 + 1];
                                class64.field1047[var6++] = (int) (var166 * var168 / 100L + var166);
                                continue;
                            }
                            if (var451 == 4008) {
                                var6 -= 2;
                                int var170 = class64.field1047[var6 + 1];
                                int var171 = class64.field1047[var6];
                                class64.field1047[var6++] = class67.method471(0x1 << var170, var171);
                                continue;
                            }
                            if (var451 == 4009) {
                                var6 -= 2;
                                int var172 = class64.field1047[var6];
                                int var173 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class214.method1427(-(0x1 << var173) - 1, var172);
                                continue;
                            }
                            if (var451 == 4010) {
                                var6 -= 2;
                                int var174 = class64.field1047[var6];
                                int var175 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class214.method1427(0x1 << var175, var174) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var451 == 4011) {
                                var6 -= 2;
                                int var176 = class64.field1047[var6];
                                int var177 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var176 % var177;
                                continue;
                            }
                            if (var451 == 4012) {
                                var6 -= 2;
                                int var178 = class64.field1047[var6];
                                int var179 = class64.field1047[var6 + 1];
                                if (var178 == 0) {
                                    class64.field1047[var6++] = 0;
                                } else {
                                    class64.field1047[var6++] = (int) Math.pow((double) var178, (double) var179);
                                }
                                continue;
                            }
                            if (var451 == 4013) {
                                var6 -= 2;
                                int var180 = class64.field1047[var6];
                                int var181 = class64.field1047[var6 + 1];
                                if (var180 == 0) {
                                    class64.field1047[var6++] = 0;
                                } else if (var181 == 0) {
                                    class64.field1047[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class64.field1047[var6++] = (int) Math.pow((double) var180, 1.0D / (double) var181);
                                }
                                continue;
                            }
                            if (var451 == 4014) {
                                var6 -= 2;
                                int var182 = class64.field1047[var6];
                                int var183 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = class214.method1427(var183, var182);
                                continue;
                            }
                            if (var451 == 4015) {
                                var6 -= 2;
                                int var184 = class64.field1047[var6 + 1];
                                int var185 = class64.field1047[var6];
                                class64.field1047[var6++] = class67.method471(var184, var185);
                                continue;
                            }
                            if (var451 == 4016) {
                                var6 -= 2;
                                int var186 = class64.field1047[var6 + 1];
                                int var187 = class64.field1047[var6];
                                class64.field1047[var6++] = var186 > var187 ? var187 : var186;
                                continue;
                            }
                            if (var451 == 4017) {
                                var6 -= 2;
                                int var188 = class64.field1047[var6];
                                int var189 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var189 < var188 ? var188 : var189;
                                continue;
                            }
                            if (var451 == 4018) {
                                var6 -= 3;
                                long var190 = (long) class64.field1047[var6];
                                long var192 = (long) class64.field1047[var6 + 1];
                                long var194 = (long) class64.field1047[var6 + 2];
                                class64.field1047[var6++] = (int) (var190 * var194 / var192);
                                continue;
                            }
                        } else if (var451 < 4200) {
                            if (var451 == 4100) {
                                var7--;
                                class98 var340 = class25.field486[var7];
                                var6--;
                                int var341 = class64.field1047[var6];
                                class25.field486[var7++] = class186.method1288(new class98[] { var340, class125.method930(25904, var341) }, 31618);
                                continue;
                            }
                            if (var451 == 4101) {
                                var7 -= 2;
                                class98 var342 = class25.field486[var7 + 1];
                                class98 var343 = class25.field486[var7];
                                class25.field486[var7++] = class186.method1288(new class98[] { var343, var342 }, arg1 + 31616);
                                continue;
                            }
                            if (var451 == 4102) {
                                var7--;
                                class98 var344 = class25.field486[var7];
                                var6--;
                                int var345 = class64.field1047[var6];
                                class25.field486[var7++] = class186.method1288(new class98[] { var344, method1530(var345, true, (byte) 32) }, class184.method1267(arg1, 31616));
                                continue;
                            }
                            if (var451 == 4103) {
                                var7--;
                                class98 var346 = class25.field486[var7];
                                class25.field486[var7++] = var346.method703((byte) -65);
                                continue;
                            }
                            if (var451 == 4104) {
                                var6--;
                                int var347 = class64.field1047[var6];
                                long var348 = ((long) var347 + 11745L) * 86400000L;
                                class23.field459.setTime(new Date(var348));
                                int var350 = class23.field459.get(5);
                                int var351 = class23.field459.get(2);
                                int var352 = class23.field459.get(1);
                                class25.field486[var7++] = class186.method1288(new class98[] { class125.method930(25904, var350), class234.field4032, class2.field24[var351], class234.field4032, class125.method930(25904, var352) }, 31618);
                                continue;
                            }
                            if (var451 == 4105) {
                                var7 -= 2;
                                class98 var353 = class25.field486[var7];
                                class98 var354 = class25.field486[var7 + 1];
                                if (class163.field2943.field3338 != null && class163.field2943.field3338.field1531) {
                                    class25.field486[var7++] = var354;
                                    continue;
                                }
                                class25.field486[var7++] = var353;
                                continue;
                            }
                            if (var451 == 4106) {
                                var6--;
                                int var355 = class64.field1047[var6];
                                class25.field486[var7++] = class125.method930(arg1 + 25902, var355);
                                continue;
                            }
                            if (var451 == 4107) {
                                var7 -= 2;
                                class64.field1047[var6++] = class25.field486[var7].method749((byte) 120, class25.field486[var7 + 1]);
                                continue;
                            }
                            if (var451 == 4108) {
                                var6 -= 2;
                                var7--;
                                class98 var356 = class25.field486[var7];
                                int var357 = class64.field1047[var6];
                                int var358 = class64.field1047[var6 + 1];
                                byte[] var359 = class162.field2928.method571(var358, 0, 121);
                                class77 var360 = new class77(var359);
                                var360.method536(class192.field3359, (int[]) null);
                                class64.field1047[var6++] = var360.method537(var356, var357);
                                continue;
                            }
                            if (var451 == 4109) {
                                var7--;
                                class98 var361 = class25.field486[var7];
                                var6 -= 2;
                                int var362 = class64.field1047[var6];
                                int var363 = class64.field1047[var6 + 1];
                                byte[] var364 = class162.field2928.method571(var363, 0, 122);
                                class77 var365 = new class77(var364);
                                var365.method536(class192.field3359, (int[]) null);
                                class64.field1047[var6++] = var365.method525(var361, var362);
                                continue;
                            }
                            if (var451 == 4110) {
                                var7 -= 2;
                                class98 var366 = class25.field486[var7];
                                class98 var367 = class25.field486[var7 + 1];
                                var6--;
                                if (class64.field1047[var6] == 1) {
                                    class25.field486[var7++] = var366;
                                } else {
                                    class25.field486[var7++] = var367;
                                }
                                continue;
                            }
                            if (var451 == 4111) {
                                var7--;
                                class98 var368 = class25.field486[var7];
                                class25.field486[var7++] = class73.method544(var368);
                                continue;
                            }
                            if (var451 == 4112) {
                                var7--;
                                class98 var369 = class25.field486[var7];
                                var6--;
                                int var370 = class64.field1047[var6];
                                if (var370 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class25.field486[var7++] = var369.method712(57, var370);
                                continue;
                            }
                            if (var451 == 4113) {
                                var6--;
                                int var371 = class64.field1047[var6];
                                class64.field1047[var6++] = class126.method934((byte) -69, var371) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 4114) {
                                var6--;
                                int var372 = class64.field1047[var6];
                                class64.field1047[var6++] = class140.method1053(-109, var372) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 4115) {
                                var6--;
                                int var373 = class64.field1047[var6];
                                class64.field1047[var6++] = class158.method1144((byte) 105, var373) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 4116) {
                                var6--;
                                int var374 = class64.field1047[var6];
                                class64.field1047[var6++] = class43.method337(27065, var374) ? 1 : 0;
                                continue;
                            }
                            if (var451 == 4117) {
                                var7--;
                                class98 var375 = class25.field486[var7];
                                if (var375 == null) {
                                    class64.field1047[var6++] = 0;
                                } else {
                                    class64.field1047[var6++] = var375.method724((byte) 25);
                                }
                                continue;
                            }
                            if (var451 == 4118) {
                                var7--;
                                class98 var376 = class25.field486[var7];
                                var6 -= 2;
                                int var377 = class64.field1047[var6];
                                int var378 = class64.field1047[var6 + 1];
                                class25.field486[var7++] = var376.method742(57, var377, var378);
                                continue;
                            }
                            if (var451 == 4119) {
                                var7--;
                                class98 var379 = class25.field486[var7];
                                class98 var380 = class153.method1119(85, var379.method724((byte) 25));
                                boolean var381 = false;
                                for (int var382 = 0; var382 < var379.method724((byte) 25); var382++) {
                                    int var383 = var379.method730(var382, arg1 ^ 0xFFFF9743);
                                    if (var383 == 60) {
                                        var381 = true;
                                    } else if (var383 == 62) {
                                        var381 = false;
                                    } else if (!var381) {
                                        var380.method704(var383, 20097);
                                    }
                                }
                                var380.method718((byte) 93);
                                class25.field486[var7++] = var380;
                                continue;
                            }
                            if (var451 == 4120) {
                                var6 -= 2;
                                var7--;
                                class98 var384 = class25.field486[var7];
                                int var385 = class64.field1047[var6];
                                int var386 = class64.field1047[var6 + 1];
                                class64.field1047[var6++] = var384.method732(true, var386, var385);
                                continue;
                            }
                            if (var451 == 4121) {
                                var7 -= 2;
                                class98 var387 = class25.field486[var7];
                                class98 var388 = class25.field486[var7 + 1];
                                var6--;
                                int var389 = class64.field1047[var6];
                                class64.field1047[var6++] = var387.method743(arg1 + 95, var388, var389);
                                continue;
                            }
                            if (var451 == 4122) {
                                var6--;
                                int var390 = class64.field1047[var6];
                                class64.field1047[var6++] = class80.method596(arg1 + 63, var390);
                                continue;
                            }
                            if (var451 == 4123) {
                                var6--;
                                int var391 = class64.field1047[var6];
                                class64.field1047[var6++] = class162.method1175((byte) -25, var391);
                                continue;
                            }
                        } else if (var451 < 4300) {
                            if (var451 == 4200) {
                                var6--;
                                int var196 = class64.field1047[var6];
                                class25.field486[var7++] = class235.method1605(87, var196).field4255;
                                continue;
                            }
                            if (var451 == 4201) {
                                var6 -= 2;
                                int var197 = class64.field1047[var6];
                                int var198 = class64.field1047[var6 + 1];
                                class245 var199 = class235.method1605(-103, var197);
                                if (var198 >= 1 && var198 <= 5 && var199.field4259[var198 - 1] != null) {
                                    class25.field486[var7++] = var199.field4259[var198 - 1];
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 4202) {
                                var6 -= 2;
                                int var200 = class64.field1047[var6];
                                int var201 = class64.field1047[var6 + 1];
                                class245 var202 = class235.method1605(111, var200);
                                if (var201 >= 1 && var201 <= 5 && var202.field4296[var201 - 1] != null) {
                                    class25.field486[var7++] = var202.field4296[var201 - 1];
                                    continue;
                                }
                                class25.field486[var7++] = class70.field1120;
                                continue;
                            }
                            if (var451 == 4203) {
                                var6--;
                                int var203 = class64.field1047[var6];
                                class64.field1047[var6++] = class235.method1605(-56, var203).field4260;
                                continue;
                            }
                            if (var451 == 4204) {
                                var6--;
                                int var204 = class64.field1047[var6];
                                class64.field1047[var6++] = class235.method1605(85, var204).field4252 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 4205) {
                                var6--;
                                int var205 = class64.field1047[var6];
                                class245 var206 = class235.method1605(-47, var205);
                                if (var206.field4275 == -1 && var206.field4304 >= 0) {
                                    class64.field1047[var6++] = var206.field4304;
                                    continue;
                                }
                                class64.field1047[var6++] = var205;
                                continue;
                            }
                            if (var451 == 4206) {
                                var6--;
                                int var207 = class64.field1047[var6];
                                class245 var208 = class235.method1605(arg1 + 57, var207);
                                if (var208.field4275 >= 0 && var208.field4304 >= 0) {
                                    class64.field1047[var6++] = var208.field4304;
                                    continue;
                                }
                                class64.field1047[var6++] = var207;
                                continue;
                            }
                            if (var451 == 4207) {
                                var6--;
                                int var209 = class64.field1047[var6];
                                class64.field1047[var6++] = class235.method1605(-61, var209).field4309 ? 1 : 0;
                                continue;
                            }
                            if (var451 == 4208) {
                                var6 -= 2;
                                int var210 = class64.field1047[var6 + 1];
                                int var211 = class64.field1047[var6];
                                class103 var212 = class41.method334(var210, -11831);
                                if (var212.method791(-87)) {
                                    class25.field486[var7++] = class235.method1605(74, var211).method1685(var212.field1823, true, var210);
                                } else {
                                    class64.field1047[var6++] = class235.method1605(class184.method1267(arg1, -118), var211).method1694(var212.field1833, var210, (byte) 72);
                                }
                                continue;
                            }
                            if (var451 == 4210) {
                                var7--;
                                class98 var213 = class25.field486[var7];
                                var6--;
                                int var214 = class64.field1047[var6];
                                class253.method1750(var214 == 1, arg1 ^ 0xFFFFFFEF, var213);
                                class64.field1047[var6++] = class196.field3381;
                                continue;
                            }
                            if (var451 == 4211) {
                                if (class131.field2331 != null && class196.field3381 > class56.field895) {
                                    class64.field1047[var6++] = class214.method1427(65535, class131.field2331[class56.field895++]);
                                    continue;
                                }
                                class64.field1047[var6++] = -1;
                                continue;
                            }
                            if (var451 == 4212) {
                                class56.field895 = 0;
                                continue;
                            }
                        } else if (var451 < 4400) {
                            if (var451 == 4300) {
                                var6 -= 2;
                                int var215 = class64.field1047[var6 + 1];
                                int var216 = class64.field1047[var6];
                                class103 var217 = class41.method334(var215, arg1 ^ 0xFFFFD1CB);
                                if (var217.method791(-123)) {
                                    class25.field486[var7++] = class210.method1414(var216, (byte) 111).method891(var217.field1823, (byte) 104, var215);
                                } else {
                                    class64.field1047[var6++] = class210.method1414(var216, (byte) 111).method894(var215, var217.field1833, true);
                                }
                                continue;
                            }
                        } else if (var451 < 4500) {
                            if (var451 == 4400) {
                                var6 -= 2;
                                int var218 = class64.field1047[var6 + 1];
                                int var219 = class64.field1047[var6];
                                class103 var220 = class41.method334(var218, arg1 - 11833);
                                if (var220.method791(arg1 ^ 0xFFFFFF99)) {
                                    class25.field486[var7++] = class125.method929(var219, (byte) -93).method229(var218, 10, var220.field1823);
                                } else {
                                    class64.field1047[var6++] = class125.method929(var219, (byte) -99).method238(var218, false, var220.field1833);
                                }
                                continue;
                            }
                        } else if (var451 >= 4600) {
                            if (var451 < 5100) {
                                if (var451 == 5000) {
                                    class64.field1047[var6++] = class154.field2805;
                                    continue;
                                }
                                if (var451 == 5001) {
                                    var6 -= 3;
                                    class141.field2498++;
                                    class154.field2805 = class64.field1047[var6];
                                    class262.field4602 = class64.field1047[var6 + 1];
                                    class79.field1406 = class64.field1047[var6 + 2];
                                    class237.field4084.method490(236, -80);
                                    class237.field4084.method1477(class154.field2805, arg1 ^ 0xFFFF977F);
                                    class237.field4084.method1477(class262.field4602, -26755);
                                    class237.field4084.method1477(class79.field1406, -26755);
                                    continue;
                                }
                                if (var451 == 5002) {
                                    var6 -= 2;
                                    class101.field1792++;
                                    var7--;
                                    class98 var274 = class25.field486[var7];
                                    int var275 = class64.field1047[var6];
                                    int var276 = class64.field1047[var6 + 1];
                                    class237.field4084.method490(110, -70);
                                    class237.field4084.method1484(var274.method727((byte) 36), (byte) 38);
                                    class237.field4084.method1477(var275 - 1, arg1 + -26757);
                                    class237.field4084.method1477(var276, -26755);
                                    continue;
                                }
                                if (var451 == 5003) {
                                    var6--;
                                    int var277 = class64.field1047[var6];
                                    class98 var278 = null;
                                    if (var277 < 100) {
                                        var278 = class93.field1636[var277];
                                    }
                                    if (var278 == null) {
                                        var278 = class70.field1120;
                                    }
                                    class25.field486[var7++] = var278;
                                    continue;
                                }
                                if (var451 == 5004) {
                                    int var279 = -1;
                                    var6--;
                                    int var280 = class64.field1047[var6];
                                    if (var280 < 100 && class93.field1636[var280] != null) {
                                        var279 = field3816[var280];
                                    }
                                    class64.field1047[var6++] = var279;
                                    continue;
                                }
                                if (var451 == 5005) {
                                    class64.field1047[var6++] = class262.field4602;
                                    continue;
                                }
                                if (var451 == 5008) {
                                    var7--;
                                    class98 var281 = class25.field486[var7];
                                    if (var281.method708(class239.field4122, -121)) {
                                        class83.method621(var281, arg1 ^ 0xD2BF1A5);
                                        continue;
                                    }
                                    if (class130.field2312 == 0 && (class190.field3286 == 1 || class105.field1878 == 1)) {
                                        continue;
                                    }
                                    class98 var282 = var281.method703((byte) -77);
                                    byte var283 = 0;
                                    class125.field2262++;
                                    byte var284 = 0;
                                    if (var282.method708(class85.field1500, -69)) {
                                        var281 = var281.method740(class85.field1500.method724((byte) 25), true);
                                        var283 = 0;
                                    } else if (var282.method708(class88.field1571, -69)) {
                                        var283 = 1;
                                        var281 = var281.method740(class88.field1571.method724((byte) 25), true);
                                    } else if (var282.method708(class200.field3429, arg1 ^ 0xFFFFFFCD)) {
                                        var281 = var281.method740(class200.field3429.method724((byte) 25), true);
                                        var283 = 2;
                                    } else if (var282.method708(class218.field3759, -124)) {
                                        var281 = var281.method740(class218.field3759.method724((byte) 25), true);
                                        var283 = 3;
                                    } else if (var282.method708(class93.field1625, -76)) {
                                        var283 = 4;
                                        var281 = var281.method740(class93.field1625.method724((byte) 25), true);
                                    } else if (var282.method708(class263.field4613, -69)) {
                                        var281 = var281.method740(class263.field4613.method724((byte) 25), true);
                                        var283 = 5;
                                    } else if (var282.method708(class155.field2837, -126)) {
                                        var281 = var281.method740(class155.field2837.method724((byte) 25), true);
                                        var283 = 6;
                                    } else if (var282.method708(class74.field1271, arg1 ^ 0xFFFFFF87)) {
                                        var281 = var281.method740(class74.field1271.method724((byte) 25), true);
                                        var283 = 7;
                                    } else if (var282.method708(class226.field3891, -88)) {
                                        var283 = 8;
                                        var281 = var281.method740(class226.field3891.method724((byte) 25), true);
                                    } else if (var282.method708(class134.field2380, -71)) {
                                        var281 = var281.method740(class134.field2380.method724((byte) 25), true);
                                        var283 = 9;
                                    } else if (var282.method708(field3811, -102)) {
                                        var283 = 10;
                                        var281 = var281.method740(field3811.method724((byte) 25), true);
                                    } else if (var282.method708(class196.field3384, -110)) {
                                        var283 = 11;
                                        var281 = var281.method740(class196.field3384.method724((byte) 25), true);
                                    } else if (class76.field1355 != 0) {
                                        if (var282.method708(class85.field1503, -46)) {
                                            var283 = 0;
                                            var281 = var281.method740(class85.field1503.method724((byte) 25), true);
                                        } else if (var282.method708(class88.field1572, -92)) {
                                            var283 = 1;
                                            var281 = var281.method740(class88.field1572.method724((byte) 25), true);
                                        } else if (var282.method708(class200.field3433, arg1 - 59)) {
                                            var283 = 2;
                                            var281 = var281.method740(class200.field3433.method724((byte) 25), true);
                                        } else if (var282.method708(class218.field3756, -58)) {
                                            var283 = 3;
                                            var281 = var281.method740(class218.field3756.method724((byte) 25), true);
                                        } else if (var282.method708(class93.field1627, -79)) {
                                            var281 = var281.method740(class93.field1627.method724((byte) 25), true);
                                            var283 = 4;
                                        } else if (var282.method708(class263.field4616, -57)) {
                                            var283 = 5;
                                            var281 = var281.method740(class263.field4616.method724((byte) 25), true);
                                        } else if (var282.method708(class155.field2841, arg1 ^ 0xFFFFFF96)) {
                                            var283 = 6;
                                            var281 = var281.method740(class155.field2841.method724((byte) 25), true);
                                        } else if (var282.method708(class74.field1267, -55)) {
                                            var283 = 7;
                                            var281 = var281.method740(class74.field1267.method724((byte) 25), true);
                                        } else if (var282.method708(class226.field3892, -76)) {
                                            var283 = 8;
                                            var281 = var281.method740(class226.field3892.method724((byte) 25), true);
                                        } else if (var282.method708(class134.field2381, -80)) {
                                            var283 = 9;
                                            var281 = var281.method740(class134.field2381.method724((byte) 25), true);
                                        } else if (var282.method708(field3805, -62)) {
                                            var281 = var281.method740(field3805.method724((byte) 25), true);
                                            var283 = 10;
                                        } else if (var282.method708(class196.field3387, -87)) {
                                            var281 = var281.method740(class196.field3387.method724((byte) 25), true);
                                            var283 = 11;
                                        }
                                    }
                                    class98 var285 = var281.method703((byte) 100);
                                    if (var285.method708(class222.field3829, arg1 - 113)) {
                                        var281 = var281.method740(class222.field3829.method724((byte) 25), true);
                                        var284 = 1;
                                    } else if (var285.method708(class174.field3039, -107)) {
                                        var281 = var281.method740(class174.field3039.method724((byte) 25), true);
                                        var284 = 2;
                                    } else if (var285.method708(class69.field1106, -57)) {
                                        var281 = var281.method740(class69.field1106.method724((byte) 25), true);
                                        var284 = 3;
                                    } else if (var285.method708(class154.field2807, -97)) {
                                        var281 = var281.method740(class154.field2807.method724((byte) 25), true);
                                        var284 = 4;
                                    } else if (var285.method708(class118.field2122, arg1 - 76)) {
                                        var281 = var281.method740(class118.field2122.method724((byte) 25), true);
                                        var284 = 5;
                                    } else if (class76.field1355 != 0) {
                                        if (var285.method708(class222.field3831, -77)) {
                                            var281 = var281.method740(class222.field3831.method724((byte) 25), true);
                                            var284 = 1;
                                        } else if (var285.method708(class174.field3040, arg1 ^ 0xFFFFFFAB)) {
                                            var284 = 2;
                                            var281 = var281.method740(class174.field3040.method724((byte) 25), true);
                                        } else if (var285.method708(class69.field1104, arg1 ^ 0xFFFFFFD1)) {
                                            var281 = var281.method740(class69.field1104.method724((byte) 25), true);
                                            var284 = 3;
                                        } else if (var285.method708(class154.field2811, -109)) {
                                            var281 = var281.method740(class154.field2811.method724((byte) 25), true);
                                            var284 = 4;
                                        } else if (var285.method708(class118.field2129, -87)) {
                                            var281 = var281.method740(class118.field2129.method724((byte) 25), true);
                                            var284 = 5;
                                        }
                                    }
                                    class237.field4084.method490(43, -118);
                                    class237.field4084.method1477(0, -26755);
                                    int var286 = class237.field4084.field3728;
                                    class237.field4084.method1477(var283, arg1 - 26757);
                                    class237.field4084.method1477(var284, -26755);
                                    class253.method1754(4095, var281, class237.field4084);
                                    class237.field4084.method1476(class237.field4084.field3728 - var286, -104);
                                    continue;
                                }
                                if (var451 == 5009) {
                                    var7 -= 2;
                                    class98 var287 = class25.field486[var7];
                                    class98 var288 = class25.field486[var7 + 1];
                                    if (class130.field2312 != 0 || class190.field3286 != 1 && class105.field1878 != 1) {
                                        class220.field3795++;
                                        class237.field4084.method490(241, arg1 ^ 0xFFFFFF9A);
                                        class237.field4084.method1477(0, -26755);
                                        int var289 = class237.field4084.field3728;
                                        class237.field4084.method1484(var287.method727((byte) 36), (byte) 38);
                                        class253.method1754(4095, var288, class237.field4084);
                                        class237.field4084.method1476(class237.field4084.field3728 - var289, arg1 + -123);
                                    }
                                    continue;
                                }
                                if (var451 == 5010) {
                                    var6--;
                                    int var290 = class64.field1047[var6];
                                    class98 var291 = null;
                                    if (var290 < 100) {
                                        var291 = class145.field2546[var290];
                                    }
                                    if (var291 == null) {
                                        var291 = class70.field1120;
                                    }
                                    class25.field486[var7++] = var291;
                                    continue;
                                }
                                if (var451 == 5011) {
                                    var6--;
                                    int var292 = class64.field1047[var6];
                                    class98 var293 = null;
                                    if (var292 < 100) {
                                        var293 = class203.field3480[var292];
                                    }
                                    if (var293 == null) {
                                        var293 = class70.field1120;
                                    }
                                    class25.field486[var7++] = var293;
                                    continue;
                                }
                                if (var451 == 5012) {
                                    int var294 = -1;
                                    var6--;
                                    int var295 = class64.field1047[var6];
                                    if (var295 < 100) {
                                        var294 = class2.field31[var295];
                                    }
                                    class64.field1047[var6++] = var294;
                                    continue;
                                }
                                if (var451 == 5015) {
                                    class98 var296;
                                    if (class163.field2943 == null || class163.field2943.field3323 == null) {
                                        var296 = class233.field4017;
                                    } else {
                                        var296 = class163.field2943.method1329(arg1 - 515);
                                    }
                                    class25.field486[var7++] = var296;
                                    continue;
                                }
                                if (var451 == 5016) {
                                    class64.field1047[var6++] = class79.field1406;
                                    continue;
                                }
                                if (var451 == 5017) {
                                    class64.field1047[var6++] = class141.field2494;
                                    continue;
                                }
                                if (var451 == 5050) {
                                    var6--;
                                    int var297 = class64.field1047[var6];
                                    class25.field486[var7++] = class49.method387(var297, 32768).field367;
                                    continue;
                                }
                                if (var451 == 5051) {
                                    var6--;
                                    int var298 = class64.field1047[var6];
                                    class20 var299 = class49.method387(var298, arg1 ^ 0x8002);
                                    if (var299.field357 == null) {
                                        class64.field1047[var6++] = 0;
                                    } else {
                                        class64.field1047[var6++] = var299.field357.length;
                                    }
                                    continue;
                                }
                                if (var451 == 5052) {
                                    var6 -= 2;
                                    int var300 = class64.field1047[var6];
                                    int var301 = class64.field1047[var6 + 1];
                                    class20 var302 = class49.method387(var300, 32768);
                                    int var303 = var302.field357[var301];
                                    class64.field1047[var6++] = var303;
                                    continue;
                                }
                                if (var451 == 5053) {
                                    var6--;
                                    int var304 = class64.field1047[var6];
                                    class20 var305 = class49.method387(var304, 32768);
                                    if (var305.field365 == null) {
                                        class64.field1047[var6++] = 0;
                                    } else {
                                        class64.field1047[var6++] = var305.field365.length;
                                    }
                                    continue;
                                }
                                if (var451 == 5054) {
                                    var6 -= 2;
                                    int var306 = class64.field1047[var6];
                                    int var307 = class64.field1047[var6 + 1];
                                    class64.field1047[var6++] = class49.method387(var306, 32768).field365[var307];
                                    continue;
                                }
                                if (var451 == 5055) {
                                    var6--;
                                    int var308 = class64.field1047[var6];
                                    class25.field486[var7++] = class90.method663(var308, 0).method440(true);
                                    continue;
                                }
                                if (var451 == 5056) {
                                    var6--;
                                    int var309 = class64.field1047[var6];
                                    class61 var310 = class90.method663(var309, 0);
                                    if (var310.field1026 == null) {
                                        class64.field1047[var6++] = 0;
                                    } else {
                                        class64.field1047[var6++] = var310.field1026.length;
                                    }
                                    continue;
                                }
                                if (var451 == 5057) {
                                    var6 -= 2;
                                    int var311 = class64.field1047[var6];
                                    int var312 = class64.field1047[var6 + 1];
                                    class64.field1047[var6++] = class90.method663(var311, 0).field1026[var312];
                                    continue;
                                }
                                if (var451 == 5058) {
                                    class211.field3611 = new class100();
                                    var6--;
                                    class211.field3611.field1763 = class64.field1047[var6];
                                    class211.field3611.field1755 = class90.method663(class211.field3611.field1763, 0);
                                    class211.field3611.field1759 = new int[class211.field3611.field1755.method446(0)];
                                    continue;
                                }
                                if (var451 == 5059) {
                                    class68.field1094++;
                                    class237.field4084.method490(166, -98);
                                    class237.field4084.method1477(0, -26755);
                                    int var313 = class237.field4084.field3728;
                                    class237.field4084.method1477(0, -26755);
                                    class237.field4084.method1470((byte) -122, class211.field3611.field1763);
                                    class211.field3611.field1755.method448(-13709, class211.field3611.field1759, class237.field4084);
                                    class237.field4084.method1476(class237.field4084.field3728 - var313, arg1 ^ 0xFFFFFF94);
                                    continue;
                                }
                                if (var451 == 5060) {
                                    class192.field3328++;
                                    var7--;
                                    class98 var314 = class25.field486[var7];
                                    class237.field4084.method490(8, -88);
                                    class237.field4084.method1477(0, arg1 - 26757);
                                    int var315 = class237.field4084.field3728;
                                    class237.field4084.method1484(var314.method727((byte) 36), (byte) 38);
                                    class237.field4084.method1470((byte) -122, class211.field3611.field1763);
                                    class211.field3611.field1755.method448(-13709, class211.field3611.field1759, class237.field4084);
                                    class237.field4084.method1476(class237.field4084.field3728 - var315, -111);
                                    continue;
                                }
                                if (var451 == 5061) {
                                    class68.field1094++;
                                    class237.field4084.method490(166, arg1 - 94);
                                    class237.field4084.method1477(0, -26755);
                                    int var316 = class237.field4084.field3728;
                                    class237.field4084.method1477(1, -26755);
                                    class237.field4084.method1470((byte) -122, class211.field3611.field1763);
                                    class211.field3611.field1755.method448(-13709, class211.field3611.field1759, class237.field4084);
                                    class237.field4084.method1476(class237.field4084.field3728 - var316, -108);
                                    continue;
                                }
                                if (var451 == 5062) {
                                    var6 -= 2;
                                    int var317 = class64.field1047[var6];
                                    int var318 = class64.field1047[var6 + 1];
                                    class64.field1047[var6++] = class49.method387(var317, 32768).field355[var318];
                                    continue;
                                }
                                if (var451 == 5063) {
                                    var6 -= 2;
                                    int var319 = class64.field1047[var6];
                                    int var320 = class64.field1047[var6 + 1];
                                    class64.field1047[var6++] = class49.method387(var319, arg1 + 32766).field374[var320];
                                    continue;
                                }
                                if (var451 == 5064) {
                                    var6 -= 2;
                                    int var321 = class64.field1047[var6];
                                    int var322 = class64.field1047[var6 + 1];
                                    if (var322 == -1) {
                                        class64.field1047[var6++] = -1;
                                    } else {
                                        class64.field1047[var6++] = class49.method387(var321, class184.method1267(arg1, 32770)).method223(var322, (byte) 35);
                                    }
                                    continue;
                                }
                                if (var451 == 5065) {
                                    var6 -= 2;
                                    int var323 = class64.field1047[var6];
                                    int var324 = class64.field1047[var6 + 1];
                                    if (var324 == -1) {
                                        class64.field1047[var6++] = -1;
                                    } else {
                                        class64.field1047[var6++] = class49.method387(var323, 32768).method216(class184.method1267(arg1, 117), var324);
                                    }
                                    continue;
                                }
                                if (var451 == 5066) {
                                    var6--;
                                    int var325 = class64.field1047[var6];
                                    class64.field1047[var6++] = class90.method663(var325, 0).method446(arg1 - 2);
                                    continue;
                                }
                                if (var451 == 5067) {
                                    var6 -= 2;
                                    int var326 = class64.field1047[var6];
                                    int var327 = class64.field1047[var6 + 1];
                                    int var328 = class90.method663(var326, 0).method443(64, var327);
                                    class64.field1047[var6++] = var328;
                                    continue;
                                }
                                if (var451 == 5068) {
                                    var6 -= 2;
                                    int var329 = class64.field1047[var6 + 1];
                                    int var330 = class64.field1047[var6];
                                    class211.field3611.field1759[var330] = var329;
                                    continue;
                                }
                                if (var451 == 5069) {
                                    var6 -= 2;
                                    int var331 = class64.field1047[var6];
                                    int var332 = class64.field1047[var6 + 1];
                                    class211.field3611.field1759[var331] = var332;
                                    continue;
                                }
                                if (var451 == 5070) {
                                    var6 -= 3;
                                    int var333 = class64.field1047[var6];
                                    int var334 = class64.field1047[var6 + 1];
                                    int var335 = class64.field1047[var6 + 2];
                                    class61 var336 = class90.method663(var333, 0);
                                    if (var336.method443(arg1 ^ 0x76, var334) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class64.field1047[var6++] = var336.method441(var334, 124, var335);
                                    continue;
                                }
                            } else if (var451 < 5200) {
                                if (var451 == 5100) {
                                    if (class107.field1915[86]) {
                                        class64.field1047[var6++] = 1;
                                    } else {
                                        class64.field1047[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var451 == 5101) {
                                    if (class107.field1915[82]) {
                                        class64.field1047[var6++] = 1;
                                    } else {
                                        class64.field1047[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var451 == 5102) {
                                    if (class107.field1915[81]) {
                                        class64.field1047[var6++] = 1;
                                    } else {
                                        class64.field1047[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var451 < 5300) {
                                if (var451 == 5200) {
                                    var6--;
                                    class23.method248(19537, class64.field1047[var6]);
                                    continue;
                                }
                                if (var451 == 5201) {
                                    class64.field1047[var6++] = class237.method1624(true);
                                    continue;
                                }
                                if (var451 == 5202) {
                                    var6--;
                                    class8.method86((byte) -104, class64.field1047[var6]);
                                    continue;
                                }
                                if (var451 == 5203) {
                                    var7--;
                                    class222.method1534(-1, class25.field486[var7]);
                                    continue;
                                }
                                if (var451 == 5204) {
                                    class25.field486[var7 - 1] = class154.method1120(class25.field486[var7 - 1], 0);
                                    continue;
                                }
                                if (var451 == 5205) {
                                    var7--;
                                    class155.method1124((byte) 125, class25.field486[var7]);
                                    continue;
                                }
                                if (var451 == 5206) {
                                    var6--;
                                    int var271 = class64.field1047[var6];
                                    class150 var272 = class80.method605(var271 >> 14 & 0x3FFF, var271 & 0x3FFF, (byte) 39);
                                    if (var272 == null) {
                                        class25.field486[var7++] = class70.field1120;
                                    } else {
                                        class25.field486[var7++] = var272.field2763;
                                    }
                                    continue;
                                }
                                if (var451 == 5207) {
                                    var7--;
                                    class150 var273 = class181.method1248(class25.field486[var7], 1);
                                    if (var273 != null && var273.field2768 != null) {
                                        class25.field486[var7++] = var273.field2768;
                                        continue;
                                    }
                                    class25.field486[var7++] = class70.field1120;
                                    continue;
                                }
                            } else if (var451 >= 5400) {
                                if (var451 < 5500) {
                                    if (var451 == 5400) {
                                        class215.field3669++;
                                        var6--;
                                        int var221 = class64.field1047[var6];
                                        var7 -= 2;
                                        class98 var222 = class25.field486[var7 + 1];
                                        class98 var223 = class25.field486[var7];
                                        class237.field4084.method490(174, -79);
                                        class237.field4084.method1477(class20.method220(var223, true) + class20.method220(var222, true) + 1, -26755);
                                        class237.field4084.method1459(var223, (byte) 78);
                                        class237.field4084.method1459(var222, (byte) 78);
                                        class237.field4084.method1477(var221, -26755);
                                        continue;
                                    }
                                    if (var451 == 5401) {
                                        var6 -= 2;
                                        class87.field1539[class64.field1047[var6]] = (short) class137.method1026((byte) 118, class64.field1047[var6 + 1]);
                                        class11.method103(65280);
                                        class104.method798((byte) 117);
                                        class164.method1182(false);
                                        class91.method673(26108);
                                        class156.method1130(94);
                                        continue;
                                    }
                                    if (var451 == 5405) {
                                        var6 -= 2;
                                        int var224 = class64.field1047[var6];
                                        int var225 = class64.field1047[var6 + 1];
                                        if (var224 >= 0 && var224 < 2) {
                                            class243.field4212[var224] = new int[var225 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var451 == 5406) {
                                        var6 -= 7;
                                        int var226 = class64.field1047[var6 + 3];
                                        int var227 = class64.field1047[var6];
                                        int var228 = class64.field1047[var6 + 1] << 1;
                                        int var229 = class64.field1047[var6 + 5];
                                        int var230 = class64.field1047[var6 + 4];
                                        int var231 = class64.field1047[var6 + 2];
                                        int var232 = class64.field1047[var6 + 6];
                                        if (var227 >= 0 && var227 < 2 && class243.field4212[var227] != null && var228 >= 0 && class243.field4212[var227].length > var228) {
                                            class243.field4212[var227][var228] = new int[] { (class214.method1427(var231, 268429199) >> 14) * 128, var226, class214.method1427(var231, 16383) * 128, var232 };
                                            class243.field4212[var227][var228 + 1] = new int[] { (class214.method1427(var230, 268434186) >> 14) * 128, var229, class214.method1427(var230, 16383) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var451 == 5407) {
                                        var6--;
                                        int var233 = class243.field4212[class64.field1047[var6]].length >> 1;
                                        class64.field1047[var6++] = var233;
                                        continue;
                                    }
                                    if (var451 == 5408) {
                                        class64.field1047[var6++] = 0;
                                        continue;
                                    }
                                    if (var451 == 5409) {
                                        class129.method980(arg1 ^ 0xFFFFFF02);
                                        continue;
                                    }
                                    if (var451 == 5411) {
                                        if (class72.field1195 == null) {
                                            class72.method501(class191.method1324((byte) -44), arg1 - 1, false);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5419) {
                                        class98 var234 = class70.field1120;
                                        if (class146.field2562 != null) {
                                            var234 = class146.method1078(class146.field2562.field446, arg1 ^ 0x60);
                                            try {
                                                if (class146.field2562.field447 != null) {
                                                    byte[] var235 = ((String) class146.field2562.field447).getBytes("ISO-8859-1");
                                                    var234 = class186.method1285(0, var235, var235.length, 0);
                                                }
                                            } catch (UnsupportedEncodingException var449) {
                                            }
                                        }
                                        class25.field486[var7++] = var234;
                                        continue;
                                    }
                                    if (var451 == 5420) {
                                        class64.field1047[var6++] = class151.field2777 == 2 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 5421) {
                                        var7--;
                                        class98 var236 = class25.field486[var7];
                                        var6--;
                                        boolean var237 = class64.field1047[var6] == 1;
                                        class72.method501(class186.method1288(new class98[] { class191.method1324((byte) -44), var236 }, 31618), 1, var237);
                                        continue;
                                    }
                                    if (var451 == 5422) {
                                        var7 -= 2;
                                        class98 var238 = class25.field486[var7 + 1];
                                        class98 var239 = class25.field486[var7];
                                        var6--;
                                        int var240 = class64.field1047[var6];
                                        if (var239.method724((byte) 25) > 0) {
                                            if (class182.field3142 == null) {
                                                class182.field3142 = new class98[class76.field1361[class245.field4315]];
                                            }
                                            class182.field3142[var240] = var239;
                                        }
                                        if (var238.method724((byte) 25) > 0) {
                                            if (class60.field991 == null) {
                                                class60.field991 = new class98[class76.field1361[class245.field4315]];
                                            }
                                            class60.field991[var240] = var238;
                                        }
                                        continue;
                                    }
                                } else if (var451 < 5600) {
                                    if (var451 == 5500) {
                                        var6 -= 4;
                                        int var259 = class64.field1047[var6 + 1];
                                        int var260 = class64.field1047[var6 + 3];
                                        int var261 = class64.field1047[var6];
                                        int var262 = class64.field1047[var6 + 2];
                                        class218.method1505(var260, false, var259, (var261 >> 14 & 0x3FFF) - class189.field3277, var262, false, (var261 & 0x3FFF) - class182.field3143);
                                        continue;
                                    }
                                    if (var451 == 5501) {
                                        var6 -= 4;
                                        int var263 = class64.field1047[var6];
                                        int var264 = class64.field1047[var6 + 1];
                                        int var265 = class64.field1047[var6 + 2];
                                        int var266 = class64.field1047[var6 + 3];
                                        class60.method438((var263 & 0x3FFF) - class182.field3143, var266, var264, (byte) 6, var265, ((var263 & 0xFFFCB23) >> 14) - class189.field3277);
                                        continue;
                                    }
                                    if (var451 == 5502) {
                                        var6 -= 6;
                                        int var267 = class64.field1047[var6];
                                        if (var267 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class151.field2780 = var267;
                                        int var268 = class64.field1047[var6 + 1];
                                        if ((var268 + 1) >= (class243.field4212[class151.field2780].length >> 1)) {
                                            throw new RuntimeException();
                                        }
                                        class139.field2470 = var268;
                                        class12.field243 = 0;
                                        class163.field2945 = class64.field1047[var6 + 2];
                                        class130.field2315 = class64.field1047[var6 + 3];
                                        int var269 = class64.field1047[var6 + 4];
                                        if (var269 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class171.field3022 = var269;
                                        int var270 = class64.field1047[var6 + 5];
                                        if (class243.field4212[class171.field3022].length >> 1 <= var270 + 1) {
                                            throw new RuntimeException();
                                        }
                                        class207.field3549 = 3;
                                        class96.field1662 = var270;
                                        continue;
                                    }
                                    if (var451 == 5503) {
                                        class220.method1518(1);
                                        continue;
                                    }
                                    if (var451 == 5504) {
                                        var6 -= 2;
                                        class113.field2002 = class64.field1047[var6];
                                        class243.field4219 = class64.field1047[var6 + 1];
                                        class245.method1690(1098064519);
                                        continue;
                                    }
                                    if (var451 == 5505) {
                                        class64.field1047[var6++] = class113.field2002;
                                        continue;
                                    }
                                    if (var451 == 5506) {
                                        class64.field1047[var6++] = class243.field4219;
                                        continue;
                                    }
                                } else if (var451 < 5700) {
                                    if (var451 == 5600) {
                                        var7 -= 2;
                                        class98 var241 = class25.field486[var7 + 1];
                                        var6--;
                                        int var242 = class64.field1047[var6];
                                        class98 var243 = class25.field486[var7];
                                        if (class249.field4370 == 10 && class81.field1427 == 0 && class9.field210 == 0) {
                                            class189.method1302(var242, var243, (byte) 9, var241);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5601) {
                                        class71.method496(117);
                                        continue;
                                    }
                                    if (var451 == 5602) {
                                        if (class81.field1427 == 0) {
                                            class176.field3068 = -2;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5603) {
                                        var6 -= 4;
                                        if (class249.field4370 == 10 && class81.field1427 == 0 && class9.field210 == 0) {
                                            class186.method1282(class64.field1047[var6 + 1], class64.field1047[var6], arg1 ^ 0x53, class64.field1047[var6 + 3], class64.field1047[var6 + 2]);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5604) {
                                        var7--;
                                        if (class249.field4370 == 10 && class81.field1427 == 0 && class9.field210 == 0) {
                                            class184.method1271(class25.field486[var7].method727((byte) 36), true);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5605) {
                                        var6 -= 4;
                                        var7 -= 2;
                                        if (class249.field4370 == 10 && class81.field1427 == 0 && class9.field210 == 0) {
                                            class225.method1549(class25.field486[var7].method727((byte) 36), class64.field1047[var6 + 3], class64.field1047[var6 + 2], class25.field486[var7 + 1], class64.field1047[var6 + 1], class64.field1047[var6], 1);
                                        }
                                        continue;
                                    }
                                    if (var451 == 5606) {
                                        if (class9.field210 == 0) {
                                            class202.field3440 = -2;
                                        }
                                        continue;
                                    }
                                    if (var451 == 5607) {
                                        class64.field1047[var6++] = class176.field3068;
                                        continue;
                                    }
                                    if (var451 == 5608) {
                                        class64.field1047[var6++] = class80.field1412;
                                        continue;
                                    }
                                    if (var451 == 5609) {
                                        class64.field1047[var6++] = class202.field3440;
                                        continue;
                                    }
                                    if (var451 == 5610) {
                                        for (int var244 = 0; var244 < 5; var244++) {
                                            class25.field486[var7++] = var244 < class104.field1857.length ? class104.field1857[var244].method726((byte) -100) : class70.field1120;
                                        }
                                        class104.field1857 = null;
                                        continue;
                                    }
                                } else if (var451 < 6100) {
                                    if (var451 == 6001) {
                                        var6--;
                                        int var253 = class64.field1047[var6];
                                        if (var253 < 1) {
                                            var253 = 1;
                                        }
                                        if (var253 > 4) {
                                            var253 = 4;
                                        }
                                        class120.field2172 = var253;
                                        if (class120.field2172 == 1) {
                                            class160.method1148(0.9F);
                                        }
                                        if (class120.field2172 == 2) {
                                            class160.method1148(0.8F);
                                        }
                                        if (class120.field2172 == 3) {
                                            class160.method1148(0.7F);
                                        }
                                        if (class120.field2172 == 4) {
                                            class160.method1148(0.6F);
                                        }
                                        class104.method798((byte) 127);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6002) {
                                        var6--;
                                        class191.method1317((byte) 96, class64.field1047[var6] == 1);
                                        class101.method782((byte) -81);
                                        class182.method1253(false);
                                        class220.method1524(3409);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6003) {
                                        var6--;
                                        class85.field1497 = class64.field1047[var6] == 1;
                                        class220.method1524(3409);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6005) {
                                        var6--;
                                        class104.field1848 = class64.field1047[var6] == 1;
                                        class182.method1253(false);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6006) {
                                        var6--;
                                        class12.field238 = class64.field1047[var6] == 1;
                                        ((class16) class160.field2897).method142(!class12.field238, 255);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6007) {
                                        var6--;
                                        class199.field3423 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6008) {
                                        var6--;
                                        class91.field1593 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6009) {
                                        var6--;
                                        class45.field749 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6010) {
                                        var6--;
                                        class115.field2062 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6011) {
                                        var6--;
                                        int var254 = class64.field1047[var6];
                                        if (var254 < 0 || var254 > 2) {
                                            var254 = 0;
                                        }
                                        class177.field3069 = var254;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6012) {
                                        var6--;
                                        class229.field3932 = class64.field1047[var6] == 1;
                                        if (class120.field2172 == 1) {
                                            class160.method1148(0.9F);
                                        }
                                        if (class120.field2172 == 2) {
                                            class160.method1148(0.8F);
                                        }
                                        if (class120.field2172 == 3) {
                                            class160.method1148(0.7F);
                                        }
                                        if (class120.field2172 == 4) {
                                            class160.method1148(0.6F);
                                        }
                                        class182.method1253(false);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6014) {
                                        var6--;
                                        class41.field679 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6015) {
                                        var6--;
                                        class45.field747 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6016) {
                                        var6--;
                                        int var255 = class64.field1047[var6];
                                        if (var255 < 0 || var255 > 2) {
                                            var255 = 0;
                                        }
                                        class120.field2184 = var255;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6017) {
                                        var6--;
                                        class158.field2873 = class64.field1047[var6] == 1;
                                        class207.method1395(false);
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6018) {
                                        var6--;
                                        int var256 = class64.field1047[var6];
                                        if (var256 < 0) {
                                            var256 = 0;
                                        }
                                        if (var256 > 127) {
                                            var256 = 127;
                                        }
                                        class37.field627 = var256;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6019) {
                                        var6--;
                                        int var257 = class64.field1047[var6];
                                        if (var257 < 0) {
                                            var257 = 0;
                                        }
                                        if (var257 > 255) {
                                            var257 = 255;
                                        }
                                        if (class167.field2978 != var257) {
                                            if (class167.field2978 == 0 && class143.field2527 != -1) {
                                                class190.method1308((byte) 125, 0, false, var257, class143.field2525, class143.field2527);
                                                class187.field3229 = false;
                                            } else if (var257 == 0) {
                                                class206.method1389((byte) -46);
                                                class187.field3229 = false;
                                            } else {
                                                class72.method506(var257, (byte) -51);
                                            }
                                            class167.field2978 = var257;
                                        }
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6020) {
                                        var6--;
                                        int var258 = class64.field1047[var6];
                                        if (var258 < 0) {
                                            var258 = 0;
                                        }
                                        if (var258 > 127) {
                                            var258 = 127;
                                        }
                                        class90.field1585 = var258;
                                        class115.method863((byte) 35, class119.field2145);
                                        class224.field3865 = false;
                                        continue;
                                    }
                                    if (var451 == 6021) {
                                        var6--;
                                        class4.field41 = class64.field1047[var6] == 1;
                                        class220.method1524(arg1 ^ 0xD53);
                                        continue;
                                    }
                                    if (var451 == 6022) {
                                        var6--;
                                        class68.field1082 = class64.field1047[var6] == 1;
                                        class115.method863((byte) 35, class119.field2145);
                                        class4.method23(-106, 0);
                                        continue;
                                    }
                                } else if (var451 < 6200) {
                                    if (var451 == 6101) {
                                        class64.field1047[var6++] = class120.field2172;
                                        continue;
                                    }
                                    if (var451 == 6102) {
                                        class64.field1047[var6++] = class181.method1249((byte) 62) ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6103) {
                                        class64.field1047[var6++] = class85.field1497 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6105) {
                                        class64.field1047[var6++] = class104.field1848 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6106) {
                                        class64.field1047[var6++] = class12.field238 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6107) {
                                        class64.field1047[var6++] = class199.field3423 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6108) {
                                        class64.field1047[var6++] = class91.field1593 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6109) {
                                        class64.field1047[var6++] = class45.field749 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6110) {
                                        class64.field1047[var6++] = class115.field2062 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6111) {
                                        class64.field1047[var6++] = class177.field3069;
                                        continue;
                                    }
                                    if (var451 == 6112) {
                                        class64.field1047[var6++] = class229.field3932 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6114) {
                                        class64.field1047[var6++] = class41.field679 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6115) {
                                        class64.field1047[var6++] = class45.field747 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6116) {
                                        class64.field1047[var6++] = class120.field2184;
                                        continue;
                                    }
                                    if (var451 == 6117) {
                                        class64.field1047[var6++] = class158.field2873 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6118) {
                                        class64.field1047[var6++] = class37.field627;
                                        continue;
                                    }
                                    if (var451 == 6119) {
                                        class64.field1047[var6++] = class167.field2978;
                                        continue;
                                    }
                                    if (var451 == 6120) {
                                        class64.field1047[var6++] = class90.field1585;
                                        continue;
                                    }
                                    if (var451 == 6121) {
                                        class64.field1047[var6++] = 0;
                                        continue;
                                    }
                                    if (var451 == 6122) {
                                        class64.field1047[var6++] = class68.field1082 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var451 < 6300) {
                                    if (var451 == 6200) {
                                        var6 -= 2;
                                        class210.field3598 = (short) class64.field1047[var6];
                                        if (class210.field3598 <= 0) {
                                            class210.field3598 = 256;
                                        }
                                        class108.field1927 = (short) class64.field1047[var6 + 1];
                                        if (class108.field1927 <= 0) {
                                            class108.field1927 = 205;
                                        }
                                        continue;
                                    }
                                    if (var451 == 6201) {
                                        var6 -= 2;
                                        class224.field3868 = (short) class64.field1047[var6];
                                        if (class224.field3868 <= 0) {
                                            class224.field3868 = 256;
                                        }
                                        class197.field3403 = (short) class64.field1047[var6 + 1];
                                        if (class197.field3403 <= 0) {
                                            class197.field3403 = 320;
                                        }
                                        continue;
                                    }
                                    if (var451 == 6202) {
                                        var6 -= 4;
                                        class117.field2100 = (short) class64.field1047[var6];
                                        if (class117.field2100 <= 0) {
                                            class117.field2100 = 1;
                                        }
                                        class12.field235 = (short) class64.field1047[var6 + 1];
                                        if (class12.field235 <= 0) {
                                            class12.field235 = 32767;
                                        } else if (class12.field235 < class117.field2100) {
                                            class12.field235 = class117.field2100;
                                        }
                                        class147.field2585 = (short) class64.field1047[var6 + 2];
                                        if (class147.field2585 <= 0) {
                                            class147.field2585 = 1;
                                        }
                                        class177.field3072 = (short) class64.field1047[var6 + 3];
                                        if (class177.field3072 <= 0) {
                                            class177.field3072 = 32767;
                                        } else if (class147.field2585 > class177.field3072) {
                                            class177.field3072 = class147.field2585;
                                        }
                                        continue;
                                    }
                                    if (var451 == 6203) {
                                        class121.method905(0, false, class23.field473.field2694, -126, class23.field473.field2647, 0);
                                        class64.field1047[var6++] = class45.field750;
                                        class64.field1047[var6++] = class132.field2353;
                                        continue;
                                    }
                                    if (var451 == 6204) {
                                        class64.field1047[var6++] = class224.field3868;
                                        class64.field1047[var6++] = class197.field3403;
                                        continue;
                                    }
                                    if (var451 == 6205) {
                                        class64.field1047[var6++] = class210.field3598;
                                        class64.field1047[var6++] = class108.field1927;
                                        continue;
                                    }
                                } else if (var451 < 6400) {
                                    if (var451 == 6300) {
                                        class64.field1047[var6++] = (int) (class164.method1183((byte) 80) / 60000L);
                                        continue;
                                    }
                                    if (var451 == 6301) {
                                        class64.field1047[var6++] = (int) (class164.method1183((byte) 80) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var451 == 6302) {
                                        var6 -= 3;
                                        int var245 = class64.field1047[var6];
                                        int var246 = class64.field1047[var6 + 1];
                                        int var247 = class64.field1047[var6 + 2];
                                        class23.field459.clear();
                                        class23.field459.set(11, 12);
                                        class23.field459.set(var247, var246, var245);
                                        class64.field1047[var6++] = (int) (class23.field459.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var451 == 6303) {
                                        class23.field459.clear();
                                        class23.field459.setTime(new Date(class164.method1183((byte) 80)));
                                        class64.field1047[var6++] = class23.field459.get(1);
                                        continue;
                                    }
                                    if (var451 == 6304) {
                                        boolean var248 = true;
                                        var6--;
                                        int var249 = class64.field1047[var6];
                                        if (var249 < 0) {
                                            var248 = ((var249 + 1) % 4) == 0;
                                        } else if (var249 < 1582) {
                                            var248 = var249 % 4 == 0;
                                        } else if ((var249 % 4) != 0) {
                                            var248 = false;
                                        } else if (var249 % 100 != 0) {
                                            var248 = true;
                                        } else if (var249 % 400 != 0) {
                                            var248 = false;
                                        }
                                        class64.field1047[var6++] = var248 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var451 < 6500) {
                                    if (var451 == 6400) {
                                        class64.field1047[var6++] = class212.field3620 ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6401) {
                                        var7--;
                                        class98 var250 = class25.field486[var7];
                                        var6--;
                                        int var251 = class64.field1047[var6];
                                        String var252;
                                        try {
                                            var252 = new String(var250.method725(false), "ISO-8859-1");
                                        } catch (UnsupportedEncodingException var448) {
                                            var252 = new String(var250.method725(false));
                                        }
                                        if (class212.field3620) {
                                            if (!browsercontrol.iscreated()) {
                                                browsercontrol.create("about:blank");
                                            }
                                            if (browsercontrol.iscreated()) {
                                                browsercontrol.navigate(var252);
                                                class217.field3740 = var251;
                                                class4.method23(-113, 0);
                                            }
                                        }
                                        continue;
                                    }
                                    if (var451 == 6402) {
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate("about:blank");
                                            browsercontrol.hide();
                                            class217.field3740 = 0;
                                            class4.method23(-118, 0);
                                        }
                                        continue;
                                    }
                                    if (var451 == 6403) {
                                        class25.field486[var7++] = class62.field1039;
                                        continue;
                                    }
                                    if (var451 == 6404) {
                                        class25.field486[var7++] = class120.field2183;
                                        continue;
                                    }
                                    if (var451 == 6405) {
                                        class64.field1047[var6++] = class124.method927(arg1 - 2) ? 1 : 0;
                                        continue;
                                    }
                                    if (var451 == 6406) {
                                        class64.field1047[var6++] = class220.method1519((byte) 26) ? 1 : 0;
                                        continue;
                                    }
                                }
                            } else if (var451 == 5306) {
                                class64.field1047[var6++] = class151.method1114((byte) -82);
                                continue;
                            }
                        } else if (var451 == 4500) {
                            var6 -= 2;
                            int var337 = class64.field1047[var6 + 1];
                            int var338 = class64.field1047[var6];
                            class103 var339 = class41.method334(var337, -11831);
                            if (var339.method791(-62)) {
                                class25.field486[var7++] = class180.method1245(var338, (byte) -127).method1025(var339.field1823, (byte) -46, var337);
                            } else {
                                class64.field1047[var6++] = class180.method1245(var338, (byte) -127).method1020((byte) -116, var339.field1833, var337);
                            }
                            continue;
                        }
                    } else {
                        class148 var60;
                        if (var451 >= 2000) {
                            int var10000 = arg1 ^ 0xCD17E092;
                            var6--;
                            var60 = class62.method455(var10000, class64.field1047[var6]);
                            var451 -= 1000;
                        } else {
                            var60 = var46 ? class119.field2138 : class14.field266;
                        }
                        if (var451 == 1300) {
                            var6--;
                            int var61 = class64.field1047[var6] - 1;
                            if (var61 >= 0 && var61 <= 9) {
                                var7--;
                                var60.method1089(true, class25.field486[var7], var61);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var451 == 1301) {
                            var6 -= 2;
                            int var62 = class64.field1047[var6];
                            int var63 = class64.field1047[var6 + 1];
                            var60.field2623 = class157.method1138(var62, (byte) 69, var63);
                            continue;
                        }
                        if (var451 == 1302) {
                            var6--;
                            var60.field2686 = class64.field1047[var6] == 1;
                            continue;
                        }
                        if (var451 == 1303) {
                            var6--;
                            var60.field2653 = class64.field1047[var6];
                            continue;
                        }
                        if (var451 == 1304) {
                            var6--;
                            var60.field2599 = class64.field1047[var6];
                            continue;
                        }
                        if (var451 == 1305) {
                            var7--;
                            var60.field2687 = class25.field486[var7];
                            continue;
                        }
                        if (var451 == 1306) {
                            var7--;
                            var60.field2596 = class25.field486[var7];
                            continue;
                        }
                        if (var451 == 1307) {
                            var60.field2727 = null;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var450) {
            if (var5.field3103 == null) {
                if (class132.field2346 != 0) {
                    class176.method1228(class70.field1120, class233.field4028, (byte) -49, 0);
                }
                class243.method1678("CS2 - scr:" + var5.field4061 + " op:" + var11, var450, (byte) -78);
            } else {
                class98 var445 = class153.method1119(arg1 - 56, 30);
                var445.method736(arg1 ^ 0xFFFFD43E, class78.field1380).method736(-11204, var5.field3103);
                for (int var446 = class67.field1064 - 1; var446 >= 0; var446--) {
                    var445.method736(-11204, class214.field3647).method736(arg1 ^ 0xFFFFD43E, class192.field3320[var446].field3644.field3103);
                }
                if (var11 == 40) {
                    int var447 = var9[var8];
                    var445.method736(-11204, class166.field2976).method736(-11204, class125.method930(25904, var447));
                }
                if (class132.field2346 != 0) {
                    class176.method1228(class70.field1120, class186.method1288(new class98[] { class161.field2911, var5.field3103 }, 31618), (byte) -49, 0);
                }
                class243.method1678("CS2 - scr:" + var5.field4061 + " op:" + var11 + new String(var445.method725(false)), var450, (byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)J")
    public static final long method1527(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        return var3 == null || var3.field1132 == null ? 0L : var3.field1132.field852;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method1528(byte arg0) {
        class207.field3546.method1554((byte) -109);
        class122.field2240.method1554((byte) -109);
        class13.field246.method1554((byte) -109);
        if (arg0 > 105) {
            field3804++;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static void method1529(byte arg0) {
        field3811 = null;
        field3807 = null;
        field3816 = null;
        if (arg0 != -96) {
            field3812 = null;
        }
        field3812 = null;
        field3805 = null;
        field3814 = null;
        field3806 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZB)Lsb;")
    private static final class98 method1530(int arg0, boolean arg1, byte arg2) {
        field3813++;
        int var3 = 103 / ((arg2 + 39) / 63);
        return class61.method449(10, (byte) 80, arg1, arg0);
    }
}
