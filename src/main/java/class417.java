import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class417 extends class16 implements class103 {

    @OriginalMember(owner = "client!ia", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILma;II)V", line = 7)
    public final void method129(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method2461(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V", line = 25)
    public class417(class164 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2462(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(FFFFFFLma;II)V", line = 30)
    public final void method136(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method2459(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;IIII)V", line = 34)
    public class417(class164 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2460(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ia", name = "BA", descriptor = "(III)V", line = 40)
    public final void method146(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "(FFFFFFLma;II)V")
    private final native void method2459(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "()I")
    public final native int method137();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method147(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "(IIIIIII)V")
    public final native void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "la", descriptor = "()I")
    public final native int method134();

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method2460(class164 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "WA", descriptor = "(IILma;II)V")
    private final native void method2461(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
    public final native int method148();

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method2462(class164 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "MA", descriptor = "(IIII)V")
    public final native void method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "()I")
    public final native int method131();

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "(IIIII)V")
    public final native void method139(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "(IIIIII)V")
    public final native void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
