import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 {

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Loh;")
    public static class263 field117 = class253.method1681(-120, ")1 ");

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field114 = -1;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Loh;")
    public static class263 field115 = class253.method1681(-126, "cookiehost");

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Z")
    public static boolean field118 = false;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Loh;")
    public static class263 field113 = class253.method1681(-124, ":assistreq:");

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[Lbb;")
    public static class88[] field111;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lsi;I)Lek;")
    public static final class160 method39(class194 arg0, int arg1) {
        field112++;
        if (arg1 != 4158) {
            method40(-127);
        }
        class160 var2 = new class160();
        var2.field2919 = arg0.method1294((byte) 3);
        var2.field2924 = class173.method1139((byte) -90, var2.field2919);
        return var2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static final void method40(int arg0) {
        class12.field312.method830(50);
        if (arg0 != 10495) {
            field113 = null;
        }
        field119++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Loc;")
    public static final class59 method41(byte arg0, int arg1) {
        field116++;
        class59 var2 = (class59) class105.field1984.method828(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field465.method596(-111, class50.method319(arg1, -1890609558), class55.method352(arg1, 1023));
        class59 var4 = new class59();
        if (arg0 <= 112) {
            return null;
        }
        if (var3 != null) {
            var4.method367(new class194(var3), 113);
        }
        class105.field1984.method826((long) arg1, 9815, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method42(int arg0) {
        field117 = null;
        field111 = null;
        field115 = null;
        field113 = null;
        if (arg0 != 0) {
            field118 = false;
        }
    }
}
