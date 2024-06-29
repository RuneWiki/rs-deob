import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class152 extends class137 {

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lhh;")
    public static class163 field2851 = class137.method1065(":trade:", 17);

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lhh;")
    public static class163 field2842 = class137.method1065("settings", 17);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lhh;")
    private static class163 field2843 = class137.method1065("Loading sprites )2 ", 17);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lhh;")
    public static class163 field2848 = field2843;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lhh;")
    public static class163 field2852 = class137.method1065("<img=1>", 17);

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "J")
    public long field2853;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Lje;")
    public class152 field2854;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Lje;")
    public class152 field2855;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    public static int[] field2846;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[I")
    public static int[] field2847;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
    public static void method1126(byte arg0) {
        field2852 = null;
        field2851 = null;
        field2847 = null;
        field2846 = null;
        field2842 = null;
        field2843 = null;
        if (arg0 == 13) {
            field2848 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public final void method1127(int arg0) {
        field2850++;
        if (this.field2855 == null) {
            return;
        }
        this.field2855.field2854 = this.field2854;
        this.field2854.field2855 = this.field2855;
        this.field2854 = null;
        this.field2855 = null;
        if (arg0 != -24137) {
            method1128(82, 127, 92, -17, -59, -48, -37, -6, (class165) null, 1, true, -36L);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIILta;IZJ)Z")
    public static final boolean method1128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class165 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class228.field4107 == class172.field3157;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class58.field948 || var24 >= class106.field2033) {
                    return false;
                }
                class144 var25 = class259.field4542[arg0][var15][var24];
                if (var25 != null && var25.field2741 >= 5) {
                    return false;
                }
            }
        }
        class132 var16 = new class132();
        var16.field2568 = arg11;
        var16.field2552 = arg0;
        var16.field2557 = arg5;
        var16.field2545 = arg6;
        var16.field2549 = arg7;
        var16.field2558 = arg8;
        var16.field2556 = arg9;
        var16.field2555 = arg1;
        var16.field2550 = arg2;
        var16.field2565 = arg1 + arg3 - 1;
        var16.field2551 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class259.field4542[var22][var17][var20] == null) {
                        class259.field4542[var22][var17][var20] = new class144(var22, var17, var20);
                    }
                }
                class144 var23 = class259.field4542[arg0][var17][var20];
                var23.field2746[var23.field2741] = var16;
                var23.field2725[var23.field2741] = var21;
                var23.field2747 |= var21;
                var23.field2741++;
                if (var13 && class180.field3259[var17][var20] != 0) {
                    var14 = class180.field3259[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class180.field3259[var18][var19] == 0) {
                        class180.field3259[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class55.field918[class57.field935++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)V")
    public static final void method1129(byte arg0, int arg1, int arg2) {
        field2844++;
        if (class202.field3647 < 2 && class56.field928 == 0 && !class187.field3426) {
            return;
        }
        class163 var3;
        if (class56.field928 == 1 && class202.field3647 < 2) {
            var3 = class145.method1101(0, new class163[] { class210.field3811, class91.field1670, class187.field3420, class2.field37 });
        } else if (class187.field3426 && class202.field3647 < 2) {
            var3 = class145.method1101(0, new class163[] { class9.field151, class91.field1670, class223.field4060, class2.field37 });
        } else {
            var3 = class110.method882((byte) -55, class202.field3647 - 1);
        }
        if (class202.field3647 > 2) {
            var3 = class145.method1101(arg0 ^ 0x44, new class163[] { var3, class204.field3698, class136.method1061(class202.field3647 - 2, (byte) 123), class187.field3435 });
        }
        int var4 = class216.field3932.method572(var3, arg1 + 4, arg2 - -15, 16777215, 0, class210.field3800, class171.field3142);
        class89.method690(arg1 + 4, 15, class216.field3932.method568(var3) + var4, 0, arg2);
        if (arg0 != 68) {
            method1130(-50, 28, (class181) null, -75, 116);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILse;II)V")
    public static final void method1130(int arg0, int arg1, class181 arg2, int arg3, int arg4) {
        field2845++;
        int var5 = 50 / ((arg0 - 36) / 39);
        if (class202.field3647 >= 400) {
            return;
        }
        if (arg2.field3329 != null) {
            arg2 = arg2.method1330(-1);
        }
        if (arg2 == null || !arg2.field3308) {
            return;
        }
        class163 var6 = arg2.field3314;
        if (arg2.field3292 != 0) {
            var6 = class145.method1101(0, new class163[] { var6, class1.method15(arg2.field3292, class235.field4203.field2437, (byte) -119), class38.field642, class36.field610, class136.method1061(arg2.field3292, (byte) 101), class213.field3888 });
        }
        if (class56.field928 == 1) {
            class122.method955(class145.method1101(0, new class163[] { class187.field3420, class177.field3229, var6 }), arg4, (long) arg1, -2, class210.field3811, (short) 29, arg3);
            class243.field4302++;
        } else if (!class187.field3426) {
            class169.field3089++;
            class163[] var7 = arg2.field3294;
            if (class55.field913) {
                var7 = class89.method689(-6, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class137.field2651 != 0 || !var7[var8].method1228(class196.field3531, 126))) {
                        class231.field4134++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 10;
                        }
                        if (var8 == 1) {
                            var9 = 46;
                        }
                        if (var8 == 2) {
                            var9 = 39;
                        }
                        if (var8 == 3) {
                            var9 = 23;
                        }
                        if (var8 == 4) {
                            var9 = 11;
                        }
                        class122.method955(class145.method1101(0, new class163[] { class134.field2596, var6 }), arg4, (long) arg1, -2, var7[var8], var9, arg3);
                    }
                }
            }
            if (class137.field2651 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method1228(class196.field3531, 107)) {
                        short var11 = 0;
                        short var12 = 0;
                        if (arg2.field3292 > class235.field4203.field2437) {
                            var11 = 2000;
                        }
                        class238.field4241++;
                        if (var10 == 0) {
                            var12 = 10;
                        }
                        if (var10 == 1) {
                            var12 = 46;
                        }
                        if (var10 == 2) {
                            var12 = 39;
                        }
                        if (var10 == 3) {
                            var12 = 23;
                        }
                        if (var10 == 4) {
                            var12 = 11;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class122.method955(class145.method1101(0, new class163[] { class134.field2596, var6 }), arg4, (long) arg1, -2, var7[var10], var12, arg3);
                    }
                }
            }
            class122.method955(class145.method1101(0, new class163[] { class134.field2596, var6 }), arg4, (long) arg1, -2, class60.field1004, (short) 1001, arg3);
        } else if ((class59.field968 & 0x2) == 2) {
            class45.field753++;
            class122.method955(class145.method1101(0, new class163[] { class223.field4060, class177.field3229, var6 }), arg4, (long) arg1, -2, class9.field151, (short) 28, arg3);
            return;
        }
    }
}
