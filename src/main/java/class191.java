import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class191 extends class666 {

    @OriginalMember(owner = "client!rea", name = "F", descriptor = "I")
    public static int field2305 = -1;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!rea", name = "G", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!rea", name = "H", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!rea", name = "I", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!rea", name = "J", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V", line = 6)
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "(I)Z", line = 12)
    public static final boolean method1102(int arg0) {
        if (arg0 > -36) {
            field2305 = -13;
        }
        field2307++;
        return class456.field6350;
    }

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "(I)V", line = 30)
    public static final void method1103(int arg0) {
        class170.field2033.method3227((byte) -124);
        field2308++;
        if (arg0 == 0) {
            class109.field1265.method3227((byte) 45);
        }
    }

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "(III)Z", line = 42)
    public static final boolean method1104(int arg0, int arg1, int arg2) {
        if (arg0 < 3) {
            return false;
        } else {
            field2306++;
            return (arg2 & 0x580) != 0;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)[I", line = 54)
    public final int[] method122(int arg0, int arg1) {
        field2303++;
        if (arg0 > -21) {
            this.method122(40, -117);
        }
        return class579.field8246;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method1105(boolean arg0, int arg1) {
        field2309++;
        if (class511.field7325.length() == 0) {
            return;
        }
        class446.method2473("--> " + class511.field7325, (byte) 103);
        class332.method1866(arg0, false, (byte) 123, class511.field7325);
        class511.field7325 = "";
        class526.field7525 = 0;
        class665.field9460 = 0;
        int var2 = 97 % ((-arg1 - 47) / 62);
    }
}
