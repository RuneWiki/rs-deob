import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class305 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "[I")
    public static int[] field4391 = new int[6];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 4)
    public static void method1922(int arg0) {
        int var1 = 88 % ((arg0 - 20) / 45);
        field4391 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 17)
    public static final void method1923(byte arg0) {
        field4390++;
        if (class438.field6539 == -1 || class337.field4743 == -1) {
            return;
        }
        int var1 = class229.field3413 + ((class495.field7327 - class229.field3413) * class77.field1145 >> 16);
        class77.field1145 += var1;
        if (class77.field1145 >= 65535) {
            class77.field1145 = 65535;
            if (class284.field4091) {
                class329.field4686 = false;
            } else {
                class329.field4686 = true;
            }
            class284.field4091 = true;
        } else {
            class284.field4091 = false;
            class329.field4686 = false;
        }
        float var2 = (float) class77.field1145 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class4.field55 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class435.field6513[class438.field6539][var4][var5] * 3;
            int var23 = class435.field6513[class438.field6539][var4 + 1][var5] * 3;
            int var24 = (class435.field6513[class438.field6539][var4 + 2][var5] + class435.field6513[class438.field6539][var4 - -2][var5] - class435.field6513[class438.field6539][var4 + 3][var5]) * 3;
            int var25 = class435.field6513[class438.field6539][var4][var5];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - var23 * 2;
            int var28 = class435.field6513[class438.field6539][var4 + 2][var5] + var23 - (var24 + var25);
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class260.field3827 = (int) var3[2] - (class24.field259 * 128);
        int var6 = 64 / ((arg0 + 54) / 55);
        class291.field4175 = (int) var3[1] * -1;
        class24.field258 = (int) var3[0] - (class68.field1038 * 128);
        float[] var7 = new float[3];
        int var8 = class108.field1559 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class435.field6513[class337.field4743][var8][var9] * 3;
            int var16 = class435.field6513[class337.field4743][var8 + 1][var9] * 3;
            int var17 = (class435.field6513[class337.field4743][var8 + 2][var9] + class435.field6513[class337.field4743][var8 + 2][var9] - class435.field6513[class337.field4743][var8 + 3][var9]) * 3;
            int var18 = class435.field6513[class337.field4743][var8][var9];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - (var16 * 2);
            int var21 = class435.field6513[class337.field4743][var8 + 2][var9] + (var16 - var17) - var18;
            var7[var9] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var7[0] - var3[0];
        float var11 = (var7[1] - var3[1]) * -1.0F;
        float var12 = var7[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class18.field195 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class259.field3812 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class296.field4216 = class435.field6513[class438.field6539][var4][3] + ((class435.field6513[class438.field6539][var4 + 2][3] - class435.field6513[class438.field6539][var4][3]) * class77.field1145 >> 16);
    }
}
