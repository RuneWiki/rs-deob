import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class18 {

    @OriginalMember(owner = "client!ce", name = "qb", descriptor = "Z")
    public boolean field547 = false;

    @OriginalMember(owner = "client!ce", name = "zb", descriptor = "I")
    private int field556 = 0;

    @OriginalMember(owner = "client!ce", name = "Fb", descriptor = "I")
    private int field562 = 0;

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!ce", name = "Eb", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!ce", name = "Ob", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!ce", name = "Rb", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!ce", name = "Db", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client!ce", name = "Nb", descriptor = "Lf;")
    private class36 field570;

    @OriginalMember(owner = "client!ce", name = "Hb", descriptor = "Lkd;")
    private static class73 field564 = class126.method1070((byte) -66, "Connecting to friendserver");

    @OriginalMember(owner = "client!ce", name = "Jb", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!ce", name = "Pb", descriptor = "[I")
    public static int[] field572 = new int[50];

    @OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!ce", name = "Kb", descriptor = "Lkd;")
    public static class73 field567 = field564;

    @OriginalMember(owner = "client!ce", name = "yb", descriptor = "Lkd;")
    private static class73 field555 = class126.method1070((byte) -66, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ce", name = "xb", descriptor = "Lkd;")
    public static class73 field554 = field555;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ce", name = "tb", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ce", name = "vb", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!ce", name = "wb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ce", name = "Ab", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ce", name = "Cb", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ce", name = "Gb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ce", name = "Ib", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ce", name = "Mb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ce", name = "Qb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!ce", name = "Lb", descriptor = "Z")
    public static boolean field568;

    @OriginalMember(owner = "client!ce", name = "Bb", descriptor = "[Lpb;")
    public static class106[] field558;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBIIIII)I")
    public static final int method158(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        field563++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg3;
            arg3 = var8;
        }
        if (arg1 != -37) {
            field564 = null;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 + 1 - arg5 - arg6;
        } else {
            return 8 - arg0 - arg3;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public static final void method159(byte arg0) {
        field550++;
        if (class64.field1685 != 2) {
            return;
        }
        class83.method701((class44.field1173 - class121.field3093 << 7) + field566, (-class80.field2029 + class78.field1995 << 7) + class62.field1630, class42.field1124 * 2, (byte) -29);
        if (class11.field324 > -1 && class49.field1308 % 20 < 10) {
            class31.field865[0].method860(class11.field324 - 12, class42.field1136 + -28);
        }
        int var1 = -16 % ((arg0 + 31) / 55);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBII)V")
    public static final void method160(int arg0, byte arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class55.field1484[arg2][arg3 + var4][arg0 + var7] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class55.field1484[arg2][arg3][arg0 + var5] = class55.field1484[arg2][arg3 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class55.field1484[arg2][arg3 + var6][arg0] = class55.field1484[arg2][arg3 + var6][arg0 - 1];
            }
        }
        if (arg3 > 0 && class55.field1484[arg2][arg3 - 1][arg0] != 0) {
            class55.field1484[arg2][arg3][arg0] = class55.field1484[arg2][arg3 - 1][arg0];
        } else if (arg0 > 0 && class55.field1484[arg2][arg3][arg0 - 1] != 0) {
            class55.field1484[arg2][arg3][arg0] = class55.field1484[arg2][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class55.field1484[arg2][arg3 - 1][arg0 - 1] != 0) {
            class55.field1484[arg2][arg3][arg0] = class55.field1484[arg2][arg3 - 1][arg0 - 1];
        }
        field553++;
        if (arg1 != -20) {
            field568 = true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
    public static final void method161(boolean arg0, int arg1) {
        for (int var2 = 0; var2 < client.field618; var2++) {
            class9 var4 = class133.field3345[class55.field1455[var2]];
            int var5 = (class55.field1455[var2] << 14) + 536870912;
            if (var4 != null && var4.method87((byte) -45) && arg0 == var4.field301.field787 && var4.field301.method225(-1)) {
                int var6 = var4.field2264 >> 7;
                int var7 = var4.field2277 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field2233 == 1 && (var4.field2277 & 0x7F) == 64 && (var4.field2264 & 0x7F) == 64) {
                        if (class50.field1351[var7][var6] == class42.field1139) {
                            continue;
                        }
                        class50.field1351[var7][var6] = class42.field1139;
                    }
                    if (!var4.field301.field802) {
                        var5 += Integer.MIN_VALUE;
                    }
                    class34.field923.method48(class11.field320, var4.field2277, var4.field2264, class70.method585(class11.field320, var4.field2233 * 64 + var4.field2277 - 64, (var4.field2233 + -1) * 64 + var4.field2264, (byte) -100), (var4.field2233 - 1) * 64 + 60, var4, var4.field2265, var5, var4.field2291);
                }
            }
        }
        int var3 = 71 % ((-arg1 - 68) / 39);
        field565++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BJ)V")
    public static final void method162(byte arg0, long arg1) {
        field557++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class14.field431; var3++) {
            if (class49.field1305[var3] == arg1) {
                class80.field2024++;
                class38.field1028 = true;
                class14.field431--;
                for (int var4 = var3; var4 < class14.field431; var4++) {
                    class137.field3424[var4] = class137.field3424[var4 + 1];
                    class16.field497[var4] = class16.field497[var4 + 1];
                    class49.field1305[var4] = class49.field1305[var4 + 1];
                    class102.field2549[var4] = class102.field2549[var4 + 1];
                }
                class112.field2807 = class49.field1308 + 1;
                class121.field3079.method1215(-119, 148);
                class121.field3079.method967(true, arg1);
                break;
            }
        }
        int var5 = -19 / ((-arg0 - 77) / 33);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Lna;")
    public final class91 method90(int arg0) {
        field569++;
        if (arg0 != 11800) {
            method164(13, (byte) -104, -18, -58);
        }
        class121 var2 = class72.method603(this.field574, -1);
        class91 var3;
        if (this.field547) {
            var3 = var2.method1037((byte) -105, -1);
        } else {
            var3 = var2.method1037((byte) -128, this.field556);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V")
    public static final void method163(int arg0, int arg1) {
        if (arg1 == -3) {
            class42.method315(class133.field3332, class11.field359, 107, class153.field3755);
        } else if (arg1 == -2) {
            class42.method315(class132.field3322, class11.field348, 126, class11.field347);
        } else if (arg1 == -1) {
            class42.method315(class133.field3329, class11.field376, -97, class98.field2448);
        } else if (arg1 == 3) {
            class42.method315(class23.field652, class11.field373, arg0 ^ 0x7D, class11.field371);
        } else if (arg1 == 4) {
            class42.method315(class50.field1358, class11.field377, -12, class136.field3381);
        } else if (arg1 == 5) {
            class42.method315(class87.field2204, class11.field356, 92, class112.field2775);
        } else if (arg1 == 6) {
            class42.method315(class16.field492, class11.field335, 115, class107.field2649);
        } else if (arg1 == 7) {
            class42.method315(class62.field1629, class11.field351, 104, class107.field2644);
        } else if (arg1 == 8) {
            class42.method315(class49.field1303, class11.field342, 98, class22.field623);
        } else if (arg1 == 9) {
            class42.method315(class140.field3495, class11.field336, 121, class53.field1405);
        } else if (arg1 == 10) {
            class42.method315(class33.field906, class11.field375, -121, class22.field628);
        } else if (arg1 == 11) {
            class42.method315(class48.field1294, class11.field340, 91, class107.field2638);
        } else if (arg1 == 12) {
            class42.method315(class43.field1148, class11.field333, -69, class146.field3601);
        } else if (arg1 == 13) {
            class42.method315(class133.field3347, class11.field365, -90, class120.field3071);
        } else if (arg1 == 14) {
            class42.method315(class76.field1958, class11.field354, 96, class153.field3757);
        } else if (arg1 == 16) {
            class42.method315(class50.field1363, class11.field372, arg0 ^ 0x6C, class98.field2454);
        } else if (arg1 == 17) {
            class42.method315(class100.field2508, class11.field346, -24, class120.field3069);
        } else if (arg1 == 18) {
            class42.method315(class38.field1043, class11.field378, 109, class44.field1174);
        } else if (arg1 == 19) {
            class42.method315(class109.field2674, class62.field1637, -80, class50.field1360);
        } else if (arg1 == 20) {
            class42.method315(class133.field3346, class11.field374, 102, class82.field2072);
        } else if (arg1 == 22) {
            class42.method315(class140.field3488, class11.field339, 103, class86.field2188);
        } else if (arg1 == 23) {
            class42.method315(class76.field1960, class11.field366, -20, class125.field3177);
        } else if (arg1 == 24) {
            class42.method315(class87.field2210, class11.field360, 93, class60.field1565);
        } else if (arg1 == 25) {
            class42.method315(class133.field3337, class11.field363, 104, class98.field2442);
        } else if (arg1 == 26) {
            class42.method315(class58.field1549, class11.field337, -93, class105.field2620);
        } else if (arg1 == 27) {
            class42.method315(class107.field2636, class11.field343, 108, class11.field353);
        } else {
            class42.method315(class133.field3348, class11.field345, arg0 ^ 0x6F, class11.field323);
        }
        if (arg0 != 20) {
            method161(false, 104);
        }
        field545++;
        class45.method337(10, (byte) -64);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IBII)Z")
    public static final boolean method164(int arg0, byte arg1, int arg2, int arg3) {
        field559++;
        int var4 = arg0 >> 14 & 0x7FFF;
        int var5 = class34.field923.method62(class11.field320, arg3, arg2, arg0);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class149 var8 = class122.method1045(31, var4);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field3660;
                var10 = var8.field3643;
            } else {
                var9 = var8.field3643;
                var10 = var8.field3660;
            }
            int var11 = var8.field3672;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class49.method394(class73.field1901.field2304[0], 0, 0, var9, class73.field1901.field2280[0], -1, 2, arg3, arg2, var11, var10, true);
        } else {
            class49.method394(class73.field1901.field2304[0], var7, var6 + 1, 0, class73.field1901.field2280[0], -1, 2, arg3, arg2, 0, 0, true);
        }
        int var12 = -66 / ((arg1 - 46) / 43);
        class122.field3122 = class103.field2570;
        class111.field2735 = 0;
        class87.field2196 = 2;
        class74.field1918 = class42.field1134;
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)V")
    public final void method165(int arg0, int arg1) {
        field552++;
        if (this.field547) {
            return;
        }
        if (arg0 != -1) {
            field572 = null;
        }
        this.field562 += arg1;
        while (this.field570.field968[this.field556] < this.field562) {
            this.field562 -= this.field570.field968[this.field556];
            this.field556++;
            if (this.field556 >= this.field570.field976.length) {
                this.field547 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)I")
    public static final int method166(int arg0, byte arg1) {
        class41 var2 = class116.method1009(arg0, false);
        field548++;
        int var3 = var2.field1097;
        int var4 = var2.field1087;
        int var5 = var2.field1092;
        int var6 = 90 / ((-arg1 - 73) / 48);
        int var7 = class73.field1845[var4 - var5];
        return var7 & class48.field1299[var3] >> var5;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
    public static void method167(int arg0) {
        field554 = null;
        if (arg0 != 0) {
            method161(true, -124);
        }
        field572 = null;
        field555 = null;
        field567 = null;
        field564 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(IIIIIII)V")
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field546 = arg5 + arg6;
        this.field561 = arg1;
        this.field551 = arg4;
        this.field571 = arg3;
        this.field574 = arg0;
        this.field560 = arg2;
        int var8 = class72.method603(this.field574, -1).field3104;
        if (var8 == -1) {
            this.field547 = true;
        } else {
            this.field547 = false;
            this.field570 = class94.method782(-24669, var8);
        }
    }
}
