import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class132 {

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lwb;")
    public static class130 field3187 = class26.method212("Willkommen auf RuneScape", -32376);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[Lmc;")
    public static class75[] field3191 = new class75[256];

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lwb;")
    private static class130 field3182 = class26.method212("Please subscribe)1 or use a different world)3", -32376);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3186 = 0;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3197 = 0;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lwb;")
    public static class130 field3198 = class26.method212("leuchten3:", -32376);

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lwb;")
    public static class130 field3189 = field3182;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lwb;")
    public static class130 field3190 = class26.method212("weiss:", -32376);

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lwb;")
    public static class130 field3200 = class26.method212("und die Schaltfl-=che (WSpielkonto erstellen(W am", -32376);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lqd;")
    public static class100 field3199;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Lwc;")
    public static class131 field3202;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Z")
    public static boolean field3194;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "[[I")
    public static int[][] field3201;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1014(int arg0, int arg1, int arg2) {
        field3193++;
        if (arg0 == 0 && class129.field3052 == arg2) {
            return true;
        } else if (arg0 == arg1 && class61.field1565 == arg2) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class52.field1368 == arg2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lna;", line = 29)
    public static final class79 method1015(int arg0, int arg1) {
        field3196++;
        class79 var2 = (class79) client.field522.method402((long) arg0, arg1 ^ 0xFFFFFF93);
        if (arg1 != 5) {
            return null;
        } else if (var2 == null) {
            class79 var3 = class115.method878((byte) -77, arg0, class23.field676, false, class43.field1195);
            if (var3 != null) {
                client.field522.method403((long) arg0, var3, (byte) -101);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 72)
    public static void method1016(byte arg0) {
        field3189 = null;
        if (arg0 != 0) {
            method1015(47, -39);
        }
        field3201 = null;
        field3187 = null;
        field3190 = null;
        field3202 = null;
        field3200 = null;
        field3182 = null;
        field3191 = null;
        field3199 = null;
        field3198 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BB)I", line = 123)
    public static final int method1017(int arg0, byte[] arg1, byte arg2) {
        field3192++;
        if (arg2 >= -82) {
            field3186 = -104;
        }
        return class23.method201(255, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lk;B)I", line = 147)
    public static final int method1018(class60 arg0, byte arg1) {
        field3184++;
        int var2 = 0;
        if (arg0.method510(class33.field915, -1, class64.field1641)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class52.field1371)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class97.field2346)) {
            var2++;
        }
        if (arg1 != 37) {
            method1015(59, -86);
        }
        if (arg0.method510(class33.field915, -1, class40.field1134)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class99.field2400)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class85.field2035)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class94.field2287)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class37.field1079)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class68.field1754)) {
            var2++;
        }
        if (arg0.method510(class33.field915, arg1 ^ 0xFFFFFFDA, class96.field2335)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class35.field992)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class101.field2448)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class27.field790)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class67.field1705)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class53.field1382)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class21.field617)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class36.field1033)) {
            var2++;
        }
        if (arg0.method510(class33.field915, arg1 - 38, class58.field1470)) {
            var2++;
        }
        if (arg0.method510(class33.field915, -1, class53.field1387)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLab;)I", line = 229)
    public static final int method1019(int arg0, byte arg1, class3 arg2) {
        field3203++;
        if (arg2.field86 == null || arg2.field86.length <= arg0) {
            return -2;
        }
        try {
            int[] var3 = arg2.field86[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            if (arg1 != -84) {
                method1016((byte) -63);
            }
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class72.field1846[var3[var6++]];
                }
                if (var7 == 2) {
                    var8 = class19.field570[var3[var6++]];
                }
                if (var7 == 3) {
                    var8 = class96.field2336[var3[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class3 var12 = class31.method248(65535, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class84.method630((byte) 11, var13).field1718 || class124.field2999)) {
                        for (int var14 = 0; var14 < var12.field72.length; var14++) {
                            if (var13 + 1 == var12.field72[var14]) {
                                var8 += var12.field140[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class29.field819[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class19.field557[class19.field570[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class29.field819[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class42.field1179.field1489;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class19.field563[var15]) {
                            var8 += class19.field570[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class3 var18 = class31.method248(arg1 + 65619, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class84.method630((byte) 11, var19).field1718 || class124.field2999)) {
                        for (int var20 = 0; var20 < var18.field72.length; var20++) {
                            if (var19 + 1 == var18.field72[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class45.field1215;
                }
                if (var7 == 12) {
                    var8 = class26.field769;
                }
                if (var7 == 13) {
                    int var21 = class29.field819[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class41.method399(false, var23);
                }
                if (var7 == 18) {
                    var8 = (class42.field1179.field2071 >> 7) + class129.field3045;
                }
                if (var7 == 19) {
                    var8 = (class42.field1179.field2128 >> 7) + class42.field1172;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILod;)V", line = 443)
    public static final void method1020(int arg0, int arg1, class88 arg2) {
        field3183++;
        if (arg2.field2071 < 128 || arg2.field2128 < 128 || arg2.field2071 >= 13184 || arg2.field2128 >= 13184) {
            arg2.field2133 = 0;
            arg2.field2115 = -1;
            arg2.field2117 = -1;
            arg2.field2070 = 0;
            arg2.field2071 = arg2.field2107[0] * 128 + arg2.field2076 * 64;
            arg2.field2128 = arg2.field2079[0] * 128 + arg2.field2076 * 64;
            arg2.method656(0);
        }
        if (class42.field1179 == arg2 && (arg2.field2071 < 1536 || arg2.field2128 < 1536 || arg2.field2071 >= 11776 || arg2.field2128 >= 11776)) {
            arg2.field2070 = 0;
            arg2.field2117 = -1;
            arg2.field2133 = 0;
            arg2.field2115 = -1;
            arg2.field2071 = arg2.field2107[0] * 128 + arg2.field2076 * 64;
            arg2.field2128 = arg2.field2079[0] * 128 + arg2.field2076 * 64;
            arg2.method656(0);
        }
        if (arg2.field2133 > class130.field3128) {
            class32.method258(arg2, 3);
        } else if (class130.field3128 <= arg2.field2070) {
            class75.method589((byte) 105, arg2);
        } else {
            class95.method711(false, arg2);
        }
        if (arg0 != -1) {
            method1018(null, (byte) -125);
        }
        class85.method643((byte) 124, arg2);
        class61.method515((byte) -48, arg2);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)I", line = 511)
    public static final int method1021(int arg0, byte arg1, int arg2, int arg3) {
        field3195++;
        if ((class56.field1435[arg3][arg0][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class56.field1435[1][arg0][arg2] & 0x2) == 0) {
            if (arg1 > -28) {
                method1020(82, -48, null);
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }
}
