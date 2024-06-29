import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class60 extends class334 {

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Lpd;")
    public class441 field948;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "Lbi;")
    public static class104 field949 = new class104(74, 8);

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[Lch;")
    public static class169[] field950;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILgi;ZILta;ILjava/lang/String;Lla;IIILaq;)V")
    public static final void method449(int arg0, class437 arg1, boolean arg2, int arg3, class453 arg4, int arg5, String arg6, class299 arg7, int arg8, int arg9, int arg10, class340 arg11) {
        field947++;
        int var12;
        if (class334.field5222 == 4) {
            var12 = (int) class388.field5918 & 0x3FFF;
        } else {
            var12 = (int) class388.field5918 + class386.field5903 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field6615 / 2, arg1.field6730 / 2) + 10;
        int var14 = arg3 * arg3 + (arg0 * arg0);
        if (var14 > var13 * var13) {
            return;
        }
        if (arg2) {
            method449(-36, null, false, 37, null, 124, null, null, 26, -83, 57, null);
        }
        int var15 = class147.field1988[var12];
        int var16 = class147.field1986[var12];
        if (class334.field5222 != 4) {
            var16 = var16 * 256 / (class326.field5126 + 256);
            var15 = var15 * 256 / (class326.field5126 + 256);
        }
        int var17 = arg0 * var15 + (arg3 * var16) >> 15;
        int var18 = arg0 * var16 - arg3 * var15 >> 15;
        int var19 = arg11.method2254(null, 100, arg6, 126);
        int var20 = var17 - var19 / 2;
        int var21 = arg11.method2253(arg6, null, 100, 0, true);
        if (var20 >= (-arg1.field6615) && var20 <= arg1.field6615 && -arg1.field6730 <= var18 && var18 <= arg1.field6730) {
            arg7.method2014(-117, 50, 1, arg10, var19, arg1.field6615 / 2 + arg8 + var20, arg4, 0, null, 0, null, arg6, 0, arg1.field6730 / 2 + arg5 - var18 - (arg9 - -var21), arg8, arg5);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lpd;)V")
    public class60(class441 arg0) {
        this.field948 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        field949 = null;
        field950 = null;
        if (arg0 >= -29) {
            field950 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)Z")
    public static final boolean method451(int arg0, int arg1, byte arg2) {
        field951++;
        if (arg2 < 28) {
            field949 = null;
        }
        return (arg0 & 0x10) != 0;
    }
}
