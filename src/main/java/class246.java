import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class246 extends class40 {

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    private final int field4512;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    private final int field4510;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    private final int field4505;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    private final int field4509;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Lhj;")
    private static class69 field4494 = class181.method1318("flash2:", (byte) -126);

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[I")
    public static int[] field4499 = new int[32];

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Lhj;")
    public static class69 field4498 = field4494;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "[I")
    public static int[] field4495 = new int[128];

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Lhj;")
    public static class69 field4493 = field4494;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "Lhj;")
    public static class69 field4508 = class181.method1318("AUS", (byte) -115);

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Lhj;")
    public static class69 field4503 = class181.method1318("null", (byte) -124);

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Lhj;")
    public static class69 field4513 = class181.method1318("hitbar_default", (byte) -126);

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "F")
    public static float field4502;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "Lke;")
    public static class105 field4504;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "Lcf;")
    public static class91 field4506;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public final void method110(int arg0, int arg1, int arg2) {
        ++field4496;
        int var4 = this.field4510 * arg1 >> 12;
        int var5 = this.field4512 * arg1 >> 12;
        int var6 = this.field4505 * arg0 >> 12;
        int var7 = this.field4509 * arg0 >> 12;
        if (arg2 == 100) {
            class17.method108(super.field565, var5, super.field575, var6, var4, (byte) -125, var7, super.field567);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(BII)V")
    public final void method106(byte arg0, int arg1, int arg2) {
        int var4 = this.field4510 * arg2 >> 12;
        ++field4500;
        int var5 = this.field4505 * arg1 >> 12;
        if (arg0 > -102) {
            method1737(100, false, -118, 48, -73, 102);
        }
        int var6 = this.field4512 * arg2 >> 12;
        int var7 = this.field4509 * arg1 >> 12;
        class11.method52(var4, super.field567, super.field565, var7, var5, var6, true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)V")
    public final void method111(byte arg0, int arg1, int arg2) {
        int var4 = this.field4510 * arg1 >> 12;
        if (arg0 != -101) {
            field4498 = null;
        }
        ++field4492;
        int var5 = this.field4505 * arg2 >> 12;
        int var6 = this.field4509 * arg2 >> 12;
        int var7 = this.field4512 * arg1 >> 12;
        class123.method887(var4, -28, var5, var6, var7, super.field575);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZIIII)V")
    public static final void method1737(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg2; arg2 - -arg5 >= var6; ++var6) {
            for (int var11 = arg4; var11 <= arg0 + arg4; ++var11) {
                if (var11 >= 0 && ~var11 > -105 && var6 >= 0 && ~var6 > -105) {
                    class33.field454[arg3][var11][var6] = 127;
                }
            }
        }
        ++field4501;
        if (arg1) {
            method1741((byte) 26);
        }
        for (int var7 = arg2; arg2 + arg5 > var7; ++var7) {
            for (int var10 = arg4; ~var10 > ~(arg0 + arg4); ++var10) {
                if (~var10 <= -1 && ~var10 > -105 && var7 >= 0 && var7 < 104) {
                    class271.field4793[arg3][var10][var7] = arg3 > 0 ? class271.field4793[arg3 + -1][var10][var7] : 0;
                }
            }
        }
        if (~arg4 < -1 && arg4 < 104) {
            for (int var8 = arg2 + 1; ~(arg2 + arg5) < ~var8; ++var8) {
                if (~var8 <= -1 && var8 < 104) {
                    class271.field4793[arg3][arg4][var8] = class271.field4793[arg3][arg4 + -1][var8];
                }
            }
        }
        if (~arg2 < -1 && arg2 < 104) {
            for (int var9 = arg4 + 1; ~var9 > ~(arg0 + arg4); ++var9) {
                if (var9 >= 0 && var9 < 104) {
                    class271.field4793[arg3][var9][arg2] = class271.field4793[arg3][var9][arg2 + -1];
                }
            }
        }
        if (~arg4 <= -1 && arg2 >= 0 && arg4 < 104 && arg2 < 104) {
            if (arg3 == 0) {
                if (arg4 > 0 && class271.field4793[arg3][arg4 + -1][arg2] != 0) {
                    class271.field4793[arg3][arg4][arg2] = class271.field4793[arg3][arg4 + -1][arg2];
                    return;
                }
                if (~arg2 < -1 && ~class271.field4793[arg3][arg4][arg2 + -1] != -1) {
                    class271.field4793[arg3][arg4][arg2] = class271.field4793[arg3][arg4][arg2 + -1];
                    return;
                }
                if (arg4 > 0 && ~arg2 < -1 && ~class271.field4793[arg3][arg4 - 1][arg2 + -1] != -1) {
                    class271.field4793[arg3][arg4][arg2] = class271.field4793[arg3][arg4 + -1][arg2 + -1];
                    return;
                }
                return;
            }
            if (~arg4 < -1 && ~class271.field4793[arg3][arg4 + -1][arg2] != ~class271.field4793[arg3 + -1][arg4 + -1][arg2]) {
                class271.field4793[arg3][arg4][arg2] = class271.field4793[arg3][arg4 + -1][arg2];
                return;
            }
            if (arg2 > 0 && ~class271.field4793[arg3][arg4][arg2 - 1] != ~class271.field4793[arg3 + -1][arg4][arg2 + -1]) {
                class271.field4793[arg3][arg4][arg2] = class271.field4793[arg3][arg4][arg2 + -1];
                return;
            }
            if (arg4 > 0 && ~arg2 < -1 && ~class271.field4793[arg3 - 1][arg4 - 1][arg2 + -1] != ~class271.field4793[arg3][arg4 + -1][arg2 + -1]) {
                class271.field4793[arg3][arg4][arg2] = class271.field4793[arg3][arg4 + -1][arg2 + -1];
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lrg;Z)V")
    public static final void method1738(class217 arg0, boolean arg1) {
        class164.field3022.method1727(-127, arg0);
        while (true) {
            class217 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class217[][] var7;
            class217 var66;
            do {
                class217 var65;
                do {
                    class217 var64;
                    do {
                        class217 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class217) class164.field3022.method1731((byte) -101);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3928);
                                            var3 = var2.field3927;
                                            var4 = var2.field3931;
                                            var5 = var2.field3929;
                                            var6 = var2.field3930;
                                            var7 = class158.field2935[var5];
                                            if (!var2.field3943) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class217 var8 = class158.field2935[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3928) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class78.field1496 && var3 > class217.field3926) {
                                                    class217 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3928 && (var9.field3943 || (var2.field3948 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class78.field1496 && var3 < class105.field1984 - 1) {
                                                    class217 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3928 && (var10.field3943 || (var2.field3948 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class45.field646 && var4 > class268.field4772) {
                                                    class217 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3928 && (var11.field3943 || (var2.field3948 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class45.field646 && var4 < class182.field3322 - 1) {
                                                    class217 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3928 && (var12.field3943 || (var2.field3948 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3943 = false;
                                            if (var2.field3944 != null) {
                                                class217 var13 = var2.field3944;
                                                if (var13.field3938 != null) {
                                                    if (!class152.method1154(0, var3, var4)) {
                                                        class102.method754(var13.field3938, 0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, false);
                                                    } else {
                                                        class102.method754(var13.field3938, 0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, true);
                                                    }
                                                } else if (var13.field3942 != null) {
                                                    if (!class152.method1154(0, var3, var4)) {
                                                        class144.method1097(var13.field3942, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, false);
                                                    } else {
                                                        class144.method1097(var13.field3942, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, true);
                                                    }
                                                }
                                                class118 var14 = var13.field3932;
                                                if (var14 != null) {
                                                    var14.field2235.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var14.field2239 - class108.field2050, var14.field2231 - class79.field1526, var14.field2229 - class88.field1673, var14.field2238);
                                                }
                                                for (int var15 = 0; var15 < var13.field3940; ++var15) {
                                                    class85 var16 = var13.field3933[var15];
                                                    if (var16 != null) {
                                                        var16.field1660.method212(var16.field1657, class48.field698, class80.field1532, class157.field2927, class130.field2421, var16.field1649 - class108.field2050, var16.field1648 - class79.field1526, var16.field1650 - class88.field1673, var16.field1656);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3938 != null) {
                                                if (!class152.method1154(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field3938.field947 != 12345678 || class196.field3566 && var5 <= class212.field3850) {
                                                        class102.method754(var2.field3938, var6, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, false);
                                                    }
                                                } else {
                                                    class102.method754(var2.field3938, var6, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, true);
                                                }
                                            } else if (var2.field3942 != null) {
                                                if (!class152.method1154(var6, var3, var4)) {
                                                    var17 = true;
                                                    class144.method1097(var2.field3942, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, false);
                                                } else {
                                                    class144.method1097(var2.field3942, class48.field698, class80.field1532, class157.field2927, class130.field2421, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class68 var18 = var2.field3949;
                                                if (var18 != null && (var18.field1293 & 2147483648L) != 0L) {
                                                    var18.field1288.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var18.field1294 - class108.field2050, var18.field1292 - class79.field1526, var18.field1290 - class88.field1673, var18.field1293);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class118 var21 = var2.field3932;
                                            class212 var22 = var2.field3946;
                                            if (var21 != null || var22 != null) {
                                                if (class78.field1496 == var3) {
                                                    ++var19;
                                                } else if (class78.field1496 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class45.field646 == var4) {
                                                    var19 += 3;
                                                } else if (class45.field646 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class38.field530[var19];
                                                var2.field3934 = class53.field948[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2234 & class20.field262[var19]) != 0) {
                                                    if (var21.field2234 == 16) {
                                                        var2.field3937 = 3;
                                                        var2.field3947 = class71.field1383[var19];
                                                        var2.field3936 = 3 - var2.field3947;
                                                    } else if (var21.field2234 == 32) {
                                                        var2.field3937 = 6;
                                                        var2.field3947 = class259.field4641[var19];
                                                        var2.field3936 = 6 - var2.field3947;
                                                    } else if (var21.field2234 == 64) {
                                                        var2.field3937 = 12;
                                                        var2.field3947 = class209.field3804[var19];
                                                        var2.field3936 = 12 - var2.field3947;
                                                    } else {
                                                        var2.field3937 = 9;
                                                        var2.field3947 = class71.field1391[var19];
                                                        var2.field3936 = 9 - var2.field3947;
                                                    }
                                                } else {
                                                    var2.field3937 = 0;
                                                }
                                                if ((var21.field2234 & var20) != 0 && !class203.method1475(var6, var3, var4, var21.field2234)) {
                                                    var21.field2235.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var21.field2239 - class108.field2050, var21.field2231 - class79.field1526, var21.field2229 - class88.field1673, var21.field2238);
                                                }
                                                if ((var21.field2228 & var20) != 0 && !class203.method1475(var6, var3, var4, var21.field2228)) {
                                                    var21.field2227.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var21.field2239 - class108.field2050, var21.field2231 - class79.field1526, var21.field2229 - class88.field1673, var21.field2238);
                                                }
                                            }
                                            if (var22 != null && !class259.method1784(var6, var3, var4, var22.field3857.method211())) {
                                                if ((var22.field3852 & var20) != 0) {
                                                    var22.field3857.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var22.field3856 - class108.field2050 + var22.field3848, var22.field3846 - class79.field1526, var22.field3864 - class88.field1673 + var22.field3851, var22.field3849);
                                                } else if (var22.field3852 == 256) {
                                                    int var23 = var22.field3856 - class108.field2050;
                                                    int var24 = var22.field3846 - class79.field1526;
                                                    int var25 = var22.field3864 - class88.field1673;
                                                    int var26 = var22.field3847;
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
                                                        var22.field3857.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var22.field3848 + var23, var24, var22.field3851 + var25, var22.field3849);
                                                    } else if (var22.field3866 != null) {
                                                        var22.field3866.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var23, var24, var25, var22.field3849);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class68 var29 = var2.field3949;
                                                if (var29 != null && (var29.field1293 & 2147483648L) == 0L) {
                                                    var29.field1288.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var29.field1294 - class108.field2050, var29.field1292 - class79.field1526, var29.field1290 - class88.field1673, var29.field1293);
                                                }
                                                class204 var30 = var2.field3935;
                                                if (var30 != null && var30.field3678 == 0) {
                                                    if (var30.field3679 != null) {
                                                        var30.field3679.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var30.field3669 - class108.field2050, var30.field3675 - class79.field1526, var30.field3674 - class88.field1673, var30.field3672);
                                                    }
                                                    if (var30.field3671 != null) {
                                                        var30.field3671.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var30.field3669 - class108.field2050, var30.field3675 - class79.field1526, var30.field3674 - class88.field1673, var30.field3672);
                                                    }
                                                    if (var30.field3664 != null) {
                                                        var30.field3664.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var30.field3669 - class108.field2050, var30.field3675 - class79.field1526, var30.field3674 - class88.field1673, var30.field3672);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3948;
                                            if (var31 != 0) {
                                                if (var3 < class78.field1496 && (var31 & 4) != 0) {
                                                    class217 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3928) {
                                                        class164.field3022.method1727(-109, var32);
                                                    }
                                                }
                                                if (var4 < class45.field646 && (var31 & 2) != 0) {
                                                    class217 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3928) {
                                                        class164.field3022.method1727(-128, var33);
                                                    }
                                                }
                                                if (var3 > class78.field1496 && (var31 & 1) != 0) {
                                                    class217 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3928) {
                                                        class164.field3022.method1727(-117, var34);
                                                    }
                                                }
                                                if (var4 > class45.field646 && (var31 & 8) != 0) {
                                                    class217 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3928) {
                                                        class164.field3022.method1727(-118, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3937 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3940; ++var37) {
                                                if (class163.field3021 != var2.field3933[var37].field1661 && (var2.field3941[var37] & var2.field3937) == var2.field3947) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class118 var38 = var2.field3932;
                                                if (!class203.method1475(var6, var3, var4, var38.field2234)) {
                                                    var38.field2235.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var38.field2239 - class108.field2050, var38.field2231 - class79.field1526, var38.field2229 - class88.field1673, var38.field2238);
                                                }
                                                var2.field3937 = 0;
                                            }
                                        }
                                        if (!var2.field3945) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3940;
                                            var2.field3945 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class85 var42 = var2.field3933[var41];
                                                if (class163.field3021 != var42.field1661) {
                                                    for (int var43 = var42.field1662; var43 <= var42.field1651; ++var43) {
                                                        for (int var44 = var42.field1653; var44 <= var42.field1655; ++var44) {
                                                            class217 var45 = var7[var43][var44];
                                                            if (var45.field3943) {
                                                                var2.field3945 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3937 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1662) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field1651) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1653) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1655) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3937) == var2.field3936) {
                                                                    var2.field3945 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class163.field3018[var40++] = var42;
                                                    int var47 = class78.field1496 - var42.field1662;
                                                    int var48 = var42.field1651 - class78.field1496;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class45.field646 - var42.field1653;
                                                    int var50 = var42.field1655 - class45.field646;
                                                    if (var50 > var49) {
                                                        var42.field1646 = var47 + var50;
                                                    } else {
                                                        var42.field1646 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class85 var54 = class163.field3018[var53];
                                                    if (class163.field3021 != var54.field1661) {
                                                        if (var54.field1646 > var51) {
                                                            var51 = var54.field1646;
                                                            var52 = var53;
                                                        } else if (var54.field1646 == var51) {
                                                            int var55 = var54.field1649 - class108.field2050;
                                                            int var56 = var54.field1650 - class88.field1673;
                                                            int var57 = class163.field3018[var52].field1649 - class108.field2050;
                                                            int var58 = class163.field3018[var52].field1650 - class88.field1673;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class85 var59 = class163.field3018[var52];
                                                var59.field1661 = class163.field3021;
                                                if (!class129.method965(var6, var59.field1662, var59.field1651, var59.field1653, var59.field1655, var59.field1660.method211())) {
                                                    var59.field1660.method212(var59.field1657, class48.field698, class80.field1532, class157.field2927, class130.field2421, var59.field1649 - class108.field2050, var59.field1648 - class79.field1526, var59.field1650 - class88.field1673, var59.field1656);
                                                }
                                                for (int var60 = var59.field1662; var60 <= var59.field1651; ++var60) {
                                                    for (int var61 = var59.field1653; var61 <= var59.field1655; ++var61) {
                                                        class217 var62 = var7[var60][var61];
                                                        if (var62.field3937 != 0) {
                                                            class164.field3022.method1727(-123, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3928) {
                                                            class164.field3022.method1727(-121, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3945) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3945 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3928);
                            } while (var2.field3937 != 0);
                            if (var3 > class78.field1496 || var3 <= class217.field3926) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3928);
                        if (var3 < class78.field1496 || var3 >= class105.field1984 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3928);
                    if (var4 > class45.field646 || var4 <= class268.field4772) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3928);
                if (var4 < class45.field646 || var4 >= class182.field3322 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3928);
            var2.field3928 = false;
            --class199.field3597;
            class204 var67 = var2.field3935;
            if (var67 != null && var67.field3678 != 0) {
                if (var67.field3679 != null) {
                    var67.field3679.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var67.field3669 - class108.field2050, var67.field3675 - class79.field1526 - var67.field3678, var67.field3674 - class88.field1673, var67.field3672);
                }
                if (var67.field3671 != null) {
                    var67.field3671.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var67.field3669 - class108.field2050, var67.field3675 - class79.field1526 - var67.field3678, var67.field3674 - class88.field1673, var67.field3672);
                }
                if (var67.field3664 != null) {
                    var67.field3664.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var67.field3669 - class108.field2050, var67.field3675 - class79.field1526 - var67.field3678, var67.field3674 - class88.field1673, var67.field3672);
                }
            }
            if (var2.field3934 != 0) {
                class212 var68 = var2.field3946;
                if (var68 != null && !class259.method1784(var6, var3, var4, var68.field3857.method211())) {
                    if ((var68.field3852 & var2.field3934) != 0) {
                        var68.field3857.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var68.field3856 - class108.field2050 + var68.field3848, var68.field3846 - class79.field1526, var68.field3864 - class88.field1673 + var68.field3851, var68.field3849);
                    } else if (var68.field3852 == 256) {
                        int var69 = var68.field3856 - class108.field2050;
                        int var70 = var68.field3846 - class79.field1526;
                        int var71 = var68.field3864 - class88.field1673;
                        int var72 = var68.field3847;
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
                            var68.field3857.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var68.field3848 + var69, var70, var68.field3851 + var71, var68.field3849);
                        } else if (var68.field3866 != null) {
                            var68.field3866.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var69, var70, var71, var68.field3849);
                        }
                    }
                }
                class118 var75 = var2.field3932;
                if (var75 != null) {
                    if ((var75.field2228 & var2.field3934) != 0 && !class203.method1475(var6, var3, var4, var75.field2228)) {
                        var75.field2227.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var75.field2239 - class108.field2050, var75.field2231 - class79.field1526, var75.field2229 - class88.field1673, var75.field2238);
                    }
                    if ((var75.field2234 & var2.field3934) != 0 && !class203.method1475(var6, var3, var4, var75.field2234)) {
                        var75.field2235.method212(0, class48.field698, class80.field1532, class157.field2927, class130.field2421, var75.field2239 - class108.field2050, var75.field2231 - class79.field1526, var75.field2229 - class88.field1673, var75.field2238);
                    }
                }
            }
            if (var5 < class66.field1275 - 1) {
                class217 var76 = class158.field2935[var5 + 1][var3][var4];
                if (var76 != null && var76.field3928) {
                    class164.field3022.method1727(-121, var76);
                }
            }
            if (var3 < class78.field1496) {
                class217 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3928) {
                    class164.field3022.method1727(-123, var77);
                }
            }
            if (var4 < class45.field646) {
                class217 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3928) {
                    class164.field3022.method1727(-112, var78);
                }
            }
            if (var3 > class78.field1496) {
                class217 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3928) {
                    class164.field3022.method1727(-107, var79);
                }
            }
            if (var4 > class45.field646) {
                class217 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3928) {
                    class164.field3022.method1727(-103, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILlh;)V")
    public static final void method1739(int arg0, class272 arg1) {
        ++field4511;
        long var2 = 0L;
        if (arg1.field4815 == 0) {
            var2 = class188.method1367(arg1.field4817, arg1.field4809, arg1.field4808);
        }
        int var4 = -1;
        if (~arg1.field4815 == -2) {
            var2 = class252.method1756(arg1.field4817, arg1.field4809, arg1.field4808);
        }
        if (~arg1.field4815 == -3) {
            var2 = class119.method865(arg1.field4817, arg1.field4809, arg1.field4808);
        }
        if (arg1.field4815 == 3) {
            var2 = class73.method509(arg1.field4817, arg1.field4809, arg1.field4808);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var6 = 31 & (int) var2 >> 14;
            var5 = ((int) var2 & 3910662) >> 20;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        if (arg0 != -26673) {
            field4494 = null;
        }
        arg1.field4810 = var5;
        arg1.field4819 = var6;
        arg1.field4813 = var4;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIII)V")
    public class246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4512 = arg2;
        this.field4510 = arg0;
        this.field4505 = arg1;
        this.field4509 = arg3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
    public static final void method1740(boolean arg0) {
        ++field4507;
        class116.field2222 = new class50[class210.field3819.method587(-17326)][];
        if (arg0) {
            class223.field4066 = new boolean[class210.field3819.method587(-17326)];
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method1741(byte arg0) {
        field4498 = null;
        field4506 = null;
        field4513 = null;
        field4508 = null;
        if (arg0 == -9) {
            field4504 = null;
            field4493 = null;
            field4499 = null;
            field4494 = null;
            field4503 = null;
            field4495 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)Lpa;")
    public static final class204 method1742(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class204 var4 = var3.field3935;
            var3.field3935 = null;
            return var4;
        }
    }
}
