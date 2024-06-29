import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class136 extends class413 implements class276 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method993(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method994(int arg0);

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class284.method1787(-24204, this);
    }

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method995(class413 arg0);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method996(int arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V")
    public final void method997(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1001(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method998(int arg0);

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method999(int arg0);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method1000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method1001(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lia;")
    public final class413 method1002() {
        class136 var1 = new class136();
        var1.method995(this);
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method1003();

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method1004(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method1005(int[] arg0);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method1006();

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class136() {
        this.method1006();
    }

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method1007(int arg0);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method1008(int arg0, int arg1, int arg2);
}
