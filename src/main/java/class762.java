import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class762 extends class175 {

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "[S")
    private static short[] field10465 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "[S")
    private static short[] field10466 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "[S")
    private static short[] field10469 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "[[S")
    public static short[][] field10467 = new short[][] { field10465, field10466, field10469 };

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class762() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIII)Lcj;")
    public static final class720 method4201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 0) {
            method4202((byte) 124);
        }
        ++field10471;
        long var7 = (long) arg6 * 76724863L ^ (long) arg3 * 97549L ^ (long) arg0 * 67481L ^ (long) arg2 * 475427L ^ (long) arg1 * 986053L ^ (long) arg4 * 32147369L;
        class720 var9 = (class720) class747.field10066.method3109((byte) 125, var7);
        if (var9 != null) {
            return var9;
        } else {
            class720 var10 = class593.field8098.method515(arg0, arg3, arg2, arg1, arg4, arg6);
            class747.field10066.method3108(var7, 16337, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V")
    public static void method4202(byte arg0) {
        field10467 = null;
        field10466 = null;
        field10465 = null;
        if (arg0 != 58) {
            method4202((byte) -84);
        }
        field10469 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg2) {
            method4201(92, 52, -55, 34, 10, -104, -10);
        }
        ++field10468;
        if (arg0 == 0) {
            super.field2305 = arg1.method1731((byte) 64) == 1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method238(int arg0, byte arg1) {
        ++field10470;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 >= -47) {
            field10469 = null;
        }
        if (super.field2316.field8746) {
            int[] var4 = this.method1202(arg0, -1150480797, 2);
            int[][] var5 = this.method1205(0, arg0, 29179);
            int[][] var6 = this.method1205(1, arg0, 29179);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class598.field8136 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field10472;
        int[] var3 = super.field2310.method91(0, arg1);
        if (!arg0) {
            field10467 = null;
        }
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 0);
            int[] var5 = this.method1202(arg1, -1150480797, 1);
            int[] var6 = this.method1202(arg1, -1150480797, 2);
            for (int var7 = 0; var7 < class598.field8136; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }
}
