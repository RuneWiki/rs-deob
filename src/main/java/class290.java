import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class290 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Lpc;")
    private class700 field3497;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lha;ZIIIIII)V")
    public static final void method1698(class66 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class434.field5738 = arg0;
        field3495++;
        class415.field5434 = class434.field5738.method614();
        class677.field9286 = class434.field5738.method614();
        class594.field8080 = class434.field5738.method614();
        class645.field8791 = 0;
        class105.field1339 = 0;
        class727.field10184 = 1;
        if (!arg1) {
            return;
        }
        class603.field8149 = arg7;
        class619.field8330 = null;
        class690.field9392 = arg5;
        class375.field4708 = arg2;
        class372.field4683 = arg6;
        class199.method1296(0, arg3, arg4);
    }

    @OriginalMember(owner = "client!vea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3498++;
        this.field3497.method3928(this.field3496, (byte) 104);
        super.finalize();
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lpc;II)V")
    public class290(class700 arg0, int arg1, int arg2) {
        this.field3497 = arg0;
        this.field3496 = arg2;
    }
}
