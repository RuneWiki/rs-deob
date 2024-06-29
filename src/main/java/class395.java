import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class395 extends class16 implements class103 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "(IILma;II)V")
    private final native void method2416(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!k", name = "t", descriptor = "(IIIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "ma", descriptor = "()I")
    public final native int method126();

    @OriginalMember(owner = "client!k", name = "T", descriptor = "()I")
    public final native int method117();

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILma;II)V")
    public final void method128(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method2416(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "la", descriptor = "()I")
    public final native int method110();

    @OriginalMember(owner = "client!k", name = "BA", descriptor = "(III)V")
    public final void method112(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(IIIIIII)V")
    public final native void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method116(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method2417(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IIIII)V")
    public final native void method114(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method115(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lqa;Lna;[I[BIIII)V")
    public class395(class163 arg0, class35 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2418(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!k", name = "S", descriptor = "(FFFFFFLma;II)V")
    private final native void method2417(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "j", descriptor = "()I")
    public final native int method125();

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(IIII)V")
    public final native void method113(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "ra", descriptor = "(Lqa;Lna;[I[BIIII)V")
    private final native void method2418(class163 arg0, class35 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);
}
