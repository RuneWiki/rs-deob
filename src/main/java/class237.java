import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class237 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Z")
    public static boolean field3376 = false;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lka;")
    public static class408 field3372 = new class408(8);

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lhc;")
    public static class368 field3378 = new class368("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "[[[B")
    public static byte[][][] field3379;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(JZ)V")
    public static final void method1547(long arg0, boolean arg1) {
        field3371++;
        if (arg1) {
            return;
        }
        int var3 = class24.field309;
        int var4 = class81.field1126;
        if (class436.field6153 != var3) {
            int var5 = var3 - class436.field6153;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class436.field6153 += var6;
        }
        if (class431.field6044 != var4) {
            int var7 = var4 - class431.field6044;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class431.field6044 += var8;
        }
        if (!class229.field3214) {
            class332.field4483 += (float) arg0 * class359.field4972 / 40.0F * 8.0F;
            class356.field4785 += (float) arg0 * class230.field3233 / 40.0F * 8.0F;
        }
        class444.method2750(-20414);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1548(int arg0) {
        field3372 = null;
        field3378 = null;
        int var1 = 46 / ((-arg0 - 20) / 45);
        field3379 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBZIZ)V")
    public static final void method1549(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        class246.method1605(0, arg3, arg2, 0, arg4, arg0, class85.field1193.length - 1);
        field3374++;
        class373.field5176 = 0;
        if (arg1 < -44) {
            class422.field5841 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public static final void method1550(int arg0) {
        field3373++;
        class261 var1 = (class261) class48.field612.method1173(arg0 + 24501);
        if (arg0 != -24501) {
            method1548(-127);
        }
        while (var1 != null) {
            class127 var2 = var1.field3603;
            if (class343.field4623 != var2.field42 || class246.field3467 > var2.field1916) {
                var1.method1884(false);
                var2.method962(arg0 ^ 0x5FCC);
            } else if (var2.field1913 <= class246.field3467) {
                if (var2.field1896 > 0) {
                    class419 var3 = class428.field5951[var2.field1896 - 1];
                    if (var3 != null && var3.field40 >= 0 && class11.field107 * 128 > var3.field40 && var3.field44 >= 0 && var3.field44 < class264.field3620 * 128) {
                        var2.method959(var3.field44, var3.field40, class50.method408(var2.field42, var3.field40, var3.field44, 16) - var2.field1897, arg0 + 24502, class246.field3467);
                    }
                }
                if (var2.field1896 < 0) {
                    int var4 = -var2.field1896 - 1;
                    class423 var5;
                    if (class217.field3030 == var4) {
                        var5 = class359.field4970;
                    } else {
                        var5 = class87.field1227[var4];
                    }
                    if (var5 != null && var5.field40 >= 0 && var5.field40 < (class11.field107 * 128) && var5.field44 >= 0 && var5.field44 < (class264.field3620 * 128)) {
                        var2.method959(var5.field44, var5.field40, class50.method408(var2.field42, var5.field40, var5.field44, 16) - var2.field1897, 1, class246.field3467);
                    }
                }
                var2.method963(class54.field694, arg0 + 24373);
                class147.method1064(var2, true);
            }
            var1 = (class261) class48.field612.method1165(true);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLrd;)V")
    public static final void method1551(boolean arg0, class419 arg1) {
        field3375++;
        if (!arg0 || class149.field2171 >= 400) {
            return;
        }
        class233 var2 = arg1.field5807;
        if (var2.field3327 != null) {
            var2 = var2.method1524((byte) 91);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field3275) {
            return;
        }
        String var3 = var2.field3269;
        if (var2.field3318 != 0) {
            String var4 = class133.field1986 == 1 ? class35.field477.method2313((byte) -103, class445.field6241) : class149.field2160.method2313((byte) -88, class445.field6241);
            var3 = var3 + class134.method997(class359.field4970.field5878, (byte) 115, var2.field3318) + " (" + var4 + var2.field3318 + ")";
        }
        if (class213.field2980) {
            class200 var5 = class428.field5955 == -1 ? null : class405.method2504(class428.field5955, (byte) -118);
            if ((class277.field3780 & 0x2) != 0) {
                if (var5 == null || var2.method1520(31133, var5.field2876, class428.field5955) != var5.field2876) {
                    class46.method379(class302.field4121, 44, 0, true, (long) arg1.field2622, 0, class438.field6183, class119.field1816 + " -> <col=ffff00>" + var3);
                    class98.field1352++;
                }
                return;
            }
            return;
        }
        String[] var6 = var2.field3273;
        if (class216.field3021) {
            var6 = class415.method2566(255, var6);
        }
        if (var6 != null) {
            for (int var7 = 4; var7 >= 0; var7--) {
                if (var6[var7] != null && (class133.field1986 != 0 || !var6[var7].equalsIgnoreCase(class109.field1690.method2313((byte) -68, class445.field6241)))) {
                    byte var8 = 0;
                    int var9 = class274.field3749;
                    if (var7 == 0) {
                        var8 = 49;
                    }
                    if (var7 == 1) {
                        var8 = 18;
                    }
                    if (var7 == 2) {
                        var8 = 10;
                    }
                    if (var7 == 3) {
                        var8 = 47;
                    }
                    if (var2.field3319 == var7) {
                        var9 = var2.field3297;
                    }
                    if (var7 == 4) {
                        var8 = 4;
                    }
                    if (var2.field3277 == var7) {
                        var9 = var2.field3302;
                    }
                    class231.field3250++;
                    class46.method379(var6[var7], var8, 0, true, (long) arg1.field2622, 0, var9, "<col=ffff00>" + var3);
                }
            }
        }
        if (class133.field1986 == 0 && var6 != null) {
            for (int var10 = 4; var10 >= 0; var10--) {
                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class109.field1690.method2313((byte) -120, class445.field6241))) {
                    short var11 = 0;
                    if (var2.field3318 > class359.field4970.field5878) {
                        var11 = 2000;
                    }
                    short var12 = 0;
                    if (var10 == 0) {
                        var12 = 49;
                    }
                    if (var10 == 1) {
                        var12 = 18;
                    }
                    if (var10 == 2) {
                        var12 = 10;
                    }
                    if (var10 == 3) {
                        var12 = 47;
                    }
                    if (var10 == 4) {
                        var12 = 4;
                    }
                    if (var12 != 0) {
                        var12 += var11;
                    }
                    class442.field6214++;
                    class46.method379(var6[var10], var12, 0, arg0, (long) arg1.field2622, 0, var2.field3324, "<col=ffff00>" + var3);
                }
            }
        }
        class446.field6246++;
        class46.method379(class352.field4743.method2313((byte) -68, class445.field6241), 1006, 0, arg0, (long) arg1.field2622, 0, class380.field5245, "<col=ffff00>" + var3);
    }
}
