import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class209 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
    public static boolean field3190 = false;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3193 = "M";

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Z")
    public static boolean field3202 = false;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ltd;")
    public static class204 field3195 = new class204();

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3203 = 0;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "B")
    public static byte field3198;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field3191;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[[[B")
    public static byte[][][] field3194;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILwm;II)V", line = 4)
    private final void method1496(int arg0, class254 arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field3201 = arg1.method1755(false);
        } else if (arg2 == 2) {
            this.field3196 = arg1.method1774((byte) 78);
            this.field3200 = arg1.method1774((byte) -126);
        }
        field3197++;
        int var5 = -30 / ((-arg3) / 62);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Laf;", line = 28)
    public final class195 method1497(boolean arg0) {
        field3192++;
        class195 var2 = (class195) class71.field1018.method747((long) this.field3201, (byte) 95);
        if (var2 != null) {
            return var2;
        }
        class195 var3 = class204.method1474((byte) -9, this.field3201, 0, class304.field4665);
        if (var3 != null) {
            class71.field1018.method744(var3, -15692, (long) this.field3201);
        }
        return arg0 ? (class195) null : var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 54)
    public static void method1498(int arg0) {
        field3191 = null;
        field3195 = null;
        if (arg0 == 29233) {
            field3194 = (byte[][][]) null;
            field3193 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLwm;)V", line = 67)
    public final void method1499(int arg0, byte arg1, class254 arg2) {
        if (arg1 != 24) {
            field3202 = false;
        }
        while (true) {
            int var4 = arg2.method1774((byte) 43);
            if (var4 == 0) {
                field3189++;
                return;
            }
            this.method1496(arg0, arg2, var4, 115);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 92)
    public static final void method1500(int arg0) {
        field3199++;
        if (class98.field1418 == -1 || class267.field4150 == -1) {
            return;
        }
        int var1 = ((class153.field2320 - class34.field497) * class319.field4931 >> 16) + class34.field497;
        float[] var2 = new float[3];
        int var3 = class131.field2008 * 2;
        class319.field4931 += var1;
        if (class319.field4931 < 65535) {
            class314.field4873 = false;
            class109.field1646 = false;
        } else {
            if (class314.field4873) {
                class109.field1646 = false;
            } else {
                class109.field1646 = true;
            }
            class319.field4931 = 65535;
            class314.field4873 = true;
        }
        float var4 = (float) class319.field4931 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class81.field1195[class98.field1418][var3 + 1][var5] * 3;
            int var7 = class81.field1195[class98.field1418][var3][var5] * 3;
            int var8 = class81.field1195[class98.field1418][var3][var5];
            int var9 = (class81.field1195[class98.field1418][var3 + 2][var5] - (class81.field1195[class98.field1418][var3 + 3][var5] - class81.field1195[class98.field1418][var3 + 2][var5])) * 3;
            int var10 = var6 - var7;
            int var11 = var9 + var7 - (var6 * 2);
            int var12 = class81.field1195[class98.field1418][var3 + 2][var5] - var8 - (var9 - var6);
            var2[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var10) * var4 + (float) var8;
        }
        class7.field111 = (int) var2[1] * -1;
        class190.field2976 = (int) var2[0] - (class327.field5054 * 128);
        float[] var13 = new float[3];
        class197.field3028 = (int) var2[2] - (class293.field4522 * 128);
        int var14 = class183.field2896 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class81.field1195[class267.field4150][var14 + 1][var15] * 3;
            int var17 = class81.field1195[class267.field4150][var14][var15] * 3;
            int var18 = var16 - var17;
            int var19 = (class81.field1195[class267.field4150][var14 + 2][var15] + class81.field1195[class267.field4150][var14 - -2][var15] - class81.field1195[class267.field4150][var14 + 3][var15]) * 3;
            int var20 = var17 + var19 - var16 * 2;
            int var21 = class81.field1195[class267.field4150][var14][var15];
            int var22 = class81.field1195[class267.field4150][var14 + 2][var15] + var16 - var19 - var21;
            var13[var15] = (((float) var22 * var4 + (float) var20) * var4 + (float) var18) * var4 + (float) var21;
        }
        float var23 = var13[0] - var2[0];
        float var24 = (var13[1] - var2[1]) * -1.0F;
        float var25 = var13[arg0] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class283.field4422 = (float) Math.atan2((double) var24, var26);
        class37.field536 = -((float) Math.atan2((double) var23, (double) var25));
        class200.field3047 = (int) ((double) class37.field536 * 325.949D) & 0x7FF;
        class193.field3015 = (int) ((double) class283.field4422 * 325.949D) & 0x7FF;
    }
}
