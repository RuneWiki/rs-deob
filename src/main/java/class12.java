import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class181 implements class137 {

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(CIIIZ)V")
    public final native void method69(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;La;Lcq;[Laf;[Lxa;)V")
    public class12(class54 arg0, class537 arg1, class402 arg2, class372[] arg3, class433[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field5685;
            var7[var11] = arg3[var11].field5688;
            var8[var11] = arg3[var11].field5692;
            var9[var11] = arg3[var11].field5686;
            var10[var11] = arg3[var11].field5687;
        }
        this.method72(arg0, arg1, var6, arg3[0].field5691, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "(CIIIZLfa;II)V")
    private final native void method71(char arg0, int arg1, int arg2, int arg3, boolean arg4, class199 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, -62);
        }
    }

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "(Lda;La;[[B[I[I[I[I[I)V")
    private final native void method72(class54 arg0, class537 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CIIIZLfa;II)V")
    public final void method73(char arg0, int arg1, int arg2, int arg3, boolean arg4, class199 arg5, int arg6, int arg7) {
        this.method71(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
