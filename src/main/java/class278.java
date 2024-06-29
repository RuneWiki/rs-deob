import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class278 extends class112 {

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    private int field4756 = 4096;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field4760 = 0;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "Lwm;")
    public static class152 field4758 = class157.method1048("<col=00ffff>", 126);

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "[I")
    public static int[] field4755 = new int[4096];

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBII)V", line = 25)
    public static final void method1895(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class146.field2244 = class239.field3921 * arg1 / arg0;
        if (arg2 <= 53) {
            return;
        }
        field4754++;
        class84.field1158 = class26.field446 * arg3 / arg4;
        class183.field2920 = -1;
        class208.field3392 = -1;
        class79.method521((byte) -126);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 41)
    public static void method1896(byte arg0) {
        field4758 = null;
        field4755 = null;
        if (arg0 != 49) {
            field4755 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)V", line = 53)
    public static final void method1897(byte arg0) {
        field4761++;
        if (arg0 > -102) {
            field4758 = (class152) null;
        }
        while (class73.field1058.method1067(class288.field4882, (byte) 113) >= 27) {
            int var1 = class73.field1058.method1075(false, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class40.field649[var1] == null) {
                class40.field649[var1] = new class4();
                var2 = true;
            }
            class4 var3 = class40.field649[var1];
            class97.field1403[class233.field3826++] = var1;
            var3.field4251 = class142.field2187;
            if (var3.field72 != null && var3.field72.method1654(9193)) {
                class288.method1936(4096, var3);
            }
            var3.method15(class98.method659(255, class73.field1058.method1075(false, 14)), 0);
            int var4 = class183.field2912[class73.field1058.method1075(false, 3)];
            if (var2) {
                var3.field4209 = var3.field4161 = var4;
            }
            int var5 = class73.field1058.method1075(false, 5);
            int var6 = class73.field1058.method1075(false, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class73.field1058.method1075(false, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var7 == 1) {
                class235.field3851[class238.field3912++] = var1;
            }
            int var8 = class73.field1058.method1075(false, 1);
            var3.method1703(var3.field72.field3984, 1159);
            var3.field4190 = var3.field72.field3968;
            if (var3.field4190 == 0) {
                var3.field4161 = 0;
            }
            var3.field4171 = var3.field72.field3982;
            var3.method1711(var3.method67(-4391), var8 == 1, class85.field1176.field4245[0] + var6, (byte) -103, class85.field1176.field4188[0] + var5);
            if (var3.field72.method1654(9193)) {
                class313.method2184(99, var3, 0, class23.field400, (class270) null, (class12) null, var3.field4188[0], var3.field4245[0]);
            }
        }
        class73.field1058.method1064(4);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 256)
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I", line = 137)
    public final int[] method53(byte arg0, int arg1) {
        field4753++;
        if (arg0 != -3) {
            return (int[]) null;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 78);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 120, 0);
            for (int var5 = 0; var5 < class58.field889; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field4760) {
                    var3[var5] = this.field4760;
                } else if (this.field4756 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4756;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)[[I", line = 178)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            this.method52(-4, 11, (class291) null);
        }
        field4757++;
        int[][] var3 = this.field1594.method656((byte) -96, arg0);
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class58.field889; var11++) {
                int var12 = var9[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var14 < this.field4760) {
                    var6[var11] = this.field4760;
                } else if (var14 <= this.field4756) {
                    var6[var11] = var14;
                } else {
                    var6[var11] = this.field4756;
                }
                if (this.field4760 > var12) {
                    var8[var11] = this.field4760;
                } else if (var12 > this.field4756) {
                    var8[var11] = this.field4756;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field4760) {
                    var10[var11] = this.field4760;
                } else if (var13 > this.field4756) {
                    var10[var11] = this.field4756;
                } else {
                    var10[var11] = var13;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILhi;)V", line = 260)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field4759++;
        if (arg1 == 0) {
            this.field4760 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field4756 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field1591 = arg2.method2011(-41) == 1;
        }
        if (arg0 != 31164) {
            this.method52(33, 60, (class291) null);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4755[var0] = class50.method349(-61440, var0);
        }
        field4762 = 0;
        field4763 = 0;
    }
}
