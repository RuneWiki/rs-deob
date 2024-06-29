import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class71 extends class16 implements class103 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILma;II)V", line = 4)
    public final void method128(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method668(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(FFFFFFLma;II)V", line = 24)
    public final void method116(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method667(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V", line = 33)
    public class71(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method669(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;IIII)V", line = 36)
    public class71(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method670(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
    public final native int method125();

    @OriginalMember(owner = "client!ra", name = "ma", descriptor = "()I")
    public final native int method126();

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(FFFFFFLma;II)V")
    private final native void method667(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "(IIIIIII)V")
    public final native void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "BA", descriptor = "(III)V")
    public final native void method112(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "(IIIIII)V")
    public final native void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method115(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "()I")
    public final native int method117();

    @OriginalMember(owner = "client!ra", name = "la", descriptor = "()I")
    public final native int method110();

    @OriginalMember(owner = "client!ra", name = "MA", descriptor = "(IIII)V")
    public final native void method113(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "(IIIII)V")
    public final native void method114(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(IILma;II)V")
    private final native void method668(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method669(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method670(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);
}
