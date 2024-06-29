import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class463 extends class209 {

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
    public static int[] field6589 = new int[5];

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
    public static int[] field6582 = new int[2];

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field6591 = 1;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field6597 = 0;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Luv;")
    public static class3 field6594 = new class3(82, 7);

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Lim;")
    public static class353 field6598 = new class353(43, 4);

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "F")
    public static float field6587;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "F")
    public static float field6596;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (!arg0) {
            this.method45(-60, 9, 110);
        }
        ++field6588;
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        ++field6585;
        super.field2710.method1884(arg0, -2);
        if (!arg2) {
            field6598 = null;
        }
        super.field2710.method1909(-69, arg1);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        ++field6583;
        if (arg1 < 88) {
            this.method45(-41, 93, 64);
        }
        super.field2710.method1965(true, 127);
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static void method2673(int arg0) {
        field6598 = null;
        field6589 = null;
        if (arg0 != 2) {
            method2674(68, true);
        }
        field6594 = null;
        field6582 = null;
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Luq;)V")
    public class463(class313 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        if (arg1 <= 122) {
            this.method44((class148) null, -23, true);
        }
        ++field6584;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != -1) {
            this.method47(false, (byte) -14);
        }
        ++field6595;
        super.field2710.method1965(false, 127);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method2674(int arg0, boolean arg1) {
        if (arg1) {
            field6587 = 0.06981461F;
        }
        ++field6593;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() + -3; ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, -8 + var2.length()) + class89.field1176.method2157(class245.field3103, 4074) + " (" + var2 + ")</col>";
        } else {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class285.field3719.method2157(class245.field3103, 4074) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (arg2 >= -75) {
            method2673(-68);
        }
        ++field6592;
    }
}
