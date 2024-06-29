import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class685 {

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field9712;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "[B")
    public byte[] field9718;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "[S")
    public short[] field9714;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "[S")
    public short[] field9715;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[S")
    public short[] field9716;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
    public static final boolean method3853(int arg0, int arg1) {
        field9713++;
        if (arg0 != 27931) {
            method3855(-115, -79, 58, 20);
        }
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILjava/lang/String;ZB)I")
    public static final int method3854(int arg0, String arg1, boolean arg2, byte arg3) {
        field9711++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 > -126) {
            method3855(-7, -1, 116, 103);
        }
        int var6 = 0;
        int var7 = arg1.length();
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
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)V")
    public static final void method3855(int arg0, int arg1, int arg2, int arg3) {
        field9712++;
        int var4 = arg0 << 3;
        int var5 = arg1 << 3;
        int var6 = arg2 << 3;
        if (arg3 >= -57) {
            return;
        }
        class591.field8509 = var5;
        class27.field926 = var6;
        if (class423.field6123 == 2) {
            class596.field8558 = var4;
            class499.field7113 = var6;
            class517.field7300 = var5;
        }
        class150.method1182(-117);
        class292.field4392 = true;
    }
}
