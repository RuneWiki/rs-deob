import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class397 {

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lmw;")
    public static class517 field5691 = new class517(46, 3);

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Lqw;")
    public static class84 field5692 = new class84();

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method2425(boolean arg0) {
        field5690++;
        if (class577.field7864 == -1 || class550.field7591 == -1) {
            return;
        }
        int var1 = ((class729.field9892 - class70.field958) * class6.field47 >> 16) + class70.field958;
        class6.field47 += var1;
        if (class6.field47 < 65535) {
            class303.field4256 = false;
            class655.field8845 = false;
        } else {
            class6.field47 = 65535;
            if (class655.field8845) {
                class303.field4256 = false;
            } else {
                class303.field4256 = true;
            }
            class655.field8845 = true;
        }
        float var2 = (float) class6.field47 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class482.field6757 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class263.field3880[class577.field7864][var4][var5] * 3;
            int var22 = class263.field3880[class577.field7864][var4 + 1][var5] * 3;
            int var23 = (class263.field3880[class577.field7864][var4 + 2][var5] + class263.field3880[class577.field7864][var4 + 2][var5] - class263.field3880[class577.field7864][var4 + 3][var5]) * 3;
            int var24 = class263.field3880[class577.field7864][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class263.field3880[class577.field7864][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        if (arg0) {
            field5691 = null;
        }
        class269.field3926 = (int) var3[1] * -1;
        class435.field6273 = (int) var3[0] - (class120.field1625 * 512);
        class223.field2892 = (int) var3[2] - class259.field3849 * 512;
        float[] var6 = new float[3];
        int var7 = class5.field36 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class263.field3880[class550.field7591][var7][var8] * 3;
            int var15 = class263.field3880[class550.field7591][var7 + 1][var8] * 3;
            int var16 = (class263.field3880[class550.field7591][var7 + 2][var8] + class263.field3880[class550.field7591][var7 + 2][var8] - class263.field3880[class550.field7591][var7 + 3][var8]) * 3;
            int var17 = class263.field3880[class550.field7591][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class263.field3880[class550.field7591][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class74.field1000 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class41.field442 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class476.field6693 = ((class263.field3880[class577.field7864][var4 + 2][3] - class263.field3880[class577.field7864][var4][3]) * class6.field47 >> 16) + class263.field3880[class577.field7864][var4][3];
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V", line = 113)
    public static void method2426(byte arg0) {
        field5691 = null;
        if (arg0 > -81) {
            field5691 = null;
        }
        field5692 = null;
    }
}
