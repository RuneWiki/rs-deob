import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class112 extends class149 {

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "Ljb;")
    public static class499 field1571 = null;

    @OriginalMember(owner = "client!wu", name = "R", descriptor = "J")
    public static long field1572 = -1L;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "Ler;")
    public static class157 field1563 = new class157(20);

    @OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
    public static int field1573 = -1;

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "Lf;")
    public static class191 field1564;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 == -1) {
            super.field2148 = arg2.method618((byte) 100) == 1;
        }
        if (arg1 != 35) {
            field1564 = null;
        }
        ++field1566;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(III)I")
    public static final int method734(int arg0, int arg1, int arg2) {
        ++field1570;
        int var3 = 1;
        while (arg1 > 1) {
            if (~(1 & arg1) != -1) {
                var3 = arg0 * var3;
            }
            arg1 >>= 1;
            arg0 *= arg0;
        }
        if (arg1 == arg2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(III)I")
    public static final int method735(int arg0, int arg1, int arg2) {
        ++field1569;
        int var3 = 101 / ((arg1 - 11) / 58);
        int var4 = class254.method1658(arg2 + -1, arg0 + -1, true) + class254.method1658(arg2 - 1, arg0 + 1, true) + (class254.method1658(arg2 + 1, arg0 + -1, true) - -class254.method1658(arg2 + 1, arg0 - -1, true));
        int var5 = class254.method1658(arg2, arg0 + -1, true) + class254.method1658(arg2, arg0 + 1, true) - -class254.method1658(arg2 + -1, arg0, true) - -class254.method1658(arg2 + 1, arg0, true);
        int var6 = class254.method1658(arg2, arg0, true);
        return var5 / 8 + var4 / 16 + var6 / 4;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        ++field1565;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 >= -45) {
            method737(20);
        }
        if (super.field2147.field6664) {
            int[] var4 = this.method983(2, 24824, arg1);
            int[][] var5 = this.method984((byte) 119, 0, arg1);
            int[][] var6 = this.method984((byte) 95, 1, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class316.field4838 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIBIII)V")
    public static final void method736(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (~class396.field6021 >= ~arg6 && ~arg5 >= ~class443.field6591 && ~arg4 <= ~class410.field6176 && ~arg1 >= ~class158.field2302) {
            if (arg2 == 1) {
                class420.method2529(arg6, arg0, (byte) -34, arg1, arg4, arg5);
            } else {
                class156.method1007(arg4, arg2, 0, arg1, arg0, arg5, arg6);
            }
        } else if (~arg2 != -2) {
            class207.method1437(arg0, arg2, arg1, arg6, arg5, arg4, (byte) -109);
        } else {
            class520.method3095(arg4, true, arg6, arg0, arg5, arg1);
        }
        if (arg3 < 19) {
            method734(-65, 77, -36);
        }
        ++field1568;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
    public class112() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
    public static void method737(int arg0) {
        field1563 = null;
        field1564 = null;
        field1571 = null;
        if (arg0 <= 16) {
            field1571 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field1567;
        int[] var3 = super.field2152.method2891(arg1, (byte) 100);
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, arg1);
            int[] var5 = this.method983(1, arg0 ^ -19115, arg1);
            int[] var6 = this.method983(2, 24824, arg1);
            for (int var7 = 0; ~var7 > ~class316.field4838; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 != -1) {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        if (arg0 != -10835) {
            this.method139((byte) -99, 79);
        }
        return var3;
    }
}
