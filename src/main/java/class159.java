import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class159 extends class37 {

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Ldd;")
    public static class35 field3229 = class180.method1196((byte) 127, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Ldd;")
    private static class35 field3236 = class180.method1196((byte) 127, "Sorry invited players only)3");

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Ldd;")
    public static class35 field3233 = null;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "[B")
    public static byte[] field3232 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "Ldd;")
    public static class35 field3230 = field3236;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "[I")
    public static int[] field3237 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "[I")
    public static int[] field3239 = new int[25];

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Ldd;")
    public static class35 field3238 = class180.method1196((byte) -67, "<col=ffffff>");

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field3231;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[][] var4 = this.method370(arg1, 0, 3);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class72.field1719; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg0 != 75) {
            method1061((byte) -82);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
    public static final void method1060(int arg0, int arg1) {
        ++field3235;
        class96.field2129 += arg0 * 128;
        short var2 = 256;
        if (~class96.field2129 < ~class82.field1902.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class96.field2129 -= class82.field1902.length;
            class58.method505(class132.field2838[var3], false);
        }
        int var4 = 0;
        int var5 = (-arg0 + var2) * 128;
        int var6 = arg0 * 128;
        for (int var7 = 0; var5 > var7; ++var7) {
            int var27 = class75.field1800[var4 + var6] + -(class82.field1902[class96.field2129 + var4 & class82.field1902.length + -1] * arg0 / 6);
            if (var27 < 0) {
                var27 = 0;
            }
            class75.field1800[var4++] = var27;
        }
        for (int var8 = var2 - arg0; ~var2 < ~var8; ++var8) {
            int var24 = var8 * 128;
            for (int var25 = 0; ~var25 > -129; ++var25) {
                int var26 = (int) (100.0D * Math.random());
                if (var26 < 50 && ~var25 < -11 && ~var25 > -119) {
                    class75.field1800[var24 + var25] = 255;
                } else {
                    class75.field1800[var24 + var25] = 0;
                }
            }
        }
        if (~class191.field3839 < -1) {
            class191.field3839 -= arg0 * 4;
        }
        if (~class20.field394 < -1) {
            class20.field394 -= arg0 * 4;
        }
        if (class20.field394 == 0 && ~class191.field3839 == -1) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (~var9 == -2) {
                class191.field3839 = 1024;
            }
            if (var9 == 0) {
                class20.field394 = 1024;
            }
        }
        for (int var10 = 0; var2 - arg0 > var10; ++var10) {
            class105.field2355[var10] = class105.field2355[arg0 + var10];
        }
        int var11 = var2 - arg0;
        if (arg1 == -5003) {
            while (var11 < var2) {
                class105.field2355[var11] = (int) (Math.sin((double) class55.field1312 / 14.0D) * 16.0D + Math.sin((double) class55.field1312 / 15.0D) * 14.0D + 12.0D * Math.sin((double) class55.field1312 / 16.0D));
                ++class55.field1312;
                ++var11;
            }
            class160.field3270 += arg0;
            int var12 = (arg0 - -(class89.field1988 & 1)) / 2;
            if (~var12 < -1) {
                for (int var13 = 0; ~var13 > ~(class160.field3270 * 100); ++var13) {
                    int var22 = 2 + (int) (124.0D * Math.random());
                    int var23 = (int) (Math.random() * 128.0D) - -128;
                    class75.field1800[(var23 << 7) + var22] = 192;
                }
                class160.field3270 = 0;
                for (int var14 = 0; var2 > var14; ++var14) {
                    int var19 = 0;
                    int var20 = var14 * 128;
                    for (int var21 = -var12; ~var21 > -129; ++var21) {
                        if (var12 + var21 < 128) {
                            var19 += class75.field1800[var20 + var21 - -var12];
                        }
                        if (~(-var12 + -1 + var21) <= -1) {
                            var19 -= class75.field1800[-var12 + -1 + var20 + var21];
                        }
                        if (var21 >= 0) {
                            class110.field2437[var21 - -var20] = var19 / (var12 * 2 + 1);
                        }
                    }
                }
                for (int var15 = 0; var15 < 128; ++var15) {
                    int var16 = 0;
                    for (int var17 = -var12; var17 < var2; ++var17) {
                        int var18 = var17 * 128;
                        if (~var2 < ~(var12 + var17)) {
                            var16 += class110.field2437[var12 * 128 + var15 + var18];
                        }
                        if (~(-var12 - 1 + var17) <= -1) {
                            var16 -= class110.field2437[var15 + var18 + -((var12 + 1) * 128)];
                        }
                        if (~var17 <= -1) {
                            class75.field1800[var15 + var18] = var16 / (var12 * 2 + 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class159() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field3232 = null;
        field3230 = null;
        field3239 = null;
        if (arg0 != -78) {
            field3233 = null;
        }
        field3233 = null;
        field3236 = null;
        field3238 = null;
        field3229 = null;
        field3237 = null;
    }
}
