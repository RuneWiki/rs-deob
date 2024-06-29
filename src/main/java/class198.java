import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class198 {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "[Lth;")
    public class119[] field3187;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    public int[] field3185;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3183 = "Loading sprites - ";

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1368(int arg0) {
        field3183 = null;
        if (arg0 != 17218) {
            method1370(48);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static final void method1369(int arg0) {
        for (class127 var1 = (class127) class148.field2366.method1553(true); var1 != null; var1 = (class127) class148.field2366.method1551(0)) {
            if (var1.field2029 > 0) {
                var1.field2029--;
            }
            if (var1.field2029 != 0) {
                if (var1.field2034 > 0) {
                    var1.field2034--;
                }
                if (var1.field2034 == 0 && var1.field2035 >= 1 && var1.field2024 >= 1 && var1.field2035 <= 102 && var1.field2024 <= 102 && (var1.field2033 < 0 || class8.method79((byte) 127, var1.field2033, var1.field2039))) {
                    class132.method896(var1.field2037, var1.field2028, var1.field2031, var1.field2039, var1.field2033, var1.field2024, var1.field2035, (byte) 107);
                    var1.field2034 = -1;
                    if (var1.field2033 == var1.field2027 && var1.field2027 == -1) {
                        var1.method952((byte) 55);
                    } else if (var1.field2033 == var1.field2027 && var1.field2031 == var1.field2025 && var1.field2039 == var1.field2036) {
                        var1.method952((byte) 73);
                    }
                }
            } else if (var1.field2027 < 0 || class8.method79((byte) 123, var1.field2027, var1.field2036)) {
                class132.method896(var1.field2037, var1.field2028, var1.field2025, var1.field2036, var1.field2027, var1.field2024, var1.field2035, (byte) 86);
                var1.method952((byte) 126);
            }
        }
        field3184++;
        if (arg0 <= 23) {
            method1369(30);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public static final void method1370(int arg0) {
        field3186++;
        class57.field829 = new class58(arg0);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
    public class198(int arg0) {
        this.field3189 = arg0;
        this.field3187 = new class119[this.field3189];
        this.field3185 = new int[this.field3189];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
    public static final void method1371(int arg0, int arg1) {
        field3182++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class82.field1327 += arg0 * 128;
        if (class82.field1327 > class242.field3791.length) {
            class82.field1327 -= class242.field3791.length;
            int var3 = (int) (Math.random() * 12.0D);
            class234.method1614(class119.field1881[var3], (byte) -116);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class225.field3543[var4 + var5] - (class242.field3791[class82.field1327 + var4 & class242.field3791.length + -1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class225.field3543[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class225.field3543[var23 + var24] = 255;
                } else {
                    class225.field3543[var24 + var23] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class302.field4944[var9] = class302.field4944[var9 + arg0];
        }
        if (arg1 != -1234642777) {
            return;
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class302.field4944[var10] = (int) (Math.sin((double) class119.field1873 / 14.0D) * 16.0D + Math.sin((double) class119.field1873 / 15.0D) * 14.0D + Math.sin((double) class119.field1873 / 16.0D) * 12.0D);
            class119.field1873++;
        }
        class8.field179 += arg0;
        int var11 = ((class274.field4472 & 0x1) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class8.field179; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class225.field3543[(var22 << 7) + var21] = 192;
        }
        class8.field179 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var20 + var11) < 128) {
                    var18 += class225.field3543[var20 - (-var19 - var11)];
                }
                if (var20 - (var11 + 1) >= 0) {
                    var18 -= class225.field3543[-(var11 - var20 - var19) - 1];
                }
                if (var20 >= 0) {
                    class294.field4798[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var11 + var16 < var2) {
                    var15 += class294.field4798[var11 * 128 + var14 + var17];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class294.field4798[var14 + var17 - ((var11 + 1) * 128)];
                }
                if (var16 >= 0) {
                    class225.field3543[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
