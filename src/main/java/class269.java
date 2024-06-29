import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class269 {

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public final int field4626;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public final int field4613;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public final int field4617;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Lk;")
    public final class237 field4623;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static volatile int field4615 = 0;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "Z")
    public static boolean field4620 = false;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field4619 = 0;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field4621 = 0;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "Lek;")
    public static class185 field4616;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBZIIIZZ)Lkb;", line = 4)
    public static final class35 method1896(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field4612++;
        class313 var8 = class113.method799(arg0, (byte) 50);
        if (arg4 > 1 && var8.field5301 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg4 >= var8.field5269[var10] && var8.field5269[var10] != 0) {
                    var9 = var8.field5301[var10];
                }
            }
            if (var9 != -1) {
                var8 = class113.method799(var9, (byte) 50);
            }
        }
        class32 var11 = var8.method2125((byte) -4);
        if (var11 == null) {
            return null;
        }
        class159 var12 = null;
        if (var8.field5303 != -1) {
            var12 = (class159) method1896(var8.field5304, (byte) -81, false, 1, 10, 0, true, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field5321 != -1) {
            var12 = (class159) method1896(var8.field5325, (byte) -125, false, arg3, arg4, arg5, false, true);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class114.field2055;
        int[] var14 = class114.field2050;
        if (arg1 >= 0) {
            method1902(-26);
        }
        int var15 = class114.field2053;
        int[] var16 = new int[4];
        class114.method804(var16);
        class159 var17 = new class159(36, 32);
        class114.method823(var17.field2708, 36, 32);
        class227.method1591();
        class227.method1596(16, 16);
        int var18 = var8.field5326;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg3 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class227.field3901 = false;
        int var19 = class227.field3911[var8.field5330] * var18 >> 16;
        int var20 = class227.field3896[var8.field5330] * var18 >> 16;
        var11.method275(0, var8.field5317, var8.field5279, var8.field5330, var8.field5308, var20 + var8.field5331 - (var11.method201() / 2), var8.field5331 + var19, -1L);
        if (arg3 >= 1) {
            var17.method1066(1);
            if (arg3 >= 2) {
                var17.method1066(16777215);
            }
            class114.method823(var17.field2708, 36, 32);
        }
        if (arg5 != 0) {
            var17.method1063(arg5);
        }
        if (var8.field5303 != -1) {
            var12.method314(0, 0);
        } else if (var8.field5321 != -1) {
            class114.method823(var12.field2708, 36, 32);
            var17.method314(0, 0);
            var17 = var12;
        }
        if (arg2 && (var8.field5298 == 1 || arg4 != 1) && arg4 != -1) {
            class329.field5598.method957(class329.method2245((byte) 10, arg4), 0, 9, 16776960, 1);
        }
        class114.method823(var14, var13, var15);
        class114.method808(var16);
        class227.method1591();
        class227.field3901 = true;
        return class108.field1900 && !arg7 ? new class326(var17) : var17;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[BZ)Z", line = 147)
    public static final boolean method1897(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field4614++;
        boolean var4 = true;
        if (arg3) {
            method1903(-101);
        }
        class14 var5 = new class14(arg2);
        int var6 = -1;
        label77: while (true) {
            int var7 = var5.method134(32767);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                int var14;
                class83 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method104(-110);
                                        if (var17 == 0) {
                                            continue label77;
                                        }
                                        var5.method93(false);
                                    }
                                    int var10 = var5.method104(-97);
                                    if (var10 == 0) {
                                        continue label77;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var11 + arg0;
                                    var14 = var5.method93(false) >> 2;
                                    var15 = arg1 + var12;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class271.method1909(112, var6);
                } while (var14 == 22 && !class41.field735 && var16.field1566 == 0 && var16.field1551 != 1 && !var16.field1560);
                if (!var16.method587((byte) -61)) {
                    var4 = false;
                    class151.field2613++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "([Ldb;[[F[[BI[[B[[FI[[B[[I[[BZ[[F)V", line = 228)
    public static final void method1898(class186[] arg0, float[][] arg1, byte[][] arg2, int arg3, byte[][] arg4, float[][] arg5, int arg6, byte[][] arg7, int[][] arg8, byte[][] arg9, boolean arg10, float[][] arg11) {
        field4609++;
        if (arg10) {
            field4620 = false;
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            class186 var13 = arg0[var12];
            if (var13.field3264 == arg6) {
                class176 var14 = new class176();
                int var15 = 0;
                int var16 = (var13.field3253 >> 7) - var13.field3263;
                int var17 = (var13.field3266 >> 7) - var13.field3263;
                int var18 = (var13.field3253 >> 7) + var13.field3263;
                if (var16 < 0) {
                    var15 -= var16;
                    var16 = 0;
                }
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var16; var19 <= var18; var19++) {
                    short var20 = var13.field3251[var15];
                    int var21 = (var20 >> 8) + var17;
                    int var22 = (var20 & 0xFF) + (var21 - 1);
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg7[var23][var19] & 0xFF;
                        int var25 = arg4[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class323 var27 = class122.method874(-2702, var25 - 1);
                            if (var27.field5443 == -1) {
                                continue;
                            }
                            if (arg2[var23][var19] != 0) {
                                int[] var28 = class169.field2948[arg2[var23][var19]];
                                var14.field3065 += (var28.length >> 1) * 3 - 6;
                                var14.field3076 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class323 var29 = class122.method874(-2702, var25 - 1);
                            if (var29.field5443 == -1) {
                                byte var31 = arg2[var23][var19];
                                if (var31 != 0) {
                                    int[] var32 = class3.field16[var31];
                                    var14.field3065 += ((var32.length >> 1) - 2) * 3;
                                    var14.field3076 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg2[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class104 var33 = class282.method1983(arg6, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field1814 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field1814 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var37 = (var23 + 1) <= var22;
                                    boolean var38 = var21 <= (var23 - 1);
                                    if (!var38 && (var19 + 1) <= var18) {
                                        short var39 = var13.field3251[var15 + 1];
                                        int var40 = (var39 >> 8) + var17;
                                        int var41 = (var39 & 0xFF) + var40;
                                        var38 = var40 < var23 && var41 > var23;
                                    }
                                    if (!var37 && var16 <= var19 - 1) {
                                        short var42 = var13.field3251[var15 - 1];
                                        int var43 = (var42 >> 8) + var17;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var37 = var43 < var23 && var44 > var23;
                                    }
                                    if (var38 && var37) {
                                        var35 = class169.field2948[0];
                                    } else if (var38) {
                                        var35 = class169.field2948[1];
                                    } else if (var37) {
                                        var35 = class169.field2948[1];
                                    }
                                } else {
                                    boolean var45 = var21 <= var23 - 1;
                                    boolean var46 = var22 >= (var23 + 1);
                                    if (!var45 && var16 <= var19 - 1) {
                                        short var47 = var13.field3251[var15 - 1];
                                        int var48 = (var47 >> 8) + var17;
                                        int var49 = var48 + (var47 & 0xFF);
                                        var45 = var23 > var48 && var23 < var49;
                                    }
                                    if (!var46 && var18 >= (var19 + 1)) {
                                        short var50 = var13.field3251[var15 + 1];
                                        int var51 = (var50 >> 8) + var17;
                                        int var52 = var51 + (var50 & 0xFF);
                                        var46 = var23 > var51 && var23 < var52;
                                    }
                                    if (var45 && var46) {
                                        var35 = class169.field2948[0];
                                    } else if (var45) {
                                        var35 = class169.field2948[1];
                                    } else if (var46) {
                                        var35 = class169.field2948[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field3065 += (var35.length >> 1) * 3 - 6;
                                    var14.field3076 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class3.field16[arg2[var23][var19]];
                            int[] var55 = class169.field2948[arg2[var23][var19]];
                            var14.field3065 += (var55.length >> 1) * 3 - 6;
                            var14.field3065 += (var54.length >> 1) * 3 - 6;
                            var14.field3076 += var55.length >> 1;
                            var14.field3076 += var54.length >> 1;
                        } else {
                            int[] var53 = class169.field2948[0];
                            var14.field3065 += (var53.length >> 1) * 3 - 6;
                            var14.field3076 += var53.length >> 1;
                        }
                    }
                    var15++;
                }
                var14.method1192();
                int var56 = 0;
                if ((var13.field3253 >> 7) - var13.field3263 < 0) {
                    var56 -= (var13.field3253 >> 7) - var13.field3263;
                }
                for (int var57 = var16; var57 <= var18; var57++) {
                    short var58 = var13.field3251[var56];
                    int var59 = (var58 >> 8) + var17;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg7[var61][var57] & 0xFF;
                        byte var63 = arg9[var61][var57];
                        boolean var64 = false;
                        int var65 = arg4[var61][var57] & 0xFF;
                        if (var62 == 0) {
                            if (var65 == 0) {
                                continue;
                            }
                            class323 var66 = class122.method874(-2702, var65 - 1);
                            if (var66.field5443 == -1) {
                                continue;
                            }
                            if (arg2[var61][var57] != 0) {
                                class18.method174(arg5, arg1, var13, var61, class169.field2948[arg2[var61][var57]], var14, 71, arg9[var61][var57], arg11, var57, arg8);
                                continue;
                            }
                        } else if (var65 != 0) {
                            class323 var67 = class122.method874(-2702, var65 - 1);
                            if (var67.field5443 == -1) {
                                class18.method174(arg5, arg1, var13, var61, class3.field16[arg2[var61][var57]], var14, 54, arg9[var61][var57], arg11, var57, arg8);
                                continue;
                            }
                            byte var68 = arg2[var61][var57];
                            if (var68 != 0) {
                                var64 = true;
                            }
                        }
                        class104 var69 = class282.method1983(arg6, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field1814 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field1814 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var73 = var60 >= var61 + 1;
                                    boolean var74 = var61 - 1 >= var59;
                                    if (!var74 && (var57 + 1) <= var18) {
                                        short var75 = var13.field3251[var56 + 1];
                                        int var76 = (var75 >> 8) + var17;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var74 = var76 < var61 && var77 > var61;
                                    }
                                    if (!var73 && var16 <= (var57 - 1)) {
                                        short var78 = var13.field3251[var56 - 1];
                                        int var79 = (var78 >> 8) + var17;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var73 = var79 < var61 && var61 < var80;
                                    }
                                    if (var74 && var73) {
                                        var72 = class169.field2948[0];
                                    } else if (var74) {
                                        var63 = 1;
                                        var72 = class169.field2948[1];
                                    } else if (var73) {
                                        var72 = class169.field2948[1];
                                        var63 = 3;
                                    }
                                } else {
                                    boolean var81 = var59 <= var61 - 1;
                                    if (!var81 && var16 <= var57 - 1) {
                                        short var82 = var13.field3251[var56 - 1];
                                        int var83 = var17 + (var82 >> 8);
                                        int var84 = (var82 & 0xFF) + var83;
                                        var81 = var83 < var61 && var61 < var84;
                                    }
                                    boolean var85 = var60 >= (var61 + 1);
                                    if (!var85 && var18 >= var57 + 1) {
                                        short var86 = var13.field3251[var56 + 1];
                                        int var87 = var17 + (var86 >> 8);
                                        int var88 = var87 + (var86 & 0xFF);
                                        var85 = var87 < var61 && var61 < var88;
                                    }
                                    if (var81 && var85) {
                                        var72 = class169.field2948[0];
                                    } else if (var81) {
                                        var63 = 0;
                                        var72 = class169.field2948[1];
                                    } else if (var85) {
                                        var63 = 2;
                                        var72 = class169.field2948[1];
                                    }
                                }
                                if (var72 != null) {
                                    class18.method174(arg5, arg1, var13, var61, var72, var14, 119, var63, arg11, var57, arg8);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class18.method174(arg5, arg1, var13, var61, class3.field16[arg2[var61][var57]], var14, 78, arg9[var61][var57], arg11, var57, arg8);
                            class18.method174(arg5, arg1, var13, var61, class169.field2948[arg2[var61][var57]], var14, 73, arg9[var61][var57], arg11, var57, arg8);
                        } else {
                            class18.method174(arg5, arg1, var13, var61, class169.field2948[0], var14, 47, var63, arg11, var57, arg8);
                        }
                    }
                    var56++;
                }
                if (var14.field3063 > 0 && var14.field3069 > 0) {
                    var14.method1191();
                    var13.field3252 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 755)
    public static final void method1899(int arg0) {
        int var1 = class261.field4536;
        field4624++;
        int var2 = 50 % ((65 - arg0) / 54);
        int var3 = class240.field4229;
        int var4 = class12.field142;
        int var5 = class202.field3536;
        int var6 = 6116423;
        if (class108.field1900) {
            class163.method1102(var1, var3, var5, var4, var6);
            class163.method1102(var1 + 1, var3 + 1, var5 - 2, 16, 0);
            class163.method1098(var1 + 1, var3 + 18, var5 - 2, var4 + -19, 0);
        } else {
            class114.method803(var1, var3, var5, var4, var6);
            class114.method803(var1 + 1, var3 + 1, var5 - 2, 16, 0);
            class114.method805(var1 + 1, var3 + 18, var5 - 2, var4 + -19, 0);
        }
        class44.field796.method957(class311.field5233, var1 + 3, var3 - -14, var6, -1);
        int var7 = class287.field4914;
        int var8 = class82.field1511;
        for (int var9 = 0; var9 < class124.field2176; var9++) {
            int var10 = (class124.field2176 - var9 - 1) * 15 + (var3 + 31);
            int var11 = 16777215;
            if (var1 < var7 && (var1 + var5) > var7 && var8 > (var10 - 13) && (var10 + 3) > var8) {
                var11 = 16776960;
            }
            class44.field796.method957(class26.method238(3, var9), var1 + 3, var10, var11, 0);
        }
        class47.method405(class202.field3536, true, class12.field142, class261.field4536, class240.field4229);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V", line = 811)
    public static final void method1900(int arg0, byte arg1) {
        if (arg1 == 11) {
            class122 var2 = class323.method2175(1, arg0, -25873);
            var2.method865(arg1 ^ 0xFFFFFFDB);
            field4622++;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Z", line = 828)
    public static final boolean method1901(int arg0, int arg1) {
        field4610++;
        if (arg1 < 32) {
            return false;
        }
        if (arg0 != -13693) {
            method1900(94, (byte) -59);
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 859)
    public static void method1902(int arg0) {
        field4616 = null;
        if (arg0 != 0) {
            method1898((class186[]) null, (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), -13, (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), -1, (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), true, (float[][]) ((float[][]) null));
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)I", line = 885)
    public static final int method1903(int arg0) {
        field4611++;
        if (class205.field3563) {
            return 0;
        }
        if (arg0 != -24433) {
            method1902(67);
        }
        if (class110.method781((byte) 126)) {
            return class320.field5415 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIII)V", line = 908)
    public class269(int arg0, int arg1, int arg2, int arg3) {
        class237 var5 = class15.method150((byte) 96, arg0);
        this.field4626 = arg3;
        this.field4613 = arg2;
        this.field4617 = arg1;
        if (class108.field1900 || var5.field4127 == -1) {
            this.field4623 = var5;
        } else {
            this.field4623 = class15.method150((byte) 65, var5.field4127);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lk;III)V", line = 924)
    public class269(class237 arg0, int arg1, int arg2, int arg3) {
        this.field4623 = arg0;
        this.field4626 = arg3;
        this.field4613 = arg2;
        this.field4617 = arg1;
    }
}
