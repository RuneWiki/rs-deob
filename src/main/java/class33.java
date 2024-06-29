import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class33 {

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static volatile int field558 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Llc;")
    public static class143 field554 = class66.method374("Fermer", -1);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Llc;")
    public static class143 field561 = class66.method374("null", -1);

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field565 = -1;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Llc;")
    public static class143 field556;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lmk;")
    public static class255 field567;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
    public static final void method221(int arg0, int arg1) {
        field566++;
        class217.field3975.method835(1, arg1);
        if (arg0 != 25964) {
            field567 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lwb;BLwb;IZ)I")
    public static final int method222(class133 arg0, byte arg1, class133 arg2, int arg3, boolean arg4) {
        field569++;
        if (arg3 == 1) {
            int var5 = arg2.field255;
            int var6 = arg0.field255;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return arg2.method793(arg1 ^ 0xF).field2963.method901(arg0.method793(arg1 ^ 0xF).field2963, (byte) -102);
        } else if (arg3 == 3) {
            if (arg2.field2327.method876((byte) -122, class184.field3350)) {
                if (arg0.field2327.method876((byte) -122, class184.field3350)) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field2327.method876((byte) -122, class184.field3350)) {
                return arg4 ? 1 : -1;
            } else {
                return arg2.field2327.method901(arg0.field2327, (byte) -102);
            }
        } else if (arg3 == 4) {
            if (arg2.method112(0)) {
                return arg0.method112(arg1 ^ 0xF) ? 0 : 1;
            } else if (arg0.method112(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg2.method109(122)) {
                return arg0.method109(105) ? 0 : 1;
            } else if (arg0.method109(123)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 6) {
            if (arg1 != 15) {
                method224(-64, (class7) null);
            }
            if (arg3 != 7) {
                return arg2.field2331 - arg0.field2331;
            } else if (arg2.method115(true)) {
                return arg0.method115(true) ? 0 : 1;
            } else if (arg0.method115(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2.method114(arg1 - 15)) {
            return arg0.method114(arg1 ^ 0xF) ? 0 : 1;
        } else if (arg0.method114(0)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field561 = null;
        field567 = null;
        field554 = null;
        if (arg0 < 120) {
            method224(-98, (class7) null);
        }
        field556 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILgf;)I")
    public static final int method224(int arg0, class7 arg1) {
        int var2 = 0;
        field559++;
        if (arg1.method40(class126.field2229, arg0 ^ 0x38C1)) {
            var2++;
        }
        if (arg1.method40(class192.field3529, arg0 ^ 0xFFFFC73B)) {
            var2++;
        }
        if (arg0 != 14508) {
            return -66;
        }
        if (arg1.method40(class115.field2019, -50)) {
            var2++;
        }
        if (arg1.method40(class267.field4791, -63)) {
            var2++;
        }
        if (arg1.method40(class225.field4076, 102)) {
            var2++;
        }
        if (arg1.method40(class36.field628, arg0 - 14392)) {
            var2++;
        }
        if (arg1.method40(class158.field2860, -115)) {
            var2++;
        }
        if (arg1.method40(class287.field5042, arg0 ^ 0x38D2)) {
            var2++;
        }
        if (arg1.method40(class248.field4459, 104)) {
            var2++;
        }
        if (arg1.method40(class35.field611, 110)) {
            var2++;
        }
        if (arg1.method40(class17.field291, -74)) {
            var2++;
        }
        if (arg1.method40(class80.field1449, -57)) {
            var2++;
        }
        if (arg1.method40(class68.field1296, -86)) {
            var2++;
        }
        if (arg1.method40(class265.field4768, arg0 - 14389)) {
            var2++;
        }
        if (arg1.method40(class137.field2404, -89)) {
            var2++;
        }
        if (arg1.method40(class229.field4193, 100)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class33() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lec;)V")
    public class33(class33 arg0) {
        this.field568 = arg0.field568;
        this.field562 = arg0.field562;
        this.field564 = arg0.field564;
        this.field563 = arg0.field563;
    }
}
