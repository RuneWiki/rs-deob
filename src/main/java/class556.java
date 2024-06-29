import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class556 implements class438 {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "La;")
    private class326 field7867;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Lma;")
    private class312 field7872;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lma;")
    private class312 field7871;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lma;")
    private class312 field7862;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lma;")
    private class312 field7865;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lma;")
    private class312 field7863;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lma;")
    private class312 field7873;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lma;")
    private class312 field7869;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lma;")
    private class312 field7868;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lma;")
    private class312 field7864;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lma;")
    private class312 field7870;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Ljava/lang/Runnable;")
    public Runnable field7866;

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "(Lqa;II)V")
    private final native void method3115(class167 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method3116() {
        this.field7866 = Thread.currentThread();
        this.method3117();
    }

    @OriginalMember(owner = "client!v", name = "u", descriptor = "()V")
    private final native void method3117();

    @OriginalMember(owner = "client!v", name = "N", descriptor = "(Lqa;[Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method3118(class167 arg0, class519[] arg1, class105 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "(Lr;Lr;IIIZ)V")
    public final native void method3119(class519 arg0, class519 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "(Lqa;[I[I[I[SI)V")
    public final native void method3120(class167 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "G", descriptor = "(Lqa;Lr;Lm;[II[I[I[I[S[BI[I)V")
    public final native void method3121(class167 arg0, class519 arg1, class105 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "(Lsa;IIIIIII[[Z)V")
    public final native void method3122(class542 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lma;BIZ)Lr;")
    public final class519 method3123(class312 arg0, byte arg1, int arg2, boolean arg3) {
        class312 var5;
        class312 var6;
        if (arg1 == 1) {
            var5 = this.field7873;
            var6 = this.field7872;
        } else if (arg1 == 2) {
            var5 = this.field7869;
            var6 = this.field7871;
        } else if (arg1 == 3) {
            var5 = this.field7868;
            var6 = this.field7862;
        } else if (arg1 == 4) {
            var5 = this.field7864;
            var6 = this.field7865;
        } else if (arg1 == 5) {
            var5 = this.field7870;
            var6 = this.field7863;
        } else {
            var6 = var5 = new class312(this.field7867);
        }
        arg0.method1937(var6, var5, arg2, arg1 != 0, arg3);
        var6.field4560 = arg0.field4560;
        var6.field4562 = arg0.field4562;
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(Lsa;II)V")
    public final native void method3124(class542 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-119, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()V")
    private final native void method3125();

    @OriginalMember(owner = "client!v", name = "wa", descriptor = "(Lqa;[Lr;Lm;[III)V")
    public final native void method3126(class167 arg0, class519[] arg1, class105 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method3127() {
        this.field7866 = null;
        this.method3125();
    }

    @OriginalMember(owner = "client!v", name = "da", descriptor = "(Lqa;IIIIIII)V")
    public final native void method3128(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(Lr;Lm;[III)V")
    public final native void method3129(class519 arg0, class105 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "(Lr;IILm;Z)Z")
    public final native boolean method3130(class519 arg0, int arg1, int arg2, class105 arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "ka", descriptor = "(Lr;Lm;[II)V")
    public final native void method3131(class519 arg0, class105 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(La;II)V")
    public class556(class326 arg0, int arg1, int arg2) {
        this.field7867 = arg0;
        this.field7872 = new class312(this.field7867);
        this.field7871 = new class312(this.field7867);
        this.field7862 = new class312(this.field7867);
        this.field7865 = new class312(this.field7867);
        this.field7863 = new class312(this.field7867);
        this.field7873 = new class312(this.field7867);
        this.field7869 = new class312(this.field7867);
        this.field7868 = new class312(this.field7867);
        this.field7864 = new class312(this.field7867);
        this.field7870 = new class312(this.field7867);
        this.method3115(arg0, arg1, arg2);
    }
}
