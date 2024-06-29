import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class181 extends class490 implements class276 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lh;Lba;Lgv;[Lmp;[Lf;)V", line = 3)
    public class181(class470 arg0, class262 arg1, class56 arg2, class531[] arg3, class529[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field7817;
            var7[var11] = arg3[var11].field7821;
            var8[var11] = arg3[var11].field7815;
            var9[var11] = arg3[var11].field7814;
            var10[var11] = arg3[var11].field7820;
        }
        this.method1096(arg0, arg1, var6, arg3[0].field7816, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(CIIIZLea;II)V", line = 34)
    public final void method547(char arg0, int arg1, int arg2, int arg3, boolean arg4, class382 arg5, int arg6, int arg7) {
        this.method1097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() {
        class390.method2237(true, this);
    }

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "(CIIIZ)V")
    public final native void method544(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ja", name = "ya", descriptor = "()V")
    public final native void method79();

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(Lh;Lba;[[B[I[I[I[I[I)V")
    private final native void method1096(class470 arg0, class262 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "(CIIIZLea;II)V")
    private final native void method1097(char arg0, int arg1, int arg2, int arg3, boolean arg4, class382 arg5, int arg6, int arg7);
}
