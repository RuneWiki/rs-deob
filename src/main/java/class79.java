import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class79 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZBLjava/lang/String;I)I", line = 8)
    public static final int method612(boolean arg0, byte arg1, String arg2, int arg3) {
        field1200++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var10 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg3) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg3 * var6 + var12;
            if ((var11 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var6 = var11;
            var5 = true;
        }
        int var9 = 19 / ((-arg1 - 67) / 56);
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V", line = 87)
    public static final void method613(int arg0, boolean arg1) {
        field1201++;
        class493.method2886(true);
        if (arg1) {
            return;
        }
        int var2 = class545.field8005.method2888(arg0, (byte) 10).field9149;
        if (var2 == 0) {
            return;
        }
        int var3 = class230.field3404.field3180[arg0];
        if (var2 == 6) {
            class696.field9882 = var3;
        }
        if (var2 == 5) {
            class248.field3608 = var3;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z", line = 113)
    public static final boolean method614(int arg0, int arg1, int arg2) {
        if (arg1 == -43) {
            field1202++;
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }
}
