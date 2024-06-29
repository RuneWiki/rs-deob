import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class168 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2705 = -1;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lcc;")
    public static class216 field2703 = new class216(4);

    @OriginalMember(owner = "client!j", name = "i", descriptor = "[I")
    public static int[] field2711 = new int[14];

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[Lpi;")
    public static class141[] field2712 = new class141[14];

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[[B")
    public static byte[][] field2709 = new byte[50][];

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lhc;")
    public static class236 field2714;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)I")
    public static final int method1236(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1240(126, -73, -42, 34, 55, (byte) 71);
        }
        field2706++;
        int var3 = class28.method198(arg2 - 1, arg1 + -1, 93) + class28.method198(arg2 + 1, arg1 + -1, -40) - (-class28.method198(arg2 + -1, arg1 + 1, -77) + -class28.method198(arg2 + 1, arg1 - -1, 90));
        int var4 = class28.method198(arg2 - 1, arg1, 58) + class28.method198(arg2 + 1, arg1, -62) - (-class28.method198(arg2, arg1 + -1, 108) + -class28.method198(arg2, arg1 - -1, -128));
        int var5 = class28.method198(arg2, arg1, -126);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1237(int arg0) {
        field2714 = null;
        field2703 = null;
        field2711 = null;
        field2712 = null;
        if (arg0 <= 75) {
            field2705 = -30;
        }
        field2709 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z[B)V")
    public abstract void method774(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIZII)V")
    public static final void method1238(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= (arg1 + arg5); var6++) {
            for (int var11 = arg0; var11 <= arg0 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class59.field830[arg2][var11][var6] = 127;
                }
            }
        }
        field2707++;
        for (int var7 = arg1; var7 < arg1 + arg5; var7++) {
            for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class220.field3533[arg2][var10][var7] = arg2 <= 0 ? 0 : class220.field3533[arg2 - 1][var10][var7];
                }
            }
        }
        if (!arg3) {
            method1240(74, -28, -71, 21, 66, (byte) -96);
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class220.field3533[arg2][arg0][var8] = class220.field3533[arg2][arg0 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg0 + 1; var9 < arg0 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class220.field3533[arg2][var9][arg1] = class220.field3533[arg2][var9][arg1 - 1];
                }
            }
        }
        if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg2 != 0) {
            if (arg0 > 0 && class220.field3533[arg2 - 1][arg0 - 1][arg1] != class220.field3533[arg2][arg0 - 1][arg1]) {
                class220.field3533[arg2][arg0][arg1] = class220.field3533[arg2][arg0 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class220.field3533[arg2][arg0][arg1 - 1] != class220.field3533[arg2 - 1][arg0][arg1 - 1]) {
                class220.field3533[arg2][arg0][arg1] = class220.field3533[arg2][arg0][arg1 - 1];
                return;
            }
            if (arg0 > 0 && arg1 > 0 && class220.field3533[arg2 - 1][arg0 - 1][arg1 - 1] != class220.field3533[arg2][arg0 - 1][arg1 - 1]) {
                class220.field3533[arg2][arg0][arg1] = class220.field3533[arg2][arg0 - 1][arg1 - 1];
                return;
            }
            return;
        }
        if (arg0 > 0 && class220.field3533[arg2][arg0 - 1][arg1] != 0) {
            class220.field3533[arg2][arg0][arg1] = class220.field3533[arg2][arg0 - 1][arg1];
            return;
        }
        if (arg1 > 0 && class220.field3533[arg2][arg0][arg1 - 1] != 0) {
            class220.field3533[arg2][arg0][arg1] = class220.field3533[arg2][arg0][arg1 - 1];
            return;
        }
        if (arg0 > 0 && arg1 > 0 && class220.field3533[arg2][arg0 - 1][arg1 - 1] != 0) {
            class220.field3533[arg2][arg0][arg1] = class220.field3533[arg2][arg0 - 1][arg1 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method1239(int arg0, int arg1) {
        if (arg1 > -100) {
            field2709 = null;
        }
        class275.field4416.method1548(arg0, 0);
        field2710++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)[B")
    public abstract byte[] method775(int arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = arg4 - arg3;
        field2713++;
        int var7 = arg0 - arg2;
        if (var7 == 0) {
            if (var6 != 0) {
                class52.method396(arg1, -1, arg3, arg4, arg2);
            }
        } else if (var6 == 0) {
            class186.method1377(arg1, arg2, (byte) 73, arg0, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg2;
                arg2 = arg3;
                int var10 = arg0;
                arg3 = var9;
                arg0 = arg4;
                arg4 = var10;
            }
            if (arg0 < arg2) {
                int var11 = arg2;
                int var12 = arg3;
                arg3 = arg4;
                arg2 = arg0;
                arg4 = var12;
                arg0 = var11;
            }
            int var13 = arg0 - arg2;
            int var14 = arg3;
            int var15 = arg4 - arg3;
            if (arg5 != -56) {
                method1239(-36, 32);
            }
            int var16 = -(var13 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg3 >= arg4 ? -1 : 1;
            if (var8) {
                for (int var19 = arg2; var19 <= arg0; var19++) {
                    var16 += var15;
                    class240.field3831[var19][var14] = arg1;
                    if (var16 > 0) {
                        var16 -= var13;
                        var14 += var17;
                    }
                }
            } else {
                for (int var18 = arg2; var18 <= arg0; var18++) {
                    var16 += var15;
                    class240.field3831[var14][var18] = arg1;
                    if (var16 > 0) {
                        var14 += var17;
                        var16 -= var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IZ)V")
    public static final void method1241(class170 arg0, int arg1, boolean arg2) {
        if (arg2) {
            int var3 = class154.field2543;
            int var4 = var3 * 956 / 503;
            class98.field1443.method74((class23.field265 - var4) / 2, 0, var4, var3);
            class260.field4254.method20(class23.field265 / 2 - (class260.field4254.field1656 / 2), 18);
        }
        arg0.method1260(class77.field1101, class23.field265 / 2, class154.field2543 / 2 - 26, 16777215, -1);
        field2708++;
        int var5 = class154.field2543 / 2 - 18;
        class70.method505(class23.field265 / 2 - 152, var5, 304, 34, 9179409);
        class70.method505(class23.field265 / 2 - 151, var5 + 1, 302, 32, 0);
        class70.method508(class23.field265 / 2 - 150, var5 + 2, class133.field2189 * 3, 30, 9179409);
        class70.method508(class133.field2189 * 3 + class23.field265 / 2 - 150, var5 + 2, 300 - (class133.field2189 * 3), 30, 0);
        if (arg1 != 31308) {
            field2703 = null;
        }
        arg0.method1260(class262.field4261, class23.field265 / 2, class154.field2543 / 2 + 4, 16777215, -1);
    }
}
