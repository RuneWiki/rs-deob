import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class52 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static final void method353(byte arg0) {
        if (arg0 != 11) {
            method354(62, (byte) 91, -79, (class121) null);
        }
        class269.field4743.method992(arg0 - 42);
        field956++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBILng;)Lc;")
    public static final class60 method354(int arg0, byte arg1, int arg2, class121 arg3) {
        if (arg1 >= -115) {
            method354(-74, (byte) -76, 105, (class121) null);
        }
        field951++;
        return class121.method796(true, arg2, arg0, arg3) ? class185.method1254((byte) 122) : null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLeg;II)V")
    public static final void method355(int arg0, boolean arg1, class33 arg2, int arg3, int arg4) {
        field955++;
        int var5 = arg2.field537;
        int var6 = arg2.field561;
        if (arg2.field582 == 0) {
            arg2.field537 = arg2.field488;
        } else if (arg2.field582 == 1) {
            arg2.field537 = arg3 - arg2.field488;
        } else if (arg2.field582 == 2) {
            arg2.field537 = arg2.field488 * arg3 >> 14;
        } else if (arg2.field582 == 3) {
            if (arg2.field493 == 2) {
                arg2.field537 = arg2.field488 * 32 + ((arg2.field488 - 1) * arg2.field605);
            } else if (arg2.field493 == 7) {
                arg2.field537 = arg2.field488 * 115 + ((arg2.field488 - 1) * arg2.field605);
            }
        }
        if (arg2.field549 == 0) {
            arg2.field561 = arg2.field469;
        } else if (arg2.field549 == 1) {
            arg2.field561 = arg0 - arg2.field469;
        } else if (arg2.field549 == 2) {
            arg2.field561 = arg2.field469 * arg0 >> 14;
        } else if (arg2.field549 == 3) {
            if (arg2.field493 == 2) {
                arg2.field561 = (arg2.field469 - 1) * arg2.field577 + arg2.field469 * 32;
            } else if (arg2.field493 == 7) {
                arg2.field561 = (arg2.field469 - 1) * arg2.field577 + arg2.field469 * 12;
            }
        }
        if (arg2.field582 == 4) {
            arg2.field537 = arg2.field561 * arg2.field473 / arg2.field590;
        }
        if (arg4 >= -21) {
            return;
        }
        if (arg2.field549 == 4) {
            arg2.field561 = arg2.field590 * arg2.field537 / arg2.field473;
        }
        if (class111.field1875 && (client.method668(arg2) != 0 || arg2.field493 == 0)) {
            if (arg2.field561 < 5 && arg2.field537 < 5) {
                arg2.field537 = 5;
                arg2.field561 = 5;
            } else {
                if (arg2.field537 <= 0) {
                    arg2.field537 = 5;
                }
                if (arg2.field561 <= 0) {
                    arg2.field561 = 5;
                }
            }
        }
        if (arg2.field483 == 1337) {
            class153.field2628 = arg2;
        }
        if (arg1 && arg2.field621 != null && arg2.field537 != var5 || arg2.field561 != var6) {
            class61 var7 = new class61();
            var7.field1089 = arg2;
            var7.field1101 = arg2.field621;
            class31.field431.method1176(var7, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILqb;)V")
    public static final void method356(int arg0, class76 arg1) {
        if (arg0 <= 111) {
            return;
        }
        field952++;
        class57 var2 = (class57) class228.field4110.method612(arg1.field1315.method1352(65), true);
        if (var2 == null) {
            class87.method531((class102) null, arg1.field3014[0], 0, arg1, arg1.field2953[0], (class156) null, (byte) -33, class261.field4598);
        } else {
            var2.method384(0);
        }
    }
}
