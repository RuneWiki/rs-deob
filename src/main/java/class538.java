import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class538 extends class743 implements class529 {

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V", line = 6)
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        this.method3151(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 12)
    public final int method95() {
        return this.method3164(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFIIII)V", line = 15)
    public final void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3153(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILaa;II)V", line = 22)
    public final void method90(int arg0, int arg1, class484 arg2, int arg3, int arg4) {
        this.method3156(this.nativeid, arg0, arg1, ((class45) arg2).nativeid, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 25)
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3152(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIII)V", line = 28)
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3150(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "w", descriptor = "(Z)V", line = 35)
    public final void method107(boolean arg0) {
        this.method3159(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 38)
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3166(this.nativeid, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 41)
    public final void method81(int arg0, int arg1, int arg2) {
        this.method3163(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 44)
    public final int method93() {
        return this.method3158(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 56)
    public final int method82() {
        return this.method3165(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 64)
    public final void method92(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class484 arg7, int arg8, int arg9) {
        this.method3160(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, ((class45) arg7).nativeid, arg8, arg9);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 67)
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method3161(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I", line = 70)
    public final int method83() {
        return this.method3149(this.nativeid);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;II)V", line = 72)
    public class538(class691 arg0, int arg1, int arg2) {
        this.method3154(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[IIIIIZ)V", line = 75)
    public class538(class691 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3157(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;[I[B[BIIII)V", line = 79)
    public class538(class691 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3155(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Loa;IIIIZ)V", line = 82)
    public class538(class691 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3162(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!j", name = "JA", descriptor = "(J)I")
    private final native int method3149(long arg0);

    @OriginalMember(owner = "client!j", name = "RA", descriptor = "(JIIIIIIII)V")
    private final native void method3150(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "(JIIII)V")
    private final native void method3151(long arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!j", name = "YA", descriptor = "(JIIIIII)V")
    private final native void method3152(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(JFFFFFFIIII)V")
    private final native void method3153(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, int arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "(Loa;II)V")
    private final native void method3154(class691 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "ma", descriptor = "(Loa;[I[B[BIIII)V")
    private final native void method3155(class691 arg0, int[] arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(JIIJII)V")
    private final native void method3156(long arg0, int arg1, int arg2, long arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(Loa;[IIIIIZ)V")
    private final native void method3157(class691 arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "(J)I")
    private final native int method3158(long arg0);

    @OriginalMember(owner = "client!j", name = "R", descriptor = "(JZ)V")
    private final native void method3159(long arg0, boolean arg1);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(JFFFFFFIJII)V")
    private final native void method3160(long arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, int arg7, long arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "(JIIIIIII)V")
    private final native void method3161(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(Loa;IIIIZ)V")
    private final native void method3162(class691 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "(JIII)V")
    private final native void method3163(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(J)I")
    private final native int method3164(long arg0);

    @OriginalMember(owner = "client!j", name = "wa", descriptor = "(J)I")
    private final native int method3165(long arg0);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "(JIIIII)V")
    private final native void method3166(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
