import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class242 extends class306 implements class194 {

    @OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lw;Lg;Lkt;[Lau;[Lo;)V", line = 7)
    public class242(class69 arg0, class424 arg1, class61 arg2, class396[] arg3, class359[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field5698;
            var7[var11] = arg3[var11].field5696;
            var8[var11] = arg3[var11].field5700;
            var9[var11] = arg3[var11].field5694;
            var10[var11] = arg3[var11].field5699;
        }
        this.method1469(arg0, arg1, var6, arg3[0].field5693, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLta;II)V", line = 41)
    public final void method343(char arg0, int arg1, int arg2, int arg3, boolean arg4, class336 arg5, int arg6, int arg7) {
        this.method1470(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lw;Lg;[[B[I[I[I[I[I)V")
    private final native void method1469(class69 arg0, class424 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLta;II)V")
    private final native void method1470(char arg0, int arg1, int arg2, int arg3, boolean arg4, class336 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
    public final native void method344(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
    public final native void method442();
}
