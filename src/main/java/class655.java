import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class655 implements class752 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Loa;")
    private class50 field9017;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class735 field9012;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class735 field9013;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class735 field9014;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class735 field9015;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class735 field9016;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class735 field9010;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class735 field9009;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class735 field9008;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class735 field9011;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class735 field9007;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9018;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 3)
    public final void method3534(class402 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3538(this.nativeid, ((class647) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lwc;[II)V", line = 13)
    public final void method3535(class219 arg0, class376 arg1, int[] arg2, int arg3) {
        this.method3553(this.nativeid, ((class735) arg0).nativeid, ((class640) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 18)
    public final class219 method3536(class735 arg0, byte arg1, int arg2, boolean arg3) {
        class735 var5;
        class735 var6;
        if (arg1 == 1) {
            var5 = this.field9010;
            var6 = this.field9012;
        } else if (arg1 == 2) {
            var5 = this.field9009;
            var6 = this.field9013;
        } else if (arg1 == 3) {
            var5 = this.field9008;
            var6 = this.field9014;
        } else if (arg1 == 4) {
            var5 = this.field9011;
            var6 = this.field9015;
        } else if (arg1 == 5) {
            var5 = this.field9007;
            var6 = this.field9016;
        } else {
            var6 = var5 = new class735(this.field9017);
        }
        arg0.method4114(var6, var5, arg2, arg1 != 0, arg3);
        var6.field10279 = arg0.field10279;
        var6.field10282 = arg0.field10282;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 66)
    public final void method3539() {
        this.field9018 = null;
        this.method3545();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 71)
    public final void method3541(class402 arg0, int arg1, int arg2, int arg3) {
        this.method3555(this.nativeid, ((class647) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 76)
    public final void method3543(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3547(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 80)
    public final void method414(boolean arg0) {
        this.method3561(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 84)
    private final void method3545() {
        this.method3542(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILwc;)V", line = 91)
    public final void method3546(class219 arg0, int[] arg1, class376 arg2) {
        this.method3559(this.nativeid, ((class735) arg0).nativeid, arg1, ((class640) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 96)
    public final void method3548(class454 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3544(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 100)
    private final void method3550() {
        this.method3540(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILwc;Z)Z", line = 108)
    public final boolean method3554(class219 arg0, int arg1, int arg2, class376 arg3, boolean arg4) {
        return this.method3537(this.nativeid, ((class735) arg0).nativeid, arg1, arg2, ((class640) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 113)
    public final void method3556(class219 arg0, class219 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3549(this.nativeid, ((class735) arg0).nativeid, ((class735) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 116)
    public final void method3557() {
        this.field9018 = Thread.currentThread();
        this.method3550();
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 120)
    public class655(class50 arg0, int arg1, int arg2) {
        this.field9017 = arg0;
        this.field9012 = new class735(this.field9017);
        this.field9013 = new class735(this.field9017);
        this.field9014 = new class735(this.field9017);
        this.field9015 = new class735(this.field9017);
        this.field9016 = new class735(this.field9017);
        this.field9010 = new class735(this.field9017);
        this.field9009 = new class735(this.field9017);
        this.field9008 = new class735(this.field9017);
        this.field9011 = new class735(this.field9017);
        this.field9007 = new class735(this.field9017);
        this.method3552(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 136)
    public final void method3560(class402 arg0, int arg1, int arg2) {
        this.method3558(this.nativeid, ((class647) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILwc;ZI)Z", line = 140)
    public final boolean method3562(class219 arg0, int arg1, int arg2, class376 arg3, boolean arg4, int arg5) {
        return this.method3563(this.nativeid, ((class735) arg0).nativeid, arg1, arg2, ((class640) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lwc;[III)V", line = 145)
    public final void method3564(class219 arg0, class376 arg1, int[] arg2, int arg3, int arg4) {
        this.method3551(this.nativeid, ((class735) arg0).nativeid, ((class640) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3537(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3538(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3540(long arg0);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3542(long arg0);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3544(long arg0, class454 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3547(long arg0, class454 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3549(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3551(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3552(long arg0, class454 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3553(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3555(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3558(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3559(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3561(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3563(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);
}
