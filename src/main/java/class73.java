import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class73 {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lpg;")
    public static class492 field985;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Lui;")
    public static class375 field986;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
    public static int[] field988;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Lvr;")
    public static class306 field987;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Lui;")
    public static class375 field990;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field984;

    static {
        new class375(null, "geschickt werden.", null, null);
        field985 = new class492(58, 6);
        field986 = new class375("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        field989 = 0;
        field988 = new int[] { 1, 4 };
        field987 = new class306();
        field990 = new class375("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I", line = 7)
    public static final int method487(int arg0, int arg1) {
        field984++;
        double var2 = (double) ((arg1 & 0xFF3519) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF43) >> 8) / 256.0D;
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
        int var23 = 46 / ((arg0 + 53) / 40);
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 0x3F) << 10);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 117)
    public static void method488(byte arg0) {
        field985 = null;
        field988 = null;
        int var1 = 12 / ((-arg0 - 30) / 63);
        field986 = null;
        field987 = null;
        field990 = null;
    }
}
