import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class348 extends class58 {

    @OriginalMember(owner = "client!an", name = "q", descriptor = "Z")
    public static boolean field5537 = false;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field5539 = 0;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5540 = "cyan:";

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!an", name = "v", descriptor = "Lcg;")
    public static class49 field5542;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V", line = 8)
    public static void method2435(byte arg0) {
        field5540 = null;
        field5542 = null;
        int var1 = 109 / ((arg0 + 13) / 55);
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V", line = 18)
    public static final void method2436(byte arg0) {
        if (arg0 >= -12) {
            method2435((byte) -9);
        }
        class249.method1749(-24417, class255.field4104);
        int var1 = (class269.field4309 >> 10) + (class24.field345 >> 3);
        int var2 = (class34.field484 >> 3) + (class32.field454 >> 10);
        field5541++;
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class56.field866 = new int[var5];
        class349.field5547 = new int[var5];
        class276.field4400 = new int[var5];
        byte var6 = 8;
        class277.field4409 = new byte[var5][];
        class100.field1618 = new byte[var5][];
        class154.field2746 = new int[var5];
        class201.field3431 = new int[var5];
        class88.field1386 = new int[var5];
        class310.field4910 = new byte[var5][];
        class180.field3039 = new byte[var5][];
        class44.field706 = new int[var5][4];
        class144.field2624 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class56.field866[var7] = var10;
                class88.field1386[var7] = class92.field1446.method437((byte) -33, "m" + var8 + "_" + var9);
                class349.field5547[var7] = class92.field1446.method437((byte) -33, "l" + var8 + "_" + var9);
                class201.field3431[var7] = class92.field1446.method437((byte) -33, "n" + var8 + "_" + var9);
                class154.field2746[var7] = class92.field1446.method437((byte) -33, "um" + var8 + "_" + var9);
                class276.field4400[var7] = class92.field1446.method437((byte) -33, "ul" + var8 + "_" + var9);
                if (class201.field3431[var7] == -1) {
                    class88.field1386[var7] = -1;
                    class349.field5547[var7] = -1;
                    class154.field2746[var7] = -1;
                    class276.field4400[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class201.field3431.length; var11++) {
            class201.field3431[var11] = -1;
            class88.field1386[var11] = -1;
            class349.field5547[var11] = -1;
            class154.field2746[var11] = -1;
            class276.field4400[var11] = -1;
        }
        class318.method2191(var4, false, var2, var6, var1, (byte) -88, var3, true);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)Z", line = 139)
    public static final boolean method2437(int arg0, int arg1, int arg2, int arg3) {
        if (!class31.method291(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class137.field2487[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class233.field3870) {
                    if (!class317.method2182(var4, var6, var5)) {
                        return false;
                    }
                    if (!class317.method2182(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class317.method2182(var4, var7, var5)) {
                        return false;
                    }
                    if (!class317.method2182(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class317.method2182(var4, var8, var5)) {
                    return false;
                }
                if (!class317.method2182(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class75.field1226) {
                    if (!class317.method2182(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class317.method2182(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class317.method2182(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class317.method2182(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class317.method2182(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class317.method2182(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class233.field3870) {
                    if (!class317.method2182(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class317.method2182(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class317.method2182(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class317.method2182(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class317.method2182(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class317.method2182(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class75.field1226) {
                    if (!class317.method2182(var4, var6, var5)) {
                        return false;
                    }
                    if (!class317.method2182(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class317.method2182(var4, var7, var5)) {
                        return false;
                    }
                    if (!class317.method2182(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class317.method2182(var4, var8, var5)) {
                    return false;
                }
                if (!class317.method2182(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class317.method2182(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class317.method2182(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class317.method2182(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class317.method2182(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class317.method2182(var4, var8, var5);
        } else {
            return true;
        }
    }
}
