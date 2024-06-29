import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 implements class105 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lqa;")
    private class166 field217;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lda;")
    private class44 field207;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lda;")
    private class44 field210;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lda;")
    private class44 field214;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lda;")
    private class44 field215;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lda;")
    private class44 field213;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lda;")
    private class44 field218;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lda;")
    private class44 field216;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lda;")
    private class44 field208;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lda;")
    private class44 field212;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lda;")
    private class44 field209;

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/Runnable;")
    public Runnable field211;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public final void method103() {
        this.field211 = null;
        this.method106();
    }

    @OriginalMember(owner = "client!n", name = "ta", descriptor = "(Lt;Lc;[III)V")
    public final native void method104(class475 arg0, class125 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "O", descriptor = "(Lya;II)V")
    private final native void method105(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    private final native void method106();

    @OriginalMember(owner = "client!n", name = "ea", descriptor = "(Lt;Lc;[II)V")
    public final native void method107(class475 arg0, class125 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(Lya;Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method108(class38 arg0, class475 arg1, class125 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "(Lya;[Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method109(class38 arg0, class475[] arg1, class125 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "A", descriptor = "(Lta;II)V")
    public final native void method110(class145 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "U", descriptor = "(Lt;Lt;IIIZ)V")
    public final native void method111(class475 arg0, class475 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!n", name = "B", descriptor = "(Lt;IILc;Z)Z")
    public final native boolean method112(class475 arg0, int arg1, int arg2, class125 arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "TA", descriptor = "(Lya;[Lt;Lc;[III)V")
    public final native void method113(class38 arg0, class475[] arg1, class125 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "va", descriptor = "(Lya;IIIIIII)V")
    public final native void method114(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
    public final void method115() {
        this.field211 = Thread.currentThread();
        this.method116();
    }

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "()V")
    private final native void method116();

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lqa;II)V")
    public class15(class166 arg0, int arg1, int arg2) {
        this.field217 = arg0;
        this.field207 = new class44(this.field217);
        this.field210 = new class44(this.field217);
        this.field214 = new class44(this.field217);
        this.field215 = new class44(this.field217);
        this.field213 = new class44(this.field217);
        this.field218 = new class44(this.field217);
        this.field216 = new class44(this.field217);
        this.field208 = new class44(this.field217);
        this.field212 = new class44(this.field217);
        this.field209 = new class44(this.field217);
        this.method105(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class438.method2701(-89, this);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lda;BIZ)Lt;")
    public final class475 method117(class44 arg0, byte arg1, int arg2, boolean arg3) {
        class44 var5;
        class44 var6;
        if (arg1 == 1) {
            var5 = this.field218;
            var6 = this.field207;
        } else if (arg1 == 2) {
            var5 = this.field216;
            var6 = this.field210;
        } else if (arg1 == 3) {
            var5 = this.field208;
            var6 = this.field214;
        } else if (arg1 == 4) {
            var5 = this.field212;
            var6 = this.field215;
        } else if (arg1 == 5) {
            var5 = this.field209;
            var6 = this.field213;
        } else {
            var6 = var5 = new class44(this.field217);
        }
        arg0.method453(var6, var5, arg2, arg1 != 0, arg3);
        var6.field561 = arg0.field561;
        var6.field559 = arg0.field559;
        return var6;
    }

    @OriginalMember(owner = "client!n", name = "G", descriptor = "(Lya;[I[I[I[SI)V")
    public final native void method118(class38 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!n", name = "v", descriptor = "(Lta;IIIIIII[[Z)V")
    public final native void method120(class145 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);
}
