import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class235 extends Canvas {

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3727;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "Lec;")
    public static class25 field3728 = new class25(16);

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field3730 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Lkb;")
    public static class54 field3725;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method1631(int arg0) {
        field3728 = null;
        field3725 = null;
        if (arg0 != 3) {
            method1632(-103, -84);
        }
    }

    @OriginalMember(owner = "client!ql", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3723++;
        this.field3727.update(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Z")
    public static final boolean method1632(int arg0, int arg1) {
        field3729++;
        if (class210.field3373[arg1]) {
            return true;
        } else if (class224.field3561.method1906((byte) 123, arg1)) {
            int var2 = class224.field3561.method1890(true, arg1);
            if (var2 == 0) {
                class210.field3373[arg1] = true;
                return true;
            } else if (arg0 <= 14) {
                return true;
            } else {
                if (class283.field4741[arg1] == null) {
                    class283.field4741[arg1] = new class254[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class283.field4741[arg1][var3] == null) {
                        byte[] var4 = class224.field3561.method1877(var3, arg1, (byte) 29);
                        if (var4 != null) {
                            class254 var5 = class283.field4741[arg1][var3] = new class254();
                            var5.field4077 = (arg1 << 16) + var3;
                            if (var4[0] == -1) {
                                var5.method1760((byte) 123, new class202(var4));
                            } else {
                                var5.method1767((byte) 117, new class202(var4));
                            }
                        }
                    }
                }
                class210.field3373[arg1] = true;
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3726++;
        this.field3727.paint(arg0);
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class235(Component arg0) {
        this.field3727 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3724++;
        if (class29.field367 == 0) {
            int var7 = class66.field978;
            int var8 = class141.field2191;
            int var9 = class43.field601;
            int var10 = class287.field4777;
            int var11 = (arg0 - arg6) * (var10 - var9) / arg5 + var9;
            int var12 = (arg1 - arg2) * (var8 - var7) / arg4 + var7;
            if (class70.field1017 && (client.field2581 & 0x40) != 0) {
                class254 var13 = class79.method529(class84.field1334, 76, class268.field4398);
                if (var13 == null) {
                    class173.method1151((byte) 88);
                } else {
                    class192.method1333(var11, class70.field1019, 0L, " ->", (short) 26, var12, class44.field611, 9910);
                }
            } else {
                class282.field4708++;
                if (class121.field1857 == 1) {
                    class192.method1333(var11, class20.field271, 0L, "", (short) 15, var12, -1, 9910);
                }
                class192.method1333(var11, class276.field4578, 0L, "", (short) 44, var12, -1, 9910);
            }
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class103.field1555; var16++) {
            long var17 = class110.field1673[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = (int) var17 >> 29 & 0x3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class262.method1813(class165.field2600, var19, var20, var17)) {
                    class74 var23 = class216.method1510(0, var22);
                    if (var23.field1149 != null) {
                        var23 = var23.method488(-93);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class29.field367 == 1) {
                        class192.method1333(var20, class18.field250, var17, class43.field602 + " -> <col=00ffff>" + var23.field1133, (short) 18, var19, class19.field258, 9910);
                        class102.field1542++;
                    } else if (class70.field1017) {
                        class139 var28 = class135.field2114 == -1 ? null : class56.method338(class135.field2114, (byte) 112);
                        if ((client.field2581 & 0x4) != 0 && (var28 == null || var23.method478(-115, var28.field2150, class135.field2114) != var28.field2150)) {
                            class145.field2291++;
                            class192.method1333(var20, class70.field1019, var17, class265.field4368 + " -> <col=00ffff>" + var23.field1133, (short) 46, var19, class44.field611, 9910);
                        }
                    } else {
                        class230.field3688++;
                        String[] var24 = var23.field1168;
                        if (class299.field4915) {
                            var24 = class270.method1851(false, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    short var26 = 0;
                                    class300.field4932++;
                                    int var27 = -1;
                                    if (var25 == 0) {
                                        var26 = 8;
                                    }
                                    if (var23.field1172 == var25) {
                                        var27 = var23.field1136;
                                    }
                                    if (var25 == 1) {
                                        var26 = 6;
                                    }
                                    if (var25 == 2) {
                                        var26 = 2;
                                    }
                                    if (var25 == 3) {
                                        var26 = 34;
                                    }
                                    if (var23.field1086 == var25) {
                                        var27 = var23.field1160;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1008;
                                    }
                                    class192.method1333(var20, var24[var25], var17, "<col=00ffff>" + var23.field1133, var26, var19, var27, 9910);
                                }
                            }
                        }
                        class192.method1333(var20, class27.field347, (long) var23.field1166, "<col=00ffff>" + var23.field1133, (short) 1006, var19, class208.field3325, 9910);
                    }
                }
                if (var21 == 1) {
                    class35 var29 = class76.field1188[var22];
                    if ((var29.field442.field1591 & 0x1) == 0 && (var29.field836 & 0x7F) == 0 && (var29.field850 & 0x7F) == 0 || (var29.field442.field1591 & 0x1) == 1 && (var29.field836 & 0x7F) == 64 && (var29.field850 & 0x7F) == 64) {
                        int var30 = var29.field836 - (var29.field442.field1591 << 6);
                        int var31 = var29.field850 - (var29.field442.field1591 << 6);
                        int var32 = var29.field442.field1591 << 7;
                        if (class104.field1560) {
                            for (int var33 = 0; var33 < class14.field195; var33++) {
                                class35 var39 = class76.field1188[class76.field1189[var33]];
                                if (var39 != null && !var39.field839 && var29 != var39 && var39.field817) {
                                    int var40 = var39.field836 - (var39.field442.field1591 << 6);
                                    int var41 = var39.field850 - (var39.field442.field1591 << 6);
                                    int var42 = var39.field442.field1591 << 7;
                                    if (class59.method368(var40, var32, var41, var31, var32, var30, var42, (byte) -123, var42)) {
                                        class278.method1934(class76.field1189[var33], 3569, var39.field442, var20, var19);
                                        var39.field839 = true;
                                    }
                                }
                            }
                            for (int var34 = 0; var34 < class249.field3964; var34++) {
                                class208 var35 = class300.field4925[class53.field713[var34]];
                                if (var35 != null && !var35.field839 && var35.field817) {
                                    int var36 = var35.field836 - (var35.method362(25892) << 6);
                                    int var37 = var35.field850 - (var35.method362(25892) << 6);
                                    int var38 = var35.method362(25892) << 7;
                                    if (class59.method368(var36, var32, var37, var31, var32, var30, var38, (byte) -117, var38)) {
                                        class45.method289(10, class53.field713[var34], var19, var35, var20);
                                        var35.field839 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var29.field839) {
                        continue;
                    }
                    class278.method1934(var22, 3569, var29.field442, var20, var19);
                    var29.field839 = true;
                }
                if (var21 == 0) {
                    class208 var43 = class300.field4925[var22];
                    if ((var43.field836 & 0x7F) == 64 && (var43.field850 & 0x7F) == 64) {
                        int var44 = var43.field836 - (var43.method362(25892) << 6);
                        int var45 = var43.field850 - (var43.method362(25892) << 6);
                        int var46 = var43.method362(25892) << 7;
                        if (class104.field1560) {
                            for (int var47 = 0; var47 < class14.field195; var47++) {
                                class35 var53 = class76.field1188[class76.field1189[var47]];
                                if (var53 != null && !var53.field839 && var53.field817) {
                                    int var54 = var53.field442.field1591 << 7;
                                    int var55 = var53.field850 - (var53.field442.field1591 << 6);
                                    int var56 = var53.field836 - (var53.field442.field1591 << 6);
                                    if (class59.method368(var56, var46, var55, var45, var46, var44, var54, (byte) -113, var54)) {
                                        class278.method1934(class76.field1189[var47], 3569, var53.field442, var20, var19);
                                        var53.field839 = true;
                                    }
                                }
                            }
                            for (int var48 = 0; var48 < class249.field3964; var48++) {
                                class208 var49 = class300.field4925[class53.field713[var48]];
                                if (var49 != null && !var49.field839 && var43 != var49 && var49.field817) {
                                    int var50 = var49.field836 - (var49.method362(25892) << 6);
                                    int var51 = var49.field850 - (var49.method362(25892) << 6);
                                    int var52 = var49.method362(25892) << 7;
                                    if (class59.method368(var50, var46, var51, var45, var46, var44, var52, (byte) -114, var52)) {
                                        class45.method289(10, class53.field713[var48], var19, var49, var20);
                                        var49.field839 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var43.field839) {
                        continue;
                    }
                    class45.method289(10, var22, var19, var43, var20);
                    var43.field839 = true;
                }
                if (var21 == 3) {
                    class281 var57 = class239.field3780[class165.field2600][var19][var20];
                    if (var57 != null) {
                        for (class310 var58 = (class310) var57.method1951(108); var58 != null; var58 = (class310) var57.method1955(155)) {
                            int var59 = var58.field5012.field1685;
                            class132 var60 = class14.method92(var59, false);
                            if (class29.field367 == 1) {
                                class65.field967++;
                                class192.method1333(var20, class18.field250, (long) var59, class43.field602 + " -> <col=ff9040>" + var60.field2071, (short) 7, var19, class19.field258, 9910);
                            } else if (class70.field1017) {
                                class139 var65 = class135.field2114 == -1 ? null : class56.method338(class135.field2114, (byte) 109);
                                if ((client.field2581 & 0x1) != 0 && (var65 == null || var60.method892(class135.field2114, var65.field2150, 74) != var65.field2150)) {
                                    class2.field10++;
                                    class192.method1333(var20, class70.field1019, (long) var59, class265.field4368 + " -> <col=ff9040>" + var60.field2071, (short) 25, var19, class44.field611, 9910);
                                }
                            } else {
                                class12.field158++;
                                String[] var61 = var60.field2044;
                                if (class299.field4915) {
                                    var61 = class270.method1851(false, var61);
                                }
                                for (int var62 = 4; var62 >= 0; var62--) {
                                    if (var61 != null && var61[var62] != null) {
                                        class141.field2183++;
                                        byte var63 = 0;
                                        if (var62 == 0) {
                                            var63 = 33;
                                        }
                                        int var64 = -1;
                                        if (var62 == 1) {
                                            var63 = 39;
                                        }
                                        if (var60.field2095 == var62) {
                                            var64 = var60.field2062;
                                        }
                                        if (var62 == 2) {
                                            var63 = 48;
                                        }
                                        if (var60.field2070 == var62) {
                                            var64 = var60.field2074;
                                        }
                                        if (var62 == 3) {
                                            var63 = 21;
                                        }
                                        if (var62 == 4) {
                                            var63 = 51;
                                        }
                                        class192.method1333(var20, var61[var62], (long) var59, "<col=ff9040>" + var60.field2071, var63, var19, var64, 9910);
                                    }
                                }
                                class192.method1333(var20, class27.field347, (long) var59, "<col=ff9040>" + var60.field2071, (short) 1003, var19, class208.field3325, 9910);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 > -2) {
            field3728 = null;
        }
    }
}
