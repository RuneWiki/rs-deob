import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 implements class276 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lh;")
    private class469 field127;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lp;")
    private class144 field134;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class144 field133;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lp;")
    private class144 field131;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lp;")
    private class144 field128;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lp;")
    private class144 field129;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lp;")
    private class144 field135;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class144 field136;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lp;")
    private class144 field132;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class144 field126;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lp;")
    private class144 field137;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljava/lang/Runnable;")
    public Runnable field130;

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        class236.method1601(123, this);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;", line = 12)
    public final class121 method54(class144 arg0, byte arg1, int arg2, boolean arg3) {
        class144 var5;
        class144 var6;
        if (arg1 == 1) {
            var5 = this.field135;
            var6 = this.field134;
        } else if (arg1 == 2) {
            var5 = this.field136;
            var6 = this.field133;
        } else if (arg1 == 3) {
            var5 = this.field132;
            var6 = this.field131;
        } else if (arg1 == 4) {
            var5 = this.field126;
            var6 = this.field128;
        } else if (arg1 == 5) {
            var5 = this.field137;
            var6 = this.field129;
        } else {
            var6 = var5 = new class144(this.field127);
        }
        arg0.method957(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2148 = arg0.field2148;
        var6.field2149 = arg0.field2149;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 61)
    public final void method57() {
        this.field130 = null;
        this.method63();
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 80)
    public final void method66() {
        this.field130 = Thread.currentThread();
        this.method58();
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V", line = 89)
    public class10(class469 arg0, int arg1, int arg2) {
        this.field127 = arg0;
        this.field134 = new class144(this.field127);
        this.field133 = new class144(this.field127);
        this.field131 = new class144(this.field127);
        this.field128 = new class144(this.field127);
        this.field129 = new class144(this.field127);
        this.field135 = new class144(this.field127);
        this.field136 = new class144(this.field127);
        this.field132 = new class144(this.field127);
        this.field126 = new class144(this.field127);
        this.field137 = new class144(this.field127);
        this.method56(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method52(class162 arg0, class121[] arg1, class414 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method53(class35 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method55(class121 arg0, class414 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method56(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method58();

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method59(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method60();

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method61(class121 arg0, int arg1, int arg2, class414 arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method62(class162 arg0, class121 arg1, class414 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method63();

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method64(class162 arg0, class121[] arg1, class414 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method65(class121 arg0, class121 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method67(class162 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method68(class121 arg0, class414 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method69(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}
