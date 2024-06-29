import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class283 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public int field3837;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public static int[] field3836 = new int[14];

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field3838++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)I", line = 17)
    public final int method1628(boolean arg0) {
        field3840++;
        if (!arg0) {
            this.method1628(true);
        }
        return this.field3839;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 28)
    public static void method1629(int arg0) {
        field3836 = null;
        if (arg0 != 14) {
            method1630(true);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V", line = 38)
    public static final void method1630(boolean arg0) {
        field3841++;
        class527.field7690 = 0;
        class391.field5638.method3143(arg0);
        class391.field5638.method3139(0, class495.field7196);
        class527.field7690++;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(II)V", line = 58)
    public class283(int arg0, int arg1) {
        this.field3839 = arg0;
        this.field3837 = arg1;
    }
}
