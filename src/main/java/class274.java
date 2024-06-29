import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class274 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lqt;")
    public class309 field3960 = new class309();

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lae;")
    public static class283 field3962;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lqt;")
    private class309 field3967;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient;")
    public static client field3958;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
    public static final boolean method1783(int arg0, int arg1) {
        int var2 = 2 / ((arg0 + 58) / 39);
        field3966++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        if (arg0 == 13267) {
            field3962 = null;
            field3958 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public final void method1785(int arg0) {
        if (arg0 > -57) {
            method1784(58);
        }
        field3965++;
        while (true) {
            class309 var2 = this.field3960.field4457;
            if (this.field3960 == var2) {
                this.field3967 = null;
                return;
            }
            var2.method2002(true);
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Lqt;")
    public final class309 method1786(int arg0) {
        if (arg0 != 2) {
            return null;
        }
        field3957++;
        class309 var2 = this.field3960.field4457;
        if (this.field3960 == var2) {
            this.field3967 = null;
            return null;
        } else {
            this.field3967 = var2.field4457;
            return var2;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Lqt;")
    public final class309 method1787(int arg0) {
        if (arg0 < 16) {
            this.field3967 = null;
        }
        field3961++;
        class309 var2 = this.field3967;
        if (this.field3960 == var2) {
            this.field3967 = null;
            return null;
        } else {
            this.field3967 = var2.field4457;
            return var2;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILqt;)V")
    public final void method1788(int arg0, class309 arg1) {
        if (arg1.field4455 != null) {
            arg1.method2002(true);
        }
        field3963++;
        arg1.field4455 = this.field3960.field4455;
        arg1.field4457 = this.field3960;
        arg1.field4455.field4457 = arg1;
        arg1.field4457.field4455 = arg1;
        if (arg0 != -2) {
            field3958 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
    public final int method1789(byte arg0) {
        field3959++;
        int var2 = -3 % ((arg0 - 41) / 61);
        int var3 = 0;
        class309 var4 = this.field3960.field4457;
        while (this.field3960 != var4) {
            var4 = var4.field4457;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLsi;)I")
    public static final int method1790(byte arg0, class769 arg1) {
        field3964++;
        if (class92.field1073 == arg1) {
            return 7681;
        } else if (class785.field10763 == arg1) {
            return 8448;
        } else if (class495.field6817 == arg1) {
            return 34165;
        } else if (class587.field8280 == arg1) {
            return 260;
        } else if (class202.field2835 == arg1) {
            return 34023;
        } else if (arg0 < 26) {
            return -116;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class274() {
        this.field3960.field4455 = this.field3960;
        this.field3960.field4457 = this.field3960;
    }
}
