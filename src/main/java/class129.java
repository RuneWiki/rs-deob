import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class129 {

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1566 = -1;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 4)
    public static final void method838(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class691.field9583[var1] = null;
        }
        if (arg0 != 8892) {
            method838(-63);
        }
        field1563++;
        class461.field5749 = 0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)I", line = 25)
    public final int method839(boolean arg0) {
        field1562++;
        return arg0 ? this.field1564 : -14;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIIIIIILld;I)Z", line = 37)
    public static final boolean method840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class158 arg9, int arg10) {
        field1561++;
        int var11 = arg1;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg1 - var13;
        class497.field6221[var13][var14] = 99;
        int var16 = arg2 - var14;
        class227.field2937[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class705.field9867[var17] = arg1;
        byte var10001 = var17;
        int var27 = var17 + 1;
        class144.field1739[var10001] = arg2;
        int[][] var19 = arg9.field1875;
        while (var27 != var18) {
            var12 = class144.field1739[var18];
            var11 = class705.field9867[var18];
            int var21 = var11 - var15;
            int var22 = var11 - arg9.field1872;
            int var23 = var12 - var16;
            int var24 = var12 - arg9.field1864;
            var18 = var18 + 1 & 0xFFF;
            if (arg3 == -4) {
                if (arg4 == var11 && arg8 == var12) {
                    class189.field2245 = var11;
                    class20.field206 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class500.method2723(arg6, arg4, arg5, var12, 1, -96, 1, var11, arg8)) {
                    class20.field206 = var12;
                    class189.field2245 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg9.method975(1, arg7, 1, arg8, 12150, arg6, arg4, var11, arg5, var12)) {
                    class189.field2245 = var11;
                    class20.field206 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg9.method969(var11, arg7, arg6, -110, arg8, arg4, arg5, 1, var12)) {
                    class20.field206 = var12;
                    class189.field2245 = var11;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg9.method970(var12, arg8, 1, (byte) 96, arg10, var11, arg4, arg3)) {
                    class20.field206 = var12;
                    class189.field2245 = var11;
                    return true;
                }
            } else if (arg9.method971(var12, arg10, 1, arg3, arg4, arg8, (byte) -128, var11)) {
                class189.field2245 = var11;
                class20.field206 = var12;
                return true;
            }
            int var26 = class227.field2937[var21][var23] + 1;
            if (var21 > 0 && class497.field6221[var21 - 1][var23] == 0 && (var19[var22 - 1][var24] & 0x42240000) == 0) {
                class705.field9867[var27] = var11 - 1;
                class144.field1739[var27] = var12;
                class497.field6221[var21 - 1][var23] = 2;
                var27 = var27 + 1 & 0xFFF;
                class227.field2937[var21 - 1][var23] = var26;
            }
            if (var21 < 127 && class497.field6221[var21 + 1][var23] == 0 && (var19[var22 + 1][var24] & 0x60240000) == 0) {
                class705.field9867[var27] = var11 + 1;
                class144.field1739[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class497.field6221[var21 + 1][var23] = 8;
                class227.field2937[var21 + 1][var23] = var26;
            }
            if (var23 > 0 && class497.field6221[var21][var23 - 1] == 0 && (var19[var22][var24 - 1] & 0x40A40000) == 0) {
                class705.field9867[var27] = var11;
                class144.field1739[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class497.field6221[var21][var23 - 1] = 1;
                class227.field2937[var21][var23 - 1] = var26;
            }
            if (var23 < 127 && class497.field6221[var21][var23 + 1] == 0 && (var19[var22][var24 + 1] & 0x48240000) == 0) {
                class705.field9867[var27] = var11;
                class144.field1739[var27] = var12 + 1;
                class497.field6221[var21][var23 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class227.field2937[var21][var23 + 1] = var26;
            }
            if (var21 > 0 && var23 > 0 && class497.field6221[var21 - 1][var23 - 1] == 0 && (var19[var22 - 1][var24 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var24] & 0x42240000) == 0 && (var19[var22][var24 - 1] & 0x40A40000) == 0) {
                class705.field9867[var27] = var11 - 1;
                class144.field1739[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class497.field6221[var21 - 1][var23 - 1] = 3;
                class227.field2937[var21 - 1][var23 - 1] = var26;
            }
            if (var21 < 127 && var23 > 0 && class497.field6221[var21 + 1][var23 - 1] == 0 && (var19[var22 + 1][var24 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var24] & 0x60240000) == 0 && (var19[var22][var24 - 1] & 0x40A40000) == 0) {
                class705.field9867[var27] = var11 + 1;
                class144.field1739[var27] = var12 - 1;
                class497.field6221[var21 + 1][var23 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class227.field2937[var21 + 1][var23 - 1] = var26;
            }
            if (var21 > 0 && var23 < 127 && class497.field6221[var21 - 1][var23 + 1] == 0 && (var19[var22 - 1][var24 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var24] & 0x42240000) == 0 && (var19[var22][var24 + 1] & 0x48240000) == 0) {
                class705.field9867[var27] = var11 - 1;
                class144.field1739[var27] = var12 + 1;
                class497.field6221[var21 - 1][var23 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class227.field2937[var21 - 1][var23 + 1] = var26;
            }
            if (var21 < 127 && var23 < 127 && class497.field6221[var21 + 1][var23 + 1] == 0 && (var19[var22 + 1][var24 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var24] & 0x60240000) == 0 && (var19[var22][var24 + 1] & 0x48240000) == 0) {
                class705.field9867[var27] = var11 + 1;
                class144.field1739[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class497.field6221[var21 + 1][var23 + 1] = 12;
                class227.field2937[var21 + 1][var23 + 1] = var26;
            }
        }
        class189.field2245 = var11;
        class20.field206 = var12;
        int var20 = 50 % ((arg0 - 71) / 41);
        return false;
    }

    @OriginalMember(owner = "client!ls", name = "toString", descriptor = "()Ljava/lang/String;", line = 284)
    public final String toString() {
        field1565++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 298)
    public class129(String arg0, int arg1) {
        this.field1564 = arg1;
    }
}
