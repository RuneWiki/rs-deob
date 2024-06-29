import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class303 extends class194 implements class141 {

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4, class212 arg5, int arg6, int arg7) {
        this.method1869(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "T", descriptor = "(CIIIZLfa;II)V")
    private final native void method1869(char arg0, int arg1, int arg2, int arg3, boolean arg4, class212 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "(Lda;La;[[B[I[I[I[I)V")
    private final native void method1870(class55 arg0, class566 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!b", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "(CIIIZ)V")
    public final native void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lda;La;Lmj;[Lkq;[Lxa;)V")
    public class303(class55 arg0, class566 arg1, class599 arg2, class543[] arg3, class461[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7378;
            var7[var11] = arg3[var11].field7377;
            var8[var11] = arg3[var11].field7373;
            var9[var11] = arg3[var11].field7375;
            var10[var11] = arg3[var11].field7374;
        }
        this.method1870(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }
}
