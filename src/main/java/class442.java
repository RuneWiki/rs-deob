import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class442 extends class142 implements class241 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lia;", line = 6)
    public final class142 method977() {
        class442 var1 = new class442();
        var1.method988(this);
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() {
        class313.method1863(this, -70);
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 21)
    public class442() {
        this.method2633();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V", line = 26)
    public final void method992(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2634(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method986(int arg0);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method983(int[] arg0);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method982(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method985(int arg0);

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method979();

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method981(int arg0);

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method993(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method988(class142 arg0);

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method991(int arg0);

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method980(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method990(int arg0);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method2633();

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method2634(int arg0, int arg1, int arg2, int[] arg3);
}
