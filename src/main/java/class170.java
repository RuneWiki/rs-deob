import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class170 extends class416 implements class198 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ll;Lm;Luq;[Lfg;[Lf;)V", line = 3)
    public class170(class18 arg0, class175 arg1, class146 arg2, class113[] arg3, class702[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1709;
            var7[var11] = arg3[var11].field1706;
            var8[var11] = arg3[var11].field1708;
            var9[var11] = arg3[var11].field1704;
            var10[var11] = arg3[var11].field1707;
        }
        this.method1168(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(CIIIZLua;II)V", line = 41)
    public final void method60(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7) {
        this.method1169(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!c", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(Ll;Lm;[[B[I[I[I[I)V")
    private final native void method1168(class18 arg0, class175 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!c", name = "GA", descriptor = "(CIIIZLua;II)V")
    private final native void method1169(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!c", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);
}
