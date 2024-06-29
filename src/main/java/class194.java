import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class194 extends class489 implements class276 {

    @OriginalMember(owner = "client!w", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!w", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method1278(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7) {
        this.method1333(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!w", name = "ca", descriptor = "(Lh;Lba;[[B[I[I[I[I)V")
    private final native void method1332(class469 arg0, class262 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "(CIIIZ)V")
    public final native void method1277(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!w", name = "K", descriptor = "(CIIIZLea;II)V")
    private final native void method1333(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lh;Lba;Leu;[Lwe;[Lf;)V")
    public class194(class469 arg0, class262 arg1, class332 arg2, class279[] arg3, class529[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4006;
            var7[var11] = arg3[var11].field4005;
            var8[var11] = arg3[var11].field4003;
            var9[var11] = arg3[var11].field4007;
            var10[var11] = arg3[var11].field4008;
        }
        this.method1332(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class379.method2355(4650, this);
    }
}
