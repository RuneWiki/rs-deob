import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class143 extends class190 {

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "Lqe;")
    public static class168 field2509 = class66.method448("<col=80ff00>", 11);

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Lqe;")
    public static class168 field2514 = class66.method448("<col=ffffff>", 19);

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field2522 = -1;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "[I")
    public static int[] field2515 = new int[128];

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "[I")
    public int[] field2508;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "[I")
    public int[] field2518;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "[I")
    public int[] field2519;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "[Leg;")
    public class5[] field2507;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "[Leg;")
    public class5[] field2523;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "[[[B")
    public byte[][][] field2512;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static final void method975(int arg0) {
        field2516++;
        if (class168.field2879 == -1 || class62.field856 == -1) {
            return;
        }
        int var1 = ((class162.field2776 - class154.field2682) * class151.field2630 >> 16) + class154.field2682;
        int var2 = class168.field2912 * 2;
        float[] var3 = new float[3];
        class151.field2630 += var1;
        if (class151.field2630 >= 65535) {
            class151.field2630 = 65535;
            if (class134.field2343) {
                class228.field3877 = false;
            } else {
                class228.field3877 = true;
            }
            class134.field2343 = true;
        } else {
            class228.field3877 = false;
            class134.field2343 = false;
        }
        float var4 = (float) class151.field2630 / 65535.0F;
        int var5 = -38 % ((9 - arg0) / 44);
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class32.field404[class168.field2879][var2][var6] * 3;
            int var23 = class32.field404[class168.field2879][var2 + 1][var6] * 3;
            int var24 = (class32.field404[class168.field2879][var2 + 2][var6] + class32.field404[class168.field2879][var2 + 2][var6] - class32.field404[class168.field2879][var2 + 3][var6]) * 3;
            int var25 = var23 - var22;
            int var26 = var22 + var24 - var23 * 2;
            int var27 = class32.field404[class168.field2879][var2][var6];
            int var28 = class32.field404[class168.field2879][var2 + 2][var6] + var23 - var24 - var27;
            var3[var6] = (((float) var28 * var4 + (float) var26) * var4 + (float) var25) * var4 + (float) var27;
        }
        int var7 = class240.field4107 * 2;
        class88.field1372 = (int) var3[1] * -1;
        float[] var8 = new float[3];
        if (class246.field4261 == 0 && class125.field2060 == 0) {
            class125.field2060 = (((int) var3[2] >> 10) - 6) * 8;
            class246.field4261 = ((int) var3[0] >> 10) * 8 - 48;
        }
        class105.field1680 = (int) var3[2] - class125.field2060 * 128;
        class114.field1854 = (int) var3[0] - class246.field4261 * 128;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class32.field404[class62.field856][var7 + 1][var9] * 3;
            int var16 = (class32.field404[class62.field856][var7 + 2][var9] + class32.field404[class62.field856][var7 + 2][var9] - class32.field404[class62.field856][var7 + 3][var9]) * 3;
            int var17 = class32.field404[class62.field856][var7][var9] * 3;
            int var18 = class32.field404[class62.field856][var7][var9];
            int var19 = var15 - var17;
            int var20 = var17 + var16 - var15 * 2;
            int var21 = class32.field404[class62.field856][var7 + 2][var9] + var15 - var18 - var16;
            var8[var9] = (((float) var21 * var4 + (float) var20) * var4 + (float) var19) * var4 + (float) var18;
        }
        float var10 = (var8[1] - var3[1]) * -1.0F;
        float var11 = var8[0] - var3[0];
        float var12 = var8[2] - var3[2];
        double var13 = Math.sqrt((double) (var11 * var11 + var12 * var12));
        class70.field1045 = (float) Math.atan2((double) var10, var13);
        class182.field3238 = -((float) Math.atan2((double) var11, (double) var12));
        class109.field1747 = (int) ((double) class182.field3238 * 325.949D) & 0x7FF;
        class189.field3298 = (int) ((double) class70.field1045 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public static void method976(int arg0) {
        field2514 = null;
        field2515 = null;
        field2509 = null;
        if (arg0 != 6) {
            method976(-108);
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static final void method977(int arg0) {
        class33.field409.method1497((byte) 29);
        class34.field427.method14(false);
        if (arg0 != 3) {
            method978(-74, 33);
        }
        class145.field2536.method14(false);
        field2513++;
        class256.field4478.method14(false);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)V")
    public static final void method978(int arg0, int arg1) {
        field2521++;
        if (arg1 != -1) {
            method977(-111);
        }
        class50 var2 = class80.method534(1, arg0, (byte) 111);
        var2.method355((byte) 99);
    }
}
