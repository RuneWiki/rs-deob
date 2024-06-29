import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class519 {

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field7277 = -1;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Lnw;")
    public static class619 field7276 = new class619();

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Liba;")
    public static class211 field7279 = new class211(40, -1);

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "[Lf;")
    public static class256[] field7280;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2932(int arg0) {
        field7275++;
        if (class408.field6089) {
            return;
        }
        class408.field6089 = true;
        class567.field8268 = true;
        if (arg0 != -23775) {
            return;
        }
        if (class335.field4872.field9499) {
            class528.field7602 = ((int) class528.field7602 - 17 & 0xFFFFFFF0);
        } else {
            class457.field6595 += (-class457.field6595 - 12.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2933(byte arg0) {
        field7278++;
        if (class74.field1160 == -1 || class426.field6233 == -1) {
            return;
        }
        int var1 = ((class343.field5079 - class183.field2516) * class45.field679 >> 16) + class183.field2516;
        class45.field679 += var1;
        if (class45.field679 < 65535) {
            class9.field263 = false;
            class408.field6088 = false;
        } else {
            class45.field679 = 65535;
            if (class9.field263) {
                class408.field6088 = false;
            } else {
                class408.field6088 = true;
            }
            class9.field263 = true;
        }
        float var2 = (float) class45.field679 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class27.field483 * 2;
        if (arg0 < 33) {
            method2934(102);
        }
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class705.field9985[class74.field1160][var4][var5] * 3;
            int var22 = class705.field9985[class74.field1160][var4 + 1][var5] * 3;
            int var23 = (class705.field9985[class74.field1160][var4 + 2][var5] + class705.field9985[class74.field1160][var4 + 2][var5] - class705.field9985[class74.field1160][var4 + 3][var5]) * 3;
            int var24 = class705.field9985[class74.field1160][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = var22 + class705.field9985[class74.field1160][var4 + 2][var5] - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class533.field7839 = (int) var3[1] * -1;
        class603.field8702 = (int) var3[2] - class403.field6049 * 512;
        class306.field4529 = (int) var3[0] - (class397.field6005 * 512);
        float[] var6 = new float[3];
        int var7 = class503.field7111 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class705.field9985[class426.field6233][var7][var8] * 3;
            int var15 = class705.field9985[class426.field6233][var7 + 1][var8] * 3;
            int var16 = (class705.field9985[class426.field6233][var7 + 2][var8] + class705.field9985[class426.field6233][var7 + 2][var8] - class705.field9985[class426.field6233][var7 + 3][var8]) * 3;
            int var17 = class705.field9985[class426.field6233][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class705.field9985[class426.field6233][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class246.field3255 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class481.field6886 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class276.field3597 = class705.field9985[class74.field1160][var4][3] + ((class705.field9985[class74.field1160][var4 + 2][3] - class705.field9985[class74.field1160][var4][3]) * class45.field679 >> 16);
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V", line = 130)
    public static void method2934(int arg0) {
        if (arg0 > 75) {
            field7280 = null;
            field7279 = null;
            field7276 = null;
        }
    }
}
