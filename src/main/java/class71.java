import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class71 extends class16 implements class103 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "MA", descriptor = "(IIII)V")
    public final native void method97(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "(Lqa;Lna;IIII)V")
    private final native void method590(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "(IIIIII)V")
    public final native void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method86(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        this.method591(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILma;II)V")
    public final void method95(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        this.method593(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "BA", descriptor = "(III)V")
    public final native void method89(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "(IIIII)V")
    public final native void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(FFFFFFLma;II)V")
    private final native void method591(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "()I")
    public final native int method93();

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "(IIIIIII)V")
    public final native void method94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(FFFFFFIII)V")
    public final native void method101(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ra", name = "JA", descriptor = "(IIIIIII)V")
    public final native void method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;[IIIII)V")
    public class71(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method592(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lqa;Lna;IIII)V")
    public class71(class163 arg0, class35 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method590(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "(Lqa;Lna;[IIIII)V")
    private final native void method592(class163 arg0, class35 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()I")
    public final native int method84();

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(IILma;II)V")
    private final native void method593(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ra", name = "la", descriptor = "()I")
    public final native int method102();

    @OriginalMember(owner = "client!ra", name = "ma", descriptor = "()I")
    public final native int method98();
}
