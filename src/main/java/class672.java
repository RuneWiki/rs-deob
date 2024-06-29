import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class672 implements class343 {

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "Ltf;")
    private class701 field9357;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public static int field9356 = 0;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public static int field9355 = -1;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Lcq;")
    public static class110 field9352 = new class110(67, 6);

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "Z")
    public static boolean field9359 = false;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "[Lej;")
    public static class479[] field9360 = new class479[14];

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)I", line = 8)
    public final int method587(int arg0) {
        if (arg0 != 9856) {
            this.method584((byte) 23);
        }
        field9353++;
        return this.field9357.method3861((byte) 14) ? 100 : this.field9357.method3878((byte) -1);
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)I", line = 29)
    public static final int method3714(int arg0, byte arg1) {
        field9354++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        if (arg1 != 31) {
            return 89;
        }
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
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
        if (var21 < 0) {
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
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + (((var20 >> 2 & 0x3F) << 10) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Ltf;)V", line = 128)
    public class672(class701 arg0) {
        this.field9357 = arg0;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V", line = 139)
    public static void method3715(boolean arg0) {
        if (!arg0) {
            field9359 = false;
        }
        field9360 = null;
        field9352 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Ldea;", line = 154)
    public final class446 method584(byte arg0) {
        if (arg0 >= -64) {
            this.field9357 = null;
        }
        field9358++;
        return class446.field6287;
    }
}
