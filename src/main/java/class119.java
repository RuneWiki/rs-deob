import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class119 extends class385 {

    @OriginalMember(owner = "client!jk", name = "Sb", descriptor = "[Ljava/lang/String;")
    public static String[] field1567 = new String[8];

    @OriginalMember(owner = "client!jk", name = "Nb", descriptor = "Lwl;")
    public static class452 field1562 = new class452(100, 12);

    @OriginalMember(owner = "client!jk", name = "Vb", descriptor = "[Ljava/lang/String;")
    public static String[] field1570 = new String[100];

    @OriginalMember(owner = "client!jk", name = "Gb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!jk", name = "Hb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!jk", name = "Ib", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jk", name = "Jb", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jk", name = "Kb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!jk", name = "Lb", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client!jk", name = "Mb", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!jk", name = "Ob", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!jk", name = "Pb", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!jk", name = "Qb", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jk", name = "Rb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jk", name = "Tb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!jk", name = "Xb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jk", name = "Ub", descriptor = "Lao;")
    private class264 field1569;

    @OriginalMember(owner = "client!jk", name = "Wb", descriptor = "[[I")
    public static int[][] field1571;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "(I)V")
    public final void method709(int arg0) {
        if (arg0 != -17701) {
            this.field1569 = null;
        }
        ++field1559;
        super.field5666 = (this.field1560 + 7) / 8;
    }

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "(I)V")
    public final void method710(int arg0) {
        ++field1555;
        if (arg0 != 255) {
            this.method710(39);
        }
        this.field1560 = super.field5666 * 8;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(IB)V")
    public static final void method711(int arg0, byte arg1) {
        class303.field4585 = false;
        class360.field5320 = 1;
        class135.field1794 = arg0;
        class36.field437 = -1;
        class463.field6832 = -1;
        class162.field2247 = null;
        ++field1566;
        class314.field4765 = 0;
        if (arg1 > -30) {
            method714((byte) 87);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)I")
    public final int method712(byte arg0, int arg1) {
        ++field1565;
        if (arg0 != 29) {
            this.method715(-65, (byte[]) null, 85, 75);
        }
        return arg1 * 8 + -this.field1560;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)Z")
    public final boolean method713(boolean arg0) {
        ++field1557;
        int var2 = super.field5685[super.field5666] + -this.field1569.method1637((byte) 83) & 255;
        if (arg0) {
            field1571 = null;
        }
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
    public class119(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "(B)V")
    public static void method714(byte arg0) {
        field1562 = null;
        if (arg0 != 127) {
            method714((byte) 76);
        }
        field1567 = null;
        field1570 = null;
        field1571 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I[BII)V")
    public final void method715(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 == -30200) {
            for (int var5 = 0; ~arg2 < ~var5; ++var5) {
                arg1[arg0 + var5] = (byte) (super.field5685[super.field5666++] + -this.field1569.method1636((byte) -39));
            }
            ++field1556;
        }
    }

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "(II)V")
    public final void method716(int arg0, int arg1) {
        int var3 = -60 / ((32 - arg1) / 32);
        ++field1561;
        super.field5685[super.field5666++] = (byte) (this.field1569.method1636((byte) -39) + arg0);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(IZ)I")
    public final int method717(int arg0, boolean arg1) {
        if (arg1) {
            this.method710(100);
        }
        ++field1568;
        int var3 = this.field1560 >> 3;
        int var4 = -(this.field1560 & 7) + 8;
        int var5 = 0;
        this.field1560 += arg0;
        while (arg0 > var4) {
            var5 += (class63.field795[var4] & super.field5685[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field5685[var3] & class63.field795[var4]) + var5;
        } else {
            var6 = (super.field5685[var3] >> -arg0 + var4 & class63.field795[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ll;")
    public static final class113 method718(Throwable arg0, String arg1) {
        ++field1564;
        class113 var2;
        if (!(arg0 instanceof class113)) {
            var2 = new class113(arg0, arg1);
        } else {
            var2 = (class113) arg0;
            var2.field1496 = var2.field1496 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([II)V")
    public final void method719(int[] arg0, int arg1) {
        ++field1572;
        this.field1569 = new class264(arg0);
        int var3 = 82 % ((12 - arg1) / 41);
    }

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "(B)I")
    public final int method720(byte arg0) {
        ++field1563;
        int var2 = 255 & super.field5685[super.field5666++] + -this.field1569.method1636((byte) -39);
        if (var2 < 128) {
            return var2;
        } else {
            if (arg0 != -114) {
                this.field1569 = null;
            }
            return (var2 + -128 << 8) - -(super.field5685[super.field5666++] + -this.field1569.method1636((byte) -39) & 255);
        }
    }
}
