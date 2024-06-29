import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class66 extends class50 {

    @OriginalMember(owner = "client!kb", name = "Qc", descriptor = "[I")
    public static int[] field1544 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!kb", name = "Rc", descriptor = "Lkc;")
    private static class67 field1545 = class19.method144("This computers address has been blocked", 88);

    @OriginalMember(owner = "client!kb", name = "Uc", descriptor = "Lkc;")
    public static class67 field1548 = field1545;

    @OriginalMember(owner = "client!kb", name = "Xc", descriptor = "Lkc;")
    public static class67 field1551 = class19.method144("Absender:", 109);

    @OriginalMember(owner = "client!kb", name = "Pc", descriptor = "Ljb;")
    public static class60 field1543 = new class60();

    @OriginalMember(owner = "client!kb", name = "dd", descriptor = "Lkc;")
    public static class67 field1557 = class19.method144("Der Anmelde)2Server ist offline)3", 112);

    @OriginalMember(owner = "client!kb", name = "ed", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!kb", name = "bd", descriptor = "Lkc;")
    private static class67 field1555 = class19.method144("Error loading your profile)3", 92);

    @OriginalMember(owner = "client!kb", name = "Zc", descriptor = "Lkc;")
    public static class67 field1553 = field1555;

    @OriginalMember(owner = "client!kb", name = "cd", descriptor = "Lkc;")
    private static class67 field1556 = class19.method144("slide:", 72);

    @OriginalMember(owner = "client!kb", name = "Yc", descriptor = "I")
    public static int field1552 = 0;

    @OriginalMember(owner = "client!kb", name = "gd", descriptor = "Lkc;")
    public static class67 field1560 = field1556;

    @OriginalMember(owner = "client!kb", name = "ad", descriptor = "I")
    public static int field1554 = -1;

    @OriginalMember(owner = "client!kb", name = "jd", descriptor = "Lkc;")
    private static class67 field1563 = class19.method144("Public chat", 90);

    @OriginalMember(owner = "client!kb", name = "fd", descriptor = "Lkc;")
    public static class67 field1559 = field1563;

    @OriginalMember(owner = "client!kb", name = "Nc", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kb", name = "Sc", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!kb", name = "Tc", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kb", name = "Wc", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!kb", name = "id", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!kb", name = "hd", descriptor = "Lta;")
    public static class119 field1561;

    @OriginalMember(owner = "client!kb", name = "Vc", descriptor = "Lac;")
    public static class4 field1549;

    @OriginalMember(owner = "client!kb", name = "Oc", descriptor = "Llc;")
    public class73 field1542;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(B)V", line = 14)
    public static void method511(byte arg0) {
        field1559 = null;
        field1560 = null;
        field1556 = null;
        field1551 = null;
        field1555 = null;
        field1543 = null;
        field1548 = null;
        field1545 = null;
        field1563 = null;
        field1557 = null;
        field1561 = null;
        field1553 = null;
        if (arg0 > -86) {
            field1555 = null;
        }
        field1544 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z", line = 39)
    public static final boolean method512(byte arg0, int arg1) {
        ++field1546;
        if (arg1 < 0) {
            return false;
        } else {
            int var2 = class69.field1650[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            if (var2 == 11) {
                return true;
            } else {
                if (arg0 >= -12) {
                    method512((byte) 3, -122);
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)Lfd;", line = 77)
    public final class39 method190(byte arg0) {
        ++field1541;
        if (this.field1542 == null) {
            return null;
        } else {
            class112 var2 = super.field1216 != -1 && ~super.field1207 == -1 ? class70.method576(12, super.field1216) : null;
            class112 var3 = ~super.field1233 == 0 || ~super.field1254 == ~super.field1233 && var2 != null ? null : class70.method576(12, super.field1233);
            class39 var4 = this.field1542.method588(super.field1188, var2, var3, super.field1224, -8880);
            if (arg0 != -93) {
                method512((byte) 101, -17);
            }
            if (var4 == null) {
                return null;
            } else {
                var4.method325();
                super.field1213 = var4.field510;
                if (super.field1194 != -1 && ~super.field1193 != 0) {
                    class39 var5 = class119.method942(super.field1194, (byte) 88).method638(super.field1193, -30);
                    if (var5 != null) {
                        class39[] var6 = new class39[] { var4, var5 };
                        var5.method340(0, -super.field1230, 0);
                        var4 = new class39(var6, 2, true);
                    }
                }
                if (this.field1542.field1707 == 1) {
                    var4.field916 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)Z", line = 160)
    public final boolean method420(byte arg0) {
        if (arg0 != -120) {
            return true;
        } else {
            ++field1547;
            return this.field1542 != null;
        }
    }
}
