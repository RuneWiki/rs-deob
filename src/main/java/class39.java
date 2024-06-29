import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class39 extends class437 {

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "S")
    public static short field581 = 205;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[I")
    public static int[] field587 = new int[200];

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "F")
    public static float field588 = 1024.0F;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "J")
    public static long field595;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIII)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field593 = arg1;
        this.field590 = arg0;
        this.field589 = arg3;
        this.field594 = arg2;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static void method289(int arg0) {
        if (arg0 != -7086) {
            method292(true);
        }
        field587 = null;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V")
    public final void method290(int arg0, int arg1, int arg2) {
        if (arg1 != 8224) {
            this.field590 = 33;
        }
        ++field586;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lps;I)I")
    public static final int method291(class162 arg0, int arg1) {
        ++field591;
        if (arg0.field2166 == 0) {
            return 0;
        } else {
            if (~arg0.field2179 != 0 && arg0.field2179 < 32768) {
                class163 var2 = class388.field5670[arg0.field2179];
                if (var2 != null) {
                    int var3 = -var2.field5921 + arg0.field5921;
                    int var4 = -var2.field5930 + arg0.field5930;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg0.method1083((int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383, -23640);
                    }
                }
            }
            if (~arg0.field2179 <= -32769) {
                int var5 = arg0.field2179 + -32768;
                if (class400.field5853 == var5) {
                    var5 = 2047;
                }
                class317 var6 = class176.field2382[var5];
                if (var6 != null) {
                    int var7 = arg0.field5921 - var6.field5921;
                    int var8 = -var6.field5930 + arg0.field5930;
                    if (~var7 != -1 || var8 != 0) {
                        arg0.method1083((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 16383, arg1 ^ 2376);
                    }
                }
            }
            if ((arg0.field2133 != 0 || ~arg0.field2108 != -1) && (~arg0.field2202 == -1 || arg0.field2200 > 0)) {
                int var9 = -((-class236.field3292 + arg0.field2133 + -class236.field3292) * 64) + arg0.field5921;
                int var10 = -((-class90.field1223 + arg0.field2108 - class90.field1223) * 64) + arg0.field5930;
                if (var9 != 0 || var10 != 0) {
                    arg0.method1083(16383 & (int) (2607.5945876176133D * Math.atan2((double) var9, (double) var10)), -23640);
                }
                arg0.field2133 = 0;
                arg0.field2108 = 0;
            }
            int var11 = arg0.method1098(arg1 + 21907);
            return arg1 != -21792 ? -105 : var11;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static final void method292(boolean arg0) {
        class256.field3745 = 0;
        if (arg0) {
            method289(-13);
        }
        ++field585;
        int var1 = (class383.field5609.field5921 >> 7) + class236.field3292;
        int var2 = (class383.field5609.field5930 >> 7) + class90.field1223;
        if (var1 >= 3053 && ~var1 >= -3157 && ~var2 <= -3057 && var2 <= 3136) {
            class256.field3745 = 1;
        }
        if (~var1 <= -3073 && ~var1 >= -3119 && ~var2 <= -9493 && ~var2 >= -9536) {
            class256.field3745 = 1;
        }
        if (~class256.field3745 == -2 && ~var1 <= -3140 && var1 <= 3199 && ~var2 <= -3009 && ~var2 >= -3063) {
            class256.field3745 = 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII)V")
    public static final void method293(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field583;
        int var6 = -arg0 + arg1;
        int var7 = -arg4 + arg5;
        if (var6 != 0) {
            if (~var7 == -1) {
                class85.method691(arg0, 58, arg4, arg1, arg2);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg0 * var8 >> 12) + arg4;
                int var10;
                int var11;
                if (class240.field3368 <= arg1) {
                    if (arg1 <= class136.field1769) {
                        var10 = arg1;
                        var11 = arg5;
                    } else {
                        var10 = class136.field1769;
                        var11 = (class136.field1769 * var8 >> 12) + var9;
                    }
                } else {
                    var11 = (class240.field3368 * var8 >> 12) + var9;
                    var10 = class240.field3368;
                }
                int var12;
                int var13;
                if (~class240.field3368 >= ~arg0) {
                    if (arg0 > class136.field1769) {
                        var12 = class136.field1769;
                        var13 = (class136.field1769 * var8 >> 12) + var9;
                    } else {
                        var13 = arg4;
                        var12 = arg0;
                    }
                } else {
                    var12 = class240.field3368;
                    var13 = var9 - -(class240.field3368 * var8 >> 12);
                }
                if (~class157.field1981 < ~var11) {
                    var10 = (-var9 + class157.field1981 << 12) / var8;
                    var11 = class157.field1981;
                } else if (var11 > class312.field4602) {
                    var10 = (-var9 + class312.field4602 << 12) / var8;
                    var11 = class312.field4602;
                }
                if (class157.field1981 <= var13) {
                    if (var13 > class312.field4602) {
                        var13 = class312.field4602;
                        var12 = (class312.field4602 - var9 << 12) / var8;
                    }
                } else {
                    var12 = (class157.field1981 - var9 << 12) / var8;
                    var13 = class157.field1981;
                }
                if (arg3 < 63) {
                    field588 = 1.0860318F;
                }
                class131.method941(var10, var11, var12, (byte) 69, arg2, var13);
            }
        } else {
            if (~var7 != -1) {
                class20.method150(arg0, arg2, arg5, arg4, false);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public final void method294(int arg0, int arg1, int arg2) {
        ++field592;
        if (arg0 == 352) {
            int var4 = this.field590 * arg2 >> 12;
            int var5 = this.field594 * arg2 >> 12;
            int var6 = this.field593 * arg1 >> 12;
            int var7 = this.field589 * arg1 >> 12;
            class418.method2634(super.field6353, var4, var7, 3, var6, var5);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        ++field582;
        if (arg2 != -11654) {
            method293(53, -28, 90, (byte) 21, 44, -68);
        }
        int var4 = this.field590 * arg0 >> 12;
        int var5 = this.field594 * arg0 >> 12;
        int var6 = this.field593 * arg1 >> 12;
        int var7 = this.field589 * arg1 >> 12;
        class7.method41(var5, var6, arg2 + 34842, super.field6353, super.field6349, var4, super.field6343, var7);
    }
}
