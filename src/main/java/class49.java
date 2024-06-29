import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class49 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqa;I)Lpj;")
    public abstract class507 method51(class496 arg0, int arg1);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILqa;)Z")
    public abstract boolean method56(int arg0, int arg1, int arg2, class496 arg3);

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Z")
    public static final boolean method350(int arg0) {
        field678++;
        return ~class30.field464 == arg0 ? class295.field4368.method1531((byte) 67) : true;
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)Z")
    public abstract boolean method49(int arg0);

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)V")
    public abstract void method57(int arg0);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field677++;
        if (arg2 == arg7) {
            class422.method2546(arg0, arg5, arg1, (byte) 105, arg3, arg7, arg4);
            return;
        }
        if (class396.field6021 <= (arg4 - arg7) && (arg4 + arg7) <= class443.field6591 && arg1 - arg2 >= class410.field6176 && class158.field2302 >= (arg1 + arg2)) {
            class465.method2780(arg1, (byte) 30, arg2, arg5, arg7, arg3, arg0, arg4);
        } else {
            class180.method1292((byte) -96, arg1, arg7, arg4, arg5, arg0, arg3, arg2);
        }
        if (arg6) {
            ;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lqv;BLqa;IZII)V")
    public abstract void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(BLqa;)V")
    public abstract void method62(byte arg0, class496 arg1);
}
