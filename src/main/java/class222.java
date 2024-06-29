import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class222 extends class43 {

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
    private int field4037 = 0;

    @OriginalMember(owner = "client!uh", name = "ob", descriptor = "I")
    private int field4047 = 4096;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "Lmb;")
    public static class132 field4036 = class166.method1092("title_mute", 115);

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lmb;")
    public static class132 field4031 = class166.method1092("labels)3dat", 118);

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "Lmb;")
    public static class132 field4034 = class166.method1092("Ein kostenloses Spielkonto erstellen)3", 119);

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "Lmb;")
    public static class132 field4028 = class166.method1092("null", 126);

    @OriginalMember(owner = "client!uh", name = "kb", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!uh", name = "jb", descriptor = "Lmb;")
    public static class132 field4042 = class166.method1092("blinken3:", 119);

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Lmb;")
    private static class132 field4026 = class166.method1092("flash3:", 118);

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Lmb;")
    public static class132 field4027 = field4026;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "Lmb;")
    private static class132 field4032 = class166.method1092("yellow:", 117);

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "Lmb;")
    public static class132 field4033 = field4032;

    @OriginalMember(owner = "client!uh", name = "nb", descriptor = "I")
    public static int field4046 = 0;

    @OriginalMember(owner = "client!uh", name = "qb", descriptor = "Lmb;")
    public static class132 field4049 = field4026;

    @OriginalMember(owner = "client!uh", name = "rb", descriptor = "Lmb;")
    public static class132 field4050 = class166.method1092("0(U", 124);

    @OriginalMember(owner = "client!uh", name = "mb", descriptor = "Lmb;")
    public static class132 field4045 = field4032;

    @OriginalMember(owner = "client!uh", name = "sb", descriptor = "Z")
    public static volatile boolean field4051 = true;

    @OriginalMember(owner = "client!uh", name = "tb", descriptor = "I")
    public static int field4052 = -1;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!uh", name = "hb", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!uh", name = "ib", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!uh", name = "pb", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "[[[B")
    public static byte[][][] field4035;

    @OriginalMember(owner = "client!uh", name = "lb", descriptor = "[[[I")
    public static int[][][] field4044;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        int[] var3 = super.field768.method1123(arg1, arg0);
        ++field4038;
        if (super.field768.field3219) {
            int[] var4 = this.method300(-61, 0, arg0);
            for (int var5 = 0; ~class131.field2427 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field4037 >= ~var6) {
                    if (~var6 < ~this.field4047) {
                        var3[var5] = this.field4047;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field4037;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class222() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILmb;I)V")
    public static final void method1391(int arg0, class132 arg1, int arg2) {
        class132 var3 = arg1.method906(-48).method900(0);
        ++field4041;
        boolean var4 = false;
        for (int var5 = 0; var5 < class160.field2906; ++var5) {
            class159 var6 = class68.field1120[class33.field527[var5]];
            if (var6 != null && var6.field2877 != null && var6.field2877.method882(24493, var3)) {
                class37.method265(1, 0, class210.field3854.field703[0], false, 68, 0, 1, var6.field703[0], 2, var6.field676[0], 0, class210.field3854.field676[0]);
                if (arg2 != 1) {
                    if (~arg2 != -5) {
                        if (~arg2 == -7) {
                            class64.field1054.method660(76, 3);
                            ++class17.field246;
                            class64.field1054.method764(class33.field527[var5], 10432);
                        } else if (arg2 == 7) {
                            class64.field1054.method660(142, 3);
                            ++class88.field1541;
                            class64.field1054.method715(26, class33.field527[var5]);
                        }
                    } else {
                        class64.field1054.method660(103, 3);
                        class64.field1054.method741(121, class33.field527[var5]);
                        ++class63.field1051;
                    }
                } else {
                    class64.field1054.method660(146, 3);
                    ++class151.field2764;
                    class64.field1054.method760(class33.field527[var5], (byte) -73);
                }
                var4 = true;
                break;
            }
        }
        if (arg0 < 1) {
            field4034 = null;
        }
        if (!var4) {
            class169.method1108(-39, class187.method1197(new class132[] { class165.field2982, var3 }, -77), 0, class75.field1247);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ldh;II)V")
    public static final void method1392(class42 arg0, int arg1, int arg2) {
        if (~arg0.field704 >= ~class30.field460) {
            if (class30.field460 > arg0.field741) {
                class195.method1237(arg0, (byte) -59);
            } else {
                class54.method370((byte) 115, arg0);
            }
        } else {
            class95.method589((byte) -44, arg0);
        }
        if (arg0.field673 < 128 || ~arg0.field723 > -129 || arg0.field673 >= 13184 || ~arg0.field723 <= -13185) {
            arg0.field673 = arg0.field703[0] * 128 + arg0.field679 * 64;
            arg0.field741 = 0;
            arg0.field731 = -1;
            arg0.field723 = arg0.field676[0] * 128 + arg0.field679 * 64;
            arg0.field695 = -1;
            arg0.field704 = 0;
            arg0.method287(-121);
        }
        if (class210.field3854 == arg0 && (~arg0.field673 > -1537 || arg0.field723 < 1536 || ~arg0.field673 <= -11777 || ~arg0.field723 <= -11777)) {
            arg0.field723 = arg0.field676[0] * 128 + arg0.field679 * 64;
            arg0.field704 = 0;
            arg0.field673 = arg0.field703[0] * 128 + arg0.field679 * 64;
            arg0.field741 = 0;
            arg0.field731 = -1;
            arg0.field695 = -1;
            arg0.method287(-128);
        }
        ++field4030;
        class110.method697(-27014, arg0);
        class96.method603(arg0, (byte) 2);
        if (arg2 != -1) {
            field4036 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIZII[B[II)V")
    public static final void method1393(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, byte[] arg7, int[] arg8, int arg9) {
        ++field4048;
        if (!arg4) {
            method1392((class42) null, 105, -25);
        }
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 3);
        for (int var12 = -arg0; var12 < 0; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                if (~arg7[arg9++] == -1) {
                    ++arg3;
                } else {
                    arg8[arg3++] = arg2;
                }
                if (~arg7[arg9++] == -1) {
                    ++arg3;
                } else {
                    arg8[arg3++] = arg2;
                }
                if (~arg7[arg9++] != -1) {
                    arg8[arg3++] = arg2;
                } else {
                    ++arg3;
                }
                if (arg7[arg9++] == 0) {
                    ++arg3;
                } else {
                    arg8[arg3++] = arg2;
                }
            }
            for (int var14 = var11; ~var14 > -1; ++var14) {
                if (arg7[arg9++] != 0) {
                    arg8[arg3++] = arg2;
                } else {
                    ++arg3;
                }
            }
            arg3 += arg6;
            arg9 += arg1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBI[Ltf;[B)V")
    public static final void method1394(int arg0, byte arg1, int arg2, class210[] arg3, byte[] arg4) {
        ++field4029;
        class112 var5 = new class112(arg4);
        if (arg1 >= -80) {
            method1393(-70, 51, 79, -117, false, 10, 92, (byte[]) null, (int[]) null, 11);
        }
        int var6 = -1;
        while (true) {
            int var7 = var5.method756(-30606);
            if (~var7 == -1) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method754(4695);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 + -1;
                int var10 = var8 & 63;
                int var11 = (var8 & 4046) >> 6;
                int var12 = var5.method716(-1308);
                int var13 = var8 >> 12;
                int var14 = var12 >> 2;
                int var15 = 3 & var12;
                int var16 = arg2 + var11;
                int var17 = arg0 + var10;
                if (var16 > 0 && ~var17 < -1 && var16 < 103 && var17 < 103) {
                    int var18 = var13;
                    if ((2 & class148.field2722[1][var16][var17]) == 2) {
                        var18 = var13 - 1;
                    }
                    class210 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg3[var18];
                    }
                    class161.method1042(var14, var6, var13, class66.field1096, var16, var17, var15, var19, (byte) 70, var13, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public static void method1395(byte arg0) {
        field4045 = null;
        field4044 = null;
        field4049 = null;
        field4028 = null;
        field4033 = null;
        field4032 = null;
        field4031 = null;
        field4027 = null;
        field4035 = null;
        field4042 = null;
        field4050 = null;
        if (arg0 != 29) {
            method1391(-76, (class132) null, 39);
        }
        field4036 = null;
        field4026 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field4039;
        if (arg0 != -1893) {
            return null;
        } else {
            int[][] var3 = super.field764.method1350((byte) 125, arg1);
            if (super.field764.field3960) {
                int[][] var4 = this.method301(arg1, (byte) 57, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var4[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class131.field2427; ++var11) {
                    int var12 = var9[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (~var13 > ~this.field4037) {
                        var7[var11] = this.field4037;
                    } else if (var13 > this.field4047) {
                        var7[var11] = this.field4047;
                    } else {
                        var7[var11] = var13;
                    }
                    if (~var12 <= ~this.field4037) {
                        if (~var12 >= ~this.field4047) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field4047;
                        }
                    } else {
                        var8[var11] = this.field4037;
                    }
                    if (~var14 <= ~this.field4037) {
                        if (var14 <= this.field4047) {
                            var10[var11] = var14;
                        } else {
                            var10[var11] = this.field4047;
                        }
                    } else {
                        var10[var11] = this.field4037;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field4040;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field746 = arg2.method716(arg1 + -1235) == 1;
                }
            } else {
                this.field4047 = arg2.method739(-126);
            }
        } else {
            this.field4037 = arg2.method739(arg1 ^ -18);
        }
        if (arg1 != -73) {
            this.method64(74, -81);
        }
    }
}
