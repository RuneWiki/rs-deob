import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class471 extends class478 {

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    private int field6749 = 4096;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    private int field6754 = 4096;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "[I")
    private int[] field6750 = new int[3];

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    private int field6755 = 4096;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    private int field6751 = 409;

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "Lwa;")
    public static class661 field6753 = new class661(16);

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "Lsb;")
    public static class305 field6756 = new class305(50, -1);

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
    public static int field6758 = 0;

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "Lsb;")
    public static class305 field6757 = new class305(70, -1);

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
    public static int field6759 = 0;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public static void method2714(byte arg0) {
        field6753 = null;
        field6757 = null;
        field6756 = null;
        if (arg0 != 5) {
            field6757 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(Z)V")
    public static final void method2715(boolean arg0) {
        ++field6747;
        class156.field1748.method1582(0);
        class573.field8132.method830(1);
        class508.field7303.method2947((byte) 107);
        class364.field4891.method2136(-104);
        class369.field5055.method338(false);
        class19.field153.method278(-12404);
        class265.field3301.method3045(-114);
        class63.field654.method2194(64);
        class259.field3254.method3832(0);
        class624.field8826.method3692(0);
        class400.field5381.method2170(1);
        class689.field9695.method1113(false);
        class247.field3060.method703(6);
        class600.field8445.method1054((byte) -57);
        class53.field531.method1560(-3);
        class66.field669.method2499(false);
        class328.field4021.method1371(30);
        class211.field2553.method2799((byte) -106);
        class693.field9725.method2465(-80);
        class304.field3768.method1109((byte) -57);
        class376.method2181((byte) 122);
        class400.method2256((byte) 113);
        class45.method235(-43);
        class192.method1170((byte) 17);
        if (class364.field4875 != class337.field4237) {
            for (int var1 = 0; class324.field3984.length > var1; ++var1) {
                class324.field3984[var1] = null;
            }
            class210.field2532 = 0;
        }
        class296.method1736(128);
        class160.method871(-74);
        class636.method3576((byte) 102);
        class413.method2310((byte) -3);
        class615.method3418(1);
        class281.field3516.method88(100);
        class701.field9813.method1000();
        class133.method751(0);
        class39.method202(-114238164);
        class249.field3088.method3867(false);
        class611.field8610.method3867(arg0);
        class388.field5257.method3867(false);
        class611.field8606.method3867(false);
        class392.field5317.method3867(false);
        class280.field3475.method3867(false);
        class536.field7504.method3867(arg0);
        class436.field6155.method3867(arg0);
        class408.field5441.method3867(false);
        class490.field7122.method3867(arg0);
        class6.field76.method3867(false);
        class246.field3047.method3867(false);
        class637.field8971.method3867(arg0);
        class573.field8139.method3867(false);
        class461.field6558.method3867(arg0);
        class164.field1828.method3867(arg0);
        class240.field2973.method3867(false);
        class662.field9281.method3867(false);
        class364.field4874.method3867(false);
        class483.field6974.method3867(false);
        class196.field2269.method3867(false);
        class671.field9346.method3867(arg0);
        class361.field4839.method3867(false);
        class178.field1989.method3867(arg0);
        class624.field8827.method3867(arg0);
        class617.field8703.method3867(false);
        class220.field2624.method3867(false);
        class604.field8491.method3867(arg0);
        class247.field3053.method3867(arg0);
        class677.field9499.method3867(false);
        class266.field3321.method3867(false);
        class560.field7998.method3867(false);
        class162.field1815.method88(70);
        class697.field9777.method88(111);
        class66.field667.method88(49);
        class664.field9289.method88(123);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field6752;
        if (arg0 == 255) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (arg2 == 4) {
                                int var5 = arg1.method675(-125);
                                this.field6750[0] = class105.method572(var5, 16711680) << 4;
                                this.field6750[2] = class105.method572(0, var5 >> 12);
                                this.field6750[1] = class105.method572(4080, var5 >> 4);
                            }
                        } else {
                            this.field6749 = arg1.method643((byte) -77);
                        }
                    } else {
                        this.field6754 = arg1.method643((byte) -77);
                    }
                } else {
                    this.field6755 = arg1.method643((byte) -77);
                }
            } else {
                this.field6751 = arg1.method643((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class471() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method104(boolean arg0, int arg1) {
        ++field6748;
        int[][] var3 = super.field6889.method2091(-118, arg1);
        if (!arg0) {
            method2714((byte) 0);
        }
        if (super.field6889.field4765) {
            int[][] var4 = this.method2753(0, arg1, (byte) 11);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class436.field6154 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field6750[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field6751) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field6750[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field6751 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field6750[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field6751 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field6749 * var12 >> 12;
                            var9[var11] = this.field6754 * var14 >> 12;
                            var10[var11] = this.field6755 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
