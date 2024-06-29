import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class class81 extends class190 {

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field860 = new BigInteger("973e3273ac195f263620286d8b0182b764456cc714421b1378712e771bbd4d83e19bcffce14e2f4ff02071a61a5165a7fe5e53fffab9a220ca5f58dd48c41e4f", 16);

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "Lkfa;")
    public static class549 field861 = new class549(1, 8);

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "[Lvi;")
    public static class492[] field863 = new class492[8];

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "J")
    public static long field864 = -1L;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "Lrn;")
    public static class243 field859;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "Lep;")
    public static class382 field862;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Z")
    public static boolean field856;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIIIIIIIILoa;[[[B)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class635 arg11, byte[][][] arg12) {
        field858++;
        if (arg9 != 3) {
            method521((byte) -58);
        }
        if (arg4 == 0 || arg5 == 0) {
            return;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg10 = arg10 + 1 & 0x3;
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg4 = 8;
        }
        arg11.method281(arg0, arg8, arg6, arg2, arg7, arg3, arg12[arg4 - 1][arg10], arg5, arg1);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILle;IIIIIIIII)Z")
    public static final boolean method520(int arg0, class277 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field857++;
        int var11 = arg8;
        int var12 = arg3;
        byte var13 = 64;
        if (arg0 != -28393) {
            return true;
        }
        byte var14 = 64;
        int var15 = arg8 - var13;
        int var16 = arg3 - var14;
        class386.field5168[var13][var14] = 99;
        class388.field5190[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class392.field5229[var17] = arg8;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class223.field2815[var10001] = arg3;
        int[][] var19 = arg1.field3493;
        while (var26 != var18) {
            var11 = class392.field5229[var18];
            var12 = class223.field2815[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - arg1.field3489;
            int var21 = var12 - var16;
            int var22 = var11 - var15;
            int var23 = var11 - arg1.field3507;
            if (arg6 == -4) {
                if (arg2 == var11 && arg4 == var12) {
                    class633.field8971 = var12;
                    class249.field3200 = var11;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class513.method2935(1, arg4, arg9, 2, var11, arg2, 1, var12, arg10)) {
                    class633.field8971 = var12;
                    class249.field3200 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg1.method1567(1, arg7, arg2, arg10, var11, 53, arg9, arg4, var12, 1)) {
                    class633.field8971 = var12;
                    class249.field3200 = var11;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg1.method1576(arg7, arg4, var12, 1, 6300, arg10, var11, arg9, arg2)) {
                    class633.field8971 = var12;
                    class249.field3200 = var11;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg1.method1575(arg2, arg4, var11, 1, arg6, -1, var12, arg5)) {
                    class633.field8971 = var12;
                    class249.field3200 = var11;
                    return true;
                }
            } else if (arg1.method1568(arg4, 1, 2, arg6, var11, arg5, var12, arg2)) {
                class633.field8971 = var12;
                class249.field3200 = var11;
                return true;
            }
            int var25 = class388.field5190[var22][var21] + 1;
            if (var22 > 0 && class386.field5168[var22 - 1][var21] == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0) {
                class392.field5229[var26] = var11 - 1;
                class223.field2815[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class386.field5168[var22 - 1][var21] = 2;
                class388.field5190[var22 - 1][var21] = var25;
            }
            if (var22 < 127 && class386.field5168[var22 + 1][var21] == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0) {
                class392.field5229[var26] = var11 + 1;
                class223.field2815[var26] = var12;
                class386.field5168[var22 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class388.field5190[var22 + 1][var21] = var25;
            }
            if (var21 > 0 && class386.field5168[var22][var21 - 1] == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class392.field5229[var26] = var11;
                class223.field2815[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class386.field5168[var22][var21 - 1] = 1;
                class388.field5190[var22][var21 - 1] = var25;
            }
            if (var21 < 127 && class386.field5168[var22][var21 + 1] == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class392.field5229[var26] = var11;
                class223.field2815[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class386.field5168[var22][var21 + 1] = 4;
                class388.field5190[var22][var21 + 1] = var25;
            }
            if (var22 > 0 && var21 > 0 && class386.field5168[var22 - 1][var21 - 1] == 0 && (var19[var23 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class392.field5229[var26] = var11 - 1;
                class223.field2815[var26] = var12 - 1;
                class386.field5168[var22 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class388.field5190[var22 - 1][var21 - 1] = var25;
            }
            if (var22 < 127 && var21 > 0 && class386.field5168[var22 + 1][var21 - 1] == 0 && (var19[var23 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class392.field5229[var26] = var11 + 1;
                class223.field2815[var26] = var12 - 1;
                class386.field5168[var22 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class388.field5190[var22 + 1][var21 - 1] = var25;
            }
            if (var22 > 0 && var21 < 127 && class386.field5168[var22 - 1][var21 + 1] == 0 && (var19[var23 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class392.field5229[var26] = var11 - 1;
                class223.field2815[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class386.field5168[var22 - 1][var21 + 1] = 6;
                class388.field5190[var22 - 1][var21 + 1] = var25;
            }
            if (var22 < 127 && var21 < 127 && class386.field5168[var22 + 1][var21 + 1] == 0 && (var19[var23 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class392.field5229[var26] = var11 + 1;
                class223.field2815[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class386.field5168[var22 + 1][var21 + 1] = 12;
                class388.field5190[var22 + 1][var21 + 1] = var25;
            }
        }
        class633.field8971 = var12;
        class249.field3200 = var11;
        return false;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)Lvfa;")
    public abstract class614 method23(boolean arg0);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
    public static void method521(byte arg0) {
        if (arg0 > -50) {
            method519(37, -127, 108, 3, 90, 112, 17, -126, -20, -103, 29, null, null);
        }
        field861 = null;
        field862 = null;
        field859 = null;
        field860 = null;
        field863 = null;
    }
}
