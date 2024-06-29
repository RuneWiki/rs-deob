import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class644 implements class557 {

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Loa;")
    private class722 field9003;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class44 field9008;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class44 field9000;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class44 field9007;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class44 field9004;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class44 field9006;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class44 field8997;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class44 field8999;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class44 field8998;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Li;")
    private class44 field9002;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class44 field9001;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Ljava/lang/Runnable;")
    public Runnable field9005;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V", line = 5)
    public final void method3667(class496 arg0, class496 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3672(this.nativeid, ((class44) arg0).nativeid, ((class44) arg1).nativeid, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 9)
    private final void method3669() {
        this.method3671(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 15)
    public final void method3673() {
        this.field9005 = null;
        this.method3675();
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V", line = 21)
    private final void method3675() {
        this.method3668(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V", line = 24)
    public final void method3676() {
        this.field9005 = Thread.currentThread();
        this.method3669();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lqja;[III)V", line = 29)
    public final void method3677(class496 arg0, class326 arg1, int[] arg2, int arg3, int arg4) {
        this.method3678(this.nativeid, ((class44) arg0).nativeid, ((class292) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V", line = 33)
    public final void method3679(class294 arg0, int arg1, int arg2, int arg3) {
        this.method3688(this.nativeid, ((class696) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V", line = 37)
    public final void method3680(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3687(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V", line = 43)
    public final void method3682(class65 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3692(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILqja;Z)Z", line = 46)
    public final boolean method3683(class496 arg0, int arg1, int arg2, class326 arg3, boolean arg4) {
        return this.method3686(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class292) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILqja;)V", line = 49)
    public final void method3684(class496 arg0, int[] arg1, class326 arg2) {
        this.method3681(this.nativeid, ((class44) arg0).nativeid, arg1, ((class292) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V", line = 52)
    public final void method3685(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3670(this.nativeid, ((class696) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILqja;ZI)Z", line = 59)
    public final boolean method3689(class496 arg0, int arg1, int arg2, class326 arg3, boolean arg4, int arg5) {
        return this.method3691(this.nativeid, ((class44) arg0).nativeid, arg1, arg2, ((class292) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V", line = 63)
    public final void method3690(class294 arg0, int arg1, int arg2) {
        this.method3694(this.nativeid, ((class696) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 68)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V", line = 78)
    public final void method211(boolean arg0) {
        this.method3666(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;", line = 84)
    public final class496 method3695(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field8997;
            var6 = this.field9008;
        } else if (arg1 == 2) {
            var5 = this.field8999;
            var6 = this.field9000;
        } else if (arg1 == 3) {
            var5 = this.field8998;
            var6 = this.field9007;
        } else if (arg1 == 4) {
            var5 = this.field9002;
            var6 = this.field9004;
        } else if (arg1 == 5) {
            var5 = this.field9001;
            var6 = this.field9006;
        } else {
            var6 = var5 = new class44(this.field9003);
        }
        arg0.method323(var6, var5, arg2, arg1 != 0, arg3);
        var6.field555 = arg0.field555;
        var6.field554 = arg0.field554;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lqja;[II)V", line = 128)
    public final void method3696(class496 arg0, class326 arg1, int[] arg2, int arg3) {
        this.method3693(this.nativeid, ((class44) arg0).nativeid, ((class292) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V", line = 133)
    public class644(class722 arg0, int arg1, int arg2) {
        this.field9003 = arg0;
        this.field9008 = new class44(this.field9003);
        this.field9000 = new class44(this.field9003);
        this.field9007 = new class44(this.field9003);
        this.field9004 = new class44(this.field9003);
        this.field9006 = new class44(this.field9003);
        this.field8997 = new class44(this.field9003);
        this.field8999 = new class44(this.field9003);
        this.field8998 = new class44(this.field9003);
        this.field9002 = new class44(this.field9003);
        this.field9001 = new class44(this.field9003);
        this.method3674(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3666(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3668(long arg0);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3670(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3671(long arg0);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3672(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3674(long arg0, class65 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3678(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3681(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3686(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3687(long arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3688(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3691(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3692(long arg0, class65 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3693(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3694(long arg0, long arg1, int arg2, int arg3);
}
