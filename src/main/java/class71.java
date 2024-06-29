import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class71 extends class16 implements class103 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(FFFFFFLma;II)V", line = 8)
    public final void method136(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method630(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILma;II)V", line = 27)
    public final void method129(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method631(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V", line = 30)
    public class71(class164 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method629(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;IIII)V", line = 36)
    public class71(class164 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method628(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ra", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method147(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method628(class164 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "(IIIIII)V")
    public final native void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "(IIIIIII)V")
    public final native void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method629(class164 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "BA", descriptor = "(III)V")
    public final native void method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(FFFFFFLma;II)V")
    private final native void method630(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "MA", descriptor = "(IIII)V")
    public final native void method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "()I")
    public final native int method131();

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(IILma;II)V")
    private final native void method631(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "(IIIII)V")
    public final native void method139(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "ma", descriptor = "()I")
    public final native int method137();

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
    public final native int method148();

    @OriginalMember(owner = "client!ra", name = "la", descriptor = "()I")
    public final native int method134();
}
