import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class392 implements class240 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lqa;")
    private class131 field5881;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lda;")
    private class353 field5888;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lda;")
    private class353 field5879;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lda;")
    private class353 field5886;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lda;")
    private class353 field5880;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lda;")
    private class353 field5883;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lda;")
    private class353 field5884;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lda;")
    private class353 field5882;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lda;")
    private class353 field5885;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lda;")
    private class353 field5878;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lda;")
    private class353 field5887;

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/lang/Runnable;")
    public Runnable field5889;

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "()V")
    private final native void method2344();

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public final void method2345() {
        this.field5889 = null;
        this.method2355();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lda;BIZ)Lt;")
    public final class398 method2346(class353 arg0, byte arg1, int arg2, boolean arg3) {
        class353 var5;
        class353 var6;
        if (arg1 == 1) {
            var5 = this.field5884;
            var6 = this.field5888;
        } else if (arg1 == 2) {
            var5 = this.field5882;
            var6 = this.field5879;
        } else if (arg1 == 3) {
            var5 = this.field5885;
            var6 = this.field5886;
        } else if (arg1 == 4) {
            var5 = this.field5878;
            var6 = this.field5880;
        } else if (arg1 == 5) {
            var5 = this.field5887;
            var6 = this.field5883;
        } else {
            var6 = var5 = new class353(this.field5881);
        }
        arg0.method2135(var6, var5, arg2, arg1 != 0, arg3);
        var6.field5429 = arg0.field5429;
        var6.field5428 = arg0.field5428;
        return var6;
    }

    @OriginalMember(owner = "client!n", name = "TA", descriptor = "(Lya;[Lt;Lc;[III)V")
    public final native void method2347(class11 arg0, class398[] arg1, class511 arg2, int[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "(Lya;[Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2348(class11 arg0, class398[] arg1, class511 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!n", name = "B", descriptor = "(Lt;IILc;Z)Z")
    public final native boolean method2349(class398 arg0, int arg1, int arg2, class511 arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "G", descriptor = "(Lya;[I[I[I[SI)V")
    public final native void method2350(class11 arg0, int[] arg1, int[] arg2, int[] arg3, short[] arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "v", descriptor = "(Lta;IIIIIII[[Z)V")
    public final native void method2351(class337 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean[][] arg8);

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(Lya;Lt;Lc;[II[I[I[I[S[BI[I)V")
    public final native void method2352(class11 arg0, class398 arg1, class511 arg2, int[] arg3, int arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, byte[] arg9, int arg10, int[] arg11);

    @OriginalMember(owner = "client!n", name = "O", descriptor = "(Lya;II)V")
    private final native void method2353(class11 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "va", descriptor = "(Lya;IIIIIII)V")
    public final native void method2354(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
    private final native void method2355();

    @OriginalMember(owner = "client!n", name = "ea", descriptor = "(Lt;Lc;[II)V")
    public final native void method2356(class398 arg0, class511 arg1, int[] arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "ta", descriptor = "(Lt;Lc;[III)V")
    public final native void method2357(class398 arg0, class511 arg1, int[] arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
    public final void method2358() {
        this.field5889 = Thread.currentThread();
        this.method2344();
    }

    @OriginalMember(owner = "client!n", name = "U", descriptor = "(Lt;Lt;IIIZ)V")
    public final native void method2359(class398 arg0, class398 arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!n", name = "A", descriptor = "(Lta;II)V")
    public final native void method2360(class337 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lqa;II)V")
    public class392(class131 arg0, int arg1, int arg2) {
        this.field5881 = arg0;
        this.field5888 = new class353(this.field5881);
        this.field5879 = new class353(this.field5881);
        this.field5886 = new class353(this.field5881);
        this.field5880 = new class353(this.field5881);
        this.field5883 = new class353(this.field5881);
        this.field5884 = new class353(this.field5881);
        this.field5882 = new class353(this.field5881);
        this.field5885 = new class353(this.field5881);
        this.field5878 = new class353(this.field5881);
        this.field5887 = new class353(this.field5881);
        this.method2353(arg0, arg1, arg2);
    }
}
