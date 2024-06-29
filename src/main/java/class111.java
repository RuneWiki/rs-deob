import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class111 extends class86 {

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1489 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "Lcp;")
    public static class342 field1482;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field1483;
        return arg0 != 0 ? 49 : 1;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 == -65) {
            if (~super.field1200 != -2 && super.field1200 != 0) {
                super.field1200 = this.method73(arg0 ^ -65);
            }
            ++field1486;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        super.field1200 = arg0;
        ++field1481;
        if (arg1) {
            field1487 = 96;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field1488;
        return arg1 != -2 ? 58 : 1;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(ILsf;)V")
    public class111(int arg0, class551 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)I")
    public static final int method647(int arg0, int arg1, int arg2) {
        ++field1485;
        if (arg0 <= 106) {
            field1482 = null;
        }
        byte var3;
        if (arg1 <= 20000) {
            if (~arg1 >= -10001) {
                if (arg1 > 5000) {
                    class11.method46((byte) 103);
                    var3 = 2;
                } else {
                    class588.method3149(0, true);
                    var3 = 1;
                }
            } else {
                var3 = 3;
                class432.method2482(1);
            }
        } else {
            var3 = 4;
            class104.method601(110);
        }
        if (class485.field6252.field6949.method2402(false) != arg2) {
            class485.field6252.method2986(arg2, class485.field6252.field6922, (byte) 102);
            class432.method2483((byte) 76, arg2, false);
        }
        class627.method3356(41);
        return var3;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)I")
    public final int method648(boolean arg0) {
        if (arg0) {
            field1489 = null;
        }
        ++field1484;
        return super.field1200;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)V")
    public static void method649(int arg0) {
        field1489 = null;
        if (arg0 == 2) {
            field1482 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lsf;)V")
    public class111(class551 arg0) {
        super(arg0);
    }
}
