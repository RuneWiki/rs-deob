import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class70 {

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "S")
    public short field1102;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "B")
    public byte field1101;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Lnu;")
    public class411 field1100;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "B")
    public byte field1105;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "[I")
    public static int[] field1097 = new int[120];

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field1107 = -1;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field1108 = -1;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Lq;")
    public static class152 field1103;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1097[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 8)
    public static void method572(byte arg0) {
        if (arg0 < 17) {
            field1103 = null;
        }
        field1103 = null;
        field1097 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V", line = 26)
    public static final void method573(int arg0, int arg1) {
        class371.field5147 = -1;
        if (arg0 != 7737) {
            method574(true, 123, -108);
        }
        class438.field6298 = arg1;
        field1098++;
        class371.field5147 = -1;
        class105.method881((byte) 123);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZII)Z", line = 43)
    public static final boolean method574(boolean arg0, int arg1, int arg2) {
        field1099++;
        if (arg0) {
            method576(null, 75);
        }
        return class491.method2880(-111, arg2, arg1) & class577.method3342((byte) -95, arg2, arg1);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)I", line = 63)
    public static final int method575(byte arg0, int arg1) {
        field1106++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF9B) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
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
        if (arg0 < 35) {
            field1103 = null;
        }
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
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lnu;III)V", line = 182)
    public class70(class411 arg0, int arg1, int arg2, int arg3) {
        this.field1102 = (short) arg1;
        this.field1101 = (byte) arg3;
        this.field1100 = arg0;
        this.field1105 = (byte) arg2;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 193)
    public static final boolean method576(String arg0, int arg1) {
        field1109++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class520.field7677; var2++) {
            if (arg0.equalsIgnoreCase(class437.field6290[var2])) {
                return true;
            }
        }
        if (arg1 != -1963318678) {
            field1107 = -71;
        }
        return arg0.equalsIgnoreCase(class103.field1708.field3848);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIB)I", line = 221)
    public static final int method577(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = 101 / ((71 - arg3) / 48);
        field1104++;
        int var5 = arg0 & 0x3;
        if (var5 == 0) {
            return arg1;
        } else if (var5 == 1) {
            return arg2;
        } else if (var5 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }
}
