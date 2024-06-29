import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class598 extends class597 implements class128 {

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(-123, this);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;La;Lsga;[Law;[Lxa;)V", line = 11)
    public class598(class396 arg0, class613 arg1, class547 arg2, class506[] arg3, class511[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field6647;
            var7[var11] = arg3[var11].field6651;
            var8[var11] = arg3[var11].field6650;
            var9[var11] = arg3[var11].field6646;
            var10[var11] = arg3[var11].field6652;
        }
        this.method3257(arg0, arg1, var6, arg3[0].field6648, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CIIIZLfa;II)V", line = 41)
    public final void method1189(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7) {
        this.method3258(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "(Lda;La;[[B[I[I[I[I[I)V")
    private final native void method3257(class396 arg0, class613 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "(CIIIZLfa;II)V")
    private final native void method3258(char arg0, int arg1, int arg2, int arg3, boolean arg4, class619 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(CIIIZ)V")
    public final native void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
