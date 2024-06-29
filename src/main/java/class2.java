import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends InputStream {

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 3)
    public static final void method16(int arg0) {
        if (arg0 == 0) {
            class85.field1166.method338((byte) -122);
            field34++;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I", line = 14)
    public static final int method17(int arg0, int arg1) {
        field32++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFAA) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
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
        if (arg0 != -8201) {
            return 19;
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
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!ro", name = "read", descriptor = "()I", line = 119)
    public final int read() {
        class643.method3577(30000L, 0);
        field33++;
        return -1;
    }
}
