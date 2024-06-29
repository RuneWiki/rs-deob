import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class347 extends class65 {

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
    public static int field4765 = -2;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!mv", name = "A", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!mv", name = "B", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIIF)V", line = 4)
    public class347(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(FB)V", line = 9)
    public final void method525(float arg0, byte arg1) {
        ++field4764;
        super.field987 = arg0;
        if (arg1 != -10) {
            method2080(-112);
        }
    }

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "(I)Lae;", line = 24)
    public static final class233 method2080(int arg0) {
        ++field4762;
        class664.field9423 = 0;
        if (arg0 != -2) {
            field4765 = 75;
        }
        return class576.method3153(65);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BIII)V", line = 37)
    public final void method524(byte arg0, int arg1, int arg2, int arg3) {
        super.field1000 = arg2;
        ++field4763;
        super.field998 = arg3;
        if (arg0 != -116) {
            field4765 = 0;
        }
        super.field994 = arg1;
    }
}
