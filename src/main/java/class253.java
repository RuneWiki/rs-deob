import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class253 extends class573 {

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "Lom;")
    public static class344 field3754;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "[Lae;")
    public static class230[] field3753;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "[[I")
    public static int[][] field3756;

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class253() {
        super(3, false);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field3762;
        if (arg0 > -116) {
            field3755 = -57;
        }
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[] var4 = this.method3292(2, 0, arg1);
            int[][] var5 = this.method3293(0, 125, arg1);
            int[][] var6 = this.method3293(1, 126, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class540.field7555; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (~var17 != -1) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
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

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
    public static final void method1687(int arg0) {
        if (~class10.field558 != arg0) {
            class589.method3362(-1, class10.field558, -1, (byte) -122, false);
            class10.field558 = -1;
        }
        ++field3759;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field3757;
        if (~arg1 == -1) {
            super.field8334 = arg0.method732(-559537960) == 1;
        }
        if (arg2 != 3) {
            method1690(-111);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZBII)I")
    public static final int method1688(boolean arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -108) {
            return -71;
        } else {
            ++field3760;
            class430 var4 = class605.method3470((byte) -120, arg0, arg2);
            if (var4 == null) {
                return 0;
            } else {
                return arg3 >= 0 && arg3 < var4.field6218.length ? var4.field6218[arg3] : 0;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIBII)V")
    public static final void method1689(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field3761;
        if (~class704.field9911 >= ~(-arg0 + arg4) && ~(arg0 + arg4) >= ~class379.field5612 && -arg0 + arg1 >= class309.field4556 && arg0 + arg1 <= client.field4115) {
            class345.method2247((byte) -124, arg1, arg3, arg0, arg4);
        } else {
            class63.method758(1, arg0, arg3, arg4, arg1);
        }
        if (arg2 < 77) {
            method1690(-65);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field3758;
        int[] var3 = super.field8321.method3164(arg0, -118);
        if (arg1 != 1) {
            field3756 = null;
        }
        if (super.field8321.field7825) {
            int[] var4 = this.method3292(0, arg1 ^ 1, arg0);
            int[] var5 = this.method3292(1, 0, arg0);
            int[] var6 = this.method3292(2, 0, arg0);
            for (int var7 = 0; ~class540.field7555 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "(I)V")
    public static void method1690(int arg0) {
        field3753 = null;
        int var1 = 80 % ((22 - arg0) / 42);
        field3756 = null;
        field3754 = null;
    }
}
