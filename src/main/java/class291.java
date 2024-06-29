import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class291 extends class116 implements class439 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "BA", descriptor = "(III)V", line = 13)
    public final void method235(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILpa;II)V", line = 20)
    public final void method236(int arg0, int arg1, class594 arg2, int arg3, int arg4) {
        this.method1799(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 24)
    public final void method712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        this.method1800(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "(IIIIII)V", line = 32)
    public final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(La;Lc;[I[BIIII)V", line = 34)
    public class291(class329 arg0, class618 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1798(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "ZA", descriptor = "(La;Lc;[I[BIIII)V")
    private final native void method1798(class329 arg0, class618 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ca", name = "KA", descriptor = "(IIII)V")
    public final native void method720(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "(IILpa;II)V")
    private final native void method1799(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "(FFFFFFLpa;II)V")
    private final native void method1800(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ca", name = "ma", descriptor = "()I")
    public final native int method714();

    @OriginalMember(owner = "client!ca", name = "la", descriptor = "()I")
    public final native int method721();

    @OriginalMember(owner = "client!ca", name = "ra", descriptor = "(IIIIIII)V")
    public final native void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!ca", name = "EA", descriptor = "()I")
    public final native int method722();

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()I")
    public final native int method718();

    @OriginalMember(owner = "client!ca", name = "DA", descriptor = "(IIIII)V")
    public final native void method237(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(IIIIIII)V")
    public final native void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "CA", descriptor = "(FFFFFFIII)V")
    public final native void method724(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);
}
