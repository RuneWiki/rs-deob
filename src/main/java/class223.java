import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class223 extends class268 implements class415 {

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "MA", descriptor = "(Lc;Lk;[[B[I[I[I[I)V")
    private final native void method1503(class124 arg0, class403 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(CIIIZ)V")
    public final native void method164(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lc;Lk;Lju;[Lmn;[Laa;)V")
    public class223(class124 arg0, class403 arg1, class82 arg2, class252[] arg3, class341[] arg4) {
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
        this.method1503(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!b", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!b", name = "w", descriptor = "(CIIIZLi;II)V")
    private final native void method1504(char arg0, int arg1, int arg2, int arg3, boolean arg4, class30 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLi;II)V")
    public final void method161(char arg0, int arg1, int arg2, int arg3, boolean arg4, class30 arg5, int arg6, int arg7) {
        this.method1504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
