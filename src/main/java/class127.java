import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class127 extends class467 {

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Ljava/lang/String;")
    public String field1803;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field1802 = 1403;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lcm;")
    public static class449 field1804 = new class449(26, 18);

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "Lns;")
    public static class438 field1806;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static void method813(int arg0) {
        int var1 = -22 % ((-arg0 - 5) / 42);
        field1806 = null;
        field1804 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIC)I")
    public static final int method814(int arg0, int arg1, char arg2) {
        field1805++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        if (arg1 > -87) {
            field1804 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;Lqv;III)V")
    public static final void method815(class496 arg0, class49 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class492.field7186) {
            class420 var5 = class380.field5802[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6260 != null && var5.field6260.method49(7)) {
                arg1.method61(var5.field6260, (byte) 118, arg0, 0, true, class215.field2995, 0);
            }
        }
        if (arg4 < class492.field7186) {
            class420 var6 = class380.field5802[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6260 != null && var6.field6260.method49(7)) {
                arg1.method61(var6.field6260, (byte) 118, arg0, class215.field2995, true, 0, 0);
            }
        }
        if (arg3 < class492.field7186 && arg4 < class285.field4248) {
            class420 var7 = class380.field5802[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6260 != null && var7.field6260.method49(7)) {
                arg1.method61(var7.field6260, (byte) 118, arg0, class215.field2995, true, class215.field2995, 0);
            }
        }
        if (arg3 < class492.field7186 && arg4 > 0) {
            class420 var8 = class380.field5802[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6260 != null && var8.field6260.method49(7)) {
                arg1.method61(var8.field6260, (byte) 118, arg0, -class215.field2995, true, class215.field2995, 0);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class127(String arg0, int arg1) {
        this.field1803 = arg0;
    }
}
