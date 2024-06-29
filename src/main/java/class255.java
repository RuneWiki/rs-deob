import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class255 {

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Ljs;")
    private class117 field3567 = new class117();

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Lfn;")
    public static class52 field3570 = null;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lsq;")
    public static class454 field3565 = new class454(8);

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "[I")
    public static int[] field3574 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "Z")
    public static boolean field3578 = true;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field3577 = 0;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Z")
    public static boolean field3580 = true;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "Ljs;")
    private class117 field3575;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "Lfc;")
    public static class343 field3576;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "Lmi;")
    public static class413 field3573;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)I")
    public final int method1582(byte arg0) {
        if (arg0 > -127) {
            return 61;
        }
        field3572++;
        int var2 = 0;
        for (class117 var3 = this.field3567.field1640; var3 != this.field3567; var3 = var3.field1640) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)Ljs;")
    public final class117 method1583(byte arg0) {
        field3563++;
        class117 var2 = this.field3575;
        if (arg0 != -69) {
            method1585(-107, 51, 108, (class38) null);
        }
        if (this.field3567 == var2) {
            this.field3575 = null;
            return null;
        } else {
            this.field3575 = var2.field1640;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILjs;)V")
    public final void method1584(int arg0, class117 arg1) {
        if (arg0 < 63) {
            return;
        }
        field3569++;
        if (arg1.field1638 != null) {
            arg1.method738(-13002);
        }
        arg1.field1638 = this.field3567.field1638;
        arg1.field1640 = this.field3567;
        arg1.field1638.field1640 = arg1;
        arg1.field1640.field1638 = arg1;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIILws;)V")
    public static final void method1585(int arg0, int arg1, int arg2, class38 arg3) {
        int var4 = -23 / ((-arg0 - 77) / 42);
        class231.field3256[arg2][arg1] = arg3;
        field3568++;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
    public final void method1586(byte arg0) {
        field3564++;
        while (true) {
            class117 var2 = this.field3567.field1640;
            if (this.field3567 == var2) {
                if (arg0 != -25) {
                    field3578 = true;
                }
                this.field3575 = null;
                return;
            }
            var2.method738(-13002);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Ljs;")
    public final class117 method1587(int arg0) {
        field3566++;
        class117 var2 = this.field3567.field1640;
        if (arg0 != 0) {
            field3570 = null;
        }
        if (this.field3567 == var2) {
            this.field3575 = null;
            return null;
        } else {
            this.field3575 = var2.field1640;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)V")
    public static void method1588(byte arg0) {
        field3565 = null;
        field3574 = null;
        field3570 = null;
        field3576 = null;
        field3573 = null;
        if (arg0 != 104) {
            method1585(-34, 55, 90, (class38) null);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)Ljs;")
    public final class117 method1589(int arg0) {
        field3571++;
        class117 var2 = this.field3567.field1640;
        if (arg0 != 0) {
            field3578 = true;
        }
        if (this.field3567 == var2) {
            return null;
        } else {
            var2.method738(-13002);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
    public class255() {
        this.field3567.field1638 = this.field3567;
        this.field3567.field1640 = this.field3567;
    }
}
