import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class93 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "J")
    public long field1755 = 0L;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lhh;")
    public static class163 field1762 = class137.method1065(")4a=", 17);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lhh;")
    public static class163 field1761 = class137.method1065("<col=00ff00>", 17);

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lhh;")
    public static class163 field1751 = class137.method1065("showVideoAd", 17);

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lta;")
    public class165 field1748;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lta;")
    public class165 field1749;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lv;")
    public static class22 field1765;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static final void method739(boolean arg0) {
        class89.field1639.method111((byte) -52);
        if (!arg0) {
            field1751 = null;
        }
        field1763++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lek;")
    public static final class76 method740(int arg0, int arg1, int arg2) {
        field1757++;
        for (class76 var3 = (class76) class259.field4530.method1017(arg1 + 18137); var3 != null; var3 = (class76) class259.field4530.method1016((byte) -31)) {
            if (var3.field1423 && var3.method555(arg2, arg0, 0)) {
                return var3;
            }
        }
        if (arg1 != -18094) {
            field1750 = 106;
        }
        return null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIBILv;I)V")
    public static final void method741(boolean arg0, int arg1, int arg2, byte arg3, int arg4, class22 arg5, int arg6) {
        field1764++;
        long var7 = (long) ((arg4 << 16) + arg1);
        class46 var9 = (class46) class135.field2606.method1743(var7, false);
        if (var9 != null) {
            return;
        }
        class46 var10 = (class46) class214.field3909.method1743(var7, false);
        if (var10 != null) {
            return;
        }
        class46 var11 = (class46) class130.field2528.method1743(var7, false);
        if (var11 == null) {
            if (!arg0) {
                class46 var12 = (class46) class192.field3517.method1743(var7, false);
                if (var12 != null) {
                    return;
                }
            }
            if (arg2 != 45218960) {
                field1762 = null;
            }
            class46 var13 = new class46();
            var13.field771 = arg5;
            var13.field767 = arg3;
            var13.field768 = arg6;
            if (arg0) {
                class135.field2606.method1741(var13, false, var7);
                class90.field1662++;
            } else {
                class20.field314.method471((byte) -62, var13);
                class130.field2528.method1741(var13, false, var7);
                class20.field318++;
            }
        } else if (arg0) {
            var11.method1127(-24137);
            class135.field2606.method1741(var11, false, var7);
            class20.field318--;
            class90.field1662++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method742(int arg0) {
        field1751 = null;
        field1765 = null;
        if (arg0 == 0) {
            field1762 = null;
            field1761 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZIII)V")
    public static final void method743(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (class56.field928 == 0 && !class187.field3426) {
            class253.field4428++;
            int var7 = class120.field2264;
            int var8 = class89.field1644;
            int var9 = class164.field3035;
            int var10 = (arg4 - arg0) * (var8 - var7) / arg2 + var7;
            int var11 = class97.field1820;
            int var12 = (arg1 - arg5) * (var11 - var9) / arg6 + var9;
            class122.method955(class170.field3120, var10, 0L, -2, class144.field2715, (short) 45, var12);
        }
        field1767++;
        if (!arg3) {
            method740(49, -43, 91);
        }
        long var13 = -1L;
        for (int var15 = 0; var15 < class143.field2707; var15++) {
            long var16 = class236.field4214[var15];
            int var18 = ((int) var16 & 0x7C488846) >> 29;
            int var19 = (int) var16 >> 7 & 0x7F;
            int var20 = (int) var16 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var16 >>> 32);
            if (var13 != var16) {
                var13 = var16;
                if (var18 == 2 && class259.method1753(class20.field323, var20, var19, var16)) {
                    class35 var22 = class9.method64(false, var21);
                    if (var22.field577 != null) {
                        var22 = var22.method252(115);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class56.field928 == 1) {
                        class122.method955(class145.method1101(0, new class163[] { class187.field3420, class237.field4221, var22.field543 }), var20, var16, -2, class210.field3811, (short) 15, var19);
                        class211.field3827++;
                    } else if (!class187.field3426) {
                        class55.field904++;
                        class163[] var23 = var22.field555;
                        if (class55.field913) {
                            var23 = class89.method689(-6, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    class68.field1157++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 35;
                                    }
                                    if (var24 == 1) {
                                        var25 = 32;
                                    }
                                    if (var24 == 2) {
                                        var25 = 1;
                                    }
                                    if (var24 == 3) {
                                        var25 = 22;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1002;
                                    }
                                    class122.method955(class145.method1101(0, new class163[] { class27.field424, var22.field543 }), var20, var16, -2, var23[var24], var25, var19);
                                }
                            }
                        }
                        class122.method955(class145.method1101(0, new class163[] { class27.field424, var22.field543 }), var20, (long) var22.field538, -2, class60.field1004, (short) 1003, var19);
                    } else if ((class59.field968 & 0x4) == 4) {
                        class103.field1971++;
                        class122.method955(class145.method1101(0, new class163[] { class223.field4060, class237.field4221, var22.field543 }), var20, var16, -2, class9.field151, (short) 50, var19);
                    }
                }
                if (var18 == 1) {
                    class2 var26 = class111.field2098[var21];
                    if (var26.field41.field3274 == 1 && (var26.field3633 & 0x7F) == 64 && (var26.field3615 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class199.field3573; var27++) {
                            class2 var30 = class111.field2098[class155.field2887[var27]];
                            if (var30 != null && var26 != var30 && var30.field41.field3274 == 1 && var26.field3633 == var30.field3633 && var26.field3615 == var30.field3615) {
                                class152.method1130(108, class155.field2887[var27], var30.field41, var19, var20);
                            }
                        }
                        for (int var28 = 0; var28 < class95.field1791; var28++) {
                            class126 var29 = class106.field2029[class246.field4340[var28]];
                            if (var29 != null && var26.field3633 == var29.field3633 && var26.field3615 == var29.field3615) {
                                class247.method1699(var29, 128, var20, var19, class246.field4340[var28]);
                            }
                        }
                    }
                    class152.method1130(104, var21, var26.field41, var19, var20);
                }
                if (var18 == 0) {
                    class126 var31 = class106.field2029[var21];
                    if ((var31.field3633 & 0x7F) == 64 && (var31.field3615 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class199.field3573; var32++) {
                            class2 var35 = class111.field2098[class155.field2887[var32]];
                            if (var35 != null && var35.field41.field3274 == 1 && var31.field3633 == var35.field3633 && var31.field3615 == var35.field3615) {
                                class152.method1130(-51, class155.field2887[var32], var35.field41, var19, var20);
                            }
                        }
                        for (int var33 = 0; var33 < class95.field1791; var33++) {
                            class126 var34 = class106.field2029[class246.field4340[var33]];
                            if (var34 != null && var31 != var34 && var31.field3633 == var34.field3633 && var31.field3615 == var34.field3615) {
                                class247.method1699(var34, 128, var20, var19, class246.field4340[var33]);
                            }
                        }
                    }
                    class247.method1699(var31, 128, var20, var19, var21);
                }
                if (var18 == 3) {
                    class128 var36 = class32.field498[class20.field323][var20][var19];
                    if (var36 != null) {
                        for (class120 var37 = (class120) var36.method1022(false); var37 != null; var37 = (class120) var36.method1013((byte) 21)) {
                            int var38 = var37.field2255.field1393;
                            class99 var39 = class120.method939(22952, var38);
                            if (class56.field928 == 1) {
                                class122.method955(class145.method1101(0, new class163[] { class187.field3420, class123.field2346, var39.field1903 }), var20, (long) var38, -2, class210.field3811, (short) 18, var19);
                                class159.field2921++;
                            } else if (!class187.field3426) {
                                class81.field1557++;
                                class163[] var40 = var39.field1884;
                                if (class55.field913) {
                                    var40 = class89.method689(-6, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 41;
                                        }
                                        if (var41 == 1) {
                                            var42 = 2;
                                        }
                                        if (var41 == 2) {
                                            var42 = 40;
                                        }
                                        class262.field4580++;
                                        if (var41 == 3) {
                                            var42 = 6;
                                        }
                                        if (var41 == 4) {
                                            var42 = 34;
                                        }
                                        class122.method955(class145.method1101(0, new class163[] { class222.field4041, var39.field1903 }), var20, (long) var38, -2, var40[var41], var42, var19);
                                    } else if (var41 == 2) {
                                        class168.field3080++;
                                        class122.method955(class145.method1101(0, new class163[] { class222.field4041, var39.field1903 }), var20, (long) var38, -2, class60.field1003, (short) 40, var19);
                                    }
                                }
                                class122.method955(class145.method1101(0, new class163[] { class222.field4041, var39.field1903 }), var20, (long) var38, -2, class60.field1004, (short) 1005, var19);
                            } else if ((class59.field968 & 0x1) == 1) {
                                class122.method955(class145.method1101(0, new class163[] { class223.field4060, class123.field2346, var39.field1903 }), var20, (long) var38, -2, class9.field151, (short) 8, var19);
                                class181.field3279++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIZ)I")
    public static final int method744(boolean arg0, int arg1, int arg2, boolean arg3) {
        field1754++;
        class197 var4 = (class197) class76.field1427.method1743((long) arg2, arg0);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg0) {
            field1760 = 98;
        }
        for (int var6 = 0; var6 < var4.field3557.length; var6++) {
            if (var4.field3557[var6] >= 0 && class75.field1407 > var4.field3557[var6]) {
                class99 var7 = class120.method939(22952, var4.field3557[var6]);
                if (var7.field1919 != null) {
                    class129 var8 = (class129) var7.field1919.method1743((long) arg1, arg0);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field3549[var6] * var8.field2503;
                        } else {
                            var5 += var8.field2503;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
