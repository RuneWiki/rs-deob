import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class555 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[S")
    private static short[] field7855 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[S")
    private static short[] field7861 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[S")
    private static short[] field7860 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[[S")
    public static short[][] field7859 = new short[][] { field7855, field7861, field7860 };

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lkea;")
    public static class213 field7856 = new class213(32);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static void method3147(int arg0) {
        field7859 = null;
        field7860 = null;
        field7861 = null;
        field7856 = null;
        field7855 = null;
        int var1 = 106 / ((arg0 + 14) / 53);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public static final void method3148(boolean arg0) {
        field7857++;
        if (class689.field9703 != null) {
            return;
        }
        class689.field9703 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        int var4 = 0;
        if (!arg0) {
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
                } else if (var14 == 4) {
                    var10 = var16;
                    var9 = var18;
                    var11 = var8;
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
                class689.field9703[var3++] = var25;
            }
            var4++;
        }
    }
}
