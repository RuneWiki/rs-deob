import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class68 extends class81 {

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Lsg;")
    private static class30 field1479 = class167.method1221((byte) 33, "glow3:");

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Lsg;")
    public static class30 field1475 = field1479;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "Lsg;")
    public static class30 field1478 = field1479;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "Lka;")
    public static class157 field1482 = new class157(16);

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "Lsg;")
    public static class30 field1494 = class167.method1221((byte) 33, "<img=1>");

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Ldl;")
    public static class31 field1492 = null;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "Lsg;")
    public static class30 field1496 = class167.method1221((byte) 33, "::clientdrop");

    @OriginalMember(owner = "client!th", name = "db", descriptor = "Lsg;")
    private static class30 field1497 = class167.method1221((byte) 33, "Started 3d Library");

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "Lsg;")
    public static class30 field1493 = field1497;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "Llk;")
    public static class232 field1495 = new class232(64);

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field1498 = -2;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Lsg;")
    public class30 field1483;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
    public static final void method606(int arg0) {
        ++field1491;
        if (class11.field217 != null) {
            class11.field217.method506((byte) 52);
        }
        if (class149.field2843 != null) {
            class149.field2843.method506((byte) 45);
        }
        class277.method1874(2, class142.field2749, arg0 + -19847, 22050);
        class11.field217 = class119.method910(0, 22050, class190.field3452, class224.field4021, -126);
        class11.field217.method500(19028, class101.field2064);
        class149.field2843 = class119.method910(1, arg0, class190.field3452, class224.field4021, arg0 + -2173);
        class149.field2843.method500(19028, class127.field2469);
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)I")
    public final int method607(int arg0) {
        ++field1489;
        if (arg0 != 13) {
            this.field1484 = 92;
        }
        return (int) (255L & super.field4215 >>> 32);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)V")
    public final void method608(boolean arg0) {
        if (!arg0) {
            super.field1743 |= Long.MIN_VALUE;
            ++field1488;
            if (~this.method614((byte) -65) == -1L) {
                class227.field4054.method535(this, (byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I")
    public static final int method609(int arg0, int arg1, int arg2, int arg3) {
        ++field1476;
        if (arg1 != 22050) {
            return 110;
        } else if (~arg0 >= ~arg3) {
            return ~arg2 <= ~arg3 ? arg3 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "i", descriptor = "(I)V")
    public final void method610(int arg0) {
        if (arg0 != 2141640544) {
            this.method610(53);
        }
        ++field1487;
        super.field1743 = class111.method874(30351) + 500L | super.field1743 & Long.MIN_VALUE;
        class46.field1062.method535(this, (byte) -79);
    }

    @OriginalMember(owner = "client!th", name = "j", descriptor = "(I)I")
    public final int method611(int arg0) {
        if (arg0 != 2048) {
            return -41;
        } else {
            ++field1485;
            return (int) super.field4215;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(II)I")
    public static int method612(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(Z)V")
    public static void method613(boolean arg0) {
        if (arg0) {
            field1495 = null;
            field1497 = null;
            field1494 = null;
            field1482 = null;
            field1493 = null;
            field1478 = null;
            field1496 = null;
            field1492 = null;
            field1479 = null;
            field1475 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)J")
    public final long method614(byte arg0) {
        ++field1481;
        if (arg0 != -65) {
            field1496 = null;
        }
        return Long.MAX_VALUE & super.field1743;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
    public class68(int arg0, int arg1) {
        super.field4215 = (long) arg0 << 32 | (long) arg1;
    }
}
