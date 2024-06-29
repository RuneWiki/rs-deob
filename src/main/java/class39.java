import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class39 extends class129 {

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Ldb;")
    public class36 field885 = new class36();

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Lwb;")
    public class241 field900 = new class241();

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Lwd;")
    private class243 field884;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Ldb;")
    public static class36 field886 = new class36();

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Z")
    public static boolean field893 = false;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "Lkh;")
    public static class117 field896 = class224.method1450((byte) -37, " (X");

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field890 = 1;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lfe;")
    public static class61 field899 = new class61();

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lkh;")
    public static class117 field903 = class224.method1450((byte) -82, "gleiten:");

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "Lr;")
    public static class186 field901;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lwd;")
    public static class243 field897;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "[Ltj;")
    public static class218[] field898;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
    public static final void method338(int arg0, long arg1) {
        field887++;
        if (arg1 == 0L) {
            return;
        }
        class207.field3719++;
        class105.field1911.method400(58, 8);
        class105.field1911.method1000((byte) 91, arg1);
        if (arg0 > -93) {
            method343(-77, -53);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public static void method339(int arg0) {
        field886 = null;
        field899 = null;
        field897 = null;
        field903 = null;
        field901 = null;
        field898 = null;
        if (arg0 == 14240) {
            field896 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lkh;ILkh;ILkh;)V")
    public static final void method340(class117 arg0, int arg1, class117 arg2, int arg3, class117 arg4) {
        field888++;
        if (arg3 == 12419) {
            class151.method1078(-1, (byte) 119, arg1, arg0, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([III)V")
    public final void method341(int[] arg0, int arg1, int arg2) {
        field891++;
        this.field900.method341(arg0, arg1, arg2);
        for (class84 var4 = (class84) this.field885.method314((byte) -26); var4 != null; var4 = (class84) this.field885.method320(0)) {
            if (!this.field884.method1554(var4, (byte) -109)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1571) {
                        this.method346(-92, var6, var4, var5 + var6, var5, arg0);
                        var4.field1571 -= var6;
                        break;
                    }
                    this.method346(126, var4.field1571, var4, var5 + var6, var5, arg0);
                    var5 += var4.field1571;
                    var6 -= var4.field1571;
                } while (!this.field884.method1546(-107, var5, var6, arg0, var4));
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lhg;IB)V")
    private final void method342(class84 arg0, int arg1, byte arg2) {
        field889++;
        int var4 = -126 / ((arg2 + 65) / 52);
        if ((this.field884.field4462[arg0.field1584] & 0x4) != 0 && arg0.field1605 < 0) {
            int var5 = this.field884.field4460[arg0.field1584] / class214.field3883;
            int var6 = (var5 + 1048575 - arg0.field1594) / var5;
            arg0.field1594 = arg0.field1594 + arg1 * var5 & 0xFFFFF;
            if (var6 <= arg1) {
                if (this.field884.field4468[arg0.field1584] == 0) {
                    arg0.field1604 = class245.method1598(arg0.field1588, arg0.field1604.method1577(), arg0.field1604.method1581(), arg0.field1604.method1580());
                } else {
                    arg0.field1604 = class245.method1598(arg0.field1588, arg0.field1604.method1577(), 0, arg0.field1604.method1580());
                    this.field884.method1540(arg0.field1595.field130[arg0.field1580] < 0, (byte) 35, arg0);
                }
                if (arg0.field1595.field130[arg0.field1580] < 0) {
                    arg0.field1604.method1588(-1);
                }
                arg1 = arg0.field1594 / var5;
            }
        }
        arg0.field1604.method347(arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
    public static final void method343(int arg0, int arg1) {
        field892++;
        if (~arg1 == arg0 && !class115.field2137) {
            class248.method1622(true);
        } else if (arg1 != -1 && (class184.field3304 != arg1 || !class181.method1251(-1)) && class175.field3161 != 0 && !class115.field2137) {
            class226.method1462(2, false, class117.field2187, false, 0, arg1, class175.field3161);
        }
        class184.field3304 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()Lli;")
    public final class129 method344() {
        field895++;
        class84 var1 = (class84) this.field885.method314((byte) -26);
        if (var1 == null) {
            return null;
        } else if (var1.field1604 == null) {
            return this.method345();
        } else {
            return var1.field1604;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()Lli;")
    public final class129 method345() {
        field883++;
        class84 var1;
        do {
            var1 = (class84) this.field885.method320(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1604 == null);
        return var1.field1604;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILhg;II[I)V")
    private final void method346(int arg0, int arg1, class84 arg2, int arg3, int arg4, int[] arg5) {
        int var7 = -28 % ((22 - arg0) / 60);
        field902++;
        if ((this.field884.field4462[arg2.field1584] & 0x4) != 0 && arg2.field1605 < 0) {
            int var8 = this.field884.field4460[arg2.field1584] / class214.field3883;
            while (true) {
                int var9 = (var8 + 1048575 - arg2.field1594) / var8;
                if (arg1 < var9) {
                    arg2.field1594 += arg1 * var8;
                    break;
                }
                arg1 -= var9;
                arg2.field1604.method341(arg5, arg4, var9);
                arg2.field1594 += var8 * var9 - 1048576;
                int var10 = 262144 / var8;
                class245 var11 = arg2.field1604;
                int var12 = class214.field3883 / 100;
                if (var12 > var10) {
                    var12 = var10;
                }
                if (this.field884.field4468[arg2.field1584] == 0) {
                    arg2.field1604 = class245.method1598(arg2.field1588, var11.method1577(), var11.method1581(), var11.method1580());
                } else {
                    arg2.field1604 = class245.method1598(arg2.field1588, var11.method1577(), 0, var11.method1580());
                    this.field884.method1540(arg2.field1595.field130[arg2.field1580] < 0, (byte) 35, arg2);
                    arg2.field1604.method1578(var12, var11.method1581());
                }
                if (arg2.field1595.field130[arg2.field1580] < 0) {
                    arg2.field1604.method1588(-1);
                }
                var11.method1583(var12);
                arg4 += var9;
                var11.method341(arg5, arg4, arg3 - arg4);
                if (var11.method1602()) {
                    this.field900.method1532(var11);
                }
            }
        }
        arg2.field1604.method341(arg5, arg4, arg1);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final void method347(int arg0) {
        this.field900.method347(arg0);
        for (class84 var2 = (class84) this.field885.method314((byte) -26); var2 != null; var2 = (class84) this.field885.method320(0)) {
            if (!this.field884.method1554(var2, (byte) -77)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1571) {
                        this.method342(var2, var3, (byte) 88);
                        var2.field1571 -= var3;
                        break;
                    }
                    this.method342(var2, var2.field1571, (byte) 84);
                    var3 -= var2.field1571;
                } while (!this.field884.method1546(94, 0, var3, null, var2));
            }
        }
        field882++;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()I")
    public final int method348() {
        field894++;
        return 0;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lwd;)V")
    public class39(class243 arg0) {
        this.field884 = arg0;
    }
}
