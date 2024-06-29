import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class93 {

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
    public static int[] field1542 = new int[5];

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lmb;")
    public static class96 field1538 = class243.method1708("Benutzen", (byte) 96);

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lmb;")
    public static class96 field1539 = class243.method1708("hitbar_default", (byte) 96);

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lka;")
    public static class174 field1534;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lff;")
    public static class3 field1533;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[Lka;")
    public static class174[] field1536;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "[S")
    public static short[] field1535;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method654(int arg0) {
        field1534 = null;
        field1535 = null;
        field1539 = null;
        field1538 = null;
        field1533 = null;
        field1536 = null;
        field1542 = null;
        if (arg0 != 0) {
            method654(59);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)V")
    public static final void method655(int arg0, byte arg1, int arg2) {
        field1544++;
        if (arg1 < 6) {
            method654(36);
        }
        class43 var3 = class270.method1847(arg0, -10277, 5);
        var3.method333(83);
        var3.field740 = arg2;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)Lmb;")
    public static final class96 method656(byte arg0, int arg1) {
        field1537++;
        if (arg0 == 66) {
            return class192.field3316[arg1].method707(-66) <= 0 ? class208.field3586[arg1] : class36.method289(-5615, new class96[] { class208.field3586[arg1], class89.field1467, class192.field3316[arg1] });
        } else {
            return null;
        }
    }
}
