import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class103 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 7)
    public static final void method728(byte arg0) {
        while (true) {
            if (class207.field3137.method26(class3.field13, -11394) >= 11) {
                int var1 = class207.field3137.method24((byte) -122, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class241.field3592[var1] == null) {
                        class241.field3592[var1] = new class195();
                        if (class295.field4526[var1] != null) {
                            class241.field3592[var1].method1346((byte) 66, class295.field4526[var1]);
                        }
                        var2 = true;
                    }
                    class20.field239[class56.field706++] = var1;
                    class195 var3 = class241.field3592[var1];
                    var3.field1498 = class304.field4641;
                    int var4 = class207.field3137.method24((byte) -122, 1);
                    int var5 = class157.field2351[class207.field3137.method24((byte) -122, 3)];
                    if (var2) {
                        var3.field1474 = var3.field1470 = var5;
                    }
                    int var6 = class207.field3137.method24((byte) -122, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class207.field3137.method24((byte) -122, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class207.field3137.method24((byte) -122, 1);
                    if (var8 == 1) {
                        class278.field4234[class230.field3476++] = var1;
                    }
                    var3.method1348(class114.field1750.field1516[0] + var7, class114.field1750.field1541[0] + var6, (byte) 109, var4 == 1);
                    continue;
                }
            }
            field1641++;
            if (arg0 <= 45) {
                return;
            }
            class207.field3137.method27((byte) 0);
            return;
        }
    }
}
