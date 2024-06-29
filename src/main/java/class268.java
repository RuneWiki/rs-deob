import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class268 extends class139 {

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    private int field3917 = 3072;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    private int field3916 = 2048;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    private int field3918 = 1024;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "Lus;")
    public static class1 field3919 = new class1(28, 8);

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field3923 = -1;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Lb;")
    public static class201 field3921;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "[I")
    public static int[] field3924;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIIIII)V")
    public static final void method1645(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3912;
        int var6 = 0;
        int var7 = arg2;
        int var8 = -34 / ((arg0 - -7) / 56);
        int var9 = arg1 * arg1;
        int var10 = arg2 * arg2;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg2 << 1;
        int var14 = (-var13 + 1) * var9 - -var11;
        int var15 = var10 - (var13 + -1) * var12;
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg2 << 1) + -3) * var12;
        int var20 = (var6 + 1) * var17;
        class103.method579((byte) 115, -arg1 + arg4, arg1 + arg4, arg5, class128.field1676[arg3]);
        int var21 = (arg2 + -1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (~var14 > -1) {
                    var15 += var20;
                    var14 += var18;
                    var18 += var17;
                    var20 += var17;
                    ++var6;
                }
            }
            if (~var15 > -1) {
                var14 += var18;
                var15 += var20;
                ++var6;
                var18 += var17;
                var20 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var19 -= var16;
            var21 -= var16;
            --var7;
            int var22 = arg3 - var7;
            int var23 = arg3 + var7;
            int var24 = arg4 + var6;
            int var25 = -var6 + arg4;
            class103.method579((byte) 115, var25, var24, arg5, class128.field1676[var22]);
            class103.method579((byte) 115, var25, var24, arg5, class128.field1676[var23]);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field3910;
        if (arg1 != 27782) {
            this.field3918 = 105;
        }
        int[] var3 = super.field1844.method2176(arg0, arg1 + -27782);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0, 0);
            for (int var5 = 0; ~var5 > ~class356.field5147; ++var5) {
                var3[var5] = (var4[var5] * this.field3916 >> 12) + this.field3918;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field3915;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 > -67) {
            this.method23(36);
        }
        if (super.field1835.field2395) {
            int[][] var4 = this.method882(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class356.field5147 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3916 >> 12) + this.field3918;
                var9[var11] = (var6[var11] * this.field3916 >> 12) + this.field3918;
                var10[var11] = (var7[var11] * this.field3916 >> 12) + this.field3918;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field3911;
        this.field3916 = -this.field3918 + this.field3917;
        if (arg0 != 7) {
            this.method23(104);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1841 = arg0.method1701(-23121) == 1;
                }
            } else {
                this.field3917 = arg0.method1729(arg1 + 65325);
            }
        } else {
            this.field3918 = arg0.method1729(65280);
        }
        ++field3920;
        if (arg1 != -45) {
            this.method33(57, -100);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class268() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILnp;ILdq;II)V")
    public static final void method1646(int arg0, class313 arg1, int arg2, class453 arg3, int arg4, int arg5) {
        ++field3913;
        if (arg0 <= 64) {
            field3919 = null;
        }
        class184 var6 = class411.field5770.method206(arg3.field6309, (byte) 5);
        if (~var6.field2706 != 0) {
            int var8;
            if (arg3.field6347) {
                int var7 = arg3.field6331 + arg2;
                var8 = var7 & 3;
            } else {
                var8 = 0;
            }
            class176 var9 = var6.method1141(var8, arg3.field6322, false, arg1);
            if (var9 != null) {
                int var10 = arg3.field6325;
                int var11 = arg3.field6385;
                if (~(1 & var8) == -2) {
                    var11 = arg3.field6325;
                    var10 = arg3.field6385;
                }
                int var12 = var9.method516();
                int var13 = var9.method524();
                if (var6.field2713) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (~var6.field2711 != -1) {
                    var9.method140(arg4, 4 - var11 * 4 + arg5, var12, var13, 1, var6.field2711 | -16777216, 1);
                } else {
                    var9.method1083(arg4, -((var11 + -1) * 4) + arg5, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILnm;B)Ld;")
    public static final class93 method1647(int arg0, class304 arg1, byte arg2) {
        if (arg2 != -11) {
            method1648((byte) -9);
        }
        ++field3914;
        class93 var3;
        if (class456.field6414 != null) {
            var3 = class456.field6414;
            class456.field6414 = class456.field6414.field1178;
            var3.field1178 = null;
            --class364.field5230;
        } else {
            var3 = new class93();
        }
        var3.field1174 = arg0;
        var3.field1177 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(B)V")
    public static void method1648(byte arg0) {
        if (arg0 != -121) {
            field3921 = null;
        }
        field3919 = null;
        field3921 = null;
        field3924 = null;
    }
}
