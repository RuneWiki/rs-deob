import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class307 extends class34 implements class2 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public final int method184() {
        return this.method2033(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method2017(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method177() {
        return this.method2028(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method2018(class406 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method2019(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method2020(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        this.method2030(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method180(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class570 arg7, int arg8, int arg9) {
        this.method2019(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class276) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method2021(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method2022(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V")
    public final void method5(boolean arg0) {
        this.method2022(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method2023(class406 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method2024(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2017(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "CA", descriptor = "(J[I)V")
    private final native void method2025(long arg0, int[] arg1);

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class389.method2431(this, 98);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method2026(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V")
    public final void method52(int arg0, int arg1, class570 arg2, int arg3, int arg4) {
        this.method2020(this.nativeid, arg0, arg1, ((class276) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method2027(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method2028(long arg0);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method2029(class406 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method2030(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method2031(class406 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2027(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2021(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method2032(long arg0);

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method2033(long arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V")
    public class307(class406 arg0, int arg1, int arg2) {
        this.method2018(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
    public final void method186(int[] arg0) {
        this.method2025(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
    public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2024(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public final int method175() {
        return this.method2034(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method173(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method2026(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method51(int arg0, int arg1, int arg2) {
        this.method2035(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public final int method179() {
        return this.method2032(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method2034(long arg0);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method2035(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V")
    public class307(class406 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method2029(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V")
    public class307(class406 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2031(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V")
    public class307(class406 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method2023(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
