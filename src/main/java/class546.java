import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class546 {

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Z")
    public boolean field7547;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "F")
    public static float field7540;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lra;")
    public class118 field7542;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lra;")
    public class118 field7546;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    public boolean field7550;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
    public final boolean method3143(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field7545++;
            return this.field7550 && !this.field7547;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
    public static final void method3144(String arg0, int arg1, boolean arg2, int arg3) {
        field7544++;
        class325.method2104(102);
        class114.method839(-127);
        class171.method1154(-1);
        class133.method940(arg3, arg2, arg0, 3);
        class323.method2092(32311);
        class230.method1448(class375.field5490, (byte) -6);
        class687.method3767(class375.field5490, false);
        class65.method431(class490.field6826, -63, class375.field5490);
        class772.method4245(30003);
        class439.method2624(class603.field8192, 5689);
        if (arg1 != -2) {
            return;
        }
        class166.method1137(false);
        class380.method2369((byte) 22);
        if (class780.field10712 == 3) {
            class170.method1148(4, arg1 ^ 0x2BE7);
        } else if (class780.field10712 == 7) {
            class170.method1148(8, -11239);
        } else if (class780.field10712 == 10) {
            class170.method1148(11, arg1 - 11237);
        } else if (class780.field10712 == 1 || class780.field10712 == 2) {
            class437.method2622(-75);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method3145(int arg0) {
        if (this.field7542 != null) {
            this.field7542.method851(-21765);
        }
        field7549++;
        if (arg0 != 8) {
            field7540 = -1.1356602F;
        }
        this.field7550 = false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3146(String arg0, byte arg1) {
        if (arg1 != 30) {
            method3147((byte) -82);
        }
        field7543++;
        return class10.field111.containsKey(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Z)V")
    public class546(boolean arg0) {
        this.field7547 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)[Lgm;")
    public static final class134[] method3147(byte arg0) {
        if (arg0 <= 87) {
            method3144(null, 125, false, -91);
        }
        field7548++;
        return new class134[] { class222.field2884, class740.field10026, class720.field9788, class416.field6001, class135.field1836, class640.field8632 };
    }
}
