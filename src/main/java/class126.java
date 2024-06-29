import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class126 extends class406 {

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "Lfea;")
    public static class678 field1636 = new class678("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "[I")
    public static int[] field1644;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public static void method872(int arg0) {
        field1636 = null;
        if (arg0 > -65) {
            method872(-68);
        }
        field1644 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lof;")
    public class475 method473(int arg0) {
        field1641++;
        return arg0 == 6 ? class86.field1037 : null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)Z")
    public static final boolean method873(int arg0, int arg1) {
        field1642++;
        if (arg0 != -987) {
            field1644 = null;
        }
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lada;Loe;IIIIIIIIIIIII)V")
    public class126(class267 arg0, class15 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1635 = arg14;
        this.field1640 = arg13;
        this.field1643 = arg12;
        this.field1639 = arg11;
        this.field1638 = arg9;
        this.field1637 = arg10;
    }
}
