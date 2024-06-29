import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class543 extends class82 {

    @OriginalMember(owner = "client!hha", name = "C", descriptor = "I")
    public int field7605;

    @OriginalMember(owner = "client!hha", name = "F", descriptor = "I")
    public static int field7608 = 0;

    @OriginalMember(owner = "client!hha", name = "D", descriptor = "Ltga;")
    public static class64 field7606 = new class64(64);

    @OriginalMember(owner = "client!hha", name = "G", descriptor = "Lpb;")
    public static class680 field7609 = new class680("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!hha", name = "H", descriptor = "I")
    public static int field7610 = 0;

    @OriginalMember(owner = "client!hha", name = "A", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!hha", name = "B", descriptor = "Lkj;")
    public static class590 field7604;

    @OriginalMember(owner = "client!hha", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field7607;

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lfda;Laba;IIIIIIIIIIIIII)V")
    public class543(class336 arg0, class185 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field7605 = arg15;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)Lve;")
    public final class527 method606(int arg0) {
        if (arg0 != 0) {
            method3125((byte) -30);
        }
        field7603++;
        return class752.field10422;
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(B)V")
    public static void method3125(byte arg0) {
        field7606 = null;
        field7604 = null;
        field7607 = null;
        field7609 = null;
        if (arg0 < 81) {
            method3125((byte) -15);
        }
    }
}
