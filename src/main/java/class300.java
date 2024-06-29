import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class300 implements class216 {

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lrw;")
    public class760 field4267;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lwu;")
    private class376 field4265;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field4264 = -1;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lku;")
    public static class380 field4263 = new class380();

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lhu;")
    public class133 field4266;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V", line = 4)
    public void method328(boolean arg0, byte arg1) {
        if (arg1 > -60) {
            return;
        }
        field4268++;
        if (arg0) {
            int var3 = this.field4267.field10571.method1911(this.field4266.method1036(), 0, class69.field844) + this.field4267.field10567;
            int var4 = this.field4267.field10566.method2861((byte) 98, class304.field4321, this.field4266.method1048()) + this.field4267.field10569;
            this.field4266.method1035(var3, var4);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 25)
    public final void method324(byte arg0) {
        this.field4266 = class453.method2578(this.field4267.field10575, this.field4265, true);
        if (arg0 < 34) {
            field4264 = -55;
        }
        field4262++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V", line = 36)
    public static final void method1842(int arg0, int arg1, int arg2) {
        if (arg0 > -82) {
            method1843((byte) -93);
        }
        field4259++;
        class127 var3 = class760.method4231(0, -874792672, 15);
        var3.method1010(614);
        var3.field2092 = arg2;
        var3.field2099 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lwu;Lrw;)V", line = 58)
    public class300(class376 arg0, class760 arg1) {
        this.field4267 = arg1;
        this.field4265 = arg0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z", line = 70)
    public final boolean method320(int arg0) {
        if (arg0 == 5618) {
            field4260++;
            return this.field4265.method2216(this.field4267.field10575, 107);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)I", line = 84)
    public static final int method1843(byte arg0) {
        field4270++;
        int var1 = 124 / ((arg0 - 23) / 62);
        if ((double) class744.field10350 == 3.0D) {
            return 37;
        } else if ((double) class744.field10350 == 4.0D) {
            return 50;
        } else if ((double) class744.field10350 == 6.0D) {
            return 75;
        } else if ((double) class744.field10350 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 110)
    public static void method1844(int arg0) {
        field4263 = null;
        if (arg0 != -29864) {
            method1842(19, 2, -51);
        }
    }
}
