import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class608 {

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Lmv;")
    public static class297 field8214 = new class297(11, 0, 1, 2);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public int field8217;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public int field8218;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public int field8221;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZI)I")
    public static final int method3305(boolean arg0, int arg1) {
        field8215++;
        double var2 = (double) ((arg1 & 0xFF14A9) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF3D) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
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
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
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
        if (arg0) {
            method3309((byte) -55, 74, 28);
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
        return (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILfd;)V")
    private final void method3306(int arg0, int arg1, class418 arg2) {
        if (~arg0 == arg1) {
            this.field8218 = arg2.method2393(arg1 - 30725);
            this.field8221 = arg2.method2396(-118);
            this.field8217 = arg2.method2396(-112);
        }
        field8213++;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLfd;)V")
    public final void method3307(boolean arg0, class418 arg1) {
        field8219++;
        while (true) {
            int var3 = arg1.method2396(-19);
            if (var3 == 0) {
                if (arg0) {
                    this.field8218 = 32;
                    return;
                } else {
                    return;
                }
            }
            this.method3306(var3, -2, arg1);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public static void method3308(int arg0) {
        if (arg0 == 543324325) {
            field8214 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)Z")
    public static final boolean method3309(byte arg0, int arg1, int arg2) {
        field8216++;
        if (arg0 != -1) {
            field8220 = 56;
        }
        return (arg2 & 0x800) != 0;
    }
}
