import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class555 extends class424 implements class89 {

    @OriginalMember(owner = "client!la", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!la", name = "ya", descriptor = "(IILfa;II)V")
    private final native void method3113(int arg0, int arg1, class185 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILfa;II)V")
    public final void method63(int arg0, int arg1, class185 arg2, int arg3, int arg4) {
        this.method3113(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!la", name = "I", descriptor = "(IIIII)V")
    public final native void method67(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!la", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
    public final native int method1154();

    @OriginalMember(owner = "client!la", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1156(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8) {
        this.method3115(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!la", name = "W", descriptor = "(Lda;La;[I[BIIII)V")
    private final native void method3114(class682 arg0, class405 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!la", name = "QA", descriptor = "()I")
    public final native int method1159();

    @OriginalMember(owner = "client!la", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I")
    public final native int method1157();

    @OriginalMember(owner = "client!la", name = "AA", descriptor = "()I")
    public final native int method1160();

    @OriginalMember(owner = "client!la", name = "t", descriptor = "(III)V")
    public final void method66(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lda;La;[I[BIIII)V")
    public class555(class682 arg0, class405 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3114(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!la", name = "U", descriptor = "(FFFFFFLfa;II)V")
    private final native void method3115(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!la", name = "EA", descriptor = "(IIII)V")
    public final native void method1155(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!la", name = "GA", descriptor = "(IIIIII)V")
    public final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
