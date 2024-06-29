import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class125 {

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Loa;")
    public static class99 field14 = class221.method1463(2844, "cyan:");

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field16 = 0;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Loa;")
    public static class99 field18 = class221.method1463(2844, "event_opbase");

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "[I")
    public static int[] field19 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[I")
    public static int[] field17 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)Z")
    public static final boolean method10(int arg0, int arg1, int arg2, int arg3) {
        if (!class187.method1281(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class189.field3337[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class260.field4540) {
                    if (!class181.method1208(var4, var6, var5)) {
                        return false;
                    }
                    if (!class181.method1208(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1208(var4, var7, var5)) {
                        return false;
                    }
                    if (!class181.method1208(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class181.method1208(var4, var8, var5)) {
                    return false;
                }
                if (!class181.method1208(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class163.field2869) {
                    if (!class181.method1208(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class181.method1208(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1208(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class181.method1208(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class181.method1208(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class181.method1208(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class260.field4540) {
                    if (!class181.method1208(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class181.method1208(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1208(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class181.method1208(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class181.method1208(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class181.method1208(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class163.field2869) {
                    if (!class181.method1208(var4, var6, var5)) {
                        return false;
                    }
                    if (!class181.method1208(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class181.method1208(var4, var7, var5)) {
                        return false;
                    }
                    if (!class181.method1208(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class181.method1208(var4, var8, var5)) {
                    return false;
                }
                if (!class181.method1208(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class181.method1208(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class181.method1208(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class181.method1208(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class181.method1208(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class181.method1208(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Lte;")
    public static final class77 method11(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3748; var4++) {
            class77 var5 = var3.field3743[var4];
            if ((var5.field1372 >> 29 & 0x3L) == 2L && var5.field1362 == arg1 && var5.field1357 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method12(int arg0) {
        field14 = null;
        field17 = null;
        field18 = null;
        field19 = null;
        if (arg0 != 190) {
            method12(77);
        }
    }
}
