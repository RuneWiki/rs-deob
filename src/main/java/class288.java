import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class288 extends class329 {

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "Lnj;")
    public static class436 field3881 = new class436(16);

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V")
    public static void method1719(byte arg0) {
        field3881 = null;
        int var1 = -78 % ((arg0 - -50) / 59);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IF)V")
    public final void method1720(int arg0, float arg1) {
        super.field4832 = arg1;
        if (arg0 == -22243) {
            ++field3882;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIF)V")
    public class288(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)V")
    public final void method1721(int arg0, int arg1, int arg2, int arg3) {
        super.field4820 = arg2;
        if (arg3 != 1) {
            method1719((byte) 51);
        }
        super.field4823 = arg0;
        super.field4830 = arg1;
        ++field3883;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
    public static int method1722(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
