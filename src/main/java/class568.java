import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class568 extends class147 implements class559 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3185(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3176(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1098(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3183(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3169(class724 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3170(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3171(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method1084(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        this.method3178(this.nativeid, arg0, arg1, ((class50) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3172(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3173(class724 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3186(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method1105(int[] arg0) {
        this.method3175(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method1110() {
        return this.method3187(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3174(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3175(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1100(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        this.method3181(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class50) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3176(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method1081(int arg0, int arg1, int arg2) {
        this.method3182(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3177(class724 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method1107() {
        return this.method3180(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method1106() {
        return this.method3171(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method1096() {
        return this.method3184(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3178(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3179(class724 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class568(class724 arg0, int arg1, int arg2) {
        this.method3173(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3180(long arg0);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3181(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V")
    public final void method1112(int arg0, int arg1, int arg2, int arg3) {
        this.method3172(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3182(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3183(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3184(long arg0);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3185(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class568(class724 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3169(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class568(class724 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3177(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class568(class724 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3179(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3186(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method151(boolean arg0) {
        this.method3174(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3170(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3187(long arg0);
}
