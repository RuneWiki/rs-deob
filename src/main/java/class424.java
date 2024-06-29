import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class424 extends class187 {

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "Lkj;")
    public class235 field6219;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "Lph;")
    public static class114 field6221 = new class114(64);

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    public static int field6223 = 0;

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "Z")
    public static boolean field6224 = false;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "[Lpe;")
    public static class390[] field6225 = new class390[4];

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field6226 = 0;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)I")
    public static final int method2636(int arg0, int arg1) {
        field6218++;
        int var2 = 4 / ((arg0 - 21) / 36);
        double var3 = (double) ((arg1 & 0xFFA00B) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFCB) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        int var23 = (int) (var17 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return ((var21 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(ZI)V")
    public static final void method2637(boolean arg0, int arg1) {
        if (arg1 == -1417244891) {
            class101.field1195 = arg0;
            field6220++;
            class77.field871 = !class138.method758(-10762);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkj;)V")
    public class424(class235 arg0) {
        this.field6219 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
    public static void method2638(int arg0) {
        field6221 = null;
        if (arg0 == -12145) {
            field6225 = null;
        }
    }
}
