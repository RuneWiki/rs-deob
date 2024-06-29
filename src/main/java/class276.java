import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class276 extends class406 {

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
    public static int[] field3916 = new int[50];

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Lon;")
    public static class184 field3921 = null;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "[I")
    public static int[] field3927 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field3926 = -1;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3919;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "[[[Lak;")
    public static class193[][][] field3922;

    static {
        new class362("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z", line = 13)
    public static final boolean method1824(int arg0) {
        if (arg0 >= -9) {
            method1829(-14, 29, -109);
        }
        field3923++;
        return class208.field2958 > 0;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V", line = 35)
    public static void method1826(int arg0) {
        field3919 = null;
        if (arg0 != 0) {
            method1824(2);
        }
        field3927 = null;
        field3921 = null;
        field3922 = null;
        field3916 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILp;IIIIB)Z", line = 52)
    public static final boolean method1827(int arg0, int arg1, int arg2, int arg3, int arg4, class119 arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field3920++;
        int var11 = arg7;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class75.field887[var13][var14] = 99;
        int var16 = arg4 - var14;
        class352.field4970[var13][var14] = 0;
        byte var17 = 0;
        class297.field4155[var17] = arg7;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class327.field4648[var10001] = arg4;
        int[][] var19 = arg5.field1468;
        if (arg10 < 30) {
            field3922 = null;
        }
        while (var26 != var18) {
            var11 = class297.field4155[var18];
            var12 = class327.field4648[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg5.field1455;
            int var23 = var12 - arg5.field1466;
            if (arg9 == -4) {
                if (arg3 == var11 && arg2 == var12) {
                    class452.field6462 = var11;
                    class260.field3712 = var12;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class40.method240(arg8, var12, 2, arg3, 0, arg0, 2, var11, arg2)) {
                    class452.field6462 = var11;
                    class260.field3712 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg5.method738(arg0, arg6, arg8, 2, 1180666916, arg3, var12, 2, var11, arg2)) {
                    class260.field3712 = var12;
                    class452.field6462 = var11;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg5.method743(108, arg6, arg3, arg8, arg0, 2, var11, var12, arg2)) {
                    class260.field3712 = var12;
                    class452.field6462 = var11;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg5.method745(var11, var12, arg2, 2, arg3, arg9, 421, arg1)) {
                    class260.field3712 = var12;
                    class452.field6462 = var11;
                    return true;
                }
            } else if (arg5.method740(arg2, var12, 8192, arg9, arg3, 2, var11, arg1)) {
                class452.field6462 = var11;
                class260.field3712 = var12;
                return true;
            }
            int var25 = class352.field4970[var21][var20] + 1;
            if (var21 > 0 && class75.field887[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class297.field4155[var26] = var11 - 1;
                class327.field4648[var26] = var12;
                class75.field887[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class75.field887[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class297.field4155[var26] = var11 + 1;
                class327.field4648[var26] = var12;
                class75.field887[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class75.field887[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class297.field4155[var26] = var11;
                class327.field4648[var26] = var12 - 1;
                class75.field887[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class75.field887[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class297.field4155[var26] = var11;
                class327.field4648[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var21][var20 + 1] = 4;
                class352.field4970[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class75.field887[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class297.field4155[var26] = var11 - 1;
                class327.field4648[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var21 - 1][var20 - 1] = 3;
                class352.field4970[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class75.field887[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class297.field4155[var26] = var11 + 1;
                class327.field4648[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var21 + 1][var20 - 1] = 9;
                class352.field4970[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class75.field887[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class297.field4155[var26] = var11 - 1;
                class327.field4648[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class75.field887[var21 - 1][var20 + 1] = 6;
                class352.field4970[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class75.field887[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class297.field4155[var26] = var11 + 1;
                class327.field4648[var26] = var12 + 1;
                class75.field887[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class352.field4970[var21 + 1][var20 + 1] = var25;
            }
        }
        class452.field6462 = var11;
        class260.field3712 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I", line = 412)
    public static final int method1829(int arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        field3924++;
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg0 == 0 ? arg2 : -80;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)I")
    public abstract int method1823(byte arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)J")
    public abstract long method1825(byte arg0);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
    public abstract int method1828(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
    public abstract int method1830(int arg0);
}
