import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class88 extends class194 {

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[B")
    public byte[] field1596;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field1599 = 100;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lqk;")
    public static class207 field1600 = class24.method212(255, "<col=ff0000>");

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Lqk;")
    public static class207 field1601 = class24.method212(255, "::clientdrop");

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Lqk;")
    private static class207 field1598 = class24.method212(255, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lqk;")
    public static class207 field1593 = field1598;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lpk;")
    public static class99 field1592;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lpk;")
    public static class99 field1594;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lpk;")
    public static class99 field1597;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[[B")
    public static byte[][] field1591;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
    public static final boolean method642(int arg0, int arg1, int arg2) {
        int var3 = class204.field3598[arg0][arg1][arg2];
        if (-class147.field2528 == var3) {
            return false;
        } else if (class147.field2528 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class4.method27(var4 + 1, class163.field2881[arg0][arg1][arg2], var5 + 1) && class4.method27(var4 + 128 - 1, class163.field2881[arg0][arg1 + 1][arg2], var5 + 1) && class4.method27(var4 + 128 - 1, class163.field2881[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class4.method27(var4 + 1, class163.field2881[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class204.field3598[arg0][arg1][arg2] = class147.field2528;
                return true;
            } else {
                class204.field3598[arg0][arg1][arg2] = -class147.field2528;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static void method643(byte arg0) {
        field1593 = null;
        if (arg0 < 15) {
            field1595 = 120;
        }
        field1597 = null;
        field1594 = null;
        field1601 = null;
        field1591 = null;
        field1600 = null;
        field1598 = null;
        field1592 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method644(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class225.field4104 * 128) {
            arg0 = class225.field4104 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class279.field4908 * 128) {
            arg2 = class279.field4908 * 128 - 1;
        }
        class191.field3378 = class257.field4598[arg3];
        class13.field192 = class257.field4597[arg3];
        class176.field3176 = class257.field4598[arg4];
        class233.field4281 = class257.field4597[arg4];
        class207.field3676 = arg0;
        class134.field2322 = arg1;
        class59.field1084 = arg2;
        class157.field2787 = arg0 / 128;
        class73.field1348 = arg2 / 128;
        class279.field4892 = class157.field2787 - class93.field1643;
        if (class279.field4892 < 0) {
            class279.field4892 = 0;
        }
        class141.field2442 = class73.field1348 - class93.field1643;
        if (class141.field2442 < 0) {
            class141.field2442 = 0;
        }
        class164.field2898 = class93.field1643 + class157.field2787;
        if (class164.field2898 > class225.field4104) {
            class164.field2898 = class225.field4104;
        }
        class204.field3591 = class93.field1643 + class73.field1348;
        if (class204.field3591 > class279.field4908) {
            class204.field3591 = class279.field4908;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class93.field1643 + class93.field1643 + 2; var16++) {
            for (int var19 = 0; var19 < class93.field1643 + class93.field1643 + 2; var19++) {
                int var20 = (var16 - class93.field1643 << 7) - (class207.field3676 & 0x7F);
                int var21 = (var19 - class93.field1643 << 7) - (class59.field1084 & 0x7F);
                int var22 = class157.field2787 + var16 - class93.field1643;
                int var23 = class73.field1348 + var19 - class93.field1643;
                if (var22 >= 0 && var23 >= 0 && var22 < class225.field4104 && var23 < class279.field4908) {
                    int var24;
                    if (class252.field4536 == null) {
                        var24 = class3.field47[0][var22][var23] + 128 - class134.field2322;
                    } else {
                        var24 = class252.field4536[0][var22][var23] + 128 - class134.field2322;
                    }
                    int var25 = class3.field47[3][var22][var23] - class134.field2322 - 1000;
                    class118.field2045[var16][var19] = class231.method1656(var20, var25, var24, var21, var15);
                } else {
                    class118.field2045[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class93.field1643 + class93.field1643 + 1; var17++) {
            for (int var18 = 0; var18 < class93.field1643 + class93.field1643 + 1; var18++) {
                class217.field3853[var17][var18] = class118.field2045[var17][var18] || class118.field2045[var17 + 1][var18] || class118.field2045[var17][var18 + 1] || class118.field2045[var17 + 1][var18 + 1];
            }
        }
        class243.field4417 = arg6;
        class207.field3674 = arg7;
        class233.field4286 = arg8;
        class40.field809 = arg9;
        class285.field4998 = arg10;
        class83.method618();
        if (class270.field4782 != null) {
            class20.method115(true);
            class243.method1714(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class20.method115(false);
        }
        class243.method1714(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
    public class88(byte[] arg0) {
        this.field1596 = arg0;
    }
}
