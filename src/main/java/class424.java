import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class424 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5947 = 0;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lst;")
    public static class335 field5950 = new class335(20, -1);

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field5951 = 1406;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lgw;")
    public static class690 field5953 = new class690(64);

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field5954 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
    public static int[] field5955 = new int[256];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Ljg;")
    public static class246 field5952;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method2638(boolean arg0) {
        field5952 = null;
        field5953 = null;
        field5950 = null;
        if (!arg0) {
            field5955 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2639(boolean arg0, int arg1) {
        field5949++;
        if (arg1 != 10) {
            field5952 = null;
        }
        boolean var2 = class129.field1802.method289();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class129.field1802.method278();
        } else if (!class129.field1802.method283()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class332.field4707.method2158(arg0 ? 1 : 0, class332.field4707.field4767, -15);
            class263.method1802(-2);
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
    public static final int method2640(int arg0, boolean arg1) {
        field5948++;
        double var2 = (double) ((arg0 & 0xFFC45B) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF14) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
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
        if (arg1) {
            method2640(67, true);
        }
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
        return (var21 >> 5 << 7) + ((var20 & 0xFF) >> 2 << 10) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
    public static final boolean method2641(int arg0, int arg1) {
        field5946++;
        if (class518.field7230[arg0]) {
            return true;
        }
        if (arg1 != -11664) {
            field5955 = null;
        }
        if (!class216.field2822.method1586((byte) -125, arg0)) {
            return false;
        }
        int var2 = class216.field2822.method1597(arg0, 0);
        if (var2 == 0) {
            class518.field7230[arg0] = true;
            return true;
        }
        if (class266.field3900[arg0] == null) {
            class266.field3900[arg0] = new class755[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class266.field3900[arg0][var3] == null) {
                byte[] var4 = class216.field2822.method1572(arg0, 0, var3);
                if (var4 != null) {
                    class755 var5 = class266.field3900[arg0][var3] = new class755();
                    var5.field10445 = (arg0 << 16) + var3;
                    if (var4[0] != -1) {
                        throw new IllegalStateException("if1");
                    }
                    var5.method4190(new class63(var4), -1);
                }
            }
        }
        class518.field7230[arg0] = true;
        return true;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5955[var0] = var1;
        }
    }
}
