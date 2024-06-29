import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class544 extends class481 implements class535 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3125(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3140(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3126(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3130(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method140(int arg0, int arg1, class489 arg2, int arg3, int arg4) {
        this.method3133(this.nativeid, arg0, arg1, ((class47) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3127(long arg0);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3143(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3128(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method144() {
        return this.method3138(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3129(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method145(int arg0, int arg1, int arg2) {
        this.method3126(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        this.method3128(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3130(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3131(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.method3125(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3132(class696 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3133(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3134(class696 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3135(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method142() {
        return this.method3129(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3136(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3136(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3137(class696 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3138(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method146(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class489 arg7, int arg8, int arg9) {
        this.method3135(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class47) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3139(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3140(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3141(class696 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3142(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3143(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method143() {
        return this.method3131(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method150(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3139(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method152(int[] arg0) {
        this.method3142(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class544(class696 arg0, int arg1, int arg2) {
        this.method3132(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class544(class696 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3137(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method149() {
        return this.method3127(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class544(class696 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3141(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class544(class696 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3134(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
