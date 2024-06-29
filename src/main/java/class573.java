import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class573 extends class397 implements class144 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method555(int arg0);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method565(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method560(class397 arg0);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method571(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method576(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method3148();

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method569(int[] arg0);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method586(int arg0);

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class573() {
        this.method3148();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;")
    public final class397 method587() {
        class573 var1 = new class573();
        var1.method560(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method3149(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method572(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V")
    public final void method579(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3149(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method580();

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method570(int arg0);

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method573(int arg0);
}
