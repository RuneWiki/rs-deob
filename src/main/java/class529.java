import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class529 extends class305 {

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lio;")
    public static class439 field7543 = new class439(1, 2);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Ljg;")
    public static class340 field7544 = new class340();

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7548;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZBI)Les;")
    public static final class384 method3090(boolean arg0, byte arg1, int arg2) {
        if (arg1 < 15) {
            return null;
        } else {
            ++field7546;
            long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
            return (class384) class601.field8505.method2287(var3, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)Z")
    public static final boolean method3091(int arg0, int arg1) {
        int var2 = -48 / ((arg0 - -36) / 60);
        ++field7540;
        return arg1 == 3 || ~arg1 == -5;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        if (arg0 != -27751) {
            this.method303(107, 42);
        }
        super.field4320 = arg1;
        ++field7545;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lhb;)V")
    public class529(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method3092(int arg0) {
        if (arg0 != 2) {
            method3092(-64);
        }
        field7548 = null;
        field7544 = null;
        field7543 = null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)I")
    public final int method3093(int arg0) {
        ++field7542;
        if (arg0 != 17503) {
            field7544 = null;
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public static final void method3094(int arg0) {
        class647.field9122.method2289(1393);
        ++field7538;
        class132.field1776.method3503(-16);
        if (arg0 <= 32) {
            method3092(20);
        }
        class132.field1781.method3503(-16);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILhb;)V")
    public class529(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            field7544 = null;
        }
        ++field7539;
        return 1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field7541;
        if (arg0 >= -40) {
            field7544 = null;
        }
        if (super.field4323.field10194.method1326(-97) && super.field4320 == 2) {
            super.field4320 = 1;
        }
        if (super.field4320 < 0 || super.field4320 > 2) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field7547;
        if (arg0 != 68) {
            field7543 = null;
        }
        return 2;
    }
}
