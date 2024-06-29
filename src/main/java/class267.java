import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class267 extends class395 implements class52 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(CIIIZLua;II)V", line = 6)
    public final void method366(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7) {
        this.method1691(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ll;Lm;Lll;[Lfda;[Lf;)V", line = 9)
    public class267(class261 arg0, class496 arg1, class490 arg2, class628[] arg3, class257[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field8939;
            var7[var11] = arg3[var11].field8936;
            var8[var11] = arg3[var11].field8940;
            var9[var11] = arg3[var11].field8933;
            var10[var11] = arg3[var11].field8935;
        }
        this.method1690(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method368(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(Ll;Lm;[[B[I[I[I[I)V")
    private final native void method1690(class261 arg0, class496 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(CIIIZLua;II)V")
    private final native void method1691(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!c", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);
}
