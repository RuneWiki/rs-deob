import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class644 implements class558 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Loa;")
    private class721 field8667;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class44 field8661;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class44 field8668;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class44 field8669;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class44 field8672;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class44 field8662;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class44 field8670;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class44 field8664;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class44 field8663;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class44 field8671;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class44 field8665;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8666;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILal;ZI)Z", line = 3)
    public final boolean method3541(class497 arg0, int arg1, int arg2, class109 arg3, boolean arg4, int arg5) {
        return this.method3549(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class293) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 6)
    public final void method105(boolean arg0) {
        this.method3566(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 11)
    private final void method3542() {
        this.method3547(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 16)
    public final void method3545(class66 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3550(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class766.method4210((byte) -4, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lal;[II)V", line = 33)
    public final void method3551(class497 arg0, class109 arg1, int[] arg2, int arg3) {
        this.method3559(this.nativeid, ((class44) arg0).nativeid, ((class293) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 36)
    private final void method3552() {
        this.method3564(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 39)
    public final void method3553() {
        this.field8666 = Thread.currentThread();
        this.method3552();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 52)
    public final void method3557(class497 arg0, class497 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3544(this.nativeid, ((class44) arg0).nativeid, ((class44) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILal;)V", line = 55)
    public final void method3558(class497 arg0, int[] arg1, class109 arg2) {
        this.method3556(this.nativeid, ((class44) arg0).nativeid, arg1, ((class293) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 59)
    public final void method3560(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3543(this.nativeid, ((class695) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 62)
    public final void method3561() {
        this.field8666 = null;
        this.method3542();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lal;[III)V", line = 69)
    public final void method3563(class497 arg0, class109 arg1, int[] arg2, int arg3, int arg4) {
        this.method3568(this.nativeid, ((class44) arg0).nativeid, ((class293) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 76)
    public final class497 method3565(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field8670;
            var6 = this.field8661;
        } else if (arg1 == 2) {
            var5 = this.field8664;
            var6 = this.field8668;
        } else if (arg1 == 3) {
            var5 = this.field8663;
            var6 = this.field8669;
        } else if (arg1 == 4) {
            var5 = this.field8671;
            var6 = this.field8672;
        } else if (arg1 == 5) {
            var5 = this.field8665;
            var6 = this.field8662;
        } else {
            var6 = var5 = new class44(this.field8667);
        }
        arg0.method251(var6, var5, arg2, arg1 != 0, arg3);
        var6.field467 = arg0.field467;
        var6.field468 = arg0.field468;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 120)
    public class644(class721 arg0, int arg1, int arg2) {
        this.field8667 = arg0;
        this.field8661 = new class44(this.field8667);
        this.field8668 = new class44(this.field8667);
        this.field8669 = new class44(this.field8667);
        this.field8672 = new class44(this.field8667);
        this.field8662 = new class44(this.field8667);
        this.field8670 = new class44(this.field8667);
        this.field8664 = new class44(this.field8667);
        this.field8663 = new class44(this.field8667);
        this.field8671 = new class44(this.field8667);
        this.field8665 = new class44(this.field8667);
        this.method3548(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 135)
    public final void method3567(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3562(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILal;Z)Z", line = 139)
    public final boolean method3569(class497 arg0, int arg1, int arg2, class109 arg3, boolean arg4) {
        return this.method3555(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class293) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 142)
    public final void method3570(class295 arg0, int arg1, int arg2) {
        this.method3554(this.nativeid, ((class695) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 145)
    public final void method3571(class295 arg0, int arg1, int arg2, int arg3) {
        this.method3546(this.nativeid, ((class695) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3543(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3544(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3546(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3547(long arg0);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3548(long arg0, class66 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3549(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3550(long arg0, class66 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3554(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3555(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3556(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3559(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3562(long arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3564(long arg0);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3566(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3568(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);
}
