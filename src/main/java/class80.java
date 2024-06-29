import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class80 extends class196 {

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
    public volatile boolean field1129 = true;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "Ljl;")
    public static class112 field1130;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Z")
    public boolean field1128;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "Z")
    public boolean field1135;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 16)
    public static void method537(int arg0) {
        field1130 = null;
        if (arg0 != 64) {
            method538(-114, 92);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)I", line = 26)
    public static final int method538(int arg0, int arg1) {
        field1126++;
        if (arg0 >= -121) {
            field1130 = (class112) null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZJII)Ljava/lang/String;", line = 38)
    public static final String method539(int arg0, boolean arg1, long arg2, int arg3, int arg4) {
        char var6 = ',';
        field1133++;
        char var7 = '.';
        boolean var8 = false;
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 < 53) {
            field1130 = (class112) null;
        }
        if (arg4 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg2 * 10));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Z", line = 115)
    public static final boolean method540(int arg0) {
        field1134++;
        if (class117.field1817) {
            return true;
        } else {
            int var1 = -114 / ((-arg0 - 47) / 33);
            return class212.field3227;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Lf;", line = 130)
    public static final class329 method541(byte arg0, int arg1) {
        field1131++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class278.field4231[var2] == null || class278.field4231[var2][var3] == null) {
            boolean var4 = class72.method463(arg0 ^ 0xFFFFFFE1, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg0 != 96) {
            field1130 = (class112) null;
        }
        return class278.field4231[var2][var3];
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBIIIII)V", line = 155)
    public static final void method542(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1127++;
        if (class76.field985 == 0) {
            int var7 = class169.field2532;
            int var8 = class300.field4591;
            int var9 = class161.field2418;
            int var10 = class104.field1646;
            int var11 = (arg2 - arg0) * (var10 - var7) / arg6 + var7;
            int var12 = (arg4 - arg3) * (var8 - var9) / arg5 + var9;
            if (class122.field1907 && (class274.field4201 & 0x40) != 0) {
                class329 var13 = class10.method48(class198.field2977, class115.field1762, (byte) 106);
                if (var13 == null) {
                    class279.method1949(false);
                } else {
                    class296.method2062(var12, (short) 46, 0L, var11, 100, " ->", class69.field916, class149.field2247);
                }
            } else {
                class230.field3477++;
                if (class237.field3555 == 1) {
                    class296.method2062(var12, (short) 37, 0L, var11, 100, "", class211.field3216, -1);
                }
                class296.method2062(var12, (short) 43, 0L, var11, 100, "", class311.field4733, -1);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class21.field256; var16++) {
            long var17 = class135.field2061[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 29 & 0x3;
            int var21 = ((int) var17 & 0x3F83) >> 7;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var20 == 2 && class172.method1197(class180.field2697, var19, var21, var17)) {
                    class22 var23 = class284.method1980(var22, (byte) 113);
                    if (var23.field336 != null) {
                        var23 = var23.method142(0);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class76.field985 == 1) {
                        class296.method2062(var19, (short) 22, var17, var21, arg1 + 14, class184.field2760 + " -> <col=00ffff>" + var23.field265, class292.field4442, class160.field2404);
                        class184.field2747++;
                    } else if (class122.field1907) {
                        class63 var24 = class12.field133 == -1 ? null : class104.method733(class12.field133, true);
                        if ((class274.field4201 & 0x4) != 0 && (var24 == null || var23.method156((byte) 114, class12.field133, var24.field837) != var24.field837)) {
                            class248.field3689++;
                            class296.method2062(var19, (short) 34, var17, var21, 100, class40.field492 + " -> <col=00ffff>" + var23.field265, class69.field916, class149.field2247);
                        }
                    } else {
                        class288.field4343++;
                        String[] var25 = var23.field315;
                        if (class302.field4610) {
                            var25 = class295.method2058(0, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    short var27 = 0;
                                    int var28 = -1;
                                    if (var26 == 0) {
                                        var27 = 4;
                                    }
                                    if (var26 == 1) {
                                        var27 = 29;
                                    }
                                    if (var23.field280 == var26) {
                                        var28 = var23.field306;
                                    }
                                    if (var26 == 2) {
                                        var27 = 24;
                                    }
                                    if (var26 == 3) {
                                        var27 = 45;
                                    }
                                    if (var23.field305 == var26) {
                                        var28 = var23.field317;
                                    }
                                    class201.field3000++;
                                    if (var26 == 4) {
                                        var27 = 1005;
                                    }
                                    class296.method2062(var19, var27, var17, var21, 100, "<col=00ffff>" + var23.field265, var25[var26], var28);
                                }
                            }
                        }
                        class296.method2062(var19, (short) 1004, (long) var23.field331, var21, arg1 + 14, "<col=00ffff>" + var23.field265, class274.field4205, class90.field1341);
                    }
                }
                if (var20 == 1) {
                    class69 var29 = class187.field2788[var22];
                    if ((var29.field914.field759 & 0x1) == 0 && (var29.field1566 & 0x7F) == 0 && (var29.field1505 & 0x7F) == 0 || (var29.field914.field759 & 0x1) == 1 && (var29.field1566 & 0x7F) == 64 && (var29.field1505 & 0x7F) == 64) {
                        int var30 = 64 - (var29.field914.field759 * 64 - var29.field1505);
                        int var31 = var29.field1566 - ((var29.field914.field759 - 1) * 64);
                        for (int var32 = 0; var32 < class172.field2577; var32++) {
                            class69 var33 = class187.field2788[class56.field711[var32]];
                            if (var33 != null && !var33.field1535 && var29 != var33 && var33.field1477) {
                                int var34 = var33.field1505 + 64 - (var33.field914.field759 * 64);
                                int var35 = var33.field1566 + 64 - (var33.field914.field759 * 64);
                                if (var31 <= var35 && var33.field914.field759 <= var29.field914.field759 - (var35 - var31 >> 7) && var34 >= var30 && var33.field914.field759 <= (var29.field914.field759 - (var34 - var30 >> 7))) {
                                    class84.method586(var33.field914, var19, (byte) 122, class56.field711[var32], var21);
                                    var33.field1535 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class56.field706; var36++) {
                            class195 var37 = class241.field3592[class20.field239[var36]];
                            if (var37 != null && !var37.field1535 && var37.field1477) {
                                int var38 = var37.field1566 - (var37.method696((byte) 117) - 1) * 64;
                                int var39 = var37.field1505 - (var37.method696((byte) 117) * 64 - 64);
                                if (var31 <= var38 && var37.method696((byte) 117) <= (var29.field914.field759 - (var38 - var31 >> 7)) && var30 <= var39 && var37.method696((byte) 117) <= var29.field914.field759 - (var39 - var30 >> 7)) {
                                    class222.method1552(class20.field239[var36], false, var21, var37, var19);
                                    var37.field1535 = true;
                                }
                            }
                        }
                    }
                    if (var29.field1535) {
                        continue;
                    }
                    class84.method586(var29.field914, var19, (byte) 122, var22, var21);
                    var29.field1535 = true;
                }
                if (var20 == 0) {
                    class195 var40 = class241.field3592[var22];
                    if ((var40.field1566 & 0x7F) == 64 && (var40.field1505 & 0x7F) == 64) {
                        int var41 = var40.field1566 - ((var40.method696((byte) 117) - 1) * 64);
                        int var42 = var40.field1505 - (var40.method696((byte) 117) * 64 - 64);
                        for (int var43 = 0; var43 < class172.field2577; var43++) {
                            class69 var44 = class187.field2788[class56.field711[var43]];
                            if (var44 != null && !var44.field1535 && var44.field1477) {
                                int var45 = var44.field1566 - (var44.field914.field759 - 1) * 64;
                                int var46 = var44.field1505 - ((var44.field914.field759 - 1) * 64);
                                if (var45 >= var41 && var44.field914.field759 <= (var40.method696((byte) 117) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field914.field759 <= (var40.method696((byte) 117) - (var46 - var42 >> 7))) {
                                    class84.method586(var44.field914, var19, (byte) 127, class56.field711[var43], var21);
                                    var44.field1535 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class56.field706; var47++) {
                            class195 var48 = class241.field3592[class20.field239[var47]];
                            if (var48 != null && !var48.field1535 && var40 != var48 && var48.field1477) {
                                int var49 = var48.field1566 + 64 - (var48.method696((byte) 117) * 64);
                                int var50 = var48.field1505 + (64 - (var48.method696((byte) 117) * 64));
                                if (var49 >= var41 && var48.method696((byte) 117) <= var40.method696((byte) 117) - (var49 - var41 >> 7) && var50 >= var42 && var48.method696((byte) 117) <= (var40.method696((byte) 117) - (var50 - var42 >> 7))) {
                                    class222.method1552(class20.field239[var47], false, var21, var48, var19);
                                    var48.field1535 = true;
                                }
                            }
                        }
                    }
                    if (var40.field1535) {
                        continue;
                    }
                    class222.method1552(var22, false, var21, var40, var19);
                    var40.field1535 = true;
                }
                if (var20 == 3) {
                    class156 var51 = class149.field2246[class180.field2697][var19][var21];
                    if (var51 != null) {
                        for (class287 var52 = (class287) var51.method1110(true); var52 != null; var52 = (class287) var51.method1116(arg1 ^ 0xFFFFFFE2)) {
                            int var53 = var52.field4334.field2501;
                            class253 var54 = class325.method2219(var53, -9379);
                            if (class76.field985 == 1) {
                                class204.field3065++;
                                class296.method2062(var19, (short) 58, (long) var53, var21, 100, class184.field2760 + " -> <col=ff9040>" + var54.field3837, class292.field4442, class160.field2404);
                            } else if (class122.field1907) {
                                class63 var55 = class12.field133 == -1 ? null : class104.method733(class12.field133, true);
                                if ((class274.field4201 & 0x1) != 0 && (var55 == null || var54.method1714(class12.field133, var55.field837, true) != var55.field837)) {
                                    class145.field2195++;
                                    class296.method2062(var19, (short) 50, (long) var53, var21, 100, class40.field492 + " -> <col=ff9040>" + var54.field3837, class69.field916, class149.field2247);
                                }
                            } else {
                                class243.field3644++;
                                String[] var56 = var54.field3806;
                                if (class302.field4610) {
                                    var56 = class295.method2058(arg1 - 86, var56);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        class193.field2888++;
                                        byte var58 = 0;
                                        int var59 = -1;
                                        if (var54.field3798 == var57) {
                                            var59 = var54.field3815;
                                        }
                                        if (var54.field3851 == var57) {
                                            var59 = var54.field3792;
                                        }
                                        if (var57 == 0) {
                                            var58 = 35;
                                        }
                                        if (var57 == 1) {
                                            var58 = 30;
                                        }
                                        if (var57 == 2) {
                                            var58 = 42;
                                        }
                                        if (var57 == 3) {
                                            var58 = 5;
                                        }
                                        if (var57 == 4) {
                                            var58 = 49;
                                        }
                                        class296.method2062(var19, var58, (long) var53, var21, 100, "<col=ff9040>" + var54.field3837, var56[var57], var59);
                                    }
                                }
                                class296.method2062(var19, (short) 1006, (long) var53, var21, 100, "<col=ff9040>" + var54.field3837, class274.field4205, class90.field1341);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 86) {
            field1132 = -116;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)I")
    public abstract int method76(byte arg0);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)[B")
    public abstract byte[] method75(int arg0);
}
