import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class485 extends class174 {

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field6704;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "Z")
    public static boolean field6703 = false;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
    public static final void method2818(int arg0) {
        class338.field4547.method495(-97);
        if (arg0 != 12866) {
            field6703 = true;
        }
        field6705++;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Liq;Ljava/lang/Object;I)V")
    public class485(class396 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6704 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1006(byte arg0) {
        if (arg0 != 106) {
            field6703 = false;
        }
        field6706++;
        return this.field6704;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Z")
    public final boolean method1005(int arg0) {
        field6707++;
        if (arg0 != 27969) {
            this.field6704 = null;
        }
        return false;
    }

    static {
        new class206("From", "Von:", "De", "De");
    }
}
