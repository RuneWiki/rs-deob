import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class98 {

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public int field1575;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "F")
    public float field1590;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "F")
    public float field1582;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "F")
    public float field1588;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lce;")
    private static class126 field1573 = class206.method1445(-7923, " from your friend list first)3");

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field1574 = 0;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static volatile int field1587 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lce;")
    public static class126 field1580 = field1573;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Lce;")
    public static class126 field1589 = class206.method1445(-7923, "Schlie-8en");

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Lie;", line = 7)
    public static final class2 method662(int arg0) {
        field1570++;
        class2 var1 = new class2(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], class190.field3255[0], class241.field4062);
        class197.method1395((byte) 127);
        return arg0 > -85 ? (class2) null : var1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 23)
    public static void method663(byte arg0) {
        field1573 = null;
        if (arg0 != -50) {
            method668((byte) 94);
        }
        field1580 = null;
        field1589 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 52)
    public static final void method664(int arg0) {
        field1579++;
        class203.field3480.method1185(1);
        if (arg0 != 4) {
            field1589 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JI)Lce;", line = 65)
    public static final class126 method665(long arg0, int arg1) {
        int var3 = 88 % ((-arg1 - 34) / 50);
        field1572++;
        return class170.method1246(arg0, 10, 0, false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lcc;ZII)[Ljk;", line = 74)
    public static final class273[] method666(class313 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field1585++;
            return class298.method2012(arg3, (byte) -110, arg0, arg2) ? class209.method1457(15285) : null;
        } else {
            return (class273[]) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 92)
    public static final void method667(int arg0, int arg1) {
        field1586++;
        if (arg1 != -1) {
            field1580 = (class126) null;
        }
        class245 var2 = class139.method1022(1, (byte) -107, arg0);
        var2.method1682(arg1 + 108);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)Z", line = 109)
    public static final boolean method668(byte arg0) {
        field1571++;
        if (class33.field477 == 0) {
            if (arg0 <= 61) {
                method667(-55, 99);
            }
            return class217.field3654.method2075(-32744);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 124)
    public class98() {
        this.field1575 = 0;
        this.field1581 = class235.field3964;
        this.field1590 = 1.1523438F;
        this.field1578 = -60;
        this.field1583 = -50;
        this.field1584 = -50;
        this.field1582 = 0.69921875F;
        this.field1576 = class235.field3967;
        this.field1588 = 1.2F;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lbb;)V", line = 140)
    public class98(class134 arg0) {
        int var2 = arg0.method948(-122);
        if ((var2 & 0x1) == 0) {
            this.field1576 = class235.field3967;
        } else {
            this.field1576 = arg0.method957(496113200);
        }
        if ((var2 & 0x2) == 0) {
            this.field1590 = 1.1523438F;
        } else {
            this.field1590 = (float) arg0.method942(true) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1582 = 0.69921875F;
        } else {
            this.field1582 = (float) arg0.method942(true) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1588 = 1.2F;
        } else {
            this.field1588 = (float) arg0.method942(true) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1578 = -60;
            this.field1584 = -50;
            this.field1583 = -50;
        } else {
            this.field1584 = arg0.method931((byte) 123);
            this.field1578 = arg0.method931((byte) 111);
            this.field1583 = arg0.method931((byte) 65);
        }
        if ((var2 & 0x20) == 0) {
            this.field1581 = class235.field3964;
        } else {
            this.field1581 = arg0.method957(496113200);
        }
        if ((var2 & 0x40) == 0) {
            this.field1575 = 0;
        } else {
            this.field1575 = arg0.method942(true);
        }
    }
}
