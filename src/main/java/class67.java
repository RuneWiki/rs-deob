import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class67 implements class28 {

    @OriginalMember(owner = "client!k", name = "f", descriptor = "Lw;")
    private class69 field1068;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lxa;")
    private class473 field1069;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Lxa;")
    private class473 field1066;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lxa;")
    private class473 field1071;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lxa;")
    private class473 field1074;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lxa;")
    private class473 field1064;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lxa;")
    private class473 field1067;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lxa;")
    private class473 field1070;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lxa;")
    private class473 field1065;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lxa;")
    private class473 field1073;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lxa;")
    private class473 field1063;

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Ljava/lang/Runnable;")
    public Runnable field1072;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lxa;BIZ)Le;", line = 13)
    public final class289 method478(class473 arg0, byte arg1, int arg2, boolean arg3) {
        class473 var5;
        class473 var6;
        if (arg1 == 1) {
            var5 = this.field1067;
            var6 = this.field1069;
        } else if (arg1 == 2) {
            var5 = this.field1070;
            var6 = this.field1066;
        } else if (arg1 == 3) {
            var5 = this.field1065;
            var6 = this.field1071;
        } else if (arg1 == 4) {
            var5 = this.field1073;
            var6 = this.field1074;
        } else if (arg1 == 5) {
            var5 = this.field1063;
            var6 = this.field1064;
        } else {
            var6 = var5 = new class473(this.field1068);
        }
        arg0.method2866(var6, var5, arg2, arg1 != 0, arg3);
        var6.field6938 = arg0.field6938;
        var6.field6937 = arg0.field6937;
        return var6;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "()V", line = 67)
    public final void method484() {
        this.field1072 = Thread.currentThread();
        this.method482();
    }

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V", line = 75)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "()V", line = 85)
    public final void method487() {
        this.field1072 = null;
        this.method486();
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lw;II)V", line = 91)
    public class67(class69 arg0, int arg1, int arg2) {
        this.field1068 = arg0;
        this.field1069 = new class473(this.field1068);
        this.field1066 = new class473(this.field1068);
        this.field1071 = new class473(this.field1068);
        this.field1074 = new class473(this.field1068);
        this.field1064 = new class473(this.field1068);
        this.field1067 = new class473(this.field1068);
        this.field1070 = new class473(this.field1068);
        this.field1065 = new class473(this.field1068);
        this.field1073 = new class473(this.field1068);
        this.field1063 = new class473(this.field1068);
        this.method485(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!k", name = "LA", descriptor = "(Le;Lc;[III)V")
    public final native void method473(class289 arg0, class517 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "MA", descriptor = "(Le;Lc;[II)V")
    public final native void method474(class289 arg0, class517 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "FA", descriptor = "(Lza;Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method475(class299 arg0, class289 arg1, class517 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(Lya;IIIIIII[[Z)V")
    public final native void method476(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(Lza;[Le;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method477(class299 arg0, class289[] arg1, class517 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!k", name = "va", descriptor = "(Lza;[Le;Lc;[III)V")
    public final native void method479(class299 arg0, class289[] arg1, class517 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "ia", descriptor = "(Le;IILc;Z)Z")
    public final native boolean method480(class289 arg0, int arg1, int arg2, class517 arg3, boolean arg4);

    @OriginalMember(owner = "client!k", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!k", name = "q", descriptor = "(Lza;IIIIIII)V")
    public final native void method481(class299 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "()V")
    private final native void method482();

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(Lya;II)V")
    public final native void method483(class11 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "(Lza;II)V")
    private final native void method485(class299 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "GA", descriptor = "()V")
    private final native void method486();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Le;Le;IIIZ)V")
    public final native void method488(class289 arg0, class289 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!k", name = "J", descriptor = "(Lza;[I[I[I[SI)V")
    public final native void method489(class299 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);
}
