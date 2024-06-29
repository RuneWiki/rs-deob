import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class138 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Z")
    private boolean field1571 = false;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public int field1578 = 0;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1574 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "J")
    public long field1582;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Z")
    public static final boolean method769(int arg0, int arg1) {
        field1580++;
        if (arg1 <= 6) {
            method769(108, -9);
        }
        return arg0 == 2 || arg0 == 20 || arg0 == 1002 || arg0 == 50 || arg0 == 19;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILiaa;)V")
    private final void method770(int arg0, int arg1, class452 arg2) {
        if (arg0 == 1) {
            this.field1572 = arg2.method2574(-1758460248);
        } else if (arg0 == 2) {
            arg2.method2541(101);
        } else if (arg0 == 3) {
            this.field1568 = arg2.method2575((byte) -48);
            this.field1570 = arg2.method2575((byte) -48);
            this.field1586 = arg2.method2575((byte) -48);
        } else if (arg0 == 4) {
            this.field1575 = arg2.method2541(56);
            this.field1581 = arg2.method2575((byte) -48);
        } else if (arg0 == 6) {
            this.field1583 = arg2.method2541(69);
        } else if (arg0 == 8) {
            this.field1578 = 1;
        } else if (arg0 == 9) {
            this.field1574 = 1;
        } else if (arg0 == 10) {
            this.field1571 = true;
        }
        field1569++;
        if (arg1 <= 59) {
            this.field1585 = 113;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method771(int arg0) {
        this.field1585 = class285.field3656[this.field1572 << 3];
        field1587++;
        this.field1579 = (int) Math.sqrt((double) (this.field1586 * this.field1586 + (this.field1568 * this.field1568 + (this.field1570 * this.field1570))));
        if (this.field1581 == 0) {
            this.field1581 = 1;
        }
        if (arg0 != -8508) {
            return;
        }
        if (this.field1575 == 0) {
            this.field1582 = 2147483647L;
        } else if (this.field1575 == 1) {
            this.field1582 = (this.field1579 * 8 / this.field1581);
            this.field1582 *= this.field1582;
        } else if (this.field1575 == 2) {
            this.field1582 = (this.field1579 * 8 / this.field1581);
        }
        if (this.field1571) {
            this.field1579 *= -1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Liaa;Z)V")
    public final void method772(class452 arg0, boolean arg1) {
        field1576++;
        while (true) {
            int var3 = arg0.method2541(71);
            if (var3 == 0) {
                if (arg1) {
                    this.method770(-124, -50, null);
                    return;
                } else {
                    return;
                }
            }
            this.method770(var3, 75, arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BZZII)V")
    public static final void method773(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field1573++;
        class41.method214(arg3, -1, 0, arg4, arg1, class520.field7448.length - 1, arg2);
        if (arg0 <= 62) {
            method773((byte) -50, true, true, 125, -15);
        }
        class350.field4584 = 0;
        class536.field7661 = null;
    }
}
