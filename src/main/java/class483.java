import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public abstract class class483 extends class149 {

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Liu;")
    public static class517 field6847 = new class517(44, 20);

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Ltda;")
    public static class16 field6849;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2780(byte arg0) {
        field6848++;
        if (class12.field126 != null) {
            return;
        }
        class12.field126 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 >= -122) {
            field6849 = null;
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
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var11 = var16;
                    var9 = var17;
                    var10 = var8;
                } else if (var14 == 2) {
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class12.field126[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V", line = 125)
    public static void method2781(byte arg0) {
        field6847 = null;
        field6849 = null;
        if (arg0 > -75) {
            field6849 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)Luba;")
    public abstract class628 method2782(byte arg0);
}
