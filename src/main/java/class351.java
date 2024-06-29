import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class351 {

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Llaa;")
    private class122 field4933;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public int field4931;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
    public static final void method2104(byte arg0) throws class149 {
        if (arg0 != 56) {
            field4934 = -105;
        }
        field4935++;
        if (class410.field5681 == 1) {
            class45.field585.method465(class186.field2817, class55.field664);
        } else {
            class45.field585.method465(0, 0);
        }
    }

    @OriginalMember(owner = "client!ow", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4933.method980(this.field4931, true);
        field4932++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Llaa;II)V")
    public class351(class122 arg0, int arg1, int arg2) {
        this.field4933 = arg0;
        this.field4931 = arg2;
    }
}
