import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class106 {

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lqe;")
    public static class168 field1698 = class66.method448("http:)4)4", -113);

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lqe;")
    public static class168 field1700 = class66.method448("Standort", -124);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[Z")
    public static boolean[] field1699 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lqe;")
    public static class168 field1697 = class66.method448("Ladevorgang )2 bitte warten Sie)3", -108);

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
    public static int[] field1693 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lqe;")
    public static class168 field1703 = class66.method448("leuchten3:", 48);

    @OriginalMember(owner = "client!e", name = "d", descriptor = "B")
    public static byte field1695;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZII)V")
    public static final void method698(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1701++;
        if (arg4) {
            method701(null, (byte) 95);
        }
        int var7 = class97.method639(arg6, (byte) 12, class222.field3811, class196.field3402);
        int var8 = class97.method639(arg3, (byte) 12, class222.field3811, class196.field3402);
        int var9 = class97.method639(arg1, (byte) 12, class174.field3055, class249.field4314);
        int var10 = class97.method639(arg2, (byte) 12, class174.field3055, class249.field4314);
        int var11 = class97.method639(arg0 + arg6, (byte) 12, class222.field3811, class196.field3402);
        int var12 = class97.method639(arg3 - arg0, (byte) 12, class222.field3811, class196.field3402);
        for (int var13 = var7; var13 < var11; var13++) {
            class232.method1501(arg5, var9, (byte) -108, class241.field4117[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class232.method1501(arg5, var9, (byte) -108, class241.field4117[var14], var10);
        }
        int var15 = class97.method639(arg0 + arg1, (byte) 12, class174.field3055, class249.field4314);
        int var16 = class97.method639(arg2 - arg0, (byte) 12, class174.field3055, class249.field4314);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class241.field4117[var17];
            class232.method1501(arg5, var9, (byte) -108, var18, var15);
            class232.method1501(arg5, var16, (byte) -108, var18, var10);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method699(int arg0) {
        field1703 = null;
        field1693 = null;
        field1698 = null;
        field1699 = null;
        if (arg0 == -1) {
            field1697 = null;
            field1700 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lmj;B)Z")
    public static final boolean method700(class129 arg0, byte arg1) {
        field1694++;
        if (arg0.field2272 == null) {
            return false;
        } else if (arg1 > -43) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg0.field2272.length; var2++) {
                int var3 = class64.method440(arg0, var2, (byte) 90);
                int var4 = arg0.field2280[var2];
                if (arg0.field2272[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field2272[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg0.field2272[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BB)V")
    public static final void method701(byte[] arg0, byte arg1) {
        field1696++;
        int var2 = 0;
        if (arg1 != 40) {
            field1700 = null;
        }
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class232.field3935;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class162.field2781;
                if (var3 > 0 && var4 > 0 && class79.field1189 > var3 + 64 && var4 + 64 < class42.field552) {
                    int var5 = var3 >> 6;
                    int var6 = class42.field552 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class252.field4362[var5][var6] == null) {
                                    class252.field4362[var5][var6] = new byte[4096];
                                }
                                class252.field4362[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class89.field1394[var5][var6] == null) {
                                    class89.field1394[var5][var6] = new byte[4096];
                                }
                                class89.field1394[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }
}
