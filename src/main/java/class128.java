import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class128 {

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public int field1627 = 0;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "Z")
    public boolean field1629 = true;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    public int field1630 = 1190717;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field1624 = 64;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public int field1634 = -1;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Z")
    public boolean field1635 = false;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public int field1638 = 8;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Z")
    public boolean field1636 = true;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public int field1639 = -1;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public int field1640 = 127;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public int field1641 = 512;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "[F")
    public static float[] field1623 = new float[16];

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public int field1631;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Lkg;")
    public class247 field1628;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method874(int arg0) {
        field1637++;
        if (arg0 == 930002824) {
            this.field1638 = this.field1638 << 8 | this.field1631;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lun;Z)Lvo;")
    public static final class39 method875(class389 arg0, boolean arg1) {
        field1625++;
        if (arg1) {
            field1633 = -47;
        }
        int var2 = arg0.method2255(255);
        return new class39(var2);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lun;I)V")
    public final void method876(class389 arg0, int arg1) {
        if (arg1 != 9200) {
            method875(null, false);
        }
        while (true) {
            int var3 = arg0.method2229(255);
            if (var3 == 0) {
                field1632++;
                return;
            }
            this.method877(var3, arg1 - 20930, arg0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILun;)V")
    private final void method877(int arg0, int arg1, class389 arg2) {
        if (arg0 == 1) {
            this.field1627 = class664.method3752(2, arg2.method2258(-3));
        } else if (arg0 == 2) {
            this.field1634 = arg2.method2229(255);
        } else if (arg0 == 3) {
            this.field1634 = arg2.method2260(-105);
            if (this.field1634 == 65535) {
                this.field1634 = -1;
            }
        } else if (arg0 == 5) {
            this.field1636 = false;
        } else if (arg0 == 7) {
            this.field1639 = class664.method3752(2, arg2.method2258(-3));
        } else if (arg0 == 8) {
            this.field1628.field3388 = this.field1631;
        } else if (arg0 == 9) {
            this.field1641 = arg2.method2260(-118) << 2;
        } else if (arg0 == 10) {
            this.field1629 = false;
        } else if (arg0 == 11) {
            this.field1638 = arg2.method2229(255);
        } else if (arg0 == 12) {
            this.field1635 = true;
        } else if (arg0 == 13) {
            this.field1630 = arg2.method2258(-3);
        } else if (arg0 == 14) {
            this.field1624 = arg2.method2229(arg1 ^ 0xFFFFD2D1) << 2;
        } else if (arg0 == 16) {
            this.field1640 = arg2.method2229(255);
        }
        if (arg1 != -11730) {
            this.field1631 = 16;
        }
        field1626++;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public static void method878(int arg0) {
        int var1 = -5 % ((-arg0 - 6) / 53);
        field1623 = null;
    }
}
