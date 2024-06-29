import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class451 extends class33 implements class47 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lh;Lba;Lse;[Lrl;[Lf;)V", line = 5)
    public class451(class161 arg0, class79 arg1, class4 arg2, class476[] arg3, class191[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field6927;
            var7[var11] = arg3[var11].field6933;
            var8[var11] = arg3[var11].field6928;
            var9[var11] = arg3[var11].field6931;
            var10[var11] = arg3[var11].field6926;
        }
        this.method2719(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(CIIIZLea;II)V", line = 38)
    public final void method243(char arg0, int arg1, int arg2, int arg3, boolean arg4, class15 arg5, int arg6, int arg7) {
        this.method2720(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "(Lh;Lba;[[B[I[I[I[I)V")
    private final native void method2719(class161 arg0, class79 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(CIIIZLea;II)V")
    private final native void method2720(char arg0, int arg1, int arg2, int arg3, boolean arg4, class15 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(CIIIZ)V")
    public final native void method249(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
