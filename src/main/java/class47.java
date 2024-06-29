import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class47 {

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public int field690 = 1;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[S")
    public static short[] field691 = new short[256];

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "Lus;")
    public static class328 field692 = new class328(52, 5);

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "C")
    public char field688;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field692 = null;
        field691 = null;
        if (arg0 != 4) {
            field692 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILtn;)V")
    public final void method384(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                field694++;
                if (arg0 < 42) {
                    this.field690 = 37;
                    return;
                }
                return;
            }
            this.method387(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZBI)V")
    public static final void method385(boolean arg0, byte arg1, int arg2) {
        field695++;
        class464 var3 = class175.method1082(arg0, arg2, (byte) 20);
        if (var3 != null) {
            var3.method3426((byte) -86);
            int var4 = 56 % ((-arg1 - 49) / 50);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILda;IILjava/lang/String;ILtba;Laa;ILgaa;II)V")
    public static final void method386(int arg0, class423 arg1, int arg2, int arg3, String arg4, int arg5, class56 arg6, class81 arg7, int arg8, class460 arg9, int arg10, int arg11) {
        field687++;
        int var12;
        if (class276.field3497 == 4) {
            var12 = (int) class748.field10471 & 0x3FFF;
        } else {
            var12 = (int) class748.field10471 + class10.field112 & 0x3FFF;
        }
        int var13 = Math.max(arg9.field6566 / 2, arg9.field6514 / 2) + 10;
        int var14 = arg2 * arg2 + (arg11 * arg11);
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class138.field1644[var12];
        int var16 = class138.field1645[var12];
        if (class276.field3497 != 4) {
            var15 = var15 * 256 / (class3.field16 + 256);
            var16 = var16 * 256 / (class3.field16 + 256);
        }
        if (arg8 != 7417) {
            method385(true, (byte) 124, 119);
        }
        int var17 = arg2 * var16 + arg11 * var15 >> 14;
        int var18 = arg11 * var16 - (arg2 * var15) >> 14;
        int var19 = arg6.method447(null, (byte) 64, 100, arg4);
        int var20 = var17 - var19 / 2;
        int var21 = arg6.method450(null, arg4, 100, (byte) -34, 0);
        if (var20 >= -arg9.field6566 && arg9.field6566 >= var20 && var18 >= -arg9.field6514 && var18 <= arg9.field6514) {
            arg1.method2523(arg9.field6566 / 2 + var20 + arg10, var19, 0, 0, arg7, 50, arg0, arg4, null, 0, null, arg9.field6514 / 2 + arg5 - var18 - var21 - arg3, arg8 ^ 0x5894, 1, arg10, arg5);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ltn;ZI)V")
    private final void method387(class179 arg0, boolean arg1, int arg2) {
        field693++;
        if (arg1) {
            return;
        }
        if (arg2 == 1) {
            this.field688 = class219.method1370(arg0.method1133(8), -19);
        } else if (arg2 == 2) {
            this.field690 = 0;
        }
    }
}
