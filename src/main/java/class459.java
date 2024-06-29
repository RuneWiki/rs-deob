import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class459 {

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "[I")
    public static int[] field5995 = new int[200];

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "Lrn;")
    public static class633 field5987 = new class633(12, 2);

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "Z")
    public static boolean field5997 = false;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public int field5985;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public int field5986;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!uda", name = "o", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!uda", name = "p", descriptor = "I")
    public int field6000;

    @OriginalMember(owner = "client!uda", name = "q", descriptor = "I")
    public int field6001;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "[B")
    public byte[] field5988;

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "[B")
    public byte[] field5996;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "[I")
    public static int[] field5994;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)Lk;", line = 3)
    public static final class66 method2592(int arg0, byte arg1) {
        if (arg1 != -7) {
            return null;
        }
        field5990++;
        class66[] var2 = class703.method3810(-26);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class66 var4 = var2[var3];
            if (var4.field871 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V", line = 36)
    public static void method2593(byte arg0) {
        field5987 = null;
        field5994 = null;
        if (arg0 > -60) {
            field5987 = null;
        }
        field5995 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V", line = 58)
    public static final void method2594(int arg0) {
        field5992++;
        if (class558.field7098 != null) {
            return;
        }
        class558.field7098 = new int[65536];
        if (arg0 < 126) {
            field5998 = 69;
        }
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
                    var10 = var8;
                    var11 = var18;
                    var9 = var16;
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
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class558.field7098[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V", line = 190)
    public static final void method2595(int arg0) {
        field5993++;
        int var1 = 0;
        if (arg0 < 111) {
            field5994 = null;
        }
        for (int var2 = 0; var2 < class240.field3280; var2++) {
            for (int var3 = 0; var3 < class276.field3602; var3++) {
                if (class463.method2601(class28.field252, true, var3, var2, var1, 83)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
