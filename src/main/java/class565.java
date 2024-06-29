import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class565 extends class112 implements class556 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3290(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V", line = 6)
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3283(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 11)
    public final int method781() {
        return this.method3277(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 18)
    public final int method792() {
        return this.method3287(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V", line = 25)
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        this.method3278(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 30)
    public final void method787(int[] arg0) {
        this.method3288(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 35)
    public final int method789() {
        return this.method3279(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 38)
    public final int method777() {
        return this.method3282(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 42)
    public final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3280(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 46)
    public final void method794(int arg0, int arg1, int arg2) {
        this.method3281(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 49)
    public final void method793(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
        this.method3276(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class51) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 55)
    public final void method156(boolean arg0) {
        this.method3273(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 59)
    public final void method800(int arg0, int arg1, class510 arg2, int arg3, int arg4) {
        this.method3291(this.nativeid, arg0, arg1, ((class51) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(99, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 69)
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3275(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 73)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3289(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 75)
    public class565(class721 arg0, int arg1, int arg2) {
        this.method3286(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 78)
    public class565(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3284(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 82)
    public class565(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3274(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 85)
    public class565(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3285(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3273(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3274(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3275(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3276(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3277(long arg0);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3278(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3279(long arg0);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3280(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3281(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3282(long arg0);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3283(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3284(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3285(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3286(class721 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3287(long arg0);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3288(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3289(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3290(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3291(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);
}
