import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class485 {

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "[I")
    public static int[] field7024 = new int[1];

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field7025 = 0;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Leq;")
    public static class134 field7020;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lit;")
    public static class439 field7023;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[Lqg;")
    public static class307[] field7021;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 3)
    public static void method2830(int arg0) {
        if (arg0 != 1) {
            method2830(-96);
        }
        field7023 = null;
        field7024 = null;
        field7020 = null;
        field7021 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 25)
    public static final void method2831(byte arg0) {
        field7022++;
        class298.field4343.method775(class430.field6326, class118.field1533.field6907 ? class239.field3339 + 256 << 0 : -1, 256);
        if (arg0 <= 65) {
            method2830(48);
        }
    }
}
