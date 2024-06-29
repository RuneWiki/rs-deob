import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class185 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[Ld;")
    public static class176[] field2270;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[[[I")
    public static int[][][] field2273;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static void method1188(boolean arg0) {
        if (arg0) {
            field2273 = null;
        }
        field2270 = null;
        field2273 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
    public static final int method1189(int arg0) {
        field2271++;
        int var1 = class119.field1526.method224(arg0 ^ 0x74BF);
        if ((class380.field5452.length - 1) > var1) {
            class119.field1526 = class380.field5452[var1 + 1];
        }
        if (arg0 != -3) {
            method1189(49);
        }
        return 100;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILsl;IIIIIIIII)Z")
    public static final boolean method1190(int arg0, class245 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2272++;
        int var11 = arg6;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        int var16 = arg5 - var14;
        class98.field1203[var13][var14] = 99;
        class235.field3070[var13][var14] = 0;
        byte var17 = 0;
        class63.field859[var17] = arg6;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class303.field4035[var10001] = arg5;
        int[][] var19 = arg1.field3300;
        while (var26 != var18) {
            var12 = class303.field4035[var18];
            var11 = class63.field859[var18];
            int var20 = var12 - arg1.field3308;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg1.field3312;
            int var23 = var11 - var15;
            if (arg7 == -4) {
                if (arg9 == var11 && arg10 == var12) {
                    class125.field1609 = var12;
                    class5.field46 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class609.method3356(1, arg9, arg8, var12, arg10, var11, arg3 - 3968, arg2, 1)) {
                    class125.field1609 = var12;
                    class5.field46 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg1.method1513(1, var11, arg10, arg8, arg2, arg9, 1, arg0, (byte) -101, var12)) {
                    class5.field46 = var11;
                    class125.field1609 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg1.method1499(arg10, 1, (byte) -42, arg2, var11, arg9, var12, arg8, arg0)) {
                    class125.field1609 = var12;
                    class5.field46 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg1.method1497(arg10, 1, arg4, arg9, (byte) 12, arg7, var12, var11)) {
                    class125.field1609 = var12;
                    class5.field46 = var11;
                    return true;
                }
            } else if (arg1.method1511(arg4, arg3 ^ 0xFAD, arg10, 1, arg9, arg7, var11, var12)) {
                class5.field46 = var11;
                class125.field1609 = var12;
                return true;
            }
            int var25 = class235.field3070[var23][var21] + 1;
            if (var23 > 0 && class98.field1203[var23 - 1][var21] == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0) {
                class63.field859[var26] = var11 - 1;
                class303.field4035[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var23 - 1][var21] = 2;
                class235.field3070[var23 - 1][var21] = var25;
            }
            if (var23 < 127 && class98.field1203[var23 + 1][var21] == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0) {
                class63.field859[var26] = var11 + 1;
                class303.field4035[var26] = var12;
                class98.field1203[var23 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class235.field3070[var23 + 1][var21] = var25;
            }
            if (var21 > 0 && class98.field1203[var23][var21 - 1] == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class63.field859[var26] = var11;
                class303.field4035[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var23][var21 - 1] = 1;
                class235.field3070[var23][var21 - 1] = var25;
            }
            if (var21 < 127 && class98.field1203[var23][var21 + 1] == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class63.field859[var26] = var11;
                class303.field4035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var23][var21 + 1] = 4;
                class235.field3070[var23][var21 + 1] = var25;
            }
            if (var23 > 0 && var21 > 0 && class98.field1203[var23 - 1][var21 - 1] == 0 && (var19[var22 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class63.field859[var26] = var11 - 1;
                class303.field4035[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var23 - 1][var21 - 1] = 3;
                class235.field3070[var23 - 1][var21 - 1] = var25;
            }
            if (var23 < 127 && var21 > 0 && class98.field1203[var23 + 1][var21 - 1] == 0 && (var19[var22 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 - 1] & 0x40A40000) == 0) {
                class63.field859[var26] = var11 + 1;
                class303.field4035[var26] = var12 - 1;
                class98.field1203[var23 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class235.field3070[var23 + 1][var21 - 1] = var25;
            }
            if (var23 > 0 && var21 < 127 && class98.field1203[var23 - 1][var21 + 1] == 0 && (var19[var22 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var20] & 0x42240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class63.field859[var26] = var11 - 1;
                class303.field4035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var23 - 1][var21 + 1] = 6;
                class235.field3070[var23 - 1][var21 + 1] = var25;
            }
            if (var23 < 127 && var21 < 127 && class98.field1203[var23 + 1][var21 + 1] == 0 && (var19[var22 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var20] & 0x60240000) == 0 && (var19[var22][var20 + 1] & 0x48240000) == 0) {
                class63.field859[var26] = var11 + 1;
                class303.field4035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class98.field1203[var23 + 1][var21 + 1] = 12;
                class235.field3070[var23 + 1][var21 + 1] = var25;
            }
        }
        class125.field1609 = var12;
        class5.field46 = var11;
        if (arg3 == 4095) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([BBI)I")
    public static final int method1191(byte[] arg0, byte arg1, int arg2) {
        field2274++;
        int var3 = -112 % ((55 - arg1) / 63);
        return class275.method1681(0, arg0, arg2, (byte) 100);
    }
}
