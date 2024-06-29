import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class143 extends class67 {

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Li;")
    private static class88 field2643 = class208.method1425(105, "skill)2");

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Li;")
    private static class88 field2648 = class208.method1425(105, "Please wait)3)3)3");

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Li;")
    public static class88 field2652 = field2648;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "[I")
    public static int[] field2644 = new int[32];

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Li;")
    public static class88 field2639 = field2643;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field2654 = 1;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field2659 = 0;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "Li;")
    private static class88 field2661 = class208.method1425(105, "Loaded sprites");

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Li;")
    public static class88 field2635 = field2661;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "B")
    public static byte field2633;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "Lnf;")
    public class148 field2636;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Loj;")
    public class162 field2628;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Loj;")
    public class162 field2646;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Lhi;")
    public static class86 field2656;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "Ljava/awt/Image;")
    public static Image field2645;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
    public int[] field2637;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public static void method934(boolean arg0) {
        field2645 = null;
        field2643 = null;
        field2644 = null;
        field2656 = null;
        field2635 = null;
        field2652 = null;
        if (arg0) {
            field2661 = null;
            field2639 = null;
            field2648 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII[Lq;II)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class174[] arg6, int arg7, int arg8) {
        if (arg2 != 31) {
            field2635 = null;
        }
        field2653++;
        for (int var9 = 0; var9 < arg6.length; var9++) {
            class174 var10 = arg6[var9];
            if (var10 != null && (!var10.field3412 || var10.field3392 == 0 || var10.field3451 || class80.method530(-881710560, var10) != 0 || class49.field923 == var10 || var10.field3441 == 1338) && var10.field3506 == arg4 && (!var10.field3412 || !class71.method475(0, var10))) {
                int var11 = var10.field3368 + arg3;
                int var12 = var10.field3443 + arg8;
                int var13;
                int var16;
                int var17;
                int var18;
                if (var10.field3392 == 2) {
                    var17 = arg5;
                    var18 = arg1;
                    var13 = arg0;
                    var16 = arg7;
                } else {
                    var13 = arg0 >= var12 ? arg0 : var12;
                    int var14 = var10.field3424 + var12;
                    int var15 = var10.field3382 + var11;
                    var16 = arg7 >= var11 ? arg7 : var11;
                    if (var10.field3392 == 9) {
                        var14++;
                        var15++;
                    }
                    var17 = arg5 <= var14 ? arg5 : var14;
                    var18 = var15 < arg1 ? var15 : arg1;
                }
                if (class179.field3570 == var10) {
                    class14.field208 = var11;
                    class149.field2907 = true;
                    class135.field2508 = var12;
                }
                if (!var10.field3412 || var16 < var18 && var13 < var17) {
                    if (var10.field3392 == 0) {
                        if (!var10.field3412 && class71.method475(arg2 ^ 0x1F, var10) && class65.field1177 != var10) {
                            continue;
                        }
                        if (var10.field3472 && var16 <= class28.field471 && class239.field4451 >= var13 && var18 > class28.field471 && class239.field4451 < var17) {
                            for (class39 var19 = (class39) class74.field1349.method1612(false); var19 != null; var19 = (class39) class74.field1349.method1621(82)) {
                                if (var19.field686) {
                                    var19.method460(true);
                                }
                            }
                            for (class39 var20 = (class39) class199.field3812.method1612(false); var20 != null; var20 = (class39) class199.field3812.method1621(arg2 + 51)) {
                                if (var20.field686) {
                                    var20.method460(true);
                                }
                            }
                            if (class227.field4258 == 0) {
                                class179.field3570 = null;
                                class49.field923 = null;
                            }
                            class175.field3534 = false;
                        }
                    }
                    if (var10.field3412) {
                        boolean var21 = false;
                        boolean var22 = false;
                        boolean var23;
                        if (class28.field471 >= var16 && var13 <= class239.field4451 && var18 > class28.field471 && var17 > class239.field4451) {
                            var23 = true;
                        } else {
                            var23 = false;
                        }
                        if (class36.field625 == 1 && var16 <= class226.field4241 && class172.field3341 >= var13 && class226.field4241 < var18 && var17 > class172.field3341) {
                            var22 = true;
                        }
                        if (class156.field3018 == 1 && var23) {
                            var21 = true;
                        }
                        if (class81.field1467 > 0 && var10.field3495 != null) {
                            for (int var24 = 0; var24 < var10.field3495.length; var24++) {
                                for (int var25 = 0; var25 < class81.field1467; var25++) {
                                    int var26 = var10.field3495[var24] & 0xFF;
                                    if (class242.field4481[var25] == var26) {
                                        class203.method1392(var24 + 1, class174.field3455, -1, -3655, var10.field3425);
                                    }
                                }
                            }
                        }
                        if (var22) {
                            class80.method532(class226.field4241 - var11, 2, class172.field3341 - var12, var10);
                        }
                        if (class179.field3570 != null && class179.field3570 != var10 && var23 && class59.method423(class80.method530(arg2 ^ 0xCB722A3F, var10), -30)) {
                            class122.field2219 = var10;
                        }
                        if (class49.field923 == var10) {
                            class29.field487 = true;
                            class28.field466 = var12;
                            class127.field2373 = var11;
                        }
                        if (var10.field3451 || var10.field3441 != 0) {
                            if (var23 && class90.field1709 != 0 && var10.field3473 != null) {
                                class39 var27 = new class39();
                                var27.field686 = true;
                                var27.field681 = var10.field3473;
                                var27.field678 = var10;
                                var27.field691 = class90.field1709;
                                class74.field1349.method1624(var27, 68);
                            }
                            if (class179.field3570 != null || class135.field2516 != null || class108.field1960 || var10.field3441 != 1400 && class175.field3534) {
                                var23 = false;
                                var22 = false;
                                var21 = false;
                            }
                            if (var10.field3441 == 1337) {
                                class200.method1373(65280, var10);
                                continue;
                            }
                            if (var10.field3441 == 1338) {
                                if (var22) {
                                    class4.method16(class226.field4241 - var11, -var12 + class172.field3341, -11537, var10);
                                }
                                continue;
                            }
                            if (var10.field3441 == 1400) {
                                class90.field1707 = var10;
                                if (var22) {
                                    if (class247.field4513[82] && class67.field1208 > 0) {
                                        int var28 = class119.field2183 + class44.field760 - (int) ((double) (class172.field3341 - var12 - var10.field3424 / 2) * 2.0D / class59.field1110) - class157.field3035;
                                        int var29 = (int) ((double) (class226.field4241 - var11 - var10.field3382 / 2) * 2.0D / class59.field1110) + class126.field2332 + class16.field239;
                                        class88 var30 = class166.method1142(new class88[] { class212.field4011, class170.method1214(var29 >> 6, arg2 - 150), class53.field979, class170.method1214(var28 >> 6, 111), class53.field979, class170.method1214(var29 & 0x3F, 94), class53.field979, class170.method1214(var28 & 0x3F, -79) }, -3);
                                        var30.method610(-5446);
                                        class97.method684(var30, arg2 - 29);
                                        class29.method174(-88);
                                        continue;
                                    }
                                    class148.field2793 = class28.field471;
                                    class98.field1803 = class157.field3035;
                                    class207.field3943 = class239.field4451;
                                    class175.field3534 = true;
                                    class47.field890 = class126.field2332;
                                    continue;
                                }
                                if (var21 && class175.field3534) {
                                    class233.method1553(true, class47.field890 + (int) ((double) (class148.field2793 - class28.field471) * 2.0D / class150.field2917));
                                    class172.method1223((int) ((double) (class207.field3943 - class239.field4451) * 2.0D / class150.field2917) + class98.field1803, -89);
                                    continue;
                                }
                                class175.field3534 = false;
                                continue;
                            }
                            if (var10.field3441 == 1401) {
                                if (var21) {
                                    class165.method1139(arg2 + 91, var10.field3382, class239.field4451 - var12, class28.field471 - var11, var10.field3424);
                                }
                                continue;
                            }
                            if (!var10.field3480 && var22) {
                                var10.field3480 = true;
                                if (var10.field3492 != null) {
                                    class39 var31 = new class39();
                                    var31.field691 = class172.field3341 - var12;
                                    var31.field681 = var10.field3492;
                                    var31.field678 = var10;
                                    var31.field686 = true;
                                    var31.field694 = class226.field4241 - var11;
                                    class74.field1349.method1624(var31, 104);
                                }
                            }
                            if (var10.field3480 && var21 && var10.field3454 != null) {
                                class39 var32 = new class39();
                                var32.field686 = true;
                                var32.field681 = var10.field3454;
                                var32.field678 = var10;
                                var32.field694 = class28.field471 - var11;
                                var32.field691 = class239.field4451 - var12;
                                class74.field1349.method1624(var32, arg2 + 46);
                            }
                            if (var10.field3480 && !var21) {
                                var10.field3480 = false;
                                if (var10.field3410 != null) {
                                    class39 var33 = new class39();
                                    var33.field678 = var10;
                                    var33.field691 = class239.field4451 - var12;
                                    var33.field681 = var10.field3410;
                                    var33.field694 = class28.field471 - var11;
                                    var33.field686 = true;
                                    class199.field3812.method1624(var33, 67);
                                }
                            }
                            if (var21 && var10.field3505 != null) {
                                class39 var34 = new class39();
                                var34.field681 = var10.field3505;
                                var34.field686 = true;
                                var34.field691 = class239.field4451 - var12;
                                var34.field678 = var10;
                                var34.field694 = class28.field471 - var11;
                                class74.field1349.method1624(var34, 111);
                            }
                            if (!var10.field3469 && var23) {
                                var10.field3469 = true;
                                if (var10.field3372 != null) {
                                    class39 var35 = new class39();
                                    var35.field694 = class28.field471 - var11;
                                    var35.field691 = class239.field4451 - var12;
                                    var35.field686 = true;
                                    var35.field678 = var10;
                                    var35.field681 = var10.field3372;
                                    class74.field1349.method1624(var35, arg2 + 55);
                                }
                            }
                            if (var10.field3469 && var23 && var10.field3512 != null) {
                                class39 var36 = new class39();
                                var36.field678 = var10;
                                var36.field691 = class239.field4451 - var12;
                                var36.field681 = var10.field3512;
                                var36.field694 = class28.field471 - var11;
                                var36.field686 = true;
                                class74.field1349.method1624(var36, arg2 ^ 0x4C);
                            }
                            if (var10.field3469 && !var23) {
                                var10.field3469 = false;
                                if (var10.field3450 != null) {
                                    class39 var37 = new class39();
                                    var37.field681 = var10.field3450;
                                    var37.field678 = var10;
                                    var37.field686 = true;
                                    var37.field694 = class28.field471 - var11;
                                    var37.field691 = class239.field4451 - var12;
                                    class199.field3812.method1624(var37, 41);
                                }
                            }
                            if (var10.field3460 != null) {
                                class39 var38 = new class39();
                                var38.field678 = var10;
                                var38.field681 = var10.field3460;
                                class35.field619.method1624(var38, arg2 + 84);
                            }
                            if (var10.field3483 != null && class226.field4246 > var10.field3374) {
                                if (var10.field3452 == null || class226.field4246 - var10.field3374 > 32) {
                                    class39 var43 = new class39();
                                    var43.field678 = var10;
                                    var43.field681 = var10.field3483;
                                    class74.field1349.method1624(var43, 124);
                                } else {
                                    label448: for (int var39 = var10.field3374; var39 < class226.field4246; var39++) {
                                        int var40 = class244.field4497[var39 & 0x1F];
                                        for (int var41 = 0; var41 < var10.field3452.length; var41++) {
                                            if (var10.field3452[var41] == var40) {
                                                class39 var42 = new class39();
                                                var42.field681 = var10.field3483;
                                                var42.field678 = var10;
                                                class74.field1349.method1624(var42, 73);
                                                break label448;
                                            }
                                        }
                                    }
                                }
                                var10.field3374 = class226.field4246;
                            }
                            if (var10.field3445 != null && class223.field4200 > var10.field3409) {
                                if (var10.field3371 == null || class223.field4200 - var10.field3409 > 32) {
                                    class39 var48 = new class39();
                                    var48.field681 = var10.field3445;
                                    var48.field678 = var10;
                                    class74.field1349.method1624(var48, 112);
                                } else {
                                    label424: for (int var44 = var10.field3409; var44 < class223.field4200; var44++) {
                                        int var45 = class231.field4330[var44 & 0x1F];
                                        for (int var46 = 0; var46 < var10.field3371.length; var46++) {
                                            if (var10.field3371[var46] == var45) {
                                                class39 var47 = new class39();
                                                var47.field681 = var10.field3445;
                                                var47.field678 = var10;
                                                class74.field1349.method1624(var47, 39);
                                                break label424;
                                            }
                                        }
                                    }
                                }
                                var10.field3409 = class223.field4200;
                            }
                            if (var10.field3456 != null && var10.field3501 < class118.field2133) {
                                if (var10.field3400 == null || class118.field2133 - var10.field3501 > 32) {
                                    class39 var53 = new class39();
                                    var53.field681 = var10.field3456;
                                    var53.field678 = var10;
                                    class74.field1349.method1624(var53, arg2 ^ 0x3A);
                                } else {
                                    label400: for (int var49 = var10.field3501; var49 < class118.field2133; var49++) {
                                        int var50 = field2644[var49 & 0x1F];
                                        for (int var51 = 0; var51 < var10.field3400.length; var51++) {
                                            if (var10.field3400[var51] == var50) {
                                                class39 var52 = new class39();
                                                var52.field678 = var10;
                                                var52.field681 = var10.field3456;
                                                class74.field1349.method1624(var52, arg2 + 57);
                                                break label400;
                                            }
                                        }
                                    }
                                }
                                var10.field3501 = class118.field2133;
                            }
                            if (var10.field3464 < class7.field100 && var10.field3520 != null) {
                                class39 var54 = new class39();
                                var54.field678 = var10;
                                var54.field681 = var10.field3520;
                                class74.field1349.method1624(var54, 111);
                            }
                            if (var10.field3464 < class20.field313 && var10.field3486 != null) {
                                class39 var55 = new class39();
                                var55.field678 = var10;
                                var55.field681 = var10.field3486;
                                class74.field1349.method1624(var55, 78);
                            }
                            if (var10.field3464 < class77.field1394 && var10.field3383 != null) {
                                class39 var56 = new class39();
                                var56.field678 = var10;
                                var56.field681 = var10.field3383;
                                class74.field1349.method1624(var56, 103);
                            }
                            if (class117.field2129 > var10.field3464 && var10.field3507 != null) {
                                class39 var57 = new class39();
                                var57.field678 = var10;
                                var57.field681 = var10.field3507;
                                class74.field1349.method1624(var57, 98);
                            }
                            if (var10.field3464 < class208.field3954 && var10.field3446 != null) {
                                class39 var58 = new class39();
                                var58.field678 = var10;
                                var58.field681 = var10.field3446;
                                class74.field1349.method1624(var58, 59);
                            }
                            var10.field3464 = class67.field1211;
                            if (var10.field3379 != null) {
                                for (int var59 = 0; var59 < class81.field1467; var59++) {
                                    class39 var60 = new class39();
                                    var60.field678 = var10;
                                    var60.field682 = class242.field4481[var59];
                                    var60.field692 = class191.field3687[var59];
                                    var60.field681 = var10.field3379;
                                    class74.field1349.method1624(var60, 88);
                                }
                            }
                        }
                    }
                    if (!var10.field3412 && class179.field3570 == null && class135.field2516 == null && !class108.field1960) {
                        if ((var10.field3426 >= 0 || var10.field3433 != 0) && var16 <= class28.field471 && class239.field4451 >= var13 && class28.field471 < var18 && var17 > class239.field4451) {
                            if (var10.field3426 < 0) {
                                class65.field1177 = var10;
                            } else {
                                class65.field1177 = arg6[var10.field3426];
                            }
                        }
                        if (var10.field3392 == 8 && var16 <= class28.field471 && var13 <= class239.field4451 && var18 > class28.field471 && class239.field4451 < var17) {
                            class36.field635 = var10;
                        }
                        if (var10.field3424 < var10.field3377) {
                            class118.method807(var11 + var10.field3382, var10.field3377, -16519, class28.field471, var10.field3424, class239.field4451, var10, var12);
                        }
                    }
                    if (var10.field3392 == 0) {
                        method935(var13, var18, arg2, var11 - var10.field3395, var10.field3425, var17, arg6, var16, var12 - var10.field3417);
                        if (var10.field3467 != null) {
                            method935(var13, var18, 31, var11 - var10.field3395, var10.field3425, var17, var10.field3467, var16, var12 - var10.field3417);
                        }
                        class168 var61 = (class168) class128.field2397.method1051(-1, (long) var10.field3425);
                        if (var61 != null) {
                            class230.method1535(var12, var17, var13, var16, var18, 66, var61.field3231, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
    public static final void method936(boolean arg0, int arg1) {
        field2651++;
        if (arg1 != 54) {
            method937((byte) -68, null);
        }
        byte[][] var2 = class167.field3223;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class146.field2733[var5] >> 8) * 64 - class223.field4214;
            byte[] var12 = var2[var5];
            int var13 = (class146.field2733[var5] & 0xFF) * 64 - class190.field3681;
            if (var12 != null) {
                class219.method1481(2);
                class144.method965(class110.field2016 * 8 - 48, var11, (class140.field2597 - 6) * 8, class166.field3202, var13, (byte) 92, var12, arg0);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class146.field2733[var6] >> 8) * 64 - class223.field4214;
            int var8 = (class146.field2733[var6] & 0xFF) * 64 - class190.field3681;
            byte[] var9 = var2[var6];
            if (var9 == null && class110.field2016 < 800) {
                class219.method1481(arg1 ^ 0x34);
                for (int var10 = 0; var10 < var3; var10++) {
                    class17.method83(var10, 64, false, 64, var8, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method937(byte arg0, Component arg1) {
        if (arg0 <= 29) {
            method935(9, -62, 49, -27, -108, 45, null, -39, 51);
        }
        field2655++;
        Method var2 = class181.field3588;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class166.field3190);
        arg1.addFocusListener(class166.field3190);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLea;)Lje;")
    public static final class103 method938(byte arg0, class46 arg1) {
        if (arg0 > -44) {
            field2661 = null;
        }
        field2660++;
        return new class103(arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method334((byte) -73), arg1.method304(-29629), arg1.method347(26119));
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)V")
    public static final void method939(byte[] arg0, byte arg1) {
        field2638++;
        int var2 = 0;
        if (arg1 != -96) {
            return;
        }
        while (true) {
            while (var2 < arg0.length) {
                int var3 = arg0[var2++] * 64 - class16.field239;
                int var4 = arg0[var2++] * 64 - class119.field2183;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class109.field1990 && var4 + 64 < class44.field760) {
                    int var5 = var3 >> 6;
                    int var6 = class44.field760 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if ((var9 & 0x1) == 1) {
                                    byte var10 = arg0[var2++];
                                    if (class216.field4054[var5][var6] == null) {
                                        class216.field4054[var5][var6] = new byte[4096];
                                    }
                                    class216.field4054[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) var10;
                                }
                                if ((var9 & 0x2) == 2) {
                                    byte var11 = arg0[var2++];
                                    if (class117.field2128[var5][var6] == null) {
                                        class117.field2128[var5][var6] = new byte[4096];
                                    }
                                    class117.field2128[var5][var6][(-(var8 + 1) << 6) + var7] = (byte) (var11 - 28);
                                }
                                if ((var9 & 0x4) == 4) {
                                    var2 += 3;
                                    int var12 = (arg0[var2 - 1] & 0xFF) + ((arg0[var2 - 2] & 0xFF) << 8) + ((arg0[var2 + -3] & 0xFF) << 16);
                                    if (class48.field895[var5][var6] == null) {
                                        class48.field895[var5][var6] = new int[4096];
                                    }
                                    var12--;
                                    class148 var13 = class190.method1323(var12, arg1 ^ 0x30FE);
                                    if (var13.field2772 != null) {
                                        var13 = var13.method1000((byte) -125);
                                        if (var13 == null || var13.field2819 == -1) {
                                            continue;
                                        }
                                    }
                                    class48.field895[var5][var6][(-(var8 + 1) << 6) + var7] = var13.field2833 + 1;
                                    class65 var14 = new class65();
                                    var14.field1175 = class44.field760 - var4;
                                    var14.field1180 = var13.field2819;
                                    var14.field1179 = var3;
                                    class232.field4361.method1624(var14, 105);
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < 64; var15++) {
                        for (int var16 = -64; var16 < 0; var16++) {
                            byte var17 = arg0[var2++];
                            if (var17 != 0) {
                                if ((var17 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var17 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var17 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public final void method940(int arg0) {
        int var2 = this.field2631;
        field2658++;
        class148 var3 = this.field2636.method1000((byte) 127);
        if (arg0 != -64) {
            this.method940(-26);
        }
        if (var3 == null) {
            this.field2637 = null;
            this.field2647 = 0;
            this.field2631 = -1;
            this.field2640 = 0;
            this.field2642 = 0;
        } else {
            this.field2640 = var3.field2773 * 128;
            this.field2637 = var3.field2817;
            this.field2647 = var3.field2809;
            this.field2631 = var3.field2808;
            this.field2642 = var3.field2797;
        }
        if (this.field2631 != var2 && this.field2646 != null) {
            class226.field4250.method1511(this.field2646);
            this.field2646 = null;
        }
    }
}
