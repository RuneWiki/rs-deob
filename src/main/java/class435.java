import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class435 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lta;")
    public class597 field5642 = null;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lsga;")
    public class547 field5640 = null;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lra;")
    public static class361 field5641 = new class361(105, -2);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lwb;")
    public static class518 field5645;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 6)
    public static void method2483(byte arg0) {
        field5641 = null;
        if (arg0 == 20) {
            field5645 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 21)
    public static final void method2484(int arg0, int arg1) {
        class346.field4418.method3659(arg1 - 114, arg0);
        field5639++;
        if (arg1 != -2) {
            field5644 = -12;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lta;)V", line = 43)
    public class435(class597 arg0) {
        this.field5642 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lta;Lsga;)V", line = 50)
    public class435(class597 arg0, class547 arg1) {
        this.field5640 = arg1;
        this.field5642 = arg0;
    }
}
