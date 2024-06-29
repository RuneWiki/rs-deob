import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class99 {

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[B")
    public byte[] field620;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lr;")
    private static class118 field619 = class153.method1136(96, "Location");

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Lr;")
    public static class118 field613 = field619;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field616 = -1;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lr;")
    private static class118 field618 = class153.method1136(100, "Enter your username (V password)3");

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "[I")
    public static int[] field617 = new int[25];

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Lr;")
    public static class118 field610 = field618;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
    public static int[] field608 = new int[500];

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lef;")
    public static class35 field614 = new class35(4096);

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "Lr;")
    public static class118 field625 = class153.method1136(76, "Benutzername: ");

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Lr;")
    private static class118 field624 = class153.method1136(125, " is already on your ignore list)3");

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Lr;")
    public static class118 field626 = field624;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "Lpa;")
    public static class105 field615;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field609++;
        if (arg0 >= 1 && arg7 >= 1 && arg0 <= 102 && arg7 <= 102) {
            if (class68.field1582 && class106.field2468 != arg4) {
                return;
            }
            int var8 = 0;
            if (arg6 == 0) {
                var8 = class68.field1583.method1169(arg4, arg0, arg7);
            }
            if (arg6 == 1) {
                var8 = class68.field1583.method1186(arg4, arg0, arg7);
            }
            if (arg6 == 2) {
                var8 = class68.field1583.method1194(arg4, arg0, arg7);
            }
            boolean var9 = false;
            boolean var10 = true;
            if (arg6 == 3) {
                var8 = class68.field1583.method1156(arg4, arg0, arg7);
            }
            boolean var11 = false;
            if (var8 != 0) {
                int var12 = class68.field1583.method1147(arg4, arg0, arg7, var8);
                int var13 = var12 & 0x1F;
                int var14 = var12 >> 6 & 0x3;
                int var15 = var8 >> 14 & 0x7FFF;
                if (arg6 == 0) {
                    class68.field1583.method1189(arg4, arg0, arg7);
                    class148 var16 = class47.method396(117, var15);
                    if (var16.field3297 != 0) {
                        class121.field2790[arg4].method1000(arg0, var16.field3278, 1, var14, var13, arg7);
                    }
                }
                if (arg6 == 1) {
                    class68.field1583.method1180(arg4, arg0, arg7);
                }
                if (arg6 == 2) {
                    class68.field1583.method1152(arg4, arg0, arg7);
                    class148 var17 = class47.method396(117, var15);
                    if (var17.field3279 + arg0 > 103 || var17.field3279 + arg7 > 103 || var17.field3287 + arg0 > 103 || var17.field3287 + arg7 > 103) {
                        return;
                    }
                    if (var17.field3297 != 0) {
                        class121.field2790[arg4].method996(-89, var17.field3278, arg0, var14, arg7, var17.field3279, var17.field3287);
                    }
                }
                if (arg6 == 3) {
                    class68.field1583.method1188(arg4, arg0, arg7);
                    class148 var18 = class47.method396(117, var15);
                    if (var18.field3297 == 1) {
                        class121.field2790[arg4].method1001(arg7, 1, arg0);
                    }
                }
            }
            if (arg3 >= 0) {
                int var19 = arg4;
                if (arg4 < 3 && (class33.field830[1][arg0][arg7] & 0x2) == 2) {
                    var19 = arg4 + 1;
                }
                class1.method6(class68.field1583, arg2, class121.field2790[arg4], arg3, arg4, var19, arg0, -27122, arg5, arg7);
            }
        }
        if (arg1 <= 49) {
            method224(true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V")
    public static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field607++;
        int var6 = 6 / ((arg0 + 37) / 60);
        class149.field3350[0].method719(arg3, arg1);
        class149.field3350[1].method719(arg3, arg1 + arg5 - 16);
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - var7 - 32) * arg2 / (arg4 - arg5);
        class52.method473(arg3, arg1 + 16, 16, arg5 - 32, class120.field2778);
        class52.method473(arg3, arg1 + var8 + 16, 16, var7, class22.field544);
        class52.method468(arg3, var8 + arg1 + 16, var7, class151.field3396);
        class52.method468(arg3 + 1, arg1 + 16 + var8, var7, class151.field3396);
        class52.method477(arg3, arg1 + var8 + 16, 16, class151.field3396);
        class52.method477(arg3, arg1 + var8 + 17, 16, class151.field3396);
        class52.method468(arg3 + 15, arg1 - (-16 - var8), var7, class15.field392);
        class52.method468(arg3 + 14, var8 + 17 + arg1, var7 - 1, class15.field392);
        class52.method477(arg3, var7 + var8 + arg1 + 15, 16, class15.field392);
        class52.method477(arg3 + 1, var8 + 14 + arg1 + var7, 15, class15.field392);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
    public static final void method222(boolean arg0, boolean arg1) {
        if (arg0) {
            field615 = null;
        }
        for (int var2 = 0; var2 < class115.field2702; var2++) {
            int var3 = (class68.field1580[var2] << 14) + 536870912;
            class83 var4 = class74.field1833[class68.field1580[var2]];
            if (var4 != null && var4.method253(-3) && var4.field1989.field2564 == arg1 && var4.field1989.method865(123)) {
                int var5 = var4.field760 >> 7;
                int var6 = var4.field712 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field733 == 1 && (var4.field760 & 0x7F) == 64 && (var4.field712 & 0x7F) == 64) {
                        if (class51.field1229[var5][var6] == class159.field3660) {
                            continue;
                        }
                        class51.field1229[var5][var6] = class159.field3660;
                    }
                    if (!var4.field1989.field2585) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class68.field1583.method1191(class106.field2468, var4.field760, var4.field712, class46.method386(-15186, class106.field2468, (var4.field733 - 1) * 64 + var4.field760, var4.field712 - 64 - -(var4.field733 * 64)), (var4.field733 - 1) * 64 + 60, var4, var4.field768, var3, var4.field752);
                }
            }
        }
        field622++;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
    public static final void method223(byte arg0) {
        class22.field541 = null;
        class148.field3332 = null;
        class35.field895 = null;
        field621++;
        class149.field3349 = null;
        class68.field1564 = null;
        class128.field2933 = null;
        class56.field1337 = null;
        class54.field1273 = null;
        class77.field1874 = null;
        class87.field2100 = null;
        class82.field1977 = null;
        class153.field3468 = null;
        int var1 = 126 % ((arg0 + 66) / 36);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V")
    public class25(byte[] arg0) {
        this.field620 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method224(boolean arg0) {
        field612++;
        if (class136.field3086 != null || class95.field2249 != null) {
            return;
        }
        if (arg0) {
            method222(false, true);
        }
        int var1 = class82.field1972;
        if (class138.field3144) {
            if (var1 != 1) {
                int var6 = class33.field827;
                int var7 = class44.field1049;
                if (var6 < class138.field3157 - 10 || class138.field3157 + class151.field3418 + 10 < var6 || class89.field2141 - 10 > var7 || var7 > class71.field1651 + class89.field2141 + 10) {
                    class138.field3144 = false;
                    class121.method947(class138.field3157, class151.field3418, -93, class71.field1651, class89.field2141);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class151.field3418;
            int var9 = class89.field2141;
            int var10 = class138.field3157;
            int var11 = class29.field701;
            int var12 = class14.field317;
            int var13 = -1;
            for (int var14 = 0; var14 < class39.field950; var14++) {
                int var15 = (class39.field950 - var14 - 1) * 15 + var9 + 31;
                if (var10 < var11 && var8 + var10 > var11 && var15 - 13 < var12 && var12 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class22.method208(var13, 88);
            }
            class138.field3144 = false;
            class121.method947(class138.field3157, class151.field3418, 112, class71.field1651, class89.field2141);
            return;
        }
        if (var1 == 1 && class39.field950 > 0) {
            int var2 = class42.field1015[class39.field950 - 1];
            if (var2 == 4 || var2 == 44 || var2 == 42 || var2 == 58 || var2 == 28 || var2 == 45 || var2 == 23 || var2 == 16 || var2 == 40 || var2 == 7 || var2 == 18 || var2 == 1002) {
                int var3 = class83.field1987[class39.field950 - 1];
                int var4 = field608[class39.field950 - 1];
                class74 var5 = class99.method770(-4894, var4);
                if (class44.method370((byte) -125, class46.method384(var5, 0)) || class140.method1045(0, class46.method384(var5, 0))) {
                    class92.field2217 = false;
                    class31.field784 = 0;
                    if (class136.field3086 != null) {
                        class26.method232((byte) 53, class136.field3086);
                    }
                    class136.field3086 = class99.method770(-4894, var4);
                    class80.field1944 = class29.field701;
                    class88.field2131 = var3;
                    class14.field340 = class14.field317;
                    class26.method232((byte) 54, class136.field3086);
                    return;
                }
            }
        }
        if (var1 == 1 && (class148.field3294 == 1 && class39.field950 > 2 || class92.method734(class39.field950 - 1, (byte) -118))) {
            var1 = 2;
        }
        if (var1 == 1 && class39.field950 > 0) {
            class22.method208(class39.field950 - 1, 116);
        }
        if (var1 == 2 && class39.field950 > 0) {
            class11.method86(503);
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method225(int arg0) {
        field617 = null;
        field618 = null;
        field615 = null;
        field626 = null;
        field608 = null;
        field610 = null;
        if (arg0 != 32) {
            method225(-74);
        }
        field624 = null;
        field619 = null;
        field613 = null;
        field625 = null;
        field614 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lr;Lff;Lr;B)[Ln;")
    public static final class90[] method226(class118 arg0, class42 arg1, class118 arg2, byte arg3) {
        field611++;
        if (arg3 != 113) {
            field610 = null;
        }
        int var4 = arg1.method356(arg2, 0);
        int var5 = arg1.method351(5, arg0, var4);
        return class85.method704(var4, (byte) 126, var5, arg1);
    }
}
