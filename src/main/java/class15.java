import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 implements class103 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lqa;")
    private class164 field245;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lda;")
    private class44 field252;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lda;")
    private class44 field247;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lda;")
    private class44 field251;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lda;")
    private class44 field244;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lda;")
    private class44 field242;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lda;")
    private class44 field250;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lda;")
    private class44 field249;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lda;")
    private class44 field243;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lda;")
    private class44 field246;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lda;")
    private class44 field253;

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Ljava/lang/Runnable;")
    public Runnable field248;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 7)
    public final void method113() {
        this.field248 = null;
        this.method124();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V", line = 11)
    public final void method114() {
        this.field248 = Thread.currentThread();
        this.method110();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lda;BIZ)Lt;", line = 18)
    public final class474 method116(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field250;
            var6 = this.field252;
        } else if (arg1 == 2) {
            var5 = this.field249;
            var6 = this.field247;
        } else if (arg1 == 3) {
            var5 = this.field243;
            var6 = this.field251;
        } else if (arg1 == 4) {
            var5 = this.field246;
            var6 = this.field244;
        } else if (arg1 == 5) {
            var5 = this.field253;
            var6 = this.field242;
        } else {
            var6 = var5 = new class44(this.field245);
        }
        arg0.method407(var6, var5, arg2, arg1 != 0, arg3);
        var6.field525 = arg0.field525;
        var6.field526 = arg0.field526;
        return var6;
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lqa;II)V", line = 89)
    public class15(class164 arg0, int arg1, int arg2) {
        this.field245 = arg0;
        this.field252 = new class44(this.field245);
        this.field247 = new class44(this.field245);
        this.field251 = new class44(this.field245);
        this.field244 = new class44(this.field245);
        this.field242 = new class44(this.field245);
        this.field250 = new class44(this.field245);
        this.field249 = new class44(this.field245);
        this.field243 = new class44(this.field245);
        this.field246 = new class44(this.field245);
        this.field253 = new class44(this.field245);
        this.method126(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "()V")
    private final native void method110();

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "(Lya;[Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method111(class38 arg0, class474[] arg1, class123 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "v", descriptor = "(Lta;IIIIIII[[Z)V")
    public final native void method112(class143 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!n", name = "ea", descriptor = "(Lt;Lc;[II)V")
    public final native void method115(class474 arg0, class123 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "ta", descriptor = "(Lt;Lc;[III)V")
    public final native void method117(class474 arg0, class123 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "U", descriptor = "(Lt;Lt;IIIZ)V")
    public final native void method118(class474 arg0, class474 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!n", name = "A", descriptor = "(Lta;II)V")
    public final native void method119(class143 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!n", name = "B", descriptor = "(Lt;IILc;Z)Z")
    public final native boolean method121(class474 arg0, int arg1, int arg2, class123 arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "TA", descriptor = "(Lya;[Lt;Lc;[III)V")
    public final native void method122(class38 arg0, class474[] arg1, class123 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "va", descriptor = "(Lya;IIIIIII)V")
    public final native void method123(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    private final native void method124();

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(Lya;Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method125(class38 arg0, class474 arg1, class123 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "O", descriptor = "(Lya;II)V")
    private final native void method126(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "G", descriptor = "(Lya;[I[I[I[SI)V")
    public final native void method127(class38 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);
}
