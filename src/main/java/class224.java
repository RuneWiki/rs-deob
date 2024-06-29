import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class224 extends class79 {

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Z")
    public static boolean field3598 = true;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "Lck;")
    public static class119 field3605 = class298.method1987((byte) 69, " loggt sich ein)3");

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "Lck;")
    private static class119 field3602 = class298.method1987((byte) 111, "purple:");

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lck;")
    public static class119 field3595 = field3602;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Lck;")
    public static class119 field3597 = field3602;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "B")
    public static byte field3603;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V", line = 5)
    public static void method1424(boolean arg0) {
        field3595 = null;
        field3602 = null;
        field3597 = null;
        if (!arg0) {
            method1426(54, (class266[]) null, -35, -109, (byte[]) null, -74, 32, true, -123, -43, 102);
        }
        field3605 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lva;I)V", line = 26)
    public static final void method1425(class36 arg0, int arg1) {
        class163.field2577 = arg0.method285(class119.field1839, true);
        field3596++;
        int var2 = -20 / ((arg1 + 45) / 45);
        class117.field1770 = arg0.method285(class4.field116, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[Lnc;II[BIIZIII)V", line = 42)
    public static final void method1426(int arg0, class266[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3593++;
        if (arg10 != -19257) {
            field3597 = (class119) null;
        }
        class3 var11 = new class3(arg4);
        int var12 = -1;
        while (true) {
            int var13 = var11.method17(true);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method75(arg10 ^ 0x34C7);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method64((byte) -93);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg3 == var18 && arg9 <= var17 && arg9 + 8 > var17 && arg0 <= var16 && var16 < (arg0 + 8)) {
                    class291 var22 = class291.method1939(0, var12);
                    int var23 = class154.method982(var16 & 0x7, arg8, var22.field4785, 123, var22.field4812, var20, var17 & 0x7) + arg6;
                    int var24 = arg5 + class253.method1628(var22.field4785, var16 & 0x7, var22.field4812, var17 & 0x7, var20, 83, arg8);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class266 var25 = null;
                        if (!arg7) {
                            int var26 = arg2;
                            if ((class111.field1707[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg1[var26];
                            }
                        }
                        class3.method65(23421, var21, var23, var12, var20 + arg8 & 0x3, var24, !arg7, arg2, arg7, arg2, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 121)
    public static final void method1427(int arg0) {
        field3600++;
        class277.field4550.method486((byte) 93);
        if (arg0 != 23263) {
            field3595 = (class119) null;
        }
    }
}
