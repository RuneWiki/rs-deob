import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class182 extends class114 {

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int field2756 = 4096;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    private int field2755 = 4096;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
    private int[] field2761 = new int[3];

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field2760 = 4096;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int field2759 = 409;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Ltd;")
    public static class225 field2763 = new class225(128);

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static volatile int field2768 = 0;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Llm;")
    public static class150 field2764 = new class150(64);

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(CI)C")
    public static final char method1160(char arg0, int arg1) {
        ++field2765;
        if (arg0 != 181 && arg0 != 402) {
            if (arg1 <= 19) {
                field2763 = null;
            }
            return Character.toTitleCase(arg0);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V")
    public static final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2757;
        class145.field2008 = -1;
        int var5 = arg1;
        class170.field2422 = -1;
        int var6 = arg2;
        float var7 = (float) class97.field1406 / (float) class97.field1405;
        if (var7 < 1.0F) {
            var5 = (int) ((float) arg2 * var7);
        } else {
            var6 = (int) ((float) arg1 / var7);
        }
        int var8 = arg3 - (arg1 - var5) / 2;
        class311.field5005 = class97.field1406 * var8 / var5;
        int var9 = arg4 - (arg2 - var6) / arg0;
        class223.field3477 = class97.field1405 * var9 / var6;
        class163.method1040(arg0 ^ 2);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        if (arg0 != -112) {
            method1164((byte) 105);
        }
        ++field2754;
        int[][] var3 = super.field1627.method104(arg1, (byte) 113);
        if (super.field1627.field280) {
            int[][] var4 = this.method727(0, arg1, 842);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class145.field2009 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field2761[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field2759) {
                    var10[var11] = var12;
                    var9[var11] = var5[var11];
                    var8[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field2761[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field2759 > ~var15) {
                        var10[var11] = var12;
                        var9[var11] = var14;
                        var8[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2761[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~this.field2759 > ~var17) {
                            var10[var11] = var12;
                            var9[var11] = var14;
                            var8[var11] = var16;
                        } else {
                            var10[var11] = this.field2756 * var12 >> 12;
                            var9[var11] = this.field2755 * var14 >> 12;
                            var8[var11] = this.field2760 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        ++field2762;
        if (arg2 == 12953) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (arg1 == 4) {
                                int var5 = arg0.method1403(6591);
                                this.field2761[1] = class32.method199(var5 >> 4, 4080);
                                this.field2761[0] = class32.method199(16711680, var5) << 4;
                                this.field2761[2] = class32.method199(255, var5) >> 12;
                            }
                        } else {
                            this.field2756 = arg0.method1379(-127);
                        }
                    } else {
                        this.field2755 = arg0.method1379(-95);
                    }
                } else {
                    this.field2760 = arg0.method1379(arg2 ^ -13056);
                }
            } else {
                this.field2759 = arg0.method1379(-125);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZII)V")
    public static final void method1162(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            field2764 = null;
        }
        ++field2758;
        class105.field1513 = arg1;
        class297.field4726 = arg0;
        class292.field4670 = arg4;
        class48.field697 = arg2;
        class312.field5014 = arg5;
        if (~class105.field1513 <= -101) {
            int var6 = class297.field4726 * 128 + 64;
            int var7 = class312.field5014 * 128 + 64;
            int var8 = class58.method360(var6, var7, false, class166.field2364) - class48.field697;
            int var9 = -class188.field2848 + var6;
            int var10 = var7 - class178.field2603;
            int var11 = var8 - class27.field423;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class277.field4407 = 2047 & (int) (325.949D * Math.atan2((double) var11, (double) var12));
            class246.field3870 = (int) (-325.949D * Math.atan2((double) var10, (double) var9)) & 2047;
            if (~class277.field4407 > -129) {
                class277.field4407 = 128;
            }
            if (~class277.field4407 < -384) {
                class277.field4407 = 383;
            }
        }
        class12.field203 = 2;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static void method1163(byte arg0) {
        field2764 = null;
        if (arg0 == 60) {
            field2763 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public static final void method1164(byte arg0) {
        int var1 = class11.method69((byte) -70);
        ++field2766;
        if (~var1 != -1) {
            if (var1 != 1) {
                class80.method509((byte) (255 & class167.field2396 + -4), 0);
                class169.method1078((byte) -99, 2);
            } else {
                class80.method509((byte) 0, 0);
                class169.method1078((byte) -99, 512);
                if (class164.field2333 != null) {
                    class117.method749(1);
                }
            }
        } else {
            class51.field724 = null;
            class169.method1078((byte) -99, 0);
        }
        class126.field1775 = class166.field2364;
        if (arg0 <= 56) {
            field2767 = 6;
        }
    }
}
