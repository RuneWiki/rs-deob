import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class136 extends class414 implements class276 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method877(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method870(int[] arg0);

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class379.method2355(4650, this);
    }

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method1013(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method865(int arg0);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method864(int arg0);

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method866(class414 arg0);

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method872();

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method874(int arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lia;")
    public final class414 method871() {
        class136 var1 = new class136();
        var1.method866(this);
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method868(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method876(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class136() {
        this.method1014();
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method1014();

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method867(int arg0);

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method869(int arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V")
    public final void method875(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1013(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
