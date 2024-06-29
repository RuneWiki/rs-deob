import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class558 extends class389 implements class142 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;", line = 24)
    public final class389 method224() {
        class558 var1 = new class558();
        var1.method233(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 32)
    public class558() {
        this.method3155();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V", line = 36)
    public final void method236(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3154(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method234(int[] arg0);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method228(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method225(int arg0);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method3154(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method226(int arg0);

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method235(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method230(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method233(class389 arg0);

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method231(int arg0);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method229(int arg0);

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method237(int arg0);

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method232();

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method3155();
}
