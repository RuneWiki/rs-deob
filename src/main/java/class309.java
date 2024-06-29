import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class309 extends class200 implements class144 {

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lda;La;Lkga;[Lpga;[Lxa;)V", line = 4)
    public class309(class57 arg0, class579 arg1, class511 arg2, class500[] arg3, class468[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field6697;
            var7[var11] = arg3[var11].field6698;
            var8[var11] = arg3[var11].field6700;
            var9[var11] = arg3[var11].field6695;
            var10[var11] = arg3[var11].field6699;
        }
        this.method1852(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLfa;II)V", line = 35)
    public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7) {
        this.method1851(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "q", descriptor = "(CIIIZ)V")
    public final native void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!b", name = "T", descriptor = "(CIIIZLfa;II)V")
    private final native void method1851(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "(Lda;La;[[B[I[I[I[I)V")
    private final native void method1852(class57 arg0, class579 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!b", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);
}
