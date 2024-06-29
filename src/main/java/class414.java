import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class414 extends class16 implements class103 {

    @OriginalMember(owner = "client!ia", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILma;II)V", line = 12)
    public final void method128(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method2524(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V", line = 18)
    public class414(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2526(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ia", name = "BA", descriptor = "(III)V", line = 25)
    public final void method112(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;IIII)V", line = 32)
    public class414(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2525(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(FFFFFFLma;II)V", line = 40)
    public final void method116(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method2523(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ia", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "(IIIIII)V")
    public final native void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "(IIIIIII)V")
    public final native void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "(FFFFFFLma;II)V")
    private final native void method2523(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "()I")
    public final native int method117();

    @OriginalMember(owner = "client!ia", name = "la", descriptor = "()I")
    public final native int method110();

    @OriginalMember(owner = "client!ia", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "WA", descriptor = "(IILma;II)V")
    private final native void method2524(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method115(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method2525(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "(IIIII)V")
    public final native void method114(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "MA", descriptor = "(IIII)V")
    public final native void method113(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "()I")
    public final native int method126();

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method2526(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
    public final native int method125();
}
