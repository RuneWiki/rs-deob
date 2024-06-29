import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class196 {

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    private int field2861 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    private int field2863 = 0;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    private int field2859 = 0;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lei;")
    private class120 field2872 = null;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lbt;")
    private class33 field2871;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lpt;")
    private class376 field2854;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "[Lsa;")
    private class141[] field2869;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lma;")
    public class10 field2856;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2864 = 0;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
    public static int[] field2868 = new int[5];

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lqt;")
    public static class459 field2857 = new class459(47, 3);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIZZ)V")
    public final void method1324(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        field2858++;
        boolean var7 = arg4 & this.field2871.method182();
        if (arg1 != 2) {
            method1328(30, null);
        }
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg3 = arg0;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg5) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field2863 != arg2) {
            if (this.field2863 != 0) {
                this.field2869[this.field2863 & Integer.MAX_VALUE].method48(arg1 + 82);
            }
            if (arg2 != 0) {
                this.field2869[arg2 & Integer.MAX_VALUE].method51(arg1 ^ 0xFFFFAA75, arg5);
                this.field2869[Integer.MAX_VALUE & arg2].method53(arg5, 0);
                this.field2869[Integer.MAX_VALUE & arg2].method49(1400, arg3, arg0);
            }
            this.field2859 = arg0;
            this.field2861 = arg3;
            this.field2872 = null;
            this.field2863 = arg2;
        } else if (this.field2863 != 0) {
            this.field2869[this.field2863 & Integer.MAX_VALUE].method53(arg5, 0);
            if (this.field2859 != arg0 || this.field2861 != arg3) {
                this.field2869[this.field2863 & Integer.MAX_VALUE].method49(1400, arg3, arg0);
                this.field2861 = arg3;
                this.field2859 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)Z")
    public final boolean method1325(boolean arg0, int arg1) {
        field2862++;
        if (arg0) {
            field2866 = 114;
        }
        return this.field2869[arg1].method55(0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBLei;)Z")
    public final boolean method1326(int arg0, byte arg1, class120 arg2) {
        field2867++;
        if (arg1 != -14) {
            this.method1326(11, (byte) -119, null);
        }
        if (this.field2863 == 0) {
            return false;
        }
        if (this.field2872 != arg2) {
            this.field2869[this.field2863 & Integer.MAX_VALUE].method57(arg2, arg0, arg1 + 113);
            this.field2872 = arg2;
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1327(int arg0) {
        class215.field3238 = 0;
        if (arg0 != 1) {
            method1329(null, -62, 4, 62, -50, -57, -73, 115, 42, 24, -26);
        }
        class79.field1281 = new class306[50];
        field2860++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILeu;)V")
    public static final void method1328(int arg0, class341 arg1) {
        if (arg0 != 127) {
            return;
        }
        field2855++;
        if (!class248.field3714) {
            arg1.method421(22071);
            class430.field6184--;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lue;IIIIIIIIII)Z")
    public static final boolean method1329(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2865++;
        int var11 = arg3;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        if (arg8 != 2) {
            field2870 = -65;
        }
        class251.field3739[var13][var14] = 99;
        int var16 = arg7 - var14;
        class287.field4247[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class62.field1087[var17] = arg3;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class476.field6935[var10001] = arg7;
        int[][] var19 = arg0.field2427;
        while (var26 != var18) {
            var11 = class62.field1087[var18];
            var12 = class476.field6935[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - arg0.field2437;
            int var21 = var11 - var15;
            int var22 = var11 - arg0.field2440;
            int var23 = var12 - var16;
            if (arg10 == -4) {
                if (arg9 == var11 && arg6 == var12) {
                    class347.field5113 = var12;
                    class90.field1445 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class167.method1192(arg5, arg1, arg9, var12, var11, 1, arg6, 1, 1)) {
                    class90.field1445 = var11;
                    class347.field5113 = var12;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg0.method1111((byte) -60, arg9, 1, arg6, var11, arg1, 1, arg5, var12, arg2)) {
                    class90.field1445 = var11;
                    class347.field5113 = var12;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg0.method1118(arg6, arg2, 1, arg1, arg9, (byte) 124, var11, arg5, var12)) {
                    class90.field1445 = var11;
                    class347.field5113 = var12;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg0.method1122(arg10, arg9, arg6, var11, var12, (byte) 38, 1, arg4)) {
                    class90.field1445 = var11;
                    class347.field5113 = var12;
                    return true;
                }
            } else if (arg0.method1119(arg9, arg6, arg4, var12, 3, 1, var11, arg10)) {
                class90.field1445 = var11;
                class347.field5113 = var12;
                return true;
            }
            int var25 = class287.field4247[var21][var23] + 1;
            if (var21 > 0 && class251.field3739[var21 - 1][var23] == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0) {
                class62.field1087[var26] = var11 - 1;
                class476.field6935[var26] = var12;
                class251.field3739[var21 - 1][var23] = 2;
                var26 = var26 + 1 & 0xFFF;
                class287.field4247[var21 - 1][var23] = var25;
            }
            if (var21 < 127 && class251.field3739[var21 + 1][var23] == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0) {
                class62.field1087[var26] = var11 + 1;
                class476.field6935[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var21 + 1][var23] = 8;
                class287.field4247[var21 + 1][var23] = var25;
            }
            if (var23 > 0 && class251.field3739[var21][var23 - 1] == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class62.field1087[var26] = var11;
                class476.field6935[var26] = var12 - 1;
                class251.field3739[var21][var23 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class287.field4247[var21][var23 - 1] = var25;
            }
            if (var23 < 127 && class251.field3739[var21][var23 + 1] == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class62.field1087[var26] = var11;
                class476.field6935[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var21][var23 + 1] = 4;
                class287.field4247[var21][var23 + 1] = var25;
            }
            if (var21 > 0 && var23 > 0 && class251.field3739[var21 - 1][var23 - 1] == 0 && (var19[var22 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class62.field1087[var26] = var11 - 1;
                class476.field6935[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var21 - 1][var23 - 1] = 3;
                class287.field4247[var21 - 1][var23 - 1] = var25;
            }
            if (var21 < 127 && var23 > 0 && class251.field3739[var21 + 1][var23 - 1] == 0 && (var19[var22 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class62.field1087[var26] = var11 + 1;
                class476.field6935[var26] = var12 - 1;
                class251.field3739[var21 + 1][var23 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class287.field4247[var21 + 1][var23 - 1] = var25;
            }
            if (var21 > 0 && var23 < 127 && class251.field3739[var21 - 1][var23 + 1] == 0 && (var19[var22 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class62.field1087[var26] = var11 - 1;
                class476.field6935[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var21 - 1][var23 + 1] = 6;
                class287.field4247[var21 - 1][var23 + 1] = var25;
            }
            if (var21 < 127 && var23 < 127 && class251.field3739[var21 + 1][var23 + 1] == 0 && (var19[var22 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class62.field1087[var26] = var11 + 1;
                class476.field6935[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class251.field3739[var21 + 1][var23 + 1] = 12;
                class287.field4247[var21 + 1][var23 + 1] = var25;
            }
        }
        class347.field5113 = var12;
        class90.field1445 = var11;
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1330(int arg0) {
        if (arg0 > -78) {
            method1329(null, -35, 81, 44, 99, 53, 6, -15, -120, 8, 115);
        }
        field2868 = null;
        field2857 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lbt;)V")
    public class196(class33 arg0) {
        this.field2871 = arg0;
        this.field2854 = new class376(arg0);
        this.field2869 = new class141[10];
        this.field2869[1] = new class101(arg0);
        this.field2869[2] = new class264(arg0, this.field2854);
        this.field2869[4] = new class174(arg0, this.field2854);
        this.field2869[5] = new class462(arg0, this.field2854);
        this.field2869[6] = new class498(arg0);
        this.field2869[7] = new class247(arg0);
        this.field2869[3] = this.field2856 = new class10(arg0);
        this.field2869[8] = new class84(arg0, this.field2854);
        this.field2869[9] = new class349(arg0, this.field2854);
        if (!this.field2869[8].method55(0)) {
            this.field2869[8] = this.field2869[4];
        }
        if (!this.field2869[9].method55(0)) {
            this.field2869[9] = this.field2869[8];
        }
    }
}
