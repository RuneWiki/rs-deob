import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 implements class103 {

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lqa;")
    private class163 field222;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lda;")
    private class43 field212;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lda;")
    private class43 field220;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lda;")
    private class43 field213;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lda;")
    private class43 field215;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lda;")
    private class43 field216;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lda;")
    private class43 field211;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lda;")
    private class43 field218;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lda;")
    private class43 field217;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lda;")
    private class43 field214;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lda;")
    private class43 field219;

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/Runnable;")
    public Runnable field221;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 10)
    public final void method68() {
        this.field221 = Thread.currentThread();
        this.method65();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V", line = 15)
    public final void method69() {
        this.field221 = null;
        this.method80();
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lda;BIZ)Lt;", line = 37)
    public final class471 method77(class43 arg0, byte arg1, int arg2, boolean arg3) {
        class43 var5;
        class43 var6;
        if (arg1 == 1) {
            var5 = this.field211;
            var6 = this.field212;
        } else if (arg1 == 2) {
            var5 = this.field218;
            var6 = this.field220;
        } else if (arg1 == 3) {
            var5 = this.field217;
            var6 = this.field213;
        } else if (arg1 == 4) {
            var5 = this.field214;
            var6 = this.field215;
        } else if (arg1 == 5) {
            var5 = this.field219;
            var6 = this.field216;
        } else {
            var6 = var5 = new class43(this.field222);
        }
        arg0.method401(var6, var5, arg2, arg1 != 0, arg3);
        var6.field530 = arg0.field530;
        var6.field529 = arg0.field529;
        return var6;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lqa;II)V", line = 89)
    public class15(class163 arg0, int arg1, int arg2) {
        this.field222 = arg0;
        this.field212 = new class43(this.field222);
        this.field220 = new class43(this.field222);
        this.field213 = new class43(this.field222);
        this.field215 = new class43(this.field222);
        this.field216 = new class43(this.field222);
        this.field211 = new class43(this.field222);
        this.field218 = new class43(this.field222);
        this.field217 = new class43(this.field222);
        this.field214 = new class43(this.field222);
        this.field219 = new class43(this.field222);
        this.method79(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "ta", descriptor = "(Lt;Lc;[III)V")
    public final native void method64(class471 arg0, class122 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "()V")
    private final native void method65();

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!n", name = "v", descriptor = "(Lta;IIIIIII[[Z)V")
    public final native void method67(class142 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!n", name = "G", descriptor = "(Lya;[I[I[I[SI)V")
    public final native void method70(class38 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "B", descriptor = "(Lt;IILc;Z)Z")
    public final native boolean method71(class471 arg0, int arg1, int arg2, class122 arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "A", descriptor = "(Lta;II)V")
    public final native void method72(class142 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "TA", descriptor = "(Lya;[Lt;Lc;[III)V")
    public final native void method73(class38 arg0, class471[] arg1, class122 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "ea", descriptor = "(Lt;Lc;[II)V")
    public final native void method74(class471 arg0, class122 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "(Lya;[Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method75(class38 arg0, class471[] arg1, class122 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "U", descriptor = "(Lt;Lt;IIIZ)V")
    public final native void method76(class471 arg0, class471 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!n", name = "va", descriptor = "(Lya;IIIIIII)V")
    public final native void method78(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "O", descriptor = "(Lya;II)V")
    private final native void method79(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    private final native void method80();

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(Lya;Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method81(class38 arg0, class471 arg1, class122 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);
}
