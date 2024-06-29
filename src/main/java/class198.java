import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class198 {

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "Lkga;")
    public static class520 field3079 = new class520("LIVE", 0);

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public static int field3084 = 0;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "Lat;")
    public class144 field3085;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "Llba;")
    public class198 field3078;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Ljava/lang/String;", line = 3)
    public static final String method1389(byte arg0) {
        field3080++;
        String var1 = "www";
        if (arg0 != -55) {
            field3079 = null;
        }
        if (class554.field8103 == class263.field3783) {
            var1 = "www-wtrc";
        } else if (class554.field8103 == class275.field3914) {
            var1 = "www-wtqa";
        } else if (class554.field8103 == class443.field6422) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class251.field3625 != null) {
            var2 = "/p=" + class251.field3625;
        }
        return "http://" + var1 + "." + class486.field6942.field7804 + ".com/l=" + class238.field3511 + "/a=" + class557.field8151 + var2 + "/";
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 33)
    public static final void method1390(int arg0) {
        class598.field8643 = null;
        field3081++;
        class112.method906(class597.field8633, 0, false, -1, 0, class557.field8146, 0, class465.field6689, 0);
        if (arg0 == 1438 && class598.field8643 != null) {
            class367.method2204(class456.field6557.field1647, class237.field3506, 1024, 0, 0, class597.field8633, class598.field8643, class467.field6735, class465.field6689, -1412584499);
            class598.field8643 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V", line = 52)
    public static void method1391(int arg0) {
        field3079 = null;
        if (arg0 > -17) {
            field3084 = -16;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)Llk;", line = 63)
    public static final class569 method1392(int arg0, boolean arg1, int arg2) {
        field3083++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
        if (arg2 != Integer.MIN_VALUE) {
            field3084 = 53;
        }
        return (class569) class624.field8898.method2818(arg2 ^ 0x7FFFA6ED, var3);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V", line = 88)
    public final void method1393(int arg0) {
        field3082++;
        if (class465.field6662 >= 500) {
            return;
        }
        int var2 = 40 % ((arg0 - 52) / 35);
        this.field3078 = class374.field5195;
        this.field3085 = null;
        class374.field5195 = this;
        class465.field6662++;
    }
}
