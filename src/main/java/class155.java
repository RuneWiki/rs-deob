import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class155 extends class180 {

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
    public static int[] field2231 = new int[8];

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[I")
    public static int[] field2237 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2232 = 0;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "[[I")
    public static int[][] field2239 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Lgu;")
    public static class36 field2235;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdq;)V")
    public static final void method941(int arg0, class14 arg1) {
        field2230++;
        class169 var2 = null;
        if (arg0 != 17201) {
            field2235 = null;
        }
        try {
            class420 var3 = arg1.method116(-117);
            while (var3.field5789 == 0) {
                class258.method1603(-649, 1L);
            }
            if (var3.field5789 == 1) {
                var2 = (class169) var3.field5791;
                class425 var4 = class439.method2552(true);
                var2.method1048(0, var4.field5886, var4.field5830, false);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1044(true);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
    public static final boolean method942(int arg0, int arg1, int arg2) {
        int var3 = class473.field6624[arg0][arg1][arg2];
        if (-class192.field2752 == var3) {
            return false;
        } else if (class192.field2752 == var3) {
            return true;
        } else {
            int var4 = arg1 << class259.field3616;
            int var5 = arg2 << class259.field3616;
            if (class210.method1323(var4 + 1, class317.field4306[arg0].method710(arg1, arg2), var5 + 1) && class210.method1323(class372.field5263 + var4 - 1, class317.field4306[arg0].method710(arg1 + 1, arg2), var5 + 1) && class210.method1323(class372.field5263 + var4 - 1, class317.field4306[arg0].method710(arg1 + 1, arg2 + 1), class372.field5263 + var5 - 1) && class210.method1323(var4 + 1, class317.field4306[arg0].method710(arg1, arg2 + 1), class372.field5263 + var5 - 1)) {
                class473.field6624[arg0][arg1][arg2] = class192.field2752;
                return true;
            } else {
                class473.field6624[arg0][arg1][arg2] = -class192.field2752;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class490 var7 = new class490();
        var7.field6927 = arg1 >> class259.field3616;
        var7.field6906 = arg2 >> class259.field3616;
        var7.field6904 = arg3 >> class259.field3616;
        var7.field6911 = arg4 >> class259.field3616;
        var7.field6925 = arg0;
        var7.field6920 = arg1;
        var7.field6907 = arg2;
        var7.field6919 = arg3;
        var7.field6903 = arg4;
        var7.field6913 = arg5;
        var7.field6915 = arg6;
        class376.field5316[class173.field2560++] = var7;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLlk;)V")
    public static final void method944(byte arg0, class425 arg1) {
        field2236++;
        if (arg1.field5886.length - arg1.field5830 < 1) {
            return;
        }
        int var2 = arg1.method2503(true);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field5886.length - arg1.field5830 < var3) {
            return;
        }
        class400.field5591 = arg1.method2503(true);
        if (class400.field5591 < 1) {
            class400.field5591 = 1;
        } else if (class400.field5591 > 4) {
            class400.field5591 = 4;
        }
        class175.method1160(arg1.method2503(true) == 1, 116);
        class460.field6481 = arg1.method2503(true) == 1;
        class216.field3068 = arg1.method2503(true) == 1;
        class80.field1205 = arg1.method2503(true) == 1;
        class181.field2629 = arg1.method2503(true) == 1 ? 1 : 0;
        class216.field3069 = arg1.method2503(true) == 1;
        class164.field2424 = arg1.method2503(true) == 1;
        class191.field2723 = arg1.method2503(true) == 1;
        class47.field761 = arg1.method2503(true);
        if (class47.field761 > 2) {
            class47.field761 = 2;
        }
        if (var2 >= 2) {
            class312.field4249 = arg1.method2503(true) == 1;
        } else {
            class312.field4249 = arg1.method2503(true) == 1;
            arg1.method2503(true);
        }
        class327.field4526 = arg1.method2503(true) == 1;
        class301.field4127 = arg1.method2503(true) == 1;
        class13.field210 = arg1.method2503(true);
        if (class13.field210 > 2) {
            class13.field210 = 2;
        }
        class211.field2977 = class13.field210;
        class255.field3578 = arg1.method2503(true) == 1;
        class256.field3582 = arg1.method2503(true);
        if (class256.field3582 > 127) {
            class256.field3582 = 127;
        }
        class47.field766 = arg1.method2503(true);
        class491.field6932 = arg1.method2503(true);
        if (class491.field6932 > 127) {
            class491.field6932 = 127;
        }
        if (var2 >= 1) {
            class221.field3111 = arg1.method2508(true);
            class304.field4157 = arg1.method2508(true);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method2503(true);
        }
        if (var2 >= 4) {
            int var4 = arg1.method2503(true);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class154.field2227 < 96) {
                var4 = 0;
            }
            class42.method351(var4, (byte) 67);
        }
        if (var2 >= 5) {
            class312.field4253 = arg1.method2502((byte) -86);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class411.field5693 = var5 = arg1.method2503(true);
        }
        if (class411.field5693 != 1 && class411.field5693 != 2) {
            class411.field5693 = 2;
        }
        if (var2 >= 7) {
            class447.field6170 = arg1.method2503(true) == 1;
        }
        if (var2 >= 8) {
            class104.field1498 = arg1.method2503(true) == 1;
        }
        if (var2 >= 9) {
            class222.field3135 = arg1.method2503(true);
        }
        if (class222.field3135 < 0 || class222.field3135 > class421.method2445(class154.field2227, (byte) 75)) {
            class222.field3135 = 0;
        }
        if (var2 >= 10) {
            class163.field2336 = arg1.method2503(true) != 0;
        }
        if (var2 >= 11) {
            class122.field1699 = arg1.method2503(true) != 0;
        }
        if (var2 >= 12) {
            class181.field2629 = arg1.method2503(true);
        }
        if (class181.field2629 < 0 || class181.field2629 > 2) {
            class181.field2629 = 1;
        }
        if (var2 >= 13) {
            class255.field3580 = arg1.method2503(true) == 1;
        }
        if (arg0 >= -64) {
            method945(-19);
        }
        if (var2 >= 14) {
            class47.field768 = arg1.method2503(true);
        } else if (var5 == 0) {
            class47.field768 = 2;
        } else {
            class47.field768 = 1;
        }
        if (class47.field768 < 0 || class47.field768 > 3) {
            class47.field768 = 2;
        }
        if (var2 >= 15) {
            class205.field2933 = arg1.method2503(true);
            if (class205.field2933 < 0 || class205.field2933 > 4) {
                class205.field2933 = class251.field3519 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static void method945(int arg0) {
        field2235 = null;
        field2237 = null;
        field2239 = null;
        field2231 = null;
        if (arg0 != 30285) {
            field2235 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(II)V")
    public class155(int arg0, int arg1) {
        this.field2240 = arg1;
        this.field2233 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLkm;)V")
    public static final void method946(boolean arg0, class487 arg1) {
        field2241++;
        if (class8.field141 == class2.field21.field6766) {
            return;
        }
        if (!arg0) {
            field2235 = null;
        }
        if (class455.field6293 != null && class164.method1005(arg1, (byte) -19, class2.field21.field6766)) {
            class8.field141 = class2.field21.field6766;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIIII)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2238++;
        class9.field183 = arg2;
        class182.field2649 = arg3;
        if (arg4 != 0) {
            method947(70, -50, -86, -64, 79, -70, 104);
        }
        class109.field1549 = arg5;
        class335.field4592 = arg6;
        class47.field757 = arg0;
        class232.field3274 = arg1;
    }
}
