import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class352 extends class203 {

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Lhda;")
    public final class750 method333(int arg0) {
        field4708++;
        if (arg0 != 30778) {
            this.field4704 = 109;
        }
        return class291.field3849;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lee;Lhaa;IIIIIIIIII)V")
    public class352(class676 arg0, class82 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field4704 = arg11;
        this.field4709 = arg10;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lha;B)V")
    public static final void method2044(class60 arg0, byte arg1) {
        class497.field6764 = class388.method2265(class535.field7255, arg0, (byte) 117, true);
        field4707++;
        if (arg1 > -47) {
            return;
        }
        class86.field1180 = class324.method1937(class535.field7255, 18361, arg0);
        class399.field5650 = class388.method2265(class476.field6584, arg0, (byte) 119, true);
        class294.field3954 = class324.method1937(class476.field6584, 18361, arg0);
        class214.field2575 = class388.method2265(class305.field4129, arg0, (byte) 88, true);
        class616.field8643 = class324.method1937(class305.field4129, 18361, arg0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(CI)Z")
    public static final boolean method2045(char arg0, int arg1) {
        field4705++;
        if (arg1 != 95) {
            method2045('6', -97);
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }
}
