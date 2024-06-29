import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class309 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Leha;")
    public static class91 field4066 = new class91();

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field4068 = -1;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4072 = -1;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2) {
        if (arg1 != 52) {
            method1855(26, -30, -66);
        }
        field4071++;
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lpc;")
    public static final class672 method1856(int arg0, int arg1) {
        field4070++;
        class672 var2 = (class672) class237.field3088.method3962(arg1 + 81, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class329.field4206.method3153(0, 0, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else if (arg1 == -2) {
            class672 var4;
            try {
                var4 = class593.method3359(var3, true);
            } catch (Exception var6) {
                throw new RuntimeException(var6.getMessage() + " S: " + arg0);
            }
            class237.field3088.method3966(1667, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)Z")
    public static final boolean method1857(int arg0, int arg1, int arg2) {
        if (arg1 == -29742) {
            field4067++;
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4066 = null;
        if (arg0 <= 61) {
            field4066 = null;
        }
    }
}
