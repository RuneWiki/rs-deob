import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class127 extends class134 {

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "[Lufa;")
    public static class680[] field1664;

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lkda;)V")
    public class127(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)Z")
    public final boolean method811(int arg0) {
        if (arg0 != -1) {
            field1664 = null;
        }
        ++field1665;
        return true;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field1662;
        if (~arg0 != -1 && super.field1712.field5499.method249((byte) 126) != 1) {
            if (arg1 != 29053) {
                field1664 = null;
            }
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 <= 118) {
            field1664 = null;
        }
        ++field1663;
        if (~super.field1708 != -1 && super.field1712.field5499.method249((byte) 122) != 1) {
            super.field1708 = 0;
        }
        if (super.field1708 < 0 || ~super.field1708 < -2) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        if (arg0 != 0) {
            return 81;
        } else {
            ++field1668;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public static void method812(int arg0) {
        field1664 = null;
        if (arg0 >= -90) {
            method812(69);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)I")
    public final int method813(byte arg0) {
        if (arg0 < 119) {
            field1664 = null;
        }
        ++field1667;
        return super.field1708;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        int var3 = -63 % ((arg0 - -26) / 41);
        super.field1708 = arg1;
        ++field1666;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(ILkda;)V")
    public class127(int arg0, class391 arg1) {
        super(arg0, arg1);
    }
}
