import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class646 implements class559 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Loa;")
    private class724 field8975;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Li;")
    private class43 field8973;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class43 field8976;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class43 field8966;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class43 field8967;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class43 field8965;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class43 field8971;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class43 field8969;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class43 field8968;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class43 field8970;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class43 field8974;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8972;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3583(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3584(class500 arg0, class500 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3607(this.nativeid, ((class43) arg0).nativeid, ((class43) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3585(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3596(this.nativeid, ((class698) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3586(long arg0, class65 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3587(long arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3588(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3589(class296 arg0, int arg1, int arg2) {
        this.method3588(this.nativeid, ((class698) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3590(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3591(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3592(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method3593() {
        this.field8972 = Thread.currentThread();
        this.method3606();
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method151(boolean arg0) {
        this.method3591(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method3594() {
        this.field8972 = null;
        this.method3602();
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class500 method3595(class43 arg0, byte arg1, int arg2, boolean arg3) {
        class43 var5;
        class43 var6;
        if (arg1 == 1) {
            var5 = this.field8971;
            var6 = this.field8973;
        } else if (arg1 == 2) {
            var5 = this.field8969;
            var6 = this.field8976;
        } else if (arg1 == 3) {
            var5 = this.field8968;
            var6 = this.field8966;
        } else if (arg1 == 4) {
            var5 = this.field8970;
            var6 = this.field8967;
        } else if (arg1 == 5) {
            var5 = this.field8974;
            var6 = this.field8965;
        } else {
            var6 = var5 = new class43(this.field8975);
        }
        arg0.method324(var6, var5, arg2, arg1 != 0, arg3);
        var6.field668 = arg0.field668;
        var6.field667 = arg0.field667;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3596(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILuu;)V")
    public final void method3597(class500 arg0, int[] arg1, class303 arg2) {
        this.method3598(this.nativeid, ((class43) arg0).nativeid, arg1, ((class294) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3598(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Luu;[II)V")
    public final void method3599(class500 arg0, class303 arg1, int[] arg2, int arg3) {
        this.method3612(this.nativeid, ((class43) arg0).nativeid, ((class294) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3600(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3587(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Luu;[III)V")
    public final void method3601(class500 arg0, class303 arg1, int[] arg2, int arg3, int arg4) {
        this.method3590(this.nativeid, ((class43) arg0).nativeid, ((class294) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    private final void method3602() {
        this.method3610(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3603(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILuu;ZI)Z")
    public final boolean method3604(class500 arg0, int arg1, int arg2, class303 arg3, boolean arg4, int arg5) {
        return this.method3592(this.nativeid, ((class43) arg0).nativeid, arg1, arg2, ((class294) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3605(long arg0, class65 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    private final void method3606() {
        this.method3583(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3607(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3608(class296 arg0, int arg1, int arg2, int arg3) {
        this.method3609(this.nativeid, ((class698) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3609(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3610(long arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3611(class65 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3586(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3612(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILuu;Z)Z")
    public final boolean method3613(class500 arg0, int arg1, int arg2, class303 arg3, boolean arg4) {
        return this.method3603(this.nativeid, ((class43) arg0).nativeid, arg1, arg2, ((class294) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class646(class724 arg0, int arg1, int arg2) {
        this.field8975 = arg0;
        this.field8973 = new class43(this.field8975);
        this.field8976 = new class43(this.field8975);
        this.field8966 = new class43(this.field8975);
        this.field8967 = new class43(this.field8975);
        this.field8965 = new class43(this.field8975);
        this.field8971 = new class43(this.field8975);
        this.field8969 = new class43(this.field8975);
        this.field8968 = new class43(this.field8975);
        this.field8970 = new class43(this.field8975);
        this.field8974 = new class43(this.field8975);
        this.method3605(this.nativeid, arg0, arg1, arg2);
    }
}
