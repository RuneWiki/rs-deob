import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class307 extends class515 implements class2 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method1905(class406 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method1906(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method1907(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method777() {
        return this.method1912(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method1908(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1919(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method1909(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method1909(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method1910(class406 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method784() {
        return this.method1911(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method1911(long arg0);

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method780() {
        return this.method1922(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method1912(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method782(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class569 arg7, int arg8, int arg9) {
        this.method1920(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class276) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method787() {
        return this.method1921(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method1913(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1914(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method1914(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method1915(class406 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method1916(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method1917(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method1918(class406 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method781(int arg0, int arg1, class569 arg2, int arg3, int arg4) {
        this.method1907(this.nativeid, arg0, arg1, ((class276) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method1919(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method808(int arg0, int arg1, int arg2) {
        this.method1913(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        this.method1908(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method1920(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1916(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method1921(long arg0);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
    public final void method783(int arg0, int arg1, int arg2, int arg3) {
        this.method1906(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class307(class406 arg0, int arg1, int arg2) {
        this.method1915(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method1922(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1917(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class307(class406 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1905(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class307(class406 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1918(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class307(class406 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1910(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
