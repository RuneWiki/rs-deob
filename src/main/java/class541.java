import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class541 extends class496 implements class532 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3125(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 12)
    public final void method1199(int arg0, int arg1, class487 arg2, int arg3, int arg4) {
        this.method3128(this.nativeid, arg0, arg1, ((class46) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 16)
    public final void method1625(int[] arg0) {
        this.method3124(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 19)
    public final void method129(boolean arg0) {
        this.method3116(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 22)
    public final int method1614() {
        return this.method3134(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V", line = 26)
    public final void method1615(int arg0, int arg1, int arg2, int arg3) {
        this.method3127(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 30)
    public final void method1194(int arg0, int arg1, int arg2) {
        this.method3129(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 33)
    public final void method1623(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        this.method3119(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class46) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 36)
    public final int method1619() {
        return this.method3131(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 42)
    public final void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3118(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 45)
    public final int method1626() {
        return this.method3121(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 47)
    public class541(class694 arg0, int arg1, int arg2) {
        this.method3122(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 52)
    public class541(class694 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3132(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 58)
    public class541(class694 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3123(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 64)
    public class541(class694 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3133(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 69)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 75)
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3130(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 79)
    public final void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3117(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 82)
    public final int method1618() {
        return this.method3120(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 85)
    public final void method1621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3126(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3116(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3117(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3118(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3119(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3120(long arg0);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3121(long arg0);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3122(class694 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3123(class694 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method3124(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3125(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3126(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3127(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3128(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3129(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3130(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3131(long arg0);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3132(class694 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3133(class694 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3134(long arg0);
}
