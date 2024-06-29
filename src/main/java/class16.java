import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class60 implements class533 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLaa;II)V", line = 4)
    public final void method115(char arg0, int arg1, int arg2, int arg3, boolean arg4, class490 arg5, int arg6, int arg7) {
        this.method114(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Loa;Lya;Lrc;[Ljn;[Lhu;)V", line = 7)
    public class16(class695 arg0, class52 arg1, class539 arg2, class720[] arg3, class133[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field10023;
            var7[var11] = arg3[var11].field10028;
            var8[var11] = arg3[var11].field10029;
            var9[var11] = arg3[var11].field10024;
            var10[var11] = arg3[var11].field10031;
        }
        this.method117(arg0, arg1, var6, arg3[0].field10027, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLaa;II)V")
    private final native void method114(char arg0, int arg1, int arg2, int arg3, boolean arg4, class490 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public final native void method116(boolean arg0);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V")
    private final native void method117(class695 arg0, class52 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method118(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
