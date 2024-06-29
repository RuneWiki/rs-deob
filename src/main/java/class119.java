import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class119 {

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lbd;")
    public static class162 field2170 = class17.method142(0, "p11_full");

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lbd;")
    private static class162 field2173 = class17.method142(0, "Allocating memory");

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lbd;")
    public static class162 field2172 = class17.method142(0, "document)3cookie=(R");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "J")
    public static long field2167 = 0L;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lbd;")
    public static class162 field2174 = class17.method142(0, "hint_headicons");

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lbd;")
    public static class162 field2178 = class17.method142(0, "Sprites geladen)3");

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lbd;")
    public static class162 field2177 = field2173;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lbd;")
    public static class162 field2181 = class17.method142(0, ")2");

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field2171 = -1;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "[I")
    public static int[] field2175;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[Lbd;")
    public static class162[] field2164;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 10)
    public static final void method970(byte arg0) {
        int var1 = -77 / ((arg0 + 55) / 56);
        for (int var2 = 0; var2 < 100; var2++) {
            class73.field1159[var2] = true;
        }
        field2179++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Z", line = 27)
    public static final boolean method971(int arg0, int arg1) {
        if (arg1 < 87) {
            return false;
        } else {
            field2163++;
            return (arg0 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 56)
    public static void method972(int arg0) {
        field2177 = null;
        field2173 = null;
        field2181 = null;
        field2178 = null;
        field2174 = null;
        field2175 = null;
        field2172 = null;
        field2170 = null;
        field2164 = null;
        if (arg0 != -5826) {
            method974((byte) 41);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ldj;Z)I", line = 74)
    public static final int method973(class39 arg0, boolean arg1) {
        if (!arg1) {
            field2173 = (class162) null;
        }
        field2168++;
        int var2 = arg0.field599;
        if (arg0.field5068 == arg0.field5064) {
            var2 = arg0.field622;
        } else if (arg0.field5064 == arg0.field5021) {
            var2 = arg0.field616;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 112)
    public static final void method974(byte arg0) {
        field2166++;
        int var1 = 0;
        if (arg0 != 41) {
            field2167 = 16L;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class259.method1790(var1, false, true, class288.field4856, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z[BIIIII[Lqd;III)V", line = 147)
    public static final void method975(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class179[] arg7, int arg8, int arg9, int arg10) {
        if (arg4 != 4610) {
            field2172 = (class162) null;
        }
        field2180++;
        class94 var11 = new class94(arg1);
        int var12 = -1;
        while (true) {
            int var13 = var11.method725(8);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method755((byte) -101);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method756(915905888);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg2 == var18 && var17 >= arg10 && arg10 + 8 > var17 && arg3 <= var16 && (arg3 + 8) > var16) {
                    class311 var22 = class229.method1637(var12, (byte) 93);
                    int var23 = class88.method675((byte) -128, var20, var22.field5201, arg9, var22.field5217, var17 & 0x7, var16 & 0x7) + arg8;
                    int var24 = class151.method1184(var22.field5217, arg9, var20, var22.field5201, arg4 ^ 0x1275, var17 & 0x7, var16 & 0x7) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class179 var25 = null;
                        if (!arg0) {
                            int var26 = arg5;
                            if ((class213.field3580[1][var23][var24] & 0x2) == 2) {
                                var26 = arg5 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg7[var26];
                            }
                        }
                        class82.method624(arg9 + var20 & 0x3, var23, var12, arg5, var21, arg4 ^ 0x1206, arg5, var24, !arg0, var25, arg0);
                    }
                }
            }
        }
    }
}
