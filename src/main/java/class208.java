import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class208 extends class184 {

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Z")
    private boolean field2688 = true;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    private int field2687 = 4096;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field2694 = 0;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "Lc;")
    public static class123 field2695;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        int var4 = 119 / ((arg0 - -13) / 51);
        ++field2691;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2688 = arg2.method2737(false) == 1;
            }
        } else {
            this.field2687 = arg2.method2758((byte) 90);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILtf;)V")
    public static final void method1288(int arg0, class194 arg1) {
        int var2 = 0;
        if (arg0 != -20715) {
            method1290(-42);
        }
        while (class409.field5845 > var2) {
            int var3 = class479.field7012[var2];
            class223 var4 = class387.field5107[var3];
            int var5 = arg1.method2737(false);
            if ((8 & var5) != 0) {
                var5 += arg1.method2737(false) << 8;
            }
            if (~(1024 & var5) != -1) {
                var5 += arg1.method2737(false) << 16;
            }
            class161.method1038(var4, var5, var3, -29030, arg1);
            ++var2;
        }
        ++field2689;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(III)I")
    public static final int method1289(int arg0, int arg1, int arg2) {
        ++field2693;
        if (arg0 != 6267) {
            field2694 = 61;
        }
        return ~arg2 != -2 && ~arg2 != -4 ? class66.field852[arg1 & 3] : class370.field4792[arg1 & 3];
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
    public static void method1290(int arg0) {
        if (arg0 > -113) {
            method1291((byte) 117, -10, 103, -64, 91);
        }
        field2695 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIIII)V")
    public static final void method1291(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2686;
        if (arg0 <= 18) {
            field2694 = -117;
        }
        class153 var5 = class75.method656(10, 255, arg2);
        var5.method1003((byte) 127);
        var5.field1930 = arg3;
        var5.field1928 = arg4;
        var5.field1933 = arg1;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field2690;
        if (arg1 != 1) {
            field2694 = -56;
        }
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271) {
            int[] var4 = this.method1159(68, class501.field7240 & arg0 - 1, 0);
            int[] var5 = this.method1159(109, arg0, 0);
            int[] var6 = this.method1159(51, arg0 + 1 & class501.field7240, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class245.field3167 > var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field2687;
                int var12 = (var5[class421.field5961 & var10 + 1] + -var5[var10 + -1 & class421.field5961]) * this.field2687;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                } else {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                }
                if (this.field2688) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lci;")
    public static final class315 method1292(Throwable arg0, String arg1) {
        ++field2692;
        class315 var2;
        if (arg0 instanceof class315) {
            var2 = (class315) arg0;
            var2.field4016 = var2.field4016 + ' ' + arg1;
        } else {
            var2 = new class315(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class452.method2698(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class94.field1144;
                int var7 = arg3 << class94.field1144;
                return class145.method973(var6 + 1, class520.field7520[arg0].method399(arg1, arg3) + arg5, var7 + 1) && class145.method973(class376.field4951 + var6 - 1, class520.field7520[arg0].method399(arg1 + 1, arg3) + arg5, var7 + 1) && class145.method973(class376.field4951 + var6 - 1, class520.field7520[arg0].method399(arg1 + 1, arg3 + 1) + arg5, class376.field4951 + var7 - 1) && class145.method973(var6 + 1, class520.field7520[arg0].method399(arg1, arg3 + 1) + arg5, class376.field4951 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class194.field2517[arg0][var8][var14] == -class144.field1852) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class94.field1144) + 1;
            int var10 = (arg3 << class94.field1144) + 2;
            int var11 = class520.field7520[arg0].method399(arg1, arg3) + arg5;
            if (!class145.method973(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class94.field1144) - 1;
                if (!class145.method973(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class94.field1144) - 1;
                    if (!class145.method973(var9, var11, var13)) {
                        return false;
                    } else if (!class145.method973(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class208() {
        super(1, false);
    }
}
