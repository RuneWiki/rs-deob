import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class758 extends class420 implements class2 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLaa;II)V", line = 5)
    public final void method1039(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
        this.method4126(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Loa;Lya;Lne;[Lvi;[Lpu;)V", line = 17)
    public class758(class426 arg0, class79 arg1, class166 arg2, class388[] arg3, class772[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4949;
            var7[var11] = arg3[var11].field4950;
            var8[var11] = arg3[var11].field4946;
            var9[var11] = arg3[var11].field4948;
            var10[var11] = arg3[var11].field4945;
        }
        this.method4127(arg0, arg1, var6, arg3[0].field4951, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method1037(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLaa;II)V")
    private final native void method4126(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V")
    private final native void method4127(class426 arg0, class79 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);
}
