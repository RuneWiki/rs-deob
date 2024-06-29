import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class542 extends class680 implements class533 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3054(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3055(class694 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method666() {
        return this.method3071(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V")
    public final void method670(int arg0, int arg1, int arg2, int arg3) {
        this.method3070(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3056(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3057(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3058(long arg0);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3056(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3059(class694 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method674() {
        return this.method3058(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method676() {
        return this.method3060(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method667(int[] arg0) {
        this.method3062(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3060(long arg0);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3061(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        this.method3057(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class542(class694 arg0, int arg1, int arg2) {
        this.method3063(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method669(int arg0, int arg1, int arg2) {
        this.method3068(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method673(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        this.method3065(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class47) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3062(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3063(class694 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3064(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class542(class694 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3067(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3065(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method668(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3054(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class542(class694 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3055(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3066(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3066(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3061(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3067(class694 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3068(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method672(int arg0, int arg1, class487 arg2, int arg3, int arg4) {
        this.method3069(this.nativeid, arg0, arg1, ((class47) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3069(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3070(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3071(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class542(class694 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3059(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3072(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3072(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method663() {
        return this.method3064(this.nativeid);
    }
}
