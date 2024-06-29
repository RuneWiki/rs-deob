import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class27 {

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
    public static int[] field329 = new int[100];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public int field326;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lnj;")
    public static class215 field317;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lnd;")
    public static class301 field318;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[Ldh;")
    public static class158[] field320;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lnj;")
    public static class215[] field311;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method137(int arg0) {
        if (arg0 != -1) {
            field320 = null;
        }
        field320 = null;
        field317 = null;
        field329 = null;
        field311 = null;
        field318 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILim;)Lvh;")
    public static final class49 method138(int arg0, int arg1, class170 arg2) {
        field328++;
        class49 var3 = new class49(arg0, arg2.method1195(-1), arg2.method1195(-1), arg2.method1190(arg1 + 15013), arg2.method1190(6345), arg2.method1218(-63) == 1, arg2.method1218(94));
        int var4 = arg2.method1218(arg1 + 8632);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field618.method1540(new class94(arg2.method1218(62), arg2.method1218(-98), arg2.method1186((byte) -98), arg2.method1186((byte) -56), arg2.method1186((byte) -52), arg2.method1186((byte) -59), arg2.method1186((byte) -71), arg2.method1186((byte) -84), arg2.method1186((byte) -80), arg2.method1186((byte) -49)), (byte) -102);
        }
        var3.method301(123);
        if (arg1 != -8668) {
            field313 = -87;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIIII)V")
    public static final void method139(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class1.field28++;
        class64.method411(64);
        if (arg1) {
            class166.method1138(0, false, 119, false);
        } else {
            class197.method1374(0, true);
            class166.method1138(0, false, 115, true);
            if (class19.field263 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class166.method1138(var7, false, 121, false);
                    class166.method1138(var7, true, 116, false);
                    class197.method1374(var7, true);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class197.method1374(var6, true);
                    class166.method1138(var6, false, 125, false);
                    class166.method1138(var6, true, arg0 - 2571, false);
                }
            }
        }
        if (!arg1) {
            class166.method1135((byte) 120);
        }
        class240.method1695(arg0 ^ 0xFFFFF581);
        if (arg0 != 2686) {
            field320 = null;
        }
        class65.field938 = arg4;
        class65.field943 = arg5;
        field331++;
        if (class158.field2370 == 1) {
            int var8 = (int) class144.field2145 + class177.field2785 & 0x7FF;
            int var9 = (int) class215.field3356;
            if (class106.field1549 / 256 > var9) {
                var9 = class106.field1549 / 256;
            }
            if (class49.field623[4] && (class94.field1411[4] + 128) > var9) {
                var9 = class94.field1411[4] + 128;
            }
            class117.method770((var9 * 3) + 600, 8220, var9, arg3, var8, class263.field4271, class99.field1477, class52.method351(-89, class214.field3347.field3920, class214.field3347.field3915, class148.field2204) - 50);
        } else if (class158.field2370 == 5) {
            class107.method719(false, arg3);
        }
        int var10 = class99.field1474;
        int var11 = class21.field279;
        int var12 = class147.field2189;
        int var13 = class255.field4159;
        int var14 = class56.field817;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class49.field623[var15]) {
                int var22 = (int) ((double) (class312.field5006[var15] * 2 + 1) * Math.random() + Math.sin((double) class92.field1386[var15] / 100.0D * (double) class1.field16[var15]) * (double) class94.field1411[var15] - (double) class312.field5006[var15]);
                if (var15 == 2) {
                    class255.field4159 += var22;
                }
                if (var15 == 4) {
                    class147.field2189 += var22;
                    if (class147.field2189 < 128) {
                        class147.field2189 = 128;
                    }
                    if (class147.field2189 > 383) {
                        class147.field2189 = 383;
                    }
                }
                if (var15 == 0) {
                    class99.field1474 += var22;
                }
                if (var15 == 1) {
                    class21.field279 += var22;
                }
                if (var15 == 3) {
                    class56.field817 = class56.field817 + var22 & 0x7FF;
                }
            }
        }
        class276.method1908(-29485);
        class151.method1042(arg5, arg4, arg2 + arg5, arg3 + arg4);
        class221.method1569();
        if (class277.field4537 < 0) {
            class151.method1026(arg5, arg4, arg2, arg3, 0);
        } else {
            class157 var16 = class161.method1104(class84.field1300, class23.field296, class277.field4537, true, class64.field927);
            var16.method1088(class237.field3807, arg5, arg4, arg2, arg3, class147.field2189, class56.field817, 0);
        }
        if (class311.field4995 || class24.field305 < arg5 || class24.field305 >= (arg2 + arg5) || arg4 > class46.field566 || arg3 + arg4 <= class46.field566) {
            class96.field1457 = false;
            class22.field287 = 0;
        } else {
            class96.field1457 = true;
            class22.field287 = 0;
            int var17 = class190.field2955;
            int var18 = class169.field2607;
            int var19 = class89.field1349;
            int var20 = class220.field3444;
            class4.field64 = (class46.field566 - arg4) * (var19 - var20) / arg3 + var20;
            class5.field70 = (var18 - var17) * (class24.field305 - arg5) / arg2 + var17;
        }
        class31.method163(-11565);
        byte var21 = class66.method437((byte) 127) == 2 ? (byte) class1.field28 : 1;
        class277.method1918(class99.field1474, class21.field279, class255.field4159, class147.field2189, class56.field817, class19.field259, class161.field2409, class123.field1778, class31.field379, class225.field3505, class10.field152, class148.field2204 + 1, var21, class214.field3347.field3915 >> 7, class214.field3347.field3920 >> 7);
        class31.method163(-11565);
        class310.method2090();
        class243.method1724(44, arg4, arg5, 256, 256, arg2, arg3);
        class222.method1572(arg3, arg2, 256, arg4, 256, -32769, arg5);
        ((class175) class221.field3464).method1246(class135.field1949, 255);
        class94.method639(arg4, arg2, arg5, arg3, 4);
        class147.field2189 = var12;
        class21.field279 = var11;
        class99.field1474 = var10;
        class255.field4159 = var13;
        class56.field817 = var14;
        if (class125.field1801 && class93.field1397.method183((byte) -31) == 0) {
            class125.field1801 = false;
        }
        if (class125.field1801) {
            class151.method1026(arg5, arg4, arg2, arg3, 0);
            class49.method304(class33.field397, false, 4);
        }
        if (!arg1 && !class125.field1801 && !class311.field4995 && arg5 <= class24.field305 && (arg2 + arg5) > class24.field305 && class46.field566 >= arg4 && class46.field566 < (arg3 + arg4)) {
            class42.method240(1, class24.field305, arg2, class46.field566, arg5, arg3, arg4);
        }
    }
}
