import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class58 extends class301 {

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[B")
    public byte[] field1149;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field1148 = 64;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "[I")
    public static int[] field1145;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;Loe;I)I", line = 13)
    public static final int method482(String arg0, class146 arg1, int arg2) {
        int var3 = arg1.field2435;
        field1147++;
        byte[] var4 = class128.method911(8226, arg0);
        arg1.method1022(var4.length, arg2 - 6715);
        if (arg2 != 28524) {
            field1145 = (int[]) null;
        }
        arg1.field2435 += class56.field1112.method2304(var4.length, arg1.field2496, 0, arg1.field2435, var4, -88);
        return arg1.field2435 - var3;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 31)
    public static void method483(int arg0) {
        field1145 = null;
        if (arg0 > -12) {
            method484(true, (byte) 105, (String) null, 98);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZBLjava/lang/String;I)I", line = 41)
    public static final int method484(boolean arg0, byte arg1, String arg2, int arg3) {
        field1150++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 != -81) {
            return -84;
        }
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
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
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
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

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V", line = 121)
    public class58(byte[] arg0) {
        this.field1149 = arg0;
    }
}
