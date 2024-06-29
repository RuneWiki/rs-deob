import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class220 extends class167 implements class241 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lh;Lba;Lov;[Lne;[Lf;)V")
    public class220(class373 arg0, class498 arg1, class278 arg2, class136[] arg3, class404[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1833;
            var7[var11] = arg3[var11].field1837;
            var8[var11] = arg3[var11].field1832;
            var9[var11] = arg3[var11].field1835;
            var10[var11] = arg3[var11].field1834;
        }
        this.method1401(arg0, arg1, var6, arg3[0].field1831, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "(CIIIZLea;II)V")
    private final native void method1400(char arg0, int arg1, int arg2, int arg3, boolean arg4, class113 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "(CIIIZ)V")
    public final native void method388(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class313.method1863(this, -63);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(CIIIZLea;II)V")
    public final void method385(char arg0, int arg1, int arg2, int arg3, boolean arg4, class113 arg5, int arg6, int arg7) {
        this.method1400(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "(Lh;Lba;[[B[I[I[I[I[I)V")
    private final native void method1401(class373 arg0, class498 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ja", name = "ya", descriptor = "()V")
    public final native void method373();
}
