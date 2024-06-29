import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class274 extends class264 {

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    private int field3971 = 4;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field3973 = 4;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "Lcc;")
    public static class110 field3978 = new class110(0, -1);

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V", line = 4)
    public static void method1852(int arg0) {
        if (arg0 != 26718) {
            method1854(false);
        }
        field3978 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 15)
    public class274() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLkk;I)V", line = 23)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field3976;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3973 = arg1.method1172((byte) 35);
            }
        } else {
            this.field3971 = arg1.method1172((byte) -27);
        }
        if (arg0 < 31) {
            this.field3973 = 15;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)[[I", line = 57)
    public final int[][] method5(byte arg0, int arg1) {
        ++field3977;
        int[][] var3 = super.field3816.method1928((byte) 39, arg1);
        if (super.field3816.field4208) {
            int var4 = class478.field6792 / this.field3971;
            int var5 = class129.field1772 / this.field3973;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1782(0, (byte) 123, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1782(class129.field1772 * var7 / var5, (byte) 122, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class478.field6792 < ~var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class478.field6792 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        if (arg0 != 116) {
            this.field3971 = 22;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I", line = 127)
    public final int[] method90(int arg0, int arg1) {
        ++field3974;
        int[] var3 = super.field3808.method958((byte) 116, arg0);
        if (arg1 != 21034) {
            return null;
        } else {
            if (super.field3808.field1732) {
                int var4 = class478.field6792 / this.field3971;
                int var5 = class129.field1772 / this.field3973;
                int[] var6;
                if (var5 <= 0) {
                    var6 = this.method1788(0, (byte) -110, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method1788(class129.field1772 * var7 / var5, (byte) -117, 0);
                }
                for (int var8 = 0; var8 < class478.field6792; ++var8) {
                    if (~var4 >= -1) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class478.field6792 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIIIII)V", line = 180)
    public static final void method1853(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3972;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        if (!arg0) {
            field3978 = null;
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 - -1) * var16;
        int var20 = (arg4 + -1) * var15;
        class61.method558(arg1 + arg5, -10647, class373.field5141[arg3], -arg5 + arg1, arg2);
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            --var7;
            int var21 = arg3 - var7;
            int var22 = arg3 - -var7;
            int var23 = arg1 + var6;
            int var24 = -var6 + arg1;
            class61.method558(var23, -10647, class373.field5141[var21], var24, arg2);
            class61.method558(var23, -10647, class373.field5141[var22], var24, arg2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 265)
    public static final void method1854(boolean arg0) {
        if (!arg0) {
            field3978 = null;
        }
        ++field3975;
        if (~class61.field887 != 0) {
            class434.method2623(-1, class61.field887, (byte) -126, false, -1);
            class61.field887 = -1;
        }
    }
}
