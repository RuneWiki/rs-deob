import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class179 extends class55 {

    @OriginalMember(owner = "client!bka", name = "R", descriptor = "Ljia;")
    public static class645 field2819 = new class645();

    @OriginalMember(owner = "client!bka", name = "S", descriptor = "[I")
    public static int[] field2820 = new int[1];

    @OriginalMember(owner = "client!bka", name = "N", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!bka", name = "O", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!bka", name = "P", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!bka", name = "Q", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!bka", name = "g", descriptor = "(I)V", line = 3)
    public static final void method1350(int arg0) {
        class777.field10728 = false;
        class505.field6890 = null;
        class498.field6810 = null;
        class480.field6484 = null;
        ++field2815;
        if (arg0 != 1) {
            method1350(36);
        }
        class397.field5476 = null;
        class269.field3780 = null;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)[[I", line = 22)
    public final int[][] method153(int arg0, byte arg1) {
        ++field2816;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 <= 57) {
            this.method153(52, (byte) 94);
        }
        if (super.field4938.field7848 && this.method403(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field790 * super.field790;
            for (int var8 = 0; ~class769.field10597 < ~var8; ++var8) {
                int var9 = super.field793[var8 % super.field794 + var7];
                var6[var8] = class204.method1456(var9, 255) << 4;
                var5[var8] = class204.method1456(var9, 65280) >> 4;
                var4[var8] = class204.method1456(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "(I)V", line = 71)
    public static final void method1351(int arg0) {
        class173.method1315(true);
        ++field2817;
        if (arg0 != 30812) {
            method1351(44);
        }
        class732.method4064(2, arg0 + 1645, class111.field1911.field6751.method2574((byte) 123) == 1, 22050);
        class89.field1277 = class779.method4271(22050, (byte) -108, class558.field7896, class630.field8751, 0);
        class303.method1939(class658.method3697(true, (class558) null), true, (byte) 127);
        class100.field1622 = class779.method4271(2048, (byte) -108, class558.field7896, class630.field8751, 1);
        class100.field1622.method2704(0, class456.field6213);
    }

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "(B)V", line = 87)
    public static void method1352(byte arg0) {
        field2820 = null;
        field2819 = null;
        if (arg0 != -1) {
            method1352((byte) 124);
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(BIILuv;I)V", line = 102)
    public static final void method1353(byte arg0, int arg1, int arg2, class385 arg3, int arg4) {
        ++field2818;
        if (arg0 >= -105) {
            method1352((byte) 68);
        }
        class540 var5 = arg3.method2347(16383);
        int var6 = -arg3.field5246.field2191 + arg3.field5289 & 16383;
        if (arg2 == -1) {
            if (~var6 == -1 && arg3.field5232 <= 25) {
                if (!arg3.field5262 || !var5.method3050(0, arg3.field5249)) {
                    arg3.field5249 = var5.method3052(false);
                    arg3.field5262 = arg3.field5249 != -1;
                }
            } else {
                if (arg4 < 0 && ~var5.field7349 != 0) {
                    arg3.field5249 = var5.field7349;
                    arg3.field5262 = false;
                } else if (~arg4 < -1 && ~var5.field7327 != 0) {
                    arg3.field5249 = var5.field7327;
                } else {
                    arg3.field5249 = var5.field7350;
                }
                arg3.field5262 = false;
            }
        } else if (arg3.field5286 == -1 || ~var6 > -10241 && ~var6 < -2049) {
            if (var6 == 0 && arg3.field5232 <= 25) {
                arg3.field5262 = false;
                if (~arg2 == -3 && ~var5.field7368 != 0) {
                    arg3.field5249 = var5.field7368;
                } else if (arg2 == 0 && var5.field7372 != -1) {
                    arg3.field5249 = var5.field7372;
                } else {
                    arg3.field5249 = var5.field7350;
                }
            } else {
                arg3.field5262 = false;
                if (~arg2 == -3 && ~var5.field7368 != 0) {
                    if (arg4 < 0 && ~var5.field7348 != 0) {
                        arg3.field5249 = var5.field7348;
                    } else if (arg4 > 0 && var5.field7354 != -1) {
                        arg3.field5249 = var5.field7354;
                    } else {
                        arg3.field5249 = var5.field7368;
                    }
                } else if (arg2 == 0 && ~var5.field7372 != 0) {
                    if (arg4 < 0 && ~var5.field7369 != 0) {
                        arg3.field5249 = var5.field7369;
                    } else if (arg4 > 0 && var5.field7378 != -1) {
                        arg3.field5249 = var5.field7378;
                    } else {
                        arg3.field5249 = var5.field7372;
                    }
                } else if (arg4 < 0 && var5.field7344 != -1) {
                    arg3.field5249 = var5.field7344;
                } else if (~arg4 < -1 && var5.field7358 != -1) {
                    arg3.field5249 = var5.field7358;
                } else {
                    arg3.field5249 = var5.field7350;
                }
            }
        } else {
            int var7 = class399.field5505[arg1] + -arg3.field5246.field2191 & 16383;
            arg3.field5262 = false;
            if (~arg2 == -3 && var5.field7368 != -1) {
                if (var7 > 2048 && ~var7 >= -6145 && var5.field7359 != -1) {
                    arg3.field5249 = var5.field7359;
                } else if (var7 >= 10240 && ~var7 > -14337 && var5.field7357 != -1) {
                    arg3.field5249 = var5.field7357;
                } else if (var7 > 6144 && var7 < 10240 && var5.field7337 != -1) {
                    arg3.field5249 = var5.field7337;
                } else {
                    arg3.field5249 = var5.field7368;
                }
            } else if (arg2 == 0 && ~var5.field7372 != 0) {
                if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field7366 != 0) {
                    arg3.field5249 = var5.field7366;
                } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field7336 != 0) {
                    arg3.field5249 = var5.field7336;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field7351 != -1) {
                    arg3.field5249 = var5.field7351;
                } else {
                    arg3.field5249 = var5.field7372;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field7362 != -1) {
                arg3.field5249 = var5.field7362;
            } else if (var7 >= 10240 && ~var7 > -14337 && var5.field7340 != -1) {
                arg3.field5249 = var5.field7340;
            } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field7373 != 0) {
                arg3.field5249 = var5.field7373;
            } else {
                arg3.field5249 = var5.field7350;
            }
        }
    }
}
