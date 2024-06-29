import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class91 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field1660 = -1;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lke;")
    public static class256 field1663 = class316.method2202(" zuerst von Ihrer Ignorieren)2Liste(Q", 27626);

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field1666 = -1;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field1665 = -1;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "J")
    public static volatile long field1668 = 0L;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lla;")
    public static class188 field1658;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Lbi;")
    public static class200 field1662;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 6)
    public static void method676(int arg0) {
        field1662 = null;
        field1658 = null;
        if (arg0 != -1) {
            method678((byte) 55, (class119) null);
        }
        field1663 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 60)
    public static final void method677(int arg0, int arg1) {
        if (arg0 != 854) {
            method676(-121);
        }
        field1659++;
        if (arg1 == -1 || !class111.field1944[arg1]) {
            return;
        }
        class238.field4053.method1008(false, arg1);
        if (class50.field921[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class50.field921[arg1].length; var3++) {
            if (class50.field921[arg1][var3] != null) {
                if (class50.field921[arg1][var3].field3467 == 2) {
                    var2 = false;
                } else {
                    class50.field921[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class50.field921[arg1] = null;
        }
        class111.field1944[arg1] = false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLol;)V", line = 111)
    public static final void method678(byte arg0, class119 arg1) {
        class303.method2119(200000, -2605, arg1);
        field1670++;
        int var2 = -93 % ((arg0 + 14) / 35);
    }
}
