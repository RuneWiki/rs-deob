import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class643 implements class556 {

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Loa;")
    private class721 field9058;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class44 field9051;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class44 field9054;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class44 field9056;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class44 field9047;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class44 field9048;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class44 field9050;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class44 field9057;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class44 field9053;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class44 field9049;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class44 field9055;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9052;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Leh;[II)V", line = 5)
    public final void method3650(class495 arg0, class378 arg1, int[] arg2, int arg3) {
        this.method3649(this.nativeid, ((class44) arg0).nativeid, ((class290) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 8)
    public final void method3651(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3676(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 11)
    public final void method3652() {
        this.field9052 = Thread.currentThread();
        this.method3655();
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(64, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 24)
    public final void method3654(class292 arg0, int arg1, int arg2) {
        this.method3657(this.nativeid, ((class695) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 27)
    private final void method3655() {
        this.method3659(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 34)
    public final void method3658(class292 arg0, int arg1, int arg2, int arg3) {
        this.method3674(this.nativeid, ((class695) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 39)
    public final void method3660() {
        this.field9052 = null;
        this.method3679();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 46)
    public final class495 method3661(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field9050;
            var6 = this.field9051;
        } else if (arg1 == 2) {
            var5 = this.field9057;
            var6 = this.field9054;
        } else if (arg1 == 3) {
            var5 = this.field9053;
            var6 = this.field9056;
        } else if (arg1 == 4) {
            var5 = this.field9049;
            var6 = this.field9047;
        } else if (arg1 == 5) {
            var5 = this.field9055;
            var6 = this.field9048;
        } else {
            var6 = var5 = new class44(this.field9058);
        }
        arg0.method302(var6, var5, arg2, arg1 != 0, arg3);
        var6.field652 = arg0.field652;
        var6.field651 = arg0.field651;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 93)
    public final void method3664(class495 arg0, class495 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3668(this.nativeid, ((class44) arg0).nativeid, ((class44) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILeh;Z)Z", line = 97)
    public final boolean method3666(class495 arg0, int arg1, int arg2, class378 arg3, boolean arg4) {
        return this.method3653(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class290) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Leh;[III)V", line = 100)
    public final void method3667(class495 arg0, class378 arg1, int[] arg2, int arg3, int arg4) {
        this.method3675(this.nativeid, ((class44) arg0).nativeid, ((class290) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILeh;ZI)Z", line = 106)
    public final boolean method3669(class495 arg0, int arg1, int arg2, class378 arg3, boolean arg4, int arg5) {
        return this.method3670(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class290) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 111)
    public final void method3671(class292 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3662(this.nativeid, ((class695) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILeh;)V", line = 115)
    public final void method3673(class495 arg0, int[] arg1, class378 arg2) {
        this.method3672(this.nativeid, ((class44) arg0).nativeid, arg1, ((class290) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 122)
    public final void method156(boolean arg0) {
        this.method3656(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 125)
    public class643(class721 arg0, int arg1, int arg2) {
        this.field9058 = arg0;
        this.field9051 = new class44(this.field9058);
        this.field9054 = new class44(this.field9058);
        this.field9056 = new class44(this.field9058);
        this.field9047 = new class44(this.field9058);
        this.field9048 = new class44(this.field9058);
        this.field9050 = new class44(this.field9058);
        this.field9057 = new class44(this.field9058);
        this.field9053 = new class44(this.field9058);
        this.field9049 = new class44(this.field9058);
        this.field9055 = new class44(this.field9058);
        this.method3663(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 140)
    public final void method3677(class66 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3665(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 145)
    private final void method3679() {
        this.method3678(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3649(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3653(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3656(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3657(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3659(long arg0);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3662(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3663(long arg0, class66 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3665(long arg0, class66 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3668(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3670(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3672(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3674(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3675(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3676(long arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3678(long arg0);
}
