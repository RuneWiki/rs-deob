import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class33 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lec;")
    public static class25 field412 = new class25(50);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Z")
    public static final boolean method189(int arg0, int arg1) {
        if (arg0 != 2) {
            method190(false, -88, -80);
        }
        field407++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)I")
    public static final int method190(boolean arg0, int arg1, int arg2) {
        field408++;
        int var3 = class187.method1271(arg1 + 91923, arg2 + 45365, 4, (byte) 67) + (class187.method1271(arg1 + 37821, arg2 + 10294, 2, (byte) 67) - 128 >> 1) + (class187.method1271(arg1, arg2, 1, (byte) 67) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg0) {
            method192(23, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method191(byte arg0) {
        field412 = null;
        if (arg0 != 82) {
            field412 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)I")
    public static final int method192(int arg0, boolean arg1) {
        double var2 = (double) ((arg0 & 0xFFCA88) >> 16) / 256.0D;
        field411++;
        double var4 = (double) ((arg0 & 0xFF45) >> 8) / 256.0D;
        if (arg1) {
            method191((byte) -6);
        }
        double var6 = var2;
        if (var2 < var4) {
            var6 = var4;
        }
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var2;
        if (var4 < var2) {
            var10 = var4;
        }
        if (var6 < var8) {
            var6 = var8;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        double var12 = 0.0D;
        double var14 = (var6 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var6 != var10) {
            if (var14 < 0.5D) {
                var16 = (var6 - var10) / (var6 + var10);
            }
            if (var2 == var6) {
                var12 = (var4 - var8) / (var6 - var10);
            } else if (var4 == var6) {
                var12 = (var8 - var2) / (var6 - var10) + 2.0D;
            } else if (var6 == var8) {
                var12 = (var2 - var4) / (var6 - var10) + 4.0D;
            }
            if (var14 >= 0.5D) {
                var16 = (var6 - var10) / (2.0D - var6 - var10);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var14 * 256.0D);
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
        return (var22 >> 1) + (var20 >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class33() {
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lna;)V")
    public class33(class33 arg0) {
        this.field409 = arg0.field409;
        this.field410 = arg0.field410;
        this.field413 = arg0.field413;
        this.field406 = arg0.field406;
    }
}
