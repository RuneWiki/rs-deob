import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class330 extends class435 {

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4563 = "";

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
    public static int field4562 = 1;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
    public final boolean method1952(boolean arg0) {
        if (arg0) {
            this.method1953(false);
        }
        field4564++;
        return ((this.field4572 & 0x2EB632) >> 21) != 0;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)Z")
    public final boolean method1953(boolean arg0) {
        if (!arg0) {
            this.method1953(true);
        }
        field4565++;
        return (this.field4572 & 0x49253E) >> 22 != 0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZ)Z")
    public final boolean method1954(int arg0, boolean arg1) {
        if (!arg1) {
            field4562 = 122;
        }
        field4561++;
        return (this.field4572 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lhw;Z)V")
    public static final void method1955(class270 arg0, boolean arg1) {
        field4568++;
        if (arg1) {
            field4563 = null;
        }
        class693 var2 = (class693) class260.field3749.method2818(-22803, (long) arg0.field2427);
        if (var2 == null) {
            class531.method3125(null, arg0, arg0.field3158, 2, arg0.field2459[0], arg0.field2454[0], 0, null);
        } else {
            var2.method3908(93);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
    public final int method1956(int arg0) {
        if (arg0 != 528944786) {
            this.method1956(11);
        }
        field4570++;
        return this.field4572 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
    public static final void method1957(byte arg0) {
        field4571++;
        if (arg0 <= -89 && class230.field3406 != null) {
            class406.field5827 = new class26();
            class406.field5827.method249((byte) -118, class230.field3406.field7540.method2059(class238.field3511, true), class173.field2789, class230.field3406.field7534, class230.field3406);
            class260.field3751 = new Thread(class406.field5827, "");
            class260.field3751.start();
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(II)V")
    public class330(int arg0, int arg1) {
        this.field4572 = arg0;
        this.field4567 = arg1;
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)I")
    public final int method1958(byte arg0) {
        field4569++;
        int var2 = 124 % ((-arg0 - 59) / 55);
        return class500.method2992(-30141, this.field4572);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V")
    public static void method1959(int arg0) {
        int var1 = -68 % ((-arg0 - 38) / 48);
        field4563 = null;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(Z)Z")
    public final boolean method1960(boolean arg0) {
        if (arg0) {
            this.method1952(false);
        }
        field4566++;
        return (this.field4572 & 0x1) != 0;
    }
}
