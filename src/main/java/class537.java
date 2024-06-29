import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class537 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Lraa;")
    public static final class508 method3191(int arg0, int arg1) {
        field7422++;
        class508 var2 = (class508) class194.field2417.method1800(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class540.field7466.method1849(0, (byte) -9, arg1);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class508 var4;
        try {
            if (arg0 != -2) {
                field7425 = -51;
            }
            var4 = class35.method282(var3, 0);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg1);
        }
        class194.field2417.method1799(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIILsn;IIIIIIZ)Z")
    public static final boolean method3192(int arg0, int arg1, int arg2, class739 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field7423++;
        int var11 = arg8;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        int var16 = arg2 - var14;
        class135.field1727[var13][var14] = 99;
        class666.field9358[var13][var14] = 0;
        if (!arg10) {
            method3194((byte) -123);
        }
        byte var17 = 0;
        class723.field10017[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class663.field9330[var10001] = arg2;
        int[][] var19 = arg3.field10184;
        while (var26 != var18) {
            var11 = class723.field10017[var18];
            var12 = class663.field9330[var18];
            int var20 = var11 - var15;
            int var21 = var11 - arg3.field10176;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - arg3.field10196;
            int var23 = var12 - var16;
            if (arg9 == -4) {
                if (arg6 == var11 && arg7 == var12) {
                    class386.field5509 = var12;
                    class730.field10104 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class615.method3550(1, var12, arg7, 80, arg4, 1, arg6, arg0, var11)) {
                    class386.field5509 = var12;
                    class730.field10104 = var11;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg3.method4093(arg7, arg0, 1, var11, arg5, 1, (byte) -33, arg6, arg4, var12)) {
                    class730.field10104 = var11;
                    class386.field5509 = var12;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg3.method4097(var12, var11, arg4, 1, arg7, 85, arg0, arg5, arg6)) {
                    class386.field5509 = var12;
                    class730.field10104 = var11;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg3.method4090(arg7, var12, arg1, 1, arg9, 32768, var11, arg6)) {
                    class386.field5509 = var12;
                    class730.field10104 = var11;
                    return true;
                }
            } else if (arg3.method4087(1, var11, arg9, arg6, var12, arg1, (byte) 73, arg7)) {
                class730.field10104 = var11;
                class386.field5509 = var12;
                return true;
            }
            int var25 = class666.field9358[var20][var23] + 1;
            if (var20 > 0 && class135.field1727[var20 - 1][var23] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                class723.field10017[var26] = var11 - 1;
                class663.field9330[var26] = var12;
                class135.field1727[var20 - 1][var23] = 2;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var20 - 1][var23] = var25;
            }
            if (var20 < 127 && class135.field1727[var20 + 1][var23] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                class723.field10017[var26] = var11 + 1;
                class663.field9330[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var20 + 1][var23] = 8;
                class666.field9358[var20 + 1][var23] = var25;
            }
            if (var23 > 0 && class135.field1727[var20][var23 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class723.field10017[var26] = var11;
                class663.field9330[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var20][var23 - 1] = 1;
                class666.field9358[var20][var23 - 1] = var25;
            }
            if (var23 < 127 && class135.field1727[var20][var23 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class723.field10017[var26] = var11;
                class663.field9330[var26] = var12 + 1;
                class135.field1727[var20][var23 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class666.field9358[var20][var23 + 1] = var25;
            }
            if (var20 > 0 && var23 > 0 && class135.field1727[var20 - 1][var23 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class723.field10017[var26] = var11 - 1;
                class663.field9330[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var20 - 1][var23 - 1] = 3;
                class666.field9358[var20 - 1][var23 - 1] = var25;
            }
            if (var20 < 127 && var23 > 0 && class135.field1727[var20 + 1][var23 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class723.field10017[var26] = var11 + 1;
                class663.field9330[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var20 + 1][var23 - 1] = 9;
                class666.field9358[var20 + 1][var23 - 1] = var25;
            }
            if (var20 > 0 && var23 < 127 && class135.field1727[var20 - 1][var23 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class723.field10017[var26] = var11 - 1;
                class663.field9330[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var20 - 1][var23 + 1] = 6;
                class666.field9358[var20 - 1][var23 + 1] = var25;
            }
            if (var20 < 127 && var23 < 127 && class135.field1727[var20 + 1][var23 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class723.field10017[var26] = var11 + 1;
                class663.field9330[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class135.field1727[var20 + 1][var23 + 1] = 12;
                class666.field9358[var20 + 1][var23 + 1] = var25;
            }
        }
        class386.field5509 = var12;
        class730.field10104 = var11;
        return false;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static final void method3193(int arg0) throws class357 {
        field7428++;
        if (class166.field2118 == 1) {
            class377.field5424.method157(class517.field7135, class783.field10753);
        } else {
            class377.field5424.method157(0, 0);
        }
        if (arg0 != 1) {
            field7424 = -89;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)Liaa;")
    public static final class116 method3194(byte arg0) {
        field7426++;
        if (arg0 >= -11) {
            return null;
        } else if (class408.field5743 == 0) {
            return new class116();
        } else {
            return class533.field7335[--class408.field5743];
        }
    }
}
