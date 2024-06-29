import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class313 extends class409 implements class247 {

    @OriginalMember(owner = "client!ca", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method756(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7) {
        this.method1835(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ll;Lm;Laga;[Ltq;[Lf;)V")
    public class313(class168 arg0, class106 arg1, class658 arg2, class92[] arg3, class532[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1130;
            var7[var11] = arg3[var11].field1132;
            var8[var11] = arg3[var11].field1128;
            var9[var11] = arg3[var11].field1125;
            var10[var11] = arg3[var11].field1126;
        }
        this.method1834(arg0, arg1, var6, arg3[0].field1127, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ca", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "(Ll;Lm;[[B[I[I[I[I[I)V")
    private final native void method1834(class168 arg0, class106 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "(CIIIZLua;II)V")
    private final native void method1835(char arg0, int arg1, int arg2, int arg3, boolean arg4, class596 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ca", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method754(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
