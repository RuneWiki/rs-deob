import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class501 extends class362 {

    @OriginalMember(owner = "client!oga", name = "B", descriptor = "I")
    private int field6850 = 0;

    @OriginalMember(owner = "client!oga", name = "A", descriptor = "I")
    private int field6849 = 4096;

    @OriginalMember(owner = "client!oga", name = "E", descriptor = "Lfja;")
    public static class783 field6853 = new class783(11, -2);

    @OriginalMember(owner = "client!oga", name = "G", descriptor = "[S")
    private static short[] field6855 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!oga", name = "I", descriptor = "[S")
    private static short[] field6857 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!oga", name = "H", descriptor = "[S")
    private static short[] field6856 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!oga", name = "K", descriptor = "[S")
    private static short[] field6859 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!oga", name = "F", descriptor = "[[S")
    public static short[][] field6854 = new short[][] { field6855, field6856, field6857, field6859 };

    @OriginalMember(owner = "client!oga", name = "J", descriptor = "Lvl;")
    public static class15 field6858 = new class15(4, 2);

    @OriginalMember(owner = "client!oga", name = "L", descriptor = "Lbo;")
    public static class761 field6860 = new class761();

    @OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!oga", name = "C", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!oga", name = "D", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6851;
        if (arg2 != -21577) {
            field6859 = null;
        }
        int var7 = -arg6 + arg3;
        int var8 = arg5 + arg6;
        for (int var9 = arg5; var9 < var8; ++var9) {
            class679.method3826(class298.field4105[var9], arg1, arg2 + 21588, arg0, arg4);
        }
        int var10 = arg0 + arg6;
        int var11 = -arg6 + arg1;
        for (int var12 = arg3; var7 < var12; --var12) {
            class679.method3826(class298.field4105[var12], arg1, arg2 ^ -21572, arg0, arg4);
        }
        for (int var13 = var8; var13 <= var7; ++var13) {
            int[] var14 = class298.field4105[var13];
            class679.method3826(var14, var10, arg2 ^ -21572, arg0, arg4);
            class679.method3826(var14, arg1, 11, var11, arg4);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IB)[[I")
    public final int[][] method153(int arg0, byte arg1) {
        ++field6848;
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (arg1 < 57) {
            this.method153(54, (byte) 125);
        }
        if (super.field4938.field7848) {
            int[][] var4 = this.method2222(0, arg0, 28008);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class769.field10597 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field6850 <= var12) {
                    if (var12 > this.field6849) {
                        var8[var11] = this.field6849;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field6850;
                }
                if (~var13 <= ~this.field6850) {
                    if (~var13 < ~this.field6849) {
                        var9[var11] = this.field6849;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field6850;
                }
                if (~var14 <= ~this.field6850) {
                    if (~this.field6849 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field6849;
                    }
                } else {
                    var10[var11] = this.field6850;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4929 = ~arg0.method793((byte) 119) == -2;
                }
            } else {
                this.field6849 = arg0.method763(110);
            }
        } else {
            this.field6850 = arg0.method763(-112);
        }
        if (arg2 != -1) {
            method2869(-111, 109, 122, 106, -11, -89, -115);
        }
        ++field6847;
    }

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
    public static void method2870(byte arg0) {
        if (arg0 == -52) {
            field6854 = null;
            field6860 = null;
            field6856 = null;
            field6858 = null;
            field6853 = null;
            field6857 = null;
            field6859 = null;
            field6855 = null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
    public class501() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field6852;
        if (arg0 != -2026769311) {
            field6860 = null;
        }
        int[] var3 = super.field4927.method808(arg0 ^ 2026769379, arg1);
        if (super.field4927.field1471) {
            int[] var4 = this.method2221(0, arg1, -126);
            for (int var5 = 0; ~class769.field10597 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field6850 > var6) {
                    var3[var5] = this.field6850;
                } else if (~this.field6849 > ~var6) {
                    var3[var5] = this.field6849;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
