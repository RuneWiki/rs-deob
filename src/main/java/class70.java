import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class70 {

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lwa;")
    public static class75 field1198 = class66.method560("Hidden)2use", false);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lqj;")
    public static class238[] field1195;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V", line = 16)
    public static final void method589(byte arg0, int arg1) {
        if (arg0 <= 64) {
            method589((byte) -104, 30);
        }
        class67.field1168.method1199(arg1, 120);
        class14.field188.method1199(arg1, 119);
        field1199++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 37)
    public static final void method590(int arg0) {
        field1200++;
        if (class272.field4693 == -1 || class188.field3142 == -1) {
            return;
        }
        int var1 = ((class9.field119 - class253.field4257) * class28.field392 >> 16) + class253.field4257;
        class28.field392 += var1;
        if (class28.field392 < 65535) {
            class228.field3831 = false;
            class120.field2021 = false;
        } else {
            if (class228.field3831) {
                class120.field2021 = false;
            } else {
                class120.field2021 = true;
            }
            class228.field3831 = true;
            class28.field392 = 65535;
        }
        float[] var2 = new float[3];
        float var3 = (float) class28.field392 / 65535.0F;
        int var4 = class127.field2203 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class274.field4724[class272.field4693][var4 + 1][var5] * 3;
            int var7 = class274.field4724[class272.field4693][var4][var5] * 3;
            int var8 = (class274.field4724[class272.field4693][var4 + 2][var5] - (class274.field4724[class272.field4693][var4 + 3][var5] - class274.field4724[class272.field4693][var4 + 2][var5])) * 3;
            int var9 = class274.field4724[class272.field4693][var4][var5];
            int var10 = var8 + var7 - (var6 * 2);
            int var11 = class274.field4724[class272.field4693][var4 + 2][var5] - var9 - (-var6 - -var8);
            int var12 = var6 - var7;
            var2[var5] = (((float) var11 * var3 + (float) var10) * var3 + (float) var12) * var3 + (float) var9;
        }
        float[] var13 = new float[3];
        if (arg0 != 17020) {
            return;
        }
        if (class275.field4737 == 0 && class175.field2939 == 0) {
            class275.field4737 = ((int) var2[0] >> 10) * 8 - 48;
            class175.field2939 = (((int) var2[2] >> 10) - 6) * 8;
        }
        int var14 = class24.field307 * 2;
        class245.field4120 = (int) var2[0] - (class275.field4737 * 128);
        class228.field3825 = (int) var2[1] * -1;
        class9.field121 = (int) var2[2] - (class175.field2939 * 128);
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class274.field4724[class188.field3142][var14][var15] * 3;
            int var17 = class274.field4724[class188.field3142][var14 + 1][var15] * 3;
            int var18 = (class274.field4724[class188.field3142][var14 + 2][var15] + class274.field4724[class188.field3142][var14 - -2][var15] - class274.field4724[class188.field3142][var14 + 3][var15]) * 3;
            int var19 = class274.field4724[class188.field3142][var14][var15];
            int var20 = var17 - var16;
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class274.field4724[class188.field3142][var14 + 2][var15] + var17 - var18 - var19;
            var13[var15] = (((float) var22 * var3 + (float) var21) * var3 + (float) var20) * var3 + (float) var19;
        }
        float var23 = var13[0] - var2[0];
        float var24 = (var13[1] - var2[1]) * -1.0F;
        float var25 = var13[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class10.field127 = (float) Math.atan2((double) var24, var26);
        class127.field2210 = -((float) Math.atan2((double) var23, (double) var25));
        class232.field3931 = (int) ((double) class10.field127 * 325.949D) & 0x7FF;
        class87.field1433 = (int) ((double) class127.field2210 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 160)
    public static void method591(int arg0) {
        field1195 = null;
        if (arg0 == 21368) {
            field1198 = null;
        }
    }
}
