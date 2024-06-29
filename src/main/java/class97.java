import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class97 {

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public int field1789 = -1;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field1786;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lva;")
    public static class221 field1784;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljc;")
    public static final class101 method680(Throwable arg0, String arg1) {
        field1794++;
        class101 var2;
        if (arg0 instanceof class101) {
            var2 = (class101) arg0;
            var2.field1841 = var2.field1841 + ' ' + arg1;
        } else {
            var2 = new class101(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method681(int arg0) {
        if (arg0 != 32) {
            method680(null, null);
        }
        field1784 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
    public static final void method682(int arg0, boolean arg1) {
        class74.method581((byte) -85);
        int var2 = -17 % ((arg0 + 17) / 52);
        class48.field885++;
        field1785++;
        if (class48.field885 < 50 && !arg1) {
            return;
        }
        class48.field885 = 0;
        if (class82.field1596 || class101.field1844 == null) {
            return;
        }
        class200.field3542.method1170(4, (byte) -76);
        try {
            class101.field1844.method782(83, class200.field3542.field1219, class200.field3542.field1195, 0);
            class200.field3542.field1195 = 0;
        } catch (IOException var3) {
            class82.field1596 = true;
        }
        class63.field1174++;
    }
}
