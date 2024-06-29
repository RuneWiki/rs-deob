import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class542 extends class133 implements class533 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3020(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1034(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3020(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3025(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3021(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3022(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1041(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class490 arg7, int arg8, int arg9) {
        this.method3032(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class46) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method1043() {
        return this.method3030(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3023(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method1044(int arg0, int arg1, int arg2) {
        this.method3036(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3024(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3025(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method116(boolean arg0) {
        this.method3024(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3026(class695 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3027(class695 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3028(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3029(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method1032(int arg0, int arg1, int arg2, int arg3) {
        this.method3021(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3033(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3030(long arg0);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3031(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method1031(int arg0, int arg1, class490 arg2, int arg3, int arg4) {
        this.method3034(this.nativeid, arg0, arg1, ((class46) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3031(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method1046(int[] arg0) {
        this.method3029(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3032(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3033(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3034(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3035(class695 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3036(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method1042() {
        return this.method3022(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3037(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class542(class695 arg0, int arg1, int arg2) {
        this.method3027(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class542(class695 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3026(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method1048() {
        return this.method3023(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3038(class695 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method1036() {
        return this.method3037(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class542(class695 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3038(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class542(class695 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3035(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3028(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
