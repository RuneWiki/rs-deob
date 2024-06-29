import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class315 extends class413 implements class249 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method633(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "(Ll;Lm;[[B[I[I[I[I[I)V")
    private final native void method1822(class171 arg0, class108 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "(CIIIZLua;II)V")
    private final native void method1823(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ll;Lm;Lsa;[Laga;[Lf;)V")
    public class315(class171 arg0, class108 arg1, class595 arg2, class661[] arg3, class536[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field9352;
            var7[var11] = arg3[var11].field9351;
            var8[var11] = arg3[var11].field9353;
            var9[var11] = arg3[var11].field9354;
            var10[var11] = arg3[var11].field9356;
        }
        this.method1822(arg0, arg1, var6, arg3[0].field9358, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method634(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7) {
        this.method1823(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);
}
