import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class576 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field8096 = class673.method3730(89);

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/lang/String;")
    public String field8104;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public int field8098;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field8097;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public int field8100;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field8101;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Ljava/lang/String;")
    public String field8102;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Ljava/lang/String;")
    public String field8099;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Ljava/lang/String;")
    public String field8094;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Ljava/lang/String;")
    public String field8106;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;I)V")
    public final void method3263(int arg0, String arg1, int arg2, String arg3, String arg4, byte arg5, String arg6, String arg7, int arg8) {
        field8103++;
        this.field8096 = class673.method3730(32);
        this.field8098 = arg0;
        this.field8094 = arg7;
        if (arg5 > -82) {
            return;
        }
        this.field8101 = class564.field7962;
        this.field8104 = arg3;
        this.field8102 = arg1;
        this.field8099 = arg4;
        this.field8097 = arg2;
        this.field8106 = arg6;
        this.field8100 = arg8;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIILcp;II)Z")
    public static final boolean method3264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class674 arg8, int arg9, int arg10) {
        field8105++;
        int var11 = arg4;
        int var12 = arg9;
        byte var13 = 64;
        if (arg10 != -1) {
            field8107 = 76;
        }
        byte var14 = 64;
        int var15 = arg4 - var13;
        int var16 = arg9 - var14;
        class178.field2537[var13][var14] = 99;
        class226.field3183[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class184.field2588[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class416.field6035[var10001] = arg9;
        int[][] var19 = arg8.field9532;
        while (var26 != var18) {
            var11 = class184.field2588[var18];
            var12 = class416.field6035[var18];
            int var20 = var11 - arg8.field9541;
            int var21 = var12 - arg8.field9538;
            int var22 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var12 - var16;
            if (arg3 == -4) {
                if (arg6 == var11 && arg1 == var12) {
                    class107.field1645 = var11;
                    class218.field3056 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class328.method2063(arg2, arg0, 1, var11, var12, arg6, -1, 1, arg1)) {
                    class107.field1645 = var11;
                    class218.field3056 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg8.method3750(1, arg0, arg6, var12, arg1, arg7, var11, 1, arg2, (byte) -110)) {
                    class107.field1645 = var11;
                    class218.field3056 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg8.method3752(-27907, arg1, arg0, arg2, arg6, var12, var11, arg7, 1)) {
                    class107.field1645 = var11;
                    class218.field3056 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg8.method3738(true, var11, arg3, arg5, arg6, var12, 1, arg1)) {
                    class107.field1645 = var11;
                    class218.field3056 = var12;
                    return true;
                }
            } else if (arg8.method3743(1, arg3, var12, (byte) -124, arg6, arg1, arg5, var11)) {
                class107.field1645 = var11;
                class218.field3056 = var12;
                return true;
            }
            int var25 = class226.field3183[var22][var23] + 1;
            if (var22 > 0 && class178.field2537[var22 - 1][var23] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class184.field2588[var26] = var11 - 1;
                class416.field6035[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22 - 1][var23] = 2;
                class226.field3183[var22 - 1][var23] = var25;
            }
            if (var22 < 127 && class178.field2537[var22 + 1][var23] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class184.field2588[var26] = var11 + 1;
                class416.field6035[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22 + 1][var23] = 8;
                class226.field3183[var22 + 1][var23] = var25;
            }
            if (var23 > 0 && class178.field2537[var22][var23 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class184.field2588[var26] = var11;
                class416.field6035[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22][var23 - 1] = 1;
                class226.field3183[var22][var23 - 1] = var25;
            }
            if (var23 < 127 && class178.field2537[var22][var23 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class184.field2588[var26] = var11;
                class416.field6035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22][var23 + 1] = 4;
                class226.field3183[var22][var23 + 1] = var25;
            }
            if (var22 > 0 && var23 > 0 && class178.field2537[var22 - 1][var23 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class184.field2588[var26] = var11 - 1;
                class416.field6035[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22 - 1][var23 - 1] = 3;
                class226.field3183[var22 - 1][var23 - 1] = var25;
            }
            if (var22 < 127 && var23 > 0 && class178.field2537[var22 + 1][var23 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class184.field2588[var26] = var11 + 1;
                class416.field6035[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22 + 1][var23 - 1] = 9;
                class226.field3183[var22 + 1][var23 - 1] = var25;
            }
            if (var22 > 0 && var23 < 127 && class178.field2537[var22 - 1][var23 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class184.field2588[var26] = var11 - 1;
                class416.field6035[var26] = var12 + 1;
                class178.field2537[var22 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class226.field3183[var22 - 1][var23 + 1] = var25;
            }
            if (var22 < 127 && var23 < 127 && class178.field2537[var22 + 1][var23 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class184.field2588[var26] = var11 + 1;
                class416.field6035[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class178.field2537[var22 + 1][var23 + 1] = 12;
                class226.field3183[var22 + 1][var23 + 1] = var25;
            }
        }
        class107.field1645 = var11;
        class218.field3056 = var12;
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class576(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field8104 = arg7;
        this.field8098 = arg1;
        this.field8097 = arg6;
        this.field8100 = arg0;
        this.field8101 = class564.field7962;
        this.field8102 = arg4;
        this.field8099 = arg3;
        this.field8094 = arg2;
        this.field8106 = arg5;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Z")
    public static final boolean method3265(int arg0, int arg1) {
        field8095++;
        int var2 = 40 / ((arg1 + 44) / 34);
        return arg0 == 9 || arg0 == 21 || arg0 == 1010 || arg0 == 23 || arg0 == 50;
    }
}
