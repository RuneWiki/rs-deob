import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class396 {

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field5388 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;IZI)I", line = 3)
    public static final int method2450(String arg0, int arg1, boolean arg2, int arg3) {
        field5386++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = -29 % (arg1 / 60);
        int var7 = 0;
        int var8 = arg0.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg0.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
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
            int var11 = arg3 * var7 + var12;
            if (var11 / arg3 != var7) {
                throw new NumberFormatException();
            }
            var7 = var11;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V", line = 82)
    public static final void method2451(int arg0, int arg1) {
        field5387++;
        if (!class168.field1968) {
            arg0 = -1;
        }
        if (class96.field1126 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class138 var2 = class302.method1919((byte) 19, arg0);
            class132 var3 = var2.method892(-15825);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class401.field5525.method2729(var3.method860(), new Point(var2.field1576, var2.field1575), var3.method863(), 0, var3.method858(), class357.field4845);
                class96.field1126 = arg0;
            }
        }
        if (arg0 == arg1 && class96.field1126 != -1) {
            class401.field5525.method2729(-1, new Point(), -1, 0, (int[]) null, class357.field4845);
            class96.field1126 = -1;
        }
    }
}
