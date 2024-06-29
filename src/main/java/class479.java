import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class479 extends class268 implements class415 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLi;II)V", line = 6)
    public final void method161(char arg0, int arg1, int arg2, int arg3, boolean arg4, class30 arg5, int arg6, int arg7) {
        this.method2847(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lc;Lk;Lju;[Lmn;[Laa;)V", line = 9)
    public class479(class124 arg0, class403 arg1, class82 arg2, class252[] arg3, class341[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field3506;
            var7[var11] = arg3[var11].field3512;
            var8[var11] = arg3[var11].field3513;
            var9[var11] = arg3[var11].field3509;
            var10[var11] = arg3[var11].field3505;
        }
        this.method2846(arg0, arg1, var6, arg3[0].field3508, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(CIIIZ)V")
    public final native void method164(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "U", descriptor = "(Lc;Lk;[[B[I[I[I[I[I)V")
    private final native void method2846(class124 arg0, class403 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!h", name = "ma", descriptor = "(CIIIZLi;II)V")
    private final native void method2847(char arg0, int arg1, int arg2, int arg3, boolean arg4, class30 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "pa", descriptor = "()V")
    public final native void method304();
}
