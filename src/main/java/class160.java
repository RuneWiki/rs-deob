import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class160 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field2536 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field2533 = 0;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
    public boolean field2545 = false;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2538 = "Ok";

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lll;")
    public static class159 field2543;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lug;")
    public static class253 field2542;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lpf;")
    public class264 field2544;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2541;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1187(int arg0, int arg1) {
        class34 var2 = class91.method656(arg1, -2, arg0);
        var2.method306(13);
        field2534++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 37)
    public static void method1188(int arg0) {
        field2538 = null;
        if (arg0 != 965450533) {
            field2543 = (class159) null;
        }
        field2542 = null;
        field2543 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)V", line = 54)
    public static final void method1189(int arg0, String arg1) {
        field2535++;
        int var2 = class126.method914(arg1, arg0 ^ arg0);
        if (var2 != -1) {
            int[] var3 = class136.field2174.method2049(class278.field4290.field4249[var2] & 0x3FFF, (class278.field4290.field4249[var2] & 0x398B9B25) >> 28, (class278.field4290.field4249[var2] & 0xFFFFC44) >> 14, 24540);
            class25.method242(var3[2], true, var3[1]);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 70)
    public static final void method1190(int arg0) {
        field2539++;
        if (class185.field3006 == -1 || class255.field4035 == -1) {
            return;
        }
        int var1 = ((class265.field4144 - class283.field4389) * class229.field3587 >> 16) + class283.field4389;
        class229.field3587 += var1;
        if (class229.field3587 >= 65535) {
            class229.field3587 = 65535;
            if (class97.field1274) {
                class69.field965 = false;
            } else {
                class69.field965 = true;
            }
            class97.field1274 = true;
        } else {
            class69.field965 = false;
            class97.field1274 = false;
        }
        float var2 = (float) class229.field3587 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class265.field4148 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class83.field1131[class185.field3006][var4][var5] * 3;
            int var7 = class83.field1131[class185.field3006][var4 + 1][var5] * 3;
            int var8 = class83.field1131[class185.field3006][var4][var5];
            int var9 = (class83.field1131[class185.field3006][var4 + 2][var5] - (class83.field1131[class185.field3006][var4 + 3][var5] - class83.field1131[class185.field3006][var4 + 2][var5])) * 3;
            int var10 = var6 + var9 - (var7 * 2);
            int var11 = class83.field1131[class185.field3006][var4 + 2][var5] + var7 - var9 - var8;
            int var12 = var7 - var6;
            var3[var5] = (((float) var11 * var2 + (float) var10) * var2 + (float) var12) * var2 + (float) var8;
        }
        class295.field4572 = (int) var3[0] - (class326.field5108 * 128);
        class317.field5018 = (int) var3[2] - class198.field3168 * 128;
        class43.field588 = (int) var3[1] * -1;
        int var13 = class153.field2360 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class83.field1131[class255.field4035][var13][var15] * 3;
            int var17 = class83.field1131[class255.field4035][var13 + 1][var15] * 3;
            int var18 = class83.field1131[class255.field4035][var13][var15];
            int var19 = var17 - var16;
            int var20 = (class83.field1131[class255.field4035][var13 + 2][var15] + class83.field1131[class255.field4035][var13 + 2][var15] - class83.field1131[class255.field4035][var13 + 3][var15]) * 3;
            int var21 = var16 - (var17 * 2 - var20);
            int var22 = class83.field1131[class255.field4035][var13 + 2][var15] + var17 - var18 - var20;
            var14[var15] = (((float) var22 * var2 + (float) var21) * var2 + (float) var19) * var2 + (float) var18;
        }
        if (arg0 < 33) {
            field2538 = (String) null;
        }
        float var23 = var14[0] - var3[0];
        float var24 = (var14[1] - var3[1]) * -1.0F;
        float var25 = var14[2] - var3[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class204.field3239 = (float) Math.atan2((double) var24, var26);
        class294.field4562 = -((float) Math.atan2((double) var23, (double) var25));
        class185.field2999 = (int) ((double) class294.field4562 * 325.949D) & 0x7FF;
        class293.field4536 = (int) ((double) class204.field3239 * 325.949D) & 0x7FF;
    }
}
