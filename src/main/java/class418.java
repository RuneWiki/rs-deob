import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class418 extends class16 implements class105 {

    @OriginalMember(owner = "client!ia", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "()I")
    public final native int method139();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method134(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "()I")
    public final native int method125();

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method2617(class166 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method2618(class166 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method121(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method2619(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "(IIIIII)V")
    public final native void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "(FFFFFFLma;II)V")
    private final native void method2619(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "MA", descriptor = "(IIII)V")
    public final native void method130(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ia", name = "WA", descriptor = "(IILma;II)V")
    private final native void method2620(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class438.method2701(-88, this);
    }

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "(IIIIIII)V")
    public final native void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILma;II)V")
    public final void method127(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method2620(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "BA", descriptor = "(III)V")
    public final void method133(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
    public final native int method129();

    @OriginalMember(owner = "client!ia", name = "la", descriptor = "()I")
    public final native int method123();

    @OriginalMember(owner = "client!ia", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "(IIIII)V")
    public final native void method141(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V")
    public class418(class166 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2618(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;IIII)V")
    public class418(class166 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2617(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
