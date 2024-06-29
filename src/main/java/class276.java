import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class276 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4740 = -1;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lve;")
    private static class255 field4743 = class87.method607(90, "yellow:");

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lve;")
    public static class255 field4741 = field4743;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lve;")
    public static class255 field4737 = field4743;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4736 = 0;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lt;")
    public static class242 field4742;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lqi;")
    public static class290 field4735;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/lang/Object;Z)[B", line = 5)
    public static final byte[] method1933(int arg0, Object arg1, boolean arg2) {
        field4739++;
        if (arg0 != -1) {
            return (byte[]) null;
        } else if (arg1 == null) {
            return null;
        } else if ((arg1 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg2 ? class284.method2022(0, var4) : var4;
        } else if (arg1 instanceof class141) {
            class141 var3 = (class141) arg1;
            return var3.method1050(104);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 56)
    public static void method1934(int arg0) {
        field4737 = null;
        field4741 = null;
        if (arg0 != -1) {
            field4740 = -36;
        }
        field4735 = null;
        field4742 = null;
        field4743 = null;
    }
}
