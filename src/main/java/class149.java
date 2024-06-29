import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class149 extends class62 {

    @OriginalMember(owner = "client!cda", name = "F", descriptor = "[I")
    public static int[] field2208 = new int[2];

    @OriginalMember(owner = "client!cda", name = "C", descriptor = "[F")
    public static float[] field2205 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "Lh;")
    public static class572 field2209 = new class572("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!cda", name = "I", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!cda", name = "K", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!cda", name = "L", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!cda", name = "J", descriptor = "[Ltr;")
    private class245[] field2212;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field2207;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (arg1 != 656024161) {
            return null;
        } else {
            if (super.field774.field7499) {
                this.method1073(-1, super.field774.method3089(false));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIBLvp;)V")
    public static final void method1072(int arg0, int arg1, byte arg2, class162 arg3) {
        ++field2210;
        class410.field5613 = arg0;
        class490.field6959 = arg3;
        if (arg2 != -100) {
            method1072(36, 44, (byte) 91, (class162) null);
        }
        class428.field5750 = arg1;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[[I)V")
    private final void method1073(int arg0, int[][] arg1) {
        if (arg0 != -1) {
            field2211 = -31;
        }
        ++field2214;
        int var3 = class438.field5847;
        int var4 = class14.field148;
        class300.method1838(arg1, 121);
        class324.method1942(class410.field5604, class285.field3989, 0, 0, (byte) 56);
        if (this.field2212 != null) {
            for (int var5 = 0; ~var5 > ~this.field2212.length; ++var5) {
                class245 var6 = this.field2212[var5];
                int var7 = var6.field3526;
                int var8 = var6.field3529;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method1351(var4, 0, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method1350(var4, (byte) -107, var3);
                } else {
                    var6.method1352((byte) -93, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field2212 = new class245[arg0.method1032((byte) -33)];
            for (int var4 = 0; ~var4 > ~this.field2212.length; ++var4) {
                int var5 = arg0.method1032((byte) -33);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field2212[var4] = class244.method1545(true, arg0);
                            }
                        } else {
                            this.field2212[var4] = class380.method2268(-87, arg0);
                        }
                    } else {
                        this.field2212[var4] = class589.method3498(16384, arg0);
                    }
                } else {
                    this.field2212[var4] = class87.method654(class354.method2138(arg1, -5), arg0);
                }
            }
        } else if (~arg2 == -2) {
            super.field788 = ~arg0.method1032((byte) -33) == -2;
        }
        ++field2213;
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "()V")
    public class149() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static void method1074(byte arg0) {
        field2208 = null;
        if (arg0 == 103) {
            field2209 = null;
            field2205 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IB)[[I")
    public final int[][] method409(int arg0, byte arg1) {
        ++field2206;
        if (arg1 > -20) {
            return null;
        } else {
            int[][] var3 = super.field772.method2906(8, arg0);
            if (super.field772.field6899) {
                int var4 = class438.field5847;
                int var5 = class14.field148;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field772.method2908((byte) 27);
                this.method1073(-1, var6);
                for (int var8 = 0; ~class14.field148 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; class438.field5847 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class37.method245(4080, var15 << 4);
                        var12[var14] = class37.method245(4080, var15 >> 4);
                        var11[var14] = class37.method245(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }
}
