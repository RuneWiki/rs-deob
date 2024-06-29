import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class544 extends class334 {

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "Lvg;")
    public static class622 field8035 = new class622(86, 7);

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "Lvg;")
    public static class622 field8039 = new class622(115, 6);

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "Z")
    public static boolean field8040 = false;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "Lvea;")
    public static class305 field8038;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method1166(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 6211) {
            super.field4859 = arg1;
            ++field8037;
            super.field4858 = arg3;
            super.field4853 = arg2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(FB)V", line = 19)
    public final void method1165(float arg0, byte arg1) {
        ++field8036;
        super.field4848 = arg0;
        if (arg1 != -18) {
            field8039 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "(I)V", line = 37)
    public static void method3191(int arg0) {
        if (arg0 != 6) {
            field8040 = true;
        }
        field8038 = null;
        field8035 = null;
        field8039 = null;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIF)V", line = 49)
    public class544(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
