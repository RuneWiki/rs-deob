import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class116 {

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "F")
    public float field1633 = 0.25F;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "F")
    public float field1631 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "F")
    public float field1632 = 1.0F;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "F")
    public float field1629;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "F")
    public float field1628;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "F")
    public float field1626;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Lk;")
    public class293 field1619;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field1621 = 104;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lap;Z)V")
    public final void method932(class289 arg0, boolean arg1) {
        field1623++;
        this.field1632 = (float) (arg0.method1861((byte) -72) * 8) / 255.0F;
        this.field1633 = (float) (arg0.method1861((byte) -72) * 8) / 255.0F;
        this.field1631 = (float) (arg0.method1861((byte) -72) * 8) / 255.0F;
        if (arg1) {
            this.field1631 = 1.0906591F;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZLao;)Z")
    public final boolean method933(boolean arg0, class116 arg1) {
        field1618++;
        if (arg0) {
            return this.field1622 == arg1.field1622 && this.field1629 == arg1.field1629 && this.field1628 == arg1.field1628 && this.field1626 == arg1.field1626 && this.field1633 == arg1.field1633 && this.field1632 == arg1.field1632 && this.field1631 == arg1.field1631 && this.field1625 == arg1.field1625 && this.field1630 == arg1.field1630 && this.field1619 == arg1.field1619;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
    public class116() {
        this.field1630 = 0;
        this.field1622 = class124.field1731;
        this.field1624 = -60;
        this.field1629 = 1.1523438F;
        this.field1628 = 0.69921875F;
        this.field1625 = class194.field2783;
        this.field1634 = -50;
        this.field1626 = 1.2F;
        this.field1620 = -50;
        this.field1619 = class6.field41;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lap;)V")
    public class116(class289 arg0) {
        int var2 = arg0.method1861((byte) -72);
        if (class385.field5429 && class387.field5450.method199() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1622 = class124.field1731;
            } else {
                this.field1622 = arg0.method1856((byte) 56);
            }
            if ((var2 & 0x2) == 0) {
                this.field1629 = 1.1523438F;
            } else {
                this.field1629 = (float) arg0.method1853(-75) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1628 = 0.69921875F;
            } else {
                this.field1628 = (float) arg0.method1853(-120) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1626 = 1.2F;
            } else {
                this.field1626 = (float) arg0.method1853(104) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1856((byte) 91);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1853(-45);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1853(123);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1853(-88);
            }
            this.field1626 = 1.2F;
            this.field1622 = class124.field1731;
            this.field1628 = 0.69921875F;
            this.field1629 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1620 = -50;
            this.field1624 = -60;
            this.field1634 = -50;
        } else {
            this.field1620 = arg0.method1833(110);
            this.field1624 = arg0.method1833(111);
            this.field1634 = arg0.method1833(80);
        }
        if ((var2 & 0x20) == 0) {
            this.field1625 = class194.field2783;
        } else {
            this.field1625 = arg0.method1856((byte) 95);
        }
        if ((var2 & 0x40) == 0) {
            this.field1630 = 0;
        } else {
            this.field1630 = arg0.method1853(-57);
        }
        if ((var2 & 0x80) == 0) {
            this.field1619 = class6.field41;
        } else {
            this.field1619 = class114.method925(0, arg0.method1853(-43), arg0.method1853(-104), arg0.method1853(-43), arg0.method1853(-24), arg0.method1853(113), arg0.method1853(120));
        }
    }
}
