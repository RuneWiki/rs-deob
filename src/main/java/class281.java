import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class281 extends class319 implements class130 {

    @OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLta;II)V")
    private final native void method1753(char arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lw;Lg;Lul;[Ldd;[Lo;)V")
    public class281(class199 arg0, class109 arg1, class411 arg2, class506[] arg3, class24[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7490;
            var7[var11] = arg3[var11].field7495;
            var8[var11] = arg3[var11].field7489;
            var9[var11] = arg3[var11].field7497;
            var10[var11] = arg3[var11].field7492;
        }
        this.method1754(arg0, arg1, var6, arg3[0].field7496, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method480(char arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, int arg6, int arg7) {
        this.method1753(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
    public final native void method483(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(113, this);
        }
    }

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lw;Lg;[[B[I[I[I[I[I)V")
    private final native void method1754(class199 arg0, class109 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);
}
