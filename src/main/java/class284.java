import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class284 extends class262 implements class439 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(CIIIZLpa;II)V", line = 12)
    public final void method529(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7) {
        this.method1776(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(La;Lc;Ldd;[Lqr;[Lha;)V", line = 15)
    public class284(class329 arg0, class618 arg1, class166 arg2, class610[] arg3, class116[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field8976;
            var7[var11] = arg3[var11].field8975;
            var8[var11] = arg3[var11].field8972;
            var9[var11] = arg3[var11].field8971;
            var10[var11] = arg3[var11].field8973;
        }
        this.method1775(arg0, arg1, var6, arg3[0].field8974, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ja", name = "da", descriptor = "(La;Lc;[[B[I[I[I[I[I)V")
    private final native void method1775(class329 arg0, class618 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ja", name = "HA", descriptor = "(CIIIZ)V")
    public final native void method528(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ja", name = "DA", descriptor = "(CIIIZLpa;II)V")
    private final native void method1776(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);
}
