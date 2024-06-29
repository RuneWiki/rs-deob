import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class618 implements class532 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Loa;")
    private class693 field8629;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class39 field8634;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class39 field8630;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class39 field8635;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class39 field8637;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class39 field8636;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class39 field8638;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class39 field8633;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class39 field8632;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class39 field8628;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class39 field8631;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8627;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3450(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3451(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3452(long arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3453(class278 arg0, int arg1, int arg2, int arg3) {
        this.method3450(this.nativeid, ((class667) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILnga;ZI)Z")
    public final boolean method3454(class471 arg0, int arg1, int arg2, class513 arg3, boolean arg4, int arg5) {
        return this.method3471(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class276) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method3455() {
        this.field8627 = Thread.currentThread();
        this.method3457();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3456(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3452(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method3457() {
        this.method3459(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3458(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3459(long arg0);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3460(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3461(class471 arg0, class471 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3476(this.nativeid, ((class39) arg0).nativeid, ((class39) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILnga;)V")
    public final void method3462(class471 arg0, int[] arg1, class513 arg2) {
        this.method3478(this.nativeid, ((class39) arg0).nativeid, arg1, ((class276) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3463(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILnga;Z)Z")
    public final boolean method3464(class471 arg0, int arg1, int arg2, class513 arg3, boolean arg4) {
        return this.method3458(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class276) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lnga;[III)V")
    public final void method3465(class471 arg0, class513 arg1, int[] arg2, int arg3, int arg4) {
        this.method3451(this.nativeid, ((class39) arg0).nativeid, ((class276) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3466(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class471 method3467(class39 arg0, byte arg1, int arg2, boolean arg3) {
        class39 var5;
        class39 var6;
        if (arg1 == 1) {
            var5 = this.field8638;
            var6 = this.field8634;
        } else if (arg1 == 2) {
            var5 = this.field8633;
            var6 = this.field8630;
        } else if (arg1 == 3) {
            var5 = this.field8632;
            var6 = this.field8635;
        } else if (arg1 == 4) {
            var5 = this.field8628;
            var6 = this.field8637;
        } else if (arg1 == 5) {
            var5 = this.field8631;
            var6 = this.field8636;
        } else {
            var6 = var5 = new class39(this.field8629);
        }
        arg0.method216(var6, var5, arg2, arg1 != 0, arg3);
        var6.field487 = arg0.field487;
        var6.field486 = arg0.field486;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        this.method3475(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3468(class58 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3474(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3469(long arg0, class58 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3470(class278 arg0, int arg1, int arg2) {
        this.method3472(this.nativeid, ((class667) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3471(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3472(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3473(class278 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3466(this.nativeid, ((class667) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3474(long arg0, class58 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3475(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3476(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3477() {
        this.field8627 = null;
        this.method3479();
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3478(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3479() {
        this.method3460(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lnga;[II)V")
    public final void method3480(class471 arg0, class513 arg1, int[] arg2, int arg3) {
        this.method3463(this.nativeid, ((class39) arg0).nativeid, ((class276) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class618(class693 arg0, int arg1, int arg2) {
        this.field8629 = arg0;
        this.field8634 = new class39(this.field8629);
        this.field8630 = new class39(this.field8629);
        this.field8635 = new class39(this.field8629);
        this.field8637 = new class39(this.field8629);
        this.field8636 = new class39(this.field8629);
        this.field8638 = new class39(this.field8629);
        this.field8633 = new class39(this.field8629);
        this.field8632 = new class39(this.field8629);
        this.field8628 = new class39(this.field8629);
        this.field8631 = new class39(this.field8629);
        this.method3469(this.nativeid, arg0, arg1, arg2);
    }
}
