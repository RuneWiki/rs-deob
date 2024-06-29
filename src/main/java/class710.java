import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class710 extends class362 {

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "Z")
    public boolean field9630 = false;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public int field9629 = -1;

    @OriginalMember(owner = "client!lga", name = "v", descriptor = "Ljava/lang/String;")
    public static String field9636 = null;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
    public int field9632;

    @OriginalMember(owner = "client!lga", name = "s", descriptor = "I")
    public int field9633;

    @OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
    public int field9634;

    @OriginalMember(owner = "client!lga", name = "u", descriptor = "I")
    public int field9635;

    @OriginalMember(owner = "client!lga", name = "w", descriptor = "I")
    public int field9637;

    @OriginalMember(owner = "client!lga", name = "x", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
    public static final void method3947(byte arg0) {
        field9638++;
        if (class599.field8218 == -1 || class302.field4210 == -1) {
            return;
        }
        int var1 = ((class234.field3396 - class637.field8760) * class544.field7510 >> 16) + class637.field8760;
        class544.field7510 += var1;
        if (class544.field7510 < 65535) {
            class109.field1903 = false;
            class160.field2569 = false;
        } else {
            if (class160.field2569) {
                class109.field1903 = false;
            } else {
                class109.field1903 = true;
            }
            class544.field7510 = 65535;
            class160.field2569 = true;
        }
        float var2 = (float) class544.field7510 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class352.field4941 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var22 = class326.field4524[class599.field8218][var4][var5] * 3;
            int var23 = class326.field4524[class599.field8218][var4 + 1][var5] * 3;
            int var24 = (class326.field4524[class599.field8218][var4 + 2][var5] + class326.field4524[class599.field8218][var4 + 2][var5] - class326.field4524[class599.field8218][var4 + 3][var5]) * 3;
            int var25 = class326.field4524[class599.field8218][var4][var5];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - (var23 * 2);
            int var28 = class326.field4524[class599.field8218][var4 + 2][var5] + var23 - var25 - var24;
            var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class108.field1896 = (int) var3[0] - class221.field3177 * 512;
        class458.field6444 = (int) var3[1] * -1;
        class275.field3870 = (int) var3[2] - (class367.field5236 * 512);
        float[] var6 = new float[3];
        int var7 = class231.field3341 * 2;
        int var8 = -88 % ((-arg0 - 64) / 57);
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class326.field4524[class302.field4210][var7][var9] * 3;
            int var16 = class326.field4524[class302.field4210][var7 + 1][var9] * 3;
            int var17 = (class326.field4524[class302.field4210][var7 + 2][var9] + class326.field4524[class302.field4210][var7 + 2][var9] - class326.field4524[class302.field4210][var7 + 3][var9]) * 3;
            int var18 = class326.field4524[class302.field4210][var7][var9];
            int var19 = var16 - var15;
            int var20 = var15 + var17 - (var16 * 2);
            int var21 = class326.field4524[class302.field4210][var7 + 2][var9] + var16 - var18 - var17;
            var6[var9] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var6[0] - var3[0];
        float var11 = (var6[1] - var3[1]) * -1.0F;
        float var12 = var6[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class634.field8721 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class600.field8231 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class546.field7523 = ((class326.field4524[class599.field8218][var4 + 2][3] - class326.field4524[class599.field8218][var4][3]) * class544.field7510 >> 16) + class326.field4524[class599.field8218][var4][3];
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(II)I")
    public static int method3948(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V")
    public static void method3949(byte arg0) {
        field9636 = null;
        if (arg0 != 53) {
            method3947((byte) -100);
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(I)V")
    public class710(int arg0) {
        this.field9629 = arg0;
    }
}
