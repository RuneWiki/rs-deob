import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class62 {

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Leg;")
    private static class37 field1017 = class174.method1167("Walk here", 105);

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Leg;")
    private static class37 field1022 = class174.method1167("Loaded config", -75);

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Leg;")
    public static class37 field1020 = class174.method1167("Fermer", 69);

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Leg;")
    public static class37 field1024 = field1022;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static volatile int field1019 = 0;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field1023 = 0;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Leg;")
    public static class37 field1009 = field1017;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Leg;")
    public static class37 field1025 = class174.method1167("::noclip", 104);

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "J")
    public long field1027;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lei;")
    public class62 field1013;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Lei;")
    public class62 field1026;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "[I")
    public static int[] field1029;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[[[B")
    public static byte[][][] field1014;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIII)V")
    public static final void method440(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class274 var5 = class166.method1116(10, arg4, !arg1);
        var5.method1835(-66);
        if (arg1) {
            field1023 = 82;
        }
        var5.field4824 = arg3;
        var5.field4802 = arg2;
        field1015++;
        var5.field4813 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public final void method441(int arg0) {
        field1021++;
        if (this.field1026 == null) {
            return;
        }
        this.field1026.field1013 = this.field1013;
        if (arg0 == 16773377) {
            this.field1013.field1026 = this.field1026;
            this.field1013 = null;
            this.field1026 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method442(byte arg0) {
        field1014 = null;
        field1017 = null;
        field1024 = null;
        field1022 = null;
        if (arg0 != 3) {
            method440(-114, false, -51, -99, -51);
        }
        field1009 = null;
        field1025 = null;
        field1020 = null;
        field1029 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Z")
    public static final boolean method443(int arg0, int arg1) {
        field1012++;
        if (arg1 != -9170) {
            method444((byte) 49, -9);
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)I")
    public static final int method444(byte arg0, int arg1) {
        field1018++;
        double var2 = (double) ((arg1 & 0xFFF101) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var2;
        double var12 = 0.0D;
        if (var2 > var4) {
            var6 = var4;
        }
        if (var6 > var8) {
            var6 = var8;
        }
        double var14 = 0.0D;
        if (var4 > var2) {
            var10 = var4;
        }
        if (arg0 < 79) {
            field1014 = null;
        }
        if (var8 > var10) {
            var10 = var8;
        }
        double var16 = (var6 + var10) / 2.0D;
        if (var6 != var10) {
            if (var2 == var10) {
                var12 = (var4 - var8) / (var10 - var6);
            } else if (var4 == var10) {
                var12 = (var8 - var2) / (var10 - var6) + 2.0D;
            } else if (var8 == var10) {
                var12 = (var2 - var4) / (var10 - var6) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var6) / (var6 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var6) / (2.0D - var10 - var6);
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
        return (var20 >> 2 << 10) - (-(var21 >> 5 << 7) - (var22 >> 1));
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)Z")
    public final boolean method445(int arg0) {
        int var2 = -107 % ((arg0 + 35) / 33);
        field1010++;
        return this.field1026 != null;
    }
}
