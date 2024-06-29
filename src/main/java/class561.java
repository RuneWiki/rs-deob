import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class561 extends class128 {

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    private int field7127;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "Lrn;")
    public static class633 field7130 = new class633(1, 1);

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "Lk;")
    public static class66 field7132 = new class66("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "[[[B")
    public static byte[][][] field7133;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(IZ)V", line = 5)
    public final void method3035(int arg0, boolean arg1) {
        super.field1709.method3975((byte) 123, this);
        if (arg0 != 255) {
            this.method3035(-99, true);
        }
        ++field7128;
        OpenGL.glTexParameteri(super.field1710, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)V", line = 20)
    public static void method3036(int arg0) {
        field7130 = null;
        field7133 = null;
        field7132 = null;
        if (arg0 != 1) {
            method3037(34, -119);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)I", line = 32)
    public static final int method3037(int arg0, int arg1) {
        ++field7129;
        double var2 = (double) (255 & arg0 >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var6 = (double) (255 & arg0) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 != var10) {
                if (var4 == var10) {
                    var12 = (var6 - var2) / (-var8 + var10) + 2.0D;
                } else if (var6 == var10) {
                    var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (var4 - var6) / (var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        if (arg1 < 122) {
            method3037(-3, -30);
        }
        int var21 = (int) (var14 * 256.0D);
        if (~var21 > -1) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (~var22 >= -244) {
            if (~var22 < -218) {
                var21 >>= 3;
            } else if (~var22 >= -193) {
                if (var22 > 179) {
                    var21 >>= 1;
                }
            } else {
                var21 >>= 2;
            }
        } else {
            var21 >>= 4;
        }
        return (var21 >> 5 << 7) + ((var20 >> 2 & 63) << 10) - -(var22 >> 1);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V", line = 134)
    public final void method760(byte arg0) {
        ++field7131;
        int var2 = 123 % ((65 - arg0) / 52);
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lck;II[BI)V", line = 147)
    public class561(class733 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field7127 = arg2;
        super.field1709.method3975((byte) 127, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field1710, 0, super.field1702, this.field7127, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method759(0, true);
    }
}
