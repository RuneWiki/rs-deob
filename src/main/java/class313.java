import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class313 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[Lgh;")
    public static class222[] field4947 = new class222[14];

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 5)
    public static void method2144(byte arg0) {
        field4947 = null;
        if (arg0 != 109) {
            method2146(-32, -123);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method2145(byte arg0, int arg1) {
        if (arg0 > -33) {
            field4947 = (class222[]) null;
        }
        class75 var2 = class204.method1371(11, 7, arg1);
        field4948++;
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V", line = 29)
    public static final void method2146(int arg0, int arg1) {
        if (arg1 != 5) {
            field4947 = (class222[]) null;
        }
        field4945++;
        class75 var2 = class204.method1371(7, arg1 ^ 0x2, arg0);
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZZ)V", line = 56)
    public static final void method2147(boolean arg0, boolean arg1) {
        class22.field276 = new int[5];
        class3.field32 = new int[104];
        class138.field2143 = new int[104];
        if (arg1) {
            return;
        }
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class280.field4323 = new byte[var2][105][105];
        class174.field2662 = 99;
        class297.field4547 = new int[104];
        class173.field2641 = new byte[var2][104][104];
        class107.field1635 = new int[104];
        class274.field4218 = new int[var2][105][105];
        field4949++;
        class58.field827 = new byte[var2][104][104];
        class192.field2908 = new int[104];
        class298.field4586 = new byte[var2][104][104];
        class246.field3861 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V", line = 86)
    public static final void method2148(int arg0, int arg1) {
        field4946++;
        if (arg0 == arg1 || !class183.method1263(0, arg1)) {
            return;
        }
        class207[] var2 = class219.field3487[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class207 var4 = var2[var3];
            if (var4.field3293 != null) {
                class120 var5 = new class120();
                var5.field1845 = var4;
                var5.field1837 = var4.field3293;
                class121.method822((byte) -125, var5, 2000000);
            }
        }
    }
}
