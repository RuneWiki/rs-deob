import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1143 = 2;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Laf;")
    public static class7 field1147 = class48.method406(40, "rot:");

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lua;")
    public static class139 field1150 = new class139(5000);

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Laf;")
    private static class7 field1153 = class48.method406(40, "Service unavailable)3");

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Laf;")
    public static class7 field1156 = field1153;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lrf;")
    public static class124 field1151;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[I")
    public static int[] field1152;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "[I")
    public static int[] field1155;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Laf;Laf;Laf;I)V")
    public static final void method396(class7 arg0, class7 arg1, class7 arg2, int arg3) {
        class106.field2613 = arg1;
        class106.field2602 = arg0;
        if (arg3 < 1) {
            method396(null, null, null, -98);
        }
        class106.field2616 = arg2;
        field1148++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
    public static final boolean method397(int arg0, int arg1) {
        if (arg1 == 3) {
            field1141++;
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ld;I)V")
    public static final void method398(class22 arg0, int arg1) {
        field1146++;
        if (class96.field2269) {
            class82.method686(arg0, -61);
            return;
        }
        if (class13.field337 == 1 && class10.field267 >= 715 && class111.field2668 >= 453) {
            class111.field2683 = !class111.field2683;
            if (class111.field2683) {
                class142.method1155(103);
            } else {
                class137.method1126(false, class113.field2710, 255, -98, class24.field656, class106.field2614);
            }
        }
        if (class108.field2634 == 5) {
            return;
        }
        class151.field3548++;
        if (class108.field2634 != 10) {
            return;
        }
        if (arg1 > -99) {
            method396(null, null, null, -4);
        }
        if (class126.field3024 != 2 && class155.field3610 == 0) {
            if (class13.field337 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class10.field267 >= var2 && class10.field267 <= var2 + var4 && var3 <= class111.field2668 && var3 + var5 >= class111.field2668) {
                    class95.method774(115);
                    return;
                }
            }
            if (class46.field1097 != null) {
                class95.method774(115);
            }
        }
        int var6 = class13.field337;
        int var7 = class10.field267;
        int var8 = class111.field2668;
        if (class89.field2078 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var6 == 1 && var9 - 75 <= var7 && var9 + 75 >= var7 && var10 - 20 <= var8 && var8 <= var10 + 20) {
                class89.field2078 = 3;
                class37.field944 = 0;
            }
            short var11 = 462;
            if (var6 == 1 && var7 >= var11 - 75 && var11 + 75 >= var7 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class37.field944 = 0;
                class89.field2078 = 2;
                class106.field2602 = class46.field1105;
                class106.field2613 = class69.field1521;
                class106.field2616 = class46.field1125;
                return;
            }
        } else if (class89.field2078 == 2) {
            short var14 = 302;
            short var15 = 231;
            int var20 = var15 + 30;
            if (var6 == 1 && var8 >= var20 - 15 && var8 < var20) {
                class37.field944 = 0;
            }
            var20 += 15;
            short var16 = 321;
            if (var6 == 1 && var20 - 15 <= var8 && var8 < var20) {
                class37.field944 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var14 - 75 <= var7 && var14 + 75 >= var7 && var16 - 20 <= var8 && var16 + 20 >= var8) {
                class106.field2608 = class106.field2608.method63(97).method96(65);
                if (class106.field2608.method92(-91) == 0) {
                    method396(class46.field1096, class106.field2590, class46.field1106, 115);
                    return;
                }
                if (class106.field2618.method92(27) == 0) {
                    method396(class46.field1086, class152.field3553, class46.field1093, 30);
                    return;
                }
                method396(class46.field1095, class121.field2855, class46.field1090, 20);
                class111.method880(20, 20);
                return;
            }
            short var17 = 462;
            if (var6 == 1 && var17 - 75 <= var7 && var17 + 75 >= var7 && var8 >= var16 - 20 && var8 <= var16 + 20) {
                class106.field2608 = class106.field2614;
                class106.field2618 = class106.field2614;
                class89.field2078 = 0;
            }
            while (true) {
                boolean var18;
                label206: do {
                    while (class118.method916(127)) {
                        var18 = false;
                        for (int var19 = 0; var19 < class84.field1988.method92(-96); var19++) {
                            if (class2.field12 == class84.field1988.method79(var19, 0)) {
                                var18 = true;
                                break;
                            }
                        }
                        if (class37.field944 != 0) {
                            continue label206;
                        }
                        if (class25.field667 == 85 && class106.field2608.method92(35) > 0) {
                            class106.field2608 = class106.field2608.method77(0, 85, class106.field2608.method92(-80) - 1);
                        }
                        if (class25.field667 == 84 || class25.field667 == 80) {
                            class37.field944 = 1;
                        }
                        if (var18 && class106.field2608.method92(-127) < 12) {
                            class106.field2608 = class106.field2608.method89(class2.field12, true);
                        }
                    }
                    return;
                } while (class37.field944 != 1);
                if (class25.field667 == 85 && class106.field2618.method92(-126) > 0) {
                    class106.field2618 = class106.field2618.method77(0, 74, class106.field2618.method92(108) - 1);
                }
                if (class25.field667 == 84 || class25.field667 == 80) {
                    class37.field944 = 0;
                }
                if (class22.field617 == 2 && class25.field667 == 84) {
                    class106.field2608 = class106.field2608.method63(97).method96(65);
                    if (class106.field2608.method92(92) == 0) {
                        method396(class46.field1096, class106.field2590, class46.field1106, 15);
                        return;
                    }
                    if (class106.field2618.method92(-88) == 0) {
                        method396(class46.field1086, class152.field3553, class46.field1093, 106);
                        return;
                    }
                    method396(class46.field1095, class121.field2855, class46.field1090, 56);
                    class111.method880(20, 20);
                    return;
                }
                if (var18 && class106.field2618.method92(-107) < 20) {
                    class106.field2618 = class106.field2618.method89(class2.field12, true);
                }
            }
        } else if (class89.field2078 == 3) {
            short var12 = 321;
            short var13 = 382;
            if (var6 == 1 && var7 >= var13 - 75 && var7 <= var13 + 75 && var12 - 20 <= var8 && var8 <= var12 + 20) {
                class89.field2078 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method399(int arg0) {
        field1156 = null;
        field1155 = null;
        field1152 = null;
        if (arg0 == -3) {
            field1151 = null;
            field1150 = null;
            field1147 = null;
            field1153 = null;
        }
    }
}
