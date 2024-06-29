import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class27 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lqj;")
    public static class196 field330 = class80.method502("logo", -48);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lqj;")
    public static class196 field337 = class80.method502("(U", -48);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lea;")
    public static class243 field334 = new class243();

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lqj;")
    private static class196 field340 = class80.method502("Loading sprites )2 ", -48);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lqj;")
    public static class196 field338 = field340;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lp;")
    public static class56 field339 = new class56(8);

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field343 = 0;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Llj;")
    public static class205 field341;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BIIIIII[Lbh;IZZ)V")
    public static final void method151(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class153[] arg7, int arg8, boolean arg9, boolean arg10) {
        field336++;
        class56 var11 = new class56(arg0);
        int var12 = -1;
        if (arg10) {
            return;
        }
        while (true) {
            int var13 = var11.method366(78);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method307((byte) 73);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var11.method367(1);
                int var19 = var14 >> 12;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg2 == var19 && var17 >= arg5 && var17 < arg5 + 8 && arg3 <= var16 && var16 < arg3 + 8) {
                    class145 var22 = class83.method521(var12, (byte) 122);
                    int var23 = class123.method750(11158, var22.field2263, var22.field2278, var17 & 0x7, var21, arg4, var16 & 0x7) + arg1;
                    int var24 = arg6 + class118.method714(var22.field2263, var21, arg4, var17 & 0x7, var16 & 0x7, var22.field2278, 5173);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class153 var25 = null;
                        if (!arg9) {
                            int var26 = arg8;
                            if ((class88.field1300[1][var23][var24] & 0x2) == 2) {
                                var26 = arg8 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class142.method877(arg8, var12, !arg9, var24, arg8, var25, var23, var20, arg9, false, arg4 + var21 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method152(int arg0) {
        field337 = null;
        field338 = null;
        field340 = null;
        field330 = null;
        field341 = null;
        field334 = null;
        if (arg0 == -13005) {
            field339 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLbk;ZLbk;)V")
    public static final void method153(boolean arg0, class136 arg1, boolean arg2, class136 arg3) {
        field333++;
        class116.field1683 = arg0;
        class149.field2390 = arg1;
        class198.field3521 = arg3;
        if (!arg2) {
            field341 = null;
        }
        class148.field2338 = new class22(30);
    }
}
