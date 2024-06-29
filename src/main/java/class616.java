import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class616 implements class529 {

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Loa;")
    private class691 field8909;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class39 field8907;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class39 field8901;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class39 field8911;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class39 field8912;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class39 field8906;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class39 field8902;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class39 field8905;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class39 field8908;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class39 field8903;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class39 field8904;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8910;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILkd;ZI)Z", line = 3)
    public final boolean method3542(class469 arg0, int arg1, int arg2, class280 arg3, boolean arg4, int arg5) {
        return this.method3557(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class276) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 8)
    public final class469 method3543(class39 arg0, byte arg1, int arg2, boolean arg3) {
        class39 var5;
        class39 var6;
        if (arg1 == 1) {
            var5 = this.field8902;
            var6 = this.field8907;
        } else if (arg1 == 2) {
            var5 = this.field8905;
            var6 = this.field8901;
        } else if (arg1 == 3) {
            var5 = this.field8908;
            var6 = this.field8911;
        } else if (arg1 == 4) {
            var5 = this.field8903;
            var6 = this.field8912;
        } else if (arg1 == 5) {
            var5 = this.field8904;
            var6 = this.field8906;
        } else {
            var6 = var5 = new class39(this.field8909);
        }
        arg0.method317(var6, var5, arg2, arg1 != 0, arg3);
        var6.field585 = arg0.field585;
        var6.field586 = arg0.field586;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 53)
    public final void method107(boolean arg0) {
        this.method3563(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 56)
    public final void method3545() {
        this.field8910 = Thread.currentThread();
        this.method3550();
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 66)
    public final void method3547(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3562(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 70)
    private final void method3548() {
        this.method3571(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 74)
    private final void method3550() {
        this.method3558(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 77)
    public final void method3551(class278 arg0, int arg1, int arg2, int arg3) {
        this.method3561(this.nativeid, ((class665) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILkd;Z)Z", line = 80)
    public final boolean method3552(class469 arg0, int arg1, int arg2, class280 arg3, boolean arg4) {
        return this.method3555(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class276) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 84)
    public final void method3554(class58 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3572(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 89)
    public final void method3556(class469 arg0, class469 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3553(this.nativeid, ((class39) arg0).nativeid, ((class39) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 98)
    public final void method3559(class278 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3546(this.nativeid, ((class665) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 101)
    public final void method3560(class278 arg0, int arg1, int arg2) {
        this.method3567(this.nativeid, ((class665) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILkd;)V", line = 110)
    public final void method3565(class469 arg0, int[] arg1, class280 arg2) {
        this.method3544(this.nativeid, ((class39) arg0).nativeid, arg1, ((class276) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lkd;[II)V", line = 114)
    public final void method3566(class469 arg0, class280 arg1, int[] arg2, int arg3) {
        this.method3564(this.nativeid, ((class39) arg0).nativeid, ((class276) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 120)
    public final void method3568() {
        this.field8910 = null;
        this.method3548();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lkd;[III)V", line = 125)
    public final void method3570(class469 arg0, class280 arg1, int[] arg2, int arg3, int arg4) {
        this.method3569(this.nativeid, ((class39) arg0).nativeid, ((class276) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 133)
    public class616(class691 arg0, int arg1, int arg2) {
        this.field8909 = arg0;
        this.field8907 = new class39(this.field8909);
        this.field8901 = new class39(this.field8909);
        this.field8911 = new class39(this.field8909);
        this.field8912 = new class39(this.field8909);
        this.field8906 = new class39(this.field8909);
        this.field8902 = new class39(this.field8909);
        this.field8905 = new class39(this.field8909);
        this.field8908 = new class39(this.field8909);
        this.field8903 = new class39(this.field8909);
        this.field8904 = new class39(this.field8909);
        this.method3549(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3544(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3546(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3549(long arg0, class58 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3553(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3555(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3557(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3558(long arg0);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3561(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3562(long arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3563(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3564(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3567(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3569(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3571(long arg0);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3572(long arg0, class58 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);
}
