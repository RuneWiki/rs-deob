import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class301 extends class343 implements class416 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!q", name = "J", descriptor = "(III)V", line = 21)
    public final void method369(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILi;II)V", line = 27)
    public final void method368(int arg0, int arg1, class31 arg2, int arg3, int arg4) {
        this.method1927(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFFLi;II)V", line = 30)
    public final void method379(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8) {
        this.method1928(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lc;Lk;[IIIII)V", line = 36)
    public class301(class125 arg0, class404 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1930(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lc;Lk;IIII)V", line = 39)
    public class301(class125 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1929(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!q", name = "W", descriptor = "(IILi;II)V")
    private final native void method1927(int arg0, int arg1, class31 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()I")
    public final native int method376();

    @OriginalMember(owner = "client!q", name = "l", descriptor = "(IIII)V")
    public final native void method375(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(IIIIIII)V")
    public final native void method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "V", descriptor = "()I")
    public final native int method367();

    @OriginalMember(owner = "client!q", name = "MA", descriptor = "(FFFFFFLi;II)V")
    private final native void method1928(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class31 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "ga", descriptor = "()I")
    public final native int method374();

    @OriginalMember(owner = "client!q", name = "D", descriptor = "(IIIIII)V")
    public final native void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!q", name = "PA", descriptor = "(IIIIIII)V")
    public final native void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Lc;Lk;IIII)V")
    private final native void method1929(class125 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "E", descriptor = "(IIIII)V")
    public final native void method370(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(FFFFFFIII)V")
    public final native void method377(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!q", name = "da", descriptor = "(Lc;Lk;[IIIII)V")
    private final native void method1930(class125 arg0, class404 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);
}
