import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class126 extends class147 {

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "Ls;")
    public static class227 field1785 = new class227(64);

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "Lqj;")
    public static class196 field1792 = class80.method502("; Max)2Age=", -48);

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "Lqj;")
    public static class196 field1794 = class80.method502("(Y<)4col>", -48);

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Lbk;")
    public static class136 field1793;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)La;")
    public static final class111 method777(byte arg0, int arg1) {
        field1789++;
        class111 var2 = (class111) class200.field3550.method1537((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class104.field1503.method842(class18.method101(arg1, (byte) 5), (byte) 38, class219.method1494(arg1, (byte) -97));
        class111 var4 = new class111();
        var4.field1631 = arg1;
        if (var3 != null) {
            var4.method664(new class56(var3), true);
        }
        var4.method673(-41);
        if (arg0 > -33) {
            return null;
        } else {
            class200.field3550.method1532(true, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lp;IB)V")
    private final void method778(class56 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field1788 = arg0.method318(true);
            this.field1783 = arg0.method367(1);
            this.field1791 = arg0.method367(1);
        }
        if (arg2 != -24) {
            method777((byte) -27, -9);
        }
        field1790++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lp;I)V")
    public final void method779(class56 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method367(arg1 - 1878366667);
            if (var3 == 0) {
                field1787++;
                if (arg1 != 1878366668) {
                    method781((byte) 93);
                    return;
                }
                return;
            }
            this.method778(arg0, var3, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I")
    public static final int method780(int arg0, int arg1) {
        field1786++;
        if (arg1 != -1832805012) {
            method781((byte) -90);
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public static void method781(byte arg0) {
        field1785 = null;
        field1794 = null;
        field1793 = null;
        if (arg0 < -122) {
            field1792 = null;
        }
    }
}
