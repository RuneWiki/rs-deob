import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class331 extends class318 implements class784 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 3)
    public final void method747(int arg0, int arg1, class87 arg2, int arg3, int arg4) {
        this.method2094(this.nativeid, arg0, arg1, ((class303) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 7)
    public final void method742(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method2087(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 10)
    public final int method749() {
        return this.method2092(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V", line = 13)
    public final void method741(int arg0, int arg1, int arg2, int arg3) {
        this.method2090(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 22)
    public final int method737() {
        return this.method2096(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 25)
    public final int method738() {
        return this.method2085(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 28)
    public final int method736() {
        return this.method2088(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 32)
    public final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2102(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 36)
    public final void method450(boolean arg0) {
        this.method2093(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 42)
    public final void method745(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9) {
        this.method2097(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class303) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 46)
    public final void method992(int arg0, int arg1, int arg2) {
        this.method2095(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 50)
    public final void method744(int[] arg0) {
        this.method2086(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 53)
    public final void method746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2098(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 61)
    public final void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2103(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIIII)V", line = 64)
    public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2101(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 72)
    public class331(class52 arg0, int arg1, int arg2) {
        this.method2099(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 76)
    public class331(class52 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method2100(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 79)
    public class331(class52 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2089(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 83)
    public class331(class52 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method2091(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method2085(long arg0);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method2086(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method2087(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method2088(long arg0);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method2089(class52 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method2090(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method2091(class52 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method2092(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method2093(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method2094(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method2095(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method2096(long arg0);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method2097(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method2098(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method2099(class52 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method2100(class52 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method2101(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method2102(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method2103(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
