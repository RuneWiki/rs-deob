import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class560 extends class391 implements class141 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;", line = 17)
    public final class391 method1295() {
        class560 var1 = new class560();
        var1.method1298(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V", line = 23)
    public class560() {
        this.method3105();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V", line = 28)
    public final void method1291(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3106(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method3105();

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method1294(int arg0);

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method1298(class391 arg0);

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method1287(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method3106(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method1288(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method1286(int arg0);

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method1292(int arg0);

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method1297(int arg0);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method1293(int arg0);

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method1296();

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method1285(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method1289(int[] arg0);
}
