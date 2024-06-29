import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class675 extends class413 implements class251 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(Ll;Lm;[[B[I[I[I[I)V")
    private final native void method3727(class172 arg0, class109 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-66, this);
        }
    }

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(CIIIZLua;II)V")
    private final native void method3728(char arg0, int arg1, int arg2, int arg3, boolean arg4, class598 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method300(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method299(char arg0, int arg1, int arg2, int arg3, boolean arg4, class598 arg5, int arg6, int arg7) {
        this.method3728(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ll;Lm;Lho;[Lqo;[Lf;)V")
    public class675(class172 arg0, class109 arg1, class463 arg2, class550[] arg3, class534[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7869;
            var7[var11] = arg3[var11].field7873;
            var8[var11] = arg3[var11].field7872;
            var9[var11] = arg3[var11].field7870;
            var10[var11] = arg3[var11].field7867;
        }
        this.method3727(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!c", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);
}
