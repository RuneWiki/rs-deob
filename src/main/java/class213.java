import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class213 implements class248 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lce;")
    public static class126 field3619 = class206.method1445(-7923, ")1");

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lce;")
    public static class126 field3625 = class206.method1445(-7923, "document)3cookie=(R");

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Lce;")
    public static class126 field3627 = class206.method1445(-7923, "Number of player models in cache:");

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field3626 = 0;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[I")
    public static int[] field3622;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(J[III)Lce;", line = 9)
    public final class126 method1479(long arg0, int[] arg1, int arg2, int arg3) {
        field3621++;
        if (~arg3 == arg2) {
            class319 var7 = class305.method2049(arg1[0], (byte) 126);
            return var7.method2221((int) arg0, 65);
        } else if (arg3 == 1 || arg3 == 10) {
            class137 var6 = class68.method498(arg2 ^ 0xFFFFFFCB, (int) arg0);
            return var6.field2396;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class305.method2049(arg1[0], (byte) 124).method2221((int) arg0, 110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V", line = 41)
    public static final void method1480(int arg0, int arg1, int arg2) {
        if (arg0 < 75) {
            field3626 = 40;
        }
        class129 var3 = class89.field1388[class131.field2250][arg1][arg2];
        field3624++;
        if (var3 == null) {
            class315.method2195(class131.field2250, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class81 var5 = null;
        for (class81 var6 = (class81) var3.method898((byte) -121); var6 != null; var6 = (class81) var3.method893((byte) 0)) {
            class137 var7 = class68.method498(101, var6.field1303.field3826);
            int var8 = var7.field2427;
            if (var7.field2407 == 1) {
                var8 = (var6.field1303.field3824 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class315.method2195(class131.field2250, arg1, arg2);
            return;
        }
        class227 var9 = null;
        var3.method897(0, var5);
        class81 var10 = (class81) var3.method898((byte) -85);
        class227 var11 = null;
        while (var10 != null) {
            class227 var12 = var10.field1303;
            if (var5.field1303.field3826 != var12.field3826) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field3826 != var12.field3826 && var11 == null) {
                    var11 = var12;
                }
            }
            var10 = (class81) var3.method893((byte) -125);
        }
        long var13 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class203.method1431(class131.field2250, arg1, arg2, class174.method1265(arg2 * 128 + 64, 8100, class131.field2250, arg1 * 128 + 64), var5.field1303, var13, var9, var11);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZIII)V", line = 119)
    public static final void method1481(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return;
        }
        field3623++;
        for (int var6 = arg0; var6 <= (arg0 + arg4); var6++) {
            for (int var7 = arg3; var7 <= (arg3 + arg5); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class122.field2036[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg0; var8 < (arg0 + arg4); var8++) {
            for (int var9 = arg3; var9 < (arg3 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class264.field4396[arg1][var9][var8] = arg1 > 0 ? class264.field4396[arg1 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg0 + 1; var10 < arg0 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class264.field4396[arg1][arg3][var10] = class264.field4396[arg1][arg3 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg3 + 1; var11 < arg3 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class264.field4396[arg1][var11][arg0] = class264.field4396[arg1][var11][arg0 - 1];
                }
            }
        }
        if (arg3 < 0 || arg0 < 0 || arg3 >= 104 || arg0 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 > 0 && class264.field4396[arg1][arg3 - 1][arg0] != 0) {
                class264.field4396[arg1][arg3][arg0] = class264.field4396[arg1][arg3 - 1][arg0];
            } else if (arg0 > 0 && class264.field4396[arg1][arg3][arg0 - 1] != 0) {
                class264.field4396[arg1][arg3][arg0] = class264.field4396[arg1][arg3][arg0 - 1];
            } else if (arg3 > 0 && arg0 > 0 && class264.field4396[arg1][arg3 - 1][arg0 - 1] != 0) {
                class264.field4396[arg1][arg3][arg0] = class264.field4396[arg1][arg3 - 1][arg0 - 1];
            }
        } else if (arg3 > 0 && class264.field4396[arg1 - 1][arg3 - 1][arg0] != class264.field4396[arg1][arg3 - 1][arg0]) {
            class264.field4396[arg1][arg3][arg0] = class264.field4396[arg1][arg3 - 1][arg0];
        } else if (arg0 > 0 && class264.field4396[arg1][arg3][arg0 - 1] != class264.field4396[arg1 - 1][arg3][arg0 - 1]) {
            class264.field4396[arg1][arg3][arg0] = class264.field4396[arg1][arg3][arg0 - 1];
        } else if (arg3 > 0 && arg0 > 0 && class264.field4396[arg1 - 1][arg3 - 1][arg0 - 1] != class264.field4396[arg1][arg3 - 1][arg0 - 1]) {
            class264.field4396[arg1][arg3][arg0] = class264.field4396[arg1][arg3 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 240)
    public static void method1482(boolean arg0) {
        field3619 = null;
        if (!arg0) {
            method1480(-37, 88, 26);
        }
        field3625 = null;
        field3627 = null;
        field3622 = null;
    }
}
