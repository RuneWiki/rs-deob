import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class297 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1896(int arg0) {
        if (class405.field6149 == 1 || class405.field6149 == 3 || class499.field7355 != class405.field6149 && (class405.field6149 == 0 || class499.field7355 == 0)) {
            class515.field7566 = 0;
            class333.field5187 = 0;
            class406.field6158.method1745(arg0 - 22934);
        }
        field4383++;
        if (arg0 != 22826) {
            method1897(-116);
        }
        class499.field7355 = class405.field6149;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 29)
    public static final void method1897(int arg0) {
        field4382++;
        if (class256.field3535 == -1 || class538.field7892 == -1) {
            return;
        }
        int var1 = ((class264.field3701 - class509.field7481) * class421.field6413 >> 16) + class509.field7481;
        class421.field6413 += var1;
        if (class421.field6413 >= 65535) {
            class421.field6413 = 65535;
            if (class36.field527) {
                class385.field5849 = false;
            } else {
                class385.field5849 = true;
            }
            class36.field527 = true;
        } else {
            class385.field5849 = false;
            class36.field527 = false;
        }
        float var2 = (float) class421.field6413 / 65535.0F;
        if (arg0 >= -59) {
            method1897(-7);
        }
        float[] var3 = new float[3];
        int var4 = class127.field1725 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class200.field2687[class256.field3535][var4][var5] * 3;
            int var22 = class200.field2687[class256.field3535][var4 + 1][var5] * 3;
            int var23 = (class200.field2687[class256.field3535][var4 + 2][var5] + class200.field2687[class256.field3535][var4 + 2][var5] - class200.field2687[class256.field3535][var4 + 3][var5]) * 3;
            int var24 = class200.field2687[class256.field3535][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class200.field2687[class256.field3535][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class140.field1869 = (int) var3[2] - (class328.field5099 * 128);
        class26.field384 = (int) var3[1] * -1;
        class199.field2646 = (int) var3[0] - (class331.field5162 * 128);
        float[] var6 = new float[3];
        int var7 = class398.field6072 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class200.field2687[class538.field7892][var7][var8] * 3;
            int var15 = class200.field2687[class538.field7892][var7 + 1][var8] * 3;
            int var16 = (class200.field2687[class538.field7892][var7 + 2][var8] + class200.field2687[class538.field7892][var7 + 2][var8] - class200.field2687[class538.field7892][var7 + 3][var8]) * 3;
            int var17 = class200.field2687[class538.field7892][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = var15 + class200.field2687[class538.field7892][var7 + 2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class296.field4378 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class49.field702 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class334.field5197 = ((class200.field2687[class256.field3535][var4 + 2][3] - class200.field2687[class256.field3535][var4][3]) * class421.field6413 >> 16) + class200.field2687[class256.field3535][var4][3];
    }
}
