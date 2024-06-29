import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class171 extends class38 {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lar;")
    public static class47 field2146 = new class47(16);

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lum;")
    public static class184 field2154 = new class184();

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Llg;")
    public static class20 field2151;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field2153;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public static void method899(byte arg0) {
        if (arg0 == 75) {
            field2146 = null;
            field2153 = null;
            field2151 = null;
            field2154 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method900(int arg0) {
        field2147++;
        if (class284.field3878 != null) {
            return;
        }
        class284.field3878 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = arg0; var4 < 512; var4++) {
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
                    var9 = var8;
                    var11 = var16;
                    var10 = var18;
                } else if (var14 == 1) {
                    var9 = var17;
                    var10 = var8;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var11 = var17;
                    var10 = var16;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class284.field3878[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static final void method901(int arg0) {
        class281.field3857.method295(20579, arg0);
        class104.field1283++;
        field2150++;
        class281.field3857.method1346(126, class243.field3305);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lnf;")
    public static final class256 method902(int arg0, int arg1) {
        field2148++;
        class256 var2 = (class256) class389.field5560.method616(-17, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class427.field6258.method1687(arg1, arg0, 255);
        class256 var4 = new class256();
        if (var3 != null) {
            var4.method1444(true, new class250(var3));
        }
        class389.field5560.method615((byte) -126, (long) arg1, var4);
        return var4;
    }
}
