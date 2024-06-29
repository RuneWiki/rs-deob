import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class131 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static volatile int field3102 = -1;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Ltd;")
    public static class136 field3107 = class145.method1172("Ihr Spielkonto wurde deaktiviert)3", 45);

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "[I")
    public static int[] field3106 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public static int[] field3105 = new int[100];

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method1064(int arg0) {
        if (arg0 != 37) {
            method1067(true, -123);
        }
        field3105 = null;
        field3106 = null;
        field3107 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 100) {
            return;
        }
        for (class43 var5 = (class43) class71.field1492.method512(0); var5 != null; var5 = (class43) class71.field1492.method520((byte) 125)) {
            if (var5.field1001 != -1 || var5.field999 != null) {
                int var6 = 0;
                if (arg2 > var5.field981) {
                    var6 += arg2 - var5.field981;
                } else if (arg2 < var5.field993) {
                    var6 += var5.field993 - arg2;
                }
                if (arg1 > var5.field989) {
                    var6 += arg1 - var5.field989;
                } else if (var5.field986 > arg1) {
                    var6 += var5.field986 - arg1;
                }
                if (var6 - 64 > var5.field1002 || class83.field1968 == 0 || var5.field1005 != arg4) {
                    if (var5.field995 != null) {
                        class55.field1228.method789(var5.field995);
                        var5.field995 = null;
                    }
                    if (var5.field980 != null) {
                        class55.field1228.method789(var5.field980);
                        var5.field980 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1002 - var6) * class83.field1968 / var5.field1002;
                    if (var5.field995 != null) {
                        var5.field995.method368(var7);
                    } else if (var5.field1001 >= 0) {
                        class117 var8 = class117.method925(class147.field3413, var5.field1001, 0);
                        if (var8 != null) {
                            class48 var9 = var8.method926().method408(class88.field2080);
                            class46 var10 = class46.method374(var9, 100, var7);
                            var10.method385(-1);
                            class55.field1228.method788(var10);
                            var5.field995 = var10;
                        }
                    }
                    if (var5.field980 != null) {
                        var5.field980.method368(var7);
                        if (!var5.field980.method675((byte) -28)) {
                            var5.field980 = null;
                        }
                    } else if (var5.field999 != null && (var5.field985 -= arg0) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field999.length);
                        class117 var12 = class117.method925(class147.field3413, var5.field999[var11], 0);
                        if (var12 != null) {
                            class48 var13 = var12.method926().method408(class88.field2080);
                            class46 var14 = class46.method374(var13, 100, var7);
                            var14.method385(0);
                            class55.field1228.method788(var14);
                            var5.field980 = var14;
                            var5.field985 = (int) (Math.random() * (double) (var5.field996 - var5.field974)) + var5.field974;
                        }
                    }
                }
            }
        }
        field3109++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BIII)Ltd;")
    public static final class136 method1066(byte[] arg0, int arg1, int arg2, int arg3) {
        class136 var4 = new class136();
        var4.field3183 = 0;
        if (arg1 != -24256) {
            method1065(7, 27, 27, -59, -31);
        }
        field3104++;
        var4.field3182 = new byte[arg3];
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg0[var5] != 0) {
                var4.field3182[var4.field3183++] = arg0[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)I")
    public abstract int method340(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public abstract void method346(int arg0);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)Lj;")
    public static final class62 method1067(boolean arg0, int arg1) {
        if (arg0) {
            field3102 = 105;
        }
        class62 var2 = (class62) class11.field178.method1162((long) arg1, true);
        field3108++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class101.field2422.method669(arg1, 14, -57);
        class62 var4 = new class62();
        if (var3 != null) {
            var4.method468(new class127(var3), -20435);
        }
        class11.field178.method1164((long) arg1, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lke;I)Z")
    public static final boolean method1068(class74 arg0, int arg1) {
        field3103++;
        if (arg0.field1593 == null) {
            return false;
        }
        if (arg1 != 3149) {
            method1066(null, -117, 85, 13);
        }
        for (int var2 = 0; var2 < arg0.field1593.length; var2++) {
            int var3 = class141.method1147(var2, (byte) -126, arg0);
            int var4 = arg0.field1596[var2];
            if (arg0.field1593[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1593[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field1593[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }
}
