import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class205 extends class127 implements class240 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "la", descriptor = "()I")
    public final native int method470();

    @OriginalMember(owner = "client!ra", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "()I")
    public final native int method467();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILma;II)V")
    public final void method294(int arg0, int arg1, class249 arg2, int arg3, int arg4) {
        this.method1343(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method1342(class131 arg0, class253 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8) {
        this.method1344(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "(IIIII)V")
    public final native void method299(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "ma", descriptor = "()I")
    public final native int method465();

    @OriginalMember(owner = "client!ra", name = "MA", descriptor = "(IIII)V")
    public final native void method464(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(IILma;II)V")
    private final native void method1343(int arg0, int arg1, class249 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
    public final native int method468();

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "(IIIIIII)V")
    public final native void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "(IIIIII)V")
    public final native void method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(FFFFFFLma;II)V")
    private final native void method1344(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class249 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "BA", descriptor = "(III)V")
    public final native void method295(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method475(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method1345(class131 arg0, class253 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V")
    public class205(class131 arg0, class253 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1345(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;IIII)V")
    public class205(class131 arg0, class253 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1342(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
