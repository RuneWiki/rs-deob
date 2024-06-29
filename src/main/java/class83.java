import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class83 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1633 = 0;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public int field1635 = 0;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Led;")
    public static class43 field1632 = class191.method1219("<col=ff7000>", false);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Led;")
    public static class43 field1638 = class191.method1219("Verbindung abgebrochen)3", false);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lka;")
    public class92 field1629;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lka;")
    public class92 field1634;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    public static int[] field1628;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
    public static int[] field1639;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method509(int arg0) {
        for (class16 var1 = (class16) class1.field31.method753(-26703); var1 != null; var1 = (class16) class1.field31.method755((byte) 116)) {
            if (var1.field239 != null) {
                var1.method68(false);
            }
        }
        if (arg0 != -1) {
            method511(5, false);
        }
        field1627++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static void method510(int arg0) {
        field1632 = null;
        if (arg0 >= 103) {
            field1639 = null;
            field1628 = null;
            field1638 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V")
    public static final void method511(int arg0, boolean arg1) {
        field1636++;
        if (arg1 && class54.method335(-758973232, arg0)) {
            class117.method744(class12.field177[arg0], 96, -1);
        }
    }
}
