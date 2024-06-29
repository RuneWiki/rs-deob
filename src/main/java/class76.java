import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lva;")
    private static class121 field1745 = class107.method797("Please wait 1 minute and try again)3", -10983);

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lva;")
    public static class121 field1746 = field1745;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1742 = 1;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lva;")
    private static class121 field1741 = class107.method797("Malformed login packet)3", -10983);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lva;")
    public static class121 field1744 = field1745;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lva;")
    public static class121 field1750 = field1741;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lva;")
    public static class121 field1752 = field1745;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Li;")
    public static class48 field1749 = new class48(50);

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[J")
    public static long[] field1754 = new long[32];

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lva;")
    public static class121 field1753 = class107.method797("backbase1", -10983);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
    public static int[] field1740;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Lwa;", line = 3)
    public static final class126 method526(int arg0, boolean arg1) {
        field1739++;
        class126 var2 = (class126) class96.field2151.method345(107, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return null;
        } else {
            byte[] var3 = class34.field828.method315(16, true, arg0);
            class126 var4 = new class126();
            if (var3 != null) {
                var4.method986(new class113(var3), (byte) -119);
            }
            class96.field2151.method350((byte) 123, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 52)
    public static final void method527(boolean arg0) {
        field1748++;
        if (!arg0) {
            method527(true);
        }
        class121.field2825.method347(true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 66)
    public static void method528(int arg0) {
        field1750 = null;
        field1746 = null;
        if (arg0 != -15356) {
            method528(58);
        }
        field1741 = null;
        field1753 = null;
        field1740 = null;
        field1744 = null;
        field1754 = null;
        field1752 = null;
        field1749 = null;
        field1745 = null;
    }
}
