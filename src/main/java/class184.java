import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class184 extends class315 implements class103 {

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lqa;Lna;Ldq;[Lft;[Ll;)V", line = 6)
    public class184(class163 arg0, class35 arg1, class490 arg2, class4[] arg3, class16[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field34;
            var7[var11] = arg3[var11].field41;
            var8[var11] = arg3[var11].field36;
            var9[var11] = arg3[var11].field37;
            var10[var11] = arg3[var11].field33;
        }
        this.method1169(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(CIIIZLma;II)V", line = 35)
    public final void method1058(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        this.method1168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!s", name = "A", descriptor = "(CIIIZLma;II)V")
    private final native void method1168(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Lqa;Lna;[[B[I[I[I[I)V")
    private final native void method1169(class163 arg0, class35 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!s", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method1057(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
