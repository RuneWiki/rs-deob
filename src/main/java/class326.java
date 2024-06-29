import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class326 extends class352 {

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public static int field4246 = 0;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Lqv;", line = 10)
    public final class406 method484(int arg0) {
        field4243++;
        if (arg0 != 16236) {
            this.field4242 = -56;
        }
        return class212.field2567;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lida;Lce;IIIIIII)V", line = 22)
    public class326(class215 arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field4242 = arg8;
        this.field4245 = arg7;
    }
}
