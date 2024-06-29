import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class64 extends class439 {

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    public int field1130 = 0;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "Z")
    public static boolean field1135 = false;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field1128 = -1;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "Lao;")
    public static class188 field1131 = new class188(50, 8);

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public static void method566(int arg0) {
        if (arg0 != -11563) {
            method566(83);
        }
        field1131 = null;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
    public static final void method567(int arg0) {
        field1124++;
        if (class258.field3724 != null) {
            return;
        }
        class258.field3724 = new int[65536];
        if (arg0 <= 70) {
            method566(75);
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
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
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
                int var25 = (var23 << 8) + ((var22 << 16) - 16777216) + var24;
                class258.field3724[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
    public static final void method568(int arg0) {
        int var1 = -113 / ((-arg0 - 52) / 41);
        field1126++;
        if (class112.field1784 == 5) {
            class112.field1784 = 6;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method569(int arg0, int arg1, String arg2, int arg3, String arg4, String arg5) {
        if (arg0 == 2) {
            class160.method1154(-10444, arg4, -1, arg5, arg3, null, arg2, arg1);
            field1127++;
        }
    }
}
