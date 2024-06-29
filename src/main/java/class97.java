import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class97 extends class194 {

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Lbb;")
    public static class270 field1138 = new class270();

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Lc;")
    public static class436 field1141;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Lok;")
    public static class65 field1143;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method599(boolean arg0) {
        field1143 = null;
        field1141 = null;
        if (!arg0) {
            field1138 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIILg;II)Z")
    public static final boolean method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class366 arg8, int arg9, int arg10) {
        if (arg9 != 127) {
            return true;
        }
        field1140++;
        int var11 = arg0;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        class428.field5847[var13][var14] = 99;
        int var16 = arg1 - var14;
        class402.field5587[var13][var14] = 0;
        byte var17 = 0;
        class11.field135[var17] = arg0;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class261.field3355[var10001] = arg1;
        int[][] var19 = arg8.field4977;
        while (var26 != var18) {
            var11 = class11.field135[var18];
            var12 = class261.field3355[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg8.field4982;
            int var23 = var12 - arg8.field4992;
            var18 = var18 + 1 & 0xFFF;
            if (arg2 == -4) {
                if (arg5 == var11 && arg7 == var12) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class347.method2206(arg5, (byte) -104, var11, 1, arg4, arg10, arg7, var12, 1)) {
                    class150.field1760 = var11;
                    class252.field3300 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg8.method2300(true, arg7, arg5, var11, arg10, 1, arg4, 1, arg3, var12)) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg8.method2312(var12, arg3, 1, arg5, arg4, arg7, var11, -1063950782, arg10)) {
                    class150.field1760 = var11;
                    class252.field3300 = var12;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg8.method2315((byte) 106, arg5, arg2, var12, arg7, 1, arg6, var11)) {
                    class252.field3300 = var12;
                    class150.field1760 = var11;
                    return true;
                }
            } else if (arg8.method2303(arg5, var12, arg2, arg6, 2048, 1, var11, arg7)) {
                class252.field3300 = var12;
                class150.field1760 = var11;
                return true;
            }
            int var25 = class402.field5587[var21][var20] + 1;
            if (var21 > 0 && class428.field5847[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0) {
                class11.field135[var26] = var11 - 1;
                class261.field3355[var26] = var12;
                class428.field5847[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var21 - 1][var20] = var25;
            }
            if (var21 < 127 && class428.field5847[var21 + 1][var20] == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0) {
                class11.field135[var26] = var11 + 1;
                class261.field3355[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var21 + 1][var20] = 8;
                class402.field5587[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class428.field5847[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class11.field135[var26] = var11;
                class261.field3355[var26] = var12 - 1;
                class428.field5847[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var21][var20 - 1] = var25;
            }
            if (var20 < 127 && class428.field5847[var21][var20 + 1] == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class11.field135[var26] = var11;
                class261.field3355[var26] = var12 + 1;
                class428.field5847[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class428.field5847[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class11.field135[var26] = var11 - 1;
                class261.field3355[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var21 - 1][var20 - 1] = 3;
                class402.field5587[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 127 && var20 > 0 && class428.field5847[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class11.field135[var26] = var11 + 1;
                class261.field3355[var26] = var12 - 1;
                class428.field5847[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class402.field5587[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 127 && class428.field5847[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class11.field135[var26] = var11 - 1;
                class261.field3355[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var21 - 1][var20 + 1] = 6;
                class402.field5587[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 127 && var20 < 127 && class428.field5847[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class11.field135[var26] = var11 + 1;
                class261.field3355[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class428.field5847[var21 + 1][var20 + 1] = 12;
                class402.field5587[var21 + 1][var20 + 1] = var25;
            }
        }
        class150.field1760 = var11;
        class252.field3300 = var12;
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int var3 = -116 % ((arg1 - 57) / 46);
        field1142++;
        return class277.field3585;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BI)[B")
    public static final byte[] method601(byte[] arg0, int arg1) {
        field1139++;
        class242 var2 = new class242(arg0);
        if (arg1 != -2) {
            method601((byte[]) null, -69);
        }
        int var3 = var2.method1563(arg1 - 126);
        int var4 = var2.method1576((byte) 127);
        if (var4 < 0 || !(class440.field6073 == 0 || class440.field6073 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1550(var4, 0, (byte) 102, var7);
            return var7;
        } else {
            int var5 = var2.method1576((byte) 124);
            if (var5 < 0 || !(class440.field6073 == 0 || class440.field6073 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class271.method1711(var6, var5, arg0, var4, 9);
            } else {
                class249.field3278.method2319(var2, var6, arg1 - 110);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class97() {
        super(0, true);
    }
}
