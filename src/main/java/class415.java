import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class415 extends class16 implements class103 {

    @OriginalMember(owner = "client!ia", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ia", name = "BA", descriptor = "(III)V", line = 6)
    public final void method89(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILma;II)V", line = 10)
    public final void method95(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method2475(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(FFFFFFLma;II)V", line = 26)
    public final void method86(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method2474(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V", line = 30)
    public class415(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2473(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqa;Lna;IIII)V", line = 35)
    public class415(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2472(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "()I")
    public final native int method93();

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "(IIIIII)V")
    public final native void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!ia", name = "la", descriptor = "()I")
    public final native int method102();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method101(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "(IIIII)V")
    public final native void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "()I")
    public final native int method98();

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "(IIIIIII)V")
    public final native void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method2472(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method2473(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "(FFFFFFLma;II)V")
    private final native void method2474(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()I")
    public final native int method84();

    @OriginalMember(owner = "client!ia", name = "MA", descriptor = "(IIII)V")
    public final native void method97(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ia", name = "WA", descriptor = "(IILma;II)V")
    private final native void method2475(int arg0, int arg1, class10 arg2, int arg3, int arg4);
}
