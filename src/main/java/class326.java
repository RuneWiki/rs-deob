import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class326 extends class772 implements class2 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method1884(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method620() {
        return this.method1893(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1885(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method1885(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method1886(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method615(int[] arg0) {
        this.method1901(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method1887(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method1888(class426 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method623() {
        return this.method1894(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method1889(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method617(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class596 arg7, int arg8, int arg9) {
        this.method1896(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class293) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method1890(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method5(boolean arg0) {
        this.method1890(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method1891(class426 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method1892(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method1893(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1898(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method1894(long arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method627(int arg0, int arg1, int arg2) {
        this.method1895(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method626(int arg0, int arg1, int arg2, int arg3) {
        this.method1884(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1887(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method1895(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method1896(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method1897(long arg0);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method628() {
        return this.method1897(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method1898(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method1886(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method621(int arg0, int arg1, class596 arg2, int arg3, int arg4) {
        this.method1892(this.nativeid, arg0, arg1, ((class293) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method1899(long arg0);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1889(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method1900(class426 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class326(class426 arg0, int arg1, int arg2) {
        this.method1902(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method612() {
        return this.method1899(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method1901(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method1902(class426 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class326(class426 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1900(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class326(class426 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1888(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class326(class426 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1891(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
