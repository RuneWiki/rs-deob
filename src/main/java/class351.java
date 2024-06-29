import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class351 extends class343 implements class416 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "(IIIIII)V")
    public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "XA", descriptor = "(IIIIIII)V")
    public final native void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLi;II)V")
    public final void method379(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8) {
        this.method2206(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!va", name = "ta", descriptor = "(FFFFFFIII)V")
    public final native void method377(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "ga", descriptor = "()I")
    public final native int method374();

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!va", name = "G", descriptor = "(FFFFFFLi;II)V")
    private final native void method2206(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()I")
    public final native int method376();

    @OriginalMember(owner = "client!va", name = "LA", descriptor = "(IILi;II)V")
    private final native void method2207(int arg0, int arg1, class31 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "V", descriptor = "()I")
    public final native int method367();

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lc;Lk;[I[BIIII)V")
    public class351(class125 arg0, class404 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2208(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!va", name = "E", descriptor = "(IIIII)V")
    public final native void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "sa", descriptor = "(Lc;Lk;[I[BIIII)V")
    private final native void method2208(class125 arg0, class404 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!va", name = "TA", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!va", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!va", name = "J", descriptor = "(III)V")
    public final void method369(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!va", name = "PA", descriptor = "(IIIIIII)V")
    public final native void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILi;II)V")
    public final void method368(int arg0, int arg1, class31 arg2, int arg3, int arg4) {
        this.method2207(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "l", descriptor = "(IIII)V")
    public final native void method375(int arg0, int arg1, int arg2, int arg3);
}
