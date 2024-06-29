import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class332 extends class85 implements class784 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 4)
    public final int method16() {
        return this.method2033(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 10)
    public final int method5() {
        return this.method2035(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 15)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2025(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 18)
    public final void method4(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method2030(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 24)
    public final int method14() {
        return this.method2042(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 27)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2039(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 33)
    public final void method7(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class88 arg7, int arg8, int arg9) {
        this.method2041(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class304) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 36)
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2040(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 39)
    public final void method9(int arg0, int arg1, class88 arg2, int arg3, int arg4) {
        this.method2031(this.nativeid, arg0, arg1, ((class304) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 44)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2037(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 49)
    public final void method277(int arg0, int arg1, int arg2) {
        this.method2038(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 52)
    public final void method444(boolean arg0) {
        this.method2026(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 58)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 64)
    public final void method3(int[] arg0) {
        this.method2029(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 70)
    public final void method2(int arg0, int arg1, int arg2, int arg3) {
        this.method2027(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 73)
    public class332(class53 arg0, int arg1, int arg2) {
        this.method2028(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 77)
    public final int method11() {
        return this.method2032(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 79)
    public class332(class53 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method2034(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 82)
    public class332(class53 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2036(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 85)
    public class332(class53 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method2043(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method2025(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method2026(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method2027(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method2028(class53 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method2029(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method2030(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method2031(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method2032(long arg0);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method2033(long arg0);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method2034(class53 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method2035(long arg0);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method2036(class53 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method2037(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method2038(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method2039(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method2040(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method2041(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method2042(long arg0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method2043(class53 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
