import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class class316 extends class577 {

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "Lnn;")
    public static class436 field4491;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLmda;)V")
    public abstract void method152(byte arg0, class276 arg1);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z")
    public static final boolean method2025(int arg0, int arg1, int arg2) {
        if (arg0 != 256) {
            field4490 = 126;
        }
        field4488++;
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)Z")
    public static final boolean method2026(int arg0, int arg1, int arg2) {
        field4489++;
        if (arg2 >= 1000 && arg0 < 1000) {
            return true;
        } else if (arg2 >= 1000 || arg0 >= 1000) {
            return arg1 <= arg2 && arg0 >= 1000;
        } else if (class558.method3302(arg0, 1)) {
            return true;
        } else {
            return !class558.method3302(arg2, 1);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILso;)V")
    public abstract void method148(int arg0, class494 arg1);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static void method2027(int arg0) {
        if (arg0 >= -77) {
            field4490 = -60;
        }
        field4491 = null;
    }
}
