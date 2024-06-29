import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class731 extends class423 implements class752 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(CIIIZLaa;II)V", line = 5)
    public final void method565(char arg0, int arg1, int arg2, int arg3, boolean arg4, class81 arg5, int arg6, int arg7) {
        this.method4082(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Loa;Lya;Ltba;[Lbe;[Lac;)V", line = 9)
    public class731(class50 arg0, class305 arg1, class56 arg2, class196[] arg3, class712[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field2521;
            var7[var11] = arg3[var11].field2527;
            var8[var11] = arg3[var11].field2525;
            var9[var11] = arg3[var11].field2526;
            var10[var11] = arg3[var11].field2522;
        }
        this.method4081(arg0, arg1, var6, arg3[0].field2529, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);

    @OriginalMember(owner = "client!n", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method564(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "(Loa;Lya;[[B[I[I[I[I[I)V")
    private final native void method4081(class50 arg0, class305 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!n", name = "PA", descriptor = "(CIIIZLaa;II)V")
    private final native void method4082(char arg0, int arg1, int arg2, int arg3, boolean arg4, class81 arg5, int arg6, int arg7);
}
