import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class139 {

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field1760 = 104;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "[I")
    public static int[] field1759 = new int[8];

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "Luv;")
    public static class3 field1763 = new class3(17, 8);

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
    public static void method734(byte arg0) {
        if (arg0 == 25) {
            field1759 = null;
            field1763 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZII)Z")
    public static final boolean method735(boolean arg0, int arg1, int arg2) {
        field1762++;
        if (!arg0) {
            method734((byte) 102);
        }
        return (arg1 & 0x800) != 0 | class500.method2797(29908, arg1, arg2) || class105.method578(arg2, true, arg1);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V")
    public static final void method736(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7896 != null) {
            var3.field7896 = null;
        }
        if (var3.field7884 != null) {
            var3.field7884 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BLsm;)I")
    public static final int method737(byte arg0, class577 arg1) {
        field1764++;
        if (arg0 < 117) {
            method735(true, 50, -125);
        }
        if (class509.field7093 == arg1) {
            return 7681;
        } else if (class443.field6123 == arg1) {
            return 8448;
        } else if (class550.field7639 == arg1) {
            return 34165;
        } else if (class505.field7041 == arg1) {
            return 260;
        } else if (class334.field4669 == arg1) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
