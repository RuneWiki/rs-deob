import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class133 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "F")
    public float field1755 = 0.25F;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "F")
    public float field1758 = 1.0F;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "F")
    public float field1771 = 1.0F;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "F")
    public float field1762;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ltea;")
    public class589 field1757;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "F")
    public float field1754;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "F")
    public float field1766;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Luw;")
    public static class208 field1756 = new class208(70, -1);

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLmc;)V")
    public final void method775(boolean arg0, class234 arg1) {
        if (arg0) {
            this.field1771 = -0.20411018F;
        }
        field1760++;
        this.field1771 = (float) (arg1.method1509(true) * 8) / 255.0F;
        this.field1755 = (float) (arg1.method1509(!arg0) * 8) / 255.0F;
        this.field1758 = (float) (arg1.method1509(!arg0) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILfda;II)V")
    public static final void method776(int arg0, int arg1, int arg2, int arg3, class381 arg4, int arg5, int arg6) {
        if (arg3 == 17105) {
            class345.method2001(arg5, arg2, arg4.field2900, -4263, arg0, arg1, arg4.field2896, arg6, 0, arg4.field2895);
            field1759++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method777(int arg0) {
        if (arg0 == 24341) {
            field1756 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z")
    public static final boolean method778(int arg0, int arg1, int arg2) {
        if (arg1 != 8) {
            method778(-12, 14, 126);
        }
        field1763++;
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Luc;I)Z")
    public final boolean method779(class133 arg0, int arg1) {
        field1764++;
        if (arg1 != -1) {
            this.field1769 = -109;
        }
        return this.field1767 == arg0.field1767 && this.field1762 == arg0.field1762 && this.field1766 == arg0.field1766 && this.field1754 == arg0.field1754 && this.field1755 == arg0.field1755 && this.field1771 == arg0.field1771 && this.field1758 == arg0.field1758 && this.field1770 == arg0.field1770 && this.field1772 == arg0.field1772 && this.field1757 == arg0.field1757;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class133() {
        this.field1769 = -50;
        this.field1762 = 1.1523438F;
        this.field1757 = class629.field7987;
        this.field1754 = 1.2F;
        this.field1767 = class661.field8617;
        this.field1766 = 0.69921875F;
        this.field1772 = 0;
        this.field1768 = -60;
        this.field1770 = class14.field148;
        this.field1761 = -50;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lmc;)V")
    public class133(class234 arg0) {
        int var2 = arg0.method1509(true);
        if (class485.field6252.field6947.method106(false) == 1 && class702.field9291.method893() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1767 = class661.field8617;
            } else {
                this.field1767 = arg0.method1497((byte) 125);
            }
            if ((var2 & 0x2) == 0) {
                this.field1762 = 1.1523438F;
            } else {
                this.field1762 = (float) arg0.method1553((byte) 55) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1766 = 0.69921875F;
            } else {
                this.field1766 = (float) arg0.method1553((byte) 99) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1754 = 1.2F;
            } else {
                this.field1754 = (float) arg0.method1553((byte) -118) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1497((byte) 110);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1553((byte) -112);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1553((byte) -117);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1553((byte) -109);
            }
            this.field1762 = 1.1523438F;
            this.field1767 = class661.field8617;
            this.field1766 = 0.69921875F;
            this.field1754 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1769 = -50;
            this.field1768 = -60;
            this.field1761 = -50;
        } else {
            this.field1769 = arg0.method1542(27067);
            this.field1768 = arg0.method1542(27067);
            this.field1761 = arg0.method1542(27067);
        }
        if ((var2 & 0x20) == 0) {
            this.field1770 = class14.field148;
        } else {
            this.field1770 = arg0.method1497((byte) 58);
        }
        if ((var2 & 0x40) == 0) {
            this.field1772 = 0;
        } else {
            this.field1772 = arg0.method1553((byte) 97);
        }
        if ((var2 & 0x80) == 0) {
            this.field1757 = class629.field7987;
        } else {
            int var3 = arg0.method1553((byte) 21);
            int var4 = arg0.method1553((byte) -115);
            int var5 = arg0.method1553((byte) 73);
            int var6 = arg0.method1553((byte) 106);
            int var7 = arg0.method1553((byte) 75);
            int var8 = arg0.method1553((byte) -127);
            this.field1757 = class541.method2946(var4, var3, var6, var5, var8, var7, (byte) 124);
        }
    }
}
