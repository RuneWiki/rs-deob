import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class640 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public int field9109;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field9113;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field9110;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field9111;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lqe;")
    public static class465 field9108 = new class465(112, 11);

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lpu;")
    public static class559 field9112 = new class559(3, 5);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lph;")
    public final class640 method3657(int arg0, byte arg1) {
        field9107++;
        return arg1 == 46 ? new class640(this.field9110, arg0, this.field9109, this.field9113) : null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static void method3658(boolean arg0) {
        field9112 = null;
        field9108 = null;
        if (arg0) {
            field9108 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIII)V")
    public class640(int arg0, int arg1, int arg2, int arg3) {
        this.field9109 = arg2;
        this.field9113 = arg3;
        this.field9110 = arg0;
        this.field9111 = arg1;
    }
}
