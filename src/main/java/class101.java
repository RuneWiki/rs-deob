import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class101 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III[BII)V", line = 4)
    public static final void method785(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg0 < 63) {
            return;
        }
        field1460++;
        if (arg5 >= arg1) {
            return;
        }
        int var6 = arg1 - arg5 >> 2;
        int var7 = arg2 + arg5;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg1 - arg5 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var7++] = 1;
                }
            }
            arg3[var7++] = 1;
            arg3[var7++] = 1;
            arg3[var7++] = 1;
            arg3[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;ZI)I", line = 39)
    public static final int method786(int arg0, String arg1, boolean arg2, int arg3) {
        field1459++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        if (arg0 != 55) {
            return 103;
        }
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
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }
}
