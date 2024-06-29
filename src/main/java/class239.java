import java.util.Calendar;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class239 extends class89 {

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    private int field4248 = 0;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    private int field4244 = 1024;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    private int field4247 = 1024;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    private int field4251 = 2048;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    private int field4249 = 1024;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    private int field4245 = 1024;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    private int field4258 = 409;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    private int field4257 = 0;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    private int field4253 = 819;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4252 = Calendar.getInstance();

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "Lha;")
    public static class46 field4259 = class271.method1828("Zugewiesener Speicher)3", -46);

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "Lha;")
    public static class46 field4260 = class271.method1828("leuchten1:", -46);

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Lha;")
    private static class46 field4261 = class271.method1828("Please wait )2 attempting to reestablish)3", -46);

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "Lha;")
    public static class46 field4262 = class271.method1828("lila:", -46);

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "Lha;")
    public static class46 field4263 = field4261;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "[J")
    public static long[] field4264 = new long[32];

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lmk;Z)V")
    public static final void method1643(class201 arg0, boolean arg1) {
        class144.field2613.method265(arg0, -501);
        while (true) {
            class201 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class201[][] var7;
            class201 var66;
            do {
                class201 var65;
                do {
                    class201 var64;
                    do {
                        class201 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class201) class144.field2613.method260((byte) 57);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3593);
                                            var3 = var2.field3591;
                                            var4 = var2.field3602;
                                            var5 = var2.field3586;
                                            var6 = var2.field3604;
                                            var7 = class111.field2080[var5];
                                            if (!var2.field3592) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class201 var8 = class111.field2080[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3593) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class258.field4503 && var3 > class127.field2323) {
                                                    class201 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3593 && (var9.field3592 || (var2.field3597 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class258.field4503 && var3 < class42.field716 - 1) {
                                                    class201 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3593 && (var10.field3592 || (var2.field3597 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class267.field4623 && var4 > class53.field923) {
                                                    class201 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3593 && (var11.field3592 || (var2.field3597 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class267.field4623 && var4 < class113.field2141 - 1) {
                                                    class201 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3593 && (var12.field3592 || (var2.field3597 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3592 = false;
                                            if (var2.field3595 != null) {
                                                class201 var13 = var2.field3595;
                                                if (var13.field3590 != null) {
                                                    if (!class273.method1843(0, var3, var4)) {
                                                        class124.method966(var13.field3590, 0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, false);
                                                    } else {
                                                        class124.method966(var13.field3590, 0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, true);
                                                    }
                                                } else if (var13.field3599 != null) {
                                                    if (!class273.method1843(0, var3, var4)) {
                                                        class130.method1006(var13.field3599, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, false);
                                                    } else {
                                                        class130.method1006(var13.field3599, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, true);
                                                    }
                                                }
                                                class255 var14 = var13.field3589;
                                                if (var14 != null) {
                                                    var14.field4466.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var14.field4469 - class93.field1751, var14.field4472 - class200.field3577, var14.field4460 - class118.field2224, var14.field4464);
                                                }
                                                for (int var15 = 0; var15 < var13.field3585; ++var15) {
                                                    class197 var16 = var13.field3600[var15];
                                                    if (var16 != null) {
                                                        var16.field3532.method185(var16.field3519, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var16.field3537 - class93.field1751, var16.field3516 - class200.field3577, var16.field3515 - class118.field2224, var16.field3523);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3590 != null) {
                                                if (!class273.method1843(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3590.field4611 != 12345678 || class240.field4278 && var5 <= class221.field3880) {
                                                        class124.method966(var2.field3590, var6, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, false);
                                                    }
                                                } else {
                                                    class124.method966(var2.field3590, var6, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, true);
                                                }
                                            } else if (var2.field3599 != null) {
                                                if (!class273.method1843(var6, var3, var4)) {
                                                    var17 = true;
                                                    class130.method1006(var2.field3599, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, false);
                                                } else {
                                                    class130.method1006(var2.field3599, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class182 var18 = var2.field3607;
                                                if (var18 != null && (var18.field3272 & 2147483648L) != 0L) {
                                                    var18.field3269.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var18.field3271 - class93.field1751, var18.field3274 - class200.field3577, var18.field3277 - class118.field2224, var18.field3272);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class255 var21 = var2.field3589;
                                            class168 var22 = var2.field3606;
                                            if (var21 != null || var22 != null) {
                                                if (class258.field4503 == var3) {
                                                    ++var19;
                                                } else if (class258.field4503 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class267.field4623 == var4) {
                                                    var19 += 3;
                                                } else if (class267.field4623 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class16.field245[var19];
                                                var2.field3596 = class244.field4344[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field4468 & class12.field190[var19]) != 0) {
                                                    if (var21.field4468 == 16) {
                                                        var2.field3587 = 3;
                                                        var2.field3603 = class248.field4385[var19];
                                                        var2.field3594 = 3 - var2.field3603;
                                                    } else if (var21.field4468 == 32) {
                                                        var2.field3587 = 6;
                                                        var2.field3603 = client.field4701[var19];
                                                        var2.field3594 = 6 - var2.field3603;
                                                    } else if (var21.field4468 == 64) {
                                                        var2.field3587 = 12;
                                                        var2.field3603 = class79.field1509[var19];
                                                        var2.field3594 = 12 - var2.field3603;
                                                    } else {
                                                        var2.field3587 = 9;
                                                        var2.field3603 = class196.field3502[var19];
                                                        var2.field3594 = 9 - var2.field3603;
                                                    }
                                                } else {
                                                    var2.field3587 = 0;
                                                }
                                                if ((var21.field4468 & var20) != 0 && !class60.method409(var6, var3, var4, var21.field4468)) {
                                                    var21.field4466.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var21.field4469 - class93.field1751, var21.field4472 - class200.field3577, var21.field4460 - class118.field2224, var21.field4464);
                                                }
                                                if ((var21.field4473 & var20) != 0 && !class60.method409(var6, var3, var4, var21.field4473)) {
                                                    var21.field4463.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var21.field4469 - class93.field1751, var21.field4472 - class200.field3577, var21.field4460 - class118.field2224, var21.field4464);
                                                }
                                            }
                                            if (var22 != null && !class187.method1361(var6, var3, var4, var22.field2951.method183())) {
                                                if ((var22.field2975 & var20) != 0) {
                                                    var22.field2951.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var22.field2961 - class93.field1751 + var22.field2960, var22.field2948 - class200.field3577, var22.field2967 - class118.field2224 + var22.field2955, var22.field2949);
                                                } else if (var22.field2975 == 256) {
                                                    int var23 = var22.field2961 - class93.field1751;
                                                    int var24 = var22.field2948 - class200.field3577;
                                                    int var25 = var22.field2967 - class118.field2224;
                                                    int var26 = var22.field2966;
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
                                                        var22.field2951.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var22.field2960 + var23, var24, var22.field2955 + var25, var22.field2949);
                                                    } else if (var22.field2964 != null) {
                                                        var22.field2964.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var23, var24, var25, var22.field2949);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class182 var29 = var2.field3607;
                                                if (var29 != null && (var29.field3272 & 2147483648L) == 0L) {
                                                    var29.field3269.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var29.field3271 - class93.field1751, var29.field3274 - class200.field3577, var29.field3277 - class118.field2224, var29.field3272);
                                                }
                                                class52 var30 = var2.field3598;
                                                if (var30 != null && var30.field900 == 0) {
                                                    if (var30.field904 != null) {
                                                        var30.field904.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var30.field907 - class93.field1751, var30.field899 - class200.field3577, var30.field911 - class118.field2224, var30.field910);
                                                    }
                                                    if (var30.field902 != null) {
                                                        var30.field902.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var30.field907 - class93.field1751, var30.field899 - class200.field3577, var30.field911 - class118.field2224, var30.field910);
                                                    }
                                                    if (var30.field903 != null) {
                                                        var30.field903.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var30.field907 - class93.field1751, var30.field899 - class200.field3577, var30.field911 - class118.field2224, var30.field910);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3597;
                                            if (var31 != 0) {
                                                if (var3 < class258.field4503 && (var31 & 4) != 0) {
                                                    class201 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3593) {
                                                        class144.field2613.method265(var32, -501);
                                                    }
                                                }
                                                if (var4 < class267.field4623 && (var31 & 2) != 0) {
                                                    class201 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3593) {
                                                        class144.field2613.method265(var33, -501);
                                                    }
                                                }
                                                if (var3 > class258.field4503 && (var31 & 1) != 0) {
                                                    class201 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3593) {
                                                        class144.field2613.method265(var34, -501);
                                                    }
                                                }
                                                if (var4 > class267.field4623 && (var31 & 8) != 0) {
                                                    class201 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3593) {
                                                        class144.field2613.method265(var35, -501);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3587 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3585; ++var37) {
                                                if (class61.field1027 != var2.field3600[var37].field3531 && (var2.field3601[var37] & var2.field3587) == var2.field3603) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class255 var38 = var2.field3589;
                                                if (!class60.method409(var6, var3, var4, var38.field4468)) {
                                                    var38.field4466.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var38.field4469 - class93.field1751, var38.field4472 - class200.field3577, var38.field4460 - class118.field2224, var38.field4464);
                                                }
                                                var2.field3587 = 0;
                                            }
                                        }
                                        if (!var2.field3588) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3585;
                                            var2.field3588 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class197 var42 = var2.field3600[var41];
                                                if (class61.field1027 != var42.field3531) {
                                                    for (int var43 = var42.field3541; var43 <= var42.field3540; ++var43) {
                                                        for (int var44 = var42.field3533; var44 <= var42.field3530; ++var44) {
                                                            class201 var45 = var7[var43][var44];
                                                            if (var45.field3592) {
                                                                var2.field3588 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3587 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3541) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field3540) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3533) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3530) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3587) == var2.field3594) {
                                                                    var2.field3588 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class198.field3544[var40++] = var42;
                                                    int var47 = class258.field4503 - var42.field3541;
                                                    int var48 = var42.field3540 - class258.field4503;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class267.field4623 - var42.field3533;
                                                    int var50 = var42.field3530 - class267.field4623;
                                                    if (var50 > var49) {
                                                        var42.field3527 = var47 + var50;
                                                    } else {
                                                        var42.field3527 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class197 var54 = class198.field3544[var53];
                                                    if (class61.field1027 != var54.field3531) {
                                                        if (var54.field3527 > var51) {
                                                            var51 = var54.field3527;
                                                            var52 = var53;
                                                        } else if (var54.field3527 == var51) {
                                                            int var55 = var54.field3537 - class93.field1751;
                                                            int var56 = var54.field3515 - class118.field2224;
                                                            int var57 = class198.field3544[var52].field3537 - class93.field1751;
                                                            int var58 = class198.field3544[var52].field3515 - class118.field2224;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class197 var59 = class198.field3544[var52];
                                                var59.field3531 = class61.field1027;
                                                if (!class230.method1561(var6, var59.field3541, var59.field3540, var59.field3533, var59.field3530, var59.field3532.method183())) {
                                                    var59.field3532.method185(var59.field3519, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var59.field3537 - class93.field1751, var59.field3516 - class200.field3577, var59.field3515 - class118.field2224, var59.field3523);
                                                }
                                                for (int var60 = var59.field3541; var60 <= var59.field3540; ++var60) {
                                                    for (int var61 = var59.field3533; var61 <= var59.field3530; ++var61) {
                                                        class201 var62 = var7[var60][var61];
                                                        if (var62.field3587 != 0) {
                                                            class144.field2613.method265(var62, -501);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3593) {
                                                            class144.field2613.method265(var62, -501);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3588) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3588 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3593);
                            } while (var2.field3587 != 0);
                            if (var3 > class258.field4503 || var3 <= class127.field2323) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3593);
                        if (var3 < class258.field4503 || var3 >= class42.field716 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3593);
                    if (var4 > class267.field4623 || var4 <= class53.field923) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3593);
                if (var4 < class267.field4623 || var4 >= class113.field2141 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3593);
            var2.field3593 = false;
            --class167.field2946;
            class52 var67 = var2.field3598;
            if (var67 != null && var67.field900 != 0) {
                if (var67.field904 != null) {
                    var67.field904.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var67.field907 - class93.field1751, var67.field899 - class200.field3577 - var67.field900, var67.field911 - class118.field2224, var67.field910);
                }
                if (var67.field902 != null) {
                    var67.field902.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var67.field907 - class93.field1751, var67.field899 - class200.field3577 - var67.field900, var67.field911 - class118.field2224, var67.field910);
                }
                if (var67.field903 != null) {
                    var67.field903.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var67.field907 - class93.field1751, var67.field899 - class200.field3577 - var67.field900, var67.field911 - class118.field2224, var67.field910);
                }
            }
            if (var2.field3596 != 0) {
                class168 var68 = var2.field3606;
                if (var68 != null && !class187.method1361(var6, var3, var4, var68.field2951.method183())) {
                    if ((var68.field2975 & var2.field3596) != 0) {
                        var68.field2951.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var68.field2961 - class93.field1751 + var68.field2960, var68.field2948 - class200.field3577, var68.field2967 - class118.field2224 + var68.field2955, var68.field2949);
                    } else if (var68.field2975 == 256) {
                        int var69 = var68.field2961 - class93.field1751;
                        int var70 = var68.field2948 - class200.field3577;
                        int var71 = var68.field2967 - class118.field2224;
                        int var72 = var68.field2966;
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
                            var68.field2951.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var68.field2960 + var69, var70, var68.field2955 + var71, var68.field2949);
                        } else if (var68.field2964 != null) {
                            var68.field2964.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var69, var70, var71, var68.field2949);
                        }
                    }
                }
                class255 var75 = var2.field3589;
                if (var75 != null) {
                    if ((var75.field4473 & var2.field3596) != 0 && !class60.method409(var6, var3, var4, var75.field4473)) {
                        var75.field4463.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var75.field4469 - class93.field1751, var75.field4472 - class200.field3577, var75.field4460 - class118.field2224, var75.field4464);
                    }
                    if ((var75.field4468 & var2.field3596) != 0 && !class60.method409(var6, var3, var4, var75.field4468)) {
                        var75.field4466.method185(0, class254.field4454, class261.field4554, class169.field3009, class171.field3049, var75.field4469 - class93.field1751, var75.field4472 - class200.field3577, var75.field4460 - class118.field2224, var75.field4464);
                    }
                }
            }
            if (var5 < class198.field3545 - 1) {
                class201 var76 = class111.field2080[var5 + 1][var3][var4];
                if (var76 != null && var76.field3593) {
                    class144.field2613.method265(var76, -501);
                }
            }
            if (var3 < class258.field4503) {
                class201 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3593) {
                    class144.field2613.method265(var77, -501);
                }
            }
            if (var4 < class267.field4623) {
                class201 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3593) {
                    class144.field2613.method265(var78, -501);
                }
            }
            if (var3 > class258.field4503) {
                class201 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3593) {
                    class144.field2613.method265(var79, -501);
                }
            }
            if (var4 > class267.field4623) {
                class201 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3593) {
                    class144.field2613.method265(var80, -501);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1644(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            ++field4246;
            return (384610614 & arg0) >> 28 != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public static void method1645(byte arg0) {
        field4261 = null;
        field4262 = null;
        field4252 = null;
        field4260 = null;
        if (arg0 != -59) {
            method1645((byte) 82);
        }
        field4264 = null;
        field4259 = null;
        field4263 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int[] var3 = super.field1688.method936(1, arg0);
        ++field4254;
        if (super.field1688.field2200) {
            int[][] var4 = super.field1688.method934(26428);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class241.field4284 * this.field4249 >> 12;
            int var15 = class241.field4284 * this.field4251 >> 12;
            int var16 = class113.field2149 * this.field4258 >> 12;
            int var17 = class113.field2149 * this.field4253 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field4255 = class241.field4284 / 8 * this.field4245 >> 12;
            int var18 = class241.field4284 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field4248);
            int[][] var21 = new int[var18][3];
            label122: while (true) {
                while (true) {
                    int var22 = var14 - -class98.method761(var20, false, var15 - var14);
                    int var23 = class98.method761(var20, false, var17 - var16) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class241.field4284) {
                        var24 = class241.field4284;
                        var22 = -var8 + class241.field4284;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int var26 = 0;
                        int var27 = var6 + var24;
                        int[] var28 = var21[var9];
                        if (var27 < 0) {
                            var27 += class241.field4284;
                        }
                        var29 = var28[2];
                        if (~class241.field4284 > ~var27) {
                            var27 -= class241.field4284;
                        }
                        while (true) {
                            int[] var30 = var21[var25];
                            if (var30[0] <= var27 && var27 <= var30[1]) {
                                if (~var9 != ~var25) {
                                    int var31 = var6 + var8;
                                    if (~var31 > -1) {
                                        var31 += class241.field4284;
                                    }
                                    if (~class241.field4284 > ~var31) {
                                        var31 -= class241.field4284;
                                    }
                                    for (int var32 = 1; var26 >= var32; ++var32) {
                                        int[] var40 = var21[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; var26 >= var33; ++var33) {
                                        int[] var34 = var21[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[1];
                                            int var37 = var34[0];
                                            int var38;
                                            int var39;
                                            if (~var27 >= ~var31) {
                                                if (~var37 == -1) {
                                                    var38 = Math.min(var27, var36);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var37);
                                                    var38 = class241.field4284;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var38 = Math.min(var27, var36);
                                            }
                                            this.method1646(-var39 + var38, -var35 + var29, var5 + var39, (byte) 23, var20, var35, var4);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var26;
                            ++var25;
                            if (~var25 <= ~var12) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class113.field2149 <= ~(var23 + var29)) {
                        var10 = false;
                    } else {
                        var23 = -var29 + class113.field2149;
                    }
                    if (~class241.field4284 == ~var24) {
                        this.method1646(var22, var23, var8 - -var7, (byte) 23, var20, var29, var4);
                        if (var10) {
                            break label122;
                        }
                        var9 = 0;
                        var11 = false;
                        var5 = var7;
                        int[][] var41 = var21;
                        int[] var42 = var19[var13++];
                        var42[2] = var23 + var29;
                        var42[0] = var8;
                        var8 = 0;
                        var12 = var13;
                        var42[1] = var24;
                        var13 = 0;
                        var7 = class98.method761(var20, false, class241.field4284);
                        var10 = true;
                        var6 = -var5 + var7;
                        var21 = var19;
                        int var43 = var6;
                        if (~var6 > -1) {
                            var43 = class241.field4284 + var6;
                        }
                        if (~var43 < ~class241.field4284) {
                            var43 -= class241.field4284;
                        }
                        while (true) {
                            int[] var44 = var21[var9];
                            if (~var43 <= ~var44[0] && var44[1] >= var43) {
                                var19 = var41;
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[2] = var23 + var29;
                        var45[1] = var24;
                        var45[0] = var8;
                        this.method1646(var22, var23, var7 + var8, (byte) 23, var20, var29, var4);
                        var8 = var24;
                    }
                }
            }
        }
        int var46 = 62 / ((51 - arg1) / 44);
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        if (arg0) {
            ++field4250;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIBLjava/util/Random;I[[I)V")
    private final void method1646(int arg0, int arg1, int arg2, byte arg3, Random arg4, int arg5, int[][] arg6) {
        ++field4243;
        int var8 = ~this.field4244 < -1 ? 4096 + -class98.method761(arg4, false, this.field4244) : 4096;
        int var9 = this.field4255 * this.field4247 >> 12;
        int var10 = this.field4255 + -(~var9 < -1 ? class98.method761(arg4, false, var9) : 0);
        if (arg3 != 23) {
            this.field4245 = -61;
        }
        if (class241.field4284 <= arg2) {
            arg2 -= class241.field4284;
        }
        if (var10 <= 0) {
            if (arg0 + arg2 > class241.field4284) {
                int var11 = class241.field4284 - arg2;
                for (int var12 = 0; ~var12 > ~arg1; ++var12) {
                    int[] var13 = arg6[arg5 + var12];
                    class104.method787(var13, arg2, var11, var8);
                    class104.method787(var13, 0, arg0 - var11, var8);
                }
            } else {
                for (int var14 = 0; arg1 > var14; ++var14) {
                    class104.method787(arg6[arg5 + var14], arg2, arg0, var8);
                }
            }
        } else if (~arg1 < -1 && arg0 > 0) {
            int var15 = arg0 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var15 <= ~var10 ? var10 : var15;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg2 + var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; var21 < arg1; ++var21) {
                int[] var22 = arg6[arg5 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field4257 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class50.method369(class115.field2177, arg2 + var24)] = var22[class50.method369(arg0 + arg2 + -var24 + -1, class115.field2177)] = var25 < var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class50.method369(arg2 - -var26, class115.field2177)] = var22[class50.method369(class115.field2177, arg0 + arg2 - 1 + -var26)] = var23 * var28 >> 12;
                        }
                    }
                    if (class241.field4284 < var19 + var20) {
                        int var27 = class241.field4284 - var19;
                        class104.method787(var22, var19, var27, var23);
                        class104.method787(var22, 0, -var27 + var20, var23);
                    } else {
                        class104.method787(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg1 - 1 + -var21;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field4257 == -1) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class50.method369(arg2 + var31, class115.field2177)] = var22[class50.method369(arg2 - var31 + arg0 + -1, class115.field2177)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class50.method369(class115.field2177, arg2 - -var33)] = var22[class50.method369(class115.field2177, -var33 + arg2 + arg0 + -1)] = ~var30 < ~var35 ? var35 : var30;
                            }
                        }
                        if (var19 - -var20 > class241.field4284) {
                            int var34 = class241.field4284 - var19;
                            class104.method787(var22, var19, var34, var30);
                            class104.method787(var22, 0, -var34 + var20, var30);
                        } else {
                            class104.method787(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class50.method369(class115.field2177, arg2 + var36)] = var22[class50.method369(class115.field2177, arg0 + arg2 + -var36 + -1)] = var8 * var36 / var17;
                        }
                        if (class241.field4284 >= var19 - -var20) {
                            class104.method787(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class241.field4284;
                            class104.method787(var22, var19, var37, var8);
                            class104.method787(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            field4262 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field4244 = arg0.method545((byte) 108);
                                        }
                                    } else {
                                        this.field4247 = arg0.method545((byte) -84);
                                    }
                                } else {
                                    this.field4257 = arg0.method558(1);
                                }
                            } else {
                                this.field4245 = arg0.method545((byte) -73);
                            }
                        } else {
                            this.field4253 = arg0.method545((byte) 42);
                        }
                    } else {
                        this.field4258 = arg0.method545((byte) 81);
                    }
                } else {
                    this.field4251 = arg0.method545((byte) 51);
                }
            } else {
                this.field4249 = arg0.method545((byte) -108);
            }
        } else {
            this.field4248 = arg0.method558(1);
        }
        ++field4242;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
    public static final void method1647(boolean arg0) {
        class119.field2244 = null;
        if (arg0) {
            method1645((byte) -12);
        }
        ++field4256;
        class113.field2145 = null;
        class185.field3301 = null;
    }
}
