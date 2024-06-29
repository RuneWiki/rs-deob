import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class101 {

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lg;")
    public static class135 field1252;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Llaa;")
    public class101 field1249;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "Llaa;")
    public class101 field1253;

    static {
        new class180(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        new class180("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field1250 = 0;
        field1252 = new class135(1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)I", line = 13)
    public static final int method609(int arg0, int arg1) {
        if (arg0 != -407448383) {
            field1252 = null;
        }
        field1248++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF34) >> 8) / 256.0D;
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
        return (var22 >> 1) + (((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V", line = 121)
    public final void method610(byte arg0) {
        field1251++;
        if (arg0 <= -74 && this.field1253 != null) {
            this.field1253.field1249 = this.field1249;
            this.field1249.field1253 = this.field1253;
            this.field1249 = null;
            this.field1253 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)V", line = 139)
    public static void method611(byte arg0) {
        if (arg0 != -39) {
            field1250 = 117;
        }
        field1252 = null;
    }
}
