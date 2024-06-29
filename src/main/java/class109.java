import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class109 {

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lnd;")
    private class547 field1576;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Lnd;")
    private class547 field1578;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1574 = 0;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "[S")
    public static short[] field1580 = new short[256];

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Lwda;")
    private class640 field1579;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 4)
    public static final void method873(int arg0) {
        class748.field10451.method4150(class748.field10451.field10421, 1, -5);
        field1577++;
        class748.field10451.method4150(class748.field10451.field10412, 1, -5);
        class748.field10451.method4150(class748.field10451.field10426, 2, -5);
        class748.field10451.method4150(class748.field10451.field10393, 2, -5);
        class748.field10451.method4150(class748.field10451.field10386, 1, -5);
        class748.field10451.method4150(class748.field10451.field10405, 1, -5);
        class748.field10451.method4150(class748.field10451.field10392, 1, -5);
        class748.field10451.method4150(class748.field10451.field10390, 1, -5);
        class748.field10451.method4150(class748.field10451.field10406, 1, -5);
        if (arg0 > -88) {
            return;
        }
        class748.field10451.method4150(class748.field10451.field10420, 1, -5);
        class748.field10451.method4150(class748.field10451.field10410, 2, -5);
        class748.field10451.method4150(class748.field10451.field10427, 1, -5);
        class748.field10451.method4150(class748.field10451.field10414, 2, -5);
        class748.field10451.method4150(class748.field10451.field10418, 1, -5);
        class748.field10451.method4150(class748.field10451.field10389, 0, -5);
        class748.field10451.method4150(class748.field10451.field10409, 0, -5);
        class748.field10451.method4150(class748.field10451.field10436, 2, -5);
        class748.field10451.method4150(class748.field10451.field10422, 0, -5);
        class748.field10451.method4150(class748.field10451.field10416, 0, -5);
        class533.method3060(2);
        class748.field10451.method4150(class748.field10451.field10425, 0, -5);
        class748.field10451.method4150(class748.field10451.field10430, 4, -5);
        class421.method2346(true);
        class421.method2347((byte) -47);
        class508.field7164 = true;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 43)
    public static void method874(int arg0) {
        field1580 = null;
        if (arg0 != 256) {
            method873(55);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljd;I)Lnea;", line = 54)
    public final class716 method875(class233 arg0, int arg1) {
        if (arg1 != -21576) {
            return null;
        }
        field1581++;
        if (arg0 == null) {
            return null;
        }
        class223 var3 = arg0.method29(-200);
        if (class160.field2194 == var3) {
            return new class326((class6) arg0);
        } else if (class33.field549 == var3) {
            return new class616(this.method876(-121), (class342) arg0);
        } else if (class99.field1381 == var3) {
            return new class744(this.field1578, (class517) arg0);
        } else if (class479.field6521 == var3) {
            return new class332(this.field1578, (class566) arg0);
        } else if (class386.field4927 == var3) {
            return new class557(this.field1578, this.field1576, (class702) arg0);
        } else if (class89.field1240 == var3) {
            return new class443(this.field1578, this.field1576, (class258) arg0);
        } else if (class218.field2939 == var3) {
            return new class445(this.field1578, this.field1576, (class510) arg0);
        } else if (class521.field7308 == var3) {
            return new class232(this.field1578, this.field1576, (class24) arg0);
        } else if (class721.field10033 == var3) {
            return new class48(this.field1578, (class284) arg0);
        } else if (class231.field3032 == var3) {
            return new class98(this.field1578, this.field1576, (class682) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lnd;Lnd;)V", line = 110)
    public class109(class547 arg0, class547 arg1) {
        this.field1576 = arg1;
        this.field1578 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Lwda;", line = 124)
    private final class640 method876(int arg0) {
        if (this.field1579 == null) {
            this.field1579 = new class640();
        }
        field1575++;
        if (arg0 >= -119) {
            field1580 = null;
        }
        return this.field1579;
    }
}
