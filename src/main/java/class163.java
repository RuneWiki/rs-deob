import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class163 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lpja;")
    private class43 field2591 = new class43(64);

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lpja;")
    private class43 field2597 = new class43(100);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lgj;")
    private class662 field2592;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2593 = 100;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)V")
    public final void method1275(byte arg0, int arg1) {
        field2595++;
        class43 var3 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method265(arg1, -77);
        }
        class43 var4 = this.field2597;
        synchronized (this.field2597) {
            this.field2597.method265(arg1, -26);
        }
        if (arg0 < 59) {
            field2593 = 15;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method1276(int arg0) {
        if (arg0 != 100) {
            this.field2597 = null;
        }
        class43 var2 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method273(-20);
        }
        field2596++;
        class43 var3 = this.field2597;
        synchronized (this.field2597) {
            this.field2597.method273(-50);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lija;")
    public final class366 method1277(int arg0, int arg1) {
        field2598++;
        if (arg1 != -1) {
            this.field2597 = null;
        }
        class43 var3 = this.field2597;
        synchronized (this.field2597) {
            class366 var4 = (class366) this.field2597.method266((byte) -124, (long) arg0);
            if (var4 == null) {
                var4 = new class366(arg0);
                this.field2597.method270(var4, (long) arg0, arg1 ^ 0x7B);
            }
            return var4.method2230((byte) 119) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final void method1278(byte arg0) {
        field2599++;
        class43 var2 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method272(20);
        }
        class43 var3 = this.field2597;
        synchronized (this.field2597) {
            this.field2597.method272(20);
        }
        int var4 = 59 % ((26 - arg0) / 37);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)Lc;")
    public final class200 method1279(byte arg0, int arg1) {
        field2594++;
        class43 var3 = this.field2591;
        class200 var4;
        synchronized (this.field2591) {
            if (arg0 != 92) {
                this.field2591 = null;
            }
            var4 = (class200) this.field2591.method266((byte) -128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field2592;
        byte[] var6;
        synchronized (this.field2592) {
            var6 = this.field2592.method3732(class636.method3555(arg1, (byte) -127), 8906, class525.method2990(arg1, (byte) 82));
        }
        class200 var7 = new class200();
        var7.field3045 = this;
        var7.field3039 = arg1;
        if (var6 != null) {
            var7.method1442(new class93(var6), 115);
        }
        var7.method1439(53);
        class43 var8 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method270(var7, (long) arg1, -128);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lim;ILgj;Lgj;Lgj;)V")
    public class163(class598 arg0, int arg1, class662 arg2, class662 arg3, class662 arg4) {
        this.field2592 = arg2;
        if (this.field2592 != null) {
            int var6 = this.field2592.method3723(5) - 1;
            this.field2592.method3730((byte) 7, var6);
        }
        class647.method3630(2, arg4, false, arg3);
    }
}
