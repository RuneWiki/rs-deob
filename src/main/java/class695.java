import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class695 extends class64 implements class560 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lkaa;[Luh;[Lhk;)V", line = 4)
    public class695(class725 arg0, class56 arg1, class49 arg2, class174[] arg3, class107[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field2776;
            var7[var11] = arg3[var11].field2781;
            var8[var11] = arg3[var11].field2782;
            var9[var11] = arg3[var11].field2774;
            var10[var11] = arg3[var11].field2778;
        }
        this.method5057(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 34)
    public final void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7) {
        this.method5058(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method121(boolean arg0);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method120(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method5057(class725 arg0, class56 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method5058(char arg0, int arg1, int arg2, int arg3, boolean arg4, class514 arg5, int arg6, int arg7);
}
