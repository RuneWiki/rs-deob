import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class729 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field10172 = 0;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lgea;")
    public static class76 field10176 = new class76(128);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Ld;")
    public static class152 field10175;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public static void method4092(int arg0) {
        if (arg0 != 255) {
            method4093(null, (byte) -123, -77);
        }
        field10176 = null;
        field10175 = null;
    }

    @OriginalMember(owner = "client!cm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10178++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lsba;BI)Ljava/lang/String;")
    public static final String method4093(class218 arg0, byte arg1, int arg2) {
        field10171++;
        if (arg1 <= 51) {
            return null;
        } else if (!client.method1835(arg0).method3965((byte) -72, arg2) && arg0.field2804 == null) {
            return null;
        } else if (arg0.field2828 == null || arg2 >= arg0.field2828.length || arg0.field2828[arg2] == null || arg0.field2828[arg2].trim().length() == 0) {
            return class116.field1519 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field2828[arg2];
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I")
    public static final int method4094(int arg0, int arg1) {
        field10173++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF1E) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
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
        int var18 = 113 % ((arg1 - 46) / 38);
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
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var16 * 256.0D);
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
}
