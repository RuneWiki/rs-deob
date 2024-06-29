import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class435 extends class379 {

    @OriginalMember(owner = "client!za", name = "j", descriptor = "Llja;")
    public static class744 field5742 = new class744(19, 3);

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Llf;")
    public static class251 field5743 = new class251(1, 2);

    @OriginalMember(owner = "client!za", name = "h", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 5)
    public static void method2572(byte arg0) {
        int var1 = -39 % ((-arg0 - 55) / 58);
        field5743 = null;
        field5742 = null;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([BI)Z", line = 19)
    public static final boolean method2573(byte[] arg0, int arg1) {
        field5741++;
        class403 var2 = new class403(arg0);
        int var3 = var2.method2396((byte) -123);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2396((byte) 116) == 1;
        if (var4) {
            class78.method712(var2, -2);
        }
        class398.method2333(arg1 ^ 0xFFFFB82B, var2);
        return arg1 == 18389 ? true : true;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZZ)V", line = 44)
    public static final void method2574(boolean arg0, boolean arg1) {
        if (!arg1) {
            method2572((byte) -113);
        }
        field5740++;
        int var2 = class450.field6365;
        int var3 = class275.field3223;
        if (arg0 && class502.field7084) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class363.field4526.method606(var3, var2);
    }
}
