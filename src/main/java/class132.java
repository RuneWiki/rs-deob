import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class132 extends class27 {

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    private int field2116;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Lrk;")
    public static class270 field2117 = new class270(16);

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[I")
    public static int[] field2118 = new int[128];

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[Z")
    public static boolean[] field2102;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
    public final void method234(int arg0, byte arg1, int arg2) {
        ++field2105;
        if (arg1 > -74) {
            field2106 = -38;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIII)V")
    public class132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2104 = arg1;
        this.field2107 = arg3;
        this.field2109 = arg2;
        this.field2116 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IBI)V")
    public final void method238(int arg0, byte arg1, int arg2) {
        ++field2113;
        int var4 = 42 / ((-2 - arg1) / 58);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)J")
    public static final long method928(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        return var3 != null && var3.field2133 != null ? var3.field2133.field3779 : 0L;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqh;ZLqh;Lub;Lqh;)Z")
    public static final boolean method929(class201 arg0, boolean arg1, class201 arg2, class89 arg3, class201 arg4) {
        ++field2111;
        class133.field2121 = arg0;
        class21.field357 = arg3;
        if (!arg1) {
            field2106 = 109;
        }
        class10.field149 = arg2;
        class259.field4124 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class241.field3894 * 128) {
            arg0 = class241.field3894 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class129.field2084 * 128) {
            arg2 = class129.field2084 * 128 - 1;
        }
        class227.field3756 = class69.field1147[arg3];
        class28.field443 = class69.field1137[arg3];
        class211.field3444 = class69.field1147[arg4];
        class253.field4033 = class69.field1137[arg4];
        class4.field47 = arg0;
        class11.field157 = arg1;
        class21.field353 = arg2;
        class8.field105 = arg0 / 128;
        class214.field3496 = arg2 / 128;
        class230.field3790 = class8.field105 - class148.field2370;
        if (class230.field3790 < 0) {
            class230.field3790 = 0;
        }
        class235.field3825 = class214.field3496 - class148.field2370;
        if (class235.field3825 < 0) {
            class235.field3825 = 0;
        }
        class244.field3908 = class8.field105 + class148.field2370;
        if (class244.field3908 > class241.field3894) {
            class244.field3908 = class241.field3894;
        }
        class220.field3605 = class214.field3496 + class148.field2370;
        if (class220.field3605 > class129.field2084) {
            class220.field3605 = class129.field2084;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class148.field2370 + class148.field2370 + 2; ++var16) {
            for (int var19 = 0; var19 < class148.field2370 + class148.field2370 + 2; ++var19) {
                int var20 = (var16 - class148.field2370 << 7) - (class4.field47 & 127);
                int var21 = (var19 - class148.field2370 << 7) - (class21.field353 & 127);
                int var22 = class8.field105 - class148.field2370 + var16;
                int var23 = class214.field3496 - class148.field2370 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class241.field3894 && var23 < class129.field2084) {
                    int var24;
                    if (class83.field1307 != null) {
                        var24 = class83.field1307[0][var22][var23] - class11.field157 + 128;
                    } else {
                        var24 = class219.field3586[0][var22][var23] - class11.field157 + 128;
                    }
                    int var25 = class219.field3586[3][var22][var23] - class11.field157 - 1000;
                    class144.field2315[var16][var19] = class127.method907(var20, var25, var24, var21, var15);
                } else {
                    class144.field2315[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class148.field2370 + class148.field2370 + 1; ++var17) {
            for (int var18 = 0; var18 < class148.field2370 + class148.field2370 + 1; ++var18) {
                class254.field4040[var17][var18] = class144.field2315[var17][var18] || class144.field2315[var17 + 1][var18] || class144.field2315[var17][var18 + 1] || class144.field2315[var17 + 1][var18 + 1];
            }
        }
        class73.field1197 = arg6;
        class280.field4434 = arg7;
        class64.field1074 = arg8;
        class77.field1235 = arg9;
        class201.field3211 = arg10;
        class13.method109();
        if (class76.field1215 != null) {
            class143.method985(true);
            class16.method123(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class143.method985(false);
        }
        class16.method123(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static final void method931(int arg0) {
        ++field2115;
        class198.field3164 = null;
        class129.method916(class279.field4423, class84.field1326, 0, 0, 0, 0, class157.field2548, -1, arg0);
        if (class198.field3164 != null) {
            class158.method1104(0, class279.field4423, class16.field274, class173.field2725.field705, class84.field1326, 0, class198.field3164, 0, -1412584499, class238.field3872);
            class198.field3164 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILqh;I)Ld;")
    public static final class238 method932(int arg0, int arg1, class201 arg2, int arg3) {
        ++field2114;
        if (arg3 != 128) {
            field2117 = null;
        }
        return !class239.method1657(arg1, -125, arg0, arg2) ? null : class263.method1789(-22163);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2117 = null;
        if (arg0 <= -59) {
            field2118 = null;
            field2102 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLtg;IIIZ)V")
    public static final void method934(byte arg0, class181 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2110;
        if (~class221.field3623 > -51) {
            if (arg1.field2838 != null && arg4 < arg1.field2838.length && arg1.field2838[arg4] != null) {
                int var6 = arg1.field2838[arg4][0];
                int var7 = var6 >> 8;
                int var8 = (243 & var6) >> 5;
                if (~arg1.field2838[arg4].length < -2) {
                    int var9 = (int) (Math.random() * (double) arg1.field2838[arg4].length);
                    if (~var9 < -1) {
                        var7 = arg1.field2838[arg4][var9];
                    }
                }
                int var10 = 31 & var6;
                if (var10 == 0) {
                    if (arg5) {
                        class212.method1460(0, -86, var8, var7);
                    }
                } else if (~class107.field1745 != -1) {
                    if (arg0 != 112) {
                        field2117 = null;
                    }
                    class204.field3276[class221.field3623] = var7;
                    class43.field798[class221.field3623] = var8;
                    class161.field2562[class221.field3623] = 0;
                    int var11 = (arg3 + -64) / 128;
                    int var12 = (arg2 + -64) / 128;
                    class56.field962[class221.field3623] = null;
                    class154.field2493[class221.field3623] = (var11 << 8) + ((var12 << 16) - -var10);
                    ++class221.field3623;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLog;)V")
    public static final void method935(boolean arg0, class221 arg1) {
        int var2 = arg1.method1528(19380);
        ++field2103;
        if (arg0) {
            field2117 = null;
        }
        class219.field3585 = new class30[var2];
        for (int var3 = 0; var2 > var3; ++var3) {
            class219.field3585[var3] = new class30();
            class219.field3585[var3].field477 = arg1.method1528(19380);
            class219.field3585[var3].field478 = arg1.method1561(-104);
        }
        class263.field4206 = arg1.method1528(19380);
        class125.field2021 = arg1.method1528(19380);
        class205.field3288 = arg1.method1528(19380);
        class48.field863 = new class78[-class263.field4206 + class125.field2021 - -1];
        for (int var4 = 0; class205.field3288 > var4; ++var4) {
            int var5 = arg1.method1528(19380);
            class78 var6 = class48.field863[var5] = new class78();
            var6.field1503 = arg1.method1517((byte) -96);
            var6.field1506 = arg1.method1526(-16777216);
            var6.field1249 = var5 - -class263.field4206;
            var6.field1250 = arg1.method1561(-115);
            var6.field1261 = arg1.method1561(-109);
        }
        class226.field3747 = arg1.method1526(-16777216);
        class142.field2301 = true;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
    public final void method236(int arg0, int arg1, byte arg2) {
        int var4 = this.field2116 * arg0 >> 12;
        int var5 = 9 / ((arg2 - 33) / 54);
        ++field2112;
        int var6 = this.field2104 * arg1 >> 12;
        int var7 = this.field2109 * arg0 >> 12;
        int var8 = this.field2107 * arg1 >> 12;
        class170.method1174(5615, var6, super.field423, var8, var4, var7);
    }
}
