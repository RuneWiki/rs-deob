import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class62 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lke;")
    private static class65 field1636 = class1.method17(" has logged out)3", -128);

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lke;")
    public static class65 field1631 = class1.method17("@yel@*V", -116);

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Lke;")
    public static class65 field1634 = class1.method17("huffman", -112);

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lke;")
    public static class65 field1646 = class1.method17("Benutzen Sie die (WPasswort -=ndern(W Option", -125);

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
    public static boolean field1644 = false;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "[I")
    public static int[] field1652 = new int[50];

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lke;")
    public static class65 field1647 = class1.method17("gelb:", -114);

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lke;")
    public static class65 field1651 = class1.method17("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", -116);

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Lke;")
    public static class65 field1654 = class1.method17("Begeben Sie sich in ein freies Gebiet)1 um", -120);

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lke;")
    public static class65 field1648 = class1.method17("auf einer freien Welt zu spielen)3", -128);

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lke;")
    public static class65 field1653 = class1.method17("scrollen:", -117);

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Lke;")
    public static class65 field1655 = class1.method17("Classic", -119);

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lke;")
    public static class65 field1656 = field1636;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljd;")
    public static class58 field1630;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lae;")
    public class6 field1640;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lae;")
    public class6 field1642;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Lae;")
    public class6 field1649;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[[I")
    public static int[][] field1632;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ltd;", line = 11)
    public static final class116 method520(Throwable arg0, String arg1) {
        field1638++;
        class116 var2;
        if (arg0 instanceof class116) {
            var2 = (class116) arg0;
            var2.field2913 = var2.field2913 + ' ' + arg1;
        } else {
            var2 = new class116(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lbe;", line = 33)
    public static final class12 method521(int arg0, int arg1) {
        int var2 = 122 / ((arg1 - 49) / 36);
        field1650++;
        class12 var3 = (class12) class74.field1967.method833((byte) -53, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class60.field1620.method477(3, (byte) 127, arg0);
        class12 var5 = new class12();
        if (var4 != null) {
            var5.method67(-60, new class39(var4));
        }
        class74.field1967.method836((long) arg0, var5, true);
        return var5;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 117)
    public static void method522(int arg0) {
        field1651 = null;
        field1631 = null;
        field1655 = null;
        field1636 = null;
        field1653 = null;
        field1656 = null;
        field1654 = null;
        int var1 = 109 % ((arg0 + 46) / 52);
        field1648 = null;
        field1630 = null;
        field1632 = null;
        field1646 = null;
        field1652 = null;
        field1647 = null;
        field1634 = null;
    }
}
