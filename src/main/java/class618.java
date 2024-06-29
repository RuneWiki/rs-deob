import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class618 implements class533 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Loa;")
    private class694 field8671;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class40 field8666;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class40 field8667;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class40 field8669;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class40 field8672;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class40 field8663;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class40 field8668;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class40 field8670;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class40 field8661;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class40 field8665;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class40 field8664;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8662;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3477(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3478(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method3479() {
        this.method3492(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3480(class281 arg0, int arg1, int arg2, int arg3) {
        this.method3485(this.nativeid, ((class668) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class472 method3481(class40 arg0, byte arg1, int arg2, boolean arg3) {
        class40 var5;
        class40 var6;
        if (arg1 == 1) {
            var5 = this.field8668;
            var6 = this.field8666;
        } else if (arg1 == 2) {
            var5 = this.field8670;
            var6 = this.field8667;
        } else if (arg1 == 3) {
            var5 = this.field8661;
            var6 = this.field8669;
        } else if (arg1 == 4) {
            var5 = this.field8665;
            var6 = this.field8672;
        } else if (arg1 == 5) {
            var5 = this.field8664;
            var6 = this.field8663;
        } else {
            var6 = var5 = new class40(this.field8671);
        }
        arg0.method199(var6, var5, arg2, arg1 != 0, arg3);
        var6.field411 = arg0.field411;
        var6.field412 = arg0.field412;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3482(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3483(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3493(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3484(long arg0, class60 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3485(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method3486() {
        this.field8662 = null;
        this.method3495();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3487(class472 arg0, class472 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3498(this.nativeid, ((class40) arg0).nativeid, ((class40) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3488(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3489() {
        this.field8662 = Thread.currentThread();
        this.method3479();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3490(class60 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3491(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3491(long arg0, class60 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3492(long arg0);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3493(long arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILhba;)V")
    public final void method3494(class472 arg0, int[] arg1, class10 arg2) {
        this.method3496(this.nativeid, ((class40) arg0).nativeid, arg1, ((class279) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3495() {
        this.method3499(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        this.method3501(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3496(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3497(class281 arg0, int arg1, int arg2) {
        this.method3502(this.nativeid, ((class668) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3498(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3499(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lhba;[III)V")
    public final void method3500(class472 arg0, class10 arg1, int[] arg2, int arg3, int arg4) {
        this.method3477(this.nativeid, ((class40) arg0).nativeid, ((class279) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3501(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3502(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3503(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILhba;ZI)Z")
    public final boolean method3504(class472 arg0, int arg1, int arg2, class10 arg3, boolean arg4, int arg5) {
        return this.method3488(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class279) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3505(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3482(this.nativeid, ((class668) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lhba;[II)V")
    public final void method3506(class472 arg0, class10 arg1, int[] arg2, int arg3) {
        this.method3478(this.nativeid, ((class40) arg0).nativeid, ((class279) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILhba;Z)Z")
    public final boolean method3507(class472 arg0, int arg1, int arg2, class10 arg3, boolean arg4) {
        return this.method3503(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class279) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class618(class694 arg0, int arg1, int arg2) {
        this.field8671 = arg0;
        this.field8666 = new class40(this.field8671);
        this.field8667 = new class40(this.field8671);
        this.field8669 = new class40(this.field8671);
        this.field8672 = new class40(this.field8671);
        this.field8663 = new class40(this.field8671);
        this.field8668 = new class40(this.field8671);
        this.field8670 = new class40(this.field8671);
        this.field8661 = new class40(this.field8671);
        this.field8665 = new class40(this.field8671);
        this.field8664 = new class40(this.field8671);
        this.method3484(this.nativeid, arg0, arg1, arg2);
    }
}
