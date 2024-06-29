import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class148 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[S")
    public static short[] field2021 = new short[256];

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field2025 = 0;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)Z")
    public static final boolean method925(int arg0, int arg1, int arg2, int arg3) {
        if (!class57.method358(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class185.field2812[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class272.field4343) {
                    if (!class272.method1772(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1772(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1772(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1772(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1772(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1772(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class107.field1525) {
                    if (!class272.method1772(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1772(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1772(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1772(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1772(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class272.method1772(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class272.field4343) {
                    if (!class272.method1772(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1772(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1772(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1772(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1772(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class272.method1772(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class107.field1525) {
                    if (!class272.method1772(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1772(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1772(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1772(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class272.method1772(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1772(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class272.method1772(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class272.method1772(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class272.method1772(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class272.method1772(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class272.method1772(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZIIZI)V")
    public static final void method926(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2023++;
        class43.method286(arg0, class306.field4924.length + arg4, arg2, arg3, arg1, 0, arg4);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)Lcd;")
    public static final class36 method927(int arg0, boolean arg1) {
        field2022++;
        class36 var2 = (class36) class151.field2099.method1486((long) arg0, -19212);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1125.method2050(86, class21.method142((byte) -84, arg0), class5.method22(arg0, 255));
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method242(27613, new class215(var3));
        }
        class151.field2099.method1489((long) arg0, 100, var4);
        if (!arg1) {
            field2026 = 69;
        }
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2021 = null;
        if (arg0 != 238) {
            method925(35, 119, 51, 47);
        }
    }
}
