import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class101 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field1760 = 128;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field1762 = -1;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field1770 = 16;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field1775 = -1;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field1765 = 0;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
    public boolean field1768 = true;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Z")
    public boolean field1764 = true;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Z")
    public boolean field1774 = false;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field1772 = 8;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public int field1779 = 1190717;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1761 = "glow3:";

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1777 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Z")
    public static boolean field1778 = false;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1766 = 0;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
    public static int[] field1767;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
    public static int[] field1776;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILag;I)V", line = 27)
    public final void method663(int arg0, class202 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1317((byte) -97);
            if (var4 == 0) {
                if (arg2 >= -104) {
                    this.method664(35, -99, 47, (class202) null);
                }
                field1763++;
                return;
            }
            this.method664(-28594, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIILag;)V", line = 51)
    private final void method664(int arg0, int arg1, int arg2, class202 arg3) {
        field1771++;
        if (arg0 != -28594) {
            this.method663(-94, (class202) null, 115);
        }
        if (arg1 == 1) {
            this.field1765 = class342.method2374(arg3.method1352((byte) -118), -50);
        } else if (arg1 == 2) {
            this.field1762 = arg3.method1317((byte) -118);
        } else if (arg1 == 3) {
            this.field1762 = arg3.method1315(14289);
            if (this.field1762 == 65535) {
                this.field1762 = -1;
            }
        } else if (arg1 == 5) {
            this.field1764 = false;
        } else if (arg1 == 7) {
            this.field1775 = class342.method2374(arg3.method1352((byte) 126), arg0 ^ 0x6FCC);
        } else if (arg1 == 8) {
            class344.field5338 = arg2;
        } else if (arg1 == 9) {
            this.field1760 = arg3.method1315(14289);
        } else if (arg1 == 10) {
            this.field1768 = false;
        } else if (arg1 == 11) {
            this.field1772 = arg3.method1317((byte) -112);
        } else if (arg1 == 12) {
            this.field1774 = true;
        } else if (arg1 == 13) {
            this.field1779 = arg3.method1352((byte) 126);
        } else if (arg1 == 14) {
            this.field1770 = arg3.method1317((byte) -86);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 129)
    public static void method665(int arg0) {
        field1761 = null;
        field1777 = null;
        if (arg0 != 128) {
            field1767 = (int[]) null;
        }
        field1767 = null;
        field1776 = null;
    }
}
