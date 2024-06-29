import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class66 extends class352 {

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field977 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "Luc;")
    public static class51 field981 = new class51(4);

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "B")
    public byte field974;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Lfb;")
    public class341 field972;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I", line = 7)
    public final int method565(int arg0) {
        ++field979;
        if (this.field972 == null) {
            return 0;
        } else {
            return arg0 != 0 ? 119 : this.field972.field5049 * 100 / (this.field972.field5042.length - this.field974);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V", line = 25)
    public static final void method566(boolean arg0, boolean arg1) {
        ++field976;
        if (arg0) {
            field977 = null;
        }
        if (arg1 == !class71.field1013) {
            class71.field1013 = arg1;
            class246.method1609(true);
        }
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)V", line = 50)
    public static void method567(int arg0) {
        field977 = null;
        if (arg0 >= 96) {
            field981 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "(I)V", line = 62)
    public static final void method568(int arg0) {
        ++field980;
        if (class126.field1647.method521()) {
            class359.method2361(15816);
            class126.field1647.method482(class422.field6138);
            class274.method1812(-1695);
        } else {
            class169.method1127((byte) -66, class397.field5796);
        }
        if (arg0 != 100) {
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)[B", line = 81)
    public final byte[] method569(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field973;
            if (!super.field5227 && ~(this.field972.field5042.length + -this.field974) >= ~this.field972.field5049) {
                return this.field972.field5042;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I", line = 109)
    public static final int method570(byte arg0, int arg1) {
        if (class290.field4380 != null) {
            class290.field4380.method2360((byte) 124);
            class290.field4380 = null;
        }
        if (arg0 != -56) {
            method566(false, true);
        }
        ++field975;
        ++class362.field5361;
        if (~class362.field5361 < -5) {
            class362.field5361 = 0;
            class258.field3804 = 0;
            return arg1;
        } else {
            class258.field3804 = 0;
            if (~class341.field5058 != ~class112.field1451) {
                class112.field1451 = class341.field5058;
            } else {
                class112.field1451 = class208.field2832;
            }
            return -1;
        }
    }
}
