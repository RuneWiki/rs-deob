import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class333 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field5034 = 0;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field5035 = 0;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field5038;

    static {
        new class342("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I", line = 4)
    public static final int method2137(byte arg0) {
        field5033++;
        return arg0 > -123 ? 41 : 2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZIII)I", line = 21)
    public static final int method2138(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5036++;
        class328 var5 = class475.method2847(arg4, arg1, (byte) -39);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg3 != -1) {
            method2137((byte) -93);
        }
        for (int var7 = 0; var7 < var5.field4957.length; var7++) {
            if (var5.field4957[var7] >= 0 && class367.field5550.field2797 > var5.field4957[var7]) {
                class134 var8 = class367.field5550.method1312((byte) 91, var5.field4957[var7]);
                int var9 = var8.method1007(class162.field2506.method597(arg3 ^ 0xFFFFFFF4, arg2).field1062, (byte) 105, arg2);
                if (arg0) {
                    var6 += var5.field4960[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V", line = 64)
    public static final void method2139(int arg0, byte arg1) {
        if (arg1 != -44) {
            return;
        }
        field5032++;
        if (!class443.field6623.field617) {
            arg0 = -1;
        }
        if (class246.field3550 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class386 var2 = class500.field7377.method1432(arg0, true);
            class279 var3 = var2.method2387(125);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class368.field5553.method1866(var3.method1783(), var3.method1778(), (byte) -2, var3.method1785(), new Point(var2.field5817, var2.field5824), class370.field5611);
                class246.field3550 = arg0;
            }
        }
        if (arg0 == -1 && class246.field3550 != -1) {
            class368.field5553.method1866(-1, -1, (byte) -2, null, new Point(), class370.field5611);
            class246.field3550 = -1;
        }
    }
}
