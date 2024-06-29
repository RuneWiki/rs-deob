import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class163 extends class202 {

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "[B")
    public byte[] field2937;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "Lsb;")
    public static class98 field2944 = class47.method368("<col=ff3000>", 0);

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Lsb;")
    public static class98 field2939 = class47.method368("underlay", 0);

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lsb;")
    private static class98 field2941 = class47.method368("Loading sprites )2 ", 0);

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "Lsb;")
    public static class98 field2946 = field2941;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    public static int field2945 = 0;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "Lsb;")
    public static class98 field2947 = class47.method368("Hierhin gehen", 0);

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "Lnd;")
    public static class192 field2943;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)Lid;")
    public static final class207 method1176(int arg0, int arg1, int arg2) {
        class71 var3 = class31.field553[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1157;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(II)Lmd;")
    public static final class191 method1177(int arg0, int arg1) {
        field2940++;
        class191 var2 = (class191) class264.field4628.method1564((long) arg0, arg1 ^ arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class99.field1740.method571(class258.method1774(arg0, 4096), class20.method217(arg1 ^ 0x524E, arg0), 126);
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1320(-11899, new class216(var3));
        }
        class264.field4628.method1563((long) arg0, 21771, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2948++;
        int var8 = arg2 + arg6;
        int var9 = arg3 + arg2;
        int var10 = arg0 - arg2;
        for (int var11 = arg6; var11 < var8; var11++) {
            class37.method305(-7, class43.field721[var11], arg0, arg7, arg3);
        }
        if (!arg4) {
            field2943 = null;
        }
        int var12 = arg5 - arg2;
        for (int var13 = arg5; var13 > var12; var13--) {
            class37.method305(-7, class43.field721[var13], arg0, arg7, arg3);
        }
        for (int var14 = var8; var14 <= var12; var14++) {
            int[] var15 = class43.field721[var14];
            class37.method305(-7, var15, var9, arg7, arg3);
            class37.method305(-7, var15, var10, arg1, var9);
            class37.method305(-7, var15, arg0, arg7, var10);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)V")
    public static final void method1179(int arg0, byte arg1, int arg2) {
        field2938++;
        long var3 = (long) ((arg2 << 16) + arg0);
        class33 var5 = (class33) class53.field861.method1511((byte) -124, var3);
        if (var5 != null) {
            class117.field2095.method121(var5, -1677);
            int var6 = -32 / ((arg1 + 62) / 42);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([B)V")
    public class163(byte[] arg0) {
        this.field2937 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1180(int arg0) {
        if (arg0 != -1809864944) {
            return;
        }
        field2947 = null;
        field2939 = null;
        field2944 = null;
        field2943 = null;
        field2941 = null;
        field2946 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBZIIZIZ)Lnj;")
    public static final class82 method1181(int arg0, byte arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        field2942++;
        class245 var8 = class235.method1605(arg1 + 37, arg4);
        if (arg6 > 1 && var8.field4293 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4266[var10] <= arg6 && var8.field4266[var10] != 0) {
                    var9 = var8.field4293[var10];
                }
            }
            if (var9 != -1) {
                var8 = class235.method1605(51, var9);
            }
        }
        if (arg1 != 67) {
            return null;
        }
        class58 var11 = var8.method1700(-69);
        if (var11 == null) {
            return null;
        }
        class247 var12 = null;
        if (var8.field4275 != -1) {
            var12 = (class247) method1181(1, (byte) 67, false, 0, var8.field4304, true, 10, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4250 != -1) {
            var12 = (class247) method1181(arg0, (byte) 67, false, arg3, var8.field4303, true, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class128.field2286;
        int[] var14 = new int[4];
        int var15 = class128.field2291;
        int var16 = class128.field2294;
        class128.method965(var14);
        class247 var17 = new class247(36, 32);
        class128.method973(var17.field4338, 36, 32);
        class160.method1152();
        class160.method1153(16, 16);
        class160.field2887 = false;
        int var18 = var8.field4277;
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class160.field2893[var8.field4321] * var18 >> 16;
        int var20 = class160.field2890[var8.field4321] * var18 >> 16;
        var11.method165(0, var8.field4307, var8.field4310, var8.field4321, var8.field4330, var19 + var8.field4314 - (var11.method90() / 2), var20 - -var8.field4314);
        if (arg0 >= 1) {
            var17.method1711(1);
            if (arg0 >= 2) {
                var17.method1711(16777215);
            }
            class128.method973(var17.field4338, 36, 32);
        }
        if (arg3 != 0) {
            var17.method1714(arg3);
        }
        if (var8.field4275 != -1) {
            var12.method618(0, 0);
        } else if (var8.field4250 != -1) {
            class128.method973(var12.field4338, 36, 32);
            var17.method618(0, 0);
            var17 = var12;
        }
        if (arg2 && (var8.field4252 == 1 || arg6 != 1) && arg6 != -1) {
            class71.field1162.method531(class167.method1196(1000, arg6), 0, 9, 16776960, 1);
        }
        class128.method973(var13, var16, var15);
        class128.method975(var14);
        class160.method1152();
        class160.field2887 = true;
        return var17;
    }
}
