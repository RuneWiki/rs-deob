import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class294 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Lvp;")
    public static class123 field4194 = new class123(32, 3);

    @OriginalMember(owner = "client!li", name = "g", descriptor = "B")
    public byte field4200;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Ljava/lang/String;")
    public String field4199;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/lang/String;")
    public String field4202;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Ljava/lang/String;")
    public String field4204;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Ljava/lang/String;")
    public String field4205;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
    public static final int method1817(byte arg0, int arg1) {
        int var2 = 67 % ((14 - arg0) / 56);
        field4198++;
        return (arg1 & 0x3FCB4) >> 11;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Lmf;")
    public static final class287 method1818(int arg0) {
        field4195++;
        if (arg0 <= 107) {
            method1820(92, null, true, -90);
        }
        try {
            return new class141();
        } catch (Throwable var2) {
            try {
                return (class287) Class.forName("pg").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class304();
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method1819(int arg0) {
        if (arg0 != 261300) {
            field4194 = null;
        }
        field4194 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
    public static final int method1820(int arg0, String arg1, boolean arg2, int arg3) {
        field4201++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg3 != -6908) {
            return 61;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
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
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
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

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Lda;")
    public static final class42 method1821(int arg0) {
        field4196++;
        if (class2.field23 == null || class74.field1237 == null) {
            return null;
        }
        class74.field1237.method2933(class2.field23, (byte) -100);
        class42 var1 = (class42) class74.field1237.method2932(48);
        if (var1 == null) {
            return null;
        }
        class210 var2 = class2.field15.method1835(36, var1.field649);
        if (arg0 >= -105) {
            field4197 = 35;
        }
        return var2 != null && var2.field3049 && var2.method1401(class2.field12, 105) ? var1 : class31.method257(61);
    }
}
