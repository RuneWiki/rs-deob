import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class105 {

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "J")
    public long field1766 = 0L;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lmb;")
    public static class96 field1761 = class243.method1708("Opened titlescreen)3", (byte) 118);

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lrf;")
    public static class30 field1756 = null;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static volatile int field1769 = 0;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1764 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lnb;")
    public class108 field1754;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lnb;")
    public class108 field1757;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method781(byte arg0) {
        if (arg0 != 99) {
            field1756 = null;
        }
        field1756 = null;
        field1761 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLrg;)V")
    public static final void method782(byte arg0, class239 arg1) {
        if (class213.field3668 != null) {
            try {
                class213.field3668.method784(-1658, 0L);
                class213.field3668.method785(arg1.field4124, (byte) 71, arg1.field4144, 24);
            } catch (Exception var2) {
            }
        }
        arg1.field4124 += 24;
        field1763++;
        if (arg0 >= -67) {
            field1764 = 109;
        }
    }
}
