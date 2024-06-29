import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class104 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Luj;")
    private class155 field1798;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lek;")
    private class205 field1801;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "[[I")
    public static int[][] field1795;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILlc;)V")
    public static final void method812(int arg0, class270 arg1) {
        field1802++;
        if (class192.field2839) {
            return;
        }
        class130.method979();
        class51.field708 = class181.method1280(1, class287.field4601, arg1);
        int var2 = class137.field2230;
        int var3 = var2 * 956 / 503;
        class51.field708.method719((class179.field2677 - var3) / 2, 0, var3, var2);
        class85.field1353 = class269.method1862(arg1, 122, class1.field15);
        if (arg0 < 20) {
            method812(64, (class270) null);
        }
        class85.field1353.method1041(class179.field2677 / 2 - (class85.field1353.field2258 / 2), 18);
        class192.field2839 = true;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLek;)V")
    public final void method813(byte arg0, class205 arg1) {
        this.field1801 = arg1;
        if (arg0 != -16) {
            field1795 = null;
        }
        field1794++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII[Lii;[BIZII)V")
    public static final void method814(int arg0, int arg1, int arg2, int arg3, int arg4, class228[] arg5, byte[] arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1796++;
        class53 var11 = new class53(arg6);
        if (arg7 != 2) {
            field1797 = 38;
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method334(2053946859);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method368(-129);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFF6) >> 6;
                int var17 = var14 >> 12;
                int var18 = var14 & 0x3F;
                int var19 = var11.method366(-16505);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg10 == var17 && var16 >= arg9 && var16 < (arg9 + 8) && var18 >= arg3 && var18 < (arg3 + 8)) {
                    class93 var22 = class48.method297(false, var12);
                    int var23 = arg2 + class225.method1564(var22.field1557, var18 & 0x7, var16 & 0x7, false, var22.field1544, var21, arg1);
                    int var24 = class62.method475(var22.field1557, var18 & 0x7, arg1, var16 & 0x7, var22.field1544, var21, -18228) + arg4;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class228 var25 = null;
                        if (!arg8) {
                            int var26 = arg0;
                            if ((class253.field3806[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class221.method1540(var20, arg8, arg0, var25, !arg8, var23, arg0, var12, var24, 5023, var21 + arg1 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Luj;")
    public final class155 method815(int arg0) {
        if (arg0 != 7) {
            return null;
        }
        field1800++;
        class155 var2 = this.field1798;
        if (this.field1801.field3025 == var2) {
            this.field1798 = null;
            return null;
        } else {
            this.field1798 = var2.field2420;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Luj;")
    public final class155 method816(byte arg0) {
        field1799++;
        int var2 = 34 / ((arg0 + 60) / 46);
        class155 var3 = this.field1801.field3025.field2420;
        if (this.field1801.field3025 == var3) {
            this.field1798 = null;
            return null;
        } else {
            this.field1798 = var3.field2420;
            return var3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method817(int arg0) {
        if (arg0 == -1) {
            field1795 = null;
        }
    }
}
