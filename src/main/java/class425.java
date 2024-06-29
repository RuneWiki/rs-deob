import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class425 extends class87 {

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public int field6042;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "B")
    public byte field6035;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "S")
    public short field6036;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public int field6037;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public int field6029;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "S")
    public short field6031;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "S")
    public short field6028;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "Z")
    public boolean field6033;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "B")
    public byte field6041;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "S")
    public short field6030;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Ldm;")
    public static class46 field6034 = new class46();

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lej;")
    public static class104 field6045 = new class104("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Lcba;")
    public static class471 field6046 = new class471(50, 6);

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Lej;")
    public static class104 field6047 = new class104("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "F")
    public static float field6048;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field6038;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Lpe;")
    public static class524 field6043;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
    public void method338(int arg0) {
        if (arg0 != -25405) {
            this.field6041 = 80;
        }
        field6032++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
    public static final void method2532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6039++;
        if (class491.field6875.field3372 != 0 && arg4 != 0 && class202.field2830 < 50 && arg1 != -1) {
            class233.field3289[class202.field2830++] = new class640((byte) 2, arg1, arg4, arg0, arg2, 0);
        }
        if (arg3 != 0) {
            method2532(51, 57, 12, -90, 37);
        }
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)I")
    public abstract int method492(int arg0);

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)V")
    public static void method2533(int arg0) {
        field6045 = null;
        field6043 = null;
        field6034 = null;
        field6047 = null;
        if (arg0 == 0) {
            field6046 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6042 = arg2;
        this.field6035 = (byte) arg0;
        this.field6036 = (short) arg4;
        this.field6037 = arg1;
        this.field6029 = arg3;
        this.field6031 = (short) arg7;
        this.field6028 = (short) arg6;
        this.field6033 = arg8;
        this.field6041 = arg9;
        this.field6030 = (short) arg5;
    }

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "(I)V")
    public static final void method2534(int arg0) {
        field6040++;
        if (arg0 <= 46) {
            method2532(61, 65, 118, -75, -57);
        }
        if (class439.field6243 != null) {
            return;
        }
        class439.field6243 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var11 = var8;
                    var10 = var16;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var11 = var17;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class439.field6243[var3++] = var25;
            }
        }
    }
}
