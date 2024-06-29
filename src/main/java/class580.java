import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class580 extends class400 implements class2 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Loq;[Ltba;[Lcw;)V", line = 12)
    public class580(class406 arg0, class74 arg1, class742 arg2, class320[] arg3, class21[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4125;
            var7[var11] = arg3[var11].field4122;
            var8[var11] = arg3[var11].field4121;
            var9[var11] = arg3[var11].field4127;
            var10[var11] = arg3[var11].field4123;
        }
        this.method3451(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 39)
    public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4, class571 arg5, int arg6, int arg7) {
        this.method3452(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method296(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method3451(class406 arg0, class74 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method3452(char arg0, int arg1, int arg2, int arg3, boolean arg4, class571 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method3(boolean arg0);
}
