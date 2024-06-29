import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class617 implements class531 {

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Loa;")
    private class692 field8840;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Li;")
    private class39 field8841;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Li;")
    private class39 field8837;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Li;")
    private class39 field8836;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Li;")
    private class39 field8845;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Li;")
    private class39 field8835;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Li;")
    private class39 field8839;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Li;")
    private class39 field8844;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Li;")
    private class39 field8838;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Li;")
    private class39 field8846;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Li;")
    private class39 field8842;

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8843;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;III)V")
    public final void method3495(class278 arg0, int arg1, int arg2, int arg3) {
        this.method3506(this.nativeid, ((class666) arg0).nativeid, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Li;BIZ)Lka;")
    public final class470 method3496(class39 arg0, byte arg1, int arg2, boolean arg3) {
        class39 var5;
        class39 var6;
        if (arg1 == 1) {
            var5 = this.field8839;
            var6 = this.field8841;
        } else if (arg1 == 2) {
            var5 = this.field8844;
            var6 = this.field8837;
        } else if (arg1 == 3) {
            var5 = this.field8838;
            var6 = this.field8836;
        } else if (arg1 == 4) {
            var5 = this.field8846;
            var6 = this.field8845;
        } else if (arg1 == 5) {
            var5 = this.field8842;
            var6 = this.field8835;
        } else {
            var6 = var5 = new class39(this.field8840);
        }
        arg0.method216(var6, var5, arg2, arg1 != 0, arg3);
        var6.field436 = arg0.field436;
        var6.field434 = arg0.field434;
        return var6;
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(J)V")
    private final native void method3497(long arg0);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(JJII)V")
    private final native void method3498(long arg0, long arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(JZ)V")
    private final native void method3499(long arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(JJIIIIIII[[Z)V")
    private final native void method3500(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean[][] arg9);

    @OriginalMember(owner = "client!a", name = "n", descriptor = "(JJIIJZI)Z")
    private final native boolean method3501(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(JJ[IJ)V")
    private final native void method3502(long arg0, long arg1, int[] arg2, long arg3);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "(JJJIIIZ)V")
    private final native void method3503(long arg0, long arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    private final void method3504() {
        this.method3497(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        this.method3499(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!a", name = "R", descriptor = "(JJIIJZ)Z")
    private final native boolean method3505(long arg0, long arg1, int arg2, int arg3, long arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(JJIII)V")
    private final native void method3506(long arg0, long arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Ldfa;[III)V")
    public final void method3507(class470 arg0, class165 arg1, int[] arg2, int arg3, int arg4) {
        this.method3519(this.nativeid, ((class39) arg0).nativeid, ((class276) arg1).nativeid, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;[I[I[I[SI)V")
    public final void method3508(class58 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5) {
        this.method3522(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Ldfa;[II)V")
    public final void method3509(class470 arg0, class165 arg1, int[] arg2, int arg3) {
        this.method3511(this.nativeid, ((class39) arg0).nativeid, ((class276) arg1).nativeid, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILdfa;ZI)Z")
    public final boolean method3510(class470 arg0, int arg1, int arg2, class165 arg3, boolean arg4, int arg5) {
        return this.method3501(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class276) arg3).nativeid, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(JJJ[II)V")
    private final native void method3511(long arg0, long arg1, long arg2, int[] arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "W", descriptor = "(J)V")
    private final native void method3512(long arg0);

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(JLha;II)V")
    private final native void method3513(long arg0, class58 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method3514() {
        this.method3512(this.nativeid);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()V")
    public final void method3515() {
        this.field8843 = null;
        this.method3514();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;II)V")
    public final void method3516(class278 arg0, int arg1, int arg2) {
        this.method3498(this.nativeid, ((class666) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public final void method3517() {
        this.field8843 = Thread.currentThread();
        this.method3504();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ls;IIIIIII[[Z)V")
    public final void method3518(class278 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8) {
        this.method3500(this.nativeid, ((class666) arg0).nativeid, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(JJJ[III)V")
    private final native void method3519(long arg0, long arg1, long arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;IILdfa;Z)Z")
    public final boolean method3520(class470 arg0, int arg1, int arg2, class165 arg3, boolean arg4) {
        return this.method3505(this.nativeid, ((class39) arg0).nativeid, arg1, arg2, ((class276) arg3).nativeid, arg4);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lha;IIIIIII)V")
    public final void method3521(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method3524(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!a", name = "O", descriptor = "(JLha;[I[I[I[SI)V")
    private final native void method3522(long arg0, class58 arg1, int[] arg2, int[] arg3, int[] arg4, short[] arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Loa;II)V")
    public class617(class692 arg0, int arg1, int arg2) {
        this.field8840 = arg0;
        this.field8841 = new class39(this.field8840);
        this.field8837 = new class39(this.field8840);
        this.field8836 = new class39(this.field8840);
        this.field8845 = new class39(this.field8840);
        this.field8835 = new class39(this.field8840);
        this.field8839 = new class39(this.field8840);
        this.field8844 = new class39(this.field8840);
        this.field8838 = new class39(this.field8840);
        this.field8846 = new class39(this.field8840);
        this.field8842 = new class39(this.field8840);
        this.method3513(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;[ILdfa;)V")
    public final void method3523(class470 arg0, int[] arg1, class165 arg2) {
        this.method3502(this.nativeid, ((class39) arg0).nativeid, arg1, ((class276) arg2).nativeid);
    }

    @OriginalMember(owner = "client!a", name = "na", descriptor = "(JLha;IIIIIII)V")
    private final native void method3524(long arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lka;Lka;IIIZ)V")
    public final void method3525(class470 arg0, class470 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method3503(this.nativeid, ((class39) arg0).nativeid, ((class39) arg1).nativeid, arg2, arg3, arg4, arg5);
    }
}
