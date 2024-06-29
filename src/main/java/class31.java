import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class31 extends class507 {

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[[B")
    public static byte[][] field318;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLla;Ljava/lang/String;I)V")
    public static final void method176(boolean arg0, class316 arg1, String arg2, int arg3) {
        field320++;
        if (arg3 < 72) {
            return;
        }
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class293.field3883.method1068(arg2, (byte) -46, 250, null);
        int var8 = class293.field3883.method1056(arg2, 169, null, 250) * 13;
        class343.field4596.method1153(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var8 + var4, -16777216, 0);
        class343.field4596.method1157(var5 - var4, -var4 + var6, var7 + var4 + var4, var4 + var8 + var4, -1, 0);
        arg1.method1876(var8, var5, null, 0, null, 0, null, (byte) -89, -1, var7, 1, 1, 0, arg2, var6, -1);
        class317.method1889(var6 - var4, (byte) 98, var4 + var8 + var4, var4 + var7 - -var4, var5 - var4);
        if (arg0) {
            class343.field4596.method1208();
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
    public static void method177(int arg0) {
        if (arg0 == 0) {
            field318 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public static final void method178(int arg0) {
        field319++;
        if (arg0 != -7154) {
            method177(78);
        }
        if (class445.field6483 != null) {
            return;
        }
        class445.field6483 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
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
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var11 = var8;
                    var10 = var16;
                    var9 = var18;
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
                int var25 = (var22 << 16) + var24 + (var23 << 8) - 16777216;
                class445.field6483[var3++] = var25;
            }
        }
    }
}
