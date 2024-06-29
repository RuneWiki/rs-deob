import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class79 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
    private int[] field1605;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1607 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lad;")
    public static class5 field1602 = new class5();

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lrf;")
    private static class163 field1613 = class53.method392(-128, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lrf;")
    public static class163 field1612 = field1613;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lrf;")
    public static class163 field1614 = class53.method392(-49, "<col=40ff00>");

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lrf;")
    public static class163 field1610 = class53.method392(-66, "event_opbase");

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lrf;")
    public static final class163 method541(int arg0, int arg1) {
        field1606++;
        class163 var2 = class34.method217(arg1, -121);
        if (arg0 != 13082) {
            return null;
        }
        for (int var3 = var2.method1029(119) - 3; var3 > 0; var3 -= 3) {
            var2 = class180.method1216(new class163[] { var2.method1036(var3, (byte) 125, 0), class52.field1089, var2.method1039(var3, -98) }, false);
        }
        if (var2.method1029(arg0 - 12963) > 9) {
            return class180.method1216(new class163[] { class170.field3452, var2.method1036(var2.method1029(120) - 8, (byte) 94, 0), class107.field2228, class150.field3106, var2, class210.field4090 }, false);
        } else if (var2.method1029(122) > 6) {
            return class180.method1216(new class163[] { class120.field2527, var2.method1036(var2.method1029(116) - 4, (byte) 104, 0), client.field591, class150.field3106, var2, class210.field4090 }, false);
        } else {
            return class180.method1216(new class163[] { class190.field3776, var2, class34.field667 }, false);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)I")
    public final int method542(byte arg0, int arg1) {
        field1609++;
        if (arg0 != 63) {
            return 33;
        }
        int var3 = (this.field1605.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field1605[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1605[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lrf;I)Z")
    public static final boolean method543(class163 arg0, int arg1) {
        field1604++;
        if (arg1 != -7854) {
            field1608 = 47;
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class26.field479; var2++) {
            if (arg0.method1038(class55.field1118[var2], 0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method544(byte arg0) {
        field1614 = null;
        field1612 = null;
        field1602 = null;
        field1610 = null;
        field1613 = null;
        int var1 = 105 / (arg0 / 33);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([I)V")
    public class79(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1605 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1605[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1605[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1605[var5 + var5] = arg0[var4];
            this.field1605[var5 + var5 + 1] = var4++;
        }
    }
}
