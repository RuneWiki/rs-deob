import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class575 extends class53 implements class28 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "()I")
    public final native int method322();

    @OriginalMember(owner = "client!t", name = "P", descriptor = "(IIIIII)V")
    public final native void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8) {
        this.method3427(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "la", descriptor = "()I")
    public final native int method318();

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(IILpa;II)V")
    private final native void method3424(int arg0, int arg1, class311 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "EA", descriptor = "()I")
    public final native int method326();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpa;II)V")
    public final void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4) {
        this.method3424(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!t", name = "KA", descriptor = "(IIII)V")
    public final native void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIII)V")
    public final native void method333(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(-42, this);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final native int method325();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method3425(class530 arg0, class160 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "va", descriptor = "(La;Lc;IIII)V")
    private final native void method3426(class530 arg0, class160 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(III)V")
    public final void method321(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;[IIIII)V")
    public class575(class530 arg0, class160 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3425(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(FFFFFFLpa;II)V")
    private final native void method3427(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;IIII)V")
    public class575(class530 arg0, class160 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3426(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(IIIIIII)V")
    public final native void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);
}
