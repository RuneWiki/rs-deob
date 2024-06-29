import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class479 extends class116 implements class439 {

    @OriginalMember(owner = "client!t", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!t", name = "BA", descriptor = "(III)V")
    public final void method626(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(IIIIIII)V")
    public final native void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public final native int method637();

    @OriginalMember(owner = "client!t", name = "DA", descriptor = "(IIIII)V")
    public final native void method633(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!t", name = "la", descriptor = "()I")
    public final native int method630();

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method2713(class328 arg0, class619 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!t", name = "P", descriptor = "(IIIIII)V")
    public final native void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        this.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!t", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method636(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(IILpa;II)V")
    private final native void method2714(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!t", name = "aa", descriptor = "(FFFFFFLpa;II)V")
    private final native void method2715(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!t", name = "KA", descriptor = "(IIII)V")
    public final native void method623(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!t", name = "EA", descriptor = "()I")
    public final native int method627();

    @OriginalMember(owner = "client!t", name = "va", descriptor = "(La;Lc;IIII)V")
    private final native void method2716(class328 arg0, class619 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!t", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!t", name = "ma", descriptor = "()I")
    public final native int method631();

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;[IIIII)V")
    public class479(class328 arg0, class619 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2713(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(La;Lc;IIII)V")
    public class479(class328 arg0, class619 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2716(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpa;II)V")
    public final void method634(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        this.method2714(arg0, arg1, arg2, arg3, arg4);
    }
}
