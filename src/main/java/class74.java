import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class74 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lsc;")
    private static class181 field1174 = class149.method967(255, "Loaded sprites");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lsc;")
    private static class181 field1177 = class149.method967(255, "glow1:");

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1180 = 0;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "[Lki;")
    public static class203[] field1187 = new class203[4];

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
    public static int[] field1181 = new int[100];

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lsc;")
    public static class181 field1182 = field1177;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lsc;")
    public static class181 field1191 = field1177;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lsc;")
    public static class181 field1188 = field1174;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "J")
    public long field1195;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Laf;")
    public class208 field1175;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Laf;")
    public class208 field1178;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Laf;")
    public class208 field1184;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method515(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class232.field4054 = arg6;
        field1193++;
        class47.field736 = arg2;
        class238.field4139 = arg1;
        class255.field4459 = arg3;
        class148.field2469 = arg5;
        if (arg0 && class232.field4054 >= 100) {
            class127.field2100 = class47.field736 * 128 + 64;
            class86.field1370 = class255.field4459 * 128 + 64;
            class228.field3916 = class232.method1606(class38.field581, (byte) -16, class86.field1370, class127.field2100) - class148.field2469;
        }
        class110.field1792 = 2;
        int var7 = -26 / ((-arg4 - 7) / 37);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lpg;")
    public static final class69 method516(int arg0) {
        field1176++;
        if (arg0 != 28) {
            method520((class11) null, (byte) -75, (class11) null);
        }
        class134 var1 = new class134(class219.field3777, class78.field1273, class220.field3782[0], class23.field410[0], class196.field3425[0], class121.field1978[0], class143.field2319[0], class254.field4443);
        class143.method919(arg0 - 12);
        return var1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBIZI)V")
    public static final void method517(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        int var7 = -64 / ((-arg3 - 15) / 39);
        field1186++;
        if (class144.field2342 == arg4 && class79.field1285 == arg0 && class31.field509 == arg2 || class219.method1460(51885665)) {
            return;
        }
        class31.field509 = arg2;
        class79.field1285 = arg0;
        class144.field2342 = arg4;
        if (class219.method1460(51885665)) {
            class31.field509 = 0;
        }
        if (arg5) {
            class92.method612(28, 255);
        } else {
            class92.method612(25, 255);
        }
        class121.method795(true, 102, class32.field518);
        int var8 = class253.field4420;
        int var9 = class222.field3844;
        class253.field4420 = arg4 * 8 - 48;
        class222.field3844 = arg0 * 8 - 48;
        class145.field2354 = class58.method421(class144.field2342 * 8, (byte) -112, class79.field1285 * 8);
        int var10 = class222.field3844 - var9;
        int var11 = class222.field3844;
        int var12 = class253.field4420 - var8;
        int var13 = class253.field4420;
        if (arg5) {
            class137.field2237 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class178 var15 = class129.field2140[var14];
                if (var15 != null) {
                    var15.field2654 -= var12 * 128;
                    var15.field2681 -= var10 * 128;
                    if (var15.field2654 >= 0 && var15.field2654 <= 13184 && var15.field2681 >= 0 && var15.field2681 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field2672[var16] -= var12;
                            var15.field2623[var16] -= var10;
                        }
                        class263.field4581[class137.field2237++] = var14;
                    } else {
                        class129.field2140[var14].field3117 = null;
                        class129.field2140[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class178 var33 = class129.field2140[var17];
                if (var33 != null) {
                    for (int var34 = 0; var34 < 10; var34++) {
                        var33.field2672[var34] -= var12;
                        var33.field2623[var34] -= var10;
                    }
                    var33.field2654 -= var12 * 128;
                    var33.field2681 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class116 var31 = class39.field602[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field2672[var32] -= var12;
                    var31.field2623[var32] -= var10;
                }
                var31.field2681 -= var10 * 128;
                var31.field2654 -= var12 * 128;
            }
        }
        class38.field581 = arg2;
        class258.field4507.method1051(arg6, false, arg1, -6882);
        byte var19 = 104;
        byte var20 = 0;
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var10 < 0) {
            var23 = -1;
            var22 = -1;
            var21 = 103;
        }
        byte var24 = 1;
        if (var12 < 0) {
            var24 = -1;
            var20 = 103;
            var19 = -1;
        }
        for (int var25 = var20; var25 != var19; var25 += var24) {
            for (int var27 = var21; var27 != var22; var27 += var23) {
                int var28 = var12 + var25;
                int var29 = var10 + var27;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        class132.field2183[var30][var25][var27] = class132.field2183[var30][var28][var29];
                    } else {
                        class132.field2183[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class121 var26 = (class121) class257.field4495.method1686((byte) -83); var26 != null; var26 = (class121) class257.field4495.method1683(140)) {
            var26.field1981 -= var12;
            var26.field1986 -= var10;
            if (var26.field1981 < 0 || var26.field1986 < 0 || var26.field1981 >= 104 || var26.field1986 >= 104) {
                var26.method290((byte) -48);
            }
        }
        if (class210.field3612 != 0) {
            class146.field2400 -= var10;
            class210.field3612 -= var12;
        }
        if (arg5) {
            class47.field736 -= var12;
            class255.field4459 -= var10;
            class82.field1322 -= var10;
            class51.field799 -= var12;
        } else {
            class110.field1792 = 1;
        }
        class258.field4512 = 0;
        class182.field3212 = -1;
        class172.field2883.method1682(127);
        class52.field827.method1682(120);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIB)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class37.field573 == 1) {
            class256.field4474[class163.field2780 / 100].method322(class239.field4146 - 8, class57.field871 + -8);
        }
        if (class37.field573 == 2) {
            class256.field4474[class163.field2780 / 100 + 4].method322(class239.field4146 - 8, class57.field871 - 8);
        }
        class60.method436(-28337);
        if (arg4 <= 124) {
            method515(true, -124, 21, 46, -73, -77, 66);
        }
        field1183++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class109.field1787 < 100) {
            class107.method719(82);
        }
        field1189++;
        class17.method157(arg1, arg4, arg1 + arg0, arg3 + arg4);
        if (class109.field1787 < 100) {
            int var5 = arg0 / 2 + arg1;
            byte var6 = 20;
            int var7 = arg3 / 2 + arg4 - var6 - 18;
            class17.method156(arg1, arg4, arg0, arg3, 0);
            class17.method155(var5 - 152, var7, 304, 34, 9179409);
            class17.method155(var5 - 151, var7 + 1, 302, 32, 0);
            class17.method156(var5 - 150, var7 + 2, class109.field1787 * 3, 30, 9179409);
            class17.method156(var5 + (class109.field1787 * 3) - 150, var7 + 2, 300 - class109.field1787 * 3, 30, 0);
            class114.field1853.method1655(class215.field3695, var5, var7 + var6, 16777215, -1);
            return;
        }
        int var8 = class152.field2537 - ((int) ((float) arg0 / class22.field388));
        class73.field1169 = (int) ((float) (arg3 * 2) / class22.field388);
        class18.field322 = class152.field2537 - ((int) ((float) arg0 / class22.field388));
        if (arg2 <= 7) {
            field1177 = null;
        }
        class43.field671 = class203.field3489 - ((int) ((float) arg3 / class22.field388));
        int var9 = (int) ((float) arg0 / class22.field388) + class152.field2537;
        int var10 = class203.field3489 - ((int) ((float) arg3 / class22.field388));
        class80.field1288 = (int) ((float) (arg0 * 2) / class22.field388);
        int var11 = (int) ((float) arg3 / class22.field388) + class203.field3489;
        class96.method634(arg1, var8, var11, arg3 + arg4, var10, (byte) -15, arg0 + arg1, var9, arg4);
        class146.method949(var11, var10, arg4 + arg3, var9, arg4, var8, arg0 + arg1, arg1, (byte) -101);
        class198.method1343(var9, 10000, var10, arg4, arg1 + arg0, arg3 + arg4, var8, arg1, var11);
        if (class80.field1294 > 0) {
            class80.field1294--;
        }
        if (!class25.field436) {
            return;
        }
        int var12 = arg0 + arg1 - 5;
        int var13 = arg4 + arg3 - 8;
        class18.field316.method1658(class175.method1164(new class181[] { class144.field2350, class169.method1119((byte) 38, class195.field3408) }, (byte) 125), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var17 = var13 - 15;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class18.field316.method1658(class175.method1164(new class181[] { class254.field4432, class169.method1119((byte) -108, var16), class192.field3370 }, (byte) 125), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljb;BLjb;)V")
    public static final void method520(class11 arg0, byte arg1, class11 arg2) {
        field1194++;
        class19.field347 = arg0;
        class262.field4572 = arg2;
        int var3 = 86 / ((arg1 - 78) / 40);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method521(byte arg0) {
        field1174 = null;
        field1187 = null;
        field1181 = null;
        field1188 = null;
        field1182 = null;
        if (arg0 != -45) {
            field1180 = -42;
        }
        field1177 = null;
        field1191 = null;
    }
}
