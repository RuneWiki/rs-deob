import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class39 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[B")
    public byte[] field582;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[S")
    public short[] field581;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[S")
    public short[] field584;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "[S")
    public short[] field585;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IFFF)F")
    public static final float method247(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 != -513) {
            method247(10, -0.660873F, -0.46486244F, 1.8807095F);
        }
        field579++;
        return (arg2 - arg1) * arg3 + arg1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
    public static final boolean method248(int arg0, int arg1) {
        field583++;
        if (arg1 != -27443) {
            method249(-91);
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static final void method249(int arg0) {
        if (arg0 != 32555) {
            return;
        }
        field580++;
        if (class272.field3455 != null) {
            return;
        }
        class272.field3455 = new int[65536];
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
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var9 = var17;
                    var10 = var8;
                } else if (var14 == 2) {
                    var9 = var16;
                    var11 = var18;
                    var10 = var8;
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
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class272.field3455[var3++] = var25;
            }
        }
    }
}
