import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class661 extends class59 implements class529 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 11)
    public final void method106(char arg0, int arg1, int arg2, int arg3, boolean arg4, class484 arg5, int arg6, int arg7) {
        this.method3721(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lfp;[Lfw;[Lkr;)V", line = 16)
    public class661(class691 arg0, class51 arg1, class323 arg2, class55[] arg3, class743[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1041;
            var7[var11] = arg3[var11].field1044;
            var8[var11] = arg3[var11].field1038;
            var9[var11] = arg3[var11].field1042;
            var10[var11] = arg3[var11].field1036;
        }
        this.method3722(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method3721(char arg0, int arg1, int arg2, int arg3, boolean arg4, class484 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method3722(class691 arg0, class51 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method104(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);
}
