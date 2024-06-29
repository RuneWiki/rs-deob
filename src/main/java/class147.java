import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class147 extends class70 {

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "[I")
    public static int[] field1645 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1646 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "Ljo;")
    public static class303 field1648;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "Lbr;")
    public static class357 field1644;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 4)
    public static void method802(byte arg0) {
        if (arg0 != 20) {
            method803(false, -54);
        }
        field1646 = null;
        field1648 = null;
        field1644 = null;
        field1645 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)I", line = 19)
    public static final int method803(boolean arg0, int arg1) {
        field1647++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
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
        if (!arg0) {
            return 47;
        }
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
}
