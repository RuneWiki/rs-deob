import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class63 {

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "Ldb;")
    public static class272 field711 = new class272(15, 0, 1, 0);

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "[I")
    public static int[] field712 = new int[1];

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Lig;")
    public static class206 field713 = new class206(94, 0);

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IB)Z")
    public static final boolean method444(int arg0, byte arg1) {
        field710++;
        if (arg1 > -46) {
            field713 = null;
        }
        return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
    public static void method445(int arg0) {
        field712 = null;
        field711 = null;
        int var1 = 106 % ((arg0 - 45) / 60);
        field713 = null;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
    public static final void method446(int arg0) {
        field709++;
        if (class348.field4972 != null) {
            return;
        }
        class348.field4972 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 < 9) {
            return;
        }
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
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var11 = var16;
                    var10 = var8;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class348.field4972[var3++] = var25;
            }
        }
    }
}
