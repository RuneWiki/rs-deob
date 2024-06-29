import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class256 extends class53 implements class28 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()I")
    public final native int method325();

    @OriginalMember(owner = "client!ca", name = "DA", descriptor = "(IIIII)V")
    public final native void method333(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "BA", descriptor = "(III)V")
    public final void method321(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "(IIIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "()I")
    public final native int method322();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILpa;II)V")
    public final void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4) {
        this.method1642(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "EA", descriptor = "()I")
    public final native int method326();

    @OriginalMember(owner = "client!ca", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!ca", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "KA", descriptor = "(IIII)V")
    public final native void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "(La;Lc;[I[BIIII)V")
    private final native void method1640(class530 arg0, class160 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "(FFFFFFLpa;II)V")
    private final native void method1641(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8) {
        this.method1641(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "(IILpa;II)V")
    private final native void method1642(int arg0, int arg1, class311 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(-103, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(IIIIIII)V")
    public final native void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(La;Lc;[I[BIIII)V")
    public class256(class530 arg0, class160 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1640(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "()I")
    public final native int method318();
}
