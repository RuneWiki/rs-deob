import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class200 implements class144 {

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;La;Lkga;[Lpga;[Lxa;)V", line = 5)
    public class12(class57 arg0, class579 arg1, class511 arg2, class500[] arg3, class468[] arg4) {
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
        this.method135(arg0, arg1, var6, arg3[0].field6702, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CIIIZLfa;II)V", line = 41)
    public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7) {
        this.method133(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "(CIIIZLfa;II)V")
    private final native void method133(char arg0, int arg1, int arg2, int arg3, boolean arg4, class217 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(CIIIZ)V")
    public final native void method134(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "(Lda;La;[[B[I[I[I[I[I)V")
    private final native void method135(class57 arg0, class579 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);
}
