import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class187 extends class317 implements class105 {

    @OriginalMember(owner = "client!s", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!s", name = "NA", descriptor = "(Lqa;Lna;[[B[I[I[I[I)V")
    private final native void method1239(class166 arg0, class35 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!s", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!s", name = "OA", descriptor = "(CIIIZ)V")
    public final native void method874(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class438.method2701(-72, this);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(CIIIZLma;II)V")
    public final void method872(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        this.method1240(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!s", name = "A", descriptor = "(CIIIZLma;II)V")
    private final native void method1240(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lqa;Lna;Llm;[Ldi;[Ll;)V")
    public class187(class166 arg0, class35 arg1, class348 arg2, class84[] arg3, class16[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field1211;
            var7[var11] = arg3[var11].field1204;
            var8[var11] = arg3[var11].field1207;
            var9[var11] = arg3[var11].field1205;
            var10[var11] = arg3[var11].field1209;
        }
        this.method1239(arg0, arg1, var6, var7, var8, var9, var10);
    }
}
