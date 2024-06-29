import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class119 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Llm;")
    public static class150 field1706 = new class150(64);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method772(int arg0, int arg1) {
        if (arg1 >= -108) {
            field1706 = null;
        }
        field1708++;
        class302.field4802 = 1000 / arg0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
    public static final void method773(int arg0, int arg1) {
        field1709++;
        if (class159.field2208 == 0) {
            class138.field1903.method1861((byte) -70, arg1);
        } else {
            class186.field2825 = arg1;
        }
        int var2 = -102 / ((59 - arg0) / 49);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method774(byte arg0) {
        if (arg0 <= 78) {
            field1706 = null;
        }
        field1706 = null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Laa;")
    public static final class43 method775(int arg0, int arg1) {
        if (arg1 != -18331) {
            return null;
        }
        field1707++;
        class43 var2 = (class43) class182.field2763.method1486((long) arg0, arg1 ^ 0xC91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class241.field3783.method2050(arg1 ^ 0xFFFFB80A, arg0, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class43 var4 = class277.method1802(var3, (byte) -52);
            class182.field2763.method1489((long) arg0, arg1 ^ 0xFFFFB81B, var4);
            return var4;
        }
    }
}
