import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class600 extends class392 implements class65 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method1376() {
        return this.method4428(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method1380() {
        return this.method4422(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method4422(long arg0);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method4423(class473 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4426(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4430(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method4424(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method4425(class473 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method4426(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method690(boolean arg0) {
        this.method4429(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method1377() {
        return this.method4439(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method4427(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method4428(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method4429(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method4430(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1375(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class685 arg7, int arg8, int arg9) {
        this.method4433(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class636) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, 126);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method4437(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method4431(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method4432(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
    public final void method1379(int arg0, int arg1, int arg2, int arg3) {
        this.method4435(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method1373(int[] arg0) {
        this.method4438(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method4433(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method4434(class473 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method4435(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4424(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method4436(class473 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method4437(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method1378() {
        return this.method4440(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method870(int arg0, int arg1, class685 arg2, int arg3, int arg4) {
        this.method4431(this.nativeid, arg0, arg1, ((class636) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class600(class473 arg0, int arg1, int arg2) {
        this.method4436(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class600(class473 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method4423(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4427(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method4438(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method4439(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method877(int arg0, int arg1, int arg2) {
        this.method4432(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class600(class473 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4434(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method4440(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class600(class473 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method4425(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
