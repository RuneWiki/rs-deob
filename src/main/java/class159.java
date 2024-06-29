import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class159 {

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ija", name = "c", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(ZZI)Lbg;", line = 22)
    public static final class717 method1020(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1022(103);
        }
        field2063++;
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
        return (class717) class495.field6809.method3669(false, var3);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)V", line = 37)
    public static final void method1021(int arg0, int arg1, int arg2) {
        field2061++;
        class783 var3 = class405.field5707[arg1][arg0];
        if (arg2 != 25279) {
            method1022(82);
        }
        if (var3 != null) {
            class540.field7468 = var3.field10752;
            class669.field9374 = var3.field10750;
            class376.field5391 = var3.field10758;
        }
        class457.method2753(false);
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V", line = 59)
    public static final void method1022(int arg0) {
        class35.field343.method319(-101);
        field2062++;
        class226.field3432.method319(-25);
        if (arg0 <= 28) {
            method1021(-10, 68, -98);
        }
        class48.field573.method319(-42);
        class347.field5064.method319(-128);
    }
}
