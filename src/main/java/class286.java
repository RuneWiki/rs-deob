import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class286 {

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Luw;")
    public static class208 field3669 = new class208(123, 2);

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lmc;B)Lci;", line = 4)
    public static final class560 method1740(class234 arg0, byte arg1) {
        field3671++;
        int var2 = arg0.method1509(true);
        class759 var3 = class166.method1061(0)[arg0.method1509(true)];
        if (arg1 >= -2) {
            return null;
        }
        class20 var4 = class549.method2972(-2)[arg0.method1509(true)];
        int var5 = arg0.method1542(27067);
        int var6 = arg0.method1542(27067);
        int var7 = arg0.method1553((byte) -124);
        int var8 = arg0.method1553((byte) -110);
        int var9 = arg0.method1497((byte) 100);
        int var10 = arg0.method1497((byte) 58);
        int var11 = arg0.method1497((byte) 26);
        boolean var12 = arg0.method1509(true) == 1;
        return new class560(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V", line = 37)
    public static void method1741(boolean arg0) {
        field3669 = null;
        if (arg0) {
            field3669 = null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(CB)Z", line = 48)
    public static final boolean method1742(char arg0, byte arg1) {
        if (arg1 <= 83) {
            method1740(null, (byte) -102);
        }
        field3670++;
        return arg0 >= '0' && arg0 <= '9';
    }
}
