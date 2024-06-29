import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class278 extends class419 implements class199 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CIIIZLua;II)V", line = 3)
    public final void method1064(char arg0, int arg1, int arg2, int arg3, boolean arg4, class616 arg5, int arg6, int arg7) {
        this.method1678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ll;Lm;Lgda;[Lpga;[Lf;)V", line = 6)
    public class278(class18 arg0, class174 arg1, class50 arg2, class495[] arg3, class701[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field6907;
            var7[var11] = arg3[var11].field6899;
            var8[var11] = arg3[var11].field6906;
            var9[var11] = arg3[var11].field6901;
            var10[var11] = arg3[var11].field6900;
        }
        this.method1677(arg0, arg1, var6, arg3[0].field6905, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "(Ll;Lm;[[B[I[I[I[I[I)V")
    private final native void method1677(class18 arg0, class174 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ca", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method1063(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "(CIIIZLua;II)V")
    private final native void method1678(char arg0, int arg1, int arg2, int arg3, boolean arg4, class616 arg5, int arg6, int arg7);
}
