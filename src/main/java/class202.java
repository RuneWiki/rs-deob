import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class202 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3572 = -1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)V")
    public static final void method1421(int arg0, int arg1, byte arg2) {
        if (arg2 > -31) {
            method1421(43, -42, (byte) -107);
        }
        field3571++;
        if (class16.field365 != 0 && arg1 != -1) {
            class204.method1434(class16.field365, arg1, (byte) 100, 0, false, class51.field878);
            class110.field1978 = true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1422(int arg0, boolean arg1) {
        field3573++;
        if (class128.field2237[arg0]) {
            return true;
        } else if (class252.field4520.method1540(arg0, 0)) {
            int var2 = class252.field4520.method1533((byte) 87, arg0);
            if (var2 == 0) {
                class128.field2237[arg0] = true;
                return true;
            }
            if (class99.field1839[arg0] == null) {
                class99.field1839[arg0] = new class245[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class99.field1839[arg0][var3] == null) {
                    byte[] var4 = class252.field4520.method1546(var3, (byte) -100, arg0);
                    if (var4 != null) {
                        class99.field1839[arg0][var3] = new class245();
                        class99.field1839[arg0][var3].field4362 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class99.field1839[arg0][var3].method1715(1, new class14(var4));
                        } else {
                            class99.field1839[arg0][var3].method1710(new class14(var4), (byte) -72);
                        }
                    }
                }
            }
            class128.field2237[arg0] = arg1;
            return true;
        } else {
            return false;
        }
    }
}
