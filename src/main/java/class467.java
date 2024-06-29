import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class467 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ll;")
    public static class16 field6747;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    public static boolean field6749;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
    public static final int method2818(int arg0, int arg1) {
        field6748++;
        double var2 = (double) ((arg1 & 0xFFA53C) >> 16) / 256.0D;
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
        if (arg0 != 18739) {
            field6749 = false;
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
        return ((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method2819(int arg0) {
        field6747 = null;
        if (arg0 != 11312) {
            field6747 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    public static final void method2820(int arg0, int arg1) {
        class490 var2 = class125.field1664[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class490 var4 = class125.field1664[var3][arg0][arg1] = class125.field1664[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field7143--;
                for (class376 var5 = var4.field7127; var5 != null; var5 = var5.field4952) {
                    class205 var6 = var5.field4953;
                    if (var6.field2673 == arg0 && var6.field2671 == arg1) {
                        var6.field2676--;
                    }
                }
            }
        }
        if (class125.field1664[0][arg0][arg1] == null) {
            class125.field1664[0][arg0][arg1] = new class490(0, arg0, arg1);
            class125.field1664[0][arg0][arg1].field7140 = 1;
        }
        class125.field1664[0][arg0][arg1].field7146 = var2;
        class125.field1664[3][arg0][arg1] = null;
    }
}
