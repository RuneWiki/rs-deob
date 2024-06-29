import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class352 implements class359 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field4975;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lda;")
    public static class59 field4974;

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4973++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static final void method2270(byte arg0) {
        field4976++;
        if (class44.field532 == -1 || class150.field2124 == -1) {
            return;
        }
        int var1 = class245.field3272 + ((class608.field8560 - class245.field3272) * class101.field1203 >> 16);
        class101.field1203 += var1;
        if (class101.field1203 < 65535) {
            class589.field8305 = false;
            class549.field7662 = false;
        } else {
            class101.field1203 = 65535;
            if (class549.field7662) {
                class589.field8305 = false;
            } else {
                class589.field8305 = true;
            }
            class549.field7662 = true;
        }
        float var2 = (float) class101.field1203 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class555.field7791 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class414.field5833[class44.field532][var4][var5] * 3;
            int var22 = class414.field5833[class44.field532][var4 + 1][var5] * 3;
            int var23 = (-class414.field5833[class44.field532][var4 + 3][var5] - (-class414.field5833[class44.field532][var4 + 2][var5] - class414.field5833[class44.field532][var4 + 2][var5])) * 3;
            int var24 = class414.field5833[class44.field532][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class414.field5833[class44.field532][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class511.field7303 = (int) var3[0] - (class228.field3063 * 512);
        class32.field426 = (int) var3[2] - (class3.field30 * 512);
        if (arg0 <= 108) {
            field4974 = null;
        }
        class155.field2169 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class213.field2812 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class414.field5833[class150.field2124][var7][var8] * 3;
            int var15 = class414.field5833[class150.field2124][var7 + 1][var8] * 3;
            int var16 = (class414.field5833[class150.field2124][var7 + 2][var8] + class414.field5833[class150.field2124][var7 + 2][var8] - class414.field5833[class150.field2124][var7 - -3][var8]) * 3;
            int var17 = class414.field5833[class150.field2124][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = var15 + class414.field5833[class150.field2124][var7 + 2][var8] - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class187.field2514 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class720.field9994 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class707.field9813 = ((class414.field5833[class44.field532][var4 + 2][3] - class414.field5833[class44.field532][var4][3]) * class101.field1203 >> 16) + class414.field5833[class44.field532][var4][3];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method2271(int arg0) {
        if (arg0 == -1) {
            field4974 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class352(String arg0, int arg1) {
        this.field4975 = arg1;
    }
}
