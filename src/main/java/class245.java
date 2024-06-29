import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class245 extends class310 implements class28 {

    @OriginalMember(owner = "client!ga", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(CIIIZLta;II)V", line = 11)
    public final void method1443(char arg0, int arg1, int arg2, int arg3, boolean arg4, class340 arg5, int arg6, int arg7) {
        this.method1662(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lw;Lg;Lap;[Lrr;[Lo;)V", line = 15)
    public class245(class69 arg0, class427 arg1, class29 arg2, class309[] arg3, class363[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4711;
            var7[var11] = arg3[var11].field4713;
            var8[var11] = arg3[var11].field4717;
            var9[var11] = arg3[var11].field4716;
            var10[var11] = arg3[var11].field4712;
        }
        this.method1661(arg0, arg1, var6, arg3[0].field4709, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "(Lw;Lg;[[B[I[I[I[I[I)V")
    private final native void method1661(class69 arg0, class427 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "(CIIIZ)V")
    public final native void method1441(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "(CIIIZLta;II)V")
    private final native void method1662(char arg0, int arg1, int arg2, int arg3, boolean arg4, class340 arg5, int arg6, int arg7);
}
