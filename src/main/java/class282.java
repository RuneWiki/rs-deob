import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class282 extends class137 {

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Ltl;")
    public static class59 field4857 = class85.method639(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 9588);

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "Ltl;")
    public static class59 field4860 = class85.method639("<col=00ffff>", 9588);

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "Ltl;")
    public static class59 field4863 = class85.method639("Spieler kann nicht gefunden werden: ", 9588);

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "[B")
    public static byte[] field4856;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V", line = 16)
    public static void method1979(boolean arg0) {
        field4863 = null;
        if (!arg0) {
            field4860 = null;
            field4857 = null;
            field4856 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 30)
    public static final void method1980(int arg0) {
        class308.method2135(false, 78);
        class194.field3224 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class288.field4953.length; var2++) {
            if (class11.field137[var2] != -1 && class288.field4953[var2] == null) {
                class288.field4953[var2] = class269.field4664.method2042(class11.field137[var2], 0, (byte) -125);
                if (class288.field4953[var2] == null) {
                    class194.field3224++;
                    var1 = false;
                }
            }
            if (class161.field2618[var2] != -1 && class123.field2035[var2] == null) {
                class123.field2035[var2] = class269.field4664.method2063(class101.field1636[var2], 0, 89, class161.field2618[var2]);
                if (class123.field2035[var2] == null) {
                    class194.field3224++;
                    var1 = false;
                }
            }
            if (class55.field815) {
                if (class38.field576[var2] != -1 && class190.field3185[var2] == null) {
                    class190.field3185[var2] = class269.field4664.method2042(class38.field576[var2], 0, (byte) -122);
                    if (class190.field3185[var2] == null) {
                        class194.field3224++;
                        var1 = false;
                    }
                }
                if (class264.field4567[var2] != -1 && class230.field3784[var2] == null) {
                    class230.field3784[var2] = class269.field4664.method2042(class264.field4567[var2], 0, (byte) -128);
                    if (class230.field3784[var2] == null) {
                        var1 = false;
                        class194.field3224++;
                    }
                }
            }
            if (class155.field2539 != null && class78.field1240[var2] == null && class155.field2539[var2] != -1) {
                class78.field1240[var2] = class269.field4664.method2063(class101.field1636[var2], 0, 112, class155.field2539[var2]);
                if (class78.field1240[var2] == null) {
                    var1 = false;
                    class194.field3224++;
                }
            }
        }
        field4861++;
        if (class86.field1350 == null) {
            if (class173.field2840 == null || !class45.field740.method2033(class233.method1630(new class59[] { class173.field2840.field4692, class113.field1829 }, -2883), (byte) -80)) {
                class86.field1350 = new class9(0);
            } else if (class45.field740.method2044(class233.method1630(new class59[] { class173.field2840.field4692, class113.field1829 }, -2883), -11)) {
                class86.field1350 = class13.method91(class233.method1630(new class59[] { class173.field2840.field4692, class113.field1829 }, -2883), 0, class45.field740);
            } else {
                class194.field3224++;
                var1 = false;
            }
        }
        if (!var1) {
            class275.field4727 = 1;
            return;
        }
        boolean var3 = true;
        class200.field3316 = 0;
        for (int var4 = 0; var4 < class288.field4953.length; var4++) {
            byte[] var5 = class123.field2035[var4];
            if (var5 != null) {
                int var6 = (class260.field4348[var4] >> 8) * 64 - class197.field3249;
                int var7 = (class260.field4348[var4] & 0xFF) * 64 - class187.field3135;
                if (class97.field1562) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class4.method32(var7, var5, -1, var6);
            }
            if (class55.field815) {
                byte[] var8 = class230.field3784[var4];
                if (var8 != null) {
                    int var9 = (class260.field4348[var4] & 0xFF) * 64 - class187.field3135;
                    int var10 = (class260.field4348[var4] >> 8) * 64 - class197.field3249;
                    if (class97.field1562) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class4.method32(var9, var8, -1, var10);
                }
            }
        }
        if (!var3) {
            class275.field4727 = 2;
            return;
        }
        if (class275.field4727 != 0) {
            class128.method939(96, true, class233.method1630(new class59[] { class69.field1059, class294.field5021 }, -2883));
        }
        class269.method1881((byte) -1);
        boolean var11 = false;
        class161.method1145((byte) 43);
        if (class55.field815 && class193.field3216) {
            for (int var12 = 0; var12 < class288.field4953.length; var12++) {
                if (class230.field3784[var12] != null || class190.field3185[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class194.method1413(4, 104, 104, class55.field815 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class41.field612[var13].method198(31407);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class308.field5219[var14][var15][var16] = 0;
                }
            }
        }
        class138.method1009(true, false);
        if (class55.field815) {
            class158.field2591.method36();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class158.field2590[var17][var18].field2714 = true;
                }
            }
        }
        if (class55.field815) {
            class135.method987();
        }
        if (class55.field815) {
            class23.method145(arg0 ^ 0xFFB);
        }
        class269.method1881((byte) -1);
        System.gc();
        class308.method2135(true, 78);
        class270.method1884((byte) -102, false);
        if (!class97.field1562) {
            class285.method1991((byte) 119, false);
            class308.method2135(true, arg0 ^ 0xFFFFF023);
            if (class55.field815) {
                int var19 = class286.field4920.field1729[0] >> 3;
                int var20 = class286.field4920.field1773[0] >> 3;
                class230.method1611(var19, 5, var20);
            }
            class119.method883(arg0 ^ 0xFFFFF06D, false);
            if (class78.field1240 != null) {
                class72.method583((byte) -110);
            }
        }
        if (class97.field1562) {
            class280.method1965(false, (byte) -45);
            class308.method2135(true, 78);
            if (class55.field815) {
                int var21 = class286.field4920.field1729[0] >> 3;
                int var22 = class286.field4920.field1773[0] >> 3;
                class230.method1611(var21, 5, var22);
            }
            class65.method541(false, true);
        }
        class161.method1145((byte) 46);
        class308.method2135(true, 78);
        class314.method2161(class41.field612, false, (byte) -107);
        if (class55.field815) {
            class135.method981();
        }
        class308.method2135(true, 78);
        int var23 = class198.field3270;
        if (class247.field4119 < var23) {
            var23 = class247.field4119;
        }
        if (var23 < class247.field4119 - 1) {
            int var24 = class247.field4119 - 1;
        }
        if (class125.method922((byte) 25)) {
            class41.method263(0);
        } else {
            class41.method263(class198.field3270);
        }
        class22.method144(arg0 ^ 0xFFFFF16D);
        if (class55.field815 && var11) {
            class265.method1835(true);
            class270.method1884((byte) -102, true);
            if (!class97.field1562) {
                class285.method1991((byte) 96, true);
                class308.method2135(true, 78);
                class119.method883(0, true);
            }
            if (class97.field1562) {
                class280.method1965(true, (byte) -45);
                class308.method2135(true, 78);
                class65.method541(true, true);
            }
            class161.method1145((byte) 32);
            class308.method2135(true, 78);
            class314.method2161(class41.field612, true, (byte) -111);
            class308.method2135(true, arg0 + 4065);
            class22.method144(256);
            class265.method1835(false);
        }
        if (class55.field815) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class158.field2590[var25][var26].method1189(class97.field1558[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class81.method620(var27, -7221, var28);
            }
        }
        if (arg0 != -3987) {
            field4856 = (byte[]) null;
        }
        class303.method2111(70);
        class269.method1881((byte) -1);
        client.method279(73);
        class161.method1145((byte) 116);
        if (class253.field4209 != null && class21.field284 != null && class238.field3978 == 25) {
            class314.field5318++;
            class234.field3888.method1768(true, 219);
            class234.field3888.method1213(-1, 1057001181);
        }
        if (!class97.field1562) {
            int var29 = (class187.field3127 - 6) / 8;
            int var30 = (class294.field5017 - 6) / 8;
            int var31 = (class187.field3127 + 6) / 8;
            int var32 = (class294.field5017 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var31 + 1); var33++) {
                for (int var34 = var30 - 1; var34 <= var32 + 1; var34++) {
                    if (var29 > var33 || var31 < var33 || var30 > var34 || var32 < var34) {
                        class269.field4664.method2055(class233.method1630(new class59[] { class245.field4100, class81.method619((byte) -86, var33), class113.field1822, class81.method619((byte) -77, var34) }, -2883), true);
                        class269.field4664.method2055(class233.method1630(new class59[] { class231.field3802, class81.method619((byte) -83, var33), class113.field1822, class81.method619((byte) -89, var34) }, -2883), true);
                    }
                }
            }
        }
        if (class238.field3978 == 28) {
            class286.method1996(30143, 10);
        } else {
            class286.method1996(30143, 30);
            if (class21.field284 != null) {
                class234.field3888.method1768(true, 13);
            }
        }
        class269.method1881((byte) -1);
        class239.method1672((byte) -90);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lma;B)Ltl;", line = 529)
    public static final class59 method1981(class263 arg0, byte arg1) {
        field4859++;
        int var2 = -98 / ((arg1 + 20) / 54);
        if (class46.method329(127, client.method278(arg0)) == 0) {
            return null;
        } else if (arg0.field4475 == null || arg0.field4475.method452(255).method495(127) == 0) {
            return class39.field592 ? class162.field2626 : null;
        } else {
            return arg0.field4475;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILp;)I", line = 557)
    public static final int method1982(int arg0, class23 arg1) {
        class119 var2 = arg1.field314;
        field4858++;
        if (arg0 != 15971) {
            method1979(true);
        }
        if (var2.field1958 != null) {
            var2 = var2.method890(958);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1950;
        if (arg1.field1767 == arg1.field1720) {
            var3 = var2.field1935;
        } else if (arg1.field1788 == arg1.field1767) {
            var3 = var2.field1989;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z")
    public abstract boolean method1433(byte arg0);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1435(byte arg0);
}
