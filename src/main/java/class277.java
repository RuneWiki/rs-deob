import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class277 extends class299 implements class400 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method70(char arg0, int arg1, int arg2, int arg3, boolean arg4, class453 arg5, int arg6, int arg7) {
        this.method1862(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ra", name = "OA", descriptor = "(CIIIZLta;II)V")
    private final native void method1862(char arg0, int arg1, int arg2, int arg3, boolean arg4, class453 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lw;Lg;Laq;[Lok;[Lo;)V")
    public class277(class459 arg0, class97 arg1, class340 arg2, class175[] arg3, class139[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field2574;
            var7[var11] = arg3[var11].field2576;
            var8[var11] = arg3[var11].field2577;
            var9[var11] = arg3[var11].field2575;
            var10[var11] = arg3[var11].field2579;
        }
        this.method1863(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "(CIIIZ)V")
    public final native void method68(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ra", name = "va", descriptor = "(Lw;Lg;[[B[I[I[I[I)V")
    private final native void method1863(class459 arg0, class97 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);
}
