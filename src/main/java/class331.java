import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class331 extends class316 implements class103 {

    @OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!ka", name = "ta", descriptor = "(Lqa;Lna;[[B[I[I[I[I[I)V")
    private final native void method1923(class164 arg0, class35 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(CIIIZLma;II)V")
    public final void method42(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        this.method1924(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ka", name = "ya", descriptor = "(CIIIZLma;II)V")
    private final native void method1924(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lqa;Lna;Lli;[Lqv;[Ll;)V")
    public class331(class164 arg0, class35 arg1, class297 arg2, class311[] arg3, class16[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field3979;
            var7[var11] = arg3[var11].field3974;
            var8[var11] = arg3[var11].field3980;
            var9[var11] = arg3[var11].field3976;
            var10[var11] = arg3[var11].field3978;
        }
        this.method1923(arg0, arg1, var6, arg3[0].field3981, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ka", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method40(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()V")
    public final native void method120();
}
