import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class620 implements class535 {

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Loa;")
    private class696 field8552;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class40 field8551;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class40 field8549;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class40 field8543;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class40 field8547;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class40 field8544;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class40 field8545;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class40 field8548;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class40 field8553;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class40 field8546;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class40 field8550;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8554;

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method3460() {
        this.method3469(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILpda;ZI)Z")
    public final boolean method3461(class474 arg0, int arg1, int arg2, class631 arg3, boolean arg4, int arg5) {
        return this.method3479(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class280) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILpda;)V")
    public final void method3462(class474 arg0, int[] arg1, class631 arg2) {
        this.method3476(this.nativeid, ((class40) arg0).nativeid, arg1, ((class280) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        this.method3484(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3463(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3464(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3482(this.nativeid, ((class670) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3465(long arg0, class60 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILpda;Z)Z")
    public final boolean method3466(class474 arg0, int arg1, int arg2, class631 arg3, boolean arg4) {
        return this.method3473(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class280) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3467(class60 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3487(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method3468() {
        this.field8554 = null;
        this.method3477();
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3469(long arg0);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3470(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3471(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3472(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3473(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3474(long arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3475(class282 arg0, int arg1, int arg2, int arg3) {
        this.method3489(this.nativeid, ((class670) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3476(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    private final void method3477() {
        this.method3480(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public final void method3478() {
        this.field8554 = Thread.currentThread();
        this.method3460();
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3479(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3480(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class474 method3481(class40 arg0, byte arg1, int arg2, boolean arg3) {
        class40 var5;
        class40 var6;
        if (arg1 == 1) {
            var5 = this.field8545;
            var6 = this.field8551;
        } else if (arg1 == 2) {
            var5 = this.field8548;
            var6 = this.field8549;
        } else if (arg1 == 3) {
            var5 = this.field8553;
            var6 = this.field8543;
        } else if (arg1 == 4) {
            var5 = this.field8546;
            var6 = this.field8547;
        } else if (arg1 == 5) {
            var5 = this.field8550;
            var6 = this.field8544;
        } else {
            var6 = var5 = new class40(this.field8552);
        }
        arg0.method261(var6, var5, arg2, arg1 != 0, arg3);
        var6.field609 = arg0.field609;
        var6.field611 = arg0.field611;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3482(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3483(class474 arg0, class474 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3471(this.nativeid, ((class40) arg0).nativeid, ((class40) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3484(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lpda;[II)V")
    public final void method3485(class474 arg0, class631 arg1, int[] arg2, int arg3) {
        this.method3463(this.nativeid, ((class40) arg0).nativeid, ((class280) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3486(class282 arg0, int arg1, int arg2) {
        this.method3470(this.nativeid, ((class670) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3487(long arg0, class60 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3488(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3474(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3489(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lpda;[III)V")
    public final void method3490(class474 arg0, class631 arg1, int[] arg2, int arg3, int arg4) {
        this.method3472(this.nativeid, ((class40) arg0).nativeid, ((class280) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class620(class696 arg0, int arg1, int arg2) {
        this.field8552 = arg0;
        this.field8551 = new class40(this.field8552);
        this.field8549 = new class40(this.field8552);
        this.field8543 = new class40(this.field8552);
        this.field8547 = new class40(this.field8552);
        this.field8544 = new class40(this.field8552);
        this.field8545 = new class40(this.field8552);
        this.field8548 = new class40(this.field8552);
        this.field8553 = new class40(this.field8552);
        this.field8546 = new class40(this.field8552);
        this.field8550 = new class40(this.field8552);
        this.method3465(this.nativeid, arg0, arg1, arg2);
    }
}
