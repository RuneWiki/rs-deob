import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class725 extends class400 implements class2 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Loa;Lya;Lqt;[Lffa;[Ltd;)V")
    public class725(class406 arg0, class74 arg1, class502 arg2, class676[] arg3, class515[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field9612;
            var7[var11] = arg3[var11].field9614;
            var8[var11] = arg3[var11].field9618;
            var9[var11] = arg3[var11].field9613;
            var10[var11] = arg3[var11].field9610;
        }
        this.method4053(arg0, arg1, var6, arg3[0].field9615, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public final native void method9(boolean arg0);

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLaa;II)V")
    public final void method1275(char arg0, int arg1, int arg2, int arg3, boolean arg4, class569 arg5, int arg6, int arg7) {
        this.method4052(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLaa;II)V")
    private final native void method4052(char arg0, int arg1, int arg2, int arg3, boolean arg4, class569 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V")
    private final native void method4053(class406 arg0, class74 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);
}
