import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class300 extends class175 {

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "I")
    public static int field4195 = -50;

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!vv", name = "H", descriptor = "F")
    public static float field4194;

    @OriginalMember(owner = "client!vv", name = "F", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!vv", name = "G", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lbi;Lbi;Llda;)V")
    public class300(class449 arg0, class449 arg1, class454 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIZI)V")
    public final void method1180(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field4193;
        if (arg3) {
            method1829(83, 71, 110, 123);
        }
        int var6 = super.field2699.method1025();
        int var7 = ((class454) super.field5899).field6185 * class413.method2367(-119) / 10 % var6;
        super.field2699.method2643(arg0 - var6 - -var7, arg2, arg4 - -var6 + -var7, arg1);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)I")
    public static final int method1829(int arg0, int arg1, int arg2, int arg3) {
        ++field4197;
        int var4 = 115 / ((arg2 - 51) / 57);
        if (~arg0 < ~arg1) {
            return arg0;
        } else {
            return arg1 <= arg3 ? arg1 : arg3;
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
    public static final void method1830(int arg0) {
        class139.field2244.method2272((byte) 73);
        ++field4192;
        class673.method3765(100);
        if (arg0 != 18171) {
            field4196 = -118;
        }
        class396.field5263 = 0;
        class17.field272 = null;
        class102.field1525 = null;
        class108.field1587 = 0;
        class439.field6039.field4619 = 0;
        class147.field2353 = null;
        class608.method3341(-101);
        class408.field5515 = 0;
        class551.field7334 = null;
        class156.field2457 = 0;
        class59.field916 = 0;
        class636.field8571 = null;
    }
}
