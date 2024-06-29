import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class65 {

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "Lvt;")
    public static class344 field871 = new class344("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static void method371(byte arg0) {
        if (arg0 > -27) {
            field871 = null;
        }
        field871 = null;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
    public static final void method372(byte arg0) {
        field870++;
        if (class30.field482 == -1 || class427.field5826 == -1) {
            return;
        }
        int var1 = ((class569.field7954 - class71.field942) * class495.field6907 >> 16) + class71.field942;
        class495.field6907 += var1;
        if (class495.field6907 >= 65535) {
            class495.field6907 = 65535;
            if (class255.field3172) {
                class510.field7116 = false;
            } else {
                class510.field7116 = true;
            }
            class255.field3172 = true;
        } else {
            class255.field3172 = false;
            class510.field7116 = false;
        }
        float var2 = (float) class495.field6907 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class551.field7715 * 2;
        int var5 = -18 % ((-arg0 - 6) / 60);
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class254.field3155[class30.field482][var4][var6] * 3;
            int var23 = class254.field3155[class30.field482][var4 + 1][var6] * 3;
            int var24 = (class254.field3155[class30.field482][var4 + 2][var6] + class254.field3155[class30.field482][var4 + 2][var6] - class254.field3155[class30.field482][var4 + 3][var6]) * 3;
            int var25 = class254.field3155[class30.field482][var4][var6];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - (var23 * 2);
            int var28 = class254.field3155[class30.field482][var4 + 2][var6] - (var25 - var23) - var24;
            var3[var6] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class186.field2364 = (int) var3[1] * -1;
        class434.field5901 = (int) var3[2] - (class58.field786 * 512);
        class196.field2555 = (int) var3[0] - (class525.field7310 * 512);
        float[] var7 = new float[3];
        int var8 = class198.field2595 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class254.field3155[class427.field5826][var8][var9] * 3;
            int var16 = class254.field3155[class427.field5826][var8 + 1][var9] * 3;
            int var17 = (class254.field3155[class427.field5826][var8 + 2][var9] + class254.field3155[class427.field5826][var8 + 2][var9] - class254.field3155[class427.field5826][var8 + 3][var9]) * 3;
            int var18 = class254.field3155[class427.field5826][var8][var9];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - var16 * 2;
            int var21 = class254.field3155[class427.field5826][var8 + 2][var9] - (var18 + var17 - var16);
            var7[var9] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var7[0] - var3[0];
        float var11 = (var7[1] - var3[1]) * -1.0F;
        float var12 = var7[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class627.field9131 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class60.field838 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class392.field5439 = ((class254.field3155[class30.field482][var4 + 2][3] - class254.field3155[class30.field482][var4][3]) * class495.field6907 >> 16) + class254.field3155[class30.field482][var4][3];
    }
}
