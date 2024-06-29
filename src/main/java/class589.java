import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class589 extends class116 implements class439 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        this.method3398(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!va", name = "ma", descriptor = "()I")
    public final native int method631();

    @OriginalMember(owner = "client!va", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method636(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "P", descriptor = "(IIIIII)V")
    public final native void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "KA", descriptor = "(IIII)V")
    public final native void method623(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!va", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILpa;II)V")
    public final void method634(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        this.method3399(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "v", descriptor = "(FFFFFFLpa;II)V")
    private final native void method3398(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "la", descriptor = "()I")
    public final native int method630();

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIII)V")
    public final native void method633(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
    public final native int method637();

    @OriginalMember(owner = "client!va", name = "ea", descriptor = "(IILpa;II)V")
    private final native void method3399(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "EA", descriptor = "()I")
    public final native int method627();

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method3400(class328 arg0, class619 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(IIIIIII)V")
    public final native void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(La;Lc;IIII)V")
    private final native void method3401(class328 arg0, class619 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(III)V")
    public final native void method626(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;[IIIII)V")
    public class589(class328 arg0, class619 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3400(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;IIII)V")
    public class589(class328 arg0, class619 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3401(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
