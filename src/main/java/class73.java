import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Llc;")
    public static class69 field1623 = class69.method470((byte) -120, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Llc;")
    public static class69 field1628 = class69.method470((byte) -98, ")3");

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Llc;")
    public static class69 field1631 = class69.method470((byte) -117, "b12_full");

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Llc;")
    public static class69 field1633 = class69.method470((byte) -115, "Connecting to friendserver");

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field1627 = -1;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Llc;")
    public static class69 field1636 = class69.method470((byte) -112, "Login");

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
    public static int[] field1637 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Llc;")
    public static class69 field1635 = class69.method470((byte) -113, "@gr1@");

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Llc;")
    public static class69 field1634 = class69.method470((byte) -95, "Close");

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
    public static int[] field1632 = new int[4000];

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Z")
    public static boolean field1639 = false;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lea;")
    public class26 field1630;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lea;")
    public class26 field1638;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lea;")
    public class26 field1641;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method515(byte arg0) {
        field1637 = null;
        field1632 = null;
        field1631 = null;
        field1636 = null;
        field1633 = null;
        field1623 = null;
        field1635 = null;
        if (arg0 == 35) {
            field1634 = null;
            field1628 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
    public static final void method516(byte arg0, int arg1) {
        field1643++;
        if (!class50.method334((byte) 75, arg1)) {
            return;
        }
        class9[] var2 = class106.field2310[arg1];
        if (arg0 < 104) {
            field1631 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class9 var4 = var2[var3];
            if (var4 != null) {
                var4.field162 = 0;
                var4.field147 = 0;
            }
        }
    }
}
