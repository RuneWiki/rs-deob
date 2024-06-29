import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class232 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3677 = null;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
    public static int[] field3678 = new int[14];

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[Leg;")
    public static class302[] field3675;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 10)
    public static final int method1673(String arg0, int arg1) {
        field3679++;
        if (class43.field763 == null || arg0.length() == 0) {
            return -1;
        } else if (arg1 == -27362) {
            for (int var2 = 0; var2 < class43.field763.field3136; var2++) {
                if (class229.method1659(" ", class43.field763.field3131[var2], "<br>", -20263).equals(arg0)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLjava/lang/String;Z)I", line = 43)
    public static final int method1674(int arg0, boolean arg1, String arg2, boolean arg3) {
        field3676++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
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
        } else if (arg1) {
            return var6;
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 120)
    public static void method1675(int arg0) {
        field3677 = null;
        field3678 = null;
        field3675 = null;
        if (arg0 >= -113) {
            field3675 = (class302[]) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZC)C", line = 136)
    public static final char method1676(boolean arg0, char arg1) {
        field3684++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (!arg0) {
                method1676(false, '\u0003');
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lpe;I)V", line = 169)
    public static final void method1677(class101 arg0, int arg1) {
        if (arg1 != 48) {
            field3675 = (class302[]) null;
        }
        byte[] var2 = new byte[24];
        field3681++;
        if (class92.field1520 != null) {
            try {
                class92.field1520.method1603((byte) -68, 0L);
                class92.field1520.method1607(var2, arg1 ^ 0xFFFF9A15);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method743(var2, 24, 0, -108);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 215)
    public static final void method1678(int arg0) {
        class300.field4722 = true;
        if (arg0 != -46) {
            field3675 = (class302[]) null;
        }
        field3682++;
    }
}
