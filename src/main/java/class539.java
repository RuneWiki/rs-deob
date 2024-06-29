import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class539 extends class578 {

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "Laj;")
    public class284 field7278;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "Llh;")
    public static class487 field7279 = new class487(22, 4);

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "Z")
    public static boolean field7280 = true;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)Z", line = 7)
    public static final boolean method3047(int arg0, boolean arg1) {
        field7277++;
        if (!arg1) {
            field7280 = false;
        }
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 18)
    public static void method3048(byte arg0) {
        int var1 = -100 / ((-arg0 - 44) / 59);
        field7279 = null;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Laj;)V", line = 30)
    public class539(class284 arg0) {
        this.field7278 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V", line = 40)
    public static final void method3049(int arg0) {
        field7281++;
        if (class244.field3322 != null) {
            return;
        }
        class244.field3322 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 != 1) {
            field7279 = null;
        }
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
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var11 = var16;
                    var9 = var8;
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
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
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
                class244.field3322[var3++] = var25;
            }
        }
    }
}
