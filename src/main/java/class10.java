import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 implements class276 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lh;")
    private class469 field161;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private class144 field156;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lp;")
    private class144 field163;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lp;")
    private class144 field152;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lp;")
    private class144 field153;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lp;")
    private class144 field157;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lp;")
    private class144 field160;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class144 field162;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lp;")
    private class144 field158;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class144 field159;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lp;")
    private class144 field155;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/lang/Runnable;")
    public Runnable field154;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method52() {
        this.field154 = Thread.currentThread();
        this.method63();
    }

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method53(class162 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method54(class121 arg0, class121 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method55(class121 arg0, class414 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method56(class35 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class379.method2355(4650, this);
    }

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method57(class162 arg0, class121[] arg1, class414 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method58(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method60();

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method61(class162 arg0, class121[] arg1, class414 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
    public final void method62() {
        this.field154 = null;
        this.method60();
    }

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method63();

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method64(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;")
    public final class121 method65(class144 arg0, byte arg1, int arg2, boolean arg3) {
        class144 var5;
        class144 var6;
        if (arg1 == 1) {
            var5 = this.field160;
            var6 = this.field156;
        } else if (arg1 == 2) {
            var5 = this.field162;
            var6 = this.field163;
        } else if (arg1 == 3) {
            var5 = this.field158;
            var6 = this.field152;
        } else if (arg1 == 4) {
            var5 = this.field159;
            var6 = this.field153;
        } else if (arg1 == 5) {
            var5 = this.field155;
            var6 = this.field157;
        } else {
            var6 = var5 = new class144(this.field161);
        }
        arg0.method1056(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2255 = arg0.field2255;
        var6.field2252 = arg0.field2252;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method66(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method67(class121 arg0, class414 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method68(class121 arg0, int arg1, int arg2, class414 arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method69(class162 arg0, class121 arg1, class414 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V")
    public class10(class469 arg0, int arg1, int arg2) {
        this.field161 = arg0;
        this.field156 = new class144(this.field161);
        this.field163 = new class144(this.field161);
        this.field152 = new class144(this.field161);
        this.field153 = new class144(this.field161);
        this.field157 = new class144(this.field161);
        this.field160 = new class144(this.field161);
        this.field162 = new class144(this.field161);
        this.field158 = new class144(this.field161);
        this.field159 = new class144(this.field161);
        this.field155 = new class144(this.field161);
        this.method66(arg0, arg1, arg2);
    }
}
