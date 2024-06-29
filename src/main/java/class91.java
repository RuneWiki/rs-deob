import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class91 extends class259 implements class438 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-96, this);
        }
    }

    @OriginalMember(owner = "client!w", name = "HA", descriptor = "(CIIIZ)V")
    public final native void method807(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(La;Lc;Lrl;[Lfba;[Lha;)V")
    public class91(class326 arg0, class618 arg1, class633 arg2, class518[] arg3, class116[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7197;
            var7[var11] = arg3[var11].field7202;
            var8[var11] = arg3[var11].field7195;
            var9[var11] = arg3[var11].field7199;
            var10[var11] = arg3[var11].field7200;
        }
        this.method811(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method808(char arg0, int arg1, int arg2, int arg3, boolean arg4, class593 arg5, int arg6, int arg7) {
        this.method809(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "A", descriptor = "(CIIIZLpa;II)V")
    private final native void method809(char arg0, int arg1, int arg2, int arg3, boolean arg4, class593 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!w", name = "TA", descriptor = "(La;Lc;[[B[I[I[I[I)V")
    private final native void method811(class326 arg0, class618 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);
}
