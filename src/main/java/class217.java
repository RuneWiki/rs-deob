import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class217 extends class171 {

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "S")
    public static short field3278 = 256;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field3275 = 0;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "Lai;")
    public static class88 field3280;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method1408(boolean arg0) {
        field3280 = null;
        if (!arg0) {
            field3280 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        field3276++;
        if (class143.field1986 == -1 || class153.field2122 == -1) {
            return;
        }
        int var1 = ((class27.field347 - class278.field4305) * class110.field1527 >> 16) + class278.field4305;
        class110.field1527 += var1;
        if (class110.field1527 >= 65535) {
            if (class285.field4470) {
                class295.field4646 = false;
            } else {
                class295.field4646 = true;
            }
            class285.field4470 = true;
            class110.field1527 = 65535;
        } else {
            class295.field4646 = false;
            class285.field4470 = false;
        }
        float var2 = (float) class110.field1527 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class74.field1033 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class5.field42[class143.field1986][var4][var5] * 3;
            int var22 = class5.field42[class143.field1986][var4 + 1][var5] * 3;
            int var23 = var22 - var21;
            int var24 = class5.field42[class143.field1986][var4][var5];
            int var25 = (-class5.field42[class143.field1986][var4 + 3][var5] - (-class5.field42[class143.field1986][var4 + 2][var5] - class5.field42[class143.field1986][var4 + 2][var5])) * 3;
            int var26 = class5.field42[class143.field1986][var4 + 2][var5] + var22 - var24 - var25;
            int var27 = var21 + var25 - (var22 * 2);
            var3[var5] = (((float) var26 * var2 + (float) var27) * var2 + (float) var23) * var2 + (float) var24;
        }
        class246.field3773 = (int) var3[1] * -1;
        class89.field1252 = (int) var3[2] - (class216.field3255 * 128);
        class41.field618 = (int) var3[0] - (class37.field565 * 128);
        float[] var6 = new float[3];
        int var7 = class255.field3908 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class5.field42[class153.field2122][var7 + 1][var8] * 3;
            int var15 = class5.field42[class153.field2122][var7][var8] * 3;
            int var16 = class5.field42[class153.field2122][var7][var8];
            int var17 = var14 - var15;
            int var18 = (class5.field42[class153.field2122][var7 + 2][var8] + class5.field42[class153.field2122][var7 + 2][var8] - class5.field42[class153.field2122][var7 + 3][var8]) * 3;
            int var19 = var15 + var18 - (var14 * 2);
            int var20 = class5.field42[class153.field2122][var7 + 2][var8] + var14 - var16 - var18;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var17) * var2 + (float) var16;
        }
        float var9 = (var6[1] - var3[1]) * -1.0F;
        if (arg0 != -31671) {
            return;
        }
        float var10 = var6[0] - var3[0];
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class143.field1979 = (float) Math.atan2((double) var9, var12);
        class10.field104 = -((float) Math.atan2((double) var10, (double) var11));
        class275.field4265 = (int) ((double) class143.field1979 * 325.949D) & 0x7FF;
        class239.field3645 = (int) ((double) class10.field104 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)I")
    public static final int method1410(byte arg0) {
        field3269++;
        if (arg0 != -119) {
            method1408(false);
        }
        return class160.field2244.method538(0);
    }
}
