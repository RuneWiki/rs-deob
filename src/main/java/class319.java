import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class319 extends class712 implements class752 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method1869(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        this.method1869(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method1870(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method1886(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method1872(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method1873(int[] arg0) {
        this.method1878(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method1874(int arg0, int arg1, int arg2, int arg3) {
        this.method1877(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1888(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1870(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method1875(long arg0);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method1876(long arg0);

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method691(int arg0, int arg1, class81 arg2, int arg3, int arg4) {
        this.method1894(this.nativeid, arg0, arg1, ((class291) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method1877(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method1878(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method1879(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method1880(class50 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method1881(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class319(class50 arg0, int arg1, int arg2) {
        this.method1889(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method1882() {
        return this.method1881(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1883(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method1872(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method1884(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method1885(class50 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method1886(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1887(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class81 arg7, int arg8, int arg9) {
        this.method1879(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class291) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method1888(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method414(boolean arg0) {
        this.method1884(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class319(class50 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1896(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class319(class50 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method1880(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method1889(class50 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method1890(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method1891(long arg0);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method1892() {
        return this.method1891(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method1893() {
        return this.method1876(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method1894(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method1895() {
        return this.method1875(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1890(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method1896(class50 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class319(class50 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method1885(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
