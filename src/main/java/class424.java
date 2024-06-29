import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class424 extends class376 {

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljava/lang/String;")
    public String field6098;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Ljava/lang/String;")
    public static String field6096 = "red:";

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "J")
    public static long field6097 = 0L;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
    public static void method2675(int arg0) {
        int var1 = -45 / ((arg0 - 75) / 43);
        field6096 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIILie;III)Z")
    public static final boolean method2676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class4 arg7, int arg8, int arg9, int arg10) {
        field6095++;
        int var11 = arg8;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        class395.field5777[var13][var14] = 99;
        int var16 = arg2 - var14;
        class137.field1949[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class170.field2425[var17] = arg8;
        int var19 = 100 / ((34 - arg9) / 32);
        byte var10001 = var17;
        int var27 = var17 + 1;
        class189.field2626[var10001] = arg2;
        int[][] var20 = arg7.field53;
        while (var27 != var18) {
            var11 = class170.field2425[var18];
            var12 = class189.field2626[var18];
            int var21 = var12 - arg7.field55;
            int var22 = var11 - var15;
            int var23 = var11 - arg7.field62;
            int var24 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            if (arg3 == -4) {
                if (arg6 == var11 && arg10 == var12) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class414.method2652(arg4, -76, var11, arg10, 1, arg1, arg6, var12, 1)) {
                    class396.field5784 = var12;
                    class318.field4372 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg7.method26(var11, arg6, 1, arg1, var12, 1, arg0, arg4, arg10, true)) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg7.method25(var11, arg1, var12, 89, arg4, arg0, 1, arg6, arg10)) {
                    class396.field5784 = var12;
                    class318.field4372 = var11;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg7.method37(var12, arg3, arg10, var11, arg5, true, 1, arg6)) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg7.method34(1, var12, arg3, arg6, arg10, arg5, 92, var11)) {
                class318.field4372 = var11;
                class396.field5784 = var12;
                return true;
            }
            int var26 = class137.field1949[var22][var24] + 1;
            if (var22 > 0 && class395.field5777[var22 - 1][var24] == 0 && (var20[var23 - 1][var21] & 0x42240000) == 0) {
                class170.field2425[var27] = var11 - 1;
                class189.field2626[var27] = var12;
                class395.field5777[var22 - 1][var24] = 2;
                var27 = var27 + 1 & 0xFFF;
                class137.field1949[var22 - 1][var24] = var26;
            }
            if (var22 < 127 && class395.field5777[var22 + 1][var24] == 0 && (var20[var23 + 1][var21] & 0x60240000) == 0) {
                class170.field2425[var27] = var11 + 1;
                class189.field2626[var27] = var12;
                class395.field5777[var22 + 1][var24] = 8;
                var27 = var27 + 1 & 0xFFF;
                class137.field1949[var22 + 1][var24] = var26;
            }
            if (var24 > 0 && class395.field5777[var22][var24 - 1] == 0 && (var20[var23][var21 - 1] & 0x40A40000) == 0) {
                class170.field2425[var27] = var11;
                class189.field2626[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class395.field5777[var22][var24 - 1] = 1;
                class137.field1949[var22][var24 - 1] = var26;
            }
            if (var24 < 127 && class395.field5777[var22][var24 + 1] == 0 && (var20[var23][var21 + 1] & 0x48240000) == 0) {
                class170.field2425[var27] = var11;
                class189.field2626[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class395.field5777[var22][var24 + 1] = 4;
                class137.field1949[var22][var24 + 1] = var26;
            }
            if (var22 > 0 && var24 > 0 && class395.field5777[var22 - 1][var24 - 1] == 0 && (var20[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var20[var23 - 1][var21] & 0x42240000) == 0 && (var20[var23][var21 - 1] & 0x40A40000) == 0) {
                class170.field2425[var27] = var11 - 1;
                class189.field2626[var27] = var12 - 1;
                class395.field5777[var22 - 1][var24 - 1] = 3;
                var27 = var27 + 1 & 0xFFF;
                class137.field1949[var22 - 1][var24 - 1] = var26;
            }
            if (var22 < 127 && var24 > 0 && class395.field5777[var22 + 1][var24 - 1] == 0 && (var20[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var20[var23 + 1][var21] & 0x60240000) == 0 && (var20[var23][var21 - 1] & 0x40A40000) == 0) {
                class170.field2425[var27] = var11 + 1;
                class189.field2626[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class395.field5777[var22 + 1][var24 - 1] = 9;
                class137.field1949[var22 + 1][var24 - 1] = var26;
            }
            if (var22 > 0 && var24 < 127 && class395.field5777[var22 - 1][var24 + 1] == 0 && (var20[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var20[var23 - 1][var21] & 0x42240000) == 0 && (var20[var23][var21 + 1] & 0x48240000) == 0) {
                class170.field2425[var27] = var11 - 1;
                class189.field2626[var27] = var12 + 1;
                class395.field5777[var22 - 1][var24 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class137.field1949[var22 - 1][var24 + 1] = var26;
            }
            if (var22 < 127 && var24 < 127 && class395.field5777[var22 + 1][var24 + 1] == 0 && (var20[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var20[var23 + 1][var21] & 0x60240000) == 0 && (var20[var23][var21 + 1] & 0x48240000) == 0) {
                class170.field2425[var27] = var11 + 1;
                class189.field2626[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class395.field5777[var22 + 1][var24 + 1] = 12;
                class137.field1949[var22 + 1][var24 + 1] = var26;
            }
        }
        class318.field4372 = var11;
        class396.field5784 = var12;
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class424() {
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class424(String arg0) {
        this.field6098 = arg0;
    }
}
