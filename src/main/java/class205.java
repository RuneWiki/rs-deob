import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class205 extends class47 {

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "[B")
    public byte[] field3004;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "Z")
    public static boolean field2999 = false;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "Lch;")
    public static class151 field3000 = new class151("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Lap;")
    public static class310 field3003;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "Z")
    public static boolean field3005;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "[[I")
    public static int[][] field3008;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "B")
    public static byte field3006;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "Lue;")
    public static class149 field3009;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "Lir;")
    public static class226 field3001;

    static {
        new class151((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
        field3003 = new class310(4, 7);
        field3005 = false;
        field3008 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(B)V", line = 18)
    public static void method1409(byte arg0) {
        field3003 = null;
        field3001 = null;
        field3008 = null;
        field3000 = null;
        field3009 = null;
        if (arg0 > -65) {
            method1409((byte) 76);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIIIILpf;I)Z", line = 32)
    public static final boolean method1410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class18 arg9, int arg10) {
        field3002++;
        int var11 = arg0;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        class313.field4424[var13][var14] = 99;
        int var16 = arg3 - var14;
        class432.field6113[var13][var14] = 0;
        byte var17 = 0;
        int var18 = arg6;
        class270.field3936[var17] = arg0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class35.field374[var10001] = arg3;
        int[][] var19 = arg9.field176;
        while (var26 != var18) {
            var11 = class270.field3936[var18];
            var12 = class35.field374[var18];
            int var20 = var11 - var15;
            int var21 = var11 - arg9.field182;
            int var22 = var12 - arg9.field187;
            int var23 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == -4) {
                if (arg4 == var11 && arg2 == var12) {
                    class437.field6219 = var11;
                    class341.field4716 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class312.method1987(1, 1, arg8, arg4, (byte) 114, arg10, var12, arg2, var11)) {
                    class437.field6219 = var11;
                    class341.field4716 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg9.method114(arg10, arg2, 1, (byte) -88, 1, arg4, arg1, arg8, var11, var12)) {
                    class437.field6219 = var11;
                    class341.field4716 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg9.method127(arg1, arg4, arg2, arg8, var11, (byte) 6, var12, 1, arg10)) {
                    class341.field4716 = var12;
                    class437.field6219 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg9.method121(arg4, 1, var12, arg7, (byte) -113, var11, arg5, arg2)) {
                    class341.field4716 = var12;
                    class437.field6219 = var11;
                    return true;
                }
            } else if (arg9.method129(var11, 1, arg4, arg2, arg5, -1, var12, arg7)) {
                class437.field6219 = var11;
                class341.field4716 = var12;
                return true;
            }
            int var25 = class432.field6113[var20][var23] + 1;
            if (var20 > 0 && class313.field4424[var20 - 1][var23] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                class270.field3936[var26] = var11 - 1;
                class35.field374[var26] = var12;
                class313.field4424[var20 - 1][var23] = 2;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 - 1][var23] = var25;
            }
            if (var20 < 127 && class313.field4424[var20 + 1][var23] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                class270.field3936[var26] = var11 + 1;
                class35.field374[var26] = var12;
                class313.field4424[var20 + 1][var23] = 8;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 + 1][var23] = var25;
            }
            if (var23 > 0 && class313.field4424[var20][var23 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class270.field3936[var26] = var11;
                class35.field374[var26] = var12 - 1;
                class313.field4424[var20][var23 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20][var23 - 1] = var25;
            }
            if (var23 < 127 && class313.field4424[var20][var23 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class270.field3936[var26] = var11;
                class35.field374[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20][var23 + 1] = 4;
                class432.field6113[var20][var23 + 1] = var25;
            }
            if (var20 > 0 && var23 > 0 && class313.field4424[var20 - 1][var23 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class270.field3936[var26] = var11 - 1;
                class35.field374[var26] = var12 - 1;
                class313.field4424[var20 - 1][var23 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 - 1][var23 - 1] = var25;
            }
            if (var20 < 127 && var23 > 0 && class313.field4424[var20 + 1][var23 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class270.field3936[var26] = var11 + 1;
                class35.field374[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20 + 1][var23 - 1] = 9;
                class432.field6113[var20 + 1][var23 - 1] = var25;
            }
            if (var20 > 0 && var23 < 127 && class313.field4424[var20 - 1][var23 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class270.field3936[var26] = var11 - 1;
                class35.field374[var26] = var12 + 1;
                class313.field4424[var20 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 - 1][var23 + 1] = var25;
            }
            if (var20 < 127 && var23 < 127 && class313.field4424[var20 + 1][var23 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class270.field3936[var26] = var11 + 1;
                class35.field374[var26] = var12 + 1;
                class313.field4424[var20 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 + 1][var23 + 1] = var25;
            }
        }
        class437.field6219 = var11;
        class341.field4716 = var12;
        return false;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "([B)V", line = 287)
    public class205(byte[] arg0) {
        this.field3004 = arg0;
    }
}
