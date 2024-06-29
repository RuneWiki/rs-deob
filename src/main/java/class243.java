import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class243 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field3635 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3637 = "Created gameworld";

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
    public static int[] field3638 = new int[100];

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field3642 = 0;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
    public static int[] field3639 = new int[4096];

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "F")
    public static float field3636;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[[[B")
    public static byte[][][] field3644;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZZLjava/lang/String;)Z")
    public static final boolean method1533(int arg0, boolean arg1, boolean arg2, String arg3) {
        field3641++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = arg2;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
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
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1534(byte arg0) {
        field3638 = null;
        field3644 = null;
        if (arg0 == 89) {
            field3637 = null;
            field3639 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(JI)V")
    public static final void method1535(long arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field3634++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class150.field2164; var3++) {
            if (class259.field3944[var3] == arg0) {
                class150.field2164--;
                for (int var4 = var3; var4 < class150.field2164; var4++) {
                    class7.field114[var4] = class7.field114[var4 + 1];
                    class285.field4275[var4] = class285.field4275[var4 + 1];
                    class128.field1917[var4] = class128.field1917[var4 + 1];
                    class259.field3944[var4] = class259.field3944[var4 + 1];
                    class223.field3344[var4] = class223.field3344[var4 + 1];
                    class32.field462[var4] = class32.field462[var4 + 1];
                }
                class77.field1244++;
                class112.field1724 = class68.field1077;
                class196.field2979.method1106(243, false);
                class196.field2979.method1610(791715792, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1536(int arg0, byte[] arg1, boolean arg2) {
        field3640++;
        if (arg0 != 36) {
            return null;
        } else if (arg1 == null) {
            return null;
        } else {
            if (arg1.length > 136 && !class150.field2166) {
                try {
                    class210 var3 = (class210) Class.forName("qi").getDeclaredConstructor().newInstance();
                    var3.method812((byte) -105, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class150.field2166 = true;
                }
            }
            return arg2 ? class187.method1169(false, arg1) : arg1;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3639[var0] = class115.method739((byte) 115, var0);
        }
    }
}
