import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class72 extends class319 implements class130 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(9, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLta;II)V", line = 10)
    public final void method480(char arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, int arg6, int arg7) {
        this.method538(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lw;Lg;Lul;[Ldd;[Lo;)V", line = 14)
    public class72(class199 arg0, class109 arg1, class411 arg2, class506[] arg3, class24[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7490;
            var7[var11] = arg3[var11].field7495;
            var8[var11] = arg3[var11].field7489;
            var9[var11] = arg3[var11].field7497;
            var10[var11] = arg3[var11].field7492;
        }
        this.method539(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ra", name = "OA", descriptor = "(CIIIZLta;II)V")
    private final native void method538(char arg0, int arg1, int arg2, int arg3, boolean arg4, class145 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "va", descriptor = "(Lw;Lg;[[B[I[I[I[I)V")
    private final native void method539(class199 arg0, class109 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "(CIIIZ)V")
    public final native void method483(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "()V")
    public final native void method540();
}
