import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class666 extends class61 implements class535 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method123(boolean arg0);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4, class489 arg5, int arg6, int arg7) {
        this.method3750(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method3749(class696 arg0, class53 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Ljl;[Lhb;[Liea;)V")
    public class666(class696 arg0, class53 arg1, class274 arg2, class728[] arg3, class481[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field10134;
            var7[var11] = arg3[var11].field10135;
            var8[var11] = arg3[var11].field10132;
            var9[var11] = arg3[var11].field10129;
            var10[var11] = arg3[var11].field10128;
        }
        this.method3749(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method121(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method3750(char arg0, int arg1, int arg2, int arg3, boolean arg4, class489 arg5, int arg6, int arg7);
}
