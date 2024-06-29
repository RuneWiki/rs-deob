import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class569 extends class107 implements class560 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 3)
    public final int method13() {
        return this.method4182(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 8)
    public final void method20(int[] arg0) {
        this.method4194(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 14)
    public final void method121(boolean arg0) {
        this.method4183(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 17)
    public final void method25(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        this.method4189(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class48) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V", line = 22)
    public final void method24(int arg0, int arg1, int arg2, int arg3) {
        this.method4178(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 25)
    public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method4188(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 28)
    public final int method7() {
        return this.method4195(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 33)
    public final int method12() {
        return this.method4191(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 38)
    public class569(class725 arg0, int arg1, int arg2) {
        this.method4193(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 49)
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4196(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 54)
    public final void method17(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method4180(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 57)
    public final int method26() {
        return this.method4186(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 60)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4192(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 62)
    public class569(class725 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method4181(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 67)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4190(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 70)
    public final void method9(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        this.method4184(this.nativeid, arg0, arg1, ((class48) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 77)
    public final void method14(int arg0, int arg1, int arg2) {
        this.method4187(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 80)
    public class569(class725 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method4179(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 84)
    public class569(class725 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method4185(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method4178(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method4179(class725 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method4180(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method4181(class725 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method4182(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method4183(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method4184(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method4185(class725 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method4186(long arg0);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method4187(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method4188(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method4189(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method4190(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method4191(long arg0);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method4192(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method4193(class725 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method4194(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method4195(long arg0);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method4196(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
