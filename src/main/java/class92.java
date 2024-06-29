import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class92 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[S")
    public static short[] field1619 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[Lwf;")
    public static class1[] field1621 = new class1[50];

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Llb;")
    public static class130 field1625;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIZ)V")
    public static final void method631(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 >= class277.field4967 && arg2 <= class147.field2593) {
            int var5 = class141.method1027(class26.field342, arg0, !arg4, class271.field4820);
            int var6 = class141.method1027(class26.field342, arg3, false, class271.field4820);
            class216.method1519(arg2, var6, arg1, var5, true);
        }
        field1623++;
        if (!arg4) {
            field1626 = -49;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static final void method632(byte arg0) {
        field1624++;
        if (class267.field4759 == -1 || class97.field1737 == -1) {
            return;
        }
        int var1 = ((class151.field2650 - class251.field4520) * class267.field4760 >> 16) + class251.field4520;
        class267.field4760 += var1;
        float[] var2 = new float[3];
        int var3 = class186.field3434 * 2;
        if (class267.field4760 >= 65535) {
            if (class38.field582) {
                class38.field585 = false;
            } else {
                class38.field585 = true;
            }
            class267.field4760 = 65535;
            class38.field582 = true;
        } else {
            class38.field585 = false;
            class38.field582 = false;
        }
        float var4 = (float) class267.field4760 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class126.field2234[class267.field4759][var3][var5] * 3;
            int var22 = (class126.field2234[class267.field4759][var3 + 2][var5] + class126.field2234[class267.field4759][var3 + 2][var5] - class126.field2234[class267.field4759][var3 - -3][var5]) * 3;
            int var23 = class126.field2234[class267.field4759][var3][var5];
            int var24 = class126.field2234[class267.field4759][var3 + 1][var5] * 3;
            int var25 = var24 - var21;
            int var26 = var21 - (var24 * 2 - var22);
            int var27 = class126.field2234[class267.field4759][var3 + 2][var5] - var23 - (-var24 + var22);
            var2[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var23;
        }
        float[] var6 = new float[3];
        class165.field2919 = (int) var2[2] - (class4.field52 * 128);
        int var7 = class73.field1323 * 2;
        class166.field2925 = (int) var2[0] - (class229.field4111 * 128);
        class77.field1442 = (int) var2[1] * -1;
        if (arg0 >= -6) {
            return;
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class126.field2234[class97.field1737][var7][var8] * 3;
            int var15 = (class126.field2234[class97.field1737][var7 + 2][var8] - (class126.field2234[class97.field1737][var7 + 3][var8] - class126.field2234[class97.field1737][var7 + 2][var8])) * 3;
            int var16 = class126.field2234[class97.field1737][var7 + 1][var8] * 3;
            int var17 = var16 - var14;
            int var18 = var14 + var15 - (var16 * 2);
            int var19 = class126.field2234[class97.field1737][var7][var8];
            int var20 = var16 + class126.field2234[class97.field1737][var7 + 2][var8] - var15 - var19;
            var6[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var17) * var4 + (float) var19;
        }
        float var9 = var6[0] - var2[0];
        float var10 = var6[2] - var2[2];
        float var11 = (var6[1] - var2[1]) * -1.0F;
        double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
        class206.field3707 = (float) Math.atan2((double) var11, var12);
        class117.field2078 = -((float) Math.atan2((double) var9, (double) var10));
        class198.field3602 = (int) ((double) class206.field3707 * 325.949D) & 0x7FF;
        class233.field4155 = (int) ((double) class117.field2078 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        if (arg0 == 128) {
            field1621 = null;
            field1625 = null;
            field1619 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
    public static final void method634(int arg0, int arg1) {
        class66.field1213 = null;
        field1622++;
        class120.field2138 = 1;
        class72.field1298 = -1;
        class110.field1882 = -1;
        class41.field628 = arg1;
        class119.field2123 = false;
        if (arg0 < 0) {
            method633(-50);
        }
        class16.field227 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)Z")
    public static final boolean method635(byte arg0, int arg1) {
        field1620++;
        if (arg0 != 108) {
            field1626 = 3;
        }
        return arg1 >= 48 && arg1 <= 57;
    }
}
