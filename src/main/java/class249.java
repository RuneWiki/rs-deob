import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class249 extends class91 implements class27 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(CIIIZ)V")
    public final native void method669(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method672(char arg0, int arg1, int arg2, int arg3, boolean arg4, class310 arg5, int arg6, int arg7) {
        this.method1531(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(CIIIZLpa;II)V")
    private final native void method1531(char arg0, int arg1, int arg2, int arg3, boolean arg4, class310 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "TA", descriptor = "(La;Lc;[[B[I[I[I[I)V")
    private final native void method1532(class530 arg0, class158 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(La;Lc;Lpu;[Lbt;[Lha;)V")
    public class249(class530 arg0, class158 arg1, class483 arg2, class38[] arg3, class52[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field782;
            var7[var11] = arg3[var11].field785;
            var8[var11] = arg3[var11].field783;
            var9[var11] = arg3[var11].field787;
            var10[var11] = arg3[var11].field786;
        }
        this.method1532(arg0, arg1, var6, var7, var8, var9, var10);
    }
}
