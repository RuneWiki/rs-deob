import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class233 extends class92 implements class28 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(CIIIZLpa;II)V", line = 3)
    public final void method213(char arg0, int arg1, int arg2, int arg3, boolean arg4, class311 arg5, int arg6, int arg7) {
        this.method1492(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(66, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(La;Lc;Llg;[Lqm;[Lha;)V", line = 16)
    public class233(class530 arg0, class160 arg1, class352 arg2, class126[] arg3, class53[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1773;
            var7[var11] = arg3[var11].field1767;
            var8[var11] = arg3[var11].field1771;
            var9[var11] = arg3[var11].field1766;
            var10[var11] = arg3[var11].field1770;
        }
        this.method1493(arg0, arg1, var6, arg3[0].field1772, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!ja", name = "DA", descriptor = "(CIIIZLpa;II)V")
    private final native void method1492(char arg0, int arg1, int arg2, int arg3, boolean arg4, class311 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ja", name = "da", descriptor = "(La;Lc;[[B[I[I[I[I[I)V")
    private final native void method1493(class530 arg0, class160 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ja", name = "HA", descriptor = "(CIIIZ)V")
    public final native void method216(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
