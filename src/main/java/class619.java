import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class619 implements class532 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Loa;")
    private class694 field8437;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class40 field8428;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class40 field8433;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class40 field8430;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class40 field8438;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class40 field8427;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class40 field8432;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class40 field8429;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class40 field8431;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class40 field8435;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class40 field8436;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8434;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3504(class281 arg0, int arg1, int arg2) {
        this.method3529(this.nativeid, ((class668) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3505(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILbca;ZI)Z")
    public final boolean method3506(class472 arg0, int arg1, int arg2, class661 arg3, boolean arg4, int arg5) {
        return this.method3512(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class279) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3507(class472 arg0, class472 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3521(this.nativeid, ((class40) arg0).nativeid, ((class40) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3508(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3509(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3510(long arg0);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lbca;[II)V")
    public final void method3511(class472 arg0, class661 arg1, int[] arg2, int arg3) {
        this.method3530(this.nativeid, ((class40) arg0).nativeid, ((class279) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3512(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILbca;Z)Z")
    public final boolean method3513(class472 arg0, int arg1, int arg2, class661 arg3, boolean arg4) {
        return this.method3505(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class279) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3514(class281 arg0, int arg1, int arg2, int arg3) {
        this.method3525(this.nativeid, ((class668) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method129(boolean arg0) {
        this.method3508(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3515(class281 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3524(this.nativeid, ((class668) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lbca;[III)V")
    public final void method3516(class472 arg0, class661 arg1, int[] arg2, int arg3, int arg4) {
        this.method3520(this.nativeid, ((class40) arg0).nativeid, ((class279) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3517(long arg0, class59 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3518(long arg0, class59 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3519(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3517(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3520(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3521(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILbca;)V")
    public final void method3522(class472 arg0, int[] arg1, class661 arg2) {
        this.method3509(this.nativeid, ((class40) arg0).nativeid, arg1, ((class279) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class472 method3523(class40 arg0, byte arg1, int arg2, boolean arg3) {
        class40 var5;
        class40 var6;
        if (arg1 == 1) {
            var5 = this.field8432;
            var6 = this.field8428;
        } else if (arg1 == 2) {
            var5 = this.field8429;
            var6 = this.field8433;
        } else if (arg1 == 3) {
            var5 = this.field8431;
            var6 = this.field8430;
        } else if (arg1 == 4) {
            var5 = this.field8435;
            var6 = this.field8438;
        } else if (arg1 == 5) {
            var5 = this.field8436;
            var6 = this.field8427;
        } else {
            var6 = var5 = new class40(this.field8437);
        }
        arg0.method489(var6, var5, arg2, arg1 != 0, arg3);
        var6.field964 = arg0.field964;
        var6.field963 = arg0.field963;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3524(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3525(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method3526() {
        this.method3510(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method3527() {
        this.field8434 = Thread.currentThread();
        this.method3534();
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3528(long arg0);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3529(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3530(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3531(class59 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3518(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3532(long arg0, class59 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3533() {
        this.field8434 = null;
        this.method3526();
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3534() {
        this.method3528(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class619(class694 arg0, int arg1, int arg2) {
        this.field8437 = arg0;
        this.field8428 = new class40(this.field8437);
        this.field8433 = new class40(this.field8437);
        this.field8430 = new class40(this.field8437);
        this.field8438 = new class40(this.field8437);
        this.field8427 = new class40(this.field8437);
        this.field8432 = new class40(this.field8437);
        this.field8429 = new class40(this.field8437);
        this.field8431 = new class40(this.field8437);
        this.field8435 = new class40(this.field8437);
        this.field8436 = new class40(this.field8437);
        this.method3532(this.nativeid, arg0, arg1, arg2);
    }
}
