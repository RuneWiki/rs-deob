import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class129 {

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lnh;")
    public static class788 field1729 = new class788();

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public int field1723;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Loha;")
    public static class465 field1724;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1724 = null;
        field1729 = null;
        if (arg0 <= 85) {
            field1730 = -30;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public static final void method762(byte arg0) throws class15 {
        field1725++;
        if (class596.field7567 == 1) {
            class699.field9263.method925(class340.field4159, class329.field4033);
        } else {
            class699.field9263.method925(0, 0);
        }
        if (arg0 >= -89) {
            field1729 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method763(int arg0, int arg1, String arg2) {
        if (arg1 < 34) {
            field1730 = -1;
        }
        field1720++;
        return class291.method1761(arg2, true, (byte) 12, arg0);
    }
}
