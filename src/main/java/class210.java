import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class210 {

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "[I")
    public static int[] field4092 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lrf;")
    private static class163 field4084 = class53.method392(65, "FULL");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lrf;")
    private static class163 field4081 = class53.method392(-45, "flash3:");

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field4095 = 2;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lrf;")
    public static class163 field4096 = field4084;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lrf;")
    public static class163 field4088 = field4081;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lrf;")
    private static class163 field4091 = class53.method392(-51, "Login");

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lrf;")
    public static class163 field4086 = field4081;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lrf;")
    public static class163 field4083 = field4091;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Lrf;")
    public static class163 field4093 = class53.method392(49, "::qa_op_test");

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lrf;")
    public static class163 field4090 = class53.method392(-113, "(Y<)4col>");

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
    public static int[] field4094;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    public static final void method1367(int arg0, int arg1) {
        field4089++;
        class27.field505 += arg1 * 128;
        short var2 = 256;
        if (class27.field505 > class61.field1247.length) {
            class27.field505 -= class61.field1247.length;
            int var3 = (int) (Math.random() * 12.0D);
            class65.method469(class55.field1117[var3], -128);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class43.field870[var4 + var5] - class61.field1247[class61.field1247.length - 1 & class27.field505 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class43.field870[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class43.field870[var24 + var25] = 255;
                } else {
                    class43.field870[var24 + var25] = 0;
                }
            }
        }
        if (class194.field3826 > 0) {
            class194.field3826 -= arg1 * 4;
        }
        if (class149.field3066 > 0) {
            class149.field3066 -= arg1 * 4;
        }
        if (class194.field3826 == 0 && class149.field3066 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 1) {
                class149.field3066 = 1024;
            }
            if (var9 == 0) {
                class194.field3826 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class36.field729[var10] = class36.field729[var10 + arg1];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class36.field729[var11] = (int) (Math.sin((double) class73.field1536 / 14.0D) * 16.0D + Math.sin((double) class73.field1536 / 15.0D) * 14.0D + Math.sin((double) class73.field1536 / 16.0D) * 12.0D);
            class73.field1536++;
        }
        if (arg0 < 42) {
            return;
        }
        class93.field2010 += arg1;
        int var12 = (arg1 + (class51.field1023 & 0x1)) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class93.field2010 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class43.field870[(var23 << 7) + var22] = 192;
        }
        class93.field2010 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class43.field870[var12 + var21 + var20];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class43.field870[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class25.field449[var21 + var20] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var12 + var17) {
                    var16 += class25.field449[var12 * 128 + var18 + var15];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class25.field449[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class43.field870[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)I")
    public static final int method1368(byte arg0, int arg1) {
        field4085++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAB) >>> 1);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = -123 % ((arg0 + 38) / 39);
        int var7 = (var5 >>> 16) + var5;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1369(int arg0) {
        if (arg0 != -22073) {
            return;
        }
        for (int var1 = 0; var1 < class93.field2013; var1++) {
            int var2 = class170.field3459[var1];
            class70 var3 = class187.field3723[var2];
            if (var3 != null) {
                class48.method291((byte) -125, var3, var3.field1482.field2644);
            }
        }
        field4087++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method1370(boolean arg0) {
        field4088 = null;
        if (arg0) {
            method1368((byte) -19, 84);
        }
        field4094 = null;
        field4096 = null;
        field4093 = null;
        field4084 = null;
        field4092 = null;
        field4081 = null;
        field4083 = null;
        field4086 = null;
        field4091 = null;
        field4090 = null;
    }
}
