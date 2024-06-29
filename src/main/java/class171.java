import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class171 {

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "[I")
    public static int[] field2252 = new int[50];

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "[[Z")
    public static boolean[][] field2255 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "F")
    public static float field2253;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)I", line = 3)
    public static final int method1054(int arg0, int arg1, int arg2) {
        field2250++;
        int var3 = class45.method330(false, arg2 - 1, arg0 - 1) + class45.method330(false, arg1 + arg2, arg0 + 1) + class45.method330(false, arg2 - -1, arg0 + -1) + class45.method330(false, arg2 + 1, arg0 - -1);
        int var4 = class45.method330(false, arg2, arg0 - 1) + class45.method330(false, arg2, arg0 + 1) + class45.method330(false, arg2 - 1, arg0) + class45.method330(false, arg2 + 1, arg0);
        int var5 = class45.method330(false, arg2, arg0);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 19)
    public static final void method1055(byte arg0) {
        field2257++;
        if (class104.field1402 == -1 || class125.field1667 == -1) {
            return;
        }
        int var1 = ((class40.field637 - class337.field4973) * class143.field1875 >> 16) + class337.field4973;
        class143.field1875 += var1;
        if (class143.field1875 < 65535) {
            class28.field495 = false;
            class190.field2651 = false;
        } else {
            if (class190.field2651) {
                class28.field495 = false;
            } else {
                class28.field495 = true;
            }
            class143.field1875 = 65535;
            class190.field2651 = true;
        }
        if (arg0 <= 93) {
            return;
        }
        float var2 = (float) class143.field1875 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class436.field6405 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class179.field2351[class104.field1402][var4][var5] * 3;
            int var22 = class179.field2351[class104.field1402][var4 + 1][var5] * 3;
            int var23 = (class179.field2351[class104.field1402][var4 + 2][var5] + class179.field2351[class104.field1402][var4 + 2][var5] - class179.field2351[class104.field1402][var4 + 3][var5]) * 3;
            int var24 = class179.field2351[class104.field1402][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = var22 + class179.field2351[class104.field1402][var4 + 2][var5] - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class7.field71 = (int) var3[2] - (class38.field620 * 128);
        class130.field1745 = (int) var3[1] * -1;
        class237.field3326 = (int) var3[0] - (class184.field2482 * 128);
        float[] var6 = new float[3];
        int var7 = class155.field2032 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class179.field2351[class125.field1667][var7][var8] * 3;
            int var15 = class179.field2351[class125.field1667][var7 + 1][var8] * 3;
            int var16 = (class179.field2351[class125.field1667][var7 + 2][var8] + class179.field2351[class125.field1667][var7 + 2][var8] - class179.field2351[class125.field1667][var7 + 3][var8]) * 3;
            int var17 = class179.field2351[class125.field1667][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class179.field2351[class125.field1667][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class265.field3878 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class179.field2364 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class277.field4070 = ((class179.field2351[class104.field1402][var4 + 2][3] - class179.field2351[class104.field1402][var4][3]) * class143.field1875 >> 16) + class179.field2351[class104.field1402][var4][3];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 129)
    public static void method1056(int arg0) {
        field2252 = null;
        field2255 = null;
        if (arg0 <= 71) {
            method1055((byte) 34);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 142)
    public static final void method1057(int arg0) {
        field2258++;
        class24 var1 = class70.field966;
        synchronized (class70.field966) {
            class70.field966.method204((byte) 56);
            if (arg0 != 3) {
                method1056(8);
            }
        }
        class24 var2 = class132.field1770;
        synchronized (class132.field1770) {
            class132.field1770.method204((byte) 56);
        }
        class261 var3 = class114.field1551;
        synchronized (class114.field1551) {
            class114.field1551.method1632((byte) 52);
        }
    }
}
