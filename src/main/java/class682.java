import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class682 implements class784 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Loa;")
    private class52 field9553;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class767 field9559;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class767 field9560;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class767 field9561;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class767 field9558;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class767 field9555;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class767 field9563;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class767 field9554;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class767 field9564;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class767 field9562;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class767 field9557;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9556;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILoo;ZI)Z", line = 4)
    public final boolean method3871(class231 arg0, int arg1, int arg2, class12 arg3, boolean arg4, int arg5) {
        return this.method3886(this.nativeid, ((class767) arg0).nativeid, arg1, arg2, ((class667) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 8)
    public final void method3872(class473 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3889(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 18)
    public final void method3874(class231 arg0, class231 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3893(this.nativeid, ((class767) arg0).nativeid, ((class767) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 22)
    public final void method3876(class473 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3898(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 26)
    public final void method3877() {
        this.field9556 = null;
        this.method3897();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 33)
    public final void method3879(class418 arg0, int arg1, int arg2, int arg3) {
        this.method3881(this.nativeid, ((class674) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILoo;)V", line = 38)
    public final void method3882(class231 arg0, int[] arg1, class12 arg2) {
        this.method3880(this.nativeid, ((class767) arg0).nativeid, arg1, ((class667) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Loo;[II)V", line = 41)
    public final void method3883(class231 arg0, class12 arg1, int[] arg2, int arg3) {
        this.method3894(this.nativeid, ((class767) arg0).nativeid, ((class667) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Loo;[III)V", line = 46)
    public final void method3884(class231 arg0, class12 arg1, int[] arg2, int arg3, int arg4) {
        this.method3888(this.nativeid, ((class767) arg0).nativeid, ((class667) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILoo;Z)Z", line = 52)
    public final boolean method3887(class231 arg0, int arg1, int arg2, class12 arg3, boolean arg4) {
        return this.method3875(this.nativeid, ((class767) arg0).nativeid, arg1, arg2, ((class667) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 58)
    public final void method3890(class418 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3901(this.nativeid, ((class674) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 62)
    private final void method3891() {
        this.method3885(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 67)
    public final class231 method3892(class767 arg0, byte arg1, int arg2, boolean arg3) {
        class767 var5;
        class767 var6;
        if (arg1 == 1) {
            var5 = this.field9563;
            var6 = this.field9559;
        } else if (arg1 == 2) {
            var5 = this.field9554;
            var6 = this.field9560;
        } else if (arg1 == 3) {
            var5 = this.field9564;
            var6 = this.field9561;
        } else if (arg1 == 4) {
            var5 = this.field9562;
            var6 = this.field9558;
        } else if (arg1 == 5) {
            var5 = this.field9557;
            var6 = this.field9555;
        } else {
            var6 = var5 = new class767(this.field9553);
        }
        arg0.method4224(var6, var5, arg2, arg1 != 0, arg3);
        var6.field10551 = arg0.field10551;
        var6.field10554 = arg0.field10554;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 116)
    public final void method3896() {
        this.field9556 = Thread.currentThread();
        this.method3891();
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 120)
    public final void method450(boolean arg0) {
        this.method3900(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 124)
    private final void method3897() {
        this.method3895(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 128)
    public final void method3899(class418 arg0, int arg1, int arg2) {
        this.method3873(this.nativeid, ((class674) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 132)
    public class682(class52 arg0, int arg1, int arg2) {
        this.field9553 = arg0;
        this.field9559 = new class767(this.field9553);
        this.field9560 = new class767(this.field9553);
        this.field9561 = new class767(this.field9553);
        this.field9558 = new class767(this.field9553);
        this.field9555 = new class767(this.field9553);
        this.field9563 = new class767(this.field9553);
        this.field9554 = new class767(this.field9553);
        this.field9564 = new class767(this.field9553);
        this.field9562 = new class767(this.field9553);
        this.field9557 = new class767(this.field9553);
        this.method3878(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3873(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3875(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3878(long arg0, class473 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3880(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3881(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3885(long arg0);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3886(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3888(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3889(long arg0, class473 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3893(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3894(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3895(long arg0);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3898(long arg0, class473 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3900(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3901(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);
}
