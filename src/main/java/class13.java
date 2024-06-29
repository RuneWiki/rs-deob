import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class13 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lp;")
    public static class56 field144 = new class56(new byte[5000]);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field146 = -1;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[[[I")
    public static int[][][] field147 = new int[4][13][13];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
    public static boolean field148 = true;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lqj;")
    public static class196 field150 = class80.method502("welle:", -48);

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lub;")
    public static class43[] field143;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method58(int arg0) {
        if (arg0 != 4478) {
            method60(66, -95, 115, -63);
        }
        class256.field4497.method1529(382);
        field145++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method59(byte arg0) {
        field147 = null;
        if (arg0 > 82) {
            field144 = null;
            field143 = null;
            field150 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)I")
    public static final int method60(int arg0, int arg1, int arg2, int arg3) {
        field149++;
        int var4 = arg3 / arg2;
        int var5 = arg3 & arg2 - 1;
        int var6 = arg2 - 1 & arg0;
        int var7 = arg0 / arg2;
        if (arg1 != -29696) {
            return -22;
        }
        int var8 = class144.method889(var7, var4, (byte) 95);
        int var9 = class144.method889(var7, var4 + 1, (byte) -46);
        int var10 = class144.method889(var7 + 1, var4, (byte) 105);
        int var11 = class144.method889(var7 + 1, var4 + 1, (byte) -40);
        int var12 = class133.method805(var8, var9, arg2, 1024, var5);
        int var13 = class133.method805(var10, var11, arg2, 1024, var5);
        return class133.method805(var12, var13, arg2, 1024, var6);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lid;Z)V")
    public static final void method61(class61 arg0, boolean arg1) {
        class29.field362.method1652(26532, arg0);
        while (true) {
            class61 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class61[][] var7;
            class61 var66;
            do {
                class61 var65;
                do {
                    class61 var64;
                    do {
                        class61 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class61) class29.field362.method1665(3072);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field828);
                                            var3 = var2.field835;
                                            var4 = var2.field822;
                                            var5 = var2.field826;
                                            var6 = var2.field842;
                                            var7 = class249.field4410[var5];
                                            if (!var2.field837) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class61 var8 = class249.field4410[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field828) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class71.field1006 && var3 > class135.field1959) {
                                                    class61 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field828 && (var9.field837 || (var2.field831 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class71.field1006 && var3 < class24.field313 - 1) {
                                                    class61 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field828 && (var10.field837 || (var2.field831 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class238.field4236 && var4 > class149.field2380) {
                                                    class61 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field828 && (var11.field837 || (var2.field831 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class238.field4236 && var4 < class242.field4299 - 1) {
                                                    class61 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field828 && (var12.field837 || (var2.field831 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field837 = false;
                                            if (var2.field821 != null) {
                                                class61 var13 = var2.field821;
                                                if (var13.field833 == null) {
                                                    if (var13.field827 != null) {
                                                        if (class246.method1678(0, var3, var4)) {
                                                            class158.method998(var13.field827, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, true);
                                                        } else {
                                                            class158.method998(var13.field827, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class246.method1678(0, var3, var4)) {
                                                    class85.method533(var13.field833, 0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, true);
                                                } else {
                                                    class85.method533(var13.field833, 0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, false);
                                                }
                                                class221 var14 = var13.field829;
                                                if (var14 != null) {
                                                    var14.field3992.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var14.field3983 - class202.field3586, var14.field3988 - class253.field4483, var14.field3986 - class224.field4012, var14.field3978);
                                                }
                                                for (int var15 = 0; var15 < var13.field836; var15++) {
                                                    class200 var16 = var13.field823[var15];
                                                    if (var16 != null) {
                                                        var16.field3544.method269(var16.field3558, class109.field1561, class8.field79, class235.field4171, class120.field1734, var16.field3547 - class202.field3586, var16.field3546 - class253.field4483, var16.field3551 - class224.field4012, var16.field3554);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field833 == null) {
                                                if (var2.field827 != null) {
                                                    if (class246.method1678(var6, var3, var4)) {
                                                        class158.method998(var2.field827, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class158.method998(var2.field827, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, false);
                                                    }
                                                }
                                            } else if (class246.method1678(var6, var3, var4)) {
                                                class85.method533(var2.field833, var6, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field833.field1830 != 12345678 || class161.field2587 && var5 <= class246.field4383) {
                                                    class85.method533(var2.field833, var6, class109.field1561, class8.field79, class235.field4171, class120.field1734, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class116 var18 = var2.field818;
                                                if (var18 != null && (var18.field1671 & 0xFFFFFFFF80000000L) != 0L) {
                                                    var18.field1681.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var18.field1673 - class202.field3586, var18.field1677 - class253.field4483, var18.field1682 - class224.field4012, var18.field1671);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class221 var21 = var2.field829;
                                            class7 var22 = var2.field830;
                                            if (var21 != null || var22 != null) {
                                                if (class71.field1006 == var3) {
                                                    var19++;
                                                } else if (class71.field1006 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class238.field4236 == var4) {
                                                    var19 += 3;
                                                } else if (class238.field4236 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class242.field4288[var19];
                                                var2.field825 = class90.field1319[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field3985 & class217.field3894[var19]) == 0) {
                                                    var2.field824 = 0;
                                                } else if (var21.field3985 == 16) {
                                                    var2.field824 = 3;
                                                    var2.field819 = class5.field38[var19];
                                                    var2.field840 = 3 - var2.field819;
                                                } else if (var21.field3985 == 32) {
                                                    var2.field824 = 6;
                                                    var2.field819 = class82.field1193[var19];
                                                    var2.field840 = 6 - var2.field819;
                                                } else if (var21.field3985 == 64) {
                                                    var2.field824 = 12;
                                                    var2.field819 = class138.field2123[var19];
                                                    var2.field840 = 12 - var2.field819;
                                                } else {
                                                    var2.field824 = 9;
                                                    var2.field819 = class35.field425[var19];
                                                    var2.field840 = 9 - var2.field819;
                                                }
                                                if ((var21.field3985 & var20) != 0 && !class212.method1463(var6, var3, var4, var21.field3985)) {
                                                    var21.field3992.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var21.field3983 - class202.field3586, var21.field3988 - class253.field4483, var21.field3986 - class224.field4012, var21.field3978);
                                                }
                                                if ((var21.field3982 & var20) != 0 && !class212.method1463(var6, var3, var4, var21.field3982)) {
                                                    var21.field3979.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var21.field3983 - class202.field3586, var21.field3988 - class253.field4483, var21.field3986 - class224.field4012, var21.field3978);
                                                }
                                            }
                                            if (var22 != null && !class83.method518(var6, var3, var4, var22.field59.method266())) {
                                                if ((var22.field67 & var20) != 0) {
                                                    var22.field59.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var22.field68 + var22.field74 - class202.field3586, var22.field69 - class253.field4483, var22.field65 + var22.field66 - class224.field4012, var22.field73);
                                                } else if (var22.field67 == 256) {
                                                    int var23 = var22.field68 - class202.field3586;
                                                    int var24 = var22.field69 - class253.field4483;
                                                    int var25 = var22.field65 - class224.field4012;
                                                    int var26 = var22.field62;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field59.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var22.field74 + var23, var24, var22.field66 + var25, var22.field73);
                                                    } else if (var22.field63 != null) {
                                                        var22.field63.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var23, var24, var25, var22.field73);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class116 var29 = var2.field818;
                                                if (var29 != null && (var29.field1671 & 0xFFFFFFFF80000000L) == 0L) {
                                                    var29.field1681.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var29.field1673 - class202.field3586, var29.field1677 - class253.field4483, var29.field1682 - class224.field4012, var29.field1671);
                                                }
                                                class159 var30 = var2.field839;
                                                if (var30 != null && var30.field2572 == 0) {
                                                    if (var30.field2558 != null) {
                                                        var30.field2558.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var30.field2571 - class202.field3586, var30.field2563 - class253.field4483, var30.field2566 - class224.field4012, var30.field2570);
                                                    }
                                                    if (var30.field2553 != null) {
                                                        var30.field2553.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var30.field2571 - class202.field3586, var30.field2563 - class253.field4483, var30.field2566 - class224.field4012, var30.field2570);
                                                    }
                                                    if (var30.field2567 != null) {
                                                        var30.field2567.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var30.field2571 - class202.field3586, var30.field2563 - class253.field4483, var30.field2566 - class224.field4012, var30.field2570);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field831;
                                            if (var31 != 0) {
                                                if (var3 < class71.field1006 && (var31 & 0x4) != 0) {
                                                    class61 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field828) {
                                                        class29.field362.method1652(26532, var32);
                                                    }
                                                }
                                                if (var4 < class238.field4236 && (var31 & 0x2) != 0) {
                                                    class61 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field828) {
                                                        class29.field362.method1652(26532, var33);
                                                    }
                                                }
                                                if (var3 > class71.field1006 && (var31 & 0x1) != 0) {
                                                    class61 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field828) {
                                                        class29.field362.method1652(26532, var34);
                                                    }
                                                }
                                                if (var4 > class238.field4236 && (var31 & 0x8) != 0) {
                                                    class61 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field828) {
                                                        class29.field362.method1652(26532, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field824 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field836; var37++) {
                                                if (class102.field1480 != var2.field823[var37].field3545 && (var2.field820[var37] & var2.field824) == var2.field819) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class221 var38 = var2.field829;
                                                if (!class212.method1463(var6, var3, var4, var38.field3985)) {
                                                    var38.field3992.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var38.field3983 - class202.field3586, var38.field3988 - class253.field4483, var38.field3986 - class224.field4012, var38.field3978);
                                                }
                                                var2.field824 = 0;
                                            }
                                        }
                                        if (!var2.field832) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field836;
                                            var2.field832 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class200 var42 = var2.field823[var41];
                                                if (class102.field1480 != var42.field3545) {
                                                    for (int var43 = var42.field3549; var43 <= var42.field3539; var43++) {
                                                        for (int var44 = var42.field3548; var44 <= var42.field3556; var44++) {
                                                            class61 var45 = var7[var43][var44];
                                                            if (var45.field837) {
                                                                var2.field832 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field824 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3549) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field3539) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3548) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3556) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field824) == var2.field840) {
                                                                    var2.field832 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class211.field3792[var40++] = var42;
                                                    int var47 = class71.field1006 - var42.field3549;
                                                    int var48 = var42.field3539 - class71.field1006;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class238.field4236 - var42.field3548;
                                                    int var50 = var42.field3556 - class238.field4236;
                                                    if (var50 > var49) {
                                                        var42.field3555 = var47 + var50;
                                                    } else {
                                                        var42.field3555 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class200 var54 = class211.field3792[var53];
                                                    if (class102.field1480 != var54.field3545) {
                                                        if (var54.field3555 > var51) {
                                                            var51 = var54.field3555;
                                                            var52 = var53;
                                                        } else if (var54.field3555 == var51) {
                                                            int var55 = var54.field3547 - class202.field3586;
                                                            int var56 = var54.field3551 - class224.field4012;
                                                            int var57 = class211.field3792[var52].field3547 - class202.field3586;
                                                            int var58 = class211.field3792[var52].field3551 - class224.field4012;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class200 var59 = class211.field3792[var52];
                                                var59.field3545 = class102.field1480;
                                                if (!class125.method773(var6, var59.field3549, var59.field3539, var59.field3548, var59.field3556, var59.field3544.method266())) {
                                                    var59.field3544.method269(var59.field3558, class109.field1561, class8.field79, class235.field4171, class120.field1734, var59.field3547 - class202.field3586, var59.field3546 - class253.field4483, var59.field3551 - class224.field4012, var59.field3554);
                                                }
                                                for (int var60 = var59.field3549; var60 <= var59.field3539; var60++) {
                                                    for (int var61 = var59.field3548; var61 <= var59.field3556; var61++) {
                                                        class61 var62 = var7[var60][var61];
                                                        if (var62.field824 != 0) {
                                                            class29.field362.method1652(26532, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field828) {
                                                            class29.field362.method1652(26532, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field832) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field832 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field828);
                            } while (var2.field824 != 0);
                            if (var3 > class71.field1006 || var3 <= class135.field1959) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field828);
                        if (var3 < class71.field1006 || var3 >= class24.field313 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field828);
                    if (var4 > class238.field4236 || var4 <= class149.field2380) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field828);
                if (var4 < class238.field4236 || var4 >= class242.field4299 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field828);
            var2.field828 = false;
            class234.field4168--;
            class159 var67 = var2.field839;
            if (var67 != null && var67.field2572 != 0) {
                if (var67.field2558 != null) {
                    var67.field2558.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var67.field2571 - class202.field3586, var67.field2563 - class253.field4483 - var67.field2572, var67.field2566 - class224.field4012, var67.field2570);
                }
                if (var67.field2553 != null) {
                    var67.field2553.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var67.field2571 - class202.field3586, var67.field2563 - class253.field4483 - var67.field2572, var67.field2566 - class224.field4012, var67.field2570);
                }
                if (var67.field2567 != null) {
                    var67.field2567.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var67.field2571 - class202.field3586, var67.field2563 - class253.field4483 - var67.field2572, var67.field2566 - class224.field4012, var67.field2570);
                }
            }
            if (var2.field825 != 0) {
                class7 var68 = var2.field830;
                if (var68 != null && !class83.method518(var6, var3, var4, var68.field59.method266())) {
                    if ((var68.field67 & var2.field825) != 0) {
                        var68.field59.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var68.field68 + var68.field74 - class202.field3586, var68.field69 - class253.field4483, var68.field65 + var68.field66 - class224.field4012, var68.field73);
                    } else if (var68.field67 == 256) {
                        int var69 = var68.field68 - class202.field3586;
                        int var70 = var68.field69 - class253.field4483;
                        int var71 = var68.field65 - class224.field4012;
                        int var72 = var68.field62;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field59.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var68.field74 + var69, var70, var68.field66 + var71, var68.field73);
                        } else if (var68.field63 != null) {
                            var68.field63.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var69, var70, var71, var68.field73);
                        }
                    }
                }
                class221 var75 = var2.field829;
                if (var75 != null) {
                    if ((var75.field3982 & var2.field825) != 0 && !class212.method1463(var6, var3, var4, var75.field3982)) {
                        var75.field3979.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var75.field3983 - class202.field3586, var75.field3988 - class253.field4483, var75.field3986 - class224.field4012, var75.field3978);
                    }
                    if ((var75.field3985 & var2.field825) != 0 && !class212.method1463(var6, var3, var4, var75.field3985)) {
                        var75.field3992.method269(0, class109.field1561, class8.field79, class235.field4171, class120.field1734, var75.field3983 - class202.field3586, var75.field3988 - class253.field4483, var75.field3986 - class224.field4012, var75.field3978);
                    }
                }
            }
            if (var5 < class39.field442 - 1) {
                class61 var76 = class249.field4410[var5 + 1][var3][var4];
                if (var76 != null && var76.field828) {
                    class29.field362.method1652(26532, var76);
                }
            }
            if (var3 < class71.field1006) {
                class61 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field828) {
                    class29.field362.method1652(26532, var77);
                }
            }
            if (var4 < class238.field4236) {
                class61 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field828) {
                    class29.field362.method1652(26532, var78);
                }
            }
            if (var3 > class71.field1006) {
                class61 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field828) {
                    class29.field362.method1652(26532, var79);
                }
            }
            if (var4 > class238.field4236) {
                class61 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field828) {
                    class29.field362.method1652(26532, var80);
                }
            }
        }
    }
}
