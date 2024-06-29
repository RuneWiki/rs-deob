import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class321 extends class151 implements class128 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(122, this);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V", line = 20)
    public final void method145(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1857(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 22)
    public class321() {
        this.method1858();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;", line = 35)
    public final class151 method131() {
        class321 var1 = new class321();
        var1.method133(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method137();

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method1857(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method149(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method138(int arg0);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method143(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method136(int arg0);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method135(int arg0);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method147(int arg0);

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method133(class151 arg0);

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method132(int[] arg0);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method134(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method1858();
}
