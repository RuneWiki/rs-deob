import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class136 extends class414 implements class276 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lia;", line = 12)
    public final class414 method962() {
        class136 var1 = new class136();
        var1.method960(this);
        return var1;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 16)
    public class136() {
        this.method963();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V", line = 26)
    public final void method968(int arg0, int arg1, int arg2, int[] arg3) {
        this.method965(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method959(int arg0);

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method960(class414 arg0);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method961(int arg0);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method963();

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method964();

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method965(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method966(int arg0);

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method967(int arg0);

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method969(int arg0);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method970(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method971(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method972(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method973(int[] arg0);
}
