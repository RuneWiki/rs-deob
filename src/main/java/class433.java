import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class433 extends class585 {

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    private int field5854 = 0;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private int field5866 = 0;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field5857 = 2048;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    private int field5864 = 8192;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    private int field5862 = 4096;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    private int field5867 = 12288;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    private int field5861 = 2048;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "Ljq;")
    public static class536 field5863 = class549.method3278(7);

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "Lgp;")
    public static class53 field5869;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "[Z")
    public static boolean[] field5868;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIB)Z")
    private final boolean method2590(int arg0, int arg1, byte arg2) {
        if (arg2 != -63) {
            field5869 = null;
        }
        ++field5860;
        int var4 = (-arg0 + arg1) * this.field5867 >> 12;
        int var5 = class356.field5015[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field5867;
        int var7 = (var6 << 12) / this.field5864;
        int var8 = this.field5862 * var7 >> 12;
        return arg0 + arg1 < var8 && arg0 + arg1 > -var8;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;ILtd;I)Lhu;")
    public static final class141 method2591(String arg0, int arg1, class477 arg2, int arg3) {
        if (arg3 >= -17) {
            return null;
        } else {
            ++field5865;
            return class514.method3099(arg2, true, "openjs", arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(III)Z")
    private final boolean method2592(int arg0, int arg1, int arg2) {
        ++field5859;
        int var4 = (arg0 + arg1) * this.field5867 >> 12;
        int var5 = class356.field5015[(1045149 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field5867;
        int var7 = (var6 << 12) / this.field5864;
        if (arg2 <= 54) {
            return false;
        } else {
            int var8 = this.field5862 * var7 >> 12;
            return ~(-arg1 + arg0) > ~var8 && -arg1 + arg0 > -var8;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class433() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg1 < 123) {
            field5868 = null;
        }
        ++field5855;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int var4 = class633.field8892[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class293.field4278; ++var5) {
                int var6 = class581.field8200[var5] - 2048;
                int var7 = var6 - -this.field5861;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field5854 + var4;
                int var11 = ~var10 > 2047 ? var10 - -4096 : var10;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field5866;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field5857 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 - 4096;
                var3[var5] = !this.method2590(var9, var12, (byte) -63) && !this.method2592(var18, var15, 119) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field5851;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field5864 = arg0.method2998(true);
                                }
                            } else {
                                this.field5862 = arg0.method2998(true);
                            }
                        } else {
                            this.field5867 = arg0.method2998(true);
                        }
                    } else {
                        this.field5857 = arg0.method2998(true);
                    }
                } else {
                    this.field5866 = arg0.method2998(true);
                }
            } else {
                this.field5854 = arg0.method2998(true);
            }
        } else {
            this.field5861 = arg0.method2998(true);
        }
        if (arg1 != 1) {
            method2594(-51);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 != -4096) {
            this.field5854 = -78;
        }
        class635.method3634((byte) -105);
        ++field5856;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V")
    public static void method2593(byte arg0) {
        field5863 = null;
        field5868 = null;
        int var1 = -98 % ((-64 - arg0) / 50);
        field5869 = null;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Lqe;")
    public static final class492 method2594(int arg0) {
        ++field5853;
        if (class117.field1801 != null && class640.field8973 != null) {
            if (arg0 != 6) {
                field5868 = null;
            }
            for (class492 var1 = (class492) class640.field8973.method1544(false); var1 != null; var1 = (class492) class640.field8973.method1544(false)) {
                class413 var2 = class117.field1786.method1231(58, var1.field6971);
                if (var2 != null && var2.field5659 && var2.method2504((byte) 81, class117.field1789)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I")
    public static final int method2595(int arg0, byte arg1) {
        ++field5852;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg1 != -82) {
            return -75;
        } else {
            int var6 = var5 | var5 >>> 16;
            return var6 - -1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
    public static final void method2596(int arg0, boolean arg1) {
        ++field5858;
        for (class513 var2 = (class513) class488.field6903.method1731((byte) -119); var2 != null; var2 = (class513) class488.field6903.method1724(0)) {
            if (var2.field7236 != null) {
                class184.field2828.method426(var2.field7236);
                var2.field7236 = null;
            }
            if (var2.field7252 != null) {
                class184.field2828.method426(var2.field7252);
                var2.field7252 = null;
            }
            var2.method3387((byte) 123);
        }
        if (arg1) {
            for (class513 var3 = (class513) class376.field5192.method1731((byte) -126); var3 != null; var3 = (class513) class376.field5192.method1724(0)) {
                if (var3.field7236 != null) {
                    class184.field2828.method426(var3.field7236);
                    var3.field7236 = null;
                }
                var3.method3387((byte) -18);
            }
            for (class513 var4 = (class513) class585.field8269.method2243((byte) 100); var4 != null; var4 = (class513) class585.field8269.method2248(-15690)) {
                if (var4.field7236 != null) {
                    class184.field2828.method426(var4.field7236);
                    var4.field7236 = null;
                }
                var4.method3387((byte) 107);
            }
        }
        if (arg0 >= -49) {
            field5868 = null;
        }
    }
}
