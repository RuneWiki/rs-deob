import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class198 {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[F")
    public static float[] field3048 = new float[16];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Z")
    public static boolean field3050 = false;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field3052;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lmn;")
    public static class162 field3045;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static final void method1359(int arg0) {
        field3046++;
        if (class329.field5177 != null) {
            return;
        }
        class329.field5177 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
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
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var9 = var16;
                    var11 = var8;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
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
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class329.field5177[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILhw;)V")
    private final void method1360(int arg0, int arg1, class208 arg2) {
        if (arg0 != 100389672) {
            this.field3052 = 76;
        }
        if (arg1 == 1) {
            this.field3044 = arg2.method1455(-3387);
            this.field3051 = arg2.method1445(-123);
            this.field3052 = arg2.method1445(37);
        }
        field3049++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1361(byte arg0) {
        if (arg0 != -52) {
            field3045 = null;
        }
        if (class119.field1631 != null) {
            class119.field1631.method1781(50);
        }
        field3043++;
        if (class164.field2370 != null) {
            class164.field2370.method1781(50);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILhw;)V")
    public final void method1362(int arg0, class208 arg1) {
        if (arg0 < 11) {
            field3045 = null;
        }
        field3047++;
        while (true) {
            int var3 = arg1.method1445(-123);
            if (var3 == 0) {
                return;
            }
            this.method1360(100389672, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method1363(int arg0) {
        field3048 = null;
        field3045 = null;
        if (arg0 > -86) {
            field3048 = null;
        }
    }
}
