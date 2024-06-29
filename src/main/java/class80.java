import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class80 extends class261 {

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "[Lej;")
    public class80[] field1603;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Z")
    public boolean field1591;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "J")
    public static long field1594 = 0L;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "[I")
    public static int[] field1599 = new int[32];

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "[I")
    public static int[] field1604 = new int[4];

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "[I")
    public static int[] field1598 = new int[4096];

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "Lph;")
    public static class459 field1588;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lto;")
    public class8 field1601;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lhc;")
    public class96 field1589;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
    public int[] method25(int arg0, int arg1) {
        field1602++;
        if (arg1 != -16828) {
            field1598 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public void method23(boolean arg0) {
        field1600++;
        if (!arg0) {
            this.method710(-62, -18, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)[[I")
    public int[][] method29(int arg0, int arg1) {
        field1582++;
        if (arg0 != 255) {
            this.method29(-35, -87);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
    public int method707(int arg0) {
        field1586++;
        return arg0 == -1 ? -1 : 28;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
    public void method708(int arg0, int arg1, int arg2) {
        if (arg0 > -11) {
            return;
        }
        field1596++;
        int var4 = this.field1590 == 255 ? arg1 : this.field1590;
        if (this.field1591) {
            this.field1601 = new class8(var4, arg1, arg2);
        } else {
            this.field1589 = new class96(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(Z)V")
    public static void method709(boolean arg0) {
        if (arg0) {
            field1604 = null;
        }
        field1598 = null;
        field1588 = null;
        field1604 = null;
        field1599 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)[I")
    public final int[] method710(int arg0, int arg1, byte arg2) {
        if (arg2 <= 68) {
            this.method710(-24, -30, (byte) 106);
        }
        field1597++;
        return this.field1603[arg1].field1591 ? this.field1603[arg1].method25(arg0, -16828) : this.field1603[arg1].method29(255, arg0)[0];
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method711(int arg0, String arg1) {
        field1585++;
        if (arg1.equals("")) {
            return;
        }
        class144.field2431++;
        class459.method2765(class145.field2438, (byte) 87);
        class335.field5062.method1814(class362.method2220(arg1, (byte) -80), true);
        if (arg0 == 3) {
            class335.field5062.method1821(arg1, arg0 ^ 0x5F);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)I")
    public static final int method712(int arg0, boolean arg1) {
        if (!arg1) {
            field1599 = null;
        }
        field1584++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILnn;)V")
    public void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 60 / ((arg1 - 28) / 53);
        field1583++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)[[I")
    public final int[][] method713(int arg0, int arg1, int arg2) {
        field1587++;
        if (arg1 > -15) {
            this.field1590 = 98;
        }
        if (this.field1603[arg0].field1591) {
            int[] var4 = this.field1603[arg0].method25(arg2, -16828);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1603[arg0].method29(255, arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IZ)V")
    public class80(int arg0, boolean arg1) {
        this.field1603 = new class80[arg0];
        this.field1591 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)I")
    public int method714(int arg0) {
        field1595++;
        if (arg0 != 0) {
            this.method25(61, -5);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public void method715(byte arg0) {
        if (this.field1591) {
            this.field1601.method46(0);
            this.field1601 = null;
        } else {
            this.field1589.method860(arg0 ^ 0xFFFFFFE7);
            this.field1589 = null;
        }
        field1593++;
        if (arg0 != -26) {
            this.field1603 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1598[var0] = class161.method1149(var0, 30);
        }
    }
}
