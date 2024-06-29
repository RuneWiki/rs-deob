import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class236 {

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "Ljj;")
    public static class398 field3077 = new class398(81, -1);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Lpi;")
    public static class132 field3078;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Lgda;")
    public static class157 field3079;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field3080;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "[[[I")
    public static int[][][] field3074;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1461(int arg0) {
        field3076++;
        if (class554.field7586 != null) {
            return;
        }
        class554.field7586 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        int var4 = 0;
        if (arg0 < 112) {
            return;
        }
        while (var4 < 512) {
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
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var9 = var16;
                    var11 = var8;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var10 = var16;
                    var9 = var8;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + ((var23 << 8) + var24 - 16777216);
                class554.field7586[var3++] = var25;
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 126)
    public static void method1462(int arg0) {
        field3079 = null;
        field3074 = null;
        field3080 = null;
        field3077 = null;
        field3078 = null;
        int var1 = -84 % ((arg0 + 54) / 59);
    }
}
