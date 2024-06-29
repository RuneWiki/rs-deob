import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class338 extends class460 {

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Lkaa;")
    public static class47 field4777 = new class47(53, 4);

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(JJ)J", line = 3)
    public static long method2030(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IZ)V", line = 16)
    public final void method2031(int arg0, boolean arg1) {
        super.field6291.method3639(arg0 + 11981, this);
        ++field4778;
        if (arg0 != -11983) {
            this.method2032((byte) 95);
        }
        OpenGL.glTexParameteri(super.field6282, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 30)
    public final void method2032(byte arg0) {
        ++field4775;
        if (arg0 <= 106) {
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[B[IBI[[B[[B[I)I", line = 44)
    public static final int method2033(int arg0, byte[] arg1, int[] arg2, byte arg3, int arg4, byte[][] arg5, byte[][] arg6, int[] arg7) {
        ++field4776;
        int var8 = arg2[arg4];
        int var9 = arg7[arg4] + var8;
        int var10 = arg2[arg0];
        int var11 = arg7[arg0] + var10;
        int var12 = var8;
        if (~var10 < ~var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var11 > ~var9) {
            var13 = var11;
        }
        int var14 = arg1[arg4] & 255;
        int var15 = 118 / ((arg3 - -60) / 44);
        if (~(255 & arg1[arg0]) > ~var14) {
            var14 = 255 & arg1[arg0];
        }
        byte[] var16 = arg6[arg4];
        byte[] var17 = arg5[arg0];
        int var18 = -var8 + var12;
        int var19 = -var10 + var12;
        for (int var20 = var12; ~var13 < ~var20; ++var20) {
            int var21 = var16[var18++] - -var17[var19++];
            if (~var21 > ~var14) {
                var14 = var21;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V", line = 101)
    public static void method2034(boolean arg0) {
        field4777 = null;
        if (arg0) {
            field4779 = -114;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lrda;II[BI)V", line = 112)
    public class338(class663 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4780 = arg2;
        super.field6291.method3639(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6282, 0, super.field6297, this.field4780, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2615(false, true);
    }
}
