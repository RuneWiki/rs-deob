import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class277 extends class417 implements class200 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ll;Lm;Lvn;[Lqga;[Lf;)V", line = 6)
    public class277(class18 arg0, class175 arg1, class283 arg2, class168[] arg3, class702[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field2450;
            var7[var11] = arg3[var11].field2445;
            var8[var11] = arg3[var11].field2449;
            var9[var11] = arg3[var11].field2446;
            var10[var11] = arg3[var11].field2448;
        }
        this.method1721(arg0, arg1, var6, arg3[0].field2442, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-78, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CIIIZLua;II)V", line = 40)
    public final void method1200(char arg0, int arg1, int arg2, int arg3, boolean arg4, class618 arg5, int arg6, int arg7) {
        this.method1722(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "(Ll;Lm;[[B[I[I[I[I[I)V")
    private final native void method1721(class18 arg0, class175 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ca", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "(CIIIZLua;II)V")
    private final native void method1722(char arg0, int arg1, int arg2, int arg3, boolean arg4, class618 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ca", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method1202(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
