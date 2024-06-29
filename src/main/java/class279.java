import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class279 extends class317 implements class294 {

    @OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLta;II)V", line = 4)
    public final void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7) {
        this.method1752(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lw;Lg;Lfj;[Lef;[Lo;)V", line = 7)
    public class279(class197 arg0, class109 arg1, class470 arg2, class340[] arg3, class24[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field5113;
            var7[var11] = arg3[var11].field5114;
            var8[var11] = arg3[var11].field5115;
            var9[var11] = arg3[var11].field5119;
            var10[var11] = arg3[var11].field5118;
        }
        this.method1751(arg0, arg1, var6, arg3[0].field5112, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 104, this);
        }
    }

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lw;Lg;[[B[I[I[I[I[I)V")
    private final native void method1751(class197 arg0, class109 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLta;II)V")
    private final native void method1752(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
    public final native void method214(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
