import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class309 extends class298 implements class2 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 3)
    public final void method1967(int[] arg0) {
        this.method2029(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 6)
    public final void method1962(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class573 arg7, int arg8, int arg9) {
        this.method2024(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class278) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 23)
    public final void method1014(int arg0, int arg1, int arg2) {
        this.method2034(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 26)
    public final void method1953(int arg0, int arg1, int arg2, int arg3) {
        this.method2021(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 29)
    public final void method12(boolean arg0) {
        this.method2032(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 33)
    public final int method1963() {
        return this.method2027(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 36)
    public final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2019(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 44)
    public final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2025(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 47)
    public final int method1955() {
        return this.method2028(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 53)
    public final void method1010(int arg0, int arg1, class573 arg2, int arg3, int arg4) {
        this.method2035(this.nativeid, arg0, arg1, ((class278) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 57)
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2020(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 61)
    public final int method1952() {
        return this.method2031(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 65)
    public final int method1961() {
        return this.method2036(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 67)
    public class309(class408 arg0, int arg1, int arg2) {
        this.method2030(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 71)
    public class309(class408 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method2022(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 75)
    public final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2026(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 78)
    public final void method1966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method2023(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 82)
    public class309(class408 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2033(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 85)
    public class309(class408 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method2018(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method2018(class408 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method2019(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method2020(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method2021(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method2022(class408 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method2023(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method2024(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method2025(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method2026(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method2027(long arg0);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method2028(long arg0);

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method2029(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method2030(class408 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method2031(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method2032(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method2033(class408 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method2034(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method2035(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method2036(long arg0);
}
