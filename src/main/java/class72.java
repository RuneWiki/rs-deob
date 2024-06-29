import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class72 extends class316 implements class350 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method422(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7) {
        this.method424(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "(CIIIZ)V")
    public final native void method423(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!ra", name = "OA", descriptor = "(CIIIZLta;II)V")
    private final native void method424(char arg0, int arg1, int arg2, int arg3, boolean arg4, class144 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "va", descriptor = "(Lw;Lg;[[B[I[I[I[I)V")
    private final native void method425(class197 arg0, class108 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lw;Lg;Lgf;[Lev;[Lo;)V")
    public class72(class197 arg0, class108 arg1, class183 arg2, class491[] arg3, class24[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7192;
            var7[var11] = arg3[var11].field7196;
            var8[var11] = arg3[var11].field7191;
            var9[var11] = arg3[var11].field7195;
            var10[var11] = arg3[var11].field7199;
        }
        this.method425(arg0, arg1, var6, var7, var8, var9, var10);
    }
}
