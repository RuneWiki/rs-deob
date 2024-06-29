import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class201 {

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "B")
    public static byte field3428;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[I")
    public static int[] field3431;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLlg;)Z", line = 7)
    public static final boolean method1514(byte arg0, class137 arg1) {
        if (arg0 != -19) {
            field3428 = 89;
        }
        field3430++;
        if (arg1.field2386 == 205) {
            class101.field1633 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1515(byte arg0) {
        if (class88.field1397 == 10 && class43.field680) {
            class33.method302((byte) 95, 28);
        }
        if (arg0 != -1) {
            method1515((byte) 120);
        }
        field3429++;
        if (class88.field1397 == 30) {
            class33.method302((byte) 3, 25);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 55)
    public static final void method1516(int arg0) {
        field3432++;
        if (class119.field2062 != null) {
            class218 var1 = class119.field2062;
            synchronized (class119.field2062) {
                class119.field2062 = null;
            }
        }
        if (arg0 != -31) {
            method1514((byte) 118, (class137) null);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 83)
    public static void method1517(int arg0) {
        int var1 = 49 % ((arg0 - 64) / 53);
        field3431 = null;
    }
}
