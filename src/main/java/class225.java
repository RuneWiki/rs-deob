import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class225 extends class269 implements class416 {

    @OriginalMember(owner = "client!b", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!b", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(CIIIZLi;II)V")
    public final void method403(char arg0, int arg1, int arg2, int arg3, boolean arg4, class31 arg5, int arg6, int arg7) {
        this.method1517(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lc;Lk;Lgg;[Lho;[Laa;)V")
    public class225(class125 arg0, class404 arg1, class119 arg2, class104[] arg3, class343[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1587;
            var7[var11] = arg3[var11].field1590;
            var8[var11] = arg3[var11].field1594;
            var9[var11] = arg3[var11].field1592;
            var10[var11] = arg3[var11].field1595;
        }
        this.method1518(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "(CIIIZ)V")
    public final native void method406(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!b", name = "w", descriptor = "(CIIIZLi;II)V")
    private final native void method1517(char arg0, int arg1, int arg2, int arg3, boolean arg4, class31 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!b", name = "MA", descriptor = "(Lc;Lk;[[B[I[I[I[I)V")
    private final native void method1518(class125 arg0, class404 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);
}
