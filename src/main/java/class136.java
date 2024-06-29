import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class136 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lvt;")
    public static class344 field1659 = new class344("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Luv;")
    public static class3 field1662 = new class3(4, 4);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[I")
    public static int[] field1665 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lkr;")
    public static class329 field1666;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I")
    public static final int method713(int arg0, boolean arg1) {
        field1664++;
        double var2 = (double) ((arg0 & 0xFF79A4) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
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
        int var21 = (int) (var14 * 256.0D);
        if (!arg1) {
            field1662 = null;
        }
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
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method714(byte arg0) {
        field1666 = null;
        if (arg0 >= -81) {
            field1665 = null;
        }
        field1659 = null;
        field1662 = null;
        field1665 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
    public static final boolean method715(int arg0, int arg1, int arg2) {
        int var3 = -17 % ((45 - arg2) / 45);
        field1663++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    static {
        new class344("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }
}
