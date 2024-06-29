import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class334 implements class134 {

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Ljn;")
    private class668 field4440;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Ljn;")
    private class668 field4444;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lrp;")
    private class403 field4441;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lla;")
    private class419 field4439;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)Z", line = 3)
    public static boolean method1931(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 10)
    public final void method749(int arg0) {
        if (arg0 == 27471) {
            field4443++;
            class50 var2 = class217.method1321(this.field4440, true, this.field4441.field5686);
            this.field4439 = class68.field1045.method258(var2, class495.method2878(this.field4444, this.field4441.field5686), true);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BZ)V", line = 26)
    public final void method893(byte arg0, boolean arg1) {
        if (arg0 != -61) {
            this.field4440 = null;
        }
        if (arg1) {
            int var3 = this.field4441.field5693.method3298(false, class589.field8535, this.field4441.field5691) + this.field4441.field5694;
            int var4 = this.field4441.field5688.method1080(this.field4441.field5692, class6.field60, -103) + this.field4441.field5690;
            this.field4439.method2518(this.field4441.field5689, this.field4441.field5687, 0, null, this.field4441.field5681, this.field4441.field5691, this.field4441.field5682, (byte) 127, 0, null, var4, null, this.field4441.field5692, var3, this.field4441.field5695, this.field4441.field5685);
        }
        field4437++;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 48)
    public static final void method1932(String arg0, int arg1, int arg2) {
        field4438++;
        class282.method1696(arg1 + 108);
        class693.method3908(arg1 ^ 0x76);
        class273.method1636((byte) 48);
        class315.method1845(-525564029, arg2, arg0);
        class489.method2847(-1);
        if (arg1 != 8) {
            return;
        }
        class574.method3363(0, class68.field1045);
        class531.method3127(class68.field1045, (byte) 108);
        class696.method3909(class68.field1045, class692.field9847, arg1 ^ 0x70);
        class70.method627((byte) -68);
        class48.method540(-105, class156.field1902);
        class100.method747(false);
        class231.method1399(97693160);
        if (class114.field1485 == 3) {
            class245.method1487(4, -21316);
        } else if (class114.field1485 == 7) {
            class245.method1487(8, arg1 - 21324);
        } else if (class114.field1485 == 10) {
            class245.method1487(11, -21316);
        } else if (class114.field1485 == 1 || class114.field1485 == 2) {
            class520.method3087(-111);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)Z", line = 87)
    public final boolean method753(int arg0) {
        field4445++;
        boolean var2 = true;
        if (!this.field4444.method3802(this.field4441.field5686, (byte) -120)) {
            var2 = false;
        }
        if (!this.field4440.method3802(this.field4441.field5686, (byte) 106)) {
            var2 = false;
        }
        return arg0 == -29791 ? var2 : false;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(BZ)Z", line = 113)
    public static final boolean method1933(byte arg0, boolean arg1) {
        if (arg0 > -71) {
            return false;
        }
        field4442++;
        boolean var2 = class68.field1045.method237();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class68.field1045.method321();
        } else if (!class68.field1045.method299()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class221.field2851.field4149 = arg1;
            class221.field2851.method1742(class517.field7570, -1);
            return true;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljn;Ljn;Lrp;)V", line = 149)
    public class334(class668 arg0, class668 arg1, class403 arg2) {
        this.field4440 = arg1;
        this.field4444 = arg0;
        this.field4441 = arg2;
    }
}
