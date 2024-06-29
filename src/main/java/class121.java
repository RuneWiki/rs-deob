import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class121 {

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "F")
    public float field1588 = 1.0F;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "F")
    public float field1590 = 0.25F;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "F")
    public float field1591 = 1.0F;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "F")
    public float field1603;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "F")
    public float field1586;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "Lhe;")
    public class577 field1594;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "F")
    public float field1596;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "Lkr;")
    public static class602 field1598 = new class602(25, 6);

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "[[B")
    public static byte[][] field1599 = new byte[250][];

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    public static int field1604 = 0;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "Z")
    public static boolean field1585;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIBII)I")
    public static final int method750(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -67) {
            field1599 = null;
        }
        field1587++;
        int var5 = 65536 - class24.field308[arg1 * 8192 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILrea;)Z")
    public final boolean method751(int arg0, class121 arg1) {
        if (arg0 != -15667) {
            this.field1590 = 1.4506893F;
        }
        field1597++;
        return this.field1600 == arg1.field1600 && this.field1596 == arg1.field1596 && this.field1586 == arg1.field1586 && this.field1603 == arg1.field1603 && this.field1590 == arg1.field1590 && this.field1588 == arg1.field1588 && this.field1591 == arg1.field1591 && this.field1589 == arg1.field1589 && this.field1592 == arg1.field1592 && this.field1594 == arg1.field1594;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static void method752(int arg0) {
        int var1 = 59 % ((-arg0 - 75) / 48);
        field1598 = null;
        field1599 = null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILdc;)V")
    public final void method753(int arg0, class63 arg1) {
        field1593++;
        this.field1588 = (float) (arg1.method505((byte) -119) * 8) / 255.0F;
        if (arg0 == -26167) {
            this.field1590 = (float) (arg1.method505((byte) -119) * 8) / 255.0F;
            this.field1591 = (float) (arg1.method505((byte) -119) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
    public class121() {
        this.field1600 = class191.field2598;
        this.field1603 = 1.2F;
        this.field1586 = 0.69921875F;
        this.field1592 = 0;
        this.field1594 = class731.field10162;
        this.field1595 = -50;
        this.field1583 = -60;
        this.field1589 = class623.field8404;
        this.field1596 = 1.1523438F;
        this.field1584 = -50;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Ldc;)V")
    public class121(class63 arg0) {
        int var2 = arg0.method505((byte) -119);
        if (class332.field4707.field4764.method3961(0) == 1 && class453.field6283.method1481() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1600 = class191.field2598;
            } else {
                this.field1600 = arg0.method457(-14532);
            }
            if ((var2 & 0x2) == 0) {
                this.field1596 = 1.1523438F;
            } else {
                this.field1596 = (float) arg0.method482(-772591672) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1586 = 0.69921875F;
            } else {
                this.field1586 = (float) arg0.method482(-772591672) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1603 = 1.2F;
            } else {
                this.field1603 = (float) arg0.method482(-772591672) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method457(-14532);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method482(-772591672);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method482(-772591672);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method482(-772591672);
            }
            this.field1586 = 0.69921875F;
            this.field1603 = 1.2F;
            this.field1596 = 1.1523438F;
            this.field1600 = class191.field2598;
        }
        if ((var2 & 0x10) == 0) {
            this.field1583 = -60;
            this.field1595 = -50;
            this.field1584 = -50;
        } else {
            this.field1584 = arg0.method496(-65);
            this.field1583 = arg0.method496(-73);
            this.field1595 = arg0.method496(-93);
        }
        if ((var2 & 0x20) == 0) {
            this.field1589 = class623.field8404;
        } else {
            this.field1589 = arg0.method457(-14532);
        }
        if ((var2 & 0x40) == 0) {
            this.field1592 = 0;
        } else {
            this.field1592 = arg0.method482(-772591672);
        }
        if ((var2 & 0x80) == 0) {
            this.field1594 = class731.field10162;
        } else {
            int var3 = arg0.method482(-772591672);
            int var4 = arg0.method482(-772591672);
            int var5 = arg0.method482(-772591672);
            int var6 = arg0.method482(-772591672);
            int var7 = arg0.method482(-772591672);
            int var8 = arg0.method482(-772591672);
            this.field1594 = class122.method758(var5, 19585, var7, var3, var6, var4, var8);
        }
    }
}
