import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class195 implements class142 {

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CIIIZLfa;II)V", line = 9)
    public final void method17(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7) {
        this.method61(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;La;Led;[Laaa;[Lxa;)V", line = 13)
    public class12(class56 arg0, class564 arg1, class645 arg2, class563[] arg3, class458[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field8006;
            var7[var11] = arg3[var11].field8002;
            var8[var11] = arg3[var11].field8005;
            var9[var11] = arg3[var11].field8004;
            var10[var11] = arg3[var11].field8007;
        }
        this.method60(arg0, arg1, var6, arg3[0].field8000, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "(Lda;La;[[B[I[I[I[I[I)V")
    private final native void method60(class56 arg0, class564 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(CIIIZ)V")
    public final native void method13(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "(CIIIZLfa;II)V")
    private final native void method61(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7);
}
