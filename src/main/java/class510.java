import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class510 extends class714 {

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
    public int field7016;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
    public int field7012;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
    public int field7005;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public int field7009;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "Lvb;")
    public static class396 field7007 = new class396(12, 7);

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "Ldp;")
    public static class496 field7010;

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "[[I")
    public static int[][] field7018;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lol;I)Llca;")
    public static final class110 method2979(class431 arg0, int arg1) {
        field7017++;
        class714 var2 = class677.method3792(arg0, 0);
        int var3 = arg0.method2526(17);
        int var4 = arg0.method2526(17);
        if (arg1 >= -85) {
            return null;
        } else {
            int var5 = arg0.method2565((byte) -82);
            return new class110(var2.field9967, var2.field9961, var2.field9958, var2.field9969, var2.field9960, var2.field9968, var2.field9970, var2.field9962, var2.field9959, var3, var4, var5);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)Lhl;")
    public class353 method327(byte arg0) {
        if (arg0 <= 51) {
            field7007 = null;
        }
        field7015++;
        return class645.field9175;
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lmp;Lfe;IIIIIIIIIIIII)V")
    public class510(class565 arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7016 = arg12;
        this.field7012 = arg14;
        this.field7005 = arg13;
        this.field7009 = arg11;
        this.field7013 = arg9;
        this.field7008 = arg10;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)I")
    public static final int method2980(int arg0, int arg1, int arg2) {
        if (arg1 > -72) {
            return -33;
        }
        field7011++;
        int var3 = class313.method1909(-32418, arg2 - 1, arg0 + -1) + class313.method1909(-32418, arg2 + 1, arg0 - 1) + (class313.method1909(-32418, arg2 - 1, arg0 + 1) - -class313.method1909(-32418, arg2 + 1, arg0 + 1));
        int var4 = class313.method1909(-32418, arg2 - 1, arg0) - (-class313.method1909(-32418, arg2 + 1, arg0) + (-class313.method1909(-32418, arg2, arg0 - 1) - class313.method1909(-32418, arg2, arg0 + 1)));
        int var5 = class313.method1909(-32418, arg2, arg0);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
    public static void method2981(int arg0) {
        field7007 = null;
        if (arg0 > -82) {
            method2979(null, 68);
        }
        field7010 = null;
        field7018 = null;
    }
}
