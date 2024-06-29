import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class427 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lwk;")
    public static class155 field5956 = new class155(64);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Ltc;")
    public static class332 field5959;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "[Lij;")
    public static class241[] field5960;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;IZB)I")
    public static final int method2552(String arg0, int arg1, boolean arg2, byte arg3) {
        field5962++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        if (arg3 > -122) {
            field5955 = -53;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
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
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
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

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lkk;B)Lre;")
    public static final class201 method2553(class161 arg0, byte arg1) {
        field5957++;
        return arg1 > -29 ? null : new class201(arg0.method1163(9988), arg0.method1163(9988), arg0.method1163(9988), arg0.method1163(9988), arg0.method1178((byte) 63), arg0.method1178((byte) 63), arg0.method1172((byte) -110));
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public static void method2554(byte arg0) {
        if (arg0 >= -80) {
            field5956 = null;
        }
        field5959 = null;
        field5956 = null;
        field5960 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lae;III)V")
    public static final void method2555(class172 arg0, int arg1, int arg2, int arg3) {
        field5958++;
        class150.field2078 = arg1;
        class301.field4256 = arg3;
        int var4 = -98 / ((-arg2 - 10) / 57);
        class296.field4184 = arg0;
    }
}
