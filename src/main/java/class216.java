import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class216 extends class272 {

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    private int field3960 = 4096;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    private int field3961 = 4096;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    private int field3968 = 4096;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Lli;")
    private static class185 field3958 = class245.method1649("glow1:", -66);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field3962 = 0;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field3964 = 0;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "Lli;")
    public static class185 field3957 = class245.method1649("<col=40ff00>", 127);

    @OriginalMember(owner = "client!u", name = "O", descriptor = "[I")
    public static int[] field3963 = new int[2];

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Lli;")
    public static class185 field3965 = field3958;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Lli;")
    public static class185 field3966 = field3958;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(III)I")
    public static final int method1515(int arg0, int arg1, int arg2) {
        ++field3970;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 0) {
            method1517(true, (class82) null);
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field3967;
        int var3 = 110 / ((-60 - arg1) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[][] var5 = this.method1860(arg0, 3, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class246.field4385 > var12; ++var12) {
                int var13 = var7[var12];
                int var14 = var8[var12];
                int var15 = var6[var12];
                if (var13 == var14 && ~var14 == ~var15) {
                    var9[var12] = this.field3960 * var13 >> 12;
                    var10[var12] = this.field3961 * var14 >> 12;
                    var11[var12] = this.field3968 * var15 >> 12;
                } else {
                    var9[var12] = this.field3960;
                    var10[var12] = this.field3961;
                    var11[var12] = this.field3968;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static void method1516(int arg0) {
        field3965 = null;
        field3966 = null;
        field3958 = null;
        field3963 = null;
        field3957 = null;
        if (arg0 > -77) {
            method1516(58);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class216() {
        super(1, false);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field3959;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3968 = arg0.method827(255);
                }
            } else {
                this.field3961 = arg0.method827(255);
            }
        } else {
            this.field3960 = arg0.method827(255);
        }
        int var5 = -85 / ((-21 - arg1) / 55);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLp;)V")
    public static final void method1517(boolean arg0, class82 arg1) {
        ++field3969;
        int var2 = arg1.field1599;
        if (~var2 == -325) {
            if (~class281.field4967 == 0) {
                class178.field3251 = arg1.field1549;
                class281.field4967 = arg1.field1483;
            }
            if (class252.field4483.field4545) {
                arg1.field1483 = class281.field4967;
            } else {
                arg1.field1483 = class178.field3251;
            }
        } else if (!arg0) {
            if (~var2 == -326) {
                if (class281.field4967 == -1) {
                    class281.field4967 = arg1.field1483;
                    class178.field3251 = arg1.field1549;
                }
                if (class252.field4483.field4545) {
                    arg1.field1483 = class178.field3251;
                } else {
                    arg1.field1483 = class281.field4967;
                }
            } else if (var2 == 327) {
                arg1.field1563 = 150;
                arg1.field1556 = 2047 & (int) (256.0D * Math.sin((double) class211.field3851 / 40.0D));
                arg1.field1521 = -1;
                arg1.field1626 = 5;
            } else if (~var2 == -329) {
                if (class241.field4310.field3514 == null) {
                    arg1.field1521 = 0;
                } else {
                    arg1.field1563 = 150;
                    arg1.field1556 = 2047 & (int) (256.0D * Math.sin((double) class211.field3851 / 40.0D));
                    arg1.field1626 = 5;
                    arg1.field1521 = 2047 + ((int) class241.field4310.field3514.method1327((byte) 101) << 11);
                    arg1.field1524 = class241.field4310.field2654;
                    arg1.field1607 = class241.field4310.field2652;
                }
            }
        }
    }
}
