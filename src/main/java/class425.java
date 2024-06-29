import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class425 extends class53 implements class28 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILpa;II)V", line = 8)
    public final void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4) {
        this.method2498(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 15)
    public final void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8) {
        this.method2497(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(68, this);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;[IIIII)V", line = 33)
    public class425(class530 arg0, class160 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2500(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;IIII)V", line = 36)
    public class425(class530 arg0, class160 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2499(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "la", descriptor = "()I")
    public final native int method318();

    @OriginalMember(owner = "client!va", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "EA", descriptor = "()I")
    public final native int method326();

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(III)V")
    public final native void method321(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "ma", descriptor = "()I")
    public final native int method322();

    @OriginalMember(owner = "client!va", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!va", name = "P", descriptor = "(IIIIII)V")
    public final native void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "v", descriptor = "(FFFFFFLpa;II)V")
    private final native void method2497(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "ea", descriptor = "(IILpa;II)V")
    private final native void method2498(int arg0, int arg1, class311 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
    public final native int method325();

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIII)V")
    public final native void method333(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(La;Lc;IIII)V")
    private final native void method2499(class530 arg0, class160 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "KA", descriptor = "(IIII)V")
    public final native void method324(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(IIIIIII)V")
    public final native void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method2500(class530 arg0, class160 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);
}
