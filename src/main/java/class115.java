import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class115 extends class254 {

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[Lcl;")
    public class115[] field1706;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "Z")
    public boolean field1713;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static volatile int field1712 = 0;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1714 = "glow3:";

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "Laj;")
    public class1 field1716;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Lwa;")
    public class68 field1705;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[I")
    public static int[] field1701;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        field1702++;
        int var4 = this.field1711 == arg1 ? arg0 : this.field1711;
        if (this.field1713) {
            this.field1705 = new class68(var4, arg0, arg2);
        } else {
            this.field1716 = new class1(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILkl;I)V")
    public void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 == -1) {
            field1715++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)[I")
    public final int[] method797(int arg0, int arg1, int arg2) {
        field1708++;
        int var4 = -95 % ((arg2 - 42) / 59);
        return this.field1706[arg0].field1713 ? this.field1706[arg0].method116(242152972, arg1) : this.field1706[arg0].method235(-79, arg1)[0];
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(III)[[I")
    public final int[][] method798(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return null;
        }
        field1700++;
        if (this.field1706[arg1].field1713) {
            int[] var4 = this.field1706[arg1].method116(242152972, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1706[arg1].method235(-108, arg2);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public void method239(byte arg0) {
        field1710++;
        if (arg0 != -15) {
            field1703 = -5;
        }
        if (this.field1713) {
            this.field1705.method461(false);
            this.field1705 = null;
        } else {
            this.field1716.method9(-21109);
            this.field1716 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I")
    public int method241(int arg0) {
        field1717++;
        int var2 = 6 % ((arg0 + 70) / 48);
        return -1;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)[[I")
    public int[][] method235(int arg0, int arg1) {
        if (arg0 >= -33) {
            return null;
        } else {
            field1719++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)I")
    public int method644(int arg0) {
        if (arg0 == -20926) {
            field1704++;
            return -1;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)V")
    public static final void method799(int arg0, int arg1) {
        field1709++;
        int var2 = -73 % ((arg0 + 51) / 37);
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class37.method265(14807);
        } else if (arg1 == 2) {
            class148.method989(-92);
        } else if (arg1 == 3) {
            class146.method982(124);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public void method170(byte arg0) {
        field1718++;
        int var2 = 108 % ((arg0 - 78) / 42);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(II)[I")
    public int[] method116(int arg0, int arg1) {
        field1707++;
        if (arg0 != 242152972) {
            field1701 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IZ)V")
    public class115(int arg0, boolean arg1) {
        this.field1706 = new class115[arg0];
        this.field1713 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public static void method800(byte arg0) {
        field1701 = null;
        field1714 = null;
        if (arg0 < 103) {
            field1712 = -32;
        }
    }
}
