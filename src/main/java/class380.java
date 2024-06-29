import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class380 extends class225 {

    @OriginalMember(owner = "client!s", name = "w", descriptor = "[Lke;")
    public static class162[] field5529 = new class162[5];

    @OriginalMember(owner = "client!s", name = "B", descriptor = "J")
    public static long field5534;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lhs;")
    public static class420 field5535;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Llm;B)V")
    public static final void method2465(class347 arg0, byte arg1) {
        class419.field6198 = arg0;
        if (arg1 != -105) {
            field5529 = null;
        }
        field5531++;
        class28.field412 = class419.field6198.method2272(79, 15);
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Z")
    public abstract boolean method368(int arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lps;III)V")
    public static final void method2466(class394 arg0, int arg1, int arg2, int arg3) {
        field5532++;
        if (arg0.field5757 == 1) {
            class118.field1661++;
            class41.method299(arg0.field5698, -1, arg0.field5653, 0L, "", 18, false, 0);
        }
        if (arg0.field5757 == 2 && !class263.field3821) {
            String var4 = class40.method287(arg0, -1);
            if (var4 != null) {
                class41.method299(arg0.field5698, -1, var4, 0L, "<col=00ff00>" + arg0.field5788, 39, false, -1);
                class169.field2273++;
            }
        }
        if (arg0.field5757 == 3) {
            class41.method299(arg0.field5698, -1, class407.field6045, 0L, "", 16, false, 0);
            class211.field2821++;
        }
        if (arg3 != -1) {
            method2466((class394) null, -111, 117, -82);
        }
        if (arg0.field5757 == 4) {
            class41.method299(arg0.field5698, -1, arg0.field5653, 0L, "", 58, false, 0);
            class385.field5575++;
        }
        if (arg0.field5757 == 5) {
            class41.method299(arg0.field5698, -1, arg0.field5653, 0L, "", 46, false, 0);
            class7.field105++;
        }
        if (arg0.field5757 == 6 && class211.field2807 == null) {
            class130.field1794++;
            class41.method299(arg0.field5698, -1, arg0.field5653, 0L, "", 6, false, -1);
        }
        if (arg0.field5671 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field5670; var6++) {
                for (int var7 = 0; var7 < arg0.field5813; var7++) {
                    int var8 = (arg0.field5636 + 32) * var7;
                    int var9 = (arg0.field5751 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field5662[var5];
                        var8 += arg0.field5803[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < (var8 + 32) && (var9 + 32) > arg2) {
                        class146.field2002 = arg0;
                        class390.field5618 = var5;
                        if (arg0.field5777[var5] > 0) {
                            class304 var10 = client.method1544(arg0);
                            class83 var11 = class9.method74(arg0.field5777[var5] - 1, (byte) -92);
                            if (class63.field844 == 1 && var10.method2078(arg3 - 112)) {
                                if (class377.field5495 != arg0.field5698 || class215.field2863 != var5) {
                                    class422.field6223++;
                                    class41.method299(arg0.field5698, class317.field4628, class384.field5553, (long) var11.field1128, class156.field2125 + " -> <col=ff9040>" + var11.field1193, 22, false, var5);
                                }
                            } else if (class263.field3821 && var10.method2078(-102)) {
                                class99 var12 = class212.field2842 == -1 ? null : class98.method666(class212.field2842, false);
                                if ((class189.field2547 & 0x10) != 0 && (var12 == null || var11.method600(var12.field1380, class212.field2842, -25103) != var12.field1380)) {
                                    class365.field5272++;
                                    class41.method299(arg0.field5698, class445.field6532, class394.field5739, (long) var11.field1128, class375.field5454 + " -> <col=ff9040>" + var11.field1193, 5, false, var5);
                                }
                            } else {
                                String[] var13 = var11.field1150;
                                if (var10.method2078(-99)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            int var15 = -1;
                                            byte var16;
                                            if (var14 == 3) {
                                                var16 = 47;
                                            } else {
                                                var16 = 2;
                                            }
                                            if (var11.field1168 == var14) {
                                                var15 = var11.field1127;
                                            }
                                            if (var11.field1183 == var14) {
                                                var15 = var11.field1174;
                                            }
                                            class438.field6411++;
                                            class41.method299(arg0.field5698, var15, var13[var14], (long) var11.field1128, "<col=ff9040>" + var11.field1193, var16, false, var5);
                                        }
                                    }
                                }
                                if (var10.method2075(-99)) {
                                    class138.field1901++;
                                    class41.method299(arg0.field5698, class317.field4628, class384.field5553, (long) var11.field1128, "<col=ff9040>" + var11.field1193, 34, false, var5);
                                }
                                if (var10.method2078(arg3 ^ 0x50) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 15;
                                            }
                                            int var19 = -1;
                                            if (var17 == 1) {
                                                var18 = 30;
                                            }
                                            if (var17 == 2) {
                                                var18 = 19;
                                            }
                                            if (var11.field1168 == var17) {
                                                var19 = var11.field1127;
                                            }
                                            if (var11.field1183 == var17) {
                                                var19 = var11.field1174;
                                            }
                                            class41.method299(arg0.field5698, var19, var13[var17], (long) var11.field1128, "<col=ff9040>" + var11.field1193, var18, false, var5);
                                            class288.field4156++;
                                        }
                                    }
                                }
                                String[] var20 = arg0.field5802;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            int var23 = -1;
                                            if (var21 == 0) {
                                                var22 = 51;
                                            }
                                            if (var21 == 1) {
                                                var22 = 1;
                                            }
                                            if (var21 == 2) {
                                                var22 = 23;
                                            }
                                            if (var21 == 3) {
                                                var22 = 10;
                                            }
                                            if (var11.field1168 == var21) {
                                                var23 = var11.field1127;
                                            }
                                            if (var21 == 4) {
                                                var22 = 25;
                                            }
                                            if (var11.field1183 == var21) {
                                                var23 = var11.field1174;
                                            }
                                            class41.method299(arg0.field5698, var23, var20[var21], (long) var11.field1128, "<col=ff9040>" + var11.field1193, var22, false, var5);
                                            class22.field289++;
                                        }
                                    }
                                }
                                class41.method299(arg0.field5698, class284.field4129, class38.field532, (long) var11.field1128, "<col=ff9040>" + var11.field1193, 1004, false, var5);
                                class268.field3866++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field5790) {
            return;
        }
        if (!class263.field3821) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var28 = class226.method1310(5157, var24, arg0);
                if (var28 != null) {
                    class27.field395++;
                    class41.method299(arg0.field5698, class431.method2729(arg0, var24, 1), var28, (long) (var24 + 1), arg0.field5687, 1003, false, arg0.field5649);
                }
            }
            String var25 = class40.method287(arg0, -1);
            if (var25 != null) {
                class41.method299(arg0.field5698, -1, var25, 0L, arg0.field5687, 39, false, arg0.field5649);
                class169.field2273++;
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = class226.method1310(5157, var26, arg0);
                if (var27 != null) {
                    class41.method299(arg0.field5698, class431.method2729(arg0, var26, arg3 + 2), var27, (long) (var26 + 1), arg0.field5687, 36, false, arg0.field5649);
                    class27.field395++;
                }
            }
            if (!client.method1544(arg0).method2069(1)) {
                return;
            }
            if (arg0.field5681 == null) {
                class41.method299(arg0.field5698, -1, class396.field5857, 0L, "", 6, false, arg0.field5649);
            } else {
                class41.method299(arg0.field5698, -1, arg0.field5681, 0L, "", 6, false, arg0.field5649);
            }
            class130.field1794++;
        } else if (client.method1544(arg0).method2072(5785441) && (class189.field2547 & 0x20) != 0) {
            class41.method299(arg0.field5698, class445.field6532, class394.field5739, 0L, class375.field5454 + " -> " + arg0.field5687, 32, false, arg0.field5649);
            class52.field700++;
            return;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
    public static final void method2467(byte arg0) {
        if (arg0 != 38) {
            field5534 = 41L;
        }
        class174.field2324.method1141(arg0 + 218);
        field5530++;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        field5529 = null;
        if (arg0 < 9) {
            field5534 = 111L;
        }
        field5535 = null;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method367(int arg0);

    static {
        for (int var0 = 0; var0 < field5529.length; var0++) {
            field5529[var0] = new class162();
        }
        field5534 = 0L;
    }
}
