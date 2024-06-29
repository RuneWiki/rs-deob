import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class278 extends class316 implements class350 {

    @OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lw;Lg;Lgf;[Lev;[Lo;)V", line = 6)
    public class278(class197 arg0, class108 arg1, class183 arg2, class491[] arg3, class24[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7192;
            var7[var11] = arg3[var11].field7196;
            var8[var11] = arg3[var11].field7191;
            var9[var11] = arg3[var11].field7195;
            var10[var11] = arg3[var11].field7199;
        }
        this.method1687(arg0, arg1, var6, arg3[0].field7197, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLta;II)V", line = 35)
    public final void method422(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7) {
        this.method1688(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lw;Lg;[[B[I[I[I[I[I)V")
    private final native void method1687(class197 arg0, class108 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
    public final native void method423(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLta;II)V")
    private final native void method1688(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7);
}
