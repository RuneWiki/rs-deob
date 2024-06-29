import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class682 implements class784 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Loa;")
    private class53 field9669;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class767 field9672;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class767 field9670;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class767 field9666;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class767 field9674;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class767 field9677;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class767 field9675;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class767 field9673;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class767 field9676;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class767 field9671;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class767 field9667;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9668;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Ldm;[II)V", line = 3)
    public final void method3839(class233 arg0, class765 arg1, int[] arg2, int arg3) {
        this.method3844(this.nativeid, ((class767) arg0).nativeid, ((class669) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 6)
    public final void method3840(class233 arg0, class233 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3847(this.nativeid, ((class767) arg0).nativeid, ((class767) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILdm;Z)Z", line = 10)
    public final boolean method3841(class233 arg0, int arg1, int arg2, class765 arg3, boolean arg4) {
        return this.method3846(this.nativeid, ((class767) arg0).nativeid, arg1, arg2, ((class669) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 15)
    public final void method3843(class419 arg0, int arg1, int arg2, int arg3) {
        this.method3842(this.nativeid, ((class676) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 24)
    public final void method3845(class419 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3864(this.nativeid, ((class676) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 35)
    public final class233 method3850(class767 arg0, byte arg1, int arg2, boolean arg3) {
        class767 var5;
        class767 var6;
        if (arg1 == 1) {
            var5 = this.field9675;
            var6 = this.field9672;
        } else if (arg1 == 2) {
            var5 = this.field9673;
            var6 = this.field9670;
        } else if (arg1 == 3) {
            var5 = this.field9676;
            var6 = this.field9666;
        } else if (arg1 == 4) {
            var5 = this.field9671;
            var6 = this.field9674;
        } else if (arg1 == 5) {
            var5 = this.field9667;
            var6 = this.field9677;
        } else {
            var6 = var5 = new class767(this.field9669);
        }
        arg0.method4242(var6, var5, arg2, arg1 != 0, arg3);
        var6.field10599 = arg0.field10599;
        var6.field10600 = arg0.field10600;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 79)
    public final void method3851() {
        this.field9668 = Thread.currentThread();
        this.method3852();
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 83)
    private final void method3852() {
        this.method3860(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILdm;ZI)Z", line = 87)
    public final boolean method3853(class233 arg0, int arg1, int arg2, class765 arg3, boolean arg4, int arg5) {
        return this.method3848(this.nativeid, ((class767) arg0).nativeid, arg1, arg2, ((class669) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 91)
    public final void method444(boolean arg0) {
        this.method3866(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 96)
    public final void method3856() {
        this.field9668 = null;
        this.method3867();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 102)
    public final void method3858(class419 arg0, int arg1, int arg2) {
        this.method3849(this.nativeid, ((class676) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILdm;)V", line = 105)
    public final void method3859(class233 arg0, int[] arg1, class765 arg2) {
        this.method3855(this.nativeid, ((class767) arg0).nativeid, arg1, ((class669) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Ldm;[III)V", line = 113)
    public final void method3861(class233 arg0, class765 arg1, int[] arg2, int arg3, int arg4) {
        this.method3854(this.nativeid, ((class767) arg0).nativeid, ((class669) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 116)
    public final void method3862(class475 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3868(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 124)
    private final void method3867() {
        this.method3865(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 129)
    public final void method3869(class475 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3863(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 132)
    public class682(class53 arg0, int arg1, int arg2) {
        this.field9669 = arg0;
        this.field9672 = new class767(this.field9669);
        this.field9670 = new class767(this.field9669);
        this.field9666 = new class767(this.field9669);
        this.field9674 = new class767(this.field9669);
        this.field9677 = new class767(this.field9669);
        this.field9675 = new class767(this.field9669);
        this.field9673 = new class767(this.field9669);
        this.field9676 = new class767(this.field9669);
        this.field9671 = new class767(this.field9669);
        this.field9667 = new class767(this.field9669);
        this.method3857(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3842(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3844(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3846(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3847(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3848(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3849(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3854(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3855(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3857(long arg0, class475 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3860(long arg0);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3863(long arg0, class475 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3864(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3865(long arg0);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3866(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3868(long arg0, class475 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
