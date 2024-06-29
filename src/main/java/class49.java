import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class49 {

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
    public static int field733 = 1405;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field732++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)V")
    public static final void method371(int arg0, int arg1, int arg2) {
        field735++;
        class16 var3 = class94.method753(6, 13175, (long) arg2);
        var3.method119(-115);
        var3.field237 = arg1;
        if (arg0 != 1) {
            method371(-93, -13, -50);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)Loja;")
    public static final class480 method372(int arg0, int arg1) {
        field730++;
        if (arg0 == 0) {
            if ((double) class375.field5429 == 3.0D) {
                return class28.field412;
            }
            if ((double) class375.field5429 == 4.0D) {
                return class742.field10244;
            }
            if ((double) class375.field5429 == 6.0D) {
                return class425.field6066;
            }
            if ((double) class375.field5429 >= 8.0D) {
                return class12.field192;
            }
        } else if (arg0 == 1) {
            if ((double) class375.field5429 == 3.0D) {
                return class425.field6066;
            }
            if ((double) class375.field5429 == 4.0D) {
                return class12.field192;
            }
            if ((double) class375.field5429 == 6.0D) {
                return class45.field685;
            }
            if ((double) class375.field5429 >= 8.0D) {
                return class419.field6021;
            }
        } else if (arg0 == 2) {
            if ((double) class375.field5429 == 3.0D) {
                return class45.field685;
            }
            if ((double) class375.field5429 == 4.0D) {
                return class419.field6021;
            }
            if ((double) class375.field5429 == 6.0D) {
                return class603.field8204;
            }
            if ((double) class375.field5429 >= 8.0D) {
                return class760.field10520;
            }
        }
        if (arg1 != 26925) {
            method373(-5, true, -65, null, 29, 93, -92);
        }
        return null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZILaj;III)V")
    public static final void method373(int arg0, boolean arg1, int arg2, class333 arg3, int arg4, int arg5, int arg6) {
        int var7 = 63 / ((8 - arg5) / 53);
        if (arg2 <= 0) {
            class543.method3091(arg1, arg6, arg4, arg0, arg3, (byte) -65);
        } else {
            class685.field9629 = arg0;
            class482.field6670 = arg1;
            class549.field7445 = arg3;
            class636.field8868 = arg6;
            class300.field4348 = arg4;
            class633.field8849 = null;
            class99.field1374 = 1;
            class311.field4478 = class207.field2705.method4179(44) / arg2;
            if (class311.field4478 < 1) {
                class311.field4478 = 1;
            }
        }
        field734++;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V")
    public class49(int arg0) {
        this.field736 = arg0;
    }
}
