import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class337 extends class111 implements class89 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 10)
    public class337() {
        this.method2148();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;", line = 17)
    public final class111 method596() {
        class337 var1 = new class337();
        var1.method597(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V", line = 22)
    public final void method608(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2149(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 26)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method601(int arg0);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method599(int[] arg0);

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method600();

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method2148();

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method597(class111 arg0);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method598(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method609(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method606(int arg0);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method603(int arg0);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method595(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method2149(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method605(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method604(int arg0);
}
