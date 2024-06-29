import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class513 extends class263 {

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "Lrt;")
    public static class133 field7509 = class433.method2557(-6145);

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "Luv;")
    public static class2 field7513 = new class2(52, 6);

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "Lbg;")
    public static class275 field7514 = new class275();

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIB)V", line = 5)
    public static final void method3019(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field7510;
        class43.field559.field6830 = 0;
        class43.field559.method2754(class445.field6555.field1866, arg4 ^ 5551);
        class43.field559.method2754(arg0, 5574);
        class43.field559.method2754(arg2, 5574);
        if (arg4 != 105) {
            method3020(true);
        }
        class43.field559.method2777((byte) 74, arg1);
        class43.field559.method2777((byte) 74, arg3);
        class409.field6167 = 1;
        class510.field7495 = 0;
        class151.field2288 = -3;
        class488.field7281 = 0;
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 25)
    public class513() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)[I", line = 28)
    public final int[] method33(int arg0, byte arg1) {
        ++field7511;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, arg0);
            int[] var5 = this.method1644(0, 1, arg0);
            int[] var6 = this.method1644(0, 2, arg0);
            for (int var7 = 0; ~var7 > ~class367.field5597; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return arg1 <= 40 ? null : var3;
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(Z)V", line = 84)
    public static void method3020(boolean arg0) {
        if (!arg0) {
            field7513 = null;
        }
        field7514 = null;
        field7513 = null;
        field7509 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZLgk;)V", line = 99)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field7508;
        if (arg1) {
            if (arg0 == 0) {
                super.field3927 = ~arg2.method2765(118) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)[[I", line = 113)
    public final int[][] method34(int arg0, byte arg1) {
        ++field7512;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (arg1 >= -45) {
            field7514 = null;
        }
        if (super.field3912.field6681) {
            int[] var4 = this.method1644(0, 2, arg0);
            int[][] var5 = this.method1646(0, 2, arg0);
            int[][] var6 = this.method1646(1, 2, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class367.field5597; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }
}
