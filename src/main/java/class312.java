import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class312 extends class201 implements class145 {

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLfa;II)V", line = 3)
    public final void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4, class219 arg5, int arg6, int arg7) {
        this.method1833(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lda;La;Lub;[Liba;[Lxa;)V", line = 17)
    public class312(class57 arg0, class579 arg1, class20 arg2, class495[] arg3, class468[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field6191;
            var7[var11] = arg3[var11].field6193;
            var8[var11] = arg3[var11].field6195;
            var9[var11] = arg3[var11].field6190;
            var10[var11] = arg3[var11].field6192;
        }
        this.method1834(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!b", name = "q", descriptor = "(CIIIZ)V")
    public final native void method53(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!b", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!b", name = "T", descriptor = "(CIIIZLfa;II)V")
    private final native void method1833(char arg0, int arg1, int arg2, int arg3, boolean arg4, class219 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "(Lda;La;[[B[I[I[I[I)V")
    private final native void method1834(class57 arg0, class579 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);
}
