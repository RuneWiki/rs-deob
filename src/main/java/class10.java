import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 implements class276 {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lh;")
    private class470 field118;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lp;")
    private class144 field116;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lp;")
    private class144 field111;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lp;")
    private class144 field110;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lp;")
    private class144 field114;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lp;")
    private class144 field119;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lp;")
    private class144 field113;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Lp;")
    private class144 field117;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lp;")
    private class144 field112;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lp;")
    private class144 field115;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lp;")
    private class144 field120;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Ljava/lang/Runnable;")
    public Runnable field109;

    @OriginalMember(owner = "client!ma", name = "za", descriptor = "(Lqa;[Lc;Lia;[III)V")
    public final native void method74(class162 arg0, class121[] arg1, class415 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lp;BIZ)Lc;")
    public final class121 method75(class144 arg0, byte arg1, int arg2, boolean arg3) {
        class144 var5;
        class144 var6;
        if (arg1 == 1) {
            var5 = this.field113;
            var6 = this.field116;
        } else if (arg1 == 2) {
            var5 = this.field117;
            var6 = this.field111;
        } else if (arg1 == 3) {
            var5 = this.field112;
            var6 = this.field110;
        } else if (arg1 == 4) {
            var5 = this.field115;
            var6 = this.field114;
        } else if (arg1 == 5) {
            var5 = this.field120;
            var6 = this.field119;
        } else {
            var6 = var5 = new class144(this.field118);
        }
        arg0.method925(var6, var5, arg2, arg1 != 0, arg3);
        var6.field2062 = arg0.field2062;
        var6.field2063 = arg0.field2063;
        return var6;
    }

    @OriginalMember(owner = "client!ma", name = "ka", descriptor = "(Lna;II)V")
    public final native void method76(class35 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "(Lna;IIIIIII[[Z)V")
    public final native void method77(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!ma", name = "ua", descriptor = "(Lc;IILia;Z)Z")
    public final native boolean method78(class121 arg0, int arg1, int arg2, class415 arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "ya", descriptor = "()V")
    public final native void method79();

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(Lc;Lia;[III)V")
    public final native void method80(class121 arg0, class415 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method81() {
        this.field109 = null;
        this.method86();
    }

    @OriginalMember(owner = "client!ma", name = "fa", descriptor = "(Lc;Lia;[II)V")
    public final native void method82(class121 arg0, class415 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(Lc;Lc;IIIZ)V")
    public final native void method83(class121 arg0, class121 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method84(class162 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
    public final void method85() {
        this.field109 = Thread.currentThread();
        this.method89();
    }

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "()V")
    private final native void method86();

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "(Lqa;II)V")
    private final native void method87(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class390.method2237(true, this);
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(Lqa;Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method88(class162 arg0, class121 arg1, class415 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "()V")
    private final native void method89();

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(Lqa;[Lc;Lia;[II[I[I[I[S[BI[I)V")
    public final native void method90(class162 arg0, class121[] arg1, class415 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "(Lqa;IIIIIII)V")
    public final native void method91(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lh;II)V")
    public class10(class470 arg0, int arg1, int arg2) {
        this.field118 = arg0;
        this.field116 = new class144(this.field118);
        this.field111 = new class144(this.field118);
        this.field110 = new class144(this.field118);
        this.field114 = new class144(this.field118);
        this.field119 = new class144(this.field118);
        this.field113 = new class144(this.field118);
        this.field117 = new class144(this.field118);
        this.field112 = new class144(this.field118);
        this.field115 = new class144(this.field118);
        this.field120 = new class144(this.field118);
        this.method87(arg0, arg1, arg2);
    }
}
