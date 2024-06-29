import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class668 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lo;")
    public static class208 field9362 = new class208(9, 0, 4, 1);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field9363;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 6)
    public static void method3815(int arg0) {
        if (arg0 != -11236) {
            method3817(113);
        }
        field9362 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()V", line = 24)
    public static final void method3816() {
        for (int var0 = 0; var0 < class586.field8275; var0++) {
            class253 var1 = class313.field4484[var0];
            class783.method4304(var1, true);
            class313.field4484[var0] = null;
        }
        class586.field8275 = 0;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 37)
    public static final void method3817(int arg0) {
        field9363++;
        if (class377.field5409 == -1 || class70.field769 == -1) {
            return;
        }
        int var1 = ((class439.field6072 - class773.field10653) * class553.field7663 >> 16) + class773.field10653;
        class553.field7663 += var1;
        if (class553.field7663 >= 65535) {
            class553.field7663 = 65535;
            if (class652.field9108) {
                class477.field6613 = false;
            } else {
                class477.field6613 = true;
            }
            class652.field9108 = true;
        } else {
            class477.field6613 = false;
            class652.field9108 = false;
        }
        float var2 = (float) class553.field7663 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class501.field6857 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class706.field9816[class377.field5409][var4][var5] * 3;
            int var22 = class706.field9816[class377.field5409][var4 + 1][var5] * 3;
            int var23 = (class706.field9816[class377.field5409][var4 + 2][var5] + class706.field9816[class377.field5409][var4 + 2][var5] - class706.field9816[class377.field5409][var4 + 3][var5]) * 3;
            int var24 = class706.field9816[class377.field5409][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class706.field9816[class377.field5409][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class479.field6645 = (int) var3[1] * -1;
        class412.field5779 = (int) var3[2] - (class236.field3535 * 512);
        class497.field6818 = (int) var3[0] - (class444.field6151 * 512);
        float[] var6 = new float[3];
        int var7 = class310.field4469 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class706.field9816[class70.field769][var7][var8] * 3;
            int var15 = class706.field9816[class70.field769][var7 + 1][var8] * 3;
            int var16 = (class706.field9816[class70.field769][var7 + 2][var8] - (class706.field9816[class70.field769][var7 + 3][var8] - class706.field9816[class70.field769][var7 + 2][var8])) * 3;
            int var17 = class706.field9816[class70.field769][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class706.field9816[class70.field769][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0 >= -14) {
            return;
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class472.field6537 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class326.field4589 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class480.field6657 = ((class706.field9816[class377.field5409][var4 + 2][3] - class706.field9816[class377.field5409][var4][3]) * class553.field7663 >> 16) + class706.field9816[class377.field5409][var4][3];
    }
}
