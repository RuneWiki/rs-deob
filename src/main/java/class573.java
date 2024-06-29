import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class573 extends class396 implements class145 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method593(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V")
    public final void method582(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3101(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method578(int[] arg0);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method573(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;")
    public final class396 method576() {
        class573 var1 = new class573();
        var1.method583(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method584();

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method588(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method3100();

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method589(int arg0);

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method583(class396 arg0);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method574(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class573() {
        this.method3100();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method580(int arg0);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method591(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method579(int arg0);

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method3101(int arg0, int arg1, int arg2, int[] arg3);
}
