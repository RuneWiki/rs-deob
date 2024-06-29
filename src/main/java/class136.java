import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class136 extends class414 implements class276 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method899(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method901(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method902();

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method903(class414 arg0);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method904();

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method905(int arg0);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method906(int arg0);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method60();

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method907(int arg0);

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class236.method1601(-98, this);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V")
    public final void method908(int arg0, int arg1, int arg2, int[] arg3) {
        this.method899(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method909(int[] arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lia;")
    public final class414 method910() {
        class136 var1 = new class136();
        var1.method903(this);
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method911(int arg0);

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method912(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class136() {
        this.method904();
    }

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method913(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method914(int arg0);
}
