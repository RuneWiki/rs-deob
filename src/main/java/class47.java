import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class47 extends class296 implements class242 {

    @OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
    public final native void method335(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method336(char arg0, int arg1, int arg2, int arg3, boolean arg4, class448 arg5, int arg6, int arg7) {
        this.method338(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lw;Lg;[[B[I[I[I[I[I)V")
    private final native void method337(class454 arg0, class96 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLta;II)V")
    private final native void method338(char arg0, int arg1, int arg2, int arg3, boolean arg4, class448 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lw;Lg;Lqm;[Lwh;[Lo;)V")
    public class47(class454 arg0, class96 arg1, class331 arg2, class523[] arg3, class138[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7705;
            var7[var11] = arg3[var11].field7707;
            var8[var11] = arg3[var11].field7709;
            var9[var11] = arg3[var11].field7710;
            var10[var11] = arg3[var11].field7711;
        }
        this.method337(arg0, arg1, var6, arg3[0].field7712, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }
}
