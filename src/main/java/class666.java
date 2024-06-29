import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class666 extends class216 implements class65 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 6)
    public final void method946(char arg0, int arg1, int arg2, int arg3, boolean arg4, class685 arg5, int arg6, int arg7) {
        this.method4803(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lcd;[Lcu;[Ltb;)V", line = 11)
    public class666(class473 arg0, class770 arg1, class161 arg2, class66[] arg3, class392[] arg4) {
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
        this.method4802(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, 127);
        }
    }

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method4802(class473 arg0, class770 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method4803(char arg0, int arg1, int arg2, int arg3, boolean arg4, class685 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method950(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method690(boolean arg0);
}
