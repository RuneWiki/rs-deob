import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class539 extends class131 implements class531 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 5)
    public final int method503() {
        return this.method3166(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 8)
    public final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3169(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 12)
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3175(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 21)
    public final void method500(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class485 arg7, int arg8, int arg9) {
        this.method3164(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class45) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 25)
    public final int method510() {
        return this.method3165(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 29)
    public final int method501() {
        return this.method3171(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 32)
    public final void method83(boolean arg0) {
        this.method3173(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 37)
    public final int method509() {
        return this.method3172(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 40)
    public final void method822(int arg0, int arg1, int arg2) {
        this.method3174(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 44)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3161(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V", line = 55)
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        this.method3163(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 58)
    public final void method502(int arg0, int arg1, class485 arg2, int arg3, int arg4) {
        this.method3176(this.nativeid, arg0, arg1, ((class45) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 63)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3170(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 71)
    public class539(class692 arg0, int arg1, int arg2) {
        this.method3167(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 74)
    public class539(class692 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3162(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 77)
    public class539(class692 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3177(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 81)
    public final void method506(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3160(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 83)
    public class539(class692 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3168(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3160(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3161(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3162(class692 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3163(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3164(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3165(long arg0);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3166(long arg0);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3167(class692 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3168(class692 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3169(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3170(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3171(long arg0);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3172(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3173(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3174(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3175(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3176(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3177(class692 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);
}
