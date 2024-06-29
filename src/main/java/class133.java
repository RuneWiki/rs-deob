import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class133 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Z")
    private static boolean field1576 = false;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    private static int field1578 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lqia;")
    private static class547 field1577 = new class547();

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V", line = 3)
    public static final synchronized void method839(int arg0, boolean arg1) {
        if (arg0 > 123) {
            field1576 = arg1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 15)
    public static final synchronized void method840(boolean arg0) {
        if (!arg0) {
            method842(110);
        }
        field1578++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILe;)V", line = 35)
    public static final synchronized void method841(int arg0, class752 arg1) {
        if (field1576) {
            return;
        }
        if (arg0 != 0) {
            method840(true);
        }
        if (field1578 <= 0) {
            arg1.method414(false);
        } else {
            class693 var2 = new class693();
            var2.field9818 = arg1;
            field1577.method3110(var2, 1);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 62)
    public static final synchronized void method842(int arg0) {
        int var1 = 34 % ((arg0 + 76) / 48);
        while (true) {
            class693 var2 = (class693) field1577.method3115(1210318848);
            if (var2 == null) {
                return;
            }
            var2.field9818.method414(true);
            var2.method3426((byte) -34);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 82)
    public static final synchronized void method843(int arg0) {
        field1578--;
        if (field1578 == 0) {
            method842(-128);
        }
        if (arg0 < 5) {
            method843(118);
        }
    }
}
