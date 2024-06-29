import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class401 {

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "Loo;")
    private class652 field5495 = new class652(64);

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "Lwia;")
    private class791 field5502;

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "Lbu;")
    public static class21 field5498 = new class21(37, -1);

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "Lwia;")
    public static class791 field5499;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V")
    public final void method2466(int arg0, int arg1) {
        class652 var3 = this.field5495;
        synchronized (this.field5495) {
            this.field5495.method3741(arg0, arg1);
        }
        field5497++;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)V")
    public static final void method2467(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class310.field4432[var1] = false;
        }
        field5505++;
        class375.field5176 = -1;
        class429.field5830 = -1;
        class294.field4286 = class192.field2961;
        class416.field5704 = 5;
        class398.field5472 = class546.field7862;
        class276.field4014 = -1;
        class358.field5028 = class589.field8310;
        class544.field7812 = class544.field7813;
        class274.field3972 = class614.field8619;
        class488.field6904 = 0;
        class133.field2017 = class472.field6622;
        if (arg0 < 68) {
            field5499 = null;
        }
        class591.field8329 = 0;
        class733.field10150 = -1;
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(B)V")
    public final void method2468(byte arg0) {
        class652 var2 = this.field5495;
        synchronized (this.field5495) {
            this.field5495.method3743(8);
            if (arg0 >= -16) {
                field5498 = null;
            }
        }
        field5500++;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IB)Lni;")
    public final class546 method2469(int arg0, byte arg1) {
        field5501++;
        class652 var3 = this.field5495;
        class546 var4;
        synchronized (this.field5495) {
            var4 = (class546) this.field5495.method3742((byte) 67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field5502;
        byte[] var6;
        synchronized (this.field5502) {
            var6 = this.field5502.method4339(arg0, 0, 54);
        }
        class546 var7 = new class546();
        if (var6 != null) {
            var7.method3267(new class494(var6), 0);
        }
        class652 var8 = this.field5495;
        synchronized (this.field5495) {
            int var9 = -114 / ((arg1 + 83) / 33);
            this.field5495.method3739((long) arg0, (byte) 40, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(B)V")
    public static final void method2470(byte arg0) {
        class273.field3950 = null;
        class718.field9945 = null;
        class269.field3907 = null;
        class67.field822 = null;
        class459.field6425 = null;
        class703.field9801 = null;
        class578.field8145 = null;
        class463.field6535 = null;
        class652.field9096 = null;
        class449.field6148 = null;
        class454.field6372 = null;
        class33.field447 = null;
        class530.field7673 = null;
        class413.field5628 = null;
        class564.field8003 = null;
        class84.field927 = null;
        field5496++;
        class503.field7118 = null;
        if (arg0 == 53) {
            class488.field6897 = null;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
    public final void method2471(int arg0) {
        field5503++;
        class652 var2 = this.field5495;
        synchronized (this.field5495) {
            this.field5495.method3735(2);
            if (arg0 != 11897) {
                method2473((byte) 16);
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "(B)V")
    public static void method2472(byte arg0) {
        field5498 = null;
        field5499 = null;
        if (arg0 != -123) {
            field5498 = null;
        }
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class401(class252 arg0, int arg1, class791 arg2) {
        this.field5502 = arg2;
        if (this.field5502 != null) {
            this.field5502.method4353(54, true);
        }
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(B)Z")
    public static final boolean method2473(byte arg0) {
        field5504++;
        if (class266.field3873 != 3) {
            return false;
        } else if (class632.field8877 == 0 && class339.field4745 == 0) {
            int var1 = -101 % ((21 - arg0) / 47);
            return true;
        } else {
            return false;
        }
    }
}
