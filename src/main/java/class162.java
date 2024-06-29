import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class162 extends class307 implements class240 {

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lqa;Lna;Ldu;[Lul;[Ll;)V", line = 5)
    public class162(class131 arg0, class253 arg1, class443 arg2, class319[] arg3, class127[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4921;
            var7[var11] = arg3[var11].field4922;
            var8[var11] = arg3[var11].field4920;
            var9[var11] = arg3[var11].field4918;
            var10[var11] = arg3[var11].field4925;
        }
        this.method1143(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(CIIIZLma;II)V", line = 37)
    public final void method1145(char arg0, int arg1, int arg2, int arg3, boolean arg4, class249 arg5, int arg6, int arg7) {
        this.method1142(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "A", descriptor = "(CIIIZLma;II)V")
    private final native void method1142(char arg0, int arg1, int arg2, int arg3, boolean arg4, class249 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Lqa;Lna;[[B[I[I[I[I)V")
    private final native void method1143(class131 arg0, class253 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method1144(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!s", name = "EA", descriptor = "()V")
    public final native void method471();
}
