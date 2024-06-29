import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class567 extends class581 implements class558 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4233(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method997() {
        return this.method4231(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method4226(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method4227(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method988() {
        return this.method4243(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -108, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method4228(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method992(int arg0, int arg1, int arg2) {
        this.method4228(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method4229(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method4230(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1001(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
        this.method4227(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class51) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method4231(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method989(int arg0, int arg1, class512 arg2, int arg3, int arg4) {
        this.method4235(this.nativeid, arg0, arg1, ((class51) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method4232(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method4233(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method986() {
        return this.method4240(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method4234(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
    public final void method990(int arg0, int arg1, int arg2, int arg3) {
        this.method4232(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method991() {
        return this.method4236(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method4235(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method4236(long arg0);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method4237(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method4238(class721 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4242(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4234(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method4239(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class567(class721 arg0, int arg1, int arg2) {
        this.method4238(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method4240(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1000(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method4226(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method4241(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method4242(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
        this.method4239(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method4243(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method994(int[] arg0) {
        this.method4237(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4241(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method4244(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class567(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method4230(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class567(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4244(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class567(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method4229(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
