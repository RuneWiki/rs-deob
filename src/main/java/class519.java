import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class519 extends class216 implements class65 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLaa;II)V", line = 3)
    public final void method946(char arg0, int arg1, int arg2, int arg3, boolean arg4, class685 arg5, int arg6, int arg7) {
        this.method3950(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, 126);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Loa;Lya;Lcd;[Lcu;[Ltb;)V", line = 16)
    public class519(class473 arg0, class770 arg1, class161 arg2, class66[] arg3, class392[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field982;
            var7[var11] = arg3[var11].field981;
            var8[var11] = arg3[var11].field977;
            var9[var11] = arg3[var11].field984;
            var10[var11] = arg3[var11].field983;
        }
        this.method3949(arg0, arg1, var6, arg3[0].field979, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method950(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V")
    private final native void method3949(class473 arg0, class770 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public final native void method690(boolean arg0);

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLaa;II)V")
    private final native void method3950(char arg0, int arg1, int arg2, int arg3, boolean arg4, class685 arg5, int arg6, int arg7);
}
