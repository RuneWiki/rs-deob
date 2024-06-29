import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class302 extends class195 implements class142 {

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLfa;II)V", line = 6)
    public final void method17(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7) {
        this.method1706(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lda;La;Led;[Laaa;[Lxa;)V", line = 17)
    public class302(class56 arg0, class564 arg1, class645 arg2, class563[] arg3, class458[] arg4) {
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
        this.method1705(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!b", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "(CIIIZ)V")
    public final native void method13(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!b", name = "p", descriptor = "(Lda;La;[[B[I[I[I[I)V")
    private final native void method1705(class56 arg0, class564 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!b", name = "T", descriptor = "(CIIIZLfa;II)V")
    private final native void method1706(char arg0, int arg1, int arg2, int arg3, boolean arg4, class213 arg5, int arg6, int arg7);
}
