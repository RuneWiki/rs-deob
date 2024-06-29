import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class212 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[[[Lli;")
    public static class18[][][] field3557 = new class18[4][104][104];

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lbd;")
    public static class162 field3560 = class17.method142(0, "Cabbage");

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3559 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field3566 = -1;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lbd;")
    private static class162 field3564 = class17.method142(0, "Loaded interfaces");

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lbd;")
    public static class162 field3563 = field3564;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lda;")
    public static class143 field3561;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lda;Lda;ILhb;Lda;)Z", line = 14)
    public static final boolean method1552(class143 arg0, class143 arg1, int arg2, class280 arg3, class143 arg4) {
        class317.field5342 = arg1;
        class203.field3436 = arg0;
        class282.field4793 = arg4;
        class48.field764 = arg3;
        if (arg2 != -3112) {
            method1553((byte) 53);
        }
        field3565++;
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 30)
    public static void method1553(byte arg0) {
        if (arg0 != 124) {
            field3561 = (class143) null;
        }
        field3561 = null;
        field3557 = (class18[][][]) null;
        field3560 = null;
        field3564 = null;
        field3563 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLda;BLda;)V", line = 55)
    public static final void method1554(boolean arg0, class143 arg1, byte arg2, class143 arg3) {
        class211.field3555 = arg1;
        field3567++;
        class73.field1167 = arg0;
        class244.field4052 = arg3;
        if (arg2 != -101) {
            method1554(true, (class143) null, (byte) -116, (class143) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILda;I)Z", line = 69)
    public static final boolean method1555(int arg0, class143 arg1, int arg2) {
        byte[] var3 = arg1.method1137((byte) -122, arg2);
        if (arg0 <= 52) {
            method1553((byte) -81);
        }
        field3558++;
        if (var3 == null) {
            return false;
        } else {
            class178.method1345(120, var3);
            return true;
        }
    }
}
