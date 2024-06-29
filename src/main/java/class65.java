import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class65 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lcd;")
    private static class23 field1537 = class54.method414("yellow:", -1);

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lcd;")
    public static class23 field1539 = field1537;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Lcd;")
    public static class23 field1541 = class54.method414("Bitte laden Sie die Seite neu)3", -1);

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
    public static int[] field1544 = new int[200];

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Lcd;")
    public static class23 field1545 = field1537;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "Lcd;")
    private static class23 field1546 = class54.method414("You need a members account to login to this world)3", -1);

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Lcd;")
    public static class23 field1538 = field1546;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lcd;")
    public static class23 field1536 = class54.method414("Anmelde)2Limit -Uberschritten)3", -1);

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lcd;")
    public static class23 field1542 = class54.method414("<img=1>", -1);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1535 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Z")
    public static boolean field1540;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
    public static final int method484(int arg0) {
        field1543++;
        if (arg0 >= -90) {
            field1545 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method485(int arg0) {
        field1538 = null;
        field1536 = null;
        field1545 = null;
        field1541 = null;
        field1539 = null;
        field1537 = null;
        field1542 = null;
        field1546 = null;
        if (arg0 > 4) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Llf;")
    public static final class104 method486(int arg0, byte arg1) {
        field1534++;
        class104 var2 = (class104) class110.field2332.method995(101, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class89.field1913.method651(4, arg0, 6);
        class104 var4 = new class104();
        if (arg1 != -66) {
            return null;
        }
        var4.field2222 = arg0;
        if (var3 != null) {
            var4.method687((byte) -53, new class189(var3));
        }
        var4.method680(arg1 ^ 0xFFFFFFCE);
        if (var4.field2252) {
            var4.field2224 = 0;
            var4.field2217 = false;
        }
        class110.field2332.method990(var4, (long) arg0, -13);
        return var4;
    }
}
