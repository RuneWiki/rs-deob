import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class151 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
    public static boolean field2619 = true;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Lij;")
    public static class50 field2621 = class78.method578(124, ":chalreq:");

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "[I")
    public static int[] field2625 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lij;")
    public static class50 field2623 = class78.method578(124, "Weiter");

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
    public static int[] field2624 = new int[100];

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
    public static int[] field2627 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lpe;")
    public static class100 field2622 = new class100(64);

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Z")
    public static boolean field2628 = false;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lii;")
    public static class183 field2629;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        field2626++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg0;
        } else if (~var7 == arg6) {
            return 1 + 7 - arg2 - arg4;
        } else {
            return 7 - (arg5 - 1) - arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static void method1054(boolean arg0) {
        field2625 = null;
        field2624 = null;
        field2629 = null;
        field2623 = null;
        if (arg0) {
            field2627 = null;
            field2622 = null;
            field2621 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public static final void method1055(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class261.field4553; var3++) {
            for (int var4 = 0; var4 < class139.field2421; var4++) {
                for (int var5 = 0; var5 < class54.field978; var5++) {
                    class65 var6 = class59.field1089[var3][var4][var5];
                    if (var6 != null) {
                        class55 var7 = var6.field1233;
                        if (var7 != null && var7.field993.method127()) {
                            class122.method885(var7.field993, var3, var4, var5, 1, 1);
                            if (var7.field984 != null && var7.field984.method127()) {
                                class122.method885(var7.field984, var3, var4, var5, 1, 1);
                                var7.field993.method120(var7.field984, 0, 0, 0, false);
                                var7.field984 = var7.field984.method124(arg0, arg1, arg2);
                            }
                            var7.field993 = var7.field993.method124(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1244; var8++) {
                            class106 var10 = var6.field1236[var8];
                            if (var10 != null && var10.field1901.method127()) {
                                class122.method885(var10.field1901, var3, var4, var5, var10.field1907 + 1 - var10.field1913, var10.field1919 - var10.field1906 + 1);
                                var10.field1901 = var10.field1901.method124(arg0, arg1, arg2);
                            }
                        }
                        class102 var9 = var6.field1251;
                        if (var9 != null && var9.field1870.method127()) {
                            class219.method1502(var9.field1870, var3, var4, var5);
                            var9.field1870 = var9.field1870.method124(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2620++;
        int var6 = arg2 - arg0;
        int var7 = arg4 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                client.method622(arg0, arg5, arg2, 0, arg3);
            }
        } else if (var6 == 0) {
            class231.method1573(arg3, arg0, arg4, -115, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            int var8 = -5 % ((arg1 - 70) / 56);
            boolean var9 = var7 < var6;
            if (var9) {
                int var10 = arg3;
                arg3 = arg0;
                arg0 = var10;
                int var11 = arg4;
                arg4 = arg2;
                arg2 = var11;
            }
            if (arg3 > arg4) {
                int var12 = arg3;
                int var13 = arg0;
                arg0 = arg2;
                arg3 = arg4;
                arg2 = var13;
                arg4 = var12;
            }
            int var14 = arg4 - arg3;
            int var15 = arg0;
            int var16 = arg2 - arg0;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg2 <= arg0 ? -1 : 1;
            int var18 = -(var14 >> 1);
            if (var9) {
                for (int var19 = arg3; var19 <= arg4; var19++) {
                    class177.field2963[var19][var15] = arg5;
                    var18 += var16;
                    if (var18 > 0) {
                        var15 += var17;
                        var18 -= var14;
                    }
                }
            } else {
                for (int var20 = arg3; var20 <= arg4; var20++) {
                    var18 += var16;
                    class177.field2963[var15][var20] = arg5;
                    if (var18 > 0) {
                        var15 += var17;
                        var18 -= var14;
                    }
                }
            }
        }
    }
}
