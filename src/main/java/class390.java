import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class390 extends class7 implements class462 {

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    private int field5381;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    private int field5383;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Lkda;")
    public static class328 field5379;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field5382;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V", line = 3)
    public static final void method2326(int arg0, int arg1, int arg2, long[] arg3, Object[] arg4) {
        if (~arg2 > ~arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; ~arg0 < ~var11; ++var11) {
                if ((long) (var11 & var10) + var7 > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var9;
            method2326(var6 + -1, arg1, arg2, arg3, arg4);
            method2326(arg0, -16424, var6 + 1, arg3, arg4);
        }
        if (arg1 != -16424) {
            method2326(64, 84, -25, (long[]) null, (Object[]) null);
        }
        ++field5384;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lag;Laq;III[B)V", line = 59)
    public class390(class587 arg0, class141 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class194.field2874, arg2 * arg3 * arg4, false);
        this.field5385 = arg3;
        this.field5381 = arg2;
        this.field5383 = arg4;
        super.field69.method2632(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field78, 0, this.method29((byte) -86), this.field5381, this.field5385, this.field5383, 0, class546.method3319(58, super.field63), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 77)
    public static void method2327(int arg0) {
        field5382 = null;
        field5379 = null;
        if (arg0 != 1) {
            method2327(-83);
        }
    }
}
