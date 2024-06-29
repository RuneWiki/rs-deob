import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class582 extends class402 implements class2 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lej;[Loia;[Lfd;)V", line = 8)
    public class582(class408 arg0, class74 arg1, class179 arg2, class52[] arg3, class298[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field763;
            var7[var11] = arg3[var11].field767;
            var8[var11] = arg3[var11].field766;
            var9[var11] = arg3[var11].field765;
            var10[var11] = arg3[var11].field761;
        }
        this.method3380(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 35)
    public final void method830(char arg0, int arg1, int arg2, int arg3, boolean arg4, class573 arg5, int arg6, int arg7) {
        this.method3379(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method3379(char arg0, int arg1, int arg2, int arg3, boolean arg4, class573 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method3380(class408 arg0, class74 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method12(boolean arg0);

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method829(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
