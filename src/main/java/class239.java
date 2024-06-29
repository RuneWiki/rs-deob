import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class239 extends class442 implements class784 {

    @OriginalMember(owner = "client!h", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(CIIIZLaa;II)V", line = 3)
    public final void method1190(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
        this.method1615(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!h", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Loa;Lya;Lhw;[Lfm;[Lho;)V", line = 17)
    public class239(class52 arg0, class317 arg1, class300 arg2, class279[] arg3, class318[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field4010;
            var7[var11] = arg3[var11].field4014;
            var8[var11] = arg3[var11].field4008;
            var9[var11] = arg3[var11].field4016;
            var10[var11] = arg3[var11].field4011;
        }
        this.method1616(arg0, arg1, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!h", name = "fa", descriptor = "(CIIIZ)V")
    public final native void method1191(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!h", name = "NA", descriptor = "(CIIIZLaa;II)V")
    private final native void method1615(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!h", name = "JA", descriptor = "(Loa;Lya;[[B[I[I[I[I)V")
    private final native void method1616(class52 arg0, class317 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "(Z)V")
    public final native void method450(boolean arg0);
}
