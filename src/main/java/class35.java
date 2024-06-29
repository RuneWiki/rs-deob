import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class35 extends class343 implements class416 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILi;II)V", line = 7)
    public final void method368(int arg0, int arg1, class31 arg2, int arg3, int arg4) {
        this.method371(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(FFFFFFLi;II)V", line = 28)
    public final void method379(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8) {
        this.method381(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lc;Lk;[IIIII)V", line = 35)
    public class35(class125 arg0, class404 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method373(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lc;Lk;IIII)V", line = 38)
    public class35(class125 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method366(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!na", name = "D", descriptor = "(IIIIII)V")
    public final native void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!na", name = "BA", descriptor = "(Lc;Lk;IIII)V")
    private final native void method366(class125 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!na", name = "V", descriptor = "()I")
    public final native int method367();

    @OriginalMember(owner = "client!na", name = "J", descriptor = "(III)V")
    public final native void method369(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "E", descriptor = "(IIIII)V")
    public final native void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!na", name = "ya", descriptor = "(IILi;II)V")
    private final native void method371(int arg0, int arg1, class31 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!na", name = "XA", descriptor = "(IIIIIII)V")
    public final native void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(Lc;Lk;[IIIII)V")
    private final native void method373(class125 arg0, class404 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "ga", descriptor = "()I")
    public final native int method374();

    @OriginalMember(owner = "client!na", name = "l", descriptor = "(IIII)V")
    public final native void method375(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
    public final native int method376();

    @OriginalMember(owner = "client!na", name = "ta", descriptor = "(FFFFFFIII)V")
    public final native void method377(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!na", name = "TA", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!na", name = "PA", descriptor = "(IIIIIII)V")
    public final native void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "ja", descriptor = "(FFFFFFLi;II)V")
    private final native void method381(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!na", name = "pa", descriptor = "()V")
    public final native void method382();
}
