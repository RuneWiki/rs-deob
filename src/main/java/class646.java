import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class646 implements class560 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Loa;")
    private class723 field8931;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class44 field8934;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class44 field8927;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class44 field8925;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class44 field8926;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class44 field8929;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class44 field8936;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class44 field8932;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class44 field8928;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class44 field8935;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class44 field8930;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8933;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILsk;)V")
    public final void method3599(class499 arg0, int[] arg1, class650 arg2) {
        this.method3623(this.nativeid, ((class44) arg0).nativeid, arg1, ((class294) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3600(long arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method3601() {
        this.field8933 = null;
        this.method3618();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3602(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3620(this.nativeid, ((class697) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method3603() {
        this.method3619(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILsk;ZI)Z")
    public final boolean method3604(class499 arg0, int arg1, int arg2, class650 arg3, boolean arg4, int arg5) {
        return this.method3626(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class294) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3605(class66 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3606(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3606(long arg0, class66 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3607(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lsk;[III)V")
    public final void method3608(class499 arg0, class650 arg1, int[] arg2, int arg3, int arg4) {
        this.method3610(this.nativeid, ((class44) arg0).nativeid, ((class294) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lsk;[II)V")
    public final void method3609(class499 arg0, class650 arg1, int[] arg2, int arg3) {
        this.method3628(this.nativeid, ((class44) arg0).nativeid, ((class294) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3610(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3611() {
        this.field8933 = Thread.currentThread();
        this.method3603();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILsk;Z)Z")
    public final boolean method3612(class499 arg0, int arg1, int arg2, class650 arg3, boolean arg4) {
        return this.method3607(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class294) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3613(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3614(class499 arg0, class499 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3624(this.nativeid, ((class44) arg0).nativeid, ((class44) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3615(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3600(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3616(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        this.method3622(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3617(long arg0, class66 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3618() {
        this.method3629(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3619(long arg0);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3620(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3621(class296 arg0, int arg1, int arg2) {
        this.method3616(this.nativeid, ((class697) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3622(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3623(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3624(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class499 method3625(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field8936;
            var6 = this.field8934;
        } else if (arg1 == 2) {
            var5 = this.field8932;
            var6 = this.field8927;
        } else if (arg1 == 3) {
            var5 = this.field8928;
            var6 = this.field8925;
        } else if (arg1 == 4) {
            var5 = this.field8935;
            var6 = this.field8926;
        } else if (arg1 == 5) {
            var5 = this.field8930;
            var6 = this.field8929;
        } else {
            var6 = var5 = new class44(this.field8931);
        }
        arg0.method278(var6, var5, arg2, arg1 != 0, arg3);
        var6.field693 = arg0.field693;
        var6.field696 = arg0.field696;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3626(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3627(class296 arg0, int arg1, int arg2, int arg3) {
        this.method3613(this.nativeid, ((class697) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3628(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class646(class723 arg0, int arg1, int arg2) {
        this.field8931 = arg0;
        this.field8934 = new class44(this.field8931);
        this.field8927 = new class44(this.field8931);
        this.field8925 = new class44(this.field8931);
        this.field8926 = new class44(this.field8931);
        this.field8929 = new class44(this.field8931);
        this.field8936 = new class44(this.field8931);
        this.field8932 = new class44(this.field8931);
        this.field8928 = new class44(this.field8931);
        this.field8935 = new class44(this.field8931);
        this.field8930 = new class44(this.field8931);
        this.method3617(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3629(long arg0);
}
