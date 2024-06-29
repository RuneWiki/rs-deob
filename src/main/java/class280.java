import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class280 extends class418 implements class201 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method1410(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7) {
        this.method1991(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ll;Lm;Lufa;[Lwt;[Lf;)V")
    public class280(class18 arg0, class176 arg1, class632 arg2, class284[] arg3, class702[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4532;
            var7[var11] = arg3[var11].field4535;
            var8[var11] = arg3[var11].field4537;
            var9[var11] = arg3[var11].field4533;
            var10[var11] = arg3[var11].field4540;
        }
        this.method1992(arg0, arg1, var6, arg3[0].field4538, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "(CIIIZLua;II)V")
    private final native void method1991(char arg0, int arg1, int arg2, int arg3, boolean arg4, class617 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "(Ll;Lm;[[B[I[I[I[I[I)V")
    private final native void method1992(class18 arg0, class176 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ca", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method1408(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ca", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);
}
