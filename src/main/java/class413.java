import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class413 extends class458 implements class142 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "GA", descriptor = "(IIIIII)V", line = 8)
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILfa;II)V", line = 22)
    public final void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4) {
        this.method2240(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 25)
    public final void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8) {
        this.method2238(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!la", name = "t", descriptor = "(III)V", line = 28)
    public final void method414(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lda;La;[I[BIIII)V", line = 35)
    public class413(class56 arg0, class564 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2239(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!la", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public final native int method417();

    @OriginalMember(owner = "client!la", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!la", name = "U", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2238(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "W", descriptor = "(Lda;La;[I[BIIII)V")
    private final native void method2239(class56 arg0, class564 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "ya", descriptor = "(IILfa;II)V")
    private final native void method2240(int arg0, int arg1, class213 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "AA", descriptor = "()I")
    public final native int method418();

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public final native int method408();

    @OriginalMember(owner = "client!la", name = "I", descriptor = "(IIIII)V")
    public final native void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "QA", descriptor = "()I")
    public final native int method415();

    @OriginalMember(owner = "client!la", name = "EA", descriptor = "(IIII)V")
    public final native void method409(int arg0, int arg1, int arg2, int arg3);
}
