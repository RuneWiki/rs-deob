import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class98 extends class215 {

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1770 = -1;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "Ljd;")
    public static class85 field1772 = class221.method1499(":", (byte) -92);

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "Z")
    public static boolean field1775 = true;

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "Ljd;")
    public static class85 field1774 = class221.method1499("Verbindung abgebrochen)3", (byte) -102);

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "B")
    public byte field1776;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lik;")
    public class247 field1773;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Ljd;")
    public static final class85 method690(int arg0, boolean arg1) {
        ++field1767;
        if (arg0 > 0 && arg0 <= 255) {
            if (arg1) {
                method692((byte) 56);
            }
            class85 var2 = new class85();
            var2.field1548 = new byte[1];
            var2.field1548[0] = (byte) arg0;
            var2.field1538 = 1;
            return var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)[B")
    public final byte[] method691(byte arg0) {
        ++field1768;
        if (arg0 > -57) {
            return null;
        } else if (!super.field3776 && ~this.field1773.field4224 <= ~(this.field1773.field4238.length + -this.field1776)) {
            return this.field1773.field4238;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public static void method692(byte arg0) {
        field1774 = null;
        field1772 = null;
        if (arg0 > -76) {
            field1774 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(Z)V")
    public static final void method693(boolean arg0) {
        if (!arg0) {
            field1766 = 26;
        }
        if (class168.field2886 != null) {
            class43 var1 = class168.field2886;
            synchronized (class168.field2886) {
                class168.field2886 = null;
            }
        }
        ++field1771;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)I")
    public final int method694(byte arg0) {
        ++field1769;
        if (this.field1773 == null) {
            return 0;
        } else {
            if (arg0 >= -18) {
                this.method694((byte) 69);
            }
            return this.field1773.field4224 * 100 / (this.field1773.field4238.length + -this.field1776);
        }
    }
}
