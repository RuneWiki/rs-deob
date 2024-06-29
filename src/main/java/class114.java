import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class114 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "J")
    public static volatile long field2053 = 0L;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2058 = 0;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Z")
    public static boolean field2059 = true;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lvh;")
    public static class108 field2057;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lgb;")
    public static class64 field2049;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lne;")
    public static class78 field2051;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2052;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIB)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg1 < arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class167.field2735[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class167.field2735[var6][arg0] = arg2;
            }
        }
        if (arg4 != -96) {
            method798(85, -85, 120, 120, (byte) -89);
        }
        field2050++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)I")
    public static final int method799(int arg0, boolean arg1) {
        if (class194.field3131 != null) {
            class194.field3131.method1380(true);
            class194.field3131 = null;
        }
        if (arg1) {
            method799(-7, true);
        }
        field2055++;
        class115.field2064++;
        if (class115.field2064 > 4) {
            class280.field4463 = 0;
            class115.field2064 = 0;
            return arg0;
        }
        class280.field4463 = 0;
        if (class56.field978 == class153.field2556) {
            class153.field2556 = class83.field1504;
        } else {
            class153.field2556 = class56.field978;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;IBZ)I")
    public static final int method800(String arg0, int arg1, byte arg2, boolean arg3) {
        field2048++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg2 >= -26) {
            field2052 = null;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    public static final int method801(byte arg0) {
        field2056++;
        return arg0 <= 40 ? -42 : class206.field3424;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)I")
    public static final int method802(int arg0, byte arg1) {
        field2054++;
        if (arg1 < 84) {
            field2059 = true;
        }
        return (arg0 & 0x3FCFD) >> 11;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        if (arg0 <= 113) {
            method798(-4, -99, -23, -59, (byte) -112);
        }
        field2057 = null;
        field2052 = null;
        field2049 = null;
        field2051 = null;
    }
}
