import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class124 extends class561 {

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Ldb;")
    public class150 field1544;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field1543 = -1;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public static int field1546 = -1;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field1545 = -1;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZ)V")
    public static final void method669(int arg0, int arg1, int arg2, boolean arg3) {
        field1547++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class553.field7739 = arg0;
        class10.field98 = arg1;
        class85.field1155 = arg3;
        if (arg2 >= -33) {
            field1545 = 126;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLjq;II)V")
    public static final void method670(int arg0, boolean arg1, class447 arg2, int arg3, int arg4) {
        if (arg0 != -20823) {
            return;
        }
        field1542++;
        int var5 = arg2.field6330;
        if (arg2.field6299 == 0) {
            arg2.field6330 = arg2.field6215;
        } else if (arg2.field6299 == 1) {
            arg2.field6330 = arg4 - arg2.field6215;
        } else if (arg2.field6299 == 2) {
            arg2.field6330 = arg2.field6215 * arg4 >> 14;
        }
        int var6 = arg2.field6218;
        if (arg2.field6222 == 0) {
            arg2.field6218 = arg2.field6339;
        } else if (arg2.field6222 == 1) {
            arg2.field6218 = arg3 - arg2.field6339;
        } else if (arg2.field6222 == 2) {
            arg2.field6218 = arg2.field6339 * arg3 >> 14;
        }
        if (arg2.field6299 == 4) {
            arg2.field6330 = arg2.field6316 * arg2.field6218 / arg2.field6261;
        }
        if (arg2.field6222 == 4) {
            arg2.field6218 = arg2.field6330 * arg2.field6261 / arg2.field6316;
        }
        if (class427.field5824 && (client.method3572(arg2).field6885 != 0 || arg2.field6336 == 0)) {
            if (arg2.field6218 < 5 && arg2.field6330 < 5) {
                arg2.field6330 = 5;
                arg2.field6218 = 5;
            } else {
                if (arg2.field6218 <= 0) {
                    arg2.field6218 = 5;
                }
                if (arg2.field6330 <= 0) {
                    arg2.field6330 = 5;
                }
            }
        }
        if (class548.field7627 == arg2.field6325) {
            class381.field5334 = arg2;
        }
        if (arg1 && arg2.field6189 != null && arg2.field6330 != var5 || arg2.field6218 != var6) {
            class9 var7 = new class9();
            var7.field81 = arg2.field6189;
            var7.field77 = arg2;
            class225.field2879.method3181(var7, true);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Ldb;)V")
    public class124(class150 arg0) {
        this.field1544 = arg0;
    }
}
