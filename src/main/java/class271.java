import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class271 extends class301 implements class89 {

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CIIIZLfa;II)V", line = 4)
    public final void method1103(char arg0, int arg1, int arg2, int arg3, boolean arg4, class185 arg5, int arg6, int arg7) {
        this.method1659(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;La;Lil;[Lme;[Lxa;)V", line = 12)
    public class271(class682 arg0, class405 arg1, class598 arg2, class366[] arg3, class424[] arg4) {
        super(arg0, arg2);
        byte[][] var6 = new byte[arg3.length][];
        int[] var7 = new int[arg3.length];
        int[] var8 = new int[arg3.length];
        int[] var9 = new int[arg3.length];
        int[] var10 = new int[arg3.length];
        for (int var11 = 0; var11 < arg3.length; var11++) {
            var6[var11] = arg3[var11].field5256;
            var7[var11] = arg3[var11].field5252;
            var8[var11] = arg3[var11].field5253;
            var9[var11] = arg3[var11].field5250;
            var10[var11] = arg3[var11].field5251;
        }
        this.method1660(arg0, arg1, var6, arg3[0].field5248, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(CIIIZ)V")
    public final native void method1099(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "(CIIIZLfa;II)V")
    private final native void method1659(char arg0, int arg1, int arg2, int arg3, boolean arg4, class185 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "(Lda;La;[[B[I[I[I[I[I)V")
    private final native void method1660(class682 arg0, class405 arg1, byte[][] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);
}
