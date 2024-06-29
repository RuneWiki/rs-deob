import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class281 {

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lq;")
    public class134 field4646 = new class134();

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[I")
    public static int[] field4648 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Ljg;")
    public static class177 field4643 = new class177();

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lq;")
    private class134 field4653;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lq;")
    public final class134 method1951(int arg0) {
        if (arg0 <= 88) {
            this.method1959(-70);
        }
        class134 var2 = this.field4646.field2108;
        field4651++;
        if (this.field4646 == var2) {
            this.field4653 = null;
            return null;
        } else {
            this.field4653 = var2.field2108;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lq;I)V")
    public final void method1952(class134 arg0, int arg1) {
        field4654++;
        if (arg0.field2108 != null) {
            arg0.method900(91);
        }
        arg0.field2104 = this.field4646;
        arg0.field2108 = this.field4646.field2108;
        if (arg1 == 76) {
            arg0.field2108.field2104 = arg0;
            arg0.field2104.field2108 = arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lkk;III)V")
    public static final void method1953(class254 arg0, int arg1, int arg2, int arg3) {
        field4650++;
        if (class138.field2135 != null || class220.field3525 || arg0 == null || class99.method641((byte) -111, arg0) == null) {
            return;
        }
        class138.field2135 = arg0;
        class197.field3130 = class99.method641((byte) -78, arg0);
        class82.field1304 = arg2;
        class246.field3927 = false;
        class60.field919 = arg3;
        class52.field702 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public final void method1954(byte arg0) {
        if (arg0 < 126) {
            return;
        }
        field4645++;
        while (true) {
            class134 var2 = this.field4646.field2104;
            if (this.field4646 == var2) {
                this.field4653 = null;
                return;
            }
            var2.method900(47);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Lq;")
    public final class134 method1955(int arg0) {
        field4652++;
        class134 var2 = this.field4653;
        if (this.field4646 == var2) {
            this.field4653 = null;
            return null;
        }
        if (arg0 != 155) {
            field4643 = null;
        }
        this.field4653 = var2.field2108;
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Lq;")
    public final class134 method1956(int arg0) {
        field4647++;
        if (arg0 < 70) {
            this.field4646 = null;
        }
        class134 var2 = this.field4653;
        if (this.field4646 == var2) {
            this.field4653 = null;
            return null;
        } else {
            this.field4653 = var2.field2104;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILq;)V")
    public final void method1957(int arg0, class134 arg1) {
        if (arg1.field2108 != null) {
            arg1.method900(105);
        }
        arg1.field2104 = this.field4646.field2104;
        if (arg0 <= 65) {
            field4648 = null;
        }
        arg1.field2108 = this.field4646;
        arg1.field2108.field2104 = arg1;
        field4640++;
        arg1.field2104.field2108 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
    public static void method1958(byte arg0) {
        field4643 = null;
        field4648 = null;
        int var1 = -92 % ((63 - arg0) / 60);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Lq;")
    public final class134 method1959(int arg0) {
        if (arg0 != 205) {
            this.method1959(117);
        }
        field4641++;
        class134 var2 = this.field4646.field2104;
        if (this.field4646 == var2) {
            this.field4653 = null;
            return null;
        } else {
            this.field4653 = var2.field2104;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)Lq;")
    public final class134 method1960(byte arg0) {
        field4642++;
        class134 var2 = this.field4646.field2104;
        if (arg0 >= -97) {
            field4643 = null;
        }
        if (this.field4646 == var2) {
            return null;
        } else {
            var2.method900(25);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class281() {
        this.field4646.field2104 = this.field4646;
        this.field4646.field2108 = this.field4646;
    }
}
