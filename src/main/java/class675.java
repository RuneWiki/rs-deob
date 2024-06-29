import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class675 extends class413 implements class249 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(CIIIZLua;II)V", line = 11)
    public final void method634(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7) {
        this.method3787(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ll;Lm;Lsa;[Laga;[Lf;)V", line = 16)
    public class675(class171 arg0, class108 arg1, class595 arg2, class661[] arg3, class536[] arg4) {
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
        this.method3788(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!c", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(CIIIZLua;II)V")
    private final native void method3787(char arg0, int arg1, int arg2, int arg3, boolean arg4, class600 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(Ll;Lm;[[B[I[I[I[I)V")
    private final native void method3788(class171 arg0, class108 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method633(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
