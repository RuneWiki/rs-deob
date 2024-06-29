import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lkd;")
    private static class73 field626 = class126.method1070((byte) -66, "Unable to connect)3");

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lkd;")
    public static class73 field623 = field626;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lkd;")
    public static class73 field628 = field626;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lkd;")
    public static class73 field633 = class126.method1070((byte) -66, " <col=ffffff>(X");

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lkd;")
    private static class73 field636 = class126.method1070((byte) -66, "Loaded input handler");

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field632 = 2301979;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lkd;")
    private static class73 field638 = class126.method1070((byte) -66, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lkd;")
    public static class73 field640 = field636;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lkd;")
    public static class73 field643 = class126.method1070((byte) -66, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lkd;")
    public static class73 field637 = class126.method1070((byte) -66, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lkd;")
    public static class73 field644 = field638;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lbc;")
    public static class11 field625;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lde;")
    public static class27 field635;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
    public static int[] field641;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "[I")
    public static int[] field642;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method188(byte arg0) {
        field635 = null;
        field638 = null;
        field643 = null;
        field644 = null;
        field626 = null;
        field642 = null;
        if (arg0 != -14) {
            return;
        }
        field625 = null;
        field636 = null;
        field633 = null;
        field623 = null;
        field637 = null;
        field641 = null;
        field628 = null;
        field640 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILb;IIIII[Lge;[BII)V")
    public static final void method189(int arg0, class8 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class47[] arg7, byte[] arg8, int arg9, int arg10) {
        if (arg5 > -89) {
            field636 = null;
        }
        field624++;
        class114 var11 = new class114(arg8);
        int var12 = -1;
        while (true) {
            int var13 = var11.method963((byte) -116);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method963((byte) -116);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var11.method957((byte) 46);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg6 == var17 && arg4 <= var18 && arg4 + 8 > var18 && arg9 <= var16 && arg9 + 8 > var16) {
                    class149 var22 = class122.method1045(31, var12);
                    int var23 = arg10 + class20.method158(var16 & 0x7, (byte) -37, var21, var22.field3643, arg0, var22.field3660, var18 & 0x7);
                    int var24 = class50.method404(var22.field3643, var22.field3660, var21, arg0, -87, var18 & 0x7, var16 & 0x7) + arg3;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg2;
                        if ((class55.field1482[1][var23][var24] & 0x2) == 2) {
                            var25 = arg2 - 1;
                        }
                        class47 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg7[var25];
                        }
                        class129.method1083(arg2, var24, var20, arg1, arg0 + var21 & 0x3, var12, var26, var23, (byte) -116);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method190(int arg0, String arg1) throws ClassNotFoundException {
        field631++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0 < 117) {
                field642 = null;
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }
}
