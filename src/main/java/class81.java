import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class81 extends class1 {

    @OriginalMember(owner = "client!he", name = "lb", descriptor = "I")
    private int field1549 = 2048;

    @OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
    private int field1555 = 1024;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "I")
    private int field1547 = 3072;

    @OriginalMember(owner = "client!he", name = "pb", descriptor = "[I")
    public static int[] field1553 = new int[32768];

    @OriginalMember(owner = "client!he", name = "qb", descriptor = "Loc;")
    private static class151 field1554 = class137.method873(2, "You have only just left another world)3");

    @OriginalMember(owner = "client!he", name = "kb", descriptor = "Loc;")
    public static class151 field1548 = field1554;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "[I")
    public static int[] field1545 = new int[128];

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!he", name = "mb", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!he", name = "ob", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!he", name = "sb", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!he", name = "tb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!he", name = "ub", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field27 = ~arg2.method1475(255) == -2;
                }
            } else {
                this.field1547 = arg2.method1490((byte) 73);
            }
        } else {
            this.field1555 = arg2.method1490((byte) 73);
        }
        if (arg0 != 0) {
            this.field1549 = 87;
        }
        ++field1558;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V")
    public static void method516(boolean arg0) {
        field1553 = null;
        if (!arg0) {
            field1548 = null;
            field1545 = null;
            field1554 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            field1553 = null;
        }
        ++field1552;
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            int[] var4 = this.method4(arg1, arg0 + -212, 0);
            for (int var5 = 0; ~var5 > ~class202.field3603; ++var5) {
                var3[var5] = (var4[var5] * this.field1549 >> 12) + this.field1555;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[BI)I")
    public static final int method517(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field1556;
        int var4 = -1;
        for (int var5 = arg0; ~arg3 < ~var5; ++var5) {
            var4 = var4 >>> 8 ^ class168.field3073[(var4 ^ arg2[var5]) & 255];
        }
        int var6 = ~var4;
        if (arg1 < 4) {
            method516(true);
        }
        return var6;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Lfb;")
    public static final class58 method518(int arg0) {
        if (arg0 <= 105) {
            method519(-37);
        }
        ++field1550;
        try {
            return (class58) Class.forName("rf").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 != 3) {
            method518(-86);
        }
        ++field1544;
        this.field1549 = this.field1547 - this.field1555;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
    public static final void method519(int arg0) {
        ++field1546;
        if (arg0 >= -95) {
            field1553 = null;
        }
        for (class216 var1 = (class216) class193.field3454.method1358(-29726); var1 != null; var1 = (class216) class193.field3454.method1360(true)) {
            class160 var2 = var1.field3773;
            if (class234.field4325 == var2.field2885 && !var2.field2884) {
                if (~class200.field3541 <= ~var2.field2892) {
                    var2.method1043(class181.field3273, -124);
                    if (!var2.field2884) {
                        class154.method1014(var2.field2885, var2.field2887, var2.field2872, var2.field2898, 60, var2, 0, -1L, false);
                    } else {
                        var1.method636(62);
                    }
                }
            } else {
                var1.method636(110);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1551;
        if (arg1 != -81) {
            return null;
        } else {
            int[][] var3 = super.field13.method578(arg0, -1);
            if (super.field13.field1658) {
                int[][] var4 = this.method8(0, (byte) -115, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[1];
                int[] var8 = var4[2];
                int[] var9 = var3[0];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class202.field3603; ++var11) {
                    var9[var11] = (var5[var11] * this.field1549 >> 12) + this.field1555;
                    var7[var11] = (var6[var11] * this.field1549 >> 12) + this.field1555;
                    var10[var11] = (var8[var11] * this.field1549 >> 12) + this.field1555;
                }
            }
            return var3;
        }
    }
}
