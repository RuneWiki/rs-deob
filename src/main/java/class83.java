import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class83 {

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "Lrn;")
    public static class633 field1189 = new class633(8, 3);

    @OriginalMember(owner = "client!cja", name = "e", descriptor = "Ltq;")
    public static class536 field1191 = new class536(4);

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Liea;I)I")
    public static final int method526(class12 arg0, int arg1) {
        field1187++;
        if (class579.field7334 == arg0) {
            return 9216;
        } else if (class469.field6108 == arg0) {
            return 34065;
        } else if (class438.field5747 == arg0) {
            return 34066;
        } else if (arg1 == 20163) {
            throw new IllegalArgumentException();
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V")
    public static final void method527(int arg0) {
        field1190++;
        if (class209.field2883 == -1 || class721.field9472 == -1) {
            return;
        }
        int var1 = class404.field5370 + ((class301.field3801 - class404.field5370) * class404.field5372 >> 16);
        class404.field5372 += var1;
        if (class404.field5372 >= 65535) {
            class404.field5372 = 65535;
            if (class379.field4638) {
                class399.field5277 = false;
            } else {
                class399.field5277 = true;
            }
            class379.field4638 = true;
        } else {
            class399.field5277 = false;
            class379.field4638 = false;
        }
        float var2 = (float) class404.field5372 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class287.field3674 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class790.field10811[class209.field2883][var4][var5] * 3;
            int var22 = class790.field10811[class209.field2883][var4 + 1][var5] * 3;
            int var23 = (class790.field10811[class209.field2883][var4 + 2][var5] + class790.field10811[class209.field2883][var4 - -2][var5] - class790.field10811[class209.field2883][var4 + 3][var5]) * 3;
            int var24 = class790.field10811[class209.field2883][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class790.field10811[class209.field2883][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class148.field1890 = (int) var3[2] - (class240.field3293 * 512);
        class439.field5770 = (int) var3[1] * -1;
        class97.field1309 = (int) var3[0] - (class714.field9407 * 512);
        float[] var6 = new float[3];
        int var7 = class786.field10777 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class790.field10811[class721.field9472][var7][var8] * 3;
            int var15 = class790.field10811[class721.field9472][var7 + 1][var8] * 3;
            int var16 = (class790.field10811[class721.field9472][var7 + 2][var8] + class790.field10811[class721.field9472][var7 - -2][var8] - class790.field10811[class721.field9472][var7 + 3][var8]) * 3;
            int var17 = class790.field10811[class721.field9472][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class790.field10811[class721.field9472][var7 + 2][var8] - var17 - (-var15 - -var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class463.field6022 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class232.field3122 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class511.field6521 = ((class790.field10811[class209.field2883][var4 + 2][3] - class790.field10811[class209.field2883][var4][arg0]) * class404.field5372 >> 16) + class790.field10811[class209.field2883][var4][3];
    }

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1189 = null;
        field1191 = null;
        if (arg0 != 3) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!cja", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1188++;
        throw new IllegalStateException();
    }
}
