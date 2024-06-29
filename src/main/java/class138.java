import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class138 extends class180 {

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public int field1763 = -1;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Liga;")
    public static class91 field1764 = new class91(4, -1);

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "F")
    public static float field1769;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Ljava/lang/String;")
    public String field1765;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ljava/lang/String;")
    public String field1768;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static final void method921(int arg0) {
        ++field1760;
        class22.field202 = new class165();
        if (arg0 >= -46) {
            field1769 = -1.2230226F;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)Z")
    public static final boolean method922(boolean arg0) {
        ++field1761;
        try {
            class342 var1 = new class342();
            if (arg0) {
                return true;
            } else {
                byte[] var2 = var1.method2167(class734.field10129, (byte) -35);
                class84.method642((byte) -87, var2);
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static void method923(int arg0) {
        if (arg0 == -1) {
            field1764 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method924(int arg0, int arg1, byte arg2) {
        if (arg2 != 14) {
            field1769 = -0.799791F;
        }
        ++field1766;
        return class359.method2256(arg1, arg0, arg2 + 102) & (class183.method1155(arg0, (byte) -117, arg1) | ~(8192 & arg0) != -1 | class190.method1187(arg1, 59, arg0));
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)Lrr;")
    public final class410 method925(int arg0) {
        int var2 = 30 / ((50 - arg0) / 54);
        ++field1762;
        return class169.field2150[super.field2279];
    }
}
