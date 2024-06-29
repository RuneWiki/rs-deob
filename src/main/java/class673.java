import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class673 extends class409 implements class247 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ll;Lm;Laga;[Ltq;[Lf;)V", line = 3)
    public class673(class168 arg0, class106 arg1, class658 arg2, class92[] arg3, class532[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1130;
            var7[var11] = arg3[var11].field1132;
            var8[var11] = arg3[var11].field1128;
            var9[var11] = arg3[var11].field1125;
            var10[var11] = arg3[var11].field1126;
        }
        this.method3839(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(CIIIZLua;II)V", line = 39)
    public final void method756(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
        this.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!c", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(CIIIZLua;II)V")
    private final native void method3838(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(Ll;Lm;[[B[I[I[I[I)V")
    private final native void method3839(class168 arg0, class106 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method754(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
