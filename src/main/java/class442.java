import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class442 extends class80 {

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    private int field6564 = 1024;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    private int field6565 = 3072;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    private int field6571 = 2048;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field6563 = 1401;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "Ls;")
    public static class186 field6568 = new class186(44, -1);

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "Lph;")
    public static class459 field6569;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method2631(byte arg0) {
        int var1 = 27 % ((-49 - arg0) / 58);
        field6569 = null;
        field6568 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        this.field6571 = this.field6565 - this.field6564;
        ++field6570;
        if (!arg0) {
            method2631((byte) -86);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1591 = arg2.method1858(-3256) == 1;
                }
            } else {
                this.field6565 = arg2.method1841((byte) 27);
            }
        } else {
            this.field6564 = arg2.method1841((byte) -117);
        }
        int var5 = -120 % ((arg1 - 28) / 53);
        ++field6567;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class442() {
        super(1, false);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
    public static final void method2632(byte arg0) {
        ++field6562;
        class356 var1 = (class356) class293.field4478.method1892(92);
        boolean var2 = class253.field3885 != null || class218.field3435 > 0;
        if (var2) {
            class12.field214 = 1;
        }
        if (class479.field7063 && class179.field2912.method1458(100, 81) && ~class332.field5041 < -3) {
            if (!var2) {
                class421.method2571((class328) class373.field5469.field4458.field3976.field3976, var1.method52(-109), var1.method54(false), (byte) 69);
            } else {
                class513.field7452 = (class328) class373.field5469.field4458.field3976.field3976;
            }
        } else if (var2) {
            class513.field7452 = (class328) class373.field5469.field4458.field3976;
        } else {
            class421.method2571((class328) class373.field5469.field4458.field3976, var1.method52(-114), var1.method54(false), (byte) 69);
        }
        if (arg0 < 46) {
            method2632((byte) -84);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field6560;
        int[][] var3 = super.field1589.method859(arg1, arg0 ^ -233);
        if (arg0 != 255) {
            method2633(true, 98);
        }
        if (super.field1589.field1884) {
            int[][] var4 = this.method713(0, -48, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class137.field2308 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field6571 >> 12) + this.field6564;
                var9[var11] = (var6[var11] * this.field6571 >> 12) + this.field6564;
                var10[var11] = (var7[var11] * this.field6571 >> 12) + this.field6564;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6561;
        if (arg1 != -16828) {
            field6559 = -128;
        }
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[] var4 = this.method710(arg0, 0, (byte) 105);
            for (int var5 = 0; class137.field2308 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field6571 >> 12) + this.field6564;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(ZI)I")
    public static final int method2633(boolean arg0, int arg1) {
        if (!arg0) {
            method2631((byte) 117);
        }
        ++field6566;
        return 255 & arg1;
    }
}
