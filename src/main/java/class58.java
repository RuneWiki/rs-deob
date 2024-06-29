import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class58 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lsc;")
    public static class181 field872 = class149.method967(255, "<col=ffff00>");

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lsc;")
    public static class181 field881 = class149.method967(255, "null");

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[Lsc;")
    public static class181[] field879;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method419(int arg0) {
        field872 = null;
        field881 = null;
        if (arg0 == -4733) {
            field879 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public static final void method420(boolean arg0) {
        field874++;
        if (!arg0) {
            field881 = null;
        }
        while (class76.field1223.method549(-124, class108.field1772) >= 27) {
            int var1 = class76.field1223.method548(15, (byte) 67);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class129.field2140[var1] == null) {
                class129.field2140[var1] = new class178();
                var2 = true;
            }
            class178 var3 = class129.field2140[var1];
            class263.field4581[class137.field2237++] = var1;
            var3.field2639 = class237.field4125;
            int var4 = class76.field1223.method548(5, (byte) 67);
            int var5 = class177.field3104[class76.field1223.method548(3, (byte) 67)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field2616 = var3.field2675 = var5;
            }
            int var6 = class76.field1223.method548(1, (byte) 67);
            int var7 = class76.field1223.method548(5, (byte) 67);
            int var8 = class76.field1223.method548(1, (byte) 67);
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var8 == 1) {
                class30.field498[class137.field2236++] = var1;
            }
            var3.field3117 = class9.method75(-1, class76.field1223.method548(14, (byte) 67));
            var3.field2628 = var3.field3117.field1028;
            var3.field2669 = var3.field3117.field1005;
            var3.field2655 = var3.field3117.field1015;
            var3.field2689 = var3.field3117.field1054;
            var3.field2671 = var3.field3117.field1021;
            var3.field2635 = var3.field3117.field1043;
            var3.field2653 = var3.field3117.field1040;
            var3.field2619 = var3.field3117.field995;
            var3.field2663 = var3.field3117.field990;
            if (var3.field2628 == 0) {
                var3.field2675 = 0;
            }
            var3.method1051(class258.field4507.field2623[0] + var7, var6 == 1, class258.field4507.field2672[0] + var4, -6882);
            if (var3.field3117.method456(!arg0)) {
                class76.method531(9522, (class116) null, var3, (class148) null, 0, var3.field2672[0], class38.field581, var3.field2623[0]);
            }
        }
        class76.field1223.method542(95);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)Ld;")
    public static final class120 method421(int arg0, byte arg1, int arg2) {
        field880++;
        if (arg1 > -90) {
            method421(-74, (byte) -49, 72);
        }
        for (class120 var3 = (class120) class60.field917.method1686((byte) -83); var3 != null; var3 = (class120) class60.field917.method1683(140)) {
            if (var3.field1946 && var3.method786(arg2, arg0, 0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfa;Z)V")
    public static final void method422(class220 arg0, boolean arg1) {
        class128.field2113.method1689(arg0, 43);
        while (true) {
            class220 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class220[][] var7;
            class220 var66;
            do {
                class220 var65;
                do {
                    class220 var64;
                    do {
                        class220 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class220) class128.field2113.method1688((byte) 27);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3796);
                                            var3 = var2.field3784;
                                            var4 = var2.field3788;
                                            var5 = var2.field3811;
                                            var6 = var2.field3793;
                                            var7 = class221.field3820[var5];
                                            if (!var2.field3790) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class220 var8 = class221.field3820[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3796) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class73.field1165 && var3 > class19.field335) {
                                                    class220 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3796 && (var9.field3790 || (var2.field3802 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class73.field1165 && var3 < class152.field2535 - 1) {
                                                    class220 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3796 && (var10.field3790 || (var2.field3802 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class114.field1855 && var4 > class76.field1234) {
                                                    class220 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3796 && (var11.field3790 || (var2.field3802 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class114.field1855 && var4 < class5.field96 - 1) {
                                                    class220 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3796 && (var12.field3790 || (var2.field3802 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3790 = false;
                                            if (var2.field3798 != null) {
                                                class220 var13 = var2.field3798;
                                                if (var13.field3809 == null) {
                                                    if (var13.field3799 != null) {
                                                        if (class5.method42(0, var3, var4)) {
                                                            class241.method1642(var13.field3799, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, true);
                                                        } else {
                                                            class241.method1642(var13.field3799, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class5.method42(0, var3, var4)) {
                                                    class129.method830(var13.field3809, 0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, true);
                                                } else {
                                                    class129.method830(var13.field3809, 0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, false);
                                                }
                                                class75 var14 = var13.field3801;
                                                if (var14 != null) {
                                                    var14.field1203.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var14.field1207 - class146.field2391, var14.field1210 - class264.field4601, var14.field1211 - class45.field699, var14.field1213);
                                                }
                                                for (int var15 = 0; var15 < var13.field3806; var15++) {
                                                    class100 var16 = var13.field3797[var15];
                                                    if (var16 != null) {
                                                        var16.field1681.method194(var16.field1673, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var16.field1667 - class146.field2391, var16.field1666 - class264.field4601, var16.field1684 - class45.field699, var16.field1677);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3809 == null) {
                                                if (var2.field3799 != null) {
                                                    if (class5.method42(var6, var3, var4)) {
                                                        class241.method1642(var2.field3799, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class241.method1642(var2.field3799, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, false);
                                                    }
                                                }
                                            } else if (class5.method42(var6, var3, var4)) {
                                                class129.method830(var2.field3809, var6, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3809.field1708 != 12345678 || class149.field2499 && var5 <= class98.field1588) {
                                                    class129.method830(var2.field3809, var6, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class164 var18 = var2.field3805;
                                                if (var18 != null && (var18.field2787 & 0x80000000L) != 0L) {
                                                    var18.field2795.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var18.field2792 - class146.field2391, var18.field2788 - class264.field4601, var18.field2791 - class45.field699, var18.field2787);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class75 var21 = var2.field3801;
                                            class106 var22 = var2.field3810;
                                            if (var21 != null || var22 != null) {
                                                if (class73.field1165 == var3) {
                                                    var19++;
                                                } else if (class73.field1165 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class114.field1855 == var4) {
                                                    var19 += 3;
                                                } else if (class114.field1855 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class215.field3700[var19];
                                                var2.field3800 = class20.field354[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1202 & class165.field2815[var19]) == 0) {
                                                    var2.field3807 = 0;
                                                } else if (var21.field1202 == 16) {
                                                    var2.field3807 = 3;
                                                    var2.field3794 = class176.field3089[var19];
                                                    var2.field3804 = 3 - var2.field3794;
                                                } else if (var21.field1202 == 32) {
                                                    var2.field3807 = 6;
                                                    var2.field3794 = client.field2697[var19];
                                                    var2.field3804 = 6 - var2.field3794;
                                                } else if (var21.field1202 == 64) {
                                                    var2.field3807 = 12;
                                                    var2.field3794 = class116.field1907[var19];
                                                    var2.field3804 = 12 - var2.field3794;
                                                } else {
                                                    var2.field3807 = 9;
                                                    var2.field3794 = class215.field3706[var19];
                                                    var2.field3804 = 9 - var2.field3794;
                                                }
                                                if ((var21.field1202 & var20) != 0 && !class126.method818(var6, var3, var4, var21.field1202)) {
                                                    var21.field1203.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var21.field1207 - class146.field2391, var21.field1210 - class264.field4601, var21.field1211 - class45.field699, var21.field1213);
                                                }
                                                if ((var21.field1205 & var20) != 0 && !class126.method818(var6, var3, var4, var21.field1205)) {
                                                    var21.field1212.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var21.field1207 - class146.field2391, var21.field1210 - class264.field4601, var21.field1211 - class45.field699, var21.field1213);
                                                }
                                            }
                                            if (var22 != null && !class144.method927(var6, var3, var4, var22.field1735.method190())) {
                                                if ((var22.field1719 & var20) != 0) {
                                                    var22.field1735.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var22.field1722 + var22.field1727 - class146.field2391, var22.field1723 - class264.field4601, var22.field1736 + var22.field1733 - class45.field699, var22.field1718);
                                                } else if (var22.field1719 == 256) {
                                                    int var23 = var22.field1722 - class146.field2391;
                                                    int var24 = var22.field1723 - class264.field4601;
                                                    int var25 = var22.field1736 - class45.field699;
                                                    int var26 = var22.field1721;
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
                                                        var22.field1735.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var22.field1727 + var23, var24, var22.field1733 + var25, var22.field1718);
                                                    } else if (var22.field1726 != null) {
                                                        var22.field1726.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var23, var24, var25, var22.field1718);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class164 var29 = var2.field3805;
                                                if (var29 != null && (var29.field2787 & 0x80000000L) == 0L) {
                                                    var29.field2795.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var29.field2792 - class146.field2391, var29.field2788 - class264.field4601, var29.field2791 - class45.field699, var29.field2787);
                                                }
                                                class74 var30 = var2.field3803;
                                                if (var30 != null && var30.field1185 == 0) {
                                                    if (var30.field1175 != null) {
                                                        var30.field1175.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var30.field1190 - class146.field2391, var30.field1196 - class264.field4601, var30.field1173 - class45.field699, var30.field1195);
                                                    }
                                                    if (var30.field1178 != null) {
                                                        var30.field1178.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var30.field1190 - class146.field2391, var30.field1196 - class264.field4601, var30.field1173 - class45.field699, var30.field1195);
                                                    }
                                                    if (var30.field1184 != null) {
                                                        var30.field1184.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var30.field1190 - class146.field2391, var30.field1196 - class264.field4601, var30.field1173 - class45.field699, var30.field1195);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3802;
                                            if (var31 != 0) {
                                                if (var3 < class73.field1165 && (var31 & 0x4) != 0) {
                                                    class220 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3796) {
                                                        class128.field2113.method1689(var32, 55);
                                                    }
                                                }
                                                if (var4 < class114.field1855 && (var31 & 0x2) != 0) {
                                                    class220 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3796) {
                                                        class128.field2113.method1689(var33, 53);
                                                    }
                                                }
                                                if (var3 > class73.field1165 && (var31 & 0x1) != 0) {
                                                    class220 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3796) {
                                                        class128.field2113.method1689(var34, 59);
                                                    }
                                                }
                                                if (var4 > class114.field1855 && (var31 & 0x8) != 0) {
                                                    class220 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3796) {
                                                        class128.field2113.method1689(var35, 101);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3807 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3806; var37++) {
                                                if (class257.field4500 != var2.field3797[var37].field1689 && (var2.field3808[var37] & var2.field3807) == var2.field3794) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class75 var38 = var2.field3801;
                                                if (!class126.method818(var6, var3, var4, var38.field1202)) {
                                                    var38.field1203.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var38.field1207 - class146.field2391, var38.field1210 - class264.field4601, var38.field1211 - class45.field699, var38.field1213);
                                                }
                                                var2.field3807 = 0;
                                            }
                                        }
                                        if (!var2.field3785) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3806;
                                            var2.field3785 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class100 var42 = var2.field3797[var41];
                                                if (class257.field4500 != var42.field1689) {
                                                    for (int var43 = var42.field1688; var43 <= var42.field1671; var43++) {
                                                        for (int var44 = var42.field1672; var44 <= var42.field1676; var44++) {
                                                            class220 var45 = var7[var43][var44];
                                                            if (var45.field3790) {
                                                                var2.field3785 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3807 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1688) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1671) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1672) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1676) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3807) == var2.field3804) {
                                                                    var2.field3785 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class121.field1992[var40++] = var42;
                                                    int var47 = class73.field1165 - var42.field1688;
                                                    int var48 = var42.field1671 - class73.field1165;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class114.field1855 - var42.field1672;
                                                    int var50 = var42.field1676 - class114.field1855;
                                                    if (var50 > var49) {
                                                        var42.field1687 = var47 + var50;
                                                    } else {
                                                        var42.field1687 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class100 var54 = class121.field1992[var53];
                                                    if (class257.field4500 != var54.field1689) {
                                                        if (var54.field1687 > var51) {
                                                            var51 = var54.field1687;
                                                            var52 = var53;
                                                        } else if (var54.field1687 == var51) {
                                                            int var55 = var54.field1667 - class146.field2391;
                                                            int var56 = var54.field1684 - class45.field699;
                                                            int var57 = class121.field1992[var52].field1667 - class146.field2391;
                                                            int var58 = class121.field1992[var52].field1684 - class45.field699;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class100 var59 = class121.field1992[var52];
                                                var59.field1689 = class257.field4500;
                                                if (!class18.method174(var6, var59.field1688, var59.field1671, var59.field1672, var59.field1676, var59.field1681.method190())) {
                                                    var59.field1681.method194(var59.field1673, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var59.field1667 - class146.field2391, var59.field1666 - class264.field4601, var59.field1684 - class45.field699, var59.field1677);
                                                }
                                                for (int var60 = var59.field1688; var60 <= var59.field1671; var60++) {
                                                    for (int var61 = var59.field1672; var61 <= var59.field1676; var61++) {
                                                        class220 var62 = var7[var60][var61];
                                                        if (var62.field3807 != 0) {
                                                            class128.field2113.method1689(var62, 84);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3796) {
                                                            class128.field2113.method1689(var62, 84);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3785) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3785 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3796);
                            } while (var2.field3807 != 0);
                            if (var3 > class73.field1165 || var3 <= class19.field335) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3796);
                        if (var3 < class73.field1165 || var3 >= class152.field2535 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3796);
                    if (var4 > class114.field1855 || var4 <= class76.field1234) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3796);
                if (var4 < class114.field1855 || var4 >= class5.field96 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3796);
            var2.field3796 = false;
            class128.field2125--;
            class74 var67 = var2.field3803;
            if (var67 != null && var67.field1185 != 0) {
                if (var67.field1175 != null) {
                    var67.field1175.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var67.field1190 - class146.field2391, var67.field1196 - class264.field4601 - var67.field1185, var67.field1173 - class45.field699, var67.field1195);
                }
                if (var67.field1178 != null) {
                    var67.field1178.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var67.field1190 - class146.field2391, var67.field1196 - class264.field4601 - var67.field1185, var67.field1173 - class45.field699, var67.field1195);
                }
                if (var67.field1184 != null) {
                    var67.field1184.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var67.field1190 - class146.field2391, var67.field1196 - class264.field4601 - var67.field1185, var67.field1173 - class45.field699, var67.field1195);
                }
            }
            if (var2.field3800 != 0) {
                class106 var68 = var2.field3810;
                if (var68 != null && !class144.method927(var6, var3, var4, var68.field1735.method190())) {
                    if ((var68.field1719 & var2.field3800) != 0) {
                        var68.field1735.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var68.field1722 + var68.field1727 - class146.field2391, var68.field1723 - class264.field4601, var68.field1736 + var68.field1733 - class45.field699, var68.field1718);
                    } else if (var68.field1719 == 256) {
                        int var69 = var68.field1722 - class146.field2391;
                        int var70 = var68.field1723 - class264.field4601;
                        int var71 = var68.field1736 - class45.field699;
                        int var72 = var68.field1721;
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
                            var68.field1735.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var68.field1727 + var69, var70, var68.field1733 + var71, var68.field1718);
                        } else if (var68.field1726 != null) {
                            var68.field1726.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var69, var70, var71, var68.field1718);
                        }
                    }
                }
                class75 var75 = var2.field3801;
                if (var75 != null) {
                    if ((var75.field1205 & var2.field3800) != 0 && !class126.method818(var6, var3, var4, var75.field1205)) {
                        var75.field1212.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var75.field1207 - class146.field2391, var75.field1210 - class264.field4601, var75.field1211 - class45.field699, var75.field1213);
                    }
                    if ((var75.field1202 & var2.field3800) != 0 && !class126.method818(var6, var3, var4, var75.field1202)) {
                        var75.field1203.method194(0, class217.field3728, class80.field1289, class234.field4084, class157.field2636, var75.field1207 - class146.field2391, var75.field1210 - class264.field4601, var75.field1211 - class45.field699, var75.field1213);
                    }
                }
            }
            if (var5 < class26.field455 - 1) {
                class220 var76 = class221.field3820[var5 + 1][var3][var4];
                if (var76 != null && var76.field3796) {
                    class128.field2113.method1689(var76, 30);
                }
            }
            if (var3 < class73.field1165) {
                class220 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3796) {
                    class128.field2113.method1689(var77, 89);
                }
            }
            if (var4 < class114.field1855) {
                class220 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3796) {
                    class128.field2113.method1689(var78, 107);
                }
            }
            if (var3 > class73.field1165) {
                class220 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3796) {
                    class128.field2113.method1689(var79, 90);
                }
            }
            if (var4 > class114.field1855) {
                class220 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3796) {
                    class128.field2113.method1689(var80, 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILo;)Lo;")
    public static final class175 method423(int arg0, class175 arg1) {
        field876++;
        if (arg1.field2958 != -1) {
            return class52.method394(arg1.field2958, false);
        }
        int var2 = arg1.field2987 >>> 16;
        for (class228 var3 = (class228) class165.field2807.method1418(arg0 + 28); var3 != null; var3 = (class228) class165.field2807.method1421(false)) {
            if (var3.field3913 == var2) {
                return class52.method394((int) var3.field606, false);
            }
        }
        if (arg0 != -28) {
            field872 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method424(byte arg0) {
        Object var1 = class159.field2715;
        synchronized (class159.field2715) {
            if (class115.field1880 != 0) {
                class115.field1880 = 1;
                try {
                    class159.field2715.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field875++;
        if (arg0 < 25) {
            method421(25, (byte) 72, 61);
        }
    }
}
