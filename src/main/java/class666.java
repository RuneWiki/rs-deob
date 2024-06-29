import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class666 extends class61 implements class534 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method3825(char arg0, int arg1, int arg2, int arg3, boolean arg4, class488 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method22(char arg0, int arg1, int arg2, int arg3, boolean arg4, class488 arg5, int arg6, int arg7) {
        this.method3825(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lhia;[Lfg;[Lpga;)V")
    public class666(class696 arg0, class53 arg1, class66 arg2, class129[] arg3, class536[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1738;
            var7[var11] = arg3[var11].field1734;
            var8[var11] = arg3[var11].field1739;
            var9[var11] = arg3[var11].field1735;
            var10[var11] = arg3[var11].field1737;
        }
        this.method3826(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method3826(class696 arg0, class53 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method23(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
