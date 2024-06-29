import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class419 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)Laf;", line = 5)
    public static final class298 method2416(boolean arg0, int arg1) {
        field5749++;
        class298 var2 = (class298) class148.field2109.method1456((long) arg1, 125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field1648.method2708(0, arg1, (byte) 54);
        class298 var4 = new class298();
        if (var3 != null) {
            var4.method1741(new class379(var3), (byte) 96);
        }
        var4.method1742(arg0);
        class148.field2109.method1462(var4, (long) arg1, -81);
        return var4;
    }
}
