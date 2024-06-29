import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class37 extends class129 {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[I")
    public int[] field784 = new int[1];

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[I")
    public int[] field786 = new int[] { -1 };

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static volatile int field794 = 0;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Lrd;")
    public static class173 field792 = class133.method843("::clientdrop", -87);

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Lrd;")
    private static class173 field796 = class133.method843("Please check your message)2centre for details)3", 39);

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lrd;")
    public static class173 field785 = field796;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "J")
    public static long field791;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lbc;")
    public static class14 field795;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method281(int arg0) {
        class92.field1743.method53(-51);
        if (arg0 <= -115) {
            class103.field1903.method53(-51);
            field789++;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static void method282(int arg0) {
        if (arg0 > -42) {
            field791 = 108L;
        }
        field785 = null;
        field795 = null;
        field792 = null;
        field796 = null;
    }
}
