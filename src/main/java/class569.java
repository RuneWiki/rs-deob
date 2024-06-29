import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class569 extends class604 implements class560 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3291(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method219(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3300(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3292(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3293(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method214() {
        return this.method3299(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3294(class723 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method212(int[] arg0) {
        this.method3297(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3298(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        this.method3302(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method220() {
        return this.method3303(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3295(class723 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3296(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3297(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method224() {
        return this.method3291(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3306(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3298(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method223(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        this.method3292(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class51) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class569(class723 arg0, int arg1, int arg2) {
        this.method3294(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3299(long arg0);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3300(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3301(class723 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3302(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3296(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        this.method3304(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method211(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        this.method3307(this.nativeid, arg0, arg1, ((class51) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3303(long arg0);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method218() {
        return this.method3309(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3304(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3293(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3305(class723 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3306(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3307(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class569(class723 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3295(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3308(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3309(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class569(class723 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3301(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method641(int arg0, int arg1, int arg2) {
        this.method3308(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class569(class723 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3305(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
