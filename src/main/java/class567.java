import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class567 extends class140 implements class558 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class766.method4210((byte) -4, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 10)
    public final void method345(int arg0, int arg1, int arg2) {
        this.method3234(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 13)
    public final void method346(int[] arg0) {
        this.method3223(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 24)
    public final void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3235(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 26)
    public class567(class721 arg0, int arg1, int arg2) {
        this.method3240(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 34)
    public final int method340() {
        return this.method3238(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 37)
    public final void method105(boolean arg0) {
        this.method3232(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 40)
    public final int method350() {
        return this.method3230(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 44)
    public final int method343() {
        return this.method3231(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 50)
    public final void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3229(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 53)
    public final void method352(int arg0, int arg1, class512 arg2, int arg3, int arg4) {
        this.method3228(this.nativeid, arg0, arg1, ((class51) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 55)
    public class567(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3233(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V", line = 60)
    public final void method347(int arg0, int arg1, int arg2, int arg3) {
        this.method3226(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 64)
    public final int method351() {
        return this.method3224(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 67)
    public final void method356(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
        this.method3222(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class51) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 70)
    public final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3239(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 73)
    public class567(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3227(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 76)
    public class567(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3237(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V", line = 80)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3225(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 84)
    public final void method353(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3236(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3222(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3223(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3224(long arg0);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3225(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3226(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3227(class721 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3228(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3229(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3230(long arg0);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3231(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3232(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3233(class721 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3234(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3235(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3236(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3237(class721 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3238(long arg0);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3239(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3240(class721 arg0, int arg1, int arg2);
}
