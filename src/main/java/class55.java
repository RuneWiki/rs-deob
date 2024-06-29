import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class55 extends class149 {

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    private int field744 = 4;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    private int field740 = 4;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lpg;")
    public static class492 field741 = new class492(106, 6);

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "J")
    public static long field749 = 0L;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "Lvr;")
    public static class306 field747 = new class306();

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "Lcm;")
    public static class449 field750 = new class449(66, 4);

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Ldl;")
    public static class48 field751;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "[Lf;")
    public static class191[] field748;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)[[I", line = 4)
    public final int[][] method139(byte arg0, int arg1) {
        ++field738;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (arg0 >= -45) {
            field751 = null;
        }
        if (super.field2147.field6664) {
            int var4 = class316.field4838 / this.field740;
            int var5 = class150.field2159 / this.field744;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method984((byte) 104, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method984((byte) 88, 0, class150.field2159 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class316.field4838; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class316.field4838 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V", line = 74)
    public static final void method373(int arg0) {
        ++field742;
        class211.field2976.method336(arg0);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class498.field7276[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class479.field7004[var2] = 0L;
        }
        class473.field6911 = 0;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 99)
    public static final void method374(int arg0) {
        class353.field5477.method937(0);
        ++field743;
        if (arg0 != -31697) {
            field750 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 110)
    public static final void method375(boolean arg0) {
        ++field746;
        class299.field4426 = null;
        class265.field3700 = arg0;
        class38.field608 = null;
        class514.field7618 = null;
        class72.field979 = null;
        class202.field2842 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLtl;)V", line = 126)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field739;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field744 = arg2.method618((byte) 100);
            }
        } else {
            this.field740 = arg2.method618((byte) 100);
        }
        if (arg1 != 35) {
            field751 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V", line = 165)
    public static void method376(int arg0) {
        field741 = null;
        field747 = null;
        field751 = null;
        field750 = null;
        if (arg0 > -99) {
            method374(75);
        }
        field748 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 183)
    public class55() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I", line = 189)
    public final int[] method92(int arg0, int arg1) {
        ++field745;
        int[] var3 = super.field2152.method2891(arg1, (byte) 106);
        if (arg0 != -10835) {
            this.field740 = 35;
        }
        if (super.field2152.field7051) {
            int var4 = class316.field4838 / this.field740;
            int var5 = class150.field2159 / this.field744;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method983(0, 24824, class150.field2159 * var6 / var5);
            } else {
                var7 = this.method983(0, arg0 ^ -19115, 0);
            }
            for (int var8 = 0; var8 < class316.field4838; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class316.field4838 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
