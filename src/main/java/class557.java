import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class557 implements class439 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "La;")
    private class329 field8261;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lma;")
    private class315 field8264;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lma;")
    private class315 field8268;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lma;")
    private class315 field8260;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lma;")
    private class315 field8266;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lma;")
    private class315 field8265;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lma;")
    private class315 field8267;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lma;")
    private class315 field8263;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lma;")
    private class315 field8269;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lma;")
    private class315 field8259;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lma;")
    private class315 field8262;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field8270;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V", line = 8)
    public final void method3248() {
        this.field8270 = null;
        this.method3256();
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lma;BIZ)Lr;", line = 36)
    public final class520 method3259(class315 arg0, byte arg1, int arg2, boolean arg3) {
        class315 var5;
        class315 var6;
        if (arg1 == 1) {
            var5 = this.field8267;
            var6 = this.field8264;
        } else if (arg1 == 2) {
            var5 = this.field8263;
            var6 = this.field8268;
        } else if (arg1 == 3) {
            var5 = this.field8269;
            var6 = this.field8260;
        } else if (arg1 == 4) {
            var5 = this.field8259;
            var6 = this.field8266;
        } else if (arg1 == 5) {
            var5 = this.field8262;
            var6 = this.field8265;
        } else {
            var6 = var5 = new class315(this.field8261);
        }
        arg0.method1967(var6, var5, arg2, arg1 != 0, arg3);
        var6.field4728 = arg0.field4728;
        var6.field4727 = arg0.field4727;
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 83)
    public final void method3260() {
        this.field8270 = Thread.currentThread();
        this.method3249();
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(La;II)V", line = 91)
    public class557(class329 arg0, int arg1, int arg2) {
        this.field8261 = arg0;
        this.field8264 = new class315(this.field8261);
        this.field8268 = new class315(this.field8261);
        this.field8260 = new class315(this.field8261);
        this.field8266 = new class315(this.field8261);
        this.field8265 = new class315(this.field8261);
        this.field8267 = new class315(this.field8261);
        this.field8263 = new class315(this.field8261);
        this.field8269 = new class315(this.field8261);
        this.field8259 = new class315(this.field8261);
        this.field8262 = new class315(this.field8261);
        this.method3254(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "G", descriptor = "(Lqa;Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method3245(class167 arg0, class520 arg1, class105 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "N", descriptor = "(Lqa;[Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method3246(class167 arg0, class520[] arg1, class105 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lr;IILm;Z)Z")
    public final native boolean method3247(class520 arg0, int arg1, int arg2, class105 arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
    private final native void method3249();

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(Lsa;II)V")
    public final native void method3250(class543 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(Lr;Lm;[III)V")
    public final native void method3251(class520 arg0, class105 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);

    @OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lr;Lm;[II)V")
    public final native void method3252(class520 arg0, class105 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lsa;IIIIIII[[Z)V")
    public final native void method3253(class543 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lqa;II)V")
    private final native void method3254(class167 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "da", descriptor = "(Lqa;IIIIIII)V")
    public final native void method3255(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
    private final native void method3256();

    @OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lqa;[Lr;Lm;[III)V")
    public final native void method3257(class167 arg0, class520[] arg1, class105 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method3258(class167 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lr;Lr;IIIZ)V")
    public final native void method3261(class520 arg0, class520 arg1, int arg2, int arg3, int arg4, boolean arg5);
}
