import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    public int[] field1781;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field1775;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "[B")
    public byte[] field1776;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
    public int[] field1780;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1771 = "skill: ";

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Z")
    public static boolean field1777 = true;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ltk;")
    public static class266 field1774;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[Lwd;")
    public static class88[] field1770;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)I", line = 6)
    public final int method860(int arg0, byte arg1) {
        field1783++;
        return arg1 == -77 ? this.field1776[arg0] & 0x3 : -45;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Z", line = 23)
    public final boolean method861(boolean arg0, int arg1) {
        if (!arg0) {
            field1773 = -7;
        }
        field1772++;
        return (this.field1776[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Z", line = 35)
    public final boolean method862(byte arg0, int arg1) {
        if (arg0 < 86) {
            field1771 = (String) null;
        }
        field1779++;
        return (this.field1776[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z", line = 47)
    public final boolean method863(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method861(false, -125);
        }
        field1778++;
        return (this.field1776[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 64)
    public static void method864(int arg0) {
        field1770 = null;
        field1774 = null;
        field1771 = null;
        if (arg0 != 4) {
            method864(-89);
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V", line = 97)
    public class109(int arg0) {
        this.field1782 = arg0;
        this.field1781 = new int[this.field1782];
        this.field1775 = new String[this.field1782];
        this.field1776 = new byte[this.field1782];
        this.field1780 = new int[this.field1782];
    }
}
