import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class262 extends class107 {

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    private int field4481 = 4;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "I")
    private int field4489 = 4;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "Lpj;")
    public static class237 field4482 = class33.method353("<br>", 107);

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "I")
    public static int field4485 = 0;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field4477 = 0;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "Lpj;")
    public static class237 field4486 = class33.method353("null", 92);

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "Lw;")
    public static class141 field4484 = null;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "Lw;")
    public static class141 field4488;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lvk;Z)V")
    public static final void method1757(class35 arg0, boolean arg1) {
        class247.field4299.method675(arg0, (byte) -86);
        while (true) {
            class35 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class35[][] var7;
            class35 var66;
            do {
                class35 var65;
                do {
                    class35 var64;
                    do {
                        class35 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class35) class247.field4299.method678(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field770);
                                            var3 = var2.field771;
                                            var4 = var2.field758;
                                            var5 = var2.field777;
                                            var6 = var2.field761;
                                            var7 = class274.field4775[var5];
                                            if (!var2.field773) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class35 var8 = class274.field4775[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field770) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class275.field4833 && var3 > class143.field2589) {
                                                    class35 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field770 && (var9.field773 || (var2.field768 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class275.field4833 && var3 < class259.field4452 - 1) {
                                                    class35 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field770 && (var10.field773 || (var2.field768 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class207.field3515 && var4 > class91.field1654) {
                                                    class35 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field770 && (var11.field773 || (var2.field768 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class207.field3515 && var4 < class59.field1211 - 1) {
                                                    class35 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field770 && (var12.field773 || (var2.field768 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field773 = false;
                                            if (var2.field774 != null) {
                                                class35 var13 = var2.field774;
                                                if (var13.field756 != null) {
                                                    if (!class143.method983(0, var3, var4)) {
                                                        class233.method1551(var13.field756, 0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, false);
                                                    } else {
                                                        class233.method1551(var13.field756, 0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, true);
                                                    }
                                                } else if (var13.field751 != null) {
                                                    if (!class143.method983(0, var3, var4)) {
                                                        class216.method1452(var13.field751, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, false);
                                                    } else {
                                                        class216.method1452(var13.field751, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, true);
                                                    }
                                                }
                                                class114 var14 = var13.field763;
                                                if (var14 != null) {
                                                    var14.field1999.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var14.field2003 - class249.field4311, var14.field1995 - class32.field696, var14.field2005 - class101.field1800, var14.field2000);
                                                }
                                                for (int var15 = 0; var15 < var13.field759; ++var15) {
                                                    class191 var16 = var13.field755[var15];
                                                    if (var16 != null) {
                                                        var16.field3318.method183(var16.field3328, class24.field436, class160.field2868, class207.field3529, class213.field3645, var16.field3317 - class249.field4311, var16.field3325 - class32.field696, var16.field3312 - class101.field1800, var16.field3314);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field756 != null) {
                                                if (!class143.method983(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field756.field4360 != 12345678 || class247.field4304 && var5 <= class100.field1782) {
                                                        class233.method1551(var2.field756, var6, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, false);
                                                    }
                                                } else {
                                                    class233.method1551(var2.field756, var6, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, true);
                                                }
                                            } else if (var2.field751 != null) {
                                                if (!class143.method983(var6, var3, var4)) {
                                                    var17 = true;
                                                    class216.method1452(var2.field751, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, false);
                                                } else {
                                                    class216.method1452(var2.field751, class24.field436, class160.field2868, class207.field3529, class213.field3645, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class232 var18 = var2.field753;
                                                if (var18 != null && (var18.field4014 & 2147483648L) != 0L) {
                                                    var18.field4012.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var18.field4013 - class249.field4311, var18.field4016 - class32.field696, var18.field4017 - class101.field1800, var18.field4014);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class114 var21 = var2.field763;
                                            class212 var22 = var2.field749;
                                            if (var21 != null || var22 != null) {
                                                if (class275.field4833 == var3) {
                                                    ++var19;
                                                } else if (class275.field4833 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class207.field3515 == var4) {
                                                    var19 += 3;
                                                } else if (class207.field3515 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class210.field3584[var19];
                                                var2.field769 = class121.field2143[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1996 & class255.field4382[var19]) != 0) {
                                                    if (var21.field1996 == 16) {
                                                        var2.field766 = 3;
                                                        var2.field748 = class69.field1353[var19];
                                                        var2.field772 = 3 - var2.field748;
                                                    } else if (var21.field1996 == 32) {
                                                        var2.field766 = 6;
                                                        var2.field748 = class177.field3124[var19];
                                                        var2.field772 = 6 - var2.field748;
                                                    } else if (var21.field1996 == 64) {
                                                        var2.field766 = 12;
                                                        var2.field748 = class131.field2300[var19];
                                                        var2.field772 = 12 - var2.field748;
                                                    } else {
                                                        var2.field766 = 9;
                                                        var2.field748 = class224.field3854[var19];
                                                        var2.field772 = 9 - var2.field748;
                                                    }
                                                } else {
                                                    var2.field766 = 0;
                                                }
                                                if ((var21.field1996 & var20) != 0 && !class139.method962(var6, var3, var4, var21.field1996)) {
                                                    var21.field1999.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var21.field2003 - class249.field4311, var21.field1995 - class32.field696, var21.field2005 - class101.field1800, var21.field2000);
                                                }
                                                if ((var21.field2004 & var20) != 0 && !class139.method962(var6, var3, var4, var21.field2004)) {
                                                    var21.field1993.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var21.field2003 - class249.field4311, var21.field1995 - class32.field696, var21.field2005 - class101.field1800, var21.field2000);
                                                }
                                            }
                                            if (var22 != null && !class195.method1345(var6, var3, var4, var22.field3604.method176())) {
                                                if ((var22.field3608 & var20) != 0) {
                                                    var22.field3604.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var22.field3622 - class249.field4311 + var22.field3615, var22.field3613 - class32.field696, var22.field3610 - class101.field1800 + var22.field3619, var22.field3617);
                                                } else if (var22.field3608 == 256) {
                                                    int var23 = var22.field3622 - class249.field4311;
                                                    int var24 = var22.field3613 - class32.field696;
                                                    int var25 = var22.field3610 - class101.field1800;
                                                    int var26 = var22.field3606;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3604.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var22.field3615 + var23, var24, var22.field3619 + var25, var22.field3617);
                                                    } else if (var22.field3605 != null) {
                                                        var22.field3605.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var23, var24, var25, var22.field3617);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class232 var29 = var2.field753;
                                                if (var29 != null && (var29.field4014 & 2147483648L) == 0L) {
                                                    var29.field4012.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var29.field4013 - class249.field4311, var29.field4016 - class32.field696, var29.field4017 - class101.field1800, var29.field4014);
                                                }
                                                class244 var30 = var2.field762;
                                                if (var30 != null && var30.field4281 == 0) {
                                                    if (var30.field4278 != null) {
                                                        var30.field4278.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var30.field4284 - class249.field4311, var30.field4277 - class32.field696, var30.field4273 - class101.field1800, var30.field4275);
                                                    }
                                                    if (var30.field4272 != null) {
                                                        var30.field4272.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var30.field4284 - class249.field4311, var30.field4277 - class32.field696, var30.field4273 - class101.field1800, var30.field4275);
                                                    }
                                                    if (var30.field4271 != null) {
                                                        var30.field4271.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var30.field4284 - class249.field4311, var30.field4277 - class32.field696, var30.field4273 - class101.field1800, var30.field4275);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field768;
                                            if (var31 != 0) {
                                                if (var3 < class275.field4833 && (var31 & 4) != 0) {
                                                    class35 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field770) {
                                                        class247.field4299.method675(var32, (byte) -74);
                                                    }
                                                }
                                                if (var4 < class207.field3515 && (var31 & 2) != 0) {
                                                    class35 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field770) {
                                                        class247.field4299.method675(var33, (byte) -39);
                                                    }
                                                }
                                                if (var3 > class275.field4833 && (var31 & 1) != 0) {
                                                    class35 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field770) {
                                                        class247.field4299.method675(var34, (byte) -59);
                                                    }
                                                }
                                                if (var4 > class207.field3515 && (var31 & 8) != 0) {
                                                    class35 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field770) {
                                                        class247.field4299.method675(var35, (byte) -104);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field766 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field759; ++var37) {
                                                if (class14.field234 != var2.field755[var37].field3319 && (var2.field765[var37] & var2.field766) == var2.field748) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class114 var38 = var2.field763;
                                                if (!class139.method962(var6, var3, var4, var38.field1996)) {
                                                    var38.field1999.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var38.field2003 - class249.field4311, var38.field1995 - class32.field696, var38.field2005 - class101.field1800, var38.field2000);
                                                }
                                                var2.field766 = 0;
                                            }
                                        }
                                        if (!var2.field775) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field759;
                                            var2.field775 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class191 var42 = var2.field755[var41];
                                                if (class14.field234 != var42.field3319) {
                                                    for (int var43 = var42.field3316; var43 <= var42.field3327; ++var43) {
                                                        for (int var44 = var42.field3315; var44 <= var42.field3320; ++var44) {
                                                            class35 var45 = var7[var43][var44];
                                                            if (var45.field773) {
                                                                var2.field775 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field766 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3316) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field3327) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3315) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3320) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field766) == var2.field772) {
                                                                    var2.field775 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class261.field4476[var40++] = var42;
                                                    int var47 = class275.field4833 - var42.field3316;
                                                    int var48 = var42.field3327 - class275.field4833;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class207.field3515 - var42.field3315;
                                                    int var50 = var42.field3320 - class207.field3515;
                                                    if (var50 > var49) {
                                                        var42.field3322 = var47 + var50;
                                                    } else {
                                                        var42.field3322 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class191 var54 = class261.field4476[var53];
                                                    if (class14.field234 != var54.field3319) {
                                                        if (var54.field3322 > var51) {
                                                            var51 = var54.field3322;
                                                            var52 = var53;
                                                        } else if (var54.field3322 == var51) {
                                                            int var55 = var54.field3317 - class249.field4311;
                                                            int var56 = var54.field3312 - class101.field1800;
                                                            int var57 = class261.field4476[var52].field3317 - class249.field4311;
                                                            int var58 = class261.field4476[var52].field3312 - class101.field1800;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class191 var59 = class261.field4476[var52];
                                                var59.field3319 = class14.field234;
                                                if (!class232.method1541(var6, var59.field3316, var59.field3327, var59.field3315, var59.field3320, var59.field3318.method176())) {
                                                    var59.field3318.method183(var59.field3328, class24.field436, class160.field2868, class207.field3529, class213.field3645, var59.field3317 - class249.field4311, var59.field3325 - class32.field696, var59.field3312 - class101.field1800, var59.field3314);
                                                }
                                                for (int var60 = var59.field3316; var60 <= var59.field3327; ++var60) {
                                                    for (int var61 = var59.field3315; var61 <= var59.field3320; ++var61) {
                                                        class35 var62 = var7[var60][var61];
                                                        if (var62.field766 != 0) {
                                                            class247.field4299.method675(var62, (byte) -65);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field770) {
                                                            class247.field4299.method675(var62, (byte) -89);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field775) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field775 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field770);
                            } while (var2.field766 != 0);
                            if (var3 > class275.field4833 || var3 <= class143.field2589) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field770);
                        if (var3 < class275.field4833 || var3 >= class259.field4452 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field770);
                    if (var4 > class207.field3515 || var4 <= class91.field1654) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field770);
                if (var4 < class207.field3515 || var4 >= class59.field1211 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field770);
            var2.field770 = false;
            --class92.field1661;
            class244 var67 = var2.field762;
            if (var67 != null && var67.field4281 != 0) {
                if (var67.field4278 != null) {
                    var67.field4278.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var67.field4284 - class249.field4311, var67.field4277 - class32.field696 - var67.field4281, var67.field4273 - class101.field1800, var67.field4275);
                }
                if (var67.field4272 != null) {
                    var67.field4272.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var67.field4284 - class249.field4311, var67.field4277 - class32.field696 - var67.field4281, var67.field4273 - class101.field1800, var67.field4275);
                }
                if (var67.field4271 != null) {
                    var67.field4271.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var67.field4284 - class249.field4311, var67.field4277 - class32.field696 - var67.field4281, var67.field4273 - class101.field1800, var67.field4275);
                }
            }
            if (var2.field769 != 0) {
                class212 var68 = var2.field749;
                if (var68 != null && !class195.method1345(var6, var3, var4, var68.field3604.method176())) {
                    if ((var68.field3608 & var2.field769) != 0) {
                        var68.field3604.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var68.field3622 - class249.field4311 + var68.field3615, var68.field3613 - class32.field696, var68.field3610 - class101.field1800 + var68.field3619, var68.field3617);
                    } else if (var68.field3608 == 256) {
                        int var69 = var68.field3622 - class249.field4311;
                        int var70 = var68.field3613 - class32.field696;
                        int var71 = var68.field3610 - class101.field1800;
                        int var72 = var68.field3606;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field3604.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var68.field3615 + var69, var70, var68.field3619 + var71, var68.field3617);
                        } else if (var68.field3605 != null) {
                            var68.field3605.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var69, var70, var71, var68.field3617);
                        }
                    }
                }
                class114 var75 = var2.field763;
                if (var75 != null) {
                    if ((var75.field2004 & var2.field769) != 0 && !class139.method962(var6, var3, var4, var75.field2004)) {
                        var75.field1993.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var75.field2003 - class249.field4311, var75.field1995 - class32.field696, var75.field2005 - class101.field1800, var75.field2000);
                    }
                    if ((var75.field1996 & var2.field769) != 0 && !class139.method962(var6, var3, var4, var75.field1996)) {
                        var75.field1999.method183(0, class24.field436, class160.field2868, class207.field3529, class213.field3645, var75.field2003 - class249.field4311, var75.field1995 - class32.field696, var75.field2005 - class101.field1800, var75.field2000);
                    }
                }
            }
            if (var5 < class158.field2852 - 1) {
                class35 var76 = class274.field4775[var5 + 1][var3][var4];
                if (var76 != null && var76.field770) {
                    class247.field4299.method675(var76, (byte) -106);
                }
            }
            if (var3 < class275.field4833) {
                class35 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field770) {
                    class247.field4299.method675(var77, (byte) -45);
                }
            }
            if (var4 < class207.field3515) {
                class35 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field770) {
                    class247.field4299.method675(var78, (byte) -96);
                }
            }
            if (var3 > class275.field4833) {
                class35 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field770) {
                    class247.field4299.method675(var79, (byte) -106);
                }
            }
            if (var4 > class207.field3515) {
                class35 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field770) {
                    class247.field4299.method675(var80, (byte) -74);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)I")
    public static final int method1758(int arg0) {
        if (arg0 > -26) {
            return 107;
        } else {
            ++field4479;
            return ((~class113.field1983 != -1 ? 1 : 0) << 21) + ((~class78.field1459 != -1 ? 1 : 0) << 20) + ((!class141.field2499 ? 0 : 1) << 19) + ((class52.field1099 ? 1 : 0) << 15) + ((!class59.field1212 ? 0 : 1) << 13) + ((!class63.field1256 ? 0 : 1) << 10) + ((!class59.field1207 ? 0 : 1) << 9) + ((class223.field3837 ? 1 : 0) << 6) + ((!class22.field401 ? 0 : 1) << 5) + ((!class92.field1662 ? 0 : 1) << 4) + (class10.field196 & 7) + (((class271.field4649 ? 1 : 0) << 3) - -((!class13.field227 ? 0 : 1) << 7)) + ((class20.field382 ? 1 : 0) << 8) + (6144 & class91.field1656 << 11) - (-((!class238.field4159 ? 0 : 1) << 16) + -(393216 & class122.field2153 << 17)) + ((class204.field3497 == 0 ? 0 : 1) << 22);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field4480;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field4481 = arg0.method316((byte) -38);
            }
        } else {
            this.field4489 = arg0.method316((byte) -91);
        }
        if (arg2 != -32513) {
            field4482 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        ++field4478;
        int[][] var3 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int var4 = class106.field1862 / this.field4489;
            int var5 = class193.field3342 / this.field4481;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method802(3, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method802(3, class193.field3342 * var7 / var5, 0);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[0];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class106.field1862 > var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class106.field1862 * var16 / var4;
                }
                var11[var14] = var9[var15];
                var12[var14] = var8[var15];
                var13[var14] = var10[var15];
            }
        }
        int var17 = -86 % ((arg0 - 26) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
    public static void method1759(byte arg0) {
        field4482 = null;
        field4486 = null;
        field4484 = null;
        if (arg0 == 89) {
            field4488 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class262() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILfa;)V")
    public static final void method1760(int arg0, class239 arg1) {
        if (arg0 != -678727418) {
            field4488 = null;
        }
        class39.field908 = arg1;
        ++field4490;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            ++field4487;
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            if (super.field1921.field3539) {
                int var4 = class106.field1862 / this.field4489;
                int var5 = class193.field3342 / this.field4481;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method797(0, 0, (byte) 113);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method797(0, class193.field3342 * var7 / var5, (byte) 100);
                }
                for (int var8 = 0; ~class106.field1862 < ~var8; ++var8) {
                    if (var4 <= 0) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class106.field1862 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IB)V")
    public static final void method1761(int arg0, byte arg1) {
        class225 var2;
        if (class160.field2880 != null) {
            var2 = (class225) class160.field2880;
        } else {
            var2 = new class225(512, 512);
        }
        int[] var3 = var2.field3867;
        ++field4483;
        int var4 = var3.length;
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            var3[var5] = 1;
        }
        if (arg1 != -116) {
            field4485 = 58;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (52736 - var6 * 512) * 4 + 24628;
            for (int var25 = 1; ~var25 > -104; ++var25) {
                if (~(24 & class73.field1410[arg0][var25][var6]) == -1) {
                    class85.method648(var3, var24, 512, arg0, var25, var6);
                }
                if (~arg0 > -4 && ~(8 & class73.field1410[arg0 - -1][var25][var6]) != -1) {
                    class85.method648(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1502();
        int var7 = (238 - (-((int) (Math.random() * 20.0D)) - -10) << 8) + (-10 + (int) (20.0D * Math.random()) + 238 << 16) + -10 + (int) (20.0D * Math.random()) + 238;
        int var8 = 238 + (int) (Math.random() * 20.0D) + -10 << 16;
        for (int var9 = 1; ~var9 > -104; ++var9) {
            for (int var23 = 1; ~var23 > -104; ++var23) {
                if (~(24 & class73.field1410[arg0][var23][var9]) == -1) {
                    class112.method825(var9, arg0, var7, arg1 + 6, var8, var23);
                }
                if (arg0 < 3 && (8 & class73.field1410[arg0 + 1][var23][var9]) != 0) {
                    class112.method825(var9, arg0 + 1, var7, -120, var8, var23);
                }
            }
        }
        class247.field4303 = 0;
        for (int var10 = 0; ~var10 > -105; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                long var12 = class125.method892(class274.field4798, var10, var11);
                if (~var12 != -1L) {
                    class28 var14 = class94.method700(arg1 ^ 43, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field553;
                    if (var14.field537 != null) {
                        for (int var16 = 0; var14.field537.length > var16; ++var16) {
                            if (~var14.field537[var16] != 0) {
                                class28 var17 = class94.method700(-98, var14.field537[var16]);
                                if (var17.field553 >= 0) {
                                    var15 = var17.field553;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var15 <= -1) {
                        int var18 = var10;
                        int var19 = var11;
                        if (~var15 != -23 && var15 != 29 && ~var15 != -35 && ~var15 != -37 && var15 != 46 && var15 != 47 && ~var15 != -49) {
                            int[][] var20 = class146.field2613[class274.field4798].field470;
                            for (int var21 = 0; ~var21 > -11; ++var21) {
                                int var22 = (int) (4.0D * Math.random());
                                if (~var22 == -1 && ~var18 < -1 && var18 > var10 - 3 && (var20[var18 + -1][var19] & 19661064) == 0) {
                                    --var18;
                                }
                                if (var22 == 1 && var18 < 103 && ~(var10 + 3) < ~var18 && ~(var20[var18 + 1][var19] & 19661184) == -1) {
                                    ++var18;
                                }
                                if (~var22 == -3 && var19 > 0 && var11 + -3 < var19 && ~(19661058 & var20[var18][var19 + -1]) == -1) {
                                    --var19;
                                }
                                if (~var22 == -4 && ~var19 > -104 && var19 < var11 + 3 && (var20[var18][var19 - -1] & 19661088) == 0) {
                                    ++var19;
                                }
                            }
                        }
                        class224.field3864[class247.field4303] = var14.field527;
                        class259.field4453[class247.field4303] = var18;
                        class14.field241[class247.field4303] = var19;
                        ++class247.field4303;
                    }
                }
            }
        }
        class160.field2880 = var2;
        class38.field845.method153(100);
    }
}
