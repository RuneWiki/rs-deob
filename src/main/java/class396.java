import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class396 extends class16 implements class103 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!k", name = "S", descriptor = "(FFFFFFLma;II)V")
    private final native void method2387(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IIIII)V")
    public final native void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "ra", descriptor = "(Lqa;Lna;[I[BIIII)V")
    private final native void method2388(class163 arg0, class35 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "la", descriptor = "()I")
    public final native int method102();

    @OriginalMember(owner = "client!k", name = "ma", descriptor = "()I")
    public final native int method98();

    @OriginalMember(owner = "client!k", name = "T", descriptor = "()I")
    public final native int method93();

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lqa;Lna;[I[BIIII)V")
    public class396(class163 arg0, class35 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2388(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(IIIIIII)V")
    public final native void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!k", name = "BA", descriptor = "(III)V")
    public final void method89(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "j", descriptor = "()I")
    public final native int method84();

    @OriginalMember(owner = "client!k", name = "t", descriptor = "(IIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "(IILma;II)V")
    private final native void method2389(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method86(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method2387(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILma;II)V")
    public final void method95(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method2389(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(IIII)V")
    public final native void method97(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method101(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
