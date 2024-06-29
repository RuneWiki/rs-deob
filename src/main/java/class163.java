import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class163 extends class169 {

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "La;")
    public static class281 field2636 = new class281();

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field2644 = 0;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Z")
    public static boolean field2646 = false;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2648 = -1;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "Lnf;")
    public static class262 field2649;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Ljd;")
    public static class95 field2645;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Ljava/lang/String;")
    public String field2638;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Ljava/lang/String;")
    public String field2639;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Ljava/lang/Thread;")
    public static Thread field2634;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "[Lrj;")
    public static class269[] field2642;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 11)
    public static void method1222(int arg0) {
        field2634 = null;
        field2649 = null;
        field2645 = null;
        field2636 = null;
        field2642 = null;
        if (arg0 != -13766) {
            field2645 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Lee;", line = 26)
    public final class309 method1223(int arg0) {
        field2643++;
        if (arg0 != 0) {
            method1222(94);
        }
        return class60.field795[this.field2730];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V", line = 42)
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -16353) {
            field2642 = (class269[]) null;
        }
        field2637++;
        if (class320.field4939 == 0) {
            int var7 = class250.field3768;
            int var8 = class231.field3524;
            int var9 = class38.field565;
            int var10 = class201.field3100;
            int var11 = (arg1 - arg6) * (var10 - var9) / arg2 + var9;
            int var12 = (arg3 - arg4) * (var8 - var7) / arg5 + var7;
            if (class7.field110 && (class201.field3098 & 0x40) != 0) {
                class161 var13 = class94.method680(class333.field5194, 0, class183.field2893);
                if (var13 == null) {
                    class297.method2051(0);
                } else {
                    class202.method1463((short) 26, var11, 0L, class242.field3685, var12, -73, " ->", class60.field794);
                }
            } else {
                if (class248.field3754 == 1) {
                    class202.method1463((short) 13, var11, 0L, -1, var12, arg0 + 16291, "", class112.field1699);
                }
                class292.field4482++;
                class202.method1463((short) 6, var11, 0L, -1, var12, -112, "", class259.field3994);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class205.field3143; var16++) {
            long var17 = class159.field2417[var16];
            int var19 = (int) var17 >> 29 & 0x3;
            int var20 = (int) var17 & 0x7F;
            int var21 = (int) var17 >> 7 & 0x7F;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var19 == 2 && class3.method19(class265.field4112, var20, var21, var17)) {
                    class32 var23 = class226.method1607(53, var22);
                    if (var23.field450 != null) {
                        var23 = var23.method247(arg0 ^ 0x3FE0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class320.field4939 == 1) {
                        class202.method1463((short) 37, var21, var17, class314.field4864, var20, -35, class170.field2757 + " -> <col=00ffff>" + var23.field449, class201.field3092);
                        class84.field1226++;
                    } else if (class7.field110) {
                        class21 var24 = class280.field4352 == -1 ? null : class111.method851(class280.field4352, arg0 + 16364);
                        if ((class201.field3098 & 0x4) != 0 && (var24 == null || var23.method249(var24.field239, (byte) 127, class280.field4352) != var24.field239)) {
                            class138.field2076++;
                            class202.method1463((short) 43, var21, var17, class242.field3685, var20, arg0 ^ 0x3FAA, class267.field4153 + " -> <col=00ffff>" + var23.field449, class60.field794);
                        }
                    } else {
                        class340.field5288++;
                        String[] var25 = var23.field415;
                        if (class341.field5299) {
                            var25 = class245.method1686(var25, 2048);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    int var27 = -1;
                                    class103.field1517++;
                                    short var28 = 0;
                                    if (var23.field480 == var26) {
                                        var27 = var23.field440;
                                    }
                                    if (var23.field448 == var26) {
                                        var27 = var23.field443;
                                    }
                                    if (var26 == 0) {
                                        var28 = 44;
                                    }
                                    if (var26 == 1) {
                                        var28 = 11;
                                    }
                                    if (var26 == 2) {
                                        var28 = 25;
                                    }
                                    if (var26 == 3) {
                                        var28 = 9;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1006;
                                    }
                                    class202.method1463(var28, var21, var17, var27, var20, arg0 + 16305, "<col=00ffff>" + var23.field449, var25[var26]);
                                }
                            }
                        }
                        class202.method1463((short) 1001, var21, (long) var23.field404, class283.field4410, var20, -51, "<col=00ffff>" + var23.field449, class133.field2032);
                    }
                }
                if (var19 == 1) {
                    class76 var29 = class264.field4064[var22];
                    if ((var29.field1104.field5181 & 0x1) == 0 && (var29.field4713 & 0x7F) == 0 && (var29.field4731 & 0x7F) == 0 || (var29.field1104.field5181 & 0x1) == 1 && (var29.field4713 & 0x7F) == 64 && (var29.field4731 & 0x7F) == 64) {
                        int var30 = var29.field4713 - ((var29.field1104.field5181 - 1) * 64);
                        int var31 = var29.field4731 + 64 - (var29.field1104.field5181 * 64);
                        for (int var32 = 0; var32 < class52.field702; var32++) {
                            class76 var33 = class264.field4064[class272.field4252[var32]];
                            if (var33 != null && !var33.field4755 && var29 != var33 && var33.field4680) {
                                int var34 = var33.field4713 - ((var33.field1104.field5181 - 1) * 64);
                                int var35 = var33.field4731 + 64 - (var33.field1104.field5181 * 64);
                                if (var30 <= var34 && (var29.field1104.field5181 - (var34 - var30 >> 7)) >= var33.field1104.field5181 && var31 <= var35 && var33.field1104.field5181 <= var29.field1104.field5181 - (var35 - var31 >> 7)) {
                                    class202.method1464(class272.field4252[var32], var33.field1104, (byte) 115, var21, var20);
                                    var33.field4755 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class234.field3563; var36++) {
                            class270 var37 = class201.field3096[class291.field4475[var36]];
                            if (var37 != null && !var37.field4755 && var37.field4680) {
                                int var38 = var37.field4713 - ((var37.method1897(8) - 1) * 64);
                                int var39 = var37.field4731 - ((var37.method1897(arg0 ^ 0xFFFFC017) - 1) * 64);
                                if (var30 <= var38 && var37.method1897(8) <= (var29.field1104.field5181 - (var38 - var30 >> 7)) && var31 <= var39 && var37.method1897(8) <= var29.field1104.field5181 - (var39 - var31 >> 7)) {
                                    class219.method1562((byte) -64, var21, class291.field4475[var36], var20, var37);
                                    var37.field4755 = true;
                                }
                            }
                        }
                    }
                    if (var29.field4755) {
                        continue;
                    }
                    class202.method1464(var22, var29.field1104, (byte) 126, var21, var20);
                    var29.field4755 = true;
                }
                if (var19 == 0) {
                    class270 var40 = class201.field3096[var22];
                    if ((var40.field4713 & 0x7F) == 64 && (var40.field4731 & 0x7F) == 64) {
                        int var41 = var40.field4713 + 64 - (var40.method1897(8) * 64);
                        int var42 = var40.field4731 - ((var40.method1897(8) - 1) * 64);
                        for (int var43 = 0; var43 < class52.field702; var43++) {
                            class76 var44 = class264.field4064[class272.field4252[var43]];
                            if (var44 != null && !var44.field4755 && var44.field4680) {
                                int var45 = var44.field4731 + 64 - (var44.field1104.field5181 * 64);
                                int var46 = var44.field4713 + 64 - (var44.field1104.field5181 * 64);
                                if (var46 >= var41 && var44.field1104.field5181 <= (var40.method1897(8) - (var46 - var41 >> 7)) && var45 >= var42 && var44.field1104.field5181 <= (var40.method1897(8) - (var45 - var42 >> 7))) {
                                    class202.method1464(class272.field4252[var43], var44.field1104, (byte) 71, var21, var20);
                                    var44.field4755 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class234.field3563; var47++) {
                            class270 var48 = class201.field3096[class291.field4475[var47]];
                            if (var48 != null && !var48.field4755 && var40 != var48 && var48.field4680) {
                                int var49 = var48.field4713 - (var48.method1897(8) - 1) * 64;
                                int var50 = var48.field4731 - (var48.method1897(8) - 1) * 64;
                                if (var41 <= var49 && var48.method1897(8) <= var40.method1897(8) - (var49 - var41 >> 7) && var42 <= var50 && var48.method1897(8) <= var40.method1897(8) - (var50 - var42 >> 7)) {
                                    class219.method1562((byte) -79, var21, class291.field4475[var47], var20, var48);
                                    var48.field4755 = true;
                                }
                            }
                        }
                    }
                    if (var40.field4755) {
                        continue;
                    }
                    class219.method1562((byte) -62, var21, var22, var20, var40);
                    var40.field4755 = true;
                }
                if (var19 == 3) {
                    class281 var51 = class265.field4136[class265.field4112][var20][var21];
                    if (var51 != null) {
                        for (class147 var52 = (class147) var51.method1945((byte) 71); var52 != null; var52 = (class147) var51.method1943(57)) {
                            int var53 = var52.field2243.field2804;
                            class108 var54 = class222.method1576(var53, (byte) 92);
                            if (class320.field4939 == 1) {
                                class147.field2236++;
                                class202.method1463((short) 60, var21, (long) var53, class314.field4864, var20, arg0 + 16276, class170.field2757 + " -> <col=ff9040>" + var54.field1630, class201.field3092);
                            } else if (class7.field110) {
                                class21 var59 = class280.field4352 == -1 ? null : class111.method851(class280.field4352, arg0 ^ 0xFFFFC014);
                                if ((class201.field3098 & 0x1) != 0 && (var59 == null || var54.method822((byte) 84, class280.field4352, var59.field239) != var59.field239)) {
                                    class304.field4668++;
                                    class202.method1463((short) 5, var21, (long) var53, class242.field3685, var20, arg0 + 16274, class267.field4153 + " -> <col=ff9040>" + var54.field1630, class60.field794);
                                }
                            } else {
                                String[] var55 = var54.field1595;
                                class180.field2861++;
                                if (class341.field5299) {
                                    var55 = class245.method1686(var55, 2048);
                                }
                                for (int var56 = 4; var56 >= 0; var56--) {
                                    if (var55 != null && var55[var56] != null) {
                                        class219.field3348++;
                                        byte var57 = 0;
                                        if (var56 == 0) {
                                            var57 = 14;
                                        }
                                        if (var56 == 1) {
                                            var57 = 20;
                                        }
                                        int var58 = -1;
                                        if (var56 == 2) {
                                            var57 = 1;
                                        }
                                        if (var56 == 3) {
                                            var57 = 59;
                                        }
                                        if (var54.field1626 == var56) {
                                            var58 = var54.field1624;
                                        }
                                        if (var56 == 4) {
                                            var57 = 22;
                                        }
                                        if (var54.field1613 == var56) {
                                            var58 = var54.field1620;
                                        }
                                        class202.method1463(var57, var21, (long) var53, var58, var20, -59, "<col=ff9040>" + var54.field1630, var55[var56]);
                                    }
                                }
                                class202.method1463((short) 1002, var21, (long) var53, class283.field4410, var20, -77, "<col=ff9040>" + var54.field1630, class133.field2032);
                            }
                        }
                    }
                }
            }
        }
    }
}
