import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class264 extends class185 {

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    private int field3980 = 4;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    private int field3979 = 4;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Lgk;")
    public static class159 field3988 = new class159();

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lik;")
    public static class267 field3989 = new class267(50);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Ljava/lang/String;")
    public static String field3990 = "purple:";

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "[I")
    public static int[] field3991 = new int[5];

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lfl;B)V")
    public static final void method1755(class248 arg0, byte arg1) {
        ++field3983;
        int var2 = 78 / ((arg1 - -10) / 60);
        while (true) {
            while (~arg0.field3723.length < ~arg0.field3748) {
                int var3 = 0;
                int var4 = 0;
                boolean var5 = false;
                if (~arg0.method1593((byte) 27) == -2) {
                    var5 = true;
                    var3 = arg0.method1593((byte) 27);
                    var4 = arg0.method1593((byte) 27);
                }
                int var6 = arg0.method1593((byte) 27);
                int var7 = arg0.method1593((byte) 27);
                int var8 = class99.field1564 - 1 + -(var7 * 64) + class79.field1274;
                int var9 = var6 * 64 - class119.field1798;
                if (~var9 <= -1 && var8 + -63 >= 0 && var9 - -63 < class106.field1616 && var8 < class99.field1564) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; ~var12 > -65; ++var12) {
                        for (int var13 = 0; ~var13 > -65; ++var13) {
                            if (!var5 || ~var12 <= ~(var3 * 8) && ~(var3 * 8 + 8) < ~var12 && var13 >= var4 * 8 && var13 < var4 * 8 - -8) {
                                byte var14 = arg0.method1604(4);
                                if (var14 != 0) {
                                    if (class100.field1584[var10][var11] == null) {
                                        class100.field1584[var10][var11] = new byte[4096];
                                    }
                                    class100.field1584[var10][var11][(-var13 + 63 << 6) + var12] = var14;
                                    byte var15 = arg0.method1604(4);
                                    if (class187.field2838[var10][var11] == null) {
                                        class187.field2838[var10][var11] = new byte[4096];
                                    }
                                    class187.field2838[var10][var11][(-var13 + 63 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; (!var5 ? 4096 : 64) > var16; ++var16) {
                        byte var17 = arg0.method1604(4);
                        if (var17 != 0) {
                            ++arg0.field3748;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)V")
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3982;
        if (arg1 != 1) {
            method1755((class248) null, (byte) 92);
        }
        if (~(-arg4 + arg3) <= ~class248.field3765 && class163.field2505 >= arg3 + arg4 && ~(arg2 - arg4) <= ~class243.field3635 && ~(arg2 - -arg4) >= ~class118.field1782) {
            class148.method901(arg3, 11681, arg0, arg4, arg2);
        } else {
            class24.method151(arg2, (byte) 52, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)V")
    public static void method1757(int arg0) {
        field3988 = null;
        field3989 = null;
        field3991 = null;
        if (arg0 == 8644) {
            field3990 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        int[][] var3 = super.field2802.method753(1, arg1);
        if (!arg0) {
            method1756(28, 55, 51, 24, 79);
        }
        if (super.field2802.field1807) {
            int var4 = class174.field2648 / this.field3979;
            int var5 = class130.field1933 / this.field3980;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1152(false, 0, class130.field1933 * var6 / var5);
            } else {
                var7 = this.method1152(false, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; class174.field2648 > var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class174.field2648 * var16 / var4;
                }
                var13[var14] = var8[var15];
                var11[var14] = var10[var15];
                var12[var14] = var9[var15];
            }
        }
        ++field3978;
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static final void method1758(byte arg0) {
        ++field3985;
        if (class237.field3570 == 5) {
            if (arg0 != 110) {
                method1759((byte) -57, 94, -78, 75);
            }
            class237.field3570 = 6;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            field3988 = null;
        }
        ++field3984;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3980 = arg1.method1593((byte) 27);
            }
        } else {
            this.field3979 = arg1.method1593((byte) 27);
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIII)I")
    public static final int method1759(byte arg0, int arg1, int arg2, int arg3) {
        ++field3987;
        int var4 = -58 % ((-73 - arg0) / 44);
        int var5 = arg3 & arg1 - 1;
        int var6 = arg3 / arg1;
        int var7 = arg2 / arg1;
        int var8 = class289.method1912(var7, var6, (byte) -119);
        int var9 = class289.method1912(var7, var6 + 1, (byte) -94);
        int var10 = arg2 & arg1 - 1;
        int var11 = class289.method1912(var7 - -1, var6, (byte) -74);
        int var12 = class289.method1912(var7 + 1, var6 + 1, (byte) -78);
        int var13 = class20.method131(-125, var9, var8, arg1, var5);
        int var14 = class20.method131(-127, var12, var11, arg1, var5);
        return class20.method131(-127, var14, var13, arg1, var10);
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static final void method1760(byte arg0) {
        if (arg0 >= -112) {
            method1756(-125, 56, -28, -107, -66);
        }
        ++field3981;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field3986;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 <= 70) {
            method1759((byte) 93, 67, -81, -99);
        }
        if (super.field2804.field1384) {
            int var4 = class174.field2648 / this.field3979;
            int var5 = class130.field1933 / this.field3980;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1146((byte) 121, class130.field1933 * var6 / var5, 0);
            } else {
                var7 = this.method1146((byte) 127, 0, 0);
            }
            for (int var8 = 0; var8 < class174.field2648; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class174.field2648 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
