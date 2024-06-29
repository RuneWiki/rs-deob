import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class527 implements class317 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lkn;")
    public static class530 field7741 = new class530("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!au", name = "e", descriptor = "Ltn;")
    public static class60 field7745 = new class60(50, -1);

    @OriginalMember(owner = "client!au", name = "f", descriptor = "Ltn;")
    public static class60 field7746 = new class60(34, 8);

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
    public static final int method3110(int arg0, int arg1) {
        field7744++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == arg1 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIBIIILmk;III)Z")
    public static final boolean method3111(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class40 arg7, int arg8, int arg9, int arg10) {
        field7742++;
        int var11 = arg5;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        int var16 = arg10 - var14;
        class316.field4592[var13][var14] = 99;
        class458.field6420[var13][var14] = 0;
        if (arg3 > -48) {
            field7745 = null;
        }
        byte var17 = 0;
        int var18 = 0;
        class153.field2208[var17] = arg5;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class160.field2373[var10001] = arg10;
        int[][] var19 = arg7.field443;
        while (var26 != var18) {
            var11 = class153.field2208[var18];
            var12 = class160.field2373[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - arg7.field436;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var12 - arg7.field447;
            if (arg8 == -4) {
                if (arg4 == var11 && arg6 == var12) {
                    class204.field2946 = var12;
                    class144.field1905 = var11;
                    return true;
                }
            } else if (arg8 == -3) {
                if (class510.method3047(arg9, 1, arg6, var11, arg4, arg2, 1, 53, var12)) {
                    class144.field1905 = var11;
                    class204.field2946 = var12;
                    return true;
                }
            } else if (arg8 == -2) {
                if (arg7.method232(var11, 1, arg4, -101, arg6, arg2, var12, 1, arg9, arg1)) {
                    class144.field1905 = var11;
                    class204.field2946 = var12;
                    return true;
                }
            } else if (arg8 == -1) {
                if (arg7.method225(arg2, 1, arg4, (byte) 67, arg6, var12, arg1, var11, arg9)) {
                    class204.field2946 = var12;
                    class144.field1905 = var11;
                    return true;
                }
            } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                if (arg7.method220(var12, 1, arg8, arg0, arg6, 95, arg4, var11)) {
                    class204.field2946 = var12;
                    class144.field1905 = var11;
                    return true;
                }
            } else if (arg7.method222(arg0, -87, arg6, arg4, arg8, 1, var11, var12)) {
                class204.field2946 = var12;
                class144.field1905 = var11;
                return true;
            }
            int var25 = class458.field6420[var21][var22] + 1;
            if (var21 > 0 && class316.field4592[var21 - 1][var22] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class153.field2208[var26] = var11 - 1;
                class160.field2373[var26] = var12;
                class316.field4592[var21 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class458.field6420[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class316.field4592[var21 + 1][var22] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class153.field2208[var26] = var11 + 1;
                class160.field2373[var26] = var12;
                class316.field4592[var21 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class458.field6420[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class316.field4592[var21][var22 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class153.field2208[var26] = var11;
                class160.field2373[var26] = var12 - 1;
                class316.field4592[var21][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class458.field6420[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class316.field4592[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class153.field2208[var26] = var11;
                class160.field2373[var26] = var12 + 1;
                class316.field4592[var21][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class458.field6420[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class316.field4592[var21 - 1][var22 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class153.field2208[var26] = var11 - 1;
                class160.field2373[var26] = var12 - 1;
                class316.field4592[var21 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class458.field6420[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class316.field4592[var21 + 1][var22 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class153.field2208[var26] = var11 + 1;
                class160.field2373[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class316.field4592[var21 + 1][var22 - 1] = 9;
                class458.field6420[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class316.field4592[var21 - 1][var22 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class153.field2208[var26] = var11 - 1;
                class160.field2373[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class316.field4592[var21 - 1][var22 + 1] = 6;
                class458.field6420[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class316.field4592[var21 + 1][var22 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class153.field2208[var26] = var11 + 1;
                class160.field2373[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class316.field4592[var21 + 1][var22 + 1] = 12;
                class458.field6420[var21 + 1][var22 + 1] = var25;
            }
        }
        class204.field2946 = var12;
        class144.field1905 = var11;
        return false;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lmt;[IJI)Ljava/lang/String;")
    public final String method1910(class276 arg0, int[] arg1, long arg2, int arg3) {
        field7743++;
        int var6 = -103 % ((-arg3 - 66) / 43);
        if (class64.field805 == arg0) {
            class500 var7 = class472.field6579.method169(arg1[0], 21830);
            return var7.method2900(15361, (int) arg2);
        } else if (class192.field2732 == arg0 || class23.field297 == arg0) {
            class395 var8 = class344.field5000.method993((int) arg2, true);
            return var8.field5587;
        } else if (class393.field5526 == arg0 || class418.field5890 == arg0 || class141.field1844 == arg0) {
            return class472.field6579.method169(arg1[0], 21830).method2900(15361, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public static void method3112(byte arg0) {
        if (arg0 != -79) {
            field7741 = null;
        }
        field7746 = null;
        field7745 = null;
        field7741 = null;
    }
}
