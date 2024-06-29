import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class130 extends class100 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private static int field2093;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method922(int arg0) {
        field2093 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
    public final void method923() {
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()I")
    public static final int method924() {
        return field2093;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class130() {
        new class3();
        new class115();
    }

    static {
        new class105(8);
        field2093 = 2;
        new class221(131056);
    }
}
