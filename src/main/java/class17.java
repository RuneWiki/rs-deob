import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 extends class59 implements class531 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLaa;II)V", line = 12)
    public final void method82(char arg0, int arg1, int arg2, int arg3, boolean arg4, class485 arg5, int arg6, int arg7) {
        this.method84(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Loa;Lya;Lur;[Lg;[Lhu;)V", line = 17)
    public class17(class692 arg0, class51 arg1, class535 arg2, class155[] arg3, class131[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1702;
            var7[var11] = arg3[var11].field1708;
            var8[var11] = arg3[var11].field1706;
            var9[var11] = arg3[var11].field1709;
            var10[var11] = arg3[var11].field1703;
        }
        this.method81(arg0, arg1, var6, arg3[0].field1710, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method80(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V")
    private final native void method81(class692 arg0, class51 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLaa;II)V")
    private final native void method84(char arg0, int arg1, int arg2, int arg3, boolean arg4, class485 arg5, int arg6, int arg7);
}
