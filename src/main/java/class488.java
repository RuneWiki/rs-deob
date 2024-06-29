import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class488 {

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "Lig;")
    public static class206 field7113 = new class206(100, 7);

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "[J")
    public static long[] field7122 = new long[32];

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field7121 = 0;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public int field7108;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public int field7109;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public int field7117;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public int field7118;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "[B")
    public byte[] field7114;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "[B")
    public byte[] field7115;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "([[II)V")
    public static final void method2931(int[][] arg0, int arg1) {
        class402.field6087 = arg0;
        if (arg1 != 55) {
            field7122 = null;
        }
        field7119++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public static final void method2932(boolean arg0) {
        class645.field9296.method528(-519011192);
        if (!arg0) {
            field7116++;
            class326.field4700.method528(-519011192);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
    public static final boolean method2933(int arg0, String arg1, int arg2, boolean arg3) {
        field7112++;
        if (arg2 != -98) {
            return true;
        } else if (arg0 >= 2 && arg0 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg1.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg1.charAt(var8);
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
                    return false;
                }
                if (var11 >= arg0) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if (var10 / arg0 != var6) {
                    return false;
                }
                var5 = true;
                var6 = var10;
            }
            return var5;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2934(int arg0, String arg1) {
        field7111++;
        if (class538.field7747 == null) {
            return;
        }
        class308.method2044(class180.field2216, arg0 + 8547);
        class149.field1842++;
        class468.field6960.method1205((byte) -69, class456.method2816(-87, arg1));
        class468.field6960.method1237(1049279824, arg1);
        if (arg0 != -15981) {
            method2934(-125, null);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V")
    public static void method2935(boolean arg0) {
        field7122 = null;
        field7113 = null;
        if (arg0) {
            method2934(88, null);
        }
    }
}
