import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class132 extends class80 {

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lr;")
    public static class66 field2454 = class93.method641(43, "Sprites geladen)3");

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "Lr;")
    private static class66 field2469 = class93.method641(43, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lr;")
    public static class66 field2461 = class93.method641(43, "null");

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Lr;")
    public static class66 field2456 = field2469;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[[I")
    public static int[][] field2463 = new int[104][104];

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lqc;")
    public static class245 field2460 = new class245(64);

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[Lr;")
    public static class66[] field2462;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IJII)Lr;")
    public static final class66 method914(int[] arg0, long arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            method917(-84, -68);
        }
        field2458++;
        if (class60.field1020 != null) {
            class66 var5 = class60.field1020.method72(arg3, (byte) 22, arg1, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg3 == 5 ? class87.method616(arg1, -1).method467(arg2 ^ 0xFFFFCE6F) : class101.method690(arg1, -62);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method915(int arg0, int arg1) {
        field2455++;
        int var2 = -59 / ((arg1 - 27) / 54);
        class127.field2371 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BZ[Lga;Z)V")
    public static final void method916(int arg0, int arg1, byte[] arg2, boolean arg3, class165[] arg4, boolean arg5) {
        field2467++;
        class249 var6 = new class249(arg2);
        if (arg5) {
            method919(17);
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1664(true);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1639(255);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = (var9 & 0xFC0) >> 6;
                int var13 = var6.method1677(-6677);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var13 & 0x3;
                int var17 = arg0 + var12;
                int var18 = arg1 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class165 var19 = null;
                    if (!arg3) {
                        int var20 = var14;
                        if ((class47.field846[1][var17][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class154.method1051(var19, 1, arg3, var18, var16, var17, var15, var14, var14, !arg3, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)I")
    public static final int method917(int arg0, int arg1) {
        if (arg1 != -528748559) {
            method914((int[]) null, 125L, 117, 89);
        }
        field2464++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
    public static final void method918(int arg0, int arg1) {
        class15.field196 = -1;
        class144.field2635 = arg0;
        class214.field3684 = arg1;
        class167.method1130(-1);
        field2470++;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2456 = null;
        field2460 = null;
        field2454 = null;
        field2469 = null;
        field2462 = null;
        field2463 = null;
        field2461 = null;
        int var1 = -16 / ((4 - arg0) / 49);
    }
}
