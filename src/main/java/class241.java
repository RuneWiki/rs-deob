import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class241 extends class443 implements class784 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lrt;[Lde;[Lmq;)V", line = 3)
    public class241(class53 arg0, class318 arg1, class470 arg2, class418[] arg3, class85[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field5793;
            var7[var11] = arg3[var11].field5796;
            var8[var11] = arg3[var11].field5792;
            var9[var11] = arg3[var11].field5794;
            var10[var11] = arg3[var11].field5799;
        }
        this.method1610(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 36)
    public final void method180(char arg0, int arg1, int arg2, int arg3, boolean arg4, class88 arg5, int arg6, int arg7) {
        this.method1609(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method1609(char arg0, int arg1, int arg2, int arg3, boolean arg4, class88 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method179(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method444(boolean arg0);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method1610(class53 arg0, class318 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);
}
