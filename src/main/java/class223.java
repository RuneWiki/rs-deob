import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class223 extends class478 {

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "I")
    private int field2946 = 0;

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "Lid;")
    public static class388 field2949 = new class388();

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "Lmv;")
    public static class295 field2947;

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "Lmv;")
    public static class295 field2951;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method944(int arg0, boolean arg1) {
        ++field2948;
        int var3 = super.field6847.field3055.method3193(-30796, class677.field9591, super.field6851.method50()) - -super.field6847.field3053;
        int var4 = super.field6847.field3058.method1916((byte) 112, class619.field8966, super.field6851.method43()) + super.field6847.field3052;
        super.field6851.method1527((float) (super.field6851.method50() / 2 + var3), (float) (var4 + super.field6851.method43() / 2), 4096, this.field2946);
        this.field2946 += ((class403) super.field6847).field6053;
        if (arg0 != -31764) {
            this.method944(85, false);
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(B)I", line = 23)
    public static final int method1392(byte arg0) {
        ++field2950;
        if (arg0 != -29) {
            field2951 = null;
        }
        return class148.field2097 == null ? 0 : class148.field2097.length * 2;
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V", line = 40)
    public static void method1393(byte arg0) {
        if (arg0 <= 62) {
            field2951 = null;
        }
        field2949 = null;
        field2947 = null;
        field2951 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIII)V", line = 52)
    public static final void method1394(int arg0, int arg1, int arg2, int arg3) {
        ++field2952;
        int var4 = 26 % ((25 - arg1) / 55);
        int var5 = class335.field4872.field9471 * arg2 >> 8;
        if (var5 != 0 && ~arg3 != 0) {
            if (!class700.field9845 && class443.field6426 != -1 && class678.method3812(-30990)) {
                class125.field1829 = class4.method13(-21191);
                class617 var6 = class59.method367(class125.field1829, -1226);
                class507.method2884(var6, -1, true);
            }
            class78.method454(0, arg3, class251.field3297, -23561, var5, false);
            class139.method980(-1, -1, 255);
            class700.field9845 = true;
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lmv;Llo;)V", line = 84)
    public class223(class295 arg0, class403 arg1) {
        super(arg0, arg1);
    }
}
