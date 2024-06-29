import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 implements class103 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lqa;")
    private class163 field169;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lda;")
    private class43 field168;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lda;")
    private class43 field174;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lda;")
    private class43 field172;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lda;")
    private class43 field177;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lda;")
    private class43 field173;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lda;")
    private class43 field167;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lda;")
    private class43 field170;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lda;")
    private class43 field178;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lda;")
    private class43 field175;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lda;")
    private class43 field176;

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Ljava/lang/Runnable;")
    public Runnable field171;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 11)
    public final void method96() {
        this.field171 = null;
        this.method106();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lda;BIZ)Lt;", line = 23)
    public final class471 method99(class43 arg0, byte arg1, int arg2, boolean arg3) {
        class43 var5;
        class43 var6;
        if (arg1 == 1) {
            var5 = this.field167;
            var6 = this.field168;
        } else if (arg1 == 2) {
            var5 = this.field170;
            var6 = this.field174;
        } else if (arg1 == 3) {
            var5 = this.field178;
            var6 = this.field172;
        } else if (arg1 == 4) {
            var5 = this.field175;
            var6 = this.field177;
        } else if (arg1 == 5) {
            var5 = this.field176;
            var6 = this.field173;
        } else {
            var6 = var5 = new class43(this.field169);
        }
        arg0.method466(var6, var5, arg2, arg1 != 0, arg3);
        var6.field494 = arg0.field494;
        var6.field493 = arg0.field493;
        return var6;
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V", line = 80)
    public final void method103() {
        this.field171 = Thread.currentThread();
        this.method95();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lqa;II)V", line = 89)
    public class15(class163 arg0, int arg1, int arg2) {
        this.field169 = arg0;
        this.field168 = new class43(this.field169);
        this.field174 = new class43(this.field169);
        this.field172 = new class43(this.field169);
        this.field177 = new class43(this.field169);
        this.field173 = new class43(this.field169);
        this.field167 = new class43(this.field169);
        this.field170 = new class43(this.field169);
        this.field178 = new class43(this.field169);
        this.field175 = new class43(this.field169);
        this.field176 = new class43(this.field169);
        this.method105(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!n", name = "ea", descriptor = "(Lt;Lc;[II)V")
    public final native void method90(class471 arg0, class122 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "TA", descriptor = "(Lya;[Lt;Lc;[III)V")
    public final native void method91(class38 arg0, class471[] arg1, class122 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "B", descriptor = "(Lt;IILc;Z)Z")
    public final native boolean method92(class471 arg0, int arg1, int arg2, class122 arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "U", descriptor = "(Lt;Lt;IIIZ)V")
    public final native void method93(class471 arg0, class471 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!n", name = "G", descriptor = "(Lya;[I[I[I[SI)V")
    public final native void method94(class38 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "()V")
    private final native void method95();

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(Lya;Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method97(class38 arg0, class471 arg1, class122 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "v", descriptor = "(Lta;IIIIIII[[Z)V")
    public final native void method98(class142 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!n", name = "va", descriptor = "(Lya;IIIIIII)V")
    public final native void method100(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "(Lya;[Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method102(class38 arg0, class471[] arg1, class122 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "ta", descriptor = "(Lt;Lc;[III)V")
    public final native void method104(class471 arg0, class122 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "O", descriptor = "(Lya;II)V")
    private final native void method105(class38 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    private final native void method106();

    @OriginalMember(owner = "client!n", name = "A", descriptor = "(Lta;II)V")
    public final native void method107(class142 arg0, int arg1, int arg2);
}
