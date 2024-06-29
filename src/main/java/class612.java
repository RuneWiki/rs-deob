import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class612 extends class287 {

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "[B")
    public byte[] field8704;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "J")
    public static long field8700;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIJ)V", line = 7)
    public static final void method3573(int arg0, int arg1, int arg2, long arg3) {
        field8701++;
        int var5 = arg1 & (int) arg3 >> 14;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class176.method1104(var6, 0, arg2, 0, 0, true, arg0, (byte) -76, var5);
            return;
        }
        class30 var8 = class264.field3604.method3188(var7, (byte) -57);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field440;
            var10 = var8.field446;
        } else {
            var9 = var8.field446;
            var10 = var8.field440;
        }
        int var11 = var8.field411;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class176.method1104(0, var10, arg2, var9, var11, true, arg0, (byte) -76, 0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I", line = 50)
    public static final int method3574(byte arg0, int arg1) {
        field8699++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
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
        if (arg0 != -117) {
            field8700 = -42L;
        }
        return ((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z", line = 154)
    public static final boolean method3575(int arg0) {
        field8703++;
        if (class213.field3004 < 1) {
            return false;
        } else {
            if (arg0 <= 87) {
                method3574((byte) -70, 74);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FI)F", line = 169)
    public static final float method3576(float arg0, int arg1) {
        if (arg1 != 651653936) {
            method3573(-112, 61, 126, 72L);
        }
        field8702++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V", line = 180)
    public class612(byte[] arg0) {
        this.field8704 = arg0;
    }
}
