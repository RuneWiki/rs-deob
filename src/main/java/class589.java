import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class589 extends class116 implements class439 {

    @OriginalMember(owner = "client!va", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!va", name = "ea", descriptor = "(IILpa;II)V")
    private final native void method3434(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "P", descriptor = "(IIIIII)V")
    public final native void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "DA", descriptor = "(IIIII)V")
    public final native void method237(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!va", name = "EA", descriptor = "()I")
    public final native int method722();

    @OriginalMember(owner = "client!va", name = "KA", descriptor = "(IIII)V")
    public final native void method720(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(La;Lc;[IIIII)V")
    private final native void method3435(class329 arg0, class618 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        this.method3437(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!va", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method724(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
    public final native int method718();

    @OriginalMember(owner = "client!va", name = "ma", descriptor = "()I")
    public final native int method714();

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(IIIIIII)V")
    public final native void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(La;Lc;IIII)V")
    private final native void method3436(class329 arg0, class618 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!va", name = "la", descriptor = "()I")
    public final native int method721();

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;[IIIII)V")
    public class589(class329 arg0, class618 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3435(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!va", name = "v", descriptor = "(FFFFFFLpa;II)V")
    private final native void method3437(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILpa;II)V")
    public final void method236(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        this.method3434(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(La;Lc;IIII)V")
    public class589(class329 arg0, class618 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3436(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!va", name = "BA", descriptor = "(III)V")
    public final native void method235(int arg0, int arg1, int arg2);
}
