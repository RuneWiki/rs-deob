import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class54 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!vg", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field554++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 11)
    public class54(int arg0) {
        this.field552 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V", line = 23)
    public static final void method312(int arg0, int arg1) {
        int var2 = -73 / ((arg1 - 34) / 61);
        field553++;
        if (class382.method2244(arg0, 115)) {
            class23.method94(-1, 28219, class357.field4742[arg0]);
        }
    }
}
