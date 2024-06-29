import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class621 implements class534 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Loa;")
    private class696 field8723;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class40 field8721;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class40 field8716;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class40 field8715;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class40 field8718;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class40 field8719;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class40 field8717;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class40 field8722;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class40 field8714;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class40 field8720;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class40 field8724;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8713;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lql;[II)V")
    public final void method3567(class473 arg0, class738 arg1, int[] arg2, int arg3) {
        this.method3590(this.nativeid, ((class40) arg0).nativeid, ((class278) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILql;Z)Z")
    public final boolean method3568(class473 arg0, int arg1, int arg2, class738 arg3, boolean arg4) {
        return this.method3569(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class278) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3569(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3570(long arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3571(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILql;)V")
    public final void method3572(class473 arg0, int[] arg1, class738 arg2) {
        this.method3595(this.nativeid, ((class40) arg0).nativeid, arg1, ((class278) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3573(class280 arg0, int arg1, int arg2) {
        this.method3578(this.nativeid, ((class670) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3574(class473 arg0, class473 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3587(this.nativeid, ((class40) arg0).nativeid, ((class40) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3575(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3582(this.nativeid, ((class670) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3576(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lql;[III)V")
    public final void method3577(class473 arg0, class738 arg1, int[] arg2, int arg3, int arg4) {
        this.method3589(this.nativeid, ((class40) arg0).nativeid, ((class278) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3578(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILql;ZI)Z")
    public final boolean method3579(class473 arg0, int arg1, int arg2, class738 arg3, boolean arg4, int arg5) {
        return this.method3576(this.nativeid, ((class40) arg0).nativeid, arg1, arg2, ((class278) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3580(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3581(class280 arg0, int arg1, int arg2, int arg3) {
        this.method3580(this.nativeid, ((class670) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3582(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method3583() {
        this.field8713 = Thread.currentThread();
        this.method3591();
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method3584() {
        this.method3571(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class473 method3585(class40 arg0, byte arg1, int arg2, boolean arg3) {
        class40 var5;
        class40 var6;
        if (arg1 == 1) {
            var5 = this.field8717;
            var6 = this.field8721;
        } else if (arg1 == 2) {
            var5 = this.field8722;
            var6 = this.field8716;
        } else if (arg1 == 3) {
            var5 = this.field8714;
            var6 = this.field8715;
        } else if (arg1 == 4) {
            var5 = this.field8720;
            var6 = this.field8718;
        } else if (arg1 == 5) {
            var5 = this.field8724;
            var6 = this.field8719;
        } else {
            var6 = var5 = new class40(this.field8723);
        }
        arg0.method249(var6, var5, arg2, arg1 != 0, arg3);
        var6.field442 = arg0.field442;
        var6.field441 = arg0.field441;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3586(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3570(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3587(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3588() {
        this.field8713 = null;
        this.method3584();
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3589(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3590(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3591() {
        this.method3594(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3592(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3593(long arg0, class60 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3594(long arg0);

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method105(boolean arg0) {
        this.method3592(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3595(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3596(class60 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3593(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3597(long arg0, class60 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class621(class696 arg0, int arg1, int arg2) {
        this.field8723 = arg0;
        this.field8721 = new class40(this.field8723);
        this.field8716 = new class40(this.field8723);
        this.field8715 = new class40(this.field8723);
        this.field8718 = new class40(this.field8723);
        this.field8719 = new class40(this.field8723);
        this.field8717 = new class40(this.field8723);
        this.field8722 = new class40(this.field8723);
        this.field8714 = new class40(this.field8723);
        this.field8720 = new class40(this.field8723);
        this.field8724 = new class40(this.field8723);
        this.method3597(this.nativeid, arg0, arg1, arg2);
    }
}
