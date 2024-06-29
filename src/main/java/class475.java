import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class475 {

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
    public static int[] field6920 = new int[50];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "[Lle;")
    public static class277[] field6919 = new class277[4];

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2770(int arg0, int arg1, int arg2) {
        field6922++;
        if (arg0 != 32) {
            field6920 = null;
        }
        return (arg2 & 0x70000) != 0 | class631.method3533(arg0 ^ 0x49, arg2, arg1) || class127.method732(arg2, arg1, (byte) -82);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 31)
    public static void method2771(int arg0) {
        field6920 = null;
        field6919 = null;
        if (arg0 != -11342) {
            field6919 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Lbv;", line = 43)
    public static final class276 method2772(int arg0) {
        if (arg0 != 8) {
            method2771(-105);
        }
        field6921++;
        if (class637.field9021 == null || class666.field9469 == null) {
            return null;
        }
        for (class276 var1 = (class276) class666.field9469.method3075((byte) -108); var1 != null; var1 = (class276) class666.field9469.method3075((byte) -87)) {
            class89 var2 = class637.field9013.method1972(var1.field3483, (byte) -18);
            if (var2 != null && var2.field978 && var2.method552(true, class637.field9011)) {
                return var1;
            }
        }
        return null;
    }
}
